package com.vvt.im.events.info;

public class c
{
  private String a;
  private double b;
  private double c;
  private float d;
  private float e;
  
  public c()
  {
    this.b = d1;
    this.c = d1;
    this.d = 0.0F;
    b(0.0F);
  }
  
  public double a()
  {
    return this.b;
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
    return this.c;
  }
  
  public void b(double paramDouble)
  {
    this.c = paramDouble;
  }
  
  public void b(float paramFloat)
  {
    this.e = paramFloat;
  }
  
  public String c()
  {
    return this.a;
  }
  
  public float d()
  {
    return this.e;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = Double.valueOf(this.b);
    arrayOfObject[0] = localObject;
    localObject = Double.valueOf(this.c);
    arrayOfObject[1] = localObject;
    localObject = Float.valueOf(this.d);
    arrayOfObject[2] = localObject;
    localObject = Float.valueOf(this.e);
    arrayOfObject[3] = localObject;
    localObject = this.a;
    arrayOfObject[4] = localObject;
    return String.format("LocationInfo{ latitude: %s, longitude: %s, altitude: %s, horizontalAccuracy: %s, placeName: %s}", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/info/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */