package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputUser
  extends TLRPC.InputUser
{
  public static int constructor = -668391402;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.access_hash = l;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.access_hash;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputUser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */