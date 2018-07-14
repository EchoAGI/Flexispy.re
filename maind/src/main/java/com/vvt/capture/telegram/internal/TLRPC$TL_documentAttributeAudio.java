package com.vvt.capture.telegram.internal;

public class TLRPC$TL_documentAttributeAudio
  extends TLRPC.DocumentAttribute
{
  public static int constructor = -1739392570;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    i = this.flags & 0x400;
    if (i != 0) {
      i = 1;
    }
    for (;;)
    {
      this.voice = i;
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.duration = i;
      i = this.flags & 0x1;
      if (i != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.title = ((String)localObject);
      }
      i = this.flags & 0x2;
      if (i != 0)
      {
        localObject = paramAbstractSerializedData.readString(paramBoolean);
        this.performer = ((String)localObject);
      }
      i = this.flags & 0x4;
      if (i != 0)
      {
        localObject = paramAbstractSerializedData.readByteArray(paramBoolean);
        this.waveform = ((byte[])localObject);
      }
      return;
      i = 0;
      Object localObject = null;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.voice;
    if (bool) {}
    for (int j = this.flags | 0x400;; j = this.flags & 0xFBFF)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      j = this.duration;
      paramAbstractSerializedData.writeInt32(j);
      j = this.flags & 0x1;
      Object localObject;
      if (j != 0)
      {
        localObject = this.title;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      j = this.flags & 0x2;
      if (j != 0)
      {
        localObject = this.performer;
        paramAbstractSerializedData.writeString((String)localObject);
      }
      j = this.flags & 0x4;
      if (j != 0)
      {
        localObject = this.waveform;
        paramAbstractSerializedData.writeByteArray((byte[])localObject);
      }
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeAudio.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */