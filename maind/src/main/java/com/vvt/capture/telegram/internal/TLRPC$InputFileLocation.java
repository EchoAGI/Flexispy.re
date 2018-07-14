package com.vvt.capture.telegram.internal;

public class TLRPC$InputFileLocation
  extends TLObject
{
  public long access_hash;
  public long id;
  public int local_id;
  public long secret;
  public long volume_id;
  
  public static InputFileLocation TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputFileLocation", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputAudioFileLocation;
      ((TLRPC.TL_inputAudioFileLocation)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputEncryptedFileLocation;
      ((TLRPC.TL_inputEncryptedFileLocation)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputVideoFileLocation;
      ((TLRPC.TL_inputVideoFileLocation)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputDocumentFileLocation;
      ((TLRPC.TL_inputDocumentFileLocation)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputFileLocation;
      ((TLRPC.TL_inputFileLocation)localObject).<init>();
    }
    if (localObject != null) {
      ((InputFileLocation)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputFileLocation)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputFileLocation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */