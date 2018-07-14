package com.vvt.capture.telegram.internal;

public class TLRPC$TL_updateServiceNotification
  extends TLRPC.Update
{
  public static int constructor = 942527460;
  public String message;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    Object localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.type = ((String)localObject);
    localObject = paramAbstractSerializedData.readString(paramBoolean);
    this.message = ((String)localObject);
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    localObject = TLRPC.MessageMedia.TLdeserialize(paramAbstractSerializedData, i, paramBoolean);
    this.media = ((TLRPC.MessageMedia)localObject);
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.popup = bool;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.type;
    paramAbstractSerializedData.writeString(str);
    str = this.message;
    paramAbstractSerializedData.writeString(str);
    this.media.serializeToStream(paramAbstractSerializedData);
    boolean bool = this.popup;
    paramAbstractSerializedData.writeBool(bool);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_updateServiceNotification.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */