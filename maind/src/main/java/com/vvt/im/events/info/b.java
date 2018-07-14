package com.vvt.im.events.info;

public class b
{
  private String a;
  private String b;
  private String c;
  private String d;
  private byte[] e;
  
  public b()
  {
    byte[] arrayOfByte = new byte[0];
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
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public byte[] c()
  {
    return this.e;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    String str = this.b;
    arrayOfObject[0] = str;
    str = this.a;
    arrayOfObject[1] = str;
    str = this.c;
    arrayOfObject[2] = str;
    str = this.d;
    arrayOfObject[3] = str;
    return String.format("ConversationInfo { Name: %s, Id: %s, PicturePath: %s, Status: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/info/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */