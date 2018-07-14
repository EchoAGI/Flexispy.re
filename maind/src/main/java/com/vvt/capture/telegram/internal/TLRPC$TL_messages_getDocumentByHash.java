package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_getDocumentByHash
  extends TLObject
{
  public static int constructor = 864953444;
  public String mime_type;
  public byte[] sha256;
  public int size;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Document.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.sha256;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    i = this.size;
    paramAbstractSerializedData.writeInt32(i);
    localObject = this.mime_type;
    paramAbstractSerializedData.writeString((String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getDocumentByHash.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */