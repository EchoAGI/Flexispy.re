package com.vvt.capture.telegram.internal;

public class TLRPC$PeerNotifySettings
  extends TLObject
{
  public int events_mask;
  public int mute_until;
  public boolean show_previews;
  public String sound;
  
  public static PeerNotifySettings TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
  {
    Object localObject = null;
    switch (paramInt)
    {
    }
    while ((localObject == null) && (paramBoolean))
    {
      localObject = new java/lang/RuntimeException;
      Object[] arrayOfObject = new Object[1];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      String str = String.format("can't parse magic %x in PeerNotifySettings", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerNotifySettingsEmpty;
      ((TLRPC.TL_peerNotifySettingsEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerNotifySettings;
      ((TLRPC.TL_peerNotifySettings)localObject).<init>();
    }
    if (localObject != null) {
      ((PeerNotifySettings)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (PeerNotifySettings)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$PeerNotifySettings.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */