package com.vvt.capture.telegram.internal;

public class TLRPC$TL_wallPaperSolid
  extends TLRPC.WallPaper
{
  public static int constructor = 1662091044;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.id = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.title = str;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.bg_color = i;
    i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.color = i;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.id;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.title;
    paramAbstractSerializedData.writeString(str);
    i = this.bg_color;
    paramAbstractSerializedData.writeInt32(i);
    i = this.color;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_wallPaperSolid.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */