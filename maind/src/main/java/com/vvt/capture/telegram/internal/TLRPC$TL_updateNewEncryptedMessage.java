package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateNewEncryptedMessage
  extends TLRPC.Update
{
  public static int constructor = 314359194;
  public TLRPC.EncryptedMessage message;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.EncryptedMessage localEncryptedMessage = TLRPC.EncryptedMessage.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.message = localEncryptedMessage;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.qts = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.message.serializeToStream(paramAbstractSerializedData);
    i = this.qts;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateNewEncryptedMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */