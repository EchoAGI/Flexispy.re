package com.vvt.capture.browserurl.a;

import com.vvt.ak.a;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.g;
import com.vvt.e.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class f
  implements com.vvt.base.capture.f
{
  private static final boolean b = a.a;
  private static final boolean c = a.e;
  private c a;
  private SimpleDateFormat d;
  private String e;
  
  public f(String paramString)
  {
    this.e = paramString;
    Object localObject = new java/text/SimpleDateFormat;
    ((SimpleDateFormat)localObject).<init>("dd/MM/yy HH:mm:ss");
    this.d = ((SimpleDateFormat)localObject);
    localObject = c.a();
    this.a = ((c)localObject);
  }
  
  /* Error */
  private ArrayList a(long paramLong)
  {
    // Byte code:
    //   0: new 49	java/util/ArrayList
    //   3: astore_3
    //   4: aload_3
    //   5: invokespecial 50	java/util/ArrayList:<init>	()V
    //   8: aconst_null
    //   9: astore 4
    //   11: aconst_null
    //   12: astore 5
    //   14: ldc 52
    //   16: astore 6
    //   18: ldc 54
    //   20: astore 7
    //   22: ldc 56
    //   24: astore 8
    //   26: ldc 58
    //   28: astore 9
    //   30: ldc 60
    //   32: astore 10
    //   34: invokestatic 65	com/vvt/capture/browserurl/a/removeFromPath:d	()Z
    //   37: istore 11
    //   39: iload 11
    //   41: ifeq +500 -> 541
    //   44: ldc 67
    //   46: astore 8
    //   48: aload_0
    //   49: astore 12
    //   51: aload_0
    //   52: getfield 31	com/vvt/capture/browserurl/a/f:e	Ljava/lang/String;
    //   55: astore 7
    //   57: aload 8
    //   59: aload 7
    //   61: invokestatic 72	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   64: astore 6
    //   66: aload 6
    //   68: invokestatic 75	com/vvt/capture/browserurl/a/removeFromPath:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   71: astore 4
    //   73: ldc 79
    //   75: astore 7
    //   77: aload 6
    //   79: astore 13
    //   81: ldc 81
    //   83: astore 6
    //   85: ldc 77
    //   87: astore 8
    //   89: aload 7
    //   91: astore 14
    //   93: aload 4
    //   95: ifnull +504 -> 599
    //   98: ldc 83
    //   100: astore 7
    //   102: iconst_4
    //   103: istore 15
    //   105: iload 15
    //   107: anewarray 4	java/lang/Object
    //   110: astore 16
    //   112: iconst_0
    //   113: istore 17
    //   115: aconst_null
    //   116: astore 18
    //   118: aload 16
    //   120: iconst_0
    //   121: aload 8
    //   123: aastore
    //   124: iconst_1
    //   125: istore 19
    //   127: aload 16
    //   129: iload 19
    //   131: aload 6
    //   133: aastore
    //   134: iconst_2
    //   135: istore 19
    //   137: lload_1
    //   138: invokestatic 92	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   141: astore 18
    //   143: aload 16
    //   145: iload 19
    //   147: aload 18
    //   149: aastore
    //   150: iconst_3
    //   151: istore 19
    //   153: aload 16
    //   155: iload 19
    //   157: aload 6
    //   159: aastore
    //   160: aload 7
    //   162: aload 16
    //   164: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   167: astore 8
    //   169: aconst_null
    //   170: astore 7
    //   172: aload 4
    //   174: aload 8
    //   176: aconst_null
    //   177: invokevirtual 105	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   180: astore 5
    //   182: aload 5
    //   184: ifnull +415 -> 599
    //   187: aload 5
    //   189: invokeinterface 110 1 0
    //   194: istore 19
    //   196: iload 19
    //   198: ifeq +401 -> 599
    //   201: aload 5
    //   203: aload 9
    //   205: invokeinterface 114 2 0
    //   210: istore 19
    //   212: aload 5
    //   214: iload 19
    //   216: invokeinterface 118 2 0
    //   221: astore 16
    //   223: aload 16
    //   225: ifnull -38 -> 187
    //   228: aload 16
    //   230: invokevirtual 122	java/lang/String:trim	()Ljava/lang/String;
    //   233: astore 8
    //   235: aload 8
    //   237: invokevirtual 126	java/lang/String:length	()I
    //   240: istore 19
    //   242: iload 19
    //   244: ifeq -57 -> 187
    //   247: ldc -128
    //   249: astore 8
    //   251: aload 16
    //   253: aload 8
    //   255: invokevirtual 132	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   258: istore 19
    //   260: iload 19
    //   262: ifne -75 -> 187
    //   265: aload 5
    //   267: aload 6
    //   269: invokeinterface 114 2 0
    //   274: istore 19
    //   276: aload 5
    //   278: iload 19
    //   280: invokeinterface 136 2 0
    //   285: lstore 20
    //   287: ldc2_w 137
    //   290: lstore 22
    //   292: lload 20
    //   294: lload 22
    //   296: lcmp
    //   297: istore 17
    //   299: iload 17
    //   301: ifle +8 -> 309
    //   304: invokestatic 146	java/lang/System:currentTimeMillis	()J
    //   307: lstore 20
    //   309: aload 5
    //   311: aload 14
    //   313: invokeinterface 114 2 0
    //   318: istore 17
    //   320: aload 5
    //   322: iload 17
    //   324: invokeinterface 136 2 0
    //   329: lstore 22
    //   331: aload 5
    //   333: aload 10
    //   335: invokeinterface 114 2 0
    //   340: istore 24
    //   342: aload 5
    //   344: iload 24
    //   346: invokeinterface 118 2 0
    //   351: astore 25
    //   353: aload_0
    //   354: astore 12
    //   356: aload_0
    //   357: getfield 40	com/vvt/capture/browserurl/a/f:d	Ljava/text/SimpleDateFormat;
    //   360: astore 26
    //   362: aload_0
    //   363: getfield 47	com/vvt/capture/browserurl/a/f:a	Lcom/vvt/e/MyUncaughtExceptionHandler;
    //   366: astore 12
    //   368: aload 12
    //   370: astore 27
    //   372: aload 12
    //   374: invokevirtual 148	com/vvt/e/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   377: astore 27
    //   379: aload 27
    //   381: invokestatic 154	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   384: astore 27
    //   386: aload 26
    //   388: aload 27
    //   390: invokevirtual 158	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   393: aload_0
    //   394: astore 12
    //   396: aload_0
    //   397: getfield 40	com/vvt/capture/browserurl/a/f:d	Ljava/text/SimpleDateFormat;
    //   400: astore 26
    //   402: new 160	java/sql/Date
    //   405: astore 27
    //   407: aload 27
    //   409: astore 12
    //   411: aload 27
    //   413: lload 20
    //   415: invokespecial 163	java/sql/Date:<init>	(J)V
    //   418: aload 26
    //   420: aload 27
    //   422: invokevirtual 166	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   425: astore 26
    //   427: new 168	com/vvt/capture/browserurl/BrowserUrlData
    //   430: astore 27
    //   432: aload 27
    //   434: invokespecial 169	com/vvt/capture/browserurl/BrowserUrlData:<init>	()V
    //   437: aload 27
    //   439: astore 12
    //   441: aload 27
    //   443: lload 22
    //   445: invokevirtual 171	com/vvt/capture/browserurl/BrowserUrlData:a	(J)V
    //   448: getstatic 177	com/vvt/capture/browserurl/BrowserUrlData$UrlType:HISTORY	Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;
    //   451: astore 18
    //   453: aload 27
    //   455: aload 18
    //   457: invokevirtual 180	com/vvt/capture/browserurl/BrowserUrlData:a	(Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;)V
    //   460: aload 27
    //   462: aload 25
    //   464: invokevirtual 182	com/vvt/capture/browserurl/BrowserUrlData:a	(Ljava/lang/String;)V
    //   467: aload 27
    //   469: aload 16
    //   471: invokevirtual 184	com/vvt/capture/browserurl/BrowserUrlData:removeFromPath	(Ljava/lang/String;)V
    //   474: aload 27
    //   476: lload 20
    //   478: invokevirtual 186	com/vvt/capture/browserurl/BrowserUrlData:removeFromPath	(J)V
    //   481: aload 27
    //   483: aload 26
    //   485: invokevirtual 188	com/vvt/capture/browserurl/BrowserUrlData:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   488: aload 27
    //   490: lload 20
    //   492: invokevirtual 190	com/vvt/capture/browserurl/BrowserUrlData:MyUncaughtExceptionHandler	(J)V
    //   495: aload_3
    //   496: aload 27
    //   498: invokevirtual 194	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   501: pop
    //   502: goto -315 -> 187
    //   505: astore 8
    //   507: getstatic 25	com/vvt/capture/browserurl/a/f:MyUncaughtExceptionHandler	Z
    //   510: istore 19
    //   512: iload 19
    //   514: ifeq +3 -> 517
    //   517: aload 5
    //   519: ifnull +10 -> 529
    //   522: aload 5
    //   524: invokeinterface 197 1 0
    //   529: aload 4
    //   531: ifnull +8 -> 539
    //   534: aload 4
    //   536: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   539: aload_3
    //   540: areturn
    //   541: invokestatic 200	com/vvt/capture/browserurl/a/removeFromPath:MyUncaughtExceptionHandler	()Z
    //   544: istore 11
    //   546: iload 11
    //   548: ifeq +27 -> 575
    //   551: invokestatic 203	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   554: astore 4
    //   556: aload 6
    //   558: astore 13
    //   560: aload 8
    //   562: astore 6
    //   564: ldc -51
    //   566: astore 8
    //   568: aload 7
    //   570: astore 14
    //   572: goto -479 -> 93
    //   575: invokestatic 203	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   578: astore 4
    //   580: aload 6
    //   582: astore 13
    //   584: aload 8
    //   586: astore 6
    //   588: ldc -49
    //   590: astore 8
    //   592: aload 7
    //   594: astore 14
    //   596: goto -503 -> 93
    //   599: aload 13
    //   601: invokestatic 208	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;)V
    //   604: aload 5
    //   606: ifnull +10 -> 616
    //   609: aload 5
    //   611: invokeinterface 197 1 0
    //   616: aload 4
    //   618: ifnull -79 -> 539
    //   621: goto -87 -> 534
    //   624: astore 28
    //   626: iconst_0
    //   627: istore 19
    //   629: aconst_null
    //   630: astore 8
    //   632: aconst_null
    //   633: astore 4
    //   635: aload 28
    //   637: astore 5
    //   639: aload 4
    //   641: ifnull +10 -> 651
    //   644: aload 4
    //   646: invokeinterface 197 1 0
    //   651: aload 8
    //   653: ifnull +8 -> 661
    //   656: aload 8
    //   658: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   661: aload 5
    //   663: athrow
    //   664: astore 28
    //   666: aload 4
    //   668: astore 8
    //   670: aconst_null
    //   671: astore 4
    //   673: aload 28
    //   675: astore 5
    //   677: goto -38 -> 639
    //   680: astore 28
    //   682: aload 4
    //   684: astore 8
    //   686: aload 5
    //   688: astore 4
    //   690: aload 28
    //   692: astore 5
    //   694: goto -55 -> 639
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	697	0	this	f
    //   0	697	1	paramLong	long
    //   3	537	3	localArrayList	ArrayList
    //   9	680	4	localObject1	Object
    //   12	681	5	localObject2	Object
    //   16	571	6	localObject3	Object
    //   20	573	7	str1	String
    //   24	230	8	str2	String
    //   505	56	8	localException	Exception
    //   566	119	8	localObject4	Object
    //   28	176	9	str3	String
    //   32	302	10	str4	String
    //   37	510	11	bool1	boolean
    //   49	391	12	localObject5	Object
    //   79	521	13	localObject6	Object
    //   91	504	14	str5	String
    //   103	3	15	i	int
    //   110	360	16	localObject7	Object
    //   113	187	17	bool2	boolean
    //   318	5	17	j	int
    //   116	340	18	localObject8	Object
    //   125	31	19	k	int
    //   194	3	19	bool3	boolean
    //   210	33	19	m	int
    //   258	3	19	bool4	boolean
    //   274	5	19	n	int
    //   510	118	19	bool5	boolean
    //   285	206	20	l1	long
    //   290	154	22	l2	long
    //   340	5	24	i1	int
    //   351	112	25	str6	String
    //   360	124	26	localObject9	Object
    //   370	127	27	localObject10	Object
    //   624	12	28	localObject11	Object
    //   664	10	28	localObject12	Object
    //   680	11	28	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   34	37	505	java/lang/Exception
    //   51	55	505	java/lang/Exception
    //   59	64	505	java/lang/Exception
    //   66	71	505	java/lang/Exception
    //   105	110	505	java/lang/Exception
    //   121	124	505	java/lang/Exception
    //   131	134	505	java/lang/Exception
    //   137	141	505	java/lang/Exception
    //   147	150	505	java/lang/Exception
    //   157	160	505	java/lang/Exception
    //   162	167	505	java/lang/Exception
    //   176	180	505	java/lang/Exception
    //   187	194	505	java/lang/Exception
    //   203	210	505	java/lang/Exception
    //   214	221	505	java/lang/Exception
    //   228	233	505	java/lang/Exception
    //   235	240	505	java/lang/Exception
    //   253	258	505	java/lang/Exception
    //   267	274	505	java/lang/Exception
    //   278	285	505	java/lang/Exception
    //   304	307	505	java/lang/Exception
    //   311	318	505	java/lang/Exception
    //   322	329	505	java/lang/Exception
    //   333	340	505	java/lang/Exception
    //   344	351	505	java/lang/Exception
    //   356	360	505	java/lang/Exception
    //   362	366	505	java/lang/Exception
    //   372	377	505	java/lang/Exception
    //   379	384	505	java/lang/Exception
    //   388	393	505	java/lang/Exception
    //   396	400	505	java/lang/Exception
    //   402	405	505	java/lang/Exception
    //   413	418	505	java/lang/Exception
    //   420	425	505	java/lang/Exception
    //   427	430	505	java/lang/Exception
    //   432	437	505	java/lang/Exception
    //   443	448	505	java/lang/Exception
    //   448	451	505	java/lang/Exception
    //   455	460	505	java/lang/Exception
    //   462	467	505	java/lang/Exception
    //   469	474	505	java/lang/Exception
    //   476	481	505	java/lang/Exception
    //   483	488	505	java/lang/Exception
    //   490	495	505	java/lang/Exception
    //   496	502	505	java/lang/Exception
    //   541	544	505	java/lang/Exception
    //   551	554	505	java/lang/Exception
    //   575	578	505	java/lang/Exception
    //   599	604	505	java/lang/Exception
    //   34	37	624	finally
    //   51	55	624	finally
    //   59	64	624	finally
    //   66	71	624	finally
    //   541	544	624	finally
    //   551	554	624	finally
    //   575	578	624	finally
    //   105	110	664	finally
    //   121	124	664	finally
    //   131	134	664	finally
    //   137	141	664	finally
    //   147	150	664	finally
    //   157	160	664	finally
    //   162	167	664	finally
    //   176	180	664	finally
    //   187	194	680	finally
    //   203	210	680	finally
    //   214	221	680	finally
    //   228	233	680	finally
    //   235	240	680	finally
    //   253	258	680	finally
    //   267	274	680	finally
    //   278	285	680	finally
    //   304	307	680	finally
    //   311	318	680	finally
    //   322	329	680	finally
    //   333	340	680	finally
    //   344	351	680	finally
    //   356	360	680	finally
    //   362	366	680	finally
    //   372	377	680	finally
    //   379	384	680	finally
    //   388	393	680	finally
    //   396	400	680	finally
    //   402	405	680	finally
    //   413	418	680	finally
    //   420	425	680	finally
    //   427	430	680	finally
    //   432	437	680	finally
    //   443	448	680	finally
    //   448	451	680	finally
    //   455	460	680	finally
    //   462	467	680	finally
    //   469	474	680	finally
    //   476	481	680	finally
    //   483	488	680	finally
    //   490	495	680	finally
    //   496	502	680	finally
    //   507	510	680	finally
    //   599	604	680	finally
  }
  
  /* Error */
  private long b(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: iconst_m1
    //   11: i2l
    //   12: lstore 4
    //   14: ldc 52
    //   16: astore 6
    //   18: ldc 52
    //   20: astore 7
    //   22: ldc 56
    //   24: astore 8
    //   26: invokestatic 65	com/vvt/capture/browserurl/a/removeFromPath:d	()Z
    //   29: istore_3
    //   30: iload_3
    //   31: ifeq +206 -> 237
    //   34: ldc 67
    //   36: astore 6
    //   38: aload_0
    //   39: getfield 31	com/vvt/capture/browserurl/a/f:e	Ljava/lang/String;
    //   42: astore 8
    //   44: aload 6
    //   46: aload 8
    //   48: invokestatic 72	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   51: astore 7
    //   53: aload 7
    //   55: invokestatic 75	com/vvt/capture/browserurl/a/removeFromPath:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   58: astore 6
    //   60: ldc 81
    //   62: astore 9
    //   64: ldc 77
    //   66: astore 8
    //   68: aload 7
    //   70: astore 10
    //   72: aload 6
    //   74: astore 7
    //   76: aload 9
    //   78: astore 6
    //   80: aload 7
    //   82: ifnull +372 -> 454
    //   85: ldc -44
    //   87: astore 11
    //   89: iconst_3
    //   90: istore 12
    //   92: iload 12
    //   94: anewarray 4	java/lang/Object
    //   97: astore 13
    //   99: aconst_null
    //   100: astore 14
    //   102: aload 13
    //   104: iconst_0
    //   105: aload 8
    //   107: aastore
    //   108: iconst_1
    //   109: istore 15
    //   111: aload 13
    //   113: iload 15
    //   115: aload 6
    //   117: aastore
    //   118: iconst_2
    //   119: istore 15
    //   121: iload_1
    //   122: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   125: astore 14
    //   127: aload 13
    //   129: iload 15
    //   131: aload 14
    //   133: aastore
    //   134: aload 11
    //   136: aload 13
    //   138: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   141: astore 8
    //   143: aconst_null
    //   144: astore 11
    //   146: aload 7
    //   148: aload 8
    //   150: aconst_null
    //   151: invokevirtual 105	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   154: astore_2
    //   155: aload_2
    //   156: ifnull +288 -> 444
    //   159: aload_2
    //   160: invokeinterface 220 1 0
    //   165: istore 15
    //   167: iload 15
    //   169: ifeq +275 -> 444
    //   172: aload_2
    //   173: aload 6
    //   175: invokeinterface 114 2 0
    //   180: istore_3
    //   181: aload_2
    //   182: iload_3
    //   183: invokeinterface 136 2 0
    //   188: lstore 4
    //   190: aload_2
    //   191: astore 8
    //   193: lload 4
    //   195: lstore 16
    //   197: aload 10
    //   199: invokestatic 208	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;)V
    //   202: aload 8
    //   204: ifnull +10 -> 214
    //   207: aload 8
    //   209: invokeinterface 197 1 0
    //   214: aload 7
    //   216: ifnull +8 -> 224
    //   219: aload 7
    //   221: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   224: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   227: istore 15
    //   229: iload 15
    //   231: ifeq +3 -> 234
    //   234: lload 16
    //   236: lreturn
    //   237: invokestatic 200	com/vvt/capture/browserurl/a/removeFromPath:MyUncaughtExceptionHandler	()Z
    //   240: istore_3
    //   241: iload_3
    //   242: ifeq +31 -> 273
    //   245: invokestatic 203	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   248: astore 6
    //   250: aload 8
    //   252: astore 9
    //   254: ldc -51
    //   256: astore 8
    //   258: aload 7
    //   260: astore 10
    //   262: aload 6
    //   264: astore 7
    //   266: aload 9
    //   268: astore 6
    //   270: goto -190 -> 80
    //   273: invokestatic 203	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   276: astore 6
    //   278: aload 8
    //   280: astore 9
    //   282: ldc -49
    //   284: astore 8
    //   286: aload 7
    //   288: astore 10
    //   290: aload 6
    //   292: astore 7
    //   294: aload 9
    //   296: astore 6
    //   298: goto -218 -> 80
    //   301: astore 6
    //   303: iconst_0
    //   304: istore 15
    //   306: aconst_null
    //   307: astore 8
    //   309: aconst_null
    //   310: astore 7
    //   312: lload 4
    //   314: lstore 16
    //   316: getstatic 25	com/vvt/capture/browserurl/a/f:MyUncaughtExceptionHandler	Z
    //   319: istore 18
    //   321: iload 18
    //   323: ifeq +3 -> 326
    //   326: aload 8
    //   328: ifnull +10 -> 338
    //   331: aload 8
    //   333: invokeinterface 197 1 0
    //   338: aload 7
    //   340: ifnull -116 -> 224
    //   343: goto -124 -> 219
    //   346: astore 6
    //   348: iconst_0
    //   349: istore 15
    //   351: aconst_null
    //   352: astore 8
    //   354: aconst_null
    //   355: astore 7
    //   357: aload 6
    //   359: astore_2
    //   360: aload 8
    //   362: ifnull +10 -> 372
    //   365: aload 8
    //   367: invokeinterface 197 1 0
    //   372: aload 7
    //   374: ifnull +8 -> 382
    //   377: aload 7
    //   379: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   382: aload_2
    //   383: athrow
    //   384: astore 6
    //   386: iconst_0
    //   387: istore 15
    //   389: aconst_null
    //   390: astore 8
    //   392: aload 6
    //   394: astore_2
    //   395: goto -35 -> 360
    //   398: astore 6
    //   400: aload_2
    //   401: astore 8
    //   403: aload 6
    //   405: astore_2
    //   406: goto -46 -> 360
    //   409: astore_2
    //   410: goto -50 -> 360
    //   413: astore 6
    //   415: iconst_0
    //   416: istore 15
    //   418: aconst_null
    //   419: astore 8
    //   421: lload 4
    //   423: lstore 16
    //   425: goto -109 -> 316
    //   428: astore 6
    //   430: aload_2
    //   431: astore 8
    //   433: lload 4
    //   435: lstore 16
    //   437: goto -121 -> 316
    //   440: pop
    //   441: goto -125 -> 316
    //   444: aload_2
    //   445: astore 8
    //   447: lload 4
    //   449: lstore 16
    //   451: goto -254 -> 197
    //   454: iconst_0
    //   455: istore 15
    //   457: aconst_null
    //   458: astore 8
    //   460: lload 4
    //   462: lstore 16
    //   464: goto -267 -> 197
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	467	0	this	f
    //   0	467	1	paramInt	int
    //   1	405	2	localObject1	Object
    //   409	36	2	localObject2	Object
    //   5	26	3	bool1	boolean
    //   180	3	3	i	int
    //   240	2	3	bool2	boolean
    //   12	449	4	l1	long
    //   16	281	6	localObject3	Object
    //   301	1	6	localException1	Exception
    //   346	12	6	localObject4	Object
    //   384	9	6	localObject5	Object
    //   398	6	6	localObject6	Object
    //   413	1	6	localException2	Exception
    //   428	1	6	localException3	Exception
    //   20	358	7	localObject7	Object
    //   24	435	8	localObject8	Object
    //   62	233	9	localObject9	Object
    //   70	219	10	localObject10	Object
    //   87	58	11	str	String
    //   90	3	12	j	int
    //   97	40	13	arrayOfObject	Object[]
    //   100	32	14	localInteger	Integer
    //   109	21	15	k	int
    //   165	291	15	bool3	boolean
    //   195	268	16	l2	long
    //   319	3	18	bool4	boolean
    //   440	1	27	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   26	29	301	java/lang/Exception
    //   38	42	301	java/lang/Exception
    //   46	51	301	java/lang/Exception
    //   53	58	301	java/lang/Exception
    //   237	240	301	java/lang/Exception
    //   245	248	301	java/lang/Exception
    //   273	276	301	java/lang/Exception
    //   26	29	346	finally
    //   38	42	346	finally
    //   46	51	346	finally
    //   53	58	346	finally
    //   237	240	346	finally
    //   245	248	346	finally
    //   273	276	346	finally
    //   92	97	384	finally
    //   105	108	384	finally
    //   115	118	384	finally
    //   121	125	384	finally
    //   131	134	384	finally
    //   136	141	384	finally
    //   150	154	384	finally
    //   159	165	398	finally
    //   173	180	398	finally
    //   182	188	398	finally
    //   197	202	409	finally
    //   316	319	409	finally
    //   92	97	413	java/lang/Exception
    //   105	108	413	java/lang/Exception
    //   115	118	413	java/lang/Exception
    //   121	125	413	java/lang/Exception
    //   131	134	413	java/lang/Exception
    //   136	141	413	java/lang/Exception
    //   150	154	413	java/lang/Exception
    //   159	165	428	java/lang/Exception
    //   173	180	428	java/lang/Exception
    //   182	188	428	java/lang/Exception
    //   197	202	440	java/lang/Exception
  }
  
  /* Error */
  private long c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: iconst_m1
    //   11: i2l
    //   12: lstore_3
    //   13: ldc 52
    //   15: astore 5
    //   17: ldc 52
    //   19: astore 6
    //   21: ldc 56
    //   23: astore 7
    //   25: invokestatic 65	com/vvt/capture/browserurl/a/removeFromPath:d	()Z
    //   28: istore_2
    //   29: iload_2
    //   30: ifeq +185 -> 215
    //   33: ldc 67
    //   35: astore 5
    //   37: aload_0
    //   38: getfield 31	com/vvt/capture/browserurl/a/f:e	Ljava/lang/String;
    //   41: astore 7
    //   43: aload 5
    //   45: aload 7
    //   47: invokestatic 72	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   50: astore 6
    //   52: aload 6
    //   54: invokestatic 75	com/vvt/capture/browserurl/a/removeFromPath:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   57: astore 5
    //   59: ldc 81
    //   61: astore 8
    //   63: ldc 77
    //   65: astore 7
    //   67: aload 6
    //   69: astore 9
    //   71: aload 5
    //   73: astore 6
    //   75: aload 8
    //   77: astore 5
    //   79: aload 6
    //   81: ifnull +347 -> 428
    //   84: ldc -34
    //   86: astore 10
    //   88: iconst_2
    //   89: istore 11
    //   91: iload 11
    //   93: anewarray 4	java/lang/Object
    //   96: astore 12
    //   98: aload 12
    //   100: iconst_0
    //   101: aload 7
    //   103: aastore
    //   104: iconst_1
    //   105: istore 13
    //   107: aload 12
    //   109: iload 13
    //   111: aload 5
    //   113: aastore
    //   114: aload 10
    //   116: aload 12
    //   118: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   121: astore 7
    //   123: aconst_null
    //   124: astore 10
    //   126: aload 6
    //   128: aload 7
    //   130: aconst_null
    //   131: invokevirtual 105	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   134: astore_1
    //   135: aload_1
    //   136: ifnull +283 -> 419
    //   139: aload_1
    //   140: invokeinterface 110 1 0
    //   145: istore 13
    //   147: iload 13
    //   149: ifeq +270 -> 419
    //   152: aload_1
    //   153: aload 5
    //   155: invokeinterface 114 2 0
    //   160: istore_2
    //   161: aload_1
    //   162: iload_2
    //   163: invokeinterface 136 2 0
    //   168: lstore_3
    //   169: aload_1
    //   170: astore 7
    //   172: lload_3
    //   173: lstore 14
    //   175: aload 9
    //   177: invokestatic 208	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;)V
    //   180: aload 7
    //   182: ifnull +10 -> 192
    //   185: aload 7
    //   187: invokeinterface 197 1 0
    //   192: aload 6
    //   194: ifnull +8 -> 202
    //   197: aload 6
    //   199: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   202: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   205: istore 13
    //   207: iload 13
    //   209: ifeq +3 -> 212
    //   212: lload 14
    //   214: lreturn
    //   215: invokestatic 200	com/vvt/capture/browserurl/a/removeFromPath:MyUncaughtExceptionHandler	()Z
    //   218: istore_2
    //   219: iload_2
    //   220: ifeq +31 -> 251
    //   223: invokestatic 203	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   226: astore 5
    //   228: aload 7
    //   230: astore 8
    //   232: ldc -51
    //   234: astore 7
    //   236: aload 6
    //   238: astore 9
    //   240: aload 5
    //   242: astore 6
    //   244: aload 8
    //   246: astore 5
    //   248: goto -169 -> 79
    //   251: invokestatic 203	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   254: astore 5
    //   256: aload 7
    //   258: astore 8
    //   260: ldc -49
    //   262: astore 7
    //   264: aload 6
    //   266: astore 9
    //   268: aload 5
    //   270: astore 6
    //   272: aload 8
    //   274: astore 5
    //   276: goto -197 -> 79
    //   279: astore 5
    //   281: iconst_0
    //   282: istore 13
    //   284: aconst_null
    //   285: astore 7
    //   287: aconst_null
    //   288: astore 6
    //   290: lload_3
    //   291: lstore 14
    //   293: getstatic 25	com/vvt/capture/browserurl/a/f:MyUncaughtExceptionHandler	Z
    //   296: istore 16
    //   298: iload 16
    //   300: ifeq +3 -> 303
    //   303: aload 7
    //   305: ifnull +10 -> 315
    //   308: aload 7
    //   310: invokeinterface 197 1 0
    //   315: aload 6
    //   317: ifnull -115 -> 202
    //   320: goto -123 -> 197
    //   323: astore 5
    //   325: iconst_0
    //   326: istore 13
    //   328: aconst_null
    //   329: astore 7
    //   331: aconst_null
    //   332: astore 6
    //   334: aload 5
    //   336: astore_1
    //   337: aload 7
    //   339: ifnull +10 -> 349
    //   342: aload 7
    //   344: invokeinterface 197 1 0
    //   349: aload 6
    //   351: ifnull +8 -> 359
    //   354: aload 6
    //   356: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   359: aload_1
    //   360: athrow
    //   361: astore 5
    //   363: iconst_0
    //   364: istore 13
    //   366: aconst_null
    //   367: astore 7
    //   369: aload 5
    //   371: astore_1
    //   372: goto -35 -> 337
    //   375: astore 5
    //   377: aload_1
    //   378: astore 7
    //   380: aload 5
    //   382: astore_1
    //   383: goto -46 -> 337
    //   386: astore_1
    //   387: goto -50 -> 337
    //   390: astore 5
    //   392: iconst_0
    //   393: istore 13
    //   395: aconst_null
    //   396: astore 7
    //   398: lload_3
    //   399: lstore 14
    //   401: goto -108 -> 293
    //   404: astore 5
    //   406: aload_1
    //   407: astore 7
    //   409: lload_3
    //   410: lstore 14
    //   412: goto -119 -> 293
    //   415: pop
    //   416: goto -123 -> 293
    //   419: aload_1
    //   420: astore 7
    //   422: lload_3
    //   423: lstore 14
    //   425: goto -250 -> 175
    //   428: iconst_0
    //   429: istore 13
    //   431: aconst_null
    //   432: astore 7
    //   434: lload_3
    //   435: lstore 14
    //   437: goto -262 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	440	0	this	f
    //   1	382	1	localObject1	Object
    //   386	34	1	localObject2	Object
    //   5	25	2	bool1	boolean
    //   160	3	2	i	int
    //   218	2	2	bool2	boolean
    //   12	423	3	l1	long
    //   15	260	5	localObject3	Object
    //   279	1	5	localException1	Exception
    //   323	12	5	localObject4	Object
    //   361	9	5	localObject5	Object
    //   375	6	5	localObject6	Object
    //   390	1	5	localException2	Exception
    //   404	1	5	localException3	Exception
    //   19	336	6	localObject7	Object
    //   23	410	7	localObject8	Object
    //   61	212	8	localObject9	Object
    //   69	198	9	localObject10	Object
    //   86	39	10	str	String
    //   89	3	11	j	int
    //   96	21	12	arrayOfObject	Object[]
    //   105	325	13	bool3	boolean
    //   173	263	14	l2	long
    //   296	3	16	bool4	boolean
    //   415	1	24	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   25	28	279	java/lang/Exception
    //   37	41	279	java/lang/Exception
    //   45	50	279	java/lang/Exception
    //   52	57	279	java/lang/Exception
    //   215	218	279	java/lang/Exception
    //   223	226	279	java/lang/Exception
    //   251	254	279	java/lang/Exception
    //   25	28	323	finally
    //   37	41	323	finally
    //   45	50	323	finally
    //   52	57	323	finally
    //   215	218	323	finally
    //   223	226	323	finally
    //   251	254	323	finally
    //   91	96	361	finally
    //   101	104	361	finally
    //   111	114	361	finally
    //   116	121	361	finally
    //   130	134	361	finally
    //   139	145	375	finally
    //   153	160	375	finally
    //   162	168	375	finally
    //   175	180	386	finally
    //   293	296	386	finally
    //   91	96	390	java/lang/Exception
    //   101	104	390	java/lang/Exception
    //   111	114	390	java/lang/Exception
    //   116	121	390	java/lang/Exception
    //   130	134	390	java/lang/Exception
    //   139	145	404	java/lang/Exception
    //   153	160	404	java/lang/Exception
    //   162	168	404	java/lang/Exception
    //   175	180	415	java/lang/Exception
  }
  
  public g a()
  {
    boolean bool1 = b;
    if (bool1) {}
    long l = c();
    boolean bool2 = b;
    if (bool2) {}
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    Long localLong = Long.valueOf(l);
    localFxSimpleEventReference.setReference(localLong);
    bool1 = b;
    if (bool1) {}
    return localFxSimpleEventReference;
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    long l1 = b(paramInt);
    long l2 = 1L;
    l1 -= l2;
    boolean bool2 = b;
    if (bool2) {}
    ArrayList localArrayList2 = a(l1);
    if (localArrayList2 != null)
    {
      int i = localArrayList2.size();
      if (i > 0)
      {
        boolean bool3 = b;
        if (bool3) {}
        localArrayList1.addAll(localArrayList2);
      }
    }
    boolean bool4 = b;
    if (bool4) {}
    return localArrayList1;
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = paramg1 instanceof FxSimpleEventReference;
    if (bool2)
    {
      bool2 = paramg2 instanceof FxSimpleEventReference;
      if (bool2)
      {
        paramg1 = (FxSimpleEventReference)paramg1;
        Object localObject = paramg1.getReference();
        long l = ((Long)localObject).longValue();
        boolean bool3 = b;
        if (bool3) {}
        localObject = a(l);
        if (localObject != null)
        {
          int i = ((ArrayList)localObject).size();
          if (i > 0)
          {
            boolean bool4 = b;
            if (bool4) {}
            localArrayList.addAll((Collection)localObject);
          }
        }
      }
    }
    bool2 = b;
    if (bool2) {}
    return localArrayList;
  }
  
  /* Error */
  public boolean a(com.vvt.capture.browserurl.BrowserUrlData.UrlType paramUrlType, String paramString, int paramInt)
  {
    // Byte code:
    //   0: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   3: istore 4
    //   5: iload 4
    //   7: ifeq +3 -> 10
    //   10: iconst_0
    //   11: istore 5
    //   13: aconst_null
    //   14: astore 6
    //   16: iconst_0
    //   17: istore 7
    //   19: aconst_null
    //   20: astore 8
    //   22: iconst_0
    //   23: istore 4
    //   25: aconst_null
    //   26: astore 9
    //   28: aconst_null
    //   29: astore 10
    //   31: aconst_null
    //   32: astore 11
    //   34: ldc 54
    //   36: astore 12
    //   38: ldc 58
    //   40: astore 13
    //   42: invokestatic 65	com/vvt/capture/browserurl/a/removeFromPath:d	()Z
    //   45: istore 14
    //   47: iload 14
    //   49: ifeq +446 -> 495
    //   52: ldc_w 256
    //   55: astore 15
    //   57: aload 15
    //   59: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   62: astore 15
    //   64: getstatic 262	com/vvt/capture/browserurl/BrowserUrlData$UrlType:BOOKMARKS	Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;
    //   67: astore 16
    //   69: aload_1
    //   70: aload 16
    //   72: if_acmpne +378 -> 450
    //   75: ldc_w 264
    //   78: astore 10
    //   80: aload_0
    //   81: getfield 31	com/vvt/capture/browserurl/a/f:e	Ljava/lang/String;
    //   84: astore 16
    //   86: aload 10
    //   88: aload 16
    //   90: invokestatic 72	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   93: astore 11
    //   95: aload 11
    //   97: invokestatic 266	com/vvt/capture/browserurl/a/removeFromPath:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   100: astore 8
    //   102: ldc -49
    //   104: astore 16
    //   106: aload 16
    //   108: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   111: astore 16
    //   113: aload 12
    //   115: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   118: astore 12
    //   120: aload 13
    //   122: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   125: astore 13
    //   127: ldc_w 268
    //   130: astore 17
    //   132: iconst_3
    //   133: istore 18
    //   135: iload 18
    //   137: anewarray 4	java/lang/Object
    //   140: astore 19
    //   142: iconst_0
    //   143: istore 20
    //   145: aconst_null
    //   146: astore 21
    //   148: aload 19
    //   150: iconst_0
    //   151: aload 16
    //   153: aastore
    //   154: iconst_1
    //   155: istore 20
    //   157: aload 19
    //   159: iload 20
    //   161: aload 15
    //   163: aastore
    //   164: iconst_2
    //   165: istore 14
    //   167: iload_3
    //   168: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   171: astore 21
    //   173: aload 19
    //   175: iload 14
    //   177: aload 21
    //   179: aastore
    //   180: aload 17
    //   182: aload 19
    //   184: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   187: astore 15
    //   189: aload 13
    //   191: astore 22
    //   193: aload 8
    //   195: astore 13
    //   197: aload 15
    //   199: astore 8
    //   201: aload 12
    //   203: astore 15
    //   205: aload 22
    //   207: astore 12
    //   209: aload 13
    //   211: ifnull +870 -> 1081
    //   214: iconst_0
    //   215: istore 5
    //   217: aconst_null
    //   218: astore 6
    //   220: aload 13
    //   222: aload 8
    //   224: aconst_null
    //   225: invokevirtual 105	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   228: astore 8
    //   230: new 49	java/util/ArrayList
    //   233: astore 9
    //   235: aload 9
    //   237: invokespecial 50	java/util/ArrayList:<init>	()V
    //   240: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   243: istore 5
    //   245: iload 5
    //   247: ifeq +3 -> 250
    //   250: aload 8
    //   252: invokeinterface 110 1 0
    //   257: istore 5
    //   259: iload 5
    //   261: ifeq +499 -> 760
    //   264: aload 8
    //   266: aload 12
    //   268: invokeinterface 114 2 0
    //   273: istore 5
    //   275: aload 8
    //   277: iload 5
    //   279: invokeinterface 118 2 0
    //   284: astore 6
    //   286: aload 6
    //   288: ifnull -38 -> 250
    //   291: aload 6
    //   293: invokevirtual 122	java/lang/String:trim	()Ljava/lang/String;
    //   296: astore 17
    //   298: aload 17
    //   300: invokevirtual 126	java/lang/String:length	()I
    //   303: istore 23
    //   305: iload 23
    //   307: ifeq -57 -> 250
    //   310: ldc -128
    //   312: astore 17
    //   314: aload 6
    //   316: aload 17
    //   318: invokevirtual 132	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   321: istore 23
    //   323: iload 23
    //   325: ifne -75 -> 250
    //   328: aload 8
    //   330: aload 15
    //   332: invokeinterface 114 2 0
    //   337: istore 23
    //   339: aload 8
    //   341: iload 23
    //   343: invokeinterface 136 2 0
    //   348: lstore 24
    //   350: aload 6
    //   352: invokevirtual 271	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   355: astore 6
    //   357: aload_2
    //   358: invokevirtual 271	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   361: astore 21
    //   363: aload 6
    //   365: aload 21
    //   367: invokevirtual 275	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   370: istore 5
    //   372: iload 5
    //   374: ifeq -124 -> 250
    //   377: lload 24
    //   379: invokestatic 92	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   382: astore 6
    //   384: aload 9
    //   386: aload 6
    //   388: invokeinterface 276 2 0
    //   393: pop
    //   394: goto -144 -> 250
    //   397: astore 9
    //   399: iconst_0
    //   400: istore 4
    //   402: aconst_null
    //   403: astore 9
    //   405: getstatic 25	com/vvt/capture/browserurl/a/f:MyUncaughtExceptionHandler	Z
    //   408: istore 5
    //   410: iload 5
    //   412: ifeq +3 -> 415
    //   415: aload 8
    //   417: ifnull +10 -> 427
    //   420: aload 8
    //   422: invokeinterface 197 1 0
    //   427: aload 13
    //   429: ifnull +8 -> 437
    //   432: aload 13
    //   434: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   437: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   440: istore 7
    //   442: iload 7
    //   444: ifeq +3 -> 447
    //   447: iload 4
    //   449: ireturn
    //   450: ldc 67
    //   452: astore 10
    //   454: aload_0
    //   455: getfield 31	com/vvt/capture/browserurl/a/f:e	Ljava/lang/String;
    //   458: astore 12
    //   460: aload 10
    //   462: aload 12
    //   464: invokestatic 72	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   467: astore 11
    //   469: aload 11
    //   471: invokestatic 266	com/vvt/capture/browserurl/a/removeFromPath:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   474: astore 8
    //   476: ldc 77
    //   478: astore 16
    //   480: ldc 81
    //   482: astore 22
    //   484: ldc 79
    //   486: astore 12
    //   488: aload 22
    //   490: astore 15
    //   492: goto -365 -> 127
    //   495: invokestatic 200	com/vvt/capture/browserurl/a/removeFromPath:MyUncaughtExceptionHandler	()Z
    //   498: istore 14
    //   500: iload 14
    //   502: ifeq +115 -> 617
    //   505: invokestatic 278	com/vvt/capture/browserurl/a/removeFromPath:removeFromPath	()Landroid/database/sqlite/SQLiteDatabase;
    //   508: astore 8
    //   510: getstatic 262	com/vvt/capture/browserurl/BrowserUrlData$UrlType:BOOKMARKS	Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;
    //   513: astore 15
    //   515: aload_1
    //   516: aload 15
    //   518: if_acmpne +92 -> 610
    //   521: ldc -49
    //   523: astore 16
    //   525: ldc_w 268
    //   528: astore 15
    //   530: iconst_3
    //   531: istore 23
    //   533: iload 23
    //   535: anewarray 4	java/lang/Object
    //   538: astore 17
    //   540: iconst_0
    //   541: istore 18
    //   543: aconst_null
    //   544: astore 19
    //   546: aload 17
    //   548: iconst_0
    //   549: aload 16
    //   551: aastore
    //   552: iconst_1
    //   553: istore 18
    //   555: aload 17
    //   557: iload 18
    //   559: aload 12
    //   561: aastore
    //   562: iconst_2
    //   563: istore 18
    //   565: iload_3
    //   566: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   569: astore 21
    //   571: aload 17
    //   573: iload 18
    //   575: aload 21
    //   577: aastore
    //   578: aload 15
    //   580: aload 17
    //   582: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   585: astore 15
    //   587: aload 13
    //   589: astore 22
    //   591: aload 8
    //   593: astore 13
    //   595: aload 15
    //   597: astore 8
    //   599: aload 12
    //   601: astore 15
    //   603: aload 22
    //   605: astore 12
    //   607: goto -398 -> 209
    //   610: ldc -51
    //   612: astore 16
    //   614: goto -89 -> 525
    //   617: invokestatic 278	com/vvt/capture/browserurl/a/removeFromPath:removeFromPath	()Landroid/database/sqlite/SQLiteDatabase;
    //   620: astore 8
    //   622: ldc -49
    //   624: astore 16
    //   626: getstatic 262	com/vvt/capture/browserurl/BrowserUrlData$UrlType:BOOKMARKS	Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;
    //   629: astore 15
    //   631: aload_1
    //   632: aload 15
    //   634: if_acmpne +120 -> 754
    //   637: lconst_1
    //   638: lstore 24
    //   640: ldc_w 280
    //   643: astore 15
    //   645: iconst_5
    //   646: istore 20
    //   648: iload 20
    //   650: anewarray 4	java/lang/Object
    //   653: astore 21
    //   655: iconst_0
    //   656: istore 26
    //   658: aload 21
    //   660: iconst_0
    //   661: aload 16
    //   663: aastore
    //   664: iconst_1
    //   665: istore 26
    //   667: ldc_w 283
    //   670: astore 27
    //   672: aload 21
    //   674: iload 26
    //   676: aload 27
    //   678: aastore
    //   679: iconst_2
    //   680: istore 26
    //   682: lload 24
    //   684: invokestatic 92	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   687: astore 17
    //   689: aload 21
    //   691: iload 26
    //   693: aload 17
    //   695: aastore
    //   696: iconst_3
    //   697: istore 23
    //   699: aload 21
    //   701: iload 23
    //   703: aload 12
    //   705: aastore
    //   706: iconst_4
    //   707: istore 23
    //   709: iload_3
    //   710: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   713: astore 19
    //   715: aload 21
    //   717: iload 23
    //   719: aload 19
    //   721: aastore
    //   722: aload 15
    //   724: aload 21
    //   726: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   729: astore 15
    //   731: aload 13
    //   733: astore 22
    //   735: aload 8
    //   737: astore 13
    //   739: aload 15
    //   741: astore 8
    //   743: aload 12
    //   745: astore 15
    //   747: aload 22
    //   749: astore 12
    //   751: goto -542 -> 209
    //   754: lconst_0
    //   755: lstore 24
    //   757: goto -117 -> 640
    //   760: aload 8
    //   762: ifnull +10 -> 772
    //   765: aload 8
    //   767: invokeinterface 197 1 0
    //   772: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   775: istore 5
    //   777: iload 5
    //   779: ifeq +3 -> 782
    //   782: new 285	java/lang/StringBuilder
    //   785: astore 6
    //   787: aload 6
    //   789: invokespecial 286	java/lang/StringBuilder:<init>	()V
    //   792: aload 6
    //   794: aload 15
    //   796: invokevirtual 290	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   799: astore 6
    //   801: ldc_w 292
    //   804: astore 12
    //   806: aload 6
    //   808: aload 12
    //   810: invokevirtual 290	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   813: astore 6
    //   815: aload 6
    //   817: invokevirtual 295	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   820: astore 6
    //   822: aload 9
    //   824: invokeinterface 299 1 0
    //   829: astore 12
    //   831: aload 12
    //   833: invokeinterface 304 1 0
    //   838: istore 4
    //   840: iload 4
    //   842: ifeq +107 -> 949
    //   845: aload 12
    //   847: invokeinterface 308 1 0
    //   852: astore 9
    //   854: aload 9
    //   856: checkcast 88	java/lang/Long
    //   859: astore 9
    //   861: aload 9
    //   863: invokevirtual 254	java/lang/Long:longValue	()J
    //   866: lstore 24
    //   868: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   871: istore 4
    //   873: iload 4
    //   875: ifeq +3 -> 878
    //   878: iconst_1
    //   879: istore 4
    //   881: iload 4
    //   883: anewarray 95	java/lang/String
    //   886: astore 9
    //   888: iconst_0
    //   889: istore 14
    //   891: aconst_null
    //   892: astore 15
    //   894: lload 24
    //   896: invokestatic 311	java/lang/Long:toString	(J)Ljava/lang/String;
    //   899: astore 17
    //   901: aload 9
    //   903: iconst_0
    //   904: aload 17
    //   906: aastore
    //   907: aload 13
    //   909: aload 16
    //   911: aload 6
    //   913: aload 9
    //   915: invokevirtual 315	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   918: pop
    //   919: goto -88 -> 831
    //   922: astore 9
    //   924: aload 8
    //   926: ifnull +10 -> 936
    //   929: aload 8
    //   931: invokeinterface 197 1 0
    //   936: aload 13
    //   938: ifnull +8 -> 946
    //   941: aload 13
    //   943: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   946: aload 9
    //   948: athrow
    //   949: iconst_1
    //   950: istore 4
    //   952: aload 11
    //   954: ifnull +15 -> 969
    //   957: aload 11
    //   959: aload 10
    //   961: invokestatic 320	com/vvt/io/d:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   964: aload 11
    //   966: invokestatic 208	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;)V
    //   969: aload 8
    //   971: ifnull +10 -> 981
    //   974: aload 8
    //   976: invokeinterface 197 1 0
    //   981: aload 13
    //   983: ifnull -546 -> 437
    //   986: goto -554 -> 432
    //   989: astore 22
    //   991: aconst_null
    //   992: astore 13
    //   994: iconst_0
    //   995: istore 7
    //   997: aconst_null
    //   998: astore 8
    //   1000: aload 22
    //   1002: astore 9
    //   1004: goto -80 -> 924
    //   1007: astore 22
    //   1009: aload 8
    //   1011: astore 13
    //   1013: iconst_0
    //   1014: istore 7
    //   1016: aconst_null
    //   1017: astore 8
    //   1019: aload 22
    //   1021: astore 9
    //   1023: goto -99 -> 924
    //   1026: astore 22
    //   1028: iconst_0
    //   1029: istore 7
    //   1031: aconst_null
    //   1032: astore 8
    //   1034: aload 22
    //   1036: astore 9
    //   1038: goto -114 -> 924
    //   1041: astore 13
    //   1043: aconst_null
    //   1044: astore 13
    //   1046: iconst_0
    //   1047: istore 7
    //   1049: aconst_null
    //   1050: astore 8
    //   1052: goto -653 -> 399
    //   1055: astore 13
    //   1057: aload 8
    //   1059: astore 13
    //   1061: iconst_0
    //   1062: istore 7
    //   1064: aconst_null
    //   1065: astore 8
    //   1067: goto -668 -> 399
    //   1070: astore 8
    //   1072: iconst_0
    //   1073: istore 7
    //   1075: aconst_null
    //   1076: astore 8
    //   1078: goto -679 -> 399
    //   1081: iconst_0
    //   1082: istore 7
    //   1084: aconst_null
    //   1085: astore 8
    //   1087: iconst_0
    //   1088: istore 4
    //   1090: aconst_null
    //   1091: astore 9
    //   1093: goto -141 -> 952
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1096	0	this	f
    //   0	1096	1	paramUrlType	com.vvt.capture.browserurl.BrowserUrlData.UrlType
    //   0	1096	2	paramString	String
    //   0	1096	3	paramInt	int
    //   3	1086	4	bool1	boolean
    //   11	249	5	bool2	boolean
    //   273	5	5	i	int
    //   370	408	5	bool3	boolean
    //   14	898	6	localObject1	Object
    //   17	1066	7	bool4	boolean
    //   20	1046	8	localObject2	Object
    //   1070	1	8	localException1	Exception
    //   1076	10	8	localObject3	Object
    //   26	359	9	localArrayList	ArrayList
    //   397	1	9	localException2	Exception
    //   403	511	9	localObject4	Object
    //   922	25	9	localObject5	Object
    //   1002	90	9	localObject6	Object
    //   29	931	10	str1	String
    //   32	933	11	str2	String
    //   36	810	12	localObject7	Object
    //   40	972	13	localObject8	Object
    //   1041	1	13	localException3	Exception
    //   1044	1	13	localObject9	Object
    //   1055	1	13	localException4	Exception
    //   1059	1	13	localObject10	Object
    //   45	3	14	bool5	boolean
    //   165	11	14	j	int
    //   498	392	14	bool6	boolean
    //   55	838	15	localObject11	Object
    //   67	843	16	localObject12	Object
    //   130	775	17	localObject13	Object
    //   133	441	18	k	int
    //   140	580	19	localObject14	Object
    //   143	506	20	m	int
    //   146	579	21	localObject15	Object
    //   191	557	22	localObject16	Object
    //   989	12	22	localObject17	Object
    //   1007	13	22	localObject18	Object
    //   1026	9	22	localObject19	Object
    //   303	3	23	n	int
    //   321	3	23	bool7	boolean
    //   337	381	23	i1	int
    //   348	547	24	l	long
    //   656	36	26	i2	int
    //   670	7	27	str3	String
    // Exception table:
    //   from	to	target	type
    //   230	233	397	java/lang/Exception
    //   235	240	397	java/lang/Exception
    //   240	243	397	java/lang/Exception
    //   250	257	397	java/lang/Exception
    //   266	273	397	java/lang/Exception
    //   277	284	397	java/lang/Exception
    //   291	296	397	java/lang/Exception
    //   298	303	397	java/lang/Exception
    //   316	321	397	java/lang/Exception
    //   330	337	397	java/lang/Exception
    //   341	348	397	java/lang/Exception
    //   350	355	397	java/lang/Exception
    //   357	361	397	java/lang/Exception
    //   365	370	397	java/lang/Exception
    //   377	382	397	java/lang/Exception
    //   386	394	397	java/lang/Exception
    //   765	772	397	java/lang/Exception
    //   772	775	397	java/lang/Exception
    //   782	785	397	java/lang/Exception
    //   787	792	397	java/lang/Exception
    //   794	799	397	java/lang/Exception
    //   808	813	397	java/lang/Exception
    //   815	820	397	java/lang/Exception
    //   822	829	397	java/lang/Exception
    //   831	838	397	java/lang/Exception
    //   845	852	397	java/lang/Exception
    //   854	859	397	java/lang/Exception
    //   861	866	397	java/lang/Exception
    //   868	871	397	java/lang/Exception
    //   881	886	397	java/lang/Exception
    //   894	899	397	java/lang/Exception
    //   904	907	397	java/lang/Exception
    //   913	919	397	java/lang/Exception
    //   959	964	397	java/lang/Exception
    //   964	969	397	java/lang/Exception
    //   230	233	922	finally
    //   235	240	922	finally
    //   240	243	922	finally
    //   250	257	922	finally
    //   266	273	922	finally
    //   277	284	922	finally
    //   291	296	922	finally
    //   298	303	922	finally
    //   316	321	922	finally
    //   330	337	922	finally
    //   341	348	922	finally
    //   350	355	922	finally
    //   357	361	922	finally
    //   365	370	922	finally
    //   377	382	922	finally
    //   386	394	922	finally
    //   405	408	922	finally
    //   765	772	922	finally
    //   772	775	922	finally
    //   782	785	922	finally
    //   787	792	922	finally
    //   794	799	922	finally
    //   808	813	922	finally
    //   815	820	922	finally
    //   822	829	922	finally
    //   831	838	922	finally
    //   845	852	922	finally
    //   854	859	922	finally
    //   861	866	922	finally
    //   868	871	922	finally
    //   881	886	922	finally
    //   894	899	922	finally
    //   904	907	922	finally
    //   913	919	922	finally
    //   959	964	922	finally
    //   964	969	922	finally
    //   42	45	989	finally
    //   57	62	989	finally
    //   64	67	989	finally
    //   80	84	989	finally
    //   88	93	989	finally
    //   95	100	989	finally
    //   454	458	989	finally
    //   462	467	989	finally
    //   469	474	989	finally
    //   495	498	989	finally
    //   505	508	989	finally
    //   617	620	989	finally
    //   106	111	1007	finally
    //   113	118	1007	finally
    //   120	125	1007	finally
    //   135	140	1007	finally
    //   151	154	1007	finally
    //   161	164	1007	finally
    //   167	171	1007	finally
    //   177	180	1007	finally
    //   182	187	1007	finally
    //   510	513	1007	finally
    //   533	538	1007	finally
    //   549	552	1007	finally
    //   559	562	1007	finally
    //   565	569	1007	finally
    //   575	578	1007	finally
    //   580	585	1007	finally
    //   626	629	1007	finally
    //   648	653	1007	finally
    //   661	664	1007	finally
    //   676	679	1007	finally
    //   682	687	1007	finally
    //   693	696	1007	finally
    //   703	706	1007	finally
    //   709	713	1007	finally
    //   719	722	1007	finally
    //   724	729	1007	finally
    //   224	228	1026	finally
    //   42	45	1041	java/lang/Exception
    //   57	62	1041	java/lang/Exception
    //   64	67	1041	java/lang/Exception
    //   80	84	1041	java/lang/Exception
    //   88	93	1041	java/lang/Exception
    //   95	100	1041	java/lang/Exception
    //   454	458	1041	java/lang/Exception
    //   462	467	1041	java/lang/Exception
    //   469	474	1041	java/lang/Exception
    //   495	498	1041	java/lang/Exception
    //   505	508	1041	java/lang/Exception
    //   617	620	1041	java/lang/Exception
    //   106	111	1055	java/lang/Exception
    //   113	118	1055	java/lang/Exception
    //   120	125	1055	java/lang/Exception
    //   135	140	1055	java/lang/Exception
    //   151	154	1055	java/lang/Exception
    //   161	164	1055	java/lang/Exception
    //   167	171	1055	java/lang/Exception
    //   177	180	1055	java/lang/Exception
    //   182	187	1055	java/lang/Exception
    //   510	513	1055	java/lang/Exception
    //   533	538	1055	java/lang/Exception
    //   549	552	1055	java/lang/Exception
    //   559	562	1055	java/lang/Exception
    //   565	569	1055	java/lang/Exception
    //   575	578	1055	java/lang/Exception
    //   580	585	1055	java/lang/Exception
    //   626	629	1055	java/lang/Exception
    //   648	653	1055	java/lang/Exception
    //   661	664	1055	java/lang/Exception
    //   676	679	1055	java/lang/Exception
    //   682	687	1055	java/lang/Exception
    //   693	696	1055	java/lang/Exception
    //   703	706	1055	java/lang/Exception
    //   709	713	1055	java/lang/Exception
    //   719	722	1055	java/lang/Exception
    //   724	729	1055	java/lang/Exception
    //   224	228	1070	java/lang/Exception
  }
  
  /* Error */
  public ArrayList b()
  {
    // Byte code:
    //   0: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   3: istore_1
    //   4: iload_1
    //   5: ifeq +3 -> 8
    //   8: new 49	java/util/ArrayList
    //   11: astore_2
    //   12: aload_2
    //   13: invokespecial 50	java/util/ArrayList:<init>	()V
    //   16: aconst_null
    //   17: astore_3
    //   18: iconst_0
    //   19: istore_1
    //   20: aconst_null
    //   21: astore 4
    //   23: ldc 52
    //   25: astore 5
    //   27: ldc -49
    //   29: astore 6
    //   31: ldc 54
    //   33: astore 7
    //   35: ldc_w 256
    //   38: astore 8
    //   40: ldc 58
    //   42: astore 9
    //   44: ldc 60
    //   46: astore 10
    //   48: invokestatic 65	com/vvt/capture/browserurl/a/removeFromPath:d	()Z
    //   51: istore 11
    //   53: iload 11
    //   55: ifeq +532 -> 587
    //   58: aload 6
    //   60: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   63: astore 6
    //   65: aload 7
    //   67: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   70: astore 7
    //   72: aload 8
    //   74: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   77: astore 8
    //   79: aload 9
    //   81: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   84: astore 9
    //   86: aload 10
    //   88: invokevirtual 259	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   91: astore 10
    //   93: ldc_w 264
    //   96: astore 5
    //   98: aload_0
    //   99: astore 12
    //   101: aload_0
    //   102: getfield 31	com/vvt/capture/browserurl/a/f:e	Ljava/lang/String;
    //   105: astore 13
    //   107: aload 5
    //   109: aload 13
    //   111: invokestatic 72	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   114: astore 5
    //   116: aload 5
    //   118: invokestatic 75	com/vvt/capture/browserurl/a/removeFromPath:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   121: astore_3
    //   122: ldc_w 322
    //   125: astore 13
    //   127: iconst_3
    //   128: istore 14
    //   130: iload 14
    //   132: anewarray 4	java/lang/Object
    //   135: astore 15
    //   137: iconst_0
    //   138: istore 16
    //   140: aconst_null
    //   141: astore 17
    //   143: aload 15
    //   145: iconst_0
    //   146: aload 6
    //   148: aastore
    //   149: iconst_1
    //   150: istore 18
    //   152: aload 15
    //   154: iload 18
    //   156: aload 7
    //   158: aastore
    //   159: iconst_2
    //   160: istore 18
    //   162: iconst_0
    //   163: istore 16
    //   165: aconst_null
    //   166: astore 17
    //   168: iconst_0
    //   169: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   172: astore 17
    //   174: aload 15
    //   176: iload 18
    //   178: aload 17
    //   180: aastore
    //   181: aload 13
    //   183: aload 15
    //   185: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   188: astore 6
    //   190: aload 5
    //   192: astore 13
    //   194: aload 7
    //   196: astore 5
    //   198: aload 9
    //   200: astore 7
    //   202: aload 8
    //   204: astore 19
    //   206: aload 10
    //   208: astore 8
    //   210: aload 6
    //   212: astore 10
    //   214: aload 19
    //   216: astore 6
    //   218: aload_3
    //   219: ifnull +656 -> 875
    //   222: aconst_null
    //   223: astore 9
    //   225: aload_3
    //   226: aload 10
    //   228: aconst_null
    //   229: invokevirtual 105	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   232: astore 4
    //   234: aload 4
    //   236: invokeinterface 110 1 0
    //   241: istore 20
    //   243: iload 20
    //   245: ifeq +630 -> 875
    //   248: aload 4
    //   250: aload 7
    //   252: invokeinterface 114 2 0
    //   257: istore 20
    //   259: aload 4
    //   261: iload 20
    //   263: invokeinterface 118 2 0
    //   268: astore 15
    //   270: aload 15
    //   272: ifnull -38 -> 234
    //   275: aload 15
    //   277: invokevirtual 122	java/lang/String:trim	()Ljava/lang/String;
    //   280: astore 10
    //   282: aload 10
    //   284: invokevirtual 126	java/lang/String:length	()I
    //   287: istore 20
    //   289: iload 20
    //   291: ifeq -57 -> 234
    //   294: ldc -128
    //   296: astore 10
    //   298: aload 15
    //   300: aload 10
    //   302: invokevirtual 132	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   305: istore 20
    //   307: iload 20
    //   309: ifne -75 -> 234
    //   312: aload 4
    //   314: aload 6
    //   316: invokeinterface 114 2 0
    //   321: istore 20
    //   323: aload 4
    //   325: iload 20
    //   327: invokeinterface 136 2 0
    //   332: lstore 21
    //   334: ldc2_w 137
    //   337: lstore 23
    //   339: lload 21
    //   341: lload 23
    //   343: lcmp
    //   344: istore 16
    //   346: iload 16
    //   348: ifle +8 -> 356
    //   351: invokestatic 146	java/lang/System:currentTimeMillis	()J
    //   354: lstore 21
    //   356: aload 4
    //   358: aload 5
    //   360: invokeinterface 114 2 0
    //   365: istore 16
    //   367: aload 4
    //   369: iload 16
    //   371: invokeinterface 136 2 0
    //   376: lstore 23
    //   378: aload 4
    //   380: aload 8
    //   382: invokeinterface 114 2 0
    //   387: istore 25
    //   389: aload 4
    //   391: iload 25
    //   393: invokeinterface 118 2 0
    //   398: astore 26
    //   400: aload_0
    //   401: astore 12
    //   403: aload_0
    //   404: getfield 40	com/vvt/capture/browserurl/a/f:d	Ljava/text/SimpleDateFormat;
    //   407: astore 27
    //   409: aload_0
    //   410: getfield 47	com/vvt/capture/browserurl/a/f:a	Lcom/vvt/e/MyUncaughtExceptionHandler;
    //   413: astore 12
    //   415: aload 12
    //   417: astore 28
    //   419: aload 12
    //   421: invokevirtual 148	com/vvt/e/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   424: astore 28
    //   426: aload 28
    //   428: invokestatic 154	java/util/TimeZone:getTimeZone	(Ljava/lang/String;)Ljava/util/TimeZone;
    //   431: astore 28
    //   433: aload 27
    //   435: aload 28
    //   437: invokevirtual 158	java/text/SimpleDateFormat:setTimeZone	(Ljava/util/TimeZone;)V
    //   440: aload_0
    //   441: astore 12
    //   443: aload_0
    //   444: getfield 40	com/vvt/capture/browserurl/a/f:d	Ljava/text/SimpleDateFormat;
    //   447: astore 27
    //   449: new 160	java/sql/Date
    //   452: astore 28
    //   454: aload 28
    //   456: astore 12
    //   458: aload 28
    //   460: lload 21
    //   462: invokespecial 163	java/sql/Date:<init>	(J)V
    //   465: aload 27
    //   467: aload 28
    //   469: invokevirtual 166	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   472: astore 27
    //   474: new 168	com/vvt/capture/browserurl/BrowserUrlData
    //   477: astore 28
    //   479: aload 28
    //   481: invokespecial 169	com/vvt/capture/browserurl/BrowserUrlData:<init>	()V
    //   484: aload 28
    //   486: astore 12
    //   488: aload 28
    //   490: lload 23
    //   492: invokevirtual 171	com/vvt/capture/browserurl/BrowserUrlData:a	(J)V
    //   495: getstatic 262	com/vvt/capture/browserurl/BrowserUrlData$UrlType:BOOKMARKS	Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;
    //   498: astore 17
    //   500: aload 28
    //   502: aload 17
    //   504: invokevirtual 180	com/vvt/capture/browserurl/BrowserUrlData:a	(Lcom/vvt/capture/browserurl/BrowserUrlData$UrlType;)V
    //   507: aload 28
    //   509: aload 26
    //   511: invokevirtual 182	com/vvt/capture/browserurl/BrowserUrlData:a	(Ljava/lang/String;)V
    //   514: aload 28
    //   516: aload 15
    //   518: invokevirtual 184	com/vvt/capture/browserurl/BrowserUrlData:removeFromPath	(Ljava/lang/String;)V
    //   521: aload 28
    //   523: lload 21
    //   525: invokevirtual 186	com/vvt/capture/browserurl/BrowserUrlData:removeFromPath	(J)V
    //   528: aload 28
    //   530: aload 27
    //   532: invokevirtual 188	com/vvt/capture/browserurl/BrowserUrlData:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   535: aload_2
    //   536: aload 28
    //   538: invokevirtual 194	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   541: pop
    //   542: goto -308 -> 234
    //   545: astore 10
    //   547: getstatic 25	com/vvt/capture/browserurl/a/f:MyUncaughtExceptionHandler	Z
    //   550: istore 20
    //   552: iload 20
    //   554: ifeq +3 -> 557
    //   557: aload 4
    //   559: ifnull +10 -> 569
    //   562: aload 4
    //   564: invokeinterface 197 1 0
    //   569: aload_3
    //   570: ifnull +7 -> 577
    //   573: aload_3
    //   574: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   577: getstatic 21	com/vvt/capture/browserurl/a/f:removeFromPath	Z
    //   580: istore_1
    //   581: iload_1
    //   582: ifeq +3 -> 585
    //   585: aload_2
    //   586: areturn
    //   587: invokestatic 200	com/vvt/capture/browserurl/a/removeFromPath:MyUncaughtExceptionHandler	()Z
    //   590: istore 11
    //   592: iload 11
    //   594: ifeq +143 -> 737
    //   597: invokestatic 203	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   600: astore_3
    //   601: ldc_w 324
    //   604: astore 13
    //   606: iconst_5
    //   607: istore 14
    //   609: iload 14
    //   611: anewarray 4	java/lang/Object
    //   614: astore 15
    //   616: iconst_0
    //   617: istore 16
    //   619: aconst_null
    //   620: astore 17
    //   622: aload 15
    //   624: iconst_0
    //   625: aload 6
    //   627: aastore
    //   628: iconst_1
    //   629: istore 18
    //   631: aload 15
    //   633: iload 18
    //   635: aload 7
    //   637: aastore
    //   638: iconst_2
    //   639: istore 18
    //   641: iconst_0
    //   642: istore 16
    //   644: aconst_null
    //   645: astore 17
    //   647: iconst_0
    //   648: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   651: astore 17
    //   653: aload 15
    //   655: iload 18
    //   657: aload 17
    //   659: aastore
    //   660: iconst_3
    //   661: istore 18
    //   663: ldc_w 326
    //   666: astore 17
    //   668: aload 15
    //   670: iload 18
    //   672: aload 17
    //   674: aastore
    //   675: iconst_4
    //   676: istore 18
    //   678: iconst_0
    //   679: istore 16
    //   681: aconst_null
    //   682: astore 17
    //   684: iconst_0
    //   685: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   688: astore 17
    //   690: aload 15
    //   692: iload 18
    //   694: aload 17
    //   696: aastore
    //   697: aload 13
    //   699: aload 15
    //   701: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   704: astore 6
    //   706: aload 5
    //   708: astore 13
    //   710: aload 7
    //   712: astore 5
    //   714: aload 9
    //   716: astore 7
    //   718: aload 8
    //   720: astore 19
    //   722: aload 10
    //   724: astore 8
    //   726: aload 6
    //   728: astore 10
    //   730: aload 19
    //   732: astore 6
    //   734: goto -516 -> 218
    //   737: invokestatic 203	com/vvt/capture/browserurl/a/removeFromPath:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   740: astore_3
    //   741: lconst_1
    //   742: lstore 29
    //   744: ldc_w 324
    //   747: astore 13
    //   749: iconst_5
    //   750: istore 31
    //   752: iload 31
    //   754: anewarray 4	java/lang/Object
    //   757: astore 32
    //   759: iconst_0
    //   760: istore 25
    //   762: aconst_null
    //   763: astore 26
    //   765: aload 32
    //   767: iconst_0
    //   768: aload 6
    //   770: aastore
    //   771: iconst_1
    //   772: istore 18
    //   774: aload 32
    //   776: iload 18
    //   778: aload 7
    //   780: aastore
    //   781: iconst_2
    //   782: istore 18
    //   784: iconst_0
    //   785: istore 25
    //   787: aconst_null
    //   788: astore 26
    //   790: iconst_0
    //   791: invokestatic 217	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   794: astore 26
    //   796: aload 32
    //   798: iload 18
    //   800: aload 26
    //   802: aastore
    //   803: iconst_3
    //   804: istore 18
    //   806: ldc_w 283
    //   809: astore 26
    //   811: aload 32
    //   813: iload 18
    //   815: aload 26
    //   817: aastore
    //   818: iconst_4
    //   819: istore 18
    //   821: lload 29
    //   823: invokestatic 92	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   826: astore 15
    //   828: aload 32
    //   830: iload 18
    //   832: aload 15
    //   834: aastore
    //   835: aload 13
    //   837: aload 32
    //   839: invokestatic 99	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   842: astore 6
    //   844: aload 5
    //   846: astore 13
    //   848: aload 7
    //   850: astore 5
    //   852: aload 9
    //   854: astore 7
    //   856: aload 8
    //   858: astore 19
    //   860: aload 10
    //   862: astore 8
    //   864: aload 6
    //   866: astore 10
    //   868: aload 19
    //   870: astore 6
    //   872: goto -654 -> 218
    //   875: aload 13
    //   877: invokestatic 208	com/vvt/capture/browserurl/a/a:a	(Ljava/lang/String;)V
    //   880: aload 4
    //   882: ifnull +10 -> 892
    //   885: aload 4
    //   887: invokeinterface 197 1 0
    //   892: aload_3
    //   893: ifnull -316 -> 577
    //   896: goto -323 -> 573
    //   899: astore 19
    //   901: iconst_0
    //   902: istore 20
    //   904: aconst_null
    //   905: astore 10
    //   907: aconst_null
    //   908: astore_3
    //   909: aload 19
    //   911: astore 4
    //   913: aload_3
    //   914: ifnull +9 -> 923
    //   917: aload_3
    //   918: invokeinterface 197 1 0
    //   923: aload 10
    //   925: ifnull +8 -> 933
    //   928: aload 10
    //   930: invokevirtual 198	android/database/sqlite/SQLiteDatabase:close	()V
    //   933: aload 4
    //   935: athrow
    //   936: astore 19
    //   938: aload_3
    //   939: astore 10
    //   941: aconst_null
    //   942: astore_3
    //   943: aload 19
    //   945: astore 4
    //   947: goto -34 -> 913
    //   950: astore 19
    //   952: aload_3
    //   953: astore 10
    //   955: aload 4
    //   957: astore_3
    //   958: aload 19
    //   960: astore 4
    //   962: goto -49 -> 913
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	965	0	this	f
    //   3	579	1	bool1	boolean
    //   11	575	2	localArrayList	ArrayList
    //   17	941	3	localObject1	Object
    //   21	940	4	localObject2	Object
    //   25	826	5	localObject3	Object
    //   29	842	6	localObject4	Object
    //   33	822	7	localObject5	Object
    //   38	825	8	localObject6	Object
    //   42	811	9	str	String
    //   46	255	10	localObject7	Object
    //   545	178	10	localException	Exception
    //   728	226	10	localObject8	Object
    //   51	542	11	bool2	boolean
    //   99	388	12	localObject9	Object
    //   105	771	13	localObject10	Object
    //   128	482	14	i	int
    //   135	698	15	localObject11	Object
    //   138	209	16	bool3	boolean
    //   365	315	16	j	int
    //   141	554	17	localObject12	Object
    //   150	681	18	k	int
    //   204	665	19	localObject13	Object
    //   899	11	19	localObject14	Object
    //   936	8	19	localObject15	Object
    //   950	9	19	localObject16	Object
    //   241	3	20	bool4	boolean
    //   257	33	20	m	int
    //   305	3	20	bool5	boolean
    //   321	5	20	n	int
    //   550	353	20	bool6	boolean
    //   332	192	21	l1	long
    //   337	154	23	l2	long
    //   387	399	25	i1	int
    //   398	418	26	localObject17	Object
    //   407	124	27	localObject18	Object
    //   417	120	28	localObject19	Object
    //   742	80	29	l3	long
    //   750	3	31	i2	int
    //   757	81	32	arrayOfObject	Object[]
    // Exception table:
    //   from	to	target	type
    //   48	51	545	java/lang/Exception
    //   58	63	545	java/lang/Exception
    //   65	70	545	java/lang/Exception
    //   72	77	545	java/lang/Exception
    //   79	84	545	java/lang/Exception
    //   86	91	545	java/lang/Exception
    //   101	105	545	java/lang/Exception
    //   109	114	545	java/lang/Exception
    //   116	121	545	java/lang/Exception
    //   130	135	545	java/lang/Exception
    //   146	149	545	java/lang/Exception
    //   156	159	545	java/lang/Exception
    //   168	172	545	java/lang/Exception
    //   178	181	545	java/lang/Exception
    //   183	188	545	java/lang/Exception
    //   228	232	545	java/lang/Exception
    //   234	241	545	java/lang/Exception
    //   250	257	545	java/lang/Exception
    //   261	268	545	java/lang/Exception
    //   275	280	545	java/lang/Exception
    //   282	287	545	java/lang/Exception
    //   300	305	545	java/lang/Exception
    //   314	321	545	java/lang/Exception
    //   325	332	545	java/lang/Exception
    //   351	354	545	java/lang/Exception
    //   358	365	545	java/lang/Exception
    //   369	376	545	java/lang/Exception
    //   380	387	545	java/lang/Exception
    //   391	398	545	java/lang/Exception
    //   403	407	545	java/lang/Exception
    //   409	413	545	java/lang/Exception
    //   419	424	545	java/lang/Exception
    //   426	431	545	java/lang/Exception
    //   435	440	545	java/lang/Exception
    //   443	447	545	java/lang/Exception
    //   449	452	545	java/lang/Exception
    //   460	465	545	java/lang/Exception
    //   467	472	545	java/lang/Exception
    //   474	477	545	java/lang/Exception
    //   479	484	545	java/lang/Exception
    //   490	495	545	java/lang/Exception
    //   495	498	545	java/lang/Exception
    //   502	507	545	java/lang/Exception
    //   509	514	545	java/lang/Exception
    //   516	521	545	java/lang/Exception
    //   523	528	545	java/lang/Exception
    //   530	535	545	java/lang/Exception
    //   536	542	545	java/lang/Exception
    //   587	590	545	java/lang/Exception
    //   597	600	545	java/lang/Exception
    //   609	614	545	java/lang/Exception
    //   625	628	545	java/lang/Exception
    //   635	638	545	java/lang/Exception
    //   647	651	545	java/lang/Exception
    //   657	660	545	java/lang/Exception
    //   672	675	545	java/lang/Exception
    //   684	688	545	java/lang/Exception
    //   694	697	545	java/lang/Exception
    //   699	704	545	java/lang/Exception
    //   737	740	545	java/lang/Exception
    //   752	757	545	java/lang/Exception
    //   768	771	545	java/lang/Exception
    //   778	781	545	java/lang/Exception
    //   790	794	545	java/lang/Exception
    //   800	803	545	java/lang/Exception
    //   815	818	545	java/lang/Exception
    //   821	826	545	java/lang/Exception
    //   832	835	545	java/lang/Exception
    //   837	842	545	java/lang/Exception
    //   875	880	545	java/lang/Exception
    //   48	51	899	finally
    //   58	63	899	finally
    //   65	70	899	finally
    //   72	77	899	finally
    //   79	84	899	finally
    //   86	91	899	finally
    //   101	105	899	finally
    //   109	114	899	finally
    //   116	121	899	finally
    //   587	590	899	finally
    //   597	600	899	finally
    //   737	740	899	finally
    //   130	135	936	finally
    //   146	149	936	finally
    //   156	159	936	finally
    //   168	172	936	finally
    //   178	181	936	finally
    //   183	188	936	finally
    //   228	232	936	finally
    //   609	614	936	finally
    //   625	628	936	finally
    //   635	638	936	finally
    //   647	651	936	finally
    //   657	660	936	finally
    //   672	675	936	finally
    //   684	688	936	finally
    //   694	697	936	finally
    //   699	704	936	finally
    //   752	757	936	finally
    //   768	771	936	finally
    //   778	781	936	finally
    //   790	794	936	finally
    //   800	803	936	finally
    //   815	818	936	finally
    //   821	826	936	finally
    //   832	835	936	finally
    //   837	842	936	finally
    //   234	241	950	finally
    //   250	257	950	finally
    //   261	268	950	finally
    //   275	280	950	finally
    //   282	287	950	finally
    //   300	305	950	finally
    //   314	321	950	finally
    //   325	332	950	finally
    //   351	354	950	finally
    //   358	365	950	finally
    //   369	376	950	finally
    //   380	387	950	finally
    //   391	398	950	finally
    //   403	407	950	finally
    //   409	413	950	finally
    //   419	424	950	finally
    //   426	431	950	finally
    //   435	440	950	finally
    //   443	447	950	finally
    //   449	452	950	finally
    //   460	465	950	finally
    //   467	472	950	finally
    //   474	477	950	finally
    //   479	484	950	finally
    //   490	495	950	finally
    //   495	498	950	finally
    //   502	507	950	finally
    //   509	514	950	finally
    //   516	521	950	finally
    //   523	528	950	finally
    //   530	535	950	finally
    //   536	542	950	finally
    //   547	550	950	finally
    //   875	880	950	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/browserurl/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */