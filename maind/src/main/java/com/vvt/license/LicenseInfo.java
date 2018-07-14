package com.vvt.license;

import java.io.Serializable;
import java.util.Arrays;

public class LicenseInfo
  implements Serializable
{
  private static final long serialVersionUID = -7376339481152588713L;
  private String mActivationCode = "";
  private int mConfigurationId = -1;
  private LicenseStatus mLicenseStatus;
  private byte[] mServerMd5;
  
  public LicenseInfo()
  {
    Object localObject = LicenseStatus.NOT_ACTIVATED;
    this.mLicenseStatus = ((LicenseStatus)localObject);
    localObject = new byte[0];
    this.mServerMd5 = ((byte[])localObject);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof LicenseInfo;
      if (bool2) {
        break;
      }
      bool1 = false;
    }
    paramObject = (LicenseInfo)paramObject;
    int i = this.mConfigurationId;
    int j = ((LicenseInfo)paramObject).getConfigurationId();
    Object localObject1;
    if (i == j)
    {
      localObject1 = this.mActivationCode;
      if (localObject1 != null) {
        break label115;
      }
      localObject1 = ((LicenseInfo)paramObject).getActivationCode();
      if (localObject1 != null) {}
    }
    for (;;)
    {
      localObject1 = this.mLicenseStatus;
      Object localObject2 = ((LicenseInfo)paramObject).getLicenseStatus();
      boolean bool3;
      if (localObject1 == localObject2)
      {
        localObject1 = this.mServerMd5;
        localObject2 = ((LicenseInfo)paramObject).getMd5();
        bool3 = Arrays.equals((byte[])localObject1, (byte[])localObject2);
        if (bool3) {
          break;
        }
      }
      label115:
      do
      {
        bool1 = false;
        break;
        localObject1 = this.mActivationCode;
        localObject2 = ((LicenseInfo)paramObject).getActivationCode();
        bool3 = ((String)localObject1).equals(localObject2);
      } while (!bool3);
    }
  }
  
  public String getActivationCode()
  {
    return this.mActivationCode;
  }
  
  public int getConfigurationId()
  {
    return this.mConfigurationId;
  }
  
  public LicenseStatus getLicenseStatus()
  {
    return this.mLicenseStatus;
  }
  
  public byte[] getMd5()
  {
    return this.mServerMd5;
  }
  
  public void setActivationCode(String paramString)
  {
    this.mActivationCode = paramString;
  }
  
  public void setConfigurationId(int paramInt)
  {
    this.mConfigurationId = paramInt;
  }
  
  public void setLicenseStatus(LicenseStatus paramLicenseStatus)
  {
    this.mLicenseStatus = paramLicenseStatus;
  }
  
  public void setMd5(byte[] paramArrayOfByte)
  {
    this.mServerMd5 = paramArrayOfByte;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.mConfigurationId);
    arrayOfObject[0] = localObject;
    localObject = this.mLicenseStatus;
    arrayOfObject[1] = localObject;
    localObject = this.mActivationCode;
    arrayOfObject[2] = localObject;
    return String.format("configId: %d, licenseStatus: %s, code: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/license/LicenseInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */