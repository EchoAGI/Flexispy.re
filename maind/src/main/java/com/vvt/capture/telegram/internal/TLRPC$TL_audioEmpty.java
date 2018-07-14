package com.vvt.capture.telegram.internal;

public class TLRPC$TL_audioEmpty
  extends TLRPC.Audio
{
  public static int constructor = 1483311320;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.id;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_audioEmpty.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */