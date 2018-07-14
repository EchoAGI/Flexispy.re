package com.vvt.capture.b;

import com.vvt.im.events.info.ICallLogData.Direction;

public abstract class c
{
  protected String a = "";
  protected ICallLogData.Direction b;
  private String c = "";
  private long d = -1;
  
  public void a(ICallLogData.Direction paramDirection)
  {
    this.b = paramDirection;
  }
  
  public void b(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public void d(String paramString)
  {
    this.a = paramString;
  }
  
  public String g()
  {
    return this.c;
  }
  
  public long h()
  {
    return this.d;
  }
  
  public ICallLogData.Direction i()
  {
    return this.b;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/removeFromPath/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */