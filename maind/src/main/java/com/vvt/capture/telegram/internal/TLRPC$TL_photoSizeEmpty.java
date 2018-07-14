package com.vvt.capture.telegram.internal;

public class TLRPC$TL_photoSizeEmpty
  extends TLRPC.PhotoSize
{
  public static int constructor = 236446268;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.type = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.type;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photoSizeEmpty.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */