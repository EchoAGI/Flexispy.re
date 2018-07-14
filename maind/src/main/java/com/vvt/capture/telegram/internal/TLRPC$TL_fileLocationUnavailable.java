package com.vvt.capture.telegram.internal;

public class TLRPC$TL_fileLocationUnavailable
  extends TLRPC.FileLocation
{
  public static int constructor = 2086234950;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.volume_id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.local_id = i;
    l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.secret = l;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.volume_id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.local_id;
    paramAbstractSerializedData.writeInt32(i);
    l = this.secret;
    paramAbstractSerializedData.writeInt64(l);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_fileLocationUnavailable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */