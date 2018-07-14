package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputMediaUploadedThumbVideo
  extends TLRPC.InputMedia
{
  public static int constructor = 2004934137;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.InputFile.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.file = ((TLRPC.InputFile)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.InputFile.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.thumb = ((TLRPC.InputFile)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.duration = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.w = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.h = i;
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.caption = ((String)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.file.serializeToStream(paramAbstractSerializedData);
    this.thumb.serializeToStream(paramAbstractSerializedData);
    i = this.duration;
    paramAbstractSerializedData.writeInt32(i);
    i = this.w;
    paramAbstractSerializedData.writeInt32(i);
    i = this.h;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.mime_type;
    paramAbstractSerializedData.writeString(str);
    str = this.caption;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedThumbVideo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */