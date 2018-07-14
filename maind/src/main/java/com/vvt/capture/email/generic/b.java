package com.vvt.capture.email.generic;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vvt.io.p;
import com.vvt.p.c;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b
{
  private static boolean a = true;
  private static boolean b;
  private static boolean c;
  private static boolean d;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = a;; bool = false)
    {
      b = bool;
      c = com.vvt.ak.a.b;
      d = com.vvt.ak.a.e;
      return;
    }
  }
  
  /* Error */
  public static long a(int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: lconst_0
    //   5: lstore 4
    //   7: bipush 17
    //   9: istore 6
    //   11: iload 6
    //   13: aload_1
    //   14: invokestatic 31	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   17: astore 7
    //   19: aload 7
    //   21: ifnull +126 -> 147
    //   24: ldc 33
    //   26: astore 8
    //   28: iconst_4
    //   29: istore 9
    //   31: iload 9
    //   33: anewarray 4	java/lang/Object
    //   36: astore 10
    //   38: iconst_0
    //   39: istore 11
    //   41: ldc 36
    //   43: astore 12
    //   45: aload 10
    //   47: iconst_0
    //   48: aload 12
    //   50: aastore
    //   51: iconst_1
    //   52: istore 11
    //   54: ldc 38
    //   56: astore 12
    //   58: aload 10
    //   60: iload 11
    //   62: aload 12
    //   64: aastore
    //   65: iconst_2
    //   66: istore 11
    //   68: ldc 36
    //   70: astore 12
    //   72: aload 10
    //   74: iload 11
    //   76: aload 12
    //   78: aastore
    //   79: iconst_3
    //   80: istore 11
    //   82: iload_0
    //   83: invokestatic 46	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: astore 12
    //   88: aload 10
    //   90: iload 11
    //   92: aload 12
    //   94: aastore
    //   95: aload 8
    //   97: aload 10
    //   99: invokestatic 52	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   102: astore 8
    //   104: iconst_0
    //   105: istore 9
    //   107: aconst_null
    //   108: astore 10
    //   110: aload 7
    //   112: aload 8
    //   114: aconst_null
    //   115: invokevirtual 58	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   118: astore_3
    //   119: aload_3
    //   120: invokeinterface 64 1 0
    //   125: istore 13
    //   127: iload 13
    //   129: ifeq +18 -> 147
    //   132: iconst_0
    //   133: istore 13
    //   135: aconst_null
    //   136: astore 8
    //   138: aload_3
    //   139: iconst_0
    //   140: invokeinterface 68 2 0
    //   145: lstore 4
    //   147: aload_3
    //   148: ifnull +9 -> 157
    //   151: aload_3
    //   152: invokeinterface 72 1 0
    //   157: aload 7
    //   159: ifnull +8 -> 167
    //   162: aload 7
    //   164: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   167: getstatic 20	com/vvt/capture/email/generic/removeFromPath:MyUncaughtExceptionHandler	Z
    //   170: istore_2
    //   171: iload_2
    //   172: ifeq +3 -> 175
    //   175: lload 4
    //   177: lreturn
    //   178: astore 7
    //   180: iconst_0
    //   181: istore 6
    //   183: aconst_null
    //   184: astore 7
    //   186: getstatic 25	com/vvt/capture/email/generic/removeFromPath:d	Z
    //   189: istore 13
    //   191: iload 13
    //   193: ifeq +3 -> 196
    //   196: aload_3
    //   197: ifnull +9 -> 206
    //   200: aload_3
    //   201: invokeinterface 72 1 0
    //   206: aload 7
    //   208: ifnull -41 -> 167
    //   211: goto -49 -> 162
    //   214: astore 14
    //   216: iconst_0
    //   217: istore 6
    //   219: aconst_null
    //   220: astore 7
    //   222: aload_3
    //   223: ifnull +9 -> 232
    //   226: aload_3
    //   227: invokeinterface 72 1 0
    //   232: aload 7
    //   234: ifnull +8 -> 242
    //   237: aload 7
    //   239: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   242: aload 14
    //   244: athrow
    //   245: astore 14
    //   247: goto -25 -> 222
    //   250: astore 8
    //   252: goto -66 -> 186
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	255	0	paramInt	int
    //   0	255	1	paramString	String
    //   1	171	2	bool1	boolean
    //   3	224	3	localCursor	Cursor
    //   5	171	4	l	long
    //   9	209	6	i	int
    //   17	146	7	localSQLiteDatabase	SQLiteDatabase
    //   178	1	7	localException1	Exception
    //   184	54	7	localObject1	Object
    //   26	111	8	str	String
    //   250	1	8	localException2	Exception
    //   29	77	9	j	int
    //   36	73	10	arrayOfObject	Object[]
    //   39	52	11	k	int
    //   43	50	12	localObject2	Object
    //   125	67	13	bool2	boolean
    //   214	29	14	localObject3	Object
    //   245	1	14	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   13	17	178	java/lang/Exception
    //   13	17	214	finally
    //   31	36	245	finally
    //   48	51	245	finally
    //   62	65	245	finally
    //   76	79	245	finally
    //   82	86	245	finally
    //   92	95	245	finally
    //   97	102	245	finally
    //   114	118	245	finally
    //   119	125	245	finally
    //   139	145	245	finally
    //   186	189	245	finally
    //   31	36	250	java/lang/Exception
    //   48	51	250	java/lang/Exception
    //   62	65	250	java/lang/Exception
    //   76	79	250	java/lang/Exception
    //   82	86	250	java/lang/Exception
    //   92	95	250	java/lang/Exception
    //   97	102	250	java/lang/Exception
    //   114	118	250	java/lang/Exception
    //   119	125	250	java/lang/Exception
    //   139	145	250	java/lang/Exception
  }
  
  private static long a(SQLiteDatabase paramSQLiteDatabase)
  {
    localCursor = null;
    long l = 0L;
    String str1 = "SELECT MAX(%s) FROM %s";
    int i = 2;
    try
    {
      Object[] arrayOfObject = new Object[i];
      int j = 0;
      String str2 = "_id";
      arrayOfObject[0] = str2;
      j = 1;
      str2 = "message";
      arrayOfObject[j] = str2;
      str1 = String.format(str1, arrayOfObject);
      i = 0;
      arrayOfObject = null;
      localCursor = paramSQLiteDatabase.rawQuery(str1, null);
      bool = localCursor.moveToNext();
      if (bool)
      {
        bool = false;
        str1 = null;
        l = localCursor.getLong(0);
      }
      if (localCursor == null) {
        break label105;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = d;
        if ((bool) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label138;
      }
      localCursor.close();
    }
    localCursor.close();
    label105:
    return l;
  }
  
  public static String a()
  {
    String str1 = c();
    boolean bool = com.vvt.ag.b.a(str1);
    if (!bool)
    {
      String str2 = "%s/%s";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      int j = 1;
      String str3 = "EmailProvider.db";
      arrayOfObject[j] = str3;
      str1 = String.format(str2, arrayOfObject);
      bool = ShellUtil.b(str1);
      if (!bool)
      {
        j = 0;
        str1 = null;
      }
    }
    return str1;
  }
  
  private static String a(long paramLong)
  {
    Object localObject = null;
    boolean bool1 = b;
    if (bool1) {}
    String str1 = g();
    boolean bool2 = com.vvt.ag.b.a(str1);
    if (!bool2)
    {
      String str2 = "%s/%s.db_att";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      bool1 = true;
      Long localLong = Long.valueOf(paramLong);
      arrayOfObject[bool1] = localLong;
      str1 = String.format(str2, arrayOfObject);
      bool2 = ShellUtil.b(str1);
      if (bool2) {
        break label92;
      }
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return (String)localObject;
      label92:
      localObject = str1;
    }
  }
  
  public static String a(String paramString)
  {
    return p.a(paramString, "email");
  }
  
  /* Error */
  public static String a(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: bipush 17
    //   4: istore_3
    //   5: iload_3
    //   6: aload_0
    //   7: invokestatic 31	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   10: astore 4
    //   12: ldc 115
    //   14: astore 5
    //   16: iconst_1
    //   17: istore 6
    //   19: iload 6
    //   21: anewarray 4	java/lang/Object
    //   24: astore 7
    //   26: aload 7
    //   28: iconst_0
    //   29: aload_1
    //   30: aastore
    //   31: aload 5
    //   33: aload 7
    //   35: invokestatic 52	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   38: astore 5
    //   40: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   43: istore 6
    //   45: iload 6
    //   47: ifeq +3 -> 50
    //   50: iconst_0
    //   51: istore 6
    //   53: aconst_null
    //   54: astore 7
    //   56: aload 4
    //   58: aload 5
    //   60: aconst_null
    //   61: invokevirtual 58	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   64: astore 5
    //   66: aload 5
    //   68: ifnull +58 -> 126
    //   71: aload 5
    //   73: invokeinterface 80 1 0
    //   78: istore 6
    //   80: iload 6
    //   82: ifeq +44 -> 126
    //   85: ldc 117
    //   87: astore 7
    //   89: aload 5
    //   91: aload 7
    //   93: invokeinterface 121 2 0
    //   98: istore 6
    //   100: aload 5
    //   102: iload 6
    //   104: invokeinterface 125 2 0
    //   109: astore_2
    //   110: aload_2
    //   111: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   114: istore 6
    //   116: iload 6
    //   118: ifne +8 -> 126
    //   121: aload_2
    //   122: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   125: astore_2
    //   126: aload 5
    //   128: ifnull +10 -> 138
    //   131: aload 5
    //   133: invokeinterface 72 1 0
    //   138: aload 4
    //   140: ifnull +8 -> 148
    //   143: aload 4
    //   145: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   148: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   151: istore_3
    //   152: iload_3
    //   153: ifeq +3 -> 156
    //   156: aload_2
    //   157: areturn
    //   158: astore 5
    //   160: iconst_0
    //   161: istore_3
    //   162: aconst_null
    //   163: astore 5
    //   165: aconst_null
    //   166: astore 4
    //   168: getstatic 25	com/vvt/capture/email/generic/removeFromPath:d	Z
    //   171: istore 6
    //   173: iload 6
    //   175: ifeq +3 -> 178
    //   178: aload 5
    //   180: ifnull +10 -> 190
    //   183: aload 5
    //   185: invokeinterface 72 1 0
    //   190: aload 4
    //   192: ifnull -44 -> 148
    //   195: goto -52 -> 143
    //   198: astore 5
    //   200: aconst_null
    //   201: astore 4
    //   203: aconst_null
    //   204: astore 8
    //   206: aload 5
    //   208: astore_2
    //   209: iconst_0
    //   210: istore_3
    //   211: aconst_null
    //   212: astore 5
    //   214: aload 5
    //   216: ifnull +10 -> 226
    //   219: aload 5
    //   221: invokeinterface 72 1 0
    //   226: aload 4
    //   228: ifnull +8 -> 236
    //   231: aload 4
    //   233: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   236: aload_2
    //   237: athrow
    //   238: astore 8
    //   240: iconst_0
    //   241: istore_3
    //   242: aconst_null
    //   243: astore 5
    //   245: aload 8
    //   247: astore_2
    //   248: goto -34 -> 214
    //   251: astore_2
    //   252: goto -38 -> 214
    //   255: astore 5
    //   257: iconst_0
    //   258: istore_3
    //   259: aconst_null
    //   260: astore 5
    //   262: goto -94 -> 168
    //   265: astore 7
    //   267: goto -99 -> 168
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	270	0	paramString1	String
    //   0	270	1	paramString2	String
    //   1	247	2	localObject1	Object
    //   251	1	2	localObject2	Object
    //   4	2	3	i	int
    //   151	108	3	bool1	boolean
    //   10	222	4	localSQLiteDatabase	SQLiteDatabase
    //   14	118	5	localObject3	Object
    //   158	1	5	localException1	Exception
    //   163	21	5	localObject4	Object
    //   198	9	5	localObject5	Object
    //   212	32	5	localObject6	Object
    //   255	1	5	localException2	Exception
    //   260	1	5	localObject7	Object
    //   17	64	6	bool2	boolean
    //   98	5	6	j	int
    //   114	60	6	bool3	boolean
    //   24	68	7	localObject8	Object
    //   265	1	7	localException3	Exception
    //   204	1	8	localObject9	Object
    //   238	8	8	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   6	10	158	java/lang/Exception
    //   6	10	198	finally
    //   19	24	238	finally
    //   29	31	238	finally
    //   33	38	238	finally
    //   40	43	238	finally
    //   60	64	238	finally
    //   71	78	251	finally
    //   91	98	251	finally
    //   102	109	251	finally
    //   110	114	251	finally
    //   121	125	251	finally
    //   168	171	251	finally
    //   19	24	255	java/lang/Exception
    //   29	31	255	java/lang/Exception
    //   33	38	255	java/lang/Exception
    //   40	43	255	java/lang/Exception
    //   60	64	255	java/lang/Exception
    //   71	78	265	java/lang/Exception
    //   91	98	265	java/lang/Exception
    //   102	109	265	java/lang/Exception
    //   110	114	265	java/lang/Exception
    //   121	125	265	java/lang/Exception
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    bool1 = ShellUtil.b(paramString2);
    Object localObject1 = d(paramString1);
    String str1 = p.a((String)localObject1, paramString3);
    String str2;
    int i;
    if (bool1)
    {
      str2 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
      i = 5;
    }
    for (;;)
    {
      try
      {
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        String str3 = null;
        arrayOfObject[0] = localObject1;
        j = 1;
        arrayOfObject[j] = localObject1;
        j = 2;
        arrayOfObject[j] = paramString4;
        j = 3;
        arrayOfObject[j] = paramString4;
        j = 4;
        arrayOfObject[j] = localObject1;
        str2 = String.format(str2, arrayOfObject);
        KMShell.a(str2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k((String)localObject1);
        }
        str2 = "%s cp -f -- '%s' %s; chmod 777 %s; chown %s.%s %s";
        int k = 7;
        localObject1 = new Object[k];
        i = 0;
        arrayOfObject = null;
        str3 = b(paramString1);
        localObject1[0] = str3;
        i = 1;
        localObject1[i] = paramString2;
        i = 2;
        localObject1[i] = str1;
        i = 3;
        localObject1[i] = str1;
        i = 4;
        localObject1[i] = paramString4;
        i = 5;
        localObject1[i] = paramString4;
        i = 6;
        localObject1[i] = str1;
        str2 = String.format(str2, (Object[])localObject1);
        KMShell.a(str2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k(str1);
        }
        bool1 = b;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        boolean bool2 = false;
        Object localObject2 = null;
        bool1 = d;
        if (!bool1) {
          continue;
        }
        continue;
      }
      return str1;
      bool2 = b;
      if (bool2) {}
      bool2 = false;
      str1 = null;
    }
  }
  
  /* Error */
  private static java.util.HashMap a(long paramLong1, long paramLong2, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: new 156	java/util/HashMap
    //   6: astore 6
    //   8: aload 6
    //   10: invokespecial 159	java/util/HashMap:<init>	()V
    //   13: bipush 8
    //   15: anewarray 4	java/lang/Object
    //   18: astore 7
    //   20: aload 7
    //   22: iconst_0
    //   23: ldc -92
    //   25: aastore
    //   26: aload 7
    //   28: iconst_1
    //   29: ldc -90
    //   31: aastore
    //   32: aload 7
    //   34: iconst_2
    //   35: ldc -88
    //   37: aastore
    //   38: aload 7
    //   40: iconst_3
    //   41: ldc -86
    //   43: aastore
    //   44: aload 7
    //   46: iconst_4
    //   47: ldc -92
    //   49: aastore
    //   50: lload_0
    //   51: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   54: astore 8
    //   56: aload 7
    //   58: iconst_5
    //   59: aload 8
    //   61: aastore
    //   62: aload 7
    //   64: bipush 6
    //   66: ldc -92
    //   68: aastore
    //   69: bipush 7
    //   71: istore 9
    //   73: lload_2
    //   74: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   77: astore 8
    //   79: aload 7
    //   81: iload 9
    //   83: aload 8
    //   85: aastore
    //   86: ldc -95
    //   88: aload 7
    //   90: invokestatic 52	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   93: astore 10
    //   95: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   98: istore 11
    //   100: iload 11
    //   102: ifeq +3 -> 105
    //   105: ldc2_w 171
    //   108: lstore 12
    //   110: lload 12
    //   112: invokestatic 180	android/os/SystemClock:sleep	(J)V
    //   115: iconst_0
    //   116: istore 11
    //   118: aconst_null
    //   119: astore 7
    //   121: aload 4
    //   123: aload 10
    //   125: aconst_null
    //   126: invokevirtual 58	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   129: astore 5
    //   131: aload 5
    //   133: invokeinterface 80 1 0
    //   138: istore 14
    //   140: iload 14
    //   142: ifeq +194 -> 336
    //   145: ldc -92
    //   147: astore 10
    //   149: aload 5
    //   151: aload 10
    //   153: invokeinterface 121 2 0
    //   158: istore 14
    //   160: aload 5
    //   162: iload 14
    //   164: invokeinterface 184 2 0
    //   169: istore 14
    //   171: iload 14
    //   173: i2l
    //   174: lstore 12
    //   176: ldc -90
    //   178: astore 10
    //   180: aload 5
    //   182: aload 10
    //   184: invokeinterface 121 2 0
    //   189: istore 14
    //   191: aload 5
    //   193: iload 14
    //   195: invokeinterface 125 2 0
    //   200: astore 10
    //   202: aload 10
    //   204: ifnull +22 -> 226
    //   207: aload 10
    //   209: invokevirtual 187	java/lang/String:trim	()Ljava/lang/String;
    //   212: astore 8
    //   214: aload 8
    //   216: invokevirtual 191	java/lang/String:length	()I
    //   219: istore 15
    //   221: iload 15
    //   223: ifne +29 -> 252
    //   226: ldc -88
    //   228: astore 10
    //   230: aload 5
    //   232: aload 10
    //   234: invokeinterface 121 2 0
    //   239: istore 14
    //   241: aload 5
    //   243: iload 14
    //   245: invokeinterface 125 2 0
    //   250: astore 10
    //   252: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   255: istore 15
    //   257: iload 15
    //   259: ifeq +3 -> 262
    //   262: lload 12
    //   264: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   267: astore 7
    //   269: aload 6
    //   271: aload 7
    //   273: aload 10
    //   275: invokevirtual 195	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   278: pop
    //   279: goto -148 -> 131
    //   282: astore 10
    //   284: getstatic 25	com/vvt/capture/email/generic/removeFromPath:d	Z
    //   287: istore 14
    //   289: iload 14
    //   291: ifeq +3 -> 294
    //   294: aload 5
    //   296: ifnull +10 -> 306
    //   299: aload 5
    //   301: invokeinterface 72 1 0
    //   306: aload 6
    //   308: areturn
    //   309: astore 16
    //   311: iconst_0
    //   312: istore 14
    //   314: aconst_null
    //   315: astore 10
    //   317: aload 16
    //   319: astore 5
    //   321: aload 10
    //   323: ifnull +10 -> 333
    //   326: aload 10
    //   328: invokeinterface 72 1 0
    //   333: aload 5
    //   335: athrow
    //   336: aload 5
    //   338: ifnull -32 -> 306
    //   341: goto -42 -> 299
    //   344: astore 16
    //   346: aload 5
    //   348: astore 10
    //   350: aload 16
    //   352: astore 5
    //   354: goto -33 -> 321
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	357	0	paramLong1	long
    //   0	357	2	paramLong2	long
    //   0	357	4	paramSQLiteDatabase	SQLiteDatabase
    //   1	352	5	localObject1	Object
    //   6	301	6	localHashMap	java.util.HashMap
    //   18	254	7	localObject2	Object
    //   54	161	8	localObject3	Object
    //   71	11	9	i	int
    //   93	181	10	str	String
    //   282	1	10	localException	Exception
    //   315	34	10	localObject4	Object
    //   98	19	11	bool1	boolean
    //   108	155	12	l	long
    //   138	3	14	bool2	boolean
    //   158	86	14	j	int
    //   287	26	14	bool3	boolean
    //   219	3	15	k	int
    //   255	3	15	bool4	boolean
    //   309	9	16	localObject5	Object
    //   344	7	16	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   110	115	282	java/lang/Exception
    //   125	129	282	java/lang/Exception
    //   131	138	282	java/lang/Exception
    //   151	158	282	java/lang/Exception
    //   162	169	282	java/lang/Exception
    //   182	189	282	java/lang/Exception
    //   193	200	282	java/lang/Exception
    //   207	212	282	java/lang/Exception
    //   214	219	282	java/lang/Exception
    //   232	239	282	java/lang/Exception
    //   243	250	282	java/lang/Exception
    //   252	255	282	java/lang/Exception
    //   262	267	282	java/lang/Exception
    //   273	279	282	java/lang/Exception
    //   110	115	309	finally
    //   125	129	309	finally
    //   131	138	344	finally
    //   151	158	344	finally
    //   162	169	344	finally
    //   182	189	344	finally
    //   193	200	344	finally
    //   207	212	344	finally
    //   214	219	344	finally
    //   232	239	344	finally
    //   243	250	344	finally
    //   252	255	344	finally
    //   262	267	344	finally
    //   273	279	344	finally
    //   284	287	344	finally
  }
  
  /* Error */
  private static java.util.HashMap a(long paramLong1, long paramLong2, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 156	java/util/HashMap
    //   3: astore 7
    //   5: aload 7
    //   7: invokespecial 159	java/util/HashMap:<init>	()V
    //   10: ldc -59
    //   12: astore 8
    //   14: bipush 41
    //   16: istore 9
    //   18: iload 9
    //   20: anewarray 4	java/lang/Object
    //   23: astore 10
    //   25: aconst_null
    //   26: astore 11
    //   28: aload 10
    //   30: iconst_0
    //   31: ldc -56
    //   33: aastore
    //   34: aload 10
    //   36: iconst_1
    //   37: ldc 36
    //   39: aastore
    //   40: aload 10
    //   42: iconst_2
    //   43: ldc -56
    //   45: aastore
    //   46: aload 10
    //   48: iconst_3
    //   49: ldc -92
    //   51: aastore
    //   52: aload 10
    //   54: iconst_4
    //   55: ldc -56
    //   57: aastore
    //   58: aload 10
    //   60: iconst_5
    //   61: ldc -54
    //   63: aastore
    //   64: aload 10
    //   66: bipush 6
    //   68: ldc -56
    //   70: aastore
    //   71: aload 10
    //   73: bipush 7
    //   75: ldc -52
    //   77: aastore
    //   78: aload 10
    //   80: bipush 8
    //   82: ldc -56
    //   84: aastore
    //   85: aload 10
    //   87: bipush 9
    //   89: ldc -49
    //   91: aastore
    //   92: aload 10
    //   94: bipush 10
    //   96: ldc -46
    //   98: aastore
    //   99: aload 10
    //   101: bipush 11
    //   103: ldc -43
    //   105: aastore
    //   106: aload 10
    //   108: bipush 12
    //   110: ldc -40
    //   112: aastore
    //   113: aload 10
    //   115: bipush 13
    //   117: ldc -37
    //   119: aastore
    //   120: aload 10
    //   122: bipush 14
    //   124: ldc -56
    //   126: aastore
    //   127: aload 10
    //   129: bipush 15
    //   131: ldc 38
    //   133: aastore
    //   134: aload 10
    //   136: bipush 16
    //   138: ldc -46
    //   140: aastore
    //   141: aload 10
    //   143: bipush 17
    //   145: ldc 38
    //   147: aastore
    //   148: aload 10
    //   150: bipush 18
    //   152: ldc 36
    //   154: aastore
    //   155: aload 10
    //   157: bipush 19
    //   159: ldc 38
    //   161: aastore
    //   162: aload 10
    //   164: bipush 20
    //   166: ldc -43
    //   168: aastore
    //   169: aload 10
    //   171: bipush 21
    //   173: ldc 38
    //   175: aastore
    //   176: aload 10
    //   178: bipush 22
    //   180: ldc -56
    //   182: aastore
    //   183: aload 10
    //   185: bipush 23
    //   187: ldc -92
    //   189: aastore
    //   190: aload 10
    //   192: bipush 24
    //   194: ldc 36
    //   196: aastore
    //   197: aload 10
    //   199: bipush 25
    //   201: ldc -40
    //   203: aastore
    //   204: aload 10
    //   206: bipush 26
    //   208: ldc 36
    //   210: aastore
    //   211: aload 10
    //   213: bipush 27
    //   215: ldc -40
    //   217: aastore
    //   218: aload 10
    //   220: bipush 28
    //   222: ldc -21
    //   224: aastore
    //   225: aload 10
    //   227: bipush 29
    //   229: ldc -37
    //   231: aastore
    //   232: aload 10
    //   234: bipush 30
    //   236: ldc -40
    //   238: aastore
    //   239: aload 10
    //   241: bipush 31
    //   243: ldc -40
    //   245: aastore
    //   246: aload 10
    //   248: bipush 32
    //   250: ldc -43
    //   252: aastore
    //   253: aload 10
    //   255: bipush 33
    //   257: ldc -40
    //   259: aastore
    //   260: aload 10
    //   262: bipush 34
    //   264: ldc 36
    //   266: aastore
    //   267: aload 10
    //   269: bipush 35
    //   271: ldc -56
    //   273: aastore
    //   274: aload 10
    //   276: bipush 36
    //   278: ldc -92
    //   280: aastore
    //   281: lload_0
    //   282: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   285: astore 12
    //   287: aload 10
    //   289: bipush 37
    //   291: aload 12
    //   293: aastore
    //   294: aload 10
    //   296: bipush 38
    //   298: ldc -56
    //   300: aastore
    //   301: aload 10
    //   303: bipush 39
    //   305: ldc -92
    //   307: aastore
    //   308: bipush 40
    //   310: istore 13
    //   312: lload_2
    //   313: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   316: astore 12
    //   318: aload 10
    //   320: iload 13
    //   322: aload 12
    //   324: aastore
    //   325: aload 8
    //   327: aload 10
    //   329: invokestatic 52	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   332: astore 12
    //   334: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   337: istore 14
    //   339: iload 14
    //   341: ifeq +3 -> 344
    //   344: iconst_0
    //   345: istore 14
    //   347: aconst_null
    //   348: astore 8
    //   350: ldc2_w 171
    //   353: lstore 15
    //   355: lload 15
    //   357: invokestatic 180	android/os/SystemClock:sleep	(J)V
    //   360: aload 4
    //   362: lload_0
    //   363: lload_2
    //   364: invokestatic 250	com/vvt/capture/email/generic/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;JJ)Z
    //   367: istore 17
    //   369: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   372: istore 9
    //   374: iload 9
    //   376: ifeq +3 -> 379
    //   379: iconst_0
    //   380: istore 9
    //   382: aconst_null
    //   383: astore 10
    //   385: iconst_5
    //   386: istore 13
    //   388: iload 9
    //   390: iload 13
    //   392: if_icmpge +93 -> 485
    //   395: ldc2_w 171
    //   398: lstore 18
    //   400: lload 18
    //   402: invokestatic 180	android/os/SystemClock:sleep	(J)V
    //   405: iconst_0
    //   406: istore 13
    //   408: aconst_null
    //   409: astore 11
    //   411: aload 4
    //   413: aload 12
    //   415: aconst_null
    //   416: invokevirtual 58	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   419: astore 8
    //   421: aload 8
    //   423: ifnull +53 -> 476
    //   426: aload 8
    //   428: invokeinterface 253 1 0
    //   433: istore 13
    //   435: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   438: istore 20
    //   440: iload 20
    //   442: ifeq +3 -> 445
    //   445: iload 13
    //   447: ifne +38 -> 485
    //   450: iload 17
    //   452: ifeq +33 -> 485
    //   455: aload 8
    //   457: ifnull +10 -> 467
    //   460: aload 8
    //   462: invokeinterface 72 1 0
    //   467: iload 9
    //   469: iconst_1
    //   470: iadd
    //   471: istore 9
    //   473: goto -88 -> 385
    //   476: iconst_0
    //   477: istore 13
    //   479: aconst_null
    //   480: astore 11
    //   482: goto -47 -> 435
    //   485: aload 8
    //   487: astore 10
    //   489: ldc -1
    //   491: astore 8
    //   493: new 257	java/io/File
    //   496: astore 11
    //   498: ldc -1
    //   500: astore 12
    //   502: aload 11
    //   504: aload 12
    //   506: invokespecial 259	java/io/File:<init>	(Ljava/lang/String;)V
    //   509: aload 11
    //   511: invokevirtual 262	java/io/File:getName	()Ljava/lang/String;
    //   514: astore 11
    //   516: aload 5
    //   518: aload 8
    //   520: aload 11
    //   522: aload 6
    //   524: invokestatic 265	com/vvt/capture/email/generic/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   527: astore 12
    //   529: aload 10
    //   531: invokeinterface 80 1 0
    //   536: istore 14
    //   538: iload 14
    //   540: ifeq +512 -> 1052
    //   543: iconst_0
    //   544: istore 14
    //   546: aconst_null
    //   547: astore 8
    //   549: ldc -54
    //   551: astore 11
    //   553: aload 10
    //   555: aload 11
    //   557: invokeinterface 121 2 0
    //   562: istore 13
    //   564: aload 10
    //   566: iload 13
    //   568: invokeinterface 125 2 0
    //   573: astore 21
    //   575: aload 21
    //   577: ifnull -48 -> 529
    //   580: aload 21
    //   582: invokevirtual 187	java/lang/String:trim	()Ljava/lang/String;
    //   585: astore 11
    //   587: aload 11
    //   589: invokevirtual 191	java/lang/String:length	()I
    //   592: istore 13
    //   594: iload 13
    //   596: ifeq -67 -> 529
    //   599: ldc 36
    //   601: astore 11
    //   603: aload 10
    //   605: aload 11
    //   607: invokeinterface 121 2 0
    //   612: istore 13
    //   614: aload 10
    //   616: iload 13
    //   618: invokeinterface 68 2 0
    //   623: lstore 18
    //   625: ldc -92
    //   627: astore 11
    //   629: aload 10
    //   631: aload 11
    //   633: invokeinterface 121 2 0
    //   638: istore 13
    //   640: aload 10
    //   642: iload 13
    //   644: invokeinterface 68 2 0
    //   649: lstore 22
    //   651: ldc -46
    //   653: astore 11
    //   655: aload 10
    //   657: aload 11
    //   659: invokeinterface 121 2 0
    //   664: istore 13
    //   666: aload 10
    //   668: iload 13
    //   670: invokeinterface 68 2 0
    //   675: lstore 24
    //   677: ldc -37
    //   679: astore 11
    //   681: aload 10
    //   683: aload 11
    //   685: invokeinterface 121 2 0
    //   690: istore 13
    //   692: aload 10
    //   694: iload 13
    //   696: invokeinterface 184 2 0
    //   701: istore 13
    //   703: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   706: istore 26
    //   708: iload 26
    //   710: ifeq +3 -> 713
    //   713: iload 13
    //   715: ifeq +49 -> 764
    //   718: aload 12
    //   720: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   723: istore 13
    //   725: iload 13
    //   727: ifne +37 -> 764
    //   730: aload 12
    //   732: aload 21
    //   734: invokestatic 266	com/vvt/capture/email/generic/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   737: astore 8
    //   739: aload 8
    //   741: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   744: istore 13
    //   746: iload 13
    //   748: ifne +16 -> 764
    //   751: aload 5
    //   753: aload 8
    //   755: aload 21
    //   757: aload 6
    //   759: invokestatic 265	com/vvt/capture/email/generic/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   762: astore 8
    //   764: aload 8
    //   766: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   769: istore 13
    //   771: iload 13
    //   773: ifeq +327 -> 1100
    //   776: iconst_0
    //   777: istore 13
    //   779: aconst_null
    //   780: astore 11
    //   782: bipush 6
    //   784: istore 26
    //   786: iload 13
    //   788: iload 26
    //   790: if_icmpge +310 -> 1100
    //   793: ldc2_w 267
    //   796: lstore 27
    //   798: lload 27
    //   800: invokestatic 180	android/os/SystemClock:sleep	(J)V
    //   803: lload 24
    //   805: invokestatic 273	com/vvt/capture/email/generic/removeFromPath:a	(J)Ljava/lang/String;
    //   808: astore 29
    //   810: aload 29
    //   812: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   815: istore 30
    //   817: iload 30
    //   819: ifne +194 -> 1013
    //   822: lload 18
    //   824: invokestatic 276	java/lang/Long:toString	(J)Ljava/lang/String;
    //   827: astore 8
    //   829: aload 29
    //   831: aload 8
    //   833: invokestatic 113	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   836: astore 8
    //   838: lload 18
    //   840: invokestatic 276	java/lang/Long:toString	(J)Ljava/lang/String;
    //   843: astore 29
    //   845: aload 5
    //   847: aload 8
    //   849: aload 29
    //   851: aload 6
    //   853: invokestatic 265	com/vvt/capture/email/generic/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   856: astore 8
    //   858: aload 8
    //   860: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   863: istore 26
    //   865: iload 26
    //   867: ifne +146 -> 1013
    //   870: aload 8
    //   872: astore 11
    //   874: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   877: istore 14
    //   879: iload 14
    //   881: ifeq +3 -> 884
    //   884: lload 22
    //   886: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   889: astore 8
    //   891: aload 7
    //   893: aload 8
    //   895: invokevirtual 280	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   898: istore 14
    //   900: iload 14
    //   902: ifeq +120 -> 1022
    //   905: lload 22
    //   907: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   910: astore 8
    //   912: aload 7
    //   914: aload 8
    //   916: invokevirtual 284	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   919: astore 8
    //   921: aload 8
    //   923: checkcast 286	java/util/List
    //   926: astore 8
    //   928: new 288	com/vvt/capture/email/a
    //   931: astore 31
    //   933: aload 31
    //   935: invokespecial 289	com/vvt/capture/email/a:<init>	()V
    //   938: aload 31
    //   940: aload 21
    //   942: invokevirtual 291	com/vvt/capture/email/a:a	(Ljava/lang/String;)V
    //   945: aload 31
    //   947: aload 11
    //   949: invokevirtual 293	com/vvt/capture/email/a:removeFromPath	(Ljava/lang/String;)V
    //   952: aload 8
    //   954: aload 31
    //   956: invokeinterface 296 2 0
    //   961: pop
    //   962: lload 22
    //   964: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   967: astore 11
    //   969: aload 7
    //   971: aload 11
    //   973: aload 8
    //   975: invokevirtual 195	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   978: pop
    //   979: goto -450 -> 529
    //   982: astore 8
    //   984: aload 10
    //   986: astore 8
    //   988: getstatic 25	com/vvt/capture/email/generic/removeFromPath:d	Z
    //   991: istore 9
    //   993: iload 9
    //   995: ifeq +3 -> 998
    //   998: aload 8
    //   1000: ifnull +10 -> 1010
    //   1003: aload 8
    //   1005: invokeinterface 72 1 0
    //   1010: aload 7
    //   1012: areturn
    //   1013: iload 13
    //   1015: iconst_1
    //   1016: iadd
    //   1017: istore 13
    //   1019: goto -237 -> 782
    //   1022: new 298	java/util/ArrayList
    //   1025: astore 8
    //   1027: aload 8
    //   1029: invokespecial 299	java/util/ArrayList:<init>	()V
    //   1032: goto -104 -> 928
    //   1035: astore 8
    //   1037: aload 10
    //   1039: ifnull +10 -> 1049
    //   1042: aload 10
    //   1044: invokeinterface 72 1 0
    //   1049: aload 8
    //   1051: athrow
    //   1052: aload 10
    //   1054: ifnull -44 -> 1010
    //   1057: aload 10
    //   1059: invokeinterface 72 1 0
    //   1064: goto -54 -> 1010
    //   1067: astore 32
    //   1069: iconst_0
    //   1070: istore 9
    //   1072: aconst_null
    //   1073: astore 10
    //   1075: aload 32
    //   1077: astore 8
    //   1079: goto -42 -> 1037
    //   1082: astore 32
    //   1084: aload 8
    //   1086: astore 10
    //   1088: aload 32
    //   1090: astore 8
    //   1092: goto -55 -> 1037
    //   1095: astore 10
    //   1097: goto -109 -> 988
    //   1100: aload 8
    //   1102: astore 11
    //   1104: goto -230 -> 874
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1107	0	paramLong1	long
    //   0	1107	2	paramLong2	long
    //   0	1107	4	paramSQLiteDatabase	SQLiteDatabase
    //   0	1107	5	paramString1	String
    //   0	1107	6	paramString2	String
    //   3	1008	7	localHashMap	java.util.HashMap
    //   12	962	8	localObject1	Object
    //   982	1	8	localException1	Exception
    //   986	42	8	localObject2	Object
    //   1035	15	8	localObject3	Object
    //   1077	24	8	localObject4	Object
    //   16	3	9	i	int
    //   372	99	9	j	int
    //   471	1	9	k	int
    //   991	80	9	bool1	boolean
    //   23	1064	10	localObject5	Object
    //   1095	1	10	localException2	Exception
    //   26	1077	11	localObject6	Object
    //   285	446	12	localObject7	Object
    //   310	83	13	m	int
    //   406	308	13	n	int
    //   723	294	13	i1	int
    //   1017	1	13	i2	int
    //   337	564	14	bool2	boolean
    //   353	3	15	l1	long
    //   367	84	17	bool3	boolean
    //   398	441	18	l2	long
    //   438	3	20	bool4	boolean
    //   573	368	21	str1	String
    //   649	314	22	l3	long
    //   675	129	24	l4	long
    //   706	3	26	bool5	boolean
    //   784	7	26	i3	int
    //   863	3	26	bool6	boolean
    //   796	3	27	l5	long
    //   808	42	29	str2	String
    //   815	3	30	bool7	boolean
    //   931	24	31	locala	com.vvt.capture.email.a
    //   1067	9	32	localObject8	Object
    //   1082	7	32	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   493	496	982	java/lang/Exception
    //   504	509	982	java/lang/Exception
    //   509	514	982	java/lang/Exception
    //   522	527	982	java/lang/Exception
    //   529	536	982	java/lang/Exception
    //   555	562	982	java/lang/Exception
    //   566	573	982	java/lang/Exception
    //   580	585	982	java/lang/Exception
    //   587	592	982	java/lang/Exception
    //   605	612	982	java/lang/Exception
    //   616	623	982	java/lang/Exception
    //   631	638	982	java/lang/Exception
    //   642	649	982	java/lang/Exception
    //   657	664	982	java/lang/Exception
    //   668	675	982	java/lang/Exception
    //   683	690	982	java/lang/Exception
    //   694	701	982	java/lang/Exception
    //   703	706	982	java/lang/Exception
    //   718	723	982	java/lang/Exception
    //   732	737	982	java/lang/Exception
    //   739	744	982	java/lang/Exception
    //   757	762	982	java/lang/Exception
    //   764	769	982	java/lang/Exception
    //   798	803	982	java/lang/Exception
    //   803	808	982	java/lang/Exception
    //   810	815	982	java/lang/Exception
    //   822	827	982	java/lang/Exception
    //   831	836	982	java/lang/Exception
    //   838	843	982	java/lang/Exception
    //   851	856	982	java/lang/Exception
    //   858	863	982	java/lang/Exception
    //   874	877	982	java/lang/Exception
    //   884	889	982	java/lang/Exception
    //   893	898	982	java/lang/Exception
    //   905	910	982	java/lang/Exception
    //   914	919	982	java/lang/Exception
    //   921	926	982	java/lang/Exception
    //   928	931	982	java/lang/Exception
    //   933	938	982	java/lang/Exception
    //   940	945	982	java/lang/Exception
    //   947	952	982	java/lang/Exception
    //   954	962	982	java/lang/Exception
    //   962	967	982	java/lang/Exception
    //   973	979	982	java/lang/Exception
    //   1022	1025	982	java/lang/Exception
    //   1027	1032	982	java/lang/Exception
    //   493	496	1035	finally
    //   504	509	1035	finally
    //   509	514	1035	finally
    //   522	527	1035	finally
    //   529	536	1035	finally
    //   555	562	1035	finally
    //   566	573	1035	finally
    //   580	585	1035	finally
    //   587	592	1035	finally
    //   605	612	1035	finally
    //   616	623	1035	finally
    //   631	638	1035	finally
    //   642	649	1035	finally
    //   657	664	1035	finally
    //   668	675	1035	finally
    //   683	690	1035	finally
    //   694	701	1035	finally
    //   703	706	1035	finally
    //   718	723	1035	finally
    //   732	737	1035	finally
    //   739	744	1035	finally
    //   757	762	1035	finally
    //   764	769	1035	finally
    //   798	803	1035	finally
    //   803	808	1035	finally
    //   810	815	1035	finally
    //   822	827	1035	finally
    //   831	836	1035	finally
    //   838	843	1035	finally
    //   851	856	1035	finally
    //   858	863	1035	finally
    //   874	877	1035	finally
    //   884	889	1035	finally
    //   893	898	1035	finally
    //   905	910	1035	finally
    //   914	919	1035	finally
    //   921	926	1035	finally
    //   928	931	1035	finally
    //   933	938	1035	finally
    //   940	945	1035	finally
    //   947	952	1035	finally
    //   954	962	1035	finally
    //   962	967	1035	finally
    //   973	979	1035	finally
    //   1022	1025	1035	finally
    //   1027	1032	1035	finally
    //   355	360	1067	finally
    //   363	367	1067	finally
    //   369	372	1067	finally
    //   400	405	1082	finally
    //   415	419	1082	finally
    //   426	433	1082	finally
    //   435	438	1082	finally
    //   460	467	1082	finally
    //   988	991	1082	finally
    //   355	360	1095	java/lang/Exception
    //   363	367	1095	java/lang/Exception
    //   369	372	1095	java/lang/Exception
    //   400	405	1095	java/lang/Exception
    //   415	419	1095	java/lang/Exception
    //   426	433	1095	java/lang/Exception
    //   435	438	1095	java/lang/Exception
    //   460	467	1095	java/lang/Exception
  }
  
  /* Error */
  public static List a(long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   6: istore 7
    //   8: iload 7
    //   10: ifeq +3 -> 13
    //   13: invokestatic 301	com/vvt/capture/email/generic/removeFromPath:a	()Ljava/lang/String;
    //   16: astore 8
    //   18: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   21: istore 9
    //   23: iload 9
    //   25: ifeq +3 -> 28
    //   28: bipush 17
    //   30: istore 9
    //   32: iload 9
    //   34: aload 8
    //   36: invokestatic 31	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   39: astore 8
    //   41: invokestatic 303	com/vvt/capture/email/generic/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   44: astore 10
    //   46: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   49: istore 11
    //   51: iload 11
    //   53: ifeq +3 -> 56
    //   56: bipush 17
    //   58: istore 11
    //   60: iload 11
    //   62: aload 10
    //   64: invokestatic 31	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   67: astore 10
    //   69: aload 8
    //   71: aload 10
    //   73: lload_0
    //   74: lload_2
    //   75: aload 4
    //   77: aload 5
    //   79: invokestatic 306	com/vvt/capture/email/generic/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;JJLjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   82: astore 12
    //   84: aload 10
    //   86: ifnull +8 -> 94
    //   89: aload 10
    //   91: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   94: aload 8
    //   96: ifnull +8 -> 104
    //   99: aload 8
    //   101: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   104: aload 12
    //   106: astore 8
    //   108: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   111: istore 9
    //   113: iload 9
    //   115: ifeq +3 -> 118
    //   118: aload 8
    //   120: areturn
    //   121: astore 8
    //   123: iconst_0
    //   124: istore 7
    //   126: aconst_null
    //   127: astore 8
    //   129: iconst_0
    //   130: istore 9
    //   132: aconst_null
    //   133: astore 10
    //   135: getstatic 25	com/vvt/capture/email/generic/removeFromPath:d	Z
    //   138: istore 11
    //   140: iload 11
    //   142: ifeq +3 -> 145
    //   145: aload 10
    //   147: ifnull +8 -> 155
    //   150: aload 10
    //   152: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   155: aload 8
    //   157: ifnull +8 -> 165
    //   160: aload 8
    //   162: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   165: iconst_0
    //   166: istore 7
    //   168: aconst_null
    //   169: astore 8
    //   171: goto -63 -> 108
    //   174: astore 8
    //   176: iconst_0
    //   177: istore 9
    //   179: aconst_null
    //   180: astore 10
    //   182: aload 10
    //   184: ifnull +8 -> 192
    //   187: aload 10
    //   189: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   192: aload 6
    //   194: ifnull +8 -> 202
    //   197: aload 6
    //   199: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   202: aload 8
    //   204: athrow
    //   205: astore 13
    //   207: iconst_0
    //   208: istore 9
    //   210: aconst_null
    //   211: astore 10
    //   213: aload 8
    //   215: astore 6
    //   217: aload 13
    //   219: astore 8
    //   221: goto -39 -> 182
    //   224: astore 12
    //   226: aload 8
    //   228: astore 6
    //   230: aload 12
    //   232: astore 8
    //   234: goto -52 -> 182
    //   237: astore 10
    //   239: iconst_0
    //   240: istore 9
    //   242: aconst_null
    //   243: astore 10
    //   245: goto -110 -> 135
    //   248: astore 12
    //   250: goto -115 -> 135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	paramLong1	long
    //   0	253	2	paramLong2	long
    //   0	253	4	paramString1	String
    //   0	253	5	paramString2	String
    //   1	228	6	localObject1	Object
    //   6	161	7	bool1	boolean
    //   16	103	8	localObject2	Object
    //   121	1	8	localException1	Exception
    //   127	43	8	localObject3	Object
    //   174	40	8	localObject4	Object
    //   219	14	8	localObject5	Object
    //   21	3	9	bool2	boolean
    //   30	3	9	i	int
    //   111	130	9	bool3	boolean
    //   44	168	10	localObject6	Object
    //   237	1	10	localException2	Exception
    //   243	1	10	localObject7	Object
    //   49	3	11	bool4	boolean
    //   58	3	11	j	int
    //   138	3	11	bool5	boolean
    //   82	23	12	localList	List
    //   224	7	12	localObject8	Object
    //   248	1	12	localException3	Exception
    //   205	13	13	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   13	16	121	java/lang/Exception
    //   18	21	121	java/lang/Exception
    //   34	39	121	java/lang/Exception
    //   13	16	174	finally
    //   18	21	174	finally
    //   34	39	174	finally
    //   41	44	205	finally
    //   46	49	205	finally
    //   62	67	205	finally
    //   77	82	224	finally
    //   135	138	224	finally
    //   41	44	237	java/lang/Exception
    //   46	49	237	java/lang/Exception
    //   62	67	237	java/lang/Exception
    //   77	82	248	java/lang/Exception
  }
  
  /* Error */
  public static List a(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   3: istore 8
    //   5: iload 8
    //   7: ifeq +3 -> 10
    //   10: new 298	java/util/ArrayList
    //   13: astore 9
    //   15: aload 9
    //   17: invokespecial 299	java/util/ArrayList:<init>	()V
    //   20: lload_2
    //   21: lload 4
    //   23: aload_1
    //   24: invokestatic 309	com/vvt/capture/email/generic/removeFromPath:a	(JJLandroid/database/sqlite/SQLiteDatabase;)Ljava/util/HashMap;
    //   27: astore 10
    //   29: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   32: istore 8
    //   34: iload 8
    //   36: ifeq +3 -> 39
    //   39: aload_0
    //   40: astore 11
    //   42: aload 6
    //   44: astore 12
    //   46: lload_2
    //   47: lload 4
    //   49: aload_0
    //   50: aload 6
    //   52: aload 7
    //   54: invokestatic 312	com/vvt/capture/email/generic/removeFromPath:a	(JJLandroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;
    //   57: astore 13
    //   59: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   62: istore 8
    //   64: iload 8
    //   66: ifeq +3 -> 69
    //   69: ldc_w 314
    //   72: astore 14
    //   74: bipush 52
    //   76: istore 15
    //   78: iload 15
    //   80: anewarray 4	java/lang/Object
    //   83: astore 16
    //   85: aconst_null
    //   86: astore 17
    //   88: aload 16
    //   90: iconst_0
    //   91: ldc 38
    //   93: aastore
    //   94: aload 16
    //   96: iconst_1
    //   97: ldc 36
    //   99: aastore
    //   100: aload 16
    //   102: iconst_2
    //   103: ldc -40
    //   105: aastore
    //   106: aload 16
    //   108: iconst_3
    //   109: ldc -37
    //   111: aastore
    //   112: aload 16
    //   114: iconst_4
    //   115: ldc 38
    //   117: aastore
    //   118: aload 16
    //   120: iconst_5
    //   121: ldc -43
    //   123: aastore
    //   124: aload 16
    //   126: bipush 6
    //   128: ldc_w 317
    //   131: aastore
    //   132: aload 16
    //   134: bipush 7
    //   136: ldc_w 319
    //   139: aastore
    //   140: aload 16
    //   142: bipush 8
    //   144: ldc_w 317
    //   147: aastore
    //   148: aload 16
    //   150: bipush 9
    //   152: ldc_w 317
    //   155: aastore
    //   156: aload 16
    //   158: bipush 10
    //   160: ldc_w 321
    //   163: aastore
    //   164: aload 16
    //   166: bipush 11
    //   168: ldc_w 323
    //   171: aastore
    //   172: aload 16
    //   174: bipush 12
    //   176: ldc_w 325
    //   179: aastore
    //   180: aload 16
    //   182: bipush 13
    //   184: ldc 38
    //   186: aastore
    //   187: aload 16
    //   189: bipush 14
    //   191: ldc_w 321
    //   194: aastore
    //   195: aload 16
    //   197: bipush 15
    //   199: ldc_w 327
    //   202: aastore
    //   203: aload 16
    //   205: bipush 16
    //   207: ldc_w 329
    //   210: aastore
    //   211: aload 16
    //   213: bipush 17
    //   215: ldc_w 331
    //   218: aastore
    //   219: aload 16
    //   221: bipush 18
    //   223: ldc_w 333
    //   226: aastore
    //   227: aload 16
    //   229: bipush 19
    //   231: ldc_w 335
    //   234: aastore
    //   235: aload 16
    //   237: bipush 20
    //   239: ldc_w 337
    //   242: aastore
    //   243: aload 16
    //   245: bipush 21
    //   247: ldc_w 339
    //   250: aastore
    //   251: aload 16
    //   253: bipush 22
    //   255: ldc 38
    //   257: aastore
    //   258: aload 16
    //   260: bipush 23
    //   262: ldc_w 317
    //   265: aastore
    //   266: aload 16
    //   268: bipush 24
    //   270: ldc 38
    //   272: aastore
    //   273: aload 16
    //   275: bipush 25
    //   277: ldc -46
    //   279: aastore
    //   280: aload 16
    //   282: bipush 26
    //   284: ldc_w 317
    //   287: aastore
    //   288: aload 16
    //   290: bipush 27
    //   292: ldc 36
    //   294: aastore
    //   295: aload 16
    //   297: bipush 28
    //   299: ldc -40
    //   301: aastore
    //   302: aload 16
    //   304: bipush 29
    //   306: ldc 36
    //   308: aastore
    //   309: aload 16
    //   311: bipush 30
    //   313: ldc -40
    //   315: aastore
    //   316: aload 16
    //   318: bipush 31
    //   320: ldc -21
    //   322: aastore
    //   323: aload 16
    //   325: bipush 32
    //   327: ldc -37
    //   329: aastore
    //   330: aload 16
    //   332: bipush 33
    //   334: ldc -40
    //   336: aastore
    //   337: aload 16
    //   339: bipush 34
    //   341: ldc -40
    //   343: aastore
    //   344: aload 16
    //   346: bipush 35
    //   348: ldc 38
    //   350: aastore
    //   351: aload 16
    //   353: bipush 36
    //   355: ldc -43
    //   357: aastore
    //   358: aload 16
    //   360: bipush 37
    //   362: ldc -40
    //   364: aastore
    //   365: aload 16
    //   367: bipush 38
    //   369: ldc 36
    //   371: aastore
    //   372: aload 16
    //   374: bipush 39
    //   376: ldc_w 339
    //   379: aastore
    //   380: aload 16
    //   382: bipush 40
    //   384: ldc 38
    //   386: aastore
    //   387: aload 16
    //   389: bipush 41
    //   391: ldc 36
    //   393: aastore
    //   394: lload_2
    //   395: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   398: astore 11
    //   400: aload 16
    //   402: bipush 42
    //   404: aload 11
    //   406: aastore
    //   407: aload 16
    //   409: bipush 43
    //   411: ldc 38
    //   413: aastore
    //   414: aload 16
    //   416: bipush 44
    //   418: ldc 36
    //   420: aastore
    //   421: lload 4
    //   423: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   426: astore 11
    //   428: aload 16
    //   430: bipush 45
    //   432: aload 11
    //   434: aastore
    //   435: aload 16
    //   437: bipush 46
    //   439: ldc -40
    //   441: aastore
    //   442: aload 16
    //   444: bipush 47
    //   446: ldc -37
    //   448: aastore
    //   449: aload 16
    //   451: bipush 48
    //   453: ldc -40
    //   455: aastore
    //   456: aload 16
    //   458: bipush 49
    //   460: ldc -37
    //   462: aastore
    //   463: aload 16
    //   465: bipush 50
    //   467: ldc -40
    //   469: aastore
    //   470: bipush 51
    //   472: istore 18
    //   474: ldc -37
    //   476: astore 11
    //   478: aload 16
    //   480: iload 18
    //   482: aload 11
    //   484: aastore
    //   485: aload 14
    //   487: aload 16
    //   489: invokestatic 52	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   492: astore 16
    //   494: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   497: istore 8
    //   499: iload 8
    //   501: ifeq +3 -> 504
    //   504: iconst_0
    //   505: istore 8
    //   507: aconst_null
    //   508: astore 14
    //   510: iconst_0
    //   511: istore 18
    //   513: aconst_null
    //   514: astore 17
    //   516: aload_0
    //   517: aload 16
    //   519: aconst_null
    //   520: invokevirtual 58	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   523: astore 16
    //   525: aload 16
    //   527: invokeinterface 80 1 0
    //   532: istore 8
    //   534: iload 8
    //   536: ifeq +484 -> 1020
    //   539: ldc 36
    //   541: astore 14
    //   543: aload 16
    //   545: aload 14
    //   547: invokeinterface 121 2 0
    //   552: istore 8
    //   554: aload 16
    //   556: iload 8
    //   558: invokeinterface 68 2 0
    //   563: lstore 19
    //   565: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   568: istore 8
    //   570: iload 8
    //   572: ifeq +3 -> 575
    //   575: new 351	com/vvt/capture/email/MyUncaughtExceptionHandler
    //   578: astore 12
    //   580: aload 12
    //   582: invokespecial 352	com/vvt/capture/email/MyUncaughtExceptionHandler:<init>	()V
    //   585: ldc_w 325
    //   588: astore 14
    //   590: aload 16
    //   592: aload 14
    //   594: invokeinterface 121 2 0
    //   599: istore 8
    //   601: aload 16
    //   603: iload 8
    //   605: invokeinterface 125 2 0
    //   610: astore 14
    //   612: aload 14
    //   614: ifnonnull +8 -> 622
    //   617: ldc_w 354
    //   620: astore 14
    //   622: aload 12
    //   624: aload 14
    //   626: invokevirtual 355	com/vvt/capture/email/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;)V
    //   629: ldc -37
    //   631: astore 14
    //   633: aload 16
    //   635: aload 14
    //   637: invokeinterface 121 2 0
    //   642: istore 8
    //   644: aload 16
    //   646: iload 8
    //   648: invokeinterface 184 2 0
    //   653: istore 8
    //   655: iload 8
    //   657: ifne +319 -> 976
    //   660: iconst_1
    //   661: istore 8
    //   663: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   666: istore 21
    //   668: iload 21
    //   670: ifeq +3 -> 673
    //   673: aload 12
    //   675: iload 8
    //   677: invokevirtual 358	com/vvt/capture/email/MyUncaughtExceptionHandler:a	(Z)V
    //   680: lload 19
    //   682: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   685: astore 14
    //   687: aload 10
    //   689: aload 14
    //   691: invokevirtual 284	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   694: astore 14
    //   696: aload 14
    //   698: checkcast 48	java/lang/String
    //   701: astore 14
    //   703: aload 14
    //   705: ifnonnull +8 -> 713
    //   708: ldc_w 354
    //   711: astore 14
    //   713: aload 12
    //   715: aload 14
    //   717: invokevirtual 360	com/vvt/capture/email/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   720: lload 19
    //   722: invokestatic 106	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   725: astore 14
    //   727: aload 13
    //   729: aload 14
    //   731: invokevirtual 284	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   734: astore 14
    //   736: aload 14
    //   738: checkcast 286	java/util/List
    //   741: astore 14
    //   743: aload 14
    //   745: ifnonnull +13 -> 758
    //   748: new 298	java/util/ArrayList
    //   751: astore 14
    //   753: aload 14
    //   755: invokespecial 299	java/util/ArrayList:<init>	()V
    //   758: aload 12
    //   760: aload 14
    //   762: invokevirtual 363	com/vvt/capture/email/MyUncaughtExceptionHandler:a	(Ljava/util/List;)V
    //   765: ldc_w 339
    //   768: astore 14
    //   770: aload 16
    //   772: aload 14
    //   774: invokeinterface 121 2 0
    //   779: istore 8
    //   781: aload 16
    //   783: iload 8
    //   785: invokeinterface 68 2 0
    //   790: lstore 19
    //   792: aload 12
    //   794: lload 19
    //   796: invokevirtual 365	com/vvt/capture/email/MyUncaughtExceptionHandler:a	(J)V
    //   799: ldc_w 327
    //   802: astore 14
    //   804: aload 16
    //   806: aload 14
    //   808: invokestatic 368	com/vvt/capture/email/generic/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)[Ljava/lang/String;
    //   811: astore 14
    //   813: aload 14
    //   815: arraylength
    //   816: istore 18
    //   818: iload 18
    //   820: ifle +165 -> 985
    //   823: iconst_0
    //   824: istore 18
    //   826: aconst_null
    //   827: astore 17
    //   829: aload 14
    //   831: iconst_0
    //   832: aaload
    //   833: astore 17
    //   835: aload 17
    //   837: ifnull +148 -> 985
    //   840: iconst_0
    //   841: istore 18
    //   843: aconst_null
    //   844: astore 17
    //   846: aload 14
    //   848: iconst_0
    //   849: aaload
    //   850: astore 14
    //   852: aload 12
    //   854: aload 14
    //   856: invokevirtual 369	com/vvt/capture/email/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   859: ldc_w 329
    //   862: astore 14
    //   864: aload 16
    //   866: aload 14
    //   868: invokestatic 368	com/vvt/capture/email/generic/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)[Ljava/lang/String;
    //   871: astore 14
    //   873: aload 12
    //   875: aload 14
    //   877: invokevirtual 372	com/vvt/capture/email/MyUncaughtExceptionHandler:a	([Ljava/lang/String;)V
    //   880: ldc_w 331
    //   883: astore 14
    //   885: aload 16
    //   887: aload 14
    //   889: invokestatic 368	com/vvt/capture/email/generic/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)[Ljava/lang/String;
    //   892: astore 14
    //   894: aload 12
    //   896: aload 14
    //   898: invokevirtual 374	com/vvt/capture/email/MyUncaughtExceptionHandler:removeFromPath	([Ljava/lang/String;)V
    //   901: ldc_w 333
    //   904: astore 14
    //   906: aload 16
    //   908: aload 14
    //   910: invokestatic 368	com/vvt/capture/email/generic/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)[Ljava/lang/String;
    //   913: astore 14
    //   915: aload 12
    //   917: aload 14
    //   919: invokevirtual 376	com/vvt/capture/email/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	([Ljava/lang/String;)V
    //   922: aload 9
    //   924: aload 12
    //   926: invokeinterface 296 2 0
    //   931: pop
    //   932: goto -407 -> 525
    //   935: astore 14
    //   937: aload 16
    //   939: astore 14
    //   941: getstatic 25	com/vvt/capture/email/generic/removeFromPath:d	Z
    //   944: istore 15
    //   946: iload 15
    //   948: ifeq +3 -> 951
    //   951: aload 14
    //   953: ifnull +10 -> 963
    //   956: aload 14
    //   958: invokeinterface 72 1 0
    //   963: getstatic 17	com/vvt/capture/email/generic/removeFromPath:removeFromPath	Z
    //   966: istore 8
    //   968: iload 8
    //   970: ifeq +3 -> 973
    //   973: aload 9
    //   975: areturn
    //   976: iconst_0
    //   977: istore 8
    //   979: aconst_null
    //   980: astore 14
    //   982: goto -319 -> 663
    //   985: ldc_w 354
    //   988: astore 14
    //   990: goto -138 -> 852
    //   993: astore 22
    //   995: iconst_0
    //   996: istore 15
    //   998: aconst_null
    //   999: astore 16
    //   1001: aload 22
    //   1003: astore 14
    //   1005: aload 16
    //   1007: ifnull +10 -> 1017
    //   1010: aload 16
    //   1012: invokeinterface 72 1 0
    //   1017: aload 14
    //   1019: athrow
    //   1020: aload 16
    //   1022: ifnull -59 -> 963
    //   1025: aload 16
    //   1027: invokeinterface 72 1 0
    //   1032: goto -69 -> 963
    //   1035: astore 14
    //   1037: goto -32 -> 1005
    //   1040: astore 22
    //   1042: aload 14
    //   1044: astore 16
    //   1046: aload 22
    //   1048: astore 14
    //   1050: goto -45 -> 1005
    //   1053: astore 16
    //   1055: goto -114 -> 941
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1058	0	paramSQLiteDatabase1	SQLiteDatabase
    //   0	1058	1	paramSQLiteDatabase2	SQLiteDatabase
    //   0	1058	2	paramLong1	long
    //   0	1058	4	paramLong2	long
    //   0	1058	6	paramString1	String
    //   0	1058	7	paramString2	String
    //   3	532	8	bool1	boolean
    //   552	5	8	i	int
    //   568	3	8	bool2	boolean
    //   599	77	8	j	int
    //   779	5	8	k	int
    //   966	12	8	bool3	boolean
    //   13	961	9	localArrayList	ArrayList
    //   27	661	10	localHashMap1	java.util.HashMap
    //   40	443	11	localObject1	Object
    //   44	881	12	localObject2	Object
    //   57	671	13	localHashMap2	java.util.HashMap
    //   72	846	14	localObject3	Object
    //   935	1	14	localException1	Exception
    //   939	79	14	localObject4	Object
    //   1035	8	14	localObject5	Object
    //   1048	1	14	localObject6	Object
    //   76	3	15	m	int
    //   944	53	15	bool4	boolean
    //   83	962	16	localObject7	Object
    //   1053	1	16	localException2	Exception
    //   86	759	17	localObject8	Object
    //   472	370	18	n	int
    //   563	232	19	l	long
    //   666	3	21	bool5	boolean
    //   993	9	22	localObject9	Object
    //   1040	7	22	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   525	532	935	java/lang/Exception
    //   545	552	935	java/lang/Exception
    //   556	563	935	java/lang/Exception
    //   565	568	935	java/lang/Exception
    //   575	578	935	java/lang/Exception
    //   580	585	935	java/lang/Exception
    //   592	599	935	java/lang/Exception
    //   603	610	935	java/lang/Exception
    //   624	629	935	java/lang/Exception
    //   635	642	935	java/lang/Exception
    //   646	653	935	java/lang/Exception
    //   663	666	935	java/lang/Exception
    //   675	680	935	java/lang/Exception
    //   680	685	935	java/lang/Exception
    //   689	694	935	java/lang/Exception
    //   696	701	935	java/lang/Exception
    //   715	720	935	java/lang/Exception
    //   720	725	935	java/lang/Exception
    //   729	734	935	java/lang/Exception
    //   736	741	935	java/lang/Exception
    //   748	751	935	java/lang/Exception
    //   753	758	935	java/lang/Exception
    //   760	765	935	java/lang/Exception
    //   772	779	935	java/lang/Exception
    //   783	790	935	java/lang/Exception
    //   794	799	935	java/lang/Exception
    //   806	811	935	java/lang/Exception
    //   813	816	935	java/lang/Exception
    //   831	833	935	java/lang/Exception
    //   848	850	935	java/lang/Exception
    //   854	859	935	java/lang/Exception
    //   866	871	935	java/lang/Exception
    //   875	880	935	java/lang/Exception
    //   887	892	935	java/lang/Exception
    //   896	901	935	java/lang/Exception
    //   908	913	935	java/lang/Exception
    //   917	922	935	java/lang/Exception
    //   924	932	935	java/lang/Exception
    //   519	523	993	finally
    //   525	532	1035	finally
    //   545	552	1035	finally
    //   556	563	1035	finally
    //   565	568	1035	finally
    //   575	578	1035	finally
    //   580	585	1035	finally
    //   592	599	1035	finally
    //   603	610	1035	finally
    //   624	629	1035	finally
    //   635	642	1035	finally
    //   646	653	1035	finally
    //   663	666	1035	finally
    //   675	680	1035	finally
    //   680	685	1035	finally
    //   689	694	1035	finally
    //   696	701	1035	finally
    //   715	720	1035	finally
    //   720	725	1035	finally
    //   729	734	1035	finally
    //   736	741	1035	finally
    //   748	751	1035	finally
    //   753	758	1035	finally
    //   760	765	1035	finally
    //   772	779	1035	finally
    //   783	790	1035	finally
    //   794	799	1035	finally
    //   806	811	1035	finally
    //   813	816	1035	finally
    //   831	833	1035	finally
    //   848	850	1035	finally
    //   854	859	1035	finally
    //   866	871	1035	finally
    //   875	880	1035	finally
    //   887	892	1035	finally
    //   896	901	1035	finally
    //   908	913	1035	finally
    //   917	922	1035	finally
    //   924	932	1035	finally
    //   941	944	1040	finally
    //   519	523	1053	java/lang/Exception
  }
  
  public static boolean a(SQLiteDatabase paramSQLiteDatabase, long paramLong1, long paramLong2)
  {
    localCursor = null;
    i = 1;
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    ((StringBuilder)localObject3).append("SELECT ");
    ((StringBuilder)localObject3).append("flagAttachment");
    ((StringBuilder)localObject3).append(" FROM ");
    ((StringBuilder)localObject3).append("message");
    ((StringBuilder)localObject3).append(" WHERE _id > ");
    ((StringBuilder)localObject3).append(paramLong1);
    String str = " AND _id <= ";
    ((StringBuilder)localObject3).append(str);
    ((StringBuilder)localObject3).append(paramLong2);
    localObject3 = ((StringBuilder)localObject3).toString();
    boolean bool2 = b;
    if (bool2) {}
    bool2 = false;
    str = null;
    try
    {
      localCursor = paramSQLiteDatabase.rawQuery((String)localObject3, null);
      int j;
      do
      {
        boolean bool3 = localCursor.moveToNext();
        if (!bool3) {
          break;
        }
        localObject3 = "flagAttachment";
        j = localCursor.getColumnIndex((String)localObject3);
        j = localCursor.getInt(j);
      } while (j != i);
      bool1 = i;
      if (localCursor == null) {
        break label189;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label189:
        i = d;
        if ((i != 0) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label225;
      }
      localCursor.close();
    }
    localCursor.close();
    return bool1;
  }
  
  private static String[] a(Cursor paramCursor, String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramCursor.getColumnIndex(paramString);
    Object localObject = paramCursor.getString(i);
    if (localObject != null)
    {
      Matcher localMatcher = Pattern.compile("([a-zA-Z0-9][.]?[_]?[-]?)+@([a-zA-Z][.]?[_]?[-]?)*").matcher((CharSequence)localObject);
      for (;;)
      {
        boolean bool1 = localMatcher.find();
        if (!bool1) {
          break;
        }
        int j = localMatcher.start();
        int k = localMatcher.end();
        String str = ((String)localObject).substring(j, k).toLowerCase();
        boolean bool2 = localArrayList.contains(str);
        if (!bool2) {
          localArrayList.add(str);
        }
      }
    }
    localObject = new String[0];
    return (String[])localArrayList.toArray((Object[])localObject);
  }
  
  public static String b()
  {
    String str1 = c();
    boolean bool = com.vvt.ag.b.a(str1);
    if (!bool)
    {
      String str2 = "%s/%s";
      int i = 2;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      int j = 1;
      String str3 = "EmailProviderBody.db";
      arrayOfObject[j] = str3;
      str1 = String.format(str2, arrayOfObject);
    }
    return str1;
  }
  
  public static String b(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  public static long c(String paramString)
  {
    long l = 0L;
    int i = 17;
    SQLiteDatabase localSQLiteDatabase = c.a(i, paramString);
    if (localSQLiteDatabase != null) {
      l = a(localSQLiteDatabase);
    }
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.close();
    }
    boolean bool = c;
    if (bool) {}
    return l;
  }
  
  public static String c()
  {
    String[] arrayOfString = e();
    int i = arrayOfString.length;
    int j = 0;
    String str = null;
    int k = 0;
    if (k < i)
    {
      str = arrayOfString[k];
      boolean bool = ShellUtil.b(str);
      if (!bool) {}
    }
    for (;;)
    {
      return str;
      j = k + 1;
      k = j;
      break;
      j = 0;
      str = null;
    }
  }
  
  private static String d(String paramString)
  {
    return p.a(paramString, "email_att");
  }
  
  public static List d()
  {
    String[] arrayOfString = e();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = arrayOfString.length;
    int j = 0;
    while (j < i)
    {
      String str1 = arrayOfString[j];
      String str2 = "%s/%s";
      int k = 2;
      Object[] arrayOfObject = new Object[k];
      arrayOfObject[0] = str1;
      int m = 1;
      String str3 = "EmailProvider.db";
      arrayOfObject[m] = str3;
      str1 = String.format(str2, arrayOfObject);
      localArrayList.add(str1);
      j += 1;
    }
    return localArrayList;
  }
  
  public static String[] e()
  {
    int i = 2;
    int j = 1;
    String[] arrayOfString = new String[5];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.android.email";
    String str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[0] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.google.android.email";
    str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[j] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.android.email";
    str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[i] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.google.android.email";
    str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[3] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.samsung.android.email.provider";
    str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[4] = str;
    return arrayOfString;
  }
  
  public static long f()
  {
    long l = 0L;
    boolean bool1 = false;
    localSQLiteDatabase = null;
    try
    {
      String str = a();
      int i = 17;
      localSQLiteDatabase = c.a(i, str);
      if (localSQLiteDatabase != null) {
        l = a(localSQLiteDatabase);
      }
      if (localSQLiteDatabase == null) {
        break label40;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label40:
        boolean bool2 = d;
        if ((bool2) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label79;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    bool1 = c;
    if (bool1) {}
    return l;
  }
  
  private static String g()
  {
    String str1 = null;
    String str2 = c();
    boolean bool = com.vvt.ag.b.a(str2);
    if (!bool)
    {
      String str3 = "cache";
      str1 = str2.replace("databases", str3);
    }
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/generic/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */