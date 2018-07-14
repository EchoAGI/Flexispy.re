package com.vvt.capture.telegram.internal;

public class TLRPC$TL_foundGif
  extends TLRPC.FoundGif
{
  public static int constructor = 372165663;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.url = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.thumb_url = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.content_url = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.content_type = str;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.w = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.h = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.url;
    paramAbstractSerializedData.writeString(str);
    str = this.thumb_url;
    paramAbstractSerializedData.writeString(str);
    str = this.content_url;
    paramAbstractSerializedData.writeString(str);
    str = this.content_type;
    paramAbstractSerializedData.writeString(str);
    i = this.w;
    paramAbstractSerializedData.writeInt32(i);
    i = this.h;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_foundGif.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */