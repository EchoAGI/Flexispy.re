package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$messages_AllStickers
  extends TLObject
{
  public ArrayList documents;
  public String hash;
  public ArrayList packs;
  public ArrayList sets;
  
  public TLRPC$messages_AllStickers()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.sets = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.packs = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.documents = localArrayList;
  }
  
  public static messages_AllStickers TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in messages_AllStickers", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_allStickers;
      ((TLRPC.TL_messages_allStickers)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_allStickersNotModified;
      ((TLRPC.TL_messages_allStickersNotModified)localObject).<init>();
    }
    if (localObject != null) {
      ((messages_AllStickers)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (messages_AllStickers)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$messages_AllStickers.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */