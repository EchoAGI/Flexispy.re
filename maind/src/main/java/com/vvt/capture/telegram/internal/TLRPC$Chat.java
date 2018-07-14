package com.vvt.capture.telegram.internal;

public class TLRPC$Chat
  extends TLObject
{
  public long access_hash;
  public String address;
  public boolean admin;
  public boolean admins_enabled;
  public boolean broadcast;
  public boolean checked_in;
  public boolean creator;
  public int date;
  public boolean deactivated;
  public boolean editor;
  public boolean explicit_content;
  public int flags;
  public TLRPC.GeoPoint geo;
  public int id;
  public boolean kicked;
  public boolean left;
  public boolean megagroup;
  public TLRPC.InputChannel migrated_to;
  public boolean moderator;
  public int participants_count;
  public TLRPC.ChatPhoto photo;
  public boolean restricted;
  public String restriction_reason;
  public String title;
  public String username;
  public String venue;
  public boolean verified;
  public int version;
  
  public static Chat TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Chat", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chat_old2;
      ((TLRPC.TL_chat_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatForbidden;
      ((TLRPC.TL_chatForbidden)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channel_old;
      ((TLRPC.TL_channel_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatForbidden_old;
      ((TLRPC.TL_chatForbidden_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chat;
      ((TLRPC.TL_chat)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatEmpty;
      ((TLRPC.TL_chatEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channel;
      ((TLRPC.TL_channel)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_geoChat;
      ((TLRPC.TL_geoChat)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelForbidden;
      ((TLRPC.TL_channelForbidden)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chat_old;
      ((TLRPC.TL_chat_old)localObject).<init>();
    }
    if (localObject != null) {
      ((Chat)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Chat)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Chat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */