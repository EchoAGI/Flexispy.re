package org.eclipse.paho.client.mqttv3.a;

import java.util.Enumeration;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.a.b.o;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.i;
import org.eclipse.paho.client.mqttv3.k;
import org.eclipse.paho.client.mqttv3.n;

public class a
{
  public static String a = "${project.version}";
  public static String b = "L${build.level}";
  private static final String c = a.class.getName();
  private static final org.eclipse.paho.client.mqttv3.b.b d;
  private org.eclipse.paho.client.mqttv3.b e;
  private int f;
  private m[] g;
  private f h;
  private g i;
  private e j;
  private d k;
  private i l;
  private org.eclipse.paho.client.mqttv3.h m;
  private org.eclipse.paho.client.mqttv3.m n;
  private h o;
  private boolean p = false;
  private byte q;
  private Object r;
  private boolean s;
  
  static
  {
    String str = c;
    d = org.eclipse.paho.client.mqttv3.b.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public a(org.eclipse.paho.client.mqttv3.b paramb, org.eclipse.paho.client.mqttv3.h paramh, org.eclipse.paho.client.mqttv3.m paramm)
  {
    this.q = b1;
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    this.r = localObject1;
    this.s = false;
    this.q = b1;
    this.e = paramb;
    this.m = paramh;
    this.n = paramm;
    this.n.a(this);
    localObject1 = new org/eclipse/paho/client/mqttv3/a/h;
    Object localObject2 = j().a();
    ((h)localObject1).<init>((String)localObject2);
    this.o = ((h)localObject1);
    localObject1 = new org/eclipse/paho/client/mqttv3/a/e;
    ((e)localObject1).<init>(this);
    this.j = ((e)localObject1);
    localObject1 = new org/eclipse/paho/client/mqttv3/a/d;
    h localh = this.o;
    e locale = this.j;
    localObject2 = paramh;
    ((d)localObject1).<init>(paramh, localh, locale, this, paramm);
    this.k = ((d)localObject1);
    localObject1 = this.j;
    localObject2 = this.k;
    ((e)localObject1).a((d)localObject2);
    localObject1 = d;
    localObject2 = j().a();
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject2);
  }
  
  private void a(Exception paramException)
  {
    Object localObject = d;
    String str1 = c;
    String str2 = "handleRunException";
    String str3 = "804";
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).a(str1, str2, str3, null, paramException);
    boolean bool = paramException instanceof MqttException;
    if (!bool)
    {
      localObject = new org/eclipse/paho/client/mqttv3/MqttException;
      int i1 = 32109;
      ((MqttException)localObject).<init>(i1, paramException);
    }
    for (paramException = (Exception)localObject;; paramException = (MqttException)paramException)
    {
      a(null, paramException);
      return;
    }
  }
  
  private n b(n paramn, MqttException paramMqttException)
  {
    Object localObject1 = d;
    localObject2 = c;
    Object localObject3 = "handleOldTokens";
    Object localObject4 = "222";
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject2, (String)localObject3, (String)localObject4);
    localObject2 = null;
    if (paramn != null) {}
    try
    {
      localObject1 = this.o;
      localObject3 = paramn.a;
      localObject3 = ((q)localObject3).m();
      localObject1 = ((h)localObject1).a((String)localObject3);
      if (localObject1 == null)
      {
        localObject1 = this.o;
        localObject3 = paramn.a;
        localObject3 = ((q)localObject3).m();
        ((h)localObject1).a(paramn, (String)localObject3);
      }
      localObject1 = this.k;
      localObject1 = ((d)localObject1).a(paramMqttException);
      localObject3 = ((Vector)localObject1).elements();
      boolean bool1 = ((Enumeration)localObject3).hasMoreElements();
      if (bool1)
      {
        localObject1 = ((Enumeration)localObject3).nextElement();
        localObject1 = (n)localObject1;
        localObject4 = ((n)localObject1).a;
        localObject4 = ((q)localObject4).m();
        String str = "Disc";
        boolean bool2 = ((String)localObject4).equals(str);
        if (!bool2)
        {
          localObject4 = ((n)localObject1).a;
          localObject4 = ((q)localObject4).m();
          str = "Con";
          bool2 = ((String)localObject4).equals(str);
          if (!bool2) {
            break label202;
          }
        }
        for (;;)
        {
          localObject2 = localObject1;
          break;
          label202:
          localObject4 = this.j;
          ((e)localObject4).b((n)localObject1);
          localObject1 = localObject2;
        }
      }
      return (n)localObject2;
    }
    catch (Exception localException) {}
  }
  
  f a()
  {
    return this.h;
  }
  
  public void a(int paramInt)
  {
    this.f = paramInt;
  }
  
  public void a(org.eclipse.paho.client.mqttv3.a.b.c paramc, MqttException paramMqttException)
  {
    Object localObject1 = "connectComplete";
    int i1 = paramc.b_();
    localObject3 = this.r;
    if (i1 == 0) {}
    try
    {
      localObject1 = d;
      str1 = c;
      String str2 = "connectComplete";
      String str3 = "215";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, str2, str3);
      i1 = 0;
      localObject1 = null;
      this.q = 0;
      return;
    }
    finally {}
    localObject3 = d;
    String str1 = c;
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = new java/lang/Integer;
    localInteger.<init>(i1);
    arrayOfObject[0] = localInteger;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject3).b(str1, "connectComplete", "204", arrayOfObject);
    throw paramMqttException;
  }
  
  public void a(org.eclipse.paho.client.mqttv3.a.b.e parame, long paramLong, n paramn)
  {
    Object localObject1 = "disconnect";
    synchronized (this.r)
    {
      boolean bool1 = g();
      if (bool1)
      {
        localObject1 = d;
        localObject5 = c;
        localObject6 = "disconnect";
        str = "223";
        ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject5, (String)localObject6, str);
        int i1 = 32111;
        localObject1 = j.a(i1);
        throw ((Throwable)localObject1);
      }
    }
    boolean bool2 = e();
    if (bool2)
    {
      localObject3 = d;
      localObject5 = c;
      localObject6 = "disconnect";
      str = "211";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject3).a((String)localObject5, (String)localObject6, str);
      int i2 = 32101;
      localObject3 = j.a(i2);
      throw ((Throwable)localObject3);
    }
    boolean bool3 = f();
    if (bool3)
    {
      localObject3 = d;
      localObject5 = c;
      localObject6 = "disconnect";
      str = "219";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject3).a((String)localObject5, (String)localObject6, str);
      i3 = 32102;
      localObject3 = j.a(i3);
      throw ((Throwable)localObject3);
    }
    Object localObject3 = Thread.currentThread();
    Object localObject5 = this.j;
    localObject5 = ((e)localObject5).d();
    if (localObject3 == localObject5)
    {
      localObject3 = d;
      localObject5 = c;
      localObject6 = "disconnect";
      str = "210";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject3).a((String)localObject5, (String)localObject6, str);
      i3 = 32107;
      localObject3 = j.a(i3);
      throw ((Throwable)localObject3);
    }
    localObject3 = d;
    localObject5 = c;
    Object localObject6 = "disconnect";
    String str = "218";
    ((org.eclipse.paho.client.mqttv3.b.b)localObject3).a((String)localObject5, (String)localObject6, str);
    int i3 = 2;
    this.q = i3;
    localObject3 = new org/eclipse/paho/client/mqttv3/a/c;
    localObject5 = this;
    localObject6 = parame;
    ((c)localObject3).<init>(this, parame, paramLong, paramn);
    ((c)localObject3).a();
  }
  
  protected void a(o paramo)
  {
    this.k.b(paramo);
  }
  
  void a(u paramu, n paramn)
  {
    int i1 = 3;
    int i2 = 2;
    int i3 = 1;
    Object localObject1 = d;
    localObject2 = c;
    String str1 = "internalSend";
    String str2 = "200";
    Object[] arrayOfObject = new Object[i1];
    String str3 = paramu.e();
    arrayOfObject[0] = str3;
    arrayOfObject[i3] = paramu;
    arrayOfObject[i2] = paramn;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject2, str1, str2, arrayOfObject);
    localObject1 = paramn.g();
    if (localObject1 == null)
    {
      localObject1 = paramn.a;
      localObject2 = j();
      ((q)localObject1).a((org.eclipse.paho.client.mqttv3.b)localObject2);
    }
    try
    {
      localObject1 = this.k;
      ((d)localObject1).a(paramu, paramn);
      return;
    }
    catch (MqttException localMqttException)
    {
      boolean bool = paramu instanceof o;
      if (!bool) {
        break label220;
      }
      localObject2 = this.k;
      paramu = (o)paramu;
      ((d)localObject2).a(paramu);
      throw localMqttException;
    }
    localObject1 = d;
    localObject2 = c;
    arrayOfObject = new Object[i1];
    str3 = paramu.e();
    arrayOfObject[0] = str3;
    arrayOfObject[i3] = paramu;
    arrayOfObject[i2] = paramn;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject2, "internalSend", "213", arrayOfObject);
    localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
    ((MqttException)localObject1).<init>(32201);
    throw ((Throwable)localObject1);
  }
  
  public void a(org.eclipse.paho.client.mqttv3.f paramf)
  {
    this.j.a(paramf);
  }
  
  public void a(i parami, n paramn)
  {
    Object localObject1 = "connect";
    int i5;
    synchronized (this.r)
    {
      i1 = e();
      if (i1 != 0)
      {
        i1 = this.s;
        if (i1 == 0)
        {
          localObject1 = d;
          localObject4 = c;
          str1 = "connect";
          str2 = "214";
          ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject4, str1, str2);
          i1 = 1;
          this.q = i1;
          this.l = parami;
          localObject1 = new org/eclipse/paho/client/mqttv3/a/b/d;
          localObject4 = this.e;
          localObject4 = ((org.eclipse.paho.client.mqttv3.b)localObject4).a();
          int i3 = parami.d();
          boolean bool2 = parami.j();
          i4 = parami.c();
          str3 = parami.b();
          localObject5 = parami.a();
          k localk = parami.h();
          String str4 = parami.g();
          ((org.eclipse.paho.client.mqttv3.a.b.d)localObject1).<init>((String)localObject4, i3, bool2, i4, str3, (char[])localObject5, localk, str4);
          localObject4 = this.k;
          i3 = parami.c();
          long l1 = i3;
          ((d)localObject4).a(l1);
          localObject4 = this.k;
          boolean bool1 = parami.j();
          ((d)localObject4).a(bool1);
          localObject4 = this.o;
          ((h)localObject4).a();
          localObject4 = new org/eclipse/paho/client/mqttv3/a/b;
          ((b)localObject4).<init>(this, this, paramn, (org.eclipse.paho.client.mqttv3.a.b.d)localObject1);
          ((b)localObject4).a();
          return;
        }
      }
      localObject1 = d;
      Object localObject4 = c;
      String str1 = "connect";
      String str2 = "207";
      int i4 = 1;
      Object[] arrayOfObject = new Object[i4];
      String str3 = null;
      Object localObject5 = new java/lang/Byte;
      byte b1 = this.q;
      ((Byte)localObject5).<init>(b1);
      arrayOfObject[0] = localObject5;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject4, str1, str2, arrayOfObject);
      i1 = g();
      if (i1 == 0)
      {
        i1 = this.s;
        if (i1 == 0) {}
      }
      else
      {
        localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
        i5 = 32111;
        ((MqttException)localObject1).<init>(i5);
        throw ((Throwable)localObject1);
      }
    }
    int i1 = d();
    if (i1 != 0)
    {
      localMqttException = new org/eclipse/paho/client/mqttv3/MqttException;
      i5 = 32110;
      localMqttException.<init>(i5);
      throw localMqttException;
    }
    i1 = f();
    if (i1 != 0)
    {
      localMqttException = new org/eclipse/paho/client/mqttv3/MqttException;
      i5 = 32102;
      localMqttException.<init>(i5);
      throw localMqttException;
    }
    int i2 = 32100;
    localMqttException = j.a(i2);
  }
  
  public void a(n paramn, MqttException paramMqttException)
  {
    byte b1 = 1;
    Object localObject1 = "shutdownConnection";
    for (;;)
    {
      String str1;
      int i1;
      synchronized (this.r)
      {
        boolean bool1 = this.p;
        if (!bool1)
        {
          bool1 = this.s;
          if (!bool1) {}
        }
        else
        {
          return;
        }
        bool1 = true;
        this.p = bool1;
        localObject1 = d;
        str1 = c;
        ??? = "shutdownConnection";
        String str2 = "216";
        ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, (String)???, str2);
        bool1 = c();
        if (!bool1)
        {
          bool1 = f();
          if (!bool1) {}
        }
        else
        {
          i1 = b1;
          byte b2 = 2;
          this.q = b2;
          if (paramn != null)
          {
            boolean bool2 = paramn.e();
            if (!bool2)
            {
              localObject1 = paramn.a;
              ((q)localObject1).a(paramMqttException);
            }
          }
          localObject1 = this.j;
          if (localObject1 != null)
          {
            localObject1 = this.j;
            ((e)localObject1).a();
          }
        }
        try
        {
          localObject1 = this.g;
          if (localObject1 != null)
          {
            localObject1 = this.g;
            int i2 = this.f;
            localObject1 = localObject1[i2];
            if (localObject1 != null) {
              ((m)localObject1).d();
            }
          }
        }
        catch (Exception localException4)
        {
          int i3;
          continue;
        }
        localObject1 = this.h;
        if (localObject1 != null)
        {
          localObject1 = this.h;
          ((f)localObject1).a();
        }
        localObject1 = this.o;
        ??? = new org/eclipse/paho/client/mqttv3/MqttException;
        i3 = 32102;
        ((MqttException)???).<init>(i3);
        ((h)localObject1).a((MqttException)???);
        ??? = b(paramn, paramMqttException);
        try
        {
          localObject1 = this.k;
          ((d)localObject1).b(paramMqttException);
        }
        catch (Exception localException3)
        {
          continue;
        }
        localObject1 = this.i;
        if (localObject1 != null)
        {
          localObject1 = this.i;
          ((g)localObject1).a();
        }
        localObject1 = this.n;
        if (localObject1 != null)
        {
          localObject1 = this.n;
          ((org.eclipse.paho.client.mqttv3.m)localObject1).b();
        }
        for (;;)
        {
          try
          {
            localObject1 = this.m;
            if (localObject1 != null)
            {
              localObject1 = this.m;
              ((org.eclipse.paho.client.mqttv3.h)localObject1).a();
            }
          }
          catch (Exception localException2)
          {
            String str3;
            String str4;
            byte b3;
            boolean bool3;
            continue;
          }
          synchronized (this.r)
          {
            localObject1 = d;
            str2 = c;
            str3 = "shutdownConnection";
            str4 = "217";
            ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str2, str3, str4);
            b3 = 3;
            this.q = b3;
            b3 = 0;
            localObject1 = null;
            this.p = false;
            if (??? != null)
            {
              b3 = b1;
              ??? = this.j;
              if (??? == null) {
                continue;
              }
              b3 &= b1;
              if (b3 != 0)
              {
                localObject1 = this.j;
                ((e)localObject1).b((n)???);
              }
              if (i1 != 0)
              {
                localObject1 = this.j;
                if (localObject1 != null)
                {
                  localObject1 = this.j;
                  ((e)localObject1).a(paramMqttException);
                }
              }
              synchronized (this.r)
              {
                bool3 = this.s;
                if (!bool3) {
                  break;
                }
              }
            }
          }
        }
      }
      try
      {
        b();
        continue;
        localObject2 = finally;
        throw ((Throwable)localObject2);
        i1 = 0;
        str1 = null;
        continue;
        localObject3 = finally;
        throw ((Throwable)localObject3);
        localObject4 = finally;
        throw ((Throwable)localObject4);
        bool3 = false;
        Object localObject5 = null;
        continue;
        b1 = 0;
        ??? = null;
      }
      catch (Exception localException1)
      {
        for (;;) {}
      }
    }
  }
  
  public void a(m[] paramArrayOfm)
  {
    this.g = paramArrayOfm;
  }
  
  public void b()
  {
    Object localObject1 = "close";
    synchronized (this.r)
    {
      bool1 = g();
      if (bool1) {
        break label227;
      }
      bool1 = e();
      if (bool1) {
        break label130;
      }
      localObject1 = d;
      String str1 = c;
      String str2 = "close";
      String str3 = "224";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, str2, str3);
      bool1 = d();
      if (bool1)
      {
        localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
        int i2 = 32110;
        ((MqttException)localObject1).<init>(i2);
        throw ((Throwable)localObject1);
      }
    }
    boolean bool1 = c();
    Object localObject3;
    if (bool1)
    {
      int i1 = 32100;
      localObject3 = j.a(i1);
      throw ((Throwable)localObject3);
    }
    boolean bool2 = f();
    if (bool2)
    {
      bool2 = true;
      this.s = bool2;
    }
    label130:
    label227:
    for (;;)
    {
      return;
      byte b1 = 4;
      this.q = b1;
      localObject3 = this.k;
      ((d)localObject3).i();
      b1 = 0;
      localObject3 = null;
      this.k = null;
      b1 = 0;
      localObject3 = null;
      this.j = null;
      b1 = 0;
      localObject3 = null;
      this.m = null;
      b1 = 0;
      localObject3 = null;
      this.i = null;
      b1 = 0;
      localObject3 = null;
      this.n = null;
      b1 = 0;
      localObject3 = null;
      this.h = null;
      b1 = 0;
      localObject3 = null;
      this.g = null;
      b1 = 0;
      localObject3 = null;
      this.l = null;
      b1 = 0;
      localObject3 = null;
      this.o = null;
    }
  }
  
  public void b(u paramu, n paramn)
  {
    Object localObject = "sendNoWait";
    boolean bool = c();
    if (!bool)
    {
      bool = c();
      if (!bool)
      {
        bool = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.d;
        if (bool) {}
      }
      else
      {
        bool = f();
        if (!bool) {
          break label69;
        }
        bool = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.e;
        if (!bool) {
          break label69;
        }
      }
    }
    a((u)paramu, paramn);
    return;
    label69:
    localObject = d;
    String str = c;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).a(str, "sendNoWait", "208");
    throw j.a(32104);
  }
  
  public boolean c()
  {
    synchronized (this.r)
    {
      int i1 = this.q;
      if (i1 == 0)
      {
        i1 = 1;
        return i1;
      }
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public boolean d()
  {
    int i1 = 1;
    synchronized (this.r)
    {
      int i2 = this.q;
      if (i2 == i1) {
        return i1;
      }
      i1 = 0;
      Object localObject2 = null;
    }
  }
  
  public boolean e()
  {
    synchronized (this.r)
    {
      int i1 = this.q;
      int i3 = 3;
      if (i1 == i3)
      {
        i1 = 1;
        return i1;
      }
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public boolean f()
  {
    synchronized (this.r)
    {
      int i1 = this.q;
      int i3 = 2;
      if (i1 == i3)
      {
        i1 = 1;
        return i1;
      }
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public boolean g()
  {
    synchronized (this.r)
    {
      int i1 = this.q;
      int i3 = 4;
      if (i1 == i3)
      {
        i1 = 1;
        return i1;
      }
      int i2 = 0;
      Object localObject2 = null;
    }
  }
  
  public int h()
  {
    return this.f;
  }
  
  public m[] i()
  {
    return this.g;
  }
  
  public org.eclipse.paho.client.mqttv3.b j()
  {
    return this.e;
  }
  
  public long k()
  {
    return this.k.a();
  }
  
  public n l()
  {
    n localn = null;
    try
    {
      d locald = this.k;
      localn = locald.d();
    }
    catch (MqttException localMqttException)
    {
      for (;;)
      {
        a(localMqttException);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        a(localException);
      }
    }
    return localn;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */