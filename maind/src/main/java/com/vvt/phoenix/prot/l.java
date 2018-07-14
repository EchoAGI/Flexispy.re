package com.vvt.phoenix.prot;

public abstract class l
  implements Comparable
{
  private int a;
  private long b;
  private int c;
  
  public abstract int a();
  
  public int a(l paraml)
  {
    int i = this.a;
    int j = paraml.d();
    if (i > j) {
      i = -1;
    }
    for (;;)
    {
      return i;
      i = this.a;
      j = paraml.d();
      if (i == j) {
        i = 0;
      } else {
        i = 1;
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.b = paramLong;
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int d()
  {
    return this.a;
  }
  
  public long e()
  {
    return this.b;
  }
  
  public int f()
  {
    return this.c;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/l.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */