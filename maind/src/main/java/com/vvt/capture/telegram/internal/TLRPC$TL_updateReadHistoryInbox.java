package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateReadHistoryInbox
  extends TLRPC.Update
{
  public static int constructor = -1721631396;
  public TLRPC.Peer peer;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Peer localPeer = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.peer = localPeer;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.max_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts_count = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    i = this.max_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.pts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.pts_count;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateReadHistoryInbox.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */