package com.vvt.remotecontrol.input;

public enum RmtCtrlInputAddressBookMode$Mode
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/remotecontrol/input/RmtCtrlInputAddressBookMode$Mode;
    ((Mode)localObject).<init>("OFF", 0);
    OFF = (Mode)localObject;
    localObject = new com/vvt/remotecontrol/input/RmtCtrlInputAddressBookMode$Mode;
    ((Mode)localObject).<init>("MONITOR", j);
    MONITOR = (Mode)localObject;
    localObject = new com/vvt/remotecontrol/input/RmtCtrlInputAddressBookMode$Mode;
    ((Mode)localObject).<init>("RESTRICTED", i);
    RESTRICTED = (Mode)localObject;
    localObject = new Mode[3];
    Mode localMode = OFF;
    localObject[0] = localMode;
    localMode = MONITOR;
    localObject[j] = localMode;
    localMode = RESTRICTED;
    localObject[i] = localMode;
    a = (Mode[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/remotecontrol/input/RmtCtrlInputAddressBookMode$Mode.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */