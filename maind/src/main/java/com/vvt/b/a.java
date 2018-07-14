package com.vvt.b;

import java.text.SimpleDateFormat;
import java.util.Date;

public class a
{
  private String a;
  private String b;
  private String c;
  private long d;
  private int e;
  private byte[] f;
  private SimpleDateFormat g;
  
  public a()
  {
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss");
    this.g = localSimpleDateFormat;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.f = paramArrayOfByte;
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
  
  public long d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    if (paramObject != null)
    {
      boolean bool2 = paramObject instanceof a;
      if (bool2)
      {
        paramObject = (a)paramObject;
        String str1 = this.a;
        String str2 = ((a)paramObject).a();
        bool2 = str1.equals(str2);
        if (bool2)
        {
          str1 = this.b;
          str2 = ((a)paramObject).b();
          bool2 = str1.equals(str2);
          if (bool2) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public byte[] f()
  {
    return this.f;
  }
  
  public int hashCode()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.a.toString();
    localStringBuilder = localStringBuilder.append(str);
    str = this.b.toString();
    return str.hashCode();
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.a;
    arrayOfObject[0] = localObject;
    localObject = this.b;
    arrayOfObject[1] = localObject;
    localObject = this.c;
    arrayOfObject[2] = localObject;
    localObject = this.g;
    Date localDate = new java/util/Date;
    long l = this.d;
    localDate.<init>(l);
    localObject = ((SimpleDateFormat)localObject).format(localDate);
    arrayOfObject[3] = localObject;
    return String.format("%s, pkg: %s, ver: %s, date: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/removeFromPath/a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */