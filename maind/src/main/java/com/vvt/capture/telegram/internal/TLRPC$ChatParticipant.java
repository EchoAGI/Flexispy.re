package com.vvt.capture.telegram.internal;

public class TLRPC$ChatParticipant
  extends TLObject
{
  public int date;
  public int inviter_id;
  public int user_id;
  
  public static ChatParticipant TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in ChatParticipant", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipant;
      ((TLRPC.TL_chatParticipant)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipantCreator;
      ((TLRPC.TL_chatParticipantCreator)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipantAdmin;
      ((TLRPC.TL_chatParticipantAdmin)localObject).<init>();
    }
    if (localObject != null) {
      ((ChatParticipant)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (ChatParticipant)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$ChatParticipant.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */