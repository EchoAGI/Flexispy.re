package org.eclipse.paho.client.mqttv3.a;

import java.io.InputStream;
import java.io.OutputStream;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.n;

class b
  implements Runnable
{
  a a = null;
  Thread b = null;
  n c;
  org.eclipse.paho.client.mqttv3.a.b.d d;
  
  b(a parama1, a parama2, n paramn, org.eclipse.paho.client.mqttv3.a.b.d paramd)
  {
    this.a = parama2;
    this.c = paramn;
    this.d = paramd;
    Thread localThread = new java/lang/Thread;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("MQTT Con: ");
    String str = parama1.j().a();
    localObject = str;
    localThread.<init>(this, (String)localObject);
    this.b = localThread;
  }
  
  void a()
  {
    this.b.start();
  }
  
  public void run()
  {
    localObject1 = null;
    localObject2 = a.n();
    localObject3 = a.m();
    localObject4 = "connectBG:run";
    localObject5 = "220";
    ((org.eclipse.paho.client.mqttv3.b.b)localObject2).a((String)localObject3, (String)localObject4, (String)localObject5);
    try
    {
      localObject2 = this.e;
      localObject2 = a.a((a)localObject2);
      localObject3 = ((h)localObject2).b();
      int i = 0;
      localObject2 = null;
      for (;;)
      {
        int j = localObject3.length;
        if (i >= j) {
          break;
        }
        localObject4 = localObject3[i];
        localObject4 = ((org.eclipse.paho.client.mqttv3.j)localObject4).a;
        localObject5 = null;
        ((q)localObject4).a(null);
        i += 1;
      }
      localObject2 = this.e;
      localObject2 = a.a((a)localObject2);
      localObject3 = this.c;
      localObject4 = this.d;
      ((h)localObject2).a((n)localObject3, (u)localObject4);
      localObject2 = this.e;
      localObject2 = a.b((a)localObject2);
      localObject3 = this.e;
      int k = a.c((a)localObject3);
      localObject2 = localObject2[k];
      ((m)localObject2).a();
      localObject3 = this.e;
      localObject4 = new org/eclipse/paho/client/mqttv3/a/f;
      localObject5 = this.a;
      Object localObject6 = this.e;
      localObject6 = a.d((a)localObject6);
      Object localObject7 = this.e;
      localObject7 = a.a((a)localObject7);
      InputStream localInputStream = ((m)localObject2).b();
      ((f)localObject4).<init>((a)localObject5, (d)localObject6, (h)localObject7, localInputStream);
      a.a((a)localObject3, (f)localObject4);
      localObject3 = this.e;
      localObject3 = a.e((a)localObject3);
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject5 = "MQTT Rec: ";
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject5 = this.e;
      localObject5 = ((a)localObject5).j();
      localObject5 = ((org.eclipse.paho.client.mqttv3.b)localObject5).a();
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
      localObject4 = ((StringBuilder)localObject4).toString();
      ((f)localObject3).a((String)localObject4);
      localObject3 = this.e;
      localObject4 = new org/eclipse/paho/client/mqttv3/a/g;
      localObject5 = this.a;
      localObject6 = this.e;
      localObject6 = a.d((a)localObject6);
      localObject7 = this.e;
      localObject7 = a.a((a)localObject7);
      localObject2 = ((m)localObject2).c();
      ((g)localObject4).<init>((a)localObject5, (d)localObject6, (h)localObject7, (OutputStream)localObject2);
      a.a((a)localObject3, (g)localObject4);
      localObject2 = this.e;
      localObject2 = a.f((a)localObject2);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "MQTT Snd: ";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = this.e;
      localObject4 = ((a)localObject4).j();
      localObject4 = ((org.eclipse.paho.client.mqttv3.b)localObject4).a();
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((g)localObject2).a((String)localObject3);
      localObject2 = this.e;
      localObject2 = a.g((a)localObject2);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject4 = "MQTT Call: ";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject4 = this.e;
      localObject4 = ((a)localObject4).j();
      localObject4 = ((org.eclipse.paho.client.mqttv3.b)localObject4).a();
      localObject3 = ((StringBuilder)localObject3).append((String)localObject4);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((e)localObject2).a((String)localObject3);
      localObject2 = this.e;
      localObject3 = this.d;
      localObject4 = this.c;
      ((a)localObject2).a((u)localObject3, (n)localObject4);
    }
    catch (MqttException localMqttException)
    {
      for (;;)
      {
        localObject2 = a.n();
        localObject3 = a.m();
        localObject4 = "connectBG:run";
        localObject5 = "212";
        ((org.eclipse.paho.client.mqttv3.b.b)localObject2).a((String)localObject3, (String)localObject4, (String)localObject5, null, localMqttException);
        localObject1 = localMqttException;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localObject2 = a.n();
        localObject3 = a.m();
        localObject4 = "connectBG:run";
        localObject5 = "209";
        ((org.eclipse.paho.client.mqttv3.b.b)localObject2).a((String)localObject3, (String)localObject4, (String)localObject5, null, localException);
        localObject1 = j.a(localException);
      }
    }
    if (localObject1 != null)
    {
      localObject2 = this.e;
      localObject3 = this.c;
      ((a)localObject2).a((n)localObject3, (MqttException)localObject1);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */