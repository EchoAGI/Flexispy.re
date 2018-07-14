package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_getHistory
  extends TLObject
{
  public static int constructor = -1970355494;
  public int add_offset;
  public int limit;
  public int max_id;
  public int min_id;
  public int offset_id;
  public TLRPC.InputPeer peer;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.messages_Messages.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    i = this.offset_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.add_offset;
    paramAbstractSerializedData.writeInt32(i);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
    i = this.max_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.min_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getHistory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */