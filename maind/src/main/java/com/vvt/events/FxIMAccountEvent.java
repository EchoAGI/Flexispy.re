package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxIMAccountEvent
  extends FxEvent
{
  private int imServiceId;
  private String ownerDisplayName;
  private String ownerId;
  private byte[] ownerProfilePicture;
  private String ownerProfilePicturePath;
  private String ownerStatusMessage;
  
  public FxIMAccountEvent()
  {
    byte[] arrayOfByte = new byte[0];
    this.ownerProfilePicture = arrayOfByte;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.IM_ACCOUNT;
  }
  
  public int getImServiceId()
  {
    return this.imServiceId;
  }
  
  public String getOwnerDisplayName()
  {
    return this.ownerDisplayName;
  }
  
  public String getOwnerId()
  {
    return this.ownerId;
  }
  
  public byte[] getOwnerProfilePicture()
  {
    return this.ownerProfilePicture;
  }
  
  public String getOwnerProfilePicturePath()
  {
    return this.ownerProfilePicturePath;
  }
  
  public String getOwnerStatusMessage()
  {
    return this.ownerStatusMessage;
  }
  
  public void setImServiceId(int paramInt)
  {
    this.imServiceId = paramInt;
  }
  
  public void setOwnerDisplayName(String paramString)
  {
    this.ownerDisplayName = paramString;
  }
  
  public void setOwnerId(String paramString)
  {
    this.ownerId = paramString;
  }
  
  public void setOwnerProfilePicture(byte[] paramArrayOfByte)
  {
    this.ownerProfilePicture = paramArrayOfByte;
  }
  
  public void setOwnerProfilePicturePath(String paramString)
  {
    this.ownerProfilePicturePath = paramString;
  }
  
  public void setOwnerStatusMessage(String paramString)
  {
    this.ownerStatusMessage = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(" FxIMAccountEvent {");
    Object localObject1 = localStringBuilder.append(" eventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder.append(" imServiceId =");
    int i = this.imServiceId;
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder.append(", ownerDisplayName =");
    Object localObject2 = this.ownerDisplayName;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", ownerStatusMessage =");
    localObject2 = this.ownerStatusMessage;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", ownerProfilePicturePath =");
    localObject2 = this.ownerProfilePicturePath;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.ownerProfilePicture;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(", ownerProfilePicture size =");
      localObject2 = this.ownerProfilePicture;
      i = localObject2.length;
      ((StringBuilder)localObject1).append(i);
    }
    for (;;)
    {
      return " }";
      localObject1 = localStringBuilder.append(", ownerProfilePicture size =");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxIMAccountEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */