package com.vvt.callmanager;

import android.os.SystemClock;

class a
  implements Runnable
{
  a(CallMgrDaemonMain paramCallMgrDaemonMain) {}
  
  public void run()
  {
    SystemClock.sleep(1000L);
    CallMgrDaemonMain.a(this.a);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/getInstance.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */