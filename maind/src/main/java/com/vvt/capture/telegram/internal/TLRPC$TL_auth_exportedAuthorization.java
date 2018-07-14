package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_exportedAuthorization
  extends TLObject
{
  public static int constructor = -543777747;
  public byte[] bytes;
  public int id;
  
  public static TL_auth_exportedAuthorization TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_auth_exportedAuthorization", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_auth_exportedAuthorization)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_auth_exportedAuthorization;
      ((TL_auth_exportedAuthorization)localObject).<init>();
      ((TL_auth_exportedAuthorization)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    byte[] arrayOfByte = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.bytes = arrayOfByte;
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_exportedAuthorization.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */