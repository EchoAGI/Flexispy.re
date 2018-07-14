package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_photos_photo
  extends TLObject
{
  public static int constructor = 539045032;
  public TLRPC.Photo photo;
  public ArrayList users;
  
  public TLRPC$TL_photos_photo()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static TL_photos_photo TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_photos_photo", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_photos_photo)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_photos_photo;
      ((TL_photos_photo)localObject).<init>();
      ((TL_photos_photo)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1 = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.photo = ((TLRPC.Photo)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject2;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject2 = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        localObject1 = Integer.valueOf(j);
        arrayOfObject[0] = localObject1;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    else {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
    }
    for (;;)
    {
      if (i < j)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject2 = TLRPC.User.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject2 != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.users;
      localArrayList.add(localObject2);
      i += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.photo.serializeToStream(paramAbstractSerializedData);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.users.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.User localUser = null;
    for (int k = 0; k < j; k = i)
    {
      localUser = (TLRPC.User)this.users.get(k);
      localUser.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photos_photo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */