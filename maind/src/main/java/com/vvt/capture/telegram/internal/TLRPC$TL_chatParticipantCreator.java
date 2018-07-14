package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chatParticipantCreator
  extends TLRPC.ChatParticipant
{
  public static int constructor = -636267638;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipantCreator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */