package com.vvt.capture.mms;

public enum MmsData$Direction
{
  static
  {
    int i = 1;
    Object localObject = new com/vvt/capture/mms/MmsData$Direction;
    ((Direction)localObject).<init>("IN", 0);
    IN = (Direction)localObject;
    localObject = new com/vvt/capture/mms/MmsData$Direction;
    ((Direction)localObject).<init>("OUT", i);
    OUT = (Direction)localObject;
    localObject = new Direction[2];
    Direction localDirection = IN;
    localObject[0] = localDirection;
    localDirection = OUT;
    localObject[i] = localDirection;
    a = (Direction[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/mms/MmsData$Direction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */