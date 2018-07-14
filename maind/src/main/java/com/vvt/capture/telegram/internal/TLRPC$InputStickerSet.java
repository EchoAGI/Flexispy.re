package com.vvt.capture.telegram.internal;

public class TLRPC$InputStickerSet
  extends TLObject
{
  public long access_hash;
  public long id;
  public String short_name;
  
  public static InputStickerSet TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputStickerSet", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputStickerSetEmpty;
      ((TLRPC.TL_inputStickerSetEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputStickerSetID;
      ((TLRPC.TL_inputStickerSetID)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputStickerSetShortName;
      ((TLRPC.TL_inputStickerSetShortName)localObject).<init>();
    }
    if (localObject != null) {
      ((InputStickerSet)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputStickerSet)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputStickerSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */