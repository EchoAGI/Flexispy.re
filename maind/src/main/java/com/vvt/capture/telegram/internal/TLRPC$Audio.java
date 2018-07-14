package com.vvt.capture.telegram.internal;

public class TLRPC$Audio
  extends TLObject
{
  public long access_hash;
  public int date;
  public int dc_id;
  public int duration;
  public long id;
  public byte[] iv;
  public byte[] key;
  public String mime_type;
  public int size;
  public int user_id;
  
  public static Audio TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Audio", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_audioEmpty;
      ((TLRPC.TL_audioEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_audio_old;
      ((TLRPC.TL_audio_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_audio;
      ((TLRPC.TL_audio)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_audioEncrypted;
      ((TLRPC.TL_audioEncrypted)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_audio_old2;
      ((TLRPC.TL_audio_old2)localObject).<init>();
    }
    if (localObject != null) {
      ((Audio)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Audio)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Audio.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */