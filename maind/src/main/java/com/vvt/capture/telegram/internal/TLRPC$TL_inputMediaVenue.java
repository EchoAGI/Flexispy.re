package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputMediaVenue
  extends TLRPC.InputMedia
{
  public static int constructor = 673687578;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.InputGeoPoint.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.geo_point = ((TLRPC.InputGeoPoint)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.title = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.address = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.provider = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.venue_id = ((String)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.geo_point.serializeToStream(paramAbstractSerializedData);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    str = this.address;
    paramAbstractSerializedData.writeString(str);
    str = this.provider;
    paramAbstractSerializedData.writeString(str);
    str = this.venue_id;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaVenue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */