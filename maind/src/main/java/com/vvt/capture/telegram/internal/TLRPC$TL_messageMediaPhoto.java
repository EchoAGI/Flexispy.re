package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageMediaPhoto
  extends TLRPC.MessageMedia
{
  public static int constructor = 1032643901;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo = ((TLRPC.Photo)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.caption = ((String)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.photo.serializeToStream(paramAbstractSerializedData);
    String str = this.caption;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaPhoto.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */