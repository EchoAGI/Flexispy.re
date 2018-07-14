package com.vvt.license;

import java.io.Serializable;

class LicenseCipherSet
  implements Serializable
{
  private static final long serialVersionUID = 7212039160576682929L;
  public byte[] activationCodeCipher;
  public byte[] configIdCipher;
  public byte[] licenseStatusCipher;
  public byte[] md5Cipher;
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/license/LicenseCipherSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */