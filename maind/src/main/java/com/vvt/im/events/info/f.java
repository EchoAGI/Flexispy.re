package com.vvt.im.events.info;

public class f
{
  private String a;
  private String b;
  private String c;
  private String d;
  private byte[] e;
  private c f;
  private String g;
  
  public f()
  {
    Object localObject = new byte[0];
    this.e = ((byte[])localObject);
    localObject = new com/vvt/im/events/info/c;
    ((c)localObject).<init>();
    this.f = ((c)localObject);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(c paramc)
  {
    this.f = paramc;
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
  
  public String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public c d()
  {
    return this.f;
  }
  
  public void d(String paramString)
  {
    this.g = paramString;
  }
  
  public String e()
  {
    return this.g;
  }
  
  public void e(String paramString)
  {
    this.d = paramString;
  }
  
  public String f()
  {
    return this.d;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[6];
    String str = this.b;
    arrayOfObject[0] = str;
    str = this.a;
    arrayOfObject[1] = str;
    str = this.g;
    arrayOfObject[2] = str;
    str = this.d;
    arrayOfObject[3] = str;
    str = this.c;
    arrayOfObject[4] = str;
    str = this.f.toString();
    arrayOfObject[5] = str;
    return String.format("SenderInfo { Name: %s, Uid: %s, Contact: %s, ProfilePicPath: %s, Status: %s, LocationInfo: \n%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/info/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */