package com.vvt.capture.sms;

public class SmsData
{
  private long a;
  private long b;
  private long c;
  private SmsData.Type d;
  private String e;
  private String f;
  private String g;
  
  public long a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(SmsData.Type paramType)
  {
    this.d = paramType;
  }
  
  public void a(String paramString)
  {
    this.e = paramString;
  }
  
  public long b()
  {
    return this.c;
  }
  
  public void b(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void b(String paramString)
  {
    this.f = paramString;
  }
  
  public SmsData.Type c()
  {
    return this.d;
  }
  
  public void c(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void c(String paramString)
  {
    this.g = paramString;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public String e()
  {
    return this.f;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public long g()
  {
    return this.b;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Long.valueOf(this.a);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.b);
    arrayOfObject[1] = localObject;
    localObject = this.e;
    arrayOfObject[2] = localObject;
    localObject = this.g;
    arrayOfObject[3] = localObject;
    localObject = this.f;
    arrayOfObject[4] = localObject;
    return String.format("id:%s, threadId: %s, body:%s, phoneNumber:%s, contactName:%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/SmsData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */