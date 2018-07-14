package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageMediaGeo
  extends TLRPC.MessageMedia
{
  public static int constructor = 1457575028;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.GeoPoint localGeoPoint = TLRPC.GeoPoint.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.geo = localGeoPoint;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.geo.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaGeo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */