package com.vvt.capture.instagram.directmessage.data;

import java.util.List;

public class e
{
  private String a;
  private String b;
  private String c;
  private List d;
  private List e;
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public List d()
  {
    return this.d;
  }
  
  public List e()
  {
    return this.e;
  }
  
  public String toString()
  {
    char c1 = '\'';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("DirectThread{threadId='");
    Object localObject = this.a;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c1).append(", threadTitle='");
    localObject = this.b;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c1).append(", lastActivityAt='");
    localObject = this.c;
    localStringBuilder = localStringBuilder.append((String)localObject).append(c1).append(", cachedMessages=");
    localObject = this.d;
    localStringBuilder = localStringBuilder.append(localObject).append(", recipients=");
    localObject = this.e;
    return localObject + '}';
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/instagram/directmessage/data/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */