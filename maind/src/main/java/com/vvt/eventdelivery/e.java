package com.vvt.eventdelivery;

import com.vvt.datadeliverymanager.a.a;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

class e
  extends TimerTask
{
  e(d paramd) {}
  
  public void run()
  {
    boolean bool = c.a();
    if (bool) {}
    bool = c.a();
    if (bool) {}
    Object localObject = d.a(this.a);
    ((Timer)localObject).cancel();
    bool = c.a();
    if (bool) {}
    bool = c.a();
    if (bool) {}
    localObject = this.a.a;
    EventDelivery.Type localType = d.b(this.a);
    d locald = this.a;
    int i = d.c(locald);
    a locala = d.d(this.a);
    c.a((c)localObject, localType, i, locala);
    localObject = c.a(this.a.a);
    localType = d.b(this.a);
    ((HashMap)localObject).remove(localType);
    bool = c.a();
    if (bool) {}
    bool = c.a();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventdelivery/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */