package com.vvt.capture.telegram.internal;

public class TLRPC$BotInlineResult
  extends TLObject
{
  public String content_type;
  public String content_url;
  public String description;
  public TLRPC.Document document;
  public int duration;
  public int flags;
  public int h;
  public String id;
  public TLRPC.Photo photo;
  public long query_id;
  public TLRPC.BotInlineMessage send_message;
  public String thumb_url;
  public String title;
  public String type;
  public String url;
  public int w;
  
  public static BotInlineResult TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in BotInlineResult", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_botInlineMediaResultPhoto;
      ((TLRPC.TL_botInlineMediaResultPhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_botInlineMediaResultDocument;
      ((TLRPC.TL_botInlineMediaResultDocument)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_botInlineResult;
      ((TLRPC.TL_botInlineResult)localObject).<init>();
    }
    if (localObject != null) {
      ((BotInlineResult)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (BotInlineResult)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$BotInlineResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */