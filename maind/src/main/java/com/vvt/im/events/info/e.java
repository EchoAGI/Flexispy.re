package com.vvt.im.events.info;

public class e
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private byte[] f;
  
  public e()
  {
    byte[] arrayOfByte = new byte[0];
    this.f = arrayOfByte;
  }
  
  public String a()
  {
    return this.e;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.f = paramArrayOfByte;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public void c(String paramString)
  {
    this.a = paramString;
  }
  
  public String d()
  {
    return this.b;
  }
  
  public void d(String paramString)
  {
    this.b = paramString;
  }
  
  public void e(String paramString)
  {
    this.c = paramString;
  }
  
  public byte[] e()
  {
    return this.f;
  }
  
  public String f()
  {
    return this.c;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    String str = this.a;
    arrayOfObject[0] = str;
    str = this.b;
    arrayOfObject[1] = str;
    str = this.d;
    arrayOfObject[2] = str;
    str = this.c;
    arrayOfObject[3] = str;
    str = this.e;
    arrayOfObject[4] = str;
    return String.format("Participant { Name: %s, Uid: %s, Contact: %s, Status: %s, PicPath:%s }", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/info/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */