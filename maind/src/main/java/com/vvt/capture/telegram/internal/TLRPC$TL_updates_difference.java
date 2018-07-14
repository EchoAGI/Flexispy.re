package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_updates_difference
  extends TLRPC.updates_Difference
{
  public static int constructor = 16030880;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 481674261;
    int j = 1;
    int k = 0;
    Object localObject1 = null;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject2;
    Object localObject3;
    Integer localInteger;
    int n;
    int i1;
    Object localObject4;
    if (m != i)
    {
      if (paramBoolean)
      {
        localObject2 = new java/lang/RuntimeException;
        localObject3 = new Object[j];
        localInteger = Integer.valueOf(m);
        localObject3[0] = localInteger;
        localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
        ((RuntimeException)localObject2).<init>((String)localObject1);
        throw ((Throwable)localObject2);
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
      localObject4 = TLRPC.Message.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
      if (localObject4 != null) {
        break label115;
      }
    }
    for (;;)
    {
      return;
      label115:
      localObject3 = this.new_messages;
      ((ArrayList)localObject3).add(localObject4);
      m += 1;
      break;
      label138:
      m = paramAbstractSerializedData.readInt32(paramBoolean);
      if (m != i)
      {
        if (paramBoolean)
        {
          localObject2 = new java/lang/RuntimeException;
          localObject3 = new Object[j];
          localInteger = Integer.valueOf(m);
          localObject3[0] = localInteger;
          localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
          ((RuntimeException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
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
          localObject4 = TLRPC.EncryptedMessage.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
          if (localObject4 == null) {
            break;
          }
          localObject3 = this.new_encrypted_messages;
          ((ArrayList)localObject3).add(localObject4);
          m += 1;
        }
        label263:
        m = paramAbstractSerializedData.readInt32(paramBoolean);
        if (m != i)
        {
          if (paramBoolean)
          {
            localObject2 = new java/lang/RuntimeException;
            localObject3 = new Object[j];
            localInteger = Integer.valueOf(m);
            localObject3[0] = localInteger;
            localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
            ((RuntimeException)localObject2).<init>((String)localObject1);
            throw ((Throwable)localObject2);
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
            localObject4 = TLRPC.Update.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
            if (localObject4 == null) {
              break;
            }
            localObject3 = this.other_updates;
            ((ArrayList)localObject3).add(localObject4);
            m += 1;
          }
          label388:
          m = paramAbstractSerializedData.readInt32(paramBoolean);
          if (m != i)
          {
            if (paramBoolean)
            {
              localObject2 = new java/lang/RuntimeException;
              localObject3 = new Object[j];
              localInteger = Integer.valueOf(m);
              localObject3[0] = localInteger;
              localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
              ((RuntimeException)localObject2).<init>((String)localObject1);
              throw ((Throwable)localObject2);
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
                break label513;
              }
              i1 = paramAbstractSerializedData.readInt32(paramBoolean);
              localObject4 = TLRPC.Chat.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
              if (localObject4 == null) {
                break;
              }
              localObject3 = this.chats;
              ((ArrayList)localObject3).add(localObject4);
              m += 1;
            }
            label513:
            m = paramAbstractSerializedData.readInt32(paramBoolean);
            if (m != i)
            {
              if (paramBoolean)
              {
                localObject2 = new java/lang/RuntimeException;
                localObject3 = new Object[j];
                localInteger = Integer.valueOf(m);
                localObject3[0] = localInteger;
                localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
                ((RuntimeException)localObject2).<init>((String)localObject1);
                throw ((Throwable)localObject2);
              }
            }
            else
            {
              m = paramAbstractSerializedData.readInt32(paramBoolean);
              for (;;)
              {
                if (k >= m) {
                  break label632;
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
              label632:
              k = paramAbstractSerializedData.readInt32(paramBoolean);
              localObject1 = TLRPC.TL_updates_state.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
              this.state = ((TLRPC.TL_updates_state)localObject1);
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
    Object localObject = this.new_messages;
    int m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (int n = 0; n < m; n = k)
    {
      localObject = (TLRPC.Message)this.new_messages.get(n);
      ((TLRPC.Message)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.new_encrypted_messages;
    m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (n = 0; n < m; n = k)
    {
      localObject = (TLRPC.EncryptedMessage)this.new_encrypted_messages.get(n);
      ((TLRPC.EncryptedMessage)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.other_updates;
    m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (n = 0; n < m; n = k)
    {
      localObject = (TLRPC.Update)this.other_updates.get(n);
      ((TLRPC.Update)localObject).serializeToStream(paramAbstractSerializedData);
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
    this.state.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updates_difference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */