package com.vvt.capture.viber.mode.full;

import com.vvt.base.b;
import com.vvt.h.d;
import java.util.ArrayList;

public class j
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.b;
      c = com.vvt.ak.a.e;
      return;
    }
  }
  
  /* Error */
  private static com.vvt.im.events.info.b a(com.vvt.af.a.a parama, String paramString1, String paramString2, java.util.List paramList)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   9: istore 6
    //   11: iload 6
    //   13: ifeq +3 -> 16
    //   16: aload_0
    //   17: ifnull +401 -> 418
    //   20: ldc 24
    //   22: astore 7
    //   24: iconst_1
    //   25: istore 8
    //   27: iload 8
    //   29: anewarray 4	java/lang/Object
    //   32: astore 9
    //   34: iconst_0
    //   35: istore 10
    //   37: ldc 26
    //   39: astore 11
    //   41: aload 9
    //   43: iconst_0
    //   44: aload 11
    //   46: aastore
    //   47: aload 7
    //   49: aload 9
    //   51: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   54: astore 11
    //   56: ldc 34
    //   58: astore 9
    //   60: iconst_0
    //   61: istore 10
    //   63: iconst_1
    //   64: istore 6
    //   66: iload 6
    //   68: anewarray 28	java/lang/String
    //   71: astore 12
    //   73: iconst_0
    //   74: istore 6
    //   76: aconst_null
    //   77: astore 7
    //   79: aload 12
    //   81: iconst_0
    //   82: aload_2
    //   83: aastore
    //   84: aload_0
    //   85: astore 7
    //   87: aload_0
    //   88: aload 9
    //   90: aconst_null
    //   91: aload 11
    //   93: aload 12
    //   95: aconst_null
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokevirtual 39	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   101: astore 7
    //   103: aload 7
    //   105: ifnull +304 -> 409
    //   108: aload 7
    //   110: invokeinterface 45 1 0
    //   115: istore 8
    //   117: iload 8
    //   119: ifeq +290 -> 409
    //   122: ldc 47
    //   124: astore 9
    //   126: aload 7
    //   128: aload 9
    //   130: invokeinterface 51 2 0
    //   135: istore 8
    //   137: aload 7
    //   139: iload 8
    //   141: invokeinterface 55 2 0
    //   146: astore 9
    //   148: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   151: istore 10
    //   153: iload 10
    //   155: ifeq +3 -> 158
    //   158: aload 7
    //   160: ifnull +10 -> 170
    //   163: aload 7
    //   165: invokeinterface 59 1 0
    //   170: aload 9
    //   172: astore 7
    //   174: aload 7
    //   176: ifnull +17 -> 193
    //   179: aload 7
    //   181: invokevirtual 63	java/lang/String:length	()I
    //   184: istore 8
    //   186: iload 8
    //   188: iload 4
    //   190: if_icmpge +61 -> 251
    //   193: aload_3
    //   194: invokeinterface 68 1 0
    //   199: istore 8
    //   201: iload 8
    //   203: iload 4
    //   205: if_icmpne +46 -> 251
    //   208: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   211: istore 6
    //   213: iload 6
    //   215: ifeq +3 -> 218
    //   218: aload_3
    //   219: iconst_0
    //   220: invokeinterface 72 2 0
    //   225: checkcast 74	com/vvt/im/events/info/e
    //   228: invokevirtual 77	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   231: astore 9
    //   233: aload_3
    //   234: iconst_0
    //   235: invokeinterface 72 2 0
    //   240: checkcast 74	com/vvt/im/events/info/e
    //   243: invokevirtual 80	com/vvt/im/events/info/e:d	()Ljava/lang/String;
    //   246: astore_2
    //   247: aload 9
    //   249: astore 7
    //   251: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   254: istore 8
    //   256: iload 8
    //   258: ifeq +3 -> 261
    //   261: new 82	com/vvt/im/events/info/removeFromPath
    //   264: astore 9
    //   266: aload 9
    //   268: invokespecial 85	com/vvt/im/events/info/removeFromPath:<init>	()V
    //   271: aload 9
    //   273: aload_2
    //   274: invokevirtual 88	com/vvt/im/events/info/removeFromPath:a	(Ljava/lang/String;)V
    //   277: aload 9
    //   279: aload 7
    //   281: invokevirtual 90	com/vvt/im/events/info/removeFromPath:removeFromPath	(Ljava/lang/String;)V
    //   284: aload 9
    //   286: aconst_null
    //   287: invokevirtual 92	com/vvt/im/events/info/removeFromPath:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   290: iconst_0
    //   291: newarray <illegal type>
    //   293: astore 7
    //   295: aload 9
    //   297: aload 7
    //   299: invokevirtual 95	com/vvt/im/events/info/removeFromPath:a	([B)V
    //   302: aload 9
    //   304: aconst_null
    //   305: invokevirtual 97	com/vvt/im/events/info/removeFromPath:d	(Ljava/lang/String;)V
    //   308: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   311: istore 6
    //   313: iload 6
    //   315: ifeq +3 -> 318
    //   318: aload 9
    //   320: areturn
    //   321: astore 7
    //   323: iconst_0
    //   324: istore 6
    //   326: aconst_null
    //   327: astore 7
    //   329: iconst_0
    //   330: istore 8
    //   332: aconst_null
    //   333: astore 9
    //   335: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   338: istore 10
    //   340: iload 10
    //   342: ifeq +3 -> 345
    //   345: aload 7
    //   347: ifnull +10 -> 357
    //   350: aload 7
    //   352: invokeinterface 59 1 0
    //   357: aload 9
    //   359: astore 7
    //   361: goto -187 -> 174
    //   364: astore 7
    //   366: aload 5
    //   368: ifnull +10 -> 378
    //   371: aload 5
    //   373: invokeinterface 59 1 0
    //   378: aload 7
    //   380: athrow
    //   381: astore 9
    //   383: aload 7
    //   385: astore 5
    //   387: aload 9
    //   389: astore 7
    //   391: goto -25 -> 366
    //   394: astore 9
    //   396: iconst_0
    //   397: istore 8
    //   399: aconst_null
    //   400: astore 9
    //   402: goto -67 -> 335
    //   405: pop
    //   406: goto -71 -> 335
    //   409: iconst_0
    //   410: istore 8
    //   412: aconst_null
    //   413: astore 9
    //   415: goto -257 -> 158
    //   418: iconst_0
    //   419: istore 6
    //   421: aconst_null
    //   422: astore 7
    //   424: iconst_0
    //   425: istore 8
    //   427: aconst_null
    //   428: astore 9
    //   430: goto -272 -> 158
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	433	0	parama	com.vvt.af.a.a
    //   0	433	1	paramString1	String
    //   0	433	2	paramString2	String
    //   0	433	3	paramList	java.util.List
    //   1	205	4	i	int
    //   4	382	5	localObject1	Object
    //   9	411	6	bool1	boolean
    //   22	276	7	localObject2	Object
    //   321	1	7	localException1	Exception
    //   327	33	7	localObject3	Object
    //   364	20	7	localObject4	Object
    //   389	34	7	localObject5	Object
    //   25	93	8	bool2	boolean
    //   135	71	8	j	int
    //   254	172	8	bool3	boolean
    //   32	326	9	localObject6	Object
    //   381	7	9	localObject7	Object
    //   394	1	9	localException2	Exception
    //   400	29	9	localObject8	Object
    //   35	306	10	bool4	boolean
    //   39	53	11	str	String
    //   71	23	12	arrayOfString	String[]
    //   405	1	22	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   27	32	321	java/lang/Exception
    //   44	47	321	java/lang/Exception
    //   49	54	321	java/lang/Exception
    //   66	71	321	java/lang/Exception
    //   82	84	321	java/lang/Exception
    //   97	101	321	java/lang/Exception
    //   27	32	364	finally
    //   44	47	364	finally
    //   49	54	364	finally
    //   66	71	364	finally
    //   82	84	364	finally
    //   97	101	364	finally
    //   108	115	381	finally
    //   128	135	381	finally
    //   139	146	381	finally
    //   148	151	381	finally
    //   335	338	381	finally
    //   108	115	394	java/lang/Exception
    //   128	135	394	java/lang/Exception
    //   139	146	394	java/lang/Exception
    //   148	151	405	java/lang/Exception
  }
  
  /* Error */
  private static com.vvt.im.events.info.f a(com.vvt.af.a.a parama, String paramString1, String paramString2, String paramString3, com.vvt.im.events.info.d paramd, com.vvt.im.events.info.ICallLogData.Direction paramDirection, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, String paramString4)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   3: istore 13
    //   5: iload 13
    //   7: ifeq +3 -> 10
    //   10: new 101	com/vvt/im/events/info/f
    //   13: astore 14
    //   15: aload 14
    //   17: invokespecial 102	com/vvt/im/events/info/f:<init>	()V
    //   20: aconst_null
    //   21: astore 15
    //   23: aconst_null
    //   24: astore 16
    //   26: aconst_null
    //   27: astore 17
    //   29: iconst_0
    //   30: newarray <illegal type>
    //   32: astore 18
    //   34: aload 18
    //   36: astore 19
    //   38: iconst_2
    //   39: istore 13
    //   41: iload 7
    //   43: iload 13
    //   45: if_icmpeq +112 -> 157
    //   48: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   51: istore 13
    //   53: iload 13
    //   55: ifeq +3 -> 58
    //   58: aload_0
    //   59: astore 18
    //   61: aload_0
    //   62: iload 6
    //   64: invokestatic 108	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:removeFromPath	(Lcom/vvt/af/a/a;I)V
    //   67: aload 12
    //   69: ifnonnull +17 -> 86
    //   72: ldc 110
    //   74: astore 17
    //   76: aload_0
    //   77: iload 6
    //   79: aload 17
    //   81: invokestatic 113	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:removeFromPath	(Lcom/vvt/af/a/a;ILjava/lang/String;)Ljava/lang/String;
    //   84: astore 12
    //   86: ldc 115
    //   88: astore 17
    //   90: aload 12
    //   92: astore 18
    //   94: aload 12
    //   96: aload 17
    //   98: invokevirtual 119	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   101: istore 13
    //   103: iload 13
    //   105: ifne +52 -> 157
    //   108: aload_0
    //   109: astore 18
    //   111: aload_0
    //   112: iload 6
    //   114: ldc 121
    //   116: invokestatic 124	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;ILjava/lang/String;)J
    //   119: l2d
    //   120: ldc2_w 127
    //   123: ddiv
    //   124: dstore 8
    //   126: ldc -126
    //   128: astore 17
    //   130: aload_0
    //   131: iload 6
    //   133: aload 17
    //   135: invokestatic 124	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;ILjava/lang/String;)J
    //   138: lstore 20
    //   140: lload 20
    //   142: l2d
    //   143: dstore 22
    //   145: ldc2_w 127
    //   148: dstore 24
    //   150: dload 22
    //   152: dload 24
    //   154: ddiv
    //   155: dstore 10
    //   157: ldc 115
    //   159: astore 17
    //   161: aload 12
    //   163: astore 18
    //   165: aload 12
    //   167: aload 17
    //   169: invokevirtual 119	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   172: istore 13
    //   174: iload 13
    //   176: ifeq +115 -> 291
    //   179: new 132	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   182: astore 17
    //   184: aload 17
    //   186: invokespecial 133	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   189: aload 17
    //   191: astore 26
    //   193: getstatic 139	com/vvt/im/events/info/ICallLogData$Direction:OUT	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   196: astore 17
    //   198: aload 5
    //   200: astore 18
    //   202: aload 5
    //   204: aload 17
    //   206: if_acmpne +131 -> 337
    //   209: iconst_0
    //   210: istore 13
    //   212: aload 14
    //   214: aconst_null
    //   215: invokevirtual 140	com/vvt/im/events/info/f:d	(Ljava/lang/String;)V
    //   218: aload 4
    //   220: invokevirtual 144	com/vvt/im/events/info/d:a	()Ljava/lang/String;
    //   223: astore 17
    //   225: aload 14
    //   227: aload 17
    //   229: invokevirtual 145	com/vvt/im/events/info/f:removeFromPath	(Ljava/lang/String;)V
    //   232: aload 4
    //   234: invokevirtual 148	com/vvt/im/events/info/d:FxFileObserverWorker	()Ljava/lang/String;
    //   237: astore 17
    //   239: aload 14
    //   241: aload 17
    //   243: invokevirtual 150	com/vvt/im/events/info/f:e	(Ljava/lang/String;)V
    //   246: aload 19
    //   248: astore 18
    //   250: aload 14
    //   252: aload 19
    //   254: invokevirtual 151	com/vvt/im/events/info/f:a	([B)V
    //   257: aload 4
    //   259: invokevirtual 153	com/vvt/im/events/info/d:removeFromPath	()Ljava/lang/String;
    //   262: astore 17
    //   264: aload 14
    //   266: aload 17
    //   268: invokevirtual 154	com/vvt/im/events/info/f:a	(Ljava/lang/String;)V
    //   271: aload 14
    //   273: aload 26
    //   275: invokevirtual 157	com/vvt/im/events/info/f:a	(Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;)V
    //   278: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   281: istore 13
    //   283: iload 13
    //   285: ifeq +3 -> 288
    //   288: aload 14
    //   290: areturn
    //   291: new 132	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   294: astore 17
    //   296: aload 17
    //   298: invokespecial 133	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   301: aload 17
    //   303: dload 8
    //   305: invokevirtual 160	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
    //   308: aload 17
    //   310: dload 10
    //   312: invokevirtual 162	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   315: ldc -93
    //   317: istore 27
    //   319: ldc -92
    //   321: fstore 28
    //   323: aload 17
    //   325: fload 28
    //   327: invokevirtual 167	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(F)V
    //   330: aload 17
    //   332: astore 26
    //   334: goto -141 -> 193
    //   337: aconst_null
    //   338: astore 29
    //   340: aload_0
    //   341: ifnull +477 -> 818
    //   344: ldc -87
    //   346: astore 17
    //   348: iconst_2
    //   349: istore 27
    //   351: ldc 103
    //   353: fstore 28
    //   355: iload 27
    //   357: anewarray 4	java/lang/Object
    //   360: astore 30
    //   362: iconst_0
    //   363: istore 31
    //   365: aconst_null
    //   366: astore 32
    //   368: ldc 26
    //   370: astore 33
    //   372: aload 30
    //   374: iconst_0
    //   375: aload 33
    //   377: aastore
    //   378: iconst_1
    //   379: istore 31
    //   381: ldc -85
    //   383: astore 33
    //   385: aload 30
    //   387: iload 31
    //   389: aload 33
    //   391: aastore
    //   392: aload 17
    //   394: aload 30
    //   396: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   399: astore 33
    //   401: ldc -83
    //   403: astore 30
    //   405: iconst_0
    //   406: istore 31
    //   408: aconst_null
    //   409: astore 32
    //   411: iconst_2
    //   412: istore 13
    //   414: iload 13
    //   416: anewarray 28	java/lang/String
    //   419: astore 34
    //   421: iconst_0
    //   422: istore 13
    //   424: aconst_null
    //   425: astore 17
    //   427: aload 34
    //   429: iconst_0
    //   430: aload_2
    //   431: aastore
    //   432: iconst_1
    //   433: istore 13
    //   435: aload 34
    //   437: iload 13
    //   439: aload_3
    //   440: aastore
    //   441: aload_0
    //   442: astore 17
    //   444: aload_0
    //   445: aload 30
    //   447: aconst_null
    //   448: aload 33
    //   450: aload 34
    //   452: aconst_null
    //   453: aconst_null
    //   454: aconst_null
    //   455: invokevirtual 39	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   458: astore 17
    //   460: aload 17
    //   462: ifnull +112 -> 574
    //   465: aload 17
    //   467: invokeinterface 45 1 0
    //   472: istore 27
    //   474: iload 27
    //   476: ifeq +98 -> 574
    //   479: ldc -81
    //   481: astore 30
    //   483: aload 17
    //   485: aload 30
    //   487: invokeinterface 51 2 0
    //   492: istore 27
    //   494: aload 17
    //   496: iload 27
    //   498: invokeinterface 55 2 0
    //   503: astore 32
    //   505: ldc -79
    //   507: astore 30
    //   509: aload 17
    //   511: aload 30
    //   513: invokeinterface 51 2 0
    //   518: istore 27
    //   520: aload 17
    //   522: iload 27
    //   524: invokeinterface 55 2 0
    //   529: astore 30
    //   531: ldc -77
    //   533: astore 33
    //   535: aload 17
    //   537: aload 33
    //   539: invokeinterface 51 2 0
    //   544: istore 35
    //   546: aload 17
    //   548: iload 35
    //   550: invokeinterface 55 2 0
    //   555: pop
    //   556: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   559: istore 35
    //   561: iload 35
    //   563: ifeq +3 -> 566
    //   566: aload 30
    //   568: astore 16
    //   570: aload 32
    //   572: astore 15
    //   574: aload 17
    //   576: ifnull +10 -> 586
    //   579: aload 17
    //   581: invokeinterface 59 1 0
    //   586: aload 16
    //   588: astore 30
    //   590: aload 15
    //   592: astore 17
    //   594: aload 17
    //   596: ifnull +20 -> 616
    //   599: aload 17
    //   601: invokevirtual 63	java/lang/String:length	()I
    //   604: istore 31
    //   606: iconst_1
    //   607: istore 35
    //   609: iload 31
    //   611: iload 35
    //   613: if_icmpge +7 -> 620
    //   616: aload 30
    //   618: astore 17
    //   620: aload 17
    //   622: ifnull +20 -> 642
    //   625: aload 17
    //   627: invokevirtual 63	java/lang/String:length	()I
    //   630: istore 27
    //   632: iconst_1
    //   633: istore 31
    //   635: iload 27
    //   637: iload 31
    //   639: if_icmpge +6 -> 645
    //   642: aload_3
    //   643: astore 17
    //   645: aload_3
    //   646: astore 18
    //   648: aload 14
    //   650: aload_3
    //   651: invokevirtual 140	com/vvt/im/events/info/f:d	(Ljava/lang/String;)V
    //   654: aload 14
    //   656: aload 17
    //   658: invokevirtual 145	com/vvt/im/events/info/f:removeFromPath	(Ljava/lang/String;)V
    //   661: aload 14
    //   663: aconst_null
    //   664: invokevirtual 150	com/vvt/im/events/info/f:e	(Ljava/lang/String;)V
    //   667: aload 19
    //   669: astore 18
    //   671: aload 14
    //   673: aload 19
    //   675: invokevirtual 151	com/vvt/im/events/info/f:a	([B)V
    //   678: aload_3
    //   679: astore 18
    //   681: aload 14
    //   683: aload_3
    //   684: invokevirtual 154	com/vvt/im/events/info/f:a	(Ljava/lang/String;)V
    //   687: aload 14
    //   689: aload 26
    //   691: invokevirtual 157	com/vvt/im/events/info/f:a	(Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;)V
    //   694: goto -416 -> 278
    //   697: astore 17
    //   699: iconst_0
    //   700: istore 13
    //   702: aconst_null
    //   703: astore 17
    //   705: iconst_0
    //   706: istore 27
    //   708: aconst_null
    //   709: astore 30
    //   711: fconst_0
    //   712: fstore 28
    //   714: iconst_0
    //   715: istore 31
    //   717: aconst_null
    //   718: astore 32
    //   720: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   723: istore 35
    //   725: iload 35
    //   727: ifeq +3 -> 730
    //   730: aload 17
    //   732: ifnull +10 -> 742
    //   735: aload 17
    //   737: invokeinterface 59 1 0
    //   742: aload 32
    //   744: astore 17
    //   746: goto -152 -> 594
    //   749: astore 17
    //   751: aload 29
    //   753: ifnull +10 -> 763
    //   756: aload 29
    //   758: invokeinterface 59 1 0
    //   763: aload 17
    //   765: athrow
    //   766: astore 30
    //   768: aload 17
    //   770: astore 29
    //   772: aload 30
    //   774: astore 17
    //   776: goto -25 -> 751
    //   779: astore 30
    //   781: iconst_0
    //   782: istore 27
    //   784: aconst_null
    //   785: astore 30
    //   787: fconst_0
    //   788: fstore 28
    //   790: iconst_0
    //   791: istore 31
    //   793: aconst_null
    //   794: astore 32
    //   796: goto -76 -> 720
    //   799: astore 30
    //   801: iconst_0
    //   802: istore 27
    //   804: aconst_null
    //   805: astore 30
    //   807: fconst_0
    //   808: fstore 28
    //   810: goto -90 -> 720
    //   813: astore 33
    //   815: goto -95 -> 720
    //   818: iconst_0
    //   819: istore 13
    //   821: aconst_null
    //   822: astore 17
    //   824: goto -250 -> 574
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	827	0	parama	com.vvt.af.a.a
    //   0	827	1	paramString1	String
    //   0	827	2	paramString2	String
    //   0	827	3	paramString3	String
    //   0	827	4	paramd	com.vvt.im.events.info.d
    //   0	827	5	paramDirection	com.vvt.im.events.info.ICallLogData.Direction
    //   0	827	6	paramInt1	int
    //   0	827	7	paramInt2	int
    //   0	827	8	paramDouble1	double
    //   0	827	10	paramDouble2	double
    //   0	827	12	paramString4	String
    //   3	3	13	bool1	boolean
    //   39	7	13	i	int
    //   51	233	13	bool2	boolean
    //   412	408	13	j	int
    //   13	675	14	localf	com.vvt.im.events.info.f
    //   21	570	15	localObject1	Object
    //   24	563	16	localObject2	Object
    //   27	630	17	localObject3	Object
    //   697	1	17	localException1	Exception
    //   703	42	17	localObject4	Object
    //   749	20	17	localObject5	Object
    //   774	49	17	localObject6	Object
    //   32	648	18	localObject7	Object
    //   36	638	19	localObject8	Object
    //   138	3	20	l	long
    //   143	8	22	d1	double
    //   148	5	24	d2	double
    //   191	499	26	localObject9	Object
    //   317	39	27	k	int
    //   472	3	27	bool3	boolean
    //   492	311	27	m	int
    //   321	488	28	f	float
    //   338	433	29	localObject10	Object
    //   360	350	30	localObject11	Object
    //   766	7	30	localObject12	Object
    //   779	1	30	localException2	Exception
    //   785	1	30	localObject13	Object
    //   799	1	30	localException3	Exception
    //   805	1	30	localObject14	Object
    //   363	429	31	n	int
    //   366	429	32	str1	String
    //   370	168	33	str2	String
    //   813	1	33	localException4	Exception
    //   419	32	34	arrayOfString	String[]
    //   544	5	35	i1	int
    //   559	55	35	i2	int
    //   723	3	35	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   355	360	697	java/lang/Exception
    //   375	378	697	java/lang/Exception
    //   389	392	697	java/lang/Exception
    //   394	399	697	java/lang/Exception
    //   414	419	697	java/lang/Exception
    //   430	432	697	java/lang/Exception
    //   439	441	697	java/lang/Exception
    //   454	458	697	java/lang/Exception
    //   355	360	749	finally
    //   375	378	749	finally
    //   389	392	749	finally
    //   394	399	749	finally
    //   414	419	749	finally
    //   430	432	749	finally
    //   439	441	749	finally
    //   454	458	749	finally
    //   465	472	766	finally
    //   485	492	766	finally
    //   496	503	766	finally
    //   511	518	766	finally
    //   522	529	766	finally
    //   537	544	766	finally
    //   548	556	766	finally
    //   556	559	766	finally
    //   720	723	766	finally
    //   465	472	779	java/lang/Exception
    //   485	492	779	java/lang/Exception
    //   496	503	779	java/lang/Exception
    //   511	518	799	java/lang/Exception
    //   522	529	799	java/lang/Exception
    //   537	544	813	java/lang/Exception
    //   548	556	813	java/lang/Exception
    //   556	559	813	java/lang/Exception
  }
  
  private static String a()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("messages._id, ");
    localStringBuilder.append("messages.thread_id, ");
    localStringBuilder.append("messages.extra_mime, ");
    localStringBuilder.append("groups.name as conversation_name, ");
    localStringBuilder.append("messages.address as contact, ");
    localStringBuilder.append("messages.date, ");
    localStringBuilder.append("messages.status, ");
    localStringBuilder.append("messages.type as direction, ");
    localStringBuilder.append("messages.subject, ");
    localStringBuilder.append("messages.body, ");
    localStringBuilder.append("messages.token, ");
    localStringBuilder.append("messages.location_lat, ");
    localStringBuilder.append("messages.location_lng, ");
    localStringBuilder.append("messages.extra_upload_id, ");
    localStringBuilder.append("messages.extra_uri, ");
    localStringBuilder.append("messages.description, ");
    localStringBuilder.append("messages.extra_bucket_name ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("LEFT JOIN (");
    localStringBuilder.append("SELECT groups.thread_id, groups.name ");
    localStringBuilder.append("FROM groups");
    localStringBuilder.append(") as groups ");
    localStringBuilder.append("ON messages.thread_id = groups.thread_id ");
    localStringBuilder.append("where messages._id > ? AND messages._id <= ?");
    localStringBuilder.append("ORDER BY _id DESC ");
    localStringBuilder.append("LIMIT ?");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static String a(com.vvt.af.a.a parama, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: ldc -11
    //   6: astore 4
    //   8: iload_2
    //   9: anewarray 4	java/lang/Object
    //   12: astore 5
    //   14: ldc -85
    //   16: astore 6
    //   18: aload 5
    //   20: iconst_0
    //   21: aload 6
    //   23: aastore
    //   24: aload 4
    //   26: aload 5
    //   28: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   31: astore 7
    //   33: iload_2
    //   34: anewarray 28	java/lang/String
    //   37: astore 8
    //   39: aload 8
    //   41: iconst_0
    //   42: aload_1
    //   43: aastore
    //   44: ldc -9
    //   46: astore 9
    //   48: aload_0
    //   49: ifnull +255 -> 304
    //   52: ldc -83
    //   54: astore 5
    //   56: iconst_0
    //   57: istore 10
    //   59: aconst_null
    //   60: astore 6
    //   62: aload_0
    //   63: astore 4
    //   65: aload_0
    //   66: aload 5
    //   68: aconst_null
    //   69: aload 7
    //   71: aload 8
    //   73: aconst_null
    //   74: aconst_null
    //   75: aload 9
    //   77: invokevirtual 39	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   80: astore 4
    //   82: aload 4
    //   84: ifnull +207 -> 291
    //   87: aload 4
    //   89: invokeinterface 45 1 0
    //   94: istore 11
    //   96: iload 11
    //   98: ifeq +193 -> 291
    //   101: ldc -81
    //   103: astore 5
    //   105: aload 4
    //   107: aload 5
    //   109: invokeinterface 51 2 0
    //   114: istore 11
    //   116: aload 4
    //   118: iload 11
    //   120: invokeinterface 55 2 0
    //   125: astore 5
    //   127: ldc -79
    //   129: astore 6
    //   131: aload 4
    //   133: aload 6
    //   135: invokeinterface 51 2 0
    //   140: istore 10
    //   142: aload 4
    //   144: iload 10
    //   146: invokeinterface 55 2 0
    //   151: astore 6
    //   153: aload 5
    //   155: ifnull +35 -> 190
    //   158: aload 5
    //   160: invokevirtual 63	java/lang/String:length	()I
    //   163: istore 12
    //   165: iload 12
    //   167: ifle +23 -> 190
    //   170: aload 4
    //   172: astore_3
    //   173: aload 5
    //   175: astore 4
    //   177: aload_3
    //   178: ifnull +9 -> 187
    //   181: aload_3
    //   182: invokeinterface 59 1 0
    //   187: aload 4
    //   189: areturn
    //   190: aload 6
    //   192: ifnull +25 -> 217
    //   195: aload 6
    //   197: invokevirtual 63	java/lang/String:length	()I
    //   200: istore 11
    //   202: iload 11
    //   204: ifle +13 -> 217
    //   207: aload 4
    //   209: astore_3
    //   210: aload 6
    //   212: astore 4
    //   214: goto -37 -> 177
    //   217: aload 4
    //   219: astore_3
    //   220: aload_1
    //   221: astore 4
    //   223: goto -46 -> 177
    //   226: astore 4
    //   228: aconst_null
    //   229: astore 4
    //   231: getstatic 22	com/vvt/capture/viber/mode/full/j:MyUncaughtExceptionHandler	Z
    //   234: istore 11
    //   236: iload 11
    //   238: ifeq +3 -> 241
    //   241: aload 4
    //   243: ifnull +10 -> 253
    //   246: aload 4
    //   248: invokeinterface 59 1 0
    //   253: aconst_null
    //   254: astore 4
    //   256: goto -69 -> 187
    //   259: astore 4
    //   261: aload_3
    //   262: ifnull +9 -> 271
    //   265: aload_3
    //   266: invokeinterface 59 1 0
    //   271: aload 4
    //   273: athrow
    //   274: astore 5
    //   276: aload 4
    //   278: astore_3
    //   279: aload 5
    //   281: astore 4
    //   283: goto -22 -> 261
    //   286: astore 5
    //   288: goto -57 -> 231
    //   291: aload 4
    //   293: astore 13
    //   295: aconst_null
    //   296: astore 4
    //   298: aload 13
    //   300: astore_3
    //   301: goto -124 -> 177
    //   304: aconst_null
    //   305: astore 4
    //   307: goto -130 -> 177
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	310	0	parama	com.vvt.af.a.a
    //   0	310	1	paramString	String
    //   1	33	2	i	int
    //   3	298	3	localObject1	Object
    //   6	216	4	localObject2	Object
    //   226	1	4	localException1	Exception
    //   229	26	4	localObject3	Object
    //   259	18	4	localObject4	Object
    //   281	25	4	localObject5	Object
    //   12	162	5	localObject6	Object
    //   274	6	5	localObject7	Object
    //   286	1	5	localException2	Exception
    //   16	195	6	str1	String
    //   31	39	7	str2	String
    //   37	35	8	arrayOfString	String[]
    //   46	30	9	str3	String
    //   57	88	10	j	int
    //   94	3	11	bool1	boolean
    //   114	89	11	k	int
    //   234	3	11	bool2	boolean
    //   163	3	12	m	int
    //   293	6	13	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   75	80	226	java/lang/Exception
    //   75	80	259	finally
    //   87	94	274	finally
    //   107	114	274	finally
    //   118	125	274	finally
    //   133	140	274	finally
    //   144	151	274	finally
    //   158	163	274	finally
    //   195	200	274	finally
    //   231	234	274	finally
    //   87	94	286	java/lang/Exception
    //   107	114	286	java/lang/Exception
    //   118	125	286	java/lang/Exception
    //   133	140	286	java/lang/Exception
    //   144	151	286	java/lang/Exception
    //   158	163	286	java/lang/Exception
    //   195	200	286	java/lang/Exception
  }
  
  /* Error */
  private static ArrayList a(com.vvt.af.a.a parama, String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3, d paramd, b paramb)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   3: istore 10
    //   5: iload 10
    //   7: ifeq +3 -> 10
    //   10: new 249	java/util/ArrayList
    //   13: astore 11
    //   15: aload 11
    //   17: invokespecial 250	java/util/ArrayList:<init>	()V
    //   20: iconst_0
    //   21: istore 10
    //   23: aconst_null
    //   24: astore 12
    //   26: invokestatic 251	com/vvt/capture/viber/mode/full/j:a	()Ljava/lang/String;
    //   29: astore 13
    //   31: iconst_3
    //   32: istore 14
    //   34: iload 14
    //   36: anewarray 28	java/lang/String
    //   39: astore 15
    //   41: iconst_0
    //   42: istore 16
    //   44: fconst_0
    //   45: fstore 17
    //   47: aconst_null
    //   48: astore 18
    //   50: lload_2
    //   51: invokestatic 257	java/lang/Long:toString	(J)Ljava/lang/String;
    //   54: astore 19
    //   56: aload 15
    //   58: iconst_0
    //   59: aload 19
    //   61: aastore
    //   62: iconst_1
    //   63: istore 16
    //   65: ldc 13
    //   67: fstore 17
    //   69: lload 4
    //   71: invokestatic 257	java/lang/Long:toString	(J)Ljava/lang/String;
    //   74: astore 19
    //   76: aload 15
    //   78: iload 16
    //   80: aload 19
    //   82: aastore
    //   83: iconst_2
    //   84: istore 16
    //   86: ldc 103
    //   88: fstore 17
    //   90: iconst_m1
    //   91: iconst_1
    //   92: iushr
    //   93: istore 20
    //   95: iload 20
    //   97: invokestatic 261	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   100: astore 19
    //   102: aload 15
    //   104: iload 16
    //   106: aload 19
    //   108: aastore
    //   109: aload_0
    //   110: astore 21
    //   112: aload_0
    //   113: aload 13
    //   115: aload 15
    //   117: invokevirtual 264	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   120: astore 22
    //   122: aload 22
    //   124: ifnull +1511 -> 1635
    //   127: aload 22
    //   129: invokeinterface 267 1 0
    //   134: istore 10
    //   136: iload 10
    //   138: ifeq +1497 -> 1635
    //   141: aload_1
    //   142: astore 21
    //   144: aload_1
    //   145: aload 6
    //   147: aload 7
    //   149: invokestatic 270	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/im/events/info/d;
    //   152: astore 19
    //   154: ldc_w 272
    //   157: astore 12
    //   159: aload 22
    //   161: astore 21
    //   163: aload 22
    //   165: aload 12
    //   167: invokeinterface 51 2 0
    //   172: istore 10
    //   174: aload 22
    //   176: iload 10
    //   178: invokeinterface 276 2 0
    //   183: istore 23
    //   185: ldc 26
    //   187: astore 12
    //   189: aload 22
    //   191: aload 12
    //   193: invokeinterface 51 2 0
    //   198: istore 10
    //   200: aload 22
    //   202: iload 10
    //   204: invokeinterface 55 2 0
    //   209: astore 15
    //   211: ldc 110
    //   213: astore 12
    //   215: aload 22
    //   217: aload 12
    //   219: invokeinterface 51 2 0
    //   224: istore 10
    //   226: aload 22
    //   228: iload 10
    //   230: invokeinterface 55 2 0
    //   235: astore 24
    //   237: ldc_w 278
    //   240: astore 12
    //   242: aload 22
    //   244: aload 12
    //   246: invokeinterface 51 2 0
    //   251: istore 10
    //   253: aload 22
    //   255: iload 10
    //   257: invokeinterface 55 2 0
    //   262: pop
    //   263: ldc_w 280
    //   266: astore 12
    //   268: aload 22
    //   270: aload 12
    //   272: invokeinterface 51 2 0
    //   277: istore 10
    //   279: aload 22
    //   281: iload 10
    //   283: invokeinterface 55 2 0
    //   288: astore 18
    //   290: ldc_w 282
    //   293: astore 12
    //   295: aload 22
    //   297: aload 12
    //   299: invokeinterface 51 2 0
    //   304: istore 10
    //   306: aload 22
    //   308: iload 10
    //   310: invokeinterface 286 2 0
    //   315: lstore 25
    //   317: ldc_w 288
    //   320: astore 12
    //   322: aload 22
    //   324: aload 12
    //   326: invokeinterface 51 2 0
    //   331: istore 10
    //   333: aload 22
    //   335: iload 10
    //   337: invokeinterface 276 2 0
    //   342: istore 27
    //   344: ldc_w 290
    //   347: astore 12
    //   349: aload 22
    //   351: aload 12
    //   353: invokeinterface 51 2 0
    //   358: istore 10
    //   360: aload 22
    //   362: iload 10
    //   364: invokeinterface 276 2 0
    //   369: istore 10
    //   371: iload 10
    //   373: ifne +701 -> 1074
    //   376: getstatic 293	com/vvt/im/events/info/ICallLogData$Direction:IN	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   379: astore 28
    //   381: ldc_w 295
    //   384: astore 12
    //   386: aload 22
    //   388: astore 21
    //   390: aload 22
    //   392: aload 12
    //   394: invokeinterface 51 2 0
    //   399: istore 10
    //   401: aload 22
    //   403: iload 10
    //   405: invokeinterface 55 2 0
    //   410: pop
    //   411: ldc_w 297
    //   414: astore 12
    //   416: aload 22
    //   418: aload 12
    //   420: invokeinterface 51 2 0
    //   425: istore 10
    //   427: aload 22
    //   429: iload 10
    //   431: invokeinterface 55 2 0
    //   436: astore 12
    //   438: ldc_w 299
    //   441: astore 13
    //   443: aload 22
    //   445: aload 13
    //   447: invokeinterface 51 2 0
    //   452: istore 29
    //   454: aload 22
    //   456: iload 29
    //   458: invokeinterface 55 2 0
    //   463: pop
    //   464: ldc 121
    //   466: astore 13
    //   468: aload 22
    //   470: aload 13
    //   472: invokeinterface 51 2 0
    //   477: istore 29
    //   479: aload 22
    //   481: iload 29
    //   483: invokeinterface 286 2 0
    //   488: lstore 30
    //   490: lload 30
    //   492: l2d
    //   493: dstore 32
    //   495: ldc2_w 125
    //   498: lstore 34
    //   500: ldc2_w 127
    //   503: dstore 36
    //   505: dload 32
    //   507: dload 36
    //   509: ddiv
    //   510: dstore 32
    //   512: ldc -126
    //   514: astore 13
    //   516: aload 22
    //   518: aload 13
    //   520: invokeinterface 51 2 0
    //   525: istore 29
    //   527: aload 22
    //   529: iload 29
    //   531: invokeinterface 286 2 0
    //   536: lstore 34
    //   538: lload 34
    //   540: l2d
    //   541: dstore 36
    //   543: ldc2_w 127
    //   546: dstore 38
    //   548: dload 36
    //   550: dload 38
    //   552: ddiv
    //   553: dstore 36
    //   555: ldc_w 301
    //   558: astore 13
    //   560: aload 22
    //   562: aload 13
    //   564: invokeinterface 51 2 0
    //   569: istore 29
    //   571: aload 22
    //   573: iload 29
    //   575: invokeinterface 286 2 0
    //   580: lstore 40
    //   582: ldc_w 303
    //   585: astore 13
    //   587: aload 22
    //   589: aload 13
    //   591: invokeinterface 51 2 0
    //   596: istore 29
    //   598: aload 22
    //   600: iload 29
    //   602: invokeinterface 55 2 0
    //   607: astore 42
    //   609: ldc_w 305
    //   612: astore 13
    //   614: aload 22
    //   616: aload 13
    //   618: invokeinterface 51 2 0
    //   623: istore 29
    //   625: aload 22
    //   627: iload 29
    //   629: invokeinterface 55 2 0
    //   634: astore 43
    //   636: ldc_w 307
    //   639: astore 13
    //   641: aload 22
    //   643: aload 13
    //   645: invokeinterface 51 2 0
    //   650: istore 29
    //   652: aload 22
    //   654: iload 29
    //   656: invokeinterface 55 2 0
    //   661: astore 44
    //   663: new 309	java/text/SimpleDateFormat
    //   666: astore 13
    //   668: ldc_w 311
    //   671: astore 45
    //   673: aload 45
    //   675: astore 21
    //   677: aload 13
    //   679: aload 45
    //   681: invokespecial 313	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   684: new 315	java/util/Date
    //   687: astore 45
    //   689: aload 45
    //   691: astore 21
    //   693: aload 45
    //   695: lload 25
    //   697: invokespecial 318	java/util/Date:<init>	(J)V
    //   700: aload 13
    //   702: aload 45
    //   704: invokevirtual 321	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   707: astore 46
    //   709: aload 12
    //   711: ifnull +122 -> 833
    //   714: ldc_w 323
    //   717: astore 13
    //   719: aload 12
    //   721: aload 13
    //   723: invokevirtual 327	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   726: istore 29
    //   728: iload 29
    //   730: ifeq +103 -> 833
    //   733: ldc_w 329
    //   736: astore 13
    //   738: aload 12
    //   740: aload 13
    //   742: invokevirtual 333	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   745: astore 13
    //   747: iconst_1
    //   748: istore 47
    //   750: aload 13
    //   752: iload 47
    //   754: aaload
    //   755: astore 45
    //   757: aload_0
    //   758: astore 21
    //   760: aload_0
    //   761: aload 45
    //   763: invokestatic 336	com/vvt/capture/viber/mode/full/j:a	(Lcom/vvt/af/a/a;Ljava/lang/String;)Ljava/lang/String;
    //   766: astore 45
    //   768: aload 45
    //   770: ifnull +63 -> 833
    //   773: ldc_w 338
    //   776: astore 48
    //   778: iconst_2
    //   779: istore 49
    //   781: iload 49
    //   783: anewarray 4	java/lang/Object
    //   786: astore 21
    //   788: aload 21
    //   790: astore 50
    //   792: iconst_0
    //   793: istore 51
    //   795: aconst_null
    //   796: astore 52
    //   798: aload 21
    //   800: iconst_0
    //   801: aload 45
    //   803: aastore
    //   804: iconst_1
    //   805: istore 47
    //   807: iconst_3
    //   808: istore 51
    //   810: aload 13
    //   812: iload 51
    //   814: aaload
    //   815: astore 13
    //   817: aload 21
    //   819: iload 47
    //   821: aload 13
    //   823: aastore
    //   824: aload 48
    //   826: aload 21
    //   828: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   831: astore 12
    //   833: aload 12
    //   835: astore 45
    //   837: aload_0
    //   838: astore 12
    //   840: aload_1
    //   841: astore 13
    //   843: aload_0
    //   844: aload_1
    //   845: aload 15
    //   847: aload 18
    //   849: aload 19
    //   851: aload 28
    //   853: iload 23
    //   855: iload 27
    //   857: dload 32
    //   859: dload 36
    //   861: aload 24
    //   863: invokestatic 341	com/vvt/capture/viber/mode/full/j:a	(Lcom/vvt/af/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vvt/im/events/info/d;Lcom/vvt/im/events/info/ICallLogData$Direction;IIDDLjava/lang/String;)Lcom/vvt/im/events/info/f;
    //   866: astore 48
    //   868: new 249	java/util/ArrayList
    //   871: astore 12
    //   873: aload 12
    //   875: invokespecial 250	java/util/ArrayList:<init>	()V
    //   878: aload 9
    //   880: invokevirtual 346	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   883: astore 12
    //   885: aload_0
    //   886: astore 21
    //   888: aload_0
    //   889: aload_1
    //   890: aload 15
    //   892: aload 8
    //   894: aload 12
    //   896: invokestatic 349	com/vvt/capture/viber/mode/full/j:a	(Lcom/vvt/af/a/a;Ljava/lang/String;Ljava/lang/String;Lcom/vvt/AppEngine1/d;Ljava/lang/String;)Ljava/util/List;
    //   899: astore 50
    //   901: aload_0
    //   902: aload_1
    //   903: aload 15
    //   905: aload 50
    //   907: invokestatic 352	com/vvt/capture/viber/mode/full/j:a	(Lcom/vvt/af/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/vvt/im/events/info/removeFromPath;
    //   910: astore 52
    //   912: new 132	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   915: astore 12
    //   917: aload 12
    //   919: invokespecial 133	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   922: iconst_0
    //   923: istore 29
    //   925: aconst_null
    //   926: astore 13
    //   928: aload 24
    //   930: ifnull +764 -> 1694
    //   933: aload 24
    //   935: invokevirtual 63	java/lang/String:length	()I
    //   938: istore 14
    //   940: iload 14
    //   942: ifle +752 -> 1694
    //   945: aload 24
    //   947: invokestatic 358	com/vvt/capture/viber/mode/full/ViberMessageType:forValue	(Ljava/lang/String;)Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   950: astore 24
    //   952: aload 24
    //   954: ifnonnull +8 -> 962
    //   957: getstatic 362	com/vvt/capture/viber/mode/full/ViberMessageType:TEXT	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   960: astore 24
    //   962: new 249	java/util/ArrayList
    //   965: astore 13
    //   967: aload 13
    //   969: invokespecial 250	java/util/ArrayList:<init>	()V
    //   972: getstatic 365	com/vvt/capture/viber/mode/full/ViberMessageType:IMAGE	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   975: astore 15
    //   977: aload 24
    //   979: aload 15
    //   981: if_acmpeq +15 -> 996
    //   984: getstatic 368	com/vvt/capture/viber/mode/full/ViberMessageType:VIDEO	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   987: astore 15
    //   989: aload 24
    //   991: aload 15
    //   993: if_acmpne +108 -> 1101
    //   996: aload 8
    //   998: invokeinterface 373 1 0
    //   1003: astore 43
    //   1005: aload_0
    //   1006: astore 53
    //   1008: aload 45
    //   1010: astore 54
    //   1012: aload 9
    //   1014: astore 45
    //   1016: aload_0
    //   1017: aload_1
    //   1018: aload 54
    //   1020: aload 42
    //   1022: iload 23
    //   1024: aload 24
    //   1026: aload 43
    //   1028: aload 9
    //   1030: invokestatic 376	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/vvt/capture/viber/mode/full/ViberMessageType;Landroid/content/Context;Lcom/vvt/base/removeFromPath;)Ljava/util/List;
    //   1033: astore 13
    //   1035: aload 13
    //   1037: invokeinterface 68 1 0
    //   1042: istore 14
    //   1044: iload 14
    //   1046: ifgt +641 -> 1687
    //   1049: aload 44
    //   1051: invokestatic 381	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1054: istore 14
    //   1056: iload 14
    //   1058: ifeq +629 -> 1687
    //   1061: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   1064: istore 10
    //   1066: iload 10
    //   1068: ifeq -941 -> 127
    //   1071: goto -944 -> 127
    //   1074: getstatic 139	com/vvt/im/events/info/ICallLogData$Direction:OUT	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   1077: astore 28
    //   1079: goto -698 -> 381
    //   1082: astore 13
    //   1084: getstatic 22	com/vvt/capture/viber/mode/full/j:MyUncaughtExceptionHandler	Z
    //   1087: istore 29
    //   1089: iload 29
    //   1091: ifeq +3 -> 1094
    //   1094: aload 12
    //   1096: astore 45
    //   1098: goto -261 -> 837
    //   1101: getstatic 384	com/vvt/capture/viber/mode/full/ViberMessageType:LOCATION	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   1104: astore 15
    //   1106: aload 24
    //   1108: aload 15
    //   1110: if_acmpne +454 -> 1564
    //   1113: dconst_0
    //   1114: dstore 55
    //   1116: dload 32
    //   1118: dload 55
    //   1120: dcmpl
    //   1121: istore 14
    //   1123: iload 14
    //   1125: ifeq +312 -> 1437
    //   1128: dconst_0
    //   1129: dstore 55
    //   1131: dload 36
    //   1133: dload 55
    //   1135: dcmpl
    //   1136: istore 14
    //   1138: iload 14
    //   1140: ifeq +297 -> 1437
    //   1143: aload 43
    //   1145: ifnonnull +535 -> 1680
    //   1148: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   1151: istore 14
    //   1153: iload 14
    //   1155: ifeq +3 -> 1158
    //   1158: ldc_w 305
    //   1161: astore 15
    //   1163: iconst_1
    //   1164: istore 16
    //   1166: ldc 13
    //   1168: fstore 17
    //   1170: aload_0
    //   1171: astore 21
    //   1173: aload_0
    //   1174: iload 23
    //   1176: aload 15
    //   1178: iload 16
    //   1180: invokestatic 387	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;ILjava/lang/String;I)Ljava/lang/String;
    //   1183: astore 15
    //   1185: aload 12
    //   1187: dload 32
    //   1189: invokevirtual 160	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
    //   1192: aload 12
    //   1194: dload 36
    //   1196: invokevirtual 162	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   1199: ldc -93
    //   1201: istore 16
    //   1203: ldc -92
    //   1205: fstore 17
    //   1207: aload 12
    //   1209: fload 17
    //   1211: invokevirtual 167	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(F)V
    //   1214: aload 12
    //   1216: aload 15
    //   1218: invokevirtual 388	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   1221: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   1224: istore 14
    //   1226: iload 14
    //   1228: ifeq +445 -> 1673
    //   1231: aload 45
    //   1233: astore 15
    //   1235: aload 15
    //   1237: aload 24
    //   1239: invokestatic 391	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/capture/viber/mode/full/ViberMessageType;)I
    //   1242: istore 16
    //   1244: new 393	com/vvt/capture/viber/d
    //   1247: astore 53
    //   1249: aload 53
    //   1251: invokespecial 394	com/vvt/capture/viber/d:<init>	()V
    //   1254: aload 53
    //   1256: iload 16
    //   1258: invokevirtual 397	com/vvt/capture/viber/d:a	(I)V
    //   1261: aload 53
    //   1263: aload 15
    //   1265: invokevirtual 398	com/vvt/capture/viber/d:a	(Ljava/lang/String;)V
    //   1268: aload 46
    //   1270: astore 21
    //   1272: aload 53
    //   1274: aload 46
    //   1276: invokevirtual 399	com/vvt/capture/viber/d:removeFromPath	(Ljava/lang/String;)V
    //   1279: iload 23
    //   1281: invokestatic 261	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1284: astore 15
    //   1286: aload 53
    //   1288: aload 15
    //   1290: invokevirtual 400	com/vvt/capture/viber/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   1293: aload 53
    //   1295: aload 19
    //   1297: invokevirtual 403	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/d;)V
    //   1300: aload 50
    //   1302: astore 21
    //   1304: aload 53
    //   1306: aload 50
    //   1308: invokevirtual 406	com/vvt/capture/viber/d:a	(Ljava/util/List;)V
    //   1311: aload 48
    //   1313: astore 21
    //   1315: aload 53
    //   1317: aload 48
    //   1319: invokevirtual 409	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/f;)V
    //   1322: aload 52
    //   1324: astore 21
    //   1326: aload 53
    //   1328: aload 52
    //   1330: invokevirtual 412	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/removeFromPath;)V
    //   1333: aload 53
    //   1335: lload 25
    //   1337: invokevirtual 414	com/vvt/capture/viber/d:removeFromPath	(J)V
    //   1340: aload 53
    //   1342: aload 28
    //   1344: invokevirtual 417	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/ICallLogData$Direction;)V
    //   1347: aload 53
    //   1349: aload 13
    //   1351: invokevirtual 419	com/vvt/capture/viber/d:removeFromPath	(Ljava/util/List;)V
    //   1354: aload 53
    //   1356: aload 12
    //   1358: invokevirtual 420	com/vvt/capture/viber/d:a	(Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;)V
    //   1361: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   1364: istore 10
    //   1366: iload 10
    //   1368: ifeq +3 -> 1371
    //   1371: aload 11
    //   1373: astore 21
    //   1375: aload 11
    //   1377: aload 53
    //   1379: invokevirtual 423	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1382: pop
    //   1383: goto -1256 -> 127
    //   1386: astore 12
    //   1388: aload 22
    //   1390: astore 12
    //   1392: getstatic 22	com/vvt/capture/viber/mode/full/j:MyUncaughtExceptionHandler	Z
    //   1395: istore 29
    //   1397: iload 29
    //   1399: ifeq +3 -> 1402
    //   1402: aload 12
    //   1404: ifnull +10 -> 1414
    //   1407: aload 12
    //   1409: invokeinterface 59 1 0
    //   1414: getstatic 17	com/vvt/capture/viber/mode/full/j:removeFromPath	Z
    //   1417: istore 10
    //   1419: iload 10
    //   1421: ifeq +3 -> 1424
    //   1424: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   1427: istore 10
    //   1429: iload 10
    //   1431: ifeq +3 -> 1434
    //   1434: aload 11
    //   1436: areturn
    //   1437: aload_0
    //   1438: astore 21
    //   1440: aload_0
    //   1441: iload 23
    //   1443: invokestatic 426	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;I)Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;
    //   1446: astore 15
    //   1448: iconst_0
    //   1449: istore 10
    //   1451: aload 15
    //   1453: astore 12
    //   1455: iconst_0
    //   1456: istore 14
    //   1458: aconst_null
    //   1459: astore 15
    //   1461: aload 12
    //   1463: invokevirtual 429	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	()D
    //   1466: dstore 57
    //   1468: dconst_0
    //   1469: dstore 59
    //   1471: dload 57
    //   1473: dload 59
    //   1475: dcmpl
    //   1476: istore 16
    //   1478: iload 16
    //   1480: ifne -259 -> 1221
    //   1483: aload 12
    //   1485: invokevirtual 431	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	()D
    //   1488: dstore 57
    //   1490: dconst_0
    //   1491: dstore 59
    //   1493: dload 57
    //   1495: dload 59
    //   1497: dcmpl
    //   1498: istore 16
    //   1500: iload 16
    //   1502: ifne -281 -> 1221
    //   1505: bipush 18
    //   1507: istore 16
    //   1509: ldc_w 432
    //   1512: fstore 17
    //   1514: iload 14
    //   1516: iload 16
    //   1518: if_icmpge -297 -> 1221
    //   1521: ldc2_w 433
    //   1524: lstore 61
    //   1526: ldc2_w 435
    //   1529: dstore 57
    //   1531: lload 61
    //   1533: invokestatic 441	android/os/SystemClock:sleep	(J)V
    //   1536: aload_0
    //   1537: astore 21
    //   1539: aload_0
    //   1540: iload 23
    //   1542: invokestatic 426	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;I)Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;
    //   1545: astore 18
    //   1547: iload 14
    //   1549: iconst_1
    //   1550: iadd
    //   1551: istore 10
    //   1553: iload 10
    //   1555: istore 14
    //   1557: aload 18
    //   1559: astore 12
    //   1561: goto -100 -> 1461
    //   1564: getstatic 444	com/vvt/capture/viber/mode/full/ViberMessageType:STICKER	Lcom/vvt/capture/viber/mode/full/ViberMessageType;
    //   1567: astore 15
    //   1569: aload 24
    //   1571: aload 15
    //   1573: if_acmpne +100 -> 1673
    //   1576: iconst_0
    //   1577: istore 14
    //   1579: aconst_null
    //   1580: astore 15
    //   1582: aload 9
    //   1584: invokevirtual 346	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   1587: astore 42
    //   1589: aload_0
    //   1590: astore 43
    //   1592: aload_1
    //   1593: astore 45
    //   1595: aload_0
    //   1596: aload_1
    //   1597: lload 40
    //   1599: iload 23
    //   1601: aload 42
    //   1603: invokestatic 447	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Lcom/vvt/af/a/a;Ljava/lang/String;JILjava/lang/String;)Ljava/util/List;
    //   1606: astore 13
    //   1608: goto -373 -> 1235
    //   1611: astore 13
    //   1613: aconst_null
    //   1614: astore 22
    //   1616: aload 13
    //   1618: astore 12
    //   1620: aload 22
    //   1622: ifnull +10 -> 1632
    //   1625: aload 22
    //   1627: invokeinterface 59 1 0
    //   1632: aload 12
    //   1634: athrow
    //   1635: aload 22
    //   1637: ifnull -223 -> 1414
    //   1640: aload 22
    //   1642: invokeinterface 59 1 0
    //   1647: goto -233 -> 1414
    //   1650: astore 12
    //   1652: goto -32 -> 1620
    //   1655: astore 13
    //   1657: aload 12
    //   1659: astore 22
    //   1661: aload 13
    //   1663: astore 12
    //   1665: goto -45 -> 1620
    //   1668: astore 13
    //   1670: goto -278 -> 1392
    //   1673: aload 45
    //   1675: astore 15
    //   1677: goto -442 -> 1235
    //   1680: aload 43
    //   1682: astore 15
    //   1684: goto -499 -> 1185
    //   1687: aload 44
    //   1689: astore 15
    //   1691: goto -456 -> 1235
    //   1694: aconst_null
    //   1695: astore 24
    //   1697: goto -745 -> 952
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1700	0	parama	com.vvt.af.a.a
    //   0	1700	1	paramString1	String
    //   0	1700	2	paramLong1	long
    //   0	1700	4	paramLong2	long
    //   0	1700	6	paramString2	String
    //   0	1700	7	paramString3	String
    //   0	1700	8	paramd	d
    //   0	1700	9	paramb	removeFromPath
    //   3	134	10	bool1	boolean
    //   172	258	10	i	int
    //   1064	386	10	bool2	boolean
    //   1551	3	10	j	int
    //   13	1422	11	localArrayList	ArrayList
    //   24	1333	12	localObject1	Object
    //   1386	1	12	localException1	Exception
    //   1390	243	12	localObject2	Object
    //   1650	8	12	localObject3	Object
    //   1663	1	12	localObject4	Object
    //   29	1007	13	localObject5	Object
    //   1082	268	13	localException2	Exception
    //   1606	1	13	localList	java.util.List
    //   1611	6	13	localObject6	Object
    //   1655	7	13	localObject7	Object
    //   1668	1	13	localException3	Exception
    //   32	1013	14	k	int
    //   1054	524	14	m	int
    //   39	1651	15	localObject8	Object
    //   42	1215	16	n	int
    //   1476	25	16	bool3	boolean
    //   1507	12	16	i1	int
    //   45	1468	17	f	float
    //   48	1510	18	localObject9	Object
    //   54	1242	19	localObject10	Object
    //   93	3	20	i2	int
    //   110	1428	21	localObject11	Object
    //   120	1540	22	localObject12	Object
    //   183	1417	23	i3	int
    //   235	1461	24	localObject13	Object
    //   315	1021	25	l1	long
    //   342	514	27	i4	int
    //   379	964	28	localDirection	com.vvt.im.events.info.ICallLogData.Direction
    //   452	203	29	i5	int
    //   726	672	29	bool4	boolean
    //   488	3	30	l2	long
    //   493	695	32	d1	double
    //   498	41	34	l3	long
    //   503	692	36	d2	double
    //   546	5	38	d3	double
    //   580	1018	40	l4	long
    //   607	995	42	str1	String
    //   634	1047	43	localObject14	Object
    //   661	1027	44	str2	String
    //   671	1003	45	localObject15	Object
    //   707	568	46	str3	String
    //   748	72	47	i6	int
    //   776	542	48	localObject16	Object
    //   779	3	49	i7	int
    //   790	517	50	localObject17	Object
    //   793	20	51	i8	int
    //   796	533	52	localb	com.vvt.im.events.info.removeFromPath
    //   1006	372	53	localObject18	Object
    //   1010	9	54	localObject19	Object
    //   1114	20	55	d4	double
    //   1466	64	57	d5	double
    //   1469	27	59	d6	double
    //   1524	8	61	l5	long
    // Exception table:
    //   from	to	target	type
    //   721	726	1082	java/lang/Exception
    //   740	745	1082	java/lang/Exception
    //   752	755	1082	java/lang/Exception
    //   761	766	1082	java/lang/Exception
    //   781	786	1082	java/lang/Exception
    //   801	804	1082	java/lang/Exception
    //   812	815	1082	java/lang/Exception
    //   821	824	1082	java/lang/Exception
    //   826	831	1082	java/lang/Exception
    //   127	134	1386	java/lang/Exception
    //   147	152	1386	java/lang/Exception
    //   165	172	1386	java/lang/Exception
    //   176	183	1386	java/lang/Exception
    //   191	198	1386	java/lang/Exception
    //   202	209	1386	java/lang/Exception
    //   217	224	1386	java/lang/Exception
    //   228	235	1386	java/lang/Exception
    //   244	251	1386	java/lang/Exception
    //   255	263	1386	java/lang/Exception
    //   270	277	1386	java/lang/Exception
    //   281	288	1386	java/lang/Exception
    //   297	304	1386	java/lang/Exception
    //   308	315	1386	java/lang/Exception
    //   324	331	1386	java/lang/Exception
    //   335	342	1386	java/lang/Exception
    //   351	358	1386	java/lang/Exception
    //   362	369	1386	java/lang/Exception
    //   376	379	1386	java/lang/Exception
    //   392	399	1386	java/lang/Exception
    //   403	411	1386	java/lang/Exception
    //   418	425	1386	java/lang/Exception
    //   429	436	1386	java/lang/Exception
    //   445	452	1386	java/lang/Exception
    //   456	464	1386	java/lang/Exception
    //   470	477	1386	java/lang/Exception
    //   481	488	1386	java/lang/Exception
    //   518	525	1386	java/lang/Exception
    //   529	536	1386	java/lang/Exception
    //   562	569	1386	java/lang/Exception
    //   573	580	1386	java/lang/Exception
    //   589	596	1386	java/lang/Exception
    //   600	607	1386	java/lang/Exception
    //   616	623	1386	java/lang/Exception
    //   627	634	1386	java/lang/Exception
    //   643	650	1386	java/lang/Exception
    //   654	661	1386	java/lang/Exception
    //   663	666	1386	java/lang/Exception
    //   679	684	1386	java/lang/Exception
    //   684	687	1386	java/lang/Exception
    //   695	700	1386	java/lang/Exception
    //   702	707	1386	java/lang/Exception
    //   861	866	1386	java/lang/Exception
    //   868	871	1386	java/lang/Exception
    //   873	878	1386	java/lang/Exception
    //   878	883	1386	java/lang/Exception
    //   894	899	1386	java/lang/Exception
    //   905	910	1386	java/lang/Exception
    //   912	915	1386	java/lang/Exception
    //   917	922	1386	java/lang/Exception
    //   933	938	1386	java/lang/Exception
    //   945	950	1386	java/lang/Exception
    //   957	960	1386	java/lang/Exception
    //   962	965	1386	java/lang/Exception
    //   967	972	1386	java/lang/Exception
    //   972	975	1386	java/lang/Exception
    //   984	987	1386	java/lang/Exception
    //   996	1003	1386	java/lang/Exception
    //   1028	1033	1386	java/lang/Exception
    //   1035	1042	1386	java/lang/Exception
    //   1049	1054	1386	java/lang/Exception
    //   1061	1064	1386	java/lang/Exception
    //   1074	1077	1386	java/lang/Exception
    //   1084	1087	1386	java/lang/Exception
    //   1101	1104	1386	java/lang/Exception
    //   1148	1151	1386	java/lang/Exception
    //   1178	1183	1386	java/lang/Exception
    //   1187	1192	1386	java/lang/Exception
    //   1194	1199	1386	java/lang/Exception
    //   1209	1214	1386	java/lang/Exception
    //   1216	1221	1386	java/lang/Exception
    //   1221	1224	1386	java/lang/Exception
    //   1237	1242	1386	java/lang/Exception
    //   1244	1247	1386	java/lang/Exception
    //   1249	1254	1386	java/lang/Exception
    //   1256	1261	1386	java/lang/Exception
    //   1263	1268	1386	java/lang/Exception
    //   1274	1279	1386	java/lang/Exception
    //   1279	1284	1386	java/lang/Exception
    //   1288	1293	1386	java/lang/Exception
    //   1295	1300	1386	java/lang/Exception
    //   1306	1311	1386	java/lang/Exception
    //   1317	1322	1386	java/lang/Exception
    //   1328	1333	1386	java/lang/Exception
    //   1335	1340	1386	java/lang/Exception
    //   1342	1347	1386	java/lang/Exception
    //   1349	1354	1386	java/lang/Exception
    //   1356	1361	1386	java/lang/Exception
    //   1361	1364	1386	java/lang/Exception
    //   1377	1383	1386	java/lang/Exception
    //   1441	1446	1386	java/lang/Exception
    //   1461	1466	1386	java/lang/Exception
    //   1483	1488	1386	java/lang/Exception
    //   1531	1536	1386	java/lang/Exception
    //   1540	1545	1386	java/lang/Exception
    //   1564	1567	1386	java/lang/Exception
    //   1582	1587	1386	java/lang/Exception
    //   1601	1606	1386	java/lang/Exception
    //   26	29	1611	finally
    //   34	39	1611	finally
    //   50	54	1611	finally
    //   59	62	1611	finally
    //   69	74	1611	finally
    //   80	83	1611	finally
    //   95	100	1611	finally
    //   106	109	1611	finally
    //   115	120	1611	finally
    //   127	134	1650	finally
    //   147	152	1650	finally
    //   165	172	1650	finally
    //   176	183	1650	finally
    //   191	198	1650	finally
    //   202	209	1650	finally
    //   217	224	1650	finally
    //   228	235	1650	finally
    //   244	251	1650	finally
    //   255	263	1650	finally
    //   270	277	1650	finally
    //   281	288	1650	finally
    //   297	304	1650	finally
    //   308	315	1650	finally
    //   324	331	1650	finally
    //   335	342	1650	finally
    //   351	358	1650	finally
    //   362	369	1650	finally
    //   376	379	1650	finally
    //   392	399	1650	finally
    //   403	411	1650	finally
    //   418	425	1650	finally
    //   429	436	1650	finally
    //   445	452	1650	finally
    //   456	464	1650	finally
    //   470	477	1650	finally
    //   481	488	1650	finally
    //   518	525	1650	finally
    //   529	536	1650	finally
    //   562	569	1650	finally
    //   573	580	1650	finally
    //   589	596	1650	finally
    //   600	607	1650	finally
    //   616	623	1650	finally
    //   627	634	1650	finally
    //   643	650	1650	finally
    //   654	661	1650	finally
    //   663	666	1650	finally
    //   679	684	1650	finally
    //   684	687	1650	finally
    //   695	700	1650	finally
    //   702	707	1650	finally
    //   721	726	1650	finally
    //   740	745	1650	finally
    //   752	755	1650	finally
    //   761	766	1650	finally
    //   781	786	1650	finally
    //   801	804	1650	finally
    //   812	815	1650	finally
    //   821	824	1650	finally
    //   826	831	1650	finally
    //   861	866	1650	finally
    //   868	871	1650	finally
    //   873	878	1650	finally
    //   878	883	1650	finally
    //   894	899	1650	finally
    //   905	910	1650	finally
    //   912	915	1650	finally
    //   917	922	1650	finally
    //   933	938	1650	finally
    //   945	950	1650	finally
    //   957	960	1650	finally
    //   962	965	1650	finally
    //   967	972	1650	finally
    //   972	975	1650	finally
    //   984	987	1650	finally
    //   996	1003	1650	finally
    //   1028	1033	1650	finally
    //   1035	1042	1650	finally
    //   1049	1054	1650	finally
    //   1061	1064	1650	finally
    //   1074	1077	1650	finally
    //   1084	1087	1650	finally
    //   1101	1104	1650	finally
    //   1148	1151	1650	finally
    //   1178	1183	1650	finally
    //   1187	1192	1650	finally
    //   1194	1199	1650	finally
    //   1209	1214	1650	finally
    //   1216	1221	1650	finally
    //   1221	1224	1650	finally
    //   1237	1242	1650	finally
    //   1244	1247	1650	finally
    //   1249	1254	1650	finally
    //   1256	1261	1650	finally
    //   1263	1268	1650	finally
    //   1274	1279	1650	finally
    //   1279	1284	1650	finally
    //   1288	1293	1650	finally
    //   1295	1300	1650	finally
    //   1306	1311	1650	finally
    //   1317	1322	1650	finally
    //   1328	1333	1650	finally
    //   1335	1340	1650	finally
    //   1342	1347	1650	finally
    //   1349	1354	1650	finally
    //   1356	1361	1650	finally
    //   1361	1364	1650	finally
    //   1377	1383	1650	finally
    //   1441	1446	1650	finally
    //   1461	1466	1650	finally
    //   1483	1488	1650	finally
    //   1531	1536	1650	finally
    //   1540	1545	1650	finally
    //   1564	1567	1650	finally
    //   1582	1587	1650	finally
    //   1601	1606	1650	finally
    //   1392	1395	1655	finally
    //   26	29	1668	java/lang/Exception
    //   34	39	1668	java/lang/Exception
    //   50	54	1668	java/lang/Exception
    //   59	62	1668	java/lang/Exception
    //   69	74	1668	java/lang/Exception
    //   80	83	1668	java/lang/Exception
    //   95	100	1668	java/lang/Exception
    //   106	109	1668	java/lang/Exception
    //   115	120	1668	java/lang/Exception
  }
  
  public static ArrayList a(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3, d paramd, b paramb)
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = null;
    Object localObject2 = "com.viber.voip";
    String str = "viber_messages";
    for (;;)
    {
      try
      {
        localObject2 = com.vvt.af.a.a.a((String)localObject2, str);
        if (localObject2 != null) {
          localObject1 = paramString1;
        }
        Object localObject4;
        localObject1 = localArrayList;
      }
      finally
      {
        try
        {
          localObject1 = a((com.vvt.af.a.a)localObject2, paramString1, paramLong1, paramLong2, paramString2, paramString3, paramd, paramb);
          if (localObject2 != null) {
            ((com.vvt.af.a.a)localObject2).a();
          }
          bool = b;
          if (bool) {}
          bool = a;
          if (bool) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          localObject1 = localObject3;
          localObject4 = localObject5;
        }
        localObject3 = finally;
        if (localObject1 != null) {
          ((com.vvt.af.a.a)localObject1).a();
        }
      }
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, String paramString3, String paramString4, d paramd, b paramb)
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        com.vvt.af.a.a locala = com.vvt.af.a.a.a(paramString1);
        if (locala != null) {
          localObject1 = paramString2;
        }
        Object localObject3;
        localObject1 = localArrayList;
      }
      finally
      {
        try
        {
          localObject1 = a(locala, paramString2, paramLong1, paramLong2, paramString3, paramString4, paramd, paramb);
          if (locala != null) {
            locala.a();
          }
          bool = b;
          if (bool) {}
          bool = a;
          if (bool) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          localObject1 = localObject2;
          localObject3 = localObject4;
        }
        localObject2 = finally;
        if (localObject1 != null) {
          ((com.vvt.af.a.a)localObject1).a();
        }
      }
    }
  }
  
  /* Error */
  private static java.util.List a(com.vvt.af.a.a parama, String paramString1, String paramString2, d paramd, String paramString3)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   9: istore 7
    //   11: iload 7
    //   13: ifeq +3 -> 16
    //   16: new 249	java/util/ArrayList
    //   19: astore 8
    //   21: aload 8
    //   23: invokespecial 250	java/util/ArrayList:<init>	()V
    //   26: aload_0
    //   27: ifnull +519 -> 546
    //   30: ldc_w 464
    //   33: astore 9
    //   35: iconst_2
    //   36: istore 10
    //   38: iload 10
    //   40: anewarray 4	java/lang/Object
    //   43: astore 11
    //   45: iconst_0
    //   46: istore 12
    //   48: aconst_null
    //   49: astore 13
    //   51: ldc 26
    //   53: astore 14
    //   55: aload 11
    //   57: iconst_0
    //   58: aload 14
    //   60: aastore
    //   61: iconst_1
    //   62: istore 12
    //   64: ldc -85
    //   66: astore 14
    //   68: aload 11
    //   70: iload 12
    //   72: aload 14
    //   74: aastore
    //   75: aload 9
    //   77: aload 11
    //   79: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   82: astore 14
    //   84: ldc -83
    //   86: astore 11
    //   88: iconst_0
    //   89: istore 12
    //   91: aconst_null
    //   92: astore 13
    //   94: iconst_2
    //   95: istore 7
    //   97: iload 7
    //   99: anewarray 28	java/lang/String
    //   102: astore 15
    //   104: iconst_0
    //   105: istore 7
    //   107: aconst_null
    //   108: astore 9
    //   110: aload 15
    //   112: iconst_0
    //   113: aload_2
    //   114: aastore
    //   115: iconst_1
    //   116: istore 7
    //   118: ldc_w 466
    //   121: astore 16
    //   123: aload 15
    //   125: iload 7
    //   127: aload 16
    //   129: aastore
    //   130: aconst_null
    //   131: astore 16
    //   133: aload_0
    //   134: astore 9
    //   136: aload_0
    //   137: aload 11
    //   139: aconst_null
    //   140: aload 14
    //   142: aload 15
    //   144: aconst_null
    //   145: aconst_null
    //   146: aconst_null
    //   147: invokevirtual 39	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   150: astore 11
    //   152: aload 11
    //   154: ifnull +398 -> 552
    //   157: aload 11
    //   159: invokeinterface 267 1 0
    //   164: istore 7
    //   166: iload 7
    //   168: ifeq +384 -> 552
    //   171: ldc -79
    //   173: astore 9
    //   175: aload 11
    //   177: aload 9
    //   179: invokeinterface 51 2 0
    //   184: istore 7
    //   186: aload 11
    //   188: iload 7
    //   190: invokeinterface 55 2 0
    //   195: astore 13
    //   197: ldc -85
    //   199: astore 9
    //   201: aload 11
    //   203: aload 9
    //   205: invokeinterface 51 2 0
    //   210: istore 7
    //   212: aload 11
    //   214: iload 7
    //   216: invokeinterface 55 2 0
    //   221: astore 14
    //   223: ldc -77
    //   225: astore 9
    //   227: aload 11
    //   229: aload 9
    //   231: invokeinterface 51 2 0
    //   236: istore 7
    //   238: aload 11
    //   240: iload 7
    //   242: invokeinterface 55 2 0
    //   247: astore 9
    //   249: getstatic 17	com/vvt/capture/viber/mode/full/j:removeFromPath	Z
    //   252: istore 17
    //   254: iload 17
    //   256: ifeq +3 -> 259
    //   259: aload 9
    //   261: ifnull +168 -> 429
    //   264: aload 9
    //   266: invokevirtual 63	java/lang/String:length	()I
    //   269: istore 17
    //   271: iload 17
    //   273: ifle +156 -> 429
    //   276: aload_1
    //   277: aload 9
    //   279: aload 4
    //   281: invokestatic 469	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   284: astore 9
    //   286: aload 13
    //   288: ifnull +17 -> 305
    //   291: aload 13
    //   293: invokevirtual 63	java/lang/String:length	()I
    //   296: istore 17
    //   298: iload 17
    //   300: iload 5
    //   302: if_icmpge +7 -> 309
    //   305: aload 14
    //   307: astore 13
    //   309: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   312: istore 17
    //   314: iload 17
    //   316: ifeq +3 -> 319
    //   319: new 74	com/vvt/im/events/info/e
    //   322: astore 15
    //   324: aload 15
    //   326: invokespecial 470	com/vvt/im/events/info/e:<init>	()V
    //   329: aload 15
    //   331: aload 14
    //   333: invokevirtual 471	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   336: aload 15
    //   338: aload 13
    //   340: invokevirtual 472	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   343: aload 15
    //   345: aload 14
    //   347: invokevirtual 473	com/vvt/im/events/info/e:removeFromPath	(Ljava/lang/String;)V
    //   350: aload 15
    //   352: aload 9
    //   354: invokevirtual 474	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   357: iconst_0
    //   358: istore 7
    //   360: aconst_null
    //   361: astore 9
    //   363: iconst_0
    //   364: newarray <illegal type>
    //   366: astore 9
    //   368: aload 15
    //   370: aload 9
    //   372: invokevirtual 475	com/vvt/im/events/info/e:a	([B)V
    //   375: aload 8
    //   377: aload 15
    //   379: invokeinterface 476 2 0
    //   384: pop
    //   385: goto -228 -> 157
    //   388: astore 9
    //   390: aload 11
    //   392: astore 6
    //   394: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   397: istore 7
    //   399: iload 7
    //   401: ifeq +3 -> 404
    //   404: aload 6
    //   406: ifnull +10 -> 416
    //   409: aload 6
    //   411: invokeinterface 59 1 0
    //   416: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   419: istore 7
    //   421: iload 7
    //   423: ifeq +3 -> 426
    //   426: aload 8
    //   428: areturn
    //   429: getstatic 17	com/vvt/capture/viber/mode/full/j:removeFromPath	Z
    //   432: istore 7
    //   434: iload 7
    //   436: ifeq +3 -> 439
    //   439: aload 13
    //   441: ifnull +73 -> 514
    //   444: aload 13
    //   446: invokevirtual 63	java/lang/String:length	()I
    //   449: istore 7
    //   451: iload 7
    //   453: ifle +61 -> 514
    //   456: aload_3
    //   457: aload 13
    //   459: invokeinterface 479 2 0
    //   464: astore 9
    //   466: aload 9
    //   468: ifnull +46 -> 514
    //   471: aload 9
    //   473: arraylength
    //   474: istore 17
    //   476: iload 17
    //   478: ifle +36 -> 514
    //   481: getstatic 14	com/vvt/capture/viber/mode/full/j:a	Z
    //   484: istore 17
    //   486: iload 17
    //   488: ifeq +3 -> 491
    //   491: aload_1
    //   492: aload 9
    //   494: invokestatic 482	com/vvt/capture/viber/mode/full/MyUncaughtExceptionHandler:a	(Ljava/lang/String;[B)Ljava/lang/String;
    //   497: astore 9
    //   499: goto -213 -> 286
    //   502: astore 9
    //   504: getstatic 22	com/vvt/capture/viber/mode/full/j:MyUncaughtExceptionHandler	Z
    //   507: istore 7
    //   509: iload 7
    //   511: ifeq +3 -> 514
    //   514: iconst_0
    //   515: istore 7
    //   517: aconst_null
    //   518: astore 9
    //   520: goto -234 -> 286
    //   523: astore 9
    //   525: iconst_0
    //   526: istore 10
    //   528: aconst_null
    //   529: astore 11
    //   531: aload 11
    //   533: ifnull +10 -> 543
    //   536: aload 11
    //   538: invokeinterface 59 1 0
    //   543: aload 9
    //   545: athrow
    //   546: iconst_0
    //   547: istore 10
    //   549: aconst_null
    //   550: astore 11
    //   552: aload 11
    //   554: ifnull -138 -> 416
    //   557: aload 11
    //   559: invokeinterface 59 1 0
    //   564: goto -148 -> 416
    //   567: astore 9
    //   569: goto -38 -> 531
    //   572: astore 9
    //   574: aload 6
    //   576: astore 11
    //   578: goto -47 -> 531
    //   581: astore 9
    //   583: goto -189 -> 394
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	586	0	parama	com.vvt.af.a.a
    //   0	586	1	paramString1	String
    //   0	586	2	paramString2	String
    //   0	586	3	paramd	d
    //   0	586	4	paramString3	String
    //   1	302	5	i	int
    //   4	571	6	localObject1	Object
    //   9	3	7	bool1	boolean
    //   95	31	7	j	int
    //   164	3	7	bool2	boolean
    //   184	175	7	k	int
    //   397	38	7	bool3	boolean
    //   449	3	7	m	int
    //   507	9	7	bool4	boolean
    //   19	408	8	localArrayList	ArrayList
    //   33	338	9	localObject2	Object
    //   388	1	9	localException1	Exception
    //   464	34	9	localObject3	Object
    //   502	1	9	localException2	Exception
    //   518	1	9	localObject4	Object
    //   523	21	9	localObject5	Object
    //   567	1	9	localObject6	Object
    //   572	1	9	localObject7	Object
    //   581	1	9	localException3	Exception
    //   36	512	10	n	int
    //   43	534	11	localObject8	Object
    //   46	44	12	i1	int
    //   49	409	13	localObject9	Object
    //   53	293	14	str1	String
    //   102	276	15	localObject10	Object
    //   121	11	16	str2	String
    //   252	3	17	bool5	boolean
    //   269	34	17	i2	int
    //   312	3	17	bool6	boolean
    //   474	3	17	i3	int
    //   484	3	17	bool7	boolean
    // Exception table:
    //   from	to	target	type
    //   157	164	388	java/lang/Exception
    //   177	184	388	java/lang/Exception
    //   188	195	388	java/lang/Exception
    //   203	210	388	java/lang/Exception
    //   214	221	388	java/lang/Exception
    //   229	236	388	java/lang/Exception
    //   240	247	388	java/lang/Exception
    //   291	296	388	java/lang/Exception
    //   309	312	388	java/lang/Exception
    //   319	322	388	java/lang/Exception
    //   324	329	388	java/lang/Exception
    //   331	336	388	java/lang/Exception
    //   338	343	388	java/lang/Exception
    //   345	350	388	java/lang/Exception
    //   352	357	388	java/lang/Exception
    //   363	366	388	java/lang/Exception
    //   370	375	388	java/lang/Exception
    //   377	385	388	java/lang/Exception
    //   504	507	388	java/lang/Exception
    //   249	252	502	java/lang/Exception
    //   264	269	502	java/lang/Exception
    //   279	284	502	java/lang/Exception
    //   429	432	502	java/lang/Exception
    //   444	449	502	java/lang/Exception
    //   457	464	502	java/lang/Exception
    //   471	474	502	java/lang/Exception
    //   481	484	502	java/lang/Exception
    //   492	497	502	java/lang/Exception
    //   38	43	523	finally
    //   58	61	523	finally
    //   72	75	523	finally
    //   77	82	523	finally
    //   97	102	523	finally
    //   113	115	523	finally
    //   127	130	523	finally
    //   146	150	523	finally
    //   157	164	567	finally
    //   177	184	567	finally
    //   188	195	567	finally
    //   203	210	567	finally
    //   214	221	567	finally
    //   229	236	567	finally
    //   240	247	567	finally
    //   249	252	567	finally
    //   264	269	567	finally
    //   279	284	567	finally
    //   291	296	567	finally
    //   309	312	567	finally
    //   319	322	567	finally
    //   324	329	567	finally
    //   331	336	567	finally
    //   338	343	567	finally
    //   345	350	567	finally
    //   352	357	567	finally
    //   363	366	567	finally
    //   370	375	567	finally
    //   377	385	567	finally
    //   429	432	567	finally
    //   444	449	567	finally
    //   457	464	567	finally
    //   471	474	567	finally
    //   481	484	567	finally
    //   492	497	567	finally
    //   504	507	567	finally
    //   394	397	572	finally
    //   38	43	581	java/lang/Exception
    //   58	61	581	java/lang/Exception
    //   72	75	581	java/lang/Exception
    //   77	82	581	java/lang/Exception
    //   97	102	581	java/lang/Exception
    //   113	115	581	java/lang/Exception
    //   127	130	581	java/lang/Exception
    //   146	150	581	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */