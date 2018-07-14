package com.vvt.capture.telegram.internal;

public class TLRPC$TL_channels_updateUsername
  extends TLObject
{
  public static int constructor = 890549214;
  public TLRPC.InputChannel channel;
  public String username;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.channel.serializeToStream(paramAbstractSerializedData);
    String str = this.username;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_channels_updateUsername.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */