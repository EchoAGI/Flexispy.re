package com.vvt.datadeliverymanager.enums;

import java.util.HashMap;
import java.util.Map;

public enum PriorityRequest
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 1;
    int j = 2;
    int k = 0;
    Object localObject1 = new com/vvt/datadeliverymanager/enums/PriorityRequest;
    int m = 6;
    ((PriorityRequest)localObject1).<init>("PRIORITY_HIGH", 0, m);
    PRIORITY_HIGH = (PriorityRequest)localObject1;
    localObject1 = new com/vvt/datadeliverymanager/enums/PriorityRequest;
    ((PriorityRequest)localObject1).<init>("PRIORITY_NORMAL", i, j);
    PRIORITY_NORMAL = (PriorityRequest)localObject1;
    localObject1 = new com/vvt/datadeliverymanager/enums/PriorityRequest;
    ((PriorityRequest)localObject1).<init>("PRIORITY_LOW", j, 0);
    PRIORITY_LOW = (PriorityRequest)localObject1;
    int n = 3;
    localObject1 = new PriorityRequest[n];
    PriorityRequest localPriorityRequest = PRIORITY_HIGH;
    localObject1[0] = localPriorityRequest;
    localPriorityRequest = PRIORITY_NORMAL;
    localObject1[i] = localPriorityRequest;
    localPriorityRequest = PRIORITY_LOW;
    localObject1[j] = localPriorityRequest;
    b = (PriorityRequest[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i1 = localObject1.length;
    while (k < i1)
    {
      Object localObject2 = localObject1[k];
      Map localMap = a;
      i = ((PriorityRequest)localObject2).number;
      Integer localInteger = Integer.valueOf(i);
      localMap.put(localInteger, localObject2);
      k += 1;
    }
  }
  
  private PriorityRequest(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static PriorityRequest forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (PriorityRequest)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/enums/PriorityRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */