package org.eclipse.paho.client.mqttv3.a;

import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.a.b.l;
import org.eclipse.paho.client.mqttv3.a.b.o;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.f;
import org.eclipse.paho.client.mqttv3.j;
import org.eclipse.paho.client.mqttv3.n;

public class e
  implements Runnable
{
  private static final String b = e.class.getName();
  private static final org.eclipse.paho.client.mqttv3.b.b c;
  public boolean a = false;
  private f d;
  private a e;
  private Vector f;
  private Vector g;
  private boolean h = false;
  private Object i;
  private Thread j;
  private Object k;
  private Object l;
  private d m;
  
  static
  {
    String str = b;
    c = org.eclipse.paho.client.mqttv3.b.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  e(a parama)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.i = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.k = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.l = localObject;
    this.e = parama;
    localObject = new java/util/Vector;
    ((Vector)localObject).<init>(n);
    this.f = ((Vector)localObject);
    localObject = new java/util/Vector;
    ((Vector)localObject).<init>(n);
    this.g = ((Vector)localObject);
    localObject = c;
    String str = parama.j().a();
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).a(str);
  }
  
  private void b(o paramo)
  {
    int n = 2;
    int i1 = 1;
    Object localObject1 = this.d;
    Object localObject2;
    Object localObject3;
    String str1;
    int i3;
    if (localObject1 != null)
    {
      localObject1 = paramo.g();
      localObject2 = c;
      localObject3 = b;
      str1 = "handleMessage";
      String str2 = "713";
      Object[] arrayOfObject = new Object[n];
      Integer localInteger = new java/lang/Integer;
      int i2 = paramo.j();
      localInteger.<init>(i2);
      arrayOfObject[0] = localInteger;
      arrayOfObject[i1] = localObject1;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b((String)localObject3, str1, str2, arrayOfObject);
      localObject2 = this.d;
      localObject3 = paramo.h();
      ((f)localObject2).a((String)localObject1, (org.eclipse.paho.client.mqttv3.k)localObject3);
      localObject1 = paramo.h();
      i3 = ((org.eclipse.paho.client.mqttv3.k)localObject1).c();
      if (i3 != i1) {
        break label185;
      }
      localObject1 = this.e;
      localObject2 = new org/eclipse/paho/client/mqttv3/a/b/k;
      ((org.eclipse.paho.client.mqttv3.a.b.k)localObject2).<init>(paramo);
      localObject3 = new org/eclipse/paho/client/mqttv3/n;
      str1 = this.e.j().a();
      ((n)localObject3).<init>(str1);
      ((a)localObject1).a((u)localObject2, (n)localObject3);
    }
    for (;;)
    {
      return;
      label185:
      localObject1 = paramo.h();
      i3 = ((org.eclipse.paho.client.mqttv3.k)localObject1).c();
      if (i3 == n)
      {
        this.e.a(paramo);
        localObject1 = new org/eclipse/paho/client/mqttv3/a/b/l;
        ((l)localObject1).<init>(paramo);
        localObject2 = this.e;
        localObject3 = new org/eclipse/paho/client/mqttv3/n;
        str1 = this.e.j().a();
        ((n)localObject3).<init>(str1);
        ((a)localObject2).a((u)localObject1, (n)localObject3);
      }
    }
  }
  
  private void c(n paramn)
  {
    Object localObject1 = "handleActionComplete";
    try
    {
      localObject1 = c;
      Object localObject3 = b;
      String str1 = "handleActionComplete";
      String str2 = "705";
      int n = 1;
      Object[] arrayOfObject = new Object[n];
      Object localObject4 = paramn.a;
      localObject4 = ((q)localObject4).m();
      arrayOfObject[0] = localObject4;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject3, str1, str2, arrayOfObject);
      localObject1 = paramn.a;
      ((q)localObject1).f();
      localObject1 = paramn.a;
      boolean bool1 = ((q)localObject1).n();
      if (!bool1)
      {
        localObject1 = this.d;
        if (localObject1 != null)
        {
          bool1 = paramn instanceof j;
          if (bool1)
          {
            bool1 = ((n)paramn).e();
            if (bool1)
            {
              localObject3 = this.d;
              Object localObject5 = paramn;
              localObject5 = (j)paramn;
              localObject1 = localObject5;
              ((f)localObject3).a((org.eclipse.paho.client.mqttv3.c)localObject5);
            }
          }
        }
        a((n)paramn);
      }
      bool1 = paramn instanceof j;
      if (bool1)
      {
        bool1 = ((n)paramn).e();
        if (bool1)
        {
          localObject1 = ((n)paramn).a;
          boolean bool2 = true;
          ((q)localObject1).a(bool2);
        }
      }
      bool1 = ((n)paramn).e();
      if (bool1)
      {
        localObject1 = this.m;
        ((d)localObject1).a((n)paramn);
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public void a()
  {
    // Byte code:
    //   0: ldc -84
    //   2: astore_1
    //   3: aload_0
    //   4: getfield 56	org/eclipse/paho/client/mqttv3/a/e:i	Ljava/lang/Object;
    //   7: astore_2
    //   8: aload_2
    //   9: monitorenter
    //   10: aload_0
    //   11: getfield 52	org/eclipse/paho/client/mqttv3/a/e:a	Z
    //   14: istore_3
    //   15: iload_3
    //   16: ifeq +121 -> 137
    //   19: getstatic 45	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   22: astore_1
    //   23: getstatic 36	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	Ljava/lang/String;
    //   26: astore 4
    //   28: ldc -84
    //   30: astore 5
    //   32: ldc -82
    //   34: astore 6
    //   36: aload_1
    //   37: aload 4
    //   39: aload 5
    //   41: aload 6
    //   43: invokeinterface 177 4 0
    //   48: iconst_0
    //   49: istore_3
    //   50: aconst_null
    //   51: astore_1
    //   52: aload_0
    //   53: iconst_0
    //   54: putfield 52	org/eclipse/paho/client/mqttv3/a/e:a	Z
    //   57: invokestatic 183	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   60: astore_1
    //   61: aload_0
    //   62: getfield 185	org/eclipse/paho/client/mqttv3/a/e:j	Ljava/lang/Thread;
    //   65: astore 4
    //   67: aload_1
    //   68: aload 4
    //   70: invokevirtual 189	java/lang/Object:equals	(Ljava/lang/Object;)Z
    //   73: istore_3
    //   74: iload_3
    //   75: ifne +62 -> 137
    //   78: aload_0
    //   79: getfield 58	org/eclipse/paho/client/mqttv3/a/e:k	Ljava/lang/Object;
    //   82: astore 4
    //   84: aload 4
    //   86: monitorenter
    //   87: getstatic 45	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   90: astore_1
    //   91: getstatic 36	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	Ljava/lang/String;
    //   94: astore 5
    //   96: ldc -84
    //   98: astore 6
    //   100: ldc -65
    //   102: astore 7
    //   104: aload_1
    //   105: aload 5
    //   107: aload 6
    //   109: aload 7
    //   111: invokeinterface 177 4 0
    //   116: aload_0
    //   117: getfield 58	org/eclipse/paho/client/mqttv3/a/e:k	Ljava/lang/Object;
    //   120: astore_1
    //   121: aload_1
    //   122: invokevirtual 194	java/lang/Object:notifyAll	()V
    //   125: aload 4
    //   127: monitorexit
    //   128: aload_0
    //   129: getfield 185	org/eclipse/paho/client/mqttv3/a/e:j	Ljava/lang/Thread;
    //   132: astore_1
    //   133: aload_1
    //   134: invokevirtual 197	java/lang/Thread:join	()V
    //   137: iconst_0
    //   138: istore_3
    //   139: aconst_null
    //   140: astore_1
    //   141: aload_0
    //   142: aconst_null
    //   143: putfield 185	org/eclipse/paho/client/mqttv3/a/e:j	Ljava/lang/Thread;
    //   146: getstatic 45	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   149: astore_1
    //   150: getstatic 36	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	Ljava/lang/String;
    //   153: astore 4
    //   155: ldc -84
    //   157: astore 5
    //   159: ldc -57
    //   161: astore 6
    //   163: aload_1
    //   164: aload 4
    //   166: aload 5
    //   168: aload 6
    //   170: invokeinterface 177 4 0
    //   175: aload_2
    //   176: monitorexit
    //   177: return
    //   178: astore_1
    //   179: aload 4
    //   181: monitorexit
    //   182: aload_1
    //   183: athrow
    //   184: astore_1
    //   185: goto -48 -> 137
    //   188: astore_1
    //   189: aload_2
    //   190: monitorexit
    //   191: aload_1
    //   192: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	this	e
    //   2	162	1	localObject1	Object
    //   178	5	1	localObject2	Object
    //   184	1	1	localInterruptedException	InterruptedException
    //   188	4	1	localObject3	Object
    //   7	183	2	localObject4	Object
    //   14	125	3	bool	boolean
    //   30	137	5	str1	String
    //   34	135	6	str2	String
    //   102	8	7	str3	String
    // Exception table:
    //   from	to	target	type
    //   87	90	178	finally
    //   91	94	178	finally
    //   109	116	178	finally
    //   116	120	178	finally
    //   121	125	178	finally
    //   125	128	178	finally
    //   179	182	178	finally
    //   78	82	184	java/lang/InterruptedException
    //   84	87	184	java/lang/InterruptedException
    //   128	132	184	java/lang/InterruptedException
    //   133	137	184	java/lang/InterruptedException
    //   182	184	184	java/lang/InterruptedException
    //   10	14	188	finally
    //   19	22	188	finally
    //   23	26	188	finally
    //   41	48	188	finally
    //   53	57	188	finally
    //   57	60	188	finally
    //   61	65	188	finally
    //   68	73	188	finally
    //   78	82	188	finally
    //   84	87	188	finally
    //   128	132	188	finally
    //   133	137	188	finally
    //   142	146	188	finally
    //   146	149	188	finally
    //   150	153	188	finally
    //   168	175	188	finally
    //   175	177	188	finally
    //   182	184	188	finally
    //   189	191	188	finally
  }
  
  public void a(String paramString)
  {
    synchronized (this.i)
    {
      boolean bool = this.a;
      if (!bool)
      {
        Object localObject2 = this.f;
        ((Vector)localObject2).clear();
        localObject2 = this.g;
        ((Vector)localObject2).clear();
        bool = true;
        this.a = bool;
        bool = false;
        localObject2 = null;
        this.h = false;
        localObject2 = new java/lang/Thread;
        ((Thread)localObject2).<init>(this, paramString);
        this.j = ((Thread)localObject2);
        localObject2 = this.j;
        ((Thread)localObject2).start();
      }
      return;
    }
  }
  
  public void a(MqttException paramMqttException)
  {
    int n = 1;
    Object localObject1 = "connectionLost";
    try
    {
      localObject1 = this.d;
      if ((localObject1 != null) && (paramMqttException != null))
      {
        localObject1 = c;
        localObject3 = b;
        str1 = "connectionLost";
        str2 = "708";
        int i1 = 1;
        localObject4 = new Object[i1];
        arrayOfObject = null;
        localObject4[0] = paramMqttException;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject3, str1, str2, (Object[])localObject4);
        localObject1 = this.d;
        ((f)localObject1).a(paramMqttException);
      }
      return;
    }
    finally
    {
      for (;;)
      {
        Object localObject3 = c;
        String str1 = b;
        String str2 = "connectionLost";
        Object localObject4 = "720";
        Object[] arrayOfObject = new Object[n];
        arrayOfObject[0] = localObject2;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject3).b(str1, str2, (String)localObject4, arrayOfObject);
      }
    }
  }
  
  public void a(o paramo)
  {
    Object localObject1 = this.d;
    String str1;
    String str2;
    String str3;
    Object localObject2;
    if (localObject1 != null) {
      synchronized (this.l)
      {
        for (;;)
        {
          boolean bool1 = this.h;
          if (bool1) {
            break;
          }
          localObject1 = this.f;
          int n = ((Vector)localObject1).size();
          int i1 = 10;
          if (n < i1) {
            break;
          }
          try
          {
            localObject1 = c;
            str1 = b;
            str2 = "messageArrived";
            str3 = "709";
            ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, str2, str3);
            localObject1 = this.l;
            localObject1.wait();
          }
          catch (InterruptedException localInterruptedException) {}
        }
        boolean bool2 = this.h;
        if (!bool2)
        {
          localObject2 = this.f;
          ((Vector)localObject2).addElement(paramo);
        }
      }
    }
    synchronized (this.k)
    {
      localObject2 = c;
      str1 = b;
      str2 = "messageArrived";
      str3 = "710";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject2).a(str1, str2, str3);
      localObject2 = this.k;
      localObject2.notifyAll();
      return;
      localObject3 = finally;
      throw ((Throwable)localObject3);
    }
  }
  
  public void a(d paramd)
  {
    this.m = paramd;
  }
  
  public void a(f paramf)
  {
    this.d = paramf;
  }
  
  public void a(n paramn)
  {
    int n = 1;
    Object localObject1 = "fireActionEvent";
    Object localObject2;
    String str1;
    String str2;
    String str3;
    Object[] arrayOfObject;
    String str4;
    if (paramn != null)
    {
      localObject1 = paramn.f();
      if (localObject1 != null)
      {
        localObject2 = paramn.d();
        if (localObject2 != null) {
          break label91;
        }
        localObject2 = c;
        str1 = b;
        str2 = "fireActionEvent";
        str3 = "716";
        arrayOfObject = new Object[n];
        str4 = paramn.a.m();
        arrayOfObject[0] = str4;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b(str1, str2, str3, arrayOfObject);
        ((org.eclipse.paho.client.mqttv3.a)localObject1).a(paramn);
      }
    }
    for (;;)
    {
      return;
      label91:
      localObject2 = c;
      str1 = b;
      str2 = "fireActionEvent";
      str3 = "716";
      arrayOfObject = new Object[n];
      str4 = paramn.a.m();
      arrayOfObject[0] = str4;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b(str1, str2, str3, arrayOfObject);
      localObject2 = paramn.d();
      ((org.eclipse.paho.client.mqttv3.a)localObject1).a(paramn, (Throwable)localObject2);
    }
  }
  
  public void b()
  {
    Object localObject1 = "quiesce";
    boolean bool = true;
    this.h = bool;
    synchronized (this.l)
    {
      localObject1 = c;
      String str1 = b;
      String str2 = "quiesce";
      String str3 = "711";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, str2, str3);
      localObject1 = this.l;
      localObject1.notifyAll();
      return;
    }
  }
  
  /* Error */
  public void b(n paramn)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: ldc_w 259
    //   5: astore_3
    //   6: aload_0
    //   7: getfield 52	org/eclipse/paho/client/mqttv3/a/e:a	Z
    //   10: istore 4
    //   12: iload 4
    //   14: ifeq +101 -> 115
    //   17: aload_0
    //   18: getfield 71	org/eclipse/paho/client/mqttv3/a/e:FxFileObserverWorker	Ljava/util/Vector;
    //   21: astore_3
    //   22: aload_3
    //   23: aload_1
    //   24: invokevirtual 233	java/util/Vector:addElement	(Ljava/lang/Object;)V
    //   27: aload_0
    //   28: getfield 58	org/eclipse/paho/client/mqttv3/a/e:k	Ljava/lang/Object;
    //   31: astore 5
    //   33: aload 5
    //   35: monitorenter
    //   36: getstatic 45	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   39: astore_3
    //   40: getstatic 36	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	Ljava/lang/String;
    //   43: astore 6
    //   45: ldc_w 259
    //   48: astore 7
    //   50: ldc_w 261
    //   53: astore_2
    //   54: iconst_1
    //   55: istore 8
    //   57: iload 8
    //   59: anewarray 4	java/lang/Object
    //   62: astore 9
    //   64: aload_1
    //   65: getfield 142	org/eclipse/paho/client/mqttv3/n:a	Lorg/eclipse/paho/client/mqttv3/a/q;
    //   68: astore 10
    //   70: aload 10
    //   72: invokevirtual 146	org/eclipse/paho/client/mqttv3/a/q:m	()Ljava/lang/String;
    //   75: astore 10
    //   77: aload 9
    //   79: iconst_0
    //   80: aload 10
    //   82: aastore
    //   83: aload_3
    //   84: aload 6
    //   86: aload 7
    //   88: aload_2
    //   89: aload 9
    //   91: invokeinterface 106 5 0
    //   96: aload_0
    //   97: getfield 58	org/eclipse/paho/client/mqttv3/a/e:k	Ljava/lang/Object;
    //   100: astore_3
    //   101: aload_3
    //   102: invokevirtual 194	java/lang/Object:notifyAll	()V
    //   105: aload 5
    //   107: monitorexit
    //   108: return
    //   109: astore_3
    //   110: aload 5
    //   112: monitorexit
    //   113: aload_3
    //   114: athrow
    //   115: aload_0
    //   116: aload_1
    //   117: invokespecial 263	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	(Lorg/eclipse/paho/client/mqttv3/n;)V
    //   120: goto -12 -> 108
    //   123: astore 9
    //   125: getstatic 45	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   128: astore_3
    //   129: getstatic 36	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	Ljava/lang/String;
    //   132: astore 5
    //   134: ldc_w 259
    //   137: astore 6
    //   139: ldc_w 265
    //   142: astore 7
    //   144: aload_3
    //   145: aload 5
    //   147: aload 6
    //   149: aload 7
    //   151: aconst_null
    //   152: aload 9
    //   154: invokeinterface 268 6 0
    //   159: aload_0
    //   160: getfield 62	org/eclipse/paho/client/mqttv3/a/e:e	Lorg/eclipse/paho/client/mqttv3/a/a;
    //   163: astore_3
    //   164: new 270	org/eclipse/paho/client/mqttv3/MqttException
    //   167: astore 5
    //   169: aload 5
    //   171: aload 9
    //   173: invokespecial 272	org/eclipse/paho/client/mqttv3/MqttException:<init>	(Ljava/lang/Throwable;)V
    //   176: aload_3
    //   177: aconst_null
    //   178: aload 5
    //   180: invokevirtual 275	org/eclipse/paho/client/mqttv3/a/a:a	(Lorg/eclipse/paho/client/mqttv3/n;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    //   183: goto -75 -> 108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	186	0	this	e
    //   0	186	1	paramn	n
    //   1	88	2	str1	String
    //   5	97	3	localObject1	Object
    //   109	5	3	localObject2	Object
    //   128	49	3	localObject3	Object
    //   10	3	4	bool	boolean
    //   31	148	5	localObject4	Object
    //   43	105	6	str2	String
    //   48	102	7	str3	String
    //   55	3	8	n	int
    //   62	28	9	arrayOfObject	Object[]
    //   123	49	9	localThrowable	Throwable
    //   68	13	10	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   36	39	109	finally
    //   40	43	109	finally
    //   57	62	109	finally
    //   64	68	109	finally
    //   70	75	109	finally
    //   80	83	109	finally
    //   89	96	109	finally
    //   96	100	109	finally
    //   101	105	109	finally
    //   105	108	109	finally
    //   110	113	109	finally
    //   116	120	123	finally
  }
  
  public boolean c()
  {
    boolean bool = this.h;
    Vector localVector;
    int n;
    if (bool)
    {
      localVector = this.g;
      n = localVector.size();
      if (n == 0)
      {
        localVector = this.f;
        n = localVector.size();
        if (n == 0) {
          n = 1;
        }
      }
    }
    for (;;)
    {
      return n;
      int i1 = 0;
      localVector = null;
    }
  }
  
  protected Thread d()
  {
    return this.j;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: ldc_w 277
    //   3: astore_1
    //   4: aload_0
    //   5: getfield 52	org/eclipse/paho/client/mqttv3/a/e:a	Z
    //   8: istore_2
    //   9: iload_2
    //   10: ifeq +398 -> 408
    //   13: aload_0
    //   14: getfield 58	org/eclipse/paho/client/mqttv3/a/e:k	Ljava/lang/Object;
    //   17: astore_3
    //   18: aload_3
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 52	org/eclipse/paho/client/mqttv3/a/e:a	Z
    //   24: istore_2
    //   25: aload_0
    //   26: getfield 69	org/eclipse/paho/client/mqttv3/a/e:f	Ljava/util/Vector;
    //   29: astore 4
    //   31: aload 4
    //   33: invokevirtual 280	java/util/Vector:isEmpty	()Z
    //   36: istore 5
    //   38: iload_2
    //   39: iload 5
    //   41: iand
    //   42: istore_2
    //   43: iload_2
    //   44: ifeq +57 -> 101
    //   47: aload_0
    //   48: getfield 71	org/eclipse/paho/client/mqttv3/a/e:FxFileObserverWorker	Ljava/util/Vector;
    //   51: astore_1
    //   52: aload_1
    //   53: invokevirtual 280	java/util/Vector:isEmpty	()Z
    //   56: istore_2
    //   57: iload_2
    //   58: ifeq +43 -> 101
    //   61: getstatic 45	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   64: astore_1
    //   65: getstatic 36	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	Ljava/lang/String;
    //   68: astore 4
    //   70: ldc_w 277
    //   73: astore 6
    //   75: ldc_w 282
    //   78: astore 7
    //   80: aload_1
    //   81: aload 4
    //   83: aload 6
    //   85: aload 7
    //   87: invokeinterface 177 4 0
    //   92: aload_0
    //   93: getfield 58	org/eclipse/paho/client/mqttv3/a/e:k	Ljava/lang/Object;
    //   96: astore_1
    //   97: aload_1
    //   98: invokevirtual 229	java/lang/Object:wait	()V
    //   101: aload_3
    //   102: monitorexit
    //   103: aload_0
    //   104: getfield 52	org/eclipse/paho/client/mqttv3/a/e:a	Z
    //   107: istore_2
    //   108: iload_2
    //   109: ifeq +141 -> 250
    //   112: aload_0
    //   113: getfield 71	org/eclipse/paho/client/mqttv3/a/e:FxFileObserverWorker	Ljava/util/Vector;
    //   116: astore_3
    //   117: aload_3
    //   118: monitorenter
    //   119: aload_0
    //   120: getfield 71	org/eclipse/paho/client/mqttv3/a/e:FxFileObserverWorker	Ljava/util/Vector;
    //   123: astore_1
    //   124: aload_1
    //   125: invokevirtual 280	java/util/Vector:isEmpty	()Z
    //   128: istore_2
    //   129: iload_2
    //   130: ifne +286 -> 416
    //   133: aload_0
    //   134: getfield 71	org/eclipse/paho/client/mqttv3/a/e:FxFileObserverWorker	Ljava/util/Vector;
    //   137: astore_1
    //   138: iconst_0
    //   139: istore 5
    //   141: aconst_null
    //   142: astore 4
    //   144: aload_1
    //   145: iconst_0
    //   146: invokevirtual 286	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   149: astore_1
    //   150: aload_1
    //   151: checkcast 125	org/eclipse/paho/client/mqttv3/n
    //   154: astore_1
    //   155: aload_0
    //   156: getfield 71	org/eclipse/paho/client/mqttv3/a/e:FxFileObserverWorker	Ljava/util/Vector;
    //   159: astore 4
    //   161: aconst_null
    //   162: astore 6
    //   164: aload 4
    //   166: iconst_0
    //   167: invokevirtual 289	java/util/Vector:removeElementAt	(I)V
    //   170: aload_3
    //   171: monitorexit
    //   172: aload_1
    //   173: ifnull +8 -> 181
    //   176: aload_0
    //   177: aload_1
    //   178: invokespecial 263	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	(Lorg/eclipse/paho/client/mqttv3/n;)V
    //   181: aload_0
    //   182: getfield 69	org/eclipse/paho/client/mqttv3/a/e:f	Ljava/util/Vector;
    //   185: astore_3
    //   186: aload_3
    //   187: monitorenter
    //   188: aload_0
    //   189: getfield 69	org/eclipse/paho/client/mqttv3/a/e:f	Ljava/util/Vector;
    //   192: astore_1
    //   193: aload_1
    //   194: invokevirtual 280	java/util/Vector:isEmpty	()Z
    //   197: istore_2
    //   198: iload_2
    //   199: ifne +210 -> 409
    //   202: aload_0
    //   203: getfield 69	org/eclipse/paho/client/mqttv3/a/e:f	Ljava/util/Vector;
    //   206: astore_1
    //   207: iconst_0
    //   208: istore 5
    //   210: aconst_null
    //   211: astore 4
    //   213: aload_1
    //   214: iconst_0
    //   215: invokevirtual 286	java/util/Vector:elementAt	(I)Ljava/lang/Object;
    //   218: astore_1
    //   219: aload_1
    //   220: checkcast 93	org/eclipse/paho/client/mqttv3/a/removeFromPath/o
    //   223: astore_1
    //   224: aload_0
    //   225: getfield 69	org/eclipse/paho/client/mqttv3/a/e:f	Ljava/util/Vector;
    //   228: astore 4
    //   230: aconst_null
    //   231: astore 6
    //   233: aload 4
    //   235: iconst_0
    //   236: invokevirtual 289	java/util/Vector:removeElementAt	(I)V
    //   239: aload_3
    //   240: monitorexit
    //   241: aload_1
    //   242: ifnull +8 -> 250
    //   245: aload_0
    //   246: aload_1
    //   247: invokespecial 291	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	(Lorg/eclipse/paho/client/mqttv3/a/removeFromPath/o;)V
    //   250: aload_0
    //   251: getfield 54	org/eclipse/paho/client/mqttv3/a/e:AppEngine1	Z
    //   254: istore_2
    //   255: iload_2
    //   256: ifeq +13 -> 269
    //   259: aload_0
    //   260: getfield 167	org/eclipse/paho/client/mqttv3/a/e:m	Lorg/eclipse/paho/client/mqttv3/a/d;
    //   263: astore_1
    //   264: aload_1
    //   265: invokevirtual 293	org/eclipse/paho/client/mqttv3/a/d:f	()Z
    //   268: pop
    //   269: aload_0
    //   270: getfield 60	org/eclipse/paho/client/mqttv3/a/e:l	Ljava/lang/Object;
    //   273: astore_3
    //   274: aload_3
    //   275: monitorenter
    //   276: getstatic 45	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   279: astore_1
    //   280: getstatic 36	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	Ljava/lang/String;
    //   283: astore 4
    //   285: ldc_w 277
    //   288: astore 6
    //   290: ldc_w 295
    //   293: astore 7
    //   295: aload_1
    //   296: aload 4
    //   298: aload 6
    //   300: aload 7
    //   302: invokeinterface 177 4 0
    //   307: aload_0
    //   308: getfield 60	org/eclipse/paho/client/mqttv3/a/e:l	Ljava/lang/Object;
    //   311: astore_1
    //   312: aload_1
    //   313: invokevirtual 194	java/lang/Object:notifyAll	()V
    //   316: aload_3
    //   317: monitorexit
    //   318: goto -314 -> 4
    //   321: astore_1
    //   322: aload_3
    //   323: monitorexit
    //   324: aload_1
    //   325: athrow
    //   326: astore 7
    //   328: getstatic 45	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   331: astore_1
    //   332: getstatic 36	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	Ljava/lang/String;
    //   335: astore_3
    //   336: ldc_w 277
    //   339: astore 4
    //   341: ldc_w 297
    //   344: astore 6
    //   346: aload_1
    //   347: aload_3
    //   348: aload 4
    //   350: aload 6
    //   352: aconst_null
    //   353: aload 7
    //   355: invokeinterface 268 6 0
    //   360: aload_0
    //   361: iconst_0
    //   362: putfield 52	org/eclipse/paho/client/mqttv3/a/e:a	Z
    //   365: aload_0
    //   366: getfield 62	org/eclipse/paho/client/mqttv3/a/e:e	Lorg/eclipse/paho/client/mqttv3/a/a;
    //   369: astore_1
    //   370: new 270	org/eclipse/paho/client/mqttv3/MqttException
    //   373: astore_3
    //   374: aload_3
    //   375: aload 7
    //   377: invokespecial 272	org/eclipse/paho/client/mqttv3/MqttException:<init>	(Ljava/lang/Throwable;)V
    //   380: aload_1
    //   381: aconst_null
    //   382: aload_3
    //   383: invokevirtual 275	org/eclipse/paho/client/mqttv3/a/a:a	(Lorg/eclipse/paho/client/mqttv3/n;Lorg/eclipse/paho/client/mqttv3/MqttException;)V
    //   386: goto -382 -> 4
    //   389: astore_1
    //   390: aload_3
    //   391: monitorexit
    //   392: aload_1
    //   393: athrow
    //   394: astore_1
    //   395: goto -292 -> 103
    //   398: astore_1
    //   399: aload_3
    //   400: monitorexit
    //   401: aload_1
    //   402: athrow
    //   403: astore_1
    //   404: aload_3
    //   405: monitorexit
    //   406: aload_1
    //   407: athrow
    //   408: return
    //   409: iconst_0
    //   410: istore_2
    //   411: aconst_null
    //   412: astore_1
    //   413: goto -174 -> 239
    //   416: iconst_0
    //   417: istore_2
    //   418: aconst_null
    //   419: astore_1
    //   420: goto -250 -> 170
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	423	0	this	e
    //   3	310	1	localObject1	Object
    //   321	4	1	localObject2	Object
    //   331	50	1	localObject3	Object
    //   389	4	1	localObject4	Object
    //   394	1	1	localInterruptedException	InterruptedException
    //   398	4	1	localObject5	Object
    //   403	4	1	localObject6	Object
    //   412	8	1	localObject7	Object
    //   8	410	2	bool1	boolean
    //   29	320	4	localObject9	Object
    //   36	173	5	bool2	boolean
    //   73	278	6	str1	String
    //   78	223	7	str2	String
    //   326	50	7	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   276	279	321	finally
    //   280	283	321	finally
    //   300	307	321	finally
    //   307	311	321	finally
    //   312	316	321	finally
    //   316	318	321	finally
    //   322	324	321	finally
    //   13	17	326	finally
    //   18	20	326	finally
    //   103	107	326	finally
    //   112	116	326	finally
    //   117	119	326	finally
    //   177	181	326	finally
    //   181	185	326	finally
    //   186	188	326	finally
    //   246	250	326	finally
    //   250	254	326	finally
    //   259	263	326	finally
    //   264	269	326	finally
    //   269	273	326	finally
    //   274	276	326	finally
    //   324	326	326	finally
    //   392	394	326	finally
    //   401	403	326	finally
    //   406	408	326	finally
    //   20	24	389	finally
    //   25	29	389	finally
    //   31	36	389	finally
    //   47	51	389	finally
    //   52	56	389	finally
    //   61	64	389	finally
    //   65	68	389	finally
    //   85	92	389	finally
    //   92	96	389	finally
    //   97	101	389	finally
    //   101	103	389	finally
    //   390	392	389	finally
    //   13	17	394	java/lang/InterruptedException
    //   18	20	394	java/lang/InterruptedException
    //   392	394	394	java/lang/InterruptedException
    //   119	123	398	finally
    //   124	128	398	finally
    //   133	137	398	finally
    //   145	149	398	finally
    //   150	154	398	finally
    //   155	159	398	finally
    //   166	170	398	finally
    //   170	172	398	finally
    //   399	401	398	finally
    //   188	192	403	finally
    //   193	197	403	finally
    //   202	206	403	finally
    //   214	218	403	finally
    //   219	223	403	finally
    //   224	228	403	finally
    //   235	239	403	finally
    //   239	241	403	finally
    //   404	406	403	finally
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */