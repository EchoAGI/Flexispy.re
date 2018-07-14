package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputChatPhoto
  extends TLRPC.InputChatPhoto
{
  public static int constructor = -1293828344;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.InputPhoto.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.id = ((TLRPC.InputPhoto)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.InputPhotoCrop.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.crop = ((TLRPC.InputPhotoCrop)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.id.serializeToStream(paramAbstractSerializedData);
    this.crop.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputChatPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */