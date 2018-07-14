package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_bindTempAuthKey
  extends TLObject
{
  public static int constructor = -841733627;
  public byte[] encrypted_message;
  public int expires_at;
  public long nonce;
  public long perm_auth_key_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.perm_auth_key_id;
    paramAbstractSerializedData.writeInt64(l);
    l = this.nonce;
    paramAbstractSerializedData.writeInt64(l);
    i = this.expires_at;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.encrypted_message;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_bindTempAuthKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */