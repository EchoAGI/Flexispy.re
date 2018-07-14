package com.vvt.capture.snapchat;

public enum SnapchatData$Direction
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/capture/snapchat/SnapchatData$Direction;
    ((Direction)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (Direction)localObject;
    localObject = new com/vvt/capture/snapchat/SnapchatData$Direction;
    ((Direction)localObject).<init>("IN", j);
    IN = (Direction)localObject;
    localObject = new com/vvt/capture/snapchat/SnapchatData$Direction;
    ((Direction)localObject).<init>("OUT", i);
    OUT = (Direction)localObject;
    localObject = new Direction[3];
    Direction localDirection = UNKNOWN;
    localObject[0] = localDirection;
    localDirection = IN;
    localObject[j] = localDirection;
    localDirection = OUT;
    localObject[i] = localDirection;
    a = (Direction[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/snapchat/SnapchatData$Direction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */