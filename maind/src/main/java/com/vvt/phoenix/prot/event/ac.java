package com.vvt.phoenix.prot.event;

import java.util.ArrayList;

public class ac
  extends ab
{
  private int a = 0;
  private String b;
  private String c;
  private ae d;
  private int e;
  private String f;
  private ArrayList g;
  private ae h;
  
  public ac()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.g = ((ArrayList)localObject);
    localObject = new com/vvt/phoenix/prot/event/ae;
    ((ae)localObject).<init>();
    this.d = ((ae)localObject);
    this.e = 0;
    localObject = new com/vvt/phoenix/prot/event/ae;
    ((ae)localObject).<init>();
    this.h = ((ae)localObject);
  }
  
  public int a()
  {
    return 49;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(ad paramad)
  {
    this.g.add(paramad);
  }
  
  public void a(ae paramae)
  {
    this.d = paramae;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public void b(int paramInt)
  {
    this.e = paramInt;
  }
  
  public void b(ae paramae)
  {
    this.h = paramae;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public ad c(int paramInt)
  {
    return (ad)this.g.get(paramInt);
  }
  
  public String c()
  {
    return this.b;
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public ae e()
  {
    return this.d;
  }
  
  public int f()
  {
    return this.e;
  }
  
  public String g()
  {
    return this.f;
  }
  
  public int i()
  {
    return this.g.size();
  }
  
  public ae l()
  {
    return this.h;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/ac.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */