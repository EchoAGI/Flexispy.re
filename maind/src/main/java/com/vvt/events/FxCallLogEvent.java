package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxCallLogEvent
  extends FxEvent
{
  private String mContactName;
  private FxEventDirection mDirection;
  private long mDuration;
  private String mNumber;
  
  public String getContactName()
  {
    return this.mContactName;
  }
  
  public FxEventDirection getDirection()
  {
    return this.mDirection;
  }
  
  public long getDuration()
  {
    return this.mDuration;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.CALL_LOG;
  }
  
  public String getNubmer()
  {
    return this.mNumber;
  }
  
  public void setContactName(String paramString)
  {
    this.mContactName = paramString;
  }
  
  public void setDirection(FxEventDirection paramFxEventDirection)
  {
    this.mDirection = paramFxEventDirection;
  }
  
  public void setDuration(long paramLong)
  {
    this.mDuration = paramLong;
  }
  
  public void setNumber(String paramString)
  {
    this.mNumber = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("FxCallLogEvent {");
    Object localObject1 = localStringBuilder.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = getDirection();
    Object localObject2 = FxEventDirection.IN;
    if (localObject1 == localObject2)
    {
      localObject1 = localStringBuilder.append(", Direction =");
      localObject2 = "IN";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    for (;;)
    {
      localObject1 = localStringBuilder.append(", Duration =");
      l = getDuration();
      ((StringBuilder)localObject1).append(l);
      localObject1 = localStringBuilder.append(", Nubmer =");
      localObject2 = getNubmer();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder.append(", ContactName =");
      localObject2 = getContactName();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder.append(", EventTime =");
      l = super.getEventTime();
      ((StringBuilder)localObject1).append(l);
      return " }";
      localObject1 = getDirection();
      localObject2 = FxEventDirection.OUT;
      if (localObject1 == localObject2)
      {
        localObject1 = localStringBuilder.append(", Direction =");
        localObject2 = "OUT";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      else
      {
        localObject1 = getDirection();
        localObject2 = FxEventDirection.MISSED_CALL;
        if (localObject1 == localObject2)
        {
          localObject1 = localStringBuilder.append(", Direction =");
          localObject2 = "MISSED CALL";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
        else
        {
          localObject1 = localStringBuilder.append(", Direction =");
          localObject2 = "Invalid";
          ((StringBuilder)localObject1).append((String)localObject2);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxCallLogEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */