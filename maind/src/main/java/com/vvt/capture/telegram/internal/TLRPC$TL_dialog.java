package com.vvt.capture.telegram.internal;

public class TLRPC$TL_dialog
  extends TLRPC.Dialog
{
  public static int constructor = -1042448310;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.peer = ((TLRPC.Peer)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.top_message = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.read_inbox_max_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.unread_count = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.PeerNotifySettings.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.notify_settings = ((TLRPC.PeerNotifySettings)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    i = this.top_message;
    paramAbstractSerializedData.writeInt32(i);
    i = this.read_inbox_max_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.unread_count;
    paramAbstractSerializedData.writeInt32(i);
    this.notify_settings.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_dialog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */