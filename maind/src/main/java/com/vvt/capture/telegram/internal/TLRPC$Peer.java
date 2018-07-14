package com.vvt.capture.telegram.internal;

public class TLRPC$Peer
  extends TLObject
{
  public int channel_id;
  public int chat_id;
  public int user_id;
  
  public static Peer TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Peer", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerChannel;
      ((TLRPC.TL_peerChannel)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerUser;
      ((TLRPC.TL_peerUser)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_peerChat;
      ((TLRPC.TL_peerChat)localObject).<init>();
    }
    if (localObject != null) {
      ((Peer)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Peer)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Peer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */