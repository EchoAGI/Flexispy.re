package com.vvt.capture.wa.a;

public class d
{
  private String a;
  private String b;
  private String c;
  private String d;
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    String str = this.c;
    arrayOfObject[0] = str;
    str = this.d;
    arrayOfObject[1] = str;
    str = this.a;
    arrayOfObject[2] = str;
    str = this.b;
    arrayOfObject[3] = str;
    return String.format("displayName:%s\nwaName:%s\nstatus:%s\nnumber:%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/a/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */