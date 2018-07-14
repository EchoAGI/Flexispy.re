package com.fx.pmond.ref.command;

import java.io.Serializable;

public class RemoteMonitorMaind$MonitorData
  implements Serializable
{
  private static final long serialVersionUID = -6606725226862375560L;
  private boolean mIsEnabled;
  
  public boolean isEnabled()
  {
    return this.mIsEnabled;
  }
  
  public void setEnable(boolean paramBoolean)
  {
    this.mIsEnabled = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/fx/pmond/ref/command/RemoteMonitorMaind$MonitorData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */