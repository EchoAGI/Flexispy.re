package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputMediaVideo
  extends TLRPC.InputMedia
{
  public static int constructor = -1821749571;
  public TLRPC.InputVideo id;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    Object localObject = TLRPC.InputVideo.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.id = ((TLRPC.InputVideo)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.caption = ((String)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.id.serializeToStream(paramAbstractSerializedData);
    String str = this.caption;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputMediaVideo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */