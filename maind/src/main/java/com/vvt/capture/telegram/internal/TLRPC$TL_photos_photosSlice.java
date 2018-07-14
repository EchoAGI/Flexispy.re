package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_photos_photosSlice
  extends TLRPC.photos_Photos
{
  public static int constructor = 352657236;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 481674261;
    int j = 1;
    int k = 0;
    String str = null;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    this.count = m;
    m = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1;
    Object localObject2;
    Integer localInteger;
    int n;
    Object localObject3;
    if (m != i)
    {
      if (paramBoolean)
      {
        localObject1 = new java/lang/RuntimeException;
        localObject2 = new Object[j];
        localInteger = Integer.valueOf(m);
        localObject2[0] = localInteger;
        str = String.format("wrong Vector magic, got %x", (Object[])localObject2);
        ((RuntimeException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      m = 0;
      localInteger = null;
      if (m >= n) {
        break label151;
      }
      int i1 = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
      if (localObject3 != null) {
        break label128;
      }
    }
    label128:
    label151:
    label268:
    for (;;)
    {
      return;
      localObject2 = this.photos;
      ((ArrayList)localObject2).add(localObject3);
      m += 1;
      break;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      if (m != i)
      {
        if (paramBoolean)
        {
          localObject1 = new java/lang/RuntimeException;
          localObject2 = new Object[j];
          localInteger = Integer.valueOf(m);
          localObject2[0] = localInteger;
          str = String.format("wrong Vector magic, got %x", (Object[])localObject2);
          ((RuntimeException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        m = paramAbstractSerializedData.readInt32(paramBoolean);
        for (;;)
        {
          if (k >= m) {
            break label268;
          }
          n = paramAbstractSerializedData.readInt32(paramBoolean);
          localObject1 = TLRPC.User.TLdeserialize(paramAbstractSerializedData, n, paramBoolean);
          if (localObject1 == null) {
            break;
          }
          localObject3 = this.users;
          ((ArrayList)localObject3).add(localObject1);
          k += 1;
        }
      }
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = 481674261;
    int j = 0;
    int k = constructor;
    paramAbstractSerializedData.writeInt32(k);
    k = this.count;
    paramAbstractSerializedData.writeInt32(k);
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.photos;
    int m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (int n = 0; n < m; n = k)
    {
      localObject = (TLRPC.Photo)this.photos.get(n);
      ((TLRPC.Photo)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.users;
    n = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(n);
    while (j < n)
    {
      localObject = (TLRPC.User)this.users.get(j);
      ((TLRPC.User)localObject).serializeToStream(paramAbstractSerializedData);
      k = j + 1;
      j = k;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photos_photosSlice.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */