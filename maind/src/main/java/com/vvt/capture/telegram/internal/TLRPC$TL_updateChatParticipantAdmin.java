package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateChatParticipantAdmin
  extends TLRPC.Update
{
  public static int constructor = -1232070311;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.chat_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.is_admin = bool;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.version = j;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.is_admin;
    paramAbstractSerializedData.writeBool(bool);
    int j = this.version;
    paramAbstractSerializedData.writeInt32(j);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateChatParticipantAdmin.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */