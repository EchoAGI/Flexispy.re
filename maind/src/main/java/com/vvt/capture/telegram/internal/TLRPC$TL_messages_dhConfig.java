package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_dhConfig
  extends TLRPC.messages_DhConfig
{
  public static int constructor = 740433629;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.g = i;
    byte[] arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.p = arrayOfByte;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.version = i;
    arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.random = arrayOfByte;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.g;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.p;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    i = this.version;
    paramAbstractSerializedData.writeInt32(i);
    arrayOfByte = this.random;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_dhConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */