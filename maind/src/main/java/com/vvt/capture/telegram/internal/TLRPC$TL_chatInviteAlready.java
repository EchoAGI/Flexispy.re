package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chatInviteAlready
  extends TLRPC.ChatInvite
{
  public static int constructor = 1516793212;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Chat localChat = TLRPC.Chat.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.chat = localChat;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.chat.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatInviteAlready.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */