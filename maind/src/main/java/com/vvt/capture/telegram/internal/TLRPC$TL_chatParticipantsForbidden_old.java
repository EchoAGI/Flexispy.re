package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chatParticipantsForbidden_old
  extends TLRPC.TL_chatParticipantsForbidden
{
  public static int constructor = 265468810;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.chat_id = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.chat_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatParticipantsForbidden_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */