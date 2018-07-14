package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageActionAbortKey
  extends TLRPC.DecryptedMessageAction
{
  public static int constructor = -586814357;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.exchange_id = l;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.exchange_id;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionAbortKey.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */