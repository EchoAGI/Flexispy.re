package com.vvt.capture.e.a;

import com.vvt.im.events.info.ICallLogData.Direction;

public abstract class b
{
  protected long a = -1;
  protected ICallLogData.Direction b;
  
  public void a(ICallLogData.Direction paramDirection)
  {
    this.b = paramDirection;
  }
  
  public void b(long paramLong)
  {
    this.a = paramLong;
  }
  
  public long h()
  {
    return this.a;
  }
  
  public ICallLogData.Direction i()
  {
    return this.b;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/e/a/removeFromPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */