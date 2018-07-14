package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$messages_Stickers
  extends TLObject
{
  public String hash;
  public ArrayList stickers;
  
  public TLRPC$messages_Stickers()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.stickers = localArrayList;
  }
  
  public static messages_Stickers TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in messages_Stickers", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_stickersNotModified;
      ((TLRPC.TL_messages_stickersNotModified)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_stickers;
      ((TLRPC.TL_messages_stickers)localObject).<init>();
    }
    if (localObject != null) {
      ((messages_Stickers)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (messages_Stickers)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$messages_Stickers.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */