package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_updatePasswordSettings
  extends TLObject
{
  public static int constructor = -92517498;
  public byte[] current_password_hash;
  public TLRPC.TL_account_passwordInputSettings new_settings;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.current_password_hash;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    this.new_settings.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_updatePasswordSettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */