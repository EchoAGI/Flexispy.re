package com.vvt.http.request;

import com.vvt.ak.a;
import java.io.ByteArrayInputStream;

class c
  extends d
{
  private static final boolean a;
  private static final boolean b;
  private byte[] c;
  private int d;
  private int e;
  private ByteArrayInputStream f;
  
  static
  {
    boolean bool = a.a;
    if (bool) {}
    for (bool = true;; bool = false)
    {
      a = bool;
      b = a.d;
      return;
    }
  }
  
  public c(byte[] paramArrayOfByte)
  {
    this.c = paramArrayOfByte;
    int i = paramArrayOfByte.length;
    this.d = i;
    this.e = 0;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public int a(byte[] paramArrayOfByte)
  {
    ByteArrayInputStream localByteArrayInputStream = this.f;
    if (localByteArrayInputStream == null)
    {
      boolean bool1 = a;
      if (bool1) {}
      localByteArrayInputStream = new java/io/ByteArrayInputStream;
      byte[] arrayOfByte = this.c;
      localByteArrayInputStream.<init>(arrayOfByte);
      this.f = localByteArrayInputStream;
      localByteArrayInputStream = this.f;
      int j = this.e;
      long l = j;
      localByteArrayInputStream.skip(l);
    }
    localByteArrayInputStream = this.f;
    int i = localByteArrayInputStream.read(paramArrayOfByte);
    boolean bool2 = a;
    if (bool2) {}
    return i;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void b()
  {
    this.f.close();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/http/request/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */