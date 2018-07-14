package com.vvt.capture.telegram.internal;

public class TLRPC$Video
  extends TLObject
{
  public long access_hash;
  public String caption;
  public int date;
  public int dc_id;
  public int duration;
  public int h;
  public long id;
  public byte[] iv;
  public byte[] key;
  public String mime_type;
  public int size;
  public TLRPC.PhotoSize thumb;
  public int user_id;
  public int w;
  
  public static Video TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Video", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_video;
      ((TLRPC.TL_video)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_video_old3;
      ((TLRPC.TL_video_old3)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_videoEncrypted;
      ((TLRPC.TL_videoEncrypted)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_video_old;
      ((TLRPC.TL_video_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_video_old2;
      ((TLRPC.TL_video_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_videoEmpty;
      ((TLRPC.TL_videoEmpty)localObject).<init>();
    }
    if (localObject != null) {
      ((Video)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Video)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Video.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */