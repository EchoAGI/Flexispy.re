package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageService_old
  extends TLRPC.TL_decryptedMessageService
{
  public static int constructor = -1438109059;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.random_id = l;
    Object localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.random_bytes = ((byte[])localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.DecryptedMessageAction.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.action = ((TLRPC.DecryptedMessageAction)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
    byte[] arrayOfByte = this.random_bytes;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    this.action.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageService_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */