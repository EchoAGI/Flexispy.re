package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageActionChatEditPhoto
  extends TLRPC.MessageAction
{
  public static int constructor = 2144015272;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Photo localPhoto = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo = localPhoto;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.photo.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatEditPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */