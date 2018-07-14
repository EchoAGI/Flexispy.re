package com.vvt.capture.wa.a;

import com.vvt.im.events.info.ICallLogData.Direction;

public abstract class b
{
  protected ICallLogData.Direction a;
  private long b = -1;
  
  public void a(ICallLogData.Direction paramDirection)
  {
    this.a = paramDirection;
  }
  
  public void b(long paramLong)
  {
    this.b = paramLong;
  }
  
  public long h()
  {
    return this.b;
  }
  
  public ICallLogData.Direction i()
  {
    return this.a;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/wa/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */