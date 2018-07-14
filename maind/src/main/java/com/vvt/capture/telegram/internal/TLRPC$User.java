package com.vvt.capture.telegram.internal;

public class TLRPC$User
  extends TLObject
{
  public long access_hash;
  public boolean bot;
  public boolean bot_chat_history;
  public int bot_info_version;
  public String bot_inline_placeholder;
  public boolean bot_nochats;
  public boolean contact;
  public boolean deleted;
  public boolean explicit_content;
  public String first_name;
  public int flags;
  public int id;
  public boolean inactive;
  public String last_name;
  public boolean mutual_contact;
  public String phone;
  public TLRPC.UserProfilePhoto photo;
  public boolean restricted;
  public String restriction_reason;
  public boolean self;
  public TLRPC.UserStatus status;
  public String username;
  public boolean verified;
  
  public static User TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in User", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userContact_old2;
      ((TLRPC.TL_userContact_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userContact_old;
      ((TLRPC.TL_userContact_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userSelf_old;
      ((TLRPC.TL_userSelf_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userSelf_old3;
      ((TLRPC.TL_userSelf_old3)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userDeleted_old2;
      ((TLRPC.TL_userDeleted_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userEmpty;
      ((TLRPC.TL_userEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userRequest_old;
      ((TLRPC.TL_userRequest_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userForeign_old;
      ((TLRPC.TL_userForeign_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userForeign_old2;
      ((TLRPC.TL_userForeign_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userRequest_old2;
      ((TLRPC.TL_userRequest_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userDeleted_old;
      ((TLRPC.TL_userDeleted_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userSelf_old2;
      ((TLRPC.TL_userSelf_old2)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_user_old;
      ((TLRPC.TL_user_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_user;
      ((TLRPC.TL_user)localObject).<init>();
    }
    if (localObject != null) {
      ((User)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (User)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$User.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */