package com.vvt.phoenix.prot.event;

import java.util.ArrayList;

public class an
  extends r
{
  private long a;
  private int b;
  private String c;
  private String d;
  private String e;
  private ArrayList f;
  private String g;
  
  public an()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.f = localArrayList;
  }
  
  public int a()
  {
    return 2;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void a(am paramam)
  {
    this.f.add(paramam);
  }
  
  public final void a(String paramString)
  {
    this.c = paramString;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public am b(int paramInt)
  {
    return (am)this.f.get(paramInt);
  }
  
  public void b(String paramString)
  {
    this.d = paramString;
  }
  
  public final String c()
  {
    return this.c;
  }
  
  public void c(String paramString)
  {
    this.e = paramString;
  }
  
  public String d()
  {
    return this.d;
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
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/an.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */