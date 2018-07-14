package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_reorderStickerSets
  extends TLObject
{
  public static int constructor = -1613775824;
  public ArrayList order;
  
  public TLRPC$TL_messages_reorderStickerSets()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.order = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.order.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    Long localLong = null;
    for (int k = 0; k < j; k = i)
    {
      localLong = (Long)this.order.get(k);
      long l = localLong.longValue();
      paramAbstractSerializedData.writeInt64(l);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_reorderStickerSets.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */