package org.eclipse.paho.client.mqttv3.a;

import java.io.EOFException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.a.b.i;
import org.eclipse.paho.client.mqttv3.a.b.o;
import org.eclipse.paho.client.mqttv3.a.b.u;

public class d
{
  private static final String a = d.class.getName();
  private static final boolean b = com.vvt.pushnotification.a.a;
  private static final boolean c = com.vvt.pushnotification.a.e;
  private static final org.eclipse.paho.client.mqttv3.b.b d;
  private boolean A;
  private Hashtable B;
  private Hashtable C;
  private Hashtable D;
  private org.eclipse.paho.client.mqttv3.m E;
  private int e = 0;
  private Hashtable f;
  private volatile Vector g;
  private volatile Vector h;
  private h i;
  private a j = null;
  private e k = null;
  private long l;
  private boolean m;
  private org.eclipse.paho.client.mqttv3.h n;
  private int o = 10;
  private int p = 0;
  private int q = 0;
  private Object r;
  private Object s;
  private boolean t;
  private long u;
  private long v;
  private long w;
  private u x;
  private Object y;
  private boolean z;
  
  static
  {
    String str = a;
    d = org.eclipse.paho.client.mqttv3.b.c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  protected d(org.eclipse.paho.client.mqttv3.h paramh, h paramh1, e parame, a parama, org.eclipse.paho.client.mqttv3.m paramm)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.r = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.s = localObject;
    this.t = false;
    this.u = l1;
    this.v = l1;
    this.w = l1;
    localObject = new java/lang/Object;
    localObject.<init>();
    this.y = localObject;
    this.z = false;
    this.A = false;
    this.B = null;
    this.C = null;
    this.D = null;
    this.E = null;
    localObject = d;
    String str = parama.j().a();
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).a(str);
    localObject = d;
    str = a;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).b(str, "<Init>", "");
    localObject = new java/util/Hashtable;
    ((Hashtable)localObject).<init>();
    this.f = ((Hashtable)localObject);
    localObject = new java/util/Vector;
    int i1 = this.o;
    ((Vector)localObject).<init>(i1);
    this.g = ((Vector)localObject);
    localObject = new java/util/Vector;
    ((Vector)localObject).<init>();
    this.h = ((Vector)localObject);
    localObject = new java/util/Hashtable;
    ((Hashtable)localObject).<init>();
    this.B = ((Hashtable)localObject);
    localObject = new java/util/Hashtable;
    ((Hashtable)localObject).<init>();
    this.C = ((Hashtable)localObject);
    localObject = new java/util/Hashtable;
    ((Hashtable)localObject).<init>();
    this.D = ((Hashtable)localObject);
    localObject = new org/eclipse/paho/client/mqttv3/a/b/i;
    ((i)localObject).<init>();
    this.x = ((u)localObject);
    this.q = 0;
    this.p = 0;
    this.n = paramh;
    this.k = parame;
    this.i = paramh1;
    this.j = parama;
    this.E = paramm;
    c();
  }
  
  private Vector a(Vector paramVector)
  {
    int i1 = 0;
    Vector localVector = new java/util/Vector;
    localVector.<init>();
    int i2 = paramVector.size();
    if (i2 == 0) {}
    for (Object localObject1 = localVector;; localObject1 = localVector)
    {
      return (Vector)localObject1;
      int i3 = 0;
      Object localObject2 = null;
      int i4 = 0;
      int i5 = 0;
      int i7;
      for (int i6 = 0;; i6 = i7)
      {
        i2 = paramVector.size();
        if (i3 >= i2) {
          break;
        }
        localObject1 = (u)paramVector.elementAt(i3);
        i7 = ((u)localObject1).j();
        i2 = i7 - i6;
        if (i2 > i5)
        {
          i5 = i7 - i6;
          i4 = i3;
        }
        i2 = i3 + 1;
        i3 = i2;
      }
      localObject1 = (u)paramVector.elementAt(0);
      i2 = ((u)localObject1).j();
      i3 = (char)-1 - i6;
      i2 += i3;
      if (i2 > i5) {
        i4 = 0;
      }
      i2 = i4;
      for (;;)
      {
        i3 = paramVector.size();
        if (i2 >= i3) {
          break;
        }
        localObject2 = paramVector.elementAt(i2);
        localVector.addElement(localObject2);
        i2 += 1;
      }
      while (i1 < i4)
      {
        localObject1 = paramVector.elementAt(i1);
        localVector.addElement(localObject1);
        i1 += 1;
      }
    }
  }
  
  private u a(String paramString, org.eclipse.paho.client.mqttv3.l paraml)
  {
    int i1 = 1;
    for (Object localObject1 = "restoreMessage";; localObject1 = null)
    {
      try
      {
        localObject1 = u.a(paraml);
      }
      catch (MqttException localMqttException)
      {
        for (;;)
        {
          Object[] arrayOfObject1;
          localObject1 = d;
          Object localObject2 = a;
          String str1 = "restoreMessage";
          String str2 = "602";
          Object[] arrayOfObject2 = new Object[i1];
          arrayOfObject2[0] = paramString;
          ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject2, str1, str2, arrayOfObject2, localMqttException);
          localObject1 = localMqttException.getCause();
          bool = localObject1 instanceof EOFException;
          if (!bool) {
            break;
          }
          if (paramString == null) {
            break label150;
          }
          this.n.b(paramString);
          bool = false;
          localObject1 = null;
        }
        throw localMqttException;
      }
      localObject2 = d;
      str1 = a;
      arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = paramString;
      arrayOfObject1[i1] = localObject1;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b(str1, "restoreMessage", "601", arrayOfObject1);
      return (u)localObject1;
      label150:
      boolean bool = false;
    }
  }
  
  private void a(int paramInt)
  {
    try
    {
      Hashtable localHashtable = this.f;
      Integer localInteger = Integer.valueOf(paramInt);
      localHashtable.remove(localInteger);
      return;
    }
    finally {}
  }
  
  private void a(Vector paramVector, u paramu)
  {
    int i1 = paramu.j();
    int i2 = 0;
    u localu = null;
    int i3 = 0;
    i2 = paramVector.size();
    if (i3 < i2)
    {
      localu = (u)paramVector.elementAt(i3);
      i2 = localu.j();
      if (i2 > i1) {
        paramVector.insertElementAt(paramu, i3);
      }
    }
    for (;;)
    {
      return;
      i2 = i3 + 1;
      i3 = i2;
      break;
      paramVector.addElement(paramu);
    }
  }
  
  private String c(u paramu)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("s-");
    int i1 = paramu.j();
    return i1;
  }
  
  private String d(u paramu)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("sc-");
    int i1 = paramu.j();
    return i1;
  }
  
  private String e(u paramu)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("r-");
    int i1 = paramu.j();
    return i1;
  }
  
  private void j()
  {
    int i1 = 1;
    Object localObject1 = new java/util/Vector;
    int i2 = this.o;
    ((Vector)localObject1).<init>(i2);
    this.g = ((Vector)localObject1);
    localObject1 = new java/util/Vector;
    ((Vector)localObject1).<init>();
    this.h = ((Vector)localObject1);
    localObject1 = this.B;
    Enumeration localEnumeration = ((Hashtable)localObject1).keys();
    boolean bool1;
    Object localObject2;
    org.eclipse.paho.client.mqttv3.b.b localb;
    String str1;
    String str2;
    String str3;
    Object[] arrayOfObject;
    for (;;)
    {
      bool1 = localEnumeration.hasMoreElements();
      if (!bool1) {
        break;
      }
      localObject2 = localEnumeration.nextElement();
      localObject1 = this.B.get(localObject2);
      boolean bool2 = localObject1 instanceof o;
      if (bool2)
      {
        localb = d;
        str1 = a;
        str2 = "restoreInflightMessages";
        str3 = "610";
        arrayOfObject = new Object[i1];
        arrayOfObject[0] = localObject2;
        localb.b(str1, str2, str3, arrayOfObject);
        localObject2 = this.g;
        localObject1 = (o)localObject1;
        a((Vector)localObject2, (u)localObject1);
      }
      else
      {
        bool2 = localObject1 instanceof org.eclipse.paho.client.mqttv3.a.b.n;
        if (bool2)
        {
          localb = d;
          str1 = a;
          str2 = "restoreInflightMessages";
          str3 = "611";
          arrayOfObject = new Object[i1];
          arrayOfObject[0] = localObject2;
          localb.b(str1, str2, str3, arrayOfObject);
          localObject2 = this.h;
          localObject1 = (org.eclipse.paho.client.mqttv3.a.b.n)localObject1;
          a((Vector)localObject2, (u)localObject1);
        }
      }
    }
    localObject1 = this.C;
    localEnumeration = ((Hashtable)localObject1).keys();
    for (;;)
    {
      bool1 = localEnumeration.hasMoreElements();
      if (!bool1) {
        break;
      }
      localObject2 = localEnumeration.nextElement();
      localObject1 = (o)this.C.get(localObject2);
      localb = d;
      str1 = a;
      str2 = "restoreInflightMessages";
      str3 = "612";
      arrayOfObject = new Object[i1];
      arrayOfObject[0] = localObject2;
      localb.b(str1, str2, str3, arrayOfObject);
      localObject2 = this.g;
      a((Vector)localObject2, (u)localObject1);
    }
    localObject1 = this.h;
    localObject1 = a((Vector)localObject1);
    this.h = ((Vector)localObject1);
    localObject1 = this.g;
    localObject1 = a((Vector)localObject1);
    this.g = ((Vector)localObject1);
  }
  
  private void k()
  {
    Object localObject1 = "decrementInFlight";
    synchronized (this.r)
    {
      int i1 = this.p + -1;
      this.p = i1;
      localObject1 = d;
      String str1 = a;
      String str2 = "decrementInFlight";
      String str3 = "646";
      int i2 = 1;
      Object[] arrayOfObject = new Object[i2];
      int i3 = this.p;
      Integer localInteger = Integer.valueOf(i3);
      arrayOfObject[0] = localInteger;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b(str1, str2, str3, arrayOfObject);
      boolean bool = f();
      if (!bool)
      {
        localObject1 = this.r;
        localObject1.notifyAll();
      }
      return;
    }
  }
  
  private int l()
  {
    boolean bool;
    do
    {
      try
      {
        int i1 = this.e;
        i2 = 0;
        MqttException localMqttException = null;
        int i3 = this.e + 1;
        this.e = i3;
        i3 = this.e;
        i4 = (char)-1;
        if (i3 > i4)
        {
          i3 = 1;
          this.e = i3;
        }
        i3 = this.e;
        if (i3 == i1)
        {
          i2 += 1;
          i3 = 2;
          if (i2 == i3)
          {
            i2 = 32001;
            localMqttException = j.a(i2);
            throw localMqttException;
          }
        }
      }
      finally {}
      Hashtable localHashtable1 = this.f;
      int i4 = this.e;
      Integer localInteger2 = Integer.valueOf(i4);
      bool = localHashtable1.containsKey(localInteger2);
    } while (bool);
    int i2 = this.e;
    Integer localInteger1 = Integer.valueOf(i2);
    Hashtable localHashtable2 = this.f;
    localHashtable2.put(localInteger1, localInteger1);
    i2 = this.e;
    return i2;
  }
  
  protected long a()
  {
    return this.l;
  }
  
  public Vector a(MqttException paramMqttException)
  {
    ??? = d;
    Object localObject2 = a;
    Object localObject3 = "resolveOldTokens";
    Object localObject4 = "632";
    int i1 = 1;
    Object[] arrayOfObject = new Object[i1];
    arrayOfObject[0] = paramMqttException;
    ((org.eclipse.paho.client.mqttv3.b.b)???).b((String)localObject2, (String)localObject3, (String)localObject4, arrayOfObject);
    if (paramMqttException == null)
    {
      paramMqttException = new org/eclipse/paho/client/mqttv3/MqttException;
      int i2 = 32102;
      paramMqttException.<init>(i2);
    }
    ??? = this.i;
    localObject2 = ((h)???).c();
    localObject3 = ((Vector)localObject2).elements();
    for (;;)
    {
      boolean bool1 = ((Enumeration)localObject3).hasMoreElements();
      if (bool1) {
        synchronized ((org.eclipse.paho.client.mqttv3.n)((Enumeration)localObject3).nextElement())
        {
          boolean bool2 = ((org.eclipse.paho.client.mqttv3.n)???).e();
          if (!bool2)
          {
            localObject4 = ((org.eclipse.paho.client.mqttv3.n)???).a;
            bool2 = ((q)localObject4).d();
            if (!bool2)
            {
              localObject4 = ((org.eclipse.paho.client.mqttv3.n)???).d();
              if (localObject4 == null)
              {
                localObject4 = ((org.eclipse.paho.client.mqttv3.n)???).a;
                ((q)localObject4).a(paramMqttException);
              }
            }
          }
          bool2 = ??? instanceof org.eclipse.paho.client.mqttv3.j;
          if (!bool2)
          {
            localObject4 = this.i;
            ??? = ((org.eclipse.paho.client.mqttv3.n)???).a.m();
            ((h)localObject4).b((String)???);
          }
        }
      }
    }
    return localVector;
  }
  
  protected void a(long paramLong)
  {
    long l1 = 1000L * paramLong;
    this.l = l1;
  }
  
  protected void a(org.eclipse.paho.client.mqttv3.a.b.b paramb)
  {
    long l1 = System.currentTimeMillis();
    this.v = l1;
    Object localObject1 = d;
    ??? = a;
    ??? = "627";
    int i1 = 2;
    Object[] arrayOfObject = new Object[i1];
    Integer localInteger = Integer.valueOf(paramb.j());
    arrayOfObject[0] = localInteger;
    int i2 = 1;
    arrayOfObject[i2] = paramb;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)???, "notifyReceivedAck", (String)???, arrayOfObject);
    localObject1 = this.i;
    ??? = ((h)localObject1).a(paramb);
    boolean bool = paramb instanceof org.eclipse.paho.client.mqttv3.a.b.m;
    if (bool)
    {
      localObject1 = new org/eclipse/paho/client/mqttv3/a/b/n;
      paramb = (org.eclipse.paho.client.mqttv3.a.b.m)paramb;
      ((org.eclipse.paho.client.mqttv3.a.b.n)localObject1).<init>(paramb);
      a((u)localObject1, (org.eclipse.paho.client.mqttv3.n)???);
    }
    for (;;)
    {
      f();
      return;
      bool = paramb instanceof org.eclipse.paho.client.mqttv3.a.b.k;
      if (!bool)
      {
        bool = paramb instanceof org.eclipse.paho.client.mqttv3.a.b.l;
        if (!bool) {}
      }
      else
      {
        a((u)paramb, (org.eclipse.paho.client.mqttv3.n)???, null);
        continue;
      }
      bool = paramb instanceof org.eclipse.paho.client.mqttv3.a.b.j;
      if (bool)
      {
        ??? = this.y;
        bool = false;
        localObject1 = null;
        try
        {
          this.z = false;
          a((u)paramb, (org.eclipse.paho.client.mqttv3.n)???, null);
          localObject1 = this.i;
          ((h)localObject1).b((u)paramb);
          continue;
        }
        finally {}
      }
      else
      {
        bool = paramb instanceof org.eclipse.paho.client.mqttv3.a.b.c;
        if (bool)
        {
          Object localObject3 = paramb;
          localObject3 = (org.eclipse.paho.client.mqttv3.a.b.c)paramb;
          int i3 = ((org.eclipse.paho.client.mqttv3.a.b.c)localObject3).b_();
          int i4;
          if (i3 == 0) {
            synchronized (this.r)
            {
              i4 = this.m;
              if (i4 != 0)
              {
                b();
                localObject3 = this.i;
                ((h)localObject3).a((org.eclipse.paho.client.mqttv3.n)???, (u)paramb);
              }
              i4 = 0;
              localObject3 = null;
              this.q = 0;
              i4 = 0;
              localObject3 = null;
              this.p = 0;
              j();
              g();
              ??? = this.j;
              localObject3 = paramb;
              localObject3 = (org.eclipse.paho.client.mqttv3.a.b.c)paramb;
              ((a)???).a((org.eclipse.paho.client.mqttv3.a.b.c)localObject3, null);
              a((u)paramb, (org.eclipse.paho.client.mqttv3.n)???, null);
              localObject3 = this.i;
              ((h)localObject3).b((u)paramb);
              synchronized (this.r)
              {
                localObject3 = this.r;
                localObject3.notifyAll();
              }
            }
          }
          throw j.a(i4);
        }
        a(paramb, (org.eclipse.paho.client.mqttv3.n)???, null);
        int i5 = paramb.j();
        a(i5);
        h localh = this.i;
        localh.b(paramb);
      }
    }
  }
  
  protected void a(o paramo)
  {
    int i1 = 1;
    Object localObject1 = "undo";
    synchronized (this.r)
    {
      localObject1 = d;
      Object localObject4 = a;
      String str1 = "undo";
      String str2 = "618";
      int i2 = 2;
      Object[] arrayOfObject = new Object[i2];
      int i3 = 0;
      int i4 = paramo.j();
      Object localObject5 = Integer.valueOf(i4);
      arrayOfObject[0] = localObject5;
      i3 = 1;
      localObject5 = paramo.h();
      i4 = ((org.eclipse.paho.client.mqttv3.k)localObject5).c();
      localObject5 = Integer.valueOf(i4);
      arrayOfObject[i3] = localObject5;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject4, str1, str2, arrayOfObject);
      localObject1 = paramo.h();
      int i5 = ((org.eclipse.paho.client.mqttv3.k)localObject1).c();
      if (i5 == i1)
      {
        localObject1 = this.C;
        i6 = paramo.j();
        localObject4 = Integer.valueOf(i6);
        ((Hashtable)localObject1).remove(localObject4);
        localObject1 = this.g;
        ((Vector)localObject1).removeElement(paramo);
        localObject1 = this.n;
        localObject4 = c(paramo);
        ((org.eclipse.paho.client.mqttv3.h)localObject1).b((String)localObject4);
        localObject1 = this.i;
        ((h)localObject1).b(paramo);
        f();
        return;
      }
      localObject1 = this.B;
      int i6 = paramo.j();
      localObject4 = Integer.valueOf(i6);
      ((Hashtable)localObject1).remove(localObject4);
    }
  }
  
  protected void a(u paramu)
  {
    long l1 = System.currentTimeMillis();
    this.u = l1;
    Object localObject1 = d;
    Object localObject2 = a;
    String str1 = "notifySent";
    String str2 = "625";
    int i1 = 1;
    Object[] arrayOfObject = new Object[i1];
    String str3 = paramu.e();
    arrayOfObject[0] = str3;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject2, str1, str2, arrayOfObject);
    localObject2 = this.i.a(paramu);
    localObject1 = ((org.eclipse.paho.client.mqttv3.n)localObject2).a;
    ((q)localObject1).h();
    boolean bool = paramu instanceof o;
    if (bool)
    {
      localObject1 = paramu;
      localObject1 = ((o)paramu).h();
      int i2 = ((org.eclipse.paho.client.mqttv3.k)localObject1).c();
      if (i2 == 0)
      {
        ((org.eclipse.paho.client.mqttv3.n)localObject2).a.a(null, null);
        this.k.b((org.eclipse.paho.client.mqttv3.n)localObject2);
        k();
        i2 = ((u)paramu).j();
        a(i2);
        localObject1 = this.i;
        ((h)localObject1).b((u)paramu);
        f();
      }
    }
  }
  
  public void a(u paramu, org.eclipse.paho.client.mqttv3.n paramn)
  {
    int i1 = 2;
    int i2 = 1;
    int i3 = 0;
    Object[] arrayOfObject = null;
    Object localObject1 = "send";
    boolean bool1 = paramu.g_();
    if (bool1)
    {
      int i4 = paramu.j();
      if (i4 == 0)
      {
        i4 = l();
        paramu.a(i4);
      }
    }
    if (paramn != null) {}
    try
    {
      localObject1 = paramn.a;
      i6 = paramu.j();
      ((q)localObject1).a(i6);
    }
    catch (Exception localException)
    {
      int i6;
      boolean bool2;
      int i5;
      int i7;
      Object localObject9;
      String str;
      Object localObject10;
      int i8;
      Object localObject11;
      Integer localInteger1;
      Object localObject12;
      Object localObject3;
      int i9;
      Integer localInteger2;
      boolean bool3;
      for (;;) {}
    }
    bool2 = paramu instanceof o;
    if (bool2)
    {
      synchronized (this.r)
      {
        i5 = this.p;
        i7 = this.o;
        if (i5 >= i7)
        {
          localObject1 = d;
          localObject9 = a;
          str = "send";
          localObject10 = "613";
          i8 = 1;
          localObject11 = new Object[i8];
          i3 = 0;
          arrayOfObject = null;
          i2 = this.p;
          localInteger1 = Integer.valueOf(i2);
          localObject11[0] = localInteger1;
          ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject9, str, (String)localObject10, (Object[])localObject11);
          localObject1 = new org/eclipse/paho/client/mqttv3/MqttException;
          i7 = 32202;
          ((MqttException)localObject1).<init>(i7);
          throw ((Throwable)localObject1);
        }
      }
      localObject12 = paramu;
      localObject12 = (o)paramu;
      localObject3 = localObject12;
      localObject3 = ((o)localObject12).h();
      localObject9 = d;
      str = a;
      localObject10 = "send";
      localObject11 = "628";
      i3 = 3;
      arrayOfObject = new Object[i3];
      i2 = 0;
      localInteger1 = null;
      i9 = ((u)paramu).j();
      localInteger2 = Integer.valueOf(i9);
      arrayOfObject[0] = localInteger2;
      i2 = 1;
      i9 = ((org.eclipse.paho.client.mqttv3.k)localObject3).c();
      localInteger2 = Integer.valueOf(i9);
      arrayOfObject[i2] = localInteger2;
      i2 = 2;
      arrayOfObject[i2] = paramu;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject9).b(str, (String)localObject10, (String)localObject11, arrayOfObject);
      i5 = ((org.eclipse.paho.client.mqttv3.k)localObject3).c();
      switch (i5)
      {
      default: 
        localObject3 = this.i;
        ((h)localObject3).a(paramn, (u)paramu);
        localObject3 = this.g;
        ((Vector)localObject3).addElement(paramu);
        localObject3 = this.r;
        localObject3.notifyAll();
      }
    }
    for (;;)
    {
      return;
      localObject3 = this.B;
      i7 = ((u)paramu).j();
      localObject9 = Integer.valueOf(i7);
      ((Hashtable)localObject3).put(localObject9, paramu);
      localObject9 = this.n;
      str = c((u)paramu);
      localObject12 = paramu;
      localObject12 = (o)paramu;
      localObject3 = localObject12;
      ((org.eclipse.paho.client.mqttv3.h)localObject9).a(str, (org.eclipse.paho.client.mqttv3.l)localObject12);
      break;
      localObject3 = this.C;
      i7 = ((u)paramu).j();
      localObject9 = Integer.valueOf(i7);
      ((Hashtable)localObject3).put(localObject9, paramu);
      localObject9 = this.n;
      str = c((u)paramu);
      localObject12 = paramu;
      localObject12 = (o)paramu;
      localObject3 = localObject12;
      ((org.eclipse.paho.client.mqttv3.h)localObject9).a(str, (org.eclipse.paho.client.mqttv3.l)localObject12);
      break;
      localObject3 = d;
      ??? = a;
      localObject9 = "send";
      str = "615";
      localObject10 = new Object[i1];
      i8 = paramu.j();
      localObject11 = Integer.valueOf(i8);
      localObject10[0] = localObject11;
      localObject10[i2] = paramu;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject3).b((String)???, (String)localObject9, str, (Object[])localObject10);
      bool3 = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.d;
      if (bool3) {
        synchronized (this.r)
        {
          localObject3 = this.i;
          ((h)localObject3).a(paramn, (u)paramu);
          localObject3 = this.h;
          i7 = 0;
          localObject9 = null;
          ((Vector)localObject3).insertElementAt(paramu, 0);
          localObject3 = this.r;
          localObject3.notifyAll();
        }
      }
    }
    bool3 = paramu instanceof i;
    if (bool3) {
      this.x = ((u)paramu);
    }
    for (;;)
    {
      ??? = this.r;
      bool3 = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.b;
      if (!bool3) {}
      try
      {
        Object localObject5 = this.i;
        ((h)localObject5).a(paramn, (u)paramu);
        localObject5 = this.h;
        ((Vector)localObject5).addElement(paramu);
        localObject5 = this.r;
        localObject5.notifyAll();
        break;
      }
      finally {}
      bool3 = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.n;
      Object localObject7;
      if (bool3)
      {
        localObject7 = this.B;
        i6 = ((u)paramu).j();
        ??? = Integer.valueOf(i6);
        ((Hashtable)localObject7).put(???, paramu);
        ??? = this.n;
        localObject9 = d((u)paramu);
        localObject7 = paramu;
        localObject7 = (org.eclipse.paho.client.mqttv3.a.b.n)paramu;
        ((org.eclipse.paho.client.mqttv3.h)???).a((String)localObject9, (org.eclipse.paho.client.mqttv3.l)localObject7);
      }
      else
      {
        bool3 = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.l;
        if (bool3)
        {
          localObject7 = this.n;
          ??? = e((u)paramu);
          ((org.eclipse.paho.client.mqttv3.h)localObject7).b((String)???);
        }
      }
    }
  }
  
  protected void a(u paramu, org.eclipse.paho.client.mqttv3.n paramn, MqttException paramMqttException)
  {
    int i1 = 2;
    int i2 = 1;
    Object localObject = paramn.a;
    ((q)localObject).a(paramu, paramMqttException);
    String str1;
    String str2;
    String str3;
    Object[] arrayOfObject;
    String str4;
    if (paramu != null)
    {
      boolean bool = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.b;
      if (bool)
      {
        bool = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.m;
        if (!bool)
        {
          localObject = d;
          str1 = a;
          str2 = "notifyResult";
          str3 = "648";
          int i3 = 3;
          arrayOfObject = new Object[i3];
          str4 = paramn.a.m();
          arrayOfObject[0] = str4;
          arrayOfObject[i2] = paramu;
          arrayOfObject[i1] = paramMqttException;
          ((org.eclipse.paho.client.mqttv3.b.b)localObject).b(str1, str2, str3, arrayOfObject);
          localObject = this.k;
          ((e)localObject).b(paramn);
        }
      }
    }
    if (paramu == null)
    {
      localObject = d;
      str1 = a;
      str2 = "notifyResult";
      str3 = "649";
      arrayOfObject = new Object[i1];
      str4 = paramn.a.m();
      arrayOfObject[0] = str4;
      arrayOfObject[i2] = paramMqttException;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject).b(str1, str2, str3, arrayOfObject);
      localObject = this.k;
      ((e)localObject).b(paramn);
    }
  }
  
  protected void a(org.eclipse.paho.client.mqttv3.n paramn)
  {
    int i1 = 2;
    int i2 = 1;
    Object localObject1 = paramn.a;
    Object localObject2 = ((q)localObject1).j();
    Object localObject3;
    Object localObject4;
    String str;
    Object[] arrayOfObject;
    int i8;
    int i3;
    if (localObject2 != null)
    {
      boolean bool1 = localObject2 instanceof org.eclipse.paho.client.mqttv3.a.b.b;
      if (bool1)
      {
        localObject1 = d;
        localObject3 = a;
        localObject4 = "notifyComplete";
        str = "629";
        int i4 = 3;
        arrayOfObject = new Object[i4];
        int i5 = ((u)localObject2).j();
        Integer localInteger = Integer.valueOf(i5);
        arrayOfObject[0] = localInteger;
        arrayOfObject[i2] = paramn;
        arrayOfObject[i1] = localObject2;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject3, (String)localObject4, str, arrayOfObject);
        localObject1 = localObject2;
        localObject1 = (org.eclipse.paho.client.mqttv3.a.b.b)localObject2;
        boolean bool2 = localObject1 instanceof org.eclipse.paho.client.mqttv3.a.b.k;
        if (!bool2) {
          break label296;
        }
        localObject3 = this.n;
        localObject4 = c((u)localObject2);
        ((org.eclipse.paho.client.mqttv3.h)localObject3).b((String)localObject4);
        localObject3 = this.C;
        i8 = ((org.eclipse.paho.client.mqttv3.a.b.b)localObject1).j();
        localObject4 = Integer.valueOf(i8);
        ((Hashtable)localObject3).remove(localObject4);
        k();
        int i6 = ((u)localObject2).j();
        a(i6);
        this.i.b((u)localObject2);
        localObject2 = d;
        localObject3 = a;
        localObject4 = "notifyComplete";
        str = "650";
        arrayOfObject = new Object[i2];
        i3 = ((org.eclipse.paho.client.mqttv3.a.b.b)localObject1).j();
        localObject1 = Integer.valueOf(i3);
        arrayOfObject[0] = localObject1;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b((String)localObject3, (String)localObject4, str, arrayOfObject);
      }
    }
    for (;;)
    {
      f();
      return;
      label296:
      boolean bool3 = localObject1 instanceof org.eclipse.paho.client.mqttv3.a.b.l;
      if (bool3)
      {
        localObject3 = this.n;
        localObject4 = c((u)localObject2);
        ((org.eclipse.paho.client.mqttv3.h)localObject3).b((String)localObject4);
        localObject3 = this.n;
        localObject4 = d((u)localObject2);
        ((org.eclipse.paho.client.mqttv3.h)localObject3).b((String)localObject4);
        localObject3 = this.B;
        i8 = ((org.eclipse.paho.client.mqttv3.a.b.b)localObject1).j();
        localObject4 = Integer.valueOf(i8);
        ((Hashtable)localObject3).remove(localObject4);
        int i7 = this.q + -1;
        this.q = i7;
        k();
        i7 = ((u)localObject2).j();
        a(i7);
        this.i.b((u)localObject2);
        localObject2 = d;
        localObject3 = a;
        localObject4 = "notifyComplete";
        str = "645";
        arrayOfObject = new Object[i1];
        localObject1 = Integer.valueOf(((org.eclipse.paho.client.mqttv3.a.b.b)localObject1).j());
        arrayOfObject[0] = localObject1;
        i3 = this.q;
        localObject1 = Integer.valueOf(i3);
        arrayOfObject[i2] = localObject1;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b((String)localObject3, (String)localObject4, str, arrayOfObject);
      }
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  protected void b()
  {
    org.eclipse.paho.client.mqttv3.b.b localb = d;
    String str = a;
    localb.a(str, "clearState", ">");
    this.n.c();
    this.f.clear();
    this.g.clear();
    this.h.clear();
    this.B.clear();
    this.C.clear();
    this.D.clear();
    this.i.d();
  }
  
  /* Error */
  public void b(long paramLong)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: iconst_0
    //   3: istore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: ldc_w 499
    //   11: astore 6
    //   13: lconst_0
    //   14: lstore 7
    //   16: lload_1
    //   17: lload 7
    //   19: lcmp
    //   20: istore 9
    //   22: iload 9
    //   24: ifle +401 -> 425
    //   27: getstatic 76	org/eclipse/paho/client/mqttv3/a/d:d	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   30: astore 6
    //   32: getstatic 57	org/eclipse/paho/client/mqttv3/a/d:a	Ljava/lang/String;
    //   35: astore 10
    //   37: ldc_w 499
    //   40: astore 11
    //   42: ldc_w 501
    //   45: astore 12
    //   47: iload_3
    //   48: anewarray 4	java/lang/Object
    //   51: astore 13
    //   53: new 503	java/lang/Long
    //   56: astore 14
    //   58: aload 14
    //   60: lload_1
    //   61: invokespecial 506	java/lang/Long:<init>	(J)V
    //   64: aload 13
    //   66: iconst_0
    //   67: aload 14
    //   69: aastore
    //   70: aload 6
    //   72: aload 10
    //   74: aload 11
    //   76: aload 12
    //   78: aload 13
    //   80: invokeinterface 195 5 0
    //   85: aload_0
    //   86: getfield 95	org/eclipse/paho/client/mqttv3/a/d:r	Ljava/lang/Object;
    //   89: astore 10
    //   91: aload 10
    //   93: monitorenter
    //   94: iconst_1
    //   95: istore 9
    //   97: aload_0
    //   98: iload 9
    //   100: putfield 99	org/eclipse/paho/client/mqttv3/a/d:t	Z
    //   103: aload 10
    //   105: monitorexit
    //   106: aload_0
    //   107: getfield 86	org/eclipse/paho/client/mqttv3/a/d:k	Lorg/eclipse/paho/client/mqttv3/a/e;
    //   110: astore 6
    //   112: aload 6
    //   114: invokevirtual 507	org/eclipse/paho/client/mqttv3/a/e:removeFromPath	()V
    //   117: aload_0
    //   118: invokevirtual 508	org/eclipse/paho/client/mqttv3/a/d:AppEngine1	()V
    //   121: aload_0
    //   122: getfield 97	org/eclipse/paho/client/mqttv3/a/d:s	Ljava/lang/Object;
    //   125: astore 10
    //   127: aload 10
    //   129: monitorenter
    //   130: aload_0
    //   131: getfield 164	org/eclipse/paho/client/mqttv3/a/d:i	Lorg/eclipse/paho/client/mqttv3/a/AppEngine1;
    //   134: astore 6
    //   136: aload 6
    //   138: invokevirtual 510	org/eclipse/paho/client/mqttv3/a/AppEngine1:e	()I
    //   141: istore 9
    //   143: iload 9
    //   145: ifgt +39 -> 184
    //   148: aload_0
    //   149: getfield 155	org/eclipse/paho/client/mqttv3/a/d:AppEngine1	Ljava/util/Vector;
    //   152: astore 11
    //   154: aload 11
    //   156: invokevirtual 170	java/util/Vector:size	()I
    //   159: istore 15
    //   161: iload 15
    //   163: ifgt +21 -> 184
    //   166: aload_0
    //   167: getfield 86	org/eclipse/paho/client/mqttv3/a/d:k	Lorg/eclipse/paho/client/mqttv3/a/e;
    //   170: astore 11
    //   172: aload 11
    //   174: invokevirtual 512	org/eclipse/paho/client/mqttv3/a/e:MyUncaughtExceptionHandler	()Z
    //   177: istore 15
    //   179: iload 15
    //   181: ifne +152 -> 333
    //   184: getstatic 76	org/eclipse/paho/client/mqttv3/a/d:d	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   187: astore 11
    //   189: getstatic 57	org/eclipse/paho/client/mqttv3/a/d:a	Ljava/lang/String;
    //   192: astore 12
    //   194: ldc_w 499
    //   197: astore 13
    //   199: ldc_w 514
    //   202: astore 14
    //   204: iconst_4
    //   205: istore 4
    //   207: iload 4
    //   209: anewarray 4	java/lang/Object
    //   212: astore 5
    //   214: iconst_0
    //   215: istore 16
    //   217: aload_0
    //   218: getfield 91	org/eclipse/paho/client/mqttv3/a/d:p	I
    //   221: istore 17
    //   223: iload 17
    //   225: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   228: astore 18
    //   230: aload 5
    //   232: iconst_0
    //   233: aload 18
    //   235: aastore
    //   236: iconst_1
    //   237: istore 16
    //   239: aload_0
    //   240: getfield 155	org/eclipse/paho/client/mqttv3/a/d:AppEngine1	Ljava/util/Vector;
    //   243: astore 18
    //   245: aload 18
    //   247: invokevirtual 170	java/util/Vector:size	()I
    //   250: istore 17
    //   252: iload 17
    //   254: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   257: astore 18
    //   259: aload 5
    //   261: iload 16
    //   263: aload 18
    //   265: aastore
    //   266: iconst_2
    //   267: istore 16
    //   269: aload_0
    //   270: getfield 93	org/eclipse/paho/client/mqttv3/a/d:q	I
    //   273: istore 17
    //   275: iload 17
    //   277: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   280: astore 18
    //   282: aload 5
    //   284: iload 16
    //   286: aload 18
    //   288: aastore
    //   289: iconst_3
    //   290: istore 16
    //   292: iload 9
    //   294: invokestatic 218	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   297: astore 6
    //   299: aload 5
    //   301: iload 16
    //   303: aload 6
    //   305: aastore
    //   306: aload 11
    //   308: aload 12
    //   310: aload 13
    //   312: aload 14
    //   314: aload 5
    //   316: invokeinterface 195 5 0
    //   321: aload_0
    //   322: getfield 97	org/eclipse/paho/client/mqttv3/a/d:s	Ljava/lang/Object;
    //   325: astore 6
    //   327: aload 6
    //   329: lload_1
    //   330: invokevirtual 518	java/lang/Object:wait	(J)V
    //   333: aload 10
    //   335: monitorexit
    //   336: aload_0
    //   337: getfield 95	org/eclipse/paho/client/mqttv3/a/d:r	Ljava/lang/Object;
    //   340: astore 10
    //   342: aload 10
    //   344: monitorenter
    //   345: aload_0
    //   346: getfield 152	org/eclipse/paho/client/mqttv3/a/d:FxFileObserverWorker	Ljava/util/Vector;
    //   349: astore 6
    //   351: aload 6
    //   353: invokevirtual 495	java/util/Vector:clear	()V
    //   356: aload_0
    //   357: getfield 155	org/eclipse/paho/client/mqttv3/a/d:AppEngine1	Ljava/util/Vector;
    //   360: astore 6
    //   362: aload 6
    //   364: invokevirtual 495	java/util/Vector:clear	()V
    //   367: iconst_0
    //   368: istore 9
    //   370: aconst_null
    //   371: astore 6
    //   373: aload_0
    //   374: iconst_0
    //   375: putfield 99	org/eclipse/paho/client/mqttv3/a/d:t	Z
    //   378: iconst_0
    //   379: istore 9
    //   381: aconst_null
    //   382: astore 6
    //   384: aload_0
    //   385: iconst_0
    //   386: putfield 91	org/eclipse/paho/client/mqttv3/a/d:p	I
    //   389: aload 10
    //   391: monitorexit
    //   392: getstatic 76	org/eclipse/paho/client/mqttv3/a/d:d	Lorg/eclipse/paho/client/mqttv3/removeFromPath/removeFromPath;
    //   395: astore 6
    //   397: getstatic 57	org/eclipse/paho/client/mqttv3/a/d:a	Ljava/lang/String;
    //   400: astore 10
    //   402: ldc_w 499
    //   405: astore 11
    //   407: ldc_w 520
    //   410: astore 12
    //   412: aload 6
    //   414: aload 10
    //   416: aload 11
    //   418: aload 12
    //   420: invokeinterface 490 4 0
    //   425: return
    //   426: astore 6
    //   428: aload 10
    //   430: monitorexit
    //   431: aload 6
    //   433: athrow
    //   434: astore 6
    //   436: aload 10
    //   438: monitorexit
    //   439: aload 6
    //   441: athrow
    //   442: astore 6
    //   444: aload 10
    //   446: monitorexit
    //   447: aload 6
    //   449: athrow
    //   450: astore 6
    //   452: goto -119 -> 333
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	455	0	this	d
    //   0	455	1	paramLong	long
    //   1	47	3	i1	int
    //   3	205	4	i2	int
    //   6	309	5	arrayOfObject	Object[]
    //   11	402	6	localObject1	Object
    //   426	6	6	localObject2	Object
    //   434	6	6	localObject3	Object
    //   442	6	6	localObject4	Object
    //   450	1	6	localInterruptedException	InterruptedException
    //   14	4	7	l1	long
    //   20	79	9	bool1	boolean
    //   141	239	9	i3	int
    //   40	377	11	localObject6	Object
    //   45	374	12	str	String
    //   51	260	13	localObject7	Object
    //   56	257	14	localObject8	Object
    //   159	3	15	i4	int
    //   177	3	15	bool2	boolean
    //   215	87	16	i5	int
    //   221	55	17	i6	int
    //   228	59	18	localObject9	Object
    // Exception table:
    //   from	to	target	type
    //   98	103	426	finally
    //   103	106	426	finally
    //   428	431	426	finally
    //   130	134	434	finally
    //   136	141	434	finally
    //   148	152	434	finally
    //   154	159	434	finally
    //   166	170	434	finally
    //   172	177	434	finally
    //   184	187	434	finally
    //   189	192	434	finally
    //   207	212	434	finally
    //   217	221	434	finally
    //   223	228	434	finally
    //   233	236	434	finally
    //   239	243	434	finally
    //   245	250	434	finally
    //   252	257	434	finally
    //   263	266	434	finally
    //   269	273	434	finally
    //   275	280	434	finally
    //   286	289	434	finally
    //   292	297	434	finally
    //   303	306	434	finally
    //   314	321	434	finally
    //   321	325	434	finally
    //   329	333	434	finally
    //   333	336	434	finally
    //   436	439	434	finally
    //   345	349	442	finally
    //   351	356	442	finally
    //   356	360	442	finally
    //   362	367	442	finally
    //   374	378	442	finally
    //   385	389	442	finally
    //   389	392	442	finally
    //   444	447	442	finally
    //   130	134	450	java/lang/InterruptedException
    //   136	141	450	java/lang/InterruptedException
    //   148	152	450	java/lang/InterruptedException
    //   154	159	450	java/lang/InterruptedException
    //   166	170	450	java/lang/InterruptedException
    //   172	177	450	java/lang/InterruptedException
    //   184	187	450	java/lang/InterruptedException
    //   189	192	450	java/lang/InterruptedException
    //   207	212	450	java/lang/InterruptedException
    //   217	221	450	java/lang/InterruptedException
    //   223	228	450	java/lang/InterruptedException
    //   233	236	450	java/lang/InterruptedException
    //   239	243	450	java/lang/InterruptedException
    //   245	250	450	java/lang/InterruptedException
    //   252	257	450	java/lang/InterruptedException
    //   263	266	450	java/lang/InterruptedException
    //   269	273	450	java/lang/InterruptedException
    //   275	280	450	java/lang/InterruptedException
    //   286	289	450	java/lang/InterruptedException
    //   292	297	450	java/lang/InterruptedException
    //   303	306	450	java/lang/InterruptedException
    //   314	321	450	java/lang/InterruptedException
    //   321	325	450	java/lang/InterruptedException
    //   329	333	450	java/lang/InterruptedException
  }
  
  public void b(MqttException paramMqttException)
  {
    Object localObject1 = d;
    Object localObject3 = a;
    String str1 = "disconnected";
    String str2 = "633";
    int i1 = 1;
    Object[] arrayOfObject = new Object[i1];
    arrayOfObject[0] = paramMqttException;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject3, str1, str2, arrayOfObject);
    this.A = false;
    for (;;)
    {
      try
      {
        boolean bool = this.m;
        if (bool) {
          b();
        }
        localObject1 = this.g;
        ((Vector)localObject1).clear();
        localObject1 = this.h;
        ((Vector)localObject1).clear();
        localObject3 = this.y;
        bool = false;
        localObject1 = null;
      }
      catch (MqttException localMqttException)
      {
        continue;
      }
      try
      {
        this.z = false;
        return;
      }
      finally {}
    }
  }
  
  protected void b(o paramo)
  {
    Object localObject1 = d;
    Object localObject2 = a;
    Object[] arrayOfObject = new Object[1];
    Integer localInteger = Integer.valueOf(paramo.j());
    arrayOfObject[0] = localInteger;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject2, "deliveryComplete", "641", arrayOfObject);
    localObject1 = this.n;
    localObject2 = e(paramo);
    ((org.eclipse.paho.client.mqttv3.h)localObject1).b((String)localObject2);
    localObject1 = this.D;
    localObject2 = Integer.valueOf(paramo.j());
    ((Hashtable)localObject1).remove(localObject2);
  }
  
  protected void b(u paramu)
  {
    long l1 = System.currentTimeMillis();
    this.v = l1;
    Object localObject1 = d;
    Object localObject2 = a;
    Object localObject3 = "notifyReceivedMsg";
    String str = "651";
    int i1 = 2;
    Object[] arrayOfObject = new Object[i1];
    int i2 = paramu.j();
    Integer localInteger = Integer.valueOf(i2);
    arrayOfObject[0] = localInteger;
    int i3 = 1;
    arrayOfObject[i3] = paramu;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).b((String)localObject2, (String)localObject3, str, arrayOfObject);
    boolean bool = this.t;
    int i4;
    if (!bool)
    {
      bool = paramu instanceof o;
      if (!bool) {
        break label267;
      }
      localObject1 = paramu;
      localObject1 = (o)paramu;
      localObject2 = ((o)localObject1).h();
      i4 = ((org.eclipse.paho.client.mqttv3.k)localObject2).c();
      switch (i4)
      {
      }
    }
    for (;;)
    {
      return;
      localObject2 = this.k;
      if (localObject2 != null)
      {
        localObject2 = this.k;
        ((e)localObject2).a((o)localObject1);
        continue;
        localObject2 = this.n;
        localObject3 = e((u)paramu);
        paramu = (o)paramu;
        ((org.eclipse.paho.client.mqttv3.h)localObject2).a((String)localObject3, paramu);
        localObject2 = this.D;
        int i5 = ((o)localObject1).j();
        localObject3 = Integer.valueOf(i5);
        ((Hashtable)localObject2).put(localObject3, localObject1);
        localObject2 = new org/eclipse/paho/client/mqttv3/a/b/m;
        ((org.eclipse.paho.client.mqttv3.a.b.m)localObject2).<init>((o)localObject1);
        a((u)localObject2, null);
        continue;
        label267:
        bool = paramu instanceof org.eclipse.paho.client.mqttv3.a.b.n;
        if (bool)
        {
          localObject1 = this.D;
          i4 = ((u)paramu).j();
          localObject2 = Integer.valueOf(i4);
          localObject1 = (o)((Hashtable)localObject1).get(localObject2);
          if (localObject1 != null)
          {
            localObject2 = this.k;
            if (localObject2 != null)
            {
              localObject2 = this.k;
              ((e)localObject2).a((o)localObject1);
            }
          }
          else
          {
            localObject1 = new org/eclipse/paho/client/mqttv3/a/b/l;
            i4 = ((u)paramu).j();
            ((org.eclipse.paho.client.mqttv3.a.b.l)localObject1).<init>(i4);
            a((u)localObject1, null);
          }
        }
      }
    }
  }
  
  protected void c()
  {
    int i1 = 2;
    boolean bool1 = true;
    Object localObject1 = this.n;
    Object localObject2 = ((org.eclipse.paho.client.mqttv3.h)localObject1).b();
    int i2 = this.e;
    Object localObject3 = new java/util/Vector;
    ((Vector)localObject3).<init>();
    Object localObject4 = d;
    Object localObject5 = a;
    Object localObject6 = "restoreState";
    String str1 = "600";
    ((org.eclipse.paho.client.mqttv3.b.b)localObject4).a((String)localObject5, (String)localObject6, str1);
    int i4 = i2;
    int i3 = ((Enumeration)localObject2).hasMoreElements();
    Object localObject7;
    int i5;
    if (i3 != 0)
    {
      localObject1 = (String)((Enumeration)localObject2).nextElement();
      localObject4 = this.n.a((String)localObject1);
      localObject5 = a((String)localObject1, (org.eclipse.paho.client.mqttv3.l)localObject4);
      String str2;
      Object localObject8;
      if (localObject5 != null)
      {
        localObject4 = "r-";
        boolean bool3 = ((String)localObject1).startsWith((String)localObject4);
        if (bool3)
        {
          localObject4 = d;
          str1 = a;
          localObject7 = "restoreState";
          str2 = "604";
          localObject8 = new Object[i1];
          localObject8[0] = localObject1;
          localObject8[bool1] = localObject5;
          ((org.eclipse.paho.client.mqttv3.b.b)localObject4).b(str1, (String)localObject7, str2, (Object[])localObject8);
          localObject1 = this.D;
          int i6 = ((u)localObject5).j();
          localObject4 = Integer.valueOf(i6);
          ((Hashtable)localObject1).put(localObject4, localObject5);
          i3 = i4;
        }
      }
      for (;;)
      {
        i4 = i3;
        break;
        localObject4 = "s-";
        boolean bool4 = ((String)localObject1).startsWith((String)localObject4);
        if (bool4)
        {
          localObject4 = localObject5;
          localObject4 = (o)localObject5;
          int i8 = Math.max(((o)localObject4).j(), i4);
          localObject6 = this.n;
          localObject7 = d((u)localObject4);
          boolean bool2 = ((org.eclipse.paho.client.mqttv3.h)localObject6).c((String)localObject7);
          Object localObject9;
          int i9;
          if (bool2)
          {
            localObject6 = this.n;
            localObject7 = d((u)localObject4);
            localObject6 = ((org.eclipse.paho.client.mqttv3.h)localObject6).a((String)localObject7);
            localObject6 = (org.eclipse.paho.client.mqttv3.a.b.n)a((String)localObject1, (org.eclipse.paho.client.mqttv3.l)localObject6);
            if (localObject6 != null)
            {
              ((org.eclipse.paho.client.mqttv3.a.b.n)localObject6).a(bool1);
              localObject7 = d;
              str2 = a;
              localObject8 = "restoreState";
              localObject9 = "605";
              Object[] arrayOfObject = new Object[i1];
              arrayOfObject[0] = localObject1;
              arrayOfObject[bool1] = localObject5;
              ((org.eclipse.paho.client.mqttv3.b.b)localObject7).b(str2, (String)localObject8, (String)localObject9, arrayOfObject);
              localObject1 = this.B;
              i9 = ((org.eclipse.paho.client.mqttv3.a.b.n)localObject6).j();
              localObject5 = Integer.valueOf(i9);
              ((Hashtable)localObject1).put(localObject5, localObject6);
            }
          }
          for (;;)
          {
            localObject1 = this.i.a((o)localObject4).a;
            localObject5 = this.j.j();
            ((q)localObject1).a((org.eclipse.paho.client.mqttv3.b)localObject5);
            localObject1 = this.f;
            i9 = ((o)localObject4).j();
            localObject5 = Integer.valueOf(i9);
            int i7 = ((o)localObject4).j();
            localObject4 = Integer.valueOf(i7);
            ((Hashtable)localObject1).put(localObject5, localObject4);
            i3 = i8;
            break;
            localObject6 = d;
            localObject7 = a;
            str2 = "restoreState";
            localObject8 = "606";
            localObject9 = new Object[i1];
            localObject9[0] = localObject1;
            localObject9[bool1] = localObject5;
            ((org.eclipse.paho.client.mqttv3.b.b)localObject6).b((String)localObject7, str2, (String)localObject8, (Object[])localObject9);
            continue;
            ((o)localObject4).a(bool1);
            localObject6 = ((o)localObject4).h();
            i5 = ((org.eclipse.paho.client.mqttv3.k)localObject6).c();
            if (i5 == i1)
            {
              localObject6 = d;
              localObject7 = a;
              str2 = "restoreState";
              localObject8 = "607";
              localObject9 = new Object[i1];
              localObject9[0] = localObject1;
              localObject9[bool1] = localObject5;
              ((org.eclipse.paho.client.mqttv3.b.b)localObject6).b((String)localObject7, str2, (String)localObject8, (Object[])localObject9);
              localObject1 = this.B;
              i9 = ((o)localObject4).j();
              localObject5 = Integer.valueOf(i9);
              ((Hashtable)localObject1).put(localObject5, localObject4);
            }
            else
            {
              localObject6 = d;
              localObject7 = a;
              str2 = "restoreState";
              localObject8 = "608";
              localObject9 = new Object[i1];
              localObject9[0] = localObject1;
              localObject9[bool1] = localObject5;
              ((org.eclipse.paho.client.mqttv3.b.b)localObject6).b((String)localObject7, str2, (String)localObject8, (Object[])localObject9);
              localObject1 = this.C;
              i9 = ((o)localObject4).j();
              localObject5 = Integer.valueOf(i9);
              ((Hashtable)localObject1).put(localObject5, localObject4);
            }
          }
        }
        localObject4 = "sc-";
        boolean bool5 = ((String)localObject1).startsWith((String)localObject4);
        if (bool5)
        {
          localObject5 = (org.eclipse.paho.client.mqttv3.a.b.n)localObject5;
          localObject4 = this.n;
          localObject5 = c((u)localObject5);
          bool5 = ((org.eclipse.paho.client.mqttv3.h)localObject4).c((String)localObject5);
          if (!bool5) {
            ((Vector)localObject3).addElement(localObject1);
          }
        }
        i3 = i5;
      }
    }
    localObject4 = ((Vector)localObject3).elements();
    for (;;)
    {
      i3 = ((Enumeration)localObject4).hasMoreElements();
      if (i3 == 0) {
        break;
      }
      localObject1 = (String)((Enumeration)localObject4).nextElement();
      localObject5 = d;
      str1 = a;
      localObject2 = "restoreState";
      localObject3 = "609";
      localObject7 = new Object[bool1];
      localObject7[0] = localObject1;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject5).b(str1, (String)localObject2, (String)localObject3, (Object[])localObject7);
      localObject5 = this.n;
      ((org.eclipse.paho.client.mqttv3.h)localObject5).b((String)localObject1);
    }
    this.e = i5;
  }
  
  public org.eclipse.paho.client.mqttv3.n d()
  {
    Object localObject1 = null;
    int i1 = 1;
    Object localObject2 = "checkForActivity";
    boolean bool1 = b;
    if (bool1) {}
    long l1 = a();
    boolean bool3 = b;
    if (bool3) {}
    bool3 = this.A;
    long l2;
    if (bool3)
    {
      l2 = this.l;
      long l3 = 0L;
      bool3 = l2 < l3;
      if (bool3)
      {
        l2 = System.currentTimeMillis();
        int i4 = 100;
      }
    }
    for (;;)
    {
      synchronized (this.y)
      {
        boolean bool5 = this.z;
        if (!bool5)
        {
          l1 = this.v;
          l4 = this.u;
          bool1 = l1 < l4;
          if (bool1)
          {
            l1 = this.u;
            l4 = l2 - l1;
            l5 = this.l;
            bool4 = l4 < l5;
            if (!bool4)
            {
              localObject2 = d;
              localObject5 = a;
              localObject1 = "checkForActivity";
              localObject6 = "620";
              int i5 = 3;
              localObject7 = new Object[i5];
              i7 = 0;
              localObject8 = null;
              localObject9 = new java/lang/Long;
              l6 = this.l;
              ((Long)localObject9).<init>(l6);
              localObject7[0] = localObject9;
              i7 = 1;
              localObject9 = new java/lang/Long;
              l6 = this.u;
              ((Long)localObject9).<init>(l6);
              localObject7[i7] = localObject9;
              i7 = 2;
              localObject9 = new java/lang/Long;
              l6 = this.v;
              ((Long)localObject9).<init>(l6);
              localObject7[i7] = localObject9;
              ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b((String)localObject5, (String)localObject1, (String)localObject6, (Object[])localObject7);
              bool1 = true;
              this.z = bool1;
              this.w = l2;
              localObject1 = new org/eclipse/paho/client/mqttv3/n;
              localObject2 = this.j;
              localObject2 = ((a)localObject2).j();
              localObject2 = ((org.eclipse.paho.client.mqttv3.b)localObject2).a();
              ((org.eclipse.paho.client.mqttv3.n)localObject1).<init>((String)localObject2);
              localObject2 = this.i;
              localObject5 = this.x;
              ((h)localObject2).a((org.eclipse.paho.client.mqttv3.n)localObject1, (u)localObject5);
              localObject2 = this.h;
              localObject5 = this.x;
              bool3 = false;
              Object localObject10 = null;
              ((Vector)localObject2).insertElementAt(localObject5, 0);
              l1 = a();
              h();
              localObject10 = d;
              localObject11 = a;
              localObject6 = "checkForActivity";
              ??? = "624";
              localObject7 = new Object[i1];
              localObject8 = new java/lang/Long;
              ((Long)localObject8).<init>(l1);
              localObject7[0] = localObject8;
              ((org.eclipse.paho.client.mqttv3.b.b)localObject10).b((String)localObject11, (String)localObject6, (String)???, (Object[])localObject7);
              localObject10 = this.E;
              ((org.eclipse.paho.client.mqttv3.m)localObject10).a(l1);
              bool1 = b;
              if (bool1) {}
              return (org.eclipse.paho.client.mqttv3.n)localObject1;
            }
          }
          else
          {
            l1 = this.v;
            continue;
          }
          localObject6 = d;
          localObject7 = a;
          localObject8 = "checkForActivity";
          localObject9 = "634";
          ((org.eclipse.paho.client.mqttv3.b.b)localObject6).b((String)localObject7, (String)localObject8, (String)localObject9, null);
          l4 = a();
          l1 = l2 - l1;
          l1 = l4 - l1;
          continue;
        }
        Object localObject7 = this.j;
        localObject7 = ((a)localObject7).a();
        boolean bool6 = ((f)localObject7).b();
        if (bool6) {
          continue;
        }
        long l4 = this.w;
        l4 = l2 - l4;
        long l5 = this.l;
        long l7 = bool4;
        l5 += l7;
        bool6 = l4 < l5;
        if (bool6) {
          continue;
        }
        l4 = this.v;
        l4 = l2 - l4;
        l5 = this.l;
        l7 = bool4;
        l5 += l7;
        bool6 = l4 < l5;
        if (bool6) {
          continue;
        }
        l4 = this.u;
        l4 = l2 - l4;
        l5 = this.l;
        l7 = bool4;
        l5 += l7;
        boolean bool4 = l4 < l5;
        if (bool4) {
          continue;
        }
        localObject2 = d;
        Object localObject5 = a;
        localObject1 = "checkForActivity";
        Object localObject6 = "619";
        int i6 = 5;
        localObject7 = new Object[i6];
        int i7 = 0;
        Object localObject8 = null;
        Object localObject9 = new java/lang/Long;
        long l6 = this.l;
        ((Long)localObject9).<init>(l6);
        localObject7[0] = localObject9;
        i7 = 1;
        localObject9 = new java/lang/Long;
        l6 = this.u;
        ((Long)localObject9).<init>(l6);
        localObject7[i7] = localObject9;
        i7 = 2;
        localObject9 = new java/lang/Long;
        l6 = this.v;
        ((Long)localObject9).<init>(l6);
        localObject7[i7] = localObject9;
        i7 = 3;
        localObject9 = new java/lang/Long;
        ((Long)localObject9).<init>(l2);
        localObject7[i7] = localObject9;
        int i3 = 4;
        Object localObject11 = new java/lang/Long;
        long l8 = this.w;
        ((Long)localObject11).<init>(l8);
        localObject7[i3] = localObject11;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject2).a((String)localObject5, (String)localObject1, (String)localObject6, (Object[])localObject7);
        bool1 = c;
        if (bool1) {}
        int i2 = 32000;
        localObject2 = j.a(i2);
        throw ((Throwable)localObject2);
      }
      boolean bool2 = b;
      if (!bool2) {}
    }
  }
  
  protected u e()
  {
    Object localObject1 = "get";
    Object localObject4 = this.r;
    boolean bool1 = false;
    Object localObject5 = null;
    if (localObject5 == null)
    {
      int i4;
      String str1;
      String str2;
      String str3;
      label159:
      boolean bool3;
      try
      {
        localObject1 = this.g;
        boolean bool2 = ((Vector)localObject1).isEmpty();
        if (bool2)
        {
          localObject1 = this.h;
          bool2 = ((Vector)localObject1).isEmpty();
          if (bool2) {}
        }
        else
        {
          localObject1 = this.h;
          bool2 = ((Vector)localObject1).isEmpty();
          if (!bool2) {
            break label159;
          }
          int i2 = this.p;
          i4 = this.o;
          if (i2 < i4) {
            break label159;
          }
        }
      }
      finally {}
    }
    try
    {
      localObject1 = d;
      str1 = a;
      str2 = "get";
      str3 = "644";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, str2, str3);
      localObject1 = this.r;
      localObject1.wait();
      localObject1 = d;
      str1 = a;
      str2 = "get";
      str3 = "647";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, str2, str3);
    }
    catch (InterruptedException localInterruptedException)
    {
      Object localObject3;
      break label159;
    }
    bool3 = this.A;
    if (!bool3)
    {
      localObject1 = this.h;
      bool3 = ((Vector)localObject1).isEmpty();
      if (!bool3)
      {
        localObject1 = this.h;
        i4 = 0;
        str1 = null;
        localObject1 = ((Vector)localObject1).elementAt(0);
        localObject1 = (u)localObject1;
        bool3 = localObject1 instanceof org.eclipse.paho.client.mqttv3.a.b.d;
        if (bool3) {}
      }
      else
      {
        localObject1 = d;
        localObject5 = a;
        str1 = "get";
        str2 = "621";
        ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject5, str1, str2);
        bool3 = false;
      }
    }
    for (localObject1 = null;; localObject3 = localObject5)
    {
      return (u)localObject1;
      localObject1 = this.h;
      bool3 = ((Vector)localObject1).isEmpty();
      int i1;
      int i5;
      Object[] arrayOfObject;
      int i6;
      Integer localInteger;
      if (!bool3)
      {
        localObject1 = this.h;
        bool1 = false;
        localObject5 = null;
        localObject1 = ((Vector)localObject1).remove(0);
        localObject1 = (u)localObject1;
        bool1 = localObject1 instanceof org.eclipse.paho.client.mqttv3.a.b.n;
        if (bool1)
        {
          i1 = this.q + 1;
          this.q = i1;
          localObject5 = d;
          str1 = a;
          str2 = "get";
          str3 = "617";
          i5 = 1;
          arrayOfObject = new Object[i5];
          i6 = this.q;
          localInteger = Integer.valueOf(i6);
          arrayOfObject[0] = localInteger;
          ((org.eclipse.paho.client.mqttv3.b.b)localObject5).b(str1, str2, str3, arrayOfObject);
        }
        f();
        localObject5 = localObject1;
        break;
      }
      localObject1 = this.g;
      bool3 = ((Vector)localObject1).isEmpty();
      if (bool3) {
        break;
      }
      int i3 = this.p;
      i4 = this.o;
      if (i3 < i4)
      {
        localObject1 = this.g;
        i1 = 0;
        localObject5 = null;
        localObject1 = ((Vector)localObject1).elementAt(0);
        localObject1 = (u)localObject1;
        localObject5 = this.g;
        i4 = 0;
        str1 = null;
        ((Vector)localObject5).removeElementAt(0);
        i1 = this.p + 1;
        this.p = i1;
        localObject5 = d;
        str1 = a;
        str2 = "get";
        str3 = "623";
        i5 = 1;
        arrayOfObject = new Object[i5];
        i6 = this.p;
        localInteger = Integer.valueOf(i6);
        arrayOfObject[0] = localInteger;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject5).b(str1, str2, str3, arrayOfObject);
        localObject5 = localObject1;
        break;
      }
      localObject1 = d;
      str1 = a;
      str2 = "get";
      str3 = "622";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, str2, str3);
      break;
    }
  }
  
  protected boolean f()
  {
    boolean bool1 = true;
    int i1 = 0;
    ??? = null;
    Object localObject2 = this.i;
    int i2 = ((h)localObject2).e();
    boolean bool2 = this.t;
    if ((bool2) && (i2 == 0))
    {
      Object localObject3 = this.h;
      int i3 = ((Vector)localObject3).size();
      if (i3 == 0)
      {
        localObject3 = this.k;
        boolean bool3 = ((e)localObject3).c();
        if (bool3)
        {
          localObject3 = d;
          String str1 = a;
          String str2 = "checkQuiesceLock";
          String str3 = "626";
          int i4 = 6;
          Object[] arrayOfObject = new Object[i4];
          Object localObject4 = new java/lang/Boolean;
          boolean bool4 = this.t;
          ((Boolean)localObject4).<init>(bool4);
          arrayOfObject[0] = localObject4;
          ??? = Integer.valueOf(this.p);
          arrayOfObject[bool1] = ???;
          localObject4 = Integer.valueOf(this.h.size());
          arrayOfObject[2] = localObject4;
          int i5 = this.q;
          localObject4 = Integer.valueOf(i5);
          arrayOfObject[3] = localObject4;
          localObject4 = new java/lang/Boolean;
          e locale = this.k;
          bool4 = locale.c();
          ((Boolean)localObject4).<init>(bool4);
          arrayOfObject[4] = localObject4;
          i1 = 5;
          localObject2 = Integer.valueOf(i2);
          arrayOfObject[i1] = localObject2;
          ((org.eclipse.paho.client.mqttv3.b.b)localObject3).b(str1, str2, str3, arrayOfObject);
        }
      }
    }
    for (;;)
    {
      synchronized (this.s)
      {
        localObject2 = this.s;
        localObject2.notifyAll();
        return bool1;
      }
      bool1 = false;
      Object localObject6 = null;
    }
  }
  
  public void g()
  {
    org.eclipse.paho.client.mqttv3.b.b localb = d;
    String str = a;
    localb.a(str, "connected", "631");
    this.A = true;
    this.E.a();
  }
  
  public void h()
  {
    Object localObject1 = "notifyQueueLock";
    synchronized (this.r)
    {
      localObject1 = d;
      String str1 = a;
      String str2 = "notifyQueueLock";
      String str3 = "638";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a(str1, str2, str3);
      localObject1 = this.r;
      localObject1.notifyAll();
      return;
    }
  }
  
  protected void i()
  {
    this.f.clear();
    this.g.clear();
    this.h.clear();
    this.B.clear();
    this.C.clear();
    this.D.clear();
    this.i.d();
    this.f = null;
    this.g = null;
    this.h = null;
    this.B = null;
    this.C = null;
    this.D = null;
    this.i = null;
    this.k = null;
    this.j = null;
    this.n = null;
    this.x = null;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */