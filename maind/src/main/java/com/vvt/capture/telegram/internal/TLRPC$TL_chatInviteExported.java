package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chatInviteExported
  extends TLRPC.ExportedChatInvite
{
  public static int constructor = -64092740;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.link = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.link;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatInviteExported.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */