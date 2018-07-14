package com.vvt.capture.telegram.internal;

public class TLRPC$TL_userFull
  extends TLObject
{
  public static int constructor = 1518971995;
  public boolean blocked;
  public TLRPC.BotInfo bot_info;
  public TLRPC.TL_contacts_link link;
  public TLRPC.PeerNotifySettings notify_settings;
  public TLRPC.Photo profile_photo;
  public TLRPC.User user;
  
  public static TL_userFull TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_userFull", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_userFull)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_userFull;
      ((TL_userFull)localObject).<init>();
      ((TL_userFull)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.User.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.user = ((TLRPC.User)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.TL_contacts_link.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.link = ((TLRPC.TL_contacts_link)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.Photo.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.profile_photo = ((TLRPC.Photo)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.PeerNotifySettings.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.notify_settings = ((TLRPC.PeerNotifySettings)localObject);
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.blocked = bool;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.BotInfo.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
    this.bot_info = ((TLRPC.BotInfo)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.user.serializeToStream(paramAbstractSerializedData);
    this.link.serializeToStream(paramAbstractSerializedData);
    this.profile_photo.serializeToStream(paramAbstractSerializedData);
    this.notify_settings.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.blocked;
    paramAbstractSerializedData.writeBool(bool);
    this.bot_info.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_userFull.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */