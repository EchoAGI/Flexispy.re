package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updates_channelDifferenceEmpty
  extends TLRPC.updates_ChannelDifference
{
  public static int constructor = 1041346555;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.flags = i;
    i = this.flags & 0x1;
    if (i != 0) {}
    for (i = 1;; i = 0)
    {
      this.isFinal = i;
      i = paramAbstractSerializedData.readInt32(paramBoolean);
      this.pts = i;
      i = this.flags & 0x2;
      if (i != 0)
      {
        i = paramAbstractSerializedData.readInt32(paramBoolean);
        this.timeout = i;
      }
      return;
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.isFinal;
    if (bool) {}
    for (int j = this.flags | 0x1;; j = this.flags & 0xFFFFFFFE)
    {
      this.flags = j;
      j = this.flags;
      paramAbstractSerializedData.writeInt32(j);
      j = this.pts;
      paramAbstractSerializedData.writeInt32(j);
      j = this.flags & 0x2;
      if (j != 0)
      {
        j = this.timeout;
        paramAbstractSerializedData.writeInt32(j);
      }
      return;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updates_channelDifferenceEmpty.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */