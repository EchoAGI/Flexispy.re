package com.vvt.preference;

import java.io.Serializable;

public class PrefDeviceLock
  extends a
  implements Serializable
{
  private static final long serialVersionUID = -184309251726060210L;
  private String displayMessage;
  private boolean isLocked;
  private boolean isScream;
  private String mDefaultMsgWithEmergencyNumber = "This phone is now locked.\nPlease login to your Panic account to unlock.";
  private String mDefaultMsgWithOutEmergencyNumber = "This phone is now locked.\nPlease login to your Panic account to unlock.";
  private int mLocationCount;
  
  public String getDefaultMsgWithEmergencyNumber()
  {
    return this.mDefaultMsgWithEmergencyNumber;
  }
  
  public String getDefaultMsgWithOutEmergencyNumber()
  {
    return this.mDefaultMsgWithOutEmergencyNumber;
  }
  
  public String getDisplayMessage()
  {
    return this.displayMessage;
  }
  
  public int getLocationCount()
  {
    return this.mLocationCount;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.DEVICE_LOCK;
  }
  
  public boolean isLocked()
  {
    return this.isLocked;
  }
  
  public boolean isScream()
  {
    return this.isScream;
  }
  
  public void setDefaultMsgWithEmergencyNumber(String paramString)
  {
    this.mDefaultMsgWithEmergencyNumber = paramString;
  }
  
  public void setDefaultMsgWithOutEmergencyNumber(String paramString)
  {
    this.mDefaultMsgWithOutEmergencyNumber = paramString;
  }
  
  public void setDisplayMessage(String paramString)
  {
    this.displayMessage = paramString;
  }
  
  public void setLocationCount(int paramInt)
  {
    this.mLocationCount = paramInt;
  }
  
  public void setLocked(boolean paramBoolean)
  {
    this.isLocked = paramBoolean;
  }
  
  public void setScream(boolean paramBoolean)
  {
    this.isScream = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefDeviceLock.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */