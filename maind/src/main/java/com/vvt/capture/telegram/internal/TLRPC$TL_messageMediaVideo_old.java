package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageMediaVideo_old
  extends TLRPC.TL_messageMediaVideo
{
  public static int constructor = -1563278704;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Video localVideo = TLRPC.Video.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.video = localVideo;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.video.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaVideo_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */