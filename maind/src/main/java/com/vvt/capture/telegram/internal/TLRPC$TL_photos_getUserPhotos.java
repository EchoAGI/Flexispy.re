package com.vvt.capture.telegram.internal;

public class TLRPC$TL_photos_getUserPhotos
  extends TLObject
{
  public static int constructor = -1848823128;
  public int limit;
  public long max_id;
  public int offset;
  public TLRPC.InputUser user_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.photos_Photos.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.user_id.serializeToStream(paramAbstractSerializedData);
    i = this.offset;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.max_id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photos_getUserPhotos.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */