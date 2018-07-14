package com.vvt.phoenix.prot.command.a;

import java.util.ArrayList;

public abstract class s
{
  private long a;
  private int b;
  private int c;
  private String d;
  private long e;
  private ArrayList f;
  
  public s()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.f = localArrayList;
  }
  
  public abstract int a();
  
  public void a(q paramq)
  {
    this.f.add(paramq);
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void b(long paramLong)
  {
    this.a = paramLong;
  }
  
  public void c(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void c(long paramLong)
  {
    this.e = paramLong;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public q d(int paramInt)
  {
    return (q)this.f.get(paramInt);
  }
  
  public int e()
  {
    return this.c;
  }
  
  public String f()
  {
    return this.d;
  }
  
  public int g()
  {
    return this.f.size();
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/command/a/s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */