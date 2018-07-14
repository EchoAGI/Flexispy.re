package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chat_old
  extends TLRPC.TL_chat
{
  public static int constructor = 1855757255;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.title = ((String)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.ChatPhoto.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.photo = ((TLRPC.ChatPhoto)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.participants_count = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.left = bool;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.version = j;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    this.photo.serializeToStream(paramAbstractSerializedData);
    i = this.participants_count;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.left;
    paramAbstractSerializedData.writeBool(bool);
    int j = this.version;
    paramAbstractSerializedData.writeInt32(j);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chat_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */