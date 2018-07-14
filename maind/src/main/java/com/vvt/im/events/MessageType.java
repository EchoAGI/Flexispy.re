package com.vvt.im.events;

import java.util.HashMap;
import java.util.Map;

public enum MessageType
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 3;
    int j = 4;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject = new com/vvt/im/events/MessageType;
    ((MessageType)localObject).<init>("none", 0, 0);
    none = (MessageType)localObject;
    localObject = new com/vvt/im/events/MessageType;
    ((MessageType)localObject).<init>("Text", m, m);
    Text = (MessageType)localObject;
    localObject = new com/vvt/im/events/MessageType;
    ((MessageType)localObject).<init>("Emoji", k, k);
    Emoji = (MessageType)localObject;
    localObject = new com/vvt/im/events/MessageType;
    ((MessageType)localObject).<init>("Emoticon", i, j);
    Emoticon = (MessageType)localObject;
    localObject = new com/vvt/im/events/MessageType;
    ((MessageType)localObject).<init>("Sticker", j, 8);
    Sticker = (MessageType)localObject;
    localObject = new com/vvt/im/events/MessageType;
    ((MessageType)localObject).<init>("Contact", 5, 16);
    Contact = (MessageType)localObject;
    localObject = new com/vvt/im/events/MessageType;
    int i1 = 6;
    int i2 = 32;
    ((MessageType)localObject).<init>("ShareLocation", i1, i2);
    ShareLocation = (MessageType)localObject;
    int i3 = 7;
    localObject = new MessageType[i3];
    MessageType localMessageType1 = none;
    localObject[0] = localMessageType1;
    localMessageType1 = Text;
    localObject[m] = localMessageType1;
    localMessageType1 = Emoji;
    localObject[k] = localMessageType1;
    localMessageType1 = Emoticon;
    localObject[i] = localMessageType1;
    localMessageType1 = Sticker;
    localObject[j] = localMessageType1;
    MessageType localMessageType2 = Contact;
    localObject[5] = localMessageType2;
    localMessageType2 = ShareLocation;
    localObject[6] = localMessageType2;
    b = (MessageType[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localMessageType2 = localObject[n];
      Map localMap = a;
      m = localMessageType2.number;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localMessageType2);
      n += 1;
    }
  }
  
  private MessageType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static MessageType forValue(int paramInt)
  {
    Object localObject = a;
    Integer localInteger = Integer.valueOf(paramInt);
    localObject = ((Map)localObject).get(localInteger);
    if (localObject == null) {}
    for (localObject = none;; localObject = (MessageType)((Map)localObject).get(localInteger))
    {
      return (MessageType)localObject;
      localObject = a;
      localInteger = Integer.valueOf(paramInt);
    }
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/MessageType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */