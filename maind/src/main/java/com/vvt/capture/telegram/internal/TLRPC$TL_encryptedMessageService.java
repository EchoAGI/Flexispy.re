package com.vvt.capture.telegram.internal;

public class TLRPC$TL_encryptedMessageService
  extends TLRPC.EncryptedMessage
{
  public static int constructor = 594758406;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.random_id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.chat_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    byte[] arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.bytes = arrayOfByte;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.bytes;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_encryptedMessageService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */