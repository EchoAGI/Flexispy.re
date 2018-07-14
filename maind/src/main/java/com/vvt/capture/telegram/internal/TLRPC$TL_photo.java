package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_photo
  extends TLRPC.Photo
{
  public static int constructor = -1836524247;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    int k = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = k;
    k = this.flags & 0x1;
    if (k != 0) {
      k = i;
    }
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      this.has_stickers = k;
      long l = paramAbstractSerializedData.readInt64(paramBoolean);
      this.id = l;
      l = paramAbstractSerializedData.readInt64(paramBoolean);
      this.access_hash = l;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int m = 481674261;
      if (k == m) {
        break;
      }
      if (!paramBoolean) {
        break label186;
      }
      localObject1 = new java/lang/RuntimeException;
      localObject2 = new Object[i];
      Object localObject3 = Integer.valueOf(k);
      localObject2[0] = localObject3;
      localObject3 = String.format("wrong Vector magic, got %x", (Object[])localObject2);
      ((RuntimeException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
      k = 0;
      localObject3 = null;
    }
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    for (;;)
    {
      if (j < k)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject2 = TLRPC.PhotoSize.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
        if (localObject2 != null) {}
      }
      else
      {
        label186:
        return;
      }
      localObject1 = this.sizes;
      ((ArrayList)localObject1).add(localObject2);
      j += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.has_stickers;
    if (bool) {}
    for (int j = this.flags | 0x1;; j = this.flags & 0xFFFFFFFE)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      long l = this.id;
      paramAbstractSerializedData.writeInt64(l);
      l = this.access_hash;
      paramAbstractSerializedData.writeInt64(l);
      j = this.date;
      paramAbstractSerializedData.writeInt32(j);
      paramAbstractSerializedData.writeInt32(481674261);
      int k = this.sizes.size();
      paramAbstractSerializedData.writeInt32(k);
      j = 0;
      TLRPC.PhotoSize localPhotoSize = null;
      for (int m = 0; m < k; m = j)
      {
        localPhotoSize = (TLRPC.PhotoSize)this.sizes.get(m);
        localPhotoSize.serializeToStream(paramAbstractSerializedData);
        j = m + 1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */