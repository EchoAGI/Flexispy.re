package com.vvt.callmanager.filter;

import com.vvt.callmanager.a.d;
import com.vvt.callmanager.a.j;
import com.vvt.callmanager.ref.MonitorDisconnectData;
import com.vvt.callmanager.ref.MonitorDisconnectData.Reason;

class c
  implements j
{
  c(FilterCdmaCall.CallState.5 param5) {}
  
  public void a()
  {
    FilterCdmaCall.a(this.a.mFilterCall, "Music become active -> Release monitor");
    FilterCdmaCall.CallState.5.access$1100(this.a);
    FilterCdmaCall localFilterCdmaCall = this.a.mFilterCall;
    MonitorDisconnectData localMonitorDisconnectData = new com/vvt/callmanager/ref/MonitorDisconnectData;
    String str = FilterCdmaCall.CallState.5.access$1200(this.a).d();
    MonitorDisconnectData.Reason localReason = MonitorDisconnectData.Reason.MUSIC_PLAY;
    localMonitorDisconnectData.<init>(str, localReason);
    FilterCdmaCall.a(localFilterCdmaCall, localMonitorDisconnectData);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/filter/c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */