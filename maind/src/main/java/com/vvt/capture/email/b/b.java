package com.vvt.capture.email.b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.vvt.io.d;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
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
    //   167: getstatic 20	com/vvt/capture/email/removeFromPath/removeFromPath:MyUncaughtExceptionHandler	Z
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
    //   186: getstatic 25	com/vvt/capture/email/removeFromPath/removeFromPath:d	Z
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
    String str1 = d();
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
    }
    return str1;
  }
  
  private static String a(long paramLong)
  {
    long l1 = 100;
    boolean bool1 = false;
    boolean bool2 = b;
    if (bool2) {}
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    String str1 = c.b;
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append("/");
    long l2 = paramLong / l1;
    ((StringBuilder)localObject).append(l2);
    ((StringBuilder)localObject).append("/");
    l2 = paramLong % l1;
    ((StringBuilder)localObject).append(l2);
    ((StringBuilder)localObject).append("/");
    ((StringBuilder)localObject).append(paramLong);
    String str2 = ((StringBuilder)localObject).toString();
    int j = 3;
    bool2 = false;
    localObject = null;
    int k = 0;
    str1 = null;
    while (k < j)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(str2);
      String str3 = ".html";
      localObject = str3;
      boolean bool3 = ShellUtil.b((String)localObject);
      if (bool3) {
        break label249;
      }
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(str2);
      str3 = ".txt";
      localObject = str3;
      bool3 = ShellUtil.b((String)localObject);
      if (bool3) {
        break label249;
      }
      long l3 = 1000L;
      SystemClock.sleep(l3);
      i = k + 1;
      k = i;
    }
    int i = 0;
    localObject = null;
    label249:
    bool1 = b;
    if (bool1) {}
    return (String)localObject;
  }
  
  public static String a(String paramString)
  {
    return p.a(paramString, "integratedEmail");
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
  private static java.util.HashMap a(long paramLong1, long paramLong2, SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 167	java/util/HashMap
    //   3: astore 7
    //   5: aload 7
    //   7: invokespecial 168	java/util/HashMap:<init>	()V
    //   10: ldc -86
    //   12: astore 8
    //   14: bipush 43
    //   16: istore 9
    //   18: iload 9
    //   20: anewarray 4	java/lang/Object
    //   23: astore 10
    //   25: aconst_null
    //   26: astore 11
    //   28: aload 10
    //   30: iconst_0
    //   31: ldc -83
    //   33: aastore
    //   34: aload 10
    //   36: iconst_1
    //   37: ldc 36
    //   39: aastore
    //   40: aload 10
    //   42: iconst_2
    //   43: ldc -83
    //   45: aastore
    //   46: aload 10
    //   48: iconst_3
    //   49: ldc -81
    //   51: aastore
    //   52: aload 10
    //   54: iconst_4
    //   55: ldc -83
    //   57: aastore
    //   58: aload 10
    //   60: iconst_5
    //   61: ldc -79
    //   63: aastore
    //   64: aload 10
    //   66: bipush 6
    //   68: ldc -83
    //   70: aastore
    //   71: aload 10
    //   73: bipush 7
    //   75: ldc -77
    //   77: aastore
    //   78: aload 10
    //   80: bipush 8
    //   82: ldc -83
    //   84: aastore
    //   85: aload 10
    //   87: bipush 9
    //   89: ldc -73
    //   91: aastore
    //   92: aload 10
    //   94: bipush 10
    //   96: ldc -83
    //   98: aastore
    //   99: aload 10
    //   101: bipush 11
    //   103: ldc -69
    //   105: aastore
    //   106: aload 10
    //   108: bipush 12
    //   110: ldc -66
    //   112: aastore
    //   113: aload 10
    //   115: bipush 13
    //   117: ldc -63
    //   119: aastore
    //   120: aload 10
    //   122: bipush 14
    //   124: ldc -60
    //   126: aastore
    //   127: aload 10
    //   129: bipush 15
    //   131: ldc -57
    //   133: aastore
    //   134: aload 10
    //   136: bipush 16
    //   138: ldc -83
    //   140: aastore
    //   141: aload 10
    //   143: bipush 17
    //   145: ldc 38
    //   147: aastore
    //   148: aload 10
    //   150: bipush 18
    //   152: ldc -66
    //   154: aastore
    //   155: aload 10
    //   157: bipush 19
    //   159: ldc 38
    //   161: aastore
    //   162: aload 10
    //   164: bipush 20
    //   166: ldc 36
    //   168: aastore
    //   169: aload 10
    //   171: bipush 21
    //   173: ldc 38
    //   175: aastore
    //   176: aload 10
    //   178: bipush 22
    //   180: ldc -63
    //   182: aastore
    //   183: aload 10
    //   185: bipush 23
    //   187: ldc 38
    //   189: aastore
    //   190: aload 10
    //   192: bipush 24
    //   194: ldc -83
    //   196: aastore
    //   197: aload 10
    //   199: bipush 25
    //   201: ldc -81
    //   203: aastore
    //   204: aload 10
    //   206: bipush 26
    //   208: ldc 36
    //   210: aastore
    //   211: aload 10
    //   213: bipush 27
    //   215: ldc -60
    //   217: aastore
    //   218: aload 10
    //   220: bipush 28
    //   222: ldc 36
    //   224: aastore
    //   225: aload 10
    //   227: bipush 29
    //   229: ldc -60
    //   231: aastore
    //   232: aload 10
    //   234: bipush 30
    //   236: ldc -41
    //   238: aastore
    //   239: aload 10
    //   241: bipush 31
    //   243: ldc -57
    //   245: aastore
    //   246: aload 10
    //   248: bipush 32
    //   250: ldc -60
    //   252: aastore
    //   253: aload 10
    //   255: bipush 33
    //   257: ldc -60
    //   259: aastore
    //   260: aload 10
    //   262: bipush 34
    //   264: ldc -63
    //   266: aastore
    //   267: aload 10
    //   269: bipush 35
    //   271: ldc -60
    //   273: aastore
    //   274: aload 10
    //   276: bipush 36
    //   278: ldc 36
    //   280: aastore
    //   281: aload 10
    //   283: bipush 37
    //   285: ldc -83
    //   287: aastore
    //   288: aload 10
    //   290: bipush 38
    //   292: ldc -81
    //   294: aastore
    //   295: lload_0
    //   296: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   299: astore 12
    //   301: aload 10
    //   303: bipush 39
    //   305: aload 12
    //   307: aastore
    //   308: aload 10
    //   310: bipush 40
    //   312: ldc -83
    //   314: aastore
    //   315: aload 10
    //   317: bipush 41
    //   319: ldc -81
    //   321: aastore
    //   322: bipush 42
    //   324: istore 13
    //   326: lload_2
    //   327: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   330: astore 12
    //   332: aload 10
    //   334: iload 13
    //   336: aload 12
    //   338: aastore
    //   339: aload 8
    //   341: aload 10
    //   343: invokestatic 52	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   346: astore 12
    //   348: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   351: istore 14
    //   353: iload 14
    //   355: ifeq +3 -> 358
    //   358: iconst_0
    //   359: istore 14
    //   361: aconst_null
    //   362: astore 8
    //   364: ldc2_w 233
    //   367: lstore 15
    //   369: lload 15
    //   371: invokestatic 134	android/os/SystemClock:sleep	(J)V
    //   374: aload 4
    //   376: lload_0
    //   377: lload_2
    //   378: invokestatic 239	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;JJ)Z
    //   381: istore 17
    //   383: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   386: istore 9
    //   388: iload 9
    //   390: ifeq +3 -> 393
    //   393: iconst_0
    //   394: istore 9
    //   396: aconst_null
    //   397: astore 10
    //   399: iconst_5
    //   400: istore 13
    //   402: iload 9
    //   404: iload 13
    //   406: if_icmpge +93 -> 499
    //   409: ldc2_w 233
    //   412: lstore 18
    //   414: lload 18
    //   416: invokestatic 134	android/os/SystemClock:sleep	(J)V
    //   419: iconst_0
    //   420: istore 13
    //   422: aconst_null
    //   423: astore 11
    //   425: aload 4
    //   427: aload 12
    //   429: aconst_null
    //   430: invokevirtual 58	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   433: astore 8
    //   435: aload 8
    //   437: ifnull +53 -> 490
    //   440: aload 8
    //   442: invokeinterface 243 1 0
    //   447: istore 13
    //   449: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   452: istore 20
    //   454: iload 20
    //   456: ifeq +3 -> 459
    //   459: iload 13
    //   461: ifne +38 -> 499
    //   464: iload 17
    //   466: ifeq +33 -> 499
    //   469: aload 8
    //   471: ifnull +10 -> 481
    //   474: aload 8
    //   476: invokeinterface 72 1 0
    //   481: iload 9
    //   483: iconst_1
    //   484: iadd
    //   485: istore 9
    //   487: goto -88 -> 399
    //   490: iconst_0
    //   491: istore 13
    //   493: aconst_null
    //   494: astore 11
    //   496: goto -47 -> 449
    //   499: aload 8
    //   501: astore 10
    //   503: ldc -11
    //   505: astore 8
    //   507: new 247	java/io/File
    //   510: astore 11
    //   512: ldc -11
    //   514: astore 12
    //   516: aload 11
    //   518: aload 12
    //   520: invokespecial 249	java/io/File:<init>	(Ljava/lang/String;)V
    //   523: aload 11
    //   525: invokevirtual 252	java/io/File:getName	()Ljava/lang/String;
    //   528: astore 11
    //   530: aload 5
    //   532: aload 8
    //   534: aload 11
    //   536: aload 6
    //   538: invokestatic 255	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   541: astore 12
    //   543: aload 10
    //   545: invokeinterface 80 1 0
    //   550: istore 14
    //   552: iload 14
    //   554: ifeq +598 -> 1152
    //   557: iconst_0
    //   558: istore 14
    //   560: aconst_null
    //   561: astore 8
    //   563: ldc -79
    //   565: astore 11
    //   567: aload 10
    //   569: aload 11
    //   571: invokeinterface 259 2 0
    //   576: istore 13
    //   578: aload 10
    //   580: iload 13
    //   582: invokeinterface 263 2 0
    //   587: astore 21
    //   589: aload 21
    //   591: ifnull -48 -> 543
    //   594: aload 21
    //   596: invokevirtual 266	java/lang/String:trim	()Ljava/lang/String;
    //   599: astore 11
    //   601: aload 11
    //   603: invokevirtual 269	java/lang/String:length	()I
    //   606: istore 13
    //   608: iload 13
    //   610: ifeq -67 -> 543
    //   613: ldc 36
    //   615: astore 11
    //   617: aload 10
    //   619: aload 11
    //   621: invokeinterface 259 2 0
    //   626: istore 13
    //   628: aload 10
    //   630: iload 13
    //   632: invokeinterface 68 2 0
    //   637: lstore 18
    //   639: ldc -81
    //   641: astore 11
    //   643: aload 10
    //   645: aload 11
    //   647: invokeinterface 259 2 0
    //   652: istore 13
    //   654: aload 10
    //   656: iload 13
    //   658: invokeinterface 68 2 0
    //   663: lstore 22
    //   665: ldc -66
    //   667: astore 11
    //   669: aload 10
    //   671: aload 11
    //   673: invokeinterface 259 2 0
    //   678: istore 13
    //   680: aload 10
    //   682: iload 13
    //   684: invokeinterface 68 2 0
    //   689: lstore 24
    //   691: ldc -69
    //   693: astore 11
    //   695: aload 10
    //   697: aload 11
    //   699: invokeinterface 259 2 0
    //   704: istore 13
    //   706: aload 10
    //   708: iload 13
    //   710: invokeinterface 263 2 0
    //   715: astore 11
    //   717: ldc -57
    //   719: astore 26
    //   721: aload 10
    //   723: aload 26
    //   725: invokeinterface 259 2 0
    //   730: istore 27
    //   732: aload 10
    //   734: iload 27
    //   736: invokeinterface 273 2 0
    //   741: istore 27
    //   743: iload 27
    //   745: ifeq +49 -> 794
    //   748: aload 12
    //   750: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   753: istore 27
    //   755: iload 27
    //   757: ifne +37 -> 794
    //   760: aload 12
    //   762: aload 21
    //   764: invokestatic 276	com/vvt/capture/email/generic/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   767: astore 8
    //   769: aload 8
    //   771: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   774: istore 27
    //   776: iload 27
    //   778: ifne +16 -> 794
    //   781: aload 5
    //   783: aload 8
    //   785: aload 21
    //   787: aload 6
    //   789: invokestatic 255	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   792: astore 8
    //   794: aload 8
    //   796: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   799: istore 27
    //   801: iload 27
    //   803: ifeq +397 -> 1200
    //   806: aload 11
    //   808: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   811: istore 27
    //   813: iload 27
    //   815: ifne +10 -> 825
    //   818: aload 11
    //   820: invokestatic 279	com/vvt/capture/email/removeFromPath/removeFromPath:FxFileObserverWorker	(Ljava/lang/String;)Ljava/lang/String;
    //   823: astore 11
    //   825: aload 11
    //   827: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   830: istore 27
    //   832: iload 27
    //   834: ifne +178 -> 1012
    //   837: aload 11
    //   839: invokestatic 122	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   842: istore 27
    //   844: iload 27
    //   846: ifeq +166 -> 1012
    //   849: lload 18
    //   851: invokestatic 282	java/lang/Long:toString	(J)Ljava/lang/String;
    //   854: astore 8
    //   856: aload 5
    //   858: aload 11
    //   860: aload 8
    //   862: aload 6
    //   864: invokestatic 255	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   867: astore 8
    //   869: aload 8
    //   871: astore 11
    //   873: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   876: istore 14
    //   878: iload 14
    //   880: ifeq +3 -> 883
    //   883: lload 22
    //   885: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   888: astore 8
    //   890: aload 7
    //   892: aload 8
    //   894: invokevirtual 286	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   897: istore 14
    //   899: iload 14
    //   901: ifeq +221 -> 1122
    //   904: lload 22
    //   906: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   909: astore 8
    //   911: aload 7
    //   913: aload 8
    //   915: invokevirtual 290	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   918: astore 8
    //   920: aload 8
    //   922: checkcast 292	java/util/List
    //   925: astore 8
    //   927: new 294	com/vvt/capture/email/a
    //   930: astore 28
    //   932: aload 28
    //   934: invokespecial 295	com/vvt/capture/email/a:<init>	()V
    //   937: aload 28
    //   939: aload 21
    //   941: invokevirtual 297	com/vvt/capture/email/a:a	(Ljava/lang/String;)V
    //   944: aload 28
    //   946: aload 11
    //   948: invokevirtual 299	com/vvt/capture/email/a:removeFromPath	(Ljava/lang/String;)V
    //   951: aload 8
    //   953: aload 28
    //   955: invokeinterface 302 2 0
    //   960: pop
    //   961: lload 22
    //   963: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   966: astore 11
    //   968: aload 7
    //   970: aload 11
    //   972: aload 8
    //   974: invokevirtual 306	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   977: pop
    //   978: goto -435 -> 543
    //   981: astore 8
    //   983: aload 10
    //   985: astore 8
    //   987: getstatic 25	com/vvt/capture/email/removeFromPath/removeFromPath:d	Z
    //   990: istore 9
    //   992: iload 9
    //   994: ifeq +3 -> 997
    //   997: aload 8
    //   999: ifnull +10 -> 1009
    //   1002: aload 8
    //   1004: invokeinterface 72 1 0
    //   1009: aload 7
    //   1011: areturn
    //   1012: iconst_0
    //   1013: istore 13
    //   1015: aconst_null
    //   1016: astore 11
    //   1018: bipush 6
    //   1020: istore 27
    //   1022: iload 13
    //   1024: iload 27
    //   1026: if_icmpge +174 -> 1200
    //   1029: ldc2_w 307
    //   1032: lstore 29
    //   1034: lload 29
    //   1036: invokestatic 134	android/os/SystemClock:sleep	(J)V
    //   1039: lload 24
    //   1041: invokestatic 312	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	(J)Ljava/lang/String;
    //   1044: astore 26
    //   1046: aload 26
    //   1048: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1051: istore 31
    //   1053: iload 31
    //   1055: ifne +58 -> 1113
    //   1058: lload 18
    //   1060: invokestatic 282	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1063: astore 8
    //   1065: aload 26
    //   1067: aload 8
    //   1069: invokestatic 141	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1072: astore 8
    //   1074: lload 18
    //   1076: invokestatic 282	java/lang/Long:toString	(J)Ljava/lang/String;
    //   1079: astore 26
    //   1081: aload 5
    //   1083: aload 8
    //   1085: aload 26
    //   1087: aload 6
    //   1089: invokestatic 255	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1092: astore 8
    //   1094: aload 8
    //   1096: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1099: istore 27
    //   1101: iload 27
    //   1103: ifne +10 -> 1113
    //   1106: aload 8
    //   1108: astore 11
    //   1110: goto -237 -> 873
    //   1113: iload 13
    //   1115: iconst_1
    //   1116: iadd
    //   1117: istore 13
    //   1119: goto -101 -> 1018
    //   1122: new 314	java/util/ArrayList
    //   1125: astore 8
    //   1127: aload 8
    //   1129: invokespecial 315	java/util/ArrayList:<init>	()V
    //   1132: goto -205 -> 927
    //   1135: astore 8
    //   1137: aload 10
    //   1139: ifnull +10 -> 1149
    //   1142: aload 10
    //   1144: invokeinterface 72 1 0
    //   1149: aload 8
    //   1151: athrow
    //   1152: aload 10
    //   1154: ifnull -145 -> 1009
    //   1157: aload 10
    //   1159: invokeinterface 72 1 0
    //   1164: goto -155 -> 1009
    //   1167: astore 32
    //   1169: iconst_0
    //   1170: istore 9
    //   1172: aconst_null
    //   1173: astore 10
    //   1175: aload 32
    //   1177: astore 8
    //   1179: goto -42 -> 1137
    //   1182: astore 32
    //   1184: aload 8
    //   1186: astore 10
    //   1188: aload 32
    //   1190: astore 8
    //   1192: goto -55 -> 1137
    //   1195: astore 10
    //   1197: goto -210 -> 987
    //   1200: aload 8
    //   1202: astore 11
    //   1204: goto -331 -> 873
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1207	0	paramLong1	long
    //   0	1207	2	paramLong2	long
    //   0	1207	4	paramSQLiteDatabase	SQLiteDatabase
    //   0	1207	5	paramString1	String
    //   0	1207	6	paramString2	String
    //   3	1007	7	localHashMap	java.util.HashMap
    //   12	961	8	localObject1	Object
    //   981	1	8	localException1	Exception
    //   985	143	8	localObject2	Object
    //   1135	15	8	localObject3	Object
    //   1177	24	8	localObject4	Object
    //   16	3	9	i	int
    //   386	99	9	j	int
    //   485	1	9	k	int
    //   990	181	9	bool1	boolean
    //   23	1164	10	localObject5	Object
    //   1195	1	10	localException2	Exception
    //   26	1177	11	localObject6	Object
    //   299	462	12	localObject7	Object
    //   324	83	13	m	int
    //   420	698	13	n	int
    //   351	549	14	bool2	boolean
    //   367	3	15	l1	long
    //   381	84	17	bool3	boolean
    //   412	663	18	l2	long
    //   452	3	20	bool4	boolean
    //   587	353	21	str1	String
    //   663	299	22	l3	long
    //   689	351	24	l4	long
    //   719	367	26	str2	String
    //   730	14	27	i1	int
    //   753	92	27	bool5	boolean
    //   1020	7	27	i2	int
    //   1099	3	27	bool6	boolean
    //   930	24	28	locala	com.vvt.capture.email.a
    //   1032	3	29	l5	long
    //   1051	3	31	bool7	boolean
    //   1167	9	32	localObject8	Object
    //   1182	7	32	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   507	510	981	java/lang/Exception
    //   518	523	981	java/lang/Exception
    //   523	528	981	java/lang/Exception
    //   536	541	981	java/lang/Exception
    //   543	550	981	java/lang/Exception
    //   569	576	981	java/lang/Exception
    //   580	587	981	java/lang/Exception
    //   594	599	981	java/lang/Exception
    //   601	606	981	java/lang/Exception
    //   619	626	981	java/lang/Exception
    //   630	637	981	java/lang/Exception
    //   645	652	981	java/lang/Exception
    //   656	663	981	java/lang/Exception
    //   671	678	981	java/lang/Exception
    //   682	689	981	java/lang/Exception
    //   697	704	981	java/lang/Exception
    //   708	715	981	java/lang/Exception
    //   723	730	981	java/lang/Exception
    //   734	741	981	java/lang/Exception
    //   748	753	981	java/lang/Exception
    //   762	767	981	java/lang/Exception
    //   769	774	981	java/lang/Exception
    //   787	792	981	java/lang/Exception
    //   794	799	981	java/lang/Exception
    //   806	811	981	java/lang/Exception
    //   818	823	981	java/lang/Exception
    //   825	830	981	java/lang/Exception
    //   837	842	981	java/lang/Exception
    //   849	854	981	java/lang/Exception
    //   862	867	981	java/lang/Exception
    //   873	876	981	java/lang/Exception
    //   883	888	981	java/lang/Exception
    //   892	897	981	java/lang/Exception
    //   904	909	981	java/lang/Exception
    //   913	918	981	java/lang/Exception
    //   920	925	981	java/lang/Exception
    //   927	930	981	java/lang/Exception
    //   932	937	981	java/lang/Exception
    //   939	944	981	java/lang/Exception
    //   946	951	981	java/lang/Exception
    //   953	961	981	java/lang/Exception
    //   961	966	981	java/lang/Exception
    //   972	978	981	java/lang/Exception
    //   1034	1039	981	java/lang/Exception
    //   1039	1044	981	java/lang/Exception
    //   1046	1051	981	java/lang/Exception
    //   1058	1063	981	java/lang/Exception
    //   1067	1072	981	java/lang/Exception
    //   1074	1079	981	java/lang/Exception
    //   1087	1092	981	java/lang/Exception
    //   1094	1099	981	java/lang/Exception
    //   1122	1125	981	java/lang/Exception
    //   1127	1132	981	java/lang/Exception
    //   507	510	1135	finally
    //   518	523	1135	finally
    //   523	528	1135	finally
    //   536	541	1135	finally
    //   543	550	1135	finally
    //   569	576	1135	finally
    //   580	587	1135	finally
    //   594	599	1135	finally
    //   601	606	1135	finally
    //   619	626	1135	finally
    //   630	637	1135	finally
    //   645	652	1135	finally
    //   656	663	1135	finally
    //   671	678	1135	finally
    //   682	689	1135	finally
    //   697	704	1135	finally
    //   708	715	1135	finally
    //   723	730	1135	finally
    //   734	741	1135	finally
    //   748	753	1135	finally
    //   762	767	1135	finally
    //   769	774	1135	finally
    //   787	792	1135	finally
    //   794	799	1135	finally
    //   806	811	1135	finally
    //   818	823	1135	finally
    //   825	830	1135	finally
    //   837	842	1135	finally
    //   849	854	1135	finally
    //   862	867	1135	finally
    //   873	876	1135	finally
    //   883	888	1135	finally
    //   892	897	1135	finally
    //   904	909	1135	finally
    //   913	918	1135	finally
    //   920	925	1135	finally
    //   927	930	1135	finally
    //   932	937	1135	finally
    //   939	944	1135	finally
    //   946	951	1135	finally
    //   953	961	1135	finally
    //   961	966	1135	finally
    //   972	978	1135	finally
    //   1034	1039	1135	finally
    //   1039	1044	1135	finally
    //   1046	1051	1135	finally
    //   1058	1063	1135	finally
    //   1067	1072	1135	finally
    //   1074	1079	1135	finally
    //   1087	1092	1135	finally
    //   1094	1099	1135	finally
    //   1122	1125	1135	finally
    //   1127	1132	1135	finally
    //   369	374	1167	finally
    //   377	381	1167	finally
    //   383	386	1167	finally
    //   414	419	1182	finally
    //   429	433	1182	finally
    //   440	447	1182	finally
    //   449	452	1182	finally
    //   474	481	1182	finally
    //   987	990	1182	finally
    //   369	374	1195	java/lang/Exception
    //   377	381	1195	java/lang/Exception
    //   383	386	1195	java/lang/Exception
    //   414	419	1195	java/lang/Exception
    //   429	433	1195	java/lang/Exception
    //   440	447	1195	java/lang/Exception
    //   449	452	1195	java/lang/Exception
    //   474	481	1195	java/lang/Exception
  }
  
  /* Error */
  public static List a(long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   3: istore 6
    //   5: iload 6
    //   7: ifeq +3 -> 10
    //   10: invokestatic 317	com/vvt/capture/email/removeFromPath/removeFromPath:a	()Ljava/lang/String;
    //   13: astore 7
    //   15: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   18: istore 8
    //   20: iload 8
    //   22: ifeq +3 -> 25
    //   25: bipush 17
    //   27: istore 8
    //   29: iload 8
    //   31: aload 7
    //   33: invokestatic 31	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   36: astore 7
    //   38: aload 7
    //   40: lload_0
    //   41: lload_2
    //   42: aload 4
    //   44: aload 5
    //   46: invokestatic 320	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;JJLjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   49: astore 9
    //   51: iconst_0
    //   52: ifeq +7 -> 59
    //   55: aconst_null
    //   56: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   59: aload 7
    //   61: ifnull +8 -> 69
    //   64: aload 7
    //   66: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   69: aload 9
    //   71: astore 7
    //   73: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   76: istore 8
    //   78: iload 8
    //   80: ifeq +3 -> 83
    //   83: aload 7
    //   85: areturn
    //   86: astore 7
    //   88: iconst_0
    //   89: istore 6
    //   91: aconst_null
    //   92: astore 7
    //   94: getstatic 25	com/vvt/capture/email/removeFromPath/removeFromPath:d	Z
    //   97: istore 8
    //   99: iload 8
    //   101: ifeq +3 -> 104
    //   104: iconst_0
    //   105: ifeq +7 -> 112
    //   108: aconst_null
    //   109: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   112: aload 7
    //   114: ifnull +8 -> 122
    //   117: aload 7
    //   119: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   122: iconst_0
    //   123: istore 6
    //   125: aconst_null
    //   126: astore 7
    //   128: goto -55 -> 73
    //   131: astore 7
    //   133: iconst_0
    //   134: istore 8
    //   136: aconst_null
    //   137: astore 9
    //   139: iconst_0
    //   140: ifeq +7 -> 147
    //   143: aconst_null
    //   144: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   147: aload 9
    //   149: ifnull +8 -> 157
    //   152: aload 9
    //   154: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   157: aload 7
    //   159: athrow
    //   160: astore 10
    //   162: aload 7
    //   164: astore 9
    //   166: aload 10
    //   168: astore 7
    //   170: goto -31 -> 139
    //   173: astore 9
    //   175: goto -81 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	178	0	paramLong1	long
    //   0	178	2	paramLong2	long
    //   0	178	4	paramString1	String
    //   0	178	5	paramString2	String
    //   3	121	6	bool1	boolean
    //   13	71	7	localObject1	Object
    //   86	1	7	localException1	Exception
    //   92	35	7	localObject2	Object
    //   131	32	7	localObject3	Object
    //   168	1	7	localObject4	Object
    //   18	3	8	bool2	boolean
    //   27	3	8	i	int
    //   76	59	8	bool3	boolean
    //   49	116	9	localObject5	Object
    //   173	1	9	localException2	Exception
    //   160	7	10	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   10	13	86	java/lang/Exception
    //   15	18	86	java/lang/Exception
    //   31	36	86	java/lang/Exception
    //   10	13	131	finally
    //   15	18	131	finally
    //   31	36	131	finally
    //   44	49	160	finally
    //   94	97	160	finally
    //   44	49	173	java/lang/Exception
  }
  
  /* Error */
  public static List a(SQLiteDatabase paramSQLiteDatabase, long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   3: istore 7
    //   5: iload 7
    //   7: ifeq +3 -> 10
    //   10: new 314	java/util/ArrayList
    //   13: astore 8
    //   15: aload 8
    //   17: invokespecial 315	java/util/ArrayList:<init>	()V
    //   20: aload_0
    //   21: astore 9
    //   23: aload 6
    //   25: astore 10
    //   27: lload_1
    //   28: lload_3
    //   29: aload_0
    //   30: aload 5
    //   32: aload 6
    //   34: invokestatic 323	com/vvt/capture/email/removeFromPath/removeFromPath:a	(JJLandroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Ljava/util/HashMap;
    //   37: astore 11
    //   39: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   42: istore 7
    //   44: iload 7
    //   46: ifeq +3 -> 49
    //   49: bipush 52
    //   51: istore 12
    //   53: iload 12
    //   55: anewarray 4	java/lang/Object
    //   58: astore 13
    //   60: aconst_null
    //   61: astore 14
    //   63: aload 13
    //   65: iconst_0
    //   66: ldc 38
    //   68: aastore
    //   69: aload 13
    //   71: iconst_1
    //   72: ldc 36
    //   74: aastore
    //   75: aload 13
    //   77: iconst_2
    //   78: ldc -60
    //   80: aastore
    //   81: aload 13
    //   83: iconst_3
    //   84: ldc -57
    //   86: aastore
    //   87: aload 13
    //   89: iconst_4
    //   90: ldc 38
    //   92: aastore
    //   93: aload 13
    //   95: iconst_5
    //   96: ldc -63
    //   98: aastore
    //   99: aload 13
    //   101: bipush 6
    //   103: ldc_w 328
    //   106: aastore
    //   107: aload 13
    //   109: bipush 7
    //   111: ldc_w 330
    //   114: aastore
    //   115: aload 13
    //   117: bipush 8
    //   119: ldc_w 328
    //   122: aastore
    //   123: aload 13
    //   125: bipush 9
    //   127: ldc_w 328
    //   130: aastore
    //   131: aload 13
    //   133: bipush 10
    //   135: ldc_w 332
    //   138: aastore
    //   139: aload 13
    //   141: bipush 11
    //   143: ldc_w 334
    //   146: aastore
    //   147: aload 13
    //   149: bipush 12
    //   151: ldc_w 336
    //   154: aastore
    //   155: aload 13
    //   157: bipush 13
    //   159: ldc 38
    //   161: aastore
    //   162: aload 13
    //   164: bipush 14
    //   166: ldc_w 332
    //   169: aastore
    //   170: aload 13
    //   172: bipush 15
    //   174: ldc_w 338
    //   177: aastore
    //   178: aload 13
    //   180: bipush 16
    //   182: ldc_w 340
    //   185: aastore
    //   186: aload 13
    //   188: bipush 17
    //   190: ldc_w 342
    //   193: aastore
    //   194: aload 13
    //   196: bipush 18
    //   198: ldc_w 344
    //   201: aastore
    //   202: aload 13
    //   204: bipush 19
    //   206: ldc_w 346
    //   209: aastore
    //   210: aload 13
    //   212: bipush 20
    //   214: ldc_w 348
    //   217: aastore
    //   218: aload 13
    //   220: bipush 21
    //   222: ldc_w 350
    //   225: aastore
    //   226: aload 13
    //   228: bipush 22
    //   230: ldc 38
    //   232: aastore
    //   233: aload 13
    //   235: bipush 23
    //   237: ldc_w 328
    //   240: aastore
    //   241: aload 13
    //   243: bipush 24
    //   245: ldc 38
    //   247: aastore
    //   248: aload 13
    //   250: bipush 25
    //   252: ldc -66
    //   254: aastore
    //   255: aload 13
    //   257: bipush 26
    //   259: ldc_w 328
    //   262: aastore
    //   263: aload 13
    //   265: bipush 27
    //   267: ldc 36
    //   269: aastore
    //   270: aload 13
    //   272: bipush 28
    //   274: ldc -60
    //   276: aastore
    //   277: aload 13
    //   279: bipush 29
    //   281: ldc 36
    //   283: aastore
    //   284: aload 13
    //   286: bipush 30
    //   288: ldc -60
    //   290: aastore
    //   291: aload 13
    //   293: bipush 31
    //   295: ldc -41
    //   297: aastore
    //   298: aload 13
    //   300: bipush 32
    //   302: ldc -57
    //   304: aastore
    //   305: aload 13
    //   307: bipush 33
    //   309: ldc -60
    //   311: aastore
    //   312: aload 13
    //   314: bipush 34
    //   316: ldc -60
    //   318: aastore
    //   319: aload 13
    //   321: bipush 35
    //   323: ldc 38
    //   325: aastore
    //   326: aload 13
    //   328: bipush 36
    //   330: ldc -63
    //   332: aastore
    //   333: aload 13
    //   335: bipush 37
    //   337: ldc -60
    //   339: aastore
    //   340: aload 13
    //   342: bipush 38
    //   344: ldc 36
    //   346: aastore
    //   347: aload 13
    //   349: bipush 39
    //   351: ldc_w 350
    //   354: aastore
    //   355: aload 13
    //   357: bipush 40
    //   359: ldc 38
    //   361: aastore
    //   362: aload 13
    //   364: bipush 41
    //   366: ldc 36
    //   368: aastore
    //   369: lload_1
    //   370: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   373: astore 9
    //   375: aload 13
    //   377: bipush 42
    //   379: aload 9
    //   381: aastore
    //   382: aload 13
    //   384: bipush 43
    //   386: ldc 38
    //   388: aastore
    //   389: aload 13
    //   391: bipush 44
    //   393: ldc 36
    //   395: aastore
    //   396: lload_3
    //   397: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   400: astore 9
    //   402: aload 13
    //   404: bipush 45
    //   406: aload 9
    //   408: aastore
    //   409: aload 13
    //   411: bipush 46
    //   413: ldc -60
    //   415: aastore
    //   416: aload 13
    //   418: bipush 47
    //   420: ldc -57
    //   422: aastore
    //   423: aload 13
    //   425: bipush 48
    //   427: ldc -60
    //   429: aastore
    //   430: aload 13
    //   432: bipush 49
    //   434: ldc -57
    //   436: aastore
    //   437: aload 13
    //   439: bipush 50
    //   441: ldc -60
    //   443: aastore
    //   444: bipush 51
    //   446: istore 15
    //   448: ldc -57
    //   450: astore 9
    //   452: aload 13
    //   454: iload 15
    //   456: aload 9
    //   458: aastore
    //   459: ldc_w 325
    //   462: aload 13
    //   464: invokestatic 52	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   467: astore 13
    //   469: iconst_0
    //   470: istore 7
    //   472: aconst_null
    //   473: astore 16
    //   475: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   478: istore 15
    //   480: iload 15
    //   482: ifeq +3 -> 485
    //   485: iconst_0
    //   486: istore 15
    //   488: aconst_null
    //   489: astore 14
    //   491: aload_0
    //   492: aload 13
    //   494: aconst_null
    //   495: invokevirtual 58	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   498: astore 13
    //   500: iconst_0
    //   501: istore 15
    //   503: aconst_null
    //   504: astore 14
    //   506: aload 13
    //   508: invokeinterface 80 1 0
    //   513: istore 7
    //   515: iload 7
    //   517: ifeq +531 -> 1048
    //   520: ldc 36
    //   522: astore 16
    //   524: aload 13
    //   526: aload 16
    //   528: invokeinterface 259 2 0
    //   533: istore 7
    //   535: aload 13
    //   537: iload 7
    //   539: invokeinterface 68 2 0
    //   544: lstore 17
    //   546: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   549: istore 7
    //   551: iload 7
    //   553: ifeq +3 -> 556
    //   556: new 360	com/vvt/capture/email/MyUncaughtExceptionHandler
    //   559: astore 10
    //   561: aload 10
    //   563: invokespecial 361	com/vvt/capture/email/MyUncaughtExceptionHandler:<init>	()V
    //   566: ldc_w 336
    //   569: astore 16
    //   571: aload 13
    //   573: aload 16
    //   575: invokeinterface 259 2 0
    //   580: istore 7
    //   582: aload 13
    //   584: iload 7
    //   586: invokeinterface 263 2 0
    //   591: astore 16
    //   593: aload 16
    //   595: ifnonnull +8 -> 603
    //   598: ldc_w 363
    //   601: astore 16
    //   603: aload 10
    //   605: aload 16
    //   607: invokevirtual 364	com/vvt/capture/email/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;)V
    //   610: ldc -57
    //   612: astore 16
    //   614: aload 13
    //   616: aload 16
    //   618: invokeinterface 259 2 0
    //   623: istore 7
    //   625: aload 13
    //   627: iload 7
    //   629: invokeinterface 273 2 0
    //   634: istore 7
    //   636: iload 7
    //   638: ifne +359 -> 997
    //   641: iconst_1
    //   642: istore 7
    //   644: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   647: istore 19
    //   649: iload 19
    //   651: ifeq +3 -> 654
    //   654: aload 10
    //   656: iload 7
    //   658: invokevirtual 367	com/vvt/capture/email/MyUncaughtExceptionHandler:a	(Z)V
    //   661: lload 17
    //   663: invokestatic 369	com/vvt/capture/email/removeFromPath/removeFromPath:a	(J)Ljava/lang/String;
    //   666: astore 16
    //   668: aload 16
    //   670: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   673: istore 19
    //   675: iload 19
    //   677: ifne +47 -> 724
    //   680: lload 17
    //   682: invokestatic 282	java/lang/Long:toString	(J)Ljava/lang/String;
    //   685: astore 20
    //   687: aload 5
    //   689: aload 16
    //   691: aload 20
    //   693: aload 6
    //   695: invokestatic 255	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   698: astore 16
    //   700: aload 16
    //   702: invokestatic 88	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   705: istore 19
    //   707: iload 19
    //   709: ifne +15 -> 724
    //   712: aload 16
    //   714: invokestatic 372	com/vvt/capture/email/removeFromPath/removeFromPath:f	(Ljava/lang/String;)Ljava/lang/String;
    //   717: astore 14
    //   719: aload 16
    //   721: invokestatic 374	com/vvt/capture/email/removeFromPath/removeFromPath:e	(Ljava/lang/String;)V
    //   724: aload 14
    //   726: ifnonnull +280 -> 1006
    //   729: ldc_w 363
    //   732: astore 16
    //   734: aload 10
    //   736: aload 16
    //   738: invokevirtual 376	com/vvt/capture/email/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   741: lload 17
    //   743: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   746: astore 16
    //   748: aload 11
    //   750: aload 16
    //   752: invokevirtual 290	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   755: astore 16
    //   757: aload 16
    //   759: checkcast 292	java/util/List
    //   762: astore 16
    //   764: aload 16
    //   766: ifnonnull +13 -> 779
    //   769: new 314	java/util/ArrayList
    //   772: astore 16
    //   774: aload 16
    //   776: invokespecial 315	java/util/ArrayList:<init>	()V
    //   779: aload 10
    //   781: aload 16
    //   783: invokevirtual 379	com/vvt/capture/email/MyUncaughtExceptionHandler:a	(Ljava/util/List;)V
    //   786: ldc_w 350
    //   789: astore 16
    //   791: aload 13
    //   793: aload 16
    //   795: invokeinterface 259 2 0
    //   800: istore 7
    //   802: aload 13
    //   804: iload 7
    //   806: invokeinterface 68 2 0
    //   811: lstore 17
    //   813: aload 10
    //   815: lload 17
    //   817: invokevirtual 381	com/vvt/capture/email/MyUncaughtExceptionHandler:a	(J)V
    //   820: ldc_w 338
    //   823: astore 16
    //   825: aload 13
    //   827: aload 16
    //   829: invokestatic 384	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)[Ljava/lang/String;
    //   832: astore 16
    //   834: aload 16
    //   836: arraylength
    //   837: istore 21
    //   839: iload 21
    //   841: ifle +172 -> 1013
    //   844: iconst_0
    //   845: istore 21
    //   847: aconst_null
    //   848: astore 9
    //   850: aload 16
    //   852: iconst_0
    //   853: aaload
    //   854: astore 9
    //   856: aload 9
    //   858: ifnull +155 -> 1013
    //   861: iconst_0
    //   862: istore 21
    //   864: aconst_null
    //   865: astore 9
    //   867: aload 16
    //   869: iconst_0
    //   870: aaload
    //   871: astore 16
    //   873: aload 10
    //   875: aload 16
    //   877: invokevirtual 385	com/vvt/capture/email/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   880: ldc_w 340
    //   883: astore 16
    //   885: aload 13
    //   887: aload 16
    //   889: invokestatic 384	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)[Ljava/lang/String;
    //   892: astore 16
    //   894: aload 10
    //   896: aload 16
    //   898: invokevirtual 388	com/vvt/capture/email/MyUncaughtExceptionHandler:a	([Ljava/lang/String;)V
    //   901: ldc_w 342
    //   904: astore 16
    //   906: aload 13
    //   908: aload 16
    //   910: invokestatic 384	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)[Ljava/lang/String;
    //   913: astore 16
    //   915: aload 10
    //   917: aload 16
    //   919: invokevirtual 390	com/vvt/capture/email/MyUncaughtExceptionHandler:removeFromPath	([Ljava/lang/String;)V
    //   922: ldc_w 344
    //   925: astore 16
    //   927: aload 13
    //   929: aload 16
    //   931: invokestatic 384	com/vvt/capture/email/removeFromPath/removeFromPath:a	(Landroid/database/Cursor;Ljava/lang/String;)[Ljava/lang/String;
    //   934: astore 16
    //   936: aload 10
    //   938: aload 16
    //   940: invokevirtual 392	com/vvt/capture/email/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	([Ljava/lang/String;)V
    //   943: aload 8
    //   945: aload 10
    //   947: invokeinterface 302 2 0
    //   952: pop
    //   953: goto -447 -> 506
    //   956: astore 16
    //   958: aload 13
    //   960: astore 16
    //   962: getstatic 25	com/vvt/capture/email/removeFromPath/removeFromPath:d	Z
    //   965: istore 12
    //   967: iload 12
    //   969: ifeq +3 -> 972
    //   972: aload 16
    //   974: ifnull +10 -> 984
    //   977: aload 16
    //   979: invokeinterface 72 1 0
    //   984: getstatic 17	com/vvt/capture/email/removeFromPath/removeFromPath:removeFromPath	Z
    //   987: istore 7
    //   989: iload 7
    //   991: ifeq +3 -> 994
    //   994: aload 8
    //   996: areturn
    //   997: iconst_0
    //   998: istore 7
    //   1000: aconst_null
    //   1001: astore 16
    //   1003: goto -359 -> 644
    //   1006: aload 14
    //   1008: astore 16
    //   1010: goto -276 -> 734
    //   1013: ldc_w 363
    //   1016: astore 16
    //   1018: goto -145 -> 873
    //   1021: astore 22
    //   1023: iconst_0
    //   1024: istore 12
    //   1026: aconst_null
    //   1027: astore 13
    //   1029: aload 22
    //   1031: astore 16
    //   1033: aload 13
    //   1035: ifnull +10 -> 1045
    //   1038: aload 13
    //   1040: invokeinterface 72 1 0
    //   1045: aload 16
    //   1047: athrow
    //   1048: aload 13
    //   1050: ifnull -66 -> 984
    //   1053: aload 13
    //   1055: invokeinterface 72 1 0
    //   1060: goto -76 -> 984
    //   1063: astore 16
    //   1065: goto -32 -> 1033
    //   1068: astore 22
    //   1070: aload 16
    //   1072: astore 13
    //   1074: aload 22
    //   1076: astore 16
    //   1078: goto -45 -> 1033
    //   1081: astore 13
    //   1083: goto -121 -> 962
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1086	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	1086	1	paramLong1	long
    //   0	1086	3	paramLong2	long
    //   0	1086	5	paramString1	String
    //   0	1086	6	paramString2	String
    //   3	513	7	bool1	boolean
    //   533	5	7	i	int
    //   549	3	7	bool2	boolean
    //   580	77	7	j	int
    //   800	5	7	k	int
    //   987	12	7	bool3	boolean
    //   13	982	8	localArrayList	ArrayList
    //   21	845	9	localObject1	Object
    //   25	921	10	localObject2	Object
    //   37	712	11	localHashMap	java.util.HashMap
    //   51	3	12	m	int
    //   965	60	12	bool4	boolean
    //   58	1015	13	localObject3	Object
    //   1081	1	13	localException1	Exception
    //   61	946	14	str1	String
    //   446	9	15	n	int
    //   478	24	15	bool5	boolean
    //   473	466	16	localObject4	Object
    //   956	1	16	localException2	Exception
    //   960	86	16	localObject5	Object
    //   1063	8	16	localObject6	Object
    //   1076	1	16	localObject7	Object
    //   544	272	17	l	long
    //   647	61	19	bool6	boolean
    //   685	7	20	str2	String
    //   837	26	21	i1	int
    //   1021	9	22	localObject8	Object
    //   1068	7	22	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   506	513	956	java/lang/Exception
    //   526	533	956	java/lang/Exception
    //   537	544	956	java/lang/Exception
    //   546	549	956	java/lang/Exception
    //   556	559	956	java/lang/Exception
    //   561	566	956	java/lang/Exception
    //   573	580	956	java/lang/Exception
    //   584	591	956	java/lang/Exception
    //   605	610	956	java/lang/Exception
    //   616	623	956	java/lang/Exception
    //   627	634	956	java/lang/Exception
    //   644	647	956	java/lang/Exception
    //   656	661	956	java/lang/Exception
    //   661	666	956	java/lang/Exception
    //   668	673	956	java/lang/Exception
    //   680	685	956	java/lang/Exception
    //   693	698	956	java/lang/Exception
    //   700	705	956	java/lang/Exception
    //   712	717	956	java/lang/Exception
    //   719	724	956	java/lang/Exception
    //   736	741	956	java/lang/Exception
    //   741	746	956	java/lang/Exception
    //   750	755	956	java/lang/Exception
    //   757	762	956	java/lang/Exception
    //   769	772	956	java/lang/Exception
    //   774	779	956	java/lang/Exception
    //   781	786	956	java/lang/Exception
    //   793	800	956	java/lang/Exception
    //   804	811	956	java/lang/Exception
    //   815	820	956	java/lang/Exception
    //   827	832	956	java/lang/Exception
    //   834	837	956	java/lang/Exception
    //   852	854	956	java/lang/Exception
    //   869	871	956	java/lang/Exception
    //   875	880	956	java/lang/Exception
    //   887	892	956	java/lang/Exception
    //   896	901	956	java/lang/Exception
    //   908	913	956	java/lang/Exception
    //   917	922	956	java/lang/Exception
    //   929	934	956	java/lang/Exception
    //   938	943	956	java/lang/Exception
    //   945	953	956	java/lang/Exception
    //   475	478	1021	finally
    //   494	498	1021	finally
    //   506	513	1063	finally
    //   526	533	1063	finally
    //   537	544	1063	finally
    //   546	549	1063	finally
    //   556	559	1063	finally
    //   561	566	1063	finally
    //   573	580	1063	finally
    //   584	591	1063	finally
    //   605	610	1063	finally
    //   616	623	1063	finally
    //   627	634	1063	finally
    //   644	647	1063	finally
    //   656	661	1063	finally
    //   661	666	1063	finally
    //   668	673	1063	finally
    //   680	685	1063	finally
    //   693	698	1063	finally
    //   700	705	1063	finally
    //   712	717	1063	finally
    //   719	724	1063	finally
    //   736	741	1063	finally
    //   741	746	1063	finally
    //   750	755	1063	finally
    //   757	762	1063	finally
    //   769	772	1063	finally
    //   774	779	1063	finally
    //   781	786	1063	finally
    //   793	800	1063	finally
    //   804	811	1063	finally
    //   815	820	1063	finally
    //   827	832	1063	finally
    //   834	837	1063	finally
    //   852	854	1063	finally
    //   869	871	1063	finally
    //   875	880	1063	finally
    //   887	892	1063	finally
    //   896	901	1063	finally
    //   908	913	1063	finally
    //   917	922	1063	finally
    //   929	934	1063	finally
    //   938	943	1063	finally
    //   945	953	1063	finally
    //   962	965	1068	finally
    //   475	478	1081	java/lang/Exception
    //   494	498	1081	java/lang/Exception
  }
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, long paramLong1, long paramLong2)
  {
    return com.vvt.capture.email.generic.b.a(paramSQLiteDatabase, paramLong1, paramLong2);
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
        boolean bool = localMatcher.find();
        if (!bool) {
          break;
        }
        int j = localMatcher.start();
        int k = localMatcher.end();
        String str = ((String)localObject).substring(j, k).toLowerCase();
        localArrayList.add(str);
      }
    }
    localObject = new String[0];
    return (String[])localArrayList.toArray((Object[])localObject);
  }
  
  private static String b(long paramLong)
  {
    Object localObject = null;
    boolean bool1 = b;
    if (bool1) {}
    String str1 = d();
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
        break label93;
      }
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return (String)localObject;
      label93:
      localObject = str1;
    }
  }
  
  public static String b(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  public static List b()
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
  
  public static long c()
  {
    long l = 0L;
    boolean bool1 = false;
    localSQLiteDatabase = null;
    try
    {
      String str = a();
      int i = 17;
      localSQLiteDatabase = com.vvt.p.c.a(i, str);
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
  
  public static long c(String paramString)
  {
    long l = 0L;
    int i = 17;
    SQLiteDatabase localSQLiteDatabase = com.vvt.p.c.a(i, paramString);
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
  
  private static String d()
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
    return p.a(paramString, "int_email_att");
  }
  
  private static void e(String paramString)
  {
    try
    {
      d.b(paramString);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private static String[] e()
  {
    int i = 2;
    int j = 1;
    String[] arrayOfString = new String[i];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.google.android.gm";
    String str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[0] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.google.android.gm";
    str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[j] = str;
    return arrayOfString;
  }
  
  private static String f(String paramString)
  {
    String str = null;
    boolean bool;
    if (paramString != null)
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      bool = localFile.exists();
      if (!bool) {
        break label31;
      }
      str = d.d(paramString);
    }
    for (;;)
    {
      return str;
      label31:
      bool = d;
      if (!bool) {}
    }
  }
  
  private static String g(String paramString)
  {
    String str1 = null;
    String str2 = "filePath=";
    try
    {
      int i = paramString.indexOf(str2);
      int j = -1;
      if (i != j)
      {
        int k = str2.length() + i;
        paramString = paramString.substring(k);
      }
      bool = b;
      if (bool) {}
      str2 = "UTF-8";
      str1 = URLDecoder.decode(paramString, str2);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        boolean bool = d;
        if (!bool) {}
      }
    }
    return str1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/removeFromPath/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */