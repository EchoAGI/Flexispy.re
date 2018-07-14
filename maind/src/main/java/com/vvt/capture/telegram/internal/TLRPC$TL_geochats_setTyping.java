package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_setTyping
  extends TLObject
{
  public static int constructor = 146319145;
  public TLRPC.TL_inputGeoChat peer;
  public boolean typing;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.typing;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_setTyping.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */