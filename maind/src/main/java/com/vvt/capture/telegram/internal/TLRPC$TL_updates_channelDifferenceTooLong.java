package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_updates_channelDifferenceTooLong
  extends TLRPC.updates_ChannelDifference
{
  public static int constructor = 1578530374;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 481674261;
    int j = 1;
    int k = 0;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = m;
    m = this.flags & 0x1;
    if (m != 0) {
      m = j;
    }
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      this.isFinal = m;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      this.pts = m;
      m = this.flags & 0x2;
      if (m != 0)
      {
        m = paramAbstractSerializedData.readInt32(paramBoolean);
        this.timeout = m;
      }
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      this.top_message = m;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      this.top_important_message = m;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      this.read_inbox_max_id = m;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      this.unread_count = m;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      this.unread_important_count = m;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      if (m == i) {
        break;
      }
      if (!paramBoolean) {
        break label260;
      }
      localObject1 = new java/lang/RuntimeException;
      localObject2 = new Object[j];
      localObject3 = Integer.valueOf(m);
      localObject2[0] = localObject3;
      localObject3 = String.format("wrong Vector magic, got %x", (Object[])localObject2);
      ((RuntimeException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
      m = 0;
      localObject3 = null;
    }
    int n = paramAbstractSerializedData.readInt32(paramBoolean);
    m = 0;
    Object localObject3 = null;
    int i1;
    Object localObject4;
    if (m < n)
    {
      i1 = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject4 = TLRPC.Message.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
      if (localObject4 != null) {}
    }
    label260:
    label409:
    label526:
    for (;;)
    {
      return;
      ArrayList localArrayList = this.messages;
      localArrayList.add(localObject4);
      m += 1;
      break;
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      if (m != i)
      {
        if (paramBoolean)
        {
          localObject1 = new java/lang/RuntimeException;
          localObject2 = new Object[j];
          localObject3 = Integer.valueOf(m);
          localObject2[0] = localObject3;
          localObject3 = String.format("wrong Vector magic, got %x", (Object[])localObject2);
          ((RuntimeException)localObject1).<init>((String)localObject3);
          throw ((Throwable)localObject1);
        }
      }
      else
      {
        n = paramAbstractSerializedData.readInt32(paramBoolean);
        m = 0;
        localObject3 = null;
        for (;;)
        {
          if (m >= n) {
            break label409;
          }
          i1 = paramAbstractSerializedData.readInt32(paramBoolean);
          localObject4 = TLRPC.Chat.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
          if (localObject4 == null) {
            break;
          }
          localArrayList = this.chats;
          localArrayList.add(localObject4);
          m += 1;
        }
        m = paramAbstractSerializedData.readInt32(paramBoolean);
        if (m != i)
        {
          if (paramBoolean)
          {
            localObject1 = new java/lang/RuntimeException;
            localObject2 = new Object[j];
            localObject3 = Integer.valueOf(m);
            localObject2[0] = localObject3;
            localObject3 = String.format("wrong Vector magic, got %x", (Object[])localObject2);
            ((RuntimeException)localObject1).<init>((String)localObject3);
            throw ((Throwable)localObject1);
          }
        }
        else
        {
          m = paramAbstractSerializedData.readInt32(paramBoolean);
          for (;;)
          {
            if (k >= m) {
              break label526;
            }
            j = paramAbstractSerializedData.readInt32(paramBoolean);
            localObject2 = TLRPC.User.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
            if (localObject2 == null) {
              break;
            }
            localObject1 = this.users;
            ((ArrayList)localObject1).add(localObject2);
            k += 1;
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
    boolean bool = this.isFinal;
    if (bool) {}
    for (int m = this.flags | 0x1;; m = this.flags & 0xFFFFFFFE)
    {
      this.flags = m;
      m = this.flags;
      paramAbstractSerializedData.writeInt32(m);
      m = this.pts;
      paramAbstractSerializedData.writeInt32(m);
      m = this.flags & 0x2;
      if (m != 0)
      {
        m = this.timeout;
        paramAbstractSerializedData.writeInt32(m);
      }
      m = this.top_message;
      paramAbstractSerializedData.writeInt32(m);
      m = this.top_important_message;
      paramAbstractSerializedData.writeInt32(m);
      m = this.read_inbox_max_id;
      paramAbstractSerializedData.writeInt32(m);
      m = this.unread_count;
      paramAbstractSerializedData.writeInt32(m);
      m = this.unread_important_count;
      paramAbstractSerializedData.writeInt32(m);
      paramAbstractSerializedData.writeInt32(i);
      localObject = this.messages;
      n = ((ArrayList)localObject).size();
      paramAbstractSerializedData.writeInt32(n);
      for (i1 = 0; i1 < n; i1 = m)
      {
        localObject = (TLRPC.Message)this.messages.get(i1);
        ((TLRPC.Message)localObject).serializeToStream(paramAbstractSerializedData);
        m = i1 + 1;
      }
    }
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.chats;
    int n = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(n);
    for (int i1 = 0; i1 < n; i1 = m)
    {
      localObject = (TLRPC.Chat)this.chats.get(i1);
      ((TLRPC.Chat)localObject).serializeToStream(paramAbstractSerializedData);
      m = i1 + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.users;
    i1 = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(i1);
    while (j < i1)
    {
      localObject = (TLRPC.User)this.users.get(j);
      ((TLRPC.User)localObject).serializeToStream(paramAbstractSerializedData);
      m = j + 1;
      j = m;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updates_channelDifferenceTooLong.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */