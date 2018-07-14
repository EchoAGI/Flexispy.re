package com.vvt.capture.telegram.internal;

public class TLRPC$TL_userProfilePhoto_old
  extends TLRPC.TL_userProfilePhoto
{
  public static int constructor = -1727196013;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.FileLocation localFileLocation = TLRPC.FileLocation.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo_small = localFileLocation;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localFileLocation = TLRPC.FileLocation.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo_big = localFileLocation;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.photo_small.serializeToStream(paramAbstractSerializedData);
    this.photo_big.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_userProfilePhoto_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */