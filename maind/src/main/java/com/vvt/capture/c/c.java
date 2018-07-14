package com.vvt.capture.c;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
import android.os.SystemClock;
import com.vvt.base.RunningMode;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.f;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class c
{
  public static final ArrayList a;
  private static final boolean b;
  private static final boolean c;
  private static final boolean d;
  private static String e;
  private static RunningMode f;
  
  static
  {
    boolean bool1 = true;
    boolean bool2 = com.vvt.ak.a.a;
    if (bool2) {
      bool2 = bool1;
    }
    for (;;)
    {
      b = bool2;
      c = com.vvt.ak.a.d;
      d = com.vvt.ak.a.e;
      ArrayList localArrayList = new java/util/ArrayList;
      String[] arrayOfString = new String[2];
      arrayOfString[0] = "LINE/res/drawable-hdpi/";
      arrayOfString[bool1] = "LINE/res/drawable-hdpi-v4/";
      List localList = Arrays.asList(arrayOfString);
      localArrayList.<init>(localList);
      a = localArrayList;
      e = null;
      f = RunningMode.FULL;
      return;
      bool2 = false;
      localArrayList = null;
    }
  }
  
  private static int a(String paramString, int paramInt)
  {
    int i = 0;
    MessageType localMessageType = null;
    switch (paramInt)
    {
    default: 
      localMessageType = MessageType.none;
      i = localMessageType.getNumber();
    }
    for (;;)
    {
      return i;
      if (paramString != null)
      {
        localMessageType = MessageType.Text;
        i = localMessageType.getNumber();
        continue;
        localMessageType = MessageType.Sticker;
        i = localMessageType.getNumber();
        continue;
        localMessageType = MessageType.Contact;
        i = localMessageType.getNumber();
      }
    }
  }
  
  public static long a(int paramInt)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    long l = a(paramInt, null);
    boolean bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    return l;
  }
  
  /* Error */
  public static long a(int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_2
    //   3: aconst_null
    //   4: astore 4
    //   6: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   9: istore 5
    //   11: iload 5
    //   13: ifeq +3 -> 16
    //   16: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   19: istore 5
    //   21: iload 5
    //   23: ifeq +3 -> 26
    //   26: aload_1
    //   27: ifnull +154 -> 181
    //   30: aload_1
    //   31: invokestatic 85	com/vvt/capture/MyUncaughtExceptionHandler/a/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   34: astore 6
    //   36: iconst_m1
    //   37: istore 7
    //   39: iload_0
    //   40: iload 7
    //   42: if_icmpne +7 -> 49
    //   45: iconst_m1
    //   46: iconst_1
    //   47: iushr
    //   48: istore_0
    //   49: ldc 87
    //   51: astore 8
    //   53: ldc 89
    //   55: astore 9
    //   57: iconst_0
    //   58: istore 10
    //   60: aconst_null
    //   61: astore 11
    //   63: iload_0
    //   64: invokestatic 95	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   67: astore 12
    //   69: aload 6
    //   71: aload 9
    //   73: aconst_null
    //   74: aconst_null
    //   75: aconst_null
    //   76: aconst_null
    //   77: aconst_null
    //   78: aload 8
    //   80: aload 12
    //   82: invokevirtual 101	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   85: astore 11
    //   87: aload 11
    //   89: ifnull +279 -> 368
    //   92: aload 11
    //   94: invokeinterface 107 1 0
    //   99: istore 7
    //   101: iload 7
    //   103: ifeq +98 -> 201
    //   106: ldc 109
    //   108: astore 9
    //   110: aload 11
    //   112: aload 9
    //   114: invokeinterface 113 2 0
    //   119: istore 7
    //   121: aload 11
    //   123: iload 7
    //   125: invokeinterface 117 2 0
    //   130: lstore 13
    //   132: aload 6
    //   134: ifnull +8 -> 142
    //   137: aload 6
    //   139: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   142: aload 11
    //   144: ifnull +10 -> 154
    //   147: aload 11
    //   149: invokeinterface 122 1 0
    //   154: lload 13
    //   156: lstore 15
    //   158: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   161: istore 10
    //   163: iload 10
    //   165: ifeq +3 -> 168
    //   168: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   171: istore 10
    //   173: iload 10
    //   175: ifeq +3 -> 178
    //   178: lload 15
    //   180: lreturn
    //   181: ldc 124
    //   183: astore 6
    //   185: ldc 126
    //   187: astore 9
    //   189: aload 6
    //   191: aload 9
    //   193: invokestatic 129	com/vvt/capture/MyUncaughtExceptionHandler/a/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   196: astore 6
    //   198: goto -162 -> 36
    //   201: lconst_0
    //   202: lstore 13
    //   204: goto -72 -> 132
    //   207: astore 6
    //   209: iconst_0
    //   210: istore 5
    //   212: aconst_null
    //   213: astore 6
    //   215: getstatic 28	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   218: istore 7
    //   220: iload 7
    //   222: ifeq +3 -> 225
    //   225: aload 4
    //   227: ifnull +8 -> 235
    //   230: aload 4
    //   232: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   235: aload 6
    //   237: ifnull +10 -> 247
    //   240: aload 6
    //   242: invokeinterface 122 1 0
    //   247: lload_2
    //   248: lstore 15
    //   250: goto -92 -> 158
    //   253: astore 6
    //   255: iconst_0
    //   256: istore 7
    //   258: aconst_null
    //   259: astore 9
    //   261: aload 9
    //   263: ifnull +8 -> 271
    //   266: aload 9
    //   268: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   271: aload 4
    //   273: ifnull +10 -> 283
    //   276: aload 4
    //   278: invokeinterface 122 1 0
    //   283: aload 6
    //   285: athrow
    //   286: astore 17
    //   288: aload 6
    //   290: astore 9
    //   292: aload 17
    //   294: astore 6
    //   296: goto -35 -> 261
    //   299: astore 9
    //   301: aload 11
    //   303: astore 4
    //   305: aload 9
    //   307: astore 17
    //   309: aload 6
    //   311: astore 9
    //   313: aload 17
    //   315: astore 6
    //   317: goto -56 -> 261
    //   320: astore 17
    //   322: aload 4
    //   324: astore 9
    //   326: aload 6
    //   328: astore 4
    //   330: aload 17
    //   332: astore 6
    //   334: goto -73 -> 261
    //   337: astore 9
    //   339: aconst_null
    //   340: astore 17
    //   342: aload 6
    //   344: astore 4
    //   346: iconst_0
    //   347: istore 5
    //   349: aconst_null
    //   350: astore 6
    //   352: goto -137 -> 215
    //   355: astore 9
    //   357: aload 6
    //   359: astore 4
    //   361: aload 11
    //   363: astore 6
    //   365: goto -150 -> 215
    //   368: lload_2
    //   369: lstore 13
    //   371: goto -239 -> 132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	374	0	paramInt	int
    //   0	374	1	paramString	String
    //   2	367	2	l1	long
    //   4	356	4	localObject1	Object
    //   9	339	5	bool1	boolean
    //   34	163	6	localObject2	Object
    //   207	1	6	localException1	Exception
    //   213	28	6	localObject3	Object
    //   253	36	6	localObject4	Object
    //   294	70	6	localObject5	Object
    //   37	6	7	i	int
    //   99	3	7	bool2	boolean
    //   119	5	7	j	int
    //   218	39	7	bool3	boolean
    //   51	28	8	str1	String
    //   55	236	9	localObject6	Object
    //   299	7	9	localObject7	Object
    //   311	14	9	localObject8	Object
    //   337	1	9	localException2	Exception
    //   355	1	9	localException3	Exception
    //   58	116	10	bool4	boolean
    //   61	301	11	localCursor	Cursor
    //   67	14	12	str2	String
    //   130	240	13	l2	long
    //   156	93	15	l3	long
    //   286	7	17	localObject9	Object
    //   307	7	17	localObject10	Object
    //   320	11	17	localObject11	Object
    //   340	1	17	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   30	34	207	java/lang/Exception
    //   191	196	207	java/lang/Exception
    //   30	34	253	finally
    //   191	196	253	finally
    //   63	67	286	finally
    //   80	85	286	finally
    //   92	99	299	finally
    //   112	119	299	finally
    //   123	130	299	finally
    //   215	218	320	finally
    //   63	67	337	java/lang/Exception
    //   80	85	337	java/lang/Exception
    //   92	99	355	java/lang/Exception
    //   112	119	355	java/lang/Exception
    //   123	130	355	java/lang/Exception
  }
  
  public static com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    int i = 10;
    com.vvt.im.events.info.d locald = new com/vvt/im/events/info/d;
    locald.<init>();
    Object localObject1 = a(paramSQLiteDatabase);
    locald.b((String)localObject1);
    locald.a("owner");
    localObject1 = "/data/data/jp.naver.line.android/files/profile_photo.jpg";
    Object localObject2 = new java/io/File;
    Object localObject3 = "/data/data/jp.naver.line.android/files/profile_photo.jpg";
    ((File)localObject2).<init>((String)localObject3);
    boolean bool1 = ((File)localObject2).exists();
    boolean bool2;
    if (!bool1)
    {
      localObject1 = new java/io/File;
      localObject2 = "/dbdata/databases/jp.naver.line.android/files/profile_photo.jpg";
      ((File)localObject1).<init>((String)localObject2);
      bool2 = ((File)localObject1).exists();
      if (!bool2) {
        break label254;
      }
      localObject1 = "/dbdata/databases/jp.naver.line.android/files/profile_photo.jpg";
      bool1 = b;
      if (!bool1) {}
    }
    bool1 = b;
    if (bool1) {}
    localObject2 = ImType.LINE;
    localObject3 = ImMediaFileType.OWNER_PROFILE;
    localObject2 = com.vvt.im.a.c.a(paramString1, (ImType)localObject2, (ImMediaFileType)localObject3);
    localObject3 = com.vvt.im.a.c.a(ImMediaFileType.OWNER_PROFILE);
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
    localObject4 = File.separator;
    localObject2 = (String)localObject4 + (String)localObject3;
    localObject3 = new java/io/File;
    ((File)localObject3).<init>((String)localObject1);
    boolean bool6 = ((File)localObject3).exists();
    if (bool6) {}
    for (;;)
    {
      try
      {
        localObject3 = f;
        localObject4 = RunningMode.FULL;
        if (localObject3 != localObject4) {
          continue;
        }
        com.vvt.io.d.a((String)localObject1, (String)localObject2);
        bool2 = b;
        if (!bool2) {}
      }
      catch (IOException localIOException)
      {
        int j;
        boolean bool3;
        int k;
        boolean bool4;
        int n;
        String str;
        int m;
        bool5 = d;
        if (!bool5) {
          continue;
        }
        continue;
      }
      catch (KMShell.ShellException localShellException)
      {
        label254:
        boolean bool5 = d;
        if (!bool5) {
          continue;
        }
        continue;
      }
      locald.f((String)localObject2);
      return locald;
      localObject1 = e;
      bool2 = com.vvt.ag.b.a((String)localObject1);
      if (!bool2)
      {
        localObject1 = e;
        j = ((String)localObject1).length();
        if (j >= i) {}
      }
      else
      {
        e = b(paramSQLiteDatabase);
        localObject1 = e;
        bool3 = com.vvt.ag.b.a((String)localObject1);
        if (!bool3)
        {
          localObject1 = e;
          k = ((String)localObject1).length();
          if (k >= i) {}
        }
        else
        {
          localObject1 = l();
          e = (String)localObject1;
        }
      }
      bool4 = b;
      if (bool4) {}
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = c("p");
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("p");
      localObject2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = e;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = ".thumb";
      localObject1 = (String)localObject2;
      break;
      localObject3 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
      i = 7;
      localObject4 = new Object[i];
      n = 0;
      str = a(paramString1);
      localObject4[0] = str;
      n = 1;
      localObject4[n] = localObject1;
      m = 2;
      localObject4[m] = localObject2;
      m = 3;
      localObject4[m] = localObject2;
      m = 4;
      localObject4[m] = paramString2;
      m = 5;
      localObject4[m] = paramString2;
      m = 6;
      localObject4[m] = localObject2;
      localObject1 = String.format((String)localObject3, (Object[])localObject4);
      KMShell.a((String)localObject1);
      bool5 = com.vvt.aa.a.c();
      if (bool5) {
        ShellUtil.k((String)localObject2);
      }
    }
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase)
  {
    localCursor = null;
    String str1 = "owner";
    try
    {
      String str2 = h();
      localCursor = paramSQLiteDatabase.rawQuery(str2, null);
      if (localCursor != null)
      {
        boolean bool1 = localCursor.moveToNext();
        if (bool1)
        {
          str2 = "value";
          int i = localCursor.getColumnIndex(str2);
          str1 = localCursor.getString(i);
        }
      }
      if (localCursor == null) {
        break label65;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label65:
        boolean bool2 = d;
        if ((bool2) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label96;
      }
      localCursor.close();
    }
    localCursor.close();
    return str1;
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic 263	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:k	()Ljava/lang/String;
    //   5: astore_3
    //   6: iconst_1
    //   7: istore 4
    //   9: iload 4
    //   11: anewarray 33	java/lang/String
    //   14: astore 5
    //   16: aload 5
    //   18: iconst_0
    //   19: aload_1
    //   20: aastore
    //   21: aload_0
    //   22: aload_3
    //   23: aload 5
    //   25: invokevirtual 253	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_3
    //   29: aload_3
    //   30: ifnull +40 -> 70
    //   33: aload_3
    //   34: invokeinterface 256 1 0
    //   39: istore 4
    //   41: iload 4
    //   43: ifeq +27 -> 70
    //   46: ldc_w 265
    //   49: astore 5
    //   51: aload_3
    //   52: aload 5
    //   54: invokeinterface 113 2 0
    //   59: istore 4
    //   61: aload_3
    //   62: iload 4
    //   64: invokeinterface 261 2 0
    //   69: astore_2
    //   70: aload_3
    //   71: ifnull +9 -> 80
    //   74: aload_3
    //   75: invokeinterface 122 1 0
    //   80: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   83: istore 6
    //   85: iload 6
    //   87: ifeq +3 -> 90
    //   90: aload_2
    //   91: areturn
    //   92: astore_3
    //   93: iconst_0
    //   94: istore 6
    //   96: aconst_null
    //   97: astore_3
    //   98: getstatic 28	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   101: istore 4
    //   103: iload 4
    //   105: ifeq +3 -> 108
    //   108: aload_3
    //   109: ifnull -29 -> 80
    //   112: goto -38 -> 74
    //   115: astore 7
    //   117: iconst_0
    //   118: istore 6
    //   120: aconst_null
    //   121: astore_3
    //   122: aload 7
    //   124: astore_2
    //   125: aload_3
    //   126: ifnull +9 -> 135
    //   129: aload_3
    //   130: invokeinterface 122 1 0
    //   135: aload_2
    //   136: athrow
    //   137: astore_2
    //   138: goto -13 -> 125
    //   141: astore 5
    //   143: goto -45 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	146	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	146	1	paramString	String
    //   1	135	2	localObject1	Object
    //   137	1	2	localObject2	Object
    //   5	70	3	localObject3	Object
    //   92	1	3	localException1	Exception
    //   97	33	3	localObject4	Object
    //   7	35	4	bool1	boolean
    //   59	4	4	i	int
    //   101	3	4	bool2	boolean
    //   14	39	5	localObject5	Object
    //   141	1	5	localException2	Exception
    //   83	36	6	bool3	boolean
    //   115	8	7	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	92	java/lang/Exception
    //   9	14	92	java/lang/Exception
    //   19	21	92	java/lang/Exception
    //   23	28	92	java/lang/Exception
    //   2	5	115	finally
    //   9	14	115	finally
    //   19	21	115	finally
    //   23	28	115	finally
    //   33	39	137	finally
    //   52	59	137	finally
    //   62	69	137	finally
    //   98	101	137	finally
    //   33	39	141	java/lang/Exception
    //   52	59	141	java/lang/Exception
    //   62	69	141	java/lang/Exception
  }
  
  public static String a(String paramString)
  {
    return p.a(paramString, "busybox");
  }
  
  private static String a(String paramString1, String paramString2)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str = c("p");
    localObject1 = ((StringBuilder)localObject1).append(str);
    str = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str).append("p");
    str = File.separator;
    str = str + paramString2 + ".thumb";
    localObject1 = new java/io/File;
    ((File)localObject1).<init>(str);
    boolean bool = ((File)localObject1).exists();
    Object localObject3;
    if (bool)
    {
      localObject1 = ImType.LINE;
      localObject3 = ImMediaFileType.USER_PROFILE;
      localObject1 = com.vvt.im.a.c.a(paramString1, (ImType)localObject1, (ImMediaFileType)localObject3);
      localObject3 = com.vvt.im.a.c.a(ImMediaFileType.USER_PROFILE);
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject4 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4).append((String)localObject3);
      localObject3 = "-xxx";
    }
    Object localObject2;
    for (localObject1 = (String)localObject3;; localObject2 = null)
    {
      try
      {
        com.vvt.io.d.a(str, (String)localObject1);
        return (String)localObject1;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          bool = d;
          if (bool) {}
          bool = false;
          localObject2 = null;
        }
      }
      bool = false;
    }
  }
  
  private static String a(String paramString1, String paramString2, ImType paramImType, ImMediaFileType paramImMediaFileType, String paramString3)
  {
    boolean bool1 = false;
    String str1 = com.vvt.io.d.h(paramString2);
    boolean bool2 = b;
    if (bool2) {}
    Object localObject1 = new java/io/File;
    ((File)localObject1).<init>(str1);
    bool2 = ((File)localObject1).exists();
    String str2;
    if (bool2)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str2 = com.vvt.im.a.c.a(paramString1, paramImType, paramImMediaFileType);
      localObject1 = ((StringBuilder)localObject1).append(str2);
      str2 = File.separator;
      localObject1 = ((StringBuilder)localObject1).append(str2);
      str2 = com.vvt.im.a.c.a(paramImMediaFileType);
    }
    Object localObject2;
    for (localObject1 = str2;; localObject2 = null)
    {
      try
      {
        com.vvt.io.d.a(str1, (String)localObject1);
        ShellUtil.b(paramString3, (String)localObject1);
        bool1 = b;
        if (!bool1) {}
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          bool2 = d;
          if (bool2) {}
          bool2 = false;
          localObject2 = null;
        }
      }
      return (String)localObject1;
      bool2 = b;
      if (bool2) {}
      bool2 = false;
    }
  }
  
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    Object localObject3 = c("FxFileObserverWorker");
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = File.separator;
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3).append("FxFileObserverWorker");
    localObject3 = File.separator;
    localObject2 = (String)localObject3 + paramString2 + ".thumb";
    localObject3 = new java/io/File;
    ((File)localObject3).<init>((String)localObject2);
    boolean bool = ((File)localObject3).exists();
    if (bool)
    {
      localObject1 = ImType.LINE;
      localObject3 = ImMediaFileType.CONVERSATION_PROFILE;
      localObject1 = a(paramString1, (String)localObject2, (ImType)localObject1, (ImMediaFileType)localObject3, paramString3);
    }
    return (String)localObject1;
  }
  
  public static ArrayList a()
  {
    int i = 2;
    int j = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "jp.naver.line.android";
    String str = String.format("%s/%s/databases", arrayOfObject);
    localArrayList.add(str);
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "jp.naver.line.android";
    str = String.format("%s/%s", arrayOfObject);
    localArrayList.add(str);
    return localArrayList;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString, Cursor paramCursor, com.vvt.base.b paramb)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = paramCursor.moveToLast();
    Object localObject1;
    com.vvt.im.events.info.d locald;
    g localg;
    f localf;
    com.vvt.im.events.info.b localb;
    Object localObject3;
    int i2;
    Object localObject4;
    String str1;
    int i10;
    Object localObject8;
    Object localObject9;
    Object localObject10;
    Object localObject11;
    Object localObject12;
    Object localObject13;
    Object localObject14;
    label200:
    int i;
    long l1;
    long l2;
    long l3;
    boolean bool11;
    if (bool1)
    {
      bool1 = b;
      if (bool1) {}
      localObject1 = paramb.f();
      locald = a(paramSQLiteDatabase, paramString, (String)localObject1);
      localg = new com/vvt/capture/c/g;
      localg.<init>();
      localf = new com/vvt/im/events/info/f;
      localf.<init>();
      localb = new com/vvt/im/events/info/b;
      localb.<init>();
      localObject3 = new com/vvt/im/events/info/c;
      ((com.vvt.im.events.info.c)localObject3).<init>();
      new ArrayList();
      i2 = 0;
      localObject4 = null;
      bool1 = false;
      localObject1 = null;
      str1 = "";
      i10 = paramCursor.getColumnIndex("id");
      localObject8 = paramCursor.getString(i10);
      int i11 = paramCursor.getColumnIndex("content");
      localObject9 = paramCursor.getString(i11);
      i11 = paramCursor.getColumnIndex("from_mid");
      localObject10 = paramCursor.getString(i11);
      if (localObject10 == null)
      {
        localObject11 = ICallLogData.Direction.OUT;
        localObject10 = locald.b();
        localObject12 = null;
        localObject13 = null;
        localObject14 = localObject10;
        i = paramCursor.getColumnIndex("created_time");
        l1 = paramCursor.getLong(i);
        localObject1 = "delivered_time";
        i = paramCursor.getColumnIndex((String)localObject1);
        l2 = paramCursor.getLong(i);
        l3 = 9000000000000L;
        boolean bool12 = l1 < l3;
        if (!bool12) {
          break label2045;
        }
        l1 = 0L;
        bool11 = l2 < l1;
        if (!bool11) {
          break label1157;
        }
        bool11 = b;
        if (!bool11) {
          break label1172;
        }
        l3 = l2;
      }
    }
    for (;;)
    {
      label292:
      localObject1 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject1).<init>("dd/MM/yy HH:mm:ss");
      localObject4 = new java/util/Date;
      ((Date)localObject4).<init>(l3);
      String str2 = ((SimpleDateFormat)localObject1).format((Date)localObject4);
      i = paramCursor.getColumnIndex("chat_id");
      localObject10 = paramCursor.getString(i);
      i = paramCursor.getColumnIndex("chat_type");
      int i12 = paramCursor.getInt(i);
      i = paramCursor.getColumnIndex("attachement_type");
      int i13 = paramCursor.getInt(i);
      i2 = a((String)localObject9, i13);
      i = paramCursor.getColumnIndex("location_name");
      localObject1 = paramCursor.getString(i);
      int i14 = paramCursor.getColumnIndex("location_address");
      Object localObject15 = paramCursor.getString(i14);
      Object localObject16 = "location_latitude";
      int i17 = paramCursor.getColumnIndex((String)localObject16);
      double d1 = paramCursor.getDouble(i17);
      String str3 = "location_longitude";
      int i18 = paramCursor.getColumnIndex(str3);
      double d2 = paramCursor.getDouble(i18);
      int i19;
      if (localObject1 != null)
      {
        localObject4 = new com/vvt/im/events/info/c;
        ((com.vvt.im.events.info.c)localObject4).<init>();
        if (localObject15 != null)
        {
          i19 = ((String)localObject15).length();
          if (i19 > 0)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
            localObject3 = " ";
            localObject1 = (String)localObject3 + (String)localObject15;
          }
        }
        ((com.vvt.im.events.info.c)localObject4).a((String)localObject1);
        double d3 = d1 * 1.0E-6D;
        double d4 = 1.0E-6D;
        d2 *= d4;
        ((com.vvt.im.events.info.c)localObject4).a(d3);
        ((com.vvt.im.events.info.c)localObject4).b(d2);
        i14 = MessageType.ShareLocation.getNumber();
        i = 0;
        localObject1 = null;
        localObject9 = localObject4;
        i17 = 0;
        localObject16 = null;
        int i23 = i14;
      }
      for (;;)
      {
        i = paramCursor.getColumnIndex("parameter");
        localObject1 = paramCursor.getString(i);
        int i3 = b;
        if (i3 != 0) {}
        i3 = b;
        if (i3 != 0) {}
        i3 = 1;
        if (i13 == i3)
        {
          localObject1 = a(paramString, (String)localObject8, (String)localObject10, paramb);
          i3 = ((ArrayList)localObject1).isEmpty();
          if (i3 != 0) {
            break label1963;
          }
          localg.b((List)localObject1);
          i3 = 0;
          localObject4 = null;
          localObject1 = ((com.vvt.im.events.info.a)((ArrayList)localObject1).get(0)).c();
          if (localObject1 != null)
          {
            i17 = 0;
            localObject16 = null;
            localObject1 = MessageType.none;
            i24 = ((MessageType)localObject1).getNumber();
          }
          label756:
          localg.a(i24);
          localg.b(l3);
          localg.b(str2);
          localg.a((String)localObject16);
          localg.a((com.vvt.im.events.info.c)localObject9);
          localg.a((ICallLogData.Direction)localObject11);
          localObject1 = "+private";
          int j = ((String)localObject10).contains((CharSequence)localObject1);
          if (j == 0) {
            break label2017;
          }
          localObject1 = "+private";
          localObject4 = ((String)localObject10).replace((CharSequence)localObject1, "");
          j = 1;
          localObject8 = localObject4;
          i3 = j;
        }
        label1157:
        label1172:
        label1562:
        int i9;
        for (;;)
        {
          localObject11 = a(paramSQLiteDatabase, paramString, (String)localObject8, i12);
          int k = ((ArrayList)localObject11).size();
          i14 = 1;
          if (k > i14)
          {
            k = 1;
            localg.a(k);
          }
          localg.a((List)localObject11);
          localg.a(locald);
          localf.a((String)localObject14);
          localf.b((String)localObject13);
          localf.c((String)localObject12);
          localg.a(localf);
          boolean bool2 = localg.c();
          if (bool2)
          {
            localObject1 = b(paramSQLiteDatabase, (String)localObject8);
            int i15 = com.vvt.ag.b.a((String)localObject1);
            if (i15 == 0) {
              break label1870;
            }
            bool2 = false;
            Object localObject17 = null;
            localObject1 = "";
            i15 = 0;
            localObject15 = null;
            int i16;
            for (;;)
            {
              i19 = ((ArrayList)localObject11).size();
              if (i15 >= i19) {
                break;
              }
              localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              localObject3 = ((StringBuilder)localObject3).append((String)localObject1);
              localObject1 = ((com.vvt.im.events.info.e)((ArrayList)localObject11).get(i15)).c();
              localObject1 = (String)localObject1;
              int i20 = ((ArrayList)localObject11).size() + -1;
              if (i15 < i20)
              {
                localObject3 = new java/lang/StringBuilder;
                ((StringBuilder)localObject3).<init>();
                localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
                localObject3 = ",";
                localObject1 = (String)localObject3;
              }
              i15 += 1;
            }
            localObject11 = ICallLogData.Direction.IN;
            int m = paramCursor.getColumnIndex("sender_name");
            localObject4 = paramCursor.getString(m);
            m = paramCursor.getColumnIndex("status_msg");
            localObject1 = paramCursor.getString(m);
            localObject12 = localObject1;
            localObject13 = localObject4;
            localObject14 = localObject10;
            break label200;
            l2 = System.currentTimeMillis();
            bool11 = b;
            if (bool11) {}
            l3 = l2;
            break label292;
            int i4 = 2;
            if (i13 == i4)
            {
              m = paramCursor.getColumnIndex("attachement_local_uri");
              localObject15 = paramCursor.getString(m);
              localObject1 = paramSQLiteDatabase;
              localObject4 = paramString;
              localObject3 = paramb;
              localObject1 = a(paramSQLiteDatabase, paramString, (String)localObject8, (String)localObject10, (String)localObject15, (ICallLogData.Direction)localObject11, paramb);
              boolean bool6 = ((ArrayList)localObject1).isEmpty();
              if (!bool6)
              {
                localg.b((List)localObject1);
                break label756;
              }
              i24 = MessageType.Text.getNumber();
              localObject1 = ICallLogData.Direction.IN;
              if (localObject11 == localObject1)
              {
                localObject16 = "[You received a video.]";
                break label756;
              }
              localObject16 = "[You sent a video.]";
              break label756;
            }
            int i5 = 14;
            if (i13 == i5)
            {
              localObject1 = a(paramString, (String)localObject8, (String)localObject10, (String)localObject1, paramb);
              boolean bool7 = ((ArrayList)localObject1).isEmpty();
              if (bool7) {
                break label1963;
              }
              localg.b((List)localObject1);
              break label756;
            }
            int i6 = 3;
            if (i13 == i6)
            {
              localObject1 = b(paramString, (String)localObject8, (String)localObject10, paramb);
              boolean bool8 = ((ArrayList)localObject1).isEmpty();
              if (bool8) {
                break label1963;
              }
              localg.b((List)localObject1);
              break label756;
            }
            localObject4 = MessageType.Contact;
            int i7 = ((MessageType)localObject4).getNumber();
            if (i24 == i7)
            {
              localObject4 = "\\t";
              localObject8 = ((String)localObject1).split((String)localObject4);
              i16 = localObject8.length;
              m = 2;
              if (i16 <= m) {
                break label756;
              }
              m = 0;
              localObject1 = null;
              i7 = 0;
              localObject4 = null;
              for (;;)
              {
                if (i7 >= i16) {
                  break label1562;
                }
                localObject1 = localObject8[i7];
                localObject3 = "displayName";
                boolean bool3 = ((String)localObject1).equals(localObject3);
                if (bool3)
                {
                  localObject1 = "";
                  i7 += 1;
                  try
                  {
                    localObject1 = localObject8[i7];
                  }
                  catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
                  {
                    for (;;)
                    {
                      bool9 = d;
                      if (!bool9) {}
                    }
                  }
                  localObject4 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject4).<init>();
                  localObject8 = "Name:";
                  localObject4 = ((StringBuilder)localObject4).append((String)localObject8);
                  localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
                  localObject16 = ((StringBuilder)localObject1).toString();
                  break;
                }
                n = bool9 + true;
                boolean bool9 = n;
              }
              break label756;
            }
            Object localObject5 = MessageType.Sticker;
            int i8 = ((MessageType)localObject5).getNumber();
            if (i24 != i8) {
              break label756;
            }
            localObject5 = "\\t";
            localObject15 = ((String)localObject1).split((String)localObject5);
            int n = 0;
            localObject1 = null;
            i10 = 0;
            localObject8 = null;
            for (;;)
            {
              try
              {
                i8 = localObject15.length;
                i21 = 9;
                if (i8 > i21)
                {
                  i8 = 0;
                  localObject5 = null;
                }
              }
              catch (Exception localException2)
              {
                int i21;
                boolean bool10;
                i9 = 0;
                localObject6 = null;
              }
              try
              {
                i21 = localObject15.length;
                if (i8 < i21)
                {
                  localObject3 = localObject15[i8];
                  String str4 = "stickerPackageId";
                  boolean bool13 = ((String)localObject3).equals(str4);
                  if (bool13)
                  {
                    int i22 = i8 + 1;
                    localObject1 = localObject15[i22];
                  }
                  i8 += 1;
                  continue;
                }
                i8 = 3;
                localObject17 = localObject15[i8];
                localObject5 = localObject1;
                localObject1 = localObject17;
                localObject8 = paramb.f();
                localObject1 = a(paramString, (String)localObject5, (String)localObject1, (String)localObject8);
                localg.b((List)localObject1);
              }
              catch (Exception localException3)
              {
                for (;;)
                {
                  localObject7 = localObject1;
                }
              }
              i8 = 0;
              localObject5 = null;
              localObject5 = localObject15[0];
              localObject3 = "stickerId";
              bool10 = ((String)localObject5).startsWith((String)localObject3);
              if (bool10)
              {
                i9 = 5;
                localObject5 = localObject15[i9];
                n = 1;
              }
              try
              {
                localObject1 = localObject15[n];
              }
              catch (Exception localException1)
              {
                for (;;)
                {
                  Object localObject6;
                  boolean bool4;
                  int i1;
                  boolean bool5;
                  continue;
                  localObject10 = localObject8;
                  continue;
                  Object localObject2 = str1;
                }
              }
              i9 = 3;
              localObject5 = localObject15[i9];
              n = 5;
              localObject1 = localObject15[n];
              continue;
              bool4 = d;
              if (bool4) {}
              bool4 = false;
              localObject1 = null;
            }
          }
          i1 = ((ArrayList)localObject11).size();
          if (i1 > 0)
          {
            i1 = 0;
            localObject1 = ((com.vvt.im.events.info.e)((ArrayList)localObject11).get(0)).c();
            label1870:
            if (i9 != 0)
            {
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>();
              localObject8 = "Hidden Chat:";
              localObject6 = ((StringBuilder)localObject6).append((String)localObject8);
              localObject1 = (String)localObject1;
              localObject6 = paramb.f();
              localObject6 = a(paramString, (String)localObject10, (String)localObject6);
              localb.a((String)localObject10);
              localb.b((String)localObject1);
              localb.c((String)localObject6);
              localg.a(localb);
              localArrayList.add(localg);
              label1963:
              bool5 = paramCursor.moveToPrevious();
              if (bool5) {
                break;
              }
              bool5 = b;
              if (bool5) {}
              return localArrayList;
            }
          }
          label2017:
          i9 = 0;
          Object localObject7 = null;
          localObject8 = localObject10;
        }
        localObject16 = localObject9;
        int i24 = i9;
        localObject9 = localObject3;
      }
      label2045:
      l3 = l1;
    }
  }
  
  /* Error */
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, int paramInt)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: new 30	java/util/ArrayList
    //   6: astore 5
    //   8: aload 5
    //   10: invokespecial 290	java/util/ArrayList:<init>	()V
    //   13: aconst_null
    //   14: astore 6
    //   16: iload_3
    //   17: iload 4
    //   19: if_icmpne +206 -> 225
    //   22: invokestatic 536	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:e	()Ljava/lang/String;
    //   25: astore 7
    //   27: iconst_1
    //   28: istore 8
    //   30: iload 8
    //   32: anewarray 33	java/lang/String
    //   35: astore 9
    //   37: iconst_0
    //   38: istore 10
    //   40: aconst_null
    //   41: astore 11
    //   43: aload 9
    //   45: iconst_0
    //   46: aload_2
    //   47: aastore
    //   48: aload_0
    //   49: aload 7
    //   51: aload 9
    //   53: invokevirtual 253	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   56: astore 6
    //   58: aload 6
    //   60: ifnull +312 -> 372
    //   63: aload 6
    //   65: invokeinterface 256 1 0
    //   70: istore 4
    //   72: iload 4
    //   74: ifeq +298 -> 372
    //   77: ldc_w 538
    //   80: astore 7
    //   82: aload 6
    //   84: aload 7
    //   86: invokeinterface 113 2 0
    //   91: istore 4
    //   93: aload 6
    //   95: iload 4
    //   97: invokeinterface 261 2 0
    //   102: astore 7
    //   104: ldc_w 540
    //   107: astore 9
    //   109: aload 6
    //   111: aload 9
    //   113: invokeinterface 113 2 0
    //   118: istore 8
    //   120: aload 6
    //   122: iload 8
    //   124: invokeinterface 261 2 0
    //   129: astore 9
    //   131: ldc_w 475
    //   134: astore 11
    //   136: aload 6
    //   138: aload 11
    //   140: invokeinterface 113 2 0
    //   145: istore 10
    //   147: aload 6
    //   149: iload 10
    //   151: invokeinterface 261 2 0
    //   156: astore 11
    //   158: new 465	com/vvt/im/events/info/e
    //   161: astore 12
    //   163: aload 12
    //   165: invokespecial 541	com/vvt/im/events/info/e:<init>	()V
    //   168: aload 12
    //   170: aload 7
    //   172: invokevirtual 543	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   175: aload 12
    //   177: aload 9
    //   179: invokevirtual 544	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   182: aload 12
    //   184: aload 11
    //   186: invokevirtual 546	com/vvt/im/events/info/e:e	(Ljava/lang/String;)V
    //   189: aload_1
    //   190: aload 7
    //   192: invokestatic 547	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   195: astore 7
    //   197: aload 12
    //   199: aload 7
    //   201: invokevirtual 548	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   204: aload 5
    //   206: aload 12
    //   208: invokevirtual 298	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   211: pop
    //   212: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   215: istore 4
    //   217: iload 4
    //   219: ifeq -156 -> 63
    //   222: goto -159 -> 63
    //   225: iconst_2
    //   226: istore 4
    //   228: iload_3
    //   229: iload 4
    //   231: if_icmpne +42 -> 273
    //   234: invokestatic 549	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:f	()Ljava/lang/String;
    //   237: astore 7
    //   239: iconst_1
    //   240: istore 8
    //   242: iload 8
    //   244: anewarray 33	java/lang/String
    //   247: astore 9
    //   249: iconst_0
    //   250: istore 10
    //   252: aconst_null
    //   253: astore 11
    //   255: aload 9
    //   257: iconst_0
    //   258: aload_2
    //   259: aastore
    //   260: aload_0
    //   261: aload 7
    //   263: aload 9
    //   265: invokevirtual 253	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   268: astore 6
    //   270: goto -212 -> 58
    //   273: iconst_3
    //   274: istore 4
    //   276: iload_3
    //   277: iload 4
    //   279: if_icmpne -221 -> 58
    //   282: invokestatic 551	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:FxFileObserverWorker	()Ljava/lang/String;
    //   285: astore 7
    //   287: iconst_1
    //   288: istore 8
    //   290: iload 8
    //   292: anewarray 33	java/lang/String
    //   295: astore 9
    //   297: iconst_0
    //   298: istore 10
    //   300: aconst_null
    //   301: astore 11
    //   303: aload 9
    //   305: iconst_0
    //   306: aload_2
    //   307: aastore
    //   308: aload_0
    //   309: aload 7
    //   311: aload 9
    //   313: invokevirtual 253	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   316: astore 6
    //   318: goto -260 -> 58
    //   321: astore 7
    //   323: getstatic 28	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   326: istore 4
    //   328: iload 4
    //   330: ifeq +3 -> 333
    //   333: aload 6
    //   335: ifnull +10 -> 345
    //   338: aload 6
    //   340: invokeinterface 122 1 0
    //   345: aload 5
    //   347: areturn
    //   348: astore 13
    //   350: aconst_null
    //   351: astore 5
    //   353: aload 13
    //   355: astore 6
    //   357: aload 5
    //   359: ifnull +10 -> 369
    //   362: aload 5
    //   364: invokeinterface 122 1 0
    //   369: aload 6
    //   371: athrow
    //   372: aload 6
    //   374: ifnull -29 -> 345
    //   377: goto -39 -> 338
    //   380: astore 13
    //   382: aload 6
    //   384: astore 5
    //   386: aload 13
    //   388: astore 6
    //   390: goto -33 -> 357
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	393	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	393	1	paramString1	String
    //   0	393	2	paramString2	String
    //   0	393	3	paramInt	int
    //   1	19	4	i	int
    //   70	3	4	bool1	boolean
    //   91	5	4	j	int
    //   215	3	4	bool2	boolean
    //   226	54	4	k	int
    //   326	3	4	bool3	boolean
    //   6	379	5	localObject1	Object
    //   14	375	6	localObject2	Object
    //   25	285	7	str1	String
    //   321	1	7	localException	Exception
    //   28	263	8	m	int
    //   35	277	9	localObject3	Object
    //   38	261	10	n	int
    //   41	261	11	str2	String
    //   161	46	12	locale	com.vvt.im.events.info.e
    //   348	6	13	localObject4	Object
    //   380	7	13	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   22	25	321	java/lang/Exception
    //   30	35	321	java/lang/Exception
    //   46	48	321	java/lang/Exception
    //   51	56	321	java/lang/Exception
    //   63	70	321	java/lang/Exception
    //   84	91	321	java/lang/Exception
    //   95	102	321	java/lang/Exception
    //   111	118	321	java/lang/Exception
    //   122	129	321	java/lang/Exception
    //   138	145	321	java/lang/Exception
    //   149	156	321	java/lang/Exception
    //   158	161	321	java/lang/Exception
    //   163	168	321	java/lang/Exception
    //   170	175	321	java/lang/Exception
    //   177	182	321	java/lang/Exception
    //   184	189	321	java/lang/Exception
    //   190	195	321	java/lang/Exception
    //   199	204	321	java/lang/Exception
    //   206	212	321	java/lang/Exception
    //   212	215	321	java/lang/Exception
    //   234	237	321	java/lang/Exception
    //   242	247	321	java/lang/Exception
    //   258	260	321	java/lang/Exception
    //   263	268	321	java/lang/Exception
    //   282	285	321	java/lang/Exception
    //   290	295	321	java/lang/Exception
    //   306	308	321	java/lang/Exception
    //   311	316	321	java/lang/Exception
    //   22	25	348	finally
    //   30	35	348	finally
    //   46	48	348	finally
    //   51	56	348	finally
    //   234	237	348	finally
    //   242	247	348	finally
    //   258	260	348	finally
    //   263	268	348	finally
    //   282	285	348	finally
    //   290	295	348	finally
    //   306	308	348	finally
    //   311	316	348	finally
    //   63	70	380	finally
    //   84	91	380	finally
    //   95	102	380	finally
    //   111	118	380	finally
    //   122	129	380	finally
    //   138	145	380	finally
    //   149	156	380	finally
    //   158	161	380	finally
    //   163	168	380	finally
    //   170	175	380	finally
    //   177	182	380	finally
    //   184	189	380	finally
    //   190	195	380	finally
    //   199	204	380	finally
    //   206	212	380	finally
    //   212	215	380	finally
    //   323	326	380	finally
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, String paramString4, ICallLogData.Direction paramDirection, com.vvt.base.b paramb)
  {
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    long l1 = 10000L;
    SystemClock.sleep(l1);
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = c("mo");
    localObject1 = ((StringBuilder)localObject1).append(str1);
    str1 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str1).append("mo");
    str1 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str1).append(paramString3);
    str1 = File.separator;
    str1 = str1 + paramString2 + ".thumb";
    bool1 = false;
    localObject1 = null;
    int j = 0;
    Object localObject2 = null;
    int k = 6;
    long l2;
    Object localObject3;
    Object localObject4;
    if (j < k)
    {
      l2 = 10000L;
      SystemClock.sleep(l2);
      localObject1 = ImType.LINE;
      localObject3 = ImMediaFileType.ATTACHMENT;
      localObject4 = paramb.f();
      localObject1 = a(paramString1, str1, (ImType)localObject1, (ImMediaFileType)localObject3, (String)localObject4);
      if (localObject1 == null) {}
    }
    else
    {
      localObject2 = "video/mp4";
      locala.b((String)localObject2);
      locala.d((String)localObject1);
      bool1 = b;
      if (bool1) {}
      localObject1 = ICallLogData.Direction.IN;
      if ((paramDirection == localObject1) && (paramString4 == null))
      {
        l1 = 60000L;
        SystemClock.sleep(l1);
        paramString4 = a(paramSQLiteDatabase, paramString2);
      }
      if (paramString4 != null)
      {
        int i = paramString4.length();
        if (i > 0)
        {
          i = paramString4.lastIndexOf('/') + 1;
          localObject1 = paramString4.substring(i);
          localObject2 = f;
          localObject2 = com.vvt.capture.c.a.a.d.a(com.vvt.capture.c.a.a.d.a(paramString1, (RunningMode)localObject2), (String)localObject1);
          boolean bool3 = b;
          if (bool3) {}
          bool3 = com.vvt.ag.b.a((String)localObject2);
          if (bool3) {
            break label526;
          }
          str1 = com.vvt.io.d.h((String)localObject2);
          localObject3 = new java/io/File;
          ((File)localObject3).<init>(str1);
          l2 = ((File)localObject3).length();
          bool3 = a(2, paramb, l2);
          if (bool3)
          {
            str1 = b(paramString1, (String)localObject2);
            localObject3 = ImType.LINE;
            localObject4 = ImMediaFileType.ATTACHMENT;
            String str2 = paramb.f();
            localObject2 = a(paramString1, (String)localObject2, (ImType)localObject3, (ImMediaFileType)localObject4, str2);
            locala.c((String)localObject2);
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
            localObject2 = ".mp4";
            localObject1 = (String)localObject2;
            locala.a((String)localObject1);
            locala.d(str1);
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = locala.c();
      boolean bool2 = com.vvt.ag.b.a((String)localObject1);
      if (!bool2) {
        localArrayList.add(locala);
      }
      bool2 = b;
      if (bool2) {}
      return localArrayList;
      j += 1;
      break;
      label526:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2, com.vvt.base.b paramb)
  {
    return a(paramString, null, paramLong1, paramLong2, paramb);
  }
  
  /* Error */
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: aconst_null
    //   4: astore 8
    //   6: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   9: istore 9
    //   11: iload 9
    //   13: ifeq +3 -> 16
    //   16: new 30	java/util/ArrayList
    //   19: astore 10
    //   21: aload 10
    //   23: invokespecial 290	java/util/ArrayList:<init>	()V
    //   26: aload_1
    //   27: invokestatic 202	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   30: istore 11
    //   32: iload 11
    //   34: ifeq +201 -> 235
    //   37: ldc 124
    //   39: astore 12
    //   41: ldc 126
    //   43: astore 13
    //   45: aload 12
    //   47: aload 13
    //   49: invokestatic 129	com/vvt/capture/MyUncaughtExceptionHandler/a/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   52: astore 12
    //   54: aload 12
    //   56: ifnull +144 -> 200
    //   59: invokestatic 605	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	()Ljava/lang/String;
    //   62: astore 13
    //   64: iconst_2
    //   65: istore 14
    //   67: iload 14
    //   69: anewarray 33	java/lang/String
    //   72: astore 15
    //   74: iconst_0
    //   75: istore 16
    //   77: new 179	java/lang/StringBuilder
    //   80: astore 17
    //   82: aload 17
    //   84: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   87: aload 17
    //   89: lload_2
    //   90: invokevirtual 608	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   93: astore 17
    //   95: ldc_w 323
    //   98: astore 18
    //   100: aload 17
    //   102: aload 18
    //   104: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: astore 17
    //   109: aload 17
    //   111: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   114: astore 17
    //   116: aload 15
    //   118: iconst_0
    //   119: aload 17
    //   121: aastore
    //   122: iconst_1
    //   123: istore 16
    //   125: new 179	java/lang/StringBuilder
    //   128: astore 17
    //   130: aload 17
    //   132: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   135: aload 17
    //   137: lload 4
    //   139: invokevirtual 608	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   142: astore 17
    //   144: ldc_w 323
    //   147: astore 18
    //   149: aload 17
    //   151: aload 18
    //   153: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: astore 17
    //   158: aload 17
    //   160: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: astore 17
    //   165: aload 15
    //   167: iload 16
    //   169: aload 17
    //   171: aastore
    //   172: aload 12
    //   174: aload 13
    //   176: aload 15
    //   178: invokevirtual 253	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   181: astore 8
    //   183: aload 8
    //   185: ifnull +59 -> 244
    //   188: aload 12
    //   190: aload_0
    //   191: aload 8
    //   193: aload 6
    //   195: invokestatic 611	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;Lcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   198: astore 10
    //   200: aload 12
    //   202: ifnull +8 -> 210
    //   205: aload 12
    //   207: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   210: aload 8
    //   212: ifnull +10 -> 222
    //   215: aload 8
    //   217: invokeinterface 122 1 0
    //   222: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   225: istore 7
    //   227: iload 7
    //   229: ifeq +3 -> 232
    //   232: aload 10
    //   234: areturn
    //   235: aload_1
    //   236: invokestatic 85	com/vvt/capture/MyUncaughtExceptionHandler/a/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   239: astore 12
    //   241: goto -187 -> 54
    //   244: ldc2_w 612
    //   247: lstore 19
    //   249: lload 19
    //   251: invokestatic 560	android/os/SystemClock:sleep	(J)V
    //   254: invokestatic 605	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	()Ljava/lang/String;
    //   257: astore 13
    //   259: iconst_1
    //   260: istore 14
    //   262: iload 14
    //   264: anewarray 33	java/lang/String
    //   267: astore 15
    //   269: iconst_0
    //   270: istore 16
    //   272: new 179	java/lang/StringBuilder
    //   275: astore 17
    //   277: aload 17
    //   279: invokespecial 180	java/lang/StringBuilder:<init>	()V
    //   282: aload 17
    //   284: lload_2
    //   285: invokevirtual 608	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   288: astore 17
    //   290: ldc_w 323
    //   293: astore 18
    //   295: aload 17
    //   297: aload 18
    //   299: invokevirtual 184	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: astore 17
    //   304: aload 17
    //   306: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   309: astore 17
    //   311: aload 15
    //   313: iconst_0
    //   314: aload 17
    //   316: aastore
    //   317: aload 12
    //   319: aload 13
    //   321: aload 15
    //   323: invokevirtual 253	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   326: astore 8
    //   328: aload 8
    //   330: ifnull -130 -> 200
    //   333: aload 12
    //   335: aload_0
    //   336: aload 8
    //   338: aload 6
    //   340: invokestatic 611	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;Lcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   343: astore 10
    //   345: goto -145 -> 200
    //   348: astore 12
    //   350: iconst_0
    //   351: istore 11
    //   353: aconst_null
    //   354: astore 12
    //   356: getstatic 28	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   359: istore 21
    //   361: iload 21
    //   363: ifeq +3 -> 366
    //   366: aload 12
    //   368: ifnull +8 -> 376
    //   371: aload 12
    //   373: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   376: aload 8
    //   378: ifnull -156 -> 222
    //   381: goto -166 -> 215
    //   384: astore 10
    //   386: iconst_0
    //   387: istore 11
    //   389: aconst_null
    //   390: astore 12
    //   392: aload 12
    //   394: ifnull +8 -> 402
    //   397: aload 12
    //   399: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   402: aload 8
    //   404: ifnull +10 -> 414
    //   407: aload 8
    //   409: invokeinterface 122 1 0
    //   414: aload 10
    //   416: athrow
    //   417: astore 10
    //   419: goto -27 -> 392
    //   422: astore 13
    //   424: goto -68 -> 356
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	427	0	paramString1	String
    //   0	427	1	paramString2	String
    //   0	427	2	paramLong1	long
    //   0	427	4	paramLong2	long
    //   0	427	6	paramb	com.vvt.base.removeFromPath
    //   1	227	7	bool1	boolean
    //   4	404	8	localCursor	Cursor
    //   9	3	9	bool2	boolean
    //   19	325	10	localArrayList	ArrayList
    //   384	31	10	localObject1	Object
    //   417	1	10	localObject2	Object
    //   30	358	11	bool3	boolean
    //   39	295	12	localObject3	Object
    //   348	1	12	localException1	Exception
    //   354	44	12	localObject4	Object
    //   43	277	13	str1	String
    //   422	1	13	localException2	Exception
    //   65	198	14	i	int
    //   72	250	15	arrayOfString	String[]
    //   75	196	16	j	int
    //   80	235	17	localObject5	Object
    //   98	200	18	str2	String
    //   247	3	19	l	long
    //   359	3	21	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   26	30	348	java/lang/Exception
    //   47	52	348	java/lang/Exception
    //   235	239	348	java/lang/Exception
    //   26	30	384	finally
    //   47	52	384	finally
    //   235	239	384	finally
    //   59	62	417	finally
    //   67	72	417	finally
    //   77	80	417	finally
    //   82	87	417	finally
    //   89	93	417	finally
    //   102	107	417	finally
    //   109	114	417	finally
    //   119	122	417	finally
    //   125	128	417	finally
    //   130	135	417	finally
    //   137	142	417	finally
    //   151	156	417	finally
    //   158	163	417	finally
    //   169	172	417	finally
    //   176	181	417	finally
    //   193	198	417	finally
    //   249	254	417	finally
    //   254	257	417	finally
    //   262	267	417	finally
    //   272	275	417	finally
    //   277	282	417	finally
    //   284	288	417	finally
    //   297	302	417	finally
    //   304	309	417	finally
    //   314	317	417	finally
    //   321	326	417	finally
    //   338	343	417	finally
    //   356	359	417	finally
    //   59	62	422	java/lang/Exception
    //   67	72	422	java/lang/Exception
    //   77	80	422	java/lang/Exception
    //   82	87	422	java/lang/Exception
    //   89	93	422	java/lang/Exception
    //   102	107	422	java/lang/Exception
    //   109	114	422	java/lang/Exception
    //   119	122	422	java/lang/Exception
    //   125	128	422	java/lang/Exception
    //   130	135	422	java/lang/Exception
    //   137	142	422	java/lang/Exception
    //   151	156	422	java/lang/Exception
    //   158	163	422	java/lang/Exception
    //   169	172	422	java/lang/Exception
    //   176	181	422	java/lang/Exception
    //   193	198	422	java/lang/Exception
    //   249	254	422	java/lang/Exception
    //   254	257	422	java/lang/Exception
    //   262	267	422	java/lang/Exception
    //   272	275	422	java/lang/Exception
    //   277	282	422	java/lang/Exception
    //   284	288	422	java/lang/Exception
    //   297	302	422	java/lang/Exception
    //   304	309	422	java/lang/Exception
    //   314	317	422	java/lang/Exception
    //   321	326	422	java/lang/Exception
    //   338	343	422	java/lang/Exception
  }
  
  private static ArrayList a(String paramString1, String paramString2, String paramString3, com.vvt.base.b paramb)
  {
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = c("mo");
    localObject1 = ((StringBuilder)localObject1).append(str1);
    str1 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str1).append("mo");
    str1 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str1).append(paramString3);
    str1 = File.separator;
    str1 = str1 + paramString2 + ".thumb";
    bool1 = false;
    localObject1 = null;
    int i = 0;
    String str2 = null;
    int k = 6;
    if (i < k)
    {
      long l1 = 10000L;
      SystemClock.sleep(l1);
      Object localObject2 = new java/io/File;
      ((File)localObject2).<init>(str1);
      boolean bool3 = ((File)localObject2).exists();
      if (bool3)
      {
        long l2 = ((File)localObject2).length();
        boolean bool2 = a(1, paramb, l2);
        bool3 = b;
        if ((!bool3) || (bool2))
        {
          localObject1 = ImType.LINE;
          localObject2 = ImMediaFileType.ATTACHMENT;
          String str3 = paramb.f();
          localObject1 = a(paramString1, str1, (ImType)localObject1, (ImMediaFileType)localObject2, str3);
          if (localObject1 == null) {}
        }
      }
    }
    else
    {
      if (localObject1 == null) {
        break label359;
      }
      i = b;
      if (i != 0) {}
      locala.b("image/jpeg");
      locala.d((String)localObject1);
      locala.c((String)localObject1);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("photo_").append(paramString2);
      str2 = ".jpg";
      localObject1 = str2;
      locala.a((String)localObject1);
      localArrayList.add(locala);
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return localArrayList;
      int j;
      i += 1;
      break;
      label359:
      bool1 = d;
      if (!bool1) {}
    }
  }
  
  private static ArrayList a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject3 = "1";
    boolean bool2 = paramString2.equals(localObject3);
    if (!bool2)
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append("/sdcard/Android/data/jp.naver.line.android/stickers");
      localObject4 = File.separator;
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4).append(paramString2);
      localObject4 = File.separator;
      localObject3 = com.vvt.io.d.h((String)localObject4 + paramString3);
      for (;;)
      {
        j = 7;
        if (i < j)
        {
          long l = 10000L;
          SystemClock.sleep(l);
          localObject1 = ImType.LINE;
          localObject4 = ImMediaFileType.ATTACHMENT;
          localObject1 = a(paramString1, (String)localObject3, (ImType)localObject1, (ImMediaFileType)localObject4, paramString4);
          if (localObject1 == null) {}
        }
        else
        {
          locala.d((String)localObject1);
          localArrayList.add(locala);
          return localArrayList;
        }
        i += 1;
      }
    }
    int j = 1;
    Object localObject4 = new Object[j];
    localObject4[0] = paramString3;
    localObject2 = String.format("sticker_%s_key.png", (Object[])localObject4);
    localObject3 = a.iterator();
    for (;;)
    {
      boolean bool3 = ((Iterator)localObject3).hasNext();
      if (bool3)
      {
        localObject1 = (String)((Iterator)localObject3).next();
        localObject1 = p.a(p.a(paramString1, (String)localObject1), (String)localObject2);
        bool3 = ShellUtil.b((String)localObject1);
        if (!bool3) {
          break label305;
        }
        boolean bool1 = b;
        if (!bool1) {}
      }
      localObject2 = ImType.LINE;
      localObject3 = ImMediaFileType.THUMBMAIL;
      localObject1 = a(paramString1, (String)localObject1, (ImType)localObject2, (ImMediaFileType)localObject3, paramString4);
      break;
      label305:
      bool3 = b;
      if (!bool3) {}
    }
  }
  
  private static ArrayList a(String paramString1, String paramString2, String paramString3, String paramString4, com.vvt.base.b paramb)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String str1 = paramString4.split("\\t")[5];
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str2 = c("mo");
    localObject1 = ((StringBuilder)localObject1).append(str2);
    str2 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str2).append("mo");
    str2 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str2).append(paramString3);
    str2 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str2).append("f");
    str2 = File.separator;
    str2 = str2 + paramString2 + "_" + str1;
    localObject1 = null;
    int i = 0;
    String str3 = null;
    for (;;)
    {
      int j = 6;
      if (i < j)
      {
        long l1 = 10000L;
        SystemClock.sleep(l1);
        Object localObject2 = new java/io/File;
        ((File)localObject2).<init>(str2);
        int k = 14;
        long l2 = ((File)localObject2).length();
        boolean bool = a(k, paramb, l2);
        if (bool)
        {
          localObject1 = ImType.LINE;
          localObject2 = ImMediaFileType.ATTACHMENT;
          String str4 = paramb.f();
          localObject1 = a(paramString1, str2, (ImType)localObject1, (ImMediaFileType)localObject2, str4);
          if (localObject1 == null) {}
        }
      }
      else
      {
        if (localObject1 != null)
        {
          str3 = "application/x-binary";
          locala.b(str3);
          locala.c((String)localObject1);
          locala.a(str1);
          localArrayList.add(locala);
        }
        return localArrayList;
      }
      i += 1;
    }
  }
  
  public static List a(g paramg)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramg.h();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.LINE.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramg.e().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramg.e().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramg.e().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramg.e().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramg.e().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramg.j().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramg.j().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramg.j().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramg.j().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramg.j().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramg.h();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.LINE.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramg.e().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramg.d();
    Object localObject4 = ((List)localObject1).iterator();
    boolean bool1;
    Object localObject6;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramg.e().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (bool4)
      {
        bool1 = b;
        if (!bool1) {}
      }
      else
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramg.d();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramg.e().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (bool5)
      {
        bool1 = b;
        if (!bool1) {}
      }
      else
      {
        localObject3 = new com/vvt/events/FxIMContactEvent;
        ((FxIMContactEvent)localObject3).<init>();
        localObject4 = ((com.vvt.im.events.info.e)localObject1).c();
        ((FxIMContactEvent)localObject3).setContactDisplayName((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).d();
        ((FxIMContactEvent)localObject3).setContactId((String)localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).e();
        ((FxIMContactEvent)localObject3).setContactProfilePicture((byte[])localObject4);
        localObject4 = ((com.vvt.im.events.info.e)localObject1).a();
        ((FxIMContactEvent)localObject3).setContactProfilePicturePath((String)localObject4);
        localObject1 = ((com.vvt.im.events.info.e)localObject1).f();
        ((FxIMContactEvent)localObject3).setContactStatusMessage((String)localObject1);
        long l2 = paramg.h();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.LINE.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramg.e().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramg.k();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.a)((Iterator)localObject2).next();
      localObject5 = new com/vvt/events/d;
      ((com.vvt.events.d)localObject5).<init>();
      localObject6 = ((com.vvt.im.events.info.a)localObject1).e();
      ((com.vvt.events.d)localObject5).b((byte[])localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).a();
      ((com.vvt.events.d)localObject5).a((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).c();
      ((com.vvt.events.d)localObject5).b((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).b();
      ((com.vvt.events.d)localObject5).c((String)localObject6);
      localObject6 = ((com.vvt.im.events.info.a)localObject1).f();
      ((com.vvt.events.d)localObject5).d((String)localObject6);
      localObject1 = ((com.vvt.im.events.info.a)localObject1).d();
      ((com.vvt.events.d)localObject5).a((byte[])localObject1);
      ((List)localObject4).add(localObject5);
    }
    boolean bool2 = false;
    localObject1 = null;
    i = paramg.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f1 = paramg.f().d();
      ((com.vvt.events.e)localObject1).a(f1);
      double d1 = paramg.f().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramg.f().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramg.f().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramg.j().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramg.i();
    localObject5 = ICallLogData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramg.h();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.LINE.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramg.b();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramg.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramg.i();
      localObject2 = ICallLogData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramg.g().a();
        ((FxIMMessageEvent)localObject3).setSenderId((String)localObject1);
      }
      localObject2 = ((List)localObject4).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
        ((FxIMMessageEvent)localObject3).addAttachment((com.vvt.events.d)localObject1);
      }
    }
    localArrayList.add(localObject3);
    return localArrayList;
  }
  
  public static void a(RunningMode paramRunningMode)
  {
    f = paramRunningMode;
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    boolean bool4 = false;
    long l1 = 0L;
    boolean bool5 = paramLong < l1;
    if (!bool5) {}
    boolean bool3;
    for (bool5 = false;; bool5 = bool3)
    {
      long l2;
      if (paramInt == i)
      {
        l2 = paramb.b();
        boolean bool1 = paramLong < l2;
        if (!bool1) {
          break label189;
        }
        bool5 = c;
        if (!bool5) {}
      }
      for (;;)
      {
        bool5 = b;
        if (bool5) {}
        return bool4;
        int j = 3;
        f1 = 4.2E-45F;
        if (paramInt == j)
        {
          l2 = paramb.d();
          boolean bool2 = paramLong < l2;
          if (bool2)
          {
            bool5 = c;
            if (!bool5) {
              continue;
            }
          }
        }
        else
        {
          int k = 2;
          f1 = 2.8E-45F;
          if (paramInt == k)
          {
            l2 = paramb.c();
            bool3 = paramLong < l2;
            if (bool3)
            {
              bool5 = c;
              if (!bool5) {
                continue;
              }
            }
          }
          else
          {
            l2 = paramb.e();
            bool3 = paramLong < l2;
            if (bool3)
            {
              bool5 = c;
              if (!bool5) {
                continue;
              }
              continue;
            }
          }
        }
        label189:
        bool4 = bool5;
      }
    }
  }
  
  /* Error */
  public static long b(String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: aconst_null
    //   4: astore_3
    //   5: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   8: istore 4
    //   10: iload 4
    //   12: ifeq +3 -> 15
    //   15: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   18: istore 4
    //   20: iload 4
    //   22: ifeq +3 -> 25
    //   25: aload_0
    //   26: ifnull +140 -> 166
    //   29: aload_0
    //   30: invokestatic 85	com/vvt/capture/MyUncaughtExceptionHandler/a/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   33: astore 5
    //   35: ldc 87
    //   37: astore 6
    //   39: ldc 89
    //   41: astore 7
    //   43: iconst_0
    //   44: istore 8
    //   46: aconst_null
    //   47: astore 9
    //   49: ldc_w 623
    //   52: astore 10
    //   54: aload 5
    //   56: aload 7
    //   58: aconst_null
    //   59: aconst_null
    //   60: aconst_null
    //   61: aconst_null
    //   62: aconst_null
    //   63: aload 6
    //   65: aload 10
    //   67: invokevirtual 101	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   70: astore 9
    //   72: aload 9
    //   74: ifnull +270 -> 344
    //   77: aload 9
    //   79: invokeinterface 256 1 0
    //   84: istore 11
    //   86: iload 11
    //   88: ifeq +98 -> 186
    //   91: ldc 109
    //   93: astore 7
    //   95: aload 9
    //   97: aload 7
    //   99: invokeinterface 113 2 0
    //   104: istore 11
    //   106: aload 9
    //   108: iload 11
    //   110: invokeinterface 117 2 0
    //   115: lstore 12
    //   117: aload 5
    //   119: ifnull +8 -> 127
    //   122: aload 5
    //   124: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   127: aload 9
    //   129: ifnull +10 -> 139
    //   132: aload 9
    //   134: invokeinterface 122 1 0
    //   139: lload 12
    //   141: lstore 14
    //   143: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   146: istore 8
    //   148: iload 8
    //   150: ifeq +3 -> 153
    //   153: getstatic 21	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:removeFromPath	Z
    //   156: istore 8
    //   158: iload 8
    //   160: ifeq +3 -> 163
    //   163: lload 14
    //   165: lreturn
    //   166: ldc 124
    //   168: astore 5
    //   170: ldc 126
    //   172: astore 7
    //   174: aload 5
    //   176: aload 7
    //   178: invokestatic 129	com/vvt/capture/MyUncaughtExceptionHandler/a/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   181: astore 5
    //   183: goto -148 -> 35
    //   186: lconst_0
    //   187: lstore 12
    //   189: goto -72 -> 117
    //   192: astore 5
    //   194: iconst_0
    //   195: istore 4
    //   197: aconst_null
    //   198: astore 5
    //   200: getstatic 28	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   203: istore 11
    //   205: iload 11
    //   207: ifeq +3 -> 210
    //   210: aload_3
    //   211: ifnull +7 -> 218
    //   214: aload_3
    //   215: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   218: aload 5
    //   220: ifnull +10 -> 230
    //   223: aload 5
    //   225: invokeinterface 122 1 0
    //   230: lload_1
    //   231: lstore 14
    //   233: goto -90 -> 143
    //   236: astore 5
    //   238: iconst_0
    //   239: istore 11
    //   241: aconst_null
    //   242: astore 7
    //   244: aload 7
    //   246: ifnull +8 -> 254
    //   249: aload 7
    //   251: invokevirtual 121	android/database/sqlite/SQLiteDatabase:close	()V
    //   254: aload_3
    //   255: ifnull +9 -> 264
    //   258: aload_3
    //   259: invokeinterface 122 1 0
    //   264: aload 5
    //   266: athrow
    //   267: astore 16
    //   269: aload 5
    //   271: astore 7
    //   273: aload 16
    //   275: astore 5
    //   277: goto -33 -> 244
    //   280: astore 7
    //   282: aload 9
    //   284: astore_3
    //   285: aload 7
    //   287: astore 16
    //   289: aload 5
    //   291: astore 7
    //   293: aload 16
    //   295: astore 5
    //   297: goto -53 -> 244
    //   300: astore 16
    //   302: aload_3
    //   303: astore 7
    //   305: aload 5
    //   307: astore_3
    //   308: aload 16
    //   310: astore 5
    //   312: goto -68 -> 244
    //   315: astore 7
    //   317: aconst_null
    //   318: astore 16
    //   320: aload 5
    //   322: astore_3
    //   323: iconst_0
    //   324: istore 4
    //   326: aconst_null
    //   327: astore 5
    //   329: goto -129 -> 200
    //   332: astore 7
    //   334: aload 5
    //   336: astore_3
    //   337: aload 9
    //   339: astore 5
    //   341: goto -141 -> 200
    //   344: lload_1
    //   345: lstore 12
    //   347: goto -230 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	350	0	paramString	String
    //   2	343	1	l1	long
    //   4	333	3	localObject1	Object
    //   8	317	4	bool1	boolean
    //   33	149	5	localObject2	Object
    //   192	1	5	localException1	Exception
    //   198	26	5	localObject3	Object
    //   236	34	5	localObject4	Object
    //   275	65	5	localObject5	Object
    //   37	27	6	str1	String
    //   41	231	7	localObject6	Object
    //   280	6	7	localObject7	Object
    //   291	13	7	localObject8	Object
    //   315	1	7	localException2	Exception
    //   332	1	7	localException3	Exception
    //   44	115	8	bool2	boolean
    //   47	291	9	localCursor	Cursor
    //   52	14	10	str2	String
    //   84	3	11	bool3	boolean
    //   104	5	11	i	int
    //   203	37	11	bool4	boolean
    //   115	231	12	l2	long
    //   141	91	14	l3	long
    //   267	7	16	localObject9	Object
    //   287	7	16	localObject10	Object
    //   300	9	16	localObject11	Object
    //   318	1	16	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   29	33	192	java/lang/Exception
    //   176	181	192	java/lang/Exception
    //   29	33	236	finally
    //   176	181	236	finally
    //   65	70	267	finally
    //   77	84	280	finally
    //   97	104	280	finally
    //   108	115	280	finally
    //   200	203	300	finally
    //   65	70	315	java/lang/Exception
    //   77	84	332	java/lang/Exception
    //   97	104	332	java/lang/Exception
    //   108	115	332	java/lang/Exception
  }
  
  /* Error */
  private static String b(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: invokestatic 867	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:i	()Ljava/lang/String;
    //   5: astore_2
    //   6: iconst_0
    //   7: istore_3
    //   8: aconst_null
    //   9: astore 4
    //   11: aload_0
    //   12: aload_2
    //   13: aconst_null
    //   14: invokevirtual 253	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnull +45 -> 64
    //   22: aload_2
    //   23: invokeinterface 256 1 0
    //   28: istore_3
    //   29: iload_3
    //   30: ifeq +34 -> 64
    //   33: ldc_w 869
    //   36: astore 4
    //   38: aload_2
    //   39: aload 4
    //   41: invokeinterface 113 2 0
    //   46: istore_3
    //   47: aload_2
    //   48: iload_3
    //   49: invokeinterface 261 2 0
    //   54: astore_1
    //   55: aload_1
    //   56: invokestatic 202	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   59: istore_3
    //   60: iload_3
    //   61: ifne -39 -> 22
    //   64: aload_2
    //   65: ifnull +9 -> 74
    //   68: aload_2
    //   69: invokeinterface 122 1 0
    //   74: aload_1
    //   75: areturn
    //   76: astore_2
    //   77: aconst_null
    //   78: astore_2
    //   79: getstatic 28	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   82: istore_3
    //   83: iload_3
    //   84: ifeq +3 -> 87
    //   87: aload_2
    //   88: ifnull -14 -> 74
    //   91: goto -23 -> 68
    //   94: astore 5
    //   96: aconst_null
    //   97: astore_2
    //   98: aload 5
    //   100: astore_1
    //   101: aload_2
    //   102: ifnull +9 -> 111
    //   105: aload_2
    //   106: invokeinterface 122 1 0
    //   111: aload_1
    //   112: athrow
    //   113: astore_1
    //   114: goto -13 -> 101
    //   117: astore 4
    //   119: goto -40 -> 79
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	111	1	localObject1	Object
    //   113	1	1	localObject2	Object
    //   5	64	2	localObject3	Object
    //   76	1	2	localException1	Exception
    //   78	28	2	localObject4	Object
    //   7	23	3	bool1	boolean
    //   46	3	3	i	int
    //   59	25	3	bool2	boolean
    //   9	31	4	str	String
    //   117	1	4	localException2	Exception
    //   94	5	5	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	76	java/lang/Exception
    //   13	17	76	java/lang/Exception
    //   2	5	94	finally
    //   13	17	94	finally
    //   22	28	113	finally
    //   39	46	113	finally
    //   48	54	113	finally
    //   55	59	113	finally
    //   79	82	113	finally
    //   22	28	117	java/lang/Exception
    //   39	46	117	java/lang/Exception
    //   48	54	117	java/lang/Exception
    //   55	59	117	java/lang/Exception
  }
  
  /* Error */
  private static String b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: invokestatic 871	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:j	()Ljava/lang/String;
    //   5: astore_3
    //   6: iconst_1
    //   7: istore 4
    //   9: iload 4
    //   11: anewarray 33	java/lang/String
    //   14: astore 5
    //   16: aload 5
    //   18: iconst_0
    //   19: aload_1
    //   20: aastore
    //   21: aload_0
    //   22: aload_3
    //   23: aload 5
    //   25: invokevirtual 253	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   28: astore_3
    //   29: aload_3
    //   30: ifnull +40 -> 70
    //   33: aload_3
    //   34: invokeinterface 256 1 0
    //   39: istore 4
    //   41: iload 4
    //   43: ifeq +27 -> 70
    //   46: ldc_w 540
    //   49: astore 5
    //   51: aload_3
    //   52: aload 5
    //   54: invokeinterface 113 2 0
    //   59: istore 4
    //   61: aload_3
    //   62: iload 4
    //   64: invokeinterface 261 2 0
    //   69: astore_2
    //   70: aload_3
    //   71: ifnull +9 -> 80
    //   74: aload_3
    //   75: invokeinterface 122 1 0
    //   80: aload_2
    //   81: areturn
    //   82: astore_3
    //   83: aconst_null
    //   84: astore_3
    //   85: getstatic 28	com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler:d	Z
    //   88: istore 4
    //   90: iload 4
    //   92: ifeq +3 -> 95
    //   95: aload_3
    //   96: ifnull -16 -> 80
    //   99: goto -25 -> 74
    //   102: astore 6
    //   104: aconst_null
    //   105: astore_3
    //   106: aload 6
    //   108: astore_2
    //   109: aload_3
    //   110: ifnull +9 -> 119
    //   113: aload_3
    //   114: invokeinterface 122 1 0
    //   119: aload_2
    //   120: athrow
    //   121: astore_2
    //   122: goto -13 -> 109
    //   125: astore 5
    //   127: goto -42 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	130	1	paramString	String
    //   1	119	2	localObject1	Object
    //   121	1	2	localObject2	Object
    //   5	70	3	localObject3	Object
    //   82	1	3	localException1	Exception
    //   84	30	3	localObject4	Object
    //   7	35	4	bool1	boolean
    //   59	4	4	i	int
    //   88	3	4	bool2	boolean
    //   14	39	5	localObject5	Object
    //   125	1	5	localException2	Exception
    //   102	5	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	82	java/lang/Exception
    //   9	14	82	java/lang/Exception
    //   19	21	82	java/lang/Exception
    //   23	28	82	java/lang/Exception
    //   2	5	102	finally
    //   9	14	102	finally
    //   19	21	102	finally
    //   23	28	102	finally
    //   33	39	121	finally
    //   52	59	121	finally
    //   62	69	121	finally
    //   85	88	121	finally
    //   33	39	125	java/lang/Exception
    //   52	59	125	java/lang/Exception
    //   62	69	125	java/lang/Exception
  }
  
  private static String b(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = ImType.LINE;
    Object localObject3 = ImMediaFileType.THUMBMAIL;
    localObject2 = com.vvt.im.a.c.a(paramString1, (ImType)localObject2, (ImMediaFileType)localObject3);
    localObject3 = com.vvt.im.a.c.a(ImMediaFileType.THUMBMAIL);
    Object localObject4 = new java/lang/StringBuilder;
    ((StringBuilder)localObject4).<init>();
    localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
    localObject4 = File.separator;
    localObject2 = (String)localObject4 + (String)localObject3;
    int i = 3;
    localObject3 = ThumbnailUtils.createVideoThumbnail(paramString2, i);
    localObject4 = new java/io/File;
    ((File)localObject4).<init>((String)localObject2);
    if (localObject3 != null) {}
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>((File)localObject4);
      localObject4 = Bitmap.CompressFormat.JPEG;
      int j = 40;
      boolean bool1 = ((Bitmap)localObject3).compress((Bitmap.CompressFormat)localObject4, j, localFileOutputStream);
      if (bool1) {
        localObject1 = localObject2;
      }
      localFileOutputStream.flush();
      localFileOutputStream.close();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = d;
        if (!bool2) {}
      }
    }
    return (String)localObject1;
  }
  
  private static ArrayList b(String paramString1, String paramString2, String paramString3, com.vvt.base.b paramb)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    com.vvt.im.events.info.a locala = new com/vvt/im/events/info/a;
    locala.<init>();
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = c("mo");
    localObject1 = ((StringBuilder)localObject1).append(str1);
    str1 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str1).append("mo");
    str1 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str1).append(paramString3);
    str1 = File.separator;
    str1 = str1 + "voice_" + paramString2 + ".aac";
    localObject1 = null;
    int i = 0;
    String str2 = null;
    for (;;)
    {
      int j = 6;
      if (i < j)
      {
        long l1 = 10000L;
        SystemClock.sleep(l1);
        Object localObject2 = new java/io/File;
        ((File)localObject2).<init>(str1);
        int k = 3;
        long l2 = ((File)localObject2).length();
        boolean bool = a(k, paramb, l2);
        if (bool)
        {
          localObject1 = ImType.LINE;
          localObject2 = ImMediaFileType.ATTACHMENT;
          String str3 = paramb.f();
          localObject1 = a(paramString1, str1, (ImType)localObject1, (ImMediaFileType)localObject2, str3);
          if (localObject1 == null) {}
        }
      }
      else
      {
        if (localObject1 != null)
        {
          locala.b("audio/aac");
          locala.c((String)localObject1);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("voice_").append(paramString2);
          str2 = ".aac";
          localObject1 = str2;
          locala.a((String)localObject1);
          localArrayList.add(locala);
        }
        return localArrayList;
      }
      i += 1;
    }
  }
  
  public static String[] b()
  {
    int i = 2;
    int j = 1;
    String[] arrayOfString = new String[i];
    Object localObject = new Object[i];
    localObject[0] = "/data/data";
    localObject[j] = "jp.naver.line.android";
    String str = String.format("%s/%s/databases", (Object[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = str + "/naver_line";
    arrayOfString[0] = str;
    localObject = new Object[i];
    localObject[0] = "/dbdata/databases";
    localObject[j] = "jp.naver.line.android";
    str = String.format("%s/%s", (Object[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = str + "/naver_line";
    arrayOfString[j] = str;
    return arrayOfString;
  }
  
  public static long c()
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    long l = b(null);
    boolean bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    return l;
  }
  
  private static String c(String paramString)
  {
    String str1 = com.vvt.io.d.h("/sdcard/Android/data/jp.naver.line.android/cache");
    String str2 = p.a(str1, paramString);
    File localFile = new java/io/File;
    localFile.<init>(str2);
    boolean bool = b;
    if (bool) {}
    bool = localFile.exists();
    if (bool) {}
    for (;;)
    {
      bool = b;
      if (bool) {}
      return str1;
      str1 = com.vvt.io.d.h("/sdcard/Android/data/jp.naver.line.android/storage");
    }
  }
  
  private static String d()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("id, ");
    localStringBuilder.append("chat_history.type, ");
    localStringBuilder.append("chat_history.chat_id, ");
    localStringBuilder.append("from_mid, ");
    localStringBuilder.append("sender_name, ");
    localStringBuilder.append("status_msg, ");
    localStringBuilder.append("chat.type as chat_type, ");
    localStringBuilder.append("content, ");
    localStringBuilder.append("created_time, ");
    localStringBuilder.append("delivered_time, ");
    localStringBuilder.append("status, ");
    localStringBuilder.append("location_name, ");
    localStringBuilder.append("location_address, ");
    localStringBuilder.append("location_latitude, ");
    localStringBuilder.append("location_longitude, ");
    localStringBuilder.append("attachement_type, ");
    localStringBuilder.append("attachement_local_uri, ");
    localStringBuilder.append("parameter ");
    localStringBuilder.append("FROM chat_history as chat_history ");
    localStringBuilder.append("LEFT JOIN ( ");
    localStringBuilder.append("SELECT contacts.m_id, name as sender_name, status_msg ");
    localStringBuilder.append("FROM contacts ");
    localStringBuilder.append(") as contacts ");
    localStringBuilder.append("ON chat_history.from_mid = contacts.m_id ");
    localStringBuilder.append("LEFT JOIN ( ");
    localStringBuilder.append("SELECT chat.chat_id, owner_mid, owner_name, type ");
    localStringBuilder.append("FROM chat ");
    localStringBuilder.append("LEFT JOIN ( ");
    localStringBuilder.append("SELECT contacts.m_id, name as owner_name ");
    localStringBuilder.append("FROM contacts) as contacts ");
    localStringBuilder.append("ON chat.owner_mid = contacts.m_id) as chat ");
    localStringBuilder.append("ON chat.chat_id = chat_history.chat_id ");
    localStringBuilder.append("WHERE (chat_history.type = 1 OR chat_history.type = 5 OR chat_history.type = 4) ");
    localStringBuilder.append("AND (attachement_type = 0 OR attachement_type = 7 OR attachement_type = 13 OR attachement_type = 14 OR attachement_type = 1 OR attachement_type = 2 OR attachement_type = 3 OR attachement_type = 6 OR attachement_type = 15) ");
    localStringBuilder.append("AND id > ? ");
    localStringBuilder.append("AND id <= ? ");
    localStringBuilder.append("AND status != 6 ");
    localStringBuilder.append("AND status != 4 ");
    localStringBuilder.append("ORDER BY id DESC ");
    return localStringBuilder.toString();
  }
  
  private static String e()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("m_id as mid, name, status_msg ");
    localStringBuilder.append("FROM contacts ");
    localStringBuilder.append("WHERE mid = ? LIMIT 1");
    return localStringBuilder.toString();
  }
  
  private static String f()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("a.mid, removeFromPath.name, removeFromPath.status_msg ");
    localStringBuilder.append("FROM chat_member a left JOIN contacts removeFromPath ");
    localStringBuilder.append("ON a.mid = removeFromPath.m_id ");
    localStringBuilder.append("WHERE a.chat_id = ?");
    return localStringBuilder.toString();
  }
  
  private static String g()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("a.m_id as mid, removeFromPath.name, removeFromPath.status_msg ");
    localStringBuilder.append("FROM membership a left JOIN contacts removeFromPath ");
    localStringBuilder.append("ON a.m_id = removeFromPath.m_id ");
    localStringBuilder.append("WHERE a.id = ? AND name IS NOT NULL");
    return localStringBuilder.toString();
  }
  
  private static String h()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("value ");
    localStringBuilder.append("FROM setting ");
    localStringBuilder.append("WHERE key = 'PROFILE_MID'");
    return localStringBuilder.toString();
  }
  
  private static String i()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("owner_mid ");
    localStringBuilder.append("FROM chat ");
    return localStringBuilder.toString();
  }
  
  private static String j()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT name FROM groups WHERE id = ?");
    return localStringBuilder.toString();
  }
  
  private static String k()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT attachement_local_uri FROM chat_history WHERE id = ?");
    return localStringBuilder.toString();
  }
  
  private static String l()
  {
    String str = null;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = c("p");
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = File.separator;
    localObject1 = (String)localObject2 + "p";
    localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    localObject1 = new com/vvt/capture/c/d;
    ((d)localObject1).<init>();
    localObject1 = ((File)localObject2).listFiles((FilenameFilter)localObject1);
    if (localObject1 != null) {
      str = localObject1[0].getName();
    }
    boolean bool = b;
    if (bool) {}
    return str;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */