package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateNewChannelMessage
  extends TLRPC.Update
{
  public static int constructor = 1656358105;
  public TLRPC.Message message;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Message localMessage = TLRPC.Message.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.message = localMessage;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.pts_count = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.message.serializeToStream(paramAbstractSerializedData);
    i = this.pts;
    paramAbstractSerializedData.writeInt32(i);
    i = this.pts_count;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateNewChannelMessage.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */