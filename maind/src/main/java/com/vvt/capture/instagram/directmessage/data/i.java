package com.vvt.capture.instagram.directmessage.data;

import java.util.List;

public class i
{
  private g a;
  private String b;
  private List c;
  
  public g a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public List c()
  {
    return this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("Media [imageVersions2=");
    Object localObject = this.a;
    localStringBuilder = localStringBuilder.append(localObject).append(", mediaType=");
    localObject = this.b;
    localStringBuilder = localStringBuilder.append((String)localObject).append(", videoVersions=");
    localObject = this.c;
    return localObject + "]";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/data/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */