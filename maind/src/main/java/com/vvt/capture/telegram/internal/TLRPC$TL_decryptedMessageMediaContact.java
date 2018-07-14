package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageMediaContact
  extends TLRPC.DecryptedMessageMedia
{
  public static int constructor = 1485441687;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.phone_number = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.first_name = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.last_name = str;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
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
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageMediaContact.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */