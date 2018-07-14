package org.eclipse.paho.client.mqttv3;

import java.util.TimerTask;
import org.eclipse.paho.client.mqttv3.a.a;
import org.eclipse.paho.client.mqttv3.b.b;

class r
  extends TimerTask
{
  private r(p paramp) {}
  
  public void run()
  {
    b localb = p.d();
    String str = p.c();
    Object[] arrayOfObject = new Object[1];
    Long localLong = new java/lang/Long;
    long l = System.currentTimeMillis();
    localLong.<init>(l);
    arrayOfObject[0] = localLong;
    localb.b(str, "PingTask.run", "660", arrayOfObject);
    p.a(this.a).l();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/org/eclipse/paho/client/mqttv3/r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */