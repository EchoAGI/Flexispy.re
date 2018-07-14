package com.vvt.events;

import java.util.HashMap;
import java.util.Map;

public enum FxAppType
{
  private static final Map a;
  private int mAppType;
  
  static
  {
    int i = 2;
    int j = 1;
    int k = 0;
    Object localObject1 = new com/vvt/events/FxAppType;
    ((FxAppType)localObject1).<init>("UNKNOWN", 0, 0);
    UNKNOWN = (FxAppType)localObject1;
    localObject1 = new com/vvt/events/FxAppType;
    ((FxAppType)localObject1).<init>("STANALONE_APP", j, j);
    STANALONE_APP = (FxAppType)localObject1;
    localObject1 = new com/vvt/events/FxAppType;
    ((FxAppType)localObject1).<init>("NATIVE_APP", i, i);
    NATIVE_APP = (FxAppType)localObject1;
    int m = 3;
    localObject1 = new FxAppType[m];
    FxAppType localFxAppType = UNKNOWN;
    localObject1[0] = localFxAppType;
    localFxAppType = STANALONE_APP;
    localObject1[j] = localFxAppType;
    localFxAppType = NATIVE_APP;
    localObject1[i] = localFxAppType;
    b = (FxAppType[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int n = localObject1.length;
    while (k < n)
    {
      Object localObject2 = localObject1[k];
      Map localMap = a;
      int i1 = ((FxAppType)localObject2).mAppType;
      Integer localInteger = Integer.valueOf(i1);
      localMap.put(localInteger, localObject2);
      k += 1;
    }
  }
  
  private FxAppType(int paramInt1)
  {
    this.mAppType = paramInt1;
  }
  
  public static FxAppType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (FxAppType)localMap.get(localInteger);
  }
  
  public int getValue()
  {
    return this.mAppType;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/events/FxAppType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */