package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputPhotoCrop
  extends TLRPC.InputPhotoCrop
{
  public static int constructor = -644787419;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    double d = paramAbstractSerializedData.readDouble(paramBoolean);
    this.crop_left = d;
    d = paramAbstractSerializedData.readDouble(paramBoolean);
    this.crop_top = d;
    d = paramAbstractSerializedData.readDouble(paramBoolean);
    this.crop_width = d;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    double d = this.crop_left;
    paramAbstractSerializedData.writeDouble(d);
    d = this.crop_top;
    paramAbstractSerializedData.writeDouble(d);
    d = this.crop_width;
    paramAbstractSerializedData.writeDouble(d);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputPhotoCrop.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */