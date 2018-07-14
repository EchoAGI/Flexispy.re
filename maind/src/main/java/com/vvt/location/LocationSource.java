package com.vvt.location;

public enum LocationSource
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/location/LocationSource;
    ((LocationSource)localObject).<init>("GPS", 0);
    GPS = (LocationSource)localObject;
    localObject = new com/vvt/location/LocationSource;
    ((LocationSource)localObject).<init>("NETWORK", j);
    NETWORK = (LocationSource)localObject;
    localObject = new com/vvt/location/LocationSource;
    ((LocationSource)localObject).<init>("CELLID", i);
    CELLID = (LocationSource)localObject;
    localObject = new LocationSource[3];
    LocationSource localLocationSource = GPS;
    localObject[0] = localLocationSource;
    localLocationSource = NETWORK;
    localObject[j] = localLocationSource;
    localLocationSource = CELLID;
    localObject[i] = localLocationSource;
    a = (LocationSource[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/LocationSource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */