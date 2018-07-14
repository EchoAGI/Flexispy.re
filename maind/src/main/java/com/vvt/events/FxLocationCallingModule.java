package com.vvt.events;

import java.util.HashMap;
import java.util.Map;

public enum FxLocationCallingModule
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject1 = new com/vvt/events/FxLocationCallingModule;
    ((FxLocationCallingModule)localObject1).<init>("MODULE_CORE_TRIGGER", 0, m);
    MODULE_CORE_TRIGGER = (FxLocationCallingModule)localObject1;
    localObject1 = new com/vvt/events/FxLocationCallingModule;
    ((FxLocationCallingModule)localObject1).<init>("MODULE_PANIC", m, k);
    MODULE_PANIC = (FxLocationCallingModule)localObject1;
    localObject1 = new com/vvt/events/FxLocationCallingModule;
    ((FxLocationCallingModule)localObject1).<init>("MODULE_ALERT", k, j);
    MODULE_ALERT = (FxLocationCallingModule)localObject1;
    localObject1 = new com/vvt/events/FxLocationCallingModule;
    ((FxLocationCallingModule)localObject1).<init>("MODULE_REMOTE_COMMAND", j, i);
    MODULE_REMOTE_COMMAND = (FxLocationCallingModule)localObject1;
    localObject1 = new FxLocationCallingModule[i];
    FxLocationCallingModule localFxLocationCallingModule = MODULE_CORE_TRIGGER;
    localObject1[0] = localFxLocationCallingModule;
    localFxLocationCallingModule = MODULE_PANIC;
    localObject1[m] = localFxLocationCallingModule;
    localFxLocationCallingModule = MODULE_ALERT;
    localObject1[k] = localFxLocationCallingModule;
    localFxLocationCallingModule = MODULE_REMOTE_COMMAND;
    localObject1[j] = localFxLocationCallingModule;
    b = (FxLocationCallingModule[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i1 = localObject1.length;
    while (n < i1)
    {
      Object localObject2 = localObject1[n];
      Map localMap = a;
      j = ((FxLocationCallingModule)localObject2).number;
      Integer localInteger = Integer.valueOf(j);
      localMap.put(localInteger, localObject2);
      n += 1;
    }
  }
  
  private FxLocationCallingModule(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static FxLocationCallingModule forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxLocationCallingModule)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxLocationCallingModule.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */