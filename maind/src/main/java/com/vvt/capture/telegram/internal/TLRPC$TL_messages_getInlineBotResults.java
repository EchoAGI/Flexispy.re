package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_getInlineBotResults
  extends TLObject
{
  public static int constructor = -1826332659;
  public TLRPC.InputUser bot;
  public String offset;
  public String query;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_messages_botResults.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.bot.serializeToStream(paramAbstractSerializedData);
    String str = this.query;
    paramAbstractSerializedData.writeString(str);
    str = this.offset;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getInlineBotResults.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */