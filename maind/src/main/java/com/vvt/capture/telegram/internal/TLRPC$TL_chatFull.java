package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$TL_chatFull
  extends TLRPC.ChatFull
{
  public static int constructor = 771925524;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = 0;
    String str = null;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = j;
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject1 = TLRPC.ChatParticipants.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.participants = ((TLRPC.ChatParticipants)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject1 = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.chat_photo = ((TLRPC.Photo)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject1 = TLRPC.PeerNotifySettings.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.notify_settings = ((TLRPC.PeerNotifySettings)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject1 = TLRPC.ExportedChatInvite.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.exported_invite = ((TLRPC.ExportedChatInvite)localObject1);
    j = paramAbstractSerializedData.readInt32(paramBoolean);
    int k = 481674261;
    Object localObject2;
    if (j != k)
    {
      if (paramBoolean)
      {
        localObject2 = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        localObject1 = Integer.valueOf(j);
        arrayOfObject[0] = localObject1;
        str = String.format("wrong Vector magic, got %x", arrayOfObject);
        ((RuntimeException)localObject2).<init>(str);
        throw ((Throwable)localObject2);
      }
    }
    else {
      j = paramAbstractSerializedData.readInt32(paramBoolean);
    }
    for (;;)
    {
      if (i < j)
      {
        k = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject2 = TLRPC.BotInfo.TLdeserialize(paramAbstractSerializedData, k, paramBoolean);
        if (localObject2 != null) {}
      }
      else
      {
        return;
      }
      ArrayList localArrayList = this.bot_info;
      localArrayList.add(localObject2);
      i += 1;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    this.participants.serializeToStream(paramAbstractSerializedData);
    this.chat_photo.serializeToStream(paramAbstractSerializedData);
    this.notify_settings.serializeToStream(paramAbstractSerializedData);
    this.exported_invite.serializeToStream(paramAbstractSerializedData);
    paramAbstractSerializedData.writeInt32(481674261);
    int j = this.bot_info.size();
    paramAbstractSerializedData.writeInt32(j);
    i = 0;
    TLRPC.BotInfo localBotInfo = null;
    for (int k = 0; k < j; k = i)
    {
      localBotInfo = (TLRPC.BotInfo)this.bot_info.get(k);
      localBotInfo.serializeToStream(paramAbstractSerializedData);
      i = k + 1;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatFull.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */