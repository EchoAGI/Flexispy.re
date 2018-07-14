package com.vvt.events;

public enum FxCallingModuleType
{
  private int mNumber;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/vvt/events/FxCallingModuleType;
    ((FxCallingModuleType)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (FxCallingModuleType)localObject;
    localObject = new com/vvt/events/FxCallingModuleType;
    ((FxCallingModuleType)localObject).<init>("CORE_TRIGGER", k, k);
    CORE_TRIGGER = (FxCallingModuleType)localObject;
    localObject = new com/vvt/events/FxCallingModuleType;
    ((FxCallingModuleType)localObject).<init>("PANIC", j, j);
    PANIC = (FxCallingModuleType)localObject;
    localObject = new com/vvt/events/FxCallingModuleType;
    ((FxCallingModuleType)localObject).<init>("ALERT", i, i);
    ALERT = (FxCallingModuleType)localObject;
    localObject = new FxCallingModuleType[4];
    FxCallingModuleType localFxCallingModuleType = UNKNOWN;
    localObject[0] = localFxCallingModuleType;
    localFxCallingModuleType = CORE_TRIGGER;
    localObject[k] = localFxCallingModuleType;
    localFxCallingModuleType = PANIC;
    localObject[j] = localFxCallingModuleType;
    localFxCallingModuleType = ALERT;
    localObject[i] = localFxCallingModuleType;
    a = (FxCallingModuleType[])localObject;
  }
  
  private FxCallingModuleType(int paramInt1)
  {
    this.mNumber = paramInt1;
  }
  
  public int getNumber()
  {
    return this.mNumber;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxCallingModuleType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */