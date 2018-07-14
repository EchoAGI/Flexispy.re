package com.vvt.l;

import com.vvt.ak.a;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class e
{
  private static final boolean a;
  private static final boolean b;
  private static final boolean c;
  
  static
  {
    boolean bool1 = true;
    boolean bool2 = a.b;
    if (bool2)
    {
      bool2 = bool1;
      a = bool2;
      bool2 = a.b;
      if (!bool2) {
        break label48;
      }
      bool2 = bool1;
      label26:
      b = bool2;
      bool2 = a.b;
      if (!bool2) {
        break label53;
      }
    }
    for (;;)
    {
      c = bool1;
      return;
      bool2 = false;
      break;
      label48:
      bool2 = false;
      break label26;
      label53:
      bool1 = false;
    }
  }
  
  public static SecretKey a()
  {
    Object localObject1 = "AES";
    try
    {
      localObject1 = KeyGenerator.getInstance((String)localObject1);
      int i = 128;
      ((KeyGenerator)localObject1).init(i);
      localObject1 = ((KeyGenerator)localObject1).generateKey();
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      for (;;)
      {
        boolean bool = c;
        if (bool) {}
        bool = false;
        Object localObject2 = null;
      }
    }
    return (SecretKey)localObject1;
  }
  
  public static SecretKey a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("input key data is null");
      throw ((Throwable)localObject);
    }
    Object localObject = new javax/crypto/spec/SecretKeySpec;
    ((SecretKeySpec)localObject).<init>(paramArrayOfByte, "AES");
    return (SecretKey)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/l/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */