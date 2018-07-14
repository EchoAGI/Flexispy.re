package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_stickerSet
  extends TLObject
{
  public static int constructor = -1240849242;
  public ArrayList documents;
  public ArrayList packs;
  public TLRPC.StickerSet set;
  
  public TLRPC$TL_messages_stickerSet()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.packs = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.documents = localArrayList;
  }
  
  public static TL_messages_stickerSet TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_messages_stickerSet", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messages_stickerSet)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_stickerSet;
      ((TL_messages_stickerSet)localObject).<init>();
      ((TL_messages_stickerSet)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 481674261;
    int j = 1;
    int k = 0;
    String str = null;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1 = TLRPC.StickerSet.TLdeserialize(paramAbstractSerializedData, m, paramBoolean);
    this.set = ((TLRPC.StickerSet)localObject1);
    m = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject2;
    Object localObject3;
    int n;
    Object localObject4;
    if (m != i)
    {
      if (paramBoolean)
      {
        localObject2 = new java/lang/RuntimeException;
        localObject3 = new Object[j];
        localObject1 = Integer.valueOf(m);
        localObject3[0] = localObject1;
        str = String.format("wrong Vector magic, got %x", (Object[])localObject3);
        ((RuntimeException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    else
    {
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      m = 0;
      localObject1 = null;
      if (m >= n) {
        break label160;
      }
      int i1 = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject4 = TLRPC.TL_stickerPack.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
      if (localObject4 != null) {
        break label137;
      }
    }
    label137:
    label160:
    label277:
    for (;;)
    {
      return;
      localObject3 = this.packs;
      ((ArrayList)localObject3).add(localObject4);
      m += 1;
      break;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      if (m != i)
      {
        if (paramBoolean)
        {
          localObject2 = new java/lang/RuntimeException;
          localObject3 = new Object[j];
          localObject1 = Integer.valueOf(m);
          localObject3[0] = localObject1;
          str = String.format("wrong Vector magic, got %x", (Object[])localObject3);
          ((RuntimeException)localObject2).<init>(str);
          throw ((Throwable)localObject2);
        }
      }
      else
      {
        m = paramAbstractSerializedData.readInt32(paramBoolean);
        for (;;)
        {
          if (k >= m) {
            break label277;
          }
          n = paramAbstractSerializedData.readInt32(paramBoolean);
          localObject2 = TLRPC.Document.TLdeserialize(paramAbstractSerializedData, n, paramBoolean);
          if (localObject2 == null) {
            break;
          }
          localObject4 = this.documents;
          ((ArrayList)localObject4).add(localObject2);
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
    this.set.serializeToStream(paramAbstractSerializedData);
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.packs;
    int m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (int n = 0; n < m; n = k)
    {
      localObject = (TLRPC.TL_stickerPack)this.packs.get(n);
      ((TLRPC.TL_stickerPack)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.documents;
    n = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(n);
    while (j < n)
    {
      localObject = (TLRPC.Document)this.documents.get(j);
      ((TLRPC.Document)localObject).serializeToStream(paramAbstractSerializedData);
      k = j + 1;
      j = k;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_stickerSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */