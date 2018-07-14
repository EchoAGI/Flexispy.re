package com.vvt.capture.telegram.internal;

public class TLRPC$TL_sendMessageUploadDocumentAction_old
  extends TLRPC.TL_sendMessageUploadDocumentAction
{
  public static int constructor = -1884362354;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean) {}
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_sendMessageUploadDocumentAction_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */