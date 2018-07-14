package com.vvt.preference;

import java.io.Serializable;

public class PrefCallRecordingAudioSource
  extends a
  implements Serializable
{
  private static final long serialVersionUID = -6206474236309310100L;
  private int mAudioSource = 1;
  
  public int getAudioSource()
  {
    return this.mAudioSource;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.CALL_RECORDING_AUDIO_SOURCE;
  }
  
  public void setAudioSource(int paramInt)
  {
    this.mAudioSource = paramInt;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefCallRecordingAudioSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */