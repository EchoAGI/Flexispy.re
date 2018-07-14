package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$Update
  extends TLObject
{
  public TLRPC.SendMessageAction action;
  public long auth_key_id;
  public boolean blocked;
  public int channel_id;
  public TLRPC.EncryptedChat chat;
  public int chat_id;
  public int date;
  public ArrayList dc_options;
  public String device;
  public boolean enabled;
  public String first_name;
  public TLRPC.ContactLink foreign_link;
  public TLRPC.TL_messageGroup group;
  public int id;
  public int inviter_id;
  public boolean is_admin;
  public TLRPC.TL_privacyKeyStatusTimestamp key;
  public String last_name;
  public String location;
  public int max_date;
  public int max_id;
  public TLRPC.MessageMedia media;
  public ArrayList messages;
  public TLRPC.ContactLink my_link;
  public TLRPC.PeerNotifySettings notify_settings;
  public ArrayList order;
  public TLRPC.ChatParticipants participants;
  public String phone;
  public TLRPC.UserProfilePhoto photo;
  public boolean popup;
  public boolean previous;
  public int pts;
  public int pts_count;
  public int qts;
  public long random_id;
  public ArrayList rules;
  public TLRPC.UserStatus status;
  public TLRPC.TL_messages_stickerSet stickerset;
  public String type;
  public int user_id;
  public String username;
  public int version;
  public int views;
  public TLRPC.WebPage webpage;
  
  public TLRPC$Update()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.dc_options = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.rules = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.messages = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.order = localArrayList;
  }
  
  public static Update TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Update", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChatParticipantAdd;
      ((TLRPC.TL_updateChatParticipantAdd)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateStickerSets;
      ((TLRPC.TL_updateStickerSets)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateNotifySettings;
      ((TLRPC.TL_updateNotifySettings)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChannel;
      ((TLRPC.TL_updateChannel)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChatParticipantDelete;
      ((TLRPC.TL_updateChatParticipantDelete)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateUserTyping;
      ((TLRPC.TL_updateUserTyping)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateUserBlocked;
      ((TLRPC.TL_updateUserBlocked)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateNewAuthorization;
      ((TLRPC.TL_updateNewAuthorization)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateContactRegistered;
      ((TLRPC.TL_updateContactRegistered)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateReadChannelInbox;
      ((TLRPC.TL_updateReadChannelInbox)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateNewEncryptedMessage;
      ((TLRPC.TL_updateNewEncryptedMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChatAdmins;
      ((TLRPC.TL_updateChatAdmins)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateSavedGifs;
      ((TLRPC.TL_updateSavedGifs)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateNewChannelMessage;
      ((TLRPC.TL_updateNewChannelMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateMessageID;
      ((TLRPC.TL_updateMessageID)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateDcOptions;
      ((TLRPC.TL_updateDcOptions)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChatParticipants;
      ((TLRPC.TL_updateChatParticipants)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updatePrivacy;
      ((TLRPC.TL_updatePrivacy)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateEncryptedChatTyping;
      ((TLRPC.TL_updateEncryptedChatTyping)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateNewGeoChatMessage;
      ((TLRPC.TL_updateNewGeoChatMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateUserStatus;
      ((TLRPC.TL_updateUserStatus)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChannelMessageViews;
      ((TLRPC.TL_updateChannelMessageViews)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChannelTooLong;
      ((TLRPC.TL_updateChannelTooLong)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateServiceNotification;
      ((TLRPC.TL_updateServiceNotification)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChatParticipantAdmin;
      ((TLRPC.TL_updateChatParticipantAdmin)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateNewStickerSet;
      ((TLRPC.TL_updateNewStickerSet)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateContactLink;
      ((TLRPC.TL_updateContactLink)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateReadHistoryInbox;
      ((TLRPC.TL_updateReadHistoryInbox)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChannelGroup;
      ((TLRPC.TL_updateChannelGroup)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateUserName;
      ((TLRPC.TL_updateUserName)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateDeleteChannelMessages;
      ((TLRPC.TL_updateDeleteChannelMessages)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateUserPhone;
      ((TLRPC.TL_updateUserPhone)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateWebPage;
      ((TLRPC.TL_updateWebPage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateEncryption;
      ((TLRPC.TL_updateEncryption)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateNewMessage;
      ((TLRPC.TL_updateNewMessage)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateStickerSetsOrder;
      ((TLRPC.TL_updateStickerSetsOrder)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateEncryptedMessagesRead;
      ((TLRPC.TL_updateEncryptedMessagesRead)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateReadMessagesContents;
      ((TLRPC.TL_updateReadMessagesContents)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateDeleteMessages;
      ((TLRPC.TL_updateDeleteMessages)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateChatUserTyping;
      ((TLRPC.TL_updateChatUserTyping)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateUserPhoto;
      ((TLRPC.TL_updateUserPhoto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_updateReadHistoryOutbox;
      ((TLRPC.TL_updateReadHistoryOutbox)localObject).<init>();
    }
    if (localObject != null) {
      ((Update)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Update)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Update.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */