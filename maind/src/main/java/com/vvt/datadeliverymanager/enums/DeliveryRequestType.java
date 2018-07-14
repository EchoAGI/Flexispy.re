package com.vvt.datadeliverymanager.enums;

import java.util.HashMap;
import java.util.Map;

public enum DeliveryRequestType
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 1;
    int j = 0;
    Object localObject1 = new com/vvt/datadeliverymanager/enums/DeliveryRequestType;
    ((DeliveryRequestType)localObject1).<init>("REQUEST_TYPE_NEW", 0, 0);
    REQUEST_TYPE_NEW = (DeliveryRequestType)localObject1;
    localObject1 = new com/vvt/datadeliverymanager/enums/DeliveryRequestType;
    ((DeliveryRequestType)localObject1).<init>("REQUEST_TYPE_PERSISTED", i, i);
    REQUEST_TYPE_PERSISTED = (DeliveryRequestType)localObject1;
    int k = 2;
    localObject1 = new DeliveryRequestType[k];
    DeliveryRequestType localDeliveryRequestType = REQUEST_TYPE_NEW;
    localObject1[0] = localDeliveryRequestType;
    localDeliveryRequestType = REQUEST_TYPE_PERSISTED;
    localObject1[i] = localDeliveryRequestType;
    b = (DeliveryRequestType[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int m = localObject1.length;
    while (j < m)
    {
      Object localObject2 = localObject1[j];
      Map localMap = a;
      int n = ((DeliveryRequestType)localObject2).number;
      Integer localInteger = Integer.valueOf(n);
      localMap.put(localInteger, localObject2);
      j += 1;
    }
  }
  
  private DeliveryRequestType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static DeliveryRequestType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (DeliveryRequestType)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/enums/DeliveryRequestType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */