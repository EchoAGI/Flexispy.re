package com.vvt.remotecontrol.input;

import java.io.Serializable;

public class RmtCtrlInputUpdateAvailableSilentMode
  implements Serializable
{
  private static final long serialVersionUID = 2603296414346690382L;
  private String mVersionNumber;
  
  public String getVersionNumber()
  {
    return this.mVersionNumber;
  }
  
  public void setVersionNumber(String paramString)
  {
    this.mVersionNumber = paramString;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputUpdateAvailableSilentMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */