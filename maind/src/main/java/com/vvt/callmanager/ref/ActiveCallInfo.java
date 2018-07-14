package com.vvt.callmanager.ref;

import java.io.Serializable;

public class ActiveCallInfo
  implements Serializable
{
  private static final long serialVersionUID = -854317671654525879L;
  private boolean isIncoming;
  private String number;
  
  public String getNumber()
  {
    return this.number;
  }
  
  public boolean isIncoming()
  {
    return this.isIncoming;
  }
  
  public void setIncoming(boolean paramBoolean)
  {
    this.isIncoming = paramBoolean;
  }
  
  public void setNumber(String paramString)
  {
    this.number = paramString;
  }
  
  public String toString()
  {
    String str1 = "%s(%s)";
    Object[] arrayOfObject = new Object[2];
    String str2 = null;
    String str3 = this.number;
    arrayOfObject[0] = str3;
    int i = 1;
    boolean bool = this.isIncoming;
    if (bool) {}
    for (str2 = "IN";; str2 = "OUT")
    {
      arrayOfObject[i] = str2;
      return String.format(str1, arrayOfObject);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/ActiveCallInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */