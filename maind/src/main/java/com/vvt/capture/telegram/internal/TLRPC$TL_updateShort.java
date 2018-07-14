package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateShort
  extends TLRPC.Updates
{
  public static int constructor = 2027216577;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    TLRPC.Update localUpdate = TLRPC.Update.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.update = localUpdate;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    this.update.serializeToStream(paramAbstractSerializedData);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateShort.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */