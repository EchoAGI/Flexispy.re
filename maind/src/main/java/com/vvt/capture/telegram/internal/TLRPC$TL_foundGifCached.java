package com.vvt.capture.telegram.internal;

public class TLRPC$TL_foundGifCached
  extends TLRPC.FoundGif
{
  public static int constructor = -1670052855;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.url = ((String)localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo = ((TLRPC.Photo)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.Document.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.document = ((TLRPC.Document)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.url;
    paramAbstractSerializedData.writeString(str);
    this.photo.serializeToStream(paramAbstractSerializedData);
    this.document.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_foundGifCached.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */