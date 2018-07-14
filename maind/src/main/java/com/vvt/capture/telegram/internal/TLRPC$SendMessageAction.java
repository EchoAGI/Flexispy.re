package com.vvt.capture.telegram.internal;

public class TLRPC$SendMessageAction
  extends TLObject
{
  public int progress;
  
  public static SendMessageAction TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in SendMessageAction", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageRecordAudioAction;
      ((TLRPC.TL_sendMessageRecordAudioAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadVideoAction_old;
      ((TLRPC.TL_sendMessageUploadVideoAction_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadAudioAction_old;
      ((TLRPC.TL_sendMessageUploadAudioAction_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadAudioAction;
      ((TLRPC.TL_sendMessageUploadAudioAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadPhotoAction;
      ((TLRPC.TL_sendMessageUploadPhotoAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadDocumentAction_old;
      ((TLRPC.TL_sendMessageUploadDocumentAction_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadVideoAction;
      ((TLRPC.TL_sendMessageUploadVideoAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageCancelAction;
      ((TLRPC.TL_sendMessageCancelAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageGeoLocationAction;
      ((TLRPC.TL_sendMessageGeoLocationAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageChooseContactAction;
      ((TLRPC.TL_sendMessageChooseContactAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageTypingAction;
      ((TLRPC.TL_sendMessageTypingAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadPhotoAction_old;
      ((TLRPC.TL_sendMessageUploadPhotoAction_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadDocumentAction;
      ((TLRPC.TL_sendMessageUploadDocumentAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageRecordVideoAction;
      ((TLRPC.TL_sendMessageRecordVideoAction)localObject).<init>();
    }
    if (localObject != null) {
      ((SendMessageAction)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (SendMessageAction)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$SendMessageAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */