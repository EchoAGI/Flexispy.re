package com.vvt.capture.telegram.internal;

public class TLRPC$TL_help_getAppChangelog
  extends TLObject
{
  public static int constructor = 1537966002;
  public String app_version;
  public String device_model;
  public String lang_code;
  public String system_version;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.help_AppChangelog.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.device_model;
    paramAbstractSerializedData.writeString(str);
    str = this.system_version;
    paramAbstractSerializedData.writeString(str);
    str = this.app_version;
    paramAbstractSerializedData.writeString(str);
    str = this.lang_code;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_help_getAppChangelog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */