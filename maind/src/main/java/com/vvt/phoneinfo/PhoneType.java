package com.vvt.phoneinfo;

import java.util.HashMap;
import java.util.Map;

public enum PhoneType
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int m = 0;
    Object localObject1 = new com/vvt/phoneinfo/PhoneType;
    ((PhoneType)localObject1).<init>("PHONE_TYPE_UNKNOWN", 0, 0);
    PHONE_TYPE_UNKNOWN = (PhoneType)localObject1;
    localObject1 = new com/vvt/phoneinfo/PhoneType;
    ((PhoneType)localObject1).<init>("PHONE_TYPE_GSM", k, k);
    PHONE_TYPE_GSM = (PhoneType)localObject1;
    localObject1 = new com/vvt/phoneinfo/PhoneType;
    ((PhoneType)localObject1).<init>("PHONE_TYPE_CDMA", j, j);
    PHONE_TYPE_CDMA = (PhoneType)localObject1;
    localObject1 = new com/vvt/phoneinfo/PhoneType;
    int n = 1001;
    ((PhoneType)localObject1).<init>("PHONE_TYPE_DUAL", i, n);
    PHONE_TYPE_DUAL = (PhoneType)localObject1;
    int i1 = 4;
    localObject1 = new PhoneType[i1];
    PhoneType localPhoneType = PHONE_TYPE_UNKNOWN;
    localObject1[0] = localPhoneType;
    localPhoneType = PHONE_TYPE_GSM;
    localObject1[k] = localPhoneType;
    localPhoneType = PHONE_TYPE_CDMA;
    localObject1[j] = localPhoneType;
    localPhoneType = PHONE_TYPE_DUAL;
    localObject1[i] = localPhoneType;
    b = (PhoneType[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int i2 = localObject1.length;
    while (m < i2)
    {
      Object localObject2 = localObject1[m];
      Map localMap = a;
      j = ((PhoneType)localObject2).number;
      Integer localInteger = Integer.valueOf(j);
      localMap.put(localInteger, localObject2);
      m += 1;
    }
  }
  
  private PhoneType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static PhoneType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (PhoneType)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoneinfo/PhoneType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */