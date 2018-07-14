package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_chats
  extends TLObject
{
  public static int constructor = 1694474197;
  public ArrayList chats;
  
  public TLRPC$TL_messages_chats()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.chats = localArrayList;
  }
  
  public static TL_messages_chats TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_messages_chats", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messages_chats)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_chats;
      ((TL_messages_chats)localObject).<init>();
      ((TL_messages_chats)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(j);
        arrayOfObject[0] = localInteger;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
    }
    else {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
    }
    for (;;)
    {
      if (i < j)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject = TLRPC.Chat.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.chats;
      localArrayList.add(localObject);
      i += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.chats.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.Chat localChat = null;
    for (int k = 0; k < j; k = i)
    {
      localChat = (TLRPC.Chat)this.chats.get(k);
      localChat.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_chats.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */