package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateChatUserTyping
  extends TLRPC.Update
{
  public static int constructor = -1704596961;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.chat_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.SendMessageAction localSendMessageAction = TLRPC.SendMessageAction.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.action = localSendMessageAction;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    this.action.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateChatUserTyping.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */