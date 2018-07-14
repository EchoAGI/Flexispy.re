package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageMediaGeoPoint
  extends TLRPC.DecryptedMessageMedia
{
  public static int constructor = 893913689;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    double d = paramAbstractSerializedData.readDouble(paramBoolean);
    this.lat = d;
    d = paramAbstractSerializedData.readDouble(paramBoolean);
    this._long = d;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    double d = this.lat;
    paramAbstractSerializedData.writeDouble(d);
    d = this._long;
    paramAbstractSerializedData.writeDouble(d);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaGeoPoint.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */