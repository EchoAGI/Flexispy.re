package com.vvt.capture.telegram.internal;

public class TLRPC$MessageEntity
  extends TLObject
{
  public String language;
  public int length;
  public int offset;
  public String url;
  
  public static MessageEntity TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in MessageEntity", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityUrl;
      ((TLRPC.TL_messageEntityUrl)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityBold;
      ((TLRPC.TL_messageEntityBold)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityItalic;
      ((TLRPC.TL_messageEntityItalic)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityEmail;
      ((TLRPC.TL_messageEntityEmail)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityPre;
      ((TLRPC.TL_messageEntityPre)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityTextUrl;
      ((TLRPC.TL_messageEntityTextUrl)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityUnknown;
      ((TLRPC.TL_messageEntityUnknown)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityHashtag;
      ((TLRPC.TL_messageEntityHashtag)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityBotCommand;
      ((TLRPC.TL_messageEntityBotCommand)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityCode;
      ((TLRPC.TL_messageEntityCode)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEntityMention;
      ((TLRPC.TL_messageEntityMention)localObject).<init>();
    }
    if (localObject != null) {
      ((MessageEntity)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (MessageEntity)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$MessageEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */