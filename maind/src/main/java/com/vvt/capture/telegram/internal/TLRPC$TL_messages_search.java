package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_search
  extends TLObject
{
  public static int constructor = -732523960;
  public TLRPC.MessagesFilter filter;
  public int flags;
  public boolean important_only;
  public int limit;
  public int max_date;
  public int max_id;
  public int min_date;
  public int offset;
  public TLRPC.InputPeer peer;
  public String q;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.messages_Messages.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.important_only;
    if (bool) {}
    for (int j = this.flags | 0x1;; j = this.flags & 0xFFFFFFFE)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      this.peer.serializeToStream(paramAbstractSerializedData);
      String str = this.q;
      paramAbstractSerializedData.writeString(str);
      this.filter.serializeToStream(paramAbstractSerializedData);
      j = this.min_date;
      paramAbstractSerializedData.writeInt32(j);
      j = this.max_date;
      paramAbstractSerializedData.writeInt32(j);
      j = this.offset;
      paramAbstractSerializedData.writeInt32(j);
      j = this.max_id;
      paramAbstractSerializedData.writeInt32(j);
      j = this.limit;
      paramAbstractSerializedData.writeInt32(j);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_search.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */