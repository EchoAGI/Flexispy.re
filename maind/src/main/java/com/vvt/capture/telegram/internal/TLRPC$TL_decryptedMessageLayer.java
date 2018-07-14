package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageLayer
  extends TLObject
{
  public static int constructor = 467867529;
  public int in_seq_no;
  public int layer;
  public TLRPC.DecryptedMessage message;
  public int out_seq_no;
  public byte[] random_bytes;
  
  public static TL_decryptedMessageLayer TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_decryptedMessageLayer", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_decryptedMessageLayer)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageLayer;
      ((TL_decryptedMessageLayer)localObject).<init>();
      ((TL_decryptedMessageLayer)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.random_bytes = ((byte[])localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.layer = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.in_seq_no = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.out_seq_no = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.DecryptedMessage.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.message = ((TLRPC.DecryptedMessage)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.random_bytes;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
    i = this.layer;
    paramAbstractSerializedData.writeInt32(i);
    i = this.in_seq_no;
    paramAbstractSerializedData.writeInt32(i);
    i = this.out_seq_no;
    paramAbstractSerializedData.writeInt32(i);
    this.message.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageLayer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */