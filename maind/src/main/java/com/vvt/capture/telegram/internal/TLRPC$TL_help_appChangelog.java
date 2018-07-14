package com.vvt.capture.telegram.internal;

public class TLRPC$TL_help_appChangelog
  extends TLRPC.help_AppChangelog
{
  public static int constructor = 1181279933;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.text = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.text;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_help_appChangelog.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */