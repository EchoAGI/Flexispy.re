package com.vvt.capture.telegram.internal;

public class TLRPC$ChannelParticipantRole
  extends TLObject
{
  public static ChannelParticipantRole TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ChannelParticipantRole", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelRoleEditor;
      ((TLRPC.TL_channelRoleEditor)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelRoleEmpty;
      ((TLRPC.TL_channelRoleEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelRoleModerator;
      ((TLRPC.TL_channelRoleModerator)localObject).<init>();
    }
    if (localObject != null) {
      ((ChannelParticipantRole)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChannelParticipantRole)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChannelParticipantRole.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */