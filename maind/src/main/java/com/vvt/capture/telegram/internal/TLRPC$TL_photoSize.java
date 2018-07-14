package com.vvt.capture.telegram.internal;

public class TLRPC$TL_photoSize
  extends TLRPC.PhotoSize
{
  public static int constructor = 2009052699;
  
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
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.type;
    paramAbstractSerializedData.writeString(str);
    this.location.serializeToStream(paramAbstractSerializedData);
    i = this.w;
    paramAbstractSerializedData.writeInt32(i);
    i = this.h;
    paramAbstractSerializedData.writeInt32(i);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_photoSize.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */