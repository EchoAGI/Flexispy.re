package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_noPassword
  extends TLRPC.account_Password
{
  public static int constructor = -1764049896;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.new_salt = ((byte[])localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.email_unconfirmed_pattern = ((String)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.new_salt;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    localObject = this.email_unconfirmed_pattern;
    paramAbstractSerializedData.writeString((String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_noPassword.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */