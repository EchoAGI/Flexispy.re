package com.vvt.pushnotification.connectionhistory;

public enum ConnectionType
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/pushnotification/connectionhistory/ConnectionType;
    ((ConnectionType)localObject).<init>("WIFI", 0);
    WIFI = (ConnectionType)localObject;
    localObject = new com/vvt/pushnotification/connectionhistory/ConnectionType;
    ((ConnectionType)localObject).<init>("GPRS", j);
    GPRS = (ConnectionType)localObject;
    localObject = new com/vvt/pushnotification/connectionhistory/ConnectionType;
    ((ConnectionType)localObject).<init>("UNKNOWN", i);
    UNKNOWN = (ConnectionType)localObject;
    localObject = new ConnectionType[3];
    ConnectionType localConnectionType = WIFI;
    localObject[0] = localConnectionType;
    localConnectionType = GPRS;
    localObject[j] = localConnectionType;
    localConnectionType = UNKNOWN;
    localObject[i] = localConnectionType;
    a = (ConnectionType[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/pushnotification/connectionhistory/ConnectionType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */