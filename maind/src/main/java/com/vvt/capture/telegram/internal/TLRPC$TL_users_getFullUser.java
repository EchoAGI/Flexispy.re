package com.vvt.capture.telegram.internal;

public class TLRPC$TL_users_getFullUser
  extends TLObject
{
  public static int constructor = -902781519;
  public TLRPC.InputUser id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_userFull.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.id.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_users_getFullUser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */