package com.vvt.license;

import com.vvt.license.exception.LicenseEncryptionException;
import java.security.MessageDigest;

public class b
  implements a
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.a;
  private static final boolean c = com.vvt.ak.a.e;
  private d d;
  private LicenseInfo e;
  private c f;
  
  public b(String paramString)
  {
    c localc = new com/vvt/license/c;
    localc.<init>(paramString);
    this.f = localc;
  }
  
  public LicenseInfo a()
  {
    return this.e;
  }
  
  LicenseInfo a(LicenseCipherSet paramLicenseCipherSet)
  {
    int i = 0;
    int j = 0;
    Object localObject1 = null;
    LicenseEncryptionException localLicenseEncryptionException;
    try
    {
      Object localObject3 = paramLicenseCipherSet.activationCodeCipher;
      Object localObject4 = null;
      localObject3 = com.vvt.base.a.b.b((byte[])localObject3, false);
      localObject4 = paramLicenseCipherSet.configIdCipher;
      byte[] arrayOfByte1 = null;
      localObject4 = com.vvt.base.a.b.b((byte[])localObject4, false);
      arrayOfByte1 = paramLicenseCipherSet.licenseStatusCipher;
      byte[] arrayOfByte2 = null;
      arrayOfByte1 = com.vvt.base.a.b.b(arrayOfByte1, false);
      arrayOfByte2 = paramLicenseCipherSet.md5Cipher;
      arrayOfByte2 = com.vvt.base.a.b.b(arrayOfByte2, false);
      if ((localObject3 != null) && (localObject4 != null) && (arrayOfByte1 != null) && (arrayOfByte2 != null)) {
        i = 1;
      }
      if (i != 0)
      {
        localObject1 = new java/lang/String;
        ((String)localObject1).<init>((byte[])localObject4);
        i = Integer.parseInt((String)localObject1);
        localObject4 = new java/lang/String;
        ((String)localObject4).<init>((byte[])localObject3);
        j = 0;
        localObject1 = null;
        j = arrayOfByte1[0];
        localObject3 = LicenseStatus.getLicenseStatusByStatusValue(j);
        localObject1 = new com/vvt/license/LicenseInfo;
        ((LicenseInfo)localObject1).<init>();
        ((LicenseInfo)localObject1).setActivationCode((String)localObject4);
        ((LicenseInfo)localObject1).setConfigurationId(i);
        ((LicenseInfo)localObject1).setLicenseStatus((LicenseStatus)localObject3);
        ((LicenseInfo)localObject1).setMd5(arrayOfByte2);
      }
      return (LicenseInfo)localObject1;
    }
    finally
    {
      boolean bool = c;
      if (bool) {}
      localLicenseEncryptionException = new com/vvt/license/exception/LicenseEncryptionException;
      localLicenseEncryptionException.<init>();
    }
  }
  
  String a(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(paramInt1);
    localStringBuilder.append(paramInt2);
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString2);
    return localStringBuilder.toString();
  }
  
  public void a(d paramd)
  {
    this.d = paramd;
  }
  
  boolean a(LicenseInfo paramLicenseInfo)
  {
    LicenseCipherSet localLicenseCipherSet = b(paramLicenseInfo);
    this.f.b();
    return this.f.a(localLicenseCipherSet);
  }
  
  boolean a(LicenseInfo paramLicenseInfo, com.vvt.productinfo.a parama, String paramString)
  {
    boolean bool1 = a;
    if (bool1) {}
    int i = parama.getProductId();
    bool1 = a;
    if (bool1) {}
    int j = paramLicenseInfo.getConfigurationId();
    bool1 = a;
    if (bool1) {}
    String str = parama.getProtocolHashTail();
    bool1 = a;
    if (bool1) {}
    byte[] arrayOfByte1 = paramLicenseInfo.getMd5();
    bool1 = a;
    if (bool1) {}
    bool1 = false;
    byte[] arrayOfByte2 = null;
    try
    {
      Object localObject = a(i, j, paramString, str);
      localObject = ((String)localObject).getBytes();
      arrayOfByte2 = com.vvt.u.a.a((byte[])localObject);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        boolean bool2 = c;
        if (!bool2) {}
      }
    }
    bool2 = a;
    if (bool2) {}
    bool1 = MessageDigest.isEqual(arrayOfByte2, arrayOfByte1);
    bool2 = a;
    if (bool2) {}
    return bool1;
  }
  
  public boolean a(LicenseInfo paramLicenseInfo, com.vvt.productinfo.a parama, String paramString, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    for (;;)
    {
      try
      {
        Object localObject = paramLicenseInfo.getLicenseStatus();
        LicenseStatus localLicenseStatus = LicenseStatus.DISABLED;
        if (localObject != localLicenseStatus)
        {
          localObject = paramLicenseInfo.getLicenseStatus();
          localLicenseStatus = LicenseStatus.EXPIRED;
          if (localObject != localLicenseStatus)
          {
            bool2 = a(paramLicenseInfo, parama, paramString);
            if (bool2) {
              continue;
            }
            bool2 = a;
            if (bool2) {}
            localObject = LicenseStatus.NOT_ACTIVATED;
            paramLicenseInfo.setLicenseStatus((LicenseStatus)localObject);
          }
        }
        bool2 = a;
        if (bool2) {}
        bool1 = a(paramLicenseInfo);
        bool2 = a;
        if ((!bool2) || (bool1))
        {
          this.e = paramLicenseInfo;
          if (paramBoolean)
          {
            localObject = this.d;
            if (localObject != null)
            {
              localObject = this.d;
              ((d)localObject).e();
            }
          }
        }
        bool2 = a;
        if (bool2) {}
        bool2 = a;
        if (!bool2) {}
      }
      catch (Exception localException)
      {
        boolean bool2 = c;
        if (!bool2) {
          continue;
        }
        continue;
      }
      bool2 = a;
      if (bool2) {}
      return bool1;
      bool2 = b;
      if (!bool2) {}
    }
  }
  
  public boolean a(com.vvt.productinfo.a parama, String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = b;
    if (bool2) {}
    LicenseStatus localLicenseStatus = this.e.getLicenseStatus();
    Object localObject = LicenseStatus.ACTIVATED;
    if (localLicenseStatus == localObject)
    {
      bool2 = bool1;
      localObject = this.e;
      boolean bool3 = a((LicenseInfo)localObject, parama, paramString);
      boolean bool4 = b;
      if (bool4) {}
      bool4 = b;
      if ((bool4) && ((!bool2) || (!bool3))) {
        break label93;
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      localLicenseStatus = null;
      break;
      label93:
      bool1 = false;
    }
  }
  
  LicenseCipherSet b(LicenseInfo paramLicenseInfo)
  {
    LicenseEncryptionException localLicenseEncryptionException;
    try
    {
      Object localObject1 = paramLicenseInfo.getActivationCode();
      localObject1 = ((String)localObject1).getBytes();
      int i = paramLicenseInfo.getConfigurationId();
      Object localObject3 = String.valueOf(i);
      localObject3 = ((String)localObject3).getBytes();
      int j = 1;
      byte[] arrayOfByte1 = new byte[j];
      byte[] arrayOfByte2 = null;
      Object localObject4 = paramLicenseInfo.getLicenseStatus();
      int k = ((LicenseStatus)localObject4).getStatusValue();
      localObject4 = Integer.valueOf(k);
      k = ((Integer)localObject4).byteValue();
      arrayOfByte1[0] = k;
      arrayOfByte2 = null;
      localObject1 = com.vvt.base.a.b.a((byte[])localObject1, false);
      arrayOfByte2 = null;
      localObject3 = com.vvt.base.a.b.a((byte[])localObject3, false);
      arrayOfByte2 = null;
      arrayOfByte1 = com.vvt.base.a.b.a(arrayOfByte1, false);
      arrayOfByte2 = paramLicenseInfo.getMd5();
      k = 0;
      localObject4 = null;
      arrayOfByte2 = com.vvt.base.a.b.a(arrayOfByte2, false);
      localObject4 = new com/vvt/license/LicenseCipherSet;
      ((LicenseCipherSet)localObject4).<init>();
      ((LicenseCipherSet)localObject4).activationCodeCipher = ((byte[])localObject1);
      ((LicenseCipherSet)localObject4).configIdCipher = ((byte[])localObject3);
      ((LicenseCipherSet)localObject4).licenseStatusCipher = arrayOfByte1;
      ((LicenseCipherSet)localObject4).md5Cipher = arrayOfByte2;
      return (LicenseCipherSet)localObject4;
    }
    finally
    {
      boolean bool = c;
      if (bool) {}
      localLicenseEncryptionException = new com/vvt/license/exception/LicenseEncryptionException;
      localLicenseEncryptionException.<init>();
    }
  }
  
  public void b()
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = this.f;
    bool = ((c)localObject).b();
    if (bool)
    {
      localObject = new com/vvt/license/LicenseInfo;
      ((LicenseInfo)localObject).<init>();
      this.e = ((LicenseInfo)localObject);
      localObject = this.d;
      if (localObject == null) {
        break label64;
      }
      localObject = this.d;
      ((d)localObject).e();
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      label64:
      bool = b;
      if (!bool) {}
    }
  }
  
  public void c()
  {
    Object localObject = this.f;
    boolean bool = ((c)localObject).c();
    if (bool)
    {
      localObject = e();
      this.e = ((LicenseInfo)localObject);
      bool = a;
      if (bool) {}
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      return;
      localObject = new com/vvt/license/LicenseInfo;
      ((LicenseInfo)localObject).<init>();
      this.e = ((LicenseInfo)localObject);
      bool = a;
      if (!bool) {}
    }
  }
  
  public LicenseInfo d()
  {
    return e();
  }
  
  LicenseInfo e()
  {
    LicenseCipherSet localLicenseCipherSet = this.f.a();
    return a(localLicenseCipherSet);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/license/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */