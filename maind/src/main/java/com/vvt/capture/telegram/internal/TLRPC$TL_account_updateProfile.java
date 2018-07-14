package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_updateProfile
  extends TLObject
{
  public static int constructor = -259486360;
  public String first_name;
  public String last_name;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.User.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.first_name;
    paramAbstractSerializedData.writeString(str);
    str = this.last_name;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_updateProfile.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */