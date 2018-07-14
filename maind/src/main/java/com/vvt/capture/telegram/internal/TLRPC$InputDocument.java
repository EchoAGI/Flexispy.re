package com.vvt.capture.telegram.internal;

public class TLRPC$InputDocument
  extends TLObject
{
  public long access_hash;
  public long id;
  
  public static InputDocument TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputDocument", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputDocumentEmpty;
      ((TLRPC.TL_inputDocumentEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputDocument;
      ((TLRPC.TL_inputDocument)localObject).<init>();
    }
    if (localObject != null) {
      ((InputDocument)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputDocument)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputDocument.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */