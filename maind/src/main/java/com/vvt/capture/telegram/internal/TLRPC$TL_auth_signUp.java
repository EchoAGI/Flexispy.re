package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_signUp
  extends TLObject
{
  public static int constructor = 453408308;
  public String first_name;
  public String last_name;
  public String phone_code;
  public String phone_code_hash;
  public String phone_number;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_auth_authorization.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.phone_number;
    paramAbstractSerializedData.writeString(str);
    str = this.phone_code_hash;
    paramAbstractSerializedData.writeString(str);
    str = this.phone_code;
    paramAbstractSerializedData.writeString(str);
    str = this.first_name;
    paramAbstractSerializedData.writeString(str);
    str = this.last_name;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_signUp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */