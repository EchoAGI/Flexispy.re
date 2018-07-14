package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_checkChatInvite
  extends TLObject
{
  public static int constructor = 1051570619;
  public String hash;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.ChatInvite.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.hash;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_checkChatInvite.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */