package com.vvt.capture.telegram.internal;

public class TLRPC$TL_documentAttributeSticker_old2
  extends TLRPC.TL_documentAttributeSticker
{
  public static int constructor = -1723033470;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.alt = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.alt;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeSticker_old2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */