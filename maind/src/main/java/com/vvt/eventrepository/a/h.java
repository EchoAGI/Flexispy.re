package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.ag.b;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxAudioFileThumnailEvent;
import com.vvt.events.FxMediaType;
import com.vvt.events.f;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.util.ArrayList;
import java.util.List;

public class h
  extends o
{
  private static final boolean a = a.a;
  private static final boolean b = a.d;
  private SQLiteDatabase c;
  
  public h(SQLiteDatabase paramSQLiteDatabase)
  {
    this.c = paramSQLiteDatabase;
  }
  
  private long a(long paramLong, FxAudioFileThumnailEvent paramFxAudioFileThumnailEvent)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    long l = paramFxAudioFileThumnailEvent.getActualFileSize();
    Object localObject1 = Long.valueOf(l);
    localContentValues.put("actual_size", (Long)localObject1);
    localObject1 = Long.valueOf(paramLong);
    localContentValues.put("media_id", (Long)localObject1);
    Object localObject2 = "actual_duration";
    int i = paramFxAudioFileThumnailEvent.getActualDuration();
    localObject1 = Integer.valueOf(i);
    localContentValues.put((String)localObject2, (Integer)localObject1);
    try
    {
      localObject2 = this.c;
      localObject1 = "thumbnail";
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
  
  private long a(FxAudioFileThumnailEvent paramFxAudioFileThumnailEvent)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Integer.valueOf(0);
    localContentValues.put("has_thumbnail", (Integer)localObject1);
    localObject1 = Integer.valueOf(0);
    localContentValues.put("thumbnail_delivered", (Integer)localObject1);
    long l = paramFxAudioFileThumnailEvent.getEventTime();
    localObject1 = Long.valueOf(l);
    localContentValues.put("time", (Long)localObject1);
    localObject1 = paramFxAudioFileThumnailEvent.getActualFullPath();
    localContentValues.put("full_path", (String)localObject1);
    Object localObject2 = "media_event_type";
    int i = FxEventType.AUDIO_FILE.getNumber();
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
  
  /* Error */
  private boolean a(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc 122
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
    //   27: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 6
    //   32: ldc 119
    //   34: astore 7
    //   36: iconst_1
    //   37: istore 8
    //   39: iload 8
    //   41: anewarray 124	java/lang/String
    //   44: astore 9
    //   46: ldc 100
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
    //   71: invokevirtual 128	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 7
    //   76: aload 7
    //   78: ifnull +84 -> 162
    //   81: aload 7
    //   83: invokeinterface 133 1 0
    //   88: istore 4
    //   90: iload 4
    //   92: ifle +70 -> 162
    //   95: iload_2
    //   96: istore 4
    //   98: aload 7
    //   100: ifnull +10 -> 110
    //   103: aload 7
    //   105: invokeinterface 136 1 0
    //   110: iload 4
    //   112: ireturn
    //   113: astore 6
    //   115: aconst_null
    //   116: astore 7
    //   118: new 83	com/vvt/exceptions/database/FxDbOperationException
    //   121: astore 9
    //   123: aload 6
    //   125: invokevirtual 86	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   128: astore_3
    //   129: aload 9
    //   131: aload_3
    //   132: aload 6
    //   134: invokespecial 89	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: aload 9
    //   139: athrow
    //   140: astore 6
    //   142: aload 7
    //   144: ifnull +10 -> 154
    //   147: aload 7
    //   149: invokeinterface 136 1 0
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
    //   0	171	0	this	AppEngine1
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
    //   0: aload_1
    //   1: checkcast 32	com/vvt/events/FxAudioFileThumnailEvent
    //   4: astore_1
    //   5: iconst_m1
    //   6: i2l
    //   7: lstore_2
    //   8: aload_1
    //   9: invokevirtual 103	com/vvt/events/FxAudioFileThumnailEvent:getActualFullPath	()Ljava/lang/String;
    //   12: astore 4
    //   14: aload_0
    //   15: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 5
    //   20: aload 5
    //   22: invokevirtual 139	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   25: aload_0
    //   26: aload 4
    //   28: invokespecial 142	com/vvt/eventrepository/a/AppEngine1:a	(Ljava/lang/String;)Z
    //   31: istore 6
    //   33: iload 6
    //   35: ifne +77 -> 112
    //   38: aload_0
    //   39: aload_1
    //   40: invokespecial 145	com/vvt/eventrepository/a/AppEngine1:a	(Lcom/vvt/events/FxAudioFileThumnailEvent;)J
    //   43: lstore_2
    //   44: aload_0
    //   45: lload_2
    //   46: aload_1
    //   47: invokespecial 148	com/vvt/eventrepository/a/AppEngine1:a	(JLcom/vvt/events/FxAudioFileThumnailEvent;)J
    //   50: pop2
    //   51: lconst_0
    //   52: lstore 7
    //   54: lload_2
    //   55: lload 7
    //   57: lcmp
    //   58: istore 6
    //   60: iload 6
    //   62: ifle +30 -> 92
    //   65: aload_0
    //   66: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   69: astore 4
    //   71: getstatic 114	com/vvt/base/FxEventType:AUDIO_FILE	Lcom/vvt/base/FxEventType;
    //   74: astore 5
    //   76: getstatic 154	com/vvt/events/FxEventDirection:UNKNOWN	Lcom/vvt/events/FxEventDirection;
    //   79: astore 9
    //   81: aload 4
    //   83: lload_2
    //   84: aload 5
    //   86: aload 9
    //   88: invokestatic 159	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;JLcom/vvt/base/FxEventType;Lcom/vvt/events/FxEventDirection;)J
    //   91: pop2
    //   92: aload_0
    //   93: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   96: astore 4
    //   98: aload 4
    //   100: invokevirtual 162	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   103: aload_0
    //   104: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   107: invokevirtual 165	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   110: lload_2
    //   111: lreturn
    //   112: getstatic 19	com/vvt/eventrepository/a/AppEngine1:removeFromPath	Z
    //   115: istore 6
    //   117: iload 6
    //   119: ifeq -16 -> 103
    //   122: goto -19 -> 103
    //   125: astore 10
    //   127: new 72	com/vvt/exceptions/database/FxDbCorruptException
    //   130: astore 11
    //   132: aload 10
    //   134: invokevirtual 78	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   137: astore 10
    //   139: aload 11
    //   141: aload 10
    //   143: invokespecial 81	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   146: aload 11
    //   148: athrow
    //   149: astore 10
    //   151: aload_0
    //   152: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   155: invokevirtual 165	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   158: aload 10
    //   160: athrow
    //   161: astore 10
    //   163: new 83	com/vvt/exceptions/database/FxDbOperationException
    //   166: astore 11
    //   168: aload 10
    //   170: invokevirtual 86	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   173: astore 4
    //   175: aload 11
    //   177: aload 4
    //   179: aload 10
    //   181: invokespecial 89	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   184: aload 11
    //   186: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	AppEngine1
    //   0	187	1	paramFxEvent	com.vvt.base.FxEvent
    //   7	104	2	l1	long
    //   12	166	4	localObject1	Object
    //   18	67	5	localObject2	Object
    //   31	87	6	bool	boolean
    //   52	4	7	l2	long
    //   79	8	9	localFxEventDirection	com.vvt.events.FxEventDirection
    //   125	8	10	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   137	5	10	str	String
    //   149	10	10	localObject3	Object
    //   161	19	10	localThrowable	Throwable
    //   130	55	11	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   8	12	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   14	18	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   20	25	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   26	31	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   39	43	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   46	51	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   65	69	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   71	74	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   76	79	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   86	92	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   92	96	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   98	103	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   112	115	125	android/database/sqlite/SQLiteDatabaseCorruptException
    //   127	130	149	finally
    //   132	137	149	finally
    //   141	146	149	finally
    //   146	149	149	finally
    //   163	166	149	finally
    //   168	173	149	finally
    //   179	184	149	finally
    //   184	187	149	finally
    //   8	12	161	finally
    //   14	18	161	finally
    //   20	25	161	finally
    //   26	31	161	finally
    //   39	43	161	finally
    //   46	51	161	finally
    //   65	69	161	finally
    //   71	74	161	finally
    //   76	79	161	finally
    //   86	92	161	finally
    //   92	96	161	finally
    //   98	103	161	finally
    //   112	115	161	finally
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = n.a(paramQueryOrder);
    Object localObject4 = Integer.toString(paramInt);
    int i = FxEventType.AUDIO_FILE.getNumber();
    Object localObject5 = Integer.toString(i);
    Object localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    localObject6 = ((StringBuilder)localObject6).append("SELECT media._id, time, media.full_path as actual_path, media_event_type, thumbnail_delivered, has_thumbnail, thumbnail.full_path as thumbnail_path, actual_size, actual_duration  FROM media LEFT JOIN thumbnail ON media._id =  thumbnail.media_id WHERE media.thumbnail_delivered = 0 AND media.media_event_type = ? ");
    Object localObject7 = " ORDER BY media.";
    localObject2 = ((StringBuilder)localObject6).append((String)localObject7).append((String)localObject2);
    localObject6 = " LIMIT ";
    localObject2 = (String)localObject6 + (String)localObject4;
    localObject4 = null;
    try
    {
      localObject6 = this.c;
      int j = 1;
      localObject7 = new String[j];
      localObject7[0] = localObject5;
      localObject4 = ((SQLiteDatabase)localObject6).rawQuery((String)localObject2, (String[])localObject7);
      if (localObject4 != null) {
        for (;;)
        {
          boolean bool1 = ((Cursor)localObject4).moveToNext();
          if (!bool1) {
            break;
          }
          localObject5 = new com/vvt/events/FxAudioFileThumnailEvent;
          ((FxAudioFileThumnailEvent)localObject5).<init>();
          localObject2 = "_id";
          int k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
          long l1 = ((Cursor)localObject4).getLong(k);
          localObject2 = "time";
          k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
          long l2 = ((Cursor)localObject4).getLong(k);
          localObject2 = "actual_path";
          k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
          Object localObject8 = ((Cursor)localObject4).getString(k);
          localObject2 = "actual_size";
          k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
          int m = ((Cursor)localObject4).getInt(k);
          localObject2 = "actual_duration";
          k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
          int n = ((Cursor)localObject4).getInt(k);
          localObject2 = FxMediaType.UNKNOWN;
          boolean bool3 = b.a((String)localObject8);
          if (!bool3)
          {
            localObject2 = d.a((String)localObject8);
            localObject2 = f.a((String)localObject2);
          }
          ((FxAudioFileThumnailEvent)localObject5).setActualFullPath((String)localObject8);
          ((FxAudioFileThumnailEvent)localObject5).setActualDuration(n);
          long l3 = m;
          ((FxAudioFileThumnailEvent)localObject5).setActualFileSize(l3);
          localObject8 = null;
          localObject8 = new byte[0];
          ((FxAudioFileThumnailEvent)localObject5).setAudioData((byte[])localObject8);
          ((FxAudioFileThumnailEvent)localObject5).setEventId(l1);
          ((FxAudioFileThumnailEvent)localObject5).setEventTime(l2);
          ((FxAudioFileThumnailEvent)localObject5).setFormat((FxMediaType)localObject2);
          ((FxAudioFileThumnailEvent)localObject5).setParingId(l1);
          ((List)localObject1).add(localObject5);
        }
      }
      String str;
      if (localObject4 == null) {
        break label473;
      }
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
        str = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
      finally
      {
        if (localObject4 != null) {
          ((Cursor)localObject4).close();
        }
      }
    }
    finally
    {
      localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject5 = localThrowable.getMessage();
      ((FxDbOperationException)localObject1).<init>((String)localObject5, localThrowable);
    }
    ((Cursor)localObject4).close();
    label473:
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
    //   2: aload_0
    //   3: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore_2
    //   7: ldc 64
    //   9: astore_3
    //   10: aconst_null
    //   11: astore 4
    //   13: aload_2
    //   14: aload_3
    //   15: aconst_null
    //   16: aconst_null
    //   17: aconst_null
    //   18: invokestatic 273	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +61 -> 84
    //   26: aload_1
    //   27: invokeinterface 276 1 0
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +48 -> 84
    //   39: ldc 100
    //   41: astore_2
    //   42: aload_1
    //   43: aload_2
    //   44: invokeinterface 205 2 0
    //   49: istore 5
    //   51: aload_1
    //   52: iload 5
    //   54: invokeinterface 214 2 0
    //   59: astore_2
    //   60: aload_2
    //   61: ifnull +23 -> 84
    //   64: ldc_w 278
    //   67: astore_3
    //   68: aload_2
    //   69: aload_3
    //   70: invokevirtual 281	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   73: istore 6
    //   75: iload 6
    //   77: ifne +7 -> 84
    //   80: aload_2
    //   81: invokestatic 283	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   84: aload_0
    //   85: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   88: astore_2
    //   89: ldc 64
    //   91: astore_3
    //   92: aconst_null
    //   93: astore 4
    //   95: aload_2
    //   96: aload_3
    //   97: aconst_null
    //   98: aconst_null
    //   99: invokevirtual 287	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   102: pop
    //   103: aload_1
    //   104: ifnull +9 -> 113
    //   107: aload_1
    //   108: invokeinterface 136 1 0
    //   113: return
    //   114: astore_2
    //   115: new 72	com/vvt/exceptions/database/FxDbCorruptException
    //   118: astore_3
    //   119: aload_2
    //   120: invokevirtual 78	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   123: astore_2
    //   124: aload_3
    //   125: aload_2
    //   126: invokespecial 81	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   129: aload_3
    //   130: athrow
    //   131: astore_2
    //   132: aload_1
    //   133: ifnull +9 -> 142
    //   136: aload_1
    //   137: invokeinterface 136 1 0
    //   142: aload_2
    //   143: athrow
    //   144: astore_2
    //   145: new 83	com/vvt/exceptions/database/FxDbOperationException
    //   148: astore_3
    //   149: aload_2
    //   150: invokevirtual 86	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   153: astore 4
    //   155: aload_3
    //   156: aload 4
    //   158: aload_2
    //   159: invokespecial 89	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   162: aload_3
    //   163: athrow
    //   164: astore_2
    //   165: goto -81 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	this	AppEngine1
    //   1	136	1	localCursor	Cursor
    //   6	90	2	localObject1	Object
    //   114	6	2	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   123	3	2	str1	String
    //   131	12	2	localObject2	Object
    //   144	15	2	localThrowable	Throwable
    //   164	1	2	localIllegalArgumentException	IllegalArgumentException
    //   9	154	3	localObject3	Object
    //   11	146	4	str2	String
    //   32	3	5	bool1	boolean
    //   49	4	5	i	int
    //   73	3	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   17	21	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   26	32	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   43	49	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   52	59	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   69	73	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   80	84	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   84	88	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   98	103	114	android/database/sqlite/SQLiteDatabaseCorruptException
    //   115	118	131	finally
    //   119	123	131	finally
    //   125	129	131	finally
    //   129	131	131	finally
    //   145	148	131	finally
    //   149	153	131	finally
    //   158	162	131	finally
    //   162	164	131	finally
    //   2	6	144	finally
    //   17	21	144	finally
    //   26	32	144	finally
    //   43	49	144	finally
    //   52	59	144	finally
    //   69	73	144	finally
    //   80	84	144	finally
    //   84	88	144	finally
    //   98	103	144	finally
    //   80	84	164	java/lang/IllegalArgumentException
  }
  
  /* Error */
  public int b(long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 177	java/lang/StringBuilder
    //   5: astore 4
    //   7: aload 4
    //   9: invokespecial 178	java/lang/StringBuilder:<init>	()V
    //   12: ldc_w 291
    //   15: astore 5
    //   17: aload 4
    //   19: aload 5
    //   21: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: lload_1
    //   25: invokevirtual 294	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   28: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: astore 4
    //   33: aload_0
    //   34: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   37: astore 5
    //   39: ldc 64
    //   41: astore 6
    //   43: aload 5
    //   45: aload 6
    //   47: aload 4
    //   49: aconst_null
    //   50: aconst_null
    //   51: invokestatic 273	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   54: astore_3
    //   55: aload_3
    //   56: ifnull +69 -> 125
    //   59: aload_3
    //   60: invokeinterface 276 1 0
    //   65: istore 7
    //   67: iload 7
    //   69: ifeq +56 -> 125
    //   72: ldc 100
    //   74: astore 5
    //   76: aload_3
    //   77: aload 5
    //   79: invokeinterface 205 2 0
    //   84: istore 7
    //   86: aload_3
    //   87: iload 7
    //   89: invokeinterface 214 2 0
    //   94: astore 5
    //   96: aload 5
    //   98: ifnull +27 -> 125
    //   101: ldc_w 278
    //   104: astore 6
    //   106: aload 5
    //   108: aload 6
    //   110: invokevirtual 281	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   113: istore 8
    //   115: iload 8
    //   117: ifne +8 -> 125
    //   120: aload 5
    //   122: invokestatic 283	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   125: aload_0
    //   126: getfield 25	com/vvt/eventrepository/a/AppEngine1:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   129: astore 5
    //   131: ldc 64
    //   133: astore 6
    //   135: aload 5
    //   137: aload 6
    //   139: aload 4
    //   141: aconst_null
    //   142: invokevirtual 287	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   145: istore 9
    //   147: aload_3
    //   148: ifnull +9 -> 157
    //   151: aload_3
    //   152: invokeinterface 136 1 0
    //   157: iload 9
    //   159: ireturn
    //   160: astore 4
    //   162: new 72	com/vvt/exceptions/database/FxDbCorruptException
    //   165: astore 5
    //   167: aload 4
    //   169: invokevirtual 78	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   172: astore 4
    //   174: aload 5
    //   176: aload 4
    //   178: invokespecial 81	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   181: aload 5
    //   183: athrow
    //   184: astore 4
    //   186: aload_3
    //   187: ifnull +9 -> 196
    //   190: aload_3
    //   191: invokeinterface 136 1 0
    //   196: aload 4
    //   198: athrow
    //   199: astore 4
    //   201: new 83	com/vvt/exceptions/database/FxDbOperationException
    //   204: astore 5
    //   206: aload 4
    //   208: invokevirtual 86	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   211: astore 6
    //   213: aload 5
    //   215: aload 6
    //   217: aload 4
    //   219: invokespecial 89	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   222: aload 5
    //   224: athrow
    //   225: astore 5
    //   227: goto -102 -> 125
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	this	AppEngine1
    //   0	230	1	paramLong	long
    //   1	190	3	localCursor	Cursor
    //   5	135	4	localObject1	Object
    //   160	8	4	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   172	5	4	str1	String
    //   184	13	4	localObject2	Object
    //   199	19	4	localThrowable	Throwable
    //   15	208	5	localObject3	Object
    //   225	1	5	localIllegalArgumentException	IllegalArgumentException
    //   41	175	6	str2	String
    //   65	3	7	bool1	boolean
    //   84	4	7	i	int
    //   113	3	8	bool2	boolean
    //   145	13	9	j	int
    // Exception table:
    //   from	to	target	type
    //   33	37	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   50	54	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   59	65	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   77	84	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   87	94	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   108	113	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   120	125	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   125	129	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   141	145	160	android/database/sqlite/SQLiteDatabaseCorruptException
    //   162	165	184	finally
    //   167	172	184	finally
    //   176	181	184	finally
    //   181	184	184	finally
    //   201	204	184	finally
    //   206	211	184	finally
    //   217	222	184	finally
    //   222	225	184	finally
    //   33	37	199	finally
    //   50	54	199	finally
    //   59	65	199	finally
    //   77	84	199	finally
    //   87	94	199	finally
    //   108	113	199	finally
    //   120	125	199	finally
    //   125	129	199	finally
    //   141	145	199	finally
    //   120	125	225	java/lang/IllegalArgumentException
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */