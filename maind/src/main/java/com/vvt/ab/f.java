package com.vvt.ab;

import android.content.Context;
import android.os.SystemClock;

final class f
  implements Runnable
{
  f(Context paramContext, String paramString) {}
  
  public void run()
  {
    for (;;)
    {
      Object localObject = Thread.currentThread();
      boolean bool1 = ((Thread)localObject).isInterrupted();
      if (!bool1) {}
      try
      {
        localObject = this.a;
        String str = this.b;
        bool1 = e.a((Context)localObject, str);
        boolean bool2 = e.b();
        if ((!bool2) || (bool1)) {
          return;
        }
        long l = 500L;
        SystemClock.sleep(l);
      }
      catch (Exception localException)
      {
        bool1 = e.c();
      }
      if (!bool1) {}
    }
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/ab/f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */