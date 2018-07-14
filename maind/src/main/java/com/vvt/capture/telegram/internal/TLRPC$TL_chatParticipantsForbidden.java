package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chatParticipantsForbidden
  extends TLRPC.ChatParticipants
{
  public static int constructor = -57668565;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.chat_id = i;
    i = this.flags & 0x1;
    if (i != 0)
    {
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      TLRPC.ChatParticipant localChatParticipant = TLRPC.ChatParticipant.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      this.self_participant = localChatParticipant;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags;
    paramAbstractSerializedData.writeInt32(i);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.flags & 0x1;
    if (i != 0)
    {
      TLRPC.ChatParticipant localChatParticipant = this.self_participant;
      localChatParticipant.serializeToStream(paramAbstractSerializedData);
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipantsForbidden.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */