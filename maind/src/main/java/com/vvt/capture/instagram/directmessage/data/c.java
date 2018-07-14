package com.vvt.capture.instagram.directmessage.data;

public class c
{
  private String a;
  private long b;
  private i c;
  
  public String a()
  {
    return this.a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("HashTag{name='");
    Object localObject = this.a;
    localStringBuilder = localStringBuilder.append((String)localObject).append('\'').append(", mediaCount=");
    long l = this.b;
    localStringBuilder = localStringBuilder.append(l).append(", media=");
    localObject = this.c;
    return localObject + '}';
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/data/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */