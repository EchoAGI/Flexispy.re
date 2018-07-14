package com.vvt.capture.telegram.internal;

public class TLRPC$TL_decryptedMessageActionNotifyLayer
  extends TLRPC.DecryptedMessageAction
{
  public static int constructor = -217806717;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.layer = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.layer;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_decryptedMessageActionNotifyLayer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */