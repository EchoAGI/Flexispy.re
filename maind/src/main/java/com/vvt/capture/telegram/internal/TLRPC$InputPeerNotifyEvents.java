package com.vvt.capture.telegram.internal;

public class TLRPC$InputPeerNotifyEvents
  extends TLObject
{
  public static InputPeerNotifyEvents TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputPeerNotifyEvents", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerNotifyEventsAll;
      ((TLRPC.TL_inputPeerNotifyEventsAll)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerNotifyEventsEmpty;
      ((TLRPC.TL_inputPeerNotifyEventsEmpty)localObject).<init>();
    }
    if (localObject != null) {
      ((InputPeerNotifyEvents)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputPeerNotifyEvents)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputPeerNotifyEvents.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */