package org.sqlite.database.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CursorWindow;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import org.sqlite.database.ExtraUtils;

public class SQLiteCursor
  extends AbstractWindowedCursor
{
  static final int NO_COUNT = 255;
  static final String TAG = "SQLiteCursor";
  private Map mColumnNameMap;
  private final String[] mColumns;
  private int mCount;
  private int mCursorWindowCapacity;
  private final SQLiteCursorDriver mDriver;
  private final String mEditTable;
  private final SQLiteQuery mQuery;
  private final Throwable mStackTrace;
  
  public SQLiteCursor(SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    int i = -1;
    this.mCount = i;
    if (paramSQLiteQuery == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("query object cannot be null");
      throw ((Throwable)localObject);
    }
    this.mStackTrace = null;
    this.mDriver = paramSQLiteCursorDriver;
    this.mEditTable = paramString;
    this.mColumnNameMap = null;
    this.mQuery = paramSQLiteQuery;
    Object localObject = paramSQLiteQuery.getColumnNames();
    this.mColumns = ((String[])localObject);
    i = ExtraUtils.findRowIdColumnIndex(this.mColumns);
    this.mRowIdColumnIndex = i;
  }
  
  public SQLiteCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery)
  {
    this(paramSQLiteCursorDriver, paramString, paramSQLiteQuery);
  }
  
  private void awc_clearOrCreateWindow(String paramString)
  {
    CursorWindow localCursorWindow = getWindow();
    if (localCursorWindow == null)
    {
      localCursorWindow = new android/database/CursorWindow;
      localCursorWindow.<init>(paramString);
      setWindow(localCursorWindow);
    }
    for (;;)
    {
      return;
      localCursorWindow.clear();
    }
  }
  
  private void awc_closeWindow()
  {
    setWindow(null);
  }
  
  /* Error */
  private void fillWindow(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 86	org/sqlite/database/sqlite/SQLiteCursor:getDatabase	()Lorg/sqlite/database/sqlite/SQLiteDatabase;
    //   4: invokevirtual 92	org/sqlite/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: invokespecial 95	org/sqlite/database/sqlite/SQLiteCursor:awc_clearOrCreateWindow	(Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield 31	org/sqlite/database/sqlite/SQLiteCursor:mCount	I
    //   17: istore_3
    //   18: iconst_m1
    //   19: istore 4
    //   21: iload_3
    //   22: iload 4
    //   24: if_icmpne +133 -> 157
    //   27: iconst_0
    //   28: istore_3
    //   29: aconst_null
    //   30: astore_2
    //   31: iload_1
    //   32: iconst_0
    //   33: invokestatic 99	org/sqlite/database/ExtraUtils:cursorPickFillWindowStartPosition	(II)I
    //   36: istore_3
    //   37: aload_0
    //   38: getfield 48	org/sqlite/database/sqlite/SQLiteCursor:mQuery	Lorg/sqlite/database/sqlite/SQLiteQuery;
    //   41: astore 5
    //   43: aload_0
    //   44: getfield 103	org/sqlite/database/sqlite/SQLiteCursor:mWindow	Landroid/database/CursorWindow;
    //   47: astore 6
    //   49: iconst_1
    //   50: istore 7
    //   52: aload 5
    //   54: aload 6
    //   56: iload_3
    //   57: iload_1
    //   58: iload 7
    //   60: invokevirtual 108	org/sqlite/database/sqlite/SQLiteQuery:fillWindow	(Landroid/database/CursorWindow;IIZ)I
    //   63: istore_3
    //   64: aload_0
    //   65: iload_3
    //   66: putfield 31	org/sqlite/database/sqlite/SQLiteCursor:mCount	I
    //   69: aload_0
    //   70: getfield 103	org/sqlite/database/sqlite/SQLiteCursor:mWindow	Landroid/database/CursorWindow;
    //   73: astore_2
    //   74: aload_2
    //   75: invokevirtual 112	android/database/CursorWindow:getNumRows	()I
    //   78: istore_3
    //   79: aload_0
    //   80: iload_3
    //   81: putfield 114	org/sqlite/database/sqlite/SQLiteCursor:mCursorWindowCapacity	I
    //   84: ldc 12
    //   86: astore_2
    //   87: iconst_3
    //   88: istore 4
    //   90: aload_2
    //   91: iload 4
    //   93: invokestatic 121	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   96: istore_3
    //   97: iload_3
    //   98: ifeq +58 -> 156
    //   101: ldc 12
    //   103: astore_2
    //   104: new 123	java/lang/StringBuilder
    //   107: astore 5
    //   109: aload 5
    //   111: invokespecial 124	java/lang/StringBuilder:<init>	()V
    //   114: ldc 126
    //   116: astore 6
    //   118: aload 5
    //   120: aload 6
    //   122: invokevirtual 130	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: astore 5
    //   127: aload_0
    //   128: getfield 31	org/sqlite/database/sqlite/SQLiteCursor:mCount	I
    //   131: istore 8
    //   133: aload 5
    //   135: iload 8
    //   137: invokevirtual 133	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   140: astore 5
    //   142: aload 5
    //   144: invokevirtual 136	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   147: astore 5
    //   149: aload_2
    //   150: aload 5
    //   152: invokestatic 140	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   155: pop
    //   156: return
    //   157: aload_0
    //   158: getfield 114	org/sqlite/database/sqlite/SQLiteCursor:mCursorWindowCapacity	I
    //   161: istore_3
    //   162: iload_1
    //   163: iload_3
    //   164: invokestatic 99	org/sqlite/database/ExtraUtils:cursorPickFillWindowStartPosition	(II)I
    //   167: istore_3
    //   168: aload_0
    //   169: getfield 48	org/sqlite/database/sqlite/SQLiteCursor:mQuery	Lorg/sqlite/database/sqlite/SQLiteQuery;
    //   172: astore 5
    //   174: aload_0
    //   175: getfield 103	org/sqlite/database/sqlite/SQLiteCursor:mWindow	Landroid/database/CursorWindow;
    //   178: astore 6
    //   180: iconst_0
    //   181: istore 7
    //   183: aload 5
    //   185: aload 6
    //   187: iload_3
    //   188: iload_1
    //   189: iconst_0
    //   190: invokevirtual 108	org/sqlite/database/sqlite/SQLiteQuery:fillWindow	(Landroid/database/CursorWindow;IIZ)I
    //   193: pop
    //   194: goto -38 -> 156
    //   197: astore_2
    //   198: aload_0
    //   199: invokespecial 143	org/sqlite/database/sqlite/SQLiteCursor:awc_closeWindow	()V
    //   202: aload_2
    //   203: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	this	SQLiteCursor
    //   0	204	1	paramInt	int
    //   7	143	2	localObject1	Object
    //   197	6	2	localRuntimeException	RuntimeException
    //   17	64	3	i	int
    //   96	2	3	bool1	boolean
    //   161	27	3	j	int
    //   19	73	4	k	int
    //   41	143	5	localObject2	Object
    //   47	139	6	localObject3	Object
    //   50	132	7	bool2	boolean
    //   131	5	8	m	int
    // Exception table:
    //   from	to	target	type
    //   13	17	197	java/lang/RuntimeException
    //   32	36	197	java/lang/RuntimeException
    //   37	41	197	java/lang/RuntimeException
    //   43	47	197	java/lang/RuntimeException
    //   58	63	197	java/lang/RuntimeException
    //   65	69	197	java/lang/RuntimeException
    //   69	73	197	java/lang/RuntimeException
    //   74	78	197	java/lang/RuntimeException
    //   80	84	197	java/lang/RuntimeException
    //   91	96	197	java/lang/RuntimeException
    //   104	107	197	java/lang/RuntimeException
    //   109	114	197	java/lang/RuntimeException
    //   120	125	197	java/lang/RuntimeException
    //   127	131	197	java/lang/RuntimeException
    //   135	140	197	java/lang/RuntimeException
    //   142	147	197	java/lang/RuntimeException
    //   150	156	197	java/lang/RuntimeException
    //   157	161	197	java/lang/RuntimeException
    //   163	167	197	java/lang/RuntimeException
    //   168	172	197	java/lang/RuntimeException
    //   174	178	197	java/lang/RuntimeException
    //   189	194	197	java/lang/RuntimeException
  }
  
  public void close()
  {
    super.close();
    try
    {
      Object localObject1 = this.mQuery;
      ((SQLiteQuery)localObject1).close();
      localObject1 = this.mDriver;
      ((SQLiteCursorDriver)localObject1).cursorClosed();
      return;
    }
    finally {}
  }
  
  public void deactivate()
  {
    super.deactivate();
    this.mDriver.cursorDeactivated();
  }
  
  protected void finalize()
  {
    try
    {
      CursorWindow localCursorWindow = this.mWindow;
      if (localCursorWindow != null) {
        close();
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public int getColumnIndex(String paramString)
  {
    int i = -1;
    Object localObject1 = this.mColumnNameMap;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (localObject1 == null)
    {
      localObject2 = this.mColumns;
      int j = localObject2.length;
      localObject3 = new java/util/HashMap;
      ((HashMap)localObject3).<init>(j, 1.0F);
      k = 0;
      localObject1 = null;
      while (k < j)
      {
        localObject4 = localObject2[k];
        Integer localInteger = Integer.valueOf(k);
        ((HashMap)localObject3).put(localObject4, localInteger);
        k += 1;
      }
      this.mColumnNameMap = ((Map)localObject3);
    }
    int k = paramString.lastIndexOf('.');
    if (k != i)
    {
      localObject2 = new java/lang/Exception;
      ((Exception)localObject2).<init>();
      String str = "SQLiteCursor";
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "requesting column name with table name -- ";
      localObject3 = (String)localObject4 + paramString;
      Log.e(str, (String)localObject3, (Throwable)localObject2);
      k += 1;
      paramString = paramString.substring(k);
    }
    localObject1 = (Integer)this.mColumnNameMap.get(paramString);
    if (localObject1 != null) {}
    for (k = ((Integer)localObject1).intValue();; k = i) {
      return k;
    }
  }
  
  public String[] getColumnNames()
  {
    return this.mColumns;
  }
  
  public int getCount()
  {
    int i = this.mCount;
    int j = -1;
    if (i == j)
    {
      i = 0;
      fillWindow(0);
    }
    return this.mCount;
  }
  
  public SQLiteDatabase getDatabase()
  {
    return this.mQuery.getDatabase();
  }
  
  public boolean onMove(int paramInt1, int paramInt2)
  {
    CursorWindow localCursorWindow1 = this.mWindow;
    if (localCursorWindow1 != null)
    {
      localCursorWindow1 = this.mWindow;
      int i = localCursorWindow1.getStartPosition();
      if (paramInt2 >= i)
      {
        localCursorWindow1 = this.mWindow;
        i = localCursorWindow1.getStartPosition();
        CursorWindow localCursorWindow2 = this.mWindow;
        int j = localCursorWindow2.getNumRows();
        i += j;
        if (paramInt2 < i) {
          break label68;
        }
      }
    }
    fillWindow(paramInt2);
    label68:
    return true;
  }
  
  public boolean requery()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    boolean bool2 = isClosed();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      try
      {
        localObject3 = this.mQuery;
        localObject3 = ((SQLiteQuery)localObject3).getDatabase();
        bool2 = ((SQLiteDatabase)localObject3).isOpen();
        if (!bool2) {
          continue;
        }
      }
      finally {}
      Object localObject3 = this.mWindow;
      if (localObject3 != null)
      {
        localObject3 = this.mWindow;
        ((CursorWindow)localObject3).clear();
      }
      int i = -1;
      this.mPos = i;
      i = -1;
      this.mCount = i;
      localObject3 = this.mDriver;
      ((SQLiteCursorDriver)localObject3).cursorRequeried(this);
      try
      {
        bool1 = super.requery();
      }
      catch (IllegalStateException localIllegalStateException)
      {
        String str1 = "SQLiteCursor";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("requery() failed ");
        String str2 = localIllegalStateException.getMessage();
        localObject4 = str2;
        Log.w(str1, (String)localObject4, localIllegalStateException);
      }
    }
  }
  
  public void setSelectionArguments(String[] paramArrayOfString)
  {
    this.mDriver.setBindArguments(paramArrayOfString);
  }
  
  public void setWindow(CursorWindow paramCursorWindow)
  {
    super.setWindow(paramCursorWindow);
    this.mCount = -1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteCursor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */