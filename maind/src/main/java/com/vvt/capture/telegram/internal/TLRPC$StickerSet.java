package com.vvt.capture.telegram.internal;

public class TLRPC$StickerSet
  extends TLObject
{
  public long access_hash;
  public int count;
  public boolean disabled;
  public int flags;
  public int hash;
  public long id;
  public boolean installed;
  public boolean official;
  public String short_name;
  public String title;
  
  public static StickerSet TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in StickerSet", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_stickerSet_old;
      ((TLRPC.TL_stickerSet_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_stickerSet;
      ((TLRPC.TL_stickerSet)localObject).<init>();
    }
    if (localObject != null) {
      ((StickerSet)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (StickerSet)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$StickerSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */