package com.vvt.callmanager.filter;

import android.os.SystemClock;
import com.vvt.callmanager.a.m;

class d
  implements Runnable
{
  d(FilterCdmaCall.CallState.6 param6) {}
  
  public void run()
  {
    SystemClock.sleep(3000L);
    FilterCdmaCall localFilterCdmaCall = this.a.mFilterCall;
    m localm = FilterCdmaCall.a(this.a.mFilterCall);
    i.a(localFilterCdmaCall, localm);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */