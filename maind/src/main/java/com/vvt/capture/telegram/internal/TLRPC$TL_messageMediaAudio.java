package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messageMediaAudio
  extends TLRPC.MessageMedia
{
  public static int constructor = -961117440;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Audio localAudio = TLRPC.Audio.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.audio = localAudio;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.audio.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messageMediaAudio.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */