package com.vvt.network;

public enum NetworkServiceInfo$State
{
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new com/vvt/network/NetworkServiceInfo$State;
    ((State)localObject).<init>("UNKNOWN", 0);
    UNKNOWN = (State)localObject;
    localObject = new com/vvt/network/NetworkServiceInfo$State;
    ((State)localObject).<init>("ACTIVE", j);
    ACTIVE = (State)localObject;
    localObject = new com/vvt/network/NetworkServiceInfo$State;
    ((State)localObject).<init>("INACTIVE", i);
    INACTIVE = (State)localObject;
    localObject = new State[3];
    State localState = UNKNOWN;
    localObject[0] = localState;
    localState = ACTIVE;
    localObject[j] = localState;
    localState = INACTIVE;
    localObject[i] = localState;
    a = (State[])localObject;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/network/NetworkServiceInfo$State.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */