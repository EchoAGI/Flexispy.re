package com.vvt.capture.telegram.internal;

public class TLRPC$TL_messages_getSavedGifs
  extends TLObject
{
  public static int constructor = -2084618926;
  public int hash;
  
  public TLObject deserializeResponse(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    return TLRPC.messages_SavedGifs.TLdeserialize(paramAbstractSerializedData, paramInt, paramBoolean);
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.hash;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_messages_getSavedGifs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */