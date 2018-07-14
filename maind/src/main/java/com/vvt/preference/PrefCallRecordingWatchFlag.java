package com.vvt.preference;

import java.io.Serializable;

public class PrefCallRecordingWatchFlag
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 7806410793432491802L;
  private int mCallRecWatchFlag;
  
  public int getCallRecWatchFlag()
  {
    return this.mCallRecWatchFlag;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.CALL_RECORDING_WATCH_FLAG;
  }
  
  public void setCallRecWatchFlag(int paramInt)
  {
    this.mCallRecWatchFlag = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefCallRecordingWatchFlag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */