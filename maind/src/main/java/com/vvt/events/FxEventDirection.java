package com.vvt.events;

import java.util.HashMap;
import java.util.Map;

public enum FxEventDirection
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
    Object localObject1 = new com/vvt/events/FxEventDirection;
    ((FxEventDirection)localObject1).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (FxEventDirection)localObject1;
    localObject1 = new com/vvt/events/FxEventDirection;
    ((FxEventDirection)localObject1).<init>("IN", m, m);
    IN = (FxEventDirection)localObject1;
    localObject1 = new com/vvt/events/FxEventDirection;
    ((FxEventDirection)localObject1).<init>("OUT", k, k);
    OUT = (FxEventDirection)localObject1;
    localObject1 = new com/vvt/events/FxEventDirection;
    ((FxEventDirection)localObject1).<init>("MISSED_CALL", j, j);
    MISSED_CALL = (FxEventDirection)localObject1;
    localObject1 = new com/vvt/events/FxEventDirection;
    ((FxEventDirection)localObject1).<init>("LOCAL_IM", i, i);
    LOCAL_IM = (FxEventDirection)localObject1;
    int i1 = 5;
    localObject1 = new FxEventDirection[i1];
    FxEventDirection localFxEventDirection = UNKNOWN;
    localObject1[0] = localFxEventDirection;
    localFxEventDirection = IN;
    localObject1[m] = localFxEventDirection;
    localFxEventDirection = OUT;
    localObject1[k] = localFxEventDirection;
    localFxEventDirection = MISSED_CALL;
    localObject1[j] = localFxEventDirection;
    localFxEventDirection = LOCAL_IM;
    localObject1[i] = localFxEventDirection;
    b = (FxEventDirection[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i2 = localObject1.length;
    while (n < i2)
    {
      Object localObject2 = localObject1[n];
      Map localMap = a;
      j = ((FxEventDirection)localObject2).number;
      Integer localInteger = Integer.valueOf(j);
      localMap.put(localInteger, localObject2);
      n += 1;
    }
  }
  
  private FxEventDirection(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static FxEventDirection forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxEventDirection)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxEventDirection.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */