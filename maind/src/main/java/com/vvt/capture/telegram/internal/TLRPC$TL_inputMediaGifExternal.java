package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputMediaGifExternal
  extends TLRPC.InputMedia
{
  public static int constructor = 1212395773;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.url = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.q = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.url;
    paramAbstractSerializedData.writeString(str);
    str = this.q;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaGifExternal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */