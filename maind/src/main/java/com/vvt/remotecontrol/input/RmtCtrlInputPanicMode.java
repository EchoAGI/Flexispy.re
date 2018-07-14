package com.vvt.remotecontrol.input;

import java.io.Serializable;

public class RmtCtrlInputPanicMode
  implements Serializable
{
  private static final long serialVersionUID = 2955122944404183351L;
  private RmtCtrlInputPanicMode.Mode mode;
  
  public RmtCtrlInputPanicMode.Mode getMode()
  {
    return this.mode;
  }
  
  public void setMode(RmtCtrlInputPanicMode.Mode paramMode)
  {
    this.mode = paramMode;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputPanicMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */