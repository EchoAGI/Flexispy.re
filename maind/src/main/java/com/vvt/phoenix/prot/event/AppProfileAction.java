package com.vvt.phoenix.prot.event;

import java.util.HashMap;
import java.util.Map;

public enum AppProfileAction
{
  private static final Map a;
  private final int mAction;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = 0;
    Object localObject1 = new com/vvt/phoenix/prot/event/AppProfileAction;
    ((AppProfileAction)localObject1).<init>("ALLOW", 0, m);
    ALLOW = (AppProfileAction)localObject1;
    localObject1 = new com/vvt/phoenix/prot/event/AppProfileAction;
    ((AppProfileAction)localObject1).<init>("ALERT_ONLY", m, k);
    ALERT_ONLY = (AppProfileAction)localObject1;
    localObject1 = new com/vvt/phoenix/prot/event/AppProfileAction;
    ((AppProfileAction)localObject1).<init>("WARN_EMPLOYEE_AND_ALERT", k, j);
    WARN_EMPLOYEE_AND_ALERT = (AppProfileAction)localObject1;
    localObject1 = new com/vvt/phoenix/prot/event/AppProfileAction;
    ((AppProfileAction)localObject1).<init>("BLOCK_APPLICATION_AND_ALERT", j, i);
    BLOCK_APPLICATION_AND_ALERT = (AppProfileAction)localObject1;
    localObject1 = new com/vvt/phoenix/prot/event/AppProfileAction;
    int i1 = 5;
    ((AppProfileAction)localObject1).<init>("SHUTDOWN_DEVICE_AND_ALERT", i, i1);
    SHUTDOWN_DEVICE_AND_ALERT = (AppProfileAction)localObject1;
    int i2 = 5;
    localObject1 = new AppProfileAction[i2];
    AppProfileAction localAppProfileAction = ALLOW;
    localObject1[0] = localAppProfileAction;
    localAppProfileAction = ALERT_ONLY;
    localObject1[m] = localAppProfileAction;
    localAppProfileAction = WARN_EMPLOYEE_AND_ALERT;
    localObject1[k] = localAppProfileAction;
    localAppProfileAction = BLOCK_APPLICATION_AND_ALERT;
    localObject1[j] = localAppProfileAction;
    localAppProfileAction = SHUTDOWN_DEVICE_AND_ALERT;
    localObject1[i] = localAppProfileAction;
    b = (AppProfileAction[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i3 = localObject1.length;
    while (n < i3)
    {
      Object localObject2 = localObject1[n];
      Map localMap = a;
      k = ((AppProfileAction)localObject2).mAction;
      Integer localInteger = Integer.valueOf(k);
      localMap.put(localInteger, localObject2);
      n += 1;
    }
  }
  
  private AppProfileAction(int paramInt1)
  {
    this.mAction = paramInt1;
  }
  
  public static AppProfileAction forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (AppProfileAction)localMap.get(localInteger);
  }
  
  public int getValue()
  {
    return this.mAction;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/AppProfileAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */