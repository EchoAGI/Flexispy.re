package com.vvt.eventrepository.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.ag.b;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxCameraImageThumbnailEvent;
import com.vvt.events.FxMediaType;
import com.vvt.events.c;
import com.vvt.events.f;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import java.util.ArrayList;
import java.util.List;

public class k
  extends o
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private static final boolean c = a.d;
  private SQLiteDatabase d;
  
  public k(SQLiteDatabase paramSQLiteDatabase)
  {
    this.d = paramSQLiteDatabase;
  }
  
  private long a(long paramLong, FxCameraImageThumbnailEvent paramFxCameraImageThumbnailEvent)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = paramFxCameraImageThumbnailEvent.getThumbnailFullPath();
    Object localObject2 = new android/content/ContentValues;
    ((ContentValues)localObject2).<init>();
    ((ContentValues)localObject2).put("full_path", (String)localObject1);
    long l = paramFxCameraImageThumbnailEvent.getActualSize();
    Object localObject3 = Long.valueOf(l);
    ((ContentValues)localObject2).put("actual_size", (Long)localObject3);
    localObject3 = Long.valueOf(paramLong);
    ((ContentValues)localObject2).put("media_id", (Long)localObject3);
    localObject1 = "actual_duration";
    localObject3 = Integer.valueOf(0);
    ((ContentValues)localObject2).put((String)localObject1, (Integer)localObject3);
    bool = a;
    if (bool) {}
    l = -1;
    try
    {
      localObject1 = this.d;
      String str2 = "thumbnail";
      ((SQLiteDatabase)localObject1).insert(str2, null, (ContentValues)localObject2);
      bool = a;
      if (bool) {}
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
  
  private long a(FxCameraImageThumbnailEvent paramFxCameraImageThumbnailEvent)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramFxCameraImageThumbnailEvent.getActualFullPath();
    localObject2 = new android/content/ContentValues;
    ((ContentValues)localObject2).<init>();
    Object localObject3 = Integer.valueOf(0);
    ((ContentValues)localObject2).put("thumbnail_delivered", (Integer)localObject3);
    long l1 = paramFxCameraImageThumbnailEvent.getEventTime();
    localObject3 = Long.valueOf(l1);
    ((ContentValues)localObject2).put("time", (Long)localObject3);
    localObject3 = paramFxCameraImageThumbnailEvent.getActualFullPath();
    ((ContentValues)localObject2).put("full_path", (String)localObject3);
    localObject4 = "media_event_type";
    int i = FxEventType.CAMERA_IMAGE.getNumber();
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
        localObject1 = this.d;
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
  
  /* Error */
  private boolean a(String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: ldc -121
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
    //   27: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   30: astore 6
    //   32: ldc -123
    //   34: astore 7
    //   36: iconst_1
    //   37: istore 8
    //   39: iload 8
    //   41: anewarray 124	java/lang/String
    //   44: astore 9
    //   46: ldc 41
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
    //   71: invokevirtual 139	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 7
    //   76: aload 7
    //   78: ifnull +84 -> 162
    //   81: aload 7
    //   83: invokeinterface 144 1 0
    //   88: istore 4
    //   90: iload 4
    //   92: ifle +70 -> 162
    //   95: iload_2
    //   96: istore 4
    //   98: aload 7
    //   100: ifnull +10 -> 110
    //   103: aload 7
    //   105: invokeinterface 147 1 0
    //   110: iload 4
    //   112: ireturn
    //   113: astore 6
    //   115: aconst_null
    //   116: astore 7
    //   118: new 92	com/vvt/exceptions/database/FxDbOperationException
    //   121: astore 9
    //   123: aload 6
    //   125: invokevirtual 95	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   128: astore_3
    //   129: aload 9
    //   131: aload_3
    //   132: aload 6
    //   134: invokespecial 98	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   137: aload 9
    //   139: athrow
    //   140: astore 6
    //   142: aload 7
    //   144: ifnull +10 -> 154
    //   147: aload 7
    //   149: invokeinterface 147 1 0
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
    //   0	171	0	this	k
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
  
  private void b(long paramLong, FxCameraImageThumbnailEvent paramFxCameraImageThumbnailEvent)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject1 = paramFxCameraImageThumbnailEvent.getGeo();
    Object localObject3 = this.d;
    ((SQLiteDatabase)localObject3).beginTransaction();
    if (localObject1 != null) {}
    try
    {
      localObject3 = new android/content/ContentValues;
      ((ContentValues)localObject3).<init>();
      str2 = "_id";
      Object localObject4 = Long.valueOf(paramLong);
      ((ContentValues)localObject3).put(str2, (Long)localObject4);
      str2 = "altitude";
      float f = ((c)localObject1).c();
      localObject4 = Float.valueOf(f);
      ((ContentValues)localObject3).put(str2, (Float)localObject4);
      str2 = "latitude";
      double d1 = ((c)localObject1).a();
      localObject4 = Double.valueOf(d1);
      ((ContentValues)localObject3).put(str2, (Double)localObject4);
      str2 = "longitude";
      d1 = ((c)localObject1).b();
      localObject1 = Double.valueOf(d1);
      ((ContentValues)localObject3).put(str2, (Double)localObject1);
      localObject1 = this.d;
      str2 = "gps_tag";
      f = 0.0F;
      localObject4 = null;
      ((SQLiteDatabase)localObject1).insert(str2, null, (ContentValues)localObject3);
      localObject1 = this.d;
      ((SQLiteDatabase)localObject1).setTransactionSuccessful();
      localObject1 = this.d;
      ((SQLiteDatabase)localObject1).endTransaction();
      bool = a;
      if (bool) {}
      return;
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
        this.d.endTransaction();
      }
    }
    finally
    {
      localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
      String str2 = localThrowable.getMessage();
      ((FxDbOperationException)localObject3).<init>(str2, localThrowable);
    }
  }
  
  /* Error */
  public long a(com.vvt.base.FxEvent paramFxEvent)
  {
    // Byte code:
    //   0: getstatic 15	com/vvt/eventrepository/a/k:a	Z
    //   3: istore_2
    //   4: iload_2
    //   5: ifeq +3 -> 8
    //   8: aload_1
    //   9: checkcast 32	com/vvt/events/FxCameraImageThumbnailEvent
    //   12: astore_1
    //   13: getstatic 15	com/vvt/eventrepository/a/k:a	Z
    //   16: istore_2
    //   17: iload_2
    //   18: ifeq +3 -> 21
    //   21: iconst_m1
    //   22: i2l
    //   23: lstore_3
    //   24: aload_1
    //   25: invokevirtual 101	com/vvt/events/FxCameraImageThumbnailEvent:getActualFullPath	()Ljava/lang/String;
    //   28: astore 5
    //   30: aload_0
    //   31: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   34: astore 6
    //   36: aload 6
    //   38: invokevirtual 154	android/database/sqlite/SQLiteDatabase:beginTransaction	()V
    //   41: aload_0
    //   42: aload 5
    //   44: invokespecial 199	com/vvt/eventrepository/a/k:a	(Ljava/lang/String;)Z
    //   47: istore 7
    //   49: iload 7
    //   51: ifne +97 -> 148
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 202	com/vvt/eventrepository/a/k:a	(Lcom/vvt/events/FxCameraImageThumbnailEvent;)J
    //   59: lstore_3
    //   60: aload_0
    //   61: lload_3
    //   62: aload_1
    //   63: invokespecial 205	com/vvt/eventrepository/a/k:a	(JLcom/vvt/events/FxCameraImageThumbnailEvent;)J
    //   66: pop2
    //   67: aload_0
    //   68: lload_3
    //   69: aload_1
    //   70: invokespecial 208	com/vvt/eventrepository/a/k:removeFromPath	(JLcom/vvt/events/FxCameraImageThumbnailEvent;)V
    //   73: lconst_0
    //   74: lstore 8
    //   76: lload_3
    //   77: lload 8
    //   79: lcmp
    //   80: istore 7
    //   82: iload 7
    //   84: ifle +30 -> 114
    //   87: aload_0
    //   88: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   91: astore 5
    //   93: getstatic 116	com/vvt/base/FxEventType:CAMERA_IMAGE	Lcom/vvt/base/FxEventType;
    //   96: astore 6
    //   98: getstatic 214	com/vvt/events/FxEventDirection:UNKNOWN	Lcom/vvt/events/FxEventDirection;
    //   101: astore 10
    //   103: aload 5
    //   105: lload_3
    //   106: aload 6
    //   108: aload 10
    //   110: invokestatic 219	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;JLcom/vvt/base/FxEventType;Lcom/vvt/events/FxEventDirection;)J
    //   113: pop2
    //   114: aload_0
    //   115: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   118: astore 5
    //   120: aload 5
    //   122: invokevirtual 193	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
    //   125: aload_0
    //   126: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   129: astore 5
    //   131: aload 5
    //   133: invokevirtual 196	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   136: getstatic 15	com/vvt/eventrepository/a/k:a	Z
    //   139: istore 7
    //   141: iload 7
    //   143: ifeq +3 -> 146
    //   146: lload_3
    //   147: lreturn
    //   148: getstatic 24	com/vvt/eventrepository/a/k:MyUncaughtExceptionHandler	Z
    //   151: istore 7
    //   153: iload 7
    //   155: ifeq -30 -> 125
    //   158: goto -33 -> 125
    //   161: astore 11
    //   163: new 82	com/vvt/exceptions/database/FxDbCorruptException
    //   166: astore 12
    //   168: aload 11
    //   170: invokevirtual 87	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   173: astore 11
    //   175: aload 12
    //   177: aload 11
    //   179: invokespecial 90	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   182: aload 12
    //   184: athrow
    //   185: astore 11
    //   187: aload_0
    //   188: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   191: invokevirtual 196	android/database/sqlite/SQLiteDatabase:endTransaction	()V
    //   194: aload 11
    //   196: athrow
    //   197: astore 11
    //   199: new 92	com/vvt/exceptions/database/FxDbOperationException
    //   202: astore 12
    //   204: aload 11
    //   206: invokevirtual 95	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   209: astore 5
    //   211: aload 12
    //   213: aload 5
    //   215: aload 11
    //   217: invokespecial 98	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   220: aload 12
    //   222: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	this	k
    //   0	223	1	paramFxEvent	com.vvt.base.FxEvent
    //   3	15	2	bool1	boolean
    //   23	124	3	l1	long
    //   28	186	5	localObject1	Object
    //   34	73	6	localObject2	Object
    //   47	107	7	bool2	boolean
    //   74	4	8	l2	long
    //   101	8	10	localFxEventDirection	com.vvt.events.FxEventDirection
    //   161	8	11	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   173	5	11	str	String
    //   185	10	11	localObject3	Object
    //   197	19	11	localThrowable	Throwable
    //   166	55	12	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   24	28	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   30	34	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   36	41	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   42	47	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   55	59	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   62	67	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   69	73	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   87	91	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   93	96	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   98	101	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   108	114	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   114	118	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   120	125	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   148	151	161	android/database/sqlite/SQLiteDatabaseCorruptException
    //   163	166	185	finally
    //   168	173	185	finally
    //   177	182	185	finally
    //   182	185	185	finally
    //   199	202	185	finally
    //   204	209	185	finally
    //   215	220	185	finally
    //   220	223	185	finally
    //   24	28	197	finally
    //   30	34	197	finally
    //   36	41	197	finally
    //   42	47	197	finally
    //   55	59	197	finally
    //   62	67	197	finally
    //   69	73	197	finally
    //   87	91	197	finally
    //   93	96	197	finally
    //   98	101	197	finally
    //   108	114	197	finally
    //   114	118	197	finally
    //   120	125	197	finally
    //   148	151	197	finally
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = n.a(paramQueryOrder);
    Object localObject4 = Integer.toString(paramInt);
    int i = FxEventType.CAMERA_IMAGE.getNumber();
    Object localObject5 = Integer.toString(i);
    Object localObject6 = new java/lang/StringBuilder;
    ((StringBuilder)localObject6).<init>();
    localObject6 = ((StringBuilder)localObject6).append("SELECT media._id, longitude,  latitude,  altitude, cell_id, area_code, network_id, country_code, time, media.full_path as actual_path, media_event_type, thumbnail_delivered, has_thumbnail, thumbnail.full_path as thumbnail_path, actual_size, actual_duration FROM media LEFT JOIN gps_tag ON gps_tag._id = media._id LEFT JOIN thumbnail ON media._id = thumbnail.media_id WHERE media.thumbnail_delivered = 0 AND media.has_thumbnail = 1 AND media.media_event_type = ? ");
    Object localObject7 = "ORDER BY media.";
    localObject2 = ((StringBuilder)localObject6).append((String)localObject7).append((String)localObject2);
    localObject6 = " LIMIT ";
    localObject2 = (String)localObject6 + (String)localObject4;
    localObject4 = null;
    try
    {
      localObject6 = this.d;
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
          localObject5 = new com/vvt/events/FxCameraImageThumbnailEvent;
          ((FxCameraImageThumbnailEvent)localObject5).<init>();
          localObject2 = "_id";
          int k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
          long l1 = ((Cursor)localObject4).getLong(k);
          localObject2 = "time";
          k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
          long l2 = ((Cursor)localObject4).getLong(k);
          localObject2 = "altitude";
          k = ((Cursor)localObject4).getColumnIndex((String)localObject2);
          float f1 = ((Cursor)localObject4).getFloat(k);
          String str2 = "latitude";
          int m = ((Cursor)localObject4).getColumnIndex(str2);
          float f2 = ((Cursor)localObject4).getFloat(m);
          String str3 = "longitude";
          int n = ((Cursor)localObject4).getColumnIndex(str3);
          float f3 = ((Cursor)localObject4).getFloat(n);
          String str4 = "thumbnail_path";
          int i1 = ((Cursor)localObject4).getColumnIndex(str4);
          str4 = ((Cursor)localObject4).getString(i1);
          String str5 = "actual_path";
          int i2 = ((Cursor)localObject4).getColumnIndex(str5);
          str5 = ((Cursor)localObject4).getString(i2);
          String str6 = "actual_size";
          int i3 = ((Cursor)localObject4).getColumnIndex(str6);
          i3 = ((Cursor)localObject4).getInt(i3);
          c localc = new com/vvt/events/c;
          localc.<init>();
          localc.a(f1);
          double d1 = f2;
          localc.a(d1);
          double d2 = f3;
          localc.b(d2);
          localObject2 = FxMediaType.UNKNOWN;
          boolean bool3 = b.a(str5);
          if (!bool3)
          {
            localObject2 = d.a(str5);
            localObject2 = f.a((String)localObject2);
          }
          ((FxCameraImageThumbnailEvent)localObject5).setActualFullPath(str5);
          long l3 = i3;
          ((FxCameraImageThumbnailEvent)localObject5).setActualSize(l3);
          ((FxCameraImageThumbnailEvent)localObject5).setEventId(l1);
          ((FxCameraImageThumbnailEvent)localObject5).setEventTime(l2);
          ((FxCameraImageThumbnailEvent)localObject5).setFormat((FxMediaType)localObject2);
          ((FxCameraImageThumbnailEvent)localObject5).setGeo(localc);
          ((FxCameraImageThumbnailEvent)localObject5).setParingId(l1);
          ((FxCameraImageThumbnailEvent)localObject5).setThumbnailFullPath(str4);
          ((List)localObject1).add(localObject5);
        }
      }
      boolean bool4;
      String str1;
      if (localObject4 == null) {
        break label606;
      }
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        bool4 = b;
        if (bool4) {}
        localObject1 = new com/vvt/exceptions/database/FxDbCorruptException;
        str1 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject1).<init>(str1);
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
      bool4 = b;
      if (bool4) {}
      localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject5 = localThrowable.getMessage();
      ((FxDbOperationException)localObject1).<init>((String)localObject5, localThrowable);
    }
    ((Cursor)localObject4).close();
    label606:
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
    //   3: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   6: astore_2
    //   7: ldc 74
    //   9: astore_3
    //   10: aconst_null
    //   11: astore 4
    //   13: aload_2
    //   14: aload_3
    //   15: aconst_null
    //   16: aconst_null
    //   17: aconst_null
    //   18: invokestatic 338	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   21: astore_1
    //   22: aload_1
    //   23: ifnull +60 -> 83
    //   26: aload_1
    //   27: invokeinterface 341 1 0
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +47 -> 83
    //   39: ldc 41
    //   41: astore_2
    //   42: aload_1
    //   43: aload_2
    //   44: invokeinterface 257 2 0
    //   49: istore 5
    //   51: aload_1
    //   52: iload 5
    //   54: invokeinterface 270 2 0
    //   59: astore_2
    //   60: aload_2
    //   61: ifnull +22 -> 83
    //   64: ldc 122
    //   66: astore_3
    //   67: aload_2
    //   68: aload_3
    //   69: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   72: istore 6
    //   74: iload 6
    //   76: ifne +7 -> 83
    //   79: aload_2
    //   80: invokestatic 343	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   83: aload_0
    //   84: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   87: astore_2
    //   88: ldc 74
    //   90: astore_3
    //   91: aconst_null
    //   92: astore 4
    //   94: aload_2
    //   95: aload_3
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokevirtual 347	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   101: pop
    //   102: aload_1
    //   103: ifnull +9 -> 112
    //   106: aload_1
    //   107: invokeinterface 147 1 0
    //   112: return
    //   113: astore_2
    //   114: getstatic 20	com/vvt/eventrepository/a/k:removeFromPath	Z
    //   117: istore 5
    //   119: iload 5
    //   121: ifeq -38 -> 83
    //   124: goto -41 -> 83
    //   127: astore_2
    //   128: new 82	com/vvt/exceptions/database/FxDbCorruptException
    //   131: astore_3
    //   132: aload_2
    //   133: invokevirtual 87	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   136: astore_2
    //   137: aload_3
    //   138: aload_2
    //   139: invokespecial 90	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   142: aload_3
    //   143: athrow
    //   144: astore_2
    //   145: aload_1
    //   146: ifnull +9 -> 155
    //   149: aload_1
    //   150: invokeinterface 147 1 0
    //   155: aload_2
    //   156: athrow
    //   157: astore_2
    //   158: new 92	com/vvt/exceptions/database/FxDbOperationException
    //   161: astore_3
    //   162: aload_2
    //   163: invokevirtual 95	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   166: astore 4
    //   168: aload_3
    //   169: aload 4
    //   171: aload_2
    //   172: invokespecial 98	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   175: aload_3
    //   176: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	this	k
    //   1	149	1	localCursor	Cursor
    //   6	89	2	localObject1	Object
    //   113	1	2	localIllegalArgumentException	IllegalArgumentException
    //   127	6	2	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   136	3	2	str1	String
    //   144	12	2	localObject2	Object
    //   157	15	2	localThrowable	Throwable
    //   9	167	3	localObject3	Object
    //   11	159	4	str2	String
    //   32	3	5	bool1	boolean
    //   49	4	5	i	int
    //   117	3	5	bool2	boolean
    //   72	3	6	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   79	83	113	java/lang/IllegalArgumentException
    //   2	6	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   17	21	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   26	32	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   43	49	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   52	59	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   68	72	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   79	83	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   83	87	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   97	102	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   114	117	127	android/database/sqlite/SQLiteDatabaseCorruptException
    //   128	131	144	finally
    //   132	136	144	finally
    //   138	142	144	finally
    //   142	144	144	finally
    //   158	161	144	finally
    //   162	166	144	finally
    //   171	175	144	finally
    //   175	177	144	finally
    //   2	6	157	finally
    //   17	21	157	finally
    //   26	32	157	finally
    //   43	49	157	finally
    //   52	59	157	finally
    //   68	72	157	finally
    //   79	83	157	finally
    //   83	87	157	finally
    //   97	102	157	finally
    //   114	117	157	finally
  }
  
  /* Error */
  public int b(long paramLong)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 15	com/vvt/eventrepository/a/k:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: getstatic 15	com/vvt/eventrepository/a/k:a	Z
    //   18: istore 5
    //   20: iload 5
    //   22: ifeq +3 -> 25
    //   25: new 231	java/lang/StringBuilder
    //   28: astore 6
    //   30: aload 6
    //   32: invokespecial 232	java/lang/StringBuilder:<init>	()V
    //   35: ldc_w 351
    //   38: astore 7
    //   40: aload 6
    //   42: aload 7
    //   44: invokevirtual 238	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: lload_1
    //   48: invokevirtual 354	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   51: invokevirtual 244	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: astore 6
    //   56: aload_0
    //   57: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   60: astore 7
    //   62: ldc 74
    //   64: astore 8
    //   66: aload 7
    //   68: aload 8
    //   70: aload 6
    //   72: aconst_null
    //   73: aconst_null
    //   74: invokestatic 338	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   77: astore 4
    //   79: aload 4
    //   81: ifnull +71 -> 152
    //   84: aload 4
    //   86: invokeinterface 341 1 0
    //   91: istore 9
    //   93: iload 9
    //   95: ifeq +57 -> 152
    //   98: ldc 41
    //   100: astore 7
    //   102: aload 4
    //   104: aload 7
    //   106: invokeinterface 257 2 0
    //   111: istore 9
    //   113: aload 4
    //   115: iload 9
    //   117: invokeinterface 270 2 0
    //   122: astore 7
    //   124: aload 7
    //   126: ifnull +26 -> 152
    //   129: ldc 122
    //   131: astore 8
    //   133: aload 7
    //   135: aload 8
    //   137: invokevirtual 128	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   140: istore 10
    //   142: iload 10
    //   144: ifne +8 -> 152
    //   147: aload 7
    //   149: invokestatic 343	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   152: aload_0
    //   153: getfield 30	com/vvt/eventrepository/a/k:d	Landroid/database/sqlite/SQLiteDatabase;
    //   156: astore 7
    //   158: ldc 74
    //   160: astore 8
    //   162: aload 7
    //   164: aload 8
    //   166: aload 6
    //   168: aconst_null
    //   169: invokevirtual 347	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    //   172: istore 5
    //   174: aload 4
    //   176: ifnull +10 -> 186
    //   179: aload 4
    //   181: invokeinterface 147 1 0
    //   186: getstatic 15	com/vvt/eventrepository/a/k:a	Z
    //   189: istore_3
    //   190: iload_3
    //   191: ifeq +3 -> 194
    //   194: iload 5
    //   196: ireturn
    //   197: astore 7
    //   199: getstatic 20	com/vvt/eventrepository/a/k:removeFromPath	Z
    //   202: istore 9
    //   204: iload 9
    //   206: ifeq -54 -> 152
    //   209: goto -57 -> 152
    //   212: astore 6
    //   214: new 82	com/vvt/exceptions/database/FxDbCorruptException
    //   217: astore 7
    //   219: aload 6
    //   221: invokevirtual 87	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   224: astore 6
    //   226: aload 7
    //   228: aload 6
    //   230: invokespecial 90	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   233: aload 7
    //   235: athrow
    //   236: astore 6
    //   238: aload 4
    //   240: ifnull +10 -> 250
    //   243: aload 4
    //   245: invokeinterface 147 1 0
    //   250: aload 6
    //   252: athrow
    //   253: astore 6
    //   255: new 92	com/vvt/exceptions/database/FxDbOperationException
    //   258: astore 7
    //   260: aload 6
    //   262: invokevirtual 95	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   265: astore 8
    //   267: aload 7
    //   269: aload 8
    //   271: aload 6
    //   273: invokespecial 98	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   276: aload 7
    //   278: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	279	0	this	k
    //   0	279	1	paramLong	long
    //   1	190	3	bool1	boolean
    //   3	241	4	localCursor	Cursor
    //   8	13	5	bool2	boolean
    //   172	23	5	i	int
    //   28	139	6	localObject1	Object
    //   212	8	6	localSQLiteDatabaseCorruptException	SQLiteDatabaseCorruptException
    //   224	5	6	str1	String
    //   236	15	6	localObject2	Object
    //   253	19	6	localThrowable	Throwable
    //   38	125	7	localObject3	Object
    //   197	1	7	localIllegalArgumentException	IllegalArgumentException
    //   217	60	7	localObject4	Object
    //   64	206	8	str2	String
    //   91	3	9	bool3	boolean
    //   111	5	9	j	int
    //   202	3	9	bool4	boolean
    //   140	3	10	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   147	152	197	java/lang/IllegalArgumentException
    //   56	60	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   73	77	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   84	91	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   104	111	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   115	122	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   135	140	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   147	152	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   152	156	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   168	172	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   199	202	212	android/database/sqlite/SQLiteDatabaseCorruptException
    //   214	217	236	finally
    //   219	224	236	finally
    //   228	233	236	finally
    //   233	236	236	finally
    //   255	258	236	finally
    //   260	265	236	finally
    //   271	276	236	finally
    //   276	279	236	finally
    //   56	60	253	finally
    //   73	77	253	finally
    //   84	91	253	finally
    //   104	111	253	finally
    //   115	122	253	finally
    //   135	140	253	finally
    //   147	152	253	finally
    //   152	156	253	finally
    //   168	172	253	finally
    //   199	202	253	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */