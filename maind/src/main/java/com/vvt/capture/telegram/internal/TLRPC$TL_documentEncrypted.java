package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_documentEncrypted
  extends TLRPC.Document
{
  public static int constructor = 1431655768;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    Object localObject1 = null;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.access_hash = l;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = j;
    Object localObject2 = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject2);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject2 = TLRPC.PhotoSize.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.thumb = ((TLRPC.PhotoSize)localObject2);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.dc_id = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject3;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject3 = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        localObject2 = Integer.valueOf(j);
        arrayOfObject[0] = localObject2;
        localObject1 = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      }
    }
    else
    {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      if (i >= j) {
        break label226;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.DocumentAttribute.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      if (localObject3 != null) {
        break label205;
      }
    }
    for (;;)
    {
      return;
      label205:
      ArrayList localArrayList = this.attributes;
      localArrayList.add(localObject3);
      i += 1;
      break;
      label226:
      localObject1 = paramAbstractSerializedData.readByteArray(paramBoolean);
      this.key = ((byte[])localObject1);
      localObject1 = paramAbstractSerializedData.readByteArray(paramBoolean);
      this.iv = ((byte[])localObject1);
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.id;
    paramAbstractSerializedData.writeInt64(l);
    l = this.access_hash;
    paramAbstractSerializedData.writeInt64(l);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.mime_type;
    paramAbstractSerializedData.writeString((String)localObject);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
    this.thumb.serializeToStream(paramAbstractSerializedData);
    i = this.dc_id;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.attributes.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    localObject = null;
    for (int k = 0; k < j; k = i)
    {
      localObject = (TLRPC.DocumentAttribute)this.attributes.get(k);
      ((TLRPC.DocumentAttribute)localObject).serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
    localObject = this.key;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    localObject = this.iv;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_documentEncrypted.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */