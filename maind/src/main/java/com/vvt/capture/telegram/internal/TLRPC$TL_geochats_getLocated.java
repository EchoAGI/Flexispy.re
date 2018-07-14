package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_getLocated
  extends TLObject
{
  public static int constructor = 2132356495;
  public TLRPC.InputGeoPoint geo_point;
  public int limit;
  public int radius;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_geochats_located.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.geo_point.serializeToStream(paramAbstractSerializedData);
    i = this.radius;
    paramAbstractSerializedData.writeInt32(i);
    i = this.limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_getLocated.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */