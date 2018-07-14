package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updates_getChannelDifference
  extends TLObject
{
  public static int constructor = -1154295872;
  public TLRPC.InputChannel channel;
  public TLRPC.ChannelMessagesFilter filter;
  public int limit;
  public int pts;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.updates_ChannelDifference.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
    this.filter.serializeToStream(paramAbstractSerializedData);
    i = this.pts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updates_getChannelDifference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */