package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_getWebPagePreview
  extends TLObject
{
  public static int constructor = 623001124;
  public String message;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.MessageMedia.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.message;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getWebPagePreview.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */