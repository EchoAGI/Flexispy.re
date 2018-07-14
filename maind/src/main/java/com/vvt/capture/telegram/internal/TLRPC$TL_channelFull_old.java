package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channelFull_old
  extends TLRPC.TL_channelFull
{
  public static int constructor = -88925533;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    i = this.flags & 0x8;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      this.can_view_participants = i;
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.id = i;
      Object localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.about = ((String)localObject);
      i = this.flags & 0x1;
      if (i != 0)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        this.participants_count = i;
      }
      i = this.flags & 0x2;
      if (i != 0)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        this.admins_count = i;
      }
      i = this.flags & 0x4;
      if (i != 0)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        this.kicked_count = i;
      }
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.read_inbox_max_id = i;
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.unread_count = i;
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.unread_important_count = i;
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      this.chat_photo = ((TLRPC.Photo)localObject);
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.PeerNotifySettings.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      this.notify_settings = ((TLRPC.PeerNotifySettings)localObject);
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.ExportedChatInvite.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      this.exported_invite = ((TLRPC.ExportedChatInvite)localObject);
      return;
      i = 0;
      localObject = null;
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
      String str = this.about;
      paramAbstractSerializedData.writeString(str);
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
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channelFull_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */