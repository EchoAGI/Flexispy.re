package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_sendCode
  extends TLObject
{
  public static int constructor = 1988976461;
  public String api_hash;
  public int api_id;
  public String lang_code;
  public String phone_number;
  public int sms_type;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.auth_SentCode.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.phone_number;
    paramAbstractSerializedData.writeString(str);
    i = this.sms_type;
    paramAbstractSerializedData.writeInt32(i);
    i = this.api_id;
    paramAbstractSerializedData.writeInt32(i);
    str = this.api_hash;
    paramAbstractSerializedData.writeString(str);
    str = this.lang_code;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_sendCode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */