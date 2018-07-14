package com.vvt.capture.telegram.internal;

public class TLRPC$messages_DhConfig
  extends TLObject
{
  public int g;
  public byte[] p;
  public byte[] random;
  public int version;
  
  public static messages_DhConfig TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in messages_DhConfig", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_dhConfigNotModified;
      ((TLRPC.TL_messages_dhConfigNotModified)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_messages_dhConfig;
      ((TLRPC.TL_messages_dhConfig)localObject).<init>();
    }
    if (localObject != null) {
      ((messages_DhConfig)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (messages_DhConfig)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$messages_DhConfig.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */