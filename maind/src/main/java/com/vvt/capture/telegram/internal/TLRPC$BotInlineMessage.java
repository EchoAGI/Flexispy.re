package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$BotInlineMessage
  extends TLObject
{
  public String caption;
  public ArrayList entities;
  public int flags;
  public String message;
  public boolean no_webpage;
  
  public TLRPC$BotInlineMessage()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.entities = localArrayList;
  }
  
  public static BotInlineMessage TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in BotInlineMessage", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_botInlineMessageMediaAuto;
      ((TLRPC.TL_botInlineMessageMediaAuto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_botInlineMessageText;
      ((TLRPC.TL_botInlineMessageText)localObject).<init>();
    }
    if (localObject != null) {
      ((BotInlineMessage)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (BotInlineMessage)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$BotInlineMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */