package com.vvt.license;

public enum LicenseStatus
{
  private final int value;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/vvt/license/LicenseStatus;
    ((LicenseStatus)localObject).<init>("NOT_ACTIVATED", 0, 0);
    NOT_ACTIVATED = (LicenseStatus)localObject;
    localObject = new com/vvt/license/LicenseStatus;
    ((LicenseStatus)localObject).<init>("ACTIVATED", k, k);
    ACTIVATED = (LicenseStatus)localObject;
    localObject = new com/vvt/license/LicenseStatus;
    ((LicenseStatus)localObject).<init>("EXPIRED", j, j);
    EXPIRED = (LicenseStatus)localObject;
    localObject = new com/vvt/license/LicenseStatus;
    ((LicenseStatus)localObject).<init>("DISABLED", i, i);
    DISABLED = (LicenseStatus)localObject;
    localObject = new LicenseStatus[4];
    LicenseStatus localLicenseStatus = NOT_ACTIVATED;
    localObject[0] = localLicenseStatus;
    localLicenseStatus = ACTIVATED;
    localObject[k] = localLicenseStatus;
    localLicenseStatus = EXPIRED;
    localObject[j] = localLicenseStatus;
    localLicenseStatus = DISABLED;
    localObject[i] = localLicenseStatus;
    a = (LicenseStatus[])localObject;
  }
  
  private LicenseStatus(int paramInt1)
  {
    this.value = paramInt1;
  }
  
  public static LicenseStatus getLicenseStatusByStatusValue(int paramInt)
  {
    LicenseStatus localLicenseStatus;
    switch (paramInt)
    {
    default: 
      localLicenseStatus = NOT_ACTIVATED;
    }
    for (;;)
    {
      return localLicenseStatus;
      localLicenseStatus = ACTIVATED;
      continue;
      localLicenseStatus = EXPIRED;
      continue;
      localLicenseStatus = DISABLED;
    }
  }
  
  public int getStatusValue()
  {
    return this.value;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/license/LicenseStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */