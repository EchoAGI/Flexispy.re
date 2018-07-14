package com.vvt.capture.b.c.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import com.vvt.base.FxEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxVoipCallLogEvent;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCategory;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.ICallLogData.IsMonitor;
import com.vvt.p.c;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  
  /* Error */
  public static int a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifeq +3 -> 10
    //   10: getstatic 16	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:removeFromPath	Z
    //   13: istore_2
    //   14: iload_2
    //   15: ifeq +3 -> 18
    //   18: iconst_m1
    //   19: istore_2
    //   20: aload_0
    //   21: invokestatic 26	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   24: istore_3
    //   25: iload_3
    //   26: ifne +225 -> 251
    //   29: bipush 17
    //   31: istore_3
    //   32: iload_3
    //   33: aload_0
    //   34: invokestatic 32	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   37: astore 4
    //   39: aload 4
    //   41: ifnull +105 -> 146
    //   44: invokestatic 36	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:AppEngine1	()Ljava/lang/String;
    //   47: astore 5
    //   49: iconst_2
    //   50: istore 6
    //   52: iload 6
    //   54: anewarray 39	java/lang/String
    //   57: astore 7
    //   59: iconst_0
    //   60: istore 8
    //   62: iconst_0
    //   63: istore 9
    //   65: aconst_null
    //   66: astore 10
    //   68: iconst_0
    //   69: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   72: astore 10
    //   74: aload 7
    //   76: iconst_0
    //   77: aload 10
    //   79: aastore
    //   80: iconst_1
    //   81: istore 8
    //   83: iconst_1
    //   84: istore 9
    //   86: iload 9
    //   88: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   91: astore 10
    //   93: aload 7
    //   95: iload 8
    //   97: aload 10
    //   99: aastore
    //   100: aload 4
    //   102: aload 5
    //   104: aload 7
    //   106: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   109: astore_1
    //   110: aload_1
    //   111: invokeinterface 58 1 0
    //   116: istore 11
    //   118: iload 11
    //   120: ifeq +26 -> 146
    //   123: ldc 60
    //   125: astore 5
    //   127: aload_1
    //   128: aload 5
    //   130: invokeinterface 64 2 0
    //   135: istore 11
    //   137: aload_1
    //   138: iload 11
    //   140: invokeinterface 68 2 0
    //   145: istore_2
    //   146: aload_1
    //   147: ifnull +9 -> 156
    //   150: aload_1
    //   151: invokeinterface 72 1 0
    //   156: aload 4
    //   158: ifnull +8 -> 166
    //   161: aload 4
    //   163: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   166: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   169: istore_3
    //   170: iload_3
    //   171: ifeq +3 -> 174
    //   174: iload_2
    //   175: ireturn
    //   176: astore 4
    //   178: iconst_0
    //   179: istore_3
    //   180: aconst_null
    //   181: astore 4
    //   183: getstatic 21	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   186: istore 11
    //   188: iload 11
    //   190: ifeq +3 -> 193
    //   193: aload_1
    //   194: ifnull +9 -> 203
    //   197: aload_1
    //   198: invokeinterface 72 1 0
    //   203: aload 4
    //   205: ifnull -39 -> 166
    //   208: goto -47 -> 161
    //   211: astore 12
    //   213: iconst_0
    //   214: istore_3
    //   215: aconst_null
    //   216: astore 4
    //   218: aload_1
    //   219: ifnull +9 -> 228
    //   222: aload_1
    //   223: invokeinterface 72 1 0
    //   228: aload 4
    //   230: ifnull +8 -> 238
    //   233: aload 4
    //   235: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   238: aload 12
    //   240: athrow
    //   241: astore 12
    //   243: goto -25 -> 218
    //   246: astore 5
    //   248: goto -65 -> 183
    //   251: iconst_0
    //   252: istore_3
    //   253: aconst_null
    //   254: astore 4
    //   256: goto -110 -> 146
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	paramString	String
    //   1	222	1	localCursor	Cursor
    //   5	10	2	bool1	boolean
    //   19	156	2	i	int
    //   24	2	3	bool2	boolean
    //   31	2	3	j	int
    //   169	84	3	bool3	boolean
    //   37	125	4	localSQLiteDatabase	SQLiteDatabase
    //   176	1	4	localException1	Exception
    //   181	74	4	localObject1	Object
    //   47	82	5	str1	String
    //   246	1	5	localException2	Exception
    //   50	3	6	k	int
    //   57	48	7	arrayOfString	String[]
    //   60	36	8	m	int
    //   63	24	9	n	int
    //   66	32	10	str2	String
    //   116	3	11	bool4	boolean
    //   135	4	11	i1	int
    //   186	3	11	bool5	boolean
    //   211	28	12	localObject2	Object
    //   241	1	12	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   20	24	176	java/lang/Exception
    //   33	37	176	java/lang/Exception
    //   20	24	211	finally
    //   33	37	211	finally
    //   44	47	241	finally
    //   52	57	241	finally
    //   68	72	241	finally
    //   77	80	241	finally
    //   86	91	241	finally
    //   97	100	241	finally
    //   104	109	241	finally
    //   110	116	241	finally
    //   128	135	241	finally
    //   138	145	241	finally
    //   183	186	241	finally
    //   44	47	246	java/lang/Exception
    //   52	57	246	java/lang/Exception
    //   68	72	246	java/lang/Exception
    //   77	80	246	java/lang/Exception
    //   86	91	246	java/lang/Exception
    //   97	100	246	java/lang/Exception
    //   104	109	246	java/lang/Exception
    //   110	116	246	java/lang/Exception
    //   128	135	246	java/lang/Exception
    //   138	145	246	java/lang/Exception
  }
  
  public static FxEvent a(com.vvt.capture.b.a parama)
  {
    FxVoipCallLogEvent localFxVoipCallLogEvent = new com/vvt/events/FxVoipCallLogEvent;
    localFxVoipCallLogEvent.<init>();
    long l = parama.h();
    localFxVoipCallLogEvent.setEventTime(l);
    Object localObject1 = FxVoipCategory.FACEBOOK;
    localFxVoipCallLogEvent.setVoipCategory((FxVoipCategory)localObject1);
    localObject1 = FxEventDirection.MISSED_CALL;
    Object localObject2 = parama.i();
    ICallLogData.Direction localDirection = ICallLogData.Direction.IN;
    if (localObject2 == localDirection)
    {
      localObject1 = FxEventDirection.IN;
      localFxVoipCallLogEvent.setDirection((FxEventDirection)localObject1);
      l = parama.a();
      localFxVoipCallLogEvent.setDuration(l);
      localObject1 = parama.b();
      localFxVoipCallLogEvent.setUserId((String)localObject1);
      localObject1 = parama.c();
      localFxVoipCallLogEvent.setContactName((String)localObject1);
      int i = parama.d();
      l = i;
      localFxVoipCallLogEvent.setTransferredBytes(l);
      localObject1 = parama.e();
      localObject2 = ICallLogData.IsMonitor.YES;
      if (localObject1 != localObject2) {
        break label180;
      }
    }
    label180:
    for (localObject1 = FxVoipCallLogEvent.FxIsMonitor.YES;; localObject1 = FxVoipCallLogEvent.FxIsMonitor.NO)
    {
      localFxVoipCallLogEvent.setIsMonitor((FxVoipCallLogEvent.FxIsMonitor)localObject1);
      l = parama.f();
      localFxVoipCallLogEvent.setFrameStripId(l);
      return localFxVoipCallLogEvent;
      localObject2 = parama.i();
      localDirection = ICallLogData.Direction.OUT;
      if (localObject2 != localDirection) {
        break;
      }
      localObject1 = FxEventDirection.OUT;
      break;
    }
  }
  
  private static ICallLogData.Direction a(String paramString1, String paramString2, int paramInt)
  {
    ICallLogData.Direction localDirection = ICallLogData.Direction.OUT;
    boolean bool = paramString1.equals(paramString2);
    if (bool) {
      if (paramInt != 0) {
        break label26;
      }
    }
    label26:
    for (localDirection = ICallLogData.Direction.MISSED_CALL;; localDirection = ICallLogData.Direction.IN) {
      return localDirection;
    }
  }
  
  public static String a()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msg_id AS id, ");
    localStringBuilder.append("timestamp_ms as time, ");
    localStringBuilder.append("xma ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("WHERE msg_type = 9 ");
    localStringBuilder.append("AND id NOT LIKE 'sent%' ");
    localStringBuilder.append("ORDER BY time DESC ");
    localStringBuilder.append("LIMIT 1");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 184	java/lang/StringBuilder
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial 185	java/lang/StringBuilder:<init>	()V
    //   10: ldc -45
    //   12: astore 4
    //   14: aload_3
    //   15: aload 4
    //   17: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   20: aload_1
    //   21: invokevirtual 191	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 209	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: astore_3
    //   28: aload_3
    //   29: ifnull +233 -> 262
    //   32: ldc -43
    //   34: astore 4
    //   36: iconst_1
    //   37: istore 5
    //   39: iload 5
    //   41: anewarray 4	java/lang/Object
    //   44: astore 6
    //   46: aconst_null
    //   47: astore 7
    //   49: ldc -41
    //   51: astore 8
    //   53: aload 6
    //   55: iconst_0
    //   56: aload 8
    //   58: aastore
    //   59: aload 4
    //   61: aload 6
    //   63: invokestatic 219	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   66: astore 7
    //   68: iconst_1
    //   69: istore 9
    //   71: iload 9
    //   73: anewarray 39	java/lang/String
    //   76: astore 8
    //   78: iconst_0
    //   79: istore 9
    //   81: aconst_null
    //   82: astore 4
    //   84: aload 8
    //   86: iconst_0
    //   87: aload_3
    //   88: aastore
    //   89: aload_0
    //   90: ifnull +167 -> 257
    //   93: ldc -35
    //   95: astore 4
    //   97: iconst_0
    //   98: istore 5
    //   100: aconst_null
    //   101: astore 6
    //   103: aload_0
    //   104: astore_3
    //   105: aload_0
    //   106: aload 4
    //   108: aconst_null
    //   109: aload 7
    //   111: aload 8
    //   113: aconst_null
    //   114: aconst_null
    //   115: aconst_null
    //   116: invokevirtual 225	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   119: astore_3
    //   120: aload_3
    //   121: ifnull +125 -> 246
    //   124: aload_3
    //   125: invokeinterface 58 1 0
    //   130: istore 9
    //   132: iload 9
    //   134: ifeq +112 -> 246
    //   137: ldc -29
    //   139: astore 4
    //   141: aload_3
    //   142: aload 4
    //   144: invokeinterface 64 2 0
    //   149: istore 9
    //   151: aload_3
    //   152: iload 9
    //   154: invokeinterface 230 2 0
    //   159: astore_2
    //   160: aload_3
    //   161: astore 10
    //   163: aload_2
    //   164: astore_3
    //   165: aload 10
    //   167: astore_2
    //   168: aload_2
    //   169: ifnull +9 -> 178
    //   172: aload_2
    //   173: invokeinterface 72 1 0
    //   178: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   181: istore 9
    //   183: iload 9
    //   185: ifeq +3 -> 188
    //   188: aload_3
    //   189: areturn
    //   190: astore_3
    //   191: aconst_null
    //   192: astore_3
    //   193: getstatic 21	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   196: istore 9
    //   198: iload 9
    //   200: ifeq +3 -> 203
    //   203: aload_3
    //   204: ifnull +9 -> 213
    //   207: aload_3
    //   208: invokeinterface 72 1 0
    //   213: aconst_null
    //   214: astore_3
    //   215: goto -37 -> 178
    //   218: astore_3
    //   219: aload_2
    //   220: ifnull +9 -> 229
    //   223: aload_2
    //   224: invokeinterface 72 1 0
    //   229: aload_3
    //   230: athrow
    //   231: astore 4
    //   233: aload_3
    //   234: astore_2
    //   235: aload 4
    //   237: astore_3
    //   238: goto -19 -> 219
    //   241: astore 4
    //   243: goto -50 -> 193
    //   246: aload_3
    //   247: astore 10
    //   249: aconst_null
    //   250: astore_3
    //   251: aload 10
    //   253: astore_2
    //   254: goto -86 -> 168
    //   257: aconst_null
    //   258: astore_3
    //   259: goto -91 -> 168
    //   262: aconst_null
    //   263: astore_3
    //   264: goto -86 -> 178
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	267	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	267	1	paramString	String
    //   1	253	2	localObject1	Object
    //   5	184	3	localObject2	Object
    //   190	1	3	localException1	Exception
    //   192	23	3	localObject3	Object
    //   218	16	3	localObject4	Object
    //   237	27	3	localObject5	Object
    //   12	131	4	str1	String
    //   231	5	4	localObject6	Object
    //   241	1	4	localException2	Exception
    //   37	62	5	i	int
    //   44	58	6	arrayOfObject	Object[]
    //   47	63	7	str2	String
    //   51	61	8	localObject7	Object
    //   69	64	9	bool1	boolean
    //   149	4	9	j	int
    //   181	18	9	bool2	boolean
    //   161	91	10	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   39	44	190	java/lang/Exception
    //   56	59	190	java/lang/Exception
    //   61	66	190	java/lang/Exception
    //   71	76	190	java/lang/Exception
    //   87	89	190	java/lang/Exception
    //   115	119	190	java/lang/Exception
    //   39	44	218	finally
    //   56	59	218	finally
    //   61	66	218	finally
    //   71	76	218	finally
    //   87	89	218	finally
    //   115	119	218	finally
    //   124	130	231	finally
    //   142	149	231	finally
    //   152	159	231	finally
    //   193	196	231	finally
    //   124	130	241	java/lang/Exception
    //   142	149	241	java/lang/Exception
    //   152	159	241	java/lang/Exception
  }
  
  /* Error */
  public static ArrayList a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 232	java/util/ArrayList
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial 233	java/util/ArrayList:<init>	()V
    //   10: ldc2_w 234
    //   13: lstore_3
    //   14: lload_3
    //   15: invokestatic 242	android/os/SystemClock:sleep	(J)V
    //   18: ldc -12
    //   20: astore 5
    //   22: ldc -10
    //   24: astore 6
    //   26: aload 5
    //   28: aload 6
    //   30: invokestatic 249	com/vvt/p/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   33: astore 5
    //   35: aload 5
    //   37: ifnull +96 -> 133
    //   40: invokestatic 251	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:e	()Ljava/lang/String;
    //   43: astore 6
    //   45: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   48: istore 7
    //   50: iload 7
    //   52: ifeq +3 -> 55
    //   55: iconst_m1
    //   56: istore 7
    //   58: iload_0
    //   59: iload 7
    //   61: if_icmpne +7 -> 68
    //   64: iconst_m1
    //   65: iconst_1
    //   66: iushr
    //   67: istore_0
    //   68: iconst_2
    //   69: istore 7
    //   71: iload 7
    //   73: anewarray 39	java/lang/String
    //   76: astore 8
    //   78: iconst_0
    //   79: istore 9
    //   81: aconst_null
    //   82: astore 10
    //   84: iconst_0
    //   85: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   88: astore 10
    //   90: aload 8
    //   92: iconst_0
    //   93: aload 10
    //   95: aastore
    //   96: iconst_1
    //   97: istore 9
    //   99: iload_0
    //   100: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   103: astore 10
    //   105: aload 8
    //   107: iload 9
    //   109: aload 10
    //   111: aastore
    //   112: aload 5
    //   114: aload 6
    //   116: aload 8
    //   118: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   121: astore_1
    //   122: aload_1
    //   123: ifnull +10 -> 133
    //   126: aload 5
    //   128: aload_1
    //   129: invokestatic 254	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;)Ljava/util/ArrayList;
    //   132: astore_2
    //   133: aload_1
    //   134: ifnull +9 -> 143
    //   137: aload_1
    //   138: invokeinterface 72 1 0
    //   143: aload 5
    //   145: ifnull +8 -> 153
    //   148: aload 5
    //   150: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   153: aload_2
    //   154: areturn
    //   155: astore 5
    //   157: aconst_null
    //   158: astore 5
    //   160: getstatic 21	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   163: istore 11
    //   165: iload 11
    //   167: ifeq +3 -> 170
    //   170: aload_1
    //   171: ifnull +9 -> 180
    //   174: aload_1
    //   175: invokeinterface 72 1 0
    //   180: aload 5
    //   182: ifnull -29 -> 153
    //   185: goto -37 -> 148
    //   188: astore_2
    //   189: aconst_null
    //   190: astore 5
    //   192: aload_1
    //   193: ifnull +9 -> 202
    //   196: aload_1
    //   197: invokeinterface 72 1 0
    //   202: aload 5
    //   204: ifnull +8 -> 212
    //   207: aload 5
    //   209: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   212: aload_2
    //   213: athrow
    //   214: astore_2
    //   215: goto -23 -> 192
    //   218: astore 6
    //   220: goto -60 -> 160
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	paramInt	int
    //   1	196	1	localCursor	Cursor
    //   5	149	2	localArrayList	ArrayList
    //   188	25	2	localObject1	Object
    //   214	1	2	localObject2	Object
    //   13	2	3	l	long
    //   20	129	5	localObject3	Object
    //   155	1	5	localException1	Exception
    //   158	50	5	localObject4	Object
    //   24	91	6	str1	String
    //   218	1	6	localException2	Exception
    //   48	3	7	bool1	boolean
    //   56	16	7	i	int
    //   76	41	8	arrayOfString	String[]
    //   79	29	9	j	int
    //   82	28	10	str2	String
    //   163	3	11	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   14	18	155	java/lang/Exception
    //   28	33	155	java/lang/Exception
    //   14	18	188	finally
    //   28	33	188	finally
    //   40	43	214	finally
    //   45	48	214	finally
    //   71	76	214	finally
    //   84	88	214	finally
    //   93	96	214	finally
    //   99	103	214	finally
    //   109	112	214	finally
    //   116	121	214	finally
    //   128	132	214	finally
    //   160	163	214	finally
    //   40	43	218	java/lang/Exception
    //   45	48	218	java/lang/Exception
    //   71	76	218	java/lang/Exception
    //   84	88	218	java/lang/Exception
    //   93	96	218	java/lang/Exception
    //   99	103	218	java/lang/Exception
    //   109	112	218	java/lang/Exception
    //   116	121	218	java/lang/Exception
    //   128	132	218	java/lang/Exception
  }
  
  /* Error */
  public static ArrayList a(int paramInt, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 232	java/util/ArrayList
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial 233	java/util/ArrayList:<init>	()V
    //   10: bipush 17
    //   12: istore 4
    //   14: iload 4
    //   16: aload_1
    //   17: invokestatic 32	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   20: astore 5
    //   22: aload 5
    //   24: ifnull +96 -> 120
    //   27: invokestatic 251	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:e	()Ljava/lang/String;
    //   30: astore 6
    //   32: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   35: istore 7
    //   37: iload 7
    //   39: ifeq +3 -> 42
    //   42: iconst_m1
    //   43: istore 7
    //   45: iload_0
    //   46: iload 7
    //   48: if_icmpne +7 -> 55
    //   51: iconst_m1
    //   52: iconst_1
    //   53: iushr
    //   54: istore_0
    //   55: iconst_2
    //   56: istore 7
    //   58: iload 7
    //   60: anewarray 39	java/lang/String
    //   63: astore 8
    //   65: iconst_0
    //   66: istore 9
    //   68: aconst_null
    //   69: astore 10
    //   71: iconst_0
    //   72: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   75: astore 10
    //   77: aload 8
    //   79: iconst_0
    //   80: aload 10
    //   82: aastore
    //   83: iconst_1
    //   84: istore 9
    //   86: iload_0
    //   87: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   90: astore 10
    //   92: aload 8
    //   94: iload 9
    //   96: aload 10
    //   98: aastore
    //   99: aload 5
    //   101: aload 6
    //   103: aload 8
    //   105: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   108: astore_2
    //   109: aload_2
    //   110: ifnull +10 -> 120
    //   113: aload 5
    //   115: aload_2
    //   116: invokestatic 254	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;)Ljava/util/ArrayList;
    //   119: astore_3
    //   120: aload_2
    //   121: ifnull +9 -> 130
    //   124: aload_2
    //   125: invokeinterface 72 1 0
    //   130: aload 5
    //   132: ifnull +8 -> 140
    //   135: aload 5
    //   137: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   140: aload_3
    //   141: areturn
    //   142: astore 5
    //   144: iconst_0
    //   145: istore 4
    //   147: aconst_null
    //   148: astore 5
    //   150: getstatic 21	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   153: istore 11
    //   155: iload 11
    //   157: ifeq +3 -> 160
    //   160: aload_2
    //   161: ifnull +9 -> 170
    //   164: aload_2
    //   165: invokeinterface 72 1 0
    //   170: aload 5
    //   172: ifnull -32 -> 140
    //   175: goto -40 -> 135
    //   178: astore_3
    //   179: iconst_0
    //   180: istore 4
    //   182: aconst_null
    //   183: astore 5
    //   185: aload_2
    //   186: ifnull +9 -> 195
    //   189: aload_2
    //   190: invokeinterface 72 1 0
    //   195: aload 5
    //   197: ifnull +8 -> 205
    //   200: aload 5
    //   202: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   205: aload_3
    //   206: athrow
    //   207: astore_3
    //   208: goto -23 -> 185
    //   211: astore 6
    //   213: goto -63 -> 150
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	216	0	paramInt	int
    //   0	216	1	paramString	String
    //   1	189	2	localCursor	Cursor
    //   5	136	3	localArrayList	ArrayList
    //   178	28	3	localObject1	Object
    //   207	1	3	localObject2	Object
    //   12	169	4	i	int
    //   20	116	5	localSQLiteDatabase	SQLiteDatabase
    //   142	1	5	localException1	Exception
    //   148	53	5	localObject3	Object
    //   30	72	6	str1	String
    //   211	1	6	localException2	Exception
    //   35	3	7	bool1	boolean
    //   43	16	7	j	int
    //   63	41	8	arrayOfString	String[]
    //   66	29	9	k	int
    //   69	28	10	str2	String
    //   153	3	11	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   16	20	142	java/lang/Exception
    //   16	20	178	finally
    //   27	30	207	finally
    //   32	35	207	finally
    //   58	63	207	finally
    //   71	75	207	finally
    //   80	83	207	finally
    //   86	90	207	finally
    //   96	99	207	finally
    //   103	108	207	finally
    //   115	119	207	finally
    //   150	153	207	finally
    //   27	30	211	java/lang/Exception
    //   32	35	211	java/lang/Exception
    //   58	63	211	java/lang/Exception
    //   71	75	211	java/lang/Exception
    //   80	83	211	java/lang/Exception
    //   86	90	211	java/lang/Exception
    //   96	99	211	java/lang/Exception
    //   103	108	211	java/lang/Exception
    //   115	119	211	java/lang/Exception
  }
  
  public static ArrayList a(long paramLong1, long paramLong2)
  {
    localSQLiteDatabase = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    long l = 30000L;
    try
    {
      SystemClock.sleep(l);
      String str1 = "com.facebook.orca";
      String str2 = "threads_db2";
      localSQLiteDatabase = c.a(str1, str2);
      localArrayList = a(localSQLiteDatabase, paramLong1, paramLong2);
      if (localSQLiteDatabase == null) {
        break label59;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if ((bool) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label94;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    label59:
    return localArrayList;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, long paramLong1, long paramLong2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = false;
    localCursor = null;
    try
    {
      String str1 = f();
      boolean bool3 = a;
      if (bool3) {}
      int i = 2;
      String[] arrayOfString = new String[i];
      int j = 0;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramLong1);
      String str2 = "";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      localObject2 = ((StringBuilder)localObject2).toString();
      arrayOfString[0] = localObject2;
      j = 1;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append(paramLong2);
      str2 = "";
      localObject2 = ((StringBuilder)localObject2).append(str2);
      localObject2 = ((StringBuilder)localObject2).toString();
      arrayOfString[j] = localObject2;
      localCursor = paramSQLiteDatabase.rawQuery(str1, arrayOfString);
      if (localCursor != null) {
        localArrayList = a(paramSQLiteDatabase, localCursor);
      }
      if (localCursor == null) {
        break label183;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool4 = c;
        if ((bool4) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label230;
      }
      localCursor.close();
    }
    localCursor.close();
    label183:
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  public static ArrayList a(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = false;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = null;
    long l1 = -1;
    bool1 = false;
    String str = null;
    boolean bool3 = paramCursor.moveToLast();
    Object localObject5;
    long l2;
    int m;
    if (bool3)
    {
      bool3 = a;
      if (bool3) {}
      bool3 = false;
      localObject5 = null;
      bool2 = false;
      localObject1 = null;
      localObject2 = null;
      localObject3 = null;
      l2 = l1;
      m = 0;
      str = "xma";
    }
    for (;;)
    {
      try
      {
        int i = paramCursor.getColumnIndex(str);
        str = paramCursor.getString(i);
        int n = com.vvt.ag.b.a(str);
        if (n != 0) {
          continue;
        }
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        str = "story_attachment";
        localJSONObject = localJSONObject.getJSONObject(str);
        str = "attachment_properties";
        str = localJSONObject.getString(str);
        boolean bool5 = com.vvt.ag.b.a(str);
        if (bool5)
        {
          str = "properties";
          str = localJSONObject.getString(str);
        }
        n = a;
        if (n != 0) {}
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(str);
        if (localJSONArray == null) {
          continue;
        }
        com.vvt.capture.b.a locala = new com/vvt/capture/b/a;
        locala.<init>();
        int i1 = localJSONArray.length();
        str = null;
        n = 0;
        localJSONObject = null;
        i = m;
        l1 = l2;
        localObject4 = localObject3;
        localObject3 = localObject2;
        localObject2 = localObject1;
        if (n < i1)
        {
          localObject1 = new org/json/JSONObject;
          Object localObject6 = localJSONArray.getJSONObject(n);
          localObject6 = ((JSONObject)localObject6).toString();
          ((JSONObject)localObject1).<init>((String)localObject6);
          localObject6 = "key";
          localObject6 = ((JSONObject)localObject1).getString((String)localObject6);
          Object localObject7 = "value";
          localObject1 = ((JSONObject)localObject1).getString((String)localObject7);
          localObject7 = new org/json/JSONObject;
          ((JSONObject)localObject7).<init>((String)localObject1);
          localObject1 = "text";
          localObject1 = ((JSONObject)localObject7).getString((String)localObject1);
          localObject7 = "senderID";
          boolean bool6 = ((String)localObject6).equals(localObject7);
          if (bool6)
          {
            int k = n + 1;
            n = k;
            localObject5 = localObject1;
            continue;
          }
          localObject7 = "peerUserID";
          bool6 = ((String)localObject6).equals(localObject7);
          if (bool6)
          {
            localObject3 = a(paramSQLiteDatabase, (String)localObject1);
            localObject2 = localObject1;
            localObject1 = localObject5;
            continue;
          }
          localObject7 = "duration";
          bool6 = ((String)localObject6).equals(localObject7);
          if (bool6)
          {
            bool7 = com.vvt.ag.b.a((String)localObject1);
            if (bool7) {
              break label762;
            }
            i = Integer.parseInt((String)localObject1);
            localObject1 = localObject5;
            continue;
          }
          localObject7 = "timestamp";
          boolean bool7 = ((String)localObject6).equals(localObject7);
          if (!bool7) {
            break label762;
          }
          bool7 = com.vvt.ag.b.a((String)localObject1);
          if (bool7) {
            break label762;
          }
          l1 = Long.parseLong((String)localObject1);
          localObject4 = new java/text/SimpleDateFormat;
          localObject1 = "dd/MM/yy HH:mm:ss";
          ((SimpleDateFormat)localObject4).<init>((String)localObject1);
          localObject1 = new java/util/Date;
          ((Date)localObject1).<init>(l1);
          localObject4 = ((SimpleDateFormat)localObject4).format((Date)localObject1);
          localObject1 = localObject5;
          continue;
        }
        bool2 = com.vvt.ag.b.a((String)localObject3);
        if (!bool2)
        {
          locala.b(l1);
          locala.d((String)localObject4);
          localObject1 = a((String)localObject5, (String)localObject2, i);
          locala.a((ICallLogData.Direction)localObject1);
          long l3 = i;
          locala.a(l3);
          locala.a((String)localObject2);
          locala.b((String)localObject3);
          bool2 = false;
          localObject1 = null;
          locala.a(0);
          localObject1 = ICallLogData.IsMonitor.NO;
          locala.a((ICallLogData.IsMonitor)localObject1);
          bool2 = false;
          localObject1 = null;
          locala.b(0);
          localArrayList.add(locala);
        }
        localObject1 = localObject5;
      }
      catch (Exception localException)
      {
        boolean bool4;
        int j = c;
        if (j == 0) {
          continue;
        }
        continue;
        j = m;
        l1 = l2;
        localObject4 = localObject3;
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject5;
        continue;
        localObject5 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject4;
        l2 = l1;
        m = j;
      }
      bool4 = paramCursor.moveToPrevious();
      if (!bool4)
      {
        j = a;
        if (j != 0) {}
        j = a;
        if (j != 0) {}
        return localArrayList;
      }
      break;
      label762:
      localObject1 = localObject5;
    }
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2)
  {
    localSQLiteDatabase = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 17;
    try
    {
      localSQLiteDatabase = c.a(i, paramString);
      if (localSQLiteDatabase != null) {
        localArrayList = a(localSQLiteDatabase, paramLong1, paramLong2);
      }
      if (localSQLiteDatabase == null) {
        break label49;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if ((bool) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label83;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    label49:
    return localArrayList;
  }
  
  /* Error */
  public static int b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: iconst_m1
    //   3: istore_1
    //   4: ldc -12
    //   6: astore_2
    //   7: aload_2
    //   8: invokestatic 371	com/vvt/capture/removeFromPath/a/a:a	(Ljava/lang/String;)Ljava/lang/String;
    //   11: astore_2
    //   12: aload_2
    //   13: invokestatic 26	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   16: istore_3
    //   17: iload_3
    //   18: ifne +211 -> 229
    //   21: ldc -12
    //   23: astore_2
    //   24: ldc -10
    //   26: astore 4
    //   28: aload_2
    //   29: aload 4
    //   31: invokestatic 249	com/vvt/p/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   34: astore_2
    //   35: aload_2
    //   36: ifnull +104 -> 140
    //   39: invokestatic 36	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:AppEngine1	()Ljava/lang/String;
    //   42: astore 4
    //   44: iconst_2
    //   45: istore 5
    //   47: iload 5
    //   49: anewarray 39	java/lang/String
    //   52: astore 6
    //   54: iconst_0
    //   55: istore 7
    //   57: iconst_0
    //   58: istore 8
    //   60: aconst_null
    //   61: astore 9
    //   63: iconst_0
    //   64: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   67: astore 9
    //   69: aload 6
    //   71: iconst_0
    //   72: aload 9
    //   74: aastore
    //   75: iconst_1
    //   76: istore 7
    //   78: iconst_1
    //   79: istore 8
    //   81: iload 8
    //   83: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   86: astore 9
    //   88: aload 6
    //   90: iload 7
    //   92: aload 9
    //   94: aastore
    //   95: aload_2
    //   96: aload 4
    //   98: aload 6
    //   100: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   103: astore_0
    //   104: aload_0
    //   105: invokeinterface 58 1 0
    //   110: istore 10
    //   112: iload 10
    //   114: ifeq +26 -> 140
    //   117: ldc 60
    //   119: astore 4
    //   121: aload_0
    //   122: aload 4
    //   124: invokeinterface 64 2 0
    //   129: istore 10
    //   131: aload_0
    //   132: iload 10
    //   134: invokeinterface 68 2 0
    //   139: istore_1
    //   140: aload_0
    //   141: ifnull +9 -> 150
    //   144: aload_0
    //   145: invokeinterface 72 1 0
    //   150: aload_2
    //   151: ifnull +7 -> 158
    //   154: aload_2
    //   155: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   158: iload_1
    //   159: ireturn
    //   160: astore_2
    //   161: iconst_0
    //   162: istore_3
    //   163: aconst_null
    //   164: astore_2
    //   165: getstatic 21	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   168: istore 10
    //   170: iload 10
    //   172: ifeq +3 -> 175
    //   175: aload_0
    //   176: ifnull +9 -> 185
    //   179: aload_0
    //   180: invokeinterface 72 1 0
    //   185: aload_2
    //   186: ifnull -28 -> 158
    //   189: goto -35 -> 154
    //   192: astore 11
    //   194: iconst_0
    //   195: istore_3
    //   196: aconst_null
    //   197: astore_2
    //   198: aload_0
    //   199: ifnull +9 -> 208
    //   202: aload_0
    //   203: invokeinterface 72 1 0
    //   208: aload_2
    //   209: ifnull +7 -> 216
    //   212: aload_2
    //   213: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   216: aload 11
    //   218: athrow
    //   219: astore 11
    //   221: goto -23 -> 198
    //   224: astore 4
    //   226: goto -61 -> 165
    //   229: iconst_0
    //   230: istore_3
    //   231: aconst_null
    //   232: astore_2
    //   233: goto -93 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	202	0	localCursor	Cursor
    //   3	156	1	i	int
    //   6	149	2	localObject1	Object
    //   160	1	2	localException1	Exception
    //   164	69	2	localObject2	Object
    //   16	215	3	bool1	boolean
    //   26	97	4	str1	String
    //   224	1	4	localException2	Exception
    //   45	3	5	j	int
    //   52	47	6	arrayOfString	String[]
    //   55	36	7	k	int
    //   58	24	8	m	int
    //   61	32	9	str2	String
    //   110	3	10	bool2	boolean
    //   129	4	10	n	int
    //   168	3	10	bool3	boolean
    //   192	25	11	localObject3	Object
    //   219	1	11	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   7	11	160	java/lang/Exception
    //   12	16	160	java/lang/Exception
    //   29	34	160	java/lang/Exception
    //   7	11	192	finally
    //   12	16	192	finally
    //   29	34	192	finally
    //   39	42	219	finally
    //   47	52	219	finally
    //   63	67	219	finally
    //   72	75	219	finally
    //   81	86	219	finally
    //   92	95	219	finally
    //   98	103	219	finally
    //   104	110	219	finally
    //   122	129	219	finally
    //   132	139	219	finally
    //   165	168	219	finally
    //   39	42	224	java/lang/Exception
    //   47	52	224	java/lang/Exception
    //   63	67	224	java/lang/Exception
    //   72	75	224	java/lang/Exception
    //   81	86	224	java/lang/Exception
    //   92	95	224	java/lang/Exception
    //   98	103	224	java/lang/Exception
    //   104	110	224	java/lang/Exception
    //   122	129	224	java/lang/Exception
    //   132	139	224	java/lang/Exception
  }
  
  /* Error */
  public static long b(String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: iconst_m1
    //   13: i2l
    //   14: lstore 4
    //   16: aload_0
    //   17: invokestatic 26	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   20: istore 6
    //   22: iload 6
    //   24: ifne +240 -> 264
    //   27: bipush 17
    //   29: istore 6
    //   31: iload 6
    //   33: aload_0
    //   34: invokestatic 32	com/vvt/p/MyUncaughtExceptionHandler:a	(ILjava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   37: astore 7
    //   39: aload 7
    //   41: ifnull +107 -> 148
    //   44: invokestatic 374	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:FxFileObserverWorker	()Ljava/lang/String;
    //   47: astore 8
    //   49: iconst_2
    //   50: istore 9
    //   52: iload 9
    //   54: anewarray 39	java/lang/String
    //   57: astore 10
    //   59: iconst_0
    //   60: istore 11
    //   62: iconst_0
    //   63: istore 12
    //   65: aconst_null
    //   66: astore 13
    //   68: iconst_0
    //   69: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   72: astore 13
    //   74: aload 10
    //   76: iconst_0
    //   77: aload 13
    //   79: aastore
    //   80: iconst_1
    //   81: istore 11
    //   83: iconst_1
    //   84: istore 12
    //   86: iload 12
    //   88: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   91: astore 13
    //   93: aload 10
    //   95: iload 11
    //   97: aload 13
    //   99: aastore
    //   100: aload 7
    //   102: aload 8
    //   104: aload 10
    //   106: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   109: astore_2
    //   110: aload_2
    //   111: invokeinterface 58 1 0
    //   116: istore 14
    //   118: iload 14
    //   120: ifeq +28 -> 148
    //   123: ldc_w 376
    //   126: astore 8
    //   128: aload_2
    //   129: aload 8
    //   131: invokeinterface 64 2 0
    //   136: istore 14
    //   138: aload_2
    //   139: iload 14
    //   141: invokeinterface 380 2 0
    //   146: lstore 4
    //   148: aload_2
    //   149: ifnull +9 -> 158
    //   152: aload_2
    //   153: invokeinterface 72 1 0
    //   158: aload 7
    //   160: ifnull +8 -> 168
    //   163: aload 7
    //   165: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   168: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   171: istore_1
    //   172: iload_1
    //   173: ifeq +3 -> 176
    //   176: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   179: istore_1
    //   180: iload_1
    //   181: ifeq +3 -> 184
    //   184: lload 4
    //   186: lreturn
    //   187: astore 7
    //   189: iconst_0
    //   190: istore 6
    //   192: aconst_null
    //   193: astore 7
    //   195: getstatic 21	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   198: istore 14
    //   200: iload 14
    //   202: ifeq +3 -> 205
    //   205: aload_2
    //   206: ifnull +9 -> 215
    //   209: aload_2
    //   210: invokeinterface 72 1 0
    //   215: aload 7
    //   217: ifnull -49 -> 168
    //   220: goto -57 -> 163
    //   223: astore 15
    //   225: iconst_0
    //   226: istore 6
    //   228: aconst_null
    //   229: astore 7
    //   231: aload_2
    //   232: ifnull +9 -> 241
    //   235: aload_2
    //   236: invokeinterface 72 1 0
    //   241: aload 7
    //   243: ifnull +8 -> 251
    //   246: aload 7
    //   248: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   251: aload 15
    //   253: athrow
    //   254: astore 15
    //   256: goto -25 -> 231
    //   259: astore 8
    //   261: goto -66 -> 195
    //   264: iconst_0
    //   265: istore 6
    //   267: aconst_null
    //   268: astore 7
    //   270: goto -122 -> 148
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	273	0	paramString	String
    //   1	180	1	bool1	boolean
    //   3	233	2	localCursor	Cursor
    //   7	2	3	bool2	boolean
    //   14	171	4	l	long
    //   20	3	6	bool3	boolean
    //   29	237	6	i	int
    //   37	127	7	localSQLiteDatabase	SQLiteDatabase
    //   187	1	7	localException1	Exception
    //   193	76	7	localObject1	Object
    //   47	83	8	str1	String
    //   259	1	8	localException2	Exception
    //   50	3	9	j	int
    //   57	48	10	arrayOfString	String[]
    //   60	36	11	k	int
    //   63	24	12	m	int
    //   66	32	13	str2	String
    //   116	3	14	bool4	boolean
    //   136	4	14	n	int
    //   198	3	14	bool5	boolean
    //   223	29	15	localObject2	Object
    //   254	1	15	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   16	20	187	java/lang/Exception
    //   33	37	187	java/lang/Exception
    //   16	20	223	finally
    //   33	37	223	finally
    //   44	47	254	finally
    //   52	57	254	finally
    //   68	72	254	finally
    //   77	80	254	finally
    //   86	91	254	finally
    //   97	100	254	finally
    //   104	109	254	finally
    //   110	116	254	finally
    //   129	136	254	finally
    //   139	146	254	finally
    //   195	198	254	finally
    //   44	47	259	java/lang/Exception
    //   52	57	259	java/lang/Exception
    //   68	72	259	java/lang/Exception
    //   77	80	259	java/lang/Exception
    //   86	91	259	java/lang/Exception
    //   97	100	259	java/lang/Exception
    //   104	109	259	java/lang/Exception
    //   110	116	259	java/lang/Exception
    //   129	136	259	java/lang/Exception
    //   139	146	259	java/lang/Exception
  }
  
  public static List c()
  {
    int i = 2;
    int j = 1;
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new Object[i];
    localObject1[0] = "/data/data";
    localObject1[j] = "com.facebook.orca";
    Object localObject2 = String.format("%s/%s/databases", (Object[])localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = (String)localObject2 + "/threads_db2";
    localArrayList.add(localObject2);
    localObject1 = new Object[i];
    localObject1[0] = "/dbdata/databases";
    String str = "com.facebook.orca";
    localObject1[j] = str;
    localObject2 = String.format("%s/%s", (Object[])localObject1);
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = "/threads_db2";
    localObject2 = (String)localObject1;
    localArrayList.add(localObject2);
    boolean bool2 = b;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  /* Error */
  public static long d()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_0
    //   2: aconst_null
    //   3: astore_1
    //   4: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   7: istore_2
    //   8: iload_2
    //   9: ifeq +3 -> 12
    //   12: iconst_m1
    //   13: i2l
    //   14: lstore_3
    //   15: ldc -12
    //   17: astore 5
    //   19: aload 5
    //   21: invokestatic 371	com/vvt/capture/removeFromPath/a/a:a	(Ljava/lang/String;)Ljava/lang/String;
    //   24: astore 5
    //   26: aload 5
    //   28: invokestatic 26	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   31: istore 6
    //   33: iload 6
    //   35: ifne +243 -> 278
    //   38: ldc -12
    //   40: astore 5
    //   42: ldc -10
    //   44: astore 7
    //   46: aload 5
    //   48: aload 7
    //   50: invokestatic 249	com/vvt/p/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   53: astore 5
    //   55: aload 5
    //   57: ifnull +106 -> 163
    //   60: invokestatic 374	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:FxFileObserverWorker	()Ljava/lang/String;
    //   63: astore 7
    //   65: iconst_2
    //   66: istore 8
    //   68: iload 8
    //   70: anewarray 39	java/lang/String
    //   73: astore 9
    //   75: iconst_0
    //   76: istore 10
    //   78: iconst_0
    //   79: istore 11
    //   81: aconst_null
    //   82: astore 12
    //   84: iconst_0
    //   85: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   88: astore 12
    //   90: aload 9
    //   92: iconst_0
    //   93: aload 12
    //   95: aastore
    //   96: iconst_1
    //   97: istore 10
    //   99: iconst_1
    //   100: istore 11
    //   102: iload 11
    //   104: invokestatic 45	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   107: astore 12
    //   109: aload 9
    //   111: iload 10
    //   113: aload 12
    //   115: aastore
    //   116: aload 5
    //   118: aload 7
    //   120: aload 9
    //   122: invokevirtual 52	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   125: astore_1
    //   126: aload_1
    //   127: invokeinterface 58 1 0
    //   132: istore 13
    //   134: iload 13
    //   136: ifeq +27 -> 163
    //   139: ldc_w 376
    //   142: astore 7
    //   144: aload_1
    //   145: aload 7
    //   147: invokeinterface 64 2 0
    //   152: istore 13
    //   154: aload_1
    //   155: iload 13
    //   157: invokeinterface 380 2 0
    //   162: lstore_3
    //   163: aload_1
    //   164: ifnull +9 -> 173
    //   167: aload_1
    //   168: invokeinterface 72 1 0
    //   173: aload 5
    //   175: ifnull +8 -> 183
    //   178: aload 5
    //   180: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   183: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   186: istore_0
    //   187: iload_0
    //   188: ifeq +3 -> 191
    //   191: getstatic 13	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   194: istore_0
    //   195: iload_0
    //   196: ifeq +3 -> 199
    //   199: lload_3
    //   200: lreturn
    //   201: astore 5
    //   203: iconst_0
    //   204: istore 6
    //   206: aconst_null
    //   207: astore 5
    //   209: getstatic 21	com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   212: istore 13
    //   214: iload 13
    //   216: ifeq +3 -> 219
    //   219: aload_1
    //   220: ifnull +9 -> 229
    //   223: aload_1
    //   224: invokeinterface 72 1 0
    //   229: aload 5
    //   231: ifnull -48 -> 183
    //   234: goto -56 -> 178
    //   237: astore 14
    //   239: iconst_0
    //   240: istore 6
    //   242: aconst_null
    //   243: astore 5
    //   245: aload_1
    //   246: ifnull +9 -> 255
    //   249: aload_1
    //   250: invokeinterface 72 1 0
    //   255: aload 5
    //   257: ifnull +8 -> 265
    //   260: aload 5
    //   262: invokevirtual 73	android/database/sqlite/SQLiteDatabase:close	()V
    //   265: aload 14
    //   267: athrow
    //   268: astore 14
    //   270: goto -25 -> 245
    //   273: astore 7
    //   275: goto -66 -> 209
    //   278: iconst_0
    //   279: istore 6
    //   281: aconst_null
    //   282: astore 5
    //   284: goto -121 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	195	0	bool1	boolean
    //   3	247	1	localCursor	Cursor
    //   7	2	2	bool2	boolean
    //   14	186	3	l	long
    //   17	162	5	localObject1	Object
    //   201	1	5	localException1	Exception
    //   207	76	5	localObject2	Object
    //   31	249	6	bool3	boolean
    //   44	102	7	str1	String
    //   273	1	7	localException2	Exception
    //   66	3	8	i	int
    //   73	48	9	arrayOfString	String[]
    //   76	36	10	j	int
    //   79	24	11	k	int
    //   82	32	12	str2	String
    //   132	3	13	bool4	boolean
    //   152	4	13	m	int
    //   212	3	13	bool5	boolean
    //   237	29	14	localObject3	Object
    //   268	1	14	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   19	24	201	java/lang/Exception
    //   26	31	201	java/lang/Exception
    //   48	53	201	java/lang/Exception
    //   19	24	237	finally
    //   26	31	237	finally
    //   48	53	237	finally
    //   60	63	268	finally
    //   68	73	268	finally
    //   84	88	268	finally
    //   93	96	268	finally
    //   102	107	268	finally
    //   113	116	268	finally
    //   120	125	268	finally
    //   126	132	268	finally
    //   145	152	268	finally
    //   155	162	268	finally
    //   209	212	268	finally
    //   60	63	273	java/lang/Exception
    //   68	73	273	java/lang/Exception
    //   84	88	273	java/lang/Exception
    //   93	96	273	java/lang/Exception
    //   102	107	273	java/lang/Exception
    //   113	116	273	java/lang/Exception
    //   120	125	273	java/lang/Exception
    //   126	132	273	java/lang/Exception
    //   145	152	273	java/lang/Exception
    //   155	162	273	java/lang/Exception
  }
  
  private static String e()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msg_id AS id, ");
    localStringBuilder.append("timestamp_ms as time, ");
    localStringBuilder.append("xma ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("WHERE msg_type = 9 AND time > ? ");
    localStringBuilder.append("AND id NOT LIKE 'sent%' ");
    localStringBuilder.append("ORDER BY time DESC ");
    localStringBuilder.append("LIMIT ?");
    return localStringBuilder.toString();
  }
  
  private static String f()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msg_id AS id, ");
    localStringBuilder.append("timestamp_ms as time, ");
    localStringBuilder.append("xma ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("WHERE msg_type = 9 AND time > ? AND time <= ? ");
    localStringBuilder.append("AND id NOT LIKE 'sent%' ");
    localStringBuilder.append("ORDER BY time DESC ");
    return localStringBuilder.toString();
  }
  
  private static String g()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msg_id AS id, ");
    localStringBuilder.append("timestamp_ms as time ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("where msg_type = 9 AND time > ? ");
    localStringBuilder.append("AND id NOT LIKE 'sent%' ");
    localStringBuilder.append("ORDER BY time DESC ");
    localStringBuilder.append("LIMIT ?");
    return localStringBuilder.toString();
  }
  
  private static String h()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("msg_type, ");
    localStringBuilder.append("msg_id AS id, ");
    localStringBuilder.append("timestamp_ms as time ");
    localStringBuilder.append("FROM messages ");
    localStringBuilder.append("where msg_type = 9 OR msg_type = 0 AND time > ? ");
    localStringBuilder.append("AND id NOT LIKE 'sent%' ");
    localStringBuilder.append("ORDER BY time DESC ");
    localStringBuilder.append("LIMIT ?");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */