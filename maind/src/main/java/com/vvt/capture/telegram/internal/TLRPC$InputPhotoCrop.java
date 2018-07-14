package com.vvt.capture.telegram.internal;

public class TLRPC$InputPhotoCrop
  extends TLObject
{
  public double crop_left;
  public double crop_top;
  public double crop_width;
  
  public static InputPhotoCrop TLdeserialize(AbstractSerializedData paramAbstractSerializedData, int paramInt, boolean paramBoolean)
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
      String str = String.format("can't parse magic %x in InputPhotoCrop", arrayOfObject);
      ((RuntimeException)localObject).<init>(str);
      throw ((Throwable)localObject);
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPhotoCropAuto;
      ((TLRPC.TL_inputPhotoCropAuto)localObject).<init>();
      continue;
      localObject = new com/vvt/capture/telegram/internal/TLRPC$TL_inputPhotoCrop;
      ((TLRPC.TL_inputPhotoCrop)localObject).<init>();
    }
    if (localObject != null) {
      ((InputPhotoCrop)localObject).readParams(paramAbstractSerializedData, paramBoolean);
    }
    return (InputPhotoCrop)localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/telegram/internal/TLRPC$InputPhotoCrop.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */