package com.vvt.capture.instagram.directmessage.data;

public class d
{
  private String a;
  private String b;
  private double c;
  private double d;
  
  public String a()
  {
    return this.b;
  }
  
  public double b()
  {
    return this.c;
  }
  
  public double c()
  {
    return this.d;
  }
  
  public String toString()
  {
    char c1 = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Location{lng=");
    double d1 = this.d;
    localStringBuilder = localStringBuilder.append(d1).append(", lat=");
    d1 = this.c;
    localStringBuilder = localStringBuilder.append(d1).append(", name='");
    String str = this.b;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", pk='");
    str = this.a;
    return str + c1 + '}';
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/data/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */