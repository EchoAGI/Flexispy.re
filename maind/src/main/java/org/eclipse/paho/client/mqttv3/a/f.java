package org.eclipse.paho.client.mqttv3.a;

import java.io.IOException;
import java.io.InputStream;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.b.c;
import org.eclipse.paho.client.mqttv3.n;

public class f
  implements Runnable
{
  private static final String a = f.class.getName();
  private static final org.eclipse.paho.client.mqttv3.b.b b;
  private boolean c = false;
  private Object d;
  private d e;
  private a f;
  private org.eclipse.paho.client.mqttv3.a.b.f g;
  private h h;
  private Thread i;
  private volatile boolean j;
  
  static
  {
    String str = a;
    b = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public f(a parama, d paramd, h paramh, InputStream paramInputStream)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.d = localObject;
    this.e = null;
    this.f = null;
    this.h = null;
    this.i = null;
    localObject = new org/eclipse/paho/client/mqttv3/a/b/f;
    ((org.eclipse.paho.client.mqttv3.a.b.f)localObject).<init>(paramInputStream);
    this.g = ((org.eclipse.paho.client.mqttv3.a.b.f)localObject);
    this.f = parama;
    this.e = paramd;
    this.h = paramh;
    localObject = b;
    String str = parama.j().a();
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).a(str);
  }
  
  public void a()
  {
    Object localObject1 = "stop";
    synchronized (this.d)
    {
      localObject1 = b;
      Object localObject4 = a;
      String str1 = "stop";
      String str2 = "850";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject4, str1, str2);
      boolean bool = this.c;
      if (bool)
      {
        bool = false;
        localObject1 = null;
        this.c = false;
        bool = false;
        localObject1 = null;
        this.j = false;
        localObject1 = Thread.currentThread();
        localObject4 = this.i;
        bool = localObject1.equals(localObject4);
        if (bool) {}
      }
      try
      {
        localObject1 = this.i;
        ((Thread)localObject1).join();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
      this.i = null;
      localObject1 = b;
      ??? = a;
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)???, "stop", "851");
      return;
    }
  }
  
  public void a(String paramString)
  {
    Object localObject1 = b;
    ??? = a;
    String str1 = "start";
    String str2 = "855";
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)???, str1, str2);
    synchronized (this.d)
    {
      boolean bool = this.c;
      if (!bool)
      {
        bool = true;
        this.c = bool;
        localObject1 = new java/lang/Thread;
        ((Thread)localObject1).<init>(this, paramString);
        this.i = ((Thread)localObject1);
        localObject1 = this.i;
        ((Thread)localObject1).start();
      }
      return;
    }
  }
  
  public boolean b()
  {
    return this.j;
  }
  
  public void run()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    Object localObject5 = null;
    bool1 = this.c;
    if (bool1)
    {
      localObject1 = this.g;
      if (localObject1 != null) {
        for (;;)
        {
          try
          {
            localObject1 = b;
            localObject6 = a;
            localObject7 = "run";
            str1 = "852";
            ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject6, (String)localObject7, str1);
            localObject1 = this.g;
            k = ((org.eclipse.paho.client.mqttv3.a.b.f)localObject1).available();
            if (k > 0)
            {
              k = 1;
              this.j = k;
              localObject1 = this.g;
              localObject1 = ((org.eclipse.paho.client.mqttv3.a.b.f)localObject1).a();
              boolean bool2 = false;
              localObject6 = null;
              this.j = false;
              bool2 = localObject1 instanceof org.eclipse.paho.client.mqttv3.a.b.b;
              if (!bool2) {
                break label372;
              }
              localObject6 = this.h;
              localObject5 = ((h)localObject6).a((u)localObject1);
              if (localObject5 == null) {
                continue;
              }
            }
          }
          catch (MqttException localMqttException)
          {
            Object localObject8 = localObject5;
            localObject3 = b;
            localObject5 = a;
            localObject6 = "run";
            localObject7 = "856";
            n = 0;
            str1 = null;
            ((org.eclipse.paho.client.mqttv3.b.b)localObject3).a((String)localObject5, (String)localObject6, (String)localObject7, null, localMqttException);
            int k = 0;
            localObject3 = null;
            this.c = false;
            localObject3 = this.f;
            ((a)localObject3).a((n)localObject8, localMqttException);
            this.j = false;
            localObject3 = localObject8;
            continue;
            localObject3 = new org/eclipse/paho/client/mqttv3/MqttException;
            m = 6;
            ((MqttException)localObject3).<init>(m);
            throw ((Throwable)localObject3);
          }
          catch (IOException localIOException)
          {
            Object localObject3 = localObject5;
            localObject5 = localIOException;
            localObject6 = b;
            Object localObject7 = a;
            String str1 = "run";
            String str2 = "853";
            ((org.eclipse.paho.client.mqttv3.b.b)localObject6).a((String)localObject7, str1, str2);
            int m = 0;
            localObject6 = null;
            this.c = false;
            localObject6 = this.f;
            boolean bool3 = ((a)localObject6).f();
            if (bool3) {
              continue;
            }
            localObject6 = this.f;
            localObject7 = new org/eclipse/paho/client/mqttv3/MqttException;
            int n = 32109;
            ((MqttException)localObject7).<init>(n, localIOException);
            ((a)localObject6).a((n)localObject3, (MqttException)localObject7);
            continue;
          }
          finally
          {
            this.j = false;
          }
          try
          {
            localObject6 = this.e;
            localObject1 = (org.eclipse.paho.client.mqttv3.a.b.b)localObject1;
            ((d)localObject6).a((org.eclipse.paho.client.mqttv3.a.b.b)localObject1);
            localObject1 = localObject5;
            this.j = false;
            localObject5 = localObject1;
            break;
          }
          finally {}
          k = 0;
          localObject1 = null;
          continue;
          label372:
          Object localObject6 = this.e;
          ((d)localObject6).b(localu);
          localObject4 = localObject5;
        }
      }
    }
    Object localObject4 = b;
    localObject5 = a;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject4).a((String)localObject5, "run", "854");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */