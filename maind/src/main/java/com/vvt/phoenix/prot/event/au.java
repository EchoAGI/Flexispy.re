package com.vvt.phoenix.prot.event;

import java.util.ArrayList;

public class au
  extends r
{
  private VoipCategory a;
  private int b;
  private long c;
  private String d;
  private String e;
  private VoipCallLogEvent.IsMonitor f;
  private ArrayList g;
  private String h;
  private int i;
  private String j;
  
  public au()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.g = localArrayList;
  }
  
  public int a()
  {
    return 64;
  }
  
  public void a(int paramInt)
  {
    this.b = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.c = paramLong;
  }
  
  public void a(VoipCallLogEvent.IsMonitor paramIsMonitor)
  {
    this.f = paramIsMonitor;
  }
  
  public void a(VoipCategory paramVoipCategory)
  {
    this.a = paramVoipCategory;
  }
  
  public void a(am paramam)
  {
    this.g.add(paramam);
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public VoipCategory b()
  {
    return this.a;
  }
  
  public am b(int paramInt)
  {
    return (am)this.g.get(paramInt);
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void c(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void c(String paramString)
  {
    this.h = paramString;
  }
  
  public long d()
  {
    return this.c;
  }
  
  public void d(String paramString)
  {
    this.j = paramString;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public String f()
  {
    return this.e;
  }
  
  public VoipCallLogEvent.IsMonitor g()
  {
    return this.f;
  }
  
  public int h()
  {
    return this.g.size();
  }
  
  public String i()
  {
    return this.h;
  }
  
  public int l()
  {
    return this.i;
  }
  
  public String m()
  {
    return this.j;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/au.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */