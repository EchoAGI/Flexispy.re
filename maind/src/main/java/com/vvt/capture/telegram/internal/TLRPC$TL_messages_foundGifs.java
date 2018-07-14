package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_foundGifs
  extends TLObject
{
  public static int constructor = 1158290442;
  public int next_offset;
  public ArrayList results;
  
  public TLRPC$TL_messages_foundGifs()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.results = localArrayList;
  }
  
  public static TL_messages_foundGifs TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_messages_foundGifs", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messages_foundGifs)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_foundGifs;
      ((TL_messages_foundGifs)localObject).<init>();
      ((TL_messages_foundGifs)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.next_offset = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(j);
        arrayOfObject[0] = localInteger;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
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
        localObject = TLRPC.FoundGif.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.results;
      localArrayList.add(localObject);
      i += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.next_offset;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.results.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.FoundGif localFoundGif = null;
    for (int k = 0; k < j; k = i)
    {
      localFoundGif = (TLRPC.FoundGif)this.results.get(k);
      localFoundGif.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_foundGifs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */