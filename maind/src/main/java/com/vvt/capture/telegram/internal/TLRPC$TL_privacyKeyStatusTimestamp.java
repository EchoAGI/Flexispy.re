package com.vvt.capture.telegram.internal;

public class TLRPC$TL_privacyKeyStatusTimestamp
  extends TLObject
{
  public static int constructor = -1137792208;
  
  public static TL_privacyKeyStatusTimestamp TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_privacyKeyStatusTimestamp", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_privacyKeyStatusTimestamp)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_privacyKeyStatusTimestamp;
      ((TL_privacyKeyStatusTimestamp)localObject).<init>();
      ((TL_privacyKeyStatusTimestamp)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_privacyKeyStatusTimestamp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */