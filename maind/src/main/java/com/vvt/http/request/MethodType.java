package com.vvt.http.request;

import java.util.HashMap;
import java.util.Map;

public enum MethodType
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 1;
    int j = 0;
    Object localObject1 = new com/vvt/http/request/MethodType;
    ((MethodType)localObject1).<init>("GET", 0, 0);
    GET = (MethodType)localObject1;
    localObject1 = new com/vvt/http/request/MethodType;
    ((MethodType)localObject1).<init>("POST", i, i);
    POST = (MethodType)localObject1;
    int k = 2;
    localObject1 = new MethodType[k];
    MethodType localMethodType = GET;
    localObject1[0] = localMethodType;
    localMethodType = POST;
    localObject1[i] = localMethodType;
    b = (MethodType[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int m = localObject1.length;
    while (j < m)
    {
      Object localObject2 = localObject1[j];
      Map localMap = a;
      int n = ((MethodType)localObject2).number;
      Integer localInteger = Integer.valueOf(n);
      localMap.put(localInteger, localObject2);
      j += 1;
    }
  }
  
  private MethodType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static MethodType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (MethodType)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/http/request/MethodType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */