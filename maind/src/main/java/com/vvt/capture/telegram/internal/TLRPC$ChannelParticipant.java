package com.vvt.capture.telegram.internal;

public class TLRPC$ChannelParticipant
  extends TLObject
{
  public int date;
  public int inviter_id;
  public int kicked_by;
  public int user_id;
  
  public static ChannelParticipant TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ChannelParticipant", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipant;
      ((TLRPC.TL_channelParticipant)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantSelf;
      ((TLRPC.TL_channelParticipantSelf)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantEditor;
      ((TLRPC.TL_channelParticipantEditor)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantKicked;
      ((TLRPC.TL_channelParticipantKicked)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantModerator;
      ((TLRPC.TL_channelParticipantModerator)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_channelParticipantCreator;
      ((TLRPC.TL_channelParticipantCreator)localObject).<init>();
    }
    if (localObject != null) {
      ((ChannelParticipant)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChannelParticipant)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChannelParticipant.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */