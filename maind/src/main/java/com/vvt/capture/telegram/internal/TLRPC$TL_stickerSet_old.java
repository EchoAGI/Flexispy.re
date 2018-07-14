package com.vvt.capture.telegram.internal;

public class TLRPC$TL_stickerSet_old
  extends TLRPC.TL_stickerSet
{
  public static int constructor = -1482409193;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.access_hash = l;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.title = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.short_name = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.id;
    paramAbstractSerializedData.writeInt64(l);
    l = this.access_hash;
    paramAbstractSerializedData.writeInt64(l);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    str = this.short_name;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_stickerSet_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */