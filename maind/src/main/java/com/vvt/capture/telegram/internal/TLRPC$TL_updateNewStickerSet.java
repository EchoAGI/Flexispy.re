package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateNewStickerSet
  extends TLRPC.Update
{
  public static int constructor = 1753886890;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.TL_messages_stickerSet localTL_messages_stickerSet = TLRPC.TL_messages_stickerSet.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.stickerset = localTL_messages_stickerSet;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.stickerset.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateNewStickerSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */