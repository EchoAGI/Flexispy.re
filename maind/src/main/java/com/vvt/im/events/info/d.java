package com.vvt.im.events.info;

public class d
{
  private String a;
  private String b;
  private String c;
  private byte[] d;
  private String e;
  private String f;
  private String g;
  
  public d()
  {
    byte[] arrayOfByte = new byte[0];
    this.d = arrayOfByte;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
  
  public byte[] c()
  {
    return this.d;
  }
  
  public String d()
  {
    return this.f;
  }
  
  public void d(String paramString)
  {
    this.c = paramString;
  }
  
  public String e()
  {
    return this.c;
  }
  
  public void e(String paramString)
  {
    this.g = paramString;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public void f(String paramString)
  {
    this.e = paramString;
  }
  
  public String g()
  {
    return this.e;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[6];
    String str = this.a;
    arrayOfObject[0] = str;
    str = this.b;
    arrayOfObject[1] = str;
    str = this.c;
    arrayOfObject[2] = str;
    str = this.e;
    arrayOfObject[3] = str;
    str = this.f;
    arrayOfObject[4] = str;
    str = this.g;
    arrayOfObject[5] = str;
    return String.format("OwnerInfo { Name: %s, Uid: %s, Contact: %s, ProfilePicPath: %s, Status: %stoken: %s }", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/info/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */