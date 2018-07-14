package com.vvt.base;

public enum FxAddressbookMode
{
  private int index;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/base/FxAddressbookMode;
    ((FxAddressbookMode)localObject).<init>("OFF", 0, 0);
    OFF = (FxAddressbookMode)localObject;
    localObject = new com/vvt/base/FxAddressbookMode;
    ((FxAddressbookMode)localObject).<init>("MONITOR", j, j);
    MONITOR = (FxAddressbookMode)localObject;
    localObject = new com/vvt/base/FxAddressbookMode;
    ((FxAddressbookMode)localObject).<init>("RESTRICTED", i, i);
    RESTRICTED = (FxAddressbookMode)localObject;
    localObject = new FxAddressbookMode[3];
    FxAddressbookMode localFxAddressbookMode = OFF;
    localObject[0] = localFxAddressbookMode;
    localFxAddressbookMode = MONITOR;
    localObject[j] = localFxAddressbookMode;
    localFxAddressbookMode = RESTRICTED;
    localObject[i] = localFxAddressbookMode;
    a = (FxAddressbookMode[])localObject;
  }
  
  private FxAddressbookMode(int paramInt1)
  {
    this.index = paramInt1;
  }
  
  public FxAddressbookMode getFromIndex(int paramInt)
  {
    Object localObject1;
    switch (paramInt)
    {
    default: 
      localObject1 = new java/lang/RuntimeException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "FxAddressbookMode # Unknown index:" + paramInt;
      ((RuntimeException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 0: 
      localObject1 = OFF;
    }
    for (;;)
    {
      return (FxAddressbookMode)localObject1;
      localObject1 = MONITOR;
      continue;
      localObject1 = RESTRICTED;
    }
  }
  
  public int getNumber()
  {
    return this.index;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/FxAddressbookMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */