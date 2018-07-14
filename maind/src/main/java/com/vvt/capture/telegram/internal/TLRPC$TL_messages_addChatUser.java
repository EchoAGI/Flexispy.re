package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_addChatUser
  extends TLObject
{
  public static int constructor = -106911223;
  public int chat_id;
  public int fwd_limit;
  public TLRPC.InputUser user_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Updates.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
    this.user_id.serializeToStream(paramAbstractSerializedData);
    i = this.fwd_limit;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_addChatUser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */