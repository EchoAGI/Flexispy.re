package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channels_readHistory
  extends TLObject
{
  public static int constructor = -871347913;
  public TLRPC.InputChannel channel;
  public int max_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
    i = this.max_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_readHistory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */