package com.vvt.callmanager.mitm;

import android.telephony.TelephonyManager;
import com.vvt.f.a;

class m
{
  private m(j paramj) {}
  
  public boolean a()
  {
    String str = j.a(this.a).getNetworkOperatorName();
    TelephonyManager localTelephonyManager = j.a(this.a);
    int i = localTelephonyManager.getNetworkType();
    boolean bool1 = j.b();
    if (bool1) {}
    boolean bool2 = a.a(str);
    if ((!bool2) || (i > 0)) {
      bool2 = true;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      str = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */