package com.vvt.appengine;

import android.os.Process;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;

import d.h.v.Hv;
import java.util.TimerTask;

class e
  extends TimerTask
{
  e(a parama) {}
  
  public void run()
  {
    Object localObject = a.a(this.a).k.a();
    LicenseStatus localLicenseStatus1 = ((LicenseInfo)localObject).getLicenseStatus();
    LicenseStatus localLicenseStatus2 = LicenseStatus.ACTIVATED;
    if (localLicenseStatus1 != localLicenseStatus2)
    {
      localLicenseStatus1 = ((LicenseInfo)localObject).getLicenseStatus();
      localLicenseStatus2 = LicenseStatus.DISABLED;
      if (localLicenseStatus1 != localLicenseStatus2)
      {
        localObject = ((LicenseInfo)localObject).getLicenseStatus();
        localLicenseStatus1 = LicenseStatus.EXPIRED;
        if (localObject != localLicenseStatus1) {
          break label119;
        }
      }
    }
    boolean bool1 = true;
    label73:
    int i;
    if (bool1)
    {
      localObject = this.a;
      ((a)localObject).f();
      bool1 = a.i();
      if (bool1) {}
      localObject = new d/ AppEngine1 /v/Hv;
      ((Hv)localObject).<init>();
      i = ((Hv)localObject).vv();
      int j = 69;
      if (i == j) {
        break label140;
      }
      i = Process.myPid();
      Process.killProcess(i);
    }
    for (;;)
    {
      return;
      label119:
      i = 0;
      localObject = null;
      break;
      boolean bool2 = a.i();
      if (!bool2) {
        break label73;
      }
      break label73;
      label140:
      bool2 = a.i();
      if (!bool2) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */