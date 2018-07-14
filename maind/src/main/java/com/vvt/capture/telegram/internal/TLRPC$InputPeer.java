package com.vvt.capture.telegram.internal;

public class TLRPC$InputPeer
  extends TLObject
{
  public long access_hash;
  public int channel_id;
  public int chat_id;
  public int user_id;
  
  public static InputPeer TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputPeer", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerUser;
      ((TLRPC.TL_inputPeerUser)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerChat;
      ((TLRPC.TL_inputPeerChat)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerEmpty;
      ((TLRPC.TL_inputPeerEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerSelf;
      ((TLRPC.TL_inputPeerSelf)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPeerChannel;
      ((TLRPC.TL_inputPeerChannel)localObject).<init>();
    }
    if (localObject != null) {
      ((InputPeer)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputPeer)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputPeer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */