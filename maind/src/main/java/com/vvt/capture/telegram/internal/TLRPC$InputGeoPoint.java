package com.vvt.capture.telegram.internal;

public class TLRPC$InputGeoPoint
  extends TLObject
{
  public double _long;
  public double lat;
  
  public static InputGeoPoint TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputGeoPoint", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputGeoPoint;
      ((TLRPC.TL_inputGeoPoint)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputGeoPointEmpty;
      ((TLRPC.TL_inputGeoPointEmpty)localObject).<init>();
    }
    if (localObject != null) {
      ((InputGeoPoint)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputGeoPoint)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputGeoPoint.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */