package org.eclipse.paho.client.mqttv3.a;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.d;
import org.eclipse.paho.client.mqttv3.e;
import org.eclipse.paho.client.mqttv3.h;
import org.eclipse.paho.client.mqttv3.n;

public class i
  implements org.eclipse.paho.client.mqttv3.a
{
  private h a;
  private e b;
  private a c;
  private org.eclipse.paho.client.mqttv3.i d;
  private n e;
  private Object f;
  private org.eclipse.paho.client.mqttv3.a g;
  private int h;
  
  public i(e parame, h paramh, a parama, org.eclipse.paho.client.mqttv3.i parami, n paramn, Object paramObject, org.eclipse.paho.client.mqttv3.a parama1)
  {
    this.a = paramh;
    this.b = parame;
    this.c = parama;
    this.d = parami;
    this.e = paramn;
    this.f = paramObject;
    this.g = parama1;
    int i = parami.d();
    this.h = i;
  }
  
  public void a()
  {
    n localn = new org/eclipse/paho/client/mqttv3/n;
    Object localObject1 = this.b.a();
    localn.<init>((String)localObject1);
    localn.a(this);
    localn.a(this);
    localObject1 = this.a;
    Object localObject2 = this.b.a();
    String str = this.b.d();
    ((h)localObject1).a((String)localObject2, str);
    localObject1 = this.d;
    boolean bool = ((org.eclipse.paho.client.mqttv3.i)localObject1).j();
    if (bool)
    {
      localObject1 = this.a;
      ((h)localObject1).c();
    }
    localObject1 = this.d;
    int i = ((org.eclipse.paho.client.mqttv3.i)localObject1).d();
    if (i == 0)
    {
      localObject1 = this.d;
      int j = 4;
      ((org.eclipse.paho.client.mqttv3.i)localObject1).a(j);
    }
    try
    {
      localObject1 = this.c;
      localObject2 = this.d;
      ((a)localObject1).a((org.eclipse.paho.client.mqttv3.i)localObject2, localn);
      return;
    }
    catch (MqttException localMqttException)
    {
      for (;;)
      {
        a(localn, localMqttException);
      }
    }
  }
  
  public void a(d paramd)
  {
    int i = this.h;
    if (i == 0)
    {
      localObject1 = this.d;
      localObject2 = null;
      ((org.eclipse.paho.client.mqttv3.i)localObject1).a(0);
    }
    Object localObject1 = this.e.a;
    Object localObject2 = paramd.c();
    ((q)localObject1).a((u)localObject2, null);
    this.e.a.f();
    localObject1 = this.g;
    if (localObject1 != null)
    {
      localObject1 = this.e;
      localObject2 = this.f;
      ((n)localObject1).a(localObject2);
      localObject1 = this.g;
      localObject2 = this.e;
      ((org.eclipse.paho.client.mqttv3.a)localObject1).a((d)localObject2);
    }
  }
  
  public void a(d paramd, Throwable paramThrowable)
  {
    int i = 4;
    Object localObject1 = this.c.i();
    int j = localObject1.length;
    Object localObject3 = this.c;
    int k = ((a)localObject3).h();
    int m = k + 1;
    if (m >= j)
    {
      j = this.h;
      if (j == 0)
      {
        localObject1 = this.d;
        j = ((org.eclipse.paho.client.mqttv3.i)localObject1).d();
        if (j != i) {}
      }
    }
    else
    {
      j = this.h;
      if (j == 0)
      {
        localObject1 = this.d;
        j = ((org.eclipse.paho.client.mqttv3.i)localObject1).d();
        if (j == i)
        {
          localObject1 = this.d;
          k = 3;
          ((org.eclipse.paho.client.mqttv3.i)localObject1).a(k);
        }
      }
      try
      {
        for (;;)
        {
          a();
          return;
          this.d.a(i);
          localObject1 = this.c;
          k += 1;
          ((a)localObject1).a(k);
          continue;
          localObject1 = this.c;
          k += 1;
          ((a)localObject1).a(k);
        }
      }
      catch (MqttPersistenceException localMqttPersistenceException)
      {
        for (;;)
        {
          a(paramd, localMqttPersistenceException);
        }
      }
    }
    j = this.h;
    Object localObject2;
    if (j == 0)
    {
      localObject2 = this.d;
      k = 0;
      localObject3 = null;
      ((org.eclipse.paho.client.mqttv3.i)localObject2).a(0);
    }
    boolean bool = paramThrowable instanceof MqttException;
    if (bool)
    {
      localObject2 = paramThrowable;
      localObject2 = (MqttException)paramThrowable;
    }
    for (;;)
    {
      localObject3 = this.e.a;
      m = 0;
      ((q)localObject3).a(null, (MqttException)localObject2);
      this.e.a.f();
      localObject2 = this.g;
      if (localObject2 == null) {
        break;
      }
      localObject2 = this.e;
      localObject3 = this.f;
      ((n)localObject2).a(localObject3);
      localObject2 = this.g;
      localObject3 = this.e;
      ((org.eclipse.paho.client.mqttv3.a)localObject2).a((d)localObject3, (Throwable)paramThrowable);
      break;
      localObject2 = new org/eclipse/paho/client/mqttv3/MqttException;
      ((MqttException)localObject2).<init>(paramThrowable);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */