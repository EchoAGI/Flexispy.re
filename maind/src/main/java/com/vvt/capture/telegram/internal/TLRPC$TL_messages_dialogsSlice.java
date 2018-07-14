package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_messages_dialogsSlice
  extends TLRPC.messages_Dialogs
{
  public static int constructor = 1910543603;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 481674261;
    int j = 1;
    int k = 0;
    String str = null;
    int m = paramAbstractSerializedData.readInt32(paramBoolean);
    this.count = m;
    m = paramAbstractSerializedData.readInt32(paramBoolean);
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
        break label151;
      }
      i1 = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.Dialog.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
      if (localObject3 != null) {
        break label128;
      }
    }
    label128:
    label151:
    label276:
    label401:
    label518:
    for (;;)
    {
      return;
      localObject2 = this.dialogs;
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
            break label276;
          }
          i1 = paramAbstractSerializedData.readInt32(paramBoolean);
          localObject3 = TLRPC.Message.TLdeserialize(paramAbstractSerializedData, i1, paramBoolean);
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
              break label401;
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
                break label518;
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
    k = this.count;
    paramAbstractSerializedData.writeInt32(k);
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.dialogs;
    int m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (int n = 0; n < m; n = k)
    {
      localObject = (TLRPC.Dialog)this.dialogs.get(n);
      ((TLRPC.Dialog)localObject).serializeToStream(paramAbstractSerializedData);
      k = n + 1;
    }
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.messages;
    m = ((ArrayList)localObject).size();
    paramAbstractSerializedData.writeInt32(m);
    for (n = 0; n < m; n = k)
    {
      localObject = (TLRPC.Message)this.messages.get(n);
      ((TLRPC.Message)localObject).serializeToStream(paramAbstractSerializedData);
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_dialogsSlice.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */