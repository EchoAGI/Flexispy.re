package com.vvt.capture.telegram.internal;

public class TLRPC$InputChatPhoto
  extends TLObject
{
  public TLRPC.InputPhotoCrop crop;
  public TLRPC.InputFile file;
  public TLRPC.InputPhoto id;
  
  public static InputChatPhoto TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputChatPhoto", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputChatPhoto;
      ((TLRPC.TL_inputChatPhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputChatPhotoEmpty;
      ((TLRPC.TL_inputChatPhotoEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputChatUploadedPhoto;
      ((TLRPC.TL_inputChatUploadedPhoto)localObject).<init>();
    }
    if (localObject != null) {
      ((InputChatPhoto)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputChatPhoto)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputChatPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */