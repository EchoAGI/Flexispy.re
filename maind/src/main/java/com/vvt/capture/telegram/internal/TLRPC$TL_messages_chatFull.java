package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_chatFull
  extends TLObject
{
  public static int constructor = -438840932;
  public ArrayList chats;
  public TLRPC.ChatFull full_chat;
  public ArrayList users;
  
  public TLRPC$TL_messages_chatFull()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.chats = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static TL_messages_chatFull TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_messages_chatFull", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_messages_chatFull)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_chatFull;
      ((TL_messages_chatFull)localObject).<init>();
      ((TL_messages_chatFull)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 481674261;
    int j = 1;
    int k = 0;
    String str = null;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1 = TLRPC.ChatFull.TLdeserialize(paramAbstractSerializedData, m, paramBoolean);
    this.full_chat = ((TLRPC.ChatFull)localObject1);
    m = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject2;
    Object localObject3;
    int n;
    Object localObject4;
    if (m != i)
    {
      if (paramBoolean)
      {
        localObject2 = new java/lang/RuntimeException;
        localObject3 = new Object[j];
        localObject1 = Integer.valueOf(m);
        localObject3[0] = localObject1;
        str = String.format("wrong Vector magic, got %x", (Object[])localObject3);
        ((RuntimeException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    else
    {
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      m = 0;
      localObject1 = null;
      if (m >= n) {
        break label160;
      }
      int i1 = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject4 = TLRPC.Chat.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
      if (localObject4 != null) {
        break label137;
      }
    }
    label137:
    label160:
    label277:
    for (;;)
    {
      return;
      localObject3 = this.chats;
      ((ArrayList)localObject3).add(localObject4);
      m += 1;
      break;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      if (m != i)
      {
        if (paramBoolean)
        {
          localObject2 = new java/lang/RuntimeException;
          localObject3 = new Object[j];
          localObject1 = Integer.valueOf(m);
          localObject3[0] = localObject1;
          str = String.format("wrong Vector magic, got %x", (Object[])localObject3);
          ((RuntimeException)localObject2).<init>(str);
          throw ((Throwable)localObject2);
        }
      }
      else
      {
        m = paramAbstractSerializedData.readInt32(paramBoolean);
        for (;;)
        {
          if (k >= m) {
            break label277;
          }
          n = paramAbstractSerializedData.readInt32(paramBoolean);
          localObject2 = TLRPC.User.TLdeserialize(paramAbstractSerializedData, n, paramBoolean);
          if (localObject2 == null) {
            break;
          }
          localObject4 = this.users;
          ((ArrayList)localObject4).add(localObject2);
          k += 1;
        }
      }
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = 481674261;
    int j = 0;
    int k = constructor;
    paramAbstractSerializedData.writeInt32(k);
    this.full_chat.serializeToStream(paramAbstractSerializedData);
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.chats;
    int m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (int n = 0; n < m; n = k)
    {
      localObject = (TLRPC.Chat)this.chats.get(n);
      ((TLRPC.Chat)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.users;
    n = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(n);
    while (j < n)
    {
      localObject = (TLRPC.User)this.users.get(j);
      ((TLRPC.User)localObject).serializeToStream(paramAbstractSerializedData);
      k = j + 1;
      j = k;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_chatFull.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */