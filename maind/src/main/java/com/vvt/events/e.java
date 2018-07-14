package com.vvt.events;

public class e
{
  private String a;
  private double b;
  private double c;
  private float d;
  
  public e()
  {
    this.b = d1;
    this.c = d1;
    this.d = 0.0F;
  }
  
  public String a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  public void a(float paramFloat)
  {
    this.d = paramFloat;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public double b()
  {
    return this.b;
  }
  
  public void b(double paramDouble)
  {
    this.c = paramDouble;
  }
  
  public double c()
  {
    return this.c;
  }
  
  public float d()
  {
    return this.d;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append(" FxIMLocation {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" place =");
    String str = this.a;
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(" lattitude =");
    double d1 = this.b;
    localStringBuilder2.append(d1);
    localStringBuilder2 = localStringBuilder1.append(", longitude =");
    d1 = this.c;
    localStringBuilder2.append(d1);
    localStringBuilder2 = localStringBuilder1.append(", horAccuracy =");
    float f = this.d;
    localStringBuilder2.append(f);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */