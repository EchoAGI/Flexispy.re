package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateWebPage
  extends TLRPC.Update
{
  public static int constructor = 2139689491;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.WebPage localWebPage = TLRPC.WebPage.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.webpage = localWebPage;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts_count = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.webpage.serializeToStream(paramAbstractSerializedData);
    i = this.pts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.pts_count;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateWebPage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */