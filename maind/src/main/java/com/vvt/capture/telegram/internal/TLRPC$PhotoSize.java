package com.vvt.capture.telegram.internal;

public class TLRPC$PhotoSize
  extends TLObject
{
  public byte[] bytes;
  public int h;
  public TLRPC.FileLocation location;
  public int size;
  public String type;
  public int w;
  
  public static PhotoSize TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in PhotoSize", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photoSize;
      ((TLRPC.TL_photoSize)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photoSizeEmpty;
      ((TLRPC.TL_photoSizeEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photoCachedSize;
      ((TLRPC.TL_photoCachedSize)localObject).<init>();
    }
    if (localObject != null) {
      ((PhotoSize)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (PhotoSize)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$PhotoSize.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */