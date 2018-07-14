package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateChannelGroup
  extends TLRPC.Update
{
  public static int constructor = -1016324548;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.channel_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.TL_messageGroup localTL_messageGroup = TLRPC.TL_messageGroup.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.group = localTL_messageGroup;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.channel_id;
    paramAbstractSerializedData.writeInt32(i);
    this.group.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateChannelGroup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */