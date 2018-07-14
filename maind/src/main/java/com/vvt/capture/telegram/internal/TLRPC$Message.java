package com.vvt.capture.telegram.internal;

import java.util.ArrayList;
import java.util.HashMap;

public class TLRPC$Message
  extends TLObject
{
  public TLRPC.MessageAction action;
  public String attachPath;
  public int date;
  public int destroyTime;
  public long dialog_id;
  public int edit_date;
  public ArrayList entities;
  public int flags;
  public int from_id;
  public int fwd_date;
  public TLRPC.TL_messageFwdHeader fwd_from;
  public TLRPC.Peer fwd_from_id;
  public int fwd_msg_id;
  public int id;
  public int layer;
  public int local_id;
  public TLRPC.MessageMedia media;
  public boolean media_unread;
  public boolean mentioned;
  public String message;
  public boolean out;
  public HashMap params;
  public boolean post;
  public long random_id;
  public Message replyMessage;
  public TLRPC.ReplyMarkup reply_markup;
  public int reply_to_msg_id;
  public long reply_to_random_id;
  public int send_state;
  public int seq_in;
  public int seq_out;
  public boolean silent;
  public TLRPC.Peer to_id;
  public int ttl;
  public boolean unread;
  public int via_bot_id;
  public String via_bot_name;
  public int views;
  
  public TLRPC$Message()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.entities = localArrayList;
    this.send_state = 0;
    this.fwd_msg_id = 0;
    this.attachPath = "";
    this.local_id = 0;
  }
  
  public static Message TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Message", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageService_old2;
      ((TLRPC.TL_messageService_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_old3;
      ((TLRPC.TL_message_old3)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_old4;
      ((TLRPC.TL_message_old4)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_old0;
      ((TLRPC.TL_message_old0)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message;
      ((TLRPC.TL_message)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_old7;
      ((TLRPC.TL_message_old7)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageService;
      ((TLRPC.TL_messageService)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageEmpty;
      ((TLRPC.TL_messageEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_old6;
      ((TLRPC.TL_message_old6)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageForwarded_old2;
      ((TLRPC.TL_messageForwarded_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageForwarded_old;
      ((TLRPC.TL_messageForwarded_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_old2;
      ((TLRPC.TL_message_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messageService_old;
      ((TLRPC.TL_messageService_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_old;
      ((TLRPC.TL_message_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_secret;
      ((TLRPC.TL_message_secret)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_secret_old;
      ((TLRPC.TL_message_secret_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_message_old5;
      ((TLRPC.TL_message_old5)localObject).<init>();
    }
    if (localObject != null) {
      ((Message)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Message)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Message.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */