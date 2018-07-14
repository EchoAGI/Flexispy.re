package com.vvt.capture.telegram.internal;

public class TLRPC$MessageMedia
  extends TLObject
{
  public String address;
  public TLRPC.Audio audio;
  public byte[] bytes;
  public String caption;
  public TLRPC.Document document;
  public String first_name;
  public TLRPC.GeoPoint geo;
  public String last_name;
  public String phone_number;
  public TLRPC.Photo photo;
  public String provider;
  public String title;
  public int user_id;
  public String venue_id;
  public TLRPC.Video video;
  public TLRPC.WebPage webpage;
  
  public static MessageMedia TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in MessageMedia", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaUnsupported_old;
      ((TLRPC.TL_messageMediaUnsupported_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaVideo;
      ((TLRPC.TL_messageMediaVideo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaPhoto_old;
      ((TLRPC.TL_messageMediaPhoto_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaAudio;
      ((TLRPC.TL_messageMediaAudio)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaUnsupported;
      ((TLRPC.TL_messageMediaUnsupported)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaEmpty;
      ((TLRPC.TL_messageMediaEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaVenue;
      ((TLRPC.TL_messageMediaVenue)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaVideo_old;
      ((TLRPC.TL_messageMediaVideo_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaDocument_old;
      ((TLRPC.TL_messageMediaDocument_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaDocument;
      ((TLRPC.TL_messageMediaDocument)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaContact;
      ((TLRPC.TL_messageMediaContact)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaPhoto;
      ((TLRPC.TL_messageMediaPhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaWebPage;
      ((TLRPC.TL_messageMediaWebPage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaGeo;
      ((TLRPC.TL_messageMediaGeo)localObject).<init>();
    }
    if (localObject != null) {
      ((MessageMedia)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (MessageMedia)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$MessageMedia.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */