package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateUserPhone
  extends TLRPC.Update
{
  public static int constructor = 314130811;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.phone = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.phone;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateUserPhone.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */