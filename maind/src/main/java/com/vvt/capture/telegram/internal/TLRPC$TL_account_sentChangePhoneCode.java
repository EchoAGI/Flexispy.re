package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_sentChangePhoneCode
  extends TLObject
{
  public static int constructor = -1527411636;
  public String phone_code_hash;
  public int send_call_timeout;
  
  public static TL_account_sentChangePhoneCode TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_account_sentChangePhoneCode", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_account_sentChangePhoneCode)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_account_sentChangePhoneCode;
      ((TL_account_sentChangePhoneCode)localObject).<init>();
      ((TL_account_sentChangePhoneCode)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.phone_code_hash = str;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.send_call_timeout = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.phone_code_hash;
    paramAbstractSerializedData.writeString(str);
    i = this.send_call_timeout;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_sentChangePhoneCode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */