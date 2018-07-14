package com.vvt.capture.telegram.internal;

public class TLRPC$InputVideo
  extends TLObject
{
  public long access_hash;
  public long id;
  
  public static InputVideo TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputVideo", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputVideoEmpty;
      ((TLRPC.TL_inputVideoEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputVideo;
      ((TLRPC.TL_inputVideo)localObject).<init>();
    }
    if (localObject != null) {
      ((InputVideo)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputVideo)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputVideo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */