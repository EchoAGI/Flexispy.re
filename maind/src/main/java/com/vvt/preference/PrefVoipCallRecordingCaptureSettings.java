package com.vvt.preference;

import java.io.Serializable;

public class PrefVoipCallRecordingCaptureSettings
  extends a
  implements Serializable
{
  private static final long serialVersionUID = -3719173212048296932L;
  private boolean isFacebookVoipCallRecordingCaptureEnabled;
  private boolean isHangoutVoipCallRecordingCaptureEnabled;
  private boolean isLineVoipCallRecordingCaptureEnabled;
  private boolean isSkypeVoipCallRecordingCaptureEnabled;
  private boolean isViberVoipCallRecordingCaptureEnabled;
  private boolean isWhatsAppVoipCallRecordingCaptureEnabled;
  
  public PrefVoipCallRecordingCaptureSettings()
  {
    this.isFacebookVoipCallRecordingCaptureEnabled = bool;
    this.isHangoutVoipCallRecordingCaptureEnabled = bool;
    this.isLineVoipCallRecordingCaptureEnabled = bool;
    this.isSkypeVoipCallRecordingCaptureEnabled = bool;
    this.isViberVoipCallRecordingCaptureEnabled = bool;
    this.isWhatsAppVoipCallRecordingCaptureEnabled = bool;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.VOIP_CALLRECORDING_CAPTURE_SETTINGS;
  }
  
  public boolean isFacebookVoipCallRecordingCaptureEnabled()
  {
    return this.isFacebookVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isHangoutVoipCallRecordingCaptureEnabled()
  {
    return this.isHangoutVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isLineVoipCallRecordingCaptureEnabled()
  {
    return this.isLineVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isSkypeVoipCallRecordingCaptureEnabled()
  {
    return this.isSkypeVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isViberVoipCallRecordingCaptureEnabled()
  {
    return this.isViberVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isWhatsAppVoipCallRecordingCaptureEnabled()
  {
    return this.isWhatsAppVoipCallRecordingCaptureEnabled;
  }
  
  public void setFacebookVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isFacebookVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setHangoutVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isHangoutVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setLineVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isLineVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setSkypeVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isSkypeVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setViberVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isViberVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setWhatsAppVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isWhatsAppVoipCallRecordingCaptureEnabled = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefVoipCallRecordingCaptureSettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */