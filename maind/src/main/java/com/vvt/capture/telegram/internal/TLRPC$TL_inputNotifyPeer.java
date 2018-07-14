package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputNotifyPeer
  extends TLRPC.InputNotifyPeer
{
  public static int constructor = -1195615476;
  public TLRPC.InputPeer peer;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.InputPeer localInputPeer = TLRPC.InputPeer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.peer = localInputPeer;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputNotifyPeer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */