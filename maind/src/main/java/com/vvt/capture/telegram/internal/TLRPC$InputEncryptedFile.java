package com.vvt.capture.telegram.internal;

public class TLRPC$InputEncryptedFile
  extends TLObject
{
  public long access_hash;
  public long id;
  public int key_fingerprint;
  public String md5_checksum;
  public int parts;
  
  public static InputEncryptedFile TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputEncryptedFile", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputEncryptedFile;
      ((TLRPC.TL_inputEncryptedFile)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputEncryptedFileBigUploaded;
      ((TLRPC.TL_inputEncryptedFileBigUploaded)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputEncryptedFileEmpty;
      ((TLRPC.TL_inputEncryptedFileEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputEncryptedFileUploaded;
      ((TLRPC.TL_inputEncryptedFileUploaded)localObject).<init>();
    }
    if (localObject != null) {
      ((InputEncryptedFile)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputEncryptedFile)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputEncryptedFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */