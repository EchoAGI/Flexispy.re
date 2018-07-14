package com.vvt.datadeliverymanager.enums;

import java.util.HashMap;
import java.util.Map;

public enum ErrorResponseType
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 0;
    Object localObject1 = new com/vvt/datadeliverymanager/enums/ErrorResponseType;
    ((ErrorResponseType)localObject1).<init>("ERROR_SERVER", 0, 0);
    ERROR_SERVER = (ErrorResponseType)localObject1;
    localObject1 = new com/vvt/datadeliverymanager/enums/ErrorResponseType;
    ((ErrorResponseType)localObject1).<init>("ERROR_HTTP", k, k);
    ERROR_HTTP = (ErrorResponseType)localObject1;
    localObject1 = new com/vvt/datadeliverymanager/enums/ErrorResponseType;
    ((ErrorResponseType)localObject1).<init>("ERROR_CONNECTION", j, j);
    ERROR_CONNECTION = (ErrorResponseType)localObject1;
    localObject1 = new com/vvt/datadeliverymanager/enums/ErrorResponseType;
    ((ErrorResponseType)localObject1).<init>("ERROR_PAYLOAD", i, i);
    ERROR_PAYLOAD = (ErrorResponseType)localObject1;
    int n = 4;
    localObject1 = new ErrorResponseType[n];
    ErrorResponseType localErrorResponseType = ERROR_SERVER;
    localObject1[0] = localErrorResponseType;
    localErrorResponseType = ERROR_HTTP;
    localObject1[k] = localErrorResponseType;
    localErrorResponseType = ERROR_CONNECTION;
    localObject1[j] = localErrorResponseType;
    localErrorResponseType = ERROR_PAYLOAD;
    localObject1[i] = localErrorResponseType;
    b = (ErrorResponseType[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i1 = localObject1.length;
    while (m < i1)
    {
      Object localObject2 = localObject1[m];
      Map localMap = a;
      i = ((ErrorResponseType)localObject2).number;
      Integer localInteger = Integer.valueOf(i);
      localMap.put(localInteger, localObject2);
      m += 1;
    }
  }
  
  private ErrorResponseType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static ErrorResponseType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (ErrorResponseType)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/enums/ErrorResponseType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */