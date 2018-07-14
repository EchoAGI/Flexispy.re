package com.vvt.callmanager.filter;

import com.vvt.callmanager.a.d;
import com.vvt.callmanager.a.j;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.MonitorDisconnectData.Reason;

class h
  implements j
{
  h(FilterGsmCall.CallState.4 param4) {}
  
  public void a()
  {
    FilterGsmCall.a(this.a.mFilterCall, "Music become active -> Release monitor");
    FilterGsmCall.CallState.4.access$1300(this.a);
    FilterGsmCall localFilterGsmCall = this.a.mFilterCall;
    MonitorDisconnectData localMonitorDisconnectData = new com/vvt/callmanager/ref/MonitorDisconnectData;
    String str = FilterGsmCall.CallState.4.access$1400(this.a).d();
    MonitorDisconnectData.Reason localReason = MonitorDisconnectData.Reason.MUSIC_PLAY;
    localMonitorDisconnectData.<init>(str, localReason);
    FilterGsmCall.a(localFilterGsmCall, localMonitorDisconnectData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */