package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateNotifySettings
  extends TLRPC.Update
{
  public static int constructor = -1094555409;
  public TLRPC.NotifyPeer peer;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.NotifyPeer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.peer = ((TLRPC.NotifyPeer)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.PeerNotifySettings.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.notify_settings = ((TLRPC.PeerNotifySettings)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    this.notify_settings.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateNotifySettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */