package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geoChat
  extends TLRPC.Chat
{
  public static int constructor = 1978329690;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.access_hash = l;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.title = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.address = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.venue = ((String)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.GeoPoint.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.geo = ((TLRPC.GeoPoint)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.ChatPhoto.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo = ((TLRPC.ChatPhoto)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.participants_count = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.checked_in = bool;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.version = j;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.access_hash;
    paramAbstractSerializedData.writeInt64(l);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    str = this.address;
    paramAbstractSerializedData.writeString(str);
    str = this.venue;
    paramAbstractSerializedData.writeString(str);
    this.geo.serializeToStream(paramAbstractSerializedData);
    this.photo.serializeToStream(paramAbstractSerializedData);
    i = this.participants_count;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.checked_in;
    paramAbstractSerializedData.writeBool(bool);
    int j = this.version;
    paramAbstractSerializedData.writeInt32(j);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geoChat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */