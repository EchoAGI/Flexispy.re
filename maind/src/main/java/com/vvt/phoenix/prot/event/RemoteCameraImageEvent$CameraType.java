package com.vvt.phoenix.prot.event;

public enum RemoteCameraImageEvent$CameraType
{
  private final int mType;
  
  static
  {
    int i = 1;
    Object localObject = new com/vvt/phoenix/prot/event/RemoteCameraImageEvent$CameraType;
    ((CameraType)localObject).<init>("REAR_CAMERA", 0, 0);
    REAR_CAMERA = (CameraType)localObject;
    localObject = new com/vvt/phoenix/prot/event/RemoteCameraImageEvent$CameraType;
    ((CameraType)localObject).<init>("FRONT_CAMERA", i, i);
    FRONT_CAMERA = (CameraType)localObject;
    localObject = new CameraType[2];
    CameraType localCameraType = REAR_CAMERA;
    localObject[0] = localCameraType;
    localCameraType = FRONT_CAMERA;
    localObject[i] = localCameraType;
    a = (CameraType[])localObject;
  }
  
  private RemoteCameraImageEvent$CameraType(int paramInt1)
  {
    this.mType = paramInt1;
  }
  
  public static CameraType forValue(int paramInt)
  {
    return values()[paramInt];
  }
  
  public int getType()
  {
    return this.mType;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/phoenix/prot/event/RemoteCameraImageEvent$CameraType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */