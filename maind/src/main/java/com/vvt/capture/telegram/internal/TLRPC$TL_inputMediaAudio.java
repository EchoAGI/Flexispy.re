package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputMediaAudio
  extends TLRPC.InputMedia
{
  public static int constructor = -1986820223;
  public TLRPC.InputAudio id;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.InputAudio localInputAudio = TLRPC.InputAudio.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.id = localInputAudio;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.id.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaAudio.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */