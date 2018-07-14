package com.vvt.capture.telegram.internal;

public class TLRPC$DocumentAttribute
  extends TLObject
{
  public String alt;
  public int duration;
  public String file_name;
  public int flags;
  public int h;
  public boolean mask;
  public TLRPC.TL_maskCoords mask_coords;
  public String performer;
  public TLRPC.InputStickerSet stickerset;
  public String title;
  public boolean voice;
  public int w;
  public byte[] waveform;
  
  public static DocumentAttribute TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in DocumentAttribute", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeHasStickers;
      ((TLRPC.TL_documentAttributeHasStickers)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeSticker_layer55;
      ((TLRPC.TL_documentAttributeSticker_layer55)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeSticker;
      ((TLRPC.TL_documentAttributeSticker)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeAnimated;
      ((TLRPC.TL_documentAttributeAnimated)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeSticker_old;
      ((TLRPC.TL_documentAttributeSticker_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeImageSize;
      ((TLRPC.TL_documentAttributeImageSize)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeAudio_old;
      ((TLRPC.TL_documentAttributeAudio_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeVideo;
      ((TLRPC.TL_documentAttributeVideo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeAudio;
      ((TLRPC.TL_documentAttributeAudio)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeSticker_old2;
      ((TLRPC.TL_documentAttributeSticker_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeFilename;
      ((TLRPC.TL_documentAttributeFilename)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeAudio_layer45;
      ((TLRPC.TL_documentAttributeAudio_layer45)localObject).<init>();
    }
    if (localObject != null) {
      ((DocumentAttribute)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (DocumentAttribute)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$DocumentAttribute.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */