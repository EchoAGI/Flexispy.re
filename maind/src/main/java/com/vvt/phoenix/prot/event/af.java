package com.vvt.phoenix.prot.event;

public class af
  extends r
{
  private int a;
  private int b;
  private int c;
  private double d;
  private double e;
  private float f;
  private float g;
  private float h;
  private float i;
  private float j;
  private String k;
  private String l;
  private String m;
  private long n;
  private String o;
  private long p;
  
  public int a()
  {
    return 36;
  }
  
  public void a(double paramDouble)
  {
    this.d = paramDouble;
  }
  
  public void a(float paramFloat)
  {
    this.f = paramFloat;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.n = paramLong;
  }
  
  public void a(String paramString)
  {
    this.k = paramString;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public void b(double paramDouble)
  {
    this.e = paramDouble;
  }
  
  public void b(float paramFloat)
  {
    this.g = paramFloat;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void b(long paramLong)
  {
    this.p = paramLong;
  }
  
  public void b(String paramString)
  {
    this.l = paramString;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void c(float paramFloat)
  {
    this.h = paramFloat;
  }
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void c(String paramString)
  {
    this.m = paramString;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public void d(float paramFloat)
  {
    this.i = paramFloat;
  }
  
  public void d(String paramString)
  {
    this.o = paramString;
  }
  
  public double e()
  {
    return this.d;
  }
  
  public void e(float paramFloat)
  {
    this.j = paramFloat;
  }
  
  public double f()
  {
    return this.e;
  }
  
  public float g()
  {
    return this.f;
  }
  
  public float h()
  {
    return this.g;
  }
  
  public float i()
  {
    return this.h;
  }
  
  public float l()
  {
    return this.i;
  }
  
  public float m()
  {
    return this.j;
  }
  
  public String n()
  {
    return this.k;
  }
  
  public String o()
  {
    return this.l;
  }
  
  public String p()
  {
    return this.m;
  }
  
  public long q()
  {
    return this.n;
  }
  
  public String r()
  {
    return this.o;
  }
  
  public long s()
  {
    return this.p;
  }
  
  public String toString()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = ((StringBuilder)localObject1).append("Location Event Details.\n").append("Calling Module: ");
    int i1 = this.a;
    localObject2 = i1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Method: ");
    i1 = this.b;
    localObject2 = i1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Provider: ");
    i1 = this.c;
    localObject2 = i1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Lat: ");
    double d1 = this.d;
    localObject2 = d1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Lon: ");
    d1 = this.e;
    localObject2 = d1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Altitude: ");
    float f1 = this.f;
    localObject2 = f1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Speed: ");
    f1 = this.g;
    localObject2 = f1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Heading: ");
    f1 = this.h;
    localObject2 = f1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Horizontal Accuracy: ");
    f1 = this.i;
    localObject2 = f1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Vertical Accuracy: ");
    f1 = this.j;
    localObject2 = f1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Network Name: ");
    localObject1 = this.k;
    localObject2 = (String)localObject1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Network ID: ");
    localObject1 = this.l;
    localObject2 = (String)localObject1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Cell Name: ");
    localObject1 = this.m;
    localObject2 = (String)localObject1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Cell ID: ");
    long l1 = this.n;
    localObject2 = l1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("MCC: ");
    localObject1 = this.o;
    localObject2 = (String)localObject1 + "\n";
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject2 = ((StringBuilder)localObject1).append((String)localObject2).append("Area Code: ");
    l1 = this.p;
    return l1 + "\n";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/af.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */