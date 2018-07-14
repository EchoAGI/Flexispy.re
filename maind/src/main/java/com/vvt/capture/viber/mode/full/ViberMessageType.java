package com.vvt.capture.viber.mode.full;

import java.util.HashMap;
import java.util.Map;

public enum ViberMessageType
{
  private static final Map a;
  private final String value;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("TEXT", 0, "text");
    TEXT = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("LOCATION", m, "location");
    LOCATION = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("STICKER", k, "sticker");
    STICKER = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("VIDEO", j, "video");
    VIDEO = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("IMAGE", i, "image");
    IMAGE = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("AUDIO", 5, "sound");
    AUDIO = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("CONTACT", 6, "share_contact");
    CONTACT = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("CALL", 7, "call");
    CALL = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("FILE", 8, "file");
    FILE = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    ((ViberMessageType)localObject1).<init>("VIDEO_WINK", 9, "video_wink");
    VIDEO_WINK = (ViberMessageType)localObject1;
    localObject1 = new com/vvt/capture/viber/mode/full/ViberMessageType;
    int i1 = 10;
    Object localObject2 = "image_wink";
    ((ViberMessageType)localObject1).<init>("IMAGE_WINK", i1, (String)localObject2);
    IMAGE_WINK = (ViberMessageType)localObject1;
    int i2 = 11;
    localObject1 = new ViberMessageType[i2];
    ViberMessageType localViberMessageType1 = TEXT;
    localObject1[0] = localViberMessageType1;
    localViberMessageType1 = LOCATION;
    localObject1[m] = localViberMessageType1;
    localViberMessageType1 = STICKER;
    localObject1[k] = localViberMessageType1;
    localViberMessageType1 = VIDEO;
    localObject1[j] = localViberMessageType1;
    localViberMessageType1 = IMAGE;
    localObject1[i] = localViberMessageType1;
    ViberMessageType localViberMessageType2 = AUDIO;
    localObject1[5] = localViberMessageType2;
    localViberMessageType2 = CONTACT;
    localObject1[6] = localViberMessageType2;
    localViberMessageType2 = CALL;
    localObject1[7] = localViberMessageType2;
    localViberMessageType2 = FILE;
    localObject1[8] = localViberMessageType2;
    localViberMessageType2 = VIDEO_WINK;
    localObject1[9] = localViberMessageType2;
    localViberMessageType2 = IMAGE_WINK;
    localObject1[10] = localViberMessageType2;
    b = (ViberMessageType[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i3 = localObject1.length;
    while (n < i3)
    {
      localViberMessageType2 = localObject1[n];
      localObject2 = a;
      String str = localViberMessageType2.value;
      ((Map)localObject2).put(str, localViberMessageType2);
      n += 1;
    }
  }
  
  private ViberMessageType(String paramString1)
  {
    this.value = paramString1;
  }
  
  static ViberMessageType forValue(String paramString)
  {
    return (ViberMessageType)a.get(paramString);
  }
  
  public String getNumber()
  {
    return this.value;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/viber/mode/full/ViberMessageType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */