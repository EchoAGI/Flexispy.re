package com.vvt.capture.calendar.b;

public class d
{
  String a;
  String b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  boolean l;
  String m = "";
  
  public String a()
  {
    return this.a;
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public void c(int paramInt)
  {
    this.e = paramInt;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public void d(int paramInt)
  {
    this.f = paramInt;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public void e(int paramInt)
  {
    this.g = paramInt;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public void f(int paramInt)
  {
    this.i = paramInt;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public void g(int paramInt)
  {
    this.k = paramInt;
  }
  
  public int h()
  {
    return this.h;
  }
  
  public int i()
  {
    return this.i;
  }
  
  public int j()
  {
    return this.j;
  }
  
  public int k()
  {
    return this.k;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Recurrence { startDateTime: ");
    String str = this.a;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", endDateTime : ");
    str = this.b;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", recurrenceType : ");
    int n = this.c;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", Multiplier : ");
    n = this.d;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", firstDayOfWeek : ");
    n = this.e;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", daysOfWeek : ");
    n = this.f;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", dateOfMonth : ");
    n = this.g;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", dateOfYear : ");
    n = this.h;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", weekOfMonth : ");
    n = this.i;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", weekOfYear : ");
    n = this.j;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", monthOfYear : ");
    n = this.k;
    localObject = n;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", hasUntillDate : ");
    boolean bool = this.l;
    localObject = bool;
    localStringBuilder.append((String)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append(", untillDate : ");
    str = this.m;
    localObject = str;
    localStringBuilder.append((String)localObject);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calendar/removeFromPath/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */