package com.vvt.events;

public class d
{
  private String a;
  private String b;
  private String c;
  private byte[] d;
  private String e;
  private byte[] f;
  
  public d()
  {
    byte[] arrayOfByte = new byte[0];
    this.d = arrayOfByte;
    arrayOfByte = new byte[0];
    this.f = arrayOfByte;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.d = paramArrayOfByte;
  }
  
  public String b()
  {
    return this.e;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.f = paramArrayOfByte;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public void c(String paramString)
  {
    this.b = paramString;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public void d(String paramString)
  {
    this.c = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(" FxIMAttachment {");
    Object localObject1 = localStringBuilder.append(" attachmentFullName =");
    Object localObject2 = this.a;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(" mimeType =");
    localObject2 = this.b;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", thumbnailPath =");
    localObject2 = this.c;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.d;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(", thumbnailData =");
      localObject2 = this.d;
      ((StringBuilder)localObject1).append(localObject2);
      localObject1 = localStringBuilder.append(", attachmentPath =");
      localObject2 = this.e;
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = this.f;
      if (localObject1 == null) {
        break label175;
      }
      localObject1 = localStringBuilder.append(", ownerProfilePicture size =");
      localObject2 = this.f;
      int i = localObject2.length;
      ((StringBuilder)localObject1).append(i);
    }
    for (;;)
    {
      return " }";
      localObject1 = localStringBuilder.append(", thumbnailData =");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
      break;
      label175:
      localObject1 = localStringBuilder.append(", ownerProfilePicture size =");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */