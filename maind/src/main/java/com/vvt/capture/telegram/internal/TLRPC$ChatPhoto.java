package com.vvt.capture.telegram.internal;

public class TLRPC$ChatPhoto
  extends TLObject
{
  public TLRPC.FileLocation photo_big;
  public TLRPC.FileLocation photo_small;
  
  public static ChatPhoto TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ChatPhoto", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatPhotoEmpty;
      ((TLRPC.TL_chatPhotoEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatPhoto;
      ((TLRPC.TL_chatPhoto)localObject).<init>();
    }
    if (localObject != null) {
      ((ChatPhoto)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChatPhoto)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChatPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */