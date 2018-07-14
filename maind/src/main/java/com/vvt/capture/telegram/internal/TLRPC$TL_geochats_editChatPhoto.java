package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_editChatPhoto
  extends TLObject
{
  public static int constructor = 903355029;
  public TLRPC.TL_inputGeoChat peer;
  public TLRPC.InputChatPhoto photo;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_geochats_statedMessage.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    this.photo.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_editChatPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */