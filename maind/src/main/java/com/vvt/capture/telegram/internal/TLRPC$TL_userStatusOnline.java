package com.vvt.capture.telegram.internal;

public class TLRPC$TL_userStatusOnline
  extends TLRPC.UserStatus
{
  public static int constructor = -306628279;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.expires = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.expires;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_userStatusOnline.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */