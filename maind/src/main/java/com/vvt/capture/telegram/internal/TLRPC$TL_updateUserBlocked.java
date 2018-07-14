package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateUserBlocked
  extends TLRPC.Update
{
  public static int constructor = -2131957734;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.user_id = i;
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.blocked = bool;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.user_id;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.blocked;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateUserBlocked.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */