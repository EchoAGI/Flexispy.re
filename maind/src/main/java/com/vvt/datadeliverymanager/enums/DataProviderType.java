package com.vvt.datadeliverymanager.enums;

import java.util.HashMap;
import java.util.Map;

public enum DataProviderType
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
    Object localObject = new com/vvt/datadeliverymanager/enums/DataProviderType;
    ((DataProviderType)localObject).<init>("DATA_PROVIDER_TYPE_NONE", 0, 0);
    DATA_PROVIDER_TYPE_NONE = (DataProviderType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/DataProviderType;
    ((DataProviderType)localObject).<init>("DATA_PROVIDER_TYPE_PANIC", m, m);
    DATA_PROVIDER_TYPE_PANIC = (DataProviderType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/DataProviderType;
    ((DataProviderType)localObject).<init>("DATA_PROVIDER_TYPE_SYSTEM", k, k);
    DATA_PROVIDER_TYPE_SYSTEM = (DataProviderType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/DataProviderType;
    ((DataProviderType)localObject).<init>("DATA_PROVIDER_TYPE_ALL_REGULAR", j, j);
    DATA_PROVIDER_TYPE_ALL_REGULAR = (DataProviderType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/DataProviderType;
    ((DataProviderType)localObject).<init>("DATA_PROVIDER_TYPE_ACTUAL_MEDIA", i, i);
    DATA_PROVIDER_TYPE_ACTUAL_MEDIA = (DataProviderType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/DataProviderType;
    ((DataProviderType)localObject).<init>("DATA_PROVIDER_TYPE_SETTINGS", 5, 5);
    DATA_PROVIDER_TYPE_SETTINGS = (DataProviderType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/DataProviderType;
    int i1 = 6;
    int i2 = 6;
    ((DataProviderType)localObject).<init>("DATA_PROVIDER_TYPE_NONE_REGULAR_ACTUAL_MEDIA", i1, i2);
    DATA_PROVIDER_TYPE_NONE_REGULAR_ACTUAL_MEDIA = (DataProviderType)localObject;
    int i3 = 7;
    localObject = new DataProviderType[i3];
    DataProviderType localDataProviderType1 = DATA_PROVIDER_TYPE_NONE;
    localObject[0] = localDataProviderType1;
    localDataProviderType1 = DATA_PROVIDER_TYPE_PANIC;
    localObject[m] = localDataProviderType1;
    localDataProviderType1 = DATA_PROVIDER_TYPE_SYSTEM;
    localObject[k] = localDataProviderType1;
    localDataProviderType1 = DATA_PROVIDER_TYPE_ALL_REGULAR;
    localObject[j] = localDataProviderType1;
    localDataProviderType1 = DATA_PROVIDER_TYPE_ACTUAL_MEDIA;
    localObject[i] = localDataProviderType1;
    DataProviderType localDataProviderType2 = DATA_PROVIDER_TYPE_SETTINGS;
    localObject[5] = localDataProviderType2;
    localDataProviderType2 = DATA_PROVIDER_TYPE_NONE_REGULAR_ACTUAL_MEDIA;
    localObject[6] = localDataProviderType2;
    b = (DataProviderType[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localDataProviderType2 = localObject[n];
      Map localMap = a;
      m = localDataProviderType2.number;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localDataProviderType2);
      n += 1;
    }
  }
  
  private DataProviderType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static DataProviderType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (DataProviderType)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/enums/DataProviderType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */