package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_botResults
  extends TLObject
{
  public static int constructor = 292597923;
  public int flags;
  public boolean gallery;
  public String next_offset;
  public long query_id;
  public ArrayList results;
  
  public TLRPC$TL_messages_botResults()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.results = localArrayList;
  }
  
  public static TL_messages_botResults TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_messages_botResults", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messages_botResults)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_botResults;
      ((TL_messages_botResults)localObject).<init>();
      ((TL_messages_botResults)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
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
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      this.gallery = k;
      long l = paramAbstractSerializedData.readInt64(paramBoolean);
      this.query_id = l;
      k = this.flags & 0x2;
      if (k != 0)
      {
        localObject1 = paramAbstractSerializedData.readString(paramBoolean);
        this.next_offset = ((String)localObject1);
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int m = 481674261;
      if (k == m) {
        break;
      }
      if (!paramBoolean) {
        break label186;
      }
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new Object[i];
      Object localObject1 = Integer.valueOf(k);
      localObject3[0] = localObject1;
      localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      k = 0;
      localObject1 = null;
    }
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    for (;;)
    {
      if (j < k)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject3 = TLRPC.BotInlineResult.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
        if (localObject3 != null) {}
      }
      else
      {
        label186:
        return;
      }
      localObject2 = this.results;
      ((ArrayList)localObject2).add(localObject3);
      j += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.gallery;
    if (bool) {}
    for (int j = this.flags | 0x1;; j = this.flags & 0xFFFFFFFE)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      long l = this.query_id;
      paramAbstractSerializedData.writeInt64(l);
      j = this.flags & 0x2;
      if (j != 0)
      {
        localObject = this.next_offset;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      paramAbstractSerializedData.writeInt32(481674261);
      int k = this.results.size();
      paramAbstractSerializedData.writeInt32(k);
      j = 0;
      Object localObject = null;
      for (int m = 0; m < k; m = j)
      {
        localObject = (TLRPC.BotInlineResult)this.results.get(m);
        ((TLRPC.BotInlineResult)localObject).serializeToStream(paramAbstractSerializedData);
        j = m + 1;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_botResults.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */