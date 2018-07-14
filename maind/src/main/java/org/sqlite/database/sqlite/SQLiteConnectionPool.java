package org.sqlite.database.sqlite;

import android.util.Log;
import android.util.Printer;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import org.sqlite.os.CancellationSignal;
import org.sqlite.os.OperationCanceledException;

public final class SQLiteConnectionPool
  implements Closeable
{
  public static final int CONNECTION_FLAG_INTERACTIVE = 4;
  public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
  public static final int CONNECTION_FLAG_READ_ONLY = 1;
  private static final long CONNECTION_POOL_BUSY_MILLIS = 30000L;
  private static final String TAG = "SQLiteConnectionPool";
  private final WeakHashMap mAcquiredConnections;
  private final ArrayList mAvailableNonPrimaryConnections;
  private SQLiteConnection mAvailablePrimaryConnection;
  private final CloseGuard mCloseGuard;
  private final SQLiteDatabaseConfiguration mConfiguration;
  private final AtomicBoolean mConnectionLeaked;
  private SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterPool;
  private SQLiteConnectionPool.ConnectionWaiter mConnectionWaiterQueue;
  private boolean mIsOpen;
  private final Object mLock;
  private int mMaxConnectionPoolSize;
  private int mNextConnectionId;
  
  static
  {
    Class localClass = SQLiteConnectionPool.class;
    boolean bool = localClass.desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      return;
      bool = false;
      localClass = null;
    }
  }
  
  private SQLiteConnectionPool(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    Object localObject = CloseGuard.get();
    this.mCloseGuard = ((CloseGuard)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.mLock = localObject;
    localObject = new java/util/concurrent/atomic/AtomicBoolean;
    ((AtomicBoolean)localObject).<init>();
    this.mConnectionLeaked = ((AtomicBoolean)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mAvailableNonPrimaryConnections = ((ArrayList)localObject);
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    this.mAcquiredConnections = ((WeakHashMap)localObject);
    localObject = new org/sqlite/database/sqlite/SQLiteDatabaseConfiguration;
    ((SQLiteDatabaseConfiguration)localObject).<init>(paramSQLiteDatabaseConfiguration);
    this.mConfiguration = ((SQLiteDatabaseConfiguration)localObject);
    setMaxConnectionPoolSizeLocked();
  }
  
  private void cancelConnectionWaiterLocked(SQLiteConnectionPool.ConnectionWaiter paramConnectionWaiter)
  {
    Object localObject1 = paramConnectionWaiter.mAssignedConnection;
    if (localObject1 == null)
    {
      localObject1 = paramConnectionWaiter.mException;
      if (localObject1 == null) {}
    }
    else
    {
      return;
    }
    boolean bool = false;
    Object localObject2 = null;
    SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter;
    for (localObject1 = this.mConnectionWaiterQueue; localObject1 != paramConnectionWaiter; localObject1 = localConnectionWaiter)
    {
      bool = $assertionsDisabled;
      if ((!bool) && (localObject1 == null))
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
      localConnectionWaiter = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mNext;
      localObject2 = localObject1;
    }
    if (localObject2 != null)
    {
      localObject1 = paramConnectionWaiter.mNext;
      ((SQLiteConnectionPool.ConnectionWaiter)localObject2).mNext = ((SQLiteConnectionPool.ConnectionWaiter)localObject1);
    }
    for (;;)
    {
      localObject1 = new org/sqlite/os/OperationCanceledException;
      ((OperationCanceledException)localObject1).<init>();
      paramConnectionWaiter.mException = ((RuntimeException)localObject1);
      localObject1 = paramConnectionWaiter.mThread;
      LockSupport.unpark((Thread)localObject1);
      wakeConnectionWaitersLocked();
      break;
      localObject1 = paramConnectionWaiter.mNext;
      this.mConnectionWaiterQueue = ((SQLiteConnectionPool.ConnectionWaiter)localObject1);
    }
  }
  
  private void closeAvailableConnectionsAndLogExceptionsLocked()
  {
    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
    SQLiteConnection localSQLiteConnection = this.mAvailablePrimaryConnection;
    if (localSQLiteConnection != null)
    {
      localSQLiteConnection = this.mAvailablePrimaryConnection;
      closeConnectionAndLogExceptionsLocked(localSQLiteConnection);
      localSQLiteConnection = null;
      this.mAvailablePrimaryConnection = null;
    }
  }
  
  private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked()
  {
    int i = this.mAvailableNonPrimaryConnections.size();
    int j = 0;
    SQLiteConnection localSQLiteConnection = null;
    for (int k = 0; k < i; k = j)
    {
      localSQLiteConnection = (SQLiteConnection)this.mAvailableNonPrimaryConnections.get(k);
      closeConnectionAndLogExceptionsLocked(localSQLiteConnection);
      j = k + 1;
    }
    this.mAvailableNonPrimaryConnections.clear();
  }
  
  private void closeConnectionAndLogExceptionsLocked(SQLiteConnection paramSQLiteConnection)
  {
    try
    {
      paramSQLiteConnection.close();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        String str1 = "SQLiteConnectionPool";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str2 = "Failed to close connection, its fate is now in the hands of the merciful GC: ";
        localObject = str2 + paramSQLiteConnection;
        Log.e(str1, (String)localObject, localRuntimeException);
      }
    }
  }
  
  private void closeExcessConnectionsAndLogExceptionsLocked()
  {
    Object localObject = this.mAvailableNonPrimaryConnections;
    int j;
    for (int i = ((ArrayList)localObject).size();; i = j)
    {
      j = i + -1;
      int k = this.mMaxConnectionPoolSize + -1;
      if (i <= k) {
        break;
      }
      localObject = (SQLiteConnection)this.mAvailableNonPrimaryConnections.remove(j);
      closeConnectionAndLogExceptionsLocked((SQLiteConnection)localObject);
    }
  }
  
  private void discardAcquiredConnectionsLocked()
  {
    SQLiteConnectionPool.AcquiredConnectionStatus localAcquiredConnectionStatus = SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD;
    markAcquiredConnectionsLocked(localAcquiredConnectionStatus);
  }
  
  private void dispose(boolean paramBoolean)
  {
    Object localObject1 = this.mCloseGuard;
    if (localObject1 != null)
    {
      if (paramBoolean)
      {
        localObject1 = this.mCloseGuard;
        ((CloseGuard)localObject1).warnIfOpen();
      }
      localObject1 = this.mCloseGuard;
      ((CloseGuard)localObject1).close();
    }
    if (!paramBoolean) {}
    synchronized (this.mLock)
    {
      throwIfClosedLocked();
      int i = 0;
      localObject1 = null;
      this.mIsOpen = false;
      closeAvailableConnectionsAndLogExceptionsLocked();
      localObject1 = this.mAcquiredConnections;
      i = ((WeakHashMap)localObject1).size();
      if (i != 0)
      {
        String str = "SQLiteConnectionPool";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        Object localObject5 = "The connection pool for ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = this.mConfiguration;
        localObject5 = ((SQLiteDatabaseConfiguration)localObject5).label;
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = " has been closed but there are still ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject1 = ((StringBuilder)localObject4).append(i);
        localObject4 = " connections in use.  They will be closed ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject4 = "as they are released back to the pool.";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject1 = ((StringBuilder)localObject1).toString();
        Log.i(str, (String)localObject1);
      }
      wakeConnectionWaitersLocked();
      return;
    }
  }
  
  private void finishAcquireConnectionLocked(SQLiteConnection paramSQLiteConnection, int paramInt)
  {
    int i = paramInt & 0x1;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      try
      {
        paramSQLiteConnection.setOnlyAllowReadOnlyOperations(i);
        localWeakHashMap = this.mAcquiredConnections;
        SQLiteConnectionPool.AcquiredConnectionStatus localAcquiredConnectionStatus = SQLiteConnectionPool.AcquiredConnectionStatus.NORMAL;
        localWeakHashMap.put(paramSQLiteConnection, localAcquiredConnectionStatus);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        WeakHashMap localWeakHashMap;
        int j;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = "Failed to prepare acquired connection for session, closing it: " + paramSQLiteConnection + ", connectionFlags=" + paramInt;
        Log.e("SQLiteConnectionPool", (String)localObject);
        closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
        throw localRuntimeException;
      }
      j = 0;
      localWeakHashMap = null;
    }
  }
  
  private static int getPriority(int paramInt)
  {
    int i = paramInt & 0x4;
    if (i != 0) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean paramBoolean, int paramInt)
  {
    SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter = this.mConnectionWaiterQueue;
    if (localConnectionWaiter != null)
    {
      int i = getPriority(paramInt);
      int j = localConnectionWaiter.mPriority;
      if (i <= j) {
        break label36;
      }
    }
    for (;;)
    {
      boolean bool2 = false;
      localConnectionWaiter = null;
      for (;;)
      {
        return bool2;
        label36:
        if (!paramBoolean)
        {
          boolean bool1 = localConnectionWaiter.mWantPrimaryConnection;
          if (bool1) {
            break;
          }
        }
        bool2 = true;
      }
      localConnectionWaiter = localConnectionWaiter.mNext;
      if (localConnectionWaiter != null) {
        break;
      }
    }
  }
  
  private void logConnectionPoolBusyLocked(long paramLong, int paramInt)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = Thread.currentThread();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject3 = localStringBuilder.append("The connection pool for database '");
    Object localObject4 = this.mConfiguration.label;
    ((StringBuilder)localObject3).append((String)localObject4);
    localStringBuilder.append("' has been unable to grant a connection to thread ");
    long l = ((Thread)localObject2).getId();
    localObject3 = localStringBuilder.append(l).append(" (");
    localObject2 = ((Thread)localObject2).getName();
    ((StringBuilder)localObject3).append((String)localObject2).append(") ");
    localObject2 = localStringBuilder.append("with flags 0x");
    localObject3 = Integer.toHexString(paramInt);
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject2 = localStringBuilder.append(" for ");
    float f1 = (float)paramLong;
    float f2 = 0.001F;
    f1 *= f2;
    localObject2 = ((StringBuilder)localObject2).append(f1);
    localObject3 = " seconds.\n";
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject2 = this.mAcquiredConnections;
    int k = ((WeakHashMap)localObject2).isEmpty();
    int m;
    if (k == 0)
    {
      localObject5 = this.mAcquiredConnections.keySet().iterator();
      k = 0;
      localObject2 = null;
      m = 0;
      localObject3 = null;
      f1 = 0.0F;
      i = ((Iterator)localObject5).hasNext();
      if (i != 0)
      {
        localObject1 = ((SQLiteConnection)((Iterator)localObject5).next()).describeCurrentOperationUnsafe();
        if (localObject1 != null)
        {
          ((ArrayList)localObject4).add(localObject1);
          m += 1;
          i = k;
        }
        for (k = m;; k = m)
        {
          m = k;
          k = i;
          break;
          j = k + 1;
        }
      }
    }
    else
    {
      k = 0;
      localObject2 = null;
      m = 0;
      localObject3 = null;
      f1 = 0.0F;
    }
    localObject1 = this.mAvailableNonPrimaryConnections;
    int j = ((ArrayList)localObject1).size();
    Object localObject5 = this.mAvailablePrimaryConnection;
    if (localObject5 != null) {
      j += 1;
    }
    localObject3 = localStringBuilder.append("Connections: ").append(m);
    localObject5 = " active, ";
    ((StringBuilder)localObject3).append((String)localObject5);
    localObject2 = localStringBuilder.append(k);
    localObject3 = " idle, ";
    ((StringBuilder)localObject2).append((String)localObject3);
    localObject1 = localStringBuilder.append(j);
    localObject2 = " available.\n";
    ((StringBuilder)localObject1).append((String)localObject2);
    boolean bool = ((ArrayList)localObject4).isEmpty();
    if (!bool)
    {
      localObject1 = "\nRequests in progress:\n";
      localStringBuilder.append((String)localObject1);
      localObject2 = ((ArrayList)localObject4).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (String)((Iterator)localObject2).next();
        localObject1 = localStringBuilder.append("  ").append((String)localObject1);
        localObject3 = "\n";
        ((StringBuilder)localObject1).append((String)localObject3);
      }
    }
    localObject2 = localStringBuilder.toString();
    Log.w("SQLiteConnectionPool", (String)localObject2);
  }
  
  private void markAcquiredConnectionsLocked(SQLiteConnectionPool.AcquiredConnectionStatus paramAcquiredConnectionStatus)
  {
    Object localObject1 = this.mAcquiredConnections;
    boolean bool = ((WeakHashMap)localObject1).isEmpty();
    if (!bool)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      int i = this.mAcquiredConnections.size();
      localArrayList.<init>(i);
      localObject1 = this.mAcquiredConnections.entrySet();
      Object localObject2 = ((Set)localObject1).iterator();
      Object localObject3;
      for (;;)
      {
        j = ((Iterator)localObject2).hasNext();
        if (j == 0) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
        SQLiteConnectionPool.AcquiredConnectionStatus localAcquiredConnectionStatus = (SQLiteConnectionPool.AcquiredConnectionStatus)((Map.Entry)localObject1).getValue();
        if (paramAcquiredConnectionStatus != localAcquiredConnectionStatus)
        {
          localObject3 = SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD;
          if (localAcquiredConnectionStatus != localObject3)
          {
            localObject1 = ((Map.Entry)localObject1).getKey();
            localArrayList.add(localObject1);
          }
        }
      }
      int m = localArrayList.size();
      int j = 0;
      localObject1 = null;
      while (j < m)
      {
        localObject2 = this.mAcquiredConnections;
        localObject3 = localArrayList.get(j);
        ((WeakHashMap)localObject2).put(localObject3, paramAcquiredConnectionStatus);
        int k;
        j += 1;
      }
    }
  }
  
  private SQLiteConnectionPool.ConnectionWaiter obtainConnectionWaiterLocked(Thread paramThread, long paramLong, int paramInt1, boolean paramBoolean, String paramString, int paramInt2)
  {
    SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter1 = this.mConnectionWaiterPool;
    if (localConnectionWaiter1 != null)
    {
      SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter2 = localConnectionWaiter1.mNext;
      this.mConnectionWaiterPool = localConnectionWaiter2;
      localConnectionWaiter1.mNext = null;
    }
    for (;;)
    {
      localConnectionWaiter1.mThread = paramThread;
      localConnectionWaiter1.mStartTime = paramLong;
      localConnectionWaiter1.mPriority = paramInt1;
      localConnectionWaiter1.mWantPrimaryConnection = paramBoolean;
      localConnectionWaiter1.mSql = paramString;
      localConnectionWaiter1.mConnectionFlags = paramInt2;
      return localConnectionWaiter1;
      localConnectionWaiter1 = new org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;
      localConnectionWaiter1.<init>(null);
    }
  }
  
  public static SQLiteConnectionPool open(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    if (paramSQLiteDatabaseConfiguration == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("configuration must not be null.");
      throw ((Throwable)localObject);
    }
    Object localObject = new org/sqlite/database/sqlite/SQLiteConnectionPool;
    ((SQLiteConnectionPool)localObject).<init>(paramSQLiteDatabaseConfiguration);
    ((SQLiteConnectionPool)localObject).open();
    return (SQLiteConnectionPool)localObject;
  }
  
  private void open()
  {
    boolean bool = true;
    Object localObject = this.mConfiguration;
    localObject = openConnectionLocked((SQLiteDatabaseConfiguration)localObject, bool);
    this.mAvailablePrimaryConnection = ((SQLiteConnection)localObject);
    this.mIsOpen = bool;
    this.mCloseGuard.open("close");
  }
  
  private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, boolean paramBoolean)
  {
    int i = this.mNextConnectionId;
    int j = i + 1;
    this.mNextConnectionId = j;
    return SQLiteConnection.open(this, paramSQLiteDatabaseConfiguration, i, paramBoolean);
  }
  
  private void reconfigureAllConnectionsLocked()
  {
    Object localObject1 = this.mAvailablePrimaryConnection;
    if (localObject1 != null) {}
    try
    {
      localObject1 = this.mAvailablePrimaryConnection;
      localObject3 = this.mConfiguration;
      ((SQLiteConnection)localObject1).reconfigure((SQLiteDatabaseConfiguration)localObject3);
    }
    catch (RuntimeException localRuntimeException1)
    {
      int i;
      int j;
      for (;;)
      {
        Object localObject3 = "SQLiteConnectionPool";
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject5 = ((StringBuilder)localObject5).append("Failed to reconfigure available primary connection, closing it: ");
        localObject4 = this.mAvailablePrimaryConnection;
        localObject5 = localObject4;
        Log.e((String)localObject3, (String)localObject5, localRuntimeException1);
        localObject2 = this.mAvailablePrimaryConnection;
        closeConnectionAndLogExceptionsLocked((SQLiteConnection)localObject2);
        k = 0;
        localObject2 = null;
        this.mAvailablePrimaryConnection = null;
      }
      Object localObject2 = SQLiteConnectionPool.AcquiredConnectionStatus.RECONFIGURE;
      markAcquiredConnectionsLocked((SQLiteConnectionPool.AcquiredConnectionStatus)localObject2);
    }
    localObject1 = this.mAvailableNonPrimaryConnections;
    i = ((ArrayList)localObject1).size();
    j = 0;
    localObject3 = null;
    for (;;)
    {
      if (j >= i) {
        break label246;
      }
      localObject1 = (SQLiteConnection)this.mAvailableNonPrimaryConnections.get(j);
      try
      {
        localObject4 = this.mConfiguration;
        ((SQLiteConnection)localObject1).reconfigure((SQLiteDatabaseConfiguration)localObject4);
        k = j;
        j = i;
      }
      catch (RuntimeException localRuntimeException2)
      {
        for (;;)
        {
          Object localObject4;
          Object localObject5;
          String str1 = "SQLiteConnectionPool";
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          String str2 = "Failed to reconfigure available non-primary connection, closing it: ";
          localObject6 = str2 + localObject2;
          Log.e(str1, (String)localObject6, localRuntimeException2);
          closeConnectionAndLogExceptionsLocked((SQLiteConnection)localObject2);
          ArrayList localArrayList = this.mAvailableNonPrimaryConnections;
          int k = j + -1;
          localArrayList.remove(j);
          j = i + -1;
        }
      }
      k += 1;
      i = j;
      j = k;
    }
    label246:
  }
  
  private boolean recycleConnectionLocked(SQLiteConnection paramSQLiteConnection, SQLiteConnectionPool.AcquiredConnectionStatus paramAcquiredConnectionStatus)
  {
    Object localObject1 = SQLiteConnectionPool.AcquiredConnectionStatus.RECONFIGURE;
    if (paramAcquiredConnectionStatus == localObject1) {}
    try
    {
      localObject1 = this.mConfiguration;
      paramSQLiteConnection.reconfigure((SQLiteDatabaseConfiguration)localObject1);
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        String str1 = "SQLiteConnectionPool";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "Failed to reconfigure released connection, closing it: ";
        localObject2 = str2 + paramSQLiteConnection;
        Log.e(str1, (String)localObject2, localRuntimeException);
        paramAcquiredConnectionStatus = SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD;
        continue;
        boolean bool = true;
      }
    }
    localObject1 = SQLiteConnectionPool.AcquiredConnectionStatus.DISCARD;
    if (paramAcquiredConnectionStatus == localObject1)
    {
      closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
      bool = false;
      localObject1 = null;
      return bool;
    }
  }
  
  private void recycleConnectionWaiterLocked(SQLiteConnectionPool.ConnectionWaiter paramConnectionWaiter)
  {
    SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter = this.mConnectionWaiterPool;
    paramConnectionWaiter.mNext = localConnectionWaiter;
    paramConnectionWaiter.mThread = null;
    paramConnectionWaiter.mSql = null;
    paramConnectionWaiter.mAssignedConnection = null;
    paramConnectionWaiter.mException = null;
    int i = paramConnectionWaiter.mNonce + 1;
    paramConnectionWaiter.mNonce = i;
    this.mConnectionWaiterPool = paramConnectionWaiter;
  }
  
  private void setMaxConnectionPoolSizeLocked()
  {
    boolean bool = SQLiteDatabase.hasCodec();
    int i;
    if (!bool)
    {
      SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfiguration;
      i = localSQLiteDatabaseConfiguration.openFlags;
      int j = 536870912;
      i &= j;
      if (i != 0) {
        i = SQLiteGlobal.getWALConnectionPoolSize();
      }
    }
    for (this.mMaxConnectionPoolSize = i;; this.mMaxConnectionPoolSize = i)
    {
      return;
      i = 1;
    }
  }
  
  private void throwIfClosedLocked()
  {
    boolean bool = this.mIsOpen;
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Cannot perform this operation because the connection pool has been closed.");
      throw localIllegalStateException;
    }
  }
  
  private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String paramString, int paramInt)
  {
    ArrayList localArrayList = null;
    Object localObject = this.mAvailableNonPrimaryConnections;
    int i = ((ArrayList)localObject).size();
    int j = 1;
    int k;
    SQLiteConnection localSQLiteConnection;
    if ((i > j) && (paramString != null))
    {
      k = 0;
      localSQLiteConnection = null;
      if (k < i)
      {
        localObject = (SQLiteConnection)this.mAvailableNonPrimaryConnections.get(k);
        boolean bool = ((SQLiteConnection)localObject).isPreparedStatementInCache(paramString);
        if (bool)
        {
          localArrayList = this.mAvailableNonPrimaryConnections;
          localArrayList.remove(k);
          finishAcquireConnectionLocked((SQLiteConnection)localObject, paramInt);
        }
      }
    }
    for (;;)
    {
      return (SQLiteConnection)localObject;
      j = k + 1;
      k = j;
      break;
      if (i > 0)
      {
        localObject = this.mAvailableNonPrimaryConnections;
        k = i + -1;
        localObject = (SQLiteConnection)((ArrayList)localObject).remove(k);
        finishAcquireConnectionLocked((SQLiteConnection)localObject, paramInt);
      }
      else
      {
        localObject = this.mAcquiredConnections;
        j = ((WeakHashMap)localObject).size();
        localSQLiteConnection = this.mAvailablePrimaryConnection;
        if (localSQLiteConnection != null) {
          j += 1;
        }
        k = this.mMaxConnectionPoolSize;
        if (j >= k)
        {
          j = 0;
          localObject = null;
        }
        else
        {
          localObject = this.mConfiguration;
          localObject = openConnectionLocked((SQLiteDatabaseConfiguration)localObject, false);
          finishAcquireConnectionLocked((SQLiteConnection)localObject, paramInt);
        }
      }
    }
  }
  
  private SQLiteConnection tryAcquirePrimaryConnectionLocked(int paramInt)
  {
    boolean bool1 = false;
    Object localObject = this.mAvailablePrimaryConnection;
    if (localObject != null)
    {
      this.mAvailablePrimaryConnection = null;
      finishAcquireConnectionLocked((SQLiteConnection)localObject, paramInt);
    }
    for (;;)
    {
      return (SQLiteConnection)localObject;
      localObject = this.mAcquiredConnections.keySet();
      Iterator localIterator = ((Set)localObject).iterator();
      do
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        localObject = (SQLiteConnection)localIterator.next();
        bool2 = ((SQLiteConnection)localObject).isPrimaryConnection();
      } while (!bool2);
      boolean bool2 = false;
      localObject = null;
      continue;
      localObject = this.mConfiguration;
      bool1 = true;
      localObject = openConnectionLocked((SQLiteDatabaseConfiguration)localObject, bool1);
      finishAcquireConnectionLocked((SQLiteConnection)localObject, paramInt);
    }
  }
  
  /* Error */
  private SQLiteConnection waitForConnection(String paramString, int paramInt, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: iload_2
    //   1: iconst_2
    //   2: iand
    //   3: istore 4
    //   5: iload 4
    //   7: ifeq +69 -> 76
    //   10: iconst_1
    //   11: istore 5
    //   13: aload_0
    //   14: getfield 68	org/sqlite/database/sqlite/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   17: astore 6
    //   19: aload 6
    //   21: monitorenter
    //   22: aload_0
    //   23: invokespecial 200	org/sqlite/database/sqlite/SQLiteConnectionPool:throwIfClosedLocked	()V
    //   26: aload_3
    //   27: ifnull +7 -> 34
    //   30: aload_3
    //   31: invokevirtual 444	org/sqlite/os/CancellationSignal:throwIfCanceled	()V
    //   34: iconst_0
    //   35: istore 4
    //   37: aconst_null
    //   38: astore 7
    //   40: iload 5
    //   42: ifne +11 -> 53
    //   45: aload_0
    //   46: aload_1
    //   47: iload_2
    //   48: invokespecial 448	org/sqlite/database/sqlite/SQLiteConnectionPool:tryAcquireNonPrimaryConnectionLocked	(Ljava/lang/String;I)Lorg/sqlite/database/sqlite/SQLiteConnection;
    //   51: astore 7
    //   53: aload 7
    //   55: ifnonnull +10 -> 65
    //   58: aload_0
    //   59: iload_2
    //   60: invokespecial 452	org/sqlite/database/sqlite/SQLiteConnectionPool:tryAcquirePrimaryConnectionLocked	(I)Lorg/sqlite/database/sqlite/SQLiteConnection;
    //   63: astore 7
    //   65: aload 7
    //   67: ifnull +18 -> 85
    //   70: aload 6
    //   72: monitorexit
    //   73: aload 7
    //   75: areturn
    //   76: iconst_0
    //   77: istore 5
    //   79: aconst_null
    //   80: astore 8
    //   82: goto -69 -> 13
    //   85: iload_2
    //   86: invokestatic 245	org/sqlite/database/sqlite/SQLiteConnectionPool:getPriority	(I)I
    //   89: istore 9
    //   91: invokestatic 457	android/os/SystemClock:uptimeMillis	()J
    //   94: lstore 10
    //   96: invokestatic 257	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   99: astore 12
    //   101: aload_0
    //   102: astore 7
    //   104: aload_1
    //   105: astore 13
    //   107: aload_0
    //   108: aload 12
    //   110: lload 10
    //   112: iload 9
    //   114: iload 5
    //   116: aload_1
    //   117: iload_2
    //   118: invokespecial 461	org/sqlite/database/sqlite/SQLiteConnectionPool:obtainConnectionWaiterLocked	(Ljava/lang/Thread;JIZLjava/lang/String;I)Lorg/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;
    //   121: astore 8
    //   123: aconst_null
    //   124: astore 12
    //   126: aload_0
    //   127: getfield 108	org/sqlite/database/sqlite/SQLiteConnectionPool:mConnectionWaiterQueue	Lorg/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;
    //   130: astore 7
    //   132: aload 7
    //   134: ifnull +24 -> 158
    //   137: aload 7
    //   139: getfield 248	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mPriority	I
    //   142: istore 14
    //   144: iload 9
    //   146: iload 14
    //   148: if_icmple +208 -> 356
    //   151: aload 8
    //   153: aload 7
    //   155: putfield 114	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mNext	Lorg/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;
    //   158: aload 12
    //   160: ifnull +214 -> 374
    //   163: aload 12
    //   165: aload 8
    //   167: putfield 114	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mNext	Lorg/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;
    //   170: aload 8
    //   172: getfield 408	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mNonce	I
    //   175: istore 4
    //   177: aload 6
    //   179: monitorexit
    //   180: aload_3
    //   181: ifnull +24 -> 205
    //   184: new 463	org/sqlite/database/sqlite/SQLiteConnectionPool$1
    //   187: astore 12
    //   189: aload 12
    //   191: aload_0
    //   192: aload 8
    //   194: iload 4
    //   196: invokespecial 466	org/sqlite/database/sqlite/SQLiteConnectionPool$1:<init>	(Lorg/sqlite/database/sqlite/SQLiteConnectionPool;Lorg/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;I)V
    //   199: aload_3
    //   200: aload 12
    //   202: invokevirtual 470	org/sqlite/os/CancellationSignal:setOnCancelListener	(Lorg/sqlite/os/CancellationSignal$OnCancelListener;)V
    //   205: ldc2_w 20
    //   208: lstore 10
    //   210: aload 8
    //   212: getfield 361	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mStartTime	J
    //   215: lload 10
    //   217: ladd
    //   218: lstore 15
    //   220: lload 10
    //   222: lstore 17
    //   224: lload 15
    //   226: lstore 19
    //   228: aload_0
    //   229: getfield 73	org/sqlite/database/sqlite/SQLiteConnectionPool:mConnectionLeaked	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   232: astore 7
    //   234: iconst_1
    //   235: istore 21
    //   237: aload 7
    //   239: iload 21
    //   241: iconst_0
    //   242: invokevirtual 476	java/util/concurrent/atomic/AtomicBoolean:compareAndSet	(ZZ)Z
    //   245: istore 4
    //   247: iload 4
    //   249: ifeq +19 -> 268
    //   252: aload_0
    //   253: getfield 68	org/sqlite/database/sqlite/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   256: astore 13
    //   258: aload 13
    //   260: monitorenter
    //   261: aload_0
    //   262: invokespecial 130	org/sqlite/database/sqlite/SQLiteConnectionPool:wakeConnectionWaitersLocked	()V
    //   265: aload 13
    //   267: monitorexit
    //   268: ldc2_w 477
    //   271: lstore 22
    //   273: lload 17
    //   275: lload 22
    //   277: lmul
    //   278: lstore 17
    //   280: aload_0
    //   281: lload 17
    //   283: invokestatic 484	java/util/concurrent/locks/LockSupport:parkNanos	(Ljava/lang/Object;J)V
    //   286: invokestatic 487	java/lang/Thread:interrupted	()Z
    //   289: pop
    //   290: aload_0
    //   291: getfield 68	org/sqlite/database/sqlite/SQLiteConnectionPool:mLock	Ljava/lang/Object;
    //   294: astore 13
    //   296: aload 13
    //   298: monitorenter
    //   299: aload_0
    //   300: invokespecial 200	org/sqlite/database/sqlite/SQLiteConnectionPool:throwIfClosedLocked	()V
    //   303: aload 8
    //   305: getfield 102	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mAssignedConnection	Lorg/sqlite/database/sqlite/SQLiteConnection;
    //   308: astore 7
    //   310: aload 8
    //   312: getfield 106	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mException	Ljava/lang/RuntimeException;
    //   315: astore 24
    //   317: aload 7
    //   319: ifnonnull +8 -> 327
    //   322: aload 24
    //   324: ifnull +103 -> 427
    //   327: aload_0
    //   328: aload 8
    //   330: invokespecial 490	org/sqlite/database/sqlite/SQLiteConnectionPool:recycleConnectionWaiterLocked	(Lorg/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;)V
    //   333: aload 7
    //   335: ifnull +81 -> 416
    //   338: aload 13
    //   340: monitorexit
    //   341: aload_3
    //   342: ifnull -269 -> 73
    //   345: aconst_null
    //   346: astore 12
    //   348: aload_3
    //   349: aconst_null
    //   350: invokevirtual 470	org/sqlite/os/CancellationSignal:setOnCancelListener	(Lorg/sqlite/os/CancellationSignal$OnCancelListener;)V
    //   353: goto -280 -> 73
    //   356: aload 7
    //   358: getfield 114	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mNext	Lorg/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;
    //   361: astore 25
    //   363: aload 7
    //   365: astore 12
    //   367: aload 25
    //   369: astore 7
    //   371: goto -239 -> 132
    //   374: aload_0
    //   375: aload 8
    //   377: putfield 108	org/sqlite/database/sqlite/SQLiteConnectionPool:mConnectionWaiterQueue	Lorg/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter;
    //   380: goto -210 -> 170
    //   383: astore 7
    //   385: aload 6
    //   387: monitorexit
    //   388: aload 7
    //   390: athrow
    //   391: astore 7
    //   393: aload 13
    //   395: monitorexit
    //   396: aload 7
    //   398: athrow
    //   399: astore 7
    //   401: aload_3
    //   402: ifnull +11 -> 413
    //   405: aconst_null
    //   406: astore 12
    //   408: aload_3
    //   409: aconst_null
    //   410: invokevirtual 470	org/sqlite/os/CancellationSignal:setOnCancelListener	(Lorg/sqlite/os/CancellationSignal$OnCancelListener;)V
    //   413: aload 7
    //   415: athrow
    //   416: aload 24
    //   418: athrow
    //   419: astore 7
    //   421: aload 13
    //   423: monitorexit
    //   424: aload 7
    //   426: athrow
    //   427: invokestatic 457	android/os/SystemClock:uptimeMillis	()J
    //   430: lstore 26
    //   432: lload 26
    //   434: lload 19
    //   436: lcmp
    //   437: istore 4
    //   439: iload 4
    //   441: ifge +32 -> 473
    //   444: lload 26
    //   446: lload 19
    //   448: lsub
    //   449: lstore 17
    //   451: lload 19
    //   453: lstore 15
    //   455: lload 17
    //   457: lstore 10
    //   459: aload 13
    //   461: monitorexit
    //   462: lload 10
    //   464: lstore 17
    //   466: lload 15
    //   468: lstore 19
    //   470: goto -242 -> 228
    //   473: aload 8
    //   475: getfield 361	org/sqlite/database/sqlite/SQLiteConnectionPool$ConnectionWaiter:mStartTime	J
    //   478: lstore 15
    //   480: lload 26
    //   482: lload 15
    //   484: lsub
    //   485: lstore 15
    //   487: aload_0
    //   488: lload 15
    //   490: iload_2
    //   491: invokespecial 494	org/sqlite/database/sqlite/SQLiteConnectionPool:logConnectionPoolBusyLocked	(JI)V
    //   494: ldc2_w 20
    //   497: lstore 10
    //   499: lload 26
    //   501: lload 10
    //   503: ladd
    //   504: lstore 15
    //   506: goto -47 -> 459
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	509	0	this	SQLiteConnectionPool
    //   0	509	1	paramString	String
    //   0	509	2	paramInt	int
    //   0	509	3	paramCancellationSignal	CancellationSignal
    //   3	192	4	i	int
    //   245	195	4	bool1	boolean
    //   11	104	5	bool2	boolean
    //   17	369	6	localObject1	Object
    //   38	332	7	localObject2	Object
    //   383	6	7	localObject3	Object
    //   391	6	7	localObject4	Object
    //   399	15	7	localObject5	Object
    //   419	6	7	localObject6	Object
    //   80	394	8	localConnectionWaiter1	SQLiteConnectionPool.ConnectionWaiter
    //   89	60	9	j	int
    //   94	408	10	l1	long
    //   99	308	12	localObject7	Object
    //   142	7	14	k	int
    //   218	287	15	l2	long
    //   222	243	17	l3	long
    //   226	243	19	l4	long
    //   235	5	21	bool3	boolean
    //   271	5	22	l5	long
    //   315	102	24	localRuntimeException	RuntimeException
    //   361	7	25	localConnectionWaiter2	SQLiteConnectionPool.ConnectionWaiter
    //   430	70	26	l6	long
    // Exception table:
    //   from	to	target	type
    //   22	26	383	finally
    //   30	34	383	finally
    //   47	51	383	finally
    //   59	63	383	finally
    //   70	73	383	finally
    //   85	89	383	finally
    //   91	94	383	finally
    //   96	99	383	finally
    //   117	121	383	finally
    //   126	130	383	finally
    //   137	142	383	finally
    //   153	158	383	finally
    //   165	170	383	finally
    //   170	175	383	finally
    //   177	180	383	finally
    //   356	361	383	finally
    //   375	380	383	finally
    //   385	388	383	finally
    //   261	265	391	finally
    //   265	268	391	finally
    //   393	396	391	finally
    //   210	215	399	finally
    //   228	232	399	finally
    //   241	245	399	finally
    //   252	256	399	finally
    //   258	261	399	finally
    //   281	286	399	finally
    //   286	290	399	finally
    //   290	294	399	finally
    //   296	299	399	finally
    //   396	399	399	finally
    //   424	427	399	finally
    //   299	303	419	finally
    //   303	308	419	finally
    //   310	315	419	finally
    //   328	333	419	finally
    //   338	341	419	finally
    //   416	419	419	finally
    //   421	424	419	finally
    //   427	430	419	finally
    //   459	462	419	finally
    //   473	478	419	finally
    //   490	494	419	finally
  }
  
  private void wakeConnectionWaitersLocked()
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = this.mConnectionWaiterQueue;
    int j = 0;
    Object localObject2 = null;
    float f2 = 0.0F;
    int k = 0;
    Object localObject4 = null;
    float f3 = 0.0F;
    Object localObject5 = null;
    int m;
    float f4;
    SQLiteConnectionPool.ConnectionWaiter localConnectionWaiter;
    for (;;)
    {
      if (localObject1 == null) {
        break label229;
      }
      m = this.mIsOpen;
      if (m != 0) {
        break;
      }
      m = j;
      f4 = f2;
      j = i;
      f2 = f1;
      localConnectionWaiter = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mNext;
      if (j == 0) {
        break label284;
      }
      if (localObject5 == null) {
        break label275;
      }
      ((SQLiteConnectionPool.ConnectionWaiter)localObject5).mNext = localConnectionWaiter;
      label83:
      ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mNext = null;
      localObject1 = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mThread;
      LockSupport.unpark((Thread)localObject1);
      label97:
      j = m;
      f2 = f4;
      localObject1 = localConnectionWaiter;
    }
    for (;;)
    {
      try
      {
        m = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mWantPrimaryConnection;
        if ((m != 0) || (j != 0)) {
          break label342;
        }
        Object localObject6 = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mSql;
        int n = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mConnectionFlags;
        localObject6 = tryAcquireNonPrimaryConnectionLocked((String)localObject6, n);
        if (localObject6 != null) {
          break label327;
        }
        localObject2 = localObject6;
        m = i;
        f4 = f1;
        if ((localObject2 != null) || (k != 0)) {}
      }
      catch (RuntimeException localRuntimeException2)
      {
        try
        {
          j = ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mConnectionFlags;
          localObject2 = tryAcquirePrimaryConnectionLocked(j);
          if (localObject2 == null)
          {
            k = i;
            f3 = f1;
          }
          if (localObject2 != null)
          {
            ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mAssignedConnection = ((SQLiteConnection)localObject2);
            j = i;
            f2 = f1;
            break;
          }
          if ((m == 0) || (k == 0)) {
            break label315;
          }
          label229:
          return;
        }
        catch (RuntimeException localRuntimeException1)
        {
          for (;;)
          {
            j = m;
            f2 = f4;
            m = k;
            f4 = f3;
            localObject4 = localRuntimeException1;
          }
          j = 0;
          localObject3 = null;
          f2 = 0.0F;
        }
        localRuntimeException2 = localRuntimeException2;
        m = k;
        f4 = f3;
        localObject4 = localRuntimeException2;
      }
      ((SQLiteConnectionPool.ConnectionWaiter)localObject1).mException = ((RuntimeException)localObject4);
      k = m;
      f3 = f4;
      m = j;
      f4 = f2;
      j = i;
      f2 = f1;
      break;
      label275:
      this.mConnectionWaiterQueue = localConnectionWaiter;
      break label83;
      label284:
      localObject5 = localObject1;
      break label97;
      label315:
      break;
      label327:
      m = j;
      f4 = f2;
      Object localObject3 = localRuntimeException2;
      continue;
      label342:
      m = j;
      f4 = f2;
      j = 0;
      localObject3 = null;
      f2 = 0.0F;
    }
  }
  
  public SQLiteConnection acquireConnection(String paramString, int paramInt, CancellationSignal paramCancellationSignal)
  {
    return waitForConnection(paramString, paramInt, paramCancellationSignal);
  }
  
  public void close()
  {
    dispose(false);
  }
  
  public void collectDbStats(ArrayList paramArrayList)
  {
    boolean bool;
    synchronized (this.mLock)
    {
      Object localObject2 = this.mAvailablePrimaryConnection;
      if (localObject2 != null)
      {
        localObject2 = this.mAvailablePrimaryConnection;
        ((SQLiteConnection)localObject2).collectDbStats(paramArrayList);
      }
      localObject2 = this.mAvailableNonPrimaryConnections;
      localIterator = ((ArrayList)localObject2).iterator();
      bool = localIterator.hasNext();
      if (bool)
      {
        localObject2 = localIterator.next();
        localObject2 = (SQLiteConnection)localObject2;
        ((SQLiteConnection)localObject2).collectDbStats(paramArrayList);
      }
    }
    Object localObject4 = this.mAcquiredConnections;
    localObject4 = ((WeakHashMap)localObject4).keySet();
    Iterator localIterator = ((Set)localObject4).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject4 = localIterator.next();
      localObject4 = (SQLiteConnection)localObject4;
      ((SQLiteConnection)localObject4).collectDbStatsUnsafe(paramArrayList);
    }
  }
  
  public void dump(Printer paramPrinter, boolean paramBoolean) {}
  
  public void enableLocalizedCollators()
  {
    synchronized (this.mLock)
    {
      Object localObject2 = this.mAcquiredConnections;
      boolean bool = ((WeakHashMap)localObject2).isEmpty();
      if (bool)
      {
        localObject2 = this.mAvailablePrimaryConnection;
        if (localObject2 != null) {}
      }
      else
      {
        localObject2 = new java/lang/IllegalStateException;
        String str = "Cannot enable localized collators while database is in use";
        ((IllegalStateException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    SQLiteConnection localSQLiteConnection = this.mAvailablePrimaryConnection;
    localSQLiteConnection.enableLocalizedCollators();
  }
  
  protected void finalize()
  {
    boolean bool = true;
    try
    {
      dispose(bool);
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  void onConnectionLeaked()
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("A SQLiteConnection object for database '");
    String str = this.mConfiguration.label;
    localObject = str + "' was leaked!  Please fix your application " + "to end transactions in progress properly and to close the database " + "when it is no longer needed.";
    Log.w("SQLiteConnectionPool", (String)localObject);
    this.mConnectionLeaked.set(true);
  }
  
  public void reconfigure(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    int i = 0;
    String str = null;
    int j = 1;
    Object localObject1;
    if (paramSQLiteDatabaseConfiguration == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("configuration must not be null.");
      throw ((Throwable)localObject1);
    }
    int m;
    Object localObject5;
    for (;;)
    {
      synchronized (this.mLock)
      {
        throwIfClosedLocked();
        m = paramSQLiteDatabaseConfiguration.openFlags;
        localObject5 = this.mConfiguration;
        int n = ((SQLiteDatabaseConfiguration)localObject5).openFlags;
        m ^= n;
        n = 536870912;
        m &= n;
        if (m != 0)
        {
          m = j;
          if (m == 0) {
            break label187;
          }
          localObject5 = this.mAcquiredConnections;
          bool1 = ((WeakHashMap)localObject5).isEmpty();
          if (bool1) {
            break;
          }
          localObject1 = new java/lang/IllegalStateException;
          str = "Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.";
          ((IllegalStateException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
      m = 0;
    }
    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
    boolean bool1 = $assertionsDisabled;
    if (!bool1)
    {
      localObject5 = this.mAvailableNonPrimaryConnections;
      bool1 = ((ArrayList)localObject5).isEmpty();
      if (!bool1)
      {
        localObject3 = new java/lang/AssertionError;
        ((AssertionError)localObject3).<init>();
        throw ((Throwable)localObject3);
      }
    }
    label187:
    bool1 = paramSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
    SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfiguration;
    boolean bool2 = localSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
    if (bool1 != bool2) {}
    while (j != 0)
    {
      localObject3 = this.mAcquiredConnections;
      j = ((WeakHashMap)localObject3).isEmpty();
      if (j != 0) {
        break;
      }
      localObject3 = new java/lang/IllegalStateException;
      str = "Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.";
      ((IllegalStateException)localObject3).<init>(str);
      throw ((Throwable)localObject3);
      j = 0;
      localObject3 = null;
    }
    Object localObject3 = this.mConfiguration;
    int k = ((SQLiteDatabaseConfiguration)localObject3).openFlags;
    i = paramSQLiteDatabaseConfiguration.openFlags;
    if (k != i)
    {
      if (m != 0) {
        closeAvailableConnectionsAndLogExceptionsLocked();
      }
      k = 1;
      localObject3 = openConnectionLocked(paramSQLiteDatabaseConfiguration, k);
      closeAvailableConnectionsAndLogExceptionsLocked();
      discardAcquiredConnectionsLocked();
      this.mAvailablePrimaryConnection = ((SQLiteConnection)localObject3);
      localObject3 = this.mConfiguration;
      ((SQLiteDatabaseConfiguration)localObject3).updateParametersFrom(paramSQLiteDatabaseConfiguration);
      setMaxConnectionPoolSizeLocked();
    }
    for (;;)
    {
      wakeConnectionWaitersLocked();
      return;
      localObject3 = this.mConfiguration;
      ((SQLiteDatabaseConfiguration)localObject3).updateParametersFrom(paramSQLiteDatabaseConfiguration);
      setMaxConnectionPoolSizeLocked();
      closeExcessConnectionsAndLogExceptionsLocked();
      reconfigureAllConnectionsLocked();
    }
  }
  
  public void releaseConnection(SQLiteConnection paramSQLiteConnection)
  {
    Object localObject4;
    synchronized (this.mLock)
    {
      Object localObject2 = this.mAcquiredConnections;
      localObject2 = ((WeakHashMap)localObject2).remove(paramSQLiteConnection);
      localObject2 = (SQLiteConnectionPool.AcquiredConnectionStatus)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject4 = "Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.";
        ((IllegalStateException)localObject2).<init>((String)localObject4);
        throw ((Throwable)localObject2);
      }
    }
    boolean bool1 = this.mIsOpen;
    if (!bool1) {
      closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
    }
    for (;;)
    {
      return;
      bool1 = paramSQLiteConnection.isPrimaryConnection();
      boolean bool2;
      Object localObject3;
      if (bool1)
      {
        bool2 = recycleConnectionLocked(paramSQLiteConnection, localAcquiredConnectionStatus);
        if (bool2)
        {
          bool2 = $assertionsDisabled;
          if (!bool2)
          {
            localObject3 = this.mAvailablePrimaryConnection;
            if (localObject3 != null)
            {
              localObject3 = new java/lang/AssertionError;
              ((AssertionError)localObject3).<init>();
              throw ((Throwable)localObject3);
            }
          }
          this.mAvailablePrimaryConnection = paramSQLiteConnection;
        }
        wakeConnectionWaitersLocked();
      }
      else
      {
        localObject4 = this.mAvailableNonPrimaryConnections;
        int i = ((ArrayList)localObject4).size();
        int j = this.mMaxConnectionPoolSize + -1;
        if (i >= j)
        {
          closeConnectionAndLogExceptionsLocked(paramSQLiteConnection);
        }
        else
        {
          bool2 = recycleConnectionLocked(paramSQLiteConnection, (SQLiteConnectionPool.AcquiredConnectionStatus)localObject3);
          if (bool2)
          {
            localObject3 = this.mAvailableNonPrimaryConnections;
            ((ArrayList)localObject3).add(paramSQLiteConnection);
          }
          wakeConnectionWaitersLocked();
        }
      }
    }
  }
  
  public boolean shouldYieldConnection(SQLiteConnection paramSQLiteConnection, int paramInt)
  {
    synchronized (this.mLock)
    {
      Object localObject2 = this.mAcquiredConnections;
      bool = ((WeakHashMap)localObject2).containsKey(paramSQLiteConnection);
      if (!bool)
      {
        localObject2 = new java/lang/IllegalStateException;
        String str = "Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.";
        ((IllegalStateException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    boolean bool = this.mIsOpen;
    if (!bool)
    {
      bool = false;
      Object localObject4 = null;
    }
    for (;;)
    {
      return bool;
      bool = paramSQLiteConnection.isPrimaryConnection();
      bool = isSessionBlockingImportantConnectionWaitersLocked(bool, paramInt);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SQLiteConnectionPool: ");
    String str = this.mConfiguration.path;
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteConnectionPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */