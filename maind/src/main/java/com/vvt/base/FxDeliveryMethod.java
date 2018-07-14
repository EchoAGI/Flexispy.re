package com.vvt.base;

public enum FxDeliveryMethod
{
  private int index;
  
  static
  {
    int i = 1;
    Object localObject = new com/vvt/base/FxDeliveryMethod;
    ((FxDeliveryMethod)localObject).<init>("ANY_AVAILABLE", 0, 0);
    ANY_AVAILABLE = (FxDeliveryMethod)localObject;
    localObject = new com/vvt/base/FxDeliveryMethod;
    ((FxDeliveryMethod)localObject).<init>("WIFI", i, i);
    WIFI = (FxDeliveryMethod)localObject;
    localObject = new FxDeliveryMethod[2];
    FxDeliveryMethod localFxDeliveryMethod = ANY_AVAILABLE;
    localObject[0] = localFxDeliveryMethod;
    localFxDeliveryMethod = WIFI;
    localObject[i] = localFxDeliveryMethod;
    a = (FxDeliveryMethod[])localObject;
  }
  
  private FxDeliveryMethod(int paramInt1)
  {
    this.index = paramInt1;
  }
  
  public static FxDeliveryMethod getFromIndex(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      localObject1 = new java/lang/RuntimeException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "FxDeliveryMethod # Unknown index:" + paramInt;
      ((RuntimeException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    for (Object localObject1 = ANY_AVAILABLE;; localObject1 = WIFI) {
      return (FxDeliveryMethod)localObject1;
    }
  }
  
  public int getNumber()
  {
    return this.index;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/FxDeliveryMethod.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */