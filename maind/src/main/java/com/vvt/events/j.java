package com.vvt.events;

public class j
{
  private byte[] a;
  private String b;
  
  public String a()
  {
    return this.b;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("FxThumbnail {");
    Object localObject1 = this.a;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(" Data Size =");
      localObject2 = this.a;
      int i = localObject2.length;
      ((StringBuilder)localObject1).append(i);
    }
    for (;;)
    {
      localObject1 = localStringBuilder.append(" ThumbnailPath =");
      localObject2 = this.b;
      ((StringBuilder)localObject1).append((String)localObject2);
      return " }";
      localObject1 = localStringBuilder.append(" Data Size =");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */