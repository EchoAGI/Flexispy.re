package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_chatParticipants
  extends TLRPC.ChatParticipants
{
  public static int constructor = 1061556205;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.chat_id = j;
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
    else
    {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      if (i >= j) {
        break label139;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.ChatParticipant.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      if (localObject != null) {
        break label118;
      }
    }
    for (;;)
    {
      return;
      label118:
      ArrayList localArrayList = this.participants;
      localArrayList.add(localObject);
      i += 1;
      break;
      label139:
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.version = i;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.participants.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.ChatParticipant localChatParticipant = null;
    for (int k = 0; k < j; k = i)
    {
      localChatParticipant = (TLRPC.ChatParticipant)this.participants.get(k);
      localChatParticipant.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
    i = this.version;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipants.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */