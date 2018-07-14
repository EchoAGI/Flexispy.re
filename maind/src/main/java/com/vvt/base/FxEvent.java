package com.vvt.base;

import java.io.Serializable;

public abstract class FxEvent
  implements Serializable
{
  private static final long serialVersionUID = 4834580121886634517L;
  private long mEventId;
  private long mEventTime;
  
  public long getEventId()
  {
    return this.mEventId;
  }
  
  public long getEventTime()
  {
    return this.mEventTime;
  }
  
  public abstract FxEventType getEventType();
  
  public void setEventId(long paramLong)
  {
    this.mEventId = paramLong;
  }
  
  public void setEventTime(long paramLong)
  {
    this.mEventTime = paramLong;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/FxEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */