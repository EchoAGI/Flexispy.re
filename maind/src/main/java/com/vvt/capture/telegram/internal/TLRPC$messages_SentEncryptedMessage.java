package com.vvt.capture.telegram.internal;

public class TLRPC$messages_SentEncryptedMessage
  extends TLObject
{
  public int date;
  public TLRPC.EncryptedFile file;
  
  public static messages_SentEncryptedMessage TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in messages_SentEncryptedMessage", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_sentEncryptedMessage;
      ((TLRPC.TL_messages_sentEncryptedMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_sentEncryptedFile;
      ((TLRPC.TL_messages_sentEncryptedFile)localObject).<init>();
    }
    if (localObject != null) {
      ((messages_SentEncryptedMessage)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (messages_SentEncryptedMessage)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$messages_SentEncryptedMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */