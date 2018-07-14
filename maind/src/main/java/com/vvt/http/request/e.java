package com.vvt.http.request;

import com.vvt.ak.a;
import java.io.FileInputStream;

class e
  extends d
{
  private static final boolean a;
  private static final boolean b;
  private String c;
  private FileInputStream d;
  private int e;
  private int f;
  private int g;
  
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
  
  e(String paramString)
  {
    this.c = paramString;
    this.e = 0;
    this.f = 0;
    this.g = 0;
  }
  
  public int a()
  {
    return this.f;
  }
  
  public int a(byte[] paramArrayOfByte)
  {
    FileInputStream localFileInputStream = this.d;
    Object localObject;
    if (localFileInputStream == null)
    {
      boolean bool1 = a;
      if (bool1) {}
      localFileInputStream = new java/io/FileInputStream;
      localObject = this.c;
      localFileInputStream.<init>((String)localObject);
      this.d = localFileInputStream;
      localFileInputStream = this.d;
      k = this.e;
      long l = k;
      localFileInputStream.skip(l);
    }
    int i = this.g;
    int k = this.f;
    int j;
    if (i == k)
    {
      boolean bool2 = b;
      if (bool2) {}
      j = -1;
    }
    for (;;)
    {
      boolean bool3 = a;
      if (bool3) {}
      return j;
      j = this.g;
      int m = paramArrayOfByte.length;
      j += m;
      m = this.f;
      int n;
      if (j > m)
      {
        j = this.f;
        m = this.g;
        j -= m;
        boolean bool4 = b;
        if (bool4) {}
        localObject = this.d;
        j = ((FileInputStream)localObject).read(paramArrayOfByte, 0, j);
        n = this.g + j;
        this.g = n;
      }
      else
      {
        localFileInputStream = this.d;
        j = localFileInputStream.read(paramArrayOfByte);
        n = this.g + j;
        this.g = n;
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void b()
  {
    this.d.close();
  }
  
  public void b(int paramInt)
  {
    this.f = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/http/request/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */