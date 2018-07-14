package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_checkin
  extends TLObject
{
  public static int constructor = 1437853947;
  public TLRPC.TL_inputGeoChat peer;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_geochats_statedMessage.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_checkin.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */