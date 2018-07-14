package com.vvt.capture.instagram.directmessage.data;

public class n
{
  private String a;
  private String b;
  private String c;
  private String d;
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public String toString()
  {
    char c1 = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("User{userName='");
    String str = this.a;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", fullName='");
    str = this.b;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", profilePicUrl='");
    str = this.c;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", id='");
    str = this.d;
    return str + c1 + '}';
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/data/n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */