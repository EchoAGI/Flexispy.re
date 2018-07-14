package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;

public class FxIMEvent
  extends FxEvent
{
  private FxEventDirection mEventDirection;
  private String mImServiceId;
  private String mMessage;
  private ArrayList mParticipantList;
  private String mUserDisplayName;
  private String mUserId;
  
  public FxIMEvent()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mParticipantList = localArrayList;
  }
  
  public void addParticipant(g paramg)
  {
    this.mParticipantList.add(paramg);
  }
  
  public FxEventDirection getEventDirection()
  {
    return this.mEventDirection;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.IM;
  }
  
  public String getImServiceId()
  {
    return this.mImServiceId;
  }
  
  public String getMessage()
  {
    return this.mMessage;
  }
  
  public g getParticipant(int paramInt)
  {
    return (g)this.mParticipantList.get(paramInt);
  }
  
  public int getParticipantCount()
  {
    ArrayList localArrayList = this.mParticipantList;
    int i;
    if (localArrayList != null)
    {
      localArrayList = this.mParticipantList;
      i = localArrayList.size();
    }
    for (;;)
    {
      return i;
      i = 0;
      localArrayList = null;
    }
  }
  
  public String getUserDisplayName()
  {
    return this.mUserDisplayName;
  }
  
  public String getUserId()
  {
    return this.mUserId;
  }
  
  public void setEventDirection(FxEventDirection paramFxEventDirection)
  {
    this.mEventDirection = paramFxEventDirection;
  }
  
  public void setImServiceId(String paramString)
  {
    this.mImServiceId = paramString;
  }
  
  public void setMessage(String paramString)
  {
    this.mMessage = paramString;
  }
  
  public void setUserDisplayName(String paramString)
  {
    this.mUserDisplayName = paramString;
  }
  
  public void setUserId(String paramString)
  {
    this.mUserId = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxIMEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */