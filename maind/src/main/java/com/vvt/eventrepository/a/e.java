package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.ag.b;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxAudioAmbientEvent;
import com.vvt.events.FxMediaType;
import com.vvt.events.f;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class e
  extends o
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private SQLiteDatabase c;
  
  public e(SQLiteDatabase paramSQLiteDatabase)
  {
    this.c = paramSQLiteDatabase;
  }
  
  private long a(FxAudioAmbientEvent paramFxAudioAmbientEvent)
  {
    ContentValues localContentValues = new android/content/ContentValues;
    localContentValues.<init>();
    Object localObject1 = Integer.valueOf(0);
    localContentValues.put("has_thumbnail", (Integer)localObject1);
    localObject1 = Integer.valueOf(0);
    localContentValues.put("thumbnail_delivered", (Integer)localObject1);
    localObject1 = Long.valueOf(paramFxAudioAmbientEvent.getEventTime());
    localContentValues.put("time", (Long)localObject1);
    localObject1 = paramFxAudioAmbientEvent.getFilePath();
    localContentValues.put("full_path", (String)localObject1);
    int i = FxEventType.AUDIO_AMBIENT.getNumber();
    localObject1 = Integer.valueOf(i);
    localContentValues.put("media_event_type", (Integer)localObject1);
    Object localObject2 = "media_duration";
    long l = paramFxAudioAmbientEvent.getDuration();
    localObject1 = Long.valueOf(l);
    localContentValues.put((String)localObject2, (Long)localObject1);
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
    //   2: ldc 113
    //   4: astore_3
    //   5: iconst_1
    //   6: istore 4
    //   8: iload 4
    //   10: anewarray 115	java/lang/String
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
    //   27: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 6
    //   32: ldc 86
    //   34: astore 7
    //   36: iconst_1
    //   37: istore 8
    //   39: iload 8
    //   41: anewarray 115	java/lang/String
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
    //   71: invokevirtual 119	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 7
    //   76: aload 7
    //   78: ifnull +84 -> 162
    //   81: aload 7
    //   83: invokeinterface 124 1 0
    //   88: istore 4
    //   90: iload 4
    //   92: ifle +70 -> 162
    //   95: iload_2
    //   96: istore 4
    //   98: aload 7
    //   100: ifnull +10 -> 110
    //   103: aload 7
    //   105: invokeinterface 127 1 0
    //   110: iload 4
    //   112: ireturn
    //   113: astore 6
    //   115: aconst_null
    //   116: astore 7
    //   118: new 104	com/vvt/exceptions/database/FxDbOperationException
    //   121: astore 9
    //   123: aload 6
    //   125: invokevirtual 107	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   128: astore_3
    //   129: aload 9
    //   131: aload_3
    //   132: aload 6
    //   134: invokespecial 110	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: aload 9
    //   139: athrow
    //   140: astore 6
    //   142: aload 7
    //   144: ifnull +10 -> 154
    //   147: aload 7
    //   149: invokeinterface 127 1 0
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
    //   0	171	0	this	e
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
    //   0: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: aload_1
    //   9: checkcast 46	com/vvt/events/FxAudioAmbientEvent
    //   12: astore_1
    //   13: iconst_m1
    //   14: i2l
    //   15: lstore_3
    //   16: aload_1
    //   17: invokevirtual 64	com/vvt/events/FxAudioAmbientEvent:getFilePath	()Ljava/lang/String;
    //   20: astore 5
    //   22: aload_0
    //   23: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   26: astore 6
    //   28: aload 6
    //   30: invokevirtual 130	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   33: aload_0
    //   34: aload 5
    //   36: invokespecial 133	com/vvt/eventrepository/a/e:a	(Ljava/lang/String;)Z
    //   39: istore 7
    //   41: iload 7
    //   43: ifne +112 -> 155
    //   46: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   49: istore_2
    //   50: iload_2
    //   51: ifeq +3 -> 54
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 136	com/vvt/eventrepository/a/e:a	(Lcom/vvt/events/FxAudioAmbientEvent;)J
    //   59: lstore_3
    //   60: lconst_0
    //   61: lstore 8
    //   63: lload_3
    //   64: lload 8
    //   66: lcmp
    //   67: istore 7
    //   69: iload 7
    //   71: ifle +40 -> 111
    //   74: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   77: istore 7
    //   79: iload 7
    //   81: ifeq +3 -> 84
    //   84: aload_0
    //   85: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   88: astore 5
    //   90: getstatic 75	com/vvt/base/FxEventType:AUDIO_AMBIENT	Lcom/vvt/base/FxEventType;
    //   93: astore 6
    //   95: getstatic 142	com/vvt/events/FxEventDirection:UNKNOWN	Lcom/vvt/events/FxEventDirection;
    //   98: astore 10
    //   100: aload 5
    //   102: lload_3
    //   103: aload 6
    //   105: aload 10
    //   107: invokestatic 147	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;JLcom/vvt/base/FxEventType;Lcom/vvt/events/FxEventDirection;)J
    //   110: pop2
    //   111: aload_0
    //   112: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   115: astore 5
    //   117: aload 5
    //   119: invokevirtual 150	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   122: aload_0
    //   123: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   126: astore 5
    //   128: aload 5
    //   130: invokevirtual 153	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   133: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   136: istore 7
    //   138: iload 7
    //   140: ifeq +3 -> 143
    //   143: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   146: istore 7
    //   148: iload 7
    //   150: ifeq +3 -> 153
    //   153: lload_3
    //   154: lreturn
    //   155: getstatic 19	com/vvt/eventrepository/a/e:removeFromPath	Z
    //   158: istore 7
    //   160: iload 7
    //   162: ifeq -40 -> 122
    //   165: goto -43 -> 122
    //   168: astore 11
    //   170: new 94	com/vvt/exceptions/database/FxDbCorruptException
    //   173: astore 12
    //   175: aload 11
    //   177: invokevirtual 99	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   180: astore 11
    //   182: aload 12
    //   184: aload 11
    //   186: invokespecial 102	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   189: aload 12
    //   191: athrow
    //   192: astore 11
    //   194: aload_0
    //   195: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   198: invokevirtual 153	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   201: aload 11
    //   203: athrow
    //   204: astore 11
    //   206: new 104	com/vvt/exceptions/database/FxDbOperationException
    //   209: astore 12
    //   211: aload 11
    //   213: invokevirtual 107	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   216: astore 5
    //   218: aload 12
    //   220: aload 5
    //   222: aload 11
    //   224: invokespecial 110	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   227: aload 12
    //   229: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	this	e
    //   0	230	1	paramFxEvent	com.vvt.base.FxEvent
    //   3	48	2	bool1	boolean
    //   15	139	3	l1	long
    //   20	201	5	localObject1	Object
    //   26	78	6	localObject2	Object
    //   39	122	7	bool2	boolean
    //   61	4	8	l2	long
    //   98	8	10	localFxEventDirection	com.vvt.events.FxEventDirection
    //   168	8	11	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   180	5	11	str	String
    //   192	10	11	localObject3	Object
    //   204	19	11	localThrowable	Throwable
    //   173	55	12	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   16	20	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   22	26	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   28	33	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   34	39	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   46	49	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   55	59	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   74	77	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   84	88	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   90	93	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   95	98	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   105	111	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   111	115	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   117	122	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   155	158	168	android/database/sqlite/SQLiteDatabaseCorruptException
    //   170	173	192	finally
    //   175	180	192	finally
    //   184	189	192	finally
    //   189	192	192	finally
    //   206	209	192	finally
    //   211	216	192	finally
    //   222	227	192	finally
    //   227	230	192	finally
    //   16	20	204	finally
    //   22	26	204	finally
    //   28	33	204	finally
    //   34	39	204	finally
    //   46	49	204	finally
    //   55	59	204	finally
    //   74	77	204	finally
    //   84	88	204	finally
    //   90	93	204	finally
    //   95	98	204	finally
    //   105	111	204	finally
    //   111	115	204	finally
    //   117	122	204	finally
    //   155	158	204	finally
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = n.a(paramQueryOrder);
    Object localObject4 = Integer.toString(paramInt);
    int i = FxEventType.AUDIO_AMBIENT.getNumber();
    String str2 = Integer.toString(i);
    Object localObject5 = new java/lang/StringBuilder;
    ((StringBuilder)localObject5).<init>();
    localObject5 = ((StringBuilder)localObject5).append("SELECT media._id, time, media.full_path as actual_path, media_event_type, thumbnail_delivered, has_thumbnail, thumbnail.full_path as thumbnail_path, actual_size, actual_duration, media_duration FROM media LEFT JOIN thumbnail ON media._id =  thumbnail.media_id WHERE media.thumbnail_delivered = 0 AND media.media_event_type = ? ");
    Object localObject6 = " ORDER BY media.";
    localObject2 = (String)localObject6 + (String)localObject2 + " LIMIT " + (String)localObject4;
    localObject4 = null;
    localObject5 = new java/util/ArrayList;
    ((ArrayList)localObject5).<init>();
    Long localLong2;
    for (;;)
    {
      try
      {
        localObject6 = this.c;
        int j = 1;
        String[] arrayOfString = new String[j];
        arrayOfString[0] = str2;
        localObject4 = ((SQLiteDatabase)localObject6).rawQuery((String)localObject2, arrayOfString);
        if (localObject4 == null) {
          break;
        }
      }
      catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
      {
        try
        {
          long l2;
          String str3;
          int k;
          long l3;
          Object localObject7;
          boolean bool2;
          boolean bool3;
          Object localObject8;
          long l4;
          localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
          String str1 = localSQLiteDatabaseCorruptException.getMessage();
          ((FxDbCorruptException)localObject1).<init>(str1);
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
        ((List)localObject5).add(localLong1);
        continue;
      }
      finally
      {
        localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
        str2 = localThrowable.getMessage();
        ((FxDbOperationException)localObject1).<init>(str2, localThrowable);
      }
      bool1 = ((Cursor)localObject4).moveToNext();
      if (!bool1) {
        break;
      }
      localObject2 = new com/vvt/events/FxAudioAmbientEvent;
      ((FxAudioAmbientEvent)localObject2).<init>();
      str2 = "_id";
      i = ((Cursor)localObject4).getColumnIndex(str2);
      long l1 = ((Cursor)localObject4).getLong(i);
      str2 = "time";
      i = ((Cursor)localObject4).getColumnIndex(str2);
      l2 = ((Cursor)localObject4).getLong(i);
      str2 = "actual_path";
      i = ((Cursor)localObject4).getColumnIndex(str2);
      str2 = ((Cursor)localObject4).getString(i);
      str3 = "media_duration";
      k = ((Cursor)localObject4).getColumnIndex(str3);
      l3 = ((Cursor)localObject4).getLong(k);
      localObject7 = FxMediaType.UNKNOWN;
      localObject7 = "";
      bool2 = b.a(str2);
      if (!bool2)
      {
        localObject7 = new java/io/File;
        ((File)localObject7).<init>(str2);
        bool3 = ((File)localObject7).exists();
        if (bool3)
        {
          localObject7 = ((File)localObject7).getName();
          localObject8 = d.a(str2);
          localObject8 = f.a((String)localObject8);
          ((FxAudioAmbientEvent)localObject2).setFileName((String)localObject7);
          ((FxAudioAmbientEvent)localObject2).setFilePath(str2);
          l4 = 0L;
          ((FxAudioAmbientEvent)localObject2).setParingId(l4);
          ((FxAudioAmbientEvent)localObject2).setEventId(l1);
          ((FxAudioAmbientEvent)localObject2).setEventTime(l2);
          ((FxAudioAmbientEvent)localObject2).setFormat((FxMediaType)localObject8);
          ((FxAudioAmbientEvent)localObject2).setParingId(l1);
          ((FxAudioAmbientEvent)localObject2).setDuration(l3);
          ((List)localObject1).add(localObject2);
          continue;
        }
      }
      bool1 = b;
      if (bool1) {}
      localLong2 = Long.valueOf(l1);
      ((List)localObject5).add(localLong2);
    }
    if (localObject4 != null) {
      ((Cursor)localObject4).close();
    }
    localObject4 = ((List)localObject5).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localLong2 = (Long)((Iterator)localObject4).next();
      long l5 = localLong2.longValue();
      try
      {
        b(l5);
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
    //   2: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   14: astore_3
    //   15: ldc 86
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_3
    //   23: aload 4
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: invokestatic 284	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   31: astore_1
    //   32: aload_1
    //   33: ifnull +58 -> 91
    //   36: aload_1
    //   37: invokeinterface 287 1 0
    //   42: istore_2
    //   43: iload_2
    //   44: ifeq +47 -> 91
    //   47: ldc 60
    //   49: astore_3
    //   50: aload_1
    //   51: aload_3
    //   52: invokeinterface 193 2 0
    //   57: istore_2
    //   58: aload_1
    //   59: iload_2
    //   60: invokeinterface 202 2 0
    //   65: astore_3
    //   66: aload_3
    //   67: ifnull +24 -> 91
    //   70: ldc -47
    //   72: astore 4
    //   74: aload_3
    //   75: aload 4
    //   77: invokevirtual 290	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   80: istore 6
    //   82: iload 6
    //   84: ifne +7 -> 91
    //   87: aload_3
    //   88: invokestatic 292	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   91: aload_0
    //   92: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   95: astore_3
    //   96: ldc 86
    //   98: astore 4
    //   100: aconst_null
    //   101: astore 5
    //   103: aload_3
    //   104: aload 4
    //   106: aconst_null
    //   107: aconst_null
    //   108: invokevirtual 296	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   111: pop
    //   112: aload_1
    //   113: ifnull +9 -> 122
    //   116: aload_1
    //   117: invokeinterface 127 1 0
    //   122: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   125: istore_2
    //   126: iload_2
    //   127: ifeq +3 -> 130
    //   130: return
    //   131: astore_3
    //   132: new 94	com/vvt/exceptions/database/FxDbCorruptException
    //   135: astore 4
    //   137: aload_3
    //   138: invokevirtual 99	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   141: astore_3
    //   142: aload 4
    //   144: aload_3
    //   145: invokespecial 102	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   148: aload 4
    //   150: athrow
    //   151: astore_3
    //   152: aload_1
    //   153: ifnull +9 -> 162
    //   156: aload_1
    //   157: invokeinterface 127 1 0
    //   162: aload_3
    //   163: athrow
    //   164: astore_3
    //   165: new 104	com/vvt/exceptions/database/FxDbOperationException
    //   168: astore 4
    //   170: aload_3
    //   171: invokevirtual 107	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   174: astore 5
    //   176: aload 4
    //   178: aload 5
    //   180: aload_3
    //   181: invokespecial 110	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   184: aload 4
    //   186: athrow
    //   187: astore_3
    //   188: goto -97 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	191	0	this	e
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
    //   5: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: new 165	java/lang/StringBuilder
    //   18: astore 6
    //   20: aload 6
    //   22: invokespecial 166	java/lang/StringBuilder:<init>	()V
    //   25: ldc_w 300
    //   28: astore 7
    //   30: aload 6
    //   32: aload 7
    //   34: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: lload_1
    //   38: invokevirtual 303	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   41: invokevirtual 178	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: astore 6
    //   46: aload_0
    //   47: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   50: astore 7
    //   52: ldc 86
    //   54: astore 8
    //   56: aload 7
    //   58: aload 8
    //   60: aload 6
    //   62: aconst_null
    //   63: aconst_null
    //   64: invokestatic 284	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   67: astore 4
    //   69: aload 4
    //   71: ifnull +71 -> 142
    //   74: aload 4
    //   76: invokeinterface 287 1 0
    //   81: istore 9
    //   83: iload 9
    //   85: ifeq +57 -> 142
    //   88: ldc 60
    //   90: astore 7
    //   92: aload 4
    //   94: aload 7
    //   96: invokeinterface 193 2 0
    //   101: istore 9
    //   103: aload 4
    //   105: iload 9
    //   107: invokeinterface 202 2 0
    //   112: astore 7
    //   114: aload 7
    //   116: ifnull +26 -> 142
    //   119: ldc -47
    //   121: astore 8
    //   123: aload 7
    //   125: aload 8
    //   127: invokevirtual 290	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   130: istore 10
    //   132: iload 10
    //   134: ifne +8 -> 142
    //   137: aload 7
    //   139: invokestatic 292	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   142: aload_0
    //   143: getfield 25	com/vvt/eventrepository/a/e:MyUncaughtExceptionHandler	Landroid/database/sqlite/SQLiteDatabase;
    //   146: astore 7
    //   148: ldc 86
    //   150: astore 8
    //   152: aload 7
    //   154: aload 8
    //   156: aload 6
    //   158: aconst_null
    //   159: invokevirtual 296	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   162: istore 5
    //   164: aload 4
    //   166: ifnull +10 -> 176
    //   169: aload 4
    //   171: invokeinterface 127 1 0
    //   176: getstatic 14	com/vvt/eventrepository/a/e:a	Z
    //   179: istore_3
    //   180: iload_3
    //   181: ifeq +3 -> 184
    //   184: iload 5
    //   186: ireturn
    //   187: astore 6
    //   189: new 94	com/vvt/exceptions/database/FxDbCorruptException
    //   192: astore 7
    //   194: aload 6
    //   196: invokevirtual 99	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   199: astore 6
    //   201: aload 7
    //   203: aload 6
    //   205: invokespecial 102	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   208: aload 7
    //   210: athrow
    //   211: astore 6
    //   213: aload 4
    //   215: ifnull +10 -> 225
    //   218: aload 4
    //   220: invokeinterface 127 1 0
    //   225: aload 6
    //   227: athrow
    //   228: astore 6
    //   230: new 104	com/vvt/exceptions/database/FxDbOperationException
    //   233: astore 7
    //   235: aload 6
    //   237: invokevirtual 107	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   240: astore 8
    //   242: aload 7
    //   244: aload 8
    //   246: aload 6
    //   248: invokespecial 110	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   251: aload 7
    //   253: athrow
    //   254: astore 7
    //   256: goto -114 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	this	e
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */