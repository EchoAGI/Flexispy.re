package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_geochats_located
  extends TLObject
{
  public static int constructor = 1224651367;
  public ArrayList chats;
  public ArrayList messages;
  public ArrayList results;
  public ArrayList users;
  
  public TLRPC$TL_geochats_located()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.results = localArrayList;
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
  
  public static TL_geochats_located TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_geochats_located", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_geochats_located)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geochats_located;
      ((TL_geochats_located)localObject).<init>();
      ((TL_geochats_located)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 481674261;
    int j = 1;
    int k = 0;
    String str = null;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1;
    Object localObject2;
    Integer localInteger;
    int n;
    int i1;
    Object localObject3;
    if (m != i)
    {
      if (paramBoolean)
      {
        localObject1 = new java/lang/RuntimeException;
        localObject2 = new Object[j];
        localInteger = Integer.valueOf(m);
        localObject2[0] = localInteger;
        str = String.format("wrong Vector magic, got %x", (Object[])localObject2);
        ((RuntimeException)localObject1).<init>(str);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      n = paramAbstractSerializedData.readInt32(paramBoolean);
      m = 0;
      localInteger = null;
      if (m >= n) {
        break label138;
      }
      i1 = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.TL_chatLocated.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
      if (localObject3 != null) {
        break label115;
      }
    }
    label115:
    label138:
    label263:
    label388:
    label505:
    for (;;)
    {
      return;
      localObject2 = this.results;
      ((ArrayList)localObject2).add(localObject3);
      m += 1;
      break;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      if (m != i)
      {
        if (paramBoolean)
        {
          localObject1 = new java/lang/RuntimeException;
          localObject2 = new Object[j];
          localInteger = Integer.valueOf(m);
          localObject2[0] = localInteger;
          str = String.format("wrong Vector magic, got %x", (Object[])localObject2);
          ((RuntimeException)localObject1).<init>(str);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        n = paramAbstractSerializedData.readInt32(paramBoolean);
        m = 0;
        localInteger = null;
        for (;;)
        {
          if (m >= n) {
            break label263;
          }
          i1 = paramAbstractSerializedData.readInt32(paramBoolean);
          localObject3 = TLRPC.GeoChatMessage.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
          if (localObject3 == null) {
            break;
          }
          localObject2 = this.messages;
          ((ArrayList)localObject2).add(localObject3);
          m += 1;
        }
        m = paramAbstractSerializedData.readInt32(paramBoolean);
        if (m != i)
        {
          if (paramBoolean)
          {
            localObject1 = new java/lang/RuntimeException;
            localObject2 = new Object[j];
            localInteger = Integer.valueOf(m);
            localObject2[0] = localInteger;
            str = String.format("wrong Vector magic, got %x", (Object[])localObject2);
            ((RuntimeException)localObject1).<init>(str);
            throw ((Throwable)localObject1);
          }
        }
        else
        {
          n = paramAbstractSerializedData.readInt32(paramBoolean);
          m = 0;
          localInteger = null;
          for (;;)
          {
            if (m >= n) {
              break label388;
            }
            i1 = paramAbstractSerializedData.readInt32(paramBoolean);
            localObject3 = TLRPC.Chat.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
            if (localObject3 == null) {
              break;
            }
            localObject2 = this.chats;
            ((ArrayList)localObject2).add(localObject3);
            m += 1;
          }
          m = paramAbstractSerializedData.readInt32(paramBoolean);
          if (m != i)
          {
            if (paramBoolean)
            {
              localObject1 = new java/lang/RuntimeException;
              localObject2 = new Object[j];
              localInteger = Integer.valueOf(m);
              localObject2[0] = localInteger;
              str = String.format("wrong Vector magic, got %x", (Object[])localObject2);
              ((RuntimeException)localObject1).<init>(str);
              throw ((Throwable)localObject1);
            }
          }
          else
          {
            m = paramAbstractSerializedData.readInt32(paramBoolean);
            for (;;)
            {
              if (k >= m) {
                break label505;
              }
              n = paramAbstractSerializedData.readInt32(paramBoolean);
              localObject1 = TLRPC.User.TLdeserialize(paramAbstractSerializedData, n, paramBoolean);
              if (localObject1 == null) {
                break;
              }
              localObject3 = this.users;
              ((ArrayList)localObject3).add(localObject1);
              k += 1;
            }
          }
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
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.results;
    int m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (int n = 0; n < m; n = k)
    {
      localObject = (TLRPC.TL_chatLocated)this.results.get(n);
      ((TLRPC.TL_chatLocated)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.messages;
    m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (n = 0; n < m; n = k)
    {
      localObject = (TLRPC.GeoChatMessage)this.messages.get(n);
      ((TLRPC.GeoChatMessage)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.chats;
    m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (n = 0; n < m; n = k)
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geochats_located.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */