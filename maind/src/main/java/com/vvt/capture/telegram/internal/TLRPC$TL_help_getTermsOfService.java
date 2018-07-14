package com.vvt.capture.telegram.internal;

public class TLRPC$TL_help_getTermsOfService
  extends TLObject
{
  public static int constructor = 936873859;
  public String lang_code;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_help_termsOfService.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.lang_code;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_help_getTermsOfService.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */