package com.vvt.events;

public class b
{
  private FxEventDirection a;
  private long b;
  private String c;
  private String d;
  
  public FxEventDirection a()
  {
    return this.a;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void a(FxEventDirection paramFxEventDirection)
  {
    this.a = paramFxEventDirection;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public long b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxEmbededCallInfo {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" Direction =");
    Object localObject = this.a;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", Duration =");
    long l = this.b;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append(", Number =");
    localObject = this.c;
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", ContactName =");
    localObject = this.d;
    localStringBuilder2.append((String)localObject);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */