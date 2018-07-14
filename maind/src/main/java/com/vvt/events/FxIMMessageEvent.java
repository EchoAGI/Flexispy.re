package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FxIMMessageEvent
  extends FxEvent
{
  private List attachments;
  private String conversationId;
  private FxEventDirection direction;
  private int imServiceId;
  private String message;
  private e messageLocation;
  private String senderId;
  private e shareLocation;
  private int textRepresentation;
  
  public FxIMMessageEvent()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.attachments = localArrayList;
  }
  
  public void addAttachment(d paramd)
  {
    this.attachments.add(paramd);
  }
  
  public d getAttachment(int paramInt)
  {
    return (d)this.attachments.get(paramInt);
  }
  
  public int getAttachmentCount()
  {
    List localList = this.attachments;
    int i;
    if (localList != null)
    {
      localList = this.attachments;
      i = localList.size();
    }
    for (;;)
    {
      return i;
      i = 0;
      localList = null;
    }
  }
  
  public List getAttachments()
  {
    return this.attachments;
  }
  
  public String getConversationId()
  {
    return this.conversationId;
  }
  
  public FxEventDirection getDirection()
  {
    return this.direction;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.IM_MESSAGE;
  }
  
  public int getImServiceId()
  {
    return this.imServiceId;
  }
  
  public String getMessage()
  {
    return this.message;
  }
  
  public e getMessageLocation()
  {
    return this.messageLocation;
  }
  
  public String getSenderId()
  {
    return this.senderId;
  }
  
  public e getShareLocation()
  {
    return this.shareLocation;
  }
  
  public int getTextRepresentation()
  {
    return this.textRepresentation;
  }
  
  public void setConversationId(String paramString)
  {
    this.conversationId = paramString;
  }
  
  public void setDirection(FxEventDirection paramFxEventDirection)
  {
    this.direction = paramFxEventDirection;
  }
  
  public void setImServiceId(int paramInt)
  {
    this.imServiceId = paramInt;
  }
  
  public void setMessage(String paramString)
  {
    this.message = paramString;
  }
  
  public void setMessageLocation(e parame)
  {
    this.messageLocation = parame;
  }
  
  public void setSenderId(String paramString)
  {
    this.senderId = paramString;
  }
  
  public void setShareLocation(e parame)
  {
    this.shareLocation = parame;
  }
  
  public void setTextRepresentation(int paramInt)
  {
    this.textRepresentation = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(" FxIMMessageEvent {");
    Object localObject1 = localStringBuilder.append(" eventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder.append(" imServiceId =");
    int i = this.imServiceId;
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder.append(", direction =");
    Object localObject2 = this.direction;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = localStringBuilder.append(", conversationId =");
    localObject2 = this.conversationId;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", senderId =");
    localObject2 = this.senderId;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", messageLocation = ");
    localObject2 = this.messageLocation;
    ((StringBuilder)localObject1).append(localObject2);
    localObject1 = localStringBuilder.append(", textRepresentation =");
    i = this.textRepresentation;
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder.append(", message =");
    localObject2 = this.message;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.attachments;
    int j = ((List)localObject1).size();
    if (j > 0)
    {
      localStringBuilder.append(", attachments = { ");
      localObject1 = this.attachments;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (d)((Iterator)localObject2).next();
        localObject1 = localStringBuilder.append(localObject1);
        String str = ",";
        ((StringBuilder)localObject1).append(str);
      }
      localObject1 = "} ";
      localStringBuilder.append((String)localObject1);
    }
    localObject1 = this.shareLocation;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(", shareLocation  =");
      localObject2 = this.shareLocation;
      ((StringBuilder)localObject1).append(localObject2);
    }
    return " }";
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxIMMessageEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */