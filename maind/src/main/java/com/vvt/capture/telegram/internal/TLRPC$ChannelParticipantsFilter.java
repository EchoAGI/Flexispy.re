package com.vvt.capture.telegram.internal;

public class TLRPC$ChannelParticipantsFilter
  extends TLObject
{
  public static ChannelParticipantsFilter TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ChannelParticipantsFilter", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantsAdmins;
      ((TLRPC.TL_channelParticipantsAdmins)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantsRecent;
      ((TLRPC.TL_channelParticipantsRecent)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantsKicked;
      ((TLRPC.TL_channelParticipantsKicked)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantsBots;
      ((TLRPC.TL_channelParticipantsBots)localObject).<init>();
    }
    if (localObject != null) {
      ((ChannelParticipantsFilter)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChannelParticipantsFilter)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChannelParticipantsFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */