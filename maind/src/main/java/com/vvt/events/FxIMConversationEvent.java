package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.Arrays;
import java.util.HashSet;

public class FxIMConversationEvent
  extends FxEvent
{
  private String conversationId;
  private byte[] conversationProfilePicture;
  private String conversationProfilePicturePath;
  private String conversationStatusMessage;
  private String conversationTitle;
  private int imServiceId;
  private String ownerId;
  private HashSet participantContactIds;
  
  public FxIMConversationEvent()
  {
    byte[] arrayOfByte = new byte[0];
    setConversationProfilePicture(arrayOfByte);
  }
  
  public String getConversationId()
  {
    return this.conversationId;
  }
  
  public byte[] getConversationProfilePicture()
  {
    return this.conversationProfilePicture;
  }
  
  public String getConversationProfilePicturePath()
  {
    return this.conversationProfilePicturePath;
  }
  
  public String getConversationStatusMessage()
  {
    return this.conversationStatusMessage;
  }
  
  public String getConversationTitle()
  {
    return this.conversationTitle;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.IM_CONVERSATION;
  }
  
  public int getImServiceId()
  {
    return this.imServiceId;
  }
  
  public String getOwnerId()
  {
    return this.ownerId;
  }
  
  public HashSet getParticipantContactIds()
  {
    return this.participantContactIds;
  }
  
  public void setConversationId(String paramString)
  {
    this.conversationId = paramString;
  }
  
  public void setConversationProfilePicture(byte[] paramArrayOfByte)
  {
    this.conversationProfilePicture = paramArrayOfByte;
  }
  
  public void setConversationProfilePicturePath(String paramString)
  {
    this.conversationProfilePicturePath = paramString;
  }
  
  public void setConversationStatusMessage(String paramString)
  {
    this.conversationStatusMessage = paramString;
  }
  
  public void setConversationTitle(String paramString)
  {
    this.conversationTitle = paramString;
  }
  
  public void setImServiceId(int paramInt)
  {
    this.imServiceId = paramInt;
  }
  
  public void setOwnerId(String paramString)
  {
    this.ownerId = paramString;
  }
  
  public void setParticipantContactIds(HashSet paramHashSet)
  {
    this.participantContactIds = paramHashSet;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(" FxIMConversationEvent {");
    Object localObject1 = localStringBuilder.append(" eventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder.append(" imServiceId =");
    int i = this.imServiceId;
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder.append(", ownerId =");
    Object localObject2 = this.ownerId;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", conversationId =");
    localObject2 = this.conversationId;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", participantContactIds =");
    localObject2 = Arrays.toString(this.participantContactIds.toArray());
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.conversationProfilePicture;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(", conversationProfilePicture size =");
      localObject2 = this.conversationProfilePicture;
      i = localObject2.length;
      ((StringBuilder)localObject1).append(i);
    }
    for (;;)
    {
      localObject1 = localStringBuilder.append(", conversationProfilePicturePath =");
      localObject2 = this.conversationProfilePicturePath;
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder.append(", conversationTitle =");
      localObject2 = this.conversationTitle;
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = localStringBuilder.append(", conversationStatusMessage =");
      localObject2 = this.conversationStatusMessage;
      ((StringBuilder)localObject1).append((String)localObject2);
      return " }";
      localObject1 = localStringBuilder.append(", conversationProfilePicture size =");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxIMConversationEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */