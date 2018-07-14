package com.vvt.capture.instagram.directmessage.data;

public class j
{
  private String a;
  private String b;
  private String c;
  private String d;
  private boolean e;
  
  public String a()
  {
    return this.a;
  }
  
  public String toString()
  {
    char c1 = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Profile{username='");
    String str = this.a;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", fullName='");
    str = this.b;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", profilePicUrl='");
    str = this.c;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", id='");
    str = this.d;
    localStringBuilder = localStringBuilder.append(str).append(c1).append(", isPrivate=");
    boolean bool = this.e;
    return bool + '}';
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/data/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */