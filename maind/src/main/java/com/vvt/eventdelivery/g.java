package com.vvt.eventdelivery;

import com.vvt.base.FxEvent;
import com.vvt.base.FxEventType;
import com.vvt.events.FxAlertGpsEvent;
import com.vvt.events.FxAppType;
import com.vvt.events.FxApplicationEvent;
import com.vvt.events.FxAudioAmbientEvent;
import com.vvt.events.FxAudioConversationEvent;
import com.vvt.events.FxAudioConversationThumbnailEvent;
import com.vvt.events.FxAudioFileEvent;
import com.vvt.events.FxAudioFileThumnailEvent;
import com.vvt.events.FxBrowserUrlEvent;
import com.vvt.events.FxCallLogEvent;
import com.vvt.events.FxCameraImageEvent;
import com.vvt.events.FxCameraImageThumbnailEvent;
import com.vvt.events.FxEmailEvent;
import com.vvt.events.FxEventDirection;
import com.vvt.events.FxIMAccountEvent;
import com.vvt.events.FxIMContactEvent;
import com.vvt.events.FxIMConversationEvent;
import com.vvt.events.FxIMEvent;
import com.vvt.events.FxIMMessageEvent;
import com.vvt.events.FxLocationCallingModule;
import com.vvt.events.FxLocationEvent;
import com.vvt.events.FxLocationMapProvider;
import com.vvt.events.FxLocationMethod;
import com.vvt.events.FxMMSEvent;
import com.vvt.events.FxMediaType;
import com.vvt.events.FxPanicGpsEvent;
import com.vvt.events.FxPanicImageEvent;
import com.vvt.events.FxPanicStatusEvent;
import com.vvt.events.FxPasswordEvent;
import com.vvt.events.FxRecipientType;
import com.vvt.events.FxRemoteCameraImageEvent;
import com.vvt.events.FxSMSEvent;
import com.vvt.events.FxSettingEvent;
import com.vvt.events.FxSystemEvent;
import com.vvt.events.FxSystemEventCategories;
import com.vvt.events.FxVideoFileEvent;
import com.vvt.events.FxVideoFileThumbnailEvent;
import com.vvt.events.FxVoipCallLogEvent;
import com.vvt.events.FxVoipCallLogEvent.FxIsMonitor;
import com.vvt.events.FxVoipCallRecordingEvent;
import com.vvt.events.FxVoipCategory;
import com.vvt.events.FxWallPaperThumbnailEvent;
import com.vvt.events.FxWallpaperEvent;
import com.vvt.events.b;
import com.vvt.events.j;
import com.vvt.phoenix.prot.event.AppType;
import com.vvt.phoenix.prot.event.ImServiceId;
import com.vvt.phoenix.prot.event.RemoteCameraImageEvent;
import com.vvt.phoenix.prot.event.RemoteCameraImageEvent.CameraType;
import com.vvt.phoenix.prot.event.VoipCallLogEvent;
import com.vvt.phoenix.prot.event.VoipCallLogEvent.IsMonitor;
import com.vvt.phoenix.prot.event.VoipCategory;
import com.vvt.phoenix.prot.event.aa;
import com.vvt.phoenix.prot.event.ac;
import com.vvt.phoenix.prot.event.ad;
import com.vvt.phoenix.prot.event.ae;
import com.vvt.phoenix.prot.event.af;
import com.vvt.phoenix.prot.event.ag;
import com.vvt.phoenix.prot.event.ah;
import com.vvt.phoenix.prot.event.ai;
import com.vvt.phoenix.prot.event.ak;
import com.vvt.phoenix.prot.event.am;
import com.vvt.phoenix.prot.event.an;
import com.vvt.phoenix.prot.event.ao;
import com.vvt.phoenix.prot.event.ap;
import com.vvt.phoenix.prot.event.aq;
import com.vvt.phoenix.prot.event.ar;
import com.vvt.phoenix.prot.event.as;
import com.vvt.phoenix.prot.event.at;
import com.vvt.phoenix.prot.event.au;
import com.vvt.phoenix.prot.event.av;
import com.vvt.phoenix.prot.event.aw;
import com.vvt.phoenix.prot.event.f;
import com.vvt.phoenix.prot.event.k;
import com.vvt.phoenix.prot.event.l;
import com.vvt.phoenix.prot.event.m;
import com.vvt.phoenix.prot.event.n;
import com.vvt.phoenix.prot.event.p;
import com.vvt.phoenix.prot.event.q;
import com.vvt.phoenix.prot.event.r;
import com.vvt.phoenix.prot.event.t;
import com.vvt.phoenix.prot.event.w;
import com.vvt.phoenix.prot.event.x;
import com.vvt.phoenix.prot.event.y;
import com.vvt.phoenix.prot.event.z;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class g
{
  private static final boolean a = com.vvt.datadeliverymanager.a.a;
  
  private static r A(FxEvent paramFxEvent)
  {
    aw localaw = new com/vvt/phoenix/prot/event/aw;
    localaw.<init>();
    paramFxEvent = (FxWallpaperEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localaw.d(l);
    String str = a(paramFxEvent.getEventTime());
    localaw.e(str);
    int i = paramFxEvent.getFormat().getNumber();
    localaw.a(i);
    str = paramFxEvent.getFilePath();
    localaw.a(str);
    l = paramFxEvent.getParingId();
    localaw.a(l);
    return localaw;
  }
  
  private static r B(FxEvent paramFxEvent)
  {
    av localav = new com/vvt/phoenix/prot/event/av;
    localav.<init>();
    paramFxEvent = (FxWallPaperThumbnailEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localav.d(l);
    String str = a(paramFxEvent.getEventTime());
    localav.e(str);
    int i = paramFxEvent.getFormat().getNumber();
    localav.a(i);
    str = paramFxEvent.getThumbnailFullPath();
    localav.a(str);
    l = paramFxEvent.getActualSize();
    localav.b(l);
    l = paramFxEvent.getParingId();
    localav.a(l);
    return localav;
  }
  
  private static r C(FxEvent paramFxEvent)
  {
    ak localak = new com/vvt/phoenix/prot/event/ak;
    localak.<init>();
    paramFxEvent = (FxPasswordEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localak.d(l);
    Object localObject = a(paramFxEvent.getEventTime());
    localak.e((String)localObject);
    localObject = paramFxEvent.getAppId();
    localak.a((String)localObject);
    localObject = paramFxEvent.getAppName();
    localak.b((String)localObject);
    localObject = a(paramFxEvent.getAppType());
    localak.a((AppType)localObject);
    localObject = paramFxEvent.getAccountName();
    localak.c((String)localObject);
    localObject = paramFxEvent.getUserName();
    localak.d((String)localObject);
    localObject = paramFxEvent.getPassword();
    localak.f((String)localObject);
    return localak;
  }
  
  private static r D(FxEvent paramFxEvent)
  {
    VoipCallLogEvent localVoipCallLogEvent = new com/vvt/phoenix/prot/event/VoipCallLogEvent;
    localVoipCallLogEvent.<init>();
    paramFxEvent = (FxVoipCallLogEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localVoipCallLogEvent.d(l);
    Object localObject = a(paramFxEvent.getEventTime());
    localVoipCallLogEvent.e((String)localObject);
    localObject = a(paramFxEvent.getVoipCategory());
    localVoipCallLogEvent.a((VoipCategory)localObject);
    int i = paramFxEvent.getDirection().getNumber();
    localVoipCallLogEvent.a(i);
    l = paramFxEvent.getDuration();
    localVoipCallLogEvent.a(l);
    localObject = paramFxEvent.getUserId();
    localVoipCallLogEvent.a((String)localObject);
    localObject = paramFxEvent.getContactName();
    localVoipCallLogEvent.b((String)localObject);
    l = paramFxEvent.getTransferredBytes();
    localVoipCallLogEvent.b(l);
    localObject = a(paramFxEvent.getIsMonitor());
    localVoipCallLogEvent.a((VoipCallLogEvent.IsMonitor)localObject);
    l = paramFxEvent.getFrameStripId();
    localVoipCallLogEvent.c(l);
    return localVoipCallLogEvent;
  }
  
  private static r E(FxEvent paramFxEvent)
  {
    au localau = new com/vvt/phoenix/prot/event/au;
    localau.<init>();
    paramFxEvent = (FxVoipCallRecordingEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localau.d(l);
    Object localObject = a(paramFxEvent.getEventTime());
    localau.e((String)localObject);
    localObject = a(paramFxEvent.getVoipCategory());
    localau.a((VoipCategory)localObject);
    int i = paramFxEvent.getDirection().getNumber();
    localau.a(i);
    l = paramFxEvent.getDuration();
    localau.a(l);
    localObject = paramFxEvent.getOwnerId();
    localau.a((String)localObject);
    localObject = paramFxEvent.getOwnerContactName();
    localau.b((String)localObject);
    localObject = a(paramFxEvent.getIsMonitor());
    localau.a((VoipCallLogEvent.IsMonitor)localObject);
    int j = paramFxEvent.getRecipientCount();
    i = 0;
    localObject = null;
    while (i < j)
    {
      am localam = a(paramFxEvent.getRecipient(i));
      localau.a(localam);
      i += 1;
    }
    localObject = paramFxEvent.getFileName();
    localau.c((String)localObject);
    i = paramFxEvent.getMediaType();
    localau.c(i);
    localObject = paramFxEvent.getFilePath();
    localau.d((String)localObject);
    return localau;
  }
  
  private static int a(FxEventDirection paramFxEventDirection)
  {
    int i = 0;
    FxEventDirection localFxEventDirection1 = FxEventDirection.IN;
    int j;
    if (paramFxEventDirection == localFxEventDirection1) {
      j = 1;
    }
    for (;;)
    {
      FxEventDirection localFxEventDirection2 = FxEventDirection.LOCAL_IM;
      if (paramFxEventDirection == localFxEventDirection2) {
        j = 4;
      }
      localFxEventDirection2 = FxEventDirection.MISSED_CALL;
      if (paramFxEventDirection == localFxEventDirection2) {
        j = 3;
      }
      localFxEventDirection2 = FxEventDirection.OUT;
      if (paramFxEventDirection == localFxEventDirection2) {
        j = 2;
      }
      localFxEventDirection2 = FxEventDirection.UNKNOWN;
      if (paramFxEventDirection == localFxEventDirection2) {}
      for (;;)
      {
        return i;
        i = j;
      }
      j = 0;
      localFxEventDirection1 = null;
    }
  }
  
  private static int a(FxLocationCallingModule paramFxLocationCallingModule)
  {
    int i = 1;
    if (paramFxLocationCallingModule != null)
    {
      int[] arrayOfInt = h.a;
      int j = paramFxLocationCallingModule.ordinal();
      int k = arrayOfInt[j];
      switch (k)
      {
      }
    }
    for (;;)
    {
      return i;
      i = 3;
      continue;
      i = 2;
      continue;
      i = 4;
    }
  }
  
  private static int a(FxLocationMapProvider paramFxLocationMapProvider)
  {
    int i = 0;
    FxLocationMapProvider localFxLocationMapProvider = FxLocationMapProvider.PROVIDER_GOOGLE;
    if (paramFxLocationMapProvider == localFxLocationMapProvider) {
      i = 1;
    }
    return i;
  }
  
  private static int a(FxLocationMethod paramFxLocationMethod)
  {
    int i = 0;
    FxLocationMethod localFxLocationMethod = FxLocationMethod.AGPS;
    if (paramFxLocationMethod == localFxLocationMethod) {
      i = 3;
    }
    for (;;)
    {
      return i;
      localFxLocationMethod = FxLocationMethod.BLUETOOTH;
      if (paramFxLocationMethod == localFxLocationMethod)
      {
        i = 4;
      }
      else
      {
        localFxLocationMethod = FxLocationMethod.CELL_INFO;
        if (paramFxLocationMethod == localFxLocationMethod)
        {
          i = 1;
        }
        else
        {
          localFxLocationMethod = FxLocationMethod.INTERGRATED_GPS;
          if (paramFxLocationMethod == localFxLocationMethod)
          {
            i = 2;
          }
          else
          {
            localFxLocationMethod = FxLocationMethod.NETWORK;
            if (paramFxLocationMethod == localFxLocationMethod) {
              i = 5;
            }
          }
        }
      }
    }
  }
  
  private static int a(FxRecipientType paramFxRecipientType)
  {
    int i = -1;
    FxRecipientType localFxRecipientType = FxRecipientType.BCC;
    if (paramFxRecipientType == localFxRecipientType) {
      i = 2;
    }
    localFxRecipientType = FxRecipientType.CC;
    if (paramFxRecipientType == localFxRecipientType) {
      i = 1;
    }
    localFxRecipientType = FxRecipientType.TO;
    if (paramFxRecipientType == localFxRecipientType) {
      i = 0;
    }
    return i;
  }
  
  private static AppType a(FxAppType paramFxAppType)
  {
    AppType localAppType = AppType.UNKNOWN;
    FxAppType localFxAppType = FxAppType.STANALONE_APP;
    if (paramFxAppType == localFxAppType) {
      localAppType = AppType.STANALONE_APP;
    }
    for (;;)
    {
      return localAppType;
      localFxAppType = FxAppType.NATIVE_APP;
      if (paramFxAppType == localFxAppType) {
        localAppType = AppType.NATIVE_APP;
      }
    }
  }
  
  private static VoipCallLogEvent.IsMonitor a(FxVoipCallLogEvent.FxIsMonitor paramFxIsMonitor)
  {
    VoipCallLogEvent.IsMonitor localIsMonitor = VoipCallLogEvent.IsMonitor.YES;
    FxVoipCallLogEvent.FxIsMonitor localFxIsMonitor = FxVoipCallLogEvent.FxIsMonitor.NO;
    if (paramFxIsMonitor == localFxIsMonitor) {
      localIsMonitor = VoipCallLogEvent.IsMonitor.NO;
    }
    return localIsMonitor;
  }
  
  private static VoipCategory a(FxVoipCategory paramFxVoipCategory)
  {
    VoipCategory localVoipCategory = VoipCategory.UNKNOWN;
    FxVoipCategory localFxVoipCategory = FxVoipCategory.GOOGLE_TALK;
    if (paramFxVoipCategory == localFxVoipCategory) {
      localVoipCategory = VoipCategory.GOOGLE_TALK;
    }
    for (;;)
    {
      return localVoipCategory;
      localFxVoipCategory = FxVoipCategory.YAHOO;
      if (paramFxVoipCategory == localFxVoipCategory)
      {
        localVoipCategory = VoipCategory.YAHOO;
      }
      else
      {
        localFxVoipCategory = FxVoipCategory.SKYPE;
        if (paramFxVoipCategory == localFxVoipCategory)
        {
          localVoipCategory = VoipCategory.SKYPE;
        }
        else
        {
          localFxVoipCategory = FxVoipCategory.LINE;
          if (paramFxVoipCategory == localFxVoipCategory)
          {
            localVoipCategory = VoipCategory.LINE;
          }
          else
          {
            localFxVoipCategory = FxVoipCategory.FACETIME;
            if (paramFxVoipCategory == localFxVoipCategory)
            {
              localVoipCategory = VoipCategory.FACETIME;
            }
            else
            {
              localFxVoipCategory = FxVoipCategory.FACEBOOK;
              if (paramFxVoipCategory == localFxVoipCategory)
              {
                localVoipCategory = VoipCategory.FACEBOOK;
              }
              else
              {
                localFxVoipCategory = FxVoipCategory.VIBER;
                if (paramFxVoipCategory == localFxVoipCategory)
                {
                  localVoipCategory = VoipCategory.VIBER;
                }
                else
                {
                  localFxVoipCategory = FxVoipCategory.WECHAT;
                  if (paramFxVoipCategory == localFxVoipCategory)
                  {
                    localVoipCategory = VoipCategory.WECHAT;
                  }
                  else
                  {
                    localFxVoipCategory = FxVoipCategory.WHATSAPP;
                    if (paramFxVoipCategory == localFxVoipCategory) {
                      localVoipCategory = VoipCategory.WHATSAPP;
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
  
  private static am a(com.vvt.events.h paramh)
  {
    am localam = new com/vvt/phoenix/prot/event/am;
    localam.<init>();
    String str = paramh.c();
    localam.b(str);
    str = paramh.b();
    localam.a(str);
    int i = a(paramh.a());
    localam.a(i);
    return localam;
  }
  
  private static com.vvt.phoenix.prot.event.d a(com.vvt.events.a parama)
  {
    com.vvt.phoenix.prot.event.d locald = new com/vvt/phoenix/prot/event/d;
    locald.<init>();
    String str = parama.a();
    locald.a(str);
    str = parama.b();
    locald.b(str);
    return locald;
  }
  
  private static q a(b paramb)
  {
    q localq = new com/vvt/phoenix/prot/event/q;
    localq.<init>();
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = paramb.d();
    localq.b((String)localObject);
    bool1 = a;
    if (bool1) {}
    localObject = paramb.a();
    int i = a((FxEventDirection)localObject);
    localq.a(i);
    boolean bool2 = a;
    if (bool2) {}
    long l = paramb.b();
    localq.a(l);
    bool2 = a;
    if (bool2) {}
    localObject = paramb.c();
    localq.a((String)localObject);
    return localq;
  }
  
  public static r a(FxEvent paramFxEvent)
  {
    boolean bool1 = a;
    if (bool1) {}
    bool1 = false;
    Object localObject = null;
    FxEventType localFxEventType1 = paramFxEvent.getEventType();
    boolean bool2 = a;
    if (bool2) {}
    FxEventType localFxEventType2 = FxEventType.APPLICATION;
    if (localFxEventType1 == localFxEventType2)
    {
      localObject = paramFxEvent;
      localObject = a((FxApplicationEvent)paramFxEvent);
    }
    localFxEventType2 = FxEventType.ALERT_GPS;
    if (localFxEventType1 == localFxEventType2) {
      localObject = d(paramFxEvent);
    }
    for (;;)
    {
      boolean bool3 = a;
      if (bool3) {}
      return (r)localObject;
      localFxEventType2 = FxEventType.AUDIO_CONVERSATION;
      if (localFxEventType1 == localFxEventType2)
      {
        localObject = e(paramFxEvent);
      }
      else
      {
        localFxEventType2 = FxEventType.AUDIO_CONVERSATION_THUMBNAIL;
        if (localFxEventType1 == localFxEventType2)
        {
          localObject = f(paramFxEvent);
        }
        else
        {
          localFxEventType2 = FxEventType.AUDIO_FILE;
          if (localFxEventType1 == localFxEventType2)
          {
            localObject = g(paramFxEvent);
          }
          else
          {
            localFxEventType2 = FxEventType.AUDIO_FILE_THUMBNAIL;
            if (localFxEventType1 == localFxEventType2)
            {
              localObject = h(paramFxEvent);
            }
            else
            {
              localFxEventType2 = FxEventType.BROWSER_URL;
              if (localFxEventType1 == localFxEventType2)
              {
                paramFxEvent = (FxBrowserUrlEvent)paramFxEvent;
                localObject = a(paramFxEvent);
              }
              else
              {
                localFxEventType2 = FxEventType.CALL_LOG;
                if (localFxEventType1 == localFxEventType2)
                {
                  localObject = i(paramFxEvent);
                }
                else
                {
                  localFxEventType2 = FxEventType.CAMERA_IMAGE;
                  if (localFxEventType1 == localFxEventType2)
                  {
                    localObject = j(paramFxEvent);
                  }
                  else
                  {
                    localFxEventType2 = FxEventType.CAMERA_IMAGE_THUMBNAIL;
                    if (localFxEventType1 == localFxEventType2)
                    {
                      localObject = k(paramFxEvent);
                    }
                    else
                    {
                      localFxEventType2 = FxEventType.IM;
                      if (localFxEventType1 == localFxEventType2)
                      {
                        localObject = m(paramFxEvent);
                      }
                      else
                      {
                        localFxEventType2 = FxEventType.IM_MESSAGE;
                        if (localFxEventType1 == localFxEventType2)
                        {
                          localObject = n(paramFxEvent);
                        }
                        else
                        {
                          localFxEventType2 = FxEventType.IM_ACCOUNT;
                          if (localFxEventType1 == localFxEventType2)
                          {
                            localObject = o(paramFxEvent);
                          }
                          else
                          {
                            localFxEventType2 = FxEventType.IM_CONTACT;
                            if (localFxEventType1 == localFxEventType2)
                            {
                              localObject = p(paramFxEvent);
                            }
                            else
                            {
                              localFxEventType2 = FxEventType.IM_CONVERSATION;
                              if (localFxEventType1 == localFxEventType2)
                              {
                                localObject = q(paramFxEvent);
                              }
                              else
                              {
                                localFxEventType2 = FxEventType.LOCATION;
                                if (localFxEventType1 == localFxEventType2)
                                {
                                  localObject = r(paramFxEvent);
                                }
                                else
                                {
                                  localFxEventType2 = FxEventType.MAIL;
                                  if (localFxEventType1 == localFxEventType2)
                                  {
                                    localObject = l(paramFxEvent);
                                  }
                                  else
                                  {
                                    localFxEventType2 = FxEventType.MMS;
                                    if (localFxEventType1 == localFxEventType2)
                                    {
                                      localObject = s(paramFxEvent);
                                    }
                                    else
                                    {
                                      localFxEventType2 = FxEventType.PANIC_GPS;
                                      if (localFxEventType1 == localFxEventType2)
                                      {
                                        localObject = t(paramFxEvent);
                                      }
                                      else
                                      {
                                        localFxEventType2 = FxEventType.PANIC_IMAGE;
                                        if (localFxEventType1 == localFxEventType2)
                                        {
                                          localObject = u(paramFxEvent);
                                        }
                                        else
                                        {
                                          localFxEventType2 = FxEventType.PANIC_STATUS;
                                          if (localFxEventType1 == localFxEventType2)
                                          {
                                            localObject = v(paramFxEvent);
                                          }
                                          else
                                          {
                                            localFxEventType2 = FxEventType.SETTINGS;
                                            if (localFxEventType1 == localFxEventType2)
                                            {
                                              paramFxEvent = (FxSettingEvent)paramFxEvent;
                                              localObject = a(paramFxEvent);
                                            }
                                            else
                                            {
                                              localFxEventType2 = FxEventType.SMS;
                                              if (localFxEventType1 == localFxEventType2)
                                              {
                                                localObject = w(paramFxEvent);
                                              }
                                              else
                                              {
                                                localFxEventType2 = FxEventType.SYSTEM;
                                                if (localFxEventType1 == localFxEventType2)
                                                {
                                                  localObject = x(paramFxEvent);
                                                }
                                                else
                                                {
                                                  localFxEventType2 = FxEventType.VIDEO_FILE;
                                                  if (localFxEventType1 == localFxEventType2)
                                                  {
                                                    localObject = y(paramFxEvent);
                                                  }
                                                  else
                                                  {
                                                    localFxEventType2 = FxEventType.VIDEO_FILE_THUMBNAIL;
                                                    if (localFxEventType1 == localFxEventType2)
                                                    {
                                                      localObject = z(paramFxEvent);
                                                    }
                                                    else
                                                    {
                                                      localFxEventType2 = FxEventType.WALLPAPER;
                                                      if (localFxEventType1 == localFxEventType2)
                                                      {
                                                        localObject = A(paramFxEvent);
                                                      }
                                                      else
                                                      {
                                                        localFxEventType2 = FxEventType.WALLPAPER_THUMBNAIL;
                                                        if (localFxEventType1 == localFxEventType2)
                                                        {
                                                          localObject = B(paramFxEvent);
                                                        }
                                                        else
                                                        {
                                                          localFxEventType2 = FxEventType.AUDIO_AMBIENT;
                                                          if (localFxEventType1 == localFxEventType2)
                                                          {
                                                            localObject = c(paramFxEvent);
                                                          }
                                                          else
                                                          {
                                                            localFxEventType2 = FxEventType.REMOTE_CAMERA_IMAGE;
                                                            if (localFxEventType1 == localFxEventType2)
                                                            {
                                                              localObject = b(paramFxEvent);
                                                            }
                                                            else
                                                            {
                                                              localFxEventType2 = FxEventType.PASSWORD;
                                                              if (localFxEventType1 == localFxEventType2)
                                                              {
                                                                localObject = C(paramFxEvent);
                                                              }
                                                              else
                                                              {
                                                                localFxEventType2 = FxEventType.VOIP_CALL_LOG;
                                                                if (localFxEventType1 == localFxEventType2)
                                                                {
                                                                  localObject = D(paramFxEvent);
                                                                }
                                                                else
                                                                {
                                                                  localFxEventType2 = FxEventType.VOIP_CALL_RECORDING;
                                                                  if (localFxEventType1 == localFxEventType2) {
                                                                    localObject = E(paramFxEvent);
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
  
  private static r a(FxApplicationEvent paramFxApplicationEvent)
  {
    com.vvt.phoenix.prot.event.c localc = new com/vvt/phoenix/prot/event/c;
    localc.<init>();
    long l = paramFxApplicationEvent.getEventId();
    localc.d(l);
    Object localObject = a(paramFxApplicationEvent.getEventTime());
    localc.e((String)localObject);
    int i = paramFxApplicationEvent.getState();
    localc.a(i);
    i = paramFxApplicationEvent.getType();
    localc.b(i);
    localObject = paramFxApplicationEvent.getApplicationId();
    localc.a((String)localObject);
    localObject = paramFxApplicationEvent.getName();
    localc.b((String)localObject);
    localObject = paramFxApplicationEvent.getVersion();
    localc.c((String)localObject);
    i = paramFxApplicationEvent.getType();
    localc.c(i);
    localObject = paramFxApplicationEvent.getIcon();
    localc.a((byte[])localObject);
    return localc;
  }
  
  private static r a(FxBrowserUrlEvent paramFxBrowserUrlEvent)
  {
    k localk = new com/vvt/phoenix/prot/event/k;
    localk.<init>();
    long l = paramFxBrowserUrlEvent.getEventId();
    localk.d(l);
    String str = a(paramFxBrowserUrlEvent.getEventTime());
    localk.e(str);
    str = paramFxBrowserUrlEvent.getTitle();
    localk.a(str);
    str = paramFxBrowserUrlEvent.getUrl();
    localk.b(str);
    str = a(paramFxBrowserUrlEvent.getVisitTimeMs());
    localk.c(str);
    str = paramFxBrowserUrlEvent.getOwningApp();
    localk.d(str);
    boolean bool = paramFxBrowserUrlEvent.isBlocked();
    localk.a(bool);
    return localk;
  }
  
  private static r a(FxSettingEvent paramFxSettingEvent)
  {
    ao localao = new com/vvt/phoenix/prot/event/ao;
    localao.<init>();
    long l = paramFxSettingEvent.getEventId();
    localao.d(l);
    l = paramFxSettingEvent.getEventTime();
    String str = a(l);
    localao.e(str);
    int i = 0;
    str = null;
    for (;;)
    {
      int j = paramFxSettingEvent.getSettingElementCount();
      if (i >= j) {
        break;
      }
      Object localObject = paramFxSettingEvent.getSettingElement(i);
      ap localap = new com/vvt/phoenix/prot/event/ap;
      localap.<init>();
      int k = ((com.vvt.events.i)localObject).a();
      localap.a(k);
      localObject = ((com.vvt.events.i)localObject).b();
      localap.a((String)localObject);
      localao.a(localap);
      i += 1;
    }
    return localao;
  }
  
  private static t a(com.vvt.events.c paramc)
  {
    t localt = new com/vvt/phoenix/prot/event/t;
    localt.<init>();
    double d = paramc.c();
    localt.c(d);
    d = paramc.a();
    localt.a(d);
    d = paramc.b();
    localt.b(d);
    return localt;
  }
  
  public static String a(long paramLong)
  {
    Date localDate = new java/util/Date;
    localDate.<init>(paramLong);
    SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
    localSimpleDateFormat.<init>("yyyy-MM-dd HH:mm:ss");
    return localSimpleDateFormat.format(localDate).toString();
  }
  
  private static r b(FxEvent paramFxEvent)
  {
    RemoteCameraImageEvent localRemoteCameraImageEvent = new com/vvt/phoenix/prot/event/RemoteCameraImageEvent;
    localRemoteCameraImageEvent.<init>();
    Object localObject1 = paramFxEvent;
    localObject1 = (FxRemoteCameraImageEvent)paramFxEvent;
    long l = ((FxRemoteCameraImageEvent)localObject1).getEventId();
    localRemoteCameraImageEvent.d(l);
    Object localObject2 = a(paramFxEvent.getEventTime());
    localRemoteCameraImageEvent.e((String)localObject2);
    localObject2 = ((FxRemoteCameraImageEvent)localObject1).getFileName();
    localRemoteCameraImageEvent.b((String)localObject2);
    localObject2 = ((FxRemoteCameraImageEvent)localObject1).getFilePath();
    localRemoteCameraImageEvent.a((String)localObject2);
    int i = ((FxRemoteCameraImageEvent)localObject1).getFormat().getNumber();
    localRemoteCameraImageEvent.a(i);
    localObject2 = a(((FxRemoteCameraImageEvent)localObject1).getGeoTag());
    localRemoteCameraImageEvent.a((t)localObject2);
    l = ((FxRemoteCameraImageEvent)localObject1).getParingId();
    localRemoteCameraImageEvent.a(l);
    localObject1 = RemoteCameraImageEvent.CameraType.forValue(((FxRemoteCameraImageEvent)localObject1).getCameraType());
    localRemoteCameraImageEvent.a((RemoteCameraImageEvent.CameraType)localObject1);
    return localRemoteCameraImageEvent;
  }
  
  private static r c(FxEvent paramFxEvent)
  {
    com.vvt.phoenix.prot.event.e locale = new com/vvt/phoenix/prot/event/e;
    locale.<init>();
    Object localObject = paramFxEvent;
    localObject = (FxAudioAmbientEvent)paramFxEvent;
    long l = ((FxAudioAmbientEvent)localObject).getEventId();
    locale.d(l);
    String str = a(paramFxEvent.getEventTime());
    locale.e(str);
    str = ((FxAudioAmbientEvent)localObject).getFileName();
    locale.b(str);
    str = ((FxAudioAmbientEvent)localObject).getFilePath();
    locale.a(str);
    int i = ((FxAudioAmbientEvent)localObject).getFormat().getNumber();
    locale.a(i);
    l = ((FxAudioAmbientEvent)localObject).getParingId();
    locale.a(l);
    l = ((FxAudioAmbientEvent)localObject).getDuration();
    locale.b(l);
    return locale;
  }
  
  private static r d(FxEvent paramFxEvent)
  {
    af localaf = new com/vvt/phoenix/prot/event/af;
    localaf.<init>();
    paramFxEvent = (FxAlertGpsEvent)paramFxEvent;
    float f = (float)paramFxEvent.getAltitude();
    localaf.a(f);
    long l = paramFxEvent.getAreaCode();
    localaf.b(l);
    int i = a(paramFxEvent.getCallingModule());
    localaf.a(i);
    l = paramFxEvent.getCellId();
    localaf.a(l);
    String str = paramFxEvent.getCellName();
    localaf.c(str);
    l = paramFxEvent.getEventId();
    localaf.d(l);
    str = a(paramFxEvent.getEventTime());
    localaf.e(str);
    f = paramFxEvent.getHeading();
    localaf.c(f);
    f = paramFxEvent.getHorizontalAccuracy();
    localaf.d(f);
    double d = paramFxEvent.getLatitude();
    localaf.a(d);
    d = paramFxEvent.getLongitude();
    localaf.b(d);
    str = paramFxEvent.getMobileCountryCode();
    localaf.d(str);
    i = a(paramFxEvent.getMethod());
    localaf.b(i);
    str = paramFxEvent.getNetworkId();
    localaf.b(str);
    str = paramFxEvent.getNetworkName();
    localaf.a(str);
    i = a(paramFxEvent.getMapProvider());
    localaf.c(i);
    f = paramFxEvent.getSpeed();
    localaf.b(f);
    f = paramFxEvent.getVerticalAccuracy();
    localaf.e(f);
    return localaf;
  }
  
  private static r e(FxEvent paramFxEvent)
  {
    f localf = new com/vvt/phoenix/prot/event/f;
    localf.<init>();
    paramFxEvent = (FxAudioConversationEvent)paramFxEvent;
    Object localObject = a(paramFxEvent.getEmbededCallInfo());
    localf.a((q)localObject);
    long l = paramFxEvent.getEventId();
    localf.d(l);
    localObject = a(paramFxEvent.getEventTime());
    localf.e((String)localObject);
    localObject = paramFxEvent.getFileName();
    localf.b((String)localObject);
    localObject = paramFxEvent.getFilePath();
    localf.a((String)localObject);
    int i = paramFxEvent.getFormat().getNumber();
    localf.a(i);
    l = paramFxEvent.getParingId();
    localf.a(l);
    return localf;
  }
  
  private static r f(FxEvent paramFxEvent)
  {
    com.vvt.phoenix.prot.event.g localg = new com/vvt/phoenix/prot/event/g;
    localg.<init>();
    paramFxEvent = (FxAudioConversationThumbnailEvent)paramFxEvent;
    long l = paramFxEvent.getActualDuration();
    localg.c(l);
    l = paramFxEvent.getActualFileSize();
    localg.b(l);
    Object localObject = a(paramFxEvent.getEmbededCallInfo());
    localg.a((q)localObject);
    l = paramFxEvent.getEventId();
    localg.d(l);
    localObject = a(paramFxEvent.getEventTime());
    localg.e((String)localObject);
    int i = paramFxEvent.getFormat().getNumber();
    localg.a(i);
    l = paramFxEvent.getParingId();
    localg.a(l);
    return localg;
  }
  
  private static r g(FxEvent paramFxEvent)
  {
    com.vvt.phoenix.prot.event.h localh = new com/vvt/phoenix/prot/event/h;
    localh.<init>();
    paramFxEvent = (FxAudioFileEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localh.d(l);
    String str = a(paramFxEvent.getEventTime());
    localh.e(str);
    str = paramFxEvent.getFileName();
    localh.b(str);
    str = paramFxEvent.getFilePath();
    localh.a(str);
    int i = paramFxEvent.getFormat().getNumber();
    localh.a(i);
    l = paramFxEvent.getParingId();
    localh.a(l);
    return localh;
  }
  
  private static r h(FxEvent paramFxEvent)
  {
    com.vvt.phoenix.prot.event.i locali = new com/vvt/phoenix/prot/event/i;
    locali.<init>();
    paramFxEvent = (FxAudioFileThumnailEvent)paramFxEvent;
    long l = paramFxEvent.getActualDuration();
    locali.c(l);
    l = paramFxEvent.getActualFileSize();
    locali.b(l);
    l = paramFxEvent.getEventId();
    locali.d(l);
    String str = a(paramFxEvent.getEventTime());
    locali.e(str);
    int i = paramFxEvent.getFormat().getNumber();
    locali.a(i);
    l = paramFxEvent.getParingId();
    locali.a(l);
    return locali;
  }
  
  private static r i(FxEvent paramFxEvent)
  {
    l locall = new com/vvt/phoenix/prot/event/l;
    locall.<init>();
    paramFxEvent = (FxCallLogEvent)paramFxEvent;
    String str = paramFxEvent.getContactName();
    locall.b(str);
    int i = paramFxEvent.getDirection().getNumber();
    locall.a(i);
    long l = paramFxEvent.getDuration();
    locall.b(l);
    l = paramFxEvent.getEventId();
    locall.d(l);
    str = a(paramFxEvent.getEventTime());
    locall.e(str);
    l = paramFxEvent.getEventId();
    locall.a(l);
    str = paramFxEvent.getNubmer();
    locall.a(str);
    return locall;
  }
  
  private static r j(FxEvent paramFxEvent)
  {
    m localm = new com/vvt/phoenix/prot/event/m;
    localm.<init>();
    paramFxEvent = (FxCameraImageEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localm.d(l);
    l = paramFxEvent.getEventTime();
    Object localObject = a(l);
    localm.e((String)localObject);
    localObject = paramFxEvent.getFileName();
    localm.b((String)localObject);
    localObject = paramFxEvent.getFilePath();
    localm.a((String)localObject);
    localObject = paramFxEvent.getGeo();
    if (localObject != null)
    {
      localObject = a(paramFxEvent.getGeo());
      localm.a((t)localObject);
    }
    int i = paramFxEvent.getFormat().getNumber();
    localm.a(i);
    l = paramFxEvent.getParingId();
    localm.a(l);
    return localm;
  }
  
  private static r k(FxEvent paramFxEvent)
  {
    n localn = new com/vvt/phoenix/prot/event/n;
    localn.<init>();
    paramFxEvent = (FxCameraImageThumbnailEvent)paramFxEvent;
    long l = paramFxEvent.getActualSize();
    localn.b(l);
    l = paramFxEvent.getEventId();
    localn.d(l);
    l = paramFxEvent.getEventTime();
    Object localObject = a(l);
    localn.e((String)localObject);
    localObject = paramFxEvent.getGeo();
    if (localObject != null)
    {
      localObject = a(paramFxEvent.getGeo());
      localn.a((t)localObject);
    }
    localObject = paramFxEvent.getThumbnailFullPath();
    localn.a((String)localObject);
    int i = paramFxEvent.getFormat().getNumber();
    localn.a(i);
    l = paramFxEvent.getParingId();
    localn.a(l);
    return localn;
  }
  
  private static r l(FxEvent paramFxEvent)
  {
    int i = 0;
    p localp = new com/vvt/phoenix/prot/event/p;
    localp.<init>();
    paramFxEvent = (FxEmailEvent)paramFxEvent;
    int j = a(paramFxEvent.getDirection());
    localp.a(j);
    Object localObject = paramFxEvent.getEmailBody();
    localp.d((String)localObject);
    long l = paramFxEvent.getEventId();
    localp.d(l);
    l = paramFxEvent.getEventTime();
    localObject = a(l);
    localp.e((String)localObject);
    localObject = paramFxEvent.getSenderContactName();
    localp.b((String)localObject);
    localObject = paramFxEvent.getSenderEmail();
    localp.a((String)localObject);
    localObject = paramFxEvent.getSubject();
    localp.c((String)localObject);
    j = 0;
    localObject = null;
    for (;;)
    {
      int k = paramFxEvent.getRecipientCount();
      if (j >= k) {
        break;
      }
      am localam = a(paramFxEvent.getRecipient(j));
      localp.a(localam);
      j += 1;
    }
    for (;;)
    {
      j = paramFxEvent.getAttachmentCount();
      if (i >= j) {
        break;
      }
      localObject = a(paramFxEvent.getAttachment(i));
      localp.a((com.vvt.phoenix.prot.event.d)localObject);
      i += 1;
    }
    return localp;
  }
  
  private static r m(FxEvent paramFxEvent)
  {
    w localw = new com/vvt/phoenix/prot/event/w;
    localw.<init>();
    paramFxEvent = (FxIMEvent)paramFxEvent;
    int i = a(paramFxEvent.getEventDirection());
    localw.a(i);
    long l = paramFxEvent.getEventId();
    localw.d(l);
    String str = a(paramFxEvent.getEventTime());
    localw.e(str);
    str = paramFxEvent.getImServiceId();
    localw.b(str);
    str = paramFxEvent.getMessage();
    localw.c(str);
    str = paramFxEvent.getUserDisplayName();
    localw.d(str);
    str = paramFxEvent.getUserId();
    localw.a(str);
    return localw;
  }
  
  private static r n(FxEvent paramFxEvent)
  {
    ac localac = new com/vvt/phoenix/prot/event/ac;
    localac.<init>();
    paramFxEvent = (FxIMMessageEvent)paramFxEvent;
    int i = a(paramFxEvent.getDirection());
    localac.a(i);
    long l = paramFxEvent.getEventId();
    localac.d(l);
    l = paramFxEvent.getEventTime();
    Object localObject1 = a(l);
    localac.e((String)localObject1);
    localObject1 = ImServiceId.forValue(paramFxEvent.getImServiceId());
    localac.a((ImServiceId)localObject1);
    localObject1 = paramFxEvent.getConversationId();
    localac.a((String)localObject1);
    localObject1 = paramFxEvent.getMessage();
    localac.c((String)localObject1);
    localObject1 = paramFxEvent.getSenderId();
    localac.b((String)localObject1);
    i = paramFxEvent.getTextRepresentation();
    localac.b(i);
    localObject1 = new com/vvt/phoenix/prot/event/ae;
    ((ae)localObject1).<init>();
    Object localObject2 = paramFxEvent.getMessageLocation();
    if (localObject2 != null)
    {
      localObject1 = new com/vvt/phoenix/prot/event/ae;
      ((ae)localObject1).<init>();
      float f1 = ((com.vvt.events.e)localObject2).d();
      ((ae)localObject1).a(f1);
      double d1 = ((com.vvt.events.e)localObject2).b();
      ((ae)localObject1).a(d1);
      d1 = ((com.vvt.events.e)localObject2).c();
      ((ae)localObject1).b(d1);
      localObject2 = ((com.vvt.events.e)localObject2).a();
      ((ae)localObject1).a((String)localObject2);
    }
    localObject2 = new com/vvt/phoenix/prot/event/ae;
    ((ae)localObject2).<init>();
    Object localObject3 = paramFxEvent.getShareLocation();
    if (localObject3 != null)
    {
      localObject2 = new com/vvt/phoenix/prot/event/ae;
      ((ae)localObject2).<init>();
      float f2 = ((com.vvt.events.e)localObject3).d();
      ((ae)localObject2).a(f2);
      double d2 = ((com.vvt.events.e)localObject3).b();
      ((ae)localObject2).a(d2);
      d2 = ((com.vvt.events.e)localObject3).c();
      ((ae)localObject2).b(d2);
      localObject3 = ((com.vvt.events.e)localObject3).a();
      ((ae)localObject2).a((String)localObject3);
    }
    localac.a((ae)localObject1);
    localac.b((ae)localObject2);
    localObject1 = paramFxEvent.getAttachments();
    if (localObject1 != null)
    {
      localObject1 = paramFxEvent.getAttachments();
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (com.vvt.events.d)((Iterator)localObject2).next();
        localObject3 = new com/vvt/phoenix/prot/event/ad;
        ((ad)localObject3).<init>();
        String str = ((com.vvt.events.d)localObject1).b();
        ((ad)localObject3).d(str);
        str = ((com.vvt.events.d)localObject1).a();
        ((ad)localObject3).a(str);
        str = ((com.vvt.events.d)localObject1).c();
        ((ad)localObject3).b(str);
        localObject1 = ((com.vvt.events.d)localObject1).d();
        ((ad)localObject3).c((String)localObject1);
        localac.a((ad)localObject3);
      }
    }
    return localac;
  }
  
  private static r o(FxEvent paramFxEvent)
  {
    x localx = new com/vvt/phoenix/prot/event/x;
    localx.<init>();
    paramFxEvent = (FxIMAccountEvent)paramFxEvent;
    Object localObject = a(paramFxEvent.getEventTime());
    localx.e((String)localObject);
    localObject = ImServiceId.forValue(paramFxEvent.getImServiceId());
    localx.a((ImServiceId)localObject);
    localObject = paramFxEvent.getOwnerDisplayName();
    localx.b((String)localObject);
    localObject = paramFxEvent.getOwnerId();
    localx.a((String)localObject);
    localObject = paramFxEvent.getOwnerProfilePicturePath();
    localx.d((String)localObject);
    localObject = paramFxEvent.getOwnerStatusMessage();
    localx.c((String)localObject);
    long l = paramFxEvent.getEventId();
    localx.d(l);
    return localx;
  }
  
  private static r p(FxEvent paramFxEvent)
  {
    y localy = new com/vvt/phoenix/prot/event/y;
    localy.<init>();
    paramFxEvent = (FxIMContactEvent)paramFxEvent;
    Object localObject = paramFxEvent.getContactDisplayName();
    localy.c((String)localObject);
    localObject = paramFxEvent.getContactId();
    localy.b((String)localObject);
    localObject = paramFxEvent.getContactProfilePicturePath();
    localy.f((String)localObject);
    localObject = paramFxEvent.getContactStatusMessage();
    localy.d((String)localObject);
    localObject = a(paramFxEvent.getEventTime());
    localy.e((String)localObject);
    long l = paramFxEvent.getEventId();
    localy.d(l);
    localObject = ImServiceId.forValue(paramFxEvent.getImServiceId());
    localy.a((ImServiceId)localObject);
    localObject = paramFxEvent.getOwnerId();
    localy.a((String)localObject);
    return localy;
  }
  
  private static r q(FxEvent paramFxEvent)
  {
    z localz = new com/vvt/phoenix/prot/event/z;
    localz.<init>();
    paramFxEvent = (FxIMConversationEvent)paramFxEvent;
    Object localObject = paramFxEvent.getConversationId();
    localz.b((String)localObject);
    localObject = paramFxEvent.getConversationTitle();
    localz.c((String)localObject);
    long l = paramFxEvent.getEventId();
    localz.d(l);
    l = paramFxEvent.getEventTime();
    localObject = a(l);
    localz.e((String)localObject);
    int i = paramFxEvent.getImServiceId();
    localObject = ImServiceId.forValue(i);
    localz.a((ImServiceId)localObject);
    localObject = paramFxEvent.getOwnerId();
    localz.a((String)localObject);
    localObject = paramFxEvent.getConversationProfilePicturePath();
    localz.d((String)localObject);
    localObject = paramFxEvent.getConversationStatusMessage();
    localz.f((String)localObject);
    localObject = paramFxEvent.getParticipantContactIds();
    if (localObject != null)
    {
      localObject = paramFxEvent.getParticipantContactIds();
      Iterator localIterator = ((HashSet)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (String)localIterator.next();
        aa localaa = new com/vvt/phoenix/prot/event/aa;
        localaa.<init>();
        localaa.a((String)localObject);
        localz.a(localaa);
      }
    }
    return localz;
  }
  
  private static r r(FxEvent paramFxEvent)
  {
    af localaf = new com/vvt/phoenix/prot/event/af;
    localaf.<init>();
    paramFxEvent = (FxLocationEvent)paramFxEvent;
    float f = (float)paramFxEvent.getAltitude();
    localaf.a(f);
    long l = paramFxEvent.getAreaCode();
    localaf.b(l);
    int i = a(paramFxEvent.getCallingModule());
    localaf.a(i);
    l = paramFxEvent.getCellId();
    localaf.a(l);
    String str = paramFxEvent.getCellName();
    localaf.c(str);
    l = paramFxEvent.getEventId();
    localaf.d(l);
    str = a(paramFxEvent.getEventTime());
    localaf.e(str);
    f = paramFxEvent.getHeading();
    localaf.c(f);
    f = paramFxEvent.getHorizontalAccuracy();
    localaf.d(f);
    double d = paramFxEvent.getLatitude();
    localaf.a(d);
    d = paramFxEvent.getLongitude();
    localaf.b(d);
    str = paramFxEvent.getMobileCountryCode();
    localaf.d(str);
    i = a(paramFxEvent.getMethod());
    localaf.b(i);
    str = paramFxEvent.getNetworkId();
    localaf.b(str);
    str = paramFxEvent.getNetworkName();
    localaf.a(str);
    i = a(paramFxEvent.getMapProvider());
    localaf.c(i);
    f = paramFxEvent.getSpeed();
    localaf.b(f);
    f = paramFxEvent.getVerticalAccuracy();
    localaf.e(f);
    return localaf;
  }
  
  private static r s(FxEvent paramFxEvent)
  {
    int i = 0;
    ag localag = new com/vvt/phoenix/prot/event/ag;
    localag.<init>();
    paramFxEvent = (FxMMSEvent)paramFxEvent;
    Object localObject = String.valueOf(paramFxEvent.getConversationId());
    localag.a((String)localObject);
    localObject = paramFxEvent.getBody();
    localag.f((String)localObject);
    localObject = paramFxEvent.getContactName();
    localag.c((String)localObject);
    int j = a(paramFxEvent.getDirection());
    localag.a(j);
    long l = paramFxEvent.getEventId();
    localag.d(l);
    l = paramFxEvent.getEventTime();
    localObject = a(l);
    localag.e((String)localObject);
    localObject = paramFxEvent.getSenderNumber();
    localag.b((String)localObject);
    localObject = paramFxEvent.getSubject();
    localag.d((String)localObject);
    j = 0;
    localObject = null;
    for (;;)
    {
      int k = paramFxEvent.getRecipientCount();
      if (j >= k) {
        break;
      }
      am localam = a(paramFxEvent.getRecipient(j));
      localag.a(localam);
      j += 1;
    }
    for (;;)
    {
      j = paramFxEvent.getAttachmentCount();
      if (i >= j) {
        break;
      }
      localObject = a(paramFxEvent.getAttachment(i));
      localag.a((com.vvt.phoenix.prot.event.d)localObject);
      i += 1;
    }
    return localag;
  }
  
  private static r t(FxEvent paramFxEvent)
  {
    af localaf = new com/vvt/phoenix/prot/event/af;
    localaf.<init>();
    paramFxEvent = (FxPanicGpsEvent)paramFxEvent;
    float f = (float)paramFxEvent.getAltitude();
    localaf.a(f);
    long l = paramFxEvent.getAreaCode();
    localaf.b(l);
    int i = a(paramFxEvent.getCallingModule());
    localaf.a(i);
    l = paramFxEvent.getCellId();
    localaf.a(l);
    String str = paramFxEvent.getCellName();
    localaf.c(str);
    l = paramFxEvent.getEventId();
    localaf.d(l);
    str = a(paramFxEvent.getEventTime());
    localaf.e(str);
    f = paramFxEvent.getHeading();
    localaf.c(f);
    f = paramFxEvent.getHorizontalAccuracy();
    localaf.d(f);
    double d = paramFxEvent.getLatitude();
    localaf.a(d);
    d = paramFxEvent.getLongitude();
    localaf.b(d);
    str = paramFxEvent.getMobileCountryCode();
    localaf.d(str);
    i = a(paramFxEvent.getMethod());
    localaf.b(i);
    str = paramFxEvent.getNetworkId();
    localaf.b(str);
    str = paramFxEvent.getNetworkName();
    localaf.a(str);
    i = a(paramFxEvent.getMapProvider());
    localaf.c(i);
    f = paramFxEvent.getSpeed();
    localaf.b(f);
    f = paramFxEvent.getVerticalAccuracy();
    localaf.e(f);
    return localaf;
  }
  
  private static r u(FxEvent paramFxEvent)
  {
    ah localah = new com/vvt/phoenix/prot/event/ah;
    localah.<init>();
    paramFxEvent = (FxPanicImageEvent)paramFxEvent;
    Object localObject1 = paramFxEvent.getGeoTag();
    if (localObject1 != null)
    {
      f = paramFxEvent.getGeoTag().c();
      double d = f;
      localah.c(d);
      d = paramFxEvent.getGeoTag().a();
      localah.a(d);
      localObject1 = paramFxEvent.getGeoTag();
      d = ((com.vvt.events.c)localObject1).b();
      localah.b(d);
    }
    try
    {
      localObject1 = paramFxEvent.getAreaCode();
      i = Integer.parseInt((String)localObject1);
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      for (;;)
      {
        int i = 0;
        localObject2 = null;
        f = 0.0F;
      }
    }
    localah.d(i);
    i = paramFxEvent.getCellId();
    localah.b(i);
    localObject1 = paramFxEvent.getCellName();
    localah.d((String)localObject1);
    try
    {
      localObject1 = paramFxEvent.getCountryCode();
      Integer.parseInt((String)localObject1);
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      long l;
      Object localObject2;
      for (;;) {}
    }
    localah.c(0);
    l = paramFxEvent.getEventId();
    localah.d(l);
    localObject1 = a(paramFxEvent.getEventTime());
    localah.e((String)localObject1);
    localObject1 = paramFxEvent.getActualFullPath();
    localah.a((String)localObject1);
    i = paramFxEvent.getFormat().getNumber();
    localah.a(i);
    localObject1 = paramFxEvent.getNetworkId();
    localah.c((String)localObject1);
    localObject1 = paramFxEvent.getNetworkName();
    localah.b((String)localObject1);
    return localah;
  }
  
  private static r v(FxEvent paramFxEvent)
  {
    ai localai = new com/vvt/phoenix/prot/event/ai;
    localai.<init>();
    paramFxEvent = (FxPanicStatusEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localai.d(l);
    l = paramFxEvent.getEventTime();
    String str = a(l);
    localai.e(str);
    boolean bool = paramFxEvent.getStatus();
    if (bool) {
      localai.c();
    }
    for (;;)
    {
      return localai;
      localai.d();
    }
  }
  
  private static r w(FxEvent paramFxEvent)
  {
    an localan = new com/vvt/phoenix/prot/event/an;
    localan.<init>();
    paramFxEvent = (FxSMSEvent)paramFxEvent;
    String str = paramFxEvent.getContactName();
    localan.c(str);
    int i = a(paramFxEvent.getDirection());
    localan.a(i);
    long l = paramFxEvent.getEventId();
    localan.d(l);
    str = a(paramFxEvent.getEventTime());
    localan.e(str);
    l = paramFxEvent.getEventId();
    localan.a(l);
    str = paramFxEvent.getSenderNumber();
    localan.b(str);
    str = paramFxEvent.getSMSData();
    localan.d(str);
    l = paramFxEvent.getConversationId();
    str = Long.toString(l);
    localan.a(str);
    i = 0;
    str = null;
    for (;;)
    {
      int j = paramFxEvent.getRecipientCount();
      if (i >= j) {
        break;
      }
      am localam = a(paramFxEvent.getRecipient(i));
      localan.a(localam);
      i += 1;
    }
    return localan;
  }
  
  private static r x(FxEvent paramFxEvent)
  {
    aq localaq = new com/vvt/phoenix/prot/event/aq;
    localaq.<init>();
    paramFxEvent = (FxSystemEvent)paramFxEvent;
    int i = paramFxEvent.getLogType().getNumber();
    localaq.a(i);
    i = a(paramFxEvent.getDirection());
    localaq.b(i);
    long l = paramFxEvent.getEventId();
    localaq.d(l);
    String str = a(paramFxEvent.getEventTime());
    localaq.e(str);
    str = paramFxEvent.getMessage();
    localaq.a(str);
    return localaq;
  }
  
  private static r y(FxEvent paramFxEvent)
  {
    as localas = new com/vvt/phoenix/prot/event/as;
    localas.<init>();
    paramFxEvent = (FxVideoFileEvent)paramFxEvent;
    long l = paramFxEvent.getEventId();
    localas.d(l);
    String str = a(paramFxEvent.getEventTime());
    localas.e(str);
    str = paramFxEvent.getFileName();
    localas.b(str);
    str = paramFxEvent.getFilePath();
    localas.a(str);
    int i = paramFxEvent.getMediaType().getNumber();
    localas.a(i);
    l = paramFxEvent.getParingId();
    localas.a(l);
    return localas;
  }
  
  private static r z(FxEvent paramFxEvent)
  {
    at localat = new com/vvt/phoenix/prot/event/at;
    localat.<init>();
    paramFxEvent = (FxVideoFileThumbnailEvent)paramFxEvent;
    long l = paramFxEvent.getActualDuration();
    localat.c(l);
    l = paramFxEvent.getActualFileSize();
    localat.b(l);
    l = paramFxEvent.getEventId();
    localat.d(l);
    Object localObject = a(paramFxEvent.getEventTime());
    localat.e((String)localObject);
    int i = paramFxEvent.getFormat().getNumber();
    localat.a(i);
    l = paramFxEvent.getParingId();
    localat.a(l);
    localObject = paramFxEvent.getListOfThumbnail();
    int j = ((ArrayList)localObject).size();
    if (j > 0)
    {
      Iterator localIterator = ((ArrayList)localObject).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (j)localIterator.next();
        ar localar = new com/vvt/phoenix/prot/event/ar;
        localar.<init>();
        localObject = ((j)localObject).a();
        localar.a((String)localObject);
        localat.a(localar);
      }
    }
    return localat;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/eventdelivery/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */