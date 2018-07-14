package com.vvt.capture.telegram.internal;

public class TLRPC$TL_peerNotifySettings
  extends TLRPC.PeerNotifySettings
{
  public static int constructor = -1923214866;
  
  public void readParams(AbstractSerializedData paramAbstractSerializedData, boolean paramBoolean)
  {
    int i = paramAbstractSerializedData.readInt32(paramBoolean);
    this.mute_until = i;
    String str = paramAbstractSerializedData.readString(paramBoolean);
    this.sound = str;
    boolean bool = paramAbstractSerializedData.readBool(paramBoolean);
    this.show_previews = bool;
    int j = paramAbstractSerializedData.readInt32(paramBoolean);
    this.events_mask = j;
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
    i = this.mute_until;
    paramAbstractSerializedData.writeInt32(i);
    String str = this.sound;
    paramAbstractSerializedData.writeString(str);
    boolean bool = this.show_previews;
    paramAbstractSerializedData.writeBool(bool);
    int j = this.events_mask;
    paramAbstractSerializedData.writeInt32(j);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_peerNotifySettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */