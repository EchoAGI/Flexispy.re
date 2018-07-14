package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_searchGifs
  extends TLObject
{
  public static int constructor = -1080395925;
  public int offset;
  public String q;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.TL_messages_foundGifs.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.q;
    paramAbstractSerializedData.writeString(str);
    i = this.offset;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_searchGifs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */