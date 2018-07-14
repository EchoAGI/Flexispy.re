package org.sqlite.database.sqlite;

import android.database.Cursor;
import org.sqlite.os.CancellationSignal;

public final class SQLiteDirectCursorDriver
  implements SQLiteCursorDriver
{
  private final CancellationSignal mCancellationSignal;
  private final SQLiteDatabase mDatabase;
  private final String mEditTable;
  private SQLiteQuery mQuery;
  private final String mSql;
  
  public SQLiteDirectCursorDriver(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, CancellationSignal paramCancellationSignal)
  {
    this.mDatabase = paramSQLiteDatabase;
    this.mEditTable = paramString2;
    this.mSql = paramString1;
    this.mCancellationSignal = paramCancellationSignal;
  }
  
  public void cursorClosed() {}
  
  public void cursorDeactivated() {}
  
  public void cursorRequeried(Cursor paramCursor) {}
  
  /* Error */
  public Cursor query(SQLiteDatabase.CursorFactory paramCursorFactory, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: new 29	org/sqlite/database/sqlite/SQLiteQuery
    //   3: astore_3
    //   4: aload_0
    //   5: getfield 21	org/sqlite/database/sqlite/SQLiteDirectCursorDriver:mDatabase	Lorg/sqlite/database/sqlite/SQLiteDatabase;
    //   8: astore 4
    //   10: aload_0
    //   11: getfield 25	org/sqlite/database/sqlite/SQLiteDirectCursorDriver:mSql	Ljava/lang/String;
    //   14: astore 5
    //   16: aload_0
    //   17: getfield 27	org/sqlite/database/sqlite/SQLiteDirectCursorDriver:mCancellationSignal	Lorg/sqlite/os/CancellationSignal;
    //   20: astore 6
    //   22: aload_3
    //   23: aload 4
    //   25: aload 5
    //   27: aload 6
    //   29: invokespecial 32	org/sqlite/database/sqlite/SQLiteQuery:<init>	(Lorg/sqlite/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lorg/sqlite/os/CancellationSignal;)V
    //   32: aload_3
    //   33: aload_2
    //   34: invokevirtual 36	org/sqlite/database/sqlite/SQLiteQuery:bindAllArgsAsStrings	([Ljava/lang/String;)V
    //   37: aload_1
    //   38: ifnonnull +31 -> 69
    //   41: new 38	org/sqlite/database/sqlite/SQLiteCursor
    //   44: astore 4
    //   46: aload_0
    //   47: getfield 23	org/sqlite/database/sqlite/SQLiteDirectCursorDriver:mEditTable	Ljava/lang/String;
    //   50: astore 5
    //   52: aload 4
    //   54: aload_0
    //   55: aload 5
    //   57: aload_3
    //   58: invokespecial 41	org/sqlite/database/sqlite/SQLiteCursor:<init>	(Lorg/sqlite/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Lorg/sqlite/database/sqlite/SQLiteQuery;)V
    //   61: aload_0
    //   62: aload_3
    //   63: putfield 43	org/sqlite/database/sqlite/SQLiteDirectCursorDriver:mQuery	Lorg/sqlite/database/sqlite/SQLiteQuery;
    //   66: aload 4
    //   68: areturn
    //   69: aload_0
    //   70: getfield 21	org/sqlite/database/sqlite/SQLiteDirectCursorDriver:mDatabase	Lorg/sqlite/database/sqlite/SQLiteDatabase;
    //   73: astore 4
    //   75: aload_0
    //   76: getfield 23	org/sqlite/database/sqlite/SQLiteDirectCursorDriver:mEditTable	Ljava/lang/String;
    //   79: astore 5
    //   81: aload_1
    //   82: aload 4
    //   84: aload_0
    //   85: aload 5
    //   87: aload_3
    //   88: invokeinterface 49 5 0
    //   93: astore 4
    //   95: goto -34 -> 61
    //   98: astore 4
    //   100: aload_3
    //   101: invokevirtual 52	org/sqlite/database/sqlite/SQLiteQuery:close	()V
    //   104: aload 4
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	SQLiteDirectCursorDriver
    //   0	107	1	paramCursorFactory	SQLiteDatabase.CursorFactory
    //   0	107	2	paramArrayOfString	String[]
    //   3	98	3	localSQLiteQuery	SQLiteQuery
    //   8	86	4	localObject	Object
    //   98	7	4	localRuntimeException	RuntimeException
    //   14	72	5	str	String
    //   20	8	6	localCancellationSignal	CancellationSignal
    // Exception table:
    //   from	to	target	type
    //   33	37	98	java/lang/RuntimeException
    //   41	44	98	java/lang/RuntimeException
    //   46	50	98	java/lang/RuntimeException
    //   57	61	98	java/lang/RuntimeException
    //   69	73	98	java/lang/RuntimeException
    //   75	79	98	java/lang/RuntimeException
    //   87	93	98	java/lang/RuntimeException
  }
  
  public void setBindArguments(String[] paramArrayOfString)
  {
    this.mQuery.bindAllArgsAsStrings(paramArrayOfString);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SQLiteDirectCursorDriver: ");
    String str = this.mSql;
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteDirectCursorDriver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */