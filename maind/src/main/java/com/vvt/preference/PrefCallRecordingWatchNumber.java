package com.vvt.preference;

import java.io.Serializable;

public class PrefCallRecordingWatchNumber
  extends FxPrefCommonList
  implements Serializable
{
  private static final long serialVersionUID = -6680415416121990654L;
  
  public int getMaxCapacity()
  {
    return 5;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.CALL_RECORDING_WATCH_NUMBER;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefCallRecordingWatchNumber.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */