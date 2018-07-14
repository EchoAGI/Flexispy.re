package com.vvt.capture.telegram.internal;

public class TLRPC$TL_geoChatMessageService
  extends TLRPC.GeoChatMessage
{
  public static int constructor = -749755826;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.chat_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.from_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.MessageAction localMessageAction = TLRPC.MessageAction.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.action = localMessageAction;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.from_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    this.action.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_geoChatMessageService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */