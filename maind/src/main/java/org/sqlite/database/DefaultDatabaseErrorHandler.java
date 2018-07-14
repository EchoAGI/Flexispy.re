package org.sqlite.database;

import android.util.Log;
import java.io.File;
import org.sqlite.database.sqlite.SQLiteDatabase;

public final class DefaultDatabaseErrorHandler
  implements DatabaseErrorHandler
{
  private static final String TAG = "DefaultDatabaseErrorHandler";
  
  private void deleteDatabaseFile(String paramString)
  {
    Object localObject1 = ":memory:";
    boolean bool = paramString.equalsIgnoreCase((String)localObject1);
    if (!bool)
    {
      localObject1 = paramString.trim();
      int i = ((String)localObject1).length();
      if (i != 0) {
        break label28;
      }
    }
    for (;;)
    {
      return;
      label28:
      localObject1 = "DefaultDatabaseErrorHandler";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = "deleting the database file: ";
      localObject2 = (String)localObject3 + paramString;
      Log.e((String)localObject1, (String)localObject2);
      try
      {
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString);
        SQLiteDatabase.deleteDatabase((File)localObject1);
      }
      catch (Exception localException)
      {
        localObject2 = "DefaultDatabaseErrorHandler";
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str2 = "delete failed: ";
        localObject3 = ((StringBuilder)localObject3).append(str2);
        String str1 = localException.getMessage();
        str1 = str1;
        Log.w((String)localObject2, str1);
      }
    }
  }
  
  /* Error */
  public void onCorruption(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: ldc 11
    //   2: astore_2
    //   3: new 33	java/lang/StringBuilder
    //   6: astore_3
    //   7: aload_3
    //   8: invokespecial 34	java/lang/StringBuilder:<init>	()V
    //   11: aload_3
    //   12: ldc 72
    //   14: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   17: astore_3
    //   18: aload_1
    //   19: invokevirtual 75	org/sqlite/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   22: astore 4
    //   24: aload_3
    //   25: aload 4
    //   27: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: invokevirtual 43	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   33: astore_3
    //   34: aload_2
    //   35: aload_3
    //   36: invokestatic 49	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   39: pop
    //   40: invokestatic 79	org/sqlite/database/sqlite/SQLiteDatabase:hasCodec	()Z
    //   43: istore 5
    //   45: iload 5
    //   47: ifeq +4 -> 51
    //   50: return
    //   51: aload_1
    //   52: invokevirtual 82	org/sqlite/database/sqlite/SQLiteDatabase:isOpen	()Z
    //   55: istore 5
    //   57: iload 5
    //   59: ifne +16 -> 75
    //   62: aload_1
    //   63: invokevirtual 75	org/sqlite/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   66: astore_2
    //   67: aload_0
    //   68: aload_2
    //   69: invokespecial 85	org/sqlite/database/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   72: goto -22 -> 50
    //   75: aconst_null
    //   76: astore_3
    //   77: aload_1
    //   78: invokevirtual 89	org/sqlite/database/sqlite/SQLiteDatabase:getAttachedDbs	()Ljava/util/List;
    //   81: astore_3
    //   82: aload_1
    //   83: invokevirtual 92	org/sqlite/database/sqlite/SQLiteDatabase:close	()V
    //   86: aload_3
    //   87: ifnull +67 -> 154
    //   90: aload_3
    //   91: invokeinterface 98 1 0
    //   96: astore_3
    //   97: aload_3
    //   98: invokeinterface 103 1 0
    //   103: istore 5
    //   105: iload 5
    //   107: ifeq -57 -> 50
    //   110: aload_3
    //   111: invokeinterface 107 1 0
    //   116: checkcast 109	android/util/Pair
    //   119: getfield 113	android/util/Pair:second	Ljava/lang/Object;
    //   122: checkcast 19	java/lang/String
    //   125: astore_2
    //   126: aload_0
    //   127: aload_2
    //   128: invokespecial 85	org/sqlite/database/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   131: goto -34 -> 97
    //   134: aload_1
    //   135: invokevirtual 75	org/sqlite/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   138: astore_2
    //   139: aload_0
    //   140: aload_2
    //   141: invokespecial 85	org/sqlite/database/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   144: aload_3
    //   145: athrow
    //   146: astore_2
    //   147: goto -65 -> 82
    //   150: astore_2
    //   151: goto -65 -> 86
    //   154: aload_1
    //   155: invokevirtual 75	org/sqlite/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   158: astore_2
    //   159: aload_0
    //   160: aload_2
    //   161: invokespecial 85	org/sqlite/database/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   164: goto -114 -> 50
    //   167: astore 6
    //   169: iconst_0
    //   170: istore 5
    //   172: aconst_null
    //   173: astore_2
    //   174: aload 6
    //   176: astore_3
    //   177: aload_2
    //   178: ifnull -44 -> 134
    //   181: aload_2
    //   182: invokeinterface 98 1 0
    //   187: astore 4
    //   189: aload 4
    //   191: invokeinterface 103 1 0
    //   196: istore 5
    //   198: iload 5
    //   200: ifeq -56 -> 144
    //   203: aload 4
    //   205: invokeinterface 107 1 0
    //   210: checkcast 109	android/util/Pair
    //   213: getfield 113	android/util/Pair:second	Ljava/lang/Object;
    //   216: checkcast 19	java/lang/String
    //   219: astore_2
    //   220: aload_0
    //   221: aload_2
    //   222: invokespecial 85	org/sqlite/database/DefaultDatabaseErrorHandler:deleteDatabaseFile	(Ljava/lang/String;)V
    //   225: goto -36 -> 189
    //   228: astore 6
    //   230: aload_3
    //   231: astore_2
    //   232: aload 6
    //   234: astore_3
    //   235: goto -58 -> 177
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	238	0	this	DefaultDatabaseErrorHandler
    //   0	238	1	paramSQLiteDatabase	SQLiteDatabase
    //   2	139	2	str	String
    //   146	1	2	localSQLiteException1	org.sqlite.database.sqlite.SQLiteException
    //   150	1	2	localSQLiteException2	org.sqlite.database.sqlite.SQLiteException
    //   158	74	2	localObject1	Object
    //   6	229	3	localObject2	Object
    //   22	182	4	localObject3	Object
    //   43	156	5	bool	boolean
    //   167	8	6	localObject4	Object
    //   228	5	6	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   77	81	146	org/sqlite/database/sqlite/SQLiteException
    //   82	86	150	org/sqlite/database/sqlite/SQLiteException
    //   77	81	167	finally
    //   82	86	228	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/sqlite/database/DefaultDatabaseErrorHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */