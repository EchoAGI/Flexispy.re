package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxVoipCallLogEvent
  extends FxEvent
{
  private String mContactName;
  private FxEventDirection mDirection;
  private long mDuration;
  private long mFrameStripId;
  private FxVoipCallLogEvent.FxIsMonitor mIsMonitor;
  private long mTransferredBytes;
  private String mUserId;
  private FxVoipCategory mVoipCategory;
  
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
    return FxEventType.VOIP_CALL_LOG;
  }
  
  public long getFrameStripId()
  {
    return this.mFrameStripId;
  }
  
  public FxVoipCallLogEvent.FxIsMonitor getIsMonitor()
  {
    return this.mIsMonitor;
  }
  
  public long getTransferredBytes()
  {
    return this.mTransferredBytes;
  }
  
  public String getUserId()
  {
    return this.mUserId;
  }
  
  public FxVoipCategory getVoipCategory()
  {
    return this.mVoipCategory;
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
  
  public void setFrameStripId(long paramLong)
  {
    this.mFrameStripId = paramLong;
  }
  
  public void setIsMonitor(FxVoipCallLogEvent.FxIsMonitor paramFxIsMonitor)
  {
    this.mIsMonitor = paramFxIsMonitor;
  }
  
  public void setTransferredBytes(long paramLong)
  {
    this.mTransferredBytes = paramLong;
  }
  
  public void setUserId(String paramString)
  {
    this.mUserId = paramString;
  }
  
  public void setVoipCategory(FxVoipCategory paramFxVoipCategory)
  {
    this.mVoipCategory = paramFxVoipCategory;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("FxVoipCallLogEvent {");
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxVoipCallLogEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */