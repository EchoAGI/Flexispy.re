package com.vvt.capture.telegram.internal;

public class TLRPC$TL_photoCachedSize
  extends TLRPC.PhotoSize
{
  public static int constructor = -374917894;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.type = ((String)localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.FileLocation.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.location = ((TLRPC.FileLocation)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.w = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.h = i;
    localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.bytes = ((byte[])localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.type;
    paramAbstractSerializedData.writeString((String)localObject);
    this.location.serializeToStream(paramAbstractSerializedData);
    i = this.w;
    paramAbstractSerializedData.writeInt32(i);
    i = this.h;
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.bytes;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photoCachedSize.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */