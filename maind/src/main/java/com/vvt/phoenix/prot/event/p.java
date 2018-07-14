package com.vvt.phoenix.prot.event;

import java.util.ArrayList;

public class p
  extends r
{
  private int a;
  private String b;
  private String c;
  private ArrayList d;
  private String e;
  private ArrayList f;
  private String g;
  
  public p()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.d = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.f = localArrayList;
  }
  
  public int a()
  {
    return 3;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(am paramam)
  {
    this.d.add(paramam);
  }
  
  public void a(d paramd)
  {
    this.f.add(paramd);
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public am b(int paramInt)
  {
    return (am)this.d.get(paramInt);
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public d c(int paramInt)
  {
    return (d)this.f.get(paramInt);
  }
  
  public String c()
  {
    return this.b;
  }
  
  public void c(String paramString)
  {
    this.e = paramString;
  }
  
  public String d()
  {
    return this.c;
  }
  
  public void d(String paramString)
  {
    this.g = paramString;
  }
  
  public String e()
  {
    return this.e;
  }
  
  public String f()
  {
    return this.g;
  }
  
  public int g()
  {
    return this.f.size();
  }
  
  public int h()
  {
    return this.d.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */