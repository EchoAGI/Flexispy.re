package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageMediaAudio
  extends TLRPC.DecryptedMessageMedia
{
  public static int constructor = 1474341323;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.duration = i;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = i;
    localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.key = ((byte[])localObject);
    localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.iv = ((byte[])localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.duration;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.mime_type;
    paramAbstractSerializedData.writeString((String)localObject);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.key;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    localObject = this.iv;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaAudio.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */