package com.vvt.phoenix.prot.event;

import java.util.ArrayList;

public class ag
  extends r
{
  private int a;
  private String b;
  private String c;
  private String d;
  private ArrayList e;
  private String f;
  private String g;
  private ArrayList h;
  
  public ag()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.e = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.h = localArrayList;
  }
  
  public int a()
  {
    return 8;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(am paramam)
  {
    this.e.add(paramam);
  }
  
  public void a(d paramd)
  {
    this.h.add(paramd);
  }
  
  public final void a(String paramString)
  {
    this.b = paramString;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public am b(int paramInt)
  {
    return (am)this.e.get(paramInt);
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public d c(int paramInt)
  {
    return (d)this.h.get(paramInt);
  }
  
  public final String c()
  {
    return this.b;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public void d(String paramString)
  {
    this.f = paramString;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public String f()
  {
    return this.f;
  }
  
  public final void f(String paramString)
  {
    this.g = paramString;
  }
  
  public final String g()
  {
    return this.g;
  }
  
  public int h()
  {
    return this.h.size();
  }
  
  public int i()
  {
    return this.e.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/ag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */