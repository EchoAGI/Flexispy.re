package com.vvt.network;

public enum NetworkServiceInfo$Type
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/network/NetworkServiceInfo$Type;
    ((Type)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (Type)localObject;
    localObject = new com/vvt/network/NetworkServiceInfo$Type;
    ((Type)localObject).<init>("GSM", j);
    GSM = (Type)localObject;
    localObject = new com/vvt/network/NetworkServiceInfo$Type;
    ((Type)localObject).<init>("CDMA", i);
    CDMA = (Type)localObject;
    localObject = new Type[3];
    Type localType = UNKNOWN;
    localObject[0] = localType;
    localType = GSM;
    localObject[j] = localType;
    localType = CDMA;
    localObject[i] = localType;
    a = (Type[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/network/NetworkServiceInfo$Type.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */