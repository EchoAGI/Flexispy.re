package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$ChatFull
  extends TLObject
{
  public String about;
  public int admins_count;
  public ArrayList bot_info;
  public boolean can_view_participants;
  public TLRPC.Photo chat_photo;
  public TLRPC.ExportedChatInvite exported_invite;
  public int flags;
  public int id;
  public int kicked_count;
  public int migrated_from_chat_id;
  public int migrated_from_max_id;
  public TLRPC.PeerNotifySettings notify_settings;
  public TLRPC.ChatParticipants participants;
  public int participants_count;
  public int read_inbox_max_id;
  public int unread_count;
  public int unread_important_count;
  
  public TLRPC$ChatFull()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.bot_info = localArrayList;
  }
  
  public static ChatFull TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in ChatFull", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelFull_old;
      ((TLRPC.TL_channelFull_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatFull;
      ((TLRPC.TL_chatFull)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelFull;
      ((TLRPC.TL_channelFull)localObject).<init>();
    }
    if (localObject != null) {
      ((ChatFull)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChatFull)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChatFull.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */