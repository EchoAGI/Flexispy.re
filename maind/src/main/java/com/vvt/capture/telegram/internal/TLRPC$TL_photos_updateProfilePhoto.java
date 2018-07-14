package com.vvt.capture.telegram.internal;

public class TLRPC$TL_photos_updateProfilePhoto
  extends TLObject
{
  public static int constructor = -285902432;
  public TLRPC.InputPhotoCrop crop;
  public TLRPC.InputPhoto id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.UserProfilePhoto.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.id.serializeToStream(paramAbstractSerializedData);
    this.crop.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photos_updateProfilePhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */