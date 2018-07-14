package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_deleteHistory
  extends TLObject
{
  public static int constructor = -1212072999;
  public int max_id;
  public TLRPC.InputPeer peer;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_messages_affectedHistory.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    i = this.max_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_deleteHistory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */