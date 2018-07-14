package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_requestPasswordRecovery
  extends TLObject
{
  public static int constructor = -661144474;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_auth_passwordRecovery.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_requestPasswordRecovery.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */