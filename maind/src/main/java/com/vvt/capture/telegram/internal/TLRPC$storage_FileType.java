package com.vvt.capture.telegram.internal;

public class TLRPC$storage_FileType
  extends TLObject
{
  public static storage_FileType TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in storage_FileType", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_fileUnknown;
      ((TLRPC.TL_storage_fileUnknown)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_fileMp4;
      ((TLRPC.TL_storage_fileMp4)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_fileWebp;
      ((TLRPC.TL_storage_fileWebp)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_filePng;
      ((TLRPC.TL_storage_filePng)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_fileGif;
      ((TLRPC.TL_storage_fileGif)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_filePdf;
      ((TLRPC.TL_storage_filePdf)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_fileMp3;
      ((TLRPC.TL_storage_fileMp3)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_fileJpeg;
      ((TLRPC.TL_storage_fileJpeg)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_fileMov;
      ((TLRPC.TL_storage_fileMov)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_storage_filePartial;
      ((TLRPC.TL_storage_filePartial)localObject).<init>();
    }
    if (localObject != null) {
      ((storage_FileType)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (storage_FileType)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$storage_FileType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */