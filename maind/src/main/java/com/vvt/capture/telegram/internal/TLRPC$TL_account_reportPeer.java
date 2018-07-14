package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_reportPeer
  extends TLObject
{
  public static int constructor = -1374118561;
  public TLRPC.InputPeer peer;
  public TLRPC.ReportReason reason;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    this.reason.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_reportPeer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */