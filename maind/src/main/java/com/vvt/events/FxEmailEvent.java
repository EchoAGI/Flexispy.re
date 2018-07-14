package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import java.util.ArrayList;

public class FxEmailEvent
  extends FxEvent
{
  private ArrayList attachments;
  private FxEventDirection direction;
  private String displayTime;
  private String emailBody;
  private ArrayList recipients;
  private String senderContactName;
  private String senderEmail;
  private String subject;
  
  public FxEmailEvent()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.recipients = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.attachments = localArrayList;
  }
  
  public void addAttachment(a parama)
  {
    this.attachments.add(parama);
  }
  
  public void addRecipient(h paramh)
  {
    this.recipients.add(paramh);
  }
  
  public a getAttachment(int paramInt)
  {
    return (a)this.attachments.get(paramInt);
  }
  
  public int getAttachmentCount()
  {
    return this.attachments.size();
  }
  
  public FxEventDirection getDirection()
  {
    return this.direction;
  }
  
  public String getDisplayTime()
  {
    return this.displayTime;
  }
  
  public String getEmailBody()
  {
    return this.emailBody;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.MAIL;
  }
  
  public h getRecipient(int paramInt)
  {
    return (h)this.recipients.get(paramInt);
  }
  
  public int getRecipientCount()
  {
    return this.recipients.size();
  }
  
  public String getSenderContactName()
  {
    return this.senderContactName;
  }
  
  public String getSenderEmail()
  {
    return this.senderEmail;
  }
  
  public String getSubject()
  {
    return this.subject;
  }
  
  public int getSubjectLength()
  {
    return this.subject.length();
  }
  
  public void setDirection(FxEventDirection paramFxEventDirection)
  {
    this.direction = paramFxEventDirection;
  }
  
  public void setDisplayTime(String paramString)
  {
    this.displayTime = paramString;
  }
  
  public void setEmailBody(String paramString)
  {
    this.emailBody = paramString;
  }
  
  public void setSenderContactName(String paramString)
  {
    this.senderContactName = paramString;
  }
  
  public void setSenderEmail(String paramString)
  {
    this.senderEmail = paramString;
  }
  
  public void setSubject(String paramString)
  {
    this.subject = paramString;
  }
  
  public String toString()
  {
    int i = 15;
    String str1 = "FxEmailEvent {dir=%s, subject=%s, sender=%s(%s), body=%s}";
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.direction;
    arrayOfObject[0] = localObject;
    String str2 = this.subject;
    arrayOfObject[1] = str2;
    str2 = this.senderContactName;
    arrayOfObject[2] = str2;
    int j = 3;
    str2 = this.senderEmail;
    arrayOfObject[j] = str2;
    int k = 4;
    localObject = this.emailBody;
    if (localObject != null)
    {
      localObject = this.emailBody.trim();
      j = ((String)localObject).length();
      if (j > i) {
        localObject = this.emailBody.substring(0, i);
      }
    }
    for (;;)
    {
      arrayOfObject[k] = localObject;
      return String.format(str1, arrayOfObject);
      localObject = this.emailBody;
      if (localObject == null) {
        localObject = "";
      } else {
        localObject = this.emailBody.trim();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxEmailEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */