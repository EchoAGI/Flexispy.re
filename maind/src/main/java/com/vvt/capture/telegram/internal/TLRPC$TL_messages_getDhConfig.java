package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_getDhConfig
  extends TLObject
{
  public static int constructor = 651135312;
  public int random_length;
  public int version;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.messages_DhConfig.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.version;
    paramAbstractSerializedData.writeInt32(i);
    i = this.random_length;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getDhConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */