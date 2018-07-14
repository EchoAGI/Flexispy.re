package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_receivedQueue
  extends TLObject
{
  public static int constructor = 1436924774;
  public int max_qts;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    TLRPC.Vector localVector = new com/vvt/capture/telegram/internal/TLRPC$Vector;
    localVector.<init>();
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    int j = 0;
    while (j < i)
    {
      ArrayList localArrayList = localVector.objects;
      long l = paramAbstractSerializedData.readInt64(paramBoolean);
      Long localLong = Long.valueOf(l);
      localArrayList.add(localLong);
      j += 1;
    }
    return localVector;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.max_qts;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_receivedQueue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */