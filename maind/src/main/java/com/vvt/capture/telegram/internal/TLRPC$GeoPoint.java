package com.vvt.capture.telegram.internal;

public class TLRPC$GeoPoint
  extends TLObject
{
  public double _long;
  public double lat;
  
  public static GeoPoint TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in GeoPoint", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geoPointEmpty;
      ((TLRPC.TL_geoPointEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geoPoint;
      ((TLRPC.TL_geoPoint)localObject).<init>();
    }
    if (localObject != null) {
      ((GeoPoint)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (GeoPoint)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$GeoPoint.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */