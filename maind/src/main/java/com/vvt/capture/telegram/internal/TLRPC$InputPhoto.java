package com.vvt.capture.telegram.internal;

public class TLRPC$InputPhoto
  extends TLObject
{
  public long access_hash;
  public long id;
  
  public static InputPhoto TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputPhoto", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPhotoEmpty;
      ((TLRPC.TL_inputPhotoEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPhoto;
      ((TLRPC.TL_inputPhoto)localObject).<init>();
    }
    if (localObject != null) {
      ((InputPhoto)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputPhoto)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */