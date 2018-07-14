package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputFileBig
  extends TLRPC.InputFile
{
  public static int constructor = -95482955;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    long l = paramAbstractSerializedData.readInt64(paramBoolean);
    this.id = l;
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.parts = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.name = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    long l = this.id;
    paramAbstractSerializedData.writeInt64(l);
    i = this.parts;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.name;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputFileBig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */