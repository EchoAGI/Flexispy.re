package com.vvt.capture.instagram.directmessage.data;

public class h
{
  private String a;
  private String b;
  private String c;
  private String d;
  
  public String a()
  {
    return this.a;
  }
  
  public String toString()
  {
    char c1 = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Image{url='");
    String str = this.a;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", width='");
    str = this.b;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", height='");
    str = this.c;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", type='");
    str = this.d;
    return str + c1 + '}';
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/data/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */