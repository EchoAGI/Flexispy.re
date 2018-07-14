package com.vvt.capture.telegram.internal;

import java.util.ArrayList;

public class TLRPC$ChatParticipants
  extends TLObject
{
  public int admin_id;
  public int chat_id;
  public int flags;
  public ArrayList participants;
  public TLRPC.ChatParticipant self_participant;
  public int version;
  
  public TLRPC$ChatParticipants()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.participants = localArrayList;
  }
  
  public static ChatParticipants TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ChatParticipants", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipantsForbidden;
      ((TLRPC.TL_chatParticipantsForbidden)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipants;
      ((TLRPC.TL_chatParticipants)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipants_old;
      ((TLRPC.TL_chatParticipants_old)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipantsForbidden_old;
      ((TLRPC.TL_chatParticipantsForbidden_old)localObject).<init>();
    }
    if (localObject != null) {
      ((ChatParticipants)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChatParticipants)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChatParticipants.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */