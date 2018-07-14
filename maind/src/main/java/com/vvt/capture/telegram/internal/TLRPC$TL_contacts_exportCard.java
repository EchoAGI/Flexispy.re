package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_contacts_exportCard
  extends TLObject
{
  public static int constructor = -2065352905;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    TLRPC.Vector localVector = new com/vvt/capture/telegram/internal/TLRPC$Vector;
    localVector.<init>();
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    int j = 0;
    while (j < i)
    {
      ArrayList localArrayList = localVector.objects;
      int k = paramAbstractSerializedData.readInt32(paramBoolean);
      Integer localInteger = Integer.valueOf(k);
      localArrayList.add(localInteger);
      j += 1;
    }
    return localVector;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contacts_exportCard.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */