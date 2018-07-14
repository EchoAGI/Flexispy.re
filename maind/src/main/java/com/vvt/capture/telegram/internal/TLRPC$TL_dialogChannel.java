package com.vvt.capture.telegram.internal;

public class TLRPC$TL_dialogChannel
  extends TLRPC.Dialog
{
  public static int constructor = 1535415986;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.peer = ((TLRPC.Peer)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.top_not_important_message = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.top_message = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.read_inbox_max_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.unread_not_important_count = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.unread_count = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.PeerNotifySettings.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.notify_settings = ((TLRPC.PeerNotifySettings)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    i = this.top_not_important_message;
    paramAbstractSerializedData.writeInt32(i);
    i = this.top_message;
    paramAbstractSerializedData.writeInt32(i);
    i = this.read_inbox_max_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.unread_not_important_count;
    paramAbstractSerializedData.writeInt32(i);
    i = this.unread_count;
    paramAbstractSerializedData.writeInt32(i);
    this.notify_settings.serializeToStream(paramAbstractSerializedData);
    i = this.pts;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_dialogChannel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */