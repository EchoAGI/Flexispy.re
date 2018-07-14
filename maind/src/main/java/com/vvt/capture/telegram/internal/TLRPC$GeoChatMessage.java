package com.vvt.capture.telegram.internal;

public class TLRPC$GeoChatMessage
  extends TLObject
{
  public TLRPC.MessageAction action;
  public int chat_id;
  public int date;
  public int from_id;
  public int id;
  public TLRPC.MessageMedia media;
  public String message;
  
  public static GeoChatMessage TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in GeoChatMessage", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geoChatMessage;
      ((TLRPC.TL_geoChatMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geoChatMessageService;
      ((TLRPC.TL_geoChatMessageService)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geoChatMessageEmpty;
      ((TLRPC.TL_geoChatMessageEmpty)localObject).<init>();
    }
    if (localObject != null) {
      ((GeoChatMessage)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (GeoChatMessage)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$GeoChatMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */