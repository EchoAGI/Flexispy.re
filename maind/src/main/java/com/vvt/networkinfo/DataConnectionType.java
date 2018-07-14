package com.vvt.networkinfo;

import java.util.HashMap;
import java.util.Map;

public enum DataConnectionType
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 2;
    int j = 1;
    int k = 0;
    Object localObject1 = new com/vvt/networkinfo/DataConnectionType;
    ((DataConnectionType)localObject1).<init>("WIFI", 0, 0);
    WIFI = (DataConnectionType)localObject1;
    localObject1 = new com/vvt/networkinfo/DataConnectionType;
    ((DataConnectionType)localObject1).<init>("MOBILE_DATA", j, j);
    MOBILE_DATA = (DataConnectionType)localObject1;
    localObject1 = new com/vvt/networkinfo/DataConnectionType;
    ((DataConnectionType)localObject1).<init>("NONE", i, i);
    NONE = (DataConnectionType)localObject1;
    int m = 3;
    localObject1 = new DataConnectionType[m];
    DataConnectionType localDataConnectionType = WIFI;
    localObject1[0] = localDataConnectionType;
    localDataConnectionType = MOBILE_DATA;
    localObject1[j] = localDataConnectionType;
    localDataConnectionType = NONE;
    localObject1[i] = localDataConnectionType;
    b = (DataConnectionType[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int n = localObject1.length;
    while (k < n)
    {
      Object localObject2 = localObject1[k];
      Map localMap = a;
      int i1 = ((DataConnectionType)localObject2).number;
      Integer localInteger = Integer.valueOf(i1);
      localMap.put(localInteger, localObject2);
      k += 1;
    }
  }
  
  private DataConnectionType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static DataConnectionType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (DataConnectionType)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/networkinfo/DataConnectionType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */