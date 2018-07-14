package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateNewGeoChatMessage
  extends TLRPC.Update
{
  public static int constructor = 1516823543;
  public TLRPC.GeoChatMessage message;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.GeoChatMessage localGeoChatMessage = TLRPC.GeoChatMessage.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.message = localGeoChatMessage;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.message.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateNewGeoChatMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */