package com.vvt.capture.telegram.internal;

public class TLRPC$TL_chatForbidden_old
  extends TLRPC.TL_chatForbidden
{
  public static int constructor = -83047359;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.title = str;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.date = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    i = this.date;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_chatForbidden_old.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */