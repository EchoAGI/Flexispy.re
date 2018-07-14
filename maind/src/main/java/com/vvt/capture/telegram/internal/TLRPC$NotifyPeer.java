package com.vvt.capture.telegram.internal;

public class TLRPC$NotifyPeer
  extends TLObject
{
  public TLRPC.Peer peer;
  
  public static NotifyPeer TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in NotifyPeer", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_notifyAll;
      ((TLRPC.TL_notifyAll)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_notifyChats;
      ((TLRPC.TL_notifyChats)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_notifyUsers;
      ((TLRPC.TL_notifyUsers)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_notifyPeer;
      ((TLRPC.TL_notifyPeer)localObject).<init>();
    }
    if (localObject != null) {
      ((NotifyPeer)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (NotifyPeer)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$NotifyPeer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */