package com.fx.daemon.util;

import android.os.ConditionVariable;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.vvt.aa.a;
import com.vvt.ag.b;

class f
  extends Thread
{
  f(e parame, String paramString)
  {
    super(paramString);
  }
  
  public void run()
  {
    boolean bool1;
    Object localObject;
    do
    {
      bool1 = a.a();
      if (!bool1) {
        break;
      }
      localObject = e.a(this.a).getNetworkOperatorName();
      bool1 = b.a((String)localObject);
    } while (bool1);
    for (;;)
    {
      e.b(this.a);
      e.c(this.a).open();
      return;
      localObject = e.a(this.a).getCellLocation();
      if (localObject == null) {
        break;
      }
      boolean bool2 = localObject instanceof GsmCellLocation;
      if (!bool2)
      {
        bool1 = localObject instanceof CdmaCellLocation;
        if (!bool1) {
          break;
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/daemon/util/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */