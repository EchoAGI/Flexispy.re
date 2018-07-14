package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_stickerPack
  extends TLObject
{
  public static int constructor = 313694676;
  public ArrayList documents;
  public String emoticon;
  
  public TLRPC$TL_stickerPack()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.documents = localArrayList;
  }
  
  public static TL_stickerPack TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_stickerPack", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_stickerPack)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_stickerPack;
      ((TL_stickerPack)localObject).<init>();
      ((TL_stickerPack)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    Object localObject1 = paramAbstractSerializedData.readString(paramBoolean);
    this.emoticon = ((String)localObject1);
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
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
      while (i < j)
      {
        localObject2 = this.documents;
        long l = paramAbstractSerializedData.readInt64(paramBoolean);
        Long localLong = Long.valueOf(l);
        ((ArrayList)localObject2).add(localLong);
        i += 1;
      }
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.emoticon;
    paramAbstractSerializedData.writeString((String)localObject);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.documents.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    localObject = null;
    for (int k = 0; k < j; k = i)
    {
      localObject = (Long)this.documents.get(k);
      long l = ((Long)localObject).longValue();
      paramAbstractSerializedData.writeInt64(l);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_stickerPack.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */