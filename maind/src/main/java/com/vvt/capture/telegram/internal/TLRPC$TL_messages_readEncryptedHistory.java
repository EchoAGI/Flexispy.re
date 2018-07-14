package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_readEncryptedHistory
  extends TLObject
{
  public static int constructor = 2135648522;
  public int max_date;
  public TLRPC.TL_inputEncryptedChat peer;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    i = this.max_date;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_readEncryptedHistory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */