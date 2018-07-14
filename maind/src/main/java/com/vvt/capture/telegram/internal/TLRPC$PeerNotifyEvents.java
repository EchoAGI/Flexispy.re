package com.vvt.capture.telegram.internal;

public class TLRPC$PeerNotifyEvents
  extends TLObject
{
  public static PeerNotifyEvents TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in PeerNotifyEvents", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerNotifyEventsEmpty;
      ((TLRPC.TL_peerNotifyEventsEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerNotifyEventsAll;
      ((TLRPC.TL_peerNotifyEventsAll)localObject).<init>();
    }
    if (localObject != null) {
      ((PeerNotifyEvents)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (PeerNotifyEvents)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$PeerNotifyEvents.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */