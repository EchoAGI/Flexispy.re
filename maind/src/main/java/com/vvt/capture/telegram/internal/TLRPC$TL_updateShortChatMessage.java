package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_updateShortChatMessage
  extends TLRPC.Updates
{
  public static int constructor = 613087842;
  
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
        break label404;
      }
      k = i;
      label56:
      this.out = k;
      k = this.flags & 0x10;
      if (k == 0) {
        break label413;
      }
      k = i;
      label79:
      this.mentioned = k;
      k = this.flags & 0x20;
      if (k == 0) {
        break label422;
      }
      k = i;
    }
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      this.media_unread = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.from_id = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.chat_id = k;
      Object localObject1 = paramAbstractSerializedData.readString(paramBoolean);
      this.message = ((String)localObject1);
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.pts = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.pts_count = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.date = k;
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
      k = this.flags & 0x800;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.via_bot_id = k;
      }
      k = this.flags & 0x8;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.reply_to_msg_id = k;
      }
      k = this.flags & 0x80;
      if (k == 0) {
        break label464;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int m = 481674261;
      if (k == m) {
        break label431;
      }
      if (!paramBoolean) {
        break label464;
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
      label404:
      k = 0;
      localObject1 = null;
      break label56;
      label413:
      k = 0;
      localObject1 = null;
      break label79;
      label422:
      k = 0;
      localObject1 = null;
    }
    label431:
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    for (;;)
    {
      if (j < k)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject3 = TLRPC.MessageEntity.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
        if (localObject3 != null) {}
      }
      else
      {
        label464:
        return;
      }
      localObject2 = this.entities;
      ((ArrayList)localObject2).add(localObject3);
      j += 1;
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
        break label350;
      }
      int k = this.flags | 0x2;
      label46:
      this.flags = k;
      boolean bool3 = this.mentioned;
      if (!bool3) {
        break label361;
      }
      int m = this.flags | 0x10;
      label68:
      this.flags = m;
      boolean bool4 = this.media_unread;
      if (!bool4) {
        break label372;
      }
    }
    label350:
    label361:
    label372:
    for (int n = this.flags | 0x20;; n = this.flags & 0xFFFFFFDF)
    {
      this.flags = n;
      n = this.flags;
      paramAbstractSerializedData.writeInt32(n);
      n = this.id;
      paramAbstractSerializedData.writeInt32(n);
      n = this.from_id;
      paramAbstractSerializedData.writeInt32(n);
      n = this.chat_id;
      paramAbstractSerializedData.writeInt32(n);
      Object localObject = this.message;
      paramAbstractSerializedData.writeString((String)localObject);
      n = this.pts;
      paramAbstractSerializedData.writeInt32(n);
      n = this.pts_count;
      paramAbstractSerializedData.writeInt32(n);
      n = this.date;
      paramAbstractSerializedData.writeInt32(n);
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
      n = this.flags & 0x80;
      if (n == 0) {
        return;
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
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateShortChatMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */