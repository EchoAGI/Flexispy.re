package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;
import java.util.Iterator;

public class FxMMSEvent
  extends FxEvent
{
  public a m_Attachment;
  private ArrayList m_AttachmentStore;
  private String m_Body;
  private String m_ContactName;
  private long m_ConversationId;
  private FxEventDirection m_Direction;
  private ArrayList m_RecipientStore;
  private String m_SenderNumber;
  private String m_Subject;
  
  public FxMMSEvent()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.m_AttachmentStore = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.m_RecipientStore = localArrayList;
  }
  
  public void addAttachment(a parama)
  {
    this.m_AttachmentStore.add(parama);
  }
  
  public void addRecipient(h paramh)
  {
    this.m_RecipientStore.add(paramh);
  }
  
  public a getAttachment(int paramInt)
  {
    return (a)this.m_AttachmentStore.get(paramInt);
  }
  
  public int getAttachmentCount()
  {
    return this.m_AttachmentStore.size();
  }
  
  public String getBody()
  {
    return this.m_Body;
  }
  
  public String getContactName()
  {
    return this.m_ContactName;
  }
  
  public long getConversationId()
  {
    return this.m_ConversationId;
  }
  
  public FxEventDirection getDirection()
  {
    return this.m_Direction;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.MMS;
  }
  
  public h getRecipient(int paramInt)
  {
    return (h)this.m_RecipientStore.get(paramInt);
  }
  
  public int getRecipientCount()
  {
    return this.m_RecipientStore.size();
  }
  
  public String getSenderNumber()
  {
    return this.m_SenderNumber;
  }
  
  public String getSubject()
  {
    return this.m_Subject;
  }
  
  public int getSubjectLength()
  {
    return this.m_Subject.length();
  }
  
  public void setBody(String paramString)
  {
    this.m_Body = paramString;
  }
  
  public void setContactName(String paramString)
  {
    this.m_ContactName = paramString;
  }
  
  public void setConversationId(long paramLong)
  {
    this.m_ConversationId = paramLong;
  }
  
  public void setDirection(FxEventDirection paramFxEventDirection)
  {
    this.m_Direction = paramFxEventDirection;
  }
  
  public void setSenderNumber(String paramString)
  {
    this.m_SenderNumber = paramString;
  }
  
  public void setSubject(String paramString)
  {
    this.m_Subject = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("FxMMSEvent {");
    Object localObject1 = localStringBuilder1.append(" EventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder1.append(" ConversationId =");
    l = getConversationId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = getDirection();
    Object localObject2 = FxEventDirection.IN;
    if (localObject1 == localObject2)
    {
      localObject1 = localStringBuilder1.append(", Direction =");
      localObject2 = "IN";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    boolean bool;
    StringBuilder localStringBuilder2;
    String str;
    for (;;)
    {
      localObject1 = localStringBuilder1.append(", SenderNumber =");
      localObject2 = getSenderNumber();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder1.append(", Subject =");
      localObject2 = getSubject();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder1.append(", Body =");
      localObject2 = getBody();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder1.append(", Recipient Count =");
      i = this.m_RecipientStore.size();
      ((StringBuilder)localObject1).append(i);
      localObject1 = this.m_RecipientStore;
      localObject2 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (h)((Iterator)localObject2).next();
        localStringBuilder2 = localStringBuilder1.append(" Recipient ContactName =");
        str = ((h)localObject1).c();
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
    localObject1 = localStringBuilder1.append(", Attachment Count =");
    int i = this.m_AttachmentStore.size();
    ((StringBuilder)localObject1).append(i);
    localObject1 = this.m_AttachmentStore;
    localObject2 = ((ArrayList)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (a)((Iterator)localObject2).next();
      localStringBuilder2 = localStringBuilder1.append(", Recipient Attachment FullName =");
      str = ((a)localObject1).a();
      localStringBuilder2.append(str);
      localStringBuilder2 = localStringBuilder1.append(", Recipient Attachment FilePath =");
      localObject1 = ((a)localObject1).b();
      localStringBuilder2.append((String)localObject1);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxMMSEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */