package com.vvt.capture.telegram.internal;

public class TLRPC$TL_upload_getFile
  extends TLObject
{
  public static int constructor = -475607115;
  public int limit;
  public TLRPC.InputFileLocation location;
  public int offset;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_upload_file.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.location.serializeToStream(paramAbstractSerializedData);
    i = this.offset;
    paramAbstractSerializedData.writeInt32(i);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_upload_getFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */