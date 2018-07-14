package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageMediaDocument_old
  extends TLRPC.TL_messageMediaDocument
{
  public static int constructor = 802824708;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Document localDocument = TLRPC.Document.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.document = localDocument;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.document.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaDocument_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */