package com.vvt.location;

public enum LocationCaptureMode
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/location/LocationCaptureMode;
    ((LocationCaptureMode)localObject).<init>("INTERVAL", 0);
    INTERVAL = (LocationCaptureMode)localObject;
    localObject = new com/vvt/location/LocationCaptureMode;
    ((LocationCaptureMode)localObject).<init>("TRACKING", i);
    TRACKING = (LocationCaptureMode)localObject;
    localObject = new LocationCaptureMode[2];
    LocationCaptureMode localLocationCaptureMode = INTERVAL;
    localObject[0] = localLocationCaptureMode;
    localLocationCaptureMode = TRACKING;
    localObject[i] = localLocationCaptureMode;
    a = (LocationCaptureMode[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/location/LocationCaptureMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */