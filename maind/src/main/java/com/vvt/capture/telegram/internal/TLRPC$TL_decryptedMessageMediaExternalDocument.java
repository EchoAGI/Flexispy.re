package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_decryptedMessageMediaExternalDocument
  extends TLRPC.DecryptedMessageMedia
{
  public static int constructor = -90853155;
  public TLRPC.PhotoSize thumb;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.access_hash = l;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = j;
    Object localObject1 = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.size = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject1 = TLRPC.PhotoSize.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.thumb = ((TLRPC.PhotoSize)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.dc_id = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject2;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject2 = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        localObject1 = Integer.valueOf(j);
        arrayOfObject[0] = localObject1;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    else {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
    }
    for (;;)
    {
      if (i < j)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject2 = TLRPC.DocumentAttribute.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject2 != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.attributes;
      localArrayList.add(localObject2);
      i += 1;
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
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaExternalDocument.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */