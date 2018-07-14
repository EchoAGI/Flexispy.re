package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxAudioConversationEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxMediaType;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f
  extends o
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private SQLiteDatabase c;
  
  public f(SQLiteDatabase paramSQLiteDatabase)
  {
    this.c = paramSQLiteDatabase;
  }
  
  private long a(FxAudioConversationEvent paramFxAudioConversationEvent)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Integer.valueOf(0);
    localContentValues.put("has_thumbnail", (Integer)localObject1);
    localObject1 = Integer.valueOf(0);
    localContentValues.put("thumbnail_delivered", (Integer)localObject1);
    long l = paramFxAudioConversationEvent.getEventTime();
    localObject1 = Long.valueOf(l);
    localContentValues.put("time", (Long)localObject1);
    localObject1 = paramFxAudioConversationEvent.getFilePath();
    localContentValues.put("full_path", (String)localObject1);
    Object localObject2 = "media_event_type";
    int i = FxEventType.AUDIO_CONVERSATION.getNumber();
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
    //   2: ldc -74
    //   4: astore_3
    //   5: iconst_1
    //   6: istore 4
    //   8: iload 4
    //   10: anewarray 113	java/lang/String
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
    //   27: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 6
    //   32: ldc 81
    //   34: astore 7
    //   36: iconst_1
    //   37: istore 8
    //   39: iload 8
    //   41: anewarray 113	java/lang/String
    //   44: astore 9
    //   46: ldc 60
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
    //   71: invokevirtual 122	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 7
    //   76: aload 7
    //   78: ifnull +84 -> 162
    //   81: aload 7
    //   83: invokeinterface 185 1 0
    //   88: istore 4
    //   90: iload 4
    //   92: ifle +70 -> 162
    //   95: iload_2
    //   96: istore 4
    //   98: aload 7
    //   100: ifnull +10 -> 110
    //   103: aload 7
    //   105: invokeinterface 167 1 0
    //   110: iload 4
    //   112: ireturn
    //   113: astore 6
    //   115: aconst_null
    //   116: astore 7
    //   118: new 99	com/vvt/exceptions/database/FxDbOperationException
    //   121: astore 9
    //   123: aload 6
    //   125: invokevirtual 102	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   128: astore_3
    //   129: aload 9
    //   131: aload_3
    //   132: aload 6
    //   134: invokespecial 105	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: aload 9
    //   139: athrow
    //   140: astore 6
    //   142: aload 7
    //   144: ifnull +10 -> 154
    //   147: aload 7
    //   149: invokeinterface 167 1 0
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
    //   0	171	0	this	f
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
    //   0: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: aload_1
    //   9: checkcast 46	com/vvt/events/FxAudioConversationEvent
    //   12: astore_1
    //   13: iconst_m1
    //   14: i2l
    //   15: lstore_3
    //   16: aload_1
    //   17: invokevirtual 64	com/vvt/events/FxAudioConversationEvent:getFilePath	()Ljava/lang/String;
    //   20: astore 5
    //   22: aload_0
    //   23: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   26: astore 6
    //   28: aload 6
    //   30: invokevirtual 188	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   33: aload_0
    //   34: aload 5
    //   36: invokespecial 191	com/vvt/eventrepository/a/f:a	(Ljava/lang/String;)Z
    //   39: istore 7
    //   41: iload 7
    //   43: ifne +135 -> 178
    //   46: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   49: istore_2
    //   50: iload_2
    //   51: ifeq +3 -> 54
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 194	com/vvt/eventrepository/a/f:a	(Lcom/vvt/events/FxAudioConversationEvent;)J
    //   59: lstore_3
    //   60: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   63: istore 7
    //   65: iload 7
    //   67: ifeq +3 -> 70
    //   70: aload_1
    //   71: invokevirtual 198	com/vvt/events/FxAudioConversationEvent:getEmbededCallInfo	()Lcom/vvt/events/removeFromPath;
    //   74: astore 5
    //   76: aload_0
    //   77: lload_3
    //   78: aload 5
    //   80: invokespecial 201	com/vvt/eventrepository/a/f:a	(JLcom/vvt/events/removeFromPath;)V
    //   83: lconst_0
    //   84: lstore 8
    //   86: lload_3
    //   87: lload 8
    //   89: lcmp
    //   90: istore 7
    //   92: iload 7
    //   94: ifle +40 -> 134
    //   97: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   100: istore 7
    //   102: iload 7
    //   104: ifeq +3 -> 107
    //   107: aload_0
    //   108: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   111: astore 5
    //   113: getstatic 75	com/vvt/base/FxEventType:AUDIO_CONVERSATION	Lcom/vvt/base/FxEventType;
    //   116: astore 6
    //   118: getstatic 205	com/vvt/events/FxEventDirection:UNKNOWN	Lcom/vvt/events/FxEventDirection;
    //   121: astore 10
    //   123: aload 5
    //   125: lload_3
    //   126: aload 6
    //   128: aload 10
    //   130: invokestatic 210	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;JLcom/vvt/base/FxEventType;Lcom/vvt/events/FxEventDirection;)J
    //   133: pop2
    //   134: aload_0
    //   135: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   138: astore 5
    //   140: aload 5
    //   142: invokevirtual 213	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   145: aload_0
    //   146: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   149: astore 5
    //   151: aload 5
    //   153: invokevirtual 216	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   156: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   159: istore 7
    //   161: iload 7
    //   163: ifeq +3 -> 166
    //   166: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   169: istore 7
    //   171: iload 7
    //   173: ifeq +3 -> 176
    //   176: lload_3
    //   177: lreturn
    //   178: getstatic 19	com/vvt/eventrepository/a/f:removeFromPath	Z
    //   181: istore 7
    //   183: iload 7
    //   185: ifeq -40 -> 145
    //   188: goto -43 -> 145
    //   191: astore 11
    //   193: new 89	com/vvt/exceptions/database/FxDbCorruptException
    //   196: astore 12
    //   198: aload 11
    //   200: invokevirtual 94	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   203: astore 11
    //   205: aload 12
    //   207: aload 11
    //   209: invokespecial 97	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   212: aload 12
    //   214: athrow
    //   215: astore 11
    //   217: aload_0
    //   218: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   221: invokevirtual 216	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   224: aload 11
    //   226: athrow
    //   227: astore 11
    //   229: new 99	com/vvt/exceptions/database/FxDbOperationException
    //   232: astore 12
    //   234: aload 11
    //   236: invokevirtual 102	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   239: astore 5
    //   241: aload 12
    //   243: aload 5
    //   245: aload 11
    //   247: invokespecial 105	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   250: aload 12
    //   252: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	this	f
    //   0	253	1	paramFxEvent	com.vvt.base.FxEvent
    //   3	48	2	bool1	boolean
    //   15	162	3	l1	long
    //   20	224	5	localObject1	Object
    //   26	101	6	localObject2	Object
    //   39	145	7	bool2	boolean
    //   84	4	8	l2	long
    //   121	8	10	localFxEventDirection	FxEventDirection
    //   191	8	11	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   203	5	11	str	String
    //   215	10	11	localObject3	Object
    //   227	19	11	localThrowable	Throwable
    //   196	55	12	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   16	20	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   22	26	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   28	33	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   34	39	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   46	49	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   55	59	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   60	63	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   70	74	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   78	83	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   97	100	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   107	111	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   113	116	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   118	121	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   128	134	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   134	138	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   140	145	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   178	181	191	android/database/sqlite/SQLiteDatabaseCorruptException
    //   193	196	215	finally
    //   198	203	215	finally
    //   207	212	215	finally
    //   212	215	215	finally
    //   229	232	215	finally
    //   234	239	215	finally
    //   245	250	215	finally
    //   250	253	215	finally
    //   16	20	227	finally
    //   22	26	227	finally
    //   28	33	227	finally
    //   34	39	227	finally
    //   46	49	227	finally
    //   55	59	227	finally
    //   60	63	227	finally
    //   70	74	227	finally
    //   78	83	227	finally
    //   97	100	227	finally
    //   107	111	227	finally
    //   113	116	227	finally
    //   118	121	227	finally
    //   128	134	227	finally
    //   134	138	227	finally
    //   140	145	227	finally
    //   178	181	227	finally
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = n.a(paramQueryOrder);
    Object localObject4 = Integer.toString(paramInt);
    int i = FxEventType.AUDIO_CONVERSATION.getNumber();
    Object localObject5 = Integer.toString(i);
    Object localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    localObject6 = ((StringBuilder)localObject6).append("SELECT media._id, time, media.full_path as actual_path, media_event_type, thumbnail_delivered, has_thumbnail, thumbnail.full_path as thumbnail_path, actual_size, actual_duration  FROM media LEFT JOIN thumbnail ON media._id =  thumbnail.media_id WHERE media.thumbnail_delivered = 0 AND media.media_event_type = ? ");
    Object localObject7 = " ORDER BY media.";
    localObject2 = (String)localObject7 + (String)localObject2 + " LIMIT " + (String)localObject4;
    localObject4 = null;
    localObject6 = new java/util/ArrayList;
    ((ArrayList)localObject6).<init>();
    Long localLong2;
    for (;;)
    {
      try
      {
        localObject7 = this.c;
        int j = 1;
        String[] arrayOfString = new String[j];
        arrayOfString[0] = localObject5;
        localObject4 = ((SQLiteDatabase)localObject7).rawQuery((String)localObject2, arrayOfString);
        if (localObject4 == null) {
          break;
        }
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        try
        {
          long l2;
          Object localObject8;
          boolean bool2;
          boolean bool3;
          Object localObject9;
          long l3;
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
        bool1 = b;
        if (!bool1) {
          continue;
        }
        Long localLong1 = Long.valueOf(l1);
        ((List)localObject6).add(localLong1);
        continue;
      }
      finally
      {
        localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject5 = localThrowable.getMessage();
        ((FxDbOperationException)localObject1).<init>((String)localObject5, localThrowable);
      }
      bool1 = ((Cursor)localObject4).moveToNext();
      if (!bool1) {
        break;
      }
      localObject2 = new com/vvt/events/FxAudioConversationEvent;
      ((FxAudioConversationEvent)localObject2).<init>();
      localObject5 = "_id";
      i = ((Cursor)localObject4).getColumnIndex((String)localObject5);
      long l1 = ((Cursor)localObject4).getLong(i);
      localObject5 = "time";
      i = ((Cursor)localObject4).getColumnIndex((String)localObject5);
      l2 = ((Cursor)localObject4).getLong(i);
      localObject5 = "actual_path";
      i = ((Cursor)localObject4).getColumnIndex((String)localObject5);
      localObject5 = ((Cursor)localObject4).getString(i);
      localObject8 = "";
      localObject8 = FxMediaType.UNKNOWN;
      bool2 = com.vvt.ag.b.a((String)localObject5);
      if (!bool2)
      {
        localObject8 = new java/io/File;
        ((File)localObject8).<init>((String)localObject5);
        bool3 = ((File)localObject8).exists();
        if (bool3)
        {
          localObject8 = ((File)localObject8).getName();
          localObject9 = d.a((String)localObject5);
          localObject9 = com.vvt.events.f.a((String)localObject9);
          ((FxAudioConversationEvent)localObject2).setFilePath((String)localObject5);
          ((FxAudioConversationEvent)localObject2).setFileName((String)localObject8);
          l3 = 0L;
          ((FxAudioConversationEvent)localObject2).setParingId(l3);
          ((FxAudioConversationEvent)localObject2).setEventId(l1);
          ((FxAudioConversationEvent)localObject2).setEventTime(l2);
          ((FxAudioConversationEvent)localObject2).setFormat((FxMediaType)localObject9);
          ((FxAudioConversationEvent)localObject2).setParingId(l1);
          localObject5 = a(l1);
          ((FxAudioConversationEvent)localObject2).setEmbededCallInfo((com.vvt.events.b)localObject5);
          ((List)localObject1).add(localObject2);
          continue;
        }
      }
      bool1 = b;
      if (bool1) {}
      localLong2 = Long.valueOf(l1);
      ((List)localObject6).add(localLong2);
    }
    if (localObject4 != null) {
      ((Cursor)localObject4).close();
    }
    localObject4 = ((List)localObject6).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localLong2 = (Long)((Iterator)localObject4).next();
      long l4 = localLong2.longValue();
      try
      {
        b(l4);
      }
      catch (Exception localException)
      {
        bool1 = b;
      }
      if (!bool1) {}
    }
    boolean bool1 = a;
    if (bool1) {}
    return (List)localObject1;
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   14: astore_3
    //   15: ldc 81
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_3
    //   23: aload 4
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokestatic 338	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +58 -> 91
    //   36: aload_1
    //   37: invokeinterface 341 1 0
    //   42: istore_2
    //   43: iload_2
    //   44: ifeq +47 -> 91
    //   47: ldc 60
    //   49: astore_3
    //   50: aload_1
    //   51: aload_3
    //   52: invokeinterface 134 2 0
    //   57: istore_2
    //   58: aload_1
    //   59: iload_2
    //   60: invokeinterface 138 2 0
    //   65: astore_3
    //   66: aload_3
    //   67: ifnull +24 -> 91
    //   70: ldc -1
    //   72: astore 4
    //   74: aload_3
    //   75: aload 4
    //   77: invokevirtual 344	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   80: istore 6
    //   82: iload 6
    //   84: ifne +7 -> 91
    //   87: aload_3
    //   88: invokestatic 345	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   91: aload_0
    //   92: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   95: astore_3
    //   96: ldc 81
    //   98: astore 4
    //   100: aconst_null
    //   101: astore 5
    //   103: aload_3
    //   104: aload 4
    //   106: aconst_null
    //   107: aconst_null
    //   108: invokevirtual 349	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   111: pop
    //   112: aload_1
    //   113: ifnull +9 -> 122
    //   116: aload_1
    //   117: invokeinterface 167 1 0
    //   122: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   125: istore_2
    //   126: iload_2
    //   127: ifeq +3 -> 130
    //   130: return
    //   131: astore_3
    //   132: new 89	com/vvt/exceptions/database/FxDbCorruptException
    //   135: astore 4
    //   137: aload_3
    //   138: invokevirtual 94	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   141: astore_3
    //   142: aload 4
    //   144: aload_3
    //   145: invokespecial 97	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   148: aload 4
    //   150: athrow
    //   151: astore_3
    //   152: aload_1
    //   153: ifnull +9 -> 162
    //   156: aload_1
    //   157: invokeinterface 167 1 0
    //   162: aload_3
    //   163: athrow
    //   164: astore_3
    //   165: new 99	com/vvt/exceptions/database/FxDbOperationException
    //   168: astore 4
    //   170: aload_3
    //   171: invokevirtual 102	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   174: astore 5
    //   176: aload 4
    //   178: aload 5
    //   180: aload_3
    //   181: invokespecial 105	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   184: aload 4
    //   186: athrow
    //   187: astore_3
    //   188: goto -97 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	this	f
    //   1	156	1	localCursor	Cursor
    //   5	39	2	bool1	boolean
    //   57	3	2	i	int
    //   125	2	2	bool2	boolean
    //   14	90	3	localObject1	Object
    //   131	7	3	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   141	4	3	str1	String
    //   151	12	3	localObject2	Object
    //   164	17	3	localThrowable	Throwable
    //   187	1	3	localIllegalArgumentException	IllegalArgumentException
    //   17	168	4	localObject3	Object
    //   20	159	5	str2	String
    //   80	3	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   10	14	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   27	31	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   36	42	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   51	57	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   59	65	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   75	80	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   87	91	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   91	95	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   107	112	131	android/database/sqlite/SQLiteDatabaseCorruptException
    //   132	135	151	finally
    //   137	141	151	finally
    //   144	148	151	finally
    //   148	151	151	finally
    //   165	168	151	finally
    //   170	174	151	finally
    //   180	184	151	finally
    //   184	187	151	finally
    //   10	14	164	finally
    //   27	31	164	finally
    //   36	42	164	finally
    //   51	57	164	finally
    //   59	65	164	finally
    //   75	80	164	finally
    //   87	91	164	finally
    //   91	95	164	finally
    //   107	112	164	finally
    //   87	91	187	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public int b(long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: new 227	java/lang/StringBuilder
    //   18: astore 6
    //   20: aload 6
    //   22: invokespecial 228	java/lang/StringBuilder:<init>	()V
    //   25: ldc_w 353
    //   28: astore 7
    //   30: aload 6
    //   32: aload 7
    //   34: invokevirtual 234	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: lload_1
    //   38: invokevirtual 356	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   41: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: astore 6
    //   46: aload_0
    //   47: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   50: astore 7
    //   52: ldc 81
    //   54: astore 8
    //   56: aload 7
    //   58: aload 8
    //   60: aload 6
    //   62: aconst_null
    //   63: aconst_null
    //   64: invokestatic 338	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   67: astore 4
    //   69: aload 4
    //   71: ifnull +71 -> 142
    //   74: aload 4
    //   76: invokeinterface 341 1 0
    //   81: istore 9
    //   83: iload 9
    //   85: ifeq +57 -> 142
    //   88: ldc 60
    //   90: astore 7
    //   92: aload 4
    //   94: aload 7
    //   96: invokeinterface 134 2 0
    //   101: istore 9
    //   103: aload 4
    //   105: iload 9
    //   107: invokeinterface 138 2 0
    //   112: astore 7
    //   114: aload 7
    //   116: ifnull +26 -> 142
    //   119: ldc -1
    //   121: astore 8
    //   123: aload 7
    //   125: aload 8
    //   127: invokevirtual 344	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   130: istore 10
    //   132: iload 10
    //   134: ifne +8 -> 142
    //   137: aload 7
    //   139: invokestatic 345	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   142: aload_0
    //   143: getfield 25	com/vvt/eventrepository/a/f:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   146: astore 7
    //   148: ldc 81
    //   150: astore 8
    //   152: aload 7
    //   154: aload 8
    //   156: aload 6
    //   158: aconst_null
    //   159: invokevirtual 349	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   162: istore 5
    //   164: aload 4
    //   166: ifnull +10 -> 176
    //   169: aload 4
    //   171: invokeinterface 167 1 0
    //   176: getstatic 14	com/vvt/eventrepository/a/f:a	Z
    //   179: istore_3
    //   180: iload_3
    //   181: ifeq +3 -> 184
    //   184: iload 5
    //   186: ireturn
    //   187: astore 6
    //   189: new 89	com/vvt/exceptions/database/FxDbCorruptException
    //   192: astore 7
    //   194: aload 6
    //   196: invokevirtual 94	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   199: astore 6
    //   201: aload 7
    //   203: aload 6
    //   205: invokespecial 97	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   208: aload 7
    //   210: athrow
    //   211: astore 6
    //   213: aload 4
    //   215: ifnull +10 -> 225
    //   218: aload 4
    //   220: invokeinterface 167 1 0
    //   225: aload 6
    //   227: athrow
    //   228: astore 6
    //   230: new 99	com/vvt/exceptions/database/FxDbOperationException
    //   233: astore 7
    //   235: aload 6
    //   237: invokevirtual 102	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   240: astore 8
    //   242: aload 7
    //   244: aload 8
    //   246: aload 6
    //   248: invokespecial 105	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   251: aload 7
    //   253: athrow
    //   254: astore 7
    //   256: goto -114 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	f
    //   0	259	1	paramLong	long
    //   1	180	3	bool1	boolean
    //   3	216	4	localCursor	Cursor
    //   8	3	5	bool2	boolean
    //   162	23	5	i	int
    //   18	139	6	localObject1	Object
    //   187	8	6	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   199	5	6	str1	String
    //   211	15	6	localObject2	Object
    //   228	19	6	localThrowable	Throwable
    //   28	224	7	localObject3	Object
    //   254	1	7	localIllegalArgumentException	IllegalArgumentException
    //   54	191	8	str2	String
    //   81	3	9	bool3	boolean
    //   101	5	9	j	int
    //   130	3	10	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   46	50	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   63	67	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   74	81	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   94	101	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   105	112	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   125	130	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   137	142	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   142	146	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   158	162	187	android/database/sqlite/SQLiteDatabaseCorruptException
    //   189	192	211	finally
    //   194	199	211	finally
    //   203	208	211	finally
    //   208	211	211	finally
    //   230	233	211	finally
    //   235	240	211	finally
    //   246	251	211	finally
    //   251	254	211	finally
    //   46	50	228	finally
    //   63	67	228	finally
    //   74	81	228	finally
    //   94	101	228	finally
    //   105	112	228	finally
    //   125	130	228	finally
    //   137	142	228	finally
    //   142	146	228	finally
    //   158	162	228	finally
    //   137	142	254	java/lang/IllegalArgumentException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */