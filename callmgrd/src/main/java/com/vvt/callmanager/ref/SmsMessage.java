package com.vvt.callmanager.ref;

import java.io.Serializable;

public class SmsMessage
  implements Serializable
{
  private static final long serialVersionUID = -9204348876895310181L;
  private String message;
  private String phoneNumber;
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    String str1;
    if (paramObject != null)
    {
      bool = paramObject instanceof SmsMessage;
      if (bool)
      {
        str1 = this.phoneNumber;
        paramObject = (SmsMessage)paramObject;
        String str2 = ((SmsMessage)paramObject).getPhoneNumber();
        bool = str1.equals(str2);
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  public String getMessage()
  {
    return this.message;
  }
  
  public String getPhoneNumber()
  {
    return this.phoneNumber;
  }
  
  public int hashCode()
  {
    String str = this.phoneNumber;
    int i;
    if (str == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return i;
      str = this.phoneNumber;
      i = str.hashCode();
    }
  }
  
  public void setMessage(String paramString)
  {
    this.message = paramString;
  }
  
  public void setPhoneNumber(String paramString)
  {
    this.phoneNumber = paramString;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    String str = this.phoneNumber;
    arrayOfObject[0] = str;
    str = this.message;
    arrayOfObject[1] = str;
    return String.format("phoneNumber=%s, message=%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/ref/SmsMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */