package com.vvt.capture.telegram.internal;

public class TLRPC$InputFile
  extends TLObject
{
  public long id;
  public String md5_checksum;
  public String name;
  public int parts;
  
  public static InputFile TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputFile", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputFileBig;
      ((TLRPC.TL_inputFileBig)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputFile;
      ((TLRPC.TL_inputFile)localObject).<init>();
    }
    if (localObject != null) {
      ((InputFile)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputFile)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */