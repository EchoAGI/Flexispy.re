package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_channelFull
  extends TLRPC.ChatFull
{
  public static int constructor = -1640751649;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 1;
    int j = 0;
    int k = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = k;
    k = this.flags & 0x8;
    if (k != 0) {
      k = i;
    }
    Object localObject2;
    Object localObject3;
    for (;;)
    {
      this.can_view_participants = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = k;
      Object localObject1 = paramAbstractSerializedData.readString(paramBoolean);
      this.about = ((String)localObject1);
      k = this.flags & 0x1;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.participants_count = k;
      }
      k = this.flags & 0x2;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.admins_count = k;
      }
      k = this.flags & 0x4;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.kicked_count = k;
      }
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.read_inbox_max_id = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.unread_count = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      this.unread_important_count = k;
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject1 = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      this.chat_photo = ((TLRPC.Photo)localObject1);
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject1 = TLRPC.PeerNotifySettings.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      this.notify_settings = ((TLRPC.PeerNotifySettings)localObject1);
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject1 = TLRPC.ExportedChatInvite.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
      this.exported_invite = ((TLRPC.ExportedChatInvite)localObject1);
      k = paramAbstractSerializedData.readInt32(paramBoolean);
      int m = 481674261;
      if (k == m) {
        break;
      }
      if (!paramBoolean) {
        break label357;
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
    }
    k = paramAbstractSerializedData.readInt32(paramBoolean);
    if (j < k)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject3 = TLRPC.BotInfo.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      if (localObject3 != null) {}
    }
    for (;;)
    {
      label357:
      return;
      localObject2 = this.bot_info;
      ((ArrayList)localObject2).add(localObject3);
      j += 1;
      break;
      k = this.flags & 0x10;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.migrated_from_chat_id = k;
      }
      k = this.flags & 0x10;
      if (k != 0)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        this.migrated_from_max_id = k;
      }
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.can_view_participants;
    if (bool) {}
    for (int j = this.flags | 0x8;; j = this.flags & 0xFFFFFFF7)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      j = this.id;
      paramAbstractSerializedData.writeInt32(j);
      Object localObject = this.about;
      paramAbstractSerializedData.writeString((String)localObject);
      j = this.flags & 0x1;
      if (j != 0)
      {
        j = this.participants_count;
        paramAbstractSerializedData.writeInt32(j);
      }
      j = this.flags & 0x2;
      if (j != 0)
      {
        j = this.admins_count;
        paramAbstractSerializedData.writeInt32(j);
      }
      j = this.flags & 0x4;
      if (j != 0)
      {
        j = this.kicked_count;
        paramAbstractSerializedData.writeInt32(j);
      }
      j = this.read_inbox_max_id;
      paramAbstractSerializedData.writeInt32(j);
      j = this.unread_count;
      paramAbstractSerializedData.writeInt32(j);
      j = this.unread_important_count;
      paramAbstractSerializedData.writeInt32(j);
      this.chat_photo.serializeToStream(paramAbstractSerializedData);
      this.notify_settings.serializeToStream(paramAbstractSerializedData);
      this.exported_invite.serializeToStream(paramAbstractSerializedData);
      paramAbstractSerializedData.writeInt32(481674261);
      int k = this.bot_info.size();
      paramAbstractSerializedData.writeInt32(k);
      j = 0;
      localObject = null;
      for (int m = 0; m < k; m = j)
      {
        localObject = (TLRPC.BotInfo)this.bot_info.get(m);
        ((TLRPC.BotInfo)localObject).serializeToStream(paramAbstractSerializedData);
        j = m + 1;
      }
    }
    j = this.flags & 0x10;
    if (j != 0)
    {
      j = this.migrated_from_chat_id;
      paramAbstractSerializedData.writeInt32(j);
    }
    j = this.flags & 0x10;
    if (j != 0)
    {
      j = this.migrated_from_max_id;
      paramAbstractSerializedData.writeInt32(j);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channelFull.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */