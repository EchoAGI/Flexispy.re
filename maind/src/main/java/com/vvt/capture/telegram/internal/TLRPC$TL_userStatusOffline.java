package com.vvt.capture.telegram.internal;

public class TLRPC$TL_userStatusOffline
  extends TLRPC.UserStatus
{
  public static int constructor = 9203775;
  
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_userStatusOffline.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */