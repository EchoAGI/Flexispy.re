package com.vvt.events;

import java.util.HashMap;
import java.util.Map;

public enum FxIMMessageServiceType
{
  private static final Map a;
  private final int mValue;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("BBM", m, m);
    BBM = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("WHATSAPP", k, k);
    WHATSAPP = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("GOOGLE_TALK", j, j);
    GOOGLE_TALK = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("YAHOO_MESSENGER", i, i);
    YAHOO_MESSENGER = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("SKYPE", 5, 5);
    SKYPE = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("IMESSAGE", 6, 6);
    IMESSAGE = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("LINE", 7, 7);
    LINE = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("FACEBOOK", 8, 8);
    FACEBOOK = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("AIM", 9, 9);
    AIM = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("ICQ", 10, 10);
    ICQ = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("WLM", 11, 11);
    WLM = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("TENCENT_QQ", 12, 12);
    TENCENT_QQ = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("JABBER", 13, 13);
    JABBER = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("OVI_BY_NOKIA", 14, 14);
    OVI_BY_NOKIA = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("TIGER_TEXT", 15, 15);
    TIGER_TEXT = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("VIBER", 16, 16);
    VIBER = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("WECHAT", 17, 19);
    WECHAT = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("KIK", 18, 20);
    KIK = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("SNAPCHAT", 19, 31);
    SNAPCHAT = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("HANGOUT", 20, 32);
    HANGOUT = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("TELEGRAM", 21, 35);
    TELEGRAM = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("TINDER", 22, 36);
    TINDER = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    ((FxIMMessageServiceType)localObject).<init>("INSTAGRAM", 23, 37);
    INSTAGRAM = (FxIMMessageServiceType)localObject;
    localObject = new com/vvt/events/FxIMMessageServiceType;
    int i1 = 24;
    int i2 = 38;
    ((FxIMMessageServiceType)localObject).<init>("HIKE", i1, i2);
    HIKE = (FxIMMessageServiceType)localObject;
    int i3 = 25;
    localObject = new FxIMMessageServiceType[i3];
    FxIMMessageServiceType localFxIMMessageServiceType1 = UNKNOWN;
    localObject[0] = localFxIMMessageServiceType1;
    localFxIMMessageServiceType1 = BBM;
    localObject[m] = localFxIMMessageServiceType1;
    localFxIMMessageServiceType1 = WHATSAPP;
    localObject[k] = localFxIMMessageServiceType1;
    localFxIMMessageServiceType1 = GOOGLE_TALK;
    localObject[j] = localFxIMMessageServiceType1;
    localFxIMMessageServiceType1 = YAHOO_MESSENGER;
    localObject[i] = localFxIMMessageServiceType1;
    FxIMMessageServiceType localFxIMMessageServiceType2 = SKYPE;
    localObject[5] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = IMESSAGE;
    localObject[6] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = LINE;
    localObject[7] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = FACEBOOK;
    localObject[8] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = AIM;
    localObject[9] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = ICQ;
    localObject[10] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = WLM;
    localObject[11] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = TENCENT_QQ;
    localObject[12] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = JABBER;
    localObject[13] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = OVI_BY_NOKIA;
    localObject[14] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = TIGER_TEXT;
    localObject[15] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = VIBER;
    localObject[16] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = WECHAT;
    localObject[17] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = KIK;
    localObject[18] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = SNAPCHAT;
    localObject[19] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = HANGOUT;
    localObject[20] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = TELEGRAM;
    localObject[21] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = TINDER;
    localObject[22] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = INSTAGRAM;
    localObject[23] = localFxIMMessageServiceType2;
    localFxIMMessageServiceType2 = HIKE;
    localObject[24] = localFxIMMessageServiceType2;
    b = (FxIMMessageServiceType[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localFxIMMessageServiceType2 = localObject[n];
      Map localMap = a;
      m = localFxIMMessageServiceType2.mValue;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localFxIMMessageServiceType2);
      n += 1;
    }
  }
  
  private FxIMMessageServiceType(int paramInt1)
  {
    this.mValue = paramInt1;
  }
  
  public static FxIMMessageServiceType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxIMMessageServiceType)localMap.get(localInteger);
  }
  
  public int getValue()
  {
    return this.mValue;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxIMMessageServiceType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */