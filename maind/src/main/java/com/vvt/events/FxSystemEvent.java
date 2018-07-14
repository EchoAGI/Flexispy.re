package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxSystemEvent
  extends FxEvent
{
  private FxEventDirection direction;
  private FxSystemEventCategories logType;
  private String message;
  
  public FxEventDirection getDirection()
  {
    return this.direction;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.SYSTEM;
  }
  
  public FxSystemEventCategories getLogType()
  {
    return this.logType;
  }
  
  public String getMessage()
  {
    return this.message;
  }
  
  public void setDirection(FxEventDirection paramFxEventDirection)
  {
    this.direction = paramFxEventDirection;
  }
  
  public void setLogType(FxSystemEventCategories paramFxSystemEventCategories)
  {
    this.logType = paramFxSystemEventCategories;
  }
  
  public void setMessage(String paramString)
  {
    this.message = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("FxSystemEvent {");
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
      localObject1 = localStringBuilder.append(", logType =");
      localObject2 = getLogType();
      ((StringBuilder)localObject1).append(localObject2);
      localObject1 = localStringBuilder.append(", message =");
      localObject2 = getMessage();
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxSystemEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */