package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channels_editAbout
  extends TLObject
{
  public static int constructor = 333610782;
  public String about;
  public TLRPC.InputChannel channel;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
    String str = this.about;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_editAbout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */