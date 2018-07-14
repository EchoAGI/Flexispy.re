package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_installStickerSet
  extends TLObject
{
  public static int constructor = 2066793382;
  public boolean disabled;
  public TLRPC.InputStickerSet stickerset;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.stickerset.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.disabled;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_installStickerSet.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */