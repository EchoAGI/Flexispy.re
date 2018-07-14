package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channels_getParticipants
  extends TLObject
{
  public static int constructor = 618237842;
  public TLRPC.InputChannel channel;
  public TLRPC.ChannelParticipantsFilter filter;
  public int limit;
  public int offset;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_channels_channelParticipants.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
    this.filter.serializeToStream(paramAbstractSerializedData);
    i = this.offset;
    paramAbstractSerializedData.writeInt32(i);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_getParticipants.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */