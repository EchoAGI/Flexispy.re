package com.vvt.capture.telegram.internal;

public class TLRPC$Bool
  extends TLObject
{
  public static Bool TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in Bool", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_boolTrue;
      ((TLRPC.TL_boolTrue)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_boolFalse;
      ((TLRPC.TL_boolFalse)localObject).<init>();
    }
    if (localObject != null) {
      ((Bool)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (Bool)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$Bool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */