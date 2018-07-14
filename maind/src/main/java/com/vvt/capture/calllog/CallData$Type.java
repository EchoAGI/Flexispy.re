package com.vvt.capture.calllog;

public enum CallData$Type
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/capture/calllog/CallData$Type;
    ((Type)localObject).<init>("IN", 0);
    IN = (Type)localObject;
    localObject = new com/vvt/capture/calllog/CallData$Type;
    ((Type)localObject).<init>("OUT", j);
    OUT = (Type)localObject;
    localObject = new com/vvt/capture/calllog/CallData$Type;
    ((Type)localObject).<init>("MISSED", i);
    MISSED = (Type)localObject;
    localObject = new Type[3];
    Type localType = IN;
    localObject[0] = localType;
    localType = OUT;
    localObject[j] = localType;
    localType = MISSED;
    localObject[i] = localType;
    a = (Type[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/CallData$Type.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */