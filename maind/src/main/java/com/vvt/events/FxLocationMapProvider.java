package com.vvt.events;

import java.util.HashMap;
import java.util.Map;

public enum FxLocationMapProvider
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 2;
    int j = 1;
    int k = 0;
    Object localObject1 = new com/vvt/events/FxLocationMapProvider;
    ((FxLocationMapProvider)localObject1).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (FxLocationMapProvider)localObject1;
    localObject1 = new com/vvt/events/FxLocationMapProvider;
    ((FxLocationMapProvider)localObject1).<init>("PROVIDER_GOOGLE", j, j);
    PROVIDER_GOOGLE = (FxLocationMapProvider)localObject1;
    localObject1 = new com/vvt/events/FxLocationMapProvider;
    ((FxLocationMapProvider)localObject1).<init>("PROVIDER_NOKIA", i, i);
    PROVIDER_NOKIA = (FxLocationMapProvider)localObject1;
    int m = 3;
    localObject1 = new FxLocationMapProvider[m];
    FxLocationMapProvider localFxLocationMapProvider = UNKNOWN;
    localObject1[0] = localFxLocationMapProvider;
    localFxLocationMapProvider = PROVIDER_GOOGLE;
    localObject1[j] = localFxLocationMapProvider;
    localFxLocationMapProvider = PROVIDER_NOKIA;
    localObject1[i] = localFxLocationMapProvider;
    b = (FxLocationMapProvider[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int n = localObject1.length;
    while (k < n)
    {
      Object localObject2 = localObject1[k];
      Map localMap = a;
      int i1 = ((FxLocationMapProvider)localObject2).number;
      Integer localInteger = Integer.valueOf(i1);
      localMap.put(localInteger, localObject2);
      k += 1;
    }
  }
  
  private FxLocationMapProvider(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static FxLocationMapProvider forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxLocationMapProvider)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxLocationMapProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */