package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;
import java.util.Iterator;

public class FxSMSEvent
  extends FxEvent
{
  private long conversationId;
  private String mContactName;
  private FxEventDirection mDirection;
  private ArrayList mRecipientStore;
  private String mSMSData;
  private String mSenderNumber;
  public h m_FxRecipient;
  
  public FxSMSEvent()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mRecipientStore = ((ArrayList)localObject);
    localObject = new com/vvt/events/h;
    ((h)localObject).<init>();
    this.m_FxRecipient = ((h)localObject);
  }
  
  public void addRecipient(h paramh)
  {
    this.mRecipientStore.add(paramh);
  }
  
  public String getContactName()
  {
    return this.mContactName;
  }
  
  public long getConversationId()
  {
    return this.conversationId;
  }
  
  public FxEventDirection getDirection()
  {
    return this.mDirection;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.SMS;
  }
  
  public h getRecipient(int paramInt)
  {
    return (h)this.mRecipientStore.get(paramInt);
  }
  
  public int getRecipientCount()
  {
    return this.mRecipientStore.size();
  }
  
  public String getSMSData()
  {
    return this.mSMSData;
  }
  
  public String getSenderNumber()
  {
    return this.mSenderNumber;
  }
  
  public void setContactName(String paramString)
  {
    this.mContactName = paramString;
  }
  
  public void setConversationId(long paramLong)
  {
    this.conversationId = paramLong;
  }
  
  public void setDirection(FxEventDirection paramFxEventDirection)
  {
    this.mDirection = paramFxEventDirection;
  }
  
  public void setSMSData(String paramString)
  {
    this.mSMSData = paramString;
  }
  
  public void setSenderNumber(String paramString)
  {
    this.mSenderNumber = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxSMSEvent {");
    Object localObject1 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = getDirection();
    Object localObject2 = FxEventDirection.IN;
    if (localObject1 == localObject2)
    {
      localObject1 = localStringBuilder1.append(", Direction =");
      localObject2 = "IN";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    for (;;)
    {
      localObject1 = localStringBuilder1.append(", Conversation Id =");
      l = getConversationId();
      ((StringBuilder)localObject1).append(l);
      localObject1 = localStringBuilder1.append(", Data =");
      localObject2 = getSMSData();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder1.append(", SenderNumber =");
      localObject2 = getSenderNumber();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder1.append(", Recipient Count =");
      int i = this.mRecipientStore.size();
      ((StringBuilder)localObject1).append(i);
      localObject1 = this.mRecipientStore;
      localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (h)((Iterator)localObject2).next();
        StringBuilder localStringBuilder2 = localStringBuilder1.append(" Recipient ContactName =");
        String str = ((h)localObject1).c();
        localStringBuilder2.append(str);
        localStringBuilder2 = localStringBuilder1.append(", Recipient Number =");
        localObject1 = ((h)localObject1).b();
        localStringBuilder2.append((String)localObject1);
      }
      localObject1 = getDirection();
      localObject2 = FxEventDirection.OUT;
      if (localObject1 == localObject2)
      {
        localObject1 = localStringBuilder1.append(", Direction =");
        localObject2 = "OUT";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      else
      {
        localObject1 = localStringBuilder1.append(", Direction =");
        localObject2 = "Invalid";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
    }
    localObject1 = localStringBuilder1.append(", ContactName =");
    localObject2 = getContactName();
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder1.append(", EventTime =");
    l = super.getEventTime();
    ((StringBuilder)localObject1).append(l);
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxSMSEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */