package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$Photo
  extends TLObject
{
  public long access_hash;
  public String caption;
  public int date;
  public int flags;
  public TLRPC.GeoPoint geo;
  public boolean has_stickers;
  public long id;
  public ArrayList sizes;
  public int user_id;
  
  public TLRPC$Photo()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.sizes = localArrayList;
  }
  
  public static Photo TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Photo", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photo_old;
      ((TLRPC.TL_photo_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photo;
      ((TLRPC.TL_photo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photo_layer55;
      ((TLRPC.TL_photo_layer55)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photo_old2;
      ((TLRPC.TL_photo_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photoEmpty;
      ((TLRPC.TL_photoEmpty)localObject).<init>();
    }
    if (localObject != null) {
      ((Photo)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Photo)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Photo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */