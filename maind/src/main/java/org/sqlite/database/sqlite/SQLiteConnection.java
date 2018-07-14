package org.sqlite.database.sqlite;

import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.util.Log;
import android.util.Printer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.sqlite.database.ExtraUtils;
import org.sqlite.os.CancellationSignal;
import org.sqlite.os.CancellationSignal.OnCancelListener;

public final class SQLiteConnection
  implements CancellationSignal.OnCancelListener
{
  private static final boolean DEBUG = false;
  private static final byte[] EMPTY_BYTE_ARRAY;
  private static final String[] EMPTY_STRING_ARRAY;
  private static final String TAG = "SQLiteConnection";
  private static final Pattern TRIM_SQL_PATTERN;
  private int mCancellationSignalAttachCount;
  private final CloseGuard mCloseGuard;
  private final SQLiteDatabaseConfiguration mConfiguration;
  private final int mConnectionId;
  private long mConnectionPtr;
  private final boolean mIsPrimaryConnection;
  private final boolean mIsReadOnlyConnection;
  private boolean mOnlyAllowReadOnlyOperations;
  private final SQLiteConnectionPool mPool;
  private final SQLiteConnection.PreparedStatementCache mPreparedStatementCache;
  private SQLiteConnection.PreparedStatement mPreparedStatementPool;
  private final SQLiteConnection.OperationLog mRecentOperations;
  
  static
  {
    Class localClass = SQLiteConnection.class;
    boolean bool = localClass.desiredAssertionStatus();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      $assertionsDisabled = bool;
      EMPTY_STRING_ARRAY = new String[0];
      EMPTY_BYTE_ARRAY = new byte[0];
      TRIM_SQL_PATTERN = Pattern.compile("[\\s]*\\n+[\\s]*");
      return;
      bool = false;
      localClass = null;
    }
  }
  
  private SQLiteConnection(SQLiteConnectionPool paramSQLiteConnectionPool, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, int paramInt, boolean paramBoolean)
  {
    Object localObject = CloseGuard.get();
    this.mCloseGuard = ((CloseGuard)localObject);
    localObject = new org/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    int i = 0;
    ((SQLiteConnection.OperationLog)localObject).<init>(null);
    this.mRecentOperations = ((SQLiteConnection.OperationLog)localObject);
    this.mPool = paramSQLiteConnectionPool;
    localObject = new org/sqlite/database/sqlite/SQLiteDatabaseConfiguration;
    ((SQLiteDatabaseConfiguration)localObject).<init>(paramSQLiteDatabaseConfiguration);
    this.mConfiguration = ((SQLiteDatabaseConfiguration)localObject);
    this.mConnectionId = paramInt;
    this.mIsPrimaryConnection = paramBoolean;
    int j = paramSQLiteDatabaseConfiguration.openFlags & 0x1;
    if (j != 0) {
      j = 1;
    }
    for (;;)
    {
      this.mIsReadOnlyConnection = j;
      localObject = new org/sqlite/database/sqlite/SQLiteConnection$PreparedStatementCache;
      i = this.mConfiguration.maxSqlCacheSize;
      ((SQLiteConnection.PreparedStatementCache)localObject).<init>(this, i);
      this.mPreparedStatementCache = ((SQLiteConnection.PreparedStatementCache)localObject);
      this.mCloseGuard.open("close");
      return;
      j = 0;
      localObject = null;
    }
  }
  
  private SQLiteConnection.PreparedStatement acquirePreparedStatement(String paramString)
  {
    boolean bool1 = true;
    Object localObject1 = this.mPreparedStatementCache.get(paramString);
    Object localObject2 = localObject1;
    localObject2 = (SQLiteConnection.PreparedStatement)localObject1;
    boolean bool2 = false;
    localObject1 = null;
    if (localObject2 != null)
    {
      bool2 = ((SQLiteConnection.PreparedStatement)localObject2).mInUse;
      if (!bool2) {
        return (SQLiteConnection.PreparedStatement)localObject2;
      }
    }
    for (int i = bool1;; i = 0)
    {
      long l1 = this.mConnectionPtr;
      long l2 = nativePrepareStatement(l1, paramString);
      try
      {
        l1 = this.mConnectionPtr;
        int j = nativeGetParameterCount(l1, l2);
        int k = DatabaseUtils.getSqlStatementType(paramString);
        l1 = this.mConnectionPtr;
        boolean bool3 = nativeIsReadOnly(l1, l2);
        localObject1 = this;
        localObject2 = obtainPreparedStatement(paramString, l2, j, k, bool3);
        if (i == 0)
        {
          bool2 = isCacheable(k);
          if (bool2)
          {
            localObject1 = this.mPreparedStatementCache;
            ((SQLiteConnection.PreparedStatementCache)localObject1).put(paramString, localObject2);
            bool2 = true;
            ((SQLiteConnection.PreparedStatement)localObject2).mInCache = bool2;
          }
        }
        ((SQLiteConnection.PreparedStatement)localObject2).mInUse = bool1;
      }
      catch (RuntimeException localRuntimeException)
      {
        if (localObject2 != null)
        {
          boolean bool4 = ((SQLiteConnection.PreparedStatement)localObject2).mInCache;
          if (bool4) {}
        }
        else
        {
          long l3 = this.mConnectionPtr;
          nativeFinalizeStatement(l3, l2);
        }
        throw localRuntimeException;
      }
    }
  }
  
  private void applyBlockGuardPolicy(SQLiteConnection.PreparedStatement paramPreparedStatement) {}
  
  private void attachCancellationSignal(CancellationSignal paramCancellationSignal)
  {
    int i = 1;
    if (paramCancellationSignal != null)
    {
      paramCancellationSignal.throwIfCanceled();
      int j = this.mCancellationSignalAttachCount + 1;
      this.mCancellationSignalAttachCount = j;
      j = this.mCancellationSignalAttachCount;
      if (j == i)
      {
        long l = this.mConnectionPtr;
        nativeResetCancel(l, i);
        paramCancellationSignal.setOnCancelListener(this);
      }
    }
  }
  
  private void bindArguments(SQLiteConnection.PreparedStatement paramPreparedStatement, Object[] paramArrayOfObject)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramArrayOfObject != null) {
      j = paramArrayOfObject.length;
    }
    for (int k = j;; k = 0)
    {
      j = paramPreparedStatement.mNumParameters;
      if (k == j) {
        break;
      }
      SQLiteBindOrColumnIndexOutOfRangeException localSQLiteBindOrColumnIndexOutOfRangeException = new org/sqlite/database/sqlite/SQLiteBindOrColumnIndexOutOfRangeException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Expected ");
      int m = paramPreparedStatement.mNumParameters;
      localObject1 = m + " bind arguments but " + k + " were provided.";
      localSQLiteBindOrColumnIndexOutOfRangeException.<init>((String)localObject1);
      throw localSQLiteBindOrColumnIndexOutOfRangeException;
    }
    if (k == 0) {}
    long l1;
    int n;
    do
    {
      return;
      l1 = paramPreparedStatement.mStatementPtr;
      n = 0;
    } while (n >= k);
    Object localObject2 = paramArrayOfObject[n];
    int j = ExtraUtils.getTypeOfObject(localObject2);
    long l2;
    int i1;
    long l3;
    double d;
    switch (j)
    {
    case 3: 
    default: 
      boolean bool1 = localObject2 instanceof Boolean;
      if (bool1)
      {
        l2 = this.mConnectionPtr;
        i1 = n + 1;
        localObject2 = (Boolean)localObject2;
        boolean bool2 = ((Boolean)localObject2).booleanValue();
        if (bool2)
        {
          l3 = 1L;
          d = Double.MIN_VALUE;
          label227:
          nativeBindLong(l2, l1, i1, l3);
        }
      }
      break;
    }
    for (;;)
    {
      i = n + 1;
      n = i;
      break;
      l2 = this.mConnectionPtr;
      i1 = n + 1;
      nativeBindNull(l2, l1, i1);
      continue;
      l2 = this.mConnectionPtr;
      i1 = n + 1;
      localObject2 = (Number)localObject2;
      l3 = ((Number)localObject2).longValue();
      nativeBindLong(l2, l1, i1, l3);
      continue;
      l2 = this.mConnectionPtr;
      i1 = n + 1;
      localObject2 = (Number)localObject2;
      d = ((Number)localObject2).doubleValue();
      nativeBindDouble(l2, l1, i1, d);
      continue;
      l2 = this.mConnectionPtr;
      i1 = n + 1;
      localObject2 = (byte[])localObject2;
      nativeBindBlob(l2, l1, i1, (byte[])localObject2);
      continue;
      l3 = 0L;
      d = 0.0D;
      break label227;
      l2 = this.mConnectionPtr;
      i1 = n + 1;
      localObject2 = localObject2.toString();
      nativeBindString(l2, l1, i1, (String)localObject2);
    }
  }
  
  private static String canonicalizeSyncMode(String paramString)
  {
    String str = "0";
    boolean bool = paramString.equals(str);
    if (bool) {
      paramString = "OFF";
    }
    for (;;)
    {
      return paramString;
      str = "1";
      bool = paramString.equals(str);
      if (bool)
      {
        paramString = "NORMAL";
      }
      else
      {
        str = "2";
        bool = paramString.equals(str);
        if (bool) {
          paramString = "FULL";
        }
      }
    }
  }
  
  private void detachCancellationSignal(CancellationSignal paramCancellationSignal)
  {
    if (paramCancellationSignal != null)
    {
      boolean bool = $assertionsDisabled;
      AssertionError localAssertionError;
      if (!bool)
      {
        i = this.mCancellationSignalAttachCount;
        if (i <= 0)
        {
          localAssertionError = new java/lang/AssertionError;
          localAssertionError.<init>();
          throw localAssertionError;
        }
      }
      int i = this.mCancellationSignalAttachCount + -1;
      this.mCancellationSignalAttachCount = i;
      i = this.mCancellationSignalAttachCount;
      if (i == 0)
      {
        i = 0;
        localAssertionError = null;
        paramCancellationSignal.setOnCancelListener(null);
        long l = this.mConnectionPtr;
        nativeResetCancel(l, false);
      }
    }
  }
  
  private void dispose(boolean paramBoolean)
  {
    long l1 = 0L;
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
    long l2 = this.mConnectionPtr;
    boolean bool = l2 < l1;
    int i;
    if (bool)
    {
      localObject1 = this.mRecentOperations;
      String str = "close";
      i = ((SQLiteConnection.OperationLog)localObject1).beginOperation(str, null, null);
    }
    try
    {
      localObject1 = this.mPreparedStatementCache;
      ((SQLiteConnection.PreparedStatementCache)localObject1).evictAll();
      long l3 = this.mConnectionPtr;
      nativeClose(l3);
      l3 = 0L;
      this.mConnectionPtr = l3;
      localObject1 = this.mRecentOperations;
      ((SQLiteConnection.OperationLog)localObject1).endOperation(i);
      return;
    }
    finally
    {
      this.mRecentOperations.endOperation(i);
    }
  }
  
  private void finalizePreparedStatement(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    long l1 = this.mConnectionPtr;
    long l2 = paramPreparedStatement.mStatementPtr;
    nativeFinalizeStatement(l1, l2);
    recyclePreparedStatement(paramPreparedStatement);
  }
  
  private SQLiteDebug.DbStats getMainDbStatsUnsafe(int paramInt, long paramLong1, long paramLong2)
  {
    Object localObject = this.mConfiguration;
    String str = ((SQLiteDatabaseConfiguration)localObject).path;
    boolean bool = this.mIsPrimaryConnection;
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(str).append(" (");
      int i = this.mConnectionId;
      localObject = ((StringBuilder)localObject).append(i).append(")");
      str = ((StringBuilder)localObject).toString();
    }
    localObject = new org/sqlite/database/sqlite/SQLiteDebug$DbStats;
    int j = this.mPreparedStatementCache.hitCount();
    int k = this.mPreparedStatementCache.missCount();
    int m = this.mPreparedStatementCache.size();
    ((SQLiteDebug.DbStats)localObject).<init>(str, paramLong1, paramLong2, paramInt, j, k, m);
    return (SQLiteDebug.DbStats)localObject;
  }
  
  public static boolean hasCodec()
  {
    return nativeHasCodec();
  }
  
  private static boolean isCacheable(int paramInt)
  {
    int i = 1;
    int j = 2;
    if ((paramInt == j) || (paramInt == i)) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  private static native void nativeBindBlob(long paramLong1, long paramLong2, int paramInt, byte[] paramArrayOfByte);
  
  private static native void nativeBindDouble(long paramLong1, long paramLong2, int paramInt, double paramDouble);
  
  private static native void nativeBindLong(long paramLong1, long paramLong2, int paramInt, long paramLong3);
  
  private static native void nativeBindNull(long paramLong1, long paramLong2, int paramInt);
  
  private static native void nativeBindString(long paramLong1, long paramLong2, int paramInt, String paramString);
  
  private static native void nativeCancel(long paramLong);
  
  private static native void nativeClose(long paramLong);
  
  private static native void nativeExecute(long paramLong1, long paramLong2);
  
  private static native int nativeExecuteForBlobFileDescriptor(long paramLong1, long paramLong2);
  
  private static native int nativeExecuteForChangedRowCount(long paramLong1, long paramLong2);
  
  private static native long nativeExecuteForCursorWindow(long paramLong1, long paramLong2, CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean);
  
  private static native long nativeExecuteForLastInsertedRowId(long paramLong1, long paramLong2);
  
  private static native long nativeExecuteForLong(long paramLong1, long paramLong2);
  
  private static native String nativeExecuteForString(long paramLong1, long paramLong2);
  
  private static native void nativeFinalizeStatement(long paramLong1, long paramLong2);
  
  private static native int nativeGetColumnCount(long paramLong1, long paramLong2);
  
  private static native String nativeGetColumnName(long paramLong1, long paramLong2, int paramInt);
  
  private static native int nativeGetDbLookaside(long paramLong);
  
  private static native int nativeGetParameterCount(long paramLong1, long paramLong2);
  
  private static native boolean nativeHasCodec();
  
  private static native boolean nativeIsReadOnly(long paramLong1, long paramLong2);
  
  private static native long nativeOpen(String paramString1, int paramInt, String paramString2, boolean paramBoolean1, boolean paramBoolean2);
  
  private static native long nativePrepareStatement(long paramLong, String paramString);
  
  private static native void nativeRegisterCustomFunction(long paramLong, SQLiteCustomFunction paramSQLiteCustomFunction);
  
  private static native void nativeRegisterLocalizedCollators(long paramLong, String paramString);
  
  private static native void nativeResetCancel(long paramLong, boolean paramBoolean);
  
  private static native void nativeResetStatementAndClearBindings(long paramLong1, long paramLong2);
  
  private SQLiteConnection.PreparedStatement obtainPreparedStatement(String paramString, long paramLong, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    SQLiteConnection.PreparedStatement localPreparedStatement1 = this.mPreparedStatementPool;
    if (localPreparedStatement1 != null)
    {
      SQLiteConnection.PreparedStatement localPreparedStatement2 = localPreparedStatement1.mPoolNext;
      this.mPreparedStatementPool = localPreparedStatement2;
      localPreparedStatement1.mPoolNext = null;
      localPreparedStatement2 = null;
      localPreparedStatement1.mInCache = false;
    }
    for (;;)
    {
      localPreparedStatement1.mSql = paramString;
      localPreparedStatement1.mStatementPtr = paramLong;
      localPreparedStatement1.mNumParameters = paramInt1;
      localPreparedStatement1.mType = paramInt2;
      localPreparedStatement1.mReadOnly = paramBoolean;
      return localPreparedStatement1;
      localPreparedStatement1 = new org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
      localPreparedStatement1.<init>(null);
    }
  }
  
  static SQLiteConnection open(SQLiteConnectionPool paramSQLiteConnectionPool, SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration, int paramInt, boolean paramBoolean)
  {
    SQLiteConnection localSQLiteConnection = new org/sqlite/database/sqlite/SQLiteConnection;
    localSQLiteConnection.<init>(paramSQLiteConnectionPool, paramSQLiteDatabaseConfiguration, paramInt, paramBoolean);
    try
    {
      localSQLiteConnection.open();
      return localSQLiteConnection;
    }
    catch (SQLiteException localSQLiteException)
    {
      localSQLiteConnection.dispose(false);
      throw localSQLiteException;
    }
  }
  
  private void open()
  {
    Object localObject = this.mConfiguration.path;
    SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfiguration;
    int i = localSQLiteDatabaseConfiguration.openFlags;
    String str = this.mConfiguration.label;
    boolean bool1 = SQLiteDebug.DEBUG_SQL_STATEMENTS;
    boolean bool2 = SQLiteDebug.DEBUG_SQL_TIME;
    long l1 = nativeOpen((String)localObject, i, str, bool1, bool2);
    this.mConnectionPtr = l1;
    setPageSize();
    setForeignKeyModeFromConfiguration();
    setJournalSizeLimit();
    setAutoCheckpointInterval();
    boolean bool3 = nativeHasCodec();
    if (!bool3)
    {
      setWalModeFromConfiguration();
      setLocaleFromConfiguration();
    }
    int k = this.mConfiguration.customFunctions.size();
    bool3 = false;
    localObject = null;
    i = 0;
    localSQLiteDatabaseConfiguration = null;
    while (i < k)
    {
      localObject = (SQLiteCustomFunction)this.mConfiguration.customFunctions.get(i);
      long l2 = this.mConnectionPtr;
      nativeRegisterCustomFunction(l2, (SQLiteCustomFunction)localObject);
      int j = i + 1;
      i = j;
    }
  }
  
  private void recyclePreparedStatement(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    paramPreparedStatement.mSql = null;
    SQLiteConnection.PreparedStatement localPreparedStatement = this.mPreparedStatementPool;
    paramPreparedStatement.mPoolNext = localPreparedStatement;
    this.mPreparedStatementPool = paramPreparedStatement;
  }
  
  private void releasePreparedStatement(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    Object localObject = null;
    paramPreparedStatement.mInUse = false;
    boolean bool = paramPreparedStatement.mInCache;
    if (bool) {}
    for (;;)
    {
      try
      {
        long l1 = this.mConnectionPtr;
        long l2 = paramPreparedStatement.mStatementPtr;
        nativeResetStatementAndClearBindings(l1, l2);
        return;
      }
      catch (SQLiteException localSQLiteException)
      {
        SQLiteConnection.PreparedStatementCache localPreparedStatementCache = this.mPreparedStatementCache;
        String str = paramPreparedStatement.mSql;
        localPreparedStatementCache.remove(str);
        continue;
      }
      finalizePreparedStatement(paramPreparedStatement);
    }
  }
  
  private void setAutoCheckpointInterval()
  {
    Object localObject1 = this.mConfiguration;
    boolean bool1 = ((SQLiteDatabaseConfiguration)localObject1).isInMemoryDb();
    if (!bool1)
    {
      bool1 = this.mIsReadOnlyConnection;
      if (!bool1)
      {
        int i = SQLiteGlobal.getWALAutoCheckpoint();
        long l1 = i;
        Object localObject2 = "PRAGMA wal_autocheckpoint";
        long l2 = executeForLong((String)localObject2, null, null);
        boolean bool2 = l2 < l1;
        if (bool2)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "PRAGMA wal_autocheckpoint=";
          localObject2 = ((StringBuilder)localObject2).append(str);
          localObject1 = l1;
          executeForLong((String)localObject1, null, null);
        }
      }
    }
  }
  
  private void setForeignKeyModeFromConfiguration()
  {
    boolean bool1 = this.mIsReadOnlyConnection;
    Object localObject1;
    if (!bool1)
    {
      localObject1 = this.mConfiguration;
      bool1 = ((SQLiteDatabaseConfiguration)localObject1).foreignKeyConstraintsEnabled;
      if (!bool1) {
        break label93;
      }
    }
    label93:
    for (long l1 = 1L;; l1 = 0L)
    {
      Object localObject2 = "PRAGMA foreign_keys";
      long l2 = executeForLong((String)localObject2, null, null);
      boolean bool2 = l2 < l1;
      if (bool2)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str = "PRAGMA foreign_keys=";
        localObject2 = ((StringBuilder)localObject2).append(str);
        localObject1 = l1;
        execute((String)localObject1, null, null);
      }
      return;
    }
  }
  
  private void setJournalMode(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = executeForString("PRAGMA journal_mode", null, null);
    boolean bool = ((String)localObject2).equalsIgnoreCase(paramString);
    if (!bool) {}
    try
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "PRAGMA journal_mode=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(paramString);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = null;
      str2 = null;
      localObject1 = executeForString((String)localObject1, null, null);
      bool = ((String)localObject1).equalsIgnoreCase(paramString);
      if (bool) {
        return;
      }
    }
    catch (SQLiteDatabaseLockedException localSQLiteDatabaseLockedException)
    {
      for (;;)
      {
        String str1 = "SQLiteConnection";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = ((StringBuilder)localObject3).append("Could not change the database journal mode of '");
        String str2 = this.mConfiguration.label;
        localObject3 = ((StringBuilder)localObject3).append(str2);
        str2 = "' from '";
        localObject2 = ((StringBuilder)localObject3).append(str2).append((String)localObject2).append("' to '").append(paramString).append("' because the database is locked.  This usually means that ").append("there are other open connections to the database which prevents ").append("the database from enabling or disabling write-ahead logging mode.  ");
        localObject3 = "Proceeding without changing the journal mode.";
        localObject2 = (String)localObject3;
        Log.w(str1, (String)localObject2);
      }
    }
  }
  
  private void setJournalSizeLimit()
  {
    Object localObject1 = this.mConfiguration;
    boolean bool1 = ((SQLiteDatabaseConfiguration)localObject1).isInMemoryDb();
    if (!bool1)
    {
      bool1 = this.mIsReadOnlyConnection;
      if (!bool1)
      {
        int i = SQLiteGlobal.getJournalSizeLimit();
        long l1 = i;
        Object localObject2 = "PRAGMA journal_size_limit";
        long l2 = executeForLong((String)localObject2, null, null);
        boolean bool2 = l2 < l1;
        if (bool2)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "PRAGMA journal_size_limit=";
          localObject2 = ((StringBuilder)localObject2).append(str);
          localObject1 = l1;
          executeForLong((String)localObject1, null, null);
        }
      }
    }
  }
  
  private void setLocaleFromConfiguration()
  {
    Object localObject1 = this.mConfiguration;
    int i = ((SQLiteDatabaseConfiguration)localObject1).openFlags & 0x10;
    if (i != 0) {}
    for (;;)
    {
      return;
      localObject1 = this.mConfiguration.locale;
      String str1 = ((Locale)localObject1).toString();
      long l = this.mConnectionPtr;
      nativeRegisterLocalizedCollators(l, str1);
      boolean bool = this.mIsReadOnlyConnection;
      if (bool) {
        continue;
      }
      localObject1 = "CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)";
      int j = 0;
      localObject3 = null;
      localStringBuilder = null;
      try
      {
        execute((String)localObject1, null, null);
        localObject1 = "SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1";
        j = 0;
        localObject3 = null;
        localStringBuilder = null;
        localObject1 = executeForString((String)localObject1, null, null);
        if (localObject1 != null)
        {
          bool = ((String)localObject1).equals(str1);
          if (bool) {
            continue;
          }
        }
        localObject1 = "BEGIN";
        j = 0;
        localObject3 = null;
        localStringBuilder = null;
        execute((String)localObject1, null, null);
        localObject1 = "DELETE FROM android_metadata";
        j = 0;
        localObject3 = null;
        localStringBuilder = null;
      }
      catch (RuntimeException localRuntimeException)
      {
        try
        {
          execute((String)localObject1, null, null);
          localObject1 = "INSERT INTO android_metadata (locale) VALUES(?)";
          j = 1;
          localObject3 = new Object[j];
          localStringBuilder = null;
          localObject3[0] = str1;
          localStringBuilder = null;
          execute((String)localObject1, (Object[])localObject3, null);
          localObject1 = "REINDEX LOCALIZED";
          j = 0;
          localObject3 = null;
          localStringBuilder = null;
          execute((String)localObject1, null, null);
          localObject1 = "COMMIT";
          j = 0;
          localObject3 = null;
          localStringBuilder = null;
          execute((String)localObject1, null, null);
          continue;
        }
        finally
        {
          localObject3 = "ROLLBACK";
          localStringBuilder = null;
          String str2 = null;
          execute((String)localObject3, null, null);
        }
        localRuntimeException = localRuntimeException;
        localObject3 = new org/sqlite/database/sqlite/SQLiteException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder = localStringBuilder.append("Failed to change locale for db '");
        str2 = this.mConfiguration.label;
        str1 = str2 + "' to '" + str1 + "'.";
        ((SQLiteException)localObject3).<init>(str1, localRuntimeException);
        throw ((Throwable)localObject3);
      }
    }
  }
  
  private void setPageSize()
  {
    Object localObject1 = this.mConfiguration;
    boolean bool1 = ((SQLiteDatabaseConfiguration)localObject1).isInMemoryDb();
    if (!bool1)
    {
      bool1 = this.mIsReadOnlyConnection;
      if (!bool1)
      {
        int i = SQLiteGlobal.getDefaultPageSize();
        long l1 = i;
        Object localObject2 = "PRAGMA page_size";
        long l2 = executeForLong((String)localObject2, null, null);
        boolean bool2 = l2 < l1;
        if (bool2)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = "PRAGMA page_size=";
          localObject2 = ((StringBuilder)localObject2).append(str);
          localObject1 = l1;
          execute((String)localObject1, null, null);
        }
      }
    }
  }
  
  private void setSyncMode(String paramString)
  {
    Object localObject = canonicalizeSyncMode(executeForString("PRAGMA synchronous", null, null));
    String str = canonicalizeSyncMode(paramString);
    boolean bool = ((String)localObject).equalsIgnoreCase(str);
    if (!bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = "PRAGMA synchronous=";
      localObject = str + paramString;
      execute((String)localObject, null, null);
    }
  }
  
  private void setWalModeFromConfiguration()
  {
    Object localObject = this.mConfiguration;
    boolean bool = ((SQLiteDatabaseConfiguration)localObject).isInMemoryDb();
    if (!bool)
    {
      bool = this.mIsReadOnlyConnection;
      if (!bool)
      {
        localObject = this.mConfiguration;
        int i = ((SQLiteDatabaseConfiguration)localObject).openFlags;
        int j = 536870912;
        i &= j;
        if (i == 0) {
          break label62;
        }
        setJournalMode("WAL");
        localObject = SQLiteGlobal.getWALSyncMode();
        setSyncMode((String)localObject);
      }
    }
    for (;;)
    {
      return;
      label62:
      localObject = SQLiteGlobal.getDefaultJournalMode();
      setJournalMode((String)localObject);
      localObject = SQLiteGlobal.getDefaultSyncMode();
      setSyncMode((String)localObject);
    }
  }
  
  private void throwIfStatementForbidden(SQLiteConnection.PreparedStatement paramPreparedStatement)
  {
    boolean bool = this.mOnlyAllowReadOnlyOperations;
    if (bool)
    {
      bool = paramPreparedStatement.mReadOnly;
      if (!bool)
      {
        SQLiteException localSQLiteException = new org/sqlite/database/sqlite/SQLiteException;
        localSQLiteException.<init>("Cannot execute this statement because it might modify the database but the connection is read-only.");
        throw localSQLiteException;
      }
    }
  }
  
  private static String trimSqlForDisplay(String paramString)
  {
    return TRIM_SQL_PATTERN.matcher(paramString).replaceAll(" ");
  }
  
  void close()
  {
    dispose(false);
  }
  
  /* Error */
  void collectDbStats(ArrayList paramArrayList)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   4: lstore_2
    //   5: lload_2
    //   6: invokestatic 573	org/sqlite/database/sqlite/SQLiteConnection:nativeGetDbLookaside	(J)I
    //   9: istore 4
    //   11: lconst_0
    //   12: lstore 5
    //   14: lconst_0
    //   15: lstore 7
    //   17: ldc_w 575
    //   20: astore 9
    //   22: aconst_null
    //   23: astore 10
    //   25: aload_0
    //   26: aload 9
    //   28: aconst_null
    //   29: aconst_null
    //   30: invokevirtual 429	org/sqlite/database/sqlite/SQLiteConnection:executeForLong	(Ljava/lang/String;[Ljava/lang/Object;Lorg/sqlite/os/CancellationSignal;)J
    //   33: lstore 5
    //   35: ldc_w 577
    //   38: astore 9
    //   40: aconst_null
    //   41: astore 10
    //   43: aload_0
    //   44: aload 9
    //   46: aconst_null
    //   47: aconst_null
    //   48: invokevirtual 429	org/sqlite/database/sqlite/SQLiteConnection:executeForLong	(Ljava/lang/String;[Ljava/lang/Object;Lorg/sqlite/os/CancellationSignal;)J
    //   51: lstore 7
    //   53: aload_0
    //   54: astore 9
    //   56: aload_0
    //   57: iload 4
    //   59: lload 5
    //   61: lload 7
    //   63: invokespecial 581	org/sqlite/database/sqlite/SQLiteConnection:getMainDbStatsUnsafe	(IJJ)Lorg/sqlite/database/sqlite/SQLiteDebug$DbStats;
    //   66: astore 9
    //   68: aload_1
    //   69: aload 9
    //   71: invokevirtual 584	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   74: pop
    //   75: new 586	android/database/CursorWindow
    //   78: astore 11
    //   80: aload 11
    //   82: ldc_w 588
    //   85: invokespecial 589	android/database/CursorWindow:<init>	(Ljava/lang/String;)V
    //   88: ldc_w 591
    //   91: astore 12
    //   93: iconst_0
    //   94: istore 13
    //   96: aconst_null
    //   97: astore 14
    //   99: aconst_null
    //   100: astore 15
    //   102: aconst_null
    //   103: astore 10
    //   105: aload_0
    //   106: astore 9
    //   108: aload_0
    //   109: aload 12
    //   111: aconst_null
    //   112: aload 11
    //   114: iconst_0
    //   115: iconst_0
    //   116: iconst_0
    //   117: aconst_null
    //   118: invokevirtual 595	org/sqlite/database/sqlite/SQLiteConnection:executeForCursorWindow	(Ljava/lang/String;[Ljava/lang/Object;Landroid/database/CursorWindow;IIZLorg/sqlite/os/CancellationSignal;)I
    //   121: pop
    //   122: iconst_1
    //   123: istore 16
    //   125: iload 16
    //   127: istore 13
    //   129: aload 11
    //   131: invokevirtual 598	android/database/CursorWindow:getNumRows	()I
    //   134: istore 16
    //   136: iload 13
    //   138: iload 16
    //   140: if_icmpge +336 -> 476
    //   143: iconst_1
    //   144: istore 16
    //   146: aload 11
    //   148: iload 13
    //   150: iload 16
    //   152: invokevirtual 602	android/database/CursorWindow:getString	(II)Ljava/lang/String;
    //   155: astore 14
    //   157: iconst_2
    //   158: istore 16
    //   160: aload 11
    //   162: iload 13
    //   164: iload 16
    //   166: invokevirtual 602	android/database/CursorWindow:getString	(II)Ljava/lang/String;
    //   169: astore 17
    //   171: lconst_0
    //   172: lstore_2
    //   173: lconst_0
    //   174: lstore 18
    //   176: new 198	java/lang/StringBuilder
    //   179: astore 15
    //   181: aload 15
    //   183: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   186: ldc_w 604
    //   189: astore 10
    //   191: aload 15
    //   193: aload 10
    //   195: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: astore 15
    //   200: aload 15
    //   202: aload 14
    //   204: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: astore 15
    //   209: ldc_w 606
    //   212: astore 10
    //   214: aload 15
    //   216: aload 10
    //   218: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: astore 15
    //   223: aload 15
    //   225: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   228: astore 15
    //   230: aconst_null
    //   231: astore 10
    //   233: aload_0
    //   234: aload 15
    //   236: aconst_null
    //   237: aconst_null
    //   238: invokevirtual 429	org/sqlite/database/sqlite/SQLiteConnection:executeForLong	(Ljava/lang/String;[Ljava/lang/Object;Lorg/sqlite/os/CancellationSignal;)J
    //   241: lstore_2
    //   242: new 198	java/lang/StringBuilder
    //   245: astore 15
    //   247: aload 15
    //   249: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   252: ldc_w 604
    //   255: astore 10
    //   257: aload 15
    //   259: aload 10
    //   261: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   264: astore 15
    //   266: aload 15
    //   268: aload 14
    //   270: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: astore 15
    //   275: ldc_w 608
    //   278: astore 10
    //   280: aload 15
    //   282: aload 10
    //   284: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   287: astore 15
    //   289: aload 15
    //   291: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   294: astore 15
    //   296: aconst_null
    //   297: astore 10
    //   299: aload_0
    //   300: aload 15
    //   302: aconst_null
    //   303: aconst_null
    //   304: invokevirtual 429	org/sqlite/database/sqlite/SQLiteConnection:executeForLong	(Ljava/lang/String;[Ljava/lang/Object;Lorg/sqlite/os/CancellationSignal;)J
    //   307: lstore 18
    //   309: lload_2
    //   310: lstore 20
    //   312: new 198	java/lang/StringBuilder
    //   315: astore 9
    //   317: aload 9
    //   319: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   322: ldc_w 610
    //   325: astore 12
    //   327: aload 9
    //   329: aload 12
    //   331: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: astore 9
    //   336: aload 9
    //   338: aload 14
    //   340: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: astore 9
    //   345: aload 9
    //   347: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   350: astore 15
    //   352: aload 17
    //   354: invokevirtual 613	java/lang/String:isEmpty	()Z
    //   357: istore 16
    //   359: iload 16
    //   361: ifne +52 -> 413
    //   364: new 198	java/lang/StringBuilder
    //   367: astore 9
    //   369: aload 9
    //   371: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   374: aload 9
    //   376: aload 15
    //   378: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: astore 9
    //   383: ldc_w 615
    //   386: astore 12
    //   388: aload 9
    //   390: aload 12
    //   392: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: astore 9
    //   397: aload 9
    //   399: aload 17
    //   401: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   404: astore 9
    //   406: aload 9
    //   408: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   411: astore 15
    //   413: new 317	org/sqlite/database/sqlite/SQLiteDebug$DbStats
    //   416: astore 14
    //   418: aconst_null
    //   419: astore 17
    //   421: aload 14
    //   423: aload 15
    //   425: lload 20
    //   427: lload 18
    //   429: iconst_0
    //   430: iconst_0
    //   431: iconst_0
    //   432: iconst_0
    //   433: invokespecial 330	org/sqlite/database/sqlite/SQLiteDebug$DbStats:<init>	(Ljava/lang/String;JJIIII)V
    //   436: aload_1
    //   437: aload 14
    //   439: invokevirtual 584	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   442: pop
    //   443: iload 13
    //   445: iconst_1
    //   446: iadd
    //   447: istore 16
    //   449: iload 16
    //   451: istore 13
    //   453: goto -324 -> 129
    //   456: astore 15
    //   458: lload_2
    //   459: lstore 20
    //   461: goto -149 -> 312
    //   464: astore 9
    //   466: aload 11
    //   468: invokevirtual 616	android/database/CursorWindow:close	()V
    //   471: aload 9
    //   473: athrow
    //   474: astore 9
    //   476: aload 11
    //   478: invokevirtual 616	android/database/CursorWindow:close	()V
    //   481: return
    //   482: astore 9
    //   484: goto -431 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	487	0	this	SQLiteConnection
    //   0	487	1	paramArrayList	ArrayList
    //   4	455	2	l1	long
    //   9	49	4	i	int
    //   12	48	5	l2	long
    //   15	47	7	l3	long
    //   20	387	9	localObject1	Object
    //   464	8	9	localObject2	Object
    //   474	1	9	localSQLiteException1	SQLiteException
    //   482	1	9	localSQLiteException2	SQLiteException
    //   23	275	10	str1	String
    //   78	399	11	localCursorWindow	CursorWindow
    //   91	300	12	str2	String
    //   94	358	13	j	int
    //   97	341	14	localObject3	Object
    //   100	324	15	localObject4	Object
    //   456	1	15	localSQLiteException3	SQLiteException
    //   123	42	16	k	int
    //   357	3	16	bool	boolean
    //   447	3	16	m	int
    //   169	251	17	str3	String
    //   174	254	18	l4	long
    //   310	150	20	l5	long
    // Exception table:
    //   from	to	target	type
    //   176	179	456	org/sqlite/database/sqlite/SQLiteException
    //   181	186	456	org/sqlite/database/sqlite/SQLiteException
    //   193	198	456	org/sqlite/database/sqlite/SQLiteException
    //   202	207	456	org/sqlite/database/sqlite/SQLiteException
    //   216	221	456	org/sqlite/database/sqlite/SQLiteException
    //   223	228	456	org/sqlite/database/sqlite/SQLiteException
    //   237	241	456	org/sqlite/database/sqlite/SQLiteException
    //   242	245	456	org/sqlite/database/sqlite/SQLiteException
    //   247	252	456	org/sqlite/database/sqlite/SQLiteException
    //   259	264	456	org/sqlite/database/sqlite/SQLiteException
    //   268	273	456	org/sqlite/database/sqlite/SQLiteException
    //   282	287	456	org/sqlite/database/sqlite/SQLiteException
    //   289	294	456	org/sqlite/database/sqlite/SQLiteException
    //   303	307	456	org/sqlite/database/sqlite/SQLiteException
    //   117	122	464	finally
    //   129	134	464	finally
    //   150	155	464	finally
    //   164	169	464	finally
    //   176	179	464	finally
    //   181	186	464	finally
    //   193	198	464	finally
    //   202	207	464	finally
    //   216	221	464	finally
    //   223	228	464	finally
    //   237	241	464	finally
    //   242	245	464	finally
    //   247	252	464	finally
    //   259	264	464	finally
    //   268	273	464	finally
    //   282	287	464	finally
    //   289	294	464	finally
    //   303	307	464	finally
    //   312	315	464	finally
    //   317	322	464	finally
    //   329	334	464	finally
    //   338	343	464	finally
    //   345	350	464	finally
    //   352	357	464	finally
    //   364	367	464	finally
    //   369	374	464	finally
    //   376	381	464	finally
    //   390	395	464	finally
    //   399	404	464	finally
    //   406	411	464	finally
    //   413	416	464	finally
    //   432	436	464	finally
    //   437	443	464	finally
    //   117	122	474	org/sqlite/database/sqlite/SQLiteException
    //   129	134	474	org/sqlite/database/sqlite/SQLiteException
    //   150	155	474	org/sqlite/database/sqlite/SQLiteException
    //   164	169	474	org/sqlite/database/sqlite/SQLiteException
    //   312	315	474	org/sqlite/database/sqlite/SQLiteException
    //   317	322	474	org/sqlite/database/sqlite/SQLiteException
    //   329	334	474	org/sqlite/database/sqlite/SQLiteException
    //   338	343	474	org/sqlite/database/sqlite/SQLiteException
    //   345	350	474	org/sqlite/database/sqlite/SQLiteException
    //   352	357	474	org/sqlite/database/sqlite/SQLiteException
    //   364	367	474	org/sqlite/database/sqlite/SQLiteException
    //   369	374	474	org/sqlite/database/sqlite/SQLiteException
    //   376	381	474	org/sqlite/database/sqlite/SQLiteException
    //   390	395	474	org/sqlite/database/sqlite/SQLiteException
    //   399	404	474	org/sqlite/database/sqlite/SQLiteException
    //   406	411	474	org/sqlite/database/sqlite/SQLiteException
    //   413	416	474	org/sqlite/database/sqlite/SQLiteException
    //   432	436	474	org/sqlite/database/sqlite/SQLiteException
    //   437	443	474	org/sqlite/database/sqlite/SQLiteException
    //   29	33	482	org/sqlite/database/sqlite/SQLiteException
    //   47	51	482	org/sqlite/database/sqlite/SQLiteException
  }
  
  void collectDbStatsUnsafe(ArrayList paramArrayList)
  {
    long l = 0L;
    Object localObject = this;
    localObject = getMainDbStatsUnsafe(0, l, l);
    paramArrayList.add(localObject);
  }
  
  String describeCurrentOperationUnsafe()
  {
    return this.mRecentOperations.describeCurrentOperation();
  }
  
  public void dump(Printer paramPrinter, boolean paramBoolean)
  {
    dumpUnsafe(paramPrinter, paramBoolean);
  }
  
  void dumpUnsafe(Printer paramPrinter, boolean paramBoolean)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Connection #");
    int i = this.mConnectionId;
    localObject = ((StringBuilder)localObject).append(i);
    String str = ":";
    localObject = str;
    paramPrinter.println((String)localObject);
    if (paramBoolean)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("  connectionPtr: 0x");
      long l = this.mConnectionPtr;
      str = Long.toHexString(l);
      localObject = str;
      paramPrinter.println((String)localObject);
    }
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("  isPrimaryConnection: ");
    boolean bool = this.mIsPrimaryConnection;
    localObject = bool;
    paramPrinter.println((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = "  onlyAllowReadOnlyOperations: ";
    localObject = ((StringBuilder)localObject).append(str);
    bool = this.mOnlyAllowReadOnlyOperations;
    localObject = bool;
    paramPrinter.println((String)localObject);
    localObject = this.mRecentOperations;
    ((SQLiteConnection.OperationLog)localObject).dump(paramPrinter, paramBoolean);
    if (paramBoolean)
    {
      localObject = this.mPreparedStatementCache;
      ((SQLiteConnection.PreparedStatementCache)localObject).dump(paramPrinter);
    }
  }
  
  public void enableLocalizedCollators()
  {
    boolean bool = nativeHasCodec();
    if (bool) {
      setLocaleFromConfiguration();
    }
  }
  
  /* Error */
  public void execute(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +19 -> 20
    //   4: new 655	java/lang/IllegalArgumentException
    //   7: astore 4
    //   9: aload 4
    //   11: ldc_w 657
    //   14: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: athrow
    //   20: aload_0
    //   21: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   24: astore 4
    //   26: ldc_w 659
    //   29: astore 5
    //   31: aload 4
    //   33: aload 5
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 294	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    //   40: istore 6
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial 663	org/sqlite/database/sqlite/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
    //   47: astore 7
    //   49: aload_0
    //   50: aload 7
    //   52: invokespecial 666	org/sqlite/database/sqlite/SQLiteConnection:throwIfStatementForbidden	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   55: aload_0
    //   56: aload 7
    //   58: aload_2
    //   59: invokespecial 670	org/sqlite/database/sqlite/SQLiteConnection:bindArguments	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   62: aload_0
    //   63: aload 7
    //   65: invokespecial 673	org/sqlite/database/sqlite/SQLiteConnection:applyBlockGuardPolicy	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   68: aload_0
    //   69: aload_3
    //   70: invokespecial 677	org/sqlite/database/sqlite/SQLiteConnection:attachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   73: aload_0
    //   74: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   77: lstore 8
    //   79: aload 7
    //   81: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   84: lstore 10
    //   86: lload 8
    //   88: lload 10
    //   90: invokestatic 680	org/sqlite/database/sqlite/SQLiteConnection:nativeExecute	(JJ)V
    //   93: aload_0
    //   94: aload_3
    //   95: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   98: aload_0
    //   99: aload 7
    //   101: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   104: aload_0
    //   105: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   108: iload 6
    //   110: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   113: return
    //   114: astore 4
    //   116: aload_0
    //   117: aload_3
    //   118: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   121: aload 4
    //   123: athrow
    //   124: astore 4
    //   126: aload_0
    //   127: aload 7
    //   129: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   132: aload 4
    //   134: athrow
    //   135: astore 4
    //   137: aload_0
    //   138: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   141: astore 7
    //   143: aload 7
    //   145: iload 6
    //   147: aload 4
    //   149: invokevirtual 690	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   152: aload 4
    //   154: athrow
    //   155: astore 4
    //   157: aload_0
    //   158: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   161: iload 6
    //   163: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   166: aload 4
    //   168: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	169	0	this	SQLiteConnection
    //   0	169	1	paramString	String
    //   0	169	2	paramArrayOfObject	Object[]
    //   0	169	3	paramCancellationSignal	CancellationSignal
    //   7	25	4	localObject1	Object
    //   114	8	4	localObject2	Object
    //   124	9	4	localObject3	Object
    //   135	18	4	localRuntimeException	RuntimeException
    //   155	12	4	localObject4	Object
    //   29	5	5	str	String
    //   40	122	6	i	int
    //   47	97	7	localObject5	Object
    //   77	10	8	l1	long
    //   84	5	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   73	77	114	finally
    //   79	84	114	finally
    //   88	93	114	finally
    //   50	55	124	finally
    //   58	62	124	finally
    //   63	68	124	finally
    //   69	73	124	finally
    //   94	98	124	finally
    //   117	121	124	finally
    //   121	124	124	finally
    //   43	47	135	java/lang/RuntimeException
    //   99	104	135	java/lang/RuntimeException
    //   127	132	135	java/lang/RuntimeException
    //   132	135	135	java/lang/RuntimeException
    //   43	47	155	finally
    //   99	104	155	finally
    //   127	132	155	finally
    //   132	135	155	finally
    //   137	141	155	finally
    //   147	152	155	finally
    //   152	155	155	finally
  }
  
  /* Error */
  public android.os.ParcelFileDescriptor executeForBlobFileDescriptor(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +19 -> 20
    //   4: new 655	java/lang/IllegalArgumentException
    //   7: astore 4
    //   9: aload 4
    //   11: ldc_w 657
    //   14: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: athrow
    //   20: aload_0
    //   21: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   24: astore 4
    //   26: ldc_w 692
    //   29: astore 5
    //   31: aload 4
    //   33: aload 5
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 294	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    //   40: istore 6
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial 663	org/sqlite/database/sqlite/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
    //   47: astore 7
    //   49: aload_0
    //   50: aload 7
    //   52: invokespecial 666	org/sqlite/database/sqlite/SQLiteConnection:throwIfStatementForbidden	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   55: aload_0
    //   56: aload 7
    //   58: aload_2
    //   59: invokespecial 670	org/sqlite/database/sqlite/SQLiteConnection:bindArguments	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   62: aload_0
    //   63: aload 7
    //   65: invokespecial 673	org/sqlite/database/sqlite/SQLiteConnection:applyBlockGuardPolicy	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   68: aload_0
    //   69: aload_3
    //   70: invokespecial 677	org/sqlite/database/sqlite/SQLiteConnection:attachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   73: aload_0
    //   74: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   77: lstore 8
    //   79: aload 7
    //   81: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   84: lstore 10
    //   86: lload 8
    //   88: lload 10
    //   90: invokestatic 695	org/sqlite/database/sqlite/SQLiteConnection:nativeExecuteForBlobFileDescriptor	(JJ)I
    //   93: istore 12
    //   95: iload 12
    //   97: iflt +33 -> 130
    //   100: iload 12
    //   102: invokestatic 701	android/os/ParcelFileDescriptor:adoptFd	(I)Landroid/os/ParcelFileDescriptor;
    //   105: astore 4
    //   107: aload_0
    //   108: aload_3
    //   109: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   112: aload_0
    //   113: aload 7
    //   115: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   118: aload_0
    //   119: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   122: iload 6
    //   124: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   127: aload 4
    //   129: areturn
    //   130: iconst_0
    //   131: istore 12
    //   133: aconst_null
    //   134: astore 4
    //   136: goto -29 -> 107
    //   139: astore 4
    //   141: aload_0
    //   142: aload_3
    //   143: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   146: aload 4
    //   148: athrow
    //   149: astore 4
    //   151: aload_0
    //   152: aload 7
    //   154: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   157: aload 4
    //   159: athrow
    //   160: astore 4
    //   162: aload_0
    //   163: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   166: astore 7
    //   168: aload 7
    //   170: iload 6
    //   172: aload 4
    //   174: invokevirtual 690	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   177: aload 4
    //   179: athrow
    //   180: astore 4
    //   182: aload_0
    //   183: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   186: iload 6
    //   188: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   191: aload 4
    //   193: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	SQLiteConnection
    //   0	194	1	paramString	String
    //   0	194	2	paramArrayOfObject	Object[]
    //   0	194	3	paramCancellationSignal	CancellationSignal
    //   7	128	4	localObject1	Object
    //   139	8	4	localObject2	Object
    //   149	9	4	localObject3	Object
    //   160	18	4	localRuntimeException	RuntimeException
    //   180	12	4	localObject4	Object
    //   29	5	5	str	String
    //   40	147	6	i	int
    //   47	122	7	localObject5	Object
    //   77	10	8	l1	long
    //   84	5	10	l2	long
    //   93	39	12	j	int
    // Exception table:
    //   from	to	target	type
    //   73	77	139	finally
    //   79	84	139	finally
    //   88	93	139	finally
    //   100	105	139	finally
    //   50	55	149	finally
    //   58	62	149	finally
    //   63	68	149	finally
    //   69	73	149	finally
    //   108	112	149	finally
    //   142	146	149	finally
    //   146	149	149	finally
    //   43	47	160	java/lang/RuntimeException
    //   113	118	160	java/lang/RuntimeException
    //   152	157	160	java/lang/RuntimeException
    //   157	160	160	java/lang/RuntimeException
    //   43	47	180	finally
    //   113	118	180	finally
    //   152	157	180	finally
    //   157	160	180	finally
    //   162	166	180	finally
    //   172	177	180	finally
    //   177	180	180	finally
  }
  
  /* Error */
  public int executeForChangedRowCount(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +19 -> 20
    //   4: new 655	java/lang/IllegalArgumentException
    //   7: astore 4
    //   9: aload 4
    //   11: ldc_w 657
    //   14: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: athrow
    //   20: iconst_0
    //   21: istore 5
    //   23: aconst_null
    //   24: astore 6
    //   26: aload_0
    //   27: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   30: astore 4
    //   32: ldc_w 703
    //   35: astore 7
    //   37: aload 4
    //   39: aload 7
    //   41: aload_1
    //   42: aload_2
    //   43: invokevirtual 294	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    //   46: istore 8
    //   48: aload_0
    //   49: aload_1
    //   50: invokespecial 663	org/sqlite/database/sqlite/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
    //   53: astore 9
    //   55: aload_0
    //   56: aload 9
    //   58: invokespecial 666	org/sqlite/database/sqlite/SQLiteConnection:throwIfStatementForbidden	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   61: aload_0
    //   62: aload 9
    //   64: aload_2
    //   65: invokespecial 670	org/sqlite/database/sqlite/SQLiteConnection:bindArguments	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   68: aload_0
    //   69: aload 9
    //   71: invokespecial 673	org/sqlite/database/sqlite/SQLiteConnection:applyBlockGuardPolicy	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   74: aload_0
    //   75: aload_3
    //   76: invokespecial 677	org/sqlite/database/sqlite/SQLiteConnection:attachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   79: aload_0
    //   80: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   83: lstore 10
    //   85: aload 9
    //   87: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   90: lstore 12
    //   92: lload 10
    //   94: lload 12
    //   96: invokestatic 706	org/sqlite/database/sqlite/SQLiteConnection:nativeExecuteForChangedRowCount	(JJ)I
    //   99: istore 5
    //   101: aload_0
    //   102: aload_3
    //   103: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   106: aload_0
    //   107: aload 9
    //   109: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   112: aload_0
    //   113: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   116: astore 4
    //   118: aload 4
    //   120: iload 8
    //   122: invokevirtual 709	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperationDeferLog	(I)Z
    //   125: istore 14
    //   127: iload 14
    //   129: ifeq +50 -> 179
    //   132: aload_0
    //   133: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   136: astore 4
    //   138: new 198	java/lang/StringBuilder
    //   141: astore 9
    //   143: aload 9
    //   145: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   148: ldc_w 711
    //   151: astore 15
    //   153: aload 9
    //   155: aload 15
    //   157: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: iload 5
    //   162: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   165: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: astore 9
    //   170: aload 4
    //   172: iload 8
    //   174: aload 9
    //   176: invokevirtual 715	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   179: iload 5
    //   181: ireturn
    //   182: astore 4
    //   184: aload_0
    //   185: aload_3
    //   186: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   189: aload 4
    //   191: athrow
    //   192: astore 4
    //   194: aload_0
    //   195: aload 9
    //   197: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   200: aload 4
    //   202: athrow
    //   203: astore 4
    //   205: aload_0
    //   206: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   209: astore 9
    //   211: aload 9
    //   213: iload 8
    //   215: aload 4
    //   217: invokevirtual 690	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   220: aload 4
    //   222: athrow
    //   223: astore 4
    //   225: aload_0
    //   226: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   229: astore 9
    //   231: aload 9
    //   233: iload 8
    //   235: invokevirtual 709	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperationDeferLog	(I)Z
    //   238: istore 16
    //   240: iload 16
    //   242: ifeq +54 -> 296
    //   245: aload_0
    //   246: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   249: astore 9
    //   251: new 198	java/lang/StringBuilder
    //   254: astore 15
    //   256: aload 15
    //   258: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   261: ldc_w 711
    //   264: astore 17
    //   266: aload 15
    //   268: aload 17
    //   270: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: astore 15
    //   275: aload 15
    //   277: iload 5
    //   279: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   282: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   285: astore 6
    //   287: aload 9
    //   289: iload 8
    //   291: aload 6
    //   293: invokevirtual 715	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   296: aload 4
    //   298: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	299	0	this	SQLiteConnection
    //   0	299	1	paramString	String
    //   0	299	2	paramArrayOfObject	Object[]
    //   0	299	3	paramCancellationSignal	CancellationSignal
    //   7	164	4	localObject1	Object
    //   182	8	4	localObject2	Object
    //   192	9	4	localObject3	Object
    //   203	18	4	localRuntimeException	RuntimeException
    //   223	74	4	localObject4	Object
    //   21	257	5	i	int
    //   24	268	6	str1	String
    //   35	5	7	str2	String
    //   46	244	8	j	int
    //   53	235	9	localObject5	Object
    //   83	10	10	l1	long
    //   90	5	12	l2	long
    //   125	3	14	bool1	boolean
    //   151	125	15	localObject6	Object
    //   238	3	16	bool2	boolean
    //   264	5	17	str3	String
    // Exception table:
    //   from	to	target	type
    //   79	83	182	finally
    //   85	90	182	finally
    //   94	99	182	finally
    //   56	61	192	finally
    //   64	68	192	finally
    //   69	74	192	finally
    //   75	79	192	finally
    //   102	106	192	finally
    //   185	189	192	finally
    //   189	192	192	finally
    //   49	53	203	java/lang/RuntimeException
    //   107	112	203	java/lang/RuntimeException
    //   195	200	203	java/lang/RuntimeException
    //   200	203	203	java/lang/RuntimeException
    //   49	53	223	finally
    //   107	112	223	finally
    //   195	200	223	finally
    //   200	203	223	finally
    //   205	209	223	finally
    //   215	220	223	finally
    //   220	223	223	finally
  }
  
  /* Error */
  public int executeForCursorWindow(String paramString, Object[] paramArrayOfObject, CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +19 -> 20
    //   4: new 655	java/lang/IllegalArgumentException
    //   7: astore 8
    //   9: aload 8
    //   11: ldc_w 657
    //   14: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   17: aload 8
    //   19: athrow
    //   20: aload_3
    //   21: ifnonnull +19 -> 40
    //   24: new 655	java/lang/IllegalArgumentException
    //   27: astore 8
    //   29: aload 8
    //   31: ldc_w 717
    //   34: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   37: aload 8
    //   39: athrow
    //   40: aload_3
    //   41: invokevirtual 720	android/database/CursorWindow:acquireReference	()V
    //   44: iconst_m1
    //   45: istore 9
    //   47: iconst_m1
    //   48: istore 10
    //   50: iconst_m1
    //   51: istore 11
    //   53: aload_0
    //   54: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   57: astore 8
    //   59: ldc_w 721
    //   62: astore 12
    //   64: aload 8
    //   66: aload 12
    //   68: aload_1
    //   69: aload_2
    //   70: invokevirtual 294	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    //   73: istore 13
    //   75: aload_0
    //   76: aload_1
    //   77: invokespecial 663	org/sqlite/database/sqlite/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
    //   80: astore 14
    //   82: aload_0
    //   83: aload 14
    //   85: invokespecial 666	org/sqlite/database/sqlite/SQLiteConnection:throwIfStatementForbidden	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   88: aload_0
    //   89: aload 14
    //   91: aload_2
    //   92: invokespecial 670	org/sqlite/database/sqlite/SQLiteConnection:bindArguments	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   95: aload_0
    //   96: aload 14
    //   98: invokespecial 673	org/sqlite/database/sqlite/SQLiteConnection:applyBlockGuardPolicy	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   101: aload_0
    //   102: aload 7
    //   104: invokespecial 677	org/sqlite/database/sqlite/SQLiteConnection:attachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   107: aload_0
    //   108: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   111: lstore 15
    //   113: aload 14
    //   115: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   118: lstore 17
    //   120: aload_3
    //   121: astore 19
    //   123: lload 15
    //   125: lload 17
    //   127: aload_3
    //   128: iload 4
    //   130: iload 5
    //   132: iload 6
    //   134: invokestatic 725	org/sqlite/database/sqlite/SQLiteConnection:nativeExecuteForCursorWindow	(JJLandroid/database/CursorWindow;IIZ)J
    //   137: lstore 15
    //   139: lload 15
    //   141: bipush 32
    //   143: lshr
    //   144: lstore 17
    //   146: lload 17
    //   148: l2i
    //   149: istore 20
    //   151: lload 15
    //   153: l2i
    //   154: istore 21
    //   156: aload_3
    //   157: invokevirtual 598	android/database/CursorWindow:getNumRows	()I
    //   160: istore 22
    //   162: aload_3
    //   163: iload 20
    //   165: invokevirtual 729	android/database/CursorWindow:setStartPosition	(I)V
    //   168: aload_0
    //   169: aload 7
    //   171: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   174: aload_0
    //   175: aload 14
    //   177: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   180: aload_0
    //   181: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   184: astore 8
    //   186: aload 8
    //   188: iload 13
    //   190: invokevirtual 709	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperationDeferLog	(I)Z
    //   193: istore 23
    //   195: iload 23
    //   197: ifeq +149 -> 346
    //   200: aload_0
    //   201: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   204: astore 8
    //   206: new 198	java/lang/StringBuilder
    //   209: astore 19
    //   211: aload 19
    //   213: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   216: ldc_w 731
    //   219: astore 24
    //   221: aload 19
    //   223: aload 24
    //   225: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: astore 19
    //   230: aload 19
    //   232: aload_3
    //   233: invokevirtual 734	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   236: astore 19
    //   238: ldc_w 736
    //   241: astore 24
    //   243: aload 19
    //   245: aload 24
    //   247: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   250: astore 19
    //   252: aload 19
    //   254: iload 4
    //   256: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   259: astore 19
    //   261: ldc_w 738
    //   264: astore 24
    //   266: aload 19
    //   268: aload 24
    //   270: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   273: astore 19
    //   275: aload 19
    //   277: iload 20
    //   279: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   282: astore 25
    //   284: ldc_w 740
    //   287: astore 19
    //   289: aload 25
    //   291: aload 19
    //   293: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: astore 25
    //   298: aload 25
    //   300: iload 22
    //   302: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   305: astore 12
    //   307: ldc_w 742
    //   310: astore 25
    //   312: aload 12
    //   314: aload 25
    //   316: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: astore 12
    //   321: aload 12
    //   323: iload 21
    //   325: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   328: astore 12
    //   330: aload 12
    //   332: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   335: astore 12
    //   337: aload 8
    //   339: iload 13
    //   341: aload 12
    //   343: invokevirtual 715	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   346: aload_3
    //   347: invokevirtual 745	android/database/CursorWindow:releaseReference	()V
    //   350: iload 21
    //   352: ireturn
    //   353: astore 8
    //   355: iload 11
    //   357: istore 22
    //   359: iload 10
    //   361: istore 21
    //   363: iload 9
    //   365: istore 20
    //   367: aload_0
    //   368: aload 7
    //   370: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   373: aload 8
    //   375: athrow
    //   376: astore 8
    //   378: iload 22
    //   380: istore 11
    //   382: iload 21
    //   384: istore 10
    //   386: iload 20
    //   388: istore 9
    //   390: aload_0
    //   391: aload 14
    //   393: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   396: aload 8
    //   398: athrow
    //   399: astore 8
    //   401: aload_0
    //   402: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   405: astore 12
    //   407: aload 12
    //   409: iload 13
    //   411: aload 8
    //   413: invokevirtual 690	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   416: aload 8
    //   418: athrow
    //   419: astore 8
    //   421: aload_0
    //   422: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   425: astore 12
    //   427: aload 12
    //   429: iload 13
    //   431: invokevirtual 709	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperationDeferLog	(I)Z
    //   434: istore 22
    //   436: iload 22
    //   438: ifeq +149 -> 587
    //   441: aload_0
    //   442: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   445: astore 12
    //   447: new 198	java/lang/StringBuilder
    //   450: astore 26
    //   452: aload 26
    //   454: invokespecial 199	java/lang/StringBuilder:<init>	()V
    //   457: ldc_w 731
    //   460: astore 25
    //   462: aload 26
    //   464: aload 25
    //   466: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   469: astore 26
    //   471: aload 26
    //   473: aload_3
    //   474: invokevirtual 734	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   477: astore 26
    //   479: ldc_w 736
    //   482: astore 25
    //   484: aload 26
    //   486: aload 25
    //   488: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   491: astore 26
    //   493: aload 26
    //   495: iload 4
    //   497: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   500: astore 26
    //   502: ldc_w 738
    //   505: astore 25
    //   507: aload 26
    //   509: aload 25
    //   511: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   514: astore 26
    //   516: aload 26
    //   518: iload 9
    //   520: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   523: astore 26
    //   525: ldc_w 740
    //   528: astore 25
    //   530: aload 26
    //   532: aload 25
    //   534: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   537: astore 26
    //   539: aload 26
    //   541: iload 11
    //   543: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   546: astore 26
    //   548: ldc_w 742
    //   551: astore 25
    //   553: aload 26
    //   555: aload 25
    //   557: invokevirtual 205	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   560: astore 26
    //   562: aload 26
    //   564: iload 10
    //   566: invokevirtual 208	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   569: astore 26
    //   571: aload 26
    //   573: invokevirtual 216	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   576: astore 26
    //   578: aload 12
    //   580: iload 13
    //   582: aload 26
    //   584: invokevirtual 715	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:logOperation	(ILjava/lang/String;)V
    //   587: aload 8
    //   589: athrow
    //   590: astore 8
    //   592: aload_3
    //   593: invokevirtual 745	android/database/CursorWindow:releaseReference	()V
    //   596: aload 8
    //   598: athrow
    //   599: astore 8
    //   601: iload 22
    //   603: istore 11
    //   605: iload 21
    //   607: istore 10
    //   609: iload 20
    //   611: istore 9
    //   613: goto -192 -> 421
    //   616: astore 8
    //   618: iload 22
    //   620: istore 11
    //   622: iload 21
    //   624: istore 10
    //   626: iload 20
    //   628: istore 9
    //   630: goto -229 -> 401
    //   633: astore 8
    //   635: goto -245 -> 390
    //   638: astore 8
    //   640: iload 11
    //   642: istore 22
    //   644: goto -277 -> 367
    //   647: astore 8
    //   649: goto -282 -> 367
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	652	0	this	SQLiteConnection
    //   0	652	1	paramString	String
    //   0	652	2	paramArrayOfObject	Object[]
    //   0	652	3	paramCursorWindow	CursorWindow
    //   0	652	4	paramInt1	int
    //   0	652	5	paramInt2	int
    //   0	652	6	paramBoolean	boolean
    //   0	652	7	paramCancellationSignal	CancellationSignal
    //   7	331	8	localObject1	Object
    //   353	21	8	localObject2	Object
    //   376	21	8	localObject3	Object
    //   399	18	8	localRuntimeException1	RuntimeException
    //   419	169	8	localObject4	Object
    //   590	7	8	localObject5	Object
    //   599	1	8	localObject6	Object
    //   616	1	8	localRuntimeException2	RuntimeException
    //   633	1	8	localObject7	Object
    //   638	1	8	localObject8	Object
    //   647	1	8	localObject9	Object
    //   45	584	9	i	int
    //   48	577	10	j	int
    //   51	590	11	k	int
    //   62	517	12	localObject10	Object
    //   73	508	13	m	int
    //   80	312	14	localPreparedStatement	SQLiteConnection.PreparedStatement
    //   111	41	15	l1	long
    //   118	29	17	l2	long
    //   121	171	19	localObject11	Object
    //   149	478	20	n	int
    //   154	469	21	i1	int
    //   160	219	22	i2	int
    //   434	209	22	i3	int
    //   193	3	23	bool	boolean
    //   219	50	24	str	String
    //   282	274	25	localObject12	Object
    //   450	133	26	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   107	111	353	finally
    //   113	118	353	finally
    //   132	137	353	finally
    //   169	174	376	finally
    //   368	373	376	finally
    //   373	376	376	finally
    //   76	80	399	java/lang/RuntimeException
    //   391	396	399	java/lang/RuntimeException
    //   396	399	399	java/lang/RuntimeException
    //   76	80	419	finally
    //   391	396	419	finally
    //   396	399	419	finally
    //   401	405	419	finally
    //   411	416	419	finally
    //   416	419	419	finally
    //   53	57	590	finally
    //   69	73	590	finally
    //   180	184	590	finally
    //   188	193	590	finally
    //   200	204	590	finally
    //   206	209	590	finally
    //   211	216	590	finally
    //   223	228	590	finally
    //   232	236	590	finally
    //   245	250	590	finally
    //   254	259	590	finally
    //   268	273	590	finally
    //   277	282	590	finally
    //   291	296	590	finally
    //   300	305	590	finally
    //   314	319	590	finally
    //   323	328	590	finally
    //   330	335	590	finally
    //   341	346	590	finally
    //   421	425	590	finally
    //   429	434	590	finally
    //   441	445	590	finally
    //   447	450	590	finally
    //   452	457	590	finally
    //   464	469	590	finally
    //   473	477	590	finally
    //   486	491	590	finally
    //   495	500	590	finally
    //   509	514	590	finally
    //   518	523	590	finally
    //   532	537	590	finally
    //   541	546	590	finally
    //   555	560	590	finally
    //   564	569	590	finally
    //   571	576	590	finally
    //   582	587	590	finally
    //   587	590	590	finally
    //   175	180	599	finally
    //   175	180	616	java/lang/RuntimeException
    //   83	88	633	finally
    //   91	95	633	finally
    //   96	101	633	finally
    //   102	107	633	finally
    //   156	160	638	finally
    //   163	168	647	finally
  }
  
  /* Error */
  public long executeForLastInsertedRowId(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +19 -> 20
    //   4: new 655	java/lang/IllegalArgumentException
    //   7: astore 4
    //   9: aload 4
    //   11: ldc_w 657
    //   14: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: athrow
    //   20: aload_0
    //   21: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   24: astore 4
    //   26: ldc_w 747
    //   29: astore 5
    //   31: aload 4
    //   33: aload 5
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 294	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    //   40: istore 6
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial 663	org/sqlite/database/sqlite/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
    //   47: astore 7
    //   49: aload_0
    //   50: aload 7
    //   52: invokespecial 666	org/sqlite/database/sqlite/SQLiteConnection:throwIfStatementForbidden	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   55: aload_0
    //   56: aload 7
    //   58: aload_2
    //   59: invokespecial 670	org/sqlite/database/sqlite/SQLiteConnection:bindArguments	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   62: aload_0
    //   63: aload 7
    //   65: invokespecial 673	org/sqlite/database/sqlite/SQLiteConnection:applyBlockGuardPolicy	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   68: aload_0
    //   69: aload_3
    //   70: invokespecial 677	org/sqlite/database/sqlite/SQLiteConnection:attachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   73: aload_0
    //   74: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   77: lstore 8
    //   79: aload 7
    //   81: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   84: lstore 10
    //   86: lload 8
    //   88: lload 10
    //   90: invokestatic 751	org/sqlite/database/sqlite/SQLiteConnection:nativeExecuteForLastInsertedRowId	(JJ)J
    //   93: lstore 8
    //   95: aload_0
    //   96: aload_3
    //   97: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   100: aload_0
    //   101: aload 7
    //   103: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   106: aload_0
    //   107: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   110: iload 6
    //   112: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   115: lload 8
    //   117: lreturn
    //   118: astore 4
    //   120: aload_0
    //   121: aload_3
    //   122: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   125: aload 4
    //   127: athrow
    //   128: astore 4
    //   130: aload_0
    //   131: aload 7
    //   133: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   136: aload 4
    //   138: athrow
    //   139: astore 4
    //   141: aload_0
    //   142: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   145: astore 7
    //   147: aload 7
    //   149: iload 6
    //   151: aload 4
    //   153: invokevirtual 690	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   156: aload 4
    //   158: athrow
    //   159: astore 4
    //   161: aload_0
    //   162: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   165: iload 6
    //   167: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   170: aload 4
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	SQLiteConnection
    //   0	173	1	paramString	String
    //   0	173	2	paramArrayOfObject	Object[]
    //   0	173	3	paramCancellationSignal	CancellationSignal
    //   7	25	4	localObject1	Object
    //   118	8	4	localObject2	Object
    //   128	9	4	localObject3	Object
    //   139	18	4	localRuntimeException	RuntimeException
    //   159	12	4	localObject4	Object
    //   29	5	5	str	String
    //   40	126	6	i	int
    //   47	101	7	localObject5	Object
    //   77	39	8	l1	long
    //   84	5	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   73	77	118	finally
    //   79	84	118	finally
    //   88	93	118	finally
    //   50	55	128	finally
    //   58	62	128	finally
    //   63	68	128	finally
    //   69	73	128	finally
    //   96	100	128	finally
    //   121	125	128	finally
    //   125	128	128	finally
    //   43	47	139	java/lang/RuntimeException
    //   101	106	139	java/lang/RuntimeException
    //   131	136	139	java/lang/RuntimeException
    //   136	139	139	java/lang/RuntimeException
    //   43	47	159	finally
    //   101	106	159	finally
    //   131	136	159	finally
    //   136	139	159	finally
    //   141	145	159	finally
    //   151	156	159	finally
    //   156	159	159	finally
  }
  
  /* Error */
  public long executeForLong(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +19 -> 20
    //   4: new 655	java/lang/IllegalArgumentException
    //   7: astore 4
    //   9: aload 4
    //   11: ldc_w 657
    //   14: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: athrow
    //   20: aload_0
    //   21: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   24: astore 4
    //   26: ldc_w 752
    //   29: astore 5
    //   31: aload 4
    //   33: aload 5
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 294	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    //   40: istore 6
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial 663	org/sqlite/database/sqlite/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
    //   47: astore 7
    //   49: aload_0
    //   50: aload 7
    //   52: invokespecial 666	org/sqlite/database/sqlite/SQLiteConnection:throwIfStatementForbidden	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   55: aload_0
    //   56: aload 7
    //   58: aload_2
    //   59: invokespecial 670	org/sqlite/database/sqlite/SQLiteConnection:bindArguments	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   62: aload_0
    //   63: aload 7
    //   65: invokespecial 673	org/sqlite/database/sqlite/SQLiteConnection:applyBlockGuardPolicy	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   68: aload_0
    //   69: aload_3
    //   70: invokespecial 677	org/sqlite/database/sqlite/SQLiteConnection:attachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   73: aload_0
    //   74: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   77: lstore 8
    //   79: aload 7
    //   81: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   84: lstore 10
    //   86: lload 8
    //   88: lload 10
    //   90: invokestatic 755	org/sqlite/database/sqlite/SQLiteConnection:nativeExecuteForLong	(JJ)J
    //   93: lstore 8
    //   95: aload_0
    //   96: aload_3
    //   97: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   100: aload_0
    //   101: aload 7
    //   103: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   106: aload_0
    //   107: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   110: iload 6
    //   112: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   115: lload 8
    //   117: lreturn
    //   118: astore 4
    //   120: aload_0
    //   121: aload_3
    //   122: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   125: aload 4
    //   127: athrow
    //   128: astore 4
    //   130: aload_0
    //   131: aload 7
    //   133: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   136: aload 4
    //   138: athrow
    //   139: astore 4
    //   141: aload_0
    //   142: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   145: astore 7
    //   147: aload 7
    //   149: iload 6
    //   151: aload 4
    //   153: invokevirtual 690	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   156: aload 4
    //   158: athrow
    //   159: astore 4
    //   161: aload_0
    //   162: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   165: iload 6
    //   167: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   170: aload 4
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	SQLiteConnection
    //   0	173	1	paramString	String
    //   0	173	2	paramArrayOfObject	Object[]
    //   0	173	3	paramCancellationSignal	CancellationSignal
    //   7	25	4	localObject1	Object
    //   118	8	4	localObject2	Object
    //   128	9	4	localObject3	Object
    //   139	18	4	localRuntimeException	RuntimeException
    //   159	12	4	localObject4	Object
    //   29	5	5	str	String
    //   40	126	6	i	int
    //   47	101	7	localObject5	Object
    //   77	39	8	l1	long
    //   84	5	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   73	77	118	finally
    //   79	84	118	finally
    //   88	93	118	finally
    //   50	55	128	finally
    //   58	62	128	finally
    //   63	68	128	finally
    //   69	73	128	finally
    //   96	100	128	finally
    //   121	125	128	finally
    //   125	128	128	finally
    //   43	47	139	java/lang/RuntimeException
    //   101	106	139	java/lang/RuntimeException
    //   131	136	139	java/lang/RuntimeException
    //   136	139	139	java/lang/RuntimeException
    //   43	47	159	finally
    //   101	106	159	finally
    //   131	136	159	finally
    //   136	139	159	finally
    //   141	145	159	finally
    //   151	156	159	finally
    //   156	159	159	finally
  }
  
  /* Error */
  public String executeForString(String paramString, Object[] paramArrayOfObject, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +19 -> 20
    //   4: new 655	java/lang/IllegalArgumentException
    //   7: astore 4
    //   9: aload 4
    //   11: ldc_w 657
    //   14: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   17: aload 4
    //   19: athrow
    //   20: aload_0
    //   21: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   24: astore 4
    //   26: ldc_w 756
    //   29: astore 5
    //   31: aload 4
    //   33: aload 5
    //   35: aload_1
    //   36: aload_2
    //   37: invokevirtual 294	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    //   40: istore 6
    //   42: aload_0
    //   43: aload_1
    //   44: invokespecial 663	org/sqlite/database/sqlite/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
    //   47: astore 7
    //   49: aload_0
    //   50: aload 7
    //   52: invokespecial 666	org/sqlite/database/sqlite/SQLiteConnection:throwIfStatementForbidden	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   55: aload_0
    //   56: aload 7
    //   58: aload_2
    //   59: invokespecial 670	org/sqlite/database/sqlite/SQLiteConnection:bindArguments	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;[Ljava/lang/Object;)V
    //   62: aload_0
    //   63: aload 7
    //   65: invokespecial 673	org/sqlite/database/sqlite/SQLiteConnection:applyBlockGuardPolicy	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   68: aload_0
    //   69: aload_3
    //   70: invokespecial 677	org/sqlite/database/sqlite/SQLiteConnection:attachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   73: aload_0
    //   74: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   77: lstore 8
    //   79: aload 7
    //   81: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   84: lstore 10
    //   86: lload 8
    //   88: lload 10
    //   90: invokestatic 760	org/sqlite/database/sqlite/SQLiteConnection:nativeExecuteForString	(JJ)Ljava/lang/String;
    //   93: astore 4
    //   95: aload_0
    //   96: aload_3
    //   97: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   100: aload_0
    //   101: aload 7
    //   103: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   106: aload_0
    //   107: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   110: iload 6
    //   112: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   115: aload 4
    //   117: areturn
    //   118: astore 4
    //   120: aload_0
    //   121: aload_3
    //   122: invokespecial 683	org/sqlite/database/sqlite/SQLiteConnection:detachCancellationSignal	(Lorg/sqlite/os/CancellationSignal;)V
    //   125: aload 4
    //   127: athrow
    //   128: astore 4
    //   130: aload_0
    //   131: aload 7
    //   133: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   136: aload 4
    //   138: athrow
    //   139: astore 4
    //   141: aload_0
    //   142: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   145: astore 7
    //   147: aload 7
    //   149: iload 6
    //   151: aload 4
    //   153: invokevirtual 690	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   156: aload 4
    //   158: athrow
    //   159: astore 4
    //   161: aload_0
    //   162: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   165: iload 6
    //   167: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   170: aload 4
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	SQLiteConnection
    //   0	173	1	paramString	String
    //   0	173	2	paramArrayOfObject	Object[]
    //   0	173	3	paramCancellationSignal	CancellationSignal
    //   7	109	4	localObject1	Object
    //   118	8	4	localObject2	Object
    //   128	9	4	localObject3	Object
    //   139	18	4	localRuntimeException	RuntimeException
    //   159	12	4	localObject4	Object
    //   29	5	5	str	String
    //   40	126	6	i	int
    //   47	101	7	localObject5	Object
    //   77	10	8	l1	long
    //   84	5	10	l2	long
    // Exception table:
    //   from	to	target	type
    //   73	77	118	finally
    //   79	84	118	finally
    //   88	93	118	finally
    //   50	55	128	finally
    //   58	62	128	finally
    //   63	68	128	finally
    //   69	73	128	finally
    //   96	100	128	finally
    //   121	125	128	finally
    //   125	128	128	finally
    //   43	47	139	java/lang/RuntimeException
    //   101	106	139	java/lang/RuntimeException
    //   131	136	139	java/lang/RuntimeException
    //   136	139	139	java/lang/RuntimeException
    //   43	47	159	finally
    //   101	106	159	finally
    //   131	136	159	finally
    //   136	139	159	finally
    //   141	145	159	finally
    //   151	156	159	finally
    //   156	159	159	finally
  }
  
  protected void finalize()
  {
    try
    {
      SQLiteConnectionPool localSQLiteConnectionPool = this.mPool;
      if (localSQLiteConnectionPool != null)
      {
        long l1 = this.mConnectionPtr;
        long l2 = 0L;
        bool = l1 < l2;
        if (bool)
        {
          localSQLiteConnectionPool = this.mPool;
          localSQLiteConnectionPool.onConnectionLeaked();
        }
      }
      boolean bool = true;
      dispose(bool);
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public int getConnectionId()
  {
    return this.mConnectionId;
  }
  
  boolean isPreparedStatementInCache(String paramString)
  {
    Object localObject = this.mPreparedStatementCache.get(paramString);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public boolean isPrimaryConnection()
  {
    return this.mIsPrimaryConnection;
  }
  
  public void onCancel()
  {
    nativeCancel(this.mConnectionPtr);
  }
  
  /* Error */
  public void prepare(String paramString, SQLiteStatementInfo paramSQLiteStatementInfo)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +16 -> 17
    //   4: new 655	java/lang/IllegalArgumentException
    //   7: astore_3
    //   8: aload_3
    //   9: ldc_w 657
    //   12: invokespecial 658	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: athrow
    //   17: aload_0
    //   18: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   21: astore_3
    //   22: ldc_w 773
    //   25: astore 4
    //   27: aconst_null
    //   28: astore 5
    //   30: aload_3
    //   31: aload 4
    //   33: aload_1
    //   34: aconst_null
    //   35: invokevirtual 294	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:beginOperation	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    //   38: istore 6
    //   40: aload_0
    //   41: aload_1
    //   42: invokespecial 663	org/sqlite/database/sqlite/SQLiteConnection:acquirePreparedStatement	(Ljava/lang/String;)Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;
    //   45: astore 5
    //   47: aload_2
    //   48: ifnull +65 -> 113
    //   51: aload 5
    //   53: getfield 194	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mNumParameters	I
    //   56: istore 7
    //   58: aload_2
    //   59: iload 7
    //   61: putfield 778	org/sqlite/database/sqlite/SQLiteStatementInfo:numParameters	I
    //   64: aload 5
    //   66: getfield 348	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mReadOnly	Z
    //   69: istore 7
    //   71: aload_2
    //   72: iload 7
    //   74: putfield 781	org/sqlite/database/sqlite/SQLiteStatementInfo:readOnly	Z
    //   77: aload_0
    //   78: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   81: lstore 8
    //   83: aload 5
    //   85: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   88: lstore 10
    //   90: lload 8
    //   92: lload 10
    //   94: invokestatic 784	org/sqlite/database/sqlite/SQLiteConnection:nativeGetColumnCount	(JJ)I
    //   97: istore 12
    //   99: iload 12
    //   101: ifne +28 -> 129
    //   104: getstatic 54	org/sqlite/database/sqlite/SQLiteConnection:EMPTY_STRING_ARRAY	[Ljava/lang/String;
    //   107: astore_3
    //   108: aload_2
    //   109: aload_3
    //   110: putfield 787	org/sqlite/database/sqlite/SQLiteStatementInfo:columnNames	[Ljava/lang/String;
    //   113: aload_0
    //   114: aload 5
    //   116: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   119: aload_0
    //   120: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   123: iload 6
    //   125: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   128: return
    //   129: iload 12
    //   131: anewarray 52	java/lang/String
    //   134: astore_3
    //   135: aload_2
    //   136: aload_3
    //   137: putfield 787	org/sqlite/database/sqlite/SQLiteStatementInfo:columnNames	[Ljava/lang/String;
    //   140: iconst_0
    //   141: istore 7
    //   143: aconst_null
    //   144: astore_3
    //   145: iload 7
    //   147: iload 12
    //   149: if_icmpge -36 -> 113
    //   152: aload_2
    //   153: getfield 787	org/sqlite/database/sqlite/SQLiteStatementInfo:columnNames	[Ljava/lang/String;
    //   156: astore 13
    //   158: aload_0
    //   159: getfield 137	org/sqlite/database/sqlite/SQLiteConnection:mConnectionPtr	J
    //   162: lstore 10
    //   164: aload 5
    //   166: getfield 221	org/sqlite/database/sqlite/SQLiteConnection$PreparedStatement:mStatementPtr	J
    //   169: lstore 14
    //   171: lload 10
    //   173: lload 14
    //   175: iload 7
    //   177: invokestatic 791	org/sqlite/database/sqlite/SQLiteConnection:nativeGetColumnName	(JJI)Ljava/lang/String;
    //   180: astore 16
    //   182: aload 13
    //   184: iload 7
    //   186: aload 16
    //   188: aastore
    //   189: iload 7
    //   191: iconst_1
    //   192: iadd
    //   193: istore 7
    //   195: goto -50 -> 145
    //   198: astore_3
    //   199: aload_0
    //   200: aload 5
    //   202: invokespecial 686	org/sqlite/database/sqlite/SQLiteConnection:releasePreparedStatement	(Lorg/sqlite/database/sqlite/SQLiteConnection$PreparedStatement;)V
    //   205: aload_3
    //   206: athrow
    //   207: astore_3
    //   208: aload_0
    //   209: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   212: astore 5
    //   214: aload 5
    //   216: iload 6
    //   218: aload_3
    //   219: invokevirtual 690	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:failOperation	(ILjava/lang/Exception;)V
    //   222: aload_3
    //   223: athrow
    //   224: astore_3
    //   225: aload_0
    //   226: getfield 85	org/sqlite/database/sqlite/SQLiteConnection:mRecentOperations	Lorg/sqlite/database/sqlite/SQLiteConnection$OperationLog;
    //   229: iload 6
    //   231: invokevirtual 305	org/sqlite/database/sqlite/SQLiteConnection$OperationLog:endOperation	(I)V
    //   234: aload_3
    //   235: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	236	0	this	SQLiteConnection
    //   0	236	1	paramString	String
    //   0	236	2	paramSQLiteStatementInfo	SQLiteStatementInfo
    //   7	138	3	localObject1	Object
    //   198	8	3	localObject2	Object
    //   207	16	3	localRuntimeException	RuntimeException
    //   224	11	3	localObject3	Object
    //   25	7	4	str1	String
    //   28	187	5	localObject4	Object
    //   38	192	6	i	int
    //   56	4	7	j	int
    //   69	124	7	k	int
    //   193	1	7	m	int
    //   81	10	8	l1	long
    //   88	84	10	l2	long
    //   97	53	12	n	int
    //   156	27	13	arrayOfString	String[]
    //   169	5	14	l3	long
    //   180	7	16	str2	String
    // Exception table:
    //   from	to	target	type
    //   51	56	198	finally
    //   59	64	198	finally
    //   64	69	198	finally
    //   72	77	198	finally
    //   77	81	198	finally
    //   83	88	198	finally
    //   92	97	198	finally
    //   104	107	198	finally
    //   109	113	198	finally
    //   129	134	198	finally
    //   136	140	198	finally
    //   152	156	198	finally
    //   158	162	198	finally
    //   164	169	198	finally
    //   175	180	198	finally
    //   186	189	198	finally
    //   41	45	207	java/lang/RuntimeException
    //   114	119	207	java/lang/RuntimeException
    //   200	205	207	java/lang/RuntimeException
    //   205	207	207	java/lang/RuntimeException
    //   41	45	224	finally
    //   114	119	224	finally
    //   200	205	224	finally
    //   205	207	224	finally
    //   208	212	224	finally
    //   218	222	224	finally
    //   222	224	224	finally
  }
  
  void reconfigure(SQLiteDatabaseConfiguration paramSQLiteDatabaseConfiguration)
  {
    int i = 1;
    SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration1 = null;
    this.mOnlyAllowReadOnlyOperations = false;
    Object localObject1 = paramSQLiteDatabaseConfiguration.customFunctions;
    int j = ((ArrayList)localObject1).size();
    int k = 0;
    SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration2 = null;
    Object localObject2;
    while (k < j)
    {
      localObject1 = (SQLiteCustomFunction)paramSQLiteDatabaseConfiguration.customFunctions.get(k);
      localObject2 = this.mConfiguration.customFunctions;
      boolean bool3 = ((ArrayList)localObject2).contains(localObject1);
      if (!bool3)
      {
        long l = this.mConnectionPtr;
        nativeRegisterCustomFunction(l, (SQLiteCustomFunction)localObject1);
      }
      int n = k + 1;
      k = n;
    }
    boolean bool4 = paramSQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
    localSQLiteDatabaseConfiguration2 = this.mConfiguration;
    boolean bool2 = localSQLiteDatabaseConfiguration2.foreignKeyConstraintsEnabled;
    int m;
    if (bool4 != bool2)
    {
      bool4 = i;
      m = paramSQLiteDatabaseConfiguration.openFlags;
      Object localObject3 = this.mConfiguration;
      j = ((SQLiteDatabaseConfiguration)localObject3).openFlags;
      m ^= j;
      j = 536870912;
      m &= j;
      if (m == 0) {
        break label248;
      }
      m = i;
      label173:
      localObject3 = paramSQLiteDatabaseConfiguration.locale;
      localObject2 = this.mConfiguration.locale;
      boolean bool1 = ((Locale)localObject3).equals(localObject2);
      if (bool1) {
        break label257;
      }
    }
    for (;;)
    {
      localSQLiteDatabaseConfiguration1 = this.mConfiguration;
      localSQLiteDatabaseConfiguration1.updateParametersFrom(paramSQLiteDatabaseConfiguration);
      if (bool4) {
        setForeignKeyModeFromConfiguration();
      }
      if (m != 0) {
        setWalModeFromConfiguration();
      }
      if (i != 0) {
        setLocaleFromConfiguration();
      }
      return;
      bool4 = false;
      localObject1 = null;
      break;
      label248:
      m = 0;
      localSQLiteDatabaseConfiguration2 = null;
      break label173;
      label257:
      i = 0;
    }
  }
  
  void setOnlyAllowReadOnlyOperations(boolean paramBoolean)
  {
    this.mOnlyAllowReadOnlyOperations = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SQLiteConnection: ");
    String str = this.mConfiguration.path;
    localStringBuilder = localStringBuilder.append(str).append(" (");
    int i = this.mConnectionId;
    return i + ")";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteConnection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */