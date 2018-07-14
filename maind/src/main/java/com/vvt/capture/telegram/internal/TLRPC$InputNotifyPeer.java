package com.vvt.capture.telegram.internal;

public class TLRPC$InputNotifyPeer
  extends TLObject
{
  public static InputNotifyPeer TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputNotifyPeer", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputNotifyChats;
      ((TLRPC.TL_inputNotifyChats)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputNotifyPeer;
      ((TLRPC.TL_inputNotifyPeer)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputNotifyUsers;
      ((TLRPC.TL_inputNotifyUsers)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputNotifyGeoChatPeer;
      ((TLRPC.TL_inputNotifyGeoChatPeer)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputNotifyAll;
      ((TLRPC.TL_inputNotifyAll)localObject).<init>();
    }
    if (localObject != null) {
      ((InputNotifyPeer)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputNotifyPeer)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputNotifyPeer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */