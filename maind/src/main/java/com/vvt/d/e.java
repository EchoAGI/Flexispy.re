package com.vvt.d;

public class e
{
  private long a;
  private long b;
  private boolean c;
  private String d;
  private String e;
  
  public long a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void b(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = Long.valueOf(this.a);
    arrayOfObject[0] = localObject;
    localObject = this.d;
    arrayOfObject[1] = localObject;
    localObject = this.e;
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(this.c);
    arrayOfObject[3] = localObject;
    return String.format("id=%s, title=%s, url=%s, isBookmarked=%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/d/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */