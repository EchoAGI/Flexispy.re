package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geochats_createGeoChat
  extends TLObject
{
  public static int constructor = 235482646;
  public String address;
  public TLRPC.InputGeoPoint geo_point;
  public String title;
  public String venue;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_geochats_statedMessage.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    this.geo_point.serializeToStream(paramAbstractSerializedData);
    str = this.address;
    paramAbstractSerializedData.writeString(str);
    str = this.venue;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_createGeoChat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */