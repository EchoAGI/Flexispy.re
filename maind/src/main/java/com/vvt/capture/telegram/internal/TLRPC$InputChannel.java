package com.vvt.capture.telegram.internal;

public class TLRPC$InputChannel
  extends TLObject
{
  public long access_hash;
  public int channel_id;
  
  public static InputChannel TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputChannel", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputChannelEmpty;
      ((TLRPC.TL_inputChannelEmpty)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputChannel;
      ((TLRPC.TL_inputChannel)localObject).<init>();
    }
    if (localObject != null) {
      ((InputChannel)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputChannel)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputChannel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */