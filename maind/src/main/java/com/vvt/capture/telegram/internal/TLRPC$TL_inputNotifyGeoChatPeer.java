package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputNotifyGeoChatPeer
  extends TLRPC.InputNotifyPeer
{
  public static int constructor = 1301143240;
  public TLRPC.TL_inputGeoChat peer;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.TL_inputGeoChat localTL_inputGeoChat = TLRPC.TL_inputGeoChat.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.peer = localTL_inputGeoChat;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputNotifyGeoChatPeer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */