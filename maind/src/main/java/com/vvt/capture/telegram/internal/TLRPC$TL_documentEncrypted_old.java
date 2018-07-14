package com.vvt.capture.telegram.internal;

public class TLRPC$TL_documentEncrypted_old
  extends TLRPC.TL_document
{
  public static int constructor = 1431655766;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.access_hash = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.file_name = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.PhotoSize.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.thumb = ((TLRPC.PhotoSize)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.dc_id = i;
    localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.key = ((byte[])localObject);
    localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.iv = ((byte[])localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.id;
    paramAbstractSerializedData.writeInt64(l);
    l = this.access_hash;
    paramAbstractSerializedData.writeInt64(l);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.file_name;
    paramAbstractSerializedData.writeString((String)localObject);
    localObject = this.mime_type;
    paramAbstractSerializedData.writeString((String)localObject);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
    this.thumb.serializeToStream(paramAbstractSerializedData);
    i = this.dc_id;
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.key;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    localObject = this.iv;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_documentEncrypted_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */