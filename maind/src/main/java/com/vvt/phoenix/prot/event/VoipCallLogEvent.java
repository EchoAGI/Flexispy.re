package com.vvt.phoenix.prot.event;

public class VoipCallLogEvent
  extends r
{
  private VoipCategory a;
  private int b;
  private long c;
  private String d;
  private String e;
  private long f;
  private VoipCallLogEvent.IsMonitor g;
  private long h;
  
  public int a()
  {
    return 51;
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
    this.g = paramIsMonitor;
  }
  
  public void a(VoipCategory paramVoipCategory)
  {
    this.a = paramVoipCategory;
  }
  
  public void a(String paramString)
  {
    this.d = paramString;
  }
  
  public VoipCategory b()
  {
    return this.a;
  }
  
  public void b(long paramLong)
  {
    this.f = paramLong;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void c(long paramLong)
  {
    this.h = paramLong;
  }
  
  public long d()
  {
    return this.c;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public String f()
  {
    return this.e;
  }
  
  public long g()
  {
    return this.f;
  }
  
  public VoipCallLogEvent.IsMonitor h()
  {
    return this.g;
  }
  
  public long i()
  {
    return this.h;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/VoipCallLogEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */