package com.vvt.pushnotification.connectionhistory;

import com.vvt.io.p;
import com.vvt.pushnotification.a;
import java.io.File;
import java.util.LinkedList;

public class c
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private static final boolean c = a.d;
  private String d;
  
  public c(String paramString)
  {
    this.d = paramString;
  }
  
  /* Error */
  private void a(LinkedList paramLinkedList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokespecial 34	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:FxFileObserverWorker	()Ljava/io/File;
    //   6: astore_3
    //   7: new 36	java/io/FileOutputStream
    //   10: astore 4
    //   12: aload 4
    //   14: aload_3
    //   15: invokespecial 39	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   18: new 41	java/io/BufferedOutputStream
    //   21: astore 5
    //   23: aload 5
    //   25: aload 4
    //   27: invokespecial 44	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: new 46	java/io/ObjectOutputStream
    //   33: astore_3
    //   34: aload_3
    //   35: aload 5
    //   37: invokespecial 47	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   40: aload_3
    //   41: aload_1
    //   42: invokevirtual 51	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   45: aload_3
    //   46: invokestatic 56	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   49: aload 5
    //   51: invokestatic 58	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   54: aload 4
    //   56: invokestatic 58	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   59: return
    //   60: astore_3
    //   61: aconst_null
    //   62: astore_3
    //   63: aconst_null
    //   64: astore 5
    //   66: getstatic 20	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	Z
    //   69: istore 6
    //   71: iload 6
    //   73: ifeq +3 -> 76
    //   76: aload_3
    //   77: invokestatic 56	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   80: aload_2
    //   81: invokestatic 58	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   84: aload 5
    //   86: invokestatic 58	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   89: goto -30 -> 59
    //   92: astore_3
    //   93: aconst_null
    //   94: astore 5
    //   96: iconst_0
    //   97: istore 6
    //   99: aconst_null
    //   100: astore 4
    //   102: aload_2
    //   103: invokestatic 56	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   106: aload 5
    //   108: invokestatic 58	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   111: aload 4
    //   113: invokestatic 58	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   116: aload_3
    //   117: athrow
    //   118: astore_3
    //   119: aconst_null
    //   120: astore 5
    //   122: goto -20 -> 102
    //   125: astore_3
    //   126: goto -24 -> 102
    //   129: astore 7
    //   131: aload_3
    //   132: astore_2
    //   133: aload 7
    //   135: astore_3
    //   136: goto -34 -> 102
    //   139: astore 7
    //   141: aload 5
    //   143: astore 4
    //   145: aload_2
    //   146: astore 5
    //   148: aload_3
    //   149: astore_2
    //   150: aload 7
    //   152: astore_3
    //   153: goto -51 -> 102
    //   156: astore_3
    //   157: aconst_null
    //   158: astore_3
    //   159: aload 4
    //   161: astore 5
    //   163: goto -97 -> 66
    //   166: astore_3
    //   167: aconst_null
    //   168: astore_3
    //   169: aload 5
    //   171: astore_2
    //   172: aload 4
    //   174: astore 5
    //   176: goto -110 -> 66
    //   179: astore_2
    //   180: aload 5
    //   182: astore_2
    //   183: aload 4
    //   185: astore 5
    //   187: goto -121 -> 66
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	190	0	this	MyUncaughtExceptionHandler
    //   0	190	1	paramLinkedList	LinkedList
    //   1	171	2	localObject1	Object
    //   179	1	2	localIOException1	java.io.IOException
    //   182	1	2	localObject2	Object
    //   6	40	3	localObject3	Object
    //   60	1	3	localIOException2	java.io.IOException
    //   62	15	3	localObjectOutputStream	java.io.ObjectOutputStream
    //   92	25	3	localObject4	Object
    //   118	1	3	localObject5	Object
    //   125	7	3	localObject6	Object
    //   135	18	3	localObject7	Object
    //   156	1	3	localIOException3	java.io.IOException
    //   158	1	3	localObject8	Object
    //   166	1	3	localIOException4	java.io.IOException
    //   168	1	3	localObject9	Object
    //   10	174	4	localObject10	Object
    //   21	165	5	localObject11	Object
    //   69	29	6	bool	boolean
    //   129	5	7	localObject12	Object
    //   139	12	7	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   2	6	60	java/io/IOException
    //   7	10	60	java/io/IOException
    //   14	18	60	java/io/IOException
    //   2	6	92	finally
    //   7	10	92	finally
    //   14	18	92	finally
    //   18	21	118	finally
    //   25	30	118	finally
    //   30	33	125	finally
    //   35	40	125	finally
    //   41	45	129	finally
    //   66	69	139	finally
    //   18	21	156	java/io/IOException
    //   25	30	156	java/io/IOException
    //   30	33	166	java/io/IOException
    //   35	40	166	java/io/IOException
    //   41	45	179	java/io/IOException
  }
  
  /* Error */
  private LinkedList f()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 62	java/util/LinkedList
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial 63	java/util/LinkedList:<init>	()V
    //   10: aload_0
    //   11: invokespecial 34	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:FxFileObserverWorker	()Ljava/io/File;
    //   14: astore_3
    //   15: aload_3
    //   16: invokevirtual 69	java/io/File:exists	()Z
    //   19: istore 4
    //   21: iload 4
    //   23: ifeq +74 -> 97
    //   26: new 71	java/io/FileInputStream
    //   29: astore 5
    //   31: aload 5
    //   33: aload_3
    //   34: invokespecial 72	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: new 74	java/io/BufferedInputStream
    //   40: astore 6
    //   42: aload 6
    //   44: aload 5
    //   46: invokespecial 77	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   49: new 79	java/io/ObjectInputStream
    //   52: astore_3
    //   53: aload_3
    //   54: aload 6
    //   56: invokespecial 80	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   59: aload_3
    //   60: invokeinterface 86 1 0
    //   65: astore_1
    //   66: aload_1
    //   67: checkcast 62	java/util/LinkedList
    //   70: astore_1
    //   71: getstatic 15	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:a	Z
    //   74: istore 7
    //   76: iload 7
    //   78: ifeq +3 -> 81
    //   81: aload_3
    //   82: invokestatic 89	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   85: aload 6
    //   87: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   90: aload 5
    //   92: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   95: aload_1
    //   96: areturn
    //   97: getstatic 24	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   100: istore 8
    //   102: iload 8
    //   104: ifeq +3 -> 107
    //   107: iconst_0
    //   108: istore 8
    //   110: aconst_null
    //   111: astore_3
    //   112: iconst_0
    //   113: istore 4
    //   115: aconst_null
    //   116: astore 6
    //   118: iconst_0
    //   119: istore 9
    //   121: aconst_null
    //   122: astore 5
    //   124: aload_2
    //   125: astore_1
    //   126: goto -45 -> 81
    //   129: astore_3
    //   130: iconst_0
    //   131: istore 8
    //   133: aconst_null
    //   134: astore_3
    //   135: iconst_0
    //   136: istore 4
    //   138: aconst_null
    //   139: astore 6
    //   141: aload_2
    //   142: astore 10
    //   144: iconst_0
    //   145: istore 7
    //   147: aconst_null
    //   148: astore_2
    //   149: aload 10
    //   151: astore_1
    //   152: getstatic 20	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	Z
    //   155: istore 9
    //   157: iload 9
    //   159: ifeq +3 -> 162
    //   162: aload_0
    //   163: invokevirtual 93	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	()Z
    //   166: pop
    //   167: aload_3
    //   168: invokestatic 89	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   171: aload 6
    //   173: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   176: aload_2
    //   177: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   180: goto -85 -> 95
    //   183: astore_3
    //   184: iconst_0
    //   185: istore 8
    //   187: aconst_null
    //   188: astore_3
    //   189: iconst_0
    //   190: istore 4
    //   192: aconst_null
    //   193: astore 6
    //   195: iconst_0
    //   196: istore 9
    //   198: aconst_null
    //   199: astore 5
    //   201: aload_2
    //   202: astore_1
    //   203: getstatic 20	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	Z
    //   206: istore 7
    //   208: iload 7
    //   210: ifeq +3 -> 213
    //   213: aload_0
    //   214: invokevirtual 93	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	()Z
    //   217: pop
    //   218: aload_3
    //   219: invokestatic 89	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   222: aload 6
    //   224: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   227: goto -137 -> 90
    //   230: astore_3
    //   231: iconst_0
    //   232: istore 8
    //   234: aconst_null
    //   235: astore_3
    //   236: iconst_0
    //   237: istore 4
    //   239: aconst_null
    //   240: astore 6
    //   242: iconst_0
    //   243: istore 9
    //   245: aconst_null
    //   246: astore 5
    //   248: aload_2
    //   249: astore_1
    //   250: getstatic 20	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	Z
    //   253: istore 7
    //   255: iload 7
    //   257: ifeq +3 -> 260
    //   260: aload_0
    //   261: invokevirtual 93	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	()Z
    //   264: pop
    //   265: aload_3
    //   266: invokestatic 89	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   269: aload 6
    //   271: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   274: goto -184 -> 90
    //   277: astore_3
    //   278: iconst_0
    //   279: istore 8
    //   281: aconst_null
    //   282: astore_3
    //   283: iconst_0
    //   284: istore 4
    //   286: aconst_null
    //   287: astore 6
    //   289: iconst_0
    //   290: istore 9
    //   292: aconst_null
    //   293: astore 5
    //   295: aload_2
    //   296: astore_1
    //   297: getstatic 20	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	Z
    //   300: istore 7
    //   302: iload 7
    //   304: ifeq +3 -> 307
    //   307: aload_0
    //   308: invokevirtual 93	com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler:removeFromPath	()Z
    //   311: pop
    //   312: aload_3
    //   313: invokestatic 89	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   316: aload 6
    //   318: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   321: goto -231 -> 90
    //   324: astore_3
    //   325: iconst_0
    //   326: istore 4
    //   328: aconst_null
    //   329: astore 6
    //   331: iconst_0
    //   332: istore 9
    //   334: aconst_null
    //   335: astore 5
    //   337: aload_3
    //   338: astore 10
    //   340: iconst_0
    //   341: istore 8
    //   343: aconst_null
    //   344: astore_3
    //   345: aload 10
    //   347: astore_1
    //   348: aload_3
    //   349: invokestatic 89	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   352: aload 6
    //   354: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   357: aload 5
    //   359: invokestatic 91	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   362: aload_1
    //   363: athrow
    //   364: astore_3
    //   365: iconst_0
    //   366: istore 4
    //   368: aconst_null
    //   369: astore 6
    //   371: aconst_null
    //   372: astore 10
    //   374: aload_3
    //   375: astore_1
    //   376: iconst_0
    //   377: istore 8
    //   379: aconst_null
    //   380: astore_3
    //   381: goto -33 -> 348
    //   384: astore 10
    //   386: iconst_0
    //   387: istore 8
    //   389: aconst_null
    //   390: astore_3
    //   391: aload 10
    //   393: astore_1
    //   394: goto -46 -> 348
    //   397: astore_1
    //   398: goto -50 -> 348
    //   401: astore_1
    //   402: aload_2
    //   403: astore 5
    //   405: goto -57 -> 348
    //   408: astore_3
    //   409: iconst_0
    //   410: istore 8
    //   412: aconst_null
    //   413: astore_3
    //   414: iconst_0
    //   415: istore 4
    //   417: aconst_null
    //   418: astore 6
    //   420: aload_2
    //   421: astore_1
    //   422: goto -125 -> 297
    //   425: astore_3
    //   426: iconst_0
    //   427: istore 8
    //   429: aconst_null
    //   430: astore_3
    //   431: aload_2
    //   432: astore_1
    //   433: goto -136 -> 297
    //   436: astore_1
    //   437: aload_2
    //   438: astore_1
    //   439: goto -142 -> 297
    //   442: astore_2
    //   443: goto -146 -> 297
    //   446: astore_3
    //   447: iconst_0
    //   448: istore 8
    //   450: aconst_null
    //   451: astore_3
    //   452: iconst_0
    //   453: istore 4
    //   455: aconst_null
    //   456: astore 6
    //   458: aload_2
    //   459: astore_1
    //   460: goto -210 -> 250
    //   463: astore_3
    //   464: iconst_0
    //   465: istore 8
    //   467: aconst_null
    //   468: astore_3
    //   469: aload_2
    //   470: astore_1
    //   471: goto -221 -> 250
    //   474: astore_1
    //   475: aload_2
    //   476: astore_1
    //   477: goto -227 -> 250
    //   480: astore_2
    //   481: goto -231 -> 250
    //   484: astore_3
    //   485: iconst_0
    //   486: istore 8
    //   488: aconst_null
    //   489: astore_3
    //   490: iconst_0
    //   491: istore 4
    //   493: aconst_null
    //   494: astore 6
    //   496: aload_2
    //   497: astore_1
    //   498: goto -295 -> 203
    //   501: astore_3
    //   502: iconst_0
    //   503: istore 8
    //   505: aconst_null
    //   506: astore_3
    //   507: aload_2
    //   508: astore_1
    //   509: goto -306 -> 203
    //   512: astore_1
    //   513: aload_2
    //   514: astore_1
    //   515: goto -312 -> 203
    //   518: astore_2
    //   519: goto -316 -> 203
    //   522: astore_3
    //   523: iconst_0
    //   524: istore 8
    //   526: aconst_null
    //   527: astore_3
    //   528: iconst_0
    //   529: istore 4
    //   531: aconst_null
    //   532: astore 6
    //   534: aload_2
    //   535: astore_1
    //   536: aload 5
    //   538: astore_2
    //   539: goto -387 -> 152
    //   542: astore_3
    //   543: iconst_0
    //   544: istore 8
    //   546: aconst_null
    //   547: astore_3
    //   548: aload_2
    //   549: astore_1
    //   550: aload 5
    //   552: astore_2
    //   553: goto -401 -> 152
    //   556: astore_1
    //   557: aload_2
    //   558: astore_1
    //   559: aload 5
    //   561: astore_2
    //   562: goto -410 -> 152
    //   565: astore_2
    //   566: aload 5
    //   568: astore_2
    //   569: goto -417 -> 152
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	572	0	this	MyUncaughtExceptionHandler
    //   1	393	1	localObject1	Object
    //   397	1	1	localObject2	Object
    //   401	1	1	localObject3	Object
    //   421	12	1	localObject4	Object
    //   436	1	1	localClassNotFoundException1	ClassNotFoundException
    //   438	33	1	localObject5	Object
    //   474	1	1	localIOException1	java.io.IOException
    //   476	33	1	localObject6	Object
    //   512	1	1	localStreamCorruptedException1	java.io.StreamCorruptedException
    //   514	36	1	localObject7	Object
    //   556	1	1	localFileNotFoundException1	java.io.FileNotFoundException
    //   558	1	1	localObject8	Object
    //   5	433	2	localLinkedList	LinkedList
    //   442	34	2	localClassNotFoundException2	ClassNotFoundException
    //   480	34	2	localIOException2	java.io.IOException
    //   518	17	2	localStreamCorruptedException2	java.io.StreamCorruptedException
    //   538	24	2	localObject9	Object
    //   565	1	2	localFileNotFoundException2	java.io.FileNotFoundException
    //   568	1	2	localObject10	Object
    //   14	98	3	localObject11	Object
    //   129	1	3	localFileNotFoundException3	java.io.FileNotFoundException
    //   134	34	3	localObjectInput1	java.io.ObjectInput
    //   183	1	3	localStreamCorruptedException3	java.io.StreamCorruptedException
    //   188	31	3	localObjectInput2	java.io.ObjectInput
    //   230	1	3	localIOException3	java.io.IOException
    //   235	31	3	localObjectInput3	java.io.ObjectInput
    //   277	1	3	localClassNotFoundException3	ClassNotFoundException
    //   282	31	3	localObjectInput4	java.io.ObjectInput
    //   324	14	3	localObject12	Object
    //   344	5	3	localObjectInput5	java.io.ObjectInput
    //   364	11	3	localObject13	Object
    //   380	11	3	localObject14	Object
    //   408	1	3	localClassNotFoundException4	ClassNotFoundException
    //   413	1	3	localObject15	Object
    //   425	1	3	localClassNotFoundException5	ClassNotFoundException
    //   430	1	3	localObject16	Object
    //   446	1	3	localIOException4	java.io.IOException
    //   451	1	3	localObject17	Object
    //   463	1	3	localIOException5	java.io.IOException
    //   468	1	3	localObject18	Object
    //   484	1	3	localStreamCorruptedException4	java.io.StreamCorruptedException
    //   489	1	3	localObject19	Object
    //   501	1	3	localStreamCorruptedException5	java.io.StreamCorruptedException
    //   506	1	3	localObject20	Object
    //   522	1	3	localFileNotFoundException4	java.io.FileNotFoundException
    //   527	1	3	localObject21	Object
    //   542	1	3	localFileNotFoundException5	java.io.FileNotFoundException
    //   547	1	3	localObject22	Object
    //   19	511	4	bool1	boolean
    //   29	538	5	localObject23	Object
    //   40	493	6	localBufferedInputStream	java.io.BufferedInputStream
    //   74	229	7	bool2	boolean
    //   100	445	8	bool3	boolean
    //   119	214	9	bool4	boolean
    //   142	231	10	localObject24	Object
    //   384	8	10	localObject25	Object
    // Exception table:
    //   from	to	target	type
    //   15	19	129	java/io/FileNotFoundException
    //   26	29	129	java/io/FileNotFoundException
    //   33	37	129	java/io/FileNotFoundException
    //   97	100	129	java/io/FileNotFoundException
    //   15	19	183	java/io/StreamCorruptedException
    //   26	29	183	java/io/StreamCorruptedException
    //   33	37	183	java/io/StreamCorruptedException
    //   97	100	183	java/io/StreamCorruptedException
    //   15	19	230	java/io/IOException
    //   26	29	230	java/io/IOException
    //   33	37	230	java/io/IOException
    //   97	100	230	java/io/IOException
    //   15	19	277	java/lang/ClassNotFoundException
    //   26	29	277	java/lang/ClassNotFoundException
    //   33	37	277	java/lang/ClassNotFoundException
    //   97	100	277	java/lang/ClassNotFoundException
    //   15	19	324	finally
    //   26	29	324	finally
    //   33	37	324	finally
    //   97	100	324	finally
    //   37	40	364	finally
    //   44	49	364	finally
    //   49	52	384	finally
    //   54	59	384	finally
    //   59	65	397	finally
    //   66	70	397	finally
    //   71	74	397	finally
    //   203	206	397	finally
    //   213	218	397	finally
    //   250	253	397	finally
    //   260	265	397	finally
    //   297	300	397	finally
    //   307	312	397	finally
    //   152	155	401	finally
    //   162	167	401	finally
    //   37	40	408	java/lang/ClassNotFoundException
    //   44	49	408	java/lang/ClassNotFoundException
    //   49	52	425	java/lang/ClassNotFoundException
    //   54	59	425	java/lang/ClassNotFoundException
    //   59	65	436	java/lang/ClassNotFoundException
    //   66	70	436	java/lang/ClassNotFoundException
    //   71	74	442	java/lang/ClassNotFoundException
    //   37	40	446	java/io/IOException
    //   44	49	446	java/io/IOException
    //   49	52	463	java/io/IOException
    //   54	59	463	java/io/IOException
    //   59	65	474	java/io/IOException
    //   66	70	474	java/io/IOException
    //   71	74	480	java/io/IOException
    //   37	40	484	java/io/StreamCorruptedException
    //   44	49	484	java/io/StreamCorruptedException
    //   49	52	501	java/io/StreamCorruptedException
    //   54	59	501	java/io/StreamCorruptedException
    //   59	65	512	java/io/StreamCorruptedException
    //   66	70	512	java/io/StreamCorruptedException
    //   71	74	518	java/io/StreamCorruptedException
    //   37	40	522	java/io/FileNotFoundException
    //   44	49	522	java/io/FileNotFoundException
    //   49	52	542	java/io/FileNotFoundException
    //   54	59	542	java/io/FileNotFoundException
    //   59	65	556	java/io/FileNotFoundException
    //   66	70	556	java/io/FileNotFoundException
    //   71	74	565	java/io/FileNotFoundException
  }
  
  private File g()
  {
    File localFile = new java/io/File;
    String str = p.a(this.d, "push_connection_history.dat");
    localFile.<init>(str);
    return localFile;
  }
  
  public LinkedList a()
  {
    return f();
  }
  
  public void a(PushConnectionHistoryEntry paramPushConnectionHistoryEntry)
  {
    LinkedList localLinkedList = a();
    localLinkedList.addFirst(paramPushConnectionHistoryEntry);
    a(localLinkedList);
  }
  
  public boolean b()
  {
    boolean bool1 = a;
    if (bool1) {}
    File localFile = g();
    boolean bool2 = localFile.exists();
    if (bool2) {}
    for (bool1 = localFile.delete();; bool1 = true) {
      return bool1;
    }
  }
  
  public int c()
  {
    return f().size();
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    LinkedList localLinkedList = f();
    Object localObject = localLinkedList.getLast();
    localLinkedList.remove(localObject);
    a(localLinkedList);
    bool = a;
    if (bool) {}
  }
  
  public PushConnectionHistoryEntry e()
  {
    Object localObject1 = f();
    try
    {
      localObject1 = ((LinkedList)localObject1).getFirst();
      localObject1 = (PushConnectionHistoryEntry)localObject1;
    }
    finally
    {
      for (;;)
      {
        Object localObject3 = null;
      }
    }
    return (PushConnectionHistoryEntry)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/connectionhistory/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */