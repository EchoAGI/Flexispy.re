package com.vvt.capture.mms.b;

import android.database.ContentObserver;
import android.os.Handler;
import com.vvt.base.capture.i;

class d
  extends ContentObserver
{
  d(c paramc, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean)
  {
    Object localObject1 = this.a.a;
    if (localObject1 != null) {
      localObject1 = this.a.b;
    }
    synchronized (b.a((b)localObject1))
    {
      localObject1 = this.a;
      localObject1 = ((c)localObject1).b;
      boolean bool = b.b((b)localObject1);
      if (bool)
      {
        localObject1 = this.a;
        localObject1 = ((c)localObject1).a;
        ((i)localObject1).a();
      }
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */