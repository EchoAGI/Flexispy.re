package com.vvt.phoenix.prot.databuilder;

import javax.crypto.SecretKey;

public abstract class v
{
  private byte[] a;
  private SecretKey b;
  private long c;
  private long d;
  
  public abstract PayloadType a();
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(SecretKey paramSecretKey)
  {
    this.b = paramSecretKey;
  }
  
  public void b(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public byte[] c()
  {
    return this.a;
  }
  
  public SecretKey d()
  {
    return this.b;
  }
  
  public long e()
  {
    return this.c;
  }
  
  public long f()
  {
    return this.d;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/databuilder/v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */