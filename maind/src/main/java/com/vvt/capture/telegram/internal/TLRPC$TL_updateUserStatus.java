package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateUserStatus
  extends TLRPC.Update
{
  public static int constructor = 469489699;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.UserStatus localUserStatus = TLRPC.UserStatus.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.status = localUserStatus;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    this.status.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateUserStatus.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */