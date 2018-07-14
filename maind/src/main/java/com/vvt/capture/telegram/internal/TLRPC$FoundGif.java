package com.vvt.capture.telegram.internal;

public class TLRPC$FoundGif
  extends TLObject
{
  public String content_type;
  public String content_url;
  public TLRPC.Document document;
  public int h;
  public TLRPC.Photo photo;
  public String thumb_url;
  public String url;
  public int w;
  
  public static FoundGif TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in FoundGif", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_foundGifCached;
      ((TLRPC.TL_foundGifCached)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_foundGif;
      ((TLRPC.TL_foundGif)localObject).<init>();
    }
    if (localObject != null) {
      ((FoundGif)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (FoundGif)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$FoundGif.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */