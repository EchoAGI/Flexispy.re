package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$InputMedia
  extends TLObject
{
  public String address;
  public ArrayList attributes;
  public String caption;
  public int duration;
  public TLRPC.InputFile file;
  public String first_name;
  public int flags;
  public TLRPC.InputGeoPoint geo_point;
  public int h;
  public String last_name;
  public String mime_type;
  public String phone_number;
  public String provider;
  public String q;
  public TLRPC.InputFile thumb;
  public String title;
  public String url;
  public String venue_id;
  public int w;
  
  public TLRPC$InputMedia()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.attributes = localArrayList;
  }
  
  public static InputMedia TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputMedia", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaContact;
      ((TLRPC.TL_inputMediaContact)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedThumbDocument;
      ((TLRPC.TL_inputMediaUploadedThumbDocument)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaAudio;
      ((TLRPC.TL_inputMediaAudio)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaDocument;
      ((TLRPC.TL_inputMediaDocument)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaVideo;
      ((TLRPC.TL_inputMediaVideo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaGifExternal;
      ((TLRPC.TL_inputMediaGifExternal)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaGeoPoint;
      ((TLRPC.TL_inputMediaGeoPoint)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaEmpty;
      ((TLRPC.TL_inputMediaEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedThumbVideo;
      ((TLRPC.TL_inputMediaUploadedThumbVideo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedPhoto;
      ((TLRPC.TL_inputMediaUploadedPhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaVenue;
      ((TLRPC.TL_inputMediaVenue)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedAudio;
      ((TLRPC.TL_inputMediaUploadedAudio)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedVideo;
      ((TLRPC.TL_inputMediaUploadedVideo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaUploadedDocument;
      ((TLRPC.TL_inputMediaUploadedDocument)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaPhoto;
      ((TLRPC.TL_inputMediaPhoto)localObject).<init>();
    }
    if (localObject != null) {
      ((InputMedia)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputMedia)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputMedia.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */