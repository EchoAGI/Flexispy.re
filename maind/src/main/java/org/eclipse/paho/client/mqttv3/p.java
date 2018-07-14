package org.eclipse.paho.client.mqttv3;

import java.util.Timer;
import java.util.TimerTask;
import org.eclipse.paho.client.mqttv3.a.a;
import org.eclipse.paho.client.mqttv3.b.c;

public class p
  implements m
{
  private static final String a = p.class.getName();
  private static final org.eclipse.paho.client.mqttv3.b.b b;
  private a c;
  private Timer d;
  
  static
  {
    String str = a;
    b = c.a("org.eclipse.paho.client.mqttv3.internal.nls.logcat", str);
  }
  
  public void a()
  {
    Object localObject1 = this.c.j().a();
    Object localObject2 = b;
    Object localObject3 = a;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = localObject1;
    ((org.eclipse.paho.client.mqttv3.b.b)localObject2).b((String)localObject3, "start", "659", arrayOfObject);
    localObject2 = new java/util/Timer;
    localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject1 = "MQTT Ping: " + (String)localObject1;
    ((Timer)localObject2).<init>((String)localObject1);
    this.d = ((Timer)localObject2);
    localObject1 = this.d;
    localObject2 = new org/eclipse/paho/client/mqttv3/r;
    ((r)localObject2).<init>(this, null);
    long l = this.c.k();
    ((Timer)localObject1).schedule((TimerTask)localObject2, l);
  }
  
  public void a(long paramLong)
  {
    Timer localTimer = this.d;
    r localr = new org/eclipse/paho/client/mqttv3/r;
    localr.<init>(this, null);
    localTimer.schedule(localr, paramLong);
  }
  
  public void a(a parama)
  {
    if (parama == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("ClientComms cannot be null.");
      throw localIllegalArgumentException;
    }
    this.c = parama;
  }
  
  public void b()
  {
    Object localObject = b;
    String str1 = a;
    String str2 = "stop";
    String str3 = "661";
    ((org.eclipse.paho.client.mqttv3.b.b)localObject).b(str1, str2, str3, null);
    localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      ((Timer)localObject).cancel();
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */