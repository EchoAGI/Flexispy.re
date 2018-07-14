package com.vvt.capture.hike;

public enum HikeData$Direction
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/vvt/capture/hike/HikeData$Direction;
    ((Direction)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (Direction)localObject;
    localObject = new com/vvt/capture/hike/HikeData$Direction;
    ((Direction)localObject).<init>("IN", k);
    IN = (Direction)localObject;
    localObject = new com/vvt/capture/hike/HikeData$Direction;
    ((Direction)localObject).<init>("OUT", j);
    OUT = (Direction)localObject;
    localObject = new com/vvt/capture/hike/HikeData$Direction;
    ((Direction)localObject).<init>("LOCAL_IM", i);
    LOCAL_IM = (Direction)localObject;
    localObject = new Direction[4];
    Direction localDirection = UNKNOWN;
    localObject[0] = localDirection;
    localDirection = IN;
    localObject[k] = localDirection;
    localDirection = OUT;
    localObject[j] = localDirection;
    localDirection = LOCAL_IM;
    localObject[i] = localDirection;
    a = (Direction[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/hike/HikeData$Direction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */