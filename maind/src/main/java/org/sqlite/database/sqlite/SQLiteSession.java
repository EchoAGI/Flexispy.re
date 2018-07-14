package org.sqlite.database.sqlite;

import android.database.CursorWindow;
import android.database.DatabaseUtils;
import android.os.ParcelFileDescriptor;
import org.sqlite.os.CancellationSignal;

public final class SQLiteSession
{
  public static final int TRANSACTION_MODE_DEFERRED = 0;
  public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
  public static final int TRANSACTION_MODE_IMMEDIATE = 1;
  private SQLiteConnection mConnection;
  private int mConnectionFlags;
  private final SQLiteConnectionPool mConnectionPool;
  private int mConnectionUseCount;
  private SQLiteSession.Transaction mTransactionPool;
  private SQLiteSession.Transaction mTransactionStack;
  
  static
  {
    Class localClass = SQLiteSession.class;
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
  
  public SQLiteSession(SQLiteConnectionPool paramSQLiteConnectionPool)
  {
    if (paramSQLiteConnectionPool == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("connectionPool must not be null");
      throw localIllegalArgumentException;
    }
    this.mConnectionPool = paramSQLiteConnectionPool;
  }
  
  private void acquireConnection(String paramString, int paramInt, CancellationSignal paramCancellationSignal)
  {
    Object localObject = this.mConnection;
    if (localObject == null)
    {
      boolean bool = $assertionsDisabled;
      if (!bool)
      {
        i = this.mConnectionUseCount;
        if (i != 0)
        {
          localObject = new java/lang/AssertionError;
          ((AssertionError)localObject).<init>();
          throw ((Throwable)localObject);
        }
      }
      localObject = this.mConnectionPool.acquireConnection(paramString, paramInt, paramCancellationSignal);
      this.mConnection = ((SQLiteConnection)localObject);
      this.mConnectionFlags = paramInt;
    }
    int i = this.mConnectionUseCount + 1;
    this.mConnectionUseCount = i;
  }
  
  /* Error */
  private void beginTransactionUnchecked(int paramInt1, SQLiteTransactionListener paramSQLiteTransactionListener, int paramInt2, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload 4
    //   5: ifnull +8 -> 13
    //   8: aload 4
    //   10: invokevirtual 65	org/sqlite/os/CancellationSignal:throwIfCanceled	()V
    //   13: aload_0
    //   14: getfield 67	org/sqlite/database/sqlite/SQLiteSession:mTransactionStack	Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   17: astore 6
    //   19: aload 6
    //   21: ifnonnull +11 -> 32
    //   24: aload_0
    //   25: aconst_null
    //   26: iload_3
    //   27: aload 4
    //   29: invokespecial 70	org/sqlite/database/sqlite/SQLiteSession:acquireConnection	(Ljava/lang/String;ILorg/sqlite/os/CancellationSignal;)V
    //   32: aload_0
    //   33: getfield 67	org/sqlite/database/sqlite/SQLiteSession:mTransactionStack	Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   36: astore 6
    //   38: aload 6
    //   40: ifnonnull +51 -> 91
    //   43: iload_1
    //   44: tableswitch	default:+24->68, 1:+100->144, 2:+146->190
    //   68: aload_0
    //   69: getfield 47	org/sqlite/database/sqlite/SQLiteSession:mConnection	Lorg/sqlite/database/sqlite/SQLiteConnection;
    //   72: astore 6
    //   74: ldc 72
    //   76: astore 5
    //   78: aconst_null
    //   79: astore 7
    //   81: aload 6
    //   83: aload 5
    //   85: aconst_null
    //   86: aload 4
    //   88: invokevirtual 78	org/sqlite/database/sqlite/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lorg/sqlite/os/CancellationSignal;)V
    //   91: aload_2
    //   92: ifnull +9 -> 101
    //   95: aload_2
    //   96: invokeinterface 83 1 0
    //   101: aload_0
    //   102: iload_1
    //   103: aload_2
    //   104: invokespecial 87	org/sqlite/database/sqlite/SQLiteSession:obtainTransaction	(ILorg/sqlite/database/sqlite/SQLiteTransactionListener;)Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   107: astore 6
    //   109: aload_0
    //   110: getfield 67	org/sqlite/database/sqlite/SQLiteSession:mTransactionStack	Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   113: astore 5
    //   115: aload 6
    //   117: aload 5
    //   119: putfield 92	org/sqlite/database/sqlite/SQLiteSession$Transaction:mParent	Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   122: aload_0
    //   123: aload 6
    //   125: putfield 67	org/sqlite/database/sqlite/SQLiteSession:mTransactionStack	Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   128: aload_0
    //   129: getfield 67	org/sqlite/database/sqlite/SQLiteSession:mTransactionStack	Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   132: astore 6
    //   134: aload 6
    //   136: ifnonnull +7 -> 143
    //   139: aload_0
    //   140: invokespecial 95	org/sqlite/database/sqlite/SQLiteSession:releaseConnection	()V
    //   143: return
    //   144: aload_0
    //   145: getfield 47	org/sqlite/database/sqlite/SQLiteSession:mConnection	Lorg/sqlite/database/sqlite/SQLiteConnection;
    //   148: astore 6
    //   150: ldc 97
    //   152: astore 5
    //   154: aconst_null
    //   155: astore 7
    //   157: aload 6
    //   159: aload 5
    //   161: aconst_null
    //   162: aload 4
    //   164: invokevirtual 78	org/sqlite/database/sqlite/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lorg/sqlite/os/CancellationSignal;)V
    //   167: goto -76 -> 91
    //   170: astore 6
    //   172: aload_0
    //   173: getfield 67	org/sqlite/database/sqlite/SQLiteSession:mTransactionStack	Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   176: astore 5
    //   178: aload 5
    //   180: ifnonnull +7 -> 187
    //   183: aload_0
    //   184: invokespecial 95	org/sqlite/database/sqlite/SQLiteSession:releaseConnection	()V
    //   187: aload 6
    //   189: athrow
    //   190: aload_0
    //   191: getfield 47	org/sqlite/database/sqlite/SQLiteSession:mConnection	Lorg/sqlite/database/sqlite/SQLiteConnection;
    //   194: astore 6
    //   196: ldc 99
    //   198: astore 5
    //   200: aconst_null
    //   201: astore 7
    //   203: aload 6
    //   205: aload 5
    //   207: aconst_null
    //   208: aload 4
    //   210: invokevirtual 78	org/sqlite/database/sqlite/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lorg/sqlite/os/CancellationSignal;)V
    //   213: goto -122 -> 91
    //   216: astore 6
    //   218: aload_0
    //   219: getfield 67	org/sqlite/database/sqlite/SQLiteSession:mTransactionStack	Lorg/sqlite/database/sqlite/SQLiteSession$Transaction;
    //   222: astore 5
    //   224: aload 5
    //   226: ifnonnull +23 -> 249
    //   229: aload_0
    //   230: getfield 47	org/sqlite/database/sqlite/SQLiteSession:mConnection	Lorg/sqlite/database/sqlite/SQLiteConnection;
    //   233: astore 5
    //   235: ldc 101
    //   237: astore 7
    //   239: aload 5
    //   241: aload 7
    //   243: aconst_null
    //   244: aload 4
    //   246: invokevirtual 78	org/sqlite/database/sqlite/SQLiteConnection:execute	(Ljava/lang/String;[Ljava/lang/Object;Lorg/sqlite/os/CancellationSignal;)V
    //   249: aload 6
    //   251: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	252	0	this	SQLiteSession
    //   0	252	1	paramInt1	int
    //   0	252	2	paramSQLiteTransactionListener	SQLiteTransactionListener
    //   0	252	3	paramInt2	int
    //   0	252	4	paramCancellationSignal	CancellationSignal
    //   1	239	5	localObject1	Object
    //   17	141	6	localObject2	Object
    //   170	18	6	localObject3	Object
    //   194	10	6	localSQLiteConnection	SQLiteConnection
    //   216	34	6	localRuntimeException	RuntimeException
    //   79	163	7	str	String
    // Exception table:
    //   from	to	target	type
    //   32	36	170	finally
    //   68	72	170	finally
    //   86	91	170	finally
    //   95	101	170	finally
    //   103	107	170	finally
    //   109	113	170	finally
    //   117	122	170	finally
    //   123	128	170	finally
    //   144	148	170	finally
    //   162	167	170	finally
    //   190	194	170	finally
    //   208	213	170	finally
    //   218	222	170	finally
    //   229	233	170	finally
    //   244	249	170	finally
    //   249	252	170	finally
    //   95	101	216	java/lang/RuntimeException
  }
  
  private void endTransactionUnchecked(CancellationSignal paramCancellationSignal, boolean paramBoolean)
  {
    boolean bool1 = true;
    float f = Float.MIN_VALUE;
    int i = 0;
    Object localObject1 = null;
    SQLiteSession.Transaction localTransaction1 = null;
    if (paramCancellationSignal != null) {
      paramCancellationSignal.throwIfCanceled();
    }
    SQLiteSession.Transaction localTransaction2 = this.mTransactionStack;
    boolean bool2 = localTransaction2.mMarkedSuccessful;
    SQLiteTransactionListener localSQLiteTransactionListener;
    if ((bool2) || (paramBoolean))
    {
      bool2 = localTransaction2.mChildFailed;
      if (!bool2)
      {
        bool2 = bool1;
        localSQLiteTransactionListener = localTransaction2.mListener;
        if (localSQLiteTransactionListener == null) {
          break label242;
        }
        if (!bool2) {
          break label158;
        }
      }
    }
    for (;;)
    {
      try
      {
        localSQLiteTransactionListener.onCommit();
        i = bool2;
        bool2 = false;
        localObject2 = null;
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject2;
        label158:
        continue;
        if (i == 0) {
          continue;
        }
        try
        {
          localSQLiteConnection = this.mConnection;
          localObject1 = "COMMIT;";
          localTransaction1 = null;
          localSQLiteConnection.execute((String)localObject1, null, paramCancellationSignal);
          releaseConnection();
          continue;
        }
        finally
        {
          SQLiteConnection localSQLiteConnection;
          releaseConnection();
        }
        localSQLiteConnection = this.mConnection;
        localObject1 = "ROLLBACK;";
        localTransaction1 = null;
        localSQLiteConnection.execute((String)localObject1, null, paramCancellationSignal);
        continue;
      }
      localTransaction1 = localTransaction2.mParent;
      this.mTransactionStack = localTransaction1;
      recycleTransaction(localTransaction2);
      localTransaction1 = this.mTransactionStack;
      if (localTransaction1 != null)
      {
        if (i == 0)
        {
          localObject1 = this.mTransactionStack;
          ((SQLiteSession.Transaction)localObject1).mChildFailed = bool1;
        }
        if (localObject2 == null) {
          break label241;
        }
        throw ((Throwable)localObject2);
        bool2 = false;
        localObject2 = null;
        break;
        localSQLiteTransactionListener.onRollback();
        continue;
      }
      label241:
      return;
      label242:
      i = bool2;
      bool2 = false;
      Object localObject4 = null;
    }
  }
  
  private boolean executeSpecial(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    boolean bool = true;
    if (paramCancellationSignal != null) {
      paramCancellationSignal.throwIfCanceled();
    }
    int i = DatabaseUtils.getSqlStatementType(paramString);
    switch (i)
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      return bool;
      i = 2;
      beginTransaction(i, null, paramInt, paramCancellationSignal);
      continue;
      setTransactionSuccessful();
      endTransaction(paramCancellationSignal);
      continue;
      endTransaction(paramCancellationSignal);
    }
  }
  
  private SQLiteSession.Transaction obtainTransaction(int paramInt, SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    SQLiteSession.Transaction localTransaction1 = this.mTransactionPool;
    if (localTransaction1 != null)
    {
      SQLiteSession.Transaction localTransaction2 = localTransaction1.mParent;
      this.mTransactionPool = localTransaction2;
      localTransaction1.mParent = null;
      localTransaction1.mMarkedSuccessful = false;
      localTransaction1.mChildFailed = false;
    }
    for (;;)
    {
      localTransaction1.mMode = paramInt;
      localTransaction1.mListener = paramSQLiteTransactionListener;
      return localTransaction1;
      localTransaction1 = new org/sqlite/database/sqlite/SQLiteSession$Transaction;
      localTransaction1.<init>(null);
    }
  }
  
  private void recycleTransaction(SQLiteSession.Transaction paramTransaction)
  {
    SQLiteSession.Transaction localTransaction = this.mTransactionPool;
    paramTransaction.mParent = localTransaction;
    paramTransaction.mListener = null;
    this.mTransactionPool = paramTransaction;
  }
  
  private void releaseConnection()
  {
    boolean bool = $assertionsDisabled;
    Object localObject1;
    if (!bool)
    {
      localObject1 = this.mConnection;
      if (localObject1 == null)
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    bool = $assertionsDisabled;
    if (!bool)
    {
      i = this.mConnectionUseCount;
      if (i <= 0)
      {
        localObject1 = new java/lang/AssertionError;
        ((AssertionError)localObject1).<init>();
        throw ((Throwable)localObject1);
      }
    }
    int i = this.mConnectionUseCount + -1;
    this.mConnectionUseCount = i;
    if (i == 0) {}
    try
    {
      localObject1 = this.mConnectionPool;
      SQLiteConnection localSQLiteConnection = this.mConnection;
      ((SQLiteConnectionPool)localObject1).releaseConnection(localSQLiteConnection);
      return;
    }
    finally
    {
      this.mConnection = null;
    }
  }
  
  private void throwIfNestedTransaction()
  {
    boolean bool = hasNestedTransaction();
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Cannot perform this operation because a nested transaction is in progress.");
      throw localIllegalStateException;
    }
  }
  
  private void throwIfNoTransaction()
  {
    Object localObject = this.mTransactionStack;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot perform this operation because there is no current transaction.");
      throw ((Throwable)localObject);
    }
  }
  
  private void throwIfTransactionMarkedSuccessful()
  {
    Object localObject = this.mTransactionStack;
    if (localObject != null)
    {
      localObject = this.mTransactionStack;
      boolean bool = ((SQLiteSession.Transaction)localObject).mMarkedSuccessful;
      if (bool)
      {
        localObject = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject).<init>("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        throw ((Throwable)localObject);
      }
    }
  }
  
  private boolean yieldTransactionUnchecked(long paramLong, CancellationSignal paramCancellationSignal)
  {
    boolean bool1 = true;
    if (paramCancellationSignal != null) {
      paramCancellationSignal.throwIfCanceled();
    }
    Object localObject1 = this.mConnectionPool;
    Object localObject2 = this.mConnection;
    int i = this.mConnectionFlags;
    boolean bool2 = ((SQLiteConnectionPool)localObject1).shouldYieldConnection((SQLiteConnection)localObject2, i);
    if (!bool2) {
      bool1 = false;
    }
    for (;;)
    {
      return bool1;
      localObject1 = this.mTransactionStack;
      int j = ((SQLiteSession.Transaction)localObject1).mMode;
      localObject2 = this.mTransactionStack.mListener;
      i = this.mConnectionFlags;
      endTransactionUnchecked(paramCancellationSignal, bool1);
      long l = 0L;
      boolean bool3 = paramLong < l;
      if (bool3) {}
      try
      {
        Thread.sleep(paramLong);
        beginTransactionUnchecked(j, (SQLiteTransactionListener)localObject2, i, paramCancellationSignal);
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
  }
  
  public void beginTransaction(int paramInt1, SQLiteTransactionListener paramSQLiteTransactionListener, int paramInt2, CancellationSignal paramCancellationSignal)
  {
    throwIfTransactionMarkedSuccessful();
    beginTransactionUnchecked(paramInt1, paramSQLiteTransactionListener, paramInt2, paramCancellationSignal);
  }
  
  public void endTransaction(CancellationSignal paramCancellationSignal)
  {
    throwIfNoTransaction();
    boolean bool = $assertionsDisabled;
    if (!bool)
    {
      Object localObject = this.mConnection;
      if (localObject == null)
      {
        localObject = new java/lang/AssertionError;
        ((AssertionError)localObject).<init>();
        throw ((Throwable)localObject);
      }
    }
    endTransactionUnchecked(paramCancellationSignal, false);
  }
  
  public void execute(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    Object localObject1;
    if (paramString == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("sql must not be null.");
      throw ((Throwable)localObject1);
    }
    boolean bool = executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal);
    if (bool) {}
    for (;;)
    {
      return;
      acquireConnection(paramString, paramInt, paramCancellationSignal);
      try
      {
        localObject1 = this.mConnection;
        ((SQLiteConnection)localObject1).execute(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
      }
      finally
      {
        releaseConnection();
      }
    }
  }
  
  public ParcelFileDescriptor executeForBlobFileDescriptor(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    Object localObject1;
    if (paramString == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("sql must not be null.");
      throw ((Throwable)localObject1);
    }
    boolean bool = executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal);
    if (bool)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (ParcelFileDescriptor)localObject1;
      acquireConnection(paramString, paramInt, paramCancellationSignal);
      try
      {
        localObject1 = this.mConnection;
        localObject1 = ((SQLiteConnection)localObject1).executeForBlobFileDescriptor(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
      }
      finally
      {
        releaseConnection();
      }
    }
  }
  
  public int executeForChangedRowCount(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    Object localObject1;
    if (paramString == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("sql must not be null.");
      throw ((Throwable)localObject1);
    }
    int i = executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal);
    if (i != 0)
    {
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return i;
      acquireConnection(paramString, paramInt, paramCancellationSignal);
      try
      {
        localObject1 = this.mConnection;
        int j = ((SQLiteConnection)localObject1).executeForChangedRowCount(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
      }
      finally
      {
        releaseConnection();
      }
    }
  }
  
  public int executeForCursorWindow(String paramString, Object[] paramArrayOfObject, CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, CancellationSignal paramCancellationSignal)
  {
    Object localObject1;
    if (paramString == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("sql must not be null.");
      throw ((Throwable)localObject1);
    }
    if (paramCursorWindow == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("window must not be null.");
      throw ((Throwable)localObject1);
    }
    int i = executeSpecial(paramString, paramArrayOfObject, paramInt3, paramCancellationSignal);
    if (i != 0)
    {
      paramCursorWindow.clear();
      i = 0;
      localObject1 = null;
    }
    for (;;)
    {
      return i;
      acquireConnection(paramString, paramInt3, paramCancellationSignal);
      try
      {
        localObject1 = this.mConnection;
        int j = ((SQLiteConnection)localObject1).executeForCursorWindow(paramString, paramArrayOfObject, paramCursorWindow, paramInt1, paramInt2, paramBoolean, paramCancellationSignal);
        releaseConnection();
      }
      finally
      {
        releaseConnection();
      }
    }
  }
  
  public long executeForLastInsertedRowId(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    Object localObject1;
    if (paramString == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("sql must not be null.");
      throw ((Throwable)localObject1);
    }
    boolean bool = executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal);
    long l;
    if (bool) {
      l = 0L;
    }
    for (;;)
    {
      return l;
      acquireConnection(paramString, paramInt, paramCancellationSignal);
      try
      {
        localObject1 = this.mConnection;
        l = ((SQLiteConnection)localObject1).executeForLastInsertedRowId(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
      }
      finally
      {
        releaseConnection();
      }
    }
  }
  
  public long executeForLong(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    Object localObject1;
    if (paramString == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("sql must not be null.");
      throw ((Throwable)localObject1);
    }
    boolean bool = executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal);
    long l;
    if (bool) {
      l = 0L;
    }
    for (;;)
    {
      return l;
      acquireConnection(paramString, paramInt, paramCancellationSignal);
      try
      {
        localObject1 = this.mConnection;
        l = ((SQLiteConnection)localObject1).executeForLong(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
      }
      finally
      {
        releaseConnection();
      }
    }
  }
  
  public String executeForString(String paramString, Object[] paramArrayOfObject, int paramInt, CancellationSignal paramCancellationSignal)
  {
    Object localObject1;
    if (paramString == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("sql must not be null.");
      throw ((Throwable)localObject1);
    }
    boolean bool = executeSpecial(paramString, paramArrayOfObject, paramInt, paramCancellationSignal);
    if (bool)
    {
      bool = false;
      localObject1 = null;
    }
    for (;;)
    {
      return (String)localObject1;
      acquireConnection(paramString, paramInt, paramCancellationSignal);
      try
      {
        localObject1 = this.mConnection;
        localObject1 = ((SQLiteConnection)localObject1).executeForString(paramString, paramArrayOfObject, paramCancellationSignal);
        releaseConnection();
      }
      finally
      {
        releaseConnection();
      }
    }
  }
  
  public boolean hasConnection()
  {
    SQLiteConnection localSQLiteConnection = this.mConnection;
    boolean bool;
    if (localSQLiteConnection != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localSQLiteConnection = null;
    }
  }
  
  public boolean hasNestedTransaction()
  {
    SQLiteSession.Transaction localTransaction = this.mTransactionStack;
    boolean bool;
    if (localTransaction != null)
    {
      localTransaction = this.mTransactionStack.mParent;
      if (localTransaction != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localTransaction = null;
    }
  }
  
  public boolean hasTransaction()
  {
    SQLiteSession.Transaction localTransaction = this.mTransactionStack;
    boolean bool;
    if (localTransaction != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localTransaction = null;
    }
  }
  
  public void prepare(String paramString, int paramInt, CancellationSignal paramCancellationSignal, SQLiteStatementInfo paramSQLiteStatementInfo)
  {
    Object localObject1;
    if (paramString == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("sql must not be null.");
      throw ((Throwable)localObject1);
    }
    if (paramCancellationSignal != null) {
      paramCancellationSignal.throwIfCanceled();
    }
    acquireConnection(paramString, paramInt, paramCancellationSignal);
    try
    {
      localObject1 = this.mConnection;
      ((SQLiteConnection)localObject1).prepare(paramString, paramSQLiteStatementInfo);
      return;
    }
    finally
    {
      releaseConnection();
    }
  }
  
  public void setTransactionSuccessful()
  {
    throwIfNoTransaction();
    throwIfTransactionMarkedSuccessful();
    this.mTransactionStack.mMarkedSuccessful = true;
  }
  
  public boolean yieldTransaction(long paramLong, boolean paramBoolean, CancellationSignal paramCancellationSignal)
  {
    boolean bool1 = false;
    AssertionError localAssertionError = null;
    if (paramBoolean)
    {
      throwIfNoTransaction();
      throwIfTransactionMarkedSuccessful();
      throwIfNestedTransaction();
    }
    boolean bool2;
    Object localObject;
    do
    {
      bool2 = $assertionsDisabled;
      if (bool2) {
        break label102;
      }
      localObject = this.mConnection;
      if (localObject != null) {
        break label102;
      }
      localAssertionError = new java/lang/AssertionError;
      localAssertionError.<init>();
      throw localAssertionError;
      localObject = this.mTransactionStack;
      if (localObject == null) {
        break;
      }
      localObject = this.mTransactionStack;
      bool2 = ((SQLiteSession.Transaction)localObject).mMarkedSuccessful;
      if (bool2) {
        break;
      }
      localObject = this.mTransactionStack.mParent;
    } while (localObject == null);
    for (;;)
    {
      return bool1;
      label102:
      localObject = this.mTransactionStack;
      bool2 = ((SQLiteSession.Transaction)localObject).mChildFailed;
      if (!bool2) {
        bool1 = yieldTransactionUnchecked(paramLong, paramCancellationSignal);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteSession.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */