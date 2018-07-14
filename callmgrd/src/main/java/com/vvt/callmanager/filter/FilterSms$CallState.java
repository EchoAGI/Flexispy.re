package com.vvt.callmanager.filter;

import android.os.Parcel;

public enum FilterSms$CallState
{
  protected FilterSms mFilterSms;
  
  static
  {
    Object localObject = new com/vvt/callmanager/filter/FilterSms$CallState$1;
    ((FilterSms.CallState.1)localObject).<init>("IDLE", 0);
    IDLE = (CallState)localObject;
    localObject = new CallState[1];
    CallState localCallState = IDLE;
    localObject[0] = localCallState;
    a = (CallState[])localObject;
  }
  
  public abstract void onEnter(Object paramObject);
  
  public abstract Object onExit();
  
  public abstract CallState processResponse(Parcel paramParcel);
  
  public abstract CallState processRilRequest(Parcel paramParcel);
  
  void setMessageProcessor(FilterSms paramFilterSms)
  {
    this.mFilterSms = paramFilterSms;
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/FilterSms$CallState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */