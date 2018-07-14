package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateUserPhoto
  extends TLRPC.Update
{
  public static int constructor = -1791935732;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.UserProfilePhoto localUserProfilePhoto = TLRPC.UserProfilePhoto.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo = localUserProfilePhoto;
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.previous = bool;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    this.photo.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.previous;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateUserPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */