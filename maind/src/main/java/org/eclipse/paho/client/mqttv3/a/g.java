package org.eclipse.paho.client.mqttv3.a;

import java.io.IOException;
import java.io.OutputStream;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.a.b.e;
import org.eclipse.paho.client.mqttv3.a.b.u;
import org.eclipse.paho.client.mqttv3.b.c;

public class g
  implements Runnable
{
  private static final String a = g.class.getName();
  private static final org.eclipse.paho.client.mqttv3.b.b b;
  private boolean c = false;
  private Object d;
  private d e;
  private org.eclipse.paho.client.mqttv3.a.b.g f;
  private a g;
  private h h;
  private Thread i;
  
  static
  {
    String str = a;
    b = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public g(a parama, d paramd, h paramh, OutputStream paramOutputStream)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.d = localObject;
    this.e = null;
    this.g = null;
    this.h = null;
    this.i = null;
    localObject = new org/eclipse/paho/client/mqttv3/a/b/g;
    ((org.eclipse.paho.client.mqttv3.a.b.g)localObject).<init>(paramOutputStream);
    this.f = ((org.eclipse.paho.client.mqttv3.a.b.g)localObject);
    this.g = parama;
    this.e = paramd;
    this.h = paramh;
    localObject = b;
    String str = parama.j().a();
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).a(str);
  }
  
  private void a(u paramu, Exception paramException)
  {
    Object localObject = b;
    String str1 = a;
    String str2 = "handleRunException";
    String str3 = "804";
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).a(str1, str2, str3, null, paramException);
    boolean bool = paramException instanceof MqttException;
    if (!bool)
    {
      localObject = new org/eclipse/paho/client/mqttv3/MqttException;
      int j = 32109;
      ((MqttException)localObject).<init>(j, paramException);
    }
    for (paramException = (Exception)localObject;; paramException = (MqttException)paramException)
    {
      this.c = false;
      this.g.a(null, paramException);
      return;
    }
  }
  
  public void a()
  {
    Object localObject1 = "stop";
    synchronized (this.d)
    {
      localObject1 = b;
      Object localObject4 = a;
      String str1 = "stop";
      String str2 = "800";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject4, str1, str2);
      boolean bool = this.c;
      if (bool)
      {
        bool = false;
        localObject1 = null;
        this.c = false;
        localObject1 = Thread.currentThread();
        localObject4 = this.i;
        bool = localObject1.equals(localObject4);
        if (bool) {}
      }
      try
      {
        localObject1 = this.e;
        ((d)localObject1).h();
        localObject1 = this.i;
        ((Thread)localObject1).join();
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
      bool = false;
      localObject1 = null;
      this.i = null;
      localObject1 = b;
      localObject4 = a;
      str1 = "stop";
      str2 = "801";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject4, str1, str2);
      return;
    }
  }
  
  public void a(String paramString)
  {
    synchronized (this.d)
    {
      boolean bool = this.c;
      if (!bool)
      {
        bool = true;
        this.c = bool;
        Thread localThread = new java/lang/Thread;
        localThread.<init>(this, paramString);
        this.i = localThread;
        localThread = this.i;
        localThread.start();
      }
      return;
    }
  }
  
  public void run()
  {
    Object localObject1 = null;
    for (;;)
    {
      boolean bool1 = this.c;
      if (!bool1) {
        break;
      }
      Object localObject2 = this.f;
      if (localObject2 == null) {
        break;
      }
      try
      {
        localObject2 = this.e;
        localObject1 = ((d)localObject2).e();
        if (localObject1 == null) {
          break label237;
        }
        localObject2 = b;
        localObject6 = a;
        str1 = "run";
        str2 = "802";
        int j = 2;
        Object[] arrayOfObject = new Object[j];
        int k = 0;
        String str3 = ((u)localObject1).e();
        arrayOfObject[0] = str3;
        k = 1;
        arrayOfObject[k] = localObject1;
        ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b((String)localObject6, str1, str2, arrayOfObject);
        bool1 = localObject1 instanceof org.eclipse.paho.client.mqttv3.a.b.b;
        if (bool1)
        {
          localObject2 = this.f;
          ((org.eclipse.paho.client.mqttv3.a.b.g)localObject2).a((u)localObject1);
          localObject2 = this.f;
          ((org.eclipse.paho.client.mqttv3.a.b.g)localObject2).flush();
        }
      }
      catch (MqttException localMqttException)
      {
        a((u)localObject1, localMqttException);
        continue;
        Object localObject3 = this.h;
        localObject6 = ((h)localObject3).a((u)localObject1);
        if (localObject6 == null) {
          continue;
        }
        try
        {
          localObject3 = this.f;
          ((org.eclipse.paho.client.mqttv3.a.b.g)localObject3).a((u)localObject1);
        }
        finally {}
        try
        {
          localObject3 = this.f;
          ((org.eclipse.paho.client.mqttv3.a.b.g)localObject3).flush();
        }
        catch (IOException localIOException)
        {
          boolean bool2 = localObject1 instanceof e;
          if (bool2) {
            break label185;
          }
          throw localIOException;
        }
        localObject3 = this.e;
        ((d)localObject3).a((u)localObject1);
      }
      catch (Exception localException)
      {
        label185:
        a((u)localObject1, localException);
      }
      continue;
      label237:
      localObject5 = b;
      Object localObject6 = a;
      String str1 = "run";
      String str2 = "803";
      ((org.eclipse.paho.client.mqttv3.b.b)localObject5).a((String)localObject6, str1, str2);
      bool1 = false;
      localObject5 = null;
      this.c = false;
    }
    localObject1 = b;
    Object localObject5 = a;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject1).a((String)localObject5, "run", "805");
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/a/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */