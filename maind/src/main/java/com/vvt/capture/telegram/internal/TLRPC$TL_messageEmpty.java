package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageEmpty
  extends TLRPC.Message
{
  public static int constructor = -2082087340;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    TLRPC.TL_peerUser localTL_peerUser = new com/vvt/capture/telegram/internal/TLRPC$TL_peerUser;
    localTL_peerUser.<init>();
    this.to_id = localTL_peerUser;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageEmpty.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */