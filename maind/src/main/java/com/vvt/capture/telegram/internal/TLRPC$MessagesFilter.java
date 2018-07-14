package com.vvt.capture.telegram.internal;

public class TLRPC$MessagesFilter
  extends TLObject
{
  public static MessagesFilter TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in MessagesFilter", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterDocument;
      ((TLRPC.TL_inputMessagesFilterDocument)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterAudioDocuments;
      ((TLRPC.TL_inputMessagesFilterAudioDocuments)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterVideo;
      ((TLRPC.TL_inputMessagesFilterVideo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterPhotos;
      ((TLRPC.TL_inputMessagesFilterPhotos)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterPhotoVideoDocuments;
      ((TLRPC.TL_inputMessagesFilterPhotoVideoDocuments)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterAudio;
      ((TLRPC.TL_inputMessagesFilterAudio)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterUrl;
      ((TLRPC.TL_inputMessagesFilterUrl)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterGif;
      ((TLRPC.TL_inputMessagesFilterGif)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterEmpty;
      ((TLRPC.TL_inputMessagesFilterEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputMessagesFilterPhotoVideo;
      ((TLRPC.TL_inputMessagesFilterPhotoVideo)localObject).<init>();
    }
    if (localObject != null) {
      ((MessagesFilter)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (MessagesFilter)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$MessagesFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */