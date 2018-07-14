package com.vvt.capture.telegram.internal;

public class TLRPC$TL_documentAttributeSticker_layer55
  extends TLRPC.TL_documentAttributeSticker
{
  public static int constructor = 978674434;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.alt = ((String)localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.InputStickerSet.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.stickerset = ((TLRPC.InputStickerSet)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.alt;
    paramAbstractSerializedData.writeString(str);
    this.stickerset.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeSticker_layer55.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */