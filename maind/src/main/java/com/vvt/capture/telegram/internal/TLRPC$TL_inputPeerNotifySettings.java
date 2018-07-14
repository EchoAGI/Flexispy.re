package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputPeerNotifySettings
  extends TLObject
{
  public static int constructor = 1185074840;
  public int events_mask;
  public int mute_until;
  public boolean show_previews;
  public String sound;
  
  public static TL_inputPeerNotifySettings TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    int i = constructor;
    Object localObject;
    if (i != paramInt)
    {
      if (paramBoolean)
      {
        localObject = new java/lang/RuntimeException;
        Object[] arrayOfObject = new Object[1];
        Integer localInteger = Integer.valueOf(paramInt);
        arrayOfObject[0] = localInteger;
        String str = String.format("can't parse magic %x in TL_inputPeerNotifySettings", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_inputPeerNotifySettings)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerNotifySettings;
      ((TL_inputPeerNotifySettings)localObject).<init>();
      ((TL_inputPeerNotifySettings)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
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


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerNotifySettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */