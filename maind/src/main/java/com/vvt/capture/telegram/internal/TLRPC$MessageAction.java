package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$MessageAction
  extends TLObject
{
  public String address;
  public int channel_id;
  public int chat_id;
  public TLRPC.DecryptedMessageAction encryptedAction;
  public int inviter_id;
  public TLRPC.UserProfilePhoto newUserPhoto;
  public TLRPC.Photo photo;
  public String title;
  public int ttl;
  public int user_id;
  public ArrayList users;
  
  public TLRPC$MessageAction()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.users = localArrayList;
  }
  
  public static MessageAction TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in MessageAction", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionLoginUnknownLocation;
      ((TLRPC.TL_messageActionLoginUnknownLocation)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEncryptedAction;
      ((TLRPC.TL_messageEncryptedAction)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatCreate;
      ((TLRPC.TL_messageActionChatCreate)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatMigrateTo;
      ((TLRPC.TL_messageActionChatMigrateTo)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatEditPhoto;
      ((TLRPC.TL_messageActionChatEditPhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChannelMigrateFrom;
      ((TLRPC.TL_messageActionChannelMigrateFrom)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatAddUser;
      ((TLRPC.TL_messageActionChatAddUser)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatDeleteUser;
      ((TLRPC.TL_messageActionChatDeleteUser)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionCreatedBroadcastList;
      ((TLRPC.TL_messageActionCreatedBroadcastList)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionUserJoined;
      ((TLRPC.TL_messageActionUserJoined)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionUserUpdatedPhoto;
      ((TLRPC.TL_messageActionUserUpdatedPhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionGeoChatCheckin;
      ((TLRPC.TL_messageActionGeoChatCheckin)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatJoinedByLink;
      ((TLRPC.TL_messageActionChatJoinedByLink)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatAddUser_old;
      ((TLRPC.TL_messageActionChatAddUser_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionTTLChange;
      ((TLRPC.TL_messageActionTTLChange)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChannelCreate;
      ((TLRPC.TL_messageActionChannelCreate)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatDeletePhoto;
      ((TLRPC.TL_messageActionChatDeletePhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionChatEditTitle;
      ((TLRPC.TL_messageActionChatEditTitle)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionEmpty;
      ((TLRPC.TL_messageActionEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageActionGeoChatCreate;
      ((TLRPC.TL_messageActionGeoChatCreate)localObject).<init>();
    }
    if (localObject != null) {
      ((MessageAction)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (MessageAction)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$MessageAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */