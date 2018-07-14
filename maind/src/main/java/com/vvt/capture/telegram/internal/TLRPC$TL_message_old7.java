package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_message_old7
  extends TLRPC.TL_message
{
  public static int constructor = 1537633299;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    int k = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = k;
    k = this.flags & 0x1;
    label56:
    label79:
    label102:
    Object localObject1;
    if (k != 0)
    {
      k = i;
      this.unread = k;
      k = this.flags & 0x2;
      if (k == 0) {
        break label495;
      }
      k = i;
      this.out = k;
      k = this.flags & 0x10;
      if (k == 0) {
        break label504;
      }
      k = i;
      this.mentioned = k;
      k = this.flags & 0x20;
      if (k == 0) {
        break label513;
      }
      k = i;
      this.media_unread = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = k;
      k = this.flags & 0x100;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.from_id = k;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject1 = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      this.to_id = ((TLRPC.Peer)localObject1);
      k = this.from_id;
      if (k == 0)
      {
        localObject1 = this.to_id;
        k = ((TLRPC.Peer)localObject1).user_id;
        if (k == 0) {
          break label522;
        }
        localObject1 = this.to_id;
        k = ((TLRPC.Peer)localObject1).user_id;
        this.from_id = k;
      }
      label219:
      k = this.flags & 0x4;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject1 = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        this.fwd_from_id = ((TLRPC.Peer)localObject1);
      }
      k = this.flags & 0x4;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.fwd_date = k;
      }
      k = this.flags & 0x8;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.reply_to_msg_id = k;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = k;
      localObject1 = paramAbstractSerializedData.readString(paramBoolean);
      this.message = ((String)localObject1);
      k = this.flags & 0x200;
      if (k == 0) {
        break label545;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject1 = TLRPC.MessageMedia.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
    }
    Object localObject2;
    Object localObject3;
    for (this.media = ((TLRPC.MessageMedia)localObject1);; this.media = ((TLRPC.MessageMedia)localObject1))
    {
      k = this.flags & 0x40;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject1 = TLRPC.ReplyMarkup.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        this.reply_markup = ((TLRPC.ReplyMarkup)localObject1);
      }
      k = this.flags & 0x80;
      if (k == 0) {
        break label621;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int i1 = 481674261;
      if (k == i1) {
        break label564;
      }
      if (!paramBoolean) {
        break label597;
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
      label495:
      k = 0;
      localObject1 = null;
      break label56;
      label504:
      k = 0;
      localObject1 = null;
      break label79;
      label513:
      k = 0;
      localObject1 = null;
      break label102;
      label522:
      localObject1 = this.to_id;
      k = -((TLRPC.Peer)localObject1).channel_id;
      this.from_id = k;
      break label219;
      label545:
      localObject1 = new com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaEmpty;
      ((TLRPC.TL_messageMediaEmpty)localObject1).<init>();
    }
    label564:
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    if (j < k)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.MessageEntity.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      if (localObject3 != null) {}
    }
    for (;;)
    {
      label597:
      return;
      localObject2 = this.entities;
      ((ArrayList)localObject2).add(localObject3);
      j += 1;
      break;
      label621:
      k = this.flags & 0x400;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.views = k;
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
      int n = this.flags & 0x4;
      if (n != 0)
      {
        n = this.id;
        if (n < 0)
        {
          n = paramAbstractSerializedData.readInt32(paramBoolean);
          this.fwd_msg_id = n;
        }
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
        break label365;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label376;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label387;
      }
    }
    label365:
    label376:
    label387:
    for (int n = this.flags | 0x20;; n = this.flags & 0xFFFFFFDF)
    {
      this.flags = n;
      n = this.flags;
      paramAbstractSerializedData.writeInt32(n);
      n = this.id;
      paramAbstractSerializedData.writeInt32(n);
      n = this.flags & 0x100;
      if (n != 0)
      {
        n = this.from_id;
        paramAbstractSerializedData.writeInt32(n);
      }
      localObject = this.to_id;
      ((TLRPC.Peer)localObject).serializeToStream(paramAbstractSerializedData);
      n = this.flags & 0x4;
      if (n != 0)
      {
        localObject = this.fwd_from_id;
        ((TLRPC.Peer)localObject).serializeToStream(paramAbstractSerializedData);
      }
      n = this.flags & 0x4;
      if (n != 0)
      {
        n = this.fwd_date;
        paramAbstractSerializedData.writeInt32(n);
      }
      n = this.flags & 0x8;
      if (n != 0)
      {
        n = this.reply_to_msg_id;
        paramAbstractSerializedData.writeInt32(n);
      }
      n = this.date;
      paramAbstractSerializedData.writeInt32(n);
      localObject = this.message;
      paramAbstractSerializedData.writeString((String)localObject);
      n = this.flags & 0x200;
      if (n != 0)
      {
        localObject = this.media;
        ((TLRPC.MessageMedia)localObject).serializeToStream(paramAbstractSerializedData);
      }
      n = this.flags & 0x40;
      if (n != 0)
      {
        localObject = this.reply_markup;
        ((TLRPC.ReplyMarkup)localObject).serializeToStream(paramAbstractSerializedData);
      }
      n = this.flags & 0x80;
      if (n == 0) {
        break label398;
      }
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
    label398:
    n = this.flags & 0x400;
    if (n != 0)
    {
      n = this.views;
      paramAbstractSerializedData.writeInt32(n);
    }
    Object localObject = this.attachPath;
    paramAbstractSerializedData.writeString((String)localObject);
    n = this.flags & 0x4;
    if (n != 0)
    {
      n = this.id;
      if (n < 0)
      {
        n = this.fwd_msg_id;
        paramAbstractSerializedData.writeInt32(n);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_message_old7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */