package org.eclipse.paho.client.mqttv3.a;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.a;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.b.c;
import org.eclipse.paho.client.mqttv3.k;

public class q
{
  private static final String b = q.class.getName();
  private static final org.eclipse.paho.client.mqttv3.b.b c;
  protected k a;
  private volatile boolean d = false;
  private boolean e = false;
  private boolean f = false;
  private Object g;
  private Object h;
  private u i;
  private MqttException j;
  private String[] k;
  private String l;
  private org.eclipse.paho.client.mqttv3.b m;
  private a n;
  private Object o;
  private int p;
  private boolean q;
  
  static
  {
    String str = b;
    c = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public q(String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.g = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.h = localObject;
    this.a = null;
    this.i = null;
    this.j = null;
    this.k = null;
    this.m = null;
    this.n = null;
    this.o = null;
    this.p = 0;
    this.q = false;
    c.a(paramString);
  }
  
  public void a(int paramInt)
  {
    this.p = paramInt;
  }
  
  public void a(long paramLong)
  {
    int i1 = 2;
    int i2 = 1;
    Object localObject1 = c;
    String str1 = b;
    String str2 = "waitForCompletion";
    String str3 = "407";
    int i3 = 3;
    Object[] arrayOfObject = new Object[i3];
    Object localObject2 = m();
    arrayOfObject[0] = localObject2;
    localObject2 = new java/lang/Long;
    ((Long)localObject2).<init>(paramLong);
    arrayOfObject[i2] = localObject2;
    arrayOfObject[i1] = this;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b(str1, str2, str3, arrayOfObject);
    localObject1 = b(paramLong);
    if (localObject1 == null)
    {
      boolean bool = this.d;
      if (!bool)
      {
        localObject1 = c;
        str1 = b;
        arrayOfObject = new Object[i1];
        localObject2 = m();
        arrayOfObject[0] = localObject2;
        arrayOfObject[i2] = this;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b(str1, "waitForCompletion", "406", arrayOfObject);
        localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
        ((MqttException)localObject1).<init>(32000);
        this.j = ((MqttException)localObject1);
        throw this.j;
      }
    }
    a();
  }
  
  public void a(Object paramObject)
  {
    this.o = paramObject;
  }
  
  public void a(String paramString)
  {
    this.l = paramString;
  }
  
  public void a(MqttException paramMqttException)
  {
    synchronized (this.g)
    {
      this.j = paramMqttException;
      return;
    }
  }
  
  protected void a(u paramu, MqttException paramMqttException)
  {
    int i1 = 1;
    org.eclipse.paho.client.mqttv3.b.b localb = c;
    Object localObject2 = b;
    String str1 = "markComplete";
    String str2 = "404";
    int i2 = 3;
    Object[] arrayOfObject = new Object[i2];
    String str3 = m();
    arrayOfObject[0] = str3;
    arrayOfObject[i1] = paramu;
    int i3 = 2;
    arrayOfObject[i3] = paramMqttException;
    localb.b((String)localObject2, str1, str2, arrayOfObject);
    localObject2 = this.g;
    boolean bool = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.b;
    if (bool)
    {
      bool = false;
      localb = null;
    }
    try
    {
      this.a = null;
      bool = true;
      this.e = bool;
      this.i = ((u)paramu);
      this.j = paramMqttException;
      return;
    }
    finally {}
  }
  
  public void a(a parama)
  {
    this.n = parama;
  }
  
  protected void a(org.eclipse.paho.client.mqttv3.b paramb)
  {
    this.m = paramb;
  }
  
  public void a(k paramk)
  {
    this.a = paramk;
  }
  
  public void a(boolean paramBoolean)
  {
    this.q = paramBoolean;
  }
  
  public void a(String[] paramArrayOfString)
  {
    this.k = paramArrayOfString;
  }
  
  public boolean a()
  {
    MqttException localMqttException = b();
    if (localMqttException != null) {
      throw b();
    }
    return true;
  }
  
  public MqttException b()
  {
    return this.j;
  }
  
  protected u b(long paramLong)
  {
    Object localObject1 = "waitForResponse";
    boolean bool2;
    label415:
    do
    {
      for (;;)
      {
        synchronized (this.g)
        {
          localObject1 = c;
          localObject5 = b;
          String str1 = "waitForResponse";
          String str2 = "400";
          int i1 = 7;
          arrayOfObject = new Object[i1];
          int i2 = 0;
          localObject6 = null;
          Object localObject7 = m();
          arrayOfObject[0] = localObject7;
          i2 = 1;
          localObject7 = new java/lang/Long;
          ((Long)localObject7).<init>(paramLong);
          arrayOfObject[i2] = localObject7;
          i2 = 2;
          localObject7 = new java/lang/Boolean;
          boolean bool1 = this.f;
          ((Boolean)localObject7).<init>(bool1);
          arrayOfObject[i2] = localObject7;
          i2 = 3;
          localObject7 = new java/lang/Boolean;
          bool1 = this.d;
          ((Boolean)localObject7).<init>(bool1);
          arrayOfObject[i2] = localObject7;
          int i3 = 4;
          localObject6 = this.j;
          if (localObject6 == null)
          {
            localObject6 = "false";
            arrayOfObject[i3] = localObject6;
            i2 = 5;
            localObject7 = this.i;
            arrayOfObject[i2] = localObject7;
            i2 = 6;
            arrayOfObject[i2] = this;
            localObject6 = this.j;
            ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject5, str1, str2, arrayOfObject, (Throwable)localObject6);
            bool2 = this.d;
            if (bool2) {
              break label463;
            }
            localObject1 = this.j;
            if (localObject1 != null) {}
          }
          try
          {
            localObject1 = c;
            localObject5 = b;
            str1 = "waitForResponse";
            str2 = "408";
            i1 = 2;
            arrayOfObject = new Object[i1];
            i2 = 0;
            localObject6 = null;
            localObject7 = m();
            arrayOfObject[0] = localObject7;
            i2 = 1;
            localObject7 = new java/lang/Long;
            ((Long)localObject7).<init>(paramLong);
            arrayOfObject[i2] = localObject7;
            ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject5, str1, str2, arrayOfObject);
            l1 = 0L;
            bool2 = paramLong < l1;
            if (bool2) {
              break label415;
            }
            localObject1 = this.g;
            localObject1.wait();
          }
          catch (InterruptedException localInterruptedException)
          {
            Object localObject3;
            localObject5 = new org/eclipse/paho/client/mqttv3/MqttException;
            ((MqttException)localObject5).<init>(localInterruptedException);
            this.j = ((MqttException)localObject5);
            continue;
            long l1 = 0L;
            bool2 = paramLong < l1;
          }
          bool2 = this.d;
          if (bool2) {
            continue;
          }
          localObject1 = this.j;
          if (localObject1 == null) {
            break;
          }
          localObject1 = c;
          localObject5 = b;
          str1 = "waitForResponse";
          str2 = "401";
          i1 = 0;
          arrayOfObject = null;
          localObject6 = this.j;
          ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject5, str1, str2, null, (Throwable)localObject6);
          localObject1 = this.j;
          throw ((Throwable)localObject1);
        }
        Object localObject6 = "true";
        continue;
        localObject3 = this.g;
        localObject3.wait(paramLong);
      }
    } while (!bool2);
    label463:
    org.eclipse.paho.client.mqttv3.b.b localb = c;
    Object localObject5 = b;
    Object[] arrayOfObject = new Object[2];
    ??? = m();
    arrayOfObject[0] = ???;
    ??? = this.i;
    arrayOfObject[1] = ???;
    localb.b((String)localObject5, "waitForResponse", "402", arrayOfObject);
    return this.i;
  }
  
  public boolean c()
  {
    return this.d;
  }
  
  protected boolean d()
  {
    return this.e;
  }
  
  public a e()
  {
    return this.n;
  }
  
  protected void f()
  {
    int i1 = 1;
    Object localObject1 = c;
    ??? = b;
    String str1 = "notifyComplete";
    String str2 = "404";
    int i2 = 3;
    Object[] arrayOfObject = new Object[i2];
    Object localObject5 = m();
    arrayOfObject[0] = localObject5;
    localObject5 = this.i;
    arrayOfObject[i1] = localObject5;
    int i3 = 2;
    MqttException localMqttException = this.j;
    arrayOfObject[i3] = localMqttException;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)???, str1, str2, arrayOfObject);
    synchronized (this.g)
    {
      localObject1 = this.j;
      if (localObject1 == null)
      {
        bool = this.e;
        if (bool)
        {
          bool = true;
          this.d = bool;
          bool = false;
          localObject1 = null;
          this.e = false;
          localObject1 = this.g;
          localObject1.notifyAll();
          ??? = this.h;
          bool = true;
        }
      }
      try
      {
        this.f = bool;
        localObject1 = this.h;
        localObject1.notifyAll();
        return;
      }
      finally {}
      boolean bool = false;
      localObject1 = null;
      this.e = false;
    }
  }
  
  public void g()
  {
    Object localObject1 = "waitUntilSent";
    synchronized (this.h)
    {
      synchronized (this.g)
      {
        localObject1 = this.j;
        if (localObject1 != null)
        {
          localObject1 = this.j;
          throw ((Throwable)localObject1);
        }
      }
    }
    for (;;)
    {
      bool = this.f;
      if (bool) {
        break;
      }
      try
      {
        Object localObject4 = c;
        ??? = b;
        String str1 = "waitUntilSent";
        String str2 = "409";
        int i2 = 1;
        Object[] arrayOfObject = new Object[i2];
        String str3 = m();
        arrayOfObject[0] = str3;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject4).b((String)???, str1, str2, arrayOfObject);
        localObject4 = this.h;
        localObject4.wait();
      }
      catch (InterruptedException localInterruptedException) {}
    }
    boolean bool = this.f;
    if (!bool)
    {
      MqttException localMqttException = this.j;
      if (localMqttException == null)
      {
        int i1 = 6;
        localMqttException = j.a(i1);
        throw localMqttException;
      }
      localMqttException = this.j;
      throw localMqttException;
    }
  }
  
  /* Error */
  protected void h()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: getstatic 49	org/eclipse/paho/client/mqttv3/a/q:MyUncaughtExceptionHandler	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   5: astore_2
    //   6: getstatic 40	org/eclipse/paho/client/mqttv3/a/q:removeFromPath	Ljava/lang/String;
    //   9: astore_3
    //   10: ldc -74
    //   12: astore 4
    //   14: ldc -72
    //   16: astore 5
    //   18: iload_1
    //   19: anewarray 4	java/lang/Object
    //   22: astore 6
    //   24: aload_0
    //   25: invokevirtual 95	org/eclipse/paho/client/mqttv3/a/q:m	()Ljava/lang/String;
    //   28: astore 7
    //   30: aload 6
    //   32: iconst_0
    //   33: aload 7
    //   35: aastore
    //   36: aload_2
    //   37: aload_3
    //   38: aload 4
    //   40: aload 5
    //   42: aload 6
    //   44: invokeinterface 103 5 0
    //   49: aload_0
    //   50: getfield 61	org/eclipse/paho/client/mqttv3/a/q:FxFileObserverWorker	Ljava/lang/Object;
    //   53: astore_3
    //   54: aload_3
    //   55: monitorenter
    //   56: iconst_0
    //   57: istore 8
    //   59: aconst_null
    //   60: astore_2
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 67	org/eclipse/paho/client/mqttv3/a/q:i	Lorg/eclipse/paho/client/mqttv3/a/removeFromPath/u;
    //   66: iconst_0
    //   67: istore 8
    //   69: aconst_null
    //   70: astore_2
    //   71: aload_0
    //   72: iconst_0
    //   73: putfield 55	org/eclipse/paho/client/mqttv3/a/q:d	Z
    //   76: aload_3
    //   77: monitorexit
    //   78: aload_0
    //   79: getfield 63	org/eclipse/paho/client/mqttv3/a/q:AppEngine1	Ljava/lang/Object;
    //   82: astore_3
    //   83: aload_3
    //   84: monitorenter
    //   85: iconst_1
    //   86: istore 8
    //   88: aload_0
    //   89: iload 8
    //   91: putfield 59	org/eclipse/paho/client/mqttv3/a/q:f	Z
    //   94: aload_0
    //   95: getfield 63	org/eclipse/paho/client/mqttv3/a/q:AppEngine1	Ljava/lang/Object;
    //   98: astore_2
    //   99: aload_2
    //   100: invokevirtual 171	java/lang/Object:notifyAll	()V
    //   103: aload_3
    //   104: monitorexit
    //   105: return
    //   106: astore_2
    //   107: aload_3
    //   108: monitorexit
    //   109: aload_2
    //   110: athrow
    //   111: astore_2
    //   112: aload_3
    //   113: monitorexit
    //   114: aload_2
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	q
    //   1	18	1	i1	int
    //   5	95	2	localObject1	Object
    //   106	4	2	localObject2	Object
    //   111	4	2	localObject3	Object
    //   9	104	3	localObject4	Object
    //   12	27	4	str1	String
    //   16	25	5	str2	String
    //   22	21	6	arrayOfObject	Object[]
    //   28	6	7	str3	String
    //   57	33	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   62	66	106	finally
    //   72	76	106	finally
    //   76	78	106	finally
    //   107	109	106	finally
    //   89	94	111	finally
    //   94	98	111	finally
    //   99	103	111	finally
    //   103	105	111	finally
    //   112	114	111	finally
  }
  
  public org.eclipse.paho.client.mqttv3.b i()
  {
    return this.m;
  }
  
  public u j()
  {
    return this.i;
  }
  
  public String[] k()
  {
    return this.k;
  }
  
  public Object l()
  {
    return this.o;
  }
  
  public String m()
  {
    return this.l;
  }
  
  public boolean n()
  {
    return this.q;
  }
  
  public int[] o()
  {
    int[] arrayOfInt = new int[0];
    u localu = this.i;
    boolean bool = localu instanceof org.eclipse.paho.client.mqttv3.a.b.q;
    if (bool) {
      arrayOfInt = ((org.eclipse.paho.client.mqttv3.a.b.q)this.i).f();
    }
    return arrayOfInt;
  }
  
  public u p()
  {
    return this.i;
  }
  
  public String toString()
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = localStringBuffer.append("key=");
    Object localObject2 = m();
    ((StringBuffer)localObject1).append((String)localObject2);
    localStringBuffer.append(" ,topics=");
    localObject1 = k();
    if (localObject1 != null)
    {
      int i1 = 0;
      localObject1 = null;
      for (;;)
      {
        localObject2 = k();
        int i2 = localObject2.length;
        if (i1 >= i2) {
          break;
        }
        localObject2 = k()[i1];
        localObject2 = localStringBuffer.append((String)localObject2);
        String str = ", ";
        ((StringBuffer)localObject2).append(str);
        i1 += 1;
      }
    }
    localObject1 = localStringBuffer.append(" ,usercontext=");
    localObject2 = l();
    ((StringBuffer)localObject1).append(localObject2);
    localObject1 = localStringBuffer.append(" ,isComplete=");
    boolean bool = c();
    ((StringBuffer)localObject1).append(bool);
    localObject1 = localStringBuffer.append(" ,isNotified=");
    bool = n();
    ((StringBuffer)localObject1).append(bool);
    localObject1 = localStringBuffer.append(" ,exception=");
    localObject2 = b();
    ((StringBuffer)localObject1).append(localObject2);
    localObject1 = localStringBuffer.append(" ,actioncallback=");
    localObject2 = e();
    ((StringBuffer)localObject1).append(localObject2);
    return localStringBuffer.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */