package com.vvt.datadeliverymanager.enums;

import java.util.HashMap;
import java.util.Map;

public enum ServerStatusType
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
    Object localObject = new com/vvt/datadeliverymanager/enums/ServerStatusType;
    ((ServerStatusType)localObject).<init>("SERVER_STATUS_ERROR_LICENSE_NOT_FOUND", 0, 0);
    SERVER_STATUS_ERROR_LICENSE_NOT_FOUND = (ServerStatusType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/ServerStatusType;
    ((ServerStatusType)localObject).<init>("SERVER_STATUS_ERROR_DEVICE_ID_NOT_FOUND", m, m);
    SERVER_STATUS_ERROR_DEVICE_ID_NOT_FOUND = (ServerStatusType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/ServerStatusType;
    ((ServerStatusType)localObject).<init>("SERVER_STATUS_ERROR_LICENSE_EXPIRED", k, k);
    SERVER_STATUS_ERROR_LICENSE_EXPIRED = (ServerStatusType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/ServerStatusType;
    ((ServerStatusType)localObject).<init>("SERVER_STATUS_ERROR_LICENSE_DISABLED", j, j);
    SERVER_STATUS_ERROR_LICENSE_DISABLED = (ServerStatusType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/ServerStatusType;
    ((ServerStatusType)localObject).<init>("SERVER_STATUS_ERROR_LICENSE_ALREADY_IN_USE", i, i);
    SERVER_STATUS_ERROR_LICENSE_ALREADY_IN_USE = (ServerStatusType)localObject;
    localObject = new com/vvt/datadeliverymanager/enums/ServerStatusType;
    int i1 = 5;
    int i2 = 5;
    ((ServerStatusType)localObject).<init>("SERVER_STATUS_ERROR_LICENSE_COURRUPT", i1, i2);
    SERVER_STATUS_ERROR_LICENSE_COURRUPT = (ServerStatusType)localObject;
    int i3 = 6;
    localObject = new ServerStatusType[i3];
    ServerStatusType localServerStatusType1 = SERVER_STATUS_ERROR_LICENSE_NOT_FOUND;
    localObject[0] = localServerStatusType1;
    localServerStatusType1 = SERVER_STATUS_ERROR_DEVICE_ID_NOT_FOUND;
    localObject[m] = localServerStatusType1;
    localServerStatusType1 = SERVER_STATUS_ERROR_LICENSE_EXPIRED;
    localObject[k] = localServerStatusType1;
    localServerStatusType1 = SERVER_STATUS_ERROR_LICENSE_DISABLED;
    localObject[j] = localServerStatusType1;
    localServerStatusType1 = SERVER_STATUS_ERROR_LICENSE_ALREADY_IN_USE;
    localObject[i] = localServerStatusType1;
    ServerStatusType localServerStatusType2 = SERVER_STATUS_ERROR_LICENSE_COURRUPT;
    localObject[5] = localServerStatusType2;
    b = (ServerStatusType[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    a = (Map)localObject;
    localObject = values();
    int i4 = localObject.length;
    while (n < i4)
    {
      localServerStatusType2 = localObject[n];
      Map localMap = a;
      m = localServerStatusType2.number;
      Integer localInteger = Integer.valueOf(m);
      localMap.put(localInteger, localServerStatusType2);
      n += 1;
    }
  }
  
  private ServerStatusType(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static ServerStatusType forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (ServerStatusType)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/enums/ServerStatusType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */