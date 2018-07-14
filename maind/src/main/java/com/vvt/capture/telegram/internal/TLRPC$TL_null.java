package com.vvt.capture.telegram.internal;

public class TLRPC$TL_null
  extends TLObject
{
  public static int constructor = 1450380236;
  
  public static TL_null TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
        String str = String.format("can't parse magic %x in TL_null", arrayOfObject);
        ((RuntimeException)localObject).<init>(str);
        throw ((Throwable)localObject);
      }
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return (TL_null)localObject;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_null;
      ((TL_null)localObject).<init>();
      ((TL_null)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
  }
  
  public void serializeToStream(AbstractSerializedData paramAbstractSerializedData)
  {
    int i = constructor;
    paramAbstractSerializedData.writeInt32(i);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$TL_null.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */