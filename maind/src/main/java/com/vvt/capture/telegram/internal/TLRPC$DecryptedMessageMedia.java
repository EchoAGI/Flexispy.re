package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$DecryptedMessageMedia
  extends TLObject
{
  public double _long;
  public long access_hash;
  public ArrayList attributes;
  public int date;
  public int dc_id;
  public int duration;
  public String file_name;
  public String first_name;
  public int h;
  public long id;
  public byte[] iv;
  public byte[] key;
  public String last_name;
  public double lat;
  public String mime_type;
  public String phone_number;
  public int size;
  public int thumb_h;
  public int thumb_w;
  public int user_id;
  public int w;
  
  public TLRPC$DecryptedMessageMedia()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.attributes = localArrayList;
  }
  
  public static DecryptedMessageMedia TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in DecryptedMessageMedia", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaEmpty;
      ((TLRPC.TL_decryptedMessageMediaEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaDocument;
      ((TLRPC.TL_decryptedMessageMediaDocument)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaExternalDocument;
      ((TLRPC.TL_decryptedMessageMediaExternalDocument)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaAudio_old;
      ((TLRPC.TL_decryptedMessageMediaAudio_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaGeoPoint;
      ((TLRPC.TL_decryptedMessageMediaGeoPoint)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaAudio;
      ((TLRPC.TL_decryptedMessageMediaAudio)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaVideo;
      ((TLRPC.TL_decryptedMessageMediaVideo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaContact;
      ((TLRPC.TL_decryptedMessageMediaContact)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaPhoto;
      ((TLRPC.TL_decryptedMessageMediaPhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaVideo_old;
      ((TLRPC.TL_decryptedMessageMediaVideo_old)localObject).<init>();
    }
    if (localObject != null) {
      ((DecryptedMessageMedia)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (DecryptedMessageMedia)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$DecryptedMessageMedia.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */