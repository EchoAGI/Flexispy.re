package com.vvt.capture.telegram.internal;

public class TLRPC$TL_documentAttributeAudio_layer45
  extends TLRPC.TL_documentAttributeAudio
{
  public static int constructor = 556656416;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.duration = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.title = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.performer = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.duration;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    str = this.performer;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_documentAttributeAudio_layer45.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */