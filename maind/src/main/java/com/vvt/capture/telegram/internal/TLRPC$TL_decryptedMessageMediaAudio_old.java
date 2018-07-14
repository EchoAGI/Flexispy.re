package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageMediaAudio_old
  extends TLRPC.TL_decryptedMessageMediaAudio
{
  public static int constructor = 1619031439;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.duration = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = i;
    byte[] arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.key = arrayOfByte;
    arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.iv = arrayOfByte;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.duration;
    paramAbstractSerializedData.writeInt32(i);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.key;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    arrayOfByte = this.iv;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaAudio_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */