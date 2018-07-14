package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_getRecents
  extends TLObject
{
  public static int constructor = -515735953;
  public int limit;
  public int offset;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.geochats_Messages.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.offset;
    paramAbstractSerializedData.writeInt32(i);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_getRecents.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */