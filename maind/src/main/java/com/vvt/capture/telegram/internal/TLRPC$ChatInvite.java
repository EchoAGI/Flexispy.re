package com.vvt.capture.telegram.internal;

public class TLRPC$ChatInvite
  extends TLObject
{
  public boolean broadcast;
  public boolean channel;
  public TLRPC.Chat chat;
  public int flags;
  public boolean isPublic;
  public boolean megagroup;
  public String title;
  
  public static ChatInvite TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ChatInvite", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatInvite;
      ((TLRPC.TL_chatInvite)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatInviteAlready;
      ((TLRPC.TL_chatInviteAlready)localObject).<init>();
    }
    if (localObject != null) {
      ((ChatInvite)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChatInvite)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChatInvite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */