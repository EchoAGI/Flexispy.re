package com.vvt.capture.telegram.internal;

public class TLRPC$TL_documentAttributeSticker
  extends TLRPC.DocumentAttribute
{
  public static int constructor = 1662637586;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    i = this.flags & 0x2;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      this.mask = i;
      Object localObject = paramAbstractSerializedData.readString(paramBoolean);
      this.alt = ((String)localObject);
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      localObject = TLRPC.InputStickerSet.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
      this.stickerset = ((TLRPC.InputStickerSet)localObject);
      i = this.flags & 0x1;
      if (i != 0)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        localObject = TLRPC.TL_maskCoords.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
        this.mask_coords = ((TLRPC.TL_maskCoords)localObject);
      }
      return;
      i = 0;
      localObject = null;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.mask;
    if (bool) {}
    for (int j = this.flags | 0x2;; j = this.flags & 0xFFFFFFFD)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      Object localObject = this.alt;
      paramAbstractSerializedData.writeString((String)localObject);
      localObject = this.stickerset;
      ((TLRPC.InputStickerSet)localObject).serializeToStream(paramAbstractSerializedData);
      j = this.flags & 0x1;
      if (j != 0)
      {
        localObject = this.mask_coords;
        ((TLRPC.TL_maskCoords)localObject).serializeToStream(paramAbstractSerializedData);
      }
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeSticker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */