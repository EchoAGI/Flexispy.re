package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.events.FxVideoFileThumbnailEvent;
import com.vvt.events.j;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ai
  extends o
{
  private static final boolean a = a.a;
  private static final boolean b = a.b;
  private static final boolean c = a.d;
  private SQLiteDatabase d;
  
  public ai(SQLiteDatabase paramSQLiteDatabase)
  {
    this.d = paramSQLiteDatabase;
  }
  
  private long a(FxVideoFileThumbnailEvent paramFxVideoFileThumbnailEvent)
  {
    Object localObject1 = paramFxVideoFileThumbnailEvent.getListOfThumbnail();
    localObject2 = new android/content/ContentValues;
    ((ContentValues)localObject2).<init>();
    Object localObject3 = Integer.valueOf(0);
    ((ContentValues)localObject2).put("thumbnail_delivered", (Integer)localObject3);
    long l = paramFxVideoFileThumbnailEvent.getEventTime();
    localObject3 = Long.valueOf(l);
    ((ContentValues)localObject2).put("time", (Long)localObject3);
    localObject3 = paramFxVideoFileThumbnailEvent.getActualFullPath();
    ((ContentValues)localObject2).put("full_path", (String)localObject3);
    localObject4 = "media_event_type";
    int i = FxEventType.VIDEO_FILE.getNumber();
    localObject3 = Integer.valueOf(i);
    ((ContentValues)localObject2).put((String)localObject4, (Integer)localObject3);
    int j = ((ArrayList)localObject1).size();
    if (j > 0)
    {
      localObject1 = "has_thumbnail";
      int k = 1;
      localObject4 = Integer.valueOf(k);
      ((ContentValues)localObject2).put((String)localObject1, (Integer)localObject4);
    }
    for (;;)
    {
      try
      {
        localObject1 = this.d;
        localObject4 = "media";
        i = 0;
        localObject3 = null;
        return ((SQLiteDatabase)localObject1).insert((String)localObject4, null, (ContentValues)localObject2);
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
  
  private Cursor a(String paramString1, String paramString2)
  {
    int i = FxEventType.VIDEO_FILE.getNumber();
    Object localObject1 = Integer.toString(i);
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    String str2 = "media_event_type = ";
    localObject1 = ((StringBuilder)localObject2).append(str2).append((String)localObject1);
    localObject2 = " AND thumbnail_delivered = 0";
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    String str3 = ((StringBuilder)localObject1).toString();
    try
    {
      localObject1 = this.d;
      localObject2 = "media";
      str2 = null;
      return ((SQLiteDatabase)localObject1).query((String)localObject2, null, str3, null, null, null, paramString1, paramString2);
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
      str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>(str2, localThrowable);
    }
  }
  
  /* Error */
  private FxVideoFileThumbnailEvent a(long paramLong1, long paramLong2, String paramString)
  {
    // Byte code:
    //   0: new 30	com/vvt/events/FxVideoFileThumbnailEvent
    //   3: astore 6
    //   5: aload 6
    //   7: invokespecial 140	com/vvt/events/FxVideoFileThumbnailEvent:<init>	()V
    //   10: new 86	java/util/ArrayList
    //   13: astore 7
    //   15: aload 7
    //   17: invokespecial 141	java/util/ArrayList:<init>	()V
    //   20: lconst_0
    //   21: lstore 8
    //   23: new 124	java/lang/StringBuilder
    //   26: astore 10
    //   28: aload 10
    //   30: invokespecial 125	java/lang/StringBuilder:<init>	()V
    //   33: ldc -113
    //   35: astore 11
    //   37: aload 10
    //   39: aload 11
    //   41: invokevirtual 131	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: lload_1
    //   45: invokevirtual 146	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   48: astore 10
    //   50: aload 10
    //   52: invokevirtual 135	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: astore 12
    //   57: aload_0
    //   58: getfield 28	com/vvt/eventrepository/a/ai:d	Landroid/database/sqlite/SQLiteDatabase;
    //   61: astore 10
    //   63: ldc -108
    //   65: astore 11
    //   67: aconst_null
    //   68: astore 13
    //   70: aconst_null
    //   71: astore 14
    //   73: iconst_0
    //   74: istore 15
    //   76: aconst_null
    //   77: astore 16
    //   79: iconst_0
    //   80: istore 17
    //   82: aload 10
    //   84: aload 11
    //   86: aconst_null
    //   87: aload 12
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: aconst_null
    //   93: invokevirtual 151	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   96: astore 13
    //   98: aload 13
    //   100: ifnull +436 -> 536
    //   103: aload 13
    //   105: invokeinterface 156 1 0
    //   110: istore 18
    //   112: iload 18
    //   114: ifle +422 -> 536
    //   117: aload_0
    //   118: aload 13
    //   120: invokespecial 159	com/vvt/eventrepository/a/ai:a	(Landroid/database/Cursor;)Ljava/util/List;
    //   123: astore 14
    //   125: aload 13
    //   127: invokeinterface 163 1 0
    //   132: pop
    //   133: ldc -91
    //   135: astore 10
    //   137: aload 13
    //   139: aload 10
    //   141: invokeinterface 169 2 0
    //   146: istore 18
    //   148: aload 13
    //   150: iload 18
    //   152: invokeinterface 173 2 0
    //   157: istore 19
    //   159: ldc -81
    //   161: astore 10
    //   163: aload 13
    //   165: aload 10
    //   167: invokeinterface 169 2 0
    //   172: istore 18
    //   174: aload 13
    //   176: iload 18
    //   178: invokeinterface 173 2 0
    //   183: istore 18
    //   185: iload 18
    //   187: i2l
    //   188: lstore 20
    //   190: aload 13
    //   192: ifnull +10 -> 202
    //   195: aload 13
    //   197: invokeinterface 178 1 0
    //   202: getstatic 184	com/vvt/events/FxMediaType:UNKNOWN	Lcom/vvt/events/FxMediaType;
    //   205: astore 13
    //   207: aload 5
    //   209: invokestatic 189	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   212: istore 15
    //   214: iload 15
    //   216: ifne +257 -> 473
    //   219: new 191	java/io/File
    //   222: astore 16
    //   224: aload 16
    //   226: aload 5
    //   228: invokespecial 192	java/io/File:<init>	(Ljava/lang/String;)V
    //   231: aload 16
    //   233: invokevirtual 195	java/io/File:exists	()Z
    //   236: istore 17
    //   238: iload 17
    //   240: ifeq +13 -> 253
    //   243: aload 5
    //   245: invokestatic 200	com/vvt/io/d:a	(Ljava/lang/String;)Ljava/lang/String;
    //   248: invokestatic 205	com/vvt/events/f:a	(Ljava/lang/String;)Lcom/vvt/events/FxMediaType;
    //   251: astore 13
    //   253: lconst_0
    //   254: lstore 22
    //   256: lload 20
    //   258: lload 22
    //   260: lcmp
    //   261: istore 17
    //   263: iload 17
    //   265: ifgt +10 -> 275
    //   268: aload 16
    //   270: invokevirtual 208	java/io/File:length	()J
    //   273: lstore 20
    //   275: lload 20
    //   277: lstore 24
    //   279: aload 13
    //   281: astore 10
    //   283: aload 6
    //   285: iload 19
    //   287: invokevirtual 212	com/vvt/events/FxVideoFileThumbnailEvent:setActualDuration	(I)V
    //   290: aload 6
    //   292: aload 5
    //   294: invokevirtual 215	com/vvt/events/FxVideoFileThumbnailEvent:setActualFullPath	(Ljava/lang/String;)V
    //   297: aload 6
    //   299: lload 24
    //   301: invokevirtual 219	com/vvt/events/FxVideoFileThumbnailEvent:setActualFileSize	(J)V
    //   304: aload 6
    //   306: lload_1
    //   307: invokevirtual 222	com/vvt/events/FxVideoFileThumbnailEvent:setEventId	(J)V
    //   310: aload 6
    //   312: lload_3
    //   313: invokevirtual 225	com/vvt/events/FxVideoFileThumbnailEvent:setEventTime	(J)V
    //   316: aload 6
    //   318: aload 10
    //   320: invokevirtual 229	com/vvt/events/FxVideoFileThumbnailEvent:setFormat	(Lcom/vvt/events/FxMediaType;)V
    //   323: aload 6
    //   325: lload_1
    //   326: invokevirtual 232	com/vvt/events/FxVideoFileThumbnailEvent:setParingId	(J)V
    //   329: iconst_0
    //   330: istore 18
    //   332: aconst_null
    //   333: astore 10
    //   335: iconst_0
    //   336: istore 19
    //   338: aconst_null
    //   339: astore 12
    //   341: aload 14
    //   343: invokeinterface 235 1 0
    //   348: istore 18
    //   350: iload 19
    //   352: iload 18
    //   354: if_icmpge +140 -> 494
    //   357: aload 14
    //   359: iload 19
    //   361: invokeinterface 239 2 0
    //   366: checkcast 241	com/vvt/events/j
    //   369: astore 10
    //   371: aload 6
    //   373: aload 10
    //   375: invokevirtual 245	com/vvt/events/FxVideoFileThumbnailEvent:addThumbnail	(Lcom/vvt/events/j;)V
    //   378: iload 19
    //   380: iconst_1
    //   381: iadd
    //   382: istore 18
    //   384: iload 18
    //   386: istore 19
    //   388: goto -47 -> 341
    //   391: astore 10
    //   393: aconst_null
    //   394: astore 11
    //   396: new 102	com/vvt/exceptions/database/FxDbCorruptException
    //   399: astore 13
    //   401: aload 10
    //   403: invokevirtual 107	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   406: astore 10
    //   408: aload 13
    //   410: aload 10
    //   412: invokespecial 110	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   415: aload 13
    //   417: athrow
    //   418: astore 10
    //   420: aload 11
    //   422: astore 13
    //   424: aload 13
    //   426: ifnull +10 -> 436
    //   429: aload 13
    //   431: invokeinterface 178 1 0
    //   436: aload 10
    //   438: athrow
    //   439: astore 10
    //   441: aconst_null
    //   442: astore 13
    //   444: new 112	com/vvt/exceptions/database/FxDbOperationException
    //   447: astore 11
    //   449: aload 10
    //   451: invokevirtual 115	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   454: astore 12
    //   456: aload 11
    //   458: aload 12
    //   460: aload 10
    //   462: invokespecial 118	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   465: aload 11
    //   467: athrow
    //   468: astore 10
    //   470: goto -46 -> 424
    //   473: getstatic 22	com/vvt/eventrepository/a/ai:MyUncaughtExceptionHandler	Z
    //   476: istore 15
    //   478: iload 15
    //   480: ifeq +3 -> 483
    //   483: lload 20
    //   485: lstore 24
    //   487: aload 13
    //   489: astore 10
    //   491: goto -208 -> 283
    //   494: lconst_0
    //   495: lstore 26
    //   497: lload 24
    //   499: lload 26
    //   501: lcmp
    //   502: istore 18
    //   504: iload 18
    //   506: ifge +13 -> 519
    //   509: getstatic 15	com/vvt/eventrepository/a/ai:a	Z
    //   512: istore 18
    //   514: iload 18
    //   516: ifeq +3 -> 519
    //   519: aload 6
    //   521: areturn
    //   522: astore 10
    //   524: goto -80 -> 444
    //   527: astore 10
    //   529: aload 13
    //   531: astore 11
    //   533: goto -137 -> 396
    //   536: lload 8
    //   538: lstore 20
    //   540: iconst_0
    //   541: istore 19
    //   543: aconst_null
    //   544: astore 12
    //   546: aload 7
    //   548: astore 14
    //   550: goto -360 -> 190
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	553	0	this	ai
    //   0	553	1	paramLong1	long
    //   0	553	3	paramLong2	long
    //   0	553	5	paramString	String
    //   3	517	6	localFxVideoFileThumbnailEvent	FxVideoFileThumbnailEvent
    //   13	534	7	localArrayList	ArrayList
    //   21	516	8	l1	long
    //   26	348	10	localObject1	Object
    //   391	11	10	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   406	5	10	str1	String
    //   418	19	10	localObject2	Object
    //   439	22	10	localThrowable	Throwable
    //   468	1	10	localObject3	Object
    //   489	1	10	localObject4	Object
    //   522	1	10	localObject5	Object
    //   527	1	10	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   35	497	11	localObject6	Object
    //   55	490	12	str2	String
    //   68	462	13	localObject7	Object
    //   71	478	14	localObject8	Object
    //   74	405	15	bool1	boolean
    //   77	192	16	localFile	File
    //   80	184	17	bool2	boolean
    //   110	275	18	i	int
    //   502	13	18	bool3	boolean
    //   157	385	19	j	int
    //   188	351	20	l2	long
    //   254	5	22	l3	long
    //   277	221	24	l4	long
    //   495	5	26	l5	long
    // Exception table:
    //   from	to	target	type
    //   57	61	391	android/database/sqlite/SQLiteDatabaseCorruptException
    //   92	96	391	android/database/sqlite/SQLiteDatabaseCorruptException
    //   396	399	418	finally
    //   401	406	418	finally
    //   410	415	418	finally
    //   415	418	418	finally
    //   57	61	439	finally
    //   92	96	439	finally
    //   444	447	468	finally
    //   449	454	468	finally
    //   460	465	468	finally
    //   465	468	468	finally
    //   103	110	522	finally
    //   118	123	522	finally
    //   125	133	522	finally
    //   139	146	522	finally
    //   150	157	522	finally
    //   165	172	522	finally
    //   176	183	522	finally
    //   103	110	527	android/database/sqlite/SQLiteDatabaseCorruptException
    //   118	123	527	android/database/sqlite/SQLiteDatabaseCorruptException
    //   125	133	527	android/database/sqlite/SQLiteDatabaseCorruptException
    //   139	146	527	android/database/sqlite/SQLiteDatabaseCorruptException
    //   150	157	527	android/database/sqlite/SQLiteDatabaseCorruptException
    //   165	172	527	android/database/sqlite/SQLiteDatabaseCorruptException
    //   176	183	527	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  private List a(Cursor paramCursor)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/j;
    ((j)localObject1).<init>();
    for (;;)
    {
      boolean bool1 = paramCursor.moveToNext();
      if (!bool1) {
        break;
      }
      int i = paramCursor.getColumnIndex("full_path");
      String str = paramCursor.getString(i);
      i = 0;
      localObject1 = new byte[0];
      if (str != null)
      {
        localObject2 = new java/io/File;
        ((File)localObject2).<init>(str);
        boolean bool2 = ((File)localObject2).exists();
        if (bool2) {
          localObject1 = d.c(str);
        }
      }
      Object localObject2 = new com/vvt/events/j;
      ((j)localObject2).<init>();
      ((j)localObject2).a((byte[])localObject1);
      ((j)localObject2).a(str);
      localArrayList.add(localObject2);
    }
    return localArrayList;
  }
  
  private void a(long paramLong, FxVideoFileThumbnailEvent paramFxVideoFileThumbnailEvent)
  {
    Object localObject1 = paramFxVideoFileThumbnailEvent.getListOfThumbnail();
    int i = 0;
    Object localObject2 = null;
    int j = 0;
    Object localObject3 = null;
    for (;;)
    {
      i = ((ArrayList)localObject1).size();
      if (j < i)
      {
        localObject2 = ((j)((ArrayList)localObject1).get(j)).a();
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        localContentValues.put("full_path", (String)localObject2);
        Object localObject4 = Long.valueOf(paramLong);
        localContentValues.put("media_id", (Long)localObject4);
        long l = paramFxVideoFileThumbnailEvent.getActualFileSize();
        localObject4 = Long.valueOf(l);
        localContentValues.put("actual_size", (Long)localObject4);
        localObject2 = "actual_duration";
        int k = paramFxVideoFileThumbnailEvent.getActualDuration();
        localObject4 = Integer.valueOf(k);
        localContentValues.put((String)localObject2, (Integer)localObject4);
        try
        {
          localObject2 = this.d;
          localObject4 = "thumbnail";
          ((SQLiteDatabase)localObject2).insert((String)localObject4, null, localContentValues);
          i = j + 1;
          j = i;
        }
        catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
        {
          localObject3 = new com/vvt/exceptions/database/FxDbCorruptException;
          String str = localSQLiteDatabaseCorruptException.getMessage();
          ((FxDbCorruptException)localObject3).<init>(str);
          throw ((Throwable)localObject3);
        }
        finally
        {
          localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
          localObject1 = localThrowable.getMessage();
          ((FxDbOperationException)localObject3).<init>((String)localObject1, localThrowable);
        }
      }
    }
  }
  
  /* Error */
  private boolean a(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc_w 277
    //   5: astore_3
    //   6: iconst_1
    //   7: istore 4
    //   9: iload 4
    //   11: anewarray 279	java/lang/String
    //   14: astore 5
    //   16: iconst_0
    //   17: istore 4
    //   19: aconst_null
    //   20: astore 6
    //   22: aload 5
    //   24: iconst_0
    //   25: aload_1
    //   26: aastore
    //   27: aload_0
    //   28: getfield 28	com/vvt/eventrepository/a/ai:d	Landroid/database/sqlite/SQLiteDatabase;
    //   31: astore 6
    //   33: ldc 94
    //   35: astore 7
    //   37: iconst_1
    //   38: istore 8
    //   40: iload 8
    //   42: anewarray 279	java/lang/String
    //   45: astore 9
    //   47: ldc 65
    //   49: astore 10
    //   51: aload 9
    //   53: iconst_0
    //   54: aload 10
    //   56: aastore
    //   57: aconst_null
    //   58: astore 10
    //   60: aload 6
    //   62: aload 7
    //   64: aload 9
    //   66: aload_3
    //   67: aload 5
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: invokevirtual 151	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   75: astore 7
    //   77: aload 7
    //   79: ifnull +84 -> 163
    //   82: aload 7
    //   84: invokeinterface 156 1 0
    //   89: istore 4
    //   91: iload 4
    //   93: ifle +70 -> 163
    //   96: iload_2
    //   97: istore 4
    //   99: aload 7
    //   101: ifnull +10 -> 111
    //   104: aload 7
    //   106: invokeinterface 178 1 0
    //   111: iload 4
    //   113: ireturn
    //   114: astore 6
    //   116: aconst_null
    //   117: astore 7
    //   119: new 112	com/vvt/exceptions/database/FxDbOperationException
    //   122: astore 9
    //   124: aload 6
    //   126: invokevirtual 115	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   129: astore_3
    //   130: aload 9
    //   132: aload_3
    //   133: aload 6
    //   135: invokespecial 118	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   138: aload 9
    //   140: athrow
    //   141: astore 6
    //   143: aload 7
    //   145: ifnull +10 -> 155
    //   148: aload 7
    //   150: invokeinterface 178 1 0
    //   155: aload 6
    //   157: athrow
    //   158: astore 6
    //   160: goto -41 -> 119
    //   163: iconst_0
    //   164: istore 4
    //   166: aconst_null
    //   167: astore 6
    //   169: goto -70 -> 99
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	172	0	this	ai
    //   0	172	1	paramString	String
    //   1	96	2	i	int
    //   5	128	3	str1	String
    //   7	105	4	j	int
    //   164	1	4	k	int
    //   14	54	5	arrayOfString	String[]
    //   20	41	6	localSQLiteDatabase	SQLiteDatabase
    //   114	20	6	localThrowable	Throwable
    //   141	15	6	localObject1	Object
    //   158	1	6	localObject2	Object
    //   167	1	6	localObject3	Object
    //   35	114	7	localObject4	Object
    //   38	3	8	m	int
    //   45	94	9	localObject5	Object
    //   49	10	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   9	14	114	finally
    //   25	27	114	finally
    //   27	31	114	finally
    //   40	45	114	finally
    //   54	57	114	finally
    //   71	75	114	finally
    //   119	122	141	finally
    //   124	129	141	finally
    //   133	138	141	finally
    //   138	141	141	finally
    //   82	89	158	finally
  }
  
  /* Error */
  public long a(com.vvt.base.FxEvent paramFxEvent)
  {
    // Byte code:
    //   0: aload_1
    //   1: checkcast 30	com/vvt/events/FxVideoFileThumbnailEvent
    //   4: astore_1
    //   5: iconst_m1
    //   6: i2l
    //   7: lstore_2
    //   8: aload_1
    //   9: invokevirtual 69	com/vvt/events/FxVideoFileThumbnailEvent:getActualFullPath	()Ljava/lang/String;
    //   12: astore 4
    //   14: aload_0
    //   15: getfield 28	com/vvt/eventrepository/a/ai:d	Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 5
    //   20: aload 5
    //   22: invokevirtual 282	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   25: aload_0
    //   26: aload 4
    //   28: invokespecial 283	com/vvt/eventrepository/a/ai:a	(Ljava/lang/String;)Z
    //   31: istore 6
    //   33: iload 6
    //   35: ifne +76 -> 111
    //   38: aload_0
    //   39: aload_1
    //   40: invokespecial 286	com/vvt/eventrepository/a/ai:a	(Lcom/vvt/events/FxVideoFileThumbnailEvent;)J
    //   43: lstore_2
    //   44: aload_0
    //   45: lload_2
    //   46: aload_1
    //   47: invokespecial 289	com/vvt/eventrepository/a/ai:a	(JLcom/vvt/events/FxVideoFileThumbnailEvent;)V
    //   50: lconst_0
    //   51: lstore 7
    //   53: lload_2
    //   54: lload 7
    //   56: lcmp
    //   57: istore 6
    //   59: iload 6
    //   61: ifle +30 -> 91
    //   64: aload_0
    //   65: getfield 28	com/vvt/eventrepository/a/ai:d	Landroid/database/sqlite/SQLiteDatabase;
    //   68: astore 4
    //   70: getstatic 80	com/vvt/base/FxEventType:VIDEO_FILE	Lcom/vvt/base/FxEventType;
    //   73: astore 5
    //   75: getstatic 294	com/vvt/events/FxEventDirection:UNKNOWN	Lcom/vvt/events/FxEventDirection;
    //   78: astore 9
    //   80: aload 4
    //   82: lload_2
    //   83: aload 5
    //   85: aload 9
    //   87: invokestatic 299	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;JLcom/vvt/base/FxEventType;Lcom/vvt/events/FxEventDirection;)J
    //   90: pop2
    //   91: aload_0
    //   92: getfield 28	com/vvt/eventrepository/a/ai:d	Landroid/database/sqlite/SQLiteDatabase;
    //   95: astore 4
    //   97: aload 4
    //   99: invokevirtual 302	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   102: aload_0
    //   103: getfield 28	com/vvt/eventrepository/a/ai:d	Landroid/database/sqlite/SQLiteDatabase;
    //   106: invokevirtual 305	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   109: lload_2
    //   110: lreturn
    //   111: getstatic 22	com/vvt/eventrepository/a/ai:MyUncaughtExceptionHandler	Z
    //   114: istore 6
    //   116: iload 6
    //   118: ifeq -16 -> 102
    //   121: goto -19 -> 102
    //   124: astore 10
    //   126: new 102	com/vvt/exceptions/database/FxDbCorruptException
    //   129: astore 11
    //   131: aload 10
    //   133: invokevirtual 107	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   136: astore 10
    //   138: aload 11
    //   140: aload 10
    //   142: invokespecial 110	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   145: aload 11
    //   147: athrow
    //   148: astore 10
    //   150: aload_0
    //   151: getfield 28	com/vvt/eventrepository/a/ai:d	Landroid/database/sqlite/SQLiteDatabase;
    //   154: invokevirtual 305	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   157: aload 10
    //   159: athrow
    //   160: astore 10
    //   162: new 112	com/vvt/exceptions/database/FxDbOperationException
    //   165: astore 11
    //   167: aload 10
    //   169: invokevirtual 115	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   172: astore 4
    //   174: aload 11
    //   176: aload 4
    //   178: aload 10
    //   180: invokespecial 118	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   183: aload 11
    //   185: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	this	ai
    //   0	186	1	paramFxEvent	com.vvt.base.FxEvent
    //   7	103	2	l1	long
    //   12	165	4	localObject1	Object
    //   18	66	5	localObject2	Object
    //   31	86	6	bool	boolean
    //   51	4	7	l2	long
    //   78	8	9	localFxEventDirection	com.vvt.events.FxEventDirection
    //   124	8	10	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   136	5	10	str	String
    //   148	10	10	localObject3	Object
    //   160	19	10	localThrowable	Throwable
    //   129	55	11	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   8	12	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   14	18	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   20	25	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   26	31	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   39	43	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   46	50	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   64	68	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   70	73	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   75	78	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   85	91	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   91	95	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   97	102	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   111	114	124	android/database/sqlite/SQLiteDatabaseCorruptException
    //   126	129	148	finally
    //   131	136	148	finally
    //   140	145	148	finally
    //   145	148	148	finally
    //   162	165	148	finally
    //   167	172	148	finally
    //   178	183	148	finally
    //   183	186	148	finally
    //   8	12	160	finally
    //   14	18	160	finally
    //   20	25	160	finally
    //   26	31	160	finally
    //   39	43	160	finally
    //   46	50	160	finally
    //   64	68	160	finally
    //   70	73	160	finally
    //   75	78	160	finally
    //   85	91	160	finally
    //   91	95	160	finally
    //   97	102	160	finally
    //   111	114	160	finally
  }
  
  /* Error */
  public List a(com.vvt.eventrepository.querycriteria.QueryOrder paramQueryOrder, int paramInt)
  {
    // Byte code:
    //   0: new 86	java/util/ArrayList
    //   3: astore_3
    //   4: aload_3
    //   5: invokespecial 141	java/util/ArrayList:<init>	()V
    //   8: aload_1
    //   9: invokestatic 308	com/vvt/eventrepository/a/n:a	(Lcom/vvt/eventrepository/querycriteria/QueryOrder;)Ljava/lang/String;
    //   12: astore 4
    //   14: iload_2
    //   15: invokestatic 122	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   18: astore 5
    //   20: aconst_null
    //   21: astore 6
    //   23: aload_0
    //   24: aload 4
    //   26: aload 5
    //   28: invokespecial 311	com/vvt/eventrepository/a/ai:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore 7
    //   33: aload 7
    //   35: ifnull +206 -> 241
    //   38: aload 7
    //   40: invokeinterface 249 1 0
    //   45: istore 8
    //   47: iload 8
    //   49: ifeq +192 -> 241
    //   52: ldc_w 313
    //   55: astore 4
    //   57: aload 7
    //   59: aload 4
    //   61: invokeinterface 169 2 0
    //   66: istore 8
    //   68: aload 7
    //   70: iload 8
    //   72: invokeinterface 317 2 0
    //   77: lstore 9
    //   79: ldc 51
    //   81: astore 4
    //   83: aload 7
    //   85: aload 4
    //   87: invokeinterface 169 2 0
    //   92: istore 8
    //   94: aload 7
    //   96: iload 8
    //   98: invokeinterface 317 2 0
    //   103: lstore 11
    //   105: ldc 65
    //   107: astore 4
    //   109: aload 7
    //   111: aload 4
    //   113: invokeinterface 169 2 0
    //   118: istore 8
    //   120: aload 7
    //   122: iload 8
    //   124: invokeinterface 252 2 0
    //   129: astore 13
    //   131: aload_0
    //   132: astore 4
    //   134: aload_0
    //   135: lload 9
    //   137: lload 11
    //   139: aload 13
    //   141: invokespecial 320	com/vvt/eventrepository/a/ai:a	(JJLjava/lang/String;)Lcom/vvt/events/FxVideoFileThumbnailEvent;
    //   144: astore 4
    //   146: aload_3
    //   147: aload 4
    //   149: invokeinterface 264 2 0
    //   154: pop
    //   155: goto -117 -> 38
    //   158: astore 4
    //   160: aload 7
    //   162: astore 6
    //   164: new 102	com/vvt/exceptions/database/FxDbCorruptException
    //   167: astore 5
    //   169: aload 4
    //   171: invokevirtual 107	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   174: astore 4
    //   176: aload 5
    //   178: aload 4
    //   180: invokespecial 110	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   183: aload 5
    //   185: athrow
    //   186: astore 4
    //   188: aload 6
    //   190: astore 7
    //   192: aload 7
    //   194: ifnull +10 -> 204
    //   197: aload 7
    //   199: invokeinterface 178 1 0
    //   204: aload 4
    //   206: athrow
    //   207: astore 4
    //   209: aconst_null
    //   210: astore 7
    //   212: new 112	com/vvt/exceptions/database/FxDbOperationException
    //   215: astore 6
    //   217: aload 4
    //   219: invokevirtual 115	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   222: astore 5
    //   224: aload 6
    //   226: aload 5
    //   228: aload 4
    //   230: invokespecial 118	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   233: aload 6
    //   235: athrow
    //   236: astore 4
    //   238: goto -46 -> 192
    //   241: aload 7
    //   243: ifnull +10 -> 253
    //   246: aload 7
    //   248: invokeinterface 178 1 0
    //   253: getstatic 15	com/vvt/eventrepository/a/ai:a	Z
    //   256: istore 8
    //   258: iload 8
    //   260: ifeq +3 -> 263
    //   263: aload_3
    //   264: areturn
    //   265: astore 4
    //   267: goto -55 -> 212
    //   270: astore 4
    //   272: goto -108 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	275	0	this	ai
    //   0	275	1	paramQueryOrder	com.vvt.eventrepository.querycriteria.QueryOrder
    //   0	275	2	paramInt	int
    //   3	261	3	localArrayList	ArrayList
    //   12	136	4	localObject1	Object
    //   158	12	4	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   174	5	4	str1	String
    //   186	19	4	localObject2	Object
    //   207	22	4	localThrowable	Throwable
    //   236	1	4	localObject3	Object
    //   265	1	4	localObject4	Object
    //   270	1	4	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    //   18	209	5	localObject5	Object
    //   21	213	6	localObject6	Object
    //   31	216	7	localObject7	Object
    //   45	3	8	bool1	boolean
    //   66	57	8	i	int
    //   256	3	8	bool2	boolean
    //   77	59	9	l1	long
    //   103	35	11	l2	long
    //   129	11	13	str2	String
    // Exception table:
    //   from	to	target	type
    //   38	45	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   59	66	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   70	77	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   85	92	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   96	103	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   111	118	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   122	129	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   139	144	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   147	155	158	android/database/sqlite/SQLiteDatabaseCorruptException
    //   164	167	186	finally
    //   169	174	186	finally
    //   178	183	186	finally
    //   183	186	186	finally
    //   26	31	207	finally
    //   212	215	236	finally
    //   217	222	236	finally
    //   228	233	236	finally
    //   233	236	236	finally
    //   38	45	265	finally
    //   59	66	265	finally
    //   70	77	265	finally
    //   85	92	265	finally
    //   96	103	265	finally
    //   111	118	265	finally
    //   122	129	265	finally
    //   139	144	265	finally
    //   147	155	265	finally
    //   26	31	270	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  public void a()
  {
    Object localObject2;
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.d;
      localObject2 = "thumbnail";
      str2 = null;
      localSQLiteDatabase.delete((String)localObject2, null, null);
      if (0 != 0) {
        null.close();
      }
      return;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject2 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject2).<init>(str1);
        throw ((Throwable)localObject2);
      }
      finally
      {
        if (0 != 0) {
          null.close();
        }
      }
    }
    finally
    {
      localObject2 = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>(str2, localThrowable);
    }
  }
  
  public int b(long paramLong)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject3;
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = "_id=";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
      localObject1 = ((StringBuilder)localObject1).append(paramLong);
      localObject1 = ((StringBuilder)localObject1).toString();
      localObject3 = this.d;
      str2 = "thumbnail";
      int i = ((SQLiteDatabase)localObject3).delete(str2, (String)localObject1, null);
      if (0 != 0) {
        null.close();
      }
      boolean bool2 = b;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return i;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject3 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject3).<init>(str1);
        throw ((Throwable)localObject3);
      }
      finally
      {
        if (0 != 0) {
          null.close();
        }
      }
    }
    finally
    {
      localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject3).<init>(str2, localThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/ai.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */