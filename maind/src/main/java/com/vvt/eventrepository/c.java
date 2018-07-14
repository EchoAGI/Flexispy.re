package com.vvt.eventrepository;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.eventrepository.a.l;
import com.vvt.eventrepository.a.o;
import com.vvt.eventrepository.a.q;
import com.vvt.eventrepository.querycriteria.QueryOrder;
import com.vvt.events.FxAudioAmbientEvent;
import com.vvt.events.FxAudioConversationEvent;
import com.vvt.events.FxAudioFileEvent;
import com.vvt.events.FxCameraImageEvent;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxRemoteCameraImageEvent;
import com.vvt.events.FxVideoFileEvent;
import com.vvt.events.FxWallpaperEvent;
import com.vvt.exceptions.database.FxDatabaseException;
import com.vvt.exceptions.database.FxDbCorruptException;
import com.vvt.exceptions.database.FxDbIdNotFoundException;
import com.vvt.exceptions.database.FxDbOperationException;
import com.vvt.io.exception.FxFileNotFoundException;
import com.vvt.io.p;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class c
  implements b
{
  private static final boolean a = false;
  private static final boolean b = a.b;
  private static final boolean c = a.e;
  private com.vvt.eventrepository.b.c d;
  private com.vvt.eventrepository.querycriteria.a e;
  private e f;
  private String g;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
  }
  
  public c(String paramString)
  {
    this.g = paramString;
    Object localObject = new com/vvt/eventrepository/b/c;
    ((com.vvt.eventrepository.b.c)localObject).<init>(paramString);
    this.d = ((com.vvt.eventrepository.b.c)localObject);
    localObject = new com/vvt/eventrepository/querycriteria/a;
    ((com.vvt.eventrepository.querycriteria.a)localObject).<init>();
    this.e = ((com.vvt.eventrepository.querycriteria.a)localObject);
  }
  
  private FxEvent a(String paramString, long paramLong)
  {
    for (;;)
    {
      Object localObject5;
      try
      {
        boolean bool1 = a;
        if (bool1) {}
        localObject1 = new com/vvt/eventrepository/a/l;
        localObject4 = this.d;
        localObject4 = ((com.vvt.eventrepository.b.c)localObject4).a();
        ((l)localObject1).<init>((SQLiteDatabase)localObject4);
        boolean bool3 = false;
        localObject4 = null;
        localObject5 = FxEventType.ACTUAL_MEDIA_DAO;
        localObject1 = ((l)localObject1).a((FxEventType)localObject5);
        localObject1 = (com.vvt.eventrepository.a.a)localObject1;
        localObject1 = ((com.vvt.eventrepository.a.a)localObject1).a(paramLong);
        int i;
        if (localObject1 != null)
        {
          localObject5 = c(paramString, paramLong);
          int[] arrayOfInt = d.a;
          i = ((FxEventType)localObject1).ordinal();
          i = arrayOfInt[i];
        }
        switch (i)
        {
        default: 
          boolean bool2 = c;
          if (bool2) {}
          bool2 = false;
          localObject1 = null;
          if (localObject1 != null)
          {
            bool3 = a;
            if (!bool3) {}
          }
          bool3 = a;
          if (bool3) {}
          return (FxEvent)localObject1;
        }
      }
      finally {}
      Object localObject1 = new com/vvt/events/FxCameraImageEvent;
      ((FxCameraImageEvent)localObject1).<init>();
      ((FxCameraImageEvent)localObject1).setEventId(paramLong);
      Object localObject4 = FxMediaType.UNKNOWN;
      ((FxCameraImageEvent)localObject1).setFormat((FxMediaType)localObject4);
      ((FxCameraImageEvent)localObject1).setParingId(paramLong);
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>();
      long l = ((Date)localObject4).getTime();
      ((FxCameraImageEvent)localObject1).setEventTime(l);
      ((FxCameraImageEvent)localObject1).setFilePath((String)localObject5);
      continue;
      Object localObject3 = new com/vvt/events/FxAudioConversationEvent;
      ((FxAudioConversationEvent)localObject3).<init>();
      ((FxAudioConversationEvent)localObject3).setEventId(paramLong);
      localObject4 = FxMediaType.UNKNOWN;
      ((FxAudioConversationEvent)localObject3).setFormat((FxMediaType)localObject4);
      ((FxAudioConversationEvent)localObject3).setParingId(paramLong);
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>();
      l = ((Date)localObject4).getTime();
      ((FxAudioConversationEvent)localObject3).setEventTime(l);
      ((FxAudioConversationEvent)localObject3).setFilePath((String)localObject5);
      continue;
      localObject3 = new com/vvt/events/FxAudioFileEvent;
      ((FxAudioFileEvent)localObject3).<init>();
      ((FxAudioFileEvent)localObject3).setEventId(paramLong);
      localObject4 = FxMediaType.UNKNOWN;
      ((FxAudioFileEvent)localObject3).setFormat((FxMediaType)localObject4);
      ((FxAudioFileEvent)localObject3).setParingId(paramLong);
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>();
      l = ((Date)localObject4).getTime();
      ((FxAudioFileEvent)localObject3).setEventTime(l);
      ((FxAudioFileEvent)localObject3).setFilePath((String)localObject5);
      continue;
      localObject3 = new com/vvt/events/FxVideoFileEvent;
      ((FxVideoFileEvent)localObject3).<init>();
      ((FxVideoFileEvent)localObject3).setEventId(paramLong);
      localObject4 = FxMediaType.UNKNOWN;
      ((FxVideoFileEvent)localObject3).setMediaType((FxMediaType)localObject4);
      ((FxVideoFileEvent)localObject3).setParingId(paramLong);
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>();
      l = ((Date)localObject4).getTime();
      ((FxVideoFileEvent)localObject3).setEventTime(l);
      ((FxVideoFileEvent)localObject3).setFilePath((String)localObject5);
      continue;
      localObject3 = new com/vvt/events/FxWallpaperEvent;
      ((FxWallpaperEvent)localObject3).<init>();
      ((FxWallpaperEvent)localObject3).setEventId(paramLong);
      localObject4 = FxMediaType.UNKNOWN;
      ((FxWallpaperEvent)localObject3).setFormat((FxMediaType)localObject4);
      ((FxWallpaperEvent)localObject3).setParingId(paramLong);
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>();
      l = ((Date)localObject4).getTime();
      ((FxWallpaperEvent)localObject3).setEventTime(l);
      ((FxWallpaperEvent)localObject3).setFilePath((String)localObject5);
      continue;
      localObject3 = new com/vvt/events/FxAudioAmbientEvent;
      ((FxAudioAmbientEvent)localObject3).<init>();
      ((FxAudioAmbientEvent)localObject3).setEventId(paramLong);
      localObject4 = FxMediaType.UNKNOWN;
      ((FxAudioAmbientEvent)localObject3).setFormat((FxMediaType)localObject4);
      ((FxAudioAmbientEvent)localObject3).setParingId(paramLong);
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>();
      l = ((Date)localObject4).getTime();
      ((FxAudioAmbientEvent)localObject3).setEventTime(l);
      ((FxAudioAmbientEvent)localObject3).setFilePath((String)localObject5);
      continue;
      localObject3 = new com/vvt/events/FxRemoteCameraImageEvent;
      ((FxRemoteCameraImageEvent)localObject3).<init>();
      ((FxRemoteCameraImageEvent)localObject3).setEventId(paramLong);
      localObject4 = FxMediaType.UNKNOWN;
      ((FxRemoteCameraImageEvent)localObject3).setFormat((FxMediaType)localObject4);
      ((FxRemoteCameraImageEvent)localObject3).setParingId(paramLong);
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>();
      l = ((Date)localObject4).getTime();
      ((FxRemoteCameraImageEvent)localObject3).setEventTime(l);
      ((FxRemoteCameraImageEvent)localObject3).setFilePath((String)localObject5);
    }
  }
  
  private com.vvt.eventrepository.eventresult.d a(com.vvt.eventrepository.querycriteria.b paramb, List paramList)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = paramb.a();
    if (i > 0)
    {
      int k = 200;
      if (i <= k) {}
    }
    else
    {
      i = 100;
    }
    int m = a;
    if (m != 0) {}
    QueryOrder localQueryOrder = paramb.b();
    l locall = new com/vvt/eventrepository/a/l;
    localObject1 = this.d.a();
    locall.<init>((SQLiteDatabase)localObject1);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        Iterator localIterator = paramList.iterator();
        m = i;
        boolean bool2 = localIterator.hasNext();
        if (bool2)
        {
          localObject2 = localIterator.next();
          localObject2 = (FxEventType)localObject2;
          localObject2 = locall.a((FxEventType)localObject2);
          localObject2 = ((o)localObject2).a(localQueryOrder, m);
          localArrayList.addAll((Collection)localObject2);
          j = ((List)localObject2).size();
          j = m - j;
          if (j > 0) {
            continue;
          }
        }
      }
      catch (FxDbCorruptException localFxDbCorruptException)
      {
        Object localObject2;
        int j;
        boolean bool3;
        localObject1 = this.f;
        if (localObject1 == null) {
          continue;
        }
        Object localObject3 = this.f;
        ((e)localObject3).a();
        continue;
        localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
        localObject3 = ((FxDbCorruptException)localObject3).getMessage();
        ((FxDbOperationException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
      localObject2 = new com/vvt/eventrepository/eventresult/d;
      ((com.vvt.eventrepository.eventresult.d)localObject2).<init>();
      ((com.vvt.eventrepository.eventresult.d)localObject2).a(localArrayList);
      bool3 = a;
      if (bool3) {}
      return (com.vvt.eventrepository.eventresult.d)localObject2;
      bool3 = j;
    }
  }
  
  private FxAudioFileEvent b(String paramString, long paramLong)
  {
    try
    {
      boolean bool = a;
      if (bool) {}
      String str = c(paramString, paramLong);
      FxAudioFileEvent localFxAudioFileEvent = new com/vvt/events/FxAudioFileEvent;
      localFxAudioFileEvent.<init>();
      localFxAudioFileEvent.setEventId(paramLong);
      Object localObject2 = FxMediaType.UNKNOWN;
      localFxAudioFileEvent.setFormat((FxMediaType)localObject2);
      localFxAudioFileEvent.setParingId(paramLong);
      localObject2 = new java/util/Date;
      ((Date)localObject2).<init>();
      long l = ((Date)localObject2).getTime();
      localFxAudioFileEvent.setEventTime(l);
      localFxAudioFileEvent.setFilePath(str);
      bool = a;
      if (bool) {}
      return localFxAudioFileEvent;
    }
    finally {}
  }
  
  private String c(String paramString, long paramLong)
  {
    String str1 = "media_dummy";
    for (;;)
    {
      try
      {
        str1 = p.a(paramString, str1);
        Object localObject2 = new java/io/File;
        ((File)localObject2).<init>(str1);
        boolean bool1 = ((File)localObject2).exists();
        if (!bool1) {
          ((File)localObject2).mkdir();
        }
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        String str2 = "dummy_";
        localObject2 = ((StringBuilder)localObject2).append(str2);
        localObject2 = ((StringBuilder)localObject2).append(paramLong);
        localObject2 = ((StringBuilder)localObject2).toString();
        str1 = p.a(str1, (String)localObject2);
        localObject2 = new java/io/File;
        ((File)localObject2).<init>(str1);
        bool2 = ((File)localObject2).createNewFile();
        if (!bool2) {
          continue;
        }
        bool2 = b;
        if (!bool2) {}
      }
      catch (IOException localIOException)
      {
        Object localObject1 = null;
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      return str1;
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public long a(FxEvent paramFxEvent)
  {
    try
    {
      boolean bool = a;
      if (bool) {}
      long l = -1;
      Object localObject1 = new com/vvt/eventrepository/a/l;
      Object localObject3 = this.d;
      localObject3 = ((com.vvt.eventrepository.b.c)localObject3).a();
      ((l)localObject1).<init>((SQLiteDatabase)localObject3);
      for (;;)
      {
        try
        {
          localObject3 = paramFxEvent.getEventType();
          localObject1 = ((l)localObject1).a((FxEventType)localObject3);
          l = ((o)localObject1).a(paramFxEvent);
          bool = b;
          if (bool) {}
          bool = a;
          if (bool) {}
          return l;
        }
        catch (FxDbCorruptException localFxDbCorruptException)
        {
          localObject3 = this.f;
          if (localObject3 == null) {
            break;
          }
        }
        e locale = this.f;
        locale.a();
      }
      localFxDbOperationException = new com/vvt/exceptions/database/FxDbOperationException;
    }
    finally {}
    FxDbOperationException localFxDbOperationException;
    String str = ((FxDbCorruptException)localObject2).getMessage();
    localFxDbOperationException.<init>(str);
    throw localFxDbOperationException;
  }
  
  public FxEvent a(long paramLong)
  {
    for (;;)
    {
      Object localObject4;
      boolean bool2;
      try
      {
        bool1 = a;
        if (bool1) {}
        bool1 = b;
        if (bool1) {}
        localObject1 = null;
        Object localObject2 = new com/vvt/eventrepository/a/l;
        localObject4 = this.d;
        localObject4 = ((com.vvt.eventrepository.b.c)localObject4).a();
        ((l)localObject2).<init>((SQLiteDatabase)localObject4);
        localObject4 = FxEventType.ACTUAL_MEDIA_DAO;
        localObject2 = ((l)localObject2).a((FxEventType)localObject4);
        localObject2 = (com.vvt.eventrepository.a.a)localObject2;
        bool2 = true;
        try
        {
          localObject1 = ((com.vvt.eventrepository.a.a)localObject2).a(paramLong, bool2);
          if (localObject1 != null) {
            continue;
          }
          bool1 = c;
          if (!bool1) {}
        }
        catch (FxDbIdNotFoundException localFxDbIdNotFoundException)
        {
          bool1 = c;
          if (!bool1) {
            continue;
          }
          String str1 = this.g;
          localObject1 = b(str1, paramLong);
          continue;
        }
        catch (FxFileNotFoundException localFxFileNotFoundException)
        {
          bool1 = a;
          if (!bool1) {
            continue;
          }
          String str2 = this.g;
          localObject1 = a(str2, paramLong);
          continue;
        }
        catch (FxDbCorruptException localFxDbCorruptException)
        {
          bool2 = c;
          if (!bool2) {
            continue;
          }
          localObject4 = this.f;
          if (localObject4 == null) {
            break;
          }
        }
        bool1 = a;
        if (bool1) {}
        return (FxEvent)localObject1;
      }
      finally {}
      boolean bool1 = a;
      if (bool1)
      {
        continue;
        e locale = this.f;
        locale.a();
      }
    }
    Object localObject1 = new com/vvt/exceptions/database/FxDbOperationException;
    String str3 = ((FxDbCorruptException)localObject3).getMessage();
    ((FxDbOperationException)localObject1).<init>(str3);
    throw ((Throwable)localObject1);
  }
  
  /* Error */
  public com.vvt.eventrepository.eventresult.b a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   5: istore_1
    //   6: iload_1
    //   7: ifeq +3 -> 10
    //   10: new 287	com/vvt/eventrepository/eventresult/removeFromPath
    //   13: astore_2
    //   14: aload_2
    //   15: invokespecial 288	com/vvt/eventrepository/eventresult/removeFromPath:<init>	()V
    //   18: new 290	com/vvt/eventrepository/a/q
    //   21: astore_3
    //   22: aload_0
    //   23: getfield 43	com/vvt/eventrepository/MyUncaughtExceptionHandler:d	Lcom/vvt/eventrepository/removeFromPath/MyUncaughtExceptionHandler;
    //   26: astore 4
    //   28: aload 4
    //   30: invokevirtual 53	com/vvt/eventrepository/removeFromPath/MyUncaughtExceptionHandler:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   33: astore 4
    //   35: aload_3
    //   36: aload 4
    //   38: invokespecial 291	com/vvt/eventrepository/a/q:<init>	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   41: new 293	com/vvt/eventrepository/eventresult/a
    //   44: astore 4
    //   46: aload 4
    //   48: invokespecial 294	com/vvt/eventrepository/eventresult/a:<init>	()V
    //   51: invokestatic 298	com/vvt/base/FxEventType:values	()[Lcom/vvt/base/FxEventType;
    //   54: astore 5
    //   56: aload 5
    //   58: arraylength
    //   59: istore 6
    //   61: iconst_0
    //   62: istore_1
    //   63: aconst_null
    //   64: astore 4
    //   66: iload_1
    //   67: iload 6
    //   69: if_icmpge +66 -> 135
    //   72: aload 5
    //   74: iload_1
    //   75: aaload
    //   76: astore 7
    //   78: aload_3
    //   79: aload 7
    //   81: invokevirtual 301	com/vvt/eventrepository/a/q:a	(Lcom/vvt/base/FxEventType;)Lcom/vvt/eventrepository/eventresult/a;
    //   84: astore 8
    //   86: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   89: istore 9
    //   91: iload 9
    //   93: ifeq +3 -> 96
    //   96: aload_2
    //   97: aload 7
    //   99: aload 8
    //   101: invokevirtual 304	com/vvt/eventrepository/eventresult/removeFromPath:a	(Lcom/vvt/base/FxEventType;Lcom/vvt/eventrepository/eventresult/a;)V
    //   104: iload_1
    //   105: iconst_1
    //   106: iadd
    //   107: istore_1
    //   108: goto -42 -> 66
    //   111: astore 4
    //   113: aload_0
    //   114: getfield 213	com/vvt/eventrepository/MyUncaughtExceptionHandler:f	Lcom/vvt/eventrepository/e;
    //   117: astore_3
    //   118: aload_3
    //   119: ifnull +28 -> 147
    //   122: aload_0
    //   123: getfield 213	com/vvt/eventrepository/MyUncaughtExceptionHandler:f	Lcom/vvt/eventrepository/e;
    //   126: astore 4
    //   128: aload 4
    //   130: invokeinterface 217 1 0
    //   135: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   138: istore_1
    //   139: iload_1
    //   140: ifeq +3 -> 143
    //   143: aload_0
    //   144: monitorexit
    //   145: aload_2
    //   146: areturn
    //   147: new 219	com/vvt/exceptions/database/FxDbOperationException
    //   150: astore_2
    //   151: aload 4
    //   153: invokevirtual 225	com/vvt/exceptions/database/FxDbCorruptException:getMessage	()Ljava/lang/String;
    //   156: astore 4
    //   158: aload_2
    //   159: aload 4
    //   161: invokespecial 226	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;)V
    //   164: aload_2
    //   165: athrow
    //   166: astore 4
    //   168: aload_0
    //   169: monitorexit
    //   170: aload 4
    //   172: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	173	0	this	MyUncaughtExceptionHandler
    //   5	102	1	i	int
    //   107	1	1	j	int
    //   138	2	1	bool1	boolean
    //   13	152	2	localObject1	Object
    //   21	98	3	localObject2	Object
    //   26	39	4	localObject3	Object
    //   111	1	4	localFxDbCorruptException	FxDbCorruptException
    //   126	34	4	localObject4	Object
    //   166	5	4	localObject5	Object
    //   54	19	5	arrayOfFxEventType	FxEventType[]
    //   59	11	6	k	int
    //   76	22	7	localFxEventType	FxEventType
    //   84	16	8	locala	com.vvt.eventrepository.eventresult.a
    //   89	3	9	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   51	54	111	com/vvt/exceptions/database/FxDbCorruptException
    //   56	59	111	com/vvt/exceptions/database/FxDbCorruptException
    //   74	76	111	com/vvt/exceptions/database/FxDbCorruptException
    //   79	84	111	com/vvt/exceptions/database/FxDbCorruptException
    //   86	89	111	com/vvt/exceptions/database/FxDbCorruptException
    //   99	104	111	com/vvt/exceptions/database/FxDbCorruptException
    //   2	5	166	finally
    //   10	13	166	finally
    //   14	18	166	finally
    //   18	21	166	finally
    //   22	26	166	finally
    //   28	33	166	finally
    //   36	41	166	finally
    //   41	44	166	finally
    //   46	51	166	finally
    //   51	54	166	finally
    //   56	59	166	finally
    //   74	76	166	finally
    //   79	84	166	finally
    //   86	89	166	finally
    //   99	104	166	finally
    //   113	117	166	finally
    //   122	126	166	finally
    //   128	135	166	finally
    //   135	138	166	finally
    //   147	150	166	finally
    //   151	156	166	finally
    //   159	164	166	finally
    //   164	166	166	finally
  }
  
  /* Error */
  public com.vvt.eventrepository.eventresult.d a(com.vvt.eventrepository.querycriteria.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_1
    //   11: invokevirtual 307	com/vvt/eventrepository/querycriteria/removeFromPath:MyUncaughtExceptionHandler	()Ljava/util/List;
    //   14: astore_3
    //   15: aload_3
    //   16: invokeinterface 205 1 0
    //   21: istore 4
    //   23: iload 4
    //   25: ifne +34 -> 59
    //   28: aload_0
    //   29: getfield 48	com/vvt/eventrepository/MyUncaughtExceptionHandler:e	Lcom/vvt/eventrepository/querycriteria/a;
    //   32: astore_3
    //   33: aload_3
    //   34: invokevirtual 309	com/vvt/eventrepository/querycriteria/a:a	()Ljava/util/List;
    //   37: astore_3
    //   38: aload_0
    //   39: aload_1
    //   40: aload_3
    //   41: invokespecial 312	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	(Lcom/vvt/eventrepository/querycriteria/removeFromPath;Ljava/util/List;)Lcom/vvt/eventrepository/eventresult/d;
    //   44: astore_3
    //   45: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   48: istore 4
    //   50: iload 4
    //   52: ifeq +3 -> 55
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_3
    //   58: areturn
    //   59: aload_0
    //   60: getfield 48	com/vvt/eventrepository/MyUncaughtExceptionHandler:e	Lcom/vvt/eventrepository/querycriteria/a;
    //   63: astore 5
    //   65: aload 5
    //   67: aload_3
    //   68: invokevirtual 315	com/vvt/eventrepository/querycriteria/a:a	(Ljava/util/List;)Ljava/util/List;
    //   71: astore_3
    //   72: goto -34 -> 38
    //   75: astore_3
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_3
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	MyUncaughtExceptionHandler
    //   0	80	1	paramb	com.vvt.eventrepository.querycriteria.removeFromPath
    //   5	2	2	bool1	boolean
    //   14	58	3	localObject1	Object
    //   75	4	3	localObject2	Object
    //   21	3	4	i	int
    //   48	3	4	bool2	boolean
    //   63	3	5	locala	com.vvt.eventrepository.querycriteria.a
    // Exception table:
    //   from	to	target	type
    //   2	5	75	finally
    //   10	14	75	finally
    //   15	21	75	finally
    //   28	32	75	finally
    //   33	37	75	finally
    //   40	44	75	finally
    //   45	48	75	finally
    //   59	63	75	finally
    //   67	71	75	finally
  }
  
  public void a(long paramLong, boolean paramBoolean)
  {
    Object localObject3;
    try
    {
      boolean bool = a;
      if (bool) {}
      bool = a;
      if (bool) {}
      Object localObject1 = new com/vvt/eventrepository/a/l;
      localObject3 = this.d;
      localObject3 = ((com.vvt.eventrepository.b.c)localObject3).a();
      ((l)localObject1).<init>((SQLiteDatabase)localObject3);
      localObject3 = FxEventType.ACTUAL_MEDIA_DAO;
      localObject1 = ((l)localObject1).a((FxEventType)localObject3);
      localObject1 = (com.vvt.eventrepository.a.a)localObject1;
      for (;;)
      {
        try
        {
          ((com.vvt.eventrepository.a.a)localObject1).b(paramLong, paramBoolean);
          bool = a;
          if (bool) {}
          return;
        }
        catch (FxDbCorruptException localFxDbCorruptException)
        {
          localObject3 = this.f;
          if (localObject3 == null) {
            break;
          }
        }
        e locale = this.f;
        locale.a();
      }
      localObject3 = new com/vvt/exceptions/database/FxDbOperationException;
    }
    finally {}
    String str = ((FxDbCorruptException)localObject2).getMessage();
    ((FxDbOperationException)localObject3).<init>(str);
    throw ((Throwable)localObject3);
  }
  
  public void a(Context paramContext)
  {
    try
    {
      com.vvt.eventrepository.b.c localc = this.d;
      localc.a(paramContext);
      return;
    }
    finally {}
  }
  
  public void a(e parame)
  {
    this.f = parame;
  }
  
  /* Error */
  public void a(com.vvt.eventrepository.eventresult.EventKeys paramEventKeys)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: new 50	com/vvt/eventrepository/a/l
    //   13: astore_3
    //   14: aload_0
    //   15: getfield 43	com/vvt/eventrepository/MyUncaughtExceptionHandler:d	Lcom/vvt/eventrepository/removeFromPath/MyUncaughtExceptionHandler;
    //   18: astore 4
    //   20: aload 4
    //   22: invokevirtual 53	com/vvt/eventrepository/removeFromPath/MyUncaughtExceptionHandler:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   25: astore 4
    //   27: aload_3
    //   28: aload 4
    //   30: invokespecial 56	com/vvt/eventrepository/a/l:<init>	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   33: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   36: istore_2
    //   37: iload_2
    //   38: ifeq +3 -> 41
    //   41: aload_1
    //   42: invokevirtual 327	com/vvt/eventrepository/eventresult/EventKeys:getKeys	()Ljava/util/Set;
    //   45: astore 4
    //   47: aload 4
    //   49: invokeinterface 330 1 0
    //   54: astore 5
    //   56: aload 5
    //   58: invokeinterface 189 1 0
    //   63: istore_2
    //   64: iload_2
    //   65: ifeq +179 -> 244
    //   68: aload 5
    //   70: invokeinterface 193 1 0
    //   75: astore 4
    //   77: aload 4
    //   79: checkcast 58	com/vvt/base/FxEventType
    //   82: astore 4
    //   84: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   87: istore 6
    //   89: iload 6
    //   91: ifeq +3 -> 94
    //   94: aload_1
    //   95: aload 4
    //   97: invokevirtual 334	com/vvt/eventrepository/eventresult/EventKeys:getEventIDs	(Lcom/vvt/base/FxEventType;)Ljava/util/List;
    //   100: astore 7
    //   102: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   105: istore 8
    //   107: iload 8
    //   109: ifeq +3 -> 112
    //   112: aload 7
    //   114: invokeinterface 183 1 0
    //   119: astore 9
    //   121: aload 9
    //   123: invokeinterface 189 1 0
    //   128: istore 6
    //   130: iload 6
    //   132: ifeq -76 -> 56
    //   135: aload 9
    //   137: invokeinterface 193 1 0
    //   142: astore 7
    //   144: aload 7
    //   146: checkcast 336	java/lang/Long
    //   149: astore 7
    //   151: aload 7
    //   153: invokevirtual 339	java/lang/Long:longValue	()J
    //   156: lstore 10
    //   158: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   161: istore 6
    //   163: iload 6
    //   165: ifeq +3 -> 168
    //   168: aload_3
    //   169: aload 4
    //   171: invokevirtual 65	com/vvt/eventrepository/a/l:a	(Lcom/vvt/base/FxEventType;)Lcom/vvt/eventrepository/a/o;
    //   174: astore 7
    //   176: aload 7
    //   178: lload 10
    //   180: invokevirtual 342	com/vvt/eventrepository/a/o:removeFromPath	(J)I
    //   183: pop
    //   184: getstatic 345	com/vvt/base/FxEventType:EVENT_BASE	Lcom/vvt/base/FxEventType;
    //   187: astore 7
    //   189: aload_3
    //   190: aload 7
    //   192: invokevirtual 65	com/vvt/eventrepository/a/l:a	(Lcom/vvt/base/FxEventType;)Lcom/vvt/eventrepository/a/o;
    //   195: astore 7
    //   197: aload 7
    //   199: lload 10
    //   201: invokevirtual 342	com/vvt/eventrepository/a/o:removeFromPath	(J)I
    //   204: pop
    //   205: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   208: istore 6
    //   210: iload 6
    //   212: ifeq -91 -> 121
    //   215: goto -94 -> 121
    //   218: astore 4
    //   220: aload_0
    //   221: getfield 213	com/vvt/eventrepository/MyUncaughtExceptionHandler:f	Lcom/vvt/eventrepository/e;
    //   224: astore 7
    //   226: aload 7
    //   228: ifnull +27 -> 255
    //   231: aload_0
    //   232: getfield 213	com/vvt/eventrepository/MyUncaughtExceptionHandler:f	Lcom/vvt/eventrepository/e;
    //   235: astore 4
    //   237: aload 4
    //   239: invokeinterface 217 1 0
    //   244: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   247: istore_2
    //   248: iload_2
    //   249: ifeq +3 -> 252
    //   252: aload_0
    //   253: monitorexit
    //   254: return
    //   255: new 219	com/vvt/exceptions/database/FxDbOperationException
    //   258: astore 7
    //   260: aload 4
    //   262: invokevirtual 225	com/vvt/exceptions/database/FxDbCorruptException:getMessage	()Ljava/lang/String;
    //   265: astore 4
    //   267: aload 7
    //   269: aload 4
    //   271: invokespecial 226	com/vvt/exceptions/database/FxDbOperationException:<init>	(Ljava/lang/String;)V
    //   274: aload 7
    //   276: athrow
    //   277: astore 4
    //   279: aload_0
    //   280: monitorexit
    //   281: aload 4
    //   283: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	284	0	this	MyUncaughtExceptionHandler
    //   0	284	1	paramEventKeys	com.vvt.eventrepository.eventresult.EventKeys
    //   5	244	2	bool1	boolean
    //   13	177	3	locall	l
    //   18	152	4	localObject1	Object
    //   218	1	4	localFxDbCorruptException	FxDbCorruptException
    //   235	35	4	localObject2	Object
    //   277	5	4	localObject3	Object
    //   54	15	5	localIterator1	Iterator
    //   87	124	6	bool2	boolean
    //   100	175	7	localObject4	Object
    //   105	3	8	bool3	boolean
    //   119	17	9	localIterator2	Iterator
    //   156	44	10	l	long
    // Exception table:
    //   from	to	target	type
    //   41	45	218	com/vvt/exceptions/database/FxDbCorruptException
    //   47	54	218	com/vvt/exceptions/database/FxDbCorruptException
    //   56	63	218	com/vvt/exceptions/database/FxDbCorruptException
    //   68	75	218	com/vvt/exceptions/database/FxDbCorruptException
    //   77	82	218	com/vvt/exceptions/database/FxDbCorruptException
    //   84	87	218	com/vvt/exceptions/database/FxDbCorruptException
    //   95	100	218	com/vvt/exceptions/database/FxDbCorruptException
    //   102	105	218	com/vvt/exceptions/database/FxDbCorruptException
    //   112	119	218	com/vvt/exceptions/database/FxDbCorruptException
    //   121	128	218	com/vvt/exceptions/database/FxDbCorruptException
    //   135	142	218	com/vvt/exceptions/database/FxDbCorruptException
    //   144	149	218	com/vvt/exceptions/database/FxDbCorruptException
    //   151	156	218	com/vvt/exceptions/database/FxDbCorruptException
    //   158	161	218	com/vvt/exceptions/database/FxDbCorruptException
    //   169	174	218	com/vvt/exceptions/database/FxDbCorruptException
    //   178	184	218	com/vvt/exceptions/database/FxDbCorruptException
    //   184	187	218	com/vvt/exceptions/database/FxDbCorruptException
    //   190	195	218	com/vvt/exceptions/database/FxDbCorruptException
    //   199	205	218	com/vvt/exceptions/database/FxDbCorruptException
    //   205	208	218	com/vvt/exceptions/database/FxDbCorruptException
    //   2	5	277	finally
    //   10	13	277	finally
    //   14	18	277	finally
    //   20	25	277	finally
    //   28	33	277	finally
    //   33	36	277	finally
    //   41	45	277	finally
    //   47	54	277	finally
    //   56	63	277	finally
    //   68	75	277	finally
    //   77	82	277	finally
    //   84	87	277	finally
    //   95	100	277	finally
    //   102	105	277	finally
    //   112	119	277	finally
    //   121	128	277	finally
    //   135	142	277	finally
    //   144	149	277	finally
    //   151	156	277	finally
    //   158	161	277	finally
    //   169	174	277	finally
    //   178	184	277	finally
    //   184	187	277	finally
    //   190	195	277	finally
    //   199	205	277	finally
    //   205	208	277	finally
    //   220	224	277	finally
    //   231	235	277	finally
    //   237	244	277	finally
    //   244	247	277	finally
    //   255	258	277	finally
    //   260	265	277	finally
    //   269	274	277	finally
    //   274	277	277	finally
  }
  
  public void a(com.vvt.eventrepository.querycriteria.a parama)
  {
    try
    {
      this.e = parama;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(List paramList)
  {
    boolean bool;
    try
    {
      bool = a;
      if (bool) {}
      Iterator localIterator = paramList.iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject1 = localIterator.next();
        localObject1 = (FxEvent)localObject1;
        a((FxEvent)localObject1);
      }
      bool = a;
    }
    finally {}
    if (bool) {}
  }
  
  /* Error */
  public com.vvt.eventrepository.eventresult.d b(com.vvt.eventrepository.querycriteria.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_1
    //   11: invokevirtual 307	com/vvt/eventrepository/querycriteria/removeFromPath:MyUncaughtExceptionHandler	()Ljava/util/List;
    //   14: astore_3
    //   15: aload_3
    //   16: invokeinterface 205 1 0
    //   21: istore 4
    //   23: iload 4
    //   25: ifne +34 -> 59
    //   28: aload_0
    //   29: getfield 48	com/vvt/eventrepository/MyUncaughtExceptionHandler:e	Lcom/vvt/eventrepository/querycriteria/a;
    //   32: astore_3
    //   33: aload_3
    //   34: invokevirtual 347	com/vvt/eventrepository/querycriteria/a:MyUncaughtExceptionHandler	()Ljava/util/List;
    //   37: astore_3
    //   38: aload_0
    //   39: aload_1
    //   40: aload_3
    //   41: invokespecial 312	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	(Lcom/vvt/eventrepository/querycriteria/removeFromPath;Ljava/util/List;)Lcom/vvt/eventrepository/eventresult/d;
    //   44: astore_3
    //   45: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   48: istore 4
    //   50: iload 4
    //   52: ifeq +3 -> 55
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_3
    //   58: areturn
    //   59: aload_0
    //   60: getfield 48	com/vvt/eventrepository/MyUncaughtExceptionHandler:e	Lcom/vvt/eventrepository/querycriteria/a;
    //   63: astore 5
    //   65: aload 5
    //   67: aload_3
    //   68: invokevirtual 315	com/vvt/eventrepository/querycriteria/a:a	(Ljava/util/List;)Ljava/util/List;
    //   71: astore_3
    //   72: goto -34 -> 38
    //   75: astore_3
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_3
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	MyUncaughtExceptionHandler
    //   0	80	1	paramb	com.vvt.eventrepository.querycriteria.removeFromPath
    //   5	2	2	bool1	boolean
    //   14	58	3	localObject1	Object
    //   75	4	3	localObject2	Object
    //   21	3	4	i	int
    //   48	3	4	bool2	boolean
    //   63	3	5	locala	com.vvt.eventrepository.querycriteria.a
    // Exception table:
    //   from	to	target	type
    //   2	5	75	finally
    //   10	14	75	finally
    //   15	21	75	finally
    //   28	32	75	finally
    //   33	37	75	finally
    //   40	44	75	finally
    //   45	48	75	finally
    //   59	63	75	finally
    //   67	71	75	finally
  }
  
  public void b()
  {
    try
    {
      com.vvt.eventrepository.b.c localc = this.d;
      localc.b();
      return;
    }
    finally {}
  }
  
  public void b(long paramLong)
  {
    bool1 = a;
    if (bool1) {}
    Object localObject1 = new com/vvt/eventrepository/a/l;
    localObject2 = this.d.a();
    ((l)localObject1).<init>((SQLiteDatabase)localObject2);
    localObject2 = FxEventType.ACTUAL_MEDIA_DAO;
    localObject1 = (com.vvt.eventrepository.a.a)((l)localObject1).a((FxEventType)localObject2);
    bool2 = false;
    localObject2 = null;
    for (;;)
    {
      try
      {
        localObject2 = ((com.vvt.eventrepository.a.a)localObject1).a(paramLong, false);
        bool3 = false;
        localFile = null;
        localFxEventType1 = ((FxEvent)localObject2).getEventType();
        localFxEventType2 = FxEventType.AUDIO_CONVERSATION;
        if (localFxEventType1 != localFxEventType2) {
          continue;
        }
        localObject2 = (FxAudioConversationEvent)localObject2;
        localObject2 = ((FxAudioConversationEvent)localObject2).getFilePath();
      }
      catch (FxFileNotFoundException localFxFileNotFoundException)
      {
        boolean bool3;
        File localFile;
        FxEventType localFxEventType1;
        FxEventType localFxEventType2;
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      catch (FxDbCorruptException localFxDbCorruptException)
      {
        e locale = this.f;
        if (locale == null) {
          continue;
        }
        locale = this.f;
        locale.a();
        continue;
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      catch (FxDbOperationException localFxDbOperationException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      catch (FxDbIdNotFoundException localFxDbIdNotFoundException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      catch (FxDatabaseException localFxDatabaseException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
        bool2 = false;
        localObject2 = null;
        continue;
      }
      bool3 = a;
      if ((!bool3) || (localObject2 != null))
      {
        localFile = new java/io/File;
        localFile.<init>((String)localObject2);
        bool2 = localFile.exists();
        if (bool2)
        {
          bool2 = a;
          if (bool2) {}
          localFile.delete();
        }
      }
      ((com.vvt.eventrepository.a.a)localObject1).b(paramLong);
      bool1 = a;
      if (bool1) {}
      return;
      localFxEventType1 = ((FxEvent)localObject2).getEventType();
      localFxEventType2 = FxEventType.AUDIO_AMBIENT;
      if (localFxEventType1 == localFxEventType2)
      {
        localObject2 = (FxAudioAmbientEvent)localObject2;
        localObject2 = ((FxAudioAmbientEvent)localObject2).getFilePath();
      }
      else
      {
        localFxEventType1 = ((FxEvent)localObject2).getEventType();
        localFxEventType2 = FxEventType.REMOTE_CAMERA_IMAGE;
        if (localFxEventType1 != localFxEventType2) {
          continue;
        }
        localObject2 = (FxRemoteCameraImageEvent)localObject2;
        localObject2 = ((FxRemoteCameraImageEvent)localObject2).getFilePath();
      }
    }
  }
  
  public void b(Context paramContext)
  {
    try
    {
      com.vvt.eventrepository.b.c localc = this.d;
      localc.b(paramContext);
      return;
    }
    finally {}
  }
  
  /* Error */
  public com.vvt.eventrepository.eventresult.d c(com.vvt.eventrepository.querycriteria.b paramb)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: aload_1
    //   11: invokevirtual 307	com/vvt/eventrepository/querycriteria/removeFromPath:MyUncaughtExceptionHandler	()Ljava/util/List;
    //   14: astore_3
    //   15: aload_3
    //   16: invokeinterface 205 1 0
    //   21: istore 4
    //   23: iload 4
    //   25: ifne +34 -> 59
    //   28: aload_0
    //   29: getfield 48	com/vvt/eventrepository/MyUncaughtExceptionHandler:e	Lcom/vvt/eventrepository/querycriteria/a;
    //   32: astore_3
    //   33: aload_3
    //   34: invokevirtual 374	com/vvt/eventrepository/querycriteria/a:removeFromPath	()Ljava/util/List;
    //   37: astore_3
    //   38: aload_0
    //   39: aload_1
    //   40: aload_3
    //   41: invokespecial 312	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	(Lcom/vvt/eventrepository/querycriteria/removeFromPath;Ljava/util/List;)Lcom/vvt/eventrepository/eventresult/d;
    //   44: astore_3
    //   45: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   48: istore 4
    //   50: iload 4
    //   52: ifeq +3 -> 55
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_3
    //   58: areturn
    //   59: aload_0
    //   60: getfield 48	com/vvt/eventrepository/MyUncaughtExceptionHandler:e	Lcom/vvt/eventrepository/querycriteria/a;
    //   63: astore 5
    //   65: aload 5
    //   67: aload_3
    //   68: invokevirtual 315	com/vvt/eventrepository/querycriteria/a:a	(Ljava/util/List;)Ljava/util/List;
    //   71: astore_3
    //   72: goto -34 -> 38
    //   75: astore_3
    //   76: aload_0
    //   77: monitorexit
    //   78: aload_3
    //   79: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	this	MyUncaughtExceptionHandler
    //   0	80	1	paramb	com.vvt.eventrepository.querycriteria.removeFromPath
    //   5	2	2	bool1	boolean
    //   14	58	3	localObject1	Object
    //   75	4	3	localObject2	Object
    //   21	3	4	i	int
    //   48	3	4	bool2	boolean
    //   63	3	5	locala	com.vvt.eventrepository.querycriteria.a
    // Exception table:
    //   from	to	target	type
    //   2	5	75	finally
    //   10	14	75	finally
    //   15	21	75	finally
    //   28	32	75	finally
    //   33	37	75	finally
    //   40	44	75	finally
    //   45	48	75	finally
    //   59	63	75	finally
    //   67	71	75	finally
  }
  
  public void c()
  {
    try
    {
      l locall = new com/vvt/eventrepository/a/l;
      Object localObject1 = this.d;
      localObject1 = ((com.vvt.eventrepository.b.c)localObject1).a();
      locall.<init>((SQLiteDatabase)localObject1);
      FxEventType[] arrayOfFxEventType = FxEventType.values();
      int i = arrayOfFxEventType.length;
      int j = 0;
      localObject1 = null;
      for (;;)
      {
        if (j >= i) {
          break label84;
        }
        Object localObject3 = arrayOfFxEventType[j];
        try
        {
          localObject3 = locall.a((FxEventType)localObject3);
          ((o)localObject3).a();
        }
        finally
        {
          for (;;)
          {
            boolean bool = c;
            if (!bool) {}
          }
        }
        j += 1;
      }
      label84:
      return;
    }
    finally {}
  }
  
  /* Error */
  public void c(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   13: istore_3
    //   14: iload_3
    //   15: ifeq +3 -> 18
    //   18: new 50	com/vvt/eventrepository/a/l
    //   21: astore 4
    //   23: aload_0
    //   24: getfield 43	com/vvt/eventrepository/MyUncaughtExceptionHandler:d	Lcom/vvt/eventrepository/removeFromPath/MyUncaughtExceptionHandler;
    //   27: astore 5
    //   29: aload 5
    //   31: invokevirtual 53	com/vvt/eventrepository/removeFromPath/MyUncaughtExceptionHandler:a	()Landroid/database/sqlite/SQLiteDatabase;
    //   34: astore 5
    //   36: aload 4
    //   38: aload 5
    //   40: invokespecial 56	com/vvt/eventrepository/a/l:<init>	(Landroid/database/sqlite/SQLiteDatabase;)V
    //   43: getstatic 62	com/vvt/base/FxEventType:ACTUAL_MEDIA_DAO	Lcom/vvt/base/FxEventType;
    //   46: astore 5
    //   48: aload 4
    //   50: aload 5
    //   52: invokevirtual 65	com/vvt/eventrepository/a/l:a	(Lcom/vvt/base/FxEventType;)Lcom/vvt/eventrepository/a/o;
    //   55: astore 4
    //   57: aload 4
    //   59: checkcast 67	com/vvt/eventrepository/a/a
    //   62: astore 4
    //   64: iconst_1
    //   65: istore 6
    //   67: aload 4
    //   69: lload_1
    //   70: iload 6
    //   72: invokevirtual 275	com/vvt/eventrepository/a/a:a	(JZ)Lcom/vvt/base/FxEvent;
    //   75: astore 5
    //   77: aload 5
    //   79: ifnull +74 -> 153
    //   82: aconst_null
    //   83: astore 7
    //   85: aload 5
    //   87: invokevirtual 268	com/vvt/base/FxEvent:getEventType	()Lcom/vvt/base/FxEventType;
    //   90: astore 8
    //   92: getstatic 352	com/vvt/base/FxEventType:AUDIO_CONVERSATION	Lcom/vvt/base/FxEventType;
    //   95: astore 9
    //   97: aload 8
    //   99: aload 9
    //   101: if_acmpne +70 -> 171
    //   104: aload 5
    //   106: checkcast 117	com/vvt/events/FxAudioConversationEvent
    //   109: astore 5
    //   111: aload 5
    //   113: invokevirtual 378	com/vvt/events/FxAudioConversationEvent:getFileName	()Ljava/lang/String;
    //   116: astore 5
    //   118: aload 5
    //   120: ifnull +33 -> 153
    //   123: new 235	java/io/File
    //   126: astore 7
    //   128: aload 7
    //   130: aload 5
    //   132: invokespecial 236	java/io/File:<init>	(Ljava/lang/String;)V
    //   135: aload 7
    //   137: invokevirtual 239	java/io/File:exists	()Z
    //   140: istore 6
    //   142: iload 6
    //   144: ifeq +9 -> 153
    //   147: aload 7
    //   149: invokevirtual 358	java/io/File:delete	()Z
    //   152: pop
    //   153: aload 4
    //   155: lload_1
    //   156: invokevirtual 359	com/vvt/eventrepository/a/a:removeFromPath	(J)I
    //   159: pop
    //   160: getstatic 23	com/vvt/eventrepository/MyUncaughtExceptionHandler:a	Z
    //   163: istore_3
    //   164: iload_3
    //   165: ifeq +3 -> 168
    //   168: aload_0
    //   169: monitorexit
    //   170: return
    //   171: aload 5
    //   173: invokevirtual 268	com/vvt/base/FxEvent:getEventType	()Lcom/vvt/base/FxEventType;
    //   176: astore 8
    //   178: getstatic 381	com/vvt/base/FxEventType:AUDIO_CONVERSATION_THUMBNAIL	Lcom/vvt/base/FxEventType;
    //   181: astore 9
    //   183: aload 8
    //   185: aload 9
    //   187: if_acmpne +20 -> 207
    //   190: aload 5
    //   192: checkcast 383	com/vvt/events/FxAudioConversationThumbnailEvent
    //   195: astore 5
    //   197: aload 5
    //   199: invokevirtual 386	com/vvt/events/FxAudioConversationThumbnailEvent:getActualFullPath	()Ljava/lang/String;
    //   202: astore 5
    //   204: goto -86 -> 118
    //   207: aload 5
    //   209: invokevirtual 268	com/vvt/base/FxEvent:getEventType	()Lcom/vvt/base/FxEventType;
    //   212: astore 8
    //   214: getstatic 389	com/vvt/base/FxEventType:AUDIO_FILE	Lcom/vvt/base/FxEventType;
    //   217: astore 9
    //   219: aload 8
    //   221: aload 9
    //   223: if_acmpne +20 -> 243
    //   226: aload 5
    //   228: checkcast 125	com/vvt/events/FxAudioFileEvent
    //   231: astore 5
    //   233: aload 5
    //   235: invokevirtual 390	com/vvt/events/FxAudioFileEvent:getFileName	()Ljava/lang/String;
    //   238: astore 5
    //   240: goto -122 -> 118
    //   243: aload 5
    //   245: invokevirtual 268	com/vvt/base/FxEvent:getEventType	()Lcom/vvt/base/FxEventType;
    //   248: astore 8
    //   250: getstatic 393	com/vvt/base/FxEventType:AUDIO_FILE_THUMBNAIL	Lcom/vvt/base/FxEventType;
    //   253: astore 9
    //   255: aload 8
    //   257: aload 9
    //   259: if_acmpne +20 -> 279
    //   262: aload 5
    //   264: checkcast 395	com/vvt/events/FxAudioFileThumnailEvent
    //   267: astore 5
    //   269: aload 5
    //   271: invokevirtual 396	com/vvt/events/FxAudioFileThumnailEvent:getActualFullPath	()Ljava/lang/String;
    //   274: astore 5
    //   276: goto -158 -> 118
    //   279: aload 5
    //   281: invokevirtual 268	com/vvt/base/FxEvent:getEventType	()Lcom/vvt/base/FxEventType;
    //   284: astore 8
    //   286: getstatic 399	com/vvt/base/FxEventType:CAMERA_IMAGE	Lcom/vvt/base/FxEventType;
    //   289: astore 9
    //   291: aload 8
    //   293: aload 9
    //   295: if_acmpne +20 -> 315
    //   298: aload 5
    //   300: checkcast 84	com/vvt/events/FxCameraImageEvent
    //   303: astore 5
    //   305: aload 5
    //   307: invokevirtual 400	com/vvt/events/FxCameraImageEvent:getFileName	()Ljava/lang/String;
    //   310: astore 5
    //   312: goto -194 -> 118
    //   315: aload 5
    //   317: invokevirtual 268	com/vvt/base/FxEvent:getEventType	()Lcom/vvt/base/FxEventType;
    //   320: astore 8
    //   322: getstatic 403	com/vvt/base/FxEventType:CAMERA_IMAGE_THUMBNAIL	Lcom/vvt/base/FxEventType;
    //   325: astore 9
    //   327: aload 8
    //   329: aload 9
    //   331: if_acmpne +99 -> 430
    //   334: aload 5
    //   336: checkcast 405	com/vvt/events/FxCameraImageThumbnailEvent
    //   339: astore 5
    //   341: aload 5
    //   343: invokevirtual 406	com/vvt/events/FxCameraImageThumbnailEvent:getActualFullPath	()Ljava/lang/String;
    //   346: astore 5
    //   348: goto -230 -> 118
    //   351: astore 5
    //   353: getstatic 30	com/vvt/eventrepository/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   356: istore 6
    //   358: iload 6
    //   360: ifeq -207 -> 153
    //   363: goto -210 -> 153
    //   366: astore 5
    //   368: aload_0
    //   369: getfield 213	com/vvt/eventrepository/MyUncaughtExceptionHandler:f	Lcom/vvt/eventrepository/e;
    //   372: astore 5
    //   374: aload 5
    //   376: ifnull +26 -> 402
    //   379: aload_0
    //   380: getfield 213	com/vvt/eventrepository/MyUncaughtExceptionHandler:f	Lcom/vvt/eventrepository/e;
    //   383: astore 5
    //   385: aload 5
    //   387: invokeinterface 217 1 0
    //   392: goto -239 -> 153
    //   395: astore 4
    //   397: aload_0
    //   398: monitorexit
    //   399: aload 4
    //   401: athrow
    //   402: getstatic 30	com/vvt/eventrepository/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   405: istore 6
    //   407: iload 6
    //   409: ifeq -256 -> 153
    //   412: goto -259 -> 153
    //   415: astore 5
    //   417: getstatic 30	com/vvt/eventrepository/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	Z
    //   420: istore 6
    //   422: iload 6
    //   424: ifeq -271 -> 153
    //   427: goto -274 -> 153
    //   430: iconst_0
    //   431: istore 6
    //   433: aconst_null
    //   434: astore 5
    //   436: goto -318 -> 118
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	439	0	this	MyUncaughtExceptionHandler
    //   0	439	1	paramLong	long
    //   5	160	3	bool1	boolean
    //   21	133	4	localObject1	Object
    //   395	5	4	localObject2	Object
    //   27	320	5	localObject3	Object
    //   351	1	5	localFxFileNotFoundException	FxFileNotFoundException
    //   366	1	5	localFxDbCorruptException	FxDbCorruptException
    //   372	14	5	locale	e
    //   415	1	5	localFxDbOperationException	FxDbOperationException
    //   434	1	5	localObject4	Object
    //   65	367	6	bool2	boolean
    //   83	65	7	localFile	File
    //   90	238	8	localFxEventType1	FxEventType
    //   95	235	9	localFxEventType2	FxEventType
    // Exception table:
    //   from	to	target	type
    //   70	75	351	com/vvt/io/exception/FxFileNotFoundException
    //   85	90	351	com/vvt/io/exception/FxFileNotFoundException
    //   92	95	351	com/vvt/io/exception/FxFileNotFoundException
    //   104	109	351	com/vvt/io/exception/FxFileNotFoundException
    //   111	116	351	com/vvt/io/exception/FxFileNotFoundException
    //   123	126	351	com/vvt/io/exception/FxFileNotFoundException
    //   130	135	351	com/vvt/io/exception/FxFileNotFoundException
    //   135	140	351	com/vvt/io/exception/FxFileNotFoundException
    //   147	153	351	com/vvt/io/exception/FxFileNotFoundException
    //   171	176	351	com/vvt/io/exception/FxFileNotFoundException
    //   178	181	351	com/vvt/io/exception/FxFileNotFoundException
    //   190	195	351	com/vvt/io/exception/FxFileNotFoundException
    //   197	202	351	com/vvt/io/exception/FxFileNotFoundException
    //   207	212	351	com/vvt/io/exception/FxFileNotFoundException
    //   214	217	351	com/vvt/io/exception/FxFileNotFoundException
    //   226	231	351	com/vvt/io/exception/FxFileNotFoundException
    //   233	238	351	com/vvt/io/exception/FxFileNotFoundException
    //   243	248	351	com/vvt/io/exception/FxFileNotFoundException
    //   250	253	351	com/vvt/io/exception/FxFileNotFoundException
    //   262	267	351	com/vvt/io/exception/FxFileNotFoundException
    //   269	274	351	com/vvt/io/exception/FxFileNotFoundException
    //   279	284	351	com/vvt/io/exception/FxFileNotFoundException
    //   286	289	351	com/vvt/io/exception/FxFileNotFoundException
    //   298	303	351	com/vvt/io/exception/FxFileNotFoundException
    //   305	310	351	com/vvt/io/exception/FxFileNotFoundException
    //   315	320	351	com/vvt/io/exception/FxFileNotFoundException
    //   322	325	351	com/vvt/io/exception/FxFileNotFoundException
    //   334	339	351	com/vvt/io/exception/FxFileNotFoundException
    //   341	346	351	com/vvt/io/exception/FxFileNotFoundException
    //   70	75	366	com/vvt/exceptions/database/FxDbCorruptException
    //   85	90	366	com/vvt/exceptions/database/FxDbCorruptException
    //   92	95	366	com/vvt/exceptions/database/FxDbCorruptException
    //   104	109	366	com/vvt/exceptions/database/FxDbCorruptException
    //   111	116	366	com/vvt/exceptions/database/FxDbCorruptException
    //   123	126	366	com/vvt/exceptions/database/FxDbCorruptException
    //   130	135	366	com/vvt/exceptions/database/FxDbCorruptException
    //   135	140	366	com/vvt/exceptions/database/FxDbCorruptException
    //   147	153	366	com/vvt/exceptions/database/FxDbCorruptException
    //   171	176	366	com/vvt/exceptions/database/FxDbCorruptException
    //   178	181	366	com/vvt/exceptions/database/FxDbCorruptException
    //   190	195	366	com/vvt/exceptions/database/FxDbCorruptException
    //   197	202	366	com/vvt/exceptions/database/FxDbCorruptException
    //   207	212	366	com/vvt/exceptions/database/FxDbCorruptException
    //   214	217	366	com/vvt/exceptions/database/FxDbCorruptException
    //   226	231	366	com/vvt/exceptions/database/FxDbCorruptException
    //   233	238	366	com/vvt/exceptions/database/FxDbCorruptException
    //   243	248	366	com/vvt/exceptions/database/FxDbCorruptException
    //   250	253	366	com/vvt/exceptions/database/FxDbCorruptException
    //   262	267	366	com/vvt/exceptions/database/FxDbCorruptException
    //   269	274	366	com/vvt/exceptions/database/FxDbCorruptException
    //   279	284	366	com/vvt/exceptions/database/FxDbCorruptException
    //   286	289	366	com/vvt/exceptions/database/FxDbCorruptException
    //   298	303	366	com/vvt/exceptions/database/FxDbCorruptException
    //   305	310	366	com/vvt/exceptions/database/FxDbCorruptException
    //   315	320	366	com/vvt/exceptions/database/FxDbCorruptException
    //   322	325	366	com/vvt/exceptions/database/FxDbCorruptException
    //   334	339	366	com/vvt/exceptions/database/FxDbCorruptException
    //   341	346	366	com/vvt/exceptions/database/FxDbCorruptException
    //   2	5	395	finally
    //   10	13	395	finally
    //   18	21	395	finally
    //   23	27	395	finally
    //   29	34	395	finally
    //   38	43	395	finally
    //   43	46	395	finally
    //   50	55	395	finally
    //   57	62	395	finally
    //   70	75	395	finally
    //   85	90	395	finally
    //   92	95	395	finally
    //   104	109	395	finally
    //   111	116	395	finally
    //   123	126	395	finally
    //   130	135	395	finally
    //   135	140	395	finally
    //   147	153	395	finally
    //   155	160	395	finally
    //   160	163	395	finally
    //   171	176	395	finally
    //   178	181	395	finally
    //   190	195	395	finally
    //   197	202	395	finally
    //   207	212	395	finally
    //   214	217	395	finally
    //   226	231	395	finally
    //   233	238	395	finally
    //   243	248	395	finally
    //   250	253	395	finally
    //   262	267	395	finally
    //   269	274	395	finally
    //   279	284	395	finally
    //   286	289	395	finally
    //   298	303	395	finally
    //   305	310	395	finally
    //   315	320	395	finally
    //   322	325	395	finally
    //   334	339	395	finally
    //   341	346	395	finally
    //   353	356	395	finally
    //   368	372	395	finally
    //   379	383	395	finally
    //   385	392	395	finally
    //   402	405	395	finally
    //   417	420	395	finally
    //   70	75	415	com/vvt/exceptions/database/FxDbOperationException
    //   85	90	415	com/vvt/exceptions/database/FxDbOperationException
    //   92	95	415	com/vvt/exceptions/database/FxDbOperationException
    //   104	109	415	com/vvt/exceptions/database/FxDbOperationException
    //   111	116	415	com/vvt/exceptions/database/FxDbOperationException
    //   123	126	415	com/vvt/exceptions/database/FxDbOperationException
    //   130	135	415	com/vvt/exceptions/database/FxDbOperationException
    //   135	140	415	com/vvt/exceptions/database/FxDbOperationException
    //   147	153	415	com/vvt/exceptions/database/FxDbOperationException
    //   171	176	415	com/vvt/exceptions/database/FxDbOperationException
    //   178	181	415	com/vvt/exceptions/database/FxDbOperationException
    //   190	195	415	com/vvt/exceptions/database/FxDbOperationException
    //   197	202	415	com/vvt/exceptions/database/FxDbOperationException
    //   207	212	415	com/vvt/exceptions/database/FxDbOperationException
    //   214	217	415	com/vvt/exceptions/database/FxDbOperationException
    //   226	231	415	com/vvt/exceptions/database/FxDbOperationException
    //   233	238	415	com/vvt/exceptions/database/FxDbOperationException
    //   243	248	415	com/vvt/exceptions/database/FxDbOperationException
    //   250	253	415	com/vvt/exceptions/database/FxDbOperationException
    //   262	267	415	com/vvt/exceptions/database/FxDbOperationException
    //   269	274	415	com/vvt/exceptions/database/FxDbOperationException
    //   279	284	415	com/vvt/exceptions/database/FxDbOperationException
    //   286	289	415	com/vvt/exceptions/database/FxDbOperationException
    //   298	303	415	com/vvt/exceptions/database/FxDbOperationException
    //   305	310	415	com/vvt/exceptions/database/FxDbOperationException
    //   315	320	415	com/vvt/exceptions/database/FxDbOperationException
    //   322	325	415	com/vvt/exceptions/database/FxDbOperationException
    //   334	339	415	com/vvt/exceptions/database/FxDbOperationException
    //   341	346	415	com/vvt/exceptions/database/FxDbOperationException
  }
  
  public int d()
  {
    try
    {
      boolean bool1 = a;
      if (bool1) {}
      q localq = new com/vvt/eventrepository/a/q;
      Object localObject2 = this.d;
      localObject2 = ((com.vvt.eventrepository.b.c)localObject2).a();
      localq.<init>((SQLiteDatabase)localObject2);
      int i = -1;
      for (;;)
      {
        try
        {
          i = localq.a();
          boolean bool2 = a;
          if (bool2) {}
          return i;
        }
        catch (FxDbCorruptException localFxDbCorruptException)
        {
          e locale = this.f;
          if (locale == null) {
            break;
          }
        }
        localObject1 = this.f;
        ((e)localObject1).a();
      }
      localFxDbOperationException = new com/vvt/exceptions/database/FxDbOperationException;
    }
    finally {}
    FxDbOperationException localFxDbOperationException;
    Object localObject1 = ((FxDbCorruptException)localObject1).getMessage();
    localFxDbOperationException.<init>((String)localObject1);
    throw localFxDbOperationException;
  }
  
  public FxEvent d(long paramLong)
  {
    boolean bool1;
    Object localObject4;
    boolean bool3;
    try
    {
      bool1 = a;
      if (bool1) {}
      Object localObject1 = new com/vvt/eventrepository/a/l;
      localObject4 = this.d;
      localObject4 = ((com.vvt.eventrepository.b.c)localObject4).a();
      ((l)localObject1).<init>((SQLiteDatabase)localObject4);
      localObject4 = FxEventType.ACTUAL_MEDIA_DAO;
      localObject1 = ((l)localObject1).a((FxEventType)localObject4);
      localObject1 = (com.vvt.eventrepository.a.a)localObject1;
      boolean bool2 = false;
      localObject4 = null;
      bool3 = true;
      try
      {
        localObject1 = ((com.vvt.eventrepository.a.a)localObject1).a(paramLong, bool3);
      }
      catch (FxDbCorruptException localFxDbCorruptException)
      {
        for (;;)
        {
          bool3 = c;
          if (bool3) {}
          e locale = this.f;
          if (locale == null) {
            break;
          }
          localObject2 = this.f;
          ((e)localObject2).a();
          bool1 = false;
          localObject2 = null;
        }
        localObject4 = new com/vvt/exceptions/database/FxDbOperationException;
        Object localObject2 = ((FxDbCorruptException)localObject2).getMessage();
        ((FxDbOperationException)localObject4).<init>((String)localObject2);
        throw ((Throwable)localObject4);
      }
      bool2 = a;
      if (bool2) {}
      return (FxEvent)localObject1;
    }
    finally {}
  }
  
  public long e()
  {
    try
    {
      com.vvt.eventrepository.b.c localc = this.d;
      long l = localc.c();
      return l;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventrepository/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */