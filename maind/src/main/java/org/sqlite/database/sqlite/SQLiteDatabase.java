package org.sqlite.database.sqlite;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.os.Looper;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.Pair;
import android.util.Printer;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.sqlite.database.DatabaseErrorHandler;
import org.sqlite.database.DefaultDatabaseErrorHandler;
import org.sqlite.database.ExtraUtils;
import org.sqlite.database.SQLException;
import org.sqlite.os.CancellationSignal;

public final class SQLiteDatabase
  extends SQLiteClosable
{
  public static final int CONFLICT_ABORT = 2;
  public static final int CONFLICT_FAIL = 3;
  public static final int CONFLICT_IGNORE = 4;
  public static final int CONFLICT_NONE = 0;
  public static final int CONFLICT_REPLACE = 5;
  public static final int CONFLICT_ROLLBACK = 1;
  private static final String[] CONFLICT_VALUES;
  public static final int CREATE_IF_NECESSARY = 268435456;
  public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
  private static final int EVENT_DB_CORRUPT = 75004;
  public static final int MAX_SQL_CACHE_SIZE = 100;
  public static final int NO_LOCALIZED_COLLATORS = 16;
  public static final int OPEN_READONLY = 1;
  public static final int OPEN_READWRITE = 0;
  private static final int OPEN_READ_MASK = 1;
  public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
  private static final String TAG = "SQLiteDatabase";
  private static WeakHashMap sActiveDatabases;
  private final CloseGuard mCloseGuardLocked;
  private final SQLiteDatabaseConfiguration mConfigurationLocked;
  private SQLiteConnectionPool mConnectionPoolLocked;
  private final SQLiteDatabase.CursorFactory mCursorFactory;
  private final DatabaseErrorHandler mErrorHandler;
  private boolean mHasAttachedDbsLocked;
  private final Object mLock;
  private final ThreadLocal mThreadSession;
  
  static
  {
    boolean bool1 = true;
    Object localObject = SQLiteDatabase.class;
    boolean bool2 = ((Class)localObject).desiredAssertionStatus();
    if (!bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      $assertionsDisabled = bool2;
      localObject = new java/util/WeakHashMap;
      ((WeakHashMap)localObject).<init>();
      sActiveDatabases = (WeakHashMap)localObject;
      localObject = new String[6];
      localObject[0] = "";
      localObject[bool1] = " OR ROLLBACK ";
      localObject[2] = " OR ABORT ";
      localObject[3] = " OR FAIL ";
      localObject[4] = " OR IGNORE ";
      localObject[5] = " OR REPLACE ";
      CONFLICT_VALUES = (String[])localObject;
      return;
      bool2 = false;
      localObject = null;
    }
  }
  
  private SQLiteDatabase(String paramString, int paramInt, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    Object localObject = new org/sqlite/database/sqlite/SQLiteDatabase$1;
    ((SQLiteDatabase.1)localObject).<init>(this);
    this.mThreadSession = ((ThreadLocal)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.mLock = localObject;
    localObject = CloseGuard.get();
    this.mCloseGuardLocked = ((CloseGuard)localObject);
    this.mCursorFactory = paramCursorFactory;
    if (paramDatabaseErrorHandler != null) {}
    for (;;)
    {
      this.mErrorHandler = paramDatabaseErrorHandler;
      localObject = new org/sqlite/database/sqlite/SQLiteDatabaseConfiguration;
      ((SQLiteDatabaseConfiguration)localObject).<init>(paramString, paramInt);
      this.mConfigurationLocked = ((SQLiteDatabaseConfiguration)localObject);
      return;
      paramDatabaseErrorHandler = new org/sqlite/database/DefaultDatabaseErrorHandler;
      paramDatabaseErrorHandler.<init>();
    }
  }
  
  /* Error */
  private void beginTransaction(SQLiteTransactionListener paramSQLiteTransactionListener, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 134	org/sqlite/database/sqlite/SQLiteDatabase:acquireReference	()V
    //   4: aload_0
    //   5: invokevirtual 138	org/sqlite/database/sqlite/SQLiteDatabase:getThreadSession	()Lorg/sqlite/database/sqlite/SQLiteSession;
    //   8: astore_3
    //   9: iload_2
    //   10: ifeq +31 -> 41
    //   13: iconst_2
    //   14: istore 4
    //   16: iconst_0
    //   17: istore 5
    //   19: aload_0
    //   20: iconst_0
    //   21: invokevirtual 142	org/sqlite/database/sqlite/SQLiteDatabase:getThreadDefaultConnectionFlags	(Z)I
    //   24: istore 5
    //   26: aload_3
    //   27: iload 4
    //   29: aload_1
    //   30: iload 5
    //   32: aconst_null
    //   33: invokevirtual 148	org/sqlite/database/sqlite/SQLiteSession:beginTransaction	(ILorg/sqlite/database/sqlite/SQLiteTransactionListener;ILorg/sqlite/os/CancellationSignal;)V
    //   36: aload_0
    //   37: invokevirtual 151	org/sqlite/database/sqlite/SQLiteDatabase:releaseReference	()V
    //   40: return
    //   41: iconst_1
    //   42: istore 4
    //   44: goto -28 -> 16
    //   47: astore 6
    //   49: aload_0
    //   50: invokevirtual 151	org/sqlite/database/sqlite/SQLiteDatabase:releaseReference	()V
    //   53: aload 6
    //   55: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	SQLiteDatabase
    //   0	56	1	paramSQLiteTransactionListener	SQLiteTransactionListener
    //   0	56	2	paramBoolean	boolean
    //   8	19	3	localSQLiteSession	SQLiteSession
    //   14	29	4	i	int
    //   17	14	5	j	int
    //   47	7	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   4	8	47	finally
    //   20	24	47	finally
    //   32	36	47	finally
  }
  
  private void collectDbStats(ArrayList paramArrayList)
  {
    synchronized (this.mLock)
    {
      SQLiteConnectionPool localSQLiteConnectionPool = this.mConnectionPoolLocked;
      if (localSQLiteConnectionPool != null)
      {
        localSQLiteConnectionPool = this.mConnectionPoolLocked;
        localSQLiteConnectionPool.collectDbStats(paramArrayList);
      }
      return;
    }
  }
  
  public static SQLiteDatabase create(SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openDatabase(":memory:", paramCursorFactory, 268435456);
  }
  
  public static boolean deleteDatabase(File paramFile)
  {
    int i = 0;
    if (paramFile == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("file must not be null");
      throw localIllegalArgumentException;
    }
    boolean bool1 = paramFile.delete() | false;
    File localFile = new java/io/File;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramFile.getPath();
    localObject1 = (String)localObject2 + "-journal";
    localFile.<init>((String)localObject1);
    boolean bool2 = localFile.delete();
    bool1 |= bool2;
    localFile = new java/io/File;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = paramFile.getPath();
    localObject1 = (String)localObject2 + "-shm";
    localFile.<init>((String)localObject1);
    bool2 = localFile.delete();
    bool1 |= bool2;
    localFile = new java/io/File;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = paramFile.getPath();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = "-wal";
    localObject1 = (String)localObject2;
    localFile.<init>((String)localObject1);
    bool2 = localFile.delete();
    bool1 |= bool2;
    localFile = paramFile.getParentFile();
    if (localFile != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = paramFile.getName();
      localObject1 = (String)localObject2 + "-mj";
      localObject2 = new org/sqlite/database/sqlite/SQLiteDatabase$2;
      ((SQLiteDatabase.2)localObject2).<init>((String)localObject1);
      localObject1 = localFile.listFiles((FileFilter)localObject2);
      int j = localObject1.length;
      while (i < j)
      {
        localFile = localObject1[i];
        bool2 = localFile.delete() | bool1;
        i += 1;
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  private void dispose(boolean paramBoolean)
  {
    Object localObject2;
    WeakHashMap localWeakHashMap;
    synchronized (this.mLock)
    {
      localObject2 = this.mCloseGuardLocked;
      if (localObject2 != null)
      {
        if (paramBoolean)
        {
          localObject2 = this.mCloseGuardLocked;
          ((CloseGuard)localObject2).warnIfOpen();
        }
        localObject2 = this.mCloseGuardLocked;
        ((CloseGuard)localObject2).close();
      }
      localObject2 = this.mConnectionPoolLocked;
      localWeakHashMap = null;
      this.mConnectionPoolLocked = null;
      if (paramBoolean) {}
    }
    synchronized (sActiveDatabases)
    {
      localWeakHashMap = sActiveDatabases;
      localWeakHashMap.remove(this);
      if (localObject2 != null) {
        ((SQLiteConnectionPool)localObject2).close();
      }
      return;
      localObject3 = finally;
      throw ((Throwable)localObject3);
    }
  }
  
  private void dump(Printer paramPrinter, boolean paramBoolean)
  {
    synchronized (this.mLock)
    {
      Object localObject2 = this.mConnectionPoolLocked;
      if (localObject2 != null)
      {
        localObject2 = "";
        paramPrinter.println((String)localObject2);
        localObject2 = this.mConnectionPoolLocked;
        ((SQLiteConnectionPool)localObject2).dump(paramPrinter, paramBoolean);
      }
      return;
    }
  }
  
  static void dumpAll(Printer paramPrinter, boolean paramBoolean)
  {
    Object localObject = getActiveDatabases();
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (SQLiteDatabase)localIterator.next();
      ((SQLiteDatabase)localObject).dump(paramPrinter, paramBoolean);
    }
  }
  
  private int executeSql(String paramString, Object[] paramArrayOfObject)
  {
    int i = 1;
    acquireReference();
    for (;;)
    {
      try
      {
        int j = DatabaseUtils.getSqlStatementType(paramString);
        int k = 3;
        if (j == k)
        {
          j = 0;
          Object localObject1 = null;
        }
        SQLiteStatement localSQLiteStatement;
        synchronized (this.mLock)
        {
          boolean bool = this.mHasAttachedDbsLocked;
          if (!bool)
          {
            j = 1;
            this.mHasAttachedDbsLocked = j;
            if (i != 0) {
              disableWriteAheadLogging();
            }
            localSQLiteStatement = new org/sqlite/database/sqlite/SQLiteStatement;
            localSQLiteStatement.<init>(this, paramString, paramArrayOfObject);
          }
        }
        i = 0;
      }
      finally
      {
        releaseReference();
      }
      Object localObject6 = null;
    }
  }
  
  public static String findEditTable(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool)
    {
      int i = paramString.indexOf(' ');
      int j = paramString.indexOf(',');
      if ((i > 0) && ((i < j) || (j < 0))) {}
      for (paramString = paramString.substring(0, i);; paramString = paramString.substring(0, j)) {
        do
        {
          return paramString;
        } while ((j <= 0) || ((j >= i) && (i >= 0)));
      }
    }
    IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
    localIllegalStateException.<init>("Invalid tables");
    throw localIllegalStateException;
  }
  
  private static ArrayList getActiveDatabases()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    synchronized (sActiveDatabases)
    {
      Object localObject2 = sActiveDatabases;
      localObject2 = ((WeakHashMap)localObject2).keySet();
      localArrayList.addAll((Collection)localObject2);
      return localArrayList;
    }
  }
  
  static ArrayList getDbStats()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = getActiveDatabases();
    Iterator localIterator = ((ArrayList)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (SQLiteDatabase)localIterator.next();
      ((SQLiteDatabase)localObject).collectDbStats(localArrayList);
    }
    return localArrayList;
  }
  
  public static boolean hasCodec()
  {
    return SQLiteConnection.hasCodec();
  }
  
  private static boolean isMainThread()
  {
    Looper localLooper1 = Looper.myLooper();
    boolean bool;
    if (localLooper1 != null)
    {
      Looper localLooper2 = Looper.getMainLooper();
      if (localLooper1 == localLooper2) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLooper1 = null;
    }
  }
  
  private boolean isReadOnlyLocked()
  {
    int i = 1;
    SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
    int j = localSQLiteDatabaseConfiguration.openFlags & 0x1;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  private void open()
  {
    try
    {
      openInner();
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      for (;;)
      {
        onCorruption();
        openInner();
      }
    }
    catch (SQLiteException localSQLiteException)
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Failed to open database '");
      String str = getLabel();
      localObject = str + "'.";
      Log.e("SQLiteDatabase", (String)localObject, localSQLiteException);
      close();
      throw localSQLiteException;
    }
  }
  
  public static SQLiteDatabase openDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt)
  {
    return openDatabase(paramString, paramCursorFactory, paramInt, null);
  }
  
  public static SQLiteDatabase openDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, int paramInt, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    SQLiteDatabase localSQLiteDatabase = new org/sqlite/database/sqlite/SQLiteDatabase;
    localSQLiteDatabase.<init>(paramString, paramInt, paramCursorFactory, paramDatabaseErrorHandler);
    localSQLiteDatabase.open();
    return localSQLiteDatabase;
  }
  
  private void openInner()
  {
    synchronized (this.mLock)
    {
      boolean bool = $assertionsDisabled;
      if (!bool)
      {
        Object localObject2 = this.mConnectionPoolLocked;
        if (localObject2 != null)
        {
          localObject2 = new java/lang/AssertionError;
          ((AssertionError)localObject2).<init>();
          throw ((Throwable)localObject2);
        }
      }
    }
    Object localObject4 = this.mConfigurationLocked;
    localObject4 = SQLiteConnectionPool.open((SQLiteDatabaseConfiguration)localObject4);
    this.mConnectionPoolLocked = ((SQLiteConnectionPool)localObject4);
    localObject4 = this.mCloseGuardLocked;
    String str = "close";
    ((CloseGuard)localObject4).open(str);
    synchronized (sActiveDatabases)
    {
      localObject4 = sActiveDatabases;
      str = null;
      ((WeakHashMap)localObject4).put(this, null);
      return;
    }
  }
  
  public static SQLiteDatabase openOrCreateDatabase(File paramFile, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openOrCreateDatabase(paramFile.getPath(), paramCursorFactory);
  }
  
  public static SQLiteDatabase openOrCreateDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory)
  {
    return openDatabase(paramString, paramCursorFactory, 268435456, null);
  }
  
  public static SQLiteDatabase openOrCreateDatabase(String paramString, SQLiteDatabase.CursorFactory paramCursorFactory, DatabaseErrorHandler paramDatabaseErrorHandler)
  {
    return openDatabase(paramString, paramCursorFactory, 268435456, paramDatabaseErrorHandler);
  }
  
  public static int releaseMemory()
  {
    return SQLiteGlobal.releaseMemory();
  }
  
  private void throwIfNotOpenLocked()
  {
    Object localObject1 = this.mConnectionPoolLocked;
    if (localObject1 == null)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("The database '");
      String str = this.mConfigurationLocked.label;
      localObject2 = str + "' is not open.";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
  
  private boolean yieldIfContendedHelper(boolean paramBoolean, long paramLong)
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getThreadSession();
      boolean bool = localSQLiteSession.yieldTransaction(paramLong, paramBoolean, null);
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public void addCustomFunction(String paramString, int paramInt, SQLiteDatabase.CustomFunction paramCustomFunction)
  {
    SQLiteCustomFunction localSQLiteCustomFunction = new org/sqlite/database/sqlite/SQLiteCustomFunction;
    localSQLiteCustomFunction.<init>(paramString, paramInt, paramCustomFunction);
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      Object localObject2 = this.mConfigurationLocked;
      localObject2 = ((SQLiteDatabaseConfiguration)localObject2).customFunctions;
      ((ArrayList)localObject2).add(localSQLiteCustomFunction);
      try
      {
        localObject2 = this.mConnectionPoolLocked;
        localObject4 = this.mConfigurationLocked;
        ((SQLiteConnectionPool)localObject2).reconfigure((SQLiteDatabaseConfiguration)localObject4);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject4 = this.mConfigurationLocked;
        localObject4 = ((SQLiteDatabaseConfiguration)localObject4).customFunctions;
        ((ArrayList)localObject4).remove(localSQLiteCustomFunction);
        throw localRuntimeException;
      }
    }
  }
  
  public void beginTransaction()
  {
    beginTransaction(null, true);
  }
  
  public void beginTransactionNonExclusive()
  {
    beginTransaction(null, false);
  }
  
  public void beginTransactionWithListener(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    beginTransaction(paramSQLiteTransactionListener, true);
  }
  
  public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener paramSQLiteTransactionListener)
  {
    beginTransaction(paramSQLiteTransactionListener, false);
  }
  
  public SQLiteStatement compileStatement(String paramString)
  {
    acquireReference();
    try
    {
      SQLiteStatement localSQLiteStatement = new org/sqlite/database/sqlite/SQLiteStatement;
      localSQLiteStatement.<init>(this, paramString, null);
      return localSQLiteStatement;
    }
    finally
    {
      releaseReference();
    }
  }
  
  SQLiteSession createSession()
  {
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      SQLiteConnectionPool localSQLiteConnectionPool = this.mConnectionPoolLocked;
      ??? = new org/sqlite/database/sqlite/SQLiteSession;
      ((SQLiteSession)???).<init>(localSQLiteConnectionPool);
      return (SQLiteSession)???;
    }
  }
  
  /* Error */
  public int delete(String paramString1, String paramString2, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 134	org/sqlite/database/sqlite/SQLiteDatabase:acquireReference	()V
    //   4: new 268	org/sqlite/database/sqlite/SQLiteStatement
    //   7: astore 4
    //   9: new 180	java/lang/StringBuilder
    //   12: astore 5
    //   14: aload 5
    //   16: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   19: ldc_w 422
    //   22: astore 6
    //   24: aload 5
    //   26: aload 6
    //   28: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: astore 5
    //   33: aload 5
    //   35: aload_1
    //   36: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: astore 6
    //   41: aload_2
    //   42: invokestatic 282	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   45: istore 7
    //   47: iload 7
    //   49: ifne +86 -> 135
    //   52: new 180	java/lang/StringBuilder
    //   55: astore 5
    //   57: aload 5
    //   59: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   62: ldc_w 424
    //   65: astore 8
    //   67: aload 5
    //   69: aload 8
    //   71: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: astore 5
    //   76: aload 5
    //   78: aload_2
    //   79: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: astore 5
    //   84: aload 5
    //   86: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: astore 5
    //   91: aload 6
    //   93: aload 5
    //   95: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: astore 5
    //   100: aload 5
    //   102: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: astore 5
    //   107: aload 4
    //   109: aload_0
    //   110: aload 5
    //   112: aload_3
    //   113: invokespecial 271	org/sqlite/database/sqlite/SQLiteStatement:<init>	(Lorg/sqlite/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V
    //   116: aload 4
    //   118: invokevirtual 275	org/sqlite/database/sqlite/SQLiteStatement:executeUpdateDelete	()I
    //   121: istore 7
    //   123: aload 4
    //   125: invokevirtual 276	org/sqlite/database/sqlite/SQLiteStatement:close	()V
    //   128: aload_0
    //   129: invokevirtual 151	org/sqlite/database/sqlite/SQLiteDatabase:releaseReference	()V
    //   132: iload 7
    //   134: ireturn
    //   135: ldc 80
    //   137: astore 5
    //   139: goto -48 -> 91
    //   142: astore 5
    //   144: aload 4
    //   146: invokevirtual 276	org/sqlite/database/sqlite/SQLiteStatement:close	()V
    //   149: aload 5
    //   151: athrow
    //   152: astore 5
    //   154: aload_0
    //   155: invokevirtual 151	org/sqlite/database/sqlite/SQLiteDatabase:releaseReference	()V
    //   158: aload 5
    //   160: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	161	0	this	SQLiteDatabase
    //   0	161	1	paramString1	String
    //   0	161	2	paramString2	String
    //   0	161	3	paramArrayOfString	String[]
    //   7	138	4	localSQLiteStatement	SQLiteStatement
    //   12	126	5	localObject1	Object
    //   142	8	5	localObject2	Object
    //   152	7	5	localObject3	Object
    //   22	70	6	localObject4	Object
    //   45	3	7	bool	boolean
    //   121	12	7	i	int
    //   65	5	8	str	String
    // Exception table:
    //   from	to	target	type
    //   116	121	142	finally
    //   4	7	152	finally
    //   9	12	152	finally
    //   14	19	152	finally
    //   26	31	152	finally
    //   35	39	152	finally
    //   41	45	152	finally
    //   52	55	152	finally
    //   57	62	152	finally
    //   69	74	152	finally
    //   78	82	152	finally
    //   84	89	152	finally
    //   93	98	152	finally
    //   100	105	152	finally
    //   112	116	152	finally
    //   123	128	152	finally
    //   144	149	152	finally
    //   149	152	152	finally
  }
  
  public void disableWriteAheadLogging()
  {
    i = 536870912;
    Object localObject2;
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      localObject2 = this.mConfigurationLocked;
      int j = ((SQLiteDatabaseConfiguration)localObject2).openFlags & i;
      if (j == 0) {
        return;
      }
      localObject2 = this.mConfigurationLocked;
      int k = ((SQLiteDatabaseConfiguration)localObject2).openFlags;
      m = -536870913;
      k &= m;
      ((SQLiteDatabaseConfiguration)localObject2).openFlags = k;
    }
  }
  
  public void enableLocalizedCollators()
  {
    this.mConnectionPoolLocked.enableLocalizedCollators();
  }
  
  public boolean enableWriteAheadLogging()
  {
    i = 536870912;
    boolean bool1 = true;
    localObject1 = null;
    Object localObject3;
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      localObject3 = this.mConfigurationLocked;
      int j = ((SQLiteDatabaseConfiguration)localObject3).openFlags & i;
      if (j != 0) {}
      for (;;)
      {
        return bool1;
        boolean bool2 = isReadOnlyLocked();
        String str;
        if (bool2)
        {
          bool1 = false;
          str = null;
        }
        else
        {
          localObject3 = this.mConfigurationLocked;
          bool2 = ((SQLiteDatabaseConfiguration)localObject3).isInMemoryDb();
          if (bool2)
          {
            str = "SQLiteDatabase";
            localObject3 = "can't enable WAL for memory databases.";
            Log.i(str, (String)localObject3);
            bool1 = false;
            str = null;
          }
          else
          {
            bool2 = this.mHasAttachedDbsLocked;
            if (!bool2) {
              break;
            }
            str = "SQLiteDatabase";
            k = 3;
            bool1 = Log.isLoggable(str, k);
            if (bool1)
            {
              str = "SQLiteDatabase";
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              Object localObject5 = "this database: ";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
              localObject5 = this.mConfigurationLocked;
              localObject5 = ((SQLiteDatabaseConfiguration)localObject5).label;
              localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
              localObject5 = " has attached databases. can't  enable WAL.";
              localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
              localObject3 = ((StringBuilder)localObject3).toString();
              Log.d(str, (String)localObject3);
            }
            bool1 = false;
            str = null;
          }
        }
      }
      localObject1 = this.mConfigurationLocked;
      k = ((SQLiteDatabaseConfiguration)localObject1).openFlags | i;
      ((SQLiteDatabaseConfiguration)localObject1).openFlags = k;
    }
  }
  
  public void endTransaction()
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getThreadSession();
      localSQLiteSession.endTransaction(null);
      return;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public void execSQL(String paramString)
  {
    executeSql(paramString, null);
  }
  
  public void execSQL(String paramString, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Empty bindArgs");
      throw localIllegalArgumentException;
    }
    executeSql(paramString, paramArrayOfObject);
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
  
  public List getAttachedDbs()
  {
    boolean bool = false;
    Object localObject1 = null;
    Object localObject6 = new java/util/ArrayList;
    ((ArrayList)localObject6).<init>();
    Object localObject8;
    label35:
    int i;
    Object localObject9;
    synchronized (this.mLock)
    {
      localObject8 = this.mConnectionPoolLocked;
      if (localObject8 == null) {}
      for (;;)
      {
        return (List)localObject1;
        i = this.mHasAttachedDbsLocked;
        if (i != 0) {
          break;
        }
        localObject1 = new android/util/Pair;
        localObject8 = "main";
        localObject9 = this.mConfigurationLocked;
        localObject9 = ((SQLiteDatabaseConfiguration)localObject9).path;
        ((Pair)localObject1).<init>(localObject8, localObject9);
        ((ArrayList)localObject6).add(localObject1);
        localObject1 = localObject6;
      }
      acquireReference();
      ??? = "pragma database_list;";
      i = 0;
      localObject8 = null;
    }
    try
    {
      ??? = rawQuery((String)???, null);
      try
      {
        for (;;)
        {
          bool = ((Cursor)???).moveToNext();
          if (!bool) {
            break;
          }
          localObject1 = new android/util/Pair;
          i = 1;
          localObject8 = ((Cursor)???).getString(i);
          int j = 2;
          localObject9 = ((Cursor)???).getString(j);
          ((Pair)localObject1).<init>(localObject8, localObject9);
          ((ArrayList)localObject6).add(localObject1);
        }
        if (localObject6 == null) {}
      }
      finally
      {
        localObject6 = ???;
      }
    }
    finally
    {
      Object localObject5;
      try
      {
        ((Cursor)localObject6).close();
        throw ((Throwable)localObject2);
      }
      finally
      {
        releaseReference();
        throw ((Throwable)localObject3);
        localObject4 = finally;
        throw ((Throwable)localObject4);
        if (??? != null) {
          ((Cursor)???).close();
        }
        releaseReference();
        localObject5 = localObject6;
        break label35;
        localObject10 = finally;
        localObject6 = null;
      }
    }
  }
  
  String getLabel()
  {
    synchronized (this.mLock)
    {
      Object localObject2 = this.mConfigurationLocked;
      localObject2 = ((SQLiteDatabaseConfiguration)localObject2).label;
      return (String)localObject2;
    }
  }
  
  public long getMaximumSize()
  {
    long l1 = ExtraUtils.longForQuery(this, "PRAGMA max_page_count;", null);
    long l2 = getPageSize();
    return l1 * l2;
  }
  
  public long getPageSize()
  {
    return ExtraUtils.longForQuery(this, "PRAGMA page_size;", null);
  }
  
  public final String getPath()
  {
    synchronized (this.mLock)
    {
      Object localObject2 = this.mConfigurationLocked;
      localObject2 = ((SQLiteDatabaseConfiguration)localObject2).path;
      return (String)localObject2;
    }
  }
  
  public Map getSyncedTables()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(0);
    return localHashMap;
  }
  
  int getThreadDefaultConnectionFlags(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      boolean bool = isMainThread();
      if (bool) {
        i |= 0x4;
      }
      return i;
    }
  }
  
  SQLiteSession getThreadSession()
  {
    return (SQLiteSession)this.mThreadSession.get();
  }
  
  public int getVersion()
  {
    return Long.valueOf(ExtraUtils.longForQuery(this, "PRAGMA user_version;", null)).intValue();
  }
  
  public boolean inTransaction()
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getThreadSession();
      boolean bool = localSQLiteSession.hasTransaction();
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public long insert(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    Object localObject1 = null;
    try
    {
      l = insertWithOnConflict(paramString1, paramString2, paramContentValues, 0);
    }
    catch (SQLException localSQLException)
    {
      for (;;)
      {
        String str1 = "SQLiteDatabase";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "Error inserting ";
        localObject2 = str2 + paramContentValues;
        Log.e(str1, (String)localObject2, localSQLException);
        long l = -1;
      }
    }
    return l;
  }
  
  public long insertOrThrow(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    return insertWithOnConflict(paramString1, paramString2, paramContentValues, 0);
  }
  
  public long insertWithOnConflict(String paramString1, String paramString2, ContentValues paramContentValues, int paramInt)
  {
    int i = 0;
    String str1 = null;
    acquireReference();
    for (;;)
    {
      try
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Object localObject1 = "INSERT";
        localStringBuilder.append((String)localObject1);
        localObject1 = CONFLICT_VALUES;
        localObject1 = localObject1[paramInt];
        localStringBuilder.append((String)localObject1);
        localObject1 = " INTO ";
        localStringBuilder.append((String)localObject1);
        localStringBuilder.append(paramString1);
        char c1 = '(';
        localStringBuilder.append(c1);
        c1 = '\000';
        localObject1 = null;
        if (paramContentValues != null)
        {
          k = paramContentValues.size();
          if (k > 0)
          {
            k = paramContentValues.size();
            int m = k;
            if (m <= 0) {
              continue;
            }
            localObject4 = new Object[m];
            localObject1 = paramContentValues.keySet();
            Iterator localIterator = ((Set)localObject1).iterator();
            int i1 = 0;
            boolean bool = localIterator.hasNext();
            if (!bool) {
              continue;
            }
            localObject1 = localIterator.next();
            localObject1 = (String)localObject1;
            if (i1 <= 0) {
              continue;
            }
            str2 = ",";
            localStringBuilder.append(str2);
            localStringBuilder.append((String)localObject1);
            int i2 = i1 + 1;
            localObject1 = paramContentValues.get((String)localObject1);
            localObject4[i1] = localObject1;
            i1 = i2;
            continue;
          }
        }
        int n = 0;
        continue;
        String str2 = "";
        continue;
        char c2 = ')';
        localStringBuilder.append(c2);
        localObject1 = " VALUES (";
        localStringBuilder.append((String)localObject1);
        if (i < n)
        {
          if (i > 0)
          {
            localObject1 = ",?";
            localStringBuilder.append((String)localObject1);
            int j = i + 1;
            i = j;
            continue;
          }
          localObject1 = "?";
          continue;
        }
        localObject1 = localObject4;
        int k = 41;
        localStringBuilder.append(k);
        localObject4 = new org/sqlite/database/sqlite/SQLiteStatement;
        str1 = localStringBuilder.toString();
        ((SQLiteStatement)localObject4).<init>(this, str1, (Object[])localObject1);
      }
      finally
      {
        StringBuilder localStringBuilder;
        long l;
        releaseReference();
      }
      try
      {
        l = ((SQLiteStatement)localObject4).executeInsert();
        ((SQLiteStatement)localObject4).close();
        releaseReference();
        return l;
      }
      finally
      {
        ((SQLiteStatement)localObject4).close();
      }
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append(paramString2);
      str1 = ") VALUES (NULL";
      localObject4 = ((StringBuilder)localObject4).append(str1);
      localObject4 = ((StringBuilder)localObject4).toString();
      localStringBuilder.append((String)localObject4);
    }
  }
  
  public boolean isDatabaseIntegrityOk()
  {
    acquireReference();
    for (;;)
    {
      Object localObject6;
      try
      {
        Object localObject1 = getAttachedDbs();
        if (localObject1 == null)
        {
          localObject1 = new java/lang/IllegalStateException;
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject7 = "databaselist for: ";
          localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
          localObject7 = getPath();
          localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
          localObject7 = " couldn't ";
          localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
          localObject7 = "be retrieved. probably because the database is closed";
          localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
          localObject6 = ((StringBuilder)localObject6).toString();
          ((IllegalStateException)localObject1).<init>((String)localObject6);
          throw ((Throwable)localObject1);
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        Object localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        localObject6 = new android/util/Pair;
        Object localObject7 = "main";
        String str = getPath();
        ((Pair)localObject6).<init>(localObject7, str);
        ((List)localObject2).add(localObject6);
        localObject7 = localObject2;
        i = 0;
        Object localObject8 = null;
        int j = ((List)localObject7).size();
        if (i >= j) {
          break label382;
        }
        localObject2 = ((List)localObject7).get(i);
        localObject2 = (Pair)localObject2;
        str = null;
        try
        {
          localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject9 = "PRAGMA ";
          localObject9 = ((StringBuilder)localObject6).append((String)localObject9);
          localObject6 = ((Pair)localObject2).first;
          localObject6 = (String)localObject6;
          localObject6 = ((StringBuilder)localObject9).append((String)localObject6);
          localObject9 = ".integrity_check(1);";
          localObject6 = ((StringBuilder)localObject6).append((String)localObject9);
          localObject6 = ((StringBuilder)localObject6).toString();
          localObject6 = compileStatement((String)localObject6);
        }
        finally
        {
          Object localObject9;
          boolean bool;
          localObject6 = null;
        }
        try
        {
          str = ((SQLiteStatement)localObject6).simpleQueryForString();
          localObject9 = "ok";
          bool = str.equalsIgnoreCase((String)localObject9);
          if (bool) {
            break label361;
          }
          localObject7 = "SQLiteDatabase";
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          localObject9 = "PRAGMA integrity_check on ";
          localObject8 = ((StringBuilder)localObject8).append((String)localObject9);
          localObject2 = ((Pair)localObject2).second;
          localObject2 = (String)localObject2;
          localObject2 = ((StringBuilder)localObject8).append((String)localObject2);
          localObject8 = " returned: ";
          localObject2 = ((StringBuilder)localObject2).append((String)localObject8);
          localObject2 = ((StringBuilder)localObject2).append(str);
          localObject2 = ((StringBuilder)localObject2).toString();
          Log.e((String)localObject7, (String)localObject2);
          if (localObject6 != null) {
            ((SQLiteStatement)localObject6).close();
          }
          releaseReference();
          j = 0;
          localObject2 = null;
          return j;
        }
        finally
        {
          int k;
          continue;
        }
        localObject7 = localObject2;
        continue;
        if (localObject6 != null) {
          ((SQLiteStatement)localObject6).close();
        }
        throw ((Throwable)localObject3);
      }
      finally
      {
        releaseReference();
      }
      label361:
      if (localObject6 != null) {
        ((SQLiteStatement)localObject6).close();
      }
      k = i + 1;
      int i = k;
      continue;
      label382:
      releaseReference();
      k = 1;
    }
  }
  
  public boolean isDbLockedByCurrentThread()
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getThreadSession();
      boolean bool = localSQLiteSession.hasConnection();
      return bool;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public boolean isDbLockedByOtherThreads()
  {
    return false;
  }
  
  public boolean isInMemoryDatabase()
  {
    synchronized (this.mLock)
    {
      SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
      boolean bool = localSQLiteDatabaseConfiguration.isInMemoryDb();
      return bool;
    }
  }
  
  public boolean isOpen()
  {
    synchronized (this.mLock)
    {
      SQLiteConnectionPool localSQLiteConnectionPool = this.mConnectionPoolLocked;
      if (localSQLiteConnectionPool != null)
      {
        bool = true;
        return bool;
      }
      boolean bool = false;
      localSQLiteConnectionPool = null;
    }
  }
  
  public boolean isReadOnly()
  {
    synchronized (this.mLock)
    {
      boolean bool = isReadOnlyLocked();
      return bool;
    }
  }
  
  public boolean isWriteAheadLoggingEnabled()
  {
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
      int i = localSQLiteDatabaseConfiguration.openFlags;
      int k = 536870912;
      i &= k;
      if (i != 0)
      {
        i = 1;
        return i;
      }
      int j = 0;
      localSQLiteDatabaseConfiguration = null;
    }
  }
  
  public void markTableSyncable(String paramString1, String paramString2) {}
  
  public void markTableSyncable(String paramString1, String paramString2, String paramString3) {}
  
  public boolean needUpgrade(int paramInt)
  {
    int i = getVersion();
    if (paramInt > i) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  protected void onAllReferencesReleased()
  {
    dispose(false);
  }
  
  void onCorruption()
  {
    String str = getLabel();
    EventLog.writeEvent(75004, str);
    this.mErrorHandler.onCorruption(this);
  }
  
  public Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5)
  {
    return query(false, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, null);
  }
  
  public Cursor query(String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return query(false, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6);
  }
  
  public Cursor query(boolean paramBoolean, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return queryWithFactory(null, paramBoolean, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, null);
  }
  
  public Cursor query(boolean paramBoolean, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6, CancellationSignal paramCancellationSignal)
  {
    return queryWithFactory(null, paramBoolean, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, paramCancellationSignal);
  }
  
  public Cursor queryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, boolean paramBoolean, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return queryWithFactory(paramCursorFactory, paramBoolean, paramString1, paramArrayOfString1, paramString2, paramArrayOfString2, paramString3, paramString4, paramString5, paramString6, null);
  }
  
  public Cursor queryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, boolean paramBoolean, String paramString1, String[] paramArrayOfString1, String paramString2, String[] paramArrayOfString2, String paramString3, String paramString4, String paramString5, String paramString6, CancellationSignal paramCancellationSignal)
  {
    acquireReference();
    Object localObject1 = paramArrayOfString1;
    String str = paramString3;
    try
    {
      localObject1 = SQLiteQueryBuilder.buildQueryString(paramBoolean, paramString1, paramArrayOfString1, paramString2, paramString3, paramString4, paramString5, paramString6);
      str = findEditTable(paramString1);
      Object localObject2 = this;
      localObject2 = rawQueryWithFactory(paramCursorFactory, (String)localObject1, paramArrayOfString2, str, paramCancellationSignal);
      return (Cursor)localObject2;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    return rawQueryWithFactory(null, paramString, paramArrayOfString, null, null);
  }
  
  public Cursor rawQuery(String paramString, String[] paramArrayOfString, CancellationSignal paramCancellationSignal)
  {
    return rawQueryWithFactory(null, paramString, paramArrayOfString, null, paramCancellationSignal);
  }
  
  public Cursor rawQueryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, String paramString1, String[] paramArrayOfString, String paramString2)
  {
    return rawQueryWithFactory(paramCursorFactory, paramString1, paramArrayOfString, paramString2, null);
  }
  
  /* Error */
  public Cursor rawQueryWithFactory(SQLiteDatabase.CursorFactory paramCursorFactory, String paramString1, String[] paramArrayOfString, String paramString2, CancellationSignal paramCancellationSignal)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 134	org/sqlite/database/sqlite/SQLiteDatabase:acquireReference	()V
    //   4: new 669	org/sqlite/database/sqlite/SQLiteDirectCursorDriver
    //   7: astore 6
    //   9: aload 6
    //   11: aload_0
    //   12: aload_2
    //   13: aload 4
    //   15: aload 5
    //   17: invokespecial 672	org/sqlite/database/sqlite/SQLiteDirectCursorDriver:<init>	(Lorg/sqlite/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Lorg/sqlite/os/CancellationSignal;)V
    //   20: aload_1
    //   21: ifnull +21 -> 42
    //   24: aload 6
    //   26: aload_1
    //   27: aload_3
    //   28: invokeinterface 677 3 0
    //   33: astore 6
    //   35: aload_0
    //   36: invokevirtual 151	org/sqlite/database/sqlite/SQLiteDatabase:releaseReference	()V
    //   39: aload 6
    //   41: areturn
    //   42: aload_0
    //   43: getfield 119	org/sqlite/database/sqlite/SQLiteDatabase:mCursorFactory	Lorg/sqlite/database/sqlite/SQLiteDatabase$CursorFactory;
    //   46: astore_1
    //   47: goto -23 -> 24
    //   50: astore 6
    //   52: aload_0
    //   53: invokevirtual 151	org/sqlite/database/sqlite/SQLiteDatabase:releaseReference	()V
    //   56: aload 6
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	SQLiteDatabase
    //   0	59	1	paramCursorFactory	SQLiteDatabase.CursorFactory
    //   0	59	2	paramString1	String
    //   0	59	3	paramArrayOfString	String[]
    //   0	59	4	paramString2	String
    //   0	59	5	paramCancellationSignal	CancellationSignal
    //   7	33	6	localObject1	Object
    //   50	7	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   4	7	50	finally
    //   15	20	50	finally
    //   27	33	50	finally
    //   42	46	50	finally
  }
  
  public void reopenReadWrite()
  {
    Object localObject2;
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      boolean bool = isReadOnlyLocked();
      if (!bool) {
        return;
      }
      localObject2 = this.mConfigurationLocked;
      i = ((SQLiteDatabaseConfiguration)localObject2).openFlags;
      localObject2 = this.mConfigurationLocked;
      localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
      int j = localSQLiteDatabaseConfiguration.openFlags & 0xFFFFFFFE | 0x0;
      ((SQLiteDatabaseConfiguration)localObject2).openFlags = j;
    }
  }
  
  public long replace(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    int i = 5;
    try
    {
      l = insertWithOnConflict(paramString1, paramString2, paramContentValues, i);
    }
    catch (SQLException localSQLException)
    {
      for (;;)
      {
        String str1 = "SQLiteDatabase";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str2 = "Error inserting ";
        localObject = str2 + paramContentValues;
        Log.e(str1, (String)localObject, localSQLException);
        long l = -1;
      }
    }
    return l;
  }
  
  public long replaceOrThrow(String paramString1, String paramString2, ContentValues paramContentValues)
  {
    return insertWithOnConflict(paramString1, paramString2, paramContentValues, 5);
  }
  
  public void setForeignKeyConstraintsEnabled(boolean paramBoolean)
  {
    Object localObject2;
    SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration1;
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      localObject2 = this.mConfigurationLocked;
      boolean bool1 = ((SQLiteDatabaseConfiguration)localObject2).foreignKeyConstraintsEnabled;
      if (bool1 == paramBoolean) {
        return;
      }
      localObject2 = this.mConfigurationLocked;
      ((SQLiteDatabaseConfiguration)localObject2).foreignKeyConstraintsEnabled = paramBoolean;
    }
    SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration2;
    boolean bool2 = true;
    for (;;)
    {
      localSQLiteDatabaseConfiguration2.foreignKeyConstraintsEnabled = bool2;
      throw localRuntimeException;
      bool2 = false;
      localSQLiteDatabaseConfiguration1 = null;
    }
  }
  
  public void setLocale(Locale paramLocale)
  {
    Object localObject1;
    if (paramLocale == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("locale must not be null.");
      throw ((Throwable)localObject1);
    }
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      localObject1 = this.mConfigurationLocked;
      Locale localLocale = ((SQLiteDatabaseConfiguration)localObject1).locale;
      localObject1 = this.mConfigurationLocked;
      ((SQLiteDatabaseConfiguration)localObject1).locale = paramLocale;
      try
      {
        localObject1 = this.mConnectionPoolLocked;
        localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
        ((SQLiteConnectionPool)localObject1).reconfigure(localSQLiteDatabaseConfiguration);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
        localSQLiteDatabaseConfiguration.locale = localLocale;
        throw localRuntimeException;
      }
    }
  }
  
  public void setLockingEnabled(boolean paramBoolean) {}
  
  public void setMaxSqlCacheSize(int paramInt)
  {
    int i = 100;
    Object localObject1;
    if ((paramInt > i) || (paramInt < 0))
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("expected value between 0 and 100");
      throw ((Throwable)localObject1);
    }
    synchronized (this.mLock)
    {
      throwIfNotOpenLocked();
      localObject1 = this.mConfigurationLocked;
      int j = ((SQLiteDatabaseConfiguration)localObject1).maxSqlCacheSize;
      localObject1 = this.mConfigurationLocked;
      ((SQLiteDatabaseConfiguration)localObject1).maxSqlCacheSize = paramInt;
      try
      {
        localObject1 = this.mConnectionPoolLocked;
        localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
        ((SQLiteConnectionPool)localObject1).reconfigure(localSQLiteDatabaseConfiguration);
        return;
      }
      catch (RuntimeException localRuntimeException)
      {
        SQLiteDatabaseConfiguration localSQLiteDatabaseConfiguration = this.mConfigurationLocked;
        localSQLiteDatabaseConfiguration.maxSqlCacheSize = j;
        throw localRuntimeException;
      }
    }
  }
  
  public long setMaximumSize(long paramLong)
  {
    long l1 = getPageSize();
    long l2 = paramLong / l1;
    long l3 = paramLong % l1;
    long l4 = 0L;
    boolean bool = l3 < l4;
    if (bool)
    {
      l3 = 1L;
      l2 += l3;
    }
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "PRAGMA max_page_count = " + l2;
    return ExtraUtils.longForQuery(this, str, null) * l1;
  }
  
  public void setPageSize(long paramLong)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "PRAGMA page_size = " + paramLong;
    execSQL((String)localObject);
  }
  
  public void setTransactionSuccessful()
  {
    acquireReference();
    try
    {
      SQLiteSession localSQLiteSession = getThreadSession();
      localSQLiteSession.setTransactionSuccessful();
      return;
    }
    finally
    {
      releaseReference();
    }
  }
  
  public void setVersion(int paramInt)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "PRAGMA user_version = " + paramInt;
    execSQL((String)localObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SQLiteDatabase: ");
    String str = getPath();
    return str;
  }
  
  public int update(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString)
  {
    return updateWithOnConflict(paramString1, paramContentValues, paramString2, paramArrayOfString, 0);
  }
  
  /* Error */
  public int updateWithOnConflict(String paramString1, ContentValues paramContentValues, String paramString2, String[] paramArrayOfString, int paramInt)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnull +14 -> 15
    //   4: aload_2
    //   5: invokevirtual 560	android/content/ContentValues:size	()I
    //   8: istore 6
    //   10: iload 6
    //   12: ifne +19 -> 31
    //   15: new 168	java/lang/IllegalArgumentException
    //   18: astore 7
    //   20: aload 7
    //   22: ldc_w 720
    //   25: invokespecial 173	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   28: aload 7
    //   30: athrow
    //   31: aload_0
    //   32: invokevirtual 134	org/sqlite/database/sqlite/SQLiteDatabase:acquireReference	()V
    //   35: new 180	java/lang/StringBuilder
    //   38: astore 8
    //   40: bipush 120
    //   42: istore 6
    //   44: aload 8
    //   46: iload 6
    //   48: invokespecial 722	java/lang/StringBuilder:<init>	(I)V
    //   51: ldc_w 724
    //   54: astore 7
    //   56: aload 8
    //   58: aload 7
    //   60: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: getstatic 96	org/sqlite/database/sqlite/SQLiteDatabase:CONFLICT_VALUES	[Ljava/lang/String;
    //   67: astore 7
    //   69: aload 7
    //   71: iload 5
    //   73: aaload
    //   74: astore 7
    //   76: aload 8
    //   78: aload 7
    //   80: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: pop
    //   84: aload 8
    //   86: aload_1
    //   87: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: ldc_w 726
    //   94: astore 7
    //   96: aload 8
    //   98: aload 7
    //   100: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   103: pop
    //   104: aload_2
    //   105: invokevirtual 560	android/content/ContentValues:size	()I
    //   108: istore 9
    //   110: aload 4
    //   112: ifnonnull +135 -> 247
    //   115: iload 9
    //   117: istore 10
    //   119: iload 10
    //   121: anewarray 106	java/lang/Object
    //   124: astore 11
    //   126: iconst_0
    //   127: istore 6
    //   129: aconst_null
    //   130: astore 7
    //   132: aload_2
    //   133: invokevirtual 561	android/content/ContentValues:keySet	()Ljava/util/Set;
    //   136: astore 12
    //   138: aload 12
    //   140: invokeinterface 564 1 0
    //   145: astore 13
    //   147: iconst_0
    //   148: istore 14
    //   150: aload 13
    //   152: invokeinterface 250 1 0
    //   157: istore 6
    //   159: iload 6
    //   161: ifeq +108 -> 269
    //   164: aload 13
    //   166: invokeinterface 254 1 0
    //   171: astore 7
    //   173: aload 7
    //   175: checkcast 78	java/lang/String
    //   178: astore 7
    //   180: iload 14
    //   182: ifle +80 -> 262
    //   185: ldc_w 566
    //   188: astore 12
    //   190: aload 8
    //   192: aload 12
    //   194: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: pop
    //   198: aload 8
    //   200: aload 7
    //   202: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: pop
    //   206: iload 14
    //   208: iconst_1
    //   209: iadd
    //   210: istore 15
    //   212: aload_2
    //   213: aload 7
    //   215: invokevirtual 569	android/content/ContentValues:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   218: astore 7
    //   220: aload 11
    //   222: iload 14
    //   224: aload 7
    //   226: aastore
    //   227: ldc_w 728
    //   230: astore 7
    //   232: aload 8
    //   234: aload 7
    //   236: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   239: pop
    //   240: iload 15
    //   242: istore 14
    //   244: goto -94 -> 150
    //   247: aload 4
    //   249: arraylength
    //   250: iload 9
    //   252: iadd
    //   253: istore 6
    //   255: iload 6
    //   257: istore 10
    //   259: goto -140 -> 119
    //   262: ldc 80
    //   264: astore 12
    //   266: goto -76 -> 190
    //   269: aload 4
    //   271: ifnull +44 -> 315
    //   274: iload 9
    //   276: istore 6
    //   278: iload 6
    //   280: iload 10
    //   282: if_icmpge +33 -> 315
    //   285: iload 6
    //   287: iload 9
    //   289: isub
    //   290: istore 15
    //   292: aload 4
    //   294: iload 15
    //   296: aaload
    //   297: astore 12
    //   299: aload 11
    //   301: iload 6
    //   303: aload 12
    //   305: aastore
    //   306: iload 6
    //   308: iconst_1
    //   309: iadd
    //   310: istore 6
    //   312: goto -34 -> 278
    //   315: aload_3
    //   316: invokestatic 282	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   319: istore 6
    //   321: iload 6
    //   323: ifne +23 -> 346
    //   326: ldc_w 424
    //   329: astore 7
    //   331: aload 8
    //   333: aload 7
    //   335: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   338: pop
    //   339: aload 8
    //   341: aload_3
    //   342: invokevirtual 189	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: pop
    //   346: new 268	org/sqlite/database/sqlite/SQLiteStatement
    //   349: astore 7
    //   351: aload 8
    //   353: invokevirtual 194	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: astore 16
    //   358: aload 7
    //   360: aload_0
    //   361: aload 16
    //   363: aload 11
    //   365: invokespecial 271	org/sqlite/database/sqlite/SQLiteStatement:<init>	(Lorg/sqlite/database/sqlite/SQLiteDatabase;Ljava/lang/String;[Ljava/lang/Object;)V
    //   368: aload 7
    //   370: invokevirtual 275	org/sqlite/database/sqlite/SQLiteStatement:executeUpdateDelete	()I
    //   373: istore 9
    //   375: aload 7
    //   377: invokevirtual 276	org/sqlite/database/sqlite/SQLiteStatement:close	()V
    //   380: aload_0
    //   381: invokevirtual 151	org/sqlite/database/sqlite/SQLiteDatabase:releaseReference	()V
    //   384: iload 9
    //   386: ireturn
    //   387: astore 16
    //   389: aload 7
    //   391: invokevirtual 276	org/sqlite/database/sqlite/SQLiteStatement:close	()V
    //   394: aload 16
    //   396: athrow
    //   397: astore 7
    //   399: aload_0
    //   400: invokevirtual 151	org/sqlite/database/sqlite/SQLiteDatabase:releaseReference	()V
    //   403: aload 7
    //   405: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	406	0	this	SQLiteDatabase
    //   0	406	1	paramString1	String
    //   0	406	2	paramContentValues	ContentValues
    //   0	406	3	paramString2	String
    //   0	406	4	paramArrayOfString	String[]
    //   0	406	5	paramInt	int
    //   8	120	6	i	int
    //   157	3	6	bool1	boolean
    //   253	58	6	j	int
    //   319	3	6	bool2	boolean
    //   18	372	7	localObject1	Object
    //   397	7	7	localObject2	Object
    //   38	314	8	localStringBuilder	StringBuilder
    //   108	277	9	k	int
    //   117	166	10	m	int
    //   124	240	11	arrayOfObject	Object[]
    //   136	168	12	localObject3	Object
    //   145	20	13	localIterator	Iterator
    //   148	95	14	n	int
    //   210	85	15	i1	int
    //   356	6	16	str	String
    //   387	8	16	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   368	373	387	finally
    //   35	38	397	finally
    //   46	51	397	finally
    //   58	64	397	finally
    //   64	67	397	finally
    //   71	74	397	finally
    //   78	84	397	finally
    //   86	91	397	finally
    //   98	104	397	finally
    //   104	108	397	finally
    //   119	124	397	finally
    //   132	136	397	finally
    //   138	145	397	finally
    //   150	157	397	finally
    //   164	171	397	finally
    //   173	178	397	finally
    //   192	198	397	finally
    //   200	206	397	finally
    //   213	218	397	finally
    //   224	227	397	finally
    //   234	240	397	finally
    //   247	250	397	finally
    //   294	297	397	finally
    //   303	306	397	finally
    //   315	319	397	finally
    //   333	339	397	finally
    //   341	346	397	finally
    //   346	349	397	finally
    //   351	356	397	finally
    //   363	368	397	finally
    //   375	380	397	finally
    //   389	394	397	finally
    //   394	397	397	finally
  }
  
  public boolean yieldIfContended()
  {
    return yieldIfContendedHelper(false, -1);
  }
  
  public boolean yieldIfContendedSafely()
  {
    return yieldIfContendedHelper(true, -1);
  }
  
  public boolean yieldIfContendedSafely(long paramLong)
  {
    return yieldIfContendedHelper(true, paramLong);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteDatabase.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */