package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxAudioConversationThumbnailEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxMediaType;
import com.vvt.events.f;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class g
  extends o
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private SQLiteDatabase c;
  
  public g(SQLiteDatabase paramSQLiteDatabase)
  {
    this.c = paramSQLiteDatabase;
  }
  
  private long a(long paramLong, FxAudioConversationThumbnailEvent paramFxAudioConversationThumbnailEvent)
  {
    Object localObject1 = paramFxAudioConversationThumbnailEvent.getActualFullPath();
    Object localObject2 = new android/content/ContentValues;
    ((ContentValues)localObject2).<init>();
    ((ContentValues)localObject2).put("full_path", (String)localObject1);
    Object localObject3 = Long.valueOf(paramFxAudioConversationThumbnailEvent.getActualFileSize());
    ((ContentValues)localObject2).put("actual_size", (Long)localObject3);
    localObject3 = Long.valueOf(paramLong);
    ((ContentValues)localObject2).put("media_id", (Long)localObject3);
    localObject1 = "actual_duration";
    localObject3 = Integer.valueOf(0);
    ((ContentValues)localObject2).put((String)localObject1, (Integer)localObject3);
    long l = -1;
    try
    {
      localObject1 = this.c;
      String str2 = "thumbnail";
      ((SQLiteDatabase)localObject1).insert(str2, null, (ContentValues)localObject2);
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
  
  private long a(FxAudioConversationThumbnailEvent paramFxAudioConversationThumbnailEvent)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Integer.valueOf(0);
    localContentValues.put("has_thumbnail", (Integer)localObject1);
    localObject1 = Integer.valueOf(0);
    localContentValues.put("thumbnail_delivered", (Integer)localObject1);
    long l = paramFxAudioConversationThumbnailEvent.getEventTime();
    localObject1 = Long.valueOf(l);
    localContentValues.put("time", (Long)localObject1);
    localObject1 = paramFxAudioConversationThumbnailEvent.getActualFullPath();
    localContentValues.put("full_path", (String)localObject1);
    Object localObject2 = "media_event_type";
    int i = FxEventType.AUDIO_CONVERSATION_THUMBNAIL.getNumber();
    localObject1 = Integer.valueOf(i);
    localContentValues.put((String)localObject2, (Integer)localObject1);
    try
    {
      localObject2 = this.c;
      localObject1 = "media";
      return ((SQLiteDatabase)localObject2).insert((String)localObject1, null, localContentValues);
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
      localObject1 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject1, localThrowable);
    }
  }
  
  private com.vvt.events.b a(long paramLong)
  {
    com.vvt.events.b localb = new com/vvt/events/b;
    localb.<init>();
    String str1 = "media_id = ?";
    boolean bool = true;
    try
    {
      String[] arrayOfString = new String[bool];
      bool = false;
      Object localObject1 = null;
      localObject4 = String.valueOf(paramLong);
      arrayOfString[0] = localObject4;
      localObject1 = this.c;
      localObject4 = "call_tag";
      int j = 0;
      localObject5 = null;
      int k = 0;
      String str2 = null;
      localObject4 = ((SQLiteDatabase)localObject1).query((String)localObject4, null, str1, arrayOfString, null, null, null);
      if (localObject4 != null) {
        try
        {
          for (;;)
          {
            bool = ((Cursor)localObject4).moveToNext();
            if (!bool) {
              break;
            }
            localObject1 = "contact_name";
            int i = ((Cursor)localObject4).getColumnIndex((String)localObject1);
            localObject1 = ((Cursor)localObject4).getString(i);
            localObject5 = "direction";
            j = ((Cursor)localObject4).getColumnIndex((String)localObject5);
            j = ((Cursor)localObject4).getInt(j);
            str1 = "duration";
            int m = ((Cursor)localObject4).getColumnIndex(str1);
            m = ((Cursor)localObject4).getInt(m);
            long l = m;
            str2 = "number";
            k = ((Cursor)localObject4).getColumnIndex(str2);
            str2 = ((Cursor)localObject4).getString(k);
            localb.b((String)localObject1);
            localObject1 = FxEventDirection.forValue(j);
            localb.a((FxEventDirection)localObject1);
            localb.a(l);
            localb.a(str2);
          }
          try
          {
            localObject5 = new com/vvt/exceptions/database/FxDbOperationException;
            str1 = localThrowable.getMessage();
            ((FxDbOperationException)localObject5).<init>(str1, localThrowable);
            throw ((Throwable)localObject5);
          }
          finally
          {
            if (localObject4 != null) {
              ((Cursor)localObject4).close();
            }
          }
        }
        finally {}
      }
    }
    finally
    {
      for (;;)
      {
        Object localObject5;
        Object localObject4 = null;
      }
    }
    if (localObject4 != null) {
      ((Cursor)localObject4).close();
    }
    return localb;
  }
  
  private void a(long paramLong, com.vvt.events.b paramb)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = paramb.d();
    localContentValues.put("contact_name", (String)localObject1);
    int i = paramb.a().getNumber();
    localObject1 = Integer.valueOf(i);
    localContentValues.put("direction", (Integer)localObject1);
    long l = paramb.b();
    localObject1 = Long.valueOf(l);
    localContentValues.put("duration", (Long)localObject1);
    localObject1 = paramb.c();
    localContentValues.put("number", (String)localObject1);
    Object localObject2 = "media_id";
    localObject1 = Long.valueOf(paramLong);
    localContentValues.put((String)localObject2, (Long)localObject1);
    try
    {
      localObject2 = this.c;
      localObject1 = "call_tag";
      ((SQLiteDatabase)localObject2).insert((String)localObject1, null, localContentValues);
      return;
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
      localObject1 = localThrowable.getMessage();
      ((FxDbOperationException)localObject2).<init>((String)localObject1, localThrowable);
    }
  }
  
  /* Error */
  private boolean a(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc -66
    //   4: astore_3
    //   5: iconst_1
    //   6: istore 4
    //   8: iload 4
    //   10: anewarray 124	java/lang/String
    //   13: astore 5
    //   15: iconst_0
    //   16: istore 4
    //   18: aconst_null
    //   19: astore 6
    //   21: aload 5
    //   23: iconst_0
    //   24: aload_1
    //   25: aastore
    //   26: aload_0
    //   27: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 6
    //   32: ldc 116
    //   34: astore 7
    //   36: iconst_1
    //   37: istore 8
    //   39: iload 8
    //   41: anewarray 124	java/lang/String
    //   44: astore 9
    //   46: ldc 36
    //   48: astore 10
    //   50: aload 9
    //   52: iconst_0
    //   53: aload 10
    //   55: aastore
    //   56: aconst_null
    //   57: astore 10
    //   59: aload 6
    //   61: aload 7
    //   63: aload 9
    //   65: aload_3
    //   66: aload 5
    //   68: aconst_null
    //   69: aconst_null
    //   70: aconst_null
    //   71: invokevirtual 133	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 7
    //   76: aload 7
    //   78: ifnull +84 -> 162
    //   81: aload 7
    //   83: invokeinterface 193 1 0
    //   88: istore 4
    //   90: iload 4
    //   92: ifle +70 -> 162
    //   95: iload_2
    //   96: istore 4
    //   98: aload 7
    //   100: ifnull +10 -> 110
    //   103: aload 7
    //   105: invokeinterface 178 1 0
    //   110: iload 4
    //   112: ireturn
    //   113: astore 6
    //   115: aconst_null
    //   116: astore 7
    //   118: new 87	com/vvt/exceptions/database/FxDbOperationException
    //   121: astore 9
    //   123: aload 6
    //   125: invokevirtual 90	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   128: astore_3
    //   129: aload 9
    //   131: aload_3
    //   132: aload 6
    //   134: invokespecial 93	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: aload 9
    //   139: athrow
    //   140: astore 6
    //   142: aload 7
    //   144: ifnull +10 -> 154
    //   147: aload 7
    //   149: invokeinterface 178 1 0
    //   154: aload 6
    //   156: athrow
    //   157: astore 6
    //   159: goto -41 -> 118
    //   162: iconst_0
    //   163: istore 4
    //   165: aconst_null
    //   166: astore 6
    //   168: goto -70 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	FxFileObserverWorker
    //   0	171	1	paramString	String
    //   1	95	2	i	int
    //   4	128	3	str1	String
    //   6	105	4	j	int
    //   163	1	4	k	int
    //   13	54	5	arrayOfString	String[]
    //   19	41	6	localSQLiteDatabase	SQLiteDatabase
    //   113	20	6	localThrowable	Throwable
    //   140	15	6	localObject1	Object
    //   157	1	6	localObject2	Object
    //   166	1	6	localObject3	Object
    //   34	114	7	localObject4	Object
    //   37	3	8	m	int
    //   44	94	9	localObject5	Object
    //   48	10	10	str2	String
    // Exception table:
    //   from	to	target	type
    //   8	13	113	finally
    //   24	26	113	finally
    //   26	30	113	finally
    //   39	44	113	finally
    //   53	56	113	finally
    //   70	74	113	finally
    //   118	121	140	finally
    //   123	128	140	finally
    //   132	137	140	finally
    //   137	140	140	finally
    //   81	88	157	finally
  }
  
  /* Error */
  public long a(com.vvt.base.FxEvent paramFxEvent)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: aload_1
    //   9: checkcast 27	com/vvt/events/FxAudioConversationThumbnailEvent
    //   12: astore_1
    //   13: iconst_m1
    //   14: i2l
    //   15: lstore_3
    //   16: aload_1
    //   17: invokevirtual 31	com/vvt/events/FxAudioConversationThumbnailEvent:getActualFullPath	()Ljava/lang/String;
    //   20: astore 5
    //   22: aload_0
    //   23: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   26: astore 6
    //   28: aload 6
    //   30: invokevirtual 196	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   33: aload_0
    //   34: aload 5
    //   36: invokespecial 199	com/vvt/eventrepository/a/FxFileObserverWorker:a	(Ljava/lang/String;)Z
    //   39: istore 7
    //   41: iload 7
    //   43: ifne +152 -> 195
    //   46: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   49: istore_2
    //   50: iload_2
    //   51: ifeq +3 -> 54
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 202	com/vvt/eventrepository/a/FxFileObserverWorker:a	(Lcom/vvt/events/FxAudioConversationThumbnailEvent;)J
    //   59: lstore_3
    //   60: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   63: istore 7
    //   65: iload 7
    //   67: ifeq +3 -> 70
    //   70: aload_1
    //   71: invokevirtual 206	com/vvt/events/FxAudioConversationThumbnailEvent:getEmbededCallInfo	()Lcom/vvt/events/removeFromPath;
    //   74: astore 5
    //   76: aload_0
    //   77: lload_3
    //   78: aload 5
    //   80: invokespecial 209	com/vvt/eventrepository/a/FxFileObserverWorker:a	(JLcom/vvt/events/removeFromPath;)V
    //   83: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   86: istore 7
    //   88: iload 7
    //   90: ifeq +3 -> 93
    //   93: aload_0
    //   94: lload_3
    //   95: aload_1
    //   96: invokespecial 212	com/vvt/eventrepository/a/FxFileObserverWorker:a	(JLcom/vvt/events/FxAudioConversationThumbnailEvent;)J
    //   99: pop2
    //   100: lconst_0
    //   101: lstore 8
    //   103: lload_3
    //   104: lload 8
    //   106: lcmp
    //   107: istore 7
    //   109: iload 7
    //   111: ifle +40 -> 151
    //   114: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   117: istore 7
    //   119: iload 7
    //   121: ifeq +3 -> 124
    //   124: aload_0
    //   125: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   128: astore 5
    //   130: getstatic 110	com/vvt/base/FxEventType:AUDIO_CONVERSATION_THUMBNAIL	Lcom/vvt/base/FxEventType;
    //   133: astore 6
    //   135: getstatic 216	com/vvt/events/FxEventDirection:UNKNOWN	Lcom/vvt/events/FxEventDirection;
    //   138: astore 10
    //   140: aload 5
    //   142: lload_3
    //   143: aload 6
    //   145: aload 10
    //   147: invokestatic 221	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;JLcom/vvt/base/FxEventType;Lcom/vvt/events/FxEventDirection;)J
    //   150: pop2
    //   151: aload_0
    //   152: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   155: astore 5
    //   157: aload 5
    //   159: invokevirtual 224	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   162: aload_0
    //   163: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   166: astore 5
    //   168: aload 5
    //   170: invokevirtual 227	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   173: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   176: istore 7
    //   178: iload 7
    //   180: ifeq +3 -> 183
    //   183: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   186: istore 7
    //   188: iload 7
    //   190: ifeq +3 -> 193
    //   193: lload_3
    //   194: lreturn
    //   195: getstatic 19	com/vvt/eventrepository/a/FxFileObserverWorker:removeFromPath	Z
    //   198: istore 7
    //   200: iload 7
    //   202: ifeq -40 -> 162
    //   205: goto -43 -> 162
    //   208: astore 11
    //   210: new 77	com/vvt/exceptions/database/FxDbCorruptException
    //   213: astore 12
    //   215: aload 11
    //   217: invokevirtual 82	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   220: astore 11
    //   222: aload 12
    //   224: aload 11
    //   226: invokespecial 85	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   229: aload 12
    //   231: athrow
    //   232: astore 11
    //   234: aload_0
    //   235: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   238: invokevirtual 227	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   241: aload 11
    //   243: athrow
    //   244: astore 11
    //   246: new 87	com/vvt/exceptions/database/FxDbOperationException
    //   249: astore 12
    //   251: aload 11
    //   253: invokevirtual 90	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   256: astore 5
    //   258: aload 12
    //   260: aload 5
    //   262: aload 11
    //   264: invokespecial 93	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   267: aload 12
    //   269: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	270	0	this	FxFileObserverWorker
    //   0	270	1	paramFxEvent	com.vvt.base.FxEvent
    //   3	48	2	bool1	boolean
    //   15	179	3	l1	long
    //   20	241	5	localObject1	Object
    //   26	118	6	localObject2	Object
    //   39	162	7	bool2	boolean
    //   101	4	8	l2	long
    //   138	8	10	localFxEventDirection	FxEventDirection
    //   208	8	11	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   220	5	11	str	String
    //   232	10	11	localObject3	Object
    //   244	19	11	localThrowable	Throwable
    //   213	55	12	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   16	20	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   22	26	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   28	33	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   34	39	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   46	49	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   55	59	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   60	63	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   70	74	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   78	83	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   83	86	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   95	100	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   114	117	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   124	128	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   130	133	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   135	138	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   145	151	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   151	155	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   157	162	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   195	198	208	android/database/sqlite/SQLiteDatabaseCorruptException
    //   210	213	232	finally
    //   215	220	232	finally
    //   224	229	232	finally
    //   229	232	232	finally
    //   246	249	232	finally
    //   251	256	232	finally
    //   262	267	232	finally
    //   267	270	232	finally
    //   16	20	244	finally
    //   22	26	244	finally
    //   28	33	244	finally
    //   34	39	244	finally
    //   46	49	244	finally
    //   55	59	244	finally
    //   60	63	244	finally
    //   70	74	244	finally
    //   78	83	244	finally
    //   83	86	244	finally
    //   95	100	244	finally
    //   114	117	244	finally
    //   124	128	244	finally
    //   130	133	244	finally
    //   135	138	244	finally
    //   145	151	244	finally
    //   151	155	244	finally
    //   157	162	244	finally
    //   195	198	244	finally
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = n.a(paramQueryOrder);
    Object localObject4 = Integer.toString(paramInt);
    int i = FxEventType.AUDIO_CONVERSATION_THUMBNAIL.getNumber();
    Object localObject5 = Integer.toString(i);
    Object localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    localObject6 = ((StringBuilder)localObject6).append("SELECT media._id, time, media.full_path as actual_path, media_event_type, thumbnail_delivered, has_thumbnail, thumbnail.full_path as thumbnail_path, actual_size, actual_duration  FROM media LEFT JOIN thumbnail ON media._id =  thumbnail.media_id WHERE media.thumbnail_delivered = 0 AND media.media_event_type = ? ");
    Object localObject7 = " ORDER BY media.";
    localObject2 = ((StringBuilder)localObject6).append((String)localObject7).append((String)localObject2);
    localObject6 = " LIMIT ";
    localObject2 = (String)localObject6 + (String)localObject4;
    localObject4 = null;
    for (;;)
    {
      try
      {
        localObject6 = this.c;
        int j = 1;
        localObject7 = new String[j];
        localObject7[0] = localObject5;
        localObject4 = ((SQLiteDatabase)localObject6).rawQuery((String)localObject2, (String[])localObject7);
        if (localObject4 == null) {
          break label520;
        }
        boolean bool1 = ((Cursor)localObject4).moveToNext();
        if (!bool1) {
          break label520;
        }
        localObject5 = new com/vvt/events/FxAudioConversationThumbnailEvent;
        ((FxAudioConversationThumbnailEvent)localObject5).<init>();
        localObject2 = "_id";
        int k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
        l1 = ((Cursor)localObject4).getLong(k);
        localObject2 = "time";
        k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
        l2 = ((Cursor)localObject4).getLong(k);
        localObject2 = "actual_path";
        k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
        localObject8 = ((Cursor)localObject4).getString(k);
        localObject2 = "actual_size";
        k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
        m = ((Cursor)localObject4).getInt(k);
        localObject2 = "actual_duration";
        k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
        n = ((Cursor)localObject4).getInt(k);
        localObject2 = FxMediaType.UNKNOWN;
        bool3 = com.vvt.ag.b.a((String)localObject8);
        if (bool3) {
          continue;
        }
        File localFile = new java/io/File;
        localFile.<init>((String)localObject8);
        bool3 = localFile.exists();
        if (bool3)
        {
          localObject2 = d.a((String)localObject8);
          localObject2 = f.a((String)localObject2);
        }
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        try
        {
          long l1;
          long l2;
          Object localObject8;
          int m;
          int n;
          long l3;
          long l4;
          localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
          String str = localSQLiteDatabaseCorruptException.getMessage();
          ((FxDbCorruptException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
        finally
        {
          if (localObject4 != null) {
            ((Cursor)localObject4).close();
          }
        }
        boolean bool3 = b;
        if (!bool3) {
          continue;
        }
        continue;
      }
      finally
      {
        localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject5 = localThrowable.getMessage();
        ((FxDbOperationException)localObject1).<init>((String)localObject5, localThrowable);
      }
      ((FxAudioConversationThumbnailEvent)localObject5).setActualFullPath((String)localObject8);
      l3 = n;
      ((FxAudioConversationThumbnailEvent)localObject5).setActualDuration(l3);
      l4 = m;
      ((FxAudioConversationThumbnailEvent)localObject5).setActualFileSize(l4);
      localObject8 = null;
      localObject8 = new byte[0];
      ((FxAudioConversationThumbnailEvent)localObject5).setAudioData((byte[])localObject8);
      ((FxAudioConversationThumbnailEvent)localObject5).setEventId(l1);
      ((FxAudioConversationThumbnailEvent)localObject5).setEventTime(l2);
      ((FxAudioConversationThumbnailEvent)localObject5).setFormat((FxMediaType)localObject2);
      ((FxAudioConversationThumbnailEvent)localObject5).setParingId(l1);
      localObject2 = a(l1);
      ((FxAudioConversationThumbnailEvent)localObject5).setEmbededCallInfo((com.vvt.events.b)localObject2);
      ((List)localObject1).add(localObject5);
    }
    label520:
    if (localObject4 != null) {
      ((Cursor)localObject4).close();
    }
    boolean bool2 = a;
    if (bool2) {}
    return (List)localObject1;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   14: astore_3
    //   15: ldc 69
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_3
    //   23: aload 4
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokestatic 330	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +59 -> 92
    //   36: aload_1
    //   37: invokeinterface 333 1 0
    //   42: istore_2
    //   43: iload_2
    //   44: ifeq +48 -> 92
    //   47: ldc 36
    //   49: astore_3
    //   50: aload_1
    //   51: aload_3
    //   52: invokeinterface 145 2 0
    //   57: istore_2
    //   58: aload_1
    //   59: iload_2
    //   60: invokeinterface 149 2 0
    //   65: astore_3
    //   66: aload_3
    //   67: ifnull +25 -> 92
    //   70: ldc_w 335
    //   73: astore 4
    //   75: aload_3
    //   76: aload 4
    //   78: invokevirtual 338	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   81: istore 6
    //   83: iload 6
    //   85: ifne +7 -> 92
    //   88: aload_3
    //   89: invokestatic 339	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   92: aload_0
    //   93: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   96: astore_3
    //   97: ldc 69
    //   99: astore 4
    //   101: aconst_null
    //   102: astore 5
    //   104: aload_3
    //   105: aload 4
    //   107: aconst_null
    //   108: aconst_null
    //   109: invokevirtual 343	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   112: pop
    //   113: aload_1
    //   114: ifnull +9 -> 123
    //   117: aload_1
    //   118: invokeinterface 178 1 0
    //   123: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   126: istore_2
    //   127: iload_2
    //   128: ifeq +3 -> 131
    //   131: return
    //   132: astore_3
    //   133: new 77	com/vvt/exceptions/database/FxDbCorruptException
    //   136: astore 4
    //   138: aload_3
    //   139: invokevirtual 82	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   142: astore_3
    //   143: aload 4
    //   145: aload_3
    //   146: invokespecial 85	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   149: aload 4
    //   151: athrow
    //   152: astore_3
    //   153: aload_1
    //   154: ifnull +9 -> 163
    //   157: aload_1
    //   158: invokeinterface 178 1 0
    //   163: aload_3
    //   164: athrow
    //   165: astore_3
    //   166: new 87	com/vvt/exceptions/database/FxDbOperationException
    //   169: astore 4
    //   171: aload_3
    //   172: invokevirtual 90	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   175: astore 5
    //   177: aload 4
    //   179: aload 5
    //   181: aload_3
    //   182: invokespecial 93	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   185: aload 4
    //   187: athrow
    //   188: astore_3
    //   189: goto -97 -> 92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	this	FxFileObserverWorker
    //   1	157	1	localCursor	Cursor
    //   5	39	2	bool1	boolean
    //   57	3	2	i	int
    //   126	2	2	bool2	boolean
    //   14	91	3	localObject1	Object
    //   132	7	3	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   142	4	3	str1	String
    //   152	12	3	localObject2	Object
    //   165	17	3	localThrowable	Throwable
    //   188	1	3	localIllegalArgumentException	IllegalArgumentException
    //   17	169	4	localObject3	Object
    //   20	160	5	str2	String
    //   81	3	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   10	14	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   27	31	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   36	42	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   51	57	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   59	65	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   76	81	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   88	92	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   92	96	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   108	113	132	android/database/sqlite/SQLiteDatabaseCorruptException
    //   133	136	152	finally
    //   138	142	152	finally
    //   145	149	152	finally
    //   149	152	152	finally
    //   166	169	152	finally
    //   171	175	152	finally
    //   181	185	152	finally
    //   185	188	152	finally
    //   10	14	165	finally
    //   27	31	165	finally
    //   36	42	165	finally
    //   51	57	165	finally
    //   59	65	165	finally
    //   76	81	165	finally
    //   88	92	165	finally
    //   92	96	165	finally
    //   108	113	165	finally
    //   88	92	188	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public int b(long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: new 238	java/lang/StringBuilder
    //   18: astore 6
    //   20: aload 6
    //   22: invokespecial 239	java/lang/StringBuilder:<init>	()V
    //   25: ldc_w 347
    //   28: astore 7
    //   30: aload 6
    //   32: aload 7
    //   34: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: lload_1
    //   38: invokevirtual 350	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   41: invokevirtual 251	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: astore 6
    //   46: aload_0
    //   47: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   50: astore 7
    //   52: ldc 69
    //   54: astore 8
    //   56: aload 7
    //   58: aload 8
    //   60: aload 6
    //   62: aconst_null
    //   63: aconst_null
    //   64: invokestatic 330	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   67: astore 4
    //   69: aload 4
    //   71: ifnull +72 -> 143
    //   74: aload 4
    //   76: invokeinterface 333 1 0
    //   81: istore 9
    //   83: iload 9
    //   85: ifeq +58 -> 143
    //   88: ldc 36
    //   90: astore 7
    //   92: aload 4
    //   94: aload 7
    //   96: invokeinterface 145 2 0
    //   101: istore 9
    //   103: aload 4
    //   105: iload 9
    //   107: invokeinterface 149 2 0
    //   112: astore 7
    //   114: aload 7
    //   116: ifnull +27 -> 143
    //   119: ldc_w 335
    //   122: astore 8
    //   124: aload 7
    //   126: aload 8
    //   128: invokevirtual 338	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   131: istore 10
    //   133: iload 10
    //   135: ifne +8 -> 143
    //   138: aload 7
    //   140: invokestatic 339	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   143: aload_0
    //   144: getfield 25	com/vvt/eventrepository/a/FxFileObserverWorker:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   147: astore 7
    //   149: ldc 69
    //   151: astore 8
    //   153: aload 7
    //   155: aload 8
    //   157: aload 6
    //   159: aconst_null
    //   160: invokevirtual 343	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   163: istore 5
    //   165: aload 4
    //   167: ifnull +10 -> 177
    //   170: aload 4
    //   172: invokeinterface 178 1 0
    //   177: getstatic 14	com/vvt/eventrepository/a/FxFileObserverWorker:a	Z
    //   180: istore_3
    //   181: iload_3
    //   182: ifeq +3 -> 185
    //   185: iload 5
    //   187: ireturn
    //   188: astore 6
    //   190: new 77	com/vvt/exceptions/database/FxDbCorruptException
    //   193: astore 7
    //   195: aload 6
    //   197: invokevirtual 82	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   200: astore 6
    //   202: aload 7
    //   204: aload 6
    //   206: invokespecial 85	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   209: aload 7
    //   211: athrow
    //   212: astore 6
    //   214: aload 4
    //   216: ifnull +10 -> 226
    //   219: aload 4
    //   221: invokeinterface 178 1 0
    //   226: aload 6
    //   228: athrow
    //   229: astore 6
    //   231: new 87	com/vvt/exceptions/database/FxDbOperationException
    //   234: astore 7
    //   236: aload 6
    //   238: invokevirtual 90	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   241: astore 8
    //   243: aload 7
    //   245: aload 8
    //   247: aload 6
    //   249: invokespecial 93	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   252: aload 7
    //   254: athrow
    //   255: astore 7
    //   257: goto -114 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	this	FxFileObserverWorker
    //   0	260	1	paramLong	long
    //   1	181	3	bool1	boolean
    //   3	217	4	localCursor	Cursor
    //   8	3	5	bool2	boolean
    //   163	23	5	i	int
    //   18	140	6	localObject1	Object
    //   188	8	6	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   200	5	6	str1	String
    //   212	15	6	localObject2	Object
    //   229	19	6	localThrowable	Throwable
    //   28	225	7	localObject3	Object
    //   255	1	7	localIllegalArgumentException	IllegalArgumentException
    //   54	192	8	str2	String
    //   81	3	9	bool3	boolean
    //   101	5	9	j	int
    //   131	3	10	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   46	50	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   63	67	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   74	81	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   94	101	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   105	112	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   126	131	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   138	143	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   143	147	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   159	163	188	android/database/sqlite/SQLiteDatabaseCorruptException
    //   190	193	212	finally
    //   195	200	212	finally
    //   204	209	212	finally
    //   209	212	212	finally
    //   231	234	212	finally
    //   236	241	212	finally
    //   247	252	212	finally
    //   252	255	212	finally
    //   46	50	229	finally
    //   63	67	229	finally
    //   74	81	229	finally
    //   94	101	229	finally
    //   105	112	229	finally
    //   126	131	229	finally
    //   138	143	229	finally
    //   143	147	229	finally
    //   159	163	229	finally
    //   138	143	255	java/lang/IllegalArgumentException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */