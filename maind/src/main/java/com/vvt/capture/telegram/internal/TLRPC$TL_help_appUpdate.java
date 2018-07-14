package com.vvt.capture.telegram.internal;

public class TLRPC$TL_help_appUpdate
  extends TLRPC.help_AppUpdate
{
  public static int constructor = -1987579119;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.critical = bool;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.url = str;
    str = paramAbstractSerializedData.readString(paramBoolean);
    this.text = str;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    boolean bool = this.critical;
    paramAbstractSerializedData.writeBool(bool);
    String str = this.url;
    paramAbstractSerializedData.writeString(str);
    str = this.text;
    paramAbstractSerializedData.writeString(str);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_help_appUpdate.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */