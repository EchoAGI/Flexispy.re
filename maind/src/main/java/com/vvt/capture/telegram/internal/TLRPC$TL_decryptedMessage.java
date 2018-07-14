package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessage
  extends TLRPC.DecryptedMessage
{
  public static int constructor = 541931640;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.random_id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.ttl = i;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.message = ((String)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.DecryptedMessageMedia.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.media = ((TLRPC.DecryptedMessageMedia)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.ttl;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.message;
    paramAbstractSerializedData.writeString(str);
    this.media.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */