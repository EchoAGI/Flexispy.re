package com.vvt.remotecontrol.output;

public class RmtCtrlOutputEnableCallRecording
  extends RmtCtrlOutputStatusMessage
{
  private static final long serialVersionUID = 1398171503692492408L;
  private boolean mIsWarning;
  
  public boolean isWarning()
  {
    return this.mIsWarning;
  }
  
  public void setWarning(boolean paramBoolean)
  {
    this.mIsWarning = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputEnableCallRecording.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */