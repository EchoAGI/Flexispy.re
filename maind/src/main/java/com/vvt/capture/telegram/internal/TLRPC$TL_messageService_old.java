package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageService_old
  extends TLRPC.TL_messageService
{
  public static int constructor = -1618124613;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.from_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.to_id = ((TLRPC.Peer)localObject);
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.out = bool;
    bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.unread = bool;
    int j = this.flags | 0x100;
    this.flags = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.MessageAction.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.action = ((TLRPC.MessageAction)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.from_id;
    paramAbstractSerializedData.writeInt32(i);
    this.to_id.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.out;
    paramAbstractSerializedData.writeBool(bool);
    bool = this.unread;
    paramAbstractSerializedData.writeBool(bool);
    int j = this.date;
    paramAbstractSerializedData.writeInt32(j);
    this.action.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageService_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */