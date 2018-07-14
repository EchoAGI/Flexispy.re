package com.vvt.capture.telegram.internal;

public class TLRPC$TL_notifyPeer
  extends TLRPC.NotifyPeer
{
  public static int constructor = -1613493288;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Peer localPeer = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.peer = localPeer;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_notifyPeer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */