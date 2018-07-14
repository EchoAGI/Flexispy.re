package com.vvt.capture.telegram.internal;

public class TLRPC$TL_userSelf_old2
  extends TLRPC.TL_userSelf_old3
{
  public static int constructor = 1879553105;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.first_name = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.last_name = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.username = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.phone = ((String)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.UserProfilePhoto.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo = ((TLRPC.UserProfilePhoto)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.UserStatus.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.status = ((TLRPC.UserStatus)localObject);
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.inactive = bool;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.first_name;
    paramAbstractSerializedData.writeString(str);
    str = this.last_name;
    paramAbstractSerializedData.writeString(str);
    str = this.username;
    paramAbstractSerializedData.writeString(str);
    str = this.phone;
    paramAbstractSerializedData.writeString(str);
    this.photo.serializeToStream(paramAbstractSerializedData);
    this.status.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.inactive;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_userSelf_old2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */