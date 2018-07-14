package com.vvt.callmanager.filter;

import android.os.Handler;
import android.os.Looper;

class k
  extends Thread
{
  Handler a;
  Looper b;
  
  k(FilterSms paramFilterSms) {}
  
  Handler a()
  {
    return this.a;
  }
  
  public void run()
  {
    Looper.prepare();
    Object localObject = Looper.myLooper();
    this.b = ((Looper)localObject);
    localObject = new com/vvt/callmanager/filter/l;
    ((l)localObject).<init>(this);
    this.a = ((Handler)localObject);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */