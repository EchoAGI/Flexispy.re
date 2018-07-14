package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxRecipientType;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;

public class n
{
  public static long a(SQLiteDatabase paramSQLiteDatabase, long paramLong, FxEventType paramFxEventType, FxEventDirection paramFxEventDirection)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Long.valueOf(paramLong);
    localContentValues.put("event_id", (Long)localObject1);
    localObject1 = Integer.valueOf(paramFxEventType.getNumber());
    localContentValues.put("event_type", (Integer)localObject1);
    localObject1 = Integer.valueOf(paramFxEventDirection.getNumber());
    localContentValues.put("direction", (Integer)localObject1);
    Object localObject2 = "event_base";
    localObject1 = null;
    try
    {
      return paramSQLiteDatabase.insert((String)localObject2, null, localContentValues);
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localSQLiteDatabaseCorruptException = localSQLiteDatabaseCorruptException;
      localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
      String str = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject2).<init>(str);
      throw ((Throwable)localObject2);
    }
    finally
    {
      localThrowable = finally;
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject1 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject1, localThrowable);
      throw ((Throwable)localObject2);
    }
  }
  
  public static Cursor a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str1 = null;
    SQLiteDatabase localSQLiteDatabase = paramSQLiteDatabase;
    Object localObject = paramString1;
    try
    {
      return paramSQLiteDatabase.query(paramString1, null, paramString2, null, null, null, paramString3, paramString4);
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localSQLiteDatabaseCorruptException = localSQLiteDatabaseCorruptException;
      localObject = new com/vvt/exceptions/database/FxDbCorruptException;
      String str2 = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject).<init>(str2);
      throw ((Throwable)localObject);
    }
    finally
    {
      localThrowable = finally;
      localObject = new com/vvt/exceptions/database/FxDbOperationException;
      str1 = localThrowable.getMessage();
      ((FxDbOperationException)localObject).<init>(str1, localThrowable);
      throw ((Throwable)localObject);
    }
  }
  
  public static FxRecipientType a(int paramInt)
  {
    FxRecipientType localFxRecipientType = FxRecipientType.CC;
    int i = localFxRecipientType.getNumber();
    if (paramInt == i) {
      localFxRecipientType = FxRecipientType.CC;
    }
    for (;;)
    {
      return localFxRecipientType;
      localFxRecipientType = FxRecipientType.BCC;
      i = localFxRecipientType.getNumber();
      if (paramInt == i) {
        localFxRecipientType = FxRecipientType.BCC;
      } else {
        localFxRecipientType = FxRecipientType.TO;
      }
    }
  }
  
  public static String a(QueryOrder paramQueryOrder)
  {
    String str = "_id DESC";
    QueryOrder localQueryOrder = QueryOrder.QueryOldestFist;
    if (paramQueryOrder == localQueryOrder) {
      str = "_id ASC";
    }
    return str;
  }
  
  /* Error */
  public static java.util.List a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: new 99	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 100	java/util/ArrayList:<init>	()V
    //   8: ldc 102
    //   10: astore_3
    //   11: iconst_0
    //   12: istore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: aload_0
    //   18: astore 6
    //   20: aload_1
    //   21: astore 7
    //   23: aload_0
    //   24: aload_3
    //   25: aconst_null
    //   26: aload_1
    //   27: aconst_null
    //   28: aconst_null
    //   29: aconst_null
    //   30: aconst_null
    //   31: invokevirtual 105	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore_3
    //   35: aload_3
    //   36: ifnull +167 -> 203
    //   39: aload_3
    //   40: invokeinterface 111 1 0
    //   45: istore 8
    //   47: iload 8
    //   49: ifeq +154 -> 203
    //   52: new 113	com/vvt/events/FxFileObserverWorker
    //   55: astore 6
    //   57: aload 6
    //   59: invokespecial 114	com/vvt/events/FxFileObserverWorker:<init>	()V
    //   62: ldc 116
    //   64: astore 5
    //   66: aload_3
    //   67: aload 5
    //   69: invokeinterface 120 2 0
    //   74: istore 4
    //   76: aload_3
    //   77: iload 4
    //   79: invokeinterface 124 2 0
    //   84: astore 5
    //   86: ldc 126
    //   88: astore 7
    //   90: aload_3
    //   91: aload 7
    //   93: invokeinterface 120 2 0
    //   98: istore 9
    //   100: aload_3
    //   101: iload 9
    //   103: invokeinterface 124 2 0
    //   108: astore 7
    //   110: aload 6
    //   112: aload 5
    //   114: invokevirtual 129	com/vvt/events/FxFileObserverWorker:a	(Ljava/lang/String;)V
    //   117: aload 6
    //   119: aload 7
    //   121: invokevirtual 132	com/vvt/events/FxFileObserverWorker:removeFromPath	(Ljava/lang/String;)V
    //   124: aload_2
    //   125: aload 6
    //   127: invokeinterface 138 2 0
    //   132: pop
    //   133: goto -94 -> 39
    //   136: astore 6
    //   138: new 53	com/vvt/exceptions/database/FxDbCorruptException
    //   141: astore 5
    //   143: aload 6
    //   145: invokevirtual 59	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   148: astore 6
    //   150: aload 5
    //   152: aload 6
    //   154: invokespecial 62	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   157: aload 5
    //   159: athrow
    //   160: astore 6
    //   162: aload_3
    //   163: ifnull +9 -> 172
    //   166: aload_3
    //   167: invokeinterface 141 1 0
    //   172: aload 6
    //   174: athrow
    //   175: astore 6
    //   177: aconst_null
    //   178: astore_3
    //   179: new 64	com/vvt/exceptions/database/FxDbOperationException
    //   182: astore 5
    //   184: aload 6
    //   186: invokevirtual 67	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   189: astore 7
    //   191: aload 5
    //   193: aload 7
    //   195: aload 6
    //   197: invokespecial 70	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   200: aload 5
    //   202: athrow
    //   203: aload_3
    //   204: ifnull +9 -> 213
    //   207: aload_3
    //   208: invokeinterface 141 1 0
    //   213: aload_2
    //   214: areturn
    //   215: astore 6
    //   217: goto -38 -> 179
    //   220: astore 6
    //   222: aconst_null
    //   223: astore_3
    //   224: goto -86 -> 138
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	227	1	paramString	String
    //   3	211	2	localArrayList	java.util.ArrayList
    //   10	214	3	localObject1	Object
    //   12	66	4	i	int
    //   15	186	5	localObject2	Object
    //   18	108	6	localObject3	Object
    //   136	8	6	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   148	5	6	str1	String
    //   160	13	6	localObject4	Object
    //   175	21	6	localThrowable	Throwable
    //   215	1	6	localObject5	Object
    //   220	1	6	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   21	173	7	str2	String
    //   45	3	8	bool	boolean
    //   98	4	9	j	int
    // Exception table:
    //   from	to	target	type
    //   39	45	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   52	55	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   57	62	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   67	74	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   77	84	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   91	98	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   101	108	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   112	117	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   119	124	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   125	133	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   138	141	160	finally
    //   143	148	160	finally
    //   152	157	160	finally
    //   157	160	160	finally
    //   179	182	160	finally
    //   184	189	160	finally
    //   195	200	160	finally
    //   200	203	160	finally
    //   30	34	175	finally
    //   39	45	215	finally
    //   52	55	215	finally
    //   57	62	215	finally
    //   67	74	215	finally
    //   77	84	215	finally
    //   91	98	215	finally
    //   101	108	215	finally
    //   112	117	215	finally
    //   119	124	215	finally
    //   125	133	215	finally
    //   30	34	220	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  /* Error */
  public static java.util.List b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: new 99	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 100	java/util/ArrayList:<init>	()V
    //   8: ldc -113
    //   10: astore_3
    //   11: iconst_0
    //   12: istore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: iconst_0
    //   18: istore 6
    //   20: aconst_null
    //   21: astore 7
    //   23: iconst_0
    //   24: istore 8
    //   26: aconst_null
    //   27: astore 9
    //   29: aload_0
    //   30: astore 10
    //   32: aload_1
    //   33: astore 11
    //   35: aload_0
    //   36: aload_3
    //   37: aconst_null
    //   38: aload_1
    //   39: aconst_null
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: invokevirtual 105	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore_3
    //   47: aload_3
    //   48: ifnull +229 -> 277
    //   51: aload_3
    //   52: invokeinterface 111 1 0
    //   57: istore 12
    //   59: iload 12
    //   61: ifeq +216 -> 277
    //   64: new 145	com/vvt/events/d
    //   67: astore 10
    //   69: aload 10
    //   71: invokespecial 146	com/vvt/events/d:<init>	()V
    //   74: ldc -108
    //   76: astore 5
    //   78: aload_3
    //   79: aload 5
    //   81: invokeinterface 120 2 0
    //   86: istore 4
    //   88: aload_3
    //   89: iload 4
    //   91: invokeinterface 124 2 0
    //   96: astore 5
    //   98: ldc -106
    //   100: astore 11
    //   102: aload_3
    //   103: aload 11
    //   105: invokeinterface 120 2 0
    //   110: istore 13
    //   112: aload_3
    //   113: iload 13
    //   115: invokeinterface 124 2 0
    //   120: astore 11
    //   122: ldc -104
    //   124: astore 7
    //   126: aload_3
    //   127: aload 7
    //   129: invokeinterface 120 2 0
    //   134: istore 6
    //   136: aload_3
    //   137: iload 6
    //   139: invokeinterface 124 2 0
    //   144: astore 7
    //   146: ldc -102
    //   148: astore 9
    //   150: aload_3
    //   151: aload 9
    //   153: invokeinterface 120 2 0
    //   158: istore 8
    //   160: aload_3
    //   161: iload 8
    //   163: invokeinterface 124 2 0
    //   168: astore 9
    //   170: aload 10
    //   172: aload 5
    //   174: invokevirtual 155	com/vvt/events/d:a	(Ljava/lang/String;)V
    //   177: aload 10
    //   179: aload 11
    //   181: invokevirtual 156	com/vvt/events/d:removeFromPath	(Ljava/lang/String;)V
    //   184: aload 10
    //   186: aload 7
    //   188: invokevirtual 159	com/vvt/events/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   191: aload 10
    //   193: aload 9
    //   195: invokevirtual 162	com/vvt/events/d:d	(Ljava/lang/String;)V
    //   198: aload_2
    //   199: aload 10
    //   201: invokeinterface 138 2 0
    //   206: pop
    //   207: goto -156 -> 51
    //   210: astore 10
    //   212: new 53	com/vvt/exceptions/database/FxDbCorruptException
    //   215: astore 5
    //   217: aload 10
    //   219: invokevirtual 59	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   222: astore 10
    //   224: aload 5
    //   226: aload 10
    //   228: invokespecial 62	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   231: aload 5
    //   233: athrow
    //   234: astore 10
    //   236: aload_3
    //   237: ifnull +9 -> 246
    //   240: aload_3
    //   241: invokeinterface 141 1 0
    //   246: aload 10
    //   248: athrow
    //   249: astore 10
    //   251: aconst_null
    //   252: astore_3
    //   253: new 64	com/vvt/exceptions/database/FxDbOperationException
    //   256: astore 5
    //   258: aload 10
    //   260: invokevirtual 67	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   263: astore 11
    //   265: aload 5
    //   267: aload 11
    //   269: aload 10
    //   271: invokespecial 70	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   274: aload 5
    //   276: athrow
    //   277: aload_3
    //   278: ifnull +9 -> 287
    //   281: aload_3
    //   282: invokeinterface 141 1 0
    //   287: aload_2
    //   288: areturn
    //   289: astore 10
    //   291: goto -38 -> 253
    //   294: astore 10
    //   296: aconst_null
    //   297: astore_3
    //   298: goto -86 -> 212
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	301	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	301	1	paramString	String
    //   3	285	2	localArrayList	java.util.ArrayList
    //   10	288	3	localObject1	Object
    //   12	78	4	i	int
    //   15	260	5	localObject2	Object
    //   18	120	6	j	int
    //   21	166	7	str1	String
    //   24	138	8	k	int
    //   27	167	9	str2	String
    //   30	170	10	localObject3	Object
    //   210	8	10	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   222	5	10	str3	String
    //   234	13	10	localObject4	Object
    //   249	21	10	localThrowable	Throwable
    //   289	1	10	localObject5	Object
    //   294	1	10	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   33	235	11	str4	String
    //   57	3	12	bool	boolean
    //   110	4	13	m	int
    // Exception table:
    //   from	to	target	type
    //   51	57	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   64	67	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   69	74	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   79	86	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   89	96	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   103	110	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   113	120	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   127	134	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   137	144	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   151	158	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   161	168	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   172	177	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   179	184	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   186	191	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   193	198	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   199	207	210	android/database/sqlite/SQLiteDatabaseCorruptException
    //   212	215	234	finally
    //   217	222	234	finally
    //   226	231	234	finally
    //   231	234	234	finally
    //   253	256	234	finally
    //   258	263	234	finally
    //   269	274	234	finally
    //   274	277	234	finally
    //   42	46	249	finally
    //   51	57	289	finally
    //   64	67	289	finally
    //   69	74	289	finally
    //   79	86	289	finally
    //   89	96	289	finally
    //   103	110	289	finally
    //   113	120	289	finally
    //   127	134	289	finally
    //   137	144	289	finally
    //   151	158	289	finally
    //   161	168	289	finally
    //   172	177	289	finally
    //   179	184	289	finally
    //   186	191	289	finally
    //   193	198	289	finally
    //   199	207	289	finally
    //   42	46	294	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  /* Error */
  public static java.util.List c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: new 99	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 100	java/util/ArrayList:<init>	()V
    //   8: ldc -92
    //   10: astore_3
    //   11: iconst_0
    //   12: istore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: iconst_0
    //   18: istore 6
    //   20: aconst_null
    //   21: astore 7
    //   23: iconst_0
    //   24: istore 8
    //   26: fconst_0
    //   27: fstore 9
    //   29: aconst_null
    //   30: astore 10
    //   32: aload_0
    //   33: astore 11
    //   35: aload_1
    //   36: astore 12
    //   38: aload_0
    //   39: aload_3
    //   40: aconst_null
    //   41: aload_1
    //   42: aconst_null
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: invokevirtual 105	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore_3
    //   50: aload_3
    //   51: ifnull +229 -> 280
    //   54: aload_3
    //   55: invokeinterface 111 1 0
    //   60: istore 13
    //   62: iload 13
    //   64: ifeq +216 -> 280
    //   67: new 166	com/vvt/events/e
    //   70: astore 11
    //   72: aload 11
    //   74: invokespecial 167	com/vvt/events/e:<init>	()V
    //   77: ldc -87
    //   79: astore 5
    //   81: aload_3
    //   82: aload 5
    //   84: invokeinterface 120 2 0
    //   89: istore 4
    //   91: aload_3
    //   92: iload 4
    //   94: invokeinterface 124 2 0
    //   99: astore 5
    //   101: ldc -85
    //   103: astore 12
    //   105: aload_3
    //   106: aload 12
    //   108: invokeinterface 120 2 0
    //   113: istore 14
    //   115: aload_3
    //   116: iload 14
    //   118: invokeinterface 175 2 0
    //   123: dstore 15
    //   125: ldc -79
    //   127: astore 7
    //   129: aload_3
    //   130: aload 7
    //   132: invokeinterface 120 2 0
    //   137: istore 6
    //   139: aload_3
    //   140: iload 6
    //   142: invokeinterface 175 2 0
    //   147: dstore 17
    //   149: ldc -77
    //   151: astore 10
    //   153: aload_3
    //   154: aload 10
    //   156: invokeinterface 120 2 0
    //   161: istore 8
    //   163: aload_3
    //   164: iload 8
    //   166: invokeinterface 183 2 0
    //   171: fstore 9
    //   173: aload 11
    //   175: fload 9
    //   177: invokevirtual 186	com/vvt/events/e:a	(F)V
    //   180: aload 11
    //   182: dload 15
    //   184: invokevirtual 189	com/vvt/events/e:a	(D)V
    //   187: aload 11
    //   189: dload 17
    //   191: invokevirtual 191	com/vvt/events/e:removeFromPath	(D)V
    //   194: aload 11
    //   196: aload 5
    //   198: invokevirtual 192	com/vvt/events/e:a	(Ljava/lang/String;)V
    //   201: aload_2
    //   202: aload 11
    //   204: invokeinterface 138 2 0
    //   209: pop
    //   210: goto -156 -> 54
    //   213: astore 11
    //   215: new 53	com/vvt/exceptions/database/FxDbCorruptException
    //   218: astore 5
    //   220: aload 11
    //   222: invokevirtual 59	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   225: astore 11
    //   227: aload 5
    //   229: aload 11
    //   231: invokespecial 62	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   234: aload 5
    //   236: athrow
    //   237: astore 11
    //   239: aload_3
    //   240: ifnull +9 -> 249
    //   243: aload_3
    //   244: invokeinterface 141 1 0
    //   249: aload 11
    //   251: athrow
    //   252: astore 11
    //   254: aconst_null
    //   255: astore_3
    //   256: new 64	com/vvt/exceptions/database/FxDbOperationException
    //   259: astore 5
    //   261: aload 11
    //   263: invokevirtual 67	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   266: astore 12
    //   268: aload 5
    //   270: aload 12
    //   272: aload 11
    //   274: invokespecial 70	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   277: aload 5
    //   279: athrow
    //   280: aload_3
    //   281: ifnull +9 -> 290
    //   284: aload_3
    //   285: invokeinterface 141 1 0
    //   290: aload_2
    //   291: areturn
    //   292: astore 11
    //   294: goto -38 -> 256
    //   297: astore 11
    //   299: aconst_null
    //   300: astore_3
    //   301: goto -86 -> 215
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	304	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	304	1	paramString	String
    //   3	288	2	localArrayList	java.util.ArrayList
    //   10	291	3	localObject1	Object
    //   12	81	4	i	int
    //   15	263	5	localObject2	Object
    //   18	123	6	j	int
    //   21	110	7	str1	String
    //   24	141	8	k	int
    //   27	149	9	f	float
    //   30	125	10	str2	String
    //   33	170	11	localObject3	Object
    //   213	8	11	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   225	5	11	str3	String
    //   237	13	11	localObject4	Object
    //   252	21	11	localThrowable	Throwable
    //   292	1	11	localObject5	Object
    //   297	1	11	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   36	235	12	str4	String
    //   60	3	13	bool	boolean
    //   113	4	14	m	int
    //   123	60	15	d1	double
    //   147	43	17	d2	double
    // Exception table:
    //   from	to	target	type
    //   54	60	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   67	70	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   72	77	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   82	89	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   92	99	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   106	113	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   116	123	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   130	137	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   140	147	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   154	161	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   164	171	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   175	180	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   182	187	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   189	194	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   196	201	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   202	210	213	android/database/sqlite/SQLiteDatabaseCorruptException
    //   215	218	237	finally
    //   220	225	237	finally
    //   229	234	237	finally
    //   234	237	237	finally
    //   256	259	237	finally
    //   261	266	237	finally
    //   272	277	237	finally
    //   277	280	237	finally
    //   45	49	252	finally
    //   54	60	292	finally
    //   67	70	292	finally
    //   72	77	292	finally
    //   82	89	292	finally
    //   92	99	292	finally
    //   106	113	292	finally
    //   116	123	292	finally
    //   130	137	292	finally
    //   140	147	292	finally
    //   154	161	292	finally
    //   164	171	292	finally
    //   175	180	292	finally
    //   182	187	292	finally
    //   189	194	292	finally
    //   196	201	292	finally
    //   202	210	292	finally
    //   45	49	297	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  /* Error */
  public static java.util.HashSet d(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: new 194	java/util/HashSet
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 195	java/util/HashSet:<init>	()V
    //   8: ldc -59
    //   10: astore_3
    //   11: aconst_null
    //   12: astore 4
    //   14: aload_0
    //   15: astore 5
    //   17: aload_1
    //   18: astore 6
    //   20: aload_0
    //   21: aload_3
    //   22: aconst_null
    //   23: aload_1
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokevirtual 105	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore_3
    //   32: aload_3
    //   33: ifnull +122 -> 155
    //   36: aload_3
    //   37: invokeinterface 111 1 0
    //   42: istore 7
    //   44: iload 7
    //   46: ifeq +109 -> 155
    //   49: ldc -57
    //   51: astore 5
    //   53: aload_3
    //   54: aload 5
    //   56: invokeinterface 120 2 0
    //   61: istore 7
    //   63: aload_3
    //   64: iload 7
    //   66: invokeinterface 124 2 0
    //   71: astore 5
    //   73: aload 5
    //   75: ifnull -39 -> 36
    //   78: aload_2
    //   79: aload 5
    //   81: invokevirtual 200	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   84: pop
    //   85: goto -49 -> 36
    //   88: astore 5
    //   90: new 53	com/vvt/exceptions/database/FxDbCorruptException
    //   93: astore 4
    //   95: aload 5
    //   97: invokevirtual 59	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   100: astore 5
    //   102: aload 4
    //   104: aload 5
    //   106: invokespecial 62	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   109: aload 4
    //   111: athrow
    //   112: astore 5
    //   114: aload_3
    //   115: ifnull +9 -> 124
    //   118: aload_3
    //   119: invokeinterface 141 1 0
    //   124: aload 5
    //   126: athrow
    //   127: astore 5
    //   129: aconst_null
    //   130: astore_3
    //   131: new 64	com/vvt/exceptions/database/FxDbOperationException
    //   134: astore 4
    //   136: aload 5
    //   138: invokevirtual 67	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   141: astore 6
    //   143: aload 4
    //   145: aload 6
    //   147: aload 5
    //   149: invokespecial 70	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   152: aload 4
    //   154: athrow
    //   155: aload_3
    //   156: ifnull +9 -> 165
    //   159: aload_3
    //   160: invokeinterface 141 1 0
    //   165: aload_2
    //   166: areturn
    //   167: astore 5
    //   169: goto -38 -> 131
    //   172: astore 5
    //   174: aconst_null
    //   175: astore_3
    //   176: goto -86 -> 90
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	179	1	paramString	String
    //   3	163	2	localHashSet	java.util.HashSet
    //   10	166	3	localObject1	Object
    //   12	141	4	localObject2	Object
    //   15	65	5	localObject3	Object
    //   88	8	5	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   100	5	5	str1	String
    //   112	13	5	localObject4	Object
    //   127	21	5	localThrowable	Throwable
    //   167	1	5	localObject5	Object
    //   172	1	5	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   18	128	6	str2	String
    //   42	3	7	bool	boolean
    //   61	4	7	i	int
    // Exception table:
    //   from	to	target	type
    //   36	42	88	android/database/sqlite/SQLiteDatabaseCorruptException
    //   54	61	88	android/database/sqlite/SQLiteDatabaseCorruptException
    //   64	71	88	android/database/sqlite/SQLiteDatabaseCorruptException
    //   79	85	88	android/database/sqlite/SQLiteDatabaseCorruptException
    //   90	93	112	finally
    //   95	100	112	finally
    //   104	109	112	finally
    //   109	112	112	finally
    //   131	134	112	finally
    //   136	141	112	finally
    //   147	152	112	finally
    //   152	155	112	finally
    //   27	31	127	finally
    //   36	42	167	finally
    //   54	61	167	finally
    //   64	71	167	finally
    //   79	85	167	finally
    //   27	31	172	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  /* Error */
  public static java.util.List e(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: new 99	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 100	java/util/ArrayList:<init>	()V
    //   8: ldc -54
    //   10: astore_3
    //   11: iconst_0
    //   12: istore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: iconst_0
    //   18: istore 6
    //   20: aconst_null
    //   21: astore 7
    //   23: aload_0
    //   24: astore 8
    //   26: aload_1
    //   27: astore 9
    //   29: aload_0
    //   30: aload_3
    //   31: aconst_null
    //   32: aload_1
    //   33: aconst_null
    //   34: aconst_null
    //   35: aconst_null
    //   36: aconst_null
    //   37: invokevirtual 105	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   40: astore_3
    //   41: aload_3
    //   42: ifnull +205 -> 247
    //   45: aload_3
    //   46: invokeinterface 111 1 0
    //   51: istore 10
    //   53: iload 10
    //   55: ifeq +192 -> 247
    //   58: new 204	com/vvt/events/AppEngine1
    //   61: astore 8
    //   63: aload 8
    //   65: invokespecial 205	com/vvt/events/AppEngine1:<init>	()V
    //   68: ldc -49
    //   70: astore 5
    //   72: aload_3
    //   73: aload 5
    //   75: invokeinterface 120 2 0
    //   80: istore 4
    //   82: aload_3
    //   83: iload 4
    //   85: invokeinterface 124 2 0
    //   90: astore 5
    //   92: ldc -47
    //   94: astore 9
    //   96: aload_3
    //   97: aload 9
    //   99: invokeinterface 120 2 0
    //   104: istore 11
    //   106: aload_3
    //   107: iload 11
    //   109: invokeinterface 213 2 0
    //   114: istore 11
    //   116: ldc -54
    //   118: astore 7
    //   120: aload_3
    //   121: aload 7
    //   123: invokeinterface 120 2 0
    //   128: istore 6
    //   130: aload_3
    //   131: iload 6
    //   133: invokeinterface 124 2 0
    //   138: astore 7
    //   140: iload 11
    //   142: invokestatic 216	com/vvt/eventrepository/a/n:a	(I)Lcom/vvt/events/FxRecipientType;
    //   145: astore 9
    //   147: aload 8
    //   149: aload 9
    //   151: invokevirtual 219	com/vvt/events/AppEngine1:a	(Lcom/vvt/events/FxRecipientType;)V
    //   154: aload 8
    //   156: aload 5
    //   158: invokevirtual 220	com/vvt/events/AppEngine1:removeFromPath	(Ljava/lang/String;)V
    //   161: aload 8
    //   163: aload 7
    //   165: invokevirtual 221	com/vvt/events/AppEngine1:a	(Ljava/lang/String;)V
    //   168: aload_2
    //   169: aload 8
    //   171: invokeinterface 138 2 0
    //   176: pop
    //   177: goto -132 -> 45
    //   180: astore 8
    //   182: new 53	com/vvt/exceptions/database/FxDbCorruptException
    //   185: astore 5
    //   187: aload 8
    //   189: invokevirtual 59	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   192: astore 8
    //   194: aload 5
    //   196: aload 8
    //   198: invokespecial 62	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   201: aload 5
    //   203: athrow
    //   204: astore 8
    //   206: aload_3
    //   207: ifnull +9 -> 216
    //   210: aload_3
    //   211: invokeinterface 141 1 0
    //   216: aload 8
    //   218: athrow
    //   219: astore 8
    //   221: aconst_null
    //   222: astore_3
    //   223: new 64	com/vvt/exceptions/database/FxDbOperationException
    //   226: astore 5
    //   228: aload 8
    //   230: invokevirtual 67	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   233: astore 9
    //   235: aload 5
    //   237: aload 9
    //   239: aload 8
    //   241: invokespecial 70	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   244: aload 5
    //   246: athrow
    //   247: aload_3
    //   248: ifnull +9 -> 257
    //   251: aload_3
    //   252: invokeinterface 141 1 0
    //   257: aload_2
    //   258: areturn
    //   259: astore 8
    //   261: goto -38 -> 223
    //   264: astore 8
    //   266: aconst_null
    //   267: astore_3
    //   268: goto -86 -> 182
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	271	1	paramString	String
    //   3	255	2	localArrayList	java.util.ArrayList
    //   10	258	3	localObject1	Object
    //   12	72	4	i	int
    //   15	230	5	localObject2	Object
    //   18	114	6	j	int
    //   21	143	7	str1	String
    //   24	146	8	localObject3	Object
    //   180	8	8	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   192	5	8	str2	String
    //   204	13	8	localObject4	Object
    //   219	21	8	localThrowable	Throwable
    //   259	1	8	localObject5	Object
    //   264	1	8	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   27	211	9	localObject6	Object
    //   51	3	10	bool	boolean
    //   104	37	11	k	int
    // Exception table:
    //   from	to	target	type
    //   45	51	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   58	61	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   63	68	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   73	80	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   83	90	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   97	104	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   107	114	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   121	128	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   131	138	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   140	145	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   149	154	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   156	161	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   163	168	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   169	177	180	android/database/sqlite/SQLiteDatabaseCorruptException
    //   182	185	204	finally
    //   187	192	204	finally
    //   196	201	204	finally
    //   201	204	204	finally
    //   223	226	204	finally
    //   228	233	204	finally
    //   239	244	204	finally
    //   244	247	204	finally
    //   36	40	219	finally
    //   45	51	259	finally
    //   58	61	259	finally
    //   63	68	259	finally
    //   73	80	259	finally
    //   83	90	259	finally
    //   97	104	259	finally
    //   107	114	259	finally
    //   121	128	259	finally
    //   131	138	259	finally
    //   140	145	259	finally
    //   149	154	259	finally
    //   156	161	259	finally
    //   163	168	259	finally
    //   169	177	259	finally
    //   36	40	264	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  /* Error */
  public static java.util.List f(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: new 99	java/util/ArrayList
    //   3: astore_2
    //   4: aload_2
    //   5: invokespecial 100	java/util/ArrayList:<init>	()V
    //   8: ldc -33
    //   10: astore_3
    //   11: iconst_0
    //   12: istore 4
    //   14: aconst_null
    //   15: astore 5
    //   17: aload_0
    //   18: astore 6
    //   20: aload_1
    //   21: astore 7
    //   23: aload_0
    //   24: aload_3
    //   25: aconst_null
    //   26: aload_1
    //   27: aconst_null
    //   28: aconst_null
    //   29: aconst_null
    //   30: aconst_null
    //   31: invokevirtual 105	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   34: astore_3
    //   35: aload_3
    //   36: ifnull +167 -> 203
    //   39: aload_3
    //   40: invokeinterface 111 1 0
    //   45: istore 8
    //   47: iload 8
    //   49: ifeq +154 -> 203
    //   52: new 225	com/vvt/events/a
    //   55: astore 6
    //   57: aload 6
    //   59: invokespecial 226	com/vvt/events/a:<init>	()V
    //   62: ldc -28
    //   64: astore 5
    //   66: aload_3
    //   67: aload 5
    //   69: invokeinterface 120 2 0
    //   74: istore 4
    //   76: aload_3
    //   77: iload 4
    //   79: invokeinterface 124 2 0
    //   84: astore 5
    //   86: ldc -106
    //   88: astore 7
    //   90: aload_3
    //   91: aload 7
    //   93: invokeinterface 120 2 0
    //   98: istore 9
    //   100: aload_3
    //   101: iload 9
    //   103: invokeinterface 124 2 0
    //   108: astore 7
    //   110: aload 6
    //   112: aload 5
    //   114: invokevirtual 229	com/vvt/events/a:a	(Ljava/lang/String;)V
    //   117: aload 6
    //   119: aload 7
    //   121: invokevirtual 230	com/vvt/events/a:removeFromPath	(Ljava/lang/String;)V
    //   124: aload_2
    //   125: aload 6
    //   127: invokeinterface 138 2 0
    //   132: pop
    //   133: goto -94 -> 39
    //   136: astore 6
    //   138: new 53	com/vvt/exceptions/database/FxDbCorruptException
    //   141: astore 5
    //   143: aload 6
    //   145: invokevirtual 59	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   148: astore 6
    //   150: aload 5
    //   152: aload 6
    //   154: invokespecial 62	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   157: aload 5
    //   159: athrow
    //   160: astore 6
    //   162: aload_3
    //   163: ifnull +9 -> 172
    //   166: aload_3
    //   167: invokeinterface 141 1 0
    //   172: aload 6
    //   174: athrow
    //   175: astore 6
    //   177: aconst_null
    //   178: astore_3
    //   179: new 64	com/vvt/exceptions/database/FxDbOperationException
    //   182: astore 5
    //   184: aload 6
    //   186: invokevirtual 67	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   189: astore 7
    //   191: aload 5
    //   193: aload 7
    //   195: aload 6
    //   197: invokespecial 70	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   200: aload 5
    //   202: athrow
    //   203: aload_3
    //   204: ifnull +9 -> 213
    //   207: aload_3
    //   208: invokeinterface 141 1 0
    //   213: aload_2
    //   214: areturn
    //   215: astore 6
    //   217: goto -38 -> 179
    //   220: astore 6
    //   222: aconst_null
    //   223: astore_3
    //   224: goto -86 -> 138
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	227	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	227	1	paramString	String
    //   3	211	2	localArrayList	java.util.ArrayList
    //   10	214	3	localObject1	Object
    //   12	66	4	i	int
    //   15	186	5	localObject2	Object
    //   18	108	6	localObject3	Object
    //   136	8	6	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   148	5	6	str1	String
    //   160	13	6	localObject4	Object
    //   175	21	6	localThrowable	Throwable
    //   215	1	6	localObject5	Object
    //   220	1	6	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   21	173	7	str2	String
    //   45	3	8	bool	boolean
    //   98	4	9	j	int
    // Exception table:
    //   from	to	target	type
    //   39	45	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   52	55	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   57	62	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   67	74	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   77	84	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   91	98	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   101	108	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   112	117	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   119	124	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   125	133	136	android/database/sqlite/SQLiteDatabaseCorruptException
    //   138	141	160	finally
    //   143	148	160	finally
    //   152	157	160	finally
    //   157	160	160	finally
    //   179	182	160	finally
    //   184	189	160	finally
    //   195	200	160	finally
    //   200	203	160	finally
    //   30	34	175	finally
    //   39	45	215	finally
    //   52	55	215	finally
    //   57	62	215	finally
    //   67	74	215	finally
    //   77	84	215	finally
    //   91	98	215	finally
    //   101	108	215	finally
    //   112	117	215	finally
    //   119	124	215	finally
    //   125	133	215	finally
    //   30	34	220	android/database/sqlite/SQLiteDatabaseCorruptException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */