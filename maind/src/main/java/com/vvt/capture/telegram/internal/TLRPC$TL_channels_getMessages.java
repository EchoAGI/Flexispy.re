package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_channels_getMessages
  extends TLObject
{
  public static int constructor = -1814580409;
  public TLRPC.InputChannel channel;
  public ArrayList id;
  
  public TLRPC$TL_channels_getMessages()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.id = localArrayList;
  }
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.messages_Messages.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.id.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    Integer localInteger = null;
    for (int k = 0; k < j; k = i)
    {
      localInteger = (Integer)this.id.get(k);
      i = localInteger.intValue();
      paramAbstractSerializedData.writeInt32(i);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_getMessages.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */