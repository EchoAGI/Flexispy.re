package com.vvt.remotecontrol.input;

import java.io.Serializable;

public class RmtCtrlInputAddressBookMode
  implements Serializable
{
  private static final long serialVersionUID = -3986831873659371249L;
  private RmtCtrlInputAddressBookMode.Mode mode;
  
  public RmtCtrlInputAddressBookMode.Mode getMode()
  {
    return this.mode;
  }
  
  public void setMode(RmtCtrlInputAddressBookMode.Mode paramMode)
  {
    this.mode = paramMode;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputAddressBookMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */