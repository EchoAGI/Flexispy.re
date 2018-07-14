package org.sqlite.database.sqlite;

import org.sqlite.os.CancellationSignal;

public final class SQLiteQuery
  extends SQLiteProgram
{
  private static final String TAG = "SQLiteQuery";
  private final CancellationSignal mCancellationSignal;
  
  SQLiteQuery(SQLiteDatabase paramSQLiteDatabase, String paramString, CancellationSignal paramCancellationSignal)
  {
    super(paramSQLiteDatabase, paramString, null, paramCancellationSignal);
    this.mCancellationSignal = paramCancellationSignal;
  }
  
  /* Error */
  int fillWindow(android.database.CursorWindow paramCursorWindow, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 21	org/sqlite/database/sqlite/SQLiteQuery:acquireReference	()V
    //   4: aload_1
    //   5: invokevirtual 24	android/database/CursorWindow:acquireReference	()V
    //   8: aload_0
    //   9: invokevirtual 28	org/sqlite/database/sqlite/SQLiteQuery:getSession	()Lorg/sqlite/database/sqlite/SQLiteSession;
    //   12: astore 5
    //   14: aload_0
    //   15: invokevirtual 32	org/sqlite/database/sqlite/SQLiteQuery:getSql	()Ljava/lang/String;
    //   18: astore 6
    //   20: aload_0
    //   21: invokevirtual 36	org/sqlite/database/sqlite/SQLiteQuery:getBindArgs	()[Ljava/lang/Object;
    //   24: astore 7
    //   26: aload_0
    //   27: invokevirtual 40	org/sqlite/database/sqlite/SQLiteQuery:getConnectionFlags	()I
    //   30: istore 8
    //   32: aload_0
    //   33: getfield 17	org/sqlite/database/sqlite/SQLiteQuery:mCancellationSignal	Lorg/sqlite/os/CancellationSignal;
    //   36: astore 9
    //   38: aload_1
    //   39: astore 10
    //   41: aload 5
    //   43: aload 6
    //   45: aload 7
    //   47: aload_1
    //   48: iload_2
    //   49: iload_3
    //   50: iload 4
    //   52: iload 8
    //   54: aload 9
    //   56: invokevirtual 46	org/sqlite/database/sqlite/SQLiteSession:executeForCursorWindow	(Ljava/lang/String;[Ljava/lang/Object;Landroid/database/CursorWindow;IIZILorg/sqlite/os/CancellationSignal;)I
    //   59: istore 11
    //   61: aload_1
    //   62: invokevirtual 49	android/database/CursorWindow:releaseReference	()V
    //   65: aload_0
    //   66: invokevirtual 50	org/sqlite/database/sqlite/SQLiteQuery:releaseReference	()V
    //   69: iload 11
    //   71: ireturn
    //   72: astore 5
    //   74: aload_0
    //   75: invokevirtual 53	org/sqlite/database/sqlite/SQLiteQuery:onCorruption	()V
    //   78: aload 5
    //   80: athrow
    //   81: astore 5
    //   83: aload_1
    //   84: invokevirtual 49	android/database/CursorWindow:releaseReference	()V
    //   87: aload 5
    //   89: athrow
    //   90: astore 5
    //   92: aload_0
    //   93: invokevirtual 50	org/sqlite/database/sqlite/SQLiteQuery:releaseReference	()V
    //   96: aload 5
    //   98: athrow
    //   99: astore 5
    //   101: ldc 9
    //   103: astore 6
    //   105: new 55	java/lang/StringBuilder
    //   108: astore 7
    //   110: aload 7
    //   112: invokespecial 57	java/lang/StringBuilder:<init>	()V
    //   115: ldc 59
    //   117: astore 10
    //   119: aload 7
    //   121: aload 10
    //   123: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: astore 7
    //   128: aload 5
    //   130: invokevirtual 68	org/sqlite/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   133: astore 10
    //   135: aload 7
    //   137: aload 10
    //   139: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: astore 7
    //   144: ldc 70
    //   146: astore 10
    //   148: aload 7
    //   150: aload 10
    //   152: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: astore 7
    //   157: aload_0
    //   158: invokevirtual 32	org/sqlite/database/sqlite/SQLiteQuery:getSql	()Ljava/lang/String;
    //   161: astore 10
    //   163: aload 7
    //   165: aload 10
    //   167: invokevirtual 63	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: astore 7
    //   172: aload 7
    //   174: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   177: astore 7
    //   179: aload 6
    //   181: aload 7
    //   183: invokestatic 79	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   186: pop
    //   187: aload 5
    //   189: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	this	SQLiteQuery
    //   0	190	1	paramCursorWindow	android.database.CursorWindow
    //   0	190	2	paramInt1	int
    //   0	190	3	paramInt2	int
    //   0	190	4	paramBoolean	boolean
    //   12	30	5	localSQLiteSession	SQLiteSession
    //   72	7	5	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   81	7	5	localObject1	Object
    //   90	7	5	localObject2	Object
    //   99	89	5	localSQLiteException	SQLiteException
    //   18	162	6	str	String
    //   24	158	7	localObject3	Object
    //   30	23	8	i	int
    //   36	19	9	localCancellationSignal	CancellationSignal
    //   39	127	10	localObject4	Object
    //   59	11	11	j	int
    // Exception table:
    //   from	to	target	type
    //   8	12	72	org/sqlite/database/sqlite/SQLiteDatabaseCorruptException
    //   14	18	72	org/sqlite/database/sqlite/SQLiteDatabaseCorruptException
    //   20	24	72	org/sqlite/database/sqlite/SQLiteDatabaseCorruptException
    //   26	30	72	org/sqlite/database/sqlite/SQLiteDatabaseCorruptException
    //   32	36	72	org/sqlite/database/sqlite/SQLiteDatabaseCorruptException
    //   54	59	72	org/sqlite/database/sqlite/SQLiteDatabaseCorruptException
    //   8	12	81	finally
    //   14	18	81	finally
    //   20	24	81	finally
    //   26	30	81	finally
    //   32	36	81	finally
    //   54	59	81	finally
    //   74	78	81	finally
    //   78	81	81	finally
    //   105	108	81	finally
    //   110	115	81	finally
    //   121	126	81	finally
    //   128	133	81	finally
    //   137	142	81	finally
    //   150	155	81	finally
    //   157	161	81	finally
    //   165	170	81	finally
    //   172	177	81	finally
    //   181	187	81	finally
    //   187	190	81	finally
    //   4	8	90	finally
    //   61	65	90	finally
    //   83	87	90	finally
    //   87	90	90	finally
    //   8	12	99	org/sqlite/database/sqlite/SQLiteException
    //   14	18	99	org/sqlite/database/sqlite/SQLiteException
    //   20	24	99	org/sqlite/database/sqlite/SQLiteException
    //   26	30	99	org/sqlite/database/sqlite/SQLiteException
    //   32	36	99	org/sqlite/database/sqlite/SQLiteException
    //   54	59	99	org/sqlite/database/sqlite/SQLiteException
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("SQLiteQuery: ");
    String str = getSql();
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/sqlite/SQLiteQuery.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */