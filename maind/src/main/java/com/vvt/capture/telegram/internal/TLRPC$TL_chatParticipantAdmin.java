package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chatParticipantAdmin
  extends TLRPC.ChatParticipant
{
  public static int constructor = -489233354;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.inviter_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.inviter_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipantAdmin.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */