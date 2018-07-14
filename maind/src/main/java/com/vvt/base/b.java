package com.vvt.base;

public class b
{
  private static b g = null;
  private long a;
  private long b;
  private long c;
  private long d;
  private String e;
  private String f;
  
  public static b a()
  {
    b localb = g;
    if (localb == null)
    {
      localb = new com/vvt/base/b;
      localb.<init>();
      g = localb;
    }
    return g;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public long b()
  {
    return this.a;
  }
  
  public void b(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void b(String paramString)
  {
    this.f = paramString;
  }
  
  public long c()
  {
    return this.b;
  }
  
  public void c(long paramLong)
  {
    this.c = paramLong;
  }
  
  public long d()
  {
    return this.c;
  }
  
  public void d(long paramLong)
  {
    this.d = paramLong;
  }
  
  public long e()
  {
    return this.d;
  }
  
  public String f()
  {
    return this.e;
  }
  
  public String g()
  {
    return this.f;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    Long localLong = Long.valueOf(this.a);
    arrayOfObject[0] = localLong;
    localLong = Long.valueOf(this.b);
    arrayOfObject[1] = localLong;
    localLong = Long.valueOf(this.c);
    arrayOfObject[2] = localLong;
    localLong = Long.valueOf(this.d);
    arrayOfObject[3] = localLong;
    return String.format("{ImSizeLimit imageAttachmentSizeLimit: %d, videoAttachmentSizeLimit: %d, audioAttachmentSizeLimit: %d, nonMediaAttachmentSizeLimit: %d}", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */