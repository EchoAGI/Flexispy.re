package com.vvt.im.events.info;

public class a
{
  private String a;
  private String b;
  private String c;
  private String d;
  private byte[] e;
  private byte[] f;
  private String g;
  
  public a()
  {
    byte[] arrayOfByte = new byte[0];
    this.f = arrayOfByte;
    arrayOfByte = new byte[0];
    this.e = arrayOfByte;
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
    this.e = paramArrayOfByte;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.f = paramArrayOfByte;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public byte[] d()
  {
    return this.e;
  }
  
  public void e(String paramString)
  {
    this.g = paramString;
  }
  
  public byte[] e()
  {
    return this.f;
  }
  
  public String f()
  {
    return this.d;
  }
  
  public String g()
  {
    return this.g;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    String str = this.a;
    arrayOfObject[0] = str;
    str = this.b;
    arrayOfObject[1] = str;
    str = this.d;
    arrayOfObject[2] = str;
    str = this.c;
    arrayOfObject[3] = str;
    return String.format("Attachment { Name: %s, mimeType: %s, thumbnailPath: %s, attachmentPath: %s }", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/info/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */