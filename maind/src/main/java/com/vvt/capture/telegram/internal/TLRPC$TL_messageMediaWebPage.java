package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageMediaWebPage
  extends TLRPC.MessageMedia
{
  public static int constructor = -1557277184;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.WebPage localWebPage = TLRPC.WebPage.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.webpage = localWebPage;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.webpage.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaWebPage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */