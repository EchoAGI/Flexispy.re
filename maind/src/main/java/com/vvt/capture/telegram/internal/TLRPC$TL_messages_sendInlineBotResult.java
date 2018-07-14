package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_sendInlineBotResult
  extends TLObject
{
  public static int constructor = -1318189314;
  public boolean broadcast;
  public int flags;
  public String id;
  public TLRPC.InputPeer peer;
  public long query_id;
  public long random_id;
  public int reply_to_msg_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.broadcast;
    if (bool) {}
    for (int j = this.flags | 0x10;; j = this.flags & 0xFFFFFFEF)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      Object localObject = this.peer;
      ((TLRPC.InputPeer)localObject).serializeToStream(paramAbstractSerializedData);
      j = this.flags & 0x1;
      if (j != 0)
      {
        j = this.reply_to_msg_id;
        paramAbstractSerializedData.writeInt32(j);
      }
      long l = this.random_id;
      paramAbstractSerializedData.writeInt64(l);
      l = this.query_id;
      paramAbstractSerializedData.writeInt64(l);
      localObject = this.id;
      paramAbstractSerializedData.writeString((String)localObject);
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_sendInlineBotResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */