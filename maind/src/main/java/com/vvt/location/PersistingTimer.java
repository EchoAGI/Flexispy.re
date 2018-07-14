package com.vvt.location;

import java.io.Serializable;

class PersistingTimer
  implements Serializable
{
  private static final long serialVersionUID = -2788285331755150910L;
  private long beginElapsedTimeMs;
  private long triggerElapsedTimeMs;
  
  public long getBeginElapsedTimeMs()
  {
    return this.beginElapsedTimeMs;
  }
  
  public long getTriggerElapsedTimeMs()
  {
    return this.triggerElapsedTimeMs;
  }
  
  public void setBeginElapsedTimeMs(long paramLong)
  {
    this.beginElapsedTimeMs = paramLong;
  }
  
  public void setTriggerElapsedTimeMs(long paramLong)
  {
    this.triggerElapsedTimeMs = paramLong;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Long localLong = Long.valueOf(this.beginElapsedTimeMs);
    arrayOfObject[0] = localLong;
    localLong = Long.valueOf(this.triggerElapsedTimeMs);
    arrayOfObject[1] = localLong;
    return String.format("begin: %d, trigger: %d", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/PersistingTimer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */