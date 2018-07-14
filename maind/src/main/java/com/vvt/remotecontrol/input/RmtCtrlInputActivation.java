package com.vvt.remotecontrol.input;

import java.io.Serializable;

public class RmtCtrlInputActivation
  implements Serializable
{
  private static final long serialVersionUID = 5760110239424285359L;
  private String activationCode;
  private String url;
  
  public String getActivationCode()
  {
    return this.activationCode;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public void setActivationCode(String paramString)
  {
    this.activationCode = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputActivation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */