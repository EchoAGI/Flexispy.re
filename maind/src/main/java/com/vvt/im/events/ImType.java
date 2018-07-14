package com.vvt.im.events;

import java.util.HashMap;
import java.util.Map;

public enum ImType
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
    Object localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("WHATSAPP", 0, 0);
    WHATSAPP = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("FACEBOOK", m, m);
    FACEBOOK = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("LINE", k, k);
    LINE = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("SKYPE", j, j);
    SKYPE = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("VIBER", i, i);
    VIBER = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("WECHAT", 5, 5);
    WECHAT = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("BBM", 6, 6);
    BBM = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("HANGOUTS", 7, 7);
    HANGOUTS = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("YAHOO", 8, 8);
    YAHOO = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("KIK", 9, 9);
    KIK = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("TELEGRAM", 10, 10);
    TELEGRAM = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("TINDER", 11, 11);
    TINDER = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("SNAPCHAT", 12, 12);
    SNAPCHAT = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("QQ", 13, 13);
    QQ = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    ((ImType)localObject).<init>("INSTAGRAM", 14, 14);
    INSTAGRAM = (ImType)localObject;
    localObject = new com/vvt/im/events/ImType;
    int i1 = 15;
    int i2 = 15;
    ((ImType)localObject).<init>("HIKE", i1, i2);
    HIKE = (ImType)localObject;
    int i3 = 16;
    localObject = new ImType[i3];
    ImType localImType1 = WHATSAPP;
    localObject[0] = localImType1;
    localImType1 = FACEBOOK;
    localObject[m] = localImType1;
    localImType1 = LINE;
    localObject[k] = localImType1;
    localImType1 = SKYPE;
    localObject[j] = localImType1;
    localImType1 = VIBER;
    localObject[i] = localImType1;
    ImType localImType2 = WECHAT;
    localObject[5] = localImType2;
    localImType2 = BBM;
    localObject[6] = localImType2;
    localImType2 = HANGOUTS;
    localObject[7] = localImType2;
    localImType2 = YAHOO;
    localObject[8] = localImType2;
    localImType2 = KIK;
    localObject[9] = localImType2;
    localImType2 = TELEGRAM;
    localObject[10] = localImType2;
    localImType2 = TINDER;
    localObject[11] = localImType2;
    localImType2 = SNAPCHAT;
    localObject[12] = localImType2;
    localImType2 = QQ;
    localObject[13] = localImType2;
    localImType2 = INSTAGRAM;
    localObject[14] = localImType2;
    localImType2 = HIKE;
    localObject[15] = localImType2;
    b = (ImType[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localImType2 = localObject[n];
      Map localMap = a;
      m = localImType2.number;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localImType2);
      n += 1;
    }
  }
  
  private ImType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/ImType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */