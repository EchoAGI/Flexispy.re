package com.vvt.im.events.info;

public enum ICallLogData$Direction
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/vvt/im/events/info/ICallLogData$Direction;
    ((Direction)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (Direction)localObject;
    localObject = new com/vvt/im/events/info/ICallLogData$Direction;
    ((Direction)localObject).<init>("IN", k);
    IN = (Direction)localObject;
    localObject = new com/vvt/im/events/info/ICallLogData$Direction;
    ((Direction)localObject).<init>("OUT", j);
    OUT = (Direction)localObject;
    localObject = new com/vvt/im/events/info/ICallLogData$Direction;
    ((Direction)localObject).<init>("MISSED_CALL", i);
    MISSED_CALL = (Direction)localObject;
    localObject = new Direction[4];
    Direction localDirection = UNKNOWN;
    localObject[0] = localDirection;
    localDirection = IN;
    localObject[k] = localDirection;
    localDirection = OUT;
    localObject[j] = localDirection;
    localDirection = MISSED_CALL;
    localObject[i] = localDirection;
    a = (Direction[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/im/events/info/ICallLogData$Direction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */