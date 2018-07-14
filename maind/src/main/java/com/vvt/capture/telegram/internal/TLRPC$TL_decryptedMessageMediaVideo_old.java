package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageMediaVideo_old
  extends TLRPC.TL_decryptedMessageMediaVideo
{
  public static int constructor = 1290694387;
  public byte[] thumb;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    byte[] arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.thumb = arrayOfByte;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.thumb_w = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.thumb_h = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.duration = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.w = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.h = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = i;
    arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.key = arrayOfByte;
    arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.iv = arrayOfByte;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.thumb;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    i = this.thumb_w;
    paramAbstractSerializedData.writeInt32(i);
    i = this.thumb_h;
    paramAbstractSerializedData.writeInt32(i);
    i = this.duration;
    paramAbstractSerializedData.writeInt32(i);
    i = this.w;
    paramAbstractSerializedData.writeInt32(i);
    i = this.h;
    paramAbstractSerializedData.writeInt32(i);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
    arrayOfByte = this.key;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    arrayOfByte = this.iv;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaVideo_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */