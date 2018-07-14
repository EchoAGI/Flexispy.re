package com.vvt.l;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class f
{
  public static byte[] a(Key paramKey, byte[] paramArrayOfByte)
  {
    Object localObject = "RSA/None/PKCS1Padding";
    try
    {
      localObject = Cipher.getInstance((String)localObject);
      int i = 2;
      ((Cipher)localObject).init(i, paramKey);
      return ((Cipher)localObject).doFinal(paramArrayOfByte);
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localGeneralSecurityException = new java/security/GeneralSecurityException;
      localGeneralSecurityException.<init>(localNoSuchAlgorithmException);
      throw localGeneralSecurityException;
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      localGeneralSecurityException = new java/security/GeneralSecurityException;
      localGeneralSecurityException.<init>(localNoSuchPaddingException);
      throw localGeneralSecurityException;
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      localGeneralSecurityException = new java/security/GeneralSecurityException;
      localGeneralSecurityException.<init>(localInvalidKeyException);
      throw localGeneralSecurityException;
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      localGeneralSecurityException = new java/security/GeneralSecurityException;
      localGeneralSecurityException.<init>(localIllegalBlockSizeException);
      throw localGeneralSecurityException;
    }
    catch (BadPaddingException localBadPaddingException)
    {
      GeneralSecurityException localGeneralSecurityException = new java/security/GeneralSecurityException;
      localGeneralSecurityException.<init>(localBadPaddingException);
      throw localGeneralSecurityException;
    }
  }
  
  public static byte[] a(RSAPublicKey paramRSAPublicKey, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = null;
    Object localObject = "RSA/None/PKCS1Padding";
    try
    {
      localObject = Cipher.getInstance((String)localObject);
      int i = 1;
      ((Cipher)localObject).init(i, paramRSAPublicKey);
      arrayOfByte = ((Cipher)localObject).doFinal(paramArrayOfByte);
    }
    catch (InvalidKeyException localInvalidKeyException)
    {
      throw localInvalidKeyException;
    }
    catch (BadPaddingException localBadPaddingException)
    {
      for (;;) {}
    }
    catch (IllegalBlockSizeException localIllegalBlockSizeException)
    {
      for (;;) {}
    }
    catch (NoSuchPaddingException localNoSuchPaddingException)
    {
      for (;;) {}
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;) {}
    }
    return arrayOfByte;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/l/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */