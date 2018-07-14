package com.vvt.remotecontrol.output;

import java.io.Serializable;

public class RmtCtrlOutputRequestBatteryInfo
  implements Serializable
{
  private static final long serialVersionUID = -7167077178948148729L;
  private int mBatteryLevel;
  
  public int getCurrentBatteryLevel()
  {
    return this.mBatteryLevel;
  }
  
  public void setCurrentBatteryLevel(int paramInt)
  {
    this.mBatteryLevel = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputRequestBatteryInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */