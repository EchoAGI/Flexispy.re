package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_searchGlobal
  extends TLObject
{
  public static int constructor = -1640190800;
  public int limit;
  public int offset_date;
  public int offset_id;
  public TLRPC.InputPeer offset_peer;
  public String q;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.messages_Messages.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.q;
    paramAbstractSerializedData.writeString(str);
    i = this.offset_date;
    paramAbstractSerializedData.writeInt32(i);
    this.offset_peer.serializeToStream(paramAbstractSerializedData);
    i = this.offset_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_searchGlobal.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */