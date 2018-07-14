package com.vvt.base;

public enum RunningMode
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/base/RunningMode;
    ((RunningMode)localObject).<init>("NORMAL", 0);
    NORMAL = (RunningMode)localObject;
    localObject = new com/vvt/base/RunningMode;
    ((RunningMode)localObject).<init>("LIMITED_1", j);
    LIMITED_1 = (RunningMode)localObject;
    localObject = new com/vvt/base/RunningMode;
    ((RunningMode)localObject).<init>("FULL", i);
    FULL = (RunningMode)localObject;
    localObject = new RunningMode[3];
    RunningMode localRunningMode = NORMAL;
    localObject[0] = localRunningMode;
    localRunningMode = LIMITED_1;
    localObject[j] = localRunningMode;
    localRunningMode = FULL;
    localObject[i] = localRunningMode;
    a = (RunningMode[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/base/RunningMode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */