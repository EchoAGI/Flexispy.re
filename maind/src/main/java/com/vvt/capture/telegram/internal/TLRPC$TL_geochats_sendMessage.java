package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_sendMessage
  extends TLObject
{
  public static int constructor = 102432836;
  public String message;
  public TLRPC.TL_inputGeoChat peer;
  public long random_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_geochats_statedMessage.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    String str = this.message;
    paramAbstractSerializedData.writeString(str);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_sendMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */