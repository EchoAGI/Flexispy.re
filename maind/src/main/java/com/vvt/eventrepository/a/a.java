package com.vvt.eventrepository.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxAudioAmbientEvent;
import com.vvt.events.FxAudioConversationEvent;
import com.vvt.events.FxAudioFileEvent;
import com.vvt.events.FxCameraImageEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxRemoteCameraImageEvent;
import com.vvt.events.FxVideoFileEvent;
import com.vvt.events.FxWallpaperEvent;
import com.vvt.events.c;
import com.vvt.events.f;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbIdNotFoundException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.d;
import com.vvt.io.exception.FxFileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class a
  extends o
{
  private static final boolean a = com.vvt.eventrepository.a.a;
  private static final boolean b = com.vvt.eventrepository.a.b;
  private static final boolean c = com.vvt.eventrepository.a.e;
  private SQLiteDatabase d;
  
  public a(SQLiteDatabase paramSQLiteDatabase)
  {
    this.d = paramSQLiteDatabase;
  }
  
  private FxEvent a(long paramLong1, String paramString, long paramLong2, FxEventType paramFxEventType, long paramLong3)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = null;
    Object localObject2 = FxMediaType.UNKNOWN;
    Object localObject3 = "";
    boolean bool2;
    if (paramString != null)
    {
      localObject3 = new java/io/File;
      ((File)localObject3).<init>(paramString);
      bool2 = ((File)localObject3).exists();
      if (!bool2) {
        break label167;
      }
      localObject3 = ((File)localObject3).getName();
      localObject2 = f.a(d.a(paramString));
      boolean bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (!bool3) {}
    }
    Object localObject4 = b.a;
    int j = paramFxEventType.ordinal();
    int i = localObject4[j];
    switch (i)
    {
    default: 
      bool1 = false;
      localObject3 = null;
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return (FxEvent)localObject3;
      label167:
      localObject3 = new com/vvt/io/exception/FxFileNotFoundException;
      localObject1 = new Object[1];
      Long localLong = Long.valueOf(paramLong1);
      localObject1[0] = localLong;
      localObject2 = String.format("Cannot upload media file.\nFile has been removed.\nPairing ID: %s", (Object[])localObject1);
      ((FxFileNotFoundException)localObject3).<init>((String)localObject2);
      throw ((Throwable)localObject3);
      localObject4 = c(paramLong1);
      localObject1 = new com/vvt/events/FxCameraImageEvent;
      ((FxCameraImageEvent)localObject1).<init>();
      ((FxCameraImageEvent)localObject1).setEventId(paramLong1);
      ((FxCameraImageEvent)localObject1).setEventTime(paramLong2);
      ((FxCameraImageEvent)localObject1).setFileName((String)localObject3);
      ((FxCameraImageEvent)localObject1).setFilePath(paramString);
      ((FxCameraImageEvent)localObject1).setFormat((FxMediaType)localObject2);
      ((FxCameraImageEvent)localObject1).setParingId(paramLong1);
      ((FxCameraImageEvent)localObject1).setGeo((c)localObject4);
      localObject3 = localObject1;
      continue;
      localObject4 = d(paramLong1);
      localObject1 = new com/vvt/events/FxAudioConversationEvent;
      ((FxAudioConversationEvent)localObject1).<init>();
      ((FxAudioConversationEvent)localObject1).setEmbededCallInfo((com.vvt.events.b)localObject4);
      ((FxAudioConversationEvent)localObject1).setEventId(paramLong1);
      ((FxAudioConversationEvent)localObject1).setEventTime(paramLong2);
      ((FxAudioConversationEvent)localObject1).setFileName((String)localObject3);
      ((FxAudioConversationEvent)localObject1).setFilePath(paramString);
      ((FxAudioConversationEvent)localObject1).setFormat((FxMediaType)localObject2);
      ((FxAudioConversationEvent)localObject1).setParingId(paramLong1);
      localObject3 = localObject1;
      continue;
      localObject1 = new com/vvt/events/FxAudioFileEvent;
      ((FxAudioFileEvent)localObject1).<init>();
      ((FxAudioFileEvent)localObject1).setEventId(paramLong1);
      ((FxAudioFileEvent)localObject1).setEventTime(paramLong2);
      ((FxAudioFileEvent)localObject1).setFileName((String)localObject3);
      ((FxAudioFileEvent)localObject1).setFilePath(paramString);
      ((FxAudioFileEvent)localObject1).setFormat((FxMediaType)localObject2);
      ((FxAudioFileEvent)localObject1).setParingId(paramLong1);
      localObject3 = localObject1;
      continue;
      localObject1 = new com/vvt/events/FxVideoFileEvent;
      ((FxVideoFileEvent)localObject1).<init>();
      ((FxVideoFileEvent)localObject1).setEventId(paramLong1);
      ((FxVideoFileEvent)localObject1).setEventTime(paramLong2);
      ((FxVideoFileEvent)localObject1).setFileName((String)localObject3);
      ((FxVideoFileEvent)localObject1).setFilePath(paramString);
      ((FxVideoFileEvent)localObject1).setMediaType((FxMediaType)localObject2);
      ((FxVideoFileEvent)localObject1).setParingId(paramLong1);
      localObject3 = localObject1;
      continue;
      localObject1 = new com/vvt/events/FxWallpaperEvent;
      ((FxWallpaperEvent)localObject1).<init>();
      ((FxWallpaperEvent)localObject1).setEventId(paramLong1);
      ((FxWallpaperEvent)localObject1).setEventTime(paramLong2);
      ((FxWallpaperEvent)localObject1).setFormat((FxMediaType)localObject2);
      ((FxWallpaperEvent)localObject1).setParingId(paramLong1);
      ((FxWallpaperEvent)localObject1).setFileName((String)localObject3);
      ((FxWallpaperEvent)localObject1).setFilePath(paramString);
      localObject3 = localObject1;
      continue;
      localObject1 = new com/vvt/events/FxAudioAmbientEvent;
      ((FxAudioAmbientEvent)localObject1).<init>();
      ((FxAudioAmbientEvent)localObject1).setEventId(paramLong1);
      ((FxAudioAmbientEvent)localObject1).setEventTime(paramLong2);
      ((FxAudioAmbientEvent)localObject1).setFormat((FxMediaType)localObject2);
      ((FxAudioAmbientEvent)localObject1).setParingId(paramLong1);
      ((FxAudioAmbientEvent)localObject1).setFileName((String)localObject3);
      ((FxAudioAmbientEvent)localObject1).setFilePath(paramString);
      ((FxAudioAmbientEvent)localObject1).setDuration(paramLong3);
      localObject3 = localObject1;
      continue;
      localObject4 = c(paramLong1);
      localObject1 = new com/vvt/events/FxRemoteCameraImageEvent;
      ((FxRemoteCameraImageEvent)localObject1).<init>();
      ((FxRemoteCameraImageEvent)localObject1).setEventId(paramLong1);
      ((FxRemoteCameraImageEvent)localObject1).setEventTime(paramLong2);
      ((FxRemoteCameraImageEvent)localObject1).setFileName((String)localObject3);
      ((FxRemoteCameraImageEvent)localObject1).setFilePath(paramString);
      ((FxRemoteCameraImageEvent)localObject1).setFormat((FxMediaType)localObject2);
      long l = 0L;
      ((FxRemoteCameraImageEvent)localObject1).setParingId(l);
      ((FxRemoteCameraImageEvent)localObject1).setGeoTag((c)localObject4);
      localObject3 = localObject1;
    }
  }
  
  private c c(long paramLong)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Object localObject1 = new Object[2];
    localObject1[0] = "gps_tag";
    localObject1[i] = "gps_tag";
    String str1 = String.format("SELECT * FROM %s WHERE %s._id = ? ", (Object[])localObject1);
    Object localObject3 = Long.toString(paramLong);
    Object localObject4 = new com/vvt/events/c;
    ((c)localObject4).<init>();
    localObject1 = null;
    try
    {
      Object localObject5 = this.d;
      int j = 1;
      String[] arrayOfString = new String[j];
      arrayOfString[0] = localObject3;
      localObject1 = ((SQLiteDatabase)localObject5).rawQuery(str1, arrayOfString);
      if (localObject1 != null)
      {
        boolean bool = ((Cursor)localObject1).moveToFirst();
        if (bool)
        {
          str1 = "altitude";
          int k = ((Cursor)localObject1).getColumnIndex(str1);
          float f2 = ((Cursor)localObject1).getFloat(k);
          localObject3 = "latitude";
          int m = ((Cursor)localObject1).getColumnIndex((String)localObject3);
          float f3 = ((Cursor)localObject1).getFloat(m);
          localObject5 = "longitude";
          i = ((Cursor)localObject1).getColumnIndex((String)localObject5);
          f1 = ((Cursor)localObject1).getFloat(i);
          ((c)localObject4).a(f2);
          double d1 = f3;
          ((c)localObject4).a(d1);
          double d2 = f1;
          ((c)localObject4).b(d2);
        }
      }
      if (localObject1 != null) {
        ((Cursor)localObject1).close();
      }
      return (c)localObject4;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject3 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str2 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject3).<init>(str2);
        throw ((Throwable)localObject3);
      }
      finally
      {
        if (localObject1 != null) {
          ((Cursor)localObject1).close();
        }
      }
    }
    finally
    {
      localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject4 = localThrowable.getMessage();
      ((FxDbOperationException)localObject3).<init>((String)localObject4, localThrowable);
    }
  }
  
  private com.vvt.events.b d(long paramLong)
  {
    int i = 1;
    Object localObject1 = null;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject2 = new Object[2];
    localObject2[0] = "call_tag";
    localObject2[i] = "call_tag";
    String str1 = String.format("SELECT * FROM %s WHERE %s._id = ? ", (Object[])localObject2);
    Object localObject4 = Long.toString(paramLong);
    localObject1 = new com/vvt/events/b;
    ((com.vvt.events.b)localObject1).<init>();
    localObject2 = null;
    try
    {
      Object localObject5 = this.d;
      int k = 1;
      Object localObject6 = new String[k];
      localObject6[0] = localObject4;
      localObject2 = ((SQLiteDatabase)localObject5).rawQuery(str1, (String[])localObject6);
      if (localObject2 != null)
      {
        bool1 = ((Cursor)localObject2).moveToFirst();
        if (bool1)
        {
          str1 = "contact_name";
          int j = ((Cursor)localObject2).getColumnIndex(str1);
          str1 = ((Cursor)localObject2).getString(j);
          localObject4 = "number";
          int m = ((Cursor)localObject2).getColumnIndex((String)localObject4);
          localObject4 = ((Cursor)localObject2).getString(m);
          localObject5 = "direction";
          i = ((Cursor)localObject2).getColumnIndex((String)localObject5);
          i = ((Cursor)localObject2).getInt(i);
          localObject6 = "duration";
          k = ((Cursor)localObject2).getColumnIndex((String)localObject6);
          k = ((Cursor)localObject2).getInt(k);
          localObject5 = FxEventDirection.forValue(i);
          ((com.vvt.events.b)localObject1).b(str1);
          ((com.vvt.events.b)localObject1).a((FxEventDirection)localObject5);
          long l = k;
          ((com.vvt.events.b)localObject1).a(l);
          ((com.vvt.events.b)localObject1).a((String)localObject4);
        }
      }
      if (localObject2 != null) {
        ((Cursor)localObject2).close();
      }
      boolean bool2 = a;
      if (bool2) {}
      return (com.vvt.events.b)localObject1;
    }
    catch (SQLiteDatabaseCorruptException localSQLiteDatabaseCorruptException)
    {
      try
      {
        localObject4 = new com/vvt/exceptions/database/FxDbCorruptException;
        String str2 = localSQLiteDatabaseCorruptException.getMessage();
        ((FxDbCorruptException)localObject4).<init>(str2);
        throw ((Throwable)localObject4);
      }
      finally
      {
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
      }
    }
    finally
    {
      localObject4 = new com/vvt/exceptions/database/FxDbOperationException;
      localObject1 = localThrowable.getMessage();
      ((FxDbOperationException)localObject4).<init>((String)localObject1, localThrowable);
    }
  }
  
  /* Error */
  public FxEvent a(long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: iconst_1
    //   4: istore 5
    //   6: getstatic 15	com/vvt/eventrepository/a/a:a	Z
    //   9: istore 6
    //   11: iload 6
    //   13: ifeq +3 -> 16
    //   16: getstatic 15	com/vvt/eventrepository/a/a:a	Z
    //   19: istore 6
    //   21: iload 6
    //   23: ifeq +3 -> 26
    //   26: lload_1
    //   27: invokestatic 199	java/lang/Long:toString	(J)Ljava/lang/String;
    //   30: astore 7
    //   32: iconst_2
    //   33: istore 8
    //   35: iload 8
    //   37: anewarray 78	java/lang/Object
    //   40: astore 9
    //   42: aload 9
    //   44: iconst_0
    //   45: ldc_w 292
    //   48: aastore
    //   49: ldc_w 292
    //   52: astore 10
    //   54: aload 9
    //   56: iload 5
    //   58: aload 10
    //   60: aastore
    //   61: ldc -64
    //   63: aload 9
    //   65: invokestatic 90	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   68: astore 11
    //   70: aload_0
    //   71: getfield 29	com/vvt/eventrepository/a/a:d	Landroid/database/sqlite/SQLiteDatabase;
    //   74: astore 9
    //   76: iconst_1
    //   77: istore 12
    //   79: iload 12
    //   81: anewarray 86	java/lang/String
    //   84: astore 10
    //   86: aload 10
    //   88: iconst_0
    //   89: aload 7
    //   91: aastore
    //   92: aload 9
    //   94: aload 11
    //   96: aload 10
    //   98: invokevirtual 208	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   101: astore 13
    //   103: aload 13
    //   105: ifnull +269 -> 374
    //   108: aload 13
    //   110: invokeinterface 213 1 0
    //   115: istore 6
    //   117: iload 6
    //   119: ifeq +174 -> 293
    //   122: ldc_w 294
    //   125: astore 7
    //   127: aload 13
    //   129: aload 7
    //   131: invokeinterface 219 2 0
    //   136: istore 6
    //   138: aload 13
    //   140: iload 6
    //   142: invokeinterface 265 2 0
    //   147: astore 9
    //   149: ldc_w 296
    //   152: astore 7
    //   154: aload 13
    //   156: aload 7
    //   158: invokeinterface 219 2 0
    //   163: istore 6
    //   165: aload 13
    //   167: iload 6
    //   169: invokeinterface 300 2 0
    //   174: lstore 14
    //   176: ldc_w 302
    //   179: astore 7
    //   181: aload 13
    //   183: aload 7
    //   185: invokeinterface 219 2 0
    //   190: istore 6
    //   192: aload 13
    //   194: iload 6
    //   196: invokeinterface 273 2 0
    //   201: istore 6
    //   203: ldc_w 304
    //   206: astore 11
    //   208: aload 13
    //   210: aload 11
    //   212: invokeinterface 219 2 0
    //   217: istore 16
    //   219: aload 13
    //   221: iload 16
    //   223: invokeinterface 273 2 0
    //   228: istore 16
    //   230: ldc_w 306
    //   233: astore 17
    //   235: aload 13
    //   237: aload 17
    //   239: invokeinterface 219 2 0
    //   244: istore 18
    //   246: aload 13
    //   248: iload 18
    //   250: invokeinterface 300 2 0
    //   255: lstore 19
    //   257: iload_3
    //   258: ifeq +88 -> 346
    //   261: iload 16
    //   263: iload 5
    //   265: if_icmpne +68 -> 333
    //   268: iload 6
    //   270: invokestatic 309	com/vvt/base/FxEventType:forValue	(I)Lcom/vvt/base/FxEventType;
    //   273: astore 17
    //   275: aload_0
    //   276: astore 4
    //   278: aload_0
    //   279: lload_1
    //   280: aload 9
    //   282: lload 14
    //   284: aload 17
    //   286: lload 19
    //   288: invokespecial 312	com/vvt/eventrepository/a/a:a	(JLjava/lang/String;JLcom/vvt/base/FxEventType;J)Lcom/vvt/base/FxEvent;
    //   291: astore 4
    //   293: aload 13
    //   295: ifnull +10 -> 305
    //   298: aload 13
    //   300: invokeinterface 238 1 0
    //   305: aload 4
    //   307: ifnonnull +223 -> 530
    //   310: getstatic 18	com/vvt/eventrepository/a/a:removeFromPath	Z
    //   313: istore 6
    //   315: iload 6
    //   317: ifeq +3 -> 320
    //   320: getstatic 15	com/vvt/eventrepository/a/a:a	Z
    //   323: istore 6
    //   325: iload 6
    //   327: ifeq +3 -> 330
    //   330: aload 4
    //   332: areturn
    //   333: getstatic 18	com/vvt/eventrepository/a/a:removeFromPath	Z
    //   336: istore 6
    //   338: iload 6
    //   340: ifeq -47 -> 293
    //   343: goto -50 -> 293
    //   346: iload 6
    //   348: invokestatic 309	com/vvt/base/FxEventType:forValue	(I)Lcom/vvt/base/FxEventType;
    //   351: astore 17
    //   353: aload_0
    //   354: astore 4
    //   356: aload_0
    //   357: lload_1
    //   358: aload 9
    //   360: lload 14
    //   362: aload 17
    //   364: lload 19
    //   366: invokespecial 312	com/vvt/eventrepository/a/a:a	(JLjava/lang/String;JLcom/vvt/base/FxEventType;J)Lcom/vvt/base/FxEvent;
    //   369: astore 4
    //   371: goto -78 -> 293
    //   374: new 314	com/vvt/exceptions/database/FxDbIdNotFoundException
    //   377: astore 4
    //   379: ldc_w 316
    //   382: astore 7
    //   384: iconst_1
    //   385: istore 16
    //   387: iload 16
    //   389: anewarray 78	java/lang/Object
    //   392: astore 11
    //   394: iconst_0
    //   395: istore 8
    //   397: aconst_null
    //   398: astore 9
    //   400: lload_1
    //   401: invokestatic 84	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   404: astore 10
    //   406: aload 11
    //   408: iconst_0
    //   409: aload 10
    //   411: aastore
    //   412: aload 7
    //   414: aload 11
    //   416: invokestatic 90	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   419: astore 7
    //   421: aload 4
    //   423: aload 7
    //   425: invokespecial 317	com/vvt/exceptions/database/FxDbIdNotFoundException:<init>	(Ljava/lang/String;)V
    //   428: aload 4
    //   430: athrow
    //   431: astore 4
    //   433: aload 13
    //   435: astore 7
    //   437: new 240	com/vvt/exceptions/database/FxDbCorruptException
    //   440: astore 11
    //   442: aload 4
    //   444: invokevirtual 245	android/database/sqlite/SQLiteDatabaseCorruptException:getMessage	()Ljava/lang/String;
    //   447: astore 4
    //   449: aload 11
    //   451: aload 4
    //   453: invokespecial 246	com/vvt/exceptions/database/FxDbCorruptException:<init>	(Ljava/lang/String;)V
    //   456: aload 11
    //   458: athrow
    //   459: astore 4
    //   461: aload 7
    //   463: astore 13
    //   465: aload 13
    //   467: ifnull +10 -> 477
    //   470: aload 13
    //   472: invokeinterface 238 1 0
    //   477: aload 4
    //   479: athrow
    //   480: astore 7
    //   482: aconst_null
    //   483: astore 13
    //   485: aload 7
    //   487: astore 4
    //   489: aload 4
    //   491: athrow
    //   492: astore 4
    //   494: goto -29 -> 465
    //   497: astore 7
    //   499: aconst_null
    //   500: astore 13
    //   502: aload 7
    //   504: astore 4
    //   506: new 248	com/vvt/exceptions/database/FxDbOperationException
    //   509: astore 7
    //   511: aload 4
    //   513: invokevirtual 251	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   516: astore 11
    //   518: aload 7
    //   520: aload 11
    //   522: aload 4
    //   524: invokespecial 254	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   527: aload 7
    //   529: athrow
    //   530: getstatic 15	com/vvt/eventrepository/a/a:a	Z
    //   533: istore 6
    //   535: iload 6
    //   537: ifeq -217 -> 320
    //   540: goto -220 -> 320
    //   543: astore 4
    //   545: goto -39 -> 506
    //   548: astore 4
    //   550: goto -61 -> 489
    //   553: astore 21
    //   555: iconst_0
    //   556: istore 6
    //   558: aconst_null
    //   559: astore 7
    //   561: aload 21
    //   563: astore 4
    //   565: goto -128 -> 437
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	568	0	this	a
    //   0	568	1	paramLong	long
    //   0	568	3	paramBoolean	boolean
    //   1	428	4	localObject1	Object
    //   431	12	4	localSQLiteDatabaseCorruptException1	SQLiteDatabaseCorruptException
    //   447	5	4	str	String
    //   459	19	4	localObject2	Object
    //   487	3	4	localObject3	Object
    //   492	1	4	localObject4	Object
    //   504	19	4	localObject5	Object
    //   543	1	4	localObject6	Object
    //   548	1	4	localFxFileNotFoundException1	FxFileNotFoundException
    //   563	1	4	localObject7	Object
    //   4	262	5	i	int
    //   9	109	6	bool1	boolean
    //   136	133	6	j	int
    //   313	34	6	k	int
    //   533	24	6	bool2	boolean
    //   30	432	7	localObject8	Object
    //   480	6	7	localFxFileNotFoundException2	FxFileNotFoundException
    //   497	6	7	localObject9	Object
    //   509	51	7	localFxDbOperationException	FxDbOperationException
    //   33	363	8	m	int
    //   40	359	9	localObject10	Object
    //   52	358	10	localObject11	Object
    //   68	453	11	localObject12	Object
    //   77	3	12	n	int
    //   101	400	13	localObject13	Object
    //   174	187	14	l1	long
    //   217	171	16	i1	int
    //   233	130	17	localObject14	Object
    //   244	5	18	i2	int
    //   255	110	19	l2	long
    //   553	9	21	localSQLiteDatabaseCorruptException2	SQLiteDatabaseCorruptException
    // Exception table:
    //   from	to	target	type
    //   108	115	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   129	136	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   140	147	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   156	163	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   167	174	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   183	190	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   194	201	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   210	217	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   221	228	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   237	244	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   248	255	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   268	273	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   286	291	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   333	336	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   346	351	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   364	369	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   374	377	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   387	392	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   400	404	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   409	412	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   414	419	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   423	428	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   428	431	431	android/database/sqlite/SQLiteDatabaseCorruptException
    //   437	440	459	finally
    //   442	447	459	finally
    //   451	456	459	finally
    //   456	459	459	finally
    //   70	74	480	com/vvt/io/exception/FxFileNotFoundException
    //   79	84	480	com/vvt/io/exception/FxFileNotFoundException
    //   89	92	480	com/vvt/io/exception/FxFileNotFoundException
    //   96	101	480	com/vvt/io/exception/FxFileNotFoundException
    //   489	492	492	finally
    //   506	509	492	finally
    //   511	516	492	finally
    //   522	527	492	finally
    //   527	530	492	finally
    //   70	74	497	finally
    //   79	84	497	finally
    //   89	92	497	finally
    //   96	101	497	finally
    //   108	115	543	finally
    //   129	136	543	finally
    //   140	147	543	finally
    //   156	163	543	finally
    //   167	174	543	finally
    //   183	190	543	finally
    //   194	201	543	finally
    //   210	217	543	finally
    //   221	228	543	finally
    //   237	244	543	finally
    //   248	255	543	finally
    //   268	273	543	finally
    //   286	291	543	finally
    //   333	336	543	finally
    //   346	351	543	finally
    //   364	369	543	finally
    //   374	377	543	finally
    //   387	392	543	finally
    //   400	404	543	finally
    //   409	412	543	finally
    //   414	419	543	finally
    //   423	428	543	finally
    //   428	431	543	finally
    //   108	115	548	com/vvt/io/exception/FxFileNotFoundException
    //   129	136	548	com/vvt/io/exception/FxFileNotFoundException
    //   140	147	548	com/vvt/io/exception/FxFileNotFoundException
    //   156	163	548	com/vvt/io/exception/FxFileNotFoundException
    //   167	174	548	com/vvt/io/exception/FxFileNotFoundException
    //   183	190	548	com/vvt/io/exception/FxFileNotFoundException
    //   194	201	548	com/vvt/io/exception/FxFileNotFoundException
    //   210	217	548	com/vvt/io/exception/FxFileNotFoundException
    //   221	228	548	com/vvt/io/exception/FxFileNotFoundException
    //   237	244	548	com/vvt/io/exception/FxFileNotFoundException
    //   248	255	548	com/vvt/io/exception/FxFileNotFoundException
    //   268	273	548	com/vvt/io/exception/FxFileNotFoundException
    //   286	291	548	com/vvt/io/exception/FxFileNotFoundException
    //   333	336	548	com/vvt/io/exception/FxFileNotFoundException
    //   346	351	548	com/vvt/io/exception/FxFileNotFoundException
    //   364	369	548	com/vvt/io/exception/FxFileNotFoundException
    //   374	377	548	com/vvt/io/exception/FxFileNotFoundException
    //   387	392	548	com/vvt/io/exception/FxFileNotFoundException
    //   400	404	548	com/vvt/io/exception/FxFileNotFoundException
    //   409	412	548	com/vvt/io/exception/FxFileNotFoundException
    //   414	419	548	com/vvt/io/exception/FxFileNotFoundException
    //   423	428	548	com/vvt/io/exception/FxFileNotFoundException
    //   428	431	548	com/vvt/io/exception/FxFileNotFoundException
    //   70	74	553	android/database/sqlite/SQLiteDatabaseCorruptException
    //   79	84	553	android/database/sqlite/SQLiteDatabaseCorruptException
    //   89	92	553	android/database/sqlite/SQLiteDatabaseCorruptException
    //   96	101	553	android/database/sqlite/SQLiteDatabaseCorruptException
  }
  
  public FxEventType a(long paramLong)
  {
    FxEventType localFxEventType = null;
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    Object localObject2 = Long.toString(paramLong);
    int j = 2;
    Object localObject5 = new Object[j];
    localObject5[0] = "media";
    Object localObject6 = "media";
    localObject5[i] = localObject6;
    String str = String.format("SELECT * FROM %s WHERE %s._id = ? ", (Object[])localObject5);
    try
    {
      localObject5 = this.d;
      int k = 1;
      localObject6 = new String[k];
      localObject6[0] = localObject2;
      localObject2 = ((SQLiteDatabase)localObject5).rawQuery(str, (String[])localObject6);
      if (localObject2 != null) {}
      Object localObject4;
      try
      {
        for (;;)
        {
          boolean bool2;
          int m;
          boolean bool3 = c;
          if ((bool3) && (localObject4 == null)) {}
        }
      }
      finally {}
    }
    finally
    {
      try
      {
        bool2 = ((Cursor)localObject2).moveToFirst();
        if (bool2)
        {
          str = "media_event_type";
          m = ((Cursor)localObject2).getColumnIndex(str);
          m = ((Cursor)localObject2).getInt(m);
          localFxEventType = FxEventType.forValue(m);
        }
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        bool1 = a;
        if (bool1) {}
        return localFxEventType;
      }
      finally
      {
        for (;;) {}
      }
      localObject3 = finally;
      bool1 = false;
      localObject4 = null;
    }
    if (localObject4 != null) {
      ((Cursor)localObject4).close();
    }
    throw localFxEventType;
  }
  
  public List a(QueryOrder paramQueryOrder, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    return localArrayList;
  }
  
  public void a()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.d;
      String str = "media";
      localSQLiteDatabase.delete(str, null, null);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public int b(long paramLong)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = "_id=";
    localObject1 = (String)localObject2 + paramLong;
    try
    {
      localObject2 = this.d;
      Object localObject3 = "media";
      j = ((SQLiteDatabase)localObject2).delete((String)localObject3, (String)localObject1, null);
      if (j < i)
      {
        localObject1 = new com/vvt/exceptions/database/FxDbIdNotFoundException;
        localObject2 = "Pairing ID: %s not found!";
        int k = 1;
        localObject3 = new Object[k];
        Long localLong = Long.valueOf(paramLong);
        localObject3[0] = localLong;
        localObject2 = String.format((String)localObject2, (Object[])localObject3);
        ((FxDbIdNotFoundException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    catch (Exception localException)
    {
      boolean bool = c;
      if (!bool) {}
    }
    return j;
  }
  
  /* Error */
  public int b(long paramLong, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: istore 4
    //   3: iconst_1
    //   4: istore 5
    //   6: aconst_null
    //   7: astore 6
    //   9: iconst_0
    //   10: istore 7
    //   12: aconst_null
    //   13: astore 8
    //   15: iload_3
    //   16: ifeq +310 -> 326
    //   19: new 328	java/lang/StringBuilder
    //   22: astore 9
    //   24: aload 9
    //   26: invokespecial 329	java/lang/StringBuilder:<init>	()V
    //   29: aload 9
    //   31: ldc_w 331
    //   34: invokevirtual 335	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: lload_1
    //   38: invokevirtual 338	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   41: invokevirtual 340	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   44: astore 9
    //   46: new 328	java/lang/StringBuilder
    //   49: astore 10
    //   51: aload 10
    //   53: invokespecial 329	java/lang/StringBuilder:<init>	()V
    //   56: aload 10
    //   58: ldc_w 342
    //   61: invokevirtual 335	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   64: lload_1
    //   65: invokevirtual 338	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   68: astore 10
    //   70: aload 10
    //   72: invokevirtual 340	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   75: astore 11
    //   77: aload_0
    //   78: getfield 29	com/vvt/eventrepository/a/a:d	Landroid/database/sqlite/SQLiteDatabase;
    //   81: astore 10
    //   83: ldc_w 292
    //   86: astore 12
    //   88: aload 10
    //   90: aload 12
    //   92: aload 9
    //   94: aconst_null
    //   95: aconst_null
    //   96: invokestatic 347	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   99: astore 9
    //   101: aload 9
    //   103: ifnull +618 -> 721
    //   106: aload 9
    //   108: invokeinterface 213 1 0
    //   113: istore 13
    //   115: iload 13
    //   117: ifeq +604 -> 721
    //   120: ldc_w 302
    //   123: astore 10
    //   125: aload 9
    //   127: aload 10
    //   129: invokeinterface 219 2 0
    //   134: istore 13
    //   136: aload 9
    //   138: iload 13
    //   140: invokeinterface 273 2 0
    //   145: istore 13
    //   147: aload 9
    //   149: ifnull +10 -> 159
    //   152: aload 9
    //   154: invokeinterface 238 1 0
    //   159: iload 13
    //   161: iload 4
    //   163: if_icmple +359 -> 522
    //   166: bipush 12
    //   168: istore 4
    //   170: iload 13
    //   172: iload 4
    //   174: if_icmpeq +348 -> 522
    //   177: getstatic 18	com/vvt/eventrepository/a/a:removeFromPath	Z
    //   180: istore 13
    //   182: iload 13
    //   184: ifeq +3 -> 187
    //   187: aload_0
    //   188: getfield 29	com/vvt/eventrepository/a/a:d	Landroid/database/sqlite/SQLiteDatabase;
    //   191: astore 10
    //   193: ldc_w 350
    //   196: astore 14
    //   198: aconst_null
    //   199: astore 12
    //   201: aload 10
    //   203: aload 14
    //   205: aload 11
    //   207: aconst_null
    //   208: aconst_null
    //   209: invokestatic 347	com/vvt/eventrepository/a/n:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   212: astore 8
    //   214: aload 8
    //   216: ifnull +72 -> 288
    //   219: aload 8
    //   221: invokeinterface 213 1 0
    //   226: istore 13
    //   228: iload 13
    //   230: ifeq +58 -> 288
    //   233: ldc_w 294
    //   236: astore 10
    //   238: aload 8
    //   240: aload 10
    //   242: invokeinterface 219 2 0
    //   247: istore 13
    //   249: aload 8
    //   251: iload 13
    //   253: invokeinterface 265 2 0
    //   258: astore 10
    //   260: aload 10
    //   262: ifnull +26 -> 288
    //   265: ldc 37
    //   267: astore 14
    //   269: aload 10
    //   271: aload 14
    //   273: invokevirtual 354	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   276: istore 4
    //   278: iload 4
    //   280: ifne +8 -> 288
    //   283: aload 10
    //   285: invokestatic 355	com/vvt/io/d:removeFromPath	(Ljava/lang/String;)V
    //   288: aload 9
    //   290: ifnull +24 -> 314
    //   293: aload 9
    //   295: invokeinterface 358 1 0
    //   300: istore 13
    //   302: iload 13
    //   304: ifne +10 -> 314
    //   307: aload 9
    //   309: invokeinterface 238 1 0
    //   314: aload 8
    //   316: ifnull +10 -> 326
    //   319: aload 8
    //   321: invokeinterface 238 1 0
    //   326: new 360	android/content/ContentValues
    //   329: astore 8
    //   331: aload 8
    //   333: invokespecial 361	android/content/ContentValues:<init>	()V
    //   336: iload_3
    //   337: ifeq +309 -> 646
    //   340: ldc_w 304
    //   343: astore 9
    //   345: iload 5
    //   347: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   350: astore 10
    //   352: aload 8
    //   354: aload 9
    //   356: aload 10
    //   358: invokevirtual 370	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   361: new 328	java/lang/StringBuilder
    //   364: astore 9
    //   366: aload 9
    //   368: invokespecial 329	java/lang/StringBuilder:<init>	()V
    //   371: ldc_w 331
    //   374: astore 10
    //   376: aload 9
    //   378: aload 10
    //   380: invokevirtual 335	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   383: astore 9
    //   385: aload 9
    //   387: lload_1
    //   388: invokevirtual 338	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   391: astore 9
    //   393: aload 9
    //   395: invokevirtual 340	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   398: astore 9
    //   400: aload_0
    //   401: getfield 29	com/vvt/eventrepository/a/a:d	Landroid/database/sqlite/SQLiteDatabase;
    //   404: astore 10
    //   406: ldc_w 292
    //   409: astore 14
    //   411: aconst_null
    //   412: astore 11
    //   414: aload 10
    //   416: aload 14
    //   418: aload 8
    //   420: aload 9
    //   422: aconst_null
    //   423: invokevirtual 374	android/database/sqlite/SQLiteDatabase:update	(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    //   426: istore 7
    //   428: iload 7
    //   430: iload 5
    //   432: if_icmpge +72 -> 504
    //   435: new 314	com/vvt/exceptions/database/FxDbIdNotFoundException
    //   438: astore 9
    //   440: ldc_w 316
    //   443: astore 6
    //   445: iconst_1
    //   446: istore 13
    //   448: iload 13
    //   450: anewarray 78	java/lang/Object
    //   453: astore 10
    //   455: iconst_0
    //   456: istore 4
    //   458: aconst_null
    //   459: astore 14
    //   461: lload_1
    //   462: invokestatic 84	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   465: astore 11
    //   467: aload 10
    //   469: iconst_0
    //   470: aload 11
    //   472: aastore
    //   473: aload 6
    //   475: aload 10
    //   477: invokestatic 90	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   480: astore 6
    //   482: aload 9
    //   484: aload 6
    //   486: invokespecial 317	com/vvt/exceptions/database/FxDbIdNotFoundException:<init>	(Ljava/lang/String;)V
    //   489: aload 9
    //   491: athrow
    //   492: astore 9
    //   494: getstatic 23	com/vvt/eventrepository/a/a:MyUncaughtExceptionHandler	Z
    //   497: istore 15
    //   499: iload 15
    //   501: ifeq +3 -> 504
    //   504: iload 7
    //   506: ireturn
    //   507: astore 10
    //   509: getstatic 23	com/vvt/eventrepository/a/a:MyUncaughtExceptionHandler	Z
    //   512: istore 13
    //   514: iload 13
    //   516: ifeq -228 -> 288
    //   519: goto -231 -> 288
    //   522: getstatic 18	com/vvt/eventrepository/a/a:removeFromPath	Z
    //   525: istore 13
    //   527: iload 13
    //   529: ifeq -241 -> 288
    //   532: goto -244 -> 288
    //   535: astore 9
    //   537: iconst_0
    //   538: istore 15
    //   540: aconst_null
    //   541: astore 9
    //   543: getstatic 23	com/vvt/eventrepository/a/a:MyUncaughtExceptionHandler	Z
    //   546: istore 13
    //   548: iload 13
    //   550: ifeq +3 -> 553
    //   553: aload 9
    //   555: ifnull +24 -> 579
    //   558: aload 9
    //   560: invokeinterface 358 1 0
    //   565: istore 13
    //   567: iload 13
    //   569: ifne +10 -> 579
    //   572: aload 9
    //   574: invokeinterface 238 1 0
    //   579: aload 8
    //   581: ifnull -255 -> 326
    //   584: goto -265 -> 319
    //   587: astore 9
    //   589: aconst_null
    //   590: astore 6
    //   592: aconst_null
    //   593: astore 16
    //   595: aload 9
    //   597: astore 8
    //   599: iconst_0
    //   600: istore 15
    //   602: aconst_null
    //   603: astore 9
    //   605: aload 6
    //   607: ifnull +24 -> 631
    //   610: aload 6
    //   612: invokeinterface 358 1 0
    //   617: istore 13
    //   619: iload 13
    //   621: ifne +10 -> 631
    //   624: aload 6
    //   626: invokeinterface 238 1 0
    //   631: aload 9
    //   633: ifnull +10 -> 643
    //   636: aload 9
    //   638: invokeinterface 238 1 0
    //   643: aload 8
    //   645: athrow
    //   646: ldc_w 304
    //   649: astore 9
    //   651: iconst_0
    //   652: invokestatic 366	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   655: astore 10
    //   657: aload 8
    //   659: aload 9
    //   661: aload 10
    //   663: invokevirtual 370	android/content/ContentValues:put	(Ljava/lang/String;Ljava/lang/Integer;)V
    //   666: goto -305 -> 361
    //   669: astore 8
    //   671: iconst_0
    //   672: istore 7
    //   674: aconst_null
    //   675: astore 8
    //   677: goto -183 -> 494
    //   680: astore 16
    //   682: aload 9
    //   684: astore 6
    //   686: iconst_0
    //   687: istore 15
    //   689: aconst_null
    //   690: astore 9
    //   692: aload 16
    //   694: astore 8
    //   696: goto -91 -> 605
    //   699: astore 16
    //   701: aload 9
    //   703: astore 6
    //   705: aload 8
    //   707: astore 9
    //   709: aload 16
    //   711: astore 8
    //   713: goto -108 -> 605
    //   716: astore 10
    //   718: goto -175 -> 543
    //   721: iload 4
    //   723: istore 13
    //   725: goto -578 -> 147
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	728	0	this	a
    //   0	728	1	paramLong	long
    //   0	728	3	paramBoolean	boolean
    //   1	174	4	i	int
    //   276	446	4	bool1	boolean
    //   4	429	5	j	int
    //   7	697	6	localObject1	Object
    //   10	663	7	k	int
    //   13	645	8	localObject2	Object
    //   669	1	8	localException1	Exception
    //   675	37	8	localObject3	Object
    //   22	468	9	localObject4	Object
    //   492	1	9	localException2	Exception
    //   535	1	9	localException3	Exception
    //   541	32	9	localObject5	Object
    //   587	9	9	localObject6	Object
    //   603	105	9	localObject7	Object
    //   49	427	10	localObject8	Object
    //   507	1	10	localIllegalArgumentException	IllegalArgumentException
    //   655	7	10	localInteger	Integer
    //   716	1	10	localException4	Exception
    //   75	396	11	localObject9	Object
    //   86	114	12	str1	String
    //   113	3	13	bool2	boolean
    //   134	41	13	m	int
    //   180	49	13	bool3	boolean
    //   247	5	13	n	int
    //   300	424	13	bool4	boolean
    //   196	264	14	str2	String
    //   497	191	15	bool5	boolean
    //   593	1	16	localObject10	Object
    //   680	13	16	localObject11	Object
    //   699	11	16	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   435	438	492	java/lang/Exception
    //   448	453	492	java/lang/Exception
    //   461	465	492	java/lang/Exception
    //   470	473	492	java/lang/Exception
    //   475	480	492	java/lang/Exception
    //   484	489	492	java/lang/Exception
    //   489	492	492	java/lang/Exception
    //   283	288	507	java/lang/IllegalArgumentException
    //   77	81	535	java/lang/Exception
    //   95	99	535	java/lang/Exception
    //   77	81	587	finally
    //   95	99	587	finally
    //   361	364	669	java/lang/Exception
    //   366	371	669	java/lang/Exception
    //   378	383	669	java/lang/Exception
    //   387	391	669	java/lang/Exception
    //   393	398	669	java/lang/Exception
    //   400	404	669	java/lang/Exception
    //   422	426	669	java/lang/Exception
    //   106	113	680	finally
    //   127	134	680	finally
    //   138	145	680	finally
    //   152	159	680	finally
    //   177	180	680	finally
    //   187	191	680	finally
    //   208	212	680	finally
    //   522	525	680	finally
    //   219	226	699	finally
    //   240	247	699	finally
    //   251	258	699	finally
    //   271	276	699	finally
    //   283	288	699	finally
    //   509	512	699	finally
    //   543	546	699	finally
    //   106	113	716	java/lang/Exception
    //   127	134	716	java/lang/Exception
    //   138	145	716	java/lang/Exception
    //   152	159	716	java/lang/Exception
    //   177	180	716	java/lang/Exception
    //   187	191	716	java/lang/Exception
    //   208	212	716	java/lang/Exception
    //   219	226	716	java/lang/Exception
    //   240	247	716	java/lang/Exception
    //   251	258	716	java/lang/Exception
    //   271	276	716	java/lang/Exception
    //   283	288	716	java/lang/Exception
    //   509	512	716	java/lang/Exception
    //   522	525	716	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */