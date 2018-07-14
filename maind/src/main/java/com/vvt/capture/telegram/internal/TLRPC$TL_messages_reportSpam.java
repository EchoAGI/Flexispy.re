package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_reportSpam
  extends TLObject
{
  public static int constructor = -820669733;
  public TLRPC.InputPeer peer;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_reportSpam.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */