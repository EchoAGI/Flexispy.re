package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_contacts_importCard
  extends TLObject
{
  public static int constructor = 1340184318;
  public ArrayList export_card;
  
  public TLRPC$TL_contacts_importCard()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.export_card = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.User.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.export_card.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    Integer localInteger = null;
    for (int k = 0; k < j; k = i)
    {
      localInteger = (Integer)this.export_card.get(k);
      i = localInteger.intValue();
      paramAbstractSerializedData.writeInt32(i);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contacts_importCard.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */