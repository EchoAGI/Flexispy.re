package com.vvt.capture.telegram.internal;

public class TLRPC$TL_inputPrivacyKeyStatusTimestamp
  extends TLObject
{
  public static int constructor = 1335282456;
  
  public static TL_inputPrivacyKeyStatusTimestamp TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_inputPrivacyKeyStatusTimestamp", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_inputPrivacyKeyStatusTimestamp)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyKeyStatusTimestamp;
      ((TL_inputPrivacyKeyStatusTimestamp)localObject).<init>();
      ((TL_inputPrivacyKeyStatusTimestamp)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_inputPrivacyKeyStatusTimestamp.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */