package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxIMContactEvent
  extends FxEvent
{
  private String contactDisplayName;
  private String contactId;
  private byte[] contactProfilePicture;
  private String contactProfilePicturePath;
  private String contactStatusMessage;
  private int imServiceId;
  private String ownerId;
  
  public FxIMContactEvent()
  {
    byte[] arrayOfByte = new byte[0];
    setContactProfilePicture(arrayOfByte);
  }
  
  public String getContactDisplayName()
  {
    return this.contactDisplayName;
  }
  
  public String getContactId()
  {
    return this.contactId;
  }
  
  public byte[] getContactProfilePicture()
  {
    return this.contactProfilePicture;
  }
  
  public String getContactProfilePicturePath()
  {
    return this.contactProfilePicturePath;
  }
  
  public String getContactStatusMessage()
  {
    return this.contactStatusMessage;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.IM_CONTACT;
  }
  
  public int getImServiceId()
  {
    return this.imServiceId;
  }
  
  public String getOwnerId()
  {
    return this.ownerId;
  }
  
  public void setContactDisplayName(String paramString)
  {
    this.contactDisplayName = paramString;
  }
  
  public void setContactId(String paramString)
  {
    this.contactId = paramString;
  }
  
  public void setContactProfilePicture(byte[] paramArrayOfByte)
  {
    this.contactProfilePicture = paramArrayOfByte;
  }
  
  public void setContactProfilePicturePath(String paramString)
  {
    this.contactProfilePicturePath = paramString;
  }
  
  public void setContactStatusMessage(String paramString)
  {
    this.contactStatusMessage = paramString;
  }
  
  public void setImServiceId(int paramInt)
  {
    this.imServiceId = paramInt;
  }
  
  public void setOwnerId(String paramString)
  {
    this.ownerId = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append(" FxIMContactEvent {");
    Object localObject1 = localStringBuilder.append(" eventId =");
    long l = super.getEventId();
    ((StringBuilder)localObject1).append(l);
    localObject1 = localStringBuilder.append(" imServiceId =");
    int i = this.imServiceId;
    ((StringBuilder)localObject1).append(i);
    localObject1 = localStringBuilder.append(", ownerId =");
    Object localObject2 = this.ownerId;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", contactId =");
    localObject2 = this.contactId;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", contactDisplayName =");
    localObject2 = this.contactDisplayName;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", contactStatusMessage =");
    localObject2 = this.contactStatusMessage;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = localStringBuilder.append(", contactProfilePicturePath =");
    localObject2 = this.contactProfilePicturePath;
    ((StringBuilder)localObject1).append((String)localObject2);
    localObject1 = this.contactProfilePicture;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append(", contactProfilePicture size =");
      localObject2 = this.contactProfilePicture;
      i = localObject2.length;
      ((StringBuilder)localObject1).append(i);
    }
    for (;;)
    {
      return " }";
      localObject1 = localStringBuilder.append(", contactProfilePicture size =");
      localObject2 = "0";
      ((StringBuilder)localObject1).append((String)localObject2);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxIMContactEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */