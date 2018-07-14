package com.fx.psysd.ref.command;

import java.io.Serializable;

public class SendSmsMetadata
  implements Serializable
{
  private static final long serialVersionUID = 1420934392857511146L;
  private String mMessage;
  private String mRecipientNumber;
  
  public SendSmsMetadata(String paramString1, String paramString2)
  {
    this.mMessage = paramString2;
    this.mRecipientNumber = paramString1;
  }
  
  public String getMessage()
  {
    return this.mMessage;
  }
  
  public String getRecipientNumber()
  {
    return this.mRecipientNumber;
  }
  
  public void setMessage(String paramString)
  {
    this.mMessage = paramString;
  }
  
  public void setRecipientNumber(String paramString)
  {
    this.mRecipientNumber = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/psysd/ref/command/SendSmsMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */