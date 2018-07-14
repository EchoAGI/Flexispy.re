package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageActionCommitKey
  extends TLRPC.DecryptedMessageAction
{
  public static int constructor = -332526693;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.exchange_id = l;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.key_fingerprint = l;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.exchange_id;
    paramAbstractSerializedData.writeInt64(l);
    l = this.key_fingerprint;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionCommitKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */