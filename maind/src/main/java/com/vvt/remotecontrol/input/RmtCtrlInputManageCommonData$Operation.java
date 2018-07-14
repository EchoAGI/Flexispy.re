package com.vvt.remotecontrol.input;

public enum RmtCtrlInputManageCommonData$Operation
{
  static
  {
    int i = 3;
    int j = 2;
    int k = 1;
    Object localObject = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData$Operation;
    ((Operation)localObject).<init>("ADD", 0);
    ADD = (Operation)localObject;
    localObject = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData$Operation;
    ((Operation)localObject).<init>("RESET", k);
    RESET = (Operation)localObject;
    localObject = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData$Operation;
    ((Operation)localObject).<init>("CLEAR", j);
    CLEAR = (Operation)localObject;
    localObject = new com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData$Operation;
    ((Operation)localObject).<init>("QUERY", i);
    QUERY = (Operation)localObject;
    localObject = new Operation[4];
    Operation localOperation = ADD;
    localObject[0] = localOperation;
    localOperation = RESET;
    localObject[k] = localOperation;
    localOperation = CLEAR;
    localObject[j] = localOperation;
    localOperation = QUERY;
    localObject[i] = localOperation;
    a = (Operation[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputManageCommonData$Operation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */