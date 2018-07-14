package com.vvt.capture.telegram.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TLRPC$TL_message_old0
  extends TLRPC.Message
{
  public static int constructor = -913120932;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x1;
    if (j != 0)
    {
      j = i;
      this.unread = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label520;
      }
      j = i;
      label53:
      this.out = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label529;
      }
      j = i;
      label76:
      this.mentioned = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label538;
      }
      j = i;
      label99:
      this.media_unread = j;
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = j;
      j = this.flags & 0x100;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.from_id = j;
      }
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject1 = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.to_id = ((TLRPC.Peer)localObject1);
      j = this.from_id;
      if (j == 0)
      {
        localObject1 = this.to_id;
        j = ((TLRPC.Peer)localObject1).user_id;
        if (j == 0) {
          break label547;
        }
        localObject1 = this.to_id;
        j = ((TLRPC.Peer)localObject1).user_id;
      }
    }
    Object localObject2;
    for (this.from_id = j;; this.from_id = j)
    {
      j = this.flags & 0x4;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject1 = TLRPC.Peer.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
        this.fwd_from_id = ((TLRPC.Peer)localObject1);
      }
      j = this.flags & 0x4;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.fwd_date = j;
      }
      j = this.flags & 0x800;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.via_bot_id = j;
      }
      j = this.flags & 0x8;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.reply_to_msg_id = j;
      }
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = j;
      localObject1 = paramAbstractSerializedData.readString(paramBoolean);
      this.message = ((String)localObject1);
      j = this.flags & 0x200;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject1 = TLRPC.MessageMedia.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
        this.media = ((TLRPC.MessageMedia)localObject1);
      }
      j = this.flags & 0x40;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject1 = TLRPC.ReplyMarkup.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
        this.reply_markup = ((TLRPC.ReplyMarkup)localObject1);
      }
      j = this.flags & 0x80;
      if (j == 0) {
        break label635;
      }
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      i1 = 481674261;
      if (j == i1) {
        break label570;
      }
      if (!paramBoolean) {
        break label611;
      }
      localObject2 = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[i];
      localObject1 = Integer.valueOf(j);
      arrayOfObject[0] = localObject1;
      localObject1 = String.format("wrong Vector magic, got %x", arrayOfObject);
      ((RuntimeException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
      j = 0;
      localObject1 = null;
      break;
      label520:
      j = 0;
      localObject1 = null;
      break label53;
      label529:
      j = 0;
      localObject1 = null;
      break label76;
      label538:
      j = 0;
      localObject1 = null;
      break label99;
      label547:
      localObject1 = this.to_id;
      j = -((TLRPC.Peer)localObject1).channel_id;
    }
    label570:
    int i1 = paramAbstractSerializedData.readInt32(paramBoolean);
    j = 0;
    Object localObject1 = null;
    int i2;
    Object localObject3;
    if (j < i1)
    {
      i2 = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.MessageEntity.TLdeserialize(paramAbstractSerializedData, i2, paramBoolean);
      if (localObject3 != null) {}
    }
    for (;;)
    {
      label611:
      return;
      Object localObject4 = this.entities;
      ((ArrayList)localObject4).add(localObject3);
      j += 1;
      break;
      label635:
      j = this.flags & 0x400;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.views = j;
      }
      j = this.id;
      if (j >= 0)
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
                int k = ((String)localObject1).length();
                if (k != 0)
                {
                  localObject1 = this.message;
                  localObject2 = "-1";
                  boolean bool2 = ((String)localObject1).startsWith((String)localObject2);
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
        int m = this.id;
        if (m < 0)
        {
          localObject1 = this.attachPath;
          localObject2 = "||";
          boolean bool3 = ((String)localObject1).startsWith((String)localObject2);
          if (bool3)
          {
            localObject1 = this.attachPath;
            localObject2 = ((String)localObject1).split("\\|\\|");
            n = localObject2.length;
            if (n > 0)
            {
              localObject1 = new java/util/HashMap;
              ((HashMap)localObject1).<init>();
              this.params = ((HashMap)localObject1);
              n = i;
              for (;;)
              {
                i2 = localObject2.length + -1;
                if (n >= i2) {
                  break;
                }
                localObject3 = localObject2[n];
                localObject4 = "\\|=\\|";
                localObject3 = ((String)localObject3).split((String)localObject4);
                int i3 = localObject3.length;
                int i4 = 2;
                if (i3 == i4)
                {
                  localObject4 = this.params;
                  Object localObject5 = localObject3[0];
                  localObject3 = localObject3[i];
                  ((HashMap)localObject4).put(localObject5, localObject3);
                }
                n += 1;
              }
              n = localObject2.length + -1;
              localObject1 = localObject2[n];
              this.attachPath = ((String)localObject1);
            }
          }
        }
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
        break label391;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label402;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label413;
      }
    }
    Object localObject2;
    label391:
    label402:
    label413:
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
      localObject1 = this.to_id;
      ((TLRPC.Peer)localObject1).serializeToStream(paramAbstractSerializedData);
      n = this.flags & 0x4;
      if (n != 0)
      {
        localObject1 = this.fwd_from_id;
        ((TLRPC.Peer)localObject1).serializeToStream(paramAbstractSerializedData);
      }
      n = this.flags & 0x4;
      if (n != 0)
      {
        n = this.fwd_date;
        paramAbstractSerializedData.writeInt32(n);
      }
      n = this.flags & 0x800;
      if (n != 0)
      {
        n = this.via_bot_id;
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
      localObject1 = this.message;
      paramAbstractSerializedData.writeString((String)localObject1);
      n = this.flags & 0x200;
      if (n != 0)
      {
        localObject1 = this.media;
        ((TLRPC.MessageMedia)localObject1).serializeToStream(paramAbstractSerializedData);
      }
      n = this.flags & 0x40;
      if (n != 0)
      {
        localObject1 = this.reply_markup;
        ((TLRPC.ReplyMarkup)localObject1).serializeToStream(paramAbstractSerializedData);
      }
      n = this.flags & 0x80;
      if (n == 0) {
        break label424;
      }
      paramAbstractSerializedData.writeInt32(481674261);
      int i2 = this.entities.size();
      paramAbstractSerializedData.writeInt32(i2);
      n = 0;
      localObject1 = null;
      i3 = 0;
      localObject2 = null;
      while (i3 < i2)
      {
        localObject1 = (TLRPC.MessageEntity)this.entities.get(i3);
        ((TLRPC.MessageEntity)localObject1).serializeToStream(paramAbstractSerializedData);
        n = i3 + 1;
        i3 = n;
      }
      n = this.flags & 0xFFFFFFFE;
      break;
      n = this.flags & 0xFFFFFFFD;
      break label46;
      n = this.flags & 0xFFFFFFEF;
      break label68;
    }
    label424:
    n = this.flags & 0x400;
    if (n != 0)
    {
      n = this.views;
      paramAbstractSerializedData.writeInt32(n);
    }
    Object localObject1 = this.attachPath;
    int i3 = this.id;
    if (i3 < 0)
    {
      localObject2 = this.params;
      if (localObject2 != null)
      {
        localObject2 = this.params;
        i3 = ((HashMap)localObject2).size();
        if (i3 > 0)
        {
          localObject2 = this.params.entrySet();
          Iterator localIterator = ((Set)localObject2).iterator();
          for (Object localObject3 = localObject1;; localObject3 = localObject1)
          {
            boolean bool5 = localIterator.hasNext();
            if (!bool5) {
              break;
            }
            localObject1 = (Map.Entry)localIterator.next();
            Object localObject4 = new java/lang/StringBuilder;
            ((StringBuilder)localObject4).<init>();
            localObject2 = (String)((Map.Entry)localObject1).getKey();
            localObject2 = ((StringBuilder)localObject4).append((String)localObject2);
            localObject4 = "|=|";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
            localObject1 = (String)((Map.Entry)localObject1).getValue();
            localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
            localObject2 = "||";
            localObject1 = (String)localObject2 + (String)localObject3;
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = "||";
          localObject1 = (String)localObject2 + (String)localObject3;
        }
      }
    }
    paramAbstractSerializedData.writeString((String)localObject1);
    int i1 = this.flags & 0x4;
    if (i1 != 0)
    {
      i1 = this.id;
      if (i1 < 0)
      {
        i1 = this.fwd_msg_id;
        paramAbstractSerializedData.writeInt32(i1);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_message_old0.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */