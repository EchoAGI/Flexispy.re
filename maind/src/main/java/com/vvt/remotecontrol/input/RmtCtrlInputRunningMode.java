package com.vvt.remotecontrol.input;

import com.vvt.base.RunningMode;
import java.io.Serializable;

public class RmtCtrlInputRunningMode
  implements Serializable
{
  private static final long serialVersionUID = -1911685578861733038L;
  private RunningMode mRunningMode;
  
  public RunningMode getRunningMode()
  {
    return this.mRunningMode;
  }
  
  public void setRunningMode(RunningMode paramRunningMode)
  {
    this.mRunningMode = paramRunningMode;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputRunningMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */