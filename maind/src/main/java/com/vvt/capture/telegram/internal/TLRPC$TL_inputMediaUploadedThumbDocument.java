package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_inputMediaUploadedThumbDocument
  extends TLRPC.InputMedia
{
  public static int constructor = -1386138479;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1 = TLRPC.InputFile.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.file = ((TLRPC.InputFile)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject1 = TLRPC.InputFile.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.thumb = ((TLRPC.InputFile)localObject1);
    localObject1 = paramAbstractSerializedData.readString(paramBoolean);
    this.mime_type = ((String)localObject1);
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
    else
    {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      if (i >= j) {
        break label183;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject2 = TLRPC.DocumentAttribute.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      if (localObject2 != null) {
        break label162;
      }
    }
    for (;;)
    {
      return;
      label162:
      ArrayList localArrayList = this.attributes;
      localArrayList.add(localObject2);
      i += 1;
      break;
      label183:
      str = paramAbstractSerializedData.readString(paramBoolean);
      this.caption = str;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.file.serializeToStream(paramAbstractSerializedData);
    this.thumb.serializeToStream(paramAbstractSerializedData);
    Object localObject = this.mime_type;
    paramAbstractSerializedData.writeString((String)localObject);
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
    localObject = this.caption;
    paramAbstractSerializedData.writeString((String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedThumbDocument.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */