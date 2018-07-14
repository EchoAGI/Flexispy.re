package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxWallPaperThumbnailEvent;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;

public class al
  extends o
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private SQLiteDatabase c;
  
  public al(SQLiteDatabase paramSQLiteDatabase)
  {
    this.c = paramSQLiteDatabase;
  }
  
  private long a(long paramLong, FxWallPaperThumbnailEvent paramFxWallPaperThumbnailEvent)
  {
    Object localObject1 = paramFxWallPaperThumbnailEvent.getThumbnailFullPath();
    boolean bool1 = a;
    if (bool1) {}
    Object localObject2 = new android/content/ContentValues;
    ((ContentValues)localObject2).<init>();
    ((ContentValues)localObject2).put("full_path", (String)localObject1);
    long l = paramFxWallPaperThumbnailEvent.getActualSize();
    Object localObject3 = Long.valueOf(l);
    ((ContentValues)localObject2).put("actual_size", (Long)localObject3);
    localObject3 = Long.valueOf(paramLong);
    ((ContentValues)localObject2).put("media_id", (Long)localObject3);
    localObject1 = "actual_duration";
    localObject3 = Integer.valueOf(0);
    ((ContentValues)localObject2).put((String)localObject1, (Integer)localObject3);
    boolean bool2 = a;
    if (bool2) {}
    l = -1;
    try
    {
      localObject1 = this.c;
      String str2 = "thumbnail";
      ((SQLiteDatabase)localObject1).insert(str2, null, (ContentValues)localObject2);
      bool2 = a;
      if (bool2) {}
      return l;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
      String str1 = localSQLiteDatabaseCorruptException.getMessage();
      ((FxDbCorruptException)localObject2).<init>(str1);
      throw ((Throwable)localObject2);
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject3 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject3, localThrowable);
    }
  }
  
  private long a(FxWallPaperThumbnailEvent paramFxWallPaperThumbnailEvent)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramFxWallPaperThumbnailEvent.getActualFullPath();
    localObject2 = new android/content/ContentValues;
    ((ContentValues)localObject2).<init>();
    Object localObject3 = Integer.valueOf(0);
    ((ContentValues)localObject2).put("thumbnail_delivered", (Integer)localObject3);
    long l1 = paramFxWallPaperThumbnailEvent.getEventTime();
    localObject3 = Long.valueOf(l1);
    ((ContentValues)localObject2).put("time", (Long)localObject3);
    localObject3 = paramFxWallPaperThumbnailEvent.getActualFullPath();
    ((ContentValues)localObject2).put("full_path", (String)localObject3);
    localObject4 = "media_event_type";
    int i = FxEventType.WALLPAPER.getNumber();
    localObject3 = Integer.valueOf(i);
    ((ContentValues)localObject2).put((String)localObject4, (Integer)localObject3);
    if (localObject1 != null)
    {
      localObject4 = "";
      bool1 = ((String)localObject1).equals(localObject4);
      if (!bool1)
      {
        localObject1 = "has_thumbnail";
        int j = 1;
        localObject4 = Integer.valueOf(j);
        ((ContentValues)localObject2).put((String)localObject1, (Integer)localObject4);
      }
    }
    for (;;)
    {
      try
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = this.c;
        localObject4 = "media";
        i = 0;
        localObject3 = null;
        long l2 = ((SQLiteDatabase)localObject1).insert((String)localObject4, null, (ContentValues)localObject2);
        boolean bool2 = a;
        if (bool2) {}
        return l2;
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
      finally
      {
        localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject4 = localThrowable.getMessage();
        ((FxDbOperationException)localObject2).<init>((String)localObject4, localThrowable);
      }
      localObject1 = "has_thumbnail";
      localObject4 = Integer.valueOf(0);
      ((ContentValues)localObject2).put((String)localObject1, (Integer)localObject4);
    }
  }
  
  public long a(FxEvent paramFxEvent)
  {
    boolean bool1 = a;
    if (bool1) {}
    paramFxEvent = (FxWallPaperThumbnailEvent)paramFxEvent;
    bool1 = a;
    if (bool1) {}
    Object localObject3;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.c;
      localSQLiteDatabase.beginTransaction();
      long l1 = a(paramFxEvent);
      a(l1, paramFxEvent);
      long l2 = 0L;
      boolean bool2 = l1 < l2;
      if (bool2)
      {
        localObject2 = this.c;
        FxEventType localFxEventType = FxEventType.WALLPAPER;
        FxEventDirection localFxEventDirection = FxEventDirection.UNKNOWN;
        n.a((SQLiteDatabase)localObject2, l1, localFxEventType, localFxEventDirection);
      }
      localObject2 = this.c;
      ((SQLiteDatabase)localObject2).setTransactionSuccessful();
      localObject2 = this.c;
      ((SQLiteDatabase)localObject2).endTransaction();
      bool2 = a;
      if (bool2) {}
      return l1;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject3 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject3).<init>(str);
        throw ((Throwable)localObject3);
      }
      finally
      {
        this.c.endTransaction();
      }
    }
    finally
    {
      localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
      Object localObject2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject3).<init>((String)localObject2, localThrowable);
    }
  }
  
  /* Error */
  public java.util.List a(com.vvt.eventrepository.querycriteria.QueryOrder paramQueryOrder, int paramInt)
  {
    // Byte code:
    //   0: new 156	java/util/ArrayList
    //   3: astore_3
    //   4: aload_3
    //   5: invokespecial 157	java/util/ArrayList:<init>	()V
    //   8: aload_1
    //   9: invokestatic 160	com/vvt/eventrepository/a/n:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)Ljava/lang/String;
    //   12: astore 4
    //   14: iload_2
    //   15: invokestatic 164	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   18: astore 5
    //   20: getstatic 111	com/vvt/base/FxEventType:WALLPAPER	Lcom/vvt/base/FxEventType;
    //   23: invokevirtual 115	com/vvt/base/FxEventType:getNumber	()I
    //   26: istore 6
    //   28: iload 6
    //   30: invokestatic 164	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   33: astore 7
    //   35: new 166	java/lang/StringBuilder
    //   38: astore 8
    //   40: aload 8
    //   42: invokespecial 167	java/lang/StringBuilder:<init>	()V
    //   45: aload 8
    //   47: ldc -87
    //   49: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: astore 8
    //   54: ldc -81
    //   56: astore 9
    //   58: aload 8
    //   60: aload 9
    //   62: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: aload 4
    //   67: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: astore 4
    //   72: ldc -79
    //   74: astore 8
    //   76: aload 4
    //   78: aload 8
    //   80: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload 5
    //   85: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   91: astore 5
    //   93: iconst_0
    //   94: istore 10
    //   96: aconst_null
    //   97: astore 4
    //   99: aload_0
    //   100: getfield 25	com/vvt/eventrepository/a/al:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   103: astore 8
    //   105: iconst_1
    //   106: istore 11
    //   108: iload 11
    //   110: anewarray 119	java/lang/String
    //   113: astore 9
    //   115: aload 9
    //   117: iconst_0
    //   118: aload 7
    //   120: aastore
    //   121: aload 8
    //   123: aload 5
    //   125: aload 9
    //   127: invokevirtual 183	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   130: astore 4
    //   132: aload 4
    //   134: ifnull +479 -> 613
    //   137: aload 4
    //   139: invokeinterface 189 1 0
    //   144: istore 12
    //   146: iload 12
    //   148: ifeq +465 -> 613
    //   151: new 27	com/vvt/events/FxWallPaperThumbnailEvent
    //   154: astore 5
    //   156: aload 5
    //   158: invokespecial 190	com/vvt/events/FxWallPaperThumbnailEvent:<init>	()V
    //   161: ldc -64
    //   163: astore 7
    //   165: aload 4
    //   167: aload 7
    //   169: invokeinterface 196 2 0
    //   174: istore 6
    //   176: aload 4
    //   178: iload 6
    //   180: invokeinterface 200 2 0
    //   185: lstore 13
    //   187: ldc 100
    //   189: astore 9
    //   191: aload 4
    //   193: aload 9
    //   195: invokeinterface 196 2 0
    //   200: istore 11
    //   202: aload 4
    //   204: iload 11
    //   206: invokeinterface 200 2 0
    //   211: lstore 15
    //   213: ldc -54
    //   215: astore 17
    //   217: aload 4
    //   219: aload 17
    //   221: invokeinterface 196 2 0
    //   226: istore 18
    //   228: aload 4
    //   230: iload 18
    //   232: invokeinterface 206 2 0
    //   237: fstore 19
    //   239: ldc -48
    //   241: astore 20
    //   243: aload 4
    //   245: aload 20
    //   247: invokeinterface 196 2 0
    //   252: istore 21
    //   254: aload 4
    //   256: iload 21
    //   258: invokeinterface 206 2 0
    //   263: fstore 22
    //   265: ldc -46
    //   267: astore 23
    //   269: aload 4
    //   271: aload 23
    //   273: invokeinterface 196 2 0
    //   278: istore 24
    //   280: aload 4
    //   282: iload 24
    //   284: invokeinterface 206 2 0
    //   289: fstore 25
    //   291: ldc -44
    //   293: astore 26
    //   295: aload 4
    //   297: aload 26
    //   299: invokeinterface 196 2 0
    //   304: istore 27
    //   306: aload 4
    //   308: iload 27
    //   310: invokeinterface 215 2 0
    //   315: astore 26
    //   317: ldc -39
    //   319: astore 28
    //   321: aload 4
    //   323: aload 28
    //   325: invokeinterface 196 2 0
    //   330: istore 29
    //   332: aload 4
    //   334: iload 29
    //   336: invokeinterface 215 2 0
    //   341: astore 28
    //   343: ldc 42
    //   345: astore 30
    //   347: aload 4
    //   349: aload 30
    //   351: invokeinterface 196 2 0
    //   356: istore 31
    //   358: aload 4
    //   360: iload 31
    //   362: invokeinterface 221 2 0
    //   367: istore 31
    //   369: getstatic 14	com/vvt/eventrepository/a/al:a	Z
    //   372: istore 32
    //   374: iload 32
    //   376: ifeq +3 -> 379
    //   379: getstatic 14	com/vvt/eventrepository/a/al:a	Z
    //   382: istore 32
    //   384: iload 32
    //   386: ifeq +3 -> 389
    //   389: aload 26
    //   391: invokestatic 226	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   394: istore 32
    //   396: iload 32
    //   398: ifne +169 -> 567
    //   401: new 228	com/vvt/events/MyUncaughtExceptionHandler
    //   404: astore 33
    //   406: aload 33
    //   408: invokespecial 229	com/vvt/events/MyUncaughtExceptionHandler:<init>	()V
    //   411: aload 33
    //   413: fload 19
    //   415: invokevirtual 232	com/vvt/events/MyUncaughtExceptionHandler:a	(F)V
    //   418: fload 22
    //   420: f2d
    //   421: dstore 34
    //   423: aload 33
    //   425: dload 34
    //   427: invokevirtual 235	com/vvt/events/MyUncaughtExceptionHandler:a	(D)V
    //   430: fload 25
    //   432: f2d
    //   433: dstore 34
    //   435: aload 33
    //   437: dload 34
    //   439: invokevirtual 237	com/vvt/events/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   442: aload 26
    //   444: invokestatic 242	com/vvt/io/d:a	(Ljava/lang/String;)Ljava/lang/String;
    //   447: astore 17
    //   449: aload 17
    //   451: invokestatic 247	com/vvt/events/f:a	(Ljava/lang/String;)Lcom/vvt/events/FxMediaType;
    //   454: astore 17
    //   456: aload 5
    //   458: aload 28
    //   460: invokevirtual 250	com/vvt/events/FxWallPaperThumbnailEvent:setActualFullPath	(Ljava/lang/String;)V
    //   463: iload 31
    //   465: i2l
    //   466: lstore 36
    //   468: aload 5
    //   470: lload 36
    //   472: invokevirtual 254	com/vvt/events/FxWallPaperThumbnailEvent:setActualSize	(J)V
    //   475: aload 5
    //   477: lload 13
    //   479: invokevirtual 257	com/vvt/events/FxWallPaperThumbnailEvent:setEventId	(J)V
    //   482: aload 5
    //   484: lload 15
    //   486: invokevirtual 260	com/vvt/events/FxWallPaperThumbnailEvent:setEventTime	(J)V
    //   489: aload 5
    //   491: aload 17
    //   493: invokevirtual 264	com/vvt/events/FxWallPaperThumbnailEvent:setFormat	(Lcom/vvt/events/FxMediaType;)V
    //   496: aload 5
    //   498: lload 13
    //   500: invokevirtual 267	com/vvt/events/FxWallPaperThumbnailEvent:setParingId	(J)V
    //   503: aload 5
    //   505: aload 26
    //   507: invokevirtual 270	com/vvt/events/FxWallPaperThumbnailEvent:setThumbnailFullPath	(Ljava/lang/String;)V
    //   510: aload_3
    //   511: aload 5
    //   513: invokeinterface 275 2 0
    //   518: pop
    //   519: goto -382 -> 137
    //   522: astore_3
    //   523: getstatic 19	com/vvt/eventrepository/a/al:removeFromPath	Z
    //   526: istore 12
    //   528: iload 12
    //   530: ifeq +3 -> 533
    //   533: new 77	com/vvt/exceptions/database/FxDbCorruptException
    //   536: astore 5
    //   538: aload_3
    //   539: invokevirtual 82	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   542: astore_3
    //   543: aload 5
    //   545: aload_3
    //   546: invokespecial 85	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   549: aload 5
    //   551: athrow
    //   552: astore_3
    //   553: aload 4
    //   555: ifnull +10 -> 565
    //   558: aload 4
    //   560: invokeinterface 278 1 0
    //   565: aload_3
    //   566: athrow
    //   567: getstatic 19	com/vvt/eventrepository/a/al:removeFromPath	Z
    //   570: istore 12
    //   572: iload 12
    //   574: ifeq -437 -> 137
    //   577: goto -440 -> 137
    //   580: astore_3
    //   581: getstatic 19	com/vvt/eventrepository/a/al:removeFromPath	Z
    //   584: istore 12
    //   586: iload 12
    //   588: ifeq +3 -> 591
    //   591: new 87	com/vvt/exceptions/database/FxDbOperationException
    //   594: astore 5
    //   596: aload_3
    //   597: invokevirtual 90	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   600: astore 7
    //   602: aload 5
    //   604: aload 7
    //   606: aload_3
    //   607: invokespecial 93	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   610: aload 5
    //   612: athrow
    //   613: aload 4
    //   615: ifnull +10 -> 625
    //   618: aload 4
    //   620: invokeinterface 278 1 0
    //   625: getstatic 14	com/vvt/eventrepository/a/al:a	Z
    //   628: istore 10
    //   630: iload 10
    //   632: ifeq +3 -> 635
    //   635: aload_3
    //   636: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	637	0	this	al
    //   0	637	1	paramQueryOrder	com.vvt.eventrepository.querycriteria.QueryOrder
    //   0	637	2	paramInt	int
    //   3	508	3	localArrayList	java.util.ArrayList
    //   522	17	3	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   542	4	3	str1	String
    //   552	14	3	localObject1	Object
    //   580	56	3	localThrowable	Throwable
    //   12	607	4	localObject2	Object
    //   18	593	5	localObject3	Object
    //   26	153	6	i	int
    //   33	572	7	str2	String
    //   38	84	8	localObject4	Object
    //   56	138	9	localObject5	Object
    //   94	537	10	bool1	boolean
    //   106	99	11	j	int
    //   144	443	12	bool2	boolean
    //   185	314	13	l1	long
    //   211	274	15	l2	long
    //   215	277	17	localObject6	Object
    //   226	5	18	k	int
    //   237	177	19	f1	float
    //   241	5	20	str3	String
    //   252	5	21	m	int
    //   263	156	22	f2	float
    //   267	5	23	str4	String
    //   278	5	24	n	int
    //   289	142	25	f3	float
    //   293	213	26	str5	String
    //   304	5	27	i1	int
    //   319	140	28	str6	String
    //   330	5	29	i2	int
    //   345	5	30	str7	String
    //   356	108	31	i3	int
    //   372	25	32	bool3	boolean
    //   404	32	33	localc	com.vvt.events.MyUncaughtExceptionHandler
    //   421	17	34	d	double
    //   466	5	36	l3	long
    // Exception table:
    //   from	to	target	type
    //   99	103	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   108	113	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   118	121	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   125	130	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   137	144	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   151	154	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   156	161	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   167	174	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   178	185	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   193	200	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   204	211	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   219	226	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   230	237	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   245	252	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   256	263	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   271	278	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   282	289	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   297	304	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   308	315	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   323	330	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   334	341	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   349	356	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   360	367	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   369	372	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   379	382	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   389	394	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   401	404	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   406	411	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   413	418	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   425	430	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   437	442	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   442	447	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   449	454	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   458	463	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   470	475	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   477	482	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   484	489	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   491	496	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   498	503	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   505	510	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   511	519	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   567	570	522	android/database/sqlite/SQLiteDatabaseCorruptException
    //   523	526	552	finally
    //   533	536	552	finally
    //   538	542	552	finally
    //   545	549	552	finally
    //   549	552	552	finally
    //   581	584	552	finally
    //   591	594	552	finally
    //   596	600	552	finally
    //   606	610	552	finally
    //   610	613	552	finally
    //   99	103	580	finally
    //   108	113	580	finally
    //   118	121	580	finally
    //   125	130	580	finally
    //   137	144	580	finally
    //   151	154	580	finally
    //   156	161	580	finally
    //   167	174	580	finally
    //   178	185	580	finally
    //   193	200	580	finally
    //   204	211	580	finally
    //   219	226	580	finally
    //   230	237	580	finally
    //   245	252	580	finally
    //   256	263	580	finally
    //   271	278	580	finally
    //   282	289	580	finally
    //   297	304	580	finally
    //   308	315	580	finally
    //   323	330	580	finally
    //   334	341	580	finally
    //   349	356	580	finally
    //   360	367	580	finally
    //   369	372	580	finally
    //   379	382	580	finally
    //   389	394	580	finally
    //   401	404	580	finally
    //   406	411	580	finally
    //   413	418	580	finally
    //   425	430	580	finally
    //   437	442	580	finally
    //   442	447	580	finally
    //   449	454	580	finally
    //   458	463	580	finally
    //   470	475	580	finally
    //   477	482	580	finally
    //   484	489	580	finally
    //   491	496	580	finally
    //   498	503	580	finally
    //   505	510	580	finally
    //   511	519	580	finally
    //   567	570	580	finally
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aload_0
    //   3: getfield 25	com/vvt/eventrepository/a/al:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore_2
    //   7: ldc 69
    //   9: astore_3
    //   10: aconst_null
    //   11: astore 4
    //   13: aload_2
    //   14: aload_3
    //   15: aconst_null
    //   16: aconst_null
    //   17: aconst_null
    //   18: invokestatic 281	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +60 -> 83
    //   26: aload_1
    //   27: invokeinterface 284 1 0
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +47 -> 83
    //   39: ldc 36
    //   41: astore_2
    //   42: aload_1
    //   43: aload_2
    //   44: invokeinterface 196 2 0
    //   49: istore 5
    //   51: aload_1
    //   52: iload 5
    //   54: invokeinterface 215 2 0
    //   59: astore_2
    //   60: aload_2
    //   61: ifnull +22 -> 83
    //   64: ldc 117
    //   66: astore_3
    //   67: aload_2
    //   68: aload_3
    //   69: invokevirtual 123	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   72: istore 6
    //   74: iload 6
    //   76: ifne +7 -> 83
    //   79: aload_2
    //   80: invokestatic 286	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   83: aload_0
    //   84: getfield 25	com/vvt/eventrepository/a/al:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   87: astore_2
    //   88: ldc 69
    //   90: astore_3
    //   91: aconst_null
    //   92: astore 4
    //   94: aload_2
    //   95: aload_3
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokevirtual 290	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   101: pop
    //   102: aload_1
    //   103: ifnull +9 -> 112
    //   106: aload_1
    //   107: invokeinterface 278 1 0
    //   112: return
    //   113: astore_2
    //   114: new 77	com/vvt/exceptions/database/FxDbCorruptException
    //   117: astore_3
    //   118: aload_2
    //   119: invokevirtual 82	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   122: astore_2
    //   123: aload_3
    //   124: aload_2
    //   125: invokespecial 85	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   128: aload_3
    //   129: athrow
    //   130: astore_2
    //   131: aload_1
    //   132: ifnull +9 -> 141
    //   135: aload_1
    //   136: invokeinterface 278 1 0
    //   141: aload_2
    //   142: athrow
    //   143: astore_2
    //   144: new 87	com/vvt/exceptions/database/FxDbOperationException
    //   147: astore_3
    //   148: aload_2
    //   149: invokevirtual 90	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   152: astore 4
    //   154: aload_3
    //   155: aload 4
    //   157: aload_2
    //   158: invokespecial 93	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   161: aload_3
    //   162: athrow
    //   163: astore_2
    //   164: goto -81 -> 83
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	167	0	this	al
    //   1	135	1	localCursor	android.database.Cursor
    //   6	89	2	localObject1	Object
    //   113	6	2	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   122	3	2	str1	String
    //   130	12	2	localObject2	Object
    //   143	15	2	localThrowable	Throwable
    //   163	1	2	localIllegalArgumentException	IllegalArgumentException
    //   9	153	3	localObject3	Object
    //   11	145	4	str2	String
    //   32	3	5	bool1	boolean
    //   49	4	5	i	int
    //   72	3	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   17	21	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   26	32	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   43	49	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   52	59	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   68	72	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   79	83	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   83	87	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   97	102	113	android/database/sqlite/SQLiteDatabaseCorruptException
    //   114	117	130	finally
    //   118	122	130	finally
    //   124	128	130	finally
    //   128	130	130	finally
    //   144	147	130	finally
    //   148	152	130	finally
    //   157	161	130	finally
    //   161	163	130	finally
    //   2	6	143	finally
    //   17	21	143	finally
    //   26	32	143	finally
    //   43	49	143	finally
    //   52	59	143	finally
    //   68	72	143	finally
    //   79	83	143	finally
    //   83	87	143	finally
    //   97	102	143	finally
    //   79	83	163	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public int b(long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 14	com/vvt/eventrepository/a/al:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: getstatic 14	com/vvt/eventrepository/a/al:a	Z
    //   18: istore 5
    //   20: iload 5
    //   22: ifeq +3 -> 25
    //   25: new 166	java/lang/StringBuilder
    //   28: astore 6
    //   30: aload 6
    //   32: invokespecial 167	java/lang/StringBuilder:<init>	()V
    //   35: ldc_w 294
    //   38: astore 7
    //   40: aload 6
    //   42: aload 7
    //   44: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: lload_1
    //   48: invokevirtual 297	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   51: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: astore 6
    //   56: aload_0
    //   57: getfield 25	com/vvt/eventrepository/a/al:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   60: astore 7
    //   62: ldc 69
    //   64: astore 8
    //   66: aload 7
    //   68: aload 8
    //   70: aload 6
    //   72: aconst_null
    //   73: aconst_null
    //   74: invokestatic 281	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   77: astore 4
    //   79: aload 4
    //   81: ifnull +71 -> 152
    //   84: aload 4
    //   86: invokeinterface 284 1 0
    //   91: istore 9
    //   93: iload 9
    //   95: ifeq +57 -> 152
    //   98: ldc 36
    //   100: astore 7
    //   102: aload 4
    //   104: aload 7
    //   106: invokeinterface 196 2 0
    //   111: istore 9
    //   113: aload 4
    //   115: iload 9
    //   117: invokeinterface 215 2 0
    //   122: astore 7
    //   124: aload 7
    //   126: ifnull +26 -> 152
    //   129: ldc 117
    //   131: astore 8
    //   133: aload 7
    //   135: aload 8
    //   137: invokevirtual 123	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   140: istore 10
    //   142: iload 10
    //   144: ifne +8 -> 152
    //   147: aload 7
    //   149: invokestatic 286	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   152: aload_0
    //   153: getfield 25	com/vvt/eventrepository/a/al:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   156: astore 7
    //   158: ldc 69
    //   160: astore 8
    //   162: aload 7
    //   164: aload 8
    //   166: aload 6
    //   168: aconst_null
    //   169: invokevirtual 290	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   172: istore 5
    //   174: aload 4
    //   176: ifnull +10 -> 186
    //   179: aload 4
    //   181: invokeinterface 278 1 0
    //   186: getstatic 14	com/vvt/eventrepository/a/al:a	Z
    //   189: istore_3
    //   190: iload_3
    //   191: ifeq +3 -> 194
    //   194: iload 5
    //   196: ireturn
    //   197: astore 6
    //   199: new 77	com/vvt/exceptions/database/FxDbCorruptException
    //   202: astore 7
    //   204: aload 6
    //   206: invokevirtual 82	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   209: astore 6
    //   211: aload 7
    //   213: aload 6
    //   215: invokespecial 85	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   218: aload 7
    //   220: athrow
    //   221: astore 6
    //   223: aload 4
    //   225: ifnull +10 -> 235
    //   228: aload 4
    //   230: invokeinterface 278 1 0
    //   235: aload 6
    //   237: athrow
    //   238: astore 6
    //   240: new 87	com/vvt/exceptions/database/FxDbOperationException
    //   243: astore 7
    //   245: aload 6
    //   247: invokevirtual 90	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   250: astore 8
    //   252: aload 7
    //   254: aload 8
    //   256: aload 6
    //   258: invokespecial 93	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   261: aload 7
    //   263: athrow
    //   264: astore 7
    //   266: goto -114 -> 152
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	269	0	this	al
    //   0	269	1	paramLong	long
    //   1	190	3	bool1	boolean
    //   3	226	4	localCursor	android.database.Cursor
    //   8	13	5	bool2	boolean
    //   172	23	5	i	int
    //   28	139	6	localObject1	Object
    //   197	8	6	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   209	5	6	str1	String
    //   221	15	6	localObject2	Object
    //   238	19	6	localThrowable	Throwable
    //   38	224	7	localObject3	Object
    //   264	1	7	localIllegalArgumentException	IllegalArgumentException
    //   64	191	8	str2	String
    //   91	3	9	bool3	boolean
    //   111	5	9	j	int
    //   140	3	10	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   56	60	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   73	77	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   84	91	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   104	111	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   115	122	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   135	140	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   147	152	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   152	156	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   168	172	197	android/database/sqlite/SQLiteDatabaseCorruptException
    //   199	202	221	finally
    //   204	209	221	finally
    //   213	218	221	finally
    //   218	221	221	finally
    //   240	243	221	finally
    //   245	250	221	finally
    //   256	261	221	finally
    //   261	264	221	finally
    //   56	60	238	finally
    //   73	77	238	finally
    //   84	91	238	finally
    //   104	111	238	finally
    //   115	122	238	finally
    //   135	140	238	finally
    //   147	152	238	finally
    //   152	156	238	finally
    //   168	172	238	finally
    //   147	152	264	java/lang/IllegalArgumentException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/al.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */