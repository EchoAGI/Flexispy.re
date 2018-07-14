package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_wallPaper
  extends TLRPC.WallPaper
{
  public static int constructor = -860866985;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = j;
    Object localObject1 = paramAbstractSerializedData.readString(paramBoolean);
    this.title = ((String)localObject1);
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
    else
    {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      if (i >= j) {
        break label152;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject2 = TLRPC.PhotoSize.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      if (localObject2 != null) {
        break label131;
      }
    }
    for (;;)
    {
      return;
      label131:
      ArrayList localArrayList = this.sizes;
      localArrayList.add(localObject2);
      i += 1;
      break;
      label152:
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.color = i;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.title;
    paramAbstractSerializedData.writeString((String)localObject);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.sizes.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    localObject = null;
    for (int k = 0; k < j; k = i)
    {
      localObject = (TLRPC.PhotoSize)this.sizes.get(k);
      ((TLRPC.PhotoSize)localObject).serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
    i = this.color;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_wallPaper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */