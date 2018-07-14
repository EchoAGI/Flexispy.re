package com.vvt.events;

public class c
{
  private double a;
  private double b;
  private float c;
  
  public double a()
  {
    return this.a;
  }
  
  public void a(double paramDouble)
  {
    this.a = paramDouble;
  }
  
  public void a(float paramFloat)
  {
    this.c = paramFloat;
  }
  
  public double b()
  {
    return this.b;
  }
  
  public void b(double paramDouble)
  {
    this.b = paramDouble;
  }
  
  public float c()
  {
    return this.c;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxGeoTag {");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" Lat =");
    double d = this.a;
    localStringBuilder2.append(d);
    localStringBuilder2 = localStringBuilder1.append(", Lon =");
    d = this.b;
    localStringBuilder2.append(d);
    localStringBuilder2 = localStringBuilder1.append(", Altitude =");
    float f = this.c;
    localStringBuilder2.append(f);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */