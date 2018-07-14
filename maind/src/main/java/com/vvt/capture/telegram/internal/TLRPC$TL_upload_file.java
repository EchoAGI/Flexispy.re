package com.vvt.capture.telegram.internal;

public class TLRPC$TL_upload_file
  extends TLObject
{
  public static int constructor = 157948117;
  public NativeByteBuffer bytes;
  public int mtime;
  public TLRPC.storage_FileType type;
  
  public static TL_upload_file TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_upload_file", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_upload_file)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_upload_file;
      ((TL_upload_file)localObject).<init>();
      ((TL_upload_file)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
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
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.storage_FileType.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.type = ((TLRPC.storage_FileType)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.mtime = i;
    localObject = paramAbstractSerializedData.readByteBuffer(paramBoolean);
    this.bytes = ((NativeByteBuffer)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_upload_file.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */