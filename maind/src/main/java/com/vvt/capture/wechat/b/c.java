package com.vvt.capture.wechat.b;

import com.vvt.ak.a;
import com.vvt.base.b;
import com.vvt.base.capture.f;

public class c implements f {
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private static final boolean c = a.d;
  private long d = 0L;
  private final String e;
  private final String f;
  private b g;
  
  public c(String paramString1, String paramString2, b paramb) {
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramb;
  }
  
  /* Error */
  public com.vvt.base.capture.g a()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq +3 -> 11
    //   11: new 42	com/vvt/base/capture/FxSimpleEventReference
    //   14: astore 4
    //   16: aload 4
    //   18: invokespecial 43	com/vvt/base/capture/FxSimpleEventReference:<init>	()V
    //   21: invokestatic 48	com/vvt/capture/wechat/removeFromPath:a	()Ljava/lang/String;
    //   24: astore 5
    //   26: aload 5
    //   28: ifnull +162 -> 190
    //   31: aload_0
    //   32: getfield 36	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   35: astore 6
    //   37: aload_0
    //   38: getfield 38	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:f	Ljava/lang/String;
    //   41: astore 7
    //   43: aload_0
    //   44: getfield 40	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/base/removeFromPath;
    //   47: astore 8
    //   49: aload 8
    //   51: invokevirtual 52	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   54: astore 8
    //   56: aload 6
    //   58: aload 5
    //   60: aload 7
    //   62: aload 8
    //   64: invokestatic 57	com/vvt/capture/wechat/d:removeFromPath	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   67: astore 5
    //   69: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   72: istore 9
    //   74: iload 9
    //   76: ifeq +3 -> 79
    //   79: aload 5
    //   81: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   84: istore 9
    //   86: iload 9
    //   88: ifne +102 -> 190
    //   91: aload 5
    //   93: invokestatic 67	com/vvt/capture/wechat/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   96: astore 5
    //   98: aload 5
    //   100: invokestatic 70	com/vvt/capture/wechat/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;)J
    //   103: lstore 10
    //   105: iconst_0
    //   106: istore 9
    //   108: aconst_null
    //   109: astore 6
    //   111: aconst_null
    //   112: astore 12
    //   114: lload 10
    //   116: lstore 13
    //   118: iconst_0
    //   119: istore 15
    //   121: aconst_null
    //   122: astore 8
    //   124: lload 13
    //   126: lload_1
    //   127: lcmp
    //   128: istore 16
    //   130: iload 16
    //   132: ifne +66 -> 198
    //   135: bipush 10
    //   137: istore 16
    //   139: iload 15
    //   141: iload 16
    //   143: if_icmpge +55 -> 198
    //   146: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   149: istore 9
    //   151: iload 9
    //   153: ifeq +3 -> 156
    //   156: ldc2_w 72
    //   159: lstore 13
    //   161: lload 13
    //   163: invokestatic 81	android/os/SystemClock:sleep	(J)V
    //   166: aload 5
    //   168: invokestatic 70	com/vvt/capture/wechat/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;)J
    //   171: lstore 17
    //   173: iload 15
    //   175: iconst_1
    //   176: iadd
    //   177: istore 9
    //   179: iload 9
    //   181: istore 15
    //   183: lload 17
    //   185: lstore 13
    //   187: goto -63 -> 124
    //   190: lload_1
    //   191: lstore 13
    //   193: iconst_0
    //   194: istore_3
    //   195: aconst_null
    //   196: astore 5
    //   198: lload 13
    //   200: lload_1
    //   201: lcmp
    //   202: istore 19
    //   204: iload 19
    //   206: ifne +75 -> 281
    //   209: getstatic 26	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:removeFromPath	Z
    //   212: istore 9
    //   214: iload 9
    //   216: ifeq +3 -> 219
    //   219: aload_0
    //   220: getfield 34	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:d	J
    //   223: lstore 13
    //   225: lload 13
    //   227: invokestatic 87	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   230: astore 6
    //   232: aload 4
    //   234: aload 6
    //   236: invokevirtual 91	com/vvt/base/capture/FxSimpleEventReference:setReference	(Ljava/lang/Long;)V
    //   239: aload 5
    //   241: ifnull +8 -> 249
    //   244: aload 5
    //   246: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   249: aconst_null
    //   250: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   253: istore_3
    //   254: iload_3
    //   255: ifne +7 -> 262
    //   258: aconst_null
    //   259: invokestatic 101	com/vvt/capture/wechat/removeFromPath/d:removeFromPath	(Ljava/lang/String;)V
    //   262: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   265: istore_3
    //   266: iload_3
    //   267: ifeq +3 -> 270
    //   270: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   273: istore_3
    //   274: iload_3
    //   275: ifeq +3 -> 278
    //   278: aload 4
    //   280: areturn
    //   281: aload_0
    //   282: lload 13
    //   284: putfield 34	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:d	J
    //   287: goto -62 -> 225
    //   290: astore 6
    //   292: getstatic 28	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   295: istore 9
    //   297: iload 9
    //   299: ifeq +3 -> 302
    //   302: aload 5
    //   304: ifnull +8 -> 312
    //   307: aload 5
    //   309: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   312: aconst_null
    //   313: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   316: istore_3
    //   317: iload_3
    //   318: ifne -56 -> 262
    //   321: goto -63 -> 258
    //   324: astore 5
    //   326: iconst_0
    //   327: istore 9
    //   329: aconst_null
    //   330: astore 6
    //   332: aload 6
    //   334: ifnull +8 -> 342
    //   337: aload 6
    //   339: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   342: aconst_null
    //   343: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   346: istore 9
    //   348: iload 9
    //   350: ifne +7 -> 357
    //   353: aconst_null
    //   354: invokestatic 101	com/vvt/capture/wechat/removeFromPath/d:removeFromPath	(Ljava/lang/String;)V
    //   357: aload 5
    //   359: athrow
    //   360: astore 12
    //   362: aload 5
    //   364: astore 6
    //   366: aload 12
    //   368: astore 5
    //   370: goto -38 -> 332
    //   373: astore 5
    //   375: iconst_0
    //   376: istore_3
    //   377: aconst_null
    //   378: astore 5
    //   380: goto -88 -> 292
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	383	0	this	MyUncaughtExceptionHandler
    //   2	199	1	l1	long
    //   6	371	3	bool1	boolean
    //   14	265	4	localFxSimpleEventReference	com.vvt.base.capture.FxSimpleEventReference
    //   24	284	5	localObject1	Object
    //   324	39	5	localObject2	Object
    //   368	1	5	localObject3	Object
    //   373	1	5	localException1	Exception
    //   378	1	5	localObject4	Object
    //   35	200	6	localObject5	Object
    //   290	1	6	localException2	Exception
    //   330	35	6	localObject6	Object
    //   41	20	7	str	String
    //   47	76	8	localObject7	Object
    //   72	80	9	bool2	boolean
    //   177	3	9	i	int
    //   212	137	9	bool3	boolean
    //   103	12	10	l2	long
    //   112	1	12	localObject8	Object
    //   360	7	12	localObject9	Object
    //   116	167	13	l3	long
    //   119	63	15	j	int
    //   128	3	16	bool4	boolean
    //   137	7	16	k	int
    //   171	13	17	l4	long
    //   202	3	19	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   98	103	290	java/lang/Exception
    //   146	149	290	java/lang/Exception
    //   161	166	290	java/lang/Exception
    //   166	171	290	java/lang/Exception
    //   209	212	290	java/lang/Exception
    //   219	223	290	java/lang/Exception
    //   225	230	290	java/lang/Exception
    //   234	239	290	java/lang/Exception
    //   282	287	290	java/lang/Exception
    //   21	24	324	finally
    //   31	35	324	finally
    //   37	41	324	finally
    //   43	47	324	finally
    //   49	54	324	finally
    //   62	67	324	finally
    //   69	72	324	finally
    //   79	84	324	finally
    //   91	96	324	finally
    //   98	103	360	finally
    //   146	149	360	finally
    //   161	166	360	finally
    //   166	171	360	finally
    //   209	212	360	finally
    //   219	223	360	finally
    //   225	230	360	finally
    //   234	239	360	finally
    //   282	287	360	finally
    //   292	295	360	finally
    //   21	24	373	java/lang/Exception
    //   31	35	373	java/lang/Exception
    //   37	41	373	java/lang/Exception
    //   43	47	373	java/lang/Exception
    //   49	54	373	java/lang/Exception
    //   62	67	373	java/lang/Exception
    //   69	72	373	java/lang/Exception
    //   79	84	373	java/lang/Exception
    //   91	96	373	java/lang/Exception
  }
  
  /* Error */
  public java.util.List a(int paramInt)
  {
    // Byte code:
    //   0: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: new 105	java/util/ArrayList
    //   11: astore_3
    //   12: aload_3
    //   13: invokespecial 106	java/util/ArrayList:<init>	()V
    //   16: invokestatic 48	com/vvt/capture/wechat/removeFromPath:a	()Ljava/lang/String;
    //   19: astore 4
    //   21: aload 4
    //   23: ifnull +331 -> 354
    //   26: aload_0
    //   27: getfield 36	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   30: astore 5
    //   32: aload_0
    //   33: getfield 38	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:f	Ljava/lang/String;
    //   36: astore 6
    //   38: aload_0
    //   39: getfield 40	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/base/removeFromPath;
    //   42: astore 7
    //   44: aload 7
    //   46: invokevirtual 52	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   49: astore 7
    //   51: aload 5
    //   53: aload 4
    //   55: aload 6
    //   57: aload 7
    //   59: invokestatic 57	com/vvt/capture/wechat/d:removeFromPath	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   62: astore 5
    //   64: aload_0
    //   65: getfield 36	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   68: astore 6
    //   70: aload_0
    //   71: getfield 38	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:f	Ljava/lang/String;
    //   74: astore 7
    //   76: aload_0
    //   77: getfield 40	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/base/removeFromPath;
    //   80: astore 8
    //   82: aload 8
    //   84: invokevirtual 52	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   87: astore 8
    //   89: aload 6
    //   91: aload 4
    //   93: aload 7
    //   95: aload 8
    //   97: invokestatic 108	com/vvt/capture/wechat/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   100: astore 6
    //   102: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   105: istore 9
    //   107: iload 9
    //   109: ifeq +3 -> 112
    //   112: aload 5
    //   114: invokestatic 67	com/vvt/capture/wechat/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   117: astore 10
    //   119: aload 6
    //   121: invokestatic 67	com/vvt/capture/wechat/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   124: astore 11
    //   126: aload 10
    //   128: invokestatic 70	com/vvt/capture/wechat/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;)J
    //   131: lstore 12
    //   133: iload_1
    //   134: aload 10
    //   136: invokestatic 111	com/vvt/capture/wechat/removeFromPath:a	(ILandroid/database/sqlite/SQLiteDatabase;)J
    //   139: lstore 14
    //   141: lconst_1
    //   142: lstore 16
    //   144: lload 14
    //   146: lload 16
    //   148: lsub
    //   149: lstore 18
    //   151: aload_0
    //   152: getfield 36	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   155: astore 5
    //   157: aload_0
    //   158: getfield 40	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/base/removeFromPath;
    //   161: astore 20
    //   163: aload 5
    //   165: lload 18
    //   167: lload 12
    //   169: aload 10
    //   171: aload 20
    //   173: aload 11
    //   175: aload 4
    //   177: invokestatic 116	com/vvt/capture/wechat/removeFromPath:a	(Ljava/lang/String;JJLandroid/database/sqlite/SQLiteDatabase;Lcom/vvt/base/removeFromPath;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/util/ArrayList;
    //   180: astore 5
    //   182: aload_3
    //   183: aload 5
    //   185: invokeinterface 122 2 0
    //   190: pop
    //   191: aload 10
    //   193: ifnull +8 -> 201
    //   196: aload 10
    //   198: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   201: aload 11
    //   203: ifnull +8 -> 211
    //   206: aload 11
    //   208: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   211: aconst_null
    //   212: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   215: istore_2
    //   216: iload_2
    //   217: ifne +7 -> 224
    //   220: aconst_null
    //   221: invokestatic 101	com/vvt/capture/wechat/removeFromPath/d:removeFromPath	(Ljava/lang/String;)V
    //   224: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   227: istore_2
    //   228: iload_2
    //   229: ifeq +3 -> 232
    //   232: aload_3
    //   233: areturn
    //   234: astore 5
    //   236: aconst_null
    //   237: astore 11
    //   239: aconst_null
    //   240: astore 10
    //   242: getstatic 28	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   245: istore_2
    //   246: iload_2
    //   247: ifeq +3 -> 250
    //   250: aload 10
    //   252: ifnull +8 -> 260
    //   255: aload 10
    //   257: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   260: aload 11
    //   262: ifnull +8 -> 270
    //   265: aload 11
    //   267: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   270: aconst_null
    //   271: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   274: istore_2
    //   275: iload_2
    //   276: ifne -52 -> 224
    //   279: goto -59 -> 220
    //   282: astore 5
    //   284: aconst_null
    //   285: astore 11
    //   287: aconst_null
    //   288: astore 10
    //   290: aload 10
    //   292: ifnull +8 -> 300
    //   295: aload 10
    //   297: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   300: aload 11
    //   302: ifnull +8 -> 310
    //   305: aload 11
    //   307: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   310: aconst_null
    //   311: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   314: istore 21
    //   316: iload 21
    //   318: ifne +7 -> 325
    //   321: aconst_null
    //   322: invokestatic 101	com/vvt/capture/wechat/removeFromPath/d:removeFromPath	(Ljava/lang/String;)V
    //   325: aload 5
    //   327: athrow
    //   328: astore 5
    //   330: aconst_null
    //   331: astore 11
    //   333: goto -43 -> 290
    //   336: astore 5
    //   338: goto -48 -> 290
    //   341: astore 5
    //   343: aconst_null
    //   344: astore 11
    //   346: goto -104 -> 242
    //   349: astore 5
    //   351: goto -109 -> 242
    //   354: aconst_null
    //   355: astore 11
    //   357: aconst_null
    //   358: astore 10
    //   360: goto -169 -> 191
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	363	0	this	MyUncaughtExceptionHandler
    //   0	363	1	paramInt	int
    //   3	273	2	bool1	boolean
    //   11	222	3	localArrayList	java.util.ArrayList
    //   19	157	4	str1	String
    //   30	154	5	localObject1	Object
    //   234	1	5	localException1	Exception
    //   282	44	5	localObject2	Object
    //   328	1	5	localObject3	Object
    //   336	1	5	localObject4	Object
    //   341	1	5	localException2	Exception
    //   349	1	5	localException3	Exception
    //   36	84	6	str2	String
    //   42	52	7	localObject5	Object
    //   80	16	8	localObject6	Object
    //   105	3	9	bool2	boolean
    //   117	242	10	localSQLiteDatabase1	android.database.sqlite.SQLiteDatabase
    //   124	232	11	localSQLiteDatabase2	android.database.sqlite.SQLiteDatabase
    //   131	37	12	l1	long
    //   139	6	14	l2	long
    //   142	5	16	l3	long
    //   149	17	18	l4	long
    //   161	11	20	localb	removeFromPath
    //   314	3	21	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   16	19	234	java/lang/Exception
    //   26	30	234	java/lang/Exception
    //   32	36	234	java/lang/Exception
    //   38	42	234	java/lang/Exception
    //   44	49	234	java/lang/Exception
    //   57	62	234	java/lang/Exception
    //   64	68	234	java/lang/Exception
    //   70	74	234	java/lang/Exception
    //   76	80	234	java/lang/Exception
    //   82	87	234	java/lang/Exception
    //   95	100	234	java/lang/Exception
    //   102	105	234	java/lang/Exception
    //   112	117	234	java/lang/Exception
    //   16	19	282	finally
    //   26	30	282	finally
    //   32	36	282	finally
    //   38	42	282	finally
    //   44	49	282	finally
    //   57	62	282	finally
    //   64	68	282	finally
    //   70	74	282	finally
    //   76	80	282	finally
    //   82	87	282	finally
    //   95	100	282	finally
    //   102	105	282	finally
    //   112	117	282	finally
    //   119	124	328	finally
    //   126	131	336	finally
    //   134	139	336	finally
    //   151	155	336	finally
    //   157	161	336	finally
    //   175	180	336	finally
    //   183	191	336	finally
    //   242	245	336	finally
    //   119	124	341	java/lang/Exception
    //   126	131	349	java/lang/Exception
    //   134	139	349	java/lang/Exception
    //   151	155	349	java/lang/Exception
    //   157	161	349	java/lang/Exception
    //   175	180	349	java/lang/Exception
    //   183	191	349	java/lang/Exception
  }
  
  /* Error */
  public java.util.List a(com.vvt.base.capture.g paramg1, com.vvt.base.capture.g paramg2)
  {
    // Byte code:
    //   0: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   3: istore_3
    //   4: iload_3
    //   5: ifeq +3 -> 8
    //   8: new 105	java/util/ArrayList
    //   11: astore 4
    //   13: aload 4
    //   15: invokespecial 106	java/util/ArrayList:<init>	()V
    //   18: aload_1
    //   19: invokeinterface 128 1 0
    //   24: astore 5
    //   26: aload 5
    //   28: checkcast 83	java/lang/Long
    //   31: astore 5
    //   33: aload 5
    //   35: invokevirtual 132	java/lang/Long:longValue	()J
    //   38: lstore 6
    //   40: aload_2
    //   41: invokeinterface 128 1 0
    //   46: astore 5
    //   48: aload 5
    //   50: checkcast 83	java/lang/Long
    //   53: astore 5
    //   55: aload 5
    //   57: invokevirtual 132	java/lang/Long:longValue	()J
    //   60: lstore 8
    //   62: invokestatic 48	com/vvt/capture/wechat/removeFromPath:a	()Ljava/lang/String;
    //   65: astore 10
    //   67: aload 10
    //   69: ifnull +220 -> 289
    //   72: aload_0
    //   73: getfield 36	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   76: astore 5
    //   78: aload_0
    //   79: getfield 38	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:f	Ljava/lang/String;
    //   82: astore 11
    //   84: aload_0
    //   85: getfield 40	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/base/removeFromPath;
    //   88: astore 12
    //   90: aload 12
    //   92: invokevirtual 52	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   95: astore 12
    //   97: aload 5
    //   99: aload 10
    //   101: aload 11
    //   103: aload 12
    //   105: invokestatic 57	com/vvt/capture/wechat/d:removeFromPath	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   108: astore 5
    //   110: aload_0
    //   111: getfield 36	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   114: astore 11
    //   116: aload_0
    //   117: getfield 38	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:f	Ljava/lang/String;
    //   120: astore 12
    //   122: aload_0
    //   123: getfield 40	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/base/removeFromPath;
    //   126: astore 13
    //   128: aload 13
    //   130: invokevirtual 52	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   133: astore 13
    //   135: aload 11
    //   137: aload 10
    //   139: aload 12
    //   141: aload 13
    //   143: invokestatic 108	com/vvt/capture/wechat/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   146: astore 12
    //   148: aload 5
    //   150: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   153: istore 14
    //   155: iload 14
    //   157: ifne +112 -> 269
    //   160: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   163: istore 14
    //   165: iload 14
    //   167: ifeq +3 -> 170
    //   170: aload 5
    //   172: invokestatic 67	com/vvt/capture/wechat/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   175: astore 11
    //   177: aload 12
    //   179: invokestatic 67	com/vvt/capture/wechat/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   182: astore 13
    //   184: aload_0
    //   185: getfield 36	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   188: astore 5
    //   190: aload_0
    //   191: getfield 40	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:FxFileObserverWorker	Lcom/vvt/base/removeFromPath;
    //   194: astore 12
    //   196: aload 5
    //   198: lload 6
    //   200: lload 8
    //   202: aload 11
    //   204: aload 12
    //   206: aload 13
    //   208: aload 10
    //   210: invokestatic 116	com/vvt/capture/wechat/removeFromPath:a	(Ljava/lang/String;JJLandroid/database/sqlite/SQLiteDatabase;Lcom/vvt/base/removeFromPath;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/util/ArrayList;
    //   213: astore 5
    //   215: aload 4
    //   217: aload 5
    //   219: invokeinterface 122 2 0
    //   224: pop
    //   225: aload 11
    //   227: ifnull +8 -> 235
    //   230: aload 11
    //   232: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   235: aload 13
    //   237: ifnull +8 -> 245
    //   240: aload 13
    //   242: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   245: aconst_null
    //   246: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   249: istore_3
    //   250: iload_3
    //   251: ifne +7 -> 258
    //   254: aconst_null
    //   255: invokestatic 101	com/vvt/capture/wechat/removeFromPath/d:removeFromPath	(Ljava/lang/String;)V
    //   258: getstatic 22	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:a	Z
    //   261: istore_3
    //   262: iload_3
    //   263: ifeq +3 -> 266
    //   266: aload 4
    //   268: areturn
    //   269: getstatic 28	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   272: istore_3
    //   273: iload_3
    //   274: ifeq +3 -> 277
    //   277: aconst_null
    //   278: astore 13
    //   280: iconst_0
    //   281: istore 14
    //   283: aconst_null
    //   284: astore 11
    //   286: goto -61 -> 225
    //   289: getstatic 28	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   292: istore_3
    //   293: iload_3
    //   294: ifeq -17 -> 277
    //   297: goto -20 -> 277
    //   300: astore 5
    //   302: aconst_null
    //   303: astore 13
    //   305: iconst_0
    //   306: istore 14
    //   308: aconst_null
    //   309: astore 11
    //   311: getstatic 28	com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   314: istore_3
    //   315: iload_3
    //   316: ifeq +3 -> 319
    //   319: aload 11
    //   321: ifnull +8 -> 329
    //   324: aload 11
    //   326: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   329: aload 13
    //   331: ifnull +8 -> 339
    //   334: aload 13
    //   336: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   339: aconst_null
    //   340: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   343: istore_3
    //   344: iload_3
    //   345: ifne -87 -> 258
    //   348: goto -94 -> 254
    //   351: astore 5
    //   353: aconst_null
    //   354: astore 13
    //   356: iconst_0
    //   357: istore 14
    //   359: aconst_null
    //   360: astore 11
    //   362: aload 11
    //   364: ifnull +8 -> 372
    //   367: aload 11
    //   369: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   372: aload 13
    //   374: ifnull +8 -> 382
    //   377: aload 13
    //   379: invokevirtual 96	android/database/sqlite/SQLiteDatabase:close	()V
    //   382: aconst_null
    //   383: invokestatic 62	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   386: istore 15
    //   388: iload 15
    //   390: ifne +7 -> 397
    //   393: aconst_null
    //   394: invokestatic 101	com/vvt/capture/wechat/removeFromPath/d:removeFromPath	(Ljava/lang/String;)V
    //   397: aload 5
    //   399: athrow
    //   400: astore 5
    //   402: aconst_null
    //   403: astore 13
    //   405: goto -43 -> 362
    //   408: astore 5
    //   410: goto -48 -> 362
    //   413: astore 5
    //   415: aconst_null
    //   416: astore 13
    //   418: goto -107 -> 311
    //   421: astore 5
    //   423: goto -112 -> 311
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	426	0	this	MyUncaughtExceptionHandler
    //   0	426	1	paramg1	com.vvt.base.capture.FxFileObserverWorker
    //   0	426	2	paramg2	com.vvt.base.capture.FxFileObserverWorker
    //   3	342	3	bool1	boolean
    //   11	256	4	localArrayList	java.util.ArrayList
    //   24	194	5	localObject1	Object
    //   300	1	5	localException1	Exception
    //   351	47	5	localObject2	Object
    //   400	1	5	localObject3	Object
    //   408	1	5	localObject4	Object
    //   413	1	5	localException2	Exception
    //   421	1	5	localException3	Exception
    //   38	161	6	l1	long
    //   60	141	8	l2	long
    //   65	144	10	str	String
    //   82	286	11	localObject5	Object
    //   88	117	12	localObject6	Object
    //   126	291	13	localObject7	Object
    //   153	205	14	bool2	boolean
    //   386	3	15	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   18	24	300	java/lang/Exception
    //   26	31	300	java/lang/Exception
    //   33	38	300	java/lang/Exception
    //   40	46	300	java/lang/Exception
    //   48	53	300	java/lang/Exception
    //   55	60	300	java/lang/Exception
    //   62	65	300	java/lang/Exception
    //   72	76	300	java/lang/Exception
    //   78	82	300	java/lang/Exception
    //   84	88	300	java/lang/Exception
    //   90	95	300	java/lang/Exception
    //   103	108	300	java/lang/Exception
    //   110	114	300	java/lang/Exception
    //   116	120	300	java/lang/Exception
    //   122	126	300	java/lang/Exception
    //   128	133	300	java/lang/Exception
    //   141	146	300	java/lang/Exception
    //   148	153	300	java/lang/Exception
    //   160	163	300	java/lang/Exception
    //   170	175	300	java/lang/Exception
    //   269	272	300	java/lang/Exception
    //   289	292	300	java/lang/Exception
    //   18	24	351	finally
    //   26	31	351	finally
    //   33	38	351	finally
    //   40	46	351	finally
    //   48	53	351	finally
    //   55	60	351	finally
    //   62	65	351	finally
    //   72	76	351	finally
    //   78	82	351	finally
    //   84	88	351	finally
    //   90	95	351	finally
    //   103	108	351	finally
    //   110	114	351	finally
    //   116	120	351	finally
    //   122	126	351	finally
    //   128	133	351	finally
    //   141	146	351	finally
    //   148	153	351	finally
    //   160	163	351	finally
    //   170	175	351	finally
    //   269	272	351	finally
    //   289	292	351	finally
    //   177	182	400	finally
    //   184	188	408	finally
    //   190	194	408	finally
    //   208	213	408	finally
    //   217	225	408	finally
    //   311	314	408	finally
    //   177	182	413	java/lang/Exception
    //   184	188	421	java/lang/Exception
    //   190	194	421	java/lang/Exception
    //   208	213	421	java/lang/Exception
    //   217	225	421	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */