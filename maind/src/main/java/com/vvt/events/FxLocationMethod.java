package com.vvt.events;

import java.util.HashMap;
import java.util.Map;

public enum FxLocationMethod
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
    Object localObject = new com/vvt/events/FxLocationMethod;
    ((FxLocationMethod)localObject).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (FxLocationMethod)localObject;
    localObject = new com/vvt/events/FxLocationMethod;
    ((FxLocationMethod)localObject).<init>("CELL_INFO", m, m);
    CELL_INFO = (FxLocationMethod)localObject;
    localObject = new com/vvt/events/FxLocationMethod;
    ((FxLocationMethod)localObject).<init>("INTERGRATED_GPS", k, k);
    INTERGRATED_GPS = (FxLocationMethod)localObject;
    localObject = new com/vvt/events/FxLocationMethod;
    ((FxLocationMethod)localObject).<init>("AGPS", j, j);
    AGPS = (FxLocationMethod)localObject;
    localObject = new com/vvt/events/FxLocationMethod;
    ((FxLocationMethod)localObject).<init>("BLUETOOTH", i, i);
    BLUETOOTH = (FxLocationMethod)localObject;
    localObject = new com/vvt/events/FxLocationMethod;
    int i1 = 5;
    int i2 = 5;
    ((FxLocationMethod)localObject).<init>("NETWORK", i1, i2);
    NETWORK = (FxLocationMethod)localObject;
    int i3 = 6;
    localObject = new FxLocationMethod[i3];
    FxLocationMethod localFxLocationMethod1 = UNKNOWN;
    localObject[0] = localFxLocationMethod1;
    localFxLocationMethod1 = CELL_INFO;
    localObject[m] = localFxLocationMethod1;
    localFxLocationMethod1 = INTERGRATED_GPS;
    localObject[k] = localFxLocationMethod1;
    localFxLocationMethod1 = AGPS;
    localObject[j] = localFxLocationMethod1;
    localFxLocationMethod1 = BLUETOOTH;
    localObject[i] = localFxLocationMethod1;
    FxLocationMethod localFxLocationMethod2 = NETWORK;
    localObject[5] = localFxLocationMethod2;
    b = (FxLocationMethod[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localFxLocationMethod2 = localObject[n];
      Map localMap = a;
      m = localFxLocationMethod2.number;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localFxLocationMethod2);
      n += 1;
    }
  }
  
  private FxLocationMethod(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static FxLocationMethod forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxLocationMethod)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxLocationMethod.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */