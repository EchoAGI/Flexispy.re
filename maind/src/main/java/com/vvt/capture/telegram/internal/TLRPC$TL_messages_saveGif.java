package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_saveGif
  extends TLObject
{
  public static int constructor = 846868683;
  public TLRPC.InputDocument id;
  public boolean unsave;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.Bool.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.id.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.unsave;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_saveGif.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */