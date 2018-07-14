package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$messages_SavedGifs
  extends TLObject
{
  public ArrayList gifs;
  public int hash;
  
  public TLRPC$messages_SavedGifs()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.gifs = localArrayList;
  }
  
  public static messages_SavedGifs TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in messages_SavedGifs", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_savedGifsNotModified;
      ((TLRPC.TL_messages_savedGifsNotModified)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_savedGifs;
      ((TLRPC.TL_messages_savedGifs)localObject).<init>();
    }
    if (localObject != null) {
      ((messages_SavedGifs)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (messages_SavedGifs)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$messages_SavedGifs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */