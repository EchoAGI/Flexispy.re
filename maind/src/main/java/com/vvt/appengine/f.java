package com.vvt.appengine;

import com.vvt.datadeliverymanager.i;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.phoenix.prot.command.a.l;

class f
  implements com.vvt.datadeliverymanager.a.a
{
  f(a parama) {}
  
  public void a(i parami) {}
  
  public void b(i parami)
  {
    bool1 = a.i();
    if (bool1) {}
    bool1 = a.i();
    if (bool1) {}
    bool1 = parami.f();
    Object localObject1;
    com.vvt.license.b localb;
    Object localObject2;
    int i;
    Object localObject3;
    Object localObject4;
    if (bool1)
    {
      localObject1 = (l)parami.a();
      localb = a.a(this.a).k;
      localObject2 = localb.a();
      i = ((LicenseInfo)localObject2).getConfigurationId();
      boolean bool3 = a.i();
      if (bool3) {}
      localObject3 = ((LicenseInfo)localObject2).getLicenseStatus();
      localObject4 = LicenseStatus.NOT_ACTIVATED;
      if (localObject3 != localObject4) {
        break label270;
      }
      i = -1;
    }
    for (;;)
    {
      int k = ((l)localObject1).c();
      if (k != i)
      {
        boolean bool2 = a.g();
        if (bool2) {}
        localb = a.a(this.a).k;
        localObject2 = localb.a();
        localObject3 = new com/vvt/license/LicenseInfo;
        ((LicenseInfo)localObject3).<init>();
        localObject4 = ((LicenseInfo)localObject2).getActivationCode();
        ((LicenseInfo)localObject3).setActivationCode((String)localObject4);
        localObject2 = ((LicenseInfo)localObject2).getLicenseStatus();
        ((LicenseInfo)localObject3).setLicenseStatus((LicenseStatus)localObject2);
        k = ((l)localObject1).c();
        ((LicenseInfo)localObject3).setConfigurationId(k);
        localObject1 = ((l)localObject1).b();
        ((LicenseInfo)localObject3).setMd5((byte[])localObject1);
      }
      try
      {
        bool1 = a.i();
        if (bool1) {}
        localObject1 = this.a;
        localObject1 = a.a((a)localObject1);
        localObject1 = ((AppEngine1)localObject1).o;
        localObject2 = this.a;
        localObject2 = a.a((a)localObject2);
        localObject2 = ((AppEngine1)localObject2).l;
        localObject2 = ((com.vvt.phoneinfo.b)localObject2).d();
        boolean bool4 = true;
        localb.a((LicenseInfo)localObject3, (com.vvt.productinfo.a)localObject1, (String)localObject2, bool4);
        bool1 = a.i();
        if (bool1) {}
        return;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label270:
          int j;
          bool1 = a.h();
          if (!bool1) {}
        }
      }
      localObject3 = ((LicenseInfo)localObject2).getLicenseStatus();
      localObject4 = LicenseStatus.EXPIRED;
      if (localObject3 == localObject4)
      {
        j = -2;
      }
      else
      {
        localObject2 = ((LicenseInfo)localObject2).getLicenseStatus();
        localObject3 = LicenseStatus.DISABLED;
        if (localObject2 == localObject3) {
          j = -3;
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */