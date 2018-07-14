package com.vvt.capture.telegram.internal;

public class TLRPC$TL_encryptedChat_old
  extends TLRPC.TL_encryptedChat
{
  public static int constructor = 1711395151;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.access_hash = l;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.admin_id = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.participant_id = i;
    byte[] arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.g_a_or_b = arrayOfByte;
    arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.nonce = arrayOfByte;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.key_fingerprint = l;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.access_hash;
    paramAbstractSerializedData.writeInt64(l);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    i = this.admin_id;
    paramAbstractSerializedData.writeInt32(i);
    i = this.participant_id;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.g_a_or_b;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    arrayOfByte = this.nonce;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    l = this.key_fingerprint;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_encryptedChat_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */