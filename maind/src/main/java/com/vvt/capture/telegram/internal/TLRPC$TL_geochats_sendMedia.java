package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_sendMedia
  extends TLObject
{
  public static int constructor = -1192173825;
  public TLRPC.InputMedia media;
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
    this.media.serializeToStream(paramAbstractSerializedData);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_sendMedia.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */