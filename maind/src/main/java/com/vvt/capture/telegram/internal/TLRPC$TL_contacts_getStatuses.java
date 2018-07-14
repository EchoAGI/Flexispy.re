package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_contacts_getStatuses
  extends TLObject
{
  public static int constructor = -995929106;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    TLRPC.Vector localVector = new com/vvt/capture/telegram/internal/TLRPC$Vector;
    localVector.<init>();
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    int j = 0;
    for (;;)
    {
      TLRPC.TL_contactStatus localTL_contactStatus;
      if (j < i)
      {
        int k = paramAbstractSerializedData.readInt32(paramBoolean);
        localTL_contactStatus = TLRPC.TL_contactStatus.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localTL_contactStatus != null) {}
      }
      else
      {
        return localVector;
      }
      ArrayList localArrayList = localVector.objects;
      localArrayList.add(localTL_contactStatus);
      j += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_contacts_getStatuses.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */