package com.vvt.capture.f;

import com.vvt.events.FxMediaType;

public class b
{
  private long a;
  private FxMediaType b;
  private long c;
  private String d;
  private String e;
  
  public FxMediaType a()
  {
    return this.b;
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(FxMediaType paramFxMediaType)
  {
    this.b = paramFxMediaType;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public long b()
  {
    return this.c;
  }
  
  public void b(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public long e()
  {
    return this.a;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.d;
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.c);
    arrayOfObject[1] = localObject;
    localObject = this.e;
    arrayOfObject[2] = localObject;
    localObject = this.b;
    arrayOfObject[3] = localObject;
    return String.format("actualFullPath=%s\n actualFileSize=%s\n thumbnailFullPath=%s\n format=%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/f/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */